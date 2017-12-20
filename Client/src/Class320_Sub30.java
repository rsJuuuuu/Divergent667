/* Class320_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub30 extends Class320
{
	static int anInt8492;
	static int anInt8493;
	static int anInt8494;
	static int anInt8495;
	static int anInt8496;
	static int anInt8497;
	static int anInt8498;
	static int anInt8499;
	
	Class320_Sub30(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final boolean method3795(byte b) {
		anInt8494++;
		if (b < 63) {
			anInt8495 = 20;
		}
		if (aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443) {
            return !aNode_Sub27_4063.method2697(-71);
        }
		return false;
	}
	
	final void method3673(byte b) {
		if (b >= -35) {
			method3796(true);
		}
		if (aNode_Sub27_4063.method2691(3) != Node_Sub38_Sub34.aClass353_10443) {
			anInt4064 = 1;
		} else if (aNode_Sub27_4063.method2697(-91)) {
			anInt4064 = 0;
		}
		anInt8498++;
		if ((anInt4064 ^ 0xffffffff) != -1 && (anInt4064 ^ 0xffffffff) != -2) {
			anInt4064 = method3677(0);
		}
	}
	
	final int method3796(boolean bool) {
		anInt8492++;
		if (bool != false) {
			anInt8495 = -119;
		}
		return anInt4064;
	}
	
	Class320_Sub30(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	static final boolean method3797(r var_r, int i, int i_0_, int i_1_, boolean[] bools) {
		boolean bool = false;
		if (Class320_Sub10.aPlaneArray8300 != Class368.aPlaneArray4548) {
			int i_2_ = Node_Sub38_Sub37.aPlaneArray10466[i].method3260(i_1_, -114, i_0_);
			int i_3_ = 0;
			for (/**/; i_3_ <= i; i_3_++) {
				Plane plane = Node_Sub38_Sub37.aPlaneArray10466[i_3_];
				if (plane != null) {
					int i_4_ = i_2_ - plane.method3260(i_1_, -109, i_0_);
					if (bools != null) {
						bools[i_3_] = plane.method3256(var_r, i_0_, i_4_, i_1_, 0, false);
						if (!bools[i_3_]) {
							continue;
						}
					}
					plane.CA(var_r, i_0_, i_4_, i_1_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}
	
	static final void method3798(int i) {
		anInt8493++;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) ^ 0xffffffff) == -1 && (Class94.anInt1249 ^ 0xffffffff) != (CacheNode_Sub20_Sub1.myPlayerPlane ^ 0xffffffff)) {
			Class364.method4057(false, Player.anInt11178, 12, Class277.anInt3527, (byte) -36);
		} else {
			Class56.method563(i ^ 0x2e92, Class93.aGraphicsToolkit1241);
			if (Node_Sub36_Sub3.anInt10061 != CacheNode_Sub20_Sub1.myPlayerPlane) {
				Class46.method471(-1);
			}
			if (i != -17132) {
				method3797(null, 12, -7, 99, null);
			}
		}
	}
	
	final void method3676(boolean bool, int i) {
		anInt8499++;
		anInt4064 = i;
		if (bool != false) {
			method3795((byte) 103);
		}
	}
	
	final int method3675(int i, byte b) {
		anInt8496++;
		if (aNode_Sub27_4063.method2691(b ^ 0x35) == Node_Sub38_Sub34.aClass353_10443) {
			if (aNode_Sub27_4063.method2697(-72)) {
				return 3;
			}
			if (i == 0 || aNode_Sub27_4063.aClass320_Sub23_7290.method3770(false) == 1) {
				return 1;
			}
			return 2;
		}
		if (b != 54) {
			method3677(-103);
		}
		return 3;
	}
	
	final int method3677(int i) {
		anInt8497++;
		if (i != 0) {
			return 34;
		}
		return 1;
	}
}
