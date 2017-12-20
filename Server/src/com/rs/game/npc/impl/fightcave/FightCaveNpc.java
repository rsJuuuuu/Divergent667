package com.rs.game.npc.impl.fightcave;

import com.rs.game.npc.Npc;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

public class FightCaveNpc extends Npc {

    public FightCaveNpc(int id, WorldTile tile) {
        super(id, tile, Utils.getNameHash("FightCaves"), false, true);
    }
}