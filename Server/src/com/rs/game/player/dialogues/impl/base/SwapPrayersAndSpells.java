package com.rs.game.player.dialogues.impl.base;

import com.rs.game.player.dialogues.Dialogue;

import static com.rs.utils.Constants.*;

/**
 * Created by Peng on 19.10.2016.
 */
public class SwapPrayersAndSpells extends Dialogue {
    @Override
    public void start() {
        sendOptions("What would you like to do?", "Swap prayers", "Swap spellbook", "Nothing");
        stage = 1;
    }

    @Override
    public void run(int interfaceId, int componentId) {
        switch (stage) {
            case 1:
                switch (componentId) {
                    case OPTION_1:
                        if (!player.getPrayer().isAncientCurses()) {
                            sendText("The altar fills your head with dark thoughts, purging the prayers from your "
                                     + "memory and " + "leaving only curses in their place.");
                            player.getPrayer().setPrayerBook(true);
                        } else {
                            sendText("The altar eases its grip on your mid. The curses slip from"
                                     + " your memory and you recall " + "the prayers you used to know.");
                            player.getPrayer().setPrayerBook(false);
                        }
                        stage = 55;
                        break;
                    case OPTION_2:
                        sendOptions("Select a spellbook", "Modern", "Lunar", "Ancient", "Nevermind");
                        stage = 2;
                        break;
                    default:
                        end();
                        break;
                }
                break;
            case 2:
                switch (componentId) {
                    case OPTION_1:
                        player.getCombatDefinitions().setSpellBook(MODERN);
                        break;
                    case OPTION_2:
                        player.getCombatDefinitions().setSpellBook(LUNAR);
                        break;
                    case OPTION_3:
                        player.getCombatDefinitions().setSpellBook(ANCIENT);
                        break;
                    default:
                        end();
                        return;
                }
                sendText("You have selected the " + (
                        player.getCombatDefinitions().getSpellBook() == MODERN_SPELLBOOK ? " Modern" :
                                player.getCombatDefinitions().getSpellBook()
                                == ANCIENT_SPELLBOOK ? " Ancient" : " Lunar") + " spellbook");
                stage = 55;
                break;
            default:
                end();
                break;
        }
    }

    @Override
    public void finish() {

    }
}
