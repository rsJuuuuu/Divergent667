package com.rs.game.actionHandling.actions;

import com.rs.game.npc.Npc;
import com.rs.game.player.Player;

/**
 * Created by Peng on 8.10.2016.
 */
public interface NpcListener extends ActionListener{

    int execute(Player player, Npc npc, int clickType);
}
