
package net.rom95.manifesto.backend.impl.mcinstance;

import java.io.Reader;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import net.rom95.manifesto.backend.Manifesto;

public class MinecraftInstanceFile {
	
	@SerializedName("baseModLoader")
	private BaseModLoader baseModLoader;
	
	@SerializedName("isUnlocked")
	private Boolean isUnlocked;
	
	@SerializedName("javaArgsOverride")
	private Object javaArgsOverride;
	
	@SerializedName("javaDirOverride")
	private Object javaDirOverride;
	
	@SerializedName("lastPlayed")
	private String lastPlayed;
	
	@SerializedName("manifest")
	private Object manifest;
	
	@SerializedName("fileDate")
	private String fileDate;
	
	@SerializedName("installedModpack")
	private Object installedModpack;
	
	@SerializedName("projectID")
	private Integer projectID;
	
	@SerializedName("fileID")
	private Integer fileID;
	
	@SerializedName("customAuthor")
	private String customAuthor;
	
	@SerializedName("modpackOverrides")
	private Object modpackOverrides;
	
	@SerializedName("isMemoryOverride")
	private Boolean isMemoryOverride;
	
	@SerializedName("allocatedMemory")
	private Integer allocatedMemory;
	
	@SerializedName("guid")
	private String guid;
	
	@SerializedName("gameTypeID")
	private Integer gameTypeID;
	
	@SerializedName("installPath")
	private String installPath;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("cachedScans")
	private List<Object> cachedScans = null;
	
	@SerializedName("isValid")
	private Boolean isValid;
	
	@SerializedName("lastPreviousMatchUpdate")
	private String lastPreviousMatchUpdate;
	
	@SerializedName("isEnabled")
	private Boolean isEnabled;
	
	@SerializedName("isPinned")
	private Boolean isPinned;
	
	@SerializedName("gameVersion")
	private String gameVersion;
	
	@SerializedName("preferenceAlternateFile")
	private Boolean preferenceAlternateFile;
	
	@SerializedName("preferenceAutoInstallUpdates")
	private Boolean preferenceAutoInstallUpdates;
	
	@SerializedName("preferenceQuickDeleteLibraries")
	private Boolean preferenceQuickDeleteLibraries;
	
	@SerializedName("preferenceDeleteSavedVariables")
	private Boolean preferenceDeleteSavedVariables;
	
	@SerializedName("preferenceProcessFileCommands")
	private Boolean preferenceProcessFileCommands;
	
	@SerializedName("preferenceReleaseType")
	private Integer preferenceReleaseType;
	
	@SerializedName("syncProfile")
	private SyncProfile syncProfile;
	
	@SerializedName("preferenceShowAddOnInfo")
	private Boolean preferenceShowAddOnInfo;
	
	@SerializedName("installDate")
	private String installDate;
	
	@SerializedName("installedAddons")
	private List<InstalledAddon> installedAddons = null;
	
	@SerializedName("isMigrated")
	private Boolean isMigrated;
	
	@SerializedName("preferenceUploadProfile")
	private Boolean preferenceUploadProfile;
	
	/**
	 * Instantiates a new minecraft instance file.
	 */
	public MinecraftInstanceFile() {
	
	}
	
	public MinecraftInstanceFile(Reader reader) {
		super();
		Manifesto.GSON.fromJson(reader, this.getClass());
	}
	
