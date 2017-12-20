package com.rs.game.player.dialogues.impl.skills.construction;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.player.dialogues.FaceAnimations;
import com.rs.game.player.content.shops.ShopHandler;

/**
 * Created by Peng on 30.9.2016.
 */
public class EstateAgent extends Dialogue {
    @Override
    public void start() {
        sendNpcDialogue("Estate agent", "Hello sir! I can help you redecorate your house walls and interior or your "
                + "house grounds. I can also sell you some construction goods.", 4247, FaceAnimations.PLAIN_TALKING);
        stage = 1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
        System.out.println(stage + " " + componentId);
        switch (stage) {
            case 1:
                sendOptions("What would you like to do?", "I would like to change my house grounds.", "I would like "
                        + "to redecorate my house walls", "I would like to view the construction store");
                stage = 2;
                break;
            case 2:
                switch (componentId) {
                    case OPTION_1:
                        sendOptions("Select a style", "Rough grass", "Desert", "Barren earth", "Mown grass");
                        stage = 3;
                        break;
                    case OPTION_2:
                        sendOptions("Select a style", "Basic wood", "Basic stone", "Whitewashed stone", "Fremennik "
                                + "style wood", "More");
                        stage = 4;
                        break;
                    case OPTION_3:
                        ShopHandler.openShop(player, "Construction shop");
                        end();
                        break;
                }
                break;
            case 3:
                player.getHouse().setGround(componentId);
                stage = 6;
                break;
            case 4:
                switch (componentId) {
                    case OPTION_5:
                        sendOptions("Select style", "Tropical wood", "Fancy stone", "Dark stone", "Back", "Never mind");
                        stage = 5;
                        break;
                    default:
                        player.getHouse().setLook(componentId - 1);
                        endCustomization();
                        break;
                }
                break;
            case 5:
                switch (componentId) {
                    case OPTION_4:
                        sendOptions("Select a style", "Basic wood", "Basic stone", "Whitewashed stone", "Fremennik "
                                + "style wood", "More");
                        stage = 4;
                        break;
                    case OPTION_5:
                        stage = 10;
                        break;
                    default:
                        player.getHouse().setLook(componentId + 3);
                        endCustomization();
                        break;
                }
                break;
            default:
                end();
        }
    }

    private void endCustomization() {
        sendNpcDialogue("Estate agent", "Your house has been redecorated. Have a nice day!", 4247, FaceAnimations
                .HAPPY);
        stage = 10;
    }

    @Override
    public void finish() {
    }
}
