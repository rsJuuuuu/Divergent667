/* EntityNode_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

class EntityNode_Sub3 extends EntityNode {
    static IncommingPacket aClass192_5959 = new IncommingPacket(14, 3);
    protected EntityNode_Sub3 anEntityNode_Sub3_5960;
    protected EntityNode_Sub3 anEntityNode_Sub3_5961;
    static int anInt5962;
    static int anInt5963;
    static int anInt5964;
    static int anInt5965;

    final void method937() {
        anInt5963++;
        if (anEntityNode_Sub3_5960 != null) {
            anEntityNode_Sub3_5960.anEntityNode_Sub3_5961 = anEntityNode_Sub3_5961;
            anEntityNode_Sub3_5961.anEntityNode_Sub3_5960 = anEntityNode_Sub3_5960;
            anEntityNode_Sub3_5960 = null;
            anEntityNode_Sub3_5961 = null;
        }
    }

    public static void method938() {
        aClass192_5959 = null;
    }

    static void method939() {
        Class203.method2028(Class159.anInt1995);
    }

    static boolean method940(int i_0_, int i_1_) {
        anInt5962++;
        return (i_1_ & 0x180) != 0;
    }

    public EntityNode_Sub3() {
        /* empty */
    }

    static void method941(BufferedStream buffer) {
        anInt5964++;
        byte[] bs = new byte[24];
        if (Class366.aSeekableFile4529 != null) {
            try {
                Class366.aSeekableFile4529.method3577(0L);
                Class366.aSeekableFile4529.method3574(bs);
                int i_2_;
                for (i_2_ = 0; i_2_ < 24; i_2_++) {
                    if (bs[i_2_] != 0) {
                        break;
                    }
                }
                if (i_2_ >= 24) {
                    throw new IOException();
                }
            } catch (Exception exception) {
                for (int i_3_ = 0; i_3_ < 24; i_3_++)
                    bs[i_3_] = (byte) -1;
            }
        }
        buffer.writeBytes(24, bs, 0);
    }
}
