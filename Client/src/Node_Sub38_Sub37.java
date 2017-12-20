/* Node_Sub38_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub37 extends Node_Sub38
{
	static float aFloat10464;
	static IncommingPacket aClass192_10465 = new IncommingPacket(105, -1);
	static Plane[] aPlaneArray10466;
	static int anInt10467;
	static int anInt10468;
	static int anInt10469;
	static int anInt10470;
	static int anInt10471;
	static int anInt10472;
	static int anInt10473;
	static int anInt10474;
	static int anInt10475;
	private int[][] anIntArrayArray10476;
	private int[] anIntArray10477;
	static int anInt10478;
	private int[] anIntArray10479;
	private short[] aShortArray10480 = new short[257];
	static int anInt10481;
	private int anInt10482 = 0;
	
	private final void method2905(int i) {
		anInt10478++;
		int[] is = anIntArrayArray10476[0];
		int[] is_0_ = anIntArrayArray10476[1];
		int[] is_1_ = anIntArrayArray10476[i + anIntArrayArray10476.length];
		int[] is_2_ = anIntArrayArray10476[-1 + anIntArrayArray10476.length];
		anIntArray10479 = new int[] { -is_0_[0] - (-is[0] - is[0]), -is_0_[1] - -is[1] + is[1] };
		anIntArray10477 = new int[] { -is_2_[0] - (-is_1_[0] - is_1_[0]), is_1_[1] + (-is_2_[1] + is_1_[1]) };
	}
	
	final void method2785(int i) {
		if (anIntArrayArray10476 == null) {
			anIntArrayArray10476 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (i == 7) {
			anInt10472++;
			if (anIntArrayArray10476.length < 2) {
				throw new RuntimeException("Curve operation requires at least two markers");
			}
			if ((anInt10482 ^ 0xffffffff) == -3) {
				method2905(i ^ ~0x6);
			}
			Node_Sub37.method2772((byte) 54);
			method2909(false);
		}
	}
	
	public static void method2906(byte b) {
		aPlaneArray10466 = null;
		if (b >= -50) {
			method2908((byte) -85, null, -18);
		}
		aClass192_10465 = null;
	}
	
	final int[] method2775(int i, int i_3_) {
		anInt10475++;
		int[] is = aClass146_7460.method1645(27356, i_3_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_4_ = this.method2786(i_3_, 0, 0);
			for (int i_5_ = 0; i_5_ < Class339_Sub7.anInt8728; i_5_++) {
				int i_6_ = is_4_[i_5_] >> 4;
				if ((i_6_ ^ 0xffffffff) > -1) {
					i_6_ = 0;
				}
				if ((i_6_ ^ 0xffffffff) < -257) {
					i_6_ = 256;
				}
				is[i_5_] = aShortArray10480[i_6_];
			}
		}
		if (i <= 107) {
			anInt10473 = 6;
		}
		return is;
	}
	
	static final void method2907(int i, int i_7_, Class121 class121, int i_8_, int i_9_, int i_10_) {
		if (i_7_ != -14347) {
			method2906((byte) -91);
		}
		anInt10467++;
		if ((i_10_ ^ 0xffffffff) <= -2 && i_8_ >= 1 && (i_10_ ^ 0xffffffff) >= (Node_Sub54.GAME_SCENE_WDITH - 2 ^ 0xffffffff) && Class377_Sub1.GAME_SCENE_HEIGHT - 2 >= i_8_) {
			if (Class175.aClass261ArrayArrayArray2099 != null) {
				Interface19 interface19 = Node_Sub38_Sub1.aClass277_Sub1_10084.method3354(i_10_, i_8_, i_9_, i, 10675);
				if (interface19 != null) {
					if (interface19 instanceof Mobile_Sub3) {
						((Mobile_Sub3) interface19).method906(-113, class121);
					} else if (!(interface19 instanceof Animable_Sub1_Sub2)) {
						if (!(interface19 instanceof Animable_Sub2_Sub1)) {
							if (interface19 instanceof Animable_Sub4_Sub2) {
								((Animable_Sub4_Sub2) interface19).method933(class121, (byte) 104);
							}
						} else {
							((Animable_Sub2_Sub1) interface19).method839(class121, 3);
						}
					} else {
						((Animable_Sub1_Sub2) interface19).method833(class121, -100);
					}
				}
			}
		}
	}
	
	public Node_Sub38_Sub37() {
		super(1, true);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10468++;
		if (bool != false) {
			aPlaneArray10466 = null;
		}
		if ((i ^ 0xffffffff) == -1) {
			anInt10482 = buffer.readUnsignedByte();
			anIntArrayArray10476 = new int[buffer.readUnsignedByte()][2];
			for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anIntArrayArray10476.length ^ 0xffffffff); i_11_++) {
				anIntArrayArray10476[i_11_][0] = buffer.readUnsignedShort();
				anIntArrayArray10476[i_11_][1] = buffer.readUnsignedShort();
			}
		}
	}
	
	static final void method2908(byte b, Node_Sub4 node_sub4, int i) {
		anInt10470++;
		Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false);
		if (node_sub4 == null) {
			Class320_Sub2.method3685(b + -185);
		}
		AnimableAnimator.aClass42_5498.method451((byte) -50);
		if (b != 66) {
			method2912(null, true);
		}
		GLToolkit.method1484(26365, node_sub4);
	}
	
	private final void method2909(boolean bool) {
		anInt10471++;
		int i = anInt10482;
	while_267_:
		do {
			do {
				if (i != 2) {
					if (i != 1) {
						break;
					}
				} else {
					for (i = 0; (i ^ 0xffffffff) > -258; i++) {
						int i_12_ = i << 4;
						int i_13_;
						for (i_13_ = 1; (-1 + anIntArrayArray10476.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
							if ((i_12_ ^ 0xffffffff) > (anIntArrayArray10476[i_13_][0] ^ 0xffffffff)) {
								break;
							}
						}
						int[] is = anIntArrayArray10476[-1 + i_13_];
						int[] is_14_ = anIntArrayArray10476[i_13_];
						int i_15_ = method2910(-1, i_13_ - 2)[1];
						int i_16_ = is[1];
						int i_17_ = is_14_[1];
						int i_18_ = method2910(-1, 1 + i_13_)[1];
						int i_19_ = (-is[0] + i_12_ << 12) / (-is[0] + is_14_[0]);
						int i_20_ = i_19_ * i_19_ >> 12;
						int i_21_ = -i_15_ + i_18_ - (i_17_ - i_16_);
						int i_22_ = i_15_ + -i_16_ + -i_21_;
						int i_23_ = i_17_ - i_15_;
						int i_24_ = i_16_;
						int i_25_ = i_20_ * (i_21_ * i_19_ >> 12) >> 12;
						int i_26_ = i_20_ * i_22_ >> 12;
						int i_27_ = i_23_ * i_19_ >> 12;
						int i_28_ = i_27_ + i_26_ + (i_25_ + i_24_);
						if ((i_28_ ^ 0xffffffff) >= 32767) {
							i_28_ = -32767;
						}
						if ((i_28_ ^ 0xffffffff) <= -32769) {
							i_28_ = 32767;
						}
						aShortArray10480[i] = (short) i_28_;
					}
					break while_267_;
				}
				for (i = 0; i < 257; i++) {
					int i_29_ = i << 4;
					int i_30_;
					for (i_30_ = 1; i_30_ < anIntArrayArray10476.length + -1; i_30_++) {
						if ((anIntArrayArray10476[i_30_][0] ^ 0xffffffff) < (i_29_ ^ 0xffffffff)) {
							break;
						}
					}
					int[] is = anIntArrayArray10476[i_30_ - 1];
					int[] is_31_ = anIntArrayArray10476[i_30_];
					int i_32_ = (i_29_ - is[0] << 12) / (-is[0] + is_31_[0]);
					int i_33_ = 4096 - Class17.anIntArray277[(0x1fff & i_32_) >> 5] >> 1;
					int i_34_ = -i_33_ + 4096;
					int i_35_ = i_33_ * is_31_[1] + i_34_ * is[1] >> 12;
					if ((i_35_ ^ 0xffffffff) >= 32767) {
						i_35_ = -32767;
					}
					if ((i_35_ ^ 0xffffffff) <= -32769) {
						i_35_ = 32767;
					}
					aShortArray10480[i] = (short) i_35_;
				}
				break while_267_;
			} while (false);
			for (i = 0; (i ^ 0xffffffff) > -258; i++) {
				int i_36_ = i << -1753698556;
				int i_37_;
				for (i_37_ = 1; (i_37_ ^ 0xffffffff) > (anIntArrayArray10476.length + -1 ^ 0xffffffff); i_37_++) {
					if (i_36_ < anIntArrayArray10476[i_37_][0]) {
						break;
					}
				}
				int[] is = anIntArrayArray10476[-1 + i_37_];
				int[] is_38_ = anIntArrayArray10476[i_37_];
				int i_39_ = (-is[0] + i_36_ << 12) / (is_38_[0] + -is[0]);
				int i_40_ = -i_39_ + 4096;
				int i_41_ = i_39_ * is_38_[1] + i_40_ * is[1] >> 12;
				if ((i_41_ ^ 0xffffffff) >= 32767) {
					i_41_ = -32767;
				}
				if ((i_41_ ^ 0xffffffff) <= -32769) {
					i_41_ = 32767;
				}
				aShortArray10480[i] = (short) i_41_;
			}
		} while (false);
		if (bool != false) {
			anIntArrayArray10476 = null;
		}
	}
	
	private final int[] method2910(int i, int i_42_) {
		anInt10469++;
		if ((i_42_ ^ 0xffffffff) > i) {
			return anIntArray10479;
		}
		if (i_42_ >= anIntArrayArray10476.length) {
			return anIntArray10477;
		}
		return anIntArrayArray10476[i_42_];
	}
	
	static final boolean method2911(int i, byte b, int i_43_, int i_44_) {
		anInt10481++;
		Class57.aClass336_850.method3853(i_44_, i_43_, i, Node_Sub9_Sub1.anIntArray9686);
		int i_45_ = Node_Sub9_Sub1.anIntArray9686[2];
		if ((i_45_ ^ 0xffffffff) > -51) {
			return false;
		}
		Node_Sub9_Sub1.anIntArray9686[0] = Node_Sub9_Sub1.anIntArray9686[0] * aa.anInt100 / i_45_ + Class290_Sub6.anInt8124;
		if (b != 1) {
			return false;
		}
		Node_Sub9_Sub1.anIntArray9686[2] = i_45_;
		Node_Sub9_Sub1.anIntArray9686[1] = Class219.anInt2624 + OutputStream_Sub2.anInt96 * Node_Sub9_Sub1.anIntArray9686[1] / i_45_;
		return true;
	}
	
	static final void method2912(String string, boolean bool) {
		anInt10474++;
		if (string != null) {
			if ((Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) <= -201 && !Class64.aBoolean5046 || Node_Sub38_Sub14.anInt10242 >= 200) {
				Class41.method436(29459, Class22.aClass22_374.method297(Class35.language), 4);
			} else {
				String string_46_ = Node_Sub25_Sub3.method2671(-13472, string);
				if (string_46_ != null) {
					for (int i = 0; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						String string_47_ = Node_Sub25_Sub3.method2671(-13472, Class262_Sub12.aStringArray7793[i]);
						if (string_47_ != null && string_47_.equals(string_46_)) {
							Class41.method436(29459, string + Class22.aClass22_401.method297(Class35.language), 4);
							return;
						}
						if (Plane.aStringArray3403[i] != null) {
							String string_48_ = Node_Sub25_Sub3.method2671(-13472, Plane.aStringArray3403[i]);
							if (string_48_ != null && string_48_.equals(string_46_)) {
								Class41.method436(29459, string + Class22.aClass22_401.method297(Class35.language), 4);
								return;
							}
						}
					}
					for (int i = 0; (i ^ 0xffffffff) > (Class235.anInt5122 ^ 0xffffffff); i++) {
						String string_49_ = Node_Sub25_Sub3.method2671(-13472, Class338.aStringArray4197[i]);
						if (string_49_ != null && string_49_.equals(string_46_)) {
							Class41.method436(29459, Class22.aClass22_406.method297(Class35.language) + string + Class22.aClass22_407.method297(Class35.language), 4);
							return;
						}
						if (Class7.aStringArray164[i] != null) {
							String string_50_ = Node_Sub25_Sub3.method2671(-13472, Class7.aStringArray164[i]);
							if (string_50_ != null && string_50_.equals(string_46_)) {
								Class41.method436(29459, Class22.aClass22_406.method297(Class35.language) + string + Class22.aClass22_407.method297(Class35.language), 4);
								return;
							}
						}
					}
					if (Node_Sub25_Sub3.method2671(-13472, Class295.myPlayer.username).equals(string_46_)) {
						Class41.method436(29459, Class22.aClass22_404.method297(Class35.language), 4);
					} else {
						Class76.anInt1013++;
						if (bool != true) {
							aFloat10464 = -0.48604336F;
						}
						Class123 class123 = Class262_Sub23.method3213((byte) -100);
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub51.aClass318_7630, class123.anIsaacCipher1571);
						node_sub13.aPacket7113.writeByte(Class126.method1536(-20826, string));
						node_sub13.aPacket7113.writeString(string);
						class123.sendPacket(127, node_sub13);
					}
				}
			}
		}
	}
}
