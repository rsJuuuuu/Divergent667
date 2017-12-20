/* Class230_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class230_Sub1 extends Class230
{
	static int anInt9007;
	private int anInt9008 = 0;
	static int anInt9009;
	static Class212 aClass212_9010 = new Class212("", 11);
	static int anInt9011;
	static int anInt9012 = 0;
	static int anInt9013 = -1;
	
	static final int method2131(int i, int i_0_, int i_1_) {
		anInt9009++;
		int i_2_ = 1;
		for (/**/; i > 1; i >>= 1) {
			if ((0x1 & i ^ 0xffffffff) != -1) {
				i_2_ *= i_0_;
			}
			i_0_ *= i_0_;
		}
		if ((i ^ 0xffffffff) == -2) {
			return i_2_ * i_0_;
		}
		return i_2_;
	}
	
	Class230_Sub1(Index class302, Class235_Sub1 class235_sub1) {
		super(class302, class235_sub1);
	}
	
	public static void method2132(int i) {
		if (i != 2) {
			anInt9012 = 103;
		}
		aClass212_9010 = null;
	}
	
	static final void method2133(int i, GraphicsToolkit graphicstoolkit) {
		anInt9007++;
		if (i > 82) {
			if (!Node_Sub38_Sub5.aBoolean10130) {
				Class89.method1021(graphicstoolkit, (byte) -71);
			} else {
				Class82.method797(graphicstoolkit, 32712);
			}
		}
	}
	
	public final void method27(boolean bool, int i) {
		anInt9011++;
		int i_4_ = aClass235_5213.aClass379_5118.method4160(-128, Node_Sub38_Sub12.anInt10225, aGLSprite5211.method1197()) + aClass235_5213.anInt5124;
		int i_5_ = aClass235_5213.aClass77_5123.method775(Class257.anInt3244, false, aGLSprite5211.method1186()) - -aClass235_5213.anInt5116;
		aGLSprite5211.method1180((float) (aGLSprite5211.method1197() / 2 + i_4_), (float) (aGLSprite5211.method1186() / 2 + i_5_), 4096, anInt9008);
		anInt9008 += ((Class235_Sub1) aClass235_5213).anInt8976;
	}
}
