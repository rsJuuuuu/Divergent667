/* ClanChat - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.net.URL;

public class ClanChat {
    static int anInt723;
    protected byte aByte724;
    static int anInt725;
    static int anInt726;
    static int anInt727;
    static int anInt728;
    static int anInt729;
    static int anInt730;
    static int anInt731;
    static int anInt732;
    static int anInt733;
    protected int anInt734;
    private HashTable aHashTable735;
    static int anInt736;
    protected int[] anIntArray737;
    protected byte aByte738;
    protected int anInt739;
    protected String[] aStringArray740;
    static int anInt741;
    private boolean aBoolean742;
    static int anInt743;
    private int anInt744;
    static int anInt745;
    static int anInt746;
    protected byte aByte748;
    protected int anInt749 = -1;
    protected boolean aBoolean750;
    protected byte aByte751;
    static int anInt752;
    private long[] aLongArray753;
    private int[] anIntArray754;
    static int anInt755;
    static Class151 aClass151_756 = new Class151(4, 1, 1, 1);
    protected int anInt757 = 0;
    private boolean aBoolean758;
    static int anInt759;
    static int anInt760;
    static int anInt761;
    static int anInt762;
    protected String aString763;
    static int anInt764;
    protected int anInt765;
    static int anInt766;
    static int anInt767;
    private long[] aLongArray768;
    protected String[] aStringArray769;
    protected byte[] aByteArray770;
    private int[] anIntArray771;

    final void method486(int i, int i_0_, int i_1_, int i_2_) {
        anInt743++;
        int i_4_ = (1 << i_2_) - 1;
        int i_5_ = i_1_ == 31 ? -1 : -1 + (1 << i_1_ + 1);
        int i_6_ = i_4_ ^ i_5_;
        i <<= i_2_;
        i &= i_6_;
        int i_7_ = anIntArray754[i_0_];
        if (i == (i_6_ & i_7_)) {
            return;
        }
        i_7_ &= ~i_6_;
        anIntArray754[i_0_] = Node_Sub16.method2590(i_7_, i);
    }

    private void method487(int i) {
        if (aBoolean758) {
            if (aLongArray768 == null) {
                aLongArray768 = new long[i];
            } else {
                Class311.method3607(aLongArray768, 0, aLongArray768 = new long[i], 0, anInt734);
            }
        }
        anInt755++;
        if (aBoolean742) {
            if (aStringArray740 == null) {
                aStringArray740 = new String[i];
            } else {
                Class311.method3605(aStringArray740, 0, aStringArray740 = new String[i], 0, anInt734);
            }
        }
        if (aByteArray770 == null) {
            aByteArray770 = new byte[i];
        } else {
            Class311.method3608(aByteArray770, 0, aByteArray770 = new byte[i], 0, anInt734);
        }
        if (anIntArray754 == null) {
            anIntArray754 = new int[i];
        } else {
            Class311.method3609(anIntArray754, 0, anIntArray754 = new int[i], 0, anInt734);
        }
        if (anIntArray737 == null) {
            anIntArray737 = new int[i];
        } else {
            Class311.method3609(anIntArray737, 0, anIntArray737 = new int[i], 0, anInt734);
        }
    }

    final void method488(String string, long l, int i_8_) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        anInt767++;
        if (aBoolean758 != l > 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + aBoolean758 + " but userhash:" + l);
        }
        if (aBoolean742 == (string == null)) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + aBoolean742 + " but displayname:" + string);
        }
        if (l > 0L && (aLongArray768 == null || anInt734 >= aLongArray768.length) || string != null && (aStringArray740 == null || anInt734 >= aStringArray740.length)) {
            method487(5 + anInt734);
        }
        if (aLongArray768 != null) {
            aLongArray768[anInt734] = l;
        }
        if (aStringArray740 != null) {
            aStringArray740[anInt734] = string;
        }
        if (anInt765 == -1) {
            anInt765 = anInt734;
            aByteArray770[anInt734] = (byte) 126;
        } else {
            aByteArray770[anInt734] = (byte) 0;
        }
        anIntArray754[anInt734] = 0;
        anIntArray737[anInt734] = i_8_;
        anIntArray771 = null;
        anInt734++;
    }

    final Long method489(int i) {
        anInt732++;
        if (aHashTable735 == null) {
            return null;
        }
        Node node = aHashTable735.method1518(3512, i);
        if (!(node instanceof Node_Sub44)) {
            return null;
        }
        return ((Node_Sub44) node).aLong7550;
    }

    final int method490(String string) {
        anInt733++;
        if (string == null || string.length() == 0) {
            return -1;
        }
        for (int i = 0; anInt734 > i; i++) {
            if (aStringArray740[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public static void method491() {
        aClass151_756 = null;
    }

    final void method492(String string, int i) {
        if (string == null) {
            string = "";
        } else if (string.length() > 80) {
            string = string.substring(0, 80);
        }
        anInt726++;
        if (aHashTable735 == null) {
            aHashTable735 = new HashTable(4);
        } else {
            Node node = aHashTable735.method1518(3512, i);
            if (node != null) {
                if (node instanceof Node_Sub18) {
                    Node_Sub18 node_sub18 = (Node_Sub18) node;
                    if (node_sub18.aString7149.equals(string)) {
                        return;
                    }
                    node_sub18.aString7149 = string;
                    return;
                }
                node.method2160();
            }
        }
        aHashTable735.method1515(i, new Node_Sub18(string), -125);
    }

    private void method493(byte b) {
        anInt730++;
        if (anInt734 == 0) {
            anInt749 = -1;
            anInt765 = -1;
        } else {
            anInt749 = -1;
            anInt765 = -1;
            if (b <= -115) {
                int i = 0;
                byte b_9_ = aByteArray770[0];
                for (int i_10_ = 1; i_10_ < anInt734; i_10_++) {
                    if (b_9_ >= aByteArray770[i_10_]) {
                        if (anInt749 == -1 && aByteArray770[i_10_] == 125) {
                            anInt749 = i_10_;
                        }
                    } else {
                        if (b_9_ == 125) {
                            anInt749 = i;
                        }
                        i = i_10_;
                        b_9_ = aByteArray770[i_10_];
                    }
                }
                anInt765 = i;
                aByteArray770[anInt765] = (byte) 126;
            }
        }
    }

    static boolean method494(int i) {
        anInt728++;
        return (0x800 & i) != 0;
    }

    final String method495(int i_12_) {
        anInt731++;
        if (aHashTable735 == null) {
            return null;
        }
        Node node = aHashTable735.method1518(3512, i_12_);
        if (!(node instanceof Node_Sub18)) {
            return null;
        }
        return ((Node_Sub18) node).aString7149;
    }

    final void method496(int i) {
        anInt741++;
        if (0 > i || anInt734 <= i) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + i + " memberCount:" + anInt734);
        }
        anInt734--;
        anIntArray771 = null;
        if (anInt734 == 0) {
            anIntArray754 = null;
            aStringArray740 = null;
            aByteArray770 = null;
            anInt749 = -1;
            aLongArray768 = null;
            anIntArray737 = null;
            anInt765 = -1;
        } else {
            Class311.method3608(aByteArray770, 1 + i, aByteArray770, i, -i + anInt734);
            Class311.method3609(anIntArray754, 1 + i, anIntArray754, i, -i + anInt734);
            Class311.method3609(anIntArray737, i + 1, anIntArray737, i, anInt734 - i);
            if (aLongArray768 != null) {
                Class311.method3607(aLongArray768, 1 + i, aLongArray768, i, -i + anInt734);
            }
            if (aStringArray740 != null) {
                Class311.method3605(aStringArray740, i + 1, aStringArray740, i, anInt734 - i);
            }
            if (anInt765 == i || anInt749 == i) {
                method493((byte) -126);
            }
        }
    }

    final void method497(String string, long l) {
        if (string != null && string.length() == 0) {
            string = null;
        }
        anInt760++;
        if (l > 0 == !aBoolean758) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + aBoolean758 + " but userhash:" + l);
        }
        if (aBoolean742 == (string == null)) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + aBoolean742 + " but displayname:" + string);
        }
        if (l > 0L && (aLongArray753 == null || anInt739 >= aLongArray753.length) || string != null && (aStringArray769 == null || aStringArray769.length <= anInt739)) {
            method503(5 + anInt739);
        }
        if (aLongArray753 != null) {
            aLongArray753[anInt739] = l;
        }
        if (aStringArray769 != null) {
            aStringArray769[anInt739] = string;
        }
        anInt739++;
    }

    final int[] method498() {
        if (anIntArray771 == null) {
            String[] strings = new String[anInt734];
            anIntArray771 = new int[anInt734];
            for (int i_16_ = 0; i_16_ < anInt734; i_16_++) {
                strings[i_16_] = aStringArray740[i_16_];
                anIntArray771[i_16_] = i_16_;
            }
            Class339_Sub4.method3932(anIntArray771, strings);
        }
        anInt729++;
        return anIntArray771;
    }

    final boolean method499(int i, long l) {
        anInt736++;
        if (aHashTable735 == null) {
            aHashTable735 = new HashTable(4);
        } else {
            Node node = aHashTable735.method1518(3512, i);
            if (node != null) {
                if (node instanceof Node_Sub44) {
                    Node_Sub44 node_sub44 = (Node_Sub44) node;
                    if (l == node_sub44.aLong7550) {
                        return false;
                    }
                    node_sub44.aLong7550 = l;
                    return true;
                }
                node.method2160();
            }
        }
        aHashTable735.method1515(i, new Node_Sub44(l), -127);
        return true;
    }

    final int method500(byte b, int i) {
        anInt759++;
        if (b == (byte) 126 || b == 127) {
            return -1;
        }
        if (anInt765 == i && (anInt749 == -1 || aByteArray770[anInt749] < 125)) {
            return -1;
        }
        if (b == aByteArray770[i]) {
            return -1;
        }
        aByteArray770[i] = b;
        method493((byte) -117);
        return i;
    }

    final Integer method501(int i) {
        anInt723++;
        if (aHashTable735 == null) {
            return null;
        }
        Node node = aHashTable735.method1518(3512, i);
        if (!(node instanceof Node_Sub32)) {
            return null;
        }
        return ((Node_Sub32) node).anInt7381;
    }

    final void method502(int i) {
        anInt761++;
        anInt739--;
        if (anInt739 == 0) {
            aStringArray769 = null;
            aLongArray753 = null;
        } else {
            if (aLongArray753 != null) {
                Class311.method3607(aLongArray753, i + 1, aLongArray753, i, -i + anInt739);
            }
            if (aStringArray769 != null) {
                Class311.method3605(aStringArray769, 1 + i, aStringArray769, i, anInt739 - i);
            }
        }
    }

    private void method503(int i) {
        if (aBoolean758) {
            if (aLongArray753 == null) {
                aLongArray753 = new long[i];
            } else {
                Class311.method3607(aLongArray753, 0, aLongArray753 = new long[i], 0, anInt739);
            }
        }
        anInt752++;
        if (aBoolean742) {
            if (aStringArray769 == null) {
                aStringArray769 = new String[i];
            } else {
                Class311.method3605(aStringArray769, 0, aStringArray769 = new String[i], 0, anInt739);
            }
        }
    }

    final boolean method504(int i, int i_19_, int i_20_, int i_21_) {
        anInt745++;
        int i_23_ = (1 << i_19_) - 1;
        int i_24_ = i == 31 ? -1 : -1 + (1 << i + 1);
        int i_25_ = i_23_ ^ i_24_;
        i_20_ <<= i_19_;
        i_20_ &= i_25_;
        if (aHashTable735 == null) {
            aHashTable735 = new HashTable(4);
        } else {
            Node node = aHashTable735.method1518(3512, i_21_);
            if (node != null) {
                if (node instanceof Node_Sub32) {
                    Node_Sub32 node_sub32 = (Node_Sub32) node;
                    if ((i_25_ & node_sub32.anInt7381) == i_20_) {
                        return false;
                    }
                    node_sub32.anInt7381 &= ~i_25_;
                    node_sub32.anInt7381 |= i_20_;
                    return true;
                }
                node.method2160();
            }
        }
        aHashTable735.method1515(i_21_, new Node_Sub32(i_20_), -126);
        return true;
    }

    private void method505(BufferedStream buffer) {
        anInt725++;
        int i_26_ = buffer.readUnsignedByte();
        if (i_26_ < 1 || i_26_ > 5) {
            throw new RuntimeException("Unsupported ClanSettings version: " + i_26_);
        }
        int i_27_ = buffer.readUnsignedByte();
        if ((0x2 & i_27_) != 0) {
            aBoolean742 = true;
        }
        if ((0x1 & i_27_) != 0) {
            aBoolean758 = true;
        }
        if (!aBoolean742) {
            aStringArray740 = null;
            aStringArray769 = null;
        }
        if (!aBoolean758) {
            aLongArray753 = null;
            aLongArray768 = null;
        }
        anInt757 = buffer.readInt();
        anInt744 = buffer.readInt();
        if (i_26_ <= 3 && anInt744 != 0) {
            anInt744 += 16912800;
        }
        anInt734 = buffer.readUnsignedShort();
        anInt739 = buffer.readUnsignedByte();
        aString763 = buffer.readString();
        if (i_26_ >= 4) {
            buffer.readInt();
        }
        aBoolean750 = buffer.readUnsignedByte() == 1;
        aByte751 = buffer.readByte();
        aByte748 = buffer.readByte();
        aByte738 = buffer.readByte();
        aByte724 = buffer.readByte();
        if (anInt734 > 0) {
            if (aBoolean758 && (aLongArray768 == null || aLongArray768.length < anInt734)) {
                aLongArray768 = new long[anInt734];
            }
            if (aBoolean742 && (aStringArray740 == null || anInt734 > aStringArray740.length)) {
                aStringArray740 = new String[anInt734];
            }
            if (aByteArray770 == null || aByteArray770.length < anInt734) {
                aByteArray770 = new byte[anInt734];
            }
            if (anIntArray754 == null || anInt734 > anIntArray754.length) {
                anIntArray754 = new int[anInt734];
            }
            if (anIntArray737 == null || anInt734 > anIntArray737.length) {
                anIntArray737 = new int[anInt734];
            }
            for (int i_28_ = 0; i_28_ < anInt734; i_28_++) {
                if (aBoolean758) {
                    aLongArray768[i_28_] = buffer.readLong();
                }
                if (aBoolean742) {
                    aStringArray740[i_28_] = buffer.readString2();
                }
                aByteArray770[i_28_] = buffer.readByte();
                if (i_26_ >= 2) {
                    anIntArray754[i_28_] = buffer.readInt();
                }
                if (i_26_ == 5) {
                    anIntArray737[i_28_] = buffer.readUnsignedShort();
                } else {
                    anIntArray737[i_28_] = 0;
                }
            }
            method493((byte) -128);
        }
        if (anInt739 > 0) {
            if (aBoolean758 && (aLongArray753 == null || anInt739 > aLongArray753.length)) {
                aLongArray753 = new long[anInt739];
            }
            if (aBoolean742 && (aStringArray769 == null || aStringArray769.length < anInt739)) {
                aStringArray769 = new String[anInt739];
            }
            for (int i_29_ = 0; anInt739 > i_29_; i_29_++) {
                if (aBoolean758) {
                    aLongArray753[i_29_] = buffer.readLong();
                }
                if (aBoolean742) {
                    aStringArray769[i_29_] = buffer.readString2();
                }
            }
        }
        if (i_26_ >= 3) {
            int i_30_ = buffer.readUnsignedShort();
            if (i_30_ > 0) {
                aHashTable735 = new HashTable(i_30_ >= 16 ? 16 : Class320_Sub19.method3753(i_30_));
                while (i_30_-- > 0) {
                    int i_31_ = buffer.readInt();
                    int i_32_ = i_31_ & 0x3fffffff;
                    int i_33_ = i_31_ >>> 30;
                    if (i_33_ == 0) {
                        int i_34_ = buffer.readInt();
                        aHashTable735.method1515(i_32_, new Node_Sub32(i_34_), -124);
                    } else if (i_33_ == 1) {
                        long l = buffer.readLong();
                        aHashTable735.method1515(i_32_, new Node_Sub44(l), -123);
                    } else if (i_33_ == 2) {
                        String string = buffer.readString();
                        aHashTable735.method1515(i_32_, new Node_Sub18(string), -127);
                    }
                }
            }
        }
    }

    final Integer method506(int i, int i_35_, int i_36_) {
        anInt727++;
        if (aHashTable735 == null) {
            return null;
        }
        Node node = aHashTable735.method1518(3512, i);
        if (!(node instanceof Node_Sub32)) {
            return null;
        }
        int i_37_ = i_35_ != 31 ? -1 + (1 << i_35_ + 1) : -1;
        return (((Node_Sub32) node).anInt7381 & i_37_) >>> i_36_;
    }

    static void method507(Throwable throwable, String string, int i) {
        if (i > -105) {
            aClass151_756 = null;
        }
        anInt766++;
        do {
            try {
                String string_38_ = "";
                if (throwable != null) {
                    string_38_ = Class240.method3030(throwable);
                }
                if (string != null) {
                    if (throwable != null) {
                        string_38_ += " | ";
                    }
                    string_38_ += string;
                }
                Class235_Sub1.method2158(string_38_);
                string_38_ = IComponentDefinitions.method4147(string_38_, ":", "%3a");
                string_38_ = IComponentDefinitions.method4147(string_38_, "@", "%40");
                string_38_ = IComponentDefinitions.method4147(string_38_, "&", "%26");
                string_38_ = IComponentDefinitions.method4147(string_38_, "#", "%23");
                if (CacheNode_Sub16.anApplet9601 != null) {
                    Class241 class241 = Class152.aSignLink1940.method3642(new URL(CacheNode_Sub16.anApplet9601.getCodeBase(), "clienterror.ws?c=" + Class320_Sub14.anInt8347 + "&u=" + (Node_Sub40.myPlayerDisplayName != null ? Node_Sub40.myPlayerDisplayName : String.valueOf(Node_Sub23.aLong7203)) + "&v1=" + SignLink.aString3989 + "&v2=" + SignLink.aString3995 + "&e=" + string_38_));
                    while (class241.anInt2953 == 0)
                        Class262_Sub22.method3208(1L);
                    if (class241.anInt2953 != 1) {
                        break;
                    }
                    DataInputStream datainputstream = (DataInputStream) class241.anObject2956;
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    final int method508(int i, int i_40_, int i_41_) {
        anInt746++;
        int i_42_ = i_40_ != 31 ? (1 << i_40_ + 1) - 1 : -1;
        return (i_42_ & anIntArray754[i_41_]) >>> i;
    }

    final boolean method509(int i, int i_43_) {
        anInt762++;
        if (aHashTable735 == null) {
            aHashTable735 = new HashTable(4);
        } else {
            Node node = aHashTable735.method1518(3512, i_43_);
            if (node != null) {
                if (node instanceof Node_Sub32) {
                    Node_Sub32 node_sub32 = (Node_Sub32) node;
                    if (node_sub32.anInt7381 == i) {
                        return false;
                    }
                    node_sub32.anInt7381 = i;
                    return true;
                }
                node.method2160();
            }
        }
        aHashTable735.method1515(i_43_, new Node_Sub32(i), -127);
        return true;
    }

    ClanChat(BufferedStream buffer) {
        anInt744 = 0;
        aString763 = null;
        anInt765 = -1;
        method505(buffer);
    }
}
