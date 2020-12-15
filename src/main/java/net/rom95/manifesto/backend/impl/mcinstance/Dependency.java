
package net.rom95.manifesto.backend.impl.mcinstance;

import com.google.gson.annotations.SerializedName;

public class Dependency {
	
	@SerializedName("id")
	private Integer id;
	
	@SerializedName("addonId")
	private Integer addonId;
	
	@SerializedName("type")
	private Integer type;
	
	@SerializedName("fileId")
	private Integer fileId;
	
	/**
	 * Instantiates a new dependency.
	 */
	public Dependency() {
	
	}
	
	/**
	 * Instantiates a new dependency.
	 *
	 * @param id      the id
	 * @param addonId the addon id
	 * @param type    the type
	 * @param fileId  the file id
	 */
	public Dependency(Integer id, Integer addonId, Integer type, Integer fileId) {
		
		super();
		this.id = id;
		this.addonId = addonId;
		this.type = type;
		this.fileId = fileId;
		
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		
		return id;
		
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		
		this.id = id;
		
	}
	
	/**
	 * With id.
	 *
	 * @param id the id
	 * @return the dependency
	 */
	public Dependency withId(Integer id) {
		
		this.id = id;
		return this;
		
	}
	
	/**
	 * Gets the addon id.
	 *
	 * @return the addon id
	 */
	public Integer getAddonId() {
		
		return addonId;
		
	}
	
	/**
	 * Sets the addon id.
	 *
	 * @param addonId the new addon id
	 */
	public void setAddonId(Integer addonId) {
		
		this.addonId = addonId;
		
	}
	
	/**
	 * With addon id.
	 *
	 * @param addonId the addon id
	 * @return the dependency
	 */
	public Dependency withAddonId(Integer addonId) {
		
		this.addonId = addonId;
		return this;
		
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public Integer getType() {
		
		return type;
		
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(Integer type) {
		
		this.type = type;
		
	}
	
	/**
	 * With type.
	 *
	 * @param type the type
	 * @return the dependency
	 */
	public Dependency withType(Integer type) {
		
		this.type = type;
		return this;
		
	}
	
	/**
	 * Gets the file id.
	 *
	 * @return the file id
	 */
	public Integer getFileId() {
		
		return fileId;
		
	}
	
	/**
	 * Sets the file id.
	 *
	 * @param fileId the new file id
	 */
	public void setFileId(Integer fileId) {
		
		this.fileId = fileId;
		
	}
	
	/**
	 * With file id.
	 *
	 * @param fileId the file id
	 * @return the dependency
	 */
	public Dependency withFileId(Integer fileId) {
		
		this.fileId = fileId;
		return this;
		
	}
	
}
