/* CacheNode_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub2 extends CacheNode {
    protected String aString9428;
    protected int anInt9429;
    static int anInt9430;
    static int anInt9431;
    protected int anInt9432;
    static int anInt9433;
    protected int anInt9434;
    static int anInt9435;
    static Class329 aClass329_9436 = new Class329(4);
    static int anInt9437;
    static Class357 aClass357_9438;

    public static void method2286() {
        aClass357_9438 = null;
        aClass329_9436 = null;
    }

    final long method2287() {
        anInt9433++;
        return aLong7037 & 0x7fffffffffffffffL;
    }

    final void method2288() {
        aLong7037 |= -9223372036854775808L;
        anInt9430++;
        if (method2287() == (long) 0) {
            Class72.aClass158_974.method1719(this);
        }
    }

    final int method2289() {
        anInt9437++;
        return (int) (0xffL & aLong2797 >>> 56);
    }

    final long method2290() {
        anInt9431++;
        return 0xffffffffffffffL & aLong2797;
    }

    final void method2291() {
        aLong7037 = Class313.method3650() + 500L | aLong7037 & -9223372036854775808L;
        anInt9435++;
        Node_Sub5.aClass158_7027.method1719(this);
    }

    CacheNode_Sub2(int i, long l) {
        aLong2797 = l | (long) i << 56;
    }
}
