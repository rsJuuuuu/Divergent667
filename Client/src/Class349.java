/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class349 {
    static int anInt4301;
    static int anInt4302;
    static int anInt4303;
    private final GLToolkit aGLToolkit4304;
    static int anInt4305;
    static int anInt4306;
    protected boolean aBoolean4307;
    private int anInt4308 = -1;
    static int anInt4309;
    private Class169_Sub2 aClass169_Sub2_4310;
    private Class200_Sub2 aClass200_Sub2_4311;
    static int anInt4312;
    private Interface1 anInterface1_4313;
    private final int anInt4314;
    private final int anInt4315;
    private final Class137 aClass137_4316;
    static int anInt4317;
    private final int anInt4318;

    private void method3983(int i, Interface1 interface1) {
        anInt4302++;
        if (i != 0) {
            method3986();
            aGLToolkit4304.method1444(-2, aClass169_Sub2_4310);
            aGLToolkit4304.method1477(0, interface1, i);
        }
    }

    static void method3984(int i, int i_0_) {
        Class261 class261 = Class175.aClass261ArrayArrayArray2099[0][i][i_0_];
        for (int i_1_ = 0; i_1_ < 3; i_1_++) {
            Class261 class261_2_ = Class175.aClass261ArrayArrayArray2099[i_1_][i][i_0_] = Class175.aClass261ArrayArrayArray2099[i_1_ + 1][i][i_0_];
            if (class261_2_ != null) {
                for (Class256 class256 = class261_2_.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
                    Mobile mobile = class256.aMobile3239;
                    if (mobile.aShort9119 == i && mobile.aShort9120 == i_0_) {
                        mobile.plane--;
                    }
                }
                if (class261_2_.anAnimable_Sub1_3317 != null) {
                    class261_2_.anAnimable_Sub1_3317.plane--;
                }
                if (class261_2_.anAnimable_Sub2_3314 != null) {
                    class261_2_.anAnimable_Sub2_3314.plane--;
                }
                if (class261_2_.anAnimable_Sub2_3308 != null) {
                    class261_2_.anAnimable_Sub2_3308.plane--;
                }
                if (class261_2_.anAnimable_Sub4_3315 != null) {
                    class261_2_.anAnimable_Sub4_3315.plane--;
                }
                if (class261_2_.anAnimable_Sub4_3319 != null) {
                    class261_2_.anAnimable_Sub4_3319.plane--;
                }
            }
        }
        if (Class175.aClass261ArrayArrayArray2099[0][i][i_0_] == null) {
            Class175.aClass261ArrayArrayArray2099[0][i][i_0_] = new Class261(0);
            Class175.aClass261ArrayArrayArray2099[0][i][i_0_].aByte3311 = (byte) 1;
        }
        Class175.aClass261ArrayArrayArray2099[0][i][i_0_].aClass261_3310 = class261;
        Class175.aClass261ArrayArrayArray2099[3][i][i_0_] = null;
    }

    static void method3985(IComponentDefinitions widget, int i, int i_4_) {
        anInt4317++;
        Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241);
        if (class127 != null) {
            Class93.aGraphicsToolkit1241.KA(i, i_4_, i + widget.anInt4809, i_4_ + widget.anInt4695);
            if (Class262_Sub20.anInt7861 >= 3) {
                Class93.aGraphicsToolkit1241.A(class127.anAa1639, i, i_4_);
            } else {
                Class10.aGLSprite173.method1177((float) widget.anInt4809 / 2.0F + (float) i, (float) widget.anInt4695 / 2.0F + (float) i_4_, ((int) -Node_Sub12.aFloat5450 & 0x3fff) << 2, class127.anAa1639, i, i_4_);
            }
        }
    }

    private void method3986() {
        anInt4306++;
        if (aBoolean4307) {
            aBoolean4307 = false;
            byte[] bs = aClass137_4316.aByteArray1704;
            byte[] bs_5_ = aGLToolkit4304.aByteArray6746;
            int i = 0;
            int i_6_ = aClass137_4316.anInt1706;
            int i_7_ = aClass137_4316.anInt1706 * anInt4314 + anInt4318;
            for (int i_8_ = -128; i_8_ < 0; i_8_++) {
                i = -i + (i << 8);
                for (int i_9_ = -128; i_9_ < 0; i_9_++) {
                    if (bs[i_7_++] != 0) {
                        i++;
                    }
                }
                i_7_ += -128 + i_6_;
            }
            if (aClass169_Sub2_4310 == null || i != anInt4308) {
                anInt4308 = i;
                int i_10_ = 0;
                i_7_ = i_6_ * anInt4314 + anInt4318;
                for (int i_11_ = -128; i_11_ < 0; i_11_++) {
                    for (int i_12_ = -128; i_12_ < 0; i_12_++) {
                        if (bs[i_7_] == 0) {
                            int i_13_ = 0;
                            if (bs[-1 + i_7_] != 0) {
                                i_13_++;
                            }
                            if (bs[i_7_ + 1] != 0) {
                                i_13_++;
                            }
                            if (bs[-i_6_ + i_7_] != 0) {
                                i_13_++;
                            }
                            if (bs[i_7_ + i_6_] != 0) {
                                i_13_++;
                            }
                            bs_5_[i_10_++] = (byte) (17 * i_13_);
                        } else {
                            bs_5_[i_10_++] = (byte) 68;
                        }
                        i_7_++;
                    }
                    i_7_ += -128 + aClass137_4316.anInt1706;
                }
                if (aClass169_Sub2_4310 == null) {
                    aClass169_Sub2_4310 = new Class169_Sub2(aGLToolkit4304, 3553, 6406, 128, 128, false, aGLToolkit4304.aByteArray6746, 6406, false);
                    aClass169_Sub2_4310.method1776(false);
                    aClass169_Sub2_4310.method1757(true);
                } else {
                    aClass169_Sub2_4310.method1775((byte) 122, 128, 128, aGLToolkit4304.aByteArray6746, false);
                }
            }
        }
    }

    final void method3987() {
        anInt4312++;
        method3983(anInt4315, anInterface1_4313);
    }

    static boolean method3988(int i_15_) {
        anInt4309++;
        return (i_15_ & 0x21) != 0;
    }

    static int method3989(int i) {
        anInt4301++;
        if (i == 6406) {
            return 1;
        } else if (i == 6409) {
            return 1;
        } else if (i == 32841) {
            return 1;
        } else {
            if (i == 6410) {
                return 2;
            }
            if (i == 6407) {
                return 3;
            }
            if (i == 6408) {
                return 4;
            }
        }
        throw new IllegalArgumentException("");
    }

    final void method3990(byte[] bs, int i_17_) {
        anInt4303++;
        aClass200_Sub2_4311.method4(5123, i_17_ * aGLToolkit4304.method1466(5123), bs, 2712);
        method3983(i_17_, aClass200_Sub2_4311);
    }

    Class349(GLToolkit gltoolkit, Class137 class137, GLPlane glplane, int i, int i_18_, int i_19_, int i_20_, int i_21_) {
        aBoolean4307 = true;
        aGLToolkit4304 = gltoolkit;
        anInt4314 = i_21_;
        aClass137_4316 = class137;
        anInt4318 = i_20_;
        int i_22_ = 1 << i_19_;
        int i_23_ = 0;
        int i_24_ = i << i_19_;
        int i_25_ = i_18_ << i_19_;
        for (int i_26_ = 0; i_22_ > i_26_; i_26_++) {
            int i_27_ = i_24_ + glplane.anInt3408 * (i_25_ + i_26_);
            for (int i_28_ = 0; i_22_ > i_28_; i_28_++) {
                short[] ses = glplane.aShortArrayArray7925[i_27_++];
                if (ses != null) {
                    i_23_ += ses.length;
                }
            }
        }
        anInt4315 = i_23_;
        if (i_23_ <= 0) {
            aClass169_Sub2_4310 = null;
        } else {
            BufferedStream buffer = new BufferedStream(i_23_ * 2);
            if (aGLToolkit4304.aBoolean6736) {
                for (int i_33_ = 0; i_22_ > i_33_; i_33_++) {
                    int i_34_ = i_24_ + glplane.anInt3408 * (i_33_ + i_25_);
                    for (int i_35_ = 0; i_35_ < i_22_; i_35_++) {
                        short[] ses = glplane.aShortArrayArray7925[i_34_++];
                        if (ses != null) {
                            for (short se : ses) buffer.writeShort(0xffff & se);
                        }
                    }
                }
            } else {
                for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
                    int i_30_ = (i_25_ + i_29_) * glplane.anInt3408 + i_24_;
                    for (int i_31_ = 0; i_22_ > i_31_; i_31_++) {
                        short[] ses = glplane.aShortArrayArray7925[i_30_++];
                        if (ses != null) {
                            for (short se : ses) buffer.method2191(-42, se & 0xffff);
                        }
                    }
                }
            }
            anInterface1_4313 = aGLToolkit4304.method1453(false, buffer.offset, buffer.buffer);
            aClass200_Sub2_4311 = new Class200_Sub2(aGLToolkit4304, null, 1);
        }
    }
}
