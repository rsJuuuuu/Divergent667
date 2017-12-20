/* PureJavaDrawableModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PureJavaDrawableModel extends DrawableModel
{
	private int anInt5711;
	private Class185 aClass185_5712;
	private int[] anIntArray5713;
	private int[] anIntArray5714;
	private boolean aBoolean5715 = false;
	private int[] anIntArray5716;
	private int[] anIntArray5717;
	private int anInt5718;
	private short[] aShortArray5719;
	private boolean aBoolean5720;
	private int[] anIntArray5721;
	private int[][] anIntArrayArray5722;
	private boolean aBoolean5723;
	static int anInt5724 = 4096;
	private int[][] anIntArrayArray5725;
	private Class374 aClass374_5726;
	private int anInt5727;
	private int[] anIntArray5728;
	private int[] anIntArray5729;
	private short aShort5730;
	private short[] aShortArray5731;
	private short aShort5732;
	private PureJavaDrawableModel[] aPureJavaDrawableModelArray5733;
	private boolean aBoolean5734;
	private Class354[] aClass354Array5735;
	private byte[] aByteArray5736;
	private int[] anIntArray5737;
	private int[] anIntArray5738;
	private int[] anIntArray5739;
	private short[] aShortArray5740;
	private Class374 aClass374_5741;
	static int anInt5742 = 4096;
	private int anInt5743;
	private int anInt5744;
	private int[] anIntArray5745;
	private int anInt5746;
	private short[] aShortArray5747;
	private int[] anIntArray5748;
	private int[] anIntArray5749;
	private PureJavaDrawableModel[] aPureJavaDrawableModelArray5750;
	private short aShort5751;
	private int anInt5752;
	private int anInt5753;
	private int[] anIntArray5754;
	private short aShort5755;
	private int[] anIntArray5756;
	private short aShort5757;
	private int[] anIntArray5758;
	private short aShort5759;
	private int[] anIntArray5760;
	private int[] anIntArray5761;
	private int anInt5762;
	private float[][] aFloatArrayArray5763;
	private Class218[] aClass218Array5764;
	private Class214[] aClass214Array5765;
	private short aShort5766;
	private short[] aShortArray5767;
	private byte[] aByteArray5768;
	private int[] anIntArray5769;
	private PureJavaToolkit aPureJavaToolkit5770;
	private int[] anIntArray5771;
	private int[] anIntArray5772;
	private short[] aShortArray5773;
	private Class354[] aClass354Array5774;
	private Class272[] aClass272Array5775;
	private float[][] aFloatArrayArray5776;
	private short aShort5777;
	private Class336_Sub2 aClass336_Sub2_5778;
	private int anInt5779;
	private static int anInt5780 = 0;
	private int[] anIntArray5781;
	private Class300[] aClass300Array5782;
	private int[][] anIntArrayArray5783;
	private byte[] aByteArray5784;
	private int[] anIntArray5785;
	private boolean aBoolean5786;
	private short[] aShortArray5787;
	private boolean aBoolean5788;
	private short[] aShortArray5789;
	private Class209[] aClass209Array5790;
	private int anInt5791;
	private boolean aBoolean5792;
	
	final void O(int i, int i_0_, int i_1_) {
		if (i != 128 && (anInt5746 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (i_0_ != 128 && (anInt5746 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (i_1_ != 128 && (anInt5746 & 0x4) != 4) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i_2_ = 0; i_2_ < anInt5718; i_2_++) {
				anIntArray5748[i_2_] = anIntArray5748[i_2_] * i >> 7;
				anIntArray5772[i_2_] = anIntArray5772[i_2_] * i_0_ >> 7;
				anIntArray5717[i_2_] = anIntArray5717[i_2_] * i_1_ >> 7;
			}
			aBoolean5792 = false;
		}
	}
	
	final int na() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5777;
	}
	
	private final void method653() {
		synchronized (this) {
			for (int i = 0; i < anInt5718; i++) {
				anIntArray5748[i] = -anIntArray5748[i];
				anIntArray5717[i] = -anIntArray5717[i];
			}
			method656();
		}
	}
	
	final void v() {
		if ((anInt5746 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i = 0; i < anInt5718; i++)
				anIntArray5717[i] = -anIntArray5717[i];
			if (aClass354Array5774 != null) {
				for (int i = 0; i < anInt5753; i++) {
					if (aClass354Array5774[i] != null) {
						aClass354Array5774[i].anInt4346 = -aClass354Array5774[i].anInt4346;
					}
				}
			}
			if (aClass354Array5735 != null) {
				for (int i = 0; i < anInt5753; i++) {
					if (aClass354Array5735[i] != null) {
						aClass354Array5735[i].anInt4346 = -aClass354Array5735[i].anInt4346;
					}
				}
			}
			if (aClass272Array5775 != null) {
				for (int i = 0; i < anInt5711; i++) {
					if (aClass272Array5775[i] != null) {
						aClass272Array5775[i].anInt3483 = -aClass272Array5775[i].anInt3483;
					}
				}
			}
			short[] ses = aShortArray5767;
			aShortArray5767 = aShortArray5789;
			aShortArray5789 = ses;
			if (aFloatArrayArray5763 != null) {
				for (int i = 0; i < anInt5711; i++) {
					if (aFloatArrayArray5763[i] != null) {
						float f = aFloatArrayArray5763[i][0];
						aFloatArrayArray5763[i][0] = aFloatArrayArray5763[i][2];
						aFloatArrayArray5763[i][2] = f;
					}
					if (aFloatArrayArray5776[i] != null) {
						float f = aFloatArrayArray5776[i][0];
						aFloatArrayArray5776[i][0] = aFloatArrayArray5776[i][2];
						aFloatArrayArray5776[i][2] = f;
					}
				}
			}
			aBoolean5792 = false;
			anInt5744 = 0;
		}
	}
	
	final int HA() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5732;
	}
	
	final void a(int i) {
		if ((anInt5746 & 0x5) != 5) {
			throw new IllegalStateException();
		}
		if (i == 4096) {
			method657();
		} else if (i == 8192) {
			method653();
		} else if (i == 12288) {
			method667();
		} else {
			int i_3_ = Class335.anIntArray4167[i];
			int i_4_ = Class335.anIntArray4165[i];
			synchronized (this) {
				for (int i_5_ = 0; i_5_ < anInt5718; i_5_++) {
					int i_6_ = anIntArray5717[i_5_] * i_3_ + anIntArray5748[i_5_] * i_4_ >> 14;
					anIntArray5717[i_5_] = anIntArray5717[i_5_] * i_4_ - anIntArray5748[i_5_] * i_3_ >> 14;
					anIntArray5748[i_5_] = i_6_;
				}
				method656();
			}
		}
	}
	
	private final void method654(int i) {
		if (!aClass374_5741.aBoolean4617) {
			short s = aShortArray5767[i];
			short s_7_ = aShortArray5731[i];
			short s_8_ = aShortArray5789[i];
			int i_9_ = anIntArray5758[s] - aClass374_5741.anInt4618;
			if (i_9_ > 255) {
				i_9_ = 255;
			} else if (i_9_ < 0) {
				i_9_ = 0;
			}
			int i_10_ = anIntArray5758[s_7_] - aClass374_5741.anInt4618;
			if (i_10_ > 255) {
				i_10_ = 255;
			} else if (i_10_ < 0) {
				i_10_ = 0;
			}
			int i_11_ = anIntArray5758[s_8_] - aClass374_5741.anInt4618;
			if (i_11_ > 255) {
				i_11_ = 255;
			} else if (i_11_ < 0) {
				i_11_ = 0;
			}
			int i_12_ = i_9_ + i_10_ + i_11_;
			if (i_12_ != 765) {
				if (i_12_ == 0) {
					method669(i);
				} else {
					if (aByteArray5784 == null) {
						aClass185_5712.anInt2220 = 0;
					} else {
						aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
					}
					if (aShortArray5773 == null || aShortArray5773[i] == -1) {
						if (anIntArray5761[i] == -1) {
							aClass185_5712.method1852((float) anIntArray5716[s], (float) anIntArray5716[s_7_], (float) anIntArray5716[s_8_], (float) anIntArray5713[s], (float) anIntArray5713[s_7_], (float) anIntArray5713[s_8_], (float) anIntArray5758[s], (float) anIntArray5758[s_7_], (float) anIntArray5758[s_8_], Class249.method3086(i_9_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_10_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_11_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56));
						} else {
							aClass185_5712.method1852((float) anIntArray5716[s], (float) anIntArray5716[s_7_], (float) anIntArray5716[s_8_], (float) anIntArray5713[s], (float) anIntArray5713[s_7_], (float) anIntArray5713[s_8_], (float) anIntArray5758[s], (float) anIntArray5758[s_7_], (float) anIntArray5758[s_8_], Class249.method3086(i_9_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_10_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5739[i] & 0xffff], (byte) -56), Class249.method3086(i_11_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5761[i] & 0xffff], (byte) -56));
						}
					} else {
						int i_13_ = -16777216;
						if (aByteArray5784 != null) {
							i_13_ = 255 - (aByteArray5784[i] & 0xff) << 24;
						}
						if (anIntArray5761[i] == -1) {
							int i_14_ = i_13_ | anIntArray5754[i] & 0xffffff;
							aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_7_], (float) anIntArray5716[s_8_], (float) anIntArray5713[s], (float) anIntArray5713[s_7_], (float) anIntArray5713[s_8_], (float) anIntArray5758[s], (float) anIntArray5758[s_7_], (float) anIntArray5758[s_8_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_14_, i_14_, i_14_, aClass374_5741.anInt4611, i_9_, i_10_, i_11_, aShortArray5773[i]);
						} else {
							aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_7_], (float) anIntArray5716[s_8_], (float) anIntArray5713[s], (float) anIntArray5713[s_7_], (float) anIntArray5713[s_8_], (float) anIntArray5758[s], (float) anIntArray5758[s_7_], (float) anIntArray5758[s_8_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_13_ | anIntArray5754[i] & 0xffffff, i_13_ | anIntArray5739[i] & 0xffffff, i_13_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, i_9_, i_10_, i_11_, aShortArray5773[i]);
						}
					}
				}
			}
		} else {
			short s = aShortArray5767[i];
			short s_15_ = aShortArray5731[i];
			short s_16_ = aShortArray5789[i];
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			if (anIntArray5769[s] > aClass374_5741.anInt4620) {
				i_17_ = 255;
			} else if (anIntArray5769[s] > aClass374_5741.anInt4624) {
				i_17_ = (aClass374_5741.anInt4624 - anIntArray5769[s]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (anIntArray5769[s_15_] > aClass374_5741.anInt4620) {
				i_18_ = 255;
			} else if (anIntArray5769[s_15_] > aClass374_5741.anInt4624) {
				i_18_ = (aClass374_5741.anInt4624 - anIntArray5769[s_15_]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (anIntArray5769[s_16_] > aClass374_5741.anInt4620) {
				i_19_ = 255;
			} else if (anIntArray5769[s_16_] > aClass374_5741.anInt4624) {
				i_19_ = (aClass374_5741.anInt4624 - anIntArray5769[s_16_]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (aByteArray5784 == null) {
				aClass185_5712.anInt2220 = 0;
			} else {
				aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1852((float) anIntArray5716[s], (float) anIntArray5716[s_15_], (float) anIntArray5716[s_16_], (float) anIntArray5713[s], (float) anIntArray5713[s_15_], (float) anIntArray5713[s_16_], (float) anIntArray5758[s], (float) anIntArray5758[s_15_], (float) anIntArray5758[s_16_], Class249.method3086(i_17_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_18_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_19_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56));
				} else {
					aClass185_5712.method1852((float) anIntArray5716[s], (float) anIntArray5716[s_15_], (float) anIntArray5716[s_16_], (float) anIntArray5713[s], (float) anIntArray5713[s_15_], (float) anIntArray5713[s_16_], (float) anIntArray5758[s], (float) anIntArray5758[s_15_], (float) anIntArray5758[s_16_], Class249.method3086(i_17_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_18_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5739[i] & 0xffff], (byte) -56), Class249.method3086(i_19_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5761[i] & 0xffff], (byte) -56));
				}
			} else {
				int i_20_ = -16777216;
				if (aByteArray5784 != null) {
					i_20_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				if (anIntArray5761[i] == -1) {
					int i_21_ = i_20_ | anIntArray5754[i] & 0xffffff;
					aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_15_], (float) anIntArray5716[s_16_], (float) anIntArray5713[s], (float) anIntArray5713[s_15_], (float) anIntArray5713[s_16_], (float) anIntArray5758[s], (float) anIntArray5758[s_15_], (float) anIntArray5758[s_16_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_21_, i_21_, i_21_, aClass374_5741.anInt4611, i_17_, i_18_, i_19_, aShortArray5773[i]);
				} else {
					aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_15_], (float) anIntArray5716[s_16_], (float) anIntArray5713[s], (float) anIntArray5713[s_15_], (float) anIntArray5713[s_16_], (float) anIntArray5758[s], (float) anIntArray5758[s_15_], (float) anIntArray5758[s_16_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_20_ | anIntArray5754[i] & 0xffffff, i_20_ | anIntArray5739[i] & 0xffffff, i_20_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, i_17_, i_18_, i_19_, aShortArray5773[i]);
				}
			}
		}
	}
	
	private final void method655(boolean bool) {
		if (aPureJavaToolkit5770.anInt6795 > 1) {
			synchronized (this) {
				method664(bool);
			}
		} else {
			method664(bool);
		}
	}
	
	private final void method656() {
		aClass354Array5774 = null;
		aClass354Array5735 = null;
		aClass272Array5775 = null;
		aBoolean5792 = false;
	}
	
	final void method626(int i, int i_22_, int i_23_, int i_24_) {
		if ((anInt5746 & 0x80000) != 524288) {
			throw new IllegalStateException("FMT");
		}
		for (int i_25_ = 0; i_25_ < anInt5711; i_25_++) {
			int i_26_ = aShortArray5740[i_25_] & 0xffff;
			int i_27_ = i_26_ >> 10 & 0x3f;
			int i_28_ = i_26_ >> 7 & 0x7;
			int i_29_ = i_26_ & 0x7f;
			if (i != -1) {
				i_27_ += (i - i_27_) * i_24_ >> 7;
			}
			if (i_22_ != -1) {
				i_28_ += (i_22_ - i_28_) * i_24_ >> 7;
			}
			if (i_23_ != -1) {
				i_29_ += (i_23_ - i_29_) * i_24_ >> 7;
			}
			aShortArray5740[i_25_] = (short) (i_27_ << 10 | i_28_ << 7 | i_29_);
		}
		if (aClass209Array5790 != null) {
			for (int i_30_ = 0; i_30_ < anInt5762; i_30_++) {
				Class209 class209 = aClass209Array5790[i_30_];
				Class214 class214 = aClass214Array5765[i_30_];
				class214.anInt2519 = class214.anInt2519 & ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aShortArray5740[class209.anInt2485] & 0xffff) & 0xffff] & 0xffffff;
			}
		}
		if (anInt5744 == 2) {
			anInt5744 = 1;
		}
	}
	
	final int EA() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5751;
	}
	
	final void I(int i, int[] is, int i_31_, int i_32_, int i_33_, boolean bool, int i_34_, int[] is_35_) {
		int i_36_ = is.length;
		if (i == 0) {
			i_31_ <<= 4;
			i_32_ <<= 4;
			i_33_ <<= 4;
			if (!aBoolean5723) {
				for (int i_37_ = 0; i_37_ < anInt5718; i_37_++) {
					anIntArray5748[i_37_] <<= 4;
					anIntArray5772[i_37_] <<= 4;
					anIntArray5717[i_37_] <<= 4;
				}
				aBoolean5723 = true;
			}
			int i_38_ = 0;
			anInt5779 = 0;
			anInt5752 = 0;
			anInt5743 = 0;
			for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
				int i_40_ = is[i_39_];
				if (i_40_ < anIntArrayArray5722.length) {
					int[] is_41_ = anIntArrayArray5722[i_40_];
					for (int i_42_ = 0; i_42_ < is_41_.length; i_42_++) {
						int i_43_ = is_41_[i_42_];
						if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_43_]) != 0) {
							anInt5779 += anIntArray5748[i_43_];
							anInt5752 += anIntArray5772[i_43_];
							anInt5743 += anIntArray5717[i_43_];
							i_38_++;
						}
					}
				}
			}
			if (i_38_ > 0) {
				anInt5779 = anInt5779 / i_38_ + i_31_;
				anInt5752 = anInt5752 / i_38_ + i_32_;
				anInt5743 = anInt5743 / i_38_ + i_33_;
				aBoolean5734 = true;
			} else {
				anInt5779 = i_31_;
				anInt5752 = i_32_;
				anInt5743 = i_33_;
			}
		} else if (i == 1) {
			if (is_35_ != null) {
				int i_44_ = is_35_[0] * i_31_ + is_35_[1] * i_32_ + is_35_[2] * i_33_ + 8192 >> 14;
				int i_45_ = is_35_[3] * i_31_ + is_35_[4] * i_32_ + is_35_[5] * i_33_ + 8192 >> 14;
				int i_46_ = is_35_[6] * i_31_ + is_35_[7] * i_32_ + is_35_[8] * i_33_ + 8192 >> 14;
				i_31_ = i_44_;
				i_32_ = i_45_;
				i_33_ = i_46_;
			}
			i_31_ <<= 4;
			i_32_ <<= 4;
			i_33_ <<= 4;
			if (!aBoolean5723) {
				for (int i_47_ = 0; i_47_ < anInt5718; i_47_++) {
					anIntArray5748[i_47_] <<= 4;
					anIntArray5772[i_47_] <<= 4;
					anIntArray5717[i_47_] <<= 4;
				}
				aBoolean5723 = true;
			}
			for (int i_48_ = 0; i_48_ < i_36_; i_48_++) {
				int i_49_ = is[i_48_];
				if (i_49_ < anIntArrayArray5722.length) {
					int[] is_50_ = anIntArrayArray5722[i_49_];
					for (int i_51_ = 0; i_51_ < is_50_.length; i_51_++) {
						int i_52_ = is_50_[i_51_];
						if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_52_]) != 0) {
							anIntArray5748[i_52_] += i_31_;
							anIntArray5772[i_52_] += i_32_;
							anIntArray5717[i_52_] += i_33_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_35_ != null) {
				if (!aBoolean5723) {
					for (int i_53_ = 0; i_53_ < anInt5718; i_53_++) {
						anIntArray5748[i_53_] <<= 4;
						anIntArray5772[i_53_] <<= 4;
						anIntArray5717[i_53_] <<= 4;
					}
					aBoolean5723 = true;
				}
				int i_54_ = is_35_[9] << 4;
				int i_55_ = is_35_[10] << 4;
				int i_56_ = is_35_[11] << 4;
				int i_57_ = is_35_[12] << 4;
				int i_58_ = is_35_[13] << 4;
				int i_59_ = is_35_[14] << 4;
				if (aBoolean5734) {
					int i_60_ = is_35_[0] * anInt5779 + is_35_[3] * anInt5752 + is_35_[6] * anInt5743 + 8192 >> 14;
					int i_61_ = is_35_[1] * anInt5779 + is_35_[4] * anInt5752 + is_35_[7] * anInt5743 + 8192 >> 14;
					int i_62_ = is_35_[2] * anInt5779 + is_35_[5] * anInt5752 + is_35_[8] * anInt5743 + 8192 >> 14;
					i_60_ += i_57_;
					i_61_ += i_58_;
					i_62_ += i_59_;
					anInt5779 = i_60_;
					anInt5752 = i_61_;
					anInt5743 = i_62_;
					aBoolean5734 = false;
				}
				int[] is_63_ = new int[9];
				int i_64_ = Class335.anIntArray4165[i_31_];
				int i_65_ = Class335.anIntArray4167[i_31_];
				int i_66_ = Class335.anIntArray4165[i_32_];
				int i_67_ = Class335.anIntArray4167[i_32_];
				int i_68_ = Class335.anIntArray4165[i_33_];
				int i_69_ = Class335.anIntArray4167[i_33_];
				int i_70_ = i_65_ * i_68_ + 8192 >> 14;
				int i_71_ = i_65_ * i_69_ + 8192 >> 14;
				is_63_[0] = i_66_ * i_68_ + i_67_ * i_71_ + 8192 >> 14;
				is_63_[1] = -i_66_ * i_69_ + i_67_ * i_70_ + 8192 >> 14;
				is_63_[2] = i_67_ * i_64_ + 8192 >> 14;
				is_63_[3] = i_64_ * i_69_ + 8192 >> 14;
				is_63_[4] = i_64_ * i_68_ + 8192 >> 14;
				is_63_[5] = -i_65_;
				is_63_[6] = -i_67_ * i_68_ + i_66_ * i_71_ + 8192 >> 14;
				is_63_[7] = i_67_ * i_69_ + i_66_ * i_70_ + 8192 >> 14;
				is_63_[8] = i_66_ * i_64_ + 8192 >> 14;
				int i_72_ = is_63_[0] * -anInt5779 + is_63_[1] * -anInt5752 + is_63_[2] * -anInt5743 + 8192 >> 14;
				int i_73_ = is_63_[3] * -anInt5779 + is_63_[4] * -anInt5752 + is_63_[5] * -anInt5743 + 8192 >> 14;
				int i_74_ = is_63_[6] * -anInt5779 + is_63_[7] * -anInt5752 + is_63_[8] * -anInt5743 + 8192 >> 14;
				int i_75_ = i_72_ + anInt5779;
				int i_76_ = i_73_ + anInt5752;
				int i_77_ = i_74_ + anInt5743;
				int[] is_78_ = new int[9];
				for (int i_79_ = 0; i_79_ < 3; i_79_++) {
					for (int i_80_ = 0; i_80_ < 3; i_80_++) {
						int i_81_ = 0;
						for (int i_82_ = 0; i_82_ < 3; i_82_++)
							i_81_ += is_63_[i_79_ * 3 + i_82_] * is_35_[i_80_ * 3 + i_82_];
						is_78_[i_79_ * 3 + i_80_] = i_81_ + 8192 >> 14;
					}
				}
				int i_83_ = is_63_[0] * i_57_ + is_63_[1] * i_58_ + is_63_[2] * i_59_ + 8192 >> 14;
				int i_84_ = is_63_[3] * i_57_ + is_63_[4] * i_58_ + is_63_[5] * i_59_ + 8192 >> 14;
				int i_85_ = is_63_[6] * i_57_ + is_63_[7] * i_58_ + is_63_[8] * i_59_ + 8192 >> 14;
				i_83_ += i_75_;
				i_84_ += i_76_;
				i_85_ += i_77_;
				int[] is_86_ = new int[9];
				for (int i_87_ = 0; i_87_ < 3; i_87_++) {
					for (int i_88_ = 0; i_88_ < 3; i_88_++) {
						int i_89_ = 0;
						for (int i_90_ = 0; i_90_ < 3; i_90_++)
							i_89_ += is_35_[i_87_ * 3 + i_90_] * is_78_[i_88_ + i_90_ * 3];
						is_86_[i_87_ * 3 + i_88_] = i_89_ + 8192 >> 14;
					}
				}
				int i_91_ = is_35_[0] * i_83_ + is_35_[1] * i_84_ + is_35_[2] * i_85_ + 8192 >> 14;
				int i_92_ = is_35_[3] * i_83_ + is_35_[4] * i_84_ + is_35_[5] * i_85_ + 8192 >> 14;
				int i_93_ = is_35_[6] * i_83_ + is_35_[7] * i_84_ + is_35_[8] * i_85_ + 8192 >> 14;
				i_91_ += i_54_;
				i_92_ += i_55_;
				i_93_ += i_56_;
				for (int i_94_ = 0; i_94_ < i_36_; i_94_++) {
					int i_95_ = is[i_94_];
					if (i_95_ < anIntArrayArray5722.length) {
						int[] is_96_ = anIntArrayArray5722[i_95_];
						for (int i_97_ = 0; i_97_ < is_96_.length; i_97_++) {
							int i_98_ = is_96_[i_97_];
							if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_98_]) != 0) {
								int i_99_ = is_86_[0] * anIntArray5748[i_98_] + is_86_[1] * anIntArray5772[i_98_] + is_86_[2] * anIntArray5717[i_98_] + 8192 >> 14;
								int i_100_ = is_86_[3] * anIntArray5748[i_98_] + is_86_[4] * anIntArray5772[i_98_] + is_86_[5] * anIntArray5717[i_98_] + 8192 >> 14;
								int i_101_ = is_86_[6] * anIntArray5748[i_98_] + is_86_[7] * anIntArray5772[i_98_] + is_86_[8] * anIntArray5717[i_98_] + 8192 >> 14;
								i_99_ += i_91_;
								i_100_ += i_92_;
								i_101_ += i_93_;
								anIntArray5748[i_98_] = i_99_;
								anIntArray5772[i_98_] = i_100_;
								anIntArray5717[i_98_] = i_101_;
							}
						}
					}
				}
			} else {
				for (int i_102_ = 0; i_102_ < i_36_; i_102_++) {
					int i_103_ = is[i_102_];
					if (i_103_ < anIntArrayArray5722.length) {
						int[] is_104_ = anIntArrayArray5722[i_103_];
						for (int i_105_ = 0; i_105_ < is_104_.length; i_105_++) {
							int i_106_ = is_104_[i_105_];
							if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_106_]) != 0) {
								anIntArray5748[i_106_] -= anInt5779;
								anIntArray5772[i_106_] -= anInt5752;
								anIntArray5717[i_106_] -= anInt5743;
								if (i_33_ != 0) {
									int i_107_ = Class335.anIntArray4167[i_33_];
									int i_108_ = Class335.anIntArray4165[i_33_];
									int i_109_ = anIntArray5772[i_106_] * i_107_ + anIntArray5748[i_106_] * i_108_ + 16383 >> 14;
									anIntArray5772[i_106_] = anIntArray5772[i_106_] * i_108_ - anIntArray5748[i_106_] * i_107_ + 16383 >> 14;
									anIntArray5748[i_106_] = i_109_;
								}
								if (i_31_ != 0) {
									int i_110_ = Class335.anIntArray4167[i_31_];
									int i_111_ = Class335.anIntArray4165[i_31_];
									int i_112_ = anIntArray5772[i_106_] * i_111_ - anIntArray5717[i_106_] * i_110_ + 16383 >> 14;
									anIntArray5717[i_106_] = anIntArray5772[i_106_] * i_110_ + anIntArray5717[i_106_] * i_111_ + 16383 >> 14;
									anIntArray5772[i_106_] = i_112_;
								}
								if (i_32_ != 0) {
									int i_113_ = Class335.anIntArray4167[i_32_];
									int i_114_ = Class335.anIntArray4165[i_32_];
									int i_115_ = anIntArray5717[i_106_] * i_113_ + anIntArray5748[i_106_] * i_114_ + 16383 >> 14;
									anIntArray5717[i_106_] = anIntArray5717[i_106_] * i_114_ - anIntArray5748[i_106_] * i_113_ + 16383 >> 14;
									anIntArray5748[i_106_] = i_115_;
								}
								anIntArray5748[i_106_] += anInt5779;
								anIntArray5772[i_106_] += anInt5752;
								anIntArray5717[i_106_] += anInt5743;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_35_ != null) {
				if (!aBoolean5723) {
					for (int i_116_ = 0; i_116_ < anInt5718; i_116_++) {
						anIntArray5748[i_116_] <<= 4;
						anIntArray5772[i_116_] <<= 4;
						anIntArray5717[i_116_] <<= 4;
					}
					aBoolean5723 = true;
				}
				int i_117_ = is_35_[9] << 4;
				int i_118_ = is_35_[10] << 4;
				int i_119_ = is_35_[11] << 4;
				int i_120_ = is_35_[12] << 4;
				int i_121_ = is_35_[13] << 4;
				int i_122_ = is_35_[14] << 4;
				if (aBoolean5734) {
					int i_123_ = is_35_[0] * anInt5779 + is_35_[3] * anInt5752 + is_35_[6] * anInt5743 + 8192 >> 14;
					int i_124_ = is_35_[1] * anInt5779 + is_35_[4] * anInt5752 + is_35_[7] * anInt5743 + 8192 >> 14;
					int i_125_ = is_35_[2] * anInt5779 + is_35_[5] * anInt5752 + is_35_[8] * anInt5743 + 8192 >> 14;
					i_123_ += i_120_;
					i_124_ += i_121_;
					i_125_ += i_122_;
					anInt5779 = i_123_;
					anInt5752 = i_124_;
					anInt5743 = i_125_;
					aBoolean5734 = false;
				}
				int i_126_ = i_31_ << 15 >> 7;
				int i_127_ = i_32_ << 15 >> 7;
				int i_128_ = i_33_ << 15 >> 7;
				int i_129_ = i_126_ * -anInt5779 + 8192 >> 14;
				int i_130_ = i_127_ * -anInt5752 + 8192 >> 14;
				int i_131_ = i_128_ * -anInt5743 + 8192 >> 14;
				int i_132_ = i_129_ + anInt5779;
				int i_133_ = i_130_ + anInt5752;
				int i_134_ = i_131_ + anInt5743;
				int[] is_135_ = new int[9];
				is_135_[0] = i_126_ * is_35_[0] + 8192 >> 14;
				is_135_[1] = i_126_ * is_35_[3] + 8192 >> 14;
				is_135_[2] = i_126_ * is_35_[6] + 8192 >> 14;
				is_135_[3] = i_127_ * is_35_[1] + 8192 >> 14;
				is_135_[4] = i_127_ * is_35_[4] + 8192 >> 14;
				is_135_[5] = i_127_ * is_35_[7] + 8192 >> 14;
				is_135_[6] = i_128_ * is_35_[2] + 8192 >> 14;
				is_135_[7] = i_128_ * is_35_[5] + 8192 >> 14;
				is_135_[8] = i_128_ * is_35_[8] + 8192 >> 14;
				int i_136_ = i_126_ * i_120_ + 8192 >> 14;
				int i_137_ = i_127_ * i_121_ + 8192 >> 14;
				int i_138_ = i_128_ * i_122_ + 8192 >> 14;
				i_136_ += i_132_;
				i_137_ += i_133_;
				i_138_ += i_134_;
				int[] is_139_ = new int[9];
				for (int i_140_ = 0; i_140_ < 3; i_140_++) {
					for (int i_141_ = 0; i_141_ < 3; i_141_++) {
						int i_142_ = 0;
						for (int i_143_ = 0; i_143_ < 3; i_143_++)
							i_142_ += is_35_[i_140_ * 3 + i_143_] * is_135_[i_141_ + i_143_ * 3];
						is_139_[i_140_ * 3 + i_141_] = i_142_ + 8192 >> 14;
					}
				}
				int i_144_ = is_35_[0] * i_136_ + is_35_[1] * i_137_ + is_35_[2] * i_138_ + 8192 >> 14;
				int i_145_ = is_35_[3] * i_136_ + is_35_[4] * i_137_ + is_35_[5] * i_138_ + 8192 >> 14;
				int i_146_ = is_35_[6] * i_136_ + is_35_[7] * i_137_ + is_35_[8] * i_138_ + 8192 >> 14;
				i_144_ += i_117_;
				i_145_ += i_118_;
				i_146_ += i_119_;
				for (int i_147_ = 0; i_147_ < i_36_; i_147_++) {
					int i_148_ = is[i_147_];
					if (i_148_ < anIntArrayArray5722.length) {
						int[] is_149_ = anIntArrayArray5722[i_148_];
						for (int i_150_ = 0; i_150_ < is_149_.length; i_150_++) {
							int i_151_ = is_149_[i_150_];
							if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_151_]) != 0) {
								int i_152_ = is_139_[0] * anIntArray5748[i_151_] + is_139_[1] * anIntArray5772[i_151_] + is_139_[2] * anIntArray5717[i_151_] + 8192 >> 14;
								int i_153_ = is_139_[3] * anIntArray5748[i_151_] + is_139_[4] * anIntArray5772[i_151_] + is_139_[5] * anIntArray5717[i_151_] + 8192 >> 14;
								int i_154_ = is_139_[6] * anIntArray5748[i_151_] + is_139_[7] * anIntArray5772[i_151_] + is_139_[8] * anIntArray5717[i_151_] + 8192 >> 14;
								i_152_ += i_144_;
								i_153_ += i_145_;
								i_154_ += i_146_;
								anIntArray5748[i_151_] = i_152_;
								anIntArray5772[i_151_] = i_153_;
								anIntArray5717[i_151_] = i_154_;
							}
						}
					}
				}
			} else {
				for (int i_155_ = 0; i_155_ < i_36_; i_155_++) {
					int i_156_ = is[i_155_];
					if (i_156_ < anIntArrayArray5722.length) {
						int[] is_157_ = anIntArrayArray5722[i_156_];
						for (int i_158_ = 0; i_158_ < is_157_.length; i_158_++) {
							int i_159_ = is_157_[i_158_];
							if (aShortArray5747 == null || (i_34_ & aShortArray5747[i_159_]) != 0) {
								anIntArray5748[i_159_] -= anInt5779;
								anIntArray5772[i_159_] -= anInt5752;
								anIntArray5717[i_159_] -= anInt5743;
								anIntArray5748[i_159_] = anIntArray5748[i_159_] * i_31_ / 128;
								anIntArray5772[i_159_] = anIntArray5772[i_159_] * i_32_ / 128;
								anIntArray5717[i_159_] = anIntArray5717[i_159_] * i_33_ / 128;
								anIntArray5748[i_159_] += anInt5779;
								anIntArray5772[i_159_] += anInt5752;
								anIntArray5717[i_159_] += anInt5743;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray5725 != null && aByteArray5784 != null) {
				for (int i_160_ = 0; i_160_ < i_36_; i_160_++) {
					int i_161_ = is[i_160_];
					if (i_161_ < anIntArrayArray5725.length) {
						int[] is_162_ = anIntArrayArray5725[i_161_];
						for (int i_163_ = 0; i_163_ < is_162_.length; i_163_++) {
							int i_164_ = is_162_[i_163_];
							if (aShortArray5787 == null || (i_34_ & aShortArray5787[i_164_]) != 0) {
								int i_165_ = (aByteArray5784[i_164_] & 0xff) + i_31_ * 8;
								if (i_165_ < 0) {
									i_165_ = 0;
								} else if (i_165_ > 255) {
									i_165_ = 255;
								}
								aByteArray5784[i_164_] = (byte) i_165_;
							}
						}
					}
				}
				if (aClass209Array5790 != null) {
					for (int i_166_ = 0; i_166_ < anInt5762; i_166_++) {
						Class209 class209 = aClass209Array5790[i_166_];
						Class214 class214 = aClass214Array5765[i_166_];
						class214.anInt2519 = class214.anInt2519 & 0xffffff | 255 - (aByteArray5784[class209.anInt2485] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray5725 != null) {
				for (int i_167_ = 0; i_167_ < i_36_; i_167_++) {
					int i_168_ = is[i_167_];
					if (i_168_ < anIntArrayArray5725.length) {
						int[] is_169_ = anIntArrayArray5725[i_168_];
						for (int i_170_ = 0; i_170_ < is_169_.length; i_170_++) {
							int i_171_ = is_169_[i_170_];
							if (aShortArray5787 == null || (i_34_ & aShortArray5787[i_171_]) != 0) {
								int i_172_ = aShortArray5740[i_171_] & 0xffff;
								int i_173_ = i_172_ >> 10 & 0x3f;
								int i_174_ = i_172_ >> 7 & 0x7;
								int i_175_ = i_172_ & 0x7f;
								i_173_ = i_173_ + i_31_ & 0x3f;
								i_174_ += i_32_;
								if (i_174_ < 0) {
									i_174_ = 0;
								} else if (i_174_ > 7) {
									i_174_ = 7;
								}
								i_175_ += i_33_;
								if (i_175_ < 0) {
									i_175_ = 0;
								} else if (i_175_ > 127) {
									i_175_ = 127;
								}
								aShortArray5740[i_171_] = (short) (i_173_ << 10 | i_174_ << 7 | i_175_);
							}
						}
						aBoolean5786 = true;
					}
				}
				if (aClass209Array5790 != null) {
					for (int i_176_ = 0; i_176_ < anInt5762; i_176_++) {
						Class209 class209 = aClass209Array5790[i_176_];
						Class214 class214 = aClass214Array5765[i_176_];
						class214.anInt2519 = class214.anInt2519 & ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aShortArray5740[class209.anInt2485] & 0xffff) & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray5783 != null) {
				for (int i_177_ = 0; i_177_ < i_36_; i_177_++) {
					int i_178_ = is[i_177_];
					if (i_178_ < anIntArrayArray5783.length) {
						int[] is_179_ = anIntArrayArray5783[i_178_];
						for (int i_180_ = 0; i_180_ < is_179_.length; i_180_++) {
							Class214 class214 = aClass214Array5765[is_179_[i_180_]];
							class214.anInt2516 += i_31_;
							class214.anInt2523 += i_32_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray5783 != null) {
				for (int i_181_ = 0; i_181_ < i_36_; i_181_++) {
					int i_182_ = is[i_181_];
					if (i_182_ < anIntArrayArray5783.length) {
						int[] is_183_ = anIntArrayArray5783[i_182_];
						for (int i_184_ = 0; i_184_ < is_183_.length; i_184_++) {
							Class214 class214 = aClass214Array5765[is_183_[i_184_]];
							class214.anInt2517 = class214.anInt2517 * i_31_ >> 7;
							class214.anInt2520 = class214.anInt2520 * i_32_ >> 7;
						}
					}
				}
			}
		} else if (i == 9 && anIntArrayArray5783 != null) {
			for (int i_185_ = 0; i_185_ < i_36_; i_185_++) {
				int i_186_ = is[i_185_];
				if (i_186_ < anIntArrayArray5783.length) {
					int[] is_187_ = anIntArrayArray5783[i_186_];
					for (int i_188_ = 0; i_188_ < is_187_.length; i_188_++) {
						Class214 class214 = aClass214Array5765[is_187_[i_188_]];
						class214.anInt2525 = class214.anInt2525 + i_31_ & 0x3fff;
					}
				}
			}
		}
	}
	
	final boolean method624(int i, int i_189_, Class336 class336, boolean bool, int i_190_) {
		return method665(i, i_189_, class336, bool, i_190_, -1);
	}
	
	private final void method657() {
		synchronized (this) {
			for (int i = 0; i < anInt5718; i++) {
				int i_191_ = anIntArray5748[i];
				anIntArray5748[i] = anIntArray5717[i];
				anIntArray5717[i] = -i_191_;
			}
			method656();
		}
	}
	
	final r ba(r var_r) {
		return null;
	}
	
	private final boolean method658(int i) {
		if (aByteArray5784 == null) {
			return false;
		}
        return aByteArray5784[i] != 0;
    }
	
	final int RA() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5766;
	}
	
	private final void method659(int i) {
		if (!aClass374_5741.aBoolean4617) {
			short s = aShortArray5767[i];
			short s_192_ = aShortArray5731[i];
			short s_193_ = aShortArray5789[i];
			int i_194_ = anIntArray5758[s] - aClass374_5741.anInt4618;
			if (i_194_ > 255) {
				i_194_ = 255;
			} else if (i_194_ < 0) {
				i_194_ = 0;
			}
			int i_195_ = anIntArray5758[s_192_] - aClass374_5741.anInt4618;
			if (i_195_ > 255) {
				i_195_ = 255;
			} else if (i_195_ < 0) {
				i_195_ = 0;
			}
			int i_196_ = anIntArray5758[s_193_] - aClass374_5741.anInt4618;
			if (i_196_ > 255) {
				i_196_ = 255;
			} else if (i_196_ < 0) {
				i_196_ = 0;
			}
			int i_197_ = i_194_ + i_195_ + i_196_;
			if (i_197_ != 765) {
				if (i_197_ == 0) {
					method685(i);
				} else {
					if (aByteArray5784 == null) {
						aClass185_5712.anInt2220 = 0;
					} else {
						aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
					}
					if (aShortArray5773 == null || aShortArray5773[i] == -1) {
						if (anIntArray5761[i] == -1) {
							aClass185_5712.method1850((float) anIntArray5716[s], (float) anIntArray5716[s_192_], (float) anIntArray5716[s_193_], (float) anIntArray5713[s], (float) anIntArray5713[s_192_], (float) anIntArray5713[s_193_], (float) anIntArray5758[s], (float) anIntArray5758[s_192_], (float) anIntArray5758[s_193_], Class249.method3086(i_194_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_195_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_196_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56));
						} else {
							aClass185_5712.method1850((float) anIntArray5716[s], (float) anIntArray5716[s_192_], (float) anIntArray5716[s_193_], (float) anIntArray5713[s], (float) anIntArray5713[s_192_], (float) anIntArray5713[s_193_], (float) anIntArray5758[s], (float) anIntArray5758[s_192_], (float) anIntArray5758[s_193_], Class249.method3086(i_194_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_195_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5739[i] & 0xffff], (byte) -56), Class249.method3086(i_196_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5761[i] & 0xffff], (byte) -56));
						}
					} else {
						int i_198_ = -16777216;
						if (aByteArray5784 != null) {
							i_198_ = 255 - (aByteArray5784[i] & 0xff) << 24;
						}
						if (anIntArray5761[i] == -1) {
							int i_199_ = i_198_ | anIntArray5754[i] & 0xffffff;
							aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_192_], (float) anIntArray5716[s_193_], (float) anIntArray5713[s], (float) anIntArray5713[s_192_], (float) anIntArray5713[s_193_], (float) anIntArray5758[s], (float) anIntArray5758[s_192_], (float) anIntArray5758[s_193_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_199_, i_199_, i_199_, aClass374_5741.anInt4611, i_194_, i_195_, i_196_, aShortArray5773[i]);
						} else {
							aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_192_], (float) anIntArray5716[s_193_], (float) anIntArray5713[s], (float) anIntArray5713[s_192_], (float) anIntArray5713[s_193_], (float) anIntArray5758[s], (float) anIntArray5758[s_192_], (float) anIntArray5758[s_193_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_198_ | anIntArray5754[i] & 0xffffff, i_198_ | anIntArray5739[i] & 0xffffff, i_198_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, i_194_, i_195_, i_196_, aShortArray5773[i]);
						}
					}
				}
			}
		} else {
			short s = aShortArray5767[i];
			short s_200_ = aShortArray5731[i];
			short s_201_ = aShortArray5789[i];
			int i_202_ = 0;
			int i_203_ = 0;
			int i_204_ = 0;
			if (anIntArray5769[s] > aClass374_5741.anInt4620) {
				i_202_ = 255;
			} else if (anIntArray5769[s] > aClass374_5741.anInt4624) {
				i_202_ = (aClass374_5741.anInt4624 - anIntArray5769[s]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (anIntArray5769[s_200_] > aClass374_5741.anInt4620) {
				i_203_ = 255;
			} else if (anIntArray5769[s_200_] > aClass374_5741.anInt4624) {
				i_203_ = (aClass374_5741.anInt4624 - anIntArray5769[s_200_]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (anIntArray5769[s_201_] > aClass374_5741.anInt4620) {
				i_204_ = 255;
			} else if (anIntArray5769[s_201_] > aClass374_5741.anInt4624) {
				i_204_ = (aClass374_5741.anInt4624 - anIntArray5769[s_201_]) * 255 / (aClass374_5741.anInt4624 - aClass374_5741.anInt4620);
			}
			if (aByteArray5784 == null) {
				aClass185_5712.anInt2220 = 0;
			} else {
				aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1850((float) anIntArray5716[s], (float) anIntArray5716[s_200_], (float) anIntArray5716[s_201_], (float) anIntArray5713[s], (float) anIntArray5713[s_200_], (float) anIntArray5713[s_201_], (float) anIntArray5758[s], (float) anIntArray5758[s_200_], (float) anIntArray5758[s_201_], Class249.method3086(i_202_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_203_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_204_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56));
				} else {
					aClass185_5712.method1850((float) anIntArray5716[s], (float) anIntArray5716[s_200_], (float) anIntArray5716[s_201_], (float) anIntArray5713[s], (float) anIntArray5713[s_200_], (float) anIntArray5713[s_201_], (float) anIntArray5758[s], (float) anIntArray5758[s_200_], (float) anIntArray5758[s_201_], Class249.method3086(i_202_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5754[i] & 0xffff], (byte) -56), Class249.method3086(i_203_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5739[i] & 0xffff], (byte) -56), Class249.method3086(i_204_ << 24 | aClass374_5741.anInt4611, Class170.anIntArray2054[anIntArray5761[i] & 0xffff], (byte) -56));
				}
			} else {
				int i_205_ = -16777216;
				if (aByteArray5784 != null) {
					i_205_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				if (anIntArray5761[i] == -1) {
					int i_206_ = i_205_ | anIntArray5754[i] & 0xffffff;
					aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_200_], (float) anIntArray5716[s_201_], (float) anIntArray5713[s], (float) anIntArray5713[s_200_], (float) anIntArray5713[s_201_], (float) anIntArray5758[s], (float) anIntArray5758[s_200_], (float) anIntArray5758[s_201_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_206_, i_206_, i_206_, aClass374_5741.anInt4611, i_202_, i_203_, i_204_, aShortArray5773[i]);
				} else {
					aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_200_], (float) anIntArray5716[s_201_], (float) anIntArray5713[s], (float) anIntArray5713[s_200_], (float) anIntArray5713[s_201_], (float) anIntArray5758[s], (float) anIntArray5758[s_200_], (float) anIntArray5758[s_201_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_205_ | anIntArray5754[i] & 0xffffff, i_205_ | anIntArray5739[i] & 0xffffff, i_205_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, i_202_, i_203_, i_204_, aShortArray5773[i]);
				}
			}
		}
	}
	
	final DrawableModel method633(byte b, int i, boolean bool) {
		method687(Thread.currentThread());
		boolean bool_207_ = false;
		PureJavaDrawableModel purejavadrawablemodel_208_;
		PureJavaDrawableModel purejavadrawablemodel_209_;
		if (b > 0 && b <= 7) {
			purejavadrawablemodel_209_ = aPureJavaDrawableModelArray5733[b - 1];
			purejavadrawablemodel_208_ = aPureJavaDrawableModelArray5750[b - 1];
			bool_207_ = true;
		} else {
			purejavadrawablemodel_208_ = purejavadrawablemodel_209_ = new PureJavaDrawableModel(aPureJavaToolkit5770);
		}
		return method666(purejavadrawablemodel_208_, purejavadrawablemodel_209_, i, bool_207_, bool);
	}
	
	final void method629() {
		if (aPureJavaToolkit5770.anInt6795 > 1) {
			synchronized (this) {
				while (aBoolean914) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean914 = true;
			}
		}
	}
	
	final void method617() {
		/* empty */
	}
	
	final void P(int i, int i_210_, int i_211_, int i_212_) {
		if (i == 0) {
			int i_213_ = 0;
			anInt5779 = 0;
			anInt5752 = 0;
			anInt5743 = 0;
			for (int i_214_ = 0; i_214_ < anInt5718; i_214_++) {
				anInt5779 += anIntArray5748[i_214_];
				anInt5752 += anIntArray5772[i_214_];
				anInt5743 += anIntArray5717[i_214_];
				i_213_++;
			}
			if (i_213_ > 0) {
				anInt5779 = anInt5779 / i_213_ + i_210_;
				anInt5752 = anInt5752 / i_213_ + i_211_;
				anInt5743 = anInt5743 / i_213_ + i_212_;
			} else {
				anInt5779 = i_210_;
				anInt5752 = i_211_;
				anInt5743 = i_212_;
			}
		} else if (i == 1) {
			for (int i_215_ = 0; i_215_ < anInt5718; i_215_++) {
				anIntArray5748[i_215_] += i_210_;
				anIntArray5772[i_215_] += i_211_;
				anIntArray5717[i_215_] += i_212_;
			}
		} else if (i == 2) {
			for (int i_216_ = 0; i_216_ < anInt5718; i_216_++) {
				anIntArray5748[i_216_] -= anInt5779;
				anIntArray5772[i_216_] -= anInt5752;
				anIntArray5717[i_216_] -= anInt5743;
				if (i_212_ != 0) {
					int i_217_ = Class335.anIntArray4167[i_212_];
					int i_218_ = Class335.anIntArray4165[i_212_];
					int i_219_ = anIntArray5772[i_216_] * i_217_ + anIntArray5748[i_216_] * i_218_ + 16383 >> 14;
					anIntArray5772[i_216_] = anIntArray5772[i_216_] * i_218_ - anIntArray5748[i_216_] * i_217_ + 16383 >> 14;
					anIntArray5748[i_216_] = i_219_;
				}
				if (i_210_ != 0) {
					int i_220_ = Class335.anIntArray4167[i_210_];
					int i_221_ = Class335.anIntArray4165[i_210_];
					int i_222_ = anIntArray5772[i_216_] * i_221_ - anIntArray5717[i_216_] * i_220_ + 16383 >> 14;
					anIntArray5717[i_216_] = anIntArray5772[i_216_] * i_220_ + anIntArray5717[i_216_] * i_221_ + 16383 >> 14;
					anIntArray5772[i_216_] = i_222_;
				}
				if (i_211_ != 0) {
					int i_223_ = Class335.anIntArray4167[i_211_];
					int i_224_ = Class335.anIntArray4165[i_211_];
					int i_225_ = anIntArray5717[i_216_] * i_223_ + anIntArray5748[i_216_] * i_224_ + 16383 >> 14;
					anIntArray5717[i_216_] = anIntArray5717[i_216_] * i_224_ - anIntArray5748[i_216_] * i_223_ + 16383 >> 14;
					anIntArray5748[i_216_] = i_225_;
				}
				anIntArray5748[i_216_] += anInt5779;
				anIntArray5772[i_216_] += anInt5752;
				anIntArray5717[i_216_] += anInt5743;
			}
		} else if (i == 3) {
			for (int i_226_ = 0; i_226_ < anInt5718; i_226_++) {
				anIntArray5748[i_226_] -= anInt5779;
				anIntArray5772[i_226_] -= anInt5752;
				anIntArray5717[i_226_] -= anInt5743;
				anIntArray5748[i_226_] = anIntArray5748[i_226_] * i_210_ / 128;
				anIntArray5772[i_226_] = anIntArray5772[i_226_] * i_211_ / 128;
				anIntArray5717[i_226_] = anIntArray5717[i_226_] * i_212_ / 128;
				anIntArray5748[i_226_] += anInt5779;
				anIntArray5772[i_226_] += anInt5752;
				anIntArray5717[i_226_] += anInt5743;
			}
		} else if (i == 5) {
			for (int i_227_ = 0; i_227_ < anInt5711; i_227_++) {
				int i_228_ = (aByteArray5784[i_227_] & 0xff) + i_210_ * 8;
				if (i_228_ < 0) {
					i_228_ = 0;
				} else if (i_228_ > 255) {
					i_228_ = 255;
				}
				aByteArray5784[i_227_] = (byte) i_228_;
			}
			if (aClass209Array5790 != null) {
				for (int i_229_ = 0; i_229_ < anInt5762; i_229_++) {
					Class209 class209 = aClass209Array5790[i_229_];
					Class214 class214 = aClass214Array5765[i_229_];
					class214.anInt2519 = class214.anInt2519 & 0xffffff | 255 - (aByteArray5784[class209.anInt2485] & 0xff) << 24;
				}
			}
		} else if (i == 7) {
			for (int i_230_ = 0; i_230_ < anInt5711; i_230_++) {
				int i_231_ = aShortArray5740[i_230_] & 0xffff;
				int i_232_ = i_231_ >> 10 & 0x3f;
				int i_233_ = i_231_ >> 7 & 0x7;
				int i_234_ = i_231_ & 0x7f;
				i_232_ = i_232_ + i_210_ & 0x3f;
				i_233_ += i_211_;
				if (i_233_ < 0) {
					i_233_ = 0;
				} else if (i_233_ > 7) {
					i_233_ = 7;
				}
				i_234_ += i_212_;
				if (i_234_ < 0) {
					i_234_ = 0;
				} else if (i_234_ > 127) {
					i_234_ = 127;
				}
				aShortArray5740[i_230_] = (short) (i_232_ << 10 | i_233_ << 7 | i_234_);
			}
			aBoolean5786 = true;
			if (aClass209Array5790 != null) {
				for (int i_235_ = 0; i_235_ < anInt5762; i_235_++) {
					Class209 class209 = aClass209Array5790[i_235_];
					Class214 class214 = aClass214Array5765[i_235_];
					class214.anInt2519 = class214.anInt2519 & ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aShortArray5740[class209.anInt2485] & 0xffff) & 0xffff] & 0xffffff;
				}
			}
		} else if (i == 8) {
			for (int i_236_ = 0; i_236_ < anInt5762; i_236_++) {
				Class214 class214 = aClass214Array5765[i_236_];
				class214.anInt2516 += i_210_;
				class214.anInt2523 += i_211_;
			}
		} else if (i == 10) {
			for (int i_237_ = 0; i_237_ < anInt5762; i_237_++) {
				Class214 class214 = aClass214Array5765[i_237_];
				class214.anInt2517 = class214.anInt2517 * i_210_ >> 7;
				class214.anInt2520 = class214.anInt2520 * i_211_ >> 7;
			}
		} else if (i == 9) {
			for (int i_238_ = 0; i_238_ < anInt5762; i_238_++) {
				Class214 class214 = aClass214Array5765[i_238_];
				class214.anInt2525 = class214.anInt2525 + i_210_ & 0x3fff;
			}
		}
	}
	
	final void LA(int i) {
		if ((anInt5746 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		anInt5727 = i;
		anInt5744 = 0;
	}
	
	final void method614(Class336 class336) {
		Class336_Sub2 class336_sub2 = (Class336_Sub2) class336;
		if (aClass300Array5782 != null) {
			for (int i = 0; i < aClass300Array5782.length; i++) {
				Class300 class300 = aClass300Array5782[i];
				Class300 class300_239_ = class300;
				if (class300.aClass300_3763 != null) {
					class300_239_ = class300.aClass300_3763;
				}
				class300_239_.anInt3769 = (int) (class336_sub2.aFloat8583 + (class336_sub2.aFloat8580 * (float) anIntArray5748[class300.anInt3764] + class336_sub2.aFloat8571 * (float) anIntArray5772[class300.anInt3764] + class336_sub2.aFloat8566 * (float) anIntArray5717[class300.anInt3764]));
				class300_239_.anInt3751 = (int) (class336_sub2.aFloat8579 + (class336_sub2.aFloat8578 * (float) anIntArray5748[class300.anInt3764] + class336_sub2.aFloat8561 * (float) anIntArray5772[class300.anInt3764] + class336_sub2.aFloat8558 * (float) anIntArray5717[class300.anInt3764]));
				class300_239_.anInt3753 = (int) (class336_sub2.aFloat8589 + (class336_sub2.aFloat8577 * (float) anIntArray5748[class300.anInt3764] + class336_sub2.aFloat8567 * (float) anIntArray5772[class300.anInt3764] + class336_sub2.aFloat8584 * (float) anIntArray5717[class300.anInt3764]));
				class300_239_.anInt3766 = (int) (class336_sub2.aFloat8583 + (class336_sub2.aFloat8580 * (float) anIntArray5748[class300.anInt3757] + class336_sub2.aFloat8571 * (float) anIntArray5772[class300.anInt3757] + class336_sub2.aFloat8566 * (float) anIntArray5717[class300.anInt3757]));
				class300_239_.anInt3756 = (int) (class336_sub2.aFloat8579 + (class336_sub2.aFloat8578 * (float) anIntArray5748[class300.anInt3757] + class336_sub2.aFloat8561 * (float) anIntArray5772[class300.anInt3757] + class336_sub2.aFloat8558 * (float) anIntArray5717[class300.anInt3757]));
				class300_239_.anInt3758 = (int) (class336_sub2.aFloat8589 + (class336_sub2.aFloat8577 * (float) anIntArray5748[class300.anInt3757] + class336_sub2.aFloat8567 * (float) anIntArray5772[class300.anInt3757] + class336_sub2.aFloat8584 * (float) anIntArray5717[class300.anInt3757]));
				class300_239_.anInt3761 = (int) (class336_sub2.aFloat8583 + (class336_sub2.aFloat8580 * (float) anIntArray5748[class300.anInt3754] + class336_sub2.aFloat8571 * (float) anIntArray5772[class300.anInt3754] + class336_sub2.aFloat8566 * (float) anIntArray5717[class300.anInt3754]));
				class300_239_.anInt3752 = (int) (class336_sub2.aFloat8579 + (class336_sub2.aFloat8578 * (float) anIntArray5748[class300.anInt3754] + class336_sub2.aFloat8561 * (float) anIntArray5772[class300.anInt3754] + class336_sub2.aFloat8558 * (float) anIntArray5717[class300.anInt3754]));
				class300_239_.anInt3771 = (int) (class336_sub2.aFloat8589 + (class336_sub2.aFloat8577 * (float) anIntArray5748[class300.anInt3754] + class336_sub2.aFloat8567 * (float) anIntArray5772[class300.anInt3754] + class336_sub2.aFloat8584 * (float) anIntArray5717[class300.anInt3754]));
			}
		}
		if (aClass218Array5764 != null) {
			for (int i = 0; i < aClass218Array5764.length; i++) {
				Class218 class218 = aClass218Array5764[i];
				Class218 class218_240_ = class218;
				if (class218.aClass218_2561 != null) {
					class218_240_ = class218.aClass218_2561;
				}
				if (class218.aClass336_2562 != null) {
					class218.aClass336_2562.method3857(class336_sub2);
				} else {
					class218.aClass336_2562 = class336_sub2.method3858();
				}
				class218_240_.anInt2559 = (int) (class336_sub2.aFloat8583 + (class336_sub2.aFloat8580 * (float) anIntArray5748[class218.anInt2554] + class336_sub2.aFloat8571 * (float) anIntArray5772[class218.anInt2554] + class336_sub2.aFloat8566 * (float) anIntArray5717[class218.anInt2554]));
				class218_240_.anInt2557 = (int) (class336_sub2.aFloat8579 + (class336_sub2.aFloat8578 * (float) anIntArray5748[class218.anInt2554] + class336_sub2.aFloat8561 * (float) anIntArray5772[class218.anInt2554] + class336_sub2.aFloat8558 * (float) anIntArray5717[class218.anInt2554]));
				class218_240_.anInt2556 = (int) (class336_sub2.aFloat8589 + (class336_sub2.aFloat8577 * (float) anIntArray5748[class218.anInt2554] + class336_sub2.aFloat8567 * (float) anIntArray5772[class218.anInt2554] + class336_sub2.aFloat8584 * (float) anIntArray5717[class218.anInt2554]));
			}
		}
	}
	
	private final void method660(int i, boolean bool, boolean bool_241_) {
		if (anIntArray5761[i] != -2) {
			short s = aShortArray5767[i];
			short s_242_ = aShortArray5731[i];
			short s_243_ = aShortArray5789[i];
			int i_244_ = anIntArray5713[s];
			int i_245_ = anIntArray5713[s_242_];
			int i_246_ = anIntArray5713[s_243_];
			if (bool && (i_244_ == -5000 || i_245_ == -5000 || i_246_ == -5000)) {
				int i_247_ = anIntArray5714[s];
				int i_248_ = anIntArray5714[s_242_];
				int i_249_ = anIntArray5714[s_243_];
				int i_250_ = anIntArray5728[s];
				int i_251_ = anIntArray5728[s_242_];
				int i_252_ = anIntArray5728[s_243_];
				int i_253_ = anIntArray5721[s];
				int i_254_ = anIntArray5721[s_242_];
				int i_255_ = anIntArray5721[s_243_];
				i_247_ -= i_248_;
				i_249_ -= i_248_;
				i_250_ -= i_251_;
				i_252_ -= i_251_;
				i_253_ -= i_254_;
				i_255_ -= i_254_;
				int i_256_ = i_250_ * i_255_ - i_253_ * i_252_;
				int i_257_ = i_253_ * i_249_ - i_247_ * i_255_;
				int i_258_ = i_247_ * i_252_ - i_250_ * i_249_;
				if (i_248_ * i_256_ + i_251_ * i_257_ + i_254_ * i_258_ > 0) {
					method670(i);
				}
			} else if (anIntArray5756[i] != -1 || (i_244_ - i_245_) * (anIntArray5716[s_243_] - anIntArray5716[s_242_]) - (anIntArray5716[s] - anIntArray5716[s_242_]) * (i_246_ - i_245_) > 0) {
                aClass185_5712.aBoolean2217 = i_244_ < 0 || i_245_ < 0 || i_246_ < 0 || i_244_ > aClass374_5741.anInt4635 || i_245_ > aClass374_5741.anInt4635 || i_246_ > aClass374_5741.anInt4635;
				if (bool_241_) {
					int i_259_ = anIntArray5756[i];
					if (i_259_ == -1 || !aClass209Array5790[i_259_].aBoolean2495) {
						method654(i);
					}
				} else {
					int i_260_ = anIntArray5756[i];
					if (i_260_ != -1) {
						Class209 class209 = aClass209Array5790[i_260_];
						Class214 class214 = aClass214Array5765[i_260_];
						if (!class209.aBoolean2495) {
							method669(i);
						}
						aPureJavaToolkit5770.method1504(class214.anInt2515, class214.anInt2521, class214.anInt2518, class214.anInt2526, class214.anInt2514, class214.anInt2525, class209.aShort2488 & 0xffff, class214.anInt2519, class209.aByte2489, class209.aByte2487);
					} else {
						method669(i);
					}
				}
			}
		}
	}
	
	private final void method661() {
		if (anInt5744 == 0) {
			method655(false);
		} else if (aPureJavaToolkit5770.anInt6795 > 1) {
			synchronized (this) {
				method679();
			}
		} else {
			method679();
		}
	}
	
	final void method636(byte b, byte[] bs) {
		if ((anInt5746 & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (aByteArray5784 == null) {
			aByteArray5784 = new byte[anInt5711];
		}
		if (bs == null) {
			for (int i = 0; i < anInt5711; i++)
				aByteArray5784[i] = b;
		} else {
			for (int i = 0; i < anInt5711; i++) {
				int i_261_ = 255 - (255 - (bs[i] & 0xff)) * (255 - (b & 0xff)) / 255;
				aByteArray5784[i] = (byte) i_261_;
			}
		}
		if (anInt5744 == 2) {
			anInt5744 = 1;
		}
	}
	
	final Class300[] method620() {
		return aClass300Array5782;
	}
	
	final void ia(short s, short s_262_) {
		for (int i = 0; i < anInt5711; i++) {
			if (aShortArray5740[i] == s) {
				aShortArray5740[i] = s_262_;
			}
		}
		if (aClass209Array5790 != null) {
			for (int i = 0; i < anInt5762; i++) {
				Class209 class209 = aClass209Array5790[i];
				Class214 class214 = aClass214Array5765[i];
				class214.anInt2519 = class214.anInt2519 & ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aShortArray5740[class209.anInt2485]) & 0xffff] & 0xffffff;
			}
		}
		if (anInt5744 == 2) {
			anInt5744 = 1;
		}
	}
	
	final boolean method621(int i, int i_263_, Class336 class336, boolean bool, int i_264_, int i_265_) {
		return method665(i, i_263_, class336, bool, i_264_, i_265_);
	}
	
	private final void method662() {
		aClass354Array5774 = new Class354[anInt5753];
		for (int i = 0; i < anInt5753; i++)
			aClass354Array5774[i] = new Class354();
		for (int i = 0; i < anInt5711; i++) {
			short s = aShortArray5767[i];
			short s_266_ = aShortArray5731[i];
			short s_267_ = aShortArray5789[i];
			int i_268_ = anIntArray5748[s_266_] - anIntArray5748[s];
			int i_269_ = anIntArray5772[s_266_] - anIntArray5772[s];
			int i_270_ = anIntArray5717[s_266_] - anIntArray5717[s];
			int i_271_ = anIntArray5748[s_267_] - anIntArray5748[s];
			int i_272_ = anIntArray5772[s_267_] - anIntArray5772[s];
			int i_273_ = anIntArray5717[s_267_] - anIntArray5717[s];
			int i_274_ = i_269_ * i_273_ - i_272_ * i_270_;
			int i_275_ = i_270_ * i_271_ - i_273_ * i_268_;
			int i_276_;
			for (i_276_ = i_268_ * i_272_ - i_271_ * i_269_; i_274_ > 8192 || i_275_ > 8192 || i_276_ > 8192 || i_274_ < -8192 || i_275_ < -8192 || i_276_ < -8192; i_276_ >>= 1) {
				i_274_ >>= 1;
				i_275_ >>= 1;
			}
			int i_277_ = (int) Math.sqrt((double) (i_274_ * i_274_ + i_275_ * i_275_ + i_276_ * i_276_));
			if (i_277_ <= 0) {
				i_277_ = 1;
			}
			i_274_ = i_274_ * 256 / i_277_;
			i_275_ = i_275_ * 256 / i_277_;
			i_276_ = i_276_ * 256 / i_277_;
			byte b;
			if (aByteArray5736 == null) {
				b = (byte) 0;
			} else {
				b = aByteArray5736[i];
			}
			if (b == 0) {
				Class354 class354 = aClass354Array5774[s];
				class354.anInt4347 += i_274_;
				class354.anInt4348 += i_275_;
				class354.anInt4346 += i_276_;
				class354.anInt4345++;
				class354 = aClass354Array5774[s_266_];
				class354.anInt4347 += i_274_;
				class354.anInt4348 += i_275_;
				class354.anInt4346 += i_276_;
				class354.anInt4345++;
				class354 = aClass354Array5774[s_267_];
				class354.anInt4347 += i_274_;
				class354.anInt4348 += i_275_;
				class354.anInt4346 += i_276_;
				class354.anInt4345++;
			} else if (b == 1) {
				if (aClass272Array5775 == null) {
					aClass272Array5775 = new Class272[anInt5711];
				}
				Class272 class272 = aClass272Array5775[i] = new Class272();
				class272.anInt3484 = i_274_;
				class272.anInt3485 = i_275_;
				class272.anInt3483 = i_276_;
			}
		}
	}
	
	final void method622(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i, int i_278_) {
		method680(class336, entitynode_sub5, i, i_278_);
	}
	
	final Class218[] method618() {
		return aClass218Array5764;
	}
	
	private final void method663() {
		synchronized (this) {
			for (int i = 0; i < anInt5753; i++) {
				int i_279_ = anIntArray5748[i];
				anIntArray5748[i] = anIntArray5717[i];
				anIntArray5717[i] = -i_279_;
				if (aClass354Array5774[i] != null) {
					i_279_ = aClass354Array5774[i].anInt4347;
					aClass354Array5774[i].anInt4347 = aClass354Array5774[i].anInt4346;
					aClass354Array5774[i].anInt4346 = -i_279_;
				}
			}
			if (aClass272Array5775 != null) {
				for (int i = 0; i < anInt5711; i++) {
					if (aClass272Array5775[i] != null) {
						int i_280_ = aClass272Array5775[i].anInt3484;
						aClass272Array5775[i].anInt3484 = aClass272Array5775[i].anInt3483;
						aClass272Array5775[i].anInt3483 = -i_280_;
					}
				}
			}
			for (int i = anInt5753; i < anInt5718; i++) {
				int i_281_ = anIntArray5748[i];
				anIntArray5748[i] = anIntArray5717[i];
				anIntArray5717[i] = -i_281_;
			}
			anInt5744 = 0;
			aBoolean5792 = false;
		}
	}
	
	final void method619(DrawableModel drawablemodel, int i, int i_282_, int i_283_, boolean bool) {
		PureJavaDrawableModel purejavadrawablemodel_284_ = (PureJavaDrawableModel) drawablemodel;
		if ((anInt5746 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		if ((purejavadrawablemodel_284_.anInt5746 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		method671(Thread.currentThread());
		method677();
		method675();
		purejavadrawablemodel_284_.method677();
		purejavadrawablemodel_284_.method675();
		anInt5780++;
		int i_285_ = 0;
		int[] is = purejavadrawablemodel_284_.anIntArray5748;
		int i_286_ = purejavadrawablemodel_284_.anInt5753;
		for (int i_287_ = 0; i_287_ < anInt5753; i_287_++) {
			Class354 class354 = aClass354Array5774[i_287_];
			if (class354.anInt4345 != 0) {
				int i_288_ = anIntArray5772[i_287_] - i_282_;
				if (i_288_ >= purejavadrawablemodel_284_.aShort5759 && i_288_ <= purejavadrawablemodel_284_.aShort5751) {
					int i_289_ = anIntArray5748[i_287_] - i;
					if (i_289_ >= purejavadrawablemodel_284_.aShort5757 && i_289_ <= purejavadrawablemodel_284_.aShort5766) {
						int i_290_ = anIntArray5717[i_287_] - i_283_;
						if (i_290_ >= purejavadrawablemodel_284_.aShort5732 && i_290_ <= purejavadrawablemodel_284_.aShort5730) {
							for (int i_291_ = 0; i_291_ < i_286_; i_291_++) {
								Class354 class354_292_ = purejavadrawablemodel_284_.aClass354Array5774[i_291_];
								if (i_289_ == is[i_291_] && i_290_ == purejavadrawablemodel_284_.anIntArray5717[i_291_] && i_288_ == purejavadrawablemodel_284_.anIntArray5772[i_291_] && class354_292_.anInt4345 != 0) {
									if (aClass354Array5735 == null) {
										aClass354Array5735 = new Class354[anInt5753];
									}
									if (purejavadrawablemodel_284_.aClass354Array5735 == null) {
										purejavadrawablemodel_284_.aClass354Array5735 = new Class354[i_286_];
									}
									Class354 class354_293_ = aClass354Array5735[i_287_];
									if (class354_293_ == null) {
										class354_293_ = aClass354Array5735[i_287_] = new Class354(class354);
									}
									Class354 class354_294_ = purejavadrawablemodel_284_.aClass354Array5735[i_291_];
									if (class354_294_ == null) {
										class354_294_ = purejavadrawablemodel_284_.aClass354Array5735[i_291_] = new Class354(class354_292_);
									}
									class354_293_.anInt4347 += class354_292_.anInt4347;
									class354_293_.anInt4348 += class354_292_.anInt4348;
									class354_293_.anInt4346 += class354_292_.anInt4346;
									class354_293_.anInt4345 += class354_292_.anInt4345;
									class354_294_.anInt4347 += class354.anInt4347;
									class354_294_.anInt4348 += class354.anInt4348;
									class354_294_.anInt4346 += class354.anInt4346;
									class354_294_.anInt4345 += class354.anInt4345;
									i_285_++;
									anIntArray5771[i_287_] = anInt5780;
									anIntArray5749[i_291_] = anInt5780;
								}
							}
						}
					}
				}
			}
		}
		if (i_285_ >= 3 && bool) {
			for (int i_295_ = 0; i_295_ < anInt5711; i_295_++) {
				if (anIntArray5771[aShortArray5767[i_295_]] == anInt5780 && anIntArray5771[aShortArray5731[i_295_]] == anInt5780 && anIntArray5771[aShortArray5789[i_295_]] == anInt5780) {
					if (aByteArray5736 == null) {
						aByteArray5736 = new byte[anInt5711];
					}
					aByteArray5736[i_295_] = (byte) 2;
				}
			}
			for (int i_296_ = 0; i_296_ < purejavadrawablemodel_284_.anInt5711; i_296_++) {
				if (anIntArray5749[purejavadrawablemodel_284_.aShortArray5767[i_296_]] == anInt5780 && anIntArray5749[purejavadrawablemodel_284_.aShortArray5731[i_296_]] == anInt5780 && anIntArray5749[purejavadrawablemodel_284_.aShortArray5789[i_296_]] == anInt5780) {
					if (purejavadrawablemodel_284_.aByteArray5736 == null) {
						purejavadrawablemodel_284_.aByteArray5736 = new byte[purejavadrawablemodel_284_.anInt5711];
					}
					purejavadrawablemodel_284_.aByteArray5736[i_296_] = (byte) 2;
				}
			}
		}
	}
	
	final boolean F() {
		return aBoolean5720;
	}
	
	final void H(int i, int i_297_, int i_298_) {
		if (i != 0 && (anInt5746 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (i_297_ != 0 && (anInt5746 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (i_298_ != 0 && (anInt5746 & 0x4) != 4) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i_299_ = 0; i_299_ < anInt5718; i_299_++) {
				anIntArray5748[i_299_] += i;
				anIntArray5772[i_299_] += i_297_;
				anIntArray5717[i_299_] += i_298_;
			}
		}
	}
	
	final void method637(int i, int[] is, int i_300_, int i_301_, int i_302_, int i_303_, boolean bool) {
		int i_304_ = is.length;
		if (i == 0) {
			i_300_ <<= 4;
			i_301_ <<= 4;
			i_302_ <<= 4;
			if (!aBoolean5723) {
				for (int i_305_ = 0; i_305_ < anInt5718; i_305_++) {
					anIntArray5748[i_305_] <<= 4;
					anIntArray5772[i_305_] <<= 4;
					anIntArray5717[i_305_] <<= 4;
				}
				aBoolean5723 = true;
			}
			int i_306_ = 0;
			anInt5779 = 0;
			anInt5752 = 0;
			anInt5743 = 0;
			for (int i_307_ = 0; i_307_ < i_304_; i_307_++) {
				int i_308_ = is[i_307_];
				if (i_308_ < anIntArrayArray5722.length) {
					int[] is_309_ = anIntArrayArray5722[i_308_];
					for (int i_310_ = 0; i_310_ < is_309_.length; i_310_++) {
						int i_311_ = is_309_[i_310_];
						anInt5779 += anIntArray5748[i_311_];
						anInt5752 += anIntArray5772[i_311_];
						anInt5743 += anIntArray5717[i_311_];
						i_306_++;
					}
				}
			}
			if (i_306_ > 0) {
				anInt5779 = anInt5779 / i_306_ + i_300_;
				anInt5752 = anInt5752 / i_306_ + i_301_;
				anInt5743 = anInt5743 / i_306_ + i_302_;
			} else {
				anInt5779 = i_300_;
				anInt5752 = i_301_;
				anInt5743 = i_302_;
			}
		} else if (i == 1) {
			i_300_ <<= 4;
			i_301_ <<= 4;
			i_302_ <<= 4;
			if (!aBoolean5723) {
				for (int i_312_ = 0; i_312_ < anInt5718; i_312_++) {
					anIntArray5748[i_312_] <<= 4;
					anIntArray5772[i_312_] <<= 4;
					anIntArray5717[i_312_] <<= 4;
				}
				aBoolean5723 = true;
			}
			for (int i_313_ = 0; i_313_ < i_304_; i_313_++) {
				int i_314_ = is[i_313_];
				if (i_314_ < anIntArrayArray5722.length) {
					int[] is_315_ = anIntArrayArray5722[i_314_];
					for (int i_316_ = 0; i_316_ < is_315_.length; i_316_++) {
						int i_317_ = is_315_[i_316_];
						anIntArray5748[i_317_] += i_300_;
						anIntArray5772[i_317_] += i_301_;
						anIntArray5717[i_317_] += i_302_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_318_ = 0; i_318_ < i_304_; i_318_++) {
				int i_319_ = is[i_318_];
				if (i_319_ < anIntArrayArray5722.length) {
					int[] is_320_ = anIntArrayArray5722[i_319_];
					if ((i_303_ & 0x1) == 0) {
						for (int i_321_ = 0; i_321_ < is_320_.length; i_321_++) {
							int i_322_ = is_320_[i_321_];
							anIntArray5748[i_322_] -= anInt5779;
							anIntArray5772[i_322_] -= anInt5752;
							anIntArray5717[i_322_] -= anInt5743;
							if (i_302_ != 0) {
								int i_323_ = Class335.anIntArray4167[i_302_];
								int i_324_ = Class335.anIntArray4165[i_302_];
								int i_325_ = anIntArray5772[i_322_] * i_323_ + anIntArray5748[i_322_] * i_324_ + 16383 >> 14;
								anIntArray5772[i_322_] = anIntArray5772[i_322_] * i_324_ - anIntArray5748[i_322_] * i_323_ + 16383 >> 14;
								anIntArray5748[i_322_] = i_325_;
							}
							if (i_300_ != 0) {
								int i_326_ = Class335.anIntArray4167[i_300_];
								int i_327_ = Class335.anIntArray4165[i_300_];
								int i_328_ = anIntArray5772[i_322_] * i_327_ - anIntArray5717[i_322_] * i_326_ + 16383 >> 14;
								anIntArray5717[i_322_] = anIntArray5772[i_322_] * i_326_ + anIntArray5717[i_322_] * i_327_ + 16383 >> 14;
								anIntArray5772[i_322_] = i_328_;
							}
							if (i_301_ != 0) {
								int i_329_ = Class335.anIntArray4167[i_301_];
								int i_330_ = Class335.anIntArray4165[i_301_];
								int i_331_ = anIntArray5717[i_322_] * i_329_ + anIntArray5748[i_322_] * i_330_ + 16383 >> 14;
								anIntArray5717[i_322_] = anIntArray5717[i_322_] * i_330_ - anIntArray5748[i_322_] * i_329_ + 16383 >> 14;
								anIntArray5748[i_322_] = i_331_;
							}
							anIntArray5748[i_322_] += anInt5779;
							anIntArray5772[i_322_] += anInt5752;
							anIntArray5717[i_322_] += anInt5743;
						}
					} else {
						for (int i_332_ = 0; i_332_ < is_320_.length; i_332_++) {
							int i_333_ = is_320_[i_332_];
							anIntArray5748[i_333_] -= anInt5779;
							anIntArray5772[i_333_] -= anInt5752;
							anIntArray5717[i_333_] -= anInt5743;
							if (i_300_ != 0) {
								int i_334_ = Class335.anIntArray4167[i_300_];
								int i_335_ = Class335.anIntArray4165[i_300_];
								int i_336_ = anIntArray5772[i_333_] * i_335_ - anIntArray5717[i_333_] * i_334_ + 16383 >> 14;
								anIntArray5717[i_333_] = anIntArray5772[i_333_] * i_334_ + anIntArray5717[i_333_] * i_335_ + 16383 >> 14;
								anIntArray5772[i_333_] = i_336_;
							}
							if (i_302_ != 0) {
								int i_337_ = Class335.anIntArray4167[i_302_];
								int i_338_ = Class335.anIntArray4165[i_302_];
								int i_339_ = anIntArray5772[i_333_] * i_337_ + anIntArray5748[i_333_] * i_338_ + 16383 >> 14;
								anIntArray5772[i_333_] = anIntArray5772[i_333_] * i_338_ - anIntArray5748[i_333_] * i_337_ + 16383 >> 14;
								anIntArray5748[i_333_] = i_339_;
							}
							if (i_301_ != 0) {
								int i_340_ = Class335.anIntArray4167[i_301_];
								int i_341_ = Class335.anIntArray4165[i_301_];
								int i_342_ = anIntArray5717[i_333_] * i_340_ + anIntArray5748[i_333_] * i_341_ + 16383 >> 14;
								anIntArray5717[i_333_] = anIntArray5717[i_333_] * i_341_ - anIntArray5748[i_333_] * i_340_ + 16383 >> 14;
								anIntArray5748[i_333_] = i_342_;
							}
							anIntArray5748[i_333_] += anInt5779;
							anIntArray5772[i_333_] += anInt5752;
							anIntArray5717[i_333_] += anInt5743;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_343_ = 0; i_343_ < i_304_; i_343_++) {
				int i_344_ = is[i_343_];
				if (i_344_ < anIntArrayArray5722.length) {
					int[] is_345_ = anIntArrayArray5722[i_344_];
					for (int i_346_ = 0; i_346_ < is_345_.length; i_346_++) {
						int i_347_ = is_345_[i_346_];
						anIntArray5748[i_347_] -= anInt5779;
						anIntArray5772[i_347_] -= anInt5752;
						anIntArray5717[i_347_] -= anInt5743;
						anIntArray5748[i_347_] = anIntArray5748[i_347_] * i_300_ / 128;
						anIntArray5772[i_347_] = anIntArray5772[i_347_] * i_301_ / 128;
						anIntArray5717[i_347_] = anIntArray5717[i_347_] * i_302_ / 128;
						anIntArray5748[i_347_] += anInt5779;
						anIntArray5772[i_347_] += anInt5752;
						anIntArray5717[i_347_] += anInt5743;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray5725 != null && aByteArray5784 != null) {
				for (int i_348_ = 0; i_348_ < i_304_; i_348_++) {
					int i_349_ = is[i_348_];
					if (i_349_ < anIntArrayArray5725.length) {
						int[] is_350_ = anIntArrayArray5725[i_349_];
						for (int i_351_ = 0; i_351_ < is_350_.length; i_351_++) {
							int i_352_ = is_350_[i_351_];
							int i_353_ = (aByteArray5784[i_352_] & 0xff) + i_300_ * 8;
							if (i_353_ < 0) {
								i_353_ = 0;
							} else if (i_353_ > 255) {
								i_353_ = 255;
							}
							aByteArray5784[i_352_] = (byte) i_353_;
						}
					}
				}
				if (aClass209Array5790 != null) {
					for (int i_354_ = 0; i_354_ < anInt5762; i_354_++) {
						Class209 class209 = aClass209Array5790[i_354_];
						Class214 class214 = aClass214Array5765[i_354_];
						class214.anInt2519 = class214.anInt2519 & 0xffffff | 255 - (aByteArray5784[class209.anInt2485] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray5725 != null) {
				for (int i_355_ = 0; i_355_ < i_304_; i_355_++) {
					int i_356_ = is[i_355_];
					if (i_356_ < anIntArrayArray5725.length) {
						int[] is_357_ = anIntArrayArray5725[i_356_];
						for (int i_358_ = 0; i_358_ < is_357_.length; i_358_++) {
							int i_359_ = is_357_[i_358_];
							int i_360_ = aShortArray5740[i_359_] & 0xffff;
							int i_361_ = i_360_ >> 10 & 0x3f;
							int i_362_ = i_360_ >> 7 & 0x7;
							int i_363_ = i_360_ & 0x7f;
							i_361_ = i_361_ + i_300_ & 0x3f;
							i_362_ += i_301_;
							if (i_362_ < 0) {
								i_362_ = 0;
							} else if (i_362_ > 7) {
								i_362_ = 7;
							}
							i_363_ += i_302_;
							if (i_363_ < 0) {
								i_363_ = 0;
							} else if (i_363_ > 127) {
								i_363_ = 127;
							}
							aShortArray5740[i_359_] = (short) (i_361_ << 10 | i_362_ << 7 | i_363_);
						}
						aBoolean5786 = true;
					}
				}
				if (aClass209Array5790 != null) {
					for (int i_364_ = 0; i_364_ < anInt5762; i_364_++) {
						Class209 class209 = aClass209Array5790[i_364_];
						Class214 class214 = aClass214Array5765[i_364_];
						class214.anInt2519 = class214.anInt2519 & ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, aShortArray5740[class209.anInt2485] & 0xffff) & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray5783 != null) {
				for (int i_365_ = 0; i_365_ < i_304_; i_365_++) {
					int i_366_ = is[i_365_];
					if (i_366_ < anIntArrayArray5783.length) {
						int[] is_367_ = anIntArrayArray5783[i_366_];
						for (int i_368_ = 0; i_368_ < is_367_.length; i_368_++) {
							Class214 class214 = aClass214Array5765[is_367_[i_368_]];
							class214.anInt2516 += i_300_;
							class214.anInt2523 += i_301_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray5783 != null) {
				for (int i_369_ = 0; i_369_ < i_304_; i_369_++) {
					int i_370_ = is[i_369_];
					if (i_370_ < anIntArrayArray5783.length) {
						int[] is_371_ = anIntArrayArray5783[i_370_];
						for (int i_372_ = 0; i_372_ < is_371_.length; i_372_++) {
							Class214 class214 = aClass214Array5765[is_371_[i_372_]];
							class214.anInt2517 = class214.anInt2517 * i_300_ >> 7;
							class214.anInt2520 = class214.anInt2520 * i_301_ >> 7;
						}
					}
				}
			}
		} else if (i == 9 && anIntArrayArray5783 != null) {
			for (int i_373_ = 0; i_373_ < i_304_; i_373_++) {
				int i_374_ = is[i_373_];
				if (i_374_ < anIntArrayArray5783.length) {
					int[] is_375_ = anIntArrayArray5783[i_374_];
					for (int i_376_ = 0; i_376_ < is_375_.length; i_376_++) {
						Class214 class214 = aClass214Array5765[is_375_[i_376_]];
						class214.anInt2525 = class214.anInt2525 + i_300_ & 0x3fff;
					}
				}
			}
		}
	}
	
	private final void method664(boolean bool) {
		if (anInt5744 == 1) {
			method661();
		} else if (anInt5744 == 2) {
			if ((anInt5746 & 0x97098) == 0 && aFloatArrayArray5763 == null) {
				aShortArray5740 = null;
			}
			if (bool) {
				aByteArray5736 = null;
			}
		} else {
			method675();
			int i = aPureJavaToolkit5770.anInt6764;
			int i_377_ = aPureJavaToolkit5770.anInt6784;
			int i_378_ = aPureJavaToolkit5770.anInt6774;
			int i_379_ = aPureJavaToolkit5770.anInt6780 >> 8;
			int i_380_ = aPureJavaToolkit5770.anInt6766 * 768 / anInt5727;
			int i_381_ = aPureJavaToolkit5770.anInt6761 * 768 / anInt5727;
			if (anIntArray5754 == null) {
				anIntArray5754 = new int[anInt5711];
				anIntArray5739 = new int[anInt5711];
				anIntArray5761 = new int[anInt5711];
			}
			for (int i_382_ = 0; i_382_ < anInt5711; i_382_++) {
				byte b;
				if (aByteArray5736 == null) {
					b = (byte) 0;
				} else {
					b = aByteArray5736[i_382_];
				}
				byte b_383_;
				if (aByteArray5784 == null) {
					b_383_ = (byte) 0;
				} else {
					b_383_ = aByteArray5784[i_382_];
				}
				short s;
				if (aShortArray5773 == null) {
					s = (short) -1;
				} else {
					s = aShortArray5773[i_382_];
				}
				if (b_383_ == -2) {
					b = (byte) 3;
				}
				if (b_383_ == -1) {
					b = (byte) 2;
				}
				if (s == -1) {
					if (b == 0) {
						int i_384_ = aShortArray5740[i_382_] & 0xffff;
						int i_385_ = (i_384_ & 0x7f) * anInt5791 >> 7;
						short s_386_ = Node_Sub15_Sub2.method2560(5310, i_384_ & ~0x7f | i_385_);
						Class354 class354;
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5767[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5767[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5767[i_382_]];
						}
						int i_387_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						int i_388_ = i_387_ > 256 ? i_380_ : i_381_;
						int i_389_ = (i_379_ >> 1) + (i_388_ * i_387_ >> 17);
						anIntArray5754[i_382_] = i_389_ << 17 | Node_Sub18.method2607((byte) 31, i_389_, s_386_);
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5731[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5731[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5731[i_382_]];
						}
						i_387_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						i_388_ = i_387_ > 256 ? i_380_ : i_381_;
						i_389_ = (i_379_ >> 1) + (i_388_ * i_387_ >> 17);
						anIntArray5739[i_382_] = i_389_ << 17 | Node_Sub18.method2607((byte) 31, i_389_, s_386_);
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5789[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5789[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5789[i_382_]];
						}
						i_387_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						i_388_ = i_387_ > 256 ? i_380_ : i_381_;
						i_389_ = (i_379_ >> 1) + (i_388_ * i_387_ >> 17);
						anIntArray5761[i_382_] = i_389_ << 17 | Node_Sub18.method2607((byte) 31, i_389_, s_386_);
					} else if (b == 1) {
						int i_390_ = aShortArray5740[i_382_] & 0xffff;
						int i_391_ = (i_390_ & 0x7f) * anInt5791 >> 7;
						short s_392_ = Node_Sub15_Sub2.method2560(5310, i_390_ & ~0x7f | i_391_);
						Class272 class272 = aClass272Array5775[i_382_];
						int i_393_ = i * class272.anInt3484 + i_377_ * class272.anInt3485 + i_378_ * class272.anInt3483 >> 16;
						int i_394_ = i_393_ > 256 ? i_380_ : i_381_;
						int i_395_ = (i_379_ >> 1) + (i_394_ * i_393_ >> 17);
						anIntArray5754[i_382_] = i_395_ << 17 | Node_Sub18.method2607((byte) 31, i_395_, s_392_);
						anIntArray5761[i_382_] = -1;
					} else if (b == 3) {
						anIntArray5754[i_382_] = 128;
						anIntArray5761[i_382_] = -1;
					} else {
						anIntArray5761[i_382_] = -2;
					}
				} else {
					int i_396_ = aShortArray5740[i_382_] & 0xffff;
					if (b == 0) {
						Class354 class354;
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5767[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5767[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5767[i_382_]];
						}
						int i_397_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						int i_398_ = i_397_ > 256 ? i_380_ : i_381_;
						int i_399_ = method676((i_379_ >> 2) + (i_398_ * i_397_ >> 18));
						anIntArray5754[i_382_] = i_399_ << 24 | method683(i_396_, s, i_399_);
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5731[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5731[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5731[i_382_]];
						}
						i_397_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						i_398_ = i_397_ > 256 ? i_380_ : i_381_;
						i_399_ = method676((i_379_ >> 2) + (i_398_ * i_397_ >> 18));
						anIntArray5739[i_382_] = i_399_ << 24 | method683(i_396_, s, i_399_);
						if (aClass354Array5735 != null && aClass354Array5735[aShortArray5789[i_382_]] != null) {
							class354 = aClass354Array5735[aShortArray5789[i_382_]];
						} else {
							class354 = aClass354Array5774[aShortArray5789[i_382_]];
						}
						i_397_ = (i * class354.anInt4347 + i_377_ * class354.anInt4348 + i_378_ * class354.anInt4346) / class354.anInt4345 >> 16;
						i_398_ = i_397_ > 256 ? i_380_ : i_381_;
						i_399_ = method676((i_379_ >> 2) + (i_398_ * i_397_ >> 18));
						anIntArray5761[i_382_] = i_399_ << 24 | method683(i_396_, s, i_399_);
					} else if (b == 1) {
						Class272 class272 = aClass272Array5775[i_382_];
						int i_400_ = i * class272.anInt3484 + i_377_ * class272.anInt3485 + i_378_ * class272.anInt3483 >> 16;
						int i_401_ = i_400_ > 256 ? i_380_ : i_381_;
						int i_402_ = method676((i_379_ >> 2) + (i_401_ * i_400_ >> 18));
						anIntArray5754[i_382_] = i_402_ << 24 | method683(i_396_, s, i_402_);
						anIntArray5761[i_382_] = -1;
					} else {
						anIntArray5761[i_382_] = -2;
					}
				}
			}
			aClass354Array5774 = null;
			aClass354Array5735 = null;
			aClass272Array5775 = null;
			if ((anInt5746 & 0x97098) == 0 && aFloatArrayArray5763 == null) {
				aShortArray5740 = null;
			}
			if (bool) {
				aByteArray5736 = null;
			}
			anInt5744 = 2;
		}
	}
	
	final void wa() {
		if (aBoolean5723) {
			for (int i = 0; i < anInt5718; i++) {
				anIntArray5748[i] = anIntArray5748[i] + 7 >> 4;
				anIntArray5772[i] = anIntArray5772[i] + 7 >> 4;
				anIntArray5717[i] = anIntArray5717[i] + 7 >> 4;
			}
			aBoolean5723 = false;
		}
		if (aBoolean5786) {
			method661();
			aBoolean5786 = false;
		}
		aBoolean5792 = false;
	}
	
	private final boolean method665(int i, int i_403_, Class336 class336, boolean bool, int i_404_, int i_405_) {
		aClass336_Sub2_5778 = (Class336_Sub2) class336;
		Class336_Sub2 class336_sub2 = aPureJavaToolkit5770.aClass336_Sub2_6788;
		float f = class336_sub2.aFloat8583 + (class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8589);
		float f_406_ = class336_sub2.aFloat8579 + (class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8589);
		float f_407_ = class336_sub2.aFloat8589 + (class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8589);
		float f_408_ = class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8577;
		float f_409_ = class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8567;
		float f_410_ = class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8584;
		float f_411_ = class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8577;
		float f_412_ = class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8567;
		float f_413_ = class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8584;
		float f_414_ = class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8577;
		float f_415_ = class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8567;
		float f_416_ = class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8584;
		boolean bool_417_ = false;
		int i_418_ = aPureJavaToolkit5770.anInt6786;
		int i_419_ = aPureJavaToolkit5770.anInt6769;
		int i_420_ = aPureJavaToolkit5770.anInt6785;
		int i_421_ = aPureJavaToolkit5770.anInt6763;
		int i_422_ = 2147483647;
		int i_423_ = -2147483648;
		int i_424_ = 2147483647;
		int i_425_ = -2147483648;
		method671(Thread.currentThread());
		if (!aBoolean5792) {
			method677();
		}
		int i_426_ = aShort5766 - aShort5757 >> 1;
		int i_427_ = aShort5751 - aShort5759 >> 1;
		int i_428_ = aShort5730 - aShort5732 >> 1;
		int i_429_ = aShort5757 + i_426_;
		int i_430_ = aShort5759 + i_427_;
		int i_431_ = aShort5732 + i_428_;
		int i_432_ = i_429_ - (i_426_ << i_404_);
		int i_433_ = i_430_ - (i_427_ << i_404_);
		int i_434_ = i_431_ - (i_428_ << i_404_);
		int i_435_ = i_429_ + (i_426_ << i_404_);
		int i_436_ = i_430_ + (i_427_ << i_404_);
		int i_437_ = i_431_ + (i_428_ << i_404_);
		anIntArray5737[0] = i_432_;
		anIntArray5745[0] = i_433_;
		anIntArray5729[0] = i_434_;
		anIntArray5737[1] = i_435_;
		anIntArray5745[1] = i_433_;
		anIntArray5729[1] = i_434_;
		anIntArray5737[2] = i_432_;
		anIntArray5745[2] = i_436_;
		anIntArray5729[2] = i_434_;
		anIntArray5737[3] = i_435_;
		anIntArray5745[3] = i_436_;
		anIntArray5729[3] = i_434_;
		anIntArray5737[4] = i_432_;
		anIntArray5745[4] = i_433_;
		anIntArray5729[4] = i_437_;
		anIntArray5737[5] = i_435_;
		anIntArray5745[5] = i_433_;
		anIntArray5729[5] = i_437_;
		anIntArray5737[6] = i_432_;
		anIntArray5745[6] = i_436_;
		anIntArray5729[6] = i_437_;
		anIntArray5737[7] = i_435_;
		anIntArray5745[7] = i_436_;
		anIntArray5729[7] = i_437_;
		for (int i_438_ = 0; i_438_ < 8; i_438_++) {
			int i_439_ = anIntArray5737[i_438_];
			int i_440_ = anIntArray5745[i_438_];
			int i_441_ = anIntArray5729[i_438_];
			float f_442_ = f + (f_408_ * (float) i_439_ + f_409_ * (float) i_440_ + f_410_ * (float) i_441_);
			float f_443_ = f_406_ + (f_411_ * (float) i_439_ + f_412_ * (float) i_440_ + f_413_ * (float) i_441_);
			float f_444_ = f_407_ + (f_414_ * (float) i_439_ + f_415_ * (float) i_440_ + f_416_ * (float) i_441_);
			if (f_444_ >= (float) aPureJavaToolkit5770.anInt6798) {
				if (i_405_ > 0) {
					f_444_ = (float) i_405_;
				}
				int i_445_ = i_418_ + (int) (f_442_ * (float) i_420_ / f_444_);
				int i_446_ = i_419_ + (int) (f_443_ * (float) i_421_ / f_444_);
				if (i_445_ < i_422_) {
					i_422_ = i_445_;
				}
				if (i_445_ > i_423_) {
					i_423_ = i_445_;
				}
				if (i_446_ < i_424_) {
					i_424_ = i_446_;
				}
				if (i_446_ > i_425_) {
					i_425_ = i_446_;
				}
				bool_417_ = true;
			}
		}
		if (bool_417_ && i > i_422_ && i < i_423_ && i_403_ > i_424_ && i_403_ < i_425_) {
			if (bool) {
				return true;
			}
			for (int i_447_ = 0; i_447_ < anInt5718; i_447_++) {
				int i_448_ = anIntArray5748[i_447_];
				int i_449_ = anIntArray5772[i_447_];
				int i_450_ = anIntArray5717[i_447_];
				float f_451_ = f + (f_408_ * (float) i_448_ + f_409_ * (float) i_449_ + f_410_ * (float) i_450_);
				float f_452_ = f_406_ + (f_411_ * (float) i_448_ + f_412_ * (float) i_449_ + f_413_ * (float) i_450_);
				float f_453_ = f_407_ + (f_414_ * (float) i_448_ + f_415_ * (float) i_449_ + f_416_ * (float) i_450_);
				if (f_453_ >= (float) aPureJavaToolkit5770.anInt6798) {
					if (i_405_ > 0) {
						f_453_ = (float) i_405_;
					}
					anIntArray5713[i_447_] = i_418_ + (int) (f_451_ * (float) i_420_ / f_453_);
					anIntArray5716[i_447_] = i_419_ + (int) (f_452_ * (float) i_421_ / f_453_);
				} else {
					anIntArray5713[i_447_] = -999999;
				}
			}
			for (int i_454_ = 0; i_454_ < anInt5711; i_454_++) {
				if (anIntArray5713[aShortArray5767[i_454_]] != -999999 && anIntArray5713[aShortArray5731[i_454_]] != -999999 && anIntArray5713[aShortArray5789[i_454_]] != -999999 && method672(i, i_403_, anIntArray5716[aShortArray5767[i_454_]], anIntArray5716[aShortArray5731[i_454_]], anIntArray5716[aShortArray5789[i_454_]], anIntArray5713[aShortArray5767[i_454_]], anIntArray5713[aShortArray5731[i_454_]], anIntArray5713[aShortArray5789[i_454_]])) {
					return true;
				}
			}
		}
		return false;
	}
	
	private final DrawableModel method666(PureJavaDrawableModel purejavadrawablemodel_455_, PureJavaDrawableModel purejavadrawablemodel_456_, int i, boolean bool, boolean bool_457_) {
		purejavadrawablemodel_455_.aBoolean5792 = aBoolean5792;
		if (aBoolean5792) {
			purejavadrawablemodel_455_.aShort5766 = aShort5766;
			purejavadrawablemodel_455_.aShort5751 = aShort5751;
			purejavadrawablemodel_455_.aShort5730 = aShort5730;
			purejavadrawablemodel_455_.aShort5757 = aShort5757;
			purejavadrawablemodel_455_.aShort5759 = aShort5759;
			purejavadrawablemodel_455_.aShort5732 = aShort5732;
			purejavadrawablemodel_455_.aShort5777 = aShort5777;
			purejavadrawablemodel_455_.aShort5755 = aShort5755;
		}
		purejavadrawablemodel_455_.anInt5791 = anInt5791;
		purejavadrawablemodel_455_.anInt5727 = anInt5727;
		purejavadrawablemodel_455_.anInt5718 = anInt5718;
		purejavadrawablemodel_455_.anInt5753 = anInt5753;
		purejavadrawablemodel_455_.anInt5711 = anInt5711;
		purejavadrawablemodel_455_.anInt5762 = anInt5762;
		if ((i & 0x100) != 0) {
			purejavadrawablemodel_455_.aBoolean5720 = true;
		} else {
			purejavadrawablemodel_455_.aBoolean5720 = aBoolean5720;
		}
		purejavadrawablemodel_455_.aBoolean5788 = aBoolean5788;
		boolean bool_458_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_459_ = bool_458_ || (i & 0x1) != 0;
		boolean bool_460_ = bool_458_ || (i & 0x2) != 0;
		boolean bool_461_ = bool_458_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_459_ || bool_460_ || bool_461_) {
			if (bool_459_) {
				if (purejavadrawablemodel_456_.anIntArray5748 == null || purejavadrawablemodel_456_.anIntArray5748.length < anInt5718) {
					purejavadrawablemodel_455_.anIntArray5748 = purejavadrawablemodel_456_.anIntArray5748 = new int[anInt5718];
				} else {
					purejavadrawablemodel_455_.anIntArray5748 = purejavadrawablemodel_456_.anIntArray5748;
				}
				for (int i_462_ = 0; i_462_ < anInt5718; i_462_++)
					purejavadrawablemodel_455_.anIntArray5748[i_462_] = anIntArray5748[i_462_];
			} else {
				purejavadrawablemodel_455_.anIntArray5748 = anIntArray5748;
			}
			if (bool_460_) {
				if (purejavadrawablemodel_456_.anIntArray5772 == null || purejavadrawablemodel_456_.anIntArray5772.length < anInt5718) {
					purejavadrawablemodel_455_.anIntArray5772 = purejavadrawablemodel_456_.anIntArray5772 = new int[anInt5718];
				} else {
					purejavadrawablemodel_455_.anIntArray5772 = purejavadrawablemodel_456_.anIntArray5772;
				}
				for (int i_463_ = 0; i_463_ < anInt5718; i_463_++)
					purejavadrawablemodel_455_.anIntArray5772[i_463_] = anIntArray5772[i_463_];
			} else {
				purejavadrawablemodel_455_.anIntArray5772 = anIntArray5772;
			}
			if (bool_461_) {
				if (purejavadrawablemodel_456_.anIntArray5717 == null || purejavadrawablemodel_456_.anIntArray5717.length < anInt5718) {
					purejavadrawablemodel_455_.anIntArray5717 = purejavadrawablemodel_456_.anIntArray5717 = new int[anInt5718];
				} else {
					purejavadrawablemodel_455_.anIntArray5717 = purejavadrawablemodel_456_.anIntArray5717;
				}
				for (int i_464_ = 0; i_464_ < anInt5718; i_464_++)
					purejavadrawablemodel_455_.anIntArray5717[i_464_] = anIntArray5717[i_464_];
			} else {
				purejavadrawablemodel_455_.anIntArray5717 = anIntArray5717;
			}
		} else {
			purejavadrawablemodel_455_.anIntArray5748 = anIntArray5748;
			purejavadrawablemodel_455_.anIntArray5772 = anIntArray5772;
			purejavadrawablemodel_455_.anIntArray5717 = anIntArray5717;
		}
		if ((i & 0x84080) != 0) {
			if (purejavadrawablemodel_456_.aShortArray5740 == null || purejavadrawablemodel_456_.aShortArray5740.length < anInt5711) {
				int i_465_ = anInt5711;
				purejavadrawablemodel_455_.aShortArray5740 = purejavadrawablemodel_456_.aShortArray5740 = new short[i_465_];
			} else {
				purejavadrawablemodel_455_.aShortArray5740 = purejavadrawablemodel_456_.aShortArray5740;
			}
			for (int i_466_ = 0; i_466_ < anInt5711; i_466_++)
				purejavadrawablemodel_455_.aShortArray5740[i_466_] = aShortArray5740[i_466_];
		} else {
			purejavadrawablemodel_455_.aShortArray5740 = aShortArray5740;
		}
		if ((i & 0x97018) != 0) {
			purejavadrawablemodel_455_.anInt5744 = 0;
			purejavadrawablemodel_455_.anIntArray5754 = purejavadrawablemodel_455_.anIntArray5739 = purejavadrawablemodel_455_.anIntArray5761 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_457_) {
				method655(false);
			}
			if (anIntArray5754 != null) {
				if (purejavadrawablemodel_456_.anIntArray5754 == null || purejavadrawablemodel_456_.anIntArray5754.length < anInt5711) {
					int i_467_ = anInt5711;
					purejavadrawablemodel_455_.anIntArray5754 = purejavadrawablemodel_456_.anIntArray5754 = new int[i_467_];
					purejavadrawablemodel_455_.anIntArray5739 = purejavadrawablemodel_456_.anIntArray5739 = new int[i_467_];
					purejavadrawablemodel_455_.anIntArray5761 = purejavadrawablemodel_456_.anIntArray5761 = new int[i_467_];
				} else {
					purejavadrawablemodel_455_.anIntArray5754 = purejavadrawablemodel_456_.anIntArray5754;
					purejavadrawablemodel_455_.anIntArray5739 = purejavadrawablemodel_456_.anIntArray5739;
					purejavadrawablemodel_455_.anIntArray5761 = purejavadrawablemodel_456_.anIntArray5761;
				}
				for (int i_468_ = 0; i_468_ < anInt5711; i_468_++) {
					purejavadrawablemodel_455_.anIntArray5754[i_468_] = anIntArray5754[i_468_];
					purejavadrawablemodel_455_.anIntArray5739[i_468_] = anIntArray5739[i_468_];
					purejavadrawablemodel_455_.anIntArray5761[i_468_] = anIntArray5761[i_468_];
				}
			}
			purejavadrawablemodel_455_.anInt5744 = anInt5744;
		} else {
			if (bool_457_) {
				method655(false);
			}
			purejavadrawablemodel_455_.anIntArray5754 = anIntArray5754;
			purejavadrawablemodel_455_.anIntArray5739 = anIntArray5739;
			purejavadrawablemodel_455_.anIntArray5761 = anIntArray5761;
			purejavadrawablemodel_455_.anInt5744 = anInt5744;
		}
		if ((i & 0x100) != 0) {
			if (purejavadrawablemodel_456_.aByteArray5784 == null || purejavadrawablemodel_456_.aByteArray5784.length < anInt5711) {
				int i_469_ = anInt5711;
				purejavadrawablemodel_455_.aByteArray5784 = purejavadrawablemodel_456_.aByteArray5784 = new byte[i_469_];
			} else {
				purejavadrawablemodel_455_.aByteArray5784 = purejavadrawablemodel_456_.aByteArray5784;
			}
			if (aByteArray5784 != null) {
				for (int i_470_ = 0; i_470_ < anInt5711; i_470_++)
					purejavadrawablemodel_455_.aByteArray5784[i_470_] = aByteArray5784[i_470_];
			} else {
				for (int i_471_ = 0; i_471_ < anInt5711; i_471_++)
					purejavadrawablemodel_455_.aByteArray5784[i_471_] = (byte) 0;
			}
		} else {
			purejavadrawablemodel_455_.aByteArray5784 = aByteArray5784;
		}
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (purejavadrawablemodel_456_.aClass354Array5774 == null || purejavadrawablemodel_456_.aClass354Array5774.length < anInt5753) {
				int i_472_ = anInt5753;
				purejavadrawablemodel_455_.aClass354Array5774 = purejavadrawablemodel_456_.aClass354Array5774 = new Class354[i_472_];
			} else {
				purejavadrawablemodel_455_.aClass354Array5774 = purejavadrawablemodel_456_.aClass354Array5774;
			}
			if (aClass354Array5774 != null) {
				for (int i_473_ = 0; i_473_ < anInt5753; i_473_++)
					purejavadrawablemodel_455_.aClass354Array5774[i_473_] = new Class354(aClass354Array5774[i_473_]);
			} else {
				purejavadrawablemodel_455_.aClass354Array5774 = null;
			}
			if (aClass272Array5775 != null) {
				if (purejavadrawablemodel_456_.aClass272Array5775 == null || purejavadrawablemodel_456_.aClass272Array5775.length < anInt5711) {
					int i_474_ = anInt5711;
					purejavadrawablemodel_455_.aClass272Array5775 = purejavadrawablemodel_456_.aClass272Array5775 = new Class272[i_474_];
				} else {
					purejavadrawablemodel_455_.aClass272Array5775 = purejavadrawablemodel_456_.aClass272Array5775;
				}
				for (int i_475_ = 0; i_475_ < anInt5711; i_475_++)
					purejavadrawablemodel_455_.aClass272Array5775[i_475_] = aClass272Array5775[i_475_] != null ? new Class272(aClass272Array5775[i_475_]) : null;
			} else {
				purejavadrawablemodel_455_.aClass272Array5775 = null;
			}
		} else {
			if (bool_457_) {
				method675();
			}
			purejavadrawablemodel_455_.aClass354Array5774 = aClass354Array5774;
			purejavadrawablemodel_455_.aClass272Array5775 = aClass272Array5775;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray5773 == null) {
				purejavadrawablemodel_455_.aShortArray5773 = null;
			} else {
				if (purejavadrawablemodel_456_.aShortArray5773 == null || purejavadrawablemodel_456_.aShortArray5773.length < anInt5711) {
					int i_476_ = anInt5711;
					purejavadrawablemodel_455_.aShortArray5773 = purejavadrawablemodel_456_.aShortArray5773 = new short[i_476_];
				} else {
					purejavadrawablemodel_455_.aShortArray5773 = purejavadrawablemodel_456_.aShortArray5773;
				}
				for (int i_477_ = 0; i_477_ < anInt5711; i_477_++)
					purejavadrawablemodel_455_.aShortArray5773[i_477_] = aShortArray5773[i_477_];
			}
		} else {
			purejavadrawablemodel_455_.aShortArray5773 = aShortArray5773;
		}
		if ((i & 0x10000) != 0) {
			if (aByteArray5736 == null) {
				purejavadrawablemodel_455_.aByteArray5736 = null;
			} else {
				if (purejavadrawablemodel_456_.aByteArray5736 == null || purejavadrawablemodel_456_.aByteArray5736.length < anInt5711) {
					int i_478_ = bool ? anInt5711 + 100 : anInt5711;
					purejavadrawablemodel_455_.aByteArray5736 = purejavadrawablemodel_456_.aByteArray5736 = new byte[i_478_];
				} else {
					purejavadrawablemodel_455_.aByteArray5736 = purejavadrawablemodel_456_.aByteArray5736;
				}
				for (int i_479_ = 0; i_479_ < anInt5711; i_479_++)
					purejavadrawablemodel_455_.aByteArray5736[i_479_] = aByteArray5736[i_479_];
			}
		} else {
			purejavadrawablemodel_455_.aByteArray5736 = aByteArray5736;
		}
		if ((i & 0xc580) != 0) {
			if (purejavadrawablemodel_456_.aClass214Array5765 == null || purejavadrawablemodel_456_.aClass214Array5765.length < anInt5762) {
				int i_480_ = anInt5762;
				purejavadrawablemodel_455_.aClass214Array5765 = purejavadrawablemodel_456_.aClass214Array5765 = new Class214[i_480_];
				for (int i_481_ = 0; i_481_ < anInt5762; i_481_++)
					purejavadrawablemodel_455_.aClass214Array5765[i_481_] = aClass214Array5765[i_481_].method2059((byte) -90);
			} else {
				purejavadrawablemodel_455_.aClass214Array5765 = purejavadrawablemodel_456_.aClass214Array5765;
				for (int i_482_ = 0; i_482_ < anInt5762; i_482_++)
					purejavadrawablemodel_455_.aClass214Array5765[i_482_].method2058(aClass214Array5765[i_482_], 84);
			}
		} else {
			purejavadrawablemodel_455_.aClass214Array5765 = aClass214Array5765;
		}
		if (aFloatArrayArray5763 != null && (i & 0x10) != 0) {
			if (purejavadrawablemodel_456_.aFloatArrayArray5763 == null || purejavadrawablemodel_456_.aFloatArrayArray5763.length < anInt5711) {
				int i_483_ = bool ? anInt5711 + 100 : anInt5711;
				purejavadrawablemodel_455_.aFloatArrayArray5763 = purejavadrawablemodel_456_.aFloatArrayArray5763 = new float[i_483_][3];
			} else {
				purejavadrawablemodel_455_.aFloatArrayArray5763 = purejavadrawablemodel_456_.aFloatArrayArray5763;
			}
			for (int i_484_ = 0; i_484_ < anInt5711; i_484_++) {
				if (aFloatArrayArray5763[i_484_] != null) {
					purejavadrawablemodel_455_.aFloatArrayArray5763[i_484_][0] = aFloatArrayArray5763[i_484_][0];
					purejavadrawablemodel_455_.aFloatArrayArray5763[i_484_][1] = aFloatArrayArray5763[i_484_][1];
					purejavadrawablemodel_455_.aFloatArrayArray5763[i_484_][2] = aFloatArrayArray5763[i_484_][2];
				}
			}
			if (purejavadrawablemodel_456_.aFloatArrayArray5776 == null || purejavadrawablemodel_456_.aFloatArrayArray5776.length < anInt5711) {
				int i_485_ = bool ? anInt5711 + 100 : anInt5711;
				purejavadrawablemodel_455_.aFloatArrayArray5776 = purejavadrawablemodel_456_.aFloatArrayArray5776 = new float[i_485_][3];
			} else {
				purejavadrawablemodel_455_.aFloatArrayArray5776 = purejavadrawablemodel_456_.aFloatArrayArray5776;
			}
			for (int i_486_ = 0; i_486_ < anInt5711; i_486_++) {
				if (aFloatArrayArray5776[i_486_] != null) {
					purejavadrawablemodel_455_.aFloatArrayArray5776[i_486_][0] = aFloatArrayArray5776[i_486_][0];
					purejavadrawablemodel_455_.aFloatArrayArray5776[i_486_][1] = aFloatArrayArray5776[i_486_][1];
					purejavadrawablemodel_455_.aFloatArrayArray5776[i_486_][2] = aFloatArrayArray5776[i_486_][2];
				}
			}
		} else {
			purejavadrawablemodel_455_.aFloatArrayArray5763 = aFloatArrayArray5763;
			purejavadrawablemodel_455_.aFloatArrayArray5776 = aFloatArrayArray5776;
		}
		purejavadrawablemodel_455_.anIntArrayArray5722 = anIntArrayArray5722;
		purejavadrawablemodel_455_.anIntArrayArray5725 = anIntArrayArray5725;
		purejavadrawablemodel_455_.anIntArrayArray5783 = anIntArrayArray5783;
		purejavadrawablemodel_455_.aShortArray5747 = aShortArray5747;
		purejavadrawablemodel_455_.aShortArray5787 = aShortArray5787;
		purejavadrawablemodel_455_.aByteArray5768 = aByteArray5768;
		purejavadrawablemodel_455_.aShortArray5767 = aShortArray5767;
		purejavadrawablemodel_455_.aShortArray5731 = aShortArray5731;
		purejavadrawablemodel_455_.aShortArray5789 = aShortArray5789;
		purejavadrawablemodel_455_.aClass300Array5782 = aClass300Array5782;
		purejavadrawablemodel_455_.aClass218Array5764 = aClass218Array5764;
		purejavadrawablemodel_455_.aClass209Array5790 = aClass209Array5790;
		purejavadrawablemodel_455_.aShortArray5719 = aShortArray5719;
		purejavadrawablemodel_455_.anInt5746 = i;
		return purejavadrawablemodel_455_;
	}
	
	private final void method667() {
		synchronized (this) {
			for (int i = 0; i < anInt5718; i++) {
				int i_487_ = anIntArray5717[i];
				anIntArray5717[i] = anIntArray5748[i];
				anIntArray5748[i] = -i_487_;
			}
			method656();
		}
	}
	
	final void k(int i) {
		if ((anInt5746 & 0xd) != 13) {
			throw new IllegalStateException();
		}
		if (aClass354Array5774 != null) {
			if (i == 4096) {
				method663();
			} else if (i == 8192) {
				method682();
			} else if (i == 12288) {
				method684();
			} else {
				int i_488_ = Class335.anIntArray4167[i];
				int i_489_ = Class335.anIntArray4165[i];
				synchronized (this) {
					for (int i_490_ = 0; i_490_ < anInt5753; i_490_++) {
						int i_491_ = anIntArray5717[i_490_] * i_488_ + anIntArray5748[i_490_] * i_489_ >> 14;
						anIntArray5717[i_490_] = anIntArray5717[i_490_] * i_489_ - anIntArray5748[i_490_] * i_488_ >> 14;
						anIntArray5748[i_490_] = i_491_;
						if (aClass354Array5774[i_490_] != null) {
							i_491_ = aClass354Array5774[i_490_].anInt4346 * i_488_ + aClass354Array5774[i_490_].anInt4347 * i_489_ >> 14;
							aClass354Array5774[i_490_].anInt4346 = aClass354Array5774[i_490_].anInt4346 * i_489_ - aClass354Array5774[i_490_].anInt4347 * i_488_ >> 14;
							aClass354Array5774[i_490_].anInt4347 = i_491_;
						}
					}
					if (aClass272Array5775 != null) {
						for (int i_492_ = 0; i_492_ < anInt5711; i_492_++) {
							if (aClass272Array5775[i_492_] != null) {
								int i_493_ = aClass272Array5775[i_492_].anInt3483 * i_488_ + aClass272Array5775[i_492_].anInt3484 * i_489_ >> 14;
								aClass272Array5775[i_492_].anInt3483 = aClass272Array5775[i_492_].anInt3483 * i_489_ - aClass272Array5775[i_492_].anInt3484 * i_488_ >> 14;
								aClass272Array5775[i_492_].anInt3484 = i_493_;
							}
						}
					}
					for (int i_494_ = anInt5753; i_494_ < anInt5718; i_494_++) {
						int i_495_ = anIntArray5717[i_494_] * i_488_ + anIntArray5748[i_494_] * i_489_ >> 14;
						anIntArray5717[i_494_] = anIntArray5717[i_494_] * i_489_ - anIntArray5748[i_494_] * i_488_ >> 14;
						anIntArray5748[i_494_] = i_495_;
					}
					anInt5744 = 0;
					aBoolean5792 = false;
				}
			}
		} else {
			a(i);
		}
	}
	
	private final void method668(boolean bool, boolean bool_496_, int i, int i_497_) {
		if (aClass209Array5790 != null) {
			for (int i_498_ = 0; i_498_ < anInt5762; i_498_++) {
				Class209 class209 = aClass209Array5790[i_498_];
				anIntArray5756[class209.anInt2485] = i_498_;
			}
		}
		if (aBoolean5720 || aClass209Array5790 != null) {
			if ((anInt5746 & 0x100) == 0 && aShortArray5719 != null) {
				for (int i_499_ = 0; i_499_ < anInt5711; i_499_++) {
					short s = aShortArray5719[i_499_];
					method660(s, bool, bool_496_);
				}
			} else {
				for (int i_500_ = 0; i_500_ < anInt5711; i_500_++) {
					if (!method658(i_500_) && !method678(i_500_)) {
						method660(i_500_, bool, bool_496_);
					}
				}
				if (aByteArray5768 == null) {
					for (int i_501_ = 0; i_501_ < anInt5711; i_501_++) {
						if (method658(i_501_) || method678(i_501_)) {
							method660(i_501_, bool, bool_496_);
						}
					}
				} else {
					for (int i_502_ = 0; i_502_ < 12; i_502_++) {
						for (int i_503_ = 0; i_503_ < anInt5711; i_503_++) {
							if (aByteArray5768[i_503_] == i_502_ && (method658(i_503_) || method678(i_503_))) {
								method660(i_503_, bool, bool_496_);
							}
						}
					}
				}
			}
		} else {
			for (int i_504_ = 0; i_504_ < anInt5711; i_504_++)
				method660(i_504_, bool, bool_496_);
		}
	}
	
	private final void method669(int i) {
		short s = aShortArray5767[i];
		short s_505_ = aShortArray5731[i];
		short s_506_ = aShortArray5789[i];
		if (aShortArray5773 == null || aShortArray5773[i] == -1) {
			if (aByteArray5784 == null) {
				aClass185_5712.anInt2220 = 0;
			} else {
				aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
			}
			if (anIntArray5761[i] == -1) {
				aClass185_5712.method1853((float) anIntArray5716[s], (float) anIntArray5716[s_505_], (float) anIntArray5716[s_506_], (float) anIntArray5713[s], (float) anIntArray5713[s_505_], (float) anIntArray5713[s_506_], (float) anIntArray5758[s], (float) anIntArray5758[s_505_], (float) anIntArray5758[s_506_], Class170.anIntArray2054[anIntArray5754[i] & 0xffff]);
			} else {
				aClass185_5712.method1862((float) anIntArray5716[s], (float) anIntArray5716[s_505_], (float) anIntArray5716[s_506_], (float) anIntArray5713[s], (float) anIntArray5713[s_505_], (float) anIntArray5713[s_506_], (float) anIntArray5758[s], (float) anIntArray5758[s_505_], (float) anIntArray5758[s_506_], (float) (anIntArray5754[i] & 0xffff), (float) (anIntArray5739[i] & 0xffff), (float) (anIntArray5761[i] & 0xffff));
			}
		} else {
			int i_507_ = -16777216;
			if (aByteArray5784 != null) {
				i_507_ = 255 - (aByteArray5784[i] & 0xff) << 24;
			}
			if (anIntArray5761[i] == -1) {
				int i_508_ = i_507_ | anIntArray5754[i] & 0xffffff;
				aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_505_], (float) anIntArray5716[s_506_], (float) anIntArray5713[s], (float) anIntArray5713[s_505_], (float) anIntArray5713[s_506_], (float) anIntArray5758[s], (float) anIntArray5758[s_505_], (float) anIntArray5758[s_506_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_508_, i_508_, i_508_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
			} else {
				aClass185_5712.method1863((float) anIntArray5716[s], (float) anIntArray5716[s_505_], (float) anIntArray5716[s_506_], (float) anIntArray5713[s], (float) anIntArray5713[s_505_], (float) anIntArray5713[s_506_], (float) anIntArray5758[s], (float) anIntArray5758[s_505_], (float) anIntArray5758[s_506_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_507_ | anIntArray5754[i] & 0xffffff, i_507_ | anIntArray5739[i] & 0xffffff, i_507_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
			}
		}
	}
	
	final int WA() {
		return anInt5791;
	}
	
	private final void method670(int i) {
		int i_509_ = 0;
		int i_510_ = aPureJavaToolkit5770.anInt6798;
		short s = aShortArray5767[i];
		short s_511_ = aShortArray5731[i];
		short s_512_ = aShortArray5789[i];
		int i_513_ = anIntArray5721[s];
		int i_514_ = anIntArray5721[s_511_];
		int i_515_ = anIntArray5721[s_512_];
		if (aByteArray5784 == null) {
			aClass185_5712.anInt2220 = 0;
		} else {
			aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
		}
		if (i_513_ >= i_510_) {
			anIntArray5738[i_509_] = anIntArray5713[s];
			anIntArray5781[i_509_] = anIntArray5716[s];
			anIntArray5760[i_509_] = anIntArray5758[s];
			anIntArray5785[i_509_++] = anIntArray5754[i] & 0xffff;
		} else {
			int i_516_ = anIntArray5714[s];
			int i_517_ = anIntArray5728[s];
			int i_518_ = anIntArray5754[i] & 0xffff;
			if (i_515_ >= i_510_) {
				int i_519_ = (i_510_ - i_513_) * (65536 / (i_515_ - i_513_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_516_ + ((anIntArray5714[s_512_] - i_516_) * i_519_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_517_ + ((anIntArray5728[s_512_] - i_517_) * i_519_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_518_ + (((anIntArray5761[i] & 0xffff) - i_518_) * i_519_ >> 16);
			}
			if (i_514_ >= i_510_) {
				int i_520_ = (i_510_ - i_513_) * (65536 / (i_514_ - i_513_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_516_ + ((anIntArray5714[s_511_] - i_516_) * i_520_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_517_ + ((anIntArray5728[s_511_] - i_517_) * i_520_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_518_ + (((anIntArray5739[i] & 0xffff) - i_518_) * i_520_ >> 16);
			}
		}
		if (i_514_ >= i_510_) {
			anIntArray5738[i_509_] = anIntArray5713[s_511_];
			anIntArray5781[i_509_] = anIntArray5716[s_511_];
			anIntArray5760[i_509_] = anIntArray5758[s_511_];
			anIntArray5785[i_509_++] = anIntArray5739[i] & 0xffff;
		} else {
			int i_521_ = anIntArray5714[s_511_];
			int i_522_ = anIntArray5728[s_511_];
			int i_523_ = anIntArray5739[i] & 0xffff;
			if (i_513_ >= i_510_) {
				int i_524_ = (i_510_ - i_514_) * (65536 / (i_513_ - i_514_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_521_ + ((anIntArray5714[s] - i_521_) * i_524_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_522_ + ((anIntArray5728[s] - i_522_) * i_524_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_523_ + (((anIntArray5754[i] & 0xffff) - i_523_) * i_524_ >> 16);
			}
			if (i_515_ >= i_510_) {
				int i_525_ = (i_510_ - i_514_) * (65536 / (i_515_ - i_514_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_521_ + ((anIntArray5714[s_512_] - i_521_) * i_525_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_522_ + ((anIntArray5728[s_512_] - i_522_) * i_525_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_523_ + (((anIntArray5761[i] & 0xffff) - i_523_) * i_525_ >> 16);
			}
		}
		if (i_515_ >= i_510_) {
			anIntArray5738[i_509_] = anIntArray5713[s_512_];
			anIntArray5781[i_509_] = anIntArray5716[s_512_];
			anIntArray5760[i_509_] = anIntArray5758[s_512_];
			anIntArray5785[i_509_++] = anIntArray5761[i] & 0xffff;
		} else {
			int i_526_ = anIntArray5714[s_512_];
			int i_527_ = anIntArray5728[s_512_];
			int i_528_ = anIntArray5761[i] & 0xffff;
			if (i_514_ >= i_510_) {
				int i_529_ = (i_510_ - i_515_) * (65536 / (i_514_ - i_515_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_526_ + ((anIntArray5714[s_511_] - i_526_) * i_529_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_527_ + ((anIntArray5728[s_511_] - i_527_) * i_529_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_528_ + (((anIntArray5739[i] & 0xffff) - i_528_) * i_529_ >> 16);
			}
			if (i_513_ >= i_510_) {
				int i_530_ = (i_510_ - i_515_) * (65536 / (i_513_ - i_515_));
				anIntArray5738[i_509_] = aClass374_5741.anInt4633 + (i_526_ + ((anIntArray5714[s] - i_526_) * i_530_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_510_;
				anIntArray5781[i_509_] = aClass374_5741.anInt4653 + (i_527_ + ((anIntArray5728[s] - i_527_) * i_530_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_510_;
				anIntArray5760[i_509_] = i_510_;
				anIntArray5785[i_509_++] = i_528_ + (((anIntArray5754[i] & 0xffff) - i_528_) * i_530_ >> 16);
			}
		}
		int i_531_ = anIntArray5738[0];
		int i_532_ = anIntArray5738[1];
		int i_533_ = anIntArray5738[2];
		int i_534_ = anIntArray5781[0];
		int i_535_ = anIntArray5781[1];
		int i_536_ = anIntArray5781[2];
		i_513_ = anIntArray5760[0];
		i_514_ = anIntArray5760[1];
		i_515_ = anIntArray5760[2];
		aClass185_5712.aBoolean2217 = false;
		if (i_509_ == 3) {
			if (i_531_ < 0 || i_532_ < 0 || i_533_ < 0 || i_531_ > aClass374_5741.anInt4635 || i_532_ > aClass374_5741.anInt4635 || i_533_ > aClass374_5741.anInt4635) {
				aClass185_5712.aBoolean2217 = true;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1853((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, Class170.anIntArray2054[anIntArray5754[i] & 0xffff]);
				} else {
					aClass185_5712.method1862((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, (float) anIntArray5785[0], (float) anIntArray5785[1], (float) anIntArray5785[2]);
				}
			} else {
				int i_537_ = -16777216;
				if (aByteArray5784 != null) {
					i_537_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				int i_538_ = i_537_ | anIntArray5754[i] & 0xffffff;
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1863((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_538_, i_538_, i_538_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				} else {
					aClass185_5712.method1863((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_538_, i_538_, i_538_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				}
			}
		}
		if (i_509_ == 4) {
			if (i_531_ < 0 || i_532_ < 0 || i_533_ < 0 || i_531_ > aClass374_5741.anInt4635 || i_532_ > aClass374_5741.anInt4635 || i_533_ > aClass374_5741.anInt4635 || anIntArray5738[3] < 0 || anIntArray5738[3] > aClass374_5741.anInt4635) {
				aClass185_5712.aBoolean2217 = true;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					int i_539_ = Class170.anIntArray2054[anIntArray5754[i] & 0xffff];
					aClass185_5712.method1853((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, i_539_);
					aClass185_5712.method1853((float) i_534_, (float) i_536_, (float) anIntArray5781[3], (float) i_531_, (float) i_533_, (float) anIntArray5738[3], (float) i_513_, (float) i_514_, (float) anIntArray5760[3], i_539_);
				} else {
					aClass185_5712.method1862((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, (float) anIntArray5785[0], (float) anIntArray5785[1], (float) anIntArray5785[2]);
					aClass185_5712.method1862((float) i_534_, (float) i_536_, (float) anIntArray5781[3], (float) i_531_, (float) i_533_, (float) anIntArray5738[3], (float) i_513_, (float) i_514_, (float) anIntArray5760[3], (float) anIntArray5785[0], (float) anIntArray5785[2], (float) anIntArray5785[3]);
				}
			} else {
				int i_540_ = -16777216;
				if (aByteArray5784 != null) {
					i_540_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				int i_541_ = i_540_ | anIntArray5754[i] & 0xffffff;
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1863((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_541_, i_541_, i_541_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
					aClass185_5712.method1863((float) i_534_, (float) i_536_, (float) anIntArray5781[3], (float) i_531_, (float) i_533_, (float) anIntArray5738[3], (float) i_513_, (float) i_515_, (float) anIntArray5760[3], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_541_, i_541_, i_541_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				} else {
					aClass185_5712.method1863((float) i_534_, (float) i_535_, (float) i_536_, (float) i_531_, (float) i_532_, (float) i_533_, (float) i_513_, (float) i_514_, (float) i_515_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_541_, i_541_, i_541_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
					aClass185_5712.method1863((float) i_534_, (float) i_536_, (float) anIntArray5781[3], (float) i_531_, (float) i_533_, (float) anIntArray5738[3], (float) i_513_, (float) i_515_, (float) anIntArray5760[3], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_541_, i_541_, i_541_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				}
			}
		}
	}
	
	private final void method671(Thread thread) {
		Class374 class374 = aPureJavaToolkit5770.method1494(thread);
		aClass185_5712 = class374.aClass185_4627;
		if (class374 != aClass374_5741) {
			aClass374_5741 = class374;
			anIntArray5769 = aClass374_5741.anIntArray4640;
			anIntArray5714 = aClass374_5741.anIntArray4649;
			anIntArray5728 = aClass374_5741.anIntArray4644;
			anIntArray5721 = aClass374_5741.anIntArray4631;
			anIntArray5713 = aClass374_5741.anIntArray4646;
			anIntArray5716 = aClass374_5741.anIntArray4641;
			anIntArray5758 = aClass374_5741.anIntArray4630;
			anIntArray5737 = aClass374_5741.anIntArray4639;
			anIntArray5745 = aClass374_5741.anIntArray4636;
			anIntArray5729 = aClass374_5741.anIntArray4629;
			anIntArray5738 = aClass374_5741.anIntArray4642;
			anIntArray5781 = aClass374_5741.anIntArray4645;
			anIntArray5760 = aClass374_5741.anIntArray4634;
			anIntArray5785 = aClass374_5741.anIntArray4643;
			anIntArray5771 = aClass374_5741.anIntArray4626;
			anIntArray5749 = aClass374_5741.anIntArray4628;
			anIntArray5756 = aClass374_5741.anIntArray4648;
		}
	}
	
	private final boolean method672(int i, int i_542_, int i_543_, int i_544_, int i_545_, int i_546_, int i_547_, int i_548_) {
		if (i_542_ < i_543_ && i_542_ < i_544_ && i_542_ < i_545_) {
			return false;
		}
		if (i_542_ > i_543_ && i_542_ > i_544_ && i_542_ > i_545_) {
			return false;
		}
		if (i < i_546_ && i < i_547_ && i < i_548_) {
			return false;
		}
        return !(i > i_546_ && i > i_547_ && i > i_548_);
    }
	
	final void method630(Class336 class336, int i, boolean bool) {
		if (aShortArray5747 != null) {
			int[] is = new int[3];
			for (int i_549_ = 0; i_549_ < anInt5753; i_549_++) {
				if ((i & aShortArray5747[i_549_]) != 0) {
					if (bool) {
						class336.method3869(anIntArray5748[i_549_], anIntArray5772[i_549_], anIntArray5717[i_549_], is);
					} else {
						class336.method3853(anIntArray5748[i_549_], anIntArray5772[i_549_], anIntArray5717[i_549_], is);
					}
					anIntArray5748[i_549_] = is[0];
					anIntArray5772[i_549_] = is[1];
					anIntArray5717[i_549_] = is[2];
				}
			}
		}
	}
	
	private final void method673(int i) {
		int i_550_ = 0;
		int i_551_ = aPureJavaToolkit5770.anInt6798;
		short s = aShortArray5767[i];
		short s_552_ = aShortArray5731[i];
		short s_553_ = aShortArray5789[i];
		int i_554_ = anIntArray5721[s];
		int i_555_ = anIntArray5721[s_552_];
		int i_556_ = anIntArray5721[s_553_];
		if (aByteArray5784 == null) {
			aClass185_5712.anInt2220 = 0;
		} else {
			aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
		}
		if (i_554_ >= i_551_) {
			anIntArray5738[i_550_] = anIntArray5713[s];
			anIntArray5781[i_550_] = anIntArray5716[s];
			anIntArray5760[i_550_] = anIntArray5758[s];
			anIntArray5785[i_550_++] = anIntArray5754[i] & 0xffff;
		} else {
			int i_557_ = anIntArray5714[s];
			int i_558_ = anIntArray5728[s];
			int i_559_ = anIntArray5754[i] & 0xffff;
			if (i_556_ >= i_551_) {
				int i_560_ = (i_551_ - i_554_) * (65536 / (i_556_ - i_554_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_557_ + ((anIntArray5714[s_553_] - i_557_) * i_560_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_558_ + ((anIntArray5728[s_553_] - i_558_) * i_560_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_559_ + (((anIntArray5761[i] & 0xffff) - i_559_) * i_560_ >> 16);
			}
			if (i_555_ >= i_551_) {
				int i_561_ = (i_551_ - i_554_) * (65536 / (i_555_ - i_554_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_557_ + ((anIntArray5714[s_552_] - i_557_) * i_561_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_558_ + ((anIntArray5728[s_552_] - i_558_) * i_561_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_559_ + (((anIntArray5739[i] & 0xffff) - i_559_) * i_561_ >> 16);
			}
		}
		if (i_555_ >= i_551_) {
			anIntArray5738[i_550_] = anIntArray5713[s_552_];
			anIntArray5781[i_550_] = anIntArray5716[s_552_];
			anIntArray5760[i_550_] = anIntArray5758[s_552_];
			anIntArray5785[i_550_++] = anIntArray5739[i] & 0xffff;
		} else {
			int i_562_ = anIntArray5714[s_552_];
			int i_563_ = anIntArray5728[s_552_];
			int i_564_ = anIntArray5739[i] & 0xffff;
			if (i_554_ >= i_551_) {
				int i_565_ = (i_551_ - i_555_) * (65536 / (i_554_ - i_555_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_562_ + ((anIntArray5714[s] - i_562_) * i_565_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_563_ + ((anIntArray5728[s] - i_563_) * i_565_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_564_ + (((anIntArray5754[i] & 0xffff) - i_564_) * i_565_ >> 16);
			}
			if (i_556_ >= i_551_) {
				int i_566_ = (i_551_ - i_555_) * (65536 / (i_556_ - i_555_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_562_ + ((anIntArray5714[s_553_] - i_562_) * i_566_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_563_ + ((anIntArray5728[s_553_] - i_563_) * i_566_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_564_ + (((anIntArray5761[i] & 0xffff) - i_564_) * i_566_ >> 16);
			}
		}
		if (i_556_ >= i_551_) {
			anIntArray5738[i_550_] = anIntArray5713[s_553_];
			anIntArray5781[i_550_] = anIntArray5716[s_553_];
			anIntArray5760[i_550_] = anIntArray5758[s_553_];
			anIntArray5785[i_550_++] = anIntArray5761[i] & 0xffff;
		} else {
			int i_567_ = anIntArray5714[s_553_];
			int i_568_ = anIntArray5728[s_553_];
			int i_569_ = anIntArray5761[i] & 0xffff;
			if (i_555_ >= i_551_) {
				int i_570_ = (i_551_ - i_556_) * (65536 / (i_555_ - i_556_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_567_ + ((anIntArray5714[s_552_] - i_567_) * i_570_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_568_ + ((anIntArray5728[s_552_] - i_568_) * i_570_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_569_ + (((anIntArray5739[i] & 0xffff) - i_569_) * i_570_ >> 16);
			}
			if (i_554_ >= i_551_) {
				int i_571_ = (i_551_ - i_556_) * (65536 / (i_554_ - i_556_));
				anIntArray5738[i_550_] = aClass374_5741.anInt4633 + (i_567_ + ((anIntArray5714[s] - i_567_) * i_571_ >> 16)) * aPureJavaToolkit5770.anInt6785 / i_551_;
				anIntArray5781[i_550_] = aClass374_5741.anInt4653 + (i_568_ + ((anIntArray5728[s] - i_568_) * i_571_ >> 16)) * aPureJavaToolkit5770.anInt6763 / i_551_;
				anIntArray5760[i_550_] = i_551_;
				anIntArray5785[i_550_++] = i_569_ + (((anIntArray5754[i] & 0xffff) - i_569_) * i_571_ >> 16);
			}
		}
		int i_572_ = anIntArray5738[0];
		int i_573_ = anIntArray5738[1];
		int i_574_ = anIntArray5738[2];
		int i_575_ = anIntArray5781[0];
		int i_576_ = anIntArray5781[1];
		int i_577_ = anIntArray5781[2];
		i_554_ = anIntArray5760[0];
		i_555_ = anIntArray5760[1];
		i_556_ = anIntArray5760[2];
		aClass185_5712.aBoolean2217 = false;
		if (i_550_ == 3) {
			if (i_572_ < 0 || i_573_ < 0 || i_574_ < 0 || i_572_ > aClass374_5741.anInt4635 || i_573_ > aClass374_5741.anInt4635 || i_574_ > aClass374_5741.anInt4635) {
				aClass185_5712.aBoolean2217 = true;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1867((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, Class170.anIntArray2054[anIntArray5754[i] & 0xffff]);
				} else {
					aClass185_5712.method1865((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, (float) anIntArray5785[0], (float) anIntArray5785[1], (float) anIntArray5785[2]);
				}
			} else {
				int i_578_ = -16777216;
				if (aByteArray5784 != null) {
					i_578_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				int i_579_ = i_578_ | anIntArray5754[i] & 0xffffff;
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1859((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_579_, i_579_, i_579_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				} else {
					aClass185_5712.method1859((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_579_, i_579_, i_579_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				}
			}
		}
		if (i_550_ == 4) {
			if (i_572_ < 0 || i_573_ < 0 || i_574_ < 0 || i_572_ > aClass374_5741.anInt4635 || i_573_ > aClass374_5741.anInt4635 || i_574_ > aClass374_5741.anInt4635 || anIntArray5738[3] < 0 || anIntArray5738[3] > aClass374_5741.anInt4635) {
				aClass185_5712.aBoolean2217 = true;
			}
			if (aShortArray5773 == null || aShortArray5773[i] == -1) {
				if (anIntArray5761[i] == -1) {
					int i_580_ = Class170.anIntArray2054[anIntArray5754[i] & 0xffff];
					aClass185_5712.method1867((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, i_580_);
					aClass185_5712.method1867((float) i_575_, (float) i_577_, (float) anIntArray5781[3], (float) i_572_, (float) i_574_, (float) anIntArray5738[3], (float) i_554_, (float) i_555_, (float) anIntArray5760[3], i_580_);
				} else {
					aClass185_5712.method1865((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, (float) anIntArray5785[0], (float) anIntArray5785[1], (float) anIntArray5785[2]);
					aClass185_5712.method1865((float) i_575_, (float) i_577_, (float) anIntArray5781[3], (float) i_572_, (float) i_574_, (float) anIntArray5738[3], (float) i_554_, (float) i_555_, (float) anIntArray5760[3], (float) anIntArray5785[0], (float) anIntArray5785[2], (float) anIntArray5785[3]);
				}
			} else {
				int i_581_ = -16777216;
				if (aByteArray5784 != null) {
					i_581_ = 255 - (aByteArray5784[i] & 0xff) << 24;
				}
				int i_582_ = i_581_ | anIntArray5754[i] & 0xffffff;
				if (anIntArray5761[i] == -1) {
					aClass185_5712.method1859((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_582_, i_582_, i_582_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
					aClass185_5712.method1859((float) i_575_, (float) i_577_, (float) anIntArray5781[3], (float) i_572_, (float) i_574_, (float) anIntArray5738[3], (float) i_554_, (float) i_556_, (float) anIntArray5760[3], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_582_, i_582_, i_582_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				} else {
					aClass185_5712.method1859((float) i_575_, (float) i_576_, (float) i_577_, (float) i_572_, (float) i_573_, (float) i_574_, (float) i_554_, (float) i_555_, (float) i_556_, aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_582_, i_582_, i_582_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
					aClass185_5712.method1859((float) i_575_, (float) i_577_, (float) anIntArray5781[3], (float) i_572_, (float) i_574_, (float) anIntArray5738[3], (float) i_554_, (float) i_556_, (float) anIntArray5760[3], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_582_, i_582_, i_582_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
				}
			}
		}
	}
	
	private final void method674(int i, boolean bool, boolean bool_583_) {
		if (anIntArray5761[i] != -2) {
			short s = aShortArray5767[i];
			short s_584_ = aShortArray5731[i];
			short s_585_ = aShortArray5789[i];
			int i_586_ = anIntArray5713[s];
			int i_587_ = anIntArray5713[s_584_];
			int i_588_ = anIntArray5713[s_585_];
			if (bool && (i_586_ == -5000 || i_587_ == -5000 || i_588_ == -5000)) {
				int i_589_ = anIntArray5714[s];
				int i_590_ = anIntArray5714[s_584_];
				int i_591_ = anIntArray5714[s_585_];
				int i_592_ = anIntArray5728[s];
				int i_593_ = anIntArray5728[s_584_];
				int i_594_ = anIntArray5728[s_585_];
				int i_595_ = anIntArray5721[s];
				int i_596_ = anIntArray5721[s_584_];
				int i_597_ = anIntArray5721[s_585_];
				i_589_ -= i_590_;
				i_591_ -= i_590_;
				i_592_ -= i_593_;
				i_594_ -= i_593_;
				i_595_ -= i_596_;
				i_597_ -= i_596_;
				int i_598_ = i_592_ * i_597_ - i_595_ * i_594_;
				int i_599_ = i_595_ * i_591_ - i_589_ * i_597_;
				int i_600_ = i_589_ * i_594_ - i_592_ * i_591_;
				if (i_590_ * i_598_ + i_593_ * i_599_ + i_596_ * i_600_ > 0) {
					method673(i);
				}
			} else if (anIntArray5756[i] != -1 || (i_586_ - i_587_) * (anIntArray5716[s_585_] - anIntArray5716[s_584_]) - (anIntArray5716[s] - anIntArray5716[s_584_]) * (i_588_ - i_587_) > 0) {
                aClass185_5712.aBoolean2217 = i_586_ < 0 || i_587_ < 0 || i_588_ < 0 || i_586_ > aClass374_5741.anInt4635 || i_587_ > aClass374_5741.anInt4635 || i_588_ > aClass374_5741.anInt4635;
				if (bool_583_) {
					int i_601_ = anIntArray5756[i];
					if (i_601_ == -1 || !aClass209Array5790[i_601_].aBoolean2495) {
						method659(i);
					}
				} else {
					int i_602_ = anIntArray5756[i];
					if (i_602_ != -1) {
						Class209 class209 = aClass209Array5790[i_602_];
						Class214 class214 = aClass214Array5765[i_602_];
						if (!class209.aBoolean2495) {
							method685(i);
						}
						aPureJavaToolkit5770.method1498(class214.anInt2515, class214.anInt2521, class214.anInt2518, class214.anInt2526, class214.anInt2514, class214.anInt2525, class209.aShort2488 & 0xffff, class214.anInt2519, class209.aByte2489, class209.aByte2487);
					} else {
						method685(i);
					}
				}
			}
		}
	}
	
	final void C(int i) {
		if ((anInt5746 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		anInt5791 = i;
		anInt5744 = 0;
	}
	
	final boolean method612() {
		if (aShortArray5773 == null) {
			return true;
		}
		for (int i = 0; i < aShortArray5773.length; i++) {
			if (aShortArray5773[i] != -1 && !aPureJavaToolkit5770.method1493(aShortArray5773[i])) {
				return false;
			}
		}
		return true;
	}
	
	final void method611(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i) {
		method680(class336, entitynode_sub5, -1, i);
	}
	
	final void FA(int i) {
		if ((anInt5746 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		int i_603_ = Class335.anIntArray4167[i];
		int i_604_ = Class335.anIntArray4165[i];
		synchronized (this) {
			for (int i_605_ = 0; i_605_ < anInt5718; i_605_++) {
				int i_606_ = anIntArray5772[i_605_] * i_604_ - anIntArray5717[i_605_] * i_603_ >> 14;
				anIntArray5717[i_605_] = anIntArray5772[i_605_] * i_603_ + anIntArray5717[i_605_] * i_604_ >> 14;
				anIntArray5772[i_605_] = i_606_;
			}
			method656();
		}
	}
	
	final byte[] method627() {
		return aByteArray5784;
	}
	
	private final void method675() {
		if (anInt5744 == 0 && aClass354Array5774 == null) {
			if (aPureJavaToolkit5770.anInt6795 > 1) {
				synchronized (this) {
					method662();
				}
			} else {
				method662();
			}
		}
	}
	
	final int da() {
		return anInt5727;
	}
	
	final int ua() {
		return anInt5746;
	}
	
	private final int method676(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}
	
	final int V() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5757;
	}
	
	private final void method677() {
		if (!aBoolean5792) {
			int i = 0;
			int i_607_ = 0;
			int i_608_ = 32767;
			int i_609_ = 32767;
			int i_610_ = 32767;
			int i_611_ = -32768;
			int i_612_ = -32768;
			int i_613_ = -32768;
			for (int i_614_ = 0; i_614_ < anInt5753; i_614_++) {
				int i_615_ = anIntArray5748[i_614_];
				int i_616_ = anIntArray5772[i_614_];
				int i_617_ = anIntArray5717[i_614_];
				if (i_615_ < i_608_) {
					i_608_ = i_615_;
				}
				if (i_615_ > i_611_) {
					i_611_ = i_615_;
				}
				if (i_616_ < i_609_) {
					i_609_ = i_616_;
				}
				if (i_616_ > i_612_) {
					i_612_ = i_616_;
				}
				if (i_617_ < i_610_) {
					i_610_ = i_617_;
				}
				if (i_617_ > i_613_) {
					i_613_ = i_617_;
				}
				int i_618_ = i_615_ * i_615_ + i_617_ * i_617_;
				if (i_618_ > i) {
					i = i_618_;
				}
				i_618_ += i_616_ * i_616_;
				if (i_618_ > i_607_) {
					i_607_ = i_618_;
				}
			}
			aShort5757 = (short) i_608_;
			aShort5766 = (short) i_611_;
			aShort5759 = (short) i_609_;
			aShort5751 = (short) i_612_;
			aShort5732 = (short) i_610_;
			aShort5730 = (short) i_613_;
			aShort5777 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort5755 = (short) (int) (Math.sqrt((double) i_607_) + 0.99);
			aBoolean5792 = true;
		}
	}
	
	private final boolean method678(int i) {
		if (anIntArray5756 == null) {
			return false;
		}
        return anIntArray5756[i] != -1;
    }
	
	private final void method679() {
		for (int i = 0; i < anInt5711; i++) {
			short s = aShortArray5773 != null ? aShortArray5773[i] : (short) -1;
			if (s == -1) {
				int i_619_ = aShortArray5740[i] & 0xffff;
				int i_620_ = (i_619_ & 0x7f) * anInt5791 >> 7;
				short s_621_ = Node_Sub15_Sub2.method2560(5310, i_619_ & ~0x7f | i_620_);
				if (anIntArray5761[i] == -1) {
					int i_622_ = anIntArray5754[i] & ~0x1ffff;
					anIntArray5754[i] = i_622_ | Node_Sub18.method2607((byte) 31, i_622_ >> 17, s_621_);
				} else if (anIntArray5761[i] != -2) {
					int i_623_ = anIntArray5754[i] & ~0x1ffff;
					anIntArray5754[i] = i_623_ | Node_Sub18.method2607((byte) 31, i_623_ >> 17, s_621_);
					i_623_ = anIntArray5739[i] & ~0x1ffff;
					anIntArray5739[i] = i_623_ | Node_Sub18.method2607((byte) 31, i_623_ >> 17, s_621_);
					i_623_ = anIntArray5761[i] & ~0x1ffff;
					anIntArray5761[i] = i_623_ | Node_Sub18.method2607((byte) 31, i_623_ >> 17, s_621_);
				}
			}
		}
		anInt5744 = 2;
	}
	
	final int fa() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5759;
	}
	
	final void method632() {
		if (aPureJavaToolkit5770.anInt6795 > 1) {
			synchronized (this) {
				aBoolean914 = false;
				this.notifyAll();
			}
		}
	}
	
	private final void method680(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i, int i_624_) {
		if (anInt5753 >= 1) {
			aClass336_Sub2_5778 = (Class336_Sub2) class336;
			Class336_Sub2 class336_sub2 = aPureJavaToolkit5770.aClass336_Sub2_6788;
			if (!aBoolean5792) {
				method677();
			}
			boolean bool = false;
			if (aClass336_Sub2_5778.aFloat8580 == 16384.0F && aClass336_Sub2_5778.aFloat8571 == 0.0F && aClass336_Sub2_5778.aFloat8566 == 0.0F && aClass336_Sub2_5778.aFloat8578 == 0.0F && aClass336_Sub2_5778.aFloat8561 == 16384.0F && aClass336_Sub2_5778.aFloat8558 == 0.0F && aClass336_Sub2_5778.aFloat8577 == 0.0F && aClass336_Sub2_5778.aFloat8567 == 0.0F && aClass336_Sub2_5778.aFloat8584 == 16384.0F) {
				bool = true;
			}
			float f = class336_sub2.aFloat8589 + class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8589;
			float f_625_ = bool ? class336_sub2.aFloat8567 : class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8567;
			int i_626_ = (int) (f + (float) aShort5759 * f_625_);
			int i_627_ = (int) (f + (float) aShort5751 * f_625_);
			int i_628_;
			int i_629_;
			if (i_626_ > i_627_) {
				i_628_ = i_627_ - aShort5777;
				i_629_ = i_626_ + aShort5777;
			} else {
				i_628_ = i_626_ - aShort5777;
				i_629_ = i_627_ + aShort5777;
			}
			if (i_628_ < aPureJavaToolkit5770.anInt6776 && i_629_ > aPureJavaToolkit5770.anInt6798) {
				float f_630_ = class336_sub2.aFloat8583 + class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8589;
				float f_631_ = bool ? class336_sub2.aFloat8571 : class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8567;
				int i_632_ = (int) (f_630_ + (float) aShort5759 * f_631_);
				int i_633_ = (int) (f_630_ + (float) aShort5751 * f_631_);
				int i_634_;
				int i_635_;
				if (i_632_ > i_633_) {
					i_634_ = (i_633_ - aShort5777) * aPureJavaToolkit5770.anInt6785;
					i_635_ = (i_632_ + aShort5777) * aPureJavaToolkit5770.anInt6785;
				} else {
					i_634_ = (i_632_ - aShort5777) * aPureJavaToolkit5770.anInt6785;
					i_635_ = (i_633_ + aShort5777) * aPureJavaToolkit5770.anInt6785;
				}
				if (i == -1) {
					if (i_634_ / i_629_ >= aPureJavaToolkit5770.anInt6768 || i_635_ / i_629_ <= aPureJavaToolkit5770.anInt6793) {
						return;
					}
				} else if (i_634_ / i >= aPureJavaToolkit5770.anInt6768 || i_635_ / i <= aPureJavaToolkit5770.anInt6793) {
					return;
				}
				float f_636_ = class336_sub2.aFloat8579 + class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8583 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8579 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8589;
				float f_637_ = bool ? class336_sub2.aFloat8561 : class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8571 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8561 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8567;
				int i_638_ = (int) (f_636_ + (float) aShort5759 * f_637_);
				int i_639_ = (int) (f_636_ + (float) aShort5751 * f_637_);
				int i_640_;
				int i_641_;
				if (i_638_ > i_639_) {
					i_640_ = (i_639_ - aShort5777) * aPureJavaToolkit5770.anInt6763;
					i_641_ = (i_638_ + aShort5777) * aPureJavaToolkit5770.anInt6763;
				} else {
					i_640_ = (i_638_ - aShort5777) * aPureJavaToolkit5770.anInt6763;
					i_641_ = (i_639_ + aShort5777) * aPureJavaToolkit5770.anInt6763;
				}
				if (i == -1) {
					if (i_640_ / i_629_ >= aPureJavaToolkit5770.anInt6779 || i_641_ / i_629_ <= aPureJavaToolkit5770.anInt6790) {
						return;
					}
				} else if (i_640_ / i >= aPureJavaToolkit5770.anInt6779 || i_641_ / i <= aPureJavaToolkit5770.anInt6790) {
					return;
				}
				float f_642_;
				float f_643_;
				float f_644_;
				float f_645_;
				float f_646_;
				float f_647_;
				if (bool) {
					f_642_ = class336_sub2.aFloat8580;
					f_643_ = class336_sub2.aFloat8578;
					f_644_ = class336_sub2.aFloat8577;
					f_645_ = class336_sub2.aFloat8566;
					f_646_ = class336_sub2.aFloat8558;
					f_647_ = class336_sub2.aFloat8584;
				} else {
					f_642_ = class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8577;
					f_643_ = class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8577;
					f_644_ = class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8580 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8578 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8577;
					f_645_ = class336_sub2.aFloat8580 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8571 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8566 * aClass336_Sub2_5778.aFloat8584;
					f_646_ = class336_sub2.aFloat8578 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8561 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8558 * aClass336_Sub2_5778.aFloat8584;
					f_647_ = class336_sub2.aFloat8577 * aClass336_Sub2_5778.aFloat8566 + class336_sub2.aFloat8567 * aClass336_Sub2_5778.aFloat8558 + class336_sub2.aFloat8584 * aClass336_Sub2_5778.aFloat8584;
				}
				if (aPureJavaToolkit5770.anInt6795 > 1) {
					synchronized (this) {
						while (aBoolean5715) {
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						aBoolean5715 = true;
					}
				}
				method671(Thread.currentThread());
				if ((i_624_ & 0x2) != 0) {
					aClass185_5712.method1851(true);
				} else {
					aClass185_5712.method1851(false);
				}
				boolean bool_648_ = false;
				boolean bool_649_ = i_628_ <= aPureJavaToolkit5770.anInt6798;
				boolean bool_650_ = bool_649_ || aClass300Array5782 != null || aClass218Array5764 != null;
				aClass374_5741.anInt4635 = aClass185_5712.anInt2222;
				aClass374_5741.anInt4633 = aClass185_5712.anInt2216;
				aClass374_5741.anInt4653 = aClass185_5712.anInt2213;
				int i_651_ = aPureJavaToolkit5770.anInt6785;
				int i_652_ = aPureJavaToolkit5770.anInt6763;
				int i_653_ = aPureJavaToolkit5770.anInt6798;
				if (i == -1) {
					for (int i_654_ = 0; i_654_ < anInt5718; i_654_++) {
						int i_655_ = anIntArray5748[i_654_];
						int i_656_ = anIntArray5772[i_654_];
						int i_657_ = anIntArray5717[i_654_];
						float f_658_ = f_630_ + f_642_ * (float) i_655_ + f_631_ * (float) i_656_ + f_645_ * (float) i_657_;
						float f_659_ = f_636_ + f_643_ * (float) i_655_ + f_637_ * (float) i_656_ + f_646_ * (float) i_657_;
						float f_660_ = f + f_644_ * (float) i_655_ + f_625_ * (float) i_656_ + f_647_ * (float) i_657_;
						anIntArray5758[i_654_] = (int) f_660_;
						if (f_660_ >= (float) i_653_) {
							anIntArray5713[i_654_] = aClass374_5741.anInt4633 + (int) (f_658_ * (float) i_651_ / f_660_);
							anIntArray5716[i_654_] = aClass374_5741.anInt4653 + (int) (f_659_ * (float) i_652_ / f_660_);
						} else {
							anIntArray5713[i_654_] = -5000;
							bool_648_ = true;
						}
						if (bool_650_) {
							anIntArray5714[i_654_] = (int) f_658_;
							anIntArray5728[i_654_] = (int) f_659_;
							anIntArray5721[i_654_] = (int) f_660_;
						}
						if (aClass374_5741.aBoolean4617) {
							anIntArray5769[i_654_] = (int) (aClass336_Sub2_5778.aFloat8579 + (aClass336_Sub2_5778.aFloat8578 * (float) i_655_ + aClass336_Sub2_5778.aFloat8561 * (float) i_656_ + aClass336_Sub2_5778.aFloat8558 * (float) i_657_));
						}
					}
					if (aClass209Array5790 != null) {
						for (int i_661_ = 0; i_661_ < anInt5762; i_661_++) {
							Class209 class209 = aClass209Array5790[i_661_];
							Class214 class214 = aClass214Array5765[i_661_];
							short s = aShortArray5767[class209.anInt2485];
							short s_662_ = aShortArray5731[class209.anInt2485];
							short s_663_ = aShortArray5789[class209.anInt2485];
							int i_664_ = (anIntArray5748[s] + anIntArray5748[s_662_] + anIntArray5748[s_663_]) / 3;
							int i_665_ = (anIntArray5772[s] + anIntArray5772[s_662_] + anIntArray5772[s_663_]) / 3;
							int i_666_ = (anIntArray5717[s] + anIntArray5717[s_662_] + anIntArray5717[s_663_]) / 3;
							float f_667_ = (float) class214.anInt2516 + (f_630_ + f_642_ * (float) i_664_ + f_631_ * (float) i_665_ + f_645_ * (float) i_666_);
							float f_668_ = (float) class214.anInt2523 + (f_636_ + f_643_ * (float) i_664_ + f_637_ * (float) i_665_ + f_646_ * (float) i_666_);
							float f_669_ = f + f_644_ * (float) i_664_ + f_625_ * (float) i_665_ + f_647_ * (float) i_666_;
							if (f_669_ > (float) aPureJavaToolkit5770.anInt6798) {
								class214.anInt2515 = aPureJavaToolkit5770.anInt6786 + (int) (f_667_ * (float) i_651_ / f_669_);
								class214.anInt2521 = aPureJavaToolkit5770.anInt6769 + (int) (f_668_ * (float) i_652_ / f_669_);
								class214.anInt2518 = (int) f_669_ - class209.anInt2486;
								class214.anInt2526 = (int) ((float) (class214.anInt2517 * class209.aShort2484 * i_651_) / (f_669_ * 128.0F));
								class214.anInt2514 = (int) ((float) (class214.anInt2520 * class209.aShort2494 * i_652_) / (f_669_ * 128.0F));
							} else {
								class214.anInt2526 = class214.anInt2514 = 0;
							}
						}
					}
				} else {
					for (int i_670_ = 0; i_670_ < anInt5718; i_670_++) {
						int i_671_ = anIntArray5748[i_670_];
						int i_672_ = anIntArray5772[i_670_];
						int i_673_ = anIntArray5717[i_670_];
						float f_674_ = f_630_ + f_642_ * (float) i_671_ + f_631_ * (float) i_672_ + f_645_ * (float) i_673_;
						float f_675_ = f_636_ + f_643_ * (float) i_671_ + f_637_ * (float) i_672_ + f_646_ * (float) i_673_;
						float f_676_ = f + f_644_ * (float) i_671_ + f_625_ * (float) i_672_ + f_647_ * (float) i_673_;
						anIntArray5758[i_670_] = (int) f_676_;
						anIntArray5713[i_670_] = aClass374_5741.anInt4633 + (int) (f_674_ * (float) i_651_ / (float) i);
						anIntArray5716[i_670_] = aClass374_5741.anInt4653 + (int) (f_675_ * (float) i_652_ / (float) i);
						if (bool_650_) {
							anIntArray5714[i_670_] = (int) f_674_;
							anIntArray5728[i_670_] = (int) f_675_;
							anIntArray5721[i_670_] = i;
						}
						if (aClass374_5741.aBoolean4617) {
							anIntArray5769[i_670_] = (int) (aClass336_Sub2_5778.aFloat8579 + (aClass336_Sub2_5778.aFloat8578 * (float) i_671_ + aClass336_Sub2_5778.aFloat8561 * (float) i_672_ + aClass336_Sub2_5778.aFloat8558 * (float) i_673_));
						}
					}
					if (aClass209Array5790 != null) {
						for (int i_677_ = 0; i_677_ < anInt5762; i_677_++) {
							Class209 class209 = aClass209Array5790[i_677_];
							Class214 class214 = aClass214Array5765[i_677_];
							short s = aShortArray5767[class209.anInt2485];
							short s_678_ = aShortArray5731[class209.anInt2485];
							short s_679_ = aShortArray5789[class209.anInt2485];
							int i_680_ = (anIntArray5748[s] + anIntArray5748[s_678_] + anIntArray5748[s_679_]) / 3;
							int i_681_ = (anIntArray5772[s] + anIntArray5772[s_678_] + anIntArray5772[s_679_]) / 3;
							int i_682_ = (anIntArray5717[s] + anIntArray5717[s_678_] + anIntArray5717[s_679_]) / 3;
							float f_683_ = f_630_ + f_642_ * (float) i_680_ + f_631_ * (float) i_681_ + f_645_ * (float) i_682_;
							float f_684_ = f_636_ + f_643_ * (float) i_680_ + f_637_ * (float) i_681_ + f_646_ * (float) i_682_;
							class214.anInt2515 = aPureJavaToolkit5770.anInt6786 + (int) (f_683_ * (float) i_651_ / (float) i);
							class214.anInt2521 = aPureJavaToolkit5770.anInt6769 + (int) (f_684_ * (float) i_652_ / (float) i);
							class214.anInt2518 = i - class209.anInt2486;
							class214.anInt2526 = class214.anInt2517 * class209.aShort2484 * i_651_ / (i << 7);
							class214.anInt2514 = class214.anInt2520 * class209.aShort2494 * i_652_ / (i << 7);
						}
					}
				}
				if (entitynode_sub5 != null) {
					boolean bool_686_ = false;
					boolean bool_687_ = true;
					int i_688_ = aShort5757 + aShort5766 >> 1;
					int i_689_ = aShort5732 + aShort5730 >> 1;
					int i_690_ = i_688_;
					short s = aShort5759;
					int i_691_ = i_689_;
					float f_692_ = f_630_ + f_642_ * (float) i_690_ + f_631_ * (float) s + f_645_ * (float) i_691_;
					float f_693_ = f_636_ + f_643_ * (float) i_690_ + f_637_ * (float) s + f_646_ * (float) i_691_;
					float f_694_ = f + f_644_ * (float) i_690_ + f_625_ * (float) s + f_647_ * (float) i_691_;
					if (f_694_ >= (float) i_653_) {
						int i_695_ = (int) f_694_;
						if (i != -1) {
							i_695_ = i;
						}
						entitynode_sub5.anInt5985 = aPureJavaToolkit5770.anInt6786 + (int) (f_692_ * (float) i_651_ / (float) i_695_);
						entitynode_sub5.anInt5986 = aPureJavaToolkit5770.anInt6769 + (int) (f_693_ * (float) i_652_ / (float) i_695_);
					} else {
						bool_686_ = true;
					}
					i_690_ = i_688_;
					s = aShort5751;
					i_691_ = i_689_;
					float f_696_ = f_630_ + f_642_ * (float) i_690_ + f_631_ * (float) s + f_645_ * (float) i_691_;
					float f_697_ = f_636_ + f_643_ * (float) i_690_ + f_637_ * (float) s + f_646_ * (float) i_691_;
					float f_698_ = f + f_644_ * (float) i_690_ + f_625_ * (float) s + f_647_ * (float) i_691_;
					if (f_698_ >= (float) i_653_) {
						int i_699_ = (int) f_698_;
						if (i != -1) {
							i_699_ = i;
						}
						entitynode_sub5.anInt5982 = aPureJavaToolkit5770.anInt6786 + (int) (f_696_ * (float) i_651_ / (float) i_699_);
						entitynode_sub5.anInt5984 = aPureJavaToolkit5770.anInt6769 + (int) (f_697_ * (float) i_652_ / (float) i_699_);
					} else {
						bool_686_ = true;
					}
					if (bool_686_) {
						if (f_694_ < (float) i_653_ && f_698_ < (float) i_653_) {
							bool_687_ = false;
						} else if (f_694_ < (float) i_653_) {
							float f_700_ = (f_698_ - (float) aPureJavaToolkit5770.anInt6798) / (f_698_ - f_694_);
							int i_701_ = (int) (f_696_ + (f_696_ - f_692_) * f_700_);
							int i_702_ = (int) (f_697_ + (f_697_ - f_693_) * f_700_);
							int i_703_ = i_653_;
							if (i != -1) {
								i_703_ = i;
							}
							entitynode_sub5.anInt5985 = aPureJavaToolkit5770.anInt6786 + i_701_ * i_651_ / i_703_;
							entitynode_sub5.anInt5986 = aPureJavaToolkit5770.anInt6769 + i_702_ * i_652_ / i_703_;
						} else if (f_698_ < (float) i_653_) {
							float f_704_ = (f_694_ - (float) i_653_) / (f_694_ - f_698_);
							int i_705_ = (int) (f_692_ + (f_692_ - f_696_) * f_704_);
							int i_706_ = (int) (f_693_ + (f_693_ - f_697_) * f_704_);
							int i_707_ = i_653_;
							if (i != -1) {
								i_707_ = i;
							}
							entitynode_sub5.anInt5985 = aPureJavaToolkit5770.anInt6786 + i_705_ * i_651_ / i_707_;
							entitynode_sub5.anInt5986 = aPureJavaToolkit5770.anInt6769 + i_706_ * i_652_ / i_707_;
						}
					}
					if (bool_687_) {
						if (f_694_ > f_698_) {
							int i_708_ = (int) f_694_;
							if (i != -1) {
								i_708_ = i;
							}
							entitynode_sub5.anInt5983 = aPureJavaToolkit5770.anInt6786 + (int) ((f_692_ + (float) aShort5777) * (float) i_651_ / (float) i_708_) - entitynode_sub5.anInt5985;
						} else {
							int i_709_ = (int) f_698_;
							if (i != -1) {
								i_709_ = i;
							}
							entitynode_sub5.anInt5983 = aPureJavaToolkit5770.anInt6786 + (int) ((f_696_ + (float) aShort5777) * (float) i_651_ / (float) i_709_) - entitynode_sub5.anInt5982;
						}
						entitynode_sub5.aBoolean5987 = true;
					}
				}
				method655(true);
				aClass185_5712.aBoolean2226 = (i_624_ & 0x1) == 0;
				aClass185_5712.aBoolean2212 = false;
				try {
					boolean bool_710_ = (i_624_ & 0x4) != 0;
					if (bool_710_) {
						method668(bool_648_, aClass374_5741.aBoolean4621 && i_629_ > aClass374_5741.anInt4618 || aClass374_5741.aBoolean4617, i_628_, i_629_ - i_628_);
					} else {
						method681(bool_648_, aClass374_5741.aBoolean4621 && i_629_ > aClass374_5741.anInt4618 || aClass374_5741.aBoolean4617, i_628_, i_629_ - i_628_);
					}
				} catch (Exception exception) {
					/* empty */
				}
				if (aClass209Array5790 != null) {
					for (int i_711_ = 0; i_711_ < anInt5711; i_711_++)
						anIntArray5756[i_711_] = -1;
				}
				aClass185_5712 = null;
				if (aPureJavaToolkit5770.anInt6795 > 1) {
					synchronized (this) {
						aBoolean5715 = false;
						this.notifyAll();
					}
				}
			}
		}
	}
	
	final void s(int i) {
		if (aPureJavaToolkit5770.anInt6795 > 1) {
			synchronized (this) {
				if ((anInt5746 & 0x10000) == 65536 && (i & 0x10000) == 0) {
					method655(true);
				}
				anInt5746 = i;
			}
		} else {
			if ((anInt5746 & 0x10000) == 65536 && (i & 0x10000) == 0) {
				method655(true);
			}
			anInt5746 = i;
		}
	}
	
	private final void method681(boolean bool, boolean bool_712_, int i, int i_713_) {
		if (aClass209Array5790 != null) {
			for (int i_714_ = 0; i_714_ < anInt5762; i_714_++) {
				Class209 class209 = aClass209Array5790[i_714_];
				anIntArray5756[class209.anInt2485] = i_714_;
			}
		}
		if (aBoolean5720 || aClass209Array5790 != null) {
			if ((anInt5746 & 0x100) == 0 && aShortArray5719 != null) {
				for (int i_715_ = 0; i_715_ < anInt5711; i_715_++) {
					short s = aShortArray5719[i_715_];
					method674(s, bool, bool_712_);
				}
			} else {
				for (int i_716_ = 0; i_716_ < anInt5711; i_716_++) {
					if (!method658(i_716_) && !method678(i_716_)) {
						method674(i_716_, bool, bool_712_);
					}
				}
				if (aByteArray5768 == null) {
					for (int i_717_ = 0; i_717_ < anInt5711; i_717_++) {
						if (method658(i_717_) || method678(i_717_)) {
							method674(i_717_, bool, bool_712_);
						}
					}
				} else {
					for (int i_718_ = 0; i_718_ < 12; i_718_++) {
						for (int i_719_ = 0; i_719_ < anInt5711; i_719_++) {
							if (aByteArray5768[i_719_] == i_718_ && (method658(i_719_) || method678(i_719_))) {
								method674(i_719_, bool, bool_712_);
							}
						}
					}
				}
			}
		} else {
			for (int i_720_ = 0; i_720_ < anInt5711; i_720_++)
				method674(i_720_, bool, bool_712_);
		}
	}
	
	final int ma() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5755;
	}
	
	final void aa(short s, short s_721_) {
		if (aShortArray5773 != null) {
			if (!aBoolean5788 && s_721_ >= 0) {
				Class91 class91 = aPureJavaToolkit5770.aD1543.method10(s_721_ & 0xffff, -8217);
				if (class91.aByte1211 != 0 || class91.aByte1203 != 0) {
					aBoolean5788 = true;
				}
			}
			for (int i = 0; i < anInt5711; i++) {
				if (aShortArray5773[i] == s) {
					aShortArray5773[i] = s_721_;
				}
			}
		}
	}
	
	private final void method682() {
		synchronized (this) {
			for (int i = 0; i < anInt5753; i++) {
				anIntArray5748[i] = -anIntArray5748[i];
				anIntArray5717[i] = -anIntArray5717[i];
				if (aClass354Array5774[i] != null) {
					aClass354Array5774[i].anInt4347 = -aClass354Array5774[i].anInt4347;
					aClass354Array5774[i].anInt4346 = -aClass354Array5774[i].anInt4346;
				}
			}
			if (aClass272Array5775 != null) {
				for (int i = 0; i < anInt5711; i++) {
					if (aClass272Array5775[i] != null) {
						aClass272Array5775[i].anInt3484 = -aClass272Array5775[i].anInt3484;
						aClass272Array5775[i].anInt3483 = -aClass272Array5775[i].anInt3483;
					}
				}
			}
			for (int i = anInt5753; i < anInt5718; i++) {
				anIntArray5748[i] = -anIntArray5748[i];
				anIntArray5717[i] = -anIntArray5717[i];
			}
			anInt5744 = 0;
			aBoolean5792 = false;
		}
	}
	
	private final int method683(int i, short s, int i_722_) {
		int i_723_ = Class85.anIntArray1158[method686(i, i_722_)];
		Class91 class91 = aPureJavaToolkit5770.aD1543.method10(s & 0xffff, -8217);
		int i_724_ = class91.aByte1225 & 0xff;
		if (i_724_ != 0) {
			int i_725_ = 131586 * i_722_;
			if (i_724_ == 256) {
				i_723_ = i_725_;
			} else {
				int i_726_ = i_724_;
				int i_727_ = 256 - i_724_;
				i_723_ = ((i_725_ & 0xff00ff) * i_726_ + (i_723_ & 0xff00ff) * i_727_ & ~0xff00ff) + ((i_725_ & 0xff00) * i_726_ + (i_723_ & 0xff00) * i_727_ & 0xff0000) >> 8;
			}
		}
		int i_728_ = class91.aByte1217 & 0xff;
		if (i_728_ != 0) {
			i_728_ += 256;
			int i_729_ = ((i_723_ & 0xff0000) >> 16) * i_728_;
			if (i_729_ > 65535) {
				i_729_ = 65535;
			}
			int i_730_ = ((i_723_ & 0xff00) >> 8) * i_728_;
			if (i_730_ > 65535) {
				i_730_ = 65535;
			}
			int i_731_ = (i_723_ & 0xff) * i_728_;
			if (i_731_ > 65535) {
				i_731_ = 65535;
			}
			i_723_ = (i_729_ << 8 & 0xff0000) + (i_730_ & 0xff00) + (i_731_ >> 8);
		}
		return i_723_;
	}
	
	final void VA(int i) {
		if ((anInt5746 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int i_732_ = Class335.anIntArray4167[i];
		int i_733_ = Class335.anIntArray4165[i];
		synchronized (this) {
			for (int i_734_ = 0; i_734_ < anInt5718; i_734_++) {
				int i_735_ = anIntArray5772[i_734_] * i_732_ + anIntArray5748[i_734_] * i_733_ >> 14;
				anIntArray5772[i_734_] = anIntArray5772[i_734_] * i_733_ - anIntArray5748[i_734_] * i_732_ >> 14;
				anIntArray5748[i_734_] = i_735_;
			}
			method656();
		}
	}
	
	private final void method684() {
		synchronized (this) {
			for (int i = 0; i < anInt5753; i++) {
				int i_736_ = anIntArray5717[i];
				anIntArray5717[i] = anIntArray5748[i];
				anIntArray5748[i] = -i_736_;
				if (aClass354Array5774[i] != null) {
					i_736_ = aClass354Array5774[i].anInt4346;
					aClass354Array5774[i].anInt4346 = aClass354Array5774[i].anInt4347;
					aClass354Array5774[i].anInt4347 = -i_736_;
				}
			}
			if (aClass272Array5775 != null) {
				for (int i = 0; i < anInt5711; i++) {
					if (aClass272Array5775[i] != null) {
						int i_737_ = aClass272Array5775[i].anInt3483;
						aClass272Array5775[i].anInt3483 = aClass272Array5775[i].anInt3484;
						aClass272Array5775[i].anInt3484 = -i_737_;
					}
				}
			}
			for (int i = anInt5753; i < anInt5718; i++) {
				int i_738_ = anIntArray5717[i];
				anIntArray5717[i] = anIntArray5748[i];
				anIntArray5748[i] = -i_738_;
			}
			anInt5744 = 0;
			aBoolean5792 = false;
		}
	}
	
	final int G() {
		if (!aBoolean5792) {
			method677();
		}
		return aShort5730;
	}
	
	private final void method685(int i) {
		short s = aShortArray5767[i];
		short s_739_ = aShortArray5731[i];
		short s_740_ = aShortArray5789[i];
		if (aShortArray5773 == null || aShortArray5773[i] == -1) {
			if (aByteArray5784 == null) {
				aClass185_5712.anInt2220 = 0;
			} else {
				aClass185_5712.anInt2220 = aByteArray5784[i] & 0xff;
			}
			if (anIntArray5761[i] == -1) {
				aClass185_5712.method1867((float) anIntArray5716[s], (float) anIntArray5716[s_739_], (float) anIntArray5716[s_740_], (float) anIntArray5713[s], (float) anIntArray5713[s_739_], (float) anIntArray5713[s_740_], (float) anIntArray5758[s], (float) anIntArray5758[s_739_], (float) anIntArray5758[s_740_], Class170.anIntArray2054[anIntArray5754[i] & 0xffff]);
			} else {
				aClass185_5712.method1865((float) anIntArray5716[s], (float) anIntArray5716[s_739_], (float) anIntArray5716[s_740_], (float) anIntArray5713[s], (float) anIntArray5713[s_739_], (float) anIntArray5713[s_740_], (float) anIntArray5758[s], (float) anIntArray5758[s_739_], (float) anIntArray5758[s_740_], (float) (anIntArray5754[i] & 0xffff), (float) (anIntArray5739[i] & 0xffff), (float) (anIntArray5761[i] & 0xffff));
			}
		} else {
			int i_741_ = -16777216;
			if (aByteArray5784 != null) {
				i_741_ = 255 - (aByteArray5784[i] & 0xff) << 24;
			}
			if (anIntArray5761[i] == -1) {
				int i_742_ = i_741_ | anIntArray5754[i] & 0xffffff;
				aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_739_], (float) anIntArray5716[s_740_], (float) anIntArray5713[s], (float) anIntArray5713[s_739_], (float) anIntArray5713[s_740_], (float) anIntArray5758[s], (float) anIntArray5758[s_739_], (float) anIntArray5758[s_740_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_742_, i_742_, i_742_, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
			} else {
				aClass185_5712.method1859((float) anIntArray5716[s], (float) anIntArray5716[s_739_], (float) anIntArray5716[s_740_], (float) anIntArray5713[s], (float) anIntArray5713[s_739_], (float) anIntArray5713[s_740_], (float) anIntArray5758[s], (float) anIntArray5758[s_739_], (float) anIntArray5758[s_740_], aFloatArrayArray5763[i][0], aFloatArrayArray5763[i][1], aFloatArrayArray5763[i][2], aFloatArrayArray5776[i][0], aFloatArrayArray5776[i][1], aFloatArrayArray5776[i][2], i_741_ | anIntArray5754[i] & 0xffffff, i_741_ | anIntArray5739[i] & 0xffffff, i_741_ | anIntArray5761[i] & 0xffffff, aClass374_5741.anInt4611, 0, 0, 0, aShortArray5773[i]);
			}
		}
	}
	
	final boolean r() {
		return aBoolean5788;
	}
	
	final boolean NA() {
		if (anIntArrayArray5722 == null) {
			return false;
		}
		anInt5779 = 0;
		anInt5752 = 0;
		anInt5743 = 0;
		return true;
	}
	
	final void p(int i, int i_743_, Plane plane, Plane plane_744_, int i_745_, int i_746_, int i_747_) {
		if (i == 3) {
			if ((anInt5746 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((anInt5746 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!aBoolean5792) {
			method677();
		}
		int i_748_ = i_745_ + aShort5757;
		int i_749_ = i_745_ + aShort5766;
		int i_750_ = i_747_ + aShort5732;
		int i_751_ = i_747_ + aShort5730;
		if (i == 4 || i_748_ >= 0 && i_749_ + plane.anInt3398 >> plane.anInt3410 < plane.anInt3408 && i_750_ >= 0 && i_751_ + plane.anInt3398 >> plane.anInt3410 < plane.anInt3404) {
			int[][] is = ((Plane_Sub1) plane).anIntArrayArray3407;
			int[][] is_752_ = null;
			if (plane_744_ != null) {
				is_752_ = ((Plane_Sub1) plane_744_).anIntArrayArray3407;
			}
			if (i == 4 || i == 5) {
				if (plane_744_ == null || (i_748_ < 0 || i_749_ + plane_744_.anInt3398 >> plane_744_.anInt3410 >= plane_744_.anInt3408 || i_750_ < 0 || i_751_ + plane_744_.anInt3398 >> plane_744_.anInt3410 >= plane_744_.anInt3404)) {
					return;
				}
			} else {
				i_748_ >>= plane.anInt3410;
				i_749_ = i_749_ + (plane.anInt3398 - 1) >> plane.anInt3410;
				i_750_ >>= plane.anInt3410;
				i_751_ = i_751_ + (plane.anInt3398 - 1) >> plane.anInt3410;
				if (is[i_748_][i_750_] == i_746_ && is[i_749_][i_750_] == i_746_ && is[i_748_][i_751_] == i_746_ && is[i_749_][i_751_] == i_746_) {
					return;
				}
			}
			synchronized (this) {
				if (i == 1) {
					int i_753_ = plane.anInt3398 - 1;
					for (int i_754_ = 0; i_754_ < anInt5753; i_754_++) {
						int i_755_ = anIntArray5748[i_754_] + i_745_;
						int i_756_ = anIntArray5717[i_754_] + i_747_;
						int i_757_ = i_755_ & i_753_;
						int i_758_ = i_756_ & i_753_;
						int i_759_ = i_755_ >> plane.anInt3410;
						int i_760_ = i_756_ >> plane.anInt3410;
						int i_761_ = is[i_759_][i_760_] * (plane.anInt3398 - i_757_) + is[i_759_ + 1][i_760_] * i_757_ >> plane.anInt3410;
						int i_762_ = is[i_759_][i_760_ + 1] * (plane.anInt3398 - i_757_) + is[i_759_ + 1][i_760_ + 1] * i_757_ >> plane.anInt3410;
						int i_763_ = i_761_ * (plane.anInt3398 - i_758_) + i_762_ * i_758_ >> plane.anInt3410;
						anIntArray5772[i_754_] = anIntArray5772[i_754_] + i_763_ - i_746_;
					}
					for (int i_764_ = anInt5753; i_764_ < anInt5718; i_764_++) {
						int i_765_ = anIntArray5748[i_764_] + i_745_;
						int i_766_ = anIntArray5717[i_764_] + i_747_;
						int i_767_ = i_765_ & i_753_;
						int i_768_ = i_766_ & i_753_;
						int i_769_ = i_765_ >> plane.anInt3410;
						int i_770_ = i_766_ >> plane.anInt3410;
						if (i_769_ >= 0 && i_769_ < is.length - 1 && i_770_ >= 0 && i_770_ < is[0].length - 1) {
							int i_771_ = is[i_769_][i_770_] * (plane.anInt3398 - i_767_) + is[i_769_ + 1][i_770_] * i_767_ >> plane.anInt3410;
							int i_772_ = is[i_769_][i_770_ + 1] * (plane.anInt3398 - i_767_) + is[i_769_ + 1][i_770_ + 1] * i_767_ >> plane.anInt3410;
							int i_773_ = i_771_ * (plane.anInt3398 - i_768_) + i_772_ * i_768_ >> plane.anInt3410;
							anIntArray5772[i_764_] = anIntArray5772[i_764_] + i_773_ - i_746_;
						}
					}
				} else if (i == 2) {
					int i_774_ = plane.anInt3398 - 1;
					for (int i_775_ = 0; i_775_ < anInt5753; i_775_++) {
						int i_776_ = (anIntArray5772[i_775_] << 16) / aShort5759;
						if (i_776_ < i_743_) {
							int i_777_ = anIntArray5748[i_775_] + i_745_;
							int i_778_ = anIntArray5717[i_775_] + i_747_;
							int i_779_ = i_777_ & i_774_;
							int i_780_ = i_778_ & i_774_;
							int i_781_ = i_777_ >> plane.anInt3410;
							int i_782_ = i_778_ >> plane.anInt3410;
							int i_783_ = is[i_781_][i_782_] * (plane.anInt3398 - i_779_) + is[i_781_ + 1][i_782_] * i_779_ >> plane.anInt3410;
							int i_784_ = is[i_781_][i_782_ + 1] * (plane.anInt3398 - i_779_) + is[i_781_ + 1][i_782_ + 1] * i_779_ >> plane.anInt3410;
							int i_785_ = i_783_ * (plane.anInt3398 - i_780_) + i_784_ * i_780_ >> plane.anInt3410;
							anIntArray5772[i_775_] = anIntArray5772[i_775_] + (i_785_ - i_746_) * (i_743_ - i_776_) / i_743_;
						} else {
							anIntArray5772[i_775_] = anIntArray5772[i_775_];
						}
					}
					for (int i_786_ = anInt5753; i_786_ < anInt5718; i_786_++) {
						int i_787_ = (anIntArray5772[i_786_] << 16) / aShort5759;
						if (i_787_ < i_743_) {
							int i_788_ = anIntArray5748[i_786_] + i_745_;
							int i_789_ = anIntArray5717[i_786_] + i_747_;
							int i_790_ = i_788_ & i_774_;
							int i_791_ = i_789_ & i_774_;
							int i_792_ = i_788_ >> plane.anInt3410;
							int i_793_ = i_789_ >> plane.anInt3410;
							if (i_792_ >= 0 && i_792_ < plane.anInt3408 - 1 && i_793_ >= 0 && i_793_ < plane.anInt3404 - 1) {
								int i_794_ = is[i_792_][i_793_] * (plane.anInt3398 - i_790_) + is[i_792_ + 1][i_793_] * i_790_ >> plane.anInt3410;
								int i_795_ = is[i_792_][i_793_ + 1] * (plane.anInt3398 - i_790_) + is[i_792_ + 1][i_793_ + 1] * i_790_ >> plane.anInt3410;
								int i_796_ = i_794_ * (plane.anInt3398 - i_791_) + i_795_ * i_791_ >> plane.anInt3410;
								anIntArray5772[i_786_] = anIntArray5772[i_786_] + (i_796_ - i_746_) * (i_743_ - i_787_) / i_743_;
							}
						} else {
							anIntArray5772[i_786_] = anIntArray5772[i_786_];
						}
					}
				} else if (i == 3) {
					int i_797_ = (i_743_ & 0xff) * 4;
					int i_798_ = (i_743_ >> 8 & 0xff) * 4;
					int i_799_ = (i_743_ >> 16 & 0xff) << 6;
					int i_800_ = (i_743_ >> 24 & 0xff) << 6;
					if (i_745_ - (i_797_ >> 1) < 0 || i_745_ + (i_797_ >> 1) + plane.anInt3398 >= plane.anInt3408 << plane.anInt3410 || i_747_ - (i_798_ >> 1) < 0 || i_747_ + (i_798_ >> 1) + plane.anInt3398 >= plane.anInt3404 << plane.anInt3410) {
						return;
					}
					this.method628(i_746_, i_799_, i_745_, -7024, i_797_, i_747_, i_798_, plane, i_800_);
				} else if (i == 4) {
					int i_801_ = plane_744_.anInt3398 - 1;
					int i_802_ = aShort5751 - aShort5759;
					for (int i_803_ = 0; i_803_ < anInt5753; i_803_++) {
						int i_804_ = anIntArray5748[i_803_] + i_745_;
						int i_805_ = anIntArray5717[i_803_] + i_747_;
						int i_806_ = i_804_ & i_801_;
						int i_807_ = i_805_ & i_801_;
						int i_808_ = i_804_ >> plane_744_.anInt3410;
						int i_809_ = i_805_ >> plane_744_.anInt3410;
						int i_810_ = is_752_[i_808_][i_809_] * (plane_744_.anInt3398 - i_806_) + is_752_[i_808_ + 1][i_809_] * i_806_ >> plane_744_.anInt3410;
						int i_811_ = is_752_[i_808_][i_809_ + 1] * (plane_744_.anInt3398 - i_806_) + is_752_[i_808_ + 1][i_809_ + 1] * i_806_ >> plane_744_.anInt3410;
						int i_812_ = i_810_ * (plane_744_.anInt3398 - i_807_) + i_811_ * i_807_ >> plane_744_.anInt3410;
						anIntArray5772[i_803_] = anIntArray5772[i_803_] + (i_812_ - i_746_) + i_802_;
					}
					for (int i_813_ = anInt5753; i_813_ < anInt5718; i_813_++) {
						int i_814_ = anIntArray5748[i_813_] + i_745_;
						int i_815_ = anIntArray5717[i_813_] + i_747_;
						int i_816_ = i_814_ & i_801_;
						int i_817_ = i_815_ & i_801_;
						int i_818_ = i_814_ >> plane_744_.anInt3410;
						int i_819_ = i_815_ >> plane_744_.anInt3410;
						if (i_818_ >= 0 && i_818_ < plane_744_.anInt3408 - 1 && i_819_ >= 0 && i_819_ < plane_744_.anInt3404 - 1) {
							int i_820_ = is_752_[i_818_][i_819_] * (plane_744_.anInt3398 - i_816_) + is_752_[i_818_ + 1][i_819_] * i_816_ >> plane_744_.anInt3410;
							int i_821_ = is_752_[i_818_][i_819_ + 1] * (plane_744_.anInt3398 - i_816_) + is_752_[i_818_ + 1][i_819_ + 1] * i_816_ >> plane_744_.anInt3410;
							int i_822_ = i_820_ * (plane_744_.anInt3398 - i_817_) + i_821_ * i_817_ >> plane_744_.anInt3410;
							anIntArray5772[i_813_] = anIntArray5772[i_813_] + (i_822_ - i_746_) + i_802_;
						}
					}
				} else if (i == 5) {
					int i_823_ = plane_744_.anInt3398 - 1;
					int i_824_ = aShort5751 - aShort5759;
					for (int i_825_ = 0; i_825_ < anInt5753; i_825_++) {
						int i_826_ = anIntArray5748[i_825_] + i_745_;
						int i_827_ = anIntArray5717[i_825_] + i_747_;
						int i_828_ = i_826_ & i_823_;
						int i_829_ = i_827_ & i_823_;
						int i_830_ = i_826_ >> plane.anInt3410;
						int i_831_ = i_827_ >> plane.anInt3410;
						int i_832_ = is[i_830_][i_831_] * (plane.anInt3398 - i_828_) + is[i_830_ + 1][i_831_] * i_828_ >> plane.anInt3410;
						int i_833_ = is[i_830_][i_831_ + 1] * (plane.anInt3398 - i_828_) + is[i_830_ + 1][i_831_ + 1] * i_828_ >> plane.anInt3410;
						int i_834_ = i_832_ * (plane.anInt3398 - i_829_) + i_833_ * i_829_ >> plane.anInt3410;
						i_832_ = is_752_[i_830_][i_831_] * (plane_744_.anInt3398 - i_828_) + is_752_[i_830_ + 1][i_831_] * i_828_ >> plane_744_.anInt3410;
						i_833_ = is_752_[i_830_][i_831_ + 1] * (plane_744_.anInt3398 - i_828_) + is_752_[i_830_ + 1][i_831_ + 1] * i_828_ >> plane_744_.anInt3410;
						int i_835_ = i_832_ * (plane_744_.anInt3398 - i_829_) + i_833_ * i_829_ >> plane_744_.anInt3410;
						int i_836_ = i_834_ - i_835_ - i_743_;
						anIntArray5772[i_825_] = ((anIntArray5772[i_825_] << 8) / i_824_ * i_836_ >> 8) - (i_746_ - i_834_);
					}
					for (int i_837_ = anInt5753; i_837_ < anInt5718; i_837_++) {
						int i_838_ = anIntArray5748[i_837_] + i_745_;
						int i_839_ = anIntArray5717[i_837_] + i_747_;
						int i_840_ = i_838_ & i_823_;
						int i_841_ = i_839_ & i_823_;
						int i_842_ = i_838_ >> plane.anInt3410;
						int i_843_ = i_839_ >> plane.anInt3410;
						if (i_842_ >= 0 && i_842_ < plane.anInt3408 - 1 && i_842_ < plane_744_.anInt3408 - 1 && i_843_ >= 0 && i_843_ < plane.anInt3404 - 1 && i_843_ < plane_744_.anInt3404 - 1) {
							int i_844_ = is[i_842_][i_843_] * (plane.anInt3398 - i_840_) + is[i_842_ + 1][i_843_] * i_840_ >> plane.anInt3410;
							int i_845_ = is[i_842_][i_843_ + 1] * (plane.anInt3398 - i_840_) + is[i_842_ + 1][i_843_ + 1] * i_840_ >> plane.anInt3410;
							int i_846_ = i_844_ * (plane.anInt3398 - i_841_) + i_845_ * i_841_ >> plane.anInt3410;
							i_844_ = is_752_[i_842_][i_843_] * (plane_744_.anInt3398 - i_840_) + is_752_[i_842_ + 1][i_843_] * i_840_ >> plane_744_.anInt3410;
							i_845_ = is_752_[i_842_][i_843_ + 1] * (plane_744_.anInt3398 - i_840_) + is_752_[i_842_ + 1][i_843_ + 1] * i_840_ >> plane_744_.anInt3410;
							int i_847_ = i_844_ * (plane_744_.anInt3398 - i_841_) + i_845_ * i_841_ >> plane_744_.anInt3410;
							int i_848_ = i_846_ - i_847_ - i_743_;
							anIntArray5772[i_837_] = ((anIntArray5772[i_837_] << 8) / i_824_ * i_848_ >> 8) - (i_746_ - i_846_);
						}
					}
				}
				aBoolean5792 = false;
			}
		}
	}
	
	private final int method686(int i, int i_849_) {
		i_849_ = i_849_ * (i & 0x7f) >> 7;
		if (i_849_ < 2) {
			i_849_ = 2;
		} else if (i_849_ > 126) {
			i_849_ = 126;
		}
		return (i & 0xff80) + i_849_;
	}
	
	private final void method687(Thread thread) {
		Class374 class374 = aPureJavaToolkit5770.method1494(thread);
		if (class374 != aClass374_5726) {
			aClass374_5726 = class374;
			aPureJavaDrawableModelArray5750 = aClass374_5726.aPureJavaDrawableModelArray4652;
			aPureJavaDrawableModelArray5733 = aClass374_5726.aPureJavaDrawableModelArray4651;
		}
	}
	
	PureJavaDrawableModel(PureJavaToolkit purejavatoolkit) {
		anInt5711 = 0;
		anInt5753 = 0;
		anInt5718 = 0;
		aBoolean5734 = false;
		aBoolean5720 = false;
		anInt5744 = 0;
		aBoolean5723 = false;
		aBoolean5792 = false;
		aBoolean5788 = false;
		aPureJavaToolkit5770 = purejavatoolkit;
	}
	
	PureJavaDrawableModel(PureJavaToolkit purejavatoolkit, Model model, int i, int i_850_, int i_851_, int i_852_) {
		anInt5711 = 0;
		anInt5753 = 0;
		anInt5718 = 0;
		aBoolean5734 = false;
		aBoolean5720 = false;
		anInt5744 = 0;
		aBoolean5723 = false;
		aBoolean5792 = false;
		aBoolean5788 = false;
		aPureJavaToolkit5770 = purejavatoolkit;
		anInt5746 = i;
		anInt5791 = i_850_;
		anInt5727 = i_851_;
		d var_d = aPureJavaToolkit5770.aD1543;
		anInt5718 = model.anInt2599;
		anInt5753 = model.anInt2573;
		anIntArray5748 = model.anIntArray2616;
		anIntArray5772 = model.anIntArray2576;
		anIntArray5717 = model.anIntArray2574;
		anInt5711 = model.anInt2572;
		aShortArray5767 = model.aShortArray2600;
		aShortArray5731 = model.aShortArray2583;
		aShortArray5789 = model.aShortArray2589;
		aByteArray5768 = model.aByteArray2607;
		aShortArray5740 = model.aShortArray2580;
		aByteArray5784 = model.aByteArray2622;
		aShortArray5787 = model.aShortArray2575;
		aByteArray5736 = model.aByteArray2594;
		aClass300Array5782 = model.aClass300Array2590;
		aClass218Array5764 = model.aClass218Array2620;
		aShortArray5747 = model.aShortArray2582;
		int[] is = new int[anInt5711];
		for (int i_853_ = 0; i_853_ < anInt5711; i_853_++)
			is[i_853_] = i_853_;
		long[] ls = new long[anInt5711];
		boolean bool = (anInt5746 & 0x100) != 0;
		for (int i_854_ = 0; i_854_ < anInt5711; i_854_++) {
			int i_855_ = is[i_854_];
			Class91 class91 = null;
			int i_856_ = 0;
			int i_857_ = 0;
			int i_858_ = 0;
			int i_859_ = 0;
			if (model.aClass17Array2621 != null) {
				boolean bool_860_ = false;
				for (int i_861_ = 0; i_861_ < model.aClass17Array2621.length; i_861_++) {
					Class17 class17 = model.aClass17Array2621[i_861_];
					if (i_855_ == class17.anInt273) {
						Class352 class352 = Class215.method2067(0, class17.anInt279);
						if (class352.aBoolean4325) {
							bool_860_ = true;
						}
						if (class352.anInt4330 != -1) {
							Class91 class91_862_ = var_d.method10(class352.anInt4330, -8217);
							if (class91_862_.anInt1226 == 2) {
								aBoolean5720 = true;
							}
						}
					}
				}
				if (bool_860_) {
					ls[i_854_] = 9223372036854775807L;
				}
			}
			int i_863_ = -1;
			if (model.aShortArray2587 != null) {
				i_863_ = model.aShortArray2587[i_855_];
				if (i_863_ != -1) {
					class91 = var_d.method10(i_863_ & 0xffff, -8217);
					if ((i_852_ & 0x40) == 0 || !class91.aBoolean1223) {
						i_858_ = class91.aByte1214;
						i_859_ = class91.aByte1213;
					} else {
						i_863_ = -1;
					}
				}
			}
			boolean bool_864_ = aByteArray5784 != null && aByteArray5784[i_855_] != 0 || class91 != null && class91.anInt1226 == 2;
			if ((bool || bool_864_) && aByteArray5768 != null) {
				i_856_ += aByteArray5768[i_855_] << 17;
			}
			if (bool_864_) {
				i_856_ += 65536;
			}
			i_856_ += (i_858_ & 0xff) << 8;
			i_856_ += i_859_ & 0xff;
			i_857_ += (i_863_ & 0xffff) << 16;
			i_857_ += i_854_ & 0xffff;
			ls[i_854_] = ((long) i_856_ << 32) + (long) i_857_;
			aBoolean5720 |= bool_864_;
		}
		Node_Sub3.method2170(122, ls, is);
		if (model.aClass17Array2621 != null) {
			anInt5762 = model.aClass17Array2621.length;
			aClass209Array5790 = new Class209[anInt5762];
			aClass214Array5765 = new Class214[anInt5762];
			for (int i_865_ = 0; i_865_ < model.aClass17Array2621.length; i_865_++) {
				Class17 class17 = model.aClass17Array2621[i_865_];
				Class352 class352 = Class215.method2067(0, class17.anInt279);
				int i_866_ = Class170.anIntArray2054[model.aShortArray2580[class17.anInt273] & 0xffff] & 0xffffff;
				i_866_ = i_866_ | 255 - (model.aByteArray2622 != null ? model.aByteArray2622[class17.anInt273] & 0xff : 0) << 24;
				aClass209Array5790[i_865_] = new Class209(class17.anInt273, model.aShortArray2600[class17.anInt273], model.aShortArray2583[class17.anInt273], model.aShortArray2589[class17.anInt273], class352.anInt4334, class352.anInt4326, class352.anInt4330, class352.anInt4336, class352.anInt4324, class352.aBoolean4325, class17.anInt278);
				aClass214Array5765[i_865_] = new Class214(i_866_);
			}
		}
		aFloatArrayArray5763 = new float[anInt5711][];
		aFloatArrayArray5776 = new float[anInt5711][];
		Class345 class345 = Class34.method367(87, model, anInt5711, is);
		Class374 class374 = aPureJavaToolkit5770.method1494(Thread.currentThread());
		float[] fs = class374.aFloatArray4638;
		boolean bool_867_ = false;
		for (int i_868_ = 0; i_868_ < anInt5711; i_868_++) {
			int i_869_ = is[i_868_];
			int i_870_;
			if (model.aByteArray2610 == null) {
				i_870_ = -1;
			} else {
				i_870_ = model.aByteArray2610[i_869_];
			}
			int i_871_ = model.aShortArray2587 == null ? -1 : model.aShortArray2587[i_869_];
			if (i_871_ != -1 && (i_852_ & 0x40) != 0) {
				Class91 class91 = var_d.method10(i_871_ & 0xffff, -8217);
				if (class91.aBoolean1223) {
					i_871_ = -1;
				}
			}
			if (i_871_ != -1) {
				bool_867_ = true;
				float[] fs_872_ = aFloatArrayArray5763[i_869_] = new float[3];
				float[] fs_873_ = aFloatArrayArray5776[i_869_] = new float[3];
				if (i_870_ == -1) {
					fs_872_[0] = 0.0F;
					fs_873_[0] = 1.0F;
					fs_872_[1] = 1.0F;
					fs_873_[1] = 1.0F;
					fs_872_[2] = 0.0F;
					fs_873_[2] = 0.0F;
				} else {
					i_870_ &= 0xff;
					byte b = model.aByteArray2586[i_870_];
					if (b == 0) {
						short s = aShortArray5767[i_869_];
						short s_875_ = aShortArray5731[i_869_];
						short s_876_ = aShortArray5789[i_869_];
						short s_877_ = model.aShortArray2613[i_870_];
						short s_878_ = model.aShortArray2577[i_870_];
						short s_879_ = model.aShortArray2604[i_870_];
						float f = (float) anIntArray5748[s_877_];
						float f_880_ = (float) anIntArray5772[s_877_];
						float f_881_ = (float) anIntArray5717[s_877_];
						float f_882_ = (float) anIntArray5748[s_878_] - f;
						float f_883_ = (float) anIntArray5772[s_878_] - f_880_;
						float f_884_ = (float) anIntArray5717[s_878_] - f_881_;
						float f_885_ = (float) anIntArray5748[s_879_] - f;
						float f_886_ = (float) anIntArray5772[s_879_] - f_880_;
						float f_887_ = (float) anIntArray5717[s_879_] - f_881_;
						float f_888_ = (float) anIntArray5748[s] - f;
						float f_889_ = (float) anIntArray5772[s] - f_880_;
						float f_890_ = (float) anIntArray5717[s] - f_881_;
						float f_891_ = (float) anIntArray5748[s_875_] - f;
						float f_892_ = (float) anIntArray5772[s_875_] - f_880_;
						float f_893_ = (float) anIntArray5717[s_875_] - f_881_;
						float f_894_ = (float) anIntArray5748[s_876_] - f;
						float f_895_ = (float) anIntArray5772[s_876_] - f_880_;
						float f_896_ = (float) anIntArray5717[s_876_] - f_881_;
						float f_897_ = f_883_ * f_887_ - f_884_ * f_886_;
						float f_898_ = f_884_ * f_885_ - f_882_ * f_887_;
						float f_899_ = f_882_ * f_886_ - f_883_ * f_885_;
						float f_900_ = f_886_ * f_899_ - f_887_ * f_898_;
						float f_901_ = f_887_ * f_897_ - f_885_ * f_899_;
						float f_902_ = f_885_ * f_898_ - f_886_ * f_897_;
						float f_903_ = 1.0F / (f_900_ * f_882_ + f_901_ * f_883_ + f_902_ * f_884_);
						fs_872_[0] = (f_900_ * f_888_ + f_901_ * f_889_ + f_902_ * f_890_) * f_903_;
						fs_872_[1] = (f_900_ * f_891_ + f_901_ * f_892_ + f_902_ * f_893_) * f_903_;
						fs_872_[2] = (f_900_ * f_894_ + f_901_ * f_895_ + f_902_ * f_896_) * f_903_;
						f_900_ = f_883_ * f_899_ - f_884_ * f_898_;
						f_901_ = f_884_ * f_897_ - f_882_ * f_899_;
						f_902_ = f_882_ * f_898_ - f_883_ * f_897_;
						f_903_ = 1.0F / (f_900_ * f_885_ + f_901_ * f_886_ + f_902_ * f_887_);
						fs_873_[0] = (f_900_ * f_888_ + f_901_ * f_889_ + f_902_ * f_890_) * f_903_;
						fs_873_[1] = (f_900_ * f_891_ + f_901_ * f_892_ + f_902_ * f_893_) * f_903_;
						fs_873_[2] = (f_900_ * f_894_ + f_901_ * f_895_ + f_902_ * f_896_) * f_903_;
					} else {
						short s = aShortArray5767[i_869_];
						short s_904_ = aShortArray5731[i_869_];
						short s_905_ = aShortArray5789[i_869_];
						int i_906_ = class345.anIntArray4268[i_870_];
						int i_907_ = class345.anIntArray4272[i_870_];
						int i_908_ = class345.anIntArray4266[i_870_];
						float[] fs_909_ = class345.aFloatArrayArray4265[i_870_];
						byte b_910_ = model.aByteArray2585[i_870_];
						float f = (float) model.anIntArray2617[i_870_] / 256.0F;
						if (b == 1) {
							float f_911_ = (float) model.anIntArray2593[i_870_] / 1024.0F;
							Class262_Sub1.method3151(fs_909_, f, i_908_, anIntArray5748[s], b_910_, fs, f_911_, i_907_, -2356, anIntArray5772[s], anIntArray5717[s], i_906_);
							fs_872_[0] = fs[0];
							fs_873_[0] = fs[1];
							Class262_Sub1.method3151(fs_909_, f, i_908_, anIntArray5748[s_904_], b_910_, fs, f_911_, i_907_, -2356, anIntArray5772[s_904_], anIntArray5717[s_904_], i_906_);
							fs_872_[1] = fs[0];
							fs_873_[1] = fs[1];
							Class262_Sub1.method3151(fs_909_, f, i_908_, anIntArray5748[s_905_], b_910_, fs, f_911_, i_907_, -2356, anIntArray5772[s_905_], anIntArray5717[s_905_], i_906_);
							fs_872_[2] = fs[0];
							fs_873_[2] = fs[1];
							float f_912_ = f_911_ / 2.0F;
							if ((b_910_ & 0x1) == 0) {
								if (fs_872_[1] - fs_872_[0] > f_912_) {
									fs_872_[1] -= f_911_;
								} else if (fs_872_[0] - fs_872_[1] > f_912_) {
									fs_872_[1] += f_911_;
								}
								if (fs_872_[2] - fs_872_[0] > f_912_) {
									fs_872_[2] -= f_911_;
								} else if (fs_872_[0] - fs_872_[2] > f_912_) {
									fs_872_[2] += f_911_;
								}
							} else {
								if (fs_873_[1] - fs_873_[0] > f_912_) {
									fs_873_[1] -= f_911_;
								} else if (fs_873_[0] - fs_873_[1] > f_912_) {
									fs_873_[1] += f_911_;
								}
								if (fs_873_[2] - fs_873_[0] > f_912_) {
									fs_873_[2] -= f_911_;
								} else if (fs_873_[0] - fs_873_[2] > f_912_) {
									fs_873_[2] += f_911_;
								}
							}
						} else if (b == 2) {
							float f_913_ = (float) model.anIntArray2615[i_870_] / 256.0F;
							float f_914_ = (float) model.anIntArray2584[i_870_] / 256.0F;
							int i_915_ = anIntArray5748[s_904_] - anIntArray5748[s];
							int i_916_ = anIntArray5772[s_904_] - anIntArray5772[s];
							int i_917_ = anIntArray5717[s_904_] - anIntArray5717[s];
							int i_918_ = anIntArray5748[s_905_] - anIntArray5748[s];
							int i_919_ = anIntArray5772[s_905_] - anIntArray5772[s];
							int i_920_ = anIntArray5717[s_905_] - anIntArray5717[s];
							int i_921_ = i_916_ * i_920_ - i_919_ * i_917_;
							int i_922_ = i_917_ * i_918_ - i_920_ * i_915_;
							int i_923_ = i_915_ * i_919_ - i_918_ * i_916_;
							float f_924_ = 64.0F / (float) model.anIntArray2603[i_870_];
							float f_925_ = 64.0F / (float) model.anIntArray2588[i_870_];
							float f_926_ = 64.0F / (float) model.anIntArray2593[i_870_];
							float f_927_ = ((float) i_921_ * fs_909_[0] + (float) i_922_ * fs_909_[1] + (float) i_923_ * fs_909_[2]) / f_924_;
							float f_928_ = ((float) i_921_ * fs_909_[3] + (float) i_922_ * fs_909_[4] + (float) i_923_ * fs_909_[5]) / f_925_;
							float f_929_ = ((float) i_921_ * fs_909_[6] + (float) i_922_ * fs_909_[7] + (float) i_923_ * fs_909_[8]) / f_926_;
							int i_930_ = Class91.method1036(2, f_929_, f_927_, f_928_);
							Class39.method407(f, i_930_, anIntArray5748[s], f_913_, i_907_, fs, anIntArray5772[s], 99, anIntArray5717[s], i_906_, i_908_, f_914_, fs_909_, b_910_);
							fs_872_[0] = fs[0];
							fs_873_[0] = fs[1];
							Class39.method407(f, i_930_, anIntArray5748[s_904_], f_913_, i_907_, fs, anIntArray5772[s_904_], 108, anIntArray5717[s_904_], i_906_, i_908_, f_914_, fs_909_, b_910_);
							fs_872_[1] = fs[0];
							fs_873_[1] = fs[1];
							Class39.method407(f, i_930_, anIntArray5748[s_905_], f_913_, i_907_, fs, anIntArray5772[s_905_], 75, anIntArray5717[s_905_], i_906_, i_908_, f_914_, fs_909_, b_910_);
							fs_872_[2] = fs[0];
							fs_873_[2] = fs[1];
						} else if (b == 3) {
							Class212.method2053(i_906_, anIntArray5717[s], anIntArray5772[s], fs, i_908_, f, fs_909_, b_910_, anIntArray5748[s], -4, i_907_);
							fs_872_[0] = fs[0];
							fs_873_[0] = fs[1];
							Class212.method2053(i_906_, anIntArray5717[s_904_], anIntArray5772[s_904_], fs, i_908_, f, fs_909_, b_910_, anIntArray5748[s_904_], -4, i_907_);
							fs_872_[1] = fs[0];
							fs_873_[1] = fs[1];
							Class212.method2053(i_906_, anIntArray5717[s_905_], anIntArray5772[s_905_], fs, i_908_, f, fs_909_, b_910_, anIntArray5748[s_905_], -4, i_907_);
							fs_872_[2] = fs[0];
							fs_873_[2] = fs[1];
							if ((b_910_ & 0x1) == 0) {
								if (fs_872_[1] - fs_872_[0] > 0.5F) {
									fs_872_[1]--;
								} else if (fs_872_[0] - fs_872_[1] > 0.5F) {
									fs_872_[1]++;
								}
								if (fs_872_[2] - fs_872_[0] > 0.5F) {
									fs_872_[2]--;
								} else if (fs_872_[0] - fs_872_[2] > 0.5F) {
									fs_872_[2]++;
								}
							} else {
								if (fs_873_[1] - fs_873_[0] > 0.5F) {
									fs_873_[1]--;
								} else if (fs_873_[0] - fs_873_[1] > 0.5F) {
									fs_873_[1]++;
								}
								if (fs_873_[2] - fs_873_[0] > 0.5F) {
									fs_873_[2]--;
								} else if (fs_873_[0] - fs_873_[2] > 0.5F) {
									fs_873_[2]++;
								}
							}
						}
					}
				}
			}
		}
		if (!bool_867_) {
			aFloatArrayArray5763 = aFloatArrayArray5776 = null;
		}
		if (model.anIntArray2598 != null && (anInt5746 & 0x20) != 0) {
			anIntArrayArray5722 = model.method2083(0, true);
		}
		if (model.anIntArray2602 != null && (anInt5746 & 0x180) != 0) {
			anIntArrayArray5725 = model.method2090((byte) 73);
		}
		if (model.aClass17Array2621 != null && (anInt5746 & 0x400) != 0) {
			anIntArrayArray5783 = model.method2088((byte) -80);
		}
		if (model.aShortArray2587 != null) {
			aShortArray5773 = new short[anInt5711];
			boolean bool_931_ = false;
			for (int i_932_ = 0; i_932_ < anInt5711; i_932_++) {
				short s = model.aShortArray2587[i_932_];
				if (s != -1) {
					Class91 class91 = aPureJavaToolkit5770.aD1543.method10(s, -8217);
					if ((i_852_ & 0x40) == 0 || !class91.aBoolean1223) {
						aShortArray5773[i_932_] = s;
						bool_931_ = true;
						if (class91.anInt1226 == 2) {
							aBoolean5720 = true;
						}
						if (class91.aByte1211 != 0 || class91.aByte1203 != 0) {
							aBoolean5788 = true;
						}
					} else {
						aShortArray5773[i_932_] = (short) -1;
					}
				} else {
					aShortArray5773[i_932_] = (short) -1;
				}
			}
			if (!bool_931_) {
				aShortArray5773 = null;
			}
		} else {
			aShortArray5773 = null;
		}
		if (aBoolean5720 || aClass209Array5790 != null) {
			aShortArray5719 = new short[anInt5711];
			for (int i_933_ = 0; i_933_ < anInt5711; i_933_++)
				aShortArray5719[i_933_] = (short) is[i_933_];
		}
	}
}
