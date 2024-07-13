/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17 {
    protected int anInt273;
    protected int anInt274;
    static float aFloat275;
    static int anInt276;
    static int[] anIntArray277;
    protected int anInt278;
    protected int anInt279;
    static int anInt280;
    static int anInt281;
    static int anInt282;

    public static void method259() {

        anIntArray277 = null;
    }

    static void method260() {
        Class78.method780(Class174.clientCycle, Class93.aGraphicsToolkit1241);
        anInt280++;
        if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
            Class290_Sub1.method3424(Class320_Sub15.WINDOWS_PANE_ID);
        }
        for (int i_1_ = 0; Node_Sub11.anInt7105 > i_1_; i_1_++) {
            if (Class195.aBooleanArray2387[i_1_]) {
                Class320_Sub21.aBooleanArray8403[i_1_] = true;
            }
            Class190.aBooleanArray2326[i_1_] = Class195.aBooleanArray2387[i_1_];
            Class195.aBooleanArray2387[i_1_] = false;
        }
        Node_Sub12.anInt5453 = Class174.clientCycle;
        if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
            Node_Sub11.anInt7105 = 0;
            Exception_Sub1.method141(124);
        }
        Class93.aGraphicsToolkit1241.la();
        Class93_Sub2.method1061(Class93.aGraphicsToolkit1241);
        int i_2_ = Node_Sub52.method2972();
        if (i_2_ == -1) {
            i_2_ = Class239.anInt2928;
        }
        if (i_2_ == -1) {
            i_2_ = Animable_Sub4_Sub1.anInt10687;
        }
        Class60.method594(6, i_2_);
        Node_Sub9_Sub1.anInt9637 = 0;
    }

    static int method261(int i, int i_3_, int i_4_) {
        i_4_ &= 0x3;
        anInt281++;
        if (i_4_ == 0) {
            return i;
        }
        if (i_4_ == 1) {
            return i_3_;
        }
        if (i_4_ == 2) {
            return -i + 4095;
        }
        return -i_3_ + 4095;
    }

    final Class17 method262(int i_5_) {
        anInt276++;
        return new Class17(anInt279, i_5_, anInt274, anInt278);
    }

    Class17(int i, int i_6_, int i_7_, int i_8_) {
        anInt278 = i_8_;
        anInt279 = i;
        anInt273 = i_6_;
        anInt274 = i_7_;
    }
}
