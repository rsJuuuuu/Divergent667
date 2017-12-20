package com.rs.game.world;

import com.rs.Settings;
import com.rs.cache.loaders.AnimationDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Poison;
import com.rs.game.gameUtils.effects.Effect;
import com.rs.game.gameUtils.effects.prayer.LeechedEffect;
import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.player.Prayer;
import com.rs.game.player.actions.combat.Magic;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.rs.utils.Constants.LOW_PRIORITY;
import static com.rs.utils.Constants.TOP_PRIORITY;

public abstract class Entity extends WorldTile {

    private static final long serialVersionUID = -3372926325008880753L;

    private transient int index;
    private transient int lastRegionId;
    private transient int direction;
    private transient int nextWalkDirection;
    private transient int nextRunDirection;

    private transient long freezeDelay;

    private transient boolean teleported;
    private transient boolean finished;

    private transient WorldTile lastWorldTile;
    private transient WorldTile nextWorldTile;
    private transient WorldTile nextFaceWorldTile;
    private transient WorldTile lastLoadedMapRegionTile;

    private transient ConcurrentLinkedQueue<int[]> walkSteps;
    private transient ConcurrentLinkedQueue<Hit> receivedHits;

    private transient CopyOnWriteArrayList<Integer> mapRegionsIds;

    private transient ConcurrentHashMap<Entity, Integer> receivedDamage;

    // entity masks
    private transient int nextFaceEntity;
    private transient int lastFaceEntity;

    private transient long attackedByDelay;
    private transient long lastAnimationEnd;
    private transient long frozenBlocked;
    private transient long findTargetDelay;

    private transient boolean multiArea;
    private transient boolean isAtDynamicRegion;
    private transient boolean forceMultiArea;

    private transient ArrayList<Hit> nextHits;

    private transient Entity attackedBy;

    private transient Animation nextAnimation;

    private transient Graphics nextGraphics1;
    private transient Graphics nextGraphics2;
    private transient Graphics nextGraphics3;
    private transient Graphics nextGraphics4;

    private transient ForceMovement nextForceMovement;

    private transient ForceTalk nextForceTalk;

    private transient LeechedEffect leechedEffect;

    private transient ArrayList<Effect> permanentEffects;

    private transient ConcurrentHashMap<Object, Object> temporaryAttributes;

    private int health;
    private int mapSize;

    private boolean run;

    private Poison poison;

    public Entity(WorldTile tile) {
        super(tile);
        poison = new Poison();
    }

    protected final void initEntity() {
        mapRegionsIds = new CopyOnWriteArrayList<>();
        walkSteps = new ConcurrentLinkedQueue<>();
        receivedHits = new ConcurrentLinkedQueue<>();
        receivedDamage = new ConcurrentHashMap<>();
        temporaryAttributes = new ConcurrentHashMap<>();
        permanentEffects = new ArrayList<>();
        leechedEffect = new LeechedEffect();
        nextHits = new ArrayList<>();
        nextWalkDirection = nextRunDirection - 1;
        lastFaceEntity = -1;
        nextFaceEntity = -2;
        poison.setEntity(this);
    }

    public boolean isFollower() {
        return this instanceof Follower;
    }

    public boolean inArea(int a, int b, int c, int d) {
        return getX() >= a && getY() >= b && getX() <= c && getY() <= d;
    }

    public int getClientIndex() {
        return index + (this instanceof Player ? 32768 : 0);
    }

    public void applyHit(Hit hit) {
        if (isDead()) return;
        receivedHits.add(hit);
        for (int priority = TOP_PRIORITY; priority < LOW_PRIORITY; priority++) {
            applyIncomingHitEffects(hit, priority);
        }
        handleIngoingHit(hit);
        if (hit.getSource() != null) hit.getSource().applyDealtHitEffects(hit, this);
    }

    private void applyDealtHitEffects(Hit hit, Entity target) {
        for (Effect effect : getActiveEffects())
            effect.processDealtHit(hit, target);
    }

    private void applyIncomingHitEffects(Hit hit, int priority) {
        for (Effect effect : getActiveEffects())
            if (effect.getPriority() == priority) effect.processIncoming(hit, this);
    }

    protected void applyDeathEffects(Entity source) {
        for (Effect effect : getActiveEffects())
            effect.processDeath(this, source);
    }

