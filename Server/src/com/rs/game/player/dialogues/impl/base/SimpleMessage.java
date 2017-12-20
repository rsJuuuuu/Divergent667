package com.rs.game.player.dialogues.impl.base;

import com.rs.game.player.dialogues.Dialogue;


public class SimpleMessage extends Dialogue {

    @Override
    public void start() {
        String message = "";
        for (Object parameter : parameters) {
            message += parameter;
        }
        sendText(message);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        end();
    }

    @Override
    public void finish() {

    }

}
