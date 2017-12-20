package com.rs.game.player.content.interfaces;

import com.rs.Settings;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.World;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;

/**
 * @
 */
public class ActionTab {

    private static boolean resizableScreen;

    public static void sendTab(final Player player) {
        WorldTasksManager.schedule(new WorldTask() {
            @Override
            public void run() {
                String bossKills = "";
                for (String line : player.getBossCounter().getNpcStrings()) {
                    bossKills += "<col=FFFFFF>" + line + "</col><br>";
                }
                String col = "<col=FFFFFF>";
                player.getPackets().sendIComponentText(930, 10,
                        "<col=00FF00><u=00FF00>" + Settings.SERVER_NAME + " Player Panel</col>");
                player.getPackets().sendIComponentText(930, 16,
                        "<col=00FF00><u=00FF00>Server Information</col><br><br>" + "<col=FFFFFF>Players online:</col> "
                        + col + World.getPlayers().size() + "</col><br>"
                        + "<br><col=00FF00><u=00FF00>Combat Information</col><br><br>" + "</col>"
                        + "<col=FFFFFF>Antifire duration:</col> " + col + (
                                player.getFireImmune() > 0 ? TimeUtils.formatTime(player.getFireImmuneLeft()) : "None")
                        + "</col><br>" + "<col=FFFFFF>Antipoison duration:</col> " + col + (player.getPoisonImmuneLeft()
                                                                                            > 0 ? TimeUtils
                                .formatTime(player.getPoisonImmuneLeft()) : "None")
                        + "</col><br>" + "<col=FFFFFF>PvP kills:</col> " + col + player.getKillCount() + "</col><br>"
                        + "<col=FFFFFF>PvP deaths:</col> " + col + player.getDeathCount() + "</col><br>"
                        + "<col=FFFFFF>KDR:</col> " + col + (player.getDeathCount() == 0 ? "N/A" : TextUtils.trim(
                                player.getKillCount() / player.getDeathCount())) + "</col><br>"
                        + "<br><col=00FF00><u=00FF00>Slayer Information</col><br><br>" + "<col=FFFFFF>Task:</col> "
                        + col + (player.getTask() == null ? "None" : player.getTask().getName()) + "</col><br>"
                        + "<col=FFFFFF>Kills left:</col> " + col + (
                                player.getTask() == null ? "0" : (player.getTask().getTaskAmount())) + "</col><br>"
                        + "<col=FFFFFF>Partner:</col> " + col + (
                                player.getCoopSlayer().getPartner() == null ? " none" : (" "
                                                                                         + player.getCoopSlayer()
                                                                                                 .getPartner()
                                                                                                 .getDisplayName()))
                        + "</col><br>" + "<col=FFFFFF>Slayer points:</col> " + col + player.getSlayerPoints()
                        + "</col><br>" + "<br><col=00FF00><u=00FF00>Boss Kills</col><br><br>" + bossKills
                        + "<br><col=00FF00><u=00FF00>General Information</col><br><br>"
                        + "<col=FFFFFF>Loyalty points:</col> " + col + player.getLoyaltyPoints() + "</col><br>"
                        + "<col=FFFFFF>Total amount donated:</col> " + col + player.getDonationAmount()
                        + "</col><br><br>");
                player.getServerPanelManager().refresh(player, false);
            }
        }, 0, 5);
    }

}