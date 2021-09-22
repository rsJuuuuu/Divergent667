/* Lucien.java - Created by n1ght br0
ask to repost.
 */
package com.rs.game.player.dialogues.impl.teleportation;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.world.WorldTile;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class PvpTeleports extends Dialogue {

    private int npcId;

    @Override
    public void start() {
        npcId = (Integer) parameters[0];
        sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                "Hello, I can teleport you to PvP Areas." + "What you do there is fight other player,"
                + " and get tokens and you can spend them, on great " + "prizes" + ".", npcId, 9827);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            sendPlayerDialogue(player.getDisplayName(), "Sure, why not.", player.getIndex(), 9827);
            stage = 1;
        } else if (stage == 1) {
            stage = 2;
            sendOptions("Where would you like to go?", "Magic Bank.", "Multi Area. (PvP)",
                    "Fight " + "Pits.", "Wests" + "(PvP)", "More Options");
        } else if (stage == 2) {
            if (componentId == 1) Magic.normalTeleport(player, new WorldTile(2539, 4712, 0));
            else if (componentId == 2) {
                Magic.normalTeleport(player, new WorldTile(3240, 3611, 0));
                player.getControllerManager().startController("Wilderness");
            } else if (componentId == 3) Magic.normalTeleport(player, new WorldTile(2399, 5177, 0));
            else if (componentId == 4) {
                Magic.normalTeleport(player, new WorldTile(2984, 3596, 0));
                player.getControllerManager().startController("Wilderness");
            } else if (componentId == 5) {
                sendOptions("Where would you like to go?", "Easts (PvP)", "Edgeville.");
                stage = 3;
            }
        } else if (stage == 3) {
            if (componentId == 1) {
                Magic.normalTeleport(player, new WorldTile(3360, 3658, 0));
                player.getControllerManager().startController("Wilderness");
            } else if (componentId == 2) {
                Magic.normalTeleport(player, new WorldTile(3092, 3498, 0));
            }
        }
    }

    @Override
    public void finish() {

    }
}