
package net.rom95.manifesto.backend.impl.mcinstance;

import com.google.gson.annotations.SerializedName;

public class BaseModLoader {
	
	@SerializedName("id")
	private Integer id;
	
	@SerializedName("gameVersionId")
	private Integer gameVersionId;
	
	@SerializedName("minecraftGameVersionId")
	private Integer minecraftGameVersionId;
	
	@SerializedName("forgeVersion")
	private String forgeVersion;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("type")
	private Integer type = 1;
	
	@SerializedName("downloadUrl")
	private String downloadUrl;
	
	@SerializedName("filename")
	private String filename;
	
	@SerializedName("installMethod")
	private Integer installMethod;
	
	@SerializedName("latest")
	private Boolean latest;
	
	@SerializedName("recommended")
	private Boolean recommended;
	
	@SerializedName("approved")
	private Boolean approved;
	
	@SerializedName("dateModified")
	private String dateModified;
	
	@SerializedName("mavenVersionString")
	private String mavenVersionString;
	
	@SerializedName("versionJson")
	private String versionJson;
	
	@SerializedName("librariesInstallLocation")	
	private String librariesInstallLocation;
	
	@SerializedName("minecraftVersion")	
	private String minecraftVersion;
	
	@SerializedName("modLoaderGameVersionId")	
	private Integer modLoaderGameVersionId;
	
	@SerializedName("modLoaderGameVersionTypeId")
	private Integer modLoaderGameVersionTypeId;
	
	@SerializedName("modLoaderGameVersionStatus")
	private Integer modLoaderGameVersionStatus;
	
	@SerializedName("modLoaderGameVersionTypeStatus")
	private Integer modLoaderGameVersionTypeStatus;
	
	@SerializedName("mcGameVersionId")
	private Integer mcGameVersionId;
	
	@SerializedName("mcGameVersionTypeId")
	private Integer mcGameVersionTypeId;
	
	@SerializedName("mcGameVersionStatus")
	private Integer mcGameVersionStatus;
	
	@SerializedName("mcGameVersionTypeStatus")
	private Integer mcGameVersionTypeStatus;
	
	/**
	 * Instantiates a new base mod loader.
	 */
	public BaseModLoader() {
		
	}
	
