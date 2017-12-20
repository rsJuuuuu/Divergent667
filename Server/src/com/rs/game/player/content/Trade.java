package com.rs.game.player.content;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.Player;
import com.rs.utils.game.itemUtils.PriceUtils;
import com.rs.utils.stringUtils.TextUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

import static com.rs.game.player.InterfaceManager.GameInterface.INVENTORY_OVERRIDE;

/**
 * @author Alex <lubricant@pulsescape.net>
 */
public class Trade implements Serializable {

    private static final long serialVersionUID = 4297266601674588915L;
    private final Player trader, partner;
    private TradeState currentState = TradeState.STATE_ONE;
    private ItemsContainer<Item> traderItemsOffered = new ItemsContainer<>(28, false);
    private ItemsContainer<Item> partnerItemsOffered = new ItemsContainer<>(28, false);
    private boolean traderDidAccept, partnerDidAccept;

    /**
     * Constructor
     */
    public Trade(Player trader, Player partner) {
        this.trader = trader;
        this.partner = partner;
        trader.getTemporaryAttributes().put("didRequestTrade", Boolean.FALSE);
        partner.getTemporaryAttributes().put("didRequestTrade", Boolean.FALSE);
        trader.setCloseInterfacesEvent(this::tradeFailed);
        partner.setCloseInterfacesEvent(this::tradeFailed);
    }

    public void start() {
        if (trader.getLocation().getX() == partner.getLocation().getX()
            && trader.getLocation().getY() == partner.getLocation().getY()) {
            trader.sendMessage("Cant trade in this position");
            trader.getTrade().endSession();
            partner.sendMessage("Cant trade in this position");
            partner.getTrade().endSession();
            return;
        }
        openFirstTradeScreen(trader);
        openFirstTradeScreen(partner);

        //Make sure the interfaces are open before we start updating
        CoresManager.fastExecutor.schedule(new TimerTask() {
            @Override
            public void run() {
                refreshScreen();
            }
        }, 100);
    }

    /**
     * @return partner
     */
    public Player getPartner() {
        return partner;
    }

    /**
     * Opens first screen
     *
     * @param p
     */
    private void openFirstTradeScreen(Player p) {
        sendOptions(p);
        p.getInterfaceManager().sendInterface(335);
        p.getInterfaceManager().sendInventoryInterface(336);
        p.getPackets().sendIComponentText(335, 37, "");
        String name = p.equals(trader) ? partner.getUsername() : trader.getUsername();
        p.getPackets().sendIComponentText(335, 15, "Trading with: " + TextUtils.formatPlayerNameForDisplay(name));
        if (trader.getLocation().getX() == partner.getLocation().getX()
            && trader.getLocation().getY() == partner.getLocation().getY()) {
            trader.sendMessage("Cant trade in this position");
            trader.getTrade().endSession();
            partner.sendMessage("Cant trade in this position");
            partner.getTrade().endSession();
        }
    }

    /**
     * Opens second screen
     *
     * @param p
     */
    private void openSecondTradeScreen(Player p) {
        currentState = TradeState.STATE_TWO;
        partnerDidAccept = false;
        traderDidAccept = false;
        p.getInterfaceManager().sendInterface(334);
        p.getPackets().sendIComponentText(334, 54, (TextUtils.formatPlayerNameForDisplay(p.equals(trader) ? partner
                .getUsername() : trader.getUsername())));
        p.getPackets().sendIComponentText(334, 34, "Are you sure you want to make this trade?");
        if (trader.getLocation().getX() == partner.getLocation().getX()
            && trader.getLocation().getY() == partner.getLocation().getY()) {
            trader.sendMessage("Cant trade in this position");
            trader.getTrade().endSession();
            partner.sendMessage("Cant trade in this position");
            partner.getTrade().endSession();
        }
    }

