/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

public class Class137 {
    static int anInt1701;
    private final int anInt1702;
    private Class349[][] aClass349ArrayArray1703;
    protected byte[] aByteArray1704;
    static int anInt1705;
    protected int anInt1706;
    private final GLPlane aGLPlane1707;
    private final int anInt1708;
    static IncommingPacket aClass192_1709 = new IncommingPacket(72, 2);
    static int anInt1710;
    private final int anInt1711;
    private final int anInt1712;
    static int anInt1713;
    private final GLToolkit aGLToolkit1714;
    static boolean aBoolean1715 = false;
    static int anInt1716;
    static int anInt1717;

    final void method1594() {
        anInt1713++;
        aClass349ArrayArray1703 = new Class349[anInt1702][anInt1708];
        for (int i = 0; i < anInt1708; i++) {
            for (int i_0_ = 0; i_0_ < anInt1702; i_0_++)
                aClass349ArrayArray1703[i_0_][i] = new Class349(aGLToolkit1714, this, aGLPlane1707, i_0_, i, anInt1711, i_0_ * 128 + 1, 1 + i * 128);
        }
    }

    final void method1595(int i, int i_1_, r var_r) {
        anInt1701++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i += var_r_Sub2.anInt11064 + 1;
        i_1_ += 1 + var_r_Sub2.anInt11067;
        int i_2_ = i_1_ * anInt1706 + i;
        int i_3_ = 0;
        int i_4_ = var_r_Sub2.anInt11055;
        int i_5_ = var_r_Sub2.anInt11057;
        int i_6_ = -i_5_ + anInt1706;
        if (i_1_ <= 0) {
            int i_7_ = -i_1_ + 1;
            i_1_ = 1;
            i_2_ += i_7_ * anInt1706;
            i_4_ -= i_7_;
            i_3_ += i_7_ * i_5_;
        }
        int i_8_ = 0;
        if (i_1_ + i_4_ >= anInt1712) {
            int i_9_ = i_1_ - (-i_4_ - (1 - anInt1712));
            i_4_ -= i_9_;
        }
        if (i <= 0) {
            int i_10_ = 1 - i;
            i_6_ += i_10_;
            i_5_ -= i_10_;
            i_8_ += i_10_;
            i = 1;
            i_2_ += i_10_;
            i_3_ += i_10_;
        }
        if (i + i_5_ >= anInt1706) {
            int i_11_ = 1 + (i_5_ + (i - anInt1706));
            i_6_ += i_11_;
            i_8_ += i_11_;
            i_5_ -= i_11_;
        }
        if (i_5_ > 0 && i_4_ > 0) {
            GLXToolkit.method1405(aByteArray1704, i_8_, i_2_, i_5_, i_4_, i_6_, var_r_Sub2.aByteArray11058, i_3_);
            method1599(i_1_, i_4_, i_5_, i);
        }
    }

