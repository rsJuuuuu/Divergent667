/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128
{
	static int anInt1647;
	static int anInt1648;
	static int anInt1649;
	private Index index22;
	static OutcommingPacket aClass318_1651 = new OutcommingPacket(5, 4);
	static int anInt1652;
	static int anInt1653;
	static int anInt1654;
	static int anInt1655;
	private Class61 aClass61_1656 = new Class61(64);
	static int anInt1657;
	static OutcommingPacket aClass318_1658 = new OutcommingPacket(45, 7);
	static int anInt1659;
	static OutcommingPacket aClass318_1660 = new OutcommingPacket(75, 4);
	
	final void method1543(int i, int i_0_) {
		synchronized (aClass61_1656) {
			aClass61_1656.method608(false);
			aClass61_1656 = new Class61(i_0_);
			if (i != 16509) {
				aClass318_1660 = null;
			}
		}
		anInt1649++;
	}
	
	static final void method1544(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt1653++;
		if ((i_3_ ^ 0xffffffff) <= -2 && (i ^ 0xffffffff) <= -2 && (-2 + Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) && (-2 + Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			int i_9_ = i_6_;
			if (i_9_ < 3 && Class238.method3021(i, i_3_, 106)) {
				i_9_++;
			}
			if ((Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) ^ 0xffffffff) == -1 && !Class369.method4085(i, 0, Class94.anInt1249, i_3_, i_9_) || Class175.aClass261ArrayArrayArray2099 == null) {
				return;
			}
			Node_Sub38_Sub1.aClass277_Sub1_10084.method3359(i_5_, (byte) 102, i, Class304.SCENE_CLIP_DATA_PLANES[i_6_], i_6_, i_3_, Class93.aGraphicsToolkit1241);
			if (i_8_ >= 0) {
				int i_10_ = Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3701(false);
				Class213.aNode_Sub27_2512.method2690(108, 1, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
				Node_Sub38_Sub1.aClass277_Sub1_10084.method3352(i_1_, i_8_, Class304.SCENE_CLIP_DATA_PLANES[i_6_], i, Class93.aGraphicsToolkit1241, i_3_, i_2_, -102, i_9_, i_6_, i_4_);
				Class213.aNode_Sub27_2512.method2690(33, i_10_, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
			}
		}
	}
	
	public static void method1545(boolean bool) {
		aClass318_1660 = null;
		aClass318_1651 = null;
		if (bool != true) {
			method1545(true);
		}
		aClass318_1658 = null;
	}
	
	final void method1546(int i) {
		synchronized (aClass61_1656) {
			aClass61_1656.method602((byte) -128);
		}
		anInt1652++;
	}
	
	static final boolean method1547(int i, int i_13_, int i_14_) {
		anInt1657++;
		if (i_14_ == 11) {
			i_14_ = 10;
		}
		if (i_13_ != 1) {
			return true;
		}
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(i, 61);
		if ((i_14_ ^ 0xffffffff) <= -6 && (i_14_ ^ 0xffffffff) >= -9) {
			i_14_ = 4;
		}
		return objectdefinition.method3041(i_14_, 31);
	}
	
	static final Class262 method1548(BufferedStream buffer, byte b) {
		anInt1647++;
		int i = buffer.readUnsignedByte();
		Class124 class124 = Node_Sub38_Sub24.method2869(i, -96);
		Class262 class262 = null;
		Class124 class124_16_ = class124;
	while_134_:
		do {
		while_133_:
			do {
			while_132_:
				do {
				while_131_:
					do {
					while_130_:
						do {
						while_129_:
							do {
							while_128_:
								do {
								while_127_:
									do {
									while_126_:
										do {
										while_125_:
											do {
											while_124_:
												do {
												while_123_:
													do {
													while_122_:
														do {
														while_121_:
															do {
															while_120_:
																do {
																while_119_:
																	do {
																	while_118_:
																		do {
																		while_117_:
																			do {
																			while_116_:
																				do {
																				while_115_:
																					do {
																					while_114_:
																						do {
																						while_113_:
																							do {
																							while_112_:
																								do {
																								while_111_:
																									do {
																									while_110_:
																										do {
																										while_109_:
																											do {
																												do {
																													if (Class194_Sub1_Sub1.aClass124_9368 != class124_16_) {
																														if (EntityNode_Sub8.aClass124_6024 != class124_16_) {
																															if (Node_Sub16.aClass124_7132 != class124_16_) {
																																if (class124_16_ != Class262_Sub21.aClass124_7865) {
																																	if (Class233.aClass124_2784 != class124_16_) {
																																		if (Class320_Sub6.aClass124_8267 != class124_16_) {
																																			if (class124_16_ != Animable_Sub3.aClass124_9141) {
																																				if (class124_16_ != Class262_Sub6.aClass124_7745) {
																																					if (class124_16_ != Class320_Sub5.aClass124_8253) {
																																						if (class124_16_ != Class144_Sub4.aClass124_6846) {
																																							if (Class155.aClass124_1955 != class124_16_) {
																																								if (class124_16_ != CacheNode_Sub16_Sub1.aClass124_11076) {
																																									if (Class144_Sub4.aClass124_6838 != class124_16_) {
																																										if (class124_16_ != CacheNode_Sub4.aClass124_9463) {
																																											if (Class188.aClass124_2291 != class124_16_) {
																																												if (class124_16_ != Class10.aClass124_169) {
																																													if (class124_16_ != Node_Sub25_Sub2.aClass124_9957) {
																																														if (class124_16_ != Class274.aClass124_4975) {
																																															if (Class127.aClass124_1638 != class124_16_) {
																																																if (Animable_Sub3.aClass124_9135 != class124_16_) {
																																																	if (Node_Sub38_Sub23.aClass124_10344 != class124_16_) {
																																																		if (class124_16_ != Class260.aClass124_5230) {
																																																			if (class124_16_ != Class64.aClass124_5036) {
																																																				if (class124_16_ != OutputStream_Sub1.aClass124_88) {
																																																					if (AnimableAnimator.aClass124_5500 != class124_16_) {
																																																						if (Class362.aClass124_4494 != class124_16_) {
																																																							if (Class262_Sub12.aClass124_7785 != class124_16_) {
																																																								if (class124_16_ != Node_Sub15_Sub4.aClass124_9793) {
																																																									break while_134_;
																																																								}
																																																							} else {
																																																								break while_132_;
																																																							}
																																																							break while_133_;
																																																						}
																																																					} else {
																																																						break while_130_;
																																																					}
																																																					break while_131_;
																																																				}
																																																			} else {
																																																				break while_128_;
																																																			}
																																																			break while_129_;
																																																		}
																																																	} else {
																																																		break while_126_;
																																																	}
																																																	break while_127_;
																																																}
																																															} else {
																																																break while_124_;
																																															}
																																															break while_125_;
																																														}
																																													} else {
																																														break while_122_;
																																													}
																																													break while_123_;
																																												}
																																											} else {
																																												break while_120_;
																																											}
																																											break while_121_;
																																										}
																																									} else {
																																										break while_118_;
																																									}
																																									break while_119_;
																																								}
																																							} else {
																																								break while_116_;
																																							}
																																							break while_117_;
																																						}
																																					} else {
																																						break while_114_;
																																					}
																																					break while_115_;
																																				}
																																			} else {
																																				break while_112_;
																																			}
																																			break while_113_;
																																		}
																																	} else {
																																		break while_110_;
																																	}
																																	break while_111_;
																																}
																															} else {
																																break;
																															}
																															break while_109_;
																														}
																													} else {
																														class262 = new Class262_Sub16(buffer);//sendobject or destroy?
																														break while_134_;
																													}
																													class262 = new Class262_Sub2(buffer); //sendobject or destroy?
																													break while_134_;
																												} while (false);
																												class262 = new Class262_Sub6(buffer); //object animation
																												break while_134_;
																											} while (false);
																											class262 = new Class262_Sub12(buffer); //music
																											break while_134_;
																										} while (false);
																										class262 = new Class262_Sub13(buffer); //sound 2
																										break while_134_;
																									} while (false);
																									class262 = new Class262_Sub8(buffer); //music effect
																									break while_134_;
																								} while (false);
																								class262 = new Class262_Sub14(buffer); //sound 1
																								break while_134_;
																							} while (false);
																							class262 = new Class262_Sub15_Sub1(buffer); //gfx on floor
																							break while_134_;
																						} while (false);
																						class262 = new Class262_Sub5(buffer); //message on tile
																						break while_134_;
																					} while (false);
																					class262 = new Class262_Sub4(buffer);
																					break while_134_;
																				} while (false);
																				class262 = new Class262_Sub18(buffer);
																				break while_134_;
																			} while (false);
																			class262 = new Class262_Sub10(buffer); //setcamera pos
																			break while_134_;
																		} while (false);
																		class262 = new Class262_Sub3(buffer); //create?
																		break while_134_;
																	} while (false);
																	class262 = new Class262_Sub20(buffer); //delete ?
																	break while_134_;
																} while (false);
																class262 = new Class262_Sub21(buffer);
																break while_134_;
															} while (false);
															class262 = new Class262_Sub1(buffer); //forcemessage
															break while_134_;
														} while (false);
														class262 = new Class262_Sub17(buffer); //emote
														break while_134_;
													} while (false);
													class262 = new Class262_Sub9(buffer); //hit
													break while_134_;
												} while (false);
												class262 = new Class262_Sub11(buffer);
												break while_134_;
											} while (false);
											class262 = new Class262_Sub15_Sub2(buffer); //anim
											break while_134_;
										} while (false);
										class262 = new Class262_Sub23(buffer, 1, 1);//forcemovement
										break while_134_;
									} while (false);
									class262 = new Class262_Sub23(buffer, 0, 1);//forcemovement
									break while_134_;
								} while (false);
								class262 = new Class262_Sub23(buffer, 0, 0);//forcemovement
								break while_134_;
							} while (false);
							class262 = new Class262_Sub23(buffer, 1, 0); //forcemovement
							break while_134_;
						} while (false);
						class262 = new Class262_Sub19(buffer, false); //sets mask
						break while_134_;
					} while (false);
					class262 = new Class262_Sub19(buffer, true); //sets mask
					break while_134_;
				} while (false);
				class262 = new Class262_Sub7(buffer); //runs clientscrit
				break while_134_;
			} while (false);
			class262 = new Class262_Sub22(buffer); //ends
		} while (false);
		return class262;
	}
	
	final ConfigDefinitions getConfigDefinitions(int i) {
		anInt1655++;
		ConfigDefinitions class70;
		synchronized (aClass61_1656) {
			class70 = (ConfigDefinitions) aClass61_1656.method607((long) i, 0);
		}
		if (class70 != null) {
			return class70;
		}
		byte[] bs;
		synchronized (index22) {
			bs = index22.method3524(false, Class169.method1762((byte) 114, i), Class273.method3315(-989325398, i));
		}
		class70 = new ConfigDefinitions();
		if (bs != null) {
			class70.method737(122, new BufferedStream(bs));
		}
		synchronized (aClass61_1656) {
			aClass61_1656.method601(class70, 11 + 25555, (long) i);
		}
		return class70;
	}
	
	static final int method1550(int i, int i_18_, int i_19_) {
		if (i != -13892) {
			return 98;
		}
		anInt1654++;
		int i_20_ = i_19_ >>> 31;
		return -i_20_ + (i_20_ + i_19_) / i_18_;
	}
	
	final void method1551(int i, int i_21_) {
		synchronized (aClass61_1656) {
			if (i != 75) {
				aClass318_1651 = null;
			}
			aClass61_1656.method598(i_21_, i ^ ~0x2e61);
		}
		anInt1659++;
	}
	
	final void method1552(byte b) {
		anInt1648++;
		synchronized (aClass61_1656) {
			aClass61_1656.method608(false);
			if (b != 101) {
				method1552((byte) -56);
			}
		}
	}
	
	Class128(Class353 class353, int i, Index class302) {
		index22 = class302;
		if (index22 != null) {
			int i_22_ = index22.method3526(-20871) - 1;
			index22.method3537(-2, i_22_);
		}
	}
}
