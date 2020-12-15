
package net.rom95.manifesto.backend.impl.mcmanifest;

import com.google.gson.annotations.SerializedName;

public class ModLoader {
	
	@SerializedName("id")
	private String id;
	
	@SerializedName("primary")
	private Boolean primary;
	
	/**
	 * Instantiates a new mod loader.
	 */
	public ModLoader() {
	
	}
	
	/**
	 * Instantiates a new mod loader.
	 *
	 * @param id      the id
	 * @param primary the primary
	 */
	public ModLoader(String id, Boolean primary) {
		
		super();
		this.id = id;
		this.primary = primary;
		
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		
		return id;
		
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		
		this.id = id;
		
	}
	
	/**
	 * With id.
	 *
	 * @param id the id
	 * @return the mod loader
	 */
	public ModLoader withId(String id) {
		
		this.id = id;
		return this;
		
	}
	
	/**
	 * Gets the primary.
	 *
	 * @return the primary
	 */
	public Boolean getPrimary() {
		
		return primary;
		
	}
	
	/**
	 * Sets the primary.
	 *
	 * @param primary the new primary
	 */
	public void setPrimary(Boolean primary) {
		
		this.primary = primary;
		
	}
	
	/**
	 * With primary.
	 *
	 * @param primary the primary
	 * @return the mod loader
	 */
	public ModLoader withPrimary(Boolean primary) {
		
		this.primary = primary;
		return this;
		
	}
	
}
