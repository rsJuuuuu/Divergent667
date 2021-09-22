package com.rs.game.actionHandling.handlers;

import com.rs.game.actionHandling.actions.ActionListener;
import com.rs.game.actionHandling.actions.InventoryListener;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.net.decoders.WorldPacketsDecoder;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.DEFAULT;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceListener;

/**
 * Created by Peng on 4.1.2017 23:25.
 */
public class InventoryHandler extends ActionHandler<Integer> {

    @Override
    public int executeClick(Player player, WorldPacketsDecoder.Packets packet, ActionListener action, Object...
            params) {
        Item item = (Item) params[0];
        int slotId = (int) params[1];
        int buttonId = (int) params[2];
        return ((InventoryListener) action).execute(player, item, slotId, buttonId);
    }

    @Override
    public void init() {
        //register interface listener for inventory to listen for inventory actions
        registerInterfaceListener((player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            if (componentId != 0 || slotId > 27 || slotId < 0 || player.getInterfaceManager().containsInventoryInter())
                return DEFAULT;
            Item item = player.getInventory().getItem(slotId);
            if (item == null || item.getId() != slotId2) return DEFAULT;
            return processClick(player, item.getId(), buttonId, null, item, slotId, buttonId);
        });
    }

    @Override
    boolean isGlobalKey(Integer key) {
        return key < 0;
    }
}
