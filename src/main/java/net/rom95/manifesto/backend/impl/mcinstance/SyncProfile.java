
package net.rom95.manifesto.backend.impl.mcinstance;

import com.google.gson.annotations.SerializedName;

public class SyncProfile {
	
	@SerializedName("PreferenceEnabled")
	private Boolean preferenceEnabled;
	
	@SerializedName("PreferenceAutoSync")
	private Boolean preferenceAutoSync;
	
	@SerializedName("PreferenceAutoDelete")
	private Boolean preferenceAutoDelete;
	
	@SerializedName("PreferenceBackupSavedVariables")
	private Boolean preferenceBackupSavedVariables;
	
	@SerializedName("GameInstanceGuid")
	private String gameInstanceGuid;
	
	@SerializedName("SyncProfileID")
	private Integer syncProfileID;
	
	@SerializedName("SavedVariablesProfile")
	private Object savedVariablesProfile;
	
	@SerializedName("LastSyncDate")
	private String lastSyncDate;
	
	/**
	 * Instantiates a new sync profile.
	 */
	public SyncProfile() {
	
	}
	
	/**
	 * Instantiates a new sync profile.
	 *
	 * @param preferenceEnabled              the preference enabled
	 * @param preferenceAutoSync             the preference auto sync
	 * @param preferenceAutoDelete           the preference auto delete
	 * @param preferenceBackupSavedVariables the preference backup saved variables
	 * @param gameInstanceGuid               the game instance guid
	 * @param syncProfileID                  the sync profile ID
	 * @param savedVariablesProfile          the saved variables profile
	 * @param lastSyncDate                   the last sync date
	 */
	public SyncProfile(Boolean preferenceEnabled, Boolean preferenceAutoSync, Boolean preferenceAutoDelete,
			Boolean preferenceBackupSavedVariables, String gameInstanceGuid, Integer syncProfileID,
			Object savedVariablesProfile, String lastSyncDate) {
		
		super();
		this.preferenceEnabled = preferenceEnabled;
		this.preferenceAutoSync = preferenceAutoSync;
		this.preferenceAutoDelete = preferenceAutoDelete;
		this.preferenceBackupSavedVariables = preferenceBackupSavedVariables;
		this.gameInstanceGuid = gameInstanceGuid;
		this.syncProfileID = syncProfileID;
		this.savedVariablesProfile = savedVariablesProfile;
		this.lastSyncDate = lastSyncDate;
		
	}
	
	/**
	 * Gets the preference enabled.
	 *
	 * @return the preference enabled
	 */
	public Boolean getPreferenceEnabled() {
		
		return preferenceEnabled;
		
	}
	
	/**
	 * Sets the preference enabled.
	 *
	 * @param preferenceEnabled the new preference enabled
	 */
	public void setPreferenceEnabled(Boolean preferenceEnabled) {
		
		this.preferenceEnabled = preferenceEnabled;
		
	}
	
	/**
	 * With preference enabled.
	 *
	 * @param preferenceEnabled the preference enabled
	 * @return the sync profile
	 */
	public SyncProfile withPreferenceEnabled(Boolean preferenceEnabled) {
		
		this.preferenceEnabled = preferenceEnabled;
		return this;
		
	}
	
	/**
	 * Gets the preference auto sync.
	 *
	 * @return the preference auto sync
	 */
	public Boolean getPreferenceAutoSync() {
		
		return preferenceAutoSync;
		
	}
	
	/**
	 * Sets the preference auto sync.
	 *
	 * @param preferenceAutoSync the new preference auto sync
	 */
	public void setPreferenceAutoSync(Boolean preferenceAutoSync) {
		
		this.preferenceAutoSync = preferenceAutoSync;
		
	}
	
	/**
	 * With preference auto sync.
	 *
	 * @param preferenceAutoSync the preference auto sync
	 * @return the sync profile
	 */
	public SyncProfile withPreferenceAutoSync(Boolean preferenceAutoSync) {
		
		this.preferenceAutoSync = preferenceAutoSync;
		return this;
		
	}
	
	/**
	 * Gets the preference auto delete.
	 *
	 * @return the preference auto delete
	 */
	public Boolean getPreferenceAutoDelete() {
		
		return preferenceAutoDelete;
		
	}
	
	/**
	 * Sets the preference auto delete.
	 *
	 * @param preferenceAutoDelete the new preference auto delete
	 */
	public void setPreferenceAutoDelete(Boolean preferenceAutoDelete) {
		
		this.preferenceAutoDelete = preferenceAutoDelete;
		
	}
	
