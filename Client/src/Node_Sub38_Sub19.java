/* Node_Sub38_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub19 extends Node_Sub38
{
	static Class78[] aClass78Array10284 = new Class78[50];
	static int anInt10285;
	static Index aClass302_10286;
	private boolean aBoolean10287;
	static int anInt10288;
	static int anInt10289;
	private int anInt10290 = 4096;
	static int anInt10291;
	static int[] OUTSIDE_PLAYERS_INDEXES = new int[2048];
	static int anInt10293;
	static int anInt10294;
	static float aFloat10295;
	static int anInt10296 = -1;
	
	static final void method2847(int i, CacheNode cachenode, CacheNode cachenode_0_) {
		anInt10293++;
		if (cachenode_0_.aCacheNode7036 != null) {
			cachenode_0_.method2275(-118);
		}
		cachenode_0_.aCacheNode7035 = cachenode.aCacheNode7035;
		cachenode_0_.aCacheNode7036 = cachenode;
		cachenode_0_.aCacheNode7036.aCacheNode7035 = cachenode_0_;
		cachenode_0_.aCacheNode7035.aCacheNode7036 = cachenode_0_;
		if (i != 255) {
			method2851(2, 99, 72, (byte) 57, -126, -32);
		}
	}
	
	public Node_Sub38_Sub19() {
		super(1, false);
		aBoolean10287 = true;
	}
	
	public static void method2848(int i) {
		OUTSIDE_PLAYERS_INDEXES = null;
		aClass302_10286 = null;
		if (i < 92) {
			aClass78Array10284 = null;
		}
		aClass78Array10284 = null;
	}
	
	static final boolean method2849(int i, int i_1_, Class261[][][] class261s, int i_2_, int i_3_, boolean bool) {
		anInt10285++;
		@SuppressWarnings("unused")
		int i_4_ = 82 / ((i - 38) / 54);
		byte b = !bool ? (byte) (Class110.anInt1412 & 0xff) : (byte) 1;
		if ((Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_3_][i_1_] ^ 0xffffffff) == (b ^ 0xffffffff)) {
			return false;
		}
		if ((0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_3_][i_1_]) == 0) {
			return false;
		}
		int i_5_ = 0;
		Node_Sub38_Sub11.anIntArray10218[i_5_] = i_3_;
		int i_6_ = 0;
		Animable_Sub2_Sub1.anIntArray10638[i_5_++] = i_1_;
		Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_3_][i_1_] = b;
		while ((i_6_ ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
			int i_7_ = 0xffff & Node_Sub38_Sub11.anIntArray10218[i_6_];
			int i_8_ = 0xff & Node_Sub38_Sub11.anIntArray10218[i_6_] >> 16;
			int i_9_ = Node_Sub38_Sub11.anIntArray10218[i_6_] >> 24 & 0xff;
			int i_10_ = Animable_Sub2_Sub1.anIntArray10638[i_6_] & 0xffff;
			int i_11_ = (Animable_Sub2_Sub1.anIntArray10638[i_6_] & 0xff5da6) >> 16;
			i_6_ = i_6_ + 1 & 0xfff;
			boolean bool_12_ = false;
			if ((CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] & 0x4 ^ 0xffffffff) == -1) {
				bool_12_ = true;
			}
			boolean bool_13_ = false;
			if (class261s != null) {
				int i_14_ = CacheNode_Sub20_Sub1.myPlayerPlane + 1;
			while_186_:
				for (/**/; (i_14_ ^ 0xffffffff) >= -4; i_14_++) {
					if (class261s[i_14_] != null && (CacheNode_Sub11.aByteArrayArrayArray9550[i_14_][i_7_][i_10_] & 0x8) == 0) {
						if (bool_12_ && class261s[i_14_][i_7_][i_10_] != null) {
							if (class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3314 != null) {
								int i_15_ = Class130.method1559(-125, i_8_);
								if ((class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3314.aShort9110 ^ 0xffffffff) == (i_15_ ^ 0xffffffff) || class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308 != null && i_15_ == class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308.aShort9110) {
									continue;
								}
								if ((i_9_ ^ 0xffffffff) != -1) {
									int i_16_ = Class130.method1559(-124, i_9_);
									if (class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3314.aShort9110 == i_16_ || class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308 != null && (i_16_ ^ 0xffffffff) == (class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308.aShort9110 ^ 0xffffffff)) {
										continue;
									}
								}
								if (i_11_ != 0) {
									int i_17_ = Class130.method1559(-125, i_11_);
									if (class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3314.aShort9110 == i_17_ || class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308 != null && (class261s[i_14_][i_7_][i_10_].anAnimable_Sub2_3308.aShort9110 ^ 0xffffffff) == (i_17_ ^ 0xffffffff)) {
										continue;
									}
								}
							}
							Class261 class261 = class261s[i_14_][i_7_][i_10_];
							if (class261.aClass256_3312 != null) {
								for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
									Mobile mobile = class256.aMobile3239;
									if (mobile instanceof Interface19) {
										Interface19 interface19 = (Interface19) mobile;
										int i_18_ = interface19.method71(-118);
										int i_19_ = interface19.method68(23796);
										if ((i_18_ ^ 0xffffffff) == -22) {
											i_18_ = 19;
										}
										int i_20_ = i_18_ | i_19_ << 6;
										if ((i_20_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff) || i_9_ != 0 && i_9_ == i_20_ || (i_11_ ^ 0xffffffff) != -1 && (i_20_ ^ 0xffffffff) == (i_11_ ^ 0xffffffff)) {
											continue while_186_;
										}
									}
								}
							}
						}
						Class261 class261 = class261s[i_14_][i_7_][i_10_];
						if (class261 != null && class261.aClass256_3312 != null) {
							for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
								Mobile mobile = class256.aMobile3239;
								if (mobile.aShort9130 != mobile.aShort9119 || mobile.aShort9120 != mobile.aShort9124) {
									for (int i_21_ = mobile.aShort9119; (i_21_ ^ 0xffffffff) >= (mobile.aShort9130 ^ 0xffffffff); i_21_++) {
										for (int i_22_ = mobile.aShort9120; (i_22_ ^ 0xffffffff) >= (mobile.aShort9124 ^ 0xffffffff); i_22_++)
											Node_Sub38_Sub15.aByteArrayArrayArray10261[i_14_][i_21_][i_22_] = b;
									}
								}
							}
						}
						Node_Sub38_Sub15.aByteArrayArrayArray10261[i_14_][i_7_][i_10_] = b;
						bool_13_ = true;
					}
				}
			}
			if (bool_13_) {
				int i_23_ = Class320_Sub10.aPlaneArray8300[CacheNode_Sub20_Sub1.myPlayerPlane - -1].method3251(i_10_, i_7_, (byte) -118);
				if ((Class259.anIntArray3296[i_2_] ^ 0xffffffff) > (i_23_ ^ 0xffffffff)) {
					Class259.anIntArray3296[i_2_] = i_23_;
				}
				int i_24_ = i_7_ << 9;
				int i_25_ = i_10_ << 9;
				if (MainFile.anIntArray135[i_2_] <= i_24_) {
					if ((Class246.anIntArray3107[i_2_] ^ 0xffffffff) > (i_24_ ^ 0xffffffff)) {
						Class246.anIntArray3107[i_2_] = i_24_;
					}
				} else {
					MainFile.anIntArray135[i_2_] = i_24_;
				}
				if (i_25_ < Class362.anIntArray4497[i_2_]) {
					Class362.anIntArray4497[i_2_] = i_25_;
				} else if ((i_25_ ^ 0xffffffff) < (Class84.anIntArray1147[i_2_] ^ 0xffffffff)) {
					Class84.anIntArray1147[i_2_] = i_25_;
				}
			}
			if (!bool_12_) {
				if ((i_7_ ^ 0xffffffff) <= -2 && b != Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][-1 + i_7_][i_10_]) {
					Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(-754974720, Node_Sub16.method2590(1179648, -1 + i_7_));
					Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(1245184, i_10_);
					Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + -1][i_10_] = b;
					i_5_ = 1 + i_5_ & 0xfff;
				}
				if (++i_10_ < Class377_Sub1.GAME_SCENE_HEIGHT) {
					if ((i_7_ - 1 ^ 0xffffffff) <= -1 && (b ^ 0xffffffff) != (Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][-1 + i_7_][i_10_] ^ 0xffffffff) && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] & 0x4 ^ 0xffffffff) == -1 && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + -1][-1 + i_10_] & 0x4 ^ 0xffffffff) == -1) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(Node_Sub16.method2590(-1 + i_7_, 1179648), 1375731712);
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(i_10_, 1245184);
						i_5_ = i_5_ - -1 & 0xfff;
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ - 1][i_10_] = b;
					}
					if (b != Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_]) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(318767104, Node_Sub16.method2590(5373952, i_7_));
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(i_10_, 5439488);
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] = b;
						i_5_ = i_5_ + 1 & 0xfff;
					}
					if (Node_Sub54.GAME_SCENE_WDITH > 1 + i_7_ && b != Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + 1][i_10_] && (0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] ^ 0xffffffff) == -1 && (0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][1 + i_7_][i_10_ - 1]) == 0) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(-1845493760, Node_Sub16.method2590(5373952, 1 + i_7_));
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(5439488, i_10_);
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + 1][i_10_] = b;
						i_5_ = 1 + i_5_ & 0xfff;
					}
				}
				i_10_--;
				if (i_7_ - -1 < Node_Sub54.GAME_SCENE_WDITH && Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + 1][i_10_] != b) {
					Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(Node_Sub16.method2590(9568256, 1 + i_7_), 1392508928);
					Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(9633792, i_10_);
					Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + 1][i_10_] = b;
					i_5_ = 1 + i_5_ & 0xfff;
				}
				if (--i_10_ >= 0) {
					if (i_7_ - 1 >= 0 && (Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ - 1][i_10_] ^ 0xffffffff) != (b ^ 0xffffffff) && (0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] ^ 0xffffffff) == -1 && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][-1 + i_7_][i_10_ + 1] & 0x4) == 0) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(Node_Sub16.method2590(13762560, i_7_ + -1), 301989888);
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(i_10_, 13828096);
						i_5_ = i_5_ - -1 & 0xfff;
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][-1 + i_7_][i_10_] = b;
					}
					if ((Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] ^ 0xffffffff) != (b ^ 0xffffffff)) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(-1828716544, Node_Sub16.method2590(13762560, i_7_));
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(13828096, i_10_);
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] = b;
						i_5_ = 1 + i_5_ & 0xfff;
					}
					if (i_7_ + 1 < Node_Sub54.GAME_SCENE_WDITH && (Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ + 1][i_10_] ^ 0xffffffff) != (b ^ 0xffffffff) && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_][i_10_] & 0x4) == 0 && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_7_ - -1][1 + i_10_] & 0x4) == 0) {
						Node_Sub38_Sub11.anIntArray10218[i_5_] = Node_Sub16.method2590(Node_Sub16.method2590(i_7_ + 1, 9568256), -771751936);
						Animable_Sub2_Sub1.anIntArray10638[i_5_] = Node_Sub16.method2590(i_10_, 9633792);
						Node_Sub38_Sub15.aByteArrayArrayArray10261[CacheNode_Sub20_Sub1.myPlayerPlane][1 + i_7_][i_10_] = b;
						i_5_ = 0xfff & i_5_ + 1;
					}
				}
			}
		}
		if ((Class259.anIntArray3296[i_2_] ^ 0xffffffff) != 999999) {
			Class259.anIntArray3296[i_2_] += 40;
			MainFile.anIntArray135[i_2_] -= 512;
			Class246.anIntArray3107[i_2_] += 512;
			Class84.anIntArray1147[i_2_] += 512;
			Class362.anIntArray4497[i_2_] -= 512;
		}
		return true;
	}
	
	static final void method2850(int i, int i_26_, int i_27_, boolean bool, int i_28_) {
		Class34_Sub1.method378(-4);
		anInt10288++;
		Class320_Sub13.aLong8339 = 0L;
		int i_29_ = Class188_Sub2_Sub1.getDisplayMode(i);
		if ((i_26_ ^ 0xffffffff) == -4 || i_29_ == 3) {
			bool = true;
		}
		if (!Class93.aGraphicsToolkit1241.b()) {
			bool = true;
		}
		Class194.method1962(i_29_, i_28_, i_26_, 81, i_27_, bool);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool == false) {
			anInt10291++;
			int i_30_ = i;
			do {
				if ((i_30_ ^ 0xffffffff) != -1) {
					if ((i_30_ ^ 0xffffffff) != -2) {
						break;
					}
				} else {
					anInt10290 = buffer.readUnsignedShort();
					break;
				}
				aBoolean10287 = buffer.readUnsignedByte() == 1;
			} while (false);
		}
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10289++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[] is_31_ = this.method2786(-1 + i & r_Sub2.anInt11054, 0, 0);
			int[] is_32_ = this.method2786(i, 0, 0);
			int[] is_33_ = this.method2786(1 + i & r_Sub2.anInt11054, 0, 0);
			int[] is_34_ = is[0];
			int[] is_35_ = is[1];
			int[] is_36_ = is[2];
			for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_37_++) {
				int i_38_ = (is_33_[i_37_] - is_31_[i_37_]) * anInt10290;
				int i_39_ = anInt10290 * (-is_32_[i_37_ - 1 & Class303.anInt3824] + is_32_[Class303.anInt3824 & i_37_ - -1]);
				int i_40_ = i_39_ >> 12;
				int i_41_ = i_38_ >> 12;
				int i_42_ = i_40_ * i_40_ >> 12;
				int i_43_ = i_41_ * i_41_ >> 12;
				int i_44_ = (int) (Math.sqrt((double) ((float) (i_43_ + (i_42_ + 4096)) / 4096.0F)) * 4096.0);
				int i_45_;
				int i_46_;
				int i_47_;
				if (i_44_ == 0) {
					i_46_ = 0;
					i_47_ = 0;
					i_45_ = 0;
				} else {
					i_45_ = 16777216 / i_44_;
					i_46_ = i_38_ / i_44_;
					i_47_ = i_39_ / i_44_;
				}
				if (aBoolean10287) {
					i_47_ = 2048 + (i_47_ >> 1);
					i_45_ = (i_45_ >> 1) + 2048;
					i_46_ = (i_46_ >> 1) + 2048;
				}
				is_34_[i_37_] = i_47_;
				is_35_[i_37_] = i_46_;
				is_36_[i_37_] = i_45_;
			}
		}
		if (bool != true) {
			return null;
		}
		return is;
	}
	
	static final void method2851(int i, int i_48_, int i_49_, byte b, int i_50_, int i_51_) {
		anInt10294++;
		int i_52_ = -i_51_ + i_50_;
		int i_53_ = -i + i_48_;
		if (i_53_ != 0) {
			if (i_52_ == 0) {
				Class320_Sub13.method3732(i_51_, i_48_, 0, i_49_, i);
				return;
			}
		} else {
			if ((i_52_ ^ 0xffffffff) != -1) {
				Class50.method511(i_50_, i_51_, i_49_, i, 1);
			}
			return;
		}
		if ((i_53_ ^ 0xffffffff) > -1) {
			i_53_ = -i_53_;
		}
		if (i_52_ < 0) {
			i_52_ = -i_52_;
		}
		boolean bool = i_52_ > i_53_;
		if (bool) {
			int i_54_ = i;
			int i_55_ = i_48_;
			i = i_51_;
			i_51_ = i_54_;
			i_48_ = i_50_;
			i_50_ = i_55_;
		}
		if (b >= 126) {
			if ((i ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) {
				int i_56_ = i;
				i = i_48_;
				int i_57_ = i_51_;
				i_51_ = i_50_;
				i_48_ = i_56_;
				i_50_ = i_57_;
			}
			int i_58_ = i_51_;
			int i_59_ = i_48_ + -i;
			int i_60_ = i_50_ - i_51_;
			int i_61_ = -(i_59_ >> 1);
			int i_62_ = i_50_ > i_51_ ? 1 : -1;
			if (i_60_ < 0) {
				i_60_ = -i_60_;
			}
			if (bool) {
				for (int i_63_ = i; i_48_ >= i_63_; i_63_++) {
					Class169_Sub4.anIntArrayArray8826[i_63_][i_58_] = i_49_;
					i_61_ += i_60_;
					if (i_61_ > 0) {
						i_61_ -= i_59_;
						i_58_ += i_62_;
					}
				}
			} else {
				for (int i_64_ = i; i_64_ <= i_48_; i_64_++) {
					Class169_Sub4.anIntArrayArray8826[i_58_][i_64_] = i_49_;
					i_61_ += i_60_;
					if (i_61_ > 0) {
						i_61_ -= i_59_;
						i_58_ += i_62_;
					}
				}
			}
		}
	}
}
