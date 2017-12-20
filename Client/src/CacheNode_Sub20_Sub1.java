/* CacheNode_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub20_Sub1 extends CacheNode_Sub20
{
	static int anInt11088;
	static int myPlayerPlane;
	static int anInt11090;
	static int anInt11091;
	private Object anObject11092;
	static int anInt11093;
	
	static final float method2412(byte b, float f, float f_0_, int i, float f_1_, float f_2_, float f_3_, float f_4_) {
		anInt11090++;
		float f_5_ = 0.0F;
		float f_6_ = -f + f_4_;
		float f_7_ = -f_3_ + f_2_;
		if (b <= 26) {
			method2412((byte) 3, -0.7233354F, 0.30029753F, 62, -0.3206033F, 0.9242343F, -1.1188294F, 0.58847743F);
		}
		float f_8_ = -f_1_ + f_0_;
		float f_9_ = 0.0F;
		float f_10_ = 0.0F;
		float f_11_ = 0.0F;
		while (f_5_ < 1.1F) {
			float f_12_ = f + f_5_ * f_6_;
			float f_13_ = f_7_ * f_5_ + f_3_;
			float f_14_ = f_1_ + f_5_ * f_8_;
			int i_15_ = (int) f_12_ >> 9;
			int i_16_ = (int) f_14_ >> 9;
			if ((i_15_ ^ 0xffffffff) < -1 && (i_16_ ^ 0xffffffff) < -1 && Node_Sub54.GAME_SCENE_WDITH > i_15_ && (i_16_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff)) {
				int i_17_ = Class295.myPlayer.plane;
				if (i_17_ < 3 && (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_15_][i_16_] & 0x2 ^ 0xffffffff) != -1) {
					i_17_++;
				}
				int i_18_ = Node_Sub38_Sub37.aPlaneArray10466[i_17_].method3260((int) f_14_, -113, (int) f_12_);
				if (f_13_ > (float) i_18_) {
					if ((i ^ 0xffffffff) > -3) {
						return f_5_;
					}
					return method2412((byte) 52, f_9_, f_14_, -1 + i, f_11_, f_13_, f_10_, f_12_) * 0.1F + (-0.1F + f_5_);
				}
			}
			f_11_ = f_14_;
			f_10_ = f_13_;
			f_5_ += 0.1F;
			f_9_ = f_12_;
		}
		return -1.0F;
	}
	
	final Object method2409(byte b) {
		if (b >= -39) {
			return null;
		}
		anInt11093++;
		return anObject11092;
	}
	
	static final void method2413(boolean bool, int i, String string) {
		anInt11088++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 2, (long) i);
		if (bool != true) {
			method2413(true, -71, null);
		}
		cachenode_sub2.method2288(0);
		cachenode_sub2.aString9428 = string;
	}
	
	final boolean method2411(int i) {
		if (i > -77) {
			return false;
		}
		anInt11091++;
		return false;
	}
	
	CacheNode_Sub20_Sub1(Object object, int i) {
		super(i);
		anObject11092 = object;
	}
}
