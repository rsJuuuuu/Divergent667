/* Node_Sub15_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub3 extends Node_Sub15 {
    private String aString9785;
    static int anInt9786;
    static int anInt9787;
    static int anInt9788;
    static int anInt9789;
    static int anInt9790;

    static void method2563(int i, int i_0_, byte b, Class343 class343) {
        if (b <= -46) {
            anInt9788++;
            CacheNode_Sub18.aClass343ArrayArray9608[i_0_][i] = class343;
        }
    }

    static int method2564(String string, char c) {
        anInt9786++;
        int i = 0;
        int i_1_ = string.length();
        if (!true) {
            anInt9787 = -100;
        }
        for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
            if (string.charAt(i_2_) == c) {
                i++;
            }
        }
        return i;
    }

    final void method2556(ClanChat clanchat) {
        clanchat.aString763 = aString9785;
        anInt9790++;
    }

    final void method2554(BufferedStream buffer) {
        aString9785 = buffer.readString();
        anInt9789++;
        buffer.readInt();
    }

    Node_Sub15_Sub3() {
        /* empty */
    }
}
