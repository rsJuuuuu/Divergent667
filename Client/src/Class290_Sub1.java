/* Class290_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class290_Sub1 extends Class290
{
	static int anInt8054;
	static int anInt8055;
	static int anInt8056;
	private Class5 aClass5_8057;
	private GLXToolkit aGLXToolkit8058;
	static int anInt8059;
	static int anInt8060;
	static int anInt8061;
	static GLSprite aGLSprite8062;
	private Class106 aClass106_8063;
	static int anInt8064;
	
	final void method3411(int i) {
		anAbstractToolkit3654.method1304(0, 0, Class106.aClass135_1354);
		if (i == -8668) {
			anInt8061++;
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
		}
	}
	
	final boolean method3414(byte b) {
		if (b > -45) {
			aGLSprite8062 = null;
		}
		anInt8060++;
        return aClass106_8063 != null;
    }
	
	public static void method3423(boolean bool) {
		aGLSprite8062 = null;
		if (bool != false) {
			method3425(62, 0, 81);
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		if (b == 92) {
			anInt8054++;
		}
	}
	
	static final void method3424(int i, int i_0_) {
		anInt8059++;
		if (CacheNode_Sub15.method2379(i ^ ~0x4724, i_0_)) {
			if (i != -23620) {
				method3424(0, -33);
			}
			Class346.method3975(-18690, -1, Class134_Sub3.aWidgetArrayArray9035[i_0_]);
		}
	}
	
	final void method3422(int i, boolean bool) {
		if (i >= -84) {
			aClass106_8063 = null;
		}
		OpenGL.glBindProgramARB(34336, aClass106_8063.anInt1350);
		anInt8056++;
		OpenGL.glEnable(34336);
		anAbstractToolkit3654.method1304(0, 0, Class200_Sub1.aClass135_5139);
	}
	
	Class290_Sub1(GLXToolkit glxtoolkit, Index class302, Class5 class5) {
		super(glxtoolkit);
		aGLXToolkit8058 = glxtoolkit;
		aClass5_8057 = class5;
		if (class302 != null && aClass5_8057.method173(4) && aGLXToolkit8058.aBoolean9326) {
			aClass106_8063 = Class157.method1709(aGLXToolkit8058, 34336, -99, class302.method3529("gl", "transparent_water", 1));
		} else {
			aClass106_8063 = null;
		}
	}
	
	static final void method3425(int i, int i_1_, int i_2_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_1_][i_2_];
		if (class261 != null) {
			Class58.method575(class261.anAnimable_Sub2_3314);
			Class58.method575(class261.anAnimable_Sub2_3308);
			if (class261.anAnimable_Sub2_3314 != null) {
				class261.anAnimable_Sub2_3314 = null;
			}
			if (class261.anAnimable_Sub2_3308 != null) {
				class261.anAnimable_Sub2_3308 = null;
			}
		}
	}
	
	final void method3417(boolean bool, boolean bool_3_) {
		anInt8055++;
		anAbstractToolkit3654.method1318(-30, Class236.aClass94_2898, Class117_Sub1.aClass94_4924);
		if (bool_3_ != false) {
			aGLSprite8062 = null;
		}
	}
	
	final void method3415(boolean bool, int i, int i_4_) {
		if (aClass5_8057.aBoolean128) {
			float f = (float) (anAbstractToolkit3654.anInt6332 % 4000) / 4000.0F;
			anAbstractToolkit3654.method1312((byte) -21, aClass5_8057.anInterface13_Impl3_130);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
		} else {
			int i_5_ = 16 * (anAbstractToolkit3654.anInt6332 % 4000) / 4000;
			anAbstractToolkit3654.method1312((byte) -21, aClass5_8057.anInterface13_Impl1Array131[i_5_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		anInt8064++;
		if (bool != true) {
			aGLSprite8062 = null;
		}
	}
}
