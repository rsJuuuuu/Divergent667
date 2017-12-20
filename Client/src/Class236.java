/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class236
{
	static int anInt2887;
	protected int anInt2888;
	static int anInt2889;
	protected int anInt2890;
	protected int anInt2891 = -1;
	protected boolean aBoolean2892;
	private int anInt2893 = 0;
	protected int anInt2894;
	static int anInt2895;
	protected boolean aBoolean2896;
	protected int anInt2897;
	static Class94 aClass94_2898 = new Class94();
	static IComponentDefinitions[] aWidgetArray2899;
	static int anInt2900;
	protected int anInt2901;
	static int anInt2902;
	
	public static void method3011(boolean bool) {
		if (bool != false) {
			anInt2902 = -1;
		}
		aClass94_2898 = null;
		aWidgetArray2899 = null;
	}
	
	static final boolean method3012(int i, int i_0_, int i_1_) {
		anInt2887++;
		if (i_0_ != 0) {
			return false;
		}
        return !(!CacheNode_Sub3.method2296(i_1_, (byte) 109, i) && !Class110.method1135(i, i_1_, false));
    }
	
	private final void method3013(int i, BufferedStream buffer, int i_2_) {
		anInt2900++;
		if ((i ^ 0xffffffff) == -2) {
			anInt2893 = buffer.read24BitInteger();
			method3015(anInt2893, 127);
		} else if ((i ^ 0xffffffff) == -3) {
			anInt2891 = buffer.readUnsignedShort();
			if (anInt2891 == 65535) {
				anInt2891 = -1;
			}
		} else if ((i ^ 0xffffffff) == -4) {
			anInt2894 = buffer.readUnsignedShort() << 2;
		} else if (i != 4) {
			if (i == 5) {
				aBoolean2892 = false;
			}
		} else {
			aBoolean2896 = false;
		}
		@SuppressWarnings("unused")
		int i_3_ = -113 / ((-32 - i_2_) / 58);
	}
	
	final void method3014(BufferedStream buffer, int i) {
		for (;;) {
			int i_4_ = buffer.readUnsignedByte();
			if ((i_4_ ^ 0xffffffff) == -1) {
				break;
			}
			method3013(i_4_, buffer, 108);
		}
		if (i != -1) {
			aBoolean2892 = true;
		}
		anInt2895++;
	}
	
	public Class236() {
		aBoolean2892 = true;
		anInt2894 = 512;
		aBoolean2896 = true;
	}
	
	private final void method3015(int i, int i_5_) {
		anInt2889++;
		double d = (double) ((0xffab7a & i) >> 16) / 256.0;
		double d_6_ = (double) ((i & 0xff74) >> 8) / 256.0;
		double d_7_ = (double) (0xff & i) / 256.0;
		double d_8_ = d;
		if (d_8_ > d_6_) {
			d_8_ = d_6_;
		}
		if (d_8_ > d_7_) {
			d_8_ = d_7_;
		}
		double d_9_ = d;
		if (d_6_ > d_9_) {
			d_9_ = d_6_;
		}
		if (d_7_ > d_9_) {
			d_9_ = d_7_;
		}
		double d_10_ = 0.0;
		double d_11_ = 0.0;
		double d_12_ = (d_8_ + d_9_) / 2.0;
		if (d_8_ != d_9_) {
			if (d_12_ < 0.5) {
				d_11_ = (d_9_ - d_8_) / (d_8_ + d_9_);
			}
			if (d == d_9_) {
				d_10_ = (-d_7_ + d_6_) / (-d_8_ + d_9_);
			} else if (d_9_ != d_6_) {
				if (d_9_ == d_7_) {
					d_10_ = 4.0 + (d - d_6_) / (-d_8_ + d_9_);
				}
			} else {
				d_10_ = (-d + d_7_) / (d_9_ - d_8_) + 2.0;
			}
			if (d_12_ >= 0.5) {
				d_11_ = (-d_8_ + d_9_) / (2.0 - d_9_ - d_8_);
			}
		}
		anInt2897 = (int) (256.0 * d_11_);
		if (i_5_ >= 126) {
			anInt2901 = (int) (d_12_ * 256.0);
			d_10_ /= 6.0;
			if (!(d_12_ > 0.5)) {
				anInt2890 = (int) (512.0 * (d_12_ * d_11_));
			} else {
				anInt2890 = (int) (512.0 * ((1.0 - d_12_) * d_11_));
			}
			if ((anInt2901 ^ 0xffffffff) > -1) {
				anInt2901 = 0;
			} else if ((anInt2901 ^ 0xffffffff) < -256) {
				anInt2901 = 255;
			}
			if ((anInt2897 ^ 0xffffffff) > -1) {
				anInt2897 = 0;
			} else if (anInt2897 > 255) {
				anInt2897 = 255;
			}
			if ((anInt2890 ^ 0xffffffff) > -2) {
				anInt2890 = 1;
			}
			anInt2888 = (int) (d_10_ * (double) anInt2890);
		}
	}
}
