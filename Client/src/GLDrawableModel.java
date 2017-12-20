/* GLDrawableModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

import java.awt.Color;

public class GLDrawableModel extends DrawableModel
{
	static int anInt5586;
	static int anInt5587;
	private int[] anIntArray5588;
	private short aShort5589;
	static Color[] aColorArray5590;
	private int[][] anIntArrayArray5591;
	private Class319 aClass319_5592;
	static int anInt5593;
	static int anInt5594;
	private int[] anIntArray5595;
	private Class218[] aClass218Array5596;
	private short aShort5597;
	static int anInt5598;
	private boolean aBoolean5599;
	private short aShort5600;
	static int anInt5601;
	static int anInt5602;
	static int anInt5603;
	private Class69 aClass69_5604;
	static int anInt5605;
	static int anInt5606;
	static int anInt5607;
	private short aShort5608;
	private float[] aFloatArray5609;
	private short aShort5610;
	private boolean aBoolean5611 = true;
	static int anInt5612;
	static int anInt5613;
	static int anInt5614;
	private int[][] anIntArrayArray5615;
	private int anInt5616;
	static int anInt5617;
	private short[] aShortArray5618;
	private short aShort5619;
	static int anInt5620;
	static int anInt5621;
	private short[] aShortArray5622;
	static int anInt5623;
	static int anInt5624;
	static int anInt5625;
	static float[] aFloatArray5626 = new float[4];
	private Class72[] aClass72Array5627;
	static int anInt5628;
	private short[] aShortArray5629;
	static int anInt5630;
	static int anInt5631;
	static int anInt5632;
	private int[] anIntArray5633;
	static int anInt5634;
	private short[] aShortArray5635;
	static int anInt5636;
	private int[] anIntArray5637;
	static int anInt5638;
	private int anInt5639;
	private byte[] aByteArray5640;
	static int anInt5641;
	static int anInt5642;
	private Interface1 anInterface1_5643;
	private int anInt5644;
	static int anInt5645;
	static int anInt5646;
	static int anInt5647;
	static int anInt5648;
	private Class69 aClass69_5649;
	private float[] aFloatArray5650;
	private byte aByte5651;
	static int anInt5652;
	private int anInt5653;
	private Class69 aClass69_5654;
	static int anInt5655;
	static int anInt5656;
	static int anInt5657;
	private byte[] aByteArray5658;
	private int anInt5659;
	static int anInt5660;
	static int anInt5661;
	static int anInt5662;
	static int anInt5663;
	private short aShort5664;
	private int anInt5665;
	static int anInt5666;
	static int anInt5667;
	static int anInt5668;
	static int anInt5669;
	private boolean aBoolean5670 = false;
	private short aShort5671;
	private int anInt5672;
	static int anInt5673;
	private Class190[] aClass190Array5674;
	private Class107 aClass107_5675;
	static int anInt5676;
	private short aShort5677;
	static int anInt5678;
	private short[] aShortArray5679;
	static int anInt5680;
	private Class300[] aClass300Array5681;
	static int anInt5682;
	private short[] aShortArray5683;
	private int[][] anIntArrayArray5684;
	private short[] aShortArray5685;
	private short aShort5686;
	private int[] anIntArray5687;
	static int anInt5688;
	private Class69 aClass69_5689;
	static int anInt5690;
	private short[] aShortArray5691;
	private GLToolkit aGLToolkit5692;
	private short[] aShortArray5693;
	static int anInt5694;
	static int anInt5695;
	private Interface9 anInterface9_5696;
	static int anInt5697;
	private boolean aBoolean5698;
	private short[] aShortArray5699;
	static int anInt5700;
	static int anInt5701;
	static int anInt5702;
	static int anInt5703;
	static int anInt5704;
	static int anInt5705;
	private short[] aShortArray5706;
	static int anInt5707;
	static Class212 aClass212_5708;
	private int anInt5709;
	static int anInt5710;
	
	final void aa(short s, short s_0_) {
		anInt5707++;
		d var_d = aGLToolkit5692.aD1543;
		for (int i = 0; (anInt5709 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (s == aShortArray5699[i]) {
				aShortArray5699[i] = s_0_;
			}
		}
		byte b = 0;
		byte b_1_ = 0;
		if (s != -1) {
			Class91 class91 = var_d.method10(0xffff & s, -8217);
			b = class91.aByte1225;
			b_1_ = class91.aByte1217;
		}
		byte b_2_ = 0;
		byte b_3_ = 0;
		if (s_0_ != -1) {
			Class91 class91 = var_d.method10(s_0_ & 0xffff, -8217);
			b_2_ = class91.aByte1225;
			b_3_ = class91.aByte1217;
			if (class91.aByte1211 != 0 || (class91.aByte1203 ^ 0xffffffff) != -1) {
				aBoolean5670 = true;
			}
		}
		if (b_2_ != b | b_1_ != b_3_) {
			if (aClass72Array5627 != null) {
				for (int i = 0; i < anInt5659; i++) {
					Class72 class72 = aClass72Array5627[i];
					Class190 class190 = aClass190Array5674[i];
					class190.anInt2335 = ~0xffffff & class190.anInt2335 | 0xffffff & Class85.anIntArray1158[aShortArray5693[class72.anInt975] & 0xffff];
				}
			}
			if (aClass69_5604 != null) {
				aClass69_5604.anInterface9_939 = null;
			}
		}
	}
	
	final int HA() {
		anInt5641++;
		if (!aBoolean5698) {
			method640((byte) -105);
		}
		return aShort5589;
	}
	
	final boolean method624(int i, int i_4_, Class336 class336, boolean bool, int i_5_) {
		anInt5701++;
		return method639(class336, bool, 96, i_4_, i, -1, i_5_);
	}
	
	private final boolean method639(Class336 class336, boolean bool, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		anInt5666++;
		Class336_Sub3 class336_sub3 = (Class336_Sub3) class336;
		Class336_Sub3 class336_sub3_10_ = aGLToolkit5692.aClass336_Sub3_6639;
		float f = class336_sub3_10_.aFloat8594 + (class336_sub3.aFloat8609 * class336_sub3_10_.aFloat8608 + class336_sub3.aFloat8594 * class336_sub3_10_.aFloat8596 + class336_sub3_10_.aFloat8617 * class336_sub3.aFloat8615);
		float f_11_ = class336_sub3_10_.aFloat8609 + (class336_sub3_10_.aFloat8607 * class336_sub3.aFloat8609 + class336_sub3.aFloat8594 * class336_sub3_10_.aFloat8625 + class336_sub3.aFloat8615 * class336_sub3_10_.aFloat8591);
		Class200_Sub1.aFloat5140 = class336_sub3.aFloat8607 * class336_sub3_10_.aFloat8593 + class336_sub3.aFloat8608 * class336_sub3_10_.aFloat8605 + class336_sub3.aFloat8593 * class336_sub3_10_.aFloat8604;
		Class188_Sub1_Sub2.aFloat9346 = class336_sub3_10_.aFloat8625 * class336_sub3.aFloat8596 + class336_sub3_10_.aFloat8607 * class336_sub3.aFloat8625 + class336_sub3_10_.aFloat8591 * class336_sub3.aFloat8605;
		Class129.aFloat1663 = class336_sub3.aFloat8593 * class336_sub3_10_.aFloat8617 + (class336_sub3_10_.aFloat8608 * class336_sub3.aFloat8607 + class336_sub3_10_.aFloat8596 * class336_sub3.aFloat8608);
		Class210.aFloat2496 = class336_sub3.aFloat8625 * class336_sub3_10_.aFloat8608 + class336_sub3.aFloat8596 * class336_sub3_10_.aFloat8596 + class336_sub3.aFloat8605 * class336_sub3_10_.aFloat8617;
		Class107.aFloat1361 = class336_sub3_10_.aFloat8593 * class336_sub3.aFloat8591 + class336_sub3.aFloat8617 * class336_sub3_10_.aFloat8605 + class336_sub3.aFloat8604 * class336_sub3_10_.aFloat8604;
		Node_Sub38_Sub19.aFloat10295 = class336_sub3.aFloat8591 * class336_sub3_10_.aFloat8607 + class336_sub3.aFloat8617 * class336_sub3_10_.aFloat8625 + class336_sub3.aFloat8604 * class336_sub3_10_.aFloat8591;
		Class204.aFloat2459 = class336_sub3_10_.aFloat8617 * class336_sub3.aFloat8604 + (class336_sub3_10_.aFloat8608 * class336_sub3.aFloat8591 + class336_sub3.aFloat8617 * class336_sub3_10_.aFloat8596);
		Class51.aFloat5343 = class336_sub3_10_.aFloat8625 * class336_sub3.aFloat8608 + class336_sub3_10_.aFloat8607 * class336_sub3.aFloat8607 + class336_sub3.aFloat8593 * class336_sub3_10_.aFloat8591;
		float f_12_ = class336_sub3_10_.aFloat8615 + (class336_sub3_10_.aFloat8605 * class336_sub3.aFloat8594 + class336_sub3.aFloat8609 * class336_sub3_10_.aFloat8593 + class336_sub3.aFloat8615 * class336_sub3_10_.aFloat8604);
		Class155.aFloat1954 = class336_sub3.aFloat8625 * class336_sub3_10_.aFloat8593 + class336_sub3_10_.aFloat8605 * class336_sub3.aFloat8596 + class336_sub3.aFloat8605 * class336_sub3_10_.aFloat8604;
		boolean bool_13_ = false;
		float f_14_ = 3.4028235E38F;
		float f_15_ = -3.4028235E38F;
		float f_16_ = 3.4028235E38F;
		float f_17_ = -3.4028235E38F;
		int i_18_ = aGLToolkit5692.anInt6667;
		int i_19_ = aGLToolkit5692.anInt6730;
		if (!aBoolean5698) {
			method640((byte) 32);
		}
		int i_20_ = aShort5597 - aShort5619 >> 1;
		int i_21_ = -aShort5600 + aShort5671 >> 1;
		int i_22_ = aShort5677 - aShort5589 >> 1;
		if (i <= 58) {
			anInt5659 = -72;
		}
		int i_23_ = aShort5619 + i_20_;
		int i_24_ = aShort5600 + i_21_;
		int i_25_ = aShort5589 - -i_22_;
		int i_26_ = -(i_20_ << i_9_) + i_23_;
		int i_27_ = i_24_ + -(i_21_ << i_9_);
		int i_28_ = -(i_22_ << i_9_) + i_25_;
		int i_29_ = (i_20_ << i_9_) + i_23_;
		int i_30_ = (i_21_ << i_9_) + i_24_;
		int i_31_ = (i_22_ << i_9_) + i_25_;
		Class320_Sub18.anIntArray8382[0] = i_26_;
		Class339_Sub4.anIntArray8668[0] = i_27_;
		Class320_Sub18.anIntArray8382[1] = i_29_;
		Class291_Sub1.anIntArray8193[0] = i_28_;
		Class339_Sub4.anIntArray8668[1] = i_27_;
		Class291_Sub1.anIntArray8193[1] = i_28_;
		Class320_Sub18.anIntArray8382[2] = i_26_;
		Class339_Sub4.anIntArray8668[2] = i_30_;
		Class320_Sub18.anIntArray8382[3] = i_29_;
		Class291_Sub1.anIntArray8193[2] = i_28_;
		Class339_Sub4.anIntArray8668[3] = i_30_;
		Class320_Sub18.anIntArray8382[4] = i_26_;
		Class291_Sub1.anIntArray8193[3] = i_28_;
		Class339_Sub4.anIntArray8668[4] = i_27_;
		Class320_Sub18.anIntArray8382[5] = i_29_;
		Class291_Sub1.anIntArray8193[4] = i_31_;
		Class339_Sub4.anIntArray8668[5] = i_27_;
		Class320_Sub18.anIntArray8382[6] = i_26_;
		Class291_Sub1.anIntArray8193[5] = i_31_;
		Class339_Sub4.anIntArray8668[6] = i_30_;
		Class320_Sub18.anIntArray8382[7] = i_29_;
		Class291_Sub1.anIntArray8193[6] = i_31_;
		Class339_Sub4.anIntArray8668[7] = i_30_;
		Class291_Sub1.anIntArray8193[7] = i_31_;
		for (int i_32_ = 0; i_32_ < 8; i_32_++) {
			float f_33_ = (float) Class320_Sub18.anIntArray8382[i_32_];
			float f_34_ = (float) Class339_Sub4.anIntArray8668[i_32_];
			float f_35_ = (float) Class291_Sub1.anIntArray8193[i_32_];
			float f_36_ = f + (f_33_ * Class210.aFloat2496 + Class129.aFloat1663 * f_34_ + f_35_ * Class204.aFloat2459);
			float f_37_ = Class200_Sub1.aFloat5140 * f_34_ + f_33_ * Class155.aFloat1954 + f_35_ * Class107.aFloat1361 + f_12_;
			float f_38_ = f_11_ + (f_35_ * Node_Sub38_Sub19.aFloat10295 + (Class188_Sub1_Sub2.aFloat9346 * f_33_ + Class51.aFloat5343 * f_34_));
			if (f_37_ >= (float) aGLToolkit5692.anInt6693) {
				if (i_8_ > 0) {
					f_37_ = (float) i_8_;
				}
				float f_39_ = (float) aGLToolkit5692.anInt6714 + (float) i_18_ * f_36_ / f_37_;
				float f_40_ = (float) i_19_ * f_38_ / f_37_ + (float) aGLToolkit5692.anInt6702;
				if (f_14_ > f_39_) {
					f_14_ = f_39_;
				}
				if (f_15_ < f_39_) {
					f_15_ = f_39_;
				}
				bool_13_ = true;
				if (f_40_ > f_17_) {
					f_17_ = f_40_;
				}
				if (f_40_ < f_16_) {
					f_16_ = f_40_;
				}
			}
		}
		if (bool_13_ && (float) i_7_ > f_14_ && (float) i_7_ < f_15_ && f_16_ < (float) i_6_ && (float) i_6_ < f_17_) {
			if (bool) {
				return true;
			}
			if ((aGLToolkit5692.anIntArray6747.length ^ 0xffffffff) > (anInt5665 ^ 0xffffffff)) {
				aGLToolkit5692.anIntArray6749 = new int[anInt5665];
				aGLToolkit5692.anIntArray6747 = new int[anInt5665];
			}
			int[] is = aGLToolkit5692.anIntArray6747;
			int[] is_41_ = aGLToolkit5692.anIntArray6749;
			for (int i_42_ = 0; i_42_ < anInt5672; i_42_++) {
				float f_43_ = (float) anIntArray5595[i_42_];
				float f_44_ = (float) anIntArray5637[i_42_];
				float f_45_ = (float) anIntArray5588[i_42_];
				float f_46_ = f_12_ + (Class107.aFloat1361 * f_44_ + (f_45_ * Class200_Sub1.aFloat5140 + f_43_ * Class155.aFloat1954));
				float f_47_ = f_45_ * Class129.aFloat1663 + Class210.aFloat2496 * f_43_ + f_44_ * Class204.aFloat2459 + f;
				float f_48_ = Class188_Sub1_Sub2.aFloat9346 * f_43_ + Class51.aFloat5343 * f_45_ + f_44_ * Node_Sub38_Sub19.aFloat10295 + f_11_;
				if (f_46_ >= (float) aGLToolkit5692.anInt6693) {
					if (i_8_ > 0) {
						f_46_ = (float) i_8_;
					}
					int i_49_ = (int) ((float) i_18_ * f_47_ / f_46_ + (float) aGLToolkit5692.anInt6714);
					int i_50_ = (int) ((float) aGLToolkit5692.anInt6702 + (float) i_19_ * f_48_ / f_46_);
					int i_51_ = anIntArray5633[i_42_];
					int i_52_ = anIntArray5633[i_42_ + 1];
					for (int i_53_ = i_51_; (i_53_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff); i_53_++) {
						int i_54_ = aShortArray5679[i_53_] - 1;
						if (i_54_ == -1) {
							break;
						}
						is[i_54_] = i_49_;
						is_41_[i_54_] = i_50_;
					}
				} else {
					int i_55_ = anIntArray5633[i_42_];
					int i_56_ = anIntArray5633[i_42_ - -1];
					for (int i_57_ = i_55_; (i_56_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
						int i_58_ = aShortArray5679[i_57_] + -1;
						if (i_58_ == -1) {
							break;
						}
						is[aShortArray5679[i_57_] - 1] = -999999;
					}
				}
			}
			for (int i_59_ = 0; i_59_ < anInt5709; i_59_++) {
				if ((is[aShortArray5622[i_59_]] ^ 0xffffffff) != 999998 && is[aShortArray5683[i_59_]] != -999999 && is[aShortArray5706[i_59_]] != -999999 && method647(is[aShortArray5683[i_59_]], is[aShortArray5622[i_59_]], is_41_[aShortArray5706[i_59_]], i_7_, 46, is_41_[aShortArray5683[i_59_]], is[aShortArray5706[i_59_]], is_41_[aShortArray5622[i_59_]], i_6_)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private final void method640(byte b) {
		anInt5631++;
		int i = 32767;
		int i_60_ = 32767;
		int i_61_ = 32767;
		int i_62_ = -32768;
		int i_63_ = -32768;
		int i_65_ = -32768;
		int i_66_ = 0;
		int i_67_ = 0;
		for (int i_68_ = 0; i_68_ < anInt5672; i_68_++) {
			int i_69_ = anIntArray5595[i_68_];
			int i_70_ = anIntArray5588[i_68_];
			if ((i_63_ ^ 0xffffffff) > (i_70_ ^ 0xffffffff)) {
				i_63_ = i_70_;
			}
			if ((i_69_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
				i = i_69_;
			}
			int i_71_ = anIntArray5637[i_68_];
			if (i_70_ < i_60_) {
				i_60_ = i_70_;
			}
			if ((i_69_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff)) {
				i_62_ = i_69_;
			}
			if (i_71_ > i_65_) {
				i_65_ = i_71_;
			}
			if (i_71_ < i_61_) {
				i_61_ = i_71_;
			}
			int i_72_ = i_71_ * i_71_ + i_69_ * i_69_;
			if (i_66_ < i_72_) {
				i_66_ = i_72_;
			}
			i_72_ = i_71_ * i_71_ + i_69_ * i_69_ + i_70_ * i_70_;
			if ((i_67_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff)) {
				i_67_ = i_72_;
			}
		}
		aShort5671 = (short) i_63_;
		aShort5600 = (short) i_60_;
		aShort5589 = (short) i_61_;
		aShort5677 = (short) i_65_;
		aShort5619 = (short) i;
		aShort5597 = (short) i_62_;
		aShort5686 = (short) (int) (0.99 + Math.sqrt((double) i_66_));
		aShort5610 = (short) (int) (Math.sqrt((double) i_67_) + 0.99);
		aBoolean5698 = true;
	}
	
	final void O(int i, int i_73_, int i_74_) {
		for (int i_75_ = 0; anInt5672 > i_75_; i_75_++) {
			if (i != 128) {
				anIntArray5595[i_75_] = anIntArray5595[i_75_] * i >> 7;
			}
			if ((i_73_ ^ 0xffffffff) != -129) {
				anIntArray5588[i_75_] = i_73_ * anIntArray5588[i_75_] >> 7;
			}
			if (i_74_ != 128) {
				anIntArray5637[i_75_] = anIntArray5637[i_75_] * i_74_ >> 7;
			}
		}
		anInt5663++;
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
		aBoolean5698 = false;
	}
	
	final r ba(r var_r) {
		anInt5704++;
		if (anInt5665 == 0) {
			return null;
		}
		if (!aBoolean5698) {
			method640((byte) -109);
		}
		int i;
		int i_76_;
		if ((aGLToolkit5692.anInt6732 ^ 0xffffffff) < -1) {
			i = aShort5619 + -(aShort5671 * aGLToolkit5692.anInt6732 >> 8) >> aGLToolkit5692.anInt6611;
			i_76_ = -(aGLToolkit5692.anInt6732 * aShort5600 >> 8) + aShort5597 >> aGLToolkit5692.anInt6611;
		} else {
			i = aShort5619 - (aShort5600 * aGLToolkit5692.anInt6732 >> 8) >> aGLToolkit5692.anInt6611;
			i_76_ = -(aGLToolkit5692.anInt6732 * aShort5671 >> 8) + aShort5597 >> aGLToolkit5692.anInt6611;
		}
		int i_77_;
		int i_78_;
		if (aGLToolkit5692.anInt6717 <= 0) {
			i_77_ = -(aShort5600 * aGLToolkit5692.anInt6717 >> 8) + aShort5589 >> aGLToolkit5692.anInt6611;
			i_78_ = aShort5677 - (aShort5671 * aGLToolkit5692.anInt6717 >> 8) >> aGLToolkit5692.anInt6611;
		} else {
			i_77_ = -(aShort5671 * aGLToolkit5692.anInt6717 >> 8) + aShort5589 >> aGLToolkit5692.anInt6611;
			i_78_ = -(aGLToolkit5692.anInt6717 * aShort5600 >> 8) + aShort5677 >> aGLToolkit5692.anInt6611;
		}
		int i_79_ = 1 + (-i + i_76_);
		int i_80_ = -i_77_ + i_78_ - -1;
		r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
		r_Sub2 var_r_Sub2_81_;
		if (var_r_Sub2 != null && var_r_Sub2.method2373(i_80_, 0, i_79_)) {
			var_r_Sub2_81_ = var_r_Sub2;
			var_r_Sub2_81_.method2374(-8);
		} else {
			var_r_Sub2_81_ = new r_Sub2(aGLToolkit5692, i_79_, i_80_);
		}
		var_r_Sub2_81_.method2372(i_76_, i_77_, (byte) 123, i_78_, i);
		method645(var_r_Sub2_81_, true);
		return var_r_Sub2_81_;
	}
	
	private final void method641(byte b) {
		anInt5694++;
		if (aBoolean5611) {
			aBoolean5611 = false;
			if (aClass300Array5681 == null && aClass218Array5596 == null && aClass72Array5627 == null && !ProducingGraphicsBuffer.method2603(anInt5653, false, anInt5639)) {
				boolean bool = false;
				boolean bool_82_ = false;
				boolean bool_83_ = false;
				if (anIntArray5595 != null && !StandardSprite.method1215(b + -29939, anInt5653, anInt5639)) {
					if (aClass69_5654 == null || aClass69_5654.anInterface9_939 != null) {
						if (!aBoolean5698) {
							method640((byte) -112);
						}
						bool = true;
					} else {
						aBoolean5611 = true;
					}
				}
				if (anIntArray5588 != null && !Class215.method2062(36, anInt5653, anInt5639)) {
					if (aClass69_5654 != null && aClass69_5654.anInterface9_939 == null) {
						aBoolean5611 = true;
					} else {
						bool_82_ = true;
						if (!aBoolean5698) {
							method640((byte) -119);
						}
					}
				}
				if (anIntArray5637 != null && !Class13.method208(anInt5653, anInt5639, 0)) {
					if (aClass69_5654 != null && aClass69_5654.anInterface9_939 == null) {
						aBoolean5611 = true;
					} else {
						bool_83_ = true;
						if (!aBoolean5698) {
							method640((byte) 72);
						}
					}
				}
				if (bool) {
					anIntArray5595 = null;
				}
				if (bool_82_) {
					anIntArray5588 = null;
				}
				if (bool_83_) {
					anIntArray5637 = null;
				}
			}
			if (aShortArray5679 != null && anIntArray5595 == null && anIntArray5588 == null && anIntArray5637 == null) {
				anIntArray5633 = null;
				aShortArray5679 = null;
			}
			if (aByteArray5640 != null && !CacheNode_Sub5.method2307(anInt5653, b ^ ~0x10079, anInt5639)) {
				if (aClass69_5649 != null) {
					if (aClass69_5649.anInterface9_939 == null) {
						aBoolean5611 = true;
					} else {
						aShortArray5635 = aShortArray5691 = aShortArray5685 = null;
						aByteArray5640 = null;
					}
				} else if (aClass69_5604 != null && aClass69_5604.anInterface9_939 == null) {
					aBoolean5611 = true;
				} else {
					aShortArray5635 = aShortArray5691 = aShortArray5685 = null;
					aByteArray5640 = null;
				}
			}
			if (aShortArray5693 != null && !Class236.method3012(anInt5639, 0, anInt5653)) {
				if (aClass69_5604 != null && aClass69_5604.anInterface9_939 == null) {
					aBoolean5611 = true;
				} else {
					aShortArray5693 = null;
				}
			}
			if (aByteArray5658 != null && !Class343.method3967(anInt5639, anInt5653, 77)) {
				if (aClass69_5604 != null && aClass69_5604.anInterface9_939 == null) {
					aBoolean5611 = true;
				} else {
					aByteArray5658 = null;
				}
			}
			if (aFloatArray5609 != null && !Class346.method3973(anInt5639, 18518, anInt5653)) {
				if (aClass69_5689 != null && aClass69_5689.anInterface9_939 == null) {
					aBoolean5611 = true;
				} else {
					aFloatArray5609 = aFloatArray5650 = null;
				}
			}
			if (aShortArray5699 != null && !Class338.method3911(anInt5639, anInt5653, 24987)) {
				if (aClass69_5604 != null && aClass69_5604.anInterface9_939 == null) {
					aBoolean5611 = true;
				} else {
					aShortArray5699 = null;
				}
			}
			if (aShortArray5622 != null && !Node_Sub25_Sub3.method2674(anInt5639, 393216, anInt5653)) {
				if ((aClass107_5675 == null || aClass107_5675.anInterface1_1365 != null) && (aClass69_5604 == null || aClass69_5604.anInterface9_939 != null)) {
					aShortArray5622 = aShortArray5683 = aShortArray5706 = null;
				} else {
					aBoolean5611 = true;
				}
			}
			if (anIntArrayArray5591 != null && !Class316.method3661(anInt5639, anInt5653, (byte) 69)) {
				anIntArrayArray5591 = null;
				aShortArray5629 = null;
			}
			if (anIntArrayArray5684 != null && !CacheNode_Sub19.method2404(b ^ 0x27, anInt5639, anInt5653)) {
				aShortArray5618 = null;
				anIntArrayArray5684 = null;
			}
			if (b == -122) {
				if (anIntArrayArray5615 != null && !Node_Sub15_Sub1.method2557(anInt5653, 1024, anInt5639)) {
					anIntArrayArray5615 = null;
				}
				if (anIntArray5687 != null && (anInt5639 & 0x800 ^ 0xffffffff) == -1 && (0x40000 & anInt5639 ^ 0xffffffff) == -1) {
					anIntArray5687 = null;
				}
			}
		}
	}
	
	final int WA() {
		anInt5682++;
		return aShort5608;
	}
	
	final DrawableModel method633(byte b, int i, boolean bool) {
		anInt5702++;
		boolean bool_84_ = false;
		GLDrawableModel gldrawablemodel_85_;
		GLDrawableModel gldrawablemodel_86_;
		if ((b ^ 0xffffffff) >= -1 || (b ^ 0xffffffff) < -8) {
			gldrawablemodel_85_ = gldrawablemodel_86_ = new GLDrawableModel(aGLToolkit5692);
		} else {
			gldrawablemodel_85_ = aGLToolkit5692.aGLDrawableModelArray6743[-1 + b];
			bool_84_ = true;
			gldrawablemodel_86_ = aGLToolkit5692.aGLDrawableModelArray6688[-1 + b];
		}
		return method650(gldrawablemodel_86_, 255, bool_84_, bool, i, gldrawablemodel_85_);
	}
	
	private final void method642(byte b) {
		if (b > -21) {
			aGLToolkit5692 = null;
		}
		if (aClass72Array5627 != null) {
			Class336_Sub3 class336_sub3 = aGLToolkit5692.aClass336_Sub3_6604;
			aGLToolkit5692.method1454((byte) -127);
			aGLToolkit5692.C(!aBoolean5599);
			aGLToolkit5692.method1451(false, -31277);
			aGLToolkit5692.method1482((byte) 113, null, null, aGLToolkit5692.aClass69_6681, aGLToolkit5692.aClass69_6698);
			for (int i = 0; i < anInt5659; i++) {
				Class72 class72 = aClass72Array5627[i];
				Class190 class190 = aClass190Array5674[i];
				if (!class72.aBoolean978 || !aGLToolkit5692.w()) {
					float f = 0.3333333F * (float) (anIntArray5595[class72.anInt979] + (anIntArray5595[class72.anInt969] - -anIntArray5595[class72.anInt977]));
					float f_87_ = 0.3333333F * (float) (anIntArray5588[class72.anInt969] + anIntArray5588[class72.anInt977] + anIntArray5588[class72.anInt979]);
					float f_88_ = (float) (anIntArray5637[class72.anInt969] - (-anIntArray5637[class72.anInt977] + -anIntArray5637[class72.anInt979])) * 0.3333333F;
					float f_89_ = MainFile.aFloat144 + (f_88_ * Class204.aFloat2459 + (Class210.aFloat2496 * f + f_87_ * Class129.aFloat1663));
					float f_90_ = Class116.aFloat5076 + (Node_Sub38_Sub19.aFloat10295 * f_88_ + (Class51.aFloat5343 * f_87_ + Class188_Sub1_Sub2.aFloat9346 * f));
					float f_91_ = f_87_ * Class200_Sub1.aFloat5140 + Class155.aFloat1954 * f + Class107.aFloat1361 * f_88_ + Class17.aFloat275;
					float f_92_ = (float) (1.0 / Math.sqrt((double) (f_91_ * f_91_ + (f_89_ * f_89_ + f_90_ * f_90_)))) * (float) class72.anInt976;
					class336_sub3.method3897((byte) 99, class190.anInt2339 * class72.aShort968 >> 7, -(f_92_ * f_89_) + ((float) class190.anInt2337 + f_89_), class190.anInt2333, class72.aShort972 * class190.anInt2332 >> 7, f_92_ * f_91_ + -f_91_, f_90_ * f_92_ + ((float) class190.anInt2329 - f_90_));
					aGLToolkit5692.method1455(class336_sub3, (byte) 70);
					int i_93_ = class190.anInt2335;
					OpenGL.glColor4ub((byte) (i_93_ >> 16), (byte) (i_93_ >> 8), (byte) i_93_, (byte) (i_93_ >> 24));
					aGLToolkit5692.method1489(class72.aShort970, -2);
					aGLToolkit5692.method1460(class72.aByte971, 3);
					aGLToolkit5692.method1441(7, 0, 4, (byte) -42);
				}
			}
			aGLToolkit5692.C(true);
			aGLToolkit5692.method1439(106);
		}
		anInt5628++;
	}
	
	final byte[] method627() {
		anInt5636++;
		return aByteArray5658;
	}
	
	private final int method643(boolean bool, byte b, int i, int i_94_, short s) {
		if (bool != false) {
			aShort5619 = (short) -31;
		}
		anInt5625++;
		int i_95_ = Class85.anIntArray1158[Node_Sub36.method2757(i, i_94_, (byte) -93)];
		if ((s ^ 0xffffffff) != 0) {
			Class91 class91 = aGLToolkit5692.aD1543.method10(0xffff & s, -8217);
			int i_96_ = 0xff & class91.aByte1225;
			if ((i_96_ ^ 0xffffffff) != -1) {
				int i_97_;
				if (i_94_ < 0) {
					i_97_ = 0;
				} else if (i_94_ <= 127) {
					i_97_ = 131586 * i_94_;
				} else {
					i_97_ = 16777215;
				}
				if (i_96_ == 256) {
					i_95_ = i_97_;
				} else {
					int i_98_ = i_96_;
					int i_99_ = -i_96_ + 256;
					i_95_ = (0xff0000 & (i_95_ & 0xff00) * i_99_ + i_98_ * (i_97_ & 0xff00)) + ((0xff00ff & i_95_) * i_99_ + (0xff00ff & i_97_) * i_98_ & ~0xff00ff) >> 8;
				}
			}
			int i_100_ = 0xff & class91.aByte1217;
			if (i_100_ != 0) {
				i_100_ += 256;
				int i_101_ = i_100_ * (0xff & i_95_ >> 16);
				if ((i_101_ ^ 0xffffffff) < -65536) {
					i_101_ = 65535;
				}
				int i_102_ = i_100_ * ((i_95_ & 0xff00) >> 8);
				if ((i_102_ ^ 0xffffffff) < -65536) {
					i_102_ = 65535;
				}
				int i_103_ = i_100_ * (i_95_ & 0xff);
				if (i_103_ > 65535) {
					i_103_ = 65535;
				}
				i_95_ = (i_102_ & 0xff00) + (0xff00b1 & i_101_ << 8) + (i_103_ >> 8);
			}
		}
		return 255 + -(b & 0xff) + (i_95_ << 8);
	}
	
	final void a(int i) {
		anInt5645++;
		int i_104_ = Class335.anIntArray4167[i];
		int i_105_ = Class335.anIntArray4165[i];
		for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_106_++) {
			int i_107_ = anIntArray5637[i_106_] * i_104_ - -(anIntArray5595[i_106_] * i_105_) >> 14;
			anIntArray5637[i_106_] = anIntArray5637[i_106_] * i_105_ + -(anIntArray5595[i_106_] * i_104_) >> 14;
			anIntArray5595[i_106_] = i_107_;
		}
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
		aBoolean5698 = false;
	}
	
	final void wa() {
		for (int i = 0; (anInt5644 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			anIntArray5595[i] = anIntArray5595[i] - -7 >> 4;
			anIntArray5588[i] = 7 + anIntArray5588[i] >> 4;
			anIntArray5637[i] = 7 + anIntArray5637[i] >> 4;
		}
		anInt5661++;
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
		aBoolean5698 = false;
	}
	
	final void method632() {
		anInt5634++;
	}
	
	final boolean NA() {
		anInt5668++;
		if (anIntArrayArray5684 == null) {
			return false;
		}
		for (int i = 0; (anInt5644 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			anIntArray5595[i] <<= 4;
			anIntArray5588[i] <<= 4;
			anIntArray5637[i] <<= 4;
		}
		Class378.anInt4676 = 0;
		Class297.anInt3702 = 0;
		Class270_Sub2_Sub1.anInt10546 = 0;
		return true;
	}
	
	public static void method644(int i) {
		if (i != -13888) {
			method644(-92);
		}
		aFloatArray5626 = null;
		aClass212_5708 = null;
		aColorArray5590 = null;
	}
	
	private final void method645(r_Sub2 var_r_Sub2, boolean bool) {
		anInt5601++;
		if (anInt5665 > aGLToolkit5692.anIntArray6747.length) {
			aGLToolkit5692.anIntArray6749 = new int[anInt5665];
			aGLToolkit5692.anIntArray6747 = new int[anInt5665];
		}
		int[] is = aGLToolkit5692.anIntArray6747;
		int[] is_108_ = aGLToolkit5692.anIntArray6749;
		for (int i = 0; (anInt5672 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			int i_109_ = -var_r_Sub2.anInt11064 + (anIntArray5595[i] - (anIntArray5588[i] * aGLToolkit5692.anInt6732 >> 8) >> aGLToolkit5692.anInt6611);
			int i_110_ = -var_r_Sub2.anInt11067 + (anIntArray5637[i] + -(aGLToolkit5692.anInt6717 * anIntArray5588[i] >> 8) >> aGLToolkit5692.anInt6611);
			int i_111_ = anIntArray5633[i];
			int i_112_ = anIntArray5633[i - -1];
			for (int i_113_ = i_111_; (i_113_ ^ 0xffffffff) > (i_112_ ^ 0xffffffff); i_113_++) {
				int i_114_ = -1 + aShortArray5679[i_113_];
				if ((i_114_ ^ 0xffffffff) == 0) {
					break;
				}
				is[i_114_] = i_109_;
				is_108_[i_114_] = i_110_;
			}
		}
		if (bool != true) {
			method624(31, 63, null, true, 0);
		}
		for (int i = 0; (anInt5616 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (aByteArray5658 == null || (aByteArray5658[i] ^ 0xffffffff) >= -129) {
				short s = aShortArray5622[i];
				short s_115_ = aShortArray5683[i];
				short s_116_ = aShortArray5706[i];
				int i_117_ = is[s];
				int i_118_ = is[s_115_];
				int i_119_ = is[s_116_];
				int i_120_ = is_108_[s];
				int i_121_ = is_108_[s_115_];
				int i_122_ = is_108_[s_116_];
				if (-((i_119_ + -i_118_) * (-i_120_ + i_121_)) + (i_117_ + -i_118_) * (-i_122_ + i_121_) > 0) {
					var_r_Sub2.method2370(i_117_, i_120_, i_118_, i_121_, i_122_, i_119_, 86);
				}
			}
		}
	}
	
	final Class218[] method618() {
		anInt5642++;
		return aClass218Array5596;
	}
	
	final void H(int i, int i_123_, int i_124_) {
		anInt5700++;
		for (int i_125_ = 0; (i_125_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_125_++) {
			if (i != 0) {
				anIntArray5595[i_125_] += i;
			}
			if ((i_123_ ^ 0xffffffff) != -1) {
				anIntArray5588[i_125_] += i_123_;
			}
			if ((i_124_ ^ 0xffffffff) != -1) {
				anIntArray5637[i_125_] += i_124_;
			}
		}
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
		aBoolean5698 = false;
	}
	
	private final void method646(boolean bool) {
		anInt5603++;
		if (anInt5616 != 0) {
			if (aByte5651 != 0) {
				method649(true, (byte) 41);
			}
			method649(false, (byte) 41);
			if (aClass107_5675 != null) {
				if (aClass107_5675.anInterface1_1365 == null) {
					method648((0x10 & aByte5651 ^ 0xffffffff) != -1, 5123);
				}
				if (aClass107_5675.anInterface1_1365 != null) {
					aGLToolkit5692.method1451(aClass69_5649 != null, -31277);
					aGLToolkit5692.method1482((byte) -82, aClass69_5604, aClass69_5649, aClass69_5654, aClass69_5689);
					int i = anIntArray5687.length + -1;
					for (int i_126_ = 0; i_126_ < i; i_126_++) {
						int i_127_ = anIntArray5687[i_126_];
						int i_128_ = anIntArray5687[i_126_ + 1];
						int i_129_ = 0xffff & aShortArray5699[i_127_];
						if (i_129_ == 65535) {
							i_129_ = -1;
						}
						aGLToolkit5692.method1418(aClass69_5649 != null, bool, i_129_);
						aGLToolkit5692.method1477((byte) 110, i_127_ * 3, 4, aClass107_5675.anInterface1_1365, 3 * (i_128_ + -i_127_));
					}
				}
			}
			method641((byte) -122);
			if (bool != true) {
				aClass72Array5627 = null;
			}
		}
	}
	
	private final boolean method647(int i, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_) {
		anInt5623++;
		if ((i_136_ ^ 0xffffffff) < (i_137_ ^ 0xffffffff) && i_134_ > i_137_ && (i_137_ ^ 0xffffffff) > (i_131_ ^ 0xffffffff)) {
			return false;
		}
		if ((i_136_ ^ 0xffffffff) > (i_137_ ^ 0xffffffff) && i_134_ < i_137_ && (i_137_ ^ 0xffffffff) < (i_131_ ^ 0xffffffff)) {
			return false;
		}
		if ((i_130_ ^ 0xffffffff) < (i_132_ ^ 0xffffffff) && (i ^ 0xffffffff) < (i_132_ ^ 0xffffffff) && (i_132_ ^ 0xffffffff) > (i_135_ ^ 0xffffffff)) {
			return false;
		}
        return !(i_130_ < i_132_ && (i ^ 0xffffffff) > (i_132_ ^ 0xffffffff) && i_135_ < i_132_);
    }
	
	final void method614(Class336 class336) {
		anInt5676++;
		Class336_Sub3 class336_sub3 = (Class336_Sub3) class336;
		if (aClass300Array5681 != null) {
			for (int i = 0; (aClass300Array5681.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				Class300 class300 = aClass300Array5681[i];
				Class300 class300_139_ = class300;
				if (class300.aClass300_3763 != null) {
					class300_139_ = class300.aClass300_3763;
				}
				class300_139_.anInt3769 = (int) (class336_sub3.aFloat8596 * (float) anIntArray5595[class300.anInt3764] + class336_sub3.aFloat8608 * (float) anIntArray5588[class300.anInt3764] + (float) anIntArray5637[class300.anInt3764] * class336_sub3.aFloat8617 + class336_sub3.aFloat8594);
				class300_139_.anInt3751 = (int) ((float) anIntArray5637[class300.anInt3764] * class336_sub3.aFloat8591 + ((float) anIntArray5588[class300.anInt3764] * class336_sub3.aFloat8607 + class336_sub3.aFloat8625 * (float) anIntArray5595[class300.anInt3764]) + class336_sub3.aFloat8609);
				class300_139_.anInt3753 = (int) (class336_sub3.aFloat8604 * (float) anIntArray5637[class300.anInt3764] + ((float) anIntArray5595[class300.anInt3764] * class336_sub3.aFloat8605 + class336_sub3.aFloat8593 * (float) anIntArray5588[class300.anInt3764]) + class336_sub3.aFloat8615);
				class300_139_.anInt3766 = (int) (class336_sub3.aFloat8617 * (float) anIntArray5637[class300.anInt3757] + ((float) anIntArray5588[class300.anInt3757] * class336_sub3.aFloat8608 + (float) anIntArray5595[class300.anInt3757] * class336_sub3.aFloat8596) + class336_sub3.aFloat8594);
				class300_139_.anInt3756 = (int) (class336_sub3.aFloat8609 + (class336_sub3.aFloat8591 * (float) anIntArray5637[class300.anInt3757] + ((float) anIntArray5595[class300.anInt3757] * class336_sub3.aFloat8625 + class336_sub3.aFloat8607 * (float) anIntArray5588[class300.anInt3757])));
				class300_139_.anInt3758 = (int) (class336_sub3.aFloat8615 + ((float) anIntArray5588[class300.anInt3757] * class336_sub3.aFloat8593 + class336_sub3.aFloat8605 * (float) anIntArray5595[class300.anInt3757] + class336_sub3.aFloat8604 * (float) anIntArray5637[class300.anInt3757]));
				class300_139_.anInt3761 = (int) (class336_sub3.aFloat8594 + (class336_sub3.aFloat8617 * (float) anIntArray5637[class300.anInt3754] + ((float) anIntArray5588[class300.anInt3754] * class336_sub3.aFloat8608 + (float) anIntArray5595[class300.anInt3754] * class336_sub3.aFloat8596)));
				class300_139_.anInt3752 = (int) ((float) anIntArray5595[class300.anInt3754] * class336_sub3.aFloat8625 + (float) anIntArray5588[class300.anInt3754] * class336_sub3.aFloat8607 + (float) anIntArray5637[class300.anInt3754] * class336_sub3.aFloat8591 + class336_sub3.aFloat8609);
				class300_139_.anInt3771 = (int) (class336_sub3.aFloat8615 + (class336_sub3.aFloat8604 * (float) anIntArray5637[class300.anInt3754] + ((float) anIntArray5595[class300.anInt3754] * class336_sub3.aFloat8605 + class336_sub3.aFloat8593 * (float) anIntArray5588[class300.anInt3754])));
			}
		}
		if (aClass218Array5596 != null) {
			for (int i = 0; (i ^ 0xffffffff) > (aClass218Array5596.length ^ 0xffffffff); i++) {
				Class218 class218 = aClass218Array5596[i];
				Class218 class218_140_ = class218;
				if (class218.aClass218_2561 != null) {
					class218_140_ = class218.aClass218_2561;
				}
				if (class218.aClass336_2562 == null) {
					class218.aClass336_2562 = class336_sub3.method3858();
				} else {
					class218.aClass336_2562.method3857(class336_sub3);
				}
				class218_140_.anInt2559 = (int) (class336_sub3.aFloat8608 * (float) anIntArray5588[class218.anInt2554] + (float) anIntArray5595[class218.anInt2554] * class336_sub3.aFloat8596 + class336_sub3.aFloat8617 * (float) anIntArray5637[class218.anInt2554] + class336_sub3.aFloat8594);
				class218_140_.anInt2557 = (int) ((float) anIntArray5595[class218.anInt2554] * class336_sub3.aFloat8625 + (float) anIntArray5588[class218.anInt2554] * class336_sub3.aFloat8607 + class336_sub3.aFloat8591 * (float) anIntArray5637[class218.anInt2554] + class336_sub3.aFloat8609);
				class218_140_.anInt2556 = (int) (class336_sub3.aFloat8605 * (float) anIntArray5595[class218.anInt2554] + class336_sub3.aFloat8593 * (float) anIntArray5588[class218.anInt2554] + (float) anIntArray5637[class218.anInt2554] * class336_sub3.aFloat8604 + class336_sub3.aFloat8615);
			}
		}
	}
	
	final void method630(Class336 class336, int i, boolean bool) {
		anInt5598++;
		if (aShortArray5618 != null) {
			int[] is = new int[3];
			for (int i_141_ = 0; (i_141_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_141_++) {
				if ((i & aShortArray5618[i_141_]) != 0) {
					if (!bool) {
						class336.method3853(anIntArray5595[i_141_], anIntArray5588[i_141_], anIntArray5637[i_141_], is);
					} else {
						class336.method3869(anIntArray5595[i_141_], anIntArray5588[i_141_], anIntArray5637[i_141_], is);
					}
					anIntArray5595[i_141_] = is[0];
					anIntArray5588[i_141_] = is[1];
					anIntArray5637[i_141_] = is[2];
				}
			}
		}
	}
	
	final void C(int i) {
		if (aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
		anInt5680++;
		aShort5608 = (short) i;
	}
	
	final int ua() {
		anInt5606++;
		return anInt5639;
	}
	
	final void method611(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i) {
		anInt5662++;
		if ((anInt5665 ^ 0xffffffff) != -1) {
			Class336_Sub3 class336_sub3 = aGLToolkit5692.aClass336_Sub3_6639;
			Class336_Sub3 class336_sub3_142_ = (Class336_Sub3) class336;
			if (!aBoolean5698) {
				method640((byte) -128);
			}
			Class200_Sub1.aFloat5140 = class336_sub3.aFloat8605 * class336_sub3_142_.aFloat8608 + class336_sub3.aFloat8593 * class336_sub3_142_.aFloat8607 + class336_sub3_142_.aFloat8593 * class336_sub3.aFloat8604;
			Class17.aFloat275 = class336_sub3.aFloat8615 + (class336_sub3.aFloat8593 * class336_sub3_142_.aFloat8609 + class336_sub3.aFloat8605 * class336_sub3_142_.aFloat8594 + class336_sub3_142_.aFloat8615 * class336_sub3.aFloat8604);
			float f = (float) aShort5600 * Class200_Sub1.aFloat5140 + Class17.aFloat275;
			float f_143_ = Class17.aFloat275 + Class200_Sub1.aFloat5140 * (float) aShort5671;
			float f_144_;
			float f_145_;
			if (f_143_ < f) {
				f_145_ = f + (float) aShort5686;
				f_144_ = (float) -aShort5686 + f_143_;
			} else {
				f_144_ = (float) -aShort5686 + f;
				f_145_ = f_143_ + (float) aShort5686;
			}
			if (!(f_144_ >= aGLToolkit5692.aFloat6710) && !(f_145_ <= (float) aGLToolkit5692.anInt6693)) {
				MainFile.aFloat144 = class336_sub3.aFloat8608 * class336_sub3_142_.aFloat8609 + class336_sub3.aFloat8596 * class336_sub3_142_.aFloat8594 + class336_sub3.aFloat8617 * class336_sub3_142_.aFloat8615 + class336_sub3.aFloat8594;
				Class129.aFloat1663 = class336_sub3_142_.aFloat8608 * class336_sub3.aFloat8596 + class336_sub3_142_.aFloat8607 * class336_sub3.aFloat8608 + class336_sub3.aFloat8617 * class336_sub3_142_.aFloat8593;
				float f_146_ = MainFile.aFloat144 + (float) aShort5600 * Class129.aFloat1663;
				float f_147_ = (float) aShort5671 * Class129.aFloat1663 + MainFile.aFloat144;
				float f_148_;
				float f_149_;
				if (!(f_146_ > f_147_)) {
					f_148_ = (float) aGLToolkit5692.anInt6667 * (f_146_ - (float) aShort5686);
					f_149_ = ((float) aShort5686 + f_147_) * (float) aGLToolkit5692.anInt6667;
				} else {
					f_148_ = (float) aGLToolkit5692.anInt6667 * ((float) -aShort5686 + f_147_);
					f_149_ = (float) aGLToolkit5692.anInt6667 * ((float) aShort5686 + f_146_);
				}
				if (!(aGLToolkit5692.aFloat6674 <= f_148_ / f_145_) && !(f_149_ / f_145_ <= aGLToolkit5692.aFloat6711)) {
					Class116.aFloat5076 = class336_sub3_142_.aFloat8594 * class336_sub3.aFloat8625 + class336_sub3.aFloat8607 * class336_sub3_142_.aFloat8609 + class336_sub3_142_.aFloat8615 * class336_sub3.aFloat8591 + class336_sub3.aFloat8609;
					Class51.aFloat5343 = class336_sub3_142_.aFloat8593 * class336_sub3.aFloat8591 + (class336_sub3_142_.aFloat8607 * class336_sub3.aFloat8607 + class336_sub3_142_.aFloat8608 * class336_sub3.aFloat8625);
					float f_150_ = Class116.aFloat5076 + (float) aShort5600 * Class51.aFloat5343;
					float f_151_ = Class51.aFloat5343 * (float) aShort5671 + Class116.aFloat5076;
					float f_152_;
					float f_153_;
					if (!(f_150_ > f_151_)) {
						f_153_ = (f_150_ - (float) aShort5686) * (float) aGLToolkit5692.anInt6730;
						f_152_ = (float) aGLToolkit5692.anInt6730 * (f_151_ + (float) aShort5686);
					} else {
						f_152_ = (float) aGLToolkit5692.anInt6730 * (f_150_ + (float) aShort5686);
						f_153_ = (f_151_ - (float) aShort5686) * (float) aGLToolkit5692.anInt6730;
					}
					if (!(f_153_ / f_145_ >= aGLToolkit5692.aFloat6663) && !(f_152_ / f_145_ <= aGLToolkit5692.aFloat6687)) {
						if (entitynode_sub5 != null || aClass72Array5627 != null) {
							Class204.aFloat2459 = class336_sub3.aFloat8617 * class336_sub3_142_.aFloat8604 + (class336_sub3.aFloat8608 * class336_sub3_142_.aFloat8591 + class336_sub3.aFloat8596 * class336_sub3_142_.aFloat8617);
							Class188_Sub1_Sub2.aFloat9346 = class336_sub3.aFloat8625 * class336_sub3_142_.aFloat8596 + class336_sub3.aFloat8607 * class336_sub3_142_.aFloat8625 + class336_sub3.aFloat8591 * class336_sub3_142_.aFloat8605;
							Class210.aFloat2496 = class336_sub3.aFloat8608 * class336_sub3_142_.aFloat8625 + class336_sub3.aFloat8596 * class336_sub3_142_.aFloat8596 + class336_sub3.aFloat8617 * class336_sub3_142_.aFloat8605;
							Class107.aFloat1361 = class336_sub3.aFloat8604 * class336_sub3_142_.aFloat8604 + (class336_sub3.aFloat8593 * class336_sub3_142_.aFloat8591 + class336_sub3_142_.aFloat8617 * class336_sub3.aFloat8605);
							Node_Sub38_Sub19.aFloat10295 = class336_sub3.aFloat8591 * class336_sub3_142_.aFloat8604 + (class336_sub3_142_.aFloat8617 * class336_sub3.aFloat8625 + class336_sub3.aFloat8607 * class336_sub3_142_.aFloat8591);
							Class155.aFloat1954 = class336_sub3_142_.aFloat8625 * class336_sub3.aFloat8593 + class336_sub3_142_.aFloat8596 * class336_sub3.aFloat8605 + class336_sub3.aFloat8604 * class336_sub3_142_.aFloat8605;
						}
						if (entitynode_sub5 != null) {
							boolean bool = false;
							boolean bool_154_ = true;
							int i_155_ = aShort5597 + aShort5619 >> 1;
							int i_156_ = aShort5589 - -aShort5677 >> 1;
							int i_157_ = (int) ((float) i_156_ * Class204.aFloat2459 + ((float) aShort5600 * Class129.aFloat1663 + ((float) i_155_ * Class210.aFloat2496 + MainFile.aFloat144)));
							int i_158_ = (int) ((float) i_156_ * Node_Sub38_Sub19.aFloat10295 + ((float) aShort5600 * Class51.aFloat5343 + (Class188_Sub1_Sub2.aFloat9346 * (float) i_155_ + Class116.aFloat5076)));
							int i_159_ = (int) ((float) aShort5600 * Class200_Sub1.aFloat5140 + (Class17.aFloat275 + (float) i_155_ * Class155.aFloat1954) + Class107.aFloat1361 * (float) i_156_);
							if (i_159_ >= aGLToolkit5692.anInt6693) {
								entitynode_sub5.anInt5985 = i_157_ * aGLToolkit5692.anInt6667 / i_159_ + aGLToolkit5692.anInt6714;
								entitynode_sub5.anInt5986 = aGLToolkit5692.anInt6730 * i_158_ / i_159_ + aGLToolkit5692.anInt6702;
							} else {
								bool = true;
							}
							int i_160_ = (int) ((float) i_156_ * Class204.aFloat2459 + ((float) aShort5671 * Class129.aFloat1663 + (MainFile.aFloat144 + (float) i_155_ * Class210.aFloat2496)));
							int i_161_ = (int) (Class51.aFloat5343 * (float) aShort5671 + (Class116.aFloat5076 + Class188_Sub1_Sub2.aFloat9346 * (float) i_155_) + (float) i_156_ * Node_Sub38_Sub19.aFloat10295);
							int i_162_ = (int) (Class17.aFloat275 + Class155.aFloat1954 * (float) i_155_ + (float) aShort5671 * Class200_Sub1.aFloat5140 + (float) i_156_ * Class107.aFloat1361);
							if (aGLToolkit5692.anInt6693 <= i_162_) {
								entitynode_sub5.anInt5984 = aGLToolkit5692.anInt6730 * i_161_ / i_162_ + aGLToolkit5692.anInt6702;
								entitynode_sub5.anInt5982 = i_160_ * aGLToolkit5692.anInt6667 / i_162_ + aGLToolkit5692.anInt6714;
							} else {
								bool = true;
							}
							if (bool) {
								if (aGLToolkit5692.anInt6693 <= i_159_ || i_162_ >= aGLToolkit5692.anInt6693) {
									if (aGLToolkit5692.anInt6693 <= i_159_) {
										if (aGLToolkit5692.anInt6693 > i_162_) {
											int i_163_ = (-aGLToolkit5692.anInt6693 + i_159_ << 16) / (i_159_ - i_162_);
											int i_164_ = (i_163_ * (-i_160_ + i_157_) >> 16) + i_157_;
											int i_165_ = ((-i_161_ + i_158_) * i_163_ >> 16) + i_158_;
											entitynode_sub5.anInt5985 = aGLToolkit5692.anInt6714 - -(aGLToolkit5692.anInt6667 * i_164_ / aGLToolkit5692.anInt6693);
											entitynode_sub5.anInt5986 = i_165_ * aGLToolkit5692.anInt6730 / aGLToolkit5692.anInt6693 + aGLToolkit5692.anInt6702;
										}
									} else {
										int i_166_ = (i_162_ - aGLToolkit5692.anInt6693 << 16) / (i_162_ - i_159_);
										int i_167_ = ((i_160_ + -i_157_) * i_166_ >> 16) + i_160_;
										int i_168_ = i_161_ - -(i_166_ * (i_161_ - i_158_) >> 16);
										entitynode_sub5.anInt5985 = i_167_ * aGLToolkit5692.anInt6667 / aGLToolkit5692.anInt6693 + aGLToolkit5692.anInt6714;
										entitynode_sub5.anInt5986 = aGLToolkit5692.anInt6702 - -(aGLToolkit5692.anInt6730 * i_168_ / aGLToolkit5692.anInt6693);
									}
								} else {
									bool_154_ = false;
								}
							}
							if (bool_154_) {
								if ((i_159_ ^ 0xffffffff) < (i_162_ ^ 0xffffffff)) {
									entitynode_sub5.anInt5983 = aGLToolkit5692.anInt6714 - -(aGLToolkit5692.anInt6667 * (aShort5686 + i_157_) / i_159_) - entitynode_sub5.anInt5985;
								} else {
									entitynode_sub5.anInt5983 = aGLToolkit5692.anInt6714 - (-((i_160_ - -aShort5686) * aGLToolkit5692.anInt6667 / i_162_) + entitynode_sub5.anInt5982);
								}
								entitynode_sub5.aBoolean5987 = true;
							}
						}
						aGLToolkit5692.method1470(1);
						aGLToolkit5692.method1463(class336_sub3_142_, 1);
						method646(true);
						aGLToolkit5692.method1439(125);
						method642((byte) -123);
					}
				}
			}
		}
	}
	
	private final void method648(boolean bool, int i) {
		if ((6 * anInt5616 ^ 0xffffffff) >= (aGLToolkit5692.aFloatBuffer6661.buffer.length ^ 0xffffffff)) {
			aGLToolkit5692.aFloatBuffer6661.offset = 0;
		} else {
			aGLToolkit5692.aFloatBuffer6661 = new FloatBuffer((anInt5616 - -100) * 6);
		}
		anInt5632++;
		FloatBuffer floatbuffer = aGLToolkit5692.aFloatBuffer6661;
		if (!aGLToolkit5692.aBoolean6736) {
			for (int i_169_ = 0; i_169_ < anInt5616; i_169_++) {
				floatbuffer.method2191(-41, aShortArray5622[i_169_]);
				floatbuffer.method2191(-68, aShortArray5683[i_169_]);
				floatbuffer.method2191(i + -5181, aShortArray5706[i_169_]);
			}
		} else {
			for (int i_170_ = 0; (anInt5616 ^ 0xffffffff) < (i_170_ ^ 0xffffffff); i_170_++) {
				floatbuffer.writeShort(aShortArray5622[i_170_]);
				floatbuffer.writeShort(aShortArray5683[i_170_]);
				floatbuffer.writeShort(aShortArray5706[i_170_]);
			}
		}
		if (i != 5123) {
			anInterface9_5696 = null;
		}
		if ((floatbuffer.offset ^ 0xffffffff) != -1) {
			if (!bool) {
				aClass107_5675.anInterface1_1365 = aGLToolkit5692.method1453(26099, false, floatbuffer.offset, 5123, floatbuffer.buffer);
			} else {
				if (anInterface1_5643 != null) {
					anInterface1_5643.method4(5123, floatbuffer.offset, floatbuffer.buffer, 2712);
				} else {
					anInterface1_5643 = aGLToolkit5692.method1453(26099, true, floatbuffer.offset, 5123, floatbuffer.buffer);
				}
				aClass107_5675.anInterface1_1365 = anInterface1_5643;
			}
			if (!bool) {
				aBoolean5611 = true;
			}
		}
	}
	
	final int fa() {
		if (!aBoolean5698) {
			method640((byte) -126);
		}
		anInt5688++;
		return aShort5600;
	}
	
	final void method619(DrawableModel drawablemodel, int i, int i_171_, int i_172_, boolean bool) {
		anInt5612++;
		GLDrawableModel gldrawablemodel_173_ = (GLDrawableModel) drawablemodel;
		if ((anInt5709 ^ 0xffffffff) != -1 && gldrawablemodel_173_.anInt5709 != 0) {
			int i_174_ = gldrawablemodel_173_.anInt5672;
			int[] is = gldrawablemodel_173_.anIntArray5595;
			int[] is_175_ = gldrawablemodel_173_.anIntArray5588;
			int[] is_176_ = gldrawablemodel_173_.anIntArray5637;
			short[] ses = gldrawablemodel_173_.aShortArray5635;
			short[] ses_177_ = gldrawablemodel_173_.aShortArray5691;
			short[] ses_178_ = gldrawablemodel_173_.aShortArray5685;
			byte[] bs = gldrawablemodel_173_.aByteArray5640;
			short[] ses_179_;
			short[] ses_180_;
			short[] ses_181_;
			byte[] bs_182_;
			if (aClass319_5592 != null) {
				ses_180_ = aClass319_5592.aShortArray4056;
				ses_179_ = aClass319_5592.aShortArray4062;
				ses_181_ = aClass319_5592.aShortArray4061;
				bs_182_ = aClass319_5592.aByteArray4059;
			} else {
				ses_179_ = null;
				ses_180_ = null;
				ses_181_ = null;
				bs_182_ = null;
			}
			short[] ses_183_;
			short[] ses_184_;
			short[] ses_185_;
			byte[] bs_186_;
			if (gldrawablemodel_173_.aClass319_5592 == null) {
				bs_186_ = null;
				ses_184_ = null;
				ses_185_ = null;
				ses_183_ = null;
			} else {
				ses_183_ = gldrawablemodel_173_.aClass319_5592.aShortArray4061;
				ses_184_ = gldrawablemodel_173_.aClass319_5592.aShortArray4056;
				ses_185_ = gldrawablemodel_173_.aClass319_5592.aShortArray4062;
				bs_186_ = gldrawablemodel_173_.aClass319_5592.aByteArray4059;
			}
			int[] is_187_ = gldrawablemodel_173_.anIntArray5633;
			short[] ses_188_ = gldrawablemodel_173_.aShortArray5679;
			if (!gldrawablemodel_173_.aBoolean5698) {
				gldrawablemodel_173_.method640((byte) -116);
			}
			int i_189_ = gldrawablemodel_173_.aShort5600;
			int i_190_ = gldrawablemodel_173_.aShort5671;
			int i_191_ = gldrawablemodel_173_.aShort5619;
			int i_192_ = gldrawablemodel_173_.aShort5597;
			int i_193_ = gldrawablemodel_173_.aShort5589;
			int i_194_ = gldrawablemodel_173_.aShort5677;
			for (int i_195_ = 0; (i_195_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_195_++) {
				int i_196_ = -i_171_ + anIntArray5588[i_195_];
				if (i_196_ >= i_189_ && i_196_ <= i_190_) {
					int i_197_ = anIntArray5595[i_195_] - i;
					if ((i_191_ ^ 0xffffffff) >= (i_197_ ^ 0xffffffff) && i_197_ <= i_192_) {
						int i_198_ = -i_172_ + anIntArray5637[i_195_];
						if ((i_198_ ^ 0xffffffff) <= (i_193_ ^ 0xffffffff) && i_198_ <= i_194_) {
							int i_199_ = -1;
							int i_200_ = anIntArray5633[i_195_];
							int i_201_ = anIntArray5633[i_195_ - -1];
							for (int i_202_ = i_200_; i_201_ > i_202_; i_202_++) {
								i_199_ = aShortArray5679[i_202_] + -1;
								if (i_199_ == -1 || aByteArray5640[i_199_] != 0) {
									break;
								}
							}
							if (i_199_ != -1) {
								for (int i_203_ = 0; i_174_ > i_203_; i_203_++) {
									if ((is[i_203_] ^ 0xffffffff) == (i_197_ ^ 0xffffffff) && is_176_[i_203_] == i_198_ && is_175_[i_203_] == i_196_) {
										i_200_ = is_187_[i_203_];
										i_201_ = is_187_[1 + i_203_];
										int i_204_ = -1;
										for (int i_205_ = i_200_; i_201_ > i_205_; i_205_++) {
											i_204_ = -1 + ses_188_[i_205_];
											if ((i_204_ ^ 0xffffffff) == 0 || (bs[i_204_] ^ 0xffffffff) != -1) {
												break;
											}
										}
										if (i_204_ != -1) {
											if (ses_181_ == null) {
												aClass319_5592 = new Class319();
												ses_181_ = aClass319_5592.aShortArray4061 = Class39.method413(aShortArray5635, (byte) -32);
												ses_179_ = aClass319_5592.aShortArray4062 = Class39.method413(aShortArray5691, (byte) -32);
												ses_180_ = aClass319_5592.aShortArray4056 = Class39.method413(aShortArray5685, (byte) -32);
												bs_182_ = aClass319_5592.aByteArray4059 = Class270_Sub1.method3299(aByteArray5640, 0);
											}
											if (ses_183_ == null) {
												Class319 class319 = gldrawablemodel_173_.aClass319_5592 = new Class319();
												ses_183_ = class319.aShortArray4061 = Class39.method413(ses, (byte) -32);
												ses_185_ = class319.aShortArray4062 = Class39.method413(ses_177_, (byte) -32);
												ses_184_ = class319.aShortArray4056 = Class39.method413(ses_178_, (byte) -32);
												bs_186_ = class319.aByteArray4059 = Class270_Sub1.method3299(bs, 0);
											}
											short s = aShortArray5635[i_199_];
											short s_206_ = aShortArray5691[i_199_];
											short s_207_ = aShortArray5685[i_199_];
											i_200_ = is_187_[i_203_];
											byte b = aByteArray5640[i_199_];
											i_201_ = is_187_[1 + i_203_];
											for (int i_208_ = i_200_; (i_201_ ^ 0xffffffff) < (i_208_ ^ 0xffffffff); i_208_++) {
												int i_209_ = -1 + ses_188_[i_208_];
												if (i_209_ == -1) {
													break;
												}
												if ((bs_186_[i_209_] ^ 0xffffffff) != -1) {
													ses_183_[i_209_] += s;
													ses_185_[i_209_] += s_206_;
													ses_184_[i_209_] += s_207_;
													bs_186_[i_209_] += b;
												}
											}
											i_200_ = anIntArray5633[i_195_];
											s_207_ = ses_178_[i_204_];
											b = bs[i_204_];
											s_206_ = ses_177_[i_204_];
											i_201_ = anIntArray5633[1 + i_195_];
											s = ses[i_204_];
											for (int i_210_ = i_200_; (i_201_ ^ 0xffffffff) < (i_210_ ^ 0xffffffff); i_210_++) {
												int i_211_ = -1 + aShortArray5679[i_210_];
												if (i_211_ == -1) {
													break;
												}
												if ((bs_182_[i_211_] ^ 0xffffffff) != -1) {
													ses_181_[i_211_] += s;
													ses_179_[i_211_] += s_206_;
													ses_180_[i_211_] += s_207_;
													bs_182_[i_211_] += b;
												}
											}
											if (aClass69_5649 == null && aClass69_5604 != null) {
												aClass69_5604.anInterface9_939 = null;
											}
											if (aClass69_5649 != null) {
												aClass69_5649.anInterface9_939 = null;
											}
											if (gldrawablemodel_173_.aClass69_5649 == null && gldrawablemodel_173_.aClass69_5604 != null) {
												gldrawablemodel_173_.aClass69_5604.anInterface9_939 = null;
											}
											if (gldrawablemodel_173_.aClass69_5649 != null) {
												gldrawablemodel_173_.aClass69_5649.anInterface9_939 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	final int RA() {
		if (!aBoolean5698) {
			method640((byte) -120);
		}
		anInt5660++;
		return aShort5597;
	}
	
	final void method617() {
		anInt5695++;
		if ((anInt5665 ^ 0xffffffff) < -1 && anInt5616 > 0) {
			method649(false, (byte) 41);
			if ((0x10 & aByte5651 ^ 0xffffffff) == -1 && aClass107_5675.anInterface1_1365 == null) {
				method648(false, 5123);
			}
			method641((byte) -122);
		}
	}
	
	final void method622(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i, int i_212_) {
		anInt5620++;
		if (anInt5665 != 0) {
			Class336_Sub3 class336_sub3 = aGLToolkit5692.aClass336_Sub3_6639;
			Class336_Sub3 class336_sub3_213_ = (Class336_Sub3) class336;
			if (!aBoolean5698) {
				method640((byte) -127);
			}
			Class200_Sub1.aFloat5140 = class336_sub3_213_.aFloat8607 * class336_sub3.aFloat8593 + class336_sub3.aFloat8605 * class336_sub3_213_.aFloat8608 + class336_sub3.aFloat8604 * class336_sub3_213_.aFloat8593;
			Class17.aFloat275 = class336_sub3.aFloat8615 + (class336_sub3.aFloat8605 * class336_sub3_213_.aFloat8594 + class336_sub3_213_.aFloat8609 * class336_sub3.aFloat8593 + class336_sub3_213_.aFloat8615 * class336_sub3.aFloat8604);
			float f = (float) aShort5600 * Class200_Sub1.aFloat5140 + Class17.aFloat275;
			float f_214_ = Class17.aFloat275 + (float) aShort5671 * Class200_Sub1.aFloat5140;
			float f_215_;
			float f_216_;
			if (f > f_214_) {
				f_216_ = f_214_ - (float) aShort5686;
				f_215_ = (float) aShort5686 + f;
			} else {
				f_215_ = (float) aShort5686 + f_214_;
				f_216_ = (float) -aShort5686 + f;
			}
			if (!(aGLToolkit5692.aFloat6695 <= f_216_) && !((float) aGLToolkit5692.anInt6693 >= f_215_)) {
				Class129.aFloat1663 = class336_sub3_213_.aFloat8607 * class336_sub3.aFloat8608 + class336_sub3_213_.aFloat8608 * class336_sub3.aFloat8596 + class336_sub3.aFloat8617 * class336_sub3_213_.aFloat8593;
				MainFile.aFloat144 = class336_sub3.aFloat8594 + (class336_sub3_213_.aFloat8615 * class336_sub3.aFloat8617 + (class336_sub3.aFloat8608 * class336_sub3_213_.aFloat8609 + class336_sub3_213_.aFloat8594 * class336_sub3.aFloat8596));
				float f_217_ = (float) aShort5600 * Class129.aFloat1663 + MainFile.aFloat144;
				float f_218_ = MainFile.aFloat144 + (float) aShort5671 * Class129.aFloat1663;
				float f_219_;
				float f_220_;
				if (f_218_ < f_217_) {
					f_220_ = (float) aGLToolkit5692.anInt6667 * ((float) aShort5686 + f_217_);
					f_219_ = (float) aGLToolkit5692.anInt6667 * ((float) -aShort5686 + f_218_);
				} else {
					f_219_ = (float) aGLToolkit5692.anInt6667 * (f_217_ - (float) aShort5686);
					f_220_ = ((float) aShort5686 + f_218_) * (float) aGLToolkit5692.anInt6667;
				}
				if (!(f_219_ / (float) i >= aGLToolkit5692.aFloat6674) && !(aGLToolkit5692.aFloat6711 >= f_220_ / (float) i)) {
					Class51.aFloat5343 = class336_sub3_213_.aFloat8608 * class336_sub3.aFloat8625 + class336_sub3_213_.aFloat8607 * class336_sub3.aFloat8607 + class336_sub3_213_.aFloat8593 * class336_sub3.aFloat8591;
					Class116.aFloat5076 = class336_sub3.aFloat8591 * class336_sub3_213_.aFloat8615 + (class336_sub3.aFloat8607 * class336_sub3_213_.aFloat8609 + class336_sub3.aFloat8625 * class336_sub3_213_.aFloat8594) + class336_sub3.aFloat8609;
					float f_221_ = Class116.aFloat5076 + (float) aShort5600 * Class51.aFloat5343;
					float f_222_ = Class51.aFloat5343 * (float) aShort5671 + Class116.aFloat5076;
					float f_223_;
					float f_224_;
					if (f_222_ < f_221_) {
						f_224_ = (f_222_ - (float) aShort5686) * (float) aGLToolkit5692.anInt6730;
						f_223_ = (f_221_ + (float) aShort5686) * (float) aGLToolkit5692.anInt6730;
					} else {
						f_223_ = (float) aGLToolkit5692.anInt6730 * ((float) aShort5686 + f_222_);
						f_224_ = ((float) -aShort5686 + f_221_) * (float) aGLToolkit5692.anInt6730;
					}
					if (!(f_224_ / (float) i >= aGLToolkit5692.aFloat6663) && !(f_223_ / (float) i <= aGLToolkit5692.aFloat6687)) {
						if (entitynode_sub5 != null || aClass72Array5627 != null) {
							Node_Sub38_Sub19.aFloat10295 = class336_sub3_213_.aFloat8617 * class336_sub3.aFloat8625 + class336_sub3_213_.aFloat8591 * class336_sub3.aFloat8607 + class336_sub3_213_.aFloat8604 * class336_sub3.aFloat8591;
							Class155.aFloat1954 = class336_sub3.aFloat8593 * class336_sub3_213_.aFloat8625 + class336_sub3.aFloat8605 * class336_sub3_213_.aFloat8596 + class336_sub3_213_.aFloat8605 * class336_sub3.aFloat8604;
							Class204.aFloat2459 = class336_sub3_213_.aFloat8604 * class336_sub3.aFloat8617 + (class336_sub3_213_.aFloat8617 * class336_sub3.aFloat8596 + class336_sub3.aFloat8608 * class336_sub3_213_.aFloat8591);
							Class210.aFloat2496 = class336_sub3.aFloat8596 * class336_sub3_213_.aFloat8596 + class336_sub3.aFloat8608 * class336_sub3_213_.aFloat8625 + class336_sub3.aFloat8617 * class336_sub3_213_.aFloat8605;
							Class107.aFloat1361 = class336_sub3_213_.aFloat8604 * class336_sub3.aFloat8604 + (class336_sub3.aFloat8605 * class336_sub3_213_.aFloat8617 + class336_sub3_213_.aFloat8591 * class336_sub3.aFloat8593);
							Class188_Sub1_Sub2.aFloat9346 = class336_sub3.aFloat8607 * class336_sub3_213_.aFloat8625 + class336_sub3_213_.aFloat8596 * class336_sub3.aFloat8625 + class336_sub3.aFloat8591 * class336_sub3_213_.aFloat8605;
						}
						if (entitynode_sub5 != null) {
							int i_225_ = aShort5619 + aShort5597 >> 1;
							int i_226_ = aShort5589 + aShort5677 >> 1;
							int i_227_ = (int) ((float) aShort5600 * Class129.aFloat1663 + (Class210.aFloat2496 * (float) i_225_ + MainFile.aFloat144) + Class204.aFloat2459 * (float) i_226_);
							int i_228_ = (int) (Class51.aFloat5343 * (float) aShort5600 + (Class188_Sub1_Sub2.aFloat9346 * (float) i_225_ + Class116.aFloat5076) + Node_Sub38_Sub19.aFloat10295 * (float) i_226_);
							int i_229_ = (int) (Class107.aFloat1361 * (float) i_226_ + (Class200_Sub1.aFloat5140 * (float) aShort5600 + (Class17.aFloat275 + (float) i_225_ * Class155.aFloat1954)));
							int i_230_ = (int) (Class204.aFloat2459 * (float) i_226_ + (Class129.aFloat1663 * (float) aShort5671 + (MainFile.aFloat144 + Class210.aFloat2496 * (float) i_225_)));
							int i_231_ = (int) ((float) aShort5671 * Class51.aFloat5343 + (Class116.aFloat5076 + (float) i_225_ * Class188_Sub1_Sub2.aFloat9346) + Node_Sub38_Sub19.aFloat10295 * (float) i_226_);
							int i_232_ = (int) (Class17.aFloat275 + Class155.aFloat1954 * (float) i_225_ + Class200_Sub1.aFloat5140 * (float) aShort5671 + (float) i_226_ * Class107.aFloat1361);
							entitynode_sub5.anInt5984 = aGLToolkit5692.anInt6702 - -(i_231_ * aGLToolkit5692.anInt6730 / i);
							entitynode_sub5.anInt5982 = aGLToolkit5692.anInt6667 * i_230_ / i + aGLToolkit5692.anInt6714;
							entitynode_sub5.anInt5985 = aGLToolkit5692.anInt6714 - -(aGLToolkit5692.anInt6667 * i_227_ / i);
							entitynode_sub5.anInt5986 = aGLToolkit5692.anInt6730 * i_228_ / i + aGLToolkit5692.anInt6702;
							if ((i_229_ ^ 0xffffffff) <= (aGLToolkit5692.anInt6693 ^ 0xffffffff) || (i_232_ ^ 0xffffffff) <= (aGLToolkit5692.anInt6693 ^ 0xffffffff)) {
								entitynode_sub5.aBoolean5987 = true;
								entitynode_sub5.anInt5983 = -entitynode_sub5.anInt5985 + (i_227_ - -aShort5686) * aGLToolkit5692.anInt6667 / i + aGLToolkit5692.anInt6714;
							}
						}
						aGLToolkit5692.method1407((byte) 105, (float) i);
						aGLToolkit5692.method1421(1);
						aGLToolkit5692.method1463(class336_sub3_213_, 1);
						method646(true);
						aGLToolkit5692.method1439(126);
						method642((byte) -92);
					}
				}
			}
		}
	}
	
	final int V() {
		anInt5678++;
		if (!aBoolean5698) {
			method640((byte) 15);
		}
		return aShort5619;
	}
	
	final void P(int i, int i_233_, int i_234_, int i_235_) {
		anInt5593++;
		if ((i ^ 0xffffffff) == -1) {
			Class270_Sub2_Sub1.anInt10546 = 0;
			int i_236_ = 0;
			Class378.anInt4676 = 0;
			Class297.anInt3702 = 0;
			for (int i_237_ = 0; (i_237_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_237_++) {
				Class378.anInt4676 += anIntArray5595[i_237_];
				Class297.anInt3702 += anIntArray5588[i_237_];
				Class270_Sub2_Sub1.anInt10546 = Class270_Sub2_Sub1.anInt10546 + anIntArray5637[i_237_];
				i_236_++;
			}
			if ((i_236_ ^ 0xffffffff) >= -1) {
				Class297.anInt3702 = i_234_;
				Class378.anInt4676 = i_233_;
				Class270_Sub2_Sub1.anInt10546 = i_235_;
			} else {
				Class378.anInt4676 = i_233_ + Class378.anInt4676 / i_236_;
				Class270_Sub2_Sub1.anInt10546 = i_235_ + Class270_Sub2_Sub1.anInt10546 / i_236_;
				Class297.anInt3702 = Class297.anInt3702 / i_236_ + i_234_;
			}
		} else if ((i ^ 0xffffffff) == -2) {
			for (int i_238_ = 0; (anInt5672 ^ 0xffffffff) < (i_238_ ^ 0xffffffff); i_238_++) {
				anIntArray5595[i_238_] += i_233_;
				anIntArray5588[i_238_] += i_234_;
				anIntArray5637[i_238_] += i_235_;
			}
		} else if ((i ^ 0xffffffff) == -3) {
			for (int i_239_ = 0; (anInt5672 ^ 0xffffffff) < (i_239_ ^ 0xffffffff); i_239_++) {
				anIntArray5595[i_239_] -= Class378.anInt4676;
				anIntArray5588[i_239_] -= Class297.anInt3702;
				anIntArray5637[i_239_] -= Class270_Sub2_Sub1.anInt10546;
				if (i_235_ != 0) {
					int i_240_ = Class335.anIntArray4167[i_235_];
					int i_241_ = Class335.anIntArray4165[i_235_];
					int i_242_ = anIntArray5595[i_239_] * i_241_ + i_240_ * anIntArray5588[i_239_] - -16383 >> 14;
					anIntArray5588[i_239_] = -(anIntArray5595[i_239_] * i_240_) + i_241_ * anIntArray5588[i_239_] + 16383 >> 14;
					anIntArray5595[i_239_] = i_242_;
				}
				if (i_233_ != 0) {
					int i_243_ = Class335.anIntArray4167[i_233_];
					int i_244_ = Class335.anIntArray4165[i_233_];
					int i_245_ = 16383 + (anIntArray5588[i_239_] * i_244_ - i_243_ * anIntArray5637[i_239_]) >> 14;
					anIntArray5637[i_239_] = i_244_ * anIntArray5637[i_239_] + anIntArray5588[i_239_] * i_243_ - -16383 >> 14;
					anIntArray5588[i_239_] = i_245_;
				}
				if (i_234_ != 0) {
					int i_246_ = Class335.anIntArray4167[i_234_];
					int i_247_ = Class335.anIntArray4165[i_234_];
					int i_248_ = anIntArray5595[i_239_] * i_247_ + i_246_ * anIntArray5637[i_239_] - -16383 >> 14;
					anIntArray5637[i_239_] = anIntArray5637[i_239_] * i_247_ - i_246_ * anIntArray5595[i_239_] + 16383 >> 14;
					anIntArray5595[i_239_] = i_248_;
				}
				anIntArray5595[i_239_] += Class378.anInt4676;
				anIntArray5588[i_239_] += Class297.anInt3702;
				anIntArray5637[i_239_] += Class270_Sub2_Sub1.anInt10546;
			}
		} else if (i == 3) {
			for (int i_249_ = 0; anInt5672 > i_249_; i_249_++) {
				anIntArray5595[i_249_] -= Class378.anInt4676;
				anIntArray5588[i_249_] -= Class297.anInt3702;
				anIntArray5637[i_249_] -= Class270_Sub2_Sub1.anInt10546;
				anIntArray5595[i_249_] = i_233_ * anIntArray5595[i_249_] / 128;
				anIntArray5588[i_249_] = anIntArray5588[i_249_] * i_234_ / 128;
				anIntArray5637[i_249_] = i_235_ * anIntArray5637[i_249_] / 128;
				anIntArray5595[i_249_] += Class378.anInt4676;
				anIntArray5588[i_249_] += Class297.anInt3702;
				anIntArray5637[i_249_] += Class270_Sub2_Sub1.anInt10546;
			}
		} else if ((i ^ 0xffffffff) == -6) {
			for (int i_250_ = 0; (anInt5709 ^ 0xffffffff) < (i_250_ ^ 0xffffffff); i_250_++) {
				int i_251_ = (aByteArray5658[i_250_] & 0xff) - -(8 * i_233_);
				if (i_251_ >= 0) {
					if ((i_251_ ^ 0xffffffff) < -256) {
						i_251_ = 255;
					}
				} else {
					i_251_ = 0;
				}
				aByteArray5658[i_250_] = (byte) i_251_;
			}
			if (aClass69_5604 != null) {
				aClass69_5604.anInterface9_939 = null;
			}
			if (aClass72Array5627 != null) {
				for (int i_252_ = 0; (i_252_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_252_++) {
					Class72 class72 = aClass72Array5627[i_252_];
					Class190 class190 = aClass190Array5674[i_252_];
					class190.anInt2335 = 0xffffff & class190.anInt2335 | -(0xff & aByteArray5658[class72.anInt975]) + 255 << 24;
				}
			}
		} else if ((i ^ 0xffffffff) == -8) {
			for (int i_253_ = 0; (anInt5709 ^ 0xffffffff) < (i_253_ ^ 0xffffffff); i_253_++) {
				int i_254_ = 0xffff & aShortArray5693[i_253_];
				int i_255_ = 0x3f & i_254_ >> 10;
				int i_256_ = (0x385 & i_254_) >> 7;
				i_255_ = i_255_ + i_233_ & 0x3f;
				int i_257_ = i_254_ & 0x7f;
				i_256_ += i_234_ / 4;
				if (i_256_ >= 0) {
					if ((i_256_ ^ 0xffffffff) < -8) {
						i_256_ = 7;
					}
				} else {
					i_256_ = 0;
				}
				i_257_ += i_235_;
				if ((i_257_ ^ 0xffffffff) > -1) {
					i_257_ = 0;
				} else if (i_257_ > 127) {
					i_257_ = 127;
				}
				aShortArray5693[i_253_] = (short) Node_Sub16.method2590(i_257_, Node_Sub16.method2590(i_255_ << 10, i_256_ << 7));
			}
			if (aClass69_5604 != null) {
				aClass69_5604.anInterface9_939 = null;
			}
			if (aClass72Array5627 != null) {
				for (int i_258_ = 0; (anInt5659 ^ 0xffffffff) < (i_258_ ^ 0xffffffff); i_258_++) {
					Class72 class72 = aClass72Array5627[i_258_];
					Class190 class190 = aClass190Array5674[i_258_];
					class190.anInt2335 = class190.anInt2335 & ~0xffffff | 0xffffff & Class85.anIntArray1158[aShortArray5693[class72.anInt975] & 0xffff];
				}
			}
		} else if (i == 8) {
			for (int i_259_ = 0; (anInt5659 ^ 0xffffffff) < (i_259_ ^ 0xffffffff); i_259_++) {
				Class190 class190 = aClass190Array5674[i_259_];
				class190.anInt2337 += i_233_;
				class190.anInt2329 += i_234_;
			}
		} else if ((i ^ 0xffffffff) == -11) {
			for (int i_260_ = 0; (i_260_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_260_++) {
				Class190 class190 = aClass190Array5674[i_260_];
				class190.anInt2339 = class190.anInt2339 * i_233_ >> 7;
				class190.anInt2332 = i_234_ * class190.anInt2332 >> 7;
			}
		} else if (i == 9) {
			for (int i_261_ = 0; (anInt5659 ^ 0xffffffff) < (i_261_ ^ 0xffffffff); i_261_++) {
				Class190 class190 = aClass190Array5674[i_261_];
				class190.anInt2333 = 0x3fff & i_233_ + class190.anInt2333;
			}
		}
	}
	
	final int G() {
		if (!aBoolean5698) {
			method640((byte) 108);
		}
		anInt5697++;
		return aShort5677;
	}
	
	final void VA(int i) {
		anInt5648++;
		int i_262_ = Class335.anIntArray4167[i];
		int i_263_ = Class335.anIntArray4165[i];
		for (int i_264_ = 0; (i_264_ ^ 0xffffffff) > (anInt5672 ^ 0xffffffff); i_264_++) {
			int i_265_ = i_262_ * anIntArray5588[i_264_] + i_263_ * anIntArray5595[i_264_] >> 14;
			anIntArray5588[i_264_] = -(anIntArray5595[i_264_] * i_262_) + anIntArray5588[i_264_] * i_263_ >> 14;
			anIntArray5595[i_264_] = i_265_;
		}
		aBoolean5698 = false;
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
	}
	
	final int na() {
		anInt5602++;
		if (!aBoolean5698) {
			method640((byte) -123);
		}
		return aShort5686;
	}
	
	final void I(int i, int[] is, int i_266_, int i_267_, int i_268_, boolean bool, int i_269_, int[] is_270_) {
		anInt5673++;
		int i_271_ = is.length;
		if (i == 0) {
			i_267_ <<= 4;
			i_266_ <<= 4;
			i_268_ <<= 4;
			int i_272_ = 0;
			Class297.anInt3702 = 0;
			Class378.anInt4676 = 0;
			Class270_Sub2_Sub1.anInt10546 = 0;
			for (int i_273_ = 0; (i_273_ ^ 0xffffffff) > (i_271_ ^ 0xffffffff); i_273_++) {
				int i_274_ = is[i_273_];
				if ((i_274_ ^ 0xffffffff) > (anIntArrayArray5684.length ^ 0xffffffff)) {
					int[] is_275_ = anIntArrayArray5684[i_274_];
					for (int i_276_ = 0; (i_276_ ^ 0xffffffff) > (is_275_.length ^ 0xffffffff); i_276_++) {
						int i_277_ = is_275_[i_276_];
						if (aShortArray5618 == null || (aShortArray5618[i_277_] & i_269_) != 0) {
							Class378.anInt4676 += anIntArray5595[i_277_];
							Class297.anInt3702 += anIntArray5588[i_277_];
							i_272_++;
							Class270_Sub2_Sub1.anInt10546 += anIntArray5637[i_277_];
						}
					}
				}
			}
			if ((i_272_ ^ 0xffffffff) >= -1) {
				Class270_Sub2_Sub1.anInt10546 = i_268_;
				Class378.anInt4676 = i_266_;
				Class297.anInt3702 = i_267_;
			} else {
				Animable_Sub1.aBoolean9105 = true;
				Class270_Sub2_Sub1.anInt10546 = Class270_Sub2_Sub1.anInt10546 / i_272_ - -i_268_;
				Class378.anInt4676 = Class378.anInt4676 / i_272_ - -i_266_;
				Class297.anInt3702 = i_267_ + Class297.anInt3702 / i_272_;
			}
		} else if ((i ^ 0xffffffff) == -2) {
			if (is_270_ != null) {
				int i_278_ = is_270_[1] * i_267_ + i_266_ * is_270_[0] + (is_270_[2] * i_268_ - -8192) >> 14;
				int i_279_ = 8192 + (i_268_ * is_270_[5] + i_267_ * is_270_[4]) + i_266_ * is_270_[3] >> 14;
				int i_280_ = 8192 + i_268_ * is_270_[8] + (i_266_ * is_270_[6] - -(i_267_ * is_270_[7])) >> 14;
				i_268_ = i_280_;
				i_266_ = i_278_;
				i_267_ = i_279_;
			}
			i_266_ <<= 4;
			i_268_ <<= 4;
			i_267_ <<= 4;
			for (int i_281_ = 0; i_271_ > i_281_; i_281_++) {
				int i_282_ = is[i_281_];
				if ((anIntArrayArray5684.length ^ 0xffffffff) < (i_282_ ^ 0xffffffff)) {
					int[] is_283_ = anIntArrayArray5684[i_282_];
					for (int i_284_ = 0; is_283_.length > i_284_; i_284_++) {
						int i_285_ = is_283_[i_284_];
						if (aShortArray5618 == null || (i_269_ & aShortArray5618[i_285_]) != 0) {
							anIntArray5595[i_285_] += i_266_;
							anIntArray5588[i_285_] += i_267_;
							anIntArray5637[i_285_] += i_268_;
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -3) {
			if (is_270_ != null) {
				int i_286_ = is_270_[9] << 4;
				int i_287_ = is_270_[10] << 4;
				int i_288_ = is_270_[11] << 4;
				int i_289_ = is_270_[12] << 4;
				int i_290_ = is_270_[13] << 4;
				int i_291_ = is_270_[14] << 4;
				if (Animable_Sub1.aBoolean9105) {
					int i_292_ = Class378.anInt4676 * is_270_[0] + (Class297.anInt3702 * is_270_[3] + Class270_Sub2_Sub1.anInt10546 * is_270_[6] - -8192) >> 14;
					int i_293_ = is_270_[7] * Class270_Sub2_Sub1.anInt10546 + is_270_[4] * Class297.anInt3702 + is_270_[1] * Class378.anInt4676 + 8192 >> 14;
					i_292_ += i_289_;
					i_293_ += i_290_;
					int i_294_ = Class378.anInt4676 * is_270_[2] - -(Class297.anInt3702 * is_270_[5]) - -(is_270_[8] * Class270_Sub2_Sub1.anInt10546) - -8192 >> 14;
					i_294_ += i_291_;
					Class378.anInt4676 = i_292_;
					Class297.anInt3702 = i_293_;
					Class270_Sub2_Sub1.anInt10546 = i_294_;
					Animable_Sub1.aBoolean9105 = false;
				}
				int[] is_295_ = new int[9];
				int i_296_ = Class335.anIntArray4165[i_266_];
				int i_297_ = Class335.anIntArray4167[i_266_];
				int i_298_ = Class335.anIntArray4165[i_267_];
				int i_299_ = Class335.anIntArray4167[i_267_];
				int i_300_ = Class335.anIntArray4165[i_268_];
				int i_301_ = Class335.anIntArray4167[i_268_];
				int i_302_ = i_300_ * i_297_ + 8192 >> 14;
				int i_303_ = 8192 + i_301_ * i_297_ >> 14;
				is_295_[0] = i_303_ * i_299_ + i_298_ * i_300_ + 8192 >> 14;
				is_295_[4] = 8192 + i_300_ * i_296_ >> 14;
				is_295_[1] = i_299_ * i_302_ + (i_301_ * -i_298_ + 8192) >> 14;
				is_295_[8] = i_296_ * i_298_ + 8192 >> 14;
				is_295_[2] = i_296_ * i_299_ - -8192 >> 14;
				is_295_[7] = i_299_ * i_301_ - (-(i_298_ * i_302_) + -8192) >> 14;
				is_295_[6] = i_300_ * -i_299_ + i_298_ * i_303_ - -8192 >> 14;
				is_295_[3] = i_301_ * i_296_ - -8192 >> 14;
				is_295_[5] = -i_297_;
				int i_304_ = is_295_[1] * -Class297.anInt3702 + (-Class378.anInt4676 * is_295_[0] - -(-Class270_Sub2_Sub1.anInt10546 * is_295_[2])) + 8192 >> 14;
				int i_305_ = -Class378.anInt4676 * is_295_[3] - (-(-Class297.anInt3702 * is_295_[4]) + (-(-Class270_Sub2_Sub1.anInt10546 * is_295_[5]) - 8192)) >> 14;
				int i_306_ = 8192 + (is_295_[6] * -Class378.anInt4676 - (-(-Class297.anInt3702 * is_295_[7]) - -Class270_Sub2_Sub1.anInt10546 * is_295_[8])) >> 14;
				int i_307_ = i_304_ + Class378.anInt4676;
				int i_308_ = Class297.anInt3702 + i_305_;
				int i_309_ = Class270_Sub2_Sub1.anInt10546 + i_306_;
				int[] is_310_ = new int[9];
				for (int i_311_ = 0; (i_311_ ^ 0xffffffff) > -4; i_311_++) {
					for (int i_312_ = 0; i_312_ < 3; i_312_++) {
						int i_313_ = 0;
						for (int i_314_ = 0; i_314_ < 3; i_314_++)
							i_313_ += is_270_[3 * i_312_ + i_314_] * is_295_[i_314_ + i_311_ * 3];
						is_310_[i_312_ + i_311_ * 3] = i_313_ + 8192 >> 14;
					}
				}
				int i_315_ = 8192 + i_291_ * is_295_[2] + is_295_[1] * i_290_ + is_295_[0] * i_289_ >> 14;
				int i_316_ = is_295_[4] * i_290_ + (i_289_ * is_295_[3] + (i_291_ * is_295_[5] + 8192)) >> 14;
				i_315_ += i_307_;
				int i_317_ = is_295_[6] * i_289_ + is_295_[7] * i_290_ - (-(i_291_ * is_295_[8]) - 8192) >> 14;
				i_316_ += i_308_;
				i_317_ += i_309_;
				int[] is_318_ = new int[9];
				for (int i_319_ = 0; (i_319_ ^ 0xffffffff) > -4; i_319_++) {
					for (int i_320_ = 0; i_320_ < 3; i_320_++) {
						int i_321_ = 0;
						for (int i_322_ = 0; i_322_ < 3; i_322_++)
							i_321_ += is_310_[i_322_ * 3 + i_320_] * is_270_[i_322_ + 3 * i_319_];
						is_318_[i_320_ + 3 * i_319_] = 8192 + i_321_ >> 14;
					}
				}
				int i_323_ = is_270_[1] * i_316_ + is_270_[0] * i_315_ + i_317_ * is_270_[2] - -8192 >> 14;
				int i_324_ = is_270_[5] * i_317_ + (is_270_[3] * i_315_ - -(is_270_[4] * i_316_)) - -8192 >> 14;
				int i_325_ = is_270_[8] * i_317_ + i_315_ * is_270_[6] - (-(is_270_[7] * i_316_) + -8192) >> 14;
				i_323_ += i_286_;
				i_324_ += i_287_;
				i_325_ += i_288_;
				for (int i_326_ = 0; i_271_ > i_326_; i_326_++) {
					int i_327_ = is[i_326_];
					if ((anIntArrayArray5684.length ^ 0xffffffff) < (i_327_ ^ 0xffffffff)) {
						int[] is_328_ = anIntArrayArray5684[i_327_];
						for (int i_329_ = 0; (is_328_.length ^ 0xffffffff) < (i_329_ ^ 0xffffffff); i_329_++) {
							int i_330_ = is_328_[i_329_];
							if (aShortArray5618 == null || (aShortArray5618[i_330_] & i_269_ ^ 0xffffffff) != -1) {
								int i_331_ = 8192 + (anIntArray5588[i_330_] * is_318_[1] + is_318_[0] * anIntArray5595[i_330_] + anIntArray5637[i_330_] * is_318_[2]) >> 14;
								int i_332_ = is_318_[4] * anIntArray5588[i_330_] + is_318_[3] * anIntArray5595[i_330_] + anIntArray5637[i_330_] * is_318_[5] + 8192 >> 14;
								i_332_ += i_324_;
								i_331_ += i_323_;
								int i_333_ = 8192 + (anIntArray5588[i_330_] * is_318_[7] + is_318_[6] * anIntArray5595[i_330_]) + is_318_[8] * anIntArray5637[i_330_] >> 14;
								anIntArray5595[i_330_] = i_331_;
								i_333_ += i_325_;
								anIntArray5588[i_330_] = i_332_;
								anIntArray5637[i_330_] = i_333_;
							}
						}
					}
				}
			} else {
				for (int i_334_ = 0; i_271_ > i_334_; i_334_++) {
					int i_335_ = is[i_334_];
					if (anIntArrayArray5684.length > i_335_) {
						int[] is_336_ = anIntArrayArray5684[i_335_];
						for (int i_337_ = 0; is_336_.length > i_337_; i_337_++) {
							int i_338_ = is_336_[i_337_];
							if (aShortArray5618 == null || (i_269_ & aShortArray5618[i_338_]) != 0) {
								anIntArray5595[i_338_] -= Class378.anInt4676;
								anIntArray5588[i_338_] -= Class297.anInt3702;
								anIntArray5637[i_338_] -= Class270_Sub2_Sub1.anInt10546;
								if (i_268_ != 0) {
									int i_339_ = Class335.anIntArray4167[i_268_];
									int i_340_ = Class335.anIntArray4165[i_268_];
									int i_341_ = i_340_ * anIntArray5595[i_338_] + i_339_ * anIntArray5588[i_338_] + 16383 >> 14;
									anIntArray5588[i_338_] = i_340_ * anIntArray5588[i_338_] + (-(i_339_ * anIntArray5595[i_338_]) - -16383) >> 14;
									anIntArray5595[i_338_] = i_341_;
								}
								if ((i_266_ ^ 0xffffffff) != -1) {
									int i_342_ = Class335.anIntArray4167[i_266_];
									int i_343_ = Class335.anIntArray4165[i_266_];
									int i_344_ = i_343_ * anIntArray5588[i_338_] + -(i_342_ * anIntArray5637[i_338_]) + 16383 >> 14;
									anIntArray5637[i_338_] = 16383 + (anIntArray5637[i_338_] * i_343_ + i_342_ * anIntArray5588[i_338_]) >> 14;
									anIntArray5588[i_338_] = i_344_;
								}
								if (i_267_ != 0) {
									int i_345_ = Class335.anIntArray4167[i_267_];
									int i_346_ = Class335.anIntArray4165[i_267_];
									int i_347_ = anIntArray5595[i_338_] * i_346_ + i_345_ * anIntArray5637[i_338_] - -16383 >> 14;
									anIntArray5637[i_338_] = 16383 + -(i_345_ * anIntArray5595[i_338_]) + anIntArray5637[i_338_] * i_346_ >> 14;
									anIntArray5595[i_338_] = i_347_;
								}
								anIntArray5595[i_338_] += Class378.anInt4676;
								anIntArray5588[i_338_] += Class297.anInt3702;
								anIntArray5637[i_338_] += Class270_Sub2_Sub1.anInt10546;
							}
						}
					}
				}
				if (bool) {
					for (int i_348_ = 0; (i_271_ ^ 0xffffffff) < (i_348_ ^ 0xffffffff); i_348_++) {
						int i_349_ = is[i_348_];
						if (anIntArrayArray5684.length > i_349_) {
							int[] is_350_ = anIntArrayArray5684[i_349_];
							for (int i_351_ = 0; is_350_.length > i_351_; i_351_++) {
								int i_352_ = is_350_[i_351_];
								if (aShortArray5618 == null || (aShortArray5618[i_352_] & i_269_) != 0) {
									int i_353_ = anIntArray5633[i_352_];
									int i_354_ = anIntArray5633[i_352_ - -1];
									for (int i_355_ = i_353_; (i_355_ ^ 0xffffffff) > (i_354_ ^ 0xffffffff); i_355_++) {
										int i_356_ = aShortArray5679[i_355_] + -1;
										if ((i_356_ ^ 0xffffffff) == 0) {
											break;
										}
										if ((i_268_ ^ 0xffffffff) != -1) {
											int i_357_ = Class335.anIntArray4167[i_268_];
											int i_358_ = Class335.anIntArray4165[i_268_];
											int i_359_ = 16383 + aShortArray5635[i_356_] * i_358_ + i_357_ * aShortArray5691[i_356_] >> 14;
											aShortArray5691[i_356_] = (short) (16383 + (i_358_ * aShortArray5691[i_356_] + -(i_357_ * aShortArray5635[i_356_])) >> 14);
											aShortArray5635[i_356_] = (short) i_359_;
										}
										if (i_266_ != 0) {
											int i_360_ = Class335.anIntArray4167[i_266_];
											int i_361_ = Class335.anIntArray4165[i_266_];
											int i_362_ = -(aShortArray5685[i_356_] * i_360_) + i_361_ * aShortArray5691[i_356_] + 16383 >> 14;
											aShortArray5685[i_356_] = (short) (aShortArray5685[i_356_] * i_361_ + (aShortArray5691[i_356_] * i_360_ - -16383) >> 14);
											aShortArray5691[i_356_] = (short) i_362_;
										}
										if (i_267_ != 0) {
											int i_363_ = Class335.anIntArray4167[i_267_];
											int i_364_ = Class335.anIntArray4165[i_267_];
											int i_365_ = aShortArray5635[i_356_] * i_364_ + i_363_ * aShortArray5685[i_356_] + 16383 >> 14;
											aShortArray5685[i_356_] = (short) (-(i_363_ * aShortArray5635[i_356_]) + aShortArray5685[i_356_] * i_364_ + 16383 >> 14);
											aShortArray5635[i_356_] = (short) i_365_;
										}
									}
								}
							}
						}
					}
					if (aClass69_5649 == null && aClass69_5604 != null) {
						aClass69_5604.anInterface9_939 = null;
					}
					if (aClass69_5649 != null) {
						aClass69_5649.anInterface9_939 = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_270_ == null) {
				for (int i_366_ = 0; i_366_ < i_271_; i_366_++) {
					int i_367_ = is[i_366_];
					if ((i_367_ ^ 0xffffffff) > (anIntArrayArray5684.length ^ 0xffffffff)) {
						int[] is_368_ = anIntArrayArray5684[i_367_];
						for (int i_369_ = 0; (is_368_.length ^ 0xffffffff) < (i_369_ ^ 0xffffffff); i_369_++) {
							int i_370_ = is_368_[i_369_];
							if (aShortArray5618 == null || (i_269_ & aShortArray5618[i_370_] ^ 0xffffffff) != -1) {
								anIntArray5595[i_370_] -= Class378.anInt4676;
								anIntArray5588[i_370_] -= Class297.anInt3702;
								anIntArray5637[i_370_] -= Class270_Sub2_Sub1.anInt10546;
								anIntArray5595[i_370_] = i_266_ * anIntArray5595[i_370_] >> 7;
								anIntArray5588[i_370_] = anIntArray5588[i_370_] * i_267_ >> 7;
								anIntArray5637[i_370_] = i_268_ * anIntArray5637[i_370_] >> 7;
								anIntArray5595[i_370_] += Class378.anInt4676;
								anIntArray5588[i_370_] += Class297.anInt3702;
								anIntArray5637[i_370_] += Class270_Sub2_Sub1.anInt10546;
							}
						}
					}
				}
			} else {
				int i_371_ = is_270_[9] << 4;
				int i_372_ = is_270_[10] << 4;
				int i_373_ = is_270_[11] << 4;
				int i_374_ = is_270_[12] << 4;
				int i_375_ = is_270_[13] << 4;
				int i_376_ = is_270_[14] << 4;
				if (Animable_Sub1.aBoolean9105) {
					int i_377_ = 8192 + (Class297.anInt3702 * is_270_[3] + is_270_[0] * Class378.anInt4676 + is_270_[6] * Class270_Sub2_Sub1.anInt10546) >> 14;
					int i_378_ = is_270_[7] * Class270_Sub2_Sub1.anInt10546 + is_270_[1] * Class378.anInt4676 - -(is_270_[4] * Class297.anInt3702) - -8192 >> 14;
					int i_379_ = 8192 + (Class270_Sub2_Sub1.anInt10546 * is_270_[8] + Class297.anInt3702 * is_270_[5] + Class378.anInt4676 * is_270_[2]) >> 14;
					i_377_ += i_374_;
					i_378_ += i_375_;
					Class297.anInt3702 = i_378_;
					i_379_ += i_376_;
					Class378.anInt4676 = i_377_;
					Animable_Sub1.aBoolean9105 = false;
					Class270_Sub2_Sub1.anInt10546 = i_379_;
				}
				int i_380_ = i_266_ << 15 >> 7;
				int i_381_ = i_267_ << 15 >> 7;
				int i_382_ = i_268_ << 15 >> 7;
				int i_383_ = 8192 + -Class378.anInt4676 * i_380_ >> 14;
				int i_384_ = i_381_ * -Class297.anInt3702 - -8192 >> 14;
				int i_385_ = -Class270_Sub2_Sub1.anInt10546 * i_382_ - -8192 >> 14;
				int i_386_ = i_383_ - -Class378.anInt4676;
				int i_387_ = Class297.anInt3702 + i_384_;
				int i_388_ = Class270_Sub2_Sub1.anInt10546 + i_385_;
				int[] is_389_ = new int[9];
				is_389_[0] = i_380_ * is_270_[0] - -8192 >> 14;
				is_389_[2] = 8192 + i_380_ * is_270_[6] >> 14;
				is_389_[1] = is_270_[3] * i_380_ - -8192 >> 14;
				is_389_[5] = i_381_ * is_270_[7] + 8192 >> 14;
				is_389_[4] = is_270_[4] * i_381_ + 8192 >> 14;
				is_389_[3] = 8192 + i_381_ * is_270_[1] >> 14;
				is_389_[6] = is_270_[2] * i_382_ + 8192 >> 14;
				is_389_[8] = i_382_ * is_270_[8] - -8192 >> 14;
				is_389_[7] = 8192 + i_382_ * is_270_[5] >> 14;
				int i_390_ = i_380_ * i_374_ - -8192 >> 14;
				int i_391_ = i_381_ * i_375_ + 8192 >> 14;
				i_390_ += i_386_;
				int i_392_ = 8192 + i_382_ * i_376_ >> 14;
				i_391_ += i_387_;
				i_392_ += i_388_;
				int[] is_393_ = new int[9];
				for (int i_394_ = 0; i_394_ < 3; i_394_++) {
					for (int i_395_ = 0; i_395_ < 3; i_395_++) {
						int i_396_ = 0;
						for (int i_397_ = 0; (i_397_ ^ 0xffffffff) > -4; i_397_++)
							i_396_ += is_389_[i_395_ + 3 * i_397_] * is_270_[i_397_ + i_394_ * 3];
						is_393_[i_395_ + i_394_ * 3] = 8192 + i_396_ >> 14;
					}
				}
				int i_398_ = 8192 + (i_391_ * is_270_[1] + (i_390_ * is_270_[0] + is_270_[2] * i_392_)) >> 14;
				int i_399_ = i_392_ * is_270_[5] + (is_270_[4] * i_391_ + (i_390_ * is_270_[3] - -8192)) >> 14;
				i_398_ += i_371_;
				int i_400_ = i_392_ * is_270_[8] + (is_270_[7] * i_391_ + i_390_ * is_270_[6]) - -8192 >> 14;
				i_399_ += i_372_;
				i_400_ += i_373_;
				for (int i_401_ = 0; i_271_ > i_401_; i_401_++) {
					int i_402_ = is[i_401_];
					if ((i_402_ ^ 0xffffffff) > (anIntArrayArray5684.length ^ 0xffffffff)) {
						int[] is_403_ = anIntArrayArray5684[i_402_];
						for (int i_404_ = 0; (i_404_ ^ 0xffffffff) > (is_403_.length ^ 0xffffffff); i_404_++) {
							int i_405_ = is_403_[i_404_];
							if (aShortArray5618 == null || (i_269_ & aShortArray5618[i_405_] ^ 0xffffffff) != -1) {
								int i_406_ = anIntArray5595[i_405_] * is_393_[0] + (is_393_[1] * anIntArray5588[i_405_] - -(is_393_[2] * anIntArray5637[i_405_])) + 8192 >> 14;
								int i_407_ = 8192 + (is_393_[3] * anIntArray5595[i_405_] - -(anIntArray5588[i_405_] * is_393_[4])) - -(anIntArray5637[i_405_] * is_393_[5]) >> 14;
								i_406_ += i_398_;
								i_407_ += i_399_;
								int i_408_ = is_393_[6] * anIntArray5595[i_405_] - -(anIntArray5588[i_405_] * is_393_[7]) - -(anIntArray5637[i_405_] * is_393_[8]) - -8192 >> 14;
								anIntArray5595[i_405_] = i_406_;
								i_408_ += i_400_;
								anIntArray5588[i_405_] = i_407_;
								anIntArray5637[i_405_] = i_408_;
							}
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -6) {
			if (anIntArrayArray5591 != null) {
				for (int i_409_ = 0; i_409_ < i_271_; i_409_++) {
					int i_410_ = is[i_409_];
					if ((anIntArrayArray5591.length ^ 0xffffffff) < (i_410_ ^ 0xffffffff)) {
						int[] is_411_ = anIntArrayArray5591[i_410_];
						for (int i_412_ = 0; is_411_.length > i_412_; i_412_++) {
							int i_413_ = is_411_[i_412_];
							if (aShortArray5629 == null || (aShortArray5629[i_413_] & i_269_ ^ 0xffffffff) != -1) {
								int i_414_ = 8 * i_266_ + (0xff & aByteArray5658[i_413_]);
								if ((i_414_ ^ 0xffffffff) > -1) {
									i_414_ = 0;
								} else if (i_414_ > 255) {
									i_414_ = 255;
								}
								aByteArray5658[i_413_] = (byte) i_414_;
								if (aClass69_5604 != null) {
									aClass69_5604.anInterface9_939 = null;
								}
							}
						}
					}
				}
				if (aClass72Array5627 != null) {
					for (int i_415_ = 0; i_415_ < anInt5659; i_415_++) {
						Class72 class72 = aClass72Array5627[i_415_];
						Class190 class190 = aClass190Array5674[i_415_];
						class190.anInt2335 = 255 + -(aByteArray5658[class72.anInt975] & 0xff) << 24 | class190.anInt2335 & 0xffffff;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray5591 != null) {
				for (int i_416_ = 0; i_271_ > i_416_; i_416_++) {
					int i_417_ = is[i_416_];
					if (anIntArrayArray5591.length > i_417_) {
						int[] is_418_ = anIntArrayArray5591[i_417_];
						for (int i_419_ = 0; is_418_.length > i_419_; i_419_++) {
							int i_420_ = is_418_[i_419_];
							if (aShortArray5629 == null || (aShortArray5629[i_420_] & i_269_) != 0) {
								int i_421_ = 0xffff & aShortArray5693[i_420_];
								int i_422_ = (0xfeb1 & i_421_) >> 10;
								int i_423_ = 0x7 & i_421_ >> 7;
								int i_424_ = 0x7f & i_421_;
								i_422_ = i_266_ + i_422_ & 0x3f;
								i_423_ += i_267_ / 4;
								if ((i_423_ ^ 0xffffffff) <= -1) {
									if (i_423_ > 7) {
										i_423_ = 7;
									}
								} else {
									i_423_ = 0;
								}
								i_424_ += i_268_;
								if (i_424_ < 0) {
									i_424_ = 0;
								} else if (i_424_ > 127) {
									i_424_ = 127;
								}
								aShortArray5693[i_420_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_422_ << 10, i_423_ << 7), i_424_);
								if (aClass69_5604 != null) {
									aClass69_5604.anInterface9_939 = null;
								}
							}
						}
					}
				}
				if (aClass72Array5627 != null) {
					for (int i_425_ = 0; anInt5659 > i_425_; i_425_++) {
						Class72 class72 = aClass72Array5627[i_425_];
						Class190 class190 = aClass190Array5674[i_425_];
						class190.anInt2335 = ~0xffffff & class190.anInt2335 | Class85.anIntArray1158[0xffff & aShortArray5693[class72.anInt975]] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray5615 != null) {
				for (int i_426_ = 0; i_426_ < i_271_; i_426_++) {
					int i_427_ = is[i_426_];
					if (anIntArrayArray5615.length > i_427_) {
						int[] is_428_ = anIntArrayArray5615[i_427_];
						for (int i_429_ = 0; (is_428_.length ^ 0xffffffff) < (i_429_ ^ 0xffffffff); i_429_++) {
							Class190 class190 = aClass190Array5674[is_428_[i_429_]];
							class190.anInt2329 += i_267_;
							class190.anInt2337 += i_266_;
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -11) {
			if (anIntArrayArray5615 != null) {
				for (int i_430_ = 0; i_430_ < i_271_; i_430_++) {
					int i_431_ = is[i_430_];
					if (i_431_ < anIntArrayArray5615.length) {
						int[] is_432_ = anIntArrayArray5615[i_431_];
						for (int i_433_ = 0; (is_432_.length ^ 0xffffffff) < (i_433_ ^ 0xffffffff); i_433_++) {
							Class190 class190 = aClass190Array5674[is_432_[i_433_]];
							class190.anInt2339 = i_266_ * class190.anInt2339 >> 7;
							class190.anInt2332 = i_267_ * class190.anInt2332 >> 7;
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -10 && anIntArrayArray5615 != null) {
			for (int i_434_ = 0; (i_434_ ^ 0xffffffff) > (i_271_ ^ 0xffffffff); i_434_++) {
				int i_435_ = is[i_434_];
				if ((i_435_ ^ 0xffffffff) > (anIntArrayArray5615.length ^ 0xffffffff)) {
					int[] is_436_ = anIntArrayArray5615[i_435_];
					for (int i_437_ = 0; (is_436_.length ^ 0xffffffff) < (i_437_ ^ 0xffffffff); i_437_++) {
						Class190 class190 = aClass190Array5674[is_436_[i_437_]];
						class190.anInt2333 = 0x3fff & class190.anInt2333 - -i_266_;
					}
				}
			}
		}
	}
	
	final boolean method612() {
		anInt5669++;
		if (aShortArray5699 == null) {
			return true;
		}
		for (int i = 0; (aShortArray5699.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (aShortArray5699[i] != -1 && !aGLToolkit5692.aD1543.method7(9900, aShortArray5699[i])) {
				return false;
			}
		}
		return true;
	}
	
	final void k(int i) {
		anInt5614++;
		int i_438_ = Class335.anIntArray4167[i];
		int i_439_ = Class335.anIntArray4165[i];
		for (int i_440_ = 0; (anInt5672 ^ 0xffffffff) < (i_440_ ^ 0xffffffff); i_440_++) {
			int i_441_ = anIntArray5595[i_440_] * i_439_ + anIntArray5637[i_440_] * i_438_ >> 14;
			anIntArray5637[i_440_] = -(i_438_ * anIntArray5595[i_440_]) + i_439_ * anIntArray5637[i_440_] >> 14;
			anIntArray5595[i_440_] = i_441_;
		}
		for (int i_442_ = 0; (anInt5665 ^ 0xffffffff) < (i_442_ ^ 0xffffffff); i_442_++) {
			int i_443_ = aShortArray5685[i_442_] * i_438_ + i_439_ * aShortArray5635[i_442_] >> 14;
			aShortArray5685[i_442_] = (short) (i_439_ * aShortArray5685[i_442_] + -(aShortArray5635[i_442_] * i_438_) >> 14);
			aShortArray5635[i_442_] = (short) i_443_;
		}
		if (aClass69_5649 == null && aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
		if (aClass69_5649 != null) {
			aClass69_5649.anInterface9_939 = null;
		}
		aBoolean5698 = false;
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
	}
	
	final void method626(int i, int i_444_, int i_445_, int i_446_) {
		anInt5647++;
		for (int i_447_ = 0; (i_447_ ^ 0xffffffff) > (anInt5709 ^ 0xffffffff); i_447_++) {
			int i_448_ = aShortArray5693[i_447_] & 0xffff;
			int i_449_ = i_448_ >> 10 & 0x3f;
			int i_450_ = (i_448_ & 0x3bf) >> 7;
			if ((i ^ 0xffffffff) != 0) {
				i_449_ += (i + -i_449_) * i_446_ >> 7;
			}
			int i_451_ = i_448_ & 0x7f;
			if (i_444_ != -1) {
				i_450_ = ((i_444_ + -i_450_) * i_446_ >> 7) + i_450_;
			}
			if (i_445_ != -1) {
				i_451_ = (i_446_ * (i_445_ + -i_451_) >> 7) + i_451_;
			}
			aShortArray5693[i_447_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_449_ << 10, i_450_ << 7), i_451_);
		}
		if (aClass72Array5627 != null) {
			for (int i_452_ = 0; anInt5659 > i_452_; i_452_++) {
				Class72 class72 = aClass72Array5627[i_452_];
				Class190 class190 = aClass190Array5674[i_452_];
				class190.anInt2335 = class190.anInt2335 & ~0xffffff | 0xffffff & Class85.anIntArray1158[aShortArray5693[class72.anInt975] & 0xffff];
			}
		}
		if (aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
	}
	
	private final void method649(boolean bool, byte b) {
		anInt5655++;
		boolean bool_453_ = aClass69_5604 != null && aClass69_5604.anInterface9_939 == null;
		boolean bool_454_ = aClass69_5649 != null && aClass69_5649.anInterface9_939 == null;
		boolean bool_455_ = aClass69_5654 != null && aClass69_5654.anInterface9_939 == null;
		boolean bool_456_ = aClass69_5689 != null && aClass69_5689.anInterface9_939 == null;
		if (bool) {
			bool_454_ = bool_454_ & (0x4 & aByte5651 ^ 0xffffffff) != -1;
			bool_455_ = bool_455_ & (aByte5651 & 0x1) != 0;
			bool_453_ = bool_453_ & (0x2 & aByte5651) != 0;
			bool_456_ = bool_456_ & (0x8 & aByte5651) != 0;
		}
		byte b_457_ = 0;
		byte b_458_ = 0;
		byte b_459_ = 0;
		byte b_460_ = 0;
		byte b_461_ = 0;
		if (bool_455_) {
			b_458_ = b_457_;
			b_457_ += 12;
		}
		if (bool_453_) {
			b_459_ = b_457_;
			b_457_ += 4;
		}
		if (bool_454_) {
			b_460_ = b_457_;
			b_457_ += 12;
		}
		if (bool_456_) {
			b_461_ = b_457_;
			b_457_ += 8;
		}
		if (b_457_ != 0) {
			if (aGLToolkit5692.aFloatBuffer6661.buffer.length >= b_457_ * anInt5665) {
				aGLToolkit5692.aFloatBuffer6661.offset = 0;
			} else {
				aGLToolkit5692.aFloatBuffer6661 = new FloatBuffer(b_457_ * (anInt5665 + 100));
			}
			FloatBuffer floatbuffer = aGLToolkit5692.aFloatBuffer6661;
			if (bool_455_) {
				if (!aGLToolkit5692.aBoolean6736) {
					for (int i = 0; (anInt5672 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						int i_462_ = Stream.floatToRawIntBits((float) anIntArray5595[i]);
						int i_463_ = Stream.floatToRawIntBits((float) anIntArray5588[i]);
						int i_464_ = Stream.floatToRawIntBits((float) anIntArray5637[i]);
						int i_465_ = anIntArray5633[i];
						int i_466_ = anIntArray5633[1 + i];
						for (int i_467_ = i_465_; i_467_ < i_466_; i_467_++) {
							int i_468_ = -1 + aShortArray5679[i_467_];
							if (i_468_ == -1) {
								break;
							}
							floatbuffer.offset = i_468_ * b_457_;
							floatbuffer.method2237(0, i_462_);
							floatbuffer.method2237(0, i_463_);
							floatbuffer.method2237(b + -41, i_464_);
						}
					}
				} else {
					for (int i = 0; (anInt5672 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						int i_469_ = Stream.floatToRawIntBits((float) anIntArray5595[i]);
						int i_470_ = Stream.floatToRawIntBits((float) anIntArray5588[i]);
						int i_471_ = Stream.floatToRawIntBits((float) anIntArray5637[i]);
						int i_472_ = anIntArray5633[i];
						int i_473_ = anIntArray5633[i + 1];
						for (int i_474_ = i_472_; (i_473_ ^ 0xffffffff) < (i_474_ ^ 0xffffffff); i_474_++) {
							int i_475_ = aShortArray5679[i_474_] - 1;
							if ((i_475_ ^ 0xffffffff) == 0) {
								break;
							}
							floatbuffer.offset = b_457_ * i_475_;
							floatbuffer.writeInt(i_469_);
							floatbuffer.writeInt(i_470_);
							floatbuffer.writeInt(i_471_);
						}
					}
				}
			}
			if (bool_453_) {
				if (aClass69_5649 == null) {
					byte[] bs;
					short[] ses;
					short[] ses_476_;
					short[] ses_477_;
					if (aClass319_5592 != null) {
						ses_477_ = aClass319_5592.aShortArray4061;
						ses_476_ = aClass319_5592.aShortArray4062;
						ses = aClass319_5592.aShortArray4056;
						bs = aClass319_5592.aByteArray4059;
					} else {
						bs = aByteArray5640;
						ses = aShortArray5685;
						ses_476_ = aShortArray5691;
						ses_477_ = aShortArray5635;
					}
					float f = aGLToolkit5692.aFloatArray6664[0];
					float f_478_ = aGLToolkit5692.aFloatArray6664[1];
					float f_479_ = aGLToolkit5692.aFloatArray6664[2];
					float f_480_ = aGLToolkit5692.aFloat6737;
					float f_481_ = aGLToolkit5692.aFloat6645 * 768.0F / (float) aShort5664;
					float f_482_ = aGLToolkit5692.aFloat6648 * 768.0F / (float) aShort5664;
					for (int i = 0; i < anInt5709; i++) {
						int i_483_ = method643(false, aByteArray5658[i], aShortArray5693[i], aShort5608, aShortArray5699[i]);
						int i_484_ = aShortArray5622[i];
						float f_485_ = (float) ((0xff8c9e & i_483_) >> 16) * aGLToolkit5692.aFloat6707;
						float f_486_ = (float) (0xff & i_483_ >> 8) * aGLToolkit5692.aFloat6672;
						float f_487_ = (float) (i_483_ >>> 24) * aGLToolkit5692.aFloat6734;
						short s = (short) bs[i_484_];
						float f_488_;
						if ((s ^ 0xffffffff) == -1) {
							f_488_ = (f_479_ * (float) ses[i_484_] + (f * (float) ses_477_[i_484_] + f_478_ * (float) ses_476_[i_484_])) * 0.0026041667F;
						} else {
							f_488_ = (f_479_ * (float) ses[i_484_] + (f_478_ * (float) ses_476_[i_484_] + (float) ses_477_[i_484_] * f)) / (float) (256 * s);
						}
						float f_489_ = (!(f_488_ < 0.0F) ? f_481_ : f_482_) * f_488_ + f_480_;
						int i_490_ = (int) (f_489_ * f_487_);
						if (i_490_ >= 0) {
							if ((i_490_ ^ 0xffffffff) < -256) {
								i_490_ = 255;
							}
						} else {
							i_490_ = 0;
						}
						int i_491_ = (int) (f_485_ * f_489_);
						if ((i_491_ ^ 0xffffffff) > -1) {
							i_491_ = 0;
						} else if (i_491_ > 255) {
							i_491_ = 255;
						}
						int i_492_ = (int) (f_489_ * f_486_);
						if ((i_492_ ^ 0xffffffff) > -1) {
							i_492_ = 0;
						} else if ((i_492_ ^ 0xffffffff) < -256) {
							i_492_ = 255;
						}
						floatbuffer.offset = b_459_ + i_484_ * b_457_;
						floatbuffer.writeByte(i_490_);
						floatbuffer.writeByte(i_491_);
						floatbuffer.writeByte(i_492_);
						floatbuffer.writeByte(-(aByteArray5658[i] & 0xff) + 255);
						i_484_ = aShortArray5683[i];
						s = (short) bs[i_484_];
						if ((s ^ 0xffffffff) == -1) {
							f_488_ = 0.0026041667F * (f_479_ * (float) ses[i_484_] + ((float) ses_476_[i_484_] * f_478_ + (float) ses_477_[i_484_] * f));
						} else {
							f_488_ = (f * (float) ses_477_[i_484_] + (float) ses_476_[i_484_] * f_478_ + f_479_ * (float) ses[i_484_]) / (float) (s * 256);
						}
						f_489_ = f_480_ + (f_488_ < 0.0F ? f_482_ : f_481_) * f_488_;
						i_490_ = (int) (f_489_ * f_487_);
						if (i_490_ < 0) {
							i_490_ = 0;
						} else if (i_490_ > 255) {
							i_490_ = 255;
						}
						i_491_ = (int) (f_489_ * f_485_);
						i_492_ = (int) (f_489_ * f_486_);
						if (i_491_ < 0) {
							i_491_ = 0;
						} else if ((i_491_ ^ 0xffffffff) < -256) {
							i_491_ = 255;
						}
						floatbuffer.offset = i_484_ * b_457_ + b_459_;
						if ((i_492_ ^ 0xffffffff) <= -1) {
							if ((i_492_ ^ 0xffffffff) < -256) {
								i_492_ = 255;
							}
						} else {
							i_492_ = 0;
						}
						floatbuffer.writeByte(i_490_);
						floatbuffer.writeByte(i_491_);
						floatbuffer.writeByte(i_492_);
						floatbuffer.writeByte(255 + -(0xff & aByteArray5658[i]));
						i_484_ = aShortArray5706[i];
						s = (short) bs[i_484_];
						if (s != 0) {
							f_488_ = ((float) ses_477_[i_484_] * f + f_478_ * (float) ses_476_[i_484_] + f_479_ * (float) ses[i_484_]) / (float) (s * 256);
						} else {
							f_488_ = 0.0026041667F * (f_479_ * (float) ses[i_484_] + ((float) ses_477_[i_484_] * f + f_478_ * (float) ses_476_[i_484_]));
						}
						f_489_ = f_480_ + (f_488_ < 0.0F ? f_482_ : f_481_) * f_488_;
						i_490_ = (int) (f_489_ * f_487_);
						if ((i_490_ ^ 0xffffffff) > -1) {
							i_490_ = 0;
						} else if (i_490_ > 255) {
							i_490_ = 255;
						}
						i_491_ = (int) (f_489_ * f_485_);
						if (i_491_ < 0) {
							i_491_ = 0;
						} else if (i_491_ > 255) {
							i_491_ = 255;
						}
						i_492_ = (int) (f_486_ * f_489_);
						floatbuffer.offset = b_457_ * i_484_ + b_459_;
						if (i_492_ < 0) {
							i_492_ = 0;
						} else if (i_492_ > 255) {
							i_492_ = 255;
						}
						floatbuffer.writeByte(i_490_);
						floatbuffer.writeByte(i_491_);
						floatbuffer.writeByte(i_492_);
						floatbuffer.writeByte(-(aByteArray5658[i] & 0xff) + 255);
					}
				} else {
					for (int i = 0; i < anInt5709; i++) {
						int i_493_ = method643(false, aByteArray5658[i], aShortArray5693[i], aShort5608, aShortArray5699[i]);
						floatbuffer.offset = b_457_ * aShortArray5622[i] + b_459_;
						floatbuffer.writeInt(i_493_);
						floatbuffer.offset = b_457_ * aShortArray5683[i] + b_459_;
						floatbuffer.writeInt(i_493_);
						floatbuffer.offset = aShortArray5706[i] * b_457_ + b_459_;
						floatbuffer.writeInt(i_493_);
					}
				}
			}
			if (bool_454_) {
				short[] ses;
				short[] ses_494_;
				short[] ses_495_;
				byte[] bs;
				if (aClass319_5592 != null) {
					bs = aClass319_5592.aByteArray4059;
					ses = aClass319_5592.aShortArray4062;
					ses_495_ = aClass319_5592.aShortArray4056;
					ses_494_ = aClass319_5592.aShortArray4061;
				} else {
					ses = aShortArray5691;
					ses_494_ = aShortArray5635;
					ses_495_ = aShortArray5685;
					bs = aByteArray5640;
				}
				float f = 3.0F / (float) aShort5664;
				floatbuffer.offset = b_460_;
				float f_496_ = 3.0F / (float) (aShort5664 / 2 + aShort5664);
				if (aGLToolkit5692.aBoolean6736) {
					for (int i = 0; (anInt5665 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						int i_497_ = bs[i] & 0xff;
						if (i_497_ == 0) {
							floatbuffer.method2251(8, (float) ses_494_[i] * f_496_);
							floatbuffer.method2251(8, f_496_ * (float) ses[i]);
							floatbuffer.method2251(b + -33, f_496_ * (float) ses_495_[i]);
						} else {
							float f_498_ = f / (float) i_497_;
							floatbuffer.method2251(8, f_498_ * (float) ses_494_[i]);
							floatbuffer.method2251(8, f_498_ * (float) ses[i]);
							floatbuffer.method2251(8, (float) ses_495_[i] * f_498_);
						}
						floatbuffer.offset += b_457_ - 12;
					}
				} else {
					for (int i = 0; (anInt5665 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						int i_499_ = bs[i] & 0xff;
						if ((i_499_ ^ 0xffffffff) != -1) {
							float f_500_ = f / (float) i_499_;
							floatbuffer.method2252(-229385392, f_500_ * (float) ses_494_[i]);
							floatbuffer.method2252(-229385392, f_500_ * (float) ses[i]);
							floatbuffer.method2252(-229385392, f_500_ * (float) ses_495_[i]);
						} else {
							floatbuffer.method2252(-229385392, f_496_ * (float) ses_494_[i]);
							floatbuffer.method2252(-229385392, f_496_ * (float) ses[i]);
							floatbuffer.method2252(-229385392, f_496_ * (float) ses_495_[i]);
						}
						floatbuffer.offset += -12 + b_457_;
					}
				}
			}
			if (bool_456_) {
				floatbuffer.offset = b_461_;
				if (!aGLToolkit5692.aBoolean6736) {
					for (int i = 0; anInt5665 > i; i++) {
						floatbuffer.method2252(b + -229385433, aFloatArray5609[i]);
						floatbuffer.method2252(-229385392, aFloatArray5650[i]);
						floatbuffer.offset += b_457_ - 8;
					}
				} else {
					for (int i = 0; (i ^ 0xffffffff) > (anInt5665 ^ 0xffffffff); i++) {
						floatbuffer.method2251(b + -33, aFloatArray5609[i]);
						floatbuffer.method2251(b + -33, aFloatArray5650[i]);
						floatbuffer.offset += -8 + b_457_;
					}
				}
			}
			floatbuffer.offset = anInt5665 * b_457_;
			Interface9 interface9;
			if (bool) {
				if (anInterface9_5696 == null) {
					anInterface9_5696 = aGLToolkit5692.method1467(true, floatbuffer.offset, floatbuffer.buffer, b_457_, b + -87);
				} else {
					anInterface9_5696.method22(floatbuffer.buffer, floatbuffer.offset, b_457_, (byte) 74);
				}
				interface9 = anInterface9_5696;
				aByte5651 = (byte) 0;
			} else {
				interface9 = aGLToolkit5692.method1467(false, floatbuffer.offset, floatbuffer.buffer, b_457_, -119);
				aBoolean5611 = true;
			}
			if (b != 41) {
				method622(null, null, 35, -38);
			}
			if (bool_455_) {
				aClass69_5654.anInterface9_939 = interface9;
				aClass69_5654.aByte937 = b_458_;
			}
			if (bool_456_) {
				aClass69_5689.aByte937 = b_461_;
				aClass69_5689.anInterface9_939 = interface9;
			}
			if (bool_453_) {
				aClass69_5604.aByte937 = b_459_;
				aClass69_5604.anInterface9_939 = interface9;
			}
			if (bool_454_) {
				aClass69_5649.aByte937 = b_460_;
				aClass69_5649.anInterface9_939 = interface9;
			}
		}
	}
	
	final Class300[] method620() {
		anInt5630++;
		return aClass300Array5681;
	}
	
	final void method636(byte b, byte[] bs) {
		if (bs != null) {
			for (int i = 0; anInt5709 > i; i++) {
				int i_501_ = 255 + -((255 + -(0xff & b)) * (-(0xff & bs[i]) + 255) / 255);
				aByteArray5658[i] = (byte) i_501_;
			}
		} else {
			for (int i = 0; i < anInt5709; i++)
				aByteArray5658[i] = b;
		}
		anInt5587++;
		if (aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
	}
	
	private final DrawableModel method650(GLDrawableModel gldrawablemodel_502_, int i, boolean bool, boolean bool_503_, int i_504_, GLDrawableModel gldrawablemodel_505_) {
		gldrawablemodel_505_.anInt5639 = i_504_;
		gldrawablemodel_505_.anInt5665 = anInt5665;
		gldrawablemodel_505_.anInt5616 = anInt5616;
		gldrawablemodel_505_.aShort5608 = aShort5608;
		gldrawablemodel_505_.anInt5653 = anInt5653;
		if (i != 255) {
			na();
		}
		gldrawablemodel_505_.anInt5709 = anInt5709;
		gldrawablemodel_505_.aShort5664 = aShort5664;
		gldrawablemodel_505_.anInt5659 = anInt5659;
		gldrawablemodel_505_.anInt5672 = anInt5672;
		gldrawablemodel_505_.aByte5651 = (byte) 0;
		anInt5617++;
		gldrawablemodel_505_.anInt5644 = anInt5644;
		gldrawablemodel_505_.aBoolean5670 = aBoolean5670;
		if ((i_504_ & 0x100 ^ 0xffffffff) != -1) {
			gldrawablemodel_505_.aBoolean5599 = true;
		} else {
			gldrawablemodel_505_.aBoolean5599 = aBoolean5599;
		}
		boolean bool_506_ = Class349.method3988((byte) 72, anInt5653, i_504_);
		boolean bool_507_ = Node_Sub38_Sub4.method2797(i + -255, anInt5653, i_504_);
		boolean bool_508_ = Class179.method1816(i_504_, -1, anInt5653);
		boolean bool_509_ = bool_508_ | (bool_507_ | bool_506_);
		if (!bool_509_) {
			gldrawablemodel_505_.anIntArray5595 = anIntArray5595;
			gldrawablemodel_505_.anIntArray5588 = anIntArray5588;
			gldrawablemodel_505_.anIntArray5637 = anIntArray5637;
		} else {
			if (bool_506_) {
				if (gldrawablemodel_502_.anIntArray5595 != null && (gldrawablemodel_502_.anIntArray5595.length ^ 0xffffffff) <= (anInt5644 ^ 0xffffffff)) {
					gldrawablemodel_505_.anIntArray5595 = gldrawablemodel_502_.anIntArray5595;
				} else {
					gldrawablemodel_505_.anIntArray5595 = gldrawablemodel_502_.anIntArray5595 = new int[anInt5644];
				}
			} else {
				gldrawablemodel_505_.anIntArray5595 = anIntArray5595;
			}
			if (!bool_507_) {
				gldrawablemodel_505_.anIntArray5588 = anIntArray5588;
			} else if (gldrawablemodel_502_.anIntArray5588 == null || (anInt5644 ^ 0xffffffff) < (gldrawablemodel_502_.anIntArray5588.length ^ 0xffffffff)) {
				gldrawablemodel_505_.anIntArray5588 = gldrawablemodel_502_.anIntArray5588 = new int[anInt5644];
			} else {
				gldrawablemodel_505_.anIntArray5588 = gldrawablemodel_502_.anIntArray5588;
			}
			if (!bool_508_) {
				gldrawablemodel_505_.anIntArray5637 = anIntArray5637;
			} else if (gldrawablemodel_502_.anIntArray5637 == null || gldrawablemodel_502_.anIntArray5637.length < anInt5644) {
				gldrawablemodel_505_.anIntArray5637 = gldrawablemodel_502_.anIntArray5637 = new int[anInt5644];
			} else {
				gldrawablemodel_505_.anIntArray5637 = gldrawablemodel_502_.anIntArray5637;
			}
			for (int i_510_ = 0; i_510_ < anInt5644; i_510_++) {
				if (bool_506_) {
					gldrawablemodel_505_.anIntArray5595[i_510_] = anIntArray5595[i_510_];
				}
				if (bool_507_) {
					gldrawablemodel_505_.anIntArray5588[i_510_] = anIntArray5588[i_510_];
				}
				if (bool_508_) {
					gldrawablemodel_505_.anIntArray5637[i_510_] = anIntArray5637[i_510_];
				}
			}
		}
		if (!OutcommingPacket.method3669(i_504_, (byte) 111, anInt5653)) {
			if (!Animable_Sub4_Sub1.method931(i_504_, true, anInt5653)) {
				gldrawablemodel_505_.aClass69_5654 = null;
			} else {
				gldrawablemodel_505_.aClass69_5654 = aClass69_5654;
			}
		} else {
			gldrawablemodel_505_.aClass69_5654 = gldrawablemodel_502_.aClass69_5654;
			if (bool) {
				gldrawablemodel_505_.aByte5651 |= 0x1;
			}
			gldrawablemodel_505_.aClass69_5654.anInterface9_939 = aClass69_5654.anInterface9_939;
			gldrawablemodel_505_.aClass69_5654.aByte937 = aClass69_5654.aByte937;
		}
		if (!CacheNode_Sub3.method2296(anInt5653, (byte) 98, i_504_)) {
			gldrawablemodel_505_.aShortArray5693 = aShortArray5693;
		} else {
			if (gldrawablemodel_502_.aShortArray5693 == null || anInt5709 > gldrawablemodel_502_.aShortArray5693.length) {
				gldrawablemodel_505_.aShortArray5693 = gldrawablemodel_502_.aShortArray5693 = new short[anInt5709];
			} else {
				gldrawablemodel_505_.aShortArray5693 = gldrawablemodel_502_.aShortArray5693;
			}
			for (int i_511_ = 0; i_511_ < anInt5709; i_511_++)
				gldrawablemodel_505_.aShortArray5693[i_511_] = aShortArray5693[i_511_];
		}
		if (Class320_Sub7.method3711((byte) 46, i_504_, anInt5653)) {
			if (gldrawablemodel_502_.aByteArray5658 == null || (gldrawablemodel_502_.aByteArray5658.length ^ 0xffffffff) > (anInt5709 ^ 0xffffffff)) {
				gldrawablemodel_505_.aByteArray5658 = gldrawablemodel_502_.aByteArray5658 = new byte[anInt5709];
			} else {
				gldrawablemodel_505_.aByteArray5658 = gldrawablemodel_502_.aByteArray5658;
			}
			for (int i_512_ = 0; (anInt5709 ^ 0xffffffff) < (i_512_ ^ 0xffffffff); i_512_++)
				gldrawablemodel_505_.aByteArray5658[i_512_] = aByteArray5658[i_512_];
		} else {
			gldrawablemodel_505_.aByteArray5658 = aByteArray5658;
		}
		if (!Class110.method1135(i_504_, anInt5653, false)) {
			if (!Class320_Sub4.method3693(30, i_504_, anInt5653)) {
				gldrawablemodel_505_.aClass69_5604 = null;
			} else {
				gldrawablemodel_505_.aClass69_5604 = aClass69_5604;
			}
		} else {
			gldrawablemodel_505_.aClass69_5604 = gldrawablemodel_502_.aClass69_5604;
			if (bool) {
				gldrawablemodel_505_.aByte5651 |= 0x2;
			}
			gldrawablemodel_505_.aClass69_5604.anInterface9_939 = aClass69_5604.anInterface9_939;
			gldrawablemodel_505_.aClass69_5604.aByte937 = aClass69_5604.aByte937;
		}
		if (!Class73.method749((byte) -65, i_504_, anInt5653)) {
			gldrawablemodel_505_.aShortArray5691 = aShortArray5691;
			gldrawablemodel_505_.aClass319_5592 = aClass319_5592;
			gldrawablemodel_505_.aByteArray5640 = aByteArray5640;
			gldrawablemodel_505_.aShortArray5635 = aShortArray5635;
			gldrawablemodel_505_.aShortArray5685 = aShortArray5685;
		} else {
			if (gldrawablemodel_502_.aShortArray5635 != null && (anInt5665 ^ 0xffffffff) >= (gldrawablemodel_502_.aShortArray5635.length ^ 0xffffffff)) {
				gldrawablemodel_505_.aShortArray5691 = gldrawablemodel_502_.aShortArray5691;
				gldrawablemodel_505_.aShortArray5685 = gldrawablemodel_502_.aShortArray5685;
				gldrawablemodel_505_.aShortArray5635 = gldrawablemodel_502_.aShortArray5635;
			} else {
				int i_513_ = anInt5665;
				gldrawablemodel_505_.aShortArray5635 = gldrawablemodel_502_.aShortArray5635 = new short[i_513_];
				gldrawablemodel_505_.aShortArray5691 = gldrawablemodel_502_.aShortArray5691 = new short[i_513_];
				gldrawablemodel_505_.aShortArray5685 = gldrawablemodel_502_.aShortArray5685 = new short[i_513_];
			}
			if (aClass319_5592 != null) {
				if (gldrawablemodel_502_.aClass319_5592 == null) {
					gldrawablemodel_502_.aClass319_5592 = new Class319();
				}
				Class319 class319 = gldrawablemodel_505_.aClass319_5592 = gldrawablemodel_502_.aClass319_5592;
				if (class319.aShortArray4061 == null || (anInt5665 ^ 0xffffffff) < (class319.aShortArray4061.length ^ 0xffffffff)) {
					int i_514_ = anInt5665;
					class319.aShortArray4056 = new short[i_514_];
					class319.aShortArray4061 = new short[i_514_];
					class319.aShortArray4062 = new short[i_514_];
					class319.aByteArray4059 = new byte[i_514_];
				}
				for (int i_515_ = 0; (anInt5665 ^ 0xffffffff) < (i_515_ ^ 0xffffffff); i_515_++) {
					gldrawablemodel_505_.aShortArray5635[i_515_] = aShortArray5635[i_515_];
					gldrawablemodel_505_.aShortArray5691[i_515_] = aShortArray5691[i_515_];
					gldrawablemodel_505_.aShortArray5685[i_515_] = aShortArray5685[i_515_];
					class319.aShortArray4061[i_515_] = aClass319_5592.aShortArray4061[i_515_];
					class319.aShortArray4062[i_515_] = aClass319_5592.aShortArray4062[i_515_];
					class319.aShortArray4056[i_515_] = aClass319_5592.aShortArray4056[i_515_];
					class319.aByteArray4059[i_515_] = aClass319_5592.aByteArray4059[i_515_];
				}
			} else {
				for (int i_516_ = 0; anInt5665 > i_516_; i_516_++) {
					gldrawablemodel_505_.aShortArray5635[i_516_] = aShortArray5635[i_516_];
					gldrawablemodel_505_.aShortArray5691[i_516_] = aShortArray5691[i_516_];
					gldrawablemodel_505_.aShortArray5685[i_516_] = aShortArray5685[i_516_];
				}
			}
			gldrawablemodel_505_.aByteArray5640 = aByteArray5640;
		}
		if (FloatBuffer.method2248(i_504_, anInt5653, 96)) {
			gldrawablemodel_505_.aClass69_5649 = gldrawablemodel_502_.aClass69_5649;
			if (bool) {
				gldrawablemodel_505_.aByte5651 |= 0x4;
			}
			gldrawablemodel_505_.aClass69_5649.anInterface9_939 = aClass69_5649.anInterface9_939;
			gldrawablemodel_505_.aClass69_5649.aByte937 = aClass69_5649.aByte937;
		} else if (!Class147.method1649(i + -346, anInt5653, i_504_)) {
			gldrawablemodel_505_.aClass69_5649 = null;
		} else {
			gldrawablemodel_505_.aClass69_5649 = aClass69_5649;
		}
		if (Class377.method4127(anInt5653, i ^ ~0x7c03, i_504_)) {
			if (gldrawablemodel_502_.aFloatArray5609 != null && anInt5709 <= gldrawablemodel_502_.aFloatArray5609.length) {
				gldrawablemodel_505_.aFloatArray5609 = gldrawablemodel_502_.aFloatArray5609;
				gldrawablemodel_505_.aFloatArray5650 = gldrawablemodel_502_.aFloatArray5650;
			} else {
				int i_517_ = anInt5665;
				gldrawablemodel_505_.aFloatArray5609 = gldrawablemodel_502_.aFloatArray5609 = new float[i_517_];
				gldrawablemodel_505_.aFloatArray5650 = gldrawablemodel_502_.aFloatArray5650 = new float[i_517_];
			}
			for (int i_518_ = 0; (i_518_ ^ 0xffffffff) > (anInt5665 ^ 0xffffffff); i_518_++) {
				gldrawablemodel_505_.aFloatArray5609[i_518_] = aFloatArray5609[i_518_];
				gldrawablemodel_505_.aFloatArray5650[i_518_] = aFloatArray5650[i_518_];
			}
		} else {
			gldrawablemodel_505_.aFloatArray5609 = aFloatArray5609;
			gldrawablemodel_505_.aFloatArray5650 = aFloatArray5650;
		}
		if (!Class153.method1697(i + -160, anInt5653, i_504_)) {
			if (!ClanChat.method494((byte) 14, i_504_, anInt5653)) {
				gldrawablemodel_505_.aClass69_5689 = null;
			} else {
				gldrawablemodel_505_.aClass69_5689 = aClass69_5689;
			}
		} else {
			gldrawablemodel_505_.aClass69_5689 = gldrawablemodel_502_.aClass69_5689;
			if (bool) {
				gldrawablemodel_505_.aByte5651 |= 0x8;
			}
			gldrawablemodel_505_.aClass69_5689.aByte937 = aClass69_5689.aByte937;
			gldrawablemodel_505_.aClass69_5689.anInterface9_939 = aClass69_5689.anInterface9_939;
		}
		if (Class262_Sub16.method3193(anInt5653, i_504_, (byte) -61)) {
			if (gldrawablemodel_502_.aShortArray5622 == null || (anInt5709 ^ 0xffffffff) < (gldrawablemodel_502_.aShortArray5622.length ^ 0xffffffff)) {
				int i_519_ = anInt5709;
				gldrawablemodel_505_.aShortArray5683 = gldrawablemodel_502_.aShortArray5683 = new short[i_519_];
				gldrawablemodel_505_.aShortArray5706 = gldrawablemodel_502_.aShortArray5706 = new short[i_519_];
				gldrawablemodel_505_.aShortArray5622 = gldrawablemodel_502_.aShortArray5622 = new short[i_519_];
			} else {
				gldrawablemodel_505_.aShortArray5706 = gldrawablemodel_502_.aShortArray5706;
				gldrawablemodel_505_.aShortArray5683 = gldrawablemodel_502_.aShortArray5683;
				gldrawablemodel_505_.aShortArray5622 = gldrawablemodel_502_.aShortArray5622;
			}
			for (int i_520_ = 0; (i_520_ ^ 0xffffffff) > (anInt5709 ^ 0xffffffff); i_520_++) {
				gldrawablemodel_505_.aShortArray5622[i_520_] = aShortArray5622[i_520_];
				gldrawablemodel_505_.aShortArray5683[i_520_] = aShortArray5683[i_520_];
				gldrawablemodel_505_.aShortArray5706[i_520_] = aShortArray5706[i_520_];
			}
		} else {
			gldrawablemodel_505_.aShortArray5622 = aShortArray5622;
			gldrawablemodel_505_.aShortArray5706 = aShortArray5706;
			gldrawablemodel_505_.aShortArray5683 = aShortArray5683;
		}
		if (Class188_Sub1_Sub1.method1894(i_504_, (byte) -92, anInt5653)) {
			if (bool) {
				gldrawablemodel_505_.aByte5651 |= 0x10;
			}
			gldrawablemodel_505_.aClass107_5675 = gldrawablemodel_502_.aClass107_5675;
			gldrawablemodel_505_.aClass107_5675.anInterface1_1365 = aClass107_5675.anInterface1_1365;
		} else if (!Class179.method1817(-1, anInt5653, i_504_)) {
			gldrawablemodel_505_.aClass107_5675 = null;
		} else {
			gldrawablemodel_505_.aClass107_5675 = aClass107_5675;
		}
		if (!Class150_Sub3.method1663((byte) -20, i_504_, anInt5653)) {
			gldrawablemodel_505_.aShortArray5699 = aShortArray5699;
		} else {
			if (gldrawablemodel_502_.aShortArray5699 != null && gldrawablemodel_502_.aShortArray5699.length >= anInt5709) {
				gldrawablemodel_505_.aShortArray5699 = gldrawablemodel_502_.aShortArray5699;
			} else {
				int i_521_ = anInt5709;
				gldrawablemodel_505_.aShortArray5699 = gldrawablemodel_502_.aShortArray5699 = new short[i_521_];
			}
			for (int i_522_ = 0; (i_522_ ^ 0xffffffff) > (anInt5709 ^ 0xffffffff); i_522_++)
				gldrawablemodel_505_.aShortArray5699[i_522_] = aShortArray5699[i_522_];
		}
		if (!Class71.method741(anInt5653, -23003, i_504_)) {
			gldrawablemodel_505_.aClass190Array5674 = aClass190Array5674;
		} else if (gldrawablemodel_502_.aClass190Array5674 == null || anInt5659 > gldrawablemodel_502_.aClass190Array5674.length) {
			int i_523_ = anInt5659;
			gldrawablemodel_505_.aClass190Array5674 = gldrawablemodel_502_.aClass190Array5674 = new Class190[i_523_];
			for (int i_524_ = 0; (i_524_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_524_++)
				gldrawablemodel_505_.aClass190Array5674[i_524_] = aClass190Array5674[i_524_].method1941(true);
		} else {
			gldrawablemodel_505_.aClass190Array5674 = gldrawablemodel_502_.aClass190Array5674;
			for (int i_525_ = 0; (i_525_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_525_++)
				gldrawablemodel_505_.aClass190Array5674[i_525_].method1943((byte) -106, aClass190Array5674[i_525_]);
		}
		gldrawablemodel_505_.anIntArrayArray5684 = anIntArrayArray5684;
		gldrawablemodel_505_.aShortArray5629 = aShortArray5629;
		gldrawablemodel_505_.anIntArrayArray5591 = anIntArrayArray5591;
		gldrawablemodel_505_.anIntArrayArray5615 = anIntArrayArray5615;
		gldrawablemodel_505_.aClass218Array5596 = aClass218Array5596;
		gldrawablemodel_505_.anIntArray5687 = anIntArray5687;
		gldrawablemodel_505_.anIntArray5633 = anIntArray5633;
		if (aBoolean5698) {
			gldrawablemodel_505_.aShort5677 = aShort5677;
			gldrawablemodel_505_.aShort5589 = aShort5589;
			gldrawablemodel_505_.aShort5686 = aShort5686;
			gldrawablemodel_505_.aShort5610 = aShort5610;
			gldrawablemodel_505_.aBoolean5698 = true;
			gldrawablemodel_505_.aShort5671 = aShort5671;
			gldrawablemodel_505_.aShort5600 = aShort5600;
			gldrawablemodel_505_.aShort5619 = aShort5619;
			gldrawablemodel_505_.aShort5597 = aShort5597;
		} else {
			gldrawablemodel_505_.aBoolean5698 = false;
		}
		gldrawablemodel_505_.aClass300Array5681 = aClass300Array5681;
		gldrawablemodel_505_.aShortArray5618 = aShortArray5618;
		gldrawablemodel_505_.aClass72Array5627 = aClass72Array5627;
		gldrawablemodel_505_.aShortArray5679 = aShortArray5679;
		return gldrawablemodel_505_;
	}
	
	final void ia(short s, short s_526_) {
		for (int i = 0; anInt5709 > i; i++) {
			if ((s ^ 0xffffffff) == (aShortArray5693[i] ^ 0xffffffff)) {
				aShortArray5693[i] = s_526_;
			}
		}
		anInt5605++;
		if (aClass72Array5627 != null) {
			for (int i = 0; (anInt5659 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				Class72 class72 = aClass72Array5627[i];
				Class190 class190 = aClass190Array5674[i];
				class190.anInt2335 = 0xffffff & Class85.anIntArray1158[0xffff & aShortArray5693[class72.anInt975]] | ~0xffffff & class190.anInt2335;
			}
		}
		if (aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
	}
	
	final void method637(int i, int[] is, int i_527_, int i_528_, int i_529_, int i_530_, boolean bool) {
		anInt5690++;
		int i_531_ = is.length;
		if ((i ^ 0xffffffff) == -1) {
			i_528_ <<= 4;
			i_527_ <<= 4;
			i_529_ <<= 4;
			int i_532_ = 0;
			Class270_Sub2_Sub1.anInt10546 = 0;
			Class378.anInt4676 = 0;
			Class297.anInt3702 = 0;
			for (int i_533_ = 0; i_531_ > i_533_; i_533_++) {
				int i_534_ = is[i_533_];
				if (anIntArrayArray5684.length > i_534_) {
					int[] is_535_ = anIntArrayArray5684[i_534_];
					for (int i_536_ = 0; i_536_ < is_535_.length; i_536_++) {
						int i_537_ = is_535_[i_536_];
						Class378.anInt4676 += anIntArray5595[i_537_];
						Class297.anInt3702 += anIntArray5588[i_537_];
						i_532_++;
						Class270_Sub2_Sub1.anInt10546 += anIntArray5637[i_537_];
					}
				}
			}
			if ((i_532_ ^ 0xffffffff) < -1) {
				Class297.anInt3702 = i_528_ + Class297.anInt3702 / i_532_;
				Class270_Sub2_Sub1.anInt10546 = i_529_ + Class270_Sub2_Sub1.anInt10546 / i_532_;
				Class378.anInt4676 = i_527_ + Class378.anInt4676 / i_532_;
			} else {
				Class270_Sub2_Sub1.anInt10546 = i_529_;
				Class378.anInt4676 = i_527_;
				Class297.anInt3702 = i_528_;
			}
		} else if ((i ^ 0xffffffff) == -2) {
			i_529_ <<= 4;
			i_528_ <<= 4;
			i_527_ <<= 4;
			for (int i_538_ = 0; (i_538_ ^ 0xffffffff) > (i_531_ ^ 0xffffffff); i_538_++) {
				int i_539_ = is[i_538_];
				if (i_539_ < anIntArrayArray5684.length) {
					int[] is_540_ = anIntArrayArray5684[i_539_];
					for (int i_541_ = 0; i_541_ < is_540_.length; i_541_++) {
						int i_542_ = is_540_[i_541_];
						anIntArray5595[i_542_] += i_527_;
						anIntArray5588[i_542_] += i_528_;
						anIntArray5637[i_542_] += i_529_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_543_ = 0; i_543_ < i_531_; i_543_++) {
				int i_544_ = is[i_543_];
				if (i_544_ < anIntArrayArray5684.length) {
					int[] is_545_ = anIntArrayArray5684[i_544_];
					if ((i_530_ & 0x1) == 0) {
						for (int i_546_ = 0; (is_545_.length ^ 0xffffffff) < (i_546_ ^ 0xffffffff); i_546_++) {
							int i_547_ = is_545_[i_546_];
							anIntArray5595[i_547_] -= Class378.anInt4676;
							anIntArray5588[i_547_] -= Class297.anInt3702;
							anIntArray5637[i_547_] -= Class270_Sub2_Sub1.anInt10546;
							if ((i_529_ ^ 0xffffffff) != -1) {
								int i_548_ = Class335.anIntArray4167[i_529_];
								int i_549_ = Class335.anIntArray4165[i_529_];
								int i_550_ = 16383 + (anIntArray5595[i_547_] * i_549_ + anIntArray5588[i_547_] * i_548_) >> 14;
								anIntArray5588[i_547_] = 16383 + -(anIntArray5595[i_547_] * i_548_) + anIntArray5588[i_547_] * i_549_ >> 14;
								anIntArray5595[i_547_] = i_550_;
							}
							if ((i_527_ ^ 0xffffffff) != -1) {
								int i_551_ = Class335.anIntArray4167[i_527_];
								int i_552_ = Class335.anIntArray4165[i_527_];
								int i_553_ = i_552_ * anIntArray5588[i_547_] - (anIntArray5637[i_547_] * i_551_ + -16383) >> 14;
								anIntArray5637[i_547_] = 16383 + (i_551_ * anIntArray5588[i_547_] + i_552_ * anIntArray5637[i_547_]) >> 14;
								anIntArray5588[i_547_] = i_553_;
							}
							if ((i_528_ ^ 0xffffffff) != -1) {
								int i_554_ = Class335.anIntArray4167[i_528_];
								int i_555_ = Class335.anIntArray4165[i_528_];
								int i_556_ = 16383 + (i_555_ * anIntArray5595[i_547_] + i_554_ * anIntArray5637[i_547_]) >> 14;
								anIntArray5637[i_547_] = 16383 + (anIntArray5637[i_547_] * i_555_ + -(i_554_ * anIntArray5595[i_547_])) >> 14;
								anIntArray5595[i_547_] = i_556_;
							}
							anIntArray5595[i_547_] += Class378.anInt4676;
							anIntArray5588[i_547_] += Class297.anInt3702;
							anIntArray5637[i_547_] += Class270_Sub2_Sub1.anInt10546;
						}
					} else {
						for (int i_557_ = 0; (is_545_.length ^ 0xffffffff) < (i_557_ ^ 0xffffffff); i_557_++) {
							int i_558_ = is_545_[i_557_];
							anIntArray5595[i_558_] -= Class378.anInt4676;
							anIntArray5588[i_558_] -= Class297.anInt3702;
							anIntArray5637[i_558_] -= Class270_Sub2_Sub1.anInt10546;
							if ((i_527_ ^ 0xffffffff) != -1) {
								int i_559_ = Class335.anIntArray4167[i_527_];
								int i_560_ = Class335.anIntArray4165[i_527_];
								int i_561_ = -(i_559_ * anIntArray5637[i_558_]) + (anIntArray5588[i_558_] * i_560_ - -16383) >> 14;
								anIntArray5637[i_558_] = 16383 + anIntArray5637[i_558_] * i_560_ + anIntArray5588[i_558_] * i_559_ >> 14;
								anIntArray5588[i_558_] = i_561_;
							}
							if ((i_529_ ^ 0xffffffff) != -1) {
								int i_562_ = Class335.anIntArray4167[i_529_];
								int i_563_ = Class335.anIntArray4165[i_529_];
								int i_564_ = i_563_ * anIntArray5595[i_558_] + (anIntArray5588[i_558_] * i_562_ + 16383) >> 14;
								anIntArray5588[i_558_] = anIntArray5588[i_558_] * i_563_ + -(i_562_ * anIntArray5595[i_558_]) + 16383 >> 14;
								anIntArray5595[i_558_] = i_564_;
							}
							if (i_528_ != 0) {
								int i_565_ = Class335.anIntArray4167[i_528_];
								int i_566_ = Class335.anIntArray4165[i_528_];
								int i_567_ = 16383 + (anIntArray5637[i_558_] * i_565_ + i_566_ * anIntArray5595[i_558_]) >> 14;
								anIntArray5637[i_558_] = 16383 + -(i_565_ * anIntArray5595[i_558_]) + i_566_ * anIntArray5637[i_558_] >> 14;
								anIntArray5595[i_558_] = i_567_;
							}
							anIntArray5595[i_558_] += Class378.anInt4676;
							anIntArray5588[i_558_] += Class297.anInt3702;
							anIntArray5637[i_558_] += Class270_Sub2_Sub1.anInt10546;
						}
					}
				}
			}
			if (bool) {
				for (int i_568_ = 0; i_568_ < i_531_; i_568_++) {
					int i_569_ = is[i_568_];
					if (anIntArrayArray5684.length > i_569_) {
						int[] is_570_ = anIntArrayArray5684[i_569_];
						for (int i_571_ = 0; is_570_.length > i_571_; i_571_++) {
							int i_572_ = is_570_[i_571_];
							int i_573_ = anIntArray5633[i_572_];
							int i_574_ = anIntArray5633[1 + i_572_];
							for (int i_575_ = i_573_; (i_574_ ^ 0xffffffff) < (i_575_ ^ 0xffffffff); i_575_++) {
								int i_576_ = -1 + aShortArray5679[i_575_];
								if ((i_576_ ^ 0xffffffff) == 0) {
									break;
								}
								if ((i_529_ ^ 0xffffffff) != -1) {
									int i_577_ = Class335.anIntArray4167[i_529_];
									int i_578_ = Class335.anIntArray4165[i_529_];
									int i_579_ = i_577_ * aShortArray5691[i_576_] - (-(aShortArray5635[i_576_] * i_578_) - 16383) >> 14;
									aShortArray5691[i_576_] = (short) (-(aShortArray5635[i_576_] * i_577_) + (aShortArray5691[i_576_] * i_578_ + 16383) >> 14);
									aShortArray5635[i_576_] = (short) i_579_;
								}
								if ((i_527_ ^ 0xffffffff) != -1) {
									int i_580_ = Class335.anIntArray4167[i_527_];
									int i_581_ = Class335.anIntArray4165[i_527_];
									int i_582_ = 16383 + (i_581_ * aShortArray5691[i_576_] + -(i_580_ * aShortArray5685[i_576_])) >> 14;
									aShortArray5685[i_576_] = (short) (16383 + (aShortArray5685[i_576_] * i_581_ + aShortArray5691[i_576_] * i_580_) >> 14);
									aShortArray5691[i_576_] = (short) i_582_;
								}
								if ((i_528_ ^ 0xffffffff) != -1) {
									int i_583_ = Class335.anIntArray4167[i_528_];
									int i_584_ = Class335.anIntArray4165[i_528_];
									int i_585_ = 16383 + i_584_ * aShortArray5635[i_576_] + aShortArray5685[i_576_] * i_583_ >> 14;
									aShortArray5685[i_576_] = (short) (16383 + (aShortArray5685[i_576_] * i_584_ + -(i_583_ * aShortArray5635[i_576_])) >> 14);
									aShortArray5635[i_576_] = (short) i_585_;
								}
							}
						}
					}
				}
				if (aClass69_5649 == null && aClass69_5604 != null) {
					aClass69_5604.anInterface9_939 = null;
				}
				if (aClass69_5649 != null) {
					aClass69_5649.anInterface9_939 = null;
				}
			}
		} else if ((i ^ 0xffffffff) == -4) {
			for (int i_586_ = 0; i_586_ < i_531_; i_586_++) {
				int i_587_ = is[i_586_];
				if ((anIntArrayArray5684.length ^ 0xffffffff) < (i_587_ ^ 0xffffffff)) {
					int[] is_588_ = anIntArrayArray5684[i_587_];
					for (int i_589_ = 0; (is_588_.length ^ 0xffffffff) < (i_589_ ^ 0xffffffff); i_589_++) {
						int i_590_ = is_588_[i_589_];
						anIntArray5595[i_590_] -= Class378.anInt4676;
						anIntArray5588[i_590_] -= Class297.anInt3702;
						anIntArray5637[i_590_] -= Class270_Sub2_Sub1.anInt10546;
						anIntArray5595[i_590_] = anIntArray5595[i_590_] * i_527_ >> 7;
						anIntArray5588[i_590_] = i_528_ * anIntArray5588[i_590_] >> 7;
						anIntArray5637[i_590_] = anIntArray5637[i_590_] * i_529_ >> 7;
						anIntArray5595[i_590_] += Class378.anInt4676;
						anIntArray5588[i_590_] += Class297.anInt3702;
						anIntArray5637[i_590_] += Class270_Sub2_Sub1.anInt10546;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray5591 != null) {
				for (int i_591_ = 0; (i_591_ ^ 0xffffffff) > (i_531_ ^ 0xffffffff); i_591_++) {
					int i_592_ = is[i_591_];
					if (i_592_ < anIntArrayArray5591.length) {
						int[] is_593_ = anIntArrayArray5591[i_592_];
						for (int i_594_ = 0; (is_593_.length ^ 0xffffffff) < (i_594_ ^ 0xffffffff); i_594_++) {
							int i_595_ = is_593_[i_594_];
							int i_596_ = 8 * i_527_ + (0xff & aByteArray5658[i_595_]);
							if (i_596_ < 0) {
								i_596_ = 0;
							} else if (i_596_ > 255) {
								i_596_ = 255;
							}
							aByteArray5658[i_595_] = (byte) i_596_;
						}
						if ((is_593_.length ^ 0xffffffff) < -1 && aClass69_5604 != null) {
							aClass69_5604.anInterface9_939 = null;
						}
					}
				}
				if (aClass72Array5627 != null) {
					for (int i_597_ = 0; (i_597_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_597_++) {
						Class72 class72 = aClass72Array5627[i_597_];
						Class190 class190 = aClass190Array5674[i_597_];
						class190.anInt2335 = 0xffffff & class190.anInt2335 | 255 + -(0xff & aByteArray5658[class72.anInt975]) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray5591 != null) {
				for (int i_598_ = 0; i_598_ < i_531_; i_598_++) {
					int i_599_ = is[i_598_];
					if (i_599_ < anIntArrayArray5591.length) {
						int[] is_600_ = anIntArrayArray5591[i_599_];
						for (int i_601_ = 0; (is_600_.length ^ 0xffffffff) < (i_601_ ^ 0xffffffff); i_601_++) {
							int i_602_ = is_600_[i_601_];
							int i_603_ = aShortArray5693[i_602_] & 0xffff;
							int i_604_ = (0xfe45 & i_603_) >> 10;
							int i_605_ = i_603_ >> 7 & 0x7;
							i_604_ = i_527_ + i_604_ & 0x3f;
							i_605_ += i_528_ / 4;
							int i_606_ = i_603_ & 0x7f;
							i_606_ += i_529_;
							if (i_605_ < 0) {
								i_605_ = 0;
							} else if ((i_605_ ^ 0xffffffff) < -8) {
								i_605_ = 7;
							}
							if ((i_606_ ^ 0xffffffff) <= -1) {
								if ((i_606_ ^ 0xffffffff) < -128) {
									i_606_ = 127;
								}
							} else {
								i_606_ = 0;
							}
							aShortArray5693[i_602_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_604_ << 10, i_605_ << 7), i_606_);
						}
						if ((is_600_.length ^ 0xffffffff) < -1 && aClass69_5604 != null) {
							aClass69_5604.anInterface9_939 = null;
						}
					}
				}
				if (aClass72Array5627 != null) {
					for (int i_607_ = 0; (i_607_ ^ 0xffffffff) > (anInt5659 ^ 0xffffffff); i_607_++) {
						Class72 class72 = aClass72Array5627[i_607_];
						Class190 class190 = aClass190Array5674[i_607_];
						class190.anInt2335 = class190.anInt2335 & ~0xffffff | Class85.anIntArray1158[aShortArray5693[class72.anInt975] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -9) {
			if (anIntArrayArray5615 != null) {
				for (int i_608_ = 0; (i_608_ ^ 0xffffffff) > (i_531_ ^ 0xffffffff); i_608_++) {
					int i_609_ = is[i_608_];
					if (i_609_ < anIntArrayArray5615.length) {
						int[] is_610_ = anIntArrayArray5615[i_609_];
						for (int i_611_ = 0; (is_610_.length ^ 0xffffffff) < (i_611_ ^ 0xffffffff); i_611_++) {
							Class190 class190 = aClass190Array5674[is_610_[i_611_]];
							class190.anInt2329 += i_528_;
							class190.anInt2337 += i_527_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray5615 != null) {
				for (int i_612_ = 0; (i_612_ ^ 0xffffffff) > (i_531_ ^ 0xffffffff); i_612_++) {
					int i_613_ = is[i_612_];
					if ((i_613_ ^ 0xffffffff) > (anIntArrayArray5615.length ^ 0xffffffff)) {
						int[] is_614_ = anIntArrayArray5615[i_613_];
						for (int i_615_ = 0; i_615_ < is_614_.length; i_615_++) {
							Class190 class190 = aClass190Array5674[is_614_[i_615_]];
							class190.anInt2332 = class190.anInt2332 * i_528_ >> 7;
							class190.anInt2339 = i_527_ * class190.anInt2339 >> 7;
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -10 && anIntArrayArray5615 != null) {
			for (int i_616_ = 0; (i_616_ ^ 0xffffffff) > (i_531_ ^ 0xffffffff); i_616_++) {
				int i_617_ = is[i_616_];
				if ((anIntArrayArray5615.length ^ 0xffffffff) < (i_617_ ^ 0xffffffff)) {
					int[] is_618_ = anIntArrayArray5615[i_617_];
					for (int i_619_ = 0; (i_619_ ^ 0xffffffff) > (is_618_.length ^ 0xffffffff); i_619_++) {
						Class190 class190 = aClass190Array5674[is_618_[i_619_]];
						class190.anInt2333 = 0x3fff & class190.anInt2333 + i_527_;
					}
				}
			}
		}
	}
	
	final void p(int i, int i_620_, Plane plane, Plane plane_621_, int i_622_, int i_623_, int i_624_) {
		anInt5638++;
		if (!aBoolean5698) {
			method640((byte) 20);
		}
		int i_625_ = aShort5619 + i_622_;
		int i_626_ = i_622_ - -aShort5597;
		int i_627_ = aShort5589 + i_624_;
		int i_628_ = aShort5677 + i_624_;
		if (i != 1 && i != 2 && (i ^ 0xffffffff) != -4 && (i ^ 0xffffffff) != -6 || i_625_ >= 0 && plane.anInt3408 > plane.anInt3398 + i_626_ >> plane.anInt3410 && (i_627_ ^ 0xffffffff) <= -1 && i_628_ + plane.anInt3398 >> plane.anInt3410 < plane.anInt3404) {
			if ((i ^ 0xffffffff) != -5 && (i ^ 0xffffffff) != -6) {
				i_625_ >>= plane.anInt3410;
				i_626_ = i_626_ + (plane.anInt3398 + -1) >> plane.anInt3410;
				i_627_ >>= plane.anInt3410;
				i_628_ = -1 - -plane.anInt3398 + i_628_ >> plane.anInt3410;
				if (plane.method3251(i_627_, i_625_, (byte) -118) == i_623_ && i_623_ == plane.method3251(i_627_, i_626_, (byte) -118) && (plane.method3251(i_628_, i_625_, (byte) -118) ^ 0xffffffff) == (i_623_ ^ 0xffffffff) && (i_623_ ^ 0xffffffff) == (plane.method3251(i_628_, i_626_, (byte) -118) ^ 0xffffffff)) {
					return;
				}
			} else if (plane_621_ == null || (i_625_ < 0 || plane_621_.anInt3408 <= i_626_ + plane_621_.anInt3398 >> plane_621_.anInt3410 || i_627_ < 0 || (plane_621_.anInt3404 ^ 0xffffffff) >= (plane_621_.anInt3398 + i_628_ >> plane_621_.anInt3410 ^ 0xffffffff))) {
				return;
			}
			if (i != 1) {
				if (i == 2) {
					int i_629_ = aShort5600;
					if ((i_629_ ^ 0xffffffff) == -1) {
						return;
					}
					for (int i_630_ = 0; (anInt5672 ^ 0xffffffff) < (i_630_ ^ 0xffffffff); i_630_++) {
						int i_631_ = (anIntArray5588[i_630_] << 16) / i_629_;
						if (i_631_ < i_620_) {
							anIntArray5588[i_630_] = anIntArray5588[i_630_] + (-i_623_ + plane.method3260(anIntArray5637[i_630_] - -i_624_, -123, anIntArray5595[i_630_] + i_622_)) * (i_620_ - i_631_) / i_620_;
						}
					}
				} else if (i == 3) {
					int i_632_ = (0xff & i_620_) * 4;
					int i_633_ = 4 * ((i_620_ & 0xff56) >> 8);
					int i_634_ = (i_620_ >> 16 & 0xff) << 6;
					int i_635_ = i_620_ >> 24 << 6 & 0x3fc0;
					if ((-(i_632_ >> 1) + i_622_ ^ 0xffffffff) > -1 || plane.anInt3408 << plane.anInt3410 <= (i_632_ >> 1) + i_622_ + plane.anInt3398 || -(i_633_ >> 1) + i_624_ < 0 || (i_624_ - -(i_633_ >> 1) - -plane.anInt3398 ^ 0xffffffff) <= (plane.anInt3404 << plane.anInt3410 ^ 0xffffffff)) {
						return;
					}
					this.method628(i_623_, i_634_, i_622_, -7024, i_632_, i_624_, i_633_, plane, i_635_);
				} else if ((i ^ 0xffffffff) != -5) {
					if (i == 5) {
						int i_636_ = -aShort5600 + aShort5671;
						for (int i_637_ = 0; i_637_ < anInt5672; i_637_++) {
							int i_638_ = i_622_ + anIntArray5595[i_637_];
							int i_639_ = anIntArray5637[i_637_] - -i_624_;
							int i_640_ = plane.method3260(i_639_, -119, i_638_);
							int i_641_ = plane_621_.method3260(i_639_, -121, i_638_);
							int i_642_ = -i_641_ + i_640_ + -i_620_;
							anIntArray5588[i_637_] = (i_642_ * ((anIntArray5588[i_637_] << 8) / i_636_) >> 8) + (i_640_ + -i_623_);
						}
					}
				} else {
					int i_643_ = aShort5671 - aShort5600;
					for (int i_644_ = 0; anInt5672 > i_644_; i_644_++)
						anIntArray5588[i_644_] = i_643_ + anIntArray5588[i_644_] - (-plane_621_.method3260(anIntArray5637[i_644_] + i_624_, -123, i_622_ + anIntArray5595[i_644_]) - -i_623_);
				}
			} else {
				for (int i_645_ = 0; anInt5672 > i_645_; i_645_++)
					anIntArray5588[i_645_] = -i_623_ + anIntArray5588[i_645_] + plane.method3260(i_624_ + anIntArray5637[i_645_], -109, i_622_ + anIntArray5595[i_645_]);
			}
			aBoolean5698 = false;
			if (aClass69_5654 != null) {
				aClass69_5654.anInterface9_939 = null;
			}
		}
	}
	
	final void s(int i) {
		anInt5639 = i;
		anInt5667++;
		if (aClass319_5592 != null && (0x10000 & anInt5639) == 0) {
			aShortArray5691 = aClass319_5592.aShortArray4062;
			aByteArray5640 = aClass319_5592.aByteArray4059;
			aShortArray5685 = aClass319_5592.aShortArray4056;
			aShortArray5635 = aClass319_5592.aShortArray4061;
			aClass319_5592 = null;
		}
		aBoolean5611 = true;
		method641((byte) -122);
	}
	
	final boolean method621(int i, int i_646_, Class336 class336, boolean bool, int i_647_, int i_648_) {
		anInt5594++;
		return method639(class336, bool, 63, i_646_, i, i_648_, i_647_);
	}
	
	final void LA(int i) {
		aShort5664 = (short) i;
		if (aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
		anInt5657++;
		if (aClass69_5649 != null) {
			aClass69_5649.anInterface9_939 = null;
		}
	}
	
	final int ma() {
		anInt5607++;
		if (!aBoolean5698) {
			method640((byte) -108);
		}
		return aShort5610;
	}
	
	final boolean r() {
		anInt5624++;
		return aBoolean5670;
	}
	
	final void method629() {
		anInt5656++;
	}
	
	final int EA() {
		if (!aBoolean5698) {
			method640((byte) -111);
		}
		anInt5652++;
		return aShort5671;
	}
	
	private final short method651(long l, int i, float f, float f_649_, int i_650_, int i_651_, int i_652_, Model model, int i_653_, int i_654_) {
		anInt5705++;
		if (i_650_ != 13) {
			method639(null, false, 65, -89, -6, 50, -63);
		}
		int i_655_ = anIntArray5633[i_654_];
		int i_656_ = anIntArray5633[1 + i_654_];
		int i_657_ = 0;
		for (int i_658_ = i_655_; (i_656_ ^ 0xffffffff) < (i_658_ ^ 0xffffffff); i_658_++) {
			short s = aShortArray5679[i_658_];
			if (s == 0) {
				i_657_ = i_658_;
				break;
			}
			if ((l ^ 0xffffffffffffffffL) == (Class184.aLongArray2197[i_658_] ^ 0xffffffffffffffffL)) {
				return (short) (s + -1);
			}
		}
		aShortArray5679[i_657_] = (short) (1 + anInt5665);
		Class184.aLongArray2197[i_657_] = l;
		aShortArray5635[anInt5665] = (short) i;
		aShortArray5691[anInt5665] = (short) i_651_;
		aShortArray5685[anInt5665] = (short) i_653_;
		aByteArray5640[anInt5665] = (byte) i_652_;
		aFloatArray5609[anInt5665] = f;
		aFloatArray5650[anInt5665] = f_649_;
		return (short) anInt5665++;
	}
	
	final boolean F() {
		anInt5621++;
		return aBoolean5599;
	}
	
	final void FA(int i) {
		anInt5646++;
		int i_659_ = Class335.anIntArray4167[i];
		int i_660_ = Class335.anIntArray4165[i];
		for (int i_661_ = 0; (anInt5672 ^ 0xffffffff) < (i_661_ ^ 0xffffffff); i_661_++) {
			int i_662_ = anIntArray5588[i_661_] * i_660_ - i_659_ * anIntArray5637[i_661_] >> 14;
			anIntArray5637[i_661_] = i_659_ * anIntArray5588[i_661_] - -(i_660_ * anIntArray5637[i_661_]) >> 14;
			anIntArray5588[i_661_] = i_662_;
		}
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
		aBoolean5698 = false;
	}
	
	final int da() {
		anInt5613++;
		return aShort5664;
	}
	
	final void v() {
		anInt5586++;
		for (int i = 0; anInt5672 > i; i++)
			anIntArray5637[i] = -anIntArray5637[i];
		for (int i = 0; anInt5665 > i; i++)
			aShortArray5685[i] = (short) -aShortArray5685[i];
		for (int i = 0; (anInt5709 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			short s = aShortArray5622[i];
			aShortArray5622[i] = aShortArray5706[i];
			aShortArray5706[i] = s;
		}
		if (aClass69_5649 == null && aClass69_5604 != null) {
			aClass69_5604.anInterface9_939 = null;
		}
		if (aClass69_5649 != null) {
			aClass69_5649.anInterface9_939 = null;
		}
		if (aClass107_5675 != null) {
			aClass107_5675.anInterface1_1365 = null;
		}
		aBoolean5698 = false;
		if (aClass69_5654 != null) {
			aClass69_5654.anInterface9_939 = null;
		}
	}
	
	GLDrawableModel(GLToolkit gltoolkit) {
		anInt5644 = 0;
		aBoolean5599 = false;
		anInt5672 = 0;
		anInt5665 = 0;
		anInt5616 = 0;
		aBoolean5698 = false;
		anInt5709 = 0;
		aGLToolkit5692 = gltoolkit;
		aClass69_5654 = new Class69(null, 5126, 3, 0);
		aClass69_5689 = new Class69(null, 5126, 2, 0);
		aClass69_5649 = new Class69(null, 5126, 3, 0);
		aClass69_5604 = new Class69(null, 5121, 4, 0);
		aClass107_5675 = new Class107();
	}
	
	GLDrawableModel(GLToolkit gltoolkit, Model model, int i, int i_663_, int i_664_, int i_665_) {
		anInt5644 = 0;
		aBoolean5599 = false;
		anInt5672 = 0;
		anInt5665 = 0;
		anInt5616 = 0;
		aBoolean5698 = false;
		anInt5709 = 0;
		aGLToolkit5692 = gltoolkit;
		anInt5639 = i;
		anInt5653 = i_665_;
		if (Animable_Sub4_Sub1.method931(i, true, i_665_)) {
			aClass69_5654 = new Class69(null, 5126, 3, 0);
		}
		if (ClanChat.method494((byte) 14, i, i_665_)) {
			aClass69_5689 = new Class69(null, 5126, 2, 0);
		}
		if (Class147.method1649(-126, i_665_, i)) {
			aClass69_5649 = new Class69(null, 5126, 3, 0);
		}
		if (Class320_Sub4.method3693(117, i, i_665_)) {
			aClass69_5604 = new Class69(null, 5121, 4, 0);
		}
		if (Class179.method1817(-1, i_665_, i)) {
			aClass107_5675 = new Class107();
		}
		d var_d = gltoolkit.aD1543;
		int[] is = new int[model.anInt2572];
		anIntArray5633 = new int[1 + model.anInt2573];
		for (int i_666_ = 0; (model.anInt2572 ^ 0xffffffff) < (i_666_ ^ 0xffffffff); i_666_++) {
			if (model.aByteArray2594 == null || model.aByteArray2594[i_666_] != 2) {
				if (model.aShortArray2587 != null && (model.aShortArray2587[i_666_] ^ 0xffffffff) != 0) {
					Class91 class91 = var_d.method10(0xffff & model.aShortArray2587[i_666_], -8217);
					if (((0x40 & anInt5653 ^ 0xffffffff) == -1 || !class91.aBoolean1223) && class91.aBoolean1205) {
						continue;
					}
				}
				is[anInt5709++] = i_666_;
				anIntArray5633[model.aShortArray2600[i_666_]]++;
				anIntArray5633[model.aShortArray2583[i_666_]]++;
				anIntArray5633[model.aShortArray2589[i_666_]]++;
			}
		}
		anInt5616 = anInt5709;
		long[] ls = new long[anInt5709];
		boolean bool = (anInt5639 & 0x100) != 0;
		for (int i_667_ = 0; i_667_ < anInt5709; i_667_++) {
			int i_668_ = is[i_667_];
			Class91 class91 = null;
			int i_669_ = 0;
			int i_670_ = 0;
			int i_671_ = 0;
			int i_672_ = 0;
			if (model.aClass17Array2621 != null) {
				boolean bool_673_ = false;
				for (int i_674_ = 0; i_674_ < model.aClass17Array2621.length; i_674_++) {
					Class17 class17 = model.aClass17Array2621[i_674_];
					if (class17.anInt273 == i_668_) {
						Class352 class352 = Class215.method2067(0, class17.anInt279);
						if (class352.aBoolean4325) {
							bool_673_ = true;
						}
						if ((class352.anInt4330 ^ 0xffffffff) != 0) {
							Class91 class91_675_ = var_d.method10(class352.anInt4330, -8217);
							if (class91_675_.anInt1226 == 2) {
								aBoolean5599 = true;
							}
						}
					}
				}
				if (bool_673_) {
					ls[i_667_] = 9223372036854775807L;
					anInt5616--;
					continue;
				}
			}
			int i_676_ = -1;
			if (model.aShortArray2587 != null) {
				i_676_ = model.aShortArray2587[i_668_];
				if ((i_676_ ^ 0xffffffff) != 0) {
					class91 = var_d.method10(0xffff & i_676_, -8217);
					if ((0x40 & anInt5653 ^ 0xffffffff) == -1 || !class91.aBoolean1223) {
						i_671_ = class91.aByte1214;
						i_672_ = class91.aByte1213;
						if (class91.aByte1211 != 0 || class91.aByte1203 != 0) {
							aBoolean5670 = true;
						}
					} else {
						i_676_ = -1;
						class91 = null;
					}
				}
			}
			boolean bool_677_ = model.aByteArray2622 != null && model.aByteArray2622[i_668_] != 0 || class91 != null && class91.anInt1226 != 0;
			if ((bool || bool_677_) && model.aByteArray2607 != null) {
				i_669_ += model.aByteArray2607[i_668_] << 17;
			}
			if (bool_677_) {
				i_669_ += 65536;
			}
			i_669_ += (i_671_ & 0xff) << 8;
			i_670_ += i_676_ << 16 & ~0xffff;
			i_669_ += 0xff & i_672_;
			i_670_ += 0xffff & i_667_;
			ls[i_667_] = ((long) i_669_ << 32) - -(long) i_670_;
			aBoolean5599 |= bool_677_;
			GLDrawableModel gldrawablemodel_678_ = this;
			gldrawablemodel_678_.aBoolean5670 = gldrawablemodel_678_.aBoolean5670 | (class91 != null && ((class91.aByte1211 ^ 0xffffffff) != -1 || class91.aByte1203 != 0));
		}
		Node_Sub3.method2170(-28, ls, is);
		anIntArray5637 = model.anIntArray2574;
		anInt5644 = model.anInt2599;
		aShortArray5618 = model.aShortArray2582;
		anInt5672 = model.anInt2573;
		anIntArray5588 = model.anIntArray2576;
		anIntArray5595 = model.anIntArray2616;
		Class152[] class152s = new Class152[anInt5672];
		aClass300Array5681 = model.aClass300Array2590;
		aClass218Array5596 = model.aClass218Array2620;
		if (model.aClass17Array2621 != null) {
			anInt5659 = model.aClass17Array2621.length;
			aClass72Array5627 = new Class72[anInt5659];
			aClass190Array5674 = new Class190[anInt5659];
			for (int i_679_ = 0; i_679_ < anInt5659; i_679_++) {
				Class17 class17 = model.aClass17Array2621[i_679_];
				Class352 class352 = Class215.method2067(0, class17.anInt279);
				int i_680_ = -1;
				for (int i_681_ = 0; (i_681_ ^ 0xffffffff) > (anInt5709 ^ 0xffffffff); i_681_++) {
					if ((class17.anInt273 ^ 0xffffffff) == (is[i_681_] ^ 0xffffffff)) {
						i_680_ = i_681_;
						break;
					}
				}
				if (i_680_ == -1) {
					throw new RuntimeException();
				}
				int i_682_ = Class85.anIntArray1158[0xffff & model.aShortArray2580[class17.anInt273]] & 0xffffff;
				i_682_ = i_682_ | 255 - (model.aByteArray2622 != null ? model.aByteArray2622[class17.anInt273] : 0) << 24;
				aClass72Array5627[i_679_] = new Class72(i_680_, model.aShortArray2600[class17.anInt273], model.aShortArray2583[class17.anInt273], model.aShortArray2589[class17.anInt273], class352.anInt4334, class352.anInt4326, class352.anInt4330, class352.anInt4336, class352.anInt4324, class352.aBoolean4325, class352.aBoolean4335, class17.anInt278);
				aClass190Array5674[i_679_] = new Class190(i_682_);
			}
		}
		int i_683_ = anInt5709 * 3;
		aShortArray5679 = new short[i_683_];
		aShort5608 = (short) i_663_;
		if (model.aShortArray2575 != null) {
			aShortArray5629 = new short[anInt5709];
		}
		aShortArray5635 = new short[i_683_];
		aShortArray5693 = new short[anInt5709];
		aByteArray5658 = new byte[anInt5709];
		Class184.aLongArray2197 = new long[i_683_];
		aShortArray5706 = new short[anInt5709];
		aFloatArray5609 = new float[i_683_];
		aShortArray5699 = new short[anInt5709];
		aShortArray5691 = new short[i_683_];
		aShort5664 = (short) i_664_;
		aShortArray5685 = new short[i_683_];
		aShortArray5683 = new short[anInt5709];
		aShortArray5622 = new short[anInt5709];
		aFloatArray5650 = new float[i_683_];
		aByteArray5640 = new byte[i_683_];
		int i_684_ = 0;
		for (int i_685_ = 0; (model.anInt2573 ^ 0xffffffff) < (i_685_ ^ 0xffffffff); i_685_++) {
			int i_686_ = anIntArray5633[i_685_];
			anIntArray5633[i_685_] = i_684_;
			i_684_ += i_686_;
			class152s[i_685_] = new Class152();
		}
		anIntArray5633[model.anInt2573] = i_684_;
		Class345 class345 = Class34.method367(93, model, anInt5709, is);
		Class132[] class132s = new Class132[model.anInt2572];
		for (int i_687_ = 0; model.anInt2572 > i_687_; i_687_++) {
			short s = model.aShortArray2600[i_687_];
			short s_688_ = model.aShortArray2583[i_687_];
			short s_689_ = model.aShortArray2589[i_687_];
			int i_690_ = -anIntArray5595[s] + anIntArray5595[s_688_];
			int i_691_ = anIntArray5588[s_688_] - anIntArray5588[s];
			int i_692_ = -anIntArray5637[s] + anIntArray5637[s_688_];
			int i_693_ = -anIntArray5595[s] + anIntArray5595[s_689_];
			int i_694_ = -anIntArray5588[s] + anIntArray5588[s_689_];
			int i_695_ = anIntArray5637[s_689_] - anIntArray5637[s];
			int i_696_ = -(i_692_ * i_694_) + i_695_ * i_691_;
			int i_697_ = -(i_695_ * i_690_) + i_693_ * i_692_;
			int i_698_;
			for (i_698_ = -(i_691_ * i_693_) + i_690_ * i_694_; (i_696_ ^ 0xffffffff) < -8193 || (i_697_ ^ 0xffffffff) < -8193 || i_698_ > 8192 || i_696_ < -8192 || i_697_ < -8192 || (i_698_ ^ 0xffffffff) > 8191; i_698_ >>= 1) {
				i_697_ >>= 1;
				i_696_ >>= 1;
			}
			int i_699_ = (int) Math.sqrt((double) (i_697_ * i_697_ + i_696_ * i_696_ - -(i_698_ * i_698_)));
			if (i_699_ <= 0) {
				i_699_ = 1;
			}
			i_697_ = i_697_ * 256 / i_699_;
			i_698_ = 256 * i_698_ / i_699_;
			i_696_ = 256 * i_696_ / i_699_;
			byte b = model.aByteArray2594 == null ? (byte) 0 : model.aByteArray2594[i_687_];
			if (b == 0) {
				Class152 class152 = class152s[s];
				class152.anInt1937 += i_696_;
				class152.anInt1936 += i_697_;
				class152.anInt1934++;
				class152.anInt1935 += i_698_;
				class152 = class152s[s_688_];
				class152.anInt1936 += i_697_;
				class152.anInt1934++;
				class152.anInt1937 += i_696_;
				class152.anInt1935 += i_698_;
				class152 = class152s[s_689_];
				class152.anInt1937 += i_696_;
				class152.anInt1934++;
				class152.anInt1936 += i_697_;
				class152.anInt1935 += i_698_;
			} else if ((b ^ 0xffffffff) == -2) {
				Class132 class132 = class132s[i_687_] = new Class132();
				class132.anInt1679 = i_696_;
				class132.anInt1674 = i_697_;
				class132.anInt1683 = i_698_;
			}
		}
		for (int i_700_ = 0; i_700_ < anInt5709; i_700_++) {
			int i_701_ = is[i_700_];
			int i_702_ = 0xffff & model.aShortArray2580[i_701_];
			int i_703_;
			if (model.aByteArray2610 != null) {
				i_703_ = model.aByteArray2610[i_701_];
			} else {
				i_703_ = -1;
			}
			int i_704_;
			if (model.aByteArray2622 != null) {
				i_704_ = 0xff & model.aByteArray2622[i_701_];
			} else {
				i_704_ = 0;
			}
			short s = model.aShortArray2587 != null ? model.aShortArray2587[i_701_] : (short) -1;
			if ((s ^ 0xffffffff) != 0 && (anInt5653 & 0x40) != 0) {
				Class91 class91 = var_d.method10(0xffff & s, -8217);
				if (class91.aBoolean1223) {
					s = (short) -1;
				}
			}
			float f = 0.0F;
			float f_705_ = 0.0F;
			float f_706_ = 0.0F;
			float f_707_ = 0.0F;
			float f_708_ = 0.0F;
			float f_709_ = 0.0F;
			int i_710_ = 0;
			int i_711_ = 0;
			int i_712_ = 0;
			if ((s ^ 0xffffffff) != 0) {
				if ((i_703_ ^ 0xffffffff) == 0) {
					f_706_ = 1.0F;
					i_710_ = 1;
					f_709_ = 0.0F;
					f_708_ = 0.0F;
					f = 0.0F;
					f_707_ = 1.0F;
					i_711_ = 2;
					f_705_ = 1.0F;
				} else {
					i_703_ &= 0xff;
					byte b = model.aByteArray2586[i_703_];
					if (b != 0) {
						short s_713_ = model.aShortArray2600[i_701_];
						short s_714_ = model.aShortArray2583[i_701_];
						short s_715_ = model.aShortArray2589[i_701_];
						int i_716_ = class345.anIntArray4268[i_703_];
						int i_717_ = class345.anIntArray4272[i_703_];
						int i_718_ = class345.anIntArray4266[i_703_];
						float[] fs = class345.aFloatArrayArray4265[i_703_];
						byte b_719_ = model.aByteArray2585[i_703_];
						float f_720_ = (float) model.anIntArray2617[i_703_] / 256.0F;
						if (b != 1) {
							if (b != 2) {
								if (b == 3) {
									Class212.method2053(i_716_, model.anIntArray2574[s_713_], model.anIntArray2576[s_713_], Class223.aFloatArray2663, i_718_, f_720_, fs, b_719_, model.anIntArray2616[s_713_], -4, i_717_);
									f_705_ = Class223.aFloatArray2663[1];
									f = Class223.aFloatArray2663[0];
									Class212.method2053(i_716_, model.anIntArray2574[s_714_], model.anIntArray2576[s_714_], Class223.aFloatArray2663, i_718_, f_720_, fs, b_719_, model.anIntArray2616[s_714_], -4, i_717_);
									f_707_ = Class223.aFloatArray2663[1];
									f_706_ = Class223.aFloatArray2663[0];
									Class212.method2053(i_716_, model.anIntArray2574[s_715_], model.anIntArray2576[s_715_], Class223.aFloatArray2663, i_718_, f_720_, fs, b_719_, model.anIntArray2616[s_715_], -4, i_717_);
									f_709_ = Class223.aFloatArray2663[1];
									f_708_ = Class223.aFloatArray2663[0];
									if ((0x1 & b_719_) == 0) {
										if (!(f_708_ - f > 0.5F)) {
											if (-f_708_ + f > 0.5F) {
												i_711_ = 2;
												f_708_++;
											}
										} else {
											i_711_ = 1;
											f_708_--;
										}
										if (!(-f + f_706_ > 0.5F)) {
											if (-f_706_ + f > 0.5F) {
												f_706_++;
												i_710_ = 2;
											}
										} else {
											i_710_ = 1;
											f_706_--;
										}
									} else {
										if (-f_705_ + f_707_ > 0.5F) {
											f_707_--;
											i_710_ = 1;
										} else if (-f_707_ + f_705_ > 0.5F) {
											f_707_++;
											i_710_ = 2;
										}
										if (!(-f_705_ + f_709_ > 0.5F)) {
											if (f_705_ - f_709_ > 0.5F) {
												f_709_++;
												i_711_ = 2;
											}
										} else {
											f_709_--;
											i_711_ = 1;
										}
									}
								}
							} else {
								float f_721_ = (float) model.anIntArray2615[i_703_] / 256.0F;
								float f_722_ = (float) model.anIntArray2584[i_703_] / 256.0F;
								int i_723_ = model.anIntArray2616[s_714_] + -model.anIntArray2616[s_713_];
								int i_724_ = model.anIntArray2576[s_714_] - model.anIntArray2576[s_713_];
								int i_725_ = model.anIntArray2574[s_714_] - model.anIntArray2574[s_713_];
								int i_726_ = model.anIntArray2616[s_715_] + -model.anIntArray2616[s_713_];
								int i_727_ = model.anIntArray2576[s_715_] + -model.anIntArray2576[s_713_];
								int i_728_ = -model.anIntArray2574[s_713_] + model.anIntArray2574[s_715_];
								int i_729_ = -(i_725_ * i_727_) + i_724_ * i_728_;
								int i_730_ = i_726_ * i_725_ + -(i_723_ * i_728_);
								int i_731_ = i_723_ * i_727_ + -(i_724_ * i_726_);
								float f_732_ = 64.0F / (float) model.anIntArray2603[i_703_];
								float f_733_ = 64.0F / (float) model.anIntArray2588[i_703_];
								float f_734_ = 64.0F / (float) model.anIntArray2593[i_703_];
								float f_735_ = ((float) i_729_ * fs[0] + fs[1] * (float) i_730_ + fs[2] * (float) i_731_) / f_732_;
								float f_736_ = (fs[5] * (float) i_731_ + (fs[3] * (float) i_729_ + (float) i_730_ * fs[4])) / f_733_;
								float f_737_ = ((float) i_731_ * fs[8] + (fs[7] * (float) i_730_ + (float) i_729_ * fs[6])) / f_734_;
								i_712_ = Class91.method1036(2, f_737_, f_735_, f_736_);
								Class39.method407(f_720_, i_712_, model.anIntArray2616[s_713_], f_721_, i_717_, Class223.aFloatArray2663, model.anIntArray2576[s_713_], 78, model.anIntArray2574[s_713_], i_716_, i_718_, f_722_, fs, b_719_);
								f_705_ = Class223.aFloatArray2663[1];
								f = Class223.aFloatArray2663[0];
								Class39.method407(f_720_, i_712_, model.anIntArray2616[s_714_], f_721_, i_717_, Class223.aFloatArray2663, model.anIntArray2576[s_714_], 126, model.anIntArray2574[s_714_], i_716_, i_718_, f_722_, fs, b_719_);
								f_706_ = Class223.aFloatArray2663[0];
								f_707_ = Class223.aFloatArray2663[1];
								Class39.method407(f_720_, i_712_, model.anIntArray2616[s_715_], f_721_, i_717_, Class223.aFloatArray2663, model.anIntArray2576[s_715_], 83, model.anIntArray2574[s_715_], i_716_, i_718_, f_722_, fs, b_719_);
								f_708_ = Class223.aFloatArray2663[0];
								f_709_ = Class223.aFloatArray2663[1];
							}
						} else {
							float f_738_ = (float) model.anIntArray2593[i_703_] / 1024.0F;
							Class262_Sub1.method3151(fs, f_720_, i_718_, model.anIntArray2616[s_713_], b_719_, Class223.aFloatArray2663, f_738_, i_717_, -2356, model.anIntArray2576[s_713_], model.anIntArray2574[s_713_], i_716_);
							f = Class223.aFloatArray2663[0];
							f_705_ = Class223.aFloatArray2663[1];
							Class262_Sub1.method3151(fs, f_720_, i_718_, model.anIntArray2616[s_714_], b_719_, Class223.aFloatArray2663, f_738_, i_717_, -2356, model.anIntArray2576[s_714_], model.anIntArray2574[s_714_], i_716_);
							f_706_ = Class223.aFloatArray2663[0];
							f_707_ = Class223.aFloatArray2663[1];
							Class262_Sub1.method3151(fs, f_720_, i_718_, model.anIntArray2616[s_715_], b_719_, Class223.aFloatArray2663, f_738_, i_717_, -2356, model.anIntArray2576[s_715_], model.anIntArray2574[s_715_], i_716_);
							f_708_ = Class223.aFloatArray2663[0];
							f_709_ = Class223.aFloatArray2663[1];
							float f_739_ = f_738_ / 2.0F;
							if ((0x1 & b_719_) != 0) {
								if (!(f_739_ < f_709_ - f_705_)) {
									if (f_739_ < -f_709_ + f_705_) {
										i_711_ = 2;
										f_709_ += f_738_;
									}
								} else {
									i_711_ = 1;
									f_709_ -= f_738_;
								}
								if (!(f_707_ - f_705_ > f_739_)) {
									if (f_705_ - f_707_ > f_739_) {
										i_710_ = 2;
										f_707_ += f_738_;
									}
								} else {
									i_710_ = 1;
									f_707_ -= f_738_;
								}
							} else {
								if (-f + f_706_ > f_739_) {
									i_710_ = 1;
									f_706_ -= f_738_;
								} else if (f - f_706_ > f_739_) {
									i_710_ = 2;
									f_706_ += f_738_;
								}
								if (!(f_708_ - f > f_739_)) {
									if (f_739_ < f - f_708_) {
										i_711_ = 2;
										f_708_ += f_738_;
									}
								} else {
									f_708_ -= f_738_;
									i_711_ = 1;
								}
							}
						}
					} else {
						short s_740_ = model.aShortArray2600[i_701_];
						short s_741_ = model.aShortArray2583[i_701_];
						short s_742_ = model.aShortArray2589[i_701_];
						short s_743_ = model.aShortArray2613[i_703_];
						short s_744_ = model.aShortArray2577[i_703_];
						short s_745_ = model.aShortArray2604[i_703_];
						float f_746_ = (float) model.anIntArray2616[s_743_];
						float f_747_ = (float) model.anIntArray2576[s_743_];
						float f_748_ = (float) model.anIntArray2574[s_743_];
						float f_749_ = -f_746_ + (float) model.anIntArray2616[s_744_];
						float f_750_ = (float) model.anIntArray2576[s_744_] - f_747_;
						float f_751_ = -f_748_ + (float) model.anIntArray2574[s_744_];
						float f_752_ = -f_746_ + (float) model.anIntArray2616[s_745_];
						float f_753_ = -f_747_ + (float) model.anIntArray2576[s_745_];
						float f_754_ = -f_748_ + (float) model.anIntArray2574[s_745_];
						float f_755_ = -f_746_ + (float) model.anIntArray2616[s_740_];
						float f_756_ = -f_747_ + (float) model.anIntArray2576[s_740_];
						float f_757_ = (float) model.anIntArray2574[s_740_] - f_748_;
						float f_758_ = -f_746_ + (float) model.anIntArray2616[s_741_];
						float f_759_ = (float) model.anIntArray2576[s_741_] - f_747_;
						float f_760_ = -f_748_ + (float) model.anIntArray2574[s_741_];
						float f_761_ = -f_746_ + (float) model.anIntArray2616[s_742_];
						float f_762_ = -f_747_ + (float) model.anIntArray2576[s_742_];
						float f_763_ = -f_748_ + (float) model.anIntArray2574[s_742_];
						float f_764_ = f_754_ * f_750_ - f_751_ * f_753_;
						float f_765_ = f_752_ * f_751_ - f_754_ * f_749_;
						float f_766_ = -(f_750_ * f_752_) + f_749_ * f_753_;
						float f_767_ = -(f_754_ * f_765_) + f_753_ * f_766_;
						float f_768_ = -(f_766_ * f_752_) + f_754_ * f_764_;
						float f_769_ = f_765_ * f_752_ - f_753_ * f_764_;
						float f_770_ = 1.0F / (f_750_ * f_768_ + f_767_ * f_749_ + f_769_ * f_751_);
						f_708_ = (f_762_ * f_768_ + f_761_ * f_767_ + f_769_ * f_763_) * f_770_;
						f = f_770_ * (f_757_ * f_769_ + (f_768_ * f_756_ + f_767_ * f_755_));
						f_706_ = f_770_ * (f_760_ * f_769_ + (f_759_ * f_768_ + f_758_ * f_767_));
						f_767_ = -(f_765_ * f_751_) + f_766_ * f_750_;
						f_768_ = f_764_ * f_751_ - f_749_ * f_766_;
						f_769_ = f_765_ * f_749_ - f_764_ * f_750_;
						f_770_ = 1.0F / (f_754_ * f_769_ + (f_752_ * f_767_ + f_768_ * f_753_));
						f_709_ = (f_763_ * f_769_ + (f_768_ * f_762_ + f_761_ * f_767_)) * f_770_;
						f_707_ = f_770_ * (f_767_ * f_758_ + f_759_ * f_768_ + f_769_ * f_760_);
						f_705_ = (f_767_ * f_755_ + f_756_ * f_768_ + f_769_ * f_757_) * f_770_;
					}
				}
			}
			byte b;
			if (model.aByteArray2594 == null) {
				b = (byte) 0;
			} else {
				b = model.aByteArray2594[i_701_];
			}
			if ((b ^ 0xffffffff) != -1) {
				if (b == 1) {
					Class132 class132 = class132s[i_701_];
					long l = ((long) (i_702_ << 8) + ((long) (i_712_ << 24) + (long) i_704_) << 32) + (long) ((256 + class132.anInt1674 << 12) + ((i_703_ << 2) - (-((class132.anInt1679 ^ 0xffffffff) >= -1 ? 2048 : 1024) + -(256 + class132.anInt1683 << 22))));
					aShortArray5622[i_700_] = method651(l, class132.anInt1679, f, f_705_, 13, class132.anInt1674, 0, model, class132.anInt1683, model.aShortArray2600[i_701_]);
					aShortArray5683[i_700_] = method651((long) i_710_ + l, class132.anInt1679, f_706_, f_707_, 13, class132.anInt1674, 0, model, class132.anInt1683, model.aShortArray2583[i_701_]);
					aShortArray5706[i_700_] = method651(l + (long) i_711_, class132.anInt1679, f_708_, f_709_, 13, class132.anInt1674, 0, model, class132.anInt1683, model.aShortArray2589[i_701_]);
				}
			} else {
				long l = ((long) i_704_ + (long) (i_702_ << 8) + (long) (i_712_ << 24) << 32) + (long) (i_703_ << 2);
				short s_771_ = model.aShortArray2600[i_701_];
				short s_772_ = model.aShortArray2583[i_701_];
				short s_773_ = model.aShortArray2589[i_701_];
				Class152 class152 = class152s[s_771_];
				aShortArray5622[i_700_] = method651(l, class152.anInt1937, f, f_705_, 13, class152.anInt1936, class152.anInt1934, model, class152.anInt1935, s_771_);
				class152 = class152s[s_772_];
				aShortArray5683[i_700_] = method651(l + (long) i_710_, class152.anInt1937, f_706_, f_707_, 13, class152.anInt1936, class152.anInt1934, model, class152.anInt1935, s_772_);
				class152 = class152s[s_773_];
				aShortArray5706[i_700_] = method651((long) i_711_ + l, class152.anInt1937, f_708_, f_709_, 13, class152.anInt1936, class152.anInt1934, model, class152.anInt1935, s_773_);
			}
			if (model.aByteArray2622 != null) {
				aByteArray5658[i_700_] = model.aByteArray2622[i_701_];
			}
			if (model.aShortArray2575 != null) {
				aShortArray5629[i_700_] = model.aShortArray2575[i_701_];
			}
			aShortArray5693[i_700_] = model.aShortArray2580[i_701_];
			aShortArray5699[i_700_] = s;
		}
		int i_774_ = 0;
		short s = -10000;
		for (int i_775_ = 0; (i_775_ ^ 0xffffffff) > (anInt5616 ^ 0xffffffff); i_775_++) {
			short s_776_ = aShortArray5699[i_775_];
			if (s != s_776_) {
				i_774_++;
				s = s_776_;
			}
		}
		anIntArray5687 = new int[1 + i_774_];
		s = (short) -10000;
		i_774_ = 0;
		for (int i_777_ = 0; (anInt5616 ^ 0xffffffff) < (i_777_ ^ 0xffffffff); i_777_++) {
			short s_778_ = aShortArray5699[i_777_];
			if ((s ^ 0xffffffff) != (s_778_ ^ 0xffffffff)) {
				s = s_778_;
				anIntArray5687[i_774_++] = i_777_;
			}
		}
		anIntArray5687[i_774_] = anInt5616;
		Class184.aLongArray2197 = null;
		aShortArray5635 = Class189.method1916((byte) -104, anInt5665, aShortArray5635);
		aShortArray5691 = Class189.method1916((byte) -13, anInt5665, aShortArray5691);
		aShortArray5685 = Class189.method1916((byte) 112, anInt5665, aShortArray5685);
		aByteArray5640 = Class317.method3664(1, aByteArray5640, anInt5665);
		aFloatArray5609 = Node_Sub38.method2784(false, aFloatArray5609, anInt5665);
		aFloatArray5650 = Node_Sub38.method2784(false, aFloatArray5650, anInt5665);
		if (model.anIntArray2598 != null && CacheNode_Sub19.method2404(-60, i, anInt5653)) {
			anIntArrayArray5684 = model.method2083(0, false);
		}
		if (model.aClass17Array2621 != null && Node_Sub15_Sub1.method2557(anInt5653, 1024, i)) {
			anIntArrayArray5615 = model.method2088((byte) -80);
		}
		if (model.anIntArray2602 != null && Class316.method3661(i, anInt5653, (byte) 69)) {
			int i_779_ = 0;
			int[] is_780_ = new int[256];
			for (int i_781_ = 0; anInt5709 > i_781_; i_781_++) {
				int i_782_ = model.anIntArray2602[is[i_781_]];
				if (i_782_ >= 0) {
					if ((i_782_ ^ 0xffffffff) < (i_779_ ^ 0xffffffff)) {
						i_779_ = i_782_;
					}
					is_780_[i_782_]++;
				}
			}
			anIntArrayArray5591 = new int[i_779_ - -1][];
			for (int i_783_ = 0; (i_783_ ^ 0xffffffff) >= (i_779_ ^ 0xffffffff); i_783_++) {
				anIntArrayArray5591[i_783_] = new int[is_780_[i_783_]];
				is_780_[i_783_] = 0;
			}
			for (int i_784_ = 0; i_784_ < anInt5709; i_784_++) {
				int i_785_ = model.anIntArray2602[is[i_784_]];
				if (i_785_ >= 0) {
					anIntArrayArray5591[i_785_][is_780_[i_785_]++] = i_784_;
				}
			}
		}
	}
	
	static {
		aColorArray5590 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		anInt5703 = 0;
		aClass212_5708 = new Class212("", 12);
	}
}