    public ArrayList<Effect> getActiveEffects() {
        ArrayList<Effect> effects = new ArrayList<>();
        effects.add(leechedEffect);
        effects.addAll(permanentEffects);
        if (this instanceof Player) effects.addAll(((Player) this).getPrayer().getPrayerEffects());
        return effects;
    }

    public LeechedEffect getLeechedEffect() {
        return leechedEffect;
    }

    protected void addEffect(Effect effect) {
        permanentEffects.add(effect);
    }

    public void clearEffects() {
        permanentEffects.clear();
    }

    public abstract void handleIngoingHit(Hit hit);

    public void reset() {
        setHealth(getMaxHitPoints());
        receivedHits.clear();
        resetCombat();
        walkSteps.clear();
        poison.reset();
        resetReceivedDamage();
        temporaryAttributes.clear();
    }

    public void resetCombat() {
        attackedBy = null;
        attackedByDelay = 0;
        freezeDelay = 0;
    }

    public void processReceivedHits() {
        if (this instanceof Player) {
            if (((Player) this).getEmotesManager().getNextEmoteEnd() >= TimeUtils.getTime()) return;
        }
        Hit hit;
        int count = 0;
        while ((hit = receivedHits.poll()) != null && count++ < 10) processHit(hit);
    }

    private void processHit(Hit hit) {
        if (isDead()) return;
        removeHealth(hit);
        nextHits.add(hit);
    }

    public void removeHealth(Hit hit) {
        if (isDead() || hit.getLook() == HitLook.ABSORB_DAMAGE) return;
        if (hit.getLook() == HitLook.HEALED_DAMAGE) {
            heal(hit.getDamage());
            return;
        }
        if (hit.getDamage() > health) hit.setDamage(health);
        addReceivedDamage(hit.getSource(), hit.getDamage());
        health -= hit.getDamage();
        if (health <= 0) sendDeath(hit.getSource());
        else if (this instanceof Player) {
            Player player = (Player) this;
            if (player.getEquipment().getRingId() == 2550) {
                if (hit.getSource() != null && hit.getSource() != player)
                    hit.getSource().applyHit(new Hit(player, (int) (hit.getDamage() * 0.1), HitLook.REFLECTED_DAMAGE));
            }
            if (player.getEquipment().getRingId() == 11090 && player.getHealth() <= player.getMaxHitPoints() * 0.1) {
                Magic.castTeleportSpell(player, null, Magic.Spell.MODERN_HOME);
                player.getEquipment().deleteItem(11090, 1);
                player.getPackets().sendGameMessage(
                        "Your ring of life saves you, but is destroyed in the " + "process" + ".");
            } else if (player.getEquipment().getAmuletId() == 11090
                       && player.getHealth() <= player.getMaxHitPoints() * 0.2) {
                player.heal((int) (player.getMaxHitPoints() * 0.3));
                player.getEquipment().deleteItem(11090, 1);
                player.getPackets().sendGameMessage(
                        "Your phoenix necklace heals you, but is destroyed in the " + "process" + ".");
            }
        }
    }

    public void resetReceivedDamage() {
        receivedDamage.clear();
    }

    public void removeDamage(Entity entity) {
        receivedDamage.remove(entity);
    }

    public Player getMostDamageReceivedSourcePlayer() {
        Player player = null;
        Npc npc = null;
        Follower follower = null;
        int damage = 0;
        int add;
        for (Entity source : receivedDamage.keySet()) {
            if (source instanceof Npc) {
                npc = (Npc) source;
                if (npc.isFollower()) follower = (Follower) npc;
            }
            if (follower == null && npc != null) continue;

            Integer d = receivedDamage.get(source);
            if (d == null) {
                receivedDamage.remove(source);
                continue;
            }
            if (follower != null) {
                add = receivedDamage.get(follower.getOwner()) != null ? receivedDamage.get(follower.getOwner()) : 0;
                if (add != 0) receivedDamage.remove(follower.getOwner());
                d += add;
            }
            if (d > damage) {
                damage = d;
                if (follower != null) {
                    player = follower.getOwner();
                } else {
                    player = (Player) source;
                }
            }

        }
        return player;
    }

