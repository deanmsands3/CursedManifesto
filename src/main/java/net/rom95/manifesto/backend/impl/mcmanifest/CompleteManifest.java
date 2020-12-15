
package net.rom95.manifesto.backend.impl.mcmanifest;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CompleteManifest {
	
	@SerializedName("minecraft")
	private Minecraft minecraft;
	
	@SerializedName("manifestType")
	private final String manifestType = "minecraftModpack";
	
	@SerializedName("manifestVersion")
	private final Integer manifestVersion = 1;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("version")
	private String version;
	
	@SerializedName("author")
	private String author;
	
	@SerializedName("projectID")
	private Integer projectID;
	
	@SerializedName("files")
	private List<ModFile> files = null;
	
	@SerializedName("overrides")
	private String overrides;
	
	/**
	 * Instantiates a new complete manifest.
	 */
	public CompleteManifest() {
	
	}
	
	/**
	 * Instantiates a new complete manifest.
	 *
	 * @param minecraft       the minecraft
	 * @param manifestType    the manifest type
	 * @param manifestVersion the manifest version
	 * @param name            the name
	 * @param version         the version
	 * @param author          the author
	 * @param projectID       the project ID
	 * @param files           the files
	 * @param overrides       the overrides
	 */
	public CompleteManifest(Minecraft minecraft, String manifestType, String name,
			String version, String author, Integer projectID, List<ModFile> files, String overrides) {
		
		super();
		this.minecraft = minecraft;
		this.name = name;
		this.version = version;
		this.author = author;
		this.projectID = projectID;
		this.files = files;
		this.overrides = overrides;
		
	}
	
	/**
	 * Gets the minecraft.
	 *
	 * @return the minecraft
	 */
	public Minecraft getMinecraft() {
		
		return minecraft;
		
	}
	
	/**
	 * Sets the minecraft.
	 *
	 * @param minecraft the new minecraft
	 */
	public void setMinecraft(Minecraft minecraft) {
		
		this.minecraft = minecraft;
		
	}
	
	/**
	 * With minecraft.
	 *
	 * @param minecraft the minecraft
	 * @return the complete manifest
	 */
	public CompleteManifest withMinecraft(Minecraft minecraft) {
		
		this.minecraft = minecraft;
		return this;
		
	}
	
	/**
	 * Gets the manifest type.
	 *
	 * @return the manifest type
	 */
	public String getManifestType() {
		
		return manifestType;
		
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		
		return name;
		
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	/**
	 * With name.
	 *
	 * @param name the name
	 * @return the complete manifest
	 */
	public CompleteManifest withName(String name) {
		
		this.name = name;
		return this;
		
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
	 * @return the complete manifest
	 */
	public CompleteManifest withVersion(String version) {
		
		this.version = version;
		return this;
		
	}
	
	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		
		return author;
		
	}
	
	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		
		this.author = author;
		
	}
	
	/**
	 * With author.
	 *
	 * @param author the author
	 * @return the complete manifest
	 */
	public CompleteManifest withAuthor(String author) {
		
		this.author = author;
		return this;
		
	}
	
	/**
	 * Gets the project ID.
	 *
	 * @return the project ID
	 */
	public Integer getProjectID() {
		
		return projectID;
		
	}
	
	/**
	 * Sets the project ID.
	 *
	 * @param projectID the new project ID
	 */
	public void setProjectID(Integer projectID) {
		
		this.projectID = projectID;
		
	}
	
	/**
	 * With project ID.
	 *
	 * @param projectID the project ID
	 * @return the complete manifest
	 */
	public CompleteManifest withProjectID(Integer projectID) {
		
		this.projectID = projectID;
		return this;
		
	}
	
	/**
	 * Gets the files.
	 *
	 * @return the files
	 */
	public List<ModFile> getFiles() {
		
		return files;
		
	}
	
	/**
	 * Sets the files.
	 *
	 * @param files the new files
	 */
	public void setFiles(List<ModFile> files) {
		
		this.files = files;
		
	}
	
	/**
	 * With files.
	 *
	 * @param files the files
	 * @return the complete manifest
	 */
	public CompleteManifest withFiles(List<ModFile> files) {
		
		this.files = files;
		return this;
		
	}
	
	/**
	 * Gets the overrides.
	 *
	 * @return the overrides
	 */
	public String getOverrides() {
		
		return overrides;
		
	}
	
	/**
	 * Sets the overrides.
	 *
	 * @param overrides the new overrides
	 */
	public void setOverrides(String overrides) {
		
		this.overrides = overrides;
		
	}
	
	/**
	 * With overrides.
	 *
	 * @param overrides the overrides
	 * @return the complete manifest
	 */
	public CompleteManifest withOverrides(String overrides) {
		
		this.overrides = overrides;
		return this;
		
	}
	
}
