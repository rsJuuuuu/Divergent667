/* Class320_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub20 extends Class320 {
    static int anInt8394;
    static int anInt8395;
    static int anInt8396;
    static int anInt8397;
    static int anInt8398;
    static int anInt8399;
    static int anInt8400;
    static int anInt8401;
    static int anInt8402;

    static byte[] method3756(Class328 class328) {
        anInt8400++;
        byte[] bs = new byte[262144];
        Node_Sub24.method2647(bs, class328);
        return bs;
    }

    final boolean method3757() {
        anInt8396++;
        return Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791());
    }

    final int method3675(int i, byte b) {
        anInt8394++;
        if (b != 54) {
            return -10;
        }
        if (!Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791())) {
            return 3;
        }
        return 1;
    }

    final void method3673() {
        anInt8395++;
        if (aNode_Sub27_4063.aClass320_Sub29_7270.method3789() && !Class262_Sub3.method3157(aNode_Sub27_4063.aClass320_Sub29_7270.method3791())) {
            anInt4064 = 0;
        }
        if (anInt4064 < 0 || anInt4064 > 1) {
            anInt4064 = method3677();
        }
    }

    Class320_Sub20(Node_Sub27 node_sub27) {
        super(node_sub27);
    }

    final void method3676(int i) {
        anInt8399++;
        anInt4064 = i;
    }

    final int method3758() {
        anInt8398++;
        return anInt4064;
    }

    final int method3677() {
        anInt8401++;
        return 0;
    }

    Class320_Sub20(int i, Node_Sub27 node_sub27) {
        super(i, node_sub27);
    }
}
