/* Class320_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub13 extends Class320
{
	static int anInt8328;
	static int anInt8329;
	static int anInt8330;
	static int anInt8331;
	static int anInt8332;
	static int anInt8333;
	static OutcommingPacket aClass318_8334 = new OutcommingPacket(9, 3);
	static boolean aBoolean8335;
	static int anInt8336;
	static IncommingPacket aClass192_8337 = new IncommingPacket(66, 10);
	static String[] aStringArray8338 = new String[8];
	static long aLong8339 = 0L;
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		anInt8329++;
		if (bool != false) {
			method3734(false);
		}
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			return -16;
		}
		anInt8332++;
		if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			return 3;
		}
		return 1;
	}
	
	final void method3673(byte b) {
		if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789(-1) && !Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			anInt4064 = 0;
		}
		anInt8331++;
		if (b < -35) {
			if (anInt4064 < 0 || anInt4064 > 2) {
				anInt4064 = method3677(0);
			}
		}
	}
	
	Class320_Sub13(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	public static void method3731(byte b) {
		aStringArray8338 = null;
		if (b != -88) {
			method3732(45, 19, 72, -73, -88);
		}
		aClass318_8334 = null;
		aClass192_8337 = null;
	}
	
	static final void method3732(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (i_3_ <= i_0_) {
			Class369.method4086(i_0_, i_2_, i_3_, Class169_Sub4.anIntArrayArray8826[i], 0);
		} else {
			Class369.method4086(i_3_, i_2_, i_0_, Class169_Sub4.anIntArrayArray8826[i], 0);
		}
		if (i_1_ == 0) {
			anInt8336++;
		}
	}
	
	final boolean method3733(byte b) {
		anInt8328++;
		if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			return false;
		}
		if (b < 63) {
			return true;
		}
		return true;
	}
	
	Class320_Sub13(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3734(boolean bool) {
		if (bool != false) {
			method3731((byte) 42);
		}
		anInt8330++;
		return anInt4064;
	}
	
	final int method3677(int i) {
		if (i != 0) {
			aStringArray8338 = null;
		}
		anInt8333++;
		return 0;
	}
}
