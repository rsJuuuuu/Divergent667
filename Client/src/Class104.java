/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class104
{
	static int anInt1346;
	static int anInt1347;
	static int anInt1348;
	
	public final String toString() {
		anInt1346++;
		throw new IllegalStateException();
	}
	
	static final void method1114(long l, boolean bool, int i, int i_0_, int i_1_, int i_2_, Index class302) {
		anInt1348++;
		if (i <= 48) {
			method1114(82L, true, -98, -24, 56, -20, null);
		}
		Node_Sub28.method2701(i_1_, 0, class302, i_2_, bool, i_0_, l, (byte) -124);
	}
	
	static final Actor method1115(int i, int i_3_, int i_4_, int i_5_) {
		anInt1347++;
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i_4_][i][i_3_];
		if (class261 == null) {
			return null;
		}
		Actor actor = null;
		int i_6_ = -1;
		if (i_5_ != 252) {
			return null;
		}
		for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
			Mobile mobile = class256.aMobile3239;
			if (mobile instanceof Actor) {
				Actor actor_7_ = (Actor) mobile;
				int i_8_ = 252 + (-256 + actor_7_.getSize((byte) 76) * 256);
				int i_9_ = -i_8_ + actor_7_.anInt5934 >> 9;
				int i_10_ = actor_7_.anInt5940 - i_8_ >> 9;
				int i_11_ = actor_7_.anInt5934 - -i_8_ >> 9;
				int i_12_ = actor_7_.anInt5940 - -i_8_ >> 9;
				if ((i_9_ ^ 0xffffffff) >= (i ^ 0xffffffff) && (i_3_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) && i <= i_11_ && i_3_ <= i_12_) {
					int i_13_ = (i_11_ + 1 - i) * (i_12_ + (1 - i_3_));
					if (i_13_ > i_6_) {
						actor = actor_7_;
						i_6_ = i_13_;
					}
				}
			}
		}
		return actor;
	}
}
