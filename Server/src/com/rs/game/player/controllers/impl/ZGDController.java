package com.rs.game.player.controllers.impl;

import com.rs.game.minigames.ZarosGodwars;
import com.rs.game.player.controllers.Controller;

public class ZGDController extends Controller {

    @Override
    public void start() {
        ZarosGodwars.addPlayer(player);
        sendInterfaces();
    }

    public boolean logout() {
        ZarosGodwars.removePlayer(player);
        return false; // so doesnt remove script
    }

    public boolean login() {
        ZarosGodwars.addPlayer(player);
        sendInterfaces();
        return false; // so doesnt remove script
    }

    @Override
    public void moved() {
        if (!ZarosGodwars.isInsideLair(player)) remove();
    }

    @Override
    public void sendInterfaces() {
        player.getInterfaceManager().sendTab(player.getInterfaceManager().hasResizableScreen() ? 9 : 8, 601);
    }

    @Override
    public boolean sendDeath() {
        remove();
        removeController();
        return true;
    }

    @Override
    public void magicTeleported(int type) {
        remove();
        removeController();
    }

    @Override
    public void forceClose() {
        remove();
    }

    public void remove() {
        ZarosGodwars.removePlayer(player);
        player.getPackets().closeInterface(player.getInterfaceManager().hasResizableScreen() ? 9 : 8);
    }
}
