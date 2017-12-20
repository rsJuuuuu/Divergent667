/* Class290_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class290_Sub3 extends Class290
{
	static int anInt8076;
	static int[] anIntArray8077 = new int[4];
	static int anInt8078;
	private Class288 aClass288_8079;
	static int anInt8080;
	static int anInt8081;
	static int anInt8082;
	private boolean aBoolean8083;
	static int anInt8084;
	static int anInt8085;
	private boolean aBoolean8086;
	static int anInt8087;
	private Class5 aClass5_8088;
	
	static final void method3427(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt8080++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 19, (long) i_1_ << 32 | (long) i_2_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9434 = i_0_;
		cachenode_sub2.anInt9432 = i_3_;
	}
	
	final void method3415(boolean bool, int i, int i_5_) {
		if (aBoolean8086) {
			int i_6_ = 1 << (0x3 & i);
			float f = (float) (1 << (0x7 & i >> 3)) / 32.0F;
			int i_7_ = 0xffff & i_5_;
			float f_8_ = (float) (0x3 & i_5_ >> 16) / 8.0F;
			long l = aClass288_8079.aLong3626;
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (i_6_ * anAbstractToolkit3654.anInt6332 % 40000) / 40000.0F);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_7_);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_8_);
		}
		anInt8078++;
		if (bool != true) {
			method3415(false, 29, 71);
		}
	}
	
	public static void method3428(byte b) {
		anIntArray8077 = null;
	}
	
	final boolean method3414(byte b) {
		anInt8076++;
		if (b > -45) {
			return true;
		}
		return aBoolean8083;
	}
	
	final void method3417(boolean bool, boolean bool_9_) {
		if (bool_9_ == false) {
			anInt8081++;
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		anInt8084++;
		if (b != 92) {
			aClass288_8079 = null;
		}
		if (!aBoolean8086) {
			anAbstractToolkit3654.method1312((byte) -21, interface13);
			anAbstractToolkit3654.method1278((byte) -12, i);
		}
	}
	
	static final Class10 method3429(boolean bool) {
		anInt8087++;
		if (bool != true) {
			return null;
		}
		try {
			return (Class10) Class.forName("Class10_Sub2").newInstance();
		} catch (Throwable throwable) {
			return new Class10_Sub1();
		}
	}
	
	final void method3422(int i, boolean bool) {
		if (i > -84) {
			method3414((byte) 32);
		}
		anInt8085++;
		Interface13_Impl2 interface13_impl2 = anAbstractToolkit3654.method1369(-104);
		if (aBoolean8083 && interface13_impl2 != null) {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1312((byte) -21, interface13_impl2);
			anAbstractToolkit3654.method1362(255, 0);
			anAbstractToolkit3654.method1312((byte) -21, aClass5_8088.anInterface13_Impl3_129);
			long l = aClass288_8079.aLong3626;
			OpenGL.glUseProgramObjectARB(l);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -anAbstractToolkit3654.aFloatArray6292[0], -anAbstractToolkit3654.aFloatArray6292[1], -anAbstractToolkit3654.aFloatArray6292[2]);
			OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), anAbstractToolkit3654.aFloat6323, anAbstractToolkit3654.aFloat6293, anAbstractToolkit3654.aFloat6365, 1.0F);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), Math.abs(anAbstractToolkit3654.aFloatArray6292[1]) * 928.0F + 96.0F);
			aBoolean8086 = true;
		}
	}
	
	final void method3411(int i) {
		anInt8082++;
		if (aBoolean8086) {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1312((byte) -21, null);
			anAbstractToolkit3654.method1362(i ^ ~0x2124, 0);
			anAbstractToolkit3654.method1312((byte) -21, null);
			OpenGL.glUseProgramObjectARB(0L);
			aBoolean8086 = false;
		}
		if (i != -8668) {
			method3427(-69, 76, 29, 58, -27);
		}
	}
	
	Class290_Sub3(GLXToolkit glxtoolkit, Index class302, Class5 class5) {
		super(glxtoolkit);
		aClass5_8088 = class5;
		if (class302 != null && glxtoolkit.aBoolean9315 && glxtoolkit.aBoolean9322) {
			Class237 class237 = Class24.method304(35633, -11847, class302.method3529("gl", "environment_mapped_water_v", 1), glxtoolkit);
			Class237 class237_10_ = Class24.method304(35632, -11847, class302.method3529("gl", "environment_mapped_water_f", 1), glxtoolkit);
			aClass288_8079 = Animator.method224((byte) -113, new Class237[] { class237, class237_10_ }, glxtoolkit);
			aBoolean8083 = aClass288_8079 != null && aClass5_8088.method172(10103);
		} else {
			aBoolean8083 = false;
		}
	}
}
