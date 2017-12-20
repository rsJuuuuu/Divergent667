/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class219
{
	static int anInt2623;
	static int anInt2624;
	static int[] anIntArray2625 = { 1, -1, -1, 1 };
	static int anInt2626;
	static int anInt2627;
	static int anInt2628;
	
	static final boolean method2094(int i, int i_0_, int i_1_) {
		anInt2628++;
		if (i_1_ >= 0) {
			return false;
		}
		return false;
	}
	
	static final void method2095(byte b) {
		@SuppressWarnings("unused")
		int i = -107 % ((b - 50) / 57);
		anInt2626++;
		Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613(65280);
		boolean bool = Class58.aWidget861 != null || (Class290_Sub6.anInt8116 ^ 0xffffffff) < -1;
		int i_2_ = node_sub5.method2270(2);
		int i_3_ = node_sub5.method2272(5);
		if (bool) {
			Class283.anInt3591 = 1;
		}
		if (bool) {
			Class194_Sub1.aCacheNode_Sub13_6893 = Node_Sub38_Sub23.aCacheNode_Sub13_10343;
		} else {
			Class134_Sub1.method1580(i_3_, 1, Node_Sub38_Sub23.aCacheNode_Sub13_10343, i_2_);
		}
	}
	
	public static void method2096(boolean bool) {
		anIntArray2625 = null;
		if (bool != true) {
			method2095((byte) -80);
		}
	}
}
