/* Class290_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class290_Sub4 extends Class290
{
	static OutcommingPacket aClass318_8089;
	private boolean aBoolean8090;
	static int anInt8091;
	static int anInt8092;
	static int anInt8093;
	static int anInt8094;
	static int anInt8095;
	private Interface13_Impl2[] anInterface13_Impl2Array8096;
	static int anInt8097;
	private boolean aBoolean8098 = false;
	static int anInt8099;
	static int anInt8100 = -1;
	static int anInt8101;
	static int[] anIntArray8102;
	
	final void method3419(Interface13 interface13, int i, byte b) {
		anInt8091++;
		anAbstractToolkit3654.method1312((byte) -21, interface13);
		anAbstractToolkit3654.method1278((byte) -12, i);
		if (b != 92) {
			anInt8100 = 40;
		}
	}
	
	final void method3422(int i, boolean bool) {
		if (anInterface13_Impl2Array8096 == null || !bool) {
			anAbstractToolkit3654.method1366((byte) -107, Class115.aClass135_1465, 0);
		} else {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1321((byte) 102, Class191.aClass139_2349);
			Class336_Sub1 class336_sub1 = anAbstractToolkit3654.method1306(7);
			class336_sub1.method3865(1024);
			anAbstractToolkit3654.method1297(-21029, Class55.aClass346_829);
			if (!aBoolean8090) {
				anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class117_Sub1.aClass94_4924);
				anAbstractToolkit3654.method1304(0, 0, Class200_Sub1.aClass135_5139);
				anAbstractToolkit3654.method1362(255, 2);
				anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class236.aClass94_2898);
				anAbstractToolkit3654.method1304(0, 0, Class200_Sub1.aClass135_5139);
				anAbstractToolkit3654.method1349(Class200_Sub1.aClass135_5139, (byte) 19, true, false, 1);
				anAbstractToolkit3654.method1366((byte) 110, Class115.aClass135_1465, 0);
				anAbstractToolkit3654.method1312((byte) -21, anAbstractToolkit3654.anInterface13_6357);
			} else {
				anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class236.aClass94_2898);
				anAbstractToolkit3654.method1349(Class106.aClass135_1354, (byte) 19, true, false, 0);
				anAbstractToolkit3654.method1366((byte) -96, Class115.aClass135_1465, 0);
			}
			anAbstractToolkit3654.method1362(255, 0);
			aBoolean8098 = true;
		}
		if (i < -84) {
			anInt8093++;
		}
	}
	
	Class290_Sub4(AbstractToolkit abstracttoolkit) {
		super(abstracttoolkit);
		if (abstracttoolkit.aBoolean6310) {
			aBoolean8090 = (abstracttoolkit.anInt6370 ^ 0xffffffff) > -4;
			int i = aBoolean8090 ? 48 : 127;
			int[][] is = new int[6][4096];
			int[][] is_0_ = new int[6][4096];
			int[][] is_1_ = new int[6][4096];
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < 64; i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -65; i_4_++) {
					float f = 2.0F * (float) i_4_ / 64.0F - 1.0F;
					float f_5_ = (float) i_3_ * 2.0F / 64.0F - 1.0F;
					float f_6_ = (float) (1.0 / Math.sqrt((double) (f_5_ * f_5_ + (f * f + 1.0F))));
					f_5_ *= f_6_;
					f *= f_6_;
					for (int i_7_ = 0; i_7_ < 6; i_7_++) {
						float f_8_;
						if (i_7_ == 0) {
							f_8_ = -f;
						} else if ((i_7_ ^ 0xffffffff) == -2) {
							f_8_ = f;
						} else if (i_7_ != 2) {
							if ((i_7_ ^ 0xffffffff) != -4) {
								if (i_7_ == 4) {
									f_8_ = f_6_;
								} else {
									f_8_ = -f_6_;
								}
							} else {
								f_8_ = -f_5_;
							}
						} else {
							f_8_ = f_5_;
						}
						int i_9_;
						int i_10_;
						int i_11_;
						if (f_8_ > 0.0F) {
							i_9_ = (int) (Math.pow((double) f_8_, 96.0) * (double) i);
							i_10_ = (int) ((double) i * Math.pow((double) f_8_, 36.0));
							i_11_ = (int) ((double) i * Math.pow((double) f_8_, 12.0));
						} else {
							i_9_ = i_10_ = i_11_ = 0;
						}
						is_0_[i_7_][i_2_] = i_9_ << 24;
						is_1_[i_7_][i_2_] = i_10_ << 24;
						is[i_7_][i_2_] = i_11_ << 24;
					}
					i_2_++;
				}
			}
			anInterface13_Impl2Array8096 = new Interface13_Impl2[3];
			anInterface13_Impl2Array8096[0] = anAbstractToolkit3654.method1287(64, is_0_, false, 0);
			anInterface13_Impl2Array8096[1] = anAbstractToolkit3654.method1287(64, is_1_, false, 0);
			anInterface13_Impl2Array8096[2] = anAbstractToolkit3654.method1287(64, is, false, 0);
		}
	}
	
	static final void method3430(boolean bool) {
		if (bool != true) {
			method3432(103, -65, -36);
		}
		if (AnimableAnimator.aClass42_5498 != null) {
			AnimableAnimator.aClass42_5498.method445(3);
		}
		anInt8101++;
		if (Packet.aClass42_9402 != null) {
			Packet.aClass42_9402.method445(3);
		}
	}
	
	static final Class145 method3431(GLToolkit gltoolkit, int i, Class210[] class210s) {
		anInt8099++;
		for (int i_12_ = i; (class210s.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
			if (class210s[i_12_] == null || class210s[i_12_].aLong2500 <= 0L) {
				return null;
			}
		}
		long l = OpenGL.glCreateProgramObjectARB();
		for (int i_13_ = 0; class210s.length > i_13_; i_13_++)
			OpenGL.glAttachObjectARB(l, class210s[i_13_].aLong2500);
		OpenGL.glLinkProgramARB(l);
		OpenGL.glGetObjectParameterivARB(l, 35714, Class78.anIntArray1030, 0);
		if ((Class78.anIntArray1030[0] ^ 0xffffffff) == -1) {
			if (Class78.anIntArray1030[0] == 0) {
				//System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(l, 35716, Class78.anIntArray1030, 1);
			if (Class78.anIntArray1030[1] > 1) {
				byte[] bs = new byte[Class78.anIntArray1030[1]];
				OpenGL.glGetInfoLogARB(l, Class78.anIntArray1030[1], Class78.anIntArray1030, 0, bs, 0);
				//System.out.println(new String(bs));
			}
			if (Class78.anIntArray1030[0] == 0) {
				for (int i_14_ = 0; class210s.length > i_14_; i_14_++)
					OpenGL.glDetachObjectARB(l, class210s[i_14_].aLong2500);
				OpenGL.glDeleteObjectARB(l);
				return null;
			}
		}
		return new Class145(gltoolkit, l, class210s);
	}
	
	static final void method3432(int i, int i_15_, int i_16_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_15_][i_16_];
		if (class261 != null) {
			Class58.method575(class261.anAnimable_Sub4_3315);
			Class58.method575(class261.anAnimable_Sub4_3319);
			if (class261.anAnimable_Sub4_3315 != null) {
				class261.anAnimable_Sub4_3315 = null;
			}
			if (class261.anAnimable_Sub4_3319 != null) {
				class261.anAnimable_Sub4_3319 = null;
			}
		}
	}
	
	final boolean method3414(byte b) {
		if (b > -45) {
			return true;
		}
		anInt8097++;
		return true;
	}
	
	final void method3415(boolean bool, int i, int i_17_) {
		if (bool != true) {
			aClass318_8089 = null;
		}
		if (aBoolean8098) {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1312((byte) -21, anInterface13_Impl2Array8096[i - 1]);
			anAbstractToolkit3654.method1362(255, 0);
		}
		anInt8095++;
	}
	
	final void method3417(boolean bool, boolean bool_18_) {
		anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class116.aClass94_5075);
		anInt8094++;
		if (bool_18_ != false) {
			method3432(-103, -7, -104);
		}
	}
	
	final void method3411(int i) {
		anInt8092++;
		if (!aBoolean8098) {
			anAbstractToolkit3654.method1366((byte) 89, Class106.aClass135_1354, 0);
		} else {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1312((byte) -21, null);
			anAbstractToolkit3654.method1321((byte) 102, Class308.aClass139_3915);
			anAbstractToolkit3654.method1255((byte) -12);
			if (!aBoolean8090) {
				anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
				anAbstractToolkit3654.method1304(0, i ^ ~0x21db, Class106.aClass135_1354);
				anAbstractToolkit3654.method1362(i ^ ~0x2124, 2);
				anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
				anAbstractToolkit3654.method1304(0, 0, Class106.aClass135_1354);
				anAbstractToolkit3654.method1304(1, 0, Class200_Sub1.aClass135_5139);
				anAbstractToolkit3654.method1366((byte) -89, Class106.aClass135_1354, 0);
				anAbstractToolkit3654.method1312((byte) -21, null);
			} else {
				anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
				anAbstractToolkit3654.method1304(0, i + 8668, Class106.aClass135_1354);
				anAbstractToolkit3654.method1366((byte) -122, Class106.aClass135_1354, 0);
			}
			anAbstractToolkit3654.method1362(255, 0);
			aBoolean8098 = false;
		}
		if (i != -8668) {
			anInt8100 = -85;
		}
		anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
	}
	
	public static void method3433(int i) {
		if (i != 64) {
			method3432(-10, -50, 16);
		}
		anIntArray8102 = null;
		aClass318_8089 = null;
	}
	
	static {
		aClass318_8089 = new OutcommingPacket(82, 3);
	}
}
