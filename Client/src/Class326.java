/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Calendar;

public class Class326 {
    static int anInt4089;
    protected boolean aBoolean4090;
    static int anInt4091;
    protected int anInt4092;
    private int anInt4093;
    private int anInt4094;
    static int anInt4095;
    static Index index30;
    static float[] aFloatArray4097 = {1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
    static int anInt4098;
    static int anInt4099;
    protected Node_Sub29 aNode_Sub29_4100;
    static int anInt4101;
    protected boolean aBoolean4102;
    static int anInt4103;
    private int anInt4104;
    protected short[] aShortArray4105;
    private int anInt4106;
    private int anInt4107;
    static double aDouble4108;
    static boolean aBoolean4109 = false;
    protected int anInt4110;
    static int anInt4111;

    public static void method3815() {
        aFloatArray4097 = null;
        index30 = null;

    }

    final void method3816(boolean bool, int i) {
        anInt4095++;
        int i_1_;
        while_242_:
        do {
            if (bool) {
                i_1_ = 2048;
            } else {
                int i_2_ = 0x7ff & i * anInt4104 / 50 + anInt4094;
                int i_3_ = anInt4107;
                while_241_:
                do {
                    while_240_:
                    do {
                        while_239_:
                        do {
                            do {
                                if (i_3_ == 1) {
                                    i_1_ = 1024 + (Class335.anIntArray4167[i_2_ << 3] >> 4);
                                    break while_242_;
                                } else if (i_3_ != 3) {
                                    if (i_3_ == 4) {
                                        break;
                                    } else if (i_3_ != 2) {
                                        if (i_3_ == 5) {
                                            break while_240_;
                                        }
                                        break while_241_;
                                    }
                                    break while_239_;
                                }
                                i_1_ = CacheNode_Sub20.anIntArray9628[i_2_] >> 1;
                                break while_242_;
                            } while (false);
                            i_1_ = i_2_ >> 10 << 11;
                            break while_242_;
                        } while (false);
                        i_1_ = i_2_;
                        break while_242_;
                    } while (false);
                    i_1_ = (i_2_ < 1024 ? i_2_ : 2048 - i_2_) << 1;
                    break while_242_;
                } while (false);
                i_1_ = 2048;
            }
        } while (false);
        aNode_Sub29_4100.method2712((float) ((anInt4093 * i_1_ >> 11) + anInt4106) / 2048.0F);
    }

    static int method3817(long l) {
        Node_Sub43.method2941(l);
        anInt4103++;
        return Class141.aCalendar1756.get(Calendar.YEAR);
    }

    static String method3818(long l) {
        anInt4101++;
        Node_Sub43.method2941(l);
        int i_4_ = Class141.aCalendar1756.get(Calendar.DATE);
        int i_5_ = 1 + Class141.aCalendar1756.get(Calendar.MONTH);
        int i_6_ = Class141.aCalendar1756.get(Calendar.YEAR);
        return Integer.toString(i_4_ / 10) + i_4_ % 10 + "/" + i_5_ / 10 + i_5_ % 10 + "/" + i_6_ % 100 / 10 + i_6_ % 10;
    }

    final void method3819(int i, byte b, int i_7_, int i_8_, int i_9_) {
        anInt4104 = i_9_;
        if (b != -27) {
            method3819(-113, (byte) -62, 106, 65, -59);
        }
        anInt4111++;
        anInt4106 = i;
        anInt4107 = i_7_;
        anInt4093 = i_8_;
    }

    static void method3820() {
        Class290_Sub7.aClass71_8134.method746(5, -3452);
        anInt4091++;
        r.aClass58_9578.method580();
        Class42.aClass181_643.method1828();
        Class186.aClass112_2256.method1146();
        Class366.aClass279_4526.method3369(5, -759);
        EntityNode_Sub3_Sub1.aClass86_9166.method1003();
        Class18.aClass37_306.method396();
        Class16.aClass101_228.method1094();
        IOException_Sub1.aClass128_85.method1551();
        Class188_Sub2_Sub1.aClass229_9354.method2126();
        Class336.aClass315_4173.method3657();
        Class291_Sub1.aClass13_8198.method211();
        InputStream_Sub2.aClass281_83.method3380();
        Class304.aClass215_3834.method2066();
        Node_Sub54.aClass338_7671.method3914();
        Class188_Sub2_Sub2.aClass36_9366.method391();
        Class146.aClass32_1812.method355();
        Class171.aClass278_2062.method3362();
        CacheNode_Sub6.aClass57_9480.method572();
        Class32.aClass359_508.method4038();
        Class186.aClass239_2249.method3023();
        Node_Sub9_Sub4.aClass180_9727.method1820();
        Class296.aClass186_5429.method1873();
        Packet.method2258();
        Class282.method3386();
        Class215.method2065();
        Class110.method1129();
        Class320_Sub7.method3710();
        Class125.aClass61_1609.method598(5);
        Node_Sub51.aClass61_7628.method598(5);
        Class262_Sub18.aClass61_7842.method598(5);
        CacheNode_Sub12.aClass61_9556.method598(5);
        ClientScriptsExecutor.aClass61_3867.method598(5);
    }

    private void method3821(GraphicsToolkit graphicstoolkit, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
        aNode_Sub29_4100 = graphicstoolkit.a(i_11_, i_10_, i, i_13_, i_12_, (float) 1);
        anInt4099++;
    }

    private void method3822(int i) {
        if (i != 0) {
            method3822(99);
        }
        int i_15_ = anInt4110;
        while_256_:
        do {
            while_255_:
            do {
                while_254_:
                do {
                    while_253_:
                    do {
                        while_252_:
                        do {
                            while_251_:
                            do {
                                while_250_:
                                do {
                                    while_249_:
                                    do {
                                        while_248_:
                                        do {
                                            while_247_:
                                            do {
                                                while_246_:
                                                do {
                                                    while_245_:
                                                    do {
                                                        while_244_:
                                                        do {
                                                            while_243_:
                                                            do {
                                                                do {
                                                                    if (i_15_ == 2) {
                                                                        anInt4104 = 2048;
                                                                        anInt4093 = 2048;
                                                                        anInt4107 = 1;
                                                                        anInt4106 = 0;
                                                                        break while_256_;
                                                                    } else if (i_15_ != 3) {
                                                                        if (i_15_ == 4) {
                                                                            break;
                                                                        } else if (i_15_ != 5) {
                                                                            if (i_15_ == 12) {
                                                                                break while_244_;
                                                                            } else if (i_15_ != 13) {
                                                                                if (i_15_ == 10) {
                                                                                    break while_246_;
                                                                                } else if (i_15_ != 11) {
                                                                                    if (i_15_ == 6) {
                                                                                        break while_248_;
                                                                                    } else if (i_15_ != 7) {
                                                                                        if (i_15_ == 8) {
                                                                                            break while_250_;
                                                                                        } else if (i_15_ != 9) {
                                                                                            if (i_15_ == 14) {
                                                                                                break while_252_;
                                                                                            } else if (i_15_ != 15) {
                                                                                                if (i_15_ == 16) {
                                                                                                    break while_254_;
                                                                                                }
                                                                                                break while_255_;
                                                                                            }
                                                                                            break while_253_;
                                                                                        }
                                                                                        break while_251_;
                                                                                    }
                                                                                    break while_249_;
                                                                                }
                                                                                break while_247_;
                                                                            }
                                                                            break while_245_;
                                                                        }
                                                                        break while_243_;
                                                                    }
                                                                    anInt4104 = 4096;
                                                                    anInt4106 = 0;
                                                                    anInt4093 = 2048;
                                                                    anInt4107 = 1;
                                                                    break while_256_;
                                                                } while (false);
                                                                anInt4106 = 0;
                                                                anInt4107 = 4;
                                                                anInt4093 = 2048;
                                                                anInt4104 = 2048;
                                                                break while_256_;
                                                            } while (false);
                                                            anInt4104 = 8192;
                                                            anInt4107 = 4;
                                                            anInt4106 = 0;
                                                            anInt4093 = 2048;
                                                            break while_256_;
                                                        } while (false);
                                                        anInt4107 = 2;
                                                        anInt4093 = 2048;
                                                        anInt4104 = 2048;
                                                        anInt4106 = 0;
                                                        break while_256_;
                                                    } while (false);
                                                    anInt4093 = 2048;
                                                    anInt4107 = 2;
                                                    anInt4106 = 0;
                                                    anInt4104 = 8192;
                                                    break while_256_;
                                                } while (false);
                                                anInt4093 = 512;
                                                anInt4106 = 1536;
                                                anInt4104 = 2048;
                                                anInt4107 = 3;
                                                break while_256_;
                                            } while (false);
                                            anInt4104 = 4096;
                                            anInt4107 = 3;
                                            anInt4106 = 1536;
                                            anInt4093 = 512;
                                            break while_256_;
                                        } while (false);
                                        anInt4106 = 1280;
                                        anInt4104 = 2048;
                                        anInt4107 = 3;
                                        anInt4093 = 768;
                                        break while_256_;
                                    } while (false);
                                    anInt4107 = 3;
                                    anInt4106 = 1280;
                                    anInt4093 = 768;
                                    anInt4104 = 4096;
                                    break while_256_;
                                } while (false);
                                anInt4104 = 2048;
                                anInt4106 = 1024;
                                anInt4107 = 3;
                                anInt4093 = 1024;
                                break while_256_;
                            } while (false);
                            anInt4104 = 4096;
                            anInt4106 = 1024;
                            anInt4093 = 1024;
                            anInt4107 = 3;
                            break while_256_;
                        } while (false);
                        anInt4107 = 1;
                        anInt4093 = 768;
                        anInt4104 = 2048;
                        anInt4106 = 1280;
                        break while_256_;
                    } while (false);
                    anInt4107 = 1;
                    anInt4093 = 512;
                    anInt4106 = 1536;
                    anInt4104 = 4096;
                    break while_256_;
                } while (false);
                anInt4107 = 1;
                anInt4104 = 8192;
                anInt4106 = 1792;
                anInt4093 = 256;
                break while_256_;
            } while (false);
            anInt4106 = 0;
            anInt4093 = 2048;
            anInt4107 = 0;
            anInt4104 = 2048;
        } while (false);
        anInt4089++;
    }

    protected Class326() {
        if (CacheNode_Sub20.anIntArray9628 == null) {
            Class181.method1826((byte) -17);
        }
        method3822(0);
    }

    Class326(GraphicsToolkit graphicstoolkit, BufferedStream buffer) {
        if (CacheNode_Sub20.anIntArray9628 == null) {
            Class181.method1826((byte) -115);
        }
        anInt4092 = buffer.readUnsignedByte();
        aBoolean4090 = (0x10 & anInt4092) != 0;
        aBoolean4102 = (anInt4092 & 0x8) != 0;
        anInt4092 = 0x7 & anInt4092;
        int i_16_ = buffer.readUnsignedShort() << 2;
        int i_17_ = buffer.readUnsignedShort() << 2;
        int i_18_ = buffer.readUnsignedShort() << 2;
        int i_19_ = buffer.readUnsignedByte();
        int i_20_ = 2 * i_19_ + 1;
        aShortArray4105 = new short[i_20_];
        for (int i_21_ = 0; i_21_ < aShortArray4105.length; i_21_++) {
            int i_22_ = (short) buffer.readUnsignedShort();
            int i_23_ = i_22_ >>> 8;
            if (i_20_ <= i_23_) {
                i_23_ = -1 + i_20_;
            }
            int i_24_ = i_22_ & 0xff;
            if (-i_23_ + i_20_ < i_24_) {
                i_24_ = i_20_ - i_23_;
            }
            aShortArray4105[i_21_] = (short) Node_Sub16.method2590(i_24_, i_23_ << 8);
        }
        i_19_ = (i_19_ << Class36.anInt549) + Class135.anInt1692;
        int i_25_ = Class85.anIntArray1158 != null ? Class85.anIntArray1158[buffer.readUnsignedShort()] : Class170.anIntArray2054[0xffff & Node_Sub15_Sub2.method2560(buffer.readUnsignedShort())];
        int i_26_ = buffer.readUnsignedByte();
        anInt4094 = 0x700 & i_26_ << 3;
        anInt4110 = i_26_ & 0x1f;
        if (anInt4110 != 31) {
            method3822(0);
        }
        method3821(graphicstoolkit, i_17_, i_18_, i_16_, i_25_, i_19_);
    }
}
