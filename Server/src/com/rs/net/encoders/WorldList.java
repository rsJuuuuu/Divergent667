package com.rs.net.encoders;

public class WorldList {
	/**
	 * The activity (What type of World it is)
	 */
	private String activity;
	/**
	 * The country
	 */
	private int country;
	/**
	 * The flag (What type of server it is)
	 */
	private int flag;
	/**
	 * The IP Address of the world
	 */
	private String ip;
	/**
	 * The location 
	 */
	private int location;
	/**
	 * The region of the server
	 */
	private String region;
	/**
	 * The World id
	 */
	private int worldId;

	/**
	 * The WorldList constructor.
	 * @param worldId The WorldId
	 * @param location The location
	 * @param flag The flag
	 * @param activity The activity
	 * @param ip The IP
	 * @param region The region
	 * @param country The country
	 */
	public WorldList(int worldId, int location, int flag, String activity,
			String ip, String region, int country) {
		this.worldId = worldId;
		this.location = location;
		this.flag = flag;
		this.activity = activity;
		this.ip = ip;
		this.region = region;
		this.country = country;
	}
	
	public static final int COUNTRY_AUSTRALIA = 16;

    public static final int COUNTRY_BELGIUM = 22;

    public static final int COUNTRY_BRAZIL = 31;

    public static final int COUNTRY_CANADA = 38;

    public static final int COUNTRY_DENMARK = 58;

    public static final int COUNTRY_FINLAND = 69;

    public static final int COUNTRY_IRELAND = 101;

    public static final int COUNTRY_MEXICO = 152;

    public static final int COUNTRY_NETHERLANDS = 161;

    public static final int COUNTRY_NORWAY = 162;

    public static final int COUNTRY_SWEDEN = 191;

    public static final int COUNTRY_UK = 77;

    public static final int COUNTRY_USA = 225;

    public static final int FLAG_HIGHLIGHT = 16;

    public static final int FLAG_LOOTSHARE = 8;

    public static final int FLAG_MEMBERS = 1;

    public static final int FLAG_NON_MEMBERS = 0;

    public static final int FLAG_PVP = 4;

	
	/**
	 * Gets the activity
	 * @return The activity
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * Gets the country
	 * @return The country
	 */
	public int getCountry() {
		return country;
	}

	/**
	 * The flag
	 * @return Gets the flag
	 */
	public int getFlag() {
		return flag;
	}

	/**
	 * Gets the IP Address
	 * @return The Ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Gets the Location
	 * @return The location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * Gets the region
	 * @return The region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Gets the world Id
	 * @return The WorldId
	 */
	public int getWorldId() {
		return worldId;
	}
	


}