    private void addReceivedDamage(Entity source, int amount) {
        if (source == null) return;
        Integer damage = receivedDamage.get(source);
        damage = (damage == null ? amount : (damage + amount));
        receivedDamage.put(source, damage);
    }

    public void heal(int amount) {
        heal(amount, 0);
    }

    public void heal(int amount, int extra) {
        health = health + amount >= getMaxHitPoints() + extra ? getMaxHitPoints() + extra : health + amount;
    }

    public boolean hasWalkSteps() {
        return !walkSteps.isEmpty();
    }

    public abstract void sendDeath(Entity source);

    private void processMovement() {
        lastWorldTile = new WorldTile(this);
        if (lastFaceEntity >= 0) {
            Entity target = lastFaceEntity >= 32768 ? World.getPlayers().get(
                    lastFaceEntity - 32768) : World.getNPCs().get(lastFaceEntity);
            if (target != null) direction = Utils.getFaceDirection(
                    target.getCoordFaceX(target.getSize()) - getX(), target.getCoordFaceY(target.getSize()) - getY());
        }
        nextWalkDirection = nextRunDirection = -1;
        if (nextWorldTile != null) {
            int lastPlane = getPlane();
            setLocation(nextWorldTile);
            nextWorldTile = null;
            teleported = true;
            if (this instanceof Player) ((Player) this).setTemporaryMoveType(Player.TELE_MOVE_TYPE);
            World.updateEntityRegion(this);
            if (needMapUpdate()) loadMapRegions();
            else if (this instanceof Player && lastPlane != getPlane()) ((Player) this).resetClientLoadedMapRegion();
            resetWalkSteps();
            return;
        }
        teleported = false;
        if (walkSteps.isEmpty()) return;

        if (this instanceof Player) {
            if (((Player) this).getEmotesManager().getNextEmoteEnd() >= TimeUtils.getTime()) return;
        }
        nextWalkDirection = getNextWalkStep();
        if (nextWalkDirection != -1) {
            if (this instanceof Player) {
                if (!((Player) this).getControllerManager().canMove(nextWalkDirection)) {
                    nextWalkDirection = -1;
                    resetWalkSteps();
                    return;
                }
            }
            moveLocation(Utils.DIRECTION_DELTA_X[nextWalkDirection], Utils.DIRECTION_DELTA_Y[nextWalkDirection], 0);
            if (run) {
                if (this instanceof Player && ((Player) this).getRunEnergy() <= 0) setRun(false);
                else {
                    nextRunDirection = getNextWalkStep();
                    if (nextRunDirection != -1) {
                        if (this instanceof Player) {
                            Player player = (Player) this;
                            if (!player.getControllerManager().canMove(nextRunDirection)) {
                                nextRunDirection = -1;
                                resetWalkSteps();
                                return;
                            }
                            player.drainRunEnergy();
                        }
                        moveLocation(Utils.DIRECTION_DELTA_X[nextRunDirection], Utils
                                .DIRECTION_DELTA_Y[nextRunDirection], 0);
                    } else if (this instanceof Player) ((Player) this).setTemporaryMoveType(Player.WALK_MOVE_TYPE);
                }
            }
        }
        World.updateEntityRegion(this);
        if (needMapUpdate()) loadMapRegions();
    }

    @Override
    public void moveLocation(int xOffset, int yOffset, int planeOffset) {
        super.moveLocation(xOffset, yOffset, planeOffset);
        direction = Utils.getFaceDirection(xOffset, yOffset);
    }

    private boolean needMapUpdate() {
        int lastMapRegionX = lastLoadedMapRegionTile.getChunkX();
        int lastMapRegionY = lastLoadedMapRegionTile.getChunkY();
        int regionX = getChunkX();
        int regionY = getChunkY();
        int size = ((Settings.MAP_SIZES[mapSize] >> 3) / 2) - 1;
        return Math.abs(lastMapRegionX - regionX) >= size || Math.abs(lastMapRegionY - regionY) >= size;
    }

    public boolean addWalkSteps(int destX, int destY) {
        return addWalkSteps(destX, destY, -1);
    }

    public boolean clippedProjectile(WorldTile tile, boolean checkClose) {
        return clippedProjectile(tile, checkClose, 1);
    }

