package com.rs.game.player.actions.fletching;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;

/**
 * @author Santa Hat (Rune-server)
 *         Edited by Peng
 */
public class GemTipCutting extends Action {

    public enum GemTips {
        OPAL(1609, 1, 11, 886, 45),

        JADE(1611, 2, 26, 886, 9187),

        RED_TOPAZ(1613, 3, 48, 887, 9188),

        SAPPHIRE(1607, 4, 56, 888, 9189),

        EMERALD(1605, 5, 58, 889, 9190),

        RUBY(1603, 6, 63, 887, 9191),

        DIAMOND(1601, 7, 65, 890, 9192),

        DRAGONSTONE(1615, 8, 71, 885, 9193),

        ONYX(6573, 9, 73, 2717, 9194);

        private double experience;
        private int levelRequired;
        private int cut;

        private int emote;
        private int boltTips;

        GemTips(int cut, double experience, int levelRequired, int emote, int boltTips) {
            this.cut = cut;
            this.experience = experience;
            this.levelRequired = levelRequired;
            this.emote = emote;
            this.boltTips = boltTips;
        }

        public int getLevelRequired() {
            return levelRequired;
        }

        public double getExperience() {
            return experience;
        }

        public int getCut() {
            return cut;
        }

        public int getEmote() {
            return emote;
        }

        public int getBoltTips() {
            return boltTips;
        }

    }

    public static GemTips findTips(int itemId, int otherId) {
        for (GemTips tip : GemTips.values()) {
            if (tip.getCut() == itemId || tip.getCut() == otherId) return tip;
        }
        return null;
    }

    public static void cut(Player player, GemTips gem) {
        player.getActionManager().setAction(new GemTipCutting(gem, player.getInventory().numberOf(gem.getCut())));
    }

    private GemTips gem;
    private int quantity;

    private GemTipCutting(GemTips gem, int quantity) {
        this.gem = gem;
        this.quantity = quantity;
    }

    public boolean checkAll(Player player) {
        if (!RequirementsManager.hasRequirement(player, Skills.FLETCHING, gem.getLevelRequired(), "to cut this gem"))
            return false;
        if (!player.getInventory().containsOneItem(gem.getCut())) {
            player.getDialogueManager().startDialogue("SimpleMessage",
                    "You don't have any " + ItemDefinitions.getItemDefinitions(gem.getCut()).getName().toLowerCase()
                    + " to cut.");
            return false;
        }
        return true;
    }

    @Override
    public boolean start(Player player) {
        if (checkAll(player)) {
            setActionDelay(player, 1);
            player.setNextAnimation(new Animation(gem.getEmote()));
            return true;
        }
        return false;
    }

    @Override
    public boolean process(Player player) {
        return checkAll(player);
    }

    @Override
    public int processWithDelay(Player player) {
        player.getInventory().deleteItem(gem.getCut(), 1);
        player.getInventory().addItem(gem.getBoltTips(), 12);
        player.getSkills().addXp(Skills.FLETCHING, gem.getExperience());
        player.getPackets().sendGameMessage(
                "You cut the " + ItemDefinitions.getItemDefinitions(gem.getCut()).getName().toLowerCase() + ".", true);
        quantity--;
        if (quantity <= 0) return -1;
        player.setNextAnimation(new Animation(gem.getEmote()));
        return 0;
    }

    @Override
    public void stop(final Player player) {
        setActionDelay(player, 3);
    }
}