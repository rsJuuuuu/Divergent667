/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class294 {
    static OutcommingPacket aClass318_3685 = new OutcommingPacket(86, 7);
    static int anInt3686;
    static int anInt3687 = 2;
    static int anInt3688;
    static Class379 aClass379_3689 = new Class379();
    static Index aClass302_3690;

    public static void method3465() {
        aClass302_3690 = null;
        aClass379_3689 = null;
        aClass318_3685 = null;
    }

    static boolean method3466(int i) {
        anInt3688++;
        return (0x8000 & i) != 0;
    }

    static void method3467(int i, int i_3_, int i_4_) {
        anInt3686++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 11, i_4_);
        cachenode_sub2.method2288();
        cachenode_sub2.anInt9434 = i;
        cachenode_sub2.anInt9432 = i_3_;
    }
}
