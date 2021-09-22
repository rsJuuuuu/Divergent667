package com.rs.utils;

import com.rs.game.world.WorldTile;
import org.pmw.tinylog.Logger;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;

public final class MapAreas {

	private final static HashMap<Integer, int[]> mapAreas = new HashMap<>();
	private final static String PACKED_PATH = "data/map/packedMapAreas.ma";
	private final static Object lock = new Object();

	public static void init() {
		if (new File(PACKED_PATH).exists())
			loadPackedMapAreas();
		else
			loadUnpackedMapAreas();
	}

	public static boolean isAtArea(String areaName, WorldTile tile) {
		return isAtArea(Utils.getNameHash(areaName), tile);
	}

	public static boolean isAtArea(int areaNameHash, WorldTile tile) {
		int[] coordsList = mapAreas.get(areaNameHash);
		if (coordsList == null)
			return false;
		int index = 0;
		while (index < coordsList.length) {
			if (tile.getPlane() == coordsList[index]
					&& tile.getX() >= coordsList[index + 1]
					&& tile.getX() <= coordsList[index + 2]
					&& tile.getY() >= coordsList[index + 3]
					&& tile.getY() <= coordsList[index + 4])
				return true;
			index += 5;
		}
		return false;
	}

	public static void removeArea(int areaNameHash) {
		mapAreas.remove(areaNameHash);
	}

	public static void addArea(int areaNameHash, int[] coordsList) {
		mapAreas.put(areaNameHash, coordsList);
	}

	public static int getRandomAreaHash() {
		synchronized (lock) {
			while (true) {
				long id = Utils.getRandom(Integer.MAX_VALUE)
						+ Utils.getRandom(Integer.MAX_VALUE);
				id -= Integer.MIN_VALUE;
				if (id != -1 && !mapAreas.containsKey((int) id))
					return (int) id;
			}
		}
	}

	private static void loadUnpackedMapAreas() {
        Logger.info("Packing map areas...");
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"data/map/unpackedMapAreas.txt"));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					PACKED_PATH));
			while (true) {
				String line = in.readLine();
				if (line == null)
					break;
				if (line.startsWith("//"))
					continue;
				String[] splitedLine = line.split(" - ", 2);
				String areaName = splitedLine[0];
				String[] splitedCoords = splitedLine[1].split(" ");
				int[] coordsList = new int[splitedCoords.length];
				if (coordsList.length < 5)
					throw new RuntimeException("Invalid list for area line: "
							+ line);
				for (int i = 0; i < coordsList.length; i++)
					coordsList[i] = Integer.parseInt(splitedCoords[i]);
				int areaNameHash = Utils.getNameHash(areaName);
				if (mapAreas.containsKey(areaNameHash))
					continue;
				out.writeInt(areaNameHash);
				out.writeByte(coordsList.length);
                for (int aCoordsList : coordsList) out.writeShort(aCoordsList);
				mapAreas.put(areaNameHash, coordsList);
			}
			in.close();
			out.flush();
			out.close();
		} catch (Throwable e) {
            Logger.error(e);
		}
	}

	private static void loadPackedMapAreas() {
		try {
			RandomAccessFile in = new RandomAccessFile(PACKED_PATH, "r");
			FileChannel channel = in.getChannel();
			ByteBuffer buffer = channel.map(MapMode.READ_ONLY, 0,
					channel.size());
			while (buffer.hasRemaining()) {
				int areaNameHash = buffer.getInt();
				int[] coordsList = new int[buffer.get() & 0xff];
				for (int i = 0; i < coordsList.length; i++)
					coordsList[i] = buffer.getShort() & 0xffff;
				mapAreas.put(areaNameHash, coordsList);
			}
			channel.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private MapAreas() {

	}
}
