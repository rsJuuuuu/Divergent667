/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class188
{
	static int anInt2278;
	static OutcommingPacket aClass318_2279 = new OutcommingPacket(74, -1);
	private int anInt2280 = 4;
	static int anInt2281;
	protected int anInt2282;
	static int anInt2283;
	private short[] aShortArray2284;
	private short[] aShortArray2285 = new short[512];
	private int anInt2286;
	static int anInt2287 = 1;
	static int anInt2288;
	private int anInt2289;
	private int anInt2290;
	static Class124 aClass124_2291 = new Class124(12);
	
	final void method1884(int i, byte b, int i_0_, int i_1_) {
		anInt2283++;
		int[] is = new int[i_1_];
		int[] is_2_ = new int[i];
		for (int i_3_ = 0; i_1_ > i_3_; i_3_++)
			is[i_3_] = (i_3_ << 12) / i_1_;
		int[] is_4_ = new int[i_0_];
		for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
			is_2_[i_5_] = (i_5_ << 12) / i;
		int i_6_ = 0;
		for (/**/; i_0_ > i_6_; i_6_++)
			is_4_[i_6_] = (i_6_ << 12) / i_0_;
		method1890(0);
		for (int i_8_ = 0; i_0_ > i_8_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i; i_9_++) {
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_10_++) {
					for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anInt2282 ^ 0xffffffff); i_11_++) {
						int i_12_ = aShortArray2284[i_11_] << 12;
						int i_13_ = is_4_[i_8_] * i_12_ >> 12;
						int i_14_ = anInt2290 * i_12_ >> 12;
						int i_15_ = is_2_[i_9_] * i_12_ >> 12;
						int i_16_ = i_12_ * is[i_10_] >> 12;
						int i_17_ = i_12_ * anInt2280 >> 12;
						int i_18_ = anInt2286 * i_12_ >> 12;
						i_13_ *= anInt2286;
						i_15_ *= anInt2290;
						i_16_ *= anInt2280;
						int i_19_ = i_16_ >> 12;
						int i_20_ = i_19_ + 1;
						int i_21_ = i_15_ >> 12;
						i_19_ &= 0xff;
						int i_22_ = i_21_ + 1;
						int i_23_ = i_13_ >> 12;
						i_21_ &= 0xff;
						int i_24_ = 1 + i_23_;
						i_15_ &= 0xfff;
						if (i_17_ <= i_20_) {
							i_20_ = 0;
						} else {
							i_20_ &= 0xff;
						}
						i_16_ &= 0xfff;
						if (i_24_ >= i_18_) {
							i_24_ = 0;
						} else {
							i_24_ &= 0xff;
						}
						i_13_ &= 0xfff;
						if ((i_14_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)) {
							i_22_ = 0;
						} else {
							i_22_ &= 0xff;
						}
						i_23_ &= 0xff;
						int i_25_ = CacheNode_Sub17.anIntArray8840[i_16_];
						int i_26_ = CacheNode_Sub17.anIntArray8840[i_15_];
						int i_27_ = CacheNode_Sub17.anIntArray8840[i_13_];
						int i_28_ = aShortArray2285[i_24_];
						int i_29_ = aShortArray2285[i_23_];
						int i_30_ = -4096 + i_15_;
						int i_31_ = i_16_ - 4096;
						int i_32_ = -4096 + i_13_;
						int i_33_ = aShortArray2285[i_22_ + i_29_];
						int i_34_ = aShortArray2285[i_28_ + i_21_];
						int i_35_ = aShortArray2285[i_28_ + i_22_];
						int i_36_ = aShortArray2285[i_29_ + i_21_];
						int i_37_ = CacheNode_Sub13.method2344(i_13_, aShortArray2285[i_19_ + i_36_], i_16_, 5, i_15_);
						int i_38_ = CacheNode_Sub13.method2344(i_13_, aShortArray2285[i_36_ + i_20_], i_31_, 16, i_15_);
						int i_39_ = ((i_38_ - i_37_) * i_25_ >> 12) + i_37_;
						i_37_ = CacheNode_Sub13.method2344(i_13_, aShortArray2285[i_19_ + i_33_], i_16_, 108, i_30_);
						i_38_ = CacheNode_Sub13.method2344(i_13_, aShortArray2285[i_20_ + i_33_], i_31_, 64, i_30_);
						int i_40_ = i_37_ + (i_25_ * (-i_37_ + i_38_) >> 12);
						i_37_ = CacheNode_Sub13.method2344(i_32_, aShortArray2285[i_19_ - -i_34_], i_16_, 47, i_15_);
						int i_41_ = (i_26_ * (i_40_ + -i_39_) >> 12) + i_39_;
						i_38_ = CacheNode_Sub13.method2344(i_32_, aShortArray2285[i_34_ + i_20_], i_31_, 29, i_15_);
						i_39_ = i_37_ + (i_25_ * (i_38_ + -i_37_) >> 12);
						i_37_ = CacheNode_Sub13.method2344(i_32_, aShortArray2285[i_19_ - -i_35_], i_16_, 106, i_30_);
						i_38_ = CacheNode_Sub13.method2344(i_32_, aShortArray2285[i_20_ + i_35_], i_31_, 4, i_30_);
						i_40_ = ((-i_37_ + i_38_) * i_25_ >> 12) + i_37_;
						int i_42_ = ((-i_39_ + i_40_) * i_26_ >> 12) + i_39_;
						method1887((i_27_ * (-i_41_ + i_42_) >> 12) + i_41_, i_11_, -15030);
					}
					method1886(4096);
				}
			}
		}
	}
	
	private final void method1885(byte b) {
		aShortArray2284 = new short[anInt2282];
		anInt2278++;
		for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (anInt2282 ^ 0xffffffff); i_43_++)
			aShortArray2284[i_43_] = (short) (int) Math.pow(2.0, (double) i_43_);
	}
	
	abstract void method1886(int i);
	
	abstract void method1887(int i, int i_44_, int i_45_);
	
	private final void method1888(byte b) {
		anInt2288++;
		Random random = new Random((long) anInt2289);
		for (int i = 0; i < 255; i++)
			aShortArray2285[i] = (short) i;
		int i = 0;
		if (b != 121) {
			anInt2290 = -100;
		}
		for (/**/; (i ^ 0xffffffff) > -256; i++) {
			int i_46_ = 255 - i;
			int i_47_ = Class330.method3838(-5208, i_46_, random);
			short s = aShortArray2285[i_47_];
			aShortArray2285[i_47_] = aShortArray2285[i_46_];
			aShortArray2285[i_46_] = aShortArray2285[256 + i_46_] = s;
		}
	}
	
	public static void method1889(byte b) {
		aClass318_2279 = null;
		aClass124_2291 = null;
		if (b <= 126) {
			method1889((byte) -127);
		}
	}
	
	abstract void method1890(int i);
	
	Class188(int i, int i_48_, int i_49_, int i_50_, int i_51_) {
		anInt2282 = 4;
		anInt2290 = 4;
		anInt2286 = 4;
		anInt2289 = 0;
		anInt2286 = i_51_;
		anInt2290 = i_50_;
		anInt2280 = i_49_;
		anInt2289 = i;
		anInt2282 = i_48_;
		method1885((byte) 83);
		method1888((byte) 121);
	}
}
