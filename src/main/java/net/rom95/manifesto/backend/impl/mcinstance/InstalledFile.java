
package net.rom95.manifesto.backend.impl.mcinstance;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class InstalledFile {
	
	@SerializedName("id")
	private Integer id;
	
	@SerializedName("displayName")
	private String displayName;
	
	@SerializedName("fileName")
	private String fileName;
	
	@SerializedName("fileDate")
	private String fileDate;
	
	@SerializedName("fileLength")
	private Integer fileLength;
	
	@SerializedName("releaseType")
	private Integer releaseType;
	
	@SerializedName("fileStatus")
	private Integer fileStatus;
	
	@SerializedName("downloadUrl")
	private String downloadUrl;
	
	@SerializedName("isAlternate")
	private Boolean isAlternate;
	
	@SerializedName("alternateFileId")
	private Integer alternateFileId;
	
	@SerializedName("dependencies")
	private List<Dependency> dependencies = null;
	
	@SerializedName("isAvailable")
	private Boolean isAvailable;
	
	@SerializedName("modules")
	private List<Module> modules = null;
	
	@SerializedName("packageFingerprint")
	private Long packageFingerprint;
	
	@SerializedName("gameVersion")
	private List<String> gameVersion = null;
	
	@SerializedName("hasInstallScript")
	private Boolean hasInstallScript;
	
	@SerializedName("isCompatibleWithClient")
	private Boolean isCompatibleWithClient;
	
	@SerializedName("categorySectionPackageType")
	private Integer categorySectionPackageType;
	
	@SerializedName("restrictProjectFileAccess")
	private Integer restrictProjectFileAccess;
	
	@SerializedName("projectStatus")
	private Integer projectStatus;
	
	@SerializedName("projectId")
	private Integer projectId;
	
	@SerializedName("gameVersionDateReleased")
	private String gameVersionDateReleased;
	
	@SerializedName("gameId")
	private Integer gameId;
	
	@SerializedName("isServerPack")
	private Boolean isServerPack;
	
	@SerializedName("FileNameOnDisk")
	private String fileNameOnDisk;
	
	/**
	 * Instantiates a new installed file.
	 */
	public InstalledFile() {
	
	}
	
	/**
	 * Instantiates a new installed file.
	 *
	 * @param id                         the id
	 * @param displayName                the display name
	 * @param fileName                   the file name
	 * @param fileDate                   the file date
	 * @param fileLength                 the file length
	 * @param releaseType                the release type
	 * @param fileStatus                 the file status
	 * @param downloadUrl                the download url
	 * @param isAlternate                the is alternate
	 * @param alternateFileId            the alternate file id
	 * @param dependencies               the dependencies
	 * @param isAvailable                the is available
	 * @param modules                    the modules
	 * @param packageFingerprint         the package fingerprint
	 * @param gameVersion                the game version
	 * @param hasInstallScript           the has install script
	 * @param isCompatibleWithClient     the is compatible with client
	 * @param categorySectionPackageType the category section package type
	 * @param restrictProjectFileAccess  the restrict project file access
	 * @param projectStatus              the project status
	 * @param projectId                  the project id
	 * @param gameVersionDateReleased    the game version date released
	 * @param gameId                     the game id
	 * @param isServerPack               the is server pack
	 * @param fileNameOnDisk             the file name on disk
	 */
	public InstalledFile(Integer id, String displayName, String fileName, String fileDate, Integer fileLength,
			Integer releaseType, Integer fileStatus, String downloadUrl, Boolean isAlternate, Integer alternateFileId,
			List<Dependency> dependencies, Boolean isAvailable, List<Module> modules, Long packageFingerprint,
			List<String> gameVersion, Boolean hasInstallScript, Boolean isCompatibleWithClient,
			Integer categorySectionPackageType, Integer restrictProjectFileAccess, Integer projectStatus,
			Integer projectId, String gameVersionDateReleased, Integer gameId, Boolean isServerPack,
			String fileNameOnDisk) {
		
		super();
		this.id = id;
		this.displayName = displayName;
		this.fileName = fileName;
		this.fileDate = fileDate;
		this.fileLength = fileLength;
		this.releaseType = releaseType;
		this.fileStatus = fileStatus;
		this.downloadUrl = downloadUrl;
		this.isAlternate = isAlternate;
		this.alternateFileId = alternateFileId;
		this.dependencies = dependencies;
		this.isAvailable = isAvailable;
		this.modules = modules;
		this.packageFingerprint = packageFingerprint;
		this.gameVersion = gameVersion;
		this.hasInstallScript = hasInstallScript;
		this.isCompatibleWithClient = isCompatibleWithClient;
		this.categorySectionPackageType = categorySectionPackageType;
		this.restrictProjectFileAccess = restrictProjectFileAccess;
		this.projectStatus = projectStatus;
		this.projectId = projectId;
		this.gameVersionDateReleased = gameVersionDateReleased;
		this.gameId = gameId;
		this.isServerPack = isServerPack;
		this.fileNameOnDisk = fileNameOnDisk;
		
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
	 * @return the installed file
	 */
	public InstalledFile withId(Integer id) {
		
		this.id = id;
		return this;
		
	}
	
	/**
	 * Gets the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		
		return displayName;
		
	}
	
	/**
	 * Sets the display name.
	 *
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		
		this.displayName = displayName;
		
	}
	
	/**
	 * With display name.
	 *
	 * @param displayName the display name
	 * @return the installed file
	 */
	public InstalledFile withDisplayName(String displayName) {
		
		this.displayName = displayName;
		return this;
		
	}
	
	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		
		return fileName;
		
	}
	
	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		
		this.fileName = fileName;
		
	}
	
	/**
	 * With file name.
	 *
	 * @param fileName the file name
	 * @return the installed file
	 */
	public InstalledFile withFileName(String fileName) {
		
		this.fileName = fileName;
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
	 * @return the installed file
	 */
	public InstalledFile withFileDate(String fileDate) {
		
		this.fileDate = fileDate;
		return this;
		
	}
	
	/**
	 * Gets the file length.
	 *
	 * @return the file length
	 */
	public Integer getFileLength() {
		
		return fileLength;
		
	}
	
	/**
	 * Sets the file length.
	 *
	 * @param fileLength the new file length
	 */
	public void setFileLength(Integer fileLength) {
		
		this.fileLength = fileLength;
		
	}
	
	/**
	 * With file length.
	 *
	 * @param fileLength the file length
	 * @return the installed file
	 */
	public InstalledFile withFileLength(Integer fileLength) {
		
		this.fileLength = fileLength;
		return this;
		
	}
	
	/**
	 * Gets the release type.
	 *
	 * @return the release type
	 */
	public Integer getReleaseType() {
		
		return releaseType;
		
	}
	
	/**
	 * Sets the release type.
	 *
	 * @param releaseType the new release type
	 */
	public void setReleaseType(Integer releaseType) {
		
		this.releaseType = releaseType;
		
	}
	
	/**
	 * With release type.
	 *
	 * @param releaseType the release type
	 * @return the installed file
	 */
	public InstalledFile withReleaseType(Integer releaseType) {
		
		this.releaseType = releaseType;
		return this;
		
	}
	
	/**
	 * Gets the file status.
	 *
	 * @return the file status
	 */
	public Integer getFileStatus() {
		
		return fileStatus;
		
	}
	
	/**
	 * Sets the file status.
	 *
	 * @param fileStatus the new file status
	 */
	public void setFileStatus(Integer fileStatus) {
		
		this.fileStatus = fileStatus;
		
	}
	
	/**
	 * With file status.
	 *
	 * @param fileStatus the file status
	 * @return the installed file
	 */
	public InstalledFile withFileStatus(Integer fileStatus) {
		
		this.fileStatus = fileStatus;
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
	 * @return the installed file
	 */
	public InstalledFile withDownloadUrl(String downloadUrl) {
		
		this.downloadUrl = downloadUrl;
		return this;
		
	}
	
	/**
	 * Gets the checks if is alternate.
	 *
	 * @return the checks if is alternate
	 */
	public Boolean getIsAlternate() {
		
		return isAlternate;
		
	}
	
	/**
	 * Sets the checks if is alternate.
	 *
	 * @param isAlternate the new checks if is alternate
	 */
	public void setIsAlternate(Boolean isAlternate) {
		
		this.isAlternate = isAlternate;
		
	}
	
	/**
	 * With is alternate.
	 *
	 * @param isAlternate the is alternate
	 * @return the installed file
	 */
	public InstalledFile withIsAlternate(Boolean isAlternate) {
		
		this.isAlternate = isAlternate;
		return this;
		
	}
	
	/**
	 * Gets the alternate file id.
	 *
	 * @return the alternate file id
	 */
	public Integer getAlternateFileId() {
		
		return alternateFileId;
		
	}
	
	/**
	 * Sets the alternate file id.
	 *
	 * @param alternateFileId the new alternate file id
	 */
	public void setAlternateFileId(Integer alternateFileId) {
		
		this.alternateFileId = alternateFileId;
		
	}
	
	/**
	 * With alternate file id.
	 *
	 * @param alternateFileId the alternate file id
	 * @return the installed file
	 */
	public InstalledFile withAlternateFileId(Integer alternateFileId) {
		
		this.alternateFileId = alternateFileId;
		return this;
		
	}
	
	/**
	 * Gets the dependencies.
	 *
	 * @return the dependencies
	 */
	public List<Dependency> getDependencies() {
		
		return dependencies;
		
	}
	
	/**
	 * Sets the dependencies.
	 *
	 * @param dependencies the new dependencies
	 */
	public void setDependencies(List<Dependency> dependencies) {
		
		this.dependencies = dependencies;
		
	}
	
	/**
	 * With dependencies.
	 *
	 * @param dependencies the dependencies
	 * @return the installed file
	 */
	public InstalledFile withDependencies(List<Dependency> dependencies) {
		
		this.dependencies = dependencies;
		return this;
		
	}
	
	/**
	 * Gets the checks if is available.
	 *
	 * @return the checks if is available
	 */
	public Boolean getIsAvailable() {
		
		return isAvailable;
		
	}
	
	/**
	 * Sets the checks if is available.
	 *
	 * @param isAvailable the new checks if is available
	 */
	public void setIsAvailable(Boolean isAvailable) {
		
		this.isAvailable = isAvailable;
		
	}
	
	/**
	 * With is available.
	 *
	 * @param isAvailable the is available
	 * @return the installed file
	 */
	public InstalledFile withIsAvailable(Boolean isAvailable) {
		
		this.isAvailable = isAvailable;
		return this;
		
	}
	
	/**
	 * Gets the modules.
	 *
	 * @return the modules
	 */
	public List<Module> getModules() {
		
		return modules;
		
	}
	
	/**
	 * Sets the modules.
	 *
	 * @param modules the new modules
	 */
	public void setModules(List<Module> modules) {
		
		this.modules = modules;
		
	}
	
	/**
	 * With modules.
	 *
	 * @param modules the modules
	 * @return the installed file
	 */
	public InstalledFile withModules(List<Module> modules) {
		
		this.modules = modules;
		return this;
		
	}
	
	/**
	 * Gets the package fingerprint.
	 *
	 * @return the package fingerprint
	 */
	public Long getPackageFingerprint() {
		
		return packageFingerprint;
		
	}
	
	/**
	 * Sets the package fingerprint.
	 *
	 * @param packageFingerprint the new package fingerprint
	 */
	public void setPackageFingerprint(Long packageFingerprint) {
		
		this.packageFingerprint = packageFingerprint;
		
	}
	
	/**
	 * With package fingerprint.
	 *
	 * @param packageFingerprint the package fingerprint
	 * @return the installed file
	 */
	public InstalledFile withPackageFingerprint(Long packageFingerprint) {
		
		this.packageFingerprint = packageFingerprint;
		return this;
		
	}
	
	/**
	 * Gets the game version.
	 *
	 * @return the game version
	 */
	public List<String> getGameVersion() {
		
		return gameVersion;
		
	}
	
	/**
	 * Sets the game version.
	 *
	 * @param gameVersion the new game version
	 */
	public void setGameVersion(List<String> gameVersion) {
		
		this.gameVersion = gameVersion;
		
	}
	
	/**
	 * With game version.
	 *
	 * @param gameVersion the game version
	 * @return the installed file
	 */
	public InstalledFile withGameVersion(List<String> gameVersion) {
		
		this.gameVersion = gameVersion;
		return this;
		
	}
	
	/**
	 * Gets the checks for install script.
	 *
	 * @return the checks for install script
	 */
	public Boolean getHasInstallScript() {
		
		return hasInstallScript;
		
	}
	
	/**
	 * Sets the checks for install script.
	 *
	 * @param hasInstallScript the new checks for install script
	 */
	public void setHasInstallScript(Boolean hasInstallScript) {
		
		this.hasInstallScript = hasInstallScript;
		
	}
	
	/**
	 * With has install script.
	 *
	 * @param hasInstallScript the has install script
	 * @return the installed file
	 */
	public InstalledFile withHasInstallScript(Boolean hasInstallScript) {
		
		this.hasInstallScript = hasInstallScript;
		return this;
		
	}
	
	/**
	 * Gets the checks if is compatible with client.
	 *
	 * @return the checks if is compatible with client
	 */
	public Boolean getIsCompatibleWithClient() {
		
		return isCompatibleWithClient;
		
	}
	
	/**
	 * Sets the checks if is compatible with client.
	 *
	 * @param isCompatibleWithClient the new checks if is compatible with client
	 */
	public void setIsCompatibleWithClient(Boolean isCompatibleWithClient) {
		
		this.isCompatibleWithClient = isCompatibleWithClient;
		
	}
	
	/**
	 * With is compatible with client.
	 *
	 * @param isCompatibleWithClient the is compatible with client
	 * @return the installed file
	 */
	public InstalledFile withIsCompatibleWithClient(Boolean isCompatibleWithClient) {
		
		this.isCompatibleWithClient = isCompatibleWithClient;
		return this;
		
	}
	
	/**
	 * Gets the category section package type.
	 *
	 * @return the category section package type
	 */
	public Integer getCategorySectionPackageType() {
		
		return categorySectionPackageType;
		
	}
	
	/**
	 * Sets the category section package type.
	 *
	 * @param categorySectionPackageType the new category section package type
	 */
	public void setCategorySectionPackageType(Integer categorySectionPackageType) {
		
		this.categorySectionPackageType = categorySectionPackageType;
		
	}
	
	/**
	 * With category section package type.
	 *
	 * @param categorySectionPackageType the category section package type
	 * @return the installed file
	 */
	public InstalledFile withCategorySectionPackageType(Integer categorySectionPackageType) {
		
		this.categorySectionPackageType = categorySectionPackageType;
		return this;
		
	}
	
	/**
	 * Gets the restrict project file access.
	 *
	 * @return the restrict project file access
	 */
	public Integer getRestrictProjectFileAccess() {
		
		return restrictProjectFileAccess;
		
	}
	
	/**
	 * Sets the restrict project file access.
	 *
	 * @param restrictProjectFileAccess the new restrict project file access
	 */
	public void setRestrictProjectFileAccess(Integer restrictProjectFileAccess) {
		
		this.restrictProjectFileAccess = restrictProjectFileAccess;
		
	}
	
	/**
	 * With restrict project file access.
	 *
	 * @param restrictProjectFileAccess the restrict project file access
	 * @return the installed file
	 */
	public InstalledFile withRestrictProjectFileAccess(Integer restrictProjectFileAccess) {
		
		this.restrictProjectFileAccess = restrictProjectFileAccess;
		return this;
		
	}
	
	/**
	 * Gets the project status.
	 *
	 * @return the project status
	 */
	public Integer getProjectStatus() {
		
		return projectStatus;
		
	}
	
	/**
	 * Sets the project status.
	 *
	 * @param projectStatus the new project status
	 */
	public void setProjectStatus(Integer projectStatus) {
		
		this.projectStatus = projectStatus;
		
	}
	
	/**
	 * With project status.
	 *
	 * @param projectStatus the project status
	 * @return the installed file
	 */
	public InstalledFile withProjectStatus(Integer projectStatus) {
		
		this.projectStatus = projectStatus;
		return this;
		
	}
	
	/**
	 * Gets the project id.
	 *
	 * @return the project id
	 */
	public Integer getProjectId() {
		
		return projectId;
		
	}
	
	/**
	 * Sets the project id.
	 *
	 * @param projectId the new project id
	 */
	public void setProjectId(Integer projectId) {
		
		this.projectId = projectId;
		
	}
	
	/**
	 * With project id.
	 *
	 * @param projectId the project id
	 * @return the installed file
	 */
	public InstalledFile withProjectId(Integer projectId) {
		
		this.projectId = projectId;
		return this;
		
	}
	
	/**
	 * Gets the game version date released.
	 *
	 * @return the game version date released
	 */
	public String getGameVersionDateReleased() {
		
		return gameVersionDateReleased;
		
	}
	
	/**
	 * Sets the game version date released.
	 *
	 * @param gameVersionDateReleased the new game version date released
	 */
	public void setGameVersionDateReleased(String gameVersionDateReleased) {
		
		this.gameVersionDateReleased = gameVersionDateReleased;
		
	}
	
	/**
	 * With game version date released.
	 *
	 * @param gameVersionDateReleased the game version date released
	 * @return the installed file
	 */
	public InstalledFile withGameVersionDateReleased(String gameVersionDateReleased) {
		
		this.gameVersionDateReleased = gameVersionDateReleased;
		return this;
		
	}
	
	/**
	 * Gets the game id.
	 *
	 * @return the game id
	 */
	public Integer getGameId() {
		
		return gameId;
		
	}
	
	/**
	 * Sets the game id.
	 *
	 * @param gameId the new game id
	 */
	public void setGameId(Integer gameId) {
		
		this.gameId = gameId;
		
	}
	
	/**
	 * With game id.
	 *
	 * @param gameId the game id
	 * @return the installed file
	 */
	public InstalledFile withGameId(Integer gameId) {
		
		this.gameId = gameId;
		return this;
		
	}
	
	/**
	 * Gets the checks if is server pack.
	 *
	 * @return the checks if is server pack
	 */
	public Boolean getIsServerPack() {
		
		return isServerPack;
		
	}
	
	/**
	 * Sets the checks if is server pack.
	 *
	 * @param isServerPack the new checks if is server pack
	 */
	public void setIsServerPack(Boolean isServerPack) {
		
		this.isServerPack = isServerPack;
		
	}
	
	/**
	 * With is server pack.
	 *
	 * @param isServerPack the is server pack
	 * @return the installed file
	 */
	public InstalledFile withIsServerPack(Boolean isServerPack) {
		
		this.isServerPack = isServerPack;
		return this;
		
	}
	
	/**
	 * Gets the file name on disk.
	 *
	 * @return the file name on disk
	 */
	public String getFileNameOnDisk() {
		
		return fileNameOnDisk;
		
	}
	
	/**
	 * Sets the file name on disk.
	 *
	 * @param fileNameOnDisk the new file name on disk
	 */
	public void setFileNameOnDisk(String fileNameOnDisk) {
		
		this.fileNameOnDisk = fileNameOnDisk;
		
	}
	
	/**
	 * With file name on disk.
	 *
	 * @param fileNameOnDisk the file name on disk
	 * @return the installed file
	 */
	public InstalledFile withFileNameOnDisk(String fileNameOnDisk) {
		
		this.fileNameOnDisk = fileNameOnDisk;
		return this;
		
	}
	
}
