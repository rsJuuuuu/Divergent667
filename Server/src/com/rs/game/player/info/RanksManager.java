package com.rs.game.player.info;

import com.rs.game.player.Player;
import com.rs.game.world.World;
import com.rs.utils.stringUtils.TextUtils;

import java.awt.*;

/**
 * Created by Peng on 30.7.2016.
 */
public class RanksManager {

    /**
     * Ranks in order from highest to lowest (it's crucial that they are in that order so don't mess them up)
     */
    public enum Ranks {
        DEVELOPER("Developer", new Color(204, 51, 0), null, new Color(51, 170, 0), null, 1, 2),
        OWNER("Owner", new Color(246, 255, 0), new Color(246, 255, 0), new Color(246, 255, 0), new Color(246, 255, 0)
                , 1, 2),
        ADMIN("Admin", new Color(0, 0, 0), new Color(0, 0, 255), new Color(0, 0, 255), new Color(0, 0, 255), 1, 2),
        MOD("Mod", new Color(204, 204, 255), new Color(0, 0, 0), new Color(204, 204, 255), new Color(0, 0, 0), 0, 1),
        SUPPORT("Support", new Color(255, 255, 255), new Color(0, 0, 255), new Color(255, 255, 255), new Color(0, 0,
                255), 9, 0),
        MEMBER("Member", new Color(0, 255, 255), null, new Color(255, 255, 255), null, 12, 4),
        PREMIUM_MEMBER("Premium Member", new Color(0, 133, 242), null, new Color(0, 0, 255), null, 13, 5),
        PLATINUM_MEMBER("Platinum Member", new Color(255, 0, 0), null, new Color(255, 255, 255), null, 14, 6),
        NORMAL("Player", new Color(0, 255, 255), null, new Color(0, 0, 255), null, -1, 0);

        private int crown, rights;
        private String title;
        private Color titleColor, titleShade, messageColor, messageShade;

        Ranks(String title, Color titleColor, Color titleShade, Color messageColor, Color messageShade, int crown,
              int rights) {
            this.title = title;
            this.crown = crown;
            this.titleColor = titleColor;
            this.messageColor = messageColor;
            this.titleShade = titleShade;
            this.messageShade = messageShade;
            this.rights = rights;
        }

        public int getRights() {
            return rights;
        }

        public int getCrown() {
            return crown;
        }

        public String getTitlePrefix() {
            return (titleShade == null ? "" : "<shad=" + TextUtils.convertToHex(titleShade) + ">") + (
                    titleColor == null ? "" : "<col=" + TextUtils.convertToHex(titleColor) + ">");
        }

        public String getMessagePrefix() {
            return (messageShade == null ? "" : "<shad=" + TextUtils.convertToHex(messageShade) + ">") + (
                    messageColor == null ? "" : "<col=" + TextUtils.convertToHex(messageColor) + ">");
        }

        public String getInfo(Player player) {
            return getTitlePrefix() + "[" + title + "] </shad></col><img=" + crown + ">" + player.getDisplayName()
                   + getMessagePrefix();
        }

        public String getTitleAndCrown() {
            return getTitlePrefix() + "[" + title + "] </shad></col><img=" + crown + ">";
        }

        public String getMessageStart(Player player) {
            return getTitleAndCrown() + player.getDisplayName() + ": " + getMessagePrefix();
        }

        public String getTitle() {
            return title;
        }
    }

    /**
     * Get info for a message for this player
     */
    public static String getInfo(Player player) {
        return player.getBestRank().getInfo(player);
    }

    /**
     * Get data about how the players name is to be edited upon showing it in the chat box
     */
    public static String getChatPrefix(Player player) {
        return player.getBestRank().getTitleAndCrown();
    }

    /**
     * Does this message contain something inappropriate
     */
    private static boolean isValidText(String message) {
        String[] invalid = {"<euro", "<img", "<img=", "<col", "<col=", "<shad", "<shad=", "<str>", "<u>"};
        for (String s : invalid)
            if (message.contains(s)) return false;
        return true;
    }

    /**
     * Sends a yell prefixed with the players ranks title and message colors.
     */
    public static void sendYell(Player player, String message) {
        if (player.isMuted()) return;
        if (isValidText(message) || player.hasRights(Ranks.ADMIN))
            World.sendWorldMessage(player.getBestRank().getMessageStart(player) + message);
    }
}
