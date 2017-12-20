package com.rs.game.player.quests.impl.druidicRitual;

import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.FaceAnimations;
import com.rs.game.player.quests.QuestHandler;

import static com.rs.game.player.quests.impl.druidicRitual.DruidicRitual.KAQEMEEX;

/**
 * Created by Peng on 16.2.2017 21:55.
 */
public class KaqemeexDialogue extends Dialogue {
    @Override
    public void start() {
        sendPlayerDialogue("Hello there.", FaceAnimations.NORMAL);
        if (player.getQuestManager().getStage(33) > 3) stage = 12;
        else if (player.getQuestManager().getStage(33) > 2) stage = 11;
        else stage = 0;
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (stage) {
            case 0:
                sendNpcDialogue("What brings you to our holy monument?", KAQEMEEX, FaceAnimations.NORMAL);
                stage = 1;
                break;
            case 1:
                sendOptions(DEFAULT_OPTIONS_TITLE, "Who are you?", "Did you build this?",
                        "I'm in search of a " + "quest.");
                stage = 2;
                break;
            case 2:
                switch (componentId) {
                    case OPTION_1:
                        sendNpcDialogue("We are the druids of Guthix. We worship our god at our famous stone "
                                        + "circles. You will find them located throughout these lands.", KAQEMEEX,
                                FaceAnimations.NORMAL);
                        stage = 3;
                        break;
                    case OPTION_2:
                        sendNpcDialogue("What, personally? No, of course I didn't. However, our forefathers did"
                                        + ".", KAQEMEEX, FaceAnimations.HAPPY);
                        queueMessage(() -> sendNpcDialogue("The first Druids of Guthix built many stone circles "
                                                           + "across these lands over eight hundred years ago.",
                                KAQEMEEX, FaceAnimations.NORMAL));
                        queueMessage(() -> sendNpcDialogue("Unfortunately we only know of two remaining, and of "
                                                           + "those only one is usable by us anymore.", KAQEMEEX,
                                FaceAnimations.NORMAL));
                        stage = 8;
                        break;
                    case OPTION_3:
                        stage = 10;
                        run(interfaceId, componentId);
                        break;
                }
                break;
            case 3:
                sendPlayerDialogue("What about the stone circle full of dark wizards?", FaceAnimations.ASKING);
                stage = 4;
                break;
            case 4:
                sendNpcDialogue("That used to be OUR stone circle.", KAQEMEEX, FaceAnimations.ANGRY);
                queueMessage(() -> sendNpcDialogue("Unfortunately, many many years ago, dark wizards cast a "
                                                   + "wicked spell upon it so that they could corrupt its power "
                                                   + "for their own evil ends.", KAQEMEEX, FaceAnimations
                        .MILDLY_ANGRY));
                queueMessage(() -> sendNpcDialogue("When they cursed the rocks for their rituals they made them "
                                                   + "useless to us and our magics.", KAQEMEEX, FaceAnimations
                        .MILDLY_ANGRY));
                queueMessage(() -> sendNpcDialogue(
                        "We require a brave " + "adventurer to go on a quest for us to help purify the "
                        + "circle of Varrock.", KAQEMEEX, FaceAnimations.NORMAL));
                stage = 5;
                break;
            case 5:
                sendOptions(DEFAULT_OPTIONS_TITLE, "Ok, I will try and help.",
                        "No, that doesn't sound very " + "interesting.",
                        "So... is " + "there " + "anything " + "in this " + "for me?");
                stage = 6;
                break;
            case 6:
                switch (componentId) {
                    case OPTION_1:
                        player.getQuestManager().setStage(33, 1);
                        sendNpcDialogue("Excellent. Go to the village south of this place and speak to my fellow "
                                        + "Sanfew who is working on the purification ritual.", KAQEMEEX,
                                FaceAnimations.HAPPY);
                        queueMessage(() -> sendNpcDialogue("He knows better than I what is required to complete "
                                                           + "it.", KAQEMEEX, FaceAnimations.NORMAL));
                        stage = 7;
                        break;
                    case OPTION_2:
                        sendNpcDialogue(" I will not try and change your mind adventurer. Some day when you have "
                                        + "matured you may reconsider your position. We will wait until then.",
                                KAQEMEEX, FaceAnimations.GLANCE_DOWN);
                        stage = -1;
                        break;
                    case OPTION_3:
                        sendNpcDialogue("We druids value wisdom over wealth, so if you expect material gain, you "
                                        + "will be disappointed.", KAQEMEEX, FaceAnimations.NORMAL);
                        queueMessage(() -> sendNpcDialogue("We are, however, very skilled in the art of Herblore,"
                                                           + " which we will share with you if you can assist us "
                                                           + "with this task.", KAQEMEEX, FaceAnimations.NORMAL));
                        queueMessage(() -> sendNpcDialogue("You may find such wisdom a greater reward than mere "
                                                           + "money.", KAQEMEEX, FaceAnimations.NORMAL));
                        stage = 5;
                }
                break;
            case 7:
                sendPlayerDialogue("Will do.", FaceAnimations.NORMAL);
                stage = -1;
                break;
            case 8:
                sendOptions(DEFAULT_OPTIONS_TITLE, "What about the stone circle full of dark wizards?",
                        "I'm in " + "search" + " of a " + "quest" + ".", "Well, I'll be on my way now.");
                stage = 9;
                break;
            case 9:
                switch (componentId) {
                    case OPTION_1:
                        stage = 4;
                        break;
                    case OPTION_2:
                        stage = 10;
                        break;
                    default:
                        stage = -1;
                }
                break;
            case 10:
                sendNpcDialogue("Hmm. I think I may have a worthwhile quest for you actually.", KAQEMEEX,
                        FaceAnimations.NORMAL);
                queueMessage(() -> sendNpcDialogue("I don't know if you're familiar with the stone circle south "
                                                   + "of Varrock or not, but...", KAQEMEEX, FaceAnimations.NORMAL));
                stage = 4;
                break;
            case 11:
                sendNpcDialogue("I have word from Sanfew that you have been very helpful in assisting him with his "
                                + "preparations for the purification ritual.", KAQEMEEX, FaceAnimations.HAPPY);
                queueMessage(() -> sendNpcDialogue("As promised I will now teach you the ancient arts of Herblore.",
                        KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("I will now explain the fundamentals of Herblore:", KAQEMEEX,
                        FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Herblore is the skill of working with herbs and other "
                                                   + "ingredients, to make useful potions and poison.", KAQEMEEX,
                        FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue(" First you will need a vial, which can be found or made with the "
                                                   + "crafting skill.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Then you must gather the herbs needed to make the potion you "
                                                   + "want.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue(" Refer to the Council's instructions in the Skills section of the"
                                                   + " website for the items needed to make a particular kind of "
                                                   + "potion.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue(" You must fill the vial with water and add the ingredients you "
                                                   + "need. There are normally 2 ingredients to each type of potion"
                                                   + ".", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue(" Bear in mind, you must first identify each herb, to see what it "
                                                   + "is.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue(" You may also have to grind some herbs before you can use them. "
                                                   + "You will need a pestle and mortar in order to do this.",
                        KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Herbs can be found on the ground, and are also dropped by some "
                                                   + "monsters when you kill them.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Let's try an example Attack potion: The first ingredient is Guam"
                                                   + " leaf; the next is Eye of Newt.", KAQEMEEX, FaceAnimations
                        .NORMAL));
                queueMessage(() -> sendNpcDialogue(" Mix these in your water-filled vial and you will produce an "
                                                   + "Attack potion.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Drink this potion to increase your Attack level.", KAQEMEEX,
                        FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Different potions also require different Herblore levels before "
                                                   + "you can make them.", KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Once again, check the instructions found on the Council's "
                                                   + "website for the levels needed to make a particular potion.",
                        KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> sendNpcDialogue("Good luck with your Herblore practices, Good day Adventurer.",
                        KAQEMEEX, FaceAnimations.NORMAL));
                queueMessage(() -> {
                    player.closeInterfaces();
                    player.getQuestManager().setStage(33, 4);
                    player.getSkills().addXp(Skills.HERBLORE, 250);
                    QuestHandler.sendQuestComplete(player, 33);
                });
                stage = -1;
                break;
            case 12:
                sendNpcDialogue("Thank you so much for your help.", KAQEMEEX, FaceAnimations.NORMAL);
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
