/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class246
{
	static OutcommingPacket aClass318_3103;
	static int anInt3104;
	static int anInt3105;
	static int anInt3106;
	static int[] anIntArray3107;
	static int anInt3108 = 1;
	
	static final void method3071(byte b) {
		Class270_Sub2_Sub2.aHashTable10552.method1517(false);
		anInt3104++;
		Node_Sub5.aClass158_7027.method1722(true);
		Class72.aClass158_974.method1722(true);
		if (b != -44) {
			aClass318_3103 = null;
		}
	}
	
	static final void method3072(byte b) {
		Class169.aShort4961 = Animable_Sub2_Sub2.aShort10750;
		Node_Sub38_Sub23.aShort10345 = Class291.aShort3667;
		StandardPlane.aShort7990 = Class18.aShort310;
		Node_Sub38_Sub22.aShort10325 = OutcommingPacket.aShort4053;
		if (b <= 5) {
			method3071((byte) 79);
		}
		anInt3105++;
		Class186.aBoolean2255 = true;
		if (Class270_Sub1.anInt8034 != 0 && Class259.anInt3254 != 0) {
			OutcommingPacket.aShort4053 = Class18.aShort310 = (short) 334;
			Animable_Sub2_Sub2.aShort10750 = Class291.aShort3667 = (short) (512 * Class270_Sub1.anInt8034 / Class259.anInt3254);
		}
	}
	
	static final void method3073(int i) {
		anInt3106++;
		if (Class85.anIntArray1158 == null) {
			Class85.anIntArray1158 = new int[65536];
		} else {
			return;
		}
		double d = Math.random() * 0.03 - 0.015 + 0.7;
		if (i <= 67) {
			method3073(-11);
		}
		for (int i_0_ = 0; i_0_ < 65536; i_0_++) {
			double d_1_ = 0.0078125 + (double) (i_0_ >> 10 & 0x3f) / 64.0;
			double d_2_ = 0.0625 + (double) ((i_0_ & 0x3d8) >> 7) / 8.0;
			double d_3_ = (double) (0x7f & i_0_) / 128.0;
			double d_4_ = d_3_;
			double d_5_ = d_3_;
			double d_6_ = d_3_;
			if (d_2_ != 0.0) {
				double d_7_;
				if (!(d_3_ < 0.5)) {
					d_7_ = d_3_ + d_2_ - d_2_ * d_3_;
				} else {
					d_7_ = (1.0 + d_2_) * d_3_;
				}
				double d_8_ = d_3_ * 2.0 - d_7_;
				double d_9_ = 0.3333333333333333 + d_1_;
				if (d_9_ > 1.0) {
					d_9_--;
				}
				double d_10_ = d_1_;
				double d_11_ = -0.3333333333333333 + d_1_;
				if (d_11_ < 0.0) {
					d_11_++;
				}
				if (d_10_ * 6.0 < 1.0) {
					d_5_ = d_8_ + d_10_ * (6.0 * (-d_8_ + d_7_));
				} else if (2.0 * d_10_ < 1.0) {
					d_5_ = d_7_;
				} else if (!(3.0 * d_10_ < 2.0)) {
					d_5_ = d_8_;
				} else {
					d_5_ = (-d_8_ + d_7_) * (-d_10_ + 0.6666666666666666) * 6.0 + d_8_;
				}
				if (!(d_9_ * 6.0 < 1.0)) {
					if (!(d_9_ * 2.0 < 1.0)) {
						if (!(3.0 * d_9_ < 2.0)) {
							d_4_ = d_8_;
						} else {
							d_4_ = d_8_ + 6.0 * ((d_7_ - d_8_) * (0.6666666666666666 - d_9_));
						}
					} else {
						d_4_ = d_7_;
					}
				} else {
					d_4_ = d_9_ * (6.0 * (-d_8_ + d_7_)) + d_8_;
				}
				if (6.0 * d_11_ < 1.0) {
					d_6_ = d_8_ + (-d_8_ + d_7_) * 6.0 * d_11_;
				} else if (2.0 * d_11_ < 1.0) {
					d_6_ = d_7_;
				} else if (!(d_11_ * 3.0 < 2.0)) {
					d_6_ = d_8_;
				} else {
					d_6_ = (-d_11_ + 0.6666666666666666) * (-d_8_ + d_7_) * 6.0 + d_8_;
				}
			}
			d_4_ = Math.pow(d_4_, d);
			d_5_ = Math.pow(d_5_, d);
			d_6_ = Math.pow(d_6_, d);
			int i_12_ = (int) (d_4_ * 256.0);
			int i_13_ = (int) (d_5_ * 256.0);
			int i_14_ = (int) (256.0 * d_6_);
			int i_15_ = i_14_ + ((i_12_ << 16) - -(i_13_ << 8));
			Class85.anIntArray1158[i_0_] = i_15_;
		}
	}
	
	public static void method3074(int i) {
		aClass318_3103 = null;
		if (i <= -68) {
			anIntArray3107 = null;
		}
	}
	
	static {
		anIntArray3107 = new int[2];
		aClass318_3103 = new OutcommingPacket(60, -1);
	}
}
