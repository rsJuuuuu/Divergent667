/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;

public class Class199
{
	private int[] anIntArray2430;
	static int anInt2431;
	static int anInt2432;
	static int anInt2433;
	static int anInt2434;
	private int[] anIntArray2435;
	static int anInt2436;
	/*synthetic*/ static Class<?> aClass2437;
	/*synthetic*/ static Class<?> aClass2438;
	
	static final int method2006(byte b) {
		anInt2431++;
		int i = 0;
		@SuppressWarnings("unused")
		int i_0_ = -67 / ((-81 - b) / 32);
		Field[] fields = (aClass2437 == null ? aClass2437 = method2011("Node_Sub27") : aClass2437).getDeclaredFields();
		Field[] fields_1_ = fields;
		for (int i_2_ = 0; fields_1_.length > i_2_; i_2_++) {
			Field field = fields_1_[i_2_];
			if ((aClass2438 == null ? aClass2438 = method2011("Class320") : aClass2438).isAssignableFrom(field.getType())) {
				i++;
			}
		}
		return i - -1;
	}
	
	static final void method2007(int i, byte[] bs, int i_3_, int i_4_, int i_5_, byte b) {
		anInt2434++;
		if ((i ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
			i_3_ += i;
			i_4_ = -i + i_5_ >> 2;
			if (b > 92) {
				while ((--i_4_ ^ 0xffffffff) <= -1) {
					bs[i_3_++] = (byte) 1;
					bs[i_3_++] = (byte) 1;
					bs[i_3_++] = (byte) 1;
					bs[i_3_++] = (byte) 1;
				}
				i_4_ = -i + i_5_ & 0x3;
				while ((--i_4_ ^ 0xffffffff) <= -1)
					bs[i_3_++] = (byte) 1;
			}
		}
	}
	
	final void method2008(Class206 class206, int i, int i_6_) {
		anInt2432++;
		int i_7_ = anIntArray2430[0];
		class206.method2034(i_7_ >>> 16, (byte) -42, i_6_, i_7_ & 0xffff);
		Actor actor = class206.method2037(-76);
		if (i != 8980) {
			anIntArray2430 = null;
		}
		actor.anInt10904 = 0;
		for (int i_8_ = -1 + anIntArray2435.length; i_8_ >= 0; i_8_--) {
			int i_9_ = anIntArray2435[i_8_];
			int i_10_ = anIntArray2430[i_8_];
			actor.scenePositionXQueue[actor.anInt10904] = i_10_ >> 16;
			actor.scenePositionYQueue[actor.anInt10904] = Node_Sub30.method2723(65535, i_10_);
			byte b = 1;
			if (i_9_ != 0) {
				if ((i_9_ ^ 0xffffffff) == -3) {
					b = (byte) 2;
				}
			} else {
				b = (byte) 0;
			}
			actor.movementTypeQueue[actor.anInt10904] = b;
			actor.anInt10904++;
		}
	}
	
	static final void method2009(int i, Class312 class312, int i_11_, GraphicsToolkit graphicstoolkit, int i_12_) {
		if (i != -9404) {
			method2006((byte) -16);
		}
		Node_Sub43.aClass312_7541.method3614(i + 8803);
		anInt2436++;
		if (!ClientScript.aBoolean9510) {
			for (Node_Sub14 node_sub14 = (Node_Sub14) class312.method3613(65280); node_sub14 != null; node_sub14 = (Node_Sub14) class312.method3620(16776960)) {
				Class79 class79 = Class20.aClass215_322.method2069((byte) 122, node_sub14.anInt7128);
				if (Class220.method2099(true, class79)) {
					boolean bool = Class339_Sub4.method3933(graphicstoolkit, i_12_, class79, -118, node_sub14, i_11_);
					if (bool) {
						Class277_Sub1.method3360((byte) 43, node_sub14, graphicstoolkit, class79);
					}
				}
			}
		}
	}
	
	static final void method2010(byte b) {
		if (b > 117) {
			Class23.anInt434 = 0;
			anInt2433++;
			Node_Sub38_Sub19.aClass78Array10284 = new Class78[50];
		}
	}
	
	Class199(BufferedStream buffer) {
		int i = buffer.readSmart();
		anIntArray2430 = new int[i];
		anIntArray2435 = new int[i];
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			int i_14_ = buffer.readUnsignedByte();
			anIntArray2435[i_13_] = i_14_;
			int i_15_ = buffer.readUnsignedShort();
			int i_16_ = buffer.readUnsignedShort();
			anIntArray2430[i_13_] = i_16_ + (i_15_ << 16);
		}
	}
	
	/*synthetic*/ static Class<?> method2011(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
