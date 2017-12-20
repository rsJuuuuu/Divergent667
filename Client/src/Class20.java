/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class20
{
	static Index aClass302_314;
	static Class338 aClass338_315;
	private static HashTable aHashTable316 = new HashTable(16);
	static Interface17 anInterface17_317;
	static CacheNode_Sub11 aCacheNode_Sub11_318;
	static Class112 aClass112_319;
	private static Class71 aClass71_320;
	private static Class58 aClass58_321;
	static Class215 aClass215_322;
	static int anInt323;
	static int anInt324;
	private static byte[] aByteArray325 = new byte[1];
	private static int[] aShortArray326;
	static float aFloat327;
	static int anInt328;
	static float aFloat329;
	static Class224 aClass224_330;
	static Class312 aClass312_331;
	static byte[][][] aByteArrayArrayArray332;
	static int anInt333;
	private static int[] aShortArray334;
	private static byte[] aByteArray335;
	private static byte[] aByteArray336;
	static int anInt337;
	private static short[] aShortArray338;
	static int anInt339;
	private static byte[] aByteArray340;
	static int anInt341;
	private static int[] anIntArray342;
	static int anInt343;
	static int anInt344;
	static int anInt345;
	private static byte[] aByteArray346;
	private static HashTable aHashTable347;
	static int anInt348;
	static int anInt349;
	static int anInt350;
	private static byte[] aByteArray351;
	static int anInt352;
	private static Class103[][][] aClass103ArrayArrayArray353;
	static int anInt354;
	
	static final CacheNode_Sub11 method269(int i) {
		return (CacheNode_Sub11) aHashTable316.method1518(3512, (long) i);
	}
	
	static final void method270(GraphicsToolkit graphicstoolkit) {
		int i = anInt341 - anInt349;
		int i_0_ = anInt337 - anInt352;
		int i_1_ = (anInt348 - anInt344 << 16) / i;
		int i_2_ = (anInt339 - anInt350 << 16) / i_0_;
		method276(graphicstoolkit, i_1_, i_2_, 0, 0);
	}
	
	private static final void method271(GraphicsToolkit graphicstoolkit, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int[] ses, byte[] bs, boolean bool) {
		if (bool || i_6_ != 0 || i_7_ > 0) {
			if (i_7_ == 0) {
				graphicstoolkit.aa(i, i_3_, i_4_, i_5_, i_6_, 0);
			} else {
				int i_9_ = i_8_ & 0x3f;
				if (i_9_ == 0 || i_4_ <= 1 || i_5_ <= 1) {
					int i_10_ = anIntArray342[i_7_];
					if (bool || i_10_ != 0) {
						graphicstoolkit.aa(i, i_3_, i_4_, i_5_, i_10_, 0);
					}
				} else {
					int i_11_ = bool ? 0 : 1;
					Class117_Sub2.method1174(i_5_, aByteArrayArrayArray332, anIntArray342[i_7_], i_4_, anInt328, i, graphicstoolkit, i_11_, i_8_ >> 6 & 0x3, (byte) -122, i_3_, i_6_, i_9_);
				}
			}
		}
		if (ses != null) {
			int i_12_;
			if (i_4_ == 1) {
				i_12_ = i;
			} else {
				i_12_ = i + i_4_ - 1;
			}
			int i_13_;
			if (i_5_ == 1) {
				i_13_ = i_3_;
			} else {
				i_13_ = i_3_ + i_5_ - 1;
			}
			for (int i_14_ = 0; i_14_ < ses.length; i_14_++) {
				int i_15_ = bs[i_14_] & 0x3f;
				if (i_15_ == 0 || i_15_ == 2 || i_15_ == 3 || i_15_ == 9) {
					ObjectDefinition objectdefinition = aClass112_319.method1145(ses[i_14_] & 0xffff, 55);
					if (objectdefinition.anInt3006 == -1) {
						int i_16_ = -3355444;
						if (objectdefinition.anInt3057 == 1) {
							i_16_ = -3407872;
						}
						int i_17_ = bs[i_14_] >> 6 & 0x3;
						if (i_15_ == 0) {
							if (i_17_ == 0) {
								graphicstoolkit.P(i, i_3_, i_5_, i_16_, 0);
							} else if (i_17_ == 1) {
								graphicstoolkit.U(i, i_3_, i_4_, i_16_, 0);
							} else if (i_17_ == 2) {
								graphicstoolkit.P(i_12_, i_3_, i_5_, i_16_, 0);
							} else {
								graphicstoolkit.U(i, i_13_, i_4_, i_16_, 0);
							}
						} else if (i_15_ == 2) {
							if (i_17_ == 0) {
								graphicstoolkit.P(i, i_3_, i_5_, -1, 0);
								graphicstoolkit.U(i, i_3_, i_4_, i_16_, 0);
							} else if (i_17_ == 1) {
								graphicstoolkit.P(i_12_, i_3_, i_5_, -1, 0);
								graphicstoolkit.U(i, i_3_, i_4_, i_16_, 0);
							} else if (i_17_ == 2) {
								graphicstoolkit.P(i_12_, i_3_, i_5_, -1, 0);
								graphicstoolkit.U(i, i_13_, i_4_, i_16_, 0);
							} else {
								graphicstoolkit.P(i, i_3_, i_5_, -1, 0);
								graphicstoolkit.U(i, i_13_, i_4_, i_16_, 0);
							}
						} else if (i_15_ == 3) {
							if (i_17_ == 0) {
								graphicstoolkit.U(i, i_3_, 1, i_16_, 0);
							} else if (i_17_ == 1) {
								graphicstoolkit.U(i_12_, i_3_, 1, i_16_, 0);
							} else if (i_17_ == 2) {
								graphicstoolkit.U(i_12_, i_13_, 1, i_16_, 0);
							} else {
								graphicstoolkit.U(i, i_13_, 1, i_16_, 0);
							}
						} else if (i_15_ == 9) {
							if (i_17_ == 0 || i_17_ == 2) {
								for (int i_18_ = 0; i_18_ < i_5_; i_18_++)
									graphicstoolkit.U(i + i_18_, i_13_ - i_18_, 1, i_16_, 0);
							} else {
								for (int i_19_ = 0; i_19_ < i_5_; i_19_++)
									graphicstoolkit.U(i + i_19_, i_3_ + i_19_, 1, i_16_, 0);
							}
						}
					}
				}
			}
		}
	}
	
	static final void method272(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		anInt349 = i - anInt354;
		anInt337 = i_20_ - anInt343;
		anInt341 = i_21_ - anInt354;
		anInt352 = i_22_ - anInt343;
		anInt344 = i_23_;
		anInt350 = i_24_;
		anInt348 = i_25_;
		anInt339 = i_26_;
	}
	
	private static final void method273(GraphicsToolkit graphicstoolkit, int i, int i_27_, int i_28_, int i_29_, int[] ses, byte[] bs) {
		if (ses != null) {
			for (int i_30_ = 0; i_30_ < ses.length; i_30_++) {
				ObjectDefinition objectdefinition = aClass112_319.method1145(ses[i_30_] & 0xffff, 116);
				int i_31_ = objectdefinition.anInt3006;
				if (i_31_ != -1) {
					Class140 class140 = aClass338_315.method3909(i_31_, 34);
					GLSprite glsprite = class140.method1606(objectdefinition.aBoolean3056 ? bs[i_30_] >> 6 & 0x3 : 0, graphicstoolkit, objectdefinition.aBoolean3007 && objectdefinition.aBoolean3039, 0);
					if (glsprite != null) {
						int i_32_ = i_28_ * glsprite.method1197() >> 2;
						int i_33_ = i_29_ * glsprite.method1186() >> 2;
						if (class140.aBoolean1741) {
							int i_34_ = objectdefinition.anInt3055;
							int i_35_ = objectdefinition.anInt2986;
							if ((bs[i_30_] >> 6 & 0x1) == 1) {
								int i_36_ = i_34_;
								i_34_ = i_35_;
								i_35_ = i_36_;
							}
							i_32_ = i_34_ * i_28_;
							i_33_ = i_35_ * i_29_;
						}
						if (i_32_ != 0 && i_33_ != 0) {
							if (class140.anInt1737 != 0) {
								glsprite.method1199(i, i_27_ - i_33_ + i_29_, i_32_, i_33_, 0, ~0xffffff | class140.anInt1737, 1);
							} else {
								glsprite.method1200(i, i_27_ - i_33_ + i_29_, i_32_, i_33_);
							}
						}
					}
				}
			}
		}
	}
	
	private static final void method274(byte[] bs, byte[] bs_37_, short[] ses, int i, int i_38_) {
		int[] is = new int[anInt333];
		int[] is_39_ = new int[anInt333];
		int[] is_40_ = new int[anInt333];
		int[] is_41_ = new int[anInt333];
		int[] is_42_ = new int[anInt333];
		for (int i_43_ = -5; i_43_ < anInt345; i_43_++) {
			int i_44_ = i_43_ + 5;
			int i_45_ = i_43_ - 5;
			for (int i_46_ = 0; i_46_ < anInt333; i_46_++) {
				if (i_44_ < anInt345) {
					int i_47_ = bs[i_44_ + i_46_ * anInt345] & 0xff;
					if (i_47_ > 0) {
						Class236 class236 = aClass58_321.method573(-17993, i_47_ - 1);
						is[i_46_] += class236.anInt2888;
						is_39_[i_46_] += class236.anInt2897;
						is_40_[i_46_] += class236.anInt2901;
						is_41_[i_46_] += class236.anInt2890;
						is_42_[i_46_]++;
					}
				}
				if (i_45_ >= 0) {
					int i_48_ = bs[i_45_ + i_46_ * anInt345] & 0xff;
					if (i_48_ > 0) {
						Class236 class236 = aClass58_321.method573(-17993, i_48_ - 1);
						is[i_46_] -= class236.anInt2888;
						is_39_[i_46_] -= class236.anInt2897;
						is_40_[i_46_] -= class236.anInt2901;
						is_41_[i_46_] -= class236.anInt2890;
						is_42_[i_46_]--;
					}
				}
			}
			if (i_43_ >= 0) {
				int i_49_ = 0;
				int i_50_ = 0;
				int i_51_ = 0;
				int i_52_ = 0;
				int i_53_ = 0;
				for (int i_54_ = -5; i_54_ < anInt333; i_54_++) {
					int i_55_ = i_54_ + 5;
					if (i_55_ < anInt333) {
						i_49_ += is[i_55_];
						i_50_ += is_39_[i_55_];
						i_51_ += is_40_[i_55_];
						i_52_ += is_41_[i_55_];
						i_53_ += is_42_[i_55_];
					}
					int i_56_ = i_54_ - 5;
					if (i_56_ >= 0) {
						i_49_ -= is[i_56_];
						i_50_ -= is_39_[i_56_];
						i_51_ -= is_40_[i_56_];
						i_52_ -= is_41_[i_56_];
						i_53_ -= is_42_[i_56_];
					}
					if (i_54_ >= 0 && i_53_ > 0) {
						if ((bs[i_43_ + i_54_ * anInt345] & 0xff) == 0) {
							int i_57_ = i_43_ + i_54_ * anInt345;
							bs_37_[i_57_] = (byte) 0;
							ses[i_57_] = (short) 0;
						} else {
							int i_58_ = i_52_ == 0 ? 0 : Node_Sub25.method2651(i_51_ / i_53_, i_50_ / i_53_, false, i_49_ * 256 / i_52_);
							int i_59_ = (i_58_ & 0x7f) + i_38_;
							if (i_59_ < 0) {
								i_59_ = 0;
							} else if (i_59_ > 127) {
								i_59_ = 127;
							}
							int i_60_ = (i_58_ + i & 0xfc00) + (i_58_ & 0x380) + i_59_;
							int i_61_ = i_43_ + i_54_ * anInt345;
							int i_62_ = Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, Class194_Sub1.method1964(96, -14042, i_60_)) & 0xffff];
							bs_37_[i_61_] = (byte) (i_62_ >> 16 & 0xff);
							ses[i_61_] = (short) (i_62_ & 0xffff);
						}
					}
				}
			}
		}
	}
	
	static final void method275(Index class302, Class71 class71, Class58 class58, Class112 class112, Class215 class215, Class338 class338, Interface17 interface17) {
		aClass302_314 = class302;
		aClass71_320 = class71;
		aClass58_321 = class58;
		aClass112_319 = class112;
		aClass215_322 = class215;
		aClass338_315 = class338;
		anInterface17_317 = interface17;
		aHashTable316.method1517(false);
		int i = aClass302_314.method3519("details", (byte) 93);
		int[] is = aClass302_314.method3532(i, 0);
		if (is != null) {
			for (int i_63_ = 0; i_63_ < is.length; i_63_++) {
				CacheNode_Sub11 cachenode_sub11 = Class274.method3323(aClass302_314, i, is[i_63_], 0);
				aHashTable316.method1515((long) cachenode_sub11.anInt9546, cachenode_sub11, -123);
			}
		}
		Class110.method1132(0, false, true);
	}
	
	private static final void method276(GraphicsToolkit graphicstoolkit, int i, int i_64_, int i_65_, int i_66_) {
		int i_67_ = anInt341 - anInt349;
		int i_68_ = anInt337 - anInt352;
		if (anInt341 < anInt345) {
			i_67_++;
		}
		if (anInt337 < anInt333) {
			i_68_++;
		}
		for (int i_69_ = 0; i_69_ < i_67_; i_69_++) {
			int i_70_ = (i_65_ + i * i_69_ >> 16) + anInt344;
			int i_71_ = (i_65_ + i * (i_69_ + 1) >> 16) + anInt344;
			int i_72_ = i_71_ - i_70_;
			if (i_72_ > 0) {
				int i_73_ = anInt349 + i_69_;
				if (i_73_ < 0 || i_73_ >= anInt345) {
					for (int i_74_ = 0; i_74_ < i_68_; i_74_++) {
						int i_75_ = anInt339 - (i_66_ + i_64_ * (i_74_ + 1) >> 16);
						int i_76_ = anInt339 - (i_66_ + i_64_ * i_74_ >> 16);
						int i_77_ = i_76_ - i_75_;
						int i_78_;
						if (aCacheNode_Sub11_318.anInt9542 != -1) {
							i_78_ = ~0xffffff | aCacheNode_Sub11_318.anInt9542;
						} else if ((i_69_ + anInt349 & 0x4) != (i_74_ + anInt337 & 0x4)) {
							i_78_ = -11840664;
						} else {
							i_78_ = anIntArray342[aClass71_320.anInt961 + 1];
						}
						if (i_78_ == 0) {
							i_78_ = -16777216;
						}
						graphicstoolkit.aa(i_70_, i_75_, i_72_, i_77_, i_78_, 0);
					}
				} else {
					for (int i_79_ = 0; i_79_ < i_68_; i_79_++) {
						int i_80_ = anInt339 - (i_66_ + i_64_ * (i_79_ + 1) >> 16);
						int i_81_ = anInt339 - (i_66_ + i_64_ * i_79_ >> 16);
						int i_82_ = i_81_ - i_80_;
						if (i_82_ > 0) {
							int i_83_ = i_79_ + anInt352;
							int i_84_ = i_73_ + i_83_ * anInt345;
							int i_85_ = 0;
							int i_86_ = 0;
							int i_87_ = 0;
							if (i_83_ >= 0 && i_83_ < anInt333) {
								i_85_ = (aByteArray335[i_84_] & 0xff) << 16 | aShortArray338[i_84_] & 0xffff;
								if (i_85_ != 0) {
									i_85_ |= ~0xffffff;
								}
								i_86_ = aByteArray351[i_84_] & 0xff;
								i_87_ = aShortArray334[i_84_] & 0xffff;
							}
							if (i_85_ == 0 && i_86_ == 0 && i_87_ == 0) {
								if (aCacheNode_Sub11_318.anInt9542 != -1) {
									i_85_ = ~0xffffff | aCacheNode_Sub11_318.anInt9542;
								} else if ((i_69_ + anInt349 & 0x4) != (i_79_ + anInt337 & 0x4)) {
									i_85_ = -11840664;
								} else {
									i_85_ = anIntArray342[aClass71_320.anInt961 + 1];
								}
								if (i_85_ == 0) {
									i_85_ = -16777216;
								}
								graphicstoolkit.aa(i_70_, i_80_, i_72_, i_82_, i_85_, 0);
							} else if (i_87_ > 0) {
								if (i_87_ == 65535) {
									Node_Sub17 node_sub17 = (Node_Sub17) aHashTable347.method1518(3512, (long) (i_73_ << 16 | i_83_));
									if (node_sub17 != null) {
										method271(graphicstoolkit, i_70_, i_80_, i_72_, i_82_, i_85_, i_86_, aByteArray346[i_84_], node_sub17.aShortArray7148, node_sub17.aByteArray7147, true);
									}
								} else {
									aShortArray326[0] = (short) (i_87_ - 1);
									aByteArray325[0] = aByteArray340[i_84_];
									method271(graphicstoolkit, i_70_, i_80_, i_72_, i_82_, i_85_, i_86_, aByteArray346[i_84_], aShortArray326, aByteArray325, true);
								}
							} else {
								method271(graphicstoolkit, i_70_, i_80_, i_72_, i_82_, i_85_, i_86_, aByteArray346[i_84_], null, null, true);
							}
						}
					}
				}
			}
		}
		for (int i_88_ = -16; i_88_ < i_67_ + 16; i_88_++) {
			int i_89_ = (i_65_ + i * i_88_ >> 16) + anInt344;
			int i_90_ = (i_65_ + i * (i_88_ + 1) >> 16) + anInt344;
			int i_91_ = i_90_ - i_89_;
			if (i_91_ > 0) {
				int i_92_ = i_88_ + anInt349;
				if (i_92_ >= 0 && i_92_ < anInt345) {
					for (int i_93_ = -16; i_93_ < i_68_ + 16; i_93_++) {
						int i_94_ = anInt339 - (i_66_ + i_64_ * (i_93_ + 1) >> 16);
						int i_95_ = anInt339 - (i_66_ + i_64_ * i_93_ >> 16);
						int i_96_ = i_95_ - i_94_;
						if (i_96_ > 0) {
							int i_97_ = i_93_ + anInt352;
							if (i_97_ >= 0 && i_97_ < anInt333) {
								int i_98_ = aShortArray334[i_92_ + i_97_ * anInt345] & 0xffff;
								if (i_98_ > 0) {
									if (i_98_ == 65535) {
										Node_Sub17 node_sub17 = (Node_Sub17) aHashTable347.method1518(3512, (long) (i_92_ << 16 | i_97_));
										if (node_sub17 != null) {
											method273(graphicstoolkit, i_89_, i_94_, i_91_, i_96_, node_sub17.aShortArray7148, node_sub17.aByteArray7147);
										}
									} else {
										aShortArray326[0] = (short) (i_98_ - 1);
										aByteArray325[0] = aByteArray340[i_92_ + i_97_ * anInt345];
										method273(graphicstoolkit, i_89_, i_94_, i_91_, i_96_, aShortArray326, aByteArray325);
									}
								} else {
									method273(graphicstoolkit, i_89_, i_94_, i_91_, i_96_, null, null);
								}
							}
						}
					}
				}
			}
		}
		int i_99_ = anInt349 >> 6;
		int i_100_ = anInt352 >> 6;
		if (i_99_ < 0) {
			i_99_ = 0;
		}
		if (i_100_ < 0) {
			i_100_ = 0;
		}
		int i_101_ = anInt341 >> 6;
		int i_102_ = anInt337 >> 6;
		if (i_101_ >= aClass103ArrayArrayArray353[0].length) {
			i_101_ = aClass103ArrayArrayArray353[0].length - 1;
		}
		if (i_102_ >= aClass103ArrayArrayArray353[0][0].length) {
			i_102_ = aClass103ArrayArrayArray353[0][0].length - 1;
		}
		for (int i_103_ = 0; i_103_ < 3; i_103_++) {
			for (int i_104_ = i_99_; i_104_ <= i_101_; i_104_++) {
				for (int i_105_ = i_100_; i_105_ <= i_102_; i_105_++) {
					Class103 class103 = aClass103ArrayArrayArray353[i_103_][i_104_][i_105_];
					if (class103 != null) {
						int i_106_ = (i_104_ + (anInt354 >> 6)) * 64;
						int i_107_ = (i_105_ + (anInt343 >> 6)) * 64;
						for (EntityNode_Sub9 entitynode_sub9 = (EntityNode_Sub9) class103.method1113((byte) -118); entitynode_sub9 != null; entitynode_sub9 = (EntityNode_Sub9) class103.method1108(106)) {
							int i_108_ = i_106_ + entitynode_sub9.aByte6029 - anInt354 - anInt349;
							int i_109_ = i_107_ + entitynode_sub9.aByte6031 - anInt343 - anInt352;
							int i_110_ = (i_65_ + i * i_108_ >> 16) + anInt344;
							int i_111_ = (i_65_ + i * (i_108_ + 1) >> 16) + anInt344;
							int i_112_ = anInt339 - (i_66_ + i_64_ * (i_109_ + 1) >> 16);
							int i_113_ = anInt339 - (i_66_ + i_64_ * i_109_ >> 16);
							method271(graphicstoolkit, i_110_, i_112_, i_111_ - i_110_, i_113_ - i_112_, entitynode_sub9.anInt6027, entitynode_sub9.aByte6028 & 0xff, entitynode_sub9.aByte6026, entitynode_sub9.aShortArray6025, entitynode_sub9.aByteArray6030, false);
						}
					}
				}
			}
			for (int i_114_ = i_99_; i_114_ <= i_101_; i_114_++) {
				for (int i_115_ = i_100_; i_115_ <= i_102_; i_115_++) {
					Class103 class103 = aClass103ArrayArrayArray353[i_103_][i_114_][i_115_];
					if (class103 != null) {
						int i_116_ = (i_114_ + (anInt354 >> 6)) * 64;
						int i_117_ = (i_115_ + (anInt343 >> 6)) * 64;
						for (EntityNode_Sub9 entitynode_sub9 = (EntityNode_Sub9) class103.method1113((byte) 127); entitynode_sub9 != null; entitynode_sub9 = (EntityNode_Sub9) class103.method1108(94)) {
							int i_118_ = i_116_ + entitynode_sub9.aByte6029 - anInt354 - anInt349;
							int i_119_ = i_117_ + entitynode_sub9.aByte6031 - anInt343 - anInt352;
							int i_120_ = (i_65_ + i * i_118_ >> 16) + anInt344;
							int i_121_ = (i_65_ + i * (i_118_ + 1) >> 16) + anInt344;
							int i_122_ = anInt339 - (i_66_ + i_64_ * (i_119_ + 1) >> 16);
							int i_123_ = anInt339 - (i_66_ + i_64_ * i_119_ >> 16);
							method273(graphicstoolkit, i_120_, i_122_, i_121_ - i_120_, i_123_ - i_122_, entitynode_sub9.aShortArray6025, entitynode_sub9.aByteArray6030);
						}
					}
				}
			}
		}
	}
	
	static final void method277(d var_d, int i, int i_124_) {
		for (int i_125_ = 0; i_125_ < aClass71_320.anInt956; i_125_++)
			anIntArray342[i_125_ + 1] = method278(var_d, i_125_, i, i_124_);
	}
	
	private static final int method278(d var_d, int i, int i_126_, int i_127_) {
		Class289 class289 = aClass71_320.method743(i, (byte) 64);
		if (class289 == null) {
			return 0;
		}
		int i_128_ = class289.anInt3640;
		if (i_128_ >= 0 && var_d.method10(i_128_, -8217).aBoolean1223) {
			i_128_ = -1;
		}
		int i_129_;
		if (class289.anInt3629 >= 0) {
			int i_130_ = class289.anInt3629;
			int i_131_ = (i_130_ & 0x7f) + i_127_;
			if (i_131_ < 0) {
				i_131_ = 0;
			} else if (i_131_ > 127) {
				i_131_ = 127;
			}
			int i_132_ = (i_130_ + i_126_ & 0xfc00) + (i_130_ & 0x380) + i_131_;
			i_129_ = ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, Class113.method1148(true, 96, i_132_)) & 0xffff];
		} else if (i_128_ >= 0) {
			i_129_ = ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, Class113.method1148(true, 96, var_d.method10(i_128_, -8217).aShort1221)) & 0xffff];
		} else if (class289.anInt3631 == -1) {
			i_129_ = 0;
		} else {
			int i_133_ = class289.anInt3631;
			int i_134_ = (i_133_ & 0x7f) + i_127_;
			if (i_134_ < 0) {
				i_134_ = 0;
			} else if (i_134_ > 127) {
				i_134_ = 127;
			}
			int i_135_ = (i_133_ + i_126_ & 0xfc00) + (i_133_ & 0x380) + i_134_;
			i_129_ = ~0xffffff | Class170.anIntArray2054[Node_Sub15_Sub2.method2560(5310, Class113.method1148(true, 96, i_135_)) & 0xffff];
		}
		return i_129_;
	}
	
	static final void method279() {
		aByteArray336 = new byte[anInt345 * anInt333];
		aByteArray351 = new byte[anInt345 * anInt333];
		aByteArray346 = new byte[anInt345 * anInt333];
		aShortArray334 = new int[anInt345 * anInt333];
		aByteArray340 = new byte[anInt345 * anInt333];
		aHashTable347 = new HashTable(1024);
		aClass103ArrayArrayArray353 = new Class103[3][anInt345 >> 6][anInt333 >> 6];
		anIntArray342 = new int[aClass71_320.anInt956 + 1];
	}
	
	static final void method280() {
		aByteArray336 = null;
		aByteArray335 = null;
		aShortArray338 = null;
		aByteArray351 = null;
		aByteArray346 = null;
		aShortArray334 = null;
		aByteArray340 = null;
		aHashTable347 = null;
		aClass103ArrayArrayArray353 = null;
		anIntArray342 = null;
	}
	
	static final void method281(GraphicsToolkit graphicstoolkit, Node_Sub14 node_sub14, Class79 class79) {
		if (class79.anIntArray1049 != null) {
			int[] is = new int[class79.anIntArray1049.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_136_ = class79.anIntArray1049[i * 2] + node_sub14.anInt7125;
				int i_137_ = class79.anIntArray1049[i * 2 + 1] + node_sub14.anInt7120;
				is[i * 2] = anInt344 + (anInt348 - anInt344) * (i_136_ - anInt349) / (anInt341 - anInt349);
				is[i * 2 + 1] = anInt339 - (anInt339 - anInt350) * (i_137_ - anInt352) / (anInt337 - anInt352);
			}
			Class74.method755(graphicstoolkit, is, class79.anInt1084);
			if (class79.anInt1074 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_138_ = is[i * 2];
					int i_139_ = is[i * 2 + 1];
					int i_140_ = is[(i + 1) * 2];
					int i_141_ = is[(i + 1) * 2 + 1];
					if (i_140_ < i_138_) {
						int i_142_ = i_138_;
						int i_143_ = i_139_;
						i_138_ = i_140_;
						i_139_ = i_141_;
						i_140_ = i_142_;
						i_141_ = i_143_;
					} else if (i_140_ == i_138_ && i_141_ < i_139_) {
						int i_144_ = i_139_;
						i_139_ = i_141_;
						i_141_ = i_144_;
					}
					graphicstoolkit.a(i_138_, i_139_, i_140_, i_141_, class79.anIntArray1066[class79.aByteArray1057[i] & 0xff], 1, class79.anInt1074, class79.anInt1050, class79.anInt1080);
				}
				int i = is[is.length - 2];
				int i_145_ = is[is.length - 1];
				int i_146_ = is[0];
				int i_147_ = is[1];
				if (i_146_ < i) {
					int i_148_ = i;
					int i_149_ = i_145_;
					i = i_146_;
					i_145_ = i_147_;
					i_146_ = i_148_;
					i_147_ = i_149_;
				} else if (i_146_ == i && i_147_ < i_145_) {
					int i_150_ = i_145_;
					i_145_ = i_147_;
					i_147_ = i_150_;
				}
				graphicstoolkit.a(i, i_145_, i_146_, i_147_, class79.anIntArray1066[class79.aByteArray1057[class79.aByteArray1057.length - 1] & 0xff], 1, class79.anInt1074, class79.anInt1050, class79.anInt1080);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					graphicstoolkit.method1236(is[(i + 1) * 2 + 1], is[i * 2 + 1], is[(i + 1) * 2], class79.anIntArray1066[class79.aByteArray1057[i] & 0xff], 1, is[i * 2]);
				graphicstoolkit.method1236(is[1], is[is.length - 1], is[0], class79.anIntArray1066[class79.aByteArray1057[class79.aByteArray1057.length - 1] & 0xff], 1, is[is.length - 2]);
			}
		}
	}
	
	static final void method282(int i) {
		aCacheNode_Sub11_318 = (CacheNode_Sub11) aHashTable316.method1518(3512, (long) i);
	}
	
	private static final void method283(GraphicsToolkit graphicstoolkit, Node_Sub14 node_sub14, int i, int i_151_, int i_152_, int i_153_) {
		node_sub14.anInt7126 = anInt344 + (i_152_ + i * (node_sub14.anInt7125 - anInt349) >> 16);
		node_sub14.anInt7118 = anInt339 - (i_153_ + i_151_ * (node_sub14.anInt7120 - anInt352) >> 16);
	}
	
	private static final void method284(GraphicsToolkit graphicstoolkit, BufferedStream buffer, int i, int i_154_, int i_155_, int i_156_, int[] is, int[] is_157_) {
		int i_158_ = buffer.readUnsignedByte();
		if ((i_158_ & 0x1) == 0) {
			boolean bool = (i_158_ & 0x2) == 0;
			int i_159_ = i_158_ >> 2 & 0x3f;
			if (i_159_ != 62) {
				if (i_159_ == 63) {
					i_159_ = buffer.readUnsignedByte();
				} else if (bool) {
					i_159_ = is[i_159_];
				} else {
					i_159_ = is_157_[i_159_];
				}
				int v = i_155_ + i_156_ * anInt345;
				if(v >= 0) {
					if (bool) {
						aByteArray336[v] = (byte) i_159_;
						aByteArray351[v] = (byte) 0;
					} else {
						aByteArray351[v] = (byte) i_159_;
						aByteArray346[v] = (byte) 0;
						aByteArray336[v] = buffer.readByte();
					}
				}else if (!bool)
					buffer.readByte();
			}
		} else {
			int i_160_ = (i_158_ >> 1 & 0x3) + 1;
			boolean bool = (i_158_ & 0x8) != 0;
			boolean bool_161_ = (i_158_ & 0x10) != 0;
			for (int i_162_ = 0; i_162_ < i_160_; i_162_++) {
				int i_163_ = buffer.readUnsignedByte();
				int i_164_ = 0;
				int i_165_ = 0;
				if (bool) {
					i_164_ = buffer.readUnsignedByte();
					i_165_ = buffer.readUnsignedByte();
				}
				int i_166_ = 0;
				if (bool_161_) {
					i_166_ = buffer.readUnsignedByte();
				}
				if (i_162_ == 0) {
					int v = i_155_ + i_156_ * anInt345;
					if(v >= 0) {
					aByteArray336[i_155_ + i_156_ * anInt345] = (byte) i_163_;
					aByteArray351[i_155_ + i_156_ * anInt345] = (byte) i_164_;
					aByteArray346[i_155_ + i_156_ * anInt345] = (byte) i_165_;
					}
					if (i_166_ == 1) {
						aShortArray334[v >= 0 ?  v : 0] = buffer.readBigSmart();//(short) (buffer.readUnsignedShort() + 1);
						aByteArray340[v >= 0 ?  v : 0] = buffer.readByte();
					} else if (i_166_ > 1) {
						aShortArray334[v >= 0 ?  v : 0] = (short) -1;
						int[] ses = new int[i_166_];
						byte[] bs = new byte[i_166_];
						for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
							ses[i_167_] = buffer.readBigSmart();//(short) buffer.readUnsignedShort();
							bs[i_167_] = buffer.readByte();
						}
						aHashTable347.method1515((long) (i_155_ << 16 | i_156_), new Node_Sub17(ses, bs), -123);
					}
				} else {
					int[] ses = null;
					byte[] bs = null;
					if (i_166_ > 0) {
						ses = new int[i_166_];
						bs = new byte[i_166_];
						for (int i_168_ = 0; i_168_ < i_166_; i_168_++) {
							ses[i_168_] = buffer.readBigSmart();//(short) buffer.readUnsignedShort();
							bs[i_168_] = buffer.readByte();
						}
					}
					if(i_162_ - 1 >= 0 && i - (anInt354 >> 6) >= 0 && i_154_ - (anInt343 >> 6) >= 0) {
						if (aClass103ArrayArrayArray353[i_162_ - 1][i - (anInt354 >> 6)][i_154_ - (anInt343 >> 6)] == null) {
							aClass103ArrayArrayArray353[i_162_ - 1][i - (anInt354 >> 6)][i_154_ - (anInt343 >> 6)] = new Class103();
						}
						EntityNode_Sub9 entitynode_sub9 = new EntityNode_Sub9(i_155_ & 0x3f, i_156_ & 0x3f, i_163_, i_164_, i_165_, ses, bs);
						aClass103ArrayArrayArray353[i_162_ - 1][i - (anInt354 >> 6)][i_154_ - (anInt343 >> 6)].method1110(false, entitynode_sub9);
					}
				}
			}
		}
	}
	
	private static final void method285() {
		for (int i = 0; i < anInt345; i++) {
			for (int i_169_ = 0; i_169_ < anInt333; i_169_++) {
				int i_170_ = aShortArray334[i + i_169_ * anInt345] & 0xffff;
				if (i_170_ != 0) {
					if (i_170_ == 65535) {
						Node_Sub17 node_sub17 = (Node_Sub17) aHashTable347.method1518(3512, (long) (i << 16 | i_169_));
						if (node_sub17 != null) {
							for (int i_171_ = 0; i_171_ < node_sub17.aShortArray7148.length; i_171_++) {
								ObjectDefinition objectdefinition = aClass112_319.method1145(node_sub17.aShortArray7148[i_171_] & 0xffff, 115);
								int i_172_ = objectdefinition.anInt2994;
								if (objectdefinition.anIntArray2984 != null) {
									objectdefinition = objectdefinition.method3038(13, anInterface17_317);
									if (objectdefinition != null) {
										i_172_ = objectdefinition.anInt2994;
									}
								}
								if (i_172_ != -1) {
									Node_Sub14 node_sub14 = new Node_Sub14(i_172_);
									node_sub14.anInt7125 = i;
									node_sub14.anInt7120 = i_169_;
									aClass312_331.method3625((byte) -54, node_sub14);
								}
							}
						}
					} else {
						ObjectDefinition objectdefinition = aClass112_319.method1145(i_170_ - 1, 115);
						int i_173_ = objectdefinition.anInt2994;
						if (objectdefinition.anIntArray2984 != null) {
							objectdefinition = objectdefinition.method3038(13, anInterface17_317);
							if (objectdefinition != null) {
								i_173_ = objectdefinition.anInt2994;
							}
						}
						if (i_173_ != -1) {
							Node_Sub14 node_sub14 = new Node_Sub14(i_173_);
							node_sub14.anInt7125 = i;
							node_sub14.anInt7120 = i_169_;
							aClass312_331.method3625((byte) -54, node_sub14);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_174_ = 0; i_174_ < aClass103ArrayArrayArray353[0].length; i_174_++) {
				for (int i_175_ = 0; i_175_ < aClass103ArrayArrayArray353[0][0].length; i_175_++) {
					Class103 class103 = aClass103ArrayArrayArray353[i][i_174_][i_175_];
					if (class103 != null) {
						for (EntityNode_Sub9 entitynode_sub9 = (EntityNode_Sub9) class103.method1113((byte) -44); entitynode_sub9 != null; entitynode_sub9 = (EntityNode_Sub9) class103.method1108(124)) {
							if (entitynode_sub9.aShortArray6025 != null) {
								for (int i_176_ = 0; i_176_ < entitynode_sub9.aShortArray6025.length; i_176_++) {
									ObjectDefinition objectdefinition = aClass112_319.method1145(entitynode_sub9.aShortArray6025[i_176_] & 0xffff, 126);
									int i_177_ = objectdefinition.anInt2994;
									if (objectdefinition.anIntArray2984 != null) {
										objectdefinition = objectdefinition.method3038(13, anInterface17_317);
										if (objectdefinition != null) {
											i_177_ = objectdefinition.anInt2994;
										}
									}
									if (i_177_ != -1) {
										Node_Sub14 node_sub14 = new Node_Sub14(i_177_);
										node_sub14.anInt7125 = (i_174_ + (anInt354 >> 6)) * 64 + entitynode_sub9.aByte6029 - anInt354;
										node_sub14.anInt7120 = (i_175_ + (anInt343 >> 6)) * 64 + entitynode_sub9.aByte6031 - anInt343;
										aClass312_331.method3625((byte) -54, node_sub14);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	static final Class158 method286(int i, int i_178_) {
		Class158 class158 = new Class158();
		for (CacheNode_Sub11 cachenode_sub11 = (CacheNode_Sub11) aHashTable316.method1516(false); cachenode_sub11 != null; cachenode_sub11 = (CacheNode_Sub11) aHashTable316.method1520(101)) {
			if (cachenode_sub11.aBoolean9544 && cachenode_sub11.method2335((byte) 88, i, i_178_)) {
				class158.method1719(true, cachenode_sub11);
			}
		}
		return class158;
	}
	
	public static void method287() {
		aClass71_320 = null;
		aClass58_321 = null;
		aClass112_319 = null;
		aClass215_322 = null;
		aClass338_315 = null;
		anInterface17_317 = null;
		aCacheNode_Sub11_318 = null;
		aClass302_314 = null;
		aHashTable316 = null;
		aByteArrayArrayArray332 = null;
		aShortArray326 = null;
		aByteArray325 = null;
		aClass224_330 = null;
		aClass312_331 = null;
		anIntArray342 = null;
		aByteArray336 = null;
		aByteArray335 = null;
		aShortArray338 = null;
		aByteArray351 = null;
		aByteArray346 = null;
		aShortArray334 = null;
		aByteArray340 = null;
		aHashTable347 = null;
		aClass103ArrayArrayArray353 = null;
	}
	
	static final CacheNode_Sub11 method288(int i, int i_179_) {
		for (CacheNode_Sub11 cachenode_sub11 = (CacheNode_Sub11) aHashTable316.method1516(false); cachenode_sub11 != null; cachenode_sub11 = (CacheNode_Sub11) aHashTable316.method1520(115)) {
			if (cachenode_sub11.aBoolean9544 && cachenode_sub11.method2335((byte) 119, i, i_179_)) {
				return cachenode_sub11;
			}
		}
		return null;
	}
	
	static final void method289() {
		int[] is = new int[3];
		for (int i = 0; i < aClass224_330.anInt2670; i++) {
			boolean bool = aCacheNode_Sub11_318.method2337(-12584, is, aClass224_330.anIntArray2668[i] & 0x3fff, aClass224_330.anIntArray2668[i] >> 28 & 0x3, aClass224_330.anIntArray2668[i] >> 14 & 0x3fff);
			if (bool) {
				Node_Sub14 node_sub14 = new Node_Sub14(aClass224_330.anIntArray2669[i]);
				node_sub14.anInt7125 = is[1] - anInt354;
				node_sub14.anInt7120 = is[2] - anInt343;
				aClass312_331.method3625((byte) -54, node_sub14);
			}
		}
	}
	
	static final void method290(GraphicsToolkit graphicstoolkit, int i, int i_180_) {
		BufferedStream buffer = new BufferedStream(aClass302_314.method3529(aCacheNode_Sub11_318.aString9537, "area", 1));
		int i_181_ = buffer.readUnsignedByte();
		int[] is = new int[i_181_];
		for (int i_182_ = 0; i_182_ < i_181_; i_182_++)
			is[i_182_] = buffer.readUnsignedByte();
		int i_183_ = buffer.readUnsignedByte();
		int[] is_184_ = new int[i_183_];
		for (int i_185_ = 0; i_185_ < i_183_; i_185_++)
			is_184_[i_185_] = buffer.readUnsignedByte();
		while (buffer.offset < buffer.buffer.length) {
			if (buffer.readUnsignedByte() == 0) {
				int i_186_ = buffer.readUnsignedByte();
				int i_187_ = buffer.readUnsignedByte();
				for (int i_188_ = 0; i_188_ < 64; i_188_++) {
					for (int i_189_ = 0; i_189_ < 64; i_189_++) {
						int i_190_ = i_186_ * 64 + i_188_ - anInt354;
						int i_191_ = i_187_ * 64 + i_189_ - anInt343;
						method284(graphicstoolkit, buffer, i_186_, i_187_, i_190_, i_191_, is, is_184_);
					}
				}
			} else {
				int i_192_ = buffer.readUnsignedByte();
				int i_193_ = buffer.readUnsignedByte();
				int i_194_ = buffer.readUnsignedByte();
				int i_195_ = buffer.readUnsignedByte();
				for (int i_196_ = 0; i_196_ < 8; i_196_++) {
					for (int i_197_ = 0; i_197_ < 8; i_197_++) {
						int i_198_ = i_192_ * 64 + i_194_ * 8 + i_196_ - anInt354;
						int i_199_ = i_193_ * 64 + i_195_ * 8 + i_197_ - anInt343;
						method284(graphicstoolkit, buffer, i_192_, i_193_, i_198_, i_199_, is, is_184_);
					}
				}
			}
		}
		@SuppressWarnings("unused")
		Object object = null;
		aByteArray335 = new byte[anInt345 * anInt333];
		aShortArray338 = new short[anInt345 * anInt333];
		for (int i_200_ = 0; i_200_ < 3; i_200_++) {
			byte[] bs = new byte[anInt345 * anInt333];
			for (int i_201_ = 0; i_201_ < aClass103ArrayArrayArray353[i_200_].length; i_201_++) {
				for (int i_202_ = 0; i_202_ < aClass103ArrayArrayArray353[i_200_][0].length; i_202_++) {
					Class103 class103 = aClass103ArrayArrayArray353[i_200_][i_201_][i_202_];
					if (class103 != null) {
						for (EntityNode_Sub9 entitynode_sub9 = (EntityNode_Sub9) class103.method1113((byte) 98); entitynode_sub9 != null; entitynode_sub9 = (EntityNode_Sub9) class103.method1108(117))
							bs[i_201_ * 64 + entitynode_sub9.aByte6029 + (i_202_ * 64 + entitynode_sub9.aByte6031) * anInt345] = (byte) entitynode_sub9.anInt6027;
					}
				}
			}
			method274(bs, aByteArray335, aShortArray338, i, i_180_);
			for (int i_203_ = 0; i_203_ < aClass103ArrayArrayArray353[i_200_].length; i_203_++) {
				for (int i_204_ = 0; i_204_ < aClass103ArrayArrayArray353[i_200_][0].length; i_204_++) {
					Class103 class103 = aClass103ArrayArrayArray353[i_200_][i_203_][i_204_];
					if (class103 != null) {
						for (EntityNode_Sub9 entitynode_sub9 = (EntityNode_Sub9) class103.method1113((byte) 124); entitynode_sub9 != null; entitynode_sub9 = (EntityNode_Sub9) class103.method1108(109)) {
							int i_205_ = i_203_ * 64 + entitynode_sub9.aByte6029 + (i_204_ * 64 + entitynode_sub9.aByte6031) * anInt345;
							entitynode_sub9.anInt6027 = (aByteArray335[i_205_] & 0xff) << 16 | aShortArray338[i_205_] & 0xffff;
							if (entitynode_sub9.anInt6027 != 0) {
								entitynode_sub9.anInt6027 |= ~0xffffff;
							}
						}
					}
				}
			}
		}
		method274(aByteArray336, aByteArray335, aShortArray338, i, i_180_);
		aByteArray336 = null;
		method285();
	}
	
	static final Class312 method291(GraphicsToolkit graphicstoolkit) {
		int i = anInt341 - anInt349;
		int i_206_ = anInt337 - anInt352;
		int i_207_ = (anInt348 - anInt344 << 16) / i;
		int i_208_ = (anInt339 - anInt350 << 16) / i_206_;
		return method292(graphicstoolkit, i_207_, i_208_, 0, 0);
	}
	
	private static final Class312 method292(GraphicsToolkit graphicstoolkit, int i, int i_209_, int i_210_, int i_211_) {
		for (Node_Sub14 node_sub14 = (Node_Sub14) aClass312_331.method3613(65280); node_sub14 != null; node_sub14 = (Node_Sub14) aClass312_331.method3620(16776960))
			method283(graphicstoolkit, node_sub14, i, i_209_, i_210_, i_211_);
		return aClass312_331;
	}
	
	static {
		anInt323 = (int) (Math.random() * 11.0) - 5;
		aShortArray326 = new int[1];
		anInt324 = (int) (Math.random() * 17.0) - 8;
		aClass312_331 = new Class312();
	}
}
