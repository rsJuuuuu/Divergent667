package com.rs.game.actionHandling.actions;

import com.rs.game.world.WorldObject;
import com.rs.game.player.Player;

/**
 * Created by Peng on 14.10.2016.
 */
public interface ObjectListener extends ActionListener {
    int execute(final Player player, WorldObject object, int clickType);
}
