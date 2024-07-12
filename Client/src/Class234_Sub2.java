/* Class234_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234_Sub2 extends Class234 {
    private long aLong6919;
    private long aLong6920;
    private long aLong6921 = 0L;
    private int anInt6922;
    private int anInt6923;
    private final long[] aLongArray6924 = new long[10];

    final int method2145(long l) {
        if (aLong6919 <= aLong6920) {
            int i = 0;
            do
                aLong6919 += l;
            while (++i < 10 && aLong6920 > aLong6919);
            if (aLong6920 > aLong6919) {
                aLong6919 = aLong6920;
            }
            return i;
        }
        aLong6921 += aLong6919 - aLong6920;
        aLong6920 += aLong6919 - aLong6920;
        aLong6919 += l;
        return 1;
    }

    final long method2148(byte b) {
        aLong6920 += method2153();
        if (b < 88) {
            method2148((byte) -34);
        }
        if (aLong6920 < aLong6919) {
            return (aLong6919 - aLong6920) / 1000000L;
        }
        return 0L;
    }

    final long method2151() {
        return aLong6920;
    }

    private long method2153() {
        long l = System.nanoTime();
        long l_0_ = -aLong6921 + l;
        aLong6921 = l;
        if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
            aLongArray6924[anInt6923] = l_0_;
            anInt6923 = (anInt6923 + 1) % 10;
            if (anInt6922 < 1) {
                anInt6922++;
            }
        }
        long l_1_ = 0L;
        for (int i = 1; anInt6922 >= i; i++)
            l_1_ += aLongArray6924[(anInt6923 + (-i + 10)) % 10];

        return l_1_ / (long) anInt6922;
    }

    final void method2146() {
        if (aLong6919 > aLong6920) {
            aLong6920 += aLong6919 - aLong6920;
        }
        aLong6921 = 0L;
    }

    Class234_Sub2() {
        anInt6923 = 0;
        anInt6922 = 1;
        aLong6920 = System.nanoTime();
        aLong6919 = System.nanoTime();
    }
}
