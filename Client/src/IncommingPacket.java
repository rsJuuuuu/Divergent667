/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IncommingPacket {
    static int anInt2354;
    protected int anInt2355;
    static int anInt2356;
    private final int anInt2357;
    static int anInt2358;

    final int method1953(int i) {
        anInt2356++;
        if (i <= 17) {
            return 7;
        }
        return anInt2357;
    }

    public final String toString() {
        anInt2354++;
        throw new IllegalStateException();
    }

    IncommingPacket(int i, int i_0_) {
        anInt2357 = i;
        anInt2355 = i_0_;
    }

    static void method1954() {
        anInt2358++;
        int i = 0;
        for (int i_2_ = 0; i_2_ < Node_Sub54.GAME_SCENE_WDITH; i_2_++) {
            for (int i_3_ = 0; Class377_Sub1.GAME_SCENE_HEIGHT > i_3_; i_3_++) {
                if (Node_Sub38_Sub19.method2849(i_3_, Class175.aClass261ArrayArrayArray2099, i, i_2_, true)) {
                    i++;
                }
                if (i >= 512) {
                    return;
                }
            }
        }
    }
}
