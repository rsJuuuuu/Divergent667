package com.rs.game.player.actions;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

import static com.rs.game.player.actions.Woodcutting.TreeDefinitions.VINES;

public final class Woodcutting extends Action {
    public enum TreeDefinitions {

        NORMAL(1, 25, 1511, 20, 4, 1341, 8, 0),
        DEAD(1, 25, 1511, 20, 4, 12733, 8, 0),

        OAK(15, 37.5, 1521, 30, 4, 1341, 15, 15),

        WILLOW(30, 67.5, 1519, 60, 4, 1341, 51, 15),

        MAPLE(45, 100, 1517, 83, 16, 31057, 72, 10),

        YEW(60, 175, 1515, 120, 17, 1341, 94, 10),

        IVY(68, 332.5, -1, 120, 17, 46319, 58, 10),

        MAGIC(75, 250, 1513, 150, 21, 37824, 121, 10),

        CURSED_MAGIC(82, 250, 1513, 150, 21, 37822, 121, 10),

        MUTATED_JADE(95, 375.5, 21358, 185, 15, -1, 199, 10),
        VINES(1, 1, -1, 15, 15, -1, 15, 0);

        private int level;
        private double xp;
        private int logsId;
        private int logBaseTime;
        private int logRandomTime;
        private int stumpId;
        private int respawnDelay;
        private int randomLifeProbability;

        TreeDefinitions(int level, double xp, int logsId, int logBaseTime, int logRandomTime, int stumpId, int
                respawnDelay, int randomLifeProbability) {
            this.level = level;
            this.xp = xp;
            this.logsId = logsId;
            this.logBaseTime = logBaseTime;
            this.logRandomTime = logRandomTime;
            this.stumpId = stumpId;
            this.respawnDelay = respawnDelay;
            this.randomLifeProbability = randomLifeProbability;
        }

        public int getLevel() {
            return level;
        }

        public double getXp() {
            return xp;
        }

        public int getLogsId() {
            return logsId;
        }

        public int getLogBaseTime() {
            return logBaseTime;
        }

        public int getLogRandomTime() {
            return logRandomTime;
        }

        public int getStumpId() {
            return stumpId;
        }

        public int getRespawnDelay() {
            return respawnDelay;
        }

        public int getRandomLifeProbability() {
            return randomLifeProbability;
        }
    }

    private WorldObject tree;
    private TreeDefinitions definitions;

    private int emoteId;
    private boolean usingBeaver = false;
    private int axeTime;

    public Woodcutting(WorldObject tree, TreeDefinitions definitions) {
        this.tree = tree;
        this.definitions = definitions;
    }

    @Override
    public boolean start(Player player) {
        if (!checkAll(player)) return false;
        player.getPackets().sendGameMessage(usingBeaver ? "Your beaver uses its strong teeth to chop down the tree..." :
                "You swing your hatchet at the " + (
                        TreeDefinitions.IVY == definitions ? "ivy" : (VINES == definitions) ? "vines" : "tree")
                + "...");
        setActionDelay(player, getWoodcuttingDelay(player));
        return true;
    }

    private int getWoodcuttingDelay(Player player) {
        int summoningBonus = player.getFollower() != null ? (player.getFollower().getId() == 6808
                                                             || player.getFollower().getId() == 6807) ? 10 : 0 : 0;
        int wcTimer = definitions.getLogBaseTime() - (player.getSkills().getLevel(8) + summoningBonus)
                      - Utils.getRandom(axeTime);
        if (wcTimer < 1 + definitions.getLogRandomTime()) wcTimer = 1 + Utils.getRandom(definitions.getLogRandomTime());
        wcTimer /= player.getAuraManager().getWoodcuttingAccurayMultiplier();
        return wcTimer;
    }

    private boolean checkAll(Player player) {
        if (!com.rs.game.player.content.skills.Woodcutting.Hatchet.hasHatchet(player)) {
            player.getPackets().sendGameMessage("You need a hatchet to chop down this tree.");
            return false;
        }
        if (!setAxe(player)) {
            player.getPackets().sendGameMessage("You don't have the required level to use that axe.");
            return false;
        }
        if (!hasWoodcuttingLevel(player)) return false;
        if (!player.getInventory().hasFreeSlots()) {
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return false;
        }
        return true;
    }