	/**
	 * Instantiates a new minecraft instance file.
	 *
	 * @param baseModLoader                  the base mod loader
	 * @param isUnlocked                     the is unlocked
	 * @param javaArgsOverride               the java args override
	 * @param javaDirOverride                the java dir override
	 * @param lastPlayed                     the last played
	 * @param manifest                       the manifest
	 * @param fileDate                       the file date
	 * @param installedModpack               the installed modpack
	 * @param projectID                      the project ID
	 * @param fileID                         the file ID
	 * @param customAuthor                   the custom author
	 * @param modpackOverrides               the modpack overrides
	 * @param isMemoryOverride               the is memory override
	 * @param allocatedMemory                the allocated memory
	 * @param guid                           the guid
	 * @param gameTypeID                     the game type ID
	 * @param installPath                    the install path
	 * @param name                           the name
	 * @param cachedScans                    the cached scans
	 * @param isValid                        the is valid
	 * @param lastPreviousMatchUpdate        the last previous match update
	 * @param isEnabled                      the is enabled
	 * @param isPinned                       the is pinned
	 * @param gameVersion                    the game version
	 * @param preferenceAlternateFile        the preference alternate file
	 * @param preferenceAutoInstallUpdates   the preference auto install updates
	 * @param preferenceQuickDeleteLibraries the preference quick delete libraries
	 * @param preferenceDeleteSavedVariables the preference delete saved variables
	 * @param preferenceProcessFileCommands  the preference process file commands
	 * @param preferenceReleaseType          the preference release type
	 * @param syncProfile                    the sync profile
	 * @param preferenceShowAddOnInfo        the preference show add on info
	 * @param installDate                    the install date
	 * @param installedAddons                the installed addons
	 * @param isMigrated                     the is migrated
	 * @param preferenceUploadProfile        the preference upload profile
	 */
	public MinecraftInstanceFile(BaseModLoader baseModLoader, Boolean isUnlocked, Object javaArgsOverride,
			Object javaDirOverride, String lastPlayed, Object manifest, String fileDate, Object installedModpack,
			Integer projectID, Integer fileID, String customAuthor, Object modpackOverrides, Boolean isMemoryOverride,
			Integer allocatedMemory, String guid, Integer gameTypeID, String installPath, String name,
			List<Object> cachedScans, Boolean isValid, String lastPreviousMatchUpdate, Boolean isEnabled,
			Boolean isPinned, String gameVersion, Boolean preferenceAlternateFile, Boolean preferenceAutoInstallUpdates,
			Boolean preferenceQuickDeleteLibraries, Boolean preferenceDeleteSavedVariables,
			Boolean preferenceProcessFileCommands, Integer preferenceReleaseType, SyncProfile syncProfile,
			Boolean preferenceShowAddOnInfo, String installDate, List<InstalledAddon> installedAddons,
			Boolean isMigrated, Boolean preferenceUploadProfile) {
		
		super();
		this.baseModLoader = baseModLoader;
		this.isUnlocked = isUnlocked;
		this.javaArgsOverride = javaArgsOverride;
		this.javaDirOverride = javaDirOverride;
		this.lastPlayed = lastPlayed;
		this.manifest = manifest;
		this.fileDate = fileDate;
		this.installedModpack = installedModpack;
		this.projectID = projectID;
		this.fileID = fileID;
		this.customAuthor = customAuthor;
		this.modpackOverrides = modpackOverrides;
		this.isMemoryOverride = isMemoryOverride;
		this.allocatedMemory = allocatedMemory;
		this.guid = guid;
		this.gameTypeID = gameTypeID;
		this.installPath = installPath;
		this.name = name;
		this.cachedScans = cachedScans;
		this.isValid = isValid;
		this.lastPreviousMatchUpdate = lastPreviousMatchUpdate;
		this.isEnabled = isEnabled;
		this.isPinned = isPinned;
		this.gameVersion = gameVersion;
		this.preferenceAlternateFile = preferenceAlternateFile;
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
		this.preferenceQuickDeleteLibraries = preferenceQuickDeleteLibraries;
		this.preferenceDeleteSavedVariables = preferenceDeleteSavedVariables;
		this.preferenceProcessFileCommands = preferenceProcessFileCommands;
		this.preferenceReleaseType = preferenceReleaseType;
		this.syncProfile = syncProfile;
		this.preferenceShowAddOnInfo = preferenceShowAddOnInfo;
		this.installDate = installDate;
		this.installedAddons = installedAddons;
		this.isMigrated = isMigrated;
		this.preferenceUploadProfile = preferenceUploadProfile;
		
	}
	
	/**
	 * Gets the base mod loader.
	 *
	 * @return the base mod loader
	 */
	public BaseModLoader getBaseModLoader() {
		
		return baseModLoader;
		
	}
	
	/**
	 * Sets the base mod loader.
	 *
	 * @param baseModLoader the new base mod loader
	 */
	public void setBaseModLoader(BaseModLoader baseModLoader) {
		
		this.baseModLoader = baseModLoader;
		
	}
	
	/**
	 * With base mod loader.
	 *
	 * @param baseModLoader the base mod loader
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withBaseModLoader(BaseModLoader baseModLoader) {
		
		this.baseModLoader = baseModLoader;
		return this;
		
	}
	
	/**
	 * Gets the checks if is unlocked.
	 *
	 * @return the checks if is unlocked
	 */
	public Boolean getIsUnlocked() {
		
		return isUnlocked;
		
	}
	
