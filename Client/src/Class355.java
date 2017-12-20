/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class355
{
	protected int anInt4349;
	protected boolean aBoolean4350;
	private int anInt4351;
	protected int[] anIntArray4352;
	protected int anInt4353;
	protected boolean aBoolean4354;
	protected boolean aBoolean4355;
	private int anInt4356;
	protected short aShort4357;
	protected int anInt4358;
	private int anInt4359;
	protected int anInt4360;
	protected int anInt4361 = -1;
	protected int[] anIntArray4362;
	static int anInt4363;
	protected int anInt4364;
	protected boolean aBoolean4365;
	static volatile boolean aBoolean4366 = true;
	protected int anInt4367;
	protected int anInt4368;
	protected short aShort4369;
	private int anInt4370;
	protected int[] anIntArray4371;
	static int anInt4372;
	protected boolean aBoolean4373;
	protected int anInt4374;
	protected boolean aBoolean4375;
	private int anInt4376;
	protected int anInt4377;
	static int anInt4378;
	protected int anInt4379;
	protected int anInt4380;
	protected int anInt4381;
	protected short aShort4382;
	protected int anInt4383;
	protected int anInt4384;
	private int anInt4385;
	protected short aShort4386;
	protected int anInt4387;
	protected int anInt4388;
	protected int anInt4389;
	protected boolean aBoolean4390;
	protected boolean aBoolean4391;
	static int anInt4392;
	protected int anInt4393;
	protected int anInt4394;
	private int anInt4395;
	static OutcommingPacket aClass318_4396 = new OutcommingPacket(40, 11);
	static int anInt4397;
	protected int anInt4398;
	protected int anInt4399;
	protected int anInt4400;
	protected int anInt4401;
	protected int anInt4402;
	protected int anInt4403;
	protected int anInt4404;
	protected int anInt4405;
	protected boolean aBoolean4406;
	protected int anInt4407;
	protected int anInt4408;
	protected int anInt4409;
	protected int anInt4410;
	protected int anInt4411;
	static int anInt4412;
	protected int anInt4413;
	protected int[] anIntArray4414;
	private int anInt4415;
	protected int anInt4416;
	static int anInt4417;
	private int anInt4418;
	protected int anInt4419;
	protected int anInt4420;
	static int anInt4421;
	protected int anInt4422;
	private int anInt4423;
	protected int anInt4424;
	
	static final int[] method4014(int i, Node_Sub13 node_sub13) {
		anInt4363++;
		BufferedStream buffer = new BufferedStream(518);
		int[] is = new int[4];
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -5; i_0_++)
			is[i_0_] = (int) (9.9999999E7 * Math.random());
		if (i != -5410) {
			method4017(38, false, null, true, null);
		}
		buffer.writeByte(10);
		buffer.writeInt(is[0]);
		buffer.writeInt(is[1]);
		buffer.writeInt(is[2]);
		buffer.writeInt(is[3]);
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -11; i_1_++)
			buffer.writeInt((int) (9.9999999E7 * Math.random()));
		buffer.writeShort((int) (Math.random() * 9.9999999E7));
	//	buffer.applyRsa(0, Class203.LOGIN_RSA_MODULO, Class262_Sub10.LOGIN_RSA_EXPONENT);
		node_sub13.aPacket7113.writeBytes(buffer.offset, buffer.buffer, 0);
		return is;
	}
	
	private final void method4015(byte b, BufferedStream buffer, int i) {
		int i_2_ = 103 / ((b - -38) / 46);
		if (i == 1) {
			aShort4357 = (short) buffer.readUnsignedShort();
			aShort4369 = (short) buffer.readUnsignedShort();
			aShort4386 = (short) buffer.readUnsignedShort();
			aShort4382 = (short) buffer.readUnsignedShort();
			int i_3_ = 3;
			aShort4382 <<= i_3_;
			aShort4386 <<= i_3_;
			aShort4369 <<= i_3_;
			aShort4357 <<= i_3_;
		} else if (i == 2) {
			buffer.readUnsignedByte();
		} else if (i == 3) {
			anInt4377 = buffer.readInt();
			anInt4367 = buffer.readInt();
		} else if ((i ^ 0xffffffff) == -5) {
			anInt4380 = buffer.readUnsignedByte();
			anInt4404 = buffer.readByte();
		} else if (i == 5) {
			anInt4360 = anInt4408 = buffer.readUnsignedShort() << 12 << 2;
		} else if ((i ^ 0xffffffff) != -7) {
			if (i != 7) {
				if (i == 8) {
					anInt4424 = buffer.readUnsignedShort();
					anInt4381 = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) == -10) {
					int i_4_ = buffer.readUnsignedByte();
					anIntArray4362 = new int[i_4_];
					for (int i_5_ = 0; (i_4_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
						anIntArray4362[i_5_] = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) == -11) {
					int i_6_ = buffer.readUnsignedByte();
					anIntArray4414 = new int[i_6_];
					for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
						anIntArray4414[i_7_] = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) != -13) {
					if ((i ^ 0xffffffff) != -14) {
						if (i != 14) {
							if (i == 15) {
								anInt4393 = buffer.readUnsignedShort();
							} else if ((i ^ 0xffffffff) == -17) {
								aBoolean4375 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
								anInt4361 = buffer.readUnsignedShort();
								anInt4411 = buffer.readUnsignedShort();
								aBoolean4390 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
							} else if ((i ^ 0xffffffff) == -18) {
								anInt4353 = buffer.readUnsignedShort();
							} else if ((i ^ 0xffffffff) != -19) {
								if (i != 19) {
									if ((i ^ 0xffffffff) != -21) {
										if ((i ^ 0xffffffff) != -22) {
											if (i == 22) {
												anInt4413 = buffer.readInt();
											} else if ((i ^ 0xffffffff) != -24) {
												if ((i ^ 0xffffffff) == -25) {
													aBoolean4391 = false;
												} else if ((i ^ 0xffffffff) != -26) {
													if ((i ^ 0xffffffff) == -27) {
														aBoolean4373 = false;
													} else if (i == 27) {
														anInt4419 = buffer.readUnsignedShort() << 12 << 2;
													} else if ((i ^ 0xffffffff) == -29) {
														anInt4385 = buffer.readUnsignedByte();
													} else if ((i ^ 0xffffffff) == -30) {
														buffer.readShort();
													} else if (i != 30) {
														if ((i ^ 0xffffffff) != -32) {
															if ((i ^ 0xffffffff) != -33) {
																if (i == 33) {
																	aBoolean4355 = true;
																} else if ((i ^ 0xffffffff) == -35) {
																	aBoolean4354 = false;
																}
															} else {
																aBoolean4365 = false;
															}
														} else {
															anInt4360 = buffer.readUnsignedShort() << 12 << 2;
															anInt4408 = buffer.readUnsignedShort() << 12 << 2;
														}
													} else {
														aBoolean4350 = true;
													}
												} else {
													int i_8_ = buffer.readUnsignedByte();
													anIntArray4371 = new int[i_8_];
													for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
														anIntArray4371[i_9_] = buffer.readUnsignedShort();
												}
											} else {
												anInt4395 = buffer.readUnsignedByte();
											}
										} else {
											anInt4376 = buffer.readUnsignedByte();
										}
									} else {
										anInt4423 = buffer.readUnsignedByte();
									}
								} else {
									anInt4379 = buffer.readUnsignedByte();
								}
							} else {
								anInt4409 = buffer.readInt();
							}
						} else {
							anInt4358 = buffer.readUnsignedShort();
						}
					} else {
						anInt4374 = buffer.readByte();
					}
				} else {
					anInt4407 = buffer.readByte();
				}
			} else {
				anInt4401 = buffer.readUnsignedShort();
				anInt4388 = buffer.readUnsignedShort();
			}
		} else {
			anInt4359 = buffer.readInt();
			anInt4356 = buffer.readInt();
		}
		anInt4412++;
	}
	
	final void method4016(int i) {
		anInt4383 = anInt4359 >> 16 & 0xff;
		anInt4372++;
		if (anInt4407 > -2 || anInt4374 > -2) {
			aBoolean4406 = true;
		}
		anInt4415 = (anInt4356 & 0xff0ca5) >> 16;
		anInt4420 = anInt4415 - anInt4383;
		anInt4403 = (anInt4359 & 0xff60) >> 8;
		anInt4418 = (0xff28 & anInt4356) >> 8;
		if (i == 2) {
			anInt4351 = anInt4356 & 0xff;
			anInt4400 = -anInt4403 + anInt4418;
			anInt4389 = anInt4359 & 0xff;
			anInt4370 = anInt4356 >> 24 & 0xff;
			anInt4394 = 0xff & anInt4359 >> 24;
			anInt4402 = -anInt4389 + anInt4351;
			anInt4349 = anInt4370 + -anInt4394;
			if (anInt4419 != -1) {
				anInt4398 = anInt4385 * anInt4388 / 100;
				if ((anInt4398 ^ 0xffffffff) == -1) {
					anInt4398 = 1;
				}
				anInt4399 = (anInt4419 + (-((-anInt4360 + anInt4408) / 2) + -anInt4360)) / anInt4398;
			}
			if (anInt4413 != -1) {
				anInt4384 = anInt4388 * anInt4395 / 100;
				if ((anInt4384 ^ 0xffffffff) == -1) {
					anInt4384 = 1;
				}
				anInt4368 = (-((-anInt4377 + anInt4367) / 2) + (-anInt4377 + anInt4413)) / anInt4384;
			}
			if (anInt4409 != 0) {
				anInt4416 = anInt4376 * anInt4388 / 100;
				anInt4387 = anInt4388 * anInt4423 / 100;
				if ((anInt4387 ^ 0xffffffff) == -1) {
					anInt4387 = 1;
				}
				if ((anInt4416 ^ 0xffffffff) == -1) {
					anInt4416 = 1;
				}
				anInt4422 = (((anInt4409 & 0xff34dc) >> 16) + (-(anInt4420 / 2) + -anInt4383) << 8) / anInt4387;
				anInt4410 = (((anInt4409 & 0xff00) >> 8) - anInt4403 - anInt4400 / 2 << 8) / anInt4387;
				anInt4405 = ((0xff & anInt4409) - anInt4402 / 2 - anInt4389 << 8) / anInt4387;
				Class355 class355_10_ = this;
				class355_10_.anInt4405 = class355_10_.anInt4405 + ((anInt4405 ^ 0xffffffff) >= -1 ? 4 : -4);
				anInt4364 = (-(anInt4349 / 2) + -anInt4394 + (anInt4409 >> 24 & 0xff) << 8) / anInt4416;
				Class355 class355_11_ = this;
				class355_11_.anInt4422 = class355_11_.anInt4422 + ((anInt4422 ^ 0xffffffff) >= -1 ? 4 : -4);
				Class355 class355_12_ = this;
				class355_12_.anInt4410 = class355_12_.anInt4410 + ((anInt4410 ^ 0xffffffff) < -1 ? -4 : 4);
				Class355 class355_13_ = this;
				class355_13_.anInt4364 = class355_13_.anInt4364 + ((anInt4364 ^ 0xffffffff) >= -1 ? 4 : -4);
			}
		}
	}
	
	static final void method4017(int i, boolean bool, String string, boolean bool_14_, SignLink signlink) {
		if (i >= -43) {
			aBoolean4366 = false;
		}
		anInt4392++;
		Class140.method1610(0, string, "openjs", signlink, bool, bool_14_);
	}
	
	final void method4018(byte b, BufferedStream buffer) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method4015((byte) 33, buffer, i);
		}
		int i = 117 % ((31 - b) / 42);
		anInt4417++;
	}
	
	static final void method4019(boolean bool) {
		if (bool == false) {
			anInt4421++;
			if ((SignLink.aString3989.toLowerCase().indexOf("microsoft") ^ 0xffffffff) == 0) {
				Node_Sub38_Sub24.anIntArray10352[92] = 74;
				Node_Sub38_Sub24.anIntArray10352[47] = 73;
				Node_Sub38_Sub24.anIntArray10352[46] = 72;
				Node_Sub38_Sub24.anIntArray10352[44] = 71;
				Node_Sub38_Sub24.anIntArray10352[45] = 26;
				if (SignLink.aMethod4004 == null) {
					Node_Sub38_Sub24.anIntArray10352[192] = 58;
					Node_Sub38_Sub24.anIntArray10352[222] = 59;
				} else {
					Node_Sub38_Sub24.anIntArray10352[222] = 58;
					Node_Sub38_Sub24.anIntArray10352[192] = 28;
					Node_Sub38_Sub24.anIntArray10352[520] = 59;
				}
				Node_Sub38_Sub24.anIntArray10352[93] = 43;
				Node_Sub38_Sub24.anIntArray10352[91] = 42;
				Node_Sub38_Sub24.anIntArray10352[59] = 57;
				Node_Sub38_Sub24.anIntArray10352[61] = 27;
			} else {
				Node_Sub38_Sub24.anIntArray10352[191] = 73;
				Node_Sub38_Sub24.anIntArray10352[186] = 57;
				Node_Sub38_Sub24.anIntArray10352[219] = 42;
				Node_Sub38_Sub24.anIntArray10352[223] = 28;
				Node_Sub38_Sub24.anIntArray10352[192] = 58;
				Node_Sub38_Sub24.anIntArray10352[189] = 26;
				Node_Sub38_Sub24.anIntArray10352[222] = 59;
				Node_Sub38_Sub24.anIntArray10352[188] = 71;
				Node_Sub38_Sub24.anIntArray10352[187] = 27;
				Node_Sub38_Sub24.anIntArray10352[220] = 74;
				Node_Sub38_Sub24.anIntArray10352[221] = 43;
				Node_Sub38_Sub24.anIntArray10352[190] = 72;
			}
		}
	}
	
	static final int method4020(int i, String string) {
		anInt4397++;
		if (string == null) {
			return -1;
		}
		for (int i_15_ = 0; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			if (string.equalsIgnoreCase(Class262_Sub12.aStringArray7793[i_15_])) {
				return i_15_;
			}
		}
		int i_16_ = -70 % ((60 - i) / 51);
		return -1;
	}
	
	static final void method4021(int i) {
		Class290_Sub7.aClass71_8134.method742(-79);
		anInt4378++;
		r.aClass58_9578.method579(true);
		Class42.aClass181_643.method1824(64);
		Class186.aClass112_2256.method1140(-103);
		Class366.aClass279_4526.method3373((byte) -52);
		EntityNode_Sub3_Sub1.aClass86_9166.method1004((byte) 78);
		Class18.aClass37_306.method397(53);
		Class16.aClass101_228.method1093(false);
		IOException_Sub1.aClass128_85.method1546(-10);
		Class188_Sub2_Sub1.aClass229_9354.method2122(true);
		Class336.aClass315_4173.method3660(6105);
		Class291_Sub1.aClass13_8198.method210(-111);
		InputStream_Sub2.aClass281_83.method3382(1);
		Node_Sub54.aClass338_7671.method3907((byte) -101);
		Class304.aClass215_3834.method2070(2048);
		Class146.aClass32_1812.method352((byte) -75);
		Class188_Sub2_Sub2.aClass36_9366.method389(11);
		Class171.aClass278_2062.method3363(-29945);
		CacheNode_Sub6.aClass57_9480.method570((byte) -96);
		Class32.aClass359_508.method4040((byte) -103);
		Class186.aClass239_2249.method3025((byte) 105);
		Node_Sub9_Sub4.aClass180_9727.method1823(true);
		Class296.aClass186_5429.method1872(512);
		Class228.method2120(-124);
		if (i <= 48) {
			aBoolean4366 = true;
		}
		Class300.method3501(99999999);
		Class262_Sub19.method3201(-23303);
		Class82.method798(-1);
		Class64.method713(0);
		Class125.aClass61_1609.method602((byte) -122);
		Node_Sub51.aClass61_7628.method602((byte) -121);
		Class262_Sub18.aClass61_7842.method602((byte) -119);
		CacheNode_Sub12.aClass61_9556.method602((byte) -118);
		ClientScriptsExecutor.aClass61_3867.method602((byte) -127);
	}
	
	public static void method4022(boolean bool) {
		if (bool != false) {
			method4021(23);
		}
		aClass318_4396 = null;
	}
	
	public Class355() {
		anInt4353 = -1;
		anInt4358 = 0;
		anInt4376 = 100;
		anInt4379 = 0;
		aBoolean4354 = true;
		aBoolean4365 = true;
		anInt4393 = -1;
		anInt4380 = 0;
		aBoolean4390 = true;
		aBoolean4355 = false;
		anInt4374 = -2;
		aBoolean4391 = true;
		aBoolean4406 = false;
		anInt4385 = 100;
		anInt4407 = -2;
		anInt4395 = 100;
		aBoolean4375 = true;
		anInt4413 = -1;
		aBoolean4350 = false;
		anInt4411 = -1;
		anInt4419 = -1;
		aBoolean4373 = true;
		anInt4423 = 100;
	}
}
