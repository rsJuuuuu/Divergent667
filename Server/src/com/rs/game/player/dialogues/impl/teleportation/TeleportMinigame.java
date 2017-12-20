package com.rs.game.player.dialogues.impl.teleportation;

import com.rs.game.world.WorldTile;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.dialogues.Dialogue;

/*
*
*@author Ashton
*
*/
public class TeleportMinigame extends Dialogue {

    @Override
    public void start() {
        sendOptions("Minigame Teleports", "Duel Arena", "Castle Wars", "Soul Wars", "Dominion Tower", "Dungeoneering");
    }

    public void run(int interfaceId, int componentId) {
        if (componentId == 1) {
            Magic.normalTeleport(player, new WorldTile(3366, 3266, 0));
        } else if (componentId == 2) {
            Magic.normalTeleport(player, new WorldTile(2443, 3089, 0));
        } else if (componentId == 3) {
            Magic.normalTeleport(player, new WorldTile(1886, 3178, 0));
        } else if (componentId == 4) {
            Magic.normalTeleport(player, new WorldTile(3366, 3083, 0));
        } else if (componentId == 5) {
            Magic.normalTeleport(player, new WorldTile(3447, 3697, 0));
        } else {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
