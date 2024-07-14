/* Class262_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub6 extends Class262 {
    static int anInt7742;
    static int anInt7743;
    static int anInt7744;
    static Class124 aClass124_7745 = new Class124(42);
    private final int anInt7746;
    private final int anInt7747;
    static IncommingPacket aClass192_7748 = new IncommingPacket(84, 6);

    Class262_Sub6(BufferedStream buffer) {
        super(buffer);
        anInt7747 = buffer.readUnsignedShort();
        anInt7746 = buffer.method2183();
    }

    final void method3148(int i) {
        anInt7742++;
        Class369 class369 = Node_Sub39.aClass369Array7497[anInt7747];
        if (i >= -102) {
            method3164(-55, false);
        }
        Class110.method1131(class369.anInt4557, class369.anInt4563, class369.anInt4556, anInt7746, class369.anInt4560, class369.anInt4552, Class248.anIntArray3145[class369.anInt4556]);
    }

    static void method3164(int key, boolean bool) {
        anInt7744++;
        Node_Sub16 node_sub16 = Class295.method3472(key, bool);
        if (node_sub16 != null) {
            int i_0_ = 0;

            for (/**/; node_sub16.anIntArray7137.length > i_0_; i_0_++) {
                node_sub16.anIntArray7137[i_0_] = -1;
                node_sub16.anIntArray7138[i_0_] = 0;
            }
        }
    }

    public static void method3165() {
        aClass192_7748 = null;
        aClass124_7745 = null;
    }

    static void drawTileStrings(int i_5_, int i_6_) {
        anInt7743++;
        for (TileMessage entitynode_sub2 = (TileMessage) Class226.aClass103_2684.method1113(); entitynode_sub2 != null; entitynode_sub2 = (TileMessage) Class226.aClass103_2684.method1108(88)) {
            if (Class174.clientCycle >= entitynode_sub2.completeCycle) {
                entitynode_sub2.method803();
            } else {
                Animable_Sub1.method826(2 * entitynode_sub2.height, (entitynode_sub2.x << 9) + 256, (entitynode_sub2.y << 9) + 256, entitynode_sub2.plane);
                Class262_Sub4.aClass52_7721.method537(0, (byte) 111, Class119.anIntArray1516[0] + i_6_, entitynode_sub2.message, Class119.anIntArray1516[1] + i_5_, entitynode_sub2.anInt5951 | -16777216);
            }
        }
    }
}
