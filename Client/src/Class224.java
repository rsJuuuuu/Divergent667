/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class224
{
	static int anInt2667;
	protected int[] anIntArray2668;
	protected int[] anIntArray2669;
	protected int anInt2670;
	static OutcommingPacket OUTCOMMING_PACKET_16 = new OutcommingPacket(16, 0);
	static long aLong2672;
	
	static final void method2105(int i, int i_0_) {
		if (i_0_ != 1315) {
			method2106((byte) -74);
		}
		anInt2667++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 11, (long) i);
		cachenode_sub2.method2291((byte) 121);
	}
	
	Class224(int i) {
		anInt2670 = i;
		anIntArray2668 = new int[anInt2670];
		anIntArray2669 = new int[anInt2670];
	}
	
	public static void method2106(byte b) {
		OUTCOMMING_PACKET_16 = null;
		if (b != 37) {
			OUTCOMMING_PACKET_16 = null;
		}
	}
}
