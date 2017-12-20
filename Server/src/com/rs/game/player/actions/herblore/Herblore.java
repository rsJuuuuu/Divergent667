package com.rs.game.player.actions.herblore;


import com.rs.game.world.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;

import java.util.ArrayList;

/**
 * Created by Peng on 7.8.2016 19:15.
 */
public class Herblore extends Action {

    private static final int GUAM = 91, MARRENTILL = 93, TARROMIN = 95, HARRALANDER = 97, RANARR = 99, IRIT = 101, AVANTOE = 103, KWUARM = 105, CADANTINE = 107, DWARF_WEED = 109, TORSTOL = 111, TOADFLAX = 3002, LANTADYME = 2483, SPIRIT_WEED = 12181, SNAPDRAGON = 3004, WERGALI = 14856, PESTLE = 233, KNIFE = 946;

    private enum PotionRecipe {
        GUAM_UNF(249, 91, 3),
        MARRENTILL_UNF(251, 93, 5),
        TARROMIN_UNF(253, 95, 11),
        HARRALANDER_UNF(255, 95, 20),
        RANARR_UNF(257, 99, 25),
        IRIT_UNF(259, 101, 40),
        AVANTOE_UNF(261, 103, 48),
        KWUARM_UNF(263, 105, 54),
        CADANTINE_UNF(265, 107, 65),
        DWARF_WEED_UNF(267, 109, 70),
        TORSTOL_UNF(269, 111, 75),
        LANTADYME_UNF(2481, 2483, 67),
        TOADFLAX_UNF(2998, 3002, 30),
        SNAPDRAGON_UNF(3000, 3004, 59),
        SPIRIT_WEED_UNF(12172, 12181, 35),
        WERGALI_UNF(14851, 14856, 41),
        FELLSTALK_UNF(21624, 21628, 91),
        ATTACK(GUAM, 221, 121, 3, 25),
        ANTIPOISON(MARRENTILL, 235, 175, 5, 37.5),
        STRENGTH(TARROMIN, 225, 115, 12, 50),
        GUAM_TAR(new Item(249), new Item(1939, 15), new Item(10141, 15), 19, 30),
        RESTORE(HARRALANDER, 223, 127, 22, 62.5),
        ENERGY(HARRALANDER, 1975, 3010, 26, 67.5),
        DEFENCE(RANARR, 239, 133, 30, 75),
        MARRENTILL_TAR(new Item(251), new Item(1939, 15), new Item(10143, 15), 31, 42.5),
        AGILITY(TOADFLAX, 2151, 3034, 34, 80),
        COMBAT(HARRALANDER, 9736, 9741, 36, 84),
        PRAYER(RANARR, 231, 139, 38, 87.5),
        TARROMIN_TAR(new Item(253), new Item(1939, 15), new Item(10144, 15), 39, 55),
        SUMMONING(SPIRIT_WEED, 12109, 12141, 40, 92),
        CRAFTING(WERGALI, 5004, 14840, 42, 95),
        HARRALANDER_TAR(new Item(255), new Item(1939, 15), new Item(10145, 15), 44, 72.5),
        SUPER_ATTACK(IRIT, 221, 145, 45, 100),
        SUPER_ANTIPOISON(IRIT, 235, 181, 48, 106.3),
        FISHING_POTION(AVANTOE, 231, 151, 50, 112.5),
        SUPER_ENERGY(AVANTOE, 2970, 3018, 52, 117.5),
        HUNTER(AVANTOE, 10111, 10000, 53, 120),
        SUPER_STRENGTH(KWUARM, 225, 157, 55, 125),
        FLETCHING(WERGALI, 11525, 14848, 58, 132),
        WEAPON_POISON(KWUARM, 241, 187, 60, 137.5),
        SUPER_RESTORE(SNAPDRAGON, 223, 3024, 63, 142.5),
        SUPER_DEFENCE(CADANTINE, 239, 163, 66, 150),
        ANTIPOISONP() {
            @Override
            void init() {
                addResource(5935);
                addResource(6049);
                addResource(2998);
                addProduct(5945);
                levelReq = 68;
                xp = 155;
            }
        },
        ANTIFIRE(LANTADYME, 241, 2454, 69, 157.5),
        RANGING(DWARF_WEED, 245, 169, 72, 162.5),
        WEAPON_PP() {
            @Override
            void init() {
                addResource(5935);
                addResource(6016);
                addResource(223);
                addProduct(5940);
                levelReq = 73;
                xp = 165;
            }
        },
        MAGIC(LANTADYME, 3138, 3042, 76, 172.5),
        ZAMORAK_BREW(TORSTOL, 247, 189, 78, 175),
        ANTIPOISONPP() {
            @Override
            void init() {
                addResource(5935);
                addResource(259);
                addResource(6051);
                addProduct(5954);
                levelReq = 79;
                xp = 177.5;
            }
        },
        SARADOMIN_BREW(TOADFLAX, 6693, 6685, 81, 180),
        WEAPON_POISONPP() {
            @Override
            void init() {
                addResource(5935);
                addResource(2398);
                addResource(6018);
                addProduct(5940);
                levelReq = 79;
                xp = 177.5;
            }
        },
        SPEC_RESTORE(3016, 5972, 15301, 84, 200),
        SUPER_ANTIFIRE(2454, 4621, 15305, 85, 210),
        EXT_ATTACK(145, 261, 15309, 88, 220),
        EXT_STRENGTH(157, 267, 15313, 89, 230),
        EXT_DEFENCE(163, 2481, 15316, 90, 240),
        EXT_MAGIC(3042, 9594, 15321, 91, 250),
        EXT_RANGING() {
            @Override
            void init() {
                addResource(new Item(12539, 5));
                addResource(169);
                addProduct(15324);
                levelReq = 92;
                xp = 260;
            }
        },
        SUP_PRAYER(139, 6812, 15329, 94, 270),
        PRAYER_RENEWAL(21628, 21622, 21632, 94, 190),
        OVERLOAD() {
            @Override
            void init() {
                addResource(15309);
                addResource(15313);
                addResource(15317);
                addResource(15321);
                addResource(15325);
                addResource(269);
                addProduct(15333);
                levelReq = 92;
                xp = 260;
            }
        },
        HORN_DUST(PESTLE, 237, 235, 1, 1),
        MUD_DUST(PESTLE, 4698, 9594, 1, 1),
        SCALE_DUST(PESTLE, 243, 241, 1, 1),
        CHOCOLATE_DUST(KNIFE, 1973, 1975, 1, 1),
        GOAT_DUST(PESTLE, 9735, 9735, 1, 1);

