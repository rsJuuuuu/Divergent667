/* Node_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub8 extends Node
{
	protected int anInt7065;
	static Class151 aClass151_7066 = new Class151(8, 0, 4, 1);
	protected int anInt7067;
	static long aLong7068;
	static int anInt7069;
	static int anInt7070;
	static int anInt7071;
	
	static final void method2423(byte b) {
		for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
			if (Class251.method3101(cachenode_sub13.anInt9562, (byte) -62)) {
				Node_Sub52.method2974(-1, cachenode_sub13);
			}
		}
		if (b != -42) {
			method2424(-48);
		}
		anInt7071++;
	}
	
	static final void method2424(int i) {
		Class320_Sub23.aClass123_8432.method1511((byte) 126);
		anInt7069++;
		Class320_Sub23.aClass123_8432.incomming_packet = null;
		Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
		Class320_Sub23.aClass123_8432.anInt1578 = 0;
		Class320_Sub23.aClass123_8432.aClass192_1573 = null;
		Class320_Sub23.aClass123_8432.aClass192_1582 = null;
		Class320_Sub23.aClass123_8432.anInt1581 = 0;
		Node_Sub19.anInt7163 = 0;
		Class320_Sub23.aClass123_8432.aClass192_1574 = null;
		Class281.method3384((byte) -73);
		Class320_Sub29.method3790((byte) -56);
		for (int i_0_ = 0; i_0_ < 2048; i_0_++)
			Class270_Sub2.LOCAL_PLAYERS[i_0_] = null;
		Class295.myPlayer = null;
		for (int i_1_ = 0; Node_Sub32.cachedNPCcsCount > i_1_; i_1_++) {
			Npc npc = Class314.LocalNPCs[i_1_].aNpc7518;
			if (npc != null) {
				npc.faceEntity = -1;
			}
		}
		Class303.method3543((byte) 93);
		Class320_Sub22.anInt8415 = 1;
		Class367.anInt4541 = Class368.anInt4551 = -1;
		Class48.method478(11, (byte) 119);
		for (int i_2_ = i; i_2_ < 100; i_2_++)
			Class195.aBooleanArray2387[i_2_] = true;
		Class202.method2027(200);
		Class359.aLong4466 = 0L;
		Class117.aNode_Sub7_1472 = null;
	}
	
	public static void method2425(int i) {
		aClass151_7066 = null;
		if (i <= 78) {
			method2423((byte) 108);
		}
	}
	
	Node_Sub8(int i, int i_3_) {
		anInt7065 = i;
		anInt7067 = i_3_;
	}
}
