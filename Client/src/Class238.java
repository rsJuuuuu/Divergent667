/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class238
{
	static int anInt2910;
	static int anInt2911;
	static GLSprite[] aGLSpriteArray2912;
	static IncommingPacket aClass192_2913 = new IncommingPacket(20, -1);
	static int anInt2914;
	static int anInt2915;
	static int anInt2916;
	
	public static void method3018(byte b) {
		aGLSpriteArray2912 = null;
		if (b >= 40) {
			aClass192_2913 = null;
		}
	}
	
	static final void method3019(int i, int i_0_, int[] is, Object[] objects, boolean bool) {
		anInt2914++;
		if ((i_0_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
			int i_1_ = (i_0_ + i) / 2;
			int i_2_ = i_0_;
			int i_3_ = is[i_1_];
			is[i_1_] = is[i];
			is[i] = i_3_;
			Object object = objects[i_1_];
			objects[i_1_] = objects[i];
			objects[i] = object;
			int i_4_ = (i_3_ ^ 0xffffffff) != -2147483648 ? 1 : 0;
			for (int i_5_ = i_0_; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				if (i_3_ + (i_5_ & i_4_) > is[i_5_]) {
					int i_6_ = is[i_5_];
					is[i_5_] = is[i_2_];
					is[i_2_] = i_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_2_];
					objects[i_2_++] = object_7_;
				}
			}
			is[i] = is[i_2_];
			is[i_2_] = i_3_;
			objects[i] = objects[i_2_];
			objects[i_2_] = object;
			method3019(-1 + i_2_, i_0_, is, objects, false);
			method3019(i, i_2_ - -1, is, objects, false);
		}
		if (bool != false) {
			method3018((byte) 60);
		}
	}
	
	static final void method3020(int i, Actor actor) {
		anInt2910++;
		int i_8_ = -Class174.clientCycle + actor.toFirstTileTicketDelay;
		int i_9_ = actor.toFirstTileX * 512 + 256 * actor.getSize((byte) 99);
		int i_10_ = actor.toFirstTileY * 512 - -(actor.getSize((byte) 58) * 256);
		actor.anInt5940 += (-actor.anInt5940 + i_10_) / i_8_;
		actor.anInt5934 += (-actor.anInt5934 + i_9_) / i_8_;
		actor.anInt10901 = i;
		if ((actor.forceMovementDirection ^ 0xffffffff) == -1) {
			actor.method856((byte) -115, 8192);
		}
		if (actor.forceMovementDirection == 1) {
			actor.method856((byte) -112, 12288);
		}
		if ((actor.forceMovementDirection ^ 0xffffffff) == -3) {
			actor.method856((byte) 23, 0);
		}
		if (actor.forceMovementDirection == 3) {
			actor.method856((byte) -74, 4096);
		}
	}
	
	static final boolean method3021(int i, int i_11_, int i_12_) {
		anInt2916++;
		if ((i_11_ ^ 0xffffffff) > -1 || i < 0 || i_11_ >= CacheNode_Sub11.aByteArrayArrayArray9550[1].length || (i ^ 0xffffffff) <= (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_11_].length ^ 0xffffffff)) {
			return false;
		}
		@SuppressWarnings("unused")
		int i_13_ = 90 % ((i_12_ - 38) / 41);
        return (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_11_][i] & 0x2 ^ 0xffffffff) != -1;
    }
}
