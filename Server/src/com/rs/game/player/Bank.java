package com.rs.game.player;

import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.actionHandling.handlers.InterfaceHandler;
import com.rs.game.item.Item;
import com.rs.game.npc.impl.summoning.Follower;
import com.rs.utils.game.itemUtils.ItemExamines;

import java.io.Serializable;

import static com.rs.game.player.InterfaceManager.GameInterface.EQUIPMENT_TAB;
import static com.rs.game.player.InterfaceManager.GameInterface.INVENTORY;

public class Bank implements Serializable {

    private static final long serialVersionUID = 1551246756081236625L;

    private Item[][] bankTabs;

    private short bankPin;

    private transient Player player;
    private transient int currentTab;
    private transient Item[] lastContainerCopy;
    private transient boolean withdrawNotes;
    private transient boolean insertItems;
    private transient boolean displayEquipment = false;

    private static final long MAX_BANK_SIZE = 506;

    public Bank() {
        bankTabs = new Item[1][0];
    }

    public void setPlayer(Player player) {
        this.player = player;
        if (bankTabs == null || bankTabs.length == 0) bankTabs = new Item[1][0];
    }

    private void refreshTabs() {
        for (int slot = 1; slot < 9; slot++)
            refreshTab(slot);
    }

    private int getTabSize(int slot) {
        if (slot >= bankTabs.length) return 0;
        return bankTabs[slot].length;
    }

    public void withdrawLastAmount(int bankSlot) {
        Integer lastAmount = (Integer) player.getTemporaryAttributes().get("bank_lastAmount");
        if (lastAmount == null) return;
        withdrawItem(bankSlot, lastAmount);
    }

    public void withdrawItemButOne(int fakeSlot) {
        int[] fromRealSlot = getRealSlot(fakeSlot);
        Item item = getItem(fromRealSlot);
        if (item == null) return;
        if (item.getAmount() <= 1) {
            player.getPackets().sendGameMessage("You only have one of this item in your bank");
            return;
        }
        withdrawItem(fakeSlot, item.getAmount() - 1);
    }

    public void depositLastAmount(int bankSlot) {
        Integer lastAmount = (Integer) player.getTemporaryAttributes().get("bank_lastAmount");
        if (lastAmount == null) return;
        depositItem(bankSlot, lastAmount, true);
    }

    public void openPlayerBank(Player victim) {
        if (victim == null) {
            return;
        }
        player.getInterfaceManager().sendInterface(762);
        player.getInterfaceManager().sendInventoryInterface(763);
        player.getPackets().sendItems(95, victim.getBank().getContainerCopy());
        refreshViewingTab();
        refreshTabs();
        unlockButtons();
    }

    public void depositAllInventory(boolean banking) {
        if (Bank.MAX_BANK_SIZE - getBankSize() < player.getInventory().getItems().getSize()) {
            player.getPackets().sendGameMessage("Not enough space in your bank.");
            return;
        }
        for (int i = 0; i < 28; i++)
            depositItem(i, Integer.MAX_VALUE, false);
        refreshTab(currentTab);
        refreshItems();
    }

    public void depositAllBob(boolean banking) {
        Follower follower = player.getFollower();
        if (follower == null || follower.getBob() == null) return;
        int space = addItems(follower.getBob().getBeastItems().getItems(), banking);
        if (space != 0) {
            for (int i = 0; i < space; i++)
                follower.getBob().getBeastItems().set(i, null);
            follower.getBob().sendInterItems();
        }
        if (space < follower.getBob().getBeastItems().getSize()) {
            player.getPackets().sendGameMessage("Not enough space in your bank.");
        }
    }

    public void depositAllEquipment(boolean banking) {
        int space = addItems(player.getEquipment().getItems().getItems(), banking);
        if (space != 0) {
            for (int i = 0; i < space; i++)
                player.getEquipment().getItems().set(i, null);
            player.getEquipment().init();
            player.getAppearance().generateAppearanceData();
        }
        if (space < player.getEquipment().getItems().getSize()) {
            player.getPackets().sendGameMessage("Not enough space in your bank.");
        }
    }

    public boolean containsItem(int itemId, int amount) {
        for (Item[] bankTab : bankTabs) {
            for (Item item : bankTab) {
                if (item.getId() == itemId && item.getAmount() >= amount) {
                    return true;
                }
            }
        }
        return false;
    }

    public void collapse(int tabId) {
        if (tabId == 0 || tabId > bankTabs.length) return;
        Item[] items = bankTabs[tabId];
        for (Item item : items)
            removeItem(getItemSlot(item.getId()), item.getAmount(), false, true);
        for (Item item : items)
            addItem(item.getId(), item.getAmount(), 0, false);
        refreshTabs();
        refreshItems();
    }

