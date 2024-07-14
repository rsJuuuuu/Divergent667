/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class166 implements Interface7 {
    protected int anInt5093;
    static int anInt5094;
    static int anInt5095;
    static int anInt5096;
    static Class61 aClass61_5097 = new Class61(50);
    static IncommingPacket aClass192_5098 = new IncommingPacket(112, 6);
    static int myPlayerIndex = -1;
    static int anInt5100;

    Class166(int i) {
        anInt5093 = i;
    }

    public static void method1745() {
        aClass192_5098 = null;
        aClass61_5097 = null;
    }

    public final Class170 method20(int i) {
        anInt5096++;
        if (i <= 81) {
            myPlayerIndex = 24;
        }
        return Class356.aClass170_4425;
    }

    static void method1746() {
        anInt5094++;
        Class61.aNode_Sub9_Sub1_885 = null;
        Class93_Sub2.aClass302_6049 = null;
        Class107.anInt1362 = 2;
        Class266.aBoolean3385 = false;
        Class17.anInt282 = 0;
        Class52.anInt800 = 1;
        CacheNode_Sub6.anInt9485 = -1;
        Class101.anInt1306 = -1;
    }

    static void method1747(IComponentDefinitions widget) {
        anInt5095++;
        if (Class87.removeWalkHere) {
            if (widget.anObjectArray4751 != null) {
                IComponentDefinitions widget_1_ = Node_Sub3.method2169(Class46.anInt681, Node_Sub15_Sub9.anInt9839);
                if (widget_1_ != null) {
                    Node_Sub37 node_sub37 = new Node_Sub37();
                    node_sub37.parameters = widget.anObjectArray4751;
                    node_sub37.aWidget7437 = widget;
                    node_sub37.aWidget7432 = widget_1_;
                    ClientScriptsExecutor.method3556(node_sub37);
                }
            }
            Node_Sub28.anInt7321++;
            Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class270.aClass318_3474, Class218.aClass123_2566.anIsaacCipher1571);
            Objects.requireNonNull(node_sub13).aPacket7113.writeIntV1(widget.ihash);
            node_sub13.aPacket7113.writeShort128(Class92.anInt1230);
            node_sub13.aPacket7113.writeShortLE128(Class46.anInt681);
            node_sub13.aPacket7113.writeIntV2(Node_Sub15_Sub9.anInt9839);
            node_sub13.aPacket7113.writeShort128(widget.anInt4718);
            node_sub13.aPacket7113.writeShortLE(widget.anInt4687);
            Class218.aClass123_2566.sendPacket(node_sub13);
        }
    }
}
