package com.rs.game.minigames.pestControl;

import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

/**
 * Created by Peng on 20.2.2017 22:04.
 */
public class PestControl implements Handler {

    private static PestLobby lobby = new PestLobby();
    private static PestGame game = new PestGame();

    @Override
    public void register() {
        lobby.startWaiting();
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                lobby.process();
            }
        }, 1, 0);
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                game.process();
            }
        }, 1, 0);

        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            lobby.removeWaiter(player);
            return RETURN;
        }, 14314);
        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            lobby.addWaiter(player);
            return RETURN;
        }, 14315);
    }

    public static PestGame getGame() {
        return game;
    }

    public static void addDamage(Player source, int damage) {
        game.addDamage(source, damage);
    }
}
