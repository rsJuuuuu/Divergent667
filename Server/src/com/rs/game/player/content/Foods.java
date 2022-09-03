package com.rs.game.player.content;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.world.Animation;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cjay0091
 */
public class Foods {

    public enum Food {

        /**
         * Fish
         */
        CRAFISH(13433, 2),

        ANCHOVIE(319, 1),

        SHRIMP(315, 3),

        KARAMBWANJI(3151, 3),

        SARDINE(325, 3),

        POISON_KARAMBWANJI(3146, 0, Effect.POISION_KARMAMWANNJI_EFFECT),

        KARAMBWANI(3144, 18),

        SLIMY_EEL(3381, 7 + Utils.random(2)),

        RAINBOW_FISH(10136, 11),

        CAVE_EEL(5003, 8 + Utils.random(2)),

        LAVA_EEL(2149, 7 + Utils.random(2)),

        HERRING(347, 5),

        MACKEREL(335, 6),

        TROUT(333, 7),

        COD(339, 7),

        PIKE(351, 8),

        SALMON(329, 9),

        TUNA(361, 10),

        LOBSTER(379, 12),

        BASS(365, 13),

        SWORDFISH(373, 14),

        MONKFISH(7946, 16),

        SHARK(385, 20),

        TURTLE(397, 21),

        MANTA(391, 22),

        CAVEFISH(15266, 20),

        ROCKTAIL(15272, 23, 0, null, 10),

        /**
         * Meats
         */
        CHICKEN(2140, 3),

        MEAT(2142, 3),

        RABIT(3228, 5),

        ROAST_RABIT(7223, 7),

        ROASTED_BIRD_MEAT(9980, 6),

        CRAB_MEAT(7521, 10),

        ROASTED_BEAST_MEAT(9988, 8),

        CHOMPY(2878, 10),

        JUBBLY(7568, 15),

        OOMILE(2343, 14),

        /**
         * Pies
         */
        REDBERRY_PIE_FULL(2325, 5, 2333),

        REDBERRY_PIE_HALF(2333, 5, 2313),

        MEAT_PIE_FULL(2327, 6, 2331),

        MEAT_PIE_HALF(2331, 6, 2313),

        APPLE_PIE_FULL(2323, 7, 2335),

        APPLE_PIE_HALF(2335, 7, 2313),

        GARDEN_PIE_FULL(7178, 6, 7180, Effect.GARDEN_PIE),

        GARDEN_PIE_HALF(7180, 6, 2313, Effect.GARDEN_PIE),

        FISH_PIE_FULL(7188, 6, 7190, Effect.FISH_PIE),

        FISH_PIE_HALF(7188, 6, 2313, Effect.FISH_PIE),

        ADMIRAL_PIE_FULL(7198, 8, 7200, Effect.ADMIRAL_PIE),

        ADMIRAL_PIE_HALF(7200, 8, 2313, Effect.ADMIRAL_PIE),

        WILD_PIE_FULL(7208, 11, 7210, Effect.WILD_PIE),

        WILD_PIE_HALF(7210, 11, 2313, Effect.WILD_PIE),

        SUMMER_PIE_FULL(7218, 11, 7220, Effect.SUMMER_PIE),

        SUMMER_PIE_HALF(7220, 11, 2313, Effect.SUMMER_PIE),

        /**
         * Stews
         */

        STEW(2003, 11, 1923),

        SPICY_STEW(7513, 11, 1923, Effect.SPICY_STEW_EFFECT),

        CURRY(2011, 19, 1923),

        /**
         * Pizzas
         */
        PLAIN_PIZZA_FULL(2289, 7, 2291),

        PLAIN_PIZZA_HALF(2291, 7),

        MEAT_PIZZA_FULL(2293, 8, 2295),

        MEAT_PIZZA_HALF(2295, 8),

        ANCHOVIE_PIZZA_FULL(2297, 9, 2299),

        ANCHOVIE_PIZZA_HALF(2299, 9),

        PINEAPPLE_PIZZA_FULL(2301, 11, 2303),

        PINEAPPLE_PIZZA_HALF(2303, 11),

        /**
         * Potato Toppings
         */
        SPICEY_SAUCE(7072, 2, 1923),

        CHILLI_CON_CARNIE(7062, 14, 1923),

        SCRAMBLED_EGG(7078, 5, 1923),

        EGG_AND_TOMATO(7064, 8, 1923),

        FRIED_ONIONS(7084, 9, 1923),

        MUSHROOM_AND_ONIONS(7066, 11, 1923),

        FRIED_MUSHROOMS(7082, 5, 1923),

