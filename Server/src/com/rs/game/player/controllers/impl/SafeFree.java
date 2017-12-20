package com.rs.game.player.controllers.impl;

import com.rs.game.player.Player;
import com.rs.game.player.controllers.Controller;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.WorldTile;

public class SafeFree extends Controller {

    @Override
    public void start() {
        player.setCanPvp(true);
        sendInterfaces();
    }

    @Override
    public void sendInterfaces() {
        player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? 10 : 19, 789);
    }

    @Override
    public boolean login() {
        removeController();
        return false;
    }

    @Override
    public boolean sendDeath() {
        player.addStopDelay(7);
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    player.setNextAnimation(new Animation(836));
                } else if (loop == 1) {
                    player.getPackets().sendGameMessage("Oh dear, you have died.");
                } else if (loop == 3) {
                    player.getEquipment().init();
                    player.getInventory().init();
                    player.reset();
                    player.setCanPvp(false);
                    teleportPlayer(player);
                    player.setNextAnimation(new Animation(-1));
                } else if (loop == 4) {
                    player.getPackets().sendMusicEffect(90);
                    stop();
                }
                loop++;
            }
        }, 0, 1);
        return false;
    }

    @Override
    public boolean logout() {
        player.setLocation(new WorldTile(3000, 9676, 0));
        return true;
    }

    @Override
    public void forceClose() {
        player.setCanPvp(false);
    }

    @Override
    public void moved() {
        if (!isInClanSafe(player)) {
            player.setCanPvp(false);
        } else player.setCanPvp(true);
    }

    private void teleportPlayer(Player player) {
        player.setNextWorldTile(new WorldTile(3000, 9676, 0));
    }

    private static boolean isInClanSafe(Player player) {
        return player.getX() >= 2756 && player.getY() >= 5512 && player.getX() <= 2878 && player.getY() <= 5630;
    }
}