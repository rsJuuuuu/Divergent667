/* Node_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub49 extends Node
{
	private static float[] aFloatArray7589;
	private static int[] anIntArray7590;
	private boolean aBoolean7591;
	private static byte[] aByteArray7592;
	private static int anInt7593;
	private static Class183[] aClass183Array7594;
	private int anInt7595;
	private boolean aBoolean7596;
	private int anInt7597;
	private static int[] anIntArray7598;
	private static float[] aFloatArray7599;
	private static boolean aBoolean7600 = false;
	private static float[] aFloatArray7601;
	private int anInt7602;
	private static float[] aFloatArray7603;
	private static int anInt7604;
	private static boolean[] aBooleanArray7605;
	private static float[] aFloatArray7606;
	private static Class31[] aClass31Array7607;
	private static Class334[] aClass334Array7608;
	private static int[] anIntArray7609;
	private static int anInt7610;
	static Class242[] aClass242Array7611;
	private static float[] aFloatArray7612;
	private static int anInt7613;
	private int anInt7614;
	private int anInt7615;
	private byte[][] aByteArrayArray7616;
	private float[] aFloatArray7617;
	private static float[] aFloatArray7618;
	private int anInt7619;
	private int anInt7620;
	private byte[] aByteArray7621;
	private int anInt7622;
	
	static final Node_Sub49 method2954(Index class302, int i) {
		if (!method2961(class302)) {
			class302.method3510(i, (byte) 63);
			return null;
		}
		byte[] bs = class302.method3518((byte) -126, i);
		if (bs == null) {
			return null;
		}
		return new Node_Sub49(bs);
	}
	
	private final void method2955(byte[] bs) {
		BufferedStream buffer = new BufferedStream(bs);
		anInt7602 = buffer.readInt();
		anInt7614 = buffer.readInt();
		anInt7615 = buffer.readInt();
		anInt7597 = buffer.readInt();
		if (anInt7597 < 0) {
			anInt7597 = anInt7597 ^ 0xffffffff;
			aBoolean7596 = true;
		}
		int i = buffer.readInt();
		aByteArrayArray7616 = new byte[i][];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = 0;
			int i_2_;
			do {
				i_2_ = buffer.readUnsignedByte();
				i_1_ += i_2_;
			} while (i_2_ >= 255);
			byte[] bs_3_ = new byte[i_1_];
			buffer.readBytes(bs_3_, 0, i_1_);
			aByteArrayArray7616[i_0_] = bs_3_;
		}
	}
	
	static final int method2956(int i) {
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_;
		for (/**/; i >= 8 - anInt7593; i -= i_6_) {
			i_6_ = 8 - anInt7593;
			int i_7_ = (1 << i_6_) - 1;
			i_4_ += (aByteArray7592[anInt7610] >> anInt7593 & i_7_) << i_5_;
			anInt7593 = 0;
			anInt7610++;
			i_5_ += i_6_;
		}
		if (i > 0) {
			i_6_ = (1 << i) - 1;
			i_4_ += (aByteArray7592[anInt7610] >> anInt7593 & i_6_) << i_5_;
			anInt7593 += i;
		}
		return i_4_;
	}
	
	public static void method2957() {
		aByteArray7592 = null;
		aClass242Array7611 = null;
		aClass31Array7607 = null;
		aClass183Array7594 = null;
		aClass334Array7608 = null;
		aBooleanArray7605 = null;
		anIntArray7590 = null;
		aFloatArray7601 = null;
		aFloatArray7603 = null;
		aFloatArray7618 = null;
		aFloatArray7606 = null;
		aFloatArray7599 = null;
		aFloatArray7612 = null;
		aFloatArray7589 = null;
		anIntArray7609 = null;
		anIntArray7598 = null;
	}
	
	final Node_Sub45_Sub1 method2958(int[] is) {
		if (is != null && is[0] <= 0) {
			return null;
		}
		if (aByteArray7621 == null) {
			anInt7619 = 0;
			aFloatArray7617 = new float[anInt7613];
			aByteArray7621 = new byte[anInt7614];
			anInt7620 = 0;
			anInt7622 = 0;
		}
		for (/**/; anInt7622 < aByteArrayArray7616.length; anInt7622++) {
			if (is != null && is[0] <= 0) {
				return null;
			}
			float[] fs = method2959(anInt7622);
			if (fs != null) {
				int i = anInt7620;
				int i_8_ = fs.length;
				if (i_8_ > anInt7614 - i) {
					i_8_ = anInt7614 - i;
				}
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					int i_10_ = (int) (128.0F + fs[i_9_] * 128.0F);
					if ((i_10_ & ~0xff) != 0) {
						i_10_ = (i_10_ ^ 0xffffffff) >> 31;
					}
					aByteArray7621[i++] = (byte) (i_10_ - 128);
				}
				if (is != null) {
					is[0] -= i - anInt7620;
				}
				anInt7620 = i;
			}
		}
		aFloatArray7617 = null;
		byte[] bs = aByteArray7621;
		aByteArray7621 = null;
		return new Node_Sub45_Sub1(anInt7602, bs, anInt7615, anInt7597, aBoolean7596);
	}
	
	private final float[] method2959(int i) {
		method2964(aByteArrayArray7616[i], 0);
		method2965();
		int i_11_ = method2956(Node_Sub38_Sub20.method2855(anIntArray7590.length - 1, (byte) -87));
		boolean bool = aBooleanArray7605[i_11_];
		int i_12_ = bool ? anInt7613 : anInt7604;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		if (bool) {
			bool_13_ = method2965() != 0;
			bool_14_ = method2965() != 0;
		}
		int i_15_ = i_12_ >> 1;
		int i_16_;
		int i_17_;
		int i_18_;
		if (bool && !bool_13_) {
			i_16_ = (i_12_ >> 2) - (anInt7604 >> 2);
			i_17_ = (i_12_ >> 2) + (anInt7604 >> 2);
			i_18_ = anInt7604 >> 1;
		} else {
			i_16_ = 0;
			i_17_ = i_15_;
			i_18_ = i_12_ >> 1;
		}
		int i_19_;
		int i_20_;
		int i_21_;
		if (bool && !bool_14_) {
			i_19_ = i_12_ - (i_12_ >> 2) - (anInt7604 >> 2);
			i_20_ = i_12_ - (i_12_ >> 2) + (anInt7604 >> 2);
			i_21_ = anInt7604 >> 1;
		} else {
			i_19_ = i_15_;
			i_20_ = i_12_;
			i_21_ = i_12_ >> 1;
		}
		Class334 class334 = aClass334Array7608[anIntArray7590[i_11_]];
		int i_22_ = class334.anInt4157;
		int i_23_ = class334.anIntArray4158[i_22_];
		boolean bool_24_ = !aClass31Array7607[i_23_].method348();
		boolean bool_25_ = bool_24_;
		for (int i_26_ = 0; i_26_ < class334.anInt4156; i_26_++) {
			Class183 class183 = aClass183Array7594[class334.anIntArray4159[i_26_]];
			float[] fs = aFloatArray7601;
			class183.method1842(fs, i_12_ >> 1, bool_25_);
		}
		if (!bool_24_) {
			int i_27_ = class334.anInt4157;
			int i_28_ = class334.anIntArray4158[i_27_];
			aClass31Array7607[i_28_].method345(aFloatArray7601, i_12_ >> 1);
		}
		if (bool_24_) {
			for (int i_29_ = i_12_ >> 1; i_29_ < i_12_; i_29_++)
				aFloatArray7601[i_29_] = 0.0F;
		} else {
			int i_30_ = i_12_ >> 1;
			int i_31_ = i_12_ >> 2;
			int i_32_ = i_12_ >> 3;
			float[] fs = aFloatArray7601;
			for (int i_33_ = 0; i_33_ < i_30_; i_33_++)
				fs[i_33_] *= 0.5F;
			for (int i_34_ = i_30_; i_34_ < i_12_; i_34_++)
				fs[i_34_] = -fs[i_12_ - i_34_ - 1];
			float[] fs_35_ = bool ? aFloatArray7599 : aFloatArray7603;
			float[] fs_36_ = bool ? aFloatArray7612 : aFloatArray7618;
			float[] fs_37_ = bool ? aFloatArray7589 : aFloatArray7606;
			int[] is = bool ? anIntArray7598 : anIntArray7609;
			for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
				float f = fs[4 * i_38_] - fs[i_12_ - 4 * i_38_ - 1];
				float f_39_ = fs[4 * i_38_ + 2] - fs[i_12_ - 4 * i_38_ - 3];
				float f_40_ = fs_35_[2 * i_38_];
				float f_41_ = fs_35_[2 * i_38_ + 1];
				fs[i_12_ - 4 * i_38_ - 1] = f * f_40_ - f_39_ * f_41_;
				fs[i_12_ - 4 * i_38_ - 3] = f * f_41_ + f_39_ * f_40_;
			}
			for (int i_42_ = 0; i_42_ < i_32_; i_42_++) {
				float f = fs[i_30_ + 3 + 4 * i_42_];
				float f_43_ = fs[i_30_ + 1 + 4 * i_42_];
				float f_44_ = fs[4 * i_42_ + 3];
				float f_45_ = fs[4 * i_42_ + 1];
				fs[i_30_ + 3 + 4 * i_42_] = f + f_44_;
				fs[i_30_ + 1 + 4 * i_42_] = f_43_ + f_45_;
				float f_46_ = fs_35_[i_30_ - 4 - 4 * i_42_];
				float f_47_ = fs_35_[i_30_ - 3 - 4 * i_42_];
				fs[4 * i_42_ + 3] = (f - f_44_) * f_46_ - (f_43_ - f_45_) * f_47_;
				fs[4 * i_42_ + 1] = (f_43_ - f_45_) * f_46_ + (f - f_44_) * f_47_;
			}
			int i_48_ = Node_Sub38_Sub20.method2855(i_12_ - 1, (byte) -95);
			for (int i_49_ = 0; i_49_ < i_48_ - 3; i_49_++) {
				int i_50_ = i_12_ >> i_49_ + 2;
				int i_51_ = 8 << i_49_;
				for (int i_52_ = 0; i_52_ < 2 << i_49_; i_52_++) {
					int i_53_ = i_12_ - i_50_ * 2 * i_52_;
					int i_54_ = i_12_ - i_50_ * (2 * i_52_ + 1);
					for (int i_55_ = 0; i_55_ < i_12_ >> i_49_ + 4; i_55_++) {
						int i_56_ = 4 * i_55_;
						float f = fs[i_53_ - 1 - i_56_];
						float f_57_ = fs[i_53_ - 3 - i_56_];
						float f_58_ = fs[i_54_ - 1 - i_56_];
						float f_59_ = fs[i_54_ - 3 - i_56_];
						fs[i_53_ - 1 - i_56_] = f + f_58_;
						fs[i_53_ - 3 - i_56_] = f_57_ + f_59_;
						float f_60_ = fs_35_[i_55_ * i_51_];
						float f_61_ = fs_35_[i_55_ * i_51_ + 1];
						fs[i_54_ - 1 - i_56_] = (f - f_58_) * f_60_ - (f_57_ - f_59_) * f_61_;
						fs[i_54_ - 3 - i_56_] = (f_57_ - f_59_) * f_60_ + (f - f_58_) * f_61_;
					}
				}
			}
			for (int i_62_ = 1; i_62_ < i_32_ - 1; i_62_++) {
				int i_63_ = is[i_62_];
				if (i_62_ < i_63_) {
					int i_64_ = 8 * i_62_;
					int i_65_ = 8 * i_63_;
					float f = fs[i_64_ + 1];
					fs[i_64_ + 1] = fs[i_65_ + 1];
					fs[i_65_ + 1] = f;
					f = fs[i_64_ + 3];
					fs[i_64_ + 3] = fs[i_65_ + 3];
					fs[i_65_ + 3] = f;
					f = fs[i_64_ + 5];
					fs[i_64_ + 5] = fs[i_65_ + 5];
					fs[i_65_ + 5] = f;
					f = fs[i_64_ + 7];
					fs[i_64_ + 7] = fs[i_65_ + 7];
					fs[i_65_ + 7] = f;
				}
			}
			for (int i_66_ = 0; i_66_ < i_30_; i_66_++)
				fs[i_66_] = fs[2 * i_66_ + 1];
			for (int i_67_ = 0; i_67_ < i_32_; i_67_++) {
				fs[i_12_ - 1 - 2 * i_67_] = fs[4 * i_67_];
				fs[i_12_ - 2 - 2 * i_67_] = fs[4 * i_67_ + 1];
				fs[i_12_ - i_31_ - 1 - 2 * i_67_] = fs[4 * i_67_ + 2];
				fs[i_12_ - i_31_ - 2 - 2 * i_67_] = fs[4 * i_67_ + 3];
			}
			for (int i_68_ = 0; i_68_ < i_32_; i_68_++) {
				float f = fs_37_[2 * i_68_];
				float f_69_ = fs_37_[2 * i_68_ + 1];
				float f_70_ = fs[i_30_ + 2 * i_68_];
				float f_71_ = fs[i_30_ + 2 * i_68_ + 1];
				float f_72_ = fs[i_12_ - 2 - 2 * i_68_];
				float f_73_ = fs[i_12_ - 1 - 2 * i_68_];
				float f_74_ = f_69_ * (f_70_ - f_72_) + f * (f_71_ + f_73_);
				fs[i_30_ + 2 * i_68_] = (f_70_ + f_72_ + f_74_) * 0.5F;
				fs[i_12_ - 2 - 2 * i_68_] = (f_70_ + f_72_ - f_74_) * 0.5F;
				f_74_ = f_69_ * (f_71_ + f_73_) - f * (f_70_ - f_72_);
				fs[i_30_ + 2 * i_68_ + 1] = (f_71_ - f_73_ + f_74_) * 0.5F;
				fs[i_12_ - 1 - 2 * i_68_] = (-f_71_ + f_73_ + f_74_) * 0.5F;
			}
			for (int i_75_ = 0; i_75_ < i_31_; i_75_++) {
				fs[i_75_] = fs[2 * i_75_ + i_30_] * fs_36_[2 * i_75_] + fs[2 * i_75_ + 1 + i_30_] * fs_36_[2 * i_75_ + 1];
				fs[i_30_ - 1 - i_75_] = fs[2 * i_75_ + i_30_] * fs_36_[2 * i_75_ + 1] - fs[2 * i_75_ + 1 + i_30_] * fs_36_[2 * i_75_];
			}
			for (int i_76_ = 0; i_76_ < i_31_; i_76_++)
				fs[i_12_ - i_31_ + i_76_] = -fs[i_76_];
			for (int i_77_ = 0; i_77_ < i_31_; i_77_++)
				fs[i_77_] = fs[i_31_ + i_77_];
			for (int i_78_ = 0; i_78_ < i_31_; i_78_++)
				fs[i_31_ + i_78_] = -fs[i_31_ - i_78_ - 1];
			for (int i_79_ = 0; i_79_ < i_31_; i_79_++)
				fs[i_30_ + i_79_] = fs[i_12_ - i_79_ - 1];
			for (int i_80_ = i_16_; i_80_ < i_17_; i_80_++) {
				float f = (float) Math.sin(((double) (i_80_ - i_16_) + 0.5) / (double) i_18_ * 0.5 * 3.141592653589793);
				aFloatArray7601[i_80_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_81_ = i_19_; i_81_ < i_20_; i_81_++) {
				float f = (float) Math.sin(((double) (i_81_ - i_19_) + 0.5) / (double) i_21_ * 0.5 * 3.141592653589793 + 1.5707963267948966);
				aFloatArray7601[i_81_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (anInt7619 > 0) {
			int i_82_ = anInt7619 + i_12_ >> 2;
			fs = new float[i_82_];
			if (!aBoolean7591) {
				for (int i_83_ = 0; i_83_ < anInt7595; i_83_++) {
					int i_84_ = (anInt7619 >> 1) + i_83_;
					fs[i_83_] += aFloatArray7617[i_84_];
				}
			}
			if (!bool_24_) {
				for (int i_85_ = i_16_; i_85_ < i_12_ >> 1; i_85_++) {
					int i_86_ = fs.length - (i_12_ >> 1) + i_85_;
					fs[i_86_] += aFloatArray7601[i_85_];
				}
			}
		}
		float[] fs_87_ = aFloatArray7617;
		aFloatArray7617 = aFloatArray7601;
		aFloatArray7601 = fs_87_;
		anInt7619 = i_12_;
		anInt7595 = i_20_ - (i_12_ >> 1);
		aBoolean7591 = bool_24_;
		return fs;
	}
	
	private static final void method2960(byte[] bs) {
		method2964(bs, 0);
		anInt7604 = 1 << method2956(4);
		anInt7613 = 1 << method2956(4);
		aFloatArray7601 = new float[anInt7613];
		for (int i = 0; i < 2; i++) {
			int i_88_ = i != 0 ? anInt7613 : anInt7604;
			int i_89_ = i_88_ >> 1;
			int i_90_ = i_88_ >> 2;
			int i_91_ = i_88_ >> 3;
			float[] fs = new float[i_89_];
			for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
				fs[2 * i_92_] = (float) Math.cos((double) (4 * i_92_) * 3.141592653589793 / (double) i_88_);
				fs[2 * i_92_ + 1] = -(float) Math.sin((double) (4 * i_92_) * 3.141592653589793 / (double) i_88_);
			}
			float[] fs_93_ = new float[i_89_];
			for (int i_94_ = 0; i_94_ < i_90_; i_94_++) {
				fs_93_[2 * i_94_] = (float) Math.cos((double) (2 * i_94_ + 1) * 3.141592653589793 / (double) (2 * i_88_));
				fs_93_[2 * i_94_ + 1] = (float) Math.sin((double) (2 * i_94_ + 1) * 3.141592653589793 / (double) (2 * i_88_));
			}
			float[] fs_95_ = new float[i_90_];
			for (int i_96_ = 0; i_96_ < i_91_; i_96_++) {
				fs_95_[2 * i_96_] = (float) Math.cos((double) (4 * i_96_ + 2) * 3.141592653589793 / (double) i_88_);
				fs_95_[2 * i_96_ + 1] = -(float) Math.sin((double) (4 * i_96_ + 2) * 3.141592653589793 / (double) i_88_);
			}
			int[] is = new int[i_91_];
			int i_97_ = Node_Sub38_Sub20.method2855(i_91_ - 1, (byte) -102);
			for (int i_98_ = 0; i_98_ < i_91_; i_98_++)
				is[i_98_] = Node_Sub13.method2546(i_97_, -1, i_98_);
			if (i != 0) {
				aFloatArray7599 = fs;
				aFloatArray7612 = fs_93_;
				aFloatArray7589 = fs_95_;
				anIntArray7598 = is;
			} else {
				aFloatArray7603 = fs;
				aFloatArray7618 = fs_93_;
				aFloatArray7606 = fs_95_;
				anIntArray7609 = is;
			}
		}
		int i = method2956(8) + 1;
		aClass242Array7611 = new Class242[i];
		for (int i_99_ = 0; i_99_ < i; i_99_++)
			aClass242Array7611[i_99_] = new Class242();
		int i_100_ = method2956(6) + 1;
		for (int i_101_ = 0; i_101_ < i_100_; i_101_++)
			method2956(16);
		int i_102_ = method2956(6) + 1;
		aClass31Array7607 = new Class31[i_102_];
		for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
			aClass31Array7607[i_103_] = new Class31();
		int i_104_ = method2956(6) + 1;
		aClass183Array7594 = new Class183[i_104_];
		for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
			aClass183Array7594[i_105_] = new Class183();
		int i_106_ = method2956(6) + 1;
		aClass334Array7608 = new Class334[i_106_];
		for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
			aClass334Array7608[i_107_] = new Class334();
		int i_108_ = method2956(6) + 1;
		aBooleanArray7605 = new boolean[i_108_];
		anIntArray7590 = new int[i_108_];
		for (int i_109_ = 0; i_109_ < i_108_; i_109_++) {
			aBooleanArray7605[i_109_] = method2965() != 0;
			method2956(16);
			method2956(16);
			anIntArray7590[i_109_] = method2956(8);
		}
		aBoolean7600 = true;
	}
	
	private static final boolean method2961(Index class302) {
		if (!aBoolean7600) {
			byte[] bs = class302.method3524(false, 0, 0);
			if (bs == null) {
				return false;
			}
			method2960(bs);
		}
		return true;
	}
	
	static final Node_Sub49 method2962(Index class302, int i, int i_110_) {
		if (!method2961(class302)) {
			class302.method3515(i_110_, i, 0);
			return null;
		}
		byte[] bs = class302.method3524(false, i_110_, i);
		if (bs == null) {
			return null;
		}
		return new Node_Sub49(bs);
	}
	
	static final float method2963(int i) {
		int i_111_ = i & 0x1fffff;
		int i_112_ = i & ~0x7fffffff;
		int i_113_ = (i & 0x7fe00000) >> 21;
		if (i_112_ != 0) {
			i_111_ = -i_111_;
		}
		return (float) ((double) i_111_ * Math.pow(2.0, (double) (i_113_ - 788)));
	}
	
	private static final void method2964(byte[] bs, int i) {
		aByteArray7592 = bs;
		anInt7610 = i;
		anInt7593 = 0;
	}
	
	static final int method2965() {
		int i = aByteArray7592[anInt7610] >> anInt7593 & 0x1;
		anInt7593++;
		anInt7610 += anInt7593 >> 3;
		anInt7593 &= 0x7;
		return i;
	}
	
	private Node_Sub49(byte[] bs) {
		method2955(bs);
	}
}
