package com.rs.game.player.content.skills.summoning;

import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;
import com.rs.game.item.ItemsContainer;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.game.player.Player;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.utils.game.itemUtils.ItemSetsKeyGenerator;
import com.rs.utils.game.itemUtils.PriceUtils;

import java.io.Serializable;

import static com.rs.utils.Constants.PURE_ESSENCE;
import static com.rs.utils.Constants.RUNE_ESSENCE;

public class BeastOfBurdenInventory implements Serializable {

    private static final int ITEMS_KEY = ItemSetsKeyGenerator.generateKey();

    /**
     *
     */
    private static final long serialVersionUID = -2090871604834210257L;

    private transient Player player;
    private transient Follower follower;

    private ItemsContainer<Item> beastItems;

    public BeastOfBurdenInventory(int size) {
        beastItems = new ItemsContainer<>(size, false);
    }

    public void setEntities(Player player, Follower follower) {
        this.player = player;
        this.follower = follower;
    }

    public void open() {
        player.getInterfaceManager().sendInterface(671);
        player.getInterfaceManager().sendInventoryInterface(665);
        sendInterItems();
        sendOptions();
    }

    public void dropBob() {
        int size = follower.getSize();
        WorldTile WorldTile = new WorldTile(follower.getCoordFaceX(size), follower.getCoordFaceY(size), follower
                .getPlane());
        for (int i = 0; i < beastItems.getSize(); i++) {
            Item item = beastItems.get(i);
            if (item != null) World.addGroundItem(item, WorldTile, player, false, -1, false);
        }
        beastItems.reset();
    }

    public void takeBob() {
        Item[] itemsBefore = beastItems.getItemsCopy();
        for (int i = 0; i < beastItems.getSize(); i++) {
            Item item = beastItems.get(i);
            if (item != null) {
                if (!player.getInventory().addItem(item)) break;
                beastItems.remove(i, item);
            }
        }
        beastItems.shift();
        refreshItems(itemsBefore);
    }

    public void removeItem(int slot, int amount) {
        Item item = beastItems.get(slot);
        if (item == null) return;
        Item[] itemsBefore = beastItems.getItemsCopy();
        int maxAmount = beastItems.getNumberOf(item);
        if (amount < maxAmount) item = new Item(item.getId(), amount);
        else item = new Item(item.getId(), maxAmount);
        int freeSpace = player.getInventory().getFreeSlots();
        if (!item.getDefinitions().isStackable()) {
            if (freeSpace == 0) {
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
                return;
            }
            if (freeSpace < item.getAmount()) {
                item.setAmount(freeSpace);
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
            }
        } else {
            if (freeSpace == 0 && !player.getInventory().containsItem(item.getId(), 1)) {
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
                return;
            }
        }
        beastItems.remove(slot, item);
        beastItems.shift();
        player.getInventory().addItem(item);
        refreshItems(itemsBefore);
    }

    public void addItem(int slot, int amount) {
        Item item = player.getInventory().getItem(slot);
        if (item == null) return;
        if (!ItemConstants.isTradeable(item) || item.getId() == 4049 || (follower.canStoreEssOnly()
                                                                         && item.getId() != RUNE_ESSENCE
                                                                         && item.getId() != PURE_ESSENCE) || (
                    !follower.canStoreEssOnly() && item.getId() == RUNE_ESSENCE || item.getId() == PURE_ESSENCE)
            || PriceUtils.getPrice(item.getId()) > 50000) {
            player.getPackets().sendGameMessage("You cannot store this item.");
            return;
        }
        Item[] itemsBefore = beastItems.getItemsCopy();
        int maxAmount = player.getInventory().getItems().getNumberOf(item);
        if (amount < maxAmount) item = new Item(item.getId(), amount);
        else item = new Item(item.getId(), maxAmount);
        int freeSpace = beastItems.getFreeSlots();
        if (!item.getDefinitions().isStackable()) {
            if (freeSpace == 0) {
                player.getPackets().sendGameMessage("Not enough space in your Familiar Inventory.");
                return;
            }

            if (freeSpace < item.getAmount()) {
                item.setAmount(freeSpace);
                player.getPackets().sendGameMessage("Not enough space in your Familiar Inventory.");
            }
        } else {
            if (freeSpace == 0 && !beastItems.containsOne(item)) {
                player.getPackets().sendGameMessage("Not enough space in your Familiar Inventory.");
                return;
            }
        }
        beastItems.add(item);
        beastItems.shift();
        player.getInventory().deleteItem(slot, item);
        refreshItems(itemsBefore);
    }

    public void refreshItems(Item[] itemsBefore) {
        int[] changedSlots = new int[itemsBefore.length];
        int count = 0;
        for (int index = 0; index < itemsBefore.length; index++) {
            Item item = beastItems.getItems()[index];
            if (itemsBefore[index] != item) {
                changedSlots[count++] = index;
            }

        }
        int[] finalChangedSlots = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        refresh(finalChangedSlots);
    }

    public void refresh(int... slots) {
        player.getPackets().sendUpdateItems(ITEMS_KEY, beastItems, slots);
    }

    public void sendOptions() {
        player.getPackets().sendUnlockIComponentOptionSlots(665, 0, 0, 27, 0, 1, 2, 3, 4, 5);
        player.getPackets().sendInterSetItemsOptionsScript(665, 0, 93, 4, 7, "Store", "Store-5", "Store-10",
                "Store-All", "Store-X", "Examine");
        player.getPackets().sendUnlockIComponentOptionSlots(671, 27, 0, ITEMS_KEY, 0, 1, 2, 3, 4, 5);
        player.getPackets().sendInterSetItemsOptionsScript(671, 27, ITEMS_KEY, 6, 5, "Withdraw", "Withdraw-5",
                "Withdraw-10", "Withdraw-All", "Withdraw-X", "Examine");
    }

    public void sendInterItems() {
        player.getPackets().sendItems(ITEMS_KEY, beastItems);
        player.getPackets().sendItems(93, player.getInventory().getItems());
    }

    public ItemsContainer<Item> getBeastItems() {
        return beastItems;
    }

}