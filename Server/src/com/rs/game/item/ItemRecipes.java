package com.rs.game.item;

import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.world.Animation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Peng on 2.8.2016.
 */
public class ItemRecipes {

    private static final int OBJECT = 0;
    private static final int USE = 1;
    private static final int NPC = 2;

    /**
     * Check if there is a recipe for the item used in the object
     *
     * @param player   the player
     * @param itemId   the item
     * @param objectId the object
     * @return if successful
     */
    public static boolean checkObjectUse(Player player, int itemId, int objectId) {
        for (Recipe recipe : Recipe.values()) {
            if (!recipe.isValidObject(objectId)) continue;
            if (recipe.isItem(itemId)) if (recipe.make(player)) return true;
        }
        return false;
    }

    /**
     * Check if there is a recipe for using these items together
     *
     * @param player  the player
     * @param itemId  the item
     * @param itemId2 the second item
     * @return if successful
     */
    public static boolean checkItemOnItem(Player player, int itemId, int itemId2) {
        System.out.println(itemId + " " + itemId2);
        for (Recipe recipe : Recipe.values()) {
            if (!recipe.isUseRecipe()) continue;
            if (!recipe.isItem(itemId) || !recipe.isItem(itemId2)) continue;
            if (recipe.make(player)) return true;
        }
        return false;
    }

    private enum Recipe {

        DFS("Dragonfire shield", OBJECT) {
            @Override
            void init() {
                addAnvil();
                addSkillReq(Skills.SMITHING, 90);
                addXp(Skills.SMITHING, 2000D);
                addItemReq(1540);
                addItemReq(11286);
                addProduct(11283);
            }
        },
        GSBLADE("Godsword blade", OBJECT) {
            @Override
            void init() {
                addAnvil();
                addSkillReq(Skills.SMITHING, 80);
                addXp(Skills.SMITHING, 200D);
                addItemReqs(11710, 11712, 11714);
                addProduct(11690);
            }
        },
        DIVINE("Divine spirit shield", OBJECT) {
            @Override
            void init() {
                addSpiritReq();
                addItemReqs(13748, 13736);
                addProduct(13740);
            }
        },
        ELYSIAN("Elysian spirit shield", OBJECT) {
            @Override
            void init() {
                addSpiritReq();
                addItemReqs(13750, 13736);
                addProduct(13742);
            }
        },
        ARCANE("Arcane spirit shield", OBJECT) {
            @Override
            void init() {
                addSpiritReq();
                addItemReqs(13746, 13736);
                addProduct(13738);
            }
        },
        SPECTRAL("Spectral spirit shield", OBJECT) {
            @Override
            void init() {
                addSpiritReq();
                addItemReqs(13752, 13736);
                addProduct(13744);
            }
        },
        BLESSED("Blessed spirit shield", USE) {
            @Override
            void init() {
                addSkillReq(Skills.PRAYER, 85);
                addXp(Skills.PRAYER, 1500);
                addItemReqs(13754, 13734);
                addProduct(13736);
            }
        },
        AGS("Armadyl godsword", USE) {
            @Override
            void init() {
                addItemReqs(11702, 11690);
                addProduct(11694);
            }
        },
        BGS("Bandos godsword", USE) {
            @Override
            void init() {
                addItemReqs(11690, 11704);
                addProduct(11696);
            }
        },
        SGS("Saradomin godsword", USE) {
            @Override
            void init() {
                addItemReqs(11690, 11706);
                addProduct(11698);
            }
        },
        ZGS("Zamorak godsword", USE) {
            @Override
            void init() {
                addItemReqs(11690, 11708);
                addProduct(11700);
            }
        },
        C_KEY("Crystal key", USE) {
            @Override
            void init() {
                addItemReqs(985, 987);
                addProduct(989);
            }
        },
        VINEWHIP("Abyssal vine whip", USE) {
            @Override
            void init() {
                addItemReqs(4151, 21369);
                addProduct(21371);
            }
        },
        ARMADYL_BATTLESTAFF("Armadyl Battlestaff", USE) {
            @Override
            void init() {
                addItemReqs(1391, 21775);
                addProduct(21777);
                addSkillReq(Skills.CRAFTING, 77);
                addXp(Skills.CRAFTING, 150);
            }
        };

        /**
         * Recipe data
         */
        HashMap<Integer, Integer> skillReqs = new HashMap<>();
        HashMap<Integer, Double> skillXps = new HashMap<>();

        ArrayList<Item> itemReqs = new ArrayList<>();
        ArrayList<Item> products = new ArrayList<>();
        ArrayList<Integer> validObjects = new ArrayList<>();
        ArrayList<String> validObjectNames = new ArrayList<>();
        ArrayList<Integer> validNpcs = new ArrayList<>();
        ArrayList<Integer> actionTypes = new ArrayList<>();

        int animId = -1;

        String name;

        /**
         * A recipe for creating an item
         *
         * @param productName the name of the resulting item or items
         */
        Recipe(String productName, int... actionTypes) {
            name = productName;
            for (int actionType : actionTypes)
                this.actionTypes.add(actionType);
            init();
        }

        void addSpiritReq() {
            addAnvil();
            addXp(Skills.SMITHING, 1800);
            addSkillReq(Skills.PRAYER, 90);
            addSkillReq(Skills.SMITHING, 85);
        }

        void addAnvil() {
            validObjectNames.add("anvil");
            animId = 898;
        }

