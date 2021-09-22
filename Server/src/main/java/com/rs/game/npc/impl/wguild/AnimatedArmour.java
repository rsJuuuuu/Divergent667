package com.rs.game.npc.impl.wguild;

import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;

public class AnimatedArmour extends Npc {

    public Player playerCon;

    public void setPlayerCon(Player con) {
        playerCon = con;
    }

    public Player getPlayerCon() {
        return playerCon;
    }

    public AnimatedArmour(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean
            spawned) {
        super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
    }

    @Override
    public void sendDeath(Entity source) {
        Player other = (Player) source;
        super.sendDeath(source);
        other.getTemporaryAttributes().put("killednpc", getTokensForNpcId());
    }

    public int getTokensForNpcId() {
        switch (this.getId()) {
            case 4278:
                return 20;
            case 4279:
                return 25;
            case 4280:
                return 30;
            case 4282:
                return 35;
            case 4283:
                return 40;
            case 4284:
                return 100;
        }
        return 0;
    }

}