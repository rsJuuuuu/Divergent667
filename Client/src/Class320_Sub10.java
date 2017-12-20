/* Class320_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub10 extends Class320
{
	static PlayerUpdateReference[] aClass323Array8296 = new PlayerUpdateReference[2048];
	static int anInt8297;
	static int anInt8298;
	static double aDouble8299;
	static Plane[] aPlaneArray8300;
	static int anInt8301;
	static int anInt8302;
	static int anInt8303;
	static int anInt8304;
	static int anInt8305;
	static int anInt8306;
	
	final void method3673(byte b) {
		if (b <= -35) {
			if (anInt4064 != 1 && anInt4064 != 0) {
				anInt4064 = method3677(0);
			}
			anInt8301++;
		}
	}
	
	final int method3675(int i, byte b) {
		anInt8304++;
		if (b != 54) {
			return -35;
		}
		return 1;
	}
	
	final void method3676(boolean bool, int i) {
		if (bool != false) {
			aPlaneArray8300 = null;
		}
		anInt4064 = i;
		anInt8306++;
	}
	
	Class320_Sub10(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3718(boolean bool) {
		if (bool != false) {
			aDouble8299 = 0.5996684426446508;
		}
		anInt8298++;
		return anInt4064;
	}
	
	final int method3677(int i) {
		if (i != 0) {
			aClass323Array8296 = null;
		}
		anInt8297++;
		return 0;
	}
	
	Class320_Sub10(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	public static void method3719(byte b) {
		aClass323Array8296 = null;
		@SuppressWarnings("unused")
		int i = 39 % ((11 - b) / 51);
		aPlaneArray8300 = null;
	}
	
	static final boolean method3720(int i, int i_0_, int i_1_) {
		if (i != 50560) {
			method3720(33, 110, 2);
		}
		anInt8302++;
        return (0xc580 & i_0_ ^ 0xffffffff) != -1;
    }
	
	static final String[] method3721(int i, String[] strings) {
		anInt8305++;
		String[] strings_2_ = new String[5];
		for (int i_3_ = i; i_3_ < 5; i_3_++) {
			strings_2_[i_3_] = String.valueOf(i_3_) + ": ";
			if (strings != null && strings[i_3_] != null) {
				strings_2_[i_3_] = strings_2_[i_3_] + strings[i_3_];
			}
		}
		return strings_2_;
	}
}
