package com.rs.game.player.dialogues.impl.base;

import com.rs.game.player.dialogues.Dialogue;

public class ItemMessage extends Dialogue {

    @Override
    public void start() {
        sendItemDialogue("", (String) parameters[0], (Integer) parameters[1], 1);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        end();
    }

    @Override
    public void finish() {

    }

}