        ArrayList<Item> resources = new ArrayList<>();
        ArrayList<Item> products = new ArrayList<>();

        int animId = 363;
        int levelReq = 0;
        double xp = 0;

        /**
         * Create unf pot recipe (adds vial of water by default)
         *
         * @param herbId the herb
         * @param unfId  the unf pot
         */
        PotionRecipe(int herbId, int unfId, int level) {
            addResource(227);
            addResource(herbId);
            addProduct(unfId);
            levelReq = level;
        }

        /**
         * Create a normal potion recipe
         *
         * @param primary   ingredient id
         * @param secondary ingredient id
         * @param product   product id
         * @param level     level requirement
         * @param exp       experience for making this
         */
        PotionRecipe(int primary, int secondary, int product, int level, double exp) {
            addResource(primary);
            addResource(secondary);
            addProduct(product);
            levelReq = level;
            xp = exp;
        }

        PotionRecipe(Item primary, Item secondary, Item product, int level, double exp) {
            addResource(primary);
            addResource(secondary);
            addProduct(product);
            levelReq = level;
            xp = exp;
        }

        PotionRecipe() {
            init();
        }

        void init() {

        }

        /**
         * Add product
         *
         * @param product product item id
         */
        void addProduct(int product) {
            products.add(new Item(product));
        }

