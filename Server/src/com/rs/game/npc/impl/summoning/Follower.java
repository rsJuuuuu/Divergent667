package com.rs.game.npc.impl.summoning;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.npc.data.NpcCombatDefinitions;
import com.rs.game.player.Player;
import com.rs.game.player.content.skills.summoning.BeastOfBurdenInventory;
import com.rs.game.player.content.skills.summoning.FollowerData;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.game.world.*;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TimeUtils;

/**
 * Created by Peng on 13.2.2017 10:22.
 * <p>
 * Follower class used for all things that follow a player around
 */
public class Follower extends Npc {

    private int ticks;
    private int trackTimer;
    private boolean trackDrain;

    private int specialEnergy = 60;

    private transient Player owner;

    private FollowerData data;

    private BeastOfBurdenInventory bob;

    public Follower(Player owner, FollowerData data, WorldTile tile) {
        super(data.getNpcId(), tile, -1, true, false);
        this.owner = owner;
        this.data = data;
        if (data.getMaxCarriedItems() > 0) {
            bob = new BeastOfBurdenInventory(data.getMaxCarriedItems());
            bob.setEntities(owner, this);
        }
        setRun(true);
    }

    private transient int checkNearDirs[][];
    private transient boolean sentRequestMoveMessage;

    private void spawnPet() {
        World.getNPCs().add(this);
        setNextGraphics(new Graphics(getDefinitions().size <= 1 ? 1314 : 1315));
    }

    public void respawn(Player player) {
        this.owner = player;
        if (bob != null) bob.setEntities(player, this);
        initEntity();
        deserialize();
        call(true);
    }

    private void call(boolean login) {
        int size = getSize();
        if (login) {
            checkNearDirs = Utils.getCoordOffsetsNear(size);
        } else {
            removeTarget();
        }
        if (checkNearDirs == null) checkNearDirs = Utils.getCoordOffsetsNear(size);

        WorldTile teleportTile = null;
        for (int dir = 0; dir < checkNearDirs[0].length; dir++) {
            WorldTile tile = new WorldTile(new WorldTile(
                    owner.getX() + checkNearDirs[0][dir], owner.getY() + checkNearDirs[1][dir], owner.getPlane()));
            if (!World.canMoveNPC(tile.getPlane(), tile.getX(), tile.getY(), size)) continue;
            teleportTile = tile;
            break;
        }

        if (login || teleportTile != null) WorldTasksManager.schedule(new WorldTask() {

            public void run() {
                setNextGraphics(new Graphics(getDefinitions().size <= 1 ? 1314 : 1315));
            }

        });
        if (teleportTile == null) {
            if (!sentRequestMoveMessage) {
                owner.getPackets().sendGameMessage("There's not enough space for your familiar to appear.");
                sentRequestMoveMessage = true;
            }
        } else {
            sentRequestMoveMessage = false;
            setNextWorldTile(teleportTile);
        }
    }

    private void follow() {
        if (getLastFaceEntity() != owner.getClientIndex()) setNextFaceEntity(owner);
        if (getFreezeDelay() >= TimeUtils.getTime()) return; // if freeze cant move ofc
        int size = getSize();

        int distanceX = owner.getX() - getX();
        int distanceY = owner.getY() - getY();
        if (distanceX < size && distanceX > -1 && distanceY < size && distanceY > -1 && !owner.hasWalkSteps()) {
            resetWalkSteps();
            if (!addWalkSteps(owner.getX() + 1, getY())) {
                resetWalkSteps();
                if (!addWalkSteps(owner.getX() - size - 1, getY())) {
                    resetWalkSteps();
                    if (!addWalkSteps(owner.getX(), getY() + 1)) {
                        resetWalkSteps();
                        if (!addWalkSteps(owner.getX(), getY() - size - 1)) {
                            return;
                        }
                    }
                }
            }
            return;
        }
        if ((!clippedProjectile(owner, true)) || distanceX > size || distanceX < -1 || distanceY > size
                || distanceY < -1) {
            resetWalkSteps();
            addWalkStepsInteract(owner.getX(), owner.getY(), 2, size, true);
        } else resetWalkSteps();
    }

    public void dismiss(boolean loggedOut) {
        if (!loggedOut) {
            if (data.isPet()) {
                if (owner.getInventory().getFreeSlots() < 1) {
                    owner.sendMessage("You don't have enough inventory space.");
                    return;
                }
                owner.getInventory().addItem(data.getItemId(), 1);
            }
            owner.getFollowerManager().setFollower(null);
            finish();
        }
        finish();
    }

    /**
     * Send all familiar data when spawned
     */
    public void sendMainConfigs() {
        switchOrb(true);
        owner.getPackets().sendConfig(448, data.getScrollId());
        owner.getPackets().sendConfig(1160, 243269632);
        refreshSpecialEnergy();
        sendTimeRemaining();
        owner.getPackets().sendConfig(1175, data.getSpecialAmount() << 23);// check
        owner.getPackets().sendGlobalString(204, data.getSpecialName());
        owner.getPackets().sendGlobalString(205, data.getSpecialDescription());
        owner.getPackets().sendGlobalConfig(1436, data.getSpecialAttack() == SpecialAttack.CLICK ? 1 : 0);
        unlockOrb();
    }

