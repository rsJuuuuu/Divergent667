package com.rs.game.player.actions.mining;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.actionHandling.Handler;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.utils.Utils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.CLICK_1;
import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.RETURN;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

public final class Mining extends Action implements Handler {

    @Override
    public void register() {
        for (RockDefinitions rockDefinition : RockDefinitions.values()) {
            registerObjectAction(CLICK_1, (player, object, clickType) -> {
                player.getActionManager().setAction(new Mining(object, rockDefinition));
                return RETURN;
            }, rockDefinition.getObjectIds());
        }
    }
    private enum RockDefinitions {

        Clay_Ore(1, 5, 434, 10, 1, 11552, 5, 0, new int[]{15505, 15503, 15504, 11556}),
        Copper_Ore(1, 17.5, 436, 10, 1, 11552, 5, 0, new int[]{18991, 18992, 18993, 3027, 3229, 11936, 11937, 11938,
                11960, 11961, 11962}),
        Tin_Ore(1, 17.5, 438, 15, 1, 11552, 5, 0, new int[]{10949, 18994, 18995, 18996, 3038, 3246, 11933, 11934,
                11935, 11957, 11958, 11959}),
        Iron_Ore(15, 35, 440, 15, 1, 11552, 10, 0, new int[]{19000, 19001, 19002, 37309, 37307, 11954, 11955, 11956}),
        Sandstone_Ore(35, 30, 6971, 30, 1, 11552, 10, 0, new int[]{10946}),
        Silver_Ore(20, 40, 442, 25, 1, 11552, 20, 0, new int[]{37306, 2311, 37304, 37305, 11950, 11940, 11948, 15580,
                15579, 15581}),
        Coal_Ore(30, 50, 453, 50, 10, 11552, 30, 0, new int[]{10948, 18997, 18998, 18999, 14850, 14851, 3233, 3032,
                11930, 11931, 11932, 11557}),
        Granite_Ore(45, 50, 6979, 50, 10, 11552, 20, 0, new int[]{10947}),
        Gold_Ore(40, 60, 444, 80, 20, 11554, 40, 0, new int[]{37312, 11952, 37310, 2098, 2099, 15578, 15576, 15577}),
        Mithril_Ore(55, 80, 447, 100, 20, 11552, 60, 0, new int[]{3041, 3280, 11942, 11944}),
        Adamant_Ore(70, 95, 449, 130, 25, 11552, 180, 0, new int[]{3273, 3040, 11939, 11941}),
        Runite_Ore(85, 125, 451, 150, 30, 11552, 360, 0, new int[]{14860, 14861});

        private double xp;

        private int level;
        private int oreId;
        private int oreBaseTime;
        private int oreRandomTime;
        private int emptySpot;
        private int respawnDelay;
        private int randomLifeProbability;

        private int[] objectIds;

        RockDefinitions(int level, double xp, int oreId, int oreBaseTime, int oreRandomTime, int emptySpot, int
                respawnDelay, int randomLifeProbability, int[] objectIds) {
            this.level = level;
            this.xp = xp;
            this.oreId = oreId;
            this.oreBaseTime = oreBaseTime;
            this.oreRandomTime = oreRandomTime;
            this.emptySpot = emptySpot;
            this.respawnDelay = respawnDelay;
            this.randomLifeProbability = randomLifeProbability;
            this.objectIds = objectIds;
        }

        public int getLevel() {
            return level;
        }

        public double getXp() {
            return xp;
        }

        public int getOreId() {
            return oreId;
        }

        public int getOreBaseTime() {
            return oreBaseTime;
        }

        public int getOreRandomTime() {
            return oreRandomTime;
        }

        public int getEmptyId() {
            return emptySpot;
        }

        public int getRespawnDelay() {
            return respawnDelay;
        }

        public int getRandomLifeProbability() {
            return randomLifeProbability;
        }

        public int[] getObjectIds() {
            return objectIds;
        }
    }

    private WorldObject rock;
    private RockDefinitions definitions;

    private int emoteId;
    private int pickaxeTime;

    public Mining(){

    }

    public Mining(WorldObject rock, RockDefinitions definitions) {
        this.rock = rock;
        this.definitions = definitions;
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        player.getPackets().sendGameMessage("You swing your pickaxe at the rock.");
        setActionDelay(player, getMiningDelay(player));
        rock.setLife(definitions.getRandomLifeProbability());
        return true;
    }

    private int getMiningDelay(Player player) {
        int summoningBonus = 0;
        if (player.getFollower() != null) {
            if (player.getFollower().getId() == 7342 || player.getFollower().getId() == 7342) summoningBonus += 10;
            else if (player.getFollower().getId() == 6832 || player.getFollower().getId() == 6831) summoningBonus += 1;
        }
        int mineTimer = definitions.getOreBaseTime() - (player.getSkills().getLevel(Skills.MINING) + summoningBonus)
                        - Utils.getRandom(pickaxeTime);
        if (mineTimer < 1 + definitions.getOreRandomTime())
            mineTimer = 1 + Utils.getRandom(definitions.getOreRandomTime());
        mineTimer /= player.getAuraManager().getMininingAccurayMultiplier();
        return mineTimer;
    }

    private boolean checkAll(Player player) {
        if (!hasPickaxe(player)) {
            player.getPackets().sendGameMessage("You need a pickaxe to mine this rock.");
            return false;
        }
        if (!setPickaxe(player)) {
            player.getPackets().sendGameMessage("You don't have the required level to use this pickaxe.");
            return false;
        }
        if (!hasMiningLevel(player)) return false;
        if (!player.getInventory().hasFreeSlots()) {
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return false;
        }
        return true;
    }

