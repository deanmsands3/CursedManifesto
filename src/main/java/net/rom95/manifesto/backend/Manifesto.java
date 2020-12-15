package net.rom95.manifesto.backend;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.rom95.manifesto.backend.impl.mcinstance.MinecraftInstanceFile;
import net.rom95.manifesto.backend.impl.mcmanifest.CompleteManifest;
import net.rom95.manifesto.backend.io.FileUtility;

public class Manifesto {
	
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	private MinecraftInstanceFile minecraftInstanceFile;
	private CompleteManifest completeManifest;

	public Manifesto() {
	}

	/**
	 * @return GSON Provider
	 */
	public Gson getGson() {
		return GSON;
	}

	/**
	 * @return the fileUtility
	 */
	public FileUtility getFileUtility() {
		return new FileUtility();
	}

	/**
	 * @return the minecraftInstanceFile
	 */
	public MinecraftInstanceFile getMinecraftInstanceFile() {
		return minecraftInstanceFile;
	}

	/**
	 * @return the completeManifest
	 */
	public CompleteManifest getCompleteManifest() {
		return completeManifest;
	}
	
	
	public void deserializeMinecraftInstanceFile(File minecraftInstanceFile) {
		try (Reader reader = new FileReader(minecraftInstanceFile)) {
			this.minecraftInstanceFile = new MinecraftInstanceFile(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