    /**
     * Set the orb state
     *
     * @param enabled
     */
    private void switchOrb(boolean enabled) {
        owner.getPackets().sendConfig(1174, enabled ? -1 : 0);
        if (enabled) unlock();
        else lockOrb();
    }

    public void unlock() {
        switch (data.getSpecialAttack()) {
            case CLICK:
                owner.getPackets().sendIComponentSettings(747, 17, 0, 0, 2);
                owner.getPackets().sendIComponentSettings(662, 74, 0, 0, 2);
                break;
            case ENTITY:
                owner.getPackets().sendIComponentSettings(747, 17, 0, 0, 20480);
                owner.getPackets().sendIComponentSettings(662, 74, 0, 0, 20480);
                break;
            case OBJECT:
            case ITEM:
                owner.getPackets().sendIComponentSettings(747, 17, 0, 0, 65536);
                owner.getPackets().sendIComponentSettings(662, 74, 0, 0, 65536);
                break;
        }
        owner.getPackets().sendHideIComponent(747, 8, false);
    }

    /**
     * How long will this follower stay alive for
     */
    private void sendTimeRemaining() {
        owner.getPackets().sendConfig(1176, ticks * 65);
    }

    /**
     * Send summoning energy to tab
     */
    private void refreshSpecialEnergy() {
        owner.getPackets().sendConfig(1177, specialEnergy);
    }

    /**
     * Show the summoning orb options
     */
    private void unlockOrb() {
        owner.getPackets().sendHideIComponent(747, 8, false);
        sendLeftClickOption(owner);
    }

    private void lockOrb() {
        owner.getPackets().sendHideIComponent(747, 8, true);
    }

    /**
     * Send the what the user has chosen as left click option to summoning orb
     */
    private static void sendLeftClickOption(Player player) {
        player.getPackets().sendConfig(1493, player.getSummoningLeftClickOption());
        player.getPackets().sendConfig(1494, player.getSummoningLeftClickOption());
    }

    /**
     * Reduce the special energy by given amount
     *
     * @param specialReduction how much
     */
    public void drainSpecial(int specialReduction) {
        specialEnergy -= specialReduction;
        if (specialEnergy < 0) {
            specialEnergy = 0;
        }
        refreshSpecialEnergy();
    }

    /**
     * Drain special by the amount required by this follower
     */
    private void drainSpecial() {
        specialEnergy -= data.getSpecialAmount();
        refreshSpecialEnergy();
    }

    @Override
    public void processNPC() {
        if (isDead()) return;
        unlockOrb();
        trackTimer++;
        if (trackTimer == 50) {
            trackTimer = 0;
            ticks--;
            if (trackDrain) owner.getSkills().drainSummoning(1);
            trackDrain = !trackDrain;
            if (ticks == 2) owner.getPackets().sendGameMessage("You have 1 minute before your familiar vanishes.");
            else if (ticks == 1)
                owner.getPackets().sendGameMessage("You have 30 seconds before your familiar vanishes.");
            else if (ticks == 0) {
                dismiss(false);
                return;
            }
            sendTimeRemaining();
        }
        if (owner.isCanPvp() && getId() != data.getNpcId()) {
            transformIntoNPC(data.getNpcId());
            call(false);
            return;
        } else if (!owner.isCanPvp() && getId() == data.getNpcId() && getCombatLevel() > 0) {
            transformIntoNPC(data.getNpcId() - 1);
            call(false);
            return;
        } else if (!withinDistance(owner, 12)) {
            call(false);
            return;
        }
        if (!getCombat().process()) {
            if (data.isAggressive() && owner.getAttackedBy() != null && owner.getAttackedByDelay() > TimeUtils.getTime()
                    && canAttack(owner.getAttackedBy()) && Utils.getRandom(25) == 0)
                getCombat().setTarget(owner.getAttackedBy());
            else follow();
        }
    }

    private transient boolean dead;

    @Override
    public void sendDeath(Entity source) {
        if (dead) return;
        dead = true;
        final NpcCombatDefinitions defs = getCombatDefinitions();
        resetWalkSteps();
        setCantInteract(true);
        getCombat().removeTarget();
        setNextAnimation(null);
        WorldTasksManager.schedule(new WorldTask() {
            int loop;

            @Override
            public void run() {
                if (loop == 0) {
                    setNextAnimation(new Animation(defs.getDeathEmote()));
                    owner.getPackets().sendGameMessage("Your familiar slowly begins to fade away..");
                } else if (loop >= defs.getDeathDelay()) {
                    dismiss(false);
                    stop();
                }
                loop++;
            }
        }, 0, 1);
    }

