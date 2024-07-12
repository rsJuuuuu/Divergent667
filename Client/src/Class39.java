/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class39 {
    private String aString570 = "null";
    static int anInt571;
    static int anInt572;
    static int anInt573;
    static int anInt574;
    static int anInt575;
    static int anInt576;
    static int anInt577;
    static int anInt578;
    private HashTable aHashTable579;
    static float aFloat580;
    static int anInt581;
    static int anInt582;
    private int anInt583;
    static OutcommingPacket aClass318_584 = new OutcommingPacket(11, 9);
    static int anInt585;
    private int anInt586;
    protected char aChar587;
    static int anInt588;
    private Object anObject589;
    static int anInt590;
    static int anInt591;
    protected char aChar592;
    static int anInt593;
    static int anInt594;

    final boolean method404(String string) {
        anInt581++;
        if (anObject589 == null) {
            return false;
        }
        if (aHashTable579 == null) {
            method409();
        }
        for (Node_Sub42 node_sub42 = (Node_Sub42) aHashTable579.method1518(3512, Class113.method1153(1, string)); node_sub42 != null; node_sub42 = (Node_Sub42) aHashTable579.method1524()) {
            if (node_sub42.aString7522.equals(string)) {
                return true;
            }
        }
        return false;
    }

    final void method405(BufferedStream buffer) {
        anInt590++;
        for (; ; ) {
            int i = buffer.readUnsignedByte();
            if (i == 0) {
                break;
            }
            method417(i, 24, buffer);
        }
    }

    final Node_Sub34 method406(int i_0_) {
        anInt574++;
        if (anObject589 == null) {
            return null;
        }
        if (aHashTable579 == null) {
            method419();
        }
        return (Node_Sub34) aHashTable579.method1518(3512, i_0_);
    }

    static void method407(float f, int i, int i_1_, float f_2_, int i_3_, float[] fs, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, float f_9_, float[] fs_10_, int i_11_) {
        i_4_ -= i_3_;
        anInt577++;
        i_1_ -= i_7_;
        i_6_ -= i_8_;
        float f_12_ = fs_10_[2] * (float) i_6_ + ((float) i_1_ * fs_10_[0] + fs_10_[1] * (float) i_4_);
        float f_13_ = (float) i_6_ * fs_10_[5] + (fs_10_[3] * (float) i_1_ + fs_10_[4] * (float) i_4_);
        if (i_5_ < 63) {
            method408(-127, 7, -96, -54, null);
        }
        float f_14_ = fs_10_[8] * (float) i_6_ + ((float) i_4_ * fs_10_[7] + fs_10_[6] * (float) i_1_);
        float f_15_;
        float f_16_;
        if (i == 0) {
            f_15_ = 0.5F + (-f_14_ + f_9_);
            f_16_ = 0.5F + (f_12_ + f);
        } else if (i == 1) {
            f_16_ = 0.5F + (f + f_12_);
            f_15_ = 0.5F + (f_9_ + f_14_);
        } else if (i == 2) {
            f_16_ = f - f_12_ + 0.5F;
            f_15_ = 0.5F + (-f_13_ + f_2_);
        } else if (i == 3) {
            f_16_ = 0.5F + (f_12_ + f);
            f_15_ = 0.5F + (-f_13_ + f_2_);
        } else if (i == 4) {
            f_16_ = f_9_ + f_14_ + 0.5F;
            f_15_ = f_2_ - f_13_ + 0.5F;
        } else {
            f_15_ = f_2_ - f_13_ + 0.5F;
            f_16_ = 0.5F + (-f_14_ + f_9_);
        }
        if (i_11_ == 1) {
            float f_18_ = f_16_;
            f_16_ = -f_15_;
            f_15_ = f_18_;
        } else if (i_11_ == 2) {
            f_15_ = -f_15_;
            f_16_ = -f_16_;
        } else if (i_11_ == 3) {
            float f_17_ = f_16_;
            f_16_ = f_15_;
            f_15_ = -f_17_;
        }
        fs[1] = f_15_;
        fs[0] = f_16_;
    }

    static void method408(int i, int i_19_, int i_20_, int i_21_, Index class302) {
        Class93_Sub2.aClass302_6049 = class302;
        Class266.aBoolean3385 = false;
        Class107.anInt1362 = i;
        Class61.aNode_Sub9_Sub1_885 = null;
        Class17.anInt282 = i_21_;
        anInt588++;
        Class52.anInt800 = 1;
        Class101.anInt1306 = i_20_;
        CacheNode_Sub6.anInt9485 = i_19_;
    }

    private void method409() {
        try {
            anInt571++;
            if (anObject589 instanceof HashTable) {
                HashTable hashtable = (HashTable) anObject589;
                aHashTable579 = new HashTable(hashtable.method1522(false));
                HashTable hashtable_27_ = new HashTable(hashtable.method1522(false));
                for (Node_Sub18 node_sub18 = (Node_Sub18) hashtable.method1516(); node_sub18 != null; node_sub18 = (Node_Sub18) hashtable.method1520(100)) {
                    long l = Class113.method1153(1, node_sub18.aString7149);
                    Node_Sub42 node_sub42;
                    for (node_sub42 = (Node_Sub42) hashtable_27_.method1518(3512, l); node_sub42 != null; node_sub42 = (Node_Sub42) hashtable_27_.method1524()) {
                        if (node_sub42.aString7522.equals(node_sub18.aString7149)) {
                            break;
                        }
                    }
                    if (node_sub42 == null) {
                        node_sub42 = new Node_Sub42(node_sub18.aString7149);
                        hashtable_27_.method1515(l, node_sub42, -126);
                    }
                    node_sub42.anInt7521++;
                }
                for (Node_Sub18 node_sub18 = (Node_Sub18) hashtable.method1516(); node_sub18 != null; node_sub18 = (Node_Sub18) hashtable.method1520(74)) {
                    long l = Class113.method1153(1, node_sub18.aString7149);
                    Node_Sub20 node_sub20;
                    for (node_sub20 = (Node_Sub20) aHashTable579.method1518(3512, l); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579.method1524()) {
                        if (node_sub20.aString7174.equals(node_sub18.aString7149)) {
                            break;
                        }
                    }
                    Node_Sub42 node_sub42;
                    for (node_sub42 = (Node_Sub42) hashtable_27_.method1518(3512, l); node_sub42 != null; node_sub42 = (Node_Sub42) hashtable_27_.method1524()) {
                        if (node_sub42.aString7522.equals(node_sub18.aString7149)) {
                            break;
                        }
                    }
                    int i_28_ = Objects.requireNonNull(node_sub42).anInt7521--;
                    if (node_sub20 == null) {
                        node_sub20 = new Node_Sub20(node_sub18.aString7149, i_28_);
                        aHashTable579.method1515(l, node_sub20, -125);
                    }
                    node_sub20.anIntArray7177[node_sub20.anIntArray7177.length - i_28_] = (int) node_sub18.aLong2797;
                }
            } else {
                String[] strings = (String[]) anObject589;
                int i_23_ = Class320_Sub19.method3753(strings.length);
                aHashTable579 = new HashTable(i_23_);
                HashTable hashtable = new HashTable(i_23_);
                for (String s : strings) {
                    if (s != null) {
                        long l = Class113.method1153(1, s);
                        Node_Sub42 node_sub42;
                        for (node_sub42 = (Node_Sub42) hashtable.method1518(3512, l); node_sub42 != null; node_sub42 = (Node_Sub42) hashtable.method1524()) {
                            if (node_sub42.aString7522.equals(s)) {
                                break;
                            }
                        }
                        if (node_sub42 == null) {
                            node_sub42 = new Node_Sub42(s);
                            hashtable.method1515(l, node_sub42, -126);
                        }
                        node_sub42.anInt7521++;
                    }
                }
                for (int i_25_ = 0; i_25_ < strings.length; i_25_++) {
                    if (strings[i_25_] != null) {
                        String string = strings[i_25_];
                        long l = Class113.method1153(1, string);
                        Node_Sub20 node_sub20;
                        for (node_sub20 = (Node_Sub20) aHashTable579.method1518(3512, l); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579.method1524()) {
                            if (node_sub20.aString7174.equals(string)) {
                                break;
                            }
                        }
                        Node_Sub42 node_sub42;
                        for (node_sub42 = (Node_Sub42) hashtable.method1518(3512, l); node_sub42 != null; node_sub42 = (Node_Sub42) hashtable.method1524()) {
                            if (node_sub42.aString7522.equals(string)) {
                                break;
                            }
                        }
                        int i_26_ = Objects.requireNonNull(node_sub42).anInt7521--;
                        if (node_sub20 == null) {
                            node_sub20 = new Node_Sub20(string, i_26_);
                            aHashTable579.method1515(l, node_sub20, -124);
                        }
                        node_sub20.anIntArray7177[node_sub20.anIntArray7177.length - i_26_] = i_25_;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class126.method1537(runtimeexception, "bt.J(122)");
        }
    }

    final int method410(int i) {
        anInt578++;
        if (anObject589 == null) {
            return anInt583;
        }
        if (anObject589 instanceof HashTable) {
            Node_Sub32 node_sub32 = (Node_Sub32) ((HashTable) anObject589).method1518(3512, i);
            if (node_sub32 != null) {
                return node_sub32.anInt7381;
            }
            return anInt583;
        }
        Integer[] integers = (Integer[]) anObject589;
        if (i < 0 || integers.length <= i) {
            return anInt583;
        }
        Integer integer = integers[i];
        if (integer != null) {
            return integer;
        }
        return anInt583;
    }

    final int method411() {
        anInt572++;
        return anInt586;
    }

    final String method412(int i, int i_29_) {
        anInt594++;
        if (i != -3470) {
            anInt586 = 22;
        }
        if (anObject589 == null) {
            return aString570;
        }
        if (anObject589 instanceof HashTable) {
            Node_Sub18 node_sub18 = (Node_Sub18) ((HashTable) anObject589).method1518(3512, i_29_);
            if (node_sub18 != null) {
                return node_sub18.aString7149;
            }
            return aString570;
        }
        String[] strings = (String[]) anObject589;
        if (i_29_ < 0 || i_29_ >= strings.length) {
            return aString570;
        }
        String string = strings[i_29_];
        if (string != null) {
            return string;
        }
        return aString570;
    }

    static short[] method413(short[] ses) {
        anInt573++;
        if (ses == null) {
            return null;
        }
        short[] ses_30_ = new short[ses.length];
        Class311.method3606(ses, 0, ses_30_, 0, ses.length);
        return ses_30_;
    }

    static void method414(String string) {
        anInt575++;
        if (Class87.removeWalkHere && (0x18 & Class200_Sub2.anInt4943) != 0) {
            boolean bool = false;
            int i_31_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
            int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
            for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
                Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_32_]];
                if (player.username != null && player.username.equalsIgnoreCase(string) && (Class295.myPlayer == player && (0x10 & Class200_Sub2.anInt4943) != 0 || (Class200_Sub2.anInt4943 & 0x8) != 0)) {
                    Class270.anInt3475++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class355.aClass318_4396, Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeShortLE(is[i_32_]);
                    node_sub13.aPacket7113.writeIntLE(Node_Sub15_Sub9.anInt9839);
                    node_sub13.aPacket7113.writeShort(Class92.anInt1230);
                    node_sub13.aPacket7113.write128Byte(0);
                    node_sub13.aPacket7113.writeShortLE128(Class46.anInt681);
                    Class218.aClass123_2566.sendPacket(127, node_sub13);
                    Class78.method778(0, player.scenePositionYQueue[0], player.getSize((byte) 65), true, player.scenePositionXQueue[0], 0, -2, 105, player.getSize((byte) 81));
                    bool = true;
                    break;
                }
            }
            if (!bool) {
                Class41.method436(Translation.aTranslation_384.getTranslatedString(Class35.language) + string);
            }
            if (Class87.removeWalkHere) {
                Node_Sub38_Sub23.method2863();
            }
        }
    }

    static void method415(int i, String string, String string_33_, int i_34_) {
        anInt582++;
        if (string_33_.length() <= 320 && Node_Sub38_Sub23.method2866()) {
            Class198.method2005((byte) -37);
            Node_Sub38_Sub23.anInt10347 = i;
            Node_Sub5.password = string;
            Class243.username = string_33_;
            Class48.method478(6, (byte) 116);
        }
    }

    final boolean method416(int i_36_) {
        anInt593++;
        if (anObject589 == null) {
            return false;
        }
        if (aHashTable579 == null) {
            method419();
        }
        return aHashTable579.method1518(3512, i_36_) != null;
    }

    private void method417(int i, int i_37_, BufferedStream buffer) {
        anInt576++;
        if (i == 1) {
            aChar592 = Class20_Sub1.method294(buffer.readByte(), (byte) 123);
        } else if (i == 2) {
            aChar587 = Class20_Sub1.method294(buffer.readByte(), (byte) 127);
        } else if (i == 3) {
            aString570 = buffer.readString();
        } else if (i == 4) {
            anInt583 = buffer.readInt();
        } else if (i == 5 || i == 6) {
            anInt586 = buffer.readUnsignedShort();
            HashTable hashtable = new HashTable(Class320_Sub19.method3753(anInt586));
            for (int i_38_ = 0; i_38_ < anInt586; i_38_++) {
                int i_39_ = buffer.readInt();
                Node node;
                if (i == 5) {
                    node = new Node_Sub18(buffer.readString());
                } else {
                    node = new Node_Sub32(buffer.readInt());
                }
                hashtable.method1515(i_39_, node, i_37_ - 147);
            }
            anObject589 = hashtable;
        } else if (i == 7) {
            int i_40_ = buffer.readUnsignedShort();
            anInt586 = buffer.readUnsignedShort();
            String[] strings = new String[i_40_];
            for (int i_41_ = 0; i_41_ < anInt586; i_41_++) {
                int i_42_ = buffer.readUnsignedShort();
                strings[i_42_] = buffer.readString();
            }
            anObject589 = strings;
        } else if (i == 8) {
            int i_43_ = buffer.readUnsignedShort();
            anInt586 = buffer.readUnsignedShort();
            Integer[] integers = new Integer[i_43_];
            for (int i_44_ = 0; i_44_ < anInt586; i_44_++) {
                int i_45_ = buffer.readUnsignedShort();
                integers[i_45_] = buffer.readInt();
            }
            anObject589 = integers;
        }
        if (i_37_ != 24) {
            method417(55, -60, null);
        }
    }

    public static void method418() {
        aClass318_584 = null;
    }

    private void method419() {
        try {
            anInt591++;
            if (anObject589 instanceof HashTable) {
                HashTable hashtable = (HashTable) anObject589;
                aHashTable579 = new HashTable(hashtable.method1522(false));
                HashTable hashtable_46_ = new HashTable(hashtable.method1522(false));
                for (Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1516(); node_sub32 != null; node_sub32 = (Node_Sub32) hashtable.method1520(107)) {
                    Node_Sub32 node_sub32_47_ = (Node_Sub32) hashtable_46_.method1518(3512, node_sub32.anInt7381);
                    if (node_sub32_47_ == null) {
                        node_sub32_47_ = new Node_Sub32(0);
                        hashtable_46_.method1515(node_sub32.anInt7381, node_sub32_47_, -126);
                    }
                    node_sub32_47_.anInt7381++;
                }
                for (Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1516(); node_sub32 != null; node_sub32 = (Node_Sub32) hashtable.method1520(108)) {
                    Node_Sub34 node_sub34 = (Node_Sub34) aHashTable579.method1518(3512, node_sub32.anInt7381);
                    int i = ((Node_Sub32) Objects.requireNonNull(hashtable_46_.method1518(3512, node_sub32.anInt7381))).anInt7381--;
                    if (node_sub34 == null) {
                        node_sub34 = new Node_Sub34(i);
                        aHashTable579.method1515(node_sub32.anInt7381, node_sub34, -124);
                    }
                    node_sub34.anIntArray7411[node_sub34.anIntArray7411.length - i] = (int) node_sub32.aLong2797;
                }
            } else {
                Integer[] integers = (Integer[]) anObject589;
                int i = Class320_Sub19.method3753(integers.length);
                aHashTable579 = new HashTable(i);
                HashTable hashtable = new HashTable(i);
                for (Integer integer : integers) {
                    if (integer != null) {
                        int i_49_ = integer;
                        Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1518(3512, i_49_);
                        if (node_sub32 == null) {
                            node_sub32 = new Node_Sub32(0);
                            hashtable.method1515(i_49_, node_sub32, -128);
                        }
                        node_sub32.anInt7381++;
                    }
                }
                for (int i_50_ = 0; integers.length > i_50_; i_50_++) {
                    if (integers[i_50_] != null) {
                        int i_51_ = integers[i_50_];
                        Node_Sub34 node_sub34 = (Node_Sub34) aHashTable579.method1518(3512, i_51_);
                        int i_52_ = ((Node_Sub32) Objects.requireNonNull(hashtable.method1518(3512, i_51_))).anInt7381--;
                        if (node_sub34 == null) {
                            node_sub34 = new Node_Sub34(i_52_);
                            aHashTable579.method1515(i_51_, node_sub34, -128);
                        }
                        node_sub34.anIntArray7411[node_sub34.anIntArray7411.length - i_52_] = i_50_;
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class126.method1537(runtimeexception, "bt.P(false)");
        }
    }

    final Node_Sub20 method420(String string, byte b) {
        anInt585++;
        if (anObject589 == null) {
            return null;
        }
        if (aHashTable579 == null) {
            method409();
        }
        Node_Sub20 node_sub20;
        for (node_sub20 = (Node_Sub20) aHashTable579.method1518(3512, Class113.method1153(1, string)); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579.method1524()) {
            if (node_sub20.aString7174.equals(string)) {
                break;
            }
        }
        return node_sub20;
    }
}
