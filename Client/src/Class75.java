/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75
{
	private int[] anIntArray1001;
	static boolean[][] aBooleanArrayArray1002;
	static Index aClass302_1003;
	static int anInt1004;
	static int[] anIntArray1005 = new int[32];
	static int anInt1006;
	static Class299 aClass299_1007;
	static int anInt1008;
	
	static final void method763(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt1008++;
		if (i_2_ == -1) {
			if ((i_1_ + -i_3_ ^ 0xffffffff) <= (Class262_Sub4.anInt7722 ^ 0xffffffff) && (za_Sub2.anInt10513 ^ 0xffffffff) <= (i_1_ - -i_3_ ^ 0xffffffff) && -i_3_ + i >= Class384.anInt4906 && (i - -i_3_ ^ 0xffffffff) >= (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff)) {
				Class143.method1623(i_1_, i_0_, -957563775, i_3_, i);
			} else {
				Class88.method1018(i, i_3_, i_0_, i_1_, -95);
			}
		}
	}
	
	public static void method764(int i) {
		aClass302_1003 = null;
		if (i != 0) {
			method765(-40, (byte) 39, 114, null);
		}
		aClass299_1007 = null;
		anIntArray1005 = null;
		aBooleanArrayArray1002 = null;
	}
	
	static final String method765(int i, byte b, int i_4_, String[] strings) {
		anInt1006++;
		if ((i ^ 0xffffffff) == -1) {
			return "";
		}
		if (i == 1) {
			String string = strings[i_4_];
			if (string == null) {
				return "null";
			}
			return string.toString();
		}
		int i_5_ = i + i_4_;
		int i_6_ = 0;
		@SuppressWarnings("unused")
		int i_7_ = -103 % ((31 - b) / 56);
		for (int i_8_ = i_4_; (i_8_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_8_++) {
			String string = strings[i_8_];
			if (string != null) {
				i_6_ += string.length();
			} else {
				i_6_ += 4;
			}
		}
		StringBuffer stringbuffer = new StringBuffer(i_6_);
		for (int i_9_ = i_4_; i_9_ < i_5_; i_9_++) {
			String string = strings[i_9_];
			if (string != null) {
				stringbuffer.append(string);
			} else {
				stringbuffer.append("null");
			}
		}
		return stringbuffer.toString();
	}
	
	final int method766(int i, int i_10_) {
		anInt1004++;
		int i_11_ = i + (anIntArray1001.length >> 1);
		int i_12_ = i_11_ & i_10_;
		for (;;) {
			int i_13_ = anIntArray1001[i_12_ - -i_12_ - -1];
			if (i_13_ == -1) {
				return -1;
			}
			if ((i_10_ ^ 0xffffffff) == (anIntArray1001[i_12_ + i_12_] ^ 0xffffffff)) {
				return i_13_;
			}
			i_12_ = i_11_ & i_12_ - -1;
		}
	}
	
	Class75(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
			/* empty */
		}
		anIntArray1001 = new int[i + i];
		for (int i_14_ = 0; i_14_ < i - -i; i_14_++)
			anIntArray1001[i_14_] = -1;
		for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
			int i_16_;
			for (i_16_ = -1 + i & is[i_15_]; (anIntArray1001[i_16_ + (i_16_ + 1)] ^ 0xffffffff) != 0; i_16_ = -1 + i & i_16_ - -1) {
				/* empty */
			}
			anIntArray1001[i_16_ + i_16_] = is[i_15_];
			anIntArray1001[i_16_ - (-i_16_ - 1)] = i_15_;
		}
	}
}
