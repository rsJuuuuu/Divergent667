package com.rs.game.actionHandling.actions;

import com.rs.game.item.Item;
import com.rs.game.player.Player;

/**
 * Created by Peng on 4.1.2017 23:29.
 */
public interface InventoryListener extends ActionListener {
    int execute(Player player, Item item,int slotId, int buttonId);

}
