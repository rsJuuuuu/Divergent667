/* IsaacCipher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IsaacCipher
{
	static Class139 aClass139_1829 = new Class139();
	private int anInt1830;
	private int anInt1831;
	private int[] anIntArray1832;
	static int anInt1833;
	private int[] anIntArray1834;
	static int anInt1835;
	private int anInt1836;
	static int anInt1837;
	static int anInt1838;
	private int anInt1839;
	static Class54[] aClass54Array1840;
	
	private final void method1666(int i) {
		anInt1833++;
		int i_1_;
		int i_2_;
		int i_3_;
		int i_4_;
		int i_5_;
		int i_6_;
		int i_7_;
		int i_0_ = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = -1640531527;
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
			i_0_ ^= i_1_ << 11;
			i_1_ += i_2_;
			i_3_ += i_0_;
			i_1_ ^= i_2_ >>> 2;
			i_2_ += i_3_;
			i_4_ += i_1_;
			i_2_ ^= i_3_ << 8;
			i_5_ += i_2_;
			i_3_ += i_4_;
			i_3_ ^= i_4_ >>> 16;
			i_4_ += i_5_;
			i_6_ += i_3_;
			i_4_ ^= i_5_ << 10;
			i_7_ += i_4_;
			i_5_ += i_6_;
			i_5_ ^= i_6_ >>> 4;
			i_0_ += i_5_;
			i_6_ += i_7_;
			i_6_ ^= i_7_ << 8;
			i_7_ += i_0_;
			i_1_ += i_6_;
			i_7_ ^= i_0_ >>> 9;
			i_2_ += i_7_;
			i_0_ += i_1_;
		}
		if (i != 17544) {
			aClass54Array1840 = null;
		}
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -257; i_9_ += 8) {
			i_6_ += anIntArray1832[6 + i_9_];
			i_5_ += anIntArray1832[5 + i_9_];
			i_0_ += anIntArray1832[i_9_];
			i_3_ += anIntArray1832[3 + i_9_];
			i_4_ += anIntArray1832[i_9_ - -4];
			i_7_ += anIntArray1832[i_9_ - -7];
			i_1_ += anIntArray1832[1 + i_9_];
			i_2_ += anIntArray1832[2 + i_9_];
			i_0_ ^= i_1_ << 11;
			i_3_ += i_0_;
			i_1_ += i_2_;
			i_1_ ^= i_2_ >>> 2;
			i_4_ += i_1_;
			i_2_ += i_3_;
			i_2_ ^= i_3_ << 8;
			i_5_ += i_2_;
			i_3_ += i_4_;
			i_3_ ^= i_4_ >>> 16;
			i_6_ += i_3_;
			i_4_ += i_5_;
			i_4_ ^= i_5_ << 10;
			i_7_ += i_4_;
			i_5_ += i_6_;
			i_5_ ^= i_6_ >>> 4;
			i_0_ += i_5_;
			i_6_ += i_7_;
			i_6_ ^= i_7_ << 8;
			i_1_ += i_6_;
			i_7_ += i_0_;
			i_7_ ^= i_0_ >>> 9;
			i_0_ += i_1_;
			i_2_ += i_7_;
			anIntArray1834[i_9_] = i_0_;
			anIntArray1834[1 + i_9_] = i_1_;
			anIntArray1834[i_9_ - -2] = i_2_;
			anIntArray1834[i_9_ + 3] = i_3_;
			anIntArray1834[i_9_ - -4] = i_4_;
			anIntArray1834[5 + i_9_] = i_5_;
			anIntArray1834[6 + i_9_] = i_6_;
			anIntArray1834[i_9_ + 7] = i_7_;
		}
		for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
			i_7_ += anIntArray1834[7 + i_10_];
			i_1_ += anIntArray1834[1 + i_10_];
			i_4_ += anIntArray1834[i_10_ + 4];
			i_3_ += anIntArray1834[i_10_ - -3];
			i_2_ += anIntArray1834[2 + i_10_];
			i_6_ += anIntArray1834[6 + i_10_];
			i_5_ += anIntArray1834[5 + i_10_];
			i_0_ += anIntArray1834[i_10_];
			i_0_ ^= i_1_ << 11;
			i_3_ += i_0_;
			i_1_ += i_2_;
			i_1_ ^= i_2_ >>> 2;
			i_2_ += i_3_;
			i_4_ += i_1_;
			i_2_ ^= i_3_ << 8;
			i_3_ += i_4_;
			i_5_ += i_2_;
			i_3_ ^= i_4_ >>> 16;
			i_4_ += i_5_;
			i_6_ += i_3_;
			i_4_ ^= i_5_ << 10;
			i_7_ += i_4_;
			i_5_ += i_6_;
			i_5_ ^= i_6_ >>> 4;
			i_6_ += i_7_;
			i_0_ += i_5_;
			i_6_ ^= i_7_ << 8;
			i_7_ += i_0_;
			i_1_ += i_6_;
			i_7_ ^= i_0_ >>> 9;
			i_2_ += i_7_;
			i_0_ += i_1_;
			anIntArray1834[i_10_] = i_0_;
			anIntArray1834[1 + i_10_] = i_1_;
			anIntArray1834[i_10_ + 2] = i_2_;
			anIntArray1834[3 + i_10_] = i_3_;
			anIntArray1834[4 + i_10_] = i_4_;
			anIntArray1834[5 + i_10_] = i_5_;
			anIntArray1834[i_10_ + 6] = i_6_;
			anIntArray1834[7 + i_10_] = i_7_;
		}
		method1668(i + 1528001562);
		anInt1831 = 256;
	}
	
	final int method1667(byte b) {
		if (b != -96) {
			return -2;
		}
		if (anInt1831 == 0) {
			method1668(1528019106);
			anInt1831 = 256;
		}
		anInt1835++;
		return 0;//anIntArray1832[--anInt1831];
	}
	
	private final void method1668(int i) {
		anInt1837++;
		if (i != 1528019106) {
			method1666(-91);
		}
		anInt1830 += ++anInt1839;
		for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -257; i_11_++) {
			int i_12_ = anIntArray1834[i_11_];
			if ((i_11_ & 0x2) != 0) {
				if ((0x1 & i_11_ ^ 0xffffffff) == -1) {
					anInt1836 ^= anInt1836 << 2;
				} else {
					anInt1836 ^= anInt1836 >>> 16;
				}
			} else if ((i_11_ & 0x1) != 0) {
				anInt1836 ^= anInt1836 >>> 6;
			} else {
				anInt1836 ^= anInt1836 << 13;
			}
			anInt1836 += anIntArray1834[128 + i_11_ & 0xff];
			int i_13_;
			anIntArray1834[i_11_] = i_13_ = anInt1830 + anIntArray1834[Node_Sub30.method2723(1020, i_12_) >> 2] - -anInt1836;
			anIntArray1832[i_11_] = anInt1830 = anIntArray1834[Node_Sub30.method2723(1020, i_13_ >> 8) >> 2] - -i_12_;
		}
	}
	
	public static void method1669(int i) {
		if (i < 13) {
			method1669(-19);
		}
		aClass54Array1840 = null;
		aClass139_1829 = null;
	}
	
	final int method1670(byte b) {
		if (b != -21) {
			return 127;
		}
		if (anInt1831 == 0) {
			method1668(b ^ ~0x5b13b8b6);
			anInt1831 = 256;
		}
		anInt1838++;
		return 0;//anIntArray1832[anInt1831 + -1];
	}
	
	IsaacCipher(int[] is) {
		anIntArray1832 = new int[256];
		anIntArray1834 = new int[256];
		for (int i = 0; i < is.length; i++)
			anIntArray1832[i] = is[i];
		method1666(17544);
	}
}
