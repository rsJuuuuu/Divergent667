package com.rs.game.player.content.skills.runecrafting;

import static com.rs.utils.Constants.*;

/**
 * Created by Peng on 10.2.2017 14:19.
 */
public class RuneConfigs {

    enum Rune {
        AIR(AIR_RUNE, 1, 5),
        MIND(MIND_RUNE, 2, 5.5),
        WATER(WATER_RUNE, 5, 6),
        EARTH(EARTH_RUNE, 9, 6.5),
        FIRE(FIRE_RUNE, 14, 7),
        BODY(BODY_RUNE, 20, 7.5),
        COSMIC(COSMIC_RUNE, 27, 8),
        CHAOS(CHAOS_RUNE, 35, 8.5),
        ASTRAL(ASTRAL_RUNE, 40, 87),
        NATURE(NATURE_RUNE, 44, 9),
        LAW(LAW_RUNE, 54, 95),
        DEATH(DEATH_RUNE, 65, 10),
        BLOOD(BLOOD_RUNE, 77, 23.8),
        SOUL(SOUL_RUNE, 90, 29.7);
        private int runeId;
        private int level;

        private double exp;

        Rune(int runeId, int level, double exp) {
            this.runeId = runeId;
            this.level = level;
            this.exp = exp;
        }

        public int getLevel(){
            return level;
        }

        boolean requiresPureEssence() {
            return level >= 27;
        }

        public int getId() {
            return runeId;
        }

        public double getExp() {
            return exp;
        }
    }

}
