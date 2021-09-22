package com.rs.game.player.dialogues.impl.content;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.content.shops.ShopHandler;

public class Xuans extends Dialogue {

    @Override
    public void start() {
        sendOptions("What would You like to see?", "Loyalty Shop", "How Many Loyalty Points do I have?", "How Can I "
                + "get Loyalty Points?", "Never mind.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        stage = 1;
        if (stage == 1) {
            if (componentId == 1) ShopHandler.openShop(player, "Loyalty shop");
            end();
            if (componentId == 2)
                player.getPackets().sendGameMessage("To check your Loyalty Points, check your bank or inventory for "
                        + "Loyalty Coins!");
            end();
            if (componentId == 3)
                player.getPackets().sendGameMessage("You get Loyalty Points every 30 minutes you're Online!");
            end();
            if (componentId == 4) end();
        } else end();
    }

    @Override
    public void finish() {

    }

}