/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class277
{
	static CacheNode_Sub13 aCacheNode_Sub13_3509;
	static int anInt3510;
	static int anInt3511;
	private Class71 aClass71_3512;
	private int[] anIntArray3513 = { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
	static int anInt3514;
	static int anInt3515;
	protected boolean aBoolean3516;
	static int anInt3517;
	protected byte[][][] aByteArrayArrayArray3518;
	static int anInt3519;
	protected int[][][] anIntArrayArrayArray3520;
	protected int anInt3521;
	private int[] anIntArray3522 = { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
	static int anInt3523;
	protected int anInt3524;
	private byte[][][] aByteArrayArrayArray3525;
	protected byte[][][] aByteArrayArrayArray3526;
	static int anInt3527;
	private byte[][][] aByteArrayArrayArray3528;
	static int anInt3529;
	private byte[][][] aByteArrayArrayArray3530;
	static int anInt3531;
	static int anInt3532;
	static int anInt3533;
	static int anInt3534;
	protected int anInt3535;
	private Class58 aClass58_3536;
	private byte[][][] aByteArrayArrayArray3537;
	
	final void method3337(BufferedStream buffer, int i, Class84[] class84s, int i_0_, byte b, int i_1_, int i_2_) {
		if (!aBoolean3516) {
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
				Class84 class84 = class84s[i_3_];
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -65; i_4_++) {
					for (int i_5_ = 0; i_5_ < 64; i_5_++) {
						int i_6_ = i_4_ + i_2_;
						int i_7_ = i_5_ + i;
						if (i_6_ >= 0 && (anInt3524 ^ 0xffffffff) < (i_6_ ^ 0xffffffff) && i_7_ >= 0 && i_7_ < anInt3521) {
							class84.method993(i_7_, i_6_, -121);
						}
					}
				}
			}
		}
		anInt3534++;
		int i_8_ = i_2_ + i_1_;
		int i_9_ = i_0_ + i;
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt3535 ^ 0xffffffff); i_10_++) {
			for (int i_11_ = 0; i_11_ < 64; i_11_++) {
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++)
					method3345(0, i + i_12_, 0, i_11_ - -i_2_, i_8_ + i_11_, buffer, 0, i_12_ + i_9_, i_10_, -682, false);
			}
		}
		if (b > -78) {
			anInt3535 = -107;
		}
	}
	
	final void method3338(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = 0;
		if (i != -1) {
			method3345(127, -89, 51, 33, 69, null, -119, 39, 58, -45, false);
		}
		for (/**/; (i_17_ ^ 0xffffffff) > (anInt3535 ^ 0xffffffff); i_17_++)
			method3347(-13972, i_13_, i_16_, i_14_, i_17_, i_15_);
		anInt3532++;
	}
	
	final void method3339(int i, int[][][] is, GraphicsToolkit graphicstoolkit, Class84[] class84s) {
		if (!aBoolean3516) {
			for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -5; i_18_++) {
				for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (anInt3524 ^ 0xffffffff); i_19_++) {
					for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (anInt3521 ^ 0xffffffff); i_20_++) {
						if ((0x1 & CacheNode_Sub11.aByteArrayArrayArray9550[i_18_][i_19_][i_20_] ^ 0xffffffff) != -1) {
							int i_21_ = i_18_;
							if ((0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[1][i_19_][i_20_]) != 0) {
								i_21_--;
							}
							if (i_21_ >= 0) {
								class84s[i_21_].method990(i_20_, i_19_, -17078);
							}
						}
					}
				}
			}
		}
		anInt3519++;
		if (i == -2) {
			for (int i_22_ = 0; (anInt3535 ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
				int i_23_ = 0;
				int i_24_ = 0;
				if (!aBoolean3516) {
					if (Class34.aBoolean532) {
						i_24_ |= 0x8;
					}
					if (Class163.aBoolean2015) {
						i_23_ |= 0x2;
					}
					if (Class237.anInt2906 != 0) {
						i_23_ |= 0x1;
						if ((i_22_ ^ 0xffffffff) == -1 | Class339_Sub6.aBoolean8715) {
							i_24_ |= 0x10;
						}
					}
				}
				if (Class163.aBoolean2015) {
					i_24_ |= 0x7;
				}
				if (!Class169_Sub2_Sub1.aBoolean10563) {
					i_24_ |= 0x20;
				}
				int[][] is_25_ = is == null || i_22_ >= is.length ? anIntArrayArrayArray3520[i_22_] : is[i_22_];
				Class232.method2141(i_22_, graphicstoolkit.a(anInt3524, anInt3521, anIntArrayArrayArray3520[i_22_], is_25_, 512, i_23_, i_24_));
			}
		}
	}
	
	private final void method3340(int i, byte b, GraphicsToolkit graphicstoolkit, int[][] is, Plane plane, Plane plane_26_, Plane plane_27_) {
		for (int i_28_ = 0; (anInt3524 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
			for (int i_29_ = 0; i_29_ < anInt3521; i_29_++) {
				if (Class256.anInt3237 == -1 || Class369.method4085(i_29_, 0, Class256.anInt3237, i_28_, i)) {
					byte b_30_ = aByteArrayArrayArray3530[i][i_28_][i_29_];
					byte b_31_ = aByteArrayArrayArray3525[i][i_28_][i_29_];
					int i_32_ = aByteArrayArrayArray3528[i][i_28_][i_29_] & 0xff;
					int i_33_ = aByteArrayArrayArray3537[i][i_28_][i_29_] & 0xff;
					Class289 class289 = i_32_ != 0 ? aClass71_3512.method743(i_32_ - 1, (byte) 90) : null;
					if (b_30_ == 0 && class289 == null) {
						b_30_ = (byte) 12;
					}
					Class236 class236 = i_33_ == 0 ? null : aClass58_3536.method573(-17993, -1 + i_33_);
					Class289 class289_34_ = class289;
					if (class289 != null && (class289.anInt3631 ^ 0xffffffff) == 0 && (class289.anInt3629 ^ 0xffffffff) == 0) {
						class289_34_ = class289;
						class289 = null;
					}
					if (class289 != null || class236 != null) {
						int i_35_ = Node_Sub38_Sub7.anIntArray10143[b_30_];
						int i_36_ = ProducingGraphicsBuffer.anIntArray9881[b_30_];
						int i_37_ = (class236 == null ? 0 : i_35_) + (class289 != null ? i_36_ : 0);
						int i_38_ = 0;
						int i_39_ = 0;
						int i_40_ = class289 == null ? -1 : class289.anInt3640;
						int i_41_ = class236 != null ? class236.anInt2891 : -1;
						int[] is_42_ = new int[i_37_];
						int[] is_43_ = new int[i_37_];
						int[] is_44_ = new int[i_37_];
						int[] is_45_ = new int[i_37_];
						int[] is_46_ = new int[i_37_];
						int[] is_47_ = new int[i_37_];
						int[] is_48_ = class289 != null && class289.anInt3629 != -1 ? new int[i_37_] : null;
						if (class289 != null) {
							for (int i_49_ = 0; (i_36_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
								is_42_[i_38_] = Class141.anIntArrayArray1755[b_30_][i_39_];
								is_43_[i_38_] = Class262_Sub21.anIntArrayArray7868[b_30_][i_39_];
								is_44_[i_38_] = Node_Sub43.anIntArrayArray7538[b_30_][i_39_];
								is_46_[i_38_] = i_40_;
								is_47_[i_38_] = class289.anInt3632;
								is_45_[i_38_] = class289.anInt3631;
								if (is_48_ != null) {
									is_48_[i_38_] = class289.anInt3629;
								}
								i_38_++;
								i_39_++;
							}
							if (!aBoolean3516 && i == 0) {
								Class158.method1725(i_28_, i_29_, class289.anInt3646, 8 * class289.anInt3634, class289.anInt3641);
							}
						} else {
							i_39_ += i_36_;
						}
						if (class236 != null) {
							for (int i_50_ = 0; i_35_ > i_50_; i_50_++) {
								is_42_[i_38_] = Class141.anIntArrayArray1755[b_30_][i_39_];
								is_43_[i_38_] = Class262_Sub21.anIntArrayArray7868[b_30_][i_39_];
								is_44_[i_38_] = Node_Sub43.anIntArrayArray7538[b_30_][i_39_];
								is_46_[i_38_] = i_41_;
								is_47_[i_38_] = class236.anInt2894;
								is_45_[i_38_] = is[i_28_][i_29_];
								if (is_48_ != null) {
									is_48_[i_38_] = is_45_[i_38_];
								}
								i_39_++;
								i_38_++;
							}
						}
						int i_51_ = anIntArray3522.length;
						int[] is_52_ = new int[i_51_];
						int[] is_53_ = new int[i_51_];
						int[] is_54_ = plane == null ? null : new int[i_51_];
						int[] is_55_ = plane != null || plane_27_ != null ? new int[i_51_] : null;
						for (int i_56_ = 0; (i_51_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
							int i_57_ = anIntArray3522[i_56_];
							int i_58_ = anIntArray3513[i_56_];
							if (b_31_ != 0) {
								if ((b_31_ ^ 0xffffffff) != -2) {
									if ((b_31_ ^ 0xffffffff) == -3) {
										is_52_[i_56_] = 512 - i_57_;
										is_53_[i_56_] = 512 - i_58_;
									} else if ((b_31_ ^ 0xffffffff) == -4) {
										int i_59_ = i_57_;
										is_52_[i_56_] = 512 + -i_58_;
										is_53_[i_56_] = i_59_;
									}
								} else {
									int i_60_ = i_57_;
									is_52_[i_56_] = i_58_;
									is_53_[i_56_] = -i_60_ + 512;
								}
							} else {
								is_52_[i_56_] = i_57_;
								is_53_[i_56_] = i_58_;
							}
							if (is_54_ != null && GLPlane.aBooleanArrayArray7950[b_30_][i_56_]) {
								int i_61_ = is_52_[i_56_] + (i_28_ << 9);
								int i_62_ = (i_29_ << 9) + is_53_[i_56_];
								is_54_[i_56_] = plane.method3260(i_62_, -128, i_61_) - plane_26_.method3260(i_62_, -127, i_61_);
							}
							if (is_55_ != null) {
								if (plane == null || GLPlane.aBooleanArrayArray7950[b_30_][i_56_]) {
									if (plane_27_ != null && !Node_Sub15_Sub7.aBooleanArrayArray9822[b_30_][i_56_]) {
										int i_63_ = (i_28_ << 9) + is_52_[i_56_];
										int i_64_ = is_53_[i_56_] + (i_29_ << 9);
										is_55_[i_56_] = plane_27_.method3260(i_64_, -126, i_63_) + -plane_26_.method3260(i_64_, -114, i_63_);
									}
								} else {
									int i_65_ = is_52_[i_56_] + (i_28_ << 9);
									int i_66_ = (i_29_ << 9) + is_53_[i_56_];
									is_55_[i_56_] = plane_26_.method3260(i_66_, -128, i_65_) + -plane.method3260(i_66_, -115, i_65_);
								}
							}
						}
						int i_67_ = plane_26_.method3251(i_29_, i_28_, (byte) -118);
						int i_68_ = plane_26_.method3251(i_29_, i_28_ - -1, (byte) -118);
						int i_69_ = plane_26_.method3251(1 + i_29_, i_28_ - -1, (byte) -118);
						int i_70_ = plane_26_.method3251(i_29_ - -1, i_28_, (byte) -118);
						boolean bool = Class238.method3021(i_29_, i_28_, 108);
						if (bool && (i ^ 0xffffffff) < -2 || !bool && i > 0) {
							boolean bool_71_ = true;
							if (class236 != null && !class236.aBoolean2892) {
								bool_71_ = false;
							} else if ((i_33_ ^ 0xffffffff) != -1 || b_30_ == 0) {
								if ((i_32_ ^ 0xffffffff) < -1 && class289_34_ != null && !class289_34_.aBoolean3636) {
									bool_71_ = false;
								}
							} else {
								bool_71_ = false;
							}
							if (bool_71_ && (i_68_ ^ 0xffffffff) == (i_67_ ^ 0xffffffff) && (i_69_ ^ 0xffffffff) == (i_67_ ^ 0xffffffff) && i_67_ == i_70_) {
								aByteArrayArrayArray3526[i][i_28_][i_29_] = (byte) Node_Sub16.method2590(aByteArrayArrayArray3526[i][i_28_][i_29_], 4);
							}
						}
						int i_72_ = 0;
						int i_73_ = 0;
						int i_74_ = 0;
						if (aBoolean3516) {
							i_72_ = Class320_Sub2.method3684(i_28_, i_29_);
							i_73_ = Class184.method1844(i_28_, i_29_);
							i_74_ = Class117_Sub2.method1172(i_28_, i_29_);
						}
						plane_26_.method3253(i_28_, i_29_, is_52_, is_54_, is_53_, is_55_, is_42_, is_43_, is_44_, is_45_, is_48_, is_46_, is_47_, i_72_, i_73_, i_74_, false);
						Class320_Sub24.method3775(i, i_28_, i_29_);
					}
				}
			}
		}
		if (b >= -61) {
			aCacheNode_Sub13_3509 = null;
		}
		anInt3511++;
	}
	
	private final void method3341(int i, Class289 class289, byte[][] bs, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, GraphicsToolkit graphicstoolkit, int i_80_, boolean[] bools, Class236 class236, byte[][] bs_81_, byte[][] bs_82_) {
		anInt3533++;
		boolean[] bools_83_ = class289 != null && class289.aBoolean3643 ? Class250.aBooleanArrayArray3168[i] : Node_Sub33.aBooleanArrayArray7406[i];
		if (i_80_ > 0) {
			if (i_77_ > 0) {
				int i_84_ = 0xff & bs_82_[i_77_ + -1][i_80_ - 1];
				if ((i_84_ ^ 0xffffffff) < -1) {
					Class289 class289_85_ = aClass71_3512.method743(i_84_ + -1, (byte) 38);
					if ((class289_85_.anInt3631 ^ 0xffffffff) != 0 && class289_85_.aBoolean3643) {
						byte b = bs_81_[i_77_ + -1][-1 + i_80_];
						int i_86_ = bs[-1 + i_77_][i_80_ + -1] * 2 + 4 & 0x7;
						int i_87_ = Class382.method4179(class289_85_, (byte) -125, graphicstoolkit);
						if (GLPlane.aBooleanArrayArray7950[b][i_86_]) {
							Class188_Sub1_Sub1.anIntArray9339[0] = class289_85_.anInt3631;
							Class262_Sub10.anIntArray7773[0] = i_87_;
							Class84.anIntArray1136[0] = class289_85_.anInt3640;
							Class385.anIntArray4914[0] = class289_85_.anInt3632;
							Class327.anIntArray5348[0] = class289_85_.anInt3633;
							Class136.anIntArray1695[0] = 256;
						}
					}
				}
			}
			if (-1 + i_75_ > i_77_) {
				int i_88_ = 0xff & bs_82_[1 + i_77_][i_80_ - 1];
				if ((i_88_ ^ 0xffffffff) < -1) {
					Class289 class289_89_ = aClass71_3512.method743(i_88_ - 1, (byte) 49);
					if ((class289_89_.anInt3631 ^ 0xffffffff) != 0 && class289_89_.aBoolean3643) {
						byte b = bs_81_[1 + i_77_][-1 + i_80_];
						int i_90_ = 0x7 & 2 * bs[1 + i_77_][i_80_ - 1] + 6;
						int i_91_ = Class382.method4179(class289_89_, (byte) -120, graphicstoolkit);
						if (GLPlane.aBooleanArrayArray7950[b][i_90_]) {
							Class188_Sub1_Sub1.anIntArray9339[2] = class289_89_.anInt3631;
							Class262_Sub10.anIntArray7773[2] = i_91_;
							Class84.anIntArray1136[2] = class289_89_.anInt3640;
							Class385.anIntArray4914[2] = class289_89_.anInt3632;
							Class327.anIntArray5348[2] = class289_89_.anInt3633;
							Class136.anIntArray1695[2] = 512;
						}
					}
				}
			}
		}
		if ((i_79_ - 1 ^ 0xffffffff) < (i_80_ ^ 0xffffffff)) {
			if ((i_77_ ^ 0xffffffff) < -1) {
				int i_92_ = bs_82_[-1 + i_77_][i_80_ - -1] & 0xff;
				if (i_92_ > 0) {
					Class289 class289_93_ = aClass71_3512.method743(-1 + i_92_, (byte) 66);
					if (class289_93_.anInt3631 != -1 && class289_93_.aBoolean3643) {
						byte b = bs_81_[i_77_ - 1][1 + i_80_];
						int i_94_ = 0x7 & 2 * bs[i_77_ + -1][1 + i_80_] + 2;
						int i_95_ = Class382.method4179(class289_93_, (byte) -15, graphicstoolkit);
						if (GLPlane.aBooleanArrayArray7950[b][i_94_]) {
							Class188_Sub1_Sub1.anIntArray9339[6] = class289_93_.anInt3631;
							Class262_Sub10.anIntArray7773[6] = i_95_;
							Class84.anIntArray1136[6] = class289_93_.anInt3640;
							Class385.anIntArray4914[6] = class289_93_.anInt3632;
							Class327.anIntArray5348[6] = class289_93_.anInt3633;
							Class136.anIntArray1695[6] = 64;
						}
					}
				}
			}
			if ((-1 + i_75_ ^ 0xffffffff) < (i_77_ ^ 0xffffffff)) {
				int i_96_ = 0xff & bs_82_[1 + i_77_][1 + i_80_];
				if (i_96_ > 0) {
					Class289 class289_97_ = aClass71_3512.method743(-1 + i_96_, (byte) 113);
					if (class289_97_.anInt3631 != -1 && class289_97_.aBoolean3643) {
						byte b = bs_81_[1 + i_77_][1 + i_80_];
						int i_98_ = -(-(2 * bs[1 + i_77_][1 + i_80_])) & 0x7;
						int i_99_ = Class382.method4179(class289_97_, (byte) -128, graphicstoolkit);
						if (GLPlane.aBooleanArrayArray7950[b][i_98_]) {
							Class188_Sub1_Sub1.anIntArray9339[4] = class289_97_.anInt3631;
							Class262_Sub10.anIntArray7773[4] = i_99_;
							Class84.anIntArray1136[4] = class289_97_.anInt3640;
							Class385.anIntArray4914[4] = class289_97_.anInt3632;
							Class327.anIntArray5348[4] = class289_97_.anInt3633;
							Class136.anIntArray1695[4] = 128;
						}
					}
				}
			}
		}
		if (i_80_ > 0) {
			int i_100_ = 0xff & bs_82_[i_77_][i_80_ - 1];
			if (i_100_ > 0) {
				Class289 class289_101_ = aClass71_3512.method743(-1 + i_100_, (byte) 40);
				if ((class289_101_.anInt3631 ^ 0xffffffff) != 0) {
					byte b = bs_81_[i_77_][-1 + i_80_];
					int i_102_ = bs[i_77_][-1 + i_80_];
					if (class289_101_.aBoolean3643) {
						int i_103_ = 2;
						int i_104_ = i_102_ * 2 + 4;
						int i_105_ = Class382.method4179(class289_101_, (byte) -123, graphicstoolkit);
						for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > -4; i_106_++) {
							i_103_ = 0x7 & i_103_;
							i_104_ &= 0x7;
							if (GLPlane.aBooleanArrayArray7950[b][i_104_] && (class289_101_.anInt3633 ^ 0xffffffff) <= (Class327.anIntArray5348[i_103_] ^ 0xffffffff)) {
								Class188_Sub1_Sub1.anIntArray9339[i_103_] = class289_101_.anInt3631;
								Class262_Sub10.anIntArray7773[i_103_] = i_105_;
								Class84.anIntArray1136[i_103_] = class289_101_.anInt3640;
								Class385.anIntArray4914[i_103_] = class289_101_.anInt3632;
								if ((Class327.anIntArray5348[i_103_] ^ 0xffffffff) != (class289_101_.anInt3633 ^ 0xffffffff)) {
									Class136.anIntArray1695[i_103_] = 32;
								} else {
									Class136.anIntArray1695[i_103_] = Node_Sub16.method2590(Class136.anIntArray1695[i_103_], 32);
								}
								Class327.anIntArray5348[i_103_] = class289_101_.anInt3633;
							}
							i_103_--;
							i_104_++;
						}
						if (!bools_83_[i_78_ & 0x3]) {
							bools[0] = Class250.aBooleanArrayArray3168[b][Node_Sub30.method2723(3, 2 - -i_102_)];
						}
					} else if (!bools_83_[0x3 & i_78_]) {
						bools[0] = Node_Sub33.aBooleanArrayArray7406[b][Node_Sub30.method2723(2 - -i_102_, 3)];
					}
				}
			}
		}
		if ((-1 + i_79_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff)) {
			int i_107_ = 0xff & bs_82_[i_77_][i_80_ + 1];
			if (i_107_ > 0) {
				Class289 class289_108_ = aClass71_3512.method743(-1 + i_107_, (byte) 48);
				if (class289_108_.anInt3631 != -1) {
					byte b = bs_81_[i_77_][i_80_ + 1];
					int i_109_ = bs[i_77_][1 + i_80_];
					if (class289_108_.aBoolean3643) {
						int i_110_ = 4;
						int i_111_ = 2 + i_109_ * 2;
						int i_112_ = Class382.method4179(class289_108_, (byte) 16, graphicstoolkit);
						for (int i_113_ = 0; i_113_ < 3; i_113_++) {
							i_110_ &= 0x7;
							i_111_ = 0x7 & i_111_;
							if (GLPlane.aBooleanArrayArray7950[b][i_111_] && Class327.anIntArray5348[i_110_] <= class289_108_.anInt3633) {
								Class188_Sub1_Sub1.anIntArray9339[i_110_] = class289_108_.anInt3631;
								Class262_Sub10.anIntArray7773[i_110_] = i_112_;
								Class84.anIntArray1136[i_110_] = class289_108_.anInt3640;
								Class385.anIntArray4914[i_110_] = class289_108_.anInt3632;
								if ((Class327.anIntArray5348[i_110_] ^ 0xffffffff) != (class289_108_.anInt3633 ^ 0xffffffff)) {
									Class136.anIntArray1695[i_110_] = 16;
								} else {
									Class136.anIntArray1695[i_110_] = Node_Sub16.method2590(Class136.anIntArray1695[i_110_], 16);
								}
								Class327.anIntArray5348[i_110_] = class289_108_.anInt3633;
							}
							i_110_++;
							i_111_--;
						}
						if (!bools_83_[i_78_ + 2 & 0x3]) {
							bools[2] = Class250.aBooleanArrayArray3168[b][Node_Sub30.method2723(3, --i_109_)];
						}
					} else if (!bools_83_[2 + i_78_ & 0x3]) {
						bools[2] = Node_Sub33.aBooleanArrayArray7406[b][Node_Sub30.method2723(i_109_, 3)];
					}
				}
			}
		}
		if ((i_77_ ^ 0xffffffff) < -1) {
			int i_114_ = 0xff & bs_82_[-1 + i_77_][i_80_];
			if ((i_114_ ^ 0xffffffff) < -1) {
				Class289 class289_115_ = aClass71_3512.method743(-1 + i_114_, (byte) 125);
				if (class289_115_.anInt3631 != -1) {
					byte b = bs_81_[i_77_ - 1][i_80_];
					int i_116_ = bs[i_77_ - 1][i_80_];
					if (class289_115_.aBoolean3643) {
						int i_117_ = 6;
						int i_118_ = 2 * i_116_ + 4;
						int i_119_ = Class382.method4179(class289_115_, (byte) -125, graphicstoolkit);
						for (int i_120_ = 0; (i_120_ ^ 0xffffffff) > -4; i_120_++) {
							i_117_ = 0x7 & i_117_;
							i_118_ = 0x7 & i_118_;
							if (GLPlane.aBooleanArrayArray7950[b][i_118_] && Class327.anIntArray5348[i_117_] <= class289_115_.anInt3633) {
								Class188_Sub1_Sub1.anIntArray9339[i_117_] = class289_115_.anInt3631;
								Class262_Sub10.anIntArray7773[i_117_] = i_119_;
								Class84.anIntArray1136[i_117_] = class289_115_.anInt3640;
								Class385.anIntArray4914[i_117_] = class289_115_.anInt3632;
								if ((class289_115_.anInt3633 ^ 0xffffffff) == (Class327.anIntArray5348[i_117_] ^ 0xffffffff)) {
									Class136.anIntArray1695[i_117_] = Node_Sub16.method2590(Class136.anIntArray1695[i_117_], 8);
								} else {
									Class136.anIntArray1695[i_117_] = 8;
								}
								Class327.anIntArray5348[i_117_] = class289_115_.anInt3633;
							}
							i_117_++;
							i_118_--;
						}
						if (!bools_83_[0x3 & i_78_ + 3]) {
							bools[3] = Class250.aBooleanArrayArray3168[b][Node_Sub30.method2723(1 + i_116_, 3)];
						}
					} else if (!bools_83_[3 + i_78_ & 0x3]) {
						bools[3] = Node_Sub33.aBooleanArrayArray7406[b][Node_Sub30.method2723(3, i_116_ + 1)];
					}
				}
			}
		}
		if (i_76_ != 8) {
			method3346((byte) -102, null, null, null);
		}
		if (i_77_ < i_75_ + -1) {
			int i_121_ = bs_82_[1 + i_77_][i_80_] & 0xff;
			if ((i_121_ ^ 0xffffffff) < -1) {
				Class289 class289_122_ = aClass71_3512.method743(-1 + i_121_, (byte) 43);
				if ((class289_122_.anInt3631 ^ 0xffffffff) != 0) {
					byte b = bs_81_[i_77_ + 1][i_80_];
					int i_123_ = bs[1 + i_77_][i_80_];
					if (class289_122_.aBoolean3643) {
						int i_124_ = 4;
						int i_125_ = 2 * i_123_ + 6;
						int i_126_ = Class382.method4179(class289_122_, (byte) -126, graphicstoolkit);
						for (int i_127_ = 0; i_127_ < 3; i_127_++) {
							i_125_ &= 0x7;
							i_124_ = 0x7 & i_124_;
							if (GLPlane.aBooleanArrayArray7950[b][i_125_] && (class289_122_.anInt3633 ^ 0xffffffff) <= (Class327.anIntArray5348[i_124_] ^ 0xffffffff)) {
								Class188_Sub1_Sub1.anIntArray9339[i_124_] = class289_122_.anInt3631;
								Class262_Sub10.anIntArray7773[i_124_] = i_126_;
								Class84.anIntArray1136[i_124_] = class289_122_.anInt3640;
								Class385.anIntArray4914[i_124_] = class289_122_.anInt3632;
								if (Class327.anIntArray5348[i_124_] != class289_122_.anInt3633) {
									Class136.anIntArray1695[i_124_] = 4;
								} else {
									Class136.anIntArray1695[i_124_] = Node_Sub16.method2590(Class136.anIntArray1695[i_124_], 4);
								}
								Class327.anIntArray5348[i_124_] = class289_122_.anInt3633;
							}
							i_124_--;
							i_125_++;
						}
						if (!bools_83_[0x3 & i_78_ + 1]) {
							bools[1] = Class250.aBooleanArrayArray3168[b][Node_Sub30.method2723(3, i_123_ + 3)];
						}
					} else if (!bools_83_[0x3 & 1 - -i_78_]) {
						bools[1] = Node_Sub33.aBooleanArrayArray7406[b][Node_Sub30.method2723(3, 3 - -i_123_)];
					}
				}
			}
		}
		if (class289 != null) {
			int i_128_ = Class382.method4179(class289, (byte) -128, graphicstoolkit);
			if (class289.aBoolean3643) {
				for (int i_129_ = 0; (i_129_ ^ 0xffffffff) > -9; i_129_++) {
					int i_130_ = -(i_78_ * 2) + i_129_ & 0x7;
					if (GLPlane.aBooleanArrayArray7950[i][i_129_] && (class289.anInt3633 ^ 0xffffffff) <= (Class327.anIntArray5348[i_130_] ^ 0xffffffff)) {
						Class188_Sub1_Sub1.anIntArray9339[i_130_] = class289.anInt3631;
						Class262_Sub10.anIntArray7773[i_130_] = i_128_;
						Class84.anIntArray1136[i_130_] = class289.anInt3640;
						Class385.anIntArray4914[i_130_] = class289.anInt3632;
						if (class289.anInt3633 == Class327.anIntArray5348[i_130_]) {
							Class136.anIntArray1695[i_130_] = Node_Sub16.method2590(Class136.anIntArray1695[i_130_], 2);
						} else {
							Class136.anIntArray1695[i_130_] = 2;
						}
						Class327.anIntArray5348[i_130_] = class289.anInt3633;
					}
				}
			}
		}
	}
	
	public static void method3342(boolean bool) {
		aCacheNode_Sub13_3509 = null;
		if (bool != true) {
			anInt3527 = 40;
		}
	}
	
	final void method3343(int[][] is, byte b, int i) {
		anInt3517++;
		int[][] is_132_ = anIntArrayArrayArray3520[i];
		for (int i_133_ = 0; 1 + anInt3524 > i_133_; i_133_++) {
			for (int i_134_ = 0; (i_134_ ^ 0xffffffff) > (1 + anInt3521 ^ 0xffffffff); i_134_++)
				is_132_[i_133_][i_134_] += is[i_133_][i_134_];
		}
	}
	
	static final void method3344(int i, boolean bool, int i_135_) {
		if (i != 1420162185) {
			method3342(true);
		}
		anInt3529++;
		Node_Sub43 node_sub43 = !bool ? ItemDefinitions.aNode_Sub43_1925 : Class29.aNode_Sub43_477;
		if (node_sub43 != null && (i_135_ ^ 0xffffffff) <= -1 && (node_sub43.anInt7531 ^ 0xffffffff) < (i_135_ ^ 0xffffffff)) {
			Class24 class24 = node_sub43.aClass24Array7533[i_135_];
			if ((class24.aByte438 ^ 0xffffffff) == 0) {
				String string = class24.aString437;
				Class123 class123 = Class262_Sub23.method3213((byte) -85);
				Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class246.aClass318_3103, class123.anIsaacCipher1571);
				node_sub13.aPacket7113.writeByte(Class126.method1536(i + -1420183011, string) + 3);
				node_sub13.aPacket7113.writeByte(bool ? 1 : 0);
				node_sub13.aPacket7113.writeShort(i_135_);
				node_sub13.aPacket7113.writeString(string);
				class123.sendPacket(i ^ 0x54a5f4f6, node_sub13);
			}
		}
	}
	
	private final void method3345(int i, int i_136_, int i_137_, int i_138_, int i_139_, BufferedStream buffer, int i_140_, int i_141_, int i_142_, int i_143_, boolean bool) {
		if (i == 1) {
			i_137_ = 1;
		} else if (i != 2) {
			if (i == 3) {
				i_140_ = 1;
			}
		} else {
			i_140_ = 1;
			i_137_ = 1;
		}
		anInt3515++;
		if (i_138_ < 0 || (anInt3524 ^ 0xffffffff) >= (i_138_ ^ 0xffffffff) || i_136_ < 0 || i_136_ >= anInt3521) {
			for (;;) {
				int i_144_ = buffer.readUnsignedByte();
				if ((i_144_ ^ 0xffffffff) == -1) {
					break;
				}
				if ((i_144_ ^ 0xffffffff) == -2) {
					buffer.readUnsignedByte();
					break;
				}
				if ((i_144_ ^ 0xffffffff) >= -50) {
					buffer.readUnsignedByte();
				}
			}
		} else {
			if (!aBoolean3516 && !bool) {
				CacheNode_Sub11.aByteArrayArrayArray9550[i_142_][i_138_][i_136_] = (byte) 0;
			}
			for (;;) {
				int i_145_ = buffer.readUnsignedByte();
				if (i_145_ == 0) {
					if (!aBoolean3516) {
						if ((i_142_ ^ 0xffffffff) != -1) {
							anIntArrayArrayArray3520[i_142_][i_140_ + i_138_][i_137_ + i_136_] = -960 + anIntArrayArrayArray3520[-1 + i_142_][i_138_ - -i_140_][i_136_ + i_137_];
						} else {
							anIntArrayArrayArray3520[0][i_138_ - -i_140_][i_136_ + i_137_] = 8 * -Class339_Sub1.method3925(i_139_ + 932731, 114, i_141_ + 556238) << 2;
						}
					} else {
						anIntArrayArrayArray3520[0][i_140_ + i_138_][i_136_ - -i_137_] = 0;
					}
					break;
				}
				if (i_145_ == 1) {
					int i_146_ = buffer.readUnsignedByte();
					if (!aBoolean3516) {
						if (i_146_ == 1) {
							i_146_ = 0;
						}
						if (i_142_ == 0) {
							anIntArrayArrayArray3520[0][i_140_ + i_138_][i_137_ + i_136_] = 8 * -i_146_ << 2;
						} else {
							anIntArrayArrayArray3520[i_142_][i_140_ + i_138_][i_136_ + i_137_] = anIntArrayArrayArray3520[i_142_ + -1][i_138_ - -i_140_][i_137_ + i_136_] - (8 * i_146_ << 2);
						}
					} else {
						anIntArrayArrayArray3520[0][i_140_ + i_138_][i_137_ + i_136_] = 8 * i_146_ << 2;
					}
					break;
				}
				if ((i_145_ ^ 0xffffffff) >= -50) {
					if (bool) {
						buffer.readUnsignedByte();
					} else {
						aByteArrayArrayArray3528[i_142_][i_138_][i_136_] = buffer.readByte();
						aByteArrayArrayArray3530[i_142_][i_138_][i_136_] = (byte) ((-2 + i_145_) / 4);
						aByteArrayArrayArray3525[i_142_][i_138_][i_136_] = (byte) Node_Sub30.method2723(3, -2 + i_145_ + i);
					}
				} else if (i_145_ <= 81) {
					if (!aBoolean3516 && !bool) {
						CacheNode_Sub11.aByteArrayArrayArray9550[i_142_][i_138_][i_136_] = (byte) (i_145_ - 49);
					}
				} else if (!bool) {
					aByteArrayArrayArray3537[i_142_][i_138_][i_136_] = (byte) (-81 + i_145_);
				}
			}
		}
		if (i_143_ != -682) {
			aCacheNode_Sub13_3509 = null;
		}
	}
	
	final void method3346(byte b, GraphicsToolkit graphicstoolkit, Plane plane, Plane plane_147_) {
		anInt3510++;
		if (b == 75) {
			if (Class212.anIntArray5128 == null || anInt3521 != Class212.anIntArray5128.length) {
				Class377_Sub1.anIntArray8776 = new int[anInt3521];
				Animable_Sub3.anIntArray9142 = new int[anInt3521];
				Class212.anIntArray5128 = new int[anInt3521];
				Class190.anIntArray2328 = new int[anInt3521];
				Class290_Sub7.anIntArray8131 = new int[anInt3521];
			}
			int[][] is = new int[anInt3524][anInt3521];
			for (int i = 0; (anInt3535 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				for (int i_148_ = 0; anInt3521 > i_148_; i_148_++) {
					Class212.anIntArray5128[i_148_] = 0;
					Class290_Sub7.anIntArray8131[i_148_] = 0;
					Class377_Sub1.anIntArray8776[i_148_] = 0;
					Class190.anIntArray2328[i_148_] = 0;
					Animable_Sub3.anIntArray9142[i_148_] = 0;
				}
				for (int i_149_ = -5; (anInt3524 ^ 0xffffffff) < (i_149_ ^ 0xffffffff); i_149_++) {
					for (int i_150_ = 0; (anInt3521 ^ 0xffffffff) < (i_150_ ^ 0xffffffff); i_150_++) {
						int i_151_ = i_149_ + 5;
						if (i_151_ < anInt3524) {
							int i_152_ = aByteArrayArrayArray3537[i][i_151_][i_150_] & 0xff;
							if ((i_152_ ^ 0xffffffff) < -1) {
								Class236 class236 = aClass58_3536.method573(-17993, -1 + i_152_);
								Class212.anIntArray5128[i_150_] += class236.anInt2888;
								Class290_Sub7.anIntArray8131[i_150_] += class236.anInt2897;
								Class377_Sub1.anIntArray8776[i_150_] += class236.anInt2901;
								Class190.anIntArray2328[i_150_] += class236.anInt2890;
								Animable_Sub3.anIntArray9142[i_150_]++;
							}
						}
						int i_153_ = i_149_ - 5;
						if (i_153_ >= 0) {
							int i_154_ = aByteArrayArrayArray3537[i][i_153_][i_150_] & 0xff;
							if (i_154_ > 0) {
								Class236 class236 = aClass58_3536.method573(-17993, -1 + i_154_);
								Class212.anIntArray5128[i_150_] -= class236.anInt2888;
								Class290_Sub7.anIntArray8131[i_150_] -= class236.anInt2897;
								Class377_Sub1.anIntArray8776[i_150_] -= class236.anInt2901;
								Class190.anIntArray2328[i_150_] -= class236.anInt2890;
								Animable_Sub3.anIntArray9142[i_150_]--;
							}
						}
					}
					if (i_149_ >= 0) {
						int i_155_ = 0;
						int i_156_ = 0;
						int i_157_ = 0;
						int i_158_ = 0;
						int i_159_ = 0;
						for (int i_160_ = -5; i_160_ < anInt3521; i_160_++) {
							int i_161_ = 5 + i_160_;
							if ((anInt3521 ^ 0xffffffff) < (i_161_ ^ 0xffffffff)) {
								i_156_ += Class290_Sub7.anIntArray8131[i_161_];
								i_155_ += Class212.anIntArray5128[i_161_];
								i_158_ += Class190.anIntArray2328[i_161_];
								i_157_ += Class377_Sub1.anIntArray8776[i_161_];
								i_159_ += Animable_Sub3.anIntArray9142[i_161_];
							}
							int i_162_ = i_160_ - 5;
							if (i_162_ >= 0) {
								i_157_ -= Class377_Sub1.anIntArray8776[i_162_];
								i_158_ -= Class190.anIntArray2328[i_162_];
								i_155_ -= Class212.anIntArray5128[i_162_];
								i_159_ -= Animable_Sub3.anIntArray9142[i_162_];
								i_156_ -= Class290_Sub7.anIntArray8131[i_162_];
							}
							if ((i_160_ ^ 0xffffffff) <= -1 && (i_158_ ^ 0xffffffff) < -1 && i_159_ > 0) {
								is[i_149_][i_160_] = Node_Sub25.method2651(i_157_ / i_159_, i_156_ / i_159_, false, i_155_ * 256 / i_158_);
							}
						}
					}
				}
				if (!Class382.aBoolean5254) {
					method3340(i, (byte) -78, graphicstoolkit, is, i == 0 ? plane_147_ : null, Class320_Sub10.aPlaneArray8300[i], (i ^ 0xffffffff) == -1 ? plane : null);
				} else {
					method3348((i ^ 0xffffffff) == -1 ? plane_147_ : null, false, is, (i ^ 0xffffffff) != -1 ? null : plane, Class320_Sub10.aPlaneArray8300[i], graphicstoolkit, i);
				}
				aByteArrayArrayArray3537[i] = null;
				aByteArrayArrayArray3528[i] = null;
				aByteArrayArrayArray3530[i] = null;
				aByteArrayArrayArray3525[i] = null;
			}
			if (!aBoolean3516) {
				if ((Class237.anInt2906 ^ 0xffffffff) != -1) {
					EntityNode_Sub3.method939();
				}
				if (Class163.aBoolean2015) {
					Class189.method1925();
				}
			}
			for (int i = 0; (anInt3535 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				Class320_Sub10.aPlaneArray8300[i].YA();
		}
	}
	
	final void method3347(int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_) {
		anInt3523++;
		for (int i_168_ = i_164_; (i_168_ ^ 0xffffffff) > (i_163_ + i_164_ ^ 0xffffffff); i_168_++) {
			for (int i_169_ = i_165_; i_165_ + i_167_ > i_169_; i_169_++) {
				if (i_169_ >= 0 && (anInt3524 ^ 0xffffffff) < (i_169_ ^ 0xffffffff) && i_168_ >= 0 && i_168_ < anInt3521) {
					anIntArrayArrayArray3520[i_166_][i_169_][i_168_] = (i_166_ ^ 0xffffffff) >= -1 ? 0 : anIntArrayArrayArray3520[i_166_ + -1][i_169_][i_168_] + -960;
				}
			}
		}
		if (i_165_ > 0 && (i_165_ ^ 0xffffffff) > (anInt3524 ^ 0xffffffff)) {
			for (int i_170_ = i_164_ - -1; i_170_ < i_164_ - -i_163_; i_170_++) {
				if (i_170_ >= 0 && i_170_ < anInt3521) {
					anIntArrayArrayArray3520[i_166_][i_165_][i_170_] = anIntArrayArrayArray3520[i_166_][i_165_ + -1][i_170_];
				}
			}
		}
		if (i_164_ > 0 && i_164_ < anInt3521) {
			for (int i_171_ = 1 + i_165_; i_171_ < i_165_ - -i_167_; i_171_++) {
				if (i_171_ >= 0 && i_171_ < anInt3524) {
					anIntArrayArrayArray3520[i_166_][i_171_][i_164_] = anIntArrayArrayArray3520[i_166_][i_171_][i_164_ + -1];
				}
			}
		}
		if (i != -13972) {
			method3349(-48, -54, -84, -107, -23, null, -123, -43, null, (byte) 71);
		}
		if ((i_165_ ^ 0xffffffff) <= -1 && (i_164_ ^ 0xffffffff) <= -1 && (anInt3524 ^ 0xffffffff) < (i_165_ ^ 0xffffffff) && (anInt3521 ^ 0xffffffff) < (i_164_ ^ 0xffffffff)) {
			if ((i_166_ ^ 0xffffffff) == -1) {
				if ((i_165_ ^ 0xffffffff) < -1 && (anIntArrayArrayArray3520[i_166_][i_165_ + -1][i_164_] ^ 0xffffffff) != -1) {
					anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][i_165_ - 1][i_164_];
				} else if (i_164_ <= 0 || anIntArrayArrayArray3520[i_166_][i_165_][-1 + i_164_] == 0) {
					if (i_165_ > 0 && i_164_ > 0 && (anIntArrayArrayArray3520[i_166_][-1 + i_165_][-1 + i_164_] ^ 0xffffffff) != -1) {
						anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][i_165_ - 1][-1 + i_164_];
					}
				} else {
					anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][i_165_][i_164_ - 1];
				}
			} else if ((i_165_ ^ 0xffffffff) >= -1 || anIntArrayArrayArray3520[i_166_][i_165_ - 1][i_164_] == anIntArrayArrayArray3520[i_166_ + -1][i_165_ + -1][i_164_]) {
				if (i_164_ <= 0 || anIntArrayArrayArray3520[i_166_][i_165_][i_164_ + -1] == anIntArrayArrayArray3520[i_166_ + -1][i_165_][-1 + i_164_]) {
					if (i_165_ > 0 && i_164_ > 0 && (anIntArrayArrayArray3520[-1 + i_166_][i_165_ - 1][-1 + i_164_] ^ 0xffffffff) != (anIntArrayArrayArray3520[i_166_][i_165_ + -1][-1 + i_164_] ^ 0xffffffff)) {
						anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][i_165_ - 1][i_164_ + -1];
					}
				} else {
					anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][i_165_][i_164_ - 1];
				}
			} else {
				anIntArrayArrayArray3520[i_166_][i_165_][i_164_] = anIntArrayArrayArray3520[i_166_][-1 + i_165_][i_164_];
			}
		}
	}
	
	private final void method3348(Plane plane, boolean bool, int[][] is, Plane plane_172_, Plane plane_173_, GraphicsToolkit graphicstoolkit, int i) {
		anInt3531++;
		byte[][] bs = aByteArrayArrayArray3530[i];
		byte[][] bs_174_ = aByteArrayArrayArray3525[i];
		if (bool != false) {
			aClass71_3512 = null;
		}
		byte[][] bs_175_ = aByteArrayArrayArray3537[i];
		byte[][] bs_176_ = aByteArrayArrayArray3528[i];
		for (int i_177_ = 0; (anInt3524 ^ 0xffffffff) < (i_177_ ^ 0xffffffff); i_177_++) {
			int i_178_ = anInt3524 - 1 > i_177_ ? 1 + i_177_ : i_177_;
			for (int i_179_ = 0; i_179_ < anInt3521; i_179_++) {
				int i_180_ = (i_179_ ^ 0xffffffff) > (anInt3521 - 1 ^ 0xffffffff) ? 1 + i_179_ : i_179_;
				if (Class256.anInt3237 == -1 || Class369.method4085(i_179_, 0, Class256.anInt3237, i_177_, i)) {
					boolean bool_181_ = false;
					boolean bool_182_ = false;
					boolean[] bools = new boolean[4];
					byte b = bs[i_177_][i_179_];
					int i_183_ = bs_174_[i_177_][i_179_];
					int i_184_ = 0xff & bs_176_[i_177_][i_179_];
					int i_185_ = 0xff & bs_175_[i_177_][i_179_];
					int i_186_ = bs_175_[i_177_][i_180_] & 0xff;
					int i_187_ = 0xff & bs_175_[i_178_][i_180_];
					int i_188_ = bs_175_[i_178_][i_179_] & 0xff;
					if (i_184_ != 0 || i_185_ != 0) {
						Class289 class289 = (i_184_ ^ 0xffffffff) == -1 ? null : aClass71_3512.method743(-1 + i_184_, (byte) 118);
						Class236 class236 = i_185_ != 0 ? aClass58_3536.method573(-17993, i_185_ + -1) : null;
						if (b == 0 && class289 == null) {
							b = (byte) 12;
						}
						Class289 class289_189_ = class289;
						if (class289 != null) {
							if ((class289.anInt3631 ^ 0xffffffff) != 0 || class289.anInt3629 != -1) {
								if (class236 != null && (b ^ 0xffffffff) != -1) {
									bool_182_ = class289.aBoolean3643;
								}
							} else {
								class289_189_ = class289;
								class289 = null;
							}
						}
						if (((b ^ 0xffffffff) == -1 || b == 12) && (i_177_ ^ 0xffffffff) < -1 && i_179_ > 0 && i_177_ < anInt3524 && anInt3521 > i_179_) {
							int i_190_ = 0;
							int i_191_ = 0;
							int i_192_ = 0;
							i_191_ = i_191_ + (i_185_ == bs_175_[i_178_][-1 + i_179_] ? 1 : -1);
							i_190_ = i_190_ + (bs_175_[i_177_ + -1][-1 + i_179_] == i_185_ ? 1 : -1);
							i_192_ = i_192_ + (i_185_ == bs_175_[i_178_][i_180_] ? 1 : -1);
							int i_193_ = 0;
							if ((bs_175_[i_177_][i_179_ + -1] ^ 0xffffffff) != (i_185_ ^ 0xffffffff)) {
								i_191_--;
								i_190_--;
							} else {
								i_191_++;
								i_190_++;
							}
							i_193_ = i_193_ + (bs_175_[i_177_ + -1][i_180_] == i_185_ ? 1 : -1);
							if (i_185_ != bs_175_[i_178_][i_179_]) {
								i_191_--;
								i_192_--;
							} else {
								i_192_++;
								i_191_++;
							}
							if (i_185_ != bs_175_[i_177_][i_180_]) {
								i_192_--;
								i_193_--;
							} else {
								i_192_++;
								i_193_++;
							}
							if (i_185_ == bs_175_[i_177_ + -1][i_179_]) {
								i_190_++;
								i_193_++;
							} else {
								i_190_--;
								i_193_--;
							}
							int i_194_ = -i_192_ + i_190_;
							if ((i_194_ ^ 0xffffffff) > -1) {
								i_194_ = -i_194_;
							}
							int i_195_ = i_191_ - i_193_;
							if ((i_195_ ^ 0xffffffff) > -1) {
								i_195_ = -i_195_;
							}
							if (i_194_ == i_195_) {
								i_194_ = plane_173_.method3251(i_179_, i_177_, (byte) -118) - plane_173_.method3251(i_180_, i_178_, (byte) -118);
								if ((i_194_ ^ 0xffffffff) > -1) {
									i_194_ = -i_194_;
								}
								i_195_ = plane_173_.method3251(i_179_, i_178_, (byte) -118) - plane_173_.method3251(i_180_, i_177_, (byte) -118);
								if (i_195_ < 0) {
									i_195_ = -i_195_;
								}
							}
							i_183_ = (i_195_ ^ 0xffffffff) < (i_194_ ^ 0xffffffff) ? 1 : 0;
						}
						for (int i_196_ = 0; i_196_ < 13; i_196_++) {
							Class327.anIntArray5348[i_196_] = -1;
							Class136.anIntArray1695[i_196_] = 1;
						}
						boolean[] bools_197_ = class289 != null && class289.aBoolean3643 ? Class250.aBooleanArrayArray3168[b] : Node_Sub33.aBooleanArrayArray7406[b];
						method3341(b, class289, bs_174_, anInt3524, 8, i_177_, i_183_, anInt3521, graphicstoolkit, i_179_, bools, class236, bs, bs_176_);
						boolean bool_198_ = class289 != null && (class289.anInt3631 ^ 0xffffffff) != (class289.anInt3629 ^ 0xffffffff);
						if (!bool_198_) {
							for (int i_199_ = 0; i_199_ < 8; i_199_++) {
								if (Class327.anIntArray5348[i_199_] >= 0 && (Class262_Sub10.anIntArray7773[i_199_] ^ 0xffffffff) != (Class188_Sub1_Sub1.anIntArray9339[i_199_] ^ 0xffffffff)) {
									bool_198_ = true;
									break;
								}
							}
						}
						if (!bools_197_[0x3 & 1 + i_183_]) {
							bools[1] = Class313.method3647(bools[1], (Node_Sub30.method2723(Class136.anIntArray1695[2], Class136.anIntArray1695[4]) ^ 0xffffffff) == -1);
						}
						if (!bools_197_[0x3 & 3 + i_183_]) {
							bools[3] = Class313.method3647(bools[3], Node_Sub30.method2723(Class136.anIntArray1695[6], Class136.anIntArray1695[0]) == 0);
						}
						if (!bools_197_[i_183_ & 0x3]) {
							bools[0] = Class313.method3647(bools[0], (Node_Sub30.method2723(Class136.anIntArray1695[0], Class136.anIntArray1695[2]) ^ 0xffffffff) == -1);
						}
						if (!bools_197_[0x3 & 2 + i_183_]) {
							bools[2] = Class313.method3647(bools[2], (Node_Sub30.method2723(Class136.anIntArray1695[6], Class136.anIntArray1695[4]) ^ 0xffffffff) == -1);
						}
						if (!bool_182_ && ((b ^ 0xffffffff) == -1 || b == 12)) {
							if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
								bools[0] = bools[3] = false;
								b = (b ^ 0xffffffff) != -1 ? (byte) 14 : (byte) 13;
								i_183_ = 0;
							} else if (!bools[0] || !bools[1] || bools[2] || bools[3]) {
								if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
									b = (b ^ 0xffffffff) != -1 ? (byte) 14 : (byte) 13;
									bools[1] = bools[2] = false;
									i_183_ = 2;
								} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
									b = b != 0 ? (byte) 14 : (byte) 13;
									i_183_ = 1;
									bools[2] = bools[3] = false;
								}
							} else {
								b = (b ^ 0xffffffff) != -1 ? (byte) 14 : (byte) 13;
								i_183_ = 3;
								bools[0] = bools[1] = false;
							}
						}
						boolean bool_200_ = !bool_182_ && !bools[0] && !bools[2] && !bools[1] && !bools[3];
						int[] is_201_ = null;
						int i_202_;
						int[] is_203_;
						int i_204_;
						int[] is_205_;
						int[] is_206_;
						if (bool_200_) {
							is_205_ = Class141.anIntArrayArray1755[b];
							i_204_ = class289 == null ? 0 : ProducingGraphicsBuffer.anIntArray9881[b];
							is_203_ = Node_Sub43.anIntArrayArray7538[b];
							is_206_ = Class262_Sub21.anIntArrayArray7868[b];
							i_202_ = class236 == null ? 0 : Node_Sub38_Sub7.anIntArray10143[b];
						} else if (!bool_182_) {
							i_202_ = class236 == null ? 0 : Class206.anIntArray2463[b];
							is_203_ = Class262.anIntArrayArray3328[b];
							i_204_ = class289 == null ? 0 : Class264.anIntArray3352[b];
							is_205_ = Class60.anIntArrayArray882[b];
							is_201_ = Node.anIntArrayArray2801[b];
							is_206_ = Class114.anIntArrayArray1455[b];
						} else {
							is_203_ = Node_Sub15_Sub4.anIntArrayArray9799[b];
							i_204_ = class289 == null ? 0 : Node_Sub27.anIntArray7296[b];
							is_205_ = Class127.anIntArrayArray1642[b];
							is_201_ = Class262_Sub19.anIntArrayArray7854[b];
							is_206_ = Class320_Sub22.anIntArrayArray8425[b];
							i_202_ = class236 == null ? 0 : Class188_Sub2.anIntArray6877[b];
						}
						int i_207_ = i_204_ + i_202_;
						if ((i_207_ ^ 0xffffffff) >= -1) {
							Class320_Sub24.method3775(i, i_177_, i_179_);
						} else {
							if (bools[0]) {
								i_207_++;
							}
							if (bools[2]) {
								i_207_++;
							}
							if (bools[1]) {
								i_207_++;
							}
							if (bools[3]) {
								i_207_++;
							}
							int i_208_ = 0;
							int i_209_ = 0;
							int i_210_ = i_207_ * 3;
							int[] is_211_ = !bool_198_ ? null : new int[i_210_];
							int[] is_212_ = new int[i_210_];
							int[] is_213_ = new int[i_210_];
							int[] is_214_ = new int[i_210_];
							int[] is_215_ = new int[i_210_];
							int[] is_216_ = new int[i_210_];
							int[] is_217_ = plane == null ? null : new int[i_210_];
							int[] is_218_ = plane == null && plane_172_ == null ? null : new int[i_210_];
							int i_219_ = -1;
							int i_220_ = -1;
							int i_221_ = 256;
							if (class289 == null) {
								if (!bool_200_) {
									if (bool_182_) {
										i_208_ += Node_Sub27.anIntArray7296[b];
									} else {
										i_208_ += Class264.anIntArray3352[b];
									}
								} else {
									i_208_ += ProducingGraphicsBuffer.anIntArray9881[b];
								}
							} else {
								i_221_ = class289.anInt3632;
								i_219_ = class289.anInt3631;
								i_220_ = class289.anInt3640;
								int i_222_ = Class382.method4179(class289, (byte) -31, graphicstoolkit);
								for (int i_223_ = 0; i_223_ < i_204_; i_223_++) {
									int i_225_;
									if (!bools[-i_183_ & 0x3] || (is_201_[0] ^ 0xffffffff) != (i_208_ ^ 0xffffffff)) {
										if (!bools[0x3 & 2 - i_183_] || (is_201_[2] ^ 0xffffffff) != (i_208_ ^ 0xffffffff)) {
											if (!bools[1 - i_183_ & 0x3] || (is_201_[1] ^ 0xffffffff) != (i_208_ ^ 0xffffffff)) {
												if (bools[3 + -i_183_ & 0x3] && (is_201_[3] ^ 0xffffffff) == (i_208_ ^ 0xffffffff)) {
													Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
													Node_Sub38_Sub26.anIntArray10370[1] = 7;
													Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
													Node_Sub38_Sub26.anIntArray10370[3] = 7;
													Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
													i_225_ = 6;
													Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
												} else {
													Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
													Node_Sub38_Sub26.anIntArray10370[1] = is_206_[i_208_];
													Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
													i_225_ = 3;
												}
											} else {
												Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
												Node_Sub38_Sub26.anIntArray10370[1] = 3;
												Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
												Node_Sub38_Sub26.anIntArray10370[3] = 3;
												Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
												i_225_ = 6;
												Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
											}
										} else {
											Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[1] = 5;
											Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[3] = 5;
											Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
											i_225_ = 6;
										}
									} else {
										Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[1] = 1;
										Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[3] = 1;
										Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
										i_225_ = 6;
									}
									for (int i_226_ = 0; i_225_ > i_226_; i_226_++) {
										int i_227_ = Node_Sub38_Sub26.anIntArray10370[i_226_];
										int i_228_ = 0x7 & -(i_183_ * 2) + i_227_;
										int i_229_ = anIntArray3522[i_227_];
										int i_230_ = anIntArray3513[i_227_];
										int i_231_;
										int i_232_;
										if (i_183_ != 1) {
											if (i_183_ == 2) {
												i_231_ = 512 + -i_230_;
												i_232_ = 512 - i_229_;
											} else if ((i_183_ ^ 0xffffffff) != -4) {
												i_232_ = i_229_;
												i_231_ = i_230_;
											} else {
												i_232_ = 512 - i_230_;
												i_231_ = i_229_;
											}
										} else {
											i_231_ = -i_229_ + 512;
											i_232_ = i_230_;
										}
										is_212_[i_209_] = i_232_;
										is_213_[i_209_] = i_231_;
										if (is_217_ != null && GLPlane.aBooleanArrayArray7950[b][i_227_]) {
											int i_233_ = i_232_ + (i_177_ << 9);
											int i_234_ = (i_179_ << 9) - -i_231_;
											is_217_[i_209_] = plane.method3260(i_234_, -115, i_233_) + -plane_173_.method3260(i_234_, -112, i_233_);
										}
										if (is_218_ != null) {
											if (plane == null || GLPlane.aBooleanArrayArray7950[b][i_227_]) {
												if (plane_172_ != null && !Node_Sub15_Sub7.aBooleanArrayArray9822[b][i_227_]) {
													int i_235_ = i_232_ + (i_177_ << 9);
													int i_236_ = i_231_ + (i_179_ << 9);
													is_218_[i_209_] = plane_172_.method3260(i_236_, -109, i_235_) - plane_173_.method3260(i_236_, -115, i_235_);
												}
											} else {
												int i_237_ = i_232_ + (i_177_ << 9);
												int i_238_ = (i_179_ << 9) - -i_231_;
												is_218_[i_209_] = plane_173_.method3260(i_238_, -128, i_237_) - plane.method3260(i_238_, -111, i_237_);
											}
										}
										if (i_227_ < 8 && Class327.anIntArray5348[i_228_] > class289.anInt3633) {
											if (is_211_ != null) {
												is_211_[i_209_] = Class262_Sub10.anIntArray7773[i_228_];
											}
											is_216_[i_209_] = Class385.anIntArray4914[i_228_];
											is_215_[i_209_] = Class84.anIntArray1136[i_228_];
											is_214_[i_209_] = Class188_Sub1_Sub1.anIntArray9339[i_228_];
										} else {
											if (is_211_ != null) {
												is_211_[i_209_] = i_222_;
											}
											is_215_[i_209_] = class289.anInt3640;
											is_216_[i_209_] = class289.anInt3632;
											is_214_[i_209_] = i_219_;
										}
										i_209_++;
									}
									i_208_++;
								}
								if (!aBoolean3516 && i == 0) {
									Class158.method1725(i_177_, i_179_, class289.anInt3646, class289.anInt3634 * 8, class289.anInt3641);
								}
								if ((b ^ 0xffffffff) != -13 && (class289.anInt3631 ^ 0xffffffff) != 0 && class289.aBoolean3638) {
									bool_181_ = true;
								}
							}
							if (class236 != null) {
								if ((i_188_ ^ 0xffffffff) == -1) {
									i_188_ = i_185_;
								}
								if (i_187_ == 0) {
									i_187_ = i_185_;
								}
								if ((i_186_ ^ 0xffffffff) == -1) {
									i_186_ = i_185_;
								}
								Class236 class236_239_ = aClass58_3536.method573(-17993, -1 + i_185_);
								Class236 class236_240_ = aClass58_3536.method573(-17993, -1 + i_186_);
								Class236 class236_241_ = aClass58_3536.method573(-17993, -1 + i_187_);
								Class236 class236_242_ = aClass58_3536.method573(-17993, i_188_ - 1);
								for (int i_243_ = 0; (i_202_ ^ 0xffffffff) < (i_243_ ^ 0xffffffff); i_243_++) {
									int i_245_;
									if (bools[0x3 & -i_183_] && is_201_[0] == i_208_) {
										Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[1] = 1;
										Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[3] = 1;
										Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
										i_245_ = 6;
										Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
									} else if (bools[-i_183_ + 2 & 0x3] && is_201_[2] == i_208_) {
										Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[1] = 5;
										Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[3] = 5;
										Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
										i_245_ = 6;
										Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
									} else if (!bools[0x3 & -i_183_ + 1] || is_201_[1] != i_208_) {
										if (!bools[-i_183_ + 3 & 0x3] || (is_201_[3] ^ 0xffffffff) != (i_208_ ^ 0xffffffff)) {
											Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[1] = is_206_[i_208_];
											i_245_ = 3;
											Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
										} else {
											Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[1] = 7;
											Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[3] = 7;
											Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
											Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
											i_245_ = 6;
										}
									} else {
										Node_Sub38_Sub26.anIntArray10370[0] = is_205_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[1] = 3;
										Node_Sub38_Sub26.anIntArray10370[2] = is_203_[i_208_];
										Node_Sub38_Sub26.anIntArray10370[3] = 3;
										Node_Sub38_Sub26.anIntArray10370[4] = is_206_[i_208_];
										i_245_ = 6;
										Node_Sub38_Sub26.anIntArray10370[5] = is_203_[i_208_];
									}
									i_208_++;
									for (int i_246_ = 0; i_246_ < i_245_; i_246_++) {
										int i_247_ = Node_Sub38_Sub26.anIntArray10370[i_246_];
										int i_248_ = 0x7 & i_247_ + -(i_183_ * 2);
										int i_249_ = anIntArray3522[i_247_];
										int i_250_ = anIntArray3513[i_247_];
										int i_251_;
										int i_252_;
										if ((i_183_ ^ 0xffffffff) != -2) {
											if ((i_183_ ^ 0xffffffff) == -3) {
												i_251_ = -i_249_ + 512;
												i_252_ = 512 + -i_250_;
											} else if ((i_183_ ^ 0xffffffff) == -4) {
												i_252_ = i_249_;
												i_251_ = -i_250_ + 512;
											} else {
												i_251_ = i_249_;
												i_252_ = i_250_;
											}
										} else {
											i_251_ = i_250_;
											i_252_ = -i_249_ + 512;
										}
										is_212_[i_209_] = i_251_;
										is_213_[i_209_] = i_252_;
										if (is_217_ != null && GLPlane.aBooleanArrayArray7950[b][i_247_]) {
											int i_253_ = i_251_ + (i_177_ << 9);
											int i_254_ = i_252_ + (i_179_ << 9);
											is_217_[i_209_] = plane.method3260(i_254_, -123, i_253_) - plane_173_.method3260(i_254_, -111, i_253_);
										}
										if (is_218_ != null) {
											if (plane == null || GLPlane.aBooleanArrayArray7950[b][i_247_]) {
												if (plane_172_ != null && !Node_Sub15_Sub7.aBooleanArrayArray9822[b][i_247_]) {
													int i_255_ = i_251_ + (i_177_ << 9);
													int i_256_ = (i_179_ << 9) + i_252_;
													is_218_[i_209_] = plane_172_.method3260(i_256_, -124, i_255_) - plane_173_.method3260(i_256_, -121, i_255_);
												}
											} else {
												int i_257_ = (i_177_ << 9) + i_251_;
												int i_258_ = i_252_ + (i_179_ << 9);
												is_218_[i_209_] = plane_173_.method3260(i_258_, -117, i_257_) - plane.method3260(i_258_, -116, i_257_);
											}
										}
										if (i_247_ >= 8 || Class327.anIntArray5348[i_248_] < 0) {
											if (!bool_182_ || !GLPlane.aBooleanArrayArray7950[b][i_247_]) {
												if ((i_251_ ^ 0xffffffff) == -1 && i_252_ == 0) {
													is_214_[i_209_] = is[i_177_][i_179_];
													is_215_[i_209_] = class236_239_.anInt2891;
													is_216_[i_209_] = class236_239_.anInt2894;
												} else if (i_251_ != 0 || (i_252_ ^ 0xffffffff) != -513) {
													if (i_251_ == 512 && i_252_ == 512) {
														is_214_[i_209_] = is[i_178_][i_180_];
														is_215_[i_209_] = class236_241_.anInt2891;
														is_216_[i_209_] = class236_241_.anInt2894;
													} else if (i_251_ == 512 && (i_252_ ^ 0xffffffff) == -1) {
														is_214_[i_209_] = is[i_178_][i_179_];
														is_215_[i_209_] = class236_242_.anInt2891;
														is_216_[i_209_] = class236_242_.anInt2894;
													} else {
														if ((i_251_ ^ 0xffffffff) <= -257) {
															if (i_252_ < 256) {
																is_215_[i_209_] = class236_242_.anInt2891;
																is_216_[i_209_] = class236_242_.anInt2894;
															} else {
																is_215_[i_209_] = class236_241_.anInt2891;
																is_216_[i_209_] = class236_241_.anInt2894;
															}
														} else if (i_252_ < 256) {
															is_215_[i_209_] = class236_239_.anInt2891;
															is_216_[i_209_] = class236_239_.anInt2894;
														} else {
															is_215_[i_209_] = class236_240_.anInt2891;
															is_216_[i_209_] = class236_240_.anInt2894;
														}
														int i_259_ = Node_Sub25_Sub1.method2664(is[i_178_][i_179_], 128, i_251_ << 7 >> 9, is[i_177_][i_179_]);
														int i_260_ = Node_Sub25_Sub1.method2664(is[i_178_][i_180_], 128, i_251_ << 7 >> 9, is[i_177_][i_180_]);
														is_214_[i_209_] = Node_Sub25_Sub1.method2664(i_260_, 128, i_252_ << 7 >> 9, i_259_);
													}
												} else {
													is_214_[i_209_] = is[i_177_][i_180_];
													is_215_[i_209_] = class236_240_.anInt2891;
													is_216_[i_209_] = class236_240_.anInt2894;
												}
											} else {
												is_215_[i_209_] = i_220_;
												is_216_[i_209_] = i_221_;
												is_214_[i_209_] = i_219_;
											}
											if (is_211_ != null) {
												is_211_[i_209_] = is_214_[i_209_];
											}
										} else {
											if (is_211_ != null) {
												is_211_[i_209_] = Class262_Sub10.anIntArray7773[i_248_];
											}
											is_216_[i_209_] = Class385.anIntArray4914[i_248_];
											is_215_[i_209_] = Class84.anIntArray1136[i_248_];
											is_214_[i_209_] = Class188_Sub1_Sub1.anIntArray9339[i_248_];
										}
										i_209_++;
									}
								}
								if ((b ^ 0xffffffff) != -1 && class236.aBoolean2896) {
									bool_181_ = true;
								}
							}
							int i_261_ = plane_173_.method3251(i_179_, i_177_, (byte) -118);
							int i_262_ = plane_173_.method3251(i_179_, i_178_, (byte) -118);
							int i_263_ = plane_173_.method3251(i_180_, i_178_, (byte) -118);
							int i_264_ = plane_173_.method3251(i_180_, i_177_, (byte) -118);
							boolean bool_265_ = Class238.method3021(i_179_, i_177_, 79);
							if (bool_265_ && (i ^ 0xffffffff) < -2 || !bool_265_ && i > 0) {
								boolean bool_266_ = true;
								if (class236 == null || class236.aBoolean2892) {
									if (i_185_ == 0 && b != 0) {
										bool_266_ = false;
									} else if ((i_184_ ^ 0xffffffff) < -1 && class289_189_ != null && !class289_189_.aBoolean3636) {
										bool_266_ = false;
									}
								} else {
									bool_266_ = false;
								}
								if (bool_266_ && i_262_ == i_261_ && i_263_ == i_261_ && (i_261_ ^ 0xffffffff) == (i_264_ ^ 0xffffffff)) {
									aByteArrayArrayArray3526[i][i_177_][i_179_] = (byte) Node_Sub16.method2590(aByteArrayArrayArray3526[i][i_177_][i_179_], 4);
								}
							}
							int i_267_ = 0;
							int i_268_ = 0;
							int i_269_ = 0;
							if (aBoolean3516) {
								i_267_ = Class320_Sub2.method3684(i_177_, i_179_);
								i_268_ = Class184.method1844(i_177_, i_179_);
								i_269_ = Class117_Sub2.method1172(i_177_, i_179_);
							}
							plane_173_.U(i_177_, i_179_, is_212_, is_217_, is_213_, is_218_, is_214_, is_211_, is_215_, is_216_, i_267_, i_268_, i_269_, bool_181_);
							Class320_Sub24.method3775(i, i_177_, i_179_);
						}
					}
				}
			}
		}
	}
	
	final void method3349(int i, int i_270_, int i_271_, int i_272_, int i_273_, BufferedStream buffer, int i_274_, int i_275_, Class84[] class84s, byte b) {
		anInt3514++;
		if (b > -115) {
			anInt3535 = 62;
		}
		int i_276_ = (i_275_ & 0x7) * 8;
		int i_277_ = 8 * (i_272_ & 0x7);
		if (!aBoolean3516) {
			Class84 class84 = class84s[i];
			for (int i_278_ = 0; i_278_ < 8; i_278_++) {
				for (int i_279_ = 0; i_279_ < 8; i_279_++) {
					int i_280_ = i_271_ - -Class339.method3921(0x7 & i_278_, i_279_ & 0x7, 7, i_274_);
					int i_281_ = i_273_ + Class280.method3378(i_279_ & 0x7, i_278_ & 0x7, (byte) 125, i_274_);
					if ((i_280_ ^ 0xffffffff) < -1 && (anInt3524 + -1 ^ 0xffffffff) < (i_280_ ^ 0xffffffff) && i_281_ > 0 && (i_281_ ^ 0xffffffff) > (anInt3521 - 1 ^ 0xffffffff)) {
						class84.method993(i_281_, i_280_, -117);
					}
				}
			}
		}
		int i_282_ = (~0x7 & i_275_) << 3;
		int i_283_ = (~0x7 & i_272_) << 3;
		int i_284_ = 0;
		int i_285_ = 0;
		if (i_274_ == 1) {
			i_285_ = 1;
		} else if ((i_274_ ^ 0xffffffff) == -3) {
			i_285_ = 1;
			i_284_ = 1;
		} else if (i_274_ == 3) {
			i_284_ = 1;
		}
		for (int i_286_ = 0; i_286_ < anInt3535; i_286_++) {
			for (int i_287_ = 0; (i_287_ ^ 0xffffffff) > -65; i_287_++) {
				for (int i_288_ = 0; i_288_ < 64; i_288_++) {
					if ((i_270_ ^ 0xffffffff) != (i_286_ ^ 0xffffffff) || (i_287_ ^ 0xffffffff) > (i_276_ ^ 0xffffffff) || i_287_ > 8 + i_276_ || (i_277_ ^ 0xffffffff) < (i_288_ ^ 0xffffffff) || i_288_ > 8 + i_277_) {
						method3345(0, -1, 0, -1, 0, buffer, 0, 0, 0, -682, false);
					} else {
						int i_289_;
						int i_290_;
						if ((i_276_ - -8 ^ 0xffffffff) == (i_287_ ^ 0xffffffff) || i_288_ == 8 + i_277_) {
							if (i_274_ != 0) {
								if (i_274_ == 1) {
									i_289_ = i_271_ + i_288_ + -i_277_;
									i_290_ = i_276_ + -i_287_ + (i_273_ - -8);
								} else if ((i_274_ ^ 0xffffffff) == -3) {
									i_289_ = 8 + i_271_ - (i_287_ + -i_276_);
									i_290_ = i_277_ - (i_288_ - 8 - i_273_);
								} else {
									i_290_ = i_287_ + (-i_276_ + i_273_);
									i_289_ = i_271_ - (-8 + i_288_ + -i_277_);
								}
							} else {
								i_289_ = i_271_ - i_276_ - -i_287_;
								i_290_ = i_273_ - i_277_ - -i_288_;
							}
							method3345(0, i_290_, 0, i_289_, i_287_ + i_282_, buffer, 0, i_288_ + i_283_, i, -682, true);
						} else {
							i_289_ = i_271_ + Class339.method3921(0x7 & i_287_, i_288_ & 0x7, 7, i_274_);
							i_290_ = Class280.method3378(0x7 & i_288_, 0x7 & i_287_, (byte) 126, i_274_) + i_273_;
							method3345(i_274_, i_290_, i_285_, i_289_, i_287_ + i_282_, buffer, i_284_, i_288_ + i_283_, i, -682, false);
						}
						if (i_287_ == 63 || i_288_ == 63) {
							int i_291_ = 1;
							if ((i_287_ ^ 0xffffffff) == -64 && i_288_ == 63) {
								i_291_ = 3;
							}
							for (int i_292_ = 0; (i_291_ ^ 0xffffffff) < (i_292_ ^ 0xffffffff); i_292_++) {
								int i_293_ = i_287_;
								int i_294_ = i_288_;
								if (i_292_ != 0) {
									if ((i_292_ ^ 0xffffffff) == -2) {
										i_293_ = 64;
									} else if (i_292_ == 2) {
										i_294_ = 64;
									}
								} else {
									i_294_ = (i_288_ ^ 0xffffffff) == -64 ? 64 : i_288_;
									i_293_ = (i_287_ ^ 0xffffffff) != -64 ? i_287_ : 64;
								}
								int i_295_;
								int i_296_;
								if (i_274_ == 0) {
									i_295_ = i_273_ - (i_277_ + -i_294_);
									i_296_ = -i_276_ - -i_293_ + i_271_;
								} else if ((i_274_ ^ 0xffffffff) != -2) {
									if ((i_274_ ^ 0xffffffff) == -3) {
										i_295_ = -i_294_ - (-i_277_ - i_273_ + -8);
										i_296_ = -i_293_ - -i_276_ + (8 + i_271_);
									} else {
										i_295_ = i_273_ + i_293_ + -i_276_;
										i_296_ = i_271_ + 8 - (i_294_ + -i_277_);
									}
								} else {
									i_296_ = i_294_ - (i_277_ - i_271_);
									i_295_ = 8 + i_273_ + (i_276_ + -i_293_);
								}
								if (i_296_ >= 0 && anInt3524 > i_296_ && i_295_ >= 0 && anInt3521 > i_295_) {
									anIntArrayArrayArray3520[i][i_296_][i_295_] = anIntArrayArrayArray3520[i][i_284_ + i_289_][i_290_ - -i_285_];
								}
							}
						}
					}
				}
			}
		}
	}
	
	Class277(int i, int i_297_, int i_298_, boolean bool, Class71 class71, Class58 class58) {
		aClass58_3536 = class58;
		anInt3521 = i_298_;
		anInt3535 = i;
		aBoolean3516 = bool;
		anInt3524 = i_297_;
		aClass71_3512 = class71;
		aByteArrayArrayArray3525 = new byte[anInt3535][anInt3524][anInt3521];
		aByteArrayArrayArray3537 = new byte[anInt3535][anInt3524][anInt3521];
		aByteArrayArrayArray3526 = new byte[anInt3535][1 + anInt3524][anInt3521 - -1];
		aByteArrayArrayArray3528 = new byte[anInt3535][anInt3524][anInt3521];
		aByteArrayArrayArray3530 = new byte[anInt3535][anInt3524][anInt3521];
		anIntArrayArrayArray3520 = new int[anInt3535][1 + anInt3524][anInt3521 - -1];
	}
}
