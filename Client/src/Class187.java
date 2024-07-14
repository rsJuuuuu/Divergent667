/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

public class Class187 {
    private final int anInt2263;
    private final int anInt2264;
    static IncommingPacket aClass192_2265;
    private boolean aBoolean2266;
    static int anInt2267;
    static int anInt2268;
    private final boolean aBoolean2269;
    static int anInt2271;
    static int anInt2272;
    static int anInt2273;
    static long aLong2275 = 1L;
    static int anInt2276;
    static OutcommingPacket aClass318_2277;

    static void method1876(long l) {
        anInt2272++;
        Class141.aCalendar1754.setTime(new Date(l));
    }

    final int method1877() {
        anInt2271++;
        return anInt2264;
    }

    final boolean method1878() {
        anInt2268++;
        return aBoolean2266;
    }

    static int method1879(int i) {
        int i_0_ = -1;
        for (int i_1_ = 0; i_1_ < Class290.anInt3655 - 1; i_1_++) {
            if (i < Node_Sub38_Sub25.anIntArray10358[i_1_] + Class270_Sub2.anIntArray8039[i_1_]) {
                i_0_ = i_1_;
                break;
            }
        }
        if (i_0_ == -1) {
            i_0_ = Class290.anInt3655 - 1;
        }
        return i_0_;
    }

    public static void method1880() {
        aClass192_2265 = null;
        aClass318_2277 = null;
    }

    final int method1881() {
        anInt2273++;
        return anInt2263;
    }

    Class187(boolean bool, int i, int i_2_, boolean bool_3_) {
        aBoolean2269 = bool;
        anInt2263 = i_2_;
        aBoolean2266 = bool_3_;
        anInt2264 = i;
    }

    final boolean method1883() {
        return !aBoolean2269;
    }

    static {
        aClass192_2265 = new IncommingPacket(2, 6);
        anInt2276 = -1;
        aClass318_2277 = new OutcommingPacket(23, 1);
    }
}
