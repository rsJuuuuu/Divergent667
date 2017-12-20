/* Class377_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class377_Sub1 extends Class377
{
	static int anInt8770;
	static int anInt8771;
	static int anInt8772;
	protected String aString8773;
	static int GAME_SCENE_HEIGHT;
	static boolean aBoolean8775 = false;
	static int[] anIntArray8776;
	protected int anInt8777;
	static boolean showFaceHere;
	protected int anInt8779 = -1;
	protected String aString8780;
	static int anInt8781;
	static Node_Sub29[] aNode_Sub29Array8782;
	
	static final boolean method4128(int i) {
		anInt8781++;
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = Class71.aHashtable958.keys();
		while (enumeration.hasMoreElements()) {
			Object object = enumeration.nextElement();
			hashtable.put(object, Class71.aHashtable958.get(object));
		}
		try {
			if (i != 0) {
				showFaceHere = true;
			}
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_0_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_0_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", Boolean.TYPE);
			method.invoke(field, Boolean.TRUE);
			try {
				enumeration = Class71.aHashtable958.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) Class85.aHashtable1157.get(string);
						Class var_class_1_ = (Class) Class71.aHashtable958.get(string);
						Vector vector = (Vector) field.get(var_class_1_.getClassLoader());
						for (int i_2_ = 0; vector.size() > i_2_; i_2_++) {
							try {
								Object object = vector.elementAt(i_2_);
								Field field_3_ = object.getClass().getDeclaredField("name");
								method.invoke(field_3_, Boolean.TRUE);
								try {
									String string_4_ = (String) field_3_.get(object);
									if (string_4_ != null && string_4_.equalsIgnoreCase(file.getCanonicalPath())) {
										Field field_5_ = object.getClass().getDeclaredField("handle");
										Method method_6_ = object.getClass().getDeclaredMethod("finalize");
										method.invoke(field_5_, Boolean.TRUE);
										method.invoke(method_6_, Boolean.TRUE);
										try {
											method_6_.invoke(object);
											field_5_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_6_, Boolean.FALSE);
										method.invoke(field_5_, Boolean.FALSE);
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_3_, Boolean.FALSE);
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, Boolean.FALSE);
		} catch (Throwable throwable) {
			/* empty */
		}
		Class71.aHashtable958 = hashtable;
		return Class71.aHashtable958.isEmpty();
	}
	
	static final boolean method4129(byte b, int i) {
		anInt8770++;
		if (b != 83) {
			return false;
		}
        return !((i ^ 0xffffffff) == -2 || i == 7);
    }
	
	static final void method4130(boolean bool, int i) {
		anInt8771++;
		int i_7_ = GameStub.anInt49;
		int i_8_ = Class22.anInt430;
		if (bool && Node_Sub15_Sub10.aBoolean9850) {
			i_7_ <<= 1;
			i_8_ = -i_7_;
		}
		if (i == -10385) {
			Class93.aGraphicsToolkit1241.f(i_8_, i_7_);
		}
	}
	
	final Class46 method4131(byte b) {
		anInt8772++;
		if (b != -97) {
			aNode_Sub29Array8782 = null;
		}
		return Class320_Sub22.aClass46Array8418[anInt4674];
	}
	
	public static void method4132(int i) {
		anIntArray8776 = null;
		aNode_Sub29Array8782 = null;
		if (i != 104) {
			GAME_SCENE_HEIGHT = -1;
		}
	}
	
	Class377_Sub1() {
		/* empty */
	}
	
	static {
		GAME_SCENE_HEIGHT = 104;
		aNode_Sub29Array8782 = new Node_Sub29[8];
	}
}
