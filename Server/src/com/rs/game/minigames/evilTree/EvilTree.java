package com.rs.game.minigames.evilTree;

import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.info.RequirementsManager;
import com.rs.utils.game.CombatUtils;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;
import com.rs.utils.areas.Rectangle;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.HashMap;

/**
 * Created by Peng on 27.11.2016 13:10.
 */
public class EvilTree extends WorldObject {

    private int health;
    private int stage;

    //if we have been death for long enough we will get removed
    private long timeOfDeath = -1;

    private boolean dead = false;
    private boolean grown = false;

    private EvilRoot[] roots = new EvilRoot[4];
    private WorldObject[] fires = new WorldObject[9];

    private TreeManager.EvilTreeDefinitions definitions;

    /**
     * Who has damaged this -> who shall be rewarded
     */
    private HashMap<String, Integer> damageReceived = new HashMap<>();

    EvilTree(TreeManager.EvilTreeDefinitions definitions, WorldTile location) {
        super(TreeManager.SAPLING_ID, 10, 0, location.getX(), location.getY(), location.getPlane());
        this.health = 0;
        this.definitions = definitions;
        //set the positions for the roots and fires (one on each side)
        int index = 0;
        for (int x = -1; x < 2; x++)
            for (int y = -1; y < 2; y++)
                fires[index++] = new WorldObject(TreeManager.FIRE_ID, 10,
                        x == 0 ? 0 : 1, getX() + x, getY() + y, getPlane());

        roots[0] = new EvilRoot(this, new WorldTile(getX() + 1, getY() + 3, getPlane()));
        roots[1] = new EvilRoot(this, new WorldTile(getX() + 3, getY() + 1, getPlane()));
        roots[2] = new EvilRoot(this, new WorldTile(getX() + 1, getY() - 1, getPlane()));
        roots[3] = new EvilRoot(this, new WorldTile(getX() - 1, getY() + 1, getPlane()));
    }

    /**
     * See if the player can make this grow faster
     */
    void advanceGrowth(Player player) {
        if (player != null) {
            if (!RequirementsManager.hasRequirement(player, Skills.FARMING, definitions.getFarmingLevel(), "nurture this sapling"))
                return;
            if (damageReceived.containsKey(player.getUsername())) {
                player.sendMessage("You can only nurture the sapling once at this stage.");
                return;
            }
            player.getSkills().addXp(Skills.FARMING, definitions.getFarmingXp());
            player.sendMessage("You nurture the sapling to make it grow quicker.");
            damageReceived.put(player.getUsername(), 5);
        }
        health += 0.1 * definitions.getTreeHealth();

        double healthPercentage = getHealthPercentage();
        if (healthPercentage >= 1) {
            health = definitions.getTreeHealth();
            grown = true;
            updateStage();//lets grow into an actual tree
            return;
        }
        int newStage = (int) Math.floor(healthPercentage * 4);
        if (stage != newStage) {
            stage = newStage;
            updateGrowthStage();
        }
    }

    /**
     * Process someone causing damage to this tree by chopping
     */
    void processDamage(Player player, int damage) {
        int previousDamage = 0;
        if (damageReceived.containsKey(player.getUsername())) previousDamage = damageReceived.get(player.getUsername());

        health -= damage;
        double healthPercentage = getHealthPercentage();

        int newStage = (int) Math.floor(healthPercentage * 2);
        if (stage != newStage) {
            stage = newStage;
            updateStage();
        }
        damageReceived.put(player.getUsername(), damage + previousDamage);

        if (Utils.random(2) == 0) spawnRoot();

        if (health <= 0) {
            TreeManager.killTree();
            timeOfDeath = TimeUtils.getTime();
            dead = true;
        } else {
            checkRoots(player);
            for (WorldObject fire : fires)
                if (World.getRegion(player.getRegionId()).containsObject(fire.getId(), fire)) health -= 10;
        }
    }

    /**
     * Should we smack this player for trying to chop while root is near
     */
    private void checkRoots(Player player) {
        Rectangle rootArea;
        for (EvilRoot root : roots) {
            if (!root.isAlive()) continue;
            rootArea = new Rectangle(root.getX() - 1, root.getY() - 1, root.getX() + 1, root.getY() + 1);
            if (rootArea.contains(player)) {
                player.setNextAnimation(new Animation(CombatUtils.getDefenceEmote(player)));
                player.setNextFaceWorldTile(root);
                player.addWalkSteps(
                        player.getX() + (player.getX() - root.getX()), player.getY() + (player.getY() - root.getY()));
                return;
            }

        }
    }

