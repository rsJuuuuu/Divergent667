/* Class339_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class339_Sub2 extends Class339
{
	static int anInt8640;
	static Class379 aClass379_8641;
	static int anInt8642;
	private Class301 aClass301_8643;
	private Class25 aClass25_8644;
	static int anInt8645;
	static int anInt8646;
	static int anInt8647 = 500;
	static int anInt8648;
	static int anInt8649;
	static int anInt8650 = -1;
	static int anInt8651;
	private Class169_Sub4 aClass169_Sub4_8652;
	static int anInt8653 = -2;
	static int anInt8654;
	
	Class339_Sub2(GLToolkit gltoolkit, Class301 class301) {
		super(gltoolkit);
		aClass301_8643 = class301;
		method3929((byte) 82);
		aClass169_Sub4_8652 = new Class169_Sub4(aGLToolkit4202, 6406, 2, new byte[] { 0, -1 }, 6406);
		aClass169_Sub4_8652.method1784(33071, false);
	}
	
	public static void method3927(int i) {
		if (i > -124) {
			anInt8653 = 97;
		}
		aClass379_8641 = null;
	}
	
	final void method3920(int i, boolean bool) {
		if (i != -1) {
			method3918(52);
		}
		anInt8651++;
		aGLToolkit4202.method1474(i ^ ~0x7e, 8448, 260);
	}
	
	static final void method3928(int i, Packet packet) {
		anInt8648++;
		packet.writeInt(Class181.aClass302_2158.method3505(false));
		packet.writeInt(Class75.aClass302_1003.method3505(false));
		packet.writeInt(Class4.index2.method3505(false));
		packet.writeInt(Class293.aClass302_3681.method3505(false));
		packet.writeInt(Class148.aClass302_1827.method3505(false));
		packet.writeInt(Animable_Sub1_Sub1.aClass302_10618.method3505(false));
		packet.writeInt(SeekableFile.index6.method3505(false));
		packet.writeInt(Class107.aClass302_1364.method3505(false));
		packet.writeInt(Node_Sub38_Sub39.aClass302_10500.method3505(false));
		packet.writeInt(Class282.aClass302_3583.method3505(false));
		packet.writeInt(Class250.aClass302_3179.method3505(false));
		packet.writeInt(Class179.aClass302_2132.method3505(false));
		packet.writeInt(Class21.aClass302_357.method3505(false));
		packet.writeInt(AnimableAnimator_Sub1.aClass302_9091.method3505(false));
		packet.writeInt(Class78.aClass302_1033.method3505(false));
		int i_0_ = -55 % ((i - 12) / 53);
		packet.writeInt(Class218.aClass302_2563.method3505(false));
		packet.writeInt(Class247.aClass302_3143.method3505(false));
		packet.writeInt(Class14.index17.method3505(false));
		packet.writeInt(Class174.aClass302_2093.method3505(false));
		packet.writeInt(Class205.index19.method3505(false));
		packet.writeInt(Class262_Sub23.aClass302_7886.method3505(false));
		packet.writeInt(Node_Sub15_Sub5.aClass302_9805.method3505(false));
		packet.writeInt(Class127.index22.method3505(false));
		packet.writeInt(r_Sub1.aClass302_11047.method3505(false));
		packet.writeInt(Node_Sub38_Sub4.aClass302_10116.method3505(false));
		packet.writeInt(Node_Sub18.aClass302_7150.method3505(false));
		packet.writeInt(Node_Sub38_Sub10.aClass302_10197.method3505(false));
		packet.writeInt(CacheNode_Sub5.aClass302_9477.method3505(false));
		packet.writeInt(Class176.aClass302_2102.method3505(false));
		packet.writeInt(Class262_Sub3.aClass302_7715.method3505(false));
		packet.writeInt(Class326.index30.method3505(false));
		packet.writeInt(Class262_Sub2.index31.method3505(false));
		packet.writeInt(Node_Sub15_Sub10.aClass302_9853.method3505(false));
		packet.writeInt(Class107.method1124(1403));
		packet.writeInt(Class262_Sub3.method3156(91));
		packet.writeInt(Node_Sub38_Sub38.index36.method3505(false));
	}
	
	final void method3923(boolean bool, int i) {
		anInt8654++;
		if (i < aGLToolkit4202.anInt6691) {
			float f = -0.5F / (float) aGLToolkit4202.anInt6691;
			aGLToolkit4202.method1457(33984, 1);
			Class144_Sub4.aFloatArray6843[3] = aGLToolkit4202.aFloat6659 * f + 0.25F;
			Class144_Sub4.aFloatArray6843[0] = 0.0F;
			Class144_Sub4.aFloatArray6843[1] = 0.0F;
			Class144_Sub4.aFloatArray6843[2] = f;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Class144_Sub4.aFloatArray6843, 0);
			OpenGL.glPopMatrix();
			aGLToolkit4202.method1438((byte) 99, 0.5F, (float) aGLToolkit4202.anInt6691);
			aGLToolkit4202.method1444(-2, aClass169_Sub4_8652);
			aGLToolkit4202.method1457(33984, 0);
		}
		aClass25_8644.method310('\0', (byte) -17);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
	
	final void method3919(int i, int i_1_, int i_2_) {
		if ((0x1 & i_2_ ^ 0xffffffff) == -2) {
			if (!aClass301_8643.aBoolean3780) {
				int i_3_ = 16 * (aGLToolkit4202.anInt6605 % 4000) / 4000;
				aGLToolkit4202.method1444(-2, aClass301_8643.aClass169_Sub2Array3774[i_3_]);
			} else {
				aGLToolkit4202.method1444(-2, aClass301_8643.aClass169_Sub3_3777);
				Class144_Sub4.aFloatArray6843[3] = (float) (aGLToolkit4202.anInt6605 % 4000) / 4000.0F;
				Class144_Sub4.aFloatArray6843[0] = 0.0F;
				Class144_Sub4.aFloatArray6843[2] = 0.0F;
				Class144_Sub4.aFloatArray6843[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Class144_Sub4.aFloatArray6843, 0);
			}
		} else if (aClass301_8643.aBoolean3780) {
			aGLToolkit4202.method1444(-2, aClass301_8643.aClass169_Sub3_3777);
			Class144_Sub4.aFloatArray6843[3] = 0.0F;
			Class144_Sub4.aFloatArray6843[0] = 0.0F;
			Class144_Sub4.aFloatArray6843[2] = 0.0F;
			Class144_Sub4.aFloatArray6843[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Class144_Sub4.aFloatArray6843, 0);
		} else {
			aGLToolkit4202.method1444(-2, aClass301_8643.aClass169_Sub2Array3774[0]);
		}
		if (i != -13437) {
			anInt8653 = -113;
		}
		anInt8642++;
	}
	
	final void method3918(int i) {
		aClass25_8644.method310('\001', (byte) -45);
		if (i == 20937) {
			anInt8645++;
			if ((aGLToolkit4202.anInt6691 ^ 0xffffffff) < -1) {
				aGLToolkit4202.method1457(33984, 1);
				aGLToolkit4202.method1444(-2, null);
				aGLToolkit4202.method1438((byte) 81, 1.0F, 0.0F);
				aGLToolkit4202.method1457(33984, 0);
			}
			aGLToolkit4202.method1474(127, 8448, 8448);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}
	
	final void method3917(Class169 class169, int i, int i_4_) {
		if (i_4_ == -28289) {
			anInt8649++;
		}
	}
	
	final boolean method3922(byte b) {
		if (b >= -44) {
			method3917(null, 70, 85);
		}
		anInt8646++;
		return true;
	}
	
	private final void method3929(byte b) {
		aClass25_8644 = new Class25(aGLToolkit4202, 2);
		anInt8640++;
		aClass25_8644.method307(0, 4864);
		aGLToolkit4202.method1457(33984, 1);
		aGLToolkit4202.method1474(-12, 260, 7681);
		aGLToolkit4202.method1464(34168, 768, 0, (byte) -51);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aGLToolkit4202.method1457(33984, 0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass301_8643.aBoolean3780) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		int i = -123 % ((-37 - b) / 62);
		aClass25_8644.method309(false);
		aClass25_8644.method307(1, 4864);
		aGLToolkit4202.method1457(33984, 1);
		aGLToolkit4202.method1474(126, 8448, 8448);
		aGLToolkit4202.method1464(5890, 768, 0, (byte) -51);
		OpenGL.glDisable(3168);
		aGLToolkit4202.method1457(33984, 0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass301_8643.aBoolean3780) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass25_8644.method309(false);
	}
	
	static {
		aClass379_8641 = new Class379();
	}
}
