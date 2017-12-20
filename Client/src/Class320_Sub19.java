/* Class320_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub19 extends Class320
{
	static int anInt8383;
	static int anInt8384;
	static int anInt8385 = 0;
	static int anInt8386;
	static int anInt8387;
	static int anInt8388 = 1;
	static int anInt8389;
	static int anInt8390;
	static int anInt8391;
	static int[] anIntArray8392 = new int[2];
	static int anInt8393;
	
	final int method3677(int i) {
		if (i != 0) {
			method3752((byte) 33);
		}
		anInt8386++;
		if (aNode_Sub27_4063.method2691(3) != Node_Sub38_Sub34.aClass353_10443 || !aNode_Sub27_4063.method2697(-68)) {
			return 1;
		}
		return 0;
	}
	
	Class320_Sub19(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final void method3673(byte b) {
		if (b > -35) {
			anInt8388 = -64;
		}
		anInt4064 = method3677(0);
		anInt8389++;
	}
	
	final int method3751(boolean bool) {
		if (bool != false) {
			method3675(38, (byte) -48);
		}
		anInt8393++;
		return anInt4064;
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			return -68;
		}
		anInt8387++;
		return 3;
	}
	
	public static void method3752(byte b) {
		anIntArray8392 = null;
		if (b < 63) {
			anIntArray8392 = null;
		}
	}
	
	static final int method3753(int i, int i_0_) {
		anInt8391++;
		i--;
		if (i_0_ != -729073628) {
			return -64;
		}
		i |= i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}
	
	final void method3676(boolean bool, int i) {
		anInt8383++;
		anInt4064 = i;
		if (bool != false) {
			anInt8385 = -127;
		}
	}
	
	static final CacheNode_Sub2 method3754(int i, int i_1_, long l) {
		if (i != 3) {
			anInt8385 = -39;
		}
		anInt8384++;
		CacheNode_Sub2 cachenode_sub2 = (CacheNode_Sub2) Class270_Sub2_Sub2.aHashTable10552.method1518(3512, l | (long) i_1_ << 56);
		if (cachenode_sub2 == null) {
			cachenode_sub2 = new CacheNode_Sub2(i_1_, l);
			Class270_Sub2_Sub2.aHashTable10552.method1515(cachenode_sub2.aLong2797, cachenode_sub2, -123);
		}
		return cachenode_sub2;
	}
	
	static final void method3755(int i, Node_Sub9 node_sub9) {
		if (node_sub9.aNode_Sub45_7075 != null) {
			node_sub9.aNode_Sub45_7075.anInt7552 = 0;
		}
		anInt8390++;
		node_sub9.aBoolean7074 = false;
		if (i != -729073628) {
			method3752((byte) 14);
		}
		for (Node_Sub9 node_sub9_2_ = node_sub9.method2429(); node_sub9_2_ != null; node_sub9_2_ = node_sub9.method2431())
			method3755(-729073628, node_sub9_2_);
	}
	
	Class320_Sub19(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
}
