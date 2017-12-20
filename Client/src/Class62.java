/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62
{
	static Class61 aClass61_904 = new Class61(8);
	static int anInt905 = -1;
	static int anInt906;
	
	public static void method609(byte b) {
		int i = 126 / ((-24 - b) / 49);
		aClass61_904 = null;
	}
	
	static final void method610(int i, int i_0_, int i_1_, int i_2_, byte b, int i_3_, int i_4_) {
		Class262_Sub11.method3175(i_2_, 111);
		anInt906++;
		int i_5_ = 0;
		int i_6_ = i_2_ + -i_4_;
		if (i_6_ < 0) {
			i_6_ = 0;
		}
		int i_7_ = i_2_;
		int i_8_ = -i_2_;
		int i_9_ = i_6_;
		if (b != -56) {
			method609((byte) -87);
		}
		int i_10_ = -i_6_;
		int i_11_ = -1;
		int i_12_ = -1;
		int[] is = Class169_Sub4.anIntArrayArray8826[i_1_];
		int i_13_ = -i_6_ + i_3_;
		Class369.method4086(i_13_, i, -i_2_ + i_3_, is, 0);
		int i_14_ = i_3_ + i_6_;
		Class369.method4086(i_14_, i_0_, i_13_, is, b + 56);
		Class369.method4086(i_3_ - -i_2_, i, i_14_, is, 0);
		while (i_5_ < i_7_) {
			i_11_ += 2;
			i_12_ += 2;
			i_10_ += i_12_;
			i_8_ += i_11_;
			if ((i_10_ ^ 0xffffffff) <= -1 && (i_9_ ^ 0xffffffff) <= -2) {
				Class188_Sub1_Sub2.anIntArray9345[i_9_] = i_5_;
				i_9_--;
				i_10_ -= i_9_ << 1;
			}
			i_5_++;
			if ((i_8_ ^ 0xffffffff) <= -1) {
				if (--i_7_ < i_6_) {
					int[] is_15_ = Class169_Sub4.anIntArrayArray8826[i_7_ + i_1_];
					int[] is_16_ = Class169_Sub4.anIntArrayArray8826[-i_7_ + i_1_];
					int i_17_ = Class188_Sub1_Sub2.anIntArray9345[i_7_];
					int i_18_ = i_5_ + i_3_;
					int i_19_ = -i_5_ + i_3_;
					int i_20_ = i_17_ + i_3_;
					int i_21_ = -i_17_ + i_3_;
					Class369.method4086(i_21_, i, i_19_, is_15_, 0);
					Class369.method4086(i_20_, i_0_, i_21_, is_15_, b ^ ~0x37);
					Class369.method4086(i_18_, i, i_20_, is_15_, 0);
					Class369.method4086(i_21_, i, i_19_, is_16_, 0);
					Class369.method4086(i_20_, i_0_, i_21_, is_16_, 0);
					Class369.method4086(i_18_, i, i_20_, is_16_, 0);
				} else {
					int[] is_22_ = Class169_Sub4.anIntArrayArray8826[i_1_ + i_7_];
					int[] is_23_ = Class169_Sub4.anIntArrayArray8826[i_1_ - i_7_];
					int i_24_ = i_3_ - -i_5_;
					int i_25_ = -i_5_ + i_3_;
					Class369.method4086(i_24_, i, i_25_, is_22_, 0);
					Class369.method4086(i_24_, i, i_25_, is_23_, 0);
				}
				i_8_ -= i_7_ << 1;
			}
			int[] is_26_ = Class169_Sub4.anIntArrayArray8826[i_1_ - -i_5_];
			int[] is_27_ = Class169_Sub4.anIntArrayArray8826[i_1_ - i_5_];
			int i_28_ = i_7_ + i_3_;
			int i_29_ = -i_7_ + i_3_;
			if (i_6_ > i_5_) {
				int i_30_ = (i_9_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff) ? Class188_Sub1_Sub2.anIntArray9345[i_5_] : i_9_;
				int i_31_ = i_3_ + i_30_;
				int i_32_ = -i_30_ + i_3_;
				Class369.method4086(i_32_, i, i_29_, is_26_, 0);
				Class369.method4086(i_31_, i_0_, i_32_, is_26_, 0);
				Class369.method4086(i_28_, i, i_31_, is_26_, b ^ ~0x37);
				Class369.method4086(i_32_, i, i_29_, is_27_, 0);
				Class369.method4086(i_31_, i_0_, i_32_, is_27_, 0);
				Class369.method4086(i_28_, i, i_31_, is_27_, 0);
			} else {
				Class369.method4086(i_28_, i, i_29_, is_26_, b + 56);
				Class369.method4086(i_28_, i, i_29_, is_27_, b ^ ~0x37);
			}
		}
	}
}
