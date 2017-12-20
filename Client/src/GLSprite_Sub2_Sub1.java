/* GLSprite_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GLSprite_Sub2_Sub1 extends GLSprite_Sub2
{
	protected int[] anIntArray10569;
	
	final void method1195(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int[] is = aPureJavaToolkit8886.anIntArray6787;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * anInt8893 + i;
			int i_7_ = (i_4_ + i_5_) * aPureJavaToolkit8886.anInt6789 + i_3_;
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
				anIntArray10569[i_6_ + i_8_] = is[i_7_ + i_8_];
		}
	}
	
	final void method1207(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		if (i_11_ > 0 && i_12_ > 0) {
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = anInt8889 + anInt8893 + anInt8885;
			int i_20_ = anInt8899 + anInt8897 + anInt8884;
			int i_21_ = (i_19_ << 16) / i_11_;
			int i_22_ = (i_20_ << 16) / i_12_;
			if (anInt8889 > 0) {
				int i_23_ = ((anInt8889 << 16) + i_21_ - 1) / i_21_;
				i += i_23_;
				i_17_ += i_23_ * i_21_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_24_ = ((anInt8899 << 16) + i_22_ - 1) / i_22_;
				i_9_ += i_24_;
				i_18_ += i_24_ * i_22_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_19_) {
				i_11_ = ((anInt8893 << 16) - i_17_ + i_21_ - 1) / i_21_;
			}
			if (anInt8897 < i_20_) {
				i_12_ = ((anInt8897 << 16) - i_18_ + i_22_ - 1) / i_22_;
			}
			int i_25_ = i + i_9_ * aPureJavaToolkit8886.anInt6789;
			int i_26_ = aPureJavaToolkit8886.anInt6789 - i_11_;
			if (i_9_ + i_12_ > aPureJavaToolkit8886.anInt6772) {
				i_12_ -= i_9_ + i_12_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_9_ < aPureJavaToolkit8886.anInt6760) {
				int i_27_ = aPureJavaToolkit8886.anInt6760 - i_9_;
				i_12_ -= i_27_;
				i_25_ += i_27_ * aPureJavaToolkit8886.anInt6789;
				i_18_ += i_22_ * i_27_;
			}
			if (i + i_11_ > aPureJavaToolkit8886.anInt6778) {
				int i_28_ = i + i_11_ - aPureJavaToolkit8886.anInt6778;
				i_11_ -= i_28_;
				i_26_ += i_28_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_29_ = aPureJavaToolkit8886.anInt6767 - i;
				i_11_ -= i_29_;
				i_25_ += i_29_;
				i_17_ += i_21_ * i_29_;
				i_26_ += i_29_;
			}
			float[] fs = aPureJavaToolkit8886.aFloatArray6782;
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_15_ == 0) {
				if (i_13_ == 1) {
					int i_30_ = i_17_;
					for (int i_31_ = -i_12_; i_31_ < 0; i_31_++) {
						int i_32_ = (i_18_ >> 16) * anInt8893;
						for (int i_33_ = -i_11_; i_33_ < 0; i_33_++) {
							if ((float) i_10_ < fs[i_25_]) {
								is[i_25_] = anIntArray10569[(i_17_ >> 16) + i_32_];
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_30_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 0) {
					int i_34_ = (i_14_ & 0xff0000) >> 16;
					int i_35_ = (i_14_ & 0xff00) >> 8;
					int i_36_ = i_14_ & 0xff;
					int i_37_ = i_17_;
					for (int i_38_ = -i_12_; i_38_ < 0; i_38_++) {
						int i_39_ = (i_18_ >> 16) * anInt8893;
						for (int i_40_ = -i_11_; i_40_ < 0; i_40_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_41_ = anIntArray10569[(i_17_ >> 16) + i_39_];
								int i_42_ = (i_41_ & 0xff0000) * i_34_ & ~0xffffff;
								int i_43_ = (i_41_ & 0xff00) * i_35_ & 0xff0000;
								int i_44_ = (i_41_ & 0xff) * i_36_ & 0xff00;
								is[i_25_] = (i_42_ | i_43_ | i_44_) >>> 8;
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_37_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 3) {
					int i_45_ = i_17_;
					for (int i_46_ = -i_12_; i_46_ < 0; i_46_++) {
						int i_47_ = (i_18_ >> 16) * anInt8893;
						for (int i_48_ = -i_11_; i_48_ < 0; i_48_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_49_ = anIntArray10569[(i_17_ >> 16) + i_47_];
								int i_50_ = i_49_ + i_14_;
								int i_51_ = (i_49_ & 0xff00ff) + (i_14_ & 0xff00ff);
								int i_52_ = (i_51_ & 0x1000100) + (i_50_ - i_51_ & 0x10000);
								is[i_25_] = i_50_ - i_52_ | i_52_ - (i_52_ >>> 8);
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_45_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 2) {
					int i_53_ = i_14_ >>> 24;
					int i_54_ = 256 - i_53_;
					int i_55_ = (i_14_ & 0xff00ff) * i_54_ & ~0xff00ff;
					int i_56_ = (i_14_ & 0xff00) * i_54_ & 0xff0000;
					i_14_ = (i_55_ | i_56_) >>> 8;
					int i_57_ = i_17_;
					for (int i_58_ = -i_12_; i_58_ < 0; i_58_++) {
						int i_59_ = (i_18_ >> 16) * anInt8893;
						for (int i_60_ = -i_11_; i_60_ < 0; i_60_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_61_ = anIntArray10569[(i_17_ >> 16) + i_59_];
								i_55_ = (i_61_ & 0xff00ff) * i_53_ & ~0xff00ff;
								i_56_ = (i_61_ & 0xff00) * i_53_ & 0xff0000;
								is[i_25_] = ((i_55_ | i_56_) >>> 8) + i_14_;
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_57_;
						i_25_ += i_26_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_15_ == 1) {
				if (i_13_ == 1) {
					int i_62_ = i_17_;
					for (int i_63_ = -i_12_; i_63_ < 0; i_63_++) {
						int i_64_ = (i_18_ >> 16) * anInt8893;
						for (int i_65_ = -i_11_; i_65_ < 0; i_65_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_66_ = anIntArray10569[(i_17_ >> 16) + i_64_];
								if (i_66_ != 0) {
									is[i_25_] = i_66_;
									fs[i_25_] = (float) i_10_;
								}
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_62_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 0) {
					int i_67_ = i_17_;
					if ((i_14_ & 0xffffff) == 16777215) {
						int i_68_ = i_14_ >>> 24;
						int i_69_ = 256 - i_68_;
						for (int i_70_ = -i_12_; i_70_ < 0; i_70_++) {
							int i_71_ = (i_18_ >> 16) * anInt8893;
							for (int i_72_ = -i_11_; i_72_ < 0; i_72_++) {
								if ((float) i_10_ < fs[i_25_]) {
									int i_73_ = anIntArray10569[(i_17_ >> 16) + i_71_];
									if (i_73_ != 0) {
										int i_74_ = is[i_25_];
										is[i_25_] = ((i_73_ & 0xff00ff) * i_68_ + (i_74_ & 0xff00ff) * i_69_ & ~0xff00ff) + ((i_73_ & 0xff00) * i_68_ + (i_74_ & 0xff00) * i_69_ & 0xff0000) >> 8;
										fs[i_25_] = (float) i_10_;
									}
								}
								i_17_ += i_21_;
								i_25_++;
							}
							i_18_ += i_22_;
							i_17_ = i_67_;
							i_25_ += i_26_;
						}
					} else {
						int i_75_ = (i_14_ & 0xff0000) >> 16;
						int i_76_ = (i_14_ & 0xff00) >> 8;
						int i_77_ = i_14_ & 0xff;
						int i_78_ = i_14_ >>> 24;
						int i_79_ = 256 - i_78_;
						for (int i_80_ = -i_12_; i_80_ < 0; i_80_++) {
							int i_81_ = (i_18_ >> 16) * anInt8893;
							for (int i_82_ = -i_11_; i_82_ < 0; i_82_++) {
								if ((float) i_10_ < fs[i_25_]) {
									int i_83_ = anIntArray10569[(i_17_ >> 16) + i_81_];
									if (i_83_ != 0) {
										if (i_78_ != 255) {
											int i_84_ = (i_83_ & 0xff0000) * i_75_ & ~0xffffff;
											int i_85_ = (i_83_ & 0xff00) * i_76_ & 0xff0000;
											int i_86_ = (i_83_ & 0xff) * i_77_ & 0xff00;
											i_83_ = (i_84_ | i_85_ | i_86_) >>> 8;
											int i_87_ = is[i_25_];
											is[i_25_] = ((i_83_ & 0xff00ff) * i_78_ + (i_87_ & 0xff00ff) * i_79_ & ~0xff00ff) + ((i_83_ & 0xff00) * i_78_ + (i_87_ & 0xff00) * i_79_ & 0xff0000) >> 8;
											fs[i_25_] = (float) i_10_;
										} else {
											int i_88_ = (i_83_ & 0xff0000) * i_75_ & ~0xffffff;
											int i_89_ = (i_83_ & 0xff00) * i_76_ & 0xff0000;
											int i_90_ = (i_83_ & 0xff) * i_77_ & 0xff00;
											is[i_25_] = (i_88_ | i_89_ | i_90_) >>> 8;
											fs[i_25_] = (float) i_10_;
										}
									}
								}
								i_17_ += i_21_;
								i_25_++;
							}
							i_18_ += i_22_;
							i_17_ = i_67_;
							i_25_ += i_26_;
						}
						return;
					}
					return;
				}
				if (i_13_ == 3) {
					int i_91_ = i_17_;
					int i_92_ = i_14_ >>> 24;
					int i_93_ = 256 - i_92_;
					for (int i_94_ = -i_12_; i_94_ < 0; i_94_++) {
						int i_95_ = (i_18_ >> 16) * anInt8893;
						for (int i_96_ = -i_11_; i_96_ < 0; i_96_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_97_ = anIntArray10569[(i_17_ >> 16) + i_95_];
								int i_98_ = i_97_ + i_14_;
								int i_99_ = (i_97_ & 0xff00ff) + (i_14_ & 0xff00ff);
								int i_100_ = (i_99_ & 0x1000100) + (i_98_ - i_99_ & 0x10000);
								i_100_ = i_98_ - i_100_ | i_100_ - (i_100_ >>> 8);
								if (i_97_ == 0 && i_92_ != 255) {
									i_97_ = i_100_;
									i_100_ = is[i_25_];
									i_100_ = ((i_97_ & 0xff00ff) * i_92_ + (i_100_ & 0xff00ff) * i_93_ & ~0xff00ff) + ((i_97_ & 0xff00) * i_92_ + (i_100_ & 0xff00) * i_93_ & 0xff0000) >> 8;
								}
								is[i_25_] = i_100_;
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_91_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 2) {
					int i_101_ = i_14_ >>> 24;
					int i_102_ = 256 - i_101_;
					int i_103_ = (i_14_ & 0xff00ff) * i_102_ & ~0xff00ff;
					int i_104_ = (i_14_ & 0xff00) * i_102_ & 0xff0000;
					i_14_ = (i_103_ | i_104_) >>> 8;
					int i_105_ = i_17_;
					for (int i_106_ = -i_12_; i_106_ < 0; i_106_++) {
						int i_107_ = (i_18_ >> 16) * anInt8893;
						for (int i_108_ = -i_11_; i_108_ < 0; i_108_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_109_ = anIntArray10569[(i_17_ >> 16) + i_107_];
								if (i_109_ != 0) {
									i_103_ = (i_109_ & 0xff00ff) * i_101_ & ~0xff00ff;
									i_104_ = (i_109_ & 0xff00) * i_101_ & 0xff0000;
									is[i_25_] = ((i_103_ | i_104_) >>> 8) + i_14_;
									fs[i_25_] = (float) i_10_;
								}
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_105_;
						i_25_ += i_26_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_15_ == 2) {
				if (i_13_ == 1) {
					int i_110_ = i_17_;
					for (int i_111_ = -i_12_; i_111_ < 0; i_111_++) {
						int i_112_ = (i_18_ >> 16) * anInt8893;
						for (int i_113_ = -i_11_; i_113_ < 0; i_113_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_114_ = anIntArray10569[(i_17_ >> 16) + i_112_];
								if (i_114_ != 0) {
									int i_115_ = is[i_25_];
									int i_116_ = i_114_ + i_115_;
									int i_117_ = (i_114_ & 0xff00ff) + (i_115_ & 0xff00ff);
									i_115_ = (i_117_ & 0x1000100) + (i_116_ - i_117_ & 0x10000);
									is[i_25_] = i_116_ - i_115_ | i_115_ - (i_115_ >>> 8);
									fs[i_25_] = (float) i_10_;
								}
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_110_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 0) {
					int i_118_ = i_17_;
					int i_119_ = (i_14_ & 0xff0000) >> 16;
					int i_120_ = (i_14_ & 0xff00) >> 8;
					int i_121_ = i_14_ & 0xff;
					for (int i_122_ = -i_12_; i_122_ < 0; i_122_++) {
						int i_123_ = (i_18_ >> 16) * anInt8893;
						for (int i_124_ = -i_11_; i_124_ < 0; i_124_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_125_ = anIntArray10569[(i_17_ >> 16) + i_123_];
								if (i_125_ != 0) {
									int i_126_ = (i_125_ & 0xff0000) * i_119_ & ~0xffffff;
									int i_127_ = (i_125_ & 0xff00) * i_120_ & 0xff0000;
									int i_128_ = (i_125_ & 0xff) * i_121_ & 0xff00;
									i_125_ = (i_126_ | i_127_ | i_128_) >>> 8;
									int i_129_ = is[i_25_];
									int i_130_ = i_125_ + i_129_;
									int i_131_ = (i_125_ & 0xff00ff) + (i_129_ & 0xff00ff);
									i_129_ = (i_131_ & 0x1000100) + (i_130_ - i_131_ & 0x10000);
									is[i_25_] = i_130_ - i_129_ | i_129_ - (i_129_ >>> 8);
									fs[i_25_] = (float) i_10_;
								}
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_118_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 3) {
					int i_132_ = i_17_;
					for (int i_133_ = -i_12_; i_133_ < 0; i_133_++) {
						int i_134_ = (i_18_ >> 16) * anInt8893;
						for (int i_135_ = -i_11_; i_135_ < 0; i_135_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_136_ = anIntArray10569[(i_17_ >> 16) + i_134_];
								int i_137_ = i_136_ + i_14_;
								int i_138_ = (i_136_ & 0xff00ff) + (i_14_ & 0xff00ff);
								int i_139_ = (i_138_ & 0x1000100) + (i_137_ - i_138_ & 0x10000);
								i_136_ = i_137_ - i_139_ | i_139_ - (i_139_ >>> 8);
								i_139_ = is[i_25_];
								i_137_ = i_136_ + i_139_;
								i_138_ = (i_136_ & 0xff00ff) + (i_139_ & 0xff00ff);
								i_139_ = (i_138_ & 0x1000100) + (i_137_ - i_138_ & 0x10000);
								is[i_25_] = i_137_ - i_139_ | i_139_ - (i_139_ >>> 8);
								fs[i_25_] = (float) i_10_;
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_132_;
						i_25_ += i_26_;
					}
					return;
				}
				if (i_13_ == 2) {
					int i_140_ = i_14_ >>> 24;
					int i_141_ = 256 - i_140_;
					int i_142_ = (i_14_ & 0xff00ff) * i_141_ & ~0xff00ff;
					int i_143_ = (i_14_ & 0xff00) * i_141_ & 0xff0000;
					i_14_ = (i_142_ | i_143_) >>> 8;
					int i_144_ = i_17_;
					for (int i_145_ = -i_12_; i_145_ < 0; i_145_++) {
						int i_146_ = (i_18_ >> 16) * anInt8893;
						for (int i_147_ = -i_11_; i_147_ < 0; i_147_++) {
							if ((float) i_10_ < fs[i_25_]) {
								int i_148_ = anIntArray10569[(i_17_ >> 16) + i_146_];
								if (i_148_ != 0) {
									i_142_ = (i_148_ & 0xff00ff) * i_140_ & ~0xff00ff;
									i_143_ = (i_148_ & 0xff00) * i_140_ & 0xff0000;
									i_148_ = ((i_142_ | i_143_) >>> 8) + i_14_;
									int i_149_ = is[i_25_];
									int i_150_ = i_148_ + i_149_;
									int i_151_ = (i_148_ & 0xff00ff) + (i_149_ & 0xff00ff);
									i_149_ = (i_151_ & 0x1000100) + (i_150_ - i_151_ & 0x10000);
									is[i_25_] = i_150_ - i_149_ | i_149_ - (i_149_ >>> 8);
									fs[i_25_] = (float) i_10_;
								}
							}
							i_17_ += i_21_;
							i_25_++;
						}
						i_18_ += i_22_;
						i_17_ = i_144_;
						i_25_ += i_26_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	final void method1190(int i, int i_152_, int i_153_) {
		throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
	}
	
	final void method1208(int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_) {
		if (i_156_ > 0 && i_157_ > 0) {
			int i_162_ = 0;
			int i_163_ = 0;
			int i_164_ = anInt8889 + anInt8893 + anInt8885;
			int i_165_ = anInt8899 + anInt8897 + anInt8884;
			int i_166_ = (i_164_ << 16) / i_156_;
			int i_167_ = (i_165_ << 16) / i_157_;
			if (anInt8889 > 0) {
				int i_168_ = ((anInt8889 << 16) + i_166_ - 1) / i_166_;
				i += i_168_;
				i_162_ += i_168_ * i_166_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_169_ = ((anInt8899 << 16) + i_167_ - 1) / i_167_;
				i_154_ += i_169_;
				i_163_ += i_169_ * i_167_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_164_) {
				i_156_ = ((anInt8893 << 16) - i_162_ + i_166_ - 1) / i_166_;
			}
			if (anInt8897 < i_165_) {
				i_157_ = ((anInt8897 << 16) - i_163_ + i_167_ - 1) / i_167_;
			}
			int i_170_ = i + i_154_ * aPureJavaToolkit8886.anInt6789;
			int i_171_ = aPureJavaToolkit8886.anInt6789 - i_156_;
			if (i_154_ + i_157_ > aPureJavaToolkit8886.anInt6772) {
				i_157_ -= i_154_ + i_157_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_154_ < aPureJavaToolkit8886.anInt6760) {
				int i_172_ = aPureJavaToolkit8886.anInt6760 - i_154_;
				i_157_ -= i_172_;
				i_170_ += i_172_ * aPureJavaToolkit8886.anInt6789;
				i_163_ += i_167_ * i_172_;
			}
			if (i + i_156_ > aPureJavaToolkit8886.anInt6778) {
				int i_173_ = i + i_156_ - aPureJavaToolkit8886.anInt6778;
				i_156_ -= i_173_;
				i_171_ += i_173_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_174_ = aPureJavaToolkit8886.anInt6767 - i;
				i_156_ -= i_174_;
				i_170_ += i_174_;
				i_162_ += i_166_ * i_174_;
				i_171_ += i_174_;
			}
			float[] fs = aPureJavaToolkit8886.aFloatArray6782;
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_160_ == 0) {
				if (i_158_ == 1) {
					int i_175_ = i_162_;
					for (int i_176_ = -i_157_; i_176_ < 0; i_176_++) {
						int i_177_ = (i_163_ >> 16) * anInt8893;
						for (int i_178_ = -i_156_; i_178_ < 0; i_178_++) {
							if ((float) i_155_ < fs[i_170_]) {
								is[i_170_] = anIntArray10569[(i_162_ >> 16) + i_177_];
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_175_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 0) {
					int i_179_ = (i_159_ & 0xff0000) >> 16;
					int i_180_ = (i_159_ & 0xff00) >> 8;
					int i_181_ = i_159_ & 0xff;
					int i_182_ = i_162_;
					for (int i_183_ = -i_157_; i_183_ < 0; i_183_++) {
						int i_184_ = (i_163_ >> 16) * anInt8893;
						for (int i_185_ = -i_156_; i_185_ < 0; i_185_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_186_ = anIntArray10569[(i_162_ >> 16) + i_184_];
								int i_187_ = (i_186_ & 0xff0000) * i_179_ & ~0xffffff;
								int i_188_ = (i_186_ & 0xff00) * i_180_ & 0xff0000;
								int i_189_ = (i_186_ & 0xff) * i_181_ & 0xff00;
								is[i_170_] = (i_187_ | i_188_ | i_189_) >>> 8;
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_182_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 3) {
					int i_190_ = i_162_;
					for (int i_191_ = -i_157_; i_191_ < 0; i_191_++) {
						int i_192_ = (i_163_ >> 16) * anInt8893;
						for (int i_193_ = -i_156_; i_193_ < 0; i_193_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_194_ = anIntArray10569[(i_162_ >> 16) + i_192_];
								int i_195_ = i_194_ + i_159_;
								int i_196_ = (i_194_ & 0xff00ff) + (i_159_ & 0xff00ff);
								int i_197_ = (i_196_ & 0x1000100) + (i_195_ - i_196_ & 0x10000);
								is[i_170_] = i_195_ - i_197_ | i_197_ - (i_197_ >>> 8);
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_190_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 2) {
					int i_198_ = i_159_ >>> 24;
					int i_199_ = 256 - i_198_;
					int i_200_ = (i_159_ & 0xff00ff) * i_199_ & ~0xff00ff;
					int i_201_ = (i_159_ & 0xff00) * i_199_ & 0xff0000;
					i_159_ = (i_200_ | i_201_) >>> 8;
					int i_202_ = i_162_;
					for (int i_203_ = -i_157_; i_203_ < 0; i_203_++) {
						int i_204_ = (i_163_ >> 16) * anInt8893;
						for (int i_205_ = -i_156_; i_205_ < 0; i_205_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_206_ = anIntArray10569[(i_162_ >> 16) + i_204_];
								i_200_ = (i_206_ & 0xff00ff) * i_198_ & ~0xff00ff;
								i_201_ = (i_206_ & 0xff00) * i_198_ & 0xff0000;
								is[i_170_] = ((i_200_ | i_201_) >>> 8) + i_159_;
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_202_;
						i_170_ += i_171_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_160_ == 1) {
				if (i_158_ == 1) {
					int i_207_ = i_162_;
					for (int i_208_ = -i_157_; i_208_ < 0; i_208_++) {
						int i_209_ = (i_163_ >> 16) * anInt8893;
						for (int i_210_ = -i_156_; i_210_ < 0; i_210_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_211_ = anIntArray10569[(i_162_ >> 16) + i_209_];
								if (i_211_ != 0) {
									is[i_170_] = i_211_;
									fs[i_170_] = (float) i_155_;
								}
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_207_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 0) {
					int i_212_ = i_162_;
					if ((i_159_ & 0xffffff) == 16777215) {
						int i_213_ = i_159_ >>> 24;
						int i_214_ = 256 - i_213_;
						for (int i_215_ = -i_157_; i_215_ < 0; i_215_++) {
							int i_216_ = (i_163_ >> 16) * anInt8893;
							for (int i_217_ = -i_156_; i_217_ < 0; i_217_++) {
								if ((float) i_155_ < fs[i_170_]) {
									int i_218_ = anIntArray10569[(i_162_ >> 16) + i_216_];
									if (i_218_ != 0) {
										int i_219_ = is[i_170_];
										is[i_170_] = ((i_218_ & 0xff00ff) * i_213_ + (i_219_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_218_ & 0xff00) * i_213_ + (i_219_ & 0xff00) * i_214_ & 0xff0000) >> 8;
										fs[i_170_] = (float) i_155_;
									}
								}
								i_162_ += i_166_;
								i_170_++;
							}
							i_163_ += i_167_;
							i_162_ = i_212_;
							i_170_ += i_171_;
						}
					} else {
						int i_220_ = (i_159_ & 0xff0000) >> 16;
						int i_221_ = (i_159_ & 0xff00) >> 8;
						int i_222_ = i_159_ & 0xff;
						int i_223_ = i_159_ >>> 24;
						int i_224_ = 256 - i_223_;
						for (int i_225_ = -i_157_; i_225_ < 0; i_225_++) {
							int i_226_ = (i_163_ >> 16) * anInt8893;
							for (int i_227_ = -i_156_; i_227_ < 0; i_227_++) {
								if ((float) i_155_ < fs[i_170_]) {
									int i_228_ = anIntArray10569[(i_162_ >> 16) + i_226_];
									if (i_228_ != 0) {
										if (i_223_ != 255) {
											int i_229_ = (i_228_ & 0xff0000) * i_220_ & ~0xffffff;
											int i_230_ = (i_228_ & 0xff00) * i_221_ & 0xff0000;
											int i_231_ = (i_228_ & 0xff) * i_222_ & 0xff00;
											i_228_ = (i_229_ | i_230_ | i_231_) >>> 8;
											int i_232_ = is[i_170_];
											is[i_170_] = ((i_228_ & 0xff00ff) * i_223_ + (i_232_ & 0xff00ff) * i_224_ & ~0xff00ff) + ((i_228_ & 0xff00) * i_223_ + (i_232_ & 0xff00) * i_224_ & 0xff0000) >> 8;
											fs[i_170_] = (float) i_155_;
										} else {
											int i_233_ = (i_228_ & 0xff0000) * i_220_ & ~0xffffff;
											int i_234_ = (i_228_ & 0xff00) * i_221_ & 0xff0000;
											int i_235_ = (i_228_ & 0xff) * i_222_ & 0xff00;
											is[i_170_] = (i_233_ | i_234_ | i_235_) >>> 8;
											fs[i_170_] = (float) i_155_;
										}
									}
								}
								i_162_ += i_166_;
								i_170_++;
							}
							i_163_ += i_167_;
							i_162_ = i_212_;
							i_170_ += i_171_;
						}
						return;
					}
					return;
				}
				if (i_158_ == 3) {
					int i_236_ = i_162_;
					int i_237_ = i_159_ >>> 24;
					int i_238_ = 256 - i_237_;
					for (int i_239_ = -i_157_; i_239_ < 0; i_239_++) {
						int i_240_ = (i_163_ >> 16) * anInt8893;
						for (int i_241_ = -i_156_; i_241_ < 0; i_241_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_242_ = anIntArray10569[(i_162_ >> 16) + i_240_];
								int i_243_ = i_242_ + i_159_;
								int i_244_ = (i_242_ & 0xff00ff) + (i_159_ & 0xff00ff);
								int i_245_ = (i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000);
								i_245_ = i_243_ - i_245_ | i_245_ - (i_245_ >>> 8);
								if (i_242_ == 0 && i_237_ != 255) {
									i_242_ = i_245_;
									i_245_ = is[i_170_];
									i_245_ = ((i_242_ & 0xff00ff) * i_237_ + (i_245_ & 0xff00ff) * i_238_ & ~0xff00ff) + ((i_242_ & 0xff00) * i_237_ + (i_245_ & 0xff00) * i_238_ & 0xff0000) >> 8;
								}
								is[i_170_] = i_245_;
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_236_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 2) {
					int i_246_ = i_159_ >>> 24;
					int i_247_ = 256 - i_246_;
					int i_248_ = (i_159_ & 0xff00ff) * i_247_ & ~0xff00ff;
					int i_249_ = (i_159_ & 0xff00) * i_247_ & 0xff0000;
					i_159_ = (i_248_ | i_249_) >>> 8;
					int i_250_ = i_162_;
					for (int i_251_ = -i_157_; i_251_ < 0; i_251_++) {
						int i_252_ = (i_163_ >> 16) * anInt8893;
						for (int i_253_ = -i_156_; i_253_ < 0; i_253_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_254_ = anIntArray10569[(i_162_ >> 16) + i_252_];
								if (i_254_ != 0) {
									i_248_ = (i_254_ & 0xff00ff) * i_246_ & ~0xff00ff;
									i_249_ = (i_254_ & 0xff00) * i_246_ & 0xff0000;
									is[i_170_] = ((i_248_ | i_249_) >>> 8) + i_159_;
									fs[i_170_] = (float) i_155_;
								}
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_250_;
						i_170_ += i_171_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_160_ == 2) {
				if (i_158_ == 1) {
					int i_255_ = i_162_;
					for (int i_256_ = -i_157_; i_256_ < 0; i_256_++) {
						int i_257_ = (i_163_ >> 16) * anInt8893;
						for (int i_258_ = -i_156_; i_258_ < 0; i_258_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_259_ = anIntArray10569[(i_162_ >> 16) + i_257_];
								if (i_259_ != 0) {
									int i_260_ = is[i_170_];
									int i_261_ = i_259_ + i_260_;
									int i_262_ = (i_259_ & 0xff00ff) + (i_260_ & 0xff00ff);
									i_260_ = (i_262_ & 0x1000100) + (i_261_ - i_262_ & 0x10000);
									is[i_170_] = i_261_ - i_260_ | i_260_ - (i_260_ >>> 8);
									fs[i_170_] = (float) i_155_;
								}
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_255_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 0) {
					int i_263_ = i_162_;
					int i_264_ = (i_159_ & 0xff0000) >> 16;
					int i_265_ = (i_159_ & 0xff00) >> 8;
					int i_266_ = i_159_ & 0xff;
					for (int i_267_ = -i_157_; i_267_ < 0; i_267_++) {
						int i_268_ = (i_163_ >> 16) * anInt8893;
						for (int i_269_ = -i_156_; i_269_ < 0; i_269_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_270_ = anIntArray10569[(i_162_ >> 16) + i_268_];
								if (i_270_ != 0) {
									int i_271_ = (i_270_ & 0xff0000) * i_264_ & ~0xffffff;
									int i_272_ = (i_270_ & 0xff00) * i_265_ & 0xff0000;
									int i_273_ = (i_270_ & 0xff) * i_266_ & 0xff00;
									i_270_ = (i_271_ | i_272_ | i_273_) >>> 8;
									int i_274_ = is[i_170_];
									int i_275_ = i_270_ + i_274_;
									int i_276_ = (i_270_ & 0xff00ff) + (i_274_ & 0xff00ff);
									i_274_ = (i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000);
									is[i_170_] = i_275_ - i_274_ | i_274_ - (i_274_ >>> 8);
									fs[i_170_] = (float) i_155_;
								}
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_263_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 3) {
					int i_277_ = i_162_;
					for (int i_278_ = -i_157_; i_278_ < 0; i_278_++) {
						int i_279_ = (i_163_ >> 16) * anInt8893;
						for (int i_280_ = -i_156_; i_280_ < 0; i_280_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_281_ = anIntArray10569[(i_162_ >> 16) + i_279_];
								int i_282_ = i_281_ + i_159_;
								int i_283_ = (i_281_ & 0xff00ff) + (i_159_ & 0xff00ff);
								int i_284_ = (i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000);
								i_281_ = i_282_ - i_284_ | i_284_ - (i_284_ >>> 8);
								i_284_ = is[i_170_];
								i_282_ = i_281_ + i_284_;
								i_283_ = (i_281_ & 0xff00ff) + (i_284_ & 0xff00ff);
								i_284_ = (i_283_ & 0x1000100) + (i_282_ - i_283_ & 0x10000);
								is[i_170_] = i_282_ - i_284_ | i_284_ - (i_284_ >>> 8);
								fs[i_170_] = (float) i_155_;
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_277_;
						i_170_ += i_171_;
					}
					return;
				}
				if (i_158_ == 2) {
					int i_285_ = i_159_ >>> 24;
					int i_286_ = 256 - i_285_;
					int i_287_ = (i_159_ & 0xff00ff) * i_286_ & ~0xff00ff;
					int i_288_ = (i_159_ & 0xff00) * i_286_ & 0xff0000;
					i_159_ = (i_287_ | i_288_) >>> 8;
					int i_289_ = i_162_;
					for (int i_290_ = -i_157_; i_290_ < 0; i_290_++) {
						int i_291_ = (i_163_ >> 16) * anInt8893;
						for (int i_292_ = -i_156_; i_292_ < 0; i_292_++) {
							if ((float) i_155_ < fs[i_170_]) {
								int i_293_ = anIntArray10569[(i_162_ >> 16) + i_291_];
								if (i_293_ != 0) {
									i_287_ = (i_293_ & 0xff00ff) * i_285_ & ~0xff00ff;
									i_288_ = (i_293_ & 0xff00) * i_285_ & 0xff0000;
									i_293_ = ((i_287_ | i_288_) >>> 8) + i_159_;
									int i_294_ = is[i_170_];
									int i_295_ = i_293_ + i_294_;
									int i_296_ = (i_293_ & 0xff00ff) + (i_294_ & 0xff00ff);
									i_294_ = (i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000);
									is[i_170_] = i_295_ - i_294_ | i_294_ - (i_294_ >>> 8);
									fs[i_170_] = (float) i_155_;
								}
							}
							i_162_ += i_166_;
							i_170_++;
						}
						i_163_ += i_167_;
						i_162_ = i_289_;
						i_170_ += i_171_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	GLSprite_Sub2_Sub1(PureJavaToolkit purejavatoolkit, int[] is, int i, int i_297_) {
		super(purejavatoolkit, i, i_297_);
		anIntArray10569 = is;
	}
	
	final void method1189(int i, int i_298_, aa var_aa, int i_299_, int i_300_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		i += anInt8889;
		i_298_ += anInt8899;
		int i_301_ = 0;
		int i_302_ = aPureJavaToolkit8886.anInt6789;
		int i_303_ = anInt8893;
		int i_304_ = anInt8897;
		int i_305_ = i_302_ - i_303_;
		int i_306_ = 0;
		int i_307_ = i + i_298_ * i_302_;
		if (i_298_ < aPureJavaToolkit8886.anInt6760) {
			int i_308_ = aPureJavaToolkit8886.anInt6760 - i_298_;
			i_304_ -= i_308_;
			i_298_ = aPureJavaToolkit8886.anInt6760;
			i_301_ += i_308_ * i_303_;
			i_307_ += i_308_ * i_302_;
		}
		if (i_298_ + i_304_ > aPureJavaToolkit8886.anInt6772) {
			i_304_ -= i_298_ + i_304_ - aPureJavaToolkit8886.anInt6772;
		}
		if (i < aPureJavaToolkit8886.anInt6767) {
			int i_309_ = aPureJavaToolkit8886.anInt6767 - i;
			i_303_ -= i_309_;
			i = aPureJavaToolkit8886.anInt6767;
			i_301_ += i_309_;
			i_307_ += i_309_;
			i_306_ += i_309_;
			i_305_ += i_309_;
		}
		if (i + i_303_ > aPureJavaToolkit8886.anInt6778) {
			int i_310_ = i + i_303_ - aPureJavaToolkit8886.anInt6778;
			i_303_ -= i_310_;
			i_306_ += i_310_;
			i_305_ += i_310_;
		}
		if (i_303_ > 0 && i_304_ > 0) {
			aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			int[] is = var_aa_Sub1.anIntArray5487;
			int[] is_311_ = var_aa_Sub1.anIntArray5488;
			int[] is_312_ = aPureJavaToolkit8886.anIntArray6787;
			int i_313_ = i_298_;
			if (i_300_ > i_313_) {
				i_313_ = i_300_;
				i_307_ += (i_300_ - i_298_) * i_302_;
				i_301_ += (i_300_ - i_298_) * anInt8893;
			}
			int i_314_ = i_300_ + is.length < i_298_ + i_304_ ? i_300_ + is.length : i_298_ + i_304_;
			for (int i_315_ = i_313_; i_315_ < i_314_; i_315_++) {
				int i_316_ = is[i_315_ - i_300_] + i_299_;
				int i_317_ = is_311_[i_315_ - i_300_];
				int i_318_ = i_303_;
				if (i > i_316_) {
					int i_319_ = i - i_316_;
					if (i_319_ >= i_317_) {
						i_301_ += i_303_ + i_306_;
						i_307_ += i_303_ + i_305_;
						continue;
					}
					i_317_ -= i_319_;
				} else {
					int i_320_ = i_316_ - i;
					if (i_320_ >= i_303_) {
						i_301_ += i_303_ + i_306_;
						i_307_ += i_303_ + i_305_;
						continue;
					}
					i_301_ += i_320_;
					i_318_ -= i_320_;
					i_307_ += i_320_;
				}
				int i_321_ = 0;
				if (i_318_ < i_317_) {
					i_317_ = i_318_;
				} else {
					i_321_ = i_318_ - i_317_;
				}
				for (int i_322_ = -i_317_; i_322_ < 0; i_322_++) {
					int i_323_ = anIntArray10569[i_301_++];
					if (i_323_ != 0) {
						is_312_[i_307_++] = i_323_;
					} else {
						i_307_++;
					}
				}
				i_301_ += i_321_ + i_306_;
				i_307_ += i_321_ + i_305_;
			}
		}
	}
	
	final void method1209(int i, int i_324_) {
		int[] is = aPureJavaToolkit8886.anIntArray6787;
		if (GLSprite_Sub2.anInt8913 == 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_325_ = GLSprite_Sub2.anInt8888;
				while (i_325_ < 0) {
					int i_326_ = GLSprite_Sub2.anInt8882;
					int i_327_ = GLSprite_Sub2.anInt8901;
					int i_328_ = GLSprite_Sub2.anInt8908;
					int i_329_ = GLSprite_Sub2.anInt8894;
					if (i_327_ >= 0 && i_328_ >= 0 && i_327_ - (anInt8893 << 12) < 0 && i_328_ - (anInt8897 << 12) < 0) {
						for (/**/; i_329_ < 0; i_329_++) {
							int i_330_ = (i_328_ >> 12) * anInt8893 + (i_327_ >> 12);
							int i_331_ = i_326_++;
							int[] is_332_ = is;
							int i_333_ = i;
							int i_334_ = i_324_;
							if (i_334_ == 0) {
								if (i_333_ == 1) {
									is_332_[i_331_] = anIntArray10569[i_330_];
								} else if (i_333_ == 0) {
									int i_335_ = anIntArray10569[i_330_++];
									int i_336_ = (i_335_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_337_ = (i_335_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_338_ = (i_335_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_332_[i_331_] = (i_336_ | i_337_ | i_338_) >>> 8;
								} else if (i_333_ == 3) {
									int i_339_ = anIntArray10569[i_330_++];
									int i_340_ = GLSprite_Sub2.anInt8904;
									int i_341_ = i_339_ + i_340_;
									int i_342_ = (i_339_ & 0xff00ff) + (i_340_ & 0xff00ff);
									int i_343_ = (i_342_ & 0x1000100) + (i_341_ - i_342_ & 0x10000);
									is_332_[i_331_] = i_341_ - i_343_ | i_343_ - (i_343_ >>> 8);
								} else if (i_333_ == 2) {
									int i_344_ = anIntArray10569[i_330_];
									int i_345_ = (i_344_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_346_ = (i_344_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_332_[i_331_] = ((i_345_ | i_346_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_334_ == 1) {
								if (i_333_ == 1) {
									int i_347_ = anIntArray10569[i_330_];
									if (i_347_ != 0) {
										is_332_[i_331_] = i_347_;
									}
								} else if (i_333_ == 0) {
									int i_348_ = anIntArray10569[i_330_];
									if (i_348_ != 0) {
										if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
											int i_349_ = GLSprite_Sub2.anInt8904 >>> 24;
											int i_350_ = 256 - i_349_;
											int i_351_ = is_332_[i_331_];
											is_332_[i_331_] = ((i_348_ & 0xff00ff) * i_349_ + (i_351_ & 0xff00ff) * i_350_ & ~0xff00ff) + ((i_348_ & 0xff00) * i_349_ + (i_351_ & 0xff00) * i_350_ & 0xff0000) >> 8;
										} else if (GLSprite_Sub2.anInt8895 != 255) {
											int i_352_ = (i_348_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_353_ = (i_348_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_354_ = (i_348_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											i_348_ = (i_352_ | i_353_ | i_354_) >>> 8;
											int i_355_ = is_332_[i_331_];
											is_332_[i_331_] = ((i_348_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_355_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_348_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_355_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
										} else {
											int i_356_ = (i_348_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_357_ = (i_348_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_358_ = (i_348_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											is_332_[i_331_] = (i_356_ | i_357_ | i_358_) >>> 8;
										}
									}
								} else if (i_333_ == 3) {
									int i_359_ = anIntArray10569[i_330_];
									int i_360_ = GLSprite_Sub2.anInt8904;
									int i_361_ = i_359_ + i_360_;
									int i_362_ = (i_359_ & 0xff00ff) + (i_360_ & 0xff00ff);
									int i_363_ = (i_362_ & 0x1000100) + (i_361_ - i_362_ & 0x10000);
									i_363_ = i_361_ - i_363_ | i_363_ - (i_363_ >>> 8);
									if (i_359_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
										i_359_ = i_363_;
										i_363_ = is_332_[i_331_];
										i_363_ = ((i_359_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_363_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_359_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_363_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									}
									is_332_[i_331_] = i_363_;
								} else if (i_333_ == 2) {
									int i_364_ = anIntArray10569[i_330_];
									if (i_364_ != 0) {
										int i_365_ = (i_364_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_366_ = (i_364_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										is_332_[i_331_++] = ((i_365_ | i_366_) >>> 8) + GLSprite_Sub2.anInt8896;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_334_ == 2) {
								if (i_333_ == 1) {
									int i_367_ = anIntArray10569[i_330_];
									if (i_367_ != 0) {
										int i_368_ = is_332_[i_331_];
										int i_369_ = i_367_ + i_368_;
										int i_370_ = (i_367_ & 0xff00ff) + (i_368_ & 0xff00ff);
										i_368_ = (i_370_ & 0x1000100) + (i_369_ - i_370_ & 0x10000);
										is_332_[i_331_] = i_369_ - i_368_ | i_368_ - (i_368_ >>> 8);
									}
								} else if (i_333_ == 0) {
									int i_371_ = anIntArray10569[i_330_];
									if (i_371_ != 0) {
										int i_372_ = (i_371_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_373_ = (i_371_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_374_ = (i_371_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_371_ = (i_372_ | i_373_ | i_374_) >>> 8;
										int i_375_ = is_332_[i_331_];
										int i_376_ = i_371_ + i_375_;
										int i_377_ = (i_371_ & 0xff00ff) + (i_375_ & 0xff00ff);
										i_375_ = (i_377_ & 0x1000100) + (i_376_ - i_377_ & 0x10000);
										is_332_[i_331_] = i_376_ - i_375_ | i_375_ - (i_375_ >>> 8);
									}
								} else if (i_333_ == 3) {
									int i_378_ = anIntArray10569[i_330_];
									int i_379_ = GLSprite_Sub2.anInt8904;
									int i_380_ = i_378_ + i_379_;
									int i_381_ = (i_378_ & 0xff00ff) + (i_379_ & 0xff00ff);
									int i_382_ = (i_381_ & 0x1000100) + (i_380_ - i_381_ & 0x10000);
									i_378_ = i_380_ - i_382_ | i_382_ - (i_382_ >>> 8);
									i_382_ = is_332_[i_331_];
									i_380_ = i_378_ + i_382_;
									i_381_ = (i_378_ & 0xff00ff) + (i_382_ & 0xff00ff);
									i_382_ = (i_381_ & 0x1000100) + (i_380_ - i_381_ & 0x10000);
									is_332_[i_331_] = i_380_ - i_382_ | i_382_ - (i_382_ >>> 8);
								} else if (i_333_ == 2) {
									int i_383_ = anIntArray10569[i_330_];
									if (i_383_ != 0) {
										int i_384_ = (i_383_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_385_ = (i_383_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										i_383_ = ((i_384_ | i_385_) >>> 8) + GLSprite_Sub2.anInt8896;
										int i_386_ = is_332_[i_331_];
										int i_387_ = i_383_ + i_386_;
										int i_388_ = (i_383_ & 0xff00ff) + (i_386_ & 0xff00ff);
										i_386_ = (i_388_ & 0x1000100) + (i_387_ - i_388_ & 0x10000);
										is_332_[i_331_] = i_387_ - i_386_ | i_386_ - (i_386_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
						}
					}
					i_325_++;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_389_ = GLSprite_Sub2.anInt8888;
				while (i_389_ < 0) {
					int i_390_ = GLSprite_Sub2.anInt8882;
					int i_391_ = GLSprite_Sub2.anInt8901;
					int i_392_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_393_ = GLSprite_Sub2.anInt8894;
					if (i_391_ >= 0 && i_391_ - (anInt8893 << 12) < 0) {
						int i_394_;
						if ((i_394_ = i_392_ - (anInt8897 << 12)) >= 0) {
							i_394_ = (GLSprite_Sub2.anInt8900 - i_394_) / GLSprite_Sub2.anInt8900;
							i_393_ += i_394_;
							i_392_ += GLSprite_Sub2.anInt8900 * i_394_;
							i_390_ += i_394_;
						}
						if ((i_394_ = (i_392_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_393_) {
							i_393_ = i_394_;
						}
						for (/**/; i_393_ < 0; i_393_++) {
							int i_395_ = (i_392_ >> 12) * anInt8893 + (i_391_ >> 12);
							int i_396_ = i_390_++;
							int[] is_397_ = is;
							int i_398_ = i;
							int i_399_ = i_324_;
							if (i_399_ == 0) {
								if (i_398_ == 1) {
									is_397_[i_396_] = anIntArray10569[i_395_];
								} else if (i_398_ == 0) {
									int i_400_ = anIntArray10569[i_395_++];
									int i_401_ = (i_400_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_402_ = (i_400_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_403_ = (i_400_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_397_[i_396_] = (i_401_ | i_402_ | i_403_) >>> 8;
								} else if (i_398_ == 3) {
									int i_404_ = anIntArray10569[i_395_++];
									int i_405_ = GLSprite_Sub2.anInt8904;
									int i_406_ = i_404_ + i_405_;
									int i_407_ = (i_404_ & 0xff00ff) + (i_405_ & 0xff00ff);
									int i_408_ = (i_407_ & 0x1000100) + (i_406_ - i_407_ & 0x10000);
									is_397_[i_396_] = i_406_ - i_408_ | i_408_ - (i_408_ >>> 8);
								} else if (i_398_ == 2) {
									int i_409_ = anIntArray10569[i_395_];
									int i_410_ = (i_409_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_411_ = (i_409_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_397_[i_396_] = ((i_410_ | i_411_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_399_ == 1) {
								if (i_398_ == 1) {
									int i_412_ = anIntArray10569[i_395_];
									if (i_412_ != 0) {
										is_397_[i_396_] = i_412_;
									}
								} else if (i_398_ == 0) {
									int i_413_ = anIntArray10569[i_395_];
									if (i_413_ != 0) {
										if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
											int i_414_ = GLSprite_Sub2.anInt8904 >>> 24;
											int i_415_ = 256 - i_414_;
											int i_416_ = is_397_[i_396_];
											is_397_[i_396_] = ((i_413_ & 0xff00ff) * i_414_ + (i_416_ & 0xff00ff) * i_415_ & ~0xff00ff) + ((i_413_ & 0xff00) * i_414_ + (i_416_ & 0xff00) * i_415_ & 0xff0000) >> 8;
										} else if (GLSprite_Sub2.anInt8895 != 255) {
											int i_417_ = (i_413_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_418_ = (i_413_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_419_ = (i_413_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											i_413_ = (i_417_ | i_418_ | i_419_) >>> 8;
											int i_420_ = is_397_[i_396_];
											is_397_[i_396_] = ((i_413_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_420_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_413_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_420_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
										} else {
											int i_421_ = (i_413_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_422_ = (i_413_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_423_ = (i_413_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											is_397_[i_396_] = (i_421_ | i_422_ | i_423_) >>> 8;
										}
									}
								} else if (i_398_ == 3) {
									int i_424_ = anIntArray10569[i_395_];
									int i_425_ = GLSprite_Sub2.anInt8904;
									int i_426_ = i_424_ + i_425_;
									int i_427_ = (i_424_ & 0xff00ff) + (i_425_ & 0xff00ff);
									int i_428_ = (i_427_ & 0x1000100) + (i_426_ - i_427_ & 0x10000);
									i_428_ = i_426_ - i_428_ | i_428_ - (i_428_ >>> 8);
									if (i_424_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
										i_424_ = i_428_;
										i_428_ = is_397_[i_396_];
										i_428_ = ((i_424_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_428_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_424_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_428_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									}
									is_397_[i_396_] = i_428_;
								} else if (i_398_ == 2) {
									int i_429_ = anIntArray10569[i_395_];
									if (i_429_ != 0) {
										int i_430_ = (i_429_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_431_ = (i_429_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										is_397_[i_396_++] = ((i_430_ | i_431_) >>> 8) + GLSprite_Sub2.anInt8896;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_399_ == 2) {
								if (i_398_ == 1) {
									int i_432_ = anIntArray10569[i_395_];
									if (i_432_ != 0) {
										int i_433_ = is_397_[i_396_];
										int i_434_ = i_432_ + i_433_;
										int i_435_ = (i_432_ & 0xff00ff) + (i_433_ & 0xff00ff);
										i_433_ = (i_435_ & 0x1000100) + (i_434_ - i_435_ & 0x10000);
										is_397_[i_396_] = i_434_ - i_433_ | i_433_ - (i_433_ >>> 8);
									}
								} else if (i_398_ == 0) {
									int i_436_ = anIntArray10569[i_395_];
									if (i_436_ != 0) {
										int i_437_ = (i_436_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_438_ = (i_436_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_439_ = (i_436_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_436_ = (i_437_ | i_438_ | i_439_) >>> 8;
										int i_440_ = is_397_[i_396_];
										int i_441_ = i_436_ + i_440_;
										int i_442_ = (i_436_ & 0xff00ff) + (i_440_ & 0xff00ff);
										i_440_ = (i_442_ & 0x1000100) + (i_441_ - i_442_ & 0x10000);
										is_397_[i_396_] = i_441_ - i_440_ | i_440_ - (i_440_ >>> 8);
									}
								} else if (i_398_ == 3) {
									int i_443_ = anIntArray10569[i_395_];
									int i_444_ = GLSprite_Sub2.anInt8904;
									int i_445_ = i_443_ + i_444_;
									int i_446_ = (i_443_ & 0xff00ff) + (i_444_ & 0xff00ff);
									int i_447_ = (i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000);
									i_443_ = i_445_ - i_447_ | i_447_ - (i_447_ >>> 8);
									i_447_ = is_397_[i_396_];
									i_445_ = i_443_ + i_447_;
									i_446_ = (i_443_ & 0xff00ff) + (i_447_ & 0xff00ff);
									i_447_ = (i_446_ & 0x1000100) + (i_445_ - i_446_ & 0x10000);
									is_397_[i_396_] = i_445_ - i_447_ | i_447_ - (i_447_ >>> 8);
								} else if (i_398_ == 2) {
									int i_448_ = anIntArray10569[i_395_];
									if (i_448_ != 0) {
										int i_449_ = (i_448_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_450_ = (i_448_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										i_448_ = ((i_449_ | i_450_) >>> 8) + GLSprite_Sub2.anInt8896;
										int i_451_ = is_397_[i_396_];
										int i_452_ = i_448_ + i_451_;
										int i_453_ = (i_448_ & 0xff00ff) + (i_451_ & 0xff00ff);
										i_451_ = (i_453_ & 0x1000100) + (i_452_ - i_453_ & 0x10000);
										is_397_[i_396_] = i_452_ - i_451_ | i_451_ - (i_451_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_392_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_389_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_454_ = GLSprite_Sub2.anInt8888;
				while (i_454_ < 0) {
					int i_455_ = GLSprite_Sub2.anInt8882;
					int i_456_ = GLSprite_Sub2.anInt8901;
					int i_457_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_458_ = GLSprite_Sub2.anInt8894;
					if (i_456_ >= 0 && i_456_ - (anInt8893 << 12) < 0) {
						if (i_457_ < 0) {
							int i_459_ = (GLSprite_Sub2.anInt8900 - 1 - i_457_) / GLSprite_Sub2.anInt8900;
							i_458_ += i_459_;
							i_457_ += GLSprite_Sub2.anInt8900 * i_459_;
							i_455_ += i_459_;
						}
						int i_460_;
						if ((i_460_ = (1 + i_457_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_458_) {
							i_458_ = i_460_;
						}
						for (/**/; i_458_ < 0; i_458_++) {
							int i_461_ = (i_457_ >> 12) * anInt8893 + (i_456_ >> 12);
							int i_462_ = i_455_++;
							int[] is_463_ = is;
							int i_464_ = i;
							int i_465_ = i_324_;
							if (i_465_ == 0) {
								if (i_464_ == 1) {
									is_463_[i_462_] = anIntArray10569[i_461_];
								} else if (i_464_ == 0) {
									int i_466_ = anIntArray10569[i_461_++];
									int i_467_ = (i_466_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_468_ = (i_466_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_469_ = (i_466_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_463_[i_462_] = (i_467_ | i_468_ | i_469_) >>> 8;
								} else if (i_464_ == 3) {
									int i_470_ = anIntArray10569[i_461_++];
									int i_471_ = GLSprite_Sub2.anInt8904;
									int i_472_ = i_470_ + i_471_;
									int i_473_ = (i_470_ & 0xff00ff) + (i_471_ & 0xff00ff);
									int i_474_ = (i_473_ & 0x1000100) + (i_472_ - i_473_ & 0x10000);
									is_463_[i_462_] = i_472_ - i_474_ | i_474_ - (i_474_ >>> 8);
								} else if (i_464_ == 2) {
									int i_475_ = anIntArray10569[i_461_];
									int i_476_ = (i_475_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_477_ = (i_475_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_463_[i_462_] = ((i_476_ | i_477_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_465_ == 1) {
								if (i_464_ == 1) {
									int i_478_ = anIntArray10569[i_461_];
									if (i_478_ != 0) {
										is_463_[i_462_] = i_478_;
									}
								} else if (i_464_ == 0) {
									int i_479_ = anIntArray10569[i_461_];
									if (i_479_ != 0) {
										if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
											int i_480_ = GLSprite_Sub2.anInt8904 >>> 24;
											int i_481_ = 256 - i_480_;
											int i_482_ = is_463_[i_462_];
											is_463_[i_462_] = ((i_479_ & 0xff00ff) * i_480_ + (i_482_ & 0xff00ff) * i_481_ & ~0xff00ff) + ((i_479_ & 0xff00) * i_480_ + (i_482_ & 0xff00) * i_481_ & 0xff0000) >> 8;
										} else if (GLSprite_Sub2.anInt8895 != 255) {
											int i_483_ = (i_479_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_484_ = (i_479_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_485_ = (i_479_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											i_479_ = (i_483_ | i_484_ | i_485_) >>> 8;
											int i_486_ = is_463_[i_462_];
											is_463_[i_462_] = ((i_479_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_486_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_479_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_486_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
										} else {
											int i_487_ = (i_479_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_488_ = (i_479_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_489_ = (i_479_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											is_463_[i_462_] = (i_487_ | i_488_ | i_489_) >>> 8;
										}
									}
								} else if (i_464_ == 3) {
									int i_490_ = anIntArray10569[i_461_];
									int i_491_ = GLSprite_Sub2.anInt8904;
									int i_492_ = i_490_ + i_491_;
									int i_493_ = (i_490_ & 0xff00ff) + (i_491_ & 0xff00ff);
									int i_494_ = (i_493_ & 0x1000100) + (i_492_ - i_493_ & 0x10000);
									i_494_ = i_492_ - i_494_ | i_494_ - (i_494_ >>> 8);
									if (i_490_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
										i_490_ = i_494_;
										i_494_ = is_463_[i_462_];
										i_494_ = ((i_490_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_494_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_490_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_494_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									}
									is_463_[i_462_] = i_494_;
								} else if (i_464_ == 2) {
									int i_495_ = anIntArray10569[i_461_];
									if (i_495_ != 0) {
										int i_496_ = (i_495_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_497_ = (i_495_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										is_463_[i_462_++] = ((i_496_ | i_497_) >>> 8) + GLSprite_Sub2.anInt8896;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_465_ == 2) {
								if (i_464_ == 1) {
									int i_498_ = anIntArray10569[i_461_];
									if (i_498_ != 0) {
										int i_499_ = is_463_[i_462_];
										int i_500_ = i_498_ + i_499_;
										int i_501_ = (i_498_ & 0xff00ff) + (i_499_ & 0xff00ff);
										i_499_ = (i_501_ & 0x1000100) + (i_500_ - i_501_ & 0x10000);
										is_463_[i_462_] = i_500_ - i_499_ | i_499_ - (i_499_ >>> 8);
									}
								} else if (i_464_ == 0) {
									int i_502_ = anIntArray10569[i_461_];
									if (i_502_ != 0) {
										int i_503_ = (i_502_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_504_ = (i_502_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_505_ = (i_502_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_502_ = (i_503_ | i_504_ | i_505_) >>> 8;
										int i_506_ = is_463_[i_462_];
										int i_507_ = i_502_ + i_506_;
										int i_508_ = (i_502_ & 0xff00ff) + (i_506_ & 0xff00ff);
										i_506_ = (i_508_ & 0x1000100) + (i_507_ - i_508_ & 0x10000);
										is_463_[i_462_] = i_507_ - i_506_ | i_506_ - (i_506_ >>> 8);
									}
								} else if (i_464_ == 3) {
									int i_509_ = anIntArray10569[i_461_];
									int i_510_ = GLSprite_Sub2.anInt8904;
									int i_511_ = i_509_ + i_510_;
									int i_512_ = (i_509_ & 0xff00ff) + (i_510_ & 0xff00ff);
									int i_513_ = (i_512_ & 0x1000100) + (i_511_ - i_512_ & 0x10000);
									i_509_ = i_511_ - i_513_ | i_513_ - (i_513_ >>> 8);
									i_513_ = is_463_[i_462_];
									i_511_ = i_509_ + i_513_;
									i_512_ = (i_509_ & 0xff00ff) + (i_513_ & 0xff00ff);
									i_513_ = (i_512_ & 0x1000100) + (i_511_ - i_512_ & 0x10000);
									is_463_[i_462_] = i_511_ - i_513_ | i_513_ - (i_513_ >>> 8);
								} else if (i_464_ == 2) {
									int i_514_ = anIntArray10569[i_461_];
									if (i_514_ != 0) {
										int i_515_ = (i_514_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_516_ = (i_514_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										i_514_ = ((i_515_ | i_516_) >>> 8) + GLSprite_Sub2.anInt8896;
										int i_517_ = is_463_[i_462_];
										int i_518_ = i_514_ + i_517_;
										int i_519_ = (i_514_ & 0xff00ff) + (i_517_ & 0xff00ff);
										i_517_ = (i_519_ & 0x1000100) + (i_518_ - i_519_ & 0x10000);
										is_463_[i_462_] = i_518_ - i_517_ | i_517_ - (i_517_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_457_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_454_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8913 < 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_520_ = GLSprite_Sub2.anInt8888;
				while (i_520_ < 0) {
					int i_521_ = GLSprite_Sub2.anInt8882;
					int i_522_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_523_ = GLSprite_Sub2.anInt8908;
					int i_524_ = GLSprite_Sub2.anInt8894;
					if (i_523_ >= 0 && i_523_ - (anInt8897 << 12) < 0) {
						int i_525_;
						if ((i_525_ = i_522_ - (anInt8893 << 12)) >= 0) {
							i_525_ = (GLSprite_Sub2.anInt8913 - i_525_) / GLSprite_Sub2.anInt8913;
							i_524_ += i_525_;
							i_522_ += GLSprite_Sub2.anInt8913 * i_525_;
							i_521_ += i_525_;
						}
						if ((i_525_ = (i_522_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_524_) {
							i_524_ = i_525_;
						}
						for (/**/; i_524_ < 0; i_524_++) {
							int i_526_ = (i_523_ >> 12) * anInt8893 + (i_522_ >> 12);
							int i_527_ = i_521_++;
							int[] is_528_ = is;
							int i_529_ = i;
							int i_530_ = i_324_;
							if (i_530_ == 0) {
								if (i_529_ == 1) {
									is_528_[i_527_] = anIntArray10569[i_526_];
								} else if (i_529_ == 0) {
									int i_531_ = anIntArray10569[i_526_++];
									int i_532_ = (i_531_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_533_ = (i_531_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_534_ = (i_531_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_528_[i_527_] = (i_532_ | i_533_ | i_534_) >>> 8;
								} else if (i_529_ == 3) {
									int i_535_ = anIntArray10569[i_526_++];
									int i_536_ = GLSprite_Sub2.anInt8904;
									int i_537_ = i_535_ + i_536_;
									int i_538_ = (i_535_ & 0xff00ff) + (i_536_ & 0xff00ff);
									int i_539_ = (i_538_ & 0x1000100) + (i_537_ - i_538_ & 0x10000);
									is_528_[i_527_] = i_537_ - i_539_ | i_539_ - (i_539_ >>> 8);
								} else if (i_529_ == 2) {
									int i_540_ = anIntArray10569[i_526_];
									int i_541_ = (i_540_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_542_ = (i_540_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_528_[i_527_] = ((i_541_ | i_542_) >>> 8) + GLSprite_Sub2.anInt8896;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_530_ == 1) {
								if (i_529_ == 1) {
									int i_543_ = anIntArray10569[i_526_];
									if (i_543_ != 0) {
										is_528_[i_527_] = i_543_;
									}
								} else if (i_529_ == 0) {
									int i_544_ = anIntArray10569[i_526_];
									if (i_544_ != 0) {
										if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
											int i_545_ = GLSprite_Sub2.anInt8904 >>> 24;
											int i_546_ = 256 - i_545_;
											int i_547_ = is_528_[i_527_];
											is_528_[i_527_] = ((i_544_ & 0xff00ff) * i_545_ + (i_547_ & 0xff00ff) * i_546_ & ~0xff00ff) + ((i_544_ & 0xff00) * i_545_ + (i_547_ & 0xff00) * i_546_ & 0xff0000) >> 8;
										} else if (GLSprite_Sub2.anInt8895 != 255) {
											int i_548_ = (i_544_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_549_ = (i_544_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_550_ = (i_544_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											i_544_ = (i_548_ | i_549_ | i_550_) >>> 8;
											int i_551_ = is_528_[i_527_];
											is_528_[i_527_] = ((i_544_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_551_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_544_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_551_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
										} else {
											int i_552_ = (i_544_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
											int i_553_ = (i_544_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
											int i_554_ = (i_544_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
											is_528_[i_527_] = (i_552_ | i_553_ | i_554_) >>> 8;
										}
									}
								} else if (i_529_ == 3) {
									int i_555_ = anIntArray10569[i_526_];
									int i_556_ = GLSprite_Sub2.anInt8904;
									int i_557_ = i_555_ + i_556_;
									int i_558_ = (i_555_ & 0xff00ff) + (i_556_ & 0xff00ff);
									int i_559_ = (i_558_ & 0x1000100) + (i_557_ - i_558_ & 0x10000);
									i_559_ = i_557_ - i_559_ | i_559_ - (i_559_ >>> 8);
									if (i_555_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
										i_555_ = i_559_;
										i_559_ = is_528_[i_527_];
										i_559_ = ((i_555_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_559_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_555_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_559_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									}
									is_528_[i_527_] = i_559_;
								} else if (i_529_ == 2) {
									int i_560_ = anIntArray10569[i_526_];
									if (i_560_ != 0) {
										int i_561_ = (i_560_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_562_ = (i_560_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										is_528_[i_527_++] = ((i_561_ | i_562_) >>> 8) + GLSprite_Sub2.anInt8896;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_530_ == 2) {
								if (i_529_ == 1) {
									int i_563_ = anIntArray10569[i_526_];
									if (i_563_ != 0) {
										int i_564_ = is_528_[i_527_];
										int i_565_ = i_563_ + i_564_;
										int i_566_ = (i_563_ & 0xff00ff) + (i_564_ & 0xff00ff);
										i_564_ = (i_566_ & 0x1000100) + (i_565_ - i_566_ & 0x10000);
										is_528_[i_527_] = i_565_ - i_564_ | i_564_ - (i_564_ >>> 8);
									}
								} else if (i_529_ == 0) {
									int i_567_ = anIntArray10569[i_526_];
									if (i_567_ != 0) {
										int i_568_ = (i_567_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_569_ = (i_567_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_570_ = (i_567_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_567_ = (i_568_ | i_569_ | i_570_) >>> 8;
										int i_571_ = is_528_[i_527_];
										int i_572_ = i_567_ + i_571_;
										int i_573_ = (i_567_ & 0xff00ff) + (i_571_ & 0xff00ff);
										i_571_ = (i_573_ & 0x1000100) + (i_572_ - i_573_ & 0x10000);
										is_528_[i_527_] = i_572_ - i_571_ | i_571_ - (i_571_ >>> 8);
									}
								} else if (i_529_ == 3) {
									int i_574_ = anIntArray10569[i_526_];
									int i_575_ = GLSprite_Sub2.anInt8904;
									int i_576_ = i_574_ + i_575_;
									int i_577_ = (i_574_ & 0xff00ff) + (i_575_ & 0xff00ff);
									int i_578_ = (i_577_ & 0x1000100) + (i_576_ - i_577_ & 0x10000);
									i_574_ = i_576_ - i_578_ | i_578_ - (i_578_ >>> 8);
									i_578_ = is_528_[i_527_];
									i_576_ = i_574_ + i_578_;
									i_577_ = (i_574_ & 0xff00ff) + (i_578_ & 0xff00ff);
									i_578_ = (i_577_ & 0x1000100) + (i_576_ - i_577_ & 0x10000);
									is_528_[i_527_] = i_576_ - i_578_ | i_578_ - (i_578_ >>> 8);
								} else if (i_529_ == 2) {
									int i_579_ = anIntArray10569[i_526_];
									if (i_579_ != 0) {
										int i_580_ = (i_579_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
										int i_581_ = (i_579_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
										i_579_ = ((i_580_ | i_581_) >>> 8) + GLSprite_Sub2.anInt8896;
										int i_582_ = is_528_[i_527_];
										int i_583_ = i_579_ + i_582_;
										int i_584_ = (i_579_ & 0xff00ff) + (i_582_ & 0xff00ff);
										i_582_ = (i_584_ & 0x1000100) + (i_583_ - i_584_ & 0x10000);
										is_528_[i_527_] = i_583_ - i_582_ | i_582_ - (i_582_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_522_ += GLSprite_Sub2.anInt8913;
						}
					}
					i_520_++;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_585_ = GLSprite_Sub2.anInt8888;
				while (i_585_ < 0) {
					int i_586_ = GLSprite_Sub2.anInt8882;
					int i_587_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_588_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_589_ = GLSprite_Sub2.anInt8894;
					int i_590_;
					if ((i_590_ = i_587_ - (anInt8893 << 12)) >= 0) {
						i_590_ = (GLSprite_Sub2.anInt8913 - i_590_) / GLSprite_Sub2.anInt8913;
						i_589_ += i_590_;
						i_587_ += GLSprite_Sub2.anInt8913 * i_590_;
						i_588_ += GLSprite_Sub2.anInt8900 * i_590_;
						i_586_ += i_590_;
					}
					if ((i_590_ = (i_587_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_589_) {
						i_589_ = i_590_;
					}
					if ((i_590_ = i_588_ - (anInt8897 << 12)) >= 0) {
						i_590_ = (GLSprite_Sub2.anInt8900 - i_590_) / GLSprite_Sub2.anInt8900;
						i_589_ += i_590_;
						i_587_ += GLSprite_Sub2.anInt8913 * i_590_;
						i_588_ += GLSprite_Sub2.anInt8900 * i_590_;
						i_586_ += i_590_;
					}
					if ((i_590_ = (i_588_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_589_) {
						i_589_ = i_590_;
					}
					for (/**/; i_589_ < 0; i_589_++) {
						int i_591_ = (i_588_ >> 12) * anInt8893 + (i_587_ >> 12);
						int i_592_ = i_586_++;
						int[] is_593_ = is;
						int i_594_ = i;
						int i_595_ = i_324_;
						if (i_595_ == 0) {
							if (i_594_ == 1) {
								is_593_[i_592_] = anIntArray10569[i_591_];
							} else if (i_594_ == 0) {
								int i_596_ = anIntArray10569[i_591_++];
								int i_597_ = (i_596_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_598_ = (i_596_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_599_ = (i_596_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_593_[i_592_] = (i_597_ | i_598_ | i_599_) >>> 8;
							} else if (i_594_ == 3) {
								int i_600_ = anIntArray10569[i_591_++];
								int i_601_ = GLSprite_Sub2.anInt8904;
								int i_602_ = i_600_ + i_601_;
								int i_603_ = (i_600_ & 0xff00ff) + (i_601_ & 0xff00ff);
								int i_604_ = (i_603_ & 0x1000100) + (i_602_ - i_603_ & 0x10000);
								is_593_[i_592_] = i_602_ - i_604_ | i_604_ - (i_604_ >>> 8);
							} else if (i_594_ == 2) {
								int i_605_ = anIntArray10569[i_591_];
								int i_606_ = (i_605_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_607_ = (i_605_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_593_[i_592_] = ((i_606_ | i_607_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_595_ == 1) {
							if (i_594_ == 1) {
								int i_608_ = anIntArray10569[i_591_];
								if (i_608_ != 0) {
									is_593_[i_592_] = i_608_;
								}
							} else if (i_594_ == 0) {
								int i_609_ = anIntArray10569[i_591_];
								if (i_609_ != 0) {
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_610_ = GLSprite_Sub2.anInt8904 >>> 24;
										int i_611_ = 256 - i_610_;
										int i_612_ = is_593_[i_592_];
										is_593_[i_592_] = ((i_609_ & 0xff00ff) * i_610_ + (i_612_ & 0xff00ff) * i_611_ & ~0xff00ff) + ((i_609_ & 0xff00) * i_610_ + (i_612_ & 0xff00) * i_611_ & 0xff0000) >> 8;
									} else if (GLSprite_Sub2.anInt8895 != 255) {
										int i_613_ = (i_609_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_614_ = (i_609_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_615_ = (i_609_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_609_ = (i_613_ | i_614_ | i_615_) >>> 8;
										int i_616_ = is_593_[i_592_];
										is_593_[i_592_] = ((i_609_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_616_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_609_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_616_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									} else {
										int i_617_ = (i_609_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_618_ = (i_609_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_619_ = (i_609_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_593_[i_592_] = (i_617_ | i_618_ | i_619_) >>> 8;
									}
								}
							} else if (i_594_ == 3) {
								int i_620_ = anIntArray10569[i_591_];
								int i_621_ = GLSprite_Sub2.anInt8904;
								int i_622_ = i_620_ + i_621_;
								int i_623_ = (i_620_ & 0xff00ff) + (i_621_ & 0xff00ff);
								int i_624_ = (i_623_ & 0x1000100) + (i_622_ - i_623_ & 0x10000);
								i_624_ = i_622_ - i_624_ | i_624_ - (i_624_ >>> 8);
								if (i_620_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
									i_620_ = i_624_;
									i_624_ = is_593_[i_592_];
									i_624_ = ((i_620_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_624_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_620_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_624_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
								}
								is_593_[i_592_] = i_624_;
							} else if (i_594_ == 2) {
								int i_625_ = anIntArray10569[i_591_];
								if (i_625_ != 0) {
									int i_626_ = (i_625_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_627_ = (i_625_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_593_[i_592_++] = ((i_626_ | i_627_) >>> 8) + GLSprite_Sub2.anInt8896;
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_595_ == 2) {
							if (i_594_ == 1) {
								int i_628_ = anIntArray10569[i_591_];
								if (i_628_ != 0) {
									int i_629_ = is_593_[i_592_];
									int i_630_ = i_628_ + i_629_;
									int i_631_ = (i_628_ & 0xff00ff) + (i_629_ & 0xff00ff);
									i_629_ = (i_631_ & 0x1000100) + (i_630_ - i_631_ & 0x10000);
									is_593_[i_592_] = i_630_ - i_629_ | i_629_ - (i_629_ >>> 8);
								}
							} else if (i_594_ == 0) {
								int i_632_ = anIntArray10569[i_591_];
								if (i_632_ != 0) {
									int i_633_ = (i_632_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_634_ = (i_632_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_635_ = (i_632_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_632_ = (i_633_ | i_634_ | i_635_) >>> 8;
									int i_636_ = is_593_[i_592_];
									int i_637_ = i_632_ + i_636_;
									int i_638_ = (i_632_ & 0xff00ff) + (i_636_ & 0xff00ff);
									i_636_ = (i_638_ & 0x1000100) + (i_637_ - i_638_ & 0x10000);
									is_593_[i_592_] = i_637_ - i_636_ | i_636_ - (i_636_ >>> 8);
								}
							} else if (i_594_ == 3) {
								int i_639_ = anIntArray10569[i_591_];
								int i_640_ = GLSprite_Sub2.anInt8904;
								int i_641_ = i_639_ + i_640_;
								int i_642_ = (i_639_ & 0xff00ff) + (i_640_ & 0xff00ff);
								int i_643_ = (i_642_ & 0x1000100) + (i_641_ - i_642_ & 0x10000);
								i_639_ = i_641_ - i_643_ | i_643_ - (i_643_ >>> 8);
								i_643_ = is_593_[i_592_];
								i_641_ = i_639_ + i_643_;
								i_642_ = (i_639_ & 0xff00ff) + (i_643_ & 0xff00ff);
								i_643_ = (i_642_ & 0x1000100) + (i_641_ - i_642_ & 0x10000);
								is_593_[i_592_] = i_641_ - i_643_ | i_643_ - (i_643_ >>> 8);
							} else if (i_594_ == 2) {
								int i_644_ = anIntArray10569[i_591_];
								if (i_644_ != 0) {
									int i_645_ = (i_644_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_646_ = (i_644_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_644_ = ((i_645_ | i_646_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_647_ = is_593_[i_592_];
									int i_648_ = i_644_ + i_647_;
									int i_649_ = (i_644_ & 0xff00ff) + (i_647_ & 0xff00ff);
									i_647_ = (i_649_ & 0x1000100) + (i_648_ - i_649_ & 0x10000);
									is_593_[i_592_] = i_648_ - i_647_ | i_647_ - (i_647_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_587_ += GLSprite_Sub2.anInt8913;
						i_588_ += GLSprite_Sub2.anInt8900;
					}
					i_585_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_650_ = GLSprite_Sub2.anInt8888;
				while (i_650_ < 0) {
					int i_651_ = GLSprite_Sub2.anInt8882;
					int i_652_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_653_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_654_ = GLSprite_Sub2.anInt8894;
					int i_655_;
					if ((i_655_ = i_652_ - (anInt8893 << 12)) >= 0) {
						i_655_ = (GLSprite_Sub2.anInt8913 - i_655_) / GLSprite_Sub2.anInt8913;
						i_654_ += i_655_;
						i_652_ += GLSprite_Sub2.anInt8913 * i_655_;
						i_653_ += GLSprite_Sub2.anInt8900 * i_655_;
						i_651_ += i_655_;
					}
					if ((i_655_ = (i_652_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_654_) {
						i_654_ = i_655_;
					}
					if (i_653_ < 0) {
						i_655_ = (GLSprite_Sub2.anInt8900 - 1 - i_653_) / GLSprite_Sub2.anInt8900;
						i_654_ += i_655_;
						i_652_ += GLSprite_Sub2.anInt8913 * i_655_;
						i_653_ += GLSprite_Sub2.anInt8900 * i_655_;
						i_651_ += i_655_;
					}
					if ((i_655_ = (1 + i_653_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_654_) {
						i_654_ = i_655_;
					}
					for (/**/; i_654_ < 0; i_654_++) {
						int i_656_ = (i_653_ >> 12) * anInt8893 + (i_652_ >> 12);
						int i_657_ = i_651_++;
						int[] is_658_ = is;
						int i_659_ = i;
						int i_660_ = i_324_;
						if (i_660_ == 0) {
							if (i_659_ == 1) {
								is_658_[i_657_] = anIntArray10569[i_656_];
							} else if (i_659_ == 0) {
								int i_661_ = anIntArray10569[i_656_++];
								int i_662_ = (i_661_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_663_ = (i_661_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_664_ = (i_661_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_658_[i_657_] = (i_662_ | i_663_ | i_664_) >>> 8;
							} else if (i_659_ == 3) {
								int i_665_ = anIntArray10569[i_656_++];
								int i_666_ = GLSprite_Sub2.anInt8904;
								int i_667_ = i_665_ + i_666_;
								int i_668_ = (i_665_ & 0xff00ff) + (i_666_ & 0xff00ff);
								int i_669_ = (i_668_ & 0x1000100) + (i_667_ - i_668_ & 0x10000);
								is_658_[i_657_] = i_667_ - i_669_ | i_669_ - (i_669_ >>> 8);
							} else if (i_659_ == 2) {
								int i_670_ = anIntArray10569[i_656_];
								int i_671_ = (i_670_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_672_ = (i_670_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_658_[i_657_] = ((i_671_ | i_672_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_660_ == 1) {
							if (i_659_ == 1) {
								int i_673_ = anIntArray10569[i_656_];
								if (i_673_ != 0) {
									is_658_[i_657_] = i_673_;
								}
							} else if (i_659_ == 0) {
								int i_674_ = anIntArray10569[i_656_];
								if (i_674_ != 0) {
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_675_ = GLSprite_Sub2.anInt8904 >>> 24;
										int i_676_ = 256 - i_675_;
										int i_677_ = is_658_[i_657_];
										is_658_[i_657_] = ((i_674_ & 0xff00ff) * i_675_ + (i_677_ & 0xff00ff) * i_676_ & ~0xff00ff) + ((i_674_ & 0xff00) * i_675_ + (i_677_ & 0xff00) * i_676_ & 0xff0000) >> 8;
									} else if (GLSprite_Sub2.anInt8895 != 255) {
										int i_678_ = (i_674_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_679_ = (i_674_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_680_ = (i_674_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_674_ = (i_678_ | i_679_ | i_680_) >>> 8;
										int i_681_ = is_658_[i_657_];
										is_658_[i_657_] = ((i_674_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_681_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_674_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_681_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									} else {
										int i_682_ = (i_674_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_683_ = (i_674_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_684_ = (i_674_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_658_[i_657_] = (i_682_ | i_683_ | i_684_) >>> 8;
									}
								}
							} else if (i_659_ == 3) {
								int i_685_ = anIntArray10569[i_656_];
								int i_686_ = GLSprite_Sub2.anInt8904;
								int i_687_ = i_685_ + i_686_;
								int i_688_ = (i_685_ & 0xff00ff) + (i_686_ & 0xff00ff);
								int i_689_ = (i_688_ & 0x1000100) + (i_687_ - i_688_ & 0x10000);
								i_689_ = i_687_ - i_689_ | i_689_ - (i_689_ >>> 8);
								if (i_685_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
									i_685_ = i_689_;
									i_689_ = is_658_[i_657_];
									i_689_ = ((i_685_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_689_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_685_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_689_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
								}
								is_658_[i_657_] = i_689_;
							} else if (i_659_ == 2) {
								int i_690_ = anIntArray10569[i_656_];
								if (i_690_ != 0) {
									int i_691_ = (i_690_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_692_ = (i_690_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_658_[i_657_++] = ((i_691_ | i_692_) >>> 8) + GLSprite_Sub2.anInt8896;
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_660_ == 2) {
							if (i_659_ == 1) {
								int i_693_ = anIntArray10569[i_656_];
								if (i_693_ != 0) {
									int i_694_ = is_658_[i_657_];
									int i_695_ = i_693_ + i_694_;
									int i_696_ = (i_693_ & 0xff00ff) + (i_694_ & 0xff00ff);
									i_694_ = (i_696_ & 0x1000100) + (i_695_ - i_696_ & 0x10000);
									is_658_[i_657_] = i_695_ - i_694_ | i_694_ - (i_694_ >>> 8);
								}
							} else if (i_659_ == 0) {
								int i_697_ = anIntArray10569[i_656_];
								if (i_697_ != 0) {
									int i_698_ = (i_697_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_699_ = (i_697_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_700_ = (i_697_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_697_ = (i_698_ | i_699_ | i_700_) >>> 8;
									int i_701_ = is_658_[i_657_];
									int i_702_ = i_697_ + i_701_;
									int i_703_ = (i_697_ & 0xff00ff) + (i_701_ & 0xff00ff);
									i_701_ = (i_703_ & 0x1000100) + (i_702_ - i_703_ & 0x10000);
									is_658_[i_657_] = i_702_ - i_701_ | i_701_ - (i_701_ >>> 8);
								}
							} else if (i_659_ == 3) {
								int i_704_ = anIntArray10569[i_656_];
								int i_705_ = GLSprite_Sub2.anInt8904;
								int i_706_ = i_704_ + i_705_;
								int i_707_ = (i_704_ & 0xff00ff) + (i_705_ & 0xff00ff);
								int i_708_ = (i_707_ & 0x1000100) + (i_706_ - i_707_ & 0x10000);
								i_704_ = i_706_ - i_708_ | i_708_ - (i_708_ >>> 8);
								i_708_ = is_658_[i_657_];
								i_706_ = i_704_ + i_708_;
								i_707_ = (i_704_ & 0xff00ff) + (i_708_ & 0xff00ff);
								i_708_ = (i_707_ & 0x1000100) + (i_706_ - i_707_ & 0x10000);
								is_658_[i_657_] = i_706_ - i_708_ | i_708_ - (i_708_ >>> 8);
							} else if (i_659_ == 2) {
								int i_709_ = anIntArray10569[i_656_];
								if (i_709_ != 0) {
									int i_710_ = (i_709_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_711_ = (i_709_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_709_ = ((i_710_ | i_711_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_712_ = is_658_[i_657_];
									int i_713_ = i_709_ + i_712_;
									int i_714_ = (i_709_ & 0xff00ff) + (i_712_ & 0xff00ff);
									i_712_ = (i_714_ & 0x1000100) + (i_713_ - i_714_ & 0x10000);
									is_658_[i_657_] = i_713_ - i_712_ | i_712_ - (i_712_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_652_ += GLSprite_Sub2.anInt8913;
						i_653_ += GLSprite_Sub2.anInt8900;
					}
					i_650_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8900 == 0) {
			int i_715_ = GLSprite_Sub2.anInt8888;
			while (i_715_ < 0) {
				int i_716_ = GLSprite_Sub2.anInt8882;
				int i_717_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_718_ = GLSprite_Sub2.anInt8908;
				int i_719_ = GLSprite_Sub2.anInt8894;
				if (i_718_ >= 0 && i_718_ - (anInt8897 << 12) < 0) {
					if (i_717_ < 0) {
						int i_720_ = (GLSprite_Sub2.anInt8913 - 1 - i_717_) / GLSprite_Sub2.anInt8913;
						i_719_ += i_720_;
						i_717_ += GLSprite_Sub2.anInt8913 * i_720_;
						i_716_ += i_720_;
					}
					int i_721_;
					if ((i_721_ = (1 + i_717_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_719_) {
						i_719_ = i_721_;
					}
					for (/**/; i_719_ < 0; i_719_++) {
						int i_722_ = (i_718_ >> 12) * anInt8893 + (i_717_ >> 12);
						int i_723_ = i_716_++;
						int[] is_724_ = is;
						int i_725_ = i;
						int i_726_ = i_324_;
						if (i_726_ == 0) {
							if (i_725_ == 1) {
								is_724_[i_723_] = anIntArray10569[i_722_];
							} else if (i_725_ == 0) {
								int i_727_ = anIntArray10569[i_722_++];
								int i_728_ = (i_727_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_729_ = (i_727_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_730_ = (i_727_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								is_724_[i_723_] = (i_728_ | i_729_ | i_730_) >>> 8;
							} else if (i_725_ == 3) {
								int i_731_ = anIntArray10569[i_722_++];
								int i_732_ = GLSprite_Sub2.anInt8904;
								int i_733_ = i_731_ + i_732_;
								int i_734_ = (i_731_ & 0xff00ff) + (i_732_ & 0xff00ff);
								int i_735_ = (i_734_ & 0x1000100) + (i_733_ - i_734_ & 0x10000);
								is_724_[i_723_] = i_733_ - i_735_ | i_735_ - (i_735_ >>> 8);
							} else if (i_725_ == 2) {
								int i_736_ = anIntArray10569[i_722_];
								int i_737_ = (i_736_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_738_ = (i_736_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_724_[i_723_] = ((i_737_ | i_738_) >>> 8) + GLSprite_Sub2.anInt8896;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_726_ == 1) {
							if (i_725_ == 1) {
								int i_739_ = anIntArray10569[i_722_];
								if (i_739_ != 0) {
									is_724_[i_723_] = i_739_;
								}
							} else if (i_725_ == 0) {
								int i_740_ = anIntArray10569[i_722_];
								if (i_740_ != 0) {
									if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
										int i_741_ = GLSprite_Sub2.anInt8904 >>> 24;
										int i_742_ = 256 - i_741_;
										int i_743_ = is_724_[i_723_];
										is_724_[i_723_] = ((i_740_ & 0xff00ff) * i_741_ + (i_743_ & 0xff00ff) * i_742_ & ~0xff00ff) + ((i_740_ & 0xff00) * i_741_ + (i_743_ & 0xff00) * i_742_ & 0xff0000) >> 8;
									} else if (GLSprite_Sub2.anInt8895 != 255) {
										int i_744_ = (i_740_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_745_ = (i_740_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_746_ = (i_740_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										i_740_ = (i_744_ | i_745_ | i_746_) >>> 8;
										int i_747_ = is_724_[i_723_];
										is_724_[i_723_] = ((i_740_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_747_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_740_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_747_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
									} else {
										int i_748_ = (i_740_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
										int i_749_ = (i_740_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
										int i_750_ = (i_740_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
										is_724_[i_723_] = (i_748_ | i_749_ | i_750_) >>> 8;
									}
								}
							} else if (i_725_ == 3) {
								int i_751_ = anIntArray10569[i_722_];
								int i_752_ = GLSprite_Sub2.anInt8904;
								int i_753_ = i_751_ + i_752_;
								int i_754_ = (i_751_ & 0xff00ff) + (i_752_ & 0xff00ff);
								int i_755_ = (i_754_ & 0x1000100) + (i_753_ - i_754_ & 0x10000);
								i_755_ = i_753_ - i_755_ | i_755_ - (i_755_ >>> 8);
								if (i_751_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
									i_751_ = i_755_;
									i_755_ = is_724_[i_723_];
									i_755_ = ((i_751_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_755_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_751_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_755_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
								}
								is_724_[i_723_] = i_755_;
							} else if (i_725_ == 2) {
								int i_756_ = anIntArray10569[i_722_];
								if (i_756_ != 0) {
									int i_757_ = (i_756_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_758_ = (i_756_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									is_724_[i_723_++] = ((i_757_ | i_758_) >>> 8) + GLSprite_Sub2.anInt8896;
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_726_ == 2) {
							if (i_725_ == 1) {
								int i_759_ = anIntArray10569[i_722_];
								if (i_759_ != 0) {
									int i_760_ = is_724_[i_723_];
									int i_761_ = i_759_ + i_760_;
									int i_762_ = (i_759_ & 0xff00ff) + (i_760_ & 0xff00ff);
									i_760_ = (i_762_ & 0x1000100) + (i_761_ - i_762_ & 0x10000);
									is_724_[i_723_] = i_761_ - i_760_ | i_760_ - (i_760_ >>> 8);
								}
							} else if (i_725_ == 0) {
								int i_763_ = anIntArray10569[i_722_];
								if (i_763_ != 0) {
									int i_764_ = (i_763_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_765_ = (i_763_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_766_ = (i_763_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_763_ = (i_764_ | i_765_ | i_766_) >>> 8;
									int i_767_ = is_724_[i_723_];
									int i_768_ = i_763_ + i_767_;
									int i_769_ = (i_763_ & 0xff00ff) + (i_767_ & 0xff00ff);
									i_767_ = (i_769_ & 0x1000100) + (i_768_ - i_769_ & 0x10000);
									is_724_[i_723_] = i_768_ - i_767_ | i_767_ - (i_767_ >>> 8);
								}
							} else if (i_725_ == 3) {
								int i_770_ = anIntArray10569[i_722_];
								int i_771_ = GLSprite_Sub2.anInt8904;
								int i_772_ = i_770_ + i_771_;
								int i_773_ = (i_770_ & 0xff00ff) + (i_771_ & 0xff00ff);
								int i_774_ = (i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000);
								i_770_ = i_772_ - i_774_ | i_774_ - (i_774_ >>> 8);
								i_774_ = is_724_[i_723_];
								i_772_ = i_770_ + i_774_;
								i_773_ = (i_770_ & 0xff00ff) + (i_774_ & 0xff00ff);
								i_774_ = (i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000);
								is_724_[i_723_] = i_772_ - i_774_ | i_774_ - (i_774_ >>> 8);
							} else if (i_725_ == 2) {
								int i_775_ = anIntArray10569[i_722_];
								if (i_775_ != 0) {
									int i_776_ = (i_775_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
									int i_777_ = (i_775_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
									i_775_ = ((i_776_ | i_777_) >>> 8) + GLSprite_Sub2.anInt8896;
									int i_778_ = is_724_[i_723_];
									int i_779_ = i_775_ + i_778_;
									int i_780_ = (i_775_ & 0xff00ff) + (i_778_ & 0xff00ff);
									i_778_ = (i_780_ & 0x1000100) + (i_779_ - i_780_ & 0x10000);
									is_724_[i_723_] = i_779_ - i_778_ | i_778_ - (i_778_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_717_ += GLSprite_Sub2.anInt8913;
					}
				}
				i_715_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else if (GLSprite_Sub2.anInt8900 < 0) {
			for (int i_781_ = GLSprite_Sub2.anInt8888; i_781_ < 0; i_781_++) {
				int i_782_ = GLSprite_Sub2.anInt8882;
				int i_783_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_784_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
				int i_785_ = GLSprite_Sub2.anInt8894;
				if (i_783_ < 0) {
					int i_786_ = (GLSprite_Sub2.anInt8913 - 1 - i_783_) / GLSprite_Sub2.anInt8913;
					i_785_ += i_786_;
					i_783_ += GLSprite_Sub2.anInt8913 * i_786_;
					i_784_ += GLSprite_Sub2.anInt8900 * i_786_;
					i_782_ += i_786_;
				}
				int i_787_;
				if ((i_787_ = (1 + i_783_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_785_) {
					i_785_ = i_787_;
				}
				if ((i_787_ = i_784_ - (anInt8897 << 12)) >= 0) {
					i_787_ = (GLSprite_Sub2.anInt8900 - i_787_) / GLSprite_Sub2.anInt8900;
					i_785_ += i_787_;
					i_783_ += GLSprite_Sub2.anInt8913 * i_787_;
					i_784_ += GLSprite_Sub2.anInt8900 * i_787_;
					i_782_ += i_787_;
				}
				if ((i_787_ = (i_784_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_785_) {
					i_785_ = i_787_;
				}
				for (/**/; i_785_ < 0; i_785_++) {
					int i_788_ = (i_784_ >> 12) * anInt8893 + (i_783_ >> 12);
					int i_789_ = i_782_++;
					int[] is_790_ = is;
					int i_791_ = i;
					int i_792_ = i_324_;
					if (i_792_ == 0) {
						if (i_791_ == 1) {
							is_790_[i_789_] = anIntArray10569[i_788_];
						} else if (i_791_ == 0) {
							int i_793_ = anIntArray10569[i_788_++];
							int i_794_ = (i_793_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_795_ = (i_793_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_796_ = (i_793_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							is_790_[i_789_] = (i_794_ | i_795_ | i_796_) >>> 8;
						} else if (i_791_ == 3) {
							int i_797_ = anIntArray10569[i_788_++];
							int i_798_ = GLSprite_Sub2.anInt8904;
							int i_799_ = i_797_ + i_798_;
							int i_800_ = (i_797_ & 0xff00ff) + (i_798_ & 0xff00ff);
							int i_801_ = (i_800_ & 0x1000100) + (i_799_ - i_800_ & 0x10000);
							is_790_[i_789_] = i_799_ - i_801_ | i_801_ - (i_801_ >>> 8);
						} else if (i_791_ == 2) {
							int i_802_ = anIntArray10569[i_788_];
							int i_803_ = (i_802_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_804_ = (i_802_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							is_790_[i_789_] = ((i_803_ | i_804_) >>> 8) + GLSprite_Sub2.anInt8896;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_792_ == 1) {
						if (i_791_ == 1) {
							int i_805_ = anIntArray10569[i_788_];
							if (i_805_ != 0) {
								is_790_[i_789_] = i_805_;
							}
						} else if (i_791_ == 0) {
							int i_806_ = anIntArray10569[i_788_];
							if (i_806_ != 0) {
								if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
									int i_807_ = GLSprite_Sub2.anInt8904 >>> 24;
									int i_808_ = 256 - i_807_;
									int i_809_ = is_790_[i_789_];
									is_790_[i_789_] = ((i_806_ & 0xff00ff) * i_807_ + (i_809_ & 0xff00ff) * i_808_ & ~0xff00ff) + ((i_806_ & 0xff00) * i_807_ + (i_809_ & 0xff00) * i_808_ & 0xff0000) >> 8;
								} else if (GLSprite_Sub2.anInt8895 != 255) {
									int i_810_ = (i_806_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_811_ = (i_806_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_812_ = (i_806_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_806_ = (i_810_ | i_811_ | i_812_) >>> 8;
									int i_813_ = is_790_[i_789_];
									is_790_[i_789_] = ((i_806_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_813_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_806_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_813_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
								} else {
									int i_814_ = (i_806_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_815_ = (i_806_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_816_ = (i_806_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_790_[i_789_] = (i_814_ | i_815_ | i_816_) >>> 8;
								}
							}
						} else if (i_791_ == 3) {
							int i_817_ = anIntArray10569[i_788_];
							int i_818_ = GLSprite_Sub2.anInt8904;
							int i_819_ = i_817_ + i_818_;
							int i_820_ = (i_817_ & 0xff00ff) + (i_818_ & 0xff00ff);
							int i_821_ = (i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000);
							i_821_ = i_819_ - i_821_ | i_821_ - (i_821_ >>> 8);
							if (i_817_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
								i_817_ = i_821_;
								i_821_ = is_790_[i_789_];
								i_821_ = ((i_817_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_821_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_817_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_821_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
							}
							is_790_[i_789_] = i_821_;
						} else if (i_791_ == 2) {
							int i_822_ = anIntArray10569[i_788_];
							if (i_822_ != 0) {
								int i_823_ = (i_822_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_824_ = (i_822_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_790_[i_789_++] = ((i_823_ | i_824_) >>> 8) + GLSprite_Sub2.anInt8896;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_792_ == 2) {
						if (i_791_ == 1) {
							int i_825_ = anIntArray10569[i_788_];
							if (i_825_ != 0) {
								int i_826_ = is_790_[i_789_];
								int i_827_ = i_825_ + i_826_;
								int i_828_ = (i_825_ & 0xff00ff) + (i_826_ & 0xff00ff);
								i_826_ = (i_828_ & 0x1000100) + (i_827_ - i_828_ & 0x10000);
								is_790_[i_789_] = i_827_ - i_826_ | i_826_ - (i_826_ >>> 8);
							}
						} else if (i_791_ == 0) {
							int i_829_ = anIntArray10569[i_788_];
							if (i_829_ != 0) {
								int i_830_ = (i_829_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_831_ = (i_829_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_832_ = (i_829_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_829_ = (i_830_ | i_831_ | i_832_) >>> 8;
								int i_833_ = is_790_[i_789_];
								int i_834_ = i_829_ + i_833_;
								int i_835_ = (i_829_ & 0xff00ff) + (i_833_ & 0xff00ff);
								i_833_ = (i_835_ & 0x1000100) + (i_834_ - i_835_ & 0x10000);
								is_790_[i_789_] = i_834_ - i_833_ | i_833_ - (i_833_ >>> 8);
							}
						} else if (i_791_ == 3) {
							int i_836_ = anIntArray10569[i_788_];
							int i_837_ = GLSprite_Sub2.anInt8904;
							int i_838_ = i_836_ + i_837_;
							int i_839_ = (i_836_ & 0xff00ff) + (i_837_ & 0xff00ff);
							int i_840_ = (i_839_ & 0x1000100) + (i_838_ - i_839_ & 0x10000);
							i_836_ = i_838_ - i_840_ | i_840_ - (i_840_ >>> 8);
							i_840_ = is_790_[i_789_];
							i_838_ = i_836_ + i_840_;
							i_839_ = (i_836_ & 0xff00ff) + (i_840_ & 0xff00ff);
							i_840_ = (i_839_ & 0x1000100) + (i_838_ - i_839_ & 0x10000);
							is_790_[i_789_] = i_838_ - i_840_ | i_840_ - (i_840_ >>> 8);
						} else if (i_791_ == 2) {
							int i_841_ = anIntArray10569[i_788_];
							if (i_841_ != 0) {
								int i_842_ = (i_841_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_843_ = (i_841_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_841_ = ((i_842_ | i_843_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_844_ = is_790_[i_789_];
								int i_845_ = i_841_ + i_844_;
								int i_846_ = (i_841_ & 0xff00ff) + (i_844_ & 0xff00ff);
								i_844_ = (i_846_ & 0x1000100) + (i_845_ - i_846_ & 0x10000);
								is_790_[i_789_] = i_845_ - i_844_ | i_844_ - (i_844_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_783_ += GLSprite_Sub2.anInt8913;
					i_784_ += GLSprite_Sub2.anInt8900;
				}
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else {
			for (int i_847_ = GLSprite_Sub2.anInt8888; i_847_ < 0; i_847_++) {
				int i_848_ = GLSprite_Sub2.anInt8882;
				int i_849_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
				int i_850_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
				int i_851_ = GLSprite_Sub2.anInt8894;
				if (i_849_ < 0) {
					int i_852_ = (GLSprite_Sub2.anInt8913 - 1 - i_849_) / GLSprite_Sub2.anInt8913;
					i_851_ += i_852_;
					i_849_ += GLSprite_Sub2.anInt8913 * i_852_;
					i_850_ += GLSprite_Sub2.anInt8900 * i_852_;
					i_848_ += i_852_;
				}
				int i_853_;
				if ((i_853_ = (1 + i_849_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_851_) {
					i_851_ = i_853_;
				}
				if (i_850_ < 0) {
					i_853_ = (GLSprite_Sub2.anInt8900 - 1 - i_850_) / GLSprite_Sub2.anInt8900;
					i_851_ += i_853_;
					i_849_ += GLSprite_Sub2.anInt8913 * i_853_;
					i_850_ += GLSprite_Sub2.anInt8900 * i_853_;
					i_848_ += i_853_;
				}
				if ((i_853_ = (1 + i_850_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_851_) {
					i_851_ = i_853_;
				}
				for (/**/; i_851_ < 0; i_851_++) {
					int i_854_ = (i_850_ >> 12) * anInt8893 + (i_849_ >> 12);
					int i_855_ = i_848_++;
					int[] is_856_ = is;
					int i_857_ = i;
					int i_858_ = i_324_;
					if (i_858_ == 0) {
						if (i_857_ == 1) {
							is_856_[i_855_] = anIntArray10569[i_854_];
						} else if (i_857_ == 0) {
							int i_859_ = anIntArray10569[i_854_++];
							int i_860_ = (i_859_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
							int i_861_ = (i_859_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
							int i_862_ = (i_859_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
							is_856_[i_855_] = (i_860_ | i_861_ | i_862_) >>> 8;
						} else if (i_857_ == 3) {
							int i_863_ = anIntArray10569[i_854_++];
							int i_864_ = GLSprite_Sub2.anInt8904;
							int i_865_ = i_863_ + i_864_;
							int i_866_ = (i_863_ & 0xff00ff) + (i_864_ & 0xff00ff);
							int i_867_ = (i_866_ & 0x1000100) + (i_865_ - i_866_ & 0x10000);
							is_856_[i_855_] = i_865_ - i_867_ | i_867_ - (i_867_ >>> 8);
						} else if (i_857_ == 2) {
							int i_868_ = anIntArray10569[i_854_];
							int i_869_ = (i_868_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
							int i_870_ = (i_868_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
							is_856_[i_855_] = ((i_869_ | i_870_) >>> 8) + GLSprite_Sub2.anInt8896;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_858_ == 1) {
						if (i_857_ == 1) {
							int i_871_ = anIntArray10569[i_854_];
							if (i_871_ != 0) {
								is_856_[i_855_] = i_871_;
							}
						} else if (i_857_ == 0) {
							int i_872_ = anIntArray10569[i_854_];
							if (i_872_ != 0) {
								if ((GLSprite_Sub2.anInt8904 & 0xffffff) == 16777215) {
									int i_873_ = GLSprite_Sub2.anInt8904 >>> 24;
									int i_874_ = 256 - i_873_;
									int i_875_ = is_856_[i_855_];
									is_856_[i_855_] = ((i_872_ & 0xff00ff) * i_873_ + (i_875_ & 0xff00ff) * i_874_ & ~0xff00ff) + ((i_872_ & 0xff00) * i_873_ + (i_875_ & 0xff00) * i_874_ & 0xff0000) >> 8;
								} else if (GLSprite_Sub2.anInt8895 != 255) {
									int i_876_ = (i_872_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_877_ = (i_872_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_878_ = (i_872_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									i_872_ = (i_876_ | i_877_ | i_878_) >>> 8;
									int i_879_ = is_856_[i_855_];
									is_856_[i_855_] = ((i_872_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_879_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_872_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_879_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
								} else {
									int i_880_ = (i_872_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
									int i_881_ = (i_872_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
									int i_882_ = (i_872_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
									is_856_[i_855_] = (i_880_ | i_881_ | i_882_) >>> 8;
								}
							}
						} else if (i_857_ == 3) {
							int i_883_ = anIntArray10569[i_854_];
							int i_884_ = GLSprite_Sub2.anInt8904;
							int i_885_ = i_883_ + i_884_;
							int i_886_ = (i_883_ & 0xff00ff) + (i_884_ & 0xff00ff);
							int i_887_ = (i_886_ & 0x1000100) + (i_885_ - i_886_ & 0x10000);
							i_887_ = i_885_ - i_887_ | i_887_ - (i_887_ >>> 8);
							if (i_883_ == 0 && GLSprite_Sub2.anInt8895 != 255) {
								i_883_ = i_887_;
								i_887_ = is_856_[i_855_];
								i_887_ = ((i_883_ & 0xff00ff) * GLSprite_Sub2.anInt8895 + (i_887_ & 0xff00ff) * GLSprite_Sub2.anInt8903 & ~0xff00ff) + ((i_883_ & 0xff00) * GLSprite_Sub2.anInt8895 + (i_887_ & 0xff00) * GLSprite_Sub2.anInt8903 & 0xff0000) >> 8;
							}
							is_856_[i_855_] = i_887_;
						} else if (i_857_ == 2) {
							int i_888_ = anIntArray10569[i_854_];
							if (i_888_ != 0) {
								int i_889_ = (i_888_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_890_ = (i_888_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								is_856_[i_855_++] = ((i_889_ | i_890_) >>> 8) + GLSprite_Sub2.anInt8896;
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_858_ == 2) {
						if (i_857_ == 1) {
							int i_891_ = anIntArray10569[i_854_];
							if (i_891_ != 0) {
								int i_892_ = is_856_[i_855_];
								int i_893_ = i_891_ + i_892_;
								int i_894_ = (i_891_ & 0xff00ff) + (i_892_ & 0xff00ff);
								i_892_ = (i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000);
								is_856_[i_855_] = i_893_ - i_892_ | i_892_ - (i_892_ >>> 8);
							}
						} else if (i_857_ == 0) {
							int i_895_ = anIntArray10569[i_854_];
							if (i_895_ != 0) {
								int i_896_ = (i_895_ & 0xff0000) * GLSprite_Sub2.anInt8910 & ~0xffffff;
								int i_897_ = (i_895_ & 0xff00) * GLSprite_Sub2.anInt8890 & 0xff0000;
								int i_898_ = (i_895_ & 0xff) * GLSprite_Sub2.anInt8906 & 0xff00;
								i_895_ = (i_896_ | i_897_ | i_898_) >>> 8;
								int i_899_ = is_856_[i_855_];
								int i_900_ = i_895_ + i_899_;
								int i_901_ = (i_895_ & 0xff00ff) + (i_899_ & 0xff00ff);
								i_899_ = (i_901_ & 0x1000100) + (i_900_ - i_901_ & 0x10000);
								is_856_[i_855_] = i_900_ - i_899_ | i_899_ - (i_899_ >>> 8);
							}
						} else if (i_857_ == 3) {
							int i_902_ = anIntArray10569[i_854_];
							int i_903_ = GLSprite_Sub2.anInt8904;
							int i_904_ = i_902_ + i_903_;
							int i_905_ = (i_902_ & 0xff00ff) + (i_903_ & 0xff00ff);
							int i_906_ = (i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000);
							i_902_ = i_904_ - i_906_ | i_906_ - (i_906_ >>> 8);
							i_906_ = is_856_[i_855_];
							i_904_ = i_902_ + i_906_;
							i_905_ = (i_902_ & 0xff00ff) + (i_906_ & 0xff00ff);
							i_906_ = (i_905_ & 0x1000100) + (i_904_ - i_905_ & 0x10000);
							is_856_[i_855_] = i_904_ - i_906_ | i_906_ - (i_906_ >>> 8);
						} else if (i_857_ == 2) {
							int i_907_ = anIntArray10569[i_854_];
							if (i_907_ != 0) {
								int i_908_ = (i_907_ & 0xff00ff) * GLSprite_Sub2.anInt8895 & ~0xff00ff;
								int i_909_ = (i_907_ & 0xff00) * GLSprite_Sub2.anInt8895 & 0xff0000;
								i_907_ = ((i_908_ | i_909_) >>> 8) + GLSprite_Sub2.anInt8896;
								int i_910_ = is_856_[i_855_];
								int i_911_ = i_907_ + i_910_;
								int i_912_ = (i_907_ & 0xff00ff) + (i_910_ & 0xff00ff);
								i_910_ = (i_912_ & 0x1000100) + (i_911_ - i_912_ & 0x10000);
								is_856_[i_855_] = i_911_ - i_910_ | i_910_ - (i_910_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_849_ += GLSprite_Sub2.anInt8913;
					i_850_ += GLSprite_Sub2.anInt8900;
				}
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		}
	}
	
	GLSprite_Sub2_Sub1(PureJavaToolkit purejavatoolkit, int i, int i_913_) {
		super(purejavatoolkit, i, i_913_);
		anIntArray10569 = new int[i * i_913_];
	}
	
	final void method1210(int[] is, int[] is_914_, int i, int i_915_) {
		int[] is_916_ = aPureJavaToolkit8886.anIntArray6787;
		if (GLSprite_Sub2.anInt8913 == 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_917_ = GLSprite_Sub2.anInt8888;
				while (i_917_ < 0) {
					int i_918_ = i_917_ + i_915_;
					if (i_918_ >= 0) {
						if (i_918_ >= is.length) {
							break;
						}
						int i_919_ = GLSprite_Sub2.anInt8882;
						int i_920_ = GLSprite_Sub2.anInt8901;
						int i_921_ = GLSprite_Sub2.anInt8908;
						int i_922_ = GLSprite_Sub2.anInt8894;
						if (i_920_ >= 0 && i_921_ >= 0 && i_920_ - (anInt8893 << 12) < 0 && i_921_ - (anInt8897 << 12) < 0) {
							int i_923_ = is[i_918_] - i;
							int i_924_ = -is_914_[i_918_];
							int i_925_ = i_923_ - (i_919_ - GLSprite_Sub2.anInt8882);
							if (i_925_ > 0) {
								i_919_ += i_925_;
								i_922_ += i_925_;
								i_920_ += GLSprite_Sub2.anInt8913 * i_925_;
								i_921_ += GLSprite_Sub2.anInt8900 * i_925_;
							} else {
								i_924_ -= i_925_;
							}
							if (i_922_ < i_924_) {
								i_922_ = i_924_;
							}
							for (/**/; i_922_ < 0; i_922_++) {
								int i_926_ = anIntArray10569[(i_921_ >> 12) * anInt8893 + (i_920_ >> 12)];
								if (i_926_ != 0) {
									is_916_[i_919_++] = i_926_;
								} else {
									i_919_++;
								}
							}
						}
					}
					i_917_++;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_927_ = GLSprite_Sub2.anInt8888;
				while (i_927_ < 0) {
					int i_928_ = i_927_ + i_915_;
					if (i_928_ >= 0) {
						if (i_928_ >= is.length) {
							break;
						}
						int i_929_ = GLSprite_Sub2.anInt8882;
						int i_930_ = GLSprite_Sub2.anInt8901;
						int i_931_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_932_ = GLSprite_Sub2.anInt8894;
						if (i_930_ >= 0 && i_930_ - (anInt8893 << 12) < 0) {
							int i_933_;
							if ((i_933_ = i_931_ - (anInt8897 << 12)) >= 0) {
								i_933_ = (GLSprite_Sub2.anInt8900 - i_933_) / GLSprite_Sub2.anInt8900;
								i_932_ += i_933_;
								i_931_ += GLSprite_Sub2.anInt8900 * i_933_;
								i_929_ += i_933_;
							}
							if ((i_933_ = (i_931_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_932_) {
								i_932_ = i_933_;
							}
							int i_934_ = is[i_928_] - i;
							int i_935_ = -is_914_[i_928_];
							int i_936_ = i_934_ - (i_929_ - GLSprite_Sub2.anInt8882);
							if (i_936_ > 0) {
								i_929_ += i_936_;
								i_932_ += i_936_;
								i_930_ += GLSprite_Sub2.anInt8913 * i_936_;
								i_931_ += GLSprite_Sub2.anInt8900 * i_936_;
							} else {
								i_935_ -= i_936_;
							}
							if (i_932_ < i_935_) {
								i_932_ = i_935_;
							}
							for (/**/; i_932_ < 0; i_932_++) {
								int i_937_ = anIntArray10569[(i_931_ >> 12) * anInt8893 + (i_930_ >> 12)];
								if (i_937_ != 0) {
									is_916_[i_929_++] = i_937_;
								} else {
									i_929_++;
								}
								i_931_ += GLSprite_Sub2.anInt8900;
							}
						}
					}
					i_927_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_938_ = GLSprite_Sub2.anInt8888;
				while (i_938_ < 0) {
					int i_939_ = i_938_ + i_915_;
					if (i_939_ >= 0) {
						if (i_939_ >= is.length) {
							break;
						}
						int i_940_ = GLSprite_Sub2.anInt8882;
						int i_941_ = GLSprite_Sub2.anInt8901;
						int i_942_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_943_ = GLSprite_Sub2.anInt8894;
						if (i_941_ >= 0 && i_941_ - (anInt8893 << 12) < 0) {
							if (i_942_ < 0) {
								int i_944_ = (GLSprite_Sub2.anInt8900 - 1 - i_942_) / GLSprite_Sub2.anInt8900;
								i_943_ += i_944_;
								i_942_ += GLSprite_Sub2.anInt8900 * i_944_;
								i_940_ += i_944_;
							}
							int i_945_;
							if ((i_945_ = (1 + i_942_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_943_) {
								i_943_ = i_945_;
							}
							int i_946_ = is[i_939_] - i;
							int i_947_ = -is_914_[i_939_];
							int i_948_ = i_946_ - (i_940_ - GLSprite_Sub2.anInt8882);
							if (i_948_ > 0) {
								i_940_ += i_948_;
								i_943_ += i_948_;
								i_941_ += GLSprite_Sub2.anInt8913 * i_948_;
								i_942_ += GLSprite_Sub2.anInt8900 * i_948_;
							} else {
								i_947_ -= i_948_;
							}
							if (i_943_ < i_947_) {
								i_943_ = i_947_;
							}
							for (/**/; i_943_ < 0; i_943_++) {
								int i_949_ = anIntArray10569[(i_942_ >> 12) * anInt8893 + (i_941_ >> 12)];
								if (i_949_ != 0) {
									is_916_[i_940_++] = i_949_;
								} else {
									i_940_++;
								}
								i_942_ += GLSprite_Sub2.anInt8900;
							}
						}
					}
					i_938_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8913 < 0) {
			if (GLSprite_Sub2.anInt8900 == 0) {
				int i_950_ = GLSprite_Sub2.anInt8888;
				while (i_950_ < 0) {
					int i_951_ = i_950_ + i_915_;
					if (i_951_ >= 0) {
						if (i_951_ >= is.length) {
							break;
						}
						int i_952_ = GLSprite_Sub2.anInt8882;
						int i_953_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_954_ = GLSprite_Sub2.anInt8908;
						int i_955_ = GLSprite_Sub2.anInt8894;
						if (i_954_ >= 0 && i_954_ - (anInt8897 << 12) < 0) {
							int i_956_;
							if ((i_956_ = i_953_ - (anInt8893 << 12)) >= 0) {
								i_956_ = (GLSprite_Sub2.anInt8913 - i_956_) / GLSprite_Sub2.anInt8913;
								i_955_ += i_956_;
								i_953_ += GLSprite_Sub2.anInt8913 * i_956_;
								i_952_ += i_956_;
							}
							if ((i_956_ = (i_953_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_955_) {
								i_955_ = i_956_;
							}
							int i_957_ = is[i_951_] - i;
							int i_958_ = -is_914_[i_951_];
							int i_959_ = i_957_ - (i_952_ - GLSprite_Sub2.anInt8882);
							if (i_959_ > 0) {
								i_952_ += i_959_;
								i_955_ += i_959_;
								i_953_ += GLSprite_Sub2.anInt8913 * i_959_;
								i_954_ += GLSprite_Sub2.anInt8900 * i_959_;
							} else {
								i_958_ -= i_959_;
							}
							if (i_955_ < i_958_) {
								i_955_ = i_958_;
							}
							for (/**/; i_955_ < 0; i_955_++) {
								int i_960_ = anIntArray10569[(i_954_ >> 12) * anInt8893 + (i_953_ >> 12)];
								if (i_960_ != 0) {
									is_916_[i_952_++] = i_960_;
								} else {
									i_952_++;
								}
								i_953_ += GLSprite_Sub2.anInt8913;
							}
						}
					}
					i_950_++;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else if (GLSprite_Sub2.anInt8900 < 0) {
				int i_961_ = GLSprite_Sub2.anInt8888;
				while (i_961_ < 0) {
					int i_962_ = i_961_ + i_915_;
					if (i_962_ >= 0) {
						if (i_962_ >= is.length) {
							break;
						}
						int i_963_ = GLSprite_Sub2.anInt8882;
						int i_964_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_965_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_966_ = GLSprite_Sub2.anInt8894;
						int i_967_;
						if ((i_967_ = i_964_ - (anInt8893 << 12)) >= 0) {
							i_967_ = (GLSprite_Sub2.anInt8913 - i_967_) / GLSprite_Sub2.anInt8913;
							i_966_ += i_967_;
							i_964_ += GLSprite_Sub2.anInt8913 * i_967_;
							i_965_ += GLSprite_Sub2.anInt8900 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (i_964_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_966_) {
							i_966_ = i_967_;
						}
						if ((i_967_ = i_965_ - (anInt8897 << 12)) >= 0) {
							i_967_ = (GLSprite_Sub2.anInt8900 - i_967_) / GLSprite_Sub2.anInt8900;
							i_966_ += i_967_;
							i_964_ += GLSprite_Sub2.anInt8913 * i_967_;
							i_965_ += GLSprite_Sub2.anInt8900 * i_967_;
							i_963_ += i_967_;
						}
						if ((i_967_ = (i_965_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_966_) {
							i_966_ = i_967_;
						}
						int i_968_ = is[i_962_] - i;
						int i_969_ = -is_914_[i_962_];
						int i_970_ = i_968_ - (i_963_ - GLSprite_Sub2.anInt8882);
						if (i_970_ > 0) {
							i_963_ += i_970_;
							i_966_ += i_970_;
							i_964_ += GLSprite_Sub2.anInt8913 * i_970_;
							i_965_ += GLSprite_Sub2.anInt8900 * i_970_;
						} else {
							i_969_ -= i_970_;
						}
						if (i_966_ < i_969_) {
							i_966_ = i_969_;
						}
						for (/**/; i_966_ < 0; i_966_++) {
							int i_971_ = anIntArray10569[(i_965_ >> 12) * anInt8893 + (i_964_ >> 12)];
							if (i_971_ != 0) {
								is_916_[i_963_++] = i_971_;
							} else {
								i_963_++;
							}
							i_964_ += GLSprite_Sub2.anInt8913;
							i_965_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_961_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			} else {
				int i_972_ = GLSprite_Sub2.anInt8888;
				while (i_972_ < 0) {
					int i_973_ = i_972_ + i_915_;
					if (i_973_ >= 0) {
						if (i_973_ >= is.length) {
							break;
						}
						int i_974_ = GLSprite_Sub2.anInt8882;
						int i_975_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
						int i_976_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
						int i_977_ = GLSprite_Sub2.anInt8894;
						int i_978_;
						if ((i_978_ = i_975_ - (anInt8893 << 12)) >= 0) {
							i_978_ = (GLSprite_Sub2.anInt8913 - i_978_) / GLSprite_Sub2.anInt8913;
							i_977_ += i_978_;
							i_975_ += GLSprite_Sub2.anInt8913 * i_978_;
							i_976_ += GLSprite_Sub2.anInt8900 * i_978_;
							i_974_ += i_978_;
						}
						if ((i_978_ = (i_975_ - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_977_) {
							i_977_ = i_978_;
						}
						if (i_976_ < 0) {
							i_978_ = (GLSprite_Sub2.anInt8900 - 1 - i_976_) / GLSprite_Sub2.anInt8900;
							i_977_ += i_978_;
							i_975_ += GLSprite_Sub2.anInt8913 * i_978_;
							i_976_ += GLSprite_Sub2.anInt8900 * i_978_;
							i_974_ += i_978_;
						}
						if ((i_978_ = (1 + i_976_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_977_) {
							i_977_ = i_978_;
						}
						int i_979_ = is[i_973_] - i;
						int i_980_ = -is_914_[i_973_];
						int i_981_ = i_979_ - (i_974_ - GLSprite_Sub2.anInt8882);
						if (i_981_ > 0) {
							i_974_ += i_981_;
							i_977_ += i_981_;
							i_975_ += GLSprite_Sub2.anInt8913 * i_981_;
							i_976_ += GLSprite_Sub2.anInt8900 * i_981_;
						} else {
							i_980_ -= i_981_;
						}
						if (i_977_ < i_980_) {
							i_977_ = i_980_;
						}
						for (/**/; i_977_ < 0; i_977_++) {
							int i_982_ = anIntArray10569[(i_976_ >> 12) * anInt8893 + (i_975_ >> 12)];
							if (i_982_ != 0) {
								is_916_[i_974_++] = i_982_;
							} else {
								i_974_++;
							}
							i_975_ += GLSprite_Sub2.anInt8913;
							i_976_ += GLSprite_Sub2.anInt8900;
						}
					}
					i_972_++;
					GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
					GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
					GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
				}
			}
		} else if (GLSprite_Sub2.anInt8900 == 0) {
			int i_983_ = GLSprite_Sub2.anInt8888;
			while (i_983_ < 0) {
				int i_984_ = i_983_ + i_915_;
				if (i_984_ >= 0) {
					if (i_984_ >= is.length) {
						break;
					}
					int i_985_ = GLSprite_Sub2.anInt8882;
					int i_986_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_987_ = GLSprite_Sub2.anInt8908;
					int i_988_ = GLSprite_Sub2.anInt8894;
					if (i_987_ >= 0 && i_987_ - (anInt8897 << 12) < 0) {
						if (i_986_ < 0) {
							int i_989_ = (GLSprite_Sub2.anInt8913 - 1 - i_986_) / GLSprite_Sub2.anInt8913;
							i_988_ += i_989_;
							i_986_ += GLSprite_Sub2.anInt8913 * i_989_;
							i_985_ += i_989_;
						}
						int i_990_;
						if ((i_990_ = (1 + i_986_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_988_) {
							i_988_ = i_990_;
						}
						int i_991_ = is[i_984_] - i;
						int i_992_ = -is_914_[i_984_];
						int i_993_ = i_991_ - (i_985_ - GLSprite_Sub2.anInt8882);
						if (i_993_ > 0) {
							i_985_ += i_993_;
							i_988_ += i_993_;
							i_986_ += GLSprite_Sub2.anInt8913 * i_993_;
							i_987_ += GLSprite_Sub2.anInt8900 * i_993_;
						} else {
							i_992_ -= i_993_;
						}
						if (i_988_ < i_992_) {
							i_988_ = i_992_;
						}
						for (/**/; i_988_ < 0; i_988_++) {
							int i_994_ = anIntArray10569[(i_987_ >> 12) * anInt8893 + (i_986_ >> 12)];
							if (i_994_ != 0) {
								is_916_[i_985_++] = i_994_;
							} else {
								i_985_++;
							}
							i_986_ += GLSprite_Sub2.anInt8913;
						}
					}
				}
				i_983_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else if (GLSprite_Sub2.anInt8900 < 0) {
			int i_995_ = GLSprite_Sub2.anInt8888;
			while (i_995_ < 0) {
				int i_996_ = i_995_ + i_915_;
				if (i_996_ >= 0) {
					if (i_996_ >= is.length) {
						break;
					}
					int i_997_ = GLSprite_Sub2.anInt8882;
					int i_998_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_999_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_1000_ = GLSprite_Sub2.anInt8894;
					if (i_998_ < 0) {
						int i_1001_ = (GLSprite_Sub2.anInt8913 - 1 - i_998_) / GLSprite_Sub2.anInt8913;
						i_1000_ += i_1001_;
						i_998_ += GLSprite_Sub2.anInt8913 * i_1001_;
						i_999_ += GLSprite_Sub2.anInt8900 * i_1001_;
						i_997_ += i_1001_;
					}
					int i_1002_;
					if ((i_1002_ = (1 + i_998_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1000_) {
						i_1000_ = i_1002_;
					}
					if ((i_1002_ = i_999_ - (anInt8897 << 12)) >= 0) {
						i_1002_ = (GLSprite_Sub2.anInt8900 - i_1002_) / GLSprite_Sub2.anInt8900;
						i_1000_ += i_1002_;
						i_998_ += GLSprite_Sub2.anInt8913 * i_1002_;
						i_999_ += GLSprite_Sub2.anInt8900 * i_1002_;
						i_997_ += i_1002_;
					}
					if ((i_1002_ = (i_999_ - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1000_) {
						i_1000_ = i_1002_;
					}
					int i_1003_ = is[i_996_] - i;
					int i_1004_ = -is_914_[i_996_];
					int i_1005_ = i_1003_ - (i_997_ - GLSprite_Sub2.anInt8882);
					if (i_1005_ > 0) {
						i_997_ += i_1005_;
						i_1000_ += i_1005_;
						i_998_ += GLSprite_Sub2.anInt8913 * i_1005_;
						i_999_ += GLSprite_Sub2.anInt8900 * i_1005_;
					} else {
						i_1004_ -= i_1005_;
					}
					if (i_1000_ < i_1004_) {
						i_1000_ = i_1004_;
					}
					for (/**/; i_1000_ < 0; i_1000_++) {
						int i_1006_ = anIntArray10569[(i_999_ >> 12) * anInt8893 + (i_998_ >> 12)];
						if (i_1006_ != 0) {
							is_916_[i_997_++] = i_1006_;
						} else {
							i_997_++;
						}
						i_998_ += GLSprite_Sub2.anInt8913;
						i_999_ += GLSprite_Sub2.anInt8900;
					}
				}
				i_995_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		} else {
			int i_1007_ = GLSprite_Sub2.anInt8888;
			while (i_1007_ < 0) {
				int i_1008_ = i_1007_ + i_915_;
				if (i_1008_ >= 0) {
					if (i_1008_ >= is.length) {
						break;
					}
					int i_1009_ = GLSprite_Sub2.anInt8882;
					int i_1010_ = GLSprite_Sub2.anInt8901 + GLSprite_Sub2.anInt8909;
					int i_1011_ = GLSprite_Sub2.anInt8908 + GLSprite_Sub2.anInt8907;
					int i_1012_ = GLSprite_Sub2.anInt8894;
					if (i_1010_ < 0) {
						int i_1013_ = (GLSprite_Sub2.anInt8913 - 1 - i_1010_) / GLSprite_Sub2.anInt8913;
						i_1012_ += i_1013_;
						i_1010_ += GLSprite_Sub2.anInt8913 * i_1013_;
						i_1011_ += GLSprite_Sub2.anInt8900 * i_1013_;
						i_1009_ += i_1013_;
					}
					int i_1014_;
					if ((i_1014_ = (1 + i_1010_ - (anInt8893 << 12) - GLSprite_Sub2.anInt8913) / GLSprite_Sub2.anInt8913) > i_1012_) {
						i_1012_ = i_1014_;
					}
					if (i_1011_ < 0) {
						i_1014_ = (GLSprite_Sub2.anInt8900 - 1 - i_1011_) / GLSprite_Sub2.anInt8900;
						i_1012_ += i_1014_;
						i_1010_ += GLSprite_Sub2.anInt8913 * i_1014_;
						i_1011_ += GLSprite_Sub2.anInt8900 * i_1014_;
						i_1009_ += i_1014_;
					}
					if ((i_1014_ = (1 + i_1011_ - (anInt8897 << 12) - GLSprite_Sub2.anInt8900) / GLSprite_Sub2.anInt8900) > i_1012_) {
						i_1012_ = i_1014_;
					}
					int i_1015_ = is[i_1008_] - i;
					int i_1016_ = -is_914_[i_1008_];
					int i_1017_ = i_1015_ - (i_1009_ - GLSprite_Sub2.anInt8882);
					if (i_1017_ > 0) {
						i_1009_ += i_1017_;
						i_1012_ += i_1017_;
						i_1010_ += GLSprite_Sub2.anInt8913 * i_1017_;
						i_1011_ += GLSprite_Sub2.anInt8900 * i_1017_;
					} else {
						i_1016_ -= i_1017_;
					}
					if (i_1012_ < i_1016_) {
						i_1012_ = i_1016_;
					}
					for (/**/; i_1012_ < 0; i_1012_++) {
						int i_1018_ = anIntArray10569[(i_1011_ >> 12) * anInt8893 + (i_1010_ >> 12)];
						if (i_1018_ != 0) {
							is_916_[i_1009_++] = i_1018_;
						} else {
							i_1009_++;
						}
						i_1010_ += GLSprite_Sub2.anInt8913;
						i_1011_ += GLSprite_Sub2.anInt8900;
					}
				}
				i_1007_++;
				GLSprite_Sub2.anInt8901 += GLSprite_Sub2.anInt8902;
				GLSprite_Sub2.anInt8908 += GLSprite_Sub2.anInt8883;
				GLSprite_Sub2.anInt8882 += GLSprite_Sub2.anInt8881;
			}
		}
	}
	
	GLSprite_Sub2_Sub1(PureJavaToolkit purejavatoolkit, int[] is, int i, int i_1019_, int i_1020_, int i_1021_, boolean bool) {
		super(purejavatoolkit, i_1020_, i_1021_);
		if (bool) {
			anIntArray10569 = new int[i_1020_ * i_1021_];
		} else {
			anIntArray10569 = is;
		}
		i_1019_ -= anInt8893;
		int i_1022_ = 0;
		for (int i_1023_ = 0; i_1023_ < i_1021_; i_1023_++) {
			for (int i_1024_ = 0; i_1024_ < i_1020_; i_1024_++) {
				int i_1025_ = is[i++];
				if (i_1025_ >>> 24 == 255) {
					anIntArray10569[i_1022_++] = (i_1025_ & 0xffffff) == 0 ? -16777215 : i_1025_;
				} else {
					anIntArray10569[i_1022_++] = 0;
				}
			}
			i += i_1019_;
		}
	}
	
	final void method1184(int i, int i_1026_, int i_1027_, int i_1028_, int i_1029_, int i_1030_, int i_1031_, int i_1032_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		if (i_1027_ > 0 && i_1028_ > 0) {
			int i_1033_ = 0;
			int i_1034_ = 0;
			int i_1035_ = aPureJavaToolkit8886.anInt6789;
			int i_1036_ = anInt8889 + anInt8893 + anInt8885;
			int i_1037_ = anInt8899 + anInt8897 + anInt8884;
			int i_1038_ = (i_1036_ << 16) / i_1027_;
			int i_1039_ = (i_1037_ << 16) / i_1028_;
			if (anInt8889 > 0) {
				int i_1040_ = ((anInt8889 << 16) + i_1038_ - 1) / i_1038_;
				i += i_1040_;
				i_1033_ += i_1040_ * i_1038_ - (anInt8889 << 16);
			}
			if (anInt8899 > 0) {
				int i_1041_ = ((anInt8899 << 16) + i_1039_ - 1) / i_1039_;
				i_1026_ += i_1041_;
				i_1034_ += i_1041_ * i_1039_ - (anInt8899 << 16);
			}
			if (anInt8893 < i_1036_) {
				i_1027_ = ((anInt8893 << 16) - i_1033_ + i_1038_ - 1) / i_1038_;
			}
			if (anInt8897 < i_1037_) {
				i_1028_ = ((anInt8897 << 16) - i_1034_ + i_1039_ - 1) / i_1039_;
			}
			int i_1042_ = i + i_1026_ * i_1035_;
			int i_1043_ = i_1035_ - i_1027_;
			if (i_1026_ + i_1028_ > aPureJavaToolkit8886.anInt6772) {
				i_1028_ -= i_1026_ + i_1028_ - aPureJavaToolkit8886.anInt6772;
			}
			if (i_1026_ < aPureJavaToolkit8886.anInt6760) {
				int i_1044_ = aPureJavaToolkit8886.anInt6760 - i_1026_;
				i_1028_ -= i_1044_;
				i_1042_ += i_1044_ * i_1035_;
				i_1034_ += i_1039_ * i_1044_;
			}
			if (i + i_1027_ > aPureJavaToolkit8886.anInt6778) {
				int i_1045_ = i + i_1027_ - aPureJavaToolkit8886.anInt6778;
				i_1027_ -= i_1045_;
				i_1043_ += i_1045_;
			}
			if (i < aPureJavaToolkit8886.anInt6767) {
				int i_1046_ = aPureJavaToolkit8886.anInt6767 - i;
				i_1027_ -= i_1046_;
				i_1042_ += i_1046_;
				i_1033_ += i_1038_ * i_1046_;
				i_1043_ += i_1046_;
			}
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_1031_ == 0) {
				if (i_1029_ == 1) {
					int i_1047_ = i_1033_;
					for (int i_1048_ = -i_1028_; i_1048_ < 0; i_1048_++) {
						int i_1049_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1050_ = -i_1027_; i_1050_ < 0; i_1050_++) {
							is[i_1042_++] = anIntArray10569[(i_1033_ >> 16) + i_1049_];
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1047_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 0) {
					int i_1051_ = (i_1030_ & 0xff0000) >> 16;
					int i_1052_ = (i_1030_ & 0xff00) >> 8;
					int i_1053_ = i_1030_ & 0xff;
					int i_1054_ = i_1033_;
					for (int i_1055_ = -i_1028_; i_1055_ < 0; i_1055_++) {
						int i_1056_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1057_ = -i_1027_; i_1057_ < 0; i_1057_++) {
							int i_1058_ = anIntArray10569[(i_1033_ >> 16) + i_1056_];
							int i_1059_ = (i_1058_ & 0xff0000) * i_1051_ & ~0xffffff;
							int i_1060_ = (i_1058_ & 0xff00) * i_1052_ & 0xff0000;
							int i_1061_ = (i_1058_ & 0xff) * i_1053_ & 0xff00;
							is[i_1042_++] = (i_1059_ | i_1060_ | i_1061_) >>> 8;
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1054_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 3) {
					int i_1062_ = i_1033_;
					for (int i_1063_ = -i_1028_; i_1063_ < 0; i_1063_++) {
						int i_1064_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1065_ = -i_1027_; i_1065_ < 0; i_1065_++) {
							int i_1066_ = anIntArray10569[(i_1033_ >> 16) + i_1064_];
							int i_1067_ = i_1066_ + i_1030_;
							int i_1068_ = (i_1066_ & 0xff00ff) + (i_1030_ & 0xff00ff);
							int i_1069_ = (i_1068_ & 0x1000100) + (i_1067_ - i_1068_ & 0x10000);
							is[i_1042_++] = i_1067_ - i_1069_ | i_1069_ - (i_1069_ >>> 8);
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1062_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 2) {
					int i_1070_ = i_1030_ >>> 24;
					int i_1071_ = 256 - i_1070_;
					int i_1072_ = (i_1030_ & 0xff00ff) * i_1071_ & ~0xff00ff;
					int i_1073_ = (i_1030_ & 0xff00) * i_1071_ & 0xff0000;
					i_1030_ = (i_1072_ | i_1073_) >>> 8;
					int i_1074_ = i_1033_;
					for (int i_1075_ = -i_1028_; i_1075_ < 0; i_1075_++) {
						int i_1076_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1077_ = -i_1027_; i_1077_ < 0; i_1077_++) {
							int i_1078_ = anIntArray10569[(i_1033_ >> 16) + i_1076_];
							i_1072_ = (i_1078_ & 0xff00ff) * i_1070_ & ~0xff00ff;
							i_1073_ = (i_1078_ & 0xff00) * i_1070_ & 0xff0000;
							is[i_1042_++] = ((i_1072_ | i_1073_) >>> 8) + i_1030_;
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1074_;
						i_1042_ += i_1043_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1031_ == 1) {
				if (i_1029_ == 1) {
					int i_1079_ = i_1033_;
					for (int i_1080_ = -i_1028_; i_1080_ < 0; i_1080_++) {
						int i_1081_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1082_ = -i_1027_; i_1082_ < 0; i_1082_++) {
							int i_1083_ = anIntArray10569[(i_1033_ >> 16) + i_1081_];
							if (i_1083_ != 0) {
								is[i_1042_++] = i_1083_;
							} else {
								i_1042_++;
							}
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1079_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 0) {
					int i_1084_ = i_1033_;
					if ((i_1030_ & 0xffffff) == 16777215) {
						int i_1085_ = i_1030_ >>> 24;
						int i_1086_ = 256 - i_1085_;
						for (int i_1087_ = -i_1028_; i_1087_ < 0; i_1087_++) {
							int i_1088_ = (i_1034_ >> 16) * anInt8893;
							for (int i_1089_ = -i_1027_; i_1089_ < 0; i_1089_++) {
								int i_1090_ = anIntArray10569[(i_1033_ >> 16) + i_1088_];
								if (i_1090_ != 0) {
									int i_1091_ = is[i_1042_];
									is[i_1042_++] = ((i_1090_ & 0xff00ff) * i_1085_ + (i_1091_ & 0xff00ff) * i_1086_ & ~0xff00ff) + ((i_1090_ & 0xff00) * i_1085_ + (i_1091_ & 0xff00) * i_1086_ & 0xff0000) >> 8;
								} else {
									i_1042_++;
								}
								i_1033_ += i_1038_;
							}
							i_1034_ += i_1039_;
							i_1033_ = i_1084_;
							i_1042_ += i_1043_;
						}
					} else {
						int i_1092_ = (i_1030_ & 0xff0000) >> 16;
						int i_1093_ = (i_1030_ & 0xff00) >> 8;
						int i_1094_ = i_1030_ & 0xff;
						int i_1095_ = i_1030_ >>> 24;
						int i_1096_ = 256 - i_1095_;
						for (int i_1097_ = -i_1028_; i_1097_ < 0; i_1097_++) {
							int i_1098_ = (i_1034_ >> 16) * anInt8893;
							for (int i_1099_ = -i_1027_; i_1099_ < 0; i_1099_++) {
								int i_1100_ = anIntArray10569[(i_1033_ >> 16) + i_1098_];
								if (i_1100_ != 0) {
									if (i_1095_ != 255) {
										int i_1101_ = (i_1100_ & 0xff0000) * i_1092_ & ~0xffffff;
										int i_1102_ = (i_1100_ & 0xff00) * i_1093_ & 0xff0000;
										int i_1103_ = (i_1100_ & 0xff) * i_1094_ & 0xff00;
										i_1100_ = (i_1101_ | i_1102_ | i_1103_) >>> 8;
										int i_1104_ = is[i_1042_];
										is[i_1042_++] = ((i_1100_ & 0xff00ff) * i_1095_ + (i_1104_ & 0xff00ff) * i_1096_ & ~0xff00ff) + ((i_1100_ & 0xff00) * i_1095_ + (i_1104_ & 0xff00) * i_1096_ & 0xff0000) >> 8;
									} else {
										int i_1105_ = (i_1100_ & 0xff0000) * i_1092_ & ~0xffffff;
										int i_1106_ = (i_1100_ & 0xff00) * i_1093_ & 0xff0000;
										int i_1107_ = (i_1100_ & 0xff) * i_1094_ & 0xff00;
										is[i_1042_++] = (i_1105_ | i_1106_ | i_1107_) >>> 8;
									}
								} else {
									i_1042_++;
								}
								i_1033_ += i_1038_;
							}
							i_1034_ += i_1039_;
							i_1033_ = i_1084_;
							i_1042_ += i_1043_;
						}
						return;
					}
					return;
				}
				if (i_1029_ == 3) {
					int i_1108_ = i_1033_;
					int i_1109_ = i_1030_ >>> 24;
					int i_1110_ = 256 - i_1109_;
					for (int i_1111_ = -i_1028_; i_1111_ < 0; i_1111_++) {
						int i_1112_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1113_ = -i_1027_; i_1113_ < 0; i_1113_++) {
							int i_1114_ = anIntArray10569[(i_1033_ >> 16) + i_1112_];
							int i_1115_ = i_1114_ + i_1030_;
							int i_1116_ = (i_1114_ & 0xff00ff) + (i_1030_ & 0xff00ff);
							int i_1117_ = (i_1116_ & 0x1000100) + (i_1115_ - i_1116_ & 0x10000);
							i_1117_ = i_1115_ - i_1117_ | i_1117_ - (i_1117_ >>> 8);
							if (i_1114_ == 0 && i_1109_ != 255) {
								i_1114_ = i_1117_;
								i_1117_ = is[i_1042_];
								i_1117_ = ((i_1114_ & 0xff00ff) * i_1109_ + (i_1117_ & 0xff00ff) * i_1110_ & ~0xff00ff) + ((i_1114_ & 0xff00) * i_1109_ + (i_1117_ & 0xff00) * i_1110_ & 0xff0000) >> 8;
							}
							is[i_1042_++] = i_1117_;
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1108_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 2) {
					int i_1118_ = i_1030_ >>> 24;
					int i_1119_ = 256 - i_1118_;
					int i_1120_ = (i_1030_ & 0xff00ff) * i_1119_ & ~0xff00ff;
					int i_1121_ = (i_1030_ & 0xff00) * i_1119_ & 0xff0000;
					i_1030_ = (i_1120_ | i_1121_) >>> 8;
					int i_1122_ = i_1033_;
					for (int i_1123_ = -i_1028_; i_1123_ < 0; i_1123_++) {
						int i_1124_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1125_ = -i_1027_; i_1125_ < 0; i_1125_++) {
							int i_1126_ = anIntArray10569[(i_1033_ >> 16) + i_1124_];
							if (i_1126_ != 0) {
								i_1120_ = (i_1126_ & 0xff00ff) * i_1118_ & ~0xff00ff;
								i_1121_ = (i_1126_ & 0xff00) * i_1118_ & 0xff0000;
								is[i_1042_++] = ((i_1120_ | i_1121_) >>> 8) + i_1030_;
							} else {
								i_1042_++;
							}
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1122_;
						i_1042_ += i_1043_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1031_ == 2) {
				if (i_1029_ == 1) {
					int i_1127_ = i_1033_;
					for (int i_1128_ = -i_1028_; i_1128_ < 0; i_1128_++) {
						int i_1129_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1130_ = -i_1027_; i_1130_ < 0; i_1130_++) {
							int i_1131_ = anIntArray10569[(i_1033_ >> 16) + i_1129_];
							if (i_1131_ != 0) {
								int i_1132_ = is[i_1042_];
								int i_1133_ = i_1131_ + i_1132_;
								int i_1134_ = (i_1131_ & 0xff00ff) + (i_1132_ & 0xff00ff);
								i_1132_ = (i_1134_ & 0x1000100) + (i_1133_ - i_1134_ & 0x10000);
								is[i_1042_++] = i_1133_ - i_1132_ | i_1132_ - (i_1132_ >>> 8);
							} else {
								i_1042_++;
							}
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1127_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 0) {
					int i_1135_ = i_1033_;
					int i_1136_ = (i_1030_ & 0xff0000) >> 16;
					int i_1137_ = (i_1030_ & 0xff00) >> 8;
					int i_1138_ = i_1030_ & 0xff;
					for (int i_1139_ = -i_1028_; i_1139_ < 0; i_1139_++) {
						int i_1140_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1141_ = -i_1027_; i_1141_ < 0; i_1141_++) {
							int i_1142_ = anIntArray10569[(i_1033_ >> 16) + i_1140_];
							if (i_1142_ != 0) {
								int i_1143_ = (i_1142_ & 0xff0000) * i_1136_ & ~0xffffff;
								int i_1144_ = (i_1142_ & 0xff00) * i_1137_ & 0xff0000;
								int i_1145_ = (i_1142_ & 0xff) * i_1138_ & 0xff00;
								i_1142_ = (i_1143_ | i_1144_ | i_1145_) >>> 8;
								int i_1146_ = is[i_1042_];
								int i_1147_ = i_1142_ + i_1146_;
								int i_1148_ = (i_1142_ & 0xff00ff) + (i_1146_ & 0xff00ff);
								i_1146_ = (i_1148_ & 0x1000100) + (i_1147_ - i_1148_ & 0x10000);
								is[i_1042_++] = i_1147_ - i_1146_ | i_1146_ - (i_1146_ >>> 8);
							} else {
								i_1042_++;
							}
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1135_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 3) {
					int i_1149_ = i_1033_;
					for (int i_1150_ = -i_1028_; i_1150_ < 0; i_1150_++) {
						int i_1151_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1152_ = -i_1027_; i_1152_ < 0; i_1152_++) {
							int i_1153_ = anIntArray10569[(i_1033_ >> 16) + i_1151_];
							int i_1154_ = i_1153_ + i_1030_;
							int i_1155_ = (i_1153_ & 0xff00ff) + (i_1030_ & 0xff00ff);
							int i_1156_ = (i_1155_ & 0x1000100) + (i_1154_ - i_1155_ & 0x10000);
							i_1153_ = i_1154_ - i_1156_ | i_1156_ - (i_1156_ >>> 8);
							i_1156_ = is[i_1042_];
							i_1154_ = i_1153_ + i_1156_;
							i_1155_ = (i_1153_ & 0xff00ff) + (i_1156_ & 0xff00ff);
							i_1156_ = (i_1155_ & 0x1000100) + (i_1154_ - i_1155_ & 0x10000);
							is[i_1042_++] = i_1154_ - i_1156_ | i_1156_ - (i_1156_ >>> 8);
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1149_;
						i_1042_ += i_1043_;
					}
					return;
				}
				if (i_1029_ == 2) {
					int i_1157_ = i_1030_ >>> 24;
					int i_1158_ = 256 - i_1157_;
					int i_1159_ = (i_1030_ & 0xff00ff) * i_1158_ & ~0xff00ff;
					int i_1160_ = (i_1030_ & 0xff00) * i_1158_ & 0xff0000;
					i_1030_ = (i_1159_ | i_1160_) >>> 8;
					int i_1161_ = i_1033_;
					for (int i_1162_ = -i_1028_; i_1162_ < 0; i_1162_++) {
						int i_1163_ = (i_1034_ >> 16) * anInt8893;
						for (int i_1164_ = -i_1027_; i_1164_ < 0; i_1164_++) {
							int i_1165_ = anIntArray10569[(i_1033_ >> 16) + i_1163_];
							if (i_1165_ != 0) {
								i_1159_ = (i_1165_ & 0xff00ff) * i_1157_ & ~0xff00ff;
								i_1160_ = (i_1165_ & 0xff00) * i_1157_ & 0xff0000;
								i_1165_ = ((i_1159_ | i_1160_) >>> 8) + i_1030_;
								int i_1166_ = is[i_1042_];
								int i_1167_ = i_1165_ + i_1166_;
								int i_1168_ = (i_1165_ & 0xff00ff) + (i_1166_ & 0xff00ff);
								i_1166_ = (i_1168_ & 0x1000100) + (i_1167_ - i_1168_ & 0x10000);
								is[i_1042_++] = i_1167_ - i_1166_ | i_1166_ - (i_1166_ >>> 8);
							} else {
								i_1042_++;
							}
							i_1033_ += i_1038_;
						}
						i_1034_ += i_1039_;
						i_1033_ = i_1161_;
						i_1042_ += i_1043_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
	
	final void method1191(int i, int i_1169_, int i_1170_, int i_1171_, int i_1172_) {
		if (aPureJavaToolkit8886.method1492()) {
			throw new IllegalStateException();
		}
		int i_1173_ = aPureJavaToolkit8886.anInt6789;
		i += anInt8889;
		i_1169_ += anInt8899;
		int i_1174_ = i_1169_ * i_1173_ + i;
		int i_1175_ = 0;
		int i_1176_ = anInt8897;
		int i_1177_ = anInt8893;
		int i_1178_ = i_1173_ - i_1177_;
		int i_1179_ = 0;
		if (i_1169_ < aPureJavaToolkit8886.anInt6760) {
			int i_1180_ = aPureJavaToolkit8886.anInt6760 - i_1169_;
			i_1176_ -= i_1180_;
			i_1169_ = aPureJavaToolkit8886.anInt6760;
			i_1175_ += i_1180_ * i_1177_;
			i_1174_ += i_1180_ * i_1173_;
		}
		if (i_1169_ + i_1176_ > aPureJavaToolkit8886.anInt6772) {
			i_1176_ -= i_1169_ + i_1176_ - aPureJavaToolkit8886.anInt6772;
		}
		if (i < aPureJavaToolkit8886.anInt6767) {
			int i_1181_ = aPureJavaToolkit8886.anInt6767 - i;
			i_1177_ -= i_1181_;
			i = aPureJavaToolkit8886.anInt6767;
			i_1175_ += i_1181_;
			i_1174_ += i_1181_;
			i_1179_ += i_1181_;
			i_1178_ += i_1181_;
		}
		if (i + i_1177_ > aPureJavaToolkit8886.anInt6778) {
			int i_1182_ = i + i_1177_ - aPureJavaToolkit8886.anInt6778;
			i_1177_ -= i_1182_;
			i_1179_ += i_1182_;
			i_1178_ += i_1182_;
		}
		if (i_1177_ > 0 && i_1176_ > 0) {
			int[] is = aPureJavaToolkit8886.anIntArray6787;
			if (i_1172_ == 0) {
				if (i_1170_ == 1) {
					for (int i_1183_ = -i_1176_; i_1183_ < 0; i_1183_++) {
						int i_1184_ = i_1174_ + i_1177_ - 3;
						while (i_1174_ < i_1184_) {
							is[i_1174_++] = anIntArray10569[i_1175_++];
							is[i_1174_++] = anIntArray10569[i_1175_++];
							is[i_1174_++] = anIntArray10569[i_1175_++];
							is[i_1174_++] = anIntArray10569[i_1175_++];
						}
						i_1184_ += 3;
						while (i_1174_ < i_1184_)
							is[i_1174_++] = anIntArray10569[i_1175_++];
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 0) {
					int i_1185_ = (i_1171_ & 0xff0000) >> 16;
					int i_1186_ = (i_1171_ & 0xff00) >> 8;
					int i_1187_ = i_1171_ & 0xff;
					for (int i_1188_ = -i_1176_; i_1188_ < 0; i_1188_++) {
						for (int i_1189_ = -i_1177_; i_1189_ < 0; i_1189_++) {
							int i_1190_ = anIntArray10569[i_1175_++];
							int i_1191_ = (i_1190_ & 0xff0000) * i_1185_ & ~0xffffff;
							int i_1192_ = (i_1190_ & 0xff00) * i_1186_ & 0xff0000;
							int i_1193_ = (i_1190_ & 0xff) * i_1187_ & 0xff00;
							is[i_1174_++] = (i_1191_ | i_1192_ | i_1193_) >>> 8;
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 3) {
					for (int i_1194_ = -i_1176_; i_1194_ < 0; i_1194_++) {
						for (int i_1195_ = -i_1177_; i_1195_ < 0; i_1195_++) {
							int i_1196_ = anIntArray10569[i_1175_++];
							int i_1197_ = i_1196_ + i_1171_;
							int i_1198_ = (i_1196_ & 0xff00ff) + (i_1171_ & 0xff00ff);
							int i_1199_ = (i_1198_ & 0x1000100) + (i_1197_ - i_1198_ & 0x10000);
							is[i_1174_++] = i_1197_ - i_1199_ | i_1199_ - (i_1199_ >>> 8);
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 2) {
					int i_1200_ = i_1171_ >>> 24;
					int i_1201_ = 256 - i_1200_;
					int i_1202_ = (i_1171_ & 0xff00ff) * i_1201_ & ~0xff00ff;
					int i_1203_ = (i_1171_ & 0xff00) * i_1201_ & 0xff0000;
					i_1171_ = (i_1202_ | i_1203_) >>> 8;
					for (int i_1204_ = -i_1176_; i_1204_ < 0; i_1204_++) {
						for (int i_1205_ = -i_1177_; i_1205_ < 0; i_1205_++) {
							int i_1206_ = anIntArray10569[i_1175_++];
							i_1202_ = (i_1206_ & 0xff00ff) * i_1200_ & ~0xff00ff;
							i_1203_ = (i_1206_ & 0xff00) * i_1200_ & 0xff0000;
							is[i_1174_++] = ((i_1202_ | i_1203_) >>> 8) + i_1171_;
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1172_ == 1) {
				if (i_1170_ == 1) {
					for (int i_1207_ = -i_1176_; i_1207_ < 0; i_1207_++) {
						int i_1208_ = i_1174_ + i_1177_ - 3;
						while (i_1174_ < i_1208_) {
							int i_1209_ = anIntArray10569[i_1175_++];
							if (i_1209_ != 0) {
								is[i_1174_++] = i_1209_;
							} else {
								i_1174_++;
							}
							i_1209_ = anIntArray10569[i_1175_++];
							if (i_1209_ != 0) {
								is[i_1174_++] = i_1209_;
							} else {
								i_1174_++;
							}
							i_1209_ = anIntArray10569[i_1175_++];
							if (i_1209_ != 0) {
								is[i_1174_++] = i_1209_;
							} else {
								i_1174_++;
							}
							i_1209_ = anIntArray10569[i_1175_++];
							if (i_1209_ != 0) {
								is[i_1174_++] = i_1209_;
							} else {
								i_1174_++;
							}
						}
						i_1208_ += 3;
						while (i_1174_ < i_1208_) {
							int i_1210_ = anIntArray10569[i_1175_++];
							if (i_1210_ != 0) {
								is[i_1174_++] = i_1210_;
							} else {
								i_1174_++;
							}
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 0) {
					if ((i_1171_ & 0xffffff) == 16777215) {
						int i_1211_ = i_1171_ >>> 24;
						int i_1212_ = 256 - i_1211_;
						for (int i_1213_ = -i_1176_; i_1213_ < 0; i_1213_++) {
							for (int i_1214_ = -i_1177_; i_1214_ < 0; i_1214_++) {
								int i_1215_ = anIntArray10569[i_1175_++];
								if (i_1215_ != 0) {
									int i_1216_ = is[i_1174_];
									is[i_1174_++] = ((i_1215_ & 0xff00ff) * i_1211_ + (i_1216_ & 0xff00ff) * i_1212_ & ~0xff00ff) + ((i_1215_ & 0xff00) * i_1211_ + (i_1216_ & 0xff00) * i_1212_ & 0xff0000) >> 8;
								} else {
									i_1174_++;
								}
							}
							i_1174_ += i_1178_;
							i_1175_ += i_1179_;
						}
					} else {
						int i_1217_ = (i_1171_ & 0xff0000) >> 16;
						int i_1218_ = (i_1171_ & 0xff00) >> 8;
						int i_1219_ = i_1171_ & 0xff;
						int i_1220_ = i_1171_ >>> 24;
						int i_1221_ = 256 - i_1220_;
						for (int i_1222_ = -i_1176_; i_1222_ < 0; i_1222_++) {
							for (int i_1223_ = -i_1177_; i_1223_ < 0; i_1223_++) {
								int i_1224_ = anIntArray10569[i_1175_++];
								if (i_1224_ != 0) {
									if (i_1220_ != 255) {
										int i_1225_ = (i_1224_ & 0xff0000) * i_1217_ & ~0xffffff;
										int i_1226_ = (i_1224_ & 0xff00) * i_1218_ & 0xff0000;
										int i_1227_ = (i_1224_ & 0xff) * i_1219_ & 0xff00;
										i_1224_ = (i_1225_ | i_1226_ | i_1227_) >>> 8;
										int i_1228_ = is[i_1174_];
										is[i_1174_++] = ((i_1224_ & 0xff00ff) * i_1220_ + (i_1228_ & 0xff00ff) * i_1221_ & ~0xff00ff) + ((i_1224_ & 0xff00) * i_1220_ + (i_1228_ & 0xff00) * i_1221_ & 0xff0000) >> 8;
									} else {
										int i_1229_ = (i_1224_ & 0xff0000) * i_1217_ & ~0xffffff;
										int i_1230_ = (i_1224_ & 0xff00) * i_1218_ & 0xff0000;
										int i_1231_ = (i_1224_ & 0xff) * i_1219_ & 0xff00;
										is[i_1174_++] = (i_1229_ | i_1230_ | i_1231_) >>> 8;
									}
								} else {
									i_1174_++;
								}
							}
							i_1174_ += i_1178_;
							i_1175_ += i_1179_;
						}
						return;
					}
					return;
				}
				if (i_1170_ == 3) {
					int i_1232_ = i_1171_ >>> 24;
					int i_1233_ = 256 - i_1232_;
					for (int i_1234_ = -i_1176_; i_1234_ < 0; i_1234_++) {
						for (int i_1235_ = -i_1177_; i_1235_ < 0; i_1235_++) {
							int i_1236_ = anIntArray10569[i_1175_++];
							int i_1237_ = i_1236_ + i_1171_;
							int i_1238_ = (i_1236_ & 0xff00ff) + (i_1171_ & 0xff00ff);
							int i_1239_ = (i_1238_ & 0x1000100) + (i_1237_ - i_1238_ & 0x10000);
							i_1239_ = i_1237_ - i_1239_ | i_1239_ - (i_1239_ >>> 8);
							if (i_1236_ == 0 && i_1232_ != 255) {
								i_1236_ = i_1239_;
								i_1239_ = is[i_1174_];
								i_1239_ = ((i_1236_ & 0xff00ff) * i_1232_ + (i_1239_ & 0xff00ff) * i_1233_ & ~0xff00ff) + ((i_1236_ & 0xff00) * i_1232_ + (i_1239_ & 0xff00) * i_1233_ & 0xff0000) >> 8;
							}
							is[i_1174_++] = i_1239_;
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 2) {
					int i_1240_ = i_1171_ >>> 24;
					int i_1241_ = 256 - i_1240_;
					int i_1242_ = (i_1171_ & 0xff00ff) * i_1241_ & ~0xff00ff;
					int i_1243_ = (i_1171_ & 0xff00) * i_1241_ & 0xff0000;
					i_1171_ = (i_1242_ | i_1243_) >>> 8;
					for (int i_1244_ = -i_1176_; i_1244_ < 0; i_1244_++) {
						for (int i_1245_ = -i_1177_; i_1245_ < 0; i_1245_++) {
							int i_1246_ = anIntArray10569[i_1175_++];
							if (i_1246_ != 0) {
								i_1242_ = (i_1246_ & 0xff00ff) * i_1240_ & ~0xff00ff;
								i_1243_ = (i_1246_ & 0xff00) * i_1240_ & 0xff0000;
								is[i_1174_++] = ((i_1242_ | i_1243_) >>> 8) + i_1171_;
							} else {
								i_1174_++;
							}
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1172_ == 2) {
				if (i_1170_ == 1) {
					for (int i_1247_ = -i_1176_; i_1247_ < 0; i_1247_++) {
						for (int i_1248_ = -i_1177_; i_1248_ < 0; i_1248_++) {
							int i_1249_ = anIntArray10569[i_1175_++];
							if (i_1249_ != 0) {
								int i_1250_ = is[i_1174_];
								int i_1251_ = i_1249_ + i_1250_;
								int i_1252_ = (i_1249_ & 0xff00ff) + (i_1250_ & 0xff00ff);
								i_1250_ = (i_1252_ & 0x1000100) + (i_1251_ - i_1252_ & 0x10000);
								is[i_1174_++] = i_1251_ - i_1250_ | i_1250_ - (i_1250_ >>> 8);
							} else {
								i_1174_++;
							}
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 0) {
					int i_1253_ = (i_1171_ & 0xff0000) >> 16;
					int i_1254_ = (i_1171_ & 0xff00) >> 8;
					int i_1255_ = i_1171_ & 0xff;
					for (int i_1256_ = -i_1176_; i_1256_ < 0; i_1256_++) {
						for (int i_1257_ = -i_1177_; i_1257_ < 0; i_1257_++) {
							int i_1258_ = anIntArray10569[i_1175_++];
							if (i_1258_ != 0) {
								int i_1259_ = (i_1258_ & 0xff0000) * i_1253_ & ~0xffffff;
								int i_1260_ = (i_1258_ & 0xff00) * i_1254_ & 0xff0000;
								int i_1261_ = (i_1258_ & 0xff) * i_1255_ & 0xff00;
								i_1258_ = (i_1259_ | i_1260_ | i_1261_) >>> 8;
								int i_1262_ = is[i_1174_];
								int i_1263_ = i_1258_ + i_1262_;
								int i_1264_ = (i_1258_ & 0xff00ff) + (i_1262_ & 0xff00ff);
								i_1262_ = (i_1264_ & 0x1000100) + (i_1263_ - i_1264_ & 0x10000);
								is[i_1174_++] = i_1263_ - i_1262_ | i_1262_ - (i_1262_ >>> 8);
							} else {
								i_1174_++;
							}
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 3) {
					for (int i_1265_ = -i_1176_; i_1265_ < 0; i_1265_++) {
						for (int i_1266_ = -i_1177_; i_1266_ < 0; i_1266_++) {
							int i_1267_ = anIntArray10569[i_1175_++];
							int i_1268_ = i_1267_ + i_1171_;
							int i_1269_ = (i_1267_ & 0xff00ff) + (i_1171_ & 0xff00ff);
							int i_1270_ = (i_1269_ & 0x1000100) + (i_1268_ - i_1269_ & 0x10000);
							i_1267_ = i_1268_ - i_1270_ | i_1270_ - (i_1270_ >>> 8);
							i_1270_ = is[i_1174_];
							i_1268_ = i_1267_ + i_1270_;
							i_1269_ = (i_1267_ & 0xff00ff) + (i_1270_ & 0xff00ff);
							i_1270_ = (i_1269_ & 0x1000100) + (i_1268_ - i_1269_ & 0x10000);
							is[i_1174_++] = i_1268_ - i_1270_ | i_1270_ - (i_1270_ >>> 8);
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				if (i_1170_ == 2) {
					int i_1271_ = i_1171_ >>> 24;
					int i_1272_ = 256 - i_1271_;
					int i_1273_ = (i_1171_ & 0xff00ff) * i_1272_ & ~0xff00ff;
					int i_1274_ = (i_1171_ & 0xff00) * i_1272_ & 0xff0000;
					i_1171_ = (i_1273_ | i_1274_) >>> 8;
					for (int i_1275_ = -i_1176_; i_1275_ < 0; i_1275_++) {
						for (int i_1276_ = -i_1177_; i_1276_ < 0; i_1276_++) {
							int i_1277_ = anIntArray10569[i_1175_++];
							if (i_1277_ != 0) {
								i_1273_ = (i_1277_ & 0xff00ff) * i_1271_ & ~0xff00ff;
								i_1274_ = (i_1277_ & 0xff00) * i_1271_ & 0xff0000;
								i_1277_ = ((i_1273_ | i_1274_) >>> 8) + i_1171_;
								int i_1278_ = is[i_1174_];
								int i_1279_ = i_1277_ + i_1278_;
								int i_1280_ = (i_1277_ & 0xff00ff) + (i_1278_ & 0xff00ff);
								i_1278_ = (i_1280_ & 0x1000100) + (i_1279_ - i_1280_ & 0x10000);
								is[i_1174_++] = i_1279_ - i_1278_ | i_1278_ - (i_1278_ >>> 8);
							} else {
								i_1174_++;
							}
						}
						i_1174_ += i_1178_;
						i_1175_ += i_1179_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}
}
