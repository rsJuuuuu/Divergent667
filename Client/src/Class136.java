/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136
{
	static int anInt1693;
	static int anInt1694;
	static int[] anIntArray1695 = new int[13];
	private GLToolkit aGLToolkit1696;
	static int anInt1697;
	private d aD1698;
	private Class61 aClass61_1699 = new Class61(256);
	static int anInt1700;
	
	public static void method1589(int i) {
		anIntArray1695 = null;
		if (i != 24954) {
			method1590((byte) 43, null);
		}
	}
	
	static final int method1590(byte b, Class372 class372) {
		@SuppressWarnings("unused")
		int i = -28 % ((44 - b) / 53);
		anInt1697++;
		if (Class372.aClass372_4588 == class372) {
			return 5120;
		}
		if (class372 == Class372.aClass372_4592) {
			return 5122;
		}
		if (class372 != Class372.aClass372_4593) {
			if (Class372.aClass372_4594 == class372) {
				return 5121;
			}
			if (class372 == Class372.aClass372_4595) {
				return 5123;
			}
			if (class372 == Class372.aClass372_4596) {
				return 5125;
			}
			if (Class372.aClass372_4597 == class372) {
				return 5131;
			}
			if (Class372.aClass372_4598 == class372) {
				return 5126;
			}
		} else {
			return 5124;
		}
		throw new IllegalArgumentException("");
	}
	
	final void method1591(int i) {
		if (i == -28841) {
			aClass61_1699.method608(false);
			anInt1694++;
		}
	}
	
	final void method1592(boolean bool) {
		aClass61_1699.method598(5, -11819);
		anInt1693++;
		if (bool != true) {
			aGLToolkit1696 = null;
		}
	}
	
	final Class169_Sub2 method1593(byte b, int i) {
		anInt1700++;
		Object object = aClass61_1699.method607((long) i, 0);
		if (object != null) {
			return (Class169_Sub2) object;
		}
		if (!aD1698.method7(9900, i)) {
			return null;
		}
		Class91 class91 = aD1698.method10(i, b ^ 0x2007);
		if (b != -32) {
			method1590((byte) -116, null);
		}
		int i_0_ = class91.aBoolean1204 ? 64 : aGLToolkit1696.anInt6593;
		Class169_Sub2 class169_sub2;
		if (class91.aBoolean1215 && aGLToolkit1696.w()) {
			float[] fs = aD1698.method9(i_0_, i, 0.7F, (byte) -126, i_0_, false);
			class169_sub2 = new Class169_Sub2(aGLToolkit1696, 3553, 34842, i_0_, i_0_, class91.aByte1207 != 0, fs, 6408);
		} else {
			int[] is;
			if ((class91.anInt1226 ^ 0xffffffff) != -3 && Class377_Sub1.method4129((byte) 83, class91.aByte1214)) {
				is = aD1698.method11(i_0_, true, i_0_, i, (byte) 0, 0.7F);
			} else {
				is = aD1698.method8(0.7F, i, i_0_, false, false, i_0_);
			}
			class169_sub2 = new Class169_Sub2(aGLToolkit1696, 3553, 6408, i_0_, i_0_, (class91.aByte1207 ^ 0xffffffff) != -1, is, 0, 0, false);
		}
		class169_sub2.method1776(class91.aBoolean1212, -100, class91.aBoolean1210);
		aClass61_1699.method601(class169_sub2, 25566, (long) i);
		return class169_sub2;
	}
	
	Class136(GLToolkit gltoolkit, d var_d) {
		aD1698 = var_d;
		aGLToolkit1696 = gltoolkit;
	}
}
