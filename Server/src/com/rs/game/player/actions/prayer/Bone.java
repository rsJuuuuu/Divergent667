package com.rs.game.player.actions.prayer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Peng on 28.1.2017 1:03.
 */
public enum Bone {
    NORMAL(526, 4.5),
    BURNT(528, 4.5),
    WOLF(2859, 4.5),
    MONKEY(3183, 4.5),
    BAT(530, 4.5),
    BIG(532, 15),
    JOGRE(3125, 15),
    ZOGRE(4812, 22.5),
    SHAIKAHAN(3123, 25),
    BABY(534, 30),
    WYVERN(6812, 50),
    DRAGON(536, 72),
    FAYRG(4830, 84),
    RAURG(4832, 96),
    DAGANNOTH(6729, 114),
    OURG(4834, 140),
    FROST_DRAGON(18830, 180);

    private int id;
    private double experience;

    private static Map<Integer, Bone> bones = new HashMap<>();

    static {
        for (Bone bone : Bone.values()) {
            bones.put(bone.getId(), bone);
        }
    }

    public static Bone forId(int id) {
        return bones.get(id);
    }

    Bone(int id, double experience) {
        this.id = id;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public double getExperience() {
        return experience;
    }

}
