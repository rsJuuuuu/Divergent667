/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282
{
	static int anInt3581;
	static int anInt3582;
	static Index aClass302_3583;
	static int anInt3584;
	static double aDouble3585;
	static int anInt3586;
	static int anInt3587;
	static byte[][] aByteArrayArray3588 = new byte[50][];
	
	static final void method3385(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_) {
		anInt3582++;
		if (!CacheNode_Sub15.method2379(7015, i)) {
			if ((i_4_ ^ 0xffffffff) == 0) {
				for (int i_7_ = 0; i_7_ < 100; i_7_++)
					Class195.aBooleanArray2387[i_7_] = true;
			} else {
				Class195.aBooleanArray2387[i_4_] = true;
			}
		} else {
			if (bool != true) {
				method3385(-73, 124, 90, 10, 48, 28, -80, false, -91);
			}
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			if (Class71.aBoolean967) {
				i_11_ = Class308.anInt3914;
				i_12_ = Node_Sub53.anInt7669;
				i_8_ = Node_Sub33.anInt7405;
				i_9_ = Class168.anInt2046;
				i_10_ = Class320_Sub28.anInt8469;
				Node_Sub53.anInt7669 = 1;
			}
			if (Class79.aWidgetArrayArray1082[i] == null) {
				Node_Sub6.method2416(-1, i_5_, Class134_Sub3.aWidgetArrayArray9035[i], i_0_, i_2_, i_6_, i_4_, i_4_ < 0, 90, i_1_, i_3_);
			} else {
				Node_Sub6.method2416(-1, i_5_, Class79.aWidgetArrayArray1082[i], i_0_, i_2_, i_6_, i_4_, (i_4_ ^ 0xffffffff) > -1, 27, i_1_, i_3_);
			}
			if (Class71.aBoolean967) {
				if (i_4_ >= 0 && Node_Sub53.anInt7669 == 2) {
					Class362.method4053(Class168.anInt2046, Class308.anInt3914, Node_Sub33.anInt7405, (byte) -115, Class320_Sub28.anInt8469);
				}
				Class168.anInt2046 = i_9_;
				Class308.anInt3914 = i_11_;
				Node_Sub33.anInt7405 = i_8_;
				Node_Sub53.anInt7669 = i_12_;
				Class320_Sub28.anInt8469 = i_10_;
			}
		}
	}
	
	static final void method3386(int i, byte b) {
		Class252.aClass61_3190.method598(i, -11819);
		anInt3581++;
		if (b != -44) {
			aDouble3585 = 0.19416843062396033;
		}
		Class166.aClass61_5097.method598(i, b + -11775);
		Class243.aClass61_3065.method598(i, -11819);
		NpcDefinition.aClass61_2805.method598(i, b + -11775);
	}
	
	static final void method3387(int i, int i_13_) {
		anInt3586++;
		Class157.anInt1972 = i_13_;
		synchronized (CacheNode_Sub3.aClass61_9446) {
			CacheNode_Sub3.aClass61_9446.method608(false);
		}
		if (i != -25116) {
			anInt3584 = 99;
		}
		synchronized (Node_Sub36_Sub4.aClass61_10065) {
			Node_Sub36_Sub4.aClass61_10065.method608(false);
		}
	}
	
	public static void method3388(int i) {
		aClass302_3583 = null;
		if (i == 1) {
			aByteArrayArray3588 = null;
		}
	}
}
