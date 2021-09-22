package com.rs.game.gameUtils.events;

import com.rs.game.player.Player;

/**
 * Created by Peng on 8.2.2017 21:16.
 */
public interface PlayerEvent {
    void process(Player player);
}
