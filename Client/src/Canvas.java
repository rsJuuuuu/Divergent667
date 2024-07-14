/* Canvas - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas extends java.awt.Canvas {

    private static final long serialVersionUID = 1L;
    static int anInt68;
    static int anInt69 = 255;
    static int[] anIntArray70 = new int[8];
    static int anInt71;
    static int anInt72;
    static Color[] aColorArray73 = {new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
    static int anInt74;
    private final Component aComponent75;

    public final void update(Graphics graphics) {
        aComponent75.update(graphics);
        anInt68++;
    }

    public static void method124() {
        aColorArray73 = null;
        anIntArray70 = null;
    }

    static int method125(int i, int i_0_) {
        anInt71++;
        int i_1_;
        if (i_0_ <= 20000) {
            if (i_0_ <= 10000) {
                if (i_0_ <= 5000) {
                    i_1_ = 1;
                    Node_Sub36.method2752();
                } else {
                    i_1_ = 2;
                    Class194_Sub1.method1965();
                }
            } else {
                Class69.method736();
                i_1_ = 3;
            }
        } else {
            i_1_ = 4;
            Class262_Sub15.method3188();
        }
        if (i != Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791()) {
            Class213.aNode_Sub27_2512.method2690(100, i, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
            Translation.method300(i, false);
        }
        Node_Sub38_Sub31.method2893(1);
        return i_1_;
    }

    public final void paint(Graphics graphics) {
        anInt74++;
        aComponent75.paint(graphics);
    }

    static boolean method126(int i_2_, int i_3_) {
        anInt72++;
        return !(!Class219.method2094() && !Class253.method3103(i_2_, -119, i_3_));
    }

    Canvas(Component component) {
        aComponent75 = component;
    }
}
