package com.rs.io;

import com.rs.Settings;

import java.util.ArrayList;

/**
 * Anti Flood
 * 
 * @author Apache Ah64
 */
public class AntiFlood {

	private static ArrayList<String> connections = new ArrayList<>(
            Settings.PLAYERS_LIMIT * Settings.MAX_LOGINS_FROM_SAME_IP);

	public static boolean contains(String ip) {
        return connections.contains(ip);
    }

	public static void add(String ip) {
		connections.add(ip);
	}

	public static void remove(String ip) {
		if (connections.contains(ip))
			connections.remove(ip);
	}

	public static int getSessionsIP(String ip) {
		int amount = 1;
        for (String connection : connections) {
            if (connection.equalsIgnoreCase(ip))
                amount++;
        }
		return amount;
	}

	public static ArrayList<String> getConnections() {
		return connections;
	}
}