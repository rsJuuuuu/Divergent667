package com.rs.game.player.dialogues.impl.base;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.dialogues.Dialogue;

public class SimpleNPCMessage extends Dialogue {

    private int npcId;
    private String message;

    @Override
    public void start() {
        npcId = (Integer) parameters[0];
        message = (String) parameters[1];
        sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name, message, npcId, 9827);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        end();
    }

    @Override
    public void finish() {

    }

}
