/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class190
{
	static boolean[] aBooleanArray2326 = new boolean[100];
	static int anInt2327;
	static int[] anIntArray2328;
	protected int anInt2329;
	static Class299 aClass299_2330;
	static int anInt2331;
	protected int anInt2332 = 128;
	protected int anInt2333;
	static int anInt2334;
	protected int anInt2335;
	static int anInt2336;
	protected int anInt2337;
	static int anInt2338;
	protected int anInt2339 = 128;
	static int anInt2340;
	
	static final int method1938(int i, int i_0_) {
		anInt2336++;
		if (i_0_ != 128) {
			method1940(-126);
		}
		return i >>> 8;
	}
	
	static final int method1939(int[] is, int i, int i_1_, int[] is_2_, int i_3_, byte[][] bs, byte[] bs_4_, byte[][] bs_5_) {
		anInt2334++;
		int i_6_ = is[i_3_];
		int i_7_ = i_6_ - -is_2_[i_3_];
		int i_8_ = is[i_1_];
		int i_9_ = i_8_ + is_2_[i_1_];
		int i_10_ = i_6_;
		if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
			i_10_ = i_8_;
		}
		int i_11_ = i_7_;
		if (i_7_ > i_9_) {
			i_11_ = i_9_;
		}
		int i_12_ = bs_4_[i_3_] & i;
		if ((0xff & bs_4_[i_1_] ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
			i_12_ = bs_4_[i_1_] & 0xff;
		}
		byte[] bs_13_ = bs_5_[i_3_];
		byte[] bs_14_ = bs[i_1_];
		int i_15_ = -i_6_ + i_10_;
		int i_16_ = i_10_ + -i_8_;
		for (int i_17_ = i_10_; (i_17_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_17_++) {
			int i_18_ = bs_14_[i_16_++] + bs_13_[i_15_++];
			if (i_12_ > i_18_) {
				i_12_ = i_18_;
			}
		}
		return -i_12_;
	}
	
	static final int method1940(int i) {
		if (i != 255) {
			aBooleanArray2326 = null;
		}
		anInt2327++;
		return Node_Sub30.method2721(false, false);
	}
	
	final Class190 method1941(boolean bool) {
		if (bool != true) {
			method1941(true);
		}
		anInt2340++;
		return new Class190(anInt2335, anInt2339, anInt2332, anInt2337, anInt2329, anInt2333);
	}
	
	public static void method1942(byte b) {
		anIntArray2328 = null;
		aClass299_2330 = null;
		@SuppressWarnings("unused")
		int i = -17 / ((-64 - b) / 51);
		aBooleanArray2326 = null;
	}
	
	final void method1943(byte b, Class190 class190_19_) {
		anInt2333 = class190_19_.anInt2333;
		if (b != -106) {
			method1941(true);
		}
		anInt2332 = class190_19_.anInt2332;
		anInt2335 = class190_19_.anInt2335;
		anInt2337 = class190_19_.anInt2337;
		anInt2329 = class190_19_.anInt2329;
		anInt2339 = class190_19_.anInt2339;
		anInt2338++;
	}
	
	Class190(int i) {
		anInt2335 = i;
	}
	
	private Class190(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		anInt2329 = i_23_;
		anInt2339 = i_20_;
		anInt2337 = i_22_;
		anInt2335 = i;
		anInt2332 = i_21_;
		anInt2333 = i_24_;
	}
}
