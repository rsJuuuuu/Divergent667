package com.rs.game.player.content.skills.summoning;

/**
 * Created by Peng on 13.2.2017 12:10.
 */
public enum Charm {

    GOLD(12158),
    GREEN(12159),
    CRIMSON(12160),
    ABYSSAL(12161),
    TALON_BEAST(12162),
    BLUE(12163),
    RAVAGER(12164),
    SHIFTER(12165),
    SPINNER(12166),
    TORCHER(12167),
    OBSIDIAN(12168);

    private int itemId;
    Charm(int itemId){
        this.itemId = itemId;
    }

    public int getId(){
        return itemId;
    }

    public static Charm forId(int id){
        for(Charm charm : Charm.values())
            if(charm.itemId == id)
                return charm;
        return GOLD;
    }
}
