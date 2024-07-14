/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class119 {
    private boolean aBoolean1480;
    private int anInt1481;
    static int anInt1482;
    private final Class182[] aClass182Array1483;
    private final Class182[] aClass182Array1484;
    private int anInt1485;
    static int anInt1486;
    private byte[] aByteArray1487;
    private final int anInt1488;
    private int anInt1489;
    private GLSprite aGLSprite1490;
    private final int anInt1491;
    private int anInt1492;
    private final int anInt1493;
    private int anInt1494;
    private int anInt1495;
    static int anInt1496;
    static IncommingPacket aClass192_1497 = new IncommingPacket(55, 2);
    static int anInt1498;
    private Class119 aClass119_1499;
    private boolean aBoolean1500 = true;
    private final int anInt1501;
    private final int anInt1502;
    static int anInt1503;
    private DrawableModel aDrawableModel1504;
    private final Class182 aClass182_1505;
    private int anInt1506;
    private int anInt1507;
    static int anInt1508;
    static int anInt1509;
    static int anInt1510;
    static int anInt1511;
    private final int anInt1512;
    static int anInt1513;
    static int anInt1514;
    static Class346 aClass346_1515 = new Class346();
    static int[] anIntArray1516 = new int[3];

    final void method1216(int i, GraphicsToolkit graphicstoolkit, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt1514++;
        int i_9_ = 0;
        if (aBoolean1480) {
            i_9_ = anInt1506;
        }
        if (aClass119_1499 == null) {
            method1218(i_3_, i_6_, i_4_, graphicstoolkit, true, i_2_, i_1_, i_5_, i_0_, i_9_, i_7_, i);
        } else {
            Class119 class119_10_ = this;
            Class119 class119_11_ = aClass119_1499;
            if (class119_10_.hashCode() > class119_11_.hashCode()) {
                i_9_ = 255 - i_9_;
                class119_11_ = this;
                class119_10_ = aClass119_1499;
            }
            class119_10_.method1218(i_3_, i_6_, i_4_, graphicstoolkit, true, i_2_, i_1_, i_5_, i_0_, i_9_, i_7_, i);
            class119_11_.method1218(i_3_, i_6_, i_4_, graphicstoolkit, false, i_2_, i_1_, i_5_, i_0_, -i_9_ + 255, i_7_, i);
        }
    }

    final void method1217(int i, int i_12_) {
        anInt1482++;
        anInt1506 = anInt1489 + (i - anInt1489) * i_12_ / 255;
    }

    private void method1218(int i, int i_14_, int i_15_, GraphicsToolkit graphicstoolkit, boolean bool, int i_17_, int i_18_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
        anInt1486++;
        int i_25_ = 255 - i_22_;
        if (aDrawableModel1504 == null) {
            i_21_ = 0x3fff & i_21_ + i_14_;
            graphicstoolkit.ya();
            if (anInt1491 == -1 || anInt1507 == 0) {
                graphicstoolkit.aa(i_20_, i_24_, i_18_, i_15_, i_25_ << 24 | i_17_, 1);
            } else {
                Class91 class91 = Class376.aD4661.method10(anInt1491, -8217);
                if (aGLSprite1490 == null && Class376.aD4661.method7(9900, anInt1491)) {
                    int[] is = class91.anInt1226 == 2 ? Class376.aD4661.method8(0.7F, anInt1491, anInt1507, false, false, anInt1507) : Class376.aD4661.method11(anInt1507, false, anInt1507, anInt1491, (byte) 0, 0.7F);
                    anInt1481 = is[0];
                    anInt1495 = is[is.length - 1];
                    aGLSprite1490 = graphicstoolkit.method1235(anInt1507, anInt1507, anInt1507, is);
                }
                int i_26_ = i_25_ != 255 ? 1 : class91.anInt1226 != 2 ? 0 : 1;
                if (i_26_ == 1 && bool) {
                    graphicstoolkit.aa(i_20_, i_24_, i_18_, i_15_, i_17_, 0);
                }
                if (aGLSprite1490 != null) {
                    int i_27_ = i_15_ * i_23_ / -4096;
                    int i_28_;
                    for (i_28_ = i_21_ * i_15_ / 4096 + (i_18_ - i_15_) / 2; i_28_ > i_15_; i_28_ -= i_15_) {
                        /* empty */
                    }
                    for (/**/; i_28_ < 0; i_28_ = i_28_ + i_15_) {
                        /* empty */
                    }
                    if (anInt1502 == 1) {
                        for (int i_29_ = -i_15_ + i_28_; i_18_ > i_29_; i_29_ = i_29_ + i_15_)
                            aGLSprite1490.method1199(i_20_ + i_29_, i_27_ + i_24_, i_15_, i_15_, 0, 0xffffff | i_25_ << 24, i_26_);
                        if ((-16777216 & anInt1481) != 0) {
                            graphicstoolkit.method1239(i_18_, i_27_ - (-i_24_ - 1), 0, 0, anInt1481);
                        }
                        if ((-16777216 & anInt1495) != 0) {
                            graphicstoolkit.method1239(i_18_, i_15_ - (i_15_ + i_27_) - i_24_, i_15_ + (i_24_ + i_27_), 0, anInt1495);
                        }
                    } else {
                        for (/**/; i_27_ > i_15_; i_27_ -= i_15_) {
                            /* empty */
                        }
                        for (/**/; i_27_ < 0; i_27_ += i_15_) {
                            /* empty */
                        }
                        for (int i_30_ = -i_15_ + i_28_; i_30_ < i_18_; i_30_ += i_15_) {
                            for (int i_31_ = i_27_ - i_15_; i_15_ > i_31_; i_31_ += i_15_)
                                aGLSprite1490.method1199(i_20_ + i_30_, i_31_ + i_24_, i_15_, i_15_, 0, 0xffffff | i_25_ << 24, i_26_);
                        }
                    }
                }
            }
        } else {
            if (bool) {
                graphicstoolkit.GA(i_17_);
                graphicstoolkit.ya();
            }
            method1221(i_21_, i_22_, i_23_, i, graphicstoolkit);
        }
        for (int i_32_ = anInt1492 - 1; i_32_ >= 0; i_32_--)
            aClass182Array1484[i_32_].method1838(graphicstoolkit, i_18_, i_15_, anInt1512, anInt1493, anInt1488, i_25_);
        graphicstoolkit.ya();
    }

    final void method1219(GraphicsToolkit graphicstoolkit, int i_34_, int i_36_, int i_37_, int i_39_, int i_40_, int i_41_) {
        method1216(i_34_, graphicstoolkit, i_40_, i_37_, 0, 0, i_41_, i_36_, 0, i_39_);
        anInt1511++;
    }

    final void method1220(Class119 class119_43_) {
        anInt1510++;
        if (aBoolean1480) {
            anInt1489 = anInt1506;
        } else if (class119_43_ == null || !class119_43_.aBoolean1480) {
            anInt1489 = 0;
        } else {
            anInt1489 = 255 - class119_43_.anInt1506;
        }
        anInt1506 = 0;
        aBoolean1480 = true;
        aClass119_1499 = class119_43_;
    }

    private void method1221(int i, int i_44_, int i_45_, int i_46_, GraphicsToolkit graphicstoolkit) {
        anInt1498++;
        Class336 class336 = graphicstoolkit.n().method3858();
        Class336 class336_48_ = graphicstoolkit.y();
        class336_48_.method3854(0, 0, 0);
        class336_48_.method3856(i & 0x3fff);
        class336_48_.method3859(0x3fff & i_45_);
        class336_48_.method3868(16383 & i_46_);
        graphicstoolkit.a(class336_48_);
        Class336 class336_49_ = graphicstoolkit.y();
        class336_49_.method3862();
        if (anInt1485 != i_44_) {
            aDrawableModel1504.method636((byte) i_44_, aByteArray1487);
            anInt1485 = i_44_;
        }
        aDrawableModel1504.method611(class336_49_, null, 0);
        graphicstoolkit.a(class336);
    }

    final boolean method1222() {
        anInt1508++;
        return aBoolean1480;
    }

    private void method1223(GraphicsToolkit graphicstoolkit) {
        try {
            Index class302 = Class188_Sub2_Sub2.aClass302_9361;
            boolean bool = class302.method3536(anInt1501);
            if (bool) {
                graphicstoolkit.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                Model model = Renderer.method3448(anInt1501, 7, Class188_Sub2_Sub2.aClass302_9361);
                aDrawableModel1504 = graphicstoolkit.a(model, 1099776, 0, 255, 1);
                byte[] bs = aDrawableModel1504.method627();
                if (bs == null) {
                    aByteArray1487 = null;
                } else {
                    aByteArray1487 = new byte[bs.length];
                    Class311.method3608(bs, 0, aByteArray1487, 0, bs.length);
                }
            }
        } catch (Exception exception) {
            /* empty */
        }
        anInt1513++;
    }

    final Class119 method1224() {
        anInt1503++;
        return aClass119_1499;
    }

    final boolean method1225(int i, int i_51_, GraphicsToolkit graphicstoolkit) {
        if (i_51_ != anInt1494) {
            anInt1494 = i_51_;
            int i_52_ = Class215.method2072(i_51_);
            if (i_52_ > 512) {
                i_52_ = 512;
            }
            if (i_52_ <= 0) {
                i_52_ = 1;
            }
            if (anInt1507 != i_52_) {
                anInt1507 = i_52_;
                aGLSprite1490 = null;
            }
            if (aClass182Array1483 != null) {
                anInt1492 = 0;
                int[] is = new int[aClass182Array1483.length];
                for (Class182 class182 : aClass182Array1483) {
                    if (class182.method1839(anInt1512, anInt1493, anInt1488, anInt1494)) {
                        is[anInt1492] = class182.anInt2166;
                        aClass182Array1484[anInt1492++] = class182;
                    }
                }
                Class238.method3019(anInt1492 - 1, 0, is, aClass182Array1484);
            }
            aBoolean1500 = true;
        }
        anInt1509++;
        boolean bool = false;
        if (aBoolean1500) {
            aBoolean1500 = false;
            for (int i_54_ = anInt1492 - 1; i_54_ >= 0; i_54_--) {
                boolean bool_55_ = aClass182Array1484[i_54_].method1833(graphicstoolkit, aClass182_1505);
                Class119 class119_56_ = this;
                class119_56_.aBoolean1500 = class119_56_.aBoolean1500 | !bool_55_;
                bool |= bool_55_;
            }
        }
        if (i == 0 || !graphicstoolkit.a()) {
            aDrawableModel1504 = null;
        } else if (aDrawableModel1504 == null && anInt1501 >= 0) {
            method1223(graphicstoolkit);
        }
        if (aClass119_1499 != null && this != aClass119_1499) {
            aClass119_1499.method1226();
            bool |= aClass119_1499.method1225(i, i_51_, graphicstoolkit);
        }
        return bool;
    }

    final void method1226() {
        aBoolean1480 = false;
        anInt1496++;
        anInt1506 = 0;
        aClass119_1499 = null;
    }

    Class119(int i, Class182[] class182s, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
        anInt1494 = -1;
        anInt1493 = i_60_;
        anInt1502 = i_62_;
        aClass182Array1483 = class182s;
        anInt1488 = i_61_;
        anInt1512 = i_59_;
        anInt1491 = i;
        if (class182s == null) {
            aClass182Array1484 = null;
            aClass182_1505 = null;
        } else {
            aClass182Array1484 = new Class182[class182s.length];
            aClass182_1505 = i_58_ < 0 ? null : class182s[i_58_];
        }
        anInt1501 = i_63_;
    }

    public static void method1227() {
        anIntArray1516 = null;
        aClass192_1497 = null;
        aClass346_1515 = null;
    }
}
