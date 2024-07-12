/* Class234_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

public class Class234_Sub3 extends Class234 {
    private long aLong6925;
    private long aLong6926;
    private int anInt6927;
    private long aLong6928 = 0L;
    private final long[] aLongArray6929;
    private int anInt6930;

    final void method2146() {
        aLong6928 = 0L;
        if (aLong6925 > aLong6926) {
            aLong6926 += -aLong6926 + aLong6925;
        }
    }

    private long method2154() {
        long l = jagmisc.nanoTime();
        long l_0_ = l - aLong6928;
        aLong6928 = l;
        if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
            aLongArray6929[anInt6927] = l_0_;
            if (anInt6930 < 1) {
                anInt6930++;
            }
            anInt6927 = (1 + anInt6927) % 10;
        }
        long l_1_ = 0L;
        for (int i_2_ = 1; i_2_ <= anInt6930; i_2_++)
            l_1_ += aLongArray6929[(anInt6927 - i_2_ + 10) % 10];
        return l_1_ / (long) anInt6930;
    }

    final long method2151() {
        return aLong6926;
    }

    final long method2148(byte b) {
        if (b <= 88) {
            aLong6925 = 62L;
        }
        aLong6926 += method2154();
        if (aLong6925 > aLong6926) {
            return (aLong6925 - aLong6926) / 1000000L;
        }
        return 0L;
    }

    final int method2145(long l) {
        if (aLong6925 > aLong6926) {
            aLong6928 += -aLong6926 + aLong6925;
            aLong6926 += -aLong6926 + aLong6925;
            aLong6925 += l;
            return 1;
        }
        int i = 0;
        do
            aLong6925 += l;
        while (++i < 10 && aLong6925 < aLong6926);
        if (aLong6926 > aLong6925) {
            aLong6925 = aLong6926;
        }
        return i;
    }

    Class234_Sub3() {
        anInt6927 = 0;
        aLongArray6929 = new long[10];
        anInt6930 = 1;
        aLong6925 = aLong6926 = jagmisc.nanoTime();
        if (aLong6926 == 0L) {
            throw new RuntimeException();
        }
    }
}