    /**
     * Spawn a random root (adjust the number of loops to make them appear more often)
     */
    private void spawnRoot() {
        int random;
        for (int i = 0; i < 3; i++) {//makes the likelihood of spawning a root lower when more roots spawned like rs
            random = Utils.random(roots.length - 1);
            if (roots[random].isAlive()) continue;
            roots[random].spawn();
            return;
        }
    }

    /**
     * Kill all roots related to this tree
     */
    void killRoots() {
        for (EvilRoot root : roots) {
            World.removeSpawnedObject(root, true);
        }
        roots = null;
    }

    /**
     * Grow
     */
    private void updateGrowthStage() {
        damageReceived.clear();
        World.removeSpawnedObject(this, true);
        setId(TreeManager.SAPLING_ID + stage);
        World.spawnObject(this, true);
    }

    /**
     * We have either grown or gotten damaged enough to move to a new stage
     */
    private void updateStage() {
        World.removeSpawnedObject(this, true);
        setId(definitions.getId() + stage);
        World.spawnObject(this, true);
    }

    /**
     * @return How much health is left? (as decimals not %)
     */
    private double getHealthPercentage() {
        return (double) health / (double) definitions.getTreeHealth();
    }

    /**
     * How much have we done for this tree?
     */
    private double getRewardPercentage(Player player) {
        return Math.min(1, damageReceived.get(player.getUsername()) / (definitions.getTreeHealth() * 0.1));
    }

    /**
     * @return How many roots are alive at the moment?
     */
    private int getAliveRoots() {
        int aliveCount = 0;
        for (EvilRoot root : roots)
            if (root.isAlive()) aliveCount++;

        return aliveCount;
    }

    /**
     * List of possible loots
     */
    private final int[] loots = new int[]{5070, 5071, 5072, 5073, 5074, 5075, 5312, 5313, 5314, 5315, 5316, 21621,
            21620, 10180, 985, 987};

    /**
     * Give this player something for their effort
     */
    void rewardPlayer(Player player) {
        if (!damageReceived.containsKey(player.getUsername()))
            player.sendMessage("There are no more rewards for you to claim");
        else {
            if (player.getInventory().getFreeSlots() < 4) {
                player.sendMessage("You need at least four free inventory slots to claim your reward.");
                return;
            }
            player.getInventory().addItem(995, (int) (definitions.getCoinsAmount() * getRewardPercentage(player)));
            System.out.println(definitions.getLogs().length);
            Item logsItem = definitions.getLogs()[
                    definitions.getLogs().length == 1 ? 0 : Utils.random(definitions.getLogs().length - 1)];
            player.getInventory().addItem(logsItem.getId(), (int) (logsItem.getAmount() * getRewardPercentage(player)));
            int itemId = loots[Utils.random(loots.length - 1)];
            int amount;
            switch (itemId) {
                case 21620:
                case 21621:
                    amount = Utils.random(10) + 1;
                    break;
                case 10180:
                case 985:
                case 987:
                    amount = 1;
                    break;
                default:
                    amount = 2;
            }
            player.getInventory().addItem(itemId, amount);
            damageReceived.remove(player.getUsername());

        }
    }

    /**
     * Has the tree died yet?
     */
    boolean isDead() {
        return dead;
    }

    /**
     * When did this tree die? (used for removing the stump)
     */
    long getTimeOfDeath() {
        return timeOfDeath;
    }

    /**
     * Kill a specific root (when its health runs out)
     */
    boolean killRoot(EvilRoot evilRoot) {
        if (Utils.random(getAliveRoots()) == 0) evilRoot.die();
        return true;
    }

    /**
     * Are we fully grown?
     */
    boolean isGrown() {
        return grown;
    }

    /**
     * Tell the player how the growing is doing.
     */
    void sendGrowthMessage(Player player) {
        if (grown) player.sendMessage(
                "Tree health: " + getHealthPercentage() * 100 + "%. Your reward: " + getRewardPercentage(player) * 100);
        else player.sendMessage("This tree is " + getHealthPercentage() * 100 + "% grown");
    }

    TreeManager.EvilTreeDefinitions getTreeDefinitions() {
        return definitions;
    }

    /**
     * Get a nearby fire spot
     */
    WorldObject getFire(Player player) {
        WorldObject fire = null;
        int distance, lastDistance = Integer.MAX_VALUE;
        for (WorldObject f : fires) {
            if (f.getLocation().equals(player.getLocation())) return f;
            distance = Utils.getDistance(f.getX(), f.getY(), player.getX(), player.getY());
            if (distance < lastDistance) {
                fire = f;
                lastDistance = distance;
            }
        }
        if (fire == null || World.getRegion(player.getRegionId()).containsObject(fire.getId(), fire)) return null;
        return fire;
    }

    /**
     * Attempt to light this tree to fire
     */
    void setFire(WorldObject fire) {
        World.spawnTemporaryObject(fire, 30 * 1000);
    }
}
