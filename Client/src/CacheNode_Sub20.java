/* CacheNode_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class CacheNode_Sub20 extends CacheNode {
    static int anInt9623;
    static int anInt9624;
    static int anInt9625;
    static long[] aLongArray9626 = new long[256];
    protected int anInt9627;
    static int[] anIntArray9628;

    static void method2406(String string) {
        anInt9624++;
        Class28.method331(string, "", 0, "", "", 0);
    }

    static void method2407() {
        Node_Sub38_Sub23.anInt10347 = -1;
        Class159.loginType = 1;
        anInt9625++;
        Class320_Sub23.aClass123_8432 = Class218.aClass123_2560;
        Class129.method1556(Class188_Sub1_Sub1.aString9327.equals(""), Class188_Sub1_Sub1.aString9327, true, "");
    }

    static void method2408(int i) {
        anInt9623++;
        Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1518(3512, i);
        if (node_sub3 != null) {
            node_sub3.aBoolean6946 = !node_sub3.aBoolean6946;
            node_sub3.aClass189_Sub1_6943.method1917(node_sub3.aBoolean6946);
        }
    }

    abstract Object method2409();

    public static void method2410() {
        anIntArray9628 = null;
        aLongArray9626 = null;
    }

    abstract boolean method2411();

    CacheNode_Sub20(int i) {
        anInt9627 = i;
    }

    static {
        for (int i = 0; i < 256; i++) {
            long l = i;
            for (int i_0_ = 0; i_0_ < 8; i_0_++) {
                if ((0x1L & l) == 1) {
                    l = l >>> 1 ^ -3932672073523589310L;
                } else {
                    l >>>= 1;
                }
            }
            aLongArray9626[i] = l;
        }
    }
}
