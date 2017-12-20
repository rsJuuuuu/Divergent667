/* Class320_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub6 extends Class320
{
	static int anInt8256;
	static int anInt8257;
	static int anInt8258;
	static int anInt8259;
	static int anInt8260;
	static Index index32or34;
	static double aDouble8262;
	static byte[][] aByteArrayArray8263;
	static int anInt8264;
	static Object anObject8265;
	static int anInt8266;
	static Class124 aClass124_8267 = new Class124(32);
	
	final void method3676(boolean bool, int i) {
		anInt8256++;
		anInt4064 = i;
		if (bool != false) {
			method3675(-55, (byte) -29);
		}
	}
	
	final int method3701(boolean bool) {
		if (bool != false) {
			method3673((byte) 11);
		}
		anInt8266++;
		return anInt4064;
	}
	
	Class320_Sub6(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3675(int i, byte b) {
		anInt8260++;
		if (b != 54) {
			aClass124_8267 = null;
		}
		if (aNode_Sub27_4063.method2697(b + -143)) {
			return 3;
		}
		if (aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443) {
			return 1;
		}
		return 3;
	}
	
	Class320_Sub6(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final boolean method3702(byte b) {
		anInt8264++;
		if (b < 63) {
			method3701(true);
		}
		if (aNode_Sub27_4063.method2697(-70)) {
			return false;
		}
        return aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443;
    }
	
	final int method3677(int i) {
		if (i != 0) {
			aClass124_8267 = null;
		}
		anInt8257++;
		return 1;
	}
	
	final void method3673(byte b) {
		if (aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443) {
			if (aNode_Sub27_4063.method2697(-106)) {
				anInt4064 = 0;
			}
		} else {
			anInt4064 = 1;
		}
		if (b > -35) {
			anObject8265 = null;
		}
		anInt8258++;
		if (anInt4064 != 0 && anInt4064 != 1) {
			anInt4064 = method3677(0);
		}
	}
	
	static final void method3703(int i, byte b, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if ((i ^ 0xffffffff) == -9 || (i ^ 0xffffffff) == -17) {
			if ((i ^ 0xffffffff) == -9) {
				int i_5_ = i_2_ << Class36.anInt549;
				int i_6_ = Class179.anInt2129 + i_5_;
				int i_7_ = i_1_ << Class36.anInt549;
				int i_8_ = i_7_ + Class179.anInt2129;
				int i_9_ = Node_Sub38_Sub37.aPlaneArray10466[i_3_].method3251(i_1_, i_2_, (byte) -118);
				int i_10_ = Node_Sub38_Sub37.aPlaneArray10466[i_3_].method3251(i_1_ - -1, i_2_ - -1, (byte) -118);
				IsaacCipher.aClass54Array1840[Class83.anInt5183++] = new Class54(i, i_3_, i_5_, i_6_, i_6_, i_5_, i_9_, i_10_, -i_4_ + i_10_, -i_4_ + i_9_, i_7_, i_8_, i_8_, i_7_);
			} else {
				int i_11_ = Class179.anInt2129 + (i_2_ << Class36.anInt549);
				int i_12_ = i_11_ + -Class179.anInt2129;
				int i_13_ = i_1_ << Class36.anInt549;
				int i_14_ = i_13_ - -Class179.anInt2129;
				int i_15_ = Node_Sub38_Sub37.aPlaneArray10466[i_3_].method3251(i_1_, i_2_ + 1, (byte) -118);
				int i_16_ = Node_Sub38_Sub37.aPlaneArray10466[i_3_].method3251(1 + i_1_, i_2_, (byte) -118);
				IsaacCipher.aClass54Array1840[Class83.anInt5183++] = new Class54(i, i_3_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, -i_4_ + i_16_, i_15_ - i_4_, i_13_, i_14_, i_14_, i_13_);
			}
		} else {
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[i_3_][i_2_][i_1_];
			if (class261 == null) {
				class261 = new Class261(i_3_);
			}
			if (i != 1) {
				if ((i ^ 0xffffffff) == -3) {
					class261.aShort3313 = (short) i_4_;
					class261.aShort3320 = (short) i_0_;
				}
			} else {
				class261.aShort3322 = (short) i_0_;
				class261.aShort3318 = (short) i_4_;
			}
			if (Class239.aBoolean2930) {
				Node_Sub32.method2729(true);
			}
		}
		anInt8259++;
		if (b < 33) {
			aDouble8262 = -1.2719813591898603;
		}
	}
	
	public static void method3704(int i) {
		int i_17_ = -14 / ((i - 61) / 58);
		aByteArrayArray8263 = null;
		index32or34 = null;
		anObject8265 = null;
		aClass124_8267 = null;
	}
	
	static final void method3705(int i, int i_18_, int i_19_, Animable_Sub4 animable_sub4, Animable_Sub4 animable_sub4_20_) {
		Class261 class261 = Node_Sub15_Sub6.method2572(i, i_18_, i_19_);
		if (class261 != null) {
			class261.anAnimable_Sub4_3315 = animable_sub4;
			class261.anAnimable_Sub4_3319 = animable_sub4_20_;
			int i_21_ = Class320_Sub10.aPlaneArray8300 == Class368.aPlaneArray4548 ? 1 : 0;
			if (animable_sub4.method814((byte) 126)) {
				if (animable_sub4.method813(0)) {
					animable_sub4.anAnimable5941 = SeekableFile.anAnimableArray3884[i_21_];
					SeekableFile.anAnimableArray3884[i_21_] = animable_sub4;
				} else {
					animable_sub4.anAnimable5941 = Class303.anAnimableArray3827[i_21_];
					Class303.anAnimableArray3827[i_21_] = animable_sub4;
					Class194_Sub1.aBoolean6892 = true;
				}
			} else {
				animable_sub4.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_21_];
				Node_Sub36.anAnimableArray7429[i_21_] = animable_sub4;
			}
			if (animable_sub4_20_ != null) {
				if (animable_sub4_20_.method814((byte) 108)) {
					if (animable_sub4_20_.method813(0)) {
						animable_sub4_20_.anAnimable5941 = SeekableFile.anAnimableArray3884[i_21_];
						SeekableFile.anAnimableArray3884[i_21_] = animable_sub4_20_;
					} else {
						animable_sub4_20_.anAnimable5941 = Class303.anAnimableArray3827[i_21_];
						Class303.anAnimableArray3827[i_21_] = animable_sub4_20_;
						Class194_Sub1.aBoolean6892 = true;
					}
				} else {
					animable_sub4_20_.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_21_];
					Node_Sub36.anAnimableArray7429[i_21_] = animable_sub4_20_;
				}
			}
		}
	}
}
