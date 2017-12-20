package com.rs.game.player.content.skills.farming;

import com.rs.game.item.Item;

public class Seeds {

    /**
     * @author Jake | Santa Hat @Rune-Server modified by Peng
     */

    public enum PatchGroup {

        /**
         * Alloment patches
         */
        ALLOMENT(new int[]{8553, 8552, 8550, 8551, 8557, 8556, 8555, 8554}),

        /**
         * Flower patches
         */
        FLOWER(new int[]{7848, 7847, 7850, 7849}),

        /*
         * Tree patches
         */
        TREE(new int[]{8391, 8390, 8389, 8388, 19147}),

        /*
         * Fruit tree patches
         */
        FRUIT_TREE(new int[]{7965, 7963, 7962, 7964}),

        /**
         * Herb patches
         */
        HERB(new int[]{8151, 8150, 8153, 8152});

        private int[] patchIds;

        PatchGroup(int[] patchIds) {
            this.patchIds = patchIds;
        }

        public static boolean isPatch(int objectId) {
            for (PatchGroup group : PatchGroup.values()) {
                for (int id : group.patchIds) {
                    if (objectId == id) return true;
                }
            }
            return false;
        }

        public static PatchGroup forObjectId(int id) {
            for (PatchGroup group : PatchGroup.values()) {
                for (int patchId : group.patchIds) {
                    if (patchId == id) return group;
                }
            }
            return null;
        }

        public static boolean belongsToGroup(PatchGroup group, int objectId) {
            for (int id : group.patchIds) {
                if (objectId == id) return true;
            }
            return false;
        }

    }

    enum Seed {

        /**
         * Allotments
         */
        POTATO(new Item(5318, 4), 6, 4, 1, new Item(1942, 4), PatchGroup.ALLOMENT, 10),

        ONION(new Item(5319, 4), 13, 4, 5, new Item(1957, 4), PatchGroup.ALLOMENT, 14),

        CABBAGE(new Item(5324, 4), 20, 4, 7, new Item(1965, 4), PatchGroup.ALLOMENT, 16),

        TOMATOES(new Item(5322, 4), 27, 4, 12, new Item(1982, 4), PatchGroup.ALLOMENT, 23),

        SWEETCORN(new Item(5320, 4), 34, 6, 20, new Item(5986, 4), PatchGroup.ALLOMENT, 31),

        STRAWBERRIES(new Item(5323, 4), 43, 6, 31, new Item(5504, 4), PatchGroup.ALLOMENT, 41),

        WATERMELON(new Item(5321, 4), 52, 8, 47, new Item(5982, 4), PatchGroup.ALLOMENT, 54.5),

        /**
         * Flowers
         */
        MARIGOLD(new Item(5096, 4), 8, 4, 2, new Item(6010, 4), PatchGroup.FLOWER, 12),

        ROSEMARY(new Item(5097, 4), 13, 4, 11, new Item(6014, 4), PatchGroup.FLOWER, 15),

        NASTURTIUM(new Item(5098, 4), 20, 4, 24, new Item(6012, 4), PatchGroup.FLOWER, 20),

        WOAD(new Item(5099, 4), 23, 4, 25, new Item(1793, 4), PatchGroup.FLOWER, 22),

        LIMPWURT(new Item(5100, 4), 28, 5, 26, new Item(225, 4), PatchGroup.FLOWER, 24.5),

        LILY(new Item(14589, 4), 37, 4, 52, new Item(14583, 4), PatchGroup.FLOWER, 74.8),

        /**
         * Trees
         */
        OAK(new Item(5370), 8, 4, 15, new Item(1521), PatchGroup.TREE, 22),

        WILLOW(new Item(5371), 15, 4, 30, new Item(1519), PatchGroup.TREE, 35),

        MAPLE(new Item(5372), 24, 4, 45, new Item(1517), PatchGroup.TREE, 51),

        YEW(new Item(5373), 35, 4, 60, new Item(1515), PatchGroup.TREE, 87),

        MAGIC(new Item(5374), 48, 4, 75, new Item(1513), PatchGroup.TREE, 136),

