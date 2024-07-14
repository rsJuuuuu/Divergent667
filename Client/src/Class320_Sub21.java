/* Class320_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class320_Sub21 extends Class320 {
    static boolean[] aBooleanArray8403;
    static int anInt8404;
    static int anInt8405;
    static int anInt8406 = 0;
    static int anInt8407;
    static int anInt8408;
    static int anInt8409;
    static int anInt8410;
    static int anInt8411;
    static int anInt8412;
    static int anInt8413;

    Class320_Sub21(int i, Node_Sub27 node_sub27) {
        super(i, node_sub27);
    }

    public static void method3759() {
        aBooleanArray8403 = null;
    }

    final void method3676(int i) {
        anInt4064 = i;
        anInt8407++;
    }

    static void method3760(GraphicsToolkit graphicstoolkit) {
        CacheNode_Sub18.aClass52_9609 = Class171.method1792(true, true, Node_Sub50.anInt7625, -115, graphicstoolkit);
        anInt8408++;
        Class85.aClass357_1159 = Class150_Sub2.method1660(Node_Sub50.anInt7625, graphicstoolkit);
        StandardSprite.aClass52_8945 = Class171.method1792(true, true, Class285.anInt3600, -101, graphicstoolkit);
        Class169_Sub3.aClass357_8820 = Class150_Sub2.method1660(Class285.anInt3600, graphicstoolkit);
        Class262_Sub4.aClass52_7721 = Class171.method1792(true, true, Class340.anInt4220, -108, graphicstoolkit);
        Class262_Sub15_Sub1.aClass357_10524 = Class150_Sub2.method1660(Class340.anInt4220, graphicstoolkit);
    }

    static Class169_Sub2_Sub1 method3761(int i, byte[] bs, GLToolkit gltoolkit, int i_3_) {
        anInt8409++;
        if (gltoolkit.aBoolean6652 || Class371.method4094(i_3_) && Class371.method4094(i)) {
            return new Class169_Sub2_Sub1(gltoolkit, 3553, i_3_, i, bs);
        }
        if (!gltoolkit.aBoolean6649) {
            return new Class169_Sub2_Sub1(gltoolkit, i_3_, i, Class320_Sub19.method3753(i_3_), Class320_Sub19.method3753(i), bs);
        }
        return new Class169_Sub2_Sub1(gltoolkit, 34037, i_3_, i, bs);
    }

    Class320_Sub21(Node_Sub27 node_sub27) {
        super(node_sub27);
    }

    final void method3673(byte b) {
        if (b >= -35) {
            method3759();
        }
        anInt8410++;
    }

    final int method3762() {
        anInt8412++;
        return anInt4064;
    }

    final int method3675(int i, byte b) {
        if (b != 54) {
            return -123;
        }
        anInt8405++;
        return 1;
    }

    final int method3677(int i) {
        anInt8413++;
        if (i != 0) {
            return -123;
        }
        if (Objects.requireNonNull(aNode_Sub27_4063.method2694(i - 13725)).method1881() > 1) {
            return 4;
        }
        return 2;
    }

    static byte[] method3763(String string) {
        anInt8404++;
        int i_4_ = string.length();
        byte[] bs = new byte[i_4_];
        for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
            int i_7_ = string.charAt(i_6_);
            if ((i_7_ == 0 || i_7_ >= 128) && (i_7_ < 160 || i_7_ > 255)) {
                if (i_7_ == 8364) {
                    bs[i_6_] = (byte) -128;
                } else if (i_7_ == 8218) {
                    bs[i_6_] = (byte) -126;
                } else if (i_7_ == 402) {
                    bs[i_6_] = (byte) -125;
                } else if (i_7_ == 8222) {
                    bs[i_6_] = (byte) -124;
                } else if (i_7_ == 8230) {
                    bs[i_6_] = (byte) -123;
                } else if (i_7_ == 8224) {
                    bs[i_6_] = (byte) -122;
                } else if (i_7_ == 8225) {
                    bs[i_6_] = (byte) -121;
                } else if (i_7_ == 710) {
                    bs[i_6_] = (byte) -120;
                } else if (i_7_ == 8240) {
                    bs[i_6_] = (byte) -119;
                } else if (i_7_ == 352) {
                    bs[i_6_] = (byte) -118;
                } else if (i_7_ == 8249) {
                    bs[i_6_] = (byte) -117;
                } else if (i_7_ == 338) {
                    bs[i_6_] = (byte) -116;
                } else if (i_7_ == 381) {
                    bs[i_6_] = (byte) -114;
                } else if (i_7_ == 8216) {
                    bs[i_6_] = (byte) -111;
                } else if (i_7_ == 8217) {
                    bs[i_6_] = (byte) -110;
                } else if (i_7_ == 8220) {
                    bs[i_6_] = (byte) -109;
                } else if (i_7_ == 8221) {
                    bs[i_6_] = (byte) -108;
                } else if (i_7_ == 8226) {
                    bs[i_6_] = (byte) -107;
                } else if (i_7_ == 8211) {
                    bs[i_6_] = (byte) -106;
                } else if (i_7_ == 8212) {
                    bs[i_6_] = (byte) -105;
                } else if (i_7_ == 732) {
                    bs[i_6_] = (byte) -104;
                } else if (i_7_ == 8482) {
                    bs[i_6_] = (byte) -103;
                } else if (i_7_ == 353) {
                    bs[i_6_] = (byte) -102;
                } else if (i_7_ == 8250) {
                    bs[i_6_] = (byte) -101;
                } else if (i_7_ == 339) {
                    bs[i_6_] = (byte) -100;
                } else if (i_7_ == 382) {
                    bs[i_6_] = (byte) -98;
                } else if (i_7_ == 376) {
                    bs[i_6_] = (byte) -97;
                } else {
                    bs[i_6_] = (byte) 63;
                }
            } else {
                bs[i_6_] = (byte) i_7_;
            }
        }
        return bs;
    }

    static void method3764(int i) {
        for (int i_8_ = 0; i_8_ < 100; i_8_++)
            Class195.aBooleanArray2387[i_8_] = true;
        if (i > -68) {
            method3764(-15);
        }
        anInt8411++;
    }

    static {
        aBooleanArray8403 = new boolean[100];
    }
}