    public boolean clippedProjectile(WorldTile tile, boolean checkClose, int size) {
        int myX = getX();
        int myY = getY();
        int destinationX = tile.getX();
        int destinationY = tile.getY();
        int lastTileX = myX;
        int lastTileY = myY;
        while (true) {
            if (myX < destinationX) myX++;
            else if (myX > destinationX) myX--;
            if (myY < destinationY) myY++;
            else if (myY > destinationY) myY--;
            int dir = Utils.getMoveDirection(myX - lastTileX, myY - lastTileY);
            if (dir == -1) return false;
            if (checkClose) {
                if (!World.checkWalkStep(getPlane(), lastTileX, lastTileY, dir, size)) return false;
            } else if (!World.checkProjectileStep(getPlane(), lastTileX, lastTileY, dir, size)) return false;
            lastTileX = myX;
            lastTileY = myY;
            if (lastTileX == destinationX && lastTileY == destinationY) return true;
        }
    }

    public boolean addWalkStepsInteract(int destX, int destY, int maxStepsCount, int size, boolean calculate) {
        return addWalkStepsInteract(destX, destY, maxStepsCount, size, size, calculate);
    }

    /*
     * return added all steps
     */
    private boolean addWalkStepsInteract(final int destX, final int destY, int maxStepsCount, int sizeX, int sizeY,
                                         boolean calculate) {
        int[] lastTile = getLastWalkTile();
        int myX = lastTile[0];
        int myY = lastTile[1];
        int stepCount = 0;
        while (true) {
            stepCount++;
            int myRealX = myX;
            int myRealY = myY;

            if (myX < destX) myX++;
            else if (myX > destX) myX--;
            if (myY < destY) myY++;
            else if (myY > destY) myY--;
            if (!addWalkStep(myX, myY, lastTile[0], lastTile[1], true)) {
                if (!calculate) return false;
                int[] myT = calculatedStep(myRealX, myRealY, destX, destY, lastTile[0], lastTile[1], sizeX, sizeY);
                if (myT == null) return false;
                myX = myT[0];
                myY = myT[1];
            }
            int distanceX = myX - destX;
            int distanceY = myY - destY;
            if (!(distanceX > sizeX || distanceX < -1 || distanceY > sizeY || distanceY < -1)) return true;
            if (stepCount == maxStepsCount) return true;
            lastTile[0] = myX;
            lastTile[1] = myY;
            if (lastTile[0] == destX && lastTile[1] == destY) return true;
        }
    }

    private int[] calculatedStep(int myX, int myY, int destX, int destY, int lastX, int lastY, int sizeX, int sizeY) {
        if (myX < destX) {
            myX++;
            if (!addWalkStep(myX, myY, lastX, lastY, true)) myX--;
            else if (!(myX - destX > sizeX || myX - destX < -1 || myY - destY > sizeY || myY - destY < -1)) {
                if (myX == lastX || myY == lastY) return null;
                return new int[]{myX, myY};
            }
        } else if (myX > destX) {
            myX--;
            if (!addWalkStep(myX, myY, lastX, lastY, true)) myX++;
            else if (!(myX - destX > sizeX || myX - destX < -1 || myY - destY > sizeY || myY - destY < -1)) {
                if (myX == lastX || myY == lastY) return null;
                return new int[]{myX, myY};
            }
        }
        if (myY < destY) {
            myY++;
            if (!addWalkStep(myX, myY, lastX, lastY, true)) myY--;
            else if (!(myX - destX > sizeX || myX - destX < -1 || myY - destY > sizeY || myY - destY < -1)) {
                if (myX == lastX || myY == lastY) return null;
                return new int[]{myX, myY};
            }
        } else if (myY > destY) {
            myY--;
            if (!addWalkStep(myX, myY, lastX, lastY, true)) {
                myY++;
            } else if (!(myX - destX > sizeX || myX - destX < -1 || myY - destY > sizeY || myY - destY < -1)) {
                if (myX == lastX || myY == lastY) return null;
                return new int[]{myX, myY};
            }
        }
        if (myX == lastX || myY == lastY) return null;
        return new int[]{myX, myY};
    }

    /*
     * return added all steps
     */
    public boolean addWalkSteps(final int destX, final int destY, int maxStepsCount) {
        return addWalkSteps(destX, destY, -1, true);
    }

