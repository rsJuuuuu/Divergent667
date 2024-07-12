/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class219 {
    static int anInt2623;
    static int anInt2624;
    static int[] anIntArray2625 = {1, -1, -1, 1};
    static int anInt2626;
    static int anInt2627;
    static int anInt2628;

    static boolean method2094() {
        anInt2628++;
        return false;
    }

    static void method2095() {

        anInt2626++;
        Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613();
        boolean bool = Class58.aWidget861 != null || Class290_Sub6.anInt8116 > 0;
        int i_2_ = Objects.requireNonNull(node_sub5).method2270();
        int i_3_ = node_sub5.method2272();
        if (bool) {
            Class283.anInt3591 = 1;
        }
        if (bool) {
            Class194_Sub1.aCacheNode_Sub13_6893 = Node_Sub38_Sub23.aCacheNode_Sub13_10343;
        } else {
            Class134_Sub1.method1580(i_3_, Node_Sub38_Sub23.aCacheNode_Sub13_10343, i_2_);
        }
    }

    public static void method2096() {
        anIntArray2625 = null;

    }
}
