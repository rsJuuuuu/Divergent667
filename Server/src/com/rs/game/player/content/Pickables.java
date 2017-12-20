package com.rs.game.player.content;

import com.rs.cores.CoresManager;
import com.rs.game.world.Animation;
import com.rs.game.world.World;
import com.rs.game.world.WorldObject;
import com.rs.game.item.Item;
import com.rs.game.player.Player;

import java.util.TimerTask;

/**
 * Picking up things that are stackable and pickable.
 *
 * @author Arham Siddiqui
 */
public class Pickables {

    /**
     * Picks up the Pickable.
     *
     * @param player   The Player picking up the Pickable.
     * @param pickable The Pickable item to pick.
     */
    private static void pick(final Player player, final WorldObject worldObject, final Pickable pickable) {
        if (player.getInventory().getFreeSlots() > 0) {
            player.setNextAnimation(new Animation(827));
            CoresManager.fastExecutor.schedule(new TimerTask() {
                @Override
                public void run() {
                    player.getInventory().addItem(pickable.getHarvestedItem());
                    World.removeObject(worldObject, false);
                    player.addWalkSteps(worldObject.getX(), worldObject.getY());
                }
            }, 750);
            CoresManager.fastExecutor.schedule(new TimerTask() {
                @Override
                public void run() {
                    World.spawnObject(worldObject, false);
                }
            }, 13000);
        }
    }

    /**
     * Handles if the object is a pickable.
     *
     * @param player      The player picking the object.
     * @param worldObject The literal pickable.
     * @return If the object is a pickable.
     */
    public static boolean handlePickable(Player player, WorldObject worldObject) {
        for (Pickable pickable : Pickable.values()) {
            for (int i = 0; i < pickable.getObjectIds().length; i++) {
                if (pickable.getObjectIds()[i] == worldObject.getId()) {
                    pick(player, worldObject, pickable);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * The single pickable.
     */
    public enum Pickable {
        ONION(new int[]{3366, 5538, 8584}, new Item(1957)),
        CABBAGE(new int[]{1161, 8535, 8536, 8537, 8538, 8539, 8540, 8541, 8542, 8543, 11494, 22301}, new Item(1965)),
        WHEAT(new int[]{313, 5583, 5584, 5585, 15506, 15507, 15508, 22300}, new Item(1947)),
        POTATO(new int[]{312, 8562, 9408}, new Item(1942)),
        FLAX(new int[]{2646, 15075, 15076, 15077, 15078, 67264, 67263}, new Item(1779)),
        BANANA(new int[]{2073}, new Item(1963));
        private int[] objectIds;
        private Item harvestedItem;

        Pickable(int[] objectIds, Item harvestedItem) {
            this.objectIds = objectIds;
            this.harvestedItem = harvestedItem;
        }

        public int[] getObjectIds() {
            return objectIds;
        }

        public Item getHarvestedItem() {
            return harvestedItem;
        }
    }
}