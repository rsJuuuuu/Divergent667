/* Class320_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub23 extends Class320 {
    static int anInt8426;
    static int anInt8427;
    static int anInt8428;
    static int anInt8429;
    static int anInt8430;
    static int anInt8431;
    static Class123 aClass123_8432;
    static int anInt8433;
    static int anInt8434;
    static int anInt8435;

    final int method3675(int i, byte b) {
        anInt8430++;
        if (aNode_Sub27_4063.method2697(-90)) {
            return 3;
        }
        if (aNode_Sub27_4063.method2691(b - 51) == Node_Sub38_Sub34.aClass353_10443) {
            if (i == 0) {
                if (aNode_Sub27_4063.aClass320_Sub16_7316.method3744() == 1) {
                    return 2;
                }
                if (aNode_Sub27_4063.aClass320_Sub30_7275.method3796(false) == 1) {
                    return 2;
                }
                if (aNode_Sub27_4063.aClass320_Sub26_7269.method3779() > 0) {
                    return 2;
                }
            }
            return 1;
        }
        if (b != 54) {
            method3768();
        }
        return 3;
    }

    final void method3673() {
        anInt8428++;
        if (aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443) {
            if (aNode_Sub27_4063.method2697(-97)) {
                anInt4064 = 0;
            }
        } else {
            anInt4064 = 1;
        }
        if (anInt4064 != 0 && anInt4064 != 1) {
            anInt4064 = method3677();
        }
    }

    final void method3676(int i) {
        anInt4064 = i;
        anInt8426++;
    }

    public static void method3768() {
        aClass123_8432 = null;
    }

    final boolean method3769() {
        anInt8427++;
        if (aNode_Sub27_4063.method2697(-106)) {
            return false;
        }
        return aNode_Sub27_4063.method2691(3) == Node_Sub38_Sub34.aClass353_10443;
    }

    final int method3677() {
        anInt8429++;
        return 1;
    }

    Class320_Sub23(int i, Node_Sub27 node_sub27) {
        super(i, node_sub27);
    }

    final int method3770() {
        anInt8435++;
        return anInt4064;
    }

    Class320_Sub23(Node_Sub27 node_sub27) {
        super(node_sub27);
    }
}
