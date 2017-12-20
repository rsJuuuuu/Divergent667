/* Class320_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub4 extends Class320
{
	static int anInt8236;
	static int anInt8237;
	static int anInt8238;
	static int anInt8239;
	static int anInt8240;
	static int anInt8241;
	static int anInt8242;
	static int gameSceneBaseY;
	
	Class320_Sub4(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		if (bool != false) {
			method3693(125, 70, 79);
		}
		anInt4064 = i;
		anInt8236++;
	}
	
	static final boolean method3693(int i, int i_0_, int i_1_) {
		if (i < 20) {
			gameSceneBaseY = 87;
		}
		anInt8237++;
        return (0x800 & i_0_) != 0;
    }
	
	final void method3673(byte b) {
		anInt8242++;
		if (aNode_Sub27_4063.aClass320_Sub3_7298.method3689((byte) 121) && (anInt4064 ^ 0xffffffff) == -3) {
			anInt4064 = 1;
		}
		if ((anInt4064 ^ 0xffffffff) > -1 || (anInt4064 ^ 0xffffffff) < -3) {
			anInt4064 = method3677(0);
		}
		if (b > -35) {
			method3694(true);
		}
	}
	
	final int method3677(int i) {
		if (i != 0) {
			method3675(-2, (byte) -51);
		}
		anInt8240++;
		return 2;
	}
	
	Class320_Sub4(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3694(boolean bool) {
		if (bool != false) {
			gameSceneBaseY = 102;
		}
		anInt8238++;
		return anInt4064;
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			method3693(-57, 54, 121);
		}
		anInt8239++;
		return 1;
	}
}