        void addSkillReq(int skill, int level) {
            skillReqs.put(skill, level);
        }

        void addXp(int skill, double xp) {
            skillXps.put(skill, xp);
        }

        void addItemReqs(int... ids) {
            for (int id : ids)
                addItemReq(id);
        }

        void addItemReq(int id, int amount) {
            itemReqs.add(new Item(id, amount));
        }

        void addItemReq(int id) {
            itemReqs.add(new Item(id));
        }

        void addProduct(int id, int amount) {
            products.add(new Item(id, amount));
        }

        void addProduct(int id) {
            products.add(new Item(id));
        }

        abstract void init();

        /**
         * Check if player has sufficient supplies
         *
         * @param player the player
         * @return if supplies are available
         */
        boolean checkSupplies(Player player) {
            for (Item supply : itemReqs) {
                if (!player.getInventory().containsItem(supply.getId(), supply.getAmount())) {
                    sendItemReqs(player);
                    return false;
                }
            }
            return true;
        }

        /**
         * Check if player has sufficient skills
         *
         * @param player the player
         * @return skill requirements met
         */
        boolean checkSkills(Player player) {
            for (int skill : skillReqs.keySet()) {
                if (player.getSkills().getLevel(skill) < skillReqs.get(skill)) {
                    sendSkillReqs(player);
                    return false;
                }
            }
            return true;
        }

        /**
         * Inform the player about the required skills for this recipe
         *
         * @param player
         */
        void sendSkillReqs(Player player) {
            player.sendMessage("You don't have the skills required to make this item.");
            String message = "(";
            for (int skill : skillReqs.keySet())
                message += Skills.SKILL_NAME[skill] + ": " + skillReqs.get(skill) + ", ";
            player.sendMessage(message.substring(0, message.length() - 2) + ")");
        }

        /**
         * Inform the player about the required items for this recipe
         *
         * @param player
         */
        void sendItemReqs(Player player) {
            player.sendMessage("You don't have the items required to make this item.");
            String message = "(";
            for (Item item : itemReqs)
                message += item.getAmount() + "x " + item.getName() + ", ";
            player.sendMessage(message.substring(0, message.length() - 2) + ")");
        }

        /**
         * Check if the player meets the reqs for this recipe
         *
         * @param player the player
         * @return if requirement were met
         */
        boolean checkReqs(Player player) {
            return checkSupplies(player) && checkSkills(player);
        }

        /**
         * Remove the supplies from the players inventory
         *
         * @param player the player
         */
        void removeSupplies(Player player) {
            for (Item item : itemReqs)
                player.getInventory().deleteItem(item.getId(), item.getAmount());
        }

        /**
         * Adds the product to the players inv
         *
         * @param player the player
         */
        void giveProducts(Player player) {
            for (Item item : products)
                player.getInventory().addItem(item);
        }

        /**
         * Check if player has space to complete this action
         *
         * @param player the player
         * @return if has space
         */
        boolean checkSpace(Player player) {
            int space = player.getInventory().getFreeSlots();
            for (Item item : itemReqs) {
                if (item.getDefinitions().isStackable() && item.getAmount()
                                                           == player.getInventory().getItem(player.getInventory()
                        .getItems().getThisItemSlot(item)).getAmount())
                    space++;
                else space += item.getAmount();
            }
            for (Item item : products) {
                if (item.getDefinitions().isStackable()) {
                    if (!player.getInventory().containsItem(item.getId(), 1)) {
                        if (!(itemReqs.contains(item) && !(item.getAmount()
                                                           == player.getInventory().getItem(player.getInventory()
                                .getItems().getThisItemSlot(item)).getAmount())))
                            space--;
                    }
                } else space -= item.getAmount();
            }
            return (space >= 0);
        }

        /**
         * Handles the animation and adding exp etc.
         *
         * @param player the player
         */
        void createProduct(Player player) {
            checkSpace(player);
            removeSupplies(player);
            giveProducts(player);
        }

        /**
         * Call this to make an item
         *
         * @param player the player who is making the item
         */
        public boolean make(Player player) {
            if (!checkReqs(player)) return false;
            if (animId != -1) player.setNextAnimation(new Animation(animId));
            for (int skill : skillXps.keySet())
                player.getSkills().addXp(skill, skillXps.get(skill));

            createProduct(player);
            player.sendMessage("You make a " + name + ".");
            return true;
        }

        /**
         * Check if this item can be made by using it on an npc
         *
         * @param npcId the npcs id
         * @return if npc is valid
         */
        public boolean isValidNpc(int npcId) {
            return (validNpcs.isEmpty() || validNpcs.contains(npcId));
        }

        /**
         * Check if this item can be made by using an item to the object
         *
         * @param objectId the objects id
         * @return if object is valid
         */
        public boolean isValidObject(int objectId) {
            if (!actionTypes.contains(OBJECT)) return false;
            return ((validObjects.isEmpty() && validObjectNames.isEmpty()) || validObjects.contains(objectId) || (
                    !validObjectNames.isEmpty()
                    && validObjectNames.contains(ObjectDefinitions.getObjectDefinitions(objectId).name.toLowerCase())));
        }

        public boolean isUseRecipe() {
            return actionTypes.contains(USE);
        }

        /**
         * If the item is part of this recipe
         *
         * @param itemId the items id
         * @return if it has a part
         */
        public boolean isItem(int itemId) {
            for (Item item : itemReqs)
                if (item.getId() == itemId) return true;
            return false;
        }

    }

}
