/* ObjectDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public class ObjectDefinition {
	protected int anInt2958;
	static int anInt2959;
	private byte aByte2960;
	protected boolean aBoolean2961 = false;
	protected int anInt2962;
	private int anInt2963;
	private int anInt2964;
	static int anInt2965;
	static int anInt2966;
	protected byte[] aByteArray2967;
	private int anInt2968;
	private int anInt2969;
	protected int anInt2970;
	protected int anInt2971;
	protected boolean aBoolean2972 = true;
	private int anInt2973 = 128;
	private byte aByte2974;
	protected int anInt2975;
	static int anInt2976;
	protected int anInt2977;
	static int anInt2978;
	static int anInt2979;
	protected String[] aStringArray2980;
	protected int[] anIntArray2981;
	static int anInt2982;
	protected int anInt2983;
	protected int[] anIntArray2984;
	private int anInt2985;
	protected int anInt2986;
	protected int anInt2987;
	protected short[] aShortArray2988;
	protected int anInt2989;
	protected boolean aBoolean2990;
	static int anInt2991;
	protected boolean aBoolean2992;
	protected boolean aBoolean2993;
	protected int anInt2994;
	private int[] anIntArray2995;
	private byte[] aByteArray2996;
	static int anInt2997;
	protected boolean aBoolean2998;
	protected String aString2999;
	protected boolean aBoolean3000;
	static int anInt3001;
	protected boolean aBoolean3002;
	static int anInt3003;
	static int anInt3004;
	static int anInt3005;
	protected int anInt3006;
	protected boolean aBoolean3007;
	protected int anInt3008;
	private int anInt3009;
	protected int anInt3010;
	protected int anInt3011;
	protected int anInt3012;
	protected int anInt3013;
	private HashTable aHashTable3014;
	protected int anInt3015;
	protected boolean aBoolean3016;
	private int anInt3017;
	private int anInt3018;
	private int[] anIntArray3019;
	protected int anInt3020;
	static int anInt3021;
	static int anInt3022;
	private int anInt3023;
	protected int anInt3024;
	protected short[] aShortArray3025;
	private int anInt3026;
	private byte aByte3027;
	protected Class112 aClass112_3028;
	static int anInt3029;
	protected int objectId;
	protected int[][] modelIds;
	protected int anInt3032;
	protected boolean aBoolean3033;
	protected boolean aBoolean3034;
	private int anInt3035;
	protected int[] anIntArray3036;
	private int anInt3037;
	protected int anInt3038;
	protected boolean aBoolean3039;
	protected int anInt3040;
	static int anInt3041;
	private int anInt3042;
	static int anInt3043;
	private short[] aShortArray3044;
	private byte aByte3045;
	static int anInt3046;
	private short[] aShortArray3047;
	static int anInt3048;
	static int anInt3049;
	protected int anInt3050;
	protected boolean aBoolean3051;
	private byte aByte3052;
	protected boolean aBoolean3053;
	static int anInt3054;
	protected int anInt3055;
	protected boolean aBoolean3056;
	protected int anInt3057;

	final boolean method3032(byte b) {
		anInt3022++;
        return !(anIntArray3019 == null || anIntArray3019.length <= 1);
    }

	private final void method3033(BufferedStream buffer, int opcode, int i_0_) {
		if (i_0_ == 21120) {
			anInt2982++;
			if (opcode == 1 || opcode == 5) {
				if (opcode == 5 && aClass112_3028.aBoolean1424) {
					method3052((byte) -111, buffer);
				}
				int i_1_ = buffer.readUnsignedByte();
				aByteArray2967 = new byte[i_1_];
				modelIds = new int[i_1_][];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					aByteArray2967[i_2_] = buffer.readByte();
					int i_3_ = buffer.readUnsignedByte();
					modelIds[i_2_] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
						modelIds[i_2_][i_4_] = buffer.readBigSmart();
				}
				if (opcode == 5 && !aClass112_3028.aBoolean1424) {
					method3052((byte) -111, buffer);
				}
			} else if (opcode == 2) {
				aString2999 = buffer.readString();
			} else if ((opcode ^ 0xffffffff) != -15) {
				if ((opcode ^ 0xffffffff) != -16) {
					if (opcode == 17) {
						aBoolean3034 = false;
						anInt3010 = 0;
					} else if (opcode == 18) {
						aBoolean3034 = false;
					} else if ((opcode ^ 0xffffffff) == -20) {
						anInt3057 = buffer.readUnsignedByte();
					} else if (opcode != 21) {
						if ((opcode ^ 0xffffffff) != -23) {
							if ((opcode ^ 0xffffffff) != -24) {
								if (opcode != 24) {
									if (opcode == 27) {
										anInt3010 = 1;
									} else if (opcode == 28) {
										anInt3011 = buffer.readUnsignedByte() << 2;
									} else if ((opcode ^ 0xffffffff) != -30) {
										if ((opcode ^ 0xffffffff) == -40) {
											anInt3026 = 5 * buffer.readByte();
										} else if (opcode < 30 || opcode >= 35) {
											if ((opcode ^ 0xffffffff) != -41) {
												if (opcode != 41) {
													if ((opcode ^ 0xffffffff) == -43) {
														int i_5_ = buffer
																.readUnsignedByte();
														aByteArray2996 = new byte[i_5_];
														for (int i_6_ = 0; (i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
															aByteArray2996[i_6_] = buffer
																	.readByte();
													} else if (opcode != 62) {
														if ((opcode ^ 0xffffffff) != -65) {
															if (opcode == 65) {
																anInt2969 = buffer
																		.readUnsignedShort();
															} else if (opcode != 66) {
																if ((opcode ^ 0xffffffff) == -68) {
																	anInt3009 = buffer
																			.readUnsignedShort();
																} else if ((opcode ^ 0xffffffff) == -70) {
																	anInt3040 = buffer
																			.readUnsignedByte();
																} else if (opcode == 70) {
																	anInt2968 = buffer
																			.readShort() << 2;
																} else if (opcode != 71) {
																	if (opcode == 72) {
																		anInt2985 = buffer
																				.readShort() << 2;
																	} else if (opcode != 73) {
																		if (opcode == 74) {
																			aBoolean3016 = true;
																		} else if ((opcode ^ 0xffffffff) != -76) {
																			if (opcode != 77
																					&& (opcode ^ 0xffffffff) != -93) {
																				if (opcode != 78) {
																					if ((opcode ^ 0xffffffff) == -80) {
																						anInt2989 = buffer
																								.readUnsignedShort();
																						anInt2971 = buffer
																								.readUnsignedShort();
																						anInt3012 = buffer
																								.readUnsignedByte();
																						int i_7_ = buffer
																								.readUnsignedByte();
																						anIntArray3036 = new int[i_7_];
																						for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
																							anIntArray3036[i_8_] = buffer
																									.readUnsignedShort();
																					} else if ((opcode ^ 0xffffffff) != -82) {
																						if ((opcode ^ 0xffffffff) != -83) {
																							if (opcode == 88) {
																								aBoolean2972 = false;
																							} else if (opcode != 89) {
																								if ((opcode ^ 0xffffffff) != -92) {
																									if (opcode == 93) {
																										aByte3027 = (byte) 3;
																										anInt3023 = buffer
																												.readUnsignedShort();
																									} else if (opcode != 94) {
																										if (opcode != 95) {
																											if ((opcode ^ 0xffffffff) != -98) {
																												if (opcode == 98) {
																													aBoolean2998 = true;
																												} else if ((opcode ^ 0xffffffff) != -100) {
																													if ((opcode ^ 0xffffffff) != -101) {
																														if (opcode == 101) {
																															anInt2958 = buffer
																																	.readUnsignedByte();
																														} else if ((opcode ^ 0xffffffff) == -103) {
																															anInt3006 = buffer
																																	.readUnsignedShort();
																														} else if ((opcode ^ 0xffffffff) == -104) {
																															anInt2977 = 0;
																														} else if (opcode == 104) {
																															anInt3024 = buffer
																																	.readUnsignedByte();
																														} else if (opcode != 105) {
																															if (opcode == 106) {
																																int i_9_ = buffer
																																		.readUnsignedByte();
																																int i_10_ = 0;
																																anIntArray3019 = new int[i_9_];
																																anIntArray2995 = new int[i_9_];
																																for (int i_11_ = 0; (i_9_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
																																	anIntArray3019[i_11_] = buffer
																																			.readBigSmart();
																																	if ((anIntArray3019[i_11_] ^ 0xffffffff) == -65536) {
																																		anIntArray3019[i_11_] = -1;
																																	}
																																	i_10_ += anIntArray2995[i_11_] = buffer
																																			.readUnsignedByte();
																																}
																																for (int i_12_ = 0; i_12_ < i_9_; i_12_++)
																																	anIntArray2995[i_12_] = 65535
																																			* anIntArray2995[i_12_]
																																			/ i_10_;
																															} else if ((opcode ^ 0xffffffff) != -108) {
																																if ((opcode ^ 0xffffffff) > -151
																																		|| opcode >= 155) {
																																	if ((opcode ^ 0xffffffff) != -161) {
																																		if ((opcode ^ 0xffffffff) != -163) {
																																			if ((opcode ^ 0xffffffff) == -164) {
																																				aByte2974 = buffer
																																						.readByte();
																																				aByte3045 = buffer
																																						.readByte();
																																				aByte3052 = buffer
																																						.readByte();
																																				aByte2960 = buffer
																																						.readByte();
																																			} else if (opcode != 164) {
																																				if ((opcode ^ 0xffffffff) == -166) {
																																					anInt2963 = buffer
																																							.readShort();
																																				} else if ((opcode ^ 0xffffffff) != -167) {
																																					if (opcode == 167) {
																																						anInt2983 = buffer
																																								.readUnsignedShort();
																																					} else if (opcode != 168) {
																																						if ((opcode ^ 0xffffffff) == -170) {
																																							aBoolean2993 = true;
																																						} else if (opcode == 170) {
																																							anInt3032 = buffer
																																									.readSmart();
																																						} else if ((opcode ^ 0xffffffff) != -172) {
																																							if (opcode == 173) {
																																								anInt3050 = buffer
																																										.readUnsignedShort();
																																								anInt3020 = buffer
																																										.readUnsignedShort();
																																							} else if (opcode != 177) {
																																								if ((opcode ^ 0xffffffff) == -179) {
																																									anInt2975 = buffer
																																											.readUnsignedByte();
																																								} else if (opcode == 189) {
																																								} else if ((opcode ^ 0xffffffff) == -250) {
																																									int i_13_ = buffer
																																											.readUnsignedByte();
																																									if (aHashTable3014 == null) {
																																										int i_14_ = Class320_Sub19
																																												.method3753(
																																														i_13_,
																																														-729073628);
																																										aHashTable3014 = new HashTable(
																																												i_14_);
																																									}
																																									for (int i_15_ = 0; (i_13_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
																																										boolean bool = buffer
																																												.readUnsignedByte() == 1;
																																										int i_16_ = buffer
																																												.read24BitInteger();
																																										Node node;
																																										if (bool) {
																																											node = new Node_Sub18(
																																													buffer.readString());
																																										} else {
																																											node = new Node_Sub32(
																																													buffer.readInt());
																																										}
																																										aHashTable3014
																																												.method1515(
																																														(long) i_16_,
																																														node,
																																														-125);
																																									}
																																								}
																																							} else {
																																								aBoolean2992 = true;
																																							}
																																						} else {
																																							anInt2962 = buffer
																																									.readSmart();
																																						}
																																					} else {
																																						aBoolean2961 = true;
																																					}
																																				} else {
																																					anInt3018 = buffer
																																							.readShort();
																																				}
																																			} else {
																																				anInt2964 = buffer
																																						.readShort();
																																			}
																																		} else {
																																			aByte3027 = (byte) 3;
																																			anInt3023 = buffer
																																					.readInt();
																																		}
																																	} else {
																																		int i_17_ = buffer
																																				.readUnsignedByte();
																																		anIntArray2981 = new int[i_17_];
																																		for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
																																			anIntArray2981[i_18_] = buffer
																																					.readUnsignedShort();
																																	}
																																} else {
																																	aStringArray2980[-150
																																			+ opcode] = buffer
																																			.readString();
																																	if (!aClass112_3028.aBoolean1431) {
																																		aStringArray2980[-150
																																				+ opcode] = null;
																																	}
																																}
																															} else {
																																anInt2994 = buffer
																																		.readUnsignedShort();
																															}
																														} else {
																															aBoolean3007 = true;
																														}
																													} else {
																														anInt3038 = buffer
																																.readUnsignedByte();
																														anInt3013 = buffer
																																.readUnsignedShort();
																													}
																												} else {
																													anInt2987 = buffer
																															.readUnsignedByte();
																													anInt3008 = buffer
																															.readUnsignedShort();
																												}
																											} else {
																												aBoolean3056 = true;
																											}
																										} else {
																											aByte3027 = (byte) 5;
																											anInt3023 = buffer
																													.readShort();
																										}
																									} else {
																										aByte3027 = (byte) 4;
																									}
																								} else {
																									aBoolean3002 = true;
																								}
																							} else {
																								aBoolean3000 = false;
																							}
																						} else {
																							aBoolean2990 = true;
																						}
																					} else {
																						aByte3027 = (byte) 2;
																						anInt3023 = 256 * buffer
																								.readUnsignedByte();
																					}
																				} else {
																					anInt3015 = buffer
																							.readUnsignedShort();
																					anInt3012 = buffer
																							.readUnsignedByte();
																				}
																			} else {
																				anInt3017 = buffer
																						.readUnsignedShort();
																				if (anInt3017 == 65535) {
																					anInt3017 = -1;
																				}
																				anInt3035 = buffer
																						.readUnsignedShort();
																				if (anInt3035 == 65535) {
																					anInt3035 = -1;
																				}
																				int i_19_ = -1;
																				if ((opcode ^ 0xffffffff) == -93) {
																					i_19_ = buffer
																							.readBigSmart();
																					if ((i_19_ ^ 0xffffffff) == -65536) {
																						i_19_ = -1;
																					}
																				}
																				int i_20_ = buffer
																						.readUnsignedByte();
																				anIntArray2984 = new int[i_20_ + 2];
																				for (int i_21_ = 0; i_20_ >= i_21_; i_21_++) {
																					anIntArray2984[i_21_] = buffer
																							.readBigSmart();
																					if ((anIntArray2984[i_21_] ^ 0xffffffff) == -65536) {
																						anIntArray2984[i_21_] = -1;
																					}
																				}
																				anIntArray2984[1 + i_20_] = i_19_;
																			}
																		} else {
																			anInt2970 = buffer
																					.readUnsignedByte();
																		}
																	} else {
																		aBoolean3051 = true;
																	}
																} else {
																	anInt3037 = buffer
																			.readShort() << 2;
																}
															} else {
																anInt2973 = buffer
																		.readUnsignedShort();
															}
														} else {
															aBoolean3033 = false;
														}
													} else {
														aBoolean3039 = true;
													}
												} else {
													int i_22_ = buffer
															.readUnsignedByte();
													aShortArray2988 = new short[i_22_];
													aShortArray3044 = new short[i_22_];
													for (int i_23_ = 0; i_22_ > i_23_; i_23_++) {
														aShortArray3044[i_23_] = (short) buffer
																.readUnsignedShort();
														aShortArray2988[i_23_] = (short) buffer
																.readUnsignedShort();
													}
												}
											} else {
												int i_24_ = buffer
														.readUnsignedByte();
												aShortArray3025 = new short[i_24_];
												aShortArray3047 = new short[i_24_];
												for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
													aShortArray3047[i_25_] = (short) buffer
															.readUnsignedShort();
													aShortArray3025[i_25_] = (short) buffer
															.readUnsignedShort();
												}
											}
										} else {
											aStringArray2980[opcode + -30] = buffer
													.readString();
										}
									} else {
										anInt3042 = buffer.readByte();
									}
								} else {
									int i_26_ = buffer.readBigSmart();
									if ((i_26_ ^ 0xffffffff) != -65536) {
										anIntArray3019 = new int[] { i_26_ };
									}
								}
							} else {
								anInt2977 = 1;
							}
						} else {
							aBoolean3053 = true;
						}
					} else {
						aByte3027 = (byte) 1;
					}
				} else {
					anInt2986 = buffer.readUnsignedByte();
				}
			} else {
				anInt3055 = buffer.readUnsignedByte();
			}
		}
	}

	final String method3034(String string, int i, boolean bool) {
		anInt3005++;
		if (aHashTable3014 == null) {
			return string;
		}
		if (bool != false) {
			anInt3035 = 79;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) aHashTable3014.method1518(3512,
				(long) i);
		if (node_sub18 == null) {
			return string;
		}
		return node_sub18.aString7149;
	}

	final boolean method3035(int i, int i_27_) {
		anInt3048++;
		if (i_27_ != -166) {
			anIntArray2984 = null;
		}
		if (anIntArray3019 != null && i != -1) {
			for (int i_28_ = 0; anIntArray3019.length > i_28_; i_28_++) {
				if (i == anIntArray3019[i_28_]) {
					return true;
				}
			}
		}
		return false;
	}

	static final void method3036(int i, int i_29_, int i_30_,
			Animable_Sub1 animable_sub1) {
		Class261 class261 = Node_Sub15_Sub6.method2572(i, i_29_, i_30_);
		if (class261 != null) {
			class261.anAnimable_Sub1_3317 = animable_sub1;
			int i_31_ = Class320_Sub10.aPlaneArray8300 == Class368.aPlaneArray4548 ? 1
					: 0;
			if (animable_sub1.method814((byte) -52)) {
				if (animable_sub1.method813(0)) {
					animable_sub1.anAnimable5941 = SeekableFile.anAnimableArray3884[i_31_];
					SeekableFile.anAnimableArray3884[i_31_] = animable_sub1;
				} else {
					animable_sub1.anAnimable5941 = Class303.anAnimableArray3827[i_31_];
					Class303.anAnimableArray3827[i_31_] = animable_sub1;
					Class194_Sub1.aBoolean6892 = true;
				}
			} else {
				animable_sub1.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_31_];
				Node_Sub36.anAnimableArray7429[i_31_] = animable_sub1;
			}
		}
	}

	final boolean method3037(int i) {
		if (i != 0) {
			aHashTable3014 = null;
		}
		anInt2965++;
        return anIntArray3019 != null;
    }

	final ObjectDefinition method3038(int i, Interface17 interface17) {
		anInt2991++;
		int i_32_ = -1;
		if (i != 13) {
			method3032((byte) -109);
		}
		if ((anInt3017 ^ 0xffffffff) == 0) {
			if ((anInt3035 ^ 0xffffffff) != 0) {
				i_32_ = interface17.method65(anInt3035, -3);
			}
		} else {
			i_32_ = interface17.method64(anInt3017, (byte) -42);
		}
		if ((i_32_ ^ 0xffffffff) > -1
				|| (-1 + anIntArray2984.length ^ 0xffffffff) >= (i_32_ ^ 0xffffffff)
				|| anIntArray2984[i_32_] == -1) {
			int i_33_ = anIntArray2984[-1 + anIntArray2984.length];
			if (i_33_ != -1) {
				return aClass112_3028.method1145(i_33_, i + 99);
			}
			return null;
		}
		return aClass112_3028.method1145(anIntArray2984[i_32_], 81);
	}

	final boolean method3039(int i) {
		anInt2978++;
		if (modelIds == null) {
			return true;
		}
		boolean bool = true;
		synchronized (aClass112_3028.aClass302_1433) {
			for (int i_34_ = 0; (modelIds.length ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
				for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (modelIds[i_34_].length ^ 0xffffffff); i_35_++)
					bool &= aClass112_3028.aClass302_1433.method3515(0,
							modelIds[i_34_][i_35_], 0);
			}
		}
		if (i <= 76) {
			anInt3023 = -86;
		}
		return bool;
	}

	final boolean method3040(int i) {
		anInt2976++;
		if (anIntArray2984 == null) {
            return !(anInt3015 == -1 && anIntArray3036 == null);
        }
		if (i != -4617) {
			method3034(null, 122, false);
		}
		for (int i_36_ = 0; i_36_ < anIntArray2984.length; i_36_++) {
			if ((anIntArray2984[i_36_] ^ 0xffffffff) != 0) {
				ObjectDefinition objectdefinition_37_ = aClass112_3028
						.method1145(anIntArray2984[i_36_], 59);
				if (objectdefinition_37_.anInt3015 != -1
						|| objectdefinition_37_.anIntArray3036 != null) {
					return true;
				}
			}
		}
		return false;
	}

	final boolean method3041(int i, int i_38_) {
		anInt3043++;
		if (modelIds == null) {
			return true;
		}
		synchronized (aClass112_3028.aClass302_1433) {
			if (i_38_ <= 12) {
				return true;
			}
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (aByteArray2967.length ^ 0xffffffff); i_39_++) {
				if (i == aByteArray2967[i_39_]) {
					for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (modelIds[i_39_].length ^ 0xffffffff); i_40_++) {
						if (!aClass112_3028.aClass302_1433.method3515(0,
								modelIds[i_39_][i_40_], 0)) {
							return false;
						}
					}
					return true;
				}
			}
		}
		return true;
	}

	final void method3042(byte b, BufferedStream buffer) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method3033(buffer, i, 21120);
		}
		if (b == 123) {
			anInt3049++;
		}
	}

	final void method3043(int i) {
		if (i == 5) {
			anInt2979++;
			if ((anInt3057 ^ 0xffffffff) == 0) {
				anInt3057 = 0;
				if (aByteArray2967 != null && aByteArray2967.length == 1
						&& aByteArray2967[0] == 10) {
					anInt3057 = 1;
				}
				for (int i_41_ = 0; i_41_ < 5; i_41_++) {
					if (aStringArray2980[i_41_] != null) {
						anInt3057 = 1;
						break;
					}
				}
			}
			if (anInt2970 == -1) {
				anInt2970 = anInt3010 == 0 ? 0 : 1;
			}
			if (method3037(0) || aBoolean2998 || anIntArray2984 != null) {
				aBoolean2992 = true;
			}
		}
	}

	final int method3044(int i) {
		anInt2966++;
		if (i != -16828) {
			anInt3012 = 11;
		}
		if (anIntArray3019 != null) {
			if ((anIntArray3019.length ^ 0xffffffff) >= -2) {
				return anIntArray3019[0];
			}
			int i_42_ = (int) (65535.0 * Math.random());
			for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (anIntArray3019.length ^ 0xffffffff); i_43_++) {
				if (i_42_ <= anIntArray2995[i_43_]) {
					return anIntArray3019[i_43_];
				}
				i_42_ -= anIntArray2995[i_43_];
			}
		}
		return -1;
	}

	static final void method3045(long[] ls, Object[] objects, boolean bool) {
		anInt3046++;
		Class286.method3393(objects, (byte) -66, ls, 0, -1 + ls.length);
		if (bool == false) {
			/* empty */
		}
	}

	final Class243 method3046(int i, int i_44_, int i_45_, Plane plane,
			boolean bool, byte b, int i_46_, int i_47_,
			GraphicsToolkit graphicstoolkit, Class121 class121, int i_48_,
			Plane plane_49_) {
		anInt3003++;
		if (Class243.method3062(i_47_, (byte) 51)) {
			i_47_ = 4;
		}
		long l = (long) (i + ((objectId << 10) + (i_47_ << 3)));
		l |= (long) (graphicstoolkit.anInt1537 << 29);
		if (class121 != null) {
			l |= class121.aLong1522 << 32;
		}
		int i_50_ = i_48_;
		if ((aByte3027 ^ 0xffffffff) == -4) {
			i_50_ |= 0x7;
		} else {
			if ((aByte3027 ^ 0xffffffff) != -1
					|| (anInt2963 ^ 0xffffffff) != -1) {
				i_50_ |= 0x2;
			}
			if ((anInt2964 ^ 0xffffffff) != -1) {
				i_50_ |= 0x1;
			}
			if (anInt3018 != 0) {
				i_50_ |= 0x4;
			}
		}
		if (bool) {
			i_50_ |= 0x40000;
		}
		Class243 class243;
		synchronized (aClass112_3028.aClass61_1435) {
			class243 = (Class243) aClass112_3028.aClass61_1435.method607(l, b);
		}
		DrawableModel drawablemodel = class243 != null ? class243.aDrawableModel3064
				: null;
		r var_r = null;
		if (drawablemodel == null
				|| graphicstoolkit.b(drawablemodel.ua(), i_50_) != 0) {
			if (drawablemodel != null) {
				i_50_ = graphicstoolkit.c(i_50_, drawablemodel.ua());
			}
			int i_51_ = i_50_;
			if ((i_47_ ^ 0xffffffff) == -11 && i > 3) {
				i_51_ |= 0x5;
			}
			drawablemodel = method3051(graphicstoolkit, i_51_, class121,
					(byte) 76, i, i_47_);
			if (drawablemodel == null) {
				return null;
			}
			if (i_47_ == 10 && (i ^ 0xffffffff) < -4) {
				drawablemodel.a(2048);
			}
			if (bool) {
				var_r = drawablemodel.ba(null);
			}
			drawablemodel.s(i_50_);
			class243 = new Class243();
			class243.aR3072 = var_r;
			class243.aDrawableModel3064 = drawablemodel;
			synchronized (aClass112_3028.aClass61_1435) {
				aClass112_3028.aClass61_1435.method601(class243, b ^ 0x63de, l);
			}
		} else {
			drawablemodel = class243.aDrawableModel3064;
			var_r = class243.aR3072;
			if (bool && var_r == null) {
				var_r = class243.aR3072 = drawablemodel.ba(null);
			}
		}
		if (b != 0) {
			method3041(-47, 126);
		}
		boolean bool_52_ = aByte3027 != 0
				&& (plane != null || plane_49_ != null);
		boolean bool_53_ = anInt2964 != 0 || (anInt2963 ^ 0xffffffff) != -1
				|| anInt3018 != 0;
		if (!bool_52_ && !bool_53_) {
			drawablemodel = drawablemodel.method633((byte) 0, i_48_, true);
		} else {
			drawablemodel = drawablemodel.method633((byte) 0, i_50_, true);
			if (bool_52_) {
				drawablemodel.p(aByte3027, anInt3023, plane, plane_49_, i_45_,
						i_46_, i_44_);
			}
			if (bool_53_) {
				drawablemodel.H(anInt2964, anInt2963, anInt3018);
			}
			drawablemodel.s(i_48_);
		}
		Node_Sub21.aClass243_7185.aDrawableModel3064 = drawablemodel;
		Node_Sub21.aClass243_7185.aR3072 = var_r;
		return Node_Sub21.aClass243_7185;
	}

	static final int method3047(int i, int i_54_) {
		if (i_54_ != -1) {
			method3049(null, null, (byte) -38);
		}
		anInt2997++;
		int i_55_ = (i * i >> 12) * i >> 12;
		int i_56_ = -61440 + 6 * i;
		int i_57_ = 40960 + (i * i_56_ >> 12);
		return i_57_ * i_55_ >> 12;
	}

	final DrawableModel method3048(int i, int i_58_, int i_59_, int i_60_,
			Plane plane, Animator animator, int i_61_,
			GraphicsToolkit graphicstoolkit, Plane plane_62_,
			Class121 class121, int i_63_, int i_64_) {
		anInt3021++;
		if (Class243.method3062(i_59_, (byte) 46)) {
			i_59_ = 4;
		}
		long l = (long) ((objectId << 10) + ((i_59_ << 3) - -i));
		int i_65_ = i_63_;
		l |= (long) (graphicstoolkit.anInt1537 << 29);
		if (class121 != null) {
			l |= class121.aLong1522 << 32;
		}
		if (animator != null) {
			i_63_ |= animator.method237((byte) -128);
		}
		if (aByte3027 != 3) {
			if ((aByte3027 ^ 0xffffffff) != -1
					|| (anInt2963 ^ 0xffffffff) != -1) {
				i_63_ |= 0x2;
			}
			if (anInt2964 != 0) {
				i_63_ |= 0x1;
			}
			if ((anInt3018 ^ 0xffffffff) != -1) {
				i_63_ |= 0x4;
			}
		} else {
			i_63_ |= 0x7;
		}
		if ((i_59_ ^ 0xffffffff) == -11 && (i ^ 0xffffffff) < -4) {
			i_63_ |= 0x5;
		}
		DrawableModel drawablemodel;
		synchronized (aClass112_3028.aClass61_1436) {
			drawablemodel = (DrawableModel) aClass112_3028.aClass61_1436
					.method607(l, 0);
		}
		if (drawablemodel == null
				|| (graphicstoolkit.b(drawablemodel.ua(), i_63_) ^ 0xffffffff) != -1) {
			if (drawablemodel != null) {
				i_63_ = graphicstoolkit.c(i_63_, drawablemodel.ua());
			}
			drawablemodel = method3051(graphicstoolkit, i_63_, class121,
					(byte) 76, i, i_59_);
			if (drawablemodel == null) {
				return null;
			}
			synchronized (aClass112_3028.aClass61_1436) {
				aClass112_3028.aClass61_1436.method601(drawablemodel, 25566, l);
			}
		}
		boolean bool = false;
		if (animator != null) {
			drawablemodel = drawablemodel.method633((byte) 1, i_63_, true);
			bool = true;
			animator.method225(0, drawablemodel, 0x3 & i);
		}
		if (i_59_ == 10 && (i ^ 0xffffffff) < -4) {
			if (!bool) {
				drawablemodel = drawablemodel.method633((byte) 3, i_63_, true);
				bool = true;
			}
			drawablemodel.a(2048);
		}
		if ((aByte3027 ^ 0xffffffff) != -1) {
			if (!bool) {
				bool = true;
				drawablemodel = drawablemodel.method633((byte) 3, i_63_, true);
			}
			drawablemodel.p(aByte3027, anInt3023, plane_62_, plane, i_60_,
					i_64_, i_58_);
		}
		if ((anInt2964 ^ 0xffffffff) != -1 || (anInt2963 ^ 0xffffffff) != -1
				|| (anInt3018 ^ 0xffffffff) != -1) {
			if (!bool) {
				drawablemodel = drawablemodel.method633((byte) 3, i_63_, true);
				bool = true;
			}
			drawablemodel.H(anInt2964, anInt2963, anInt3018);
		}
		if (bool) {
			drawablemodel.s(i_65_);
		}
		if (i_61_ != 1521375267) {
			anInt3013 = 89;
		}
		return drawablemodel;
	}

	static final void method3049(SignLink signlink, Object object, byte b) {
		anInt3001++;
		if (b <= 63) {
			method3045(null, null, true);
		}
		if (signlink.anEventQueue4002 != null) {
			for (int i = 0; (i ^ 0xffffffff) > -51; i++) {
				if (signlink.anEventQueue4002.peekEvent() == null) {
					break;
				}
				Class262_Sub22.method3208(1L, false);
			}
			do {
				try {
					if (object == null) {
						break;
					}
					signlink.anEventQueue4002.postEvent(new ActionEvent(object,
							1001, "dummy"));
				} catch (Exception exception) {
					break;
				}
				break;
			} while (false);
		}
	}

	static final int method3050(byte b, int i) {
		anInt3041++;
		if (b > -122) {
			return -61;
		}
		return 0xff & i;
	}

	private final DrawableModel method3051(GraphicsToolkit graphicstoolkit,
			int i, Class121 class121, byte b, int i_66_, int i_67_) {
		anInt3054++;
		int i_68_ = 64 + anInt3042;
		int i_69_ = anInt3026 - -850;
		int i_70_ = i;
		boolean bool = aBoolean3039 || i_67_ == 2 && (i_66_ ^ 0xffffffff) < -4;
		if (bool) {
			i |= 0x10;
		}
		if (i_66_ != 0) {
			i |= 0xd;
		} else {
			if (anInt2969 != 128 || (anInt2968 ^ 0xffffffff) != -1) {
				i |= 0x1;
			}
			if ((anInt3009 ^ 0xffffffff) != -129 || anInt2985 != 0) {
				i |= 0x4;
			}
		}
		if ((anInt2973 ^ 0xffffffff) != -129 || (anInt3037 ^ 0xffffffff) != -1) {
			i |= 0x2;
		}
		if (aShortArray3047 != null) {
			i |= 0x4000;
		}
		if (aShortArray3044 != null) {
			i |= 0x8000;
		}
		if ((aByte2960 ^ 0xffffffff) != -1) {
			i |= 0x80000;
		}
		DrawableModel drawablemodel = null;
		if (aByteArray2967 == null) {
			return null;
		}
		int i_71_ = -1;
		if (b != 76) {
			return null;
		}
		for (int i_72_ = 0; aByteArray2967.length > i_72_; i_72_++) {
			if (aByteArray2967[i_72_] == i_67_) {
				i_71_ = i_72_;
				break;
			}
		}
		if (i_71_ == -1) {
			return null;
		}
		int[] is = class121 == null || class121.anIntArray1526 == null ? modelIds[i_71_]
				: class121.anIntArray1526;
		int i_73_ = is.length;
		if ((i_73_ ^ 0xffffffff) < -1) {
			long l = (long) graphicstoolkit.anInt1537;
			for (int i_74_ = 0; i_74_ < i_73_; i_74_++)
				l = l * 67783L + (long) is[i_74_];
			synchronized (aClass112_3028.aClass61_1434) {
				drawablemodel = (DrawableModel) aClass112_3028.aClass61_1434
						.method607(l, 0);
			}
			if (drawablemodel != null) {
				if (drawablemodel.WA() != i_68_) {
					i |= 0x1000;
				}
				if ((i_69_ ^ 0xffffffff) != (drawablemodel.da() ^ 0xffffffff)) {
					i |= 0x2000;
				}
			}
			if (drawablemodel == null
					|| graphicstoolkit.b(drawablemodel.ua(), i) != 0) {
				int i_75_ = i | 0x1f01f;
				if (drawablemodel != null) {
					i_75_ = graphicstoolkit.c(i_75_, drawablemodel.ua());
				}
				Model model = null;
				synchronized (Animable_Sub3_Sub1.aModelArray11008) {
					for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
						synchronized (aClass112_3028.aClass302_1433) {
							model = Renderer.method3448(is[i_76_] & 0xffff, 7,
									0, aClass112_3028.aClass302_1433);
						}
						if (model == null) {
							return null;
						}
						if ((model.anInt2614 ^ 0xffffffff) > -14) {
							model.method2081(2, 0);
						}
						if (i_73_ > 1) {
							Animable_Sub3_Sub1.aModelArray11008[i_76_] = model;
						}
					}
					if ((i_73_ ^ 0xffffffff) < -2) {
						model = new Model(Animable_Sub3_Sub1.aModelArray11008,
								i_73_);
					}
				}
				drawablemodel = graphicstoolkit.a(model, i_75_,
						aClass112_3028.anInt1437, i_68_, i_69_);
				synchronized (aClass112_3028.aClass61_1434) {
					aClass112_3028.aClass61_1434.method601(drawablemodel,
							25566, l);
				}
			}
		}
		if (drawablemodel == null) {
			return null;
		}
		DrawableModel drawablemodel_77_ = drawablemodel.method633((byte) 0, i,
				true);
		if (i_68_ != drawablemodel.WA()) {
			drawablemodel_77_.C(i_68_);
		}
		if (drawablemodel.da() != i_69_) {
			drawablemodel_77_.LA(i_69_);
		}
		if (bool) {
			drawablemodel_77_.v();
		}
		if ((i_67_ ^ 0xffffffff) == -5 && (i_66_ ^ 0xffffffff) < -4) {
			drawablemodel_77_.k(2048);
			drawablemodel_77_.H(180, 0, -180);
		}
		i_66_ &= 0x3;
		if (i_66_ != 1) {
			if ((i_66_ ^ 0xffffffff) != -3) {
				if (i_66_ == 3) {
					drawablemodel_77_.k(12288);
				}
			} else {
				drawablemodel_77_.k(8192);
			}
		} else {
			drawablemodel_77_.k(4096);
		}
		if (aShortArray3047 != null) {
			short[] ses;
			if (class121 == null || class121.aShortArray1523 == null) {
				ses = aShortArray3025;
			} else {
				ses = class121.aShortArray1523;
			}
			for (int i_78_ = 0; (i_78_ ^ 0xffffffff) > (aShortArray3047.length ^ 0xffffffff); i_78_++) {
				if (aByteArray2996 != null && aByteArray2996.length > i_78_) {
					drawablemodel_77_
							.ia(aShortArray3047[i_78_],
									EntityNode_Sub3_Sub1.aShortArray9165[0xff & aByteArray2996[i_78_]]);
				} else {
					drawablemodel_77_.ia(aShortArray3047[i_78_], ses[i_78_]);
				}
			}
		}
		if (aShortArray3044 != null) {
			short[] ses;
			if (class121 == null || class121.aShortArray1524 == null) {
				ses = aShortArray2988;
			} else {
				ses = class121.aShortArray1524;
			}
			for (int i_79_ = 0; aShortArray3044.length > i_79_; i_79_++)
				drawablemodel_77_.aa(aShortArray3044[i_79_], ses[i_79_]);
		}
		if (aByte2960 != 0) {
			drawablemodel_77_.method626(aByte2974, aByte3045, aByte3052,
					aByte2960 & 0xff);
		}
		if (anInt2969 != 128 || anInt2973 != 128
				|| (anInt3009 ^ 0xffffffff) != -129) {
			drawablemodel_77_.O(anInt2969, anInt2973, anInt3009);
		}
		if ((anInt2968 ^ 0xffffffff) != -1 || (anInt3037 ^ 0xffffffff) != -1
				|| (anInt2985 ^ 0xffffffff) != -1) {
			drawablemodel_77_.H(anInt2968, anInt3037, anInt2985);
		}
		drawablemodel_77_.s(i_70_);
		return drawablemodel_77_;
	}

	private final void method3052(byte b, BufferedStream buffer) {
		anInt3004++;
		if (b == -111) {
			int i = buffer.readUnsignedByte();
			for (int i_80_ = 0; (i_80_ ^ 0xffffffff) > (i ^ 0xffffffff); i_80_++) {
				buffer.offset++;
				int length2 = buffer.readUnsignedByte();
				for (int i2 = 0; i2 < length2; i2++)
					buffer.readBigSmart();
			/*	buffer.offset++;
				int i_81_ = buffer.readUnsignedByte();
				buffer.offset += 2 * i_81_;*/
			}
		}
	}

	final int method3053(int i, int i_82_, int i_83_) {
		anInt3029++;
		if (aHashTable3014 == null) {
			return i;
		}
		Node_Sub32 node_sub32 = (Node_Sub32) aHashTable3014.method1518(3512,
				(long) i_83_);
		if (i_82_ < 6) {
			method3034(null, 124, true);
		}
		if (node_sub32 == null) {
			return i;
		}
		return node_sub32.anInt7381;
	}

	public ObjectDefinition() {
		anInt2963 = 0;
		aByte2960 = (byte) 0;
		anInt2983 = 0;
		anInt2971 = 0;
		anInt2986 = 1;
		anInt2987 = -1;
		anInt2975 = 0;
		anInt2964 = 0;
		anInt2969 = 128;
		aString2999 = "null";
		anInt2985 = 0;
		aBoolean3002 = false;
		anInt2970 = -1;
		anInt2994 = -1;
		anInt2977 = -1;
		anInt3012 = 0;
		anInt3015 = -1;
		anInt3017 = -1;
		aBoolean3016 = false;
		aBoolean3007 = false;
		anInt3009 = 128;
		anInt3018 = 0;
		anInt3024 = 255;
		anInt2958 = 0;
		anIntArray3019 = null;
		anInt3023 = -1;
		anInt2989 = 0;
		anInt3008 = -1;
		anInt3032 = 960;
		aBoolean3000 = true;
		anInt3011 = 64;
		anIntArray2995 = null;
		aByte3027 = (byte) 0;
		anInt3020 = 256;
		anInt3038 = -1;
		anInt2968 = 0;
		anInt3042 = 0;
		anInt3010 = 2;
		aBoolean2993 = false;
		aBoolean2998 = false;
		anInt3037 = 0;
		anInt3040 = 0;
		anInt3050 = 256;
		anInt3026 = 0;
		aBoolean3051 = false;
		aBoolean2990 = false;
		aBoolean3034 = true;
		aBoolean2992 = false;
		aBoolean3053 = false;
		anInt3055 = 1;
		anInt2962 = 0;
		anInt3006 = -1;
		anInt3035 = -1;
		anInt3013 = -1;
		aBoolean3033 = true;
		aBoolean3056 = false;
		aBoolean3039 = false;
		anInt3057 = -1;
	}
}
