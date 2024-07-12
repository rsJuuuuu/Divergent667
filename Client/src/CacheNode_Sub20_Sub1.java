/* CacheNode_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub20_Sub1 extends CacheNode_Sub20 {
    static int anInt11088;
    static int myPlayerPlane;
    static int anInt11090;
    static int anInt11091;
    private final Object anObject11092;
    static int anInt11093;

    static float method2412(float f, float f_0_, int i, float f_1_, float f_2_, float f_3_, float f_4_) {
        anInt11090++;
        float f_5_ = 0.0F;
        float f_6_ = -f + f_4_;
        float f_7_ = -f_3_ + f_2_;
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
            if (i_15_ > 0 && i_16_ > 0 && Node_Sub54.GAME_SCENE_WDITH > i_15_ && Class377_Sub1.GAME_SCENE_HEIGHT > i_16_) {
                int i_17_ = Class295.myPlayer.plane;
                if (i_17_ < 3 && (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_15_][i_16_] & 0x2) != 0) {
                    i_17_++;
                }
                int i_18_ = Node_Sub38_Sub37.aPlaneArray10466[i_17_].method3260((int) f_14_, -113, (int) f_12_);
                if (f_13_ > (float) i_18_) {
                    if (i < 2) {
                        return f_5_;
                    }
                    return method2412(f_9_, f_14_, -1 + i, f_11_, f_13_, f_10_, f_12_) * 0.1F + (-0.1f + f_5_);
                }
            }
            f_11_ = f_14_;
            f_10_ = f_13_;
            f_5_ += 0.1F;
            f_9_ = f_12_;
        }
        return -1.0f;
    }

    final Object method2409() {
        anInt11093++;
        return anObject11092;
    }

    static void method2413(int i, String string) {
        anInt11088++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 2, i);
        cachenode_sub2.method2288();
        cachenode_sub2.aString9428 = string;
    }

    final boolean method2411() {
        anInt11091++;
        return false;
    }

    CacheNode_Sub20_Sub1(Object object, int i) {
        super(i);
        anObject11092 = object;
    }
}
