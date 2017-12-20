package com.rs.game.player.content.skills.farming;

import java.io.Serializable;

public class PatchStatus implements Serializable {

	/**
	 * @author Jake | Santa Hat @Rune-Server
	 */

	private static final long serialVersionUID = 4641462661859309514L;

	private int objectId;
	private int configId;
	private int configValue;
	private int maxConfigValue;
	private String inspect;
	private int delay;
	private int configTicks;

	public PatchStatus(int objectId, int configId, int configValue, int maxConfigValue, String inspect, int delay) {
		this.objectId = objectId;
		this.configId = configId;
		this.configValue = configValue;
		this.maxConfigValue = maxConfigValue;
		this.inspect = inspect;
		this.delay = delay;
		configTicks = 0;
	}

	public int getDelay() {
		return delay;
	}

	public void configTick() {
		configTicks++;
	}

	public void setConfigValue(int value) {
		this.configValue = value;
	}

	public boolean updateConfig() {
		configTick();
		if (configTicks >= delay) {
			configTicks = 0;
			return true;
		}
		return false;
	}

	public int getObjectId() {
		return objectId;
	}

	public int getConfigId() {
		return configId;
	}

	public int getConfigValue() {
		return configValue;
	}

	public int getMaxConfigValue() {
		return maxConfigValue;
	}

	public String getInspectText() {
		return inspect;
	}

}