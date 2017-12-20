/* Class262_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub20 extends Class262
{
	static int anInt7858;
	static int anInt7859;
	private int anInt7860;
	static int anInt7861 = 0;
	
	static final Mobile method3203(int i, int i_0_, int i_1_, Class<?> var_class) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_];
		if (class261 == null) {
			return null;
		}
		for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
			Mobile mobile = class256.aMobile3239;
			if (var_class.isAssignableFrom(mobile.getClass()) && mobile.aShort9119 == i_0_ && mobile.aShort9120 == i_1_) {
				return mobile;
			}
		}
		return null;
	}
	
	final void method3148(int i) {
		anInt7858++;
		if (i > -102) {
			method3203(-48, -113, -37, null);
		}
		Class121.aClass206Array1529[anInt7860].method2035((byte) -89);
	}
	
	Class262_Sub20(BufferedStream buffer) {
		super(buffer);
		anInt7860 = buffer.readUnsignedShort();
	}
	
	static final void method3204(byte b, int i, int i_2_, int i_3_) {
		if (b > -117) {
			anInt7861 = -28;
		}
		anInt7859++;
		if ((i_3_ ^ 0xffffffff) != -1004) {
			if (i_3_ == 1001) {
				ClientScriptsExecutor.method3565(Class230_Sub1.aClass212_9010, i_2_, i);
			} else if ((i_3_ ^ 0xffffffff) == -1007) {
				ClientScriptsExecutor.method3565(GLDrawableModel.aClass212_5708, i_2_, i);
			} else if (i_3_ == 1009) {
				ClientScriptsExecutor.method3565(Node_Sub40.aClass212_7512, i_2_, i);
			} else if ((i_3_ ^ 0xffffffff) == -1005) {
				ClientScriptsExecutor.method3565(Class21.aClass212_356, i_2_, i);
			}
		} else {
			ClientScriptsExecutor.method3565(ProducingGraphicsBuffer.aClass212_9894, i_2_, i);
		}
	}
}
