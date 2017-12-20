/* Class320_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub8 extends Class320
{
	static int anInt8279;
	static int anInt8280;
	static int anInt8281 = 0;
	static int anInt8282;
	static int anInt8283;
	static int anInt8284;
	static int anInt8285;
	
	final void method3676(boolean bool, int i) {
		if (bool != false) {
			anInt8281 = 29;
		}
		anInt8283++;
		anInt4064 = i;
	}
	
	final int method3677(int i) {
		anInt8279++;
		if (i != 0) {
			anInt8281 = 27;
		}
		return 1;
	}
	
	Class320_Sub8(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3712(boolean bool) {
		if (bool != false) {
			return -31;
		}
		anInt8282++;
		return anInt4064;
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			return 85;
		}
		anInt8284++;
		return 1;
	}
	
	Class320_Sub8(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final void method3673(byte b) {
		anInt8280++;
		if (anInt4064 != 1 && (anInt4064 ^ 0xffffffff) != -1) {
			anInt4064 = method3677(0);
		}
		if (b > -35) {
			method3673((byte) -33);
		}
	}
}
