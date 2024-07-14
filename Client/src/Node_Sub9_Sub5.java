/* Node_Sub9_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub9_Sub5 extends Node_Sub9 {
    static int anInt9741;
    static int anInt9742;
    static int anInt9743;
    private final int anInt9744;
    static int anInt9745;
    static int anInt9746;
    static int anInt9747;
    static int anInt9748;
    static int anInt9749;
    static IncommingPacket aClass192_9750 = new IncommingPacket(0, 6);
    private final Class312 aClass312_9751 = new Class312();
    static int anInt9752;
    static int anInt9753;
    static int anInt9754;
    static int anInt9755;
    static int anInt9756;
    static int anInt9757;
    static int anInt9758;
    private boolean aBoolean9759;
    private int anInt9760;
    private int anInt9761 = 0;
    private int anInt9762;
    private int anInt9763 = 256;
    static int anInt9764;
    static float[] aFloatArray9765 = new float[16];
    static int anInt9766 = 0;
    static int anInt9767;
    private boolean aBoolean9768;

    final synchronized double method2526() {
        anInt9752++;
        if (anInt9761 < 1) {
            return -1.0;
        }
        CacheNode_Sub8 cachenode_sub8 = (CacheNode_Sub8) aClass312_9751.method3613();
        if (cachenode_sub8 == null) {
            return -1.0;
        }
        return cachenode_sub8.aDouble9495 - (double) ((float) cachenode_sub8.aShortArrayArray9491[0].length / (float) Class365.anInt4523);
    }

    public static void method2527() {
        aClass192_9750 = null;
        aFloatArray9765 = null;
    }

    static void method2528() {
        anInt9754++;
        Class217.aBoolean2552 = true;
    }

    final Node_Sub9 method2431() {
        anInt9746++;
        return null;
    }

    final synchronized int method2529() {
        anInt9747++;
        return anInt9761;
    }

    final synchronized void method2530() {
        anInt9749++;
        aBoolean9768 = true;
    }

    final synchronized void method2426(int i) {
        anInt9755++;
        if (!aBoolean9759) {
            for (; ; ) {
                CacheNode_Sub8 cachenode_sub8 = method2534();
                if (cachenode_sub8 == null) {
                    if (aBoolean9768) {
                        this.method2160();
                        Node_Sub38_Sub16.aClass335_10268.method3852((byte) 121);
                    }
                    break;
                }
                if (i < -anInt9762 + cachenode_sub8.aShortArrayArray9491[0].length) {
                    anInt9762 += i;
                    break;
                }
                i -= cachenode_sub8.aShortArrayArray9491[0].length - anInt9762;
                method2533((byte) 92);
            }
        }
    }

    final CacheNode_Sub8 method2531(int i, double d) {
        anInt9743++;
        long l = i | anInt9744;
        CacheNode_Sub8 cachenode_sub8 = (CacheNode_Sub8) Node_Sub38_Sub16.aClass335_10268.method3849(l);
        if (cachenode_sub8 == null) {
            cachenode_sub8 = new CacheNode_Sub8(new short[anInt9744][i], d);
        } else {
            cachenode_sub8.aDouble9495 = d;
            Node_Sub38_Sub16.aClass335_10268.method3851(16384, l);
        }
        return cachenode_sub8;
    }

    final synchronized void method2532(CacheNode_Sub8 cachenode_sub8) {
        anInt9741++;
        for (/**/; anInt9761 >= 100; anInt9761--)
            aClass312_9751.method3619(-101);
        aClass312_9751.method3625(cachenode_sub8);
        anInt9761++;
    }

    private synchronized void method2533(byte b) {
        anInt9748++;
        CacheNode_Sub8 cachenode_sub8 = method2534();
        if (cachenode_sub8 != null) {
            cachenode_sub8.method2160();
            anInt9761--;
            anInt9762 = 0;

            Node_Sub38_Sub16.aClass335_10268.method3848((byte) -128, cachenode_sub8, cachenode_sub8.method2319());
        }
    }

    final int method2428() {
        anInt9756++;
        return 1;
    }

    final Node_Sub9 method2429() {
        anInt9745++;
        return null;
    }

    private synchronized CacheNode_Sub8 method2534() {
        anInt9758++;
        return (CacheNode_Sub8) aClass312_9751.method3613();
    }

    final synchronized void method2535(boolean bool) {
        anInt9764++;
        aBoolean9759 = bool;
    }

    final void method2536(int i) {
        anInt9763 = i;
        anInt9753++;
        anInt9760 = i;
    }

    final synchronized void method2427(int[] is, int i, int i_1_) {
        anInt9742++;
        if (!aBoolean9759) {
            if (method2534() == null) {
                if (aBoolean9768) {
                    this.method2160();
                    Node_Sub38_Sub16.aClass335_10268.method3852((byte) 110);
                }
            } else {
                int i_2_ = i_1_ + i;
                if (DrawableModel.aBoolean913) {
                    i_2_ <<= 1;
                }
                int i_3_ = 0;
                int i_4_ = 0;
                if (anInt9744 == 2) {
                    i_4_ = 1;
                }
                while (i_2_ > i) {
                    CacheNode_Sub8 cachenode_sub8 = method2534();
                    if (cachenode_sub8 == null) {
                        break;
                    }
                    short[][] ses = cachenode_sub8.aShortArrayArray9491;
                    while (i_2_ > i) {
                        if (anInt9762 >= ses[0].length) {
                            break;
                        }
                        if (DrawableModel.aBoolean913) {
                            is[i++] = ses[i_3_][anInt9762] * anInt9760;
                            is[i++] = anInt9763 * ses[i_4_][anInt9762];
                        } else {
                            is[i++] += anInt9763 * ses[i_4_][anInt9762] + ses[i_3_][anInt9762] * anInt9760;
                        }
                        anInt9762++;
                    }
                    if (ses[0].length <= anInt9762) {
                        method2533((byte) -84);
                    }
                }
            }
        }
    }

    Node_Sub9_Sub5(int i) {
        anInt9760 = 256;
        anInt9744 = i;
    }
}
