/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub1 extends RuntimeException
{
	private static final long serialVersionUID = -4290061224504290613L;
	static int anInt4915;
	static int anInt4916;
	static int anInt4917;
	static int anInt4918;
	protected String aString4919;
	static OutcommingPacket aClass318_4920 = new OutcommingPacket(39, 12);
	protected Throwable aThrowable4921;
	static int anInt4922 = 0;
	
	static final boolean method4207(int i, int i_0_) {
		anInt4917++;
		if (i_0_ != 19154) {
			aClass318_4920 = null;
		}
        return !(i != 0 && (i ^ 0xffffffff) != -2 && i != 2);
    }
	
	public static void method4208(byte b) {
		if (b >= -59) {
			method4208((byte) 95);
		}
		aClass318_4920 = null;
	}
	
	static final void method4209(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		anInt4915++;
		if (i_3_ > -41) {
			method4207(38, 72);
		}
		if ((i_8_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff) && i_1_ == i && i_4_ == i_9_ && (i_7_ ^ 0xffffffff) == (i_6_ ^ 0xffffffff)) {
			Node_Sub38_Sub19.method2851(i_5_, i_9_, i_2_, (byte) 127, i_7_, i);
		} else {
			int i_10_ = i_5_;
			int i_11_ = i;
			int i_12_ = 3 * i_5_;
			int i_13_ = 3 * i;
			int i_14_ = 3 * i_8_;
			int i_15_ = 3 * i_1_;
			int i_16_ = i_4_ * 3;
			int i_17_ = 3 * i_6_;
			int i_18_ = i_14_ + -i_16_ + i_9_ + -i_5_;
			int i_19_ = -i + i_15_ + -i_17_ + i_7_;
			int i_20_ = i_12_ + (-i_14_ + i_16_) - i_14_;
			int i_21_ = i_13_ + (-i_15_ + -i_15_) + i_17_;
			int i_22_ = i_14_ + -i_12_;
			int i_23_ = -i_13_ + i_15_;
			for (int i_24_ = 128; (i_24_ ^ 0xffffffff) >= -4097; i_24_ += 128) {
				int i_25_ = i_24_ * i_24_ >> 12;
				int i_26_ = i_24_ * i_25_ >> 12;
				int i_27_ = i_26_ * i_18_;
				int i_28_ = i_19_ * i_26_;
				int i_29_ = i_25_ * i_20_;
				int i_30_ = i_25_ * i_21_;
				int i_31_ = i_24_ * i_22_;
				int i_32_ = i_24_ * i_23_;
				int i_33_ = i_5_ + (i_27_ + (i_29_ + i_31_) >> 12);
				int i_34_ = i - -(i_28_ - (-i_30_ - i_32_) >> 12);
				Node_Sub38_Sub19.method2851(i_10_, i_33_, i_2_, (byte) 127, i_34_, i_11_);
				i_11_ = i_34_;
				i_10_ = i_33_;
			}
		}
	}
	
	static final void method4210(byte b) {
		anInt4918++;
		Class338.anInt4190 = 0;
		Class259.anInt3300 = 0;
		if (b != -12) {
			method4209(-51, -121, -69, 31, 29, 2, 124, -13, 28, 37);
		}
		for (int i = 0; Class290_Sub11.anInt8181 > i; i++) {
			int i_35_ = Class117.anInt1479 * i;
			for (int i_36_ = 0; i_36_ < Class117.anInt1479; i_36_++) {
				int i_37_ = i_36_ + i_35_;
				Class352.anInterface6Array4332[i_37_].method18(i_36_ * StandardSprite.anInt8946, aa_Sub3.anInt5493 * i, StandardSprite.anInt8946, aa_Sub3.anInt5493, 0, 0, true, true);
			}
		}
	}
	
	RuntimeException_Sub1(Throwable throwable, String string) {
		aThrowable4921 = throwable;
		aString4919 = string;
	}
}
