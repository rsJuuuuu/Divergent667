/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class212 implements Interface8
{
	static int[] anIntArray5128;
	static int anInt5129;
	protected int anInt5130;
	static int anInt5131;
	static int anInt5132;
	static int anInt5133;
	
	static final void method2051(int i, int i_0_, int i_1_, int i_2_, byte b, int i_3_, byte[] bs) {
		anInt5132++;
		if (i_2_ > 0 && !Class371.method4094(i_2_, false)) {
			throw new IllegalArgumentException("");
		}
		if (i_3_ > 0 && !Class371.method4094(i_3_, false)) {
			throw new IllegalArgumentException("");
		}
		int i_4_ = Class349.method3989(i_1_, (byte) -120);
		int i_5_ = 0;
		int i_6_ = i_3_ <= i_2_ ? i_3_ : i_2_;
		int i_7_ = i_2_ >> 1;
		int i_8_ = i_3_ >> 1;
		byte[] bs_9_ = bs;
		byte[] bs_10_ = new byte[i_4_ * i_7_ * i_8_];
		for (;;) {
			OpenGL.glTexImage2Dub(i_0_, i_5_, i, i_2_, i_3_, 0, i_1_, 5121, bs_9_, 0);
			if ((i_6_ ^ 0xffffffff) >= -2) {
				break;
			}
			int i_11_ = i_4_ * i_2_;
			for (int i_12_ = 0; (i_4_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
				int i_13_ = i_12_;
				int i_14_ = i_12_;
				int i_15_ = i_11_ + i_14_;
				for (int i_16_ = 0; (i_8_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
					for (int i_17_ = 0; (i_7_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						int i_18_ = bs_9_[i_14_];
						i_14_ += i_4_;
						i_18_ += bs_9_[i_14_];
						i_14_ += i_4_;
						i_18_ += bs_9_[i_15_];
						i_15_ += i_4_;
						i_18_ += bs_9_[i_15_];
						i_15_ += i_4_;
						bs_10_[i_13_] = (byte) (i_18_ >> 2);
						i_13_ += i_4_;
					}
					i_15_ += i_11_;
					i_14_ += i_11_;
				}
			}
			byte[] bs_19_ = bs_10_;
			bs_10_ = bs_9_;
			i_2_ = i_7_;
			i_3_ = i_8_;
			bs_9_ = bs_19_;
			i_5_++;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_8_ >>= 1;
		}
		if (b != 98) {
			method2053(22, -78, 102, null, -72, 0.4513946F, null, -107, -64, 75, -103);
		}
	}
	
	public final String toString() {
		anInt5133++;
		throw new IllegalStateException();
	}
	
	public static void method2052(int i) {
		anIntArray5128 = null;
		if (i != -2) {
			anIntArray5128 = null;
		}
	}
	
	static final void method2053(int i, int i_20_, int i_21_, float[] fs, int i_22_, float f, float[] fs_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		i_20_ -= i_22_;
		anInt5131++;
		i_21_ -= i_27_;
		i_25_ -= i;
		float f_28_ = fs_23_[2] * (float) i_20_ + (fs_23_[1] * (float) i_21_ + fs_23_[0] * (float) i_25_);
		float f_29_ = (float) i_21_ * fs_23_[4] + fs_23_[3] * (float) i_25_ + (float) i_20_ * fs_23_[5];
		float f_30_ = fs_23_[8] * (float) i_20_ + (fs_23_[7] * (float) i_21_ + fs_23_[6] * (float) i_25_);
		float f_31_ = (float) Math.sqrt((double) (f_28_ * f_28_ + f_29_ * f_29_ + f_30_ * f_30_));
		if (i_26_ != -4) {
			method2052(34);
		}
		float f_32_ = (float) Math.atan2((double) f_28_, (double) f_30_) / 6.2831855F + 0.5F;
		float f_33_ = (float) Math.asin((double) (f_29_ / f_31_)) / 3.1415927F + 0.5F + f;
		if (i_24_ != 1) {
			if (i_24_ == 2) {
				f_32_ = -f_32_;
				f_33_ = -f_33_;
			} else if ((i_24_ ^ 0xffffffff) == -4) {
				float f_34_ = f_32_;
				f_32_ = f_33_;
				f_33_ = -f_34_;
			}
		} else {
			float f_35_ = f_32_;
			f_32_ = -f_33_;
			f_33_ = f_35_;
		}
		fs[0] = f_32_;
		fs[1] = f_33_;
	}
	
	static final void method2054(byte b, int i, Actor actor, int i_36_, Actor actor_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		anInt5129++;
		int i_43_ = actor_37_.method855((byte) -71);
		if ((i_43_ ^ 0xffffffff) != 0) {
			@SuppressWarnings("unused")
			Object object = null;
			if (b == -124) {
				GLSprite glsprite = (GLSprite) Class262_Sub18.aClass61_7842.method607((long) i_43_, 0);
				if (glsprite == null) {
					Class383[] class383s = Class383.method4187(Node_Sub38_Sub39.aClass302_10500, i_43_, 0);
					if (class383s == null) {
						return;
					}
					glsprite = Class93.aGraphicsToolkit1241.a(class383s[0], true);
					Class262_Sub18.aClass61_7842.method601(glsprite, 25566, (long) i_43_);
				}
				Animable_Sub3.method919(actor.plane, 512, actor.anInt5940, 0, actor.anInt5934, false, actor.getSize((byte) 55) * 256);
				int i_44_ = i - (-Class119.anIntArray1516[0] - -18);
				i_44_ += 18 * (i_42_ / 4);
				int i_45_ = -16 + (i_41_ - (-Class119.anIntArray1516[1] + 54));
				i_45_ += 18 * (i_42_ % 4);
				glsprite.setPosition(i_44_, i_45_);
				if (actor_37_ == actor) {
					Class93.aGraphicsToolkit1241.method1234(i_45_ - 1, -256, 18, 18, (byte) 93, -1 + i_44_);
				}
				Class362.method4053(-1 + i_45_, i_45_ - -18, i_44_ + -1, (byte) -92, i_44_ - -18);
				EntityNode_Sub1 entitynode_sub1 = Node_Sub14.method2552(-62);
				entitynode_sub1.anInt5922 = i_44_;
				entitynode_sub1.anActor5925 = actor_37_;
				entitynode_sub1.anInt5928 = i_45_;
				entitynode_sub1.anInt5923 = i_44_ + 16;
				entitynode_sub1.anInt5926 = i_45_ - -16;
				Class82.aClass103_1120.method1110(false, entitynode_sub1);
			}
		}
	}
	
	Class212(String string, int i) {
		anInt5130 = i;
	}
}
