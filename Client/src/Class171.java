/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class171
{
	static int anInt2057;
	static boolean aBoolean2058 = true;
	protected int anInt2059;
	private int anInt2060;
	protected int anInt2061;
	static Class278 aClass278_2062;
	protected int anInt2063;
	static int anInt2064;
	private int anInt2065;
	static int anInt2066;
	private int anInt2067;
	protected int anInt2068;
	private int anInt2069;
	static int[] anIntArray2070 = new int[500];
	static long aLong2071 = 20000000L;
	protected int anInt2072;
	protected int anInt2073;
	static int anInt2074;
	
	static final Class52 method1792(boolean bool, boolean bool_0_, int i, int i_1_, GraphicsToolkit graphicstoolkit) {
		anInt2057++;
		if (i_1_ > -88) {
			aBoolean2058 = false;
		}
		Class49 class49 = Class268.method3290(bool, (byte) 75, graphicstoolkit, bool_0_, i);
		if (class49 == null) {
			return null;
		}
		return class49.aClass52_721;
	}
	
	final void method1793(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		anInt2067 = i_8_;
		anInt2065 = i_3_;
		anInt2069 = i_7_ * i_7_;
		anInt2060 = i_4_;
		anInt2074++;
		anInt2072 = i + anInt2065;
		anInt2068 = i_2_ + anInt2067;
		anInt2073 = anInt2065 - -i_9_;
		anInt2063 = i_11_ + anInt2060;
		anInt2059 = i_10_ + anInt2060;
		anInt2061 = i_5_ + anInt2067;
		if (i_6_ > -35) {
			method1792(true, false, -33, 54, null);
		}
	}
	
	public static void method1794(int i) {
		aClass278_2062 = null;
		anIntArray2070 = null;
		if (i != 29383) {
			method1792(true, false, -107, -126, null);
		}
	}
	
	final boolean method1795(int i, byte b, int i_12_, int i_13_) {
		anInt2064++;
		if (anInt2059 > i_13_ || anInt2063 < i_13_) {
			return false;
		}
		if ((anInt2072 ^ 0xffffffff) < (i ^ 0xffffffff) || i > anInt2073) {
			return false;
		}
		if (b < 105) {
			method1793(87, 15, -33, 83, -55, -120, -79, 45, -10, -121, 6);
		}
		if (i_12_ < anInt2068 || (anInt2061 ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
			return false;
		}
		int i_14_ = -anInt2060 + i_13_;
		int i_15_ = i_12_ - anInt2067;
        return (i_15_ * i_15_ + i_14_ * i_14_ ^ 0xffffffff) > (anInt2069 ^ 0xffffffff);
    }
	
	Class171(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		anInt2060 = i;
		anInt2067 = i_17_;
		anInt2065 = i_16_;
		anInt2069 = i_18_ * i_18_;
		anInt2059 = anInt2060 + i_19_;
		anInt2063 = i_20_ + anInt2060;
		anInt2068 = anInt2067 - -i_23_;
		anInt2061 = i_24_ + anInt2067;
		anInt2073 = anInt2065 + i_22_;
		anInt2072 = i_21_ + anInt2065;
	}
}
