/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaggl.OpenGL;

abstract class Class117 {
    static int anInt1468;
    private final int anInt1469;
    static int anInt1470;
    static int anInt1471;
    static Node_Sub7 aNode_Sub7_1472;
    private int anInt1473;
    protected GLToolkit aGLToolkit1474;
    static IncommingPacket aClass192_1475 = new IncommingPacket(83, 7);
    protected int anInt1476;
    private final boolean aBoolean1477;
    static int anInt1478;
    static int anInt1479;

    protected final void finalize() throws Throwable {
        anInt1478++;
        aGLToolkit1474.method1414(anInt1473, anInt1476);
        super.finalize();
    }

    public static void method1164() {
        aClass192_1475 = null;
        aNode_Sub7_1472 = null;
    }

    final void method1165(int i, byte[] bs) {

        anInt1468++;
        method1167(-20931);
        if (i <= anInt1473) {
            OpenGL.glBufferSubDataARBub(anInt1469, 0, i, bs, 0);
        } else {
            OpenGL.glBufferDataARBub(anInt1469, i, bs, 0, !aBoolean1477 ? 35044 : 35040);
            aGLToolkit1474.anInt6623 += -anInt1473 + i;
            anInt1473 = i;
        }
    }

    static void method1166(int i, String string) {
        anInt1470++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 3, i);
        cachenode_sub2.method2288();
        cachenode_sub2.aString9428 = string;
    }

    abstract void method1167(int i);

    static void method1168(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt1471++;
        int i_7_ = 0;
        int i_8_ = i_2_;
        int i_9_ = i_4_ * i_4_;
        int i_10_ = i_2_ * i_2_;
        int i_11_ = i_10_ << 1;
        int i_12_ = i_9_ << 1;
        int i_13_ = i_2_ << 1;
        int i_14_ = i_11_ + (1 - i_13_) * i_9_;
        int i_15_ = -(i_12_ * (i_13_ - 1)) + i_10_;
        int i_16_ = i_9_ << 2;
        int i_17_ = i_10_ << 2;
        int i_18_ = i_11_ * (3);
        int i_19_ = i_12_ * (-3 + (i_8_ << 1));
        int i_20_ = (1 + i_7_) * i_17_;
        Class369.method4086(i_4_ + i_6_, i_5_, -i_4_ + i_6_, Class169_Sub4.anIntArrayArray8826[i], 0);
        int i_21_ = (i_3_ + i_8_) * i_16_;
        while (i_8_ > 0) {
            if (i_14_ < 0) {
                while (i_14_ < 0) {
                    i_15_ += i_20_;
                    i_14_ += i_18_;
                    i_7_++;
                    i_18_ += i_17_;
                    i_20_ += i_17_;
                }
            }
            if (i_15_ < 0) {
                i_15_ += i_20_;
                i_14_ += i_18_;
                i_18_ += i_17_;
                i_7_++;
                i_20_ += i_17_;
            }
            i_14_ -= i_21_;
            i_15_ -= i_19_;
            i_19_ -= i_16_;
            i_21_ -= i_16_;
            i_8_--;
            int i_22_ = i - i_8_;
            int i_23_ = i_8_ + i;
            int i_24_ = i_7_ + i_6_;
            int i_25_ = -i_7_ + i_6_;
            Class369.method4086(i_24_, i_5_, i_25_, Class169_Sub4.anIntArrayArray8826[i_22_], 0);
            Class369.method4086(i_24_, i_5_, i_25_, Class169_Sub4.anIntArrayArray8826[i_23_], i_3_ + 1);
        }
    }

    Class117(GLToolkit gltoolkit, int i, byte[] bs, int i_26_, boolean bool) {
        aGLToolkit1474 = gltoolkit;
        anInt1469 = i;
        aBoolean1477 = bool;
        anInt1473 = i_26_;
        OpenGL.glGenBuffersARB(1, GLXToolkit.anIntArray9221, 0);
        anInt1476 = GLXToolkit.anIntArray9221[0];
        method1167(-20931);
        OpenGL.glBufferDataARBub(i, anInt1473, bs, 0, !aBoolean1477 ? 35044 : 35040);
        aGLToolkit1474.anInt6623 += anInt1473;
    }

    Class117(GLToolkit gltoolkit, Buffer buffer, int i_27_) {
        anInt1473 = i_27_;
        aGLToolkit1474 = gltoolkit;
        anInt1469 = 34962;
        aBoolean1477 = false;
        OpenGL.glGenBuffersARB(1, GLXToolkit.anIntArray9221, 0);
        anInt1476 = GLXToolkit.anIntArray9221[0];
        method1167(-20931);
        OpenGL.glBufferDataARBa(34962, anInt1473, buffer.getAddress(), 35044);
        aGLToolkit1474.anInt6623 += anInt1473;
    }
}
