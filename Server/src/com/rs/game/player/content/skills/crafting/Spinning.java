package com.rs.game.player.content.skills.crafting;

import com.rs.game.world.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;

/**
 * The spinning wheel.
 *
 * @author Arham Siddiqui
 */
public class Spinning {

    /**
     * The spinning animation.
     */
    public static final Animation SPINNING_ANIMATION = new Animation(896);

    /**
     * Can the player spin the Item?
     *
     * @param player The player.
     * @param itemId The Item's ID.
     * @return If the player can spin the Item.
     */
    public static boolean canSpin(Player player, int itemId) {
        for (SpinningItem item : SpinningItem.values()) {
            for (int beforeId : item.getBeforeId()) {
                if (beforeId == itemId) {
                    spin(player, item, itemId);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Gets the before ID from the after ID.
     *
     * @param afterId The after ID to be dependant on.
     * @return The before ID.
     */
    public static int[] getBeforeFromAfter(int afterId) {
        for (SpinningItem item : SpinningItem.values()) {
            if (item.getAfterId() == afterId) {
                return item.getBeforeId();
            }
        }
        return null;
    }

    /**
     * Spins the Item.
     *
     * @param player The player spinning the Item.
     * @param item   The SpinningItem being spun.
     */
    private static void spin(Player player, SpinningItem item, int itemId) {
        if (player.getSkills().getLevel(Skills.CRAFTING) < item.getSkillRequirement()) {
            player.getPackets().sendGameMessage("You need a Crafting level of " + item.getSkillRequirement() + " to "
                    + "craft this.");
            return;
        }
        player.setNextAnimation(SPINNING_ANIMATION);
        player.getInventory().deleteItem(new Item(itemId));
        player.getSkills().addXp(Skills.CRAFTING, item.getExp());
        player.getInventory().addItem(new Item(item.getAfterId()));
    }

    /**
     * The spinnable items.
     */
    public enum SpinningItem {
        /**
         * The wool.
         */
        WOOL(new int[]{1737}, 1759, 1, 2.5),
        /**
         * The flax.
         */
        FLAX(new int[]{1779}, 1777, 1, 15),
        /**
         * The sinew
         */
        SINEW(new int[]{9436}, 9438, 10, 15),
        /**
         * The magical roots.
         */
        MAGIC_ROOTS(new int[]{6051}, 6038, 19, 30),
        /**
         * All the tree roots.
         */
        TREE_ROOTS(new int[]{6049, 6047, 6045, 6043}, 6038, 19, 30),
        /**
         * The yak hair.
         */
        YAK_HAIR(new int[]{10814}, 954, 30, 25);
        /**
         * The ID before.
         */
        private int[] beforeId;
        /**
         * The ID after.
         */
        private int afterId;
        /**
         * The required level.
         */
        private int skillRequirement;
        /**
         * The experience gained.
         */
        private double exp;

        /**
         * The single spinning Item.
         *
         * @param beforeId         The Item ID before.
         * @param afterId          The Item ID after.
         * @param skillRequirement The required level of Crafting to make the Item.
         * @param exp              The experience gained for spinning the item.
         */
        SpinningItem(int[] beforeId, int afterId, int skillRequirement, double exp) {
            this.beforeId = beforeId;
            this.afterId = afterId;
            this.skillRequirement = skillRequirement;
            this.exp = exp;
        }

        /**
         * Gets the ID before.
         *
         * @return The ID before.
         */
        public int[] getBeforeId() {
            return beforeId;
        }

        /**
         * Gets the ID after.
         *
         * @return The ID after.
         */
        public int getAfterId() {
            return afterId;
        }

        /**
         * Gets the Crafting level required.
         *
         * @return The Crafting level required.
         */
        public int getSkillRequirement() {
            return skillRequirement;
        }

        /**
         * Gets the experience gained.
         *
         * @return The experience gained.
         */
        public double getExp() {
            return exp;
        }
    }
}