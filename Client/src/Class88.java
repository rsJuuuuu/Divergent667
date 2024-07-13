/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class88 implements Interface12 {
    private final Index aClass302_5273;
    static String aString5274 = null;
    static int anInt5275;
    static int anInt5276;
    private final String aString5277;
    static int anInt5278;
    static int anInt5279;
    static GraphicsToolkit aGraphicsToolkit5280;
    static Object anObject5281;

    static void method1016() {
        Node_Sub5_Sub2.aClass49Array9413 = null;
        anInt5278++;
    }

    public static void method1017() {
        anObject5281 = null;
        aGraphicsToolkit5280 = null;

        aString5274 = null;
    }

    public final int method35() {
        anInt5276++;
        if (aClass302_5273.method3527(aString5277)) {
            return 100;
        }
        return aClass302_5273.method3522((byte) 33, aString5277);
    }

    public final Class172 method34(byte b) {
        anInt5279++;

        return Class172.aClass172_2079;
    }

    static void method1018(int i, int i_0_, int i_1_, int i_2_) {
        anInt5275++;
        int i_4_ = 0;
        int i_5_ = i_0_;
        int i_6_ = -i_0_;
        int i_7_ = -1;
        int i_8_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_0_ + i_2_);
        int i_9_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, -i_0_ + i_2_);
        Class369.method4086(i_8_, i_1_, i_9_, Class169_Sub4.anIntArrayArray8826[i], 0);
        while (i_5_ > i_4_) {
            i_7_ += 2;
            i_6_ = i_6_ + i_7_;
            if (i_6_ > 0) {
                i_5_--;
                i_6_ -= i_5_ << 1;
                int i_10_ = -i_5_ + i;
                int i_11_ = i_5_ + i;
                if (Class384.anInt4906 <= i_11_ && i_10_ <= Node_Sub25_Sub1.anInt9936) {
                    int i_12_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_2_ + i_4_);
                    int i_13_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, -i_4_ + i_2_);
                    if (i_11_ <= Node_Sub25_Sub1.anInt9936) {
                        Class369.method4086(i_12_, i_1_, i_13_, Class169_Sub4.anIntArrayArray8826[i_11_], 0);
                    }
                    if (Class384.anInt4906 <= i_10_) {
                        Class369.method4086(i_12_, i_1_, i_13_, Class169_Sub4.anIntArrayArray8826[i_10_], 0);
                    }
                }
            }
            int i_14_ = -++i_4_ + i;
            int i_15_ = i_4_ + i;
            if (i_15_ >= Class384.anInt4906 && Node_Sub25_Sub1.anInt9936 >= i_14_) {
                int i_16_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_2_ + i_5_);
                int i_17_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_2_ - i_5_);
                if (Node_Sub25_Sub1.anInt9936 >= i_15_) {
                    Class369.method4086(i_16_, i_1_, i_17_, Class169_Sub4.anIntArrayArray8826[i_15_], 0);
                }
                if (Class384.anInt4906 <= i_14_) {
                    Class369.method4086(i_16_, i_1_, i_17_, Class169_Sub4.anIntArrayArray8826[i_14_], 0);
                }
            }
        }
    }

    Class88(Index class302) {
        aString5277 = "details";
        aClass302_5273 = class302;
    }
}
