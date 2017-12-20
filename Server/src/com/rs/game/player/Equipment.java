package com.rs.game.player;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.utils.game.itemUtils.ItemExamines;

import java.io.Serializable;

import static com.rs.utils.Constants.*;

public final class Equipment implements Serializable {

    private static final long serialVersionUID = -4147163237095647617L;

    public static final byte SLOT_HAT = 0, SLOT_CAPE = 1, SLOT_AMULET = 2, SLOT_WEAPON = 3, SLOT_CHEST = 4,
            SLOT_SHIELD = 5, SLOT_LEGS = 7, SLOT_HANDS = 9, SLOT_FEET = 10, SLOT_RING = 12, SLOT_ARROWS = 13,
            SLOT_AURA = 14;

    private static String[] CAPES = {"cloak", "cape", "ava's", "tokhaar"};

    private static String[] HATS = {"visor", "ears", "goggles", "bearhead", "tiara", "cowl", "druidic wreath",
            "halo", "crown", "sallet", "helm", "hood", "coif", "flaming skull", "Coif", "partyhat", "hat", "cap", " bandana", "full helm (t)", "full helm (g)", "full helm (or)", "cav", "boater", "helmet", "afro", "beard", "gnome goggles", "mask", "Helm of neitiznot", "mitre", "nemes", "wig", "headdress"};

    private static String[] BOOTS = {"boots", "Boots", "shoes", "Shoes", "flippers"};

    private static String[] GLOVES = {"gloves", "gauntlets", "Gloves", "vambraces", "vamb", "bracers", "brace"};

    private static String[] AMULETS = {"stole", "amulet", "necklace", "Amulet of", "scarf", "Super dominion medallion"};

    private static String[] SHIELDS = {"tome of frost", "kiteshield", "sq shield", "Toktz-ket", "books", "book",
            "kiteshield (t)", "kiteshield (g)", "kiteshield(h)", "defender", "shield", "deflector", "off-hand"};

    private static String[] ARROWS = {"arrow", "arrows", "arrow(p)", "arrow(+)", "arrow(s)", "bolt", "Bolt rack",
            "Opal bolts", "Dragon bolts", "bolts (e)", "bolts", "Hand cannon shot", "grapple"};

    private static String[] RINGS = {"ring"};

    private static String[] BODY = {"poncho", "apron", "robe top", "armour", "hauberk", "platebody", "chainbody",
            "breastplate", "blouse", "robetop", "leathertop", "platemail", "top", "brassard", "body", "wizard robe",
            "chestguard", "platebody (g)", "body(g)", "body_(g)", "chestplate", "torso", "shirt",
            "Rock-shell " + "plate", "coat", "jacket"};

    private static String[] AURAS = {"poison purge", "Salvation", "Corruption", "salvation", "corruption", "runic "
                                                                                                           +
                                                                                                           "accuracy", "sharpshooter", "lumberjack", "quarrymaster", "call of the sea", "reverence", "five finger discount", "resourceful", "equilibrium", "inspiration", "vampyrism", "penance", "wisdom", "jack of trades", "gaze"};
    private static int[] BODY_LIST = {21463, 21549, 544, 6107};

    private static int[] LEGS_LIST = {542, 6108, 10340, 7398};

    private static String[] LEGS = {"leggings", "void knight robe", "druidic robe", "cuisse", "pants", "platelegs",
            "plateskirt", "skirt", "bottoms", "chaps", "platelegs (t)", "platelegs (or)", "platelegs (g)", "bottom",
            "skirt", "skirt (g)", "skirt (t)", "chaps (g)", "chaps (t)", "tassets", "legs", "trousers",
            "robe " + "bottom", "shorts",};

