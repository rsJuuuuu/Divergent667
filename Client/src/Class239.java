/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

public class Class239 {
    static int anInt2917;
    protected Index aClass302_2918;
    private final Class61 aClass61_2919 = new Class61(64);
    static int anInt2920;
    static int anInt2921;
    static int anInt2922;
    private final Index aClass302_2923;
    static BigInteger RSA_EXPONENT = null; //disables rsa //new BigInteger("10001", 16);
    protected Class61 aClass61_2925 = new Class61(2);
    static int anInt2926;
    static int anInt2927;
    static int anInt2928 = -1;
    static OutcommingPacket aClass318_2929 = new OutcommingPacket(15, 4);
    static boolean aBoolean2930 = false;
    static Index index30;
    static boolean aBoolean2932;

    static void method3022() {
        Class229.aGraphicsToolkit2732.L(Class138.anInt1726, Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3744() == 1 ? Node_Sub12.anInt5455 + 256 << 2 : -1, 0);
        anInt2920++;
    }

    final void method3023() {
        anInt2921++;
        synchronized (aClass61_2919) {
            aClass61_2919.method598(5);
        }
        synchronized (aClass61_2925) {
            aClass61_2925.method598(5);
        }
    }

    public static void method3024() {
        aClass318_2929 = null;
        index30 = null;
        RSA_EXPONENT = null;
    }

    final void method3025() {
        synchronized (aClass61_2919) {
            aClass61_2919.method602((byte) -128);
        }
        anInt2922++;
        synchronized (aClass61_2925) {
            aClass61_2925.method602((byte) -123);
        }
    }

    final Class364 method3026(int i_1_) {
        anInt2917++;
        Class364 class364;
        synchronized (aClass61_2919) {
            class364 = (Class364) aClass61_2919.method607(i_1_, 0);
        }
        if (class364 != null) {
            return class364;
        }
        byte[] bs;
        synchronized (aClass302_2923) {
            bs = aClass302_2923.method3524(i_1_, 33);
        }
        class364 = new Class364();
        class364.aClass239_4516 = this;
        if (bs != null) {
            class364.method4061(new BufferedStream(bs));
        }
        synchronized (aClass61_2919) {
            aClass61_2919.method601(class364, 25566, i_1_);
        }
        return class364;
    }

    final void method3027() {
        synchronized (aClass61_2919) {
            aClass61_2919.method608(false);
        }
        anInt2926++;
        synchronized (aClass61_2925) {
            aClass61_2925.method608(false);
        }
    }

    Class239(Class353 class353, int i, Index class302, Index class302_2_) {
        aClass302_2918 = class302_2_;
        aClass302_2923 = class302;
        aClass302_2923.method3537(-2, 33);
    }
}
