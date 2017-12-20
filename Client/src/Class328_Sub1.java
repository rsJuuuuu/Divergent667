/* Class328_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Random;

public class Class328_Sub1 extends Class328
{
	static int anInt8500;
	static int anInt8501;
	private int[] anIntArray8502 = new int[512];
	static int anInt8503;
	static int[] calculatedScenePositionXs = new int[50];
	/*synthetic*/ static Class<?> aClass8505;
	
	static final Class93 method3830(Component component, int i, boolean bool) {
		anInt8503++;
		try {
			if (i != -19397) {
				return null;
			}
			Constructor<?> constructor = Class.forName("Class93_Sub1").getDeclaredConstructor(aClass8505 == null ? aClass8505 = method3832("java.awt.Component") : aClass8505, Boolean.TYPE);
			return (Class93) constructor.newInstance(component, new Boolean(bool));
		} catch (Throwable throwable) {
			return new Class93_Sub2(component, bool);
		}
	}
	
	public static void method3831(int i) {
		calculatedScenePositionXs = null;
		if (i < 115) {
			method3830(null, -12, false);
		}
	}
	
	final void method3826(float f, float f_0_, int i, float[] fs, int i_1_, float f_2_, int i_3_, float f_4_, int i_5_, byte b, int i_6_) {
		anInt8500++;
		int i_7_ = (int) (-1.0F + f_4_ * (float) i);
		i_7_ &= 0xff;
		@SuppressWarnings("unused")
		int i_8_ = -121 / ((b - 24) / 50);
		int i_9_ = (int) ((float) i_6_ * f - 1.0F);
		i_9_ &= 0xff;
		int i_10_ = (int) (-1.0F + (float) i_5_ * f_2_);
		i_10_ &= 0xff;
		float f_11_ = (float) i_3_ * f_2_;
		int i_12_ = (int) f_11_;
		int i_13_ = i_12_ - -1;
		float f_14_ = f_11_ - (float) i_12_;
		float f_15_ = -f_14_ + 1.0F;
		i_12_ &= i_10_;
		float f_16_ = Class146.method1646((byte) -115, f_14_);
		i_13_ &= i_10_;
		int i_17_ = anIntArray8502[i_12_];
		int i_18_ = anIntArray8502[i_13_];
		for (int i_19_ = 0; i_19_ < i_6_; i_19_++) {
			float f_20_ = f * (float) i_19_;
			int i_21_ = (int) f_20_;
			int i_22_ = i_21_ - -1;
			float f_23_ = f_20_ - (float) i_21_;
			float f_24_ = 1.0F - f_23_;
			float f_25_ = Class146.method1646((byte) -115, f_23_);
			i_21_ &= i_9_;
			i_22_ &= i_9_;
			int i_26_ = anIntArray8502[i_17_ + i_21_];
			int i_27_ = anIntArray8502[i_17_ + i_22_];
			int i_28_ = anIntArray8502[i_21_ - -i_18_];
			int i_29_ = anIntArray8502[i_22_ - -i_18_];
			for (int i_30_ = 0; (i ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
				float f_31_ = (float) i_30_ * f_4_;
				int i_32_ = (int) f_31_;
				int i_33_ = i_32_ - -1;
				float f_34_ = (float) -i_32_ + f_31_;
				float f_35_ = 1.0F - f_34_;
				i_33_ &= i_7_;
				i_32_ &= i_7_;
				float f_36_ = Class146.method1646((byte) -128, f_34_);
				fs[i_1_++] = f_0_ * GraphicsToolkit.method1244(GraphicsToolkit.method1244(GraphicsToolkit.method1244(Class150.method1654(f_14_, f_34_, f_23_, Node_Sub30.method2723(7, anIntArray8502[i_33_ + i_29_]), (byte) -88), 105, Class150.method1654(f_14_, f_35_, f_23_, Node_Sub30.method2723(anIntArray8502[i_32_ + i_29_], 7), (byte) -102), f_36_), 78, GraphicsToolkit.method1244(Class150.method1654(f_14_, f_34_, f_24_, Node_Sub30.method2723(7, anIntArray8502[i_28_ + i_33_]), (byte) 121), 67, Class150.method1654(f_14_, f_35_, f_24_, Node_Sub30.method2723(7, anIntArray8502[i_32_ + i_28_]), (byte) -108), f_36_), f_25_), 75, GraphicsToolkit.method1244(GraphicsToolkit.method1244(Class150.method1654(f_15_, f_34_, f_23_, Node_Sub30.method2723(7, anIntArray8502[i_27_ + i_33_]), (byte) -112), 102, Class150.method1654(f_15_, f_35_, f_23_, Node_Sub30.method2723(7, anIntArray8502[i_27_ + i_32_]), (byte) -64), f_36_), 119, GraphicsToolkit.method1244(Class150.method1654(f_15_, f_34_, f_24_, Node_Sub30.method2723(anIntArray8502[i_26_ + i_33_], 7), (byte) -61), 78, Class150.method1654(f_15_, f_35_, f_24_, Node_Sub30.method2723(anIntArray8502[i_32_ - -i_26_], 7), (byte) -75), f_36_), f_25_), f_16_);
			}
		}
	}
	
	Class328_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > -257; i_37_++)
			anIntArray8502[i_37_] = anIntArray8502[256 + i_37_] = i_37_;
		for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -257; i_38_++) {
			int i_39_ = 0xff & random.nextInt();
			int i_40_ = anIntArray8502[i_39_];
			anIntArray8502[i_39_] = anIntArray8502[256 + i_39_] = anIntArray8502[i_38_];
			anIntArray8502[i_38_] = anIntArray8502[i_38_ - -256] = i_40_;
		}
	}
	
	/*synthetic*/ static Class<?> method3832(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
