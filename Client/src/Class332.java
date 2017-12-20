/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class332
{
	static int anInt4143;
	static int anInt4144 = 1406;
	static int anInt4145 = 0;
	static int[] anIntArray4146 = new int[3];
	
	static final int method3844(int i) {
		anInt4143++;
		int i_0_;
		if (i < (Class201.anInt2446 ^ 0xffffffff)) {
			i_0_ = 1;
			Node_Sub36.method2752(true, true);
		} else {
			int i_1_ = CacheNode_Sub4.method2302((byte) 88);
			if (i_1_ > 100) {
				if (i_1_ > 500) {
					if (i_1_ > 1000) {
						Node_Sub36.method2752(true, true);
						i_0_ = 1;
					} else {
						Class194_Sub1.method1965((byte) -101);
						i_0_ = 2;
					}
				} else {
					i_0_ = 3;
					Class69.method736(i + 32256);
				}
			} else {
				Class262_Sub15.method3188(18896);
				i_0_ = 4;
			}
		}
		if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) != 0) {
			Class213.aNode_Sub27_2512.method2690(104, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
			Class22.method300(0, true, false);
		}
		Node_Sub38_Sub31.method2893(1);
		return i_0_;
	}
	
	public static void method3845(int i) {
		anIntArray4146 = null;
		@SuppressWarnings("unused")
		int i_2_ = -11 % ((-32 - i) / 38);
	}
}
