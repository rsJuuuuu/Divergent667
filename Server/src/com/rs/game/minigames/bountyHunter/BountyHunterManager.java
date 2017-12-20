package com.rs.game.minigames.bountyHunter;

import com.rs.game.player.Player;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Peng on 28.3.2016 11:56.
 */
public class BountyHunterManager {

    /**
     * Bounty hunter settings, times are in seconds
     */
    static final int TARGET_COOLDOWN = 5 * 60; //5 minutes
    /**
     * How much wealth should one have to gain ep?
     */
    static final int EP_WEALTH_REQ = 750000;
    /**
     * How much ep should you gain/hour + (2.5x in hot zone)
     */
    static final double EPH = 120;
    /**
     * How much should target likelihood increase/tick (10secs) (after likelihood is >60 bh will select a target that
     * has a likelihood of >30 regardless of the combat level (60 is also full bulls-eye (the target icon))
     */
    static final int TARGET_LIKELIHOOD_INCREASE = 10;
    /**
     * Where should the interface be placed?
     */
    static final int RESIZABLE_TAB_ID = 10;
    static final int FIXED_TAB_ID = 8;

    private static CopyOnWriteArrayList<Player> handledPlayers = new CopyOnWriteArrayList<>();

    /**
     * Initiate the bounty hunter
     */
    public static void init() {
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                handledPlayers.forEach
                        (BountyHunterManager::handleHunter);
            }
        }, 20, 20);
    }

    /**
     * Add a player to be handled as a bounty hunter
     *
     * @param player the hunter
     */
    public static void addHandledPlayer(Player player) {
        handledPlayers.add(player);
        player.getBountyHunter().enterBountyHunter();
    }

    /**
     * Remove a player from the handled hunters
     *
     * @param player the player
     */
    static void removeHandledPlayer(Player player) {
        handledPlayers.remove(player);
        player.getBountyHunter().leaveBountyHunter();
    }

    /**
     * Are we handling this player? Used for adding the player to handled players on login etc.
     *
     * @param player the player
     * @return whether the player is being handled as a bounty hunter
     */
    public static boolean handlingPlayer(Player player) {
        return handledPlayers.contains(player);
    }

    /**
     * Process a player playing bounty hunter, (add targets, etc.)
     * Should get ran about once a minute
     */
    private static void handleHunter(Player player) {
        if (player.getControllerManager().getController() instanceof Wilderness) {
            player.getBountyHunter().increaseLikelihood();
            player.getBountyHunter().increaseEP();
            if (!player.getBountyHunter().hasTarget() && !player.getBountyHunter().isOnTargetCooldown()) {
                findTarget(player);
            }
        } else {
            if (!player.getBountyHunter().hasTarget()) handledPlayers.remove(player);
        }
        player.getBountyHunter().updateInterfaces();
    }

    /**
     * Attempt to locate a target for the player
     *
     * @param player the player
     */
    private static void findTarget(Player player) {
        for (Player player2 : handledPlayers) {
            if (player2.getBountyHunter().hasTarget() || player2.getBountyHunter().isOnTargetCooldown()
                || player2.getUsername().equalsIgnoreCase(player.getUsername())) continue;
            if (!(player2.getControllerManager().getController() instanceof Wilderness
                  && !player2.getBountyHunter().hasTarget())) {
                handledPlayers.remove(player2);
                continue;
            }
            if (player.getBountyHunter().isSuitableTarget(player2)
                && player2.getBountyHunter().isSuitableTarget(player)) {
                player.getBountyHunter().assignTarget(player2);
                player2.getBountyHunter().assignTarget(player);
                return;
            }
        }
    }

}
