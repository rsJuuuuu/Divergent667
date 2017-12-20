/* Class150_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class150_Sub3_Sub1 extends Class150_Sub3
{
	static int anInt10573;
	protected int anInt10574;
	static int anInt10575;
	static IncommingPacket aClass192_10576 = new IncommingPacket(10, 0);
	
	Class150_Sub3_Sub1(Class379 class379, Class77 class77, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class379, class77, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
		anInt10574 = i_12_;
	}
	
	public static void method1664(int i) {
		aClass192_10576 = null;
		if (i > -100) {
			aClass192_10576 = null;
		}
	}
	
	static final void method1665(byte b, int i) {
		@SuppressWarnings("unused")
		int i_13_ = -101 / ((b - -59) / 32);
		for (Node node = Class156.aHashTable1964.method1516(false); node != null; node = Class156.aHashTable1964.method1520(107)) {
			if ((long) i == (node.aLong2797 >> 48 & 0xffffL)) {
				node.method2160((byte) 96);
			}
		}
		anInt10575++;
	}
	
	public final Class170 method20(int i) {
		anInt10573++;
		if (i <= 81) {
			anInt10574 = 111;
		}
		return Class270.aClass170_3476;
	}
}
