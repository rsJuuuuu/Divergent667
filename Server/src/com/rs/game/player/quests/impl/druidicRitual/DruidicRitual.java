package com.rs.game.player.quests.impl.druidicRitual;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.quests.Quest;
import com.rs.game.world.WorldTile;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerNpcAction;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

/**
 * Created by Peng on 16.2.2017 12:59.
 * Druidic ritual quest
 * "questId": 33,
 * "configType": 0,
 * "progressConfig": 80,
 * "completedValue": 4
 */
public class DruidicRitual extends Quest {

    static final int KAQEMEEX = 455;
    static final int SANFEW = 454;

    private Dialogue kaqemeexDialogue = new KaqemeexDialogue();
    private Dialogue sanfewDialogue = new SanfewDialogue();

    @Override
    public int getQuestId() {
        return 33;
    }

    @Override
    protected void registerListeners() {
        registerNpcAction(CLICK_1, (player, npc, clickType) -> {
            player.getDialogueManager().startDialogue(kaqemeexDialogue);
            return RETURN;
        }, KAQEMEEX);
        registerNpcAction(CLICK_1, (player, npc, clickType) -> {
            player.getDialogueManager().startDialogue(sanfewDialogue);
            return RETURN;
        }, SANFEW);
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            player.useStairs(828, new WorldTile(2884, 9798, 0), 1, 2, "You climb the ladder");
            return RETURN;
        }, 55404);
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            player.useStairs(828, new WorldTile(2884, 3398, 0), 1, 2, "You climb the ladder");
            return RETURN;
        }, 32015);
    }

    @Override
    public boolean handleItemOnObject(Player player, int itemId, int id) {
        switch (id) {
            case 2142:
                switch (itemId) {
                    case 2132://beef
                        swap(player, 2132, 522);
                        break;
                    case 2134://rat meat
                        swap(player, 2134, 523);
                        break;
                    case 2138: //chicken
                        swap(player, 2138, 525);
                        break;
                    case 2136://bear
                        swap(player, 2136, 524);
                        break;
                }
                return true;
        }
        return false;
    }

    private void swap(Player player, int first, int second) {
        player.getInventory().removeItems(new Item(first));
        player.getInventory().addItem(new Item(second));
    }

    @Override
    public String[] getRewards() {
        return new String[]{"250 Herblore XP", "Access to Herblore skill"};
    }

    @Override
    public String getDescriptionLine1() {
        return "Help a druid and learn about the";
    }

    @Override
    public String getDescriptionLine2() {
        return "herblore skill.";
    }

    @Override
    public String getClickInfo() {
        return "Start this quest by speaking to Kaqemeex in the stone circle north of Taverley.";
    }

    @Override
    public int getIcon() {
        return 249;
    }

}
