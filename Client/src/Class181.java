/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181 {
    static IncommingPacket aClass192_2144;
    static int anInt2145 = -50;
    private final Class61 aClass61_2146 = new Class61(64);
    static int anInt2147;
    static int anInt2148;
    static int anInt2149;
    static int anInt2150;
    static int anInt2151;
    static int anInt2152;
    private final Index index2;
    static int anInt2154;
    static Class197 aClass197_2155;
    protected Index aClass302_2156;
    static long aLong2157 = 0L;
    static Index aClass302_2158;
    static int anInt2159;

    final void method1824() {
        anInt2151++;
        synchronized (aClass61_2146) {
            aClass61_2146.method602((byte) -122);
        }
    }

    final Class264 method1825(int i, byte b) {
        anInt2148++;
        Class264 class264;
        synchronized (aClass61_2146) {
            if (b <= 96) {
                method1825(125, (byte) 50);
            }
            class264 = (Class264) aClass61_2146.method607(i, 0);
        }
        if (class264 != null) {
            return class264;
        }
        byte[] bs;
        synchronized (index2) {
            bs = index2.method3524(i, 3);
        }
        class264 = new Class264();
        class264.aClass181_3360 = this;
        if (bs != null) {
            class264.method3226(new BufferedStream(bs));
        }
        synchronized (aClass61_2146) {
            aClass61_2146.method601(class264, 25566, i);
        }
        return class264;
    }

    static void method1826(byte b) {
        if (b < -12) {
            anInt2149++;
            CacheNode_Sub20.anIntArray9628 = Class143.method1622();
        }
    }

    final void method1827() {
        synchronized (aClass61_2146) {
            aClass61_2146.method608(false);
        }
        anInt2147++;

    }

    final void method1828() {
        synchronized (aClass61_2146) {
            aClass61_2146.method598(5);
        }
        anInt2154++;
    }

    static void method1829() {
        anInt2159++;
        if (Class332.anInt4145 > 0) {
            int i_2_ = 0;
            for (int i_3_ = 0; i_3_ < Class210.aStringArray2502.length; i_3_++) {
                if (Class210.aStringArray2502[i_3_].contains("--> ") && Class332.anInt4145 == ++i_2_) {
                    Node_Sub10.aString7081 = Class210.aStringArray2502[i_3_].substring(2 + Class210.aStringArray2502[i_3_].indexOf(">"));
                    break;
                }
            }
        } else {
            Node_Sub10.aString7081 = "";
        }
    }

    static Class119 method1830(int i, int i_4_, int i_5_, int i_6_) {
        anInt2152++;
        long l = 0xffffL & (long) i_4_ | ((0xffffL & (long) i_6_) << 16 | ((long) i_5_ << 48 & 65535L << 48 | (0xffffL & (long) i) << 32));
        Class119 class119 = (Class119) Class62.aClass61_904.method607(l, 0);
        if (class119 == null) {
            class119 = Class171.aClass278_2062.method3366(CacheNode_Sub6.aClass57_9480, i_6_, i_4_, i, i_5_);
            Class62.aClass61_904.method601(class119, 25566, l);
        }
        return class119;
    }

    public static void method1831() {
        aClass192_2144 = null;
        aClass302_2158 = null;
        aClass197_2155 = null;
    }

    Class181(Index class302, Index class302_7_) {
        aClass302_2156 = class302_7_;
        index2 = class302;
        index2.method3537(3);
    }

    static {
        anInt2150 = 0;
        aClass192_2144 = new IncommingPacket(92, 4);
    }
}
