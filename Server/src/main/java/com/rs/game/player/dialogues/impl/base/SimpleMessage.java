package com.rs.game.player.dialogues.impl.base;

import com.rs.game.player.dialogues.Dialogue;


public class SimpleMessage extends Dialogue {

    @Override
    public void start() {
        StringBuilder message = new StringBuilder();
        for (Object parameter : parameters) {
            message.append(parameter);
        }
        sendText(message.toString());
    }

    @Override
    public void run(int interfaceId, int componentId) {
        end();
    }

    @Override
    public void finish() {

    }

}