    public void switchItem(int fromSlot, int toSlot, int fromComponentId, int toComponentId) {
        if (toSlot == 65535) {
            int toTab = 9 - ((toComponentId - 44) / 2);
            if (toTab < 0 || toTab > 8) return;
            if (bankTabs.length == toTab) {
                int[] fromRealSlot = getRealSlot(fromSlot);
                if (fromRealSlot == null) return;
                if (toTab == fromRealSlot[0]) {
                    switchItem(fromSlot, getStartSlot(toTab));
                    return;
                }
                Item item = getItem(fromRealSlot);
                if (item == null) return;
                removeItem(fromSlot, item.getAmount(), false, true);
                createTab();
                bankTabs[bankTabs.length - 1] = new Item[]{item};
                refreshTab(fromRealSlot[0]);
                refreshTab(toTab);
                refreshItems();
            } else if (bankTabs.length > toTab) {
                int[] fromRealSlot = getRealSlot(fromSlot);
                if (fromRealSlot == null) return;
                if (toTab == fromRealSlot[0]) {
                    switchItem(fromSlot, getStartSlot(toTab));
                    return;
                }
                Item item = getItem(fromRealSlot);
                if (item == null) return;
                boolean removed = removeItem(fromSlot, item.getAmount(), false, true);
                if (!removed) refreshTab(fromRealSlot[0]);
                else if (fromRealSlot[0] != 0 && toTab >= fromRealSlot[0]) toTab -= 1;
                refreshTab(fromRealSlot[0]);
                addItem(item.getId(), item.getAmount(), toTab, true);
            }
        } else switchItem(fromSlot, toSlot);
    }

    private void switchItem(int fromSlot, int toSlot) {
        int[] fromRealSlot = getRealSlot(fromSlot);
        Item fromItem = getItem(fromRealSlot);
        if (fromItem == null) return;
        int[] toRealSlot = getRealSlot(toSlot);
        Item toItem = getItem(toRealSlot);
        if (toItem == null) return;
        bankTabs[fromRealSlot[0]][fromRealSlot[1]] = toItem;
        bankTabs[toRealSlot[0]][toRealSlot[1]] = fromItem;
        refreshTab(fromRealSlot[0]);
        if (fromRealSlot[0] != toRealSlot[0]) refreshTab(toRealSlot[0]);
        refreshItems();
    }

    public void openSetPin() {
    }

    public void openDepositBox() {
        player.getInterfaceManager().sendInterface(11);
        player.getInterfaceManager().closeInterfaces(INVENTORY);
        player.getInterfaceManager().closeInterfaces(EQUIPMENT_TAB);
        final int lastGameTab = player.getInterfaceManager().openGameTab(9);
        sendBoxInterItems();
        player.getPackets().sendIComponentText(11, 13, "Bank Of " + Settings.SERVER_NAME + " - Deposit Box");
        player.setCloseInterfacesEvent(() -> {
            player.getInterfaceManager().openInterfaces(INVENTORY, EQUIPMENT_TAB);
            player.getInterfaceManager().openGameTab(lastGameTab);
        });
    }

    private void sendBoxInterItems() {
        player.getPackets().sendInterSetItemsOptionsScript(11, 17, 93, 6, 5, "Deposit-1", "Deposit-5", "Deposit-10",
                "Deposit-All", "Deposit-X", "Examine");
        player.getPackets().sendUnlockIComponentOptionSlots(11, 17, 0, 27, 0, 1, 2, 3, 4, 5);
    }

    public void openBank() {
        player.getInterfaceManager().sendInterface(762);
        player.getInterfaceManager().sendInventoryInterface(763);
        refreshViewingTab();
        refreshTabs();
        unlockButtons();
        sendItems();
        if (displayEquipment) InterfaceHandler.openEquipmentBonuses(player, true);
    }

    private void createTab() {
        int slot = bankTabs.length;
        Item[][] tabs = new Item[slot + 1][];
        System.arraycopy(bankTabs, 0, tabs, 0, slot);
        tabs[slot] = new Item[0];
        bankTabs = tabs;
    }

    private void destroyTab(int slot) {
        Item[][] tabs = new Item[bankTabs.length - 1][];
        System.arraycopy(bankTabs, 0, tabs, 0, slot);
        System.arraycopy(bankTabs, slot + 1, tabs, slot, bankTabs.length - slot - 1);
        bankTabs = tabs;
        if (currentTab != 0 && currentTab >= slot) currentTab--;
    }

    public boolean hasBankSpace() {
        return getBankSize() < MAX_BANK_SIZE;
    }

