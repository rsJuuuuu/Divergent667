/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class172 {
    static int anInt2075;
    static int anInt2076;
    static Class172 aClass172_2077 = new Class172();
    static Class172 aClass172_2078 = new Class172();
    static Class172 aClass172_2079 = new Class172();
    static Class172 aClass172_2080 = new Class172();

    public static void method1796() {
        aClass172_2078 = null;
        aClass172_2080 = null;
        aClass172_2079 = null;
        aClass172_2077 = null;
    }

    static int method1797(Player player) {
        anInt2075++;
        int i_0_ = player.anInt11153;
        Class259 class259 = player.method868((byte) -127);
        int i_1_ = player.anAnimator10860.method250((byte) -53);
        if (-1 == i_1_ || player.aBoolean10867) {
            i_0_ = player.anInt11167;
        } else if (i_1_ == Objects.requireNonNull(class259).anInt3252 || class259.anInt3271 == i_1_ || class259.anInt3293 == i_1_ || class259.anInt3270 == i_1_) {
            i_0_ = player.anInt11182;
        } else if (i_1_ == class259.anInt3262 || class259.anInt3297 == i_1_ || i_1_ == class259.anInt3304 || class259.anInt3269 == i_1_) {
            i_0_ = player.anInt11172;
        }
        return i_0_;
    }

    public final String toString() {
        anInt2076++;
        throw new IllegalStateException();
    }
}
