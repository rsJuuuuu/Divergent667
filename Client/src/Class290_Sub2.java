/* Class290_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290_Sub2 extends Class290
{
	private float aFloat8065 = 0.0F;
	private Class5 aClass5_8066;
	static int anInt8067;
	static int anInt8068;
	static int anInt8069 = 0;
	static int anInt8070;
	static int anInt8071;
	static int anInt8072;
	static int anInt8073;
	static int anInt8074;
	static int anInt8075;
	
	final void method3415(boolean bool, int i, int i_0_) {
		anInt8072++;
		anAbstractToolkit3654.method1362(255, 1);
		if ((i & 0x80) == 0) {
			if ((i_0_ & 0x1) == 1) {
				if (!aClass5_8066.aBoolean128) {
					int i_1_ = anAbstractToolkit3654.anInt6332 % 4000 * 16 / 4000;
					anAbstractToolkit3654.method1312((byte) -21, aClass5_8066.anInterface13_Impl1Array131[i_1_]);
				} else {
					aFloat8065 = (float) (anAbstractToolkit3654.anInt6332 % 4000) / 4000.0F;
					anAbstractToolkit3654.method1312((byte) -21, aClass5_8066.anInterface13_Impl3_130);
				}
			} else if (aClass5_8066.aBoolean128) {
				anAbstractToolkit3654.method1312((byte) -21, aClass5_8066.anInterface13_Impl3_130);
			} else {
				anAbstractToolkit3654.method1312((byte) -21, aClass5_8066.anInterface13_Impl1Array131[0]);
			}
		} else {
			anAbstractToolkit3654.method1312((byte) -21, null);
		}
		anAbstractToolkit3654.method1362(255, 0);
		if (bool != true) {
			method3415(true, 103, -118);
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		anAbstractToolkit3654.method1312((byte) -21, interface13);
		if (b == 92) {
			anInt8071++;
		}
	}
	
	final void method3422(int i, boolean bool) {
		anInt8075++;
		anAbstractToolkit3654.method1362(255, 1);
		anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class236.aClass94_2898);
		anAbstractToolkit3654.method1349(Class106.aClass135_1354, (byte) 19, true, false, 0);
		anAbstractToolkit3654.method1366((byte) -119, Class200_Sub1.aClass135_5139, 0);
		anAbstractToolkit3654.method1279(0, (byte) -15);
		anAbstractToolkit3654.method1362(255, 0);
		anAbstractToolkit3654.method1336(-2, -16777216);
		if (i < -84) {
			anAbstractToolkit3654.method1366((byte) -97, InterfaceSettings.aClass135_7421, 0);
			method3421(false);
		}
	}
	
	final void method3411(int i) {
		anInt8074++;
		anAbstractToolkit3654.method1362(i ^ ~0x2124, 1);
		anAbstractToolkit3654.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
		anAbstractToolkit3654.method1304(0, i ^ i, Class106.aClass135_1354);
		anAbstractToolkit3654.method1366((byte) 93, Class106.aClass135_1354, 0);
		anAbstractToolkit3654.method1279(1, (byte) -15);
		anAbstractToolkit3654.method1312((byte) -21, null);
		anAbstractToolkit3654.method1362(i + 8923, 0);
		anAbstractToolkit3654.method1366((byte) 68, Class106.aClass135_1354, 0);
	}
	
	final void method3421(boolean bool) {
		if (anAbstractToolkit3654.method1250(0) == 0) {
			Class336_Sub1 class336_sub1 = anAbstractToolkit3654.method1290((byte) 86);
			anAbstractToolkit3654.method1362(255, 1);
			Class336_Sub1 class336_sub1_2_ = anAbstractToolkit3654.method1306(7);
			class336_sub1_2_.method3857(class336_sub1);
			class336_sub1_2_.method3889(0.125F, (byte) 116, 0.125F, 1.0F);
			class336_sub1_2_.method3875(aFloat8065, 0.0F, (byte) 103, 0.0F);
			anAbstractToolkit3654.method1297(-21029, Class55.aClass346_829);
			anAbstractToolkit3654.method1362(255, 0);
		}
		if (bool == false) {
			anInt8068++;
		}
	}
	
	final void method3417(boolean bool, boolean bool_3_) {
		if (bool_3_ != false) {
			method3415(true, -122, -128);
		}
		anInt8070++;
		anAbstractToolkit3654.method1318(-30, Class117_Sub1.aClass94_4924, Class116.aClass94_5075);
	}
	
	Class290_Sub2(AbstractToolkit abstracttoolkit, Class5 class5) {
		super(abstracttoolkit);
		aClass5_8066 = class5;
	}
	
	final boolean method3414(byte b) {
		if (b > -45) {
			aFloat8065 = -0.865858F;
		}
		anInt8067++;
		return aClass5_8066.method173(4);
	}
	
	static final void method3426(int i, byte b, int i_4_) {
		if (b < 101) {
			method3426(-128, (byte) 27, 66);
		}
		anInt8073++;
		Class343 class343 = CacheNode_Sub18.aClass343ArrayArray9608[i][i_4_];
		if (class343 != null) {
			Class181.anInt2145 = class343.anInt4249;
			Class173.anInt2089 = class343.anInt4248;
			Class134_Sub2.anInt9022 = class343.anInt4247;
		}
		Class313.method3648(-118);
	}
}
