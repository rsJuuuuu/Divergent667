package com.rs.game.npc;

import com.rs.game.world.WorldTile;

import java.util.HashMap;

public class FishingSpotsHandler {

	private static final HashMap<WorldTile, WorldTile> moveSpots = new HashMap<>();

	public static void init() {
		moveSpots.put(new WorldTile(3101, 3092, 0),
				new WorldTile(2845, 3429, 0));
		moveSpots.put(new WorldTile(2853, 3423, 0),
				new WorldTile(2860, 3426, 0));
		moveSpots.put(new WorldTile(3100, 3091, 0),
				new WorldTile(3103, 3092, 0));
		moveSpots.put(new WorldTile(3104, 3424, 0),
				new WorldTile(3099, 3090, 0));
	}

	public static boolean moveSpot(Npc npc) {
		WorldTile key = new WorldTile(npc);
		WorldTile spot = moveSpots.get(key);
		if (spot == null && moveSpots.containsValue(key)) {
			for (WorldTile k : moveSpots.keySet()) {
				WorldTile v = moveSpots.get(k);
				if (v.getX() == key.getY() && v.getY() == key.getX()
						&& v.getPlane() == key.getPlane()) {
					spot = k;
					break;
				}
			}
		}
		if (spot == null)
			return false;
		npc.setNextWorldTile(spot);
		return true;
	}

}
