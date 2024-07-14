/* Class169_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

public class Class169_Sub1 extends Class169 {
    static boolean aBoolean8783 = false;
    static int anInt8784;
    static IncommingPacket aClass192_8785 = new IncommingPacket(91, -1);
    private int anInt8786 = -1;
    static int anInt8787;
    static boolean[] aBooleanArray8788;
    static int anInt8789;
    static int anInt8790;
    private int anInt8791 = -1;
    static int anInt8792;
    protected int anInt8793;

    final void method1767(int i, int i_0_, int i_1_) {
        anInt8792++;
        OpenGL.glFramebufferTexture2DEXT(i_1_, i_0_, i, anInt4960, 0);
        anInt8791 = i_0_;

        anInt8786 = i_1_;
    }

    static void method1768() {
        if (Class320_Sub6.anObject8265 == null) {
            Class188_Sub1_Sub1 class188_sub1_sub1 = new Class188_Sub1_Sub1();
            byte[] bs = class188_sub1_sub1.method1896();
            Class320_Sub6.anObject8265 = Class135.method1588(bs);
        }
        anInt8790++;
        if (Class347.anObject4286 == null) {
            Class188_Sub2_Sub2 class188_sub2_sub2 = new Class188_Sub2_Sub2();
            byte[] bs = class188_sub2_sub2.method1913();
            Class347.anObject4286 = Class135.method1588(bs);
        }
    }

    static void method1769(int i_4_, int i_5_) {
        if (Class339_Sub7.anInt8728 != i_5_) {
            CacheNode_Sub3.anIntArray9442 = new int[i_5_];
            for (int i_6_ = 0; i_5_ > i_6_; i_6_++)
                CacheNode_Sub3.anIntArray9442[i_6_] = (i_6_ << 12) / i_5_;
            Class303.anInt3824 = i_5_ - 1;
            Class339_Sub7.anInt8728 = i_5_;
            Class359.anInt4468 = 32 * i_5_;
        }
        anInt8784++;
        if (Node_Sub38_Sub1.anInt10083 != i_4_) {
            if (i_4_ == Class339_Sub7.anInt8728) {
                Node_Sub25_Sub1.anIntArray9941 = CacheNode_Sub3.anIntArray9442;
            } else {
                Node_Sub25_Sub1.anIntArray9941 = new int[i_4_];
                for (int i_7_ = 0; i_7_ < i_4_; i_7_++)
                    Node_Sub25_Sub1.anIntArray9941[i_7_] = (i_7_ << 12) / i_4_;
            }
            r_Sub2.anInt11054 = i_4_ - 1;
            Node_Sub38_Sub1.anInt10083 = i_4_;
        }
    }

    Class169_Sub1(GLToolkit gltoolkit, byte[][] bs) {
        super(gltoolkit, 34067, 6406, 24576, false);
        anInt8793 = 64;
        aGLToolkit4947.method1444(-2, this);
        for (int i_10_ = 0; i_10_ < 6; i_10_++)
            OpenGL.glTexImage2Dub(i_10_ + 34069, 0, anInt4950, 64, 64, 0, 6406, 5121, bs[i_10_], 0);
        this.method1757(true);
    }

    Class169_Sub1(GLToolkit gltoolkit, int i_11_) {
        super(gltoolkit, 34067, 6408, 6 * i_11_ * i_11_, false);
        anInt8793 = i_11_;
        aGLToolkit4947.method1444(-2, this);
        for (int i_12_ = 0; i_12_ < 6; i_12_++)
            OpenGL.glTexImage2Dub(i_12_ + 34069, 0, anInt4950, i_11_, i_11_, 0, Class320_Sub16.method3742(anInt4950), 5121, null, 0);
        this.method1757(true);
    }

    public final void method5(int i) {
        OpenGL.glFramebufferTexture2DEXT(anInt8786, anInt8791, 3553, i, 0);
        anInt8789++;
        anInt8791 = -1;
        anInt8786 = -1;
    }

    Class169_Sub1(GLToolkit gltoolkit, int i_13_, boolean bool, int[][] is) {
        super(gltoolkit, 34067, 6407, i_13_ * i_13_ * 6, bool);
        anInt8793 = i_13_;
        aGLToolkit4947.method1444(-2, this);
        if (bool) {
            for (int i_15_ = 0; i_15_ < 6; i_15_++)
                Class258.method3124(i_13_, i_15_ + 34069, is[i_15_], anInt4950, i_13_, aGLToolkit4947.anInt6740);
        } else {
            for (int i_14_ = 0; i_14_ < 6; i_14_++)
                OpenGL.glTexImage2Di(34069 + i_14_, 0, anInt4950, i_13_, i_13_, 0, 32993, aGLToolkit4947.anInt6740, is[i_14_], 0);
        }
        this.method1757(true);
    }

    public static void method1770() {
        aBooleanArray8788 = null;
        aClass192_8785 = null;
    }
}
