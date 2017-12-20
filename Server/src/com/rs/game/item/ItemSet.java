package com.rs.game.item;

import com.rs.game.actionHandling.handlers.InterfaceHandler;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.info.RanksManager;

public class ItemSet {

    /**
     * @author Peng
     *         <p>
     *         ItemSet class used to hold and spawn sets of items to players
     */

    private enum Set {
        BERSERKER("Berserker", EQUIPMENT, new Item(10548), new Item(10551), new Item(6585), new Item(1079), new Item
                (4131), new Item(1052), new Item(8850), new Item(4151), new Item(7462)),

        BERSERKER_INVENTORY("BerserkerInv", INVENTORY, new Item(2436), new Item(2440), new Item(2442), new Item(1215)
                , new Item(9075, 300), new Item(560, 300), new Item(557, 500), new Item(2434), new Item(15272, 20)),

        HYBRID("Hybrid", EQUIPMENT, new Item(4708), new Item(4712), new Item(4714), new Item(6585), new Item(15486),
                new Item(6920), new Item(20072), new Item(7462), new Item(1052)),

        HYBRID_INVENTORY("HybridInv", INVENTORY, new Item(4716), new Item(4718), new Item(4720), new Item(4722), new
                Item(4151), new Item(560, 500), new Item(565, 500), new Item(555, 500), new Item(2436), new Item
                (2440), new Item(2442), new Item(3040), new Item(2434), new Item(15272, 16)),

        ONE_DEF_PURE("1 Def Pure", EQUIPMENT, new Item(6109), new Item(6737), new Item(6107), new Item(6108), new
                Item(6585), new Item(3105), new Item(7458), new Item(4151), new Item(3842), new Item(6111), new Item
                (4675)),

        ONE_DEF_INVENTORY("1 Def PureInv", INVENTORY, new Item(565, 500), new Item(560, 500), new Item(555, 500), new
                Item(2436), new Item(2440), new Item(1215), new Item(2434), new Item(15272, 21)),

        DH_PURE("DH Pure", EQUIPMENT, new Item(4716), new Item(4720), new Item(4722), new Item(7462), new Item(20072)
                , new Item(6737), new Item(1052), new Item(11732), new Item(6585), new Item(4151), new Item(4718)),

        DH_PURE_INVENTORY("DHInv", INVENTORY, new Item(1215), new Item(2436), new Item(2440), new Item(2442), new
                Item(2434), new Item(15272, 18), new Item(9075, 500), new Item(557, 500), new Item(560, 500)),
        STARTER_INVENTORY("Starter", INVENTORY, new Item(1167), new Item(579), new Item(1153), new Item(1061), new
                Item(1129), new Item(577), new Item(1115), new Item(7453), new Item(1095), new Item(1011), new Item
                (1067), new Item(1540), new Item(9705), new Item(15598), new Item(15596), new Item(2552), new Item
                (556, 100), new Item(558, 100), new Item(1023), new Item(1712), new Item(330, 100), new Item(995,
                50000)),
        MELEE("Melee", new Item(20135), new Item(20139), new Item(20143), new Item(21787), new Item(7462), new Item
                (6585), new Item(20771), new Item(15220), new Item(18349), new Item(20072)),

        RANGED("Ranged", new Item(20147), new Item(20151), new Item(20155), new Item(20771), new Item(15019), new
                Item(21790), new Item(18357), new Item(13742), new Item(7462), new Item(15126), new Item(9245,
                1337000000)),

        MAGIC("Magic", new Item(20163), new Item(20167), new Item(20167), new Item(20771), new Item(18335), new Item
                (15018), new Item(21793), new Item(20163), new Item(7462), new Item(13738), new Item(20159), new Item
                (18355)),
        FASHION("Fashion", new Item(1048), new Item(2661), new Item(2663), new Item(2667), new Item(1837), new Item
                (6611), new Item(7803), new Item(775), new Item(6564)),
        MELEE_PVM_INVENTORY("Melee_Pvm_inventory", true, INVENTORY, new Item(15272, 20), new Item(2434, 1), new Item
                (2434, 1), new Item(12039, 1), new Item(14632, 1), new Item(2434, 1), new Item(15332, 1), new Item
                (8007, 10), new Item(3024, 1)),
        MELEE_PVM("Melee_Pvm", true, EQUIPMENT, MELEE_PVM_INVENTORY, new Item(10828, 1), new Item(14641, 1), new Item
                (6585, 1), new Item(18349, 1), new Item(4736, 1), new Item(20072, 1), new Item(11726, 1), new Item
                (7462, 1), new Item(11732, 1), new Item(2572, 1));

        private Item[] items;
        private String name;
        private int type;
        private boolean adminSet;
        private Set linkedSet;

        Set(String name, int type, Item... items) {
            this.items = items;
            this.name = name;
            this.type = type;
            this.adminSet = false;
        }

        Set(String name, Item... items) {
            this.items = items;
            this.name = name;
            this.type = EQUIPMENT;
            this.adminSet = true;
        }

        Set(String name, boolean adminSet, int type, Item... items) {
            this.items = items;
            this.name = name;
            this.type = type;
            this.adminSet = adminSet;
        }

        Set(String name, boolean adminSet, int type, Set linkedSet, Item... items) {
            this.items = items;
            this.name = name;
            this.type = type;
            this.adminSet = adminSet;
            this.linkedSet = linkedSet;
        }

        public Item[] getItems() {
            return this.items;
        }

        public String getName() {
            return this.name;
        }

        public int getType() {
            return this.type;
        }

