/* Class134_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.awt.Rectangle;

public class Class134_Sub4 extends Class134 implements Interface13_Impl1
{
	private int anInt9037;
	static int anInt9038;
	static int anInt9039;
	static int anInt9040;
	private int anInt9041;
	static int anInt9042;
	static int anInt9043;
	static int anInt9044;
	static IncommingPacket aClass192_9045 = new IncommingPacket(129, 4);
	static int anInt9046;
	static int anInt9047;
	static Rectangle[] aRectangleArray9048 = new Rectangle[100];
	static int anInt9049;
	static int anInt9050;
	static int anInt9051;
	static IncommingPacket aClass192_9052 = new IncommingPacket(120, -2);
	
	Class134_Sub4(GLXToolkit glxtoolkit, Class68 class68, int i, int i_0_, boolean bool, float[] fs, int i_1_, int i_2_) {
		super(glxtoolkit, 3553, class68, Class372.aClass372_4598, i * i_0_, bool);
		anInt9037 = i;
		anInt9041 = i_0_;
		aGLXToolkit5299.method1312((byte) -21, this);
		if (!bool && i_2_ == 0 && (i_1_ ^ 0xffffffff) == -1) {
			this.method1578(fs, i, i_0_, true, anInt5296);
		} else {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Df(anInt5296, 0, this.method1570(10242), i, i_0_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5126, fs, 4 * i_1_);
			OpenGL.glPixelStorei(3314, 0);
		}
	}
	
	public final float method49(float f, byte b) {
		if (b >= -6) {
			aRectangleArray9048 = null;
		}
		anInt9040++;
		return f / (float) anInt9041;
	}
	
	public final void method43(byte b, int i, int i_3_, int[] is, int i_4_, int i_5_, int i_6_) {
		anInt9038++;
		int[] is_7_ = new int[anInt9041 * anInt9037];
		if (b != 64) {
			aRectangleArray9048 = null;
		}
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glGetTexImagei(anInt5296, 0, 32993, 5121, is_7_, 0);
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++)
			Class311.method3609(is_7_, (i_3_ - (-i_6_ - (-1 - i_8_))) * anInt9037, is, i_5_ * i_8_ + i, i_5_);
	}
	
	Class134_Sub4(GLXToolkit glxtoolkit, int i, int i_9_, boolean bool, int[] is, int i_10_, int i_11_) {
		super(glxtoolkit, 3553, Class99.aClass68_1290, Class372.aClass372_4594, i_9_ * i, bool);
		anInt9037 = i;
		anInt9041 = i_9_;
		aGLXToolkit5299.method1312((byte) -21, this);
		if (!bool || (i_11_ ^ 0xffffffff) != -1 || i_10_ != 0) {
			OpenGL.glPixelStorei(3314, i_11_);
			OpenGL.glTexImage2Di(anInt5296, 0, 6408, anInt9037, anInt9041, 0, 32993, aGLXToolkit5299.anInt9321, is, i_10_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method1575(anInt5296, is, -122, i_9_, i);
		}
	}
	
	public final float method45(float f, int i) {
		anInt9050++;
		@SuppressWarnings("unused")
		int i_12_ = 21 / ((i - 17) / 63);
		return f / (float) anInt9037;
	}
	
	public final int method46(byte b) {
		if (b != 122) {
			method48(102);
		}
		anInt9044++;
		return anInt9041;
	}
	
	public final boolean method48(int i) {
		if (i != 30986) {
			method46((byte) 125);
		}
		anInt9051++;
		return true;
	}
	
	public static void method1585(byte b) {
		aClass192_9052 = null;
		if (b < 120) {
			method1585((byte) 64);
		}
		aClass192_9045 = null;
		aRectangleArray9048 = null;
	}
	
	public final int method44(int i) {
		if (i != 19809) {
			aClass192_9045 = null;
		}
		anInt9049++;
		return anInt9037;
	}
	
	public final void method50(int i, int i_13_, int i_14_, int i_15_, byte[] bs, int i_16_, Class68 class68, int i_17_, int i_18_) {
		aGLXToolkit5299.method1312((byte) -21, this);
		anInt9043++;
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_13_);
		if (i_15_ != -15178) {
			aClass192_9052 = null;
		}
		OpenGL.glTexSubImage2Dub(anInt5296, 0, i_17_, i_16_, i_18_, i_14_, Node_Sub36.method2753((byte) -18, class68), 5121, bs, i);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
	
	final void method1586(Class68 class68, int i, int i_19_, int i_20_, float[] fs, int i_21_, int i_22_, int i_23_, int i_24_) {
		anInt9042++;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3314, i_23_);
		OpenGL.glTexSubImage2Df(anInt5296, 0, i, i_22_, i_24_, i_19_, Node_Sub36.method2753((byte) -18, class68), 5121, fs, i_20_);
		if (i_21_ == -27322) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
	
	public final void method47(int[] is, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		aGLXToolkit5299.method1312((byte) -21, this);
		anInt9039++;
		OpenGL.glPixelStorei(3314, i_30_);
		if (i_27_ == 23110) {
			OpenGL.glTexSubImage2Di(anInt5296, 0, i, i_25_, i_28_, i_26_, 32993, aGLXToolkit5299.anInt9321, is, i_29_);
			OpenGL.glPixelStorei(3314, 0);
		}
	}
	
	Class134_Sub4(GLXToolkit glxtoolkit, Class68 class68, int i, int i_31_, boolean bool, byte[] bs, int i_32_, int i_33_) {
		super(glxtoolkit, 3553, class68, Class372.aClass372_4594, i * i_31_, bool);
		anInt9037 = i;
		anInt9041 = i_31_;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || (i_33_ ^ 0xffffffff) != -1 || i_32_ != 0) {
			OpenGL.glPixelStorei(3314, i_33_);
			OpenGL.glTexImage2Dub(anInt5296, 0, this.method1570(10242), i, i_31_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5121, bs, i_32_);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method1577(i_31_, anInt5296, 1, bs, i);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
	
	Class134_Sub4(GLXToolkit glxtoolkit, Class68 class68, Class372 class372, int i, int i_34_) {
		super(glxtoolkit, 3553, class68, class372, i * i_34_, false);
		anInt9041 = i_34_;
		anInt9037 = i;
		aGLXToolkit5299.method1312((byte) -21, this);
		OpenGL.glTexImage2Dub(anInt5296, 0, this.method1570(10242), i, i_34_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), Class136.method1590((byte) -97, aClass372_5297), null, 0);
	}
	
	public final void method51(boolean bool, boolean bool_35_, boolean bool_36_) {
		if (bool_36_ == false) {
			anInt9046++;
			aGLXToolkit5299.method1312((byte) -21, this);
			OpenGL.glTexParameteri(anInt5296, 10242, !bool ? 33071 : 10497);
			OpenGL.glTexParameteri(anInt5296, 10243, bool_35_ ? 10497 : 33071);
		}
	}
}
