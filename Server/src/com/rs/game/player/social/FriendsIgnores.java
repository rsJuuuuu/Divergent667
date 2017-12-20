package com.rs.game.player.social;

import com.rs.game.world.World;
import com.rs.game.player.Player;
import com.rs.game.player.info.FriendChatsManager;
import com.rs.utils.stringUtils.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import static com.rs.game.actionHandling.HandlerManager.HandlerConstants.*;

public class FriendsIgnores implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 39693097250367467L;

    // friends chat
    private String chatName;
    private HashMap<String, Integer> friendsChatRanks;
    private byte whoCanEnterChat;
    private byte whoCanTalkOnChat;
    private byte whoCanKickOnChat;
    private byte whoCanShareloot;
    @SuppressWarnings("unused")
    private boolean coinshare;

    // friends list
    private ArrayList<String> friends;
    @SuppressWarnings("unused")
    private ArrayList<String> ignores;
    private byte privateStatus;

    private transient Player player;

    public HashMap<String, Integer> getFriendsChatRanks() {
        if (friendsChatRanks == null) {// temporary
            whoCanKickOnChat = 7;
            whoCanShareloot = -1;
            friendsChatRanks = new HashMap<>(200);
            for (String friend : friends)
                friendsChatRanks.put(friend, 0);
        }
        return friendsChatRanks;
    }

    public boolean canTalk(Player player) {
        return getRank(player.getUsername()) >= whoCanTalkOnChat;
    }

    public int getRank(String username) {
        Integer rank = getFriendsChatRanks().get(username);
        if (rank == null) return -1;
        return rank;
    }

    public int getWhoCanKickOnChat() {
        return whoCanKickOnChat;
    }

    public boolean hasRankToJoin(String username) {
        return getRank(username) >= whoCanEnterChat;
    }

    public String getChatName() {
        return chatName == null ? "" : chatName;
    }

    public boolean hasFriendChat() {
        return chatName != null;
    }

    public FriendsIgnores() {
        friends = new ArrayList<>(200);
        ignores = new ArrayList<>(100);
        friendsChatRanks = new HashMap<>(200);
        whoCanKickOnChat = 7;
        whoCanShareloot = -1;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public byte getPrivateStatus() {
        return privateStatus;
    }

    public void setPrivateStatus(int privateStatus) {
        this.privateStatus = (byte) privateStatus;
        sendFriendsMyStatus(true);
    }

    public void changeFriendStatus(Player p2, boolean online) {
        if (!friends.contains(p2.getUsername())) return;
        if (online && !isOnline(p2)) online = false;
        player.getPackets().sendFriend(TextUtils.formatPlayerNameForDisplay(p2.getUsername()), p2.getDisplayName(), 1, online, true);
    }

    public void sendFriendsMyStatus(boolean online) {
        for (Player p2 : World.getPlayers()) {
            if (p2 == null || !p2.hasStarted() || p2.hasFinished()) continue;
            p2.getFriendsIgnores().changeFriendStatus(player, online);
        }
    }

    public void sendMessage(Player p2, String message) {
        if (privateStatus == 2) {// off
            privateStatus = 0;
            sendFriendsMyStatus(true);
            player.getPackets().sendPrivateGameBarStage();
        }
        player.getPackets().sendPrivateMessage(p2.getDisplayName(), message);
        p2.getPackets().receivePrivateMessage(TextUtils.formatPlayerNameForDisplay(player.getUsername()), player
				.getDisplayName(), player.getRank(), message);
    }

    public void sendQuickChatMessage(Player p2, QuickChatMessage quickChatMessage) {
        player.getPackets().sendPrivateQuickMessageMessage(p2.getDisplayName(), quickChatMessage);
        p2.getPackets().receivePrivateChatQuickMessage(TextUtils.formatPlayerNameForDisplay(player.getUsername()), player
				.getDisplayName(), player.getRank(), quickChatMessage);

    }

    public void changeRank(String username, int rank) {
        if (rank < 0 || rank > 6) return;
        String formatedUsername = TextUtils.formatPlayerNameForProtocol(username);
        if (!friends.contains(formatedUsername)) return;
        getFriendsChatRanks().put(formatedUsername, rank);
        String displayName;
        Player p2 = World.getPlayerByDisplayName(username);
        if (p2 != null) displayName = p2.getDisplayName();
        else displayName = TextUtils.formatPlayerNameForDisplay(username);
        boolean online = p2 != null && isOnline(p2);
        player.getPackets().sendFriend(TextUtils.formatPlayerNameForDisplay(username), displayName, 1, online, true);
        FriendChatsManager.refreshChat(player);
    }

    public void handleFriendChatButtons(int interfaceId, int componentId, int buttonId) {
        if (interfaceId == 1109) {
            if (componentId == 27) {
                if (player.getCurrentFriendChat() != null) player.getCurrentFriendChat().leaveChat(player, false);
            } else if (componentId == 33) {
                if (player.getInterfaceManager().containsScreenInter()) {
                    player.getPackets().sendGameMessage("Please close the interface you have opened before using "
														+ "Friends Chat setup.");
                    return;
                }
                player.stopAll();
                openFriendChatSetup();
            }
        } else if (interfaceId == 1108) {
            if (componentId == 22) {
                if (buttonId == CLICK_1) {
                    player.getPackets().sendRunScript(109, "Enter chat prefix:");
                } else if (buttonId == CLICK_2) {
                    if (chatName != null) {
                        chatName = null;
                        refreshChatName();
                        FriendChatsManager.destroyChat(player);
                    }
                }
            } else if (componentId == 23) {
                if (buttonId == CLICK_1) whoCanEnterChat = -1;
                else if (buttonId == CLICK_2) whoCanEnterChat = 0;
                else if (buttonId == CLICK_3) whoCanEnterChat = 1;
                else if (buttonId == CLICK_4) whoCanEnterChat = 2;
                else if (buttonId == CLICK_5) whoCanEnterChat = 3;
                else if (buttonId == CLICK_9) whoCanEnterChat = 4;
                else if (buttonId == CLICK_6) whoCanEnterChat = 5;
                else if (buttonId == CLICK_7) whoCanEnterChat = 6;
                else if (buttonId == CLICK_10) whoCanEnterChat = 7;
                refreshWhoCanEnterChat();
            } else if (componentId == 24) {
                if (buttonId == CLICK_1) whoCanTalkOnChat = -1;
                else if (buttonId == CLICK_2) whoCanTalkOnChat = 0;
                else if (buttonId == CLICK_3) whoCanTalkOnChat = 1;
                else if (buttonId == CLICK_4) whoCanTalkOnChat = 2;
                else if (buttonId == CLICK_5) whoCanTalkOnChat = 3;
                else if (buttonId == CLICK_9) whoCanTalkOnChat = 4;
                else if (buttonId == CLICK_6) whoCanTalkOnChat = 5;
                else if (buttonId == CLICK_7) whoCanTalkOnChat = 6;
                else if (buttonId == CLICK_10) whoCanTalkOnChat = 7;
                refreshWhoCanTalkOnChat();
            } else if (componentId == 25) {
                if (buttonId == CLICK_1) whoCanKickOnChat = -1;
                else if (buttonId == CLICK_2) whoCanKickOnChat = 0;
                else if (buttonId == CLICK_3) whoCanKickOnChat = 1;
                else if (buttonId == CLICK_4) whoCanKickOnChat = 2;
                else if (buttonId == CLICK_5) whoCanKickOnChat = 3;
                else if (buttonId == CLICK_9) whoCanKickOnChat = 4;
                else if (buttonId == CLICK_6) whoCanKickOnChat = 5;
                else if (buttonId == CLICK_7) whoCanKickOnChat = 6;
                else if (buttonId == CLICK_10) whoCanKickOnChat = 7;
                refreshWhoCanKickOnChat();
                FriendChatsManager.refreshChat(player);
            } else if (componentId == 26) {
                if (buttonId == CLICK_1) whoCanShareloot = -1;
                else if (buttonId == CLICK_2) whoCanShareloot = 0;
                else if (buttonId == CLICK_3) whoCanShareloot = 1;
                else if (buttonId == CLICK_4) whoCanShareloot = 2;
                else if (buttonId == CLICK_5) whoCanShareloot = 3;
                else if (buttonId == CLICK_9) whoCanShareloot = 4;
                else if (buttonId == CLICK_6) whoCanShareloot = 5;
                else if (buttonId == CLICK_7) whoCanShareloot = 6;
                refreshWhoCanShareloot();
            }
        }
    }

    public void setChatPrefix(String name) {
        if (name.length() < 1 || name.length() > 20) return;
        this.chatName = name;
        refreshChatName();
        FriendChatsManager.refreshChat(player);
    }

    public void refreshChatName() {
        player.getPackets().sendIComponentText(1108, 22, chatName == null ? "Chat disabled" : chatName);
    }

    public void refreshWhoCanShareloot() {
        String text;
        if (whoCanShareloot == 0) text = "Any friends";
        else if (whoCanShareloot == 1) text = "Recruit+";
        else if (whoCanShareloot == 2) text = "Corporal+";
        else if (whoCanShareloot == 3) text = "Sergeant+";
        else if (whoCanShareloot == 4) text = "Lieutenant+";
        else if (whoCanShareloot == 5) text = "Captain+";
        else if (whoCanShareloot == 6) text = "General+";
        else text = "No-one";
        player.getPackets().sendIComponentText(1108, 26, text);
    }

    public void refreshWhoCanKickOnChat() {
        String text;
        if (whoCanKickOnChat == 0) text = "Any friends";
        else if (whoCanKickOnChat == 1) text = "Recruit+";
        else if (whoCanKickOnChat == 2) text = "Corporal+";
        else if (whoCanKickOnChat == 3) text = "Sergeant+";
        else if (whoCanKickOnChat == 4) text = "Lieutenant+";
        else if (whoCanKickOnChat == 5) text = "Captain+";
        else if (whoCanKickOnChat == 6) text = "General+";
        else if (whoCanKickOnChat == 7) text = "Only Me";
        else text = "Anyone";
        player.getPackets().sendIComponentText(1108, 25, text);
    }

    public void refreshWhoCanTalkOnChat() {
        String text;
        if (whoCanTalkOnChat == 0) text = "Any friends";
        else if (whoCanTalkOnChat == 1) text = "Recruit+";
        else if (whoCanTalkOnChat == 2) text = "Corporal+";
        else if (whoCanTalkOnChat == 3) text = "Sergeant+";
        else if (whoCanTalkOnChat == 4) text = "Lieutenant+";
        else if (whoCanTalkOnChat == 5) text = "Captain+";
        else if (whoCanTalkOnChat == 6) text = "General+";
        else if (whoCanTalkOnChat == 7) text = "Only Me";
        else text = "Anyone";
        player.getPackets().sendIComponentText(1108, 24, text);
    }

    public void refreshWhoCanEnterChat() {
        String text;
        if (whoCanEnterChat == 0) text = "Any friends";
        else if (whoCanEnterChat == 1) text = "Recruit+";
        else if (whoCanEnterChat == 2) text = "Corporal+";
        else if (whoCanEnterChat == 3) text = "Sergeant+";
        else if (whoCanEnterChat == 4) text = "Lieutenant+";
        else if (whoCanEnterChat == 5) text = "Captain+";
        else if (whoCanEnterChat == 6) text = "General+";
        else if (whoCanEnterChat == 7) text = "Only Me";
        else text = "Anyone";
        player.getPackets().sendIComponentText(1108, 23, text);
    }

    public void openFriendChatSetup() {
        player.getInterfaceManager().sendInterface(1108);
        refreshChatName();
        refreshWhoCanEnterChat();
        refreshWhoCanTalkOnChat();
        refreshWhoCanKickOnChat();
        refreshWhoCanShareloot();
    }

    public void addFriend(String username) {
        if (friends.size() >= 200) {
            player.getPackets().sendGameMessage("Your friends list is full.");
            return;
        }
        if (username.equals(player.getUsername())) {
            player.getPackets().sendGameMessage("You can't add yourself.");
            return;
        }
        String displayName;
        Player p2 = World.getPlayerByDisplayName(username);
        if (p2 != null) displayName = p2.getDisplayName();
        else displayName = TextUtils.formatPlayerNameForDisplay(username);
        String formatedUsername = TextUtils.formatPlayerNameForProtocol(username);
        if (friends.contains(formatedUsername)) {
            player.getPackets().sendGameMessage((username) + " is already on your friends list.");
            return;
        }
        friends.add(formatedUsername);
        getFriendsChatRanks().put(formatedUsername, 0);
        FriendChatsManager.refreshChat(player);
        boolean online = p2 != null && isOnline(p2);
        player.getPackets().sendFriend(TextUtils.formatPlayerNameForDisplay(username), displayName, 1, online, online);
        if (privateStatus == 1 && p2 != null) p2.getFriendsIgnores().changeFriendStatus(player, true);
    }

    public void removeFriend(String username) {
        String formatedUsername = TextUtils.formatPlayerNameForProtocol(username);
        Player p2 = World.getPlayerByDisplayName(username);
        if (!friends.remove(formatedUsername)) {
            if (p2 == null) return;
            friends.remove(p2.getUsername());
            getFriendsChatRanks().remove(p2.getUsername());
            FriendChatsManager.refreshChat(player);
        } else {
            getFriendsChatRanks().remove(formatedUsername);
            FriendChatsManager.refreshChat(player);
        }
        if (privateStatus == 1 && p2 != null) p2.getFriendsIgnores().changeFriendStatus(player, true);
    }

    public boolean isOnline(Player p2) {
        return p2.getFriendsIgnores().privateStatus != 2 && !(p2.getFriendsIgnores().privateStatus == 1
                                                              && !p2.getFriendsIgnores().friends.contains(player.getUsername()));
    }

    public void init() {
        player.getPackets().sendUnlockFriendList();
        for (String username : friends) {
            if (username == null) // shouldnt happen
                continue;
            String displayName;
            Player p2 = World.getPlayerByDisplayName(username);
            if (p2 != null) displayName = p2.getDisplayName();
            else displayName = TextUtils.formatPlayerNameForDisplay(username);
            player.getPackets().sendFriend(TextUtils.formatPlayerNameForDisplay(username), displayName, 1,
                    p2 != null && isOnline(p2), false);
        }
        if (privateStatus != 2) sendFriendsMyStatus(true);
        if (hasFriendChat()) FriendChatsManager.linkSettings(player);
    }

}
