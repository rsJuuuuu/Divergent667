/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127
{
	protected int[] anIntArray1635;
	protected int anInt1636;
	protected int anInt1637;
	static Class124 aClass124_1638 = new Class124(16);
	protected aa anAa1639;
	static int anInt1640;
	protected int[] anIntArray1641;
	static int[][] anIntArrayArray1642 = { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	static int anInt1643;
	static IncommingPacket aClass192_1644 = new IncommingPacket(115, 8);
	protected int anInt1645;
	static Index index22;
	
	static final void drawHintIcons(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1640++;
		if (i != 3) {
			method1541(103);
		}
		Class223[] class223s = Class320_Sub24.cachedHintIcons;
		for (int i_6_ = 0; (class223s.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
			Class223 class223 = class223s[i_6_];
			if (class223 != null && (class223.anInt2654 ^ 0xffffffff) == -3) {
				Animable_Sub1.method826(2 * class223.anInt2657, -1, class223.anInt2662, i_0_, i_2_ >> 1, i_1_, class223.anInt2653, class223.anInt2661, i_5_ >> 1);
				if ((Class119.anIntArray1516[0] ^ 0xffffffff) < 0 && Class174.clientCycle % 20 < 10) {
					GLSprite glsprite = Class19.aGLSpriteArray312[class223.anInt2659];
					int i_7_ = -12 + (i_4_ + Class119.anIntArray1516[0]);
					int i_8_ = Class119.anIntArray1516[1] + i_3_ - 28;
					glsprite.setPosition(i_7_, i_8_);
					Class362.method4053(i_8_, glsprite.method1186() + i_8_, i_7_, (byte) -118, glsprite.method1197() + i_7_);
				}
			}
		}
	}
	
	public static void method1541(int i) {
		anIntArrayArray1642 = null;
		aClass124_1638 = null;
		index22 = null;
		@SuppressWarnings("unused")
		int i_9_ = -40 % ((-62 - i) / 38);
		aClass192_1644 = null;
	}
	
	static final void method1542(int i, boolean bool) {
		anInt1643++;
		if (i != 11582) {
			method1541(34);
		}
		Class123[] class123s = Class218.aClass123Array2567;
		for (int i_10_ = 0; class123s.length > i_10_; i_10_++) {
			Class123 class123 = class123s[i_10_];
			class123.method1513(i ^ ~0x4331);
		}
		Class375.method4115((byte) -3);
		Node_Sub36_Sub2.method2761((byte) 125);
		Class320_Sub26.method3777();
		for (int i_11_ = 0; i_11_ < 4; i_11_++)
			Class304.SCENE_CLIP_DATA_PLANES[i_11_].method991(-89);
		Class262_Sub23.method3212(false, 1295);
		System.gc();
		Class166.method1746(2, -1);
		Class313.anInt4013 = -1;
		Class377_Sub1.aBoolean8775 = false;
		EntityNode_Sub7.method979(17285);
		PlayerUpdateReference.method3808(true, -1);
		Class160.method1730(i ^ 0x2d5f);
		Class169_Sub4.method1786(122);
		Node_Sub38_Sub9.method2820(true);
		if (!bool) {
			Class48.method478(3, (byte) 105);
			try {
				Class2.method167("loggedout", Class96.anApplet1270, (byte) -95);
			} catch (Throwable throwable) {
				/* empty */
			}
		} else {
			Class48.method478(13, (byte) 105);
		}
	}
	
	Class127(int i, int i_12_, int[] is, int[] is_13_, aa var_aa, int i_14_) {
		anAa1639 = var_aa;
		anIntArray1635 = is;
		anIntArray1641 = is_13_;
		anInt1637 = i_12_;
		anInt1645 = i_14_;
		anInt1636 = i;
	}
}
