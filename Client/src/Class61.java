/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
    static Node_Sub9_Sub1 aNode_Sub9_Sub1_885;
    private final Class158 aClass158_886 = new Class158();
    static int anInt887;
    static int anInt888;
    static int anInt889;
    static int anInt890;
    static int anInt891;
    static int anInt892;
    static int anInt893;
    static int anInt894;
    static int anInt895;
    static int anInt896;
    private int anInt897;
    static int anInt898 = 0;
    static int anInt899;
    static int anInt900;
    private final HashTable aHashTable901;
    private final int anInt902;
    static int anInt903;

    final int method595() {
        anInt895++;
        return anInt897;
    }

    final Object method596() {
        anInt893++;
        CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1516();
        while (cachenode_sub20 != null) {
            Object object = cachenode_sub20.method2409();
            if (object == null) {
                CacheNode_Sub20 cachenode_sub20_1_ = cachenode_sub20;
                cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1520(67);
                cachenode_sub20_1_.method2160((byte) 27);
                cachenode_sub20_1_.method2275();
                anInt897 += cachenode_sub20_1_.anInt9627;
            } else {
                return object;
            }
        }
        return null;
    }

    Class61(int i) {
        this(i, i);
    }

    final int method597(int i) {
        anInt899++;
        if (i != 22349) {
            return 125;
        }
        return anInt902;
    }

    final void method598(int i) {
        if (Node_Sub34.aClass115_7410 != null) {
            for (CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1723(); cachenode_sub20 != null; cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1721()) {
                if (!cachenode_sub20.method2411()) {
                    if ((long) i < ++cachenode_sub20.aLong7037) {
                        CacheNode_Sub20 cachenode_sub20_3_ = Node_Sub34.aClass115_7410.method1160(cachenode_sub20);
                        aHashTable901.method1515(cachenode_sub20.aLong2797, cachenode_sub20_3_, -126);
                        Node_Sub38_Sub19.method2847(cachenode_sub20, cachenode_sub20_3_);
                        cachenode_sub20.method2160((byte) 62);
                        cachenode_sub20.method2275();
                    }
                } else if (cachenode_sub20.method2409() == null) {
                    cachenode_sub20.method2160((byte) 82);
                    cachenode_sub20.method2275();
                    anInt897 += cachenode_sub20.anInt9627;
                }
            }
        }
        anInt890++;
    }

    final int method599() {
        anInt894++;
        int i = 0;
        for (CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1723(); cachenode_sub20 != null; cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1721()) {
            if (!cachenode_sub20.method2411()) {
                i++;
            }
        }
        return i;
    }

    private void method600(CacheNode_Sub20 cachenode_sub20) {
        anInt900++;
        if (cachenode_sub20 != null) {
            cachenode_sub20.method2160((byte) 86);
            cachenode_sub20.method2275();
            anInt897 += cachenode_sub20.anInt9627;
        }
    }

    final void method601(Object object, int i, long l) {
        anInt892++;
        method604(l, object, 1, 79);
        if (i != 25566) {
            method604(-34L, null, 104, 85);
        }
    }

    final void method602(byte b) {
        if (b > -116) {
            method597(101);
        }
        for (CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1723(); cachenode_sub20 != null; cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1721()) {
            if (cachenode_sub20.method2411()) {
                cachenode_sub20.method2160((byte) 78);
                cachenode_sub20.method2275();
                anInt897 += cachenode_sub20.anInt9627;
            }
        }
        anInt888++;
    }

    final Object method603() {
        anInt889++;
        CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1520(85);
        while (cachenode_sub20 != null) {
            Object object = cachenode_sub20.method2409();
            if (object == null) {
                CacheNode_Sub20 cachenode_sub20_4_ = cachenode_sub20;
                cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1520(93);
                cachenode_sub20_4_.method2160((byte) 61);
                cachenode_sub20_4_.method2275();
                anInt897 += cachenode_sub20_4_.anInt9627;
            } else {
                return object;
            }
        }
        return null;
    }

    final void method604(long l, Object object, int i, int i_5_) {
        anInt891++;
        if (i > anInt902) {
            throw new IllegalStateException("s>cs");
        }
        method605(l, -13068);
        anInt897 -= i;
        while (anInt897 < 0) {
            CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aClass158_886.method1717(-120);
            method600(cachenode_sub20);
        }
        CacheNode_Sub20_Sub1 cachenode_sub20_sub1 = new CacheNode_Sub20_Sub1(object, i);
        aHashTable901.method1515(l, cachenode_sub20_sub1, -128);
        aClass158_886.method1719(cachenode_sub20_sub1);
        cachenode_sub20_sub1.aLong7037 = 0L;
    }

    final void method605(long l, int i) {
        if (i == -13068) {
            anInt887++;
            CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1518(3512, l);
            method600(cachenode_sub20);
        }
    }

    public static void method606() {
        aNode_Sub9_Sub1_885 = null;
    }

    final Object method607(long l, int i) {
        anInt896++;
        CacheNode_Sub20 cachenode_sub20 = (CacheNode_Sub20) aHashTable901.method1518(i ^ 0xdb8, l);
        if (i != 0) {
            return null;
        }
        if (cachenode_sub20 == null) {
            return null;
        }
        Object object = cachenode_sub20.method2409();
        if (object == null) {
            cachenode_sub20.method2160((byte) 100);
            cachenode_sub20.method2275();
            anInt897 += cachenode_sub20.anInt9627;
            return null;
        }
        if (cachenode_sub20.method2411()) {
            CacheNode_Sub20_Sub1 cachenode_sub20_sub1 = new CacheNode_Sub20_Sub1(object, cachenode_sub20.anInt9627);
            aHashTable901.method1515(cachenode_sub20.aLong2797, cachenode_sub20_sub1, -125);
            aClass158_886.method1719(cachenode_sub20_sub1);
            cachenode_sub20_sub1.aLong7037 = 0L;
            cachenode_sub20.method2160((byte) 94);
            cachenode_sub20.method2275();
        } else {
            aClass158_886.method1719(cachenode_sub20);
            cachenode_sub20.aLong7037 = 0L;
        }
        return object;
    }

    final void method608(boolean bool) {
        anInt903++;
        aClass158_886.method1722(!bool);
        aHashTable901.method1517(bool);
        anInt897 = anInt902;
    }

    Class61(int i, int i_7_) {
        anInt902 = i;
        anInt897 = i;
        int i_8_;
        for (i_8_ = 1; i > i_8_ + i_8_; i_8_ += i_8_) {
            if (i_8_ >= i_7_) {
                break;
            }
        }
        aHashTable901 = new HashTable(i_8_);
    }
}
