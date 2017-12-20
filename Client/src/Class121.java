/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121
{
	static int anInt1521 = 0;
	protected long aLong1522;
	protected short[] aShortArray1523;
	protected short[] aShortArray1524;
	static int anInt1525;
	protected int[] anIntArray1526;
	static int[] isaacKeys;
	static int[] anIntArray1528;
	static Class206[] aClass206Array1529;
	
	static final boolean method1231(int i, int i_0_, Class54 class54) {
		Class57.aClass336_850.method3853(class54.anIntArray810[i], class54.anIntArray814[i], class54.anIntArray820[i], Node_Sub9_Sub1.anIntArray9686);
		anInt1525++;
		int i_1_ = Node_Sub9_Sub1.anIntArray9686[2];
		if (i_0_ < (i_1_ ^ 0xffffffff)) {
			return false;
		}
		class54.aShortArray809[i] = (short) (aa.anInt100 * Node_Sub9_Sub1.anIntArray9686[0] / i_1_ + Class290_Sub6.anInt8124);
		class54.aShortArray811[i] = (short) (Node_Sub9_Sub1.anIntArray9686[1] * OutputStream_Sub2.anInt96 / i_1_ + Class219.anInt2624);
		class54.aShortArray812[i] = (short) i_1_;
		return true;
	}
	
	public static void method1232(byte b) {
		@SuppressWarnings("unused")
		int i = 75 % ((9 - b) / 51);
		aClass206Array1529 = null;
		anIntArray1528 = null;
		isaacKeys = null;
	}
	
	Class121(long l, int[] is, short[] ses, short[] ses_2_) {
		anIntArray1526 = is;
		aShortArray1523 = ses;
		aShortArray1524 = ses_2_;
		aLong1522 = l;
	}
	
	protected Class121() {
		/* empty */
	}
}
