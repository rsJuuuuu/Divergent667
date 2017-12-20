package com.rs.game.player;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.utils.game.itemUtils.ItemExamines;

import java.io.Serializable;

public final class Inventory implements Serializable {

    private static final long serialVersionUID = 8842800123753277093L;

    private ItemsContainer<Item> items;

    private transient Player player;

    public static final int INVENTORY_INTERFACE = 679;

    public Inventory() {
        items = new ItemsContainer<>(28, false);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void init() {
        player.getPackets().sendItems(93, items);
    }

    void unlockInventoryOptions() {
        player.getPackets().sendIComponentSettings(INVENTORY_INTERFACE, 0, 0, 27, 4554126);
        player.getPackets().sendIComponentSettings(INVENTORY_INTERFACE, 0, 28, 55, 2097152);
    }

    public void reset() {
        items.reset();
        init();
    }

    public void refresh(int... slots) {
        player.getPackets().sendUpdateItems(93, items, slots);
    }

    public void addAll(ItemsContainer items) {
        if (items != null) {
            for (int i = 0; i < items.getSize(); i++) {
                if (items.get(i) != null) this.items.add(items.get(i));
            }
        }
    }

    public void refresh(ItemsContainer items) {
        if (items != null && player != null) player.getPackets().sendItems(93, items);
    }

    public boolean addItem(int itemId, int amount) {
        return addItem(new Item(itemId, amount));
    }

    public boolean addItem(Item item) {
        if (item.getId() < 0 || item.getAmount() < 0 || item.getId() >= ItemDefinitions.getItemDefinitionsSize()
            || !player.getControllerManager().canAddInventoryItem(item.getId(), item.getAmount())) return false;
        Item[] itemsBefore = items.getItemsCopy();
        if (!items.add(item)) {
            items.add(new Item(item.getId(), items.getFreeSlots()));
            player.getPackets().sendGameMessage("Not enough space in your inventory.");
            refreshItems(itemsBefore);
            return false;
        }
        refreshItems(itemsBefore);
        return true;
    }

    public void deleteItem(int slot, Item item) {
        if (!player.getControllerManager().canDeleteInventoryItem(item.getId(), item.getAmount())) return;
        Item[] itemsBefore = items.getItemsCopy();
        items.remove(slot, item);
        refreshItems(itemsBefore);
    }

    public boolean removeItems(Item... list) {
        if (list == null || list.length == 0) {
            return false;
        }
        for (Item item : list) {
            if (item != null) deleteItem(items.getThisItemSlot(item), item);
        }
        refresh();
        return true;
    }

    public void deleteItem(int itemId, int amount) {
        if (!player.getControllerManager().canDeleteInventoryItem(itemId, amount)) return;
        Item[] itemsBefore = items.getItemsCopy();
        items.remove(new Item(itemId, amount));
        refreshItems(itemsBefore);
    }

    public void deleteItem(Item item) {
        if (!player.getControllerManager().canDeleteInventoryItem(item.getId(), item.getAmount())) return;
        Item[] itemsBefore = items.getItemsCopy();
        items.remove(item);
        refreshItems(itemsBefore);
    }

    public void switchItem(int fromSlot, int toSlot) {
        Item[] itemsBefore = items.getItemsCopy();
        Item fromItem = items.get(fromSlot);
        Item toItem = items.get(toSlot);
        items.set(fromSlot, toItem);
        items.set(toSlot, fromItem);
        refreshItems(itemsBefore);
    }

    public void refreshItems(Item[] itemsBefore) {
        int[] changedSlots = new int[itemsBefore.length];
        int count = 0;
        for (int index = 0; index < itemsBefore.length; index++) {
            if (itemsBefore[index] != items.getItems()[index]) changedSlots[count++] = index;
        }
        int[] finalChangedSlots = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        refresh(finalChangedSlots);
    }

    public ItemsContainer<Item> getItems() {
        return items;
    }

    public boolean hasFreeSlots() {
        return items.getFreeSlot() != -1;
    }

    public int getFreeSlots() {
        return items.getFreeSlots();
    }

    public Item getItem(int slot) {
        return items.get(slot);
    }

    public int getItemsContainerSize() {
        return items.getSize();
    }

    public boolean containsItems(Item... item) {
        for (Item anItem : item)
            if (!items.contains(anItem)) return false;
        return true;
    }

    public boolean containsItem(int itemId, int amount) {
        return items.contains(new Item(itemId, amount));
    }

    public boolean containsOneItem(int... itemIds) {
        for (int itemId : itemIds) {
            if (items.containsOne(new Item(itemId, 1))) return true;
        }
        return false;
    }

    public int numberOf(int id) {
        return items.getNumberOf(new Item(id, 1));
    }

    public void sendExamine(Item item) {
        if (item == null) return;
        if (player.debug) player.sendMessage("Item examined: " + item.getId() + " amount: " + item.getAmount());
        player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
    }

    public void sendExamine(int slotId) {
        if (slotId >= getItemsContainerSize()) return;
        Item item = items.get(slotId);
        if (item == null) return;
        if (player.debug) player.sendMessage("Item examined: " + item.getId() + " amount: " + item.getAmount());
        player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
    }

}