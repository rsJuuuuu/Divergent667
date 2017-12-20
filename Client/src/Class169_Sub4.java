/* Class169_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class169_Sub4 extends Class169
{
	static int anInt8822;
	static int anInt8823;
	private int anInt8824;
	static Class353 aClass353_8825 = new Class353("stellardawn", "Stellar Dawn", 1);
	static int[][] anIntArrayArray8826;
	static int anInt8827;
	static int anInt8828;
	static volatile boolean aBoolean8829;
	static String aString8830 = null;
	static int anInt8831;
	
	final void method1784(int i, boolean bool) {
		aGLToolkit4947.method1444(-2, this);
		if (i != 33071) {
			method5(37);
		}
		anInt8823++;
		OpenGL.glTexParameteri(anInt4951, 10242, !bool ? 33071 : 10497);
	}
	
	public static void method1785(int i) {
		aClass353_8825 = null;
		aString8830 = null;
		if (i == -19734) {
			anIntArrayArray8826 = null;
		}
	}
	
	public final void method5(int i) {
		if (i != 0) {
			aString8830 = null;
		}
		anInt8822++;
	}
	
	Class169_Sub4(GLToolkit gltoolkit, int i, int i_0_, byte[] bs, int i_1_) {
		super(gltoolkit, 3552, i, i_0_, false);
		anInt8824 = i_0_;
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(anInt4951, 0, anInt4950, anInt8824, 0, i_1_, 5121, bs, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method1757(false, true);
	}
	
	static final void method1786(int i) {
		if (i <= 87) {
			aString8830 = null;
		}
		CacheNode_Sub10.aHashTable9530.method1517(false);
		anInt8827++;
		IComponentDefinitions.aHashTable4827.method1517(false);
	}
	
	static final void method1787(byte b) {
		anInt8828++;
		int i = 1024;
		int i_2_ = 3072;
		if (Node_Sub15_Sub10.aBoolean9850) {
			if (Class336_Sub2.aBoolean8588) {
				i = 2048;
			}
			i_2_ = 4096;
		}
		if (Class257.aFloat3243 < (float) i) {
			Class257.aFloat3243 = (float) i;
		}
		for (/**/; Node_Sub12.aFloat5450 >= 16384.0F; Node_Sub12.aFloat5450 -= 16384.0F) {
			/* empty */
		}
		if ((float) i_2_ < Class257.aFloat3243) {
			Class257.aFloat3243 = (float) i_2_;
		}
		for (/**/; Node_Sub12.aFloat5450 < 0.0F; Node_Sub12.aFloat5450 += 16384.0F) {
			/* empty */
		}
		int i_3_ = Mobile_Sub4.anInt10987 >> 9;
		int i_4_ = Class25.anInt444 >> 9;
		@SuppressWarnings("unused")
		int i_5_ = 99 / ((73 - b) / 34);
		int i_6_ = Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Class25.anInt444, Mobile_Sub4.anInt10987);
		int i_7_ = 0;
		if ((i_3_ ^ 0xffffffff) < -4 && (i_4_ ^ 0xffffffff) < -4 && -4 + Node_Sub54.GAME_SCENE_WDITH > i_3_ && i_4_ < Class377_Sub1.GAME_SCENE_HEIGHT - 4) {
			for (int i_8_ = i_3_ - 4; 4 + i_3_ >= i_8_; i_8_++) {
				for (int i_9_ = i_4_ - 4; (i_9_ ^ 0xffffffff) >= (i_4_ - -4 ^ 0xffffffff); i_9_++) {
					int i_10_ = CacheNode_Sub20_Sub1.myPlayerPlane;
					if (i_10_ < 3 && Class238.method3021(i_9_, i_8_, -83)) {
						i_10_++;
					}
					int i_11_ = 0;
					if (Node_Sub38_Sub1.aClass277_Sub1_10084.aByteArrayArrayArray3518 != null && Node_Sub38_Sub1.aClass277_Sub1_10084.aByteArrayArrayArray3518[i_10_] != null) {
						i_11_ = 8 * (Node_Sub38_Sub1.aClass277_Sub1_10084.aByteArrayArrayArray3518[i_10_][i_8_][i_9_] & 0xff) << 2;
					}
					if (Class320_Sub10.aPlaneArray8300 != null && Class320_Sub10.aPlaneArray8300[i_10_] != null) {
						int i_12_ = i_11_ - (Class320_Sub10.aPlaneArray8300[i_10_].method3251(i_9_, i_8_, (byte) -118) - i_6_);
						if (i_7_ < i_12_) {
							i_7_ = i_12_;
						}
					}
				}
			}
		}
		int i_13_ = (i_7_ >> 2) * 1536;
		if (i_13_ > 786432) {
			i_13_ = 786432;
		}
		if (i_13_ < 262144) {
			i_13_ = 262144;
		}
		if ((Class200_Sub1.anInt5145 ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
			Class200_Sub1.anInt5145 += (i_13_ - Class200_Sub1.anInt5145) / 24;
		} else if ((Class200_Sub1.anInt5145 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
			Class200_Sub1.anInt5145 += (i_13_ + -Class200_Sub1.anInt5145) / 80;
		}
	}
	
	static {
		aBoolean8829 = false;
	}
}