        TUNA_AND_CORN(7068, 13, 1923),

        /**
         * Baked Potato
         */
        BAKED_POTATO(6701, 4),

        POTATO_WITH_BUTTER(6703, 14),

        CHILLI_POTATO(7054, 14),

        POTATO_WITH_CHEESE(6705, 16),

        EGG_POTATO(7056, 16),

        MUSHROOM_AND_ONION_POTATO(7058, 20),

        TUNA_POTATO(7060, 24),

        /**
         * Gnome Food
         */
        TOAD_CRUNCHIES(2217, 8),

        SPICY_CRUNCHIES(2213, 7),

        WORM_CRUNCHIES(2205, 8),

        CHOCOCHIP_CRUNCHIES(9544, 7),

        FRUIT_BATTA(2277, 11),

        TOAD_BATTA(2255, 11),

        WORM_BATTA(2253, 11),

        VEGETABLE_BATTA(2281, 11),

        CHEESE_AND_TOMATO_BATTA(9535, 11),

        WORM_HOLE(2191, 12),

        VEG_BALL(2195, 12),

        PRE_MADE_VEG_BALL(2235, 12),

        TANGLED_TOAD_LEGS(2187, 15),

        CHOCOLATE_BOMB(2185, 15),

        /**
         * Misc
         */
        CAKE(1891, 4, 1893),

        TWO_THIRDS_CAKE(1893, 4, 1896),

        SLICE_OF_CAKE(1896, 4),

        CHOCOLATE_CAKE(1897, 4, 1899),

        TWO_THIRDS_CHOCOLATE_CAKE(1899, 4, 1901),

        CHOCOLATE_SLICE(1901, 4),

        FISHCAKE(7530, 11),

        BREAD(2309, 5),

        CABBAGE(1965, 1, Effect.CABAGE_MESSAGE),

        ONION(1957, 1, Effect.ONION_MESSAGE),

        EVIL_TURNIP(12134, 1),

        POT_OF_CREAM(2130, 1),

        CHEESE_WHEEL(18789, 2),

        THIN_SNAIL_MEAT(3369, 5 + Utils.random(2)),

        LEAN_SNAIL_MEAT(3371, 8),

        FAT_SNAIL_MEAT(3373, 8 + Utils.random(2)),

        /*
         * Fruits
         */
        BANANA(1963, 2),
        PEACH(6883, 8);

        /**
         * The food id
         */
        private final int id;

        /**
         * The healing health
         */
        private final int heal;

        /**
         * The new food id if needed
         */
        private int newId;

        private int extraHP;

        /**
         * Our effect
         */
        private Effect effect;

        /**
         * A map of object ids to foods.
         */
        private static final Map<Integer, Food> foods = new HashMap<>();

        /**
         * Gets a food by an object id.
         *
         * @param itemId The object id.
         * @return The food, or <code>null</code> if the object is not a food.
         */
        public static Food forId(int itemId) {
            return foods.get(itemId);
        }

        static {
            for (final Food food : Food.values()) {
                foods.put(food.id, food);
            }
        }

        /**
         * Represents a food being eaten
         *
         * @param id The food id
         */
        Food(int id, int heal) {
            this.id = id;
            this.heal = heal;
        }

        /**
         * Represents a part of a food item being eaten (example: cake)
         *
         * @param id    The food id
         * @param heal  The heal amount
         * @param newId The new food id
         */
        Food(int id, int heal, int newId) {
            this(id, heal, newId, null);
        }

        Food(int id, int heal, int newId, Effect effect) {
            this(id, heal, newId, effect, 0);
        }

        Food(int id, int heal, int newId, Effect effect, int extraHP) {
            this.id = id;
            this.heal = heal;
            this.newId = newId;
            this.effect = effect;
            this.extraHP = extraHP;
        }

        Food(int id, int heal, Effect effect) {
            this(id, heal, 0, effect);
        }

        /**
         * Gets the id.
         *
         * @return The id.
         */
        public int getId() {
            return id;
        }

        /**
         * Gets the exp amount.
         *
         * @return The exp amount.
         */
        public int getHeal() {
            return heal;
        }

        /**
         * Gets the new food id
         *
         * @return The new food id.
         */
        public int getNewId() {
            return newId;
        }

        public int getExtraHP() {
            return extraHP;
        }
    }

    public enum Effect {
        SUMMER_PIE {
            public void effect(Object object) {
                Player player = (Player) object;
                player.setRunEnergy((int) (player.getRunEnergy() + (player
                        .getRunEnergy() * 0.1)));
                int level = player.getSkills().getLevel(Skills.AGILITY);
                int realLevel = player.getSkills()
                        .getLevelForXp(Skills.AGILITY);
                player.getSkills().set(Skills.AGILITY,
                        level >= realLevel ? realLevel + 5 : level + 5);
            }

        },

