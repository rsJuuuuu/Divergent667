package com.rs.game.player.info;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

/**
 * Created by Peng on 28.1.2017 0:36.
 */
public class RequirementsManager {

    /**
     * Check the players inventory for given items
     */
    public static boolean hasInventoryItems(Player player, boolean message, Item... items) {
        if (!player.getInventory().containsItems(items)) {
            if (message) player.sendMessage("You don't have the required items to do this.");
            return false;
        }
        return true;
    }

    /**
     * Does the player have the given skill req by default allows boosting
     *
     * @param player  the player
     * @param skill   skill that is being checked
     * @param level   level to meet
     * @param message You need a [SKILL_NAME] level of [level] to [message] (can be null in witch case "to do this"
     * @return if meets requirements
     */
    public static boolean hasRequirement(Player player, int skill, int level, String message) {
        return hasRequirement(player, skill, level, message, true);
    }

    /**
     * Does the player have the given skill req
     *
     * @param player     the player
     * @param skill      skill that is being checked
     * @param level      level to meet
     * @param message    You need a [SKILL_NAME] level of [level] to [message] (can be null in witch case "to do this"
     * @param allowBoost should boosting be allowed
     * @return if meets requirements
     */
    public static boolean hasRequirement(Player player, int skill, int level, String message, boolean allowBoost) {
        if ((allowBoost ? player.getSkills().getLevel(skill) : player.getSkills().getLevelForXp(skill)) < level) {
            player.sendMessage("You need a" + (Utils.startsWithVowel(Skills.SKILL_NAME[skill]) ? "n " : " ")
                               + Skills.SKILL_NAME[skill] + " level of " + level + " to " + (
                                       message != null ? message : "do this") + ".");
            return false;
        }
        return true;
    }

    /**
     * Is the player carrying at least one of one of the given ids
     */
    public static boolean carryingAnyOf(Player player, int... ids) {
        for (int id : ids)
            if (id != -1 && (player.getInventory().containsOneItem(id)
                             || player.getEquipment().getItems().contains(new Item(id, 1)))) return true;
        return false;
    }
}
