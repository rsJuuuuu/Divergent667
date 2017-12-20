/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class214
{
	static int anInt2513;
	protected int anInt2514;
	protected int anInt2515;
	protected int anInt2516;
	protected int anInt2517 = 128;
	protected int anInt2518;
	protected int anInt2519;
	protected int anInt2520 = 128;
	protected int anInt2521;
	static int anInt2522;
	protected int anInt2523;
	static int anInt2524;
	protected int anInt2525;
	protected int anInt2526;
	static int anInt2527;
	static Class262[] aClass262Array2528;
	
	final void method2058(Class214 class214_0_, int i) {
		anInt2523 = class214_0_.anInt2523;
		anInt2516 = class214_0_.anInt2516;
		anInt2517 = class214_0_.anInt2517;
		anInt2520 = class214_0_.anInt2520;
		anInt2519 = class214_0_.anInt2519;
		anInt2525 = class214_0_.anInt2525;
		if (i > 37) {
			anInt2527++;
		}
	}
	
	final Class214 method2059(byte b) {
		anInt2524++;
		if (b > -13) {
			anInt2526 = 99;
		}
		return new Class214(anInt2519, anInt2517, anInt2520, anInt2516, anInt2523, anInt2525);
	}
	
	static final boolean method2060(int i, int i_1_, int i_2_) {
		anInt2522++;
		if (i_2_ <= 89) {
			aClass262Array2528 = null;
		}
        return (i & 0x10000) != 0;
    }
	
	public static void method2061(byte b) {
		aClass262Array2528 = null;
		if (b != -78) {
			method2061((byte) -94);
		}
	}
	
	Class214(int i) {
		anInt2519 = i;
	}
	
	private Class214(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt2516 = i_5_;
		anInt2520 = i_4_;
		anInt2523 = i_6_;
		anInt2517 = i_3_;
		anInt2519 = i;
		anInt2525 = i_7_;
	}
}