	/**
	 * Sets the checks if is unlocked.
	 *
	 * @param isUnlocked the new checks if is unlocked
	 */
	public void setIsUnlocked(Boolean isUnlocked) {
		
		this.isUnlocked = isUnlocked;
		
	}
	
	/**
	 * With is unlocked.
	 *
	 * @param isUnlocked the is unlocked
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsUnlocked(Boolean isUnlocked) {
		
		this.isUnlocked = isUnlocked;
		return this;
		
	}
	
	/**
	 * Gets the java args override.
	 *
	 * @return the java args override
	 */
	public Object getJavaArgsOverride() {
		
		return javaArgsOverride;
		
	}
	
	/**
	 * Sets the java args override.
	 *
	 * @param javaArgsOverride the new java args override
	 */
	public void setJavaArgsOverride(Object javaArgsOverride) {
		
		this.javaArgsOverride = javaArgsOverride;
		
	}
	
	/**
	 * With java args override.
	 *
	 * @param javaArgsOverride the java args override
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withJavaArgsOverride(Object javaArgsOverride) {
		
		this.javaArgsOverride = javaArgsOverride;
		return this;
		
	}
	
	/**
	 * Gets the java dir override.
	 *
	 * @return the java dir override
	 */
	public Object getJavaDirOverride() {
		
		return javaDirOverride;
		
	}
	
	/**
	 * Sets the java dir override.
	 *
	 * @param javaDirOverride the new java dir override
	 */
	public void setJavaDirOverride(Object javaDirOverride) {
		
		this.javaDirOverride = javaDirOverride;
		
	}
	
	/**
	 * With java dir override.
	 *
	 * @param javaDirOverride the java dir override
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withJavaDirOverride(Object javaDirOverride) {
		
		this.javaDirOverride = javaDirOverride;
		return this;
		
	}
	
	/**
	 * Gets the last played.
	 *
	 * @return the last played
	 */
	public String getLastPlayed() {
		
		return lastPlayed;
		
	}
	
	/**
	 * Sets the last played.
	 *
	 * @param lastPlayed the new last played
	 */
	public void setLastPlayed(String lastPlayed) {
		
		this.lastPlayed = lastPlayed;
		
	}
	
	/**
	 * With last played.
	 *
	 * @param lastPlayed the last played
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withLastPlayed(String lastPlayed) {
		
		this.lastPlayed = lastPlayed;
		return this;
		
	}
	
	/**
	 * Gets the manifest.
	 *
	 * @return the manifest
	 */
	public Object getManifest() {
		
		return manifest;
		
	}
	
	/**
	 * Sets the manifest.
	 *
	 * @param manifest the new manifest
	 */
	public void setManifest(Object manifest) {
		
		this.manifest = manifest;
		
	}
	
	/**
	 * With manifest.
	 *
	 * @param manifest the manifest
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withManifest(Object manifest) {
		
		this.manifest = manifest;
		return this;
		
	}
	
	/**
	 * Gets the file date.
	 *
	 * @return the file date
	 */
	public String getFileDate() {
		
		return fileDate;
		
	}
	
	/**
	 * Sets the file date.
	 *
	 * @param fileDate the new file date
	 */
	public void setFileDate(String fileDate) {
		
		this.fileDate = fileDate;
		
	}
	
	/**
	 * With file date.
	 *
	 * @param fileDate the file date
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withFileDate(String fileDate) {
		
		this.fileDate = fileDate;
		return this;
		
	}
	
	/**
	 * Gets the installed modpack.
	 *
	 * @return the installed modpack
	 */
	public Object getInstalledModpack() {
		
		return installedModpack;
		
	}
	
	/**
	 * Sets the installed modpack.
	 *
	 * @param installedModpack the new installed modpack
	 */
	public void setInstalledModpack(Object installedModpack) {
		
		this.installedModpack = installedModpack;
		
	}
	
	/**
	 * With installed modpack.
	 *
	 * @param installedModpack the installed modpack
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withInstalledModpack(Object installedModpack) {
		
		this.installedModpack = installedModpack;
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
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withProjectID(Integer projectID) {
		
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
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withFileID(Integer fileID) {
		
		this.fileID = fileID;
		return this;
		
	}
	
	/**
	 * Gets the custom author.
	 *
	 * @return the custom author
	 */
	public String getCustomAuthor() {
		
		return customAuthor;
		
	}
	
