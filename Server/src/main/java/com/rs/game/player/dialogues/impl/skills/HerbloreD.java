package com.rs.game.player.dialogues.impl.skills;

import com.rs.game.item.Item;
import com.rs.game.player.actions.herblore.Herblore;
import com.rs.game.player.dialogues.SkillsDialogue;
import com.rs.game.player.dialogues.Dialogue;

public class HerbloreD extends Dialogue {

    private int[] products;
    private Item first, second;

    @Override
    public void start() {
        products = (int[]) parameters[0];
        first = (Item) parameters[1];
        second = (Item) parameters[2];
        SkillsDialogue.sendSkillsDialogue(player, SkillsDialogue.MAKE, "Choose how many you wish to make,<br>then " +
                "click on the item to begin.", 27, products, null);
    }

    @Override
    public void run(int interfaceId, int componentId) {
        player.getActionManager().setAction(new Herblore(player, first, second, SkillsDialogue.getQuantity(player)));
        end();
    }

    @Override
    public void finish() {
    }
}
