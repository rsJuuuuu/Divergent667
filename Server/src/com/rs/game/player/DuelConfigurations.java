package com.rs.game.player;

import com.rs.game.world.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.item.ItemConstants;
import com.rs.game.item.ItemsContainer;
import com.rs.game.actionHandling.Handler;
import com.rs.game.actionHandling.handlers.InterfaceHandler;
import com.rs.utils.Utils;
import com.rs.utils.stringUtils.TextUtils;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;
import static com.rs.game.actionHandling.HandlerManager.registerInterfaceAction;

/**
 * @author Raghav/Own4g3 <Raghav_ftw@hotmail.com>
 */
public class DuelConfigurations implements Handler {

    /**
     * Player and his opponent.
     */
    public Player player, target;

    /**
     * Boolean array for duel rules.
     */
    private transient boolean[] duelRules = new boolean[26];

    /**
     * Duel arena lobby location.
     */
    private WorldTile DUEL_ARENA_LOBBY = new WorldTile(3365, 3275, 0);

    /**
     * Player's stake.
     */
    private ItemsContainer<Item> stake = new ItemsContainer<>(28, false);

    /**
     * Target's stake.
     */
    private ItemsContainer<Item> stake2 = new ItemsContainer<>(28, false);

    /**
     * Constructs a new instance.
     *
     * @param player     the player.
     * @param target     the opponent.
     * @param ifFriendly {@code true} if the duel is friendly, {@code false} the duel
     *                   is stake.
     */
    public DuelConfigurations(final Player player, final Player target, boolean ifFriendly) {
        this.target = target;
        this.player = player;
        updateScreen(player, ifFriendly);
        updateScreen(target, ifFriendly);
        player.setCloseInterfacesEvent(() -> declineDuel(player));
        target.setCloseInterfacesEvent(() -> declineDuel(target));
    }

    /**
     * This is for the script, don't delete
     */
    @SuppressWarnings("unused")
    public DuelConfigurations() {
    }