        /**
         * Herbs
         */
        GUAM(new Item(5291, 1), 4, 4, 9, new Item(199, 4), PatchGroup.HERB, 17),

        MARRENTILL(new Item(5292, 1), 11, 4, 14, new Item(201, 4), PatchGroup.HERB, 22),

        TARROMIN(new Item(5293, 1), 18, 4, 19, new Item(203, 4), PatchGroup.HERB, 26),

        HARRALANDER(new Item(5294, 1), 25, 4, 26, new Item(205, 4), PatchGroup.HERB, 32),

        RANARR(new Item(5295, 1), 32, 4, 35, new Item(207, 4), PatchGroup.HERB, 37),

        TOADFLAX(new Item(5296, 1), 39, 4, 38, new Item(3049, 4), PatchGroup.HERB, 42),

        IRIT(new Item(5297, 1), 46, 4, 48, new Item(209, 4), PatchGroup.HERB, 50),

        AVANTOE(new Item(5298, 1), 53, 4, 50, new Item(5298, 4), PatchGroup.HERB, 62),

        WERGALI(new Item(14870, 1), 60, 4, 46, new Item(14870, 4), PatchGroup.HERB, 56),

        KWUARM(new Item(5299, 1), 69, 4, 69, new Item(213, 4), PatchGroup.HERB, 78),

        SNAPDRAGON(new Item(5300, 1), 75, 4, 62, new Item(3051, 4), PatchGroup.HERB, 98.5),

        CADANTINE(new Item(5301, 1), 82, 4, 67, new Item(215, 4), PatchGroup.HERB, 120),

        LANTADYME(new Item(5302, 1), 89, 4, 73, new Item(2485, 4), PatchGroup.HERB, 151.5),

        DWARF_WEED(new Item(5303, 1), 96, 4, 79, new Item(217, 4), PatchGroup.HERB, 192),

        TORSTOL(new Item(5304, 1), 103, 4, 85, new Item(219, 4), PatchGroup.HERB, 199.5),

        FELLSTALK(new Item(21621, 1), 110, 4, 91, new Item(21626, 4), PatchGroup.HERB, 315.6);

        private Item item;
        private int startConfig;
        private int configLength;
        private int level;
        private Item produce;
        private PatchGroup suitablePatches;
        private int time; // Time to grow (In Seconds)
        private double xp;

        Seed(Item item, int startConfig, int configLength, int level, Item produce, PatchGroup suitablePatches,
             double xp) {
            this.item = item;
            this.startConfig = startConfig;
            this.configLength = configLength;
            this.level = level;
            this.produce = produce;
            this.suitablePatches = suitablePatches;
            this.time = (int) (time / 0.6 / configLength);
            switch (suitablePatches) {
                case HERB:
                    this.time = (int) (4800 / 0.6 / configLength); //80 minutes
                    break;
                case TREE:
                    this.time = (int) (9600 / 0.6 / configLength); //160 minutes
                    break;
                case FLOWER:
                case ALLOMENT:
                    this.time = (int) (2400 / 0.6 / configLength); //40 minutes
                    break;
            }
            this.xp = xp;
        }

        public Item getItem() {
            return item;
        }

        public int getEndConfig() {
            return startConfig + configLength;
        }

        public int getStartConfig() {
            return startConfig;
        }

        public int getLevel() {
            return level;
        }

        public Item getProduce() {
            return produce;
        }

        public PatchGroup getSuitablePatch() {
            return suitablePatches;
        }

        public int getTime() {
            return time;
        }

        public double getXp() {
            return xp;
        }

        public static Seed forItemId(int id) {
            for (Seed seed : Seed.values()) {
                if (seed.getItem().getId() == id) return seed;
            }
            return null;
        }

        public static Seed forConfig(PatchGroup group, int maxConfig) {
            for (Seed seed : Seed.values()) {
                if (seed.getSuitablePatch().equals(group)) {
                    if (seed.getEndConfig() == maxConfig) return seed;
                }
            }
            return null;
        }
    }

}