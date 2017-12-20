/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class243
{
	protected DrawableModel aDrawableModel3064;
	static Class61 aClass61_3065 = new Class61(8);
	static int anInt3066;
	static int anInt3067;
	static int anInt3068;
	static Class340 aClass340_3069;
	static int anInt3070;
	static int anInt3071;
	protected r aR3072;
	static int anInt3073;
	static int[] anIntArray3074;
	static boolean aBoolean3075;
	static String username = "";
	
	public static void method3058(int i) {
		anIntArray3074 = null;
		username = null;
		if (i != -29825) {
			method3061(12);
		}
		aClass61_3065 = null;
		aClass340_3069 = null;
	}
	
	static final void method3059(int i, byte b, int i_0_, IComponentDefinitions widget) {
		Node_Sub14.anInt7119 = i;
		if (b != 29) {
			method3063(-33, null);
		}
		anInt3070++;
		Node_Sub6.aWidget7047 = widget;
		Class385.anInt4913 = i_0_;
	}
	
	static final void method3060(byte b, boolean bool, boolean bool_1_, Node_Sub2 node_sub2) {
		anInt3073++;
		int i = node_sub2.interfaceId;
		int i_2_ = (int) node_sub2.aLong2797;
		node_sub2.method2160((byte) 55);
		if (bool_1_) {
			Node_Sub15_Sub6.method2571(i, false);
		}
		Class150_Sub3_Sub1.method1665((byte) -102, i);
		IComponentDefinitions widget = Class76.method771((byte) 107, i_2_);
		if (widget != null) {
			ClientScript.method2321(-1, widget);
		}
		Node_Sub8.method2423((byte) -42);
		if (!bool && (Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0) {
			Class76.method770(121, 1, Class320_Sub15.WINDOWS_PANE_ID);
		}
		Class303 class303 = new Class303(Class289.aHashTable3630);
		for (Node_Sub2 node_sub2_3_ = (Node_Sub2) class303.method3542(true); node_sub2_3_ != null; node_sub2_3_ = (Node_Sub2) class303.method3539(0)) {
			if (!node_sub2_3_.method2161(-127)) {
				node_sub2_3_ = (Node_Sub2) class303.method3542(true);
				if (node_sub2_3_ == null) {
					break;
				}
			}
			if ((node_sub2_3_.cliped ^ 0xffffffff) == -4) {
				int i_4_ = (int) node_sub2_3_.aLong2797;
				if ((i ^ 0xffffffff) == (i_4_ >>> 16 ^ 0xffffffff)) {
					method3060((byte) 95, bool, true, node_sub2_3_);
				}
			}
		}
		@SuppressWarnings("unused")
		int i_5_ = 30 % ((b - 20) / 32);
	}
	
	static final void method3061(int i) {
		if (Class151.anInt1843 != 3) {
			if (Class151.anInt1843 == 7) {
				Class48.method478(8, (byte) 108);
			} else if ((Class151.anInt1843 ^ 0xffffffff) != -10) {
				if (Class151.anInt1843 == 11) {
					Class48.method478(12, (byte) 104);
				}
			} else {
				Class48.method478(10, (byte) 109);
			}
		} else {
			Class48.method478(4, (byte) 112);
		}
		anInt3068++;
		if (i != 7) {
			method3059(-103, (byte) 35, -51, null);
		}
	}
	
	static final boolean method3062(int i, byte b) {
		anInt3066++;
		if (b < 44) {
			return true;
		}
        return !(i < 4 || (i ^ 0xffffffff) < -9);
    }
	
	static final boolean method3063(int i, Interface19 interface19) {
		if (i < 108) {
			anIntArray3074 = null;
		}
		anInt3067++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), 49);
		if ((objectdefinition.anInt3006 ^ 0xffffffff) == 0) {
			return true;
		}
		Class140 class140 = Node_Sub54.aClass338_7671.method3909(objectdefinition.anInt3006, 34);
		if (class140.anInt1740 == -1) {
			return true;
		}
		return class140.method1607((byte) 114);
	}
	
	static {
		aBoolean3075 = false;
	}
}
