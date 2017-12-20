package com.rs.game.npc.impl.dragons;

import com.rs.game.world.WorldTile;
import com.rs.game.npc.Npc;

@SuppressWarnings("serial")
public class KingBlackDragon extends Npc {

	public KingBlackDragon(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setLureDelay(0);
	}

	public static boolean atKBD(WorldTile tile) {
        return (tile.getX() >= 2250 && tile.getX() <= 2292)
                && (tile.getY() >= 4675 && tile.getY() <= 4710);
    }

}
