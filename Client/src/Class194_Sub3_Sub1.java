/* Class194_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194_Sub3_Sub1 extends Class194_Sub3 {
    static int anInt9371;
    static int anInt9372;
    static OutcommingPacket aClass318_9373 = new OutcommingPacket(69, 9);
    static int anInt9374;
    static boolean aBoolean9375 = false;
    static int anInt9376;
    static Class241 aClass241_9377;
    static boolean aBoolean9378 = false;

    static void method1979(int i) {
        anInt9374++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 14, i);
        cachenode_sub2.method2291();
    }

    static boolean method1980(Class123 class123) {
        anInt9371++;
        try {
            return FloatBuffer.method2249(class123);
        } catch (java.io.IOException ioexception) {
            if (Class151.anInt1843 == 9) {
                class123.aClass365_1557 = null;
                return false;
            }
            Class262_Sub13.method3182();
            return true;
        } catch (Exception exception) {
            StringBuilder string = new StringBuilder("T2 - " + (class123.incomming_packet == null ? -1 : class123.incomming_packet.method1953(102)) + "," + (class123.aClass192_1582 != null ? class123.aClass192_1582.method1953(62) : -1) + "," + (class123.aClass192_1573 == null ? -1 : class123.aClass192_1573.method1953(112)) + " - " + class123.anInt1581 + "," + (Node_Sub53.gameSceneBaseX + Class295.myPlayer.scenePositionXQueue[0]) + "," + (Class320_Sub4.gameSceneBaseY + Class295.myPlayer.scenePositionYQueue[0]) + " - ");
            for (int i_0_ = 0; class123.anInt1581 > i_0_; i_0_++) {
                if (i_0_ >= 50) {
                    break;
                }
                string.append(class123.aPacket1570.buffer[i_0_]).append(",");
            }
            ClanChat.method507(exception, string.toString(), -114);
            Class127.method1542(false);
            return true;
        }
    }

    public static void method1981() {
        aClass318_9373 = null;
        aClass241_9377 = null;
    }

    static void method1982() {
        try {
            anInt9372++;
            for (Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1516(); node_sub3 != null; node_sub3 = (Node_Sub3) Class56.aHashTable839.method1520(106)) {
                if (node_sub3.aClass189_Sub1_6943.method1920()) {
                    Renderer.method3446(node_sub3.anInt6947);
                } else {
                    node_sub3.aClass189_Sub1_6943.method1937(109);
                    try {
                        node_sub3.aClass189_Sub1_6943.method1922();
                    } catch (Exception exception) {
                        ClanChat.method507(exception, "TV: " + node_sub3.anInt6947, -127);
                        Renderer.method3446(node_sub3.anInt6947);
                    }
                    if (!node_sub3.aBoolean6942 && !node_sub3.aBoolean6946) {
                        Node_Sub25_Sub1 node_sub25_sub1 = node_sub3.aClass189_Sub1_6943.method1932();
                        if (node_sub25_sub1 != null) {
                            Node_Sub9_Sub5 node_sub9_sub5 = node_sub25_sub1.method2658();
                            if (node_sub9_sub5 != null) {
                                node_sub9_sub5.method2536(node_sub3.anInt6941);
                                Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub5);
                                node_sub3.aBoolean6942 = true;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class126.method1537(runtimeexception, "hfa.J(" + 0 + ')');
        }
    }
}
