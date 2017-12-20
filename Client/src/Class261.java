/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class261
{
	static HashTable aHashTable3306 = new HashTable(16);
	static int anInt3307;
	protected Animable_Sub2 anAnimable_Sub2_3308;
	static int anInt3309;
	protected Class261 aClass261_3310;
	protected byte aByte3311;
	protected Class256 aClass256_3312;
	protected short aShort3313;
	protected Animable_Sub2 anAnimable_Sub2_3314;
	protected Animable_Sub4 anAnimable_Sub4_3315;
	protected Animable_Sub3 anAnimable_Sub3_3316;
	protected Animable_Sub1 anAnimable_Sub1_3317;
	protected short aShort3318;
	protected Animable_Sub4 anAnimable_Sub4_3319;
	protected short aShort3320;
	static int anInt3321;
	protected short aShort3322;
	
	Class261(int i) {
		aByte3311 = (byte) i;
	}
	
	final void method3141(int i) {
		if (i > -82) {
			aShort3320 = (short) -117;
		}
		Class256 class256;
		for (/**/; aClass256_3312 != null; aClass256_3312 = class256) {
			class256 = aClass256_3312.aClass256_3238;
			aClass256_3312.method3119(-20952);
		}
		anInt3309++;
	}
	
	static final int[][] method3142(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, float f) {
		anInt3307++;
		int[][] is = new int[i_0_][i_4_];
		Node_Sub38_Sub27 node_sub38_sub27 = new Node_Sub38_Sub27();
		node_sub38_sub27.anInt10378 = (int) (4096.0F * f);
		node_sub38_sub27.aBoolean10377 = bool;
		node_sub38_sub27.anInt10384 = i_1_;
		if (i_5_ < 114) {
			method3144(true, 108, -17);
		}
		node_sub38_sub27.anInt10390 = i_2_;
		node_sub38_sub27.anInt10382 = i;
		node_sub38_sub27.method2785(7);
		Class169_Sub1.method1769(485964236, i_0_, i_4_);
		for (int i_6_ = 0; (i_0_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
			node_sub38_sub27.method2880(i_6_, is[i_6_], -52);
		return is;
	}
	
	public static void method3143(int i) {
		aHashTable3306 = null;
		if (i != 4096) {
			aHashTable3306 = null;
		}
	}
	
	static final int method3144(boolean bool, int i, int i_7_) {
		anInt3321++;
		if (bool != false) {
			aHashTable3306 = null;
		}
		if ((i_7_ ^ 0xffffffff) == -2 || i_7_ == 3) {
			return Node_Sub15.anIntArray7129[0x3 & i];
		}
		return Class339_Sub3.anIntArray8665[0x3 & i];
	}
}
