package com.rs.game.actionHandling.handlers.listeners;

import com.rs.cores.CoresManager;
import com.rs.game.actionHandling.Handler;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.content.skills.construction.Furniture;
import com.rs.game.player.content.skills.construction.Rooms;
import com.rs.game.player.info.RequirementsManager;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.gameUtils.events.EntityAtTileEvent;
import org.pmw.tinylog.Logger;

import java.util.concurrent.TimeUnit;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceAction;
import static com.rs.game.actionHandling.HandlerManager.registerObjectAction;

/**
 * Created by Peng on 15.10.2016.
 */
@SuppressWarnings("unused")
public class Construction implements Handler {

    private static EntityAtTileEvent burnerEvent = (entity, tile) -> {
        if (!(tile instanceof WorldObject) || !(entity instanceof Player)) return;
        final WorldObject object = (WorldObject) tile;
        final WorldObject spawnedObject = new WorldObject(object.getId()
                                                          + 1, object.getType(), object.getRotation(), object.getX(),
                object.getY(), object.getPlane());
        ((Player) entity).getInventory().removeItems(new Item(251));
        World.removeSpawnedObject(object, true);
        World.spawnObject(spawnedObject, true);
        CoresManager.slowExecutor.schedule(() -> {
            try {
                World.removeSpawnedObject(spawnedObject, true);
                World.spawnObject(object, true);
            } catch (Throwable e) {
                Logger.error(e);
            }
        }, 13, TimeUnit.SECONDS);
    };

    public static boolean isBurner(WorldObject object) {
        for (int id : InteractableBuild.BURNER.objectIds)
            if (id + 1 == object.getId()) return true;
        return false;
    }

    enum InteractableBuild {
        BURNER(new int[]{13212}, CLICK_1, burnerEvent, Furniture.Builds.LAMP);

        private int[] objectIds;

        private EntityAtTileEvent event;
        private Furniture.Builds[] builds;

        InteractableBuild(int[] objectIds, int clickType, EntityAtTileEvent event, Furniture.Builds... builds) {
            this.objectIds = objectIds;
            this.event = event;
            this.builds = builds;
        }
    }

    @Override
    public void register() {

        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            if (!RequirementsManager.hasInventoryItems(player, true, new Item(590), new Item(251))) return RETURN;
            burnerEvent.process(player, object);
            return RETURN;
        }, InteractableBuild.BURNER.objectIds);

        for (int id : InteractableBuild.BURNER.objectIds) {
            registerObjectAction(CLICK_5, (player, object, clickType) -> {
                player.sendMessage("You can't remove a lit burner");
                return RETURN;
            }, id + 1);
        }

        registerObjectAction(CLICK_1, (player, object, clickType) -> {
            if (player.getHouse().atHouse()) player.getHouse().leaveHouse();
            return RETURN;
        }, 13405);

        registerInterfaceAction(CLICK_1, (player1, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            Rooms.createRoom(player1, componentId);
            return HANDLED;
        }, 402);
        registerInterfaceAction(CLICK_1, (player, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            Furniture.buildFurniture(player, slotId2);
            return HANDLED;
        }, 396, 394);
    }
}
