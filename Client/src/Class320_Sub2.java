/* Class320_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub2 extends Class320
{
	static int anInt8215;
	static int anInt8216;
	static int anInt8217;
	static int anInt8218;
	static int anInt8219;
	static int anInt8220;
	static IncommingPacket aClass192_8221 = new IncommingPacket(37, -2);
	static int anInt8222;
	
	final boolean method3682(byte b) {
		if (b < 63) {
			aClass192_8221 = null;
		}
		anInt8218++;
        return Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28);
    }
	
	public static void method3683(boolean bool) {
		aClass192_8221 = null;
		if (bool != false) {
			method3685(-52);
		}
	}
	
	final int method3675(int i, byte b) {
		anInt8215++;
		if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), (byte) 28)) {
			return 3;
		}
		if (b != 54) {
			return -67;
		}
		return 1;
	}
	
	static final int method3684(int i, int i_0_) {
		if (Player.anIntArrayArray11128 != null) {
			return Player.anIntArrayArray11128[i][i_0_] & 0xffffff;
		}
		return 0;
	}
	
	static final void method3685(int i) {
		Class307.aNode_Sub9_Sub1_3902.method2435(false);
		anInt8219++;
		Class93_Sub2.aClass302_6049 = null;
		Class61.aNode_Sub9_Sub1_885 = null;
		if (i > -65) {
			aClass192_8221 = null;
		}
		Class52.anInt800 = 1;
	}
	
	final void method3673(byte b) {
		if (b < -35) {
			anInt8222++;
			if ((anInt4064 ^ 0xffffffff) > -1 || (anInt4064 ^ 0xffffffff) < -2) {
				anInt4064 = method3677(0);
			}
		}
	}
	
	final void method3676(boolean bool, int i) {
		if (bool != false) {
			aClass192_8221 = null;
		}
		anInt4064 = i;
		anInt8220++;
	}
	
	Class320_Sub2(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3677(int i) {
		if (i != 0) {
			return 22;
		}
		anInt8217++;
		return 1;
	}
	
	Class320_Sub2(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3686(boolean bool) {
		anInt8216++;
		if (bool != false) {
			aClass192_8221 = null;
		}
		return anInt4064;
	}
}
