/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class234 {
    static int anInt2787;
    static int anInt2788;
    static int anInt2789;
    static boolean[][][] aBooleanArrayArrayArray2790;
    static int anInt2791;
    static int anInt2792 = 0;

    static Class233 method2144() {
        anInt2789++;
        try {
            return (Class233) Class.forName("Class233_Sub1").newInstance();
        } catch (Throwable throwable) {
            return null;
        }
    }

    public Class234() {
        /* empty */
    }

    abstract int method2145(long l);

    abstract void method2146();

    final int method2147(long l) {
        anInt2788++;
        long l_0_ = method2148((byte) 92);
        if (l_0_ > 0) {
            Class262_Sub22.method3208(l_0_);
        }
        return method2145(l);
    }

    abstract long method2148(byte b);

    public static void method2149() {
        aBooleanArrayArrayArray2790 = null;
    }

    static boolean method2150(int i, int i_2_) {
        anInt2791++;
        return (i_2_ & 0x100) != 0;
    }

    abstract long method2151();

    static {
        anInt2787 = -1;
    }
}
