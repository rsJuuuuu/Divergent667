/* Class320_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub16 extends Class320
{
	static int anInt8356;
	static int anInt8357;
	static Class312 aClass312_8358 = new Class312();
	static int anInt8359;
	static int anInt8360;
	static int anInt8361;
	static int anInt8362;
	static int anInt8363;
	static int anInt8364;
	static int anInt8365;
	
	final boolean method3741(byte b) {
		if (b <= 63) {
			aClass312_8358 = null;
		}
		anInt8362++;
		return true;
	}
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		anInt8356++;
		if (bool != false) {
			method3742(82, -38);
		}
	}
	
	static final int method3742(int i, int i_0_) {
		anInt8357++;
		if ((i_0_ ^ 0xffffffff) == -6408 || i_0_ == 34843 || (i_0_ ^ 0xffffffff) == -34838) {
			return 6407;
		}
		if (i_0_ == 6408 || (i_0_ ^ 0xffffffff) == -34843 || i_0_ == 34836) {
			return 6408;
		}
		if ((i_0_ ^ 0xffffffff) == -6407 || (i_0_ ^ 0xffffffff) == -34845) {
			return 6406;
		}
		if (i_0_ == 6409 || i_0_ == 34846) {
			return 6409;
		}
		if (i_0_ == 6410 || (i_0_ ^ 0xffffffff) == -34848) {
			return 6410;
		}
		if (i != 6406) {
			method3743((byte) -98);
		}
		if (i_0_ == 6402) {
			return 6402;
		}
		throw new IllegalArgumentException("");
	}
	
	public static void method3743(byte b) {
		aClass312_8358 = null;
		int i = 53 % ((b - -66) / 33);
	}
	
	final int method3744(boolean bool) {
		if (bool != false) {
			return 40;
		}
		anInt8363++;
		return anInt4064;
	}
	
	Class320_Sub16(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	Class320_Sub16(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3675(int i, byte b) {
		anInt8365++;
		if ((i ^ 0xffffffff) == -1 || (aNode_Sub27_4063.aClass320_Sub23_7290.method3770(false) ^ 0xffffffff) == -2) {
			return 1;
		}
		if (b != 54) {
			method3676(false, 84);
		}
		return 2;
	}
	
	final int method3677(int i) {
		anInt8364++;
		if (i != 0) {
			method3675(16, (byte) 82);
		}
		return 1;
	}
	
	final void method3673(byte b) {
		if (anInt4064 != 0 && aNode_Sub27_4063.aClass320_Sub23_7290.method3770(false) != 1) {
			anInt4064 = 0;
		}
		anInt8359++;
		if (anInt4064 < 0 || (anInt4064 ^ 0xffffffff) < -2) {
			anInt4064 = method3677(0);
		}
		if (b >= -35) {
			aClass312_8358 = null;
		}
	}
}
