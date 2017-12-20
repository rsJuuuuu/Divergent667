/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class309
{
	static int anInt3917;
	
	static final void method3586(int i) {
		anInt3917++;
		if (Class109.anInt1367 != -1 && Class203.anInt2452 != -1) {
			int i_0_ = Node_Sub6.anInt7056 + ((Class221.anInt2633 + -Node_Sub6.anInt7056) * Class141.anInt1758 >> 16);
			Class141.anInt1758 += i_0_;
			if (Class141.anInt1758 < 65535) {
				Class230.aBoolean5217 = false;
				Class146.aBoolean1816 = false;
			} else {
				Class141.anInt1758 = 65535;
                Class146.aBoolean1816 = !Class230.aBoolean5217;
				Class230.aBoolean5217 = true;
			}
			float f = (float) Class141.anInt1758 / 65535.0F;
			float[] fs = new float[3];
			int i_1_ = 2 * Class290_Sub5.anInt8107;
			int i_2_ = 0;
			@SuppressWarnings("unused")
			int i_3_ = 111 / ((14 - i) / 59);
			for (/**/; (i_2_ ^ 0xffffffff) > -4; i_2_++) {
				int i_4_ = 3 * Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_][i_2_];
				int i_5_ = Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][1 + i_1_][i_2_] * 3;
				int i_6_ = (Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_ - -2][i_2_] + (-Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][3 + i_1_][i_2_] + Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][2 + i_1_][i_2_])) * 3;
				int i_7_ = Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_][i_2_];
				int i_8_ = -i_4_ + i_5_;
				int i_9_ = i_6_ + (-(2 * i_5_) + i_4_);
				int i_10_ = Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_ + 2][i_2_] - (i_7_ - (i_5_ - i_6_));
				fs[i_2_] = (float) i_7_ + ((float) i_8_ + (f * (float) i_10_ + (float) i_9_) * f) * f;
			}
			Node_Sub10.anInt7079 = -(512 * Class320_Sub4.gameSceneBaseY) + (int) fs[2];
			Class190.anInt2331 = (int) fs[1] * -1;
			Class98.anInt5061 = (int) fs[0] - Node_Sub53.gameSceneBaseX * 512;
			float[] fs_11_ = new float[3];
			int i_12_ = Class66_Sub2_Sub1.anInt10582 * 2;
			for (int i_13_ = 0; i_13_ < 3; i_13_++) {
				int i_14_ = Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_][i_13_] * 3;
				int i_15_ = 3 * Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_ - -1][i_13_];
				int i_16_ = (Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_ - -2][i_13_] + -Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][3 + i_12_][i_13_] + Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_ + 2][i_13_]) * 3;
				int i_17_ = Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_][i_13_];
				int i_18_ = i_15_ - i_14_;
				int i_19_ = -(i_15_ * 2) + i_14_ - -i_16_;
				int i_20_ = Class277_Sub1.anIntArrayArrayArray8042[Class203.anInt2452][i_12_ + 2][i_13_] + -i_17_ + (i_15_ - i_16_);
				fs_11_[i_13_] = (float) i_17_ + ((float) i_18_ + ((float) i_19_ + (float) i_20_ * f) * f) * f;
			}
			float f_21_ = fs_11_[0] - fs[0];
			float f_22_ = -1.0F * (fs_11_[1] - fs[1]);
			float f_23_ = -fs[2] + fs_11_[2];
			double d = Math.sqrt((double) (f_21_ * f_21_ + f_23_ * f_23_));
			OutcommingPacket.anInt4050 = 0x3fff & (int) (Math.atan2((double) f_22_, d) * 2607.5945876176133);
			Class170.anInt2053 = 0x3fff & (int) (2607.5945876176133 * -Math.atan2((double) f_21_, (double) f_23_));
			Class48.anInt704 = ((-Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_][3] + Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][2 + i_1_][3]) * Class141.anInt1758 >> 16) + Class277_Sub1.anIntArrayArrayArray8042[Class109.anInt1367][i_1_][3];
		}
	}
}
