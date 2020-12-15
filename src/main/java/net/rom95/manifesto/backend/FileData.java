package net.rom95.manifesto.backend;

import java.io.File;
import java.nio.file.Path;

public class FileData {
	
	static FileData INSTANCE = new FileData();
	
	
	private File userDefinedMinecraftInstance;
	
	public FileData() {
		INSTANCE = this;
	}

	
	public static void setMinecraftInstanceFile(Path filepath) {
		INSTANCE.setUserDefinedMinecraftInstance(filepath.toFile());
	}

	/**
	 * @return the userDefinedMinecraftInstance
	 */
	public File getUserDefinedMinecraftInstance() {
		return userDefinedMinecraftInstance;
	}

	/**
	 * @param userDefinedMinecraftInstance the userDefinedMinecraftInstance to set
	 */
	public void setUserDefinedMinecraftInstance(File userDefinedMinecraftInstance) {
		this.userDefinedMinecraftInstance = userDefinedMinecraftInstance;
	}

}
