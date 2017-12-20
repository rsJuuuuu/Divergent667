package com.rs.game.player.content.shops;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.game.itemUtils.ItemBonuses;
import com.rs.utils.game.itemUtils.ItemExamines;
import com.rs.utils.game.itemUtils.ItemSetsKeyGenerator;
import com.rs.utils.game.itemUtils.PriceUtils;
import com.rs.utils.stringUtils.TextUtils;

import java.util.ArrayList;
import java.util.HashMap;

import static com.rs.utils.Constants.BonusType.*;

/**
 * Created by Peng on 29.1.2017 14:02.
 */
public class Shop {

    private static final int MAIN_STOCK_ITEMS_KEY = ItemSetsKeyGenerator.generateKey();

    private boolean generalStore;
    private boolean allowSelling;

    private int currency;

    private String shopName;

    private final ArrayList<Item> originalStock = new ArrayList<>();

    private transient ArrayList<Item> additionalStock;
    private transient ArrayList<Item> currentStock;

    private transient ArrayList<Player> viewingPlayers;

    /**
     * Create a new shop instance
     */
    public Shop(String shopName, int currency, boolean generalStore, boolean allowSelling) {
        this.generalStore = generalStore;
        this.allowSelling = allowSelling;
        this.shopName = shopName;
        this.currency = currency;
        setFields();
    }

    /**
     * Set the transient fields
     */
    void setFields() {
        viewingPlayers = new ArrayList<>();
        if (additionalStock == null) additionalStock = new ArrayList<>();
        if (currentStock == null) currentStock = originalStock;
    }

