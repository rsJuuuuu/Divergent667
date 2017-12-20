/* Class320_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub7 extends Class320
{
	static int anInt8268;
	static int anInt8269;
	static int anInt8270;
	static int[] anIntArray8271 = new int[5];
	static int anInt8272;
	static int anInt8273;
	static int anInt8274;
	static Interface21[] anInterface21Array8275 = new Interface21[128];
	static int anInt8276;
	static int anInt8277;
	static int anInt8278;
	
	public static void method3706(byte b) {
		anInterface21Array8275 = null;
		if (b < 121) {
			anInterface21Array8275 = null;
		}
		anIntArray8271 = null;
	}
	
	static final byte method3707(int i, byte b, int i_0_) {
		anInt8270++;
		if (b != 125) {
			return (byte) 75;
		}
		if ((i ^ 0xffffffff) != -10) {
			return (byte) 0;
		}
		if ((0x1 & i_0_) == 0) {
			return (byte) 1;
		}
		return (byte) 2;
	}
	
	final int method3708(boolean bool) {
		anInt8273++;
		if (bool != false) {
			return 72;
		}
		return anInt4064;
	}
	
	final boolean method3709(byte b) {
		if (b <= 63) {
			method3708(true);
		}
		anInt8274++;
        return !aNode_Sub27_4063.method2697(-114);
    }
	
	final int method3677(int i) {
		anInt8272++;
		if (i != 0) {
			return 84;
		}
		return 1;
	}
	
	final void method3673(byte b) {
		anInt8276++;
		if (b < -35) {
			if (aNode_Sub27_4063.method2697(-79)) {
				anInt4064 = 0;
			}
			if (anInt4064 != 1 && anInt4064 != 0) {
				anInt4064 = method3677(0);
			}
		}
	}
	
	Class320_Sub7(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3675(int i, byte b) {
		anInt8277++;
		if (aNode_Sub27_4063.method2697(-96)) {
			return 3;
		}
		if (b != 54) {
			method3711((byte) 78, -70, -78);
		}
		return 1;
	}
	
	Class320_Sub7(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	static final void method3710(byte b, int i) {
		anInt8268++;
		synchronized (Class186.aClass61_2247) {
			Class186.aClass61_2247.method598(i, -11819);
		}
		if (b != -20) {
			anInterface21Array8275 = null;
		}
	}
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		if (bool != false) {
			anInterface21Array8275 = null;
		}
		anInt8269++;
	}
	
	static final boolean method3711(byte b, int i, int i_1_) {
		anInt8278++;
		if (b < 28) {
			return true;
		}
        return (0x100100 & i ^ 0xffffffff) != -1;
    }
}
