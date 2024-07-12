/* CacheNode_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub4 extends CacheNode {
    static boolean[] aBooleanArray9454 = new boolean[100];
    static int anInt9455;
    static int anInt9456;
    protected Class158 aClass158_9457;
    protected String aString9458;
    static int anInt9459;
    static int anInt9460;
    static int anInt9461;
    protected int anInt9462;
    static Class124 aClass124_9463 = new Class124(11);
    static int anInt9464;
    static int anInt9465 = 0;
    static Class1 aClass1_9466;

    final int method2300() {
        anInt9460++;
        if (aClass158_9457.aCacheNode1984.aCacheNode7035 != aClass158_9457.aCacheNode1984) {
            return ((CacheNode_Sub13) aClass158_9457.aCacheNode1984.aCacheNode7035).anInt9562;
        }
        return -1;
    }

    final boolean method2301(int i, CacheNode_Sub13 cachenode_sub13) {
        anInt9461++;
        int i_0_ = method2300();
        cachenode_sub13.method2275();
        anInt9462--;
        if (anInt9462 != 0) {
            return i_0_ != method2300();
        }
        this.method2160((byte) 73);
        this.method2275();
        Class21.anInt355--;
        Class200_Sub2.aClass61_4941.method601(this, 25566, cachenode_sub13.aLong9564);
        return false;
    }

    static int method2302() {
        anInt9455++;
        GraphicsToolkit graphicstoolkit = Class93.aGraphicsToolkit1241;
        boolean bool = false;
        if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() != 0) {
            java.awt.Canvas canvas = new java.awt.Canvas();
            canvas.setSize(100, 100);
            bool = true;
            graphicstoolkit = Class262_Sub9.method3171(null, (byte) 122, null, 0, canvas, 0);
        }
        long l = Class313.method3650();
        int i = 0;
        for (/**/; i < 10000; i++)
            graphicstoolkit.a(5, 10, 100, 75, 50, 100, 15, 90, 100);
        int i_1_ = (int) (Class313.method3650() - l);
        graphicstoolkit.method1239(100, 100, 0, 0, -16777216);
        if (bool) {
            graphicstoolkit.method1233();
        }
        return i_1_;
    }

    final boolean method2303(CacheNode_Sub13 cachenode_sub13) {
        anInt9459++;
        boolean bool = true;
        cachenode_sub13.method2275();
        CacheNode_Sub13 cachenode_sub13_2_ = (CacheNode_Sub13) aClass158_9457.method1723();
        while (cachenode_sub13_2_ != null) {
            if (Node_Sub42.method2935(cachenode_sub13.anInt9562, cachenode_sub13_2_.anInt9562)) {
                Class76.method767(cachenode_sub13, cachenode_sub13_2_);
                anInt9462++;
                return !bool;
            }
            cachenode_sub13_2_ = (CacheNode_Sub13) aClass158_9457.method1721();
            bool = false;
        }
        aClass158_9457.method1719(cachenode_sub13);
        anInt9462++;
        return bool;
    }

    static void method2304() {
        StandardDrawableModel.method700();
        anInt9456++;
        Class229.aClass270_2733 = null;

        Class44.aClass119_670 = null;
        Class245.aClass119_3085 = null;
        Class44.aClass270_669 = null;
        Class229.aGraphicsToolkit2732 = null;
        GraphicsToolkit.aClass270_1548 = null;
        CacheNode_Sub18.aClass343ArrayArray9608 = null;
    }

    static void method2305(int i, int i_4_, IComponentDefinitions widget) {
        Class197.anInt2415 = i;
        Class320_Sub29.aWidget8488 = widget;
        anInt9464++;
        StandardDrawableModel.anInt5918 = i_4_;
    }

    public static void method2306() {
        aBooleanArray9454 = null;
        aClass1_9466 = null;
        aClass124_9463 = null;
    }

    CacheNode_Sub4(String string) {
        aString9458 = string;
        aClass158_9457 = new Class158();
    }
}
