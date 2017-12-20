/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class132
{
	static Class52 aClass52_1673;
	protected int anInt1674;
	static int anInt1675;
	static int anInt1676;
	static Thread aThread1677;
	static int anInt1678;
	protected int anInt1679;
	static int anInt1680;
	static int anInt1681;
	static int[] anIntArray1682;
	protected int anInt1683;
	static int anInt1684 = 0;
	
	static final int method1560(byte b, Class139 class139) {
		anInt1680++;
		@SuppressWarnings("unused")
		int i = -117 % ((-61 - b) / 41);
		if (class139 != IsaacCipher.aClass139_1829) {
			if (Class191.aClass139_2349 == class139) {
				return 34065;
			}
			if (Class168.aClass139_2042 == class139) {
				return 34066;
			}
		} else {
			return 9216;
		}
		throw new IllegalArgumentException();
	}
	
	static final boolean method1561(int i) {
		anInt1681++;
		if (i != -1) {
			return false;
		}
        return (Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) != -1;
    }
	
	public static void method1562(int i) {
		aClass52_1673 = null;
		aThread1677 = null;
		anIntArray1682 = null;
		if (i != 27307) {
			aThread1677 = null;
		}
	}
	
	static final void method1563(int i) {
		if (i < 32) {
			method1560((byte) -33, null);
		}
		anInt1675++;
		Class277.aCacheNode_Sub13_3509 = new CacheNode_Sub13(Class22.aClass22_367.method297(Class35.language), "", Class239.anInt2928, 1012, -1, 0L, 0, 0, true, false, 0L, true);
	}
	
	static final int method1564(int i, boolean bool) {
		anInt1678++;
		int i_0_ = Class320_Sub20.anInt8397;
	while_135_:
		do {
			do {
				if (i_0_ != 0) {
					if (i_0_ != 1) {
						if ((i_0_ ^ 0xffffffff) == -3) {
							break;
						}
						break while_135_;
					}
				} else {
					if (!bool) {
						return Node_Sub38_Sub1.anInt10075;
					}
					return 0;
				}
				return Node_Sub38_Sub1.anInt10075;
			} while (false);
			return 0;
		} while (false);
		if (i != 12447) {
			aClass52_1673 = null;
		}
		return 0;
	}
	
	static final void method1565(String string, int i, int i_1_) {
		anInt1676++;
		int i_2_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
		int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
		boolean bool = false;
		if (i_1_ != -28537) {
			method1561(78);
		}
		for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
			Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_3_]];
			if (player != null && Class295.myPlayer != player && player.username != null && player.username.equalsIgnoreCase(string)) {
				OutcommingPacket class318 = null;
				if (i == 1) {
					class318 = Class228.aClass318_2720;
				} else if ((i ^ 0xffffffff) != -5) {
					if ((i ^ 0xffffffff) == -6) {
						class318 = Class359.aClass318_4463;
					} else if (i == 6) {
						class318 = Class290_Sub4.aClass318_8089;
					} else if ((i ^ 0xffffffff) != -8) {
						if ((i ^ 0xffffffff) == -10) {
							class318 = CacheNode_Sub15.aClass318_9590;
						}
					} else {
						class318 = Node_Sub25_Sub1.aClass318_9953;
					}
				} else {
					class318 = Class312.aClass318_3973;
				}
				if (class318 != null) {
					Class188_Sub1.anInt6852++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(i_1_ ^ 0x6ef9, class318, Class218.aClass123_2566.anIsaacCipher1571);
					node_sub13.aPacket7113.writeByte(0);
					node_sub13.aPacket7113.writeShort(is[i_3_]);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				bool = true;
				break;
			}
		}
		if (!bool) {
			Class41.method436(i_1_ ^ ~0x1c6b, Class22.aClass22_384.method297(Class35.language) + string, 4);
		}
	}
}
