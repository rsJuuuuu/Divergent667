/* CacheNode_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub11 extends CacheNode
{
	protected int anInt9531 = 0;
	static int anInt9532;
	static int anInt9533;
	static int anInt9534;
	protected int anInt9535;
	static int anInt9536;
	protected String aString9537;
	static Class329 aClass329_9538 = new Class329("WTI", "office", "_wti", 5);
	static int anInt9539;
	protected int anInt9540 = 12800;
	protected int anInt9541 = 12800;
	protected int anInt9542;
	protected String aString9543;
	protected boolean aBoolean9544 = true;
	protected int anInt9545 = 0;
	protected int anInt9546;
	protected int anInt9547;
	static Class212 aClass212_9548 = new Class212("", 16);
	protected Class312 aClass312_9549;
	static byte[][][] aByteArrayArrayArray9550;
	static int anInt9551;
	
	final boolean method2334(int i, int i_0_, int i_1_, int[] is) {
		anInt9551++;
		if (i != 2048) {
			method2340(-86, (byte) -124, 70, null);
		}
		for (Node_Sub52 node_sub52 = (Node_Sub52) aClass312_9549.method3613(65280); node_sub52 != null; node_sub52 = (Node_Sub52) aClass312_9549.method3620(i ^ 0xfff700)) {
			if (node_sub52.method2977(i_0_, (byte) -20, i_1_)) {
				node_sub52.method2970(is, 2, i_0_, i_1_);
				return true;
			}
		}
		return false;
	}
	
	final boolean method2335(byte b, int i, int i_2_) {
		@SuppressWarnings("unused")
		int i_3_ = 93 / ((b - 39) / 44);
		anInt9539++;
		for (Node_Sub52 node_sub52 = (Node_Sub52) aClass312_9549.method3613(65280); node_sub52 != null; node_sub52 = (Node_Sub52) aClass312_9549.method3620(16776960)) {
			if (node_sub52.method2977(i, (byte) -76, i_2_)) {
				return true;
			}
		}
		return false;
	}
	
	static final boolean method2336(int i, int i_4_, int i_5_) {
		if (i != -1) {
			aByteArrayArrayArray9550 = null;
		}
		anInt9536++;
        return (0x800 & i_5_ ^ 0xffffffff) != -1;
    }
	
	final boolean method2337(int i, int[] is, int i_6_, int i_7_, int i_8_) {
		anInt9533++;
		if (i != -12584) {
			return true;
		}
		for (Node_Sub52 node_sub52 = (Node_Sub52) aClass312_9549.method3613(65280); node_sub52 != null; node_sub52 = (Node_Sub52) aClass312_9549.method3620(16776960)) {
			if (node_sub52.method2975(i_6_, (byte) 43, i_7_, i_8_)) {
				node_sub52.method2970(is, i ^ ~0x3125, i_8_, i_6_);
				return true;
			}
		}
		return false;
	}
	
	public static void method2338(byte b) {
		if (b < 48) {
			aByteArrayArrayArray9550 = null;
		}
		aClass212_9548 = null;
		aClass329_9538 = null;
		aByteArrayArrayArray9550 = null;
	}
	
	final void method2339(int i) {
		anInt9545 = 0;
		anInt9534++;
		anInt9541 = 12800;
		if (i == 16) {
			anInt9540 = 12800;
			anInt9531 = 0;
			for (Node_Sub52 node_sub52 = (Node_Sub52) aClass312_9549.method3613(65280); node_sub52 != null; node_sub52 = (Node_Sub52) aClass312_9549.method3620(16776960)) {
				if ((node_sub52.anInt7646 ^ 0xffffffff) > (anInt9540 ^ 0xffffffff)) {
					anInt9540 = node_sub52.anInt7646;
				}
				if ((anInt9531 ^ 0xffffffff) > (node_sub52.anInt7641 ^ 0xffffffff)) {
					anInt9531 = node_sub52.anInt7641;
				}
				if (anInt9545 < node_sub52.anInt7635) {
					anInt9545 = node_sub52.anInt7635;
				}
				if ((anInt9541 ^ 0xffffffff) < (node_sub52.anInt7636 ^ 0xffffffff)) {
					anInt9541 = node_sub52.anInt7636;
				}
			}
		}
	}
	
	final boolean method2340(int i, byte b, int i_9_, int[] is) {
		anInt9532++;
		for (Node_Sub52 node_sub52 = (Node_Sub52) aClass312_9549.method3613(65280); node_sub52 != null; node_sub52 = (Node_Sub52) aClass312_9549.method3620(16776960)) {
			if (node_sub52.method2973(i, i_9_, 10598)) {
				node_sub52.method2976(i_9_, is, i, 1);
				return true;
			}
		}
		if (b != 17) {
			aByteArrayArrayArray9550 = null;
		}
		return false;
	}
	
	CacheNode_Sub11(int i, String string, String string_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_) {
		anInt9542 = -1;
		anInt9547 = -1;
		aString9537 = string;
		anInt9542 = i_12_;
		anInt9535 = i_11_;
		anInt9547 = i_13_;
		anInt9546 = i;
		aBoolean9544 = bool;
		aString9543 = string_10_;
		if (anInt9547 == 255) {
			anInt9547 = 0;
		}
		aClass312_9549 = new Class312();
	}
}
