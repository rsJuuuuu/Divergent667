package com.rs.game.player.quests;

import com.rs.game.player.Player;
import com.rs.game.world.WorldObject;

public abstract class Quest {

    public boolean processObjectClick1(Player player, WorldObject object) {
        return false;
    }

    boolean hasRequirements(Player player) {
        return true;
    }

    /**
     * What is the id of this quest, usually same as rs so configs go right
     */
    protected abstract int getQuestId();

    /**
     * Register all action handling
     */
    protected abstract void registerListeners();

    void openCompleteInterface(Player player) {
        player.sendInterface(380);
        player.getPackets().sendHideIComponent(380, 6, true);
        player.getPackets().sendHideIComponent(380, 7, true);
        sendTitle(player);
        sendRewards(player);
        sendIcon(player);
    }

    public abstract String[] getRewards();

    public abstract String getDescriptionLine1();

    public abstract String getDescriptionLine2();

    public abstract String getClickInfo();

    public abstract int getIcon();

    private void sendRewards(Player player) {
        String[] rewards = getRewards();
        for (int i = 0; i < 9; i++)
            player.getPackets().sendIComponentText(380, 9 + i, rewards.length > i ? rewards[i] : "");
    }

    private void sendIcon(Player player) {
        player.getPackets().sendItemOnIComponent(380, 5, getIcon(), 1);
    }

    private void sendTitle(Player player) {
        player.getPackets().sendIComponentText(380, 4,
                "You have completed the " + QuestHandler.getName(getQuestId()) + " quest!");
    }

    void sendQuestListInfo(Player player, int startIndex) {
        player.getPackets().sendIComponentText(473, startIndex + 1,player.getQuestManager().getStageColor(getQuestId()) +  QuestHandler.getName(getQuestId()));
        player.getPackets().sendIComponentText(473, startIndex + 3, "<col=FFFFFF>" + getDescriptionLine1());
        player.getPackets().sendIComponentText(473, startIndex + 2, "<col=FFFFFF>" + getDescriptionLine2());
        player.getPackets().sendHideIComponent(473, startIndex + 4, true);
        player.getPackets().sendItemOnIComponent(473, startIndex, getIcon(), 1);
    }

    public boolean handleItemOnObject(Player player, int itemId, int id) {
        return false;
    }
}
