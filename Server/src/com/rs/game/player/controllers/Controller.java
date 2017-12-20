package com.rs.game.player.controllers;

import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.player.Player;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.Pots.Pot;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;

public abstract class Controller {

    // private static final long serialVersionUID = 8384350746724116339L;

    protected transient Player player;

    public final void setPlayer(Player player) {
        this.player = player;
    }

    protected final Object[] getArguments() {
        return player.getControllerManager().getLastControllerArguments();
    }

    protected final void setArguments(Object[] objects) {
        player.getControllerManager().setLastControllerArguments(objects);
    }

    public final void removeController() {
        player.getControllerManager().removeControllerWithoutCheck();
    }

    public abstract void start();

    public boolean canEat(Food food) {
        return true;
    }

    public boolean canPot(Pot pot) {
        return true;
    }

    /*
     * after the normal checks, extra checks, only called when you attacking
     */
    public boolean keepCombating(Entity target) {
        return true;
    }

    public boolean canEquip(int slotId, int itemId) {
        return true;
    }

    /*
     * after the normal checks, extra checks, only called when you start trying
     * to attack
     */
    public boolean canAttack(Entity target) {
        return true;
    }

    public void trackXP(int skillId, int addedXp) {

    }

    public boolean canDeleteInventoryItem(int itemId, int amount) {
        return true;
    }

    public boolean canUseItemOnItem(Item itemUsed, Item usedWith) {
        return true;
    }

    public boolean canAddInventoryItem(int itemId, int amount) {
        return true;
    }

    public boolean canPlayerOption1(Player target) {
        return true;
    }

    /*
     * hits as ice barrage and that on multi areas
     */
    public boolean canHit(Entity entity) {
        return true;
    }

    /*
     * processes every game ticket, usualy not used
     */
    public void process() {

    }

    public void moved() {

    }

    public void magicTeleported(int type) {

    }

    public void sendInterfaces() {

    }

    /*
     * return can use script
     */
    public boolean useDialogueScript(Object key) {
        return true;
    }

    /*
     * return can teleport
     */
    public boolean processMagicTeleport(WorldTile toTile) {
        return true;
    }

    /*
     * return can teleport
     */
    public boolean processItemTeleport(WorldTile toTile) {
        return true;
    }

    /*
     * return can teleport
     */
    public boolean processObjectTeleport(WorldTile toTile) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processObjectClick1(WorldObject object) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processButtonClick(int interfaceId, int componentId, int slotId, int packetId) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processNPCClick1(Npc npc) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processNPCClick2(Npc npc) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processNPCClick3(Npc npc) {
        return true;
    }

    public boolean processNPCDeath(Npc npc) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processObjectClick2(WorldObject object) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processObjectClick3(WorldObject object) {
        return true;
    }

    /*
     * return process normally
     */
    public boolean processObjectClick5(WorldObject object) {
        return true;
    }

    /*
     * return let default death
     */
    public boolean sendDeath() {
        return true;
    }

    /*
     * return can move that step
     */
    public boolean canMove(int dir) {
        return true;
    }

    /*
     * return can set that step
     */
    public boolean checkWalkStep(int lastX, int lastY, int nextX, int nextY) {
        return true;
    }

    /*
     * return remove controller
     */
    public boolean login() {
        return true;
    }

    /*
     * return remove controller
     */
    public boolean logout() {
        return true;
    }

    public void forceClose() {
    }

    public Player getPlayer() {
        return player;
    }

    public boolean processItemOnNPC(Npc npc, Item item) {
        return true;
    }

    public boolean checkMovement(int movementType, WorldTile toTile) {
        return true;
    }
}
