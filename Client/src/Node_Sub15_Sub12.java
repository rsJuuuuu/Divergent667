/* Node_Sub15_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub12 extends Node_Sub15 {
    static int anInt9861;
    private String aString9862;
    static int anInt9863;
    static int anInt9864;
    private int anInt9865;
    static int anInt9866;
    static String aString9867;

    static int method2582(int i) {
        anInt9866++;
        if (i == 16711935) {
            return -1;
        }
        return Class96.method1075(-71, i);
    }

    static int method2583(String string, byte b) {
        if (b < 50) {
            return -93;
        }
        anInt9864++;
        return 2 + string.length();
    }

    public static void method2584() {
        aString9867 = null;
    }

    final void method2556(ClanChat clanchat) {
        clanchat.method492(aString9862, anInt9865);
        anInt9861++;
    }

    Node_Sub15_Sub12() {
        /* empty */
    }

    final void method2554(BufferedStream buffer) {
        anInt9863++;
        anInt9865 = buffer.readInt();
        aString9862 = buffer.readString();
    }
}