	/**
	 * Instantiates a new base mod loader.
	 *
	 * @param id                             the id
	 * @param gameVersionId                  the game version id
	 * @param minecraftGameVersionId         the minecraft game version id
	 * @param forgeVersion                   the forge version
	 * @param name                           the name
	 * @param type                           the type
	 * @param downloadUrl                    the download url
	 * @param filename                       the filename
	 * @param installMethod                  the install method
	 * @param latest                         the latest
	 * @param recommended                    the recommended
	 * @param approved                       the approved
	 * @param dateModified                   the date modified
	 * @param mavenVersionString             the maven version string
	 * @param versionJson                    the version json
	 * @param librariesInstallLocation       the libraries install location
	 * @param minecraftVersion               the minecraft version
	 * @param modLoaderGameVersionId         the mod loader game version id
	 * @param modLoaderGameVersionTypeId     the mod loader game version type id
	 * @param modLoaderGameVersionStatus     the mod loader game version status
	 * @param modLoaderGameVersionTypeStatus the mod loader game version type status
	 * @param mcGameVersionId                the mc game version id
	 * @param mcGameVersionTypeId            the mc game version type id
	 * @param mcGameVersionStatus            the mc game version status
	 * @param mcGameVersionTypeStatus        the mc game version type status
	 */
	public BaseModLoader(Integer id, Integer gameVersionId, Integer minecraftGameVersionId, String forgeVersion,
			String name, Integer type, String downloadUrl, String filename, Integer installMethod, Boolean latest,
			Boolean recommended, Boolean approved, String dateModified, String mavenVersionString, String versionJson,
			String librariesInstallLocation, String minecraftVersion, Integer modLoaderGameVersionId,
			Integer modLoaderGameVersionTypeId, Integer modLoaderGameVersionStatus,
			Integer modLoaderGameVersionTypeStatus, Integer mcGameVersionId, Integer mcGameVersionTypeId,
			Integer mcGameVersionStatus, Integer mcGameVersionTypeStatus) {
		
		super();
		this.id = id;
		this.gameVersionId = gameVersionId;
		this.minecraftGameVersionId = minecraftGameVersionId;
		this.forgeVersion = forgeVersion;
		this.name = name;
		this.type = type;
		this.downloadUrl = downloadUrl;
		this.filename = filename;
		this.installMethod = installMethod;
		this.latest = latest;
		this.recommended = recommended;
		this.approved = approved;
		this.dateModified = dateModified;
		this.mavenVersionString = mavenVersionString;
		this.versionJson = versionJson;
		this.librariesInstallLocation = librariesInstallLocation;
		this.minecraftVersion = minecraftVersion;
		this.modLoaderGameVersionId = modLoaderGameVersionId;
		this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
		this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
		this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
		this.mcGameVersionId = mcGameVersionId;
		this.mcGameVersionTypeId = mcGameVersionTypeId;
		this.mcGameVersionStatus = mcGameVersionStatus;
		this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
		
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
	 * @return the base mod loader
	 */
	public BaseModLoader withId(Integer id) {
		
		this.id = id;
		return this;
		
	}
	
	/**
	 * Gets the game version id.
	 *
	 * @return the game version id
	 */
	public Integer getGameVersionId() {
		
		return gameVersionId;
		
	}
	
	/**
	 * Sets the game version id.
	 *
	 * @param gameVersionId the new game version id
	 */
	public void setGameVersionId(Integer gameVersionId) {
		
		this.gameVersionId = gameVersionId;
		
	}
	
	/**
	 * With game version id.
	 *
	 * @param gameVersionId the game version id
	 * @return the base mod loader
	 */
	public BaseModLoader withGameVersionId(Integer gameVersionId) {
		
		this.gameVersionId = gameVersionId;
		return this;
		
	}
	
	/**
	 * Gets the minecraft game version id.
	 *
	 * @return the minecraft game version id
	 */
	public Integer getMinecraftGameVersionId() {
		
		return minecraftGameVersionId;
		
	}
	
	/**
	 * Sets the minecraft game version id.
	 *
	 * @param minecraftGameVersionId the new minecraft game version id
	 */
	public void setMinecraftGameVersionId(Integer minecraftGameVersionId) {
		
		this.minecraftGameVersionId = minecraftGameVersionId;
		
	}
	
	/**
	 * With minecraft game version id.
	 *
	 * @param minecraftGameVersionId the minecraft game version id
	 * @return the base mod loader
	 */
	public BaseModLoader withMinecraftGameVersionId(Integer minecraftGameVersionId) {
		
		this.minecraftGameVersionId = minecraftGameVersionId;
		return this;
		
	}
	
	/**
	 * Gets the forge version.
	 *
	 * @return the forge version
	 */
	public String getForgeVersion() {
		
		return forgeVersion;
		
	}
	
	/**
	 * Sets the forge version.
	 *
	 * @param forgeVersion the new forge version
	 */
	public void setForgeVersion(String forgeVersion) {
		
		this.forgeVersion = forgeVersion;
		
	}
	
	/**
	 * With forge version.
	 *
	 * @param forgeVersion the forge version
	 * @return the base mod loader
	 */
	public BaseModLoader withForgeVersion(String forgeVersion) {
		
		this.forgeVersion = forgeVersion;
		return this;
		
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
	 * @return the base mod loader
	 */
	public BaseModLoader withName(String name) {
		
		this.name = name;
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
	 * @return the base mod loader
	 */
	public BaseModLoader withType(Integer type) {
		
		this.type = type;
		return this;
		
	}
	
	/**
	 * Gets the download url.
	 *
	 * @return the download url
	 */
	public String getDownloadUrl() {
		
		return downloadUrl;
		
	}
	
	/**
	 * Sets the download url.
	 *
	 * @param downloadUrl the new download url
	 */
	public void setDownloadUrl(String downloadUrl) {
		
		this.downloadUrl = downloadUrl;
		
	}
	
	/**
	 * With download url.
	 *
	 * @param downloadUrl the download url
	 * @return the base mod loader
	 */
	public BaseModLoader withDownloadUrl(String downloadUrl) {
		
		this.downloadUrl = downloadUrl;
		return this;
		
	}
	
	/**
	 * Gets the filename.
	 *
	 * @return the filename
	 */
	public String getFilename() {
		
		return filename;
		
	}
	
	/**
	 * Sets the filename.
	 *
	 * @param filename the new filename
	 */
	public void setFilename(String filename) {
		
		this.filename = filename;
		
	}
	
	/**
	 * With filename.
	 *
	 * @param filename the filename
	 * @return the base mod loader
	 */
	public BaseModLoader withFilename(String filename) {
		
		this.filename = filename;
		return this;
		
	}
	
	/**
	 * Gets the install method.
	 *
	 * @return the install method
	 */
	public Integer getInstallMethod() {
		
		return installMethod;
		
	}
	
	/**
	 * Sets the install method.
	 *
	 * @param installMethod the new install method
	 */
	public void setInstallMethod(Integer installMethod) {
		
		this.installMethod = installMethod;
		
	}
	
	/**
	 * With install method.
	 *
	 * @param installMethod the install method
	 * @return the base mod loader
	 */
	public BaseModLoader withInstallMethod(Integer installMethod) {
		
		this.installMethod = installMethod;
		return this;
		
	}
	
	/**
	 * Gets the latest.
	 *
	 * @return the latest
	 */
	public Boolean getLatest() {
		
		return latest;
		
	}
	
	/**
	 * Sets the latest.
	 *
	 * @param latest the new latest
	 */
	public void setLatest(Boolean latest) {
		
		this.latest = latest;
		
	}
	
	/**
	 * With latest.
	 *
	 * @param latest the latest
	 * @return the base mod loader
	 */
	public BaseModLoader withLatest(Boolean latest) {
		
		this.latest = latest;
		return this;
		
	}
	
	/**
	 * Gets the recommended.
	 *
	 * @return the recommended
	 */
	public Boolean getRecommended() {
		
		return recommended;
		
	}
	
	/**
	 * Sets the recommended.
	 *
	 * @param recommended the new recommended
	 */
	public void setRecommended(Boolean recommended) {
		
		this.recommended = recommended;
		
	}
	
	/**
	 * With recommended.
	 *
	 * @param recommended the recommended
	 * @return the base mod loader
	 */
	public BaseModLoader withRecommended(Boolean recommended) {
		
		this.recommended = recommended;
		return this;
		
	}
	
	/**
	 * Gets the approved.
	 *
	 * @return the approved
	 */
	public Boolean getApproved() {
		
		return approved;
		
	}
	
	/**
	 * Sets the approved.
	 *
	 * @param approved the new approved
	 */
	public void setApproved(Boolean approved) {
		
		this.approved = approved;
		
	}
	
	/**
	 * With approved.
	 *
	 * @param approved the approved
	 * @return the base mod loader
	 */
	public BaseModLoader withApproved(Boolean approved) {
		
		this.approved = approved;
		return this;
		
	}
	
	/**
	 * Gets the date modified.
	 *
	 * @return the date modified
	 */
	public String getDateModified() {
		
		return dateModified;
		
	}
	
	/**
	 * Sets the date modified.
	 *
	 * @param dateModified the new date modified
	 */
	public void setDateModified(String dateModified) {
		
		this.dateModified = dateModified;
		
	}
	
	/**
	 * With date modified.
	 *
	 * @param dateModified the date modified
	 * @return the base mod loader
	 */
	public BaseModLoader withDateModified(String dateModified) {
		
		this.dateModified = dateModified;
		return this;
		
	}
	
	/**
	 * Gets the maven version string.
	 *
	 * @return the maven version string
	 */
	public String getMavenVersionString() {
		
		return mavenVersionString;
		
	}
	
	/**
	 * Sets the maven version string.
	 *
	 * @param mavenVersionString the new maven version string
	 */
	public void setMavenVersionString(String mavenVersionString) {
		
		this.mavenVersionString = mavenVersionString;
		
	}
	
	/**
	 * With maven version string.
	 *
	 * @param mavenVersionString the maven version string
	 * @return the base mod loader
	 */
	public BaseModLoader withMavenVersionString(String mavenVersionString) {
		
		this.mavenVersionString = mavenVersionString;
		return this;
		
	}
	
	/**
	 * Gets the version json.
	 *
	 * @return the version json
	 */
	public String getVersionJson() {
		
		return versionJson;
		
	}
	
	/**
	 * Sets the version json.
	 *
	 * @param versionJson the new version json
	 */
	public void setVersionJson(String versionJson) {
		
		this.versionJson = versionJson;
		
	}
	
	/**
	 * With version json.
	 *
	 * @param versionJson the version json
	 * @return the base mod loader
	 */
	public BaseModLoader withVersionJson(String versionJson) {
		
		this.versionJson = versionJson;
		return this;
		
	}
	
	/**
	 * Gets the libraries install location.
	 *
	 * @return the libraries install location
	 */
	public String getLibrariesInstallLocation() {
		
		return librariesInstallLocation;
		
	}
	
	/**
	 * Sets the libraries install location.
	 *
	 * @param librariesInstallLocation the new libraries install location
	 */
	public void setLibrariesInstallLocation(String librariesInstallLocation) {
		
		this.librariesInstallLocation = librariesInstallLocation;
		
	}
	
	/**
	 * With libraries install location.
	 *
	 * @param librariesInstallLocation the libraries install location
	 * @return the base mod loader
	 */
	public BaseModLoader withLibrariesInstallLocation(String librariesInstallLocation) {
		
		this.librariesInstallLocation = librariesInstallLocation;
		return this;
		
	}
	
	/**
	 * Gets the minecraft version.
	 *
	 * @return the minecraft version
	 */
	public String getMinecraftVersion() {
		
		return minecraftVersion;
		
	}
	
	/**
	 * Sets the minecraft version.
	 *
	 * @param minecraftVersion the new minecraft version
	 */
	public void setMinecraftVersion(String minecraftVersion) {
		
		this.minecraftVersion = minecraftVersion;
		
	}
	
	/**
	 * With minecraft version.
	 *
	 * @param minecraftVersion the minecraft version
	 * @return the base mod loader
	 */
	public BaseModLoader withMinecraftVersion(String minecraftVersion) {
		
		this.minecraftVersion = minecraftVersion;
		return this;
		
	}
	
	/**
	 * Gets the mod loader game version id.
	 *
	 * @return the mod loader game version id
	 */
	public Integer getModLoaderGameVersionId() {
		
		return modLoaderGameVersionId;
		
	}
	
	/**
	 * Sets the mod loader game version id.
	 *
	 * @param modLoaderGameVersionId the new mod loader game version id
	 */
	public void setModLoaderGameVersionId(Integer modLoaderGameVersionId) {
		
		this.modLoaderGameVersionId = modLoaderGameVersionId;
		
	}
	
	/**
	 * With mod loader game version id.
	 *
	 * @param modLoaderGameVersionId the mod loader game version id
	 * @return the base mod loader
	 */
	public BaseModLoader withModLoaderGameVersionId(Integer modLoaderGameVersionId) {
		
		this.modLoaderGameVersionId = modLoaderGameVersionId;
		return this;
		
	}
	
	/**
	 * Gets the mod loader game version type id.
	 *
	 * @return the mod loader game version type id
	 */
	public Integer getModLoaderGameVersionTypeId() {
		
		return modLoaderGameVersionTypeId;
		
	}
	
	/**
	 * Sets the mod loader game version type id.
	 *
	 * @param modLoaderGameVersionTypeId the new mod loader game version type id
	 */
	public void setModLoaderGameVersionTypeId(Integer modLoaderGameVersionTypeId) {
		
		this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
		
	}
	
	/**
	 * With mod loader game version type id.
	 *
	 * @param modLoaderGameVersionTypeId the mod loader game version type id
	 * @return the base mod loader
	 */
	public BaseModLoader withModLoaderGameVersionTypeId(Integer modLoaderGameVersionTypeId) {
		
		this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
		return this;
		
	}
	
	/**
	 * Gets the mod loader game version status.
	 *
	 * @return the mod loader game version status
	 */
	public Integer getModLoaderGameVersionStatus() {
		
		return modLoaderGameVersionStatus;
		
	}
	
	/**
	 * Sets the mod loader game version status.
	 *
	 * @param modLoaderGameVersionStatus the new mod loader game version status
	 */
	public void setModLoaderGameVersionStatus(Integer modLoaderGameVersionStatus) {
		
		this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
		
	}
	
	/**
	 * With mod loader game version status.
	 *
	 * @param modLoaderGameVersionStatus the mod loader game version status
	 * @return the base mod loader
	 */
	public BaseModLoader withModLoaderGameVersionStatus(Integer modLoaderGameVersionStatus) {
		
		this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
		return this;
		
	}
	
	/**
	 * Gets the mod loader game version type status.
	 *
	 * @return the mod loader game version type status
	 */
	public Integer getModLoaderGameVersionTypeStatus() {
		
		return modLoaderGameVersionTypeStatus;
		
	}
	
	/**
	 * Sets the mod loader game version type status.
	 *
	 * @param modLoaderGameVersionTypeStatus the new mod loader game version type
	 *                                       status
	 */
	public void setModLoaderGameVersionTypeStatus(Integer modLoaderGameVersionTypeStatus) {
		
		this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
		
	}
	
	/**
	 * With mod loader game version type status.
	 *
	 * @param modLoaderGameVersionTypeStatus the mod loader game version type status
	 * @return the base mod loader
	 */
	public BaseModLoader withModLoaderGameVersionTypeStatus(Integer modLoaderGameVersionTypeStatus) {
		
		this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
		return this;
		
	}
	
	/**
	 * Gets the mc game version id.
	 *
	 * @return the mc game version id
	 */
	public Integer getMcGameVersionId() {
		
		return mcGameVersionId;
		
	}
	
	/**
	 * Sets the mc game version id.
	 *
	 * @param mcGameVersionId the new mc game version id
	 */
	public void setMcGameVersionId(Integer mcGameVersionId) {
		
		this.mcGameVersionId = mcGameVersionId;
		
	}
	
	/**
	 * With mc game version id.
	 *
	 * @param mcGameVersionId the mc game version id
	 * @return the base mod loader
	 */
	public BaseModLoader withMcGameVersionId(Integer mcGameVersionId) {
		
		this.mcGameVersionId = mcGameVersionId;
		return this;
		
	}
	
	/**
	 * Gets the mc game version type id.
	 *
	 * @return the mc game version type id
	 */
	public Integer getMcGameVersionTypeId() {
		
		return mcGameVersionTypeId;
		
	}
	
	/**
	 * Sets the mc game version type id.
	 *
	 * @param mcGameVersionTypeId the new mc game version type id
	 */
	public void setMcGameVersionTypeId(Integer mcGameVersionTypeId) {
		
		this.mcGameVersionTypeId = mcGameVersionTypeId;
		
	}
	
	/**
	 * With mc game version type id.
	 *
	 * @param mcGameVersionTypeId the mc game version type id
	 * @return the base mod loader
	 */
	public BaseModLoader withMcGameVersionTypeId(Integer mcGameVersionTypeId) {
		
		this.mcGameVersionTypeId = mcGameVersionTypeId;
		return this;
		
	}
	
	/**
	 * Gets the mc game version status.
	 *
	 * @return the mc game version status
	 */
	public Integer getMcGameVersionStatus() {
		
		return mcGameVersionStatus;
		
	}
	
	/**
	 * Sets the mc game version status.
	 *
	 * @param mcGameVersionStatus the new mc game version status
	 */
	public void setMcGameVersionStatus(Integer mcGameVersionStatus) {
		
		this.mcGameVersionStatus = mcGameVersionStatus;
		
	}
	
	/**
	 * With mc game version status.
	 *
	 * @param mcGameVersionStatus the mc game version status
	 * @return the base mod loader
	 */
	public BaseModLoader withMcGameVersionStatus(Integer mcGameVersionStatus) {
		
		this.mcGameVersionStatus = mcGameVersionStatus;
		return this;
		
	}
	
	/**
	 * Gets the mc game version type status.
	 *
	 * @return the mc game version type status
	 */
	public Integer getMcGameVersionTypeStatus() {
		
		return mcGameVersionTypeStatus;
		
	}
	
	/**
	 * Sets the mc game version type status.
	 *
	 * @param mcGameVersionTypeStatus the new mc game version type status
	 */
	public void setMcGameVersionTypeStatus(Integer mcGameVersionTypeStatus) {
		
		this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
		
	}
	
	/**
	 * With mc game version type status.
	 *
	 * @param mcGameVersionTypeStatus the mc game version type status
	 * @return the base mod loader
	 */
	public BaseModLoader withMcGameVersionTypeStatus(Integer mcGameVersionTypeStatus) {
		
		this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
		return this;
		
	}
	
}