    public void withdrawItem(int bankSlot, int quantity) {
        if (quantity < 1) return;
        Item item = getItem(getRealSlot(bankSlot));
        if (item == null) return;
        if (item.getAmount() < quantity) item = new Item(item.getId(), item.getAmount());
        else item = new Item(item.getId(), quantity);
        boolean noted = false;
        ItemDefinitions defs = item.getDefinitions();
        if (withdrawNotes) {
            if (!defs.isNoted() && defs.getCertId() != -1) {
                item.setId(defs.getCertId());
                noted = true;
            } else player.getPackets().sendGameMessage("You cannot withdraw this item as a note.");
        }
        if (noted || defs.isStackable()) {
            if (player.getInventory().getItems().containsOne(item)) {
                int slot = player.getInventory().getItems().getThisItemSlot(item);
                Item invItem = player.getInventory().getItems().get(slot);
                if (invItem.getAmount() + item.getAmount() <= 0) {
                    item.setAmount(Integer.MAX_VALUE - invItem.getAmount());
                    player.getPackets().sendGameMessage("Not enough space in your inventory.");
                }
            } else if (!player.getInventory().hasFreeSlots()) {
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
                return;
            }
        } else {
            int freeSlots = player.getInventory().getFreeSlots();
            if (freeSlots == 0) {
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
                return;
            }
            if (freeSlots < item.getAmount()) {
                item.setAmount(freeSlots);
                player.getPackets().sendGameMessage("Not enough space in your inventory.");
            }
        }
        removeItem(bankSlot, item.getAmount(), true, false);
        player.getInventory().addItem(item);
    }

    public void sendExamine(int fakeSlot) {
        int[] slot = getRealSlot(fakeSlot);
        if (slot == null) return;
        Item item = bankTabs[slot[0]][slot[1]];
        player.getPackets().sendGameMessage(ItemExamines.getExamine(item));

    }

    public void depositItem(int invSlot, int quantity, boolean refresh) {
        if (quantity < 1 || invSlot < 0 || invSlot > 27) return;
        Item item = player.getInventory().getItem(invSlot);
        if (item == null) return;
        int amt = player.getInventory().getItems().getNumberOf(item);
        if (amt < quantity) item = new Item(item.getId(), amt);
        else item = new Item(item.getId(), quantity);
        ItemDefinitions defs = item.getDefinitions();
        int originalId = item.getId();
        if (defs.isNoted() && defs.getCertId() != -1) item.setId(defs.getCertId());
        Item bankedItem = getItem(item.getId());
        if (bankedItem != null) {
            if (bankedItem.getAmount() + item.getAmount() < 0) {
                item.setAmount(Integer.MAX_VALUE - bankedItem.getAmount());
                player.getPackets().sendGameMessage("Not enough space in your bank.");
            }
        } else if (!hasBankSpace()) {
            player.getPackets().sendGameMessage("Not enough space in your bank.");
            return;
        }
        if (item.getAmount() == 0) return;
        if (item.getAmount() != 0) player.getInventory().deleteItem(invSlot, new Item(originalId, item.getAmount()));
        addItem(item, refresh);
    }

    private void addItem(Item item, boolean refresh) {
        addItem(item.getId(), item.getAmount(), refresh);
    }

    private int addItems(Item[] items, boolean refresh) {
        int space = (int) (MAX_BANK_SIZE - getBankSize());
        if (space != 0) {
            space = (space < items.length ? space : items.length);
            for (int i = 0; i < space; i++) {
                if (items[i] == null) continue;
                addItem(items[i], false);
            }
            if (refresh) {
                refreshTabs();
                refreshItems();
            }
        }
        return space;
    }

    public void addItem(int id, int quantity, boolean refresh) {
        addItem(id, quantity, currentTab, refresh);
    }

    public void addItem(int id, int quantity, int creationTab, boolean refresh) {
        int[] slotInfo = getItemSlot(id);
        if (slotInfo == null) {
            if (creationTab >= bankTabs.length) creationTab = bankTabs.length - 1;
            if (creationTab < 0) //fixed now, alex
                creationTab = 0;
            int slot = bankTabs[creationTab].length;
            Item[] tab = new Item[slot + 1];
            System.arraycopy(bankTabs[creationTab], 0, tab, 0, slot);
            tab[slot] = new Item(id, quantity);
            bankTabs[creationTab] = tab;
            if (refresh) refreshTab(creationTab);
        } else {
            Item item = bankTabs[slotInfo[0]][slotInfo[1]];
            bankTabs[slotInfo[0]][slotInfo[1]] = new Item(item.getId(), item.getAmount() + quantity);
        }
        if (refresh) refreshItems();
    }

    private boolean removeItem(int fakeSlot, int quantity, boolean refresh, boolean forceDestroy) {
        return removeItem(getRealSlot(fakeSlot), quantity, refresh, forceDestroy);
    }

