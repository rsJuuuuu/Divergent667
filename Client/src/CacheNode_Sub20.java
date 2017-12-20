/* CacheNode_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class CacheNode_Sub20 extends CacheNode
{
	static int anInt9623;
	static int anInt9624;
	static int anInt9625;
	static long[] aLongArray9626 = new long[256];
	protected int anInt9627;
	static int[] anIntArray9628;
	
	static final void method2406(String string, int i) {
		anInt9624++;
		if (i < 46) {
			method2407(-64);
		}
		Class28.method331(string, "", 121, 0, "", "", 0);
	}
	
	static final void method2407(int i) {
		Node_Sub38_Sub23.anInt10347 = -1;
		Class159.loginType = i;
		anInt9625++;
		Class320_Sub23.aClass123_8432 = Class218.aClass123_2560;
		Class129.method1556(Class188_Sub1_Sub1.aString9327.equals(""), Class188_Sub1_Sub1.aString9327, true, true, "");
	}
	
	static final void method2408(int i, boolean bool) {
		anInt9623++;
		Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1518(3512, (long) i);
		if (node_sub3 != null) {
			node_sub3.aBoolean6946 = !node_sub3.aBoolean6946;
			node_sub3.aClass189_Sub1_6943.method1917(node_sub3.aBoolean6946, 1);
		}
		if (bool != true) {
			method2407(-73);
		}
	}
	
	abstract Object method2409(byte b);
	
	public static void method2410(boolean bool) {
		if (bool != true) {
			method2406(null, 50);
		}
		anIntArray9628 = null;
		aLongArray9626 = null;
	}
	
	abstract boolean method2411(int i);
	
	CacheNode_Sub20(int i) {
		anInt9627 = i;
	}
	
	static {
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -9; i_0_++) {
				if ((0x1L & l ^ 0xffffffffffffffffL) != -2L) {
					l >>>= 1;
				} else {
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				}
			}
			aLongArray9626[i] = l;
		}
	}
}
