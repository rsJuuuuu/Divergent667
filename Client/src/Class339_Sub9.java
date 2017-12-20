/* Class339_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class339_Sub9 extends Class339
{
	private float[] aFloatArray8742;
	private Class301 aClass301_8743;
	private int anInt8744;
	static int anInt8745;
	private float aFloat8746;
	private Class50 aClass50_8747;
	static int anInt8748;
	static IncommingPacket aClass192_8749 = new IncommingPacket(62, 16);
	static int anInt8750;
	static int anInt8751;
	private Class25 aClass25_8752;
	static int anInt8753;
	static int anInt8754;
	static int anInt8755;
	static int anInt8756;
	
	Class339_Sub9(GLToolkit gltoolkit, Class301 class301) {
		super(gltoolkit);
		aClass301_8743 = class301;
		if (aGLToolkit4202.aBoolean6703 && (aGLToolkit4202.anInt6680 ^ 0xffffffff) <= -3) {
			aClass50_8747 = Animable_Sub4.method926("!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 34336, aGLToolkit4202, (byte) 122);
			if (aClass50_8747 != null) {
				int[][] is = Class261.method3142(false, 3, 256, 4, 4, 0, 64, 126, 0.4F);
				int[][] is_0_ = Class261.method3142(false, 3, 256, 4, 4, 8, 64, 127, 0.4F);
				int i = 0;
				aFloatArray8742 = new float[32768];
				for (int i_1_ = 0; i_1_ < 256; i_1_++) {
					int[] is_2_ = is[i_1_];
					int[] is_3_ = is_0_[i_1_];
					for (int i_4_ = 0; i_4_ < 64; i_4_++) {
						aFloatArray8742[i++] = (float) is_2_[i_4_] / 4096.0F;
						aFloatArray8742[i++] = (float) is_3_[i_4_] / 4096.0F;
					}
				}
				method3948(256);
			}
		}
	}
	
	final void method3919(int i, int i_5_, int i_6_) {
		anInt8751++;
		if (aClass25_8752 != null) {
			aGLToolkit4202.method1457(33984, 1);
			if ((0x80 & i_6_ ^ 0xffffffff) == -1) {
				if ((i_5_ & 0x1) == 1) {
					if (aClass301_8743.aBoolean3780) {
						aGLToolkit4202.method1444(-2, aClass301_8743.aClass169_Sub3_3777);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8746, 0.0F, 0.0F, 1.0F);
					} else {
						int i_7_ = 16 * (aGLToolkit4202.anInt6605 % 4000) / 4000;
						aGLToolkit4202.method1444(-2, aClass301_8743.aClass169_Sub2Array3774[i_7_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass301_8743.aBoolean3780) {
						aGLToolkit4202.method1444(-2, aClass301_8743.aClass169_Sub3_3777);
					} else {
						aGLToolkit4202.method1444(-2, aClass301_8743.aClass169_Sub2Array3774[0]);
					}
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				aGLToolkit4202.method1444(-2, null);
			}
			aGLToolkit4202.method1457(33984, 0);
			if ((0x40 & i_6_) == 0) {
				Class338.aFloatArray4199[1] = aGLToolkit4202.aFloat6737 * aGLToolkit4202.aFloat6707;
				Class338.aFloatArray4199[2] = aGLToolkit4202.aFloat6737 * aGLToolkit4202.aFloat6672;
				Class338.aFloatArray4199[0] = aGLToolkit4202.aFloat6737 * aGLToolkit4202.aFloat6734;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, Class338.aFloatArray4199, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}
			int i_8_ = 0x3 & i_6_;
			if ((i_8_ ^ 0xffffffff) != -3) {
				if ((i_8_ ^ 0xffffffff) == -4) {
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
				} else {
					OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
				}
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			}
			if (i != -13437) {
				anInt8744 = 18;
			}
		}
	}
	
	final boolean method3922(byte b) {
		anInt8756++;
		if (b > -44) {
			aClass192_8749 = null;
		}
		return true;
	}
	
	public static void method3947(byte b) {
		if (b != 68) {
			aClass192_8749 = null;
		}
		aClass192_8749 = null;
	}
	
	private final void method3948(int i) {
		aClass25_8752 = new Class25(aGLToolkit4202, 2);
		anInt8753++;
		aClass25_8752.method307(0, 4864);
		aGLToolkit4202.method1457(33984, 1);
		aGLToolkit4202.method1428(-16777216, (byte) 86);
		aGLToolkit4202.method1474(-120, 7681, 260);
		if (i != 256) {
			aClass50_8747 = null;
		}
		aGLToolkit4202.method1472(-97, 0, 770, 34166);
		aGLToolkit4202.method1457(i ^ 0x85c0, 0);
		OpenGL.glBindProgramARB(34336, aClass50_8747.anInt773);
		OpenGL.glEnable(34336);
		aClass25_8752.method309(false);
		aClass25_8752.method307(1, 4864);
		aGLToolkit4202.method1457(i ^ 0x85c0, 1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aGLToolkit4202.method1434((byte) -90, 0);
		aGLToolkit4202.method1472(-108, 0, 770, 5890);
		aGLToolkit4202.method1457(33984, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		aClass25_8752.method309(false);
	}
	
	final void method3918(int i) {
		if (i == 20937) {
			anInt8745++;
			if (aClass25_8752 != null) {
				aClass25_8752.method310('\001', (byte) -42);
				aGLToolkit4202.method1457(33984, 1);
				aGLToolkit4202.method1444(-2, null);
				aGLToolkit4202.method1457(i + 13047, 0);
			}
		}
	}
	
	final void method3923(boolean bool, int i) {
		anInt8755++;
		if (aClass25_8752 != null) {
			aClass25_8752.method310('\0', (byte) -66);
			aGLToolkit4202.method1457(33984, 1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGLToolkit4202.aClass336_Sub3_6642.method3899(i + -82), 0);
			OpenGL.glMatrixMode(5888);
			aGLToolkit4202.method1457(33984, i);
			if ((anInt8744 ^ 0xffffffff) != (aGLToolkit4202.anInt6605 ^ 0xffffffff)) {
				int i_9_ = 128 * (aGLToolkit4202.anInt6605 % 5000) / 5000;
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -65; i_10_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_10_, aFloatArray8742, i_9_);
					i_9_ += 2;
				}
				if (!aClass301_8743.aBoolean3780) {
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				} else {
					aFloat8746 = (float) (aGLToolkit4202.anInt6605 % 4000) / 4000.0F;
				}
				anInt8744 = aGLToolkit4202.anInt6605;
			}
		}
	}
	
	final void method3917(Class169 class169, int i, int i_11_) {
		aGLToolkit4202.method1444(-2, class169);
		anInt8748++;
		aGLToolkit4202.method1434((byte) 73, i);
		if (i_11_ != -28289) {
			method3947((byte) 75);
		}
	}
	
	final void method3920(int i, boolean bool) {
		anInt8750++;
		if (i != -1) {
			aFloatArray8742 = null;
		}
	}
}
