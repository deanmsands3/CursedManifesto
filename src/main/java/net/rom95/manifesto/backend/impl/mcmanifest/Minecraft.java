
package net.rom95.manifesto.backend.impl.mcmanifest;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Minecraft {
	
	@SerializedName("version")
	private String version;
	
	@SerializedName("modLoaders")
	private List<ModLoader> modLoaders = null;
	
	/**
	 * Instantiates a new minecraft.
	 */
	public Minecraft() {
	
	}
	
	/**
	 * Instantiates a new minecraft.
	 *
	 * @param version    the version
	 * @param modLoaders the mod loaders
	 */
	public Minecraft(String version, List<ModLoader> modLoaders) {
		
		super();
		this.version = version;
		this.modLoaders = modLoaders;
		
	}
	
	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		
		return version;
		
	}
	
	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		
		this.version = version;
		
	}
	
	/**
	 * With version.
	 *
	 * @param version the version
	 * @return the minecraft
	 */
	public Minecraft withVersion(String version) {
		
		this.version = version;
		return this;
		
	}
	
	/**
	 * Gets the mod loaders.
	 *
	 * @return the mod loaders
	 */
	public List<ModLoader> getModLoaders() {
		
		return modLoaders;
		
	}
	
	/**
	 * Sets the mod loaders.
	 *
	 * @param modLoaders the new mod loaders
	 */
	public void setModLoaders(List<ModLoader> modLoaders) {
		
		this.modLoaders = modLoaders;
		
	}
	
	/**
	 * With mod loaders.
	 *
	 * @param modLoaders the mod loaders
	 * @return the minecraft
	 */
	public Minecraft withModLoaders(List<ModLoader> modLoaders) {
		
		this.modLoaders = modLoaders;
		return this;
		
	}
	
}
