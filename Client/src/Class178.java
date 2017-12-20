/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class178
{
	static int anInt2118;
	static int anInt2119;
	static int LOCAL_PLAYERS_INDEXES_COUNT = 0;
	static int anInt2121;
	static int anInt2122;
	
	static final void method1811(int i, byte[][] bs, Class277_Sub1 class277_sub1) {
		anInt2121++;
		int i_0_ = Class188_Sub1_Sub1.aByteArrayArray9334.length;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			byte[] bs_2_ = bs[i_1_];
			if (bs_2_ != null) {
				int i_3_ = 64 * (Class262_Sub1.MAP_REGION_HASHES[i_1_] >> 8) + -Node_Sub53.gameSceneBaseX;
				int i_4_ = (0xff & Class262_Sub1.MAP_REGION_HASHES[i_1_]) * 64 - Class320_Sub4.gameSceneBaseY;
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				class277_sub1.method3350(i_3_, i_4_, -94, Class304.SCENE_CLIP_DATA_PLANES, Class93.aGraphicsToolkit1241, bs_2_);
			}
		}
		if (i != 31269) {
			anInt2118 = 93;
		}
	}
	
	static final int method1812(int i) {
		anInt2122++;
		if (Class213.aBoolean2510) {
			return 6;
		}
		if (i != 5) {
			LOCAL_PLAYERS_INDEXES_COUNT = -106;
		}
		if (Node_Sub38_Sub23.aCacheNode_Sub13_10343 == null) {
			return 0;
		}
		int i_5_ = Node_Sub38_Sub23.aCacheNode_Sub13_10343.anInt9562;
		if (Class251.method3101(i_5_, (byte) -62)) {
			return 1;
		}
		if (Class134.method1574(false, i_5_)) {
			return 2;
		}
		if (Class194_Sub3.method1973(i_5_, 31922)) {
			return 3;
		}
		if (OutcommingPacket.method3666(i_5_, (byte) 112)) {
			return 4;
		}
		if (Class262_Sub2.method3155(i_5_, (byte) -18)) {
			return 7;
		}
		if (i_5_ == 4) {
			return 8;
		}
		return 5;
	}
	
	static {
		anInt2118 = 0;
	}
}
