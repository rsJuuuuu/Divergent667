/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class167
{
	static int anInt2033;
	static OutcommingPacket aClass318_2034 = new OutcommingPacket(56, 0);
	private Class145 aClass145_2035;
	private GLToolkit aGLToolkit2036;
	static int anInt2037;
	static int anInt2038;
	static int anInt2039;
	static int anInt2040;
	
	static final int method1748(int i, byte b, int i_0_) {
		if (i_0_ < i) {
			int i_1_ = i_0_;
			i_0_ = i;
			i = i_1_;
		}
		anInt2039++;
		if (b != -21) {
			aClass318_2034 = null;
		}
		int i_2_;
		for (/**/; (i ^ 0xffffffff) != -1; i = i_2_) {
			i_2_ = i_0_ % i;
			i_0_ = i;
		}
		return i_0_;
	}
	
	final boolean method1749(byte b, float f, Class169_Sub3 class169_sub3, Class169_Sub3 class169_sub3_3_) {
		anInt2040++;
		if (!method1751(80)) {
			return false;
		}
		Class382 class382 = aGLToolkit2036.aClass382_6701;
		CacheNode_Sub17 cachenode_sub17 = new CacheNode_Sub17(aGLToolkit2036, 6408, class169_sub3.anInt8819, class169_sub3.anInt8809);
		@SuppressWarnings("unused")
		int i = 12 % ((b - 37) / 63);
		boolean bool = false;
		aGLToolkit2036.method1410(15, class382);
		class382.method4178(cachenode_sub17, 0, 1);
		if (class382.method4180(10785)) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class169_sub3.anInt8819, class169_sub3.anInt8809);
			OpenGL.glUseProgramObjectARB(aClass145_2035.aLong1795);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(aClass145_2035.aLong1795, "heightMap"), 0);
			OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(aClass145_2035.aLong1795, "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(aClass145_2035.aLong1795, "sampleSize"), 1.0F / (float) class169_sub3_3_.anInt8819, 1.0F / (float) class169_sub3_3_.anInt8809);
			for (int i_4_ = 0; i_4_ < class169_sub3.anInt8811; i_4_++) {
				float f_5_ = (float) i_4_ / (float) class169_sub3.anInt8811;
				aGLToolkit2036.method1444(-2, class169_sub3_3_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_5_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_5_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_5_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_5_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class169_sub3.method1783(0, 0, i_4_, 0, class169_sub3.anInt8819, 0, (byte) 98, class169_sub3.anInt8809);
			}
			OpenGL.glUseProgramObjectARB(0L);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			bool = true;
			OpenGL.glPopMatrix();
		}
		class382.method4175(0, -25845);
		aGLToolkit2036.method1436(class382, (byte) 45);
		return bool;
	}
	
	public static void method1750(int i) {
		aClass318_2034 = null;
		if (i != -1) {
			method1750(-57);
		}
	}
	
	final boolean method1751(int i) {
		if (aGLToolkit2036.aBoolean6719 && aGLToolkit2036.aBoolean6738 && aClass145_2035 == null) {
			Class210 class210 = Class134.method1568("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", aGLToolkit2036, -399874888, 35632);
			if (class210 != null) {
				aClass145_2035 = Class290_Sub4.method3431(aGLToolkit2036, 0, new Class210[] { class210 });
			}
		}
		anInt2038++;
		if (i < 34) {
			return false;
		}
        return aClass145_2035 != null;
    }
	
	static final Class171 method1752(int i, int i_6_, int i_7_, DrawableModel drawablemodel, int i_8_) {
		anInt2037++;
		if (drawablemodel == null) {
			return null;
		}
		if (i != 0) {
			method1752(-1, -28, -46, null, 113);
		}
		Class171 class171 = new Class171(i_7_, i_6_, i_8_, drawablemodel.na(), drawablemodel.V(), drawablemodel.RA(), drawablemodel.fa(), drawablemodel.EA(), drawablemodel.HA(), drawablemodel.G());
		return class171;
	}
	
	Class167(GLToolkit gltoolkit) {
		aGLToolkit2036 = gltoolkit;
	}
}
