package com.rs.game.player.content.skills.construction;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.areas.Point;
import com.rs.utils.areas.Rectangle;

import java.util.ArrayList;

import static com.rs.game.player.content.skills.construction.Furniture.FurnitureObj.*;

public class Furniture {

    /**
     * Common ids
     */
    private static final int HAMMER = 2347, SAW = 8794, IRON_BAR = 2351, LIMESTONE_BRICKS = 3420, SOFT_CLAY = 1761,
            MARBLE_BLOCK = 8786, PLANK = 960, NAILS = 1539, OAK_PLANK = 8778, TEAK_PLANK = 8780, MAHOGANY_PLANK =
            8782, BOLT_OF_CLOTH = 8790, STEEL_BAR = 2353, GOLD_LEAF = 8784, MOLTEN_GLASS = 1775;

    /**
     * Areas
     */
    private static final Rectangle[] COMBAT_RING_AREA = new Rectangle[]{new Rectangle(1, 1, 6, 6)};
    private static final Rectangle[] AROUND_DOORS_AREA = new Rectangle[]{new Point(2, 0), new Point(5, 0), new Point
            (7, 2), new Point(7, 5), new Point(5, 7), new Point(2, 7), new Point(0, 5), new Point(0, 2)};

    public enum Builds {
        /**
         * Parlour
         */
        PARLOUR_CHAIRS(new int[]{15410, 15411, 15412}, false, CRUDE_WOODEN_CHAIR, WOODEN_CHAIR, ROCKING_CHAIR,
                OAK_CHAIR, OAK_ARMCHAIR, TEAK_ARMCHAIR, MAHOGANY_ARMCHAIR),
        /**
         * Kitchen
         */
        KITCHEN_SHELVES(15400, false, WOODEN_SHELVES_1, WOODEN_SHELVES_2, WOODEN_SHELVES_3, OAK_SHELVES_1,
                OAK_SHELVES_2, TEAK_SHELVES_1, TEAK_SHELVES_2) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Rectangle(1, 7, 1, 7), new Rectangle(6, 7, 6, 7)};
            }
        },
        LARDER(15403, false, WOODEN_LARDER, OAK_LARDER, TEAK_LARDER),
        SINK(15404, false, PUMP_AND_DRAIN, PUMP_AND_TUB, NORMAL_SINK),
        KITCHEN_TABLE(15405, false, WOODEN_KITCHEN_TABLE, OAK_KITCHEN_TABLE, TEAK_KITCHEN_TABLE),
        CAT_BLANKET(15402, false, NORMAL_CAT_BLANKET, CAT_BASKET, CUSHIONED_CAT_BASKET),
        STOVE(15398, false, FIREPIT, FIREPIT_WITH_HOOK, FIREPIT_WITH_POT, SMALL_OVEN, LARGE_OVEN, STEEL_RANGE,
                FANCY_RANGE),
        SHELVES_2(15399, false, WOODEN_SHELVES_1, WOODEN_SHELVES_2, WOODEN_SHELVES_3, OAK_SHELVES_1, OAK_SHELVES_2,
                TEAK_SHELVES_1, TEAK_SHELVES_2),
        BARRELS(15401, false, BEER_BARREL, CIDER_BARREL, ASGARNIAN_ALE, GREENMAN_ALE, DRAGON_BITTER_ALE, CHEFS_DELIGHT),
        /**
         * Garden
         */
        CENTREPIECE(15361, false, EXIT_PORTAL, DECORATIVE_ROCK, POND, IMP_STATUE, DUNGEON_ENTRACE),
        BIG_TREE(15362, true, BIG_DEATH_TREE, BIG_NICE_TREE, BIG_OAK_TREE, BIG_WILLOW_TREE, BIG_MAPLE_TREE,
                BIG_YEW_TREE, BIG_MAGIC_TREE),
        TREE(15363, true, DEATH_TREE, NICE_TREE, OAK_TREE, WILLOW_TREE, MAPLE_TREE, YEW_TREE, MAGIC_TREE),
        SMALL_PLANT_1(15366, true, PLANT, SMALL_FERN, FERN),
        SMALL_PLANT_2(15367, true, DOCK_LEAF, THISTLE, REEDS),
        BIG_PLANT_1(15364, true, FERN_B, BUSH, TALL_PLANT),
        BIG_PLANT_2(15365, true, SHORT_PLANT, LARGE_LEAF_PLANT, HUGE_PLANT),
        /**
         * Dining room
         */
        DINING_BENCH_1(15300, false, WOOD_BENCH, OAK_BENCH, CARVED_OAK_BENCH, TEAK_BENCH, CARVED_TEAK_BENCH,
                MAHOGANY_BENCH, GILDED_BENCH) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Rectangle(5, 2, 2, 2)};
            }
        },
        DINING_BENCH_2(15299, false, WOOD_BENCH, OAK_BENCH, CARVED_OAK_BENCH, TEAK_BENCH, CARVED_TEAK_BENCH,
                MAHOGANY_BENCH, GILDED_BENCH) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Rectangle(2, 5, 5, 5)};
            }
        },
        DINING_TABLE(15298, false, WOOD_DINING, OAK_DINING, CARVED_OAK_DINING, TEAK_DINING, CARVED_TEAK_DINING,
                MAHOGANY_DINING, OPULENT_TABLE),

        ROPE_BELL_PULL(15304, false, NORMAL_ROPE_BELL_PULL, BELL_PULL, POSH_BELL_PULL),
        /**
         * Workshop
         */
        REPAIR(15448, false, REPAIR_BENCH, WHETSTONE, ARMOUR_STAND),
        WORKBENCH(15439, false, WOODEN_WORKBENCH, OAK_WORKBENCH, STEEL_FRAMED_WORKBENCH, BENCH_WITH_VICE,
                BENCH_WITH__A_LATHE),
        CRAFTING(15441, false, CRAFTING_TABLE, CRAFTING_TABLE_2, CRAFTING_TABLE_3, CRAFTING_TABLE_4),
        TOOLS(new int[]{15443, 15444, 15445, 15446, 15447}, false, TOOL_STORE_1, TOOL_STORE_2, TOOL_STORE_3,
                TOOL_STORE_4, TOOL_STORE_5),
        HERALDRY(15450, false, PLUMING_STAND, SHIELD_EASEL, BANNER_EASEL),
        /**
         * Skill hall 1
         */
        HEAD_TROPHY(15382, false, CRAWLING_HAND, COCKATRICE_HEAD, BASALISK_HEAD, KURASK, ABBYSAL_DEMON,
                KING_BLACK_DRAGON, KALPHITE_QUEEN),
        MOUNTED_FISH(15383, false, MOUNTED_BASS, MOUNTED_SWORDFISH, MOUNTED_SHARK),
        RUNE_CASE(15386, false, RUNE_CASE_1, RUNE_CASE_2),
        DECORATIVE_ARMOUR(15384, false, BASIC_DECORATIVE, DETAILED_DECORATIVE, INTRICATE_DECORATIVE,
                PROFOUND_DECORATIVE),
        BASIC_ARMOURS(34255, false, MITHRIL_ARMOUR, ADAMANT_ARMOUR, RUNITE_ARMOUR) // BEDROOM
        ,
        /**
         * Bedroom
         */
        DRESSERS(15262, false, SHAVING_STAND, OAK_SHAVING_STAND, OAK_DRESSER, TEAK_DRESSER, FANCY_TEAK_DRESSER,
                MAHOGANY_DRESSER, GILDED_DRESSER),
        CLOCKS(15268, false, OAK_CLOCK, TEAK_CLOCK, GILDED_CLOCK),
        WARDROBE(15261, false, SHOE_BOX, OAK_DRAWERS, OAK_WARDROBE, TEAK_DRAWERS, TEAK_WARDROBE, MAHOGANY_WARDROBE,
                GILDED_WARDROBE),
        BED(15260, false, WOODEN_BED, OAK_BED, LARGE_OAK_BED, TEAK_BED, LARGE_TEAK_BED, MAHOGANY_BED,
                LARGE_MAHOGANY_BED),
        /**
         * Games room
         */
        ELEMENTAL_BALANCE(15345, false, ELEMENTAL_BALANCE_1, ELEMENTAL_BALANCE_2, ELEMENTAL_BALANCE_3),
        ATTACK_STONE(15344, false, CLAY_ATTACK_STONE, LIMESTONE_ATTACK_STONE, MARBLE_ATTACK_STONE),
        RANGING_GAME(15346, false, HOOP_AND_STICK, DART_BOARD, ARCHERY_TARGET),
        GAME(15342, false, JESTER, TREASURE_HUNT, HANGMAN),
        GAME_CHEST(15343, false, OAK_PRIZE_CHEST, TEAK_PRIZE_CHEST, GILDED_PRIZE_CHEST),
        /**
         * Combat room
         */
        WEAPONS_RACK(15296, false, GLOVE_RACK, WEAPON_RACK, EXTRA_WEAPON_RACK),
        COMBAT_RING(new int[]{15277, 15278, 15279, 15280, 15281, 15282, 15286, 15287, 15289, 15290, 15294, 15295,
                15288, 15291, 15293, 15292}, false, BOXING_RING, FENCING_RING, NORMAL_COMBAT_RING) {
            @Override
            public Rectangle[] getAreas() {
                return COMBAT_RING_AREA;
            }
        },
        /**
         * Quest hall
         */
        SWORD(15395, false, SILVERLIGHT_SWORD, EXCALIBER_SWORD, DARKLIGHT_SWORD),
        MAP(15396, false, MAP_SMALL, MAP_MEDIUM, MAP_LARGE),
        LANDSCAPE(15393, false, LUMBRIDGE, DESERT, MORTANYIA, KARAMJA, ISFADAR),
        PORTRAIT(15392, false, KING_ARTHUR, ELENA, GIANT_DWARF, MISCELLENIA),
        GUILD_TROPHY(15394, false, ANTIDRAGON_SHIELD, GLORY, CAPE_OF_LEGENDS),
        /**
         * Study
         */
        CHARTS(15423, false, ALCHEMICAL_CHART, ASTRONOMICAL_CHART, INFERNAL),
        STUDY_STATUE(48662, false, LECTURN_STATUE),
        GLOBE(15421, false, NORMAL_GLOBE, ORNAMENTAL_GLOBE, LUNAR_GLOBE, CELESTIAL_GLOBE, ARMILLARY_SPHERE,
                SMALL_ORRERY, LARGE_ORRERY),
        LECTERN(15420, false, EAGLE_LECTURN, DEMON_LECTURN, TEAK_EAGLE_LECTURN, TEAK_DEMON_LECTURN,
                MAHOGANY_EAGLE_LECTURN, MAHOGANY_DEMON_LECTURN),
        CRYSTAL_BALL(15422, false, NORMAL_CRYSTAL_BALL, ELEMENTAL_SPHERE, CRYSTAL_OF_POWER),
        TELESCOPE(15424, false, WOODEN_TELESCOPE, TEAK_TELESCOPE, MAHOGANY_TELESCOPE),
        /**
         * Portals
         */
        PORTALS1(new int[]{15406, 15407, 15408}, false, VARROCKP, LUMBRIDGEP, FALADORP, CAMELOTP, ARDOUGNEP,
                YANILLEP, KHARYRLLP),
        FOCUS(15409, false, TELEPORT_FOCUS, GREATER_FOCUS, SCRYING_POOL),
        /**
         * Chapel
         */
        ALTAR(15270, false, OAK_ALTAR, TEAK_ALTAR, CLOTH_ALTAR, MAHOGANY_ALTAR, LIMESTONE_ALTAR, MARBLE_ALTAR,
                GUILDED_ALTAR),
        LAMP(15271, false, STEEL_TORCHES, WOODEN_TORCHES, STEEL_CANDLESTICK, GOLD_CANDLESTICK, INSCENCE_BURNER,
                MAHOGANY_BURNER, MARBLE_BURNER) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Point(1, 5), new Point(6, 5)};
            }
        },
        ICON(15269, false, GUTHIX_SYMBOL, SARADOMIN_SYMBOL, ZAMORAK_SYMBOL, GUTHIX_ICON, SARADOMIN_ICON,
                ZAMORAK_ICON, ICON_OF_BOB),
        MUSICAL(15276, false, WIND_CHIMES, BELLS, ORGAN),
        STATUES(15275, false, SMALL_STATUE, MEDIUM_STATUE, LARGE_STATUE),
        WINDOW(new int[]{13730, 13728, 13732, 13729, 13733, 13731, 7101}, false, SHUTTERED_WINDOW, DECORATIVE_WINDOW,
                STAINED_GLASS) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Point(2, 7), new Point(0, 5), new Point(0, 2), new Point(7, 2), new Point
                        (7, 5), new Point(5, 7)};
            }
        },
        /**
         * Shared
         */
        CURTAINS(new int[]{15419, 15263, 15302}, false, TORN_CURTAINS, NORMAL_CURTAINS, OPULENT_CURTAINS) {
            @Override
            public Rectangle[] getAreas() {
                return AROUND_DOORS_AREA;
            }
        },
        RUG(new int[]{15379, 15378, 15377, 15266, 15265, 15264, 15274, 15273, 15415, 15414, 15413, 15389, 15388,
                15387}, false, BROWN_RUG, NORMAL_RUG, OPULENT_RUG) {
            @Override
            public Rectangle[] getAreas() {
                return new Rectangle[]{new Rectangle(0, 0, 7, 7)};
            }
        },
        FIREPLACE(new int[]{15267, 15418, 15301}, false, CLAY_FIREPLACE, STONE_FIREPLACE, MARBLE_FIREPLACE),
        BOOKCASE(new int[]{15416, 15953, 15425}, false, WOODEN_BOOKCASE, OAK_BOOKCASE, MAHOGANY_BOOKCASE),
        STAIRCASE(new int[]{15380, 15390}, false, OAK_STAIRCASE, TEAK_STAIRCASE, SPIRAL_STAIRCASE, MARBLE_STAIRCASE,
                MARBLE_SPIRAL),

        DECORATIONS(new int[]{15297, 15303}, false, OAK_DECORATION, TEAK_DECORATION, GILDED_DECORATION) {
            @Override
            public Rectangle[] getAreas() {
                return AROUND_DOORS_AREA;
            }
        };

        private int[] ids;
        private boolean water;
        private FurnitureObj[] pieces;

        Builds(int id, boolean water, FurnitureObj... pieces) {
            this(new int[]{id}, water, pieces);
        }

        Builds(int[] ids, boolean water, FurnitureObj... pieces) {
            this.ids = ids;
            this.water = water;
            this.pieces = pieces;
        }

        public boolean containsId(int id) {
            return getIdSlot(id) != -1;
        }

        public int getIdSlot(int id) {
            for (int i = 0; i < ids.length; i++)
                if (ids[i] == id) return i;
            return -1;
        }

        public int getId() {
            return ids[0];
        }

        public int getIds() {
            return ids[0];
        }

        public boolean containsObject(WorldObject object) {
            for (FurnitureObj o : getPieces())
                for (int id : o.getIds())
                    if (object.getId() == id) return true;
            return false;
        }

        public FurnitureObj[] getPieces() {
            return pieces;
        }

        public boolean isWater() {
            return water;
        }

        public Rectangle[] getAreas() {
            return null;
        }

    }

    enum FurnitureObj {
        EXIT_PORTAL(8168, 13405, 1, 100, new Item(IRON_BAR, 10)),
        DECORATIVE_ROCK(8169, 13406, 5, 100, new Item(LIMESTONE_BRICKS, 5)),
        POND(8170, 13407, 10, 100, new Item(SOFT_CLAY, 10)),
        IMP_STATUE(8171, 13408, 15, 150, new Item(LIMESTONE_BRICKS, 5), new Item(SOFT_CLAY, 5)),
        DUNGEON_ENTRACE(8172, 13409, 70, 500, new Item(MARBLE_BLOCK, 1)),
        BIG_DEATH_TREE(8173, 13411, 5, 31, new Item(8417)),
        BIG_NICE_TREE(8174, 13412, 10, 44, new Item(8419)),
        BIG_OAK_TREE(8175, 13413, 15, 70, new Item(8421)),
        BIG_WILLOW_TREE(8176, 13414, 30, 100, new Item(8423)),
        BIG_MAPLE_TREE(8177, 13415, 45, 122, new Item(8425)),
        BIG_YEW_TREE(8178, 13416, 60, 141, new Item(8427)),
        BIG_MAGIC_TREE(8179, 13417, 75, 223, new Item(8429)),
        DEATH_TREE(8173, 13418, 5, 31, new Item(8417)),
        NICE_TREE(8174, 13419, 10, 44, new Item(8419)),
        OAK_TREE(8175, 13420, 15, 70, new Item(8421)),
        WILLOW_TREE(8176, 13421, 30, 100, new Item(8423)),
        MAPLE_TREE(8178, 13422, 45, 122, new Item(8425)),
        YEW_TREE(8177, 13423, 60, 141, new Item(8427)),
        MAGIC_TREE(8179, 13424, 75, 223, new Item(8429)),
        PLANT(8180, 13431, 1, 31, new Item(8431)),
        SMALL_FERN(8181, 13432, 6, 70, new Item(8433)),
        FERN(8182, 13433, 12, 100, new Item(8435)),
        DOCK_LEAF(8183, 13434, 1, 31, new Item(8431)),
        THISTLE(8184, 13435, 6, 70, new Item(8433)),
        REEDS(8185, 13436, 12, 100, new Item(8435)),
        FERN_B(8186, 13425, 1, 31, new Item(8431)),
        BUSH(8187, 13426, 6, 70, new Item(8433)),
        TALL_PLANT(8188, 13427, 12, 100, new Item(8435)),
        SHORT_PLANT(8189, 13428, 1, 31, new Item(8431)),
        LARGE_LEAF_PLANT(8190, 13429, 6, 70, new Item(8433)),
        HUGE_PLANT(8191, 13430, 12, 100, new Item(8435)),
        CRUDE_WOODEN_CHAIR(8309, 13581, 1, 66, new Item(PLANK, 2), new Item(NAILS, 2)),
        WOODEN_CHAIR(8310, 13582, 8, 96, new Item(PLANK, 3), new Item(NAILS, 3)),
        ROCKING_CHAIR(8311, 13583, 14, 99, new Item(PLANK, 3), new Item(NAILS, 3)),
        OAK_CHAIR(8312, 13584, 19, 120, new Item(OAK_PLANK, 2)),
        OAK_ARMCHAIR(8313, 13585, 26, 180, new Item(OAK_PLANK, 3)),
        TEAK_ARMCHAIR(8314, 13586, 35, 180, new Item(TEAK_PLANK, 2)),
        MAHOGANY_ARMCHAIR(8315, 13587, 50, 280, new Item(MAHOGANY_PLANK, 2)),
        CLAY_FIREPLACE(8325, 13609, 3, 30, new Item(SOFT_CLAY, 3)),
        STONE_FIREPLACE(8326, 13611, 33, 40, new Item(LIMESTONE_BRICKS, 2)),
        MARBLE_FIREPLACE(8327, 13613, 63, 500, new Item(MARBLE_BLOCK, 1)),
        TORN_CURTAINS(8322, 13603, 2, 132, new Item(PLANK, 3), new Item(BOLT_OF_CLOTH, 3), new Item(NAILS, 3)),
        NORMAL_CURTAINS(8323, 13604, 18, 225, new Item(OAK_PLANK, 3), new Item(BOLT_OF_CLOTH, 3)),
        OPULENT_CURTAINS(8324, 13605, 40, 315, new Item(TEAK_PLANK, 3), new Item(BOLT_OF_CLOTH, 3)),
        WOODEN_BOOKCASE(8319, 13597, 4, 115, new Item(PLANK, 4), new Item(NAILS, 4)),
        OAK_BOOKCASE(8320, 13598, 29, 180, new Item(OAK_PLANK, 3)),
        MAHOGANY_BOOKCASE(8321, 13599, 40, 420, new Item(MAHOGANY_PLANK, 3)),
        BROWN_RUG(8316, new int[]{13588, 13589, 13590}, 2, 30, new Item(BOLT_OF_CLOTH, 2)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15274:
                    case 15415:
                    case 15266:
                    case 15379:
                        return 13588;
                    case 15273:
                    case 15414:
                    case 15265:
                    case 15378:
                        return 13589;
                    default:
                        return 13590;
                }
            }
        },
        NORMAL_RUG(8317, new int[]{13591, 13592, 13593}, 13, 60, new Item(BOLT_OF_CLOTH, 4)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15274:
                    case 15415:
                    case 15266:
                    case 15379:
                        return 13591;
                    case 15273:
                    case 15414:
                    case 15265:
                    case 15378:
                        return 13592;
                    default:
                        return 13593;
                }
            }
        },
        OPULENT_RUG(8318, new int[]{13594, 13595, 13596}, 65, 360, new Item(BOLT_OF_CLOTH, 4), new Item(GOLD_LEAF, 1)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15274:
                    case 15415:
                    case 15266:
                    case 15379:
                        return 13594;
                    case 15273:
                    case 15414:
                    case 15265:
                    case 15378:
                        return 13595;
                    default:
                        return 13596;
                }
            }
        },
        OAK_STAIRCASE(8249, 13497, 27, 680, new Item(OAK_PLANK, 10), new Item(STEEL_BAR, 4)),
        OAK_STAIRCASE_DOWN(8249, 13498, 27, 680, new Item(OAK_PLANK, 10), new Item(STEEL_BAR, 4)),
        TEAK_STAIRCASE(8252, 13499, 48, 980, new Item(TEAK_PLANK, 10), new Item(STEEL_BAR, 4)),
        TEAK_STAIRCASE_DOWN(8258, 13500, 48, 980, new Item(TEAK_PLANK, 10), new Item(STEEL_BAR, 4)),
        SPIRAL_STAIRCASE(8258, 13503, 67, 1040, new Item(TEAK_PLANK, 10), new Item(LIMESTONE_BRICKS, 7)),
        MARBLE_STAIRCASE(8255, 13501, 82, 3200, new Item(MAHOGANY_PLANK, 5), new Item(MARBLE_BLOCK, 5)),
        MARBLE_STAIRCASE_DOWN(8255, 13502, 82, 3200, new Item(MAHOGANY_PLANK, 5), new Item(MARBLE_BLOCK, 5)),
        MARBLE_SPIRAL(8259, 13505, 97, 4400, new Item(TEAK_PLANK, 10), new Item(MARBLE_BLOCK, 7)),
        CRAWLING_HAND(8260, 13481, 38, 211, new Item(TEAK_PLANK, 2), new Item(7982)),
        COCKATRICE_HEAD(8261, 13482, 38, 224, new Item(TEAK_PLANK, 2), new Item(7983)),
        BASALISK_HEAD(8262, 13483, 38, 243, new Item(TEAK_PLANK, 2), new Item(7984)),
        KURASK(8263, 13484, 58, 357, new Item(MAHOGANY_PLANK, 2), new Item(7985)),
        ABBYSAL_DEMON(8264, 13485, 58, 389, new Item(MAHOGANY_PLANK, 2), new Item(7986)),
        KING_BLACK_DRAGON(8265, 13486, 78, 1103, new Item(MAHOGANY_PLANK, 2), new Item(7987, 1), new Item(GOLD_LEAF,
                2)),
        KALPHITE_QUEEN(8266, 13487, 78, 1103, new Item(MAHOGANY_PLANK, 2), new Item(7988, 1), new Item(GOLD_LEAF, 2)),
        MOUNTED_BASS(8267, 13488, 36, 151, new Item(OAK_PLANK, 2), new Item(7989)),
        MOUNTED_SWORDFISH(8268, 13489, 56, 230, new Item(TEAK_PLANK, 2), new Item(7991)),
        MOUNTED_SHARK(8269, 13490, 76, 350, new Item(MAHOGANY_PLANK, 2), new Item(7993)),
        RUNE_CASE_1(8276, 13507, 41, 190, new Item(TEAK_PLANK, 2), new Item(MOLTEN_GLASS, 2), new Item(554), new Item
                (555), new Item(556), new Item(557)),
        RUNE_CASE_2(8277, 13508, 41, 212, new Item(TEAK_PLANK, 2), new Item(MOLTEN_GLASS, 2), new Item(559), new Item
                (560), new Item(561), new Item(562)),
        BASIC_DECORATIVE(8273, 34256, 28, 135, new Item(OAK_PLANK, 2), new Item(4069), new Item(4071), new Item(4072)),
        DETAILED_DECORATIVE(8274, 34263, 28, 150, new Item(OAK_PLANK, 2), new Item(4504), new Item(4506), new Item
                (4507)),
        INTRICATE_DECORATIVE(8275, 34280, 28, 165, new Item(OAK_PLANK, 2), new Item(4509), new Item(4511), new Item
                (4512)),
        PROFOUND_DECORATIVE(18755, 34281, 28, 180, new Item(OAK_PLANK, 2), new Item(18708), new Item(18707), new Item
                (18709)),
        MITHRIL_ARMOUR(8270, 13491, 28, 135, new Item(OAK_PLANK, 2), new Item(1159), new Item(1085), new Item(1121)),
        ADAMANT_ARMOUR(8271, 13492, 28, 150, new Item(OAK_PLANK, 2), new Item(1161), new Item(1091), new Item(1123)),
        RUNITE_ARMOUR(8272, 13493, 28, 165, new Item(OAK_PLANK, 2), new Item(1163), new Item(1093), new Item(1127)),
        WOODEN_BED(8031, 13148, 20, 117, new Item(PLANK, 3), new Item(NAILS, 3), new Item(BOLT_OF_CLOTH, 2)),
        OAK_BED(8032, 13149, 30, 210, new Item(OAK_PLANK, 3), new Item(BOLT_OF_CLOTH, 2)),
        LARGE_OAK_BED(8033, 13150, 34, 330, new Item(OAK_PLANK, 5), new Item(BOLT_OF_CLOTH, 2)),
        TEAK_BED(8034, 13151, 40, 300, new Item(TEAK_PLANK, 3), new Item(BOLT_OF_CLOTH, 2)),
        LARGE_TEAK_BED(8035, 13152, 45, 480, new Item(TEAK_PLANK, 5), new Item(BOLT_OF_CLOTH, 2)),
        MAHOGANY_BED(8036, 13153, 53, 450, new Item(MAHOGANY_PLANK, 3), new Item(BOLT_OF_CLOTH, 2)),
        LARGE_MAHOGANY_BED(8037, 13154, 60, 1330, new Item(MAHOGANY_PLANK, 5), new Item(BOLT_OF_CLOTH, 2), new Item
                (GOLD_LEAF, 2)),
        SHAVING_STAND(8045, 13162, 21, 30, new Item(PLANK, 1), new Item(NAILS, 1), new Item(MOLTEN_GLASS, 1)),
        OAK_SHAVING_STAND(8046, 13163, 29, 61, new Item(OAK_PLANK, 1), new Item(MOLTEN_GLASS, 1)),
        OAK_DRESSER(8047, 13164, 37, 121, new Item(OAK_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        TEAK_DRESSER(8048, 13165, 46, 181, new Item(TEAK_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        FANCY_TEAK_DRESSER(8049, 13166, 56, 182, new Item(TEAK_PLANK, 2), new Item(MOLTEN_GLASS, 2)),
        MAHOGANY_DRESSER(8050, 13167, 64, 261, new Item(MAHOGANY_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        GILDED_DRESSER(8051, 13168, 74, 582, new Item(MAHOGANY_PLANK, 2), new Item(MOLTEN_GLASS, 2), new Item
                (GOLD_LEAF, 1)),
        OAK_CLOCK(8052, 13169, 25, 142, new Item(OAK_PLANK, 2), new Item(8792)),
        TEAK_CLOCK(8053, 13170, 25, 142, new Item(TEAK_PLANK, 2), new Item(8792)),
        GILDED_CLOCK(8054, 13171, 25, 142, new Item(MAHOGANY_PLANK, 2), new Item(8792, 1), new Item(GOLD_LEAF, 1)),
        SHOE_BOX(8038, 13155, 20, 58, new Item(PLANK, 2), new Item(NAILS, 2)),
        OAK_DRAWERS(8039, 13156, 27, 120, new Item(OAK_PLANK, 2)),
        OAK_WARDROBE(8040, 13157, 39, 180, new Item(OAK_PLANK, 3)),
        TEAK_DRAWERS(8041, 13158, 51, 180, new Item(TEAK_PLANK, 2)),
        TEAK_WARDROBE(8042, 13159, 63, 270, new Item(TEAK_PLANK, 3)),
        MAHOGANY_WARDROBE(8043, 13160, 75, 420, new Item(MAHOGANY_PLANK, 3)),
        GILDED_WARDROBE(8044, 13161, 87, 720, new Item(MAHOGANY_PLANK, 3), new Item(GOLD_LEAF, 1)),
        TELEPORT_FOCUS(8331, 13640, 50, 40, new Item(LIMESTONE_BRICKS, 2)),
        GREATER_FOCUS(8332, 13641, 65, 500, new Item(MARBLE_BLOCK, 1)),
        SCRYING_POOL(8333, 13639, 80, 2000, new Item(MARBLE_BLOCK, 4)),
        VARROCKP(8330, 13629, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 100), new Item(554, 100), new Item
                (556, 300)),
        LUMBRIDGEP(8330, 13630, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 100), new Item(557, 100), new Item
                (556, 300)),
        FALADORP(8330, 13631, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 100), new Item(555, 100), new Item
                (556, 300)),
        CAMELOTP(8330, 13632, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 100), new Item(556, 500)),
        ARDOUGNEP(8330, 13633, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 200), new Item(555, 200)),
        YANILLEP(8330, 13634, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 200), new Item(557, 200)),
        KHARYRLLP(8330, 13635, 80, 1500, new Item(MARBLE_BLOCK, 3), new Item(563, 200), new Item(565, 200)),
        WOODEN_LARDER(8233, 13565, 9, 228, new Item(PLANK, 8), new Item(NAILS, 8)),
        OAK_LARDER(8234, 13566, 33, 480, new Item(OAK_PLANK, 8)),
        TEAK_LARDER(8235, 13567, 43, 750, new Item(TEAK_PLANK, 8), new Item(BOLT_OF_CLOTH, 2)),
        PUMP_AND_DRAIN(8230, 13559, 7, 100, new Item(STEEL_BAR, 5)),
        PUMP_AND_TUB(8231, 13561, 27, 200, new Item(STEEL_BAR, 10)),
        NORMAL_SINK(8232, 13563, 47, 300, new Item(STEEL_BAR, 15)),
        WOODEN_KITCHEN_TABLE(8246, 13577, 12, 87, new Item(PLANK, 3), new Item(NAILS, 3)),
        OAK_KITCHEN_TABLE(8247, 13578, 32, 180, new Item(OAK_PLANK, 3)),
        TEAK_KITCHEN_TABLE(8248, 13579, 52, 270, new Item(TEAK_PLANK, 3)),
        NORMAL_CAT_BLANKET(8236, 13574, 5, 15, new Item(BOLT_OF_CLOTH, 1)),
        CAT_BASKET(8237, 13575, 19, 58, new Item(PLANK, 2), new Item(NAILS, 2)),
        CUSHIONED_CAT_BASKET(8238, 13576, 33, 58, new Item(PLANK, 2), new Item(NAILS, 2), new Item(1737, 2)),
        FIREPIT(8216, 13528, 5, 40, new Item(STEEL_BAR, 1), new Item(SOFT_CLAY, 2)),
        FIREPIT_WITH_HOOK(8217, 13529, 11, 60, new Item(STEEL_BAR, 2), new Item(SOFT_CLAY, 2)),
        FIREPIT_WITH_POT(8218, 13531, 17, 80, new Item(STEEL_BAR, 3), new Item(SOFT_CLAY, 2)),
        SMALL_OVEN(8219, 13533, 24, 80, new Item(STEEL_BAR, 4)),
        LARGE_OVEN(8220, 13536, 29, 100, new Item(STEEL_BAR, 5)),
        STEEL_RANGE(8221, 13539, 34, 120, new Item(STEEL_BAR, 6)),
        FANCY_RANGE(8222, 13542, 42, 160, new Item(STEEL_BAR, 8)),
        WOODEN_SHELVES_1(8223, 13545, 6, 87, new Item(PLANK, 3), new Item(NAILS, 3)),
        WOODEN_SHELVES_2(8224, 13546, 12, 147, new Item(PLANK, 3), new Item(NAILS, 3), new Item(SOFT_CLAY, 3)),
        WOODEN_SHELVES_3(8225, 13547, 23, 147, new Item(PLANK, 3), new Item(NAILS, 3), new Item(SOFT_CLAY, 6)),
        OAK_SHELVES_1(8226, 13548, 34, 240, new Item(OAK_PLANK, 3), new Item(SOFT_CLAY, 6)),
        OAK_SHELVES_2(8227, 13549, 45, 240, new Item(OAK_PLANK, 3), new Item(SOFT_CLAY, 6)),
        TEAK_SHELVES_1(8228, 13550, 56, 330, new Item(TEAK_PLANK, 3), new Item(SOFT_CLAY, 6)),
        TEAK_SHELVES_2(8229, 13551, 67, 930, new Item(TEAK_PLANK, 3), new Item(SOFT_CLAY, 6), new Item(GOLD_LEAF, 2)),
        BEER_BARREL(8239, 13568, 7, 87, new Item(PLANK, 3), new Item(NAILS, 3)),
        CIDER_BARREL(8240, 13569, 12, 91, new Item(PLANK, 3), new Item(NAILS, 3), new Item(5763, 8)),
        ASGARNIAN_ALE(8241, 13570, 18, 184, new Item(OAK_PLANK, 3), new Item(5763, 8)),
        GREENMAN_ALE(8242, 13571, 26, 184, new Item(OAK_PLANK, 3), new Item(1909, 8)),
        DRAGON_BITTER_ALE(8243, 13572, 36, 224, new Item(OAK_PLANK, 3), new Item(1911, 8), new Item(STEEL_BAR, 2)),
        CHEFS_DELIGHT(8244, 13572, 48, 224, new Item(OAK_PLANK, 3), new Item(5755, 8), new Item(STEEL_BAR, 2)),
        WOOD_DINING(8115, 13293, 10, 115, new Item(PLANK, 4), new Item(NAILS, 4)),
        OAK_DINING(8116, 13294, 22, 240, new Item(OAK_PLANK, 4)),
        CARVED_OAK_DINING(8117, 13295, 31, 360, new Item(OAK_PLANK, 6)),
        TEAK_DINING(8118, 13296, 38, 360, new Item(TEAK_PLANK, 4)),
        CARVED_TEAK_DINING(8119, 13297, 45, 600, new Item(TEAK_PLANK, 6), new Item(BOLT_OF_CLOTH, 4)),
        MAHOGANY_DINING(8120, 13298, 52, 840, new Item(MAHOGANY_PLANK, 6)),
        OPULENT_TABLE(8121, 13299, 72, 3100, new Item(MAHOGANY_PLANK, 6), new Item(BOLT_OF_CLOTH, 4), new Item
                (GOLD_LEAF, 2), new Item(MARBLE_BLOCK, 2)),
        WOOD_BENCH(8108, 13300, 10, 115, new Item(PLANK, 4), new Item(NAILS, 4)),
        OAK_BENCH(8109, 13301, 22, 240, new Item(OAK_PLANK, 4)),
        CARVED_OAK_BENCH(8110, 13302, 31, 240, new Item(OAK_PLANK, 4)),
        TEAK_BENCH(8111, 13303, 38, 360, new Item(TEAK_PLANK, 4)),
        CARVED_TEAK_BENCH(8112, 13304, 44, 360, new Item(TEAK_PLANK, 4)),
        MAHOGANY_BENCH(8113, 13305, 52, 560, new Item(MAHOGANY_PLANK, 4)),
        GILDED_BENCH(8114, 13306, 61, 1760, new Item(MAHOGANY_PLANK, 4), new Item(GOLD_LEAF, 4)),
        NORMAL_ROPE_BELL_PULL(8099, 13307, 26, 64, new Item(OAK_PLANK, 1), new Item(954, 1)),
        BELL_PULL(8100, 13308, 37, 120, new Item(TEAK_PLANK, 1), new Item(BOLT_OF_CLOTH, 2)),
        POSH_BELL_PULL(8101, 13309, 60, 420, new Item(TEAK_PLANK, 1), new Item(BOLT_OF_CLOTH, 2), new Item(GOLD_LEAF,
                1)),
        OAK_DECORATION(8102, 13606, 16, 120, new Item(OAK_PLANK, 2)),
        TEAK_DECORATION(8103, 13607, 36, 180, new Item(TEAK_PLANK, 2)),
        GILDED_DECORATION(8104, 13608, 56, 1020, new Item(MAHOGANY_PLANK, 3), new Item(GOLD_LEAF, 2)),
        REPAIR_BENCH(8389, 13713, 15, 120, new Item(OAK_PLANK, 2)),
        WHETSTONE(8390, 13714, 35, 260, new Item(OAK_PLANK, 4), new Item(LIMESTONE_BRICKS, 1)),
        ARMOUR_STAND(8391, 13715, 55, 500, new Item(OAK_PLANK, 8), new Item(LIMESTONE_BRICKS, 1)),
        PLUMING_STAND(8392, 13716, 16, 120, new Item(OAK_PLANK, 2)),
        SHIELD_EASEL(8393, 13717, 41, 240, new Item(OAK_PLANK, 4)),
        BANNER_EASEL(8394, 13718, 66, 510, new Item(OAK_PLANK, 8), new Item(BOLT_OF_CLOTH, 2)),
        TOOL_STORE_1(8384, 13699, 15, 120, new Item(OAK_PLANK, 2)),
        TOOL_STORE_2(8385, 13700, 25, 120, new Item(OAK_PLANK, 4)),
        TOOL_STORE_3(8386, 13701, 35, 120, new Item(OAK_PLANK, 6)),
        TOOL_STORE_4(8387, 13702, 44, 120, new Item(OAK_PLANK, 8)),
        TOOL_STORE_5(8388, 13703, 55, 121, new Item(OAK_PLANK, 10)),
        CRAFTING_TABLE(8380, 13709, 16, 240, new Item(OAK_PLANK, 4)),
        CRAFTING_TABLE_2(8381, 13710, 25, 1, new Item(MOLTEN_GLASS, 1)),
        CRAFTING_TABLE_3(8382, 13711, 34, 2, new Item(MOLTEN_GLASS, 2)),
        CRAFTING_TABLE_4(8383, 13712, 42, 120, new Item(OAK_PLANK, 2)),
        WOODEN_WORKBENCH(8375, 13704, 17, 143, new Item(PLANK, 5), new Item(NAILS, 5)),
        OAK_WORKBENCH(8376, 13705, 32, 300, new Item(OAK_PLANK, 5)),
        STEEL_FRAMED_WORKBENCH(8377, 13706, 46, 440, new Item(OAK_PLANK, 6), new Item(STEEL_BAR, 4)),
        BENCH_WITH_VICE(8378, 13707, 62, 140, new Item(OAK_PLANK, 2), new Item(STEEL_BAR, 1)),
        BENCH_WITH__A_LATHE(8379, 13708, 77, 140, new Item(OAK_PLANK, 2), new Item(STEEL_BAR, 1)),
        CLAY_ATTACK_STONE(8153, 13392, 39, 100, new Item(SOFT_CLAY, 10)),
        LIMESTONE_ATTACK_STONE(8154, 13393, 59, 200, new Item(LIMESTONE_BRICKS, 10)),
        MARBLE_ATTACK_STONE(8154, 13393, 59, 2000, new Item(MARBLE_BLOCK, 4)),
        HOOP_AND_STICK(8162, 13399, 30, 120, new Item(OAK_PLANK, 2)),
        DART_BOARD(8163, 13400, 54, 290, new Item(TEAK_PLANK, 3), new Item(STEEL_BAR, 1)),
        ARCHERY_TARGET(8164, 13402, 81, 600, new Item(TEAK_PLANK, 6), new Item(STEEL_BAR, 3)),
        OAK_PRIZE_CHEST(8165, 13385, 34, 240, new Item(OAK_PLANK, 4)),
        TEAK_PRIZE_CHEST(8166, 13387, 44, 660, new Item(TEAK_PLANK, 4)),
        GILDED_PRIZE_CHEST(8167, 13389, 44, 860, new Item(MAHOGANY_PLANK, 4), new Item(GOLD_LEAF, 1)),
        ELEMENTAL_BALANCE_1(8156, 13395, 37, 176, new Item(554, 500), new Item(555, 500), new Item(556, 500), new
                Item(557, 500)),
        ELEMENTAL_BALANCE_2(8157, 13396, 57, 252, new Item(554, 1000), new Item(555, 1000), new Item(556, 1000), new
                Item(557, 1000)),
        ELEMENTAL_BALANCE_3(8158, 13397, 77, 356, new Item(554, 2000), new Item(555, 2000), new Item(556, 2000), new
                Item(557, 2000)),
        JESTER(8159, 13390, 39, 360, new Item(TEAK_PLANK, 4)),
        TREASURE_HUNT(8160, 13379, 49, 800, new Item(TEAK_PLANK, 8), new Item(STEEL_BAR, 4)),
        HANGMAN(8161, 13404, 59, 1200, new Item(TEAK_PLANK, 12), new Item(STEEL_BAR, 6)),
        GLOVE_RACK(8028, 13381, 34, 120, new Item(OAK_PLANK, 2)),
        WEAPON_RACK(8029, 13382, 44, 180, new Item(TEAK_PLANK, 2)),
        EXTRA_WEAPON_RACK(8030, 13383, 54, 440, new Item(TEAK_PLANK, 4), new Item(STEEL_BAR, 4)),
        BOXING_RING(8023, new int[]{13129, 13126, 13128, 13127}, 32, 570, new Item(OAK_PLANK, 6), new Item
                (BOLT_OF_CLOTH, 4)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15289:
                    case 15290:
                    case 15294:
                    case 15295:
                        return 13126;
                    case 15291:
                    case 15293:
                    case 15288:
                        return 13128;
                    case 15292:
                        return 13127;
                    case 15277:
                    case 15287:
                    case 15278:
                    case 15279:
                    case 15281:
                    case 15286:
                    case 15282:
                    case 15280:
                        return 13129;
                    default:
                        return -1;
                }
            }

        },
        FENCING_RING(8024, new int[]{13133, 13135, 13134, 13136}, 31, 570, new Item(OAK_PLANK, 6), new Item
                (BOLT_OF_CLOTH, 6)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15289:
                    case 15290:
                    case 15294:
                    case 15295:
                        return 13135;
                    case 15291:
                    case 15293:
                    case 15288:
                        return 13134;
                    case 15292:
                        return 13136;
                    case 15277:
                    case 15287:
                    case 15278:
                    case 15279:
                    case 15281:
                    case 15286:
                    case 15282:
                    case 15280:
                        return 13133;
                    default:
                        return -1;
                }
            }
        },
        NORMAL_COMBAT_RING(8025, new int[]{13137, 13138, 13139, 13140}, 51, 630, new Item(TEAK_PLANK, 6), new Item
                (BOLT_OF_CLOTH, 6)) {
            @Override
            public int getObjectReplacementId(int id) {
                switch (id) {
                    case 15289:
                    case 15290:
                    case 15294:
                    case 15295:
                        return 13138;
                    case 15291:
                    case 15293:
                    case 15288:
                        return 13139;
                    case 15292:
                        return 13140;
                    case 15277:
                    case 15287:
                    case 15278:
                    case 15279:
                    case 15281:
                    case 15286:
                    case 15282:
                    case 15280:
                        return 13137;
                    default:
                        return -1;
                }
            }
        },
        MAP_SMALL(8294, 13525, 38, 211, new Item(TEAK_PLANK, 3), new Item(8004, 1)),
        MAP_MEDIUM(8295, 13526, 58, 451, new Item(MAHOGANY_PLANK, 3), new Item(8005, 1)),
        MAP_LARGE(8296, 13527, 78, 591, new Item(MAHOGANY_PLANK, 4), new Item(8006, 1)),
        SILVERLIGHT_SWORD(8279, 13519, 42, 187, new Item(TEAK_PLANK, 2), new Item(2402, 1)),
        EXCALIBER_SWORD(8280, 13521, 42, 194, new Item(TEAK_PLANK, 2), new Item(35, 1)),
        DARKLIGHT_SWORD(8281, 13520, 42, 202, new Item(TEAK_PLANK, 2), new Item(6746, 1)),
        ANTIDRAGON_SHIELD(8282, 13522, 47, 280, new Item(TEAK_PLANK, 3), new Item(1540, 1)),
        GLORY(8283, 13523, 47, 290, new Item(TEAK_PLANK, 3), new Item(1704, 1)),
        CAPE_OF_LEGENDS(8284, 13524, 47, 300, new Item(TEAK_PLANK, 3), new Item(1052, 1)),
        KING_ARTHUR(8285, 13510, 35, 211, new Item(TEAK_PLANK, 2), new Item(7995)),
        ELENA(8286, 13511, 35, 211, new Item(TEAK_PLANK, 2), new Item(7996)),
        GIANT_DWARF(8287, 13512, 35, 211, new Item(TEAK_PLANK, 2), new Item(7997)),
        MISCELLENIA(8288, 13513, 55, 311, new Item(MAHOGANY_PLANK, 2), new Item(7998)),
        LUMBRIDGE(8289, 13517, 44, 314, new Item(TEAK_PLANK, 3), new Item(8002, 1)),
        DESERT(8290, 13514, 44, 314, new Item(TEAK_PLANK, 3), new Item(7999, 1)),
        MORTANYIA(8291, 13518, 44, 314, new Item(TEAK_PLANK, 3), new Item(8003, 1)),
        KARAMJA(8292, 13516, 65, 464, new Item(MAHOGANY_PLANK, 3), new Item(8001, 1)),
        ISFADAR(8293, 13515, 65, 464, new Item(MAHOGANY_PLANK, 3), new Item(8000, 1)),
        ALCHEMICAL_CHART(8354, 13662, 43, 30, new Item(BOLT_OF_CLOTH, 2)),
        ASTRONOMICAL_CHART(8355, 13663, 63, 45, new Item(BOLT_OF_CLOTH, 3)),
        INFERNAL(8356, 13664, 83, 60, new Item(BOLT_OF_CLOTH, 4)),
        WOODEN_TELESCOPE(8348, 13656, 44, 121, new Item(OAK_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        TEAK_TELESCOPE(8348, 13656, 64, 181, new Item(TEAK_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        MAHOGANY_TELESCOPE(8349, 13657, 84, 580, new Item(MAHOGANY_PLANK, 2), new Item(MOLTEN_GLASS, 1)),
        NORMAL_CRYSTAL_BALL(8351, 13659, 42, 280, new Item(TEAK_PLANK, 3), new Item(567, 1)),
        ELEMENTAL_SPHERE(8352, 13660, 54, 580, new Item(TEAK_PLANK, 3), new Item(567, 1), new Item(GOLD_LEAF, 1)),
        CRYSTAL_OF_POWER(8353, 13661, 66, 890, new Item(MAHOGANY_PLANK, 2), new Item(567, 1), new Item(GOLD_LEAF, 2)),
        NORMAL_GLOBE(8341, 13649, 41, 180, new Item(OAK_PLANK, 3)),
        ORNAMENTAL_GLOBE(8342, 13650, 50, 270, new Item(TEAK_PLANK, 3)),
        LUNAR_GLOBE(8343, 13651, 59, 570, new Item(TEAK_PLANK, 3), new Item(GOLD_LEAF, 1)),
        CELESTIAL_GLOBE(8344, 13652, 68, 570, new Item(TEAK_PLANK, 3), new Item(GOLD_LEAF, 1)),
        ARMILLARY_SPHERE(8345, 13653, 77, 960, new Item(MAHOGANY_PLANK, 2), new Item(GOLD_LEAF, 2), new Item
                (STEEL_BAR, 4)),
        SMALL_ORRERY(8346, 13654, 86, 1320, new Item(MAHOGANY_PLANK, 3), new Item(GOLD_LEAF, 3)),
        LARGE_ORRERY(8347, 13655, 95, 1420, new Item(MAHOGANY_PLANK, 3), new Item(GOLD_LEAF, 5)),
        OAK_LECTURN(8334, 13642, 40, 60, new Item(OAK_PLANK, 1)),
        EAGLE_LECTURN(8335, 13643, 47, 120, new Item(OAK_PLANK, 2)),
        DEMON_LECTURN(8336, 13644, 47, 120, new Item(OAK_PLANK, 2)),
        TEAK_EAGLE_LECTURN(8337, 13645, 57, 180, new Item(TEAK_PLANK, 2)),
        TEAK_DEMON_LECTURN(8338, 13646, 57, 180, new Item(TEAK_PLANK, 2)),
        MAHOGANY_EAGLE_LECTURN(8339, 13647, 67, 580, new Item(MAHOGANY_PLANK, 2), new Item(GOLD_LEAF, 1)),
        MAHOGANY_DEMON_LECTURN(8340, 13648, 67, 580, new Item(MAHOGANY_PLANK, 2), new Item(GOLD_LEAF, 1)),
        LECTURN_STATUE(15521, 48642, 1, 1.5, new Item(MAHOGANY_PLANK, 2), new Item(STEEL_BAR, 10)),
        OAK_TREASURE_CHEST(9839, 18804, 48, 120, new Item(OAK_PLANK, 2)),
        TEAK_TREASURE_CHEST(9840, 18806, 66, 180, new Item(TEAK_PLANK, 2)),
        MAHOGANY_TREASURE_CHEST(9841, 18808, 84, 280, new Item(MAHOGANY_PLANK, 2)),
        OAK_ARMOUR_CASE(9826, 18778, 46, 180, new Item(OAK_PLANK, 3)),
        TEAK_ARMOUR_CASE(9827, 18780, 64, 270, new Item(TEAK_PLANK, 3)),
        MAHOGANY_ARMOUR_CASE(9828, 18782, 82, 420, new Item(MAHOGANY_PLANK, 3)),
        OAK_ALTAR(8062, 13179, 45, 240, new Item(OAK_PLANK, 4)),
        TEAK_ALTAR(8063, 13182, 50, 360, new Item(TEAK_PLANK, 4)),
        CLOTH_ALTAR(8064, 13185, 56, 390, new Item(TEAK_PLANK, 4), new Item(BOLT_OF_CLOTH, 2)),
        MAHOGANY_ALTAR(8065, 13188, 60, 590, new Item(MAHOGANY_PLANK, 4), new Item(BOLT_OF_CLOTH, 2)),
        LIMESTONE_ALTAR(8066, 13191, 64, 910, new Item(MAHOGANY_PLANK, 6), new Item(BOLT_OF_CLOTH, 2), new Item
                (LIMESTONE_BRICKS, 2)),
        MARBLE_ALTAR(8067, 13194, 70, 1030, new Item(MARBLE_BLOCK, 2), new Item(BOLT_OF_CLOTH, 2)),
        GUILDED_ALTAR(8068, 13197, 75, 2230, new Item(MARBLE_BLOCK, 2), new Item(BOLT_OF_CLOTH, 2), new Item
                (GOLD_LEAF, 4)),
        WOODEN_TORCHES(8069, 13200, 49, 58, new Item(OAK_PLANK, 2), new Item(NAILS, 5)),
        STEEL_TORCHES(8070, 13202, 45, 80, new Item(STEEL_BAR, 2)),
        STEEL_CANDLESTICK(8071, 13204, 53, 124, new Item(STEEL_BAR, 6), new Item(36, 6)),
        GOLD_CANDLESTICK(8072, 13206, 57, 46, new Item(2357, 6), new Item(36, 6)),
        INSCENCE_BURNER(8073, 13208, 61, 280, new Item(OAK_PLANK, 4), new Item(STEEL_BAR, 2)),
        MAHOGANY_BURNER(8074, 13210, 65, 600, new Item(MAHOGANY_PLANK, 4), new Item(STEEL_BAR, 2)),
        MARBLE_BURNER(8075, 13212, 69, 1600, new Item(MARBLE_BLOCK, 2), new Item(STEEL_BAR, 2)),
        GUTHIX_SYMBOL(8057, 13174, 48, 120, new Item(OAK_PLANK, 2)),
        SARADOMIN_SYMBOL(8055, 13172, 48, 120, new Item(OAK_PLANK, 2)),
        ZAMORAK_SYMBOL(8056, 13173, 48, 120, new Item(OAK_PLANK, 2)),
        GUTHIX_ICON(8060, 13177, 59, 960, new Item(TEAK_PLANK, 4), new Item(GOLD_LEAF, 2)),
        SARADOMIN_ICON(8058, 13175, 59, 960, new Item(TEAK_PLANK, 4), new Item(GOLD_LEAF, 2)),
        ZAMORAK_ICON(8059, 13173, 59, 960, new Item(TEAK_PLANK, 4), new Item(GOLD_LEAF, 2)),
        ICON_OF_BOB(8061, 13178, 71, 1160, new Item(TEAK_PLANK, 4), new Item(GOLD_LEAF, 2)),
        WIND_CHIMES(8079, 13214, 49, 323, new Item(OAK_PLANK, 4), new Item(NAILS, 4), new Item(STEEL_BAR, 4)),
        BELLS(8080, 13215, 58, 480, new Item(TEAK_PLANK, 4), new Item(STEEL_BAR, 6)),
        ORGAN(8081, 13216, 69, 680, new Item(MAHOGANY_PLANK, 4), new Item(STEEL_BAR, 6)),
        SMALL_STATUE(8082, 13271, 49, 40, new Item(LIMESTONE_BRICKS, 2)),
        MEDIUM_STATUE(8083, 13275, 69, 500, new Item(MARBLE_BLOCK, 1)),
        LARGE_STATUE(8084, 13279, 89, 1500, new Item(MARBLE_BLOCK, 3)),
        SHUTTERED_WINDOW(8076, new int[]{13253, 13226, 13235, 13244, 13217, 13262, 39232}, 49, 228, new Item(PLANK,
                8), new Item(NAILS, 8)),
        DECORATIVE_WINDOW(8077, new int[]{13254, 13227, 13236, 13245, 13218, 13263, 39253}, 69, 4, new Item
                (MOLTEN_GLASS, 8)),
        STAINED_GLASS(8078, new int[]{13255, 13228, 13237, 13246, 13219, 13264, 39254}, 89, 5, new Item(MOLTEN_GLASS,
                16));

        private int itemId, level;
        private int[] ids;
        private double xp;
        private Item[] reqs;

        FurnitureObj(int itemId, int id, int level, double xp, Item... reqs) {
            this(itemId, new int[]{id}, level, xp, reqs);
        }

        FurnitureObj(int itemId, int[] ids, int level, double xp, Item... reqs) {
            this.itemId = itemId;
            this.ids = ids;
            this.level = level;
            this.xp = xp;
            this.reqs = reqs;
        }

        /**
         * Get the object to replace this object with
         *
         * @param id
         * @return id
         */
        public int getObjectReplacementId(int id) {
            return ids[0];
        }

        public int getItemId() {
            return itemId;
        }

        public int getId() {
            return ids[0];
        }

        public int[] getIds() {
            return ids;
        }

        public int getLevel() {
            return level;
        }

        public boolean containsId(int id) {
            for (int containedId : ids) {
                if (id == containedId) return true;
            }
            return false;
        }

        public Item[] getRequirements() {
            return reqs;
        }

        public double getXP() {
            return xp;
        }
    }

    private static int testObjectReplacement(int id) {
        switch (id) {
            case 15289:
            case 15290:
            case 15294:
            case 15295:
                return 13126;
            case 15291:
            case 15293:
            case 15288:
                return 13128;
            case 15292:
                return 13127;
            case 15277:
            case 15287:
            case 15278:
            case 15279:
            case 15281:
            case 15286:
            case 15282:
            case 15280:
                return 13129;
            default:
                return -1;
        }
    }

    private static final int[] BUILD_INDEXES = {0, 2, 4, 6, 1, 3, 5};

    /**
     * Check if an object is a valid furniture
     *
     * @param player the player building
     * @param object the object being built onto
     * @return if is buildable
     */
    public static boolean isFurniture(Player player, WorldObject object) {
        for (Builds build : Builds.values())
            if (build.containsId(object.getId())) {
                openFurnitureInter(player, object, build);
                return true;
            }
        return false;
    }

    /**
     * Open the interface to choose a furniture to build
     *
     * @param player player building
     * @param object the object being built onto
     * @param build  the furniture group that the object relates to
     */
    private static void openFurnitureInter(Player player, WorldObject object, final Builds build) {
        if (!player.getHouse().isBuildMode(false)) {
            return;
        }
        RoomReference room = player.getHouse().getRoom(object);
        if (room == null) {
            return;
        }
        int interId = build.getPieces().length > 3 ? 396 : 394;
        Item[] itemArray = new Item[interId == 396 ? 7 : 3];
        for (int index = 0; index < build.getPieces().length; index++) {
            FurnitureObj piece = build.getPieces()[index];
            itemArray[interId == 396 ? BUILD_INDEXES[index] : index] = new Item(piece.getItemId(), 1);
            player.getPackets().sendConfig(
                    1485 + index, player.getSkills().getLevel(Skills.CONSTRUCTION) >= piece.getLevel()
                                  && player.getInventory().containsItems(piece.getRequirements()) ? 1 : 0);
        }
        player.getPackets().sendItems(8, itemArray);
        player.getPackets().sendInterSetItemsOptionsScript(interId, 11, 8, interId == 396 ? 2 : 1, 4, "Build");
        player.getPackets().sendUnlockIComponentOptionSlots(interId, 11, 0, interId == 396 ? 7 : 3, 0);
        player.getInterfaceManager().sendInterface(interId);
        for (int i = 0; i < (interId == 396 ? 7 : 3); i++) {
            if (i >= build.getPieces().length) {
                player.getPackets().sendHideIComponent(interId, (interId == 394 ? 29 : 49) + i, true);
                player.getPackets().sendIComponentText(interId, (interId == 394 ? 32 : 56) + i, "");
                player.getPackets().sendIComponentText(interId, 14 + (5 * i), "");
                for (int i2 = 0; i2 < 4; i2++) {
                    player.getPackets().sendIComponentText(interId, 15 + i2 + (5 * i), "");
                }
            } else {
                player.getPackets().sendIComponentText(interId,
                        (interId == 394 ? 32 : 56) + i, "Lvl " + build.getPieces()[i].getLevel());
                player.getPackets().sendIComponentText(interId,
                        14 + (5 * i), ItemDefinitions.getItemDefinitions(build.getPieces()[i].getItemId()).getName());
                for (int i2 = 0; i2 < 4; i2++) {
                    player.getPackets().sendIComponentText(interId,
                            15 + i2 + (5 * i), build.getPieces()[i].getRequirements().length <= i2 ? "" :
                                    build.getPieces()[i].getRequirements()[i2].getName() + ": "
                                    + build.getPieces()[i].getRequirements()[i2].getAmount());
                }
            }
        }
        player.getTemporaryAttributes().put("OpenedBuild", build);
        player.getTemporaryAttributes().put("OpenedBuildObject", object);
        player.setCloseInterfacesEvent(() -> {
            player.getTemporaryAttributes().remove("OpenedBuild");
            player.getTemporaryAttributes().remove("OpenedBuildObject");
        });
    }

    /**
     * Build a furniture selected from furniture inter
     *
     * @param itemId the item
     */
    public static void buildFurniture(Player player, int itemId) {
        WorldObject object = (WorldObject) player.getTemporaryAttributes().get("OpenedBuildObject");
        Builds build = (Builds) player.getTemporaryAttributes().get("OpenedBuild");
        RoomReference room = player.getHouse().getRoom(object);
        for (FurnitureObj obj : build.getPieces()) {
            if (obj.getItemId() == itemId) {
                player.closeInterfaces();
                if (!player.getInventory().containsItems(obj.getRequirements())) {
                    player.sendMessage("You don't have the required items.");
                    //  return;
                }
                if (!room.getRoom().containsBuild(build)) {
                    player.sendMessage("This build is not added yet.");
                    return;
                }
                for (Item item : obj.getRequirements()) {
                    player.getInventory().deleteItem(item.getId(), item.getAmount());
                }
                player.getInventory().refresh();
                player.setNextAnimation(new Animation(3684));
                player.getSkills().addXp(22, obj.getXP());
                ArrayList<WorldObject> objectsToSpawn = new ArrayList<>();
                int objectId;
                if (build.getAreas() != null) {
                    for (Rectangle rectangle : build.getAreas()) {
                        for (int x = rectangle.getSmallX(); x <= rectangle.getBigX(); x++) {
                            for (int y = rectangle.getSmallY(); y <= rectangle.getBigY(); y++) {
                                WorldObject[] atObjects = World.getObjects(new WorldTile(
                                        object.getChunkX() * 8 + x, object.getChunkY() * 8 + y, player.getPlane()));
                                if (atObjects == null) continue;
                                for (WorldObject objectAt : atObjects) {
                                    if (objectAt.getType() != object.getType() || !build.containsId(object.getId()))
                                        continue;
                                    objectId = obj.getObjectReplacementId(objectAt.getId());
                                    if (objectId == -1) continue;
                                    objectsToSpawn.add(new WorldObject(objectId, objectAt.getType(),
                                            objectAt.getRotation() + room.getRotation(),
                                            object.getChunkX() * 8 + x, object.getChunkY() * 8 + y, room.getPlane()));
                                }
                            }
                        }
                    }
                } else
                    objectsToSpawn.add(new WorldObject(obj.getId(), object.getType(), object.getRotation(), object
                            .getX(), object.getY(), object.getPlane()));

                for (WorldObject objectToSpawn : objectsToSpawn) {
                    if (objectToSpawn == null) continue;
                    World.spawnObject(objectToSpawn, true);
                    player.getHouse().addObject(room, new HouseObject(objectToSpawn.getXInChunk(), objectToSpawn
                            .getYInChunk(), objectToSpawn.getRotation(), objectToSpawn.getType(), objectToSpawn.getId
                            ()));
                }

                return;
            }
        }
    }
}
