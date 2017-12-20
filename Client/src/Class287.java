/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Class287
{
	private Interface15_Impl2 anInterface15_Impl2_3605;
	static boolean aBoolean3606 = false;
	static int anInt3607;
	private EntityNode_Sub3_Sub2[][] anEntityNode_Sub3_Sub2ArrayArray3608 = new EntityNode_Sub3_Sub2[1600][64];
	static int anInt3609;
	static int anInt3610;
	static int anInt3611;
	static int anInt3612;
	static int anInt3613;
	private int anInt3614;
	private EntityNode_Sub3_Sub2[][] anEntityNode_Sub3_Sub2ArrayArray3615;
	private int[] anIntArray3616 = new int[64];
	static int anInt3617;
	private Interface15_Impl2 anInterface15_Impl2_3618;
	private int[] anIntArray3619;
	private Class213 aClass213_3620;
	static int anInt3621;
	private Interface15_Impl1 anInterface15_Impl1_3622;
	private int[] anIntArray3623;
	
	final void method3396(byte b) {
		anInt3612++;
		if (b != -74) {
			anIntArray3619 = null;
		}
		anInterface15_Impl2_3605.method38(false);
	}
	
	final void method3397(Class198 class198, int i, int i_0_, AbstractToolkit abstracttoolkit) {
		anInt3609++;
		if (abstracttoolkit.aClass336_Sub1_6267 != null) {
			if (i < 0) {
				method3402((byte) -45, abstracttoolkit);
			} else {
				method3400(i, (byte) -107, abstracttoolkit);
			}
			float f = abstracttoolkit.aClass336_Sub1_6267.aFloat8547;
			float f_1_ = abstracttoolkit.aClass336_Sub1_6267.aFloat8508;
			float f_2_ = abstracttoolkit.aClass336_Sub1_6267.aFloat8556;
			float f_3_ = abstracttoolkit.aClass336_Sub1_6267.aFloat8542;
			try {
				int i_4_ = 0;
				int i_5_ = 2147483647;
				int i_6_ = 0;
				EntityNode_Sub3 entitynode_sub3 = class198.aClass87_2429.anEntityNode_Sub3_1186;
				for (EntityNode_Sub3 entitynode_sub3_7_ = entitynode_sub3.anEntityNode_Sub3_5961; entitynode_sub3 != entitynode_sub3_7_; entitynode_sub3_7_ = entitynode_sub3_7_.anEntityNode_Sub3_5961) {
					EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) entitynode_sub3_7_;
					int i_8_ = (int) (f_1_ * (float) (entitynode_sub3_sub2.anInt9171 >> 12) + f * (float) (entitynode_sub3_sub2.anInt9174 >> 12) + f_2_ * (float) (entitynode_sub3_sub2.anInt9173 >> 12) + f_3_);
					if ((i_8_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
						i_5_ = i_8_;
					}
					if ((i_6_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
						i_6_ = i_8_;
					}
					anIntArray3623[i_4_++] = i_8_;
				}
				int i_9_ = i_6_ + -i_5_;
				int i_10_;
				if (i_9_ + 2 > 1600) {
					i_10_ = Node_Sub38_Sub20.method2855(i_9_, (byte) -105) + (1 + -Node_Sub38_Sub15.anInt10259);
					i_9_ = (i_9_ >> i_10_) - -2;
				} else {
					i_10_ = 0;
					i_9_ += 2;
				}
				i_4_ = i_0_;
				EntityNode_Sub3 entitynode_sub3_11_ = entitynode_sub3.anEntityNode_Sub3_5961;
				int i_12_ = -2;
				boolean bool = true;
				boolean bool_13_ = true;
				while (entitynode_sub3_11_ != entitynode_sub3) {
					anInt3614 = 0;
					for (int i_14_ = 0; i_14_ < i_9_; i_14_++)
						anIntArray3619[i_14_] = 0;
					for (int i_15_ = 0; i_15_ < 64; i_15_++)
						anIntArray3616[i_15_] = 0;
					for (/**/; entitynode_sub3 != entitynode_sub3_11_; entitynode_sub3_11_ = entitynode_sub3_11_.anEntityNode_Sub3_5961) {
						EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) entitynode_sub3_11_;
						if (bool_13_) {
							bool = entitynode_sub3_sub2.aBoolean9169;
							bool_13_ = false;
							i_12_ = entitynode_sub3_sub2.anInt9177;
						}
						if (i_4_ > 0 && (i_12_ != entitynode_sub3_sub2.anInt9177 || !entitynode_sub3_sub2.aBoolean9169 == bool)) {
							bool_13_ = true;
							break;
						}
						int i_16_ = anIntArray3623[i_4_++] + -i_5_ >> i_10_;
						if (i_16_ < 1600) {
							if (anIntArray3619[i_16_] >= 64) {
								if (anIntArray3619[i_16_] == 64) {
									if (anInt3614 == 64) {
										continue;
									}
									anIntArray3619[i_16_] += anInt3614++ + 1;
								}
								anEntityNode_Sub3_Sub2ArrayArray3615[-1 + anIntArray3619[i_16_] - 64][anIntArray3616[anIntArray3619[i_16_] + -64 - 1]++] = entitynode_sub3_sub2;
							} else {
								anEntityNode_Sub3_Sub2ArrayArray3608[i_16_][anIntArray3619[i_16_]++] = entitynode_sub3_sub2;
							}
						}
					}
					abstracttoolkit.method1332(i_0_ ^ 0x3, false, i_12_ < 0 ? -1 : i_12_, false);
					if (bool && Class141.aFloat1748 != abstracttoolkit.aFloat6300) {
						abstracttoolkit.xa(Class141.aFloat1748);
					} else if (abstracttoolkit.aFloat6300 != 1.0F) {
						abstracttoolkit.xa(1.0F);
					}
					method3403(i_9_, false, abstracttoolkit);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method3398(-110, abstracttoolkit);
		}
	}
	
	private final void method3398(int i, AbstractToolkit abstracttoolkit) {
		if (i > -16) {
			method3398(-52, null);
		}
		abstracttoolkit.method1307(-85, true);
		anInt3621++;
		abstracttoolkit.method1341((byte) -69, true);
		if (Class141.aFloat1748 != abstracttoolkit.aFloat6300) {
			abstracttoolkit.xa(Class141.aFloat1748);
		}
	}
	
	final void method3399(AbstractToolkit abstracttoolkit, int i) {
		anInt3617++;
		anInterface15_Impl2_3605.method37(24, 786336, -12093);
		if (i != -1) {
			method3397(null, -47, 119, null);
		}
	}
	
	private final void method3400(int i, byte b, AbstractToolkit abstracttoolkit) {
		Class141.aFloat1748 = abstracttoolkit.aFloat6300;
		anInt3610++;
		abstracttoolkit.method1270((byte) -124, (float) i);
		abstracttoolkit.method1335(true);
		@SuppressWarnings("unused")
		int i_17_ = -29 / ((b - -13) / 63);
		abstracttoolkit.method1341((byte) -49, false);
		abstracttoolkit.method1307(-89, false);
		abstracttoolkit.method1320((byte) -99);
	}
	
	static final void method3401(Node_Sub19 node_sub19, boolean bool, int i) {
		if (!node_sub19.aBoolean7156) {
			if (node_sub19.aBoolean7159 && node_sub19.anInt7171 >= 1 && node_sub19.anInt7161 >= 1 && -2 + Node_Sub54.GAME_SCENE_WDITH >= node_sub19.anInt7171 && (-2 + Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) <= (node_sub19.anInt7161 ^ 0xffffffff) && ((node_sub19.anInt7169 ^ 0xffffffff) > -1 || Class128.method1547(node_sub19.anInt7169, 1, node_sub19.anInt7168))) {
				if (bool) {
					Node_Sub38_Sub37.method2907(node_sub19.anInt7166, -14347, node_sub19.aClass121_7160, node_sub19.anInt7161, node_sub19.anInt7165, node_sub19.anInt7171);
				} else {
					Class128.method1544(node_sub19.anInt7161, node_sub19.anInt7168, node_sub19.anInt7167, node_sub19.anInt7171, -1, node_sub19.anInt7166, node_sub19.anInt7165, -128, node_sub19.anInt7169);
				}
				node_sub19.aBoolean7159 = false;
				if (bool || node_sub19.anInt7154 != node_sub19.anInt7169 || (node_sub19.anInt7154 ^ 0xffffffff) != 0) {
					if (!bool && (node_sub19.anInt7154 ^ 0xffffffff) == (node_sub19.anInt7169 ^ 0xffffffff) && node_sub19.anInt7167 == node_sub19.anInt7170 && (node_sub19.anInt7168 ^ 0xffffffff) == (node_sub19.anInt7164 ^ 0xffffffff)) {
						node_sub19.method2160((byte) 44);
					}
				} else {
					node_sub19.method2160((byte) 79);
				}
			}
		} else if (node_sub19.anInt7154 < 0 || Class128.method1547(node_sub19.anInt7154, i + 2, node_sub19.anInt7164)) {
			if (bool) {
				Node_Sub38_Sub37.method2907(node_sub19.anInt7166, i ^ 0x380a, null, node_sub19.anInt7161, node_sub19.anInt7165, node_sub19.anInt7171);
			} else {
				Class128.method1544(node_sub19.anInt7161, node_sub19.anInt7164, node_sub19.anInt7170, node_sub19.anInt7171, -1, node_sub19.anInt7166, node_sub19.anInt7165, -39, node_sub19.anInt7154);
			}
			node_sub19.method2160((byte) 68);
		}
		anInt3607++;
		if (i != -1) {
			method3401(null, true, 75);
		}
	}
	
	private final void method3402(byte b, AbstractToolkit abstracttoolkit) {
		anInt3611++;
		if (b != -45) {
			method3400(-87, (byte) -86, null);
		}
		Class141.aFloat1748 = abstracttoolkit.aFloat6300;
		abstracttoolkit.method1268(0);
		abstracttoolkit.method1341((byte) 75, false);
		abstracttoolkit.method1307(-120, false);
		abstracttoolkit.method1320((byte) -79);
	}
	
	private final void method3403(int i, boolean bool, AbstractToolkit abstracttoolkit) {
		anInt3613++;
		int i_18_ = 0;
		Class336_Sub1 class336_sub1 = abstracttoolkit.method1378(50);
		float f = class336_sub1.aFloat8530;
		float f_19_ = class336_sub1.aFloat8531;
		if (bool == false) {
			float f_20_ = class336_sub1.aFloat8529;
			float f_21_ = class336_sub1.aFloat8544;
			float f_22_ = class336_sub1.aFloat8538;
			float f_23_ = class336_sub1.aFloat8535;
			float f_24_ = f_21_ + f;
			float f_25_ = f_22_ + f_19_;
			float f_26_ = f_23_ + f_20_;
			float f_27_ = -f_21_ + f;
			float f_28_ = f_19_ - f_22_;
			float f_29_ = f_20_ - f_23_;
			float f_30_ = -f + f_21_;
			float f_31_ = -f_19_ + f_22_;
			float f_32_ = f_23_ - f_20_;
			jaclib.memory.Buffer buffer = anInterface15_Impl2_3605.method40(-87, true);
			if (buffer != null) {
				Stream stream = abstracttoolkit.method1324(!bool, buffer);
				if (Stream.b()) {
					for (int i_33_ = i - 1; (i_33_ ^ 0xffffffff) <= -1; i_33_--) {
						int i_34_ = (anIntArray3619[i_33_] ^ 0xffffffff) < -65 ? 64 : anIntArray3619[i_33_];
						if ((i_34_ ^ 0xffffffff) < -1) {
							for (int i_35_ = -1 + i_34_; i_35_ >= 0; i_35_--) {
								EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = anEntityNode_Sub3_Sub2ArrayArray3608[i_33_][i_35_];
								int i_36_ = entitynode_sub3_sub2.anInt9176;
								byte b = (byte) (i_36_ >> 16);
								byte b_37_ = (byte) (i_36_ >> 8);
								byte b_38_ = (byte) i_36_;
								byte b_39_ = (byte) (i_36_ >>> 24);
								float f_40_ = (float) (entitynode_sub3_sub2.anInt9174 >> 12);
								float f_41_ = (float) (entitynode_sub3_sub2.anInt9171 >> 12);
								float f_42_ = (float) (entitynode_sub3_sub2.anInt9173 >> 12);
								int i_43_ = entitynode_sub3_sub2.anInt9172 >> 12;
								stream.a((float) -i_43_ * f_24_ + f_40_);
								stream.a((float) -i_43_ * f_25_ + f_41_);
								stream.a(f_42_ + (float) -i_43_ * f_26_);
								if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
									stream.b(b, b_37_, b_38_, b_39_);
								} else {
									stream.a(b, b_37_, b_38_, b_39_);
								}
								stream.a(0.0F);
								stream.a(0.0F);
								stream.a(f_40_ + f_27_ * (float) i_43_);
								stream.a(f_41_ + f_28_ * (float) i_43_);
								stream.a(f_42_ + f_29_ * (float) i_43_);
								if (abstracttoolkit.anInt6360 == 0) {
									stream.a(b, b_37_, b_38_, b_39_);
								} else {
									stream.b(b, b_37_, b_38_, b_39_);
								}
								stream.a(1.0F);
								stream.a(0.0F);
								stream.a((float) i_43_ * f_24_ + f_40_);
								stream.a(f_41_ + (float) i_43_ * f_25_);
								stream.a(f_42_ + (float) i_43_ * f_26_);
								if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
									stream.b(b, b_37_, b_38_, b_39_);
								} else {
									stream.a(b, b_37_, b_38_, b_39_);
								}
								stream.a(1.0F);
								stream.a(1.0F);
								stream.a((float) i_43_ * f_30_ + f_40_);
								stream.a(f_31_ * (float) i_43_ + f_41_);
								stream.a(f_42_ + f_32_ * (float) i_43_);
								if (abstracttoolkit.anInt6360 != 0) {
									stream.b(b, b_37_, b_38_, b_39_);
								} else {
									stream.a(b, b_37_, b_38_, b_39_);
								}
								stream.a(0.0F);
								stream.a(1.0F);
								i_18_++;
							}
							if ((anIntArray3619[i_33_] ^ 0xffffffff) < -65) {
								int i_44_ = -1 + anIntArray3619[i_33_] - 64;
								for (int i_45_ = -1 + anIntArray3616[i_44_]; (i_45_ ^ 0xffffffff) <= -1; i_45_--) {
									EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = anEntityNode_Sub3_Sub2ArrayArray3615[i_44_][i_45_];
									int i_46_ = entitynode_sub3_sub2.anInt9176;
									byte b = (byte) (i_46_ >> 16);
									byte b_47_ = (byte) (i_46_ >> 8);
									byte b_48_ = (byte) i_46_;
									byte b_49_ = (byte) (i_46_ >>> 24);
									float f_50_ = (float) (entitynode_sub3_sub2.anInt9174 >> 12);
									float f_51_ = (float) (entitynode_sub3_sub2.anInt9171 >> 12);
									float f_52_ = (float) (entitynode_sub3_sub2.anInt9173 >> 12);
									int i_53_ = entitynode_sub3_sub2.anInt9172 >> 12;
									stream.a(f_24_ * (float) -i_53_ + f_50_);
									stream.a(f_51_ + (float) -i_53_ * f_25_);
									stream.a((float) -i_53_ * f_26_ + f_52_);
									if (abstracttoolkit.anInt6360 == 0) {
										stream.a(b, b_47_, b_48_, b_49_);
									} else {
										stream.b(b, b_47_, b_48_, b_49_);
									}
									stream.a(0.0F);
									stream.a(0.0F);
									stream.a((float) i_53_ * f_27_ + f_50_);
									stream.a(f_28_ * (float) i_53_ + f_51_);
									stream.a(f_52_ + (float) i_53_ * f_29_);
									if (abstracttoolkit.anInt6360 == 0) {
										stream.a(b, b_47_, b_48_, b_49_);
									} else {
										stream.b(b, b_47_, b_48_, b_49_);
									}
									stream.a(1.0F);
									stream.a(0.0F);
									stream.a((float) i_53_ * f_24_ + f_50_);
									stream.a(f_51_ + f_25_ * (float) i_53_);
									stream.a(f_26_ * (float) i_53_ + f_52_);
									if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
										stream.b(b, b_47_, b_48_, b_49_);
									} else {
										stream.a(b, b_47_, b_48_, b_49_);
									}
									stream.a(1.0F);
									stream.a(1.0F);
									stream.a(f_30_ * (float) i_53_ + f_50_);
									stream.a(f_51_ + f_31_ * (float) i_53_);
									stream.a((float) i_53_ * f_32_ + f_52_);
									if (abstracttoolkit.anInt6360 != 0) {
										stream.b(b, b_47_, b_48_, b_49_);
									} else {
										stream.a(b, b_47_, b_48_, b_49_);
									}
									stream.a(0.0F);
									i_18_++;
									stream.a(1.0F);
								}
							}
						}
					}
				} else {
					for (int i_54_ = i + -1; i_54_ >= 0; i_54_--) {
						int i_55_ = anIntArray3619[i_54_] > 64 ? 64 : anIntArray3619[i_54_];
						if ((i_55_ ^ 0xffffffff) < -1) {
							for (int i_56_ = i_55_ - 1; i_56_ >= 0; i_56_--) {
								EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = anEntityNode_Sub3_Sub2ArrayArray3608[i_54_][i_56_];
								int i_57_ = entitynode_sub3_sub2.anInt9176;
								byte b = (byte) (i_57_ >> 16);
								byte b_58_ = (byte) (i_57_ >> 8);
								byte b_59_ = (byte) i_57_;
								byte b_60_ = (byte) (i_57_ >>> 24);
								float f_61_ = (float) (entitynode_sub3_sub2.anInt9174 >> 12);
								float f_62_ = (float) (entitynode_sub3_sub2.anInt9171 >> 12);
								float f_63_ = (float) (entitynode_sub3_sub2.anInt9173 >> 12);
								int i_64_ = entitynode_sub3_sub2.anInt9172 >> 12;
								stream.b(f_24_ * (float) -i_64_ + f_61_);
								stream.b(f_62_ + (float) -i_64_ * f_25_);
								stream.b(f_63_ + f_26_ * (float) -i_64_);
								if ((abstracttoolkit.anInt6360 ^ 0xffffffff) == -1) {
									stream.a(b, b_58_, b_59_, b_60_);
								} else {
									stream.b(b, b_58_, b_59_, b_60_);
								}
								stream.b(0.0F);
								stream.b(0.0F);
								stream.b(f_61_ + f_27_ * (float) i_64_);
								stream.b(f_28_ * (float) i_64_ + f_62_);
								stream.b(f_29_ * (float) i_64_ + f_63_);
								if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
									stream.b(b, b_58_, b_59_, b_60_);
								} else {
									stream.a(b, b_58_, b_59_, b_60_);
								}
								stream.b(1.0F);
								stream.b(0.0F);
								stream.b(f_61_ + f_24_ * (float) i_64_);
								stream.b(f_25_ * (float) i_64_ + f_62_);
								stream.b(f_63_ + (float) i_64_ * f_26_);
								if (abstracttoolkit.anInt6360 != 0) {
									stream.b(b, b_58_, b_59_, b_60_);
								} else {
									stream.a(b, b_58_, b_59_, b_60_);
								}
								stream.b(1.0F);
								stream.b(1.0F);
								stream.b(f_61_ + f_30_ * (float) i_64_);
								stream.b((float) i_64_ * f_31_ + f_62_);
								stream.b(f_63_ + f_32_ * (float) i_64_);
								if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
									stream.b(b, b_58_, b_59_, b_60_);
								} else {
									stream.a(b, b_58_, b_59_, b_60_);
								}
								stream.b(0.0F);
								stream.b(1.0F);
								i_18_++;
							}
							if ((anIntArray3619[i_54_] ^ 0xffffffff) < -65) {
								int i_65_ = -65 + anIntArray3619[i_54_];
								for (int i_66_ = anIntArray3616[i_65_] + -1; (i_66_ ^ 0xffffffff) <= -1; i_66_--) {
									EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = anEntityNode_Sub3_Sub2ArrayArray3615[i_65_][i_66_];
									int i_67_ = entitynode_sub3_sub2.anInt9176;
									byte b = (byte) (i_67_ >> 16);
									byte b_68_ = (byte) (i_67_ >> 8);
									byte b_69_ = (byte) i_67_;
									byte b_70_ = (byte) (i_67_ >>> 24);
									float f_71_ = (float) (entitynode_sub3_sub2.anInt9174 >> 12);
									float f_72_ = (float) (entitynode_sub3_sub2.anInt9171 >> 12);
									float f_73_ = (float) (entitynode_sub3_sub2.anInt9173 >> 12);
									int i_74_ = entitynode_sub3_sub2.anInt9172 >> 12;
									stream.b(f_24_ * (float) -i_74_ + f_71_);
									stream.b(f_72_ + (float) -i_74_ * f_25_);
									stream.b(f_26_ * (float) -i_74_ + f_73_);
									if (abstracttoolkit.anInt6360 != 0) {
										stream.b(b, b_68_, b_69_, b_70_);
									} else {
										stream.a(b, b_68_, b_69_, b_70_);
									}
									stream.b(0.0F);
									stream.b(0.0F);
									stream.b((float) i_74_ * f_27_ + f_71_);
									stream.b(f_72_ + f_28_ * (float) i_74_);
									stream.b(f_73_ + (float) i_74_ * f_29_);
									if (abstracttoolkit.anInt6360 == 0) {
										stream.a(b, b_68_, b_69_, b_70_);
									} else {
										stream.b(b, b_68_, b_69_, b_70_);
									}
									stream.b(1.0F);
									stream.b(0.0F);
									stream.b(f_71_ + (float) i_74_ * f_24_);
									stream.b((float) i_74_ * f_25_ + f_72_);
									stream.b((float) i_74_ * f_26_ + f_73_);
									if ((abstracttoolkit.anInt6360 ^ 0xffffffff) != -1) {
										stream.b(b, b_68_, b_69_, b_70_);
									} else {
										stream.a(b, b_68_, b_69_, b_70_);
									}
									stream.b(1.0F);
									stream.b(1.0F);
									stream.b(f_30_ * (float) i_74_ + f_71_);
									stream.b(f_31_ * (float) i_74_ + f_72_);
									stream.b((float) i_74_ * f_32_ + f_73_);
									if ((abstracttoolkit.anInt6360 ^ 0xffffffff) == -1) {
										stream.a(b, b_68_, b_69_, b_70_);
									} else {
										stream.b(b, b_68_, b_69_, b_70_);
									}
									stream.b(0.0F);
									stream.b(1.0F);
									i_18_++;
								}
							}
						}
					}
				}
				stream.c();
				if (anInterface15_Impl2_3605.method39(124)) {
					abstracttoolkit.method1354(0, 32011, anInterface15_Impl2_3605);
					abstracttoolkit.method1354(1, 32011, anInterface15_Impl2_3618);
					abstracttoolkit.method1338(aClass213_3620, 9422);
					abstracttoolkit.method1276(0, (byte) -76, 0, anInterface15_Impl1_3622, 4 * i_18_, Class55.aClass104_833, 2 * i_18_);
				}
			}
		}
	}
	
	Class287(AbstractToolkit abstracttoolkit) {
		anEntityNode_Sub3_Sub2ArrayArray3615 = new EntityNode_Sub3_Sub2[64][768];
		anInt3614 = 0;
		anIntArray3619 = new int[1600];
		anIntArray3623 = new int[8191];
		aClass213_3620 = abstracttoolkit.method1372((byte) -128, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1626, Class126.aClass126_1628 }), new Class207(Class126.aClass126_1625) });
		anInterface15_Impl2_3605 = abstracttoolkit.method1380(2, true);
		anInterface15_Impl2_3618 = abstracttoolkit.method1380(2, false);
		anInterface15_Impl2_3618.method37(12, 393168, -12093);
		anInterface15_Impl1_3622 = abstracttoolkit.method1346(false, (byte) 102);
		anInterface15_Impl1_3622.method56(-1696, 49146);
		jaclib.memory.Buffer buffer = anInterface15_Impl1_3622.method54(true, (byte) 74);
		if (buffer != null) {
			Stream stream = abstracttoolkit.method1324(true, buffer);
			if (Stream.b()) {
				for (int i = 0; i < 8191; i++) {
					int i_75_ = i * 4;
					stream.b(i_75_);
					stream.b(i_75_ - -1);
					stream.b(i_75_ + 2);
					stream.b(i_75_ + 2);
					stream.b(3 + i_75_);
					stream.b(i_75_);
				}
			} else {
				for (int i = 0; i < 8191; i++) {
					int i_76_ = 4 * i;
					stream.c(i_76_);
					stream.c(1 + i_76_);
					stream.c(i_76_ + 2);
					stream.c(2 + i_76_);
					stream.c(3 + i_76_);
					stream.c(i_76_);
				}
			}
			stream.c();
			anInterface15_Impl1_3622.method53(-3308);
		}
		jaclib.memory.Buffer buffer_77_ = anInterface15_Impl2_3618.method40(112, true);
		if (buffer_77_ != null) {
			Stream stream = abstracttoolkit.method1324(true, buffer_77_);
			if (!Stream.b()) {
				for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
					stream.b(0.0F);
					stream.b(-1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(-1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(-1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(-1.0F);
					stream.b(0.0F);
				}
			} else {
				for (int i = 0; i < 8191; i++) {
					stream.a(0.0F);
					stream.a(-1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(-1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(-1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(-1.0F);
					stream.a(0.0F);
				}
			}
			stream.c();
			anInterface15_Impl2_3618.method39(127);
		}
	}
}
