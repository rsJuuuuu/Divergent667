/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class321
{
	static int anInt4066;
	static int[] anIntArray4067;
	static long aLong4068 = 0L;
	static int anInt4069;
	static int anInt4070;
	
	static final void method3799(long l, int i) {
		anInt4066++;
		int i_0_ = Class295.myPlayer.anInt5934 - -Class262_Sub17.anInt7839;
		int i_1_ = Class295.myPlayer.anInt5940 - -Class76.anInt1011;
		if ((-i_0_ + Mobile_Sub4.anInt10987 ^ 0xffffffff) > 1999 || -i_0_ + Mobile_Sub4.anInt10987 > 2000 || (-i_1_ + Class25.anInt444 ^ 0xffffffff) > 1999 || (Class25.anInt444 - i_1_ ^ 0xffffffff) < -2001) {
			Class25.anInt444 = i_1_;
			Mobile_Sub4.anInt10987 = i_0_;
		}
		if ((i_0_ ^ 0xffffffff) != (Mobile_Sub4.anInt10987 ^ 0xffffffff)) {
			int i_2_ = -Mobile_Sub4.anInt10987 + i_0_;
			int i_3_ = (int) (l * (long) i_2_ / 320L);
			if (i_2_ <= 0) {
				if ((i_3_ ^ 0xffffffff) != -1) {
					if ((i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						i_3_ = i_2_;
					}
				} else {
					i_3_ = -1;
				}
			} else if (i_3_ != 0) {
				if ((i_2_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
					i_3_ = i_2_;
				}
			} else {
				i_3_ = 1;
			}
			Mobile_Sub4.anInt10987 += i_3_;
		}
		if (i_1_ != Class25.anInt444) {
			int i_4_ = i_1_ + -Class25.anInt444;
			int i_5_ = (int) ((long) i_4_ * l / 320L);
			if (i_4_ > 0) {
				if ((i_5_ ^ 0xffffffff) == -1) {
					i_5_ = 1;
				} else if (i_5_ > i_4_) {
					i_5_ = i_4_;
				}
			} else if ((i_5_ ^ 0xffffffff) != -1) {
				if (i_4_ > i_5_) {
					i_5_ = i_4_;
				}
			} else {
				i_5_ = -1;
			}
			Class25.anInt444 += i_5_;
		}
		Class257.aFloat3243 += Node_Sub36_Sub1.aFloat10038 * (float) l / 6.0F;
		Node_Sub12.aFloat5450 += (float) l * Class291.aFloat3666 / 6.0F;
		Class169_Sub4.method1787((byte) 12);
		if (i != 320) {
			anIntArray4067 = null;
		}
	}
	
	static final boolean method3800(int i, int i_6_, int i_7_) {
		if (i_7_ != 126) {
			method3799(64L, -95);
		}
		anInt4070++;
        return (i & 0x34) != 0;
    }
	
	static final boolean method3801(byte b, char c) {
		anInt4069++;
		if (c >= 32 && c <= 126) {
			return true;
		}
		if (b <= 100) {
			anIntArray4067 = null;
		}
		if ((c ^ 0xffffffff) <= -161 && (c ^ 0xffffffff) >= -256) {
			return true;
		}
        return (c ^ 0xffffffff) == -8365 || (c ^ 0xffffffff) == -339 || (c ^ 0xffffffff) == -8213 || c == 339 || c == 376;
    }
	
	public static void method3802(int i) {
		if (i != 1999) {
			aLong4068 = 76L;
		}
		anIntArray4067 = null;
	}
	
	static {
		anIntArray4067 = new int[16];
	}
}
