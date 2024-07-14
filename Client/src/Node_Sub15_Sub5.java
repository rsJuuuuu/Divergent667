/* Node_Sub15_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub5 extends Node_Sub15 {
    private int anInt9803 = -1;
    static int anInt9804;
    static Index aClass302_9805;
    static int anInt9806;
    static int anInt9807;
    static int anInt9808;
    static int anInt9809;
    private byte aByte9810;

    final void method2556(ClanChat clanchat) {
        anInt9809++;
        clanchat.method500(aByte9810, anInt9803);
    }

    static long method2568() {
        anInt9808++;
        return Animable_Sub3_Sub1.aClass234_11017.method2151();
    }

    final void method2554(BufferedStream buffer) {
        anInt9803 = buffer.readUnsignedShort();
        anInt9804++;
        aByte9810 = buffer.readByte();
    }

    static void method2569() {
        anInt9807++;
        for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(); node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620())
            Class287.method3401(node_sub19, false, -1);
        for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(); node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620())
            Class287.method3401(node_sub19, true, -1);
    }

    public static void method2570() {
        aClass302_9805 = null;
    }

    Node_Sub15_Sub5() {
        /* empty */
    }
}
