/* Class320_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub18 extends Class320
{
	static int anInt8373;
	static int anInt8374;
	static boolean aBoolean8375 = false;
	static int anInt8376;
	static int anInt8377;
	static byte[][] aByteArrayArray8378;
	static byte[][] aByteArrayArray8379;
	static int anInt8380;
	static int anInt8381;
	static int[] anIntArray8382 = new int[8];
	
	public static void method3748(byte b) {
		anIntArray8382 = null;
		aByteArrayArray8378 = null;
		if (b <= -42) {
			aByteArrayArray8379 = null;
		}
	}
	
	final int method3749(boolean bool) {
		if (bool != false) {
			method3675(31, (byte) 18);
		}
		anInt8374++;
		return anInt4064;
	}
	
	Class320_Sub18(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3673(byte b) {
		if (aNode_Sub27_4063.method2697(-116)) {
			anInt4064 = 2;
		}
		anInt8376++;
		if (anInt4064 < 0 || anInt4064 > 2) {
			anInt4064 = method3677(0);
		}
		if (b > -35) {
			method3676(false, -119);
		}
	}
	
	final void method3676(boolean bool, int i) {
		anInt8373++;
		anInt4064 = i;
		if (bool != false) {
			aByteArrayArray8379 = null;
		}
	}
	
	final int method3677(int i) {
		anInt8380++;
		if (i != 0) {
			method3676(false, -124);
		}
		if (aNode_Sub27_4063.method2697(-124)) {
			return 2;
		}
		if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789(-1) && Class250.method3096(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), -111)) {
			return 1;
		}
		return 0;
	}
	
	final boolean method3750(byte b) {
		anInt8381++;
		if (b <= 63) {
			method3748((byte) -118);
		}
        return !aNode_Sub27_4063.method2697(-108);
    }
	
	final int method3675(int i, byte b) {
		anInt8377++;
		if (aNode_Sub27_4063.method2697(b + -173)) {
			return 3;
		}
		if (b != 54) {
			method3675(-31, (byte) 69);
		}
		return 1;
	}
	
	Class320_Sub18(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
}
