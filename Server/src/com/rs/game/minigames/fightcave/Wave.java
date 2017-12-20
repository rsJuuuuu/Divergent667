package com.rs.game.minigames.fightcave;

import com.rs.game.npc.Npc;
import com.rs.game.npc.impl.fightcave.FightCaveNpc;
import com.rs.game.world.WorldTile;
import com.rs.utils.Utils;

import java.io.Serializable;
import java.util.Random;

public class Wave implements Serializable {
    public static final int TZ_KIH = 2628, TZ_KEK = 2629, TOX_XIL = 2631, YT_MEJKOT = 2741, KET_ZEK = 2743, TZ_TOK_JAD = 2745;

    public static int[][] WAVES = {{1, TZ_KIH}, {2, TZ_KIH, TZ_KIH}, {3, TZ_KEK}, {4, TZ_KEK, TZ_KIH}, {5, TZ_KEK,
			TZ_KIH, TZ_KIH}, {6, TZ_KEK, TZ_KEK}, {7, TOX_XIL}, {8, TOX_XIL, TZ_KIH}, {9, TOX_XIL, TZ_KIH, TZ_KIH},
			{10, TOX_XIL, TZ_KEK}, {11, TOX_XIL, TZ_KEK, TZ_KIH}, {12, TOX_XIL, TZ_KEK, TZ_KIH, TZ_KIH}, {13, TOX_XIL,
			TZ_KEK, TZ_KEK}, {14, TOX_XIL, TOX_XIL}, {15, YT_MEJKOT}, {16, YT_MEJKOT, TZ_KIH}, {17, YT_MEJKOT, TZ_KIH,
			TZ_KIH}, {18, YT_MEJKOT, TZ_KEK}, {19, YT_MEJKOT, TZ_KEK, TZ_KIH}, {20, YT_MEJKOT, TZ_KEK, TZ_KIH,
			TZ_KIH}, {21, YT_MEJKOT, TZ_KEK, TZ_KEK}, {22, YT_MEJKOT, TOX_XIL}, {23, YT_MEJKOT, TOX_XIL, TZ_KIH}, {24,
			YT_MEJKOT, TOX_XIL, TZ_KIH, TZ_KIH}, {25, YT_MEJKOT, TOX_XIL, TZ_KEK}, {26, YT_MEJKOT, TOX_XIL, TZ_KEK,
			TZ_KIH}, {27, YT_MEJKOT, TOX_XIL, TZ_KEK, TZ_KIH, TZ_KIH}, {28, YT_MEJKOT, TOX_XIL, TZ_KEK, TZ_KEK}, {29,
			YT_MEJKOT, TOX_XIL, TOX_XIL}, {30, YT_MEJKOT, YT_MEJKOT}, {31, KET_ZEK}, {32, KET_ZEK, TZ_KIH}, {33,
			KET_ZEK, TZ_KIH, TZ_KIH}, {34, KET_ZEK, TZ_KEK}, {35, KET_ZEK, TZ_KEK, TZ_KIH}, {36, KET_ZEK, TZ_KEK,
			TZ_KIH, TZ_KIH}, {37, KET_ZEK, TZ_KEK, TZ_KEK}, {38, KET_ZEK, TOX_XIL}, {39, KET_ZEK, TOX_XIL, TZ_KIH},
			{40, KET_ZEK, TOX_XIL, TZ_KIH, TZ_KIH}, {41, KET_ZEK, TOX_XIL, TZ_KEK}, {42, KET_ZEK, TOX_XIL, TZ_KEK,
			TZ_KIH}, {43, KET_ZEK, TOX_XIL, TZ_KEK, TZ_KIH, TZ_KIH}, {44, KET_ZEK, TOX_XIL, TZ_KEK, TZ_KEK}, {45,
			KET_ZEK, TOX_XIL, TOX_XIL}, {46, KET_ZEK, YT_MEJKOT}, {47, KET_ZEK, YT_MEJKOT, TZ_KIH}, {48, KET_ZEK,
			YT_MEJKOT, TZ_KIH, TZ_KIH}, {49, KET_ZEK, YT_MEJKOT, TZ_KEK}, {50, KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KIH},
			{51, KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KIH, TZ_KIH}, {52, KET_ZEK, YT_MEJKOT, TZ_KEK, TZ_KEK}, {53, KET_ZEK,
			YT_MEJKOT, TOX_XIL}, {54, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KIH}, {55, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KIH,
			TZ_KIH}, {56, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KEK}, {57, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KEK, TZ_KIH},
			{58, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KEK, TZ_KIH, TZ_KIH}, {59, KET_ZEK, YT_MEJKOT, TOX_XIL, TZ_KEK,
			TZ_KEK}, {60, KET_ZEK, YT_MEJKOT, TOX_XIL, TOX_XIL}, {61, KET_ZEK, YT_MEJKOT, YT_MEJKOT}, {62, KET_ZEK,
			KET_ZEK}, {63, TZ_TOK_JAD}};

    public Wave() {

    }

    public Npc[] getSpawns() {
        int npcs[] = new int[6];
        int index = 0;
        int id = stage;
        for (int i = 6; i >= 1; i--) {
            int threshold = (1 << i) - 1;
            if (id >= threshold) {
                for (int j = 0; j <= id / threshold; j++) {
                    npcs[index++] = BASE_NPCS[i - 1] + (i == 6 ? 0 : RANDOM.nextInt(2));
                    id -= threshold;
                }

            }
        }

        FightCaveNpc enemies[] = new FightCaveNpc[index];
        for (int i = 0; i < enemies.length; i++) {
            int random = Utils.random(3);
            switch (random) {
                case 0: // '\0'
                    enemies[i] = new FightCaveNpc(npcs[i], new WorldTile(
                            2399 - Utils.random(3), 5086 - Utils.random(3), 0));
                    break;

                case 1: // '\001'
                    enemies[i] = new FightCaveNpc(npcs[i], new WorldTile(
                            2399 + Utils.random(3), 5086 + Utils.random(3), 0));
                    break;

                case 2: // '\002'
                    enemies[i] = new FightCaveNpc(npcs[i], new WorldTile(
                            2399 - Utils.random(3), 5086 + Utils.random(3), 0));
                    break;

                case 3: // '\003'
                    enemies[i] = new FightCaveNpc(npcs[i], new WorldTile(
                            2399 + Utils.random(3), 5086 - Utils.random(3), 0));
                    break;
            }
        }

        return enemies;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getStage() {
        return stage;
    }

    private static final Random RANDOM = new Random();
    private static final int BASE_NPCS[] = {2734, 2736, 2739, 2741, 2743, 2745};
    private int stage;

}