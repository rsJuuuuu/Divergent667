/* Class339_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class339_Sub3 extends Class339
{
	static int anInt8655;
	static int anInt8656;
	private boolean aBoolean8657 = false;
	private Class25 aClass25_8658;
	static int anInt8659;
	static int anInt8660;
	static int anInt8661;
	static int anInt8662;
	static int anInt8663;
	static Class26 aClass26_8664 = new Class26();
	static int[] anIntArray8665 = { 1, 2, 4, 8 };
	
	static final void method3930(byte[] bs, byte[] bs_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt8659++;
		if (i_4_ > -30) {
			anIntArray8665 = null;
		}
		int i_7_ = -(i_5_ >> 2);
		i_5_ = -(0x3 & i_5_);
		for (int i_8_ = -i_6_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				bs[i++] += bs_0_[i_3_++];
				bs[i++] += bs_0_[i_3_++];
				bs[i++] += bs_0_[i_3_++];
				bs[i++] += bs_0_[i_3_++];
			}
			for (int i_10_ = i_5_; i_10_ < 0; i_10_++)
				bs[i++] += bs_0_[i_3_++];
			i_3_ += i_2_;
			i += i_1_;
		}
	}
	
	Class339_Sub3(GLToolkit gltoolkit) {
		super(gltoolkit);
		if (gltoolkit.aBoolean6654) {
			aClass25_8658 = new Class25(gltoolkit, 2);
			aClass25_8658.method307(0, 4864);
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1474(127, 7681, 34165);
			aGLToolkit4202.method1464(34168, 770, 2, (byte) -51);
			aGLToolkit4202.method1472(-126, 0, 770, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			aGLToolkit4202.method1457(33984, 0);
			aClass25_8658.method309(false);
			aClass25_8658.method307(1, 4864);
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1474(126, 8448, 8448);
			aGLToolkit4202.method1464(34166, 770, 2, (byte) -51);
			aGLToolkit4202.method1472(-123, 0, 770, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aGLToolkit4202.method1457(33984, 0);
			aClass25_8658.method309(false);
		}
	}
	
	final void method3918(int i) {
		anInt8663++;
		if (aBoolean8657) {
			aClass25_8658.method310('\001', (byte) -55);
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1444(i ^ ~0x51c8, null);
			aGLToolkit4202.method1457(33984, 0);
		} else {
			aGLToolkit4202.method1472(i ^ ~0x51b3, 0, 770, 5890);
		}
		if (i != 20937) {
			method3918(95);
		}
		aGLToolkit4202.method1474(127, 8448, 8448);
		aBoolean8657 = false;
	}
	
	final void method3923(boolean bool, int i) {
		anInt8660++;
		Class169_Sub1 class169_sub1 = aGLToolkit4202.method1406((byte) -57);
		if (aClass25_8658 != null && class169_sub1 != null && bool) {
			aClass25_8658.method310('\0', (byte) -88);
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1444(-2, class169_sub1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGLToolkit4202.aClass336_Sub3_6642.method3898((byte) -87), 0);
			OpenGL.glMatrixMode(5888);
			aGLToolkit4202.method1457(i + 33984, 0);
			aBoolean8657 = true;
		} else {
			aGLToolkit4202.method1472(i ^ ~0x70, 0, 770, 34168);
		}
		if (i != 0) {
			aBoolean8657 = true;
		}
	}
	
	final boolean method3922(byte b) {
		anInt8655++;
		if (b > -44) {
			method3919(-90, 45, -22);
		}
		return true;
	}
	
	final void method3917(Class169 class169, int i, int i_11_) {
		anInt8661++;
		if (i_11_ == -28289) {
			aGLToolkit4202.method1444(-2, class169);
			aGLToolkit4202.method1434((byte) -126, i);
		}
	}
	
	final void method3919(int i, int i_12_, int i_13_) {
		if (i != -13437) {
			method3919(-23, -51, -34);
		}
		anInt8656++;
	}
	
	public static void method3931(int i) {
		anIntArray8665 = null;
		aClass26_8664 = null;
		if (i != 0) {
			anIntArray8665 = null;
		}
	}
	
	final void method3920(int i, boolean bool) {
		if (i != -1) {
			aClass26_8664 = null;
		}
		aGLToolkit4202.method1474(i ^ 0x3d, 7681, 8448);
		anInt8662++;
	}
}