    /*
     * return added all steps
     */
    public boolean addWalkSteps(final int destX, final int destY, int maxStepsCount, boolean check) {
        int[] lastTile = getLastWalkTile();
        int myX = lastTile[0];
        int myY = lastTile[1];
        int stepCount = 0;
        while (true) {
            stepCount++;
            if (myX < destX) myX++;
            else if (myX > destX) myX--;
            if (myY < destY) myY++;
            else if (myY > destY) myY--;
            if (!addWalkStep(myX, myY, lastTile[0], lastTile[1], check)) return false;
            if (stepCount == maxStepsCount) return true;
            lastTile[0] = myX;
            lastTile[1] = myY;
            if (lastTile[0] == destX && lastTile[1] == destY) return true;
        }
    }

    private int[] getLastWalkTile() {
        Object[] objects = walkSteps.toArray();
        if (objects.length == 0) return new int[]{getX(), getY()};
        int step[] = (int[]) objects[objects.length - 1];
        return new int[]{step[1], step[2]};
    }

    // return clipped step
    public boolean addWalkStep(int nextX, int nextY, int lastX, int lastY, boolean check) {
        int dir = Utils.getMoveDirection(nextX - lastX, nextY - lastY);
        if (dir == -1) return false;

        if (check) {
            if (!World.checkWalkStep(getPlane(), lastX, lastY, dir, getSize())) return false;
            if (this instanceof Player) {
                if (!((Player) this).getControllerManager().checkWalkStep(lastX, lastY, nextX, nextY)) return false;
            }
        }
        walkSteps.add(new int[]{dir, nextX, nextY});
        return true;
    }

    public void resetWalkSteps() {
        walkSteps.clear();
    }

    private int getNextWalkStep() {
        int step[] = walkSteps.poll();
        if (step == null) return -1;
        return step[0];

    }

    public boolean restoreHitPoints() {
        int maxHp = getMaxHitPoints();
        if (health > maxHp) {
            if (this instanceof Player) {
                Player player = (Player) this;
                if (player.getPrayer().usingPrayer(Prayer.PrayerSpell.BERSERKER) && Utils.getRandom(100) <= 15)
                    return false;
            }
            health -= 1;
            return true;
        } else if (health < maxHp) {
            health += 1;
            if (this instanceof Player) {
                Player player = (Player) this;
                if (player.getPrayer().usingPrayer(Prayer.PrayerSpell.RAPID_HEAL) && health < maxHp) health += 1;
                else if (player.getPrayer().usingPrayer(Prayer.PrayerSpell.RAPID_RENEWAL) && health < maxHp)
                    health += health + 4 > maxHp ? maxHp - health : 4;

            }
            return true;
        }
        return false;
    }

    public boolean needMasksUpdate() {
        return nextFaceEntity != -2 || nextAnimation != null || nextGraphics1 != null || nextGraphics2 != null
               || nextGraphics3 != null || nextGraphics4 != null || (nextWalkDirection == -1
                                                                     && nextFaceWorldTile != null)
               || !nextHits.isEmpty() || nextForceMovement != null || nextForceTalk != null;
    }

    public boolean isDead() {
        return health == 0;
    }

    public void resetMasks() {
        nextAnimation = null;
        nextGraphics1 = null;
        nextGraphics2 = null;
        nextGraphics3 = null;
        nextGraphics4 = null;
        if (nextWalkDirection == -1) nextFaceWorldTile = null;
        nextForceMovement = null;
        nextForceTalk = null;
        nextFaceEntity = -2;
        nextHits.clear();
    }

    public abstract void finish();

    public abstract int getMaxHitPoints();

    public void processEntity() {
        poison.processPoison();
        processMovement();
        processReceivedHits();
    }

