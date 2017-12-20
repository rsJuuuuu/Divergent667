package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.game.actionHandling.handlers.*;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.npc.Npc;
import com.rs.game.player.*;
import com.rs.game.player.actions.PlayerFollow;
import com.rs.game.player.actions.combat.Magic;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.player.content.Trade;
import com.rs.game.player.content.skills.summoning.SpecialAttack;
import com.rs.game.player.info.FriendChatsManager;
import com.rs.game.player.info.SkillCapeCustomizer;
import com.rs.game.player.social.PublicChatMessage;
import com.rs.game.player.social.QuickChatMessage;
import com.rs.game.route.RouteFinder;
import com.rs.game.route.strategy.FixedTileStrategy;
import com.rs.game.world.World;
import com.rs.game.world.WorldTile;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.Utils;
import com.rs.utils.security.huffman.Huffman;
import com.rs.utils.stringUtils.TextUtils;
import com.rs.utils.stringUtils.TimeUtils;
import org.pmw.tinylog.Logger;

import static com.rs.net.decoders.WorldPacketsDecoder.Packets.MINI_WALKING;
import static com.rs.utils.Constants.*;

public final class WorldPacketsDecoder extends Decoder {

    private Player player;

    public WorldPacketsDecoder(Session session, Player player) {
        super(session);
        this.player = player;
    }

    /**
     * Handle interface component used on interface component
     */
    private static void processItemOnItem(Player player, final int packetId, InputStream stream, int length) {
        int interfaceId = stream.readIntV1() >> 16;
        int itemUsedId = stream.readUnsignedShort128();
        int fromSlot = stream.readUnsignedShortLE128();
        int interfaceHash = stream.readIntV2();
        int interfaceId2 = interfaceHash >> 16;
        int itemUsedWithId = stream.readUnsignedShort128();
        int toSlot = stream.readUnsignedShortLE();
        int spellId = interfaceHash & 0xFFF;
        InventoryOptionsHandler.handleItemOnItem(player, interfaceId, interfaceId2, spellId, itemUsedId,
                itemUsedWithId, toSlot, fromSlot);
    }

