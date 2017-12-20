package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.actions.Action;
import com.rs.game.player.dialogues.SkillsDialogue;
import com.rs.game.player.content.skills.crafting.Spinning;
import com.rs.game.player.dialogues.Dialogue;

/**
 * The dialogue of the spinning wheel.
 *
 * @author Arham Siddiqui
 */
public class SpinningD extends Dialogue {

    private int itemId[];

    @Override
    public void start() {
        SkillsDialogue.sendSkillsDialogue(player, SkillsDialogue.MAKE, "Choose how many you wish to make, then click " + "" + "on the chosen item to begin.", 28, new int[]{1759, 1777, 9438, 9438, 6038, 954}, name -> {
            if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(1759).getName())) {
                return "Ball of wool (Wool)";
            } else if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(1777).getName())) {
                return "Bow string (Flax)";
            } else if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(9438).getName()) && SkillsDialogue
                    .getItemSlot(16) == 2) {
                return "C'bow string (Sinew)";
            } else if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(9438).getName()) && SkillsDialogue
                    .getItemSlot(17) == 3) {
                return "C'bow string (Tree roots)";
            } else if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(6038).getName())) {
                return "Magic string (Magic roots)";
            } else if (name.equalsIgnoreCase(ItemDefinitions.getItemDefinitions(954).getName())) {
                return "Rope (Yak hide)";
            }
            return name;
        });
    }

    @Override
    public void run(int interfaceId, int componentId) {
        int option = SkillsDialogue.getItemSlot(componentId);
        itemId = Spinning.getBeforeFromAfter(SkillsDialogue.getItem(option));
        final int[] quantity = {SkillsDialogue.getQuantity(player)};
        int invQuantity = player.getInventory().getItems().getNumberOf(itemId[0]);
        if (quantity[0] > invQuantity) quantity[0] = invQuantity;
        Action action = new Action() {
            @Override
            public boolean start(Player player) {
                if (quantity[0] <= 0) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean process(Player player) {
                if (quantity[0] <= 0) {
                    return false;
                }
                return true;
            }

            @Override
            public int processWithDelay(Player player) {
                quantity[0]--;
                Spinning.canSpin(player, itemId[0]);
                return 5;
            }

            @Override
            public void stop(Player player) {
            }
        };
        player.getActionManager().setAction(action);
        end();
    }

    @Override
    public void finish() {

    }
}