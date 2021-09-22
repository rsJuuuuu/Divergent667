package com.rs.game.minigames.pestControl.npcs;

import com.rs.game.npc.Npc;
import com.rs.game.world.WorldTile;

/**
 * Created by Peng on 21.2.2017 22:47
 */
public class PestPortal extends Npc {
    private boolean shielded = true;

    public PestPortal(int id, WorldTile tile) {
        super(id, tile, -1, true);
    }

    public boolean isShielded() {
        return shielded;
    }

    public void removeShield() {
        if (shielded) this.transformIntoNPC(getId() + 4);
        shielded = false;
    }

    @Override
    public void setSpawnTask() {
        finish();
        if (!shielded) this.transformIntoNPC(getId() - 4);
        shielded = true;
    }

    public void prepareForGame() {
        reset();
        spawn();
    }
}