	/**
	 * With preference auto delete.
	 *
	 * @param preferenceAutoDelete the preference auto delete
	 * @return the sync profile
	 */
	public SyncProfile withPreferenceAutoDelete(Boolean preferenceAutoDelete) {
		
		this.preferenceAutoDelete = preferenceAutoDelete;
		return this;
		
	}
	
	/**
	 * Gets the preference backup saved variables.
	 *
	 * @return the preference backup saved variables
	 */
	public Boolean getPreferenceBackupSavedVariables() {
		
		return preferenceBackupSavedVariables;
		
	}
	
	/**
	 * Sets the preference backup saved variables.
	 *
	 * @param preferenceBackupSavedVariables the new preference backup saved
	 *                                       variables
	 */
	public void setPreferenceBackupSavedVariables(Boolean preferenceBackupSavedVariables) {
		
		this.preferenceBackupSavedVariables = preferenceBackupSavedVariables;
		
	}
	
	/**
	 * With preference backup saved variables.
	 *
	 * @param preferenceBackupSavedVariables the preference backup saved variables
	 * @return the sync profile
	 */
	public SyncProfile withPreferenceBackupSavedVariables(Boolean preferenceBackupSavedVariables) {
		
		this.preferenceBackupSavedVariables = preferenceBackupSavedVariables;
		return this;
		
	}
	
	/**
	 * Gets the game instance guid.
	 *
	 * @return the game instance guid
	 */
	public String getGameInstanceGuid() {
		
		return gameInstanceGuid;
		
	}
	
	/**
	 * Sets the game instance guid.
	 *
	 * @param gameInstanceGuid the new game instance guid
	 */
	public void setGameInstanceGuid(String gameInstanceGuid) {
		
		this.gameInstanceGuid = gameInstanceGuid;
		
	}
	
	/**
	 * With game instance guid.
	 *
	 * @param gameInstanceGuid the game instance guid
	 * @return the sync profile
	 */
	public SyncProfile withGameInstanceGuid(String gameInstanceGuid) {
		
		this.gameInstanceGuid = gameInstanceGuid;
		return this;
		
	}
	
	/**
	 * Gets the sync profile ID.
	 *
	 * @return the sync profile ID
	 */
	public Integer getSyncProfileID() {
		
		return syncProfileID;
		
	}
	
	/**
	 * Sets the sync profile ID.
	 *
	 * @param syncProfileID the new sync profile ID
	 */
	public void setSyncProfileID(Integer syncProfileID) {
		
		this.syncProfileID = syncProfileID;
		
	}
	
	/**
	 * With sync profile ID.
	 *
	 * @param syncProfileID the sync profile ID
	 * @return the sync profile
	 */
	public SyncProfile withSyncProfileID(Integer syncProfileID) {
		
		this.syncProfileID = syncProfileID;
		return this;
		
	}
	
	/**
	 * Gets the saved variables profile.
	 *
	 * @return the saved variables profile
	 */
	public Object getSavedVariablesProfile() {
		
		return savedVariablesProfile;
		
	}
	
	/**
	 * Sets the saved variables profile.
	 *
	 * @param savedVariablesProfile the new saved variables profile
	 */
	public void setSavedVariablesProfile(Object savedVariablesProfile) {
		
		this.savedVariablesProfile = savedVariablesProfile;
		
	}
	
	/**
	 * With saved variables profile.
	 *
	 * @param savedVariablesProfile the saved variables profile
	 * @return the sync profile
	 */
	public SyncProfile withSavedVariablesProfile(Object savedVariablesProfile) {
		
		this.savedVariablesProfile = savedVariablesProfile;
		return this;
		
	}
	
	/**
	 * Gets the last sync date.
	 *
	 * @return the last sync date
	 */
	public String getLastSyncDate() {
		
		return lastSyncDate;
		
	}
	
	/**
	 * Sets the last sync date.
	 *
	 * @param lastSyncDate the new last sync date
	 */
	public void setLastSyncDate(String lastSyncDate) {
		
		this.lastSyncDate = lastSyncDate;
		
	}
	
	/**
	 * With last sync date.
	 *
	 * @param lastSyncDate the last sync date
	 * @return the sync profile
	 */
	public SyncProfile withLastSyncDate(String lastSyncDate) {
		
		this.lastSyncDate = lastSyncDate;
		return this;
		
	}
	
}
