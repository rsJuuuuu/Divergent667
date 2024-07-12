/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Arrays;

public class Class346 {
    static int anInt4273;
    static int anInt4274;
    static int[] anIntArray4275 = new int[128];
    static int anInt4276;
    static double aDouble4277;
    static int anInt4278;
    static int anInt4279;

    static boolean method3973(int i, int i_1_) {
        anInt4273++;
        return !(!Class377.method4127(i_1_, i) && !Class153.method1697(i_1_, i));
    }

    static GraphicsToolkit method3974(int i, int i_2_, d var_d, int i_3_, java.awt.Canvas canvas) {
        if (i_2_ != 31206) {
            return null;
        }
        anInt4279++;
        return new PureJavaToolkit(canvas, var_d, i, i_3_);
    }

    static void method3975(int i, int i_4_, IComponentDefinitions[] widgets) {
        for (IComponentDefinitions widget : widgets) {
            if (widget != null && widget.parentId == i_4_ && !Client.method112(widget)) {
                if (widget.type == 0) {
                    method3975(i, widget.ihash, widgets);
                    if (widget.aWidgetArray4793 != null) {
                        method3975(-18690, widget.ihash, widget.aWidgetArray4793);
                    }
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, widget.ihash);
                    if (node_sub2 != null) {
                        Class290_Sub1.method3424(-23620, node_sub2.interfaceId);
                    }
                }
                if (widget.type == 6 && widget.anInt4773 != -1) {
                    if (widget.anAnimator4755 == null) {
                        widget.anAnimator4755 = new FixedAnimator();
                        widget.anAnimator4755.method249(true, widget.anInt4773);
                    }
                    if (widget.anAnimator4755.method248(i ^ 0x496f, Node_Sub9_Sub1.anInt9637) && widget.anAnimator4755.method238(-54)) {
                        widget.anAnimator4755.method235(i + 18690);
                    }
                }
            }
        }
        if (i != -18690) {
            method3974(21, -8, null, -125, null);
        }
        anInt4276++;
    }

    public static void method3976() {
        anIntArray4275 = null;
    }

    public final String toString() {
        anInt4274++;
        throw new IllegalStateException();
    }

    static {
        Arrays.fill(anIntArray4275, -1);
        for (int i = 65; i <= 90; i++)
            anIntArray4275[i] = i - 65;
        for (int i = 97; i <= 122; i++)
            anIntArray4275[i] = -71 + i;
        for (int i = 48; i <= 57; i++)
            anIntArray4275[i] = 4 + i;
        anIntArray4275[42] = anIntArray4275[43] = 62;
        anIntArray4275[45] = anIntArray4275[47] = 63;
        anInt4278 = -1;
    }
}