    private boolean removeItem(int[] slot, int quantity, boolean refresh, boolean forceDestroy) {
        if (slot == null) return false;
        Item item = bankTabs[slot[0]][slot[1]];
        boolean destroyed = false;
        if (quantity >= item.getAmount()) {
            if (bankTabs[slot[0]].length == 1 && (forceDestroy || bankTabs.length != 1)) {
                destroyTab(slot[0]);
                refreshTabs();
                destroyed = true;
            } else {
                Item[] tab = new Item[bankTabs[slot[0]].length - 1];
                System.arraycopy(bankTabs[slot[0]], 0, tab, 0, slot[1]);
                System.arraycopy(bankTabs[slot[0]], slot[1] + 1, tab, slot[1], bankTabs[slot[0]].length - slot[1] - 1);
                bankTabs[slot[0]] = tab;
                if (refresh) refreshTab(slot[0]);
            }
        } else bankTabs[slot[0]][slot[1]] = new Item(item.getId(), item.getAmount() - quantity);
        if (refresh) refreshItems();
        return destroyed;
    }

    public Item getItem(int id) {
        for (Item[] bankTab : bankTabs) {
            for (Item item : bankTab)
                if (item.getId() == id) return item;
        }
        return null;
    }

    public int[] getItemSlot(int id) {
        for (int tab = 0; tab < bankTabs.length; tab++) {
            for (int slot = 0; slot < bankTabs[tab].length; slot++)
                if (bankTabs[tab][slot].getId() == id) return new int[]{tab, slot};
        }
        return null;
    }

    public Item getItem(int[] slot) {
        if (slot == null) return null;
        return bankTabs[slot[0]][slot[1]];
    }

    private int getStartSlot(int tabId) {
        int slotId = 0;
        for (int tab = 1; tab < (tabId == 0 ? bankTabs.length : tabId); tab++)
            slotId += bankTabs[tab].length;

        return slotId;
    }

    private int[] getRealSlot(int slot) {
        for (int tab = 1; tab < bankTabs.length; tab++) {
            if (slot >= bankTabs[tab].length) slot -= bankTabs[tab].length;
            else return new int[]{tab, slot};
        }
        if (slot >= bankTabs[0].length) return null;
        return new int[]{0, slot};
    }

    private void refreshViewingTab() {
        player.getPackets().sendConfigByFile(4893, currentTab + 1);
    }

    private void refreshTab(int slot) {
        if (slot == 0) return;
        player.getPackets().sendConfigByFile(4885 + (slot - 1), getTabSize(slot));
    }

    public void sendItems() {
        player.getPackets().sendItems(95, getContainerCopy());
    }

    private void refreshItems(int[] slots) {
        player.getPackets().sendUpdateItems(95, getContainerCopy(), slots);
    }

    public Item[] getContainerCopy() {
        if (lastContainerCopy == null) lastContainerCopy = generateContainer();
        return lastContainerCopy;
    }

    private void refreshItems() {
        refreshItems(generateContainer(), getContainerCopy());
    }

    private void refreshItems(Item[] itemsAfter, Item[] itemsBefore) {
        if (itemsBefore.length != itemsAfter.length) {
            lastContainerCopy = itemsAfter;
            sendItems();
            return;
        }
        int[] changedSlots = new int[itemsAfter.length];
        int count = 0;
        for (int index = 0; index < itemsAfter.length; index++) {
            if (itemsBefore[index] != itemsAfter[index]) changedSlots[count++] = index;
        }
        int[] finalChangedSlots = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        lastContainerCopy = itemsAfter;
        refreshItems(finalChangedSlots);
    }

    private int getBankSize() {
        int size = 0;
        for (Item[] bankTab : bankTabs) size += bankTab.length;
        return size;
    }

    private Item[] generateContainer() {
        Item[] container = new Item[getBankSize()];
        int count = 0;
        for (int slot = 1; slot < bankTabs.length; slot++) {
            System.arraycopy(bankTabs[slot], 0, container, count, bankTabs[slot].length);
            count += bankTabs[slot].length;
        }
        System.arraycopy(bankTabs[0], 0, container, count, bankTabs[0].length);
        return container;
    }

    public void unlockButtons() {
        // unlock bank inter all options
        player.getPackets().sendIComponentSettings(762, 93, 0, 516, 2622718);
        // unlock bank inv all options
        player.getPackets().sendIComponentSettings(763, 0, 0, 27, 2425982);
    }

    public void switchWithdrawNotes() {
        withdrawNotes = !withdrawNotes;
    }

    public void switchInsertItems() {
        insertItems = !insertItems;
        player.getPackets().sendConfig(305, insertItems ? 1 : 0);
    }

    public void setCurrentTab(int currentTab) {
        if (currentTab >= bankTabs.length) return;
        this.currentTab = currentTab;
    }

    public void setDisplayEquipment(boolean displayEquipment) {
        this.displayEquipment = displayEquipment;
    }
}