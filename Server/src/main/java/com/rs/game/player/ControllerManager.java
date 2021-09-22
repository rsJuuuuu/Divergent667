package com.rs.game.player;

import com.rs.Settings;
import com.rs.game.npc.Npc;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldObject;
import com.rs.game.world.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.player.content.Foods.Food;
import com.rs.game.player.content.Pots.Pot;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.ControllerHandler;

import java.io.Serializable;

public final class ControllerManager implements Serializable {

	private static final long serialVersionUID = 2084691334731830796L;

	private transient Player player;
	private transient Controller controller;
	private transient boolean inited;
	private Object[] lastControllerArguments;

	private String lastController;

	public ControllerManager() {
		lastController = Settings.START_CONTROLLER;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Controller getController() {
		return controller;
	}

	public void startController(String key, Object... parameters) {
		if (controller != null)
			forceStop();
		controller = ControllerHandler.getController(key);
		if (controller == null)
			return;
		controller.setPlayer(player);
		lastControllerArguments = parameters;
		lastController = key;
		controller.start();
		inited = true;
	}

	public void login() {
		if (lastController == null)
			return;
		controller = ControllerHandler.getController(lastController);
		if (controller == null) {
			forceStop();
			return;
		}
		controller.setPlayer(player);
		if (controller.login())
			forceStop();
		else
			inited = true;
	}

	public void logout() {
		if (controller == null)
			return;
		if (controller.logout())
			forceStop();
	}

	public boolean canMove(int dir) {
        return controller == null || !inited || controller.canMove(dir);
    }

	public boolean checkWalkStep(int lastX, int lastY, int nextX, int nextY) {
        return controller == null || !inited || controller.checkWalkStep(lastX, lastY, nextX, nextY);
    }

	public boolean keepCombating(Entity target) {
        return controller == null || !inited || controller.keepCombating(target);
    }

	public boolean canEquip(int slotId, int itemId) {
        return controller == null || !inited || controller.canEquip(slotId, itemId);
    }

	public boolean canAddInventoryItem(int itemId, int amount) {
        return controller == null || !inited || controller.canAddInventoryItem(itemId, amount);
    }

	public void trackXP(int skillId, int addedXp) {
		if (controller == null || !inited)
			return;
		controller.trackXP(skillId, addedXp);
	}

	public boolean canDeleteInventoryItem(int itemId, int amount) {
        return controller == null || !inited || controller.canDeleteInventoryItem(itemId, amount);
    }

	public boolean canUseItemOnItem(Item itemUsed, Item usedWith) {
        return controller == null || !inited || controller.canUseItemOnItem(itemUsed, usedWith);
    }

	public boolean canAttack(Entity entity) {
        return controller == null || !inited || controller.canAttack(entity);
    }

	public boolean canPlayerOption1(Player target) {
        return controller == null || !inited || controller.canPlayerOption1(target);
    }

	public boolean canHit(Entity entity) {
        return controller == null || !inited || controller.canHit(entity);
    }

	public void moved() {
		if (controller == null || !inited)
			return;
		controller.moved();
	}



	public void magicTeleported(int type) {
		if (controller == null || !inited)
			return;
		controller.magicTeleported(type);
	}

	public void sendInterfaces() {
		if (controller == null || !inited)
			return;
		controller.sendInterfaces();
	}

	public void process() {
		if (controller == null || !inited)
			return;
		controller.process();
	}

	public boolean sendDeath() {
        return controller == null || !inited || controller.sendDeath();
    }

	public boolean canEat(Food food) {
        return controller == null || !inited || controller.canEat(food);
    }

	public boolean canPot(Pot pot) {
        return controller == null || !inited || controller.canPot(pot);
    }

	public boolean useDialogueScript(Object key) {
        return controller == null || !inited || controller.useDialogueScript(key);
    }

	public boolean processMagicTeleport(WorldTile toTile) {
        return controller == null || !inited || controller.processMagicTeleport(toTile);
    }

	public boolean processItemTeleport(WorldTile toTile) {
        return controller == null || !inited || controller.processItemTeleport(toTile);
    }

	public boolean processObjectTeleport(WorldTile toTile) {
        return controller == null || !inited || controller.processObjectTeleport(toTile);
    }

	public boolean processObjectClick1(WorldObject object) {
        return controller == null || !inited || controller.processObjectClick1(object);
    }

	public boolean processButtonClick(int interfaceId, int componentId,
			int slotId, int packetId) {
        return controller == null || !inited || controller.processButtonClick(interfaceId, componentId, slotId, packetId);
    }

	private boolean processNPCClick1(Npc npc) {
        return controller == null || !inited || controller.processNPCClick1(npc);
    }

	private boolean processNPCClick2(Npc npc) {
        return controller == null || !inited || controller.processNPCClick2(npc);
    }

	private boolean processNPCClick3(Npc npc) {
		return controller == null || !inited || controller.processNPCClick3(npc);
	}

	public boolean processNpcDeath(Npc npc){
		return controller == null || !inited || controller.processNPCDeath(npc);
	}

	public boolean processNPCClick(Npc npc, int clickType){
		switch (clickType){
			case 1:
				return processNPCClick1(npc);
			case 2:
				return processNPCClick2(npc);
			case 3:
				return processNPCClick3(npc);
			default:
				return true;
		}
	}

	public boolean processObjectClick2(WorldObject object) {
        return controller == null || !inited || controller.processObjectClick2(object);
    }

	public boolean processObjectClick3(WorldObject object) {
        return controller == null || !inited || controller.processObjectClick3(object);
    }

	public boolean processObjectClick5(WorldObject object) {
		return controller == null || !inited || controller.processObjectClick5(object);
	}

	public boolean processItemOnNPC(Npc npc, Item item) {
        return controller == null || !inited || controller.processItemOnNPC(npc, item);
    }

	public void forceStop() {
		if (controller != null) {
			controller.forceClose();
			controller = null;
		}
		lastControllerArguments = null;
		lastController = null;
		inited = false;
	}

	public void removeControllerWithoutCheck() {
		controller = null;
		lastControllerArguments = null;
		lastController = null;
		inited = false;
	}

	public Object[] getLastControllerArguments() {
		return lastControllerArguments;
	}

	public void setLastControllerArguments(Object[] lastControllerArguments) {
		this.lastControllerArguments = lastControllerArguments;
	}

	public boolean handleItemOption1(Player player, int slotId, int itemId,
			Item item) {
		if (itemId != item.getId())
			return false;
		switch (itemId) {
		case -1: 
			return false;
		}
		return true;
	}

	boolean checkMovement(int movementType, WorldTile toTile) {
		return controller == null || controller.checkMovement(movementType, toTile);
	}
}
 

