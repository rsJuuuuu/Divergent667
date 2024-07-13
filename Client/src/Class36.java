/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class36 {
    static int anInt539;
    private final Class61 aClass61_540 = new Class61(64);
    private final Index aClass302_541;
    static int anInt542;
    static int anInt543;
    static int anInt544;
    static int anInt545;
    static int anInt546;
    static int anInt547;
    static int anInt548 = 0;
    static int anInt549;

    final void method389() {
        synchronized (aClass61_540) {
            aClass61_540.method602((byte) -123);
        }
        anInt544++;
    }

    static boolean method390(int i) {
        anInt547++;
        if (Class52.anInt800 != 0) {
            return true;
        }
        return Class307.aNode_Sub9_Sub1_3902.method2445((byte) -125);
    }

    final void method391() {
        anInt539++;
        synchronized (aClass61_540) {
            aClass61_540.method598(5);
        }
    }

    static int[] method392(byte b) {
        if (b >= -4) {
            anInt549 = -66;
        }
        anInt546++;
        return new int[]{Node_Sub50.anInt7625, Class285.anInt3600, Class340.anInt4220};
    }

    final void method393() {
        synchronized (aClass61_540) {
            aClass61_540.method608(false);
        }
        anInt545++;
    }

    final Class267 method394(int i, int i_3_) {
        anInt543++;
        if (i_3_ > -75) {
            anInt549 = 4;
        }
        Class267 class267;
        synchronized (aClass61_540) {
            class267 = (Class267) aClass61_540.method607(i, 0);
        }
        if (class267 != null) {
            return class267;
        }
        byte[] bs;
        synchronized (aClass302_541) {
            bs = aClass302_541.method3524(i, 11);
        }
        class267 = new Class267();
        if (bs != null) {
            class267.method3288(new BufferedStream(bs));
        }
        synchronized (aClass61_540) {
            aClass61_540.method601(class267, 25566, i);
        }
        return class267;
    }

    Class36(Index class302) {
        aClass302_541 = class302;
        if (aClass302_541 != null) {
            aClass302_541.method3537(11);
        }
    }
}
