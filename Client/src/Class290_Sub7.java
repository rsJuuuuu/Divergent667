/* Class290_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290_Sub7 extends Class290
{
	private boolean aBoolean8126 = false;
	static int anInt8127;
	static int anInt8128;
	static int anInt8129;
	static int anInt8130;
	static int[] anIntArray8131;
	static int anInt8132;
	static int anInt8133;
	static Class71 aClass71_8134;
	static Class365 aClass365_8135;
	static int anInt8136;
	
	final void method3417(boolean bool, boolean bool_0_) {
		anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class116.aClass94_5075);
		anInt8130++;
		if (bool_0_ != false) {
			aClass365_8135 = null;
		}
	}
	
	final void method3411(int i) {
		if (aBoolean8126) {
			anAbstractToolkit3654.method1362(i ^ ~0x2124, 1);
			anAbstractToolkit3654.method1321((byte) 102, Class308.aClass139_3915);
			anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
			anAbstractToolkit3654.method1304(2, 0, InterfaceSettings.aClass135_7421);
			anAbstractToolkit3654.method1366((byte) 77, Class106.aClass135_1354, 0);
			anAbstractToolkit3654.method1255((byte) -12);
			anAbstractToolkit3654.method1312((byte) -21, null);
			anAbstractToolkit3654.method1362(255, 0);
			aBoolean8126 = false;
		} else {
			anAbstractToolkit3654.method1366((byte) 111, Class106.aClass135_1354, 0);
		}
		anInt8132++;
		anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
		if (i != -8668) {
			aClass71_8134 = null;
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		if (b != 92) {
			method3415(false, -104, -43);
		}
		anInt8127++;
		anAbstractToolkit3654.method1312((byte) -21, interface13);
		anAbstractToolkit3654.method1278((byte) -12, i);
	}
	
	Class290_Sub7(AbstractToolkit abstracttoolkit) {
		super(abstracttoolkit);
	}
	
	final boolean method3414(byte b) {
		anInt8129++;
        return b <= -45;
    }
	
	final void method3422(int i, boolean bool) {
		anInt8128++;
		Interface13_Impl2 interface13_impl2 = anAbstractToolkit3654.method1369(-101);
		if (interface13_impl2 != null && bool) {
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1312((byte) -21, interface13_impl2);
			anAbstractToolkit3654.method1321((byte) 102, Class168.aClass139_2042);
			anAbstractToolkit3654.method1362(255, 1);
			anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class385.aClass94_4911);
			anAbstractToolkit3654.method1349(Class200_Sub1.aClass135_5139, (byte) 19, true, false, 2);
			anAbstractToolkit3654.method1366((byte) 96, Class115.aClass135_1465, 0);
			Class336_Sub1 class336_sub1 = anAbstractToolkit3654.method1306(7);
			class336_sub1.method3879(anAbstractToolkit3654.method1292((byte) -82), (byte) 68);
			anAbstractToolkit3654.method1297(-21029, Class55.aClass346_829);
			anAbstractToolkit3654.method1362(255, 0);
			aBoolean8126 = true;
		} else {
			anAbstractToolkit3654.method1366((byte) -101, Class115.aClass135_1465, 0);
		}
		if (i > -84) {
			aClass71_8134 = null;
		}
	}
	
	public static void method3440(int i) {
		anIntArray8131 = null;
		if (i >= -117) {
			method3441(-117, null);
		}
		aClass71_8134 = null;
		aClass365_8135 = null;
	}
	
	static final boolean method3441(int i, String string) {
		anInt8136++;
		if (i != 2) {
			method3440(15);
		}
		return Class372.method4104(true, 0, string, 10);
	}
	
	static final Class256 method3442(int i, int i_1_, int i_2_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_1_][i_2_];
		if (class261 == null) {
			return null;
		}
		return class261.aClass256_3312;
	}
	
	final void method3415(boolean bool, int i, int i_3_) {
		if (bool != true) {
			aBoolean8126 = true;
		}
		anInt8133++;
	}
}
