/* Class290_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290_Sub2 extends Class290 {
    private float aFloat8065 = 0.0F;
    private final Class5 aClass5_8066;
    static int anInt8067;
    static int anInt8068;
    static int anInt8069 = 0;
    static int anInt8070;
    static int anInt8071;
    static int anInt8072;
    static int anInt8073;
    static int anInt8074;
    static int anInt8075;

    final void method3415(boolean bool, int i, int i_0_) {
        anInt8072++;
        anAbstractToolkit3654.method1362(1);
        if ((i & 0x80) == 0) {
            if ((i_0_ & 0x1) == 1) {
                if (aClass5_8066.aBoolean128) {
                    aFloat8065 = (float) (anAbstractToolkit3654.anInt6332 % 4000) / 4000.0F;
                    anAbstractToolkit3654.method1312(aClass5_8066.anInterface13_Impl3_130);
                } else {
                    int i_1_ = anAbstractToolkit3654.anInt6332 % 4000 * 16 / 4000;
                    anAbstractToolkit3654.method1312(aClass5_8066.anInterface13_Impl1Array131[i_1_]);
                }
            } else if (aClass5_8066.aBoolean128) {
                anAbstractToolkit3654.method1312(aClass5_8066.anInterface13_Impl3_130);
            } else {
                anAbstractToolkit3654.method1312(aClass5_8066.anInterface13_Impl1Array131[0]);
            }
        } else {
            anAbstractToolkit3654.method1312(null);
        }
        anAbstractToolkit3654.method1362(0);
        if (!bool) {
            method3415(true, 103, -118);
        }
    }

    final void method3419(Interface13 interface13, int i) {
        anAbstractToolkit3654.method1312(interface13);
        anInt8071++;
    }

    final void method3422(int i, boolean bool) {
        anInt8075++;
        anAbstractToolkit3654.method1362(1);
        anAbstractToolkit3654.method1318(Class117_Sub1.aClass94_4924, Class236.aClass94_2898);
        anAbstractToolkit3654.method1349(Class106.aClass135_1354, true, false, 0);
        anAbstractToolkit3654.method1366(Class200_Sub1.aClass135_5139, 0);
        anAbstractToolkit3654.method1279(0);
        anAbstractToolkit3654.method1362(0);
        anAbstractToolkit3654.method1336(-16777216);
        if (i < -84) {
            anAbstractToolkit3654.method1366(InterfaceSettings.aClass135_7421, 0);
            method3421();
        }
    }

    final void method3411() {
        anInt8074++;
        anAbstractToolkit3654.method1362(1);
        anAbstractToolkit3654.method1318(Class116.aClass94_5075, Class116.aClass94_5075);
        anAbstractToolkit3654.method1304(0, Class106.aClass135_1354);
        anAbstractToolkit3654.method1366(Class106.aClass135_1354, 0);
        anAbstractToolkit3654.method1279(1);
        anAbstractToolkit3654.method1312(null);
        anAbstractToolkit3654.method1362(0);
        anAbstractToolkit3654.method1366(Class106.aClass135_1354, 0);
    }

    final void method3421() {
        if (anAbstractToolkit3654.method1250() == 0) {
            Class336_Sub1 class336_sub1 = anAbstractToolkit3654.method1290();
            anAbstractToolkit3654.method1362(1);
            Class336_Sub1 class336_sub1_2_ = anAbstractToolkit3654.method1306();
            class336_sub1_2_.method3857(class336_sub1);
            class336_sub1_2_.method3889(0.125F, 0.125F);
            class336_sub1_2_.method3875(aFloat8065, 0.0F, 0.0F);
            anAbstractToolkit3654.method1297(Class55.aClass346_829);
            anAbstractToolkit3654.method1362(0);
        }
        anInt8068++;
    }

    final void method3417(boolean bool_3_) {
        if (bool_3_) {
            method3415(true, -122, -128);
        }
        anInt8070++;
        anAbstractToolkit3654.method1318(Class117_Sub1.aClass94_4924, Class116.aClass94_5075);
    }

    Class290_Sub2(AbstractToolkit abstracttoolkit, Class5 class5) {
        super(abstracttoolkit);
        aClass5_8066 = class5;
    }

    final boolean method3414(byte b) {
        if (b > -45) {
            aFloat8065 = -0.865858f;
        }
        anInt8067++;
        return aClass5_8066.method173();
    }

    static void method3426(int i, byte b, int i_4_) {
        if (b < 101) {
            method3426(-128, (byte) 27, 66);
        }
        anInt8073++;
        Class343 class343 = CacheNode_Sub18.aClass343ArrayArray9608[i][i_4_];
        if (class343 != null) {
            Class181.anInt2145 = class343.anInt4249;
            Class173.anInt2089 = class343.anInt4248;
            Class134_Sub2.anInt9022 = class343.anInt4247;
        }
        Class313.method3648();
    }
}