    final void method1596(int i, boolean bool, int i_13_, boolean[][] bools, int i_14_) {
        anInt1717++;
        aGLToolkit1714.method1451(false);
        aGLToolkit1714.method1415(false);
        aGLToolkit1714.method1489(-2);
        aGLToolkit1714.method1434(1);
        aGLToolkit1714.method1460(1);
        float f = 1.0F / (float) (aGLToolkit1714.anInt6606 * 128);
        if (bool) {
            for (int i_15_ = 0; i_15_ < anInt1708; i_15_++) {
                int i_16_ = i_15_ << anInt1711;
                int i_17_ = i_15_ + 1 << anInt1711;
                for (int i_18_ = 0; i_18_ < anInt1702; i_18_++) {
                    int i_19_ = i_18_ << anInt1711;
                    int i_20_ = i_18_ + 1 << anInt1711;
                    while_136_:
                    for (int i_21_ = i_19_; i_21_ < i_20_; i_21_++) {
                        if (-i_14_ <= -i + i_21_ && -i + i_21_ <= i_14_) {
                            for (int i_22_ = i_16_; i_17_ > i_22_; i_22_++) {
                                if (-i_14_ <= -i_13_ + i_22_ && i_22_ - i_13_ <= i_14_ && bools[i_14_ - i + i_21_][i_14_ + i_22_ - i_13_]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(f, f, 1.0F);
                                    OpenGL.glTranslatef((float) -i_18_ / f, (float) -i_15_ / f, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    aClass349ArrayArray1703[i_18_][i_15_].method3987();
                                    break while_136_;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int i_23_ = 0; i_23_ < anInt1708; i_23_++) {
                int i_24_ = i_23_ << anInt1711;
                int i_25_ = 1 + i_23_ << anInt1711;
                for (int i_26_ = 0; anInt1702 > i_26_; i_26_++) {
                    int i_27_ = 0;
                    int i_28_ = i_26_ << anInt1711;
                    int i_29_ = i_26_ + 1 << anInt1711;
                    FloatBuffer floatbuffer = aGLToolkit1714.aFloatBuffer6661;
                    floatbuffer.offset = 0;
                    for (int i_30_ = i_24_; i_30_ < i_25_; i_30_++) {
                        if (-i_14_ <= i_30_ - i_13_ && i_14_ >= -i_13_ + i_30_) {
                            int i_31_ = i_28_ + i_30_ * aGLPlane1707.anInt3408;
                            for (int i_32_ = i_28_; i_29_ > i_32_; i_32_++) {
                                if (-i_14_ <= -i + i_32_ && i_14_ >= -i + i_32_ && bools[i_14_ + (i_32_ - i)][-i_13_ + i_30_ + i_14_]) {
                                    short[] ses = aGLPlane1707.aShortArrayArray7925[i_31_];
                                    if (ses != null) {
                                        if (aGLToolkit1714.aBoolean6736) {
                                            for (short se : ses) {
                                                i_27_++;
                                                floatbuffer.writeShort(se & 0xffff);
                                            }
                                        } else {
                                            for (short se : ses) {
                                                floatbuffer.method2191(-116, 0xffff & se);
                                                i_27_++;
                                            }
                                        }
                                    }
                                }
                                i_31_++;
                            }
                        }
                    }
                    if (i_27_ > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(f, f, 1.0F);
                        OpenGL.glTranslatef((float) -i_26_ / f, (float) -i_23_ / f, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        aClass349ArrayArray1703[i_26_][i_23_].method3990(floatbuffer.buffer, i_27_);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    final boolean method1597(int i_35_, r var_r, int i_36_) {
        anInt1710++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i_36_ += var_r_Sub2.anInt11067 + 1;
        i_35_ += 1 + var_r_Sub2.anInt11064;
        int i_37_ = i_36_ * anInt1706 + i_35_;
        int i_38_ = var_r_Sub2.anInt11055;
        int i_39_ = var_r_Sub2.anInt11057;
        int i_40_ = -i_39_ + anInt1706;
        if (i_36_ <= 0) {
            int i_41_ = 1 - i_36_;
            i_36_ = 1;
            i_38_ -= i_41_;
            i_37_ += anInt1706 * i_41_;
        }
        if (anInt1712 <= i_38_ + i_36_) {
            int i_42_ = -anInt1712 + i_38_ + i_36_ + 1;
            i_38_ -= i_42_;
        }
        if (i_35_ <= 0) {
            int i_43_ = -i_35_ + 1;
            i_35_ = 1;
            i_39_ -= i_43_;
            i_40_ += i_43_;
            i_37_ += i_43_;
        }
        if (anInt1706 <= i_35_ + i_39_) {
            int i_44_ = -anInt1706 + (i_35_ + i_39_) + 1;
            i_39_ -= i_44_;
            i_40_ += i_44_;
        }
        if (i_39_ <= 0 || i_38_ <= 0) {
            return false;
        }
        int i_45_ = 8;
        i_40_ += (-1 + i_45_) * anInt1706;
        return Class134_Sub2.method1582(i_45_, i_37_, aByteArray1704, i_39_, i_38_, i_40_);
    }

    final void method1598(int i, r var_r, int i_46_) {
        anInt1705++;
        r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
        i += 1 + var_r_Sub2.anInt11067;
        i_46_ += var_r_Sub2.anInt11064 + 1;
        int i_47_ = anInt1706 * i + i_46_;
        int i_48_ = 0;
        int i_49_ = var_r_Sub2.anInt11055;
        int i_50_ = var_r_Sub2.anInt11057;
        int i_51_ = -i_50_ + anInt1706;
        int i_52_ = 0;
        if (i <= 0) {
            int i_53_ = -i + 1;
            i_49_ -= i_53_;
            i = 1;
            i_48_ += i_50_ * i_53_;
            i_47_ += i_53_ * anInt1706;
        }
        if (anInt1712 <= i + i_49_) {
            int i_54_ = -anInt1712 + (1 + i_49_) + i;
            i_49_ -= i_54_;
        }
        if (i_46_ <= 0) {
            int i_55_ = -i_46_ + 1;
            i_50_ -= i_55_;
            i_48_ += i_55_;
            i_51_ += i_55_;
            i_47_ += i_55_;
            i_46_ = 1;
            i_52_ += i_55_;
        }
        if (i_46_ + i_50_ >= anInt1706) {
            int i_56_ = i_50_ + i_46_ - (-1 + anInt1706);
            i_51_ += i_56_;
            i_52_ += i_56_;
            i_50_ -= i_56_;
        }
        if (i_50_ > 0 && i_49_ > 0) {
            Node_Sub38_Sub33.method2898(i_52_, i_51_, i_47_, aByteArray1704, i_48_, var_r_Sub2.aByteArray11058, i_49_, i_50_);
            method1599(i, i_49_, i_50_, i_46_);
        }
    }

    private void method1599(int i_57_, int i_58_, int i_59_, int i_60_) {
        anInt1716++;
        if (aClass349ArrayArray1703 != null) {
            int i_61_ = i_60_ - 1 >> 7;
            int i_62_ = -1 + (-1 + i_60_ + i_59_) >> 7;
            int i_63_ = -1 + i_57_ >> 7;
            int i_64_ = -1 + (-1 + (i_57_ + i_58_)) >> 7;
            for (int i_65_ = i_61_; i_65_ <= i_62_; i_65_++) {
                Class349[] class349s = aClass349ArrayArray1703[i_65_];
                for (int i_66_ = i_63_; i_66_ <= i_64_; i_66_++)
                    class349s[i_66_].aBoolean4307 = true;
            }
        }
    }

    Class137(GLToolkit gltoolkit, GLPlane glplane) {
        aGLToolkit1714 = gltoolkit;
        aGLPlane1707 = glplane;
        anInt1706 = (aGLPlane1707.anInt3408 * aGLPlane1707.anInt3398 >> aGLToolkit1714.anInt6611) + 2;
        anInt1712 = (aGLPlane1707.anInt3404 * aGLPlane1707.anInt3398 >> aGLToolkit1714.anInt6611) + 2;
        anInt1711 = 7 + aGLToolkit1714.anInt6611 - aGLPlane1707.anInt3410;
        aByteArray1704 = new byte[anInt1712 * anInt1706];
        anInt1702 = aGLPlane1707.anInt3408 >> anInt1711;
        anInt1708 = aGLPlane1707.anInt3404 >> anInt1711;
    }

    public static void method1600() {
        aClass192_1709 = null;
    }
}
