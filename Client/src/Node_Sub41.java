/* Node_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub41 extends Node {
    static Class129 aClass129_7515 = new Class129(1);
    static int anInt7516;
    static int anInt7517;
    protected Npc aNpc7518;
    static Class114 aClass114_7519 = new Class114();

    public static void method2930() {
        aClass114_7519 = null;
        aClass129_7515 = null;
    }

    static int method2931(byte b) {
        anInt7516++;
        boolean bool = false;
        boolean bool_0_ = false;
        boolean bool_1_ = false;
        if (Class240.aSignLink2946.aBoolean4005 && !Class240.aSignLink2946.aBoolean3985) {
            bool = !(Node_Sub23.aNode_Sub39_7201.anInt7484 < 512 && Node_Sub23.aNode_Sub39_7201.anInt7484 != 0);
            if (SignLink.aString3981.startsWith("win")) {
                bool_1_ = true;
                bool_0_ = true;
            } else {
                bool_0_ = true;
            }
        }
        if (Class370.aBoolean4570) {
            bool_0_ = false;
        }
        if (Class270_Sub2_Sub1.aBoolean10549) {
            bool_1_ = false;
        }
        if (Class243.aBoolean3075) {
            bool = false;
        }
        if (!bool && !bool_0_ && !bool_1_) {
            return Class332.method3844();
        }

        int i_2_ = -1;
        int i_3_ = -1;
        int i_4_ = -1;
        if (bool) {
            try {
                i_2_ = Class194.method1961(1000, 2);
            } catch (Exception exception) {
                /* empty */
            }
        }
        do {
            if (bool_1_) {
                try {
                    i_4_ = Class194.method1961(1000, 3);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 3) {
                        Renderer renderer = Class93.aGraphicsToolkit1241.c();
                        long l = renderer.aLong3661 & 0xffffffffffffL;
                        int i_5_ = renderer.anInt3656;
                        if (i_5_ == 4318) {
                            bool_0_ = bool_0_ & l >= 64425238954L;
                            break;
                        } else if (i_5_ != 4098) {
                            break;
                        }
                        bool_0_ = bool_0_ & l >= 60129613779L;
                    }
                } catch (Exception exception) {
                    /* empty */
                }
            }
        } while (false);
        if (bool_0_) {
            try {
                i_3_ = Class194.method1961(1000, 1);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (i_2_ == -1 && i_3_ == -1 && i_4_ == -1) {
            return Class332.method3844();
        }
        i_3_ *= 1.1F;
        i_4_ *= 1.1F;
        if (i_4_ < i_2_ && i_2_ > i_3_) {
            return Class339_Sub8.method3945(i_2_);
        }
        if (i_3_ < i_4_) {
            return Canvas.method125(3, i_4_);
        }
        return Canvas.method125(1, i_3_);
    }

    Node_Sub41(Npc npc) {
        aNpc7518 = npc;
    }

    static boolean method2932(int i, int i_6_, int i_7_) {
        anInt7517++;
        if (i > -59) {
            method2932(111, -62, 11);
        }
        if (!CacheNode_Sub11.method2336(i_6_)) {
            return false;
        }
        if (Class46.method470(i_6_) | (0x9000 & i_6_) != 0 | Class234.method2150(i_7_, i_6_)) {
            return true;
        }
        return (0x37 & i_7_) == 0 & (Class278.method3367(i_6_) | (0x2000 & i_6_) != 0 | Class320_Sub9.method3713(i_6_));
    }
}
