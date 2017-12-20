/* Class320_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub22 extends Class320
{
	static int anInt8414;
	static int anInt8415;
	static int anInt8416;
	static int[] anIntArray8417;
	static Class46[] aClass46Array8418;
	static int anInt8419;
	static int anInt8420;
	static int anInt8421;
	static int anInt8422;
	static long[] aLongArray8423 = new long[100];
	static int anInt8424;
	static int[][] anIntArrayArray8425 = { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
	
	Class320_Sub22(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final void method3673(byte b) {
		if (b < -35) {
			if (anInt4064 < 0 || anInt4064 > 4) {
				anInt4064 = method3677(0);
			}
			anInt8424++;
		}
	}
	
	final int method3765(boolean bool) {
		anInt8414++;
		if (bool != false) {
			anIntArray8417 = null;
		}
		return anInt4064;
	}
	
	Class320_Sub22(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			return -103;
		}
		anInt8419++;
		return 1;
	}
	
	static final int method3766(byte b, int i, char c) {
		anInt8421++;
		int i_0_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			int i_1_ = Character.toLowerCase(c);
			i_0_ = (i_1_ << 4) - -1;
		}
		if (b < 92) {
			return 105;
		}
		return i_0_;
	}
	
	final void method3676(boolean bool, int i) {
		if (bool != false) {
			anInt8415 = -107;
		}
		anInt4064 = i;
		anInt8422++;
	}
	
	final int method3677(int i) {
		if (i != 0) {
			return -59;
		}
		anInt8420++;
		return 3;
	}
	
	public static void method3767(int i) {
		aClass46Array8418 = null;
		if (i != -14965) {
			method3767(-39);
		}
		anIntArrayArray8425 = null;
		anIntArray8417 = null;
		aLongArray8423 = null;
	}
}
