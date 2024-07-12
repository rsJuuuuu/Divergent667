/* GraphicsBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Graphics;

abstract class GraphicsBuffer extends Node {
    static int anInt7141;
    protected int anInt7142;
    static int anInt7143;
    static int anInt7144;
    protected int[] anIntArray7145;
    protected int anInt7146;

    abstract void method2595(int i, int i_0_, Canvas canvas);

    static boolean method2596(int i_1_, int i_2_) {
        anInt7143++;
        return Class144_Sub2.method1634(i_2_, i_1_) & Node_Sub9_Sub4.method2522(0, i_1_, i_2_);
    }

    abstract void method2597(int i, int i_3_, int i_4_, Graphics graphics, int i_5_, int i_6_, int i_7_);

    static boolean method2598(int i_8_, int i_9_) {
        anInt7141++;
        return !((i_8_ & 0x800) == 0 || (i_9_ & 0x37) == 0);
    }

    public GraphicsBuffer() {
        /* empty */
    }
}
