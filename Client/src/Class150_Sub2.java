/* Class150_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class150_Sub2 extends Class150
{
	static int anInt8955;
	static int anInt8956;
	static int anInt8957;
	protected int anInt8958;
	protected int anInt8959;
	static boolean[][][] aBooleanArrayArrayArray8960;
	static int anInt8961;
	static Class299 aClass299_8962;
	
	static final boolean method1659(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt8961++;
		if ((i_1_ ^ 0xffffffff) <= (i - -i_3_ ^ 0xffffffff) || i >= i_1_ - -i_0_) {
			return false;
		}
		if ((i_6_ + i_4_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff) || (i_6_ ^ 0xffffffff) <= (i_7_ + i_5_ ^ 0xffffffff)) {
			return false;
		}
        return i_2_ < -12;
    }
	
	public final Class170 method20(int i) {
		anInt8956++;
		if (i <= 81) {
			anInt8958 = 62;
		}
		return Class46.aClass170_680;
	}
	
	static final Class357 method1660(byte b, int i, GraphicsToolkit graphicstoolkit) {
		@SuppressWarnings("unused")
		int i_8_ = -37 / ((b - 30) / 52);
		anInt8957++;
		Class49 class49 = Class268.method3290(true, (byte) 75, graphicstoolkit, true, i);
		if (class49 == null) {
			return null;
		}
		return class49.aClass357_722;
	}
	
	public static void method1661(int i) {
		aBooleanArrayArrayArray8960 = null;
		aClass299_8962 = null;
		if (i > -1) {
			method1660((byte) -98, 49, null);
		}
	}
	
	Class150_Sub2(Class379 class379, Class77 class77, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		super(class379, class77, i, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_);
		anInt8958 = i_16_;
		anInt8959 = i_15_;
	}
}
