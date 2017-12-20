/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class45 implements Interface12
{
	static int anInt5263;
	static int anInt5264 = 0;
	static short[][] aShortArrayArray5265;
	private String aString5266;
	private boolean aBoolean5267;
	static int anInt5268;
	static int anInt5269;
	static int anInt5270 = 0;
	static int anInt5271;
	static int anInt5272;
	
	public final int method35(int i) {
		anInt5263++;
		if (aBoolean5267) {
			return 100;
		}
		int i_0_ = Class37.method401(true, aString5266);
		if (i > -4) {
			method35(54);
		}
		if ((i_0_ ^ 0xffffffff) <= -1 && (i_0_ ^ 0xffffffff) >= -101) {
			return i_0_;
		}
		aBoolean5267 = true;
		return 100;
	}
	
	static final void method462(byte b, Player player) {
		int i = -97 % ((-46 - b) / 47);
		anInt5268++;
		Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1518(3512, (long) player.index);
		if (node_sub47 != null) {
			if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
				Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
				node_sub47.aNode_Sub9_Sub2_7568 = null;
			}
			node_sub47.method2160((byte) 66);
		}
	}
	
	public static void method463(int i) {
		if (i == 2000) {
			aShortArrayArray5265 = null;
		}
	}
	
	Class45(String string) {
		aString5266 = string;
	}
	
	final boolean method464(int i) {
		anInt5272++;
		int i_1_ = -67 / ((-62 - i) / 57);
		return aBoolean5267;
	}
	
	public final Class172 method34(byte b) {
		anInt5271++;
		int i = 4 % ((15 - b) / 48);
		return Class172.aClass172_2080;
	}
	
	static final void method465(byte b) {
		anInt5269++;
		if ((Class4.anInt124 ^ 0xffffffff) != -1) {
			try {
				if (++Class51_Sub2.anInt9069 > 2000) {
					Class218.aClass123_2560.method1513(b + -28189);
					if (Node_Sub54.anInt7683 >= 2) {
						Class4.anInt124 = 0;
						Node_Sub36_Sub4.anInt10073 = -5;
						return;
					}
					Node_Sub15_Sub13.aClass197_9871.method1997(17418);
					Class4.anInt124 = 1;
					Class51_Sub2.anInt9069 = 0;
					Node_Sub54.anInt7683++;
				}
				if (Class4.anInt124 == 1) {
					Class218.aClass123_2560.aClass241_1565 = Node_Sub15_Sub13.aClass197_9871.method2000((byte) -30, Class240.aSignLink2946);
					Class4.anInt124 = 2;
				}
				if (Class4.anInt124 == 2) {
					if ((Class218.aClass123_2560.aClass241_1565.anInt2953 ^ 0xffffffff) == -3) {
						throw new IOException();
					}
					if (Class218.aClass123_2560.aClass241_1565.anInt2953 != 1) {
						return;
					}
					Class218.aClass123_2560.aClass365_1557 = CacheNode_Sub6.method2311((Socket) Class218.aClass123_2560.aClass241_1565.anObject2956, 15000, (byte) -87);
					Class218.aClass123_2560.aClass241_1565 = null;
					Class218.aClass123_2560.method1512((byte) -89);
					Class4.anInt124 = 4;
				}
				if (b != 13) {
					method462((byte) 89, null);
				}
				if (Class4.anInt124 == 4) {
					if (Class218.aClass123_2560.aClass365_1557.method4068(1, b ^ 0x3f)) {
						Class218.aClass123_2560.aClass365_1557.method4065((byte) -78, Class218.aClass123_2560.aPacket1570.buffer, 1, 0);
						int i = 0xff & Class218.aClass123_2560.aPacket1570.buffer[0];
						Class4.anInt124 = 0;
						Node_Sub36_Sub4.anInt10073 = i;
						Class218.aClass123_2560.method1513(-28176);
					}
				}
			} catch (IOException ioexception) {
				Class218.aClass123_2560.method1513(-28176);
				if (Node_Sub54.anInt7683 < 2) {
					Node_Sub15_Sub13.aClass197_9871.method1997(17418);
					Node_Sub54.anInt7683++;
					Class51_Sub2.anInt9069 = 0;
					Class4.anInt124 = 1;
				} else {
					Class4.anInt124 = 0;
					Node_Sub36_Sub4.anInt10073 = -4;
				}
			}
		}
	}
}
