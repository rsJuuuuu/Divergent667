/* Class188_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class188_Sub2 extends Class188
{
	static int anInt6866;
	static int anInt6867;
	static boolean aBoolean6868 = false;
	static int anInt6869;
	private byte[] aByteArray6870;
	private int anInt6871;
	static int anInt6872;
	static int anInt6873;
	private int[] anIntArray6874 = new int[anInt2282];
	static Class68 aClass68_6875 = new Class68(1);
	static int anInt6876;
	static int[] anIntArray6877 = { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
	private int anInt6878;
	
	static final void method1903(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt6866++;
		int i_7_ = 0;
		int i_8_ = i_2_;
		int i_9_ = 0;
		int i_10_ = -i_3_ + i_0_;
		int i_11_ = i_2_ + -i_3_;
		int i_12_ = i_0_ * i_0_;
		int i_13_ = i_2_ * i_2_;
		int i_14_ = i_10_ * i_10_;
		int i_15_ = i_11_ * i_11_;
		int i_16_ = i_13_ << 1;
		int i_17_ = i_12_ << 1;
		int i_18_ = i_15_ << 1;
		int i_19_ = i_14_ << 1;
		int i_20_ = i_2_ << 1;
		int i_21_ = i_11_ << 1;
		int i_22_ = (-i_20_ + 1) * i_12_ - -i_16_;
		int i_23_ = -(i_17_ * (-1 + i_20_)) + i_13_;
		int i_24_ = (-i_21_ + 1) * i_14_ + i_18_;
		int i_25_ = i_15_ + -(i_19_ * (-1 + i_21_));
		int i_26_ = i_12_ << 2;
		int i_27_ = i_13_ << 2;
		int i_28_ = i_14_ << 2;
		int i_29_ = i_15_ << 2;
		int i_30_ = 3 * i_16_;
		int i_31_ = (i_20_ + -3) * i_17_;
		int i_32_ = i_18_ * i_4_;
		int i_33_ = (-3 + i_21_) * i_19_;
		int i_34_ = i_27_;
		int i_35_ = (-1 + i_2_) * i_26_;
		int i_36_ = i_29_;
		int i_37_ = (-1 + i_11_) * i_28_;
		int[] is = Class169_Sub4.anIntArrayArray8826[i_5_];
		Class369.method4086(-i_10_ + i_6_, i_1_, i_6_ + -i_0_, is, 0);
		Class369.method4086(i_10_ + i_6_, i, i_6_ - i_10_, is, 0);
		Class369.method4086(i_6_ + i_0_, i_1_, i_10_ + i_6_, is, 0);
		while ((i_8_ ^ 0xffffffff) < -1) {
			boolean bool = i_8_ <= i_11_;
			if (bool) {
				if ((i_24_ ^ 0xffffffff) > -1) {
					while ((i_24_ ^ 0xffffffff) > -1) {
						i_24_ += i_32_;
						i_25_ += i_36_;
						i_9_++;
						i_36_ += i_29_;
						i_32_ += i_29_;
					}
				}
				if (i_25_ < 0) {
					i_24_ += i_32_;
					i_25_ += i_36_;
					i_36_ += i_29_;
					i_32_ += i_29_;
					i_9_++;
				}
				i_25_ += -i_33_;
				i_24_ += -i_37_;
				i_37_ -= i_28_;
				i_33_ -= i_28_;
			}
			if (i_22_ < 0) {
				while (i_22_ < 0) {
					i_22_ += i_30_;
					i_23_ += i_34_;
					i_7_++;
					i_34_ += i_27_;
					i_30_ += i_27_;
				}
			}
			if (i_23_ < 0) {
				i_23_ += i_34_;
				i_22_ += i_30_;
				i_34_ += i_27_;
				i_7_++;
				i_30_ += i_27_;
			}
			i_22_ += -i_35_;
			i_23_ += -i_31_;
			i_8_--;
			i_35_ -= i_26_;
			i_31_ -= i_26_;
			int i_38_ = i_5_ - i_8_;
			int i_39_ = i_8_ + i_5_;
			int i_40_ = i_7_ + i_6_;
			int i_41_ = -i_7_ + i_6_;
			if (bool) {
				int i_42_ = i_9_ + i_6_;
				int i_43_ = i_6_ + -i_9_;
				Class369.method4086(i_43_, i_1_, i_41_, Class169_Sub4.anIntArrayArray8826[i_38_], 0);
				Class369.method4086(i_42_, i, i_43_, Class169_Sub4.anIntArrayArray8826[i_38_], 0);
				Class369.method4086(i_40_, i_1_, i_42_, Class169_Sub4.anIntArrayArray8826[i_38_], 0);
				Class369.method4086(i_43_, i_1_, i_41_, Class169_Sub4.anIntArrayArray8826[i_39_], 0);
				Class369.method4086(i_42_, i, i_43_, Class169_Sub4.anIntArrayArray8826[i_39_], 0);
				Class369.method4086(i_40_, i_1_, i_42_, Class169_Sub4.anIntArrayArray8826[i_39_], 0);
			} else {
				Class369.method4086(i_40_, i_1_, i_41_, Class169_Sub4.anIntArrayArray8826[i_38_], 0);
				Class369.method4086(i_40_, i_1_, i_41_, Class169_Sub4.anIntArrayArray8826[i_39_], 0);
			}
		}
	}
	
	Class188_Sub2(int i, int i_44_, int i_45_, int i_46_, int i_47_, float f) {
		super(i, i_44_, i_45_, i_46_, i_47_);
		for (int i_48_ = 0; (anInt2282 ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++)
			anIntArray6874[i_48_] = (short) (int) (Math.pow((double) f, (double) i_48_) * 4096.0);
	}
	
	final void method1886(int i) {
		if (i != 4096) {
			anInt6878 = -80;
		}
		anInt6878 = Math.abs(anInt6878);
		anInt6867++;
		if ((anInt6878 ^ 0xffffffff) <= -4097) {
			anInt6878 = 4095;
		}
		method1905((byte) -11, anInt6871++, (byte) (anInt6878 >> 4));
		anInt6878 = 0;
	}
	
	final void method1890(int i) {
		anInt6878 = i;
		anInt6873++;
		anInt6871 = 0;
	}
	
	final void method1887(int i, int i_49_, int i_50_) {
		if (i_50_ != -15030) {
			method1904(false);
		}
		anInt6878 += anIntArray6874[i_49_] * i >> 12;
		anInt6876++;
	}
	
	public static void method1904(boolean bool) {
		if (bool != false) {
			method1903(73, -97, -35, 74, 116, 49, -92, -95);
		}
		anIntArray6877 = null;
		aClass68_6875 = null;
	}
	
	void method1905(byte b, int i, byte b_51_) {
		aByteArray6870[anInt6871++] = (byte) (127 + (Node_Sub30.method2723(b_51_, 255) >> 1));
		anInt6872++;
		if (b != -11) {
			method1886(33);
		}
	}
}
