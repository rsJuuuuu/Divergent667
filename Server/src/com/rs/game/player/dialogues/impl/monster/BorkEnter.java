package com.rs.game.player.dialogues.impl.monster;

import com.rs.game.world.WorldTile;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class BorkEnter extends Dialogue {

    private int npcId;

    @Override
    public void start() {
        sendChatDialogue("Bork", "Who is here? Thou Shall not disturb me!");
        player.getPackets().sendCameraShake(3, 25, 50, 25, 50);
        sentEarthquake = true;

    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            sendOptions("What would you like to do?", "Sneak away quietly", "Teleport to Bork");
            stage = 1;
        } else if (stage == 1) {
            if (componentId == 1) {
                player.getPackets().sendStopCameraShake();
                end();
            } else if (componentId == 2) {
                if (sentEarthquake) teleportPlayer(3114, 5528, 0);
                player.getPackets().sendStopCameraShake();
                end();
            }

        }
    }

    private boolean sentEarthquake;

    private void teleportPlayer(int x, int y, int z) {
        Magic.normalTeleport(player, new WorldTile(x, y, z));
    }

    public void init() throws InterruptedException {
        player.getPackets().sendCameraShake(1, 1, 1, 1, 1);
        Thread.sleep(90000); // Put the seconds you want the interval to be, * 1000
        player.getPackets().sendStopCameraShake();
    }

    @Override
    public void finish() {

    }

    public void doTrip() {

    }

}
