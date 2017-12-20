package com.rs.game.minigames.bountyHunter;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.utils.game.itemUtils.PriceUtils;

import java.io.Serializable;

import static com.rs.game.player.controllers.impl.Wilderness.isAtWild;

/**
 * Created by Peng on 28.3.2016 12:03.
 */
public class BountyHunter implements Serializable {

    private static final long serialVersionUID = 2011932556974180375L;

    private transient Player player;
    private transient Player target;

    private int likelihood = 30;

    private float ep = 0;

    private long lastTarget = 0;
    private long leaveTime = 0;

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Does this player have a target?
     *
     * @return target == null
     */
    boolean hasTarget() {
        return target != null;
    }

    /**
     * Set a target for this player
     *
     * @param target the target
     */
    void assignTarget(Player target) {
        this.target = target;
        player.getHintIconsManager().addHintIcon(target, 0, -1, false);
        updateInterfaces();
    }

    /**
     * Check whether a player is suitable for a target for this player
     *
     * @param target the target candidate
     * @return suitability
     */
    boolean isSuitableTarget(Player target) {
        if (!player.mayBenefitFromKilling(target, false)) return false;
        if (likelihood < 60) {
            if (Math.abs(player.getSkills().getCombatLevel() - target.getSkills().getCombatLevel())
                <= ((Wilderness) player.getControllerManager().getController()).getWildLevel()) {
                return true;
            }
        } else {
            if (target.getBountyHunter().likelihood > 30) return true;
        }
        return false;
    }

    /**
     * Handle the player logging out
     */
    public void logout() {
        if (target != null) {
            target.getBountyHunter().removeTarget(true);
            removeTarget(false);
        }
        lastTarget = System.currentTimeMillis();
        likelihood = 0;
        BountyHunterManager.removeHandledPlayer(player);
    }

    /**
     * Remove the players target
     *
     * @param loggedOut did the target logout?
     */
    public void removeTarget(boolean loggedOut) {
        if (loggedOut) {
            player.sendMessage("Your target has logged out. You will be assigned a new one shortly.");
            lastTarget = System.currentTimeMillis() - (long) (BountyHunterManager.TARGET_COOLDOWN * 0.3
                                                              * 1000); // 30% of the target delay
            likelihood = 50;
        } else {
            lastTarget = System.currentTimeMillis() - BountyHunterManager.TARGET_COOLDOWN * 1000;
            likelihood = 30;
        }
        updateInterfaces();
        player.getHintIconsManager().removeUnsavedHintIcon();
        target = null;
    }

    /**
     * Check if the killed player was the target. You can add the rogue rewards here as well if you want.
     *
     * @param killed the killed player
     */
    public void checkKill(Player killed) {
        if (target == null) return;
        //I just put it to give 20 pkp for testing you can do whatever you want with it
        //You probably want to get the artifact ids and give some of those
        if (killed.getUsername().equalsIgnoreCase(target.getUsername())) {
            if (player.mayBenefitFromKilling(target, false)) {//let death method do adding
                player.sendMessage("You have killed your target and received extra 20 pkp");
                player.addPkPoints(20);
            }
            target.getBountyHunter().removeTarget(false);
            target.getBountyHunter().closeInterfaces();
            player.getBountyHunter().removeTarget(false);
        }
    }

    /*
     * You may want to change the tab value of the skull (the number 27 in the two below methods) in Wilderness.java
     */

