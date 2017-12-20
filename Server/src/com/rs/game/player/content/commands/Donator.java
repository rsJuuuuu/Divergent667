package com.rs.game.player.content.commands;

import com.rs.game.world.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.actionHandling.Handler;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerDonatorCommand;

/**
 * Created by Peng on 30.7.2016.
 */
public class Donator implements Handler {

    private static int teleportToDonatorZone(Player player, String command, Object[] params) {
        Magic.normalTeleport(player, new WorldTile(2832, 3859, 0));
        player.sendMessage("<col=00ff00><shad=000000>Welcome to the Donator Zone, " + player.getDisplayName());
        return RETURN;
    }

    @Override
    public void register() {
        registerDonatorCommand(Donator::teleportToDonatorZone, "dzone", "donorzone", "donatorzone");
    }
}
