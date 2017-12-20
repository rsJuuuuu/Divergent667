/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IncommingPacket
{
	static int anInt2354;
	protected int anInt2355;
	static int anInt2356;
	private int anInt2357;
	static int anInt2358;
	
	public static void method1952(int i) {
	}
	
	final int method1953(int i) {
		anInt2356++;
		if (i <= 17) {
			return 7;
		}
		return anInt2357;
	}
	
	public final String toString() {
		anInt2354++;
		throw new IllegalStateException();
	}
	
	IncommingPacket(int i, int i_0_) {
		anInt2357 = i;
		anInt2355 = i_0_;
	}
	
	static final void method1954(byte b) {
		anInt2358++;
		int i = 0;
		for (int i_2_ = 0; (Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff); i_3_++) {
				if (Node_Sub38_Sub19.method2849(-47, i_3_, Class175.aClass261ArrayArrayArray2099, i, i_2_, true)) {
					i++;
				}
				if (i >= 512) {
					return;
				}
			}
		}
	}
}
