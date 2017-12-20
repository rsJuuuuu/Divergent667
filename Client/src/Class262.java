/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class262
{
	protected int anInt3323;
	static int anInt3324;
	static int anInt3325;
	static IncommingPacket aClass192_3326 = new IncommingPacket(142, 0);
	static IncommingPacket aClass192_3327 = new IncommingPacket(103, 2);
	static int[][] anIntArrayArray3328 = { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
	
	boolean method3145(boolean bool) {
		if (bool != true) {
			aClass192_3327 = null;
		}
		anInt3324++;
		return true;
	}
	
	static final void method3146(GLToolkit gltoolkit, boolean bool) {
		if (Class320_Sub28.anObject8474 == null) {
			Class188_Sub1_Sub2 class188_sub1_sub2 = new Class188_Sub1_Sub2();
			byte[] bs = class188_sub1_sub2.method1898(128, 128, 16, 11);
			Class320_Sub28.anObject8474 = Class135.method1588(bs, 23386, false);
		}
		anInt3325++;
		if (bool != true) {
			aClass192_3327 = null;
		}
		if (Class88.anObject5281 == null) {
			Class188_Sub2_Sub1 class188_sub2_sub1 = new Class188_Sub2_Sub1();
			byte[] bs = class188_sub2_sub1.method1909(0, 128, 128, 16);
			Class88.anObject5281 = Class135.method1588(bs, 23386, false);
		}
		Class167 class167 = gltoolkit.aClass167_6607;
		if (class167.method1751(82) && Node_Sub6.anObject7050 == null) {
			byte[] bs = Class320_Sub20.method3756(16, 8, 128, 4.0F, 4.0F, 0.5F, 0, 128, 16.0F, 0.6F, new Class328_Sub1(419684));
			Node_Sub6.anObject7050 = Class135.method1588(bs, 23386, false);
		}
	}
	
	Class262(BufferedStream buffer) {
		anInt3323 = buffer.readUnsignedShort();
	}
	
	public static void method3147(int i) {
		@SuppressWarnings("unused")
		int i_0_ = 55 / ((47 - i) / 43);
		aClass192_3327 = null;
		aClass192_3326 = null;
		anIntArrayArray3328 = null;
	}
	
	abstract void method3148(int i);
}
