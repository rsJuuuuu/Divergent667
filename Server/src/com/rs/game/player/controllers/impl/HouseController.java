package com.rs.game.player.controllers.impl;

import com.rs.game.player.controllers.Controller;

public class HouseController extends Controller {

    @Override
    public void start() {
        player.getHouse().constructHouse();
        player.getHouse().setGround(0);
        player.getHouse().teleportToHouse();
        player.sendMessage("Welcome to your house!");
    }

    @Override
    public void moved() {
        if (!player.getHouse().atHouse()) {
            removeController();
            System.out.println("Remove");
        }
    }

    @Override
    public boolean logout() {
        player.getHouse().leaveHouse();
        return false; //we are going to do the moving after login because there's no time when logging out
    }

    @Override
    public boolean login() {
        player.getHouse().leaveHouse();
        return true;
    }
}