        void addProduct(Item product) {
            products.add(product);
        }

        /**
         * Add resource
         *
         * @param resource resource item id
         */
        void addResource(int resource) {
            resources.add(new Item(resource));
        }

        /**
         * Add resource
         *
         * @param resource resource item
         */
        void addResource(Item resource) {
            resources.add(resource);
        }

        /**
         * Is the given item part of this recipe
         *
         * @param itemId the item
         * @return if is an ingredient
         */
        public boolean isItem(int itemId) {
            for (Item item : resources)
                if (item.getId() == itemId) return true;
            return false;
        }

        /**
         * Check if player meets the requirements to make this potion
         *
         * @param player the player
         * @return if can make
         */
        public boolean checkReqs(Player player, boolean print) {
            for (Item res : resources)
                if (player.getInventory().numberOf(res.getId()) < res.getAmount()) {
                    if (print) player.sendMessage("You don't have the required items to make this.");
                    return false;
                }
            if (player.getSkills().getLevel(Skills.HERBLORE) < levelReq) {
                player.sendMessage("You need a herblore level of " + levelReq + " to make this.");
                return false;
            }
            return true;
        }

        /**
         * Handles the animation and adding exp etc.
         *
         * @param player the player
         */
        void createProduct(Player player) {
            for (Item resource : resources) {
                if (!isUnconsumamble(resource.getId())) player.getInventory().removeItems(resource);
            }
            for (Item product : products)
                player.getInventory().addItem(product);
            player.setNextAnimation(new Animation(animId));
            player.getSkills().addXp(Skills.HERBLORE, xp);
        }

        /**
         * Is the item an item that won't get consumed on potion create
         *
         * @param id item id
         * @return whether it shouldn't be consumed
         */
        boolean isUnconsumamble(int id) {
            switch (id) {
                case PESTLE:
                case KNIFE:
                    return true;
                default:
                    return false;
            }
        }

        /**
         * Call this to make an item
         *
         * @param player the player who is making the item
         */
        public boolean make(Player player) {
            if (!checkReqs(player, false)) return false;
            createProduct(player);
            player.sendMessage("You make " + products.get(0).getName() + ".");
            return true;
        }

        /**
         * Get product for skills dialogue
         *
         * @return product id
         */
        public int getProduct() {
            return products.get(0).getId();
        }

    }

    private PotionRecipe potionRecipe;
    private int amount;

    /**
     * Initialize herblore action
     *
     * @param player the player
     * @param first  first item
     * @param other  second item
     * @param amount number to make
     */
    public Herblore(Player player, Item first, Item other, int amount) {
        for (PotionRecipe recipe : PotionRecipe.values()) {
            if (!recipe.isItem(first.getId()) || !recipe.isItem(other.getId())) continue;
            if (!recipe.checkReqs(player, false)) continue;
            potionRecipe = recipe;
        }
        this.amount = amount;
    }

    /**
     * Get possible products for used items
     *
     * @param first  first item
     * @param second second item
     * @return product array
     */
    public static int[] getProducts(Item first, Item second) {
        ArrayList<Integer> products = new ArrayList<>();
        for (PotionRecipe recipe : PotionRecipe.values()) {
            if (recipe.isItem(first.getId()) && recipe.isItem(second.getId())) products.add(recipe.getProduct());
        }
        if (products.size() <= 0) return null;
        int[] productArray = new int[products.size()];
        for (int i = 0; i < products.size(); i++)
            productArray[i] = products.get(i);
        return productArray;
    }

    @Override
    public boolean start(Player player) {
        return potionRecipe != null && potionRecipe.checkReqs(player, true);
    }

    @Override
    public boolean process(Player player) {
        return potionRecipe != null && potionRecipe.checkReqs(player, false);
    }

    @Override
    public int processWithDelay(Player player) {
        amount--;
        if (!potionRecipe.make(player)) return -1;
        if (amount <= 0) return -1;
        return 1;
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }
}
