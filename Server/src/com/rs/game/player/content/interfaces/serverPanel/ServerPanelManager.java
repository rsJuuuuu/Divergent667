package com.rs.game.player.content.interfaces.serverPanel;

import com.rs.game.player.Player;

import java.util.ArrayList;

/**
 * Created by Peng on 15.2.2017 10:42.
 * <p>
 * ServerPanel manager, Used to control things showing on the server panel (Notes tab)
 */
public class ServerPanelManager {

    private transient Player player;

    private ArrayList<ServerPanelModule> modules = new ArrayList<>();

    public ServerPanelManager() {
        modules.add(ServerPanelModule.SLAYER_DATA_MODULE);
    }

    private int spentLines() {
        int lines = 0;
        for (ServerPanelModule module : modules) {
            lines += module.getSize();
        }
        return lines;
    }

    private Line getLine(int index) {
        int offset = 0;
        for (ServerPanelModule module : modules) {
            if (module.getSize() + offset > index) return module.getLine(index - offset);
            else offset += module.getSize();
        }
        return new Line(new StringBuilder("test"), 1);
    }

    private int getPrimaryColor() {
        int value = 0;
        for (ServerPanelModule module : modules) {
            value += module.getPrimaryColor();
        }
        return value;
    }

    private int getSecondaryColor() {
        int value = 0;
        for (ServerPanelModule module : modules) {
            value += module.getSecundaryColor();
        }
        return value;
    }

    public void refresh(Player player, boolean sendStartConfigs) {
        for (ServerPanelModule module : modules)
            module.updateData(player);
        for (int i = 0; i < 30; i++) {
            player.getPackets().sendGlobalString(149 + i, i < spentLines() ? getLine(i).getBuilder().toString() : "");
        }
        if (sendStartConfigs) {
            for (int i = 1430; i < 1450; i++)
                player.getPackets().sendConfig(i, i);
        }
        player.getPackets().sendConfig(1440, getPrimaryColor());
        player.getPackets().sendConfig(1441, getSecondaryColor());
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void sendUnlockNotes() {
        player.getPackets().sendIComponentSettings(34, 9, 0, 30, 2621470);
        for (int i = 10; i < 16; i++)
            player.getPackets().sendHideIComponent(34, i, true);
        player.getPackets().sendHideIComponent(34, 3, true);
        player.getPackets().sendHideIComponent(34, 44, false);
        player.getPackets().sendConfig(1439, -1);
        refresh(player, true);
    }

}
