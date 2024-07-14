/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57 {
    static int anInt842;
    private final Index aClass302_843;
    static int anInt844;
    static int anInt845;
    private final Class61 aClass61_846 = new Class61(16);
    static int anInt847;
    static int anInt848;
    static int anInt849 = 0;
    static Class336 aClass336_850;
    static int anInt851;

    public static void method567() {
        aClass336_850 = null;
    }

    final Class7 method568(int i_1_) {
        anInt851++;
        Class7 class7;
        synchronized (aClass61_846) {
            class7 = (Class7) aClass61_846.method607(i_1_, 0);
        }
        if (class7 != null) {
            return class7;
        }
        byte[] bs;
        synchronized (aClass302_843) {
            bs = aClass302_843.method3524(i_1_, 30);
        }
        class7 = new Class7();
        if (bs != null) {
            class7.method182(new BufferedStream(bs));
        }
        synchronized (aClass61_846) {
            aClass61_846.method601(class7, 25566, i_1_);
        }
        return class7;
    }

    final void method569() {
        anInt844++;
        synchronized (aClass61_846) {
            aClass61_846.method608(false);
        }
    }

    final void method570() {
        synchronized (aClass61_846) {
            aClass61_846.method602((byte) -124);
        }
        anInt845++;
    }

    static byte[] method571(String string) {
        anInt848++;
        int i = string.length();
        if (i == 0) {
            return new byte[0];
        }
        int i_2_ = i + 3 & -4;
        int i_3_ = 3 * (i_2_ / 4);
        if (i > i_2_ - 2 && Node_Sub16.method2591(string.charAt(i_2_ - 2)) != -1) {
            if (i <= i_2_ - 1 || Node_Sub16.method2591(string.charAt(-1 + i_2_)) == -1) {
                i_3_--;
            }
        } else {
            i_3_ -= 2;
        }
        byte[] bs = new byte[i_3_];
        Class111.method1138(string, bs);
        return bs;
    }

    final void method572() {
        synchronized (aClass61_846) {
            aClass61_846.method598(5);
        }
        anInt847++;
    }

    Class57(Index class302) {
        aClass302_843 = class302;
        aClass302_843.method3537(30);
    }
}
