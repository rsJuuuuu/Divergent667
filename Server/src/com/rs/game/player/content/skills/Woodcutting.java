package com.rs.game.player.content.skills;

import com.rs.game.player.Player;
import com.rs.game.player.Skills;

/**
 * Created by Peng on 3.12.2016 0:37.
 */
public class Woodcutting {
    public enum Hatchet {
        DRAGON(6739, 61, 2846, 13),
        ADZE(13661, 61, 10251, 13),
        RUNE(1359, 41, 867, 10),
        ADAMANT(1357, 31, 869, 7),
        MITHRIL(1355, 21, 871, 5),
        BLACK(1361, 11, 873, 4),
        STEEL(1353, 6, 875, 3),
        IRON(1349, 0, 877, 2),
        BRONZE(1351, 0, 879, 1);

        private int itemId, level, emoteId, time;

        Hatchet(int itemId, int level, int emoteId, int time) {
            this.itemId = itemId;
            this.level = level;
            this.emoteId = emoteId;
            this.time = time;
        }

        public int getEmoteId() {
            return emoteId;
        }

        public int getTime() {
            return time;
        }

        public static boolean hasHatchet(Player player) {
            int weaponId = player.getEquipment().getWeaponId();
            for (Hatchet hatchet : Hatchet.values())
                if (hatchet.itemId == weaponId) return true;
            for (Hatchet hatchet : Hatchet.values())
                if (player.getInventory().containsOneItem(hatchet.itemId)) return true;
            return false;
        }

        public static Hatchet forId(Player player) {
            int weaponId = player.getEquipment().getWeaponId();
            int level = player.getSkills().getLevel(Skills.WOODCUTTING);
            for (Hatchet hatchet : Hatchet.values())
                if (hatchet.itemId == weaponId && level >= hatchet.level) return hatchet;
            for (Hatchet hatchet : Hatchet.values())
                if (player.getInventory().containsOneItem(hatchet.itemId) && level >= hatchet.level) return hatchet;
            return null;
        }
    }

}