	/**
	 * Sets the custom author.
	 *
	 * @param customAuthor the new custom author
	 */
	public void setCustomAuthor(String customAuthor) {
		
		this.customAuthor = customAuthor;
		
	}
	
	/**
	 * With custom author.
	 *
	 * @param customAuthor the custom author
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withCustomAuthor(String customAuthor) {
		
		this.customAuthor = customAuthor;
		return this;
		
	}
	
	/**
	 * Gets the modpack overrides.
	 *
	 * @return the modpack overrides
	 */
	public Object getModpackOverrides() {
		
		return modpackOverrides;
		
	}
	
	/**
	 * Sets the modpack overrides.
	 *
	 * @param modpackOverrides the new modpack overrides
	 */
	public void setModpackOverrides(Object modpackOverrides) {
		
		this.modpackOverrides = modpackOverrides;
		
	}
	
	/**
	 * With modpack overrides.
	 *
	 * @param modpackOverrides the modpack overrides
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withModpackOverrides(Object modpackOverrides) {
		
		this.modpackOverrides = modpackOverrides;
		return this;
		
	}
	
	/**
	 * Gets the checks if is memory override.
	 *
	 * @return the checks if is memory override
	 */
	public Boolean getIsMemoryOverride() {
		
		return isMemoryOverride;
		
	}
	
	/**
	 * Sets the checks if is memory override.
	 *
	 * @param isMemoryOverride the new checks if is memory override
	 */
	public void setIsMemoryOverride(Boolean isMemoryOverride) {
		
		this.isMemoryOverride = isMemoryOverride;
		
	}
	
	/**
	 * With is memory override.
	 *
	 * @param isMemoryOverride the is memory override
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsMemoryOverride(Boolean isMemoryOverride) {
		
		this.isMemoryOverride = isMemoryOverride;
		return this;
		
	}
	
	/**
	 * Gets the allocated memory.
	 *
	 * @return the allocated memory
	 */
	public Integer getAllocatedMemory() {
		
		return allocatedMemory;
		
	}
	
	/**
	 * Sets the allocated memory.
	 *
	 * @param allocatedMemory the new allocated memory
	 */
	public void setAllocatedMemory(Integer allocatedMemory) {
		
		this.allocatedMemory = allocatedMemory;
		
	}
	
	/**
	 * With allocated memory.
	 *
	 * @param allocatedMemory the allocated memory
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withAllocatedMemory(Integer allocatedMemory) {
		
		this.allocatedMemory = allocatedMemory;
		return this;
		
	}
	
	/**
	 * Gets the guid.
	 *
	 * @return the guid
	 */
	public String getGuid() {
		
		return guid;
		
	}
	
	/**
	 * Sets the guid.
	 *
	 * @param guid the new guid
	 */
	public void setGuid(String guid) {
		
		this.guid = guid;
		
	}
	
	/**
	 * With guid.
	 *
	 * @param guid the guid
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withGuid(String guid) {
		
		this.guid = guid;
		return this;
		
	}
	
	/**
	 * Gets the game type ID.
	 *
	 * @return the game type ID
	 */
	public Integer getGameTypeID() {
		
		return gameTypeID;
		
	}
	
	/**
	 * Sets the game type ID.
	 *
	 * @param gameTypeID the new game type ID
	 */
	public void setGameTypeID(Integer gameTypeID) {
		
		this.gameTypeID = gameTypeID;
		
	}
	
	/**
	 * With game type ID.
	 *
	 * @param gameTypeID the game type ID
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withGameTypeID(Integer gameTypeID) {
		
		this.gameTypeID = gameTypeID;
		return this;
		
	}
	
	/**
	 * Gets the install path.
	 *
	 * @return the install path
	 */
	public String getInstallPath() {
		
		return installPath;
		
	}
	
	/**
	 * Sets the install path.
	 *
	 * @param installPath the new install path
	 */
	public void setInstallPath(String installPath) {
		
		this.installPath = installPath;
		
	}
	
	/**
	 * With install path.
	 *
	 * @param installPath the install path
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withInstallPath(String installPath) {
		
		this.installPath = installPath;
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
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withName(String name) {
		
		this.name = name;
		return this;
		
	}
	
	/**
	 * Gets the cached scans.
	 *
	 * @return the cached scans
	 */
	public List<Object> getCachedScans() {
		
		return cachedScans;
		
	}
	
