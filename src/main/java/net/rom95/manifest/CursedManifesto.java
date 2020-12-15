package net.rom95.manifest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.UIManager;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.rom95.manifest.curse.Interface;
import net.rom95.manifest.curse.ManifestGui;
import net.rom95.manifesto.backend.impl.mcinstance.InstalledAddon;
import net.rom95.manifesto.backend.impl.mcinstance.MinecraftInstanceFile;
import net.rom95.manifesto.backend.impl.mcmanifest.CompleteManifest;
import net.rom95.manifesto.backend.impl.mcmanifest.Minecraft;
import net.rom95.manifesto.backend.impl.mcmanifest.ModFile;
import net.rom95.manifesto.backend.impl.mcmanifest.ModLoader;

public class CursedManifesto {

	public static final Gson sharedGson = new GsonBuilder().setPrettyPrinting().create();
	public static List<ModFile> modFiles = new ArrayList<ModFile>();
	
	public static Collection<String> jarListFromJson = new ArrayList<String>();
	public static Collection<File> jarListFromFolder = new CopyOnWriteArrayList<File>();
	
	
	public static String modName;
	
	private static ManifestGui manifestGui;
	
	private static CompleteManifest completeManifest;
	
	static String fileName = "minecraftinstance.json";
	static File configs = new File("config");
	static File resources = new File("resources");
	
	public static void main(String[] args) {
		manifestGui = new ManifestGui();
		manifestGui.setVisible(true);
		manifestGui.outputArea0.setText("Generating Modlist");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

		try (Reader reader = new FileReader(fileName)) {
			
			MinecraftInstanceFile manifest = sharedGson.fromJson(reader, MinecraftInstanceFile.class);

			gatherModpackMods(manifest);
			
			ModLoader modLoader = new ModLoader(manifest.getBaseModLoader().getName(), true);
			Minecraft minecraft = new Minecraft(manifest.getBaseModLoader().getMinecraftVersion(),
					new ArrayList<ModLoader>(Arrays.asList(modLoader)));
			
			completeManifest = new CompleteManifest();
			completeManifest.setMinecraft(minecraft);
			completeManifest.setName(manifest.getName());
			completeManifest.setVersion("1.0.0");
			completeManifest.setAuthor(manifest.getCustomAuthor());
			completeManifest.setFiles(modFiles);
			completeManifest.setOverrides("overrides");
			List<String> modNameList = new ArrayList<String>();
			
			for (ModFile mod : completeManifest.getFiles()) {
				modNameList.add(getModName(mod.getProjectID()));
			}
			
			Collections.sort(modNameList);
			Interface.reset(manifestGui);
			for(String name : modNameList) {
				Interface.output(manifestGui, name);
			}
			
			makeModsList();
			copyModsFolderIfNeeded();
			jarListFromFolder.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		manifestGui.compareButton.addActionListener(e -> {
			try {
				exportFunction(completeManifest);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public static void exportFunction(CompleteManifest manifest) throws IOException {
		File file = new File("manifest.json");
		File overrides = new File("overrides");
		overrides.mkdir();
			
		FileUtils.copyDirectoryToDirectory(new File("config"), new File(overrides, "config"));
		
        FileOutputStream fos = null;
        ZipOutputStream zipOut = null;
		try {
			fos = new FileOutputStream("export_modpack.zip");
	        zipOut = new ZipOutputStream(fos);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			Writer fileWriter = new FileWriter(file);
			sharedGson.toJson(manifest, fileWriter);
			fileWriter.close();
		} catch (IOException | IllegalStateException e) {
			e.printStackTrace();
		}
		
        try {
			zipFile(file, file.getName(), zipOut);
//			zipFile(overrideConfig, overrideConfig.getName(), zipOut);
//			zipFile(overrideResources, overrideResources.getName(), zipOut);
	        zipOut.close();
	        fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static void copyModsFolderIfNeeded() {

		ArrayList<File> removalList = new ArrayList<File>();
		
		for(File jarFile : jarListFromFolder) {
			String tempName  = jarFile.getName().replace("mods/", "");
			if(jarListFromJson.contains(tempName)) {
				removalList.add(jarFile);
			}
		}
		
		jarListFromFolder.removeAll(removalList);
	}
	
    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith("/")) {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else {
                zipOut.putNextEntry(new ZipEntry(fileName + "/"));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        fis.close();
    }
    
    private static void makeModsList() {
    	jarListFromFolder = FileUtils.listFiles(new File("mods"), new String[] {"jar"}, false);
    }
	
	
	public static void gatherModpackMods(MinecraftInstanceFile manifest) {
		List<InstalledAddon> addon = manifest.getInstalledAddons();

		addon.forEach(a -> {
			modFiles.add(putNewMod(a));
			jarListFromJson.add(a.getInstalledFile().getFileNameOnDisk());
		});

	}
	
	public static ModFile putNewMod(InstalledAddon addon) {
		return new ModFile(addon.getAddonID(), addon.getInstalledFile().getId(), true);
	}
	
	public static String getModName(Integer modid) {
		
		String domain = "https://addons-ecs.forgesvc.net/api/v2/addon/" + String.valueOf(modid);
		try {
			URL getRequestURL = new URL(domain);
			HttpURLConnection con = (HttpURLConnection) getRequestURL.openConnection();
			con.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			String response = "";
			while ((inputLine = in.readLine()) != null) {
				
				response += inputLine;
				in.close();
				JsonObject array = JsonParser.parseString(response).getAsJsonObject();
				return array.get("name").getAsString();
				
			}
			
		} catch (Exception e) {
			
		}
		
		return null;
		
	}

}
