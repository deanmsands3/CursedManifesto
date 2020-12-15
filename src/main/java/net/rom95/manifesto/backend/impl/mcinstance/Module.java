
package net.rom95.manifesto.backend.impl.mcinstance;

import com.google.gson.annotations.SerializedName;

public class Module {
	
	@SerializedName("foldername")
	private String foldername;
	
	@SerializedName("fingerprint")
	private Long fingerprint;
	
	@SerializedName("type")
	private Long type;
	
	@SerializedName("invalidFingerprint")
	private Boolean invalidFingerprint;
	
	/**
	 * Instantiates a new module.
	 */
	public Module() {
	
	}
	
	/**
	 * Instantiates a new module.
	 *
	 * @param foldername         the foldername
	 * @param fingerprint        the fingerprint
	 * @param type               the type
	 * @param invalidFingerprint the invalid fingerprint
	 */
	public Module(String foldername, Long fingerprint, Long type, Boolean invalidFingerprint) {
		
		super();
		this.foldername = foldername;
		this.fingerprint = fingerprint;
		this.type = type;
		this.invalidFingerprint = invalidFingerprint;
		
	}
	
	/**
	 * Gets the foldername.
	 *
	 * @return the foldername
	 */
	public String getFoldername() {
		
		return foldername;
		
	}
	
	/**
	 * Sets the foldername.
	 *
	 * @param foldername the new foldername
	 */
	public void setFoldername(String foldername) {
		
		this.foldername = foldername;
		
	}
	
	/**
	 * With foldername.
	 *
	 * @param foldername the foldername
	 * @return the module
	 */
	public Module withFoldername(String foldername) {
		
		this.foldername = foldername;
		return this;
		
	}
	
	/**
	 * Gets the fingerprint.
	 *
	 * @return the fingerprint
	 */
	public Long getFingerprint() {
		
		return fingerprint;
		
	}
	
	/**
	 * Sets the fingerprint.
	 *
	 * @param fingerprint the new fingerprint
	 */
	public void setFingerprint(Long fingerprint) {
		
		this.fingerprint = fingerprint;
		
	}
	
	/**
	 * With fingerprint.
	 *
	 * @param fingerprint the fingerprint
	 * @return the module
	 */
	public Module withFingerprint(Long fingerprint) {
		
		this.fingerprint = fingerprint;
		return this;
		
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public Long getType() {
		
		return type;
		
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(Long type) {
		
		this.type = type;
		
	}
	
	/**
	 * With type.
	 *
	 * @param type the type
	 * @return the module
	 */
	public Module withType(Long type) {
		
		this.type = type;
		return this;
		
	}
	
	/**
	 * Gets the invalid fingerprint.
	 *
	 * @return the invalid fingerprint
	 */
	public Boolean getInvalidFingerprint() {
		
		return invalidFingerprint;
		
	}
	
	/**
	 * Sets the invalid fingerprint.
	 *
	 * @param invalidFingerprint the new invalid fingerprint
	 */
	public void setInvalidFingerprint(Boolean invalidFingerprint) {
		
		this.invalidFingerprint = invalidFingerprint;
		
	}
	
	/**
	 * With invalid fingerprint.
	 *
	 * @param invalidFingerprint the invalid fingerprint
	 * @return the module
	 */
	public Module withInvalidFingerprint(Boolean invalidFingerprint) {
		
		this.invalidFingerprint = invalidFingerprint;
		return this;
		
	}
	
}
