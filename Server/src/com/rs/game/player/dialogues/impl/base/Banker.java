package com.rs.game.player.dialogues.impl.base;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.dialogues.Dialogue;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerNpcAction;
import static com.rs.game.actionHandling.HandlerManager.registerNpcDialogue;

public class Banker extends Dialogue implements Handler {

    int npcId;

    @Override
    public void start() {
        npcId = (Integer) parameters[0];
        sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name, "Good day, How may I help you?", npcId, 9827);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            stage = 0;
            sendOptions("What would you like to say?", "I'd like to acess my bank account, please.",
                    "I'd like " + "to check my " + "PIN settings" + ".",
                    "I'd like" + " to " + "see my" + " collection box.", "What is this place?");
        } else if (stage == 0) {
            if (componentId == 1) {
                player.getBank().openBank();
                end();
            } else if (componentId == 2) {
                player.getBank().openSetPin();
                end();
            } else if (componentId == 3) {

                end();
            } else if (componentId == 4) {
                stage = 1;
                sendPlayerDialogue(player.getDisplayName(), "What is this place?", player.getIndex(), 9827);
            } else end();
        } else if (stage == 1) {
            stage = 2;
            sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                    "This is branch of the Bank of " + Settings.SERVER_NAME
                    + ". We have branches in many towns.", npcId, 9827);
        } else if (stage == 2) {
            stage = 3;
            sendOptions("What would you like to say?", "And what do you do?",
                    "Didnt you used to be called the " + "Bank of Varrock?");
        } else if (stage == 3) {
            if (componentId == 1) {
                stage = 4;
                sendPlayerDialogue(player.getDisplayName(), "And what do you do?", player.getIndex(), 9827);
            } else if (componentId == 2) {
                stage = 5;
                sendPlayerDialogue(player.getDisplayName(), "Didnt you used to be called the Bank of Varrock?",
                        player.getIndex(), 9827);
            } else end();
        } else if (stage == 4) {
            stage = -2;
            sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                    "We will look after your items and " + "money for you. Leave your valuables with"
                    + " us if you want to keep them safe.", npcId, 9827);
        } else if (stage == 5) {
            stage = -2;
            sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                    "Yes we did, but people kept on coming" + "" + " into our signs were wrong. They acted "
                    + "as if we didn't know what town we were " + "in or " + "something.", npcId, 9827);
        } else end();
    }

    @Override
    public void finish() {

    }

    @Override
    public void register() {
        registerNpcDialogue(902, CLICK_1, "Banker", 902);
        registerNpcAction(CLICK_2, (player, npc, clickType) -> {
            player.getBank().openBank();
            return RETURN;
        }, 902);
    }
}
