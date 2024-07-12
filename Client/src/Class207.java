/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class207 {
    static int anInt2473;
    static int anInt2474;
    private int anInt2475;
    private long aLong2476;
    static int anInt2477;
    static int anInt2478;
    static int anInt2479;
    static int anInt2480;

    static void method2039(int i) {
        if (Class94.anInt1250 < 0) {
            Class262_Sub4.anInt7730 = -1;
            Class150_Sub3.anInt8963 = -1;
            Class94.anInt1250 = 0;
        }
        if (i <= 5) {
            method2040(null, 31, 8);
        }
        anInt2477++;
        if (Class20.anInt345 < Class94.anInt1250) {
            Class262_Sub4.anInt7730 = -1;
            Class94.anInt1250 = Class20.anInt345;
            Class150_Sub3.anInt8963 = -1;
        }
        if (Class327.anInt5360 < 0) {
            Class150_Sub3.anInt8963 = -1;
            Class262_Sub4.anInt7730 = -1;
            Class327.anInt5360 = 0;
        }
        if (Class327.anInt5360 > Class20.anInt333) {
            Class150_Sub3.anInt8963 = -1;
            Class262_Sub4.anInt7730 = -1;
            Class327.anInt5360 = Class20.anInt333;
        }
    }

    static String method2040(BufferedStream buffer, int i, int i_0_) {
        anInt2480++;
        try {
            int i_1_ = buffer.readSmart();
            if (i_1_ > i) {
                i_1_ = i;
            }
            byte[] bs = new byte[i_1_];
            buffer.offset += Class342.aClass163_4236.method1735(bs, -1, buffer.buffer, i_1_, buffer.offset, 0);
            if (i_0_ != -24709) {
                method2040(null, -44, 108);
            }
            return Class184.method1846(0, bs, i_1_, (byte) -109);
        } catch (Exception exception) {
            return "Cabbage";
        }
    }

    private int method2041(int i_2_) {
        anInt2474++;
        return (int) (aLong2476 >> Class126.anInt1631 * i_2_) & 0xf;
    }

    final int method2042() {
        anInt2478++;
        return anInt2475;
    }

    private void method2043(Class126 class126) {
        anInt2479++;
        aLong2476 |= (long) class126.anInt1621 << anInt2475++ * Class126.anInt1631;
    }

    Class207(Class126 class126) {
        aLong2476 = class126.anInt1621;
        anInt2475 = 1;
    }

    final Class126 method2044(int i_3_) {
        anInt2473++;
        return Class126.method1534(method2041(i_3_));
    }

    Class207(Class126[] class126s) {
        for (Class126 class126 : class126s) method2043(class126);
    }
}
