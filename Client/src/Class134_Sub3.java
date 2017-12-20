/* Class134_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class134_Sub3 extends Class134 implements Interface13_Impl1
{
	static int anInt9025;
	static int anInt9026;
	static int anInt9027;
	static int anInt9028;
	static int anInt9029;
	private int anInt9030;
	static int anInt9031;
	private int anInt9032;
	static int anInt9033;
	static int anInt9034;
	static IComponentDefinitions[][] aWidgetArrayArray9035;
	static int anInt9036;
	
	Class134_Sub3(GLXToolkit glxtoolkit, Class68 class68, int i, int i_0_, float[] fs, int i_1_, int i_2_) {
		super(glxtoolkit, 34037, class68, Class372.aClass372_4598, i_0_ * i, false);
		anInt9032 = i_0_;
		anInt9030 = i;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3314, i_2_);
		OpenGL.glTexImage2Df(anInt5296, 0, this.method1570(10242), i, i_0_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5126, fs, 4 * i_1_);
		OpenGL.glPixelStorei(3314, 0);
	}
	
	public final void method43(byte b, int i, int i_3_, int[] is, int i_4_, int i_5_, int i_6_) {
		anInt9033++;
		int[] is_7_ = new int[anInt9030 * anInt9032];
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glGetTexImagei(anInt5296, 0, 32993, 5121, is_7_, 0);
		if (b == 64) {
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_8_++)
				Class311.method3609(is_7_, (-i_8_ + (-1 - -i_6_ + i_3_)) * anInt9030, is, i_5_ * i_8_ + i, i_5_);
		}
	}
	
	Class134_Sub3(GLXToolkit glxtoolkit, int i, int i_9_, int[] is, int i_10_, int i_11_) {
		super(glxtoolkit, 34037, Class99.aClass68_1290, Class372.aClass372_4594, i_9_ * i, false);
		anInt9030 = i;
		anInt9032 = i_9_;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3314, i_11_);
		OpenGL.glTexImage2Di(anInt5296, 0, 6408, anInt9030, anInt9032, 0, 32993, aGLXToolkit5299.anInt9321, is, 4 * i_10_);
		OpenGL.glPixelStorei(3314, 0);
	}
	
	public final boolean method48(int i) {
		if (i != 30986) {
			return false;
		}
		anInt9026++;
		return false;
	}
	
	public final float method45(float f, int i) {
		@SuppressWarnings("unused")
		int i_12_ = -113 % ((i - 17) / 63);
		anInt9036++;
		return f;
	}
	
	public final int method46(byte b) {
		if (b != 122) {
			aWidgetArrayArray9035 = null;
		}
		anInt9034++;
		return anInt9032;
	}
	
	Class134_Sub3(GLXToolkit glxtoolkit, Class68 class68, Class372 class372, int i, int i_13_) {
		super(glxtoolkit, 34037, class68, class372, i * i_13_, false);
		anInt9030 = i;
		anInt9032 = i_13_;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glTexImage2Dub(anInt5296, 0, this.method1570(10242), i, i_13_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), Class136.method1590((byte) 108, aClass372_5297), null, 0);
	}
	
	public final void method47(int[] is, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		if (i_19_ == 0) {
			i_19_ = i_17_;
		}
		aGLXToolkit5299.method1312((byte) -21, this);
		anInt9029++;
		if (i_17_ != i_19_) {
			OpenGL.glPixelStorei(3314, i_19_);
		}
		OpenGL.glTexSubImage2Di(anInt5296, 0, i, i_14_, i_17_, i_15_, 32993, aGLXToolkit5299.anInt9321, is, i_18_);
		if (i_16_ != 23110) {
			anInt9032 = 92;
		}
		if ((i_17_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff)) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
	
	public final void method51(boolean bool, boolean bool_20_, boolean bool_21_) {
		anInt9028++;
		if (bool_21_ != false) {
			method46((byte) 117);
		}
	}
	
	static final void method1583(Animable animable, int i, int i_22_, int i_23_) {
		if (i_22_ < Class328.anInt4115) {
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_22_ + 1][i_23_];
			if (class261 != null && class261.anAnimable_Sub1_3317 != null && class261.anAnimable_Sub1_3317.method821(0)) {
				animable.method816(0, true, CacheNode_Sub18.aGraphicsToolkit9607, 0, (byte) 108, Class179.anInt2129, class261.anAnimable_Sub1_3317);
			}
		}
		if (i_23_ < Class328.anInt4115) {
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_22_][i_23_ + 1];
			if (class261 != null && class261.anAnimable_Sub1_3317 != null && class261.anAnimable_Sub1_3317.method821(0)) {
				animable.method816(0, true, CacheNode_Sub18.aGraphicsToolkit9607, Class179.anInt2129, (byte) 118, 0, class261.anAnimable_Sub1_3317);
			}
		}
		if (i_22_ < Class328.anInt4115 && i_23_ < Node_Sub50.anInt7623) {
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_22_ + 1][i_23_ + 1];
			if (class261 != null && class261.anAnimable_Sub1_3317 != null && class261.anAnimable_Sub1_3317.method821(0)) {
				animable.method816(0, true, CacheNode_Sub18.aGraphicsToolkit9607, Class179.anInt2129, (byte) 122, Class179.anInt2129, class261.anAnimable_Sub1_3317);
			}
		}
		if (i_22_ < Class328.anInt4115 && i_23_ > 0) {
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_22_ + 1][i_23_ - 1];
			if (class261 != null && class261.anAnimable_Sub1_3317 != null && class261.anAnimable_Sub1_3317.method821(0)) {
				animable.method816(0, true, CacheNode_Sub18.aGraphicsToolkit9607, -Class179.anInt2129, (byte) 121, Class179.anInt2129, class261.anAnimable_Sub1_3317);
			}
		}
	}
	
	public final int method44(int i) {
		if (i != 19809) {
			aWidgetArrayArray9035 = null;
		}
		anInt9025++;
		return anInt9030;
	}
	
	public static void method1584(int i) {
		if (i != 1) {
			aWidgetArrayArray9035 = null;
		}
		aWidgetArrayArray9035 = null;
	}
	
	public final void method50(int i, int i_24_, int i_25_, int i_26_, byte[] bs, int i_27_, Class68 class68, int i_28_, int i_29_) {
		anInt9027++;
		aGLXToolkit5299.method1312((byte) -21, this);
		if ((i_24_ ^ 0xffffffff) == -1) {
			i_24_ = i_29_;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (i_29_ != i_24_) {
			OpenGL.glPixelStorei(3314, i_24_);
		}
		if (i_26_ != -15178) {
			method45(1.0271162F, -71);
		}
		OpenGL.glTexSubImage2Dub(anInt5296, 0, i_28_, i_27_, i_29_, i_25_, Node_Sub36.method2753((byte) -18, class68), 5121, bs, i);
		if ((i_24_ ^ 0xffffffff) != (i_29_ ^ 0xffffffff)) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
	
	Class134_Sub3(GLXToolkit glxtoolkit, Class68 class68, int i, int i_30_, byte[] bs, int i_31_, int i_32_) {
		super(glxtoolkit, 34037, class68, Class372.aClass372_4594, i * i_30_, false);
		anInt9030 = i;
		anInt9032 = i_30_;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_32_);
		OpenGL.glTexImage2Dub(anInt5296, 0, this.method1570(10242), i, i_30_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5121, bs, i_31_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
	
	public final float method49(float f, byte b) {
		if (b > -6) {
			anInt9032 = -126;
		}
		anInt9031++;
		return f;
	}
}