	/**
	 * Sets the cached scans.
	 *
	 * @param cachedScans the new cached scans
	 */
	public void setCachedScans(List<Object> cachedScans) {
		
		this.cachedScans = cachedScans;
		
	}
	
	/**
	 * With cached scans.
	 *
	 * @param cachedScans the cached scans
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withCachedScans(List<Object> cachedScans) {
		
		this.cachedScans = cachedScans;
		return this;
		
	}
	
	/**
	 * Gets the checks if is valid.
	 *
	 * @return the checks if is valid
	 */
	public Boolean getIsValid() {
		
		return isValid;
		
	}
	
	/**
	 * Sets the checks if is valid.
	 *
	 * @param isValid the new checks if is valid
	 */
	public void setIsValid(Boolean isValid) {
		
		this.isValid = isValid;
		
	}
	
	/**
	 * With is valid.
	 *
	 * @param isValid the is valid
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsValid(Boolean isValid) {
		
		this.isValid = isValid;
		return this;
		
	}
	
	/**
	 * Gets the last previous match update.
	 *
	 * @return the last previous match update
	 */
	public String getLastPreviousMatchUpdate() {
		
		return lastPreviousMatchUpdate;
		
	}
	
	/**
	 * Sets the last previous match update.
	 *
	 * @param lastPreviousMatchUpdate the new last previous match update
	 */
	public void setLastPreviousMatchUpdate(String lastPreviousMatchUpdate) {
		
		this.lastPreviousMatchUpdate = lastPreviousMatchUpdate;
		
	}
	
	/**
	 * With last previous match update.
	 *
	 * @param lastPreviousMatchUpdate the last previous match update
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withLastPreviousMatchUpdate(String lastPreviousMatchUpdate) {
		
		this.lastPreviousMatchUpdate = lastPreviousMatchUpdate;
		return this;
		
	}
	
	/**
	 * Gets the checks if is enabled.
	 *
	 * @return the checks if is enabled
	 */
	public Boolean getIsEnabled() {
		
		return isEnabled;
		
	}
	
	/**
	 * Sets the checks if is enabled.
	 *
	 * @param isEnabled the new checks if is enabled
	 */
	public void setIsEnabled(Boolean isEnabled) {
		
		this.isEnabled = isEnabled;
		
	}
	
	/**
	 * With is enabled.
	 *
	 * @param isEnabled the is enabled
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsEnabled(Boolean isEnabled) {
		
		this.isEnabled = isEnabled;
		return this;
		
	}
	
	/**
	 * Gets the checks if is pinned.
	 *
	 * @return the checks if is pinned
	 */
	public Boolean getIsPinned() {
		
		return isPinned;
		
	}
	
	/**
	 * Sets the checks if is pinned.
	 *
	 * @param isPinned the new checks if is pinned
	 */
	public void setIsPinned(Boolean isPinned) {
		
		this.isPinned = isPinned;
		
	}
	
	/**
	 * With is pinned.
	 *
	 * @param isPinned the is pinned
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsPinned(Boolean isPinned) {
		
		this.isPinned = isPinned;
		return this;
		
	}
	
	/**
	 * Gets the game version.
	 *
	 * @return the game version
	 */
	public String getGameVersion() {
		
		return gameVersion;
		
	}
	
	/**
	 * Sets the game version.
	 *
	 * @param gameVersion the new game version
	 */
	public void setGameVersion(String gameVersion) {
		
		this.gameVersion = gameVersion;
		
	}
	
	/**
	 * With game version.
	 *
	 * @param gameVersion the game version
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withGameVersion(String gameVersion) {
		
		this.gameVersion = gameVersion;
		return this;
		
	}
	
	/**
	 * Gets the preference alternate file.
	 *
	 * @return the preference alternate file
	 */
	public Boolean getPreferenceAlternateFile() {
		
		return preferenceAlternateFile;
		
	}
	
	/**
	 * Sets the preference alternate file.
	 *
	 * @param preferenceAlternateFile the new preference alternate file
	 */
	public void setPreferenceAlternateFile(Boolean preferenceAlternateFile) {
		
		this.preferenceAlternateFile = preferenceAlternateFile;
		
	}
	
