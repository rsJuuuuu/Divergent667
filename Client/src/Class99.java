/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99
{
	static int anInt1280;
	protected int anInt1281;
	static boolean aBoolean1282 = false;
	static int anInt1283;
	private int anInt1284;
	static int anInt1285;
	static int anInt1286 = 0;
	static int anInt1287;
	static int anInt1288;
	static SeekableFile aSeekableFile1289;
	static Class68 aClass68_1290;
	static int anInt1291;
	static int[] anIntArray1292 = new int[8];
	static int anInt1293;
	
	final void method1084(boolean bool) {
		anInt1291++;
		if (bool == true) {
			anInt1281 &= 0x3fff;
		}
	}
	
	public static void method1085(int i) {
		aSeekableFile1289 = null;
		aClass68_1290 = null;
		@SuppressWarnings("unused")
		int i_0_ = -66 / ((45 - i) / 58);
		anIntArray1292 = null;
	}
	
	final int method1086(int i) {
		if (i != 16383) {
			method1089(27, -51, 39, -81);
		}
		anInt1293++;
		return anInt1281 & 0x3fff;
	}
	
	static final boolean method1087(int i, int i_1_, int i_2_, int i_3_, int i_4_, byte b, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt1285++;
		if (b != 89) {
			method1085(91);
		}
		if (!Node_Sub38_Sub37.method2911(i_1_, (byte) 1, i_4_, i_7_)) {
			return false;
		}
		i_4_ = Node_Sub9_Sub1.anIntArray9686[1];
		i_1_ = Node_Sub9_Sub1.anIntArray9686[2];
		i_7_ = Node_Sub9_Sub1.anIntArray9686[0];
		if (!Node_Sub38_Sub37.method2911(i_5_, (byte) 1, i_2_, i)) {
			return false;
		}
		i = Node_Sub9_Sub1.anIntArray9686[0];
		i_2_ = Node_Sub9_Sub1.anIntArray9686[1];
		i_5_ = Node_Sub9_Sub1.anIntArray9686[2];
		if (!Node_Sub38_Sub37.method2911(i_6_, (byte) 1, i_3_, i_8_)) {
			return false;
		}
		i_3_ = Node_Sub9_Sub1.anIntArray9686[1];
		i_8_ = Node_Sub9_Sub1.anIntArray9686[0];
		i_6_ = Node_Sub9_Sub1.anIntArray9686[2];
		return Node.method2163(i_7_, i_4_, i_6_, (byte) -42, i_5_, i_3_, i_8_, i_2_, i_1_, i);
	}
	
	final void method1088(byte b, int i) {
		anInt1281 = i;
		anInt1288++;
		if (b >= 46) {
			anInt1284 = 0;
		}
	}
	
	final boolean method1089(int i, int i_9_, int i_10_, int i_11_) {
		anInt1287++;
		int i_12_ = anInt1284;
		if (i == anInt1281 && anInt1284 == 0) {
			return false;
		}
		boolean bool;
		if ((anInt1284 ^ 0xffffffff) == -1) {
			if ((i ^ 0xffffffff) < (anInt1281 ^ 0xffffffff) && (i ^ 0xffffffff) >= (i_11_ + anInt1281 ^ 0xffffffff) || anInt1281 > i && (-i_11_ + anInt1281 ^ 0xffffffff) >= (i ^ 0xffffffff)) {
				anInt1281 = i;
				return false;
			}
			bool = true;
		} else if (anInt1284 > 0 && (anInt1281 ^ 0xffffffff) > (i ^ 0xffffffff)) {
			int i_13_ = anInt1284 * anInt1284 / (2 * i_11_);
			int i_14_ = i_13_ + anInt1281;
            bool = !(i <= i_14_ || i_14_ < anInt1281);
		} else if (anInt1284 >= 0 || i >= anInt1281) {
			bool = false;
		} else {
			int i_15_ = anInt1284 * anInt1284 / (2 * i_11_);
			int i_16_ = anInt1281 + -i_15_;
            bool = !((i ^ 0xffffffff) <= (i_16_ ^ 0xffffffff) || i_16_ > anInt1281);
		}
		if (i_10_ != -21712) {
			method1088((byte) -95, -89);
		}
		if (bool) {
			if (i > anInt1281) {
				anInt1284 += i_11_;
				if ((i_9_ ^ 0xffffffff) != -1 && (i_9_ ^ 0xffffffff) > (anInt1284 ^ 0xffffffff)) {
					anInt1284 = i_9_;
				}
			} else {
				anInt1284 -= i_11_;
				if ((i_9_ ^ 0xffffffff) != -1 && -i_9_ > anInt1284) {
					anInt1284 = -i_9_;
				}
			}
			if (anInt1284 != i_12_) {
				int i_17_ = anInt1284 * anInt1284 / (2 * i_11_);
				if ((i ^ 0xffffffff) >= (anInt1281 ^ 0xffffffff)) {
					if (anInt1281 > i && anInt1281 + -i_17_ < i) {
						anInt1284 = i_12_;
					}
				} else if ((i_17_ + anInt1281 ^ 0xffffffff) < (i ^ 0xffffffff)) {
					anInt1284 = i_12_;
				}
			}
		} else if ((anInt1284 ^ 0xffffffff) < -1) {
			anInt1284 -= i_11_;
			if ((anInt1284 ^ 0xffffffff) > -1) {
				anInt1284 = 0;
			}
		} else {
			anInt1284 += i_11_;
			if (anInt1284 > 0) {
				anInt1284 = 0;
			}
		}
		anInt1281 += anInt1284 + i_12_ >> 1;
		return bool;
	}
	
	static {
		anInt1283 = -1;
		aClass68_1290 = new Class68(4);
	}
}
