package com.rs.game.npc;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cores.CoresManager;
import com.rs.game.Hit;
import com.rs.game.item.Item;
import com.rs.game.npc.combat.NPCCombat;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.npc.data.NpcDataLoader;
import com.rs.game.npc.drops.NpcDrops;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.content.skills.combat.BossKillCounter;
import com.rs.game.player.controllers.impl.Wilderness;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.Animation;
import com.rs.game.world.Entity;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.MapAreas;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Npc extends Entity implements Serializable {

    private static final long serialVersionUID = -4794678936277614443L;

    private int id;
    private int mapAreaNameHash;
    private int capDamage;
    private int lureDelay;
    private int forceTargetDistance;
    private int combatLevel;

    private long lastAttackedByTarget;

    private boolean canBeAttackFromOutOfArea;
    private boolean cantInteract;
    private boolean randomWalk;
    private boolean spawned;
    private boolean cantFollowUnderCombat;
    private boolean forceAggressive;
    private boolean forceFollowClose;
    private boolean forceMultiAttacked;

    private String name;

    private int[] bonuses;

    private WorldTile spawnTile;
    private WorldTile forceWalk;

    private transient NPCCombat combat;
    private transient Transformation nextTransformation;
    private transient boolean changedName;
    private transient boolean changedCombatLevel;

    public Npc(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea) {
        this(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, false);
    }

    /**
     * Create and spawn an npc
     */
    public Npc(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
        super(tile);
        this.id = id;
        this.spawnTile = new WorldTile(tile);
        this.mapAreaNameHash = mapAreaNameHash;
        this.canBeAttackFromOutOfArea = canBeAttackFromOutOfArea;
        this.spawned = spawned;
        combatLevel = -1;
        setHealth(getMaxHitPoints());
        setDirection(getSpawnDirection());
        setRandomWalk((getDefinitions().walkMask & 0x2) != 0);
        bonuses = NpcDataLoader.getBonuses(id);
        combat = new NPCCombat(this);
        capDamage = -1;
        lureDelay = 12000;
        initEntity();
        World.addNPC(this);
        World.updateEntityRegion(this);
        loadMapRegions();
        checkMultiArea();
    }

    public boolean isFollower() {
        return this instanceof Follower;
    }

    @Override
    public boolean needMasksUpdate() {
        return super.needMasksUpdate() || nextTransformation != null || changedCombatLevel || changedName;
    }

    @Override
    public void resetMasks() {
        super.resetMasks();
        nextTransformation = null;
        changedCombatLevel = false;
        changedName = false;
    }

    @Override
    public int getMaxHitPoints() {
        return getCombatDefinitions().getHealth();
    }

    public void transformIntoNPC(int id) {
        setNpcId(id);
        nextTransformation = new Transformation(id);
    }

    protected void setNpcId(int id) {
        this.id = id;
        bonuses = NpcDataLoader.getBonuses(id);
    }

    public int getMapAreaNameHash() {
        return mapAreaNameHash;
    }

    public boolean canBeAttackFromOutOfArea() {
        return canBeAttackFromOutOfArea;
    }

    public NPCDefinitions getDefinitions() {
        return NPCDefinitions.getNPCDefinitions(id);
    }

    public NpcCombatDefinitions getCombatDefinitions() {
        return NpcDataLoader.getNPCCombatDefinitions(id);
    }

    public int getId() {
        return id;
    }

    public void processNPC() {
        if (isDead()) return;
        if (!combat.process()) {
            if (!isForceWalking()) {
                if (!cantInteract) {
                    if (!checkAggressiveness()) {
                        if (getFreezeDelay() < TimeUtils.getTime()) {
                            if (((hasRandomWalk()) && World.getRotation(getPlane(), getX(), getY()) == 0)
                                && Math.random() * 1000.0 < 100.0) {
                                int moveX = (int) Math.round(Math.random() * 10.0 - 5.0);
                                int moveY = (int) Math.round(Math.random() * 10.0 - 5.0);
                                resetWalkSteps();
                                if (getMapAreaNameHash() != -1) {
                                    if (!MapAreas.isAtArea(getMapAreaNameHash(), this)) {
                                        forceWalkRespawnTile();
                                        return;
                                    }
                                    addWalkSteps(getX() + moveX, getY() + moveY, 5);
                                } else addWalkSteps(spawnTile.getX() + moveX, spawnTile.getY() + moveY, 5);
                            }
                        }
                    }
                }
            }
        }
        setName(name);
        if (isForceWalking()) {
            if (getX() != forceWalk.getX() || getY() != forceWalk.getY()) {
                if (!hasWalkSteps()) {
                    int steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, getX(), getY(), getPlane(),
                            getSize(), new FixedTileStrategy(forceWalk.getX(), forceWalk.getY()), true);
                    int[] bufferX = RouteFinder.getLastPathBufferX();
                    int[] bufferY = RouteFinder.getLastPathBufferY();
                    for (int i = steps - 1; i >= 0; i--) {
                        if (!addWalkSteps(bufferX[i], bufferY[i], 25, true)) break;
                    }
                }
                if (!hasWalkSteps()) {
                    setNextWorldTile(new WorldTile(forceWalk));
                    forceWalk = null;
                }
            } else forceWalk = null;
        }
    }

    private int getSpawnDirection() {
        NPCDefinitions definitions = getDefinitions();
        if (definitions.anInt853 << 32 != 0 && definitions.respawnDirection > 0 && definitions.respawnDirection <= 8)
            return (4 + definitions.respawnDirection) << 11;
        return 0;
    }

    public void setSpawnTask() {
        if (!hasFinished()) {
            reset();
            setLocation(spawnTile);
            finish();
        }
        CoresManager.slowExecutor.schedule(() -> {
            try {
                spawn();
            } catch (Exception | Error e) {
                e.printStackTrace();
            }
        }, getCombatDefinitions().getSpawnDelay() * 600, TimeUnit.MILLISECONDS);
    }

    protected void deserialize() {
        if (combat == null) combat = new NPCCombat(this);
        spawn();
    }

    public void spawn() {
        setFinished(false);
        World.addNPC(this);
        setLastRegionId(0);
        World.updateEntityRegion(this);
        loadMapRegions();
        checkMultiArea();
    }

    public NPCCombat getCombat() {
        return combat;
    }

    private void drop(Player killer) {
        try {
            ArrayList<Drop> drops = NpcDrops.getDrops(id);
            if (drops == null) return;
            int[] charms = {12159, 12160, 12158, 12163};
            int li = Utils.random(3);
            Drop dr = new Drop(charms[li], 85, 1, 7);
            sendDrop(killer, dr);
            Drop[] possibleDrops = new Drop[drops.size()];
            int possibleDropsCount = 0;
            for (Drop drop : drops) {
                if (drop.getRate() == 100) sendDrop(killer, drop);
                else {
                    if ((Utils.getRandomDouble(99) + 1) <= drop.getRate() * 1.5)
                        possibleDrops[possibleDropsCount++] = drop;
                }
            }
            if (possibleDropsCount > 0) sendDrop(killer, possibleDrops[Utils.getRandom(possibleDropsCount - 1)]);
        } catch (Exception | Error e) {
            e.printStackTrace();
        }
    }

    /**
     * Perform actions triggered by npc death
     */
    protected void handleDeath() {
        Player killer = getMostDamageReceivedSourcePlayer();
        if (killer == null) return;
        //Send the drop
        drop(killer);
        //Check controller kills gwd etc
        killer.getControllerManager().processNpcDeath(this);
        //Divergent points
        if (getCombatLevel() > 100) killer.addServerPoints(Settings.COMBAT_SERVER_POINTS);
        //Kills tracker
        if (BossKillCounter.isLogNpc(getId())) killer.getBossCounter().addKills(getId());
        //Slayer task
        if (killer.getTask() != null) {
            if (getDefinitions().name.toLowerCase().contains(killer.getTask().getName().toLowerCase())) {
                killer.getSkills().addXp(Skills.SLAYER, killer.getTask().getXPAmount());
                killer.getTask().decreaseAmount();
                killer.getCoopSlayer().checkKill(getId());
                if (killer.getTask().getTaskAmount() < 1) {
                    killer.addSlayerPoints(20);
                    killer.getPackets().sendGameMessage(
                            "You have finished your slayer task, talk to Kuradal for a " + "new task.");
                    killer.getPackets().sendGameMessage(
                            "Kuradal rewarded you " + "20" + " Slayer points! You now " + "have "
                            + killer.getSlayerPoints() + " Slayer points.");
                    killer.addServerPoints((int) (killer.getTask().getDifficulty(killer) * 0.5
                                                  * Settings.SLAYER_SERVER_POINTS));
                    killer.setTask(null);
                    return;
                }
                killer.getTask().setAmountKilled(killer.getTask().getAmountKilled() + 1);

                killer.getPackets().sendGameMessage("You need to defeat " + killer.getTask().getTaskAmount() + " "
                                                    + killer.getTask().getName().toLowerCase()
                                                    + " to complete your task.");
            }
        }
    }

    private void sendDrop(Player player, Drop drop) {
        int size = getSize();
        String dropName = ItemDefinitions.getItemDefinitions(drop.getItemId()).getName().toLowerCase();
        Item item = ItemDefinitions.getItemDefinitions(drop.getItemId()).isStackable() ? new Item(drop.getItemId(),
                drop.getMinAmount() + Utils.getRandom(drop.getExtraAmount())) : new Item(drop.getItemId(),
                drop.getMinAmount() + Utils.getRandom(drop.getExtraAmount()));
        World.addGroundItem(item, new WorldTile(getCoordFaceX(size), getCoordFaceY(size), getPlane()), player, false,
                180, true);
        NpcDrops.checkRareDrop(player, item);
    }

    @Override
    public void processEntity() {
        super.processEntity();
        processNPC();
    }

    @Override
    public void handleIngoingHit(final Hit hit) {
        if (capDamage != -1 && hit.getDamage() > capDamage) hit.setDamage(capDamage);
    }

    @Override
    public void reset() {
        super.reset();
        setDirection(getSpawnDirection());
        combat.reset();
        bonuses = NpcDataLoader.getBonuses(id); // back to real bonuses
        forceWalk = null;
    }

    @Override
    public void finish() {
        if (hasFinished()) return;
        setFinished(true);
        World.updateEntityRegion(this);
        World.removeNPC(this);
    }

    @Override
    public void sendDeath(Entity source) {
        final NpcCombatDefinitions definitions = getCombatDefinitions();
        resetWalkSteps();
        combat.removeTarget();
        setNextAnimation(null);
        applyDeathEffects(source);
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    handleDeath();
                    setNextAnimation(new Animation(definitions.getDeathEmote()));
                } else if (loop >= definitions.getDeathDelay()) {
                    reset();
                    setLocation(spawnTile);
                    finish();
                    if (!spawned) setSpawnTask();
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }

    @Override
    public int getSize() {
        return getDefinitions().size;
    }

    public int getMaxHit() {
        return getCombatDefinitions().getMaxHit();
    }

    public int[] getBonuses() {
        return bonuses;
    }

    @Override
    public double getMagePrayerMultiplier() {
        return 0;
    }

    @Override
    public double getRangePrayerMultiplier() {
        return 0;
    }

    @Override
    public double getMeleePrayerMultiplier() {
        return 0;
    }

    public WorldTile getSpawnTile() {
        return spawnTile;
    }

    public boolean isUnderCombat() {
        return combat.underCombat();
    }

    @Override
    public void setAttackedBy(Entity target) {
        super.setAttackedBy(target);
        if (target == combat.getTarget() && !(combat.getTarget() instanceof Follower))
            lastAttackedByTarget = TimeUtils.getTime();
    }

    public boolean canBeAttackedByAutoRelatie() {
        return TimeUtils.getTime() - lastAttackedByTarget > lureDelay;
    }

    public boolean isForceWalking() {
        return forceWalk != null;
    }

    public void setTarget(Entity entity) {
        if (isForceWalking()) // if force walk not gonna get target
            return;
        combat.setTarget(entity);
        lastAttackedByTarget = TimeUtils.getTime();
    }

    public void removeTarget() {
        if (combat.getTarget() == null) return;
        combat.removeTarget();
    }

    public void forceWalkRespawnTile() {
        setForceWalk(spawnTile);
    }

    public void setForceWalk(WorldTile tile) {
        resetWalkSteps();
        forceWalk = tile;
    }

    public boolean hasForceWalk() {
        return forceWalk != null;
    }

    public ArrayList<Entity> getPossibleTargets() {
        ArrayList<Entity> possibleTarget = new ArrayList<>();
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playerIndexes != null) {
                for (int npcIndex : playerIndexes) {
                    Player player = World.getPlayers().get(npcIndex);
                    if (player == null || player.isDead() || player.hasFinished() || !player.isRunning()
                        || !player.withinDistance(this, forceTargetDistance > 0 ? forceTargetDistance : (
                            getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.MELEE ? 4 :
                                    getCombatDefinitions().getAttackStyle() == NpcCombatDefinitions.SPECIAL ? 64 : 8))
                        || (!forceMultiAttacked && (!isAtMultiArea() || !player.isAtMultiArea())
                            && player.getAttackedBy() != this && (
                                    player.getAttackedByDelay() > System.currentTimeMillis()
                                    || player.getFindTargetDelay() > System.currentTimeMillis()))
                        || !clippedProjectile(player, false) || (!forceAggressive && !Wilderness.isAtWild(this)
                                                                 && player.getSkills().getCombatLevelWithSummoning()
                                                                    >= getDefinitions().combatLevel * 2)) continue;
                    possibleTarget.add(player);
                }
            }
        }
        return possibleTarget;
    }

    protected boolean checkAggressiveness() {
        if (!forceAggressive) {
            NpcCombatDefinitions defs = getCombatDefinitions();
            if (defs.getAgressivenessType() == NpcCombatDefinitions.PASSIVE) return false;
        }
        ArrayList<Entity> possibleTarget = getPossibleTargets();
        if (!possibleTarget.isEmpty()) {
            Entity target = possibleTarget.get(Utils.getRandom(possibleTarget.size() - 1));
            setTarget(target);
            target.setAttackedBy(target);
            target.setFindTargetDelay(TimeUtils.getTime() + 10000);
            return true;
        }
        return false;
    }

    public boolean isCantInteract() {
        return cantInteract;
    }

    public void setCantInteract(boolean cantInteract) {
        this.cantInteract = cantInteract;
        if (cantInteract) combat.reset();
    }

    public int getCapDamage() {
        return capDamage;
    }

    protected void setCapDamage(int capDamage) {
        this.capDamage = capDamage;
    }

    public int getLureDelay() {
        return lureDelay;
    }

    protected void setLureDelay(int lureDelay) {
        this.lureDelay = lureDelay;
    }

    public boolean isCantFollowUnderCombat() {
        return cantFollowUnderCombat;
    }

    public void setCantFollowUnderCombat(boolean canFollowUnderCombat) {
        this.cantFollowUnderCombat = canFollowUnderCombat;
    }

    public Transformation getNextTransformation() {
        return nextTransformation;
    }

    @Override
    public String toString() {
        return getDefinitions().name + " - " + id + " - " + getX() + " " + getY() + " " + getPlane();
    }

    public boolean isForceAggressive() {
        return forceAggressive;
    }

    public void setForceAggressive(boolean forceAggressive) {
        this.forceAggressive = forceAggressive;
    }

    public int getForceTargetDistance() {
        return forceTargetDistance;
    }

    protected void setForceTargetDistance(int forceTargetDistance) {
        this.forceTargetDistance = forceTargetDistance;
    }

    public boolean isForceFollowClose() {
        return forceFollowClose;
    }

    protected void setForceFollowClose(boolean forceFollowClose) {
        this.forceFollowClose = forceFollowClose;
    }

    public boolean isForceMultiAttacked() {
        return forceMultiAttacked;
    }

    protected void setForceMultiAttacked(boolean forceMultiAttacked) {
        this.forceMultiAttacked = forceMultiAttacked;
    }

    private boolean hasRandomWalk() {
        return randomWalk;
    }

    public void setRandomWalk(boolean forceRandomWalk) {
        this.randomWalk = forceRandomWalk;
    }

    public String getCustomName() {
        return name;
    }

    public int getCustomCombatLevel() {
        return combatLevel;
    }

    public int getCombatLevel() {
        return combatLevel >= 0 ? combatLevel : getDefinitions().combatLevel;
    }

    public void setCombatLevel(int level) {
        combatLevel = getDefinitions().combatLevel == level ? -1 : level;
        changedCombatLevel = true;
    }

    public String getName() {

        return name != null ? name : getDefinitions().name;
    }

    public void setName(String string) {
        this.name = getDefinitions().name.equals(string) ? null : string;
        changedName = true;
    }

    public boolean hasChangedName() {
        return changedName;
    }

    public boolean hasChangedCombatLevel() {
        return changedCombatLevel;
    }

    public boolean isSpawned() {
        return spawned;
    }

    public Object[] getKeys() {
        return null;
    }
}
