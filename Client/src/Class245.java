/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

public class Class245 {
    static Class119 aClass119_3085;
    private int anInt3086;
    private int anInt3087;
    private final Class263 aClass263_3088;
    static int anInt3089;
    private Interface15_Impl1 anInterface15_Impl1_3090;
    static int anInt3091;
    static int anInt3092;
    private Interface13_Impl1 anInterface13_Impl1_3093;
    static int anInt3094;
    private final int anInt3095;
    private final int anInt3096;
    private int anInt3097;
    private final AbstractToolkit anAbstractToolkit3098;
    protected boolean aBoolean3099 = true;
    protected int anInt3100;
    static OutcommingPacket aClass318_3101 = new OutcommingPacket(30, -1);
    static int anInt3102;

    public static void method3066() {
        aClass119_3085 = null;
        aClass318_3101 = null;
    }

    final void method3067(Interface15_Impl1 interface15_impl1, int i_0_) {
        if (i_0_ > 0) {
            method3068();
            anAbstractToolkit3098.method1312(anInterface13_Impl1_3093);
            anAbstractToolkit3098.method1276(anInt3087, (byte) -108, 0, interface15_impl1, anInt3086 - anInt3087 + 1, Class55.aClass104_833, i_0_);
        }
        anInt3092++;
    }

    private void method3068() {
        anInt3094++;
        if (aBoolean3099) {
            aBoolean3099 = false;
            byte[] bs = aClass263_3088.aByteArray3343;
            int i = 0;
            int i_1_ = aClass263_3088.anInt3347;
            int i_2_ = anInt3096 + anInt3095 * aClass263_3088.anInt3347;
            for (int i_3_ = -128; i_3_ < 0; i_3_++) {
                i = (i << 8) - i;
                for (int i_4_ = -128; i_4_ < 0; i_4_++) {
                    if (bs[i_2_++] != 0) {
                        i++;
                    }
                }
                i_2_ += i_1_ - 128;
            }
            if (anInterface13_Impl1_3093 != null && anInt3097 == i) {
            } else {
                anInt3097 = i;
                int i_5_ = 0;
                i_2_ = anInt3095 * i_1_ + anInt3096;
                if (anAbstractToolkit3098.method1295(Node_Sub52.aClass68_7639, Class372.aClass372_4594)) {
                    if (Class201.aByteArray2442 == null) {
                        Class201.aByteArray2442 = new byte[16384];
                    }
                    byte[] bs_9_ = Class201.aByteArray2442;
                    for (int i_10_ = -128; i_10_ < 0; i_10_++) {
                        for (int i_11_ = -128; i_11_ < 0; i_11_++) {
                            if (bs[i_2_] == 0) {
                                int i_12_ = 0;
                                if (bs[-1 + i_2_] != 0) {
                                    i_12_++;
                                }
                                if (bs[1 + i_2_] != 0) {
                                    i_12_++;
                                }
                                if (bs[-i_1_ + i_2_] != 0) {
                                    i_12_++;
                                }
                                if (bs[i_2_ + i_1_] != 0) {
                                    i_12_++;
                                }
                                bs_9_[i_5_++] = (byte) (17 * i_12_);
                            } else {
                                bs_9_[i_5_++] = (byte) 68;
                            }
                            i_2_++;
                        }
                        i_2_ += aClass263_3088.anInt3347 - 128;
                    }
                    if (anInterface13_Impl1_3093 == null) {
                        anInterface13_Impl1_3093 = anAbstractToolkit3098.method1252(128, Class201.aByteArray2442, Node_Sub52.aClass68_7639, 128, false);
                        anInterface13_Impl1_3093.method51(false, false, false);
                    } else {
                        anInterface13_Impl1_3093.method50(0, 128, 128, -15178, Class201.aByteArray2442, 0, Node_Sub52.aClass68_7639, 0, 128);
                    }
                } else {
                    if (Class262_Sub15_Sub1.anIntArray10523 == null) {
                        Class262_Sub15_Sub1.anIntArray10523 = new int[16384];
                    }
                    int[] is = Class262_Sub15_Sub1.anIntArray10523;
                    for (int i_6_ = -128; i_6_ < 0; i_6_++) {
                        for (int i_7_ = -128; i_7_ < 0; i_7_++) {
                            if (bs[i_2_] == 0) {
                                int i_8_ = 0;
                                if (bs[-1 + i_2_] != 0) {
                                    i_8_++;
                                }
                                if (bs[i_2_ + 1] != 0) {
                                    i_8_++;
                                }
                                if (bs[i_2_ - i_1_] != 0) {
                                    i_8_++;
                                }
                                if (bs[i_2_ + i_1_] != 0) {
                                    i_8_++;
                                }
                                is[i_5_++] = i_8_ * 17 << 24;
                            } else {
                                is[i_5_++] = 1140850688;
                            }
                            i_2_++;
                        }
                        i_2_ += -128 + aClass263_3088.anInt3347;
                    }
                    if (anInterface13_Impl1_3093 == null) {
                        anInterface13_Impl1_3093 = anAbstractToolkit3098.method1258(false, 128, 128, Class262_Sub15_Sub1.anIntArray10523);
                        anInterface13_Impl1_3093.method51(false, false, false);
                    } else {
                        anInterface13_Impl1_3093.method47(Class262_Sub15_Sub1.anIntArray10523, 0, 0, 128, 23110, 128, 0, 128);
                    }
                }
            }
        }
    }

