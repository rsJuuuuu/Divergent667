/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372 {
    static int anInt4587;
    static Class372 aClass372_4588 = new Class372(1);
    static int anInt4589;
    static int anInt4590;
    protected int anInt4591;
    static Class372 aClass372_4592 = new Class372(2);
    static Class372 aClass372_4593 = new Class372(4);
    static Class372 aClass372_4594 = new Class372(1);
    static Class372 aClass372_4595 = new Class372(2);
    static Class372 aClass372_4596 = new Class372(4);
    static Class372 aClass372_4597 = new Class372(2);
    static Class372 aClass372_4598 = new Class372(4);
    static boolean aBoolean4599 = false;
    static int anInt4600;

    public static void method4102() {
        aClass372_4593 = null;
        aClass372_4597 = null;
        aClass372_4594 = null;
        aClass372_4595 = null;
        aClass372_4596 = null;
        aClass372_4598 = null;
        aClass372_4588 = null;
        aClass372_4592 = null;
    }

    public final String toString() {
        anInt4589++;
        throw new IllegalStateException();
    }

    static void method4103(Actor actor, int i_0_) {
        anInt4587++;
        if (actor.anIntArray10817 != null) {
            int i_1_ = actor.anIntArray10817[1 + i_0_];
            if (actor.anAnimator10876.method250((byte) -126) != i_1_) {
                actor.anAnimator10876.method234(actor.anAnimator10876.method223(), i_1_);
                actor.anInt10900 = actor.anInt10904;
            }
        }
    }

    static boolean method4104(String string) {
        anInt4590++;
        boolean bool_3_ = false;
        boolean bool_4_ = false;
        int i_5_ = 0;
        int i_6_ = string.length();
        for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
            int i_8_ = string.charAt(i_7_);
            if (i_7_ == 0) {
                if (i_8_ == 45) {
                    bool_3_ = true;
                    continue;
                }
                if (i_8_ == 43) {
                    continue;
                }
            }
            if (i_8_ >= 48 && i_8_ <= 57) {
                i_8_ -= 48;
            } else if (i_8_ >= 65 && i_8_ <= 90) {
                i_8_ -= 55;
            } else if (i_8_ >= 97 && i_8_ <= 122) {
                i_8_ -= 87;
            } else {
                return false;
            }
            if (10 <= i_8_) {
                return false;
            }
            if (bool_3_) {
                i_8_ = -i_8_;
            }
            int i_9_ = i_8_ + i_5_ * 10;
            if (i_5_ != i_9_ / 10) {
                return false;
            }
            i_5_ = i_9_;
            bool_4_ = true;
        }
        return bool_4_;
    }

    private Class372(int i) {
        anInt4591 = i;
    }
}
