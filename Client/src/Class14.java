/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14 {
    protected int anInt212;
    protected int anInt213;
    static int anInt214;
    static int anInt215;
    protected int anInt216 = 128;
    protected int anInt217;
    protected int anInt218 = 128;
    static Index index17;
    protected int anInt220;

    final Class14 method214() {
        anInt215++;
        return new Class14(anInt220, anInt218, anInt216, anInt212, anInt213, anInt217);
    }

    final void method215(Class14 class14_0_) {
        anInt213 = class14_0_.anInt213;
        anInt220 = class14_0_.anInt220;
        anInt214++;
        anInt217 = class14_0_.anInt217;
        anInt218 = class14_0_.anInt218;
        anInt216 = class14_0_.anInt216;
        anInt212 = class14_0_.anInt212;
    }

    public static void method216() {
        index17 = null;
    }

    Class14(int i) {
        anInt220 = i;
    }

    private Class14(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        anInt212 = i_3_;
        anInt213 = i_4_;
        anInt216 = i_2_;
        anInt220 = i;
        anInt217 = i_5_;
        anInt218 = i_1_;
    }
}
