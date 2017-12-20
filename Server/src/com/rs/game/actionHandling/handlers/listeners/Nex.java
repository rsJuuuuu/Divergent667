package com.rs.game.actionHandling.handlers.listeners;

import com.rs.game.actionHandling.Handler;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.*;

/**
 * Created by Peng on 5.1.2017 0:52.
 */
public class Nex implements Handler {
    @Override
    public void register() {
        registerNpcDialogue(13455, CLICK_1, "Banker", 13455);
        registerNpcAction(CLICK_2, (player, npc, clickType) -> {
            player.getBank().openBank();
            return HANDLED;
        }, 13455);
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            if (player.getX() < 2908) {
                player.startDialogue("NexEntrance");
                return RETURN;
            }
            return DEFAULT;
        }, 57225);
    }
}
