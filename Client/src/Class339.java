/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class339 {
    protected GLToolkit aGLToolkit4202;
    static int anInt4203;
    static int anInt4204 = -1;
    static int anInt4205;

    static void method3916(int i) {
        anInt4205++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 6, i);
        cachenode_sub2.method2291();
    }

    abstract void method3917(Class169 class169, int i, int i_0_);

    abstract void method3918(int i);

    abstract void method3919(int i, int i_1_, int i_2_);

    abstract void method3920();

    static int method3921(int i, int i_3_, int i_5_) {
        i_5_ &= 0x3;
        anInt4203++;
        if (i_5_ == 0) {
            return i;
        }
        if (i_5_ == 1) {
            return i_3_;
        }
        if (i_5_ == 2) {
            return 7 - i;
        }
        return -i_3_ + 7;
    }

    Class339(GLToolkit gltoolkit) {
        aGLToolkit4202 = gltoolkit;
    }

    abstract boolean method3922(byte b);

    abstract void method3923(boolean bool, int i);
}