    /**
     * Sending inventory and duel interface.
     *
     * @param player     the player
     * @param ifFriendly {@code true} if the duel is friendly, {@code false} duel is
     *                   stake
     */
    private void updateScreen(Player player, boolean ifFriendly) {
        if (!ifFriendly) {
            sendInventory(player);
            stake.clear();
            stake2.clear();
        }
        player.getPackets().sendItems(134, false, stake);
        player.getPackets().sendItems(134, true, stake2);
        player.getPackets().sendItems(94, false, player.getInventory().getItems());
        player.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 16 : 38,
                " " + TextUtils.formatPlayerNameForDisplay(getOther(player).getUsername()));
        player.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 18 : 40,
                "" + (getOther(player).getSkills().getCombatLevel()));
        player.getPackets().sendConfig(286, 0);
        player.getTemporaryAttributes().put("firstScreen", true);
        player.getInterfaceManager().sendInterface(ifFriendly ? 637 : 631);
    }

    /**
     * Ending of duel.
     *
     * @param player   The player whoes duel is going to end.
     * @param declined {@code true} if it's declined, {@code false} if not.
     * @param logout   {@code true} if logged out, {@code false} if not.
     */
    public void endDuel(Player player, boolean declined, boolean logout) {
        for (int i = 0; i < duelRules.length; i++) {
            duelRules[i] = false;
        }
        if (!declined) {
            if (logout) player.setLocation(DUEL_ARENA_LOBBY);
            else player.setNextWorldTile(DUEL_ARENA_LOBBY);
        } else {
            this.player.getInventory().getItems().addAll(stake);
            target.getInventory().getItems().addAll(stake2);
            player.closeInterfaces();
        }
        stake.clear();
        stake2.clear();
        player.setCanPvp(false);
        player.getControllerManager().removeControllerWithoutCheck();
        player.getHintIconsManager().removeUnsavedHintIcon();
        player.reset();
        player.closeInterfaces();
        player.getInventory().init();
    }

    /**
     * Sending inventory options.
     *
     * @param player The player to whom options are going to send.
     */
    private void sendInventory(Player player) {
        player.getInterfaceManager().sendInventoryInterface(628);
        player.getPackets().sendItems(93, player.getInventory().getItems());
        player.getPackets().sendUnlockIComponentOptionSlots(628, 0, 0, 27, 0, 1, 2, 3, 4, 5);
        player.getPackets().sendInterSetItemsOptionsScript(628, 0, 93, 4, 7, "Stake 1", "Stake 5", "Stake 10",
                "Stake" + " All", "Examine");
        player.getPackets().sendUnlockIComponentOptionSlots(631, 103, 0, 27, 0, 1, 2, 3, 4, 5);
        player.getPackets().sendInterSetItemsOptionsScript(631, 0, 134, 4, 7, "Remove 1", "Remove 5", "Remove 10",
                "Remove All", "Examine");

    }

    @Override
    public void register() {
        registerInterfaceAction(CLICK_GLOBAL, (player1, componentId, slotId, slotId2, buttonId, interfaceId) -> {
            processButtonClick(player1, interfaceId, buttonId, slotId, buttonId);
            return DEFAULT;
        });
    }

    /**
     * Handling of duelarena interface buttons.
     *
     * @param player      The player.
     * @param interfaceId The interface id.
     * @param componentId The button id.
     * @param slotId      The slotId.
     * @param buttonId    Action button pressed
     * @return {@code True} if it isn't handled, {@code false} if it is.
     */
    public boolean processButtonClick(Player player, int interfaceId, int componentId, int slotId, int buttonId) {
        if (!player.isDueling()) {
            return false;
        }
        switch (interfaceId) {
            case 631:
                switch (componentId) {
                    case 55: // no range
                        setRules(0);
                        return false;
                    case 56: // no melee
                        setRules(1);
                        return false;
                    case 57: // no magic
                        setRules(2);
                        return false;
                    case 58: // fun wep
                        setRules(8);
                        return false;
                    case 59: // no forfiet
                        setRules(7);
                        return false;
                    case 60: // no drinks
                        setRules(3);
                        return false;
                    case 61: // no food
                        setRules(4);
                        return false;
                    case 62: // no prayer
                        setRules(5);
                        return false;
                    case 63: // no movement
                        setRules(25);
                        if (getRule(6)) {
                            setRule(6, false);
                            player.getPackets().sendGameMessage("You can't have movement without obstacles.");
                        }
                        return false;
                    case 64: // obstacles
                        setRules(6);
                        if (getRule(25)) {
                            setRule(25, false);
                            player.getPackets().sendGameMessage("You can't have obstacles without movement.");
                        }
                        return false;
                    case 65: // enable summoning
                        setRules(24);
                        return false;
                    case 66:// no spec
                        setRules(9);
                        return false;
                    case 21:// no helm
                        setRules(10);
                        return false;
                    case 22:// no cape
                        setRules(11);
                        return false;
                    case 23:// no ammy
                        setRules(12);
                        return false;
                    case 31:// arrows
                        setRules(23);
                        return false;
                    case 24:// weapon
                        setRules(13);
                        return false;
                    case 25:// body
                        setRules(14);
                        return false;
                    case 26:// shield
                        setRules(15);
                        return false;
                    case 27:// legs
                        setRules(17);
                        return false;
                    case 28:// ring
                        setRules(19);
                        return false;
                    case 29: // bots
                        setRules(20);
                        return false;
                    case 30: // gloves
                        setRules(22);
                        return false;
                    case 107:
                        declineDuel(player);
                        return false;
                    case 46:
                        handleAccept(player, false);
                        return false;
                }
                switch (buttonId) {
                    case CLICK_1:
                        removeStake(player, slotId, 1);
                        return false;
                    case CLICK_2:
                        removeStake(player, slotId, 5);
                        return false;
                    case CLICK_3:
                        removeStake(player, slotId, 10);
                        return false;
                    case CLICK_4:
                        Item item = player.getInventory().getItems().get(slotId);
                        if (item == null) return false;
                        removeStake(player, slotId, player.getInventory().getItems().getNumberOf(item));
                        return false;
                    case CLICK_5:
                        player.getInventory().sendExamine(slotId);
                        return false;
                }
            case 628:
                switch (buttonId) {
                    case CLICK_1:
                        offerStake(player, slotId, 1);
                        return false;
                    case CLICK_2:
                        offerStake(player, slotId, 5);
                        return false;
                    case CLICK_3:
                        offerStake(player, slotId, 10);
                        return false;
                    case CLICK_4:
                        Item item = player.getInventory().getItems().get(slotId);
                        if (item == null) return false;
                        offerStake(player, slotId, player.getInventory().getItems().getNumberOf(item));
                        return false;
                    case CLICK_5:
                        player.getInventory().sendExamine(slotId);
                        return false;
                }
            case 626:
                switch (componentId) {
                    case 43:
                        handleSecondScreenAccept(player, false);
                        return false;
                }
            case 637: // friendly
                switch (componentId) {
                    case 25: // no range
                        setRules(0);
                        return false;
                    case 26: // no melee
                        setRules(1);
                        return false;
                    case 27: // no magic
                        setRules(2);
                        return false;
                    case 28: // fun wep
                        setRules(8);
                        return false;
                    case 29: // no forfiet
                        setRules(7);
                        return false;
                    case 30: // no drinks
                        setRules(3);
                        return false;
                    case 31: // no food
                        setRules(4);
                        return false;
                    case 32: // no prayer
                        setRules(5);
                        return false;
                    case 33: // no movement
                        setRules(25);
                        if (getRule(6)) {
                            setRule(6, false);
                            player.getPackets().sendGameMessage("You can't have movement without obstacles.");
                        }
                        return false;
                    case 34: // obstacles
                        setRules(6);
                        if (getRule(25)) {
                            setRule(25, false);
                            player.getPackets().sendGameMessage("You can't have obstacles without movement.");
                        }
                        return false;
                    case 35: // enable summoning
                        setRules(24);
                        return false;
                    case 36:// no spec
                        setRules(9);
                        return false;
                    case 43:// no helm
                        setRules(10);
                        return false;
                    case 44:// no cape
                        setRules(11);
                        return false;
                    case 45:// no ammy
                        setRules(12);
                        return false;
                    case 53:// arrows
                        setRules(23);
                        return false;
                    case 46:// weapon
                        setRules(13);
                        return false;
                    case 47:// body
                        setRules(14);
                        return false;
                    case 48:// shield
                        setRules(15);
                        return false;
                    case 49:// legs
                        setRules(17);
                        return false;
                    case 50:// ring
                        setRules(19);
                        return false;
                    case 51: // bots
                        setRules(20);
                        return false;
                    case 52: // gloves
                        setRules(22);
                        return false;
                    case 86:
                        declineDuel(player);
                        return false;
                    case 21:
                        handleAccept(player, true);
                        return false;
                }
            case 639:
                switch (componentId) {
                    case 25:
                        handleSecondScreenAccept(player, true);
                        return false;
                }
        }
        return true;
    }

    /**
     * Declining of duel.
     *
     * @param player The player who declined the duel.
     */
    private void declineDuel(Player player) {
        Player other = getOther(player);
        other.setCloseInterfacesEvent(null);
        player.setCloseInterfacesEvent(null);
        player.getPackets().sendGameMessage("You've declined the duel.");
        other.getPackets().sendGameMessage("Other player has declined the duel.");
        endDuel(player, true, false);
        endDuel(other, true, false);
        player.getControllerManager().startController("DuelController");
        other.getControllerManager().startController("DuelController");
    }

    /**
     * Accepting of the duel.
     *
     * @param player     The player who's accepting the duel.
     * @param ifFriendly {@code true} if the duel is friendly, {@code false} the duel
     *                   is stake.
     */
    private void handleAccept(final Player player, boolean ifFriendly) {
        if (canAccept(player)) {
            Player other = getOther(player);
            player.getTemporaryAttributes().put("accepted", true);
            other.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 20 : 41,
                    "Other player has " + "accepted.");
            player.getPackets().sendIComponentText(ifFriendly ? 637 : 631, ifFriendly ? 20 : 41,
                    "Waiting for other " + "player...");
            if (other.getTemporaryAttributes().get("accepted") != null) {
                player.setCloseInterfacesEvent(null);
                other.setCloseInterfacesEvent(null);
                player.getTemporaryAttributes().put("accepted", false);
                other.getTemporaryAttributes().put("accepted", false);
                player.getTemporaryAttributes().remove("firstScreen");
                other.getTemporaryAttributes().remove("firstScreen");
                openSecondInterface(player, other, ifFriendly);
                openSecondInterface(other, player, ifFriendly);
                if (stake.getFreeSlot() != 0) {
                    player.getPackets().sendIComponentText(626, 25, "");
                    other.getPackets().sendIComponentText(626, 26, "");
                }
                if (stake2.getFreeSlot() != 0) {
                    player.getPackets().sendIComponentText(626, 26, "");
                    other.getPackets().sendIComponentText(626, 25, "");
                }
            }
        }
    }

    /**
     * Accepting the second screen of the duel.
     *
     * @param player     The player who's accepting.
     * @param ifFriendly {@code true} if the duel is friendly, {@code false} the duel
     *                   is stake.
     */
    private void handleSecondScreenAccept(final Player player, boolean ifFriendly) {
        final Player other = getOther(player);
        player.getTemporaryAttributes().put("accepted", true);
        other.getPackets().sendIComponentText(ifFriendly ? 639 : 626, ifFriendly ? 23 : 35,
                "Other player has " + "accepted.");
        player.getPackets().sendIComponentText(ifFriendly ? 639 : 626, ifFriendly ? 23 : 35,
                "Waiting for other " + "player...");
        if (other.getTemporaryAttributes().get("accepted") == Boolean.TRUE) {
            player.setCloseInterfacesEvent(null);
            other.setCloseInterfacesEvent(null);
            player.getTemporaryAttributes().put("accepted", false);
            other.getTemporaryAttributes().put("accepted", false);
            removeEquipment(player);
            removeEquipment(other);
            teleportPlayer(player, other);
        }
    }

    /**
     * Teleporting the players to duel arena.
     *
     * @param player The player.
     * @param other  The opponent.
     */
    private void teleportPlayer(Player player, Player other) {
        WorldTile[] teleports = getArenaTeleport();
        int random = Utils.getRandom(1);
        player.setNextWorldTile(random == 0 ? teleports[0] : teleports[1]);
        other.setNextWorldTile(random == 0 ? teleports[1] : teleports[0]);
        player.getControllerManager().startController("Duelarena");
        other.getControllerManager().startController("Duelarena");
    }

    /**
     * Removing player's equipment on accept.
     *
     * @param player The player who's equipment is going to be removed.
     */
    private void removeEquipment(Player player) {
        int slot = 0;
        for (int i = 10; i < 24; i++) {
            if (getRule(i)) {
                slot = i - 10;
                InterfaceHandler.sendRemove(player, slot);
            }
        }
    }

    /**
     * Gets the teleport location.
     *
     * @return location.
     */
    private WorldTile[] getArenaTeleport() {
        final int arenaChoice = Utils.getRandom(2);
        WorldTile[] locations = new WorldTile[2];
        int[] arenaBoundariesX = {3337, 3367, 3336};
        int[] arenaBoundariesY = {3246, 3227, 3208};
        int[] maxOffsetX = {14, 14, 16};
        int[] maxOffsetY = {10, 10, 10};
        int finalX = arenaBoundariesX[arenaChoice] + Utils.getRandom(maxOffsetX[arenaChoice]);
        int finalY = arenaBoundariesY[arenaChoice] + Utils.getRandom(maxOffsetY[arenaChoice]);
        locations[0] = (new WorldTile(finalX, finalY, 0));
        if (getRule(25)) {
            int direction = Utils.getRandom(1);
            if (direction == 0) {
                finalX--;
            } else {
                finalY++;
            }
        } else {
            finalX = arenaBoundariesX[arenaChoice] + Utils.getRandom(maxOffsetX[arenaChoice]);
            finalY = arenaBoundariesY[arenaChoice] + Utils.getRandom(maxOffsetY[arenaChoice]);
        }
        locations[1] = (new WorldTile(finalX, finalY, 0));
        return locations;
    }

    /**
     * Checks if the player can accept the duel.
     *
     * @param player The player.
     * @return {@code True} if so, {@code false} if not.
     */
    private boolean canAccept(Player player) {
        if (getRule(0) && getRule(1) && getRule(2)) {
            player.getPackets().sendGameMessage("You have to be able to use atleast one combat style in a duel.", true);
            return false;
        }
        int count = 0;
        Item item;
        for (int i = 10; i < 24; i++) {
            int slot = i - 10;
            if (getRule(i) && (item = player.getEquipment().getItem(slot)) != null) {
                if (i == 23) {// arrows
                    if (!(item.getDefinitions().isStackable() && player.getInventory().getItems().containsOne(item)))
                        count++;
                } else {
                    count++;
                }
            }
        }
        int freeSlots = player.getInventory().getItems().freeSlots() - count;
        if (freeSlots < 0) {
            player.getPackets().sendGameMessage("You do not have enough inventory space to remove all the equipment.");
            getOther(player).getPackets().sendGameMessage(
                    "Your opponent does not have enough space to remove all " + "the" + " equipment.");
            return false;
        }
        for (int i = 0; i < stake.getSize() + stake2.getSize(); i++) {
            if (stake.get(i) != null && stake2.get(i) != null) {
                freeSlots--;
            }
        }
        if (freeSlots < 0) {
            player.getPackets().sendGameMessage("You do not have enough room in your inventory for this stake.");
            getOther(player).getPackets().sendGameMessage(
                    "Your opponent does not have enough room in his inventory " + "for this stake.");
            return false;
        }
        return true;
    }

    /**
     * Sending second screen.
     *
     * @param player     The player.
     * @param other      The opponent.
     * @param ifFriendly {@code true} if the duel is friendly, {@code false} the duel
     *                   is stake.
     */
    private void openSecondInterface(Player player, Player other, boolean ifFriendly) {
        other.getInterfaceManager().sendInterface(ifFriendly ? 639 : 626);
        player.getInterfaceManager().sendInterface(ifFriendly ? 639 : 626);
    }

    /**
     * Setting a rule.
     *
     * @param ruleId The rule id to set.
     */
    private void setRules(int ruleId) {
        if (!getRule(ruleId)) {
            setRule(ruleId, true);
        } else if (getRule(ruleId)) {
            setRule(ruleId, false);
        }
        player.getTemporaryAttributes().remove("accepted");
        target.getTemporaryAttributes().remove("accepted");
        setConfigs();
    }

    /**
     * Setting of configs.
     */
    private void setConfigs() {
        int value = 0;
        int ruleId = 16;
        for (int i = 0; i < duelRules.length; i++) {
            if (getRule(i)) {
                if (i == 7) // forfiet
                    value += 5;
                if (i == 25) // no movement
                    value += 6;
                value += ruleId;
            }
            ruleId += ruleId;
        }
        player.getPackets().sendConfig(286, value);
        target.getPackets().sendConfig(286, value);
    }

    /**
     * Offering the stake.
     *
     * @param p      The player who's offering.
     * @param slot   The slot.
     * @param amount The amount to be offerd.
     */
    private void offerStake(Player p, int slot, int amount) {
        Item item = p.getInventory().getItem(slot);
        if (item == null) return;
        if (!ItemConstants.isTradeable(item)) {
            p.getPackets().sendGameMessage("That item isn't stakeable.");
            return;
        }
        player.getTemporaryAttributes().remove("accepted");
        target.getTemporaryAttributes().remove("accepted");
        Item[] itemsBefore = getStake(p).getItemsCopy();
        int maxAmount = p.getInventory().getItems().getNumberOf(item);
        int trueAmount = amount > maxAmount ? maxAmount : amount;
        if (item.getAmount() < amount) amount = item.getAmount();
        item = new Item(item.getId(), trueAmount);
        getStake(p).add(item);
        p.getInventory().deleteItem(slot, item);
        refreshItems(p, itemsBefore);
    }

    /**
     * Removing the stake.
     *
     * @param p           The player who's removing.
     * @param clickSlotId The clicked slot id.
     * @param amount      The amount to be removed.
     */
    private void removeStake(Player p, int clickSlotId, int amount) {
        Item item = getStake(p).get(clickSlotId);
        if (item == null) return;
        player.getTemporaryAttributes().remove("accepted");
        target.getTemporaryAttributes().remove("accepted");
        Item[] itemsBefore = getStake(p).getItemsCopy();
        int maxAmount = getStake(p).getNumberOf(item);
        if (amount < maxAmount) item = new Item(item.getId(), amount);
        else item = new Item(item.getId(), maxAmount);
        getStake(p).remove(clickSlotId, item);
        p.getInventory().addItem(item);
        refreshItems(p, itemsBefore);
    }

    private void refreshItems(Player p, Item[] itemsBefore) {
        int[] changedSlots = new int[itemsBefore.length];
        int count = 0;
        for (int index = 0; index < itemsBefore.length; index++) {
            Item item = getStake(p).getItems()[index];
            if (item != null) if (itemsBefore[index] != item) {
                changedSlots[count++] = index;
            }
        }
        int[] finalChangedSlots = new int[count];
        System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
        refresh(finalChangedSlots);
    }

    /**
     * Refreshing the slots.
     *
     * @param slots the slots.
     */
    public void refresh(int... slots) {
        player.getPackets().sendUpdateItems(134, stake, slots);
        player.getPackets().sendUpdateItems(-134, stake2, slots);
        target.getPackets().sendUpdateItems(134, stake, slots);
        target.getPackets().sendUpdateItems(-134, stake2, slots);
        player.getPackets().sendUpdateItems(93, player.getInventory().getItems(), slots);
        target.getPackets().sendUpdateItems(93, target.getInventory().getItems(), slots);
        player.getInventory().refresh();
        target.getInventory().refresh();
    }

    /**
     * Rewarding of the stakes.
     *
     * @param player The winner.
     */
    public void reward(Player player) {
        player.getInventory().getItems().addAll(stake2);
        player.getInventory().getItems().addAll(stake);
        player.getInventory().init();
    }

    /**
     * Sending spoils at the end of the duel.
     *
     * @param player The winner.
     */
    public void addSpoils(Player player) {
        Player other = getOther(player);
        other.getInterfaceManager().sendInterface(634);
        if (player == this.player) other.getPackets().sendItems(136, false, stake);

        if (player == target) other.getPackets().sendItems(136, false, stake2);

        other.getPackets().sendUnlockIComponentOptionSlots(634, 28, 0, 35, 0, 1, 2, 3, 4, 5);
        other.getPackets().sendInterSetItemsOptionsScript(634, 28, 136, 4, 7, "", "", "", "", "");
        other.getPackets().sendIComponentText(634, 23, TextUtils.formatPlayerNameForDisplay(player.getUsername()));
        other.getPackets().sendIComponentText(634, 22, Integer.toString(player.getSkills().getCombatLevel()));
    }

    /**
     * @param ruleId The rule id to set.
     * @param b
     * @return duelRules.
     */
    private boolean setRule(int ruleId, boolean b) {
        return duelRules[ruleId] = b;
    }

    /**
     * Gets the ruleId.
     *
     * @param ruleId The rule id to get.
     * @return duelRules
     */
    public boolean getRule(int ruleId) {
        return duelRules[ruleId];
    }

    /**
     * Getting player's opponent.
     *
     * @param player the player.
     * @return player's opponent.
     */
    public Player getOther(Player player) {
        return player == this.player ? this.target : this.player;
    }

    /**
     * Getting player's stake.
     *
     * @param p the player.
     * @return p's stake.
     */
    private ItemsContainer<Item> getStake(Player p) {
        return p == player ? stake : stake2;
    }
}