    /**
     * Add's item to inter.
     */
    public void addItem(Player player, int slot, int amount) {
        if (currentState == TradeState.STATE_ONE) {

            Item item = player.getInventory().getItem(slot);
            if (item == null) return;
            if (!ItemConstants.isTradeable(item)) {
                player.getPackets().sendGameMessage("That item isn't tradeable.");
                return;
            }
            Item itemsBefore[] = getOffer(player).getItemsCopy();
            int maxAmount = player.getInventory().getItems().getNumberOf(item);
            if (amount < maxAmount) item = new Item(item.getId(), amount);
            else item = new Item(item.getId(), maxAmount);
            getOffer(player).add(item);
            player.getInventory().deleteItem(slot, item);
            refreshItems(player, itemsBefore);
            resetAccept();
        }
    }

    /**
     * saves Logs
     */
    @SuppressWarnings("unused")
    private void saveLog(final Player player, final int i) {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("tradelog.txt", true));
            bf.write("[" + DateFormat.getDateTimeInstance().format(new Date()) + " "
                     + Calendar.getInstance().getTimeZone().getDisplayName() + "] " + player.getUsername() + ": "
                     + partnerItemsOffered);
            bf.newLine();
            bf.flush();
            bf.close();
        } catch (IOException ignored) {
        }
    }

    /**
     * getOffer for items.
     */
    private ItemsContainer<Item> getOffer(Player p) {
        return p != partner ? traderItemsOffered : partnerItemsOffered;
    }

    /**
     * Gets other offer
     */
    private Player getOther(Player other) {
        return other != partner ? partner : other;
    }

    /**
     * Removes Item from interface
     */
    public void removeItem(Player player, int slotId, int amount) {
        if (currentState != TradeState.STATE_TWO) {
            Item item = getOffer(player).get(slotId);
            if (item == null) return;
            Item itemsBefore[] = getOffer(player).getItemsCopy();
            int maxAmount = getOffer(player).getNumberOf(item);
            if (amount < maxAmount) item = new Item(item.getId(), amount);
            else item = new Item(item.getId(), maxAmount);
            getOffer(player).remove(slotId, item);
            player.getInventory().addItem(item);
            refreshItems(player, itemsBefore);
            tradeIcons(getOther(player), slotId);
            resetAccept();
        }
    }

    /**
     * refreshes items on inter
     */
    private void refreshItems(Player player, Item itemsBefore[]) {
        int changedSlots[] = new int[itemsBefore.length];
        int count = 0;
        for (int index = 0; index < itemsBefore.length; index++) {
            Item item = getOffer(player).getItems()[index];
            if (itemsBefore[index] != item) changedSlots[count++] = index;
        }
        int finalChangedSlots[] = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        refreshScreen();
    }

    /**
     * Refreshes screen
     */
    private void refreshScreen() {
        trader.getPackets().sendItems(90, false, traderItemsOffered);
        trader.getPackets().sendItems(90, true, partnerItemsOffered);
        partner.getPackets().sendItems(90, false, partnerItemsOffered);
        partner.getPackets().sendItems(90, true, traderItemsOffered);
        String name = trader.getUsername();
        partner.getPackets().sendIComponentText(335, 22, TextUtils.formatPlayerNameForDisplay(name));
        String name1 = partner.getUsername();
        trader.getPackets().sendIComponentText(335, 22, TextUtils.formatPlayerNameForDisplay(name1));
        trader.getPackets().sendIComponentText(335, 21,
                " has " + partner.getInventory().getFreeSlots() + " free inventory slots.");
        partner.getPackets().sendIComponentText(335, 21,
                " has " + trader.getInventory().getFreeSlots() + " free inventory slots.");
        trader.getPackets().sendGlobalConfig(729, getTradersItemsValue());
        trader.getPackets().sendGlobalConfig(697, getPartnersItemsValue());
        partner.getPackets().sendGlobalConfig(729, getPartnersItemsValue());
        partner.getPackets().sendGlobalConfig(697, getTradersItemsValue());
    }

    /**
     * Gets trade value
     *
     * @return returns initial price
     */
    private int getTradersItemsValue() {
        int initialPrice = 0;
        for (Item item : traderItemsOffered.toArray()) {
            if (item != null) {
                initialPrice += PriceUtils.getPrice(item.getId()) * item.getAmount();
            }
        }
        return initialPrice;
    }

    /**
     * gets Value of partner
     *
     * @return regular price
     */
    private int getPartnersItemsValue() {
        int initialPrice = 0;
        for (Item item : partnerItemsOffered.toArray()) {
            if (item != null) {
                initialPrice += PriceUtils.getPrice(item.getId()) * item.getAmount();
            }
        }
        return initialPrice;
    }

    /**
     * Sets accepted pressed.
     */
    public void acceptPressed(Player pl) {
        if (!traderDidAccept && pl.equals(trader)) {
            traderDidAccept = true;
        } else if (!partnerDidAccept && pl.equals(partner)) {
            partnerDidAccept = true;
        }
        switch (currentState) {
            case STATE_ONE:
                if (pl.equals(trader)) {
                    if (partnerDidAccept && traderDidAccept) {
                        if (!trader.getInventory().getItems().hasSpaceFor(partnerItemsOffered)) {
                            partner.getPackets().sendGameMessage(
                                    "Other player does not have enough space in their " + "inventory.");
                            trader.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                            tradeFailed();
                            return;
                        } else if (!partner.getInventory().getItems().hasSpaceFor(traderItemsOffered)) {
                            trader.getPackets().sendGameMessage(
                                    "Other player does not have enough space in their " + "inventory.");
                            partner.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                            tradeFailed();
                            return;
                        } else if (partner.getInventory().getItems().goesOverAmount(traderItemsOffered)) {
                            partner.getPackets().sendGameMessage("You'll go over max of an item!");
                            trader.getPackets().sendGameMessage("They'll go over max of an item!");
                            tradeFailed();
                            return;
                        } else if (trader.getInventory().getItems().goesOverAmount(partnerItemsOffered)) {
                            trader.getPackets().sendGameMessage("You'll go over max of an item!");
                            partner.getPackets().sendGameMessage("They'll go over max of an item!");
                            tradeFailed();
                            return;
                        }
                        openSecondTradeScreen(trader);
                        openSecondTradeScreen(partner);
                    } else {
                        trader.getPackets().sendIComponentText(335, 37, "Waiting for other player...");
                        partner.getPackets().sendIComponentText(335, 37, "Other player has accepted");
                    }
                } else if (pl.equals(partner)) {
                    if (partnerDidAccept && traderDidAccept) {
                        if (!trader.getInventory().getItems().hasSpaceFor(partnerItemsOffered)) {
                            partner.getPackets().sendGameMessage(
                                    "Other player does not have enough space in their " + "inventory.");
                            trader.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                            tradeFailed();
                            return;
                        } else if (!partner.getInventory().getItems().hasSpaceFor(traderItemsOffered)) {
                            trader.getPackets().sendGameMessage(
                                    "Other player does not have enough space in their " + "inventory.");
                            partner.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                            tradeFailed();
                            return;
                        } else if (partner.getInventory().getItems().goesOverAmount(traderItemsOffered)) {
                            partner.getPackets().sendGameMessage("You'll go over max of an item!");
                            trader.getPackets().sendGameMessage("They'll go over max of an item!");
                            tradeFailed();
                            return;
                        } else if (trader.getInventory().getItems().goesOverAmount(partnerItemsOffered)) {
                            trader.getPackets().sendGameMessage("You'll go over max of an item!");
                            partner.getPackets().sendGameMessage("They'll go over max of an item!");
                            tradeFailed();
                            return;
                        }
                        openSecondTradeScreen(trader);
                        openSecondTradeScreen(partner);
                    } else {
                        partner.getPackets().sendIComponentText(335, 37, "Waiting for other player...");
                        trader.getPackets().sendIComponentText(335, 37, "Other player has accepted");
                    }
                }
                break;

            case STATE_TWO:
                if (pl.equals(trader)) {
                    if (partnerDidAccept && traderDidAccept) {
                        giveItems();
                    } else {
                        trader.getPackets().sendIComponentText(334, 34, "Waiting for other player...");
                        partner.getPackets().sendIComponentText(334, 34, "Other player has accepted");
                    }
                } else if (pl.equals(partner)) {
                    if (partnerDidAccept && traderDidAccept) {
                        giveItems();
                    } else {
                        partner.getPackets().sendIComponentText(334, 34, "Waiting for other player...");
                        trader.getPackets().sendIComponentText(334, 34, "Other player has accepted");
                    }
                }
                break;
        }

    }

    /**
     * Ends Session of trade
     */
    public void endSession() {
        trader.getInterfaceManager().closeScreenInterface();
        trader.getInterfaceManager().closeInterfaces(INVENTORY_OVERRIDE);
        partner.getInterfaceManager().closeScreenInterface();
        partner.getInterfaceManager().closeInterfaces(INVENTORY_OVERRIDE);
        traderItemsOffered = null;
        partnerItemsOffered = null;
        trader.setCloseInterfacesEvent(null);
        partner.setCloseInterfacesEvent(null);
        trader.setTrade(null);
        partner.setTrade(null);
        trader.getInventory().refresh();
        partner.getInventory().refresh();

    }

    /**
     * WHat happens when tradeFailed
     */
    public void tradeFailed() {
        trader.getInventory().getItems().addAll(traderItemsOffered);
        partner.getInventory().getItems().addAll(partnerItemsOffered);
        partner.getPackets().sendGameMessage("<col=FFF0000>Other player declined trade!</col>");
        traderItemsOffered = null;
        partnerItemsOffered = null;
        trader.setCloseInterfacesEvent(null);
        partner.setCloseInterfacesEvent(null);
        trader.getInterfaceManager().closeInterfaces(INVENTORY_OVERRIDE);
        partner.getInterfaceManager().closeInterfaces(INVENTORY_OVERRIDE);
        trader.setTrade(null);
        partner.setTrade(null);
        endSession();
        trader.getInventory().refresh(trader.getInventory().getItems());
        partner.getInventory().refresh(partner.getInventory().getItems());
    }

    /**
     * Gives items to partner / other
     */
    private void giveItems() {
        try {
            if (!trader.getInventory().getItems().hasSpaceFor(partnerItemsOffered)) {
                partner.getPackets().sendGameMessage("Other player does not have enough space in their inventory.");
                trader.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                tradeFailed();
                return;
            } else if (!partner.getInventory().getItems().hasSpaceFor(traderItemsOffered)) {
                trader.getPackets().sendGameMessage("Other player does not have enough space in their inventory.");
                partner.getPackets().sendGameMessage("You do not have enough space in your inventory.");
                tradeFailed();
                return;
            }
            for (Item itemAtIndex : traderItemsOffered.toArray()) {
                if (itemAtIndex != null) {
                    partner.getInventory().addItem(itemAtIndex.getId(), itemAtIndex.getAmount());
                }
            }
            for (Item itemAtIndex : partnerItemsOffered.toArray()) {
                if (itemAtIndex != null) {
                    trader.getInventory().addItem(itemAtIndex.getId(), itemAtIndex.getAmount());
                }
            }
            endSession();
            partner.getInventory().refresh();
            partner.sendMessage("Accepted trade.");
            trader.getInventory().refresh();
            trader.sendMessage("Accepted trade.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public enum TradeState {
        STATE_ONE,
        STATE_TWO
    }

    /**
     * resets the accept trade.
     */
    private void resetAccept() {
        partnerDidAccept = traderDidAccept = false;
        switch (currentState) {
            case STATE_ONE:
                partner.getPackets().sendIComponentText(335, 37, "");
                trader.getPackets().sendIComponentText(335, 37, "");
                break;
            case STATE_TWO:
                partner.getPackets().sendIComponentText(334, 34, "");
                trader.getPackets().sendIComponentText(334, 34, "");
                break;
        }
    }

    /**
     * Gets the state of trade
     *
     * @return state
     */
    public TradeState getState() {
        return currentState;
    }

    /**
     * Shows trade icons (IE the red exclamation)
     */
    private static void tradeIcons(Player player, int slot) {
        Object[] tparams4 = new Object[]{slot, 7, 4, 21954593};
        player.getPackets().sendRunScript(143, tparams4);
    }

    /**
     * Sends Options
     */
    public static void sendOptions(Player p) {
        Object[] tparams1 = new Object[]{"", "", "", "Value<col=FF9040>", "Remove-X", "Remove-All", "Remove-10",
                "Remove-5", "Remove", -1, 0, 7, 4, 90,
                335 << 16 | 31};
        p.getPackets().sendRunScript(150, tparams1);
        p.getPackets().sendIComponentSettings(335, 31, 0, 27, 1150); // Access
        Object[] tparams3 = new Object[]{"", "", "", "", "", "", "", "", "Value<col=FF9040>", -1, 0, 7, 4, 90,
                335 << 16 | 34};
        p.getPackets().sendRunScript(695, tparams3);
        p.getPackets().sendIComponentSettings(335, 34, 0, 27, 1026); // Access
        Object[] tparams2 = new Object[]{"", "", "Lend", "Value<col=FF9040>", "Offer-X", "Offer-All", "Offer-10",
                "Offer-5", "Offer", -1, 0, 7, 4, 93,
                336 << 16};
        p.getPackets().sendRunScript(150, tparams2);
        p.getPackets().sendIComponentSettings(336, 0, 0, 27, 1278); // Access
        // refreshScreen();

    }

    /**
     * Attempt to start a trade between these two players
     */
    public static void attemptTrade(Player player, Player other) {
        if (player.getSkills().getTotalLevel() < Settings.MINIMUN_TRADE_TOTAL) {
            player.sendMessage("You both must have a total level of <col=ff0000>" + Settings.MINIMUN_TRADE_TOTAL
                               + "</col> to trade!");
            return;
        }
        if (player.getTrade() != null) {
            player.getPackets().sendGameMessage("You are already in a trade!");
            return;
        } else if (other.getTrade() != null) {
            player.sendMessage("The other player is busy.");
            return;
        }
        if (player.getLocation().getX() == other.getLocation().getX()
            && player.getLocation().getY() == other.getLocation().getY()) {
            player.sendMessage("Cant trade in this position");
            other.sendMessage("Cant trade in this position");
            return;
        }
        if (other.getTemporaryAttributes().get("didRequestTrade") == Boolean.TRUE
            && (Integer) other.getTemporaryAttributes().get("tradeWithIndex") == player.getIndex()) {
            Trade session = new Trade(player, other);
            player.setTrade(session);
            other.setTrade(session);
            session.start();
            if (player.getLocation().getX() == other.getLocation().getX()
                && player.getLocation().getY() == other.getLocation().getY()) {
                player.sendMessage("Cant trade in this position");
                player.getTrade().endSession();

            }
        } else {
            if (other.getSkills().getTotalLevel() < Settings.MINIMUN_TRADE_TOTAL) {
                player.sendMessage(
                        "You both must have a total level of " + Settings.MINIMUN_TRADE_TOTAL + " to trade!");
                return;
            }
            if (player.getLocation().getX() == other.getLocation().getX()
                && player.getLocation().getY() == other.getLocation().getY()) {
                player.sendMessage("Cant trade in this position");
                return;
            }
            player.getPackets().sendGameMessage("Sending trade request...");
            other.getPackets().sendTradeRequestMessage(player);
            player.getTemporaryAttributes().put("didRequestTrade", Boolean.TRUE);
            player.getTemporaryAttributes().put("tradeWithIndex", other.getIndex());
            player.stopAll(false);

        }
    }
}