/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;

public class Class247 {
    private Class382 aClass382_3109;
    private boolean aBoolean3110;
    private int anInt3111;
    private final Class312 aClass312_3112;
    private int anInt3113;
    private int anInt3114 = 1;
    static Class197 aClass197_3115;
    static int anInt3116;
    static int anInt3117;
    static int anInt3118;
    private int anInt3119;
    static int anInt3120;
    private final GLToolkit aGLToolkit3121;
    static boolean aBoolean3122 = false;
    static IncommingPacket aClass192_3123 = new IncommingPacket(110, -1);
    static int anInt3124;
    static int anInt3125;
    static int anInt3126;
    static int anInt3127;
    private Class382 aClass382_3128;
    private Class382 aClass382_3129;
    static OutcommingPacket aClass318_3130 = new OutcommingPacket(70, -1);
    private boolean aBoolean3131;
    private Class169_Sub2[] aClass169_Sub2Array3132;
    private boolean aBoolean3133;
    private boolean aBoolean3134;
    private Class169_Sub2 aClass169_Sub2_3135;
    private int anInt3136;
    private CacheNode_Sub17 aCacheNode_Sub17_3137;
    private CacheNode_Sub17 aCacheNode_Sub17_3138;
    private boolean aBoolean3139;
    private boolean aBoolean3140;
    static GLSprite aGLSprite3141;
    private int anInt3142;
    static Index aClass302_3143;
    static Calendar aCalendar3144 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    private boolean method3075() {
        if (aBoolean3139) {
            if (aCacheNode_Sub17_3137 != null) {
                aCacheNode_Sub17_3137.method2398();
                aCacheNode_Sub17_3137 = null;
            }
            if (aClass169_Sub2_3135 != null) {
                aClass169_Sub2_3135.method1761();
                aClass169_Sub2_3135 = null;
            }
            if (aClass382_3109 != null) {
                aCacheNode_Sub17_3137 = new CacheNode_Sub17(aGLToolkit3121, 6402, anInt3114, anInt3113, aGLToolkit3121.anInt6599);
            }
            if (aBoolean3140) {
                aClass169_Sub2_3135 = new Class169_Sub2(aGLToolkit3121, 34037, 6402, anInt3114, anInt3113);
            } else if (aCacheNode_Sub17_3137 == null) {
                aCacheNode_Sub17_3137 = new CacheNode_Sub17(aGLToolkit3121, 6402, anInt3114, anInt3113);
            }
            aBoolean3133 = true;
            aBoolean3131 = true;
            aBoolean3139 = false;
        }
        anInt3116++;
        if (aBoolean3134) {
            if (aCacheNode_Sub17_3138 != null) {
                aCacheNode_Sub17_3138.method2398();
                aCacheNode_Sub17_3138 = null;
            }
            if (aClass169_Sub2Array3132[0] != null) {
                aClass169_Sub2Array3132[0].method1761();
                aClass169_Sub2Array3132[0] = null;
            }
            if (aClass169_Sub2Array3132[1] != null) {
                aClass169_Sub2Array3132[1].method1761();
                aClass169_Sub2Array3132[1] = null;
            }
            if (aClass382_3109 != null) {
                aCacheNode_Sub17_3138 = new CacheNode_Sub17(aGLToolkit3121, anInt3142, anInt3114, anInt3113, aGLToolkit3121.anInt6599);
            }
            aClass169_Sub2Array3132[0] = new Class169_Sub2(aGLToolkit3121, 34037, anInt3142, anInt3114, anInt3113);
            aClass169_Sub2Array3132[1] = anInt3136 <= 1 ? null : new Class169_Sub2(aGLToolkit3121, 34037, anInt3142, anInt3114, anInt3113);
            aBoolean3133 = true;
            aBoolean3131 = true;
            aBoolean3134 = false;
        }
        if (aBoolean3131) {
            if (aClass382_3109 == null) {
                aGLToolkit3121.method1410(aClass382_3128);
                aClass382_3128.method4175(0);
                aClass382_3128.method4175(1);
                aClass382_3128.method4175(8);
                aClass382_3128.method4181(aClass169_Sub2Array3132[0], 0);
                if (anInt3136 > 1) {
                    aClass382_3128.method4181(aClass169_Sub2Array3132[1], 1);
                }
                if (aBoolean3140) {
                    aClass382_3128.method4181(aClass169_Sub2_3135, 8);
                } else {
                    aClass382_3128.method4178(aCacheNode_Sub17_3137, 8);
                }
                aGLToolkit3121.method1436(aClass382_3128, (byte) 13);
            } else {
                aGLToolkit3121.method1410(aClass382_3128);
                aClass382_3128.method4175(0);
                aClass382_3128.method4175(1);
                aClass382_3128.method4175(8);
                aClass382_3128.method4181(aClass169_Sub2Array3132[0], 0);
                if (anInt3136 > 1) {
                    aClass382_3128.method4181(aClass169_Sub2Array3132[1], 1);
                }
                if (aBoolean3140) {
                    aClass382_3128.method4181(aClass169_Sub2_3135, 8);
                }
                aGLToolkit3121.method1436(aClass382_3128, (byte) 23);
                aGLToolkit3121.method1410(aClass382_3109);
                aClass382_3109.method4175(0);
                aClass382_3109.method4175(8);
                aClass382_3109.method4178(aCacheNode_Sub17_3138, 0);
                aClass382_3109.method4178(aCacheNode_Sub17_3137, 8);
                aGLToolkit3121.method1436(aClass382_3109, (byte) 82);
            }
            aBoolean3131 = false;
            aBoolean3133 = true;
        }
        if (aBoolean3133) {
            aGLToolkit3121.method1410(aClass382_3129);
            aBoolean3133 = !aClass382_3129.method4180();
            aGLToolkit3121.method1436(aClass382_3129, (byte) 90);
        }
        return !aBoolean3133;
    }

