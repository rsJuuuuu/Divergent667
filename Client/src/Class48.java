/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48
{
	protected int[] anIntArray690;
	protected boolean aBoolean691;
	protected int[] anIntArray692;
	static int anInt693;
	static EntityNode_Sub4[] anEntityNode_Sub4Array694;
	static int anInt695;
	protected int anInt696 = -1;
	static int anInt697;
	protected int anInt698;
	protected boolean aBoolean699;
	protected int[][] anIntArrayArray700;
	protected int[] anIntArray701;
	static int anInt702;
	protected boolean[] aBooleanArray703;
	static int anInt704;
	static int anInt705;
	protected int anInt706;
	protected int[] anIntArray707;
	protected int anInt708;
	static int anInt709;
	protected int anInt710;
	protected int anInt711;
	protected int[] anIntArray712;
	protected int anInt713;
	protected boolean aBoolean714;
	protected int[] anIntArray715;
	protected int anInt716;
	static int anInt717;
	protected int anInt718;
	
	final void method476(int i) {
		if (anInt718 == -1) {
			if (aBooleanArray703 != null) {
				anInt718 = 2;
			} else {
				anInt718 = 0;
			}
		}
		if (anInt698 == -1) {
			if (aBooleanArray703 == null) {
				anInt698 = 0;
			} else {
				anInt698 = 2;
			}
		}
		if (i != 2) {
			method476(-82);
		}
		anInt702++;
	}
	
	final void method477(BufferedStream buffer, int i) {
		for (;;) {
			int i_0_ = buffer.readUnsignedByte();
			if ((i_0_ ^ 0xffffffff) == -1) {
				break;
			}
			method480(i_0_, (byte) -95, buffer);
		}
		if (i == -14) {
			anInt705++;
		}
	}
	
	static final void method478(int i, byte b) {
		anInt709++;
		if ((Class151.anInt1843 ^ 0xffffffff) != (i ^ 0xffffffff)) {
			if (i == 14 || i == 15) {
				Node_Sub38_Sub32.method2897(29);
			}
			if ((i ^ 0xffffffff) != -15 && Class290_Sub7.aClass365_8135 != null) {
				Class290_Sub7.aClass365_8135.method4062(-2);
				Class290_Sub7.aClass365_8135 = null;
			}
			if (i == 3) {
				Class245.method3069(-1, CacheNode_Sub4.aClass1_9466.anInt120 != Class320_Sub15.WINDOWS_PANE_ID);
			}
			if (i == 7) {
				Class18.method266(CacheNode_Sub4.aClass1_9466.anInt112 != Class320_Sub15.WINDOWS_PANE_ID, true);
			}
			if ((i ^ 0xffffffff) == -6 || (i ^ 0xffffffff) == -14) {
				Class201.method2024((byte) -91);
			} else if ((i ^ 0xffffffff) == -7 || (i ^ 0xffffffff) == -10 && Class151.anInt1843 != 10) {
				Node_Sub38_Sub32.method2897(29);
			}
			if (Class315.method3655(Class151.anInt1843, 128)) {
				Class4.index2.anInt3795 = 2;
				Class14.index17.anInt3795 = 2;
				Class247.aClass302_3143.anInt3795 = 2;
				Class174.aClass302_2093.anInt3795 = 2;
				Class205.index19.anInt3795 = 2;
				Class262_Sub23.aClass302_7886.anInt3795 = 2;
				Node_Sub15_Sub5.aClass302_9805.anInt3795 = 2;
			}
			if (Class315.method3655(i, 128)) {
				Node_Sub29_Sub2.anInt10015 = 0;
				Class188.anInt2287 = 1;
				Class320_Sub19.anInt8388 = 1;
				Class118.anInt5407 = 0;
				Node_Sub2.anInt6937 = 0;
				Class262_Sub23.method3212(true, 1295);
				Class4.index2.anInt3795 = 1;
				Class14.index17.anInt3795 = 1;
				Class247.aClass302_3143.anInt3795 = 1;
				Class174.aClass302_2093.anInt3795 = 1;
				Class205.index19.anInt3795 = 1;
				Class262_Sub23.aClass302_7886.anInt3795 = 1;
				Node_Sub15_Sub5.aClass302_9805.anInt3795 = 1;
			}
			if (i == 12 || i == 3) {
				Node_Sub24.method2644((byte) -42);
			}
			if (b < 96) {
				anInt704 = 65;
			}
			boolean bool = i == 2 || Class26.method311(i, -5) || Class329.method3833((byte) -61, i);
			boolean bool_1_ = (Class151.anInt1843 ^ 0xffffffff) == -3 || Class26.method311(Class151.anInt1843, -5) || Class329.method3833((byte) -61, Class151.anInt1843);
			if (!bool_1_ == bool) {
				if (!bool) {
					Class166.method1746(2, -1);
					Class267.aClass266_3449.method3240(true, 0);
				} else {
					Class313.anInt4013 = Class317.anInt4038;
					if ((Class213.aNode_Sub27_2512.aClass320_Sub25_7309.method3776(false) ^ 0xffffffff) != -1) {
						Class39.method408(2, Class317.anInt4038, 0, false, Class213.aNode_Sub27_2512.aClass320_Sub25_7309.method3776(false), SeekableFile.index6, false);
						EntityNode_Sub7.method979(17285);
					} else {
						Class166.method1746(2, -1);
					}
					Class267.aClass266_3449.method3240(false, 0);
				}
			}
			if (Class315.method3655(i, 128) || (i ^ 0xffffffff) == -15 || (i ^ 0xffffffff) == -16) {
				Class93.aGraphicsToolkit1241.h();
			}
			Class151.anInt1843 = i;
		}
	}
	
	static final CacheNode_Sub2 method479(int i) {
		if (i != 1) {
			anEntityNode_Sub4Array694 = null;
		}
		anInt693++;
		CacheNode_Sub2 cachenode_sub2 = (CacheNode_Sub2) Class72.aClass158_974.method1723(13);
		if (cachenode_sub2 != null) {
			cachenode_sub2.method2160((byte) 73);
			cachenode_sub2.method2275(i ^ ~0x4f);
			return cachenode_sub2;
		}
		do {
			cachenode_sub2 = (CacheNode_Sub2) Node_Sub5.aClass158_7027.method1723(i ^ 0xc);
			if (cachenode_sub2 == null) {
				return null;
			}
			if (cachenode_sub2.method2287(13) > Class313.method3650(false)) {
				return null;
			}
			cachenode_sub2.method2160((byte) 114);
			cachenode_sub2.method2275(-106);
		} while ((cachenode_sub2.aLong7037 & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL) == -1L);
		return cachenode_sub2;
	}
	
	private final void method480(int i, byte b, BufferedStream buffer) {
		int i_2_ = -8 / ((-14 - b) / 62);
		anInt697++;
		if ((i ^ 0xffffffff) == -2) {
			int i_3_ = buffer.readUnsignedShort();
			anIntArray707 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray707[i_4_] = buffer.readUnsignedShort();
			anIntArray715 = new int[i_3_];
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
				anIntArray715[i_5_] = buffer.readUnsignedShort();
			for (int i_6_ = 0; i_3_ > i_6_; i_6_++)
				anIntArray715[i_6_] = (buffer.readUnsignedShort() << 16) - -anIntArray715[i_6_];
		} else if ((i ^ 0xffffffff) != -3) {
			if (i == 3) {
				aBooleanArray703 = new boolean[256];
				int i_7_ = buffer.readUnsignedByte();
				for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
					aBooleanArray703[buffer.readUnsignedByte()] = true;
			} else if ((i ^ 0xffffffff) == -6) {
				anInt710 = buffer.readUnsignedByte();
			} else if ((i ^ 0xffffffff) != -7) {
				if (i == 7) {
					anInt713 = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) == -9) {
					anInt708 = buffer.readUnsignedByte();
				} else if (i != 9) {
					if ((i ^ 0xffffffff) != -11) {
						if (i != 11) {
							if ((i ^ 0xffffffff) == -13) {
								int i_9_ = buffer.readUnsignedByte();
								anIntArray712 = new int[i_9_];
								for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
									anIntArray712[i_10_] = buffer.readUnsignedShort();
								for (int i_11_ = 0; i_9_ > i_11_; i_11_++)
									anIntArray712[i_11_] = (buffer.readUnsignedShort() << 16) + anIntArray712[i_11_];
							} else if (i == 13) {
								int i_12_ = buffer.readUnsignedShort();
								anIntArrayArray700 = new int[i_12_][];
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									int i_14_ = buffer.readUnsignedByte();
									if (i_14_ > 0) {
										anIntArrayArray700[i_13_] = new int[i_14_];
										anIntArrayArray700[i_13_][0] = buffer.read24BitInteger();
										for (int i_15_ = 1; i_14_ > i_15_; i_15_++)
											anIntArrayArray700[i_13_][i_15_] = buffer.readUnsignedShort();
									}
								}
							} else if ((i ^ 0xffffffff) == -15) {
								aBoolean691 = true;
							} else if ((i ^ 0xffffffff) != -16) {
								if (i != 16) {
									if (i != 18) {
										if ((i ^ 0xffffffff) == -20) {
											if (anIntArray701 == null) {
												anIntArray701 = new int[anIntArrayArray700.length];
												for (int i_16_ = 0; (anIntArrayArray700.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
													anIntArray701[i_16_] = 255;
											}
											anIntArray701[buffer.readUnsignedByte()] = buffer.readUnsignedByte();
										} else if ((i ^ 0xffffffff) == -21) {
											if (anIntArray690 == null || anIntArray692 == null) {
												anIntArray690 = new int[anIntArrayArray700.length];
												anIntArray692 = new int[anIntArrayArray700.length];
												for (int i_17_ = 0; (anIntArrayArray700.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
													anIntArray690[i_17_] = 256;
													anIntArray692[i_17_] = 256;
												}
											}
											int i_18_ = buffer.readUnsignedByte();
											anIntArray690[i_18_] = buffer.readUnsignedShort();
											anIntArray692[i_18_] = buffer.readUnsignedShort();
										}
									} else {
										aBoolean699 = true;
									}
								}
							} else {
								aBoolean714 = true;
							}
						} else {
							anInt706 = buffer.readUnsignedByte();
						}
					} else {
						anInt718 = buffer.readUnsignedByte();
					}
				} else {
					anInt698 = buffer.readUnsignedByte();
				}
			} else {
				anInt716 = buffer.readUnsignedShort();
			}
		} else {
			anInt696 = buffer.readUnsignedShort();
		}
	}
	
	static final void method481(int i) {
		anInt695++;
		Class182.method1832();
		if (i != 0) {
			anInt704 = 16;
		}
	}
	
	public static void method482(int i) {
		if (i != 0) {
			anEntityNode_Sub4Array694 = null;
		}
		anEntityNode_Sub4Array694 = null;
	}
	
	static final void method483(String string, int i, String string_19_, boolean bool, int i_20_) {
		anInt717++;
		Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660(i_20_ ^ i_20_);
		node_sub13.aPacket7113.writeByte(Plane.aClass133_3414.packetId);
		node_sub13.aPacket7113.writeShort(0);
		int i_21_ = node_sub13.aPacket7113.offset;
		node_sub13.aPacket7113.writeShort(667);
		int[] is = Class355.method4014(i_20_ ^ ~0x1522, node_sub13);
		int i_22_ = node_sub13.aPacket7113.offset;
		node_sub13.aPacket7113.writeString(string);
		node_sub13.aPacket7113.writeShort(Class170.anInt2056);
		node_sub13.aPacket7113.writeString(string_19_);
		node_sub13.aPacket7113.writeLong(Node_Sub32.aLong7385);
		node_sub13.aPacket7113.writeByte(Class35.language);
		node_sub13.aPacket7113.writeByte(Class209.aClass353_2483.anInt4344);
		EntityNode_Sub3.method941(i_20_ ^ 0x1b, node_sub13.aPacket7113);
		String string_23_ = Node_Sub38_Sub18.aString10283;
		node_sub13.aPacket7113.writeByte(string_23_ != null ? 1 : 0);
		if (string_23_ != null) {
			node_sub13.aPacket7113.writeString(string_23_);
		}
		node_sub13.aPacket7113.writeByte(i);
		node_sub13.aPacket7113.writeByte(bool ? 1 : 0);
		node_sub13.aPacket7113.offset += 7;
		node_sub13.aPacket7113.encryptXteas(is, i_22_, false, node_sub13.aPacket7113.offset);
		node_sub13.aPacket7113.method2194(node_sub13.aPacket7113.offset - i_21_, -2887);
		Class218.aClass123_2560.sendPacket(126, node_sub13);
		Node_Sub54.anInt7683 = 0;
		Node_Sub36_Sub4.anInt10073 = -3;
		Class51_Sub2.anInt9069 = 0;
		Class4.anInt124 = 1;
		if ((i ^ 0xffffffff) > -14) {
			Class255.aBoolean3218 = true;
			Class189.method1933(-9014);
		}
	}
	
	public Class48() {
		aBoolean691 = false;
		anInt706 = 2;
		anInt698 = -1;
		anInt708 = 99;
		anInt710 = 5;
		aBoolean699 = false;
		aBoolean714 = false;
		anInt713 = -1;
		anInt716 = -1;
		anInt718 = -1;
	}
}
