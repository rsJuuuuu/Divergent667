/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class232
{
	static int anInt2769;
	private CacheNode_Sub16_Sub1 aCacheNode_Sub16_Sub1_2770;
	private Class141 aClass141_2771;
	static OutcommingPacket aClass318_2772 = new OutcommingPacket(90, -1);
	private BigInteger exponent;
	static int anInt2774;
	private BufferedStream aBuffer2775;
	static int anInt2776;
	private Class34_Sub1[] aClass34_Sub1Array2777;
	static int anInt2778;
	private BigInteger modulus;
	static int anInt2780;
	static boolean[] aBooleanArray2781 = new boolean[200];
	private Class266 aClass266_2782;
	
	public static void method2135(int i) {
		if (i != 5) {
			aClass318_2772 = null;
		}
		aBooleanArray2781 = null;
		aClass318_2772 = null;
	}
	
	final boolean method2136(int i) {
		anInt2778++;
		if (aBuffer2775 != null) {
			return true;
		}
		if (aCacheNode_Sub16_Sub1_2770 == null) {
			if (aClass266_2782.method3244(24365)) {
				return false;
			}
			aCacheNode_Sub16_Sub1_2770 = aClass266_2782.method3247(255, 255, (byte) -79, true, (byte) 0);
		}
		if (aCacheNode_Sub16_Sub1_2770.aBoolean9602) {
			return false;
		}
		BufferedStream buffer = new BufferedStream(aCacheNode_Sub16_Sub1_2770.method2385(15));
		buffer.offset = 5;
		int i_0_ = buffer.readUnsignedByte();
		buffer.offset += 72 * i_0_;
		byte[] bs = new byte[buffer.buffer.length - buffer.offset];
		buffer.readBytes(bs, 0, bs.length);
		byte[] data;
		if (exponent != null && modulus != null) {
			BigInteger biginteger = new BigInteger(bs);
			BigInteger biginteger_2_ = biginteger.modPow(exponent, modulus);
			data = biginteger_2_.toByteArray();
		} else {
			data = bs;
		}
		if (data.length != 65) {
			throw new RuntimeException();
		}
		byte[] whirpoolHash = GLXToolkit.generateWhirpoolHash((byte) 125, buffer.buffer, -bs.length + buffer.offset - 5, 5);
		if (i != 255) {
			aBooleanArray2781 = null;
		}
		for (int i_4_ = 0; i_4_ < 64; i_4_++) {
			if (whirpoolHash[i_4_] != data[1 + i_4_]) {
				throw new RuntimeException();
			}
		}
		aClass34_Sub1Array2777 = new Class34_Sub1[i_0_];
		aBuffer2775 = buffer;
		return true;
	}
	
	final Class34_Sub1 method2137(MainFile class6, int i, MainFile class6_5_, byte b) {
		anInt2774++;
		if (b >= -30) {
			modulus = null;
		}
		return method2138(true, class6, i, class6_5_, 64);
	}
	
	private final Class34_Sub1 method2138(boolean bool, MainFile class6, int i, MainFile class6_6_, int i_7_) {
		anInt2780++;
		if (aBuffer2775 == null) {
			throw new RuntimeException();
		}
		if ((i ^ 0xffffffff) > -1 || i >= aClass34_Sub1Array2777.length) {
			throw new RuntimeException();
		}
		if (aClass34_Sub1Array2777[i] != null) {
			return aClass34_Sub1Array2777[i];
		}
		aBuffer2775.offset = i * 72 + 6;
		int i_8_ = aBuffer2775.readInt();
		int i_9_ = aBuffer2775.readInt();
		byte[] bs = new byte[i_7_];
		aBuffer2775.readBytes(bs, 0, 64);
		Class34_Sub1 class34_sub1 = new Class34_Sub1(i, class6, class6_6_, aClass266_2782, aClass141_2771, i_8_, bs, i_9_, bool);
		aClass34_Sub1Array2777[i] = class34_sub1;
		return class34_sub1;
	}
	
	static final int method2139(int i) {
		anInt2769++;
		if (i != -1313) {
			method2141(-113, null);
		}
		return Node_Sub38_Sub3.anInt10104++;
	}
	
	final void method2140(int i) {
		anInt2776++;
		if (aClass34_Sub1Array2777 != null) {
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (aClass34_Sub1Array2777.length ^ 0xffffffff); i_10_++) {
				if (aClass34_Sub1Array2777[i_10_] != null) {
					aClass34_Sub1Array2777[i_10_].method385(false);
				}
			}
			for (int i_11_ = i; (aClass34_Sub1Array2777.length ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
				if (aClass34_Sub1Array2777[i_11_] != null) {
					aClass34_Sub1Array2777[i_11_].method380(0);
				}
			}
		}
	}
	
	static final void method2141(int i, Plane plane) {
		Class320_Sub10.aPlaneArray8300[i] = plane;
	}
	
	Class232(Class266 class266, Class141 class141, BigInteger exponent, BigInteger modulus) {
		this.modulus = modulus;
		aClass266_2782 = class266;
		aClass141_2771 = class141;
		this.exponent = exponent;
		if (!aClass266_2782.method3244(24365)) {
			aCacheNode_Sub16_Sub1_2770 = aClass266_2782.method3247(255, 255, (byte) -79, true, (byte) 0);
		}
	}
}
