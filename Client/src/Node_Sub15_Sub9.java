/* Node_Sub15_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub9 extends Node_Sub15 {
    static int anInt9833;
    private int anInt9834;
    private int anInt9835;
    static int anInt9836;
    private int anInt9837;
    static Class257 aClass257_9838 = new Class257();
    static int anInt9839;
    private int anInt9840;
    static int anInt9841;
    static Class346 aClass346_9842 = new Class346();
    static Interface6 anInterface6_9843;

    static void method2576(int i, int i_0_) {
        anInt9841++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 7, i_0_);
        cachenode_sub2.method2288();
        cachenode_sub2.anInt9434 = i;
    }

    public static void method2577() {
        aClass346_9842 = null;
        aClass257_9838 = null;
        anInterface6_9843 = null;
    }

    final void method2556(ClanChat clanchat) {
        clanchat.method504(anInt9837, anInt9840, anInt9835, anInt9834);
        anInt9833++;
    }

    final void method2554(BufferedStream buffer) {
        anInt9836++;
        anInt9834 = buffer.readInt();
        anInt9835 = buffer.readInt();
        anInt9840 = buffer.readUnsignedByte();
        anInt9837 = buffer.readUnsignedByte();
    }

    Node_Sub15_Sub9() {
        /* empty */
    }
}