        GARDEN_PIE {
            public void effect(Object object) {
                Player player = (Player) object;
                int level = player.getSkills().getLevel(Skills.FARMING);
                int realLevel = player.getSkills()
                        .getLevelForXp(Skills.FARMING);
                player.getSkills().set(Skills.FARMING,
                        level >= realLevel ? realLevel + 3 : level + 3);
            }

        },

        FISH_PIE {
            public void effect(Object object) {
                Player player = (Player) object;
                int level = player.getSkills().getLevel(Skills.FISHING);
                int realLevel = player.getSkills()
                        .getLevelForXp(Skills.FISHING);
                player.getSkills().set(Skills.FISHING,
                        level >= realLevel ? realLevel + 3 : level + 3);
            }
        },

        ADMIRAL_PIE {
            public void effect(Object object) {
                Player player = (Player) object;
                int level = player.getSkills().getLevel(Skills.FISHING);
                int realLevel = player.getSkills()
                        .getLevelForXp(Skills.FISHING);
                player.getSkills().set(Skills.FISHING,
                        level >= realLevel ? realLevel + 5 : level + 5);
            }
        },

        WILD_PIE {
            public void effect(Object object) {
                Player player = (Player) object;
                int level = player.getSkills().getLevel(Skills.SLAYER);
                int realLevel = player.getSkills().getLevelForXp(Skills.SLAYER);
                player.getSkills().set(Skills.SLAYER,
                        level >= realLevel ? realLevel + 4 : level + 4);
                int level2 = player.getSkills().getLevel(Skills.RANGE);
                int realLevel2 = player.getSkills().getLevelForXp(Skills.RANGE);
                player.getSkills().set(Skills.RANGE,
                        level2 >= realLevel2 ? realLevel2 + 4 : level2 + 4);
            }
        },

        SPICY_STEW_EFFECT {
            public void effect(Object object) {
                Player player = (Player) object;
                if (Utils.random(100) > 5) {
                    int level = player.getSkills().getLevel(Skills.COOKING);
                    int realLevel = player.getSkills().getLevelForXp(
                            Skills.COOKING);
                    player.getSkills().set(Skills.COOKING,
                            level >= realLevel ? realLevel + 6 : level + 6);
                } else {
                    int level = player.getSkills().getLevel(Skills.COOKING);
                    player.getSkills().set(Skills.COOKING,
                            level <= 6 ? 0 : level - 6);
                }
            }

        },

        CABAGE_MESSAGE {
            public void effect(Object object) {
                Player player = (Player) object;
                player.getPackets().sendGameMessage(
                        "You don't really like it much.", true);
            }
        },

        ONION_MESSAGE {
            public void effect(Object object) {
                Player player = (Player) object;
                player.sendMessage("It's always sad to see a grown "
                        + (player.getAppearance().isMale() ? "man" : "woman")
                        + " cry.");
            }
        },

        POISION_KARMAMWANNJI_EFFECT {
            public void effect(Object object) {
                Player player = (Player) object;
                player.applyHit(new Hit(player, 50, HitLook.POISON_DAMAGE));
            }
        };

        public void effect(Object object) {
        }
    }

    private static final Animation EAT_ANIM = new Animation(829);

    public static boolean eat(final Player player, Item item, int slot) {
        Food food = Food.forId(item.getId());
        if (food == null)
            return false;
        if (player.getFoodDelay() > TimeUtils.getTime())
            return true;
        if (!player.getControllerManager().canEat(food))
            return true;
        player.getPackets().sendGameMessage(
                "You eat the "
                        + ItemDefinitions.getItemDefinitions(food.getId())
                        .getName().toLowerCase() + ".");
        player.setNextAnimation(EAT_ANIM);
        player.addFoodDelay(1800);
        if (player.getActionManager().getActionDelay() < 3)
            player.getActionManager().setActionDelay(3);
        player.getInventory()
                .getItems()
                .set(slot,
                        food.getNewId() == 0 ? null : new Item(food.getNewId(),
                                1));
        player.getInventory().refresh(slot);
        int hp = player.getHealth();
        player.heal(food.getHeal() * 10, food.getExtraHP() * 10);
        if (player.getHealth() > hp)
            player.getPackets().sendGameMessage("It heals some health.");
        player.getInventory().refresh();
        if (food.effect != null) {
            food.effect.effect(player);
        }
        return true;
    }
}