    private static String[] WEAPONS = {"bolas", "stick", "blade", "Butterfly net", "scythe", "rapier", "hatchet",
            "bow", "Hand cannon", "sword of destruction", "Inferno adze", "Silverlight", "Darklight", "wand",
            "Upgraded Ags", "Statius's warhammer", "anchor", "spear.", "Vesta's longsword.", "scimitar", "longsword",
            "sword", "longbow", "shortbow", "dagger", "mace", "halberd", "spear", "Abyssal whip",
            "Abyssal vine " + "whip", "Ornate "
                                      + "katana","sling", "axe", "flail", "crossbow", "Torags hammers", "Crossbow of love",
            "dagger(p)", "dagger (p++)",
            "dagger(+)"
            + "", "dagger(s)", "spear(p)", "spear(+)", "spear(s)", "spear(kp)", "maul", "dart", "dart(p)", "javelin",
            "javelin(p)", "knife", "knife(p)", "Longbow", "primal 1h sword", "Shortbow", "Crossbow", "Toktz-xil",
            "Shark fists", "Toktz-mej", "Tzhaar-ket", "staff", "Staff", "godsword", "c'bow", "Crystal bow",
            "Dark " + "bow", "staff of peace", "claws", "warhammer", "hammers", "adze", "hand", "Broomstick",
            "Upgraded "
            + "Korasi", "Flowers", "flowers", "trident", "excalibur", "cane", "sled", "Katana", "bag", "tenderiser",
            "eggsterminator", "Sled", "chinchompa", "sceptre", "decimation", "obliteration", "annihilation"};

    private static String[] NOT_FULL_BODY = {"zombie shirt"};

    private static String[] FULL_BODY = {"robe", "breastplate", "blouse", "pernix body", "vesta's chainbody",
            "armour", "hauberk", "top", "shirt", "platebody", "Ahrims robetop", "Karils leathertop", "brassard",
            "chestplate", "torso", "Morrigan's", "Zuriel's", "changshan jacket"};

    private static String[] FULL_HAT = {"helm", "cowl", "sallet", "med helm", "coif", "Dharoks helm",
            "Initiate " + "helm", "Coif", "Helm of neitiznot"};

    private static String[] FULL_MASK = {"sallet", "mask", "full helm", "mask", "Veracs helm", "Guthans helm",
            "Torags helm", "flaming skull", "Karils coif", "full helm (t)", "full helm (g)"};

    private ItemsContainer<Item> items;

    private transient Player player;
    private transient int equipmentHpIncrease;

