/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180 {
    static int anInt2133;
    static int anInt2134;
    static boolean aBoolean2135 = false;
    static int anInt2136 = 1409;
    static int anInt2137;
    static int anInt2138;
    private final Class61 aClass61_2139 = new Class61(256);
    private final Index aClass302_2140;
    static int anInt2141;
    static int anInt2142;
    static Class377_Sub1[] aClass377_Sub1Array2143 = new Class377_Sub1[0];

    final void method1818() {
        synchronized (aClass61_2139) {
            aClass61_2139.method608(false);
        }
        anInt2141++;
    }

    static int method1819(int i, int i_0_, int i_1_) {
        anInt2134++;
        int i_2_ = CacheNode_Sub17.method2393(-1 + i, i_1_ - 1) - (-CacheNode_Sub17.method2393(i - 1, 1 + i_1_) + (-CacheNode_Sub17.method2393(1 + i, -1 + i_1_) - CacheNode_Sub17.method2393(i + 1, 1 + i_1_)));
        if (i_0_ < 42) {
            method1822();
        }
        int i_3_ = CacheNode_Sub17.method2393(i, i_1_ - 1) + (CacheNode_Sub17.method2393(i, i_1_ + 1) + CacheNode_Sub17.method2393(-1 + i, i_1_)) + CacheNode_Sub17.method2393(i + 1, i_1_);
        int i_4_ = CacheNode_Sub17.method2393(i, i_1_);
        return i_3_ / 8 + (i_2_ / 16 + (i_4_ / 4));
    }

    final void method1820() {
        synchronized (aClass61_2139) {
            aClass61_2139.method598(5);
        }
        anInt2138++;
    }

    final CacheNode_Sub1 method1821(int i_6_) {
        anInt2142++;
        CacheNode_Sub1 cachenode_sub1;
        synchronized (aClass61_2139) {
            cachenode_sub1 = (CacheNode_Sub1) aClass61_2139.method607(i_6_, 0);
        }
        if (cachenode_sub1 != null) {
            return cachenode_sub1;
        }
        byte[] bs;
        synchronized (aClass302_2140) {
            bs = aClass302_2140.method3524(i_6_, 26);

        }
        cachenode_sub1 = new CacheNode_Sub1();
        if (bs != null) {
            cachenode_sub1.method2283(new BufferedStream(bs));
        }
        synchronized (aClass61_2139) {
            aClass61_2139.method601(cachenode_sub1, 25566, i_6_);
        }
        return cachenode_sub1;
    }

    public static void method1822() {
        aClass377_Sub1Array2143 = null;
    }

    final void method1823() {
        synchronized (aClass61_2139) {
            aClass61_2139.method602((byte) -119);
        }
        anInt2137++;
    }

    Class180(Class353 class353, int i, Index class302) {
        aClass302_2140 = class302;
        aClass302_2140.method3537(26);
    }
}