        boolean isAdminSet() {
            return adminSet;
        }

    }

    private enum SkillSet {
        BERSERKER("Berserker", new int[]{Skills.ATTACK, 75}, new int[]{Skills.STRENGTH, 99}, new int[]{Skills.PRAYER,
                95}, new int[]{Skills.HITPOINTS, 99}, new int[]{Skills.RANGE, 99}, new int[]{Skills.MAGIC, 99}),

        DH_PURE("DH Pure", new int[]{Skills.ATTACK, 70}, new int[]{Skills.STRENGTH, 99}, new int[]{Skills.DEFENCE,
                70}, new int[]{Skills.RANGE, 99}, new int[]{Skills.MAGIC, 99}, new int[]{Skills.HITPOINTS, 99}, new
                int[]{Skills.PRAYER, 95,}),

        HYBRID("Hybrid", new int[]{Skills.ATTACK, 99}, new int[]{Skills.STRENGTH, 99}, new int[]{Skills.DEFENCE, 99},
                new int[]{Skills.RANGE, 99}, new int[]{Skills.MAGIC, 99}, new int[]{Skills.PRAYER, 99}, new
                int[]{Skills.HITPOINTS, 99}),

        ONE_DEF_PURE("One Def Pure", new int[]{Skills.ATTACK, 99}, new int[]{Skills.STRENGTH, 99}, new int[]{Skills
                .PRAYER, 95}, new int[]{Skills.RANGE, 99}, new int[]{Skills.MAGIC, 99}, new int[]{Skills.HITPOINTS,
                99});

        private String name;
        private Skills skills;

        SkillSet(String name, int[]... stats) {
            this.skills = new Skills();
            this.name = name;
            for (int[] stat : stats) {
                skills.setXp(stat[0], Skills.getXPForLevel(stat[1]));
            }
        }

        public String getName() {
            return this.name;
        }

        public Skills getSkills() {
            return this.skills;
        }
    }

    private static final int EQUIPMENT = 1, INVENTORY = 2;

    private static Set getInvSet(String name) {
        for (Set set : Set.values()) {
            if (set.getName().equalsIgnoreCase(name) && set.getType() == INVENTORY) return set;
        }
        return null;
    }

    private static Set getEquipmentSet(String name) {
        for (Set set : Set.values()) {
            if (set.getName().equalsIgnoreCase(name) && set.getType() == EQUIPMENT) return set;
        }
        return null;
    }

    private static SkillSet getSkillSet(String name) {
        for (SkillSet set : SkillSet.values()) {
            if (set.getName().equalsIgnoreCase(name)) return set;
        }
        return null;
    }

    public static void listSets(Player player) {
        String message = "Current sets: ";
        for (Set set : Set.values()) {
            if (!set.isAdminSet()) message += set.getName() + ", ";
        }
        player.sendMessage(message);
        if (player.hasRights(RanksManager.Ranks.ADMIN)) {
            message = "Available Admin sets: ";
            for (Set set : Set.values()) {
                if (set.isAdminSet()) message += set.getName() + ", ";
            }
        }
        player.sendMessage(message);
    }

    public static void addInvSet(Player player, String name) {
        Set set = getInvSet(name);
        if (set == null || (!player.hasRights(RanksManager.Ranks.ADMIN) && set.isAdminSet())) return;
        for (Item item : set.items) {
            player.getInventory().addItem(item);
        }
        player.getInventory().refresh();
    }

    public static void setInvSet(Player player, String name) {
        Set set = getInvSet(name);
        if (set == null || (!player.hasRights(RanksManager.Ranks.ADMIN) && set.isAdminSet())) return;
        player.getInventory().reset();
        for (Item item : set.items) {
            player.getInventory().addItem(item);
        }
        player.getInventory().refresh();
    }

    public static void addEquipmentSet(Player player, String name) {
        Item oldItem = player.getInventory().getItem(0);
        Set set = getEquipmentSet(name);
        if (set == null || (!player.hasRights(RanksManager.Ranks.ADMIN) && set.isAdminSet())) return;
        if (set.isAdminSet()) {
            player.getEquipment().reset();
            if (oldItem != null) player.getInventory().deleteItem(0, oldItem);
            for (Item item : set.items) {
                player.getInventory().addItem(item);
                InterfaceHandler.equipItem(player, 0, item.getId());
                player.getInventory().deleteItem(0, item);
            }
            if (oldItem != null) player.getInventory().addItem(oldItem);
            player.getAppearance().generateAppearanceData();
            player.getInventory().refresh();
            player.sendMessage("You spawn the " + name + " set.");
            if (set.linkedSet != null) {
                setInvSet(player, set.linkedSet.name);
            }
            return;
        }
        if (oldItem != null) player.getInventory().deleteItem(0, oldItem);
        player.getEquipment().reset();
        for (Item item : set.items) {
            player.getInventory().addItem(item);
            InterfaceHandler.equipItem(player, 0, item.getId());
            player.getInventory().deleteItem(0, item);
        }
        if (oldItem != null) player.getInventory().addItem(oldItem);
        player.getAppearance().generateAppearanceData();
        player.getInventory().refresh();
        player.sendMessage("You spawn the " + name + " set.");
    }

    public static void setSkillsSet(Player player, String name) {
        SkillSet set = getSkillSet(name);
        if (set == null) return;
        //player.setSkills(set.getSkills());
        player.getSkills().setPlayer(player);
        player.getSkills().init();
        //player.getSkills().refreshSkills();
        player.sendMessage("Your skills have been set to " + name + " skills set.");
    }

}
