package com.rs.game.player;

import com.rs.Settings;
import com.rs.cores.CoresManager;

import java.util.TimerTask;

public class LoyaltyManager {

    private transient Player player;

    public LoyaltyManager(Player player) {
        this.player = player;
    }

    public void startTimer() {
        CoresManager.fastExecutor.schedule(new TimerTask() {
            int timer = 1800;

            @Override
            public void run() {
                if (timer == 1) {
                    player.addLoyaltyPoints(100);
                    timer = 1800;
                    player.getPackets().sendGameMessage(
                            "<col=008000>You have recieved 100 Loyalty Coins for playing " + Settings.SERVER_NAME + " for 30 Minutes.");
                }
                if (timer > 0) {
                    timer--;
                }
            }
        }, 0L, 1000L);
    }

}