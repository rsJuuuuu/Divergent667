/* r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class r extends CacheNode
{
	static Class58 aClass58_9578;
	static int anInt9579;
	static int[] anIntArray9580 = { 7, 8, 9, 10, 11, 12, 13, 15 };
	static int anInt9581;
	static int anInt9582;
	static int anInt9583;
	static int anInt9584;
	
	static final boolean method2357(byte b, char c) {
		anInt9581++;
		if (b != -117) {
			anIntArray9580 = null;
		}
		if (Character.isISOControl(c)) {
			return false;
		}
		if (Class316.method3662(false, c)) {
			return true;
		}
		char[] cs = Class175.aCharArray2098;
		for (int i = 0; (i ^ 0xffffffff) > (cs.length ^ 0xffffffff); i++) {
			int i_0_ = cs[i];
			if (i_0_ == c) {
				return true;
			}
		}
		char[] cs_1_ = Node_Sub28.aCharArray7331;
		for (int i = 0; i < cs_1_.length; i++) {
			int i_2_ = cs_1_[i];
			if ((c ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
				return true;
			}
		}
		return false;
	}
	
	static final void method2358(int i, byte b, int i_3_) {
		anInt9582++;
		if (b == -106) {
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(b ^ ~0x6a, 1, (long) i_3_);
			cachenode_sub2.method2288(0);
			cachenode_sub2.anInt9434 = i;
		}
	}
	
	static final int method2359(String string, byte b, int i, String string_4_) {
		anInt9583++;
		int i_5_ = string_4_.length();
		int i_6_ = string.length();
		int i_7_ = 0;
		int i_8_ = 0;
		if (b != -4) {
			anIntArray9580 = null;
		}
		char c = '\0';
		char c_9_ = '\0';
	while_224_:
		do {
			char c_10_;
			char c_11_;
			for (;;) {
				if (-c + i_7_ >= i_5_ && i_6_ <= -c_9_ + i_8_) {
					break while_224_;
				}
				if (i_7_ - c >= i_5_) {
					return -1;
				}
				if (i_6_ <= i_8_ + -c_9_) {
					return 1;
				}
				if ((c ^ 0xffffffff) != -1) {
					c_10_ = c;
				} else {
					c_10_ = string_4_.charAt(i_7_++);
				}
				if ((c_9_ ^ 0xffffffff) != -1) {
					c_11_ = c_9_;
				} else {
					c_11_ = string.charAt(i_8_++);
				}
				c = GLPlane.method3264(c_10_, true);
				c_9_ = GLPlane.method3264(c_11_, true);
				c_10_ = Class169.method1755(6272, i, c_10_);
				c_11_ = Class169.method1755(b + 6276, i, c_11_);
				if ((c_10_ ^ 0xffffffff) != (c_11_ ^ 0xffffffff) && (Character.toUpperCase(c_10_) ^ 0xffffffff) != (Character.toUpperCase(c_11_) ^ 0xffffffff)) {
					c_10_ = Character.toLowerCase(c_10_);
					c_11_ = Character.toLowerCase(c_11_);
					if ((c_11_ ^ 0xffffffff) != (c_10_ ^ 0xffffffff)) {
						break;
					}
				}
			}
			return Class320_Sub22.method3766((byte) 119, i, c_10_) + -Class320_Sub22.method3766((byte) 101, i, c_11_);
		} while (false);
		int i_12_ = Math.min(i_5_, i_6_);
		for (int i_13_ = 0; (i_12_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
			if ((i ^ 0xffffffff) != -3) {
				i_7_ = i_8_ = i_13_;
			} else {
				i_7_ = -1 + (i_5_ + -i_13_);
				i_8_ = -1 + (i_6_ + -i_13_);
			}
			char c_14_ = string_4_.charAt(i_7_);
			char c_15_ = string.charAt(i_8_);
			if ((c_14_ ^ 0xffffffff) != (c_15_ ^ 0xffffffff) && (Character.toUpperCase(c_14_) ^ 0xffffffff) != (Character.toUpperCase(c_15_) ^ 0xffffffff)) {
				c_14_ = Character.toLowerCase(c_14_);
				c_15_ = Character.toLowerCase(c_15_);
				if ((c_14_ ^ 0xffffffff) != (c_15_ ^ 0xffffffff)) {
					return Class320_Sub22.method3766((byte) 106, i, c_14_) - Class320_Sub22.method3766((byte) 109, i, c_15_);
				}
			}
		}
		int i_16_ = -i_6_ + i_5_;
		if (i_16_ != 0) {
			return i_16_;
		}
		for (int i_17_ = 0; i_17_ < i_12_; i_17_++) {
			char c_18_ = string_4_.charAt(i_17_);
			char c_19_ = string.charAt(i_17_);
			if (c_18_ != c_19_) {
				return Class320_Sub22.method3766((byte) 103, i, c_18_) + -Class320_Sub22.method3766((byte) 105, i, c_19_);
			}
		}
		return 0;
	}
	
	public r() {
		/* empty */
	}
	
	static final void sendMessageOnTile(int junk, int plane, int delayCycles, String message, int i_22_, int height, int x, int y) {
		anInt9579++;
		TileMessage entitynode_sub2 = new TileMessage();
		entitynode_sub2.plane = plane;
		entitynode_sub2.y = y;
		if (junk != -22840) {
			method2359(null, (byte) 90, 114, null);
		}
		entitynode_sub2.anInt5951 = i_22_;
		entitynode_sub2.message = message;
		entitynode_sub2.x = x;
		entitynode_sub2.completeCycle = Class174.clientCycle + delayCycles;
		entitynode_sub2.height = height;
		Class226.aClass103_2684.method1110(false, entitynode_sub2);
	}
	
	static final boolean method2361(int i, int i_26_) {
		if (i_26_ < 1) {
			method2361(-95, -35);
		}
		anInt9584++;
        return !((i < 0 || (i ^ 0xffffffff) < -4) && (i ^ 0xffffffff) != -10);
    }
	
	public static void method2362(int i) {
		if (i != -10) {
			sendMessageOnTile(76, -49, -91, null, 88, 73, 82, 84);
		}
		aClass58_9578 = null;
		anIntArray9580 = null;
	}
}
