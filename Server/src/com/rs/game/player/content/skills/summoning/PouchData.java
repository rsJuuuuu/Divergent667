package com.rs.game.player.content.skills.summoning;

import com.rs.game.item.Item;

/**
 * Created by Peng on 13.2.2017 11:58.
 */
public enum PouchData {
    FIRE_TITAN(79, 695.2, 12802, -1, Charm.BLUE, 198, 1442),
    SPIRIT_KALPHITE(25, 220.0, 12063, 12446, Charm.BLUE, 51, 3138),
    SPIRIT_LARUPIA(57, 501.6, 12784, 12840, Charm.BLUE, 155, 10095),
    SPIRIT_JELLY(55, 484.0, 12027, 12453, Charm.BLUE, 151, 1937),
    VOID_SPINNER(34, 59.6, 12780, -1, Charm.BLUE, 74, 12166),
    BULL_ANT(40, 52.8, 12087, 12431, Charm.GOLD, 11, 6010),
    GRANITE_CRAB(16, 21.6, 12009, 12533, Charm.GOLD, 7, 440),
    BRONZE_MINOTAUR(36, 316.8, 12073, 12461, Charm.BLUE, 102, 2349),
    STRANGER_PLANT(64, 281.6, 12045, 12467, Charm.CRIMSON, 128, 8431),
    DREADFOWL(4, 9.3, 12043, 12445, Charm.GOLD, 8, 2138),
    IBIS(56, 98.8, 12531, 12424, Charm.GREEN, 109, 311),
    STEEL_MINOTAUR(56, 492.8, 12077, 12463, Charm.BLUE, 141, 2353),
    PHOENIX(72, 301.0, -1, -1, Charm.CRIMSON, 165, 14616),
    EVIL_TURNIP(42, 184.8, 12051, 12448, Charm.CRIMSON, 104, 12153),
    SPIRIT_DAGANNOTH(83, 364.8, 12017, -1, Charm.CRIMSON, 1, 6155),
    VOID_TORCHER(34, 59.6, 12798, -1, Charm.BLUE, 74, 12167),
    UNICORN_STALLION(88, 154.4, 12039, 12434, Charm.GREEN, 140, 237),
    WAR_TORTOISE(67, 58.6, 12031, 12439, Charm.GOLD, 1, 7939),
    MAGPIE(47, 83.2, 12041, 12426, Charm.GREEN, 88, 1635),
    SPIRIT_CORAXATRICE(43, 75.2, -1, -1, Charm.GREEN, 88, 12119),
    ICE_TITAN(79, 695.2, 12806, -1, Charm.BLUE, 198, 1438),
    SPIRIT_SPIDER(10, 12.6, 12059, 12428, Charm.GOLD, 8, 6291),
    SPIRIT_SARATRICE(43, 75.2, -1, -1, Charm.GREEN, 88, 12113),
    MOSS_TITAN(79, 695.2, 12804, -1, Charm.BLUE, 202, 1440),
    VOID_RAVAGER(34, 59.6, 12818, -1, Charm.GREEN, 74, 12164),
    SPIRIT_COCKATRICE(43, 75.2, -1, -1, Charm.GREEN, 88, 12109),
    ADAMANT_MINOTAUR(76, 668.8, 12081, -1, Charm.BLUE, 144, 2361),
    DESERT_WYRM(18, 31.2, 12049, 12460, Charm.GREEN, 45, 1783),
    THORNY_SNAIL(1, 0.0, -1, 12459, Charm.GOLD, 0),
    ABYSSAL_TITAN(93, 163.2, 12796, 12827, Charm.GREEN, 113, 12161),
    PACK_YAK(96, 422.4, 12093, 12435, Charm.CRIMSON, 211, 10818),
    VAMPYRE_BAT(31, 136.0, 12053, 12447, Charm.CRIMSON, 81, 3325),
    SPIRIT_MOSQUITO(17, 46.5, 12778, -1, Charm.GOLD, 1, 6319),
    FORGE_REGENT(76, 134.0, 12782, 12841, Charm.GREEN, 141, 10020),
    VOID_SHIFTER(34, 59.6, 12814, -1, Charm.BLUE, 74, 12165),
    SPIRIT_TZ_KIH(22, 96.8, 12808, 12839, Charm.CRIMSON, 64, 12168),
    ABYSSAL_LURKER(62, 109.6, 12037, 12427, Charm.GREEN, 119, 12161),
    GIANT_CHINCHOMPA(29, 255.2, 12800, 12834, Charm.BLUE, 84, 9976),
    BUNYIP(68, 119.2, 12029, 12438, Charm.GREEN, 110, 383),
    WOLPERTINGER(92, 404.8, 12089, 12437, Charm.CRIMSON, 203, 3226),
    SPIRIT_TERRORBIRD(52, 68.4, 12007, 12441, Charm.GOLD, 12, 9978),
    MOSQUITO(1, 0.0, -1, 12838, Charm.GOLD, 0),
    ABYSSAL_PARASITE(54, 94.8, 12035, 12454, Charm.GREEN, 106, 12161),
    FRUIT_BAT(69, 121.2, 12033, 12423, Charm.GREEN, 130, 1963),
    SPIRIT_KYATT(57, 501.6, 12812, 12836, Charm.BLUE, 153, 10103),
    MITHRIL_MINOTAUR(66, 580.8, 12079, -1, Charm.BLUE, 152, 2359),
    BLOATED_LEECH(49, 215.2, 12061, 12444, Charm.CRIMSON, 117, 2132),
    OBSIDIAN_GOLEM(73, 642.4, 12792, -1, Charm.BLUE, 195, 12168),
    BARKER_TOAD(66, 87.0, 12123, 12452, Charm.GOLD, 11, 2150),
    IRON_MINOTAUR(46, 404.8, 12075, 12462, Charm.BLUE, 125, 2351),
    COMPOST_MOUND(28, 49.8, 12091, 12440, Charm.GREEN, 47, 6032),
    SWAMP_TITAN(85, 373.6, 12776, 12832, Charm.CRIMSON, 150, 10149),
    ARCTIC_BEAR(71, 93.2, 12057, 12451, Charm.GOLD, 14, 10117),
    KARAMTHULHU_OVERLORD(58, 510.4, -1, -1, Charm.BLUE, 144, 6667),
    RAVENOUS_LOCUST(70, 132.0, 12820, 12830, Charm.CRIMSON, 79, 1933),
    SMOKE_DEVIL(61, 268.0, 12085, 12468, Charm.CRIMSON, 141, 9736),
    PYRELORD(46, 202.4, 12816, 12829, Charm.CRIMSON, 111, 590),
    GIANT_ENT(78, 136.8, 12013, 12457, Charm.GREEN, 124, 5933),
    HONEY_BADGER(32, 140.8, 12065, 12433, Charm.CRIMSON, 84, 12156),
    GEYSER_TITAN(89, 783.2, 12786, 12833, Charm.BLUE, 222, 1444),
    SPIRIT_COCKATRICES_AND_OTHER_VARIANTS(1, 0.0, -1, 12458, Charm.GOLD, 0),
    SPIRIT_GRAAHK(57, 501.6, 12810, 12835, Charm.BLUE, 154, 10099),
    RUNE_MINOTAUR(86, 756.8, 12083, 12466, Charm.BLUE, 1, 2363),
    STEEL_TITAN(99, 435.2, 12790, 12825, Charm.CRIMSON, 178, 1119),
    TALON_BEAST(77, 1015.2, 12794, 12831, Charm.CRIMSON, 174, 12162),
    GRANITE_LOBSTER(1, 0.0, -1, 12449, Charm.GOLD, 0),
    HYDRA(80, 140.8, 12025, 12442, Charm.GREEN, 128, 571),
    PRAYING_MANTIS(75, 329.6, 12011, 12450, Charm.CRIMSON, 168, 2460),
    LAVA_TITAN(83, 730.4, 12788, 12837, Charm.BLUE, 219, 12168),
    IRON_TITAN(95, 417.6, 12822, 12828, Charm.CRIMSON, 198, 1115),
    BEAVER(33, 57.6, 12021, 12429, Charm.GREEN, 72, 1519),
    ALBINO_RAT(23, 202.4, 12067, 12430, Charm.BLUE, 75, 2134),
    PHOENIX_AND_REBORN_PHOENIX(1, 0.0, -1, 14622, Charm.GOLD, 0),
    SPIRIT_WOLF(1, 4.8, 12047, 12425, Charm.GOLD, 7, 2859),
    MACAW(41, 72.4, 12071, 12422, Charm.GREEN, 78, 249),
    SPIRIT_SCORPION(19, 83.2, 12055, 12432, Charm.CRIMSON, 57, 3095);