    /**
     * Add player to the players viewing this shop, used for updating when someone buys something
     */
    void addPlayer(final Player player) {
        viewingPlayers.add(player);
        player.getTemporaryAttributes().put("Shop", this);
        player.setCloseInterfacesEvent(() -> {
            viewingPlayers.remove(player);
            player.getTemporaryAttributes().remove("Shop");
        });
        player.getPackets().sendConfig(118, MAIN_STOCK_ITEMS_KEY);
        player.getPackets().sendConfig(1496, -1); // sets samples items set
        player.getPackets().sendConfig(532, currency);
        sendStore(player);
        player.getPackets().sendGlobalConfig(199, -1);// unknown
        player.getInterfaceManager().sendInterface(620); // opens shop
        player.getPackets().sendGlobalConfig(1241, 16750848);// unknown
        player.getPackets().sendGlobalConfig(1242, 15439903);// unknown
        player.getPackets().sendGlobalConfig(741, -1);// unknown
        player.getPackets().sendGlobalConfig(743, currency);// unknown
        player.getPackets().sendGlobalConfig(744, 0);// unknown
        player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150); // unlocks stock slots
        sendInventory(player);
        player.getPackets().sendIComponentText(620, 20, shopName);
    }

    /**
     * Send required inventory options to player
     */
    public void sendInventory(Player player) {
        player.getInterfaceManager().sendInventoryInterface(621);
        player.getPackets().sendItems(93, player.getInventory().getItems());
        player.getPackets().sendUnlockIComponentOptionSlots(621, 0, 0, 27, 0, 1, 2, 3, 4, 5);
        player.getPackets().sendInterSetItemsOptionsScript(621, 0, 93, 4, 7, "Value", "Sell 1", "Sell 5", "Sell 10",
                "Sell 50", "Examine");
    }

    /**
     * Buy some of the item located at slotId
     */
    public void buy(Player player, int slotId, int quantity) {
        slotId = slotId / 6;
        Item item;
        if (currentStock.size() > slotId) item = currentStock.get(slotId);
        else if (additionalStock.size() > slotId - currentStock.size())
            item = additionalStock.get(slotId - currentStock.size());
        else return;
        if (item.getAmount() < 1) {
            player.sendMessage("There is no stock of that item at the moment.");
            return;
        }
        int price = PriceUtils.getPrice(item.getId());
        int amountToBuy = getAmount(player, quantity, price);
        if (item.getDefinitions().isStackable()) {
            if (!player.getInventory().hasFreeSlots()) {
                player.sendMessage("You don't have enough space in your inventory");
                return;
            }
        } else {
            if (player.getInventory().getFreeSlots() < amountToBuy) {
                amountToBuy = player.getInventory().getFreeSlots();
                player.sendMessage("You don't have enough space in your inventory");
            }
        }
        if (amountToBuy > item.getAmount()) {
            player.sendMessage("The shop has ran out of stock.");
            amountToBuy = item.getAmount();
        }
        if (amountToBuy == 0) return;
        reduceCurrency(player, amountToBuy * price);
        player.getInventory().addItem(item.getId(), amountToBuy);
        item.setAmount(item.getAmount() - amountToBuy);
        refreshShop();
    }

    /**
     * Attempt to sell an item to this store
     */
    public void sell(Player player, int slotId, int quantity) {
        if (player.getInventory().getItemsContainerSize() < slotId) return;
        Item item = player.getInventory().getItem(slotId);
        if (item == null) return;
        if (!allowSelling) {
            player.sendMessage("You can't sell to this store!");
            return;
        }
        if (item.getDefinitions().isDestroyItem() || ItemConstants.getItemDefaultCharges(item.getId()) != -1
            || !ItemConstants.isTradeable(item) || item.getId() == currency) {
            player.getPackets().sendGameMessage("You can't sell this item.");
            return;
        }
        if (!shopName.equalsIgnoreCase("general store")) {
            for (Item stockItem : currentStock)
                if (item.getId() == stockItem.getId()) break;
            player.sendMessage("You can't sell this item to this shop");
            return;
        }
        int price = PriceUtils.getStoreSellPrice(item.getId());
        int numberOff = player.getInventory().getItems().getNumberOf(item.getId());
        if (quantity > numberOff) quantity = numberOff;
        if (!addItem(item.getId(), quantity)) {
            player.getPackets().sendGameMessage("Shop is currently full.");
            return;
        }
        player.getInventory().deleteItem(item.getId(), quantity);
        addCurrency(player, price * quantity);
    }

    /**
     * Add an item to this shop (mainly through selling)
     */
    private boolean addItem(int itemId, int quantity) {
        for (Item item : currentStock) {
            if (item.getId() == itemId) {
                item.setAmount(item.getAmount() + quantity);
                refreshShop();
                return true;
            }
        }
        for (Item item : additionalStock) {
            if (item == null) continue;
            if (item.getId() == itemId) {
                item.setAmount(item.getAmount() + quantity);
                refreshShop();
                return true;
            }
        }
        if (additionalStock.size() > 40 - currentStock.size()) return false;
        additionalStock.add(new Item(itemId, quantity));
        refreshShop();
        return true;
    }

    /**
     * Count how many the player can actually buy
     */
    public int getAmount(Player player, int amount, int price) {
        if (player.getInventory().numberOf(currency) < amount * price) {
            player.sendMessage("You don't have enough money.");
            return player.getInventory().numberOf(currency) / price;
        }
        return amount;
    }

    /**
     * Take the amount of currency from the player
     * The availability of the currency should be checked already
     */
    private void reduceCurrency(Player player, int price) {
        player.getInventory().deleteItem(currency, price);
    }

    /**
     * Give the player money for selling something
     */
    private void addCurrency(Player player, int price) {
        player.getInventory().addItem(currency, price);
    }

    /**
     * Refresh the shop for all viewing players
     */
    private void refreshShop() {
        for (Player player : viewingPlayers) {
            sendStore(player);
            player.getPackets().sendIComponentSettings(620, 25, 0, getStoreSize() * 6, 1150);
        }
    }

    /**
     * Called by the restore task to renew the stock
     */
    void restoreItems() {
        boolean needRefresh = false;
        for (int i = 0; i < currentStock.size(); i++) {
            if (currentStock.get(i).getAmount() < originalStock.get(i).getAmount()) {
                currentStock.get(i).setAmount(currentStock.get(i).getAmount() + 1);
                needRefresh = true;
            } else if (currentStock.get(i).getAmount() > originalStock.get(i).getAmount()) {
                currentStock.get(i).setAmount(currentStock.get(i).getAmount() + -1);
                needRefresh = true;
            }
        }
        ArrayList<Item> additionalStockToRemove = new ArrayList<>();
        for (Item item : additionalStock) {
            item.setAmount(item.getAmount() - 1);
            if (item.getAmount() <= 0) additionalStockToRemove.add(item);
            needRefresh = true;
        }
        for (Item item : additionalStockToRemove)
            additionalStock.remove(item);
        if (needRefresh) refreshShop();
    }

    /**
     * How many items do we have in this shop?
     */
    private int getStoreSize() {
        return currentStock.size() + additionalStock.size();
    }

    /**
     * Send the items to the players interface
     */
    private void sendStore(Player player) {
        Item[] stock = new Item[currentStock.size() + additionalStock.size()];
        for (int i = 0; i < currentStock.size(); i++)
            stock[i] = currentStock.get(i);
        for (int i = 0; i < additionalStock.size(); i++)
            stock[currentStock.size() + i] = additionalStock.get(i);
        player.getPackets().sendItems(MAIN_STOCK_ITEMS_KEY, stock);
    }

    /**
     * Tell the player how much they can get for selling this
     */
    public void sendValue(Player player, int slotId) {
        if (player.getInventory().getItemsContainerSize() < slotId) return;
        Item item = player.getInventory().getItem(slotId);
        if (item == null) return;
        if (item.getDefinitions().isNoted()) item = new Item(item.getDefinitions().getCertId(), item.getAmount());
        if (item.getDefinitions().isNoted() || !ItemConstants.isTradeable(item) || item.getId() == currency) {
            player.getPackets().sendGameMessage("You can't sell this item.");
            return;
        }
        int price = PriceUtils.getPrice(item.getId());
        player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": shop will buy for: " + price + " "
                                            + ItemDefinitions.getItemDefinitions(currency).getName().toLowerCase()
                                            + ". Right-click the item to sell.");
    }

    /**
     * Examine item at clickSlot
     */
    public void sendExamine(Player player, int clickSlot) {
        int slotId = clickSlot / 6;
        if (slotId >= getStoreSize()) return;
        Item item = slotId >= currentStock.size() ? additionalStock.get(
                slotId - currentStock.size()) : currentStock.get(slotId);
        if (item == null) return;
        player.getPackets().sendGameMessage(ItemExamines.getExamine(item));
    }

    /**
     * Send info about this item to inventory tab
     */
    public void sendInfo(Player player, int clickSlot) {
        int slotId = clickSlot / 6;
        if (slotId >= getStoreSize()) return;
        Item item = slotId >= currentStock.size() ? additionalStock.get(
                slotId - currentStock.size()) : currentStock.get(slotId);
        if (item == null) return;
        player.getTemporaryAttributes().put("ShopSelectedSlot", clickSlot);
        int price = PriceUtils.getPrice(item.getId());
        player.getPackets().sendGameMessage(item.getDefinitions().getName() + ": current costs " + price + " "
                                            + ItemDefinitions.getItemDefinitions(currency).getName().toLowerCase()
                                            + ".");
        player.getInterfaceManager().sendInventoryInterface(449);
        player.getPackets().sendGlobalConfig(741, item.getId());
        player.getPackets().sendGlobalConfig(743, currency);
        player.getPackets().sendUnlockIComponentOptionSlots(449, 15, -1, 0, 0, 1, 2, 3, 4); // unlocks buy
        player.getPackets().sendGlobalConfig(744, price);
        player.getPackets().sendGlobalConfig(745, 0);
        /*
            GlobalConfig 746:
            -1=nothing
            0=Fires arrows up to [arrow type]
            1=Fires up to [bolt type]
            2=Requires at least a [bow type]
            3=Requires a [crossbow type]
            4=Requires an ogre composite bow
         */
        player.getPackets().sendGlobalConfig(746, -1);
        player.getPackets().sendConfig(176, 10);
        // player.getPackets().sendConfig(4310,5);
        player.getPackets().sendGlobalConfig(168, 98);
        player.getPackets().sendGlobalString(25, ItemExamines.getExamine(item));
        player.getPackets().sendGlobalString(34, ""); // quest id for some items
        int[] bonuses = ItemBonuses.getItemBonuses(item.getId());
        if (bonuses != null) {
            HashMap<Integer, Integer> requirements = item.getDefinitions().getWearingSkillRequirements();
            if (requirements != null && !requirements.isEmpty()) {
                String requirementText = "";
                for (int skillId : requirements.keySet()) {
                    if (skillId > 24 || skillId < 0) continue;
                    int level = requirements.get(skillId);
                    if (level < 0 || level > 120) continue;
                    boolean hasReq = player.getSkills().getLevelForXp(skillId) >= level;
                    requirementText += "<br>" + (hasReq ? "<col=00ff00>" : "<col=ff0000>") + "Level " + level + " "
                                       + Skills.SKILL_NAME[skillId];
                }
                player.getPackets().sendGlobalString(26, "<br>Worn on yourself, requiring: " + requirementText);
            } else player.getPackets().sendGlobalString(26, "<br>Worn on yourself");
            String bonusString =
                    "<br>Attack" + "<col=ffff00>" + TextUtils.formatItemBonus(bonuses[STAB_ATTACK.getId()], true)
                    + TextUtils.formatItemBonus(bonuses[SLASH_ATTACK.getId()], true)
                    + TextUtils.formatItemBonus(bonuses[CRUSH_ATTACK.getId()], true)
                    + TextUtils.formatItemBonus(bonuses[MAGIC_ATTACK.getId()], true)
                    + TextUtils.formatItemBonus(bonuses[RANGE_ATTACK.getId()], true)
                    + TextUtils.formatItemBonus(0, true) + "<br>---" + "<br>Strength" + "<br>Ranged Strength"
                    + "<br>Magic Damage" + "<br>Absorb Melee" + "<br>Absorb Magic" + "<br>Absorb Ranged"
                    + "<br>Prayer Bonus";
            player.getPackets().sendGlobalString(35, bonusString);
            player.getPackets().sendGlobalString(36,
                    "<br><br>Stab" + "<br>Slash" + "<br>Crush" + "<br>Magic" + "<br>Ranged" + "<br>Summoning");
            bonusString = "<br>Defence" + "<col=ffff00>";
            bonusString += TextUtils.formatItemBonus(bonuses[STAB_DEF.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[SLASH_DEF.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[CRUSH_DEF.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[MAGIC_DEF.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[RANGE_DEF.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[SUMMONING_DEF.getId()], true);
            bonusString += "<br>---";
            bonusString += TextUtils.formatItemBonus(bonuses[STRENGTH_BONUS.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[RANGED_STR_BONUS.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[MAGIC_DAMAGE.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[ABSORB_MELEE_BONUS.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[ABSORB_MAGIC_BONUS.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[ABSORB_RANGE_BONUS.getId()], true);
            bonusString += TextUtils.formatItemBonus(bonuses[PRAYER_BONUS.getId()], true);
            player.getPackets().sendGlobalString(52, bonusString);
        } else player.getPackets().sendGlobalString(26, "");

    }

    public String getName() {
        return shopName;
    }

    public void setName(String name) {
        shopName = name;
    }

    public ArrayList<Item> getOriginalStock() {
        return originalStock;
    }

    public boolean isGeneralStore() {
        return generalStore;
    }

    public boolean allowsSelling() {
        return allowSelling;
    }

    public void setGeneralStore(boolean isGeneralStore) {
        this.generalStore = isGeneralStore;
    }

    public void setAllowSelling(boolean allowSelling) {
        this.allowSelling = allowSelling;
    }
}