    static void method3069(boolean bool) {
        anInt3091++;
        if (bool) {
            if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
                Node_Sub15_Sub6.method2571(Class320_Sub15.WINDOWS_PANE_ID);
            }
            for (Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516(); node_sub2 != null; node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1520(114)) {
                if (node_sub2.aNode2799 == null) {
                    node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516();
                    if (node_sub2 == null) {
                        break;
                    }
                }
                Class243.method3060(false, true, node_sub2);
            }
            Class320_Sub15.WINDOWS_PANE_ID = -1;
            Class289.aHashTable3630 = new HashTable(8);
            EntityNode_Sub3_Sub2.method946();
            Class320_Sub15.WINDOWS_PANE_ID = CacheNode_Sub4.aClass1_9466.anInt120;
            Node_Sub29_Sub3.method2717(false);
            Class320_Sub21.method3764(-115);
            ClientScriptsExecutor.parseIComponentScript(Class320_Sub15.WINDOWS_PANE_ID);
        }
        Class160.method1726();
        Class248.aBoolean3146 = false;
        Class132.method1563();
        Class239.anInt2928 = -1;
        Class60.method594(6, Animable_Sub4_Sub1.anInt10687);
        Class295.myPlayer = new Player();
        Class295.myPlayer.anInt5940 = 512 * Class377_Sub1.GAME_SCENE_HEIGHT / 2;
        Class295.myPlayer.anInt5934 = 512 * Node_Sub54.GAME_SCENE_WDITH / 2;
        Class295.myPlayer.scenePositionXQueue[0] = Node_Sub54.GAME_SCENE_WDITH / 2;
        Class98.anInt5061 = Node_Sub10.anInt7079 = 0;
        Class295.myPlayer.scenePositionYQueue[0] = Class377_Sub1.GAME_SCENE_HEIGHT / 2;
        if (Class320_Sub22.anInt8415 == 2) {
            Node_Sub10.anInt7079 = Node_Sub38_Sub38.anInt10490 << 9;
            Class98.anInt5061 = Renderer.anInt3663 << 9;
        } else {
            Class309.method3586();
        }
        Class120.method1228();
    }

    final void method3070() {
        method3067(anInterface15_Impl1_3090, anInt3100);
        anInt3089++;
    }

    Class245(AbstractToolkit abstracttoolkit, Class263 class263, StandardPlane standardplane, int i, int i_13_, int i_14_, int i_15_, int i_16_) {
        anInt3097 = -1;
        anInt3095 = i_16_;
        anAbstractToolkit3098 = abstracttoolkit;
        anInt3096 = i_15_;
        aClass263_3088 = class263;
        int i_17_ = 1 << i_14_;
        int i_18_ = 0;
        int i_19_ = i << i_14_;
        int i_20_ = i_13_ << i_14_;
        for (int i_21_ = 0; i_17_ > i_21_; i_21_++) {
            int i_22_ = i_19_ + (i_21_ + i_20_) * standardplane.anInt3408;
            for (int i_23_ = 0; i_17_ > i_23_; i_23_++) {
                short[] ses = standardplane.aShortArrayArray7985[i_22_++];
                if (ses != null) {
                    i_18_ += ses.length;
                }
            }
        }
        if (i_18_ > 0) {
            anInt3086 = -2147483648;
            anInt3087 = 2147483647;
            anInterface15_Impl1_3090 = anAbstractToolkit3098.method1346(false);
            anInterface15_Impl1_3090.method56(-1696, i_18_);
            for (int i_24_ = 0; i_24_ < 4; i_24_++) {
                jaclib.memory.Buffer buffer = anInterface15_Impl1_3090.method54(true, (byte) 99);
                if (buffer != null) {
                    Stream stream = anAbstractToolkit3098.method1324(buffer);
                    if (Stream.b()) {
                        for (int i_25_ = 0; i_17_ > i_25_; i_25_++) {
                            int i_26_ = standardplane.anInt3408 * (i_25_ + i_20_) + i_19_;
                            for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
                                short[] ses = standardplane.aShortArrayArray7985[i_26_++];
                                if (ses != null) {
                                    for (short se : ses) {
                                        int i_29_ = se & 0xffff;
                                        if (anInt3087 > i_29_) {
                                            anInt3087 = i_29_;
                                        }
                                        if (anInt3086 < i_29_) {
                                            anInt3086 = i_29_;
                                        }
                                        stream.b(i_29_);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int i_30_ = 0; i_17_ > i_30_; i_30_++) {
                            int i_31_ = (i_30_ + i_20_) * standardplane.anInt3408 + i_19_;
                            for (int i_32_ = 0; i_17_ > i_32_; i_32_++) {
                                short[] ses = standardplane.aShortArrayArray7985[i_31_++];
                                if (ses != null) {
                                    for (short se : ses) {
                                        int i_34_ = se & 0xffff;
                                        if (anInt3086 < i_34_) {
                                            anInt3086 = i_34_;
                                        }
                                        if (anInt3087 > i_34_) {
                                            anInt3087 = i_34_;
                                        }
                                        stream.c(i_34_);
                                    }
                                }
                            }
                        }
                    }
                    stream.c();
                    if (anInterface15_Impl1_3090.method53(-3308)) {
                        break;
                    }
                }
            }
            anInt3100 = i_18_ / 3;
        } else {
            anInterface13_Impl1_3093 = null;
            anInt3100 = 0;
        }
    }
}
