/* Mobile_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Mobile_Sub4 extends Mobile {
    static int anInt10962;
    static int anInt10963;
    static int anInt10964;
    private EntityNode_Sub4 anEntityNode_Sub4_10965;
    static int anInt10966;
    static int anInt10967;
    private Animator anAnimator10968;
    private int anInt10969;
    static int anInt10970;
    static int anInt10971;
    static int anInt10972;
    static int anInt10973;
    static int anInt10974;
    static int anInt10975;
    private int anInt10976;
    private boolean aBoolean10977;
    static int anInt10978;
    private final int gfxId;
    static int anInt10980;
    static int anInt10981 = 0;
    static int anInt10982;
    static int anInt10983;
    static int anInt10984;
    static int anInt10985;
    static int anInt10986;
    static int anInt10987;
    static boolean aBoolean10988 = false;
    static int anInt10989;
    static int anInt10990;
    private int anInt10991;
    static OutcommingPacket aClass318_10992 = new OutcommingPacket(62, 3);
    static int anInt10993;
    static int anInt10994;
    static int anInt10995;

    private void method907(Class336 class336, DrawableModel drawablemodel, GraphicsToolkit graphicstoolkit) {
        drawablemodel.method614(class336);
        anInt10994++;
        Class300[] class300s = drawablemodel.method620();
        Class218[] class218s = drawablemodel.method618();
        if ((anEntityNode_Sub4_10965 == null || anEntityNode_Sub4_10965.aBoolean5972) && (class300s != null || class218s != null)) {
            anEntityNode_Sub4_10965 = EntityNode_Sub4.method963(Class174.clientCycle, true);
        }
        if (anEntityNode_Sub4_10965 != null) {
            anEntityNode_Sub4_10965.method952(graphicstoolkit, Class174.clientCycle, class300s, class218s);
            anEntityNode_Sub4_10965.method967(plane);
        }
    }

    private DrawableModel method908(int i_0_, GraphicsToolkit graphicstoolkit, int i_1_) {
        anInt10984++;
        Class195 class195 = Class16.aClass101_228.method1090(i_0_);
        Plane plane = Node_Sub38_Sub37.aPlaneArray10466[this.plane];
        Plane plane_2_ = aByte5931 < 3 ? Node_Sub38_Sub37.aPlaneArray10466[1 + aByte5931] : null;
        if (anAnimator10968 == null || anAnimator10968.method238(-18)) {
            return class195.method1986((byte) 2, true, anInt5940, null, plane_2_, (byte) 104, anInt5934, plane, i_1_, anInt5937, graphicstoolkit);
        }
        return class195.method1986((byte) 2, true, anInt5940, anAnimator10968, plane_2_, (byte) -122, anInt5934, plane, i_1_, anInt5937, graphicstoolkit);
    }

    protected final void finalize() {
        anInt10982++;
        if (anEntityNode_Sub4_10965 != null) {
            anEntityNode_Sub4_10965.method953();
        }
    }

    final void method820(GraphicsToolkit graphicstoolkit, int i) {
        if (i != -5) {
            method820(null, 72);
        }
        anInt10985++;
        DrawableModel drawablemodel = method908(gfxId, graphicstoolkit, 0);
        if (drawablemodel != null) {
            Class336 class336 = graphicstoolkit.A();
            class336.method3854(anInt5934, anInt5937, anInt5940);
            method907(class336, drawablemodel, graphicstoolkit);
        }
    }

    final boolean method821(int i) {
        if (i != 0) {
            anInt10987 = 119;
        }
        anInt10986++;
        return false;
    }

    final boolean method909() {
        anInt10980++;
        return !(anAnimator10968 == null || anAnimator10968.method242());
    }

    final void method811(int i) {
        anInt10978++;
        if (i == 27811) {
            throw new IllegalStateException();
        }
    }

    final int method817(int i) {
        anInt10964++;
        if (i != 2) {
            method813(113);
        }
        return anInt10991;
    }

    static void method910() {
        anInt10974++;
        if (!aBoolean10988) {
            Node_Sub25_Sub1.aBoolean9950 = true;
            Node_Sub36_Sub1.aFloat10038 += (-12.0f - Node_Sub36_Sub1.aFloat10038) / 2.0F;
            aBoolean10988 = true;
        }
    }

    final int method823() {
        anInt10993++;
        return anInt10969;
    }

    static void method911() {
        anInt10995++;
        CacheNode_Sub17.anInt8835 = 0;
        int i = (Class295.myPlayer.anInt5934 >> 9) + Node_Sub53.gameSceneBaseX;
        int i_3_ = Class320_Sub4.gameSceneBaseY + (Class295.myPlayer.anInt5940 >> 9);
        if (i >= 3053 && i <= 3156 && i_3_ >= 3056 && i_3_ <= 3136) {
            CacheNode_Sub17.anInt8835 = 1;
        }
        if (i >= 3072 && i <= 3118 && i_3_ >= 9492 && i_3_ <= 9535) {
            CacheNode_Sub17.anInt8835 = 1;
        }
        if (CacheNode_Sub17.anInt8835 == 1 && i >= 3139 && i_3_ <= 3062) {
            CacheNode_Sub17.anInt8835 = 0;
        }
    }

    final void method912() {
        if (anAnimator10968 != null && !anAnimator10968.method238(-72)) {
            anAnimator10968.method248(-92, 1);
        }
        anInt10963++;
    }

    final boolean method813(int i) {
        if (i != 0) {
            return false;
        }
        anInt10975++;
        return aBoolean10977;
    }

    final boolean method810(int i, int i_5_, boolean bool, GraphicsToolkit graphicstoolkit) {
        anInt10989++;
        if (bool) {
            method817(-24);
        }
        return false;
    }

    Mobile_Sub4(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
        super(i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, false, (byte) 0);
        anInt10969 = 0;
        aBoolean10977 = true;
        anInt10991 = 0;
        gfxId = i;
        anInt10976 = i_16_;
        Class195 class195 = Class16.aClass101_228.method1090(gfxId);
        int i_17_ = class195.anInt2394;
        if (i_17_ != -1) {
            anAnimator10968 = new AnimableAnimator(this);
            int i_18_ = !class195.aBoolean2402 ? 2 : 0;
            if (bool) {
                i_18_ = 1;
            }
            anAnimator10968.method228(i_17_, i_6_, i_18_, false);
        }
    }

    static void method913(String string, boolean bool) {
        anInt10973++;
        string = string.toLowerCase();
        short[] ses = new short[16];
        int i_19_ = 0;
        int i_20_ = !bool ? 0 : 32768;
        int i_21_ = (bool ? Node_Sub36_Sub1.aClass109_10035.anInt1369 : Node_Sub36_Sub1.aClass109_10035.anInt1373) + i_20_;
        for (int i_22_ = i_20_; i_22_ < i_21_; i_22_++) {
            CacheNode_Sub10 cachenode_sub10 = Node_Sub36_Sub1.aClass109_10035.method1128(i_22_);
            if (cachenode_sub10.aBoolean9521 && cachenode_sub10.method2332().toLowerCase().contains(string)) {
                if (i_19_ >= 50) {
                    Node_Sub20.aShortArray7175 = null;
                    Class365_Sub1.anInt8759 = -1;
                    return;
                }
                if (ses.length <= i_19_) {
                    short[] ses_23_ = new short[ses.length * 2];
                    System.arraycopy(ses, 0, ses_23_, 0, i_19_);
                    ses = ses_23_;
                }
                ses[i_19_++] = (short) i_22_;
            }
        }
        Animable_Sub1.anInt9096 = 0;
        Class365_Sub1.anInt8759 = i_19_;
        Node_Sub20.aShortArray7175 = ses;
        String[] strings = new String[Class365_Sub1.anInt8759];
        for (int i_26_ = 0; i_26_ < Class365_Sub1.anInt8759; i_26_++)
            strings[i_26_] = Node_Sub36_Sub1.aClass109_10035.method1128(ses[i_26_]).method2332();
        Class293.method3461(strings, Node_Sub20.aShortArray7175);
    }

    final void method914(int i) {
        anInt10970++;
        if (anEntityNode_Sub4_10965 != null) {
            anEntityNode_Sub4_10965.method953();
        }
        if (i >= -76) {
            anInt10976 = -126;
        }
    }

    final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
        anInt10983++;
        if (i >= -93) {
            method810(-78, 64, true, null);
        }
        return null;
    }

    static void method915(int i, Class54 class54) {
        anInt10971++;
        if (Class290_Sub11.anIntArray8180 != null && i <= class54.aByte824) {
            for (int i_28_ = 0; i_28_ < Class290_Sub11.anIntArray8180.length; i_28_++) {
                if (Class290_Sub11.anIntArray8180[i_28_] != -1000000 && (class54.anIntArray814[0] <= Class290_Sub11.anIntArray8180[i_28_] || class54.anIntArray814[1] <= Class290_Sub11.anIntArray8180[i_28_] || class54.anIntArray814[2] <= Class290_Sub11.anIntArray8180[i_28_] || class54.anIntArray814[3] <= Class290_Sub11.anIntArray8180[i_28_]) && (class54.anIntArray810[0] <= EntityNode_Sub3_Sub1.anIntArray9161[i_28_] || class54.anIntArray810[1] <= EntityNode_Sub3_Sub1.anIntArray9161[i_28_] || class54.anIntArray810[2] <= EntityNode_Sub3_Sub1.anIntArray9161[i_28_] || EntityNode_Sub3_Sub1.anIntArray9161[i_28_] >= class54.anIntArray810[3]) && (aa_Sub3.anIntArray5490[i_28_] <= class54.anIntArray810[0] || aa_Sub3.anIntArray5490[i_28_] <= class54.anIntArray810[1] || class54.anIntArray810[2] >= aa_Sub3.anIntArray5490[i_28_] || aa_Sub3.anIntArray5490[i_28_] <= class54.anIntArray810[3]) && (class54.anIntArray820[0] <= Class121.anIntArray1528[i_28_] || Class121.anIntArray1528[i_28_] >= class54.anIntArray820[1] || class54.anIntArray820[2] <= Class121.anIntArray1528[i_28_] || class54.anIntArray820[3] <= Class121.anIntArray1528[i_28_]) && (class54.anIntArray820[0] >= CacheNode_Sub18.anIntArray9605[i_28_] || class54.anIntArray820[1] >= CacheNode_Sub18.anIntArray9605[i_28_] || class54.anIntArray820[2] >= CacheNode_Sub18.anIntArray9605[i_28_] || class54.anIntArray820[3] >= CacheNode_Sub18.anIntArray9605[i_28_])) {
                    return;
                }
            }
        }
        if (class54.aByte822 == 1) {
            int i_29_ = Node_Sub9_Sub1.anInt9656 - Class216.anInt2551 + class54.aShort821;
            if (i_29_ >= 0 && i_29_ <= Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                int i_30_ = class54.aShort815 - EntityNode_Sub7.anInt6013 + Node_Sub9_Sub1.anInt9656;
                if (i_30_ < 0) {
                    i_30_ = 0;
                } else if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 < i_30_) {
                    return;
                }
                int i_31_ = Node_Sub9_Sub1.anInt9656 + class54.aShort819 - EntityNode_Sub7.anInt6013;
                if (i_31_ <= Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                    if (i_31_ < 0) {
                        return;
                    }
                } else {
                    i_31_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                }
                boolean bool = false;
                while (i_30_ <= i_31_) {
                    if (Class139.aBooleanArrayArray1730[i_29_][i_30_++]) {
                        bool = true;
                        break;
                    }
                }
                if (bool) {
                    float f = (float) (GLPlane.anInt7920 - class54.anIntArray810[0]);
                    if (f < 0.0F) {
                        f *= -1.0f;
                    }
                    if (!((float) Node_Sub38_Sub6.anInt10139 > f) && Class121.method1231(0, class54) && Class121.method1231(1, class54) && Class121.method1231(2, class54) && Class121.method1231(3, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                    }
                }
            }
        } else if (class54.aByte822 == 2) {
            int i_32_ = Node_Sub9_Sub1.anInt9656 + class54.aShort815 - EntityNode_Sub7.anInt6013;
            if (i_32_ >= 0 && Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_32_) {
                int i_33_ = Node_Sub9_Sub1.anInt9656 + class54.aShort821 - Class216.anInt2551;
                if (i_33_ < 0) {
                    i_33_ = 0;
                } else if (i_33_ > Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                    return;
                }
                int i_34_ = Node_Sub9_Sub1.anInt9656 + class54.aShort818 - Class216.anInt2551;
                if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_34_) {
                    if (i_34_ < 0) {
                        return;
                    }
                } else {
                    i_34_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                }
                boolean bool = false;
                while (i_33_ <= i_34_) {
                    if (Class139.aBooleanArrayArray1730[i_33_++][i_32_]) {
                        bool = true;
                        break;
                    }
                }
                if (bool) {
                    float f = (float) (Class380.anInt4889 - class54.anIntArray820[0]);
                    if (f < 0.0F) {
                        f *= -1.0f;
                    }
                    if (!(f < (float) Node_Sub38_Sub6.anInt10139) && Class121.method1231(0, class54) && Class121.method1231(1, class54) && Class121.method1231(2, class54) && Class121.method1231(3, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                    }
                }
            }
        } else if (class54.aByte822 == 16 || class54.aByte822 == 8) {
            int i_35_ = -Class216.anInt2551 + (class54.aShort821 + Node_Sub9_Sub1.anInt9656);
            if (i_35_ >= 0 && Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_35_) {
                int i_36_ = -EntityNode_Sub7.anInt6013 + class54.aShort815 + Node_Sub9_Sub1.anInt9656;
                if (i_36_ >= 0 && Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_36_ && Class139.aBooleanArrayArray1730[i_35_][i_36_]) {
                    float f = (float) (GLPlane.anInt7920 - class54.anIntArray810[0]);
                    if (f < 0.0F) {
                        f *= -1.0f;
                    }
                    float f_37_ = (float) (-class54.anIntArray820[0] + Class380.anInt4889);
                    if (f_37_ < 0.0F) {
                        f_37_ *= -1.0f;
                    }
                    if ((!((float) Node_Sub38_Sub6.anInt10139 > f) || !((float) Node_Sub38_Sub6.anInt10139 > f_37_)) && Class121.method1231(0, class54) && Class121.method1231(1, class54) && Class121.method1231(2, class54) && Class121.method1231(3, class54)) {
                        Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                    }
                }
            }
        } else if (class54.aByte822 == 4) {
            float f = (float) (class54.anIntArray814[0] - Class194_Sub3.anInt6900);
            if (!(f <= (float) Class134_Sub4.anInt9047)) {
                int i_38_ = -EntityNode_Sub7.anInt6013 + (class54.aShort815 + Node_Sub9_Sub1.anInt9656);
                if (i_38_ >= 0) {
                    if (i_38_ > Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                        return;
                    }
                } else {
                    i_38_ = 0;
                }
                int i_39_ = Node_Sub9_Sub1.anInt9656 + class54.aShort819 - EntityNode_Sub7.anInt6013;
                if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 >= i_39_) {
                    if (i_39_ < 0) {
                        return;
                    }
                } else {
                    i_39_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                }
                int i_40_ = -Class216.anInt2551 + (class54.aShort821 + Node_Sub9_Sub1.anInt9656);
                if (i_40_ >= 0) {
                    if (i_40_ > Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656) {
                        return;
                    }
                } else {
                    i_40_ = 0;
                }
                int i_41_ = Node_Sub9_Sub1.anInt9656 + (-Class216.anInt2551 + class54.aShort818);
                if (Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 < i_41_) {
                    i_41_ = Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656;
                } else if (i_41_ < 0) {
                    return;
                }
                boolean bool = false;
                while_221_:
                for (int i_42_ = i_40_; i_41_ >= i_42_; i_42_++) {
                    for (int i_43_ = i_38_; i_43_ <= i_39_; i_43_++) {
                        if (Class139.aBooleanArrayArray1730[i_42_][i_43_]) {
                            bool = true;
                            break while_221_;
                        }
                    }
                }
                if (bool && Class121.method1231(0, class54) && Class121.method1231(1, class54) && Class121.method1231(2, class54) && Class121.method1231(3, class54)) {
                    Node_Sub44.aClass54Array7548[Class320_Sub21.anInt8406++] = class54;
                }
            }
        }
    }

    final void method816(int i, boolean bool, int i_44_, byte b, int i_45_, Animable animable) {
        if (b < 101) {
            method807(null);
        }
        anInt10962++;
        throw new IllegalStateException();
    }

    final EntityNode_Sub6 method807(GraphicsToolkit graphicstoolkit) {
        anInt10990++;
        DrawableModel drawablemodel = method908(gfxId, graphicstoolkit, (anInt10976 == 0 ? 0 : 5) | 0x800);
        if (drawablemodel == null) {
            return null;
        }
        if (anInt10976 != 0) {
            drawablemodel.a(2048 * anInt10976);
        }
        Class336 class336 = graphicstoolkit.A();
        class336.method3854(anInt5934, anInt5937, anInt5940);
        method907(class336, drawablemodel, graphicstoolkit);
        EntityNode_Sub6 entitynode_sub6 = Class345.method3972(false, 1);
        if (Node_Sub15_Sub10.aBoolean9850) {
            drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
        } else {
            drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
        }
        if (anEntityNode_Sub4_10965 != null) {
            Class198 class198 = anEntityNode_Sub4_10965.method954();
            if (Node_Sub15_Sub10.aBoolean9850) {
                graphicstoolkit.a(class198, Class308.anInt3912);
            } else {
                graphicstoolkit.a(class198);
            }
        }
        aBoolean10977 = drawablemodel.F();
        anInt10991 = drawablemodel.fa();
        anInt10969 = drawablemodel.ma();
        return entitynode_sub6;
    }

    final boolean method814() {
        anInt10966++;
        return false;
    }

    public static void method916() {
        aClass318_10992 = null;

    }

    final boolean method917() {
        anInt10967++;
        return !(anAnimator10968 != null && !anAnimator10968.method238(-68));
    }
}