    private boolean hasMiningLevel(Player player) {
        if (definitions.getLevel() > player.getSkills().getLevel(Skills.MINING)) {
            player.getPackets().sendGameMessage(
                    "You need a mining level of " + definitions.getLevel() + " to mind this rock.");
            return false;
        }
        return true;
    }

    private boolean setPickaxe(Player player) {
        int level = player.getSkills().getLevel(Skills.MINING);
        int weaponId = player.getEquipment().getWeaponId();
        if (weaponId != -1) {
            switch (weaponId) {
                case 15259: // dragon pickaxe
                    if (level >= 61) {
                        emoteId = 12190;
                        pickaxeTime = 13;
                        return true;
                    }
                    break;
                case 1275: // rune pickaxe
                    if (level >= 41) {
                        emoteId = 624;
                        pickaxeTime = 10;
                        return true;
                    }
                    break;
                case 1271: // adam pickaxe
                    if (level >= 31) {
                        emoteId = 628;
                        pickaxeTime = 7;
                        return true;
                    }
                    break;
                case 1273: // mith pickaxe
                    if (level >= 21) {
                        emoteId = 629;
                        pickaxeTime = 5;
                        return true;
                    }
                    break;
                case 1269: // steel pickaxe
                    if (level >= 6) {
                        emoteId = 627;
                        pickaxeTime = 3;
                        return true;
                    }
                    break;
                case 1267: // iron pickaxe
                    emoteId = 626;
                    pickaxeTime = 2;
                    return true;
                case 1265: // bronze axe
                    emoteId = 625;
                    pickaxeTime = 1;
                    return true;
                case 13661: // Inferno adze
                    if (level >= 61) {
                        emoteId = 10222;
                        pickaxeTime = 13;
                        return true;
                    }
                    break;
            }
        }
        if (player.getInventory().containsOneItem(15259)) {
            if (level >= 61) {
                emoteId = 12190;
                pickaxeTime = 13;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1275)) {
            if (level >= 41) {
                emoteId = 624;
                pickaxeTime = 10;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1271)) {
            if (level >= 31) {
                emoteId = 628;
                pickaxeTime = 7;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1273)) {
            if (level >= 21) {
                emoteId = 629;
                pickaxeTime = 5;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1269)) {
            if (level >= 6) {
                emoteId = 627;
                pickaxeTime = 3;
                return true;
            }
        }
        if (player.getInventory().containsOneItem(1267)) {
            emoteId = 626;
            pickaxeTime = 2;
            return true;
        }
        if (player.getInventory().containsOneItem(1265)) {
            emoteId = 625;
            pickaxeTime = 1;
            return true;
        }
        if (player.getInventory().containsOneItem(13661)) {
            if (level >= 61) {
                emoteId = 10222;
                pickaxeTime = 13;
                return true;
            }
        }
        return false;

    }

    private boolean hasPickaxe(Player player) {
        if (player.getInventory().containsOneItem(15259, 1275, 1271, 1273, 1269, 1267, 1265, 13661)) return true;
        int weaponId = player.getEquipment().getWeaponId();
        if (weaponId == -1) return false;
        switch (weaponId) {
            case 1265:// Bronze PickAxe
            case 1267:// Iron PickAxe
            case 1269:// Steel PickAxe
            case 1273:// Mithril PickAxe
            case 1271:// Adamant PickAxe
            case 1275:// Rune PickAxe
            case 15259:// Dragon PickAxe
            case 13661: // Inferno adze
                return true;
            default:
                return false;
        }

    }

    @Override
    public boolean process(Player player) {
        player.setNextAnimation(new Animation(emoteId));
        return checkRock(player);
    }

    private boolean usedDeplateAurora;

    @Override
    public int processWithDelay(Player player) {
        addOre(player);
        rock.decrementObjectLife();
        if (!usedDeplateAurora && (1 + Math.random()) < player.getAuraManager().getChanceNotDepleteMN_WC()) {
            usedDeplateAurora = true;
        } else if (rock.getLife() == 0) {
            World.spawnTemporaryObject(new WorldObject(definitions.getEmptyId(), rock.getType(), rock.getRotation(),
                            rock.getX(), rock.getY(), rock.getPlane()),
                    definitions.respawnDelay * 600, false);
            player.setNextAnimation(new Animation(-1));
            return -1;
        }
        if (!player.getInventory().hasFreeSlots() && definitions.getOreId() != -1) {
            player.setNextAnimation(new Animation(-1));
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return -1;
        }
        return getMiningDelay(player);
    }

    private void addOre(Player player) {
        double xpBoost = 0;
        int idSome = 0;
        if (definitions == RockDefinitions.Granite_Ore) {
            idSome = Utils.getRandom(2) * 2;
            if (idSome == 2) xpBoost += 10;
            else if (idSome == 4) xpBoost += 25;
        } else if (definitions == RockDefinitions.Sandstone_Ore) {
            idSome = Utils.getRandom(3) * 2;
            xpBoost += idSome / 2 * 10;
        } else if (player.getFollower() != null && (player.getFollower().getId() == 7342
                                                    || player.getFollower().getId() == 7342)) xpBoost += 40;
        player.getSkills().addXp(Skills.MINING, definitions.getXp() + xpBoost);
        if (definitions.getOreId() != -1) {
            player.getInventory().addItem(definitions.getOreId() + idSome, 1);
            String oreName = ItemDefinitions.getItemDefinitions(
                    definitions.getOreId() + idSome).getName().toLowerCase();
            player.getPackets().sendGameMessage("You mine some " + oreName + ".", true);
        }
    }

    private boolean checkRock(Player player) {
        return World.getRegion(rock.getRegionId()).containsObject(rock.getId(), rock);
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }

}