    /**
     * Process npc action data and pass it to npc handler
     */
    private static void processNpcClick(Player player, final int packetId, InputStream stream, int length) {
        Packets packet = Packets.forId(packetId);
        if (mayProcessActionPacket(player, packet)) stream.readByte128();
        int npcIndex = stream.readUnsignedShort128();
        final Npc npc = World.getNPCs().get(npcIndex);
        if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished()
            || !player.getMapRegionsIds().contains(npc.getRegionId())) return;
        NPCHandler.handleClick(player, npc, packet);
    }

    /**
     * Handle the chat packet
     */
    private static void processChat(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        if (player.getLastPublicMessage() > TimeUtils.getTime()) return;
        player.setLastPublicMessage(TimeUtils.getTime() + 300);
        int colorEffect = stream.readUnsignedByte();
        int moveEffect = stream.readUnsignedByte();
        String message = Huffman.readEncryptedMessage(250, stream);
        if (message == null || message.replaceAll(" ", "").equals("")) return;
        if (message.startsWith("::") || message.startsWith(";;")) {
            String command = message.substring(2, !message.contains(" ") ? message.length() : message.indexOf(" "));
            CommandHandler.handleCommand(player, Packets.forId(packetId), command, message.substring(
                    command.length() + 2).trim().split(" "));
            return;
        }
        player.isMuted();
        int effects = (colorEffect << 8) | (moveEffect & 0xff);
        if (player.getChatType() == 1) player.sendFriendsChannelMessage(TextUtils.fixChatMessage(message));
        else player.sendPublicChatMessage(new PublicChatMessage(TextUtils.fixChatMessage(message), effects));
    }

    /**
     * Process a command and pass on to command handler
     */
    private static void processCommand(Player player, int packetId, InputStream stream, int length) {
        if (!player.isRunning()) return;
        stream.readUnsignedByte(); // client command
        stream.readUnsignedByte();
        String command = stream.readString();
        CommandHandler.handleCommand(player, Packets.forId(packetId), command.substring(0, !command.contains(" ") ?
                command.length() : command.indexOf(" ")).replaceAll("_", " "), command.substring(!command.contains(" ") ? command.length() :
                command.indexOf(" ") + 1).split(" "));//replace _s with spaces after getting the command name
    }

    /**
     * Handle this packet as interface click packet and pass the data on to interface handler
     */
    private static void processInterfaceClick(Player player, int packetId, InputStream stream, int length) {
        Packets packet = Packets.forId(packetId);
        int interfaceHash = stream.readIntV2();
        int interfaceId = interfaceHash >> 16;
        if (Utils.getInterfaceDefinitionsSize() <= interfaceId) return;
        if (player.isDead() || !player.getInterfaceManager().containsInterface(interfaceId)) return;
        final int componentId = interfaceHash - (interfaceId << 16);
        if (componentId != 65535 && Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId) return;
        final int slotId2 = stream.readUnsignedShortLE128();
        final int slotId = stream.readUnsignedShort();
        InterfaceHandler.handleClick(player, interfaceId, componentId, slotId, slotId2, packet);
    }

    /**
     * Handle object click packet and pass data to object handler
     */
    private static void processObjectClick(Player player, final int packetId, InputStream stream, int length) {
        Packets packet = Packets.forId(packetId);
        if (!mayProcessActionPacket(player, packet)) return;
        stream.readUnsignedByte128();
        int x = stream.readUnsignedShort128();
        final int id = stream.readInt();
        int y = stream.readUnsignedShortLE();

        ObjectHandler.handleClick(player, id, x, y, packet);
    }

    /**
     * Process an interface component being used on an npc
     */
    private static void processInterfaceOnNpc(Player player, int packetId, InputStream stream, int length) {
        if (!mayProcessActionPacket(player, Packets.forId(packetId))) return;
        int slot = stream.readUnsignedShortLE128();
        int junk2 = stream.readUnsignedShortLE();
        int npcIndex = stream.readUnsignedShortLE();
        int interfaceHash = stream.readIntV2();
        boolean unknown = stream.readByte() == 1;
        int interfaceId = interfaceHash >> 16;
        int componentId = interfaceHash - (interfaceId << 16);
        if (Utils.getInterfaceDefinitionsSize() <= interfaceId) return;
        if (!player.getInterfaceManager().containsInterface(interfaceId)) return;
        if (componentId == 65535) componentId = -1;
        if (Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId) return;
        Npc npc = World.getNPCs().get(npcIndex);
        if (npc == null || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
            return;
        if (!npc.getDefinitions().hasAttackOption()) {
            player.getPackets().sendGameMessage("You can't attack this npc.");
            return;
        }
        player.stopAll(false);
        switch (interfaceId) {
            case Inventory.INVENTORY_INTERFACE:
                Item item = player.getInventory().getItem(slot);
                if (item == null) return;
                if (!player.getInventory().containsItem(item.getId(), item.getAmount())) return;
                if (!player.getControllerManager().processItemOnNPC(npc, item)) return;
                break;
            case 662:
            case 747:
                if (player.getFollower() == null) return;
                player.resetWalkSteps();
                if ((interfaceId == 747 && componentId == 14) || (interfaceId == 662 && componentId == 65) || (
                        interfaceId == 662 && componentId == 74) || interfaceId == 747 && componentId == 17
                    || interfaceId == 747 && componentId == 23) {
                    if ((interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 17)) {
                        if (player.getFollower().getSpecialAttack() != SpecialAttack.ENTITY) return;
                    }
                    if (npc == player.getFollower()) {
                        player.getPackets().sendGameMessage("You can't attack your own familiar.");
                        return;
                    }
                    if (!player.getFollower().canAttack(npc)) {
                        player.getPackets().sendGameMessage(
                                "You can only use your familiar in a multi-zone " + "area.");
                        return;
                    } else {
                        player.getFollower().setSpecial(
                                interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 17);
                        player.getFollower().setTarget(npc);
                    }
                }
                break;
            case MODERN_SPELLBOOK:
            case ANCIENT_SPELLBOOK:
            case LUNAR_SPELLBOOK:
                Magic.processSpellOnNpc(player, npc, componentId);
                break;
        }
    }

    /**
     * Process interface component used on a player
     */
    private static void processInterfaceOnPlayer(Player player, int packetId, InputStream stream, int length) {
        if (!mayProcessActionPacket(player, Packets.forId(packetId))) return;
        int playerIndex = stream.readUnsignedShortLE();
        int interfaceHash = stream.readIntLE();
        int junk1 = stream.readUnsignedShort();
        boolean unknown = stream.read128Byte() == 1;
        int junk2 = stream.readUnsignedShortLE128();
        int interfaceId = interfaceHash >> 16;
        int componentId = interfaceHash - (interfaceId << 16);
        if (Utils.getInterfaceDefinitionsSize() <= interfaceId) return;
        if (!player.getInterfaceManager().containsInterface(interfaceId)) return;
        if (componentId == 65535) componentId = -1;
        if (componentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(interfaceId) <= componentId) return;
        Player other = World.getPlayers().get(playerIndex);
        if (other == null || other.isDead() || other.hasFinished()
            || !player.getMapRegionsIds().contains(other.getRegionId())) return;
        player.stopAll(false);
        switch (interfaceId) {
            case 662:
            case 747:
                if (player.getFollower() == null) return;
                player.resetWalkSteps();
                if ((interfaceId == 747 && componentId == 14) || (interfaceId == 662 && componentId == 65) || (
                        interfaceId == 662 && componentId == 74) || interfaceId == 747 && componentId == 17) {
                    if (player.getFollower().getSpecialAttack() != SpecialAttack.ENTITY) return;

                    if (!player.isCanPvp() || !other.isCanPvp()) {
                        player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
                        return;
                    }
                    if (!player.getFollower().canAttack(other)) {
                        player.getPackets().sendGameMessage("You can only use your familiar in a multi-zone area.");
                        return;
                    } else {
                        player.getFollower().setSpecial(
                                interfaceId == 662 && componentId == 74 || interfaceId == 747 && componentId == 17);
                        player.getFollower().setTarget(other);
                    }
                }
                break;
            case MODERN_SPELLBOOK:
            case ANCIENT_SPELLBOOK:
            case LUNAR_SPELLBOOK:
                Magic.processSpellOnPlayer(player, other, componentId);
                break;
        }
    }

    /**
     * Get an integer from the player to be used in various things
     */
    private static void processEnterInteger(Player player, int packetId, InputStream stream, int length) {
        if (!player.isRunning() || player.isDead()) return;
        int intValue = stream.readInt();
        if (intValue <= 0) return;
        if ((player.getInterfaceManager().containsInterface(762) && player.getInterfaceManager().containsInterface(763))
            || player.getInterfaceManager().containsInterface(11)) {
            Integer bank_item_X_Slot = (Integer) player.getTemporaryAttributes().remove("bank_item_X_Slot");
            if (bank_item_X_Slot == null) return;
            if (player.getTemporaryAttributes().remove("bank_isWithdraw") != null)
                player.getBank().withdrawItem(bank_item_X_Slot, intValue);
            else
                player.getBank().depositItem(bank_item_X_Slot, intValue, !player.getInterfaceManager()
                        .containsInterface(11));
        } else if (player.getInterfaceManager().containsInterface(206)
                   && player.getInterfaceManager().containsInterface(207)) {
            Integer pc_item_X_Slot = (Integer) player.getTemporaryAttributes().remove("pc_item_X_Slot");
            if (pc_item_X_Slot == null) return;
            if (player.getTemporaryAttributes().remove("pc_isRemove") != null)
                player.getPriceCheckManager().removeItem(pc_item_X_Slot, intValue);
            else player.getPriceCheckManager().addItem(pc_item_X_Slot, intValue);
        } else if (player.getInterfaceManager().containsInterface(671)
                   && player.getInterfaceManager().containsInterface(665)) {
            if (player.getFollower() == null || player.getFollower().getBob() == null) return;
            Integer bob_item_X_Slot = (Integer) player.getTemporaryAttributes().remove("bob_item_X_Slot");
            if (bob_item_X_Slot == null) return;
            if (player.getTemporaryAttributes().remove("bob_isRemove") != null)
                player.getFollower().getBob().removeItem(bob_item_X_Slot, intValue);
            else player.getFollower().getBob().addItem(bob_item_X_Slot, intValue);
        } else if (player.getTemporaryAttributes().get("skillId") != null) {
            int skillId = (Integer) player.getTemporaryAttributes().remove("skillId");
            if (skillId == Skills.HITPOINTS && intValue == 1) intValue = 10;
            else if (intValue < 1) intValue = 1;
            else if (intValue > 99) intValue = 99;
            player.getSkills().set(skillId, intValue);
            player.getSkills().setXp(skillId, Skills.getXPForLevel(intValue));
            player.getAppearance().generateAppearanceData();
            player.getDialogueManager().finishDialogue();
        } else if (player.getTemporaryAttributes().get("offerX") != null
                   && player.getInterfaceManager().containsInterface(335)
                   && player.getTrade().getState() == Trade.TradeState.STATE_ONE) {
            player.getTrade().addItem(player, (Integer) player.getTemporaryAttributes().get("offerX"), intValue);
            player.getTemporaryAttributes().remove("offerX");
        } else if (player.getTemporaryAttributes().get("removeX") != null
                   && player.getInterfaceManager().containsInterface(335)
                   && player.getTrade().getState() == Trade.TradeState.STATE_ONE) {
            player.getTrade().removeItem(player, (Integer) player.getTemporaryAttributes().get("removeX"), intValue);
            player.getTemporaryAttributes().remove("removeX");

        }
    }

    private static void receiveCount(Player player, int packetId, InputStream stream, int length) {
        stream.readInt();
    }

    /**
     * Processed when an interface is closed by the client
     */
    private static void processCloseInterface(Player player, int packetId, InputStream stream, int length) {
        if (!player.isRunning()) {
            player.run();
            return;
        }
        player.stopAll();
    }

    /**
     * Process the walk packets
     * Uses server sided path finding effectively ignores client
     */
    private static void processWalk(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()) return;
        long currentTime = TimeUtils.getTime();
        if (player.getStopDelay() > currentTime) return;
        if (player.getFreezeDelay() >= currentTime) {
            player.getPackets().sendGameMessage("A magical force prevents you from moving.");
            return;
        }
        if (packetId == MINI_WALKING.getId()) length -= 13;
        int baseX = stream.readUnsignedShortLE128();
        int baseY = stream.readUnsignedShortLE128();
        stream.readByte();
        int steps = (length - 5) / 2;
        if (steps > 25) steps = 25;
        if (steps > 0) {
            int x = 0, y = 0;
            for (int step = 0; step < steps; step++) {
                x = baseX + stream.readUnsignedByte();
                y = baseY + stream.readUnsignedByte();
            }
            steps = RouteFinder.findRoute(RouteFinder.WALK_ROUTEFINDER, player.getX(), player.getY(), player.getPlane
                    (), player.getSize(), new FixedTileStrategy(x, y), true);
            int[] bufferX = RouteFinder.getLastPathBufferX();
            int[] bufferY = RouteFinder.getLastPathBufferY();
            player.stopAll();
            for (int i = steps - 1; i >= 0; i--) {
                if (!player.addWalkSteps(bufferX[i], bufferY[i], 25, true)) break;
            }
        }
    }

    /**
     * Process the trade packet
     */
    private static void processTrade(Player player, int packetId, InputStream stream, int length) {
        stream.readByte(); //Seems to be 0 always
        int playerIndex = stream.readUnsignedShort();
        Player other = World.getPlayers().get(playerIndex);
        Trade.attemptTrade(player, other);
    }

    /**
     * Process a magic spell cast on something on ground, like tele grab
     */
    private static void processMagicOnGround(Player player, int packetId, InputStream stream, int length) {
        int xCoord = stream.readShort();
        int yCoord = stream.readShort();
        stream.readShortLE128();
        int interfaceHash = stream.readIntV2();
        int interfaceId = interfaceHash >> 16;
        int spellId = interfaceHash & 0xFFF;
        stream.readShortLE();
        stream.readByte();
        int itemId = stream.readShortLE();
        Magic.handleMagicOnGround(player, itemId, xCoord, yCoord, spellId, interfaceId);
    }

    /**
     * Receive a string from the client
     */
    private static void processEnterString(Player player, int packetId, InputStream stream, int length) {
        if (!player.isRunning() || player.isDead()) return;
        String value = stream.readString();
        if (player.getInterfaceManager().containsInterface(1108)) player.getFriendsIgnores().setChatPrefix(value);
    }

    /**
     * Changes display mode if needed
     */
    private static void processScreenPacket(Player player, int packetId, InputStream stream, int length) {
        int displayMode = stream.readUnsignedByte();
        player.setScreenWidth(stream.readUnsignedShort());
        player.setScreenHeight(stream.readUnsignedShort());
        boolean switchScreenMode = stream.readUnsignedByte() == 1;
        if (!player.hasStarted() || player.hasFinished() || displayMode == player.getDisplayMode()
            || !player.getInterfaceManager().containsInterface(742)) return;
        player.setDisplayMode(displayMode);
        player.getInterfaceManager().removeAll();
        player.getInterfaceManager().sendInterfaces();
        player.getInterfaceManager().sendInterface(742);
    }

    /**
     * Sent when players mouse leaves or enters the client area
     */
    @SuppressWarnings("unused")
    private static void processInOutScreen(Player player, int packetId, InputStream stream, int length) {
        boolean inScreen = stream.readByte() == 1;
    }

    /**
     * Sent when client presses space or continue button
     */
    private static void processDialogueContinue(Player player, int packetId, InputStream stream, int length) {
        int interfaceHash = stream.readIntV2();
        stream.readShortLE128();
        int interfaceId = interfaceHash >> 16;
        int buttonId = (interfaceHash & 0xFF);
        if (Utils.getInterfaceDefinitionsSize() <= interfaceId) {
            return;
        }
        if (!player.isRunning() || !player.getInterfaceManager().containsInterface(interfaceId)) return;
        int componentId = interfaceHash - (interfaceId << 16);
        player.getDialogueManager().continueDialogue(interfaceId, componentId);
    }

    /**
     * Sent when client clicks the screen
     */
    private static void processClick(Player player, int packetId, InputStream stream, int length) {
        int mouseHash = stream.readShortLE128();
        int mouseButton = mouseHash >> 15;
        int time = mouseHash - (mouseButton << 15); // time
        int positionHash = stream.readIntV1();
        int y = positionHash >> 16; // y;
        int x = positionHash - (y << 16); // x
        if (time <= 1 || x < 0 || x > player.getScreenWidth() || y < 0 || y > player.getScreenHeight()) return;
    }

    /**
     * Sent upon rotating camera
     */
    private static void processCameraMove(Player player, int packetId, InputStream stream, int length) {
        stream.readUnsignedShort();
        stream.readUnsignedShort();
    }

    /**
     * If new display isn't valid stop ip
     */
    private static void processSwitchDisplay(Player player, int packetId, InputStream stream, int length) {
        int hash = stream.readInt();
        if (hash != 1057001181) player.getSession().getChannel().close();
    }

    /**
     * When another interface component is dragged on another, like items in inventory
     */
    private static void processSwitchInterfaceComponent(Player player, int packetId, InputStream stream, int length) {
        stream.readUnsignedShort();
        int fromSlot = stream.readUnsignedShortLE();
        stream.readUnsignedShort128();
        int interface1Hash = stream.readIntV1();
        int toSlot = stream.readUnsignedShortLE();
        int interface2Hash = stream.readIntV2();

        int fromInterfaceId = interface1Hash >> 16;
        int fromComponentId = interface1Hash - (fromInterfaceId << 16);

        int toInterfaceId = interface2Hash >> 16;
        int toComponentId = interface2Hash - (toInterfaceId << 16);

        if (Utils.getInterfaceDefinitionsSize() <= fromInterfaceId
            || Utils.getInterfaceDefinitionsSize() <= toInterfaceId) return;
        if (!player.getInterfaceManager().containsInterface(fromInterfaceId)
            || !player.getInterfaceManager().containsInterface(toInterfaceId)) return;
        if (fromComponentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(fromInterfaceId) <= fromComponentId)
            return;
        if (toComponentId != -1 && Utils.getInterfaceDefinitionsComponentsSize(toInterfaceId) <= toComponentId) return;
        if (fromInterfaceId == Inventory.INVENTORY_INTERFACE && fromComponentId == 0
            && toInterfaceId == Inventory.INVENTORY_INTERFACE && toComponentId == 0) {
            toSlot -= 28;
            if (toSlot < 0 || toSlot >= player.getInventory().getItemsContainerSize()
                || fromSlot >= player.getInventory().getItemsContainerSize()) return;
            player.getInventory().switchItem(fromSlot, toSlot);
        } else if (fromInterfaceId == 763 && fromComponentId == 0 && toInterfaceId == 763 && toComponentId == 0) {
            if (toSlot >= player.getInventory().getItemsContainerSize()
                || fromSlot >= player.getInventory().getItemsContainerSize()) return;
            player.getInventory().switchItem(fromSlot, toSlot);
        } else if (fromInterfaceId == 762 && toInterfaceId == 762) {
            player.getBank().switchItem(fromSlot, toSlot, fromComponentId, toComponentId);
        }
        if (Settings.DEBUG) System.out.println("Switch item " + fromInterfaceId + ", " + fromSlot + ", " + toSlot);
    }

    /**
     * Sent when region has finished loading
     */
    private static void processDoneLoadingRegion(Player player, int packetId, InputStream stream, int length) {
        /*
        if (!player.clientHasLoadedMapRegion()) {
            player.setClientHasLoadedMapRegion();
        }
        player.refreshSpawnedObjects();*/
    }

    /**
     * Process a quick chat message sent to public chat
     */
    private static void processPublicQuickChat(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        if (player.getLastPublicMessage() > TimeUtils.getTime()) return;
        player.setLastPublicMessage(TimeUtils.getTime() + 300);
        // just tells you which client script created packet
        @SuppressWarnings("unused") boolean secondClientScript = stream.readByte() == 1;// script 5059
        // or 5061
        int fileId = stream.readUnsignedShort();
        byte[] data = null;
        if (length > 3) {
            data = new byte[length - 3];
            stream.readBytes(data);
        }
        data = Utils.completeQuickMessage(player, fileId, data);
        if (player.getChatType() == 0) player.sendPublicChatMessage(new QuickChatMessage(fileId, data));
        else if (player.getChatType() == 1) player.sendFriendsChannelQuickMessage(new QuickChatMessage(fileId, data));
        else if (Settings.DEBUG) Logger.info("Unknown chat type: " + player.getChatType());
    }

    /**
     * Process chat type change
     */
    private static void processChatType(Player player, int packetId, InputStream stream, int length) {
        player.setChatType(stream.readUnsignedByte());
    }

    private static void processJoinFriendChat(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        FriendChatsManager.joinChat(stream.readString(), player);
    }

    private static void processKickFriendChat(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        player.setLastPublicMessage(TimeUtils.getTime() + 1000);
        player.kickPlayerFromFriendsChannel(stream.readString());
    }

    private static void processChangeFriendChat(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || !player.getInterfaceManager().containsInterface(1108)) return;
        player.getFriendsIgnores().changeRank(stream.readString(), stream.readUnsignedByteC());
    }

    private static void processAddFriend(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        player.getFriendsIgnores().addFriend(stream.readString());
    }

    private static void processRemoveFriend(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        player.getFriendsIgnores().removeFriend(stream.readString());
    }

    private static void processSendFriendMessage(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || player.isMuted()) return;
        String username = stream.readString();
        Player p2 = World.getPlayerByDisplayName(username);
        if (p2 == null) return;

        player.getFriendsIgnores().sendMessage(p2, TextUtils.fixChatMessage(Huffman.readEncryptedMessage(150, stream)));
    }

    private static void processSendFriendQuickMessage(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        String username = stream.readString();
        int fileId = stream.readUnsignedShort();
        byte[] data = null;
        if (length > 3 + username.length()) {
            data = new byte[length - (3 + username.length())];
            stream.readBytes(data);
        }
        data = Utils.completeQuickMessage(player, fileId, data);
        Player p2 = World.getPlayerByDisplayName(username);
        if (p2 == null) return;
        player.getFriendsIgnores().sendQuickChatMessage(p2, new QuickChatMessage(fileId, data));
    }

    private static void processColorId(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted()) return;
        int colorId = stream.readUnsignedShort();
        if (player.getTemporaryAttributes().get("SkillcapeCustomize") != null)
            SkillCapeCustomizer.handleSkillCapeCustomizerColor(player, colorId);
    }

    private static void processPacket16(Player player, int packetId, InputStream stream, int length) {
    }

    private static void processPlayerOption1(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()) return;
        stream.readByte();
        int playerIndex = stream.readUnsignedShort();
        Player p2 = World.getPlayers().get(playerIndex);
        if (p2 == null || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
            return;
        if (player.getStopDelay() > TimeUtils.getTime() || !player.getControllerManager().canPlayerOption1(p2)) return;
        if (!player.isCanPvp()) return;
        if (!player.getControllerManager().canAttack(p2)) return;

        if (!player.isCanPvp() || !p2.isCanPvp()) {
            player.getPackets().sendGameMessage("You can only attack players in a player-vs-player area.");
            return;
        }
        if (!p2.isAtMultiArea() || !player.isAtMultiArea()) {
            if (player.getAttackedBy() != p2 && player.getAttackedByDelay() > TimeUtils.getTime()) {
                player.getPackets().sendGameMessage("You are already in combat.");
                return;
            }
            if (p2.getAttackedBy() != player && p2.getAttackedByDelay() > TimeUtils.getTime()) {
                if (p2.getAttackedBy() instanceof Npc) {
                    p2.setAttackedBy(player);
                } else {
                    player.getPackets().sendGameMessage("That player is already in combat.");
                    return;
                }
            }
        }
        player.stopAll(false);
        player.getActionManager().setAction(new PlayerCombat(p2));
    }

    private static void processPlayerOption2(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()) return;
        @SuppressWarnings("unused") boolean unknown = stream.readByte() == 1;
        int playerIndex = stream.readUnsignedShort();
        Player p2 = World.getPlayers().get(playerIndex);
        if (p2 == null || p2.isDead() || p2.hasFinished() || !player.getMapRegionsIds().contains(p2.getRegionId()))
            return;
        if (player.getStopDelay() > TimeUtils.getTime()) return;
        player.stopAll(false);
        player.getActionManager().setAction(new PlayerFollow(p2));
    }

    private static void processItemTakePacket(Player player, int packetId, InputStream stream, int length) {
        if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()) return;
        if (player.hasStopDelay()) return;
        final int id = stream.readUnsignedShort128();
        stream.readByte();
        int y = stream.readUnsignedShort();
        int x = stream.readUnsignedShortLE();
        final WorldTile tile = new WorldTile(x, y, player.getPlane());
        final int regionId = tile.getRegionId();
        if (!player.getMapRegionsIds().contains(regionId)) return;
        final FloorItem item = World.getRegion(regionId).getGroundItem(id, tile, player);
        if (item == null) return;
        player.stopAll(false);
        player.setRouteEvent(new RouteEvent(item, () -> {
            final FloorItem item1 = World.getRegion(regionId).getGroundItem(id, tile, player);
            if (item1 == null) return;
            World.removeGroundItem(player, item1);
        }));
    }

    private static void processItemOnObject(Player player, int packetId, InputStream stream, int length) {
        ObjectHandler.handleItemOnObject(player, stream);
    }

    /**
     * Is there anything stopping us from making an action like attacking something?
     */
    private static boolean mayProcessActionPacket(Player player, Packets packet) {
        return packet != null && !(!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead()
                                   || player.hasStopDelay())
               && player.getEmotesManager().getNextEmoteEnd() < TimeUtils.getTime();
    }

    /**
     * Decode a logic packet
     */
    public static void decodeLogicPacket(final Player player, LogicPacket packet) {
        int packetId = packet.getId();
        InputStream stream = new InputStream(packet.getData());
        Packets pack = Packets.forId(packetId);
        if (pack == null) return;
        if (pack.getAction() != null) {
            pack.getAction().execute(player, packetId, stream, stream.getLength());
            return;
        }
        if (Settings.DEBUG) Logger.warn("Unhandled logic packet: " + packetId);
    }

    @Override
    public void decode(InputStream stream) {
        while (stream.getRemaining() > 0 && session.getChannel().isConnected() && !player.hasFinished()) {
            int packetId = stream.readUnsignedByte();
            Packets packet = Packets.forId(packetId);
            if (packet == null) {
                if (Settings.DEBUG) Logger.warn("Missing packet " + packetId);
                break;
            }
            int length = packet.getSize();
            if (length == -1) length = stream.readUnsignedByte();
            else if (length == -2) length = stream.readUnsignedShort();
            else if (length == -3) length = stream.readInt();
            else if (length == -4) {
                length = stream.getRemaining();
                if (Settings.DEBUG) Logger.warn("Packet " + packetId + " is missing a proper size. Might be " + length);
            }
            if (length > stream.getRemaining()) {
                length = stream.getRemaining();
                if (Settings.DEBUG) Logger.warn("Packet " + packetId + " has too large size!");
            }
            int startOffset = stream.getOffset();
            player.setPacketsDecoderPing(TimeUtils.getTime());
            if (!packet.isLogicPacket() && packet.getAction() != null)
                packet.getAction().execute(player, packetId, stream, length);
            else if (packet.isLogicPacket()) player.addLogicPacketToQueue(new LogicPacket(packetId, length, stream));
            else if (Settings.DEBUG) Logger.warn("Unhandled packet: " + packetId);
            stream.setOffset(startOffset + length);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public enum Packets {
        ATTACK_TRADE_CHAT(46, 3, WorldPacketsDecoder::processTrade, false),
        PLAYER_TRADE_OPTION(77, 3, WorldPacketsDecoder::processTrade, false),
        WALKING(12, -1, WorldPacketsDecoder::processWalk, true),
        MINI_WALKING(83, -1, WorldPacketsDecoder::processWalk, true),
        INTERFACE_BTN_1(61, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_2(64, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_3(4, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_4(52, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_5(81, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_6(18, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_7(10, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_8(25, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_9(91, 8, WorldPacketsDecoder::processInterfaceClick, false),
        INTERFACE_BTN_10(20, 8, WorldPacketsDecoder::processInterfaceClick, false),
        RECEIVE_COUNT(15, 4, WorldPacketsDecoder::receiveCount, false),
        MOVE_CAMERA(5, 4, WorldPacketsDecoder::processCameraMove, false),
        MAGIC_ON_GROUND(21, 15, WorldPacketsDecoder::processMagicOnGround, false),
        KEY_TYPED(68, -1),
        CLOSE_INTERFACE(56, 0, WorldPacketsDecoder::processCloseInterface, false),
        COMMAND(70, -1, WorldPacketsDecoder::processCommand, false),
        ITEM_ON_ITEM(73, 16, WorldPacketsDecoder::processItemOnItem, false),
        IN_OUT_SCREEN(75, 4, WorldPacketsDecoder::processInOutScreen, false),
        SWITCH_DETAIL(4, 8, WorldPacketsDecoder::processSwitchDisplay, false),
        DONE_LOADING_REGION(33, 0, WorldPacketsDecoder::processDoneLoadingRegion, false),
        SCREEN(87, 6, WorldPacketsDecoder::processScreenPacket, false),
        CHAT_TYPE(23, 1, WorldPacketsDecoder::processChatType, false),
        CHAT(36, -1, WorldPacketsDecoder::processChat, false),
        PUBLIC_QUICK_CHAT(30, -1, WorldPacketsDecoder::processPublicQuickChat, false),
        ADD_FRIEND(51, -1, WorldPacketsDecoder::processAddFriend, false),
        JOIN_FRIEND_CHAT(1, -1, WorldPacketsDecoder::processJoinFriendChat, false),
        CHANGE_FRIEND_CHAT(41, -1, WorldPacketsDecoder::processChangeFriendChat, false),
        KICK_FRIEND_CHAT(32, -1, WorldPacketsDecoder::processKickFriendChat, false),
        REMOVE_FRIEND(8, -1, WorldPacketsDecoder::processRemoveFriend, false),
        SEND_FRIEND_MESSAGE(72, -2, WorldPacketsDecoder::processSendFriendMessage, false),
        SEND_FRIEND_QUICK_CHAT(79, -1, WorldPacketsDecoder::processSendFriendQuickMessage, false),
        OBJECT_1(11, 9, WorldPacketsDecoder::processObjectClick, true),
        OBJECT_2(2, 9, WorldPacketsDecoder::processObjectClick, true),
        OBJECT_3(76, 9, WorldPacketsDecoder::processObjectClick, true),
        OBJECT_5(69, 9, WorldPacketsDecoder::processObjectClick, true),
        OBJECT_EXAMINE(47, 9, WorldPacketsDecoder::processObjectClick, false),
        NPC_CLICK_1(9, 3, WorldPacketsDecoder::processNpcClick, true),
        NPC_CLICK_2(31, 3, WorldPacketsDecoder::processNpcClick, true),
        NPC_CLICK_3(67, 3, WorldPacketsDecoder::processNpcClick, true),
        NPC_CLICK_4(28, 3, WorldPacketsDecoder::processNpcClick, true),
        NPC_EXAMINE(92, 3, WorldPacketsDecoder::processNpcClick, false),
        ATTACK_NPC(66, 3, WorldPacketsDecoder::processNpcClick, true),
        PLAYER_OPTION_1(14, 3, WorldPacketsDecoder::processPlayerOption1, true),
        PLAYER_OPTION_2(53, 3, WorldPacketsDecoder::processPlayerOption2, true),
        ITEM_TAKE(24, 7, WorldPacketsDecoder::processItemTakePacket, true),
        DIALOGUE_CONTINUE(54, 6, WorldPacketsDecoder::processDialogueContinue, false),
        ENTER_INTEGER(3, 4, WorldPacketsDecoder::processEnterInteger, false),
        ENTER_STRING(59, -1, WorldPacketsDecoder::processEnterString, false),
        SWITCH_INTERFACE_COMPONENT(26, 16, WorldPacketsDecoder::processSwitchInterfaceComponent, false),
        INTERFACE_ON_PLAYER(40, 11, WorldPacketsDecoder::processInterfaceOnPlayer, true),
        CLICK(84, 6, WorldPacketsDecoder::processClick, false),
        INTERFACE_ON_NPC(65, 11, WorldPacketsDecoder::processInterfaceOnNpc, true),
        ITEM_ON_OBJECT(42, 17, WorldPacketsDecoder::processItemOnObject, true),
        COLOR_ID(22, 2, WorldPacketsDecoder::processColorId, false),
        MOVE_MOUSE(29, -1),
        PACKET_16(16, 0, WorldPacketsDecoder::processPacket16, false),
        //Sent constantly but no data in it?
        UNKNOWN2(232, 0),
        //100% no idea what this is and where it comes from
        TOGGLE_FOCUS(93, 1, false),
        //sends boolean as byte true if gained, could be used to detect bad bots
        PING(85, 1, false); //sends the current ping as a short (only works on windows machines, linux returns 1k)

        private final int id;
        private final int size;
        private final boolean logicPacket;
        private PacketAction action;

        Packets(int id, int size, PacketAction action, boolean logicPacket) {
            this.id = id;
            this.size = size;
            this.action = action;
            this.logicPacket = logicPacket;
        }

        Packets(int id, int size) {
            this(id, size, null, false);
        }

        Packets(int id, int size, boolean logicPacket) {
            this(id, size, null, logicPacket);
        }

        Packets(int id) {
            this(id, -4, null, false);
        }

        static Packets forId(int id) {
            for (Packets packet : Packets.values())
                if (packet.getId() == id) return packet;
            return null;
        }

        public int getId() {
            return id;
        }

        int getSize() {
            return size;
        }

        PacketAction getAction() {
            return action;
        }

        boolean isLogicPacket() {
            return logicPacket;
        }
    }

    private interface PacketAction {
        void execute(Player player, final int packetId, InputStream stream, int length);
    }

}
