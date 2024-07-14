/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class109 {
    static int anInt1367 = -1;
    private final Index aClass302_1368;
    protected int anInt1369 = 0;
    private final Class61 aClass61_1370;
    static int anInt1371;
    static int anInt1372;
    protected int anInt1373 = 0;
    static int anInt1374;
    private final Index aClass302_1375;
    private final Interface14 anInterface14_1376;

    final String method1126(Class151 class151, long l, int[] is) {
        anInt1372++;
        if (anInterface14_1376 != null) {
            String string = anInterface14_1376.method52(0, l, class151, is);
            if (string != null) {
                return string;
            }
        }
        return Long.toString(l);
    }

    static void method1127() {
        anInt1374++;
        for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(); node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620()) {
            if (node_sub19.aBoolean7156) {
                node_sub19.method2160();
            } else {
                node_sub19.aBoolean7159 = true;
                if (node_sub19.anInt7171 >= 0 && node_sub19.anInt7161 >= 0 && Node_Sub54.GAME_SCENE_WDITH > node_sub19.anInt7171 && node_sub19.anInt7161 < Class377_Sub1.GAME_SCENE_HEIGHT) {
                    FloatBuffer.method2247(103, node_sub19);
                }
            }
        }
        for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(); node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620()) {
            if (node_sub19.aBoolean7156) {
                node_sub19.method2160();
            } else {
                node_sub19.aBoolean7159 = true;
            }
        }
    }

    final CacheNode_Sub10 method1128(int i) {
        anInt1371++;
        CacheNode_Sub10 cachenode_sub10 = (CacheNode_Sub10) aClass61_1370.method607(i, 0);
        if (cachenode_sub10 != null) {
            return cachenode_sub10;
        }
        byte[] bs;
        if (i >= 32768) {
            bs = aClass302_1375.method3524(0x7fff & i, 1);
        } else {
            bs = aClass302_1368.method3524(i, 1);
        }
        cachenode_sub10 = new CacheNode_Sub10();
        cachenode_sub10.aClass109_9516 = this;
        if (bs != null) {
            cachenode_sub10.method2325(new BufferedStream(bs));
        }
        if (i >= 32768) {
            cachenode_sub10.method2328();
        }
        aClass61_1370.method601(cachenode_sub10, 25566, i);
        return cachenode_sub10;
    }

    Class109(Index class302, Index class302_0_, Interface14 interface14) {
        aClass61_1370 = new Class61(64);
        anInterface14_1376 = interface14;
        aClass302_1368 = class302;
        aClass302_1375 = class302_0_;
        if (aClass302_1368 != null) {
            anInt1373 = aClass302_1368.method3537(1);
        }
        if (aClass302_1375 != null) {
            anInt1369 = aClass302_1375.method3537(1);
        }
    }
}
