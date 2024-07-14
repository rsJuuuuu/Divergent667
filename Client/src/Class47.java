/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 {
    static int anInt682;
    static int anInt683;
    private long aLong684 = -1L;
    static int anInt685;
    private final Class312 aClass312_686 = new Class312();
    private long aLong687;
    static Class26 aClass26_688 = new Class26();
    static int[] anIntArray689 = new int[1];

    private void method472(BufferedStream buffer) {
        aLong687 = buffer.readLong();
        anInt685++;
        aLong684 = buffer.readLong();
        for (int i_0_ = buffer.readUnsignedByte(); i_0_ != 0; i_0_ = buffer.readUnsignedByte()) {
            Node_Sub36 node_sub36;
            if (i_0_ == 1) {
                node_sub36 = new Node_Sub36_Sub1();
            } else if (i_0_ == 4) {
                node_sub36 = new Node_Sub36_Sub2();
            } else if (i_0_ == 3) {
                node_sub36 = new Node_Sub36_Sub3();
            } else {
                if (i_0_ != 2) {
                    throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
                }
                node_sub36 = new Node_Sub36_Sub4();
            }
            node_sub36.method2756(buffer);
            aClass312_686.method3625(node_sub36);
        }
    }

    final void method473(Node_Sub43 node_sub43) {
        anInt682++;
        if (node_sub43.aLong2797 != aLong687 || aLong684 != node_sub43.aLong7537) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + node_sub43.aLong2797 + " updateNum:" + node_sub43.aLong7537 + " delta.clanHash:" + aLong687 + " updateNum:" + aLong684);
        }
        for (Node_Sub36 node_sub36 = (Node_Sub36) aClass312_686.method3613(); node_sub36 != null; node_sub36 = (Node_Sub36) aClass312_686.method3620())
            node_sub36.method2751(node_sub43);
        node_sub43.aLong7537++;
    }

    public static void method474() {

        aClass26_688 = null;
        anIntArray689 = null;
    }

    static void method475(int i_1_) {
        anInt683++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 17, i_1_);
        cachenode_sub2.method2291();
    }

    Class47(BufferedStream buffer) {
        method472(buffer);
    }
}
