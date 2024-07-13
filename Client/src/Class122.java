/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
    private final Index aClass302_1550;
    static int anInt1551;
    static int anInt1552;
    private final Index aClass302_1553;
    private final Class61 aClass61_1554 = new Class61(64);
    static boolean[][] aBooleanArrayArray1555;
    static int[] anIntArray1556;

    public static void method1507() {
        anIntArray1556 = null;
        aBooleanArrayArray1555 = null;
    }

    final CacheNode_Sub3 method1508(byte b, int i) {
        anInt1551++;
        CacheNode_Sub3 cachenode_sub3 = (CacheNode_Sub3) aClass61_1554.method607(i, 0);
        if (cachenode_sub3 != null) {
            return cachenode_sub3;
        }
        byte[] bs;
        if (i < 32768) {
            bs = aClass302_1550.method3524(i, 0);
        } else {
            bs = aClass302_1553.method3524(i & 0x7fff, 0);
        }

        cachenode_sub3 = new CacheNode_Sub3();
        if (bs != null) {
            cachenode_sub3.method2293(new BufferedStream(bs));
        }
        if (i >= 32768) {
            cachenode_sub3.method2299();
        }
        aClass61_1554.method601(cachenode_sub3, 25566, i);
        return cachenode_sub3;
    }

    Class122(int i, Index class302, Index class302_1_) {
        aClass302_1553 = class302_1_;
        aClass302_1550 = class302;
        if (aClass302_1550 != null) {
            aClass302_1550.method3537(0);
        }
        if (aClass302_1553 != null) {
            aClass302_1553.method3537(0);
        }
    }
}
