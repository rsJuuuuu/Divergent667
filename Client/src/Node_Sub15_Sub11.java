/* Node_Sub15_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub11 extends Node_Sub15
{
	private int anInt9854;
	static int anInt9855;
	static int anInt9856 = 4;
	static int anInt9857;
	static int anInt9858;
	static Index aClass302_9859;
	private int anInt9860;
	
	static final void method2580(byte b, int i, int i_0_) {
		anInt9855++;
		if (b != -114) {
			aClass302_9859 = null;
		}
		if (Class20.aFloat329 > Class20.aFloat327) {
			Class20.aFloat327 += (double) Class20.aFloat327 / 30.0;
			if (Class20.aFloat329 < Class20.aFloat327) {
				Class20.aFloat327 = Class20.aFloat329;
			}
			Class207.method2039(b ^ ~0x41);
			Class20.anInt328 = (int) Class20.aFloat327 >> 1;
			Class20.aByteArrayArrayArray332 = Node_Sub29_Sub3.method2719(-7499, Class20.anInt328);
		} else if (Class20.aFloat327 > Class20.aFloat329) {
			Class20.aFloat327 -= (double) Class20.aFloat327 / 30.0;
			if (Class20.aFloat329 > Class20.aFloat327) {
				Class20.aFloat327 = Class20.aFloat329;
			}
			Class207.method2039(93);
			Class20.anInt328 = (int) Class20.aFloat327 >> 1;
			Class20.aByteArrayArrayArray332 = Node_Sub29_Sub3.method2719(-7499, Class20.anInt328);
		}
		if ((Class262_Sub4.anInt7730 ^ 0xffffffff) != 0 && (Class150_Sub3.anInt8963 ^ 0xffffffff) != 0) {
			int i_1_ = -Class94.anInt1250 + Class262_Sub4.anInt7730;
			if ((i_1_ ^ 0xffffffff) > -3 || i_1_ > 2) {
				i_1_ /= 8;
			}
			int i_2_ = -Class327.anInt5360 + Class150_Sub3.anInt8963;
			Class94.anInt1250 = i_1_ + Class94.anInt1250;
			if (i_2_ < 2 || (i_2_ ^ 0xffffffff) < -3) {
				i_2_ /= 8;
			}
			if ((i_1_ ^ 0xffffffff) == -1 && i_2_ == 0) {
				Class150_Sub3.anInt8963 = -1;
				Class262_Sub4.anInt7730 = -1;
			}
			Class327.anInt5360 -= -i_2_;
			Class207.method2039(8);
		}
		if (Class168.anInt2044 > 0) {
			Node_Sub15_Sub4.anInt9800--;
			if (Node_Sub15_Sub4.anInt9800 == 0) {
				Class168.anInt2044--;
				Node_Sub15_Sub4.anInt9800 = 100;
			}
		} else {
			Class253.anInt3201 = -1;
			Node_Sub38_Sub19.anInt10296 = -1;
		}
		if (Class336_Sub1.aBoolean8543 && Node_Sub43.aClass312_7541 != null) {
			for (Node_Sub31 node_sub31 = (Node_Sub31) Node_Sub43.aClass312_7541.method3613(65280); node_sub31 != null; node_sub31 = (Node_Sub31) Node_Sub43.aClass312_7541.method3620(16776960)) {
				Class79 class79 = Class20.aClass215_322.method2069((byte) 113, node_sub31.aNode_Sub14_7375.anInt7128);
				if (node_sub31.method2728(i, (byte) 36, i_0_)) {
					if (class79.aStringArray1065 != null) {
						if (class79.aStringArray1065[4] != null) {
							Node_Sub32.method2731(false, -1, (long) node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067, 0, class79.aStringArray1065[4], 1004, true, -1, class79.aString1045, (long) node_sub31.aNode_Sub14_7375.anInt7128, (byte) -18, false);
						}
						if (class79.aStringArray1065[3] != null) {
							Node_Sub32.method2731(false, -1, (long) node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067, 0, class79.aStringArray1065[3], 1009, true, -1, class79.aString1045, (long) node_sub31.aNode_Sub14_7375.anInt7128, (byte) -18, false);
						}
						if (class79.aStringArray1065[2] != null) {
							Node_Sub32.method2731(false, -1, (long) node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067, 0, class79.aStringArray1065[2], 1006, true, -1, class79.aString1045, (long) node_sub31.aNode_Sub14_7375.anInt7128, (byte) -18, false);
						}
						if (class79.aStringArray1065[1] != null) {
							Node_Sub32.method2731(false, -1, (long) node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067, 0, class79.aStringArray1065[1], 1001, true, -1, class79.aString1045, (long) node_sub31.aNode_Sub14_7375.anInt7128, (byte) -18, false);
						}
						if (class79.aStringArray1065[0] != null) {
							Node_Sub32.method2731(false, -1, (long) node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067, 0, class79.aStringArray1065[0], 1003, true, -1, class79.aString1045, (long) node_sub31.aNode_Sub14_7375.anInt7128, (byte) -18, false);
						}
					}
					if (!node_sub31.aNode_Sub14_7375.aBoolean7127) {
						node_sub31.aNode_Sub14_7375.aBoolean7127 = true;
						ClientScriptsExecutor.method3565(Class3.aClass212_5159, node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067);
					}
					if (node_sub31.aNode_Sub14_7375.aBoolean7127) {
						ClientScriptsExecutor.method3565(Node_Sub38_Sub29.aClass212_10406, node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067);
					}
				} else if (node_sub31.aNode_Sub14_7375.aBoolean7127) {
					node_sub31.aNode_Sub14_7375.aBoolean7127 = false;
					ClientScriptsExecutor.method3565(CacheNode_Sub11.aClass212_9548, node_sub31.aNode_Sub14_7375.anInt7128, class79.anInt1067);
				}
			}
		}
	}
	
	final void method2556(ClanChat clanchat, int i) {
		if (i == 16) {
			anInt9857++;
			clanchat.method509(anInt9854, anInt9860, -553);
		}
	}
	
	public static void method2581(int i) {
		aClass302_9859 = null;
		if (i < 13) {
			method2581(96);
		}
	}
	
	final void method2554(int i, BufferedStream buffer) {
		anInt9858++;
		anInt9860 = buffer.readInt();
		anInt9854 = buffer.readInt();
		if (i != 29147) {
			method2554(23, null);
		}
	}
	
	Node_Sub15_Sub11() {
		/* empty */
	}
}
