package com.rs.game.player.dialogues.impl.content.minigames;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.world.WorldTile;

public class BarrowsD extends Dialogue {

    @Override
    public void start() {
        sendText("You've found a hidden tunnel, do you want to enter?");
        stage = -1;
    }

    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            stage = 0;
            sendOptions(DEFAULT_OPTIONS_TITLE, "Yes, I'm fearless.", "No way, that looks scary!");
        } else if (stage == 0) {
            if (componentId == OPTION_1) {
                player.setNextWorldTile(new WorldTile(3551, 9692, 0));
                player.getTemporaryAttributes().put("lootedChest", Boolean.FALSE);
            }
            end();
        }
    }

    @Override
    public void finish() {

    }

}
