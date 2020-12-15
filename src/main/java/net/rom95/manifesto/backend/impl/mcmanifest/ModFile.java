
package net.rom95.manifesto.backend.impl.mcmanifest;

import com.google.gson.annotations.SerializedName;

public class ModFile {
	
	private String modName;
	
	@SerializedName("projectID")
	private Integer projectID;
	
	@SerializedName("fileID")
	private Integer fileID;
	
	@SerializedName("required")
	private Boolean required;
	
	/**
	 * Instantiates a new mod file.
	 */
	public ModFile() {
	
	}
	
	/**
	 * Instantiates a new mod file.
	 *
	 * @param projectID the mods project ID
	 * @param fileID    the mod file ID
	 * @param required  true if the mod is required
	 */
	public ModFile(Integer projectID, Integer fileID, Boolean required) {
		
		super();
		this.projectID = projectID;
		this.fileID = fileID;
		this.required = required;
		
	}
	
	public ModFile setName(String name) {
		this.modName = name;
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
	 * @return the mod file
	 */
	public ModFile withProjectID(Integer projectID) {
		
		this.projectID = projectID;
		return this;
		
	}
	
	/**
	 * Gets the file ID.
	 *
	 * @return the file ID
	 */
	public Integer getFileID() {
		
		return fileID;
		
	}
	
	/**
	 * Sets the file ID.
	 *
	 * @param fileID the new file ID
	 */
	public void setFileID(Integer fileID) {
		
		this.fileID = fileID;
		
	}
	
	/**
	 * With file ID.
	 *
	 * @param fileID the file ID
	 * @return the mod file
	 */
	public ModFile withFileID(Integer fileID) {
		
		this.fileID = fileID;
		return this;
		
	}
	
	/**
	 * Gets the required.
	 *
	 * @return the required
	 */
	public Boolean getRequired() {
		
		return required;
		
	}
	
	/**
	 * Sets the required.
	 *
	 * @param required the new required
	 */
	public void setRequired(Boolean required) {
		
		this.required = required;
		
	}
	
	/**
	 * With required.
	 *
	 * @param required the required
	 * @return the mod file
	 */
	public ModFile withRequired(Boolean required) {
		
		this.required = required;
		return this;
		
	}
	
}
