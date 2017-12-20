/* Class339_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class339_Sub6 extends Class339
{
	static int anInt8693;
	static int anInt8694;
	static int anInt8695;
	private boolean aBoolean8696;
	private boolean aBoolean8697;
	private Class50 aClass50_8698;
	private boolean aBoolean8699;
	static int[] routeFinderYArray = new int[4096];
	static int anInt8701;
	static int anInt8702;
	static int anInt8703;
	private Class50 aClass50_8704;
	private boolean aBoolean8705 = false;
	private Class50 aClass50_8706;
	static int anInt8707;
	static int anInt8708;
	static IncommingPacket aClass192_8709 = new IncommingPacket(123, 1);
	private Class50 aClass50_8710;
	private Class169_Sub2 aClass169_Sub2_8711;
	static int anInt8712;
	static int anInt8713 = 0;
	static int anInt8714;
	static boolean aBoolean8715 = false;
	
	final void method3917(Class169 class169, int i, int i_0_) {
		anInt8712++;
		if (class169 == null) {
			if (!aBoolean8705) {
				aGLToolkit4202.method1444(-2, aGLToolkit4202.aClass169_Sub2_6683);
				aGLToolkit4202.method1434((byte) 119, 1);
				aGLToolkit4202.method1464(34168, 768, 0, (byte) -51);
				aGLToolkit4202.method1472(i_0_ ^ 0x6ecb, 0, 770, 34168);
				aBoolean8705 = true;
			}
		} else {
			if (aBoolean8705) {
				aGLToolkit4202.method1464(5890, 768, 0, (byte) -51);
				aGLToolkit4202.method1472(i_0_ + 28165, 0, 770, 5890);
				aBoolean8705 = false;
			}
			aGLToolkit4202.method1444(i_0_ ^ 0x6e81, class169);
			aGLToolkit4202.method1434((byte) 116, i);
		}
		if (i_0_ != -28289) {
			anInt8694 = 24;
		}
	}
	
	final void method3923(boolean bool, int i) {
		aBoolean8697 = bool;
		anInt8714++;
		aGLToolkit4202.method1457(33984, 1);
		aGLToolkit4202.method1444(i + -2, aClass169_Sub2_8711);
		aGLToolkit4202.method1474(126, 7681, 34165);
		aGLToolkit4202.method1464(34166, 768, i, (byte) -51);
		aGLToolkit4202.method1464(5890, 770, 2, (byte) -51);
		aGLToolkit4202.method1472(-57, 0, 770, 34168);
		aGLToolkit4202.method1457(33984, 0);
		method3940(i + 77);
	}
	
	public static void method3938(byte b) {
		aClass192_8709 = null;
		int i = 63 / ((b - 68) / 52);
		routeFinderYArray = null;
	}
	
	final void method3918(int i) {
		anInt8695++;
		if (aBoolean8699) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			aBoolean8699 = false;
		}
		aGLToolkit4202.method1457(i ^ 0xd509, 1);
		aGLToolkit4202.method1444(-2, null);
		aGLToolkit4202.method1474(126, 8448, 8448);
		aGLToolkit4202.method1464(5890, 768, 0, (byte) -51);
		aGLToolkit4202.method1464(34166, 770, 2, (byte) -51);
		aGLToolkit4202.method1472(-63, 0, 770, 5890);
		if (i != 20937) {
			aClass50_8710 = null;
		}
		aGLToolkit4202.method1457(33984, 0);
		if (aBoolean8705) {
			aGLToolkit4202.method1464(5890, 768, 0, (byte) -51);
			aGLToolkit4202.method1472(-122, 0, 770, 5890);
			aBoolean8705 = false;
		}
	}
	
	final void method3920(int i, boolean bool) {
		if (i != -1) {
			aClass50_8710 = null;
		}
		anInt8702++;
	}
	
	static final int method3939(Class135 class135, int i) {
		anInt8703++;
		if (class135 != Class106.aClass135_1354) {
			if (Class115.aClass135_1465 != class135) {
				if (Class200_Sub1.aClass135_5139 == class135) {
					return 34168;
				}
				if (class135 == InterfaceSettings.aClass135_7421) {
					return 34166;
				}
			} else {
				return 34167;
			}
		} else {
			return 5890;
		}
		if (i != 34168) {
			aBoolean8715 = false;
		}
		throw new IllegalArgumentException();
	}
	
	final void method3940(int i) {
		anInt8707++;
		if (i < 45) {
			anInt8713 = 92;
		}
		Class336_Sub3 class336_sub3 = aGLToolkit4202.aClass336_Sub3_6641;
		if (aBoolean8697) {
			OpenGL.glBindProgramARB(34336, aGLToolkit4202.anInt6689 == 2147483647 ? aClass50_8704.anInt773 : aClass50_8710.anInt773);
		} else {
			OpenGL.glBindProgramARB(34336, aGLToolkit4202.anInt6689 != 2147483647 ? aClass50_8706.anInt773 : aClass50_8698.anInt773);
		}
		class336_sub3.method3896(0.0F, (float) aGLToolkit4202.anInt6689, -1.0F, 0.0F, Class188_Sub1_Sub1.aFloatArray9331, (byte) -35);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Class188_Sub1_Sub1.aFloatArray9331[0], Class188_Sub1_Sub1.aFloatArray9331[1], Class188_Sub1_Sub1.aFloatArray9331[2], Class188_Sub1_Sub1.aFloatArray9331[3]);
		OpenGL.glEnable(34336);
		aBoolean8699 = true;
		method3941(-81);
	}
	
	final void method3941(int i) {
		anInt8693++;
		if (i >= -10) {
			method3923(true, -21);
		}
		if (aBoolean8699) {
			int i_1_ = aGLToolkit4202.XA();
			int i_2_ = aGLToolkit4202.i();
			float f = (float) i_1_ - 0.125F * (float) (-i_2_ + i_1_);
			float f_3_ = -((float) (-i_2_ + i_1_) * 0.25F) + (float) i_1_;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_3_, f, 1.0F / (float) aGLToolkit4202.anInt6697, (float) aGLToolkit4202.anInt6739 / 255.0F);
			aGLToolkit4202.method1457(33984, 1);
			aGLToolkit4202.method1428(aGLToolkit4202.anInt6731, (byte) 77);
			aGLToolkit4202.method1457(33984, 0);
		}
	}
	
	Class339_Sub6(GLToolkit gltoolkit) {
		super(gltoolkit);
		if (aGLToolkit4202.aBoolean6703) {
			aClass50_8698 = Animable_Sub4.method926("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, aGLToolkit4202, (byte) 101);
			aClass50_8704 = Animable_Sub4.method926("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", 34336, aGLToolkit4202, (byte) 106);
			aClass50_8706 = Animable_Sub4.method926("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, aGLToolkit4202, (byte) 110);
			aClass50_8710 = Animable_Sub4.method926("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", 34336, aGLToolkit4202, (byte) 116);
			if (!(aClass50_8710 != null & (aClass50_8704 != null & aClass50_8698 != null & aClass50_8706 != null))) {
				aBoolean8696 = false;
			} else {
				aClass169_Sub2_8711 = new Class169_Sub2(gltoolkit, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				aClass169_Sub2_8711.method1776(false, -125, false);
				aBoolean8696 = true;
			}
		} else {
			aBoolean8696 = false;
		}
	}
	
	final void method3919(int i, int i_4_, int i_5_) {
		if (i == -13437) {
			anInt8708++;
		}
	}
	
	final boolean method3922(byte b) {
		anInt8701++;
		if (b > -44) {
			method3919(-65, 51, -117);
		}
		return aBoolean8696;
	}
	
	static {
		new Class212("", 73);
	}
}
