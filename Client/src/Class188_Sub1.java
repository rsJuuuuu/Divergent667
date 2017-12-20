/* Class188_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class188_Sub1 extends Class188
{
	static Index aClass302_6849;
	static int anInt6850;
	private int anInt6851;
	static int anInt6852;
	private int anInt6853;
	private int anInt6854;
	private int anInt6855;
	static int anInt6856;
	static int anInt6857;
	private int anInt6858;
	static int[] SKILL_XP = new int[25];
	private int anInt6860;
	private byte[] aByteArray6861;
	private int anInt6862;
	private int anInt6863;
	static int anInt6864 = 2;
	static int anInt6865;
	
	void method1891(int i, byte b, byte b_0_) {
		aByteArray6861[i] = b;
		anInt6850++;
		if (b_0_ < 77) {
			method1890(72);
		}
	}
	
	Class188_Sub1(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f, float f_5_, float f_6_) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		anInt6860 = (int) (f_5_ * 4096.0F);
		anInt6855 = (int) (f_6_ * 4096.0F);
		anInt6851 = anInt6853 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}
	
	final void method1887(int i, int i_7_, int i_8_) {
		if (i_8_ != -15030) {
			anInt6862 = 86;
		}
		if (i_7_ == 0) {
			anInt6863 = anInt6860 - ((i ^ 0xffffffff) <= -1 ? i : -i);
			anInt6862 = 4096;
			anInt6863 = anInt6863 * anInt6863 >> 12;
			anInt6854 = anInt6863;
		} else {
			anInt6862 = anInt6863 * anInt6855 >> 12;
			anInt6863 = -((i ^ 0xffffffff) > -1 ? -i : i) + anInt6860;
			if (anInt6862 < 0) {
				anInt6862 = 0;
			} else if (anInt6862 > 4096) {
				anInt6862 = 4096;
			}
			anInt6863 = anInt6863 * anInt6863 >> 12;
			anInt6863 = anInt6863 * anInt6862 >> 12;
			anInt6854 += anInt6851 * anInt6863 >> 12;
			anInt6851 = anInt6853 * anInt6851 >> 12;
		}
		anInt6856++;
	}
	
	final void method1886(int i) {
		anInt6851 = anInt6853;
		anInt6854 >>= 4;
		anInt6865++;
		if (anInt6854 < 0) {
			anInt6854 = 0;
		} else if ((anInt6854 ^ 0xffffffff) < -256) {
			anInt6854 = 255;
		}
		if (i != 4096) {
			method1886(-36);
		}
		method1891(anInt6858++, (byte) anInt6854, (byte) 118);
		anInt6854 = 0;
	}
	
	final void method1890(int i) {
		anInt6857++;
		anInt6854 = 0;
		anInt6858 = i;
	}
	
	public static void method1892(int i) {
		SKILL_XP = null;
		if (i != 4) {
			SKILL_XP = null;
		}
		aClass302_6849 = null;
	}
}
