/* Class339_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

public class Class339_Sub1 extends Class339 {
    private Class169_Sub1[] aClass169_Sub1Array8627;
    static int anInt8628;
    static int anInt8629;
    static int anInt8630;
    static String[] aStringArray8631;
    static int anInt8632;
    private boolean aBoolean8633;
    static int anInt8634;
    private Class25 aClass25_8635;
    static int anInt8636;
    private boolean aBoolean8637 = false;
    static int anInt8638;
    static int anInt8639;

    final boolean method3922(byte b) {
        if (b > -44) {
            aClass169_Sub1Array8627 = null;
        }
        anInt8639++;
        return true;
    }

    final void method3919(int i, int i_0_, int i_1_) {
        if (i != -13437) {
            method3917(null, -28, -126);
        }
        if (aBoolean8637) {
            aGLToolkit4202.method1457(33984, 1);
            aGLToolkit4202.method1444(-2, aClass169_Sub1Array8627[i_1_ - 1]);
            aGLToolkit4202.method1457(33984, 0);
        }
        anInt8636++;
    }

    final void method3918(int i) {
        anInt8630++;
        if (i != 20937) {
            method3926();
        }
        if (aBoolean8637) {
            if (!aBoolean8633) {
                aGLToolkit4202.method1457(33984, 2);
                aGLToolkit4202.method1444(-2, null);
            }
            aGLToolkit4202.method1457(33984, 1);
            aGLToolkit4202.method1444(-2, null);
            aGLToolkit4202.method1457(i + 13047, 0);
            aClass25_8635.method310('\001', (byte) -116);
            aBoolean8637 = false;
        } else {
            aGLToolkit4202.method1472(-96, 0, 5890);
        }
        aGLToolkit4202.method1474(8448, 8448);
    }

    final void method3917(Class169 class169, int i, int i_2_) {
        aGLToolkit4202.method1444(-2, class169);
        if (i_2_ != -28289) {
            aClass25_8635 = null;
        }
        anInt8638++;
        aGLToolkit4202.method1434(i);
    }

    private void method3924() {
        aClass25_8635 = new Class25(aGLToolkit4202, 2);
        anInt8634++;
        aClass25_8635.method307(0);
        aGLToolkit4202.method1457(33984, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (aBoolean8633) {
            aGLToolkit4202.method1474(7681, 260);
            aGLToolkit4202.method1464(5890, 770, 0);
            aGLToolkit4202.method1472(-103, 0, 34167);
        } else {
            aGLToolkit4202.method1474(8448, 7681);
            aGLToolkit4202.method1464(34168, 768, 0);
            aGLToolkit4202.method1457(33984, 2);
            aGLToolkit4202.method1474(7681, 260);
            aGLToolkit4202.method1464(34168, 768, 0);
            aGLToolkit4202.method1464(34168, 770, 1);
            aGLToolkit4202.method1472(-32, 0, 34167);
        }
        aGLToolkit4202.method1457(33984, 0);
        aClass25_8635.method309();
        aClass25_8635.method307(1);
        aGLToolkit4202.method1457(33984, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (aBoolean8633) {
            aGLToolkit4202.method1474(8448, 8448);
            aGLToolkit4202.method1464(5890, 768, 0);
            aGLToolkit4202.method1472(-44, 0, 5890);
        } else {
            aGLToolkit4202.method1474(8448, 8448);
            aGLToolkit4202.method1464(5890, 768, 0);
            aGLToolkit4202.method1457(33984, 2);
            aGLToolkit4202.method1474(8448, 8448);
            aGLToolkit4202.method1464(5890, 768, 0);
            aGLToolkit4202.method1464(34168, 768, 1);
            aGLToolkit4202.method1472(-36, 0, 5890);
        }
        aGLToolkit4202.method1457(33984, 0);
        aClass25_8635.method309();
    }

    final void method3920() {
        aGLToolkit4202.method1474(7681, 8448);
        anInt8632++;
    }

    Class339_Sub1(GLToolkit gltoolkit) {
        super(gltoolkit);
        if (gltoolkit.aBoolean6654) {
            aBoolean8633 = gltoolkit.anInt6680 < 3;
            int i = !aBoolean8633 ? 127 : 48;
            byte[][] bs = new byte[6][4096];
            byte[][] bs_3_ = new byte[6][4096];
            byte[][] bs_4_ = new byte[6][4096];
            int i_5_ = 0;
            for (int i_6_ = 0; i_6_ < 64; i_6_++) {
                for (int i_7_ = 0; i_7_ < 64; i_7_++) {
                    float f = (float) i_6_ * 2.0F / 64.0F - 1.0F;
                    float f_8_ = -1.0f + (float) i_7_ * 2.0F / 64.0F;
                    float f_9_ = (float) (1.0 / Math.sqrt(f_8_ * f_8_ + 1.0F + f * f));
                    f *= f_9_;
                    f_8_ *= f_9_;
                    for (int i_10_ = 0; i_10_ < 6; i_10_++) {
                        float f_11_;
                        if (i_10_ == 0) {
                            f_11_ = -f_8_;
                        } else if (i_10_ == 1) {
                            f_11_ = f_8_;
                        } else if (i_10_ == 2) {
                            f_11_ = f;
                        } else if (i_10_ == 3) {
                            f_11_ = -f;
                        } else if (i_10_ == 4) {
                            f_11_ = f_9_;
                        } else {
                            f_11_ = -f_9_;
                        }
                        int i_12_;
                        int i_13_;
                        int i_14_;
                        if (f_11_ > 0.0F) {
                            i_12_ = (int) (Math.pow(f_11_, 96.0) * (double) i);
                            i_13_ = (int) ((double) i * Math.pow(f_11_, 36.0));
                            i_14_ = (int) ((double) i * Math.pow(f_11_, 12.0));
                        } else {
                            i_12_ = i_13_ = i_14_ = 0;
                        }
                        bs_3_[i_10_][i_5_] = (byte) i_12_;
                        bs_4_[i_10_][i_5_] = (byte) i_13_;
                        bs[i_10_][i_5_] = (byte) i_14_;
                    }
                    i_5_++;
                }
            }
            aClass169_Sub1Array8627 = new Class169_Sub1[3];
            aClass169_Sub1Array8627[0] = new Class169_Sub1(aGLToolkit4202, bs_3_);
            aClass169_Sub1Array8627[1] = new Class169_Sub1(aGLToolkit4202, bs_4_);
            aClass169_Sub1Array8627[2] = new Class169_Sub1(aGLToolkit4202, bs);
            method3924();
        }
    }

    static int method3925(int i, int i_16_) {
        anInt8628++;
        int i_17_ = Class270_Sub2_Sub1.method3306(i + 45365, 4, i_16_ + 91923) - (128 - (Class270_Sub2_Sub1.method3306(i + 10294, 2, 37821 + i_16_) - 128 >> 1) - (Class270_Sub2_Sub1.method3306(i, 1, i_16_) - 128 >> 2));
        i_17_ = (int) (0.3 * (double) i_17_) + 35;
        if (i_17_ >= 10) {
            if (i_17_ > 60) {
                i_17_ = 60;
            }
        } else {
            i_17_ = 10;
        }
        return i_17_;
    }

    public static void method3926() {
        aStringArray8631 = null;
    }

    final void method3923(boolean bool, int i) {
        anInt8629++;
        if (aClass25_8635 != null && bool) {
            if (!aBoolean8633) {
                aGLToolkit4202.method1457(33984, 2);
                aGLToolkit4202.method1444(-2, aGLToolkit4202.aClass169_Sub2_6683);
                aGLToolkit4202.method1457(i + 33984, 0);
            }
            aClass25_8635.method310('\0', (byte) -77);
            aBoolean8637 = true;
        } else {
            aGLToolkit4202.method1472(i - 37, 0, 34168);
        }
        if (i != 0) {
            aClass25_8635 = null;
        }
    }
}
