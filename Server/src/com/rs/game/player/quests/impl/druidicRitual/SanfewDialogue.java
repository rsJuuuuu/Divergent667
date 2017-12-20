package com.rs.game.player.quests.impl.druidicRitual;

import com.rs.game.item.Item;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.FaceAnimations;

import static com.rs.game.player.quests.impl.druidicRitual.DruidicRitual.SANFEW;

/**
 * Created by Peng on 16.2.2017 21:57.
 */
public class SanfewDialogue extends Dialogue {
    @Override
    public void start() {
        int questProgress = player.getQuestManager().getStage(33);
        if (questProgress < 1) {
            sendNpcDialogue("The weather is nice today.", SANFEW, FaceAnimations.NORMAL);
            stage = -1;
        } else if (questProgress < 2) {
            sendNpcDialogue("What can I do for you young 'un", SANFEW, FaceAnimations.NORMAL);
            stage = 1;
        } else if (questProgress < 3) {
            sendNpcDialogue("Did you bring me the required ingredients for the potion?", SANFEW, FaceAnimations.NORMAL);
            stage = 6;
        } else {
            sendNpcDialogue("Thank you so much for your help young 'un.", SANFEW, FaceAnimations.NORMAL);
            stage = -1;
        }
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (stage) {
            case 1:
                sendPlayerDialogue("I've been sent to assist you with the ritual to purify the Varrockian stone "
                                   + "circle.", FaceAnimations.NORMAL);
                stage = 2;
                break;
            case 2:
                sendNpcDialogue("Well, what I'm struggling with right now is the meats needed for the potion to "
                                + "honour Guthix.", SANFEW, FaceAnimations.NORMAL);
                queueMessage(() -> sendNpcDialogue("I need the raw meats of four different animals for it, but not "
                                                   + "just any old meats will do.", SANFEW, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Each meat has to be dipped individually into the Cauldron of "
                                                   + "Thunder for it to work correctly.", SANFEW, FaceAnimations
                        .NORMAL));
                player.getQuestManager().setStage(33, 2);
                stage = 3;
                break;
            case 3:
                sendPlayerDialogue("Where can I find this cauldron?", FaceAnimations.NORMAL);
                stage = 4;
                break;
            case 4:
                sendNpcDialogue("It is located somewhere in the mysterious underground halls which are located "
                                + "somewhere in the woods just South of here.", SANFEW, FaceAnimations.NORMAL);
                queueMessage(() -> sendNpcDialogue("They are too dangerous for me to go myself however.", SANFEW,
                        FaceAnimations.SAD));
                stage = 5;
                break;
            case 5:
                sendPlayerDialogue("Ok, I'll go do that then.", FaceAnimations.NORMAL);
                stage = -1;
                break;
            case 6:
                if (player.getInventory().containsItems(new Item(522), new Item(523), new Item(524), new Item(525))) {
                    stage = 10;
                } else {
                    sendPlayerDialogue("No, not yet...", FaceAnimations.SAD);
                    stage = 7;
                }
                break;
            case 7:
                sendNpcDialogue("Well, let me know when you do young 'un", SANFEW, FaceAnimations.NORMAL);
                stage = 8;
                break;
            case 8:
                sendOptions(DEFAULT_OPTIONS_TITLE, "What was I meant to be doing again?", "I'll get on with it");
                stage = 9;
                break;
            case 9:
                switch (componentId) {
                    case OPTION_1:
                        stage = 2;
                        run(interfaceId, componentId);
                        break;
                    default:
                        end();
                }
                break;
            case 10:
                sendPlayerDialogue("Yes, I have all four now!", FaceAnimations.HAPPY);
                stage = 11;
                break;
            case 11:
                sendNpcDialogue("Well hand 'em over then lad!", SANFEW, FaceAnimations.NORMAL);
                stage = 12;
                break;
            case 12:
                player.getQuestManager().setStage(33, 3);
                player.getInventory().removeItems(new Item(522), new Item(523), new Item(524), new Item(525));
                sendNpcDialogue("Thank you so much adventurer! These meats will allow our potion to honour Guthix to "
                                + "be completed,", SANFEW, FaceAnimations.HAPPY);
                queueMessage(() -> sendNpcDialogue("and bring one step closer to reclaiming our stone circle!",
                        SANFEW, FaceAnimations.HAPPY));
                queueMessage(() -> sendNpcDialogue("Now go and talk to Kaqemeex and he will introduce you to the "
                                                   + "wonderful world of herblore and potion making!", SANFEW,
                        FaceAnimations.NORMAL));
                stage = -1;
                break;
            default:
                end();
        }
    }

    @Override
    public void finish() {

    }
}
