package com.rs.game.actionHandling.actions;

import com.rs.game.player.Player;

/**
 * Created by Peng on 28.10.2016.
 */
public interface CommandListener extends ActionListener{
    int execute(Player player, String command, String... params);
}