    private boolean hasWoodcuttingLevel(Player player) {
        return RequirementsManager.hasRequirement(player, Skills.WOODCUTTING, definitions.getLevel(),
                "to chop down " + "this tree");
    }

    private boolean setAxe(Player player) {
        com.rs.game.player.content.skills.Woodcutting.Hatchet hatchet = com.rs.game.player.content.skills.Woodcutting
                .Hatchet.forId(player);
        if (hatchet == null) return false;
        axeTime = hatchet.getTime();
        emoteId = hatchet.getEmoteId();
        return true;
    }

    @Override
    public boolean process(Player player) {
        player.setNextAnimation(new Animation(usingBeaver ? 1 : emoteId));
        return checkTree(player);
    }

    private boolean usedDeplateAurora;

    @Override
    public int processWithDelay(Player player) {
        addLog(player);
        if (!usedDeplateAurora && (1 + Math.random()) < player.getAuraManager().getChanceNotDepleteMN_WC()) {
            usedDeplateAurora = true;
        } else if (Utils.getRandom(definitions.getRandomLifeProbability()) == 0) {
            long time = definitions.respawnDelay * 600;
            if (definitions == VINES) {
                switch (player.getDirection()) {
                    case 0:
                        player.addWalkStep(player.getX(), player.getY() - 1, player.getX(), player.getY(), false);
                        player.addWalkStep(player.getX(), player.getY() - 2, player.getX(), player.getY() - 1, false);
                        break;
                    case 4096:
                        player.addWalkStep(player.getX() - 1, player.getY(), player.getX(), player.getY(), false);
                        player.addWalkStep(player.getX() - 2, player.getY(), player.getX() - 1, player.getY(), false);
                        break;
                    case 8192:
                        player.addWalkStep(player.getX(), player.getY() + 1, player.getX(), player.getY(), false);
                        player.addWalkStep(player.getX(), player.getY() + 2, player.getX(), player.getY() + 1, false);
                        break;
                    case 12288:
                        player.addWalkStep(player.getX() + 1, player.getY(), player.getX(), player.getY(), false);
                        player.addWalkStep(player.getX() + 2, player.getY(), player.getX() + 1, player.getY(), false);
                        break;
                }
            } else {
                World.spawnTemporaryObject(new WorldObject(definitions.getStumpId(), tree.getType(), tree.getRotation(),
                        tree.getX(), tree.getY(), tree.getPlane()), time);
                if (tree.getPlane() < 3) {
                    WorldObject object = World.getObject(new WorldTile(
                            tree.getX() - 1, tree.getY() - 1, tree.getPlane() + 1));
                    if (object != null) World.removeTemporaryObject(object, time, false);
                }
            }
            player.setNextAnimation(new Animation(-1));
            return -1;
        }
        if (!player.getInventory().hasFreeSlots()) {
            player.setNextAnimation(new Animation(-1));
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            return -1;
        }
        return getWoodcuttingDelay(player);
    }

    private void addLog(Player player) {
        double xpBoost = 1.00;
        if (player.getEquipment().getChestId() == 10939) xpBoost += 0.008;
        if (player.getEquipment().getLegsId() == 10940) xpBoost += 0.006;
        if (player.getEquipment().getHatId() == 10941) xpBoost += 0.004;
        if (player.getEquipment().getBootsId() == 10933) xpBoost += 0.002;
        if (player.getEquipment().getChestId() == 10939 && player.getEquipment().getLegsId() == 10940
            && player.getEquipment().getHatId() == 10941 && player.getEquipment().getBootsId() == 10933)
            xpBoost += 0.005;
        player.getSkills().addXp(8, definitions.getXp() * xpBoost);
        player.getInventory().addItem(definitions.getLogsId(), 1);
        if (definitions == TreeDefinitions.VINES) {
            player.sendMessage("You successfully cut through the vines.");
        } else if (definitions == TreeDefinitions.IVY) {
            player.getPackets().sendGameMessage("You successfully cut an ivy vine.", true);
        } else {
            String logName = ItemDefinitions.getItemDefinitions(definitions.getLogsId()).getName().toLowerCase();
            player.getPackets().sendGameMessage("You get some " + logName + ".", true);
        }
    }

    private boolean checkTree(Player player) {
        return World.getRegion(tree.getRegionId()).containsObject(tree.getId(), tree);
    }

    @Override
    public void stop(Player player) {
        setActionDelay(player, 3);
    }

}
