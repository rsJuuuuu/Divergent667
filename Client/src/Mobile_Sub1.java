/* Mobile_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Mobile_Sub1 extends Mobile {
    static int anInt10911;
    private double aDouble10912;
    static int anInt10913;
    private int anInt10914 = 0;
    private boolean aBoolean10915;
    private double aDouble10916;
    private double aDouble10917;
    static int anInt10918;
    private int anInt10919;
    private int anInt10920;
    private double aDouble10921;
    static int anInt10922;
    protected int anInt10923;
    static int anInt10924;
    private double aDouble10925;
    static int anInt10926;
    private double aDouble10927;
    static int anInt10928;
    static int anInt10929;
    static int anInt10930 = 0;
    private int anInt10931;
    static int anInt10932;
    private final int anInt10933;
    private final int anInt10934;
    static int anInt10935;
    static int anInt10936;
    private final int anInt10937;
    protected int anInt10938;
    private double aDouble10939;
    private boolean aBoolean10940 = false;
    static int anInt10941;
    protected int anInt10942;
    private EntityNode_Sub4 anEntityNode_Sub4_10943;
    static int anInt10944;
    static int anInt10945;
    static int anInt10946;
    static Class104 aClass104_10947 = new Class104();
    private final int anInt10948;
    static int anInt10949;
    private int anInt10950 = 0;
    private boolean aBoolean10951;
    static int anInt10952;
    static int anInt10953;
    static int anInt10954;
    private final Animator anAnimator10955;
    private final int anInt10956;
    private double aDouble10957;
    protected int anInt10958;
    static boolean aBoolean10959 = true;
    static int anInt10960 = 0;
    static boolean aBoolean10961 = false;

    final int method817(int i) {
        if (i != 2) {
            aBoolean10915 = false;
        }
        anInt10941++;
        return anInt10950;
    }

    final void method895(int i, int i_0_, int i_1_, int i_2_) {
        if (!aBoolean10951) {
            double d = -anInt5934 + i_2_;
            double d_3_ = -anInt5940 + i_1_;
            double d_4_ = Math.sqrt(d_3_ * d_3_ + d * d);
            aDouble10921 = (double) anInt10937 * d_3_ / d_4_ + (double) anInt5940;
            aDouble10957 = (double) anInt5934 + d * (double) anInt10937 / d_4_;
            if (aBoolean10915) {
                aDouble10925 = Node_Sub38_Sub7.method2809(plane, -29754, (int) aDouble10921, (int) aDouble10957) - anInt10956;
            } else {
                aDouble10925 = anInt5937;
            }
        }
        anInt10913++;
        double d = anInt10923 + 1 - i_0_;
        aDouble10916 = ((double) i_1_ - aDouble10921) / d;
        aDouble10939 = ((double) i_2_ - aDouble10957) / d;
        aDouble10927 = Math.sqrt(aDouble10939 * aDouble10939 + aDouble10916 * aDouble10916);
        if (anInt10933 == -1) {
            aDouble10912 = (-aDouble10925 + (double) i) / d;
        } else {
            if (!aBoolean10951) {
                aDouble10912 = -aDouble10927 * Math.tan(0.02454369 * (double) anInt10933);
            }
            aDouble10917 = 2.0 * (-(d * aDouble10912) + (-aDouble10925 + (double) i)) / (d * d);
        }
    }

    final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
        anInt10935++;
        if (i >= -93) {
            aDouble10957 = 1.3103535335051488;
        }
        return null;
    }

    final void method845() {
        aShort9119 = aShort9130 = (short) (int) (aDouble10957 / 512.0);
        anInt10954++;
        aShort9120 = aShort9124 = (short) (int) (aDouble10921 / 512.0);
    }

    final void method811(int i) {
        anInt10944++;
        if (i != 27811) {
            anInt10920 = -9;
        }
        throw new IllegalStateException();
    }

    final void method816(int i, boolean bool, int i_6_, byte b, int i_7_, Animable animable) {
        if (b >= 101) {
            anInt10918++;
            throw new IllegalStateException();
        }
    }

    private DrawableModel method896(int i, GraphicsToolkit graphicstoolkit) {
        anInt10952++;
        Class195 class195 = Class16.aClass101_228.method1090(anInt10948);
        return class195.method1989(anAnimator10955, (byte) 2, i, graphicstoolkit);
    }

    final void method897() {
        anInt10953++;
        if (anEntityNode_Sub4_10943 != null) {
            anEntityNode_Sub4_10943.method953();
        }
    }

    final boolean method813(int i) {
        if (i != 0) {
            return true;
        }
        anInt10932++;
        return aBoolean10940;
    }

    final void method898() {
        anInt10928++;
        if (!aBoolean10951) {
            if (anInt10934 != 0) {
                Actor actor = null;
                if (aa.anInt101 == 3) {
                    actor = Class121.aClass206Array1529[anInt10934 - 1].method2037(-61);
                } else if (anInt10934 < 0) {
                    int i = -1 - anInt10934;
                    if (Class166.myPlayerIndex == i) {
                        actor = Class295.myPlayer;
                    } else {
                        actor = Class270_Sub2.LOCAL_PLAYERS[i];
                    }
                } else {
                    int i = anInt10934 - 1;
                    Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, i);
                    if (node_sub41 != null) {
                        actor = node_sub41.aNpc7518;
                    }
                }
                if (actor != null) {
                    anInt5940 = actor.anInt5940;
                    anInt5934 = actor.anInt5934;
                    anInt5937 = Node_Sub38_Sub7.method2809(plane, -29754, actor.anInt5940, actor.anInt5934) - anInt10956;
                    if (anInt10920 >= 0) {
                        Class259 class259 = actor.method868((byte) -128);
                        int i = 0;
                        int i_10_ = 0;
                        if (Objects.requireNonNull(class259).anIntArrayArray3273 != null && class259.anIntArrayArray3273[anInt10920] != null) {
                            i_10_ += class259.anIntArrayArray3273[anInt10920][2];
                            i += class259.anIntArrayArray3273[anInt10920][0];
                        }
                        if (class259.anIntArrayArray3249 != null && class259.anIntArrayArray3249[anInt10920] != null) {
                            i_10_ += class259.anIntArrayArray3249[anInt10920][2];
                            i += class259.anIntArrayArray3249[anInt10920][0];
                        }
                        if (i != 0 || i_10_ != 0) {
                            int i_11_ = actor.aClass99_10893.method1086(16383);
                            int i_12_ = i_11_;
                            if (actor.anIntArray10881 != null && actor.anIntArray10881[anInt10920] != -1) {
                                i_12_ = actor.anIntArray10881[anInt10920];
                            }
                            int i_13_ = -i_11_ + i_12_ & 0x3fff;
                            int i_14_ = Class335.anIntArray4167[i_13_];
                            int i_15_ = Class335.anIntArray4165[i_13_];
                            int i_16_ = i_14_ * i_10_ + (i_15_ * i) >> 14;
                            i_10_ = i_10_ * i_15_ - i_14_ * i >> 14;
                            i = i_16_;
                            anInt5940 += i_10_;
                            anInt5934 += i;
                        }
                    }
                }
            }
        }
    }

    final boolean method814() {
        anInt10936++;
        return false;
    }

    final int method823() {
        anInt10922++;
        return anInt10914;
    }

    private void method899(GraphicsToolkit graphicstoolkit, Class336 class336, DrawableModel drawablemodel) {
        drawablemodel.method614(class336);
        anInt10924++;
        Class300[] class300s = drawablemodel.method620();
        Class218[] class218s = drawablemodel.method618();
        if ((anEntityNode_Sub4_10943 == null || anEntityNode_Sub4_10943.aBoolean5972) && (class300s != null || class218s != null)) {
            anEntityNode_Sub4_10943 = EntityNode_Sub4.method963(Class174.clientCycle, true);
        }
        if (anEntityNode_Sub4_10943 != null) {
            anEntityNode_Sub4_10943.method952(graphicstoolkit, Class174.clientCycle, class300s, class218s);
            anEntityNode_Sub4_10943.method967(plane);
        }
    }

    public static void method900() {

        aClass104_10947 = null;
    }

    final boolean method821(int i) {
        if (i != 0) {
            return true;
        }
        anInt10929++;
        return false;
    }

    final void method820(GraphicsToolkit graphicstoolkit, int i) {
        if (i != -5) {
            aClass104_10947 = null;
        }
        anInt10949++;
        DrawableModel drawablemodel = method896(0, graphicstoolkit);
        if (drawablemodel != null) {
            Class336 class336 = graphicstoolkit.A();
            class336.method3865(anInt10931);
            class336.method3856(anInt10919);
            class336.method3863((int) aDouble10957, (int) aDouble10925, (int) aDouble10921);
            anInt10950 = drawablemodel.fa();
            anInt10914 = drawablemodel.ma();
            method899(graphicstoolkit, class336, drawablemodel);
        }
    }

    final EntityNode_Sub6 method807(GraphicsToolkit graphicstoolkit) {
        anInt10945++;
        DrawableModel drawablemodel = method896(2048, graphicstoolkit);
        if (drawablemodel == null) {
            return null;
        }
        Class336 class336 = graphicstoolkit.A();
        class336.method3865(anInt10931);
        class336.method3856(anInt10919);
        class336.method3863((int) aDouble10957, (int) aDouble10925, (int) aDouble10921);
        method899(graphicstoolkit, class336, drawablemodel);
        EntityNode_Sub6 entitynode_sub6 = Class345.method3972(false, 1);
        if (Node_Sub15_Sub10.aBoolean9850) {
            drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
        } else {
            drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
        }
        if (anEntityNode_Sub4_10943 != null) {
            Class198 class198 = anEntityNode_Sub4_10943.method954();
            if (Node_Sub15_Sub10.aBoolean9850) {
                graphicstoolkit.a(class198, Class308.anInt3912);
            } else {
                graphicstoolkit.a(class198);
            }
        }
        aBoolean10940 = drawablemodel.F();
        anInt10950 = drawablemodel.fa();
        anInt10914 = drawablemodel.ma();
        return entitynode_sub6;
    }

    protected final void finalize() {
        if (anEntityNode_Sub4_10943 != null) {
            anEntityNode_Sub4_10943.method953();
        }
        anInt10926++;
    }

    final boolean method810(int i, int i_18_, boolean bool, GraphicsToolkit graphicstoolkit) {
        if (bool) {
            aDouble10925 = -0.10988590233715705;
        }
        anInt10946++;
        return false;
    }

    final void method901(int i) {
        aDouble10957 += (double) i * aDouble10939;
        aBoolean10951 = true;
        aDouble10921 += (double) i * aDouble10916;
        anInt10911++;
        if (aBoolean10915) {
            aDouble10925 = Node_Sub38_Sub7.method2809(plane, -29754, (int) aDouble10921, (int) aDouble10957) - anInt10956;
        } else if (anInt10933 == -1) {
            aDouble10925 += aDouble10912 * (double) i;
        } else {
            aDouble10925 += (double) i * aDouble10912 + aDouble10917 * 0.5 * (double) i * (double) i;
            aDouble10912 += (double) i * aDouble10917;
        }
        anInt10919 = 0x3fff & 8192 + (int) (Math.atan2(aDouble10939, aDouble10916) * 2607.5945876176133);
        anInt10931 = 0x3fff & (int) (Math.atan2(aDouble10912, aDouble10927) * 2607.5945876176133);
        if (anAnimator10955.method248(-100, 1) && anAnimator10955.method238(-28)) {
            anAnimator10955.method235(0);
        }
    }

    Mobile_Sub1(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, boolean bool, int i_31_) {
        super(i_19_, i_20_, i_21_, -i_23_ + Node_Sub38_Sub7.method2809(i_19_, -29754, i_22_, i_21_), i_22_, i_21_ >> 9, i_21_ >> 9, i_22_ >> 9, i_22_ >> 9, false, (byte) 0);
        anInt10956 = i_23_;
        anInt10948 = i;
        anInt10958 = i_24_;
        anInt10920 = i_31_;
        aBoolean10915 = bool;
        anInt10942 = i_29_;
        aBoolean10951 = false;
        anInt10923 = i_25_;
        anInt10938 = i_30_;
        anInt10934 = i_28_;
        anInt10933 = i_26_;
        anInt10937 = i_27_;
        int i_32_ = Class16.aClass101_228.method1090(anInt10948).anInt2394;
        anAnimator10955 = new AnimableAnimator(this);
        anAnimator10955.method249(true, i_32_);
    }
}
