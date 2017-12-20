package com.rs.game.player.dialogues.impl.skills.summoning;

import com.rs.game.player.dialogues.Dialogue;

public class DismissD extends Dialogue {

    @Override
    public void start() {
        sendOptions("Dismiss Familiar?", "Yes.", "No.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (componentId == 1) {
            if (player.getFollower() != null) player.getFollower().sendDeath(player);
        }
        end();
    }

    @Override
    public void finish() {

    }

}
