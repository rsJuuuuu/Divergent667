/* Animable_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

public class Animable_Sub1_Sub1 extends Animable_Sub1 implements Interface19
{
	static int anInt10585;
	static int anInt10586;
	static int anInt10587;
	private boolean aBoolean10588;
	static int anInt10589;
	static int anInt10590;
	static int anInt10591;
	static int anInt10592;
	static int anInt10593;
	private r aR10594;
	private boolean aBoolean10595;
	static int anInt10596;
	static int anInt10597;
	private boolean aBoolean10598;
	static int anInt10599;
	static int anInt10600;
	static int anInt10601;
	static int anInt10602;
	static int anInt10603;
	static int anInt10604;
	static int anInt10605;
	static int anInt10606;
	private int aShort10607;
	private byte aByte10608;
	static int anInt10609;
	private DrawableModel aDrawableModel10610;
	static int anInt10611;
	static int anInt10612;
	static InterfaceSettings aNode_Sub35_10613 = new InterfaceSettings(0, -1);
	private boolean aBoolean10614;
	private Class171 aClass171_10615;
	static SignLink aSignLink10616;
	static int anInt10617;
	static Index aClass302_10618;
	/*synthetic*/ static Class<?> aClass10619;
	
	final boolean method814(byte b) {
		anInt10606++;
		if (aDrawableModel10610 == null) {
			return true;
		}
        return !aDrawableModel10610.r();
    }
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10585++;
		if (aDrawableModel10610 == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10598, (byte) 89, 1);
		if (Node_Sub15_Sub10.aBoolean9850) {
			aDrawableModel10610.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		} else {
			aDrawableModel10610.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		}
		return entitynode_sub6;
	}
	
	final int method817(int i) {
		if (i != 2) {
			return 14;
		}
		anInt10587++;
		if (aDrawableModel10610 != null) {
			return aDrawableModel10610.fa();
		}
		return 0;
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_1_, byte b, int i_2_, Animable animable) {
		anInt10605++;
		if (b <= 101) {
			method828(-126, -84, null, false);
		}
		if (animable instanceof Animable_Sub1_Sub1) {
			Animable_Sub1_Sub1 animable_sub1_sub1_3_ = (Animable_Sub1_Sub1) animable;
			if (aDrawableModel10610 != null && animable_sub1_sub1_3_.aDrawableModel10610 != null) {
				aDrawableModel10610.method619(animable_sub1_sub1_3_.aDrawableModel10610, i_2_, i, i_1_, bool);
			}
		}
	}
	
	final boolean method810(int i, int i_4_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10600++;
		if (bool != false) {
			aSignLink10616 = null;
		}
		DrawableModel drawablemodel = method831(25, graphicstoolkit, 131072);
		if (drawablemodel != null) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(anInt5934, anInt5937, anInt5940);
			if (!Node_Sub15_Sub10.aBoolean9850) {
				return drawablemodel.method624(i_4_, i, class336, false, 0);
			}
			return drawablemodel.method621(i_4_, i, class336, false, 0, Class308.anInt3912);
		}
		return false;
	}
	
	Animable_Sub1_Sub1(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, boolean bool_10_) {
		super(i_6_, i_7_, i_8_, i, i_5_, objectdefinition.anInt2983);
		aShort10607 =  objectdefinition.objectId;
		anInt5940 = i_8_;
		aByte10608 = (byte) i_9_;
		aBoolean10598 = objectdefinition.anInt3057 != 0 && !bool;
		anInt5934 = i_6_;
		aBoolean10614 = bool;
		aBoolean10588 = bool_10_;
		aBoolean10595 = graphicstoolkit.r() && objectdefinition.aBoolean2972 && !aBoolean10614 && Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) != 0;
		int i_11_ = 2048;
		if (aBoolean10588) {
			i_11_ |= 0x10000;
		}
		Class243 class243 = method828(i_11_, 20, graphicstoolkit, aBoolean10595);
		if (class243 != null) {
			aR10594 = class243.aR3072;
			aDrawableModel10610 = class243.aDrawableModel3064;
			if (aBoolean10588) {
				aDrawableModel10610 = aDrawableModel10610.method633((byte) 0, i_11_, false);
			}
		}
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10596++;
		if (i < -46) {
			r var_r;
			if (aR10594 == null && aBoolean10595) {
				Class243 class243 = method828(262144, 20, graphicstoolkit, true);
				var_r = class243 != null ? class243.aR3072 : null;
			} else {
				var_r = aR10594;
				aR10594 = null;
			}
			if (var_r != null) {
				Class320_Sub30.method3797(var_r, aByte5931, anInt5934, anInt5940, null);
			}
		}
	}
	
	public static void method827(byte b) {
		if (b == -37) {
			aSignLink10616 = null;
			aClass302_10618 = null;
			aNode_Sub35_10613 = null;
		}
	}
	
	private final Class243 method828(int i, int i_12_, GraphicsToolkit graphicstoolkit, boolean bool) {
		anInt10604++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(aShort10607 , i_12_ + 35);
		if (i_12_ != 20) {
			aShort10607 = (short) -113;
		}
		Plane plane;
		Plane plane_13_;
		if (!aBoolean10614) {
			plane = Node_Sub38_Sub37.aPlaneArray10466[aByte5931];
			if (aByte5931 >= 3) {
				plane_13_ = null;
			} else {
				plane_13_ = Node_Sub38_Sub37.aPlaneArray10466[1 + aByte5931];
			}
		} else {
			plane = Class368.aPlaneArray4548[aByte5931];
			plane_13_ = Node_Sub38_Sub37.aPlaneArray10466[0];
		}
		return objectdefinition.method3046(aByte10608, anInt5940, anInt5934, plane, bool, (byte) 0, anInt5937, 22, graphicstoolkit, null, i, plane_13_);
	}
	
	final boolean method813(int i) {
		anInt10602++;
		if (i != 0) {
			aByte10608 = (byte) 33;
		}
		if (aDrawableModel10610 != null) {
			return aDrawableModel10610.F();
		}
		return false;
	}
	
	final boolean method821(int i) {
		anInt10586++;
		if (i != 0) {
			method69(-43);
		}
		return aBoolean10588;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (aClass171_10615 == null) {
			aClass171_10615 = Class167.method1752(0, anInt5937, anInt5934, method831(102, graphicstoolkit, 0), anInt5940);
		}
		anInt10592++;
		if (i >= -93) {
			aClass171_10615 = null;
		}
		return aClass171_10615;
	}
	
	public final int method68(int i) {
		if (i != 23796) {
			method816(90, false, null, -97, (byte) -34, 87, null);
		}
		anInt10611++;
		return aByte10608;
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		anInt10617++;
		if (i >= -42) {
			method72(-92);
		}
		r var_r;
		if (aR10594 != null || !aBoolean10595) {
			var_r = aR10594;
			aR10594 = null;
		} else {
			Class243 class243 = method828(262144, 20, graphicstoolkit, true);
			var_r = class243 != null ? class243.aR3072 : null;
		}
		if (var_r != null) {
			Node_Sub23.method2636(var_r, aByte5931, anInt5934, anInt5940, null);
		}
	}
	
	final void method811(int i) {
		aBoolean10588 = false;
		anInt10601++;
		if (i == 27811) {
			if (aDrawableModel10610 != null) {
				aDrawableModel10610.s(aDrawableModel10610.ua() & ~0x10000);
			}
		}
	}
	
	public final int method72(int i) {
		if (i != -32136) {
			aBoolean10595 = false;
		}
		anInt10603++;
		return aShort10607;
	}
	
	public final void method69(int i) {
		anInt10593++;
		if (aDrawableModel10610 != null) {
			aDrawableModel10610.method617();
		}
	}
	
	static final void method829(int i, int i_15_, int i_16_, int i_17_, d var_d, GraphicsToolkit graphicstoolkit, int i_18_) {
		anInt10597++;
		if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) > -101) {
			AnimableAnimator.method253(var_d, graphicstoolkit, false);
		}
		graphicstoolkit.KA(i_16_, i_17_, i_16_ - -i_18_, i_17_ + i_15_);
		if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) > -101) {
			int i_19_ = 20;
			int i_20_ = i_18_ / 2 + i_16_;
			graphicstoolkit.aa(i_16_, i_17_, i_18_, i_15_, -16777216, 0);
			int i_21_ = -18 + (i_17_ - (-(i_15_ / 2) + i_19_));
			graphicstoolkit.d(i_20_ - 152, i_21_, 304, 34, GLDrawableModel.aColorArray5590[Class178.anInt2118].getRGB(), 0);
			graphicstoolkit.aa(-150 + i_20_, i_21_ + 2, 3 * Node_Sub25_Sub1.anInt9947, 30, Class382.aColorArray5258[Class178.anInt2118].getRGB(), 0);
			Class262_Sub4.aClass52_7721.method537(-1, (byte) 113, i_20_, Class22.aClass22_381.method297(Class35.language), i_21_ + i_19_, Canvas.aColorArray73[Class178.anInt2118].getRGB());
		} else {
			int i_22_ = Class94.anInt1250 - (int) ((float) i_18_ / Class20.aFloat327);
			int i_23_ = Class327.anInt5360 + (int) ((float) i_15_ / Class20.aFloat327);
			int i_24_ = Class94.anInt1250 + (int) ((float) i_18_ / Class20.aFloat327);
			GameStub.anInt46 = (int) ((float) (i_18_ * 2) / Class20.aFloat327);
			Class313.anInt4011 = (int) ((float) (i_15_ * 2) / Class20.aFloat327);
			int i_25_ = Class327.anInt5360 + -(int) ((float) i_15_ / Class20.aFloat327);
			Class271.anInt3479 = -(int) ((float) i_15_ / Class20.aFloat327) + Class327.anInt5360;
			Class282.anInt3584 = Class94.anInt1250 - (int) ((float) i_18_ / Class20.aFloat327);
			Class20.method272(Class20.anInt354 + i_22_, i_23_ - -Class20.anInt343, i_24_ - -Class20.anInt354, i_25_ - -Class20.anInt343, i_16_, i_17_, i_18_ + i_16_, i_15_ + i_17_ + 1);
			Class20.method270(graphicstoolkit);
			Class312 class312 = Class20.method291(graphicstoolkit);
			if (i != -28557) {
				method829(-21, 13, -40, 31, null, null, 119);
			}
			Class199.method2009(i ^ 0x4b37, class312, 0, graphicstoolkit, 0);
			if (Class168.anInt2044 > 0) {
				Node_Sub15_Sub4.anInt9800--;
				if (Node_Sub15_Sub4.anInt9800 == 0) {
					Class168.anInt2044--;
					Node_Sub15_Sub4.anInt9800 = 20;
				}
			}
			if (Node_Sub15_Sub2.aBoolean9780) {
				int i_26_ = -5 + (i_18_ + i_16_);
				int i_27_ = i_17_ + (i_15_ + -8);
				StandardSprite.aClass52_8945.method543((byte) 123, i_26_, "Fps:" + Node_Sub9_Sub4.anInt9732, 16776960, -1, i_27_);
				i_27_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_28_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
				int i_29_ = 16776960;
				if (i_28_ > 65536) {
					i_29_ = 16711680;
				}
				StandardSprite.aClass52_8945.method543((byte) 108, i_26_, "Mem:" + i_28_ + "k", i_29_, -1, i_27_);
				i_27_ -= 15;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	static final boolean method830(Class<?> var_class, boolean bool, String string) {
		if (bool != true) {
			method827((byte) 100);
		}
		anInt10591++;
		Class<?> var_class_30_ = (Class<?>) Class71.aHashtable958.get(string);
		if (var_class_30_ != null) {
            return var_class_30_.getClassLoader() == var_class.getClassLoader();
        }
		File file = null;
		if (file == null) {
			file = (File) Class85.aHashtable1157.get(string);
		}
		if (file != null) {
			try {
				file = new File(file.getCanonicalPath());
				Class<?> var_class_31_ = Class.forName("java.lang.Runtime");
				Class<?> var_class_32_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_32_.getDeclaredMethod("setAccessible", Boolean.TYPE);
				Method method_33_ = var_class_31_.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				method.invoke(method_33_, Boolean.TRUE);
				method_33_.invoke(Runtime.getRuntime(), var_class, file.getPath());
				method.invoke(method_33_, Boolean.FALSE);
				Class71.aHashtable958.put(string, var_class);
				return true;
			} catch (NoSuchMethodException nosuchmethodexception) {
				nosuchmethodexception.printStackTrace();
				System.load(file.getPath());
				Class71.aHashtable958.put(string, aClass10619 == null ? aClass10619 = method832("Class304") : aClass10619);
				return true;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				/* empty */
			}
		}
		return false;
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i != -5) {
			aSignLink10616 = null;
		}
		anInt10599++;
	}
	
	public final int method71(int i) {
		anInt10609++;
		return 22;
	}
	
	public final boolean method73(int i) {
		if (i != -19717) {
			return false;
		}
		anInt10590++;
		return aBoolean10595;
	}
	
	private final DrawableModel method831(int i, GraphicsToolkit graphicstoolkit, int i_35_) {
		anInt10589++;
		if (aDrawableModel10610 != null && graphicstoolkit.b(aDrawableModel10610.ua(), i_35_) == 0) {
			return aDrawableModel10610;
		}
		Class243 class243 = method828(i_35_, 20, graphicstoolkit, false);
		if (i <= 6) {
			return null;
		}
		if (class243 != null) {
			return class243.aDrawableModel3064;
		}
		return null;
	}
	
	final int method823(byte b) {
		anInt10612++;
		if (b != -21) {
			return -86;
		}
		if (aDrawableModel10610 != null) {
			return aDrawableModel10610.ma();
		}
		return 0;
	}
	
	/*synthetic*/ static Class<?> method832(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
