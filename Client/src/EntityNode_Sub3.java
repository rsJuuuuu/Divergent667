/* EntityNode_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

class EntityNode_Sub3 extends EntityNode {
    static IncommingPacket aClass192_5959 = new IncommingPacket(14, 3);
    protected EntityNode_Sub3 anEntityNode_Sub3_5960;
    protected EntityNode_Sub3 anEntityNode_Sub3_5961;
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
        r var_r = null;
        for (int i_1_ = 1; i_1_ < Class159.anInt1995; i_1_++) {
            Plane plane = Node_Sub38_Sub37.aPlaneArray10466[i_1_];
            if (plane != null) {
                for (int i_2_ = 0; i_2_ < Node_Sub50.anInt7623; i_2_++) {
                    for (int i_3_ = 0; i_3_ < Class328.anInt4115; i_3_++) {
                        var_r = plane.fa(i_3_, i_2_, var_r);
                        if (var_r != null) {
                            int i_4_ = i_3_ << Class36.anInt549;
                            int i_5_ = i_2_ << Class36.anInt549;
                            for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
                                Plane plane_7_ = Node_Sub38_Sub37.aPlaneArray10466[i_6_];
                                if (plane_7_ != null) {
                                    int i_8_ = plane.method3251(i_2_, i_3_) - plane_7_.method3251(i_2_, i_3_);
                                    int i_9_ = plane.method3251(i_2_, i_3_ + 1) - plane_7_.method3251(i_2_, i_3_ + 1);
                                    int i_10_ = plane.method3251(i_2_ + 1, i_3_ + 1) - plane_7_.method3251(i_2_ + 1, i_3_ + 1);
                                    int i_11_ = plane.method3251(i_2_ + 1, i_3_) - plane_7_.method3251(i_2_ + 1, i_3_);
                                    plane_7_.CA(var_r, i_4_, (i_8_ + i_9_ + i_10_ + i_11_) / 4, i_5_);
                                }
                            }
                        }
                    }
                }
            }
        }
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
