/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46
{
	static int anInt671;
	static int anInt672;
	static int anInt673;
	static Class257 aClass257_674 = new Class257(13, 7);
	protected int anInt675;
	static int anInt676;
	static int anInt677;
	protected String aString678;
	static int anInt679;
	static Class170 aClass170_680 = new Class170(1, 2);
	static int anInt681 = -1;
	
	public static void method466(int i) {
		aClass170_680 = null;
		aClass257_674 = null;
		if (i != 540800) {
			method466(-33);
		}
	}
	
	static final void method467(int i, boolean bool) {
		Class270_Sub2.anInt8036++;
		anInt672++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class167.aClass318_2034, Class218.aClass123_2566.anIsaacCipher1571);
		Class218.aClass123_2566.sendPacket(127, node_sub13);
		for (Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516(false); node_sub2 != null; node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1520(93)) {
			if (!node_sub2.method2161(-119)) {
				node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516(false);
				if (node_sub2 == null) {
					break;
				}
			}
			if ((node_sub2.cliped ^ 0xffffffff) == -1) {
				Class243.method3060((byte) 103, bool, true, node_sub2);
			}
		}
		if (Node_Sub25_Sub3.aWidget9990 != null) {
			ClientScript.method2321(-1, Node_Sub25_Sub3.aWidget9990);
			Node_Sub25_Sub3.aWidget9990 = null;
		}
		if (i != -1) {
			aClass257_674 = null;
		}
	}
	
	static final void method468(int i, boolean bool) {
		anInt676++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 8, (long) i);
		cachenode_sub2.method2291((byte) 121);
		if (bool != false) {
			method467(57, false);
		}
	}
	
	static final boolean method469(int i) {
		anInt671++;
		if (i != 255) {
			method467(21, false);
		}
        return (Class315.anInt4035 ^ 0xffffffff) < -1;
    }
	
	static final boolean method470(int i, int i_0_, int i_1_) {
		anInt673++;
		int i_2_ = -99 % ((69 - i_0_) / 45);
        return (0x84080 & i_1_) != 0;
    }
	
	static final void method471(int i) {
		anInt677++;
		int i_3_ = Class213.aNode_Sub27_2512.aClass320_Sub4_7304.method3694(false);
		if ((i_3_ ^ 0xffffffff) != i) {
			if (i_3_ == 1) {
				Class98.method1082((byte) 0, 2395);
				Class295.method3469(512, (byte) -128);
				if (CacheNode_Sub11.aByteArrayArrayArray9550 != null) {
					IncommingPacket.method1954((byte) -51);
				}
			} else {
				Class98.method1082((byte) (Class110.anInt1412 + -4 & 0xff), 2395);
				Class295.method3469(2, (byte) -124);
			}
		} else {
			Node_Sub38_Sub15.aByteArrayArrayArray10261 = null;
			Class295.method3469(0, (byte) -124);
		}
		Node_Sub36_Sub3.anInt10061 = CacheNode_Sub20_Sub1.myPlayerPlane;
	}
	
	Class46() {
		/* empty */
	}
}
