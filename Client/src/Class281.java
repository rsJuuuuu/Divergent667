/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class281 {
    static int anInt3571;
    private final Index aClass302_3572;
    static int anInt3573;
    static int anInt3574;
    static IncommingPacket aClass192_3575 = new IncommingPacket(114, 4);
    private final Class61 aClass61_3576 = new Class61(64);
    static int anInt3577;
    protected Class363 aClass363_3578;
    static int[] anIntArray3579 = new int[1000];
    static int anInt3580;

    final void method3379() {
        synchronized (aClass61_3576) {
            aClass61_3576.method608(false);
        }
        anInt3571++;
    }

    final void method3380() {
        anInt3574++;
        synchronized (aClass61_3576) {
            aClass61_3576.method598(5);
        }
    }

    public static void method3381() {
        aClass192_3575 = null;
        anIntArray3579 = null;
    }

    final void method3382() {
        synchronized (aClass61_3576) {
            aClass61_3576.method602((byte) -123);
        }
        anInt3577++;
    }

    final Class259 method3383(byte b, int i) {
        anInt3573++;
        Class259 class259;
        synchronized (aClass61_3576) {
            class259 = (Class259) aClass61_3576.method607(i, 0);
        }
        if (class259 != null) {
            return class259;
        }
        byte[] bs;
        synchronized (aClass302_3572) {
            bs = aClass302_3572.method3524(i, 32);
        }
        class259 = new Class259();
        class259.aClass281_3265 = this;
        if (bs != null) {
            class259.method3134(new BufferedStream(bs));
        }
        synchronized (aClass61_3576) {
            if (b < 98) {
                return null;
            }
            aClass61_3576.method601(class259, 25566, i);
        }
        return class259;
    }

    static void method3384() {
        anInt3580++;
        CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723();
        for (/**/; cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721()) {
            if (cachenode_sub4.anInt9462 > 1) {
                cachenode_sub4.anInt9462 = 0;
                Class200_Sub2.aClass61_4941.method601(cachenode_sub4, 25566, ((CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035).aLong9564);
                cachenode_sub4.aClass158_9457.method1722(true);
            }
        }
        Class21.anInt355 = 0;
        Class315.anInt4035 = 0;
        Class368.aClass312_4549.method3614();
        Class261.aHashTable3306.method1517(false);
        Class184.aClass158_2189.method1722(true);
        Class213.aBoolean2510 = false;
    }

    Class281(Index class302, Class363 class363) {
        aClass302_3572 = class302;
        aClass302_3572.method3537(32);
        aClass363_3578 = class363;
    }
}
