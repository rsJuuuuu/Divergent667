/* Animable_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

abstract class Animable_Sub3 extends Animable
{
	static int anInt9131;
	static int anInt9132;
	static int anInt9133;
	static int anInt9134;
	static Class124 aClass124_9135 = new Class124(17);
	static int anInt9136;
	static int anInt9137;
	static int anInt9138;
	static int anInt9139;
	static int anInt9140;
	static Class124 aClass124_9141 = new Class124(33);
	static int[] anIntArray9142;
	static int anInt9143;
	/*synthetic*/ static Class<?> aClass9144;
	
	final boolean method815(byte b, GraphicsToolkit graphicstoolkit) {
		anInt9134++;
		Class256 class256 = Class290_Sub7.method3442(plane, anInt5934 >> Class36.anInt549, anInt5940 >> Class36.anInt549);
		if (b != 59) {
			return true;
		}
		if (class256 == null || !class256.aMobile3239.aBoolean9121) {
			return Class313.method3649(true, anInt5940 >> Class36.anInt549, plane, anInt5934 >> Class36.anInt549);
		}
		return Class150.method1652(class256.aMobile3239.method817(2) + this.method817(2), plane, anInt5934 >> Class36.anInt549, 0, anInt5940 >> Class36.anInt549);
	}
	
	final boolean method806(int i) {
		anInt9138++;
		if (i != 0) {
			return false;
		}
		return Class139.aBooleanArrayArray1730[-Class216.anInt2551 + ((anInt5934 >> Class36.anInt549) - -Node_Sub9_Sub1.anInt9656)][Node_Sub9_Sub1.anInt9656 + -EntityNode_Sub7.anInt6013 + (anInt5940 >> Class36.anInt549)];
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_0_, byte b, int i_1_, Animable animable) {
		if (b >= 101) {
			anInt9140++;
			throw new IllegalStateException();
		}
	}
	
	static final void method918(byte b) {
		@SuppressWarnings("unused")
		int i = 21 / ((b - -65) / 42);
		if (Class240.aSignLink2946.aBoolean3985) {
			Class201.anInt2446 = 96;
		} else {
			try {
				Method method = (aClass9144 == null ? aClass9144 = method922("java.lang.Runtime") : aClass9144).getMethod("maxMemory");
				if (method != null) {
					try {
						Runtime runtime = Runtime.getRuntime();
						Long var_long = (Long) method.invoke(runtime, new Object());
						Class201.anInt2446 = 1 + (int) (var_long.longValue() / 1048576L);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		}
		anInt9137++;
	}
	
	final int method819(Node_Sub29[] node_sub29s, int i) {
		if (i != 1) {
			method919(-100, -66, -22, -120, -28, false, 26);
		}
		anInt9132++;
		return this.method808(-23024, node_sub29s, anInt5940 >> Class36.anInt549, anInt5934 >> Class36.anInt549);
	}
	
	static final void method919(int i, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_) {
		anInt9143++;
		if (i_2_ > i_5_ || i_3_ < 512 || (-1024 + Node_Sub54.GAME_SCENE_WDITH * 512 ^ 0xffffffff) > (i_5_ ^ 0xffffffff) || (-1024 + Class377_Sub1.GAME_SCENE_HEIGHT * 512 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
			Class119.anIntArray1516[0] = Class119.anIntArray1516[1] = -1;
		} else {
			int i_7_ = Node_Sub38_Sub7.method2809(i, -29754, i_3_, i_5_) + -i_4_;
			if (Class71.aBoolean967) {
				Class379.method4159(3, true);
			} else {
				Class290_Sub6.aClass336_8114.method3863(i_6_, 0, 0);
				Class93.aGraphicsToolkit1241.a(Class290_Sub6.aClass336_8114);
			}
			if (!Node_Sub15_Sub10.aBoolean9850) {
				if (bool) {
					Class93.aGraphicsToolkit1241.H(i_5_, i_7_, i_3_, Class119.anIntArray1516);
				} else {
					Class93.aGraphicsToolkit1241.da(i_5_, i_7_, i_3_, Class119.anIntArray1516);
				}
			} else {
				Class93.aGraphicsToolkit1241.HA(i_5_, i_7_, i_3_, Class308.anInt3912, Class119.anIntArray1516);
			}
			if (!Class71.aBoolean967) {
				Class290_Sub6.aClass336_8114.method3863(-i_6_, 0, 0);
				Class93.aGraphicsToolkit1241.a(Class290_Sub6.aClass336_8114);
			} else {
				Class258.method3127((byte) 122);
			}
		}
	}
	
	public static void method920(int i) {
		aClass124_9141 = null;
		if (i != 22056) {
			method918((byte) -100);
		}
		anIntArray9142 = null;
		aClass124_9135 = null;
	}
	
	static final void method921(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		anInt9133++;
		int i_13_ = -i_10_ + i_8_;
		int i_14_ = i_9_ + -i_12_;
		if (i_13_ != 0) {
			if (i_14_ == 0) {
				Class155.method1701(i_8_, i_12_, 1, i_11_, i_10_);
				return;
			}
		} else {
			if (i_14_ != 0) {
				Class66_Sub2_Sub1.method727(i_10_, i_11_, i_12_, -103, i_9_);
			}
			return;
		}
		if (i != 1048576) {
			method918((byte) -120);
		}
		int i_15_ = (i_14_ << 12) / i_13_;
		int i_16_ = i_12_ + -(i_10_ * i_15_ >> 12);
		int i_17_;
		int i_18_;
		if (i_8_ >= Class262_Sub4.anInt7722) {
			if (i_8_ > za_Sub2.anInt10513) {
				i_17_ = i_16_ - -(za_Sub2.anInt10513 * i_15_ >> 12);
				i_18_ = za_Sub2.anInt10513;
			} else {
				i_17_ = i_9_;
				i_18_ = i_8_;
			}
		} else {
			i_17_ = (i_15_ * Class262_Sub4.anInt7722 >> 12) + i_16_;
			i_18_ = Class262_Sub4.anInt7722;
		}
		int i_19_;
		int i_20_;
		if (i_10_ >= Class262_Sub4.anInt7722) {
			if ((za_Sub2.anInt10513 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)) {
				i_19_ = i_10_;
				i_20_ = i_12_;
			} else {
				i_20_ = i_16_ - -(i_15_ * za_Sub2.anInt10513 >> 12);
				i_19_ = za_Sub2.anInt10513;
			}
		} else {
			i_19_ = Class262_Sub4.anInt7722;
			i_20_ = i_16_ + (Class262_Sub4.anInt7722 * i_15_ >> 12);
		}
		if ((Class384.anInt4906 ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
			if (Node_Sub25_Sub1.anInt9936 < i_17_) {
				i_18_ = (Node_Sub25_Sub1.anInt9936 - i_16_ << 12) / i_15_;
				i_17_ = Node_Sub25_Sub1.anInt9936;
			}
		} else {
			i_17_ = Class384.anInt4906;
			i_18_ = (-i_16_ + Class384.anInt4906 << 12) / i_15_;
		}
		if ((i_20_ ^ 0xffffffff) > (Class384.anInt4906 ^ 0xffffffff)) {
			i_19_ = (-i_16_ + Class384.anInt4906 << 12) / i_15_;
			i_20_ = Class384.anInt4906;
		} else if ((Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
			i_19_ = (-i_16_ + Node_Sub25_Sub1.anInt9936 << 12) / i_15_;
			i_20_ = Node_Sub25_Sub1.anInt9936;
		}
		Node_Sub38_Sub19.method2851(i_19_, i_18_, i_11_, (byte) 127, i_17_, i_20_);
	}
	
	final void method811(int i) {
		anInt9131++;
		if (i == 27811) {
			throw new IllegalStateException();
		}
	}
	
	Animable_Sub3(int i, int i_21_, int i_22_, int i_23_, int i_24_) {
		anInt5934 = i;
		aByte5931 = (byte) i_24_;
		anInt5937 = i_21_;
		anInt5940 = i_22_;
		plane = (byte) i_23_;
	}
	
	final boolean method821(int i) {
		anInt9136++;
		if (i != 0) {
			method815((byte) -87, null);
		}
		return false;
	}
	
	/*synthetic*/ static Class<?> method922(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
