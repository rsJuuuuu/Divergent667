package com.rs.game.actionHandling.actions;

import com.rs.game.player.Player;

/**
 * Created by Peng on 2.10.2016.
 */
public interface InterfaceListener extends ActionListener{

    int execute(Player player, int componentId, int slotId, int slotId2, int buttonId, int interfaceId);
}
