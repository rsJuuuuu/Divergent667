/* Class134_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class134_Sub2 extends Class134 implements Interface13_Impl2
{
	static int anInt9021;
	static int anInt9022 = -60;
	static int anInt9023;
	static int anInt9024;
	
	Class134_Sub2(GLXToolkit glxtoolkit, int i, boolean bool, int[][] is) {
		super(glxtoolkit, 34067, Class99.aClass68_1290, Class372.aClass372_4594, 6 * (i * i), bool);
		aGLXToolkit5299.method1312((byte) -21, this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				this.method1575(34069 + i_0_, is[i_0_], -120, i, i);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, this.method1570(10242), i, i, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), aGLXToolkit5299.anInt9321, is[i_1_], 0);
		}
	}
	
	static final boolean method1582(int i, int i_2_, byte[] bs, int i_3_, byte b, int i_4_, int i_5_) {
		if (b != -78) {
			anInt9021 = -124;
		}
		anInt9023++;
		int i_6_ = i_3_ % i;
		int i_7_;
		if ((i_6_ ^ 0xffffffff) == -1) {
			i_7_ = 0;
		} else {
			i_7_ = -i_6_ + i;
		}
		int i_8_ = -((i_4_ + i + -1) / i);
		int i_9_ = -((i_3_ + (i + -1)) / i);
		for (int i_10_ = i_8_; i_10_ < 0; i_10_++) {
			for (int i_11_ = i_9_; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
				if ((bs[i_2_] ^ 0xffffffff) == -1) {
					return true;
				}
				i_2_ += i;
			}
			i_2_ -= i_7_;
			if ((bs[i_2_ - 1] ^ 0xffffffff) == -1) {
				return true;
			}
			i_2_ += i_5_;
		}
		return false;
	}
}
