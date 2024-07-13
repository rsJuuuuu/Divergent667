/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;
import java.util.Objects;

public class Class232 {
    static int anInt2769;
    private CacheNode_Sub16_Sub1 aCacheNode_Sub16_Sub1_2770;
    private final Class141 aClass141_2771;
    static OutcommingPacket aClass318_2772 = new OutcommingPacket(90, -1);
    private final BigInteger exponent;
    static int anInt2774;
    private BufferedStream aBuffer2775;
    static int anInt2776;
    private Class34_Sub1[] aClass34_Sub1Array2777;
    static int anInt2778;
    private final BigInteger modulus;
    static int anInt2780;
    static boolean[] aBooleanArray2781 = new boolean[200];
    private final Class266 aClass266_2782;

    public static void method2135() {
        aBooleanArray2781 = null;
        aClass318_2772 = null;
    }

    final boolean method2136() {
        anInt2778++;
        if (aBuffer2775 != null) {
            return true;
        }
        if (aCacheNode_Sub16_Sub1_2770 == null) {
            if (aClass266_2782.method3244()) {
                return false;
            }
            aCacheNode_Sub16_Sub1_2770 = aClass266_2782.method3247(255, 255, true, (byte) 0);
        }
        if (aCacheNode_Sub16_Sub1_2770.aBoolean9602) {
            return false;
        }
        BufferedStream buffer = new BufferedStream(aCacheNode_Sub16_Sub1_2770.method2385());
        buffer.offset = 5;
        int i_0_ = buffer.readUnsignedByte();
        buffer.offset += 72 * i_0_;
        byte[] bs = new byte[buffer.buffer.length - buffer.offset];
        buffer.readBytes(bs, 0, bs.length);
        byte[] data;
        if (exponent == null || modulus == null) {
            data = bs;
        } else {
            BigInteger biginteger = new BigInteger(bs);
            BigInteger biginteger_2_ = biginteger.modPow(exponent, modulus);
            data = biginteger_2_.toByteArray();
        }
        if (data.length != 65) {
            throw new RuntimeException();
        }
        byte[] whirpoolHash = GLXToolkit.generateWhirpoolHash((byte) 125, buffer.buffer, -bs.length + buffer.offset - 5, 5);
        for (int i_4_ = 0; i_4_ < 64; i_4_++) {
            if (Objects.requireNonNull(whirpoolHash)[i_4_] != data[1 + i_4_]) {
                throw new RuntimeException();
            }
        }
        aClass34_Sub1Array2777 = new Class34_Sub1[i_0_];
        aBuffer2775 = buffer;
        return true;
    }

    final Class34_Sub1 method2137(MainFile class6, int i, MainFile class6_5_) {
        anInt2774++;
        return method2138(class6, i, class6_5_);
    }

    private Class34_Sub1 method2138(MainFile class6, int i, MainFile class6_6_) {
        anInt2780++;
        if (aBuffer2775 == null) {
            throw new RuntimeException();
        }
        if (i < 0 || i >= aClass34_Sub1Array2777.length) {
            throw new RuntimeException();
        }
        if (aClass34_Sub1Array2777[i] != null) {
            return aClass34_Sub1Array2777[i];
        }
        aBuffer2775.offset = i * 72 + 6;
        int i_8_ = aBuffer2775.readInt();
        int i_9_ = aBuffer2775.readInt();
        byte[] bs = new byte[64];
        aBuffer2775.readBytes(bs, 0, 64);
        Class34_Sub1 class34_sub1 = new Class34_Sub1(i, class6, class6_6_, aClass266_2782, aClass141_2771, i_8_, bs, i_9_);
        aClass34_Sub1Array2777[i] = class34_sub1;
        return class34_sub1;
    }

    static int method2139() {
        anInt2769++;
        return Node_Sub38_Sub3.anInt10104++;
    }

    final void method2140() {
        anInt2776++;
        if (aClass34_Sub1Array2777 != null) {
            for (Class34_Sub1 class34Sub1 : aClass34_Sub1Array2777) {
                if (class34Sub1 != null) {
                    class34Sub1.method385();
                }
            }
            for (Class34_Sub1 class34_sub1 : aClass34_Sub1Array2777) {
                if (class34_sub1 != null) {
                    class34_sub1.method380();
                }
            }
        }
    }

    static void method2141(int i, Plane plane) {
        Class320_Sub10.aPlaneArray8300[i] = plane;
    }

    Class232(Class266 class266, Class141 class141, BigInteger exponent, BigInteger modulus) {
        this.modulus = modulus;
        aClass266_2782 = class266;
        aClass141_2771 = class141;
        this.exponent = exponent;
        if (!aClass266_2782.method3244()) {
            aCacheNode_Sub16_Sub1_2770 = aClass266_2782.method3247(255, 255, true, (byte) 0);
        }
    }
}
