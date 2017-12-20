package com.rs.game.player.dialogues.impl.base;

import com.rs.game.world.WorldTile;
import com.rs.game.player.dialogues.Dialogue;

public class ClimbEmoteStairs extends Dialogue {

    private WorldTile upTile;
    private WorldTile downTile;
    private int emoteId;

    // uptile, downtile, climbup message, climbdown message, emoteid
    @Override
    public void start() {
        upTile = (WorldTile) parameters[0];
        downTile = (WorldTile) parameters[1];
        emoteId = (Integer) parameters[4];
        sendOptions("What would you like to do?", (String) parameters[2], (String) parameters[3], "Never mind.");
    }

    @Override
    public void run(int interfaceId, int componentId) {
        if (componentId == 2) player.useStairs(emoteId, upTile, 2, 3);
        else if (componentId == 3) player.useStairs(emoteId, downTile, 2, 2);
        end();
    }

    @Override
    public void finish() {

    }

}
