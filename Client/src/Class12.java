/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12 {
    static int anInt180;
    static int anInt181;
    static int anInt182;
    static int anInt183;
    static int anInt184;
    static int anInt186;
    static HashTable aHashTable187;
    private final Class158 aClass158_188 = new Class158();
    static int anInt189;
    private final HashTable aHashTable190;
    static int anInt191;
    private int anInt192;
    static int anInt193;
    static boolean aBoolean194 = true;
    static int anInt195;
    static IncommingPacket aClass192_197;
    static Class257 aClass257_198;
    static float aFloat199;

    private void method195(Interface18 interface18) {
        anInt180++;
        long l = interface18.method67(26165);
        for (CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14) aHashTable190.method1518(3512, l); cachenode_sub14 != null; cachenode_sub14 = (CacheNode_Sub14) aHashTable190.method1524()) {
            if (cachenode_sub14.anInterface18_9576.method66(28071, interface18)) {
                method198(cachenode_sub14);
                break;
            }
        }
    }

    final void method196() {
        aClass158_188.method1722(true);
        anInt182++;
        aHashTable190.method1517(false);
        anInt192 = 250;
    }

    final void method197() {
        for (CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14) aClass158_188.method1723(); cachenode_sub14 != null; cachenode_sub14 = (CacheNode_Sub14) aClass158_188.method1721()) {
            if (cachenode_sub14.method2350((byte) -38)) {
                cachenode_sub14.method2160((byte) 59);
                cachenode_sub14.method2275();
                anInt192 += cachenode_sub14.anInt9574;
            }
        }
        anInt189++;
    }

    private void method198(CacheNode_Sub14 cachenode_sub14) {
        anInt181++;
        if (cachenode_sub14 != null) {
            cachenode_sub14.method2160((byte) 72);
            cachenode_sub14.method2275();
            anInt192 += cachenode_sub14.anInt9574;
        }
    }

    final void method199() {
        anInt183++;
        if (Node_Sub40.aClass233_7514 != null) {
            for (CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14) aClass158_188.method1723(); cachenode_sub14 != null; cachenode_sub14 = (CacheNode_Sub14) aClass158_188.method1721()) {
                if (!cachenode_sub14.method2350((byte) -38)) {
                    if ((long) 5 < ++cachenode_sub14.aLong7037) {
                        CacheNode_Sub14 cachenode_sub14_0_ = Node_Sub40.aClass233_7514.method2143(cachenode_sub14);
                        aHashTable190.method1515(cachenode_sub14.aLong2797, cachenode_sub14_0_, -125);
                        Node_Sub38_Sub19.method2847(cachenode_sub14, cachenode_sub14_0_);
                        cachenode_sub14.method2160((byte) 117);
                        cachenode_sub14.method2275();
                    }
                } else if (cachenode_sub14.method2347(27670) == null) {
                    cachenode_sub14.method2160((byte) 35);
                    cachenode_sub14.method2275();
                    anInt192 += cachenode_sub14.anInt9574;
                }
            }
        }
    }

    final int method200() {
        return 250;
    }

    final int method201() {
        anInt191++;
        return anInt192;
    }

    public static void method202() {
        aClass192_197 = null;
        aClass257_198 = null;

        aHashTable187 = null;
    }

    private void method203(Object object, Interface18 interface18) {
        anInt186++;
        method195(interface18);
        anInt192 -= 1;
        while (anInt192 < 0) {
            CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14) aClass158_188.method1717(-107);
            method198(cachenode_sub14);
        }
        CacheNode_Sub14_Sub2 cachenode_sub14_sub2 = new CacheNode_Sub14_Sub2(interface18, object, 1);
        aHashTable190.method1515(interface18.method67(26165), cachenode_sub14_sub2, -124);
        aClass158_188.method1719(cachenode_sub14_sub2);
        cachenode_sub14_sub2.aLong7037 = 0L;
    }

    final Object method204(Interface18 interface18) {
        anInt195++;
        long l = interface18.method67(26165);
        for (CacheNode_Sub14 cachenode_sub14 = (CacheNode_Sub14) aHashTable190.method1518(3512, l); cachenode_sub14 != null; cachenode_sub14 = (CacheNode_Sub14) aHashTable190.method1524()) {
            if (cachenode_sub14.anInterface18_9576.method66(28071, interface18)) {
                Object object = cachenode_sub14.method2347(27670);
                if (object == null) {
                    cachenode_sub14.method2160((byte) 100);
                    cachenode_sub14.method2275();
                    anInt192 += cachenode_sub14.anInt9574;
                } else {
                    if (cachenode_sub14.method2350((byte) -38)) {
                        CacheNode_Sub14_Sub2 cachenode_sub14_sub2 = new CacheNode_Sub14_Sub2(interface18, object, cachenode_sub14.anInt9574);
                        aHashTable190.method1515(cachenode_sub14.aLong2797, cachenode_sub14_sub2, -124);
                        aClass158_188.method1719(cachenode_sub14_sub2);
                        cachenode_sub14_sub2.aLong7037 = 0L;
                        cachenode_sub14.method2160((byte) 88);
                        cachenode_sub14.method2275();
                    } else {
                        aClass158_188.method1719(cachenode_sub14);
                        cachenode_sub14.aLong7037 = 0L;
                    }
                    return object;
                }
            }
        }
        return null;
    }

    final void method205(Object object, Interface18 interface18) {
        anInt184++;
        method203(object, interface18);
    }

    Class12() {
        anInt192 = 250;
        aHashTable190 = new HashTable(128);
    }

    static {
        anInt193 = 0;
        aHashTable187 = new HashTable(64);
        aClass192_197 = new IncommingPacket(48, 5);
        aClass257_198 = new Class257();
    }
}
