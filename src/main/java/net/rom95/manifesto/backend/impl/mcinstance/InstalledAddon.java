
package net.rom95.manifesto.backend.impl.mcinstance;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class InstalledAddon {

	@SerializedName("addonID")
	private Integer addonID;
	
	@SerializedName("gameInstanceID")
	private String gameInstanceID;
	
	@SerializedName("installedFile")
	private InstalledFile installedFile;
	
	@SerializedName("dateInstalled")
	private String dateInstalled;
	
	@SerializedName("dateUpdated")
	private String dateUpdated;
	
	@SerializedName("dateLastUpdateAttempted")
	private String dateLastUpdateAttempted;
	
	@SerializedName("status")
	private Integer status;
	
	@SerializedName("preferenceAutoInstallUpdates")
	private Object preferenceAutoInstallUpdates;
	
	@SerializedName("preferenceAlternateFile")
	private Boolean preferenceAlternateFile;
	
	@SerializedName("preferenceIsIgnored")
	private Boolean preferenceIsIgnored;
	
	@SerializedName("isModified")
	private Boolean isModified;
	
	@SerializedName("isWorkingCopy")
	private Boolean isWorkingCopy;
	
	@SerializedName("isFuzzyMatch")
	private Boolean isFuzzyMatch;
	
	@SerializedName("preferenceReleaseType")
	private Object preferenceReleaseType;
	
	@SerializedName("manifestName")
	private Object manifestName;
	
	@SerializedName("installedTargets")
	
	private List<Object> installedTargets = null;
	
	/**
	 * Instantiates a new installed addon.
	 */
	public InstalledAddon() {
	
	}
	
	/**
	 * Instantiates a new installed addon.
	 *
	 * @param addonID                      the addon ID
	 * @param gameInstanceID               the game instance ID
	 * @param installedFile                the installed file
	 * @param dateInstalled                the date installed
	 * @param dateUpdated                  the date updated
	 * @param dateLastUpdateAttempted      the date last update attempted
	 * @param status                       the status
	 * @param preferenceAutoInstallUpdates the preference auto install updates
	 * @param preferenceAlternateFile      the preference alternate file
	 * @param preferenceIsIgnored          the preference is ignored
	 * @param isModified                   the is modified
	 * @param isWorkingCopy                the is working copy
	 * @param isFuzzyMatch                 the is fuzzy match
	 * @param preferenceReleaseType        the preference release type
	 * @param manifestName                 the manifest name
	 * @param installedTargets             the installed targets
	 */
	public InstalledAddon(Integer addonID, String gameInstanceID, InstalledFile installedFile, String dateInstalled,
			String dateUpdated, String dateLastUpdateAttempted, Integer status, Object preferenceAutoInstallUpdates,
			Boolean preferenceAlternateFile, Boolean preferenceIsIgnored, Boolean isModified, Boolean isWorkingCopy,
			Boolean isFuzzyMatch, Object preferenceReleaseType, Object manifestName, List<Object> installedTargets) {
		
		super();
		this.addonID = addonID;
		this.gameInstanceID = gameInstanceID;
		this.installedFile = installedFile;
		this.dateInstalled = dateInstalled;
		this.dateUpdated = dateUpdated;
		this.dateLastUpdateAttempted = dateLastUpdateAttempted;
		this.status = status;
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
		this.preferenceAlternateFile = preferenceAlternateFile;
		this.preferenceIsIgnored = preferenceIsIgnored;
		this.isModified = isModified;
		this.isWorkingCopy = isWorkingCopy;
		this.isFuzzyMatch = isFuzzyMatch;
		this.preferenceReleaseType = preferenceReleaseType;
		this.manifestName = manifestName;
		this.installedTargets = installedTargets;
		
	}
	
	/**
	 * Gets the addon ID.
	 *
	 * @return the addon ID
	 */
	public Integer getAddonID() {
		
		return addonID;
		
	}
	
	/**
	 * Sets the addon ID.
	 *
	 * @param addonID the new addon ID
	 */
	public void setAddonID(Integer addonID) {
		
		this.addonID = addonID;
		
	}
	
	/**
	 * With addon ID.
	 *
	 * @param addonID the addon ID
	 * @return the installed addon
	 */
	public InstalledAddon withAddonID(Integer addonID) {
		
		this.addonID = addonID;
		return this;
		
	}
	
	/**
	 * Gets the game instance ID.
	 *
	 * @return the game instance ID
	 */
	public String getGameInstanceID() {
		
		return gameInstanceID;
		
	}
	
	/**
	 * Sets the game instance ID.
	 *
	 * @param gameInstanceID the new game instance ID
	 */
	public void setGameInstanceID(String gameInstanceID) {
		
		this.gameInstanceID = gameInstanceID;
		
	}
	
	/**
	 * With game instance ID.
	 *
	 * @param gameInstanceID the game instance ID
	 * @return the installed addon
	 */
	public InstalledAddon withGameInstanceID(String gameInstanceID) {
		
		this.gameInstanceID = gameInstanceID;
		return this;
		
	}
	
	/**
	 * Gets the installed file.
	 *
	 * @return the installed file
	 */
	public InstalledFile getInstalledFile() {
		
		return installedFile;
		
	}
	
	/**
	 * Sets the installed file.
	 *
	 * @param installedFile the new installed file
	 */
	public void setInstalledFile(InstalledFile installedFile) {
		
		this.installedFile = installedFile;
		
	}
	
	/**
	 * With installed file.
	 *
	 * @param installedFile the installed file
	 * @return the installed addon
	 */
	public InstalledAddon withInstalledFile(InstalledFile installedFile) {
		
		this.installedFile = installedFile;
		return this;
		
	}
	
	/**
	 * Gets the date installed.
	 *
	 * @return the date installed
	 */
	public String getDateInstalled() {
		
		return dateInstalled;
		
	}
	
	/**
	 * Sets the date installed.
	 *
	 * @param dateInstalled the new date installed
	 */
	public void setDateInstalled(String dateInstalled) {
		
		this.dateInstalled = dateInstalled;
		
	}
	
	/**
	 * With date installed.
	 *
	 * @param dateInstalled the date installed
	 * @return the installed addon
	 */
	public InstalledAddon withDateInstalled(String dateInstalled) {
		
		this.dateInstalled = dateInstalled;
		return this;
		
	}
	
	/**
	 * Gets the date updated.
	 *
	 * @return the date updated
	 */
	public String getDateUpdated() {
		
		return dateUpdated;
		
	}
	
	/**
	 * Sets the date updated.
	 *
	 * @param dateUpdated the new date updated
	 */
	public void setDateUpdated(String dateUpdated) {
		
		this.dateUpdated = dateUpdated;
		
	}
	
	/**
	 * With date updated.
	 *
	 * @param dateUpdated the date updated
	 * @return the installed addon
	 */
	public InstalledAddon withDateUpdated(String dateUpdated) {
		
		this.dateUpdated = dateUpdated;
		return this;
		
	}
	
	/**
	 * Gets the date last update attempted.
	 *
	 * @return the date last update attempted
	 */
	public String getDateLastUpdateAttempted() {
		
		return dateLastUpdateAttempted;
		
	}
	
	/**
	 * Sets the date last update attempted.
	 *
	 * @param dateLastUpdateAttempted the new date last update attempted
	 */
	public void setDateLastUpdateAttempted(String dateLastUpdateAttempted) {
		
		this.dateLastUpdateAttempted = dateLastUpdateAttempted;
		
	}
	
	/**
	 * With date last update attempted.
	 *
	 * @param dateLastUpdateAttempted the date last update attempted
	 * @return the installed addon
	 */
	public InstalledAddon withDateLastUpdateAttempted(String dateLastUpdateAttempted) {
		
		this.dateLastUpdateAttempted = dateLastUpdateAttempted;
		return this;
		
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Integer getStatus() {
		
		return status;
		
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Integer status) {
		
		this.status = status;
		
	}
	
	/**
	 * With status.
	 *
	 * @param status the status
	 * @return the installed addon
	 */
	public InstalledAddon withStatus(Integer status) {
		
		this.status = status;
		return this;
		
	}
	
	/**
	 * Gets the preference auto install updates.
	 *
	 * @return the preference auto install updates
	 */
	public Object getPreferenceAutoInstallUpdates() {
		
		return preferenceAutoInstallUpdates;
		
	}
	
	/**
	 * Sets the preference auto install updates.
	 *
	 * @param preferenceAutoInstallUpdates the new preference auto install updates
	 */
	public void setPreferenceAutoInstallUpdates(Object preferenceAutoInstallUpdates) {
		
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
		
	}
	
	/**
	 * With preference auto install updates.
	 *
	 * @param preferenceAutoInstallUpdates the preference auto install updates
	 * @return the installed addon
	 */
	public InstalledAddon withPreferenceAutoInstallUpdates(Object preferenceAutoInstallUpdates) {
		
		this.preferenceAutoInstallUpdates = preferenceAutoInstallUpdates;
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
	 * @return the installed addon
	 */
	public InstalledAddon withPreferenceAlternateFile(Boolean preferenceAlternateFile) {
		
		this.preferenceAlternateFile = preferenceAlternateFile;
		return this;
		
	}
	
	/**
	 * Gets the preference is ignored.
	 *
	 * @return the preference is ignored
	 */
	public Boolean getPreferenceIsIgnored() {
		
		return preferenceIsIgnored;
		
	}
	
	/**
	 * Sets the preference is ignored.
	 *
	 * @param preferenceIsIgnored the new preference is ignored
	 */
	public void setPreferenceIsIgnored(Boolean preferenceIsIgnored) {
		
		this.preferenceIsIgnored = preferenceIsIgnored;
		
	}
	
	/**
	 * With preference is ignored.
	 *
	 * @param preferenceIsIgnored the preference is ignored
	 * @return the installed addon
	 */
	public InstalledAddon withPreferenceIsIgnored(Boolean preferenceIsIgnored) {
		
		this.preferenceIsIgnored = preferenceIsIgnored;
		return this;
		
	}
	
	/**
	 * Gets the checks if is modified.
	 *
	 * @return the checks if is modified
	 */
	public Boolean getIsModified() {
		
		return isModified;
		
	}
	
	/**
	 * Sets the checks if is modified.
	 *
	 * @param isModified the new checks if is modified
	 */
	public void setIsModified(Boolean isModified) {
		
		this.isModified = isModified;
		
	}
	
	/**
	 * With is modified.
	 *
	 * @param isModified the is modified
	 * @return the installed addon
	 */
	public InstalledAddon withIsModified(Boolean isModified) {
		
		this.isModified = isModified;
		return this;
		
	}
	
	/**
	 * Gets the checks if is working copy.
	 *
	 * @return the checks if is working copy
	 */
	public Boolean getIsWorkingCopy() {
		
		return isWorkingCopy;
		
	}
	
	/**
	 * Sets the checks if is working copy.
	 *
	 * @param isWorkingCopy the new checks if is working copy
	 */
	public void setIsWorkingCopy(Boolean isWorkingCopy) {
		
		this.isWorkingCopy = isWorkingCopy;
		
	}
	
	/**
	 * With is working copy.
	 *
	 * @param isWorkingCopy the is working copy
	 * @return the installed addon
	 */
	public InstalledAddon withIsWorkingCopy(Boolean isWorkingCopy) {
		
		this.isWorkingCopy = isWorkingCopy;
		return this;
		
	}
	
	/**
	 * Gets the checks if is fuzzy match.
	 *
	 * @return the checks if is fuzzy match
	 */
	public Boolean getIsFuzzyMatch() {
		
		return isFuzzyMatch;
		
	}
	
	/**
	 * Sets the checks if is fuzzy match.
	 *
	 * @param isFuzzyMatch the new checks if is fuzzy match
	 */
	public void setIsFuzzyMatch(Boolean isFuzzyMatch) {
		
		this.isFuzzyMatch = isFuzzyMatch;
		
	}
	
	/**
	 * With is fuzzy match.
	 *
	 * @param isFuzzyMatch the is fuzzy match
	 * @return the installed addon
	 */
	public InstalledAddon withIsFuzzyMatch(Boolean isFuzzyMatch) {
		
		this.isFuzzyMatch = isFuzzyMatch;
		return this;
		
	}
	
	/**
	 * Gets the preference release type.
	 *
	 * @return the preference release type
	 */
	public Object getPreferenceReleaseType() {
		
		return preferenceReleaseType;
		
	}
	
	/**
	 * Sets the preference release type.
	 *
	 * @param preferenceReleaseType the new preference release type
	 */
	public void setPreferenceReleaseType(Object preferenceReleaseType) {
		
		this.preferenceReleaseType = preferenceReleaseType;
		
	}
	
	/**
	 * With preference release type.
	 *
	 * @param preferenceReleaseType the preference release type
	 * @return the installed addon
	 */
	public InstalledAddon withPreferenceReleaseType(Object preferenceReleaseType) {
		
		this.preferenceReleaseType = preferenceReleaseType;
		return this;
		
	}
	
	/**
	 * Gets the manifest name.
	 *
	 * @return the manifest name
	 */
	public Object getManifestName() {
		
		return manifestName;
		
	}
	
	/**
	 * Sets the manifest name.
	 *
	 * @param manifestName the new manifest name
	 */
	public void setManifestName(Object manifestName) {
		
		this.manifestName = manifestName;
		
	}
	
	/**
	 * With manifest name.
	 *
	 * @param manifestName the manifest name
	 * @return the installed addon
	 */
	public InstalledAddon withManifestName(Object manifestName) {
		
		this.manifestName = manifestName;
		return this;
		
	}
	
	/**
	 * Gets the installed targets.
	 *
	 * @return the installed targets
	 */
	public List<Object> getInstalledTargets() {
		
		return installedTargets;
		
	}
	
	/**
	 * Sets the installed targets.
	 *
	 * @param installedTargets the new installed targets
	 */
	public void setInstalledTargets(List<Object> installedTargets) {
		
		this.installedTargets = installedTargets;
		
	}
	
	/**
	 * With installed targets.
	 *
	 * @param installedTargets the installed targets
	 * @return the installed addon
	 */
	public InstalledAddon withInstalledTargets(List<Object> installedTargets) {
		
		this.installedTargets = installedTargets;
		return this;
		
	}
}
