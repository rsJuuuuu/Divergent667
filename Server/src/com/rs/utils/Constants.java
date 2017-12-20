package com.rs.utils;

/**
 * Created by Peng on 19.11.2016 21:32.
 */
public class Constants {

    /**
     * Godwars factions
     */
    public static final int ARMADYL_FACTION = 3;
    public static final int BANDOS_FACTION = 0;
    public static final int SARADOMIN_FACTION = 1;
    public static final int ZAMORAK_FACTION = 2;

    /**
     * Effect priority levels
     */
    public static final int TOP_PRIORITY = 0;
    public static final int DEFAULT_PRIORITY = 1;
    public static final int LOW_PRIORITY = 2;

    /**
     * Spell books
     */
    public static final int MODERN = 0;
    public static final int ANCIENT = 1;
    public static final int LUNAR = 2;

    public static final int LUNAR_SPELLBOOK = 430;
    public static final int ANCIENT_SPELLBOOK = 193;
    public static final int MODERN_SPELLBOOK = 192;
    public static final int DUNGEONEERING_SPELLBOOK = 950;

    /**
     * Prayer
     */
    public static final int NORMAL_PRAYERS = 0;
    public static final int CURSE_PRAYERS = 1;

    /**
     * Movement types
     */
    public static final int MAGIC_TELEPORT = 0;
    public static final int ITEM_TELEPORT = 1;
    public static final int OBJECT_TELEPORT = 2;
    public static final int ROPE_TELEPORT = 3;

    /**
     * Spell types
     */
    public static final int TELEPORT_SPELL = 0;
    public static final int COMBAT_SPELL = 1;
    public static final int CLICK_SPELL = 2;
    public static final int USE_SPELL = 3;

    /**
     * Config types
     */
    public static final int NORMAL_CONFIG = 0;
    public static final int CONFIG_BY_FILE = 1;

    /**
     * Essence
     */
    public static final int RUNE_ESSENCE = 1436;
    public static final int PURE_ESSENCE = 7936;

    /**
     * Tiara ids
     */
    public static final int AIR_TIARA = 5527;
    public static final int MIND_TIARA = 5529;
    public static final int WATER_TIARA = 5531;
    public static final int BODY_TIARA = 5533;
    public static final int EARTH_TIARA = 5535;
    public static final int FIRE_TIARA = 5537;
    public static final int COSMIC_TIARA = 5539;
    public static final int NATURE_TIARA = 5541;
    public static final int CHAOS_TIARA = 5543;
    public static final int LAW_TIARA = 5545;
    public static final int DEATH_TIARA = 5547;
    public static final int BLOOD_TIARA = 5549;
    public static final int SOUL_TIARA = 5551;
    public static final int ASTRAL_TIARA = 9106;
    public static final int OMNI_TIARA = 13655;

    /**
     * Talisman ids
     */
    public static final int AIR_TALISMAN = 1438;
    public static final int MIND_TALISMAN = 1448;
    public static final int WATER_TALISMAN = 1444;
    public static final int BODY_TALISMAN = 1446;
    public static final int EARTH_TALISMAN = 1440;
    public static final int FIRE_TALISMAN = 1442;
    public static final int COSMIC_TALISMAN = 1454;
    public static final int NATURE_TALISMAN = 1462;
    public static final int CHAOS_TALISMAN = 1452;
    public static final int LAW_TALISMAN = 1458;
    public static final int DEATH_TALISMAN = 1456;
    public static final int BLOOD_TALISMAN = 1450;
    public static final int SOUL_TALISMAN = 1460;
    public static final int OMNI_TALISMAN = 13649;

    /**
     * Talisman staff ids
     */
    public static final int AIR_TALISMAN_STAFF = 13630;
    public static final int MIND_TALISMAN_STAFF = 13631;
    public static final int WATER_TALISMAN_STAFF = 13632;
    public static final int BODY_TALISMAN_STAFF = 13635;
    public static final int EARTH_TALISMAN_STAFF = 13633;
    public static final int FIRE_TALISMAN_STAFF = 13634;
    public static final int COSMIC_TALISMAN_STAFF = 13636;
    public static final int NATURE_TALISMAN_STAFF = 13638;
    public static final int CHAOS_TALISMAN_STAFF = 13637;
    public static final int LAW_TALISMAN_STAFF = 13639;
    public static final int DEATH_TALISMAN_STAFF = 13640;
    public static final int BLOOD_TALISMAN_STAFF = 13641;
    public static final int OMNI_TALISMAN_STAFF = 13642;

    /**
     * Rune ids
     */
    public static final int AIR_RUNE = 556;
    public static final int WATER_RUNE = 555;
    public static final int EARTH_RUNE = 557;
    public static final int FIRE_RUNE = 554;
    public static final int MIND_RUNE = 558;
    public static final int BODY_RUNE = 559;
    public static final int NATURE_RUNE = 561;
    public static final int CHAOS_RUNE = 562;
    public static final int DEATH_RUNE = 560;
    public static final int BLOOD_RUNE = 565;
    public static final int SOUL_RUNE = 566;
    public static final int ASTRAL_RUNE = 9075;
    public static final int COSMIC_RUNE = 564;
    public static final int LAW_RUNE = 563;
    public static final int STEAM_RUNE = 4694;
    public static final int MIST_RUNE = 4695;
    public static final int DUST_RUNE = 4696;
    public static final int SMOKE_RUNE = 4697;
    public static final int MUD_RUNE = 4698;
    public static final int LAVA_RUNE = 4699;
    public static final int ARMADYL_RUNE = 21773;
    public static final int ELEMENTAL_RUNE = 12850;

    public enum BonusType {
        STAB_ATTACK(0, "Stab attack"),
        SLASH_ATTACK(1, "Slash attack"),
        CRUSH_ATTACK(2, "Crush attack"),
        RANGE_ATTACK(3, "Range attack"),
        MAGIC_ATTACK(4, "Magic attack"),
        STAB_DEF(5, "Stab defence"),
        SLASH_DEF(6, "Slash defence"),
        CRUSH_DEF(7, "Crush defence"),
        MAGIC_DEF(8, "Magic defence"),
        RANGE_DEF(9, "Range defence"),
        SUMMONING_DEF(10, "Summoning defence"),
        ABSORB_MELEE_BONUS(11, "Absorb melee bonus"),
        ABSORB_MAGIC_BONUS(12, "Absorb magic bonus"),
        ABSORB_RANGE_BONUS(13, "Absorb range bonus"),
        STRENGTH_BONUS(14, "Strength bonus"),
        RANGED_STR_BONUS(15, "Range str bonus"),
        MAGIC_DAMAGE(17, "Magic damage"),
        PRAYER_BONUS(16, "Prayer bonus");

        private int id;
        private String name;

        BonusType(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        /**
         * Get bonus for id
         * returns null if not found
         */
        public static BonusType forId(int id) {
            for (BonusType type : BonusType.values()) {
                if (type.getId() == id) return type;
            }
            return null;
        }
    }

}
