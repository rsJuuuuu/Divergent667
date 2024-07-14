/* Class320_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub7 extends Class320 {
    static int anInt8268;
    static int anInt8269;
    static int anInt8270;
    static int[] anIntArray8271 = new int[5];
    static int anInt8272;
    static int anInt8273;
    static int anInt8274;
    static Interface21[] anInterface21Array8275 = new Interface21[128];
    static int anInt8276;
    static int anInt8277;
    static int anInt8278;

    public static void method3706() {
        anInterface21Array8275 = null;
        anIntArray8271 = null;
    }

    static byte method3707(int i, int i_0_) {
        anInt8270++;
        if (i != 9) {
            return (byte) 0;
        }
        if ((0x1 & i_0_) == 0) {
            return (byte) 1;
        }
        return (byte) 2;
    }

    final int method3708() {
        anInt8273++;
        return anInt4064;
    }

    final boolean method3709() {
        anInt8274++;
        return !aNode_Sub27_4063.method2697(-114);
    }

    final int method3677(int i) {
        anInt8272++;
        if (i != 0) {
            return 84;
        }
        return 1;
    }

    final void method3673(byte b) {
        anInt8276++;
        if (b < -35) {
            if (aNode_Sub27_4063.method2697(-79)) {
                anInt4064 = 0;
            }
            if (anInt4064 != 1 && anInt4064 != 0) {
                anInt4064 = method3677(0);
            }
        }
    }

    Class320_Sub7(Node_Sub27 node_sub27) {
        super(node_sub27);
    }

    final int method3675(int i, byte b) {
        anInt8277++;
        if (aNode_Sub27_4063.method2697(-96)) {
            return 3;
        }
        if (b != 54) {
            method3711(-70);
        }
        return 1;
    }

    Class320_Sub7(int i, Node_Sub27 node_sub27) {
        super(i, node_sub27);
    }

    static void method3710() {
        anInt8268++;
        synchronized (Class186.aClass61_2247) {
            Class186.aClass61_2247.method598(5);
        }
    }

    final void method3676(int i) {
        anInt4064 = i;
        anInt8269++;
    }

    static boolean method3711(int i) {
        anInt8278++;
        return (0x100100 & i) != 0;
    }
}
