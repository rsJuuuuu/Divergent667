/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class312 {
    static int anInt3954;
    static int anInt3955 = 0;
    static int anInt3956;
    static int anInt3957;
    protected Node aNode3958 = new Node();
    static int anInt3959;
    static boolean aBoolean3960 = false;
    static int anInt3961;
    static int anInt3962;
    static int anInt3963;
    static int anInt3964;
    static int anInt3965;
    static IncommingPacket aClass192_3966;
    static int anInt3967;
    static int[] anIntArray3968 = {16776960, 16711680, 65280, 65535, 16711935, 16777215};
    static int anInt3969;
    private Node aNode3970;
    static int anInt3971;
    static int anInt3972;
    static OutcommingPacket aClass318_3973;
    static int anInt3974;
    static int anInt3975;
    static OutcommingPacket aClass318_3976;
    static int anInt3977;

    public static void method3610() {
        aClass192_3966 = null;
        aClass318_3973 = null;
        anIntArray3968 = null;
        aClass318_3976 = null;
    }

    final void method3611(Node node, int i) {
        anInt3962++;
        if (node.aNode2799 != null) {
            node.method2160();
        }
        node.aNode2800 = aNode3958.aNode2800;
        if (i > -61) {
            aBoolean3960 = true;
        }
        node.aNode2799 = aNode3958;
        node.aNode2799.aNode2800 = node;
        node.aNode2800.aNode2799 = node;
    }

    static GraphicsToolkit method3612(d var_d, int i, int i_0_, int i_1_, java.awt.Canvas canvas) {
        anInt3954++;
        if (i_1_ != -25440) {
            method3624(-29);
        }
        return new oa(canvas, var_d, i, i_0_);
    }

    final Node method3613() {
        anInt3957++;
        Node node = aNode3958.aNode2800;
        if (node == aNode3958) {
            aNode3970 = null;
            return null;
        }
        aNode3970 = node.aNode2800;
        return node;
    }

    final void method3614() {
        anInt3975++;
        for (; ; ) {
            Node node = aNode3958.aNode2800;
            if (aNode3958 == node) {
                break;
            }
            node.method2160();
        }
        aNode3970 = null;
    }

    final int method3615(int i) {
        if (i >= -63) {
            aNode3970 = null;
        }
        anInt3963++;
        int i_2_ = 0;
        Node node = aNode3958.aNode2800;
        while (node != aNode3958) {
            node = node.aNode2800;
            i_2_++;
        }
        return i_2_;
    }

    final boolean method3616() {
        anInt3972++;
        return aNode3958 == aNode3958.aNode2800;
    }

    private void method3617(Node node, Class312 class312_3_) {
        anInt3967++;
        Node node_4_ = aNode3958.aNode2799;
        aNode3958.aNode2799 = node.aNode2799;

        node.aNode2799.aNode2800 = aNode3958;
        if (node != aNode3958) {
            node.aNode2799 = class312_3_.aNode3958.aNode2799;
            node.aNode2799.aNode2800 = node;
            node_4_.aNode2800 = class312_3_.aNode3958;
            class312_3_.aNode3958.aNode2799 = node_4_;
        }
    }

    static void method3618() {
        anInt3971++;
        if (Node_Sub38_Sub5.aBoolean10125) {
            while (EntityNode_Sub3_Sub1.anInt9163 < Class180.aClass377_Sub1Array2143.length) {
                Class377_Sub1 class377_sub1 = Class180.aClass377_Sub1Array2143[EntityNode_Sub3_Sub1.anInt9163];
                if (class377_sub1 == null || class377_sub1.anInt8779 != -1) {
                    EntityNode_Sub3_Sub1.anInt9163++;
                } else {
                    if (GLToolkit.aNode_Sub7_6558 == null) {
                        GLToolkit.aNode_Sub7_6558 = Animable.aClass193_5936.method1959(class377_sub1.aString8773);
                    }
                    int i_5_ = GLToolkit.aNode_Sub7_6558.anInt7060;
                    if (i_5_ == -1) {
                        break;
                    }
                    EntityNode_Sub3_Sub1.anInt9163++;
                    GLToolkit.aNode_Sub7_6558 = null;
                    class377_sub1.anInt8779 = i_5_;
                }
            }
        }
    }

    final Node method3619(int i) {
        anInt3974++;
        Node node = aNode3958.aNode2800;
        if (node == aNode3958) {
            return null;
        }
        node.method2160();
        if (i >= -64) {
            method3619(16);
        }
        return node;
    }

    final Node method3620() {
        anInt3956++;
        Node node = aNode3970;
        if (node == aNode3958) {
            aNode3970 = null;
            return null;
        }
        aNode3970 = node.aNode2800;
        return node;
    }

    final void method3621(Class312 class312_6_) {
        method3617(aNode3958.aNode2800, class312_6_);
        anInt3961++;
    }

    final Node method3622() {
        anInt3959++;
        Node node = aNode3958.aNode2799;
        if (node == aNode3958) {
            aNode3970 = null;
            return null;
        }
        aNode3970 = node.aNode2799;
        return node;
    }

    final Node method3623() {
        anInt3969++;
        Node node = aNode3970;
        if (node == aNode3958) {
            aNode3970 = null;
            return null;
        }
        aNode3970 = node.aNode2799;
        return node;
    }

    static Class244[] method3624(int i) {
        anInt3965++;
        if (i != 0) {
            method3612(null, 120, -92, -27, null);
        }
        if (Node_Sub52.aClass244Array7654 == null) {
            Class244[] class244s = Node_Sub38_Sub34.method2901(Class240.aSignLink2946, true);
            Class244[] class244s_7_ = new Class244[Objects.requireNonNull(class244s).length];
            int i_8_ = 0;
            int i_9_ = Class213.aNode_Sub27_2512.aClass320_Sub18_7303.method3749();
            while_228_:
            for (Class244 class244 : class244s) {
                if ((class244.anInt3079 <= 0 || class244.anInt3079 >= 24) && class244.anInt3084 >= 800 && class244.anInt3078 >= 600 && (i_9_ != 2 || class244.anInt3084 == 800 && class244.anInt3078 == 600) && (i_9_ != 1 || class244.anInt3084 <= 1024 && class244.anInt3078 <= 768)) {
                    for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
                        Class244 class244_12_ = class244s_7_[i_11_];
                        if (class244_12_.anInt3084 == class244.anInt3084 && class244.anInt3078 == class244_12_.anInt3078) {
                            if (class244_12_.anInt3079 < class244.anInt3079) {
                                class244s_7_[i_11_] = class244;
                            }
                            continue while_228_;
                        }
                    }
                    class244s_7_[i_8_] = class244;
                    i_8_++;
                }
            }
            Node_Sub52.aClass244Array7654 = new Class244[i_8_];
            Class311.method3605(class244s_7_, 0, Node_Sub52.aClass244Array7654, 0, i_8_);
            int[] is = new int[Node_Sub52.aClass244Array7654.length];
            for (int i_13_ = 0; i_13_ < Node_Sub52.aClass244Array7654.length; i_13_++) {
                Class244 class244 = Node_Sub52.aClass244Array7654[i_13_];
                is[i_13_] = class244.anInt3078 * class244.anInt3084;
            }
            Class271.method3313(Node_Sub52.aClass244Array7654, is);
        }
        return Node_Sub52.aClass244Array7654;
    }

    public Class312() {
        aNode3958.aNode2800 = aNode3958;
        aNode3958.aNode2799 = aNode3958;
    }

    final void method3625(Node node) {
        if (node.aNode2799 != null) {
            node.method2160();
        }
        anInt3964++;
        node.aNode2800 = aNode3958;
        node.aNode2799 = aNode3958.aNode2799;
        node.aNode2799.aNode2800 = node;
        node.aNode2800.aNode2799 = node;
    }

    static {
        aClass192_3966 = new IncommingPacket(82, 6);
        aClass318_3973 = new OutcommingPacket(46, 3);
        aClass318_3976 = new OutcommingPacket(87, 6);
    }
}
