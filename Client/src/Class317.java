/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class317 {
    static int anInt4038 = -1;
    static int anInt4039;
    static int anInt4040;
    static int anInt4041;
    static int anInt4042;

    static int method3663(int i, int i_1_, boolean bool) {
        anInt4042++;
        Node_Sub16 node_sub16 = Class295.method3472(i, bool);
        if (node_sub16 == null) {
            return -1;
        }
        if (i_1_ < 0 || node_sub16.anIntArray7137.length <= i_1_) {
            return -1;
        }
        return node_sub16.anIntArray7137[i_1_];
    }

    static byte[] method3664(byte[] bs, int i_2_) {
        anInt4040++;
        byte[] bs_3_ = new byte[i_2_];
        Class311.method3608(bs, 0, bs_3_, 0, i_2_);
        return bs_3_;
    }

    static void method3665(int i, IComponentDefinitions widget, int i_4_) {
        anInt4041++;
        if (Class58.aWidget861 == null && !Class213.aBoolean2510 && (widget != null && Class308.method3585(widget, false) != null)) {
            Class58.aWidget861 = widget;
            Class186.aWidget2257 = Class308.method3585(widget, false);
            Class83.anInt5179 = i;
            Node_Sub5_Sub2.anInt9412 = i_4_;
            Class99.aBoolean1282 = false;
            RuntimeException_Sub1.anInt4916 = 0;
        }
    }
}