	/**
	 * With preference alternate file.
	 *
	 * @param preferenceAlternateFile the preference alternate file
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceAlternateFile(Boolean preferenceAlternateFile) {
		
		this.preferenceAlternateFile = preferenceAlternateFile;
		return this;
		
	}
	
	/**
	 * Gets the preference auto install updates.
	 *
	 * @return the preference auto install updates
	 */
	public Boolean getPreferenceAutoInstallUpdates() {
		
		return preferenceAutoInstallUpdates;
		
	}
	
	/**
	 * Sets the preference auto install updates.
	 *
	 * @param preferenceAutoInstallUpdates the new preference auto install updates
	 */
	public void setPreferenceAutoInstallUpdates(Boolean preferenceAutoInstallUpdates) {
		
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
		
	}
	
	/**
	 * With preference auto install updates.
	 *
	 * @param preferenceAutoInstallUpdates the preference auto install updates
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceAutoInstallUpdates(Boolean preferenceAutoInstallUpdates) {
		
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
		return this;
		
	}
	
	/**
	 * Gets the preference quick delete libraries.
	 *
	 * @return the preference quick delete libraries
	 */
	public Boolean getPreferenceQuickDeleteLibraries() {
		
		return preferenceQuickDeleteLibraries;
		
	}
	
	/**
	 * Sets the preference quick delete libraries.
	 *
	 * @param preferenceQuickDeleteLibraries the new preference quick delete
	 *                                       libraries
	 */
	public void setPreferenceQuickDeleteLibraries(Boolean preferenceQuickDeleteLibraries) {
		
		this.preferenceQuickDeleteLibraries = preferenceQuickDeleteLibraries;
		
	}
	
	/**
	 * With preference quick delete libraries.
	 *
	 * @param preferenceQuickDeleteLibraries the preference quick delete libraries
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceQuickDeleteLibraries(Boolean preferenceQuickDeleteLibraries) {
		
		this.preferenceQuickDeleteLibraries = preferenceQuickDeleteLibraries;
		return this;
		
	}
	
	/**
	 * Gets the preference delete saved variables.
	 *
	 * @return the preference delete saved variables
	 */
	public Boolean getPreferenceDeleteSavedVariables() {
		
		return preferenceDeleteSavedVariables;
		
	}
	
	/**
	 * Sets the preference delete saved variables.
	 *
	 * @param preferenceDeleteSavedVariables the new preference delete saved
	 *                                       variables
	 */
	public void setPreferenceDeleteSavedVariables(Boolean preferenceDeleteSavedVariables) {
		
		this.preferenceDeleteSavedVariables = preferenceDeleteSavedVariables;
		
	}
	
	/**
	 * With preference delete saved variables.
	 *
	 * @param preferenceDeleteSavedVariables the preference delete saved variables
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceDeleteSavedVariables(Boolean preferenceDeleteSavedVariables) {
		
		this.preferenceDeleteSavedVariables = preferenceDeleteSavedVariables;
		return this;
		
	}
	
	/**
	 * Gets the preference process file commands.
	 *
	 * @return the preference process file commands
	 */
	public Boolean getPreferenceProcessFileCommands() {
		
		return preferenceProcessFileCommands;
		
	}
	
	/**
	 * Sets the preference process file commands.
	 *
	 * @param preferenceProcessFileCommands the new preference process file commands
	 */
	public void setPreferenceProcessFileCommands(Boolean preferenceProcessFileCommands) {
		
		this.preferenceProcessFileCommands = preferenceProcessFileCommands;
		
	}
	
	/**
	 * With preference process file commands.
	 *
	 * @param preferenceProcessFileCommands the preference process file commands
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceProcessFileCommands(Boolean preferenceProcessFileCommands) {
		
		this.preferenceProcessFileCommands = preferenceProcessFileCommands;
		return this;
		
	}
	
	/**
	 * Gets the preference release type.
	 *
	 * @return the preference release type
	 */
	public Integer getPreferenceReleaseType() {
		
		return preferenceReleaseType;
		
	}
	
	/**
	 * Sets the preference release type.
	 *
	 * @param preferenceReleaseType the new preference release type
	 */
	public void setPreferenceReleaseType(Integer preferenceReleaseType) {
		
		this.preferenceReleaseType = preferenceReleaseType;
		
	}
	
