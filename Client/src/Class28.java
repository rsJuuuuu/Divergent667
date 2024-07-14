/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class28 {
    static int anInt467;
    static int anInt468;
    static int anInt469;

    static void method331(String string, String string_0_, int i_1_, String string_2_, String string_3_, int i_4_) {
        Node_Sub50.method2966(string_3_, string_0_, -1, string, null, i_1_, string_2_, i_4_);
        anInt467++;
    }

    static void method332(IComponentDefinitions widget) {
        anInt469++;
        IComponentDefinitions widget_6_ = Class295.method3468((byte) -105, widget);
        int i_7_;
        int i_8_;
        if (widget_6_ == null) {
            i_7_ = Class205.screenHeight;
            i_8_ = Class360.screenWidth;
        } else {
            i_8_ = widget_6_.anInt4809;
            i_7_ = widget_6_.anInt4695;
        }
        Node_Sub39.method2921(false, i_7_, i_8_, widget);
        Node_Sub38_Sub23.method2862(widget, i_8_, i_7_);
    }

    static void method333(Class37 class37) {
        anInt468++;
        Class367.aClass37_4540 = class37;
    }
}
