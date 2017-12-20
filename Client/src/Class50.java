/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50
{
	static int anInt772;
	protected int anInt773;
	static int anInt774 = 0;
	static int anInt775;
	static int anInt776;
	private GLToolkit aGLToolkit777;
	static IncommingPacket aClass192_778 = new IncommingPacket(97, -1);
	static int anInt779;
	static OutcommingPacket aClass318_780 = new OutcommingPacket(35, 7);
	static Class151 aClass151_781 = new Class151(13, 0, 1, 0);
	static Class211[] aClass211Array782;
	static int basePlane;
	
	public static void method510(int i) {
		if (i != 0) {
			method511(-117, 43, 59, -14, -17);
		}
		aClass318_780 = null;
		aClass211Array782 = null;
		aClass151_781 = null;
		aClass192_778 = null;
	}
	
	static final void method511(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if ((i ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)) {
			for (int i_4_ = i_0_; i > i_4_; i_4_++)
				Class169_Sub4.anIntArrayArray8826[i_4_][i_2_] = i_1_;
		} else {
			for (int i_5_ = i; (i_5_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_5_++)
				Class169_Sub4.anIntArrayArray8826[i_5_][i_2_] = i_1_;
		}
		anInt779++;
		if (i_3_ != 1) {
			method513(null, (byte) 94);
		}
	}
	
	protected final void finalize() throws Throwable {
		aGLToolkit777.method1450((byte) -33, anInt773);
		anInt776++;
		super.finalize();
	}
	
	static final void method512(int i, int i_6_, String string, GraphicsToolkit graphicstoolkit, byte b, int i_7_, int i_8_, int i_9_) {
		if (Class247.aGLSprite3141 == null || aa.aGLSprite102 == null) {
			if (!Node_Sub38_Sub39.aClass302_10500.method3510(Class40.anInt620, (byte) 63) || !Node_Sub38_Sub39.aClass302_10500.method3510(Class150.anInt5085, (byte) 63)) {
				graphicstoolkit.aa(i_8_, i_7_, i, i_9_, AnimableAnimator.anInt5501 | -Node_Sub36_Sub3.anInt10056 + 255 << 24, 1);
			} else {
				Class247.aGLSprite3141 = graphicstoolkit.a(Class383.method4194(Node_Sub38_Sub39.aClass302_10500, Class40.anInt620, 0), true);
				Class383 class383 = Class383.method4194(Node_Sub38_Sub39.aClass302_10500, Class150.anInt5085, 0);
				aa.aGLSprite102 = graphicstoolkit.a(class383, true);
				class383.method4200();
				Class339_Sub7.aGLSprite8718 = graphicstoolkit.a(class383, true);
			}
		}
		anInt775++;
		if (Class247.aGLSprite3141 != null && aa.aGLSprite102 != null) {
			int i_10_ = (-(aa.aGLSprite102.method1193() * 2) + i) / Class247.aGLSprite3141.method1193();
			for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
				Class247.aGLSprite3141.setPosition(i_8_ - -aa.aGLSprite102.method1193() - -(i_11_ * Class247.aGLSprite3141.method1193()), i_7_);
			aa.aGLSprite102.setPosition(i_8_, i_7_);
			Class339_Sub7.aGLSprite8718.setPosition(-Class339_Sub7.aGLSprite8718.method1193() + i + i_8_, i_7_);
		}
		if (b == -39) {
			Class262_Sub4.aClass52_7721.method538(i_8_ + 3, 14 + i_7_, string, -1, b ^ ~0x27, ~0xffffff | Class320_Sub26.anInt8451);
			graphicstoolkit.aa(i_8_, i_7_ - -i_9_, i, -i_9_ + i_6_, -Node_Sub36_Sub3.anInt10056 + 255 << 24 | AnimableAnimator.anInt5501, 1);
		}
	}
	
	static final void method513(String string, byte b) {
		anInt772++;
		if (b > -14) {
			aClass211Array782 = null;
		}
		Node_Sub10.aString7081 = string;
		Class315.anInt4034 = Node_Sub10.aString7081.length();
	}
	
	Class50(GLToolkit gltoolkit, int i, int i_12_) {
		aGLToolkit777 = gltoolkit;
		anInt773 = i_12_;
	}
}