    /**
     * Send the bh interfaces
     */
    public void sendInterfaces() {
        updateInterfaces();
        player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? BountyHunterManager
                .RESIZABLE_TAB_ID : BountyHunterManager.FIXED_TAB_ID, 591);
    }

    /**
     * Update the bh interfaces
     */
    void updateInterfaces() {
        if (target != null) player.getPackets().sendIComponentText(591, 8, target.getDisplayName());
        else player.getPackets().sendIComponentText(591, 8, "None");

        player.getPackets().sendHideIComponent(745, 6, inHotZone());

        if (player.getInterfaceManager().hasResizableScreen()) {
            player.getPackets().sendIComponentText(746, 17,
                    getCombatDiff() + "<br> EP: <col=" + getEpColor() + ">" + getEpPercentage() + "%");
        } else {
            player.getPackets().sendIComponentText(548, 12, getCombatDiff());
            player.getPackets().sendIComponentText(548, 13,
                    "EP: <col=" + getEpColor() + ">" + getEpPercentage() + "%");//EP
        }
        player.getPackets().sendConfig(1410, likelihood > 60 ? 60 : likelihood);
    }

    /**
     * Checks if player is in hot zone to gain more ep
     **/
    private boolean inHotZone() {
        return player.getY() > 3700;
    }

    /**
     * Get the color that the ep percentage is displayed in
     *
     * @return the ep color
     */
    private String getEpColor() {
        if (ep < 25) return "red";
        if (ep < 50) return "or1";
        if (ep < 75) return "yel";
        else return "gre";
    }

    /**
     * Used just for the display
     *
     * @return combat level diff in format [min]-[max]
     */
    private String getCombatDiff() {
        int wildLevel;
        if (player.getY() > 9900) wildLevel = (player.getY() - 9912) / 8 + 1;
        else wildLevel = (player.getY() - 3520) / 8 + 1;
        int min = player.getSkills().getCombatLevel() - wildLevel;
        int max = player.getSkills().getCombatLevel() + wildLevel;

        return min + " - " + max;
    }

    /**
     * Fetch the ep percentage in full percents
     *
     * @return formatted percentage
     */
    private int getEpPercentage() {
        return Math.round(ep * 100);
    }

    /**
     * Number of bounty hunter ticks (about 10secs) in wilderness
     */
    private int NORMAL_EP_TICKS = 0;
    private int HOT_ZONE_EP_TICKS = 0;

    /**
     * Increase the players earning potential
     * Add 25% for each 30 minutes in hot zone and 10% for 30 minutes in normal area
     */
    void increaseEP() {
        if (getWealth() < BountyHunterManager.EP_WEALTH_REQ) return;
        if (isAtWild(player)) {
            if (inHotZone()) HOT_ZONE_EP_TICKS++;
            else NORMAL_EP_TICKS++;
        }
        if (HOT_ZONE_EP_TICKS > 3) {
            ep += BountyHunterManager.EPH * 2.5 / 60.0 / 100;
            HOT_ZONE_EP_TICKS = 0;
        }
        if (NORMAL_EP_TICKS > 3) {
            ep += BountyHunterManager.EPH / 60.0 / 100;
            NORMAL_EP_TICKS = 0;
        }
        if (ep > 1) ep = 1;
    }

    /**
     * How much wealth are we carrying around (you might want to make this only count risked wealth)
     */
    private int getWealth() {
        int wealth = 0;
        for (Item item : player.getInventory().getItems().getItems()) {
            if (item == null) continue;
            wealth += PriceUtils.getPrice(item.getId());
        }
        for (Item item : player.getEquipment().getItems().getItems()) {
            if (item == null) continue;
            wealth += PriceUtils.getPrice(item.getId());
        }
        return wealth;
    }

    /**
     * Close the bh interfaces
     */
    public void closeInterfaces() {
        if (player.getInterfaceManager().hasResizableScreen()) {
            player.getPackets().sendIComponentText(746, 17, "");
        } else {
            player.getPackets().sendIComponentText(548, 12, "");
            player.getPackets().sendIComponentText(548, 13, "");//EP
        }
        player.getPackets().closeInterface(player.getInterfaceManager().hasResizableScreen() ? BountyHunterManager
                .RESIZABLE_TAB_ID : BountyHunterManager.FIXED_TAB_ID);
    }

    /**
     * A player can only get a target every BountyHunterManager.TARGET_COOLDOWN seconds.
     */
    boolean isOnTargetCooldown() {
        return (System.currentTimeMillis() - lastTarget) < BountyHunterManager.TARGET_COOLDOWN * 1000;
    }

    /**
     * Increase the players likelihood of getting a target
     */
    void increaseLikelihood() {
        likelihood += BountyHunterManager.TARGET_LIKELIHOOD_INCREASE;
    }

    /**
     * Resets the target likelihood, called upon entering wilderness etc
     */
    private void resetLikelihood() {
        likelihood = 0;
    }

    /**
     * Called upon entering bh
     */
    void enterBountyHunter() {
        if (System.currentTimeMillis() - leaveTime > 10 * 60 * 1000) //If been out for more than 10 minutes
            resetLikelihood();
    }

    /**
     * Called upon leaving bh by logging out or teleporting etc.
     */
    void leaveBountyHunter() {
        leaveTime = System.currentTimeMillis();
    }

}