    public void loadMapRegions() {
        mapRegionsIds.clear();
        isAtDynamicRegion = false;
        int regionX = getChunkX();
        int regionY = getChunkY();
        int mapHash = Settings.MAP_SIZES[mapSize] >> 4;
        for (int xCalc = (regionX - mapHash) / 8; xCalc <= ((regionX + mapHash) / 8); xCalc++)
            for (int yCalc = (regionY - mapHash) / 8; yCalc <= ((regionY + mapHash) / 8); yCalc++) {
                int regionId = yCalc + (xCalc << 8);
                if (World.getRegion(regionId, this instanceof Player) instanceof DynamicRegion)
                    isAtDynamicRegion = true;
                mapRegionsIds.add(yCalc + (xCalc << 8));
            }
        lastLoadedMapRegionTile = new WorldTile(this);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    public void setLastRegionId(int lastRegionId) {
        this.lastRegionId = lastRegionId;
    }

    public int getLastRegionId() {
        return lastRegionId;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int size) {
        this.mapSize = size;
    }

    public CopyOnWriteArrayList<Integer> getMapRegionsIds() {
        return mapRegionsIds;
    }

    public void setNextAnimation(Animation nextAnimation) {
        if (nextAnimation != null && nextAnimation.getIds()[0] >= 0) lastAnimationEnd = TimeUtils.getTime()
                                                                                        + AnimationDefinitions
                                                                                                .getAnimationDefinitions(nextAnimation.getIds()[0]).getEmoteTime();
        this.nextAnimation = nextAnimation;
    }

    public void setNextAnimationNoPriority(Animation nextAnimation) {
        if (lastAnimationEnd > TimeUtils.getTime()) return;
        setNextAnimation(nextAnimation);
    }

    public Animation getNextAnimation() {
        return nextAnimation;
    }

    public void setNextGraphics(Graphics nextGraphics) {
        if (nextGraphics == null) {
            if (nextGraphics4 != null) nextGraphics4 = null;
            else if (nextGraphics3 != null) nextGraphics3 = null;
            else if (nextGraphics2 != null) nextGraphics2 = null;
            else nextGraphics1 = null;
        } else {
            if (nextGraphics.equals(nextGraphics1) || nextGraphics.equals(nextGraphics2)
                || nextGraphics.equals(nextGraphics3) || nextGraphics.equals(nextGraphics4)) return;
            if (nextGraphics1 == null) nextGraphics1 = nextGraphics;
            else if (nextGraphics2 == null) nextGraphics2 = nextGraphics;
            else if (nextGraphics3 == null) nextGraphics3 = nextGraphics;
            else nextGraphics4 = nextGraphics;
        }
    }

    public Graphics getNextGraphics1() {
        return nextGraphics1;
    }

    public Graphics getNextGraphics2() {
        return nextGraphics2;
    }

    public Graphics getNextGraphics3() {
        return nextGraphics3;
    }

    public Graphics getNextGraphics4() {
        return nextGraphics4;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean hasFinished() {
        return finished;
    }

    public void setNextWorldTile(WorldTile nextWorldTile) {
        this.nextWorldTile = nextWorldTile;
    }

    public WorldTile getNextWorldTile() {
        return nextWorldTile;
    }

    public boolean hasTeleported() {
        return teleported;
    }

    public WorldTile getLastLoadedMapRegionTile() {
        return lastLoadedMapRegionTile;
    }

    public int getNextWalkDirection() {
        return nextWalkDirection;
    }

    public int getNextRunDirection() {
        return nextRunDirection;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean getRun() {
        return run;
    }

    public WorldTile getNextFaceWorldTile() {
        return nextFaceWorldTile;
    }

    public void setNextFaceWorldTile(WorldTile nextFaceWorldTile) {
        if (nextFaceWorldTile.getX() == getX() && nextFaceWorldTile.getY() == getY()) return;
        this.nextFaceWorldTile = nextFaceWorldTile;
        if (nextWorldTile != null) direction = Utils.getFaceDirection(
                nextFaceWorldTile.getX() - nextWorldTile.getX(), nextFaceWorldTile.getY() - nextWorldTile.getY());
        else direction = Utils.getFaceDirection(nextFaceWorldTile.getX() - getX(), nextFaceWorldTile.getY() - getY());
    }

    public abstract int getSize();

    public void cancelFaceEntityNoCheck() {
        nextFaceEntity = -2;
        lastFaceEntity = -1;
    }

    public void setNextFaceEntity(Entity entity) {
        if (entity == null) {
            nextFaceEntity = -1;
            lastFaceEntity = -1;
        } else {
            nextFaceEntity = entity.getClientIndex();
            lastFaceEntity = nextFaceEntity;
        }
    }

    public int getNextFaceEntity() {
        return nextFaceEntity;
    }

    public long getFreezeDelay() {
        return freezeDelay; // 2500 delay
    }

    public int getLastFaceEntity() {
        return lastFaceEntity;
    }

    public long getFrozenBlockedDelay() {
        return frozenBlocked;
    }

    public void setFrozeBlocked(int time) {
        this.frozenBlocked = time;
    }

    public void setFreezeDelay(int time) {
        this.freezeDelay = time;
    }

    public void addFrozenBlockedDelay(int time) {
        frozenBlocked = time + TimeUtils.getTime();
    }

    public void addFreezeDelay(long time) {
        addFreezeDelay(time, false);
    }

    public void addFreezeDelay(long time, boolean entangleMessage) {
        long currentTime = TimeUtils.getTime();
        if (currentTime > freezeDelay) {
            resetWalkSteps();
            freezeDelay = time + currentTime;
            if (this instanceof Player) {
                Player p = (Player) this;
                if (!entangleMessage) p.getPackets().sendGameMessage("You have been frozen.");
            }
        }
    }

    public abstract double getMagePrayerMultiplier();

    public abstract double getRangePrayerMultiplier();

    public abstract double getMeleePrayerMultiplier();

    public Entity getAttackedBy() {
        return attackedBy;
    }

    public void setAttackedBy(Entity attackedBy) {
        this.attackedBy = attackedBy;
    }

    public long getAttackedByDelay() {
        return attackedByDelay;
    }

    public void setAttackedByDelay(long attackedByDelay) {
        this.attackedByDelay = attackedByDelay;
    }

    public void checkMultiArea() {
        multiArea = forceMultiArea || World.isMultiArea(this);
    }

    public boolean isAtMultiArea() {
        return multiArea;
    }

    public void setAtMultiArea(boolean multiArea) {
        this.multiArea = multiArea;
    }

    public boolean isAtDynamicRegion() {
        return isAtDynamicRegion;
    }

    public ForceMovement getNextForceMovement() {
        return nextForceMovement;
    }

    public void setNextForceMovement(ForceMovement nextForceMovement) {
        this.nextForceMovement = nextForceMovement;
    }

    public Poison getPoison() {
        return poison;
    }

    public ForceTalk getNextForceTalk() {
        return nextForceTalk;
    }

    public void setNextForceTalk(ForceTalk nextForceTalk) {
        this.nextForceTalk = nextForceTalk;
    }

    public void faceEntity(Entity target) {
        setNextFaceWorldTile(new WorldTile(target.getCoordFaceX(target.getSize()), target.getCoordFaceY(target
                .getSize()), target.getPlane()));
    }

    public void faceObject(WorldObject object) {
        ObjectDefinitions objectDef = object.getDefinitions();
        setNextFaceWorldTile(new WorldTile(object.getCoordFaceX(objectDef.getSizeX(), objectDef.getSizeY(), object
                .getRotation()), object.getCoordFaceY(objectDef.getSizeX(), objectDef.getSizeY(), object.getRotation
                ()), object.getPlane()));
    }

    public long getLastAnimationEnd() {
        return lastAnimationEnd;
    }

    public ConcurrentHashMap<Object, Object> getTemporaryAttributes() {
        return temporaryAttributes;
    }

    public boolean isForceMultiArea() {
        return forceMultiArea;
    }

    public void setForceMultiArea(boolean forceMultiArea) {
        this.forceMultiArea = forceMultiArea;
        checkMultiArea();
    }

    public WorldTile getLastWorldTile() {
        return lastWorldTile;
    }

    public ArrayList<Hit> getNextHits() {
        return nextHits;
    }

    public void playSound(int soundId, int type) {
        for (int regionId : getMapRegionsIds()) {
            List<Integer> playerIndexes = World.getRegion(regionId).getPlayerIndexes();
            if (playerIndexes != null) {
                for (int playerIndex : playerIndexes) {
                    Player player = World.getPlayers().get(playerIndex);
                    if (player == null || !player.isRunning() || player.hasFinished() || !withinDistance(player))
                        continue;
                    player.getPackets().sendSound(soundId, 0, type);
                }
            }
        }
    }

    public long getFindTargetDelay() {
        return findTargetDelay;
    }

    public void setFindTargetDelay(long findTargetDelay) {
        this.findTargetDelay = findTargetDelay;
    }
}
