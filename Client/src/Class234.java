/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class234
{
	static int anInt2787;
	static int anInt2788;
	static int anInt2789;
	static boolean[][][] aBooleanArrayArrayArray2790;
	static int anInt2791;
	static int anInt2792 = 0;
	
	static final Class233 method2144(int i) {
		anInt2789++;
		if (i <= 64) {
			anInt2787 = 90;
		}
		try {
			return (Class233) Class.forName("Class233_Sub1").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
	}
	
	public Class234() {
		/* empty */
	}
	
	abstract int method2145(byte b, long l);
	
	abstract void method2146(int i);
	
	final int method2147(long l, int i) {
		anInt2788++;
		if (i <= 50) {
			return -89;
		}
		long l_0_ = method2148((byte) 92);
		if ((l_0_ ^ 0xffffffffffffffffL) < -1L) {
			Class262_Sub22.method3208(l_0_, false);
		}
		return method2145((byte) 84, l);
	}
	
	abstract long method2148(byte b);
	
	public static void method2149(byte b) {
		aBooleanArrayArrayArray2790 = null;
		if (b != -70) {
			anInt2792 = 54;
		}
	}
	
	static final boolean method2150(int i, int i_1_, int i_2_) {
		anInt2791++;
		if (i_1_ != 256) {
			method2144(-6);
		}
        return (i_2_ & 0x100 ^ 0xffffffff) != -1;
    }
	
	abstract long method2151(int i);
	
	static {
		anInt2787 = -1;
	}
}
