/* Class194_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194_Sub2 extends Class194
{
	static int anInt6896;
	static OutcommingPacket aClass318_6897 = new OutcommingPacket(59, -1);
	static int anInt6898;
	static MainFile aClass6_6899;
	
	static final void method1970(int i) {
		Class167.anInt2033 = 0;
		Class239.aBoolean2930 = false;
		Node_Sub25_Sub2.aClass54Array9959 = new Class54[500];
		if (i <= 15) {
			method1972(-74);
		}
		Class83.anInt5183 = 0;
		Class240.anIntArrayArrayArray2948 = new int[Class159.anInt1995][1 + Class328.anInt4115][Node_Sub50.anInt7623 - -1];
		Class134_Sub4.anInt9047 = Class179.anInt2129;
		anInt6896++;
		Node_Sub38_Sub6.anInt10139 = Class179.anInt2129;
		NpcDefinition.anInt2885 = 0;
		GLXToolkit.aClass54Array9292 = new Class54[2000];
		IsaacCipher.aClass54Array1840 = new Class54[1000];
		Class320_Sub21.anInt8406 = 0;
		Node_Sub44.aClass54Array7548 = new Class54[500];
        Class12.aBoolean194 = !(CacheNode_Sub18.aGraphicsToolkit9607 instanceof oa);
	}
	
	public static void method1971(byte b) {
		@SuppressWarnings("unused")
		int i = 114 % ((75 - b) / 34);
		aClass6_6899 = null;
		aClass318_6897 = null;
	}
	
	static final void method1972(int i) {
		anInt6898++;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub4_7304.method3694(false) ^ 0xffffffff) == -3) {
			byte b = (byte) (Class110.anInt1412 + -i & 0xff);
			int i_0_ = Class110.anInt1412 % Node_Sub54.GAME_SCENE_WDITH;
			for (int i_1_ = 0; i_1_ < 4; i_1_++) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff); i_2_++)
					Node_Sub38_Sub15.aByteArrayArrayArray10261[i_1_][i_0_][i_2_] = b;
			}
			if ((CacheNode_Sub20_Sub1.myPlayerPlane ^ 0xffffffff) != -4) {
				for (int i_3_ = 0; i_3_ < 2; i_3_++) {
					Class259.anIntArray3296[i_3_] = -1000000;
					MainFile.anIntArray135[i_3_] = 1000000;
					Class246.anIntArray3107[i_3_] = 0;
					Class362.anIntArray4497[i_3_] = 1000000;
					Class84.anIntArray1147[i_3_] = 0;
				}
				int i_4_ = Class295.myPlayer.anInt5934;
				int i_5_ = Class295.myPlayer.anInt5940;
				if ((Class320_Sub22.anInt8415 ^ 0xffffffff) == -2 || Class367.anInt4541 != -1) {
					if (Class320_Sub22.anInt8415 != 1) {
						i_4_ = Class367.anInt4541;
						i_5_ = Class368.anInt4551;
					}
					if ((CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_4_ >> 9][i_5_ >> 9] & 0x4) != 0) {
						Node_Sub38_Sub19.method2849(-85, i_5_ >> 9, Class175.aClass261ArrayArrayArray2099, 0, i_4_ >> 9, false);
					}
					if (OutcommingPacket.anInt4050 < 2560) {
						int i_6_ = Class98.anInt5061 >> 9;
						int i_7_ = Node_Sub10.anInt7079 >> 9;
						int i_8_ = i_4_ >> 9;
						int i_9_ = i_5_ >> 9;
						int i_10_;
						if (i_8_ > i_6_) {
							i_10_ = -i_6_ + i_8_;
						} else {
							i_10_ = i_6_ - i_8_;
						}
						int i_11_;
						if ((i_7_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
							i_11_ = -i_7_ + i_9_;
						} else {
							i_11_ = i_7_ + -i_9_;
						}
						if (i_10_ == 0 && (i_11_ ^ 0xffffffff) == -1 || (i_10_ ^ 0xffffffff) >= (-Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) || i_10_ >= Node_Sub54.GAME_SCENE_WDITH || (-Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) <= (i_11_ ^ 0xffffffff) || (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) >= (i_11_ ^ 0xffffffff)) {
							ClanChat.method507(null, "RC: " + i_6_ + "," + i_7_ + " " + i_8_ + "," + i_9_ + " " + Node_Sub53.gameSceneBaseX + "," + Class320_Sub4.gameSceneBaseY, -115);
						} else if (i_10_ <= i_11_) {
							int i_12_ = 65536 * i_10_ / i_11_;
							int i_13_ = 32768;
							while (i_9_ != i_7_) {
								if ((i_9_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
									i_7_++;
								} else if (i_9_ < i_7_) {
									i_7_--;
								}
								if ((CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_6_][i_7_] & 0x4) != 0) {
									Node_Sub38_Sub19.method2849(-38, i_7_, Class175.aClass261ArrayArrayArray2099, 1, i_6_, false);
									break;
								}
								i_13_ += i_12_;
								if ((i_13_ ^ 0xffffffff) <= -65537) {
									i_13_ -= 65536;
									if (i_6_ >= i_8_) {
										if ((i_6_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
											i_6_--;
										}
									} else {
										i_6_++;
									}
									if ((0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_6_][i_7_]) != 0) {
										Node_Sub38_Sub19.method2849(99, i_7_, Class175.aClass261ArrayArrayArray2099, 1, i_6_, false);
										break;
									}
								}
							}
						} else {
							int i_14_ = i_11_ * 65536 / i_10_;
							int i_15_ = 32768;
							while ((i_8_ ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
								if (i_6_ < i_8_) {
									i_6_++;
								} else if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
									i_6_--;
								}
								if ((0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_6_][i_7_]) != 0) {
									Node_Sub38_Sub19.method2849(109, i_7_, Class175.aClass261ArrayArrayArray2099, 1, i_6_, false);
									break;
								}
								i_15_ += i_14_;
								if ((i_15_ ^ 0xffffffff) <= -65537) {
									if (i_9_ > i_7_) {
										i_7_++;
									} else if ((i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
										i_7_--;
									}
									i_15_ -= 65536;
									if ((0x4 & CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][i_6_][i_7_] ^ 0xffffffff) != -1) {
										Node_Sub38_Sub19.method2849(98, i_7_, Class175.aClass261ArrayArrayArray2099, 1, i_6_, false);
										break;
									}
								}
							}
						}
					}
				} else {
					int i_16_ = Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Node_Sub10.anInt7079, Class98.anInt5061);
					if ((i_16_ + -Class190.anInt2331 ^ 0xffffffff) > -3201 && (CacheNode_Sub11.aByteArrayArrayArray9550[CacheNode_Sub20_Sub1.myPlayerPlane][Class98.anInt5061 >> 9][Node_Sub10.anInt7079 >> 9] & 0x4 ^ 0xffffffff) != -1) {
						Node_Sub38_Sub19.method2849(-39, Node_Sub10.anInt7079 >> 9, Class175.aClass261ArrayArrayArray2099, 1, Class98.anInt5061 >> 9, false);
					}
				}
			}
		}
	}
}