	/**
	 * With preference release type.
	 *
	 * @param preferenceReleaseType the preference release type
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceReleaseType(Integer preferenceReleaseType) {
		
		this.preferenceReleaseType = preferenceReleaseType;
		return this;
		
	}
	
	/**
	 * Gets the sync profile.
	 *
	 * @return the sync profile
	 */
	public SyncProfile getSyncProfile() {
		
		return syncProfile;
		
	}
	
	/**
	 * Sets the sync profile.
	 *
	 * @param syncProfile the new sync profile
	 */
	public void setSyncProfile(SyncProfile syncProfile) {
		
		this.syncProfile = syncProfile;
		
	}
	
	/**
	 * With sync profile.
	 *
	 * @param syncProfile the sync profile
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withSyncProfile(SyncProfile syncProfile) {
		
		this.syncProfile = syncProfile;
		return this;
		
	}
	
	/**
	 * Gets the preference show add on info.
	 *
	 * @return the preference show add on info
	 */
	public Boolean getPreferenceShowAddOnInfo() {
		
		return preferenceShowAddOnInfo;
		
	}
	
	/**
	 * Sets the preference show add on info.
	 *
	 * @param preferenceShowAddOnInfo the new preference show add on info
	 */
	public void setPreferenceShowAddOnInfo(Boolean preferenceShowAddOnInfo) {
		
		this.preferenceShowAddOnInfo = preferenceShowAddOnInfo;
		
	}
	
	/**
	 * With preference show add on info.
	 *
	 * @param preferenceShowAddOnInfo the preference show add on info
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceShowAddOnInfo(Boolean preferenceShowAddOnInfo) {
		
		this.preferenceShowAddOnInfo = preferenceShowAddOnInfo;
		return this;
		
	}
	
	/**
	 * Gets the install date.
	 *
	 * @return the install date
	 */
	public String getInstallDate() {
		
		return installDate;
		
	}
	
	/**
	 * Sets the install date.
	 *
	 * @param installDate the new install date
	 */
	public void setInstallDate(String installDate) {
		
		this.installDate = installDate;
		
	}
	
	/**
	 * With install date.
	 *
	 * @param installDate the install date
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withInstallDate(String installDate) {
		
		this.installDate = installDate;
		return this;
		
	}
	
	/**
	 * Gets the installed addons.
	 *
	 * @return the installed addons
	 */
	public List<InstalledAddon> getInstalledAddons() {
		
		return installedAddons;
		
	}
	
	/**
	 * Sets the installed addons.
	 *
	 * @param installedAddons the new installed addons
	 */
	public void setInstalledAddons(List<InstalledAddon> installedAddons) {
		
		this.installedAddons = installedAddons;
		
	}
	
	/**
	 * With installed addons.
	 *
	 * @param installedAddons the installed addons
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withInstalledAddons(List<InstalledAddon> installedAddons) {
		
		this.installedAddons = installedAddons;
		return this;
		
	}
	
	/**
	 * Gets the checks if is migrated.
	 *
	 * @return the checks if is migrated
	 */
	public Boolean getIsMigrated() {
		
		return isMigrated;
		
	}
	
	/**
	 * Sets the checks if is migrated.
	 *
	 * @param isMigrated the new checks if is migrated
	 */
	public void setIsMigrated(Boolean isMigrated) {
		
		this.isMigrated = isMigrated;
		
	}
	
	/**
	 * With is migrated.
	 *
	 * @param isMigrated the is migrated
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withIsMigrated(Boolean isMigrated) {
		
		this.isMigrated = isMigrated;
		return this;
		
	}
	
	/**
	 * Gets the preference upload profile.
	 *
	 * @return the preference upload profile
	 */
	public Boolean getPreferenceUploadProfile() {
		
		return preferenceUploadProfile;
		
	}
	
	/**
	 * Sets the preference upload profile.
	 *
	 * @param preferenceUploadProfile the new preference upload profile
	 */
	public void setPreferenceUploadProfile(Boolean preferenceUploadProfile) {
		
		this.preferenceUploadProfile = preferenceUploadProfile;
		
	}
	
	/**
	 * With preference upload profile.
	 *
	 * @param preferenceUploadProfile the preference upload profile
	 * @return the minecraft instance file
	 */
	public MinecraftInstanceFile withPreferenceUploadProfile(Boolean preferenceUploadProfile) {
		
		this.preferenceUploadProfile = preferenceUploadProfile;
		return this;
		
	}
	
}
