/* Node_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub21 extends Node {
    protected int anInt7181;
    static int anInt7182;
    static Class96 aClass96_7183 = null;
    static int baseY;
    static Class243 aClass243_7185 = new Class243();
    static int anInt7186;
    protected int anInt7187;

    public static void method2617() {
        aClass243_7185 = null;
        aClass96_7183 = null;
    }

    static void method2618(boolean bool) {
        anInt7182++;
        if (Node_Sub10.aString7081.length() != 0) {
            Node_Sub7.method2422("--> " + Node_Sub10.aString7081);
            Class126.method1538(120, false, bool, Node_Sub10.aString7081);
            Class332.anInt4145 = 0;
            if (!bool) {
                Class315.anInt4034 = 0;
                Node_Sub10.aString7081 = "";
            }
        }
    }

    Node_Sub21(int i, int i_1_) {
        anInt7187 = i;
        anInt7181 = i_1_;
    }
}
