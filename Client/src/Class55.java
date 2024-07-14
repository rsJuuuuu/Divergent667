/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 {
    protected Interface7[] anInterface7Array825;
    static int anInt826;
    static int anInt827;
    static int anInt828;
    static Class346 aClass346_829 = new Class346();
    static int anInt830;
    protected int anInt831;
    protected int anInt832;
    static Class104 aClass104_833 = new Class104();
    static int[] anIntArray834;

    static void method558(String string) {
        anInt830++;
        Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660();
        node_sub13.aPacket7113.writeByte(Plane.aClass133_3419.packetId);

        node_sub13.aPacket7113.writeShort(0);
        int i = node_sub13.aPacket7113.offset;
        node_sub13.aPacket7113.writeShort(Settings.REVISION);
        int[] is = Class355.method4014(node_sub13);
        int i_0_ = node_sub13.aPacket7113.offset;
        node_sub13.aPacket7113.writeString(string);
        node_sub13.aPacket7113.writeByte(Class35.language);
        node_sub13.aPacket7113.offset += 7;
        node_sub13.aPacket7113.encryptXteas(is, i_0_, node_sub13.aPacket7113.offset);
        node_sub13.aPacket7113.method2194(-i + node_sub13.aPacket7113.offset);
        Class218.aClass123_2560.sendPacket(127, node_sub13);
        Node_Sub36_Sub4.anInt10073 = -3;
        Class51_Sub2.anInt9069 = 0;
        Class4.anInt124 = 1;
        Node_Sub54.anInt7683 = 0;
    }

    private Interface7 method559(BufferedStream buffer, Class170 class170) {
        anInt827++;
        if (Node_Sub40.aClass170_7508 == class170) {
            return Node_Sub9_Sub4.method2521(buffer);
        }
        if (Class46.aClass170_680 == class170) {
            return Class268.method3291(buffer);
        }
        if (class170 == Class96.aClass170_1273) {
            return Node_Sub9_Sub1.method2458(buffer);
        }
        if (Class350.aClass170_5391 == class170) {
            return Node_Sub38_Sub21.method2859(buffer);
        }
        if (Class262_Sub18.aClass170_7850 == class170) {
            return Node_Sub40.method2928(buffer);
        }
        if (class170 == Class169_Sub2.aClass170_8806) {
            return Class290_Sub5.method3436(buffer);
        }
        if (Class336_Sub3.aClass170_8613 == class170) {
            return Class380.method4169(buffer);
        }
        if (class170 == Class106.aClass170_1357) {
            return CacheNode_Sub12.method2341(buffer);
        }
        if (class170 == Class356.aClass170_4425) {
            return Class59.method588(buffer);
        }
        if (class170 == Class270.aClass170_3476) {
            return Node_Sub29.method2709(buffer);
        }
        return null;
    }

    public static void method560() {
        anIntArray834 = null;
        aClass346_829 = null;
        aClass104_833 = null;
    }

    final void method561(BufferedStream buffer) {
        anInt831 = buffer.readInt24();
        anInt828++;
        anInt832 = buffer.readUnsignedShort();
        anInterface7Array825 = new Interface7[buffer.readUnsignedByte()];
        Class170[] class170s = Class262_Sub13.method3184();
        for (int i = 0; i < anInterface7Array825.length; i++)
            anInterface7Array825[i] = method559(buffer, class170s[buffer.readUnsignedByte()]);
    }

    static void method562() {
        anInt826++;
        Class229.aGraphicsToolkit2732.xa(((float) Class213.aNode_Sub27_2512.aClass320_Sub22_7299.method3765() * 0.1F + 0.7F) * 1.1523438F);
        Class229.aGraphicsToolkit2732.ZA(Class42.anInt649, 0.69921875F, 1.2F, -200.0f, -240.0f, -200.0f);
        Class229.aGraphicsToolkit2732.L(Class320_Sub26.anInt8456, -1, 0);
        Class229.aGraphicsToolkit2732.a(GraphicsToolkit.aClass270_1548);
    }
}
