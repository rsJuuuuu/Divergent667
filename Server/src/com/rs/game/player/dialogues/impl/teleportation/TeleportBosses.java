package com.rs.game.player.dialogues.impl.teleportation;

import com.rs.game.world.WorldTile;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.dialogues.Dialogue;

/*
*
*@author Ashton
*
*/
public class TeleportBosses extends Dialogue {

    @Override
    public void start() {
        sendOptions("Boss Teleports", "Corporeal Beast", "Tormented Demons", "God Wars Dungeon", "Barrows",
                "Chaos " + "Elemental");
    }

    public void run(int interfaceId, int componentId) {
        if (componentId == 1) {
            Magic.normalTeleport(player, new WorldTile(2966, 4383, 0));
        } else if (componentId == 2) {
            Magic.normalTeleport(player, new WorldTile(2562, 5739, 0));
        } else if (componentId == 3) {
        /*Magic.normalTeleport(player,
                    new WorldTile(x, y, 0));*/
            player.getPackets().sendGameMessage("God Wars Dungeon is coming soon.");
        } else if (componentId == 4) {
            Magic.normalTeleport(player, new WorldTile(3565, 3289, 0));
        } else if (componentId == 5) {
        /*Magic.normalTeleport(player,
					new WorldTile(x, y, 0));*/
            player.getPackets().sendGameMessage("Chaos Elemental is coming soon.");
        } else {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
