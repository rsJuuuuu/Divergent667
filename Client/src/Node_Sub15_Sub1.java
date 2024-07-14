/* Node_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub1 extends Node_Sub15 {
    static int anInt9769;
    static int anInt9770;
    static int anInt9772;
    private int anInt9773;
    private long aLong9774;

    final void method2556(ClanChat clanchat) {
        anInt9770++;
        clanchat.method499(anInt9773, aLong9774);
    }

    final void method2554(BufferedStream buffer) {
        anInt9769++;
        anInt9773 = buffer.readInt();
        aLong9774 = buffer.readLong();
    }

    static void method2558() {
        anInt9772++;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        for (int i_2_ = 0; Class178.LOCAL_PLAYERS_INDEXES_COUNT > i_2_; i_2_++) {
            Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_2_]];
            if (player != null) {
                player.method847();
            }
        }
        for (int i_3_ = 0; i_3_ < Node_Sub25_Sub3.localNPCsCount; i_3_++) {
            long l = Class54.LocalNPCsIndexes[i_3_];
            Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, l);
            if (node_sub41 != null) {
                node_sub41.aNpc7518.method847();
            }
        }
        if (aa.anInt101 == 3) {
            for (int i_4_ = 0; Class121.aClass206Array1529.length > i_4_; i_4_++) {
                Class206 class206 = Class121.aClass206Array1529[i_4_];
                if (class206.aBoolean2472) {
                    class206.method2037(-99).method847();
                }
            }
        }
    }

    Node_Sub15_Sub1() {
        /* empty */
    }
}
