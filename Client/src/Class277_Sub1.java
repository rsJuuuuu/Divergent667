/* Class277_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class277_Sub1 extends Class277
{
	static int anInt8040;
	static int anInt8041;
	static int[][][] anIntArrayArrayArray8042 = new int[2][][];
	static int anInt8043;
	static int anInt8044;
	static int anInt8045;
	protected int anInt8046 = 99;
	static int anInt8047;
	static int anInt8048;
	static int anInt8049;
	static OutcommingPacket aClass318_8050 = new OutcommingPacket(29, -1);
	static int anInt8051;
	static int anInt8052;
	/*synthetic*/ static Class<?> aClass8053;
	
	final void method3350(int i, int i_0_, int i_1_, Class84[] class84s, GraphicsToolkit graphicstoolkit, byte[] bs) {
		anInt8052++;
		BufferedStream buffer = new BufferedStream(bs);
		int objectId = -1;
		for (;;) {
			int i_4_ = buffer.readSmart2(true);
			if (i_4_ == 0) {
				break;
			}
			objectId += i_4_;
			int i_5_ = 0;
			for (;;) {
				int i_6_ = buffer.readSmart();
				if (i_6_ == 0) {
					break;
				}
				i_5_ += i_6_ + -1;
				int i_7_ = i_5_ & 0x3f;
				int i_8_ = (i_5_ & 0xff6) >> 6;
				int i_9_ = i_5_ >> 12;
				int i_10_ = buffer.readUnsignedByte();
				int i_11_ = i_10_ >> 2;
				int i_12_ = i_10_ & 0x3;
				int i_13_ = i_8_ - -i;
				int i_14_ = i_0_ + i_7_;
				if (i_13_ > 0 && (i_14_ ^ 0xffffffff) < -1 && i_13_ < -1 + anInt3524 && (i_14_ ^ 0xffffffff) > (anInt3521 + -1 ^ 0xffffffff)) {
					Class84 class84 = null;
					if (!aBoolean3516) {
						int i_15_ = i_9_;
						if ((CacheNode_Sub11.aByteArrayArrayArray9550[1][i_13_][i_14_] & 0x2 ^ 0xffffffff) == -3) {
							i_15_--;
						}
						if ((i_15_ ^ 0xffffffff) <= -1) {
							class84 = class84s[i_15_];
						}
					}
					method3352(i_11_, objectId, class84, i_14_, graphicstoolkit, i_13_, i_12_, -69, i_9_, i_9_, -1);
				}
			}
		}
	}
	
	final void method3351(int i, BufferedStream buffer, int i_16_, GraphicsToolkit graphicstoolkit, int i_17_) {
		anInt8043++;
		if (!aBoolean3516) {
			boolean bool = false;
			Class343 class343 = null;
			if (i_17_ != 17986) {
				method3360((byte) -79, null, null, null);
			}
			while (buffer.buffer.length > buffer.offset) {
				int i_18_ = buffer.readUnsignedByte();
				if (i_18_ != 0) {
					if ((i_18_ ^ 0xffffffff) != -2) {
						if (i_18_ != 2) {
							if ((i_18_ ^ 0xffffffff) == -129) {
								if (class343 == null) {
									class343 = new Class343();
								}
								class343.method3964(buffer, -4807);
							} else {
								if ((i_18_ ^ 0xffffffff) != -130) {
									throw new IllegalStateException("");
								}
								if (aByteArrayArrayArray3518 == null) {
									aByteArrayArrayArray3518 = new byte[4][][];
								}
								bool = true;
								for (int i_19_ = 0; i_19_ < 4; i_19_++) {
									byte b = buffer.readByte();
									if (b != 0 || aByteArrayArrayArray3518[i_19_] == null) {
										if ((b ^ 0xffffffff) != -2) {
											if ((b ^ 0xffffffff) == -3) {
												if (aByteArrayArrayArray3518[i_19_] == null) {
													aByteArrayArrayArray3518[i_19_] = new byte[1 + anInt3524][anInt3521 + 1];
												}
												if ((i_19_ ^ 0xffffffff) < -1) {
													int i_20_ = i_16_;
													int i_21_ = i_16_ + 64;
													int i_22_ = i;
													int i_23_ = 64 + i;
													if ((i_21_ ^ 0xffffffff) > -1) {
														i_21_ = 0;
													} else if (anInt3524 <= i_21_) {
														i_21_ = anInt3524;
													}
													if (i_20_ >= 0) {
														if (i_20_ >= anInt3524) {
															i_20_ = anInt3524;
														}
													} else {
														i_20_ = 0;
													}
													if (i_22_ < 0) {
														i_22_ = 0;
													} else if (i_22_ >= anInt3521) {
														i_22_ = anInt3521;
													}
													if ((i_23_ ^ 0xffffffff) <= -1) {
														if ((i_23_ ^ 0xffffffff) <= (anInt3521 ^ 0xffffffff)) {
															i_23_ = anInt3521;
														}
													} else {
														i_23_ = 0;
													}
													for (/**/; (i_20_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_20_++) {
														for (/**/; i_23_ > i_22_; i_22_++)
															aByteArrayArrayArray3518[i_19_][i_20_][i_22_] = aByteArrayArrayArray3518[-1 + i_19_][i_20_][i_22_];
													}
												}
											}
										} else {
											if (aByteArrayArrayArray3518[i_19_] == null) {
												aByteArrayArrayArray3518[i_19_] = new byte[1 + anInt3524][1 + anInt3521];
											}
											for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -65; i_24_ += 4) {
												for (int i_25_ = 0; i_25_ < 64; i_25_ += 4) {
													byte b_26_ = buffer.readByte();
													for (int i_27_ = i_24_ - -i_16_; (i_27_ ^ 0xffffffff) > (4 + (i_24_ + i_16_) ^ 0xffffffff); i_27_++) {
														for (int i_28_ = i + i_25_; (i_28_ ^ 0xffffffff) > (i + (i_25_ - -4) ^ 0xffffffff); i_28_++) {
															if ((i_27_ ^ 0xffffffff) <= -1 && (anInt3524 ^ 0xffffffff) < (i_27_ ^ 0xffffffff) && i_28_ >= 0 && anInt3521 > i_28_) {
																aByteArrayArrayArray3518[i_19_][i_27_][i_28_] = b_26_;
															}
														}
													}
												}
											}
										}
									} else {
										int i_29_ = i_16_;
										int i_30_ = 64 + i_16_;
										int i_31_ = i;
										int i_32_ = 64 + i;
										if (i_29_ >= 0) {
											if ((i_29_ ^ 0xffffffff) <= (anInt3524 ^ 0xffffffff)) {
												i_29_ = anInt3524;
											}
										} else {
											i_29_ = 0;
										}
										if (i_31_ >= 0) {
											if ((i_31_ ^ 0xffffffff) <= (anInt3521 ^ 0xffffffff)) {
												i_31_ = anInt3521;
											}
										} else {
											i_31_ = 0;
										}
										if ((i_30_ ^ 0xffffffff) > -1) {
											i_30_ = 0;
										} else if ((anInt3524 ^ 0xffffffff) >= (i_30_ ^ 0xffffffff)) {
											i_30_ = anInt3524;
										}
										if (i_32_ >= 0) {
											if ((i_32_ ^ 0xffffffff) <= (anInt3521 ^ 0xffffffff)) {
												i_32_ = anInt3521;
											}
										} else {
											i_32_ = 0;
										}
										for (/**/; i_30_ > i_29_; i_29_++) {
											for (/**/; i_31_ < i_32_; i_31_++)
												aByteArrayArrayArray3518[i_19_][i_29_][i_31_] = (byte) 0;
										}
									}
								}
							}
						} else {
							if (class343 == null) {
								class343 = new Class343();
							}
							class343.method3965(buffer, true);
						}
					} else {
						int i_33_ = buffer.readUnsignedByte();
						if ((i_33_ ^ 0xffffffff) < -1) {
							for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff); i_34_++) {
								Class326 class326 = new Class326(graphicstoolkit, buffer, 2);
								if (class326.anInt4110 == 31) {
									Class367 class367 = Class32.aClass359_508.method4039(buffer.readUnsignedShort(), (byte) 123);
									class326.method3819(class367.anInt4538, (byte) -27, class367.anInt4536, class367.anInt4537, class367.anInt4542);
								}
								if ((graphicstoolkit.e() ^ 0xffffffff) < -1) {
									Node_Sub29 node_sub29 = class326.aNode_Sub29_4100;
									int i_35_ = (i_16_ << 9) + node_sub29.method2705(32311);
									int i_36_ = (i << 9) + node_sub29.method2708(27433);
									int i_37_ = i_35_ >> 9;
									int i_38_ = i_36_ >> 9;
									if (i_37_ >= 0 && i_38_ >= 0 && anInt3524 > i_37_ && anInt3521 > i_38_) {
										node_sub29.method2706(4752, i_35_, i_36_, anIntArrayArrayArray3520[class326.anInt4092][i_37_][i_38_] - node_sub29.method2704(30));
										Class370.method4089(class326);
									}
								}
							}
						}
					}
				} else if (class343 == null) {
					class343 = new Class343(buffer);
				} else {
					class343.method3966(buffer, i_17_ ^ 0x1832);
				}
			}
			if (class343 != null) {
				for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -9; i_39_++) {
					for (int i_40_ = 0; i_40_ < 8; i_40_++) {
						int i_41_ = i_39_ + (i_16_ >> 3);
						int i_42_ = i_40_ + (i >> 3);
						if ((i_41_ ^ 0xffffffff) <= -1 && anInt3524 >> 3 > i_41_ && i_42_ >= 0 && (anInt3521 >> 3 ^ 0xffffffff) < (i_42_ ^ 0xffffffff)) {
							Node_Sub15_Sub3.method2563(i_42_, i_41_, (byte) -63, class343);
						}
					}
				}
			}
			if (!bool && aByteArrayArrayArray3518 != null) {
				for (int i_43_ = 0; i_43_ < 4; i_43_++) {
					if (aByteArrayArrayArray3518[i_43_] != null) {
						for (int i_44_ = 0; i_44_ < 16; i_44_++) {
							for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > -17; i_45_++) {
								int i_46_ = (i_16_ >> 2) - -i_44_;
								int i_47_ = (i >> 2) - -i_45_;
								if ((i_46_ ^ 0xffffffff) <= -1 && (i_46_ ^ 0xffffffff) > -27 && (i_47_ ^ 0xffffffff) <= -1 && (i_47_ ^ 0xffffffff) > -27) {
									aByteArrayArrayArray3518[i_43_][i_46_][i_47_] = (byte) 0;
								}
							}
						}
					}
				}
			}
		}
	}
	
	final void method3352(int i, int objectId, Class84 class84, int i_49_, GraphicsToolkit graphicstoolkit, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		anInt8048++;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) ^ 0xffffffff) != -1 || Class369.method4085(i_49_, 0, Class94.anInt1249, i_50_, i_53_)) {
			if ((i_54_ ^ 0xffffffff) > (anInt8046 ^ 0xffffffff)) {
				anInt8046 = i_54_;
			}
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(objectId, 82);
			if (Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false) != 0 || !objectdefinition.aBoolean2990) {
				int i_56_;
				int i_57_;
				if ((i_51_ ^ 0xffffffff) != -2 && i_51_ != 3) {
					i_57_ = objectdefinition.anInt3055;
					i_56_ = objectdefinition.anInt2986;
				} else {
					i_56_ = objectdefinition.anInt3055;
					i_57_ = objectdefinition.anInt2986;
				}
				int i_58_;
				int i_59_;
				if ((i_50_ - -i_57_ ^ 0xffffffff) >= (anInt3524 ^ 0xffffffff)) {
					i_58_ = (i_57_ + 1 >> 1) + i_50_;
					i_59_ = (i_57_ >> 1) + i_50_;
				} else {
					i_58_ = 1 + i_50_;
					i_59_ = i_50_;
				}
				int i_60_;
				int i_61_;
				if ((anInt3521 ^ 0xffffffff) > (i_56_ + i_49_ ^ 0xffffffff)) {
					i_61_ = i_49_ - -1;
					i_60_ = i_49_;
				} else {
					i_60_ = i_49_ - -(i_56_ >> 1);
					i_61_ = i_49_ + (i_56_ - -1 >> 1);
				}
				Plane plane = Class320_Sub10.aPlaneArray8300[i_53_];
				int i_62_ = plane.method3251(i_60_, i_59_, (byte) -118) + plane.method3251(i_60_, i_58_, (byte) -118) - (-plane.method3251(i_61_, i_59_, (byte) -118) - plane.method3251(i_61_, i_58_, (byte) -118)) >> 2;
				int i_63_ = (i_50_ << 9) - -(i_57_ << 8);
				int i_64_ = (i_56_ << 8) + (i_49_ << 9);
				boolean bool = Class217.aBoolean2552 && !aBoolean3516 && objectdefinition.aBoolean3053;
				if (objectdefinition.method3040(-4617)) {
					Class262_Sub1.method3150(i_54_, null, i_50_, i_49_, null, objectdefinition, (byte) -8, i_51_);
				}
				boolean bool_65_ = i_55_ == -1 && !objectdefinition.method3037(0) && objectdefinition.anIntArray2984 == null && !objectdefinition.aBoolean2998 && !objectdefinition.aBoolean2992;
				if (!Class326.aBoolean4109 || (!r.method2361(i, 35) || (objectdefinition.anInt2977 ^ 0xffffffff) == -2) && (!Node_Sub38_Sub18.method2844(i, true) || objectdefinition.anInt2977 != 0)) {
					if (i == 22) {
						if (Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3701(false) != 0 || (objectdefinition.anInt3057 ^ 0xffffffff) != -1 || objectdefinition.anInt3010 == 1 || objectdefinition.aBoolean3051) {
							Animable_Sub1 animable_sub1;
							if (!bool_65_) {
								animable_sub1 = new Animable_Sub1_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_51_, i_55_);
							} else {
								Animable_Sub1_Sub1 animable_sub1_sub1 = new Animable_Sub1_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_51_, bool);
								animable_sub1 = animable_sub1_sub1;
								if (animable_sub1_sub1.method73(-19717)) {
									animable_sub1_sub1.method74(graphicstoolkit, -81);
								}
							}
							ObjectDefinition.method3036(i_54_, i_50_, i_49_, animable_sub1);
							if (objectdefinition.anInt3010 == 1 && class84 != null) {
								class84.method994(i_49_, i_50_, -62);
							}
						}
					} else if (i == 10 || i == 11) {
						Mobile_Sub2 mobile_sub2 = null;
						int i_66_;
						Mobile mobile;
						if (bool_65_) {
							Mobile_Sub2 mobile_sub2_67_ = new Mobile_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, -1 + (i_50_ - -i_57_), i_49_, -1 + (i_49_ - -i_56_), i, i_51_, bool);
							mobile_sub2 = mobile_sub2_67_;
							mobile = mobile_sub2_67_;
							i_66_ = mobile_sub2_67_.method903(-78);
						} else {
							i_66_ = 15;
							mobile = new Mobile_Sub3(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, -1 + i_50_ + i_57_, i_49_, -1 + (i_49_ - -i_56_), i, i_51_, i_55_);
						}
						if (Node_Sub38_Sub7.method2810(mobile, false)) {
							if (mobile_sub2 != null && mobile_sub2.method73(-19717)) {
								mobile_sub2.method74(graphicstoolkit, -77);
							}
							if (objectdefinition.aBoolean3033 && Class217.aBoolean2552) {
								if (i_66_ > 30) {
									i_66_ = 30;
								}
								for (int i_68_ = 0; i_57_ >= i_68_; i_68_++) {
									for (int i_69_ = 0; i_69_ <= i_56_; i_69_++)
										plane.ka(i_68_ + i_50_, i_69_ + i_49_, i_66_);
								}
							}
						}
						if ((objectdefinition.anInt3010 ^ 0xffffffff) != -1 && class84 != null) {
							class84.method996(i_50_, i_56_, 1, i_49_, !objectdefinition.aBoolean3016, i_57_, objectdefinition.aBoolean3034);
						}
					} else if ((i ^ 0xffffffff) <= -13 && (i ^ 0xffffffff) >= -18 || i >= 18 && (i ^ 0xffffffff) >= -22) {
						Mobile mobile;
						if (bool_65_) {
							Mobile_Sub2 mobile_sub2 = new Mobile_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, -1 + (i_50_ - -i_57_), i_49_, -1 + (i_49_ - -i_56_), i, i_51_, bool);
							if (mobile_sub2.method73(-19717)) {
								mobile_sub2.method74(graphicstoolkit, -80);
							}
							mobile = mobile_sub2;
						} else {
							mobile = new Mobile_Sub3(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, -1 + i_57_ + i_50_, i_49_, i_49_ - (-i_56_ - -1), i, i_51_, i_55_);
						}
						Node_Sub38_Sub7.method2810(mobile, false);
						if (Class217.aBoolean2552 && !aBoolean3516 && i >= 12 && i <= 17 && (i ^ 0xffffffff) != -14 && (i_54_ ^ 0xffffffff) < -1 && objectdefinition.anInt2977 != 0) {
							aByteArrayArrayArray3526[i_54_][i_50_][i_49_] = (byte) Node_Sub16.method2590(aByteArrayArrayArray3526[i_54_][i_50_][i_49_], 4);
						}
						if ((objectdefinition.anInt3010 ^ 0xffffffff) != -1 && class84 != null) {
							class84.method996(i_50_, i_56_, 1, i_49_, !objectdefinition.aBoolean3016, i_57_, objectdefinition.aBoolean3034);
						}
					} else if ((i ^ 0xffffffff) == -1) {
						int i_70_ = objectdefinition.anInt2977;
						if (Class291_Sub1.aBoolean8188 && objectdefinition.anInt2977 == -1) {
							i_70_ = 1;
						}
						Animable_Sub2 animable_sub2;
						if (bool_65_) {
							Animable_Sub2_Sub2 animable_sub2_sub2 = new Animable_Sub2_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, bool);
							animable_sub2 = animable_sub2_sub2;
							if (animable_sub2_sub2.method73(-19717)) {
								animable_sub2_sub2.method74(graphicstoolkit, -113);
							}
						} else {
							animable_sub2 = new Animable_Sub2_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, i_55_);
						}
						Class320_Sub27.method3781(i_54_, i_50_, i_49_, animable_sub2, null);
						if (i_51_ != 0) {
							if (i_51_ == 1) {
								if (Class217.aBoolean2552 && objectdefinition.aBoolean3033) {
									plane.ka(i_50_, i_49_ + 1, 50);
									plane.ka(1 + i_50_, i_49_ - -1, 50);
								}
								if ((i_70_ ^ 0xffffffff) == -2 && !aBoolean3516) {
									Class320_Sub6.method3703(2, (byte) 86, -objectdefinition.anInt2962, 1 + i_49_, i_50_, i_54_, objectdefinition.anInt3032);
								}
							} else if ((i_51_ ^ 0xffffffff) != -3) {
								if (i_51_ == 3) {
									if (Class217.aBoolean2552 && objectdefinition.aBoolean3033) {
										plane.ka(i_50_, i_49_, 50);
										plane.ka(1 + i_50_, i_49_, 50);
									}
									if ((i_70_ ^ 0xffffffff) == -2 && !aBoolean3516) {
										Class320_Sub6.method3703(2, (byte) 109, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
									}
								}
							} else {
								if (Class217.aBoolean2552 && objectdefinition.aBoolean3033) {
									plane.ka(i_50_ + 1, i_49_, 50);
									plane.ka(i_50_ + 1, 1 + i_49_, 50);
								}
								if (i_70_ == 1 && !aBoolean3516) {
									Class320_Sub6.method3703(1, (byte) 83, -objectdefinition.anInt2962, i_49_, 1 + i_50_, i_54_, objectdefinition.anInt3032);
								}
							}
						} else {
							if (Class217.aBoolean2552 && objectdefinition.aBoolean3033) {
								plane.ka(i_50_, i_49_, 50);
								plane.ka(i_50_, 1 + i_49_, 50);
							}
							if ((i_70_ ^ 0xffffffff) == -2 && !aBoolean3516) {
								Class320_Sub6.method3703(1, (byte) 53, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
							}
						}
						if ((objectdefinition.anInt3010 ^ 0xffffffff) != -1 && class84 != null) {
							class84.method986(106, objectdefinition.aBoolean3034, !objectdefinition.aBoolean3016, i_49_, i_51_, i, i_50_);
						}
						if ((objectdefinition.anInt3011 ^ 0xffffffff) != -65) {
							Class320_Sub17.method3746(i_54_, i_50_, i_49_, objectdefinition.anInt3011);
						}
					} else if ((i ^ 0xffffffff) == -2) {
						Animable_Sub2 animable_sub2;
						if (!bool_65_) {
							animable_sub2 = new Animable_Sub2_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, i_55_);
						} else {
							Animable_Sub2_Sub2 animable_sub2_sub2 = new Animable_Sub2_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, bool);
							animable_sub2 = animable_sub2_sub2;
							if (animable_sub2_sub2.method73(-19717)) {
								animable_sub2_sub2.method74(graphicstoolkit, -68);
							}
						}
						Class320_Sub27.method3781(i_54_, i_50_, i_49_, animable_sub2, null);
						if (objectdefinition.aBoolean3033 && Class217.aBoolean2552) {
							if ((i_51_ ^ 0xffffffff) == -1) {
								plane.ka(i_50_, i_49_ - -1, 50);
							} else if ((i_51_ ^ 0xffffffff) != -2) {
								if ((i_51_ ^ 0xffffffff) == -3) {
									plane.ka(i_50_ + 1, i_49_, 50);
								} else if (i_51_ == 3) {
									plane.ka(i_50_, i_49_, 50);
								}
							} else {
								plane.ka(1 + i_50_, i_49_ - -1, 50);
							}
						}
						if (objectdefinition.anInt3010 != 0 && class84 != null) {
							class84.method986(76, objectdefinition.aBoolean3034, !objectdefinition.aBoolean3016, i_49_, i_51_, i, i_50_);
						}
					} else if (i == 2) {
						int i_71_ = 0x3 & 1 + i_51_;
						Animable_Sub2 animable_sub2;
						Animable_Sub2 animable_sub2_72_;
						if (!bool_65_) {
							animable_sub2_72_ = new Animable_Sub2_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, 4 + i_51_, i_55_);
							animable_sub2 = new Animable_Sub2_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_71_, i_55_);
						} else {
							Animable_Sub2_Sub2 animable_sub2_sub2 = new Animable_Sub2_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_ + 4, bool);
							Animable_Sub2_Sub2 animable_sub2_sub2_73_ = new Animable_Sub2_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_71_, bool);
							if (animable_sub2_sub2.method73(-19717)) {
								animable_sub2_sub2.method74(graphicstoolkit, -62);
							}
							animable_sub2 = animable_sub2_sub2_73_;
							if (animable_sub2_sub2_73_.method73(-19717)) {
								animable_sub2_sub2_73_.method74(graphicstoolkit, -57);
							}
							animable_sub2_72_ = animable_sub2_sub2;
						}
						Class320_Sub27.method3781(i_54_, i_50_, i_49_, animable_sub2_72_, animable_sub2);
						if ((objectdefinition.anInt2977 == 1 || Class291_Sub1.aBoolean8188 && objectdefinition.anInt2977 == -1) && !aBoolean3516) {
							if ((i_51_ ^ 0xffffffff) == -1) {
								Class320_Sub6.method3703(1, (byte) 110, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
								Class320_Sub6.method3703(2, (byte) 106, objectdefinition.anInt2962, 1 + i_49_, i_50_, i_54_, objectdefinition.anInt3032);
							} else if (i_51_ == 1) {
								Class320_Sub6.method3703(1, (byte) 42, objectdefinition.anInt2962, i_49_, i_50_ + 1, i_54_, objectdefinition.anInt3032);
								Class320_Sub6.method3703(2, (byte) 37, objectdefinition.anInt2962, 1 + i_49_, i_50_, i_54_, objectdefinition.anInt3032);
							} else if (i_51_ == 2) {
								Class320_Sub6.method3703(1, (byte) 117, objectdefinition.anInt2962, i_49_, 1 + i_50_, i_54_, objectdefinition.anInt3032);
								Class320_Sub6.method3703(2, (byte) 55, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
							} else if (i_51_ == 3) {
								Class320_Sub6.method3703(1, (byte) 95, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
								Class320_Sub6.method3703(2, (byte) 44, objectdefinition.anInt2962, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
							}
						}
						if (objectdefinition.anInt3010 != 0 && class84 != null) {
							class84.method986(-35, objectdefinition.aBoolean3034, !objectdefinition.aBoolean3016, i_49_, i_51_, i, i_50_);
						}
						if (objectdefinition.anInt3011 != 64) {
							Class320_Sub17.method3746(i_54_, i_50_, i_49_, objectdefinition.anInt3011);
						}
					} else if (i == 3) {
						Animable_Sub2 animable_sub2;
						if (!bool_65_) {
							animable_sub2 = new Animable_Sub2_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, i_55_);
						} else {
							Animable_Sub2_Sub2 animable_sub2_sub2 = new Animable_Sub2_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i, i_51_, bool);
							if (animable_sub2_sub2.method73(-19717)) {
								animable_sub2_sub2.method74(graphicstoolkit, -63);
							}
							animable_sub2 = animable_sub2_sub2;
						}
						Class320_Sub27.method3781(i_54_, i_50_, i_49_, animable_sub2, null);
						if (objectdefinition.aBoolean3033 && Class217.aBoolean2552) {
							if ((i_51_ ^ 0xffffffff) != -1) {
								if ((i_51_ ^ 0xffffffff) != -2) {
									if ((i_51_ ^ 0xffffffff) != -3) {
										if (i_51_ == 3) {
											plane.ka(i_50_, i_49_, 50);
										}
									} else {
										plane.ka(i_50_ - -1, i_49_, 50);
									}
								} else {
									plane.ka(i_50_ - -1, i_49_ - -1, 50);
								}
							} else {
								plane.ka(i_50_, 1 + i_49_, 50);
							}
						}
						if ((objectdefinition.anInt3010 ^ 0xffffffff) != -1 && class84 != null) {
							class84.method986(-43, objectdefinition.aBoolean3034, !objectdefinition.aBoolean3016, i_49_, i_51_, i, i_50_);
						}
					} else if (i == 9) {
						Mobile mobile;
						if (!bool_65_) {
							mobile = new Mobile_Sub3(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, -1 + (i_57_ + i_50_), i_49_, i_56_ + (i_49_ + -1), i, i_51_, i_55_);
						} else {
							Mobile_Sub2 mobile_sub2 = new Mobile_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, i_50_, i_50_, i_49_, i_49_, i, i_51_, bool);
							if (mobile_sub2.method73(-19717)) {
								mobile_sub2.method74(graphicstoolkit, -114);
							}
							mobile = mobile_sub2;
						}
						Node_Sub38_Sub7.method2810(mobile, false);
						if (objectdefinition.anInt2977 == 1 && !aBoolean3516) {
							int i_74_;
							if ((0x1 & i_51_) == 0) {
								i_74_ = 8;
							} else {
								i_74_ = 16;
							}
							Class320_Sub6.method3703(i_74_, (byte) 65, 0, i_49_, i_50_, i_54_, objectdefinition.anInt3032);
						}
						if (objectdefinition.anInt3010 != 0 && class84 != null) {
							class84.method996(i_50_, i_56_, 1, i_49_, !objectdefinition.aBoolean3016, i_57_, objectdefinition.aBoolean3034);
						}
						if ((objectdefinition.anInt3011 ^ 0xffffffff) != -65) {
							Class320_Sub17.method3746(i_54_, i_50_, i_49_, objectdefinition.anInt3011);
						}
					} else if ((i ^ 0xffffffff) == -5) {
						Animable_Sub4 animable_sub4;
						if (bool_65_) {
							Animable_Sub4_Sub1 animable_sub4_sub1 = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, i_51_);
							if (animable_sub4_sub1.method73(-19717)) {
								animable_sub4_sub1.method74(graphicstoolkit, -59);
							}
							animable_sub4 = animable_sub4_sub1;
						} else {
							animable_sub4 = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, i_51_, i_55_);
						}
						Class320_Sub6.method3705(i_54_, i_50_, i_49_, animable_sub4, null);
					} else if (i == 5) {
						int i_75_ = 65;
						Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i_54_, i_50_, i_49_);
						if (interface19 != null) {
							i_75_ = 1 + Class186.aClass112_2256.method1145(interface19.method72(-32136), 32).anInt3011;
						}
						Animable_Sub4 animable_sub4;
						if (!bool_65_) {
							animable_sub4 = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Node_Sub38.anIntArray7452[i_51_] * i_75_, i_75_ * PlayerUpdateReference.anIntArray4083[i_51_], i, i_51_, i_55_);
						} else {
							Animable_Sub4_Sub1 animable_sub4_sub1 = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Node_Sub38.anIntArray7452[i_51_] * i_75_, PlayerUpdateReference.anIntArray4083[i_51_] * i_75_, i, i_51_);
							if (animable_sub4_sub1.method73(-19717)) {
								animable_sub4_sub1.method74(graphicstoolkit, -113);
							}
							animable_sub4 = animable_sub4_sub1;
						}
						Class320_Sub6.method3705(i_54_, i_50_, i_49_, animable_sub4, null);
					} else if (i == 6) {
						int i_76_ = 33;
						Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i_54_, i_50_, i_49_);
						if (interface19 != null) {
							i_76_ = 1 + Class186.aClass112_2256.method1145(interface19.method72(-32136), 115).anInt3011 / 2;
						}
						Animable_Sub4 animable_sub4;
						if (bool_65_) {
							Animable_Sub4_Sub1 animable_sub4_sub1 = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Node_Sub38.anIntArray7452[i_51_] * i_76_, i_76_ * PlayerUpdateReference.anIntArray4083[i_51_], i, i_51_ - -4);
							animable_sub4 = animable_sub4_sub1;
							if (animable_sub4_sub1.method73(-19717)) {
								animable_sub4_sub1.method74(graphicstoolkit, -105);
							}
						} else {
							animable_sub4 = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Class219.anIntArray2625[i_51_] * i_76_, Class342.anIntArray4237[i_51_] * i_76_, i, 4 + i_51_, i_55_);
						}
						Class320_Sub6.method3705(i_54_, i_50_, i_49_, animable_sub4, null);
					} else if ((i ^ 0xffffffff) == -8) {
						int i_77_ = i_51_ - -2 & 0x3;
						Animable_Sub4 animable_sub4;
						if (bool_65_) {
							Animable_Sub4_Sub1 animable_sub4_sub1 = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, i_77_ + 4);
							animable_sub4 = animable_sub4_sub1;
							if (animable_sub4_sub1.method73(-19717)) {
								animable_sub4_sub1.method74(graphicstoolkit, -58);
							}
						} else {
							animable_sub4 = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, i_77_ + 4, i_55_);
						}
						Class320_Sub6.method3705(i_54_, i_50_, i_49_, animable_sub4, null);
					} else {
						if ((i ^ 0xffffffff) == -9) {
							int i_79_ = 2 + i_51_ & 0x3;
							int i_80_ = 33;
							Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i_54_, i_50_, i_49_);
							if (interface19 != null) {
								i_80_ = Class186.aClass112_2256.method1145(interface19.method72(-32136), 92).anInt3011 / 2 - -1;
							}
							Animable_Sub4 animable_sub4;
							Animable_Sub4 animable_sub4_81_;
							if (!bool_65_) {
								Animable_Sub4_Sub2 animable_sub4_sub2 = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Class219.anIntArray2625[i_51_] * i_80_, Class342.anIntArray4237[i_51_] * i_80_, i, i_51_ - -4, i_55_);
								animable_sub4_81_ = animable_sub4_sub2;
								Animable_Sub4_Sub2 animable_sub4_sub2_82_ = new Animable_Sub4_Sub2(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, 4 + i_79_, i_55_);
								animable_sub4 = animable_sub4_sub2_82_;
							} else {
								Animable_Sub4_Sub1 animable_sub4_sub1 = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, Class219.anIntArray2625[i_51_] * i_80_, Class342.anIntArray4237[i_51_] * i_80_, i, 4 + i_51_);
								Animable_Sub4_Sub1 animable_sub4_sub1_83_ = new Animable_Sub4_Sub1(graphicstoolkit, objectdefinition, i_54_, i_53_, i_63_, i_62_, i_64_, aBoolean3516, 0, 0, i, 4 + i_79_);
								if (animable_sub4_sub1.method73(-19717)) {
									animable_sub4_sub1.method74(graphicstoolkit, -96);
								}
								animable_sub4 = animable_sub4_sub1_83_;
								if (animable_sub4_sub1_83_.method73(-19717)) {
									animable_sub4_sub1_83_.method74(graphicstoolkit, -52);
								}
								animable_sub4_81_ = animable_sub4_sub1;
							}
							Class320_Sub6.method3705(i_54_, i_50_, i_49_, animable_sub4_81_, animable_sub4);
						}
					}
				}
			}
		}
	}
	
	final void method3353(int i, int i_84_, GraphicsToolkit graphicstoolkit, int i_85_, BufferedStream buffer, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		anInt8051++;
		if (!aBoolean3516) {
			boolean bool = false;
			Class343 class343 = null;
			int i_91_ = 8 * (0x7 & i_87_);
			int i_92_ = 8 * (0x7 & i_85_);
			if (i_84_ != -1670) {
				aClass318_8050 = null;
			}
			while ((buffer.offset ^ 0xffffffff) > (buffer.buffer.length ^ 0xffffffff)) {
				int i_93_ = buffer.readUnsignedByte();
				if ((i_93_ ^ 0xffffffff) == -1) {
					if (class343 != null) {
						class343.method3966(buffer, 24176);
					} else {
						class343 = new Class343(buffer);
					}
				} else if (i_93_ == 1) {
					int i_94_ = buffer.readUnsignedByte();
					if ((i_94_ ^ 0xffffffff) < -1) {
						for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > (i_94_ ^ 0xffffffff); i_95_++) {
							Class326 class326 = new Class326(graphicstoolkit, buffer, 2);
							if (class326.anInt4110 == 31) {
								Class367 class367 = Class32.aClass359_508.method4039(buffer.readUnsignedShort(), (byte) 123);
								class326.method3819(class367.anInt4538, (byte) -27, class367.anInt4536, class367.anInt4537, class367.anInt4542);
							}
							if (graphicstoolkit.e() > 0) {
								Node_Sub29 node_sub29 = class326.aNode_Sub29_4100;
								int i_96_ = node_sub29.method2705(i_84_ + 33981) >> 9;
								int i_97_ = node_sub29.method2708(27433) >> 9;
								if (i_89_ == class326.anInt4092 && i_96_ >= i_91_ && (i_96_ ^ 0xffffffff) > (8 + i_91_ ^ 0xffffffff) && (i_97_ ^ 0xffffffff) <= (i_92_ ^ 0xffffffff) && i_92_ + 8 > i_97_) {
									int i_98_ = Class17.method261(false, 0xfff & node_sub29.method2705(32311), 0xfff & node_sub29.method2708(27433), i_88_) + (i << 9);
									i_96_ = i_98_ >> 9;
									int i_99_ = (i_90_ << 9) + Node_Sub38.method2781(0xfff & node_sub29.method2708(i_84_ + 29103), i_88_, 0xfff & node_sub29.method2705(32311), 27542);
									i_97_ = i_99_ >> 9;
									if ((i_96_ ^ 0xffffffff) <= -1 && i_97_ >= 0 && i_96_ < anInt3524 && anInt3521 > i_97_) {
										node_sub29.method2706(i_84_ ^ ~0x1415, i_98_, i_99_, anIntArrayArrayArray3520[i_89_][i_96_][i_97_] - node_sub29.method2704(30));
										Class370.method4089(class326);
									}
								}
							}
						}
					}
				} else if (i_93_ == 2) {
					if (class343 == null) {
						class343 = new Class343();
					}
					class343.method3965(buffer, true);
				} else if (i_93_ == 128) {
					if (class343 == null) {
						class343 = new Class343();
					}
					class343.method3964(buffer, -4807);
				} else if (i_93_ == 129) {
					if (aByteArrayArrayArray3518 == null) {
						aByteArrayArrayArray3518 = new byte[4][][];
					}
					for (int i_100_ = 0; i_100_ < 4; i_100_++) {
						byte b = buffer.readByte();
						if (b == 0 && aByteArrayArrayArray3518[i_86_] != null) {
							if (i_89_ >= i_100_) {
								int i_101_ = i;
								int i_102_ = 7 + i;
								int i_103_ = i_90_;
								if ((i_101_ ^ 0xffffffff) > -1) {
									i_101_ = 0;
								} else if ((i_101_ ^ 0xffffffff) <= (anInt3524 ^ 0xffffffff)) {
									i_101_ = anInt3524;
								}
								if ((i_102_ ^ 0xffffffff) <= -1) {
									if (i_102_ >= anInt3524) {
										i_102_ = anInt3524;
									}
								} else {
									i_102_ = 0;
								}
								int i_104_ = i_90_ + 7;
								if ((i_103_ ^ 0xffffffff) > -1) {
									i_103_ = 0;
								} else if (i_103_ >= anInt3521) {
									i_103_ = anInt3521;
								}
								if ((i_104_ ^ 0xffffffff) > -1) {
									i_104_ = 0;
								} else if ((anInt3521 ^ 0xffffffff) >= (i_104_ ^ 0xffffffff)) {
									i_104_ = anInt3521;
								}
								for (/**/; i_102_ > i_101_; i_101_++) {
									for (/**/; i_104_ > i_103_; i_103_++)
										aByteArrayArrayArray3518[i_86_][i_101_][i_103_] = (byte) 0;
								}
							}
						} else if ((b ^ 0xffffffff) == -2) {
							if (aByteArrayArrayArray3518[i_86_] == null) {
								aByteArrayArrayArray3518[i_86_] = new byte[anInt3524 - -1][anInt3521 - -1];
							}
							for (int i_105_ = 0; i_105_ < 64; i_105_ += 4) {
								for (int i_106_ = 0; i_106_ < 64; i_106_ += 4) {
									byte b_107_ = buffer.readByte();
									if ((i_89_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)) {
										for (int i_108_ = i_105_; (i_108_ ^ 0xffffffff) > (i_105_ - -4 ^ 0xffffffff); i_108_++) {
											for (int i_109_ = i_106_; (4 + i_106_ ^ 0xffffffff) < (i_109_ ^ 0xffffffff); i_109_++) {
												if ((i_108_ ^ 0xffffffff) <= (i_91_ ^ 0xffffffff) && 8 + i_91_ > i_108_ && i_109_ >= i_92_ && (i_92_ - -8 ^ 0xffffffff) < (i_109_ ^ 0xffffffff)) {
													int i_110_ = i + Class339.method3921(0x7 & i_108_, i_109_ & 0x7, 7, i_88_);
													int i_111_ = i_90_ - -Class280.method3378(0x7 & i_109_, i_108_ & 0x7, (byte) 125, i_88_);
													if (i_110_ >= 0 && i_110_ < anInt3524 && (i_111_ ^ 0xffffffff) <= -1 && i_111_ < anInt3521) {
														aByteArrayArrayArray3518[i_86_][i_110_][i_111_] = b_107_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else {
					throw new IllegalStateException("");
				}
			}
			if (class343 != null) {
				Node_Sub15_Sub3.method2563(i_90_ >> 3, i >> 3, (byte) -50, class343);
			}
			if (!bool && aByteArrayArrayArray3518 != null && aByteArrayArrayArray3518[i_86_] != null) {
				int i_112_ = i - -7;
				int i_113_ = i_90_ - -7;
				for (int i_114_ = i; i_114_ < i_112_; i_114_++) {
					for (int i_115_ = i_90_; i_115_ < i_113_; i_115_++)
						aByteArrayArrayArray3518[i_86_][i_114_][i_115_] = (byte) 0;
				}
			}
		}
	}
	
	final Interface19 method3354(int i, int i_116_, int i_117_, int i_118_, int i_119_) {
		anInt8049++;
		Interface19 interface19 = null;
		if ((i_118_ ^ 0xffffffff) == -1) {
			interface19 = (Interface19) Node_Sub38_Sub12.method2830(i_117_, i, i_116_);
		}
		if ((i_118_ ^ 0xffffffff) == -2) {
			interface19 = (Interface19) CacheNode_Sub8.method2320(i_117_, i, i_116_);
		}
		if ((i_118_ ^ 0xffffffff) == -3) {
			interface19 = (Interface19) Class262_Sub20.method3203(i_117_, i, i_116_, aClass8053 != null ? aClass8053 : (aClass8053 = method3361("Interface19")));
		}
		if ((i_118_ ^ 0xffffffff) == -4) {
			interface19 = (Interface19) Class270_Sub1_Sub1.method3303(i_117_, i, i_116_);
		}
		if (i_119_ != 10675) {
			method3359(62, (byte) -10, 24, null, -19, -3, null);
		}
		return interface19;
	}
	
	final void method3355(int i, Class84[] class84s, int i_120_, GraphicsToolkit graphicstoolkit, byte b, int i_121_, int i_122_, byte[] bs, int i_123_, int i_124_, int i_125_) {
		anInt8041++;
		if (b <= 8) {
			method3355(-100, null, -1, null, (byte) 19, -94, 86, null, -54, -118, -40);
		}
		BufferedStream buffer = new BufferedStream(bs);
		int objectid = -1;
		for (;;) {
			int i_127_ = buffer.readSmart2(true);
			if (i_127_ == 0) {
				break;
			}
			objectid += i_127_;
			int i_128_ = 0;
			for (;;) {
				int i_129_ = buffer.readSmart();
				if ((i_129_ ^ 0xffffffff) == -1) {
					break;
				}
				i_128_ += -1 + i_129_;
				int i_130_ = 0x3f & i_128_;
				int i_131_ = (0xffc & i_128_) >> 6;
				int i_132_ = i_128_ >> 12;
				int i_133_ = buffer.readUnsignedByte();
				int i_134_ = i_133_ >> 2;
				int i_135_ = 0x3 & i_133_;
				if ((i_124_ ^ 0xffffffff) == (i_132_ ^ 0xffffffff) && i <= i_131_ && (i_131_ ^ 0xffffffff) > (i + 8 ^ 0xffffffff) && i_125_ <= i_130_ && i_130_ < 8 + i_125_) {
					ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(objectid, 89);
					int i_136_ = Class32.method354(objectdefinition.anInt3055, 0x7 & i_130_, (byte) 45, objectdefinition.anInt2986, i_135_, i_131_ & 0x7, i_123_) + i_121_;
					int i_137_ = Class275.method3336(i_123_, 0x7 & i_130_, objectdefinition.anInt2986, i_135_, objectdefinition.anInt3055, i_131_ & 0x7, 104) + i_122_;
					if (i_136_ > 0 && i_137_ > 0 && (i_136_ ^ 0xffffffff) > (-1 + anInt3524 ^ 0xffffffff) && (i_137_ ^ 0xffffffff) > (-1 + anInt3521 ^ 0xffffffff)) {
						Class84 class84 = null;
						if (!aBoolean3516) {
							int i_138_ = i_120_;
							if ((CacheNode_Sub11.aByteArrayArrayArray9550[1][i_136_][i_137_] & 0x2) == 2) {
								i_138_--;
							}
							if ((i_138_ ^ 0xffffffff) <= -1) {
								class84 = class84s[i_138_];
							}
						}
						method3352(i_134_, objectid, class84, i_137_, graphicstoolkit, i_136_, 0x3 & i_123_ + i_135_, 84, i_120_, i_120_, -1);
					}
				}
			}
		}
	}
	
	final void method3356(boolean bool, GraphicsToolkit graphicstoolkit, byte b) {
		anInt8045++;
		Class170.method1788();
		if (b != 83) {
			method3358(true);
		}
		if (!bool) {
			if ((anInt3535 ^ 0xffffffff) < -2) {
				for (int i = 0; (i ^ 0xffffffff) > (anInt3524 ^ 0xffffffff); i++) {
					for (int i_139_ = 0; (anInt3521 ^ 0xffffffff) < (i_139_ ^ 0xffffffff); i_139_++) {
						if ((CacheNode_Sub11.aByteArrayArrayArray9550[1][i][i_139_] & 0x2) == 2) {
							Class349.method3984(i, i_139_);
						}
					}
				}
			}
			for (int i = 0; anInt3535 > i; i++) {
				for (int i_140_ = 0; (anInt3521 ^ 0xffffffff) <= (i_140_ ^ 0xffffffff); i_140_++) {
					for (int i_141_ = 0; (i_141_ ^ 0xffffffff) >= (anInt3524 ^ 0xffffffff); i_141_++) {
						if ((aByteArrayArrayArray3526[i][i_141_][i_140_] & 0x4 ^ 0xffffffff) != -1) {
							int i_142_ = i_141_;
							int i_143_ = i_141_;
							int i_144_ = i_140_;
							int i_145_ = i_140_;
							for (/**/; (i_144_ ^ 0xffffffff) < -1 && (aByteArrayArrayArray3526[i][i_141_][-1 + i_144_] & 0x4 ^ 0xffffffff) != -1; i_144_--) {
								if ((i_145_ + -i_144_ ^ 0xffffffff) <= -11) {
									break;
								}
							}
							for (/**/; i_145_ < anInt3521 && (0x4 & aByteArrayArrayArray3526[i][i_141_][1 + i_145_] ^ 0xffffffff) != -1; i_145_++) {
								if (i_145_ - i_144_ >= 10) {
									break;
								}
							}
						while_237_:
							for (/**/; (i_142_ ^ 0xffffffff) < -1; i_142_--) {
								if ((i_143_ + -i_142_ ^ 0xffffffff) <= -11) {
									break;
								}
								for (int i_146_ = i_144_; i_145_ >= i_146_; i_146_++) {
									if ((aByteArrayArrayArray3526[i][i_142_ - 1][i_146_] & 0x4 ^ 0xffffffff) == -1) {
										break while_237_;
									}
								}
							}
						while_238_:
							for (/**/; (anInt3524 ^ 0xffffffff) < (i_143_ ^ 0xffffffff); i_143_++) {
								if (i_143_ - i_142_ >= 10) {
									break;
								}
								for (int i_147_ = i_144_; (i_147_ ^ 0xffffffff) >= (i_145_ ^ 0xffffffff); i_147_++) {
									if ((0x4 & aByteArrayArrayArray3526[i][i_143_ - -1][i_147_]) == 0) {
										break while_238_;
									}
								}
							}
							if ((1 + (-i_142_ + i_143_)) * (1 + (i_145_ + -i_144_)) >= 4) {
								int i_148_ = anIntArrayArrayArray3520[i][i_142_][i_144_];
								Class145.method1641(4, 512 + (i_145_ << 9), i_142_ << 9, i_148_, i_144_ << 9, i_148_, (byte) -123, i, 512 + (i_143_ << 9));
								for (int i_149_ = i_142_; (i_149_ ^ 0xffffffff) >= (i_143_ ^ 0xffffffff); i_149_++) {
									for (int i_150_ = i_144_; (i_145_ ^ 0xffffffff) <= (i_150_ ^ 0xffffffff); i_150_++)
										aByteArrayArrayArray3526[i][i_149_][i_150_] = (byte) Node_Sub30.method2723(aByteArrayArrayArray3526[i][i_149_][i_150_], -5);
								}
							}
						}
					}
				}
			}
			Node_Sub27.method2693(-37);
		}
		aByteArrayArrayArray3526 = null;
	}
	
	Class277_Sub1(int i, int i_151_, int i_152_, boolean bool) {
		super(i, i_151_, i_152_, bool, Class290_Sub7.aClass71_8134, r.aClass58_9578);
	}
	
	static final void method3357(boolean bool) {
		ClientScript.method2321(-1, Class58.aWidget861);
		anInt8047++;
		RuntimeException_Sub1.anInt4916++;
		if (!Class372.aBoolean4599 || !Class180.aBoolean2135) {
			if ((RuntimeException_Sub1.anInt4916 ^ 0xffffffff) < -2) {
				Class58.aWidget861 = null;
			}
		} else {
			int i = 0;
			int i_153_ = 0;
			if (Class71.aBoolean967) {
				i = Class67.method733(-99);
				i_153_ = Class226.method2112(256);
			}
			int i_154_ = i + Class106.aClass93_1356.method1050((byte) -117);
			int i_155_ = Class106.aClass93_1356.method1051(bool) + i_153_;
			i_154_ -= Node_Sub5_Sub2.anInt9412;
			i_155_ -= Class83.anInt5179;
			if ((Class62.anInt905 ^ 0xffffffff) < (i_154_ ^ 0xffffffff)) {
				i_154_ = Class62.anInt905;
			}
			if (Class58.aWidget861.anInt4809 + i_154_ > Class62.anInt905 - -Class186.aWidget2257.anInt4809) {
				i_154_ = Class186.aWidget2257.anInt4809 + Class62.anInt905 - Class58.aWidget861.anInt4809;
			}
			if (i_155_ < Class339_Sub2.anInt8650) {
				i_155_ = Class339_Sub2.anInt8650;
			}
			if (Class339_Sub2.anInt8650 + Class186.aWidget2257.anInt4695 < i_155_ - -Class58.aWidget861.anInt4695) {
				i_155_ = -Class58.aWidget861.anInt4695 + Class339_Sub2.anInt8650 + Class186.aWidget2257.anInt4695;
			}
			int i_156_ = Class186.aWidget2257.anInt4817 + (-Class62.anInt905 + i_154_);
			int i_157_ = Class186.aWidget2257.anInt4734 + -Class339_Sub2.anInt8650 + i_155_;
			if (Class106.aClass93_1356.method1041((byte) 34)) {
				if (Class58.aWidget861.anInt4795 < RuntimeException_Sub1.anInt4916) {
					int i_158_ = i_154_ - Node_Sub25_Sub4.anInt10005;
					int i_159_ = -Class60.anInt880 + i_155_;
					if ((Class58.aWidget861.anInt4708 ^ 0xffffffff) > (i_158_ ^ 0xffffffff) || (-Class58.aWidget861.anInt4708 ^ 0xffffffff) < (i_158_ ^ 0xffffffff) || (Class58.aWidget861.anInt4708 ^ 0xffffffff) > (i_159_ ^ 0xffffffff) || i_159_ < -Class58.aWidget861.anInt4708) {
						Class99.aBoolean1282 = true;
					}
				}
				if (Class58.aWidget861.anObjectArray4852 != null && Class99.aBoolean1282) {
					Node_Sub37 node_sub37 = new Node_Sub37();
					node_sub37.aWidget7437 = Class58.aWidget861;
					node_sub37.anInt7439 = i_156_;
					node_sub37.anInt7430 = i_157_;
					node_sub37.parameters = Class58.aWidget861.anObjectArray4852;
					ClientScriptsExecutor.method3556(node_sub37);
				}
			} else {
				if (Class99.aBoolean1282) {
					Node_Sub38_Sub23.method2863(-19316);
					if (Class58.aWidget861.anObjectArray4711 != null) {
						Node_Sub37 node_sub37 = new Node_Sub37();
						node_sub37.aWidget7432 = Node_Sub38_Sub14.aWidget10244;
						node_sub37.anInt7439 = i_156_;
						node_sub37.aWidget7437 = Class58.aWidget861;
						node_sub37.anInt7430 = i_157_;
						node_sub37.parameters = Class58.aWidget861.anObjectArray4711;
						ClientScriptsExecutor.method3556(node_sub37);
					}
					if (Node_Sub38_Sub14.aWidget10244 != null && Client.method109(Class58.aWidget861) != null) {
						Class377.method4124(27547, Class58.aWidget861, Node_Sub38_Sub14.aWidget10244);
					}
				} else if (Class121.anInt1521 != 1 && !Node_Sub16.method2594(true) || Class315.anInt4035 <= 2) {
					if (Class46.method469(255)) {
						Class244.method3064((byte) -80, Node_Sub25_Sub4.anInt10005 + Node_Sub5_Sub2.anInt9412, Class60.anInt880 + Class83.anInt5179);
					}
				} else {
					Class244.method3064((byte) -86, Node_Sub5_Sub2.anInt9412 - -Node_Sub25_Sub4.anInt10005, Class60.anInt880 + Class83.anInt5179);
				}
				Class58.aWidget861 = null;
			}
		}
	}
	
	public static void method3358(boolean bool) {
		anIntArrayArrayArray8042 = null;
		aClass318_8050 = null;
		if (bool != false) {
			anIntArrayArrayArray8042 = null;
		}
	}
	
	final void method3359(int i, byte b, int i_160_, Class84 class84, int i_161_, int i_162_, GraphicsToolkit graphicstoolkit) {
		anInt8040++;
		Interface19 interface19 = method3354(i_162_, i_160_, i_161_, i, 10675);
		if (interface19 != null) {
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), 98);
			int i_163_ = interface19.method71(69);
			int i_164_ = interface19.method68(23796);
			if (objectdefinition.method3040(-4617)) {
				CacheNode_Sub14.method2348(i_162_, i_160_, i_161_, objectdefinition, 100);
			}
			if (interface19.method73(-19717)) {
				interface19.method70(graphicstoolkit, -88);
			}
			if (i != 0) {
				if (i == 1) {
					Class290_Sub4.method3432(i_161_, i_162_, i_160_);
				} else if (i != 2) {
					if (i == 3) {
						PlayerUpdateReference.method3807(i_161_, i_162_, i_160_);
						if (objectdefinition.anInt3010 == 1) {
							class84.method997(i_160_, true, i_162_);
						}
					}
				} else {
					Class7.method181(i_161_, i_162_, i_160_, aClass8053 != null ? aClass8053 : (aClass8053 = method3361("Interface19")));
					if (objectdefinition.anInt3010 != 0 && (anInt3524 ^ 0xffffffff) < (objectdefinition.anInt3055 + i_162_ ^ 0xffffffff) && anInt3521 > objectdefinition.anInt3055 + i_160_ && i_162_ + objectdefinition.anInt2986 < anInt3524 && objectdefinition.anInt2986 + i_160_ < anInt3521) {
						class84.method992(objectdefinition.aBoolean3034, !objectdefinition.aBoolean3016, (byte) -106, i_162_, objectdefinition.anInt3055, objectdefinition.anInt2986, i_164_, i_160_);
					}
					if ((i_163_ ^ 0xffffffff) == -10) {
						if ((i_164_ & 0x1) == 0) {
							Class270_Sub1_Sub1.method3302(i_162_, i_161_, (byte) 117, 8, i_160_);
						} else {
							Class270_Sub1_Sub1.method3302(i_162_, i_161_, (byte) 122, 16, i_160_);
						}
					}
				}
			} else {
				Class290_Sub1.method3425(i_161_, i_162_, i_160_);
				if (objectdefinition.anInt3010 != 0) {
					class84.method987(i_160_, i_164_, i_163_, (byte) -70, !objectdefinition.aBoolean3016, i_162_, objectdefinition.aBoolean3034);
				}
				if ((objectdefinition.anInt2977 ^ 0xffffffff) == -2) {
					if (i_164_ != 0) {
						if (i_164_ != 1) {
							if ((i_164_ ^ 0xffffffff) != -3) {
								if (i_164_ == 3) {
									Class270_Sub1_Sub1.method3302(i_162_, i_161_, (byte) 120, 2, i_160_);
								}
							} else {
								Class270_Sub1_Sub1.method3302(1 + i_162_, i_161_, (byte) 126, 1, i_160_);
							}
						} else {
							Class270_Sub1_Sub1.method3302(i_162_, i_161_, (byte) 101, 2, i_160_ - -1);
						}
					} else {
						Class270_Sub1_Sub1.method3302(i_162_, i_161_, (byte) 115, 1, i_160_);
					}
				}
			}
		}
		if (b <= 34) {
			anInt8046 = -25;
		}
	}
	
	static final void method3360(byte b, Node_Sub14 node_sub14, GraphicsToolkit graphicstoolkit, Class79 class79) {
		anInt8044++;
		GLSprite glsprite = class79.method787(32394, graphicstoolkit);
		if (glsprite != null) {
			int i = glsprite.method1193();
			if ((glsprite.getYOffset() ^ 0xffffffff) < (i ^ 0xffffffff)) {
				i = glsprite.getYOffset();
			}
			int i_165_ = 10;
			int i_166_ = node_sub14.anInt7126;
			int i_167_ = node_sub14.anInt7118;
			int i_168_ = 0;
			int i_169_ = 0;
			int i_170_ = 0;
			if (class79.aString1085 != null) {
				i_168_ = Class85.aClass357_1159.method4029(Node_Sub38_Sub3.aStringArray10107, null, b + -84, null, class79.aString1085);
				for (int i_171_ = 0; i_168_ > i_171_; i_171_++) {
					String string = Node_Sub38_Sub3.aStringArray10107[i_171_];
					if (i_171_ < -1 + i_168_) {
						string = string.substring(0, -4 + string.length());
					}
					int i_172_ = Class75.aClass299_1007.method3490(string);
					if (i_172_ > i_169_) {
						i_169_ = i_172_;
					}
				}
				i_170_ = Class75.aClass299_1007.method3487() * i_168_ - -(Class75.aClass299_1007.method3489() / 2);
			}
			int i_173_ = i / 2 + node_sub14.anInt7126;
			if ((i_166_ ^ 0xffffffff) > (Class20.anInt344 + i ^ 0xffffffff)) {
				i_173_ = 5 + i_165_ + (i / 2 + (Class20.anInt344 - -(i_169_ / 2)));
				i_166_ = Class20.anInt344;
			} else if ((Class20.anInt348 - i ^ 0xffffffff) > (i_166_ ^ 0xffffffff)) {
				i_166_ = -i + Class20.anInt348;
				i_173_ = Class20.anInt348 - (i / 2 + (i_165_ + i_169_ / 2) - -5);
			}
			int i_174_ = node_sub14.anInt7118;
			if (i + Class20.anInt350 > i_167_) {
				i_174_ = i_165_ + (Class20.anInt350 + i / 2);
				i_167_ = Class20.anInt350;
			} else if ((Class20.anInt339 + -i ^ 0xffffffff) > (i_167_ ^ 0xffffffff)) {
				i_174_ = -i_165_ + -(i / 2) + Class20.anInt339 + -i_170_;
				i_167_ = Class20.anInt339 + -i;
			}
			int i_175_ = (int) (32767.0 * (Math.atan2((double) (i_166_ - node_sub14.anInt7126), (double) (i_167_ - node_sub14.anInt7118)) / 3.141592653589793)) & 0xffff;
			glsprite.method1180((float) i_166_ + (float) i / 2.0F, (float) i_167_ + (float) i / 2.0F, 4096, i_175_);
			int i_176_ = -2;
			int i_177_ = -2;
			if (b != 43) {
				method3357(true);
			}
			int i_178_ = -2;
			int i_179_ = -2;
			if (class79.aString1085 != null) {
				i_176_ = -5 + (i_173_ - i_169_ / 2);
				i_177_ = i_174_;
				i_178_ = i_169_ + (i_176_ + 10);
				i_179_ = Class75.aClass299_1007.method3487() * i_168_ + i_177_ - -3;
				if ((class79.anInt1077 ^ 0xffffffff) != -1) {
					graphicstoolkit.method1239(i_178_ + -i_176_, i_179_ - i_177_, i_177_, (byte) 116, i_176_, class79.anInt1077);
				}
				if ((class79.anInt1081 ^ 0xffffffff) != -1) {
					graphicstoolkit.method1234(i_177_, class79.anInt1081, i_178_ + -i_176_, i_179_ - i_177_, (byte) -64, i_176_);
				}
				for (int i_180_ = 0; i_168_ > i_180_; i_180_++) {
					String string = Node_Sub38_Sub3.aStringArray10107[i_180_];
					if ((i_168_ - 1 ^ 0xffffffff) < (i_180_ ^ 0xffffffff)) {
						string = string.substring(0, -4 + string.length());
					}
					Class75.aClass299_1007.method3491(graphicstoolkit, string, i_173_, i_174_, class79.anInt1058, true);
					i_174_ += Class75.aClass299_1007.method3487();
				}
			}
			if (class79.anInt1062 != -1 || class79.aString1085 != null) {
				i >>= 1;
				Node_Sub31 node_sub31 = new Node_Sub31(node_sub14);
				node_sub31.anInt7369 = i + i_166_;
				node_sub31.anInt7366 = i_179_;
				node_sub31.anInt7371 = i_176_;
				node_sub31.anInt7374 = -i + i_166_;
				node_sub31.anInt7370 = i_167_ + i;
				node_sub31.anInt7365 = i_167_ - i;
				node_sub31.anInt7363 = i_177_;
				node_sub31.anInt7364 = i_178_;
				Node_Sub43.aClass312_7541.method3625((byte) -54, node_sub31);
			}
		}
	}
	
	/*synthetic*/ static Class<?> method3361(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
