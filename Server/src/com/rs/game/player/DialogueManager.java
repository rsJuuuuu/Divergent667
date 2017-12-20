package com.rs.game.player;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.DialogueHandler;

public class DialogueManager {

    private Player player;
    private Dialogue lastDialogue;

    DialogueManager(Player player) {
        this.player = player;
    }

    public void startDialogue(Object key, Object... parameters) {
        if (!player.getControllerManager().useDialogueScript(key)) return;
        if (lastDialogue != null) lastDialogue.finish();
        lastDialogue = DialogueHandler.getDialogue(key);
        if (lastDialogue == null) return;
        lastDialogue.parameters = parameters;
        lastDialogue.setPlayer(player);
        lastDialogue.start();
    }

    public void continueDialogue(int interfaceId, int componentId) {
        if (lastDialogue == null) return;
        componentId = lastDialogue.getFixedComponentId(interfaceId, componentId);
        if (!lastDialogue.processQueue()) lastDialogue.run(interfaceId, componentId);
    }

    public void finishDialogue() {
        if (lastDialogue == null) return;
        lastDialogue.finish();
        lastDialogue = null;
        if (player.getInterfaceManager().containsChatBoxInter()) player.getInterfaceManager().closeChatBoxInterface();
    }

}
