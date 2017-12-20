/* GLSprite_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GLSprite_Sub2_Sub2 extends GLSprite_Sub2
{
	protected int[] anIntArray10570;
	
	final void method1191(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		int i_4_ = aPureJavaToolkit8886.anInt6789;
		i += anInt8889;
		i_0_ += anInt8899;
		int i_5_ = i_0_ * i_4_ + i;
		int i_6_ = 0;
		int i_7_ = anInt8897;
		int i_8_ = anInt8893;
		int i_9_ = i_4_ - i_8_;
		int i_10_ = 0;
		if (i_0_ < aPureJavaToolkit8886.anInt6760) {
			int i_11_ = aPureJavaToolkit8886.anInt6760 - i_0_;
			i_7_ -= i_11_;
			i_0_ = aPureJavaToolkit8886.anInt6760;
			i_6_ += i_11_ * i_8_;
			i_5_ += i_11_ * i_4_;
		}
		if (i_0_ + i_7_ > aPureJavaToolkit8886.anInt6772) {
			i_7_ -= i_0_ + i_7_ - aPureJavaToolkit8886.anInt6772;
		}
		if (i < aPureJavaToolkit8886.anInt6767) {
			int i_12_ = aPureJavaToolkit8886.anInt6767 - i;
			i_8_ -= i_12_;
			i = aPureJavaToolkit8886.anInt6767;
			i_6_ += i_12_;
			i_5_ += i_12_;
			i_10_ += i_12_;
			i_9_ += i_12_;
		}
		if (i + i_8_ > aPureJavaToolkit8886.anInt6778) {
			int i_13_ = i + i_8_ - aPureJavaToolkit8886.anInt6778;
			i_8_ -= i_13_;
			i_10_ += i_13_;
			i_9_ += i_13_;
		}
		if (i_8_ > 0 && i_7_ > 0) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_3_ == 0) {
				if (i_1_ == 1) {
					for (int i_14_ = -i_7_; i_14_ < 0; i_14_++) {
						int i_15_ = i_5_ + i_8_ - 3;
						while (i_5_ < i_15_) {
							is[i_5_++] = anIntArray10570[i_6_++];
							is[i_5_++] = anIntArray10570[i_6_++];
							is[i_5_++] = anIntArray10570[i_6_++];
							is[i_5_++] = anIntArray10570[i_6_++];
						}
						i_15_ += 3;
						while (i_5_ < i_15_)
							is[i_5_++] = anIntArray10570[i_6_++];
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 0) {
					int i_16_ = (i_2_ & 0xff0000) >> 16;
					int i_17_ = (i_2_ & 0xff00) >> 8;
					int i_18_ = i_2_ & 0xff;
					for (int i_19_ = -i_7_; i_19_ < 0; i_19_++) {
						for (int i_20_ = -i_8_; i_20_ < 0; i_20_++) {
							int i_21_ = anIntArray10570[i_6_++];
							int i_22_ = (i_21_ & 0xff0000) * i_16_ & ~0xffffff;
							int i_23_ = (i_21_ & 0xff00) * i_17_ & 0xff0000;
							int i_24_ = (i_21_ & 0xff) * i_18_ & 0xff00;
							is[i_5_++] = (i_22_ | i_23_ | i_24_) >>> 8;
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 3) {
					for (int i_25_ = -i_7_; i_25_ < 0; i_25_++) {
						for (int i_26_ = -i_8_; i_26_ < 0; i_26_++) {
							int i_27_ = anIntArray10570[i_6_++];
							int i_28_ = i_27_ + i_2_;
							int i_29_ = (i_27_ & 0xff00ff) + (i_2_ & 0xff00ff);
							int i_30_ = (i_29_ & 0x1000100) + (i_28_ - i_29_ & 0x10000);
							is[i_5_++] = i_28_ - i_30_ | i_30_ - (i_30_ >>> 8);
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 2) {
					int i_31_ = i_2_ >>> 24;
					int i_32_ = 256 - i_31_;
					int i_33_ = (i_2_ & 0xff00ff) * i_32_ & ~0xff00ff;
					int i_34_ = (i_2_ & 0xff00) * i_32_ & 0xff0000;
					i_2_ = (i_33_ | i_34_) >>> 8;
					for (int i_35_ = -i_7_; i_35_ < 0; i_35_++) {
						for (int i_36_ = -i_8_; i_36_ < 0; i_36_++) {
							int i_37_ = anIntArray10570[i_6_++];
							i_33_ = (i_37_ & 0xff00ff) * i_31_ & ~0xff00ff;
							i_34_ = (i_37_ & 0xff00) * i_31_ & 0xff0000;
							is[i_5_++] = ((i_33_ | i_34_) >>> 8) + i_2_;
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_3_ == 1) {
				if (i_1_ == 1) {
					for (int i_38_ = -i_7_; i_38_ < 0; i_38_++) {
						for (int i_39_ = -i_8_; i_39_ < 0; i_39_++) {
							int i_40_ = anIntArray10570[i_6_++];
							int i_41_ = i_40_ >>> 24;
							int i_42_ = 256 - i_41_;
							int i_43_ = is[i_5_];
							is[i_5_++] = (((i_40_ & 0xff00ff) * i_41_ + (i_43_ & 0xff00ff) * i_42_ & ~0xff00ff) >> 8) + (((i_40_ & ~0xff00ff) >>> 8) * i_41_ + ((i_43_ & ~0xff00ff) >>> 8) * i_42_ & ~0xff00ff);
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 0) {
					if ((i_2_ & 0xffffff) == 16777215) {
						for (int i_44_ = -i_7_; i_44_ < 0; i_44_++) {
							for (int i_45_ = -i_8_; i_45_ < 0; i_45_++) {
								int i_46_ = anIntArray10570[i_6_++];
								int i_47_ = (i_46_ >>> 24) * (i_2_ >>> 24) >> 8;
								int i_48_ = 256 - i_47_;
								int i_49_ = is[i_5_];
								is[i_5_++] = ((i_46_ & 0xff00ff) * i_47_ + (i_49_ & 0xff00ff) * i_48_ & ~0xff00ff) + ((i_46_ & 0xff00) * i_47_ + (i_49_ & 0xff00) * i_48_ & 0xff0000) >> 8;
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
					} else {
						int i_50_ = (i_2_ & 0xff0000) >> 16;
						int i_51_ = (i_2_ & 0xff00) >> 8;
						int i_52_ = i_2_ & 0xff;
						for (int i_53_ = -i_7_; i_53_ < 0; i_53_++) {
							for (int i_54_ = -i_8_; i_54_ < 0; i_54_++) {
								int i_55_ = anIntArray10570[i_6_++];
								int i_56_ = (i_55_ >>> 24) * (i_2_ >>> 24) >> 8;
								int i_57_ = 256 - i_56_;
								if (i_56_ != 255) {
									int i_58_ = (i_55_ & 0xff0000) * i_50_ & ~0xffffff;
									int i_59_ = (i_55_ & 0xff00) * i_51_ & 0xff0000;
									int i_60_ = (i_55_ & 0xff) * i_52_ & 0xff00;
									i_55_ = (i_58_ | i_59_ | i_60_) >>> 8;
									int i_61_ = is[i_5_];
									is[i_5_++] = ((i_55_ & 0xff00ff) * i_56_ + (i_61_ & 0xff00ff) * i_57_ & ~0xff00ff) + ((i_55_ & 0xff00) * i_56_ + (i_61_ & 0xff00) * i_57_ & 0xff0000) >> 8;
								} else {
									int i_62_ = (i_55_ & 0xff0000) * i_50_ & ~0xffffff;
									int i_63_ = (i_55_ & 0xff00) * i_51_ & 0xff0000;
									int i_64_ = (i_55_ & 0xff) * i_52_ & 0xff00;
									is[i_5_++] = (i_62_ | i_63_ | i_64_) >>> 8;
								}
							}
							i_5_ += i_9_;
							i_6_ += i_10_;
						}
						return;
					}
					return;
				}
				if (i_1_ == 3) {
					for (int i_65_ = -i_7_; i_65_ < 0; i_65_++) {
						for (int i_66_ = -i_8_; i_66_ < 0; i_66_++) {
							int i_67_ = anIntArray10570[i_6_++];
							int i_68_ = i_67_ + i_2_;
							int i_69_ = (i_67_ & 0xff00ff) + (i_2_ & 0xff00ff);
							int i_70_ = (i_69_ & 0x1000100) + (i_68_ - i_69_ & 0x10000);
							i_70_ = i_68_ - i_70_ | i_70_ - (i_70_ >>> 8);
							int i_71_ = (i_70_ >>> 24) * (i_2_ >>> 24) >> 8;
							int i_72_ = 256 - i_71_;
							if (i_71_ != 255) {
								i_67_ = i_70_;
								i_70_ = is[i_5_];
								i_70_ = ((i_67_ & 0xff00ff) * i_71_ + (i_70_ & 0xff00ff) * i_72_ & ~0xff00ff) + ((i_67_ & 0xff00) * i_71_ + (i_70_ & 0xff00) * i_72_ & 0xff0000) >> 8;
							}
							is[i_5_++] = i_70_;
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 2) {
					int i_73_ = i_2_ >>> 24;
					int i_74_ = 256 - i_73_;
					int i_75_ = (i_2_ & 0xff00ff) * i_74_ & ~0xff00ff;
					int i_76_ = (i_2_ & 0xff00) * i_74_ & 0xff0000;
					i_2_ = (i_75_ | i_76_) >>> 8;
					for (int i_77_ = -i_7_; i_77_ < 0; i_77_++) {
						for (int i_78_ = -i_8_; i_78_ < 0; i_78_++) {
							int i_79_ = anIntArray10570[i_6_++];
							int i_80_ = i_79_ >>> 24;
							int i_81_ = 256 - i_80_;
							i_75_ = (i_79_ & 0xff00ff) * i_73_ & ~0xff00ff;
							i_76_ = (i_79_ & 0xff00) * i_73_ & 0xff0000;
							i_79_ = ((i_75_ | i_76_) >>> 8) + i_2_;
							int i_82_ = is[i_5_];
							is[i_5_++] = ((i_79_ & 0xff00ff) * i_80_ + (i_82_ & 0xff00ff) * i_81_ & ~0xff00ff) + ((i_79_ & 0xff00) * i_80_ + (i_82_ & 0xff00) * i_81_ & 0xff0000) >> 8;
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_3_ == 2) {
				if (i_1_ == 1) {
					for (int i_83_ = -i_7_; i_83_ < 0; i_83_++) {
						for (int i_84_ = -i_8_; i_84_ < 0; i_84_++) {
							int i_85_ = anIntArray10570[i_6_++];
							if (i_85_ != 0) {
								int i_86_ = is[i_5_];
								int i_87_ = i_85_ + i_86_;
								int i_88_ = (i_85_ & 0xff00ff) + (i_86_ & 0xff00ff);
								i_86_ = (i_88_ & 0x1000100) + (i_87_ - i_88_ & 0x10000);
								is[i_5_++] = i_87_ - i_86_ | i_86_ - (i_86_ >>> 8);
							} else {
								i_5_++;
							}
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 0) {
					int i_89_ = (i_2_ & 0xff0000) >> 16;
					int i_90_ = (i_2_ & 0xff00) >> 8;
					int i_91_ = i_2_ & 0xff;
					for (int i_92_ = -i_7_; i_92_ < 0; i_92_++) {
						for (int i_93_ = -i_8_; i_93_ < 0; i_93_++) {
							int i_94_ = anIntArray10570[i_6_++];
							if (i_94_ != 0) {
								int i_95_ = (i_94_ & 0xff0000) * i_89_ & ~0xffffff;
								int i_96_ = (i_94_ & 0xff00) * i_90_ & 0xff0000;
								int i_97_ = (i_94_ & 0xff) * i_91_ & 0xff00;
								i_94_ = (i_95_ | i_96_ | i_97_) >>> 8;
								int i_98_ = is[i_5_];
								int i_99_ = i_94_ + i_98_;
								int i_100_ = (i_94_ & 0xff00ff) + (i_98_ & 0xff00ff);
								i_98_ = (i_100_ & 0x1000100) + (i_99_ - i_100_ & 0x10000);
								is[i_5_++] = i_99_ - i_98_ | i_98_ - (i_98_ >>> 8);
							} else {
								i_5_++;
							}
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 3) {
					for (int i_101_ = -i_7_; i_101_ < 0; i_101_++) {
						for (int i_102_ = -i_8_; i_102_ < 0; i_102_++) {
							int i_103_ = anIntArray10570[i_6_++];
							int i_104_ = i_103_ + i_2_;
							int i_105_ = (i_103_ & 0xff00ff) + (i_2_ & 0xff00ff);
							int i_106_ = (i_105_ & 0x1000100) + (i_104_ - i_105_ & 0x10000);
							i_103_ = i_104_ - i_106_ | i_106_ - (i_106_ >>> 8);
							i_106_ = is[i_5_];
							i_104_ = i_103_ + i_106_;
							i_105_ = (i_103_ & 0xff00ff) + (i_106_ & 0xff00ff);
							i_106_ = (i_105_ & 0x1000100) + (i_104_ - i_105_ & 0x10000);
							is[i_5_++] = i_104_ - i_106_ | i_106_ - (i_106_ >>> 8);
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				if (i_1_ == 2) {
					int i_107_ = i_2_ >>> 24;
					int i_108_ = 256 - i_107_;
					int i_109_ = (i_2_ & 0xff00ff) * i_108_ & ~0xff00ff;
					int i_110_ = (i_2_ & 0xff00) * i_108_ & 0xff0000;
					i_2_ = (i_109_ | i_110_) >>> 8;
					for (int i_111_ = -i_7_; i_111_ < 0; i_111_++) {
						for (int i_112_ = -i_8_; i_112_ < 0; i_112_++) {
							int i_113_ = anIntArray10570[i_6_++];
							if (i_113_ != 0) {
								i_109_ = (i_113_ & 0xff00ff) * i_107_ & ~0xff00ff;
								i_110_ = (i_113_ & 0xff00) * i_107_ & 0xff0000;
								i_113_ = ((i_109_ | i_110_) >>> 8) + i_2_;
								int i_114_ = is[i_5_];
								int i_115_ = i_113_ + i_114_;
								int i_116_ = (i_113_ & 0xff00ff) + (i_114_ & 0xff00ff);
								i_114_ = (i_116_ & 0x1000100) + (i_115_ - i_116_ & 0x10000);
								is[i_5_++] = i_115_ - i_114_ | i_114_ - (i_114_ >>> 8);
							} else {
								i_5_++;
							}
						}
						i_5_ += i_9_;
						i_6_ += i_10_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	final void method1209(int i, int i_117_) {
		int[] is = aPureJavaToolkit8886.anIntArray6787;
		if (GLSprite_Sub2.anInt8913 == 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_118_ = GLSprite_Sub2.anInt8888;
				while (i_118_ < 0) {
					int i_119_ = GLSprite_Sub2.anInt8882;
					int i_120_ = GLSprite_Sub2.anInt8901;
					int i_121_ = GLSprite_Sub2.anInt8908;
					int i_122_ = GLSprite_Sub2.anInt8894;
					if (i_120_ >= 0 && i_121_ >= 0 && i_120_ - (anInt8893 << 12) < 0 && i_121_ - (anInt8897 << 12) < 0) {
						for (/**/; i_122_ < 0; i_122_++) {
							int i_123_ = (i_121_ >> 12) * anInt8893 + (i_120_ >> 12);
							int i_124_ = i_119_++;
							int[] is_125_ = is;
							int i_126_ = i;
							int i_127_ = i_117_;
							if (i_127_ == 0) {
								if (i_126_ == 1) {
									is_125_[i_124_] = anIntArray10570[i_123_];
								} else if (i_126_ == 0) {
									int i_128_ = anIntArray10570[i_123_++];
									int i_129_ = (i_128_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_130_ = (i_128_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_131_ = (i_128_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_125_[i_124_] = (i_129_ | i_130_ | i_131_) >>> 8;
								} else if (i_126_ == 3) {
									int i_132_ = anIntArray10570[i_123_++];
									int i_133_ = GLSprite_Sub2.anInt8904;
									int i_134_ = i_132_ + i_133_;
									int i_135_ = (i_132_ & 0xff00ff) + (i_133_ & 0xff00ff);
									int i_136_ = (i_135_ & 0x1000100) + (i_134_ - i_135_ & 0x10000);
									is_125_[i_124_] = i_134_ - i_136_ | i_136_ - (i_136_ >>> 8);
								} else if (i_126_ == 2) {
									int i_137_ = anIntArray10570[i_123_];
									int i_138_ = (i_137_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_139_ = (i_137_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_125_[i_124_] = ((i_138_ | i_139_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_127_ == 1) {
								if (i_126_ == 1) {
									int i_140_ = anIntArray10570[i_123_];
									int i_141_ = i_140_ >>> 24;
									int i_142_ = 256 - i_141_;
									int i_143_ = is_125_[i_124_];
									is_125_[i_124_] = ((i_140_ & 0xff00ff) * i_141_ + (i_143_ & 0xff00ff) * i_142_ & ~0xff00ff) + ((i_140_ & 0xff00) * i_141_ + (i_143_ & 0xff00) * i_142_ & 0xff0000) >> 8;
								} else if (i_126_ == 0) {
									int i_144_ = anIntArray10570[i_123_];
									int i_145_ = (i_144_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_146_ = 256 - i_145_;
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_147_ = is_125_[i_124_];
										is_125_[i_124_] = ((i_144_ & 0xff00ff) * i_145_ + (i_147_ & 0xff00ff) * i_146_ & ~0xff00ff) + ((i_144_ & 0xff00) * i_145_ + (i_147_ & 0xff00) * i_146_ & 0xff0000) >> 8;
									} else if (i_145_ != 255) {
										int i_148_ = (i_144_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_149_ = (i_144_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_150_ = (i_144_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_144_ = (i_148_ | i_149_ | i_150_) >>> 8;
										int i_151_ = is_125_[i_124_];
										is_125_[i_124_] = ((i_144_ & 0xff00ff) * i_145_ + (i_151_ & 0xff00ff) * i_146_ & ~0xff00ff) + ((i_144_ & 0xff00) * i_145_ + (i_151_ & 0xff00) * i_146_ & 0xff0000) >> 8;
									} else {
										int i_152_ = (i_144_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_153_ = (i_144_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_154_ = (i_144_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_125_[i_124_] = (i_152_ | i_153_ | i_154_) >>> 8;
									}
								} else if (i_126_ == 3) {
									int i_155_ = anIntArray10570[i_123_];
									int i_156_ = GLSprite_Sub2.anInt8904;
									int i_157_ = i_155_ + i_156_;
									int i_158_ = (i_155_ & 0xff00ff) + (i_156_ & 0xff00ff);
									int i_159_ = (i_158_ & 0x1000100) + (i_157_ - i_158_ & 0x10000);
									i_159_ = i_157_ - i_159_ | i_159_ - (i_159_ >>> 8);
									int i_160_ = (i_155_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_161_ = 256 - i_160_;
									if (i_160_ != 255) {
										i_155_ = i_159_;
										i_159_ = is_125_[i_124_];
										i_159_ = ((i_155_ & 0xff00ff) * i_160_ + (i_159_ & 0xff00ff) * i_161_ & ~0xff00ff) + ((i_155_ & 0xff00) * i_160_ + (i_159_ & 0xff00) * i_161_ & 0xff0000) >> 8;
									}
									is_125_[i_124_] = i_159_;
								} else if (i_126_ == 2) {
									int i_162_ = anIntArray10570[i_123_];
									int i_163_ = i_162_ >>> 24;
									int i_164_ = 256 - i_163_;
									int i_165_ = (i_162_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_166_ = (i_162_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_162_ = ((i_165_ | i_166_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_167_ = is_125_[i_124_];
									is_125_[i_124_] = ((i_162_ & 0xff00ff) * i_163_ + (i_167_ & 0xff00ff) * i_164_ & ~0xff00ff) + ((i_162_ & 0xff00) * i_163_ + (i_167_ & 0xff00) * i_164_ & 0xff0000) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_127_ == 2) {
								if (i_126_ == 1) {
									int i_168_ = anIntArray10570[i_123_];
									int i_169_ = is_125_[i_124_];
									int i_170_ = i_168_ + i_169_;
									int i_171_ = (i_168_ & 0xff00ff) + (i_169_ & 0xff00ff);
									i_169_ = (i_171_ & 0x1000100) + (i_170_ - i_171_ & 0x10000);
									is_125_[i_124_] = i_170_ - i_169_ | i_169_ - (i_169_ >>> 8);
								} else if (i_126_ == 0) {
									int i_172_ = anIntArray10570[i_123_];
									int i_173_ = (i_172_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_174_ = (i_172_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_175_ = (i_172_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_172_ = (i_173_ | i_174_ | i_175_) >>> 8;
									int i_176_ = is_125_[i_124_];
									int i_177_ = i_172_ + i_176_;
									int i_178_ = (i_172_ & 0xff00ff) + (i_176_ & 0xff00ff);
									i_176_ = (i_178_ & 0x1000100) + (i_177_ - i_178_ & 0x10000);
									is_125_[i_124_] = i_177_ - i_176_ | i_176_ - (i_176_ >>> 8);
								} else if (i_126_ == 3) {
									int i_179_ = anIntArray10570[i_123_];
									int i_180_ = GLSprite_Sub2.anInt8904;
									int i_181_ = i_179_ + i_180_;
									int i_182_ = (i_179_ & 0xff00ff) + (i_180_ & 0xff00ff);
									int i_183_ = (i_182_ & 0x1000100) + (i_181_ - i_182_ & 0x10000);
									i_179_ = i_181_ - i_183_ | i_183_ - (i_183_ >>> 8);
									i_183_ = is_125_[i_124_];
									i_181_ = i_179_ + i_183_;
									i_182_ = (i_179_ & 0xff00ff) + (i_183_ & 0xff00ff);
									i_183_ = (i_182_ & 0x1000100) + (i_181_ - i_182_ & 0x10000);
									is_125_[i_124_] = i_181_ - i_183_ | i_183_ - (i_183_ >>> 8);
								} else if (i_126_ == 2) {
									int i_184_ = anIntArray10570[i_123_];
									int i_185_ = (i_184_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_186_ = (i_184_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_184_ = ((i_185_ | i_186_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_187_ = is_125_[i_124_];
									int i_188_ = i_184_ + i_187_;
									int i_189_ = (i_184_ & 0xff00ff) + (i_187_ & 0xff00ff);
									i_187_ = (i_189_ & 0x1000100) + (i_188_ - i_189_ & 0x10000);
									is_125_[i_124_] = i_188_ - i_187_ | i_187_ - (i_187_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
						}
					}
					i_118_++;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_190_ = GLSprite_Sub2.anInt8888;
				while (i_190_ < 0) {
					int i_191_ = GLSprite_Sub2.anInt8882;
					int i_192_ = GLSprite_Sub2.anInt8901;
					int i_193_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_194_ = GLSprite_Sub2.anInt8894;
					if (i_192_ >= 0 && i_192_ - (anInt8893 << 12) < 0) {
						int i_195_;
						if ((i_195_ = i_193_ - (anInt8897 << 12)) >= 0) {
							i_195_ = (GLSprite_Sub2.anInt8900 - i_195_) / GLSprite_Sub2.anInt8900;
							i_194_ += i_195_;
							i_193_ += GLSprite_Sub2.anInt8900 * i_195_;
							i_191_ += i_195_;
						}
						if ((i_195_ = (i_193_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_194_) {
							i_194_ = i_195_;
						}
						for (/**/; i_194_ < 0; i_194_++) {
							int i_196_ = (i_193_ >> 12) * anInt8893 + (i_192_ >> 12);
							int i_197_ = i_191_++;
							int[] is_198_ = is;
							int i_199_ = i;
							int i_200_ = i_117_;
							if (i_200_ == 0) {
								if (i_199_ == 1) {
									is_198_[i_197_] = anIntArray10570[i_196_];
								} else if (i_199_ == 0) {
									int i_201_ = anIntArray10570[i_196_++];
									int i_202_ = (i_201_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_203_ = (i_201_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_204_ = (i_201_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_198_[i_197_] = (i_202_ | i_203_ | i_204_) >>> 8;
								} else if (i_199_ == 3) {
									int i_205_ = anIntArray10570[i_196_++];
									int i_206_ = GLSprite_Sub2.anInt8904;
									int i_207_ = i_205_ + i_206_;
									int i_208_ = (i_205_ & 0xff00ff) + (i_206_ & 0xff00ff);
									int i_209_ = (i_208_ & 0x1000100) + (i_207_ - i_208_ & 0x10000);
									is_198_[i_197_] = i_207_ - i_209_ | i_209_ - (i_209_ >>> 8);
								} else if (i_199_ == 2) {
									int i_210_ = anIntArray10570[i_196_];
									int i_211_ = (i_210_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_212_ = (i_210_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_198_[i_197_] = ((i_211_ | i_212_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_200_ == 1) {
								if (i_199_ == 1) {
									int i_213_ = anIntArray10570[i_196_];
									int i_214_ = i_213_ >>> 24;
									int i_215_ = 256 - i_214_;
									int i_216_ = is_198_[i_197_];
									is_198_[i_197_] = ((i_213_ & 0xff00ff) * i_214_ + (i_216_ & 0xff00ff) * i_215_ & ~0xff00ff) + ((i_213_ & 0xff00) * i_214_ + (i_216_ & 0xff00) * i_215_ & 0xff0000) >> 8;
								} else if (i_199_ == 0) {
									int i_217_ = anIntArray10570[i_196_];
									int i_218_ = (i_217_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_219_ = 256 - i_218_;
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_220_ = is_198_[i_197_];
										is_198_[i_197_] = ((i_217_ & 0xff00ff) * i_218_ + (i_220_ & 0xff00ff) * i_219_ & ~0xff00ff) + ((i_217_ & 0xff00) * i_218_ + (i_220_ & 0xff00) * i_219_ & 0xff0000) >> 8;
									} else if (i_218_ != 255) {
										int i_221_ = (i_217_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_222_ = (i_217_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_223_ = (i_217_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_217_ = (i_221_ | i_222_ | i_223_) >>> 8;
										int i_224_ = is_198_[i_197_];
										is_198_[i_197_] = ((i_217_ & 0xff00ff) * i_218_ + (i_224_ & 0xff00ff) * i_219_ & ~0xff00ff) + ((i_217_ & 0xff00) * i_218_ + (i_224_ & 0xff00) * i_219_ & 0xff0000) >> 8;
									} else {
										int i_225_ = (i_217_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_226_ = (i_217_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_227_ = (i_217_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_198_[i_197_] = (i_225_ | i_226_ | i_227_) >>> 8;
									}
								} else if (i_199_ == 3) {
									int i_228_ = anIntArray10570[i_196_];
									int i_229_ = GLSprite_Sub2.anInt8904;
									int i_230_ = i_228_ + i_229_;
									int i_231_ = (i_228_ & 0xff00ff) + (i_229_ & 0xff00ff);
									int i_232_ = (i_231_ & 0x1000100) + (i_230_ - i_231_ & 0x10000);
									i_232_ = i_230_ - i_232_ | i_232_ - (i_232_ >>> 8);
									int i_233_ = (i_228_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_234_ = 256 - i_233_;
									if (i_233_ != 255) {
										i_228_ = i_232_;
										i_232_ = is_198_[i_197_];
										i_232_ = ((i_228_ & 0xff00ff) * i_233_ + (i_232_ & 0xff00ff) * i_234_ & ~0xff00ff) + ((i_228_ & 0xff00) * i_233_ + (i_232_ & 0xff00) * i_234_ & 0xff0000) >> 8;
									}
									is_198_[i_197_] = i_232_;
								} else if (i_199_ == 2) {
									int i_235_ = anIntArray10570[i_196_];
									int i_236_ = i_235_ >>> 24;
									int i_237_ = 256 - i_236_;
									int i_238_ = (i_235_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_239_ = (i_235_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_235_ = ((i_238_ | i_239_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_240_ = is_198_[i_197_];
									is_198_[i_197_] = ((i_235_ & 0xff00ff) * i_236_ + (i_240_ & 0xff00ff) * i_237_ & ~0xff00ff) + ((i_235_ & 0xff00) * i_236_ + (i_240_ & 0xff00) * i_237_ & 0xff0000) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_200_ == 2) {
								if (i_199_ == 1) {
									int i_241_ = anIntArray10570[i_196_];
									int i_242_ = is_198_[i_197_];
									int i_243_ = i_241_ + i_242_;
									int i_244_ = (i_241_ & 0xff00ff) + (i_242_ & 0xff00ff);
									i_242_ = (i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000);
									is_198_[i_197_] = i_243_ - i_242_ | i_242_ - (i_242_ >>> 8);
								} else if (i_199_ == 0) {
									int i_245_ = anIntArray10570[i_196_];
									int i_246_ = (i_245_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_247_ = (i_245_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_248_ = (i_245_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_245_ = (i_246_ | i_247_ | i_248_) >>> 8;
									int i_249_ = is_198_[i_197_];
									int i_250_ = i_245_ + i_249_;
									int i_251_ = (i_245_ & 0xff00ff) + (i_249_ & 0xff00ff);
									i_249_ = (i_251_ & 0x1000100) + (i_250_ - i_251_ & 0x10000);
									is_198_[i_197_] = i_250_ - i_249_ | i_249_ - (i_249_ >>> 8);
								} else if (i_199_ == 3) {
									int i_252_ = anIntArray10570[i_196_];
									int i_253_ = GLSprite_Sub2.anInt8904;
									int i_254_ = i_252_ + i_253_;
									int i_255_ = (i_252_ & 0xff00ff) + (i_253_ & 0xff00ff);
									int i_256_ = (i_255_ & 0x1000100) + (i_254_ - i_255_ & 0x10000);
									i_252_ = i_254_ - i_256_ | i_256_ - (i_256_ >>> 8);
									i_256_ = is_198_[i_197_];
									i_254_ = i_252_ + i_256_;
									i_255_ = (i_252_ & 0xff00ff) + (i_256_ & 0xff00ff);
									i_256_ = (i_255_ & 0x1000100) + (i_254_ - i_255_ & 0x10000);
									is_198_[i_197_] = i_254_ - i_256_ | i_256_ - (i_256_ >>> 8);
								} else if (i_199_ == 2) {
									int i_257_ = anIntArray10570[i_196_];
									int i_258_ = (i_257_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_259_ = (i_257_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_257_ = ((i_258_ | i_259_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_260_ = is_198_[i_197_];
									int i_261_ = i_257_ + i_260_;
									int i_262_ = (i_257_ & 0xff00ff) + (i_260_ & 0xff00ff);
									i_260_ = (i_262_ & 0x1000100) + (i_261_ - i_262_ & 0x10000);
									is_198_[i_197_] = i_261_ - i_260_ | i_260_ - (i_260_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_193_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_190_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_263_ = GLSprite_Sub2.anInt8888;
				while (i_263_ < 0) {
					int i_264_ = GLSprite_Sub2.anInt8882;
					int i_265_ = GLSprite_Sub2.anInt8901;
					int i_266_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_267_ = GLSprite_Sub2.anInt8894;
					if (i_265_ >= 0 && i_265_ - (anInt8893 << 12) < 0) {
						if (i_266_ < 0) {
							int i_268_ = (GLSprite_Sub2.anInt8900 - 1 - i_266_) / GLSprite_Sub2.anInt8900;
							i_267_ += i_268_;
							i_266_ += GLSprite_Sub2.anInt8900 * i_268_;
							i_264_ += i_268_;
						}
						int i_269_;
						if ((i_269_ = (1 + i_266_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_267_) {
							i_267_ = i_269_;
						}
						for (/**/; i_267_ < 0; i_267_++) {
							int i_270_ = (i_266_ >> 12) * anInt8893 + (i_265_ >> 12);
							int i_271_ = i_264_++;
							int[] is_272_ = is;
							int i_273_ = i;
							int i_274_ = i_117_;
							if (i_274_ == 0) {
								if (i_273_ == 1) {
									is_272_[i_271_] = anIntArray10570[i_270_];
								} else if (i_273_ == 0) {
									int i_275_ = anIntArray10570[i_270_++];
									int i_276_ = (i_275_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_277_ = (i_275_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_278_ = (i_275_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_272_[i_271_] = (i_276_ | i_277_ | i_278_) >>> 8;
								} else if (i_273_ == 3) {
									int i_279_ = anIntArray10570[i_270_++];
									int i_280_ = GLSprite_Sub2.anInt8904;
									int i_281_ = i_279_ + i_280_;
									int i_282_ = (i_279_ & 0xff00ff) + (i_280_ & 0xff00ff);
									int i_283_ = (i_282_ & 0x1000100) + (i_281_ - i_282_ & 0x10000);
									is_272_[i_271_] = i_281_ - i_283_ | i_283_ - (i_283_ >>> 8);
								} else if (i_273_ == 2) {
									int i_284_ = anIntArray10570[i_270_];
									int i_285_ = (i_284_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_286_ = (i_284_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_272_[i_271_] = ((i_285_ | i_286_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_274_ == 1) {
								if (i_273_ == 1) {
									int i_287_ = anIntArray10570[i_270_];
									int i_288_ = i_287_ >>> 24;
									int i_289_ = 256 - i_288_;
									int i_290_ = is_272_[i_271_];
									is_272_[i_271_] = ((i_287_ & 0xff00ff) * i_288_ + (i_290_ & 0xff00ff) * i_289_ & ~0xff00ff) + ((i_287_ & 0xff00) * i_288_ + (i_290_ & 0xff00) * i_289_ & 0xff0000) >> 8;
								} else if (i_273_ == 0) {
									int i_291_ = anIntArray10570[i_270_];
									int i_292_ = (i_291_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_293_ = 256 - i_292_;
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_294_ = is_272_[i_271_];
										is_272_[i_271_] = ((i_291_ & 0xff00ff) * i_292_ + (i_294_ & 0xff00ff) * i_293_ & ~0xff00ff) + ((i_291_ & 0xff00) * i_292_ + (i_294_ & 0xff00) * i_293_ & 0xff0000) >> 8;
									} else if (i_292_ != 255) {
										int i_295_ = (i_291_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_296_ = (i_291_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_297_ = (i_291_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_291_ = (i_295_ | i_296_ | i_297_) >>> 8;
										int i_298_ = is_272_[i_271_];
										is_272_[i_271_] = ((i_291_ & 0xff00ff) * i_292_ + (i_298_ & 0xff00ff) * i_293_ & ~0xff00ff) + ((i_291_ & 0xff00) * i_292_ + (i_298_ & 0xff00) * i_293_ & 0xff0000) >> 8;
									} else {
										int i_299_ = (i_291_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_300_ = (i_291_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_301_ = (i_291_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_272_[i_271_] = (i_299_ | i_300_ | i_301_) >>> 8;
									}
								} else if (i_273_ == 3) {
									int i_302_ = anIntArray10570[i_270_];
									int i_303_ = GLSprite_Sub2.anInt8904;
									int i_304_ = i_302_ + i_303_;
									int i_305_ = (i_302_ & 0xff00ff) + (i_303_ & 0xff00ff);
									int i_306_ = (i_305_ & 0x1000100) + (i_304_ - i_305_ & 0x10000);
									i_306_ = i_304_ - i_306_ | i_306_ - (i_306_ >>> 8);
									int i_307_ = (i_302_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_308_ = 256 - i_307_;
									if (i_307_ != 255) {
										i_302_ = i_306_;
										i_306_ = is_272_[i_271_];
										i_306_ = ((i_302_ & 0xff00ff) * i_307_ + (i_306_ & 0xff00ff) * i_308_ & ~0xff00ff) + ((i_302_ & 0xff00) * i_307_ + (i_306_ & 0xff00) * i_308_ & 0xff0000) >> 8;
									}
									is_272_[i_271_] = i_306_;
								} else if (i_273_ == 2) {
									int i_309_ = anIntArray10570[i_270_];
									int i_310_ = i_309_ >>> 24;
									int i_311_ = 256 - i_310_;
									int i_312_ = (i_309_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_313_ = (i_309_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_309_ = ((i_312_ | i_313_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_314_ = is_272_[i_271_];
									is_272_[i_271_] = ((i_309_ & 0xff00ff) * i_310_ + (i_314_ & 0xff00ff) * i_311_ & ~0xff00ff) + ((i_309_ & 0xff00) * i_310_ + (i_314_ & 0xff00) * i_311_ & 0xff0000) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_274_ == 2) {
								if (i_273_ == 1) {
									int i_315_ = anIntArray10570[i_270_];
									int i_316_ = is_272_[i_271_];
									int i_317_ = i_315_ + i_316_;
									int i_318_ = (i_315_ & 0xff00ff) + (i_316_ & 0xff00ff);
									i_316_ = (i_318_ & 0x1000100) + (i_317_ - i_318_ & 0x10000);
									is_272_[i_271_] = i_317_ - i_316_ | i_316_ - (i_316_ >>> 8);
								} else if (i_273_ == 0) {
									int i_319_ = anIntArray10570[i_270_];
									int i_320_ = (i_319_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_321_ = (i_319_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_322_ = (i_319_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_319_ = (i_320_ | i_321_ | i_322_) >>> 8;
									int i_323_ = is_272_[i_271_];
									int i_324_ = i_319_ + i_323_;
									int i_325_ = (i_319_ & 0xff00ff) + (i_323_ & 0xff00ff);
									i_323_ = (i_325_ & 0x1000100) + (i_324_ - i_325_ & 0x10000);
									is_272_[i_271_] = i_324_ - i_323_ | i_323_ - (i_323_ >>> 8);
								} else if (i_273_ == 3) {
									int i_326_ = anIntArray10570[i_270_];
									int i_327_ = GLSprite_Sub2.anInt8904;
									int i_328_ = i_326_ + i_327_;
									int i_329_ = (i_326_ & 0xff00ff) + (i_327_ & 0xff00ff);
									int i_330_ = (i_329_ & 0x1000100) + (i_328_ - i_329_ & 0x10000);
									i_326_ = i_328_ - i_330_ | i_330_ - (i_330_ >>> 8);
									i_330_ = is_272_[i_271_];
									i_328_ = i_326_ + i_330_;
									i_329_ = (i_326_ & 0xff00ff) + (i_330_ & 0xff00ff);
									i_330_ = (i_329_ & 0x1000100) + (i_328_ - i_329_ & 0x10000);
									is_272_[i_271_] = i_328_ - i_330_ | i_330_ - (i_330_ >>> 8);
								} else if (i_273_ == 2) {
									int i_331_ = anIntArray10570[i_270_];
									int i_332_ = (i_331_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_333_ = (i_331_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_331_ = ((i_332_ | i_333_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_334_ = is_272_[i_271_];
									int i_335_ = i_331_ + i_334_;
									int i_336_ = (i_331_ & 0xff00ff) + (i_334_ & 0xff00ff);
									i_334_ = (i_336_ & 0x1000100) + (i_335_ - i_336_ & 0x10000);
									is_272_[i_271_] = i_335_ - i_334_ | i_334_ - (i_334_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_266_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_263_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8913 < 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_337_ = GLSprite_Sub2.anInt8888;
				while (i_337_ < 0) {
					int i_338_ = GLSprite_Sub2.anInt8882;
					int i_339_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_340_ = GLSprite_Sub2.anInt8908;
					int i_341_ = GLSprite_Sub2.anInt8894;
					if (i_340_ >= 0 && i_340_ - (anInt8897 << 12) < 0) {
						int i_342_;
						if ((i_342_ = i_339_ - (anInt8893 << 12)) >= 0) {
							i_342_ = (GLSprite_Sub2.anInt8913 - i_342_) / GLSprite_Sub2.anInt8913;
							i_341_ += i_342_;
							i_339_ += GLSprite_Sub2.anInt8913 * i_342_;
							i_338_ += i_342_;
						}
						if ((i_342_ = (i_339_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_341_) {
							i_341_ = i_342_;
						}
						for (/**/; i_341_ < 0; i_341_++) {
							int i_343_ = (i_340_ >> 12) * anInt8893 + (i_339_ >> 12);
							int i_344_ = i_338_++;
							int[] is_345_ = is;
							int i_346_ = i;
							int i_347_ = i_117_;
							if (i_347_ == 0) {
								if (i_346_ == 1) {
									is_345_[i_344_] = anIntArray10570[i_343_];
								} else if (i_346_ == 0) {
									int i_348_ = anIntArray10570[i_343_++];
									int i_349_ = (i_348_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_350_ = (i_348_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_351_ = (i_348_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_345_[i_344_] = (i_349_ | i_350_ | i_351_) >>> 8;
								} else if (i_346_ == 3) {
									int i_352_ = anIntArray10570[i_343_++];
									int i_353_ = GLSprite_Sub2.anInt8904;
									int i_354_ = i_352_ + i_353_;
									int i_355_ = (i_352_ & 0xff00ff) + (i_353_ & 0xff00ff);
									int i_356_ = (i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000);
									is_345_[i_344_] = i_354_ - i_356_ | i_356_ - (i_356_ >>> 8);
								} else if (i_346_ == 2) {
									int i_357_ = anIntArray10570[i_343_];
									int i_358_ = (i_357_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_359_ = (i_357_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_345_[i_344_] = ((i_358_ | i_359_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_347_ == 1) {
								if (i_346_ == 1) {
									int i_360_ = anIntArray10570[i_343_];
									int i_361_ = i_360_ >>> 24;
									int i_362_ = 256 - i_361_;
									int i_363_ = is_345_[i_344_];
									is_345_[i_344_] = ((i_360_ & 0xff00ff) * i_361_ + (i_363_ & 0xff00ff) * i_362_ & ~0xff00ff) + ((i_360_ & 0xff00) * i_361_ + (i_363_ & 0xff00) * i_362_ & 0xff0000) >> 8;
								} else if (i_346_ == 0) {
									int i_364_ = anIntArray10570[i_343_];
									int i_365_ = (i_364_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_366_ = 256 - i_365_;
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_367_ = is_345_[i_344_];
										is_345_[i_344_] = ((i_364_ & 0xff00ff) * i_365_ + (i_367_ & 0xff00ff) * i_366_ & ~0xff00ff) + ((i_364_ & 0xff00) * i_365_ + (i_367_ & 0xff00) * i_366_ & 0xff0000) >> 8;
									} else if (i_365_ != 255) {
										int i_368_ = (i_364_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_369_ = (i_364_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_370_ = (i_364_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_364_ = (i_368_ | i_369_ | i_370_) >>> 8;
										int i_371_ = is_345_[i_344_];
										is_345_[i_344_] = ((i_364_ & 0xff00ff) * i_365_ + (i_371_ & 0xff00ff) * i_366_ & ~0xff00ff) + ((i_364_ & 0xff00) * i_365_ + (i_371_ & 0xff00) * i_366_ & 0xff0000) >> 8;
									} else {
										int i_372_ = (i_364_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_373_ = (i_364_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_374_ = (i_364_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_345_[i_344_] = (i_372_ | i_373_ | i_374_) >>> 8;
									}
								} else if (i_346_ == 3) {
									int i_375_ = anIntArray10570[i_343_];
									int i_376_ = GLSprite_Sub2.anInt8904;
									int i_377_ = i_375_ + i_376_;
									int i_378_ = (i_375_ & 0xff00ff) + (i_376_ & 0xff00ff);
									int i_379_ = (i_378_ & 0x1000100) + (i_377_ - i_378_ & 0x10000);
									i_379_ = i_377_ - i_379_ | i_379_ - (i_379_ >>> 8);
									int i_380_ = (i_375_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
									int i_381_ = 256 - i_380_;
									if (i_380_ != 255) {
										i_375_ = i_379_;
										i_379_ = is_345_[i_344_];
										i_379_ = ((i_375_ & 0xff00ff) * i_380_ + (i_379_ & 0xff00ff) * i_381_ & ~0xff00ff) + ((i_375_ & 0xff00) * i_380_ + (i_379_ & 0xff00) * i_381_ & 0xff0000) >> 8;
									}
									is_345_[i_344_] = i_379_;
								} else if (i_346_ == 2) {
									int i_382_ = anIntArray10570[i_343_];
									int i_383_ = i_382_ >>> 24;
									int i_384_ = 256 - i_383_;
									int i_385_ = (i_382_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_386_ = (i_382_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_382_ = ((i_385_ | i_386_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_387_ = is_345_[i_344_];
									is_345_[i_344_] = ((i_382_ & 0xff00ff) * i_383_ + (i_387_ & 0xff00ff) * i_384_ & ~0xff00ff) + ((i_382_ & 0xff00) * i_383_ + (i_387_ & 0xff00) * i_384_ & 0xff0000) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_347_ == 2) {
								if (i_346_ == 1) {
									int i_388_ = anIntArray10570[i_343_];
									int i_389_ = is_345_[i_344_];
									int i_390_ = i_388_ + i_389_;
									int i_391_ = (i_388_ & 0xff00ff) + (i_389_ & 0xff00ff);
									i_389_ = (i_391_ & 0x1000100) + (i_390_ - i_391_ & 0x10000);
									is_345_[i_344_] = i_390_ - i_389_ | i_389_ - (i_389_ >>> 8);
								} else if (i_346_ == 0) {
									int i_392_ = anIntArray10570[i_343_];
									int i_393_ = (i_392_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_394_ = (i_392_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_395_ = (i_392_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_392_ = (i_393_ | i_394_ | i_395_) >>> 8;
									int i_396_ = is_345_[i_344_];
									int i_397_ = i_392_ + i_396_;
									int i_398_ = (i_392_ & 0xff00ff) + (i_396_ & 0xff00ff);
									i_396_ = (i_398_ & 0x1000100) + (i_397_ - i_398_ & 0x10000);
									is_345_[i_344_] = i_397_ - i_396_ | i_396_ - (i_396_ >>> 8);
								} else if (i_346_ == 3) {
									int i_399_ = anIntArray10570[i_343_];
									int i_400_ = GLSprite_Sub2.anInt8904;
									int i_401_ = i_399_ + i_400_;
									int i_402_ = (i_399_ & 0xff00ff) + (i_400_ & 0xff00ff);
									int i_403_ = (i_402_ & 0x1000100) + (i_401_ - i_402_ & 0x10000);
									i_399_ = i_401_ - i_403_ | i_403_ - (i_403_ >>> 8);
									i_403_ = is_345_[i_344_];
									i_401_ = i_399_ + i_403_;
									i_402_ = (i_399_ & 0xff00ff) + (i_403_ & 0xff00ff);
									i_403_ = (i_402_ & 0x1000100) + (i_401_ - i_402_ & 0x10000);
									is_345_[i_344_] = i_401_ - i_403_ | i_403_ - (i_403_ >>> 8);
								} else if (i_346_ == 2) {
									int i_404_ = anIntArray10570[i_343_];
									int i_405_ = (i_404_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_406_ = (i_404_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_404_ = ((i_405_ | i_406_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_407_ = is_345_[i_344_];
									int i_408_ = i_404_ + i_407_;
									int i_409_ = (i_404_ & 0xff00ff) + (i_407_ & 0xff00ff);
									i_407_ = (i_409_ & 0x1000100) + (i_408_ - i_409_ & 0x10000);
									is_345_[i_344_] = i_408_ - i_407_ | i_407_ - (i_407_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_339_ += GLSprite_Sub2.anInt8913;
						}
					}
					i_337_++;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_410_ = GLSprite_Sub2.anInt8888;
				while (i_410_ < 0) {
					int i_411_ = GLSprite_Sub2.anInt8882;
					int i_412_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_413_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_414_ = GLSprite_Sub2.anInt8894;
					int i_415_;
					if ((i_415_ = i_412_ - (anInt8893 << 12)) >= 0) {
						i_415_ = (GLSprite_Sub2.anInt8913 - i_415_) / GLSprite_Sub2.anInt8913;
						i_414_ += i_415_;
						i_412_ += GLSprite_Sub2.anInt8913 * i_415_;
						i_413_ += GLSprite_Sub2.anInt8900 * i_415_;
						i_411_ += i_415_;
					}
					if ((i_415_ = (i_412_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_414_) {
						i_414_ = i_415_;
					}
					if ((i_415_ = i_413_ - (anInt8897 << 12)) >= 0) {
						i_415_ = (GLSprite_Sub2.anInt8900 - i_415_) / GLSprite_Sub2.anInt8900;
						i_414_ += i_415_;
						i_412_ += GLSprite_Sub2.anInt8913 * i_415_;
						i_413_ += GLSprite_Sub2.anInt8900 * i_415_;
						i_411_ += i_415_;
					}
					if ((i_415_ = (i_413_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_414_) {
						i_414_ = i_415_;
					}
					for (/**/; i_414_ < 0; i_414_++) {
						int i_416_ = (i_413_ >> 12) * anInt8893 + (i_412_ >> 12);
						int i_417_ = i_411_++;
						int[] is_418_ = is;
						int i_419_ = i;
						int i_420_ = i_117_;
						if (i_420_ == 0) {
							if (i_419_ == 1) {
								is_418_[i_417_] = anIntArray10570[i_416_];
							} else if (i_419_ == 0) {
								int i_421_ = anIntArray10570[i_416_++];
								int i_422_ = (i_421_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_423_ = (i_421_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_424_ = (i_421_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_418_[i_417_] = (i_422_ | i_423_ | i_424_) >>> 8;
							} else if (i_419_ == 3) {
								int i_425_ = anIntArray10570[i_416_++];
								int i_426_ = GLSprite_Sub2.anInt8904;
								int i_427_ = i_425_ + i_426_;
								int i_428_ = (i_425_ & 0xff00ff) + (i_426_ & 0xff00ff);
								int i_429_ = (i_428_ & 0x1000100) + (i_427_ - i_428_ & 0x10000);
								is_418_[i_417_] = i_427_ - i_429_ | i_429_ - (i_429_ >>> 8);
							} else if (i_419_ == 2) {
								int i_430_ = anIntArray10570[i_416_];
								int i_431_ = (i_430_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_432_ = (i_430_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_418_[i_417_] = ((i_431_ | i_432_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_420_ == 1) {
							if (i_419_ == 1) {
								int i_433_ = anIntArray10570[i_416_];
								int i_434_ = i_433_ >>> 24;
								int i_435_ = 256 - i_434_;
								int i_436_ = is_418_[i_417_];
								is_418_[i_417_] = ((i_433_ & 0xff00ff) * i_434_ + (i_436_ & 0xff00ff) * i_435_ & ~0xff00ff) + ((i_433_ & 0xff00) * i_434_ + (i_436_ & 0xff00) * i_435_ & 0xff0000) >> 8;
							} else if (i_419_ == 0) {
								int i_437_ = anIntArray10570[i_416_];
								int i_438_ = (i_437_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_439_ = 256 - i_438_;
								if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
									int i_440_ = is_418_[i_417_];
									is_418_[i_417_] = ((i_437_ & 0xff00ff) * i_438_ + (i_440_ & 0xff00ff) * i_439_ & ~0xff00ff) + ((i_437_ & 0xff00) * i_438_ + (i_440_ & 0xff00) * i_439_ & 0xff0000) >> 8;
								} else if (i_438_ != 255) {
									int i_441_ = (i_437_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_442_ = (i_437_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_443_ = (i_437_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_437_ = (i_441_ | i_442_ | i_443_) >>> 8;
									int i_444_ = is_418_[i_417_];
									is_418_[i_417_] = ((i_437_ & 0xff00ff) * i_438_ + (i_444_ & 0xff00ff) * i_439_ & ~0xff00ff) + ((i_437_ & 0xff00) * i_438_ + (i_444_ & 0xff00) * i_439_ & 0xff0000) >> 8;
								} else {
									int i_445_ = (i_437_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_446_ = (i_437_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_447_ = (i_437_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_418_[i_417_] = (i_445_ | i_446_ | i_447_) >>> 8;
								}
							} else if (i_419_ == 3) {
								int i_448_ = anIntArray10570[i_416_];
								int i_449_ = GLSprite_Sub2.anInt8904;
								int i_450_ = i_448_ + i_449_;
								int i_451_ = (i_448_ & 0xff00ff) + (i_449_ & 0xff00ff);
								int i_452_ = (i_451_ & 0x1000100) + (i_450_ - i_451_ & 0x10000);
								i_452_ = i_450_ - i_452_ | i_452_ - (i_452_ >>> 8);
								int i_453_ = (i_448_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_454_ = 256 - i_453_;
								if (i_453_ != 255) {
									i_448_ = i_452_;
									i_452_ = is_418_[i_417_];
									i_452_ = ((i_448_ & 0xff00ff) * i_453_ + (i_452_ & 0xff00ff) * i_454_ & ~0xff00ff) + ((i_448_ & 0xff00) * i_453_ + (i_452_ & 0xff00) * i_454_ & 0xff0000) >> 8;
								}
								is_418_[i_417_] = i_452_;
							} else if (i_419_ == 2) {
								int i_455_ = anIntArray10570[i_416_];
								int i_456_ = i_455_ >>> 24;
								int i_457_ = 256 - i_456_;
								int i_458_ = (i_455_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_459_ = (i_455_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_455_ = ((i_458_ | i_459_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_460_ = is_418_[i_417_];
								is_418_[i_417_] = ((i_455_ & 0xff00ff) * i_456_ + (i_460_ & 0xff00ff) * i_457_ & ~0xff00ff) + ((i_455_ & 0xff00) * i_456_ + (i_460_ & 0xff00) * i_457_ & 0xff0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_420_ == 2) {
							if (i_419_ == 1) {
								int i_461_ = anIntArray10570[i_416_];
								int i_462_ = is_418_[i_417_];
								int i_463_ = i_461_ + i_462_;
								int i_464_ = (i_461_ & 0xff00ff) + (i_462_ & 0xff00ff);
								i_462_ = (i_464_ & 0x1000100) + (i_463_ - i_464_ & 0x10000);
								is_418_[i_417_] = i_463_ - i_462_ | i_462_ - (i_462_ >>> 8);
							} else if (i_419_ == 0) {
								int i_465_ = anIntArray10570[i_416_];
								int i_466_ = (i_465_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_467_ = (i_465_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_468_ = (i_465_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_465_ = (i_466_ | i_467_ | i_468_) >>> 8;
								int i_469_ = is_418_[i_417_];
								int i_470_ = i_465_ + i_469_;
								int i_471_ = (i_465_ & 0xff00ff) + (i_469_ & 0xff00ff);
								i_469_ = (i_471_ & 0x1000100) + (i_470_ - i_471_ & 0x10000);
								is_418_[i_417_] = i_470_ - i_469_ | i_469_ - (i_469_ >>> 8);
							} else if (i_419_ == 3) {
								int i_472_ = anIntArray10570[i_416_];
								int i_473_ = GLSprite_Sub2.anInt8904;
								int i_474_ = i_472_ + i_473_;
								int i_475_ = (i_472_ & 0xff00ff) + (i_473_ & 0xff00ff);
								int i_476_ = (i_475_ & 0x1000100) + (i_474_ - i_475_ & 0x10000);
								i_472_ = i_474_ - i_476_ | i_476_ - (i_476_ >>> 8);
								i_476_ = is_418_[i_417_];
								i_474_ = i_472_ + i_476_;
								i_475_ = (i_472_ & 0xff00ff) + (i_476_ & 0xff00ff);
								i_476_ = (i_475_ & 0x1000100) + (i_474_ - i_475_ & 0x10000);
								is_418_[i_417_] = i_474_ - i_476_ | i_476_ - (i_476_ >>> 8);
							} else if (i_419_ == 2) {
								int i_477_ = anIntArray10570[i_416_];
								int i_478_ = (i_477_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_479_ = (i_477_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_477_ = ((i_478_ | i_479_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_480_ = is_418_[i_417_];
								int i_481_ = i_477_ + i_480_;
								int i_482_ = (i_477_ & 0xff00ff) + (i_480_ & 0xff00ff);
								i_480_ = (i_482_ & 0x1000100) + (i_481_ - i_482_ & 0x10000);
								is_418_[i_417_] = i_481_ - i_480_ | i_480_ - (i_480_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_412_ += GLSprite_Sub2.anInt8913;
						i_413_ += GLSprite_Sub2.anInt8900;
					}
					i_410_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_483_ = GLSprite_Sub2.anInt8888;
				while (i_483_ < 0) {
					int i_484_ = GLSprite_Sub2.anInt8882;
					int i_485_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_486_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_487_ = GLSprite_Sub2.anInt8894;
					int i_488_;
					if ((i_488_ = i_485_ - (anInt8893 << 12)) >= 0) {
						i_488_ = (GLSprite_Sub2.anInt8913 - i_488_) / GLSprite_Sub2.anInt8913;
						i_487_ += i_488_;
						i_485_ += GLSprite_Sub2.anInt8913 * i_488_;
						i_486_ += GLSprite_Sub2.anInt8900 * i_488_;
						i_484_ += i_488_;
					}
					if ((i_488_ = (i_485_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_487_) {
						i_487_ = i_488_;
					}
					if (i_486_ < 0) {
						i_488_ = (GLSprite_Sub2.anInt8900 - 1 - i_486_) / GLSprite_Sub2.anInt8900;
						i_487_ += i_488_;
						i_485_ += GLSprite_Sub2.anInt8913 * i_488_;
						i_486_ += GLSprite_Sub2.anInt8900 * i_488_;
						i_484_ += i_488_;
					}
					if ((i_488_ = (1 + i_486_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_487_) {
						i_487_ = i_488_;
					}
					for (/**/; i_487_ < 0; i_487_++) {
						int i_489_ = (i_486_ >> 12) * anInt8893 + (i_485_ >> 12);
						int i_490_ = i_484_++;
						int[] is_491_ = is;
						int i_492_ = i;
						int i_493_ = i_117_;
						if (i_493_ == 0) {
							if (i_492_ == 1) {
								is_491_[i_490_] = anIntArray10570[i_489_];
							} else if (i_492_ == 0) {
								int i_494_ = anIntArray10570[i_489_++];
								int i_495_ = (i_494_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_496_ = (i_494_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_497_ = (i_494_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_491_[i_490_] = (i_495_ | i_496_ | i_497_) >>> 8;
							} else if (i_492_ == 3) {
								int i_498_ = anIntArray10570[i_489_++];
								int i_499_ = GLSprite_Sub2.anInt8904;
								int i_500_ = i_498_ + i_499_;
								int i_501_ = (i_498_ & 0xff00ff) + (i_499_ & 0xff00ff);
								int i_502_ = (i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000);
								is_491_[i_490_] = i_500_ - i_502_ | i_502_ - (i_502_ >>> 8);
							} else if (i_492_ == 2) {
								int i_503_ = anIntArray10570[i_489_];
								int i_504_ = (i_503_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_505_ = (i_503_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_491_[i_490_] = ((i_504_ | i_505_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_493_ == 1) {
							if (i_492_ == 1) {
								int i_506_ = anIntArray10570[i_489_];
								int i_507_ = i_506_ >>> 24;
								int i_508_ = 256 - i_507_;
								int i_509_ = is_491_[i_490_];
								is_491_[i_490_] = ((i_506_ & 0xff00ff) * i_507_ + (i_509_ & 0xff00ff) * i_508_ & ~0xff00ff) + ((i_506_ & 0xff00) * i_507_ + (i_509_ & 0xff00) * i_508_ & 0xff0000) >> 8;
							} else if (i_492_ == 0) {
								int i_510_ = anIntArray10570[i_489_];
								int i_511_ = (i_510_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_512_ = 256 - i_511_;
								if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
									int i_513_ = is_491_[i_490_];
									is_491_[i_490_] = ((i_510_ & 0xff00ff) * i_511_ + (i_513_ & 0xff00ff) * i_512_ & ~0xff00ff) + ((i_510_ & 0xff00) * i_511_ + (i_513_ & 0xff00) * i_512_ & 0xff0000) >> 8;
								} else if (i_511_ != 255) {
									int i_514_ = (i_510_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_515_ = (i_510_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_516_ = (i_510_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_510_ = (i_514_ | i_515_ | i_516_) >>> 8;
									int i_517_ = is_491_[i_490_];
									is_491_[i_490_] = ((i_510_ & 0xff00ff) * i_511_ + (i_517_ & 0xff00ff) * i_512_ & ~0xff00ff) + ((i_510_ & 0xff00) * i_511_ + (i_517_ & 0xff00) * i_512_ & 0xff0000) >> 8;
								} else {
									int i_518_ = (i_510_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_519_ = (i_510_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_520_ = (i_510_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_491_[i_490_] = (i_518_ | i_519_ | i_520_) >>> 8;
								}
							} else if (i_492_ == 3) {
								int i_521_ = anIntArray10570[i_489_];
								int i_522_ = GLSprite_Sub2.anInt8904;
								int i_523_ = i_521_ + i_522_;
								int i_524_ = (i_521_ & 0xff00ff) + (i_522_ & 0xff00ff);
								int i_525_ = (i_524_ & 0x1000100) + (i_523_ - i_524_ & 0x10000);
								i_525_ = i_523_ - i_525_ | i_525_ - (i_525_ >>> 8);
								int i_526_ = (i_521_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_527_ = 256 - i_526_;
								if (i_526_ != 255) {
									i_521_ = i_525_;
									i_525_ = is_491_[i_490_];
									i_525_ = ((i_521_ & 0xff00ff) * i_526_ + (i_525_ & 0xff00ff) * i_527_ & ~0xff00ff) + ((i_521_ & 0xff00) * i_526_ + (i_525_ & 0xff00) * i_527_ & 0xff0000) >> 8;
								}
								is_491_[i_490_] = i_525_;
							} else if (i_492_ == 2) {
								int i_528_ = anIntArray10570[i_489_];
								int i_529_ = i_528_ >>> 24;
								int i_530_ = 256 - i_529_;
								int i_531_ = (i_528_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_532_ = (i_528_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_528_ = ((i_531_ | i_532_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_533_ = is_491_[i_490_];
								is_491_[i_490_] = ((i_528_ & 0xff00ff) * i_529_ + (i_533_ & 0xff00ff) * i_530_ & ~0xff00ff) + ((i_528_ & 0xff00) * i_529_ + (i_533_ & 0xff00) * i_530_ & 0xff0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_493_ == 2) {
							if (i_492_ == 1) {
								int i_534_ = anIntArray10570[i_489_];
								int i_535_ = is_491_[i_490_];
								int i_536_ = i_534_ + i_535_;
								int i_537_ = (i_534_ & 0xff00ff) + (i_535_ & 0xff00ff);
								i_535_ = (i_537_ & 0x1000100) + (i_536_ - i_537_ & 0x10000);
								is_491_[i_490_] = i_536_ - i_535_ | i_535_ - (i_535_ >>> 8);
							} else if (i_492_ == 0) {
								int i_538_ = anIntArray10570[i_489_];
								int i_539_ = (i_538_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_540_ = (i_538_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_541_ = (i_538_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_538_ = (i_539_ | i_540_ | i_541_) >>> 8;
								int i_542_ = is_491_[i_490_];
								int i_543_ = i_538_ + i_542_;
								int i_544_ = (i_538_ & 0xff00ff) + (i_542_ & 0xff00ff);
								i_542_ = (i_544_ & 0x1000100) + (i_543_ - i_544_ & 0x10000);
								is_491_[i_490_] = i_543_ - i_542_ | i_542_ - (i_542_ >>> 8);
							} else if (i_492_ == 3) {
								int i_545_ = anIntArray10570[i_489_];
								int i_546_ = GLSprite_Sub2.anInt8904;
								int i_547_ = i_545_ + i_546_;
								int i_548_ = (i_545_ & 0xff00ff) + (i_546_ & 0xff00ff);
								int i_549_ = (i_548_ & 0x1000100) + (i_547_ - i_548_ & 0x10000);
								i_545_ = i_547_ - i_549_ | i_549_ - (i_549_ >>> 8);
								i_549_ = is_491_[i_490_];
								i_547_ = i_545_ + i_549_;
								i_548_ = (i_545_ & 0xff00ff) + (i_549_ & 0xff00ff);
								i_549_ = (i_548_ & 0x1000100) + (i_547_ - i_548_ & 0x10000);
								is_491_[i_490_] = i_547_ - i_549_ | i_549_ - (i_549_ >>> 8);
							} else if (i_492_ == 2) {
								int i_550_ = anIntArray10570[i_489_];
								int i_551_ = (i_550_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_552_ = (i_550_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_550_ = ((i_551_ | i_552_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_553_ = is_491_[i_490_];
								int i_554_ = i_550_ + i_553_;
								int i_555_ = (i_550_ & 0xff00ff) + (i_553_ & 0xff00ff);
								i_553_ = (i_555_ & 0x1000100) + (i_554_ - i_555_ & 0x10000);
								is_491_[i_490_] = i_554_ - i_553_ | i_553_ - (i_553_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_485_ += GLSprite_Sub2.anInt8913;
						i_486_ += GLSprite_Sub2.anInt8900;
					}
					i_483_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8900 == 0) {
			int i_556_ = GLSprite_Sub2.anInt8888;
			while (i_556_ < 0) {
				int i_557_ = GLSprite_Sub2.anInt8882;
				int i_558_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_559_ = GLSprite_Sub2.anInt8908;
				int i_560_ = GLSprite_Sub2.anInt8894;
				if (i_559_ >= 0 && i_559_ - (anInt8897 << 12) < 0) {
					if (i_558_ < 0) {
						int i_561_ = (GLSprite_Sub2.anInt8913 - 1 - i_558_) / GLSprite_Sub2.anInt8913;
						i_560_ += i_561_;
						i_558_ += GLSprite_Sub2.anInt8913 * i_561_;
						i_557_ += i_561_;
					}
					int i_562_;
					if ((i_562_ = (1 + i_558_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_560_) {
						i_560_ = i_562_;
					}
					for (/**/; i_560_ < 0; i_560_++) {
						int i_563_ = (i_559_ >> 12) * anInt8893 + (i_558_ >> 12);
						int i_564_ = i_557_++;
						int[] is_565_ = is;
						int i_566_ = i;
						int i_567_ = i_117_;
						if (i_567_ == 0) {
							if (i_566_ == 1) {
								is_565_[i_564_] = anIntArray10570[i_563_];
							} else if (i_566_ == 0) {
								int i_568_ = anIntArray10570[i_563_++];
								int i_569_ = (i_568_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_570_ = (i_568_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_571_ = (i_568_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_565_[i_564_] = (i_569_ | i_570_ | i_571_) >>> 8;
							} else if (i_566_ == 3) {
								int i_572_ = anIntArray10570[i_563_++];
								int i_573_ = GLSprite_Sub2.anInt8904;
								int i_574_ = i_572_ + i_573_;
								int i_575_ = (i_572_ & 0xff00ff) + (i_573_ & 0xff00ff);
								int i_576_ = (i_575_ & 0x1000100) + (i_574_ - i_575_ & 0x10000);
								is_565_[i_564_] = i_574_ - i_576_ | i_576_ - (i_576_ >>> 8);
							} else if (i_566_ == 2) {
								int i_577_ = anIntArray10570[i_563_];
								int i_578_ = (i_577_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_579_ = (i_577_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_565_[i_564_] = ((i_578_ | i_579_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_567_ == 1) {
							if (i_566_ == 1) {
								int i_580_ = anIntArray10570[i_563_];
								int i_581_ = i_580_ >>> 24;
								int i_582_ = 256 - i_581_;
								int i_583_ = is_565_[i_564_];
								is_565_[i_564_] = ((i_580_ & 0xff00ff) * i_581_ + (i_583_ & 0xff00ff) * i_582_ & ~0xff00ff) + ((i_580_ & 0xff00) * i_581_ + (i_583_ & 0xff00) * i_582_ & 0xff0000) >> 8;
							} else if (i_566_ == 0) {
								int i_584_ = anIntArray10570[i_563_];
								int i_585_ = (i_584_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_586_ = 256 - i_585_;
								if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
									int i_587_ = is_565_[i_564_];
									is_565_[i_564_] = ((i_584_ & 0xff00ff) * i_585_ + (i_587_ & 0xff00ff) * i_586_ & ~0xff00ff) + ((i_584_ & 0xff00) * i_585_ + (i_587_ & 0xff00) * i_586_ & 0xff0000) >> 8;
								} else if (i_585_ != 255) {
									int i_588_ = (i_584_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_589_ = (i_584_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_590_ = (i_584_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_584_ = (i_588_ | i_589_ | i_590_) >>> 8;
									int i_591_ = is_565_[i_564_];
									is_565_[i_564_] = ((i_584_ & 0xff00ff) * i_585_ + (i_591_ & 0xff00ff) * i_586_ & ~0xff00ff) + ((i_584_ & 0xff00) * i_585_ + (i_591_ & 0xff00) * i_586_ & 0xff0000) >> 8;
								} else {
									int i_592_ = (i_584_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_593_ = (i_584_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_594_ = (i_584_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_565_[i_564_] = (i_592_ | i_593_ | i_594_) >>> 8;
								}
							} else if (i_566_ == 3) {
								int i_595_ = anIntArray10570[i_563_];
								int i_596_ = GLSprite_Sub2.anInt8904;
								int i_597_ = i_595_ + i_596_;
								int i_598_ = (i_595_ & 0xff00ff) + (i_596_ & 0xff00ff);
								int i_599_ = (i_598_ & 0x1000100) + (i_597_ - i_598_ & 0x10000);
								i_599_ = i_597_ - i_599_ | i_599_ - (i_599_ >>> 8);
								int i_600_ = (i_595_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
								int i_601_ = 256 - i_600_;
								if (i_600_ != 255) {
									i_595_ = i_599_;
									i_599_ = is_565_[i_564_];
									i_599_ = ((i_595_ & 0xff00ff) * i_600_ + (i_599_ & 0xff00ff) * i_601_ & ~0xff00ff) + ((i_595_ & 0xff00) * i_600_ + (i_599_ & 0xff00) * i_601_ & 0xff0000) >> 8;
								}
								is_565_[i_564_] = i_599_;
							} else if (i_566_ == 2) {
								int i_602_ = anIntArray10570[i_563_];
								int i_603_ = i_602_ >>> 24;
								int i_604_ = 256 - i_603_;
								int i_605_ = (i_602_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_606_ = (i_602_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_602_ = ((i_605_ | i_606_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_607_ = is_565_[i_564_];
								is_565_[i_564_] = ((i_602_ & 0xff00ff) * i_603_ + (i_607_ & 0xff00ff) * i_604_ & ~0xff00ff) + ((i_602_ & 0xff00) * i_603_ + (i_607_ & 0xff00) * i_604_ & 0xff0000) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_567_ == 2) {
							if (i_566_ == 1) {
								int i_608_ = anIntArray10570[i_563_];
								int i_609_ = is_565_[i_564_];
								int i_610_ = i_608_ + i_609_;
								int i_611_ = (i_608_ & 0xff00ff) + (i_609_ & 0xff00ff);
								i_609_ = (i_611_ & 0x1000100) + (i_610_ - i_611_ & 0x10000);
								is_565_[i_564_] = i_610_ - i_609_ | i_609_ - (i_609_ >>> 8);
							} else if (i_566_ == 0) {
								int i_612_ = anIntArray10570[i_563_];
								int i_613_ = (i_612_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_614_ = (i_612_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_615_ = (i_612_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_612_ = (i_613_ | i_614_ | i_615_) >>> 8;
								int i_616_ = is_565_[i_564_];
								int i_617_ = i_612_ + i_616_;
								int i_618_ = (i_612_ & 0xff00ff) + (i_616_ & 0xff00ff);
								i_616_ = (i_618_ & 0x1000100) + (i_617_ - i_618_ & 0x10000);
								is_565_[i_564_] = i_617_ - i_616_ | i_616_ - (i_616_ >>> 8);
							} else if (i_566_ == 3) {
								int i_619_ = anIntArray10570[i_563_];
								int i_620_ = GLSprite_Sub2.anInt8904;
								int i_621_ = i_619_ + i_620_;
								int i_622_ = (i_619_ & 0xff00ff) + (i_620_ & 0xff00ff);
								int i_623_ = (i_622_ & 0x1000100) + (i_621_ - i_622_ & 0x10000);
								i_619_ = i_621_ - i_623_ | i_623_ - (i_623_ >>> 8);
								i_623_ = is_565_[i_564_];
								i_621_ = i_619_ + i_623_;
								i_622_ = (i_619_ & 0xff00ff) + (i_623_ & 0xff00ff);
								i_623_ = (i_622_ & 0x1000100) + (i_621_ - i_622_ & 0x10000);
								is_565_[i_564_] = i_621_ - i_623_ | i_623_ - (i_623_ >>> 8);
							} else if (i_566_ == 2) {
								int i_624_ = anIntArray10570[i_563_];
								int i_625_ = (i_624_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_626_ = (i_624_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_624_ = ((i_625_ | i_626_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_627_ = is_565_[i_564_];
								int i_628_ = i_624_ + i_627_;
								int i_629_ = (i_624_ & 0xff00ff) + (i_627_ & 0xff00ff);
								i_627_ = (i_629_ & 0x1000100) + (i_628_ - i_629_ & 0x10000);
								is_565_[i_564_] = i_628_ - i_627_ | i_627_ - (i_627_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_558_ += GLSprite_Sub2.anInt8913;
					}
				}
				i_556_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else if (GLSprite_Sub2.anInt8900 < 0) {
			for (int i_630_ = GLSprite_Sub2.anInt8888; i_630_ < 0; i_630_++) {
				int i_631_ = GLSprite_Sub2.anInt8882;
				int i_632_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_633_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
				int i_634_ = GLSprite_Sub2.anInt8894;
				if (i_632_ < 0) {
					int i_635_ = (GLSprite_Sub2.anInt8913 - 1 - i_632_) / GLSprite_Sub2.anInt8913;
					i_634_ += i_635_;
					i_632_ += GLSprite_Sub2.anInt8913 * i_635_;
					i_633_ += GLSprite_Sub2.anInt8900 * i_635_;
					i_631_ += i_635_;
				}
				int i_636_;
				if ((i_636_ = (1 + i_632_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_634_) {
					i_634_ = i_636_;
				}
				if ((i_636_ = i_633_ - (anInt8897 << 12)) >= 0) {
					i_636_ = (GLSprite_Sub2.anInt8900 - i_636_) / GLSprite_Sub2.anInt8900;
					i_634_ += i_636_;
					i_632_ += GLSprite_Sub2.anInt8913 * i_636_;
					i_633_ += GLSprite_Sub2.anInt8900 * i_636_;
					i_631_ += i_636_;
				}
				if ((i_636_ = (i_633_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_634_) {
					i_634_ = i_636_;
				}
				for (/**/; i_634_ < 0; i_634_++) {
					int i_637_ = (i_633_ >> 12) * anInt8893 + (i_632_ >> 12);
					int i_638_ = i_631_++;
					int[] is_639_ = is;
					int i_640_ = i;
					int i_641_ = i_117_;
					if (i_641_ == 0) {
						if (i_640_ == 1) {
							is_639_[i_638_] = anIntArray10570[i_637_];
						} else if (i_640_ == 0) {
							int i_642_ = anIntArray10570[i_637_++];
							int i_643_ = (i_642_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_644_ = (i_642_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_645_ = (i_642_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							is_639_[i_638_] = (i_643_ | i_644_ | i_645_) >>> 8;
						} else if (i_640_ == 3) {
							int i_646_ = anIntArray10570[i_637_++];
							int i_647_ = GLSprite_Sub2.anInt8904;
							int i_648_ = i_646_ + i_647_;
							int i_649_ = (i_646_ & 0xff00ff) + (i_647_ & 0xff00ff);
							int i_650_ = (i_649_ & 0x1000100) + (i_648_ - i_649_ & 0x10000);
							is_639_[i_638_] = i_648_ - i_650_ | i_650_ - (i_650_ >>> 8);
						} else if (i_640_ == 2) {
							int i_651_ = anIntArray10570[i_637_];
							int i_652_ = (i_651_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_653_ = (i_651_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							is_639_[i_638_] = ((i_652_ | i_653_) >>> 8) + GLSprite_Sub2.anInt8896;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_641_ == 1) {
						if (i_640_ == 1) {
							int i_654_ = anIntArray10570[i_637_];
							int i_655_ = i_654_ >>> 24;
							int i_656_ = 256 - i_655_;
							int i_657_ = is_639_[i_638_];
							is_639_[i_638_] = ((i_654_ & 0xff00ff) * i_655_ + (i_657_ & 0xff00ff) * i_656_ & ~0xff00ff) + ((i_654_ & 0xff00) * i_655_ + (i_657_ & 0xff00) * i_656_ & 0xff0000) >> 8;
						} else if (i_640_ == 0) {
							int i_658_ = anIntArray10570[i_637_];
							int i_659_ = (i_658_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
							int i_660_ = 256 - i_659_;
							if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
								int i_661_ = is_639_[i_638_];
								is_639_[i_638_] = ((i_658_ & 0xff00ff) * i_659_ + (i_661_ & 0xff00ff) * i_660_ & ~0xff00ff) + ((i_658_ & 0xff00) * i_659_ + (i_661_ & 0xff00) * i_660_ & 0xff0000) >> 8;
							} else if (i_659_ != 255) {
								int i_662_ = (i_658_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_663_ = (i_658_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_664_ = (i_658_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_658_ = (i_662_ | i_663_ | i_664_) >>> 8;
								int i_665_ = is_639_[i_638_];
								is_639_[i_638_] = ((i_658_ & 0xff00ff) * i_659_ + (i_665_ & 0xff00ff) * i_660_ & ~0xff00ff) + ((i_658_ & 0xff00) * i_659_ + (i_665_ & 0xff00) * i_660_ & 0xff0000) >> 8;
							} else {
								int i_666_ = (i_658_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_667_ = (i_658_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_668_ = (i_658_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_639_[i_638_] = (i_666_ | i_667_ | i_668_) >>> 8;
							}
						} else if (i_640_ == 3) {
							int i_669_ = anIntArray10570[i_637_];
							int i_670_ = GLSprite_Sub2.anInt8904;
							int i_671_ = i_669_ + i_670_;
							int i_672_ = (i_669_ & 0xff00ff) + (i_670_ & 0xff00ff);
							int i_673_ = (i_672_ & 0x1000100) + (i_671_ - i_672_ & 0x10000);
							i_673_ = i_671_ - i_673_ | i_673_ - (i_673_ >>> 8);
							int i_674_ = (i_669_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
							int i_675_ = 256 - i_674_;
							if (i_674_ != 255) {
								i_669_ = i_673_;
								i_673_ = is_639_[i_638_];
								i_673_ = ((i_669_ & 0xff00ff) * i_674_ + (i_673_ & 0xff00ff) * i_675_ & ~0xff00ff) + ((i_669_ & 0xff00) * i_674_ + (i_673_ & 0xff00) * i_675_ & 0xff0000) >> 8;
							}
							is_639_[i_638_] = i_673_;
						} else if (i_640_ == 2) {
							int i_676_ = anIntArray10570[i_637_];
							int i_677_ = i_676_ >>> 24;
							int i_678_ = 256 - i_677_;
							int i_679_ = (i_676_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_680_ = (i_676_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							i_676_ = ((i_679_ | i_680_) >>> 8) + GLSprite_Sub2.anInt8896;
							int i_681_ = is_639_[i_638_];
							is_639_[i_638_] = ((i_676_ & 0xff00ff) * i_677_ + (i_681_ & 0xff00ff) * i_678_ & ~0xff00ff) + ((i_676_ & 0xff00) * i_677_ + (i_681_ & 0xff00) * i_678_ & 0xff0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_641_ == 2) {
						if (i_640_ == 1) {
							int i_682_ = anIntArray10570[i_637_];
							int i_683_ = is_639_[i_638_];
							int i_684_ = i_682_ + i_683_;
							int i_685_ = (i_682_ & 0xff00ff) + (i_683_ & 0xff00ff);
							i_683_ = (i_685_ & 0x1000100) + (i_684_ - i_685_ & 0x10000);
							is_639_[i_638_] = i_684_ - i_683_ | i_683_ - (i_683_ >>> 8);
						} else if (i_640_ == 0) {
							int i_686_ = anIntArray10570[i_637_];
							int i_687_ = (i_686_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_688_ = (i_686_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_689_ = (i_686_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							i_686_ = (i_687_ | i_688_ | i_689_) >>> 8;
							int i_690_ = is_639_[i_638_];
							int i_691_ = i_686_ + i_690_;
							int i_692_ = (i_686_ & 0xff00ff) + (i_690_ & 0xff00ff);
							i_690_ = (i_692_ & 0x1000100) + (i_691_ - i_692_ & 0x10000);
							is_639_[i_638_] = i_691_ - i_690_ | i_690_ - (i_690_ >>> 8);
						} else if (i_640_ == 3) {
							int i_693_ = anIntArray10570[i_637_];
							int i_694_ = GLSprite_Sub2.anInt8904;
							int i_695_ = i_693_ + i_694_;
							int i_696_ = (i_693_ & 0xff00ff) + (i_694_ & 0xff00ff);
							int i_697_ = (i_696_ & 0x1000100) + (i_695_ - i_696_ & 0x10000);
							i_693_ = i_695_ - i_697_ | i_697_ - (i_697_ >>> 8);
							i_697_ = is_639_[i_638_];
							i_695_ = i_693_ + i_697_;
							i_696_ = (i_693_ & 0xff00ff) + (i_697_ & 0xff00ff);
							i_697_ = (i_696_ & 0x1000100) + (i_695_ - i_696_ & 0x10000);
							is_639_[i_638_] = i_695_ - i_697_ | i_697_ - (i_697_ >>> 8);
						} else if (i_640_ == 2) {
							int i_698_ = anIntArray10570[i_637_];
							int i_699_ = (i_698_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_700_ = (i_698_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							i_698_ = ((i_699_ | i_700_) >>> 8) + GLSprite_Sub2.anInt8896;
							int i_701_ = is_639_[i_638_];
							int i_702_ = i_698_ + i_701_;
							int i_703_ = (i_698_ & 0xff00ff) + (i_701_ & 0xff00ff);
							i_701_ = (i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000);
							is_639_[i_638_] = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_632_ += GLSprite_Sub2.anInt8913;
					i_633_ += GLSprite_Sub2.anInt8900;
				}
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else {
			for (int i_704_ = GLSprite_Sub2.anInt8888; i_704_ < 0; i_704_++) {
				int i_705_ = GLSprite_Sub2.anInt8882;
				int i_706_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_707_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
				int i_708_ = GLSprite_Sub2.anInt8894;
				if (i_706_ < 0) {
					int i_709_ = (GLSprite_Sub2.anInt8913 - 1 - i_706_) / GLSprite_Sub2.anInt8913;
					i_708_ += i_709_;
					i_706_ += GLSprite_Sub2.anInt8913 * i_709_;
					i_707_ += GLSprite_Sub2.anInt8900 * i_709_;
					i_705_ += i_709_;
				}
				int i_710_;
				if ((i_710_ = (1 + i_706_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_708_) {
					i_708_ = i_710_;
				}
				if (i_707_ < 0) {
					i_710_ = (GLSprite_Sub2.anInt8900 - 1 - i_707_) / GLSprite_Sub2.anInt8900;
					i_708_ += i_710_;
					i_706_ += GLSprite_Sub2.anInt8913 * i_710_;
					i_707_ += GLSprite_Sub2.anInt8900 * i_710_;
					i_705_ += i_710_;
				}
				if ((i_710_ = (1 + i_707_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_708_) {
					i_708_ = i_710_;
				}
				for (/**/; i_708_ < 0; i_708_++) {
					int i_711_ = (i_707_ >> 12) * anInt8893 + (i_706_ >> 12);
					int i_712_ = i_705_++;
					int[] is_713_ = is;
					int i_714_ = i;
					int i_715_ = i_117_;
					if (i_715_ == 0) {
						if (i_714_ == 1) {
							is_713_[i_712_] = anIntArray10570[i_711_];
						} else if (i_714_ == 0) {
							int i_716_ = anIntArray10570[i_711_++];
							int i_717_ = (i_716_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_718_ = (i_716_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_719_ = (i_716_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							is_713_[i_712_] = (i_717_ | i_718_ | i_719_) >>> 8;
						} else if (i_714_ == 3) {
							int i_720_ = anIntArray10570[i_711_++];
							int i_721_ = GLSprite_Sub2.anInt8904;
							int i_722_ = i_720_ + i_721_;
							int i_723_ = (i_720_ & 0xff00ff) + (i_721_ & 0xff00ff);
							int i_724_ = (i_723_ & 0x1000100) + (i_722_ - i_723_ & 0x10000);
							is_713_[i_712_] = i_722_ - i_724_ | i_724_ - (i_724_ >>> 8);
						} else if (i_714_ == 2) {
							int i_725_ = anIntArray10570[i_711_];
							int i_726_ = (i_725_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_727_ = (i_725_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							is_713_[i_712_] = ((i_726_ | i_727_) >>> 8) + GLSprite_Sub2.anInt8896;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_715_ == 1) {
						if (i_714_ == 1) {
							int i_728_ = anIntArray10570[i_711_];
							int i_729_ = i_728_ >>> 24;
							int i_730_ = 256 - i_729_;
							int i_731_ = is_713_[i_712_];
							is_713_[i_712_] = ((i_728_ & 0xff00ff) * i_729_ + (i_731_ & 0xff00ff) * i_730_ & ~0xff00ff) + ((i_728_ & 0xff00) * i_729_ + (i_731_ & 0xff00) * i_730_ & 0xff0000) >> 8;
						} else if (i_714_ == 0) {
							int i_732_ = anIntArray10570[i_711_];
							int i_733_ = (i_732_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
							int i_734_ = 256 - i_733_;
							if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
								int i_735_ = is_713_[i_712_];
								is_713_[i_712_] = ((i_732_ & 0xff00ff) * i_733_ + (i_735_ & 0xff00ff) * i_734_ & ~0xff00ff) + ((i_732_ & 0xff00) * i_733_ + (i_735_ & 0xff00) * i_734_ & 0xff0000) >> 8;
							} else if (i_733_ != 255) {
								int i_736_ = (i_732_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_737_ = (i_732_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_738_ = (i_732_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_732_ = (i_736_ | i_737_ | i_738_) >>> 8;
								int i_739_ = is_713_[i_712_];
								is_713_[i_712_] = ((i_732_ & 0xff00ff) * i_733_ + (i_739_ & 0xff00ff) * i_734_ & ~0xff00ff) + ((i_732_ & 0xff00) * i_733_ + (i_739_ & 0xff00) * i_734_ & 0xff0000) >> 8;
							} else {
								int i_740_ = (i_732_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_741_ = (i_732_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_742_ = (i_732_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_713_[i_712_] = (i_740_ | i_741_ | i_742_) >>> 8;
							}
						} else if (i_714_ == 3) {
							int i_743_ = anIntArray10570[i_711_];
							int i_744_ = GLSprite_Sub2.anInt8904;
							int i_745_ = i_743_ + i_744_;
							int i_746_ = (i_743_ & 0xff00ff) + (i_744_ & 0xff00ff);
							int i_747_ = (i_746_ & 0x1000100) + (i_745_ - i_746_ & 0x10000);
							i_747_ = i_745_ - i_747_ | i_747_ - (i_747_ >>> 8);
							int i_748_ = (i_743_ >>> 24) * GLSprite_Sub2.anInt8895 >> 8;
							int i_749_ = 256 - i_748_;
							if (i_748_ != 255) {
								i_743_ = i_747_;
								i_747_ = is_713_[i_712_];
								i_747_ = ((i_743_ & 0xff00ff) * i_748_ + (i_747_ & 0xff00ff) * i_749_ & ~0xff00ff) + ((i_743_ & 0xff00) * i_748_ + (i_747_ & 0xff00) * i_749_ & 0xff0000) >> 8;
							}
							is_713_[i_712_] = i_747_;
						} else if (i_714_ == 2) {
							int i_750_ = anIntArray10570[i_711_];
							int i_751_ = i_750_ >>> 24;
							int i_752_ = 256 - i_751_;
							int i_753_ = (i_750_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_754_ = (i_750_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							i_750_ = ((i_753_ | i_754_) >>> 8) + GLSprite_Sub2.anInt8896;
							int i_755_ = is_713_[i_712_];
							is_713_[i_712_] = ((i_750_ & 0xff00ff) * i_751_ + (i_755_ & 0xff00ff) * i_752_ & ~0xff00ff) + ((i_750_ & 0xff00) * i_751_ + (i_755_ & 0xff00) * i_752_ & 0xff0000) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_715_ == 2) {
						if (i_714_ == 1) {
							int i_756_ = anIntArray10570[i_711_];
							int i_757_ = is_713_[i_712_];
							int i_758_ = i_756_ + i_757_;
							int i_759_ = (i_756_ & 0xff00ff) + (i_757_ & 0xff00ff);
							i_757_ = (i_759_ & 0x1000100) + (i_758_ - i_759_ & 0x10000);
							is_713_[i_712_] = i_758_ - i_757_ | i_757_ - (i_757_ >>> 8);
						} else if (i_714_ == 0) {
							int i_760_ = anIntArray10570[i_711_];
							int i_761_ = (i_760_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_762_ = (i_760_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_763_ = (i_760_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							i_760_ = (i_761_ | i_762_ | i_763_) >>> 8;
							int i_764_ = is_713_[i_712_];
							int i_765_ = i_760_ + i_764_;
							int i_766_ = (i_760_ & 0xff00ff) + (i_764_ & 0xff00ff);
							i_764_ = (i_766_ & 0x1000100) + (i_765_ - i_766_ & 0x10000);
							is_713_[i_712_] = i_765_ - i_764_ | i_764_ - (i_764_ >>> 8);
						} else if (i_714_ == 3) {
							int i_767_ = anIntArray10570[i_711_];
							int i_768_ = GLSprite_Sub2.anInt8904;
							int i_769_ = i_767_ + i_768_;
							int i_770_ = (i_767_ & 0xff00ff) + (i_768_ & 0xff00ff);
							int i_771_ = (i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000);
							i_767_ = i_769_ - i_771_ | i_771_ - (i_771_ >>> 8);
							i_771_ = is_713_[i_712_];
							i_769_ = i_767_ + i_771_;
							i_770_ = (i_767_ & 0xff00ff) + (i_771_ & 0xff00ff);
							i_771_ = (i_770_ & 0x1000100) + (i_769_ - i_770_ & 0x10000);
							is_713_[i_712_] = i_769_ - i_771_ | i_771_ - (i_771_ >>> 8);
						} else if (i_714_ == 2) {
							int i_772_ = anIntArray10570[i_711_];
							int i_773_ = (i_772_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_774_ = (i_772_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							i_772_ = ((i_773_ | i_774_) >>> 8) + GLSprite_Sub2.anInt8896;
							int i_775_ = is_713_[i_712_];
							int i_776_ = i_772_ + i_775_;
							int i_777_ = (i_772_ & 0xff00ff) + (i_775_ & 0xff00ff);
							i_775_ = (i_777_ & 0x1000100) + (i_776_ - i_777_ & 0x10000);
							is_713_[i_712_] = i_776_ - i_775_ | i_775_ - (i_775_ >>> 8);
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_706_ += GLSprite_Sub2.anInt8913;
					i_707_ += GLSprite_Sub2.anInt8900;
				}
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		}
	}
	
	final void method1207(int i, int i_778_, int i_779_, int i_780_, int i_781_, int i_782_, int i_783_, int i_784_, int i_785_) {
		if (i_780_ > 0 && i_781_ > 0) {
			int i_786_ = 0;
			int i_787_ = 0;
			int i_788_ = anInt8889 + anInt8893 + anInt8885;
			int i_789_ = anInt8899 + anInt8897 + anInt8884;
			int i_790_ = (i_788_ << 16) / i_780_;
			int i_791_ = (i_789_ << 16) / i_781_;
			if (anInt8889 > 0) {
				int i_792_ = ((anInt8889 << 16) + i_790_ - 1) / i_790_;
				i += i_792_;
				i_786_ += i_792_ * i_790_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_793_ = ((anInt8899 << 16) + i_791_ - 1) / i_791_;
				i_778_ += i_793_;
				i_787_ += i_793_ * i_791_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_788_) {
				i_780_ = ((anInt8893 << 16) - i_786_ + i_790_ - 1) / i_790_;
			}
			if (anInt8897 < i_789_) {
				i_781_ = ((anInt8897 << 16) - i_787_ + i_791_ - 1) / i_791_;
			}
			int i_794_ = i + i_778_ * aPureJavaToolkit8886.anInt6789;
			int i_795_ = aPureJavaToolkit8886.anInt6789 - i_780_;
			if (i_778_ + i_781_ > aPureJavaToolkit8886.anInt6772) {
				i_781_ -= i_778_ + i_781_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_778_ < aPureJavaToolkit8886.anInt6760) {
				int i_796_ = aPureJavaToolkit8886.anInt6760 - i_778_;
				i_781_ -= i_796_;
				i_794_ += i_796_ * aPureJavaToolkit8886.anInt6789;
				i_787_ += i_791_ * i_796_;
			}
			if (i + i_780_ > aPureJavaToolkit8886.anInt6778) {
				int i_797_ = i + i_780_ - aPureJavaToolkit8886.anInt6778;
				i_780_ -= i_797_;
				i_795_ += i_797_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_798_ = aPureJavaToolkit8886.anInt6767 - i;
				i_780_ -= i_798_;
				i_794_ += i_798_;
				i_786_ += i_790_ * i_798_;
				i_795_ += i_798_;
			}
			float[] fs = aPureJavaToolkit8886.aFloatArray6782;
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_784_ == 0) {
				if (i_782_ == 1) {
					int i_799_ = i_786_;
					for (int i_800_ = -i_781_; i_800_ < 0; i_800_++) {
						int i_801_ = (i_787_ >> 16) * anInt8893;
						for (int i_802_ = -i_780_; i_802_ < 0; i_802_++) {
							if ((float) i_779_ < fs[i_794_]) {
								is[i_794_] = anIntArray10570[(i_786_ >> 16) + i_801_];
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_799_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 0) {
					int i_803_ = (i_783_ & 0xff0000) >> 16;
					int i_804_ = (i_783_ & 0xff00) >> 8;
					int i_805_ = i_783_ & 0xff;
					int i_806_ = i_786_;
					for (int i_807_ = -i_781_; i_807_ < 0; i_807_++) {
						int i_808_ = (i_787_ >> 16) * anInt8893;
						for (int i_809_ = -i_780_; i_809_ < 0; i_809_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_810_ = anIntArray10570[(i_786_ >> 16) + i_808_];
								int i_811_ = (i_810_ & 0xff0000) * i_803_ & ~0xffffff;
								int i_812_ = (i_810_ & 0xff00) * i_804_ & 0xff0000;
								int i_813_ = (i_810_ & 0xff) * i_805_ & 0xff00;
								is[i_794_] = (i_811_ | i_812_ | i_813_) >>> 8;
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_806_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 3) {
					int i_814_ = i_786_;
					for (int i_815_ = -i_781_; i_815_ < 0; i_815_++) {
						int i_816_ = (i_787_ >> 16) * anInt8893;
						for (int i_817_ = -i_780_; i_817_ < 0; i_817_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_818_ = anIntArray10570[(i_786_ >> 16) + i_816_];
								int i_819_ = i_818_ + i_783_;
								int i_820_ = (i_818_ & 0xff00ff) + (i_783_ & 0xff00ff);
								int i_821_ = (i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000);
								is[i_794_] = i_819_ - i_821_ | i_821_ - (i_821_ >>> 8);
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_814_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 2) {
					int i_822_ = i_783_ >>> 24;
					int i_823_ = 256 - i_822_;
					int i_824_ = (i_783_ & 0xff00ff) * i_823_ & ~0xff00ff;
					int i_825_ = (i_783_ & 0xff00) * i_823_ & 0xff0000;
					i_783_ = (i_824_ | i_825_) >>> 8;
					int i_826_ = i_786_;
					for (int i_827_ = -i_781_; i_827_ < 0; i_827_++) {
						int i_828_ = (i_787_ >> 16) * anInt8893;
						for (int i_829_ = -i_780_; i_829_ < 0; i_829_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_830_ = anIntArray10570[(i_786_ >> 16) + i_828_];
								i_824_ = (i_830_ & 0xff00ff) * i_822_ & ~0xff00ff;
								i_825_ = (i_830_ & 0xff00) * i_822_ & 0xff0000;
								is[i_794_] = ((i_824_ | i_825_) >>> 8) + i_783_;
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_826_;
						i_794_ += i_795_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_784_ == 1) {
				if (i_782_ == 1) {
					int i_831_ = i_786_;
					for (int i_832_ = -i_781_; i_832_ < 0; i_832_++) {
						int i_833_ = (i_787_ >> 16) * anInt8893;
						for (int i_834_ = -i_780_; i_834_ < 0; i_834_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_835_ = anIntArray10570[(i_786_ >> 16) + i_833_];
								int i_836_ = i_835_ >>> 24;
								int i_837_ = 256 - i_836_;
								int i_838_ = is[i_794_];
								is[i_794_] = (((i_835_ & 0xff00ff) * i_836_ + (i_838_ & 0xff00ff) * i_837_ & ~0xff00ff) >> 8) + (((i_835_ & ~0xff00ff) >>> 8) * i_836_ + ((i_838_ & ~0xff00ff) >>> 8) * i_837_ & ~0xff00ff);
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_831_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 0) {
					int i_839_ = i_786_;
					if ((i_783_ & 0xffffff) == 16777215) {
						for (int i_840_ = -i_781_; i_840_ < 0; i_840_++) {
							int i_841_ = (i_787_ >> 16) * anInt8893;
							for (int i_842_ = -i_780_; i_842_ < 0; i_842_++) {
								if ((float) i_779_ < fs[i_794_]) {
									int i_843_ = anIntArray10570[(i_786_ >> 16) + i_841_];
									int i_844_ = (i_843_ >>> 24) * (i_783_ >>> 24) >> 8;
									int i_845_ = 256 - i_844_;
									int i_846_ = is[i_794_];
									is[i_794_] = ((i_843_ & 0xff00ff) * i_844_ + (i_846_ & 0xff00ff) * i_845_ & ~0xff00ff) + ((i_843_ & 0xff00) * i_844_ + (i_846_ & 0xff00) * i_845_ & 0xff0000) >> 8;
									fs[i_794_] = (float) i_779_;
								}
								i_786_ += i_790_;
								i_794_++;
							}
							i_787_ += i_791_;
							i_786_ = i_839_;
							i_794_ += i_795_;
						}
					} else {
						int i_847_ = (i_783_ & 0xff0000) >> 16;
						int i_848_ = (i_783_ & 0xff00) >> 8;
						int i_849_ = i_783_ & 0xff;
						for (int i_850_ = -i_781_; i_850_ < 0; i_850_++) {
							int i_851_ = (i_787_ >> 16) * anInt8893;
							for (int i_852_ = -i_780_; i_852_ < 0; i_852_++) {
								if ((float) i_779_ < fs[i_794_]) {
									int i_853_ = anIntArray10570[(i_786_ >> 16) + i_851_];
									int i_854_ = (i_853_ >>> 24) * (i_783_ >>> 24) >> 8;
									int i_855_ = 256 - i_854_;
									if (i_854_ != 255) {
										int i_856_ = (i_853_ & 0xff0000) * i_847_ & ~0xffffff;
										int i_857_ = (i_853_ & 0xff00) * i_848_ & 0xff0000;
										int i_858_ = (i_853_ & 0xff) * i_849_ & 0xff00;
										i_853_ = (i_856_ | i_857_ | i_858_) >>> 8;
										int i_859_ = is[i_794_];
										is[i_794_] = ((i_853_ & 0xff00ff) * i_854_ + (i_859_ & 0xff00ff) * i_855_ & ~0xff00ff) + ((i_853_ & 0xff00) * i_854_ + (i_859_ & 0xff00) * i_855_ & 0xff0000) >> 8;
										fs[i_794_] = (float) i_779_;
										int i_860_ = (i_859_ >>> 24) + i_854_;
										if (i_860_ > 255) {
											i_860_ = 255;
										}
										is[i_794_] |= i_860_ << 24;
									} else {
										int i_861_ = (i_853_ & 0xff0000) * i_847_ & ~0xffffff;
										int i_862_ = (i_853_ & 0xff00) * i_848_ & 0xff0000;
										int i_863_ = (i_853_ & 0xff) * i_849_ & 0xff00;
										is[i_794_] = (i_861_ | i_862_ | i_863_) >>> 8;
										fs[i_794_] = (float) i_779_;
									}
								}
								i_786_ += i_790_;
								i_794_++;
							}
							i_787_ += i_791_;
							i_786_ = i_839_;
							i_794_ += i_795_;
						}
						return;
					}
					return;
				}
				if (i_782_ == 3) {
					int i_864_ = i_786_;
					for (int i_865_ = -i_781_; i_865_ < 0; i_865_++) {
						int i_866_ = (i_787_ >> 16) * anInt8893;
						for (int i_867_ = -i_780_; i_867_ < 0; i_867_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_868_ = anIntArray10570[(i_786_ >> 16) + i_866_];
								int i_869_ = i_868_ + i_783_;
								int i_870_ = (i_868_ & 0xff00ff) + (i_783_ & 0xff00ff);
								int i_871_ = (i_870_ & 0x1000100) + (i_869_ - i_870_ & 0x10000);
								i_871_ = i_869_ - i_871_ | i_871_ - (i_871_ >>> 8);
								int i_872_ = (i_871_ >>> 24) * (i_783_ >>> 24) >> 8;
								int i_873_ = 256 - i_872_;
								if (i_872_ != 255) {
									i_868_ = i_871_;
									i_871_ = is[i_794_];
									i_871_ = ((i_868_ & 0xff00ff) * i_872_ + (i_871_ & 0xff00ff) * i_873_ & ~0xff00ff) + ((i_868_ & 0xff00) * i_872_ + (i_871_ & 0xff00) * i_873_ & 0xff0000) >> 8;
								}
								is[i_794_] = i_871_;
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_864_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 2) {
					int i_874_ = i_783_ >>> 24;
					int i_875_ = 256 - i_874_;
					int i_876_ = (i_783_ & 0xff00ff) * i_875_ & ~0xff00ff;
					int i_877_ = (i_783_ & 0xff00) * i_875_ & 0xff0000;
					i_783_ = (i_876_ | i_877_) >>> 8;
					int i_878_ = i_786_;
					for (int i_879_ = -i_781_; i_879_ < 0; i_879_++) {
						int i_880_ = (i_787_ >> 16) * anInt8893;
						for (int i_881_ = -i_780_; i_881_ < 0; i_881_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_882_ = anIntArray10570[(i_786_ >> 16) + i_880_];
								int i_883_ = i_882_ >>> 24;
								int i_884_ = 256 - i_883_;
								i_876_ = (i_882_ & 0xff00ff) * i_874_ & ~0xff00ff;
								i_877_ = (i_882_ & 0xff00) * i_874_ & 0xff0000;
								i_882_ = ((i_876_ | i_877_) >>> 8) + i_783_;
								int i_885_ = is[i_794_];
								is[i_794_] = ((i_882_ & 0xff00ff) * i_883_ + (i_885_ & 0xff00ff) * i_884_ & ~0xff00ff) + ((i_882_ & 0xff00) * i_883_ + (i_885_ & 0xff00) * i_884_ & 0xff0000) >> 8;
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_878_;
						i_794_ += i_795_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_784_ == 2) {
				if (i_782_ == 1) {
					int i_886_ = i_786_;
					for (int i_887_ = -i_781_; i_887_ < 0; i_887_++) {
						int i_888_ = (i_787_ >> 16) * anInt8893;
						for (int i_889_ = -i_780_; i_889_ < 0; i_889_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_890_ = anIntArray10570[(i_786_ >> 16) + i_888_];
								if (i_890_ != 0) {
									int i_891_ = is[i_794_];
									int i_892_ = i_890_ + i_891_;
									int i_893_ = (i_890_ & 0xff00ff) + (i_891_ & 0xff00ff);
									i_891_ = (i_893_ & 0x1000100) + (i_892_ - i_893_ & 0x10000);
									is[i_794_] = i_892_ - i_891_ | i_891_ - (i_891_ >>> 8);
									fs[i_794_] = (float) i_779_;
								}
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_886_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 0) {
					int i_894_ = i_786_;
					int i_895_ = (i_783_ & 0xff0000) >> 16;
					int i_896_ = (i_783_ & 0xff00) >> 8;
					int i_897_ = i_783_ & 0xff;
					for (int i_898_ = -i_781_; i_898_ < 0; i_898_++) {
						int i_899_ = (i_787_ >> 16) * anInt8893;
						for (int i_900_ = -i_780_; i_900_ < 0; i_900_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_901_ = anIntArray10570[(i_786_ >> 16) + i_899_];
								if (i_901_ != 0) {
									int i_902_ = (i_901_ & 0xff0000) * i_895_ & ~0xffffff;
									int i_903_ = (i_901_ & 0xff00) * i_896_ & 0xff0000;
									int i_904_ = (i_901_ & 0xff) * i_897_ & 0xff00;
									i_901_ = (i_902_ | i_903_ | i_904_) >>> 8;
									int i_905_ = is[i_794_];
									int i_906_ = i_901_ + i_905_;
									int i_907_ = (i_901_ & 0xff00ff) + (i_905_ & 0xff00ff);
									i_905_ = (i_907_ & 0x1000100) + (i_906_ - i_907_ & 0x10000);
									is[i_794_] = i_906_ - i_905_ | i_905_ - (i_905_ >>> 8);
									fs[i_794_] = (float) i_779_;
								}
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_894_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 3) {
					int i_908_ = i_786_;
					for (int i_909_ = -i_781_; i_909_ < 0; i_909_++) {
						int i_910_ = (i_787_ >> 16) * anInt8893;
						for (int i_911_ = -i_780_; i_911_ < 0; i_911_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_912_ = anIntArray10570[(i_786_ >> 16) + i_910_];
								int i_913_ = i_912_ + i_783_;
								int i_914_ = (i_912_ & 0xff00ff) + (i_783_ & 0xff00ff);
								int i_915_ = (i_914_ & 0x1000100) + (i_913_ - i_914_ & 0x10000);
								i_912_ = i_913_ - i_915_ | i_915_ - (i_915_ >>> 8);
								i_915_ = is[i_794_];
								i_913_ = i_912_ + i_915_;
								i_914_ = (i_912_ & 0xff00ff) + (i_915_ & 0xff00ff);
								i_915_ = (i_914_ & 0x1000100) + (i_913_ - i_914_ & 0x10000);
								is[i_794_] = i_913_ - i_915_ | i_915_ - (i_915_ >>> 8);
								fs[i_794_] = (float) i_779_;
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_908_;
						i_794_ += i_795_;
					}
					return;
				}
				if (i_782_ == 2) {
					int i_916_ = i_783_ >>> 24;
					int i_917_ = 256 - i_916_;
					int i_918_ = (i_783_ & 0xff00ff) * i_917_ & ~0xff00ff;
					int i_919_ = (i_783_ & 0xff00) * i_917_ & 0xff0000;
					i_783_ = (i_918_ | i_919_) >>> 8;
					int i_920_ = i_786_;
					for (int i_921_ = -i_781_; i_921_ < 0; i_921_++) {
						int i_922_ = (i_787_ >> 16) * anInt8893;
						for (int i_923_ = -i_780_; i_923_ < 0; i_923_++) {
							if ((float) i_779_ < fs[i_794_]) {
								int i_924_ = anIntArray10570[(i_786_ >> 16) + i_922_];
								if (i_924_ != 0) {
									i_918_ = (i_924_ & 0xff00ff) * i_916_ & ~0xff00ff;
									i_919_ = (i_924_ & 0xff00) * i_916_ & 0xff0000;
									i_924_ = ((i_918_ | i_919_) >>> 8) + i_783_;
									int i_925_ = is[i_794_];
									int i_926_ = i_924_ + i_925_;
									int i_927_ = (i_924_ & 0xff00ff) + (i_925_ & 0xff00ff);
									i_925_ = (i_927_ & 0x1000100) + (i_926_ - i_927_ & 0x10000);
									is[i_794_] = i_926_ - i_925_ | i_925_ - (i_925_ >>> 8);
									fs[i_794_] = (float) i_779_;
								}
							}
							i_786_ += i_790_;
							i_794_++;
						}
						i_787_ += i_791_;
						i_786_ = i_920_;
						i_794_ += i_795_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	final void method1190(int i, int i_928_, int i_929_) {
		if (i_929_ == 0) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			for (int i_930_ = 0; i_930_ < anInt8897; i_930_++) {
				int i_931_ = i_930_ * anInt8893;
				int i_932_ = (i_928_ + i_930_) * aPureJavaToolkit8886.anInt6789 + i;
				for (int i_933_ = 0; i_933_ < anInt8893; i_933_++)
					anIntArray10570[i_931_ + i_933_] = anIntArray10570[i_931_ + i_933_] & 0xffffff | is[i_932_ + i_933_] << 8 & ~0xffffff;
			}
		} else if (i_929_ == 1) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			for (int i_934_ = 0; i_934_ < anInt8897; i_934_++) {
				int i_935_ = i_934_ * anInt8893;
				int i_936_ = (i_928_ + i_934_) * aPureJavaToolkit8886.anInt6789 + i;
				for (int i_937_ = 0; i_937_ < anInt8893; i_937_++)
					anIntArray10570[i_935_ + i_937_] = anIntArray10570[i_935_ + i_937_] & 0xffffff | is[i_936_ + i_937_] << 16 & ~0xffffff;
			}
		} else if (i_929_ == 2) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			for (int i_938_ = 0; i_938_ < anInt8897; i_938_++) {
				int i_939_ = i_938_ * anInt8893;
				int i_940_ = (i_928_ + i_938_) * aPureJavaToolkit8886.anInt6789 + i;
				for (int i_941_ = 0; i_941_ < anInt8893; i_941_++)
					anIntArray10570[i_939_ + i_941_] = anIntArray10570[i_939_ + i_941_] & 0xffffff | is[i_940_ + i_941_] << 24 & ~0xffffff;
			}
		} else if (i_929_ == 3) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			for (int i_942_ = 0; i_942_ < anInt8897; i_942_++) {
				int i_943_ = i_942_ * anInt8893;
				int i_944_ = (i_928_ + i_942_) * aPureJavaToolkit8886.anInt6789 + i;
				for (int i_945_ = 0; i_945_ < anInt8893; i_945_++)
					anIntArray10570[i_943_ + i_945_] = anIntArray10570[i_943_ + i_945_] & 0xffffff | (is[i_944_ + i_945_] != 0 ? -16777216 : 0);
			}
		}
	}
	
	final void method1210(int[] is, int[] is_946_, int i, int i_947_) {
		int[] is_948_ = aPureJavaToolkit8886.anIntArray6787;
		if (GLSprite_Sub2.anInt8913 == 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_949_ = GLSprite_Sub2.anInt8888;
				while (i_949_ < 0) {
					int i_950_ = i_949_ + i_947_;
					if (i_950_ >= 0) {
						if (i_950_ >= is.length) {
							break;
						}
						int i_951_ = GLSprite_Sub2.anInt8882;
						int i_952_ = GLSprite_Sub2.anInt8901;
						int i_953_ = GLSprite_Sub2.anInt8908;
						int i_954_ = GLSprite_Sub2.anInt8894;
						if (i_952_ >= 0 && i_953_ >= 0 && i_952_ - (anInt8893 << 12) < 0 && i_953_ - (anInt8897 << 12) < 0) {
							int i_955_ = is[i_950_] - i;
							int i_956_ = -is_946_[i_950_];
							int i_957_ = i_955_ - (i_951_ - GLSprite_Sub2.anInt8882);
							if (i_957_ > 0) {
								i_951_ += i_957_;
								i_954_ += i_957_;
								i_952_ += GLSprite_Sub2.anInt8913 * i_957_;
								i_953_ += GLSprite_Sub2.anInt8900 * i_957_;
							} else {
								i_956_ -= i_957_;
							}
							if (i_954_ < i_956_) {
								i_954_ = i_956_;
							}
							for (/**/; i_954_ < 0; i_954_++) {
								int i_958_ = anIntArray10570[(i_953_ >> 12) * anInt8893 + (i_952_ >> 12)];
								int i_959_ = i_958_ >>> 24;
								int i_960_ = 256 - i_959_;
								int i_961_ = is_948_[i_951_];
								is_948_[i_951_++] = ((i_958_ & 0xff00ff) * i_959_ + (i_961_ & 0xff00ff) * i_960_ & ~0xff00ff) + ((i_958_ & 0xff00) * i_959_ + (i_961_ & 0xff00) * i_960_ & 0xff0000) >> 8;
							}
						}
					}
					i_949_++;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_962_ = GLSprite_Sub2.anInt8888;
				while (i_962_ < 0) {
					int i_963_ = i_962_ + i_947_;
					if (i_963_ >= 0) {
						if (i_963_ >= is.length) {
							break;
						}
						int i_964_ = GLSprite_Sub2.anInt8882;
						int i_965_ = GLSprite_Sub2.anInt8901;
						int i_966_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_967_ = GLSprite_Sub2.anInt8894;
						if (i_965_ >= 0 && i_965_ - (anInt8893 << 12) < 0) {
							int i_968_;
							if ((i_968_ = i_966_ - (anInt8897 << 12)) >= 0) {
								i_968_ = (GLSprite_Sub2.anInt8900 - i_968_) / GLSprite_Sub2.anInt8900;
								i_967_ += i_968_;
								i_966_ += GLSprite_Sub2.anInt8900 * i_968_;
								i_964_ += i_968_;
							}
							if ((i_968_ = (i_966_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_967_) {
								i_967_ = i_968_;
							}
							int i_969_ = is[i_963_] - i;
							int i_970_ = -is_946_[i_963_];
							int i_971_ = i_969_ - (i_964_ - GLSprite_Sub2.anInt8882);
							if (i_971_ > 0) {
								i_964_ += i_971_;
								i_967_ += i_971_;
								i_965_ += GLSprite_Sub2.anInt8913 * i_971_;
								i_966_ += GLSprite_Sub2.anInt8900 * i_971_;
							} else {
								i_970_ -= i_971_;
							}
							if (i_967_ < i_970_) {
								i_967_ = i_970_;
							}
							for (/**/; i_967_ < 0; i_967_++) {
								int i_972_ = anIntArray10570[(i_966_ >> 12) * anInt8893 + (i_965_ >> 12)];
								int i_973_ = i_972_ >>> 24;
								int i_974_ = 256 - i_973_;
								int i_975_ = is_948_[i_964_];
								is_948_[i_964_++] = ((i_972_ & 0xff00ff) * i_973_ + (i_975_ & 0xff00ff) * i_974_ & ~0xff00ff) + ((i_972_ & 0xff00) * i_973_ + (i_975_ & 0xff00) * i_974_ & 0xff0000) >> 8;
								i_966_ += GLSprite_Sub2.anInt8900;
							}
						}
					}
					i_962_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_976_ = GLSprite_Sub2.anInt8888;
				while (i_976_ < 0) {
					int i_977_ = i_976_ + i_947_;
					if (i_977_ >= 0) {
						if (i_977_ >= is.length) {
							break;
						}
						int i_978_ = GLSprite_Sub2.anInt8882;
						int i_979_ = GLSprite_Sub2.anInt8901;
						int i_980_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_981_ = GLSprite_Sub2.anInt8894;
						if (i_979_ >= 0 && i_979_ - (anInt8893 << 12) < 0) {
							if (i_980_ < 0) {
								int i_982_ = (GLSprite_Sub2.anInt8900 - 1 - i_980_) / GLSprite_Sub2.anInt8900;
								i_981_ += i_982_;
								i_980_ += GLSprite_Sub2.anInt8900 * i_982_;
								i_978_ += i_982_;
							}
							int i_983_;
							if ((i_983_ = (1 + i_980_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_981_) {
								i_981_ = i_983_;
							}
							int i_984_ = is[i_977_] - i;
							int i_985_ = -is_946_[i_977_];
							int i_986_ = i_984_ - (i_978_ - GLSprite_Sub2.anInt8882);
							if (i_986_ > 0) {
								i_978_ += i_986_;
								i_981_ += i_986_;
								i_979_ += GLSprite_Sub2.anInt8913 * i_986_;
								i_980_ += GLSprite_Sub2.anInt8900 * i_986_;
							} else {
								i_985_ -= i_986_;
							}
							if (i_981_ < i_985_) {
								i_981_ = i_985_;
							}
							for (/**/; i_981_ < 0; i_981_++) {
								int i_987_ = anIntArray10570[(i_980_ >> 12) * anInt8893 + (i_979_ >> 12)];
								int i_988_ = i_987_ >>> 24;
								int i_989_ = 256 - i_988_;
								int i_990_ = is_948_[i_978_];
								is_948_[i_978_++] = ((i_987_ & 0xff00ff) * i_988_ + (i_990_ & 0xff00ff) * i_989_ & ~0xff00ff) + ((i_987_ & 0xff00) * i_988_ + (i_990_ & 0xff00) * i_989_ & 0xff0000) >> 8;
								i_980_ += GLSprite_Sub2.anInt8900;
							}
						}
					}
					i_976_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8913 < 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_991_ = GLSprite_Sub2.anInt8888;
				while (i_991_ < 0) {
					int i_992_ = i_991_ + i_947_;
					if (i_992_ >= 0) {
						if (i_992_ >= is.length) {
							break;
						}
						int i_993_ = GLSprite_Sub2.anInt8882;
						int i_994_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_995_ = GLSprite_Sub2.anInt8908;
						int i_996_ = GLSprite_Sub2.anInt8894;
						if (i_995_ >= 0 && i_995_ - (anInt8897 << 12) < 0) {
							int i_997_;
							if ((i_997_ = i_994_ - (anInt8893 << 12)) >= 0) {
								i_997_ = (GLSprite_Sub2.anInt8913 - i_997_) / GLSprite_Sub2.anInt8913;
								i_996_ += i_997_;
								i_994_ += GLSprite_Sub2.anInt8913 * i_997_;
								i_993_ += i_997_;
							}
							if ((i_997_ = (i_994_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_996_) {
								i_996_ = i_997_;
							}
							int i_998_ = is[i_992_] - i;
							int i_999_ = -is_946_[i_992_];
							int i_1000_ = i_998_ - (i_993_ - GLSprite_Sub2.anInt8882);
							if (i_1000_ > 0) {
								i_993_ += i_1000_;
								i_996_ += i_1000_;
								i_994_ += GLSprite_Sub2.anInt8913 * i_1000_;
								i_995_ += GLSprite_Sub2.anInt8900 * i_1000_;
							} else {
								i_999_ -= i_1000_;
							}
							if (i_996_ < i_999_) {
								i_996_ = i_999_;
							}
							for (/**/; i_996_ < 0; i_996_++) {
								int i_1001_ = anIntArray10570[(i_995_ >> 12) * anInt8893 + (i_994_ >> 12)];
								int i_1002_ = i_1001_ >>> 24;
								int i_1003_ = 256 - i_1002_;
								int i_1004_ = is_948_[i_993_];
								is_948_[i_993_++] = ((i_1001_ & 0xff00ff) * i_1002_ + (i_1004_ & 0xff00ff) * i_1003_ & ~0xff00ff) + ((i_1001_ & 0xff00) * i_1002_ + (i_1004_ & 0xff00) * i_1003_ & 0xff0000) >> 8;
								i_994_ += GLSprite_Sub2.anInt8913;
							}
						}
					}
					i_991_++;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_1005_ = GLSprite_Sub2.anInt8888;
				while (i_1005_ < 0) {
					int i_1006_ = i_1005_ + i_947_;
					if (i_1006_ >= 0) {
						if (i_1006_ >= is.length) {
							break;
						}
						int i_1007_ = GLSprite_Sub2.anInt8882;
						int i_1008_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_1009_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_1010_ = GLSprite_Sub2.anInt8894;
						int i_1011_;
						if ((i_1011_ = i_1008_ - (anInt8893 << 12)) >= 0) {
							i_1011_ = (GLSprite_Sub2.anInt8913 - i_1011_) / GLSprite_Sub2.anInt8913;
							i_1010_ += i_1011_;
							i_1008_ += GLSprite_Sub2.anInt8913 * i_1011_;
							i_1009_ += GLSprite_Sub2.anInt8900 * i_1011_;
							i_1007_ += i_1011_;
						}
						if ((i_1011_ = (i_1008_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1010_) {
							i_1010_ = i_1011_;
						}
						if ((i_1011_ = i_1009_ - (anInt8897 << 12)) >= 0) {
							i_1011_ = (GLSprite_Sub2.anInt8900 - i_1011_) / GLSprite_Sub2.anInt8900;
							i_1010_ += i_1011_;
							i_1008_ += GLSprite_Sub2.anInt8913 * i_1011_;
							i_1009_ += GLSprite_Sub2.anInt8900 * i_1011_;
							i_1007_ += i_1011_;
						}
						if ((i_1011_ = (i_1009_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1010_) {
							i_1010_ = i_1011_;
						}
						int i_1012_ = is[i_1006_] - i;
						int i_1013_ = -is_946_[i_1006_];
						int i_1014_ = i_1012_ - (i_1007_ - GLSprite_Sub2.anInt8882);
						if (i_1014_ > 0) {
							i_1007_ += i_1014_;
							i_1010_ += i_1014_;
							i_1008_ += GLSprite_Sub2.anInt8913 * i_1014_;
							i_1009_ += GLSprite_Sub2.anInt8900 * i_1014_;
						} else {
							i_1013_ -= i_1014_;
						}
						if (i_1010_ < i_1013_) {
							i_1010_ = i_1013_;
						}
						for (/**/; i_1010_ < 0; i_1010_++) {
							int i_1015_ = anIntArray10570[(i_1009_ >> 12) * anInt8893 + (i_1008_ >> 12)];
							int i_1016_ = i_1015_ >>> 24;
							int i_1017_ = 256 - i_1016_;
							int i_1018_ = is_948_[i_1007_];
							is_948_[i_1007_++] = ((i_1015_ & 0xff00ff) * i_1016_ + (i_1018_ & 0xff00ff) * i_1017_ & ~0xff00ff) + ((i_1015_ & 0xff00) * i_1016_ + (i_1018_ & 0xff00) * i_1017_ & 0xff0000) >> 8;
							i_1008_ += GLSprite_Sub2.anInt8913;
							i_1009_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_1005_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_1019_ = GLSprite_Sub2.anInt8888;
				while (i_1019_ < 0) {
					int i_1020_ = i_1019_ + i_947_;
					if (i_1020_ >= 0) {
						if (i_1020_ >= is.length) {
							break;
						}
						int i_1021_ = GLSprite_Sub2.anInt8882;
						int i_1022_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_1023_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_1024_ = GLSprite_Sub2.anInt8894;
						int i_1025_;
						if ((i_1025_ = i_1022_ - (anInt8893 << 12)) >= 0) {
							i_1025_ = (GLSprite_Sub2.anInt8913 - i_1025_) / GLSprite_Sub2.anInt8913;
							i_1024_ += i_1025_;
							i_1022_ += GLSprite_Sub2.anInt8913 * i_1025_;
							i_1023_ += GLSprite_Sub2.anInt8900 * i_1025_;
							i_1021_ += i_1025_;
						}
						if ((i_1025_ = (i_1022_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1024_) {
							i_1024_ = i_1025_;
						}
						if (i_1023_ < 0) {
							i_1025_ = (GLSprite_Sub2.anInt8900 - 1 - i_1023_) / GLSprite_Sub2.anInt8900;
							i_1024_ += i_1025_;
							i_1022_ += GLSprite_Sub2.anInt8913 * i_1025_;
							i_1023_ += GLSprite_Sub2.anInt8900 * i_1025_;
							i_1021_ += i_1025_;
						}
						if ((i_1025_ = (1 + i_1023_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1024_) {
							i_1024_ = i_1025_;
						}
						int i_1026_ = is[i_1020_] - i;
						int i_1027_ = -is_946_[i_1020_];
						int i_1028_ = i_1026_ - (i_1021_ - GLSprite_Sub2.anInt8882);
						if (i_1028_ > 0) {
							i_1021_ += i_1028_;
							i_1024_ += i_1028_;
							i_1022_ += GLSprite_Sub2.anInt8913 * i_1028_;
							i_1023_ += GLSprite_Sub2.anInt8900 * i_1028_;
						} else {
							i_1027_ -= i_1028_;
						}
						if (i_1024_ < i_1027_) {
							i_1024_ = i_1027_;
						}
						for (/**/; i_1024_ < 0; i_1024_++) {
							int i_1029_ = anIntArray10570[(i_1023_ >> 12) * anInt8893 + (i_1022_ >> 12)];
							int i_1030_ = i_1029_ >>> 24;
							int i_1031_ = 256 - i_1030_;
							int i_1032_ = is_948_[i_1021_];
							is_948_[i_1021_++] = ((i_1029_ & 0xff00ff) * i_1030_ + (i_1032_ & 0xff00ff) * i_1031_ & ~0xff00ff) + ((i_1029_ & 0xff00) * i_1030_ + (i_1032_ & 0xff00) * i_1031_ & 0xff0000) >> 8;
							i_1022_ += GLSprite_Sub2.anInt8913;
							i_1023_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_1019_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8900 == 0) {
			int i_1033_ = GLSprite_Sub2.anInt8888;
			while (i_1033_ < 0) {
				int i_1034_ = i_1033_ + i_947_;
				if (i_1034_ >= 0) {
					if (i_1034_ >= is.length) {
						break;
					}
					int i_1035_ = GLSprite_Sub2.anInt8882;
					int i_1036_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_1037_ = GLSprite_Sub2.anInt8908;
					int i_1038_ = GLSprite_Sub2.anInt8894;
					if (i_1037_ >= 0 && i_1037_ - (anInt8897 << 12) < 0) {
						if (i_1036_ < 0) {
							int i_1039_ = (GLSprite_Sub2.anInt8913 - 1 - i_1036_) / GLSprite_Sub2.anInt8913;
							i_1038_ += i_1039_;
							i_1036_ += GLSprite_Sub2.anInt8913 * i_1039_;
							i_1035_ += i_1039_;
						}
						int i_1040_;
						if ((i_1040_ = (1 + i_1036_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1038_) {
							i_1038_ = i_1040_;
						}
						int i_1041_ = is[i_1034_] - i;
						int i_1042_ = -is_946_[i_1034_];
						int i_1043_ = i_1041_ - (i_1035_ - GLSprite_Sub2.anInt8882);
						if (i_1043_ > 0) {
							i_1035_ += i_1043_;
							i_1038_ += i_1043_;
							i_1036_ += GLSprite_Sub2.anInt8913 * i_1043_;
							i_1037_ += GLSprite_Sub2.anInt8900 * i_1043_;
						} else {
							i_1042_ -= i_1043_;
						}
						if (i_1038_ < i_1042_) {
							i_1038_ = i_1042_;
						}
						for (/**/; i_1038_ < 0; i_1038_++) {
							int i_1044_ = anIntArray10570[(i_1037_ >> 12) * anInt8893 + (i_1036_ >> 12)];
							int i_1045_ = i_1044_ >>> 24;
							int i_1046_ = 256 - i_1045_;
							int i_1047_ = is_948_[i_1035_];
							is_948_[i_1035_++] = ((i_1044_ & 0xff00ff) * i_1045_ + (i_1047_ & 0xff00ff) * i_1046_ & ~0xff00ff) + ((i_1044_ & 0xff00) * i_1045_ + (i_1047_ & 0xff00) * i_1046_ & 0xff0000) >> 8;
							i_1036_ += GLSprite_Sub2.anInt8913;
						}
					}
				}
				i_1033_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else if (GLSprite_Sub2.anInt8900 < 0) {
			int i_1048_ = GLSprite_Sub2.anInt8888;
			while (i_1048_ < 0) {
				int i_1049_ = i_1048_ + i_947_;
				if (i_1049_ >= 0) {
					if (i_1049_ >= is.length) {
						break;
					}
					int i_1050_ = GLSprite_Sub2.anInt8882;
					int i_1051_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_1052_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_1053_ = GLSprite_Sub2.anInt8894;
					if (i_1051_ < 0) {
						int i_1054_ = (GLSprite_Sub2.anInt8913 - 1 - i_1051_) / GLSprite_Sub2.anInt8913;
						i_1053_ += i_1054_;
						i_1051_ += GLSprite_Sub2.anInt8913 * i_1054_;
						i_1052_ += GLSprite_Sub2.anInt8900 * i_1054_;
						i_1050_ += i_1054_;
					}
					int i_1055_;
					if ((i_1055_ = (1 + i_1051_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1053_) {
						i_1053_ = i_1055_;
					}
					if ((i_1055_ = i_1052_ - (anInt8897 << 12)) >= 0) {
						i_1055_ = (GLSprite_Sub2.anInt8900 - i_1055_) / GLSprite_Sub2.anInt8900;
						i_1053_ += i_1055_;
						i_1051_ += GLSprite_Sub2.anInt8913 * i_1055_;
						i_1052_ += GLSprite_Sub2.anInt8900 * i_1055_;
						i_1050_ += i_1055_;
					}
					if ((i_1055_ = (i_1052_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1053_) {
						i_1053_ = i_1055_;
					}
					int i_1056_ = is[i_1049_] - i;
					int i_1057_ = -is_946_[i_1049_];
					int i_1058_ = i_1056_ - (i_1050_ - GLSprite_Sub2.anInt8882);
					if (i_1058_ > 0) {
						i_1050_ += i_1058_;
						i_1053_ += i_1058_;
						i_1051_ += GLSprite_Sub2.anInt8913 * i_1058_;
						i_1052_ += GLSprite_Sub2.anInt8900 * i_1058_;
					} else {
						i_1057_ -= i_1058_;
					}
					if (i_1053_ < i_1057_) {
						i_1053_ = i_1057_;
					}
					for (/**/; i_1053_ < 0; i_1053_++) {
						int i_1059_ = anIntArray10570[(i_1052_ >> 12) * anInt8893 + (i_1051_ >> 12)];
						int i_1060_ = i_1059_ >>> 24;
						int i_1061_ = 256 - i_1060_;
						int i_1062_ = is_948_[i_1050_];
						is_948_[i_1050_++] = ((i_1059_ & 0xff00ff) * i_1060_ + (i_1062_ & 0xff00ff) * i_1061_ & ~0xff00ff) + ((i_1059_ & 0xff00) * i_1060_ + (i_1062_ & 0xff00) * i_1061_ & 0xff0000) >> 8;
						i_1051_ += GLSprite_Sub2.anInt8913;
						i_1052_ += GLSprite_Sub2.anInt8900;
					}
				}
				i_1048_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else {
			int i_1063_ = GLSprite_Sub2.anInt8888;
			while (i_1063_ < 0) {
				int i_1064_ = i_1063_ + i_947_;
				if (i_1064_ >= 0) {
					if (i_1064_ >= is.length) {
						break;
					}
					int i_1065_ = GLSprite_Sub2.anInt8882;
					int i_1066_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_1067_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_1068_ = GLSprite_Sub2.anInt8894;
					if (i_1066_ < 0) {
						int i_1069_ = (GLSprite_Sub2.anInt8913 - 1 - i_1066_) / GLSprite_Sub2.anInt8913;
						i_1068_ += i_1069_;
						i_1066_ += GLSprite_Sub2.anInt8913 * i_1069_;
						i_1067_ += GLSprite_Sub2.anInt8900 * i_1069_;
						i_1065_ += i_1069_;
					}
					int i_1070_;
					if ((i_1070_ = (1 + i_1066_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1068_) {
						i_1068_ = i_1070_;
					}
					if (i_1067_ < 0) {
						i_1070_ = (GLSprite_Sub2.anInt8900 - 1 - i_1067_) / GLSprite_Sub2.anInt8900;
						i_1068_ += i_1070_;
						i_1066_ += GLSprite_Sub2.anInt8913 * i_1070_;
						i_1067_ += GLSprite_Sub2.anInt8900 * i_1070_;
						i_1065_ += i_1070_;
					}
					if ((i_1070_ = (1 + i_1067_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1068_) {
						i_1068_ = i_1070_;
					}
					int i_1071_ = is[i_1064_] - i;
					int i_1072_ = -is_946_[i_1064_];
					int i_1073_ = i_1071_ - (i_1065_ - GLSprite_Sub2.anInt8882);
					if (i_1073_ > 0) {
						i_1065_ += i_1073_;
						i_1068_ += i_1073_;
						i_1066_ += GLSprite_Sub2.anInt8913 * i_1073_;
						i_1067_ += GLSprite_Sub2.anInt8900 * i_1073_;
					} else {
						i_1072_ -= i_1073_;
					}
					if (i_1068_ < i_1072_) {
						i_1068_ = i_1072_;
					}
					for (/**/; i_1068_ < 0; i_1068_++) {
						int i_1074_ = anIntArray10570[(i_1067_ >> 12) * anInt8893 + (i_1066_ >> 12)];
						int i_1075_ = i_1074_ >>> 24;
						int i_1076_ = 256 - i_1075_;
						int i_1077_ = is_948_[i_1065_];
						is_948_[i_1065_++] = ((i_1074_ & 0xff00ff) * i_1075_ + (i_1077_ & 0xff00ff) * i_1076_ & ~0xff00ff) + ((i_1074_ & 0xff00) * i_1075_ + (i_1077_ & 0xff00) * i_1076_ & 0xff0000) >> 8;
						i_1066_ += GLSprite_Sub2.anInt8913;
						i_1067_ += GLSprite_Sub2.anInt8900;
					}
				}
				i_1063_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		}
	}
	
	final void method1195(int i, int i_1078_, int i_1079_, int i_1080_, int i_1081_, int i_1082_) {
		int[] is = aPureJavaToolkit8886.anIntArray6787;
		for (int i_1083_ = 0; i_1083_ < i_1080_; i_1083_++) {
			int i_1084_ = (i_1078_ + i_1083_) * i_1079_ + i;
			int i_1085_ = (i_1082_ + i_1083_) * i_1079_ + i_1081_;
			for (int i_1086_ = 0; i_1086_ < i_1079_; i_1086_++)
				anIntArray10570[i_1084_ + i_1086_] = is[i_1085_ + i_1086_] & 0xffffff;
		}
	}
	
	final void method1189(int i, int i_1087_, aa var_aa, int i_1088_, int i_1089_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		i += anInt8889;
		i_1087_ += anInt8899;
		int i_1090_ = 0;
		int i_1091_ = aPureJavaToolkit8886.anInt6789;
		int i_1092_ = anInt8893;
		int i_1093_ = anInt8897;
		int i_1094_ = i_1091_ - i_1092_;
		int i_1095_ = 0;
		int i_1096_ = i + i_1087_ * i_1091_;
		if (i_1087_ < aPureJavaToolkit8886.anInt6760) {
			int i_1097_ = aPureJavaToolkit8886.anInt6760 - i_1087_;
			i_1093_ -= i_1097_;
			i_1087_ = aPureJavaToolkit8886.anInt6760;
			i_1090_ += i_1097_ * i_1092_;
			i_1096_ += i_1097_ * i_1091_;
		}
		if (i_1087_ + i_1093_ > aPureJavaToolkit8886.anInt6772) {
			i_1093_ -= i_1087_ + i_1093_ - aPureJavaToolkit8886.anInt6772;
		}
		if (i < aPureJavaToolkit8886.anInt6767) {
			int i_1098_ = aPureJavaToolkit8886.anInt6767 - i;
			i_1092_ -= i_1098_;
			i = aPureJavaToolkit8886.anInt6767;
			i_1090_ += i_1098_;
			i_1096_ += i_1098_;
			i_1095_ += i_1098_;
			i_1094_ += i_1098_;
		}
		if (i + i_1092_ > aPureJavaToolkit8886.anInt6778) {
			int i_1099_ = i + i_1092_ - aPureJavaToolkit8886.anInt6778;
			i_1092_ -= i_1099_;
			i_1095_ += i_1099_;
			i_1094_ += i_1099_;
		}
		if (i_1092_ > 0 && i_1093_ > 0) {
			aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			int[] is = var_aa_Sub1.anIntArray5487;
			int[] is_1100_ = var_aa_Sub1.anIntArray5488;
			int[] is_1101_ = aPureJavaToolkit8886.anIntArray6787;
			int i_1102_ = i_1087_;
			if (i_1089_ > i_1102_) {
				i_1102_ = i_1089_;
				i_1096_ += (i_1089_ - i_1087_) * i_1091_;
				i_1090_ += (i_1089_ - i_1087_) * anInt8893;
			}
			int i_1103_ = i_1089_ + is.length < i_1087_ + i_1093_ ? i_1089_ + is.length : i_1087_ + i_1093_;
			for (int i_1104_ = i_1102_; i_1104_ < i_1103_; i_1104_++) {
				int i_1105_ = is[i_1104_ - i_1089_] + i_1088_;
				int i_1106_ = is_1100_[i_1104_ - i_1089_];
				int i_1107_ = i_1092_;
				if (i > i_1105_) {
					int i_1108_ = i - i_1105_;
					if (i_1108_ >= i_1106_) {
						i_1090_ += i_1092_ + i_1095_;
						i_1096_ += i_1092_ + i_1094_;
						continue;
					}
					i_1106_ -= i_1108_;
				} else {
					int i_1109_ = i_1105_ - i;
					if (i_1109_ >= i_1092_) {
						i_1090_ += i_1092_ + i_1095_;
						i_1096_ += i_1092_ + i_1094_;
						continue;
					}
					i_1090_ += i_1109_;
					i_1107_ -= i_1109_;
					i_1096_ += i_1109_;
				}
				int i_1110_ = 0;
				if (i_1107_ < i_1106_) {
					i_1106_ = i_1107_;
				} else {
					i_1110_ = i_1107_ - i_1106_;
				}
				for (int i_1111_ = -i_1106_; i_1111_ < 0; i_1111_++) {
					int i_1112_ = anIntArray10570[i_1090_++];
					int i_1113_ = i_1112_ >>> 24;
					int i_1114_ = 256 - i_1113_;
					int i_1115_ = is_1101_[i_1096_];
					is_1101_[i_1096_++] = ((i_1112_ & 0xff00ff) * i_1113_ + (i_1115_ & 0xff00ff) * i_1114_ & ~0xff00ff) + ((i_1112_ & 0xff00) * i_1113_ + (i_1115_ & 0xff00) * i_1114_ & 0xff0000) >> 8;
				}
				i_1090_ += i_1110_ + i_1095_;
				i_1096_ += i_1110_ + i_1094_;
			}
		}
	}
	
	GLSprite_Sub2_Sub2(PureJavaToolkit purejavatoolkit, int[] is, int i, int i_1116_, int i_1117_, int i_1118_, boolean bool) {
		super(purejavatoolkit, i_1117_, i_1118_);
		if (bool) {
			anIntArray10570 = new int[i_1117_ * i_1118_];
		} else {
			anIntArray10570 = is;
		}
		i_1116_ -= anInt8893;
		int i_1119_ = 0;
		for (int i_1120_ = 0; i_1120_ < i_1118_; i_1120_++) {
			for (int i_1121_ = 0; i_1121_ < i_1117_; i_1121_++)
				anIntArray10570[i_1119_++] = is[i++];
			i += i_1116_;
		}
	}
	
	GLSprite_Sub2_Sub2(PureJavaToolkit purejavatoolkit, int i, int i_1122_) {
		super(purejavatoolkit, i, i_1122_);
		anIntArray10570 = new int[i * i_1122_];
	}
	
	final void method1184(int i, int i_1123_, int i_1124_, int i_1125_, int i_1126_, int i_1127_, int i_1128_, int i_1129_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		if (i_1124_ > 0 && i_1125_ > 0) {
			int i_1130_ = 0;
			int i_1131_ = 0;
			int i_1132_ = aPureJavaToolkit8886.anInt6789;
			int i_1133_ = anInt8889 + anInt8893 + anInt8885;
			int i_1134_ = anInt8899 + anInt8897 + anInt8884;
			int i_1135_ = (i_1133_ << 16) / i_1124_;
			int i_1136_ = (i_1134_ << 16) / i_1125_;
			if (anInt8889 > 0) {
				int i_1137_ = ((anInt8889 << 16) + i_1135_ - 1) / i_1135_;
				i += i_1137_;
				i_1130_ += i_1137_ * i_1135_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_1138_ = ((anInt8899 << 16) + i_1136_ - 1) / i_1136_;
				i_1123_ += i_1138_;
				i_1131_ += i_1138_ * i_1136_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_1133_) {
				i_1124_ = ((anInt8893 << 16) - i_1130_ + i_1135_ - 1) / i_1135_;
			}
			if (anInt8897 < i_1134_) {
				i_1125_ = ((anInt8897 << 16) - i_1131_ + i_1136_ - 1) / i_1136_;
			}
			int i_1139_ = i + i_1123_ * i_1132_;
			int i_1140_ = i_1132_ - i_1124_;
			if (i_1123_ + i_1125_ > aPureJavaToolkit8886.anInt6772) {
				i_1125_ -= i_1123_ + i_1125_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_1123_ < aPureJavaToolkit8886.anInt6760) {
				int i_1141_ = aPureJavaToolkit8886.anInt6760 - i_1123_;
				i_1125_ -= i_1141_;
				i_1139_ += i_1141_ * i_1132_;
				i_1131_ += i_1136_ * i_1141_;
			}
			if (i + i_1124_ > aPureJavaToolkit8886.anInt6778) {
				int i_1142_ = i + i_1124_ - aPureJavaToolkit8886.anInt6778;
				i_1124_ -= i_1142_;
				i_1140_ += i_1142_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_1143_ = aPureJavaToolkit8886.anInt6767 - i;
				i_1124_ -= i_1143_;
				i_1139_ += i_1143_;
				i_1130_ += i_1135_ * i_1143_;
				i_1140_ += i_1143_;
			}
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_1128_ == 0) {
				if (i_1126_ == 1) {
					int i_1144_ = i_1130_;
					for (int i_1145_ = -i_1125_; i_1145_ < 0; i_1145_++) {
						int i_1146_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1147_ = -i_1124_; i_1147_ < 0; i_1147_++) {
							is[i_1139_++] = anIntArray10570[(i_1130_ >> 16) + i_1146_];
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1144_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 0) {
					int i_1148_ = (i_1127_ & 0xff0000) >> 16;
					int i_1149_ = (i_1127_ & 0xff00) >> 8;
					int i_1150_ = i_1127_ & 0xff;
					int i_1151_ = i_1130_;
					for (int i_1152_ = -i_1125_; i_1152_ < 0; i_1152_++) {
						int i_1153_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1154_ = -i_1124_; i_1154_ < 0; i_1154_++) {
							int i_1155_ = anIntArray10570[(i_1130_ >> 16) + i_1153_];
							int i_1156_ = (i_1155_ & 0xff0000) * i_1148_ & ~0xffffff;
							int i_1157_ = (i_1155_ & 0xff00) * i_1149_ & 0xff0000;
							int i_1158_ = (i_1155_ & 0xff) * i_1150_ & 0xff00;
							is[i_1139_++] = (i_1156_ | i_1157_ | i_1158_) >>> 8;
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1151_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 3) {
					int i_1159_ = i_1130_;
					for (int i_1160_ = -i_1125_; i_1160_ < 0; i_1160_++) {
						int i_1161_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1162_ = -i_1124_; i_1162_ < 0; i_1162_++) {
							int i_1163_ = anIntArray10570[(i_1130_ >> 16) + i_1161_];
							int i_1164_ = i_1163_ + i_1127_;
							int i_1165_ = (i_1163_ & 0xff00ff) + (i_1127_ & 0xff00ff);
							int i_1166_ = (i_1165_ & 0x1000100) + (i_1164_ - i_1165_ & 0x10000);
							is[i_1139_++] = i_1164_ - i_1166_ | i_1166_ - (i_1166_ >>> 8);
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1159_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 2) {
					int i_1167_ = i_1127_ >>> 24;
					int i_1168_ = 256 - i_1167_;
					int i_1169_ = (i_1127_ & 0xff00ff) * i_1168_ & ~0xff00ff;
					int i_1170_ = (i_1127_ & 0xff00) * i_1168_ & 0xff0000;
					i_1127_ = (i_1169_ | i_1170_) >>> 8;
					int i_1171_ = i_1130_;
					for (int i_1172_ = -i_1125_; i_1172_ < 0; i_1172_++) {
						int i_1173_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1174_ = -i_1124_; i_1174_ < 0; i_1174_++) {
							int i_1175_ = anIntArray10570[(i_1130_ >> 16) + i_1173_];
							i_1169_ = (i_1175_ & 0xff00ff) * i_1167_ & ~0xff00ff;
							i_1170_ = (i_1175_ & 0xff00) * i_1167_ & 0xff0000;
							is[i_1139_++] = ((i_1169_ | i_1170_) >>> 8) + i_1127_;
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1171_;
						i_1139_ += i_1140_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1128_ == 1) {
				if (i_1126_ == 1) {
					int i_1176_ = i_1130_;
					for (int i_1177_ = -i_1125_; i_1177_ < 0; i_1177_++) {
						int i_1178_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1179_ = -i_1124_; i_1179_ < 0; i_1179_++) {
							int i_1180_ = anIntArray10570[(i_1130_ >> 16) + i_1178_];
							int i_1181_ = i_1180_ >>> 24;
							int i_1182_ = 256 - i_1181_;
							int i_1183_ = is[i_1139_];
							is[i_1139_++] = (((i_1180_ & 0xff00ff) * i_1181_ + (i_1183_ & 0xff00ff) * i_1182_ & ~0xff00ff) >> 8) + (((i_1180_ & ~0xff00ff) >>> 8) * i_1181_ + ((i_1183_ & ~0xff00ff) >>> 8) * i_1182_ & ~0xff00ff);
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1176_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 0) {
					int i_1184_ = i_1130_;
					if ((i_1127_ & 0xffffff) == 16777215) {
						for (int i_1185_ = -i_1125_; i_1185_ < 0; i_1185_++) {
							int i_1186_ = (i_1131_ >> 16) * anInt8893;
							for (int i_1187_ = -i_1124_; i_1187_ < 0; i_1187_++) {
								int i_1188_ = anIntArray10570[(i_1130_ >> 16) + i_1186_];
								int i_1189_ = (i_1188_ >>> 24) * (i_1127_ >>> 24) >> 8;
								int i_1190_ = 256 - i_1189_;
								int i_1191_ = is[i_1139_];
								is[i_1139_++] = ((i_1188_ & 0xff00ff) * i_1189_ + (i_1191_ & 0xff00ff) * i_1190_ & ~0xff00ff) + ((i_1188_ & 0xff00) * i_1189_ + (i_1191_ & 0xff00) * i_1190_ & 0xff0000) >> 8;
								i_1130_ += i_1135_;
							}
							i_1131_ += i_1136_;
							i_1130_ = i_1184_;
							i_1139_ += i_1140_;
						}
					} else {
						int i_1192_ = (i_1127_ & 0xff0000) >> 16;
						int i_1193_ = (i_1127_ & 0xff00) >> 8;
						int i_1194_ = i_1127_ & 0xff;
						for (int i_1195_ = -i_1125_; i_1195_ < 0; i_1195_++) {
							int i_1196_ = (i_1131_ >> 16) * anInt8893;
							for (int i_1197_ = -i_1124_; i_1197_ < 0; i_1197_++) {
								int i_1198_ = anIntArray10570[(i_1130_ >> 16) + i_1196_];
								int i_1199_ = (i_1198_ >>> 24) * (i_1127_ >>> 24) >> 8;
								int i_1200_ = 256 - i_1199_;
								if (i_1199_ != 255) {
									int i_1201_ = (i_1198_ & 0xff0000) * i_1192_ & ~0xffffff;
									int i_1202_ = (i_1198_ & 0xff00) * i_1193_ & 0xff0000;
									int i_1203_ = (i_1198_ & 0xff) * i_1194_ & 0xff00;
									i_1198_ = (i_1201_ | i_1202_ | i_1203_) >>> 8;
									int i_1204_ = is[i_1139_];
									is[i_1139_++] = ((i_1198_ & 0xff00ff) * i_1199_ + (i_1204_ & 0xff00ff) * i_1200_ & ~0xff00ff) + ((i_1198_ & 0xff00) * i_1199_ + (i_1204_ & 0xff00) * i_1200_ & 0xff0000) >> 8;
								} else {
									int i_1205_ = (i_1198_ & 0xff0000) * i_1192_ & ~0xffffff;
									int i_1206_ = (i_1198_ & 0xff00) * i_1193_ & 0xff0000;
									int i_1207_ = (i_1198_ & 0xff) * i_1194_ & 0xff00;
									is[i_1139_++] = (i_1205_ | i_1206_ | i_1207_) >>> 8;
								}
								i_1130_ += i_1135_;
							}
							i_1131_ += i_1136_;
							i_1130_ = i_1184_;
							i_1139_ += i_1140_;
						}
						return;
					}
					return;
				}
				if (i_1126_ == 3) {
					int i_1208_ = i_1130_;
					for (int i_1209_ = -i_1125_; i_1209_ < 0; i_1209_++) {
						int i_1210_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1211_ = -i_1124_; i_1211_ < 0; i_1211_++) {
							int i_1212_ = anIntArray10570[(i_1130_ >> 16) + i_1210_];
							int i_1213_ = i_1212_ + i_1127_;
							int i_1214_ = (i_1212_ & 0xff00ff) + (i_1127_ & 0xff00ff);
							int i_1215_ = (i_1214_ & 0x1000100) + (i_1213_ - i_1214_ & 0x10000);
							i_1215_ = i_1213_ - i_1215_ | i_1215_ - (i_1215_ >>> 8);
							int i_1216_ = (i_1215_ >>> 24) * (i_1127_ >>> 24) >> 8;
							int i_1217_ = 256 - i_1216_;
							if (i_1216_ != 255) {
								i_1212_ = i_1215_;
								i_1215_ = is[i_1139_];
								i_1215_ = ((i_1212_ & 0xff00ff) * i_1216_ + (i_1215_ & 0xff00ff) * i_1217_ & ~0xff00ff) + ((i_1212_ & 0xff00) * i_1216_ + (i_1215_ & 0xff00) * i_1217_ & 0xff0000) >> 8;
							}
							is[i_1139_++] = i_1215_;
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1208_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 2) {
					int i_1218_ = i_1127_ >>> 24;
					int i_1219_ = 256 - i_1218_;
					int i_1220_ = (i_1127_ & 0xff00ff) * i_1219_ & ~0xff00ff;
					int i_1221_ = (i_1127_ & 0xff00) * i_1219_ & 0xff0000;
					i_1127_ = (i_1220_ | i_1221_) >>> 8;
					int i_1222_ = i_1130_;
					for (int i_1223_ = -i_1125_; i_1223_ < 0; i_1223_++) {
						int i_1224_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1225_ = -i_1124_; i_1225_ < 0; i_1225_++) {
							int i_1226_ = anIntArray10570[(i_1130_ >> 16) + i_1224_];
							int i_1227_ = i_1226_ >>> 24;
							int i_1228_ = 256 - i_1227_;
							i_1220_ = (i_1226_ & 0xff00ff) * i_1218_ & ~0xff00ff;
							i_1221_ = (i_1226_ & 0xff00) * i_1218_ & 0xff0000;
							i_1226_ = ((i_1220_ | i_1221_) >>> 8) + i_1127_;
							int i_1229_ = is[i_1139_];
							is[i_1139_++] = ((i_1226_ & 0xff00ff) * i_1227_ + (i_1229_ & 0xff00ff) * i_1228_ & ~0xff00ff) + ((i_1226_ & 0xff00) * i_1227_ + (i_1229_ & 0xff00) * i_1228_ & 0xff0000) >> 8;
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1222_;
						i_1139_ += i_1140_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1128_ == 2) {
				if (i_1126_ == 1) {
					int i_1230_ = i_1130_;
					for (int i_1231_ = -i_1125_; i_1231_ < 0; i_1231_++) {
						int i_1232_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1233_ = -i_1124_; i_1233_ < 0; i_1233_++) {
							int i_1234_ = anIntArray10570[(i_1130_ >> 16) + i_1232_];
							if (i_1234_ != 0) {
								int i_1235_ = is[i_1139_];
								int i_1236_ = i_1234_ + i_1235_;
								int i_1237_ = (i_1234_ & 0xff00ff) + (i_1235_ & 0xff00ff);
								i_1235_ = (i_1237_ & 0x1000100) + (i_1236_ - i_1237_ & 0x10000);
								is[i_1139_++] = i_1236_ - i_1235_ | i_1235_ - (i_1235_ >>> 8);
							} else {
								i_1139_++;
							}
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1230_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 0) {
					int i_1238_ = i_1130_;
					int i_1239_ = (i_1127_ & 0xff0000) >> 16;
					int i_1240_ = (i_1127_ & 0xff00) >> 8;
					int i_1241_ = i_1127_ & 0xff;
					for (int i_1242_ = -i_1125_; i_1242_ < 0; i_1242_++) {
						int i_1243_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1244_ = -i_1124_; i_1244_ < 0; i_1244_++) {
							int i_1245_ = anIntArray10570[(i_1130_ >> 16) + i_1243_];
							if (i_1245_ != 0) {
								int i_1246_ = (i_1245_ & 0xff0000) * i_1239_ & ~0xffffff;
								int i_1247_ = (i_1245_ & 0xff00) * i_1240_ & 0xff0000;
								int i_1248_ = (i_1245_ & 0xff) * i_1241_ & 0xff00;
								i_1245_ = (i_1246_ | i_1247_ | i_1248_) >>> 8;
								int i_1249_ = is[i_1139_];
								int i_1250_ = i_1245_ + i_1249_;
								int i_1251_ = (i_1245_ & 0xff00ff) + (i_1249_ & 0xff00ff);
								i_1249_ = (i_1251_ & 0x1000100) + (i_1250_ - i_1251_ & 0x10000);
								is[i_1139_++] = i_1250_ - i_1249_ | i_1249_ - (i_1249_ >>> 8);
							} else {
								i_1139_++;
							}
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1238_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 3) {
					int i_1252_ = i_1130_;
					for (int i_1253_ = -i_1125_; i_1253_ < 0; i_1253_++) {
						int i_1254_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1255_ = -i_1124_; i_1255_ < 0; i_1255_++) {
							int i_1256_ = anIntArray10570[(i_1130_ >> 16) + i_1254_];
							int i_1257_ = i_1256_ + i_1127_;
							int i_1258_ = (i_1256_ & 0xff00ff) + (i_1127_ & 0xff00ff);
							int i_1259_ = (i_1258_ & 0x1000100) + (i_1257_ - i_1258_ & 0x10000);
							i_1256_ = i_1257_ - i_1259_ | i_1259_ - (i_1259_ >>> 8);
							i_1259_ = is[i_1139_];
							i_1257_ = i_1256_ + i_1259_;
							i_1258_ = (i_1256_ & 0xff00ff) + (i_1259_ & 0xff00ff);
							i_1259_ = (i_1258_ & 0x1000100) + (i_1257_ - i_1258_ & 0x10000);
							is[i_1139_++] = i_1257_ - i_1259_ | i_1259_ - (i_1259_ >>> 8);
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1252_;
						i_1139_ += i_1140_;
					}
					return;
				}
				if (i_1126_ == 2) {
					int i_1260_ = i_1127_ >>> 24;
					int i_1261_ = 256 - i_1260_;
					int i_1262_ = (i_1127_ & 0xff00ff) * i_1261_ & ~0xff00ff;
					int i_1263_ = (i_1127_ & 0xff00) * i_1261_ & 0xff0000;
					i_1127_ = (i_1262_ | i_1263_) >>> 8;
					int i_1264_ = i_1130_;
					for (int i_1265_ = -i_1125_; i_1265_ < 0; i_1265_++) {
						int i_1266_ = (i_1131_ >> 16) * anInt8893;
						for (int i_1267_ = -i_1124_; i_1267_ < 0; i_1267_++) {
							int i_1268_ = anIntArray10570[(i_1130_ >> 16) + i_1266_];
							if (i_1268_ != 0) {
								i_1262_ = (i_1268_ & 0xff00ff) * i_1260_ & ~0xff00ff;
								i_1263_ = (i_1268_ & 0xff00) * i_1260_ & 0xff0000;
								i_1268_ = ((i_1262_ | i_1263_) >>> 8) + i_1127_;
								int i_1269_ = is[i_1139_];
								int i_1270_ = i_1268_ + i_1269_;
								int i_1271_ = (i_1268_ & 0xff00ff) + (i_1269_ & 0xff00ff);
								i_1269_ = (i_1271_ & 0x1000100) + (i_1270_ - i_1271_ & 0x10000);
								is[i_1139_++] = i_1270_ - i_1269_ | i_1269_ - (i_1269_ >>> 8);
							} else {
								i_1139_++;
							}
							i_1130_ += i_1135_;
						}
						i_1131_ += i_1136_;
						i_1130_ = i_1264_;
						i_1139_ += i_1140_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	final void method1208(int i, int i_1272_, int i_1273_, int i_1274_, int i_1275_, int i_1276_, int i_1277_, int i_1278_, int i_1279_) {
		if (i_1274_ > 0 && i_1275_ > 0) {
			int i_1280_ = 0;
			int i_1281_ = 0;
			int i_1282_ = anInt8889 + anInt8893 + anInt8885;
			int i_1283_ = anInt8899 + anInt8897 + anInt8884;
			int i_1284_ = (i_1282_ << 16) / i_1274_;
			int i_1285_ = (i_1283_ << 16) / i_1275_;
			if (anInt8889 > 0) {
				int i_1286_ = ((anInt8889 << 16) + i_1284_ - 1) / i_1284_;
				i += i_1286_;
				i_1280_ += i_1286_ * i_1284_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_1287_ = ((anInt8899 << 16) + i_1285_ - 1) / i_1285_;
				i_1272_ += i_1287_;
				i_1281_ += i_1287_ * i_1285_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_1282_) {
				i_1274_ = ((anInt8893 << 16) - i_1280_ + i_1284_ - 1) / i_1284_;
			}
			if (anInt8897 < i_1283_) {
				i_1275_ = ((anInt8897 << 16) - i_1281_ + i_1285_ - 1) / i_1285_;
			}
			int i_1288_ = i + i_1272_ * aPureJavaToolkit8886.anInt6789;
			int i_1289_ = aPureJavaToolkit8886.anInt6789 - i_1274_;
			if (i_1272_ + i_1275_ > aPureJavaToolkit8886.anInt6772) {
				i_1275_ -= i_1272_ + i_1275_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_1272_ < aPureJavaToolkit8886.anInt6760) {
				int i_1290_ = aPureJavaToolkit8886.anInt6760 - i_1272_;
				i_1275_ -= i_1290_;
				i_1288_ += i_1290_ * aPureJavaToolkit8886.anInt6789;
				i_1281_ += i_1285_ * i_1290_;
			}
			if (i + i_1274_ > aPureJavaToolkit8886.anInt6778) {
				int i_1291_ = i + i_1274_ - aPureJavaToolkit8886.anInt6778;
				i_1274_ -= i_1291_;
				i_1289_ += i_1291_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_1292_ = aPureJavaToolkit8886.anInt6767 - i;
				i_1274_ -= i_1292_;
				i_1288_ += i_1292_;
				i_1280_ += i_1284_ * i_1292_;
				i_1289_ += i_1292_;
			}
			float[] fs = aPureJavaToolkit8886.aFloatArray6782;
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_1278_ == 0) {
				if (i_1276_ == 1) {
					int i_1293_ = i_1280_;
					for (int i_1294_ = -i_1275_; i_1294_ < 0; i_1294_++) {
						int i_1295_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1296_ = -i_1274_; i_1296_ < 0; i_1296_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								is[i_1288_] = anIntArray10570[(i_1280_ >> 16) + i_1295_];
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1293_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 0) {
					int i_1297_ = (i_1277_ & 0xff0000) >> 16;
					int i_1298_ = (i_1277_ & 0xff00) >> 8;
					int i_1299_ = i_1277_ & 0xff;
					int i_1300_ = i_1280_;
					for (int i_1301_ = -i_1275_; i_1301_ < 0; i_1301_++) {
						int i_1302_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1303_ = -i_1274_; i_1303_ < 0; i_1303_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1304_ = anIntArray10570[(i_1280_ >> 16) + i_1302_];
								int i_1305_ = (i_1304_ & 0xff0000) * i_1297_ & ~0xffffff;
								int i_1306_ = (i_1304_ & 0xff00) * i_1298_ & 0xff0000;
								int i_1307_ = (i_1304_ & 0xff) * i_1299_ & 0xff00;
								is[i_1288_] = (i_1305_ | i_1306_ | i_1307_) >>> 8;
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1300_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 3) {
					int i_1308_ = i_1280_;
					for (int i_1309_ = -i_1275_; i_1309_ < 0; i_1309_++) {
						int i_1310_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1311_ = -i_1274_; i_1311_ < 0; i_1311_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1312_ = anIntArray10570[(i_1280_ >> 16) + i_1310_];
								int i_1313_ = i_1312_ + i_1277_;
								int i_1314_ = (i_1312_ & 0xff00ff) + (i_1277_ & 0xff00ff);
								int i_1315_ = (i_1314_ & 0x1000100) + (i_1313_ - i_1314_ & 0x10000);
								is[i_1288_] = i_1313_ - i_1315_ | i_1315_ - (i_1315_ >>> 8);
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1308_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 2) {
					int i_1316_ = i_1277_ >>> 24;
					int i_1317_ = 256 - i_1316_;
					int i_1318_ = (i_1277_ & 0xff00ff) * i_1317_ & ~0xff00ff;
					int i_1319_ = (i_1277_ & 0xff00) * i_1317_ & 0xff0000;
					i_1277_ = (i_1318_ | i_1319_) >>> 8;
					int i_1320_ = i_1280_;
					for (int i_1321_ = -i_1275_; i_1321_ < 0; i_1321_++) {
						int i_1322_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1323_ = -i_1274_; i_1323_ < 0; i_1323_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1324_ = anIntArray10570[(i_1280_ >> 16) + i_1322_];
								i_1318_ = (i_1324_ & 0xff00ff) * i_1316_ & ~0xff00ff;
								i_1319_ = (i_1324_ & 0xff00) * i_1316_ & 0xff0000;
								is[i_1288_] = ((i_1318_ | i_1319_) >>> 8) + i_1277_;
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1320_;
						i_1288_ += i_1289_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1278_ == 1) {
				if (i_1276_ == 1) {
					int i_1325_ = i_1280_;
					for (int i_1326_ = -i_1275_; i_1326_ < 0; i_1326_++) {
						int i_1327_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1328_ = -i_1274_; i_1328_ < 0; i_1328_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1329_ = anIntArray10570[(i_1280_ >> 16) + i_1327_];
								int i_1330_ = i_1329_ >>> 24;
								int i_1331_ = 256 - i_1330_;
								int i_1332_ = is[i_1288_];
								is[i_1288_] = (((i_1329_ & 0xff00ff) * i_1330_ + (i_1332_ & 0xff00ff) * i_1331_ & ~0xff00ff) >> 8) + (((i_1329_ & ~0xff00ff) >>> 8) * i_1330_ + ((i_1332_ & ~0xff00ff) >>> 8) * i_1331_ & ~0xff00ff);
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1325_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 0) {
					int i_1333_ = i_1280_;
					if ((i_1277_ & 0xffffff) == 16777215) {
						for (int i_1334_ = -i_1275_; i_1334_ < 0; i_1334_++) {
							int i_1335_ = (i_1281_ >> 16) * anInt8893;
							for (int i_1336_ = -i_1274_; i_1336_ < 0; i_1336_++) {
								if ((float) i_1273_ < fs[i_1288_]) {
									int i_1337_ = anIntArray10570[(i_1280_ >> 16) + i_1335_];
									int i_1338_ = (i_1337_ >>> 24) * (i_1277_ >>> 24) >> 8;
									int i_1339_ = 256 - i_1338_;
									int i_1340_ = is[i_1288_];
									is[i_1288_] = ((i_1337_ & 0xff00ff) * i_1338_ + (i_1340_ & 0xff00ff) * i_1339_ & ~0xff00ff) + ((i_1337_ & 0xff00) * i_1338_ + (i_1340_ & 0xff00) * i_1339_ & 0xff0000) >> 8;
									fs[i_1288_] = (float) i_1273_;
								}
								i_1280_ += i_1284_;
								i_1288_++;
							}
							i_1281_ += i_1285_;
							i_1280_ = i_1333_;
							i_1288_ += i_1289_;
						}
					} else {
						int i_1341_ = (i_1277_ & 0xff0000) >> 16;
						int i_1342_ = (i_1277_ & 0xff00) >> 8;
						int i_1343_ = i_1277_ & 0xff;
						for (int i_1344_ = -i_1275_; i_1344_ < 0; i_1344_++) {
							int i_1345_ = (i_1281_ >> 16) * anInt8893;
							for (int i_1346_ = -i_1274_; i_1346_ < 0; i_1346_++) {
								if ((float) i_1273_ < fs[i_1288_]) {
									int i_1347_ = anIntArray10570[(i_1280_ >> 16) + i_1345_];
									int i_1348_ = (i_1347_ >>> 24) * (i_1277_ >>> 24) >> 8;
									int i_1349_ = 256 - i_1348_;
									if (i_1348_ != 255) {
										int i_1350_ = (i_1347_ & 0xff0000) * i_1341_ & ~0xffffff;
										int i_1351_ = (i_1347_ & 0xff00) * i_1342_ & 0xff0000;
										int i_1352_ = (i_1347_ & 0xff) * i_1343_ & 0xff00;
										i_1347_ = (i_1350_ | i_1351_ | i_1352_) >>> 8;
										int i_1353_ = is[i_1288_];
										is[i_1288_] = ((i_1347_ & 0xff00ff) * i_1348_ + (i_1353_ & 0xff00ff) * i_1349_ & ~0xff00ff) + ((i_1347_ & 0xff00) * i_1348_ + (i_1353_ & 0xff00) * i_1349_ & 0xff0000) >> 8;
										fs[i_1288_] = (float) i_1273_;
									} else {
										int i_1354_ = (i_1347_ & 0xff0000) * i_1341_ & ~0xffffff;
										int i_1355_ = (i_1347_ & 0xff00) * i_1342_ & 0xff0000;
										int i_1356_ = (i_1347_ & 0xff) * i_1343_ & 0xff00;
										is[i_1288_] = (i_1354_ | i_1355_ | i_1356_) >>> 8;
										fs[i_1288_] = (float) i_1273_;
									}
								}
								i_1280_ += i_1284_;
								i_1288_++;
							}
							i_1281_ += i_1285_;
							i_1280_ = i_1333_;
							i_1288_ += i_1289_;
						}
						return;
					}
					return;
				}
				if (i_1276_ == 3) {
					int i_1357_ = i_1280_;
					for (int i_1358_ = -i_1275_; i_1358_ < 0; i_1358_++) {
						int i_1359_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1360_ = -i_1274_; i_1360_ < 0; i_1360_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1361_ = anIntArray10570[(i_1280_ >> 16) + i_1359_];
								int i_1362_ = i_1361_ + i_1277_;
								int i_1363_ = (i_1361_ & 0xff00ff) + (i_1277_ & 0xff00ff);
								int i_1364_ = (i_1363_ & 0x1000100) + (i_1362_ - i_1363_ & 0x10000);
								i_1364_ = i_1362_ - i_1364_ | i_1364_ - (i_1364_ >>> 8);
								int i_1365_ = (i_1364_ >>> 24) * (i_1277_ >>> 24) >> 8;
								int i_1366_ = 256 - i_1365_;
								if (i_1365_ != 255) {
									i_1361_ = i_1364_;
									i_1364_ = is[i_1288_];
									i_1364_ = ((i_1361_ & 0xff00ff) * i_1365_ + (i_1364_ & 0xff00ff) * i_1366_ & ~0xff00ff) + ((i_1361_ & 0xff00) * i_1365_ + (i_1364_ & 0xff00) * i_1366_ & 0xff0000) >> 8;
								}
								is[i_1288_] = i_1364_;
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1357_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 2) {
					int i_1367_ = i_1277_ >>> 24;
					int i_1368_ = 256 - i_1367_;
					int i_1369_ = (i_1277_ & 0xff00ff) * i_1368_ & ~0xff00ff;
					int i_1370_ = (i_1277_ & 0xff00) * i_1368_ & 0xff0000;
					i_1277_ = (i_1369_ | i_1370_) >>> 8;
					int i_1371_ = i_1280_;
					for (int i_1372_ = -i_1275_; i_1372_ < 0; i_1372_++) {
						int i_1373_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1374_ = -i_1274_; i_1374_ < 0; i_1374_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1375_ = anIntArray10570[(i_1280_ >> 16) + i_1373_];
								int i_1376_ = i_1375_ >>> 24;
								int i_1377_ = 256 - i_1376_;
								i_1369_ = (i_1375_ & 0xff00ff) * i_1367_ & ~0xff00ff;
								i_1370_ = (i_1375_ & 0xff00) * i_1367_ & 0xff0000;
								i_1375_ = ((i_1369_ | i_1370_) >>> 8) + i_1277_;
								int i_1378_ = is[i_1288_];
								is[i_1288_] = ((i_1375_ & 0xff00ff) * i_1376_ + (i_1378_ & 0xff00ff) * i_1377_ & ~0xff00ff) + ((i_1375_ & 0xff00) * i_1376_ + (i_1378_ & 0xff00) * i_1377_ & 0xff0000) >> 8;
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1371_;
						i_1288_ += i_1289_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1278_ == 2) {
				if (i_1276_ == 1) {
					int i_1379_ = i_1280_;
					for (int i_1380_ = -i_1275_; i_1380_ < 0; i_1380_++) {
						int i_1381_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1382_ = -i_1274_; i_1382_ < 0; i_1382_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1383_ = anIntArray10570[(i_1280_ >> 16) + i_1381_];
								if (i_1383_ != 0) {
									int i_1384_ = is[i_1288_];
									int i_1385_ = i_1383_ + i_1384_;
									int i_1386_ = (i_1383_ & 0xff00ff) + (i_1384_ & 0xff00ff);
									i_1384_ = (i_1386_ & 0x1000100) + (i_1385_ - i_1386_ & 0x10000);
									is[i_1288_] = i_1385_ - i_1384_ | i_1384_ - (i_1384_ >>> 8);
									fs[i_1288_] = (float) i_1273_;
								}
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1379_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 0) {
					int i_1387_ = i_1280_;
					int i_1388_ = (i_1277_ & 0xff0000) >> 16;
					int i_1389_ = (i_1277_ & 0xff00) >> 8;
					int i_1390_ = i_1277_ & 0xff;
					for (int i_1391_ = -i_1275_; i_1391_ < 0; i_1391_++) {
						int i_1392_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1393_ = -i_1274_; i_1393_ < 0; i_1393_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1394_ = anIntArray10570[(i_1280_ >> 16) + i_1392_];
								if (i_1394_ != 0) {
									int i_1395_ = (i_1394_ & 0xff0000) * i_1388_ & ~0xffffff;
									int i_1396_ = (i_1394_ & 0xff00) * i_1389_ & 0xff0000;
									int i_1397_ = (i_1394_ & 0xff) * i_1390_ & 0xff00;
									i_1394_ = (i_1395_ | i_1396_ | i_1397_) >>> 8;
									int i_1398_ = is[i_1288_];
									int i_1399_ = i_1394_ + i_1398_;
									int i_1400_ = (i_1394_ & 0xff00ff) + (i_1398_ & 0xff00ff);
									i_1398_ = (i_1400_ & 0x1000100) + (i_1399_ - i_1400_ & 0x10000);
									is[i_1288_] = i_1399_ - i_1398_ | i_1398_ - (i_1398_ >>> 8);
									fs[i_1288_] = (float) i_1273_;
								}
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1387_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 3) {
					int i_1401_ = i_1280_;
					for (int i_1402_ = -i_1275_; i_1402_ < 0; i_1402_++) {
						int i_1403_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1404_ = -i_1274_; i_1404_ < 0; i_1404_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1405_ = anIntArray10570[(i_1280_ >> 16) + i_1403_];
								int i_1406_ = i_1405_ + i_1277_;
								int i_1407_ = (i_1405_ & 0xff00ff) + (i_1277_ & 0xff00ff);
								int i_1408_ = (i_1407_ & 0x1000100) + (i_1406_ - i_1407_ & 0x10000);
								i_1405_ = i_1406_ - i_1408_ | i_1408_ - (i_1408_ >>> 8);
								i_1408_ = is[i_1288_];
								i_1406_ = i_1405_ + i_1408_;
								i_1407_ = (i_1405_ & 0xff00ff) + (i_1408_ & 0xff00ff);
								i_1408_ = (i_1407_ & 0x1000100) + (i_1406_ - i_1407_ & 0x10000);
								is[i_1288_] = i_1406_ - i_1408_ | i_1408_ - (i_1408_ >>> 8);
								fs[i_1288_] = (float) i_1273_;
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1401_;
						i_1288_ += i_1289_;
					}
					return;
				}
				if (i_1276_ == 2) {
					int i_1409_ = i_1277_ >>> 24;
					int i_1410_ = 256 - i_1409_;
					int i_1411_ = (i_1277_ & 0xff00ff) * i_1410_ & ~0xff00ff;
					int i_1412_ = (i_1277_ & 0xff00) * i_1410_ & 0xff0000;
					i_1277_ = (i_1411_ | i_1412_) >>> 8;
					int i_1413_ = i_1280_;
					for (int i_1414_ = -i_1275_; i_1414_ < 0; i_1414_++) {
						int i_1415_ = (i_1281_ >> 16) * anInt8893;
						for (int i_1416_ = -i_1274_; i_1416_ < 0; i_1416_++) {
							if ((float) i_1273_ < fs[i_1288_]) {
								int i_1417_ = anIntArray10570[(i_1280_ >> 16) + i_1415_];
								if (i_1417_ != 0) {
									i_1411_ = (i_1417_ & 0xff00ff) * i_1409_ & ~0xff00ff;
									i_1412_ = (i_1417_ & 0xff00) * i_1409_ & 0xff0000;
									i_1417_ = ((i_1411_ | i_1412_) >>> 8) + i_1277_;
									int i_1418_ = is[i_1288_];
									int i_1419_ = i_1417_ + i_1418_;
									int i_1420_ = (i_1417_ & 0xff00ff) + (i_1418_ & 0xff00ff);
									i_1418_ = (i_1420_ & 0x1000100) + (i_1419_ - i_1420_ & 0x10000);
									is[i_1288_] = i_1419_ - i_1418_ | i_1418_ - (i_1418_ >>> 8);
									fs[i_1288_] = (float) i_1273_;
								}
							}
							i_1280_ += i_1284_;
							i_1288_++;
						}
						i_1281_ += i_1285_;
						i_1280_ = i_1413_;
						i_1288_ += i_1289_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	GLSprite_Sub2_Sub2(PureJavaToolkit purejavatoolkit, int[] is, int i, int i_1421_) {
		super(purejavatoolkit, i, i_1421_);
		anIntArray10570 = is;
	}
}
