/* Mobile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Mobile extends Animable
{
	static int anInt9117;
	static boolean aBoolean9118;
	protected short aShort9119;
	protected short aShort9120;
	protected boolean aBoolean9121;
	static int[][] anIntArrayArray9122 = new int[6][];
	static int anInt9123;
	protected short aShort9124;
	static int anInt9125;
	static int anInt9126;
	protected byte aByte9127;
	static BufferedStream aBuffer9128;
	static int anInt9129;
	protected short aShort9130;
	
	final int method819(Node_Sub29[] node_sub29s, int i) {
		anInt9123++;
		int i_0_ = 0;
		if (i != 1) {
			return -78;
		}
	while_182_:
		for (int i_1_ = aShort9119; aShort9130 >= i_1_; i_1_++) {
			for (int i_2_ = aShort9120; (i_2_ ^ 0xffffffff) >= (aShort9124 ^ 0xffffffff); i_2_++) {
				long l = Class91.aLongArrayArrayArray1228[plane][i_1_][i_2_];
				long l_3_ = 0L;
			while_181_:
				while (l_3_ <= 48L) {
					int i_4_ = (int) (0xffffL & l >>> (int) l_3_);
					if ((i_4_ ^ 0xffffffff) >= -1) {
						break;
					}
					Class326 class326 = Class143.aClass326Array1771[-1 + i_4_];
					for (int i_5_ = 0; i_0_ > i_5_; i_5_++) {
						if (node_sub29s[i_5_] == class326.aNode_Sub29_4100) {
							l_3_ += 16L;
							continue while_181_;
						}
					}
					node_sub29s[i_0_++] = class326.aNode_Sub29_4100;
					if (i_0_ == 4) {
						break while_182_;
					}
					l_3_ += 16L;
				}
			}
		}
		for (int i_6_ = i_0_; (i_6_ ^ 0xffffffff) > -5; i_6_++)
			node_sub29s[i_6_] = null;
		if ((aByte9127 ^ 0xffffffff) != -1) {
			int i_7_ = -Class216.anInt2551 + aShort9119;
			int i_8_ = -EntityNode_Sub7.anInt6013 + aShort9120;
			int i_9_;
			short s;
			int i_10_;
			short s_11_;
			if ((aByte9127 ^ 0xffffffff) != -2) {
				if (i_8_ > -i_7_) {
					i_10_ = aShort9119 - 1;
					s = aShort9119;
					i_9_ = -1 + aShort9120;
					s_11_ = aShort9120;
				} else {
					i_10_ = aShort9119 + 1;
					s = aShort9119;
					i_9_ = aShort9120 - -1;
					s_11_ = aShort9120;
				}
			} else if ((i_7_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)) {
				i_9_ = aShort9120 - -1;
				s = aShort9119;
				i_10_ = aShort9119 - 1;
				s_11_ = aShort9120;
			} else {
				i_9_ = -1 + aShort9120;
				s = aShort9119;
				s_11_ = aShort9120;
				i_10_ = aShort9119 - -1;
			}
			int i_12_ = 0;
		while_184_:
			for (/**/; (i_0_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
				long l = Class91.aLongArrayArrayArray1228[plane][s][i_9_];
				while (l != 0L) {
					Class326 class326 = Class143.aClass326Array1771[(int) (-1L + (0xffffL & l))];
					l >>>= 16;
					if (node_sub29s[i_12_] == class326.aNode_Sub29_4100) {
						continue while_184_;
					}
				}
				l = Class91.aLongArrayArrayArray1228[plane][i_10_][s_11_];
				while ((l ^ 0xffffffffffffffffL) != -1L) {
					Class326 class326 = Class143.aClass326Array1771[(int) ((l & 0xffffL) + -1L)];
					l >>>= 16;
					if (class326.aNode_Sub29_4100 == node_sub29s[i_12_]) {
						continue while_184_;
					}
				}
				for (int i_13_ = i_12_; -1 + i_0_ > i_13_; i_13_++)
					node_sub29s[i_13_] = node_sub29s[1 + i_13_];
				i_0_--;
			}
		}
		return i_0_;
	}
	
	final boolean method815(byte b, GraphicsToolkit graphicstoolkit) {
		if (b != 59) {
			method815((byte) -4, null);
		}
		anInt9129++;
		return Node_Sub3.method2171(aShort9120, aShort9130, (byte) -127, this.method809(graphicstoolkit, -115), aShort9124, aShort9119, aByte5931);
	}
	
	final boolean method806(int i) {
		anInt9126++;
		if (i != 0) {
			method844(null, (byte) -66);
		}
		for (int i_14_ = aShort9119; (aShort9130 ^ 0xffffffff) <= (i_14_ ^ 0xffffffff); i_14_++) {
			for (int i_15_ = aShort9120; i_15_ <= aShort9124; i_15_++) {
				int i_16_ = Node_Sub9_Sub1.anInt9656 + i_14_ + -Class216.anInt2551;
				if ((i_16_ ^ 0xffffffff) <= -1 && (i_16_ ^ 0xffffffff) > (Class139.aBooleanArrayArray1730.length ^ 0xffffffff)) {
					int i_17_ = Node_Sub9_Sub1.anInt9656 + -EntityNode_Sub7.anInt6013 + i_15_;
					if ((i_17_ ^ 0xffffffff) <= -1 && (i_17_ ^ 0xffffffff) > (Class139.aBooleanArrayArray1730.length ^ 0xffffffff) && Class139.aBooleanArrayArray1730[i_16_][i_17_]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static final String method844(CacheNode_Sub13 cachenode_sub13, byte b) {
		if (b < 125) {
			method844(null, (byte) 118);
		}
		anInt9117++;
		if (cachenode_sub13.aString9565 != null && (cachenode_sub13.aString9565.length() ^ 0xffffffff) != -1) {
			if (cachenode_sub13.aString9558 != null && (cachenode_sub13.aString9558.length() ^ 0xffffffff) < -1) {
				return cachenode_sub13.aString9560 + Class22.aClass22_395.method297(Class35.language) + cachenode_sub13.aString9558 + Class22.aClass22_395.method297(Class35.language) + cachenode_sub13.aString9565;
			}
			return cachenode_sub13.aString9560 + Class22.aClass22_395.method297(Class35.language) + cachenode_sub13.aString9565;
		}
		if (cachenode_sub13.aString9558 != null && cachenode_sub13.aString9558.length() > 0) {
			return cachenode_sub13.aString9560 + Class22.aClass22_395.method297(Class35.language) + cachenode_sub13.aString9558;
		}
		return cachenode_sub13.aString9560;
	}
	
	void method845(int i) {
		anInt9125++;
		@SuppressWarnings("unused")
		int i_18_ = -111 % ((i - -48) / 43);
	}
	
	public static void method846(boolean bool) {
		if (bool == false) {
			aBuffer9128 = null;
			anIntArrayArray9122 = null;
		}
	}
	
	Mobile(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, byte b) {
		aShort9120 = (short) i_25_;
		anInt5937 = i_21_;
		plane = (byte) i;
		aShort9124 = (short) i_26_;
		aByte5931 = (byte) i_19_;
		anInt5940 = i_22_;
		anInt5934 = i_20_;
		aBoolean9121 = bool;
		aByte9127 = b;
		aShort9130 = (short) i_24_;
		aShort9119 = (short) i_23_;
	}
	
	static {
		aBoolean9118 = false;
	}
}
