/* Class194_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194_Sub3_Sub1 extends Class194_Sub3
{
	static int anInt9371;
	static int anInt9372;
	static OutcommingPacket aClass318_9373 = new OutcommingPacket(69, 9);
	static int anInt9374;
	static boolean aBoolean9375 = false;
	static int anInt9376;
	static Class241 aClass241_9377;
	static boolean aBoolean9378 = false;
	
	static final void method1979(int i, boolean bool) {
		anInt9374++;
		if (bool != false) {
			aClass241_9377 = null;
		}
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 14, (long) i);
		cachenode_sub2.method2291((byte) 121);
	}
	
	static final boolean method1980(Class123 class123, int i) {
		anInt9371++;
		try {
			if (i != 4096) {
				method1981(26);
			}
			return FloatBuffer.method2249(class123, -128);
		} catch (java.io.IOException ioexception) {
			if (Class151.anInt1843 == 9) {
				class123.aClass365_1557 = null;
				return false;
			}
			Class262_Sub13.method3182(false);
			return true;
		} catch (Exception exception) {
			String string = "T2 - " + (class123.incomming_packet == null ? -1 : class123.incomming_packet.method1953(102)) + "," + (class123.aClass192_1582 != null ? class123.aClass192_1582.method1953(i + -4034) : -1) + "," + (class123.aClass192_1573 == null ? -1 : class123.aClass192_1573.method1953(112)) + " - " + class123.anInt1581 + "," + (Node_Sub53.gameSceneBaseX - -Class295.myPlayer.scenePositionXQueue[0]) + "," + (Class320_Sub4.gameSceneBaseY + Class295.myPlayer.scenePositionYQueue[0]) + " - ";
			for (int i_0_ = 0; class123.anInt1581 > i_0_; i_0_++) {
				if ((i_0_ ^ 0xffffffff) <= -51) {
					break;
				}
				string += class123.aPacket1570.buffer[i_0_] + ",";
			}
			ClanChat.method507(exception, string, -114);
			Class127.method1542(i ^ 0x3d3e, false);
			return true;
		}
	}
	
	public static void method1981(int i) {
		aClass318_9373 = null;
		if (i > -123) {
			aClass318_9373 = null;
		}
		aClass241_9377 = null;
	}
	
	static final void method1982(int i) {
		try {
			anInt9372++;
			if (i != 0) {
				method1982(-44);
			}
			for (Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1516(false); node_sub3 != null; node_sub3 = (Node_Sub3) Class56.aHashTable839.method1520(106)) {
				if (node_sub3.aClass189_Sub1_6943.method1920(-89)) {
					Renderer.method3446(node_sub3.anInt6947, 5);
				} else {
					node_sub3.aClass189_Sub1_6943.method1937(109);
					try {
						node_sub3.aClass189_Sub1_6943.method1922(false);
					} catch (Exception exception) {
						ClanChat.method507(exception, "TV: " + node_sub3.anInt6947, -127);
						Renderer.method3446(node_sub3.anInt6947, 5);
					}
					if (!node_sub3.aBoolean6942 && !node_sub3.aBoolean6946) {
						Node_Sub25_Sub1 node_sub25_sub1 = node_sub3.aClass189_Sub1_6943.method1932(-111);
						if (node_sub25_sub1 != null) {
							Node_Sub9_Sub5 node_sub9_sub5 = node_sub25_sub1.method2658(27624);
							if (node_sub9_sub5 != null) {
								node_sub9_sub5.method2536(node_sub3.anInt6941, (byte) -108);
								Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub5);
								node_sub3.aBoolean6942 = true;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class126.method1537(runtimeexception, "hfa.J(" + i + ')');
		}
	}
}