    /**
     * May we attack this target
     */
    public boolean canAttack(Entity target) {
        if (target instanceof Player) {
            Player player = (Player) target;
            if (!owner.isCanPvp() || !player.isCanPvp()) return false;
        }
        return !target.isDead() && owner.isAtMultiArea() && isAtMultiArea() && target.isAtMultiArea()
                && owner.getControllerManager().canAttack(target);
    }

    public void setSpecial(boolean on) {
        if (!on) owner.getTemporaryAttributes().remove("FamiliarSpec");
        else {
            if (specialEnergy < data.getSpecialAmount()) {
                owner.getPackets().sendGameMessage("You familiar doesn't have enough special energy.");
                return;
            }
            owner.getTemporaryAttributes().put("FamiliarSpec", Boolean.TRUE);
        }
    }

    public boolean hasSpecialOn() {
        if (owner.getTemporaryAttributes().remove("FamiliarSpec") != null) {
            if (!owner.getInventory().containsItem(data.getScrollId(), 1)) {
                owner.getPackets().sendGameMessage("You don't have the scrolls to use this move.");
                return false;
            }
            owner.getInventory().deleteItem(data.getScrollId(), 1);
            drainSpecial();
            return true;
        }
        return false;
    }

    /**
     * Is given player the owner
     * Uses username because it's more reliable
     *
     * @param player potential owner
     * @return if potential owner is owner
     */
    public boolean ownedBy(Player player) {
        return player.getUsername().equalsIgnoreCase(owner.getUsername());
    }

    public void store() {
        if (bob == null) return;
        bob.open();
    }

    public SpecialAttack getSpecialAttack() {
        return data.getSpecialAttack();
    }

    public void submitSpecial(Object object) {
        data.submitSpecial(this, object);
    }

    public BeastOfBurdenInventory getBob() {
        return bob;
    }

    public void call() {
        if (getAttackedBy() != null && getAttackedByDelay() > TimeUtils.getTime()) {
            owner.getPackets().sendGameMessage("You cant call your familiar while it under combat.");
            return;
        }
        call(false);
    }

    public void takeBob() {
        if (bob == null) return;
        bob.takeBob();
    }

    public boolean renewFamiliar() {
        if (ticks > 5) {
            owner.getPackets().sendGameMessage("You need to have at least two minutes and fifty seconds remaining "
                    + "before you can renew your familiar.", true);
            return false;
        } else if (!owner.getInventory().getItems().contains(new Item(data.getPouchId(), 1))) {
            owner.getPackets().sendGameMessage(
                    "You need a " + ItemDefinitions.getItemDefinitions(data.getPouchId()).getName().toLowerCase()
                            + " to renew your familiar's timer.");
            return false;
        }
        resetTickets();
        owner.getInventory().deleteItem(data.getPouchId(), 1);
        call(true);
        owner.getPackets().sendGameMessage("You use your remaining pouch to renew your familiar.");
        return true;
    }

    private void resetTickets() {
        ticks = (data.getLife() / 1000 / 30);
        trackTimer = 0;
    }

    public void sendFollowerDetails() {
        boolean res = owner.getInterfaceManager().hasResizableScreen();
        owner.getPackets().sendInterface(true, res ? 746 : 548, res ? 98 : 212, 662);
        owner.getPackets().sendHideIComponent(662, 44, true);
        owner.getPackets().sendHideIComponent(662, 45, true);
        owner.getPackets().sendHideIComponent(662, 46, true);
        owner.getPackets().sendHideIComponent(662, 47, true);
        owner.getPackets().sendHideIComponent(662, 48, true);
        owner.getPackets().sendHideIComponent(662, 71, false);
        owner.getPackets().sendHideIComponent(662, 72, false);
        unlock();
        owner.getPackets().sendGlobalConfig(168, 8);// tab id
    }

    public static void selectLeftOption(Player player) {
        boolean res = player.getInterfaceManager().hasResizableScreen();
        player.getPackets().sendInterface(true, res ? 746 : 548, res ? 98 : 212, 880);
        sendLeftClickOption(player);
        player.getPackets().sendGlobalConfig(168, 8);// tab id
    }

    public static void setLeftClickOption(Player player, int summoningLeftClickOption) {
        if (summoningLeftClickOption == player.getSummoningLeftClickOption()) return;
        player.setSummoningLeftClickOption(summoningLeftClickOption);
        sendLeftClickOption(player);
    }

    public static void confirmLeftOption(Player player) {
        player.getPackets().sendGlobalConfig(168, 4);// inv tab id
        boolean res = player.getInterfaceManager().hasResizableScreen();
        player.getPackets().closeInterface(res ? 98 : 212);
    }

    public boolean canStoreEssOnly() {
        return data.isAbyssalCreature();
    }

    public Player getOwner() {
        return owner;
    }

    public int getOriginalId() {
        return data.getNpcId();
    }

    public void restoreSpecialAttack(int energy) {
        if (specialEnergy >= 60) return;
        specialEnergy = energy + specialEnergy >= 60 ? 60 : specialEnergy + energy;
        refreshSpecialEnergy();
    }
}
