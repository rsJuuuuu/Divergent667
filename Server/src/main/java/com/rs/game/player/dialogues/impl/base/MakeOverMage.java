package com.rs.game.player.dialogues.impl.base;

import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.info.PlayerLook;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.registerNpcDialogue;

public class MakeOverMage extends Dialogue implements Handler {

    private int npcId;

    @Override
    public void start() {
        npcId = (Integer) parameters[0];
        sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                "Hello there! I am know as the Makeover " + "Mage! I have"
                + "spent many years researching magic that can change your physical appearance" + ".", npcId, 9827);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (stage == -1) {
            stage = 0;
            sendNpcDialogue(NPCDefinitions.getNPCDefinitions(npcId).name,
                    "I call " + "it a 'makeover'. Would you " + "like to perform my magics on you?", npcId, 9827);
        } else if (stage == 0) {
            stage = 1;
            sendOptions(DEFAULT_OPTIONS_TITLE, "I'd like to change my clothes", "I'd like to change my hairstyle",
                    "I'd like to change my skin color and gender", "No, thanks.");
        } else if (stage == 1) {
            if (player.getEquipment().wearingArmour()) {
                player.startDialogue("SimpleNPCMessage", npcId, "Please remove your armour first.");
                return;
            }
            switch (componentId) {
                case OPTION_1:
                    PlayerLook.openThessaliasMakeOver(player);
                    end();
                    return;
                case OPTION_2:
                    PlayerLook.openHairdresserSalon(player);
                    end();
                    return;
                case OPTION_3:
                    PlayerLook.openMageMakeOver(player);
                    end();
            }
        }
    }

    @Override
    public void finish() {
    }

    @Override
    public void register() {
        registerNpcDialogue(599, CLICK_1, "MakeOverMage", 599, 0);
        registerNpcDialogue(2676, CLICK_1, "MakeOverMage", 2676, 0);
    }
}
