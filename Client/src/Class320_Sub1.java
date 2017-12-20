/* Class320_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub1 extends Class320
{
	static Class141 aClass141_8207;
	static int anInt8208;
	static int anInt8209;
	static int anInt8210;
	static int anInt8211;
	static int anInt8212;
	static int anInt8213;
	static int anInt8214;
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			return -26;
		}
		anInt8212++;
		return 1;
	}
	
	Class320_Sub1(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3677(int i) {
		anInt8211++;
		if (i != 0) {
			method3678(false);
		}
		if (aNode_Sub27_4063.method2694(-13725).method1878((byte) 60)) {
			return 3;
		}
		return 2;
	}
	
	final int method3678(boolean bool) {
		anInt8213++;
		if (bool != false) {
			return -19;
		}
		return anInt4064;
	}
	
	public static void method3679(int i) {
		aClass141_8207 = null;
		if (i != 3) {
			aClass141_8207 = null;
		}
	}
	
	Class320_Sub1(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3673(byte b) {
		if (b > -35) {
			method3678(false);
		}
		anInt8208++;
		if ((anInt4064 ^ 0xffffffff) > -2 || anInt4064 > 3) {
			anInt4064 = method3677(0);
		}
	}
	
	static final Class249 method3680(int i, int i_0_) {
		anInt8214++;
		Class249 class249 = (Class249) Class379.aClass61_4872.method607((long) i_0_, 0);
		if (class249 != null) {
			return class249;
		}
		byte[] bs = Class165.aClass302_2029.method3524(false, i_0_, i);
		class249 = new Class249();
		class249.anInt3158 = i_0_;
		if (bs != null) {
			class249.method3090((byte) -20, new BufferedStream(bs));
		}
		class249.method3089((byte) 115);
		if (class249.anInt3160 == 2 && Class269.aHashTable3465.method1518(3512, (long) i_0_) == null) {
			Class269.aHashTable3465.method1515((long) i_0_, new Node_Sub32(Class262_Sub13.anInt7806), -125);
			Class198.aClass249Array2428[Class262_Sub13.anInt7806++] = class249;
		}
		Class379.aClass61_4872.method601(class249, 25566, (long) i_0_);
		return class249;
	}
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		anInt8210++;
		if (bool != false) {
			method3680(55, -37);
		}
	}
	
	static final void method3681(int i) {
		anInt8209++;
		if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -11 && i == 11439) {
			Node_Sub38_Sub8.anInt10163 = 11;
		}
	}
}