    private int level;
    private int pouchId;
    private int scrollId;
    private int charmId;
    private int shardAmount;

    private double creationExp;

    private int[] tertiaryIds;

    PouchData(int level, double creationExp, int pouchId, int scrollId, Charm charm, int shards, int... tertiaryIds) {
        this.level = level;
        this.pouchId = pouchId;
        this.scrollId = scrollId;
        this.charmId = charm.getId();
        this.creationExp = creationExp;
        this.shardAmount = shards;
        this.tertiaryIds = tertiaryIds;
    }

    public int getScrollId() {
        return scrollId;
    }

    public int getPouchId() {
        return pouchId;
    }

    public static PouchData forPouchId(int id) {
        for (PouchData data : PouchData.values())
            if (id == data.getPouchId()) return data;
        return null;
    }

    public int getLevel() {
        return level;
    }

    public int getTertiaryId() {
        return tertiaryIds[0];
    }

    public Item[] getItems() {
        return new Item[]{new Item(charmId), new Item(12183, shardAmount), new Item(tertiaryIds[0])};
    }

    public double getCreationExp() {
        return creationExp;
    }

    public int getCharmId() {
        return charmId;
    }

    public int getShardAmount() {
        return shardAmount;
    }

    public int[] getTertiaryIds() {
        return tertiaryIds;
    }
    }