    final void method3076() {
        anInt3118++;
        if (aBoolean3110) {
            if (aClass382_3109 != null) {
                aGLToolkit3121.method1481(aClass382_3109);
                int i = 16384;
                aGLToolkit3121.method1479(aClass382_3128);
                aClass382_3109.method4186();
                aClass382_3128.method4183(0);
                if (aBoolean3140) {
                    i |= 0x100;
                }
                OpenGL.glBlitFramebufferEXT(0, 0, anInt3114, anInt3113, 0, 0, anInt3114, anInt3113, i, 9728);
                aGLToolkit3121.method1431(aClass382_3109);
                aGLToolkit3121.method1447(aClass382_3128);
            }
            aGLToolkit3121.method1461();
            aGLToolkit3121.method1460(0);
            aGLToolkit3121.method1434(1);
            aGLToolkit3121.la();
            int i = 0;
            int i_0_ = 1;
            Node_Sub23 node_sub23;
            for (Node_Sub23 node_sub23_1_ = (Node_Sub23) aClass312_3112.method3613(); node_sub23_1_ != null; node_sub23_1_ = node_sub23) {
                node_sub23 = (Node_Sub23) aClass312_3112.method3620();
                int i_2_ = node_sub23_1_.method2623();
                for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
                    node_sub23_1_.method2629(aClass169_Sub2_3135, aClass169_Sub2Array3132[i], i_3_);
                    if (node_sub23 != null || i_3_ != -1 + i_2_) {
                        aClass382_3128.method4183(i_0_);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt3113);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, anInt3113);
                        OpenGL.glTexCoord2f((float) anInt3114, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt3114, anInt3113);
                        OpenGL.glTexCoord2f((float) anInt3114, (float) anInt3113);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt3114, 0);
                        OpenGL.glEnd();
                    } else {
                        aGLToolkit3121.method1436(aClass382_3128, (byte) 114);
                        aGLToolkit3121.method1465(0, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt3113);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(anInt3111, anInt3119);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(anInt3111, anInt3119 + anInt3113);
                        OpenGL.glTexCoord2f((float) anInt3114, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(anInt3114 + anInt3111, anInt3113 + anInt3119);
                        OpenGL.glTexCoord2f((float) anInt3114, (float) anInt3113);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(anInt3111 + anInt3114, anInt3119);
                        OpenGL.glEnd();
                    }
                    node_sub23_1_.method2625(i_3_);
                    i = 0x1 & 1 + i;
                    i_0_ = 1 + i_0_ & 0x1;
                }
            }
            aBoolean3110 = false;
        }
    }

    final boolean method3077(Node_Sub23 node_sub23) {
        anInt3127++;
        if (aClass382_3129 != null) {
            if (node_sub23.method2627() || node_sub23.method2635()) {
                aClass312_3112.method3625(node_sub23);
                method3078();
                if (method3075()) {
                    if (anInt3114 != -1 && anInt3113 != -1) {
                        node_sub23.method2632(anInt3114, anInt3113);
                    }
                    node_sub23.aBoolean7205 = true;
                    return true;
                }
            }
            method3082(node_sub23);
        }
        return false;
    }

    private void method3078() {
        anInt3125++;
        boolean bool = false;
        int i_4_ = 0;
        int i_5_ = 0;
        for (Node_Sub23 node_sub23 = (Node_Sub23) aClass312_3112.method3613(); node_sub23 != null; node_sub23 = (Node_Sub23) aClass312_3112.method3620()) {
            int i_6_ = node_sub23.method2630();
            if (i_4_ < i_6_) {
                i_4_ = i_6_;
            }
            i_5_ += node_sub23.method2623();
            bool |= node_sub23.method2631();
        }
        int i_7_;
        if (i_4_ == 2) {
            i_7_ = 34836;
        } else if (i_4_ == 1) {
            i_7_ = 34842;
        } else {
            i_7_ = 6408;
        }
        if (anInt3142 != i_7_) {
            anInt3142 = i_7_;
            aBoolean3134 = true;
        }
        int i_8_ = Math.min(anInt3136, 2);
        int i_9_ = Math.min(i_5_, 2);
        anInt3136 = i_5_;
        if (aBoolean3140 == !bool) {
            aBoolean3139 = true;
            aBoolean3140 = bool;
        }
        if (i_8_ != i_9_) {
            aBoolean3131 = aBoolean3134 = true;
        }
    }

    final boolean method3079() {
        anInt3120++;
        return aClass382_3129 != null;
    }

    final void method3080() {
        aCacheNode_Sub17_3137 = null;
        anInt3117++;
        aCacheNode_Sub17_3138 = null;
        aClass382_3129 = aClass382_3109 = aClass382_3128 = null;
        aClass169_Sub2Array3132 = null;
        aClass169_Sub2_3135 = null;
        if (!aClass312_3112.method3616()) {
            for (Node node = aClass312_3112.method3613(); node != aClass312_3112.aNode3958; node = node.aNode2800)
                ((Node_Sub23) Objects.requireNonNull(node)).method2626((byte) -127);
        }
        anInt3114 = anInt3113 = 1;
    }

    final boolean method3081(int i_10_, int i_11_, int i_12_, int i_13_) {
        anInt3124++;
        if (aClass382_3129 == null || aClass312_3112.method3616()) {
            return false;
        }
        if (i_10_ != anInt3114 || anInt3113 != i_12_) {
            anInt3114 = i_10_;
            anInt3113 = i_12_;
            for (Node node = aClass312_3112.method3613(); aClass312_3112.aNode3958 != node; node = node.aNode2800)
                ((Node_Sub23) Objects.requireNonNull(node)).method2632(anInt3114, anInt3113);
            aBoolean3134 = true;
            aBoolean3139 = true;
            aBoolean3131 = true;
        }
        if (method3075()) {
            anInt3119 = i_13_;
            aBoolean3110 = true;
            anInt3111 = i_11_;
            aGLToolkit3121.method1410(aClass382_3129);
            aClass382_3129.method4183(0);
            aGLToolkit3121.method1465(anInt3113 - (-anInt3119 + aGLToolkit3121.anInt6567), -anInt3111);
            return true;
        }
        return false;
    }

    final void method3082(Node_Sub23 node_sub23) {
        anInt3126++;
        node_sub23.aBoolean7205 = false;
        node_sub23.method2626((byte) -128);
        node_sub23.method2160();
        method3078();
    }

    public static void method3083() {
        aClass302_3143 = null;
        aGLSprite3141 = null;
        aCalendar3144 = null;
        aClass318_3130 = null;
        aClass192_3123 = null;
        aClass197_3115 = null;
    }

    Class247(GLToolkit gltoolkit) {
        anInt3113 = 1;
        anInt3119 = 0;
        anInt3111 = 0;
        aClass312_3112 = new Class312();
        aClass169_Sub2Array3132 = new Class169_Sub2[2];
        aBoolean3131 = true;
        aBoolean3133 = true;
        anInt3136 = 0;
        aBoolean3140 = false;
        aBoolean3139 = true;
        aBoolean3134 = true;
        anInt3142 = -1;
        aGLToolkit3121 = gltoolkit;
        if (aGLToolkit3121.aBoolean6719 && aGLToolkit3121.aBoolean6649) {
            aClass382_3129 = aClass382_3128 = new Class382(aGLToolkit3121);
            if (aGLToolkit3121.anInt6599 > 1 && aGLToolkit3121.aBoolean6662 && aGLToolkit3121.aBoolean6735) {
                aClass382_3129 = aClass382_3109 = new Class382(aGLToolkit3121);
            }
        }
    }
}
