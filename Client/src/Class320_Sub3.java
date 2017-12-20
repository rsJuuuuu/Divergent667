/* Class320_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub3 extends Class320
{
	static int anInt8223;
	static int anInt8224;
	static int anInt8225;
	static int anInt8226;
	static int anInt8227;
	static int anInt8228;
	static int anInt8229;
	static int anInt8230;
	static int anInt8231;
	static int anInt8232;
	static OutcommingPacket aClass318_8233 = new OutcommingPacket(17, -1);
	static HashTable aHashTable8234 = new HashTable(16);
	static boolean aBoolean8235 = false;
	
	public static void method3687(int i) {
		aHashTable8234 = null;
		aClass318_8233 = null;
		if (i != 3) {
			method3692(null, (byte) -124, true);
		}
	}
	
	final boolean method3688(byte b) {
		anInt8229++;
		if (b <= 63) {
			aClass318_8233 = null;
		}
		return true;
	}
	
	final void method3673(byte b) {
		if (b < -35) {
			anInt8224++;
			if (method3689((byte) 124)) {
				if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789(-1) && !Class188_Sub2_Sub2.method1911(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), 2)) {
					anInt4064 = 1;
				}
				if ((aNode_Sub27_4063.aClass320_Sub1_7313.method3678(false) ^ 0xffffffff) == -2) {
					anInt4064 = 1;
				}
			}
			if (anInt4064 == 3) {
				anInt4064 = 2;
			}
			if (anInt4064 < 0 || (anInt4064 ^ 0xffffffff) < -4) {
				anInt4064 = method3677(0);
			}
		}
	}
	
	final boolean method3689(byte b) {
		anInt8223++;
		if (b <= 118) {
			aBoolean8235 = false;
		}
		return Class187.method1882(-37, anInt4064);
	}
	
	Class320_Sub3(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	static final void method3690(int i, int i_0_) {
		Class320_Sub23.aClass123_8432 = Class218.aClass123_2566;
		anInt8227++;
		Class159.loginType = 2;
		Node_Sub38_Sub23.anInt10347 = i_0_;
		Class129.method1556(Class188_Sub1_Sub1.aString9327.equals(""), Class188_Sub1_Sub1.aString9327, true, true, "");
		if (i != -11055) {
			method3687(102);
		}
	}
	
	final int method3675(int i, byte b) {
		anInt8226++;
		if (b != 54) {
			return -54;
		}
		if (Class187.method1882(-84, i)) {
			if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789(-1) && !Class188_Sub2_Sub2.method1911(aNode_Sub27_4063.aClass320_Sub29_7270.method3791(false), 2)) {
				return 3;
			}
			if ((aNode_Sub27_4063.aClass320_Sub1_7313.method3678(false) ^ 0xffffffff) == -2) {
				return 3;
			}
		}
		if (i == 3) {
			return 3;
		}
		if (Class187.method1882(-128, i)) {
			return 2;
		}
		return 1;
	}
	
	Class320_Sub3(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		if (bool != false) {
			aClass318_8233 = null;
		}
		anInt8228++;
	}
	
	final int method3677(int i) {
		if (i != 0) {
			aHashTable8234 = null;
		}
		anInt8230++;
		return 0;
	}
	
	final int method3691(boolean bool) {
		anInt8232++;
        if (bool) {
            method3692(null, (byte) 24, true);
		}
		return anInt4064;
	}
	
	static final void method3692(byte[] bs, byte b, boolean bool) {
		anInt8231++;
		if (Class117_Sub2.aBuffer5154 == null) {
			Class117_Sub2.aBuffer5154 = new BufferedStream(20000);
		}
		Class117_Sub2.aBuffer5154.writeBytes(bs.length, bs, 0);
		if (bool) {
			Class361.method4045(2, Class117_Sub2.aBuffer5154.buffer);
			Class180.aClass377_Sub1Array2143 = new Class377_Sub1[Class254.anInt3212];
			int i = 0;
			for (int i_1_ = Mobile_Sub4.anInt10972; i_1_ <= Node_Sub9_Sub5.anInt9757; i_1_++) {
				Class377_Sub1 class377_sub1 = Class327.method3823(100, i_1_);
				if (class377_sub1 != null) {
					Class180.aClass377_Sub1Array2143[i++] = class377_sub1;
				}
			}
			Class82.aBoolean1122 = false;
			Class194.aLong2374 = Class313.method3650(false);
			Class117_Sub2.aBuffer5154 = null;
		}
		if (b < 83) {
			aHashTable8234 = null;
		}
	}
}