    static final int[] DISABLED_SLOTS = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0};

    public Equipment() {
        items = new ItemsContainer<>(15, false);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void init() {
        player.getPackets().sendItems(94, items);
        refresh(null);
    }

    public void refresh(int... slots) {
        if (slots != null) {
            player.getPackets().sendUpdateItems(94, items, slots);
            player.getCombatDefinitions().checkAttackStyle();
        }
        player.getCombatDefinitions().refreshBonuses();
        refreshConfigs(slots == null);
    }

    public void reset() {
        items.reset();
        init();
    }

    public Item getItem(int slot) {
        return items.get(slot);
    }

    public void sendExamine(int slotId) {
        Item item = items.get(slotId);
        if (item == null) return;
        player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
    }

    private void refreshConfigs(boolean init) {
        double hpIncrease = 0;
        for (int index = 0; index < items.getSize(); index++) {
            Item item = items.get(index);
            if (item == null) continue;
            int id = item.getId();
            if (index == Equipment.SLOT_HAT) {
                if (id == 20135 || id == 20137 // torva
                    || id == 20147 || id == 20149 // pernix
                    || id == 20159 || id == 20161 // virtus
                        ) hpIncrease += 66;
                else if (id == AIR_TIARA) player.getPackets().sendConfig(491, 1);
                else if (id == EARTH_TIARA) player.getPackets().sendConfig(491, 8);
                else if (id == FIRE_TIARA) player.getPackets().sendConfig(491, 16);
                else if (id == WATER_TIARA) player.getPackets().sendConfig(491, 4);
                else if (id == BODY_TIARA) player.getPackets().sendConfig(491, 32);
                else if (id == MIND_TIARA) player.getPackets().sendConfig(491, 2);
                else if (id == OMNI_TIARA) player.getPackets().sendConfig(491, -1);

            } else if (index == Equipment.SLOT_CHEST) {
                if (id == 20139 || id == 20141 // torva
                    || id == 20151 || id == 20153 // pernix
                    || id == 20163 || id == 20165 // virtus
                        ) hpIncrease += 200;
            } else if (index == Equipment.SLOT_LEGS) {
                if (id == 20143 || id == 20145 // torva
                    || id == 20155 || id == 20157 // pernix
                    || id == 20167 || id == 20169 // virtus
                        ) hpIncrease += 134;
            }

        }
        if (hpIncrease != equipmentHpIncrease) {
            equipmentHpIncrease = (int) hpIncrease;
            if (!init) player.refreshHitPoints();
        }
    }

    static boolean isFullBody(Item item) {
        String itemName = item.getDefinitions().getName();
        if (itemName == null) return false;
        itemName = itemName.toLowerCase();
        for (String aNOT_FULL_BODY : NOT_FULL_BODY)
            if (itemName.contains(aNOT_FULL_BODY.toLowerCase())) return false;
        for (String aFULL_BODY : FULL_BODY)
            if (itemName.contains(aFULL_BODY.toLowerCase())) return true;
        return false;
    }

    static boolean isFullHat(Item item) {
        String itemName = item.getDefinitions().getName();
        if (itemName == null) return false;
        itemName = itemName.toLowerCase();
        for (String aFULL_HAT : FULL_HAT) {
            if (itemName.contains(aFULL_HAT.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    static boolean isFullMask(Item item) {
        String itemName = item.getDefinitions().getName();
        if (itemName == null) return false;
        itemName = itemName.toLowerCase();
        for (String aFULL_MASK : FULL_MASK)
            if (itemName.contains(aFULL_MASK.toLowerCase())) return true;
        return false;
    }

    public static int getItemSlot(int itemId) {
        for (int aBODY_LIST : BODY_LIST)
            if (itemId == aBODY_LIST) return 4;
        for (int aLEGS_LIST : LEGS_LIST)
            if (itemId == aLEGS_LIST) return 7;
        if (ItemDefinitions.getItemDefinitions(itemId).getName() == null) return -1;
        String item = ItemDefinitions.getItemDefinitions(itemId).getName().toLowerCase();
        for (String CAPE : CAPES)
            if (item.contains(CAPE.toLowerCase())) return 1;
        for (String BOOT : BOOTS)
            if (item.contains(BOOT.toLowerCase())) return 10;
        for (String GLOVE : GLOVES)
            if (item.contains(GLOVE.toLowerCase())) return 9;
        for (String SHIELD : SHIELDS)
            if (item.contains(SHIELD.toLowerCase())) return 5;
        for (String AMULET : AMULETS)
            if (item.contains(AMULET.toLowerCase())) return 2;
        for (String ARROW : ARROWS)
            if (item.contains(ARROW.toLowerCase())) return 13;
        for (String RING : RINGS)
            if (item.contains(RING.toLowerCase())) return 12;
        for (String WEAPON : WEAPONS)
            if (item.contains(WEAPON.toLowerCase())) return 3;
        if (itemId == 4084) {
            return 3;
        }
        if (item.toLowerCase().contains("chinchompa")) return 3;
        for (String HAT : HATS)
            if (item.contains(HAT.toLowerCase())) return 0;
        for (String aBODY : BODY)
            if (item.contains(aBODY.toLowerCase())) return 4;
        for (String LEG : LEGS)
            if (item.contains(LEG.toLowerCase())) return 7;
        for (String AURA : AURAS)
            if (item.contains(AURA.toLowerCase())) return SLOT_AURA;
        return -1;
    }

    public boolean hasTwoHandedWeapon() {
        Item item = items.get(SLOT_WEAPON);
        return item != null && isTwoHandedWeapon(item);
    }

    public static boolean isTwoHandedWeapon(Item item) {
        int itemId = item.getId();
        if (itemId == 4212) return true;
        if (itemId == 4084) {
            return true;
        } else if (itemId == 4214) return true;
        else if (itemId == 20281) return true;
        if (item.getDefinitions().getName() == null) return false;
        String wepEquipped = item.getDefinitions().getName().toLowerCase();
        if (wepEquipped.equals("stone of power")) return true;
        else if (wepEquipped.equals("dominion sword")) return true;
        else if (wepEquipped.endsWith("claws")) return true;
        else if (wepEquipped.endsWith("anchor")) return true;
        else if (wepEquipped.contains("2h sword")) return true;
        else if (wepEquipped.contains("katana")) return true;
        else if (wepEquipped.equals("seercull")) return true;
        else if (wepEquipped.contains("shortbow")) return true;
        else if (wepEquipped.contains("longbow")) return true;
        else if (wepEquipped.contains("shortbow")) return true;
        else if (wepEquipped.contains("bow full")) return true;
        else if (wepEquipped.equals("zaryte bow")) return true;
        else if (wepEquipped.equals("dark bow")) return true;
        else if (wepEquipped.endsWith("halberd")) return true;
        else if (wepEquipped.contains("maul")) return true;
        else if (wepEquipped.equals("karil's crossbow")) return true;
        else if (wepEquipped.equals("torag's hammers")) return true;
        else if (wepEquipped.equals("verac's flail")) return true;
        else if (wepEquipped.contains("greataxe")) return true;
        else if (wepEquipped.contains("spear")) return true;
        else if (wepEquipped.equals("tzhaar-ket-om")) return true;
        else if (wepEquipped.contains("godsword")) return true;
        else if (wepEquipped.equals("saradomin sword")) return true;
        else if (wepEquipped.equals("hand cannon")) return true;
        else if (wepEquipped.equals("primal 1h sword")) return true;
        else if (wepEquipped.equals("Ags")) return true;
        return false;
    }

    int getWeaponRenderEmote() {
        Item weapon = items.get(3);
        if (weapon == null) return 1426;
        return weapon.getDefinitions().getRenderAnimId();
    }

    public boolean hasShield() {
        return items.get(5) != null;
    }

    public int getWeaponId() {
        Item item = items.get(SLOT_WEAPON);
        if (item == null) return -1;
        return item.getId();
    }

    public int getChestId() {
        Item item = items.get(SLOT_CHEST);
        if (item == null) return -1;
        return item.getId();
    }

    public int getHatId() {
        Item item = items.get(SLOT_HAT);
        if (item == null) return -1;
        return item.getId();
    }

    public int getShieldId() {
        Item item = items.get(SLOT_SHIELD);
        if (item == null) return -1;
        return item.getId();
    }

    public int getLegsId() {
        Item item = items.get(SLOT_LEGS);
        if (item == null) return -1;
        return item.getId();
    }

    public void removeAmmo(int ammoId, int amount) {
        if (amount == -1) {
            items.remove(SLOT_WEAPON, new Item(ammoId, 1));
            refresh(SLOT_WEAPON);
        } else {
            items.remove(SLOT_ARROWS, new Item(ammoId, amount));
            refresh(SLOT_ARROWS);
        }
    }

    int getAuraId() {
        Item item = items.get(SLOT_AURA);
        if (item == null) return -1;
        return item.getId();
    }

    public int getCapeId() {
        Item item = items.get(SLOT_CAPE);
        if (item == null) return -1;
        return item.getId();
    }

    public int getRingId() {
        Item item = items.get(SLOT_RING);
        if (item == null) return -1;
        return item.getId();
    }

    public int getAmmoId() {
        Item item = items.get(SLOT_ARROWS);
        if (item == null) return -1;
        return item.getId();
    }

    public void deleteItem(int itemId, int amount) {
        Item[] itemsBefore = items.getItemsCopy();
        items.remove(new Item(itemId, amount));
        refreshItems(itemsBefore);
    }

    private void refreshItems(Item[] itemsBefore) {
        int[] changedSlots = new int[itemsBefore.length];
        int count = 0;
        for (int index = 0; index < itemsBefore.length; index++) {
            if (itemsBefore[index] != items.getItems()[index]) changedSlots[count++] = index;
        }
        int[] finalChangedSlots = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        refresh(finalChangedSlots);
    }

    public int getBootsId() {
        Item item = items.get(SLOT_FEET);
        if (item == null) return -1;
        return item.getId();
    }

    public int getGlovesId() {
        Item item = items.get(SLOT_HANDS);
        if (item == null) return -1;
        return item.getId();
    }

    public ItemsContainer<Item> getItems() {
        return items;
    }

    int getEquipmentHpIncrease() {
        return equipmentHpIncrease;
    }

    public void setEquipmentHpIncrease(int hp) {
        this.equipmentHpIncrease = hp;
    }

    public boolean wearingArmour() {
        return (getItem(SLOT_HAT) != null || getItem(SLOT_CAPE) != null || getItem(SLOT_AMULET) != null
                || getItem(SLOT_WEAPON) != null || getItem(SLOT_CHEST) != null || getItem(SLOT_SHIELD) != null
                || getItem(SLOT_LEGS) != null || getItem(SLOT_HANDS) != null || getItem(SLOT_FEET) != null
                || getItem(SLOT_RING) != null);
    }

    public int getAmuletId() {
        Item item = items.get(SLOT_AMULET);
        if (item == null) return -1;
        return item.getId();
    }

}
