/* GLSprite_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class GLSprite_Sub1 extends GLSprite
{
	static int anInt8851;
	private boolean aBoolean8852;
	static int anInt8853;
	private Class169_Sub2_Sub1 aClass169_Sub2_Sub1_8854;
	private Class169_Sub2_Sub1 aClass169_Sub2_Sub1_8855;
	static int anInt8856;
	static double aDouble8857 = -1.0;
	static int anInt8858;
	static int anInt8859;
	static int anInt8860;
	private GLToolkit aGLToolkit8861;
	static int anInt8862;
	static int anInt8863;
	static int anInt8864;
	private int anInt8865 = 0;
	static int anInt8866;
	static int anInt8867;
	static int anInt8868;
	private int anInt8869 = 0;
	static int anInt8870;
	static int anInt8871;
	static int anInt8872;
	static int anInt8873;
	static int anInt8874;
	private int anInt8875 = 0;
	static int anInt8876;
	static int anInt8877;
	private int anInt8878;
	private int anInt8879;
	static int anInt8880;
	
	final void method1190(int i, int i_0_, int i_1_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		anInt8876++;
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass169_Sub2_Sub1_8854 = Class158.method1724(i, aClass169_Sub2_Sub1_8855.anInt10564, aClass169_Sub2_Sub1_8855.anInt10566, (byte) 83, i_0_, aGLToolkit8861);
		anInt8869 = i_1_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}
	
	final void method1184(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		aClass169_Sub2_Sub1_8855.method1757(false, (i_8_ & 0x1 ^ 0xffffffff) != -1);
		anInt8858++;
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1460(i_7_, 3);
		OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_, (byte) (i_6_ >> 24));
		if (aBoolean8852) {
			float f = (float) i_3_ / (float) method1197();
			float f_9_ = (float) i_4_ / (float) method1186();
			float f_10_ = (float) i + f * (float) anInt8879;
			float f_11_ = f_9_ * (float) anInt8865 + (float) i_2_;
			float f_12_ = (float) aClass169_Sub2_Sub1_8855.anInt10566 * f + f_10_;
			float f_13_ = (float) aClass169_Sub2_Sub1_8855.anInt10564 * f_9_ + f_11_;
			if (aClass169_Sub2_Sub1_8854 != null) {
				method1206(true, i_5_);
				aClass169_Sub2_Sub1_8854.method1757(false, true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_10_, f_13_);
				OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
				OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
				OpenGL.glVertex2f(f_12_, f_13_);
				OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glVertex2f(f_12_, f_11_);
				OpenGL.glEnd();
				method1203(0);
			} else {
				aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
				aGLToolkit8861.method1434((byte) 54, i_5_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_10_, f_13_);
				OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
				OpenGL.glVertex2f(f_12_, f_13_);
				OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
				OpenGL.glVertex2f(f_12_, f_11_);
				OpenGL.glEnd();
			}
		} else if (aClass169_Sub2_Sub1_8854 != null) {
			method1206(true, i_5_);
			aClass169_Sub2_Sub1_8854.method1757(false, true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i, i_2_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_2_ + i_4_);
			OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glVertex2i(i + i_3_, i_2_ + i_4_);
			OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i_3_ + i, i_2_);
			OpenGL.glEnd();
			method1203(0);
		} else {
			aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
			aGLToolkit8861.method1434((byte) -88, i_5_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i, i_2_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_2_ + i_4_);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glVertex2i(i_3_ + i, i_4_ + i_2_);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i_3_ + i, i_2_);
			OpenGL.glEnd();
		}
	}
	
	final int method1197() {
		anInt8880++;
		return aClass169_Sub2_Sub1_8855.anInt10566 - -anInt8879 - -anInt8875;
	}
	
	final int method1193() {
		anInt8873++;
		return aClass169_Sub2_Sub1_8855.anInt10566;
	}
	
	final void method1188(float f, float f_14_, float f_15_, float f_16_, float f_17_, float f_18_, int i, aa var_aa, int i_19_, int i_20_) {
		anInt8862++;
		Class169_Sub2_Sub1 class169_sub2_sub1 = ((aa_Sub3) var_aa).aClass169_Sub2_Sub1_5494;
		if (aBoolean8852) {
			float f_21_ = (float) method1197();
			float f_22_ = (float) method1186();
			float f_23_ = (-f + f_15_) / f_21_;
			float f_24_ = (-f_14_ + f_16_) / f_21_;
			float f_25_ = (-f + f_17_) / f_22_;
			float f_26_ = (-f_14_ + f_18_) / f_22_;
			float f_27_ = f_25_ * (float) anInt8865;
			float f_28_ = (float) anInt8865 * f_26_;
			float f_29_ = (float) anInt8879 * f_23_;
			float f_30_ = f_24_ * (float) anInt8879;
			float f_31_ = -f_23_ * (float) anInt8875;
			float f_32_ = (float) anInt8875 * -f_24_;
			float f_33_ = (float) anInt8878 * -f_25_;
			f_16_ = f_16_ + f_32_ + f_28_;
			f = f_27_ + (f_29_ + f);
			float f_34_ = -f_26_ * (float) anInt8878;
			f_15_ = f_27_ + (f_31_ + f_15_);
			f_17_ = f_33_ + (f_17_ + f_29_);
			f_14_ = f_30_ + f_14_ + f_28_;
			f_18_ = f_34_ + (f_30_ + f_18_);
		}
		float f_35_ = f_17_ + (-f + f_15_);
		float f_36_ = f_18_ - f_14_ + f_16_;
		aClass169_Sub2_Sub1_8855.method1757(false, (i & 0x1 ^ 0xffffffff) != -1);
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
		aGLToolkit8861.method1434((byte) 94, 1);
		aGLToolkit8861.method1457(33984, 1);
		aGLToolkit8861.method1444(-2, class169_sub2_sub1);
		aGLToolkit8861.method1474(-70, 8448, 7681);
		aGLToolkit8861.method1464(34168, 768, 0, (byte) -51);
		aGLToolkit8861.method1460(1, 3);
		float f_37_ = class169_sub2_sub1.aFloat10567 / (float) class169_sub2_sub1.anInt10566;
		float f_38_ = class169_sub2_sub1.aFloat10568 / (float) class169_sub2_sub1.anInt10564;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glMultiTexCoord2f(33985, f_37_ * (f - (float) i_19_), class169_sub2_sub1.aFloat10568 - (f_14_ - (float) i_20_) * f_38_);
		OpenGL.glVertex2f(f, f_14_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -i_19_ + f_17_) * f_37_, -(f_38_ * ((float) -i_20_ + f_18_)) + class169_sub2_sub1.aFloat10568);
		OpenGL.glVertex2f(f_17_, f_18_);
		OpenGL.glMultiTexCoord2f(33984, aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -i_19_ + f_35_) * f_37_, class169_sub2_sub1.aFloat10568 - ((float) -i_20_ + f_36_) * f_38_);
		OpenGL.glVertex2f(f_35_, f_36_);
		OpenGL.glMultiTexCoord2f(33984, aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glMultiTexCoord2f(33985, f_37_ * ((float) -i_19_ + f_15_), -((f_16_ - (float) i_20_) * f_38_) + class169_sub2_sub1.aFloat10568);
		OpenGL.glVertex2f(f_15_, f_16_);
		OpenGL.glEnd();
		aGLToolkit8861.method1464(5890, 768, 0, (byte) -51);
		aGLToolkit8861.method1434((byte) -105, 0);
		aGLToolkit8861.method1444(-2, null);
		aGLToolkit8861.method1457(33984, 0);
	}
	
	static final void method1201(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		if (i_41_ == -12935) {
			if ((i_43_ ^ 0xffffffff) >= (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) && (Class384.anInt4906 ^ 0xffffffff) >= (i ^ 0xffffffff)) {
				boolean bool;
				if (Class262_Sub4.anInt7722 > i_39_) {
					i_39_ = Class262_Sub4.anInt7722;
					bool = false;
				} else if ((i_39_ ^ 0xffffffff) < (za_Sub2.anInt10513 ^ 0xffffffff)) {
					bool = false;
					i_39_ = za_Sub2.anInt10513;
				} else {
					bool = true;
				}
				boolean bool_44_;
				if ((i_42_ ^ 0xffffffff) <= (Class262_Sub4.anInt7722 ^ 0xffffffff)) {
					if ((i_42_ ^ 0xffffffff) < (za_Sub2.anInt10513 ^ 0xffffffff)) {
						i_42_ = za_Sub2.anInt10513;
						bool_44_ = false;
					} else {
						bool_44_ = true;
					}
				} else {
					i_42_ = Class262_Sub4.anInt7722;
					bool_44_ = false;
				}
				if ((i_43_ ^ 0xffffffff) > (Class384.anInt4906 ^ 0xffffffff)) {
					i_43_ = Class384.anInt4906;
				} else {
					Class369.method4086(i_42_, i_40_, i_39_, Class169_Sub4.anIntArrayArray8826[i_43_++], 0);
				}
				if ((Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) > (i ^ 0xffffffff)) {
					i = Node_Sub25_Sub1.anInt9936;
				} else {
					Class369.method4086(i_42_, i_40_, i_39_, Class169_Sub4.anIntArrayArray8826[i--], 0);
				}
				if (!bool || !bool_44_) {
					if (!bool) {
						if (bool_44_) {
							for (int i_45_ = i_43_; i_45_ <= i; i_45_++)
								Class169_Sub4.anIntArrayArray8826[i_45_][i_42_] = i_40_;
						}
					} else {
						for (int i_46_ = i_43_; i_46_ <= i; i_46_++)
							Class169_Sub4.anIntArrayArray8826[i_46_][i_39_] = i_40_;
					}
				} else {
					for (int i_47_ = i_43_; (i ^ 0xffffffff) <= (i_47_ ^ 0xffffffff); i_47_++) {
						int[] is = Class169_Sub4.anIntArrayArray8826[i_47_];
						is[i_39_] = is[i_42_] = i_40_;
					}
				}
			}
			anInt8851++;
		}
	}
	
	final void method1189(int i, int i_48_, aa var_aa, int i_49_, int i_50_) {
		anInt8868++;
		aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
		Class169_Sub2_Sub1 class169_sub2_sub1 = var_aa_Sub3.aClass169_Sub2_Sub1_5494;
		aClass169_Sub2_Sub1_8855.method1757(false, false);
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
		aGLToolkit8861.method1434((byte) 106, 1);
		aGLToolkit8861.method1457(33984, 1);
		aGLToolkit8861.method1444(-2, class169_sub2_sub1);
		aGLToolkit8861.method1474(-5, 8448, 7681);
		aGLToolkit8861.method1464(34168, 768, 0, (byte) -51);
		aGLToolkit8861.method1460(1, 3);
		i += anInt8879;
		i_48_ += anInt8865;
		int i_51_ = aClass169_Sub2_Sub1_8855.anInt10566 + i;
		int i_52_ = aClass169_Sub2_Sub1_8855.anInt10564 + i_48_;
		float f = class169_sub2_sub1.aFloat10567 / (float) class169_sub2_sub1.anInt10566;
		float f_53_ = class169_sub2_sub1.aFloat10568 / (float) class169_sub2_sub1.anInt10564;
		float f_54_ = f * (float) (i - i_49_);
		float f_55_ = f * (float) (-i_49_ + i_51_);
		float f_56_ = class169_sub2_sub1.aFloat10568 - (float) (i_48_ - i_50_) * f_53_;
		float f_57_ = class169_sub2_sub1.aFloat10568 - f_53_ * (float) (i_52_ - i_50_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glMultiTexCoord2f(33985, f_54_, f_56_);
		OpenGL.glVertex2i(i, i_48_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_54_, f_57_);
		OpenGL.glVertex2i(i, aClass169_Sub2_Sub1_8855.anInt10564 + i_48_);
		OpenGL.glMultiTexCoord2f(33984, aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_55_, f_57_);
		OpenGL.glVertex2i(aClass169_Sub2_Sub1_8855.anInt10566 + i, i_48_ - -aClass169_Sub2_Sub1_8855.anInt10564);
		OpenGL.glMultiTexCoord2f(33984, aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glMultiTexCoord2f(33985, f_55_, f_56_);
		OpenGL.glVertex2i(aClass169_Sub2_Sub1_8855.anInt10566 + i, i_48_);
		OpenGL.glEnd();
		aGLToolkit8861.method1464(5890, 768, 0, (byte) -51);
		aGLToolkit8861.method1434((byte) -78, 0);
		aGLToolkit8861.method1444(-2, null);
		aGLToolkit8861.method1457(33984, 0);
	}
	
	static final boolean method1202(byte b) {
		anInt8871++;
		if (Animable_Sub2_Sub1.aBoolean10628) {
			try {
                return !((Boolean) Class2.method167("showingVideoAd", Class96.anApplet1270, (byte) -109)).booleanValue();
            } catch (Throwable throwable) {
				/* empty */
			}
		}
		return true;
	}
	
	final void method1187(int[] is) {
		anInt8863++;
		is[2] = anInt8875;
		is[3] = anInt8878;
		is[1] = anInt8865;
		is[0] = anInt8879;
	}
	
	final void method1178(int i, int i_58_, int i_59_, int i_60_) {
		anInt8877++;
		anInt8865 = i_58_;
		anInt8879 = i;
		anInt8875 = i_59_;
		anInt8878 = i_60_;
		aBoolean8852 = anInt8879 != 0 || anInt8865 != 0 || anInt8875 != 0 || (anInt8878 ^ 0xffffffff) != -1;
	}
	
	final int method1186() {
		anInt8864++;
		return anInt8878 + aClass169_Sub2_Sub1_8855.anInt10564 + anInt8865;
	}
	
	final void method1191(int i, int i_61_, int i_62_, int i_63_, int i_64_) {
		anInt8859++;
		aClass169_Sub2_Sub1_8855.method1757(false, false);
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1460(i_64_, 3);
		OpenGL.glColor4ub((byte) (i_63_ >> 16), (byte) (i_63_ >> 8), (byte) i_63_, (byte) (i_63_ >> 24));
		i += anInt8879;
		i_61_ += anInt8865;
		if (aClass169_Sub2_Sub1_8854 != null) {
			method1206(true, i_62_);
			aClass169_Sub2_Sub1_8854.method1757(false, false);
			OpenGL.glBegin(10);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i, i_61_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_61_ + aClass169_Sub2_Sub1_8855.anInt10564);
			OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glVertex2i(aClass169_Sub2_Sub1_8855.anInt10566 + i, aClass169_Sub2_Sub1_8855.anInt10564 + i_61_);
			OpenGL.glMultiTexCoord2f(33985, aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(aClass169_Sub2_Sub1_8855.anInt10566 + i, i_61_);
			OpenGL.glEnd();
			method1203(0);
		} else {
			aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
			aGLToolkit8861.method1434((byte) 127, i_62_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i, i_61_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_61_ + aClass169_Sub2_Sub1_8855.anInt10564);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
			OpenGL.glVertex2i(aClass169_Sub2_Sub1_8855.anInt10566 + i, aClass169_Sub2_Sub1_8855.anInt10564 + i_61_);
			OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
			OpenGL.glVertex2i(i + aClass169_Sub2_Sub1_8855.anInt10566, i_61_);
			OpenGL.glEnd();
		}
	}
	
	final void method1194(float f, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_, int i, int i_70_, int i_71_, int i_72_) {
		if (aBoolean8852) {
			float f_73_ = (float) method1197();
			float f_74_ = (float) method1186();
			float f_75_ = (f_66_ - f) / f_73_;
			float f_76_ = (f_67_ - f_65_) / f_73_;
			float f_77_ = (-f + f_68_) / f_74_;
			float f_78_ = (-f_65_ + f_69_) / f_74_;
			float f_79_ = (float) anInt8865 * f_77_;
			float f_80_ = (float) anInt8865 * f_78_;
			float f_81_ = (float) anInt8879 * f_75_;
			float f_82_ = f_76_ * (float) anInt8879;
			float f_83_ = (float) anInt8875 * -f_75_;
			float f_84_ = (float) anInt8875 * -f_76_;
			float f_85_ = -f_77_ * (float) anInt8878;
			f_65_ = f_65_ + f_82_ + f_80_;
			f_68_ = f_85_ + (f_81_ + f_68_);
			f_67_ = f_80_ + (f_67_ + f_84_);
			f = f_81_ + f + f_79_;
			f_66_ = f_83_ + f_66_ + f_79_;
			float f_86_ = -f_78_ * (float) anInt8878;
			f_69_ = f_86_ + (f_82_ + f_69_);
		}
		anInt8856++;
		float f_87_ = f_68_ + (-f + f_66_);
		float f_88_ = f_69_ - f_65_ + f_67_;
		aClass169_Sub2_Sub1_8855.method1757(false, (0x1 & i_72_ ^ 0xffffffff) != -1);
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
		aGLToolkit8861.method1460(i_71_, 3);
		aGLToolkit8861.method1434((byte) -125, i);
		OpenGL.glColor4ub((byte) (i_70_ >> 16), (byte) (i_70_ >> 8), (byte) i_70_, (byte) (i_70_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glVertex2f(f, f_65_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_68_, f_69_);
		OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
		OpenGL.glVertex2f(f_87_, f_88_);
		OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
		OpenGL.glVertex2f(f_66_, f_67_);
		OpenGL.glEnd();
	}
	
	private final void method1203(int i) {
		aGLToolkit8861.method1457(33984, 1);
		anInt8870++;
		aGLToolkit8861.method1444(-2, null);
		aGLToolkit8861.method1474(i + -25, 8448, 8448);
		aGLToolkit8861.method1464(34168, 768, 1, (byte) -51);
		aGLToolkit8861.method1472(-34, 0, 770, 5890);
		aGLToolkit8861.method1457(33984, i);
		aGLToolkit8861.method1464(34168, 768, 1, (byte) -51);
	}
	
	final void method1183(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		anInt8874++;
		int i_95_ = i_90_ + i;
		aClass169_Sub2_Sub1_8855.method1757(false, false);
		int i_96_ = i_91_ + i_89_;
		aGLToolkit8861.method1461(34962);
		aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
		aGLToolkit8861.method1460(i_94_, 3);
		aGLToolkit8861.method1434((byte) -76, i_92_);
		OpenGL.glColor4ub((byte) (i_93_ >> 16), (byte) (i_93_ >> 8), (byte) i_93_, (byte) (i_93_ >> 24));
		if (aClass169_Sub2_Sub1_8855.aBoolean10562 && !aBoolean8852) {
			float f = aClass169_Sub2_Sub1_8855.aFloat10568 * (float) i_91_ / (float) aClass169_Sub2_Sub1_8855.anInt10564;
			float f_97_ = aClass169_Sub2_Sub1_8855.aFloat10567 * (float) i_90_ / (float) aClass169_Sub2_Sub1_8855.anInt10566;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_89_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_96_);
			OpenGL.glTexCoord2f(f_97_, 0.0F);
			OpenGL.glVertex2i(i_95_, i_96_);
			OpenGL.glTexCoord2f(f_97_, f);
			OpenGL.glVertex2i(i_95_, i_89_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt8879, (float) anInt8865, 0.0F);
			int i_98_ = method1197();
			int i_99_ = method1186();
			int i_100_ = aClass169_Sub2_Sub1_8855.anInt10564 + i_89_;
			OpenGL.glBegin(7);
			int i_101_ = i_89_;
			while ((i_100_ ^ 0xffffffff) >= (i_96_ ^ 0xffffffff)) {
				int i_102_ = i - -aClass169_Sub2_Sub1_8855.anInt10566;
				int i_103_ = i;
				for (/**/; (i_102_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff); i_102_ += i_98_) {
					OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_103_, i_101_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_103_, i_100_);
					OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, 0.0F);
					OpenGL.glVertex2i(i_102_, i_100_);
					OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_102_, i_101_);
					i_103_ += i_98_;
				}
				if (i_103_ < i_95_) {
					float f = (float) (i_95_ + -i_103_) * aClass169_Sub2_Sub1_8855.aFloat10567 / (float) aClass169_Sub2_Sub1_8855.anInt10566;
					OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_103_, i_101_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_103_, i_100_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_95_, i_100_);
					OpenGL.glTexCoord2f(f, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_95_, i_101_);
				}
				i_100_ += i_99_;
				i_101_ += i_99_;
			}
			if ((i_96_ ^ 0xffffffff) < (i_101_ ^ 0xffffffff)) {
				float f = aClass169_Sub2_Sub1_8855.aFloat10568 * (float) (aClass169_Sub2_Sub1_8855.anInt10564 - (-i_101_ + i_96_)) / (float) aClass169_Sub2_Sub1_8855.anInt10564;
				int i_104_ = i + aClass169_Sub2_Sub1_8855.anInt10566;
				int i_105_ = i;
				for (/**/; i_104_ <= i_95_; i_104_ += i_98_) {
					OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_105_, i_101_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_105_, i_96_);
					OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, f);
					OpenGL.glVertex2i(i_104_, i_96_);
					OpenGL.glTexCoord2f(aClass169_Sub2_Sub1_8855.aFloat10567, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_104_, i_101_);
					i_105_ += i_98_;
				}
				if (i_95_ > i_105_) {
					float f_106_ = aClass169_Sub2_Sub1_8855.aFloat10567 * (float) (-i_105_ + i_95_) / (float) aClass169_Sub2_Sub1_8855.anInt10566;
					OpenGL.glTexCoord2f(0.0F, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_105_, i_101_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_105_, i_96_);
					OpenGL.glTexCoord2f(f_106_, f);
					OpenGL.glVertex2i(i_95_, i_96_);
					OpenGL.glTexCoord2f(f_106_, aClass169_Sub2_Sub1_8855.aFloat10568);
					OpenGL.glVertex2i(i_95_, i_101_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}
	
	final int getYOffset() {
		anInt8860++;
		return aClass169_Sub2_Sub1_8855.anInt10564;
	}
	
	final void method1195(int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_) {
		anInt8872++;
		if (aGLToolkit8861.aBoolean6668) {
			int[] is = aGLToolkit8861.na(i_110_, i_111_, i_108_, i_109_);
			if (is != null) {
				for (int i_112_ = 0; (is.length ^ 0xffffffff) < (i_112_ ^ 0xffffffff); i_112_++)
					is[i_112_] = Node_Sub16.method2590(is[i_112_], -16777216);
				method1204(i, i_107_, i_108_, i_109_, is, 0, i_108_);
			}
		} else {
			aClass169_Sub2_Sub1_8855.method1773(i_109_, i, i_107_, (byte) 105, i_111_, i_110_, i_108_);
		}
	}
	
	private final void method1204(int i, int i_113_, int i_114_, int i_115_, int[] is, int i_116_, int i_117_) {
		aClass169_Sub2_Sub1_8855.method1772((byte) -28, is, true, i, i_115_, i_114_, i_113_, i_117_, i_116_);
		anInt8853++;
	}
	
	static final void method1205(CacheNode_Sub4 cachenode_sub4, byte b) {
		anInt8866++;
		boolean bool = false;
		cachenode_sub4.method2275(-94);
		for (CacheNode_Sub4 cachenode_sub4_118_ = (CacheNode_Sub4) Class184.aClass158_2189.method1723(13); cachenode_sub4_118_ != null; cachenode_sub4_118_ = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
			if (Node_Sub42.method2935((byte) 69, cachenode_sub4.method2300((byte) 88), cachenode_sub4_118_.method2300((byte) 88))) {
				bool = true;
				Node_Sub38_Sub19.method2847(255, cachenode_sub4_118_, cachenode_sub4);
				break;
			}
		}
		if (!bool) {
			Class184.aClass158_2189.method1719(true, cachenode_sub4);
		}
	}
	
	private final void method1206(boolean bool, int i) {
		aGLToolkit8861.method1457(33984, 1);
		anInt8867++;
		if (bool == true) {
			aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8855);
			aGLToolkit8861.method1474(126, 7681, aGLToolkit8861.method1420(i, false));
			aGLToolkit8861.method1464(34167, 768, 1, (byte) -51);
			aGLToolkit8861.method1472(-48, 0, 770, 34168);
			aGLToolkit8861.method1457(33984, 0);
			aGLToolkit8861.method1444(-2, aClass169_Sub2_Sub1_8854);
			aGLToolkit8861.method1474(-90, 7681, 34479);
			aGLToolkit8861.method1464(34166, 768, 1, (byte) -51);
			if ((anInt8869 ^ 0xffffffff) == -1) {
				aGLToolkit8861.method1422(0.5F, 1.0F, 0.0F, 0.5F, 13934);
			} else if (anInt8869 != 1) {
				if ((anInt8869 ^ 0xffffffff) != -3) {
					if (anInt8869 == 3) {
						aGLToolkit8861.method1422(128.5F, 128.5F, 0.0F, 128.5F, 13934);
					}
				} else {
					aGLToolkit8861.method1422(1.0F, 0.5F, 0.0F, 0.5F, 13934);
				}
			} else {
				aGLToolkit8861.method1422(0.5F, 0.5F, 0.0F, 1.0F, 13934);
			}
		}
	}
	
	GLSprite_Sub1(GLToolkit gltoolkit, int i, int i_119_, boolean bool) {
		aBoolean8852 = false;
		anInt8878 = 0;
		anInt8879 = 0;
		aGLToolkit8861 = gltoolkit;
		aClass169_Sub2_Sub1_8855 = Node_Sub38_Sub38.method2913(i_119_, false, i, bool ? 6408 : 6407, gltoolkit);
	}
	
	GLSprite_Sub1(GLToolkit gltoolkit, int i, int i_120_, int i_121_, int i_122_) {
		aBoolean8852 = false;
		anInt8878 = 0;
		anInt8879 = 0;
		aGLToolkit8861 = gltoolkit;
		aClass169_Sub2_Sub1_8855 = Class158.method1724(i, i_122_, i_121_, (byte) 123, i_120_, gltoolkit);
	}
	
	GLSprite_Sub1(GLToolkit gltoolkit, int i, int i_123_, int[] is, int i_124_, int i_125_) {
		aBoolean8852 = false;
		anInt8878 = 0;
		anInt8879 = 0;
		aGLToolkit8861 = gltoolkit;
		aClass169_Sub2_Sub1_8855 = CacheNode_Sub5.method2308(gltoolkit, 25448, i, false, i_125_, is, i_123_, i_124_);
	}
}
