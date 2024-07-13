/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class128 {
    static int anInt1647;
    static int anInt1648;
    static int anInt1649;
    private final Index index22;
    static OutcommingPacket aClass318_1651 = new OutcommingPacket(5, 4);
    static int anInt1652;
    static int anInt1653;
    static int anInt1654;
    static int anInt1655;
    private Class61 aClass61_1656 = new Class61(64);
    static int anInt1657;
    static OutcommingPacket aClass318_1658 = new OutcommingPacket(45, 7);
    static int anInt1659;
    static OutcommingPacket aClass318_1660 = new OutcommingPacket(75, 4);

    final void method1543(int i_0_) {
        synchronized (aClass61_1656) {
            aClass61_1656.method608(false);
            aClass61_1656 = new Class61(i_0_);
        }
        anInt1649++;
    }

    static void method1544(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt1653++;
        if (i_3_ >= 1 && i >= 1 && i_3_ <= -2 + Node_Sub54.GAME_SCENE_WDITH && i <= -2 + Class377_Sub1.GAME_SCENE_HEIGHT) {
            int i_9_ = i_6_;
            if (i_9_ < 3 && Class238.method3021(i, i_3_, 106)) {
                i_9_++;
            }
            if (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751() == 0 && !Class369.method4085(i, Class94.anInt1249, i_3_, i_9_) || Class175.aClass261ArrayArrayArray2099 == null) {
                return;
            }
            Node_Sub38_Sub1.aClass277_Sub1_10084.method3359(i_5_, i, Class304.SCENE_CLIP_DATA_PLANES[i_6_], i_6_, i_3_, Class93.aGraphicsToolkit1241);
            if (i_8_ >= 0) {
                int i_10_ = Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3701();
                Class213.aNode_Sub27_2512.method2690(108, 1, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
                Node_Sub38_Sub1.aClass277_Sub1_10084.method3352(i_1_, i_8_, Class304.SCENE_CLIP_DATA_PLANES[i_6_], i, Class93.aGraphicsToolkit1241, i_3_, i_2_, -102, i_9_, i_6_, i_4_);
                Class213.aNode_Sub27_2512.method2690(33, i_10_, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
            }
        }
    }

    public static void method1545() {
        aClass318_1660 = null;
        aClass318_1651 = null;
        aClass318_1658 = null;
    }

    final void method1546() {
        synchronized (aClass61_1656) {
            aClass61_1656.method602((byte) -128);
        }
        anInt1652++;
    }

    static boolean method1547(int i, int i_13_, int i_14_) {
        anInt1657++;
        if (i_14_ == 11) {
            i_14_ = 10;
        }
        if (i_13_ != 1) {
            return true;
        }
        ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(i, 61);
        if (i_14_ >= 5 && i_14_ <= 8) {
            i_14_ = 4;
        }
        return Objects.requireNonNull(objectdefinition).method3041(i_14_, 31);
    }

    static Class262 method1548(BufferedStream buffer) {
        anInt1647++;
        int i = buffer.readUnsignedByte();
        Class124 class124 = Node_Sub38_Sub24.method2869(i);
        Class262 class262 = null;
        while_134_:
        do {
            while_133_:
            do {
                while_132_:
                do {
                    while_131_:
                    do {
                        while_130_:
                        do {
                            while_129_:
                            do {
                                while_128_:
                                do {
                                    while_127_:
                                    do {
                                        while_126_:
                                        do {
                                            while_125_:
                                            do {
                                                while_124_:
                                                do {
                                                    while_123_:
                                                    do {
                                                        while_122_:
                                                        do {
                                                            while_121_:
                                                            do {
                                                                while_120_:
                                                                do {
                                                                    while_119_:
                                                                    do {
                                                                        while_118_:
                                                                        do {
                                                                            while_117_:
                                                                            do {
                                                                                while_116_:
                                                                                do {
                                                                                    while_115_:
                                                                                    do {
                                                                                        while_114_:
                                                                                        do {
                                                                                            while_113_:
                                                                                            do {
                                                                                                while_112_:
                                                                                                do {
                                                                                                    while_111_:
                                                                                                    do {
                                                                                                        while_110_:
                                                                                                        do {
                                                                                                            while_109_:
                                                                                                            do {
                                                                                                                do {
                                                                                                                    if (Class194_Sub1_Sub1.aClass124_9368 == class124) {
                                                                                                                        class262 = new Class262_Sub16(buffer);//sendobject or destroy?
                                                                                                                        break while_134_;
                                                                                                                    } else if (EntityNode_Sub8.aClass124_6024 != class124) {
                                                                                                                        if (Node_Sub16.aClass124_7132 == class124) {
                                                                                                                            break;
                                                                                                                        } else if (class124 != Class262_Sub21.aClass124_7865) {
                                                                                                                            if (Class233.aClass124_2784 == class124) {
                                                                                                                                break while_110_;
                                                                                                                            } else if (Class320_Sub6.aClass124_8267 != class124) {
                                                                                                                                if (class124 == Animable_Sub3.aClass124_9141) {
                                                                                                                                    break while_112_;
                                                                                                                                } else if (class124 != Class262_Sub6.aClass124_7745) {
                                                                                                                                    if (class124 == Class320_Sub5.aClass124_8253) {
                                                                                                                                        break while_114_;
                                                                                                                                    } else if (class124 != Class144_Sub4.aClass124_6846) {
                                                                                                                                        if (Class155.aClass124_1955 == class124) {
                                                                                                                                            break while_116_;
                                                                                                                                        } else if (class124 != CacheNode_Sub16_Sub1.aClass124_11076) {
                                                                                                                                            if (Class144_Sub4.aClass124_6838 == class124) {
                                                                                                                                                break while_118_;
                                                                                                                                            } else if (class124 != CacheNode_Sub4.aClass124_9463) {
                                                                                                                                                if (Class188.aClass124_2291 == class124) {
                                                                                                                                                    break while_120_;
                                                                                                                                                } else if (class124 != Class10.aClass124_169) {
                                                                                                                                                    if (class124 == Node_Sub25_Sub2.aClass124_9957) {
                                                                                                                                                        break while_122_;
                                                                                                                                                    } else if (class124 != Class274.aClass124_4975) {
                                                                                                                                                        if (Class127.aClass124_1638 == class124) {
                                                                                                                                                            break while_124_;
                                                                                                                                                        } else if (Animable_Sub3.aClass124_9135 != class124) {
                                                                                                                                                            if (Node_Sub38_Sub23.aClass124_10344 == class124) {
                                                                                                                                                                break while_126_;
                                                                                                                                                            } else if (class124 != Class260.aClass124_5230) {
                                                                                                                                                                if (class124 == Class64.aClass124_5036) {
                                                                                                                                                                    break while_128_;
                                                                                                                                                                } else if (class124 != OutputStream_Sub1.aClass124_88) {
                                                                                                                                                                    if (AnimableAnimator.aClass124_5500 == class124) {
                                                                                                                                                                        break while_130_;
                                                                                                                                                                    } else if (Class362.aClass124_4494 != class124) {
                                                                                                                                                                        if (Class262_Sub12.aClass124_7785 == class124) {
                                                                                                                                                                            break while_132_;
                                                                                                                                                                        } else if (class124 != Node_Sub15_Sub4.aClass124_9793) {
                                                                                                                                                                            break while_134_;
                                                                                                                                                                        }
                                                                                                                                                                        break while_133_;
                                                                                                                                                                    }
                                                                                                                                                                    break while_131_;
                                                                                                                                                                }
                                                                                                                                                                break while_129_;
                                                                                                                                                            }
                                                                                                                                                            break while_127_;
                                                                                                                                                        }
                                                                                                                                                        break while_125_;
                                                                                                                                                    }
                                                                                                                                                    break while_123_;
                                                                                                                                                }
                                                                                                                                                break while_121_;
                                                                                                                                            }
                                                                                                                                            break while_119_;
                                                                                                                                        }
                                                                                                                                        break while_117_;
                                                                                                                                    }
                                                                                                                                    break while_115_;
                                                                                                                                }
                                                                                                                                break while_113_;
                                                                                                                            }
                                                                                                                            break while_111_;
                                                                                                                        }
                                                                                                                        break while_109_;
                                                                                                                    }
                                                                                                                    class262 = new Class262_Sub2(buffer); //sendobject or destroy?
                                                                                                                    break while_134_;
                                                                                                                } while (false);
                                                                                                                class262 = new Class262_Sub6(buffer); //object animation
                                                                                                                break while_134_;
                                                                                                            } while (false);
                                                                                                            class262 = new Class262_Sub12(buffer); //music
                                                                                                            break while_134_;
                                                                                                        } while (false);
                                                                                                        class262 = new Class262_Sub13(buffer); //sound 2
                                                                                                        break while_134_;
                                                                                                    } while (false);
                                                                                                    class262 = new Class262_Sub8(buffer); //music effect
                                                                                                    break while_134_;
                                                                                                } while (false);
                                                                                                class262 = new Class262_Sub14(buffer); //sound 1
                                                                                                break while_134_;
                                                                                            } while (false);
                                                                                            class262 = new Class262_Sub15_Sub1(buffer); //gfx on floor
                                                                                            break while_134_;
                                                                                        } while (false);
                                                                                        class262 = new Class262_Sub5(buffer); //message on tile
                                                                                        break while_134_;
                                                                                    } while (false);
                                                                                    class262 = new Class262_Sub4(buffer);
                                                                                    break while_134_;
                                                                                } while (false);
                                                                                class262 = new Class262_Sub18(buffer);
                                                                                break while_134_;
                                                                            } while (false);
                                                                            class262 = new Class262_Sub10(buffer); //setcamera pos
                                                                            break while_134_;
                                                                        } while (false);
                                                                        class262 = new Class262_Sub3(buffer); //create?
                                                                        break while_134_;
                                                                    } while (false);
                                                                    class262 = new Class262_Sub20(buffer); //delete ?
                                                                    break while_134_;
                                                                } while (false);
                                                                class262 = new Class262_Sub21(buffer);
                                                                break while_134_;
                                                            } while (false);
                                                            class262 = new Class262_Sub1(buffer); //forcemessage
                                                            break while_134_;
                                                        } while (false);
                                                        class262 = new Class262_Sub17(buffer); //emote
                                                        break while_134_;
                                                    } while (false);
                                                    class262 = new Class262_Sub9(buffer); //hit
                                                    break while_134_;
                                                } while (false);
                                                class262 = new Class262_Sub11(buffer);
                                                break while_134_;
                                            } while (false);
                                            class262 = new Class262_Sub15_Sub2(buffer); //anim
                                            break while_134_;
                                        } while (false);
                                        class262 = new Class262_Sub23(buffer, 1, 1);//forcemovement
                                        break while_134_;
                                    } while (false);
                                    class262 = new Class262_Sub23(buffer, 0, 1);//forcemovement
                                    break while_134_;
                                } while (false);
                                class262 = new Class262_Sub23(buffer, 0, 0);//forcemovement
                                break while_134_;
                            } while (false);
                            class262 = new Class262_Sub23(buffer, 1, 0); //forcemovement
                            break while_134_;
                        } while (false);
                        class262 = new Class262_Sub19(buffer, false); //sets mask
                        break while_134_;
                    } while (false);
                    class262 = new Class262_Sub19(buffer, true); //sets mask
                    break while_134_;
                } while (false);
                class262 = new Class262_Sub7(buffer); //runs clientscrit
                break while_134_;
            } while (false);
            class262 = new Class262_Sub22(buffer); //ends
        } while (false);
        return class262;
    }

    final ConfigDefinitions getConfigDefinitions(int i) {
        anInt1655++;
        ConfigDefinitions class70;
        synchronized (aClass61_1656) {
            class70 = (ConfigDefinitions) aClass61_1656.method607(i, 0);
        }
        if (class70 != null) {
            return class70;
        }
        byte[] bs;
        synchronized (index22) {
            bs = index22.method3524(Class169.method1762(i), Class273.method3315(i));
        }
        class70 = new ConfigDefinitions();
        if (bs != null) {
            class70.method737(new BufferedStream(bs));
        }
        synchronized (aClass61_1656) {
            aClass61_1656.method601(class70, 25566, i);
        }
        return class70;
    }

    static int method1550(int i_18_, int i_19_) {
        anInt1654++;
        int i_20_ = i_19_ >>> 31;
        return -i_20_ + (i_20_ + i_19_) / i_18_;
    }

    final void method1551() {
        synchronized (aClass61_1656) {
            aClass61_1656.method598(5);
        }
        anInt1659++;
    }

    final void method1552(byte b) {
        anInt1648++;
        synchronized (aClass61_1656) {
            aClass61_1656.method608(false);
            if (b != 101) {
                method1552((byte) -56);
            }
        }
    }

    Class128(Class353 class353, int i, Index class302) {
        index22 = class302;
        if (index22 != null) {
            int i_22_ = index22.method3526() - 1;
            index22.method3537(i_22_);
        }
    }
}
