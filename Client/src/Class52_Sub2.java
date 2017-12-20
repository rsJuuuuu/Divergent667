/* Class52_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class52_Sub2 extends Class52
{
	private GLToolkit aGLToolkit5563;
	private boolean aBoolean5564;
	private Class169_Sub2_Sub1 aClass169_Sub2_Sub1_5565;
	private Class25 aClass25_5566;
	
	final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
		aGLToolkit5563.method1417(21447);
		aGLToolkit5563.method1444(-2, aClass169_Sub2_Sub1_5565);
		if (aBoolean5564 || bool) {
			aGLToolkit5563.method1474(126, 8448, 7681);
			aGLToolkit5563.method1464(34168, 768, 0, (byte) -51);
		} else {
			aGLToolkit5563.method1474(127, 7681, 7681);
		}
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		aClass25_5566.method310(c, (byte) -22);
		OpenGL.glLoadIdentity();
		if (aBoolean5564 || bool) {
			aGLToolkit5563.method1464(5890, 768, 0, (byte) -51);
		}
	}
	
	final void method526(char c, int i, int i_2_, int i_3_, boolean bool, aa var_aa, int i_4_, int i_5_) {
		aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
		Class169_Sub2_Sub1 class169_sub2_sub1 = var_aa_Sub3.aClass169_Sub2_Sub1_5494;
		aGLToolkit5563.method1417(21447);
		aGLToolkit5563.method1444(-2, aClass169_Sub2_Sub1_5565);
		if (aBoolean5564 || bool) {
			aGLToolkit5563.method1474(-122, 8448, 7681);
			aGLToolkit5563.method1464(34168, 768, 0, (byte) -51);
		} else {
			aGLToolkit5563.method1474(127, 7681, 7681);
		}
		aGLToolkit5563.method1457(33984, 1);
		aGLToolkit5563.method1444(-2, class169_sub2_sub1);
		aGLToolkit5563.method1474(126, 8448, 7681);
		aGLToolkit5563.method1464(34168, 768, 0, (byte) -51);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = class169_sub2_sub1.aFloat10567 / (float) class169_sub2_sub1.anInt10566;
		float f_6_ = class169_sub2_sub1.aFloat10568 / (float) class169_sub2_sub1.anInt10564;
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_4_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_6_, 0.0F, (float) -i_5_ * f_6_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, (byte) (i_3_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_2_, 0.0F);
		aClass25_5566.method310(c, (byte) -126);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aGLToolkit5563.method1464(5890, 768, 0, (byte) -51);
		aGLToolkit5563.method1474(-95, 8448, 8448);
		aGLToolkit5563.method1444(-2, null);
		aGLToolkit5563.method1457(33984, 0);
		if (aBoolean5564 || bool) {
			aGLToolkit5563.method1464(5890, 768, 0, (byte) -51);
		}
	}
	
	Class52_Sub2(GLToolkit gltoolkit, Class357 class357, Class383[] class383s, boolean bool) {
		super(gltoolkit, class357);
		aGLToolkit5563 = gltoolkit;
		int i = 0;
		for (int i_7_ = 0; i_7_ < 256; i_7_++) {
			Class383 class383 = class383s[i_7_];
			if (class383.anInt4900 > i) {
				i = class383.anInt4900;
			}
			if (class383.anInt4897 > i) {
				i = class383.anInt4897;
			}
		}
		int i_8_ = i * 16;
		if (bool) {
			byte[] bs = new byte[i_8_ * i_8_];
			for (int i_9_ = 0; i_9_ < 256; i_9_++) {
				Class383 class383 = class383s[i_9_];
				int i_10_ = class383.anInt4900;
				int i_11_ = class383.anInt4897;
				int i_12_ = i_9_ % 16 * i;
				int i_13_ = i_9_ / 16 * i;
				int i_14_ = i_13_ * i_8_ + i_12_;
				int i_15_ = 0;
				if (class383.aByteArray4905 == null) {
					byte[] bs_16_ = class383.aByteArray4903;
					for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
						for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
							bs[i_14_++] = (byte) (bs_16_[i_15_++] == 0 ? 0 : -1);
						i_14_ += i_8_ - i_11_;
					}
				} else {
					byte[] bs_19_ = class383.aByteArray4905;
					for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
						for (int i_21_ = 0; i_21_ < i_11_; i_21_++)
							bs[i_14_++] = bs_19_[i_15_++];
						i_14_ += i_8_ - i_11_;
					}
				}
			}
			aClass169_Sub2_Sub1_5565 = Class320_Sub21.method3761(i_8_, 6406, 8222, bs, 6406, gltoolkit, i_8_, false);
			aBoolean5564 = true;
		} else {
			int[] is = new int[i_8_ * i_8_];
			for (int i_22_ = 0; i_22_ < 256; i_22_++) {
				Class383 class383 = class383s[i_22_];
				int[] is_23_ = class383.anIntArray4904;
				byte[] bs = class383.aByteArray4905;
				byte[] bs_24_ = class383.aByteArray4903;
				int i_25_ = class383.anInt4900;
				int i_26_ = class383.anInt4897;
				int i_27_ = i_22_ % 16 * i;
				int i_28_ = i_22_ / 16 * i;
				int i_29_ = i_28_ * i_8_ + i_27_;
				int i_30_ = 0;
				if (bs != null) {
					for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
						for (int i_32_ = 0; i_32_ < i_26_; i_32_++) {
							is[i_29_++] = bs[i_30_] << 24 | is_23_[bs_24_[i_30_] & 0xff];
							i_30_++;
						}
						i_29_ += i_8_ - i_26_;
					}
				} else {
					for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
							int i_35_;
							if ((i_35_ = bs_24_[i_30_++]) != 0) {
								is[i_29_++] = ~0xffffff | is_23_[i_35_ & 0xff];
							} else {
								i_29_++;
							}
						}
						i_29_ += i_8_ - i_26_;
					}
				}
			}
			aClass169_Sub2_Sub1_5565 = CacheNode_Sub5.method2308(gltoolkit, 25448, i_8_, false, 0, is, i_8_, 0);
			aBoolean5564 = false;
		}
		aClass169_Sub2_Sub1_5565.method1757(false, false);
		aClass25_5566 = new Class25(gltoolkit, 256);
		float f = aClass169_Sub2_Sub1_5565.aFloat10567 / (float) aClass169_Sub2_Sub1_5565.anInt10566;
		float f_36_ = aClass169_Sub2_Sub1_5565.aFloat10568 / (float) aClass169_Sub2_Sub1_5565.anInt10564;
		for (int i_37_ = 0; i_37_ < 256; i_37_++) {
			Class383 class383 = class383s[i_37_];
			int i_38_ = class383.anInt4900;
			int i_39_ = class383.anInt4897;
			int i_40_ = class383.anInt4898;
			int i_41_ = class383.anInt4902;
			float f_42_ = (float) (i_37_ % 16 * i);
			float f_43_ = (float) (i_37_ / 16 * i);
			float f_44_ = f_42_ * f;
			float f_45_ = f_43_ * f_36_;
			float f_46_ = (f_42_ + (float) i_39_) * f;
			float f_47_ = (f_43_ + (float) i_38_) * f_36_;
			aClass25_5566.method307(i_37_, 4864);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_44_, aClass169_Sub2_Sub1_5565.aFloat10568 - f_45_);
			OpenGL.glVertex2i(i_41_, i_40_);
			OpenGL.glTexCoord2f(f_44_, aClass169_Sub2_Sub1_5565.aFloat10568 - f_47_);
			OpenGL.glVertex2i(i_41_, i_40_ + i_38_);
			OpenGL.glTexCoord2f(f_46_, aClass169_Sub2_Sub1_5565.aFloat10568 - f_47_);
			OpenGL.glVertex2i(i_41_ + i_39_, i_40_ + i_38_);
			OpenGL.glTexCoord2f(f_46_, aClass169_Sub2_Sub1_5565.aFloat10568 - f_45_);
			OpenGL.glVertex2i(i_41_ + i_39_, i_40_);
			OpenGL.glEnd();
			aClass25_5566.method309(false);
		}
	}
}
