package com.rs.game.npc.drops;

import com.rs.game.npc.Drop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Peng on 4.2.2017 19:51.
 */
public class DropTable implements Serializable {

    private String name;

    private ArrayList<Integer> keys = new ArrayList<>();
    private ArrayList<Drop> drops = new ArrayList<>();

    private boolean useRdt = false;

    public DropTable(String name, int key) {
        this.name = name;
        this.keys.add(key);
    }

    public DropTable(String name, Drop[] drops, int key) {
        this.name = name;
        Collections.addAll(this.drops, drops);
        keys.add(key);
    }

    public void addKey(int key) {
        keys.add(key);
    }

    public void addDrop(Drop drop) {
        drops.add(drop);
    }

    public ArrayList<Integer> getKeys() {
        return keys;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Drop> getDrops() {
        return drops;
    }

    public void setUseRdt(boolean useRdt) {
        this.useRdt = useRdt;
    }

    public boolean useRdt() {
        return useRdt;
    }

    public void setName(String name) {
        this.name = name;
    }
}
