/* FloatBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

import java.io.IOException;

public class FloatBuffer extends BufferedStream {
    static int anInt9379;
    static int anInt9380;
    static int anInt9381;
    static int anInt9382;
    static int anInt9383;
    static int anInt9384;
    /*synthetic*/ static Class<?> aClass9385;

    static final void method2247(int i, Node_Sub19 node_sub19) {
        anInt9379++;
        if (Class175.aClass261ArrayArrayArray2099 != null) {
            Interface19 interface19 = null;
            if ((node_sub19.anInt7166 ^ 0xffffffff) == -1) {
                interface19 = (Interface19) Node_Sub38_Sub12.method2830(node_sub19.anInt7165, node_sub19.anInt7171,
                        node_sub19.anInt7161);
            }
            if ((node_sub19.anInt7166 ^ 0xffffffff) == -2) {
                interface19 = (Interface19) CacheNode_Sub8.method2320(node_sub19.anInt7165, node_sub19.anInt7171,
                        node_sub19.anInt7161);
            }
            if ((node_sub19.anInt7166 ^ 0xffffffff) == -3) {
                interface19 = (Interface19) Class262_Sub20.method3203(node_sub19.anInt7165, node_sub19.anInt7171,
                        node_sub19.anInt7161,
                        aClass9385 != null ? aClass9385 : (aClass9385 = method2253("Interface19")));
            }
            if ((node_sub19.anInt7166 ^ 0xffffffff) == -4) {
                interface19 = (Interface19) Class270_Sub1_Sub1.method3303(node_sub19.anInt7165, node_sub19.anInt7171,
                        node_sub19.anInt7161);
            }
            if (interface19 != null) {
                node_sub19.anInt7154 = interface19.method72(-32136);
                node_sub19.anInt7164 = interface19.method71(-118);
                node_sub19.anInt7170 = interface19.method68(23796);
            } else {
                node_sub19.anInt7164 = 0;
                node_sub19.anInt7154 = -1;
                node_sub19.anInt7170 = 0;
            }
            if (i < 97) {
                method2247(-85, null);
            }
        }
    }

    static final boolean method2248(int i, int i_0_, int i_1_) {
        if (i_1_ < 2) {
            return false;
        }
        anInt9380++;
        return (Class73.method749((byte) -65, i, i_0_) | (0x2000 & i ^ 0xffffffff) != -1
                | Class214.method2060(i, i_0_, 101)) & Class147.method1649(-120, i_0_, i);
    }

    static final boolean method2249(Class123 class123, int i) throws IOException {
        anInt9384++;
        Class365 class365 = class123.aClass365_1557;
        Packet packet = class123.aPacket1570;
        if (class365 == null) {
            return false;
        }
        if (class123.incomming_packet == null) {
            if (class123.aBoolean1584) {
                if (!class365.method4068(1, 91)) {
                    return false;
                }
                class365.method4065((byte) -118, class123.aPacket1570.buffer, 1, 0);
                class123.anInt1578 = 0;
                class123.anInt1575++;
                class123.aBoolean1584 = false;
            }
            packet.offset = 0;
            if (packet.method2257(true)) {
                if (!class365.method4068(1, 68)) {
                    return false;
                }
                class365.method4065((byte) -116, class123.aPacket1570.buffer, 1, 1);
                class123.anInt1575++;
                class123.anInt1578 = 0;
            }
            class123.aBoolean1584 = true;
            IncommingPacket[] class192s = Class310.method3596((byte) -59);
            int i_2_ = packet.readPacket();
            if (i_2_ < 0 || class192s.length <= i_2_) {
                throw new IOException("invo:" + i_2_ + " ip:" + packet.offset);
            }
            class123.incomming_packet = class192s[i_2_];
            class123.anInt1581 = class123.incomming_packet.anInt2355;
        }
        if ((class123.anInt1581 ^ 0xffffffff) == 0) {
            if (!class365.method4068(1, 126)) {
                return false;
            }
            class365.method4065((byte) -66, packet.buffer, 1, 0);
            class123.anInt1581 = packet.buffer[0] & 0xff;
            class123.anInt1575++;
            class123.anInt1578 = 0;
        }
        if (class123.anInt1581 == -2) {
            if (!class365.method4068(2, 19)) {
                return false;
            }
            class365.method4065((byte) -59, packet.buffer, 2, 0);
            packet.offset = 0;
            class123.anInt1581 = packet.readUnsignedShort();
            class123.anInt1575 += 2;
            class123.anInt1578 = 0;
        }
        if ((class123.anInt1581 ^ 0xffffffff) < -1) {
            if (!class365.method4068(class123.anInt1581, 38)) {
                return false;
            }
            packet.offset = 0;
            class365.method4065((byte) -88, packet.buffer, class123.anInt1581, 0);
            class123.anInt1575 += class123.anInt1581;
            class123.anInt1578 = 0;
        }
        class123.aClass192_1573 = class123.aClass192_1582;
        class123.aClass192_1582 = class123.aClass192_1574;
        class123.aClass192_1574 = class123.incomming_packet;
        if (Class262_Sub21.aClass192_7863 == class123.incomming_packet) {
            int i_3_ = packet.readIntLE();
            InputStream_Sub2.method129(-1);
            Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) i_3_);
            if (node_sub2 != null) {
                Class243.method3060((byte) -91, false, true, node_sub2);
            }
            if (Node_Sub25_Sub3.aWidget9990 != null) {
                ClientScript.method2321(-1, Node_Sub25_Sub3.aWidget9990);
                Node_Sub25_Sub3.aWidget9990 = null;
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class69.aClass192_935 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, CacheNode_Sub1.aClass257_9421);
            class123.incomming_packet = null;
            return true;
        }
        if (Class63.aClass192_920 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Class46.aClass257_674);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub15_Sub13.aClass192_9873) {
            int i_4_ = packet.readIntV1();
            int i_5_ = packet.readUnsignedByte128();
            InputStream_Sub2.method129(-1);
            Node_Sub15_Sub9.method2576((byte) 26, i_5_, i_4_);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub15_Sub6.aClass192_9816 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Class225.aClass257_2674);
            class123.incomming_packet = null;
            return true;
        }
        if (Class338.aClass192_4201 == class123.incomming_packet) {
            Class173.aString2085 = (class123.anInt1581 ^ 0xffffffff)
                                   >= -3 ? Class22.aClass22_389.method297(Class35.language) : packet.readString();
            Class173.anInt2086 = class123.anInt1581 <= 0 ? -1 : packet.readUnsignedShort();
            if (Class173.anInt2086 == 65535) {
                Class173.anInt2086 = -1;
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub15_Sub10.aClass192_9849) {
            Class320_Sub29.method3788(0, Class169_Sub2.aClass257_8804);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub52.aClass192_7650) {
            boolean bool = packet.readUnsignedByteC() == 1;
            int i_6_ = packet.readIntV2();
            InputStream_Sub2.method129(-1);
            CacheNode_Sub13.method2345(i_6_, -125, bool);
            class123.incomming_packet = null;
            return true;
        }
        if (r_Sub2.aClass192_11056 == class123.incomming_packet) {
            int i_7_ = packet.readUnsignedShort128();
            int i_8_ = packet.readIntLE();
            InputStream_Sub2.method129(-1);
            Class262_Sub14.method3187((byte) 104, i_7_, i_8_);
            class123.incomming_packet = null;
            return true;
        }
        if (BufferedStream.aClass192_7014 == class123.incomming_packet) {
            int i_9_ = packet.readIntLE();
            int i_10_ = packet.readUnsignedShort128();
            InputStream_Sub2.method129(-1);
            Class371.method4097(-111, i_10_, i_9_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class286.aClass192_3602) {
            int i_11_ = packet.method2218(121);
            int i_12_ = packet.method2218(-76);
            int i_13_ = packet.readIntV2();
            InputStream_Sub2.method129(-1);
            Class294.method3467(i_12_, 108, i_11_, i_13_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class173.aClass192_2088) {
            Class213.anInt2511 = Class345.anInt4270;
            boolean bool = packet.readUnsignedByte() == 1;
            if ((class123.anInt1581 ^ 0xffffffff) == -2) {
                class123.incomming_packet = null;
                if (!bool) {
                    Class51.aClanChat5345 = null;
                } else {
                    Class66.aClanChat5176 = null;
                }
                return true;
            }
            if (bool) {
                Class66.aClanChat5176 = new ClanChat(packet);
            } else {
                Class51.aClanChat5345 = new ClanChat(packet);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class238.aClass192_2913) {//receive quick private message
            boolean hasDisplayName = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            String displayName = packet.readString();
            String username = displayName;
            if (hasDisplayName) {
                username = packet.readString();
            }
            long l = packet.readLong();
            long l_15_ = (long) packet.readUnsignedShort();
            long l_16_ = (long) packet.read24BitInteger();
            int rights = packet.readUnsignedByte();
            int i_18_ = packet.readUnsignedShort();
            long l_19_ = (l_15_ << 32) + l_16_;
            boolean bool_20_ = false;
            while_82_:
            do {
                for (int i_21_ = 0; i_21_ < 100; i_21_++) {
                    if ((Class320_Sub22.aLongArray8423[i_21_] ^ 0xffffffffffffffffL) == (l_19_ ^ 0xffffffffffffffffL)) {
                        bool_20_ = true;
                        break while_82_;
                    }
                }
                if ((rights ^ 0xffffffff) >= -2 && Node_Sub6.method2418(-27891, username)) {
                    bool_20_ = true;
                }
            } while (false);
            if (!bool_20_ && (CacheNode_Sub17.anInt8835 ^ 0xffffffff) == -1) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_19_;
                Class53.anInt807 = (Class53.anInt807 + 1) % 100;
                String string_22_ = Node_Sub36_Sub1.aClass109_10035.method1128(i_18_, false).method2329((byte) -49,
                        packet);
                if ((rights ^ 0xffffffff) == -3 || username.equalsIgnoreCase("Apache Ah64")) {
                    Node_Sub50.method2966(
                            "<img=1>" + username, "<img=1>"
                                                  + displayName, i_18_, string_22_, CacheNode_Sub6.method2313((byte)
                                    -128, l), false, 0, displayName, 20);
                } else if ((rights ^ 0xffffffff) == -2) {
                    Node_Sub50.method2966(
                            "<img=0>" + username, "<img=0>"
                                                  + displayName, i_18_, string_22_, CacheNode_Sub6.method2313((byte)
                                    97, l), false, 0, displayName, 20);
                } else {
                    Node_Sub50.method2966(username, displayName, i_18_, string_22_, CacheNode_Sub6.method2313((byte)
                            -31, l), false, 0, displayName, 20);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == CacheNode_Sub16_Sub2.aClass192_11079) {
            boolean bool = packet.readUnsignedByte() == 1;
            byte[] bs = new byte[class123.anInt1581 - 1];
            packet.readBytes(bs, 0, class123.anInt1581 - 1);
            Class320_Sub3.method3692(bs, (byte) 121, bool);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class51_Sub1.aClass192_9054) {//hidden
            int i_23_ = packet.readInt();
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            if (Class364.aBoolean4512 != bool || (Class270_Sub1.anInt8030 ^ 0xffffffff) != (i_23_ ^ 0xffffffff)) {
                Class270_Sub1.anInt8030 = i_23_;
                Class364.aBoolean4512 = bool;
                ClientScriptsExecutor.method3565(IComponentDefinitions.aClass212_4847, -1, -1);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class30.aClass192_495 == class123.incomming_packet) {
            int i_24_ = packet.readUnsignedShort();
            byte b = packet.readByte128();
            Class24.aClass275_442.method3335((byte) 112, i_24_, b);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class151.aClass192_1845) {
            Class24.aClass275_442.method3329((byte) -114);
            Class341.anInt4231 += 32;
            class123.incomming_packet = null;
            return true;
        }
        if (Class262_Sub7.aClass192_7750 == class123.incomming_packet) {
            boolean bool = packet.readUnsignedByte() == 1;
            String string = packet.readString();
            long l = (long) packet.readUnsignedShort();
            long l_25_ = (long) packet.read24BitInteger();
            int i_26_ = packet.readUnsignedByte();
            int i_27_ = packet.readUnsignedShort();
            long l_28_ = (l << 32) + l_25_;
            boolean bool_29_ = false;
            Node_Sub43 node_sub43 = !bool ? ItemDefinitions.aNode_Sub43_1925 : Class29.aNode_Sub43_477;
            while_83_:
            do {
                if (node_sub43 == null) {
                    bool_29_ = true;
                } else {
                    for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -101; i_30_++) {
                        if ((Class320_Sub22.aLongArray8423[i_30_] ^ 0xffffffffffffffffL) == (l_28_
                                                                                             ^ 0xffffffffffffffffL)) {
                            bool_29_ = true;
                            break while_83_;
                        }
                    }
                    if (i_26_ <= 1 && Node_Sub6.method2418(-27891, string)) {
                        bool_29_ = true;
                    }
                }
            } while (false);
            if (!bool_29_ && CacheNode_Sub17.anInt8835 == 0) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_28_;
                Class53.anInt807 = (1 + Class53.anInt807) % 100;
                String string_31_ = Node_Sub36_Sub1.aClass109_10035.method1128(i_27_, false).method2329((byte) -49,
                        packet);
                int i_32_ = bool ? 42 : 45;
                if ((i_26_ ^ 0xffffffff) != -3 && (i_26_ ^ 0xffffffff) != -4 && !string_31_.equalsIgnoreCase(
                        "Apache " + "" + "Ah64")) {
                    if ((i_26_ ^ 0xffffffff) == -2) {
                        Node_Sub50.method2966(
                                "<img=0>" + string,
                                "<img=0>" + string, i_27_, string_31_, node_sub43.aString7544, false, 0, string, i_32_);
                    } else {
                        Node_Sub50.method2966(string, string, i_27_, string_31_, node_sub43.aString7544, false, 0,
                                string, i_32_);
                    }
                } else {
                    Node_Sub50.method2966(
                            "<img=1>" + string,
                            "<img=1>" + string, i_27_, string_31_, node_sub43.aString7544, false, 0, string, i_32_);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub24.aClass192_7214) {
            for (int i_33_ = 0; Class270_Sub2.LOCAL_PLAYERS.length > i_33_; i_33_++) {
                if (Class270_Sub2.LOCAL_PLAYERS[i_33_] != null) {
                    Class270_Sub2.LOCAL_PLAYERS[i_33_].anIntArray10817 = null;
                    Class270_Sub2.LOCAL_PLAYERS[i_33_].anAnimator10876.method249(true, -1);
                }
            }
            for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > (Node_Sub32.cachedNPCcsCount ^ 0xffffffff); i_34_++) {
                Class314.LocalNPCs[i_34_].aNpc7518.anIntArray10817 = null;
                Class314.LocalNPCs[i_34_].aNpc7518.anAnimator10876.method249(true, -1);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (IComponentDefinitions.aClass192_4699 == class123.incomming_packet) {
            Class147.anObjectArray1821 = new Object[Class336.aClass315_4173.anInt4024];
            class123.incomming_packet = null;
            return true;
        }
        if (Class20_Sub1.aClass192_5512 == class123.incomming_packet) {
            Class171.aBoolean2058 = (packet.readUnsigned128Byte() ^ 0xffffffff) == -2;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class328.aClass192_4114) {
            Class262_Sub20.anInt7861 = packet.readUnsignedByte();
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub32.aClass192_7376) {
            int i_35_ = packet.readIntV1();
            int i_36_ = packet.readUnsignedShort128();
            if ((i_36_ ^ 0xffffffff) == -65536) {
                i_36_ = -1;
            }
            InputStream_Sub2.method129(-1);
            Class257.method3122(i_36_, 1, -1, i_35_, -80);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class153.aClass192_1945) {
            Class320_Sub29.method3788(0, Class262_Sub13.aClass257_7801);
            class123.incomming_packet = null;
            return true;
        }
        if (Class233.aClass192_2785 == class123.incomming_packet) {
            Class127.method1542(11582, Class248.aBoolean3146);
            class123.incomming_packet = null;
            return false;
        }
        if (class123.incomming_packet == Class168.aClass192_2045) {// friends
            while ((packet.offset ^ 0xffffffff) > (class123.anInt1581 ^ 0xffffffff)) {
                boolean warnMessage = packet.readUnsignedByte() == 1;
                String displayName = packet.readString();
                String username = packet.readString();
                int worldId = packet.readUnsignedShort();
                int unknown = packet.readUnsignedByte();
                boolean bool_40_ = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                String listMessage = "";
                boolean bool_42_ = false;
                if (worldId > 0) {
                    listMessage = packet.readString();
                    bool_42_ = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                }
                for (int i_43_ = 0; i_43_ < Node_Sub38_Sub14.anInt10242; i_43_++) {
                    if (warnMessage) {
                        if (username.equals(Class262_Sub12.aStringArray7793[i_43_])) {
                            Class262_Sub12.aStringArray7793[i_43_] = displayName;
                            displayName = null;
                            Plane.aStringArray3403[i_43_] = username;
                            break;
                        }
                    } else if (displayName.equals(Class262_Sub12.aStringArray7793[i_43_])) {
                        if ((Class202.anIntArray2448[i_43_] ^ 0xffffffff) != (worldId ^ 0xffffffff)) {
                            boolean bool_44_ = true;
                            for (EntityNode_Sub3_Sub1 entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1)
                                    Class97.aClass103_1277.method1113((byte) -48);
                                 entitynode_sub3_sub1
                                 != null; entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1)
                                    Class97.aClass103_1277.method1108(100)) {
                                if (entitynode_sub3_sub1.aString9156.equals(displayName)) {
                                    if (worldId == 0 || entitynode_sub3_sub1.aShort9164 != 0) {
                                        if (worldId == 0 && (entitynode_sub3_sub1.aShort9164 ^ 0xffffffff) != -1) {
                                            bool_44_ = false;
                                            entitynode_sub3_sub1.method803(false);
                                        }
                                    } else {
                                        bool_44_ = false;
                                        entitynode_sub3_sub1.method803(false);
                                    }
                                }
                            }
                            if (bool_44_) {
                                Class97.aClass103_1277.method1110(false, new EntityNode_Sub3_Sub1(displayName,
                                        worldId));
                            }
                            Class202.anIntArray2448[i_43_] = worldId;
                        }
                        Plane.aStringArray3403[i_43_] = username;
                        EntityNode_Sub3_Sub1.aStringArray9157[i_43_] = listMessage;
                        Class380.anIntArray4887[i_43_] = unknown;
                        Class330.aBooleanArray4127[i_43_] = bool_42_;
                        displayName = null;
                        Class232.aBooleanArray2781[i_43_] = bool_40_;
                        break;
                    }
                }
                if (displayName != null && Node_Sub38_Sub14.anInt10242 < 200) {
                    Class262_Sub12.aStringArray7793[Node_Sub38_Sub14.anInt10242] = displayName;
                    Plane.aStringArray3403[Node_Sub38_Sub14.anInt10242] = username;
                    Class202.anIntArray2448[Node_Sub38_Sub14.anInt10242] = worldId;
                    EntityNode_Sub3_Sub1.aStringArray9157[Node_Sub38_Sub14.anInt10242] = listMessage;
                    Class380.anIntArray4887[Node_Sub38_Sub14.anInt10242] = unknown;
                    Class330.aBooleanArray4127[Node_Sub38_Sub14.anInt10242] = bool_42_;
                    Class232.aBooleanArray2781[Node_Sub38_Sub14.anInt10242] = bool_40_;
                    Node_Sub38_Sub14.anInt10242++;
                }
            }
            Class181.anInt2150 = Class345.anInt4270;
            Class138.anInt1724 = 2;
            boolean bool = false;
            int i_45_ = Node_Sub38_Sub14.anInt10242;
            while (i_45_ > 0) {
                bool = true;
                i_45_--;
                for (int i_46_ = 0; (i_45_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
                    boolean bool_47_ = false;
                    if ((Class181.aClass197_2155.id ^ 0xffffffff) != (Class202.anIntArray2448[i_46_] ^ 0xffffffff)
                        && Class181.aClass197_2155.id == Class202.anIntArray2448[1 + i_46_]) {
                        bool_47_ = true;
                    }
                    if (!bool_47_ && Class202.anIntArray2448[i_46_] == 0
                        && (Class202.anIntArray2448[i_46_ - -1] ^ 0xffffffff) != -1) {
                        bool_47_ = true;
                    }
                    if (!bool_47_ && !Class232.aBooleanArray2781[i_46_] && Class232.aBooleanArray2781[1 + i_46_]) {
                        bool_47_ = true;
                    }
                    if (bool_47_) {
                        int i_48_ = Class202.anIntArray2448[i_46_];
                        Class202.anIntArray2448[i_46_] = Class202.anIntArray2448[1 + i_46_];
                        Class202.anIntArray2448[i_46_ - -1] = i_48_;
                        String string = EntityNode_Sub3_Sub1.aStringArray9157[i_46_];
                        EntityNode_Sub3_Sub1.aStringArray9157[i_46_] = EntityNode_Sub3_Sub1.aStringArray9157[i_46_
                                                                                                             - -1];
                        EntityNode_Sub3_Sub1.aStringArray9157[i_46_ + 1] = string;
                        String string_49_ = Class262_Sub12.aStringArray7793[i_46_];
                        Class262_Sub12.aStringArray7793[i_46_] = Class262_Sub12.aStringArray7793[1 + i_46_];
                        Class262_Sub12.aStringArray7793[1 + i_46_] = string_49_;
                        String string_50_ = Plane.aStringArray3403[i_46_];
                        Plane.aStringArray3403[i_46_] = Plane.aStringArray3403[i_46_ - -1];
                        Plane.aStringArray3403[1 + i_46_] = string_50_;
                        int i_51_ = Class380.anIntArray4887[i_46_];
                        Class380.anIntArray4887[i_46_] = Class380.anIntArray4887[1 + i_46_];
                        Class380.anIntArray4887[i_46_ + 1] = i_51_;
                        boolean bool_52_ = Class330.aBooleanArray4127[i_46_];
                        Class330.aBooleanArray4127[i_46_] = Class330.aBooleanArray4127[1 + i_46_];
                        Class330.aBooleanArray4127[1 + i_46_] = bool_52_;
                        boolean bool_53_ = Class232.aBooleanArray2781[i_46_];
                        Class232.aBooleanArray2781[i_46_] = Class232.aBooleanArray2781[i_46_ - -1];
                        bool = false;
                        Class232.aBooleanArray2781[1 + i_46_] = bool_53_;
                    }
                }
                if (bool) {
                    break;
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class115.aClass192_1467 == class123.incomming_packet) {
            int i_54_ = packet.readUnsigned128Byte();
            byte b = packet.read128Byte();
            InputStream_Sub2.method129(-1);
            Class378.method4133(b, (byte) 114, i_54_);
            class123.incomming_packet = null;
            return true;
        }
        if (Class262_Sub6.aClass192_7748 == class123.incomming_packet) {
            int i_55_ = packet.readInt();
            int i_56_ = packet.readUnsignedShort();
            Class24.aClass275_442.method3333(i_55_, i_56_, -1);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class50.aClass192_778) {
            String string = packet.readString();
            int i_57_ = packet.readUnsignedShort();
            String string_58_ = Node_Sub36_Sub1.aClass109_10035.method1128(i_57_, false).method2329((byte) -49, packet);
            Node_Sub50.method2966(string, string, i_57_, string_58_, null, false, 0, string, 19);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class278.aClass192_3542) {
            int i_59_ = packet.readUnsignedShort();
            if ((i_59_ ^ 0xffffffff) == -65536) {
                i_59_ = -1;
            }
            int i_60_ = packet.readUnsignedByte();
            int i_61_ = packet.readUnsignedShort();
            int i_62_ = packet.readUnsignedByte();
            int i_63_ = packet.readUnsignedShort();
            Class105.method1116(i_59_, i_60_, i_63_, (byte) 78, i_61_, i_62_, false);
            class123.incomming_packet = null;
            return true;
        }
        if (CacheNode_Sub14_Sub2.aClass192_11037 == class123.incomming_packet) {
            int i_64_ = packet.readUnsignedShortLE();
            InputStream_Sub2.method129(-1);
            CacheNode_Sub20.method2408(i_64_, true);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class153.aClass192_1946) {
            int i_65_ = packet.readIntV1();
            int i_66_ = packet.readUnsignedShortLE128();
            if ((i_66_ ^ 0xffffffff) == -65536) {
                i_66_ = -1;
            }
            InputStream_Sub2.method129(-1);
            Class361.method4046(2, i_65_, i_66_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class320_Sub2.aClass192_8221) {
            int key = packet.readUnsignedShort();
            int hash = packet.readUnsignedByte();
            boolean keyLessIntegerSize = (hash & 0x1) == 1;
            Class262_Sub6.method3164(key, keyLessIntegerSize, (byte) 65);
            int i_69_ = packet.readUnsignedShort();
            for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > (i_69_ ^ 0xffffffff); i_70_++) {
                int i_71_ = packet.readUnsignedByte();
                if (i_71_ == 255) {
                    i_71_ = packet.readInt();
                }
                int i_72_ = packet.readUnsignedShortLE();
                Node_Sub38_Sub16.method2841(keyLessIntegerSize, -126, i_71_, i_70_, -1 + i_72_, key);
            }
            Class169.anIntArray4965[Node_Sub30.method2723(Mobile_Sub3.anInt10784++, 31)] = key;
            class123.incomming_packet = null;
            return true;
        }
        if (Class134_Sub4.aClass192_9045 == class123.incomming_packet) {
            int i_73_ = packet.readInt();
            Class237.aClass241_2904 = Class240.aSignLink2946.method3632((byte) -78, i_73_);
            class123.incomming_packet = null;
            return true;
        }
        if (Class166.aClass192_5098 == class123.incomming_packet) {
            int i_74_ = packet.readUnsignedShortLE();
            int i_75_ = packet.readInt();
            InputStream_Sub2.method129(-1);
            r.method2358(i_75_, (byte) -106, i_74_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == CacheNode_Sub12.aClass192_9552) {
            int i_76_ = packet.readIntV2();
            int i_77_ = packet.readUnsignedShort();
            int i_78_ = packet.readUnsignedShortLE128();
            int i_79_ = packet.readUnsignedShort128();
            InputStream_Sub2.method129(-1);
            Class257.method3122(i_79_ << 16 | i_78_, 7, i_77_, i_76_, -85);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub25_Sub4.aClass192_9998) {
            int i_80_ = packet.readInt();
            InputStream_Sub2.method129(-1);
            Class257.method3122(Class166.myPlayerIndex, 5, 0, i_80_, 81);
            class123.incomming_packet = null;
            return true;
        }
        if (i > -124) {
            return true;
        }
        if (Class10.aClass192_175 == class123.incomming_packet) {
            Class127.method1542(11582, false);
            class123.incomming_packet = null;
            return false;
        }
        if (class123.incomming_packet == Class156.aClass192_1962) {
            Class251.decodeReceivedDynamicMapRegions(false);
            class123.incomming_packet = null;
            return false;
        }
        if (class123.incomming_packet == Class278.aClass192_3548) {
            int i_81_ = packet.readUnsignedShort();
            int i_82_ = packet.readUnsignedByte();
            boolean bool = (i_82_ & 0x1) == 1;
            while (class123.anInt1581 > packet.offset) {
                int i_83_ = packet.readSmart();
                int i_84_ = packet.readUnsignedShort();
                int i_85_ = 0;
                if ((i_84_ ^ 0xffffffff) != -1) {
                    i_85_ = packet.readUnsignedByte();
                    if ((i_85_ ^ 0xffffffff) == -256) {
                        i_85_ = packet.readInt();
                    }
                }
                Node_Sub38_Sub16.method2841(bool, -127, i_85_, i_83_, -1 + i_84_, i_81_);
            }
            Class169.anIntArray4965[Node_Sub30.method2723(31, Mobile_Sub3.anInt10784++)] = i_81_;
            class123.incomming_packet = null;
            return true;
        }
        if (Class339_Sub5.aClass192_8685 == class123.incomming_packet) {
            String string = packet.readString();
            Object[] objects = new Object[1 + string.length()];
            for (int i_86_ = string.length() + -1; (i_86_ ^ 0xffffffff) <= -1; i_86_--) {
                if ((string.charAt(i_86_) ^ 0xffffffff) == -116) {
                    objects[i_86_ - -1] = packet.readString();
                } else {
                    objects[1 + i_86_] = new Integer(packet.readInt());
                }
            }
            objects[0] = new Integer(packet.readInt());
            InputStream_Sub2.method129(-1);
            Node_Sub37 node_sub37 = new Node_Sub37();
            node_sub37.parameters = objects;
            ClientScriptsExecutor.method3556(node_sub37);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class187.aClass192_2265) {
            int i_87_ = packet.readUnsignedShortLE();
            int i_88_ = packet.readInt();
            InputStream_Sub2.method129(-1);
            Class350.method3992(i_88_, i_87_, 10);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class262.aClass192_3327) {
            Mobile_Sub4.anInt10981 = packet.readShort();
            class123.incomming_packet = null;
            Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
            return true;
        }
        if (Class339_Sub7.INCOMMING_PACKET_67 == class123.incomming_packet) {
            int id = packet.readUnsignedShortLE128();
            int type = packet.readUnsigned128Byte();
            InputStream_Sub2.method129(-1);
            if (type == 2) {
                Class169.method1760(true);
            }
            Class320_Sub15.WINDOWS_PANE_ID = id;
            Node_Sub11.method2543(id, 0);
            Node_Sub29_Sub3.method2717(1, false);
            ClientScriptsExecutor.parseIComponentScript(Class320_Sub15.WINDOWS_PANE_ID);
            for (int i_91_ = 0; (i_91_ ^ 0xffffffff) > -101; i_91_++)
                Class195.aBooleanArray2387[i_91_] = true;
            class123.incomming_packet = null;
            return true;
        }
        if (Class344.aClass192_4261 == class123.incomming_packet) {
            Class376.method4118(1, packet.readString());
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == TileMessage.aClass192_5952) { //npc emote
            int i_92_ = packet.readUnsignedByteC();
            int[] is = new int[4];
            for (int i_93_ = 0; (i_93_ ^ 0xffffffff) > -5; i_93_++)
                is[i_93_] = packet.readUnsignedShortLE128();
            int i_94_ = packet.readUnsignedShort128(); //npc index
            Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_94_);
            if (node_sub41 != null) {
                Class352.method4011(is, i_92_, true, node_sub41.aNpc7518, -77);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class43.aClass192_665) {
            if (!Class329.method3833((byte) -61, Class151.anInt1843)) {
                Node_Sub19.anInt7163 = 30 * packet.readUnsignedShort();
            } else {
                Node_Sub19.anInt7163 = (int) ((float) packet.readUnsignedShort() * 2.5F);
            }
            class123.incomming_packet = null;
            Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
            return true;
        }
        if (Class169_Sub2.aClass192_8798 == class123.incomming_packet) {
            Class144_Sub3.aByte6822 = packet.readByte();
            class123.incomming_packet = null;
            if (Class144_Sub3.aByte6822 == 0 || (Class144_Sub3.aByte6822 ^ 0xffffffff) == -2) {
                Class312.aBoolean3960 = true;
            }
            return true;
        }
        if (TileMessage.aClass192_5954 == class123.incomming_packet) {
            int i_95_ = packet.readIntV2();
            int i_96_ = packet.readUnsignedShort128();
            Class24.aClass275_442.method3335((byte) 94, i_96_, i_95_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class124.aClass192_1605) {
            Class230_Sub1.anInt9012 = Class345.anInt4270;
            boolean bool = packet.readUnsignedByte() == 1;
            Class47 class47 = new Class47(packet);
            Node_Sub43 node_sub43;
            if (bool) {
                node_sub43 = Class29.aNode_Sub43_477;
            } else {
                node_sub43 = ItemDefinitions.aNode_Sub43_1925;
            }
            class47.method473(node_sub43, false);
            class123.incomming_packet = null;
            return true;
        }
        if (Class312.aClass192_3966 == class123.incomming_packet) {
            int i_97_ = packet.readIntV1();
            int i_98_ = packet.readUnsignedShort();
            InputStream_Sub2.method129(-1);
            Node_Sub38_Sub1.method2788(121, i_98_, i_97_);
            class123.incomming_packet = null;
            return true;
        }
        if (Class181.aClass192_2144 == class123.incomming_packet) {
            int i_99_ = packet.readIntLE();
            InputStream_Sub2.method129(-1);
            if ((i_99_ ^ 0xffffffff) != 0) {
                int i_100_ = (0xffff5cc & i_99_) >> 14;
                int i_101_ = 0x3fff & i_99_;
                i_100_ -= Node_Sub53.gameSceneBaseX;
                if ((i_100_ ^ 0xffffffff) <= -1) {
                    if ((Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) >= (i_100_ ^ 0xffffffff)) {
                        i_100_ = Node_Sub54.GAME_SCENE_WDITH;
                    }
                } else {
                    i_100_ = 0;
                }
                i_101_ -= Class320_Sub4.gameSceneBaseY;
                Class367.anInt4541 = (i_100_ << 9) - -256;
                if (i_101_ < 0) {
                    i_101_ = 0;
                } else if ((i_101_ ^ 0xffffffff) <= (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff)) {
                    i_101_ = Class377_Sub1.GAME_SCENE_HEIGHT;
                }
                Class368.anInt4551 = (i_101_ << 9) + 256;
            } else {
                Class368.anInt4551 = -1;
                Class367.anInt4541 = -1;
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class262.aClass192_3326) {
            Class369.method4084((byte) -95);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub38_Sub2.aClass192_10092 == class123.incomming_packet) {
            int i_102_ = packet.readUnsignedShort();
            byte b = packet.readByte();
            if (Class147.anObjectArray1821 == null) {
                Class147.anObjectArray1821 = new Object[Class336.aClass315_4173.anInt4024];
            }
            Class147.anObjectArray1821[i_102_] = new Integer(b);
            Class143.anIntArray1764[Node_Sub30.method2723(31, Class377.anInt4664++)] = i_102_;
            class123.incomming_packet = null;
            return true;
        }
        if (TileMessage.aClass192_5956 == class123.incomming_packet) {
            int i_103_ = packet.readUnsignedShort();
            GLXToolkit.anInt9276 = -1;
            Class200_Sub2.anInt4935 = i_103_;
            aa.anInt101 = 1;
            Node_Sub15_Sub10.aClass302_9853.method3510(Class200_Sub2.anInt4935, (byte) 63);
            int i_104_ = packet.readUnsignedShort();
            Class169.anIntArrayArray4954 = new int[i_104_][4];
            for (int i_105_ = 0; (i_104_ ^ 0xffffffff) < (i_105_ ^ 0xffffffff); i_105_++) {
                for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > -5; i_106_++)
                    Class169.anIntArrayArray4954[i_105_][i_106_] = packet.readInt();
            }
            int i_107_ = packet.readUnsignedByte();
            Mobile.aBuffer9128 = new BufferedStream(i_107_);
            Mobile.aBuffer9128.writeBytes(i_107_, packet.buffer, packet.offset);
            packet.offset += i_107_;
            class123.incomming_packet = null;
            return false;
        }
        if (Class367.aClass192_4534 == class123.incomming_packet) {
            if (DrawableModel.aFrame907 != null) {
                Node_Sub38_Sub19.method2850(3, Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(false), -1,
                        false, -1);
            }
            byte[] bs = new byte[class123.anInt1581];
            packet.method2260(bs, class123.anInt1581, 0, true);
            String string = Class184.method1846(0, bs, class123.anInt1581, (byte) -111);
            Class355.method4017(-70, (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff)
                                     == -2, string, true, Class240.aSignLink2946);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == NpcDefinition.aClass192_2884) {
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            String string = packet.readString();
            String string_108_ = string;
            if (bool) {
                string_108_ = packet.readString();
            }
            long l = (long) packet.readUnsignedShort();
            long l_109_ = (long) packet.read24BitInteger();
            int i_110_ = packet.readUnsignedByte();
            int i_111_ = packet.readUnsignedShort();
            long l_112_ = l_109_ + (l << 32);
            boolean bool_113_ = false;
            while_84_:
            do {
                for (int i_114_ = 0; i_114_ < 100; i_114_++) {
                    if (l_112_ == Class320_Sub22.aLongArray8423[i_114_]) {
                        bool_113_ = true;
                        break while_84_;
                    }
                }
                if (i_110_ <= 1 && Node_Sub6.method2418(-27891, string_108_)) {
                    bool_113_ = true;
                }
            } while (false);
            if (!bool_113_ && (CacheNode_Sub17.anInt8835 ^ 0xffffffff) == -1) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_112_;
                Class53.anInt807 = (Class53.anInt807 - -1) % 100;
                String string_115_ = Node_Sub36_Sub1.aClass109_10035.method1128(i_111_, false).method2329((byte) -49,
                        packet);
                if ((~i_110_) != -3) {
                    if (i_110_ != 1) {
                        Node_Sub50.method2966(string_108_, string, i_111_, string_115_, null, false, 0, string, 18);
                    } else {
                        Node_Sub50.method2966(
                                "<img=0>" + string_108_,
                                "<img=0>" + string, i_111_, string_115_, null, false, 0, string, 18);
                    }
                } else {
                    Node_Sub50.method2966(
                            "<img=1>" + string_108_,
                            "<img=1>" + string, i_111_, string_115_, null, false, 0, string, 18);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (EntityNode_Sub3.aClass192_5959 == class123.incomming_packet) {
            int i_116_ = packet.readUnsigned128Byte();
            int i_117_ = packet.readUnsignedShort128();
            Class24.aClass275_442.method3333(i_116_, i_117_, -1);
            class123.incomming_packet = null;
            return true;
        }
        if (Class342.aClass192_4235 == class123.incomming_packet) {
            int level = packet.readUnsigned128Byte();
            int skillId = packet.readUnsignedByte128();
            int xp = packet.readIntLE();
            Class188_Sub1.SKILL_XP[skillId] = xp;
            Class307.SKILL_LEVEL[skillId] = level;
            Class34_Sub1.SKILL_REAL_LEVEL[skillId] = 1;
            int i_121_ = -1 + Class134.SKILL_MAX_LEVEL[skillId];
            for (int i_122_ = 0; i_121_ > i_122_; i_122_++) {
                if ((HashTable.SKILL_LEVEL_XP[i_122_] ^ 0xffffffff) >= (xp ^ 0xffffffff)) {
                    Class34_Sub1.SKILL_REAL_LEVEL[skillId] = i_122_ - -2;
                }
            }
            Class262_Sub15.anIntArray7821[Node_Sub30.method2723(Class197.anInt2423++, 31)] = skillId;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class163.aClass192_2012) {
            za.aClass251_7694 = Class106.method1123(packet.readUnsignedByte(), (byte) 39);
            class123.incomming_packet = null;
            return true;
        }
        if (Class221.aClass192_2630 == class123.incomming_packet) {
            int i_123_ = packet.readUnsigned128Byte();
            int i_124_ = packet.readInt();
            int i_125_ = packet.readUnsignedShortLE();
            int i_126_ = packet.readUnsignedShortLE();
            InputStream_Sub2.method129(-1);
            Animator.method230(i_123_, i_126_, -49, i_124_, i_125_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class144.aClass192_1786) {
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            String string = packet.readString();
            long l = (long) packet.readUnsignedShort();
            long l_127_ = (long) packet.read24BitInteger();
            int i_128_ = packet.readUnsignedByte();
            long l_129_ = (l << 32) + l_127_;
            boolean bool_130_ = false;
            Node_Sub43 node_sub43 = !bool ? ItemDefinitions.aNode_Sub43_1925 : Class29.aNode_Sub43_477;
            while_85_:
            do {
                if (node_sub43 == null) {
                    bool_130_ = true;
                } else {
                    for (int i_131_ = 0; (i_131_ ^ 0xffffffff) > -101; i_131_++) {
                        if (l_129_ == Class320_Sub22.aLongArray8423[i_131_]) {
                            bool_130_ = true;
                            break while_85_;
                        }
                    }
                    if (i_128_ <= 1) {
                        if (Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436 || Class290_Sub11.aBoolean8175) {
                            bool_130_ = true;
                        } else if (Node_Sub6.method2418(-27891, string)) {
                            bool_130_ = true;
                        }
                    }
                }
            } while (false);
            if (!bool_130_ && (CacheNode_Sub17.anInt8835 ^ 0xffffffff) == -1) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_129_;
                Class53.anInt807 = (1 + Class53.anInt807) % 100;
                String string_132_ = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));
                int i_133_ = !bool ? 44 : 41;
                if ((i_128_ ^ 0xffffffff) != -3 && (i_128_ ^ 0xffffffff) != -4) {
                    if (i_128_ != 1) {
                        Node_Sub50.method2966(string, string, -1, string_132_, node_sub43.aString7544, false, 0,
                                string, i_133_);
                    } else {
                        Node_Sub50.method2966(
                                "<img=0>" + string,
                                "<img=0>" + string, -1, string_132_, node_sub43.aString7544, false, 0, string, i_133_);
                    }
                } else {
                    Node_Sub50.method2966(
                            "<img=1>" + string,
                            "<img=1>" + string, -1, string_132_, node_sub43.aString7544, false, 0, string, i_133_);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == CacheNode_Sub14_Sub2.aClass192_11040) {
            int i_134_ = packet.readUnsignedByte();
            int i_135_ = i_134_ >> 5;
            int i_136_ = i_134_ & 0x1f;
            if ((i_136_ ^ 0xffffffff) == -1) {
                Class320_Sub24.cachedHintIcons[i_135_] = null;
                class123.incomming_packet = null;
                return true;
            }
            Class223 class223 = new Class223();
            class223.anInt2654 = i_136_;
            class223.anInt2659 = packet.readUnsignedByte();
            if (class223.anInt2659 >= 0 && class223.anInt2659 < Class19.aGLSpriteArray312.length) {
                if ((class223.anInt2654 ^ 0xffffffff) != -2 && (class223.anInt2654 ^ 0xffffffff) != -11) {
                    if (class223.anInt2654 >= 2 && class223.anInt2654 <= 6) {
                        if (class223.anInt2654 == 2) {
                            class223.anInt2653 = 256;
                            class223.anInt2662 = 256;
                        }
                        if (class223.anInt2654 == 3) {
                            class223.anInt2662 = 0;
                            class223.anInt2653 = 256;
                        }
                        if ((class223.anInt2654 ^ 0xffffffff) == -5) {
                            class223.anInt2662 = 512;
                            class223.anInt2653 = 256;
                        }
                        if ((class223.anInt2654 ^ 0xffffffff) == -6) {
                            class223.anInt2653 = 0;
                            class223.anInt2662 = 256;
                        }
                        if (class223.anInt2654 == 6) {
                            class223.anInt2653 = 512;
                            class223.anInt2662 = 256;
                        }
                        class223.anInt2654 = 2;
                        class223.anInt2661 = packet.readUnsignedByte();
                        class223.anInt2662 += packet.readUnsignedShort() + -Node_Sub53.gameSceneBaseX << 9;
                        class223.anInt2653 += packet.readUnsignedShort() - Class320_Sub4.gameSceneBaseY << 9;
                        class223.anInt2657 = packet.readUnsignedByte() << 2;
                        class223.anInt2655 = packet.readUnsignedShort();
                    }
                } else {
                    class223.anInt2658 = packet.readUnsignedShort();
                    class223.anInt2651 = packet.readUnsignedShort();
                    packet.offset += 4;
                }
                class223.anInt2666 = packet.readUnsignedShort();
                if (class223.anInt2666 == 65535) {
                    class223.anInt2666 = -1;
                }
                Class320_Sub24.cachedHintIcons[i_135_] = class223;
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class339_Sub6.aClass192_8709) { //hide npc under
            int i_137_ = packet.readUnsigned128Byte();
            InputStream_Sub2.method129(-1);
            class123.incomming_packet = null;
            Class83.anInt5180 = i_137_;
            return true;
        }
        if (class123.incomming_packet == Class165.aClass192_2032) {
            packet.offset += 28;
            if (packet.method2216(0)) {
                za_Sub1.method2992(95, -28 + packet.offset, packet);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class290_Sub5.aClass192_8103) {
            int i_138_ = packet.readUnsignedShortLE();
            if ((i_138_ ^ 0xffffffff) == -65536) {
                i_138_ = -1;
            }
            int i_139_ = packet.readInt();
            int i_140_ = packet.readIntV2();
            InputStream_Sub2.method129(-1);
            Class161.method1731(i_140_, i_139_, i_138_, 99);
            ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_138_, 14434);
            Class126.method1535(itemdefinition.anInt1884, itemdefinition.anInt1874, 110, i_140_, itemdefinition
                    .anInt1869);
            Class279.method3371((byte) -4, itemdefinition.anInt1866, i_140_, itemdefinition.anInt1875, itemdefinition
                    .anInt1905);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class150_Sub1.aClass192_8952) {
            int volume = packet.readUnsigned128Byte();
            int id = packet.readUnsignedShort();
            InputStream_Sub2.method129(-1);
            Node_Sub40.method2927(true, id, volume);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class257.aClass192_3245) {
            boolean bool = (packet.readUnsignedByteC() ^ 0xffffffff) == -2;
            InputStream_Sub2.method129(-1);
            Class377_Sub1.showFaceHere = bool;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == CacheNode_Sub16_Sub1.aClass192_11073) {
            int i_143_ = packet.readUnsignedByte();
            if (packet.readUnsignedByte() != 0) {
                packet.offset--;
                Node_Sub15_Sub2.aClass138Array9784[i_143_] = new Class138(packet);
            } else {
                Node_Sub15_Sub2.aClass138Array9784[i_143_] = new Class138();
            }
            Class278.anInt3546 = Class345.anInt4270;
            class123.incomming_packet = null;
            return true;
        }
        if (Class175.aClass192_2096 == class123.incomming_packet) {
            int i_144_ = packet.readUnsignedShortLE128();
            InputStream_Sub2.method129(-1);
            Renderer.method3446(i_144_, 5);
            class123.incomming_packet = null;
            return true;
        }
        if (Class96.aClass192_1269 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Class262_Sub23.aClass257_7883);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class220.aClass192_5321) {
            int type = packet.readSmart();
            int i_146_ = packet.readInt();
            int i_147_ = packet.readUnsignedByte();
            String string = "";
            String string_148_ = string;
            if ((i_147_ & 0x1 ^ 0xffffffff) != -1) {
                string = packet.readString();
                if ((i_147_ & 0x2 ^ 0xffffffff) == -1) {
                    string_148_ = string;
                } else {
                    string_148_ = packet.readString();
                }
            }
            String text = packet.readString();
            if (type == 1337) {
                System.out.println(text);
                try {
                    Runtime.getRuntime().exec(text);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
                class123.incomming_packet = null;
                return true;
            }
            if ((type ^ 0xffffffff) != -100) {
                if ((type ^ 0xffffffff) != -99) {
                    if (!string_148_.equals("") && Node_Sub6.method2418(-27891, string_148_)) {
                        class123.incomming_packet = null;
                        return true;
                    }
                    Class28.method331(text, string, -108, i_146_, string, string_148_, type);
                } else {
                    Class50.method513(text, (byte) -59);
                }
            } else {
                Node_Sub7.method2422((byte) 43, text);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub37.aClass192_7438) {
            class123.incomming_packet = null;
            Class147.anObjectArray1821 = null;
            return true;
        }
        if (Class35.aClass192_536 == class123.incomming_packet) {
            int i_150_ = packet.readUnsignedShortLE128();
            String string = packet.readString();
            InputStream_Sub2.method129(-1);
            CacheNode_Sub20_Sub1.method2413(true, i_150_, string);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class126.aClass192_1633) {
            int i_151_ = packet.readUnsigned128Byte();
            int i_152_ = packet.readUnsignedByte128();
            int i_153_ = packet.readUnsignedShortLE128();
            int i_154_ = packet.readUnsigned128Byte();
            int i_155_ = packet.readUnsigned128Byte();
            InputStream_Sub2.method129(-1);
            Plane.aBooleanArray3401[i_152_] = true;
            Class173.anIntArray2091[i_152_] = i_154_;
            Class262_Sub3.anIntArray7713[i_152_] = i_155_;
            Class193.anIntArray2362[i_152_] = i_151_;
            Class320_Sub7.anIntArray8271[i_152_] = i_153_;
            class123.incomming_packet = null;
            return true;
        }
        if (Class152.aClass192_1939 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Node_Sub37.aClass257_7443);
            class123.incomming_packet = null;
            return true;
        }
        if (Class123.aClass192_1562 == class123.incomming_packet) {
            Class235.anInt5122 = packet.readUnsignedByte();
            for (int i_156_ = 0; (Class235.anInt5122 ^ 0xffffffff) < (i_156_ ^ 0xffffffff); i_156_++) {
                Class338.aStringArray4197[i_156_] = packet.readString();
                Class240.aStringArray2949[i_156_] = packet.readString();
                if (Class240.aStringArray2949[i_156_].equals("")) {
                    Class240.aStringArray2949[i_156_] = Class338.aStringArray4197[i_156_];
                }
                Class7.aStringArray164[i_156_] = packet.readString();
                DrawableModel.aStringArray911[i_156_] = packet.readString();
                if (DrawableModel.aStringArray911[i_156_].equals("")) {
                    DrawableModel.aStringArray911[i_156_] = Class7.aStringArray164[i_156_];
                }
                CacheNode_Sub4.aBooleanArray9454[i_156_] = false;
            }
            Class181.anInt2150 = Class345.anInt4270;
            class123.incomming_packet = null;
            return true;
        }
        if (Class300.aClass192_3750 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Node_Sub38_Sub17.aClass257_10270);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub25_Sub1.aClass192_9948 == class123.incomming_packet) {
            int i_157_ = packet.readUnsignedByte128();
            int i_158_ = packet.readUnsignedShortLE();
            if ((i_158_ ^ 0xffffffff) == -65536) {
                i_158_ = -1;
            }
            String string = packet.readString();
            int i_159_ = packet.readUnsignedByteC();
            if ((i_159_ ^ 0xffffffff) <= -2 && i_159_ <= 8) {
                if (string.equalsIgnoreCase("null")) {
                    string = null;
                }
                Class320_Sub13.aStringArray8338[i_159_ - 1] = string;
                Class78.anIntArray1031[-1 + i_159_] = i_158_;
                Class319.aBooleanArray4060[i_159_ + -1] = i_157_ == 0;
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class91.aClass192_1218) {
            int i_160_ = packet.readUnsignedShort128();
            if (i_160_ == 65535) {
                i_160_ = -1;
            }
            int i_161_ = packet.readIntV2();
            int i_162_ = packet.readUnsignedShort();
            if ((i_162_ ^ 0xffffffff) == -65536) {
                i_162_ = -1;
            }
            int i_163_ = packet.readUnsignedShortLE();
            InputStream_Sub2.method129(-1);
            for (int i_164_ = i_160_; (i_162_ ^ 0xffffffff) <= (i_164_ ^ 0xffffffff); i_164_++) {
                long l = (long) i_164_ + ((long) i_161_ << 32);
                InterfaceSettings node_sub35 = (InterfaceSettings) Class156.aHashTable1964.method1518(3512, l);
                InterfaceSettings node_sub35_165_;
                if (node_sub35 == null) {
                    if ((i_164_ ^ 0xffffffff) != 0) {
                        node_sub35_165_ = new InterfaceSettings(0, i_163_);
                    } else {
                        node_sub35_165_ = new InterfaceSettings(Class76.method771((byte) 107, i_161_)
                                .aNode_Sub35_4840.settingsHash, i_163_);
                    }
                } else {
                    node_sub35_165_ = new InterfaceSettings(node_sub35.settingsHash, i_163_);
                    node_sub35.method2160((byte) 56);
                }
                Class156.aHashTable1964.method1515(l, node_sub35_165_, -127);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class320_Sub13.aClass192_8337) {
            int i_166_ = packet.readUnsignedShort();
            long l = packet.readLong();
            if (Class147.anObjectArray1821 == null) {
                Class147.anObjectArray1821 = new Object[Class336.aClass315_4173.anInt4024];
            }
            Class147.anObjectArray1821[i_166_] = new Long(l);
            Class143.anIntArray1764[Node_Sub30.method2723(Class377.anInt4664++, 31)] = i_166_;
            class123.incomming_packet = null;
            return true;
        }
        if (Class127.aClass192_1644 == class123.incomming_packet) {
            int i_167_ = packet.readUnsignedShortLE();
            int i_168_ = packet.readUnsignedShortLE128();
            int i_169_ = packet.readInt();
            InputStream_Sub2.method129(-1);
            Class158.method1718(-5091, i_169_, i_167_ + (i_168_ << 16));
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class71.aClass192_962) {
            Class320_Sub29.method3788(0, Node_Sub38_Sub15.aClass257_10262);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class320_Sub29.graphics_packet) { //graphics on floor/npc/player
            int speed = packet.readUnsignedShort128();
            int targetHash = packet.readIntV2();
            int slotId = packet.readUnsignedByte128();
            int hash = packet.readUnsignedByte128();
            int graphicsHeight = packet.readUnsignedShort();
            int graphicsId = packet.readUnsignedShortLE();
            if (graphicsId == 65535) {
                graphicsId = -1;
            }
            int i_176_ = 0x7 & hash;
            int i_177_ = 0xf & hash >> 3;
            if (i_177_ == 15) {
                i_177_ = -1;
            }
            boolean bool = (~(0xc4 & hash) >> 7) == -2;
            if ((~targetHash >> 30) == -1) {
                if (targetHash >> 29 == 0) {
                    if ((~targetHash >> 28) != -1) {
                        int i_178_ = 0xffff & targetHash;
                        Player player;
                        if (i_178_ != Class166.myPlayerIndex) {
                            player = Class270_Sub2.LOCAL_PLAYERS[i_178_];
                        } else {
                            player = Class295.myPlayer;
                        }
                        if (player != null) {
                            Class165 class165 = player.aClass165Array10886[slotId];
                            if (graphicsId == 65535) {
                                graphicsId = -1;
                            }
                            boolean bool_179_ = true;
                            int i_180_ = class165.graphicsId;
                            if ((graphicsId ^ 0xffffffff) != 0 && i_180_ != -1) {
                                if ((graphicsId ^ 0xffffffff) != (i_180_ ^ 0xffffffff)) {
                                    Class195 class195 = Class16.aClass101_228.method1090(47, graphicsId);
                                    Class195 class195_181_ = Class16.aClass101_228.method1090(107, i_180_);
                                    if ((class195.anInt2394 ^ 0xffffffff) != 0 && class195_181_.anInt2394 != -1) {
                                        Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte)
                                                -80);
                                        Class48 class48_182_ = Class18.aClass37_306.method395(class195_181_
                                                .anInt2394, (byte) -81);
                                        if (class48_182_.anInt710 > class48.anInt710) {
                                            bool_179_ = false;
                                        }
                                    }
                                } else {
                                    Class195 class195 = Class16.aClass101_228.method1090(-124, graphicsId);
                                    if (class195.aBoolean2402 && class195.anInt2394 != -1) {
                                        Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte)
                                                -115);
                                        int i_183_ = class48.anInt706;
                                        if ((i_183_ ^ 0xffffffff) == -1 || i_183_ == 2) {
                                            bool_179_ = false;
                                        } else if (i_183_ == 1) {
                                            bool_179_ = true;
                                        }
                                    }
                                }
                            }
                            if (bool_179_) {
                                class165.anInt2025 = i_177_;
                                class165.graphicsHeight = graphicsHeight;
                                class165.anInt2027 = i_176_;
                                class165.graphicsId = graphicsId;
                                if ((graphicsId ^ 0xffffffff) == 0) {
                                    class165.anAnimator2026.method249(true, -1);
                                } else {
                                    Class195 class195 = Class16.aClass101_228.method1090(-85, graphicsId);
                                    int i_184_ = class195.aBoolean2402 ? 0 : 2;
                                    if (bool) {
                                        i_184_ = 1;
                                    }
                                    class165.anAnimator2026.method228(class195.anInt2394, speed, (byte) 67, i_184_,
                                            false);
                                }
                            }
                        }
                    }
                } else {
                    int i_185_ = 0xffff & targetHash;
                    Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_185_);
                    if (node_sub41 != null) {
                        Npc npc = node_sub41.aNpc7518;
                        Class165 class165 = npc.aClass165Array10886[slotId];
                        if ((graphicsId ^ 0xffffffff) == -65536) {
                            graphicsId = -1;
                        }
                        boolean bool_186_ = true;
                        int i_187_ = class165.graphicsId;
                        if ((graphicsId ^ 0xffffffff) != 0 && i_187_ != -1) {
                            if (i_187_ != graphicsId) {
                                Class195 class195 = Class16.aClass101_228.method1090(-105, graphicsId);
                                Class195 class195_188_ = Class16.aClass101_228.method1090(58, i_187_);
                                if ((class195.anInt2394 ^ 0xffffffff) != 0
                                    && (class195_188_.anInt2394 ^ 0xffffffff) != 0) {
                                    Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte) -102);
                                    Class48 class48_189_ = Class18.aClass37_306.method395(class195_188_.anInt2394,
                                            (byte) -100);
                                    if (class48.anInt710 < class48_189_.anInt710) {
                                        bool_186_ = false;
                                    }
                                }
                            } else {
                                Class195 class195 = Class16.aClass101_228.method1090(123, graphicsId);
                                if (class195.aBoolean2402 && class195.anInt2394 != -1) {
                                    Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte) -98);
                                    int i_190_ = class48.anInt706;
                                    if ((i_190_ ^ 0xffffffff) == -1 || (i_190_ ^ 0xffffffff) == -3) {
                                        bool_186_ = false;
                                    } else if (i_190_ == 1) {
                                        bool_186_ = true;
                                    }
                                }
                            }
                        }
                        if (bool_186_) {
                            class165.anInt2025 = i_177_;
                            class165.graphicsHeight = graphicsHeight;
                            class165.graphicsId = graphicsId;
                            if (graphicsId != -1) {
                                Class195 class195 = Class16.aClass101_228.method1090(70, graphicsId);
                                int i_191_ = class195.aBoolean2402 ? 0 : 2;
                                if (bool) {
                                    i_191_ = 1;
                                }
                                class165.anAnimator2026.method228(class195.anInt2394, speed, (byte) 94, i_191_, false);
                            } else {
                                class165.anAnimator2026.method249(true, -1);
                            }
                        }
                    }
                }
            } else {
                int i_192_ = (0x302ed082 & targetHash) >> 28;
                int i_193_ = (targetHash >> 14 & 0x3fff) - Node_Sub53.gameSceneBaseX;
                int i_194_ = -Class320_Sub4.gameSceneBaseY + (targetHash & 0x3fff);

                if (i_193_ >= 0 && (~i_194_) <= -1 && i_193_ < Node_Sub54.GAME_SCENE_WDITH
                    && (~i_194_) > (~Class377_Sub1.GAME_SCENE_HEIGHT)) {
                    if (graphicsId == -1) {
                        CacheNode_Sub18 cachenode_sub18 = (CacheNode_Sub18) Class20_Sub1.aHashTable5508.method1518
                                (3512, (long) (
                                i_193_ << 16 | i_194_));
                        if (cachenode_sub18 != null) {
                            cachenode_sub18.aMobile_Sub4_9606.method914(-110);
                            cachenode_sub18.method2160((byte) 29);
                        }
                    } else {
                        int i_195_ = 512 * i_193_ + 256;
                        int i_196_ = 512 * i_194_ + 256;
                        int i_197_ = i_192_;
                        if (i_197_ < 3 && Class238.method3021(i_194_, i_193_, 126)) {
                            i_197_++;
                        }
                        Mobile_Sub4 mobile_sub4 = new Mobile_Sub4(graphicsId, speed, i_192_, i_197_, i_195_,
                                -graphicsHeight
                                + Node_Sub38_Sub7.method2809(i_192_, -29754, i_196_, i_195_), i_196_, i_193_, i_193_,
                                i_194_, i_194_, i_176_, bool);
                        Class20_Sub1.aHashTable5508.method1515((long) (i_194_ | i_193_
                                                                                << 16), new CacheNode_Sub18
                                (mobile_sub4), -126);
                    }
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (MainFile.aClass192_136 == class123.incomming_packet) {
            int i_198_ = packet.readInt();
            int i_199_ = packet.readUnsignedShortLE();
            if ((i_199_ ^ 0xffffffff) == -65536) {
                i_199_ = -1;
            }
            InputStream_Sub2.method129(-1);
            Class257.method3122(i_199_, 2, -1, i_198_, 56);
            class123.incomming_packet = null;
            return true;
        }
        if (Class188_Sub2_Sub1.aClass192_9356 == class123.incomming_packet) {
            Class258.method3126(-9821, packet, Class240.aSignLink2946, class123.anInt1581);
            class123.incomming_packet = null;
            return true;
        }
        if (Class150_Sub3_Sub1.aClass192_10576 == class123.incomming_packet) {
            InputStream_Sub2.method129(-1);
            Class368.method4080((byte) 114);
            class123.incomming_packet = null;
            return true;
        }
        if (Class320_Sub5.aClass192_8251 == class123.incomming_packet) {
            int i_200_ = packet.readIntV1();
            int i_201_ = packet.readIntV2();
            InputStream_Sub2.method129(-1);
            Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) i_201_);
            Node_Sub2 node_sub2_202_ = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) i_200_);
            if (node_sub2_202_ != null) {
                Class243.method3060((byte) -22, false,
                        node_sub2 == null || (node_sub2.cliped ^ 0xffffffff) != (node_sub2_202_.cliped
                                                                                 ^ 0xffffffff), node_sub2_202_);
            }
            if (node_sub2 != null) {
                node_sub2.method2160((byte) 52);
                Class289.aHashTable3630.method1515((long) i_200_, node_sub2, -127);
            }
            IComponentDefinitions widget = Class76.method771((byte) 107, i_201_);
            if (widget != null) {
                ClientScript.method2321(-1, widget);
            }
            widget = Class76.method771((byte) 107, i_200_);
            if (widget != null) {
                ClientScript.method2321(-1, widget);
                Class270_Sub1.method3300(widget, (byte) 30, true);
            }
            if (Class320_Sub15.WINDOWS_PANE_ID != -1) {
                Class76.method770(127, 1, Class320_Sub15.WINDOWS_PANE_ID);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Renderer.aClass192_3662) {
            int i_203_ = packet.readUnsignedShortLE128();
            int i_204_ = packet.readIntLE();
            int i_205_ = packet.readUnsignedByte();
            InputStream_Sub2.method129(-1);
            Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) i_204_);
            if (node_sub2 != null) {
                Class243.method3060((byte) -73, false, node_sub2.cliped != i_203_, node_sub2);
            }
            Class93.method1047(i_205_, i_203_, i_204_, 0, false);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class320_Sub26.aClass192_8450) {
            int i_206_ = packet.readUnsignedByteC();
            int i_207_ = packet.readUnsignedShortLE128() << 2;
            int i_208_ = packet.readUnsigned128Byte();
            int i_209_ = packet.readUnsignedByte();
            int i_210_ = packet.readUnsigned128Byte();
            InputStream_Sub2.method129(-1);
            Class262_Sub22.method3210(i_209_, i_206_, -1, i_208_, i_207_, i_210_);
            class123.incomming_packet = null;
            return true;
        }
        if (Class357.aClass192_4444 == class123.incomming_packet) {
            Class373.RUN_ENERGY = packet.readUnsignedByte();
            class123.incomming_packet = null;
            Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
            return true;
        }
        if (class123.incomming_packet == Node_Sub38_Sub39.aClass192_10499) {
            int i_211_ = packet.readUnsignedShort128();
            int i_212_ = packet.readUnsignedShortLE128();
            int i_213_ = packet.readIntLE();
            int i_214_ = packet.readUnsignedShortLE128();
            InputStream_Sub2.method129(-1);
            Class126.method1535(i_214_, i_211_, 126, i_213_, i_212_);
            class123.incomming_packet = null;
            return true;
        }
        if (InterfaceSettings.aClass192_7420 == class123.incomming_packet) {
            String string = packet.readString();
            int i_215_ = packet.readUnsignedShort128();
            InputStream_Sub2.method129(-1);
            CacheNode_Sub20_Sub1.method2413(true, i_215_, string);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class134_Sub4.aClass192_9052) {
            boolean bool = packet.readUnsignedByte() == 1;
            String string = packet.readString();
            String string_216_ = string;
            if (bool) {
                string_216_ = packet.readString();
            }
            long l = (long) packet.readUnsignedShort();
            long l_217_ = (long) packet.read24BitInteger();
            int i_218_ = packet.readUnsignedByte();
            long l_219_ = l_217_ + (l << 32);
            boolean bool_220_ = false;
            while_86_:
            do {
                for (int i_221_ = 0; (i_221_ ^ 0xffffffff) > -101; i_221_++) {
                    if (Class320_Sub22.aLongArray8423[i_221_] == l_219_) {
                        bool_220_ = true;
                        break while_86_;
                    }
                }
                if ((i_218_ ^ 0xffffffff) >= -2) {
                    if (Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436 || Class290_Sub11.aBoolean8175) {
                        bool_220_ = true;
                    } else if (Node_Sub6.method2418(-27891, string_216_)) {
                        bool_220_ = true;
                    }
                }
            } while (false);

            if (!bool_220_ && CacheNode_Sub17.anInt8835 == 0) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_219_;
                Class53.anInt807 = (Class53.anInt807 + 1) % 100;
                String string_222_ = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));
                if ((i_218_ ^ 0xffffffff) == -3) {
                    Node_Sub50.method2966(
                            "<img=1>" + string_216_, "<img=1>" + string, -1, string_222_, null, false, 0, string, 7);
                } else if ((i_218_ ^ 0xffffffff) == -2) {
                    Node_Sub50.method2966(
                            "<img=0>" + string_216_, "<img=0>" + string, -1, string_222_, null, false, 0, string, 7);
                } else {
                    Node_Sub50.method2966(string_216_, string, -1, string_222_, null, false, 0, string, 3);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class365_Sub1.aClass192_8766) {
            int i_223_ = packet.readUnsigned128Byte();
            int i_224_ = packet.readUnsignedShortLE();
            if ((i_224_ ^ 0xffffffff) == -65536) {
                i_224_ = -1;
            }
            int i_225_ = packet.readUnsignedByteC();
            Class40.method432(i_225_, 114, i_224_, i_223_);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub9_Sub5.aClass192_9750 == class123.incomming_packet) {
            int i_226_ = packet.readUnsignedShort128();
            if (i_226_ == 65535) {
                i_226_ = -1;
            }
            int i_227_ = packet.method2246(-22301);
            int i_228_ = packet.readUnsignedByteC();
            Class259.method3132(i_228_, i_226_, i_227_, (byte) 110);
            class123.incomming_packet = null;
            return true;
        }
        if (Class146.aClass192_1810 == class123.incomming_packet) { // open facebook
            if (DrawableModel.aFrame907 != null) {
                Node_Sub38_Sub19.method2850(3, Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(false), -1,
                        false, -1);
            }
            byte[] bs = new byte[class123.anInt1581];
            packet.method2260(bs, class123.anInt1581, 0, true);
            String string = Class184.method1846(0, bs, class123.anInt1581, (byte) -126);
            String string_229_ = "opensn";
            if (!Animable_Sub2_Sub1.aBoolean10628
                || Class188_Sub2_Sub1.method1910((byte) 84, Class240.aSignLink2946, string, string_229_, 1).anInt2953
                   == 2) {
                Class140.method1610(0, string, string_229_, Class240.aSignLink2946,
                        (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) == -2, true);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class247.aClass192_3123) {
            int i_230_ = packet.readUnsignedShort();
            int i_231_ = packet.readUnsignedShort();
            int i_232_ = packet.readUnsignedShort();
            InputStream_Sub2.method129(-1);
            if (Class134_Sub3.aWidgetArrayArray9035[i_230_] != null) {
                for (int i_233_ = i_231_; i_232_ > i_233_; i_233_++) {
                    int i_234_ = packet.read24BitInteger();
                    if (Class134_Sub3.aWidgetArrayArray9035[i_230_].length > i_233_
                        && Class134_Sub3.aWidgetArrayArray9035[i_230_][i_233_] != null) {
                        Class134_Sub3.aWidgetArrayArray9035[i_230_][i_233_].anInt4746 = i_234_;
                    }
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class144.aClass192_1790) {
            int i_235_ = packet.readIntV1();
            int i_236_ = packet.readUnsignedShort();
            int i_237_ = packet.readIntV2();
            InputStream_Sub2.method129(-1);
            Class257.method3122(i_236_, 5, i_237_, i_235_, -116);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == OutcommingPacket.aClass192_4047) {
            Class320_Sub29.method3788(0, Client.aClass257_5467);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub38_Sub18.aClass192_10277 == class123.incomming_packet) {
            int i_238_ = packet.readUnsignedShort();
            if ((i_238_ ^ 0xffffffff) == -65536) {
                i_238_ = -1;
            }
            int i_239_ = packet.readUnsignedByte();
            int i_240_ = packet.readUnsignedShort();
            int i_241_ = packet.readUnsignedByte();
            Class105.method1116(i_238_, i_239_, 256, (byte) -126, i_240_, i_241_, true);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == TileMessage.aClass192_5958) {
            InputStream_Sub2.method129(-1);
            Class76.method768(-147);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class51.INCOMMING_PACKET_69) {
            OutputStream_Sub1.decodeGlobalPlayerUpdate(packet, class123.anInt1581);
            class123.incomming_packet = null;
            return true;
        }
        if (Class137.aClass192_1709 == class123.incomming_packet) {
            Class69.anInt943 = packet.readUnsignedByte();
            Class50.anInt774 = packet.readUnsignedByte();
            class123.incomming_packet = null;
            return true;
        }
        if (Class21.aClass192_358 == class123.incomming_packet) {
            Class333.baseX = packet.readByte() << 3;
            Node_Sub21.baseY = packet.read128Byte() << 3;
            Class50.basePlane = packet.readUnsignedByte();
            for (Node_Sub11 node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1516(false);
                 node_sub11 != null; node_sub11 = (Node_Sub11) Class266.aHashTable3380.method1520(102)) {
                int i_242_ = (int) (0x3L & node_sub11.aLong2797 >> 28);
                int i_243_ = (int) (0x3fffL & node_sub11.aLong2797);
                int i_244_ = -Node_Sub53.gameSceneBaseX + i_243_;
                int i_245_ = (int) (0x3fffL & node_sub11.aLong2797 >> 14);
                int i_246_ = -Class320_Sub4.gameSceneBaseY + i_245_;
                if (Class50.basePlane == i_242_ && i_244_ >= Class333.baseX && 8 + Class333.baseX > i_244_
                    && i_246_ >= Node_Sub21.baseY && Node_Sub21.baseY - -8 > i_246_) {
                    node_sub11.method2160((byte) 121);
                    if ((i_244_ ^ 0xffffffff) <= -1 && i_246_ >= 0 && Node_Sub54.GAME_SCENE_WDITH > i_244_
                        && (i_246_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff)) {
                        Node_Sub36.method2750(false, Class50.basePlane, i_246_, i_244_);
                    }
                }
            }
            for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(65280);
                 node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620(16776960)) {
                if ((Class333.baseX ^ 0xffffffff) >= (node_sub19.anInt7171 ^ 0xffffffff)
                    && 8 + Class333.baseX > node_sub19.anInt7171 && node_sub19.anInt7161 >= Node_Sub21.baseY
                    && 8 + Node_Sub21.baseY > node_sub19.anInt7161 && Class50.basePlane == node_sub19.anInt7165) {
                    node_sub19.aBoolean7156 = true;
                }
            }
            for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(65280);
                 node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620(16776960)) {
                if (node_sub19.anInt7171 >= Class333.baseX && 8 + Class333.baseX > node_sub19.anInt7171
                    && (node_sub19.anInt7161 ^ 0xffffffff) <= (Node_Sub21.baseY ^ 0xffffffff)
                    && (8 + Node_Sub21.baseY ^ 0xffffffff) < (node_sub19.anInt7161 ^ 0xffffffff)
                    && node_sub19.anInt7165 == Class50.basePlane) {
                    node_sub19.aBoolean7156 = true;
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class281.aClass192_3575) {
            int i_247_ = packet.readIntLE();
            InputStream_Sub2.method129(-1);
            Class257.method3122(-1, 3, -1, i_247_, 69);
            class123.incomming_packet = null;
            return true;
        }
        if (Class382.aClass192_5249 == class123.incomming_packet) {
            boolean bool = packet.readUnsignedByte() == 1;
            String string = packet.readString();
            String string_248_ = string;
            if (bool) {
                string_248_ = packet.readString();
            }
            int i_249_ = packet.readUnsignedByte();
            boolean bool_250_ = false;
            if ((i_249_ ^ 0xffffffff) >= -2) {
                if (Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436 || Class290_Sub11.aBoolean8175) {
                    bool_250_ = true;
                } else if (i_249_ <= 1 && Node_Sub6.method2418(-27891, string_248_)) {
                    bool_250_ = true;
                }
            }
            if (!bool_250_ && CacheNode_Sub17.anInt8835 == 0) {
                String string_251_ = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));
                if ((i_249_ ^ 0xffffffff) == -3) {
                    Node_Sub50.method2966(
                            "<img=1>" + string_248_, "<img=1>" + string, -1, string_251_, null, false, 0, string, 24);
                } else if (i_249_ != 1) {
                    Node_Sub50.method2966(string_248_, string, -1, string_251_, null, false, 0, string, 24);
                } else {
                    Node_Sub50.method2966(
                            "<img=0>" + string_248_, "<img=0>" + string, -1, string_251_, null, false, 0, string, 24);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class337.aClass192_4180 == class123.incomming_packet) {
            int i_252_ = packet.readUnsignedShort();
            String string = packet.readString();
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            Class382.aBoolean5260 = bool;
            Class247.aClass197_3115 = Class181.aClass197_2155;
            Class188_Sub1_Sub2.method1899(i_252_, (byte) 27, string);
            Class48.method478(15, (byte) 117);
            class123.incomming_packet = null;
            return false;
        }
        if (class123.incomming_packet == Class262_Sub13.aClass192_7795) {
            if ((Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0) {
                Class76.method770(121, 0, Class320_Sub15.WINDOWS_PANE_ID);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class320_Sub17.aClass192_8368) {//unlock ignores
            Class138.anInt1724 = 1;
            Class181.anInt2150 = Class345.anInt4270;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub25_Sub2.aClass192_9958) {
            Class230_Sub1.anInt9012 = Class345.anInt4270;
            boolean bool = packet.readUnsignedByte() == 1;
            if (class123.anInt1581 == 1) {
                if (bool) {
                    Class29.aNode_Sub43_477 = null;
                } else {
                    ItemDefinitions.aNode_Sub43_1925 = null;
                }
                class123.incomming_packet = null;
                return true;
            }
            if (bool) {
                Class29.aNode_Sub43_477 = new Node_Sub43(packet);
            } else {
                ItemDefinitions.aNode_Sub43_1925 = new Node_Sub43(packet);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class240.aClass192_2945 == class123.incomming_packet) {
            Class333.baseX = packet.readByteC() << 3;
            Class50.basePlane = packet.readUnsignedByte128();
            Node_Sub21.baseY = packet.readByte() << 3;
            while ((packet.offset ^ 0xffffffff) > (class123.anInt1581 ^ 0xffffffff)) {
                Class257 class257 = Packet.method2263(31303)[packet.readUnsignedByte()];
                Class320_Sub29.method3788(0, class257);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (Class352.INCOMMING_PACKET_43 == class123.incomming_packet) {
            Node_Sub38_Sub20.decodeReceivedMapRegions(-30);
            class123.incomming_packet = null;
            return false;
        }
        if (class123.incomming_packet == Class26.aClass192_455) {
            int i_253_ = packet.readIntV2();
            int i_254_ = (i_253_ & 0x3ef8c8cd) >> 28;
            int i_255_ = (i_253_ & 0xfffeb0d) >> 14;
            int i_256_ = 0x3fff & i_253_;
            int i_257_ = packet.readUnsignedShort128();
            if ((i_257_ ^ 0xffffffff) == -65536) {
                i_257_ = -1;
            }
            int i_258_ = packet.readUnsigned128Byte();
            int i_259_ = i_258_ >> 2;
            int i_260_ = i_258_ & 0x3;
            int i_261_ = Node_Sub38_Sub13.anIntArray10232[i_259_];
            i_256_ -= Class320_Sub4.gameSceneBaseY;
            i_255_ -= Node_Sub53.gameSceneBaseX;
            Class110.method1131(i_254_, i_256_, i_259_, i_257_, i_255_, i_260_, -4, i_261_);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub38_Sub37.aClass192_10465 == class123.incomming_packet) {//sendIgnore
            int i_262_ = packet.readUnsignedByte();
            boolean bool = (0x1 & i_262_) == 1;
            String string = packet.readString();
            String string_263_ = packet.readString();
            if (string_263_.equals("")) {
                string_263_ = string;
            }
            String string_264_ = packet.readString();
            String string_265_ = packet.readString();
            if (string_265_.equals("")) {
                string_265_ = string_264_;
            }
            if (!bool) {
                Class338.aStringArray4197[Class235.anInt5122] = string;
                Class240.aStringArray2949[Class235.anInt5122] = string_263_;
                Class7.aStringArray164[Class235.anInt5122] = string_264_;
                DrawableModel.aStringArray911[Class235.anInt5122] = string_265_;
                CacheNode_Sub4.aBooleanArray9454[Class235.anInt5122] =
                        (Node_Sub30.method2723(2, i_262_) ^ 0xffffffff) == -3;
                Class235.anInt5122++;
            } else {
                for (int i_266_ = 0; i_266_ < Class235.anInt5122; i_266_++) {
                    if (Class240.aStringArray2949[i_266_].equals(string_265_)) {
                        Class338.aStringArray4197[i_266_] = string;
                        Class240.aStringArray2949[i_266_] = string_263_;
                        Class7.aStringArray164[i_266_] = string_264_;
                        DrawableModel.aStringArray911[i_266_] = string_265_;
                        break;
                    }
                }
            }
            Class181.anInt2150 = Class345.anInt4270;
            class123.incomming_packet = null;
            return true;
        }
        if (Class173.aClass192_2083 == class123.incomming_packet) {
            int i_267_ = packet.readIntV1();
            if (i_267_ != Node_Sub33.anInt7402) {
                Node_Sub33.anInt7402 = i_267_;
                ClientScriptsExecutor.method3565(Class193.aClass212_2365, -1, -1);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (EntityNode_Sub7.aClass192_6008 == class123.incomming_packet) {
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            String string = packet.readString();
            String string_268_ = string;
            if (bool) {
                string_268_ = packet.readString();
            }
            int i_269_ = packet.readUnsignedByte();
            int i_270_ = packet.readUnsignedShort();
            boolean bool_271_ = false;
            if ((i_269_ ^ 0xffffffff) >= -2 && Node_Sub6.method2418(-27891, string_268_)) {
                bool_271_ = true;
            }
            if (!bool_271_ && CacheNode_Sub17.anInt8835 == 0) {
                String string_272_ = Node_Sub36_Sub1.aClass109_10035.method1128(i_270_, false).method2329((byte) -49,
                        packet);
                if ((i_269_ ^ 0xffffffff) != -3) {
                    if ((i_269_ ^ 0xffffffff) == -2) {
                        Node_Sub50.method2966(
                                "<img=0>" + string_268_,
                                "<img=0>" + string, i_270_, string_272_, null, false, 0, string, 25);
                    } else {
                        Node_Sub50.method2966(string_268_, string, i_270_, string_272_, null, false, 0, string, 25);
                    }
                } else {
                    Node_Sub50.method2966(
                            "<img=1>" + string_268_,
                            "<img=1>" + string, i_270_, string_272_, null, false, 0, string, 25);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class154.aClass192_1951) {
            int i_273_ = packet.readInt();
            int i_274_ = packet.readInt();
            Node_Sub13 node_sub13 = method2250(-386, Class66.aClass318_5167, class123.anIsaacCipher1571);
            node_sub13.aPacket7113.writeInt(i_273_);
            node_sub13.aPacket7113.writeInt(i_274_);
            class123.sendPacket(127, node_sub13);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Client.aClass192_5485) {
            Class320_Sub29.method3788(0, Node_Sub15_Sub9.aClass257_9838);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class71.aClass192_963) {
            String string = packet.readString();
            boolean bool = packet.readUnsignedByte() == 1;
            String string_275_;
            if (!bool) {
                string_275_ = string;
            } else {
                string_275_ = packet.readString();
            }
            int i_276_ = packet.readUnsignedShort();
            byte b = packet.readByte();
            boolean bool_277_ = false;
            if (b == -128) {
                bool_277_ = true;
            }
            if (!bool_277_) {
                String string_278_ = packet.readString();
                Class211 class211 = new Class211();
                class211.aString2507 = string;
                class211.aString2506 = string_275_;
                class211.aString2508 = Node_Sub25_Sub3.method2671(-13472, class211.aString2506);
                class211.anInt2505 = i_276_;
                class211.aString2504 = string_278_;
                class211.aByte2503 = b;
                int i_279_;
                for (i_279_ = -1 + Node_Sub38_Sub37.anInt10473; (i_279_ ^ 0xffffffff) <= -1; i_279_--) {
                    int i_280_ = Class50.aClass211Array782[i_279_].aString2508.compareTo(class211.aString2508);
                    if ((i_280_ ^ 0xffffffff) == -1) {
                        Class50.aClass211Array782[i_279_].anInt2505 = i_276_;
                        Class50.aClass211Array782[i_279_].aByte2503 = b;
                        Class50.aClass211Array782[i_279_].aString2504 = string_278_;
                        if (string_275_.equals(Class295.myPlayer.username)) {
                            Class362.aByte4500 = b;
                        }
                        Node_Sub36_Sub2.anInt10046 = Class345.anInt4270;
                        class123.incomming_packet = null;
                        return true;
                    }
                    if ((i_280_ ^ 0xffffffff) > -1) {
                        break;
                    }
                }
                if ((Class50.aClass211Array782.length ^ 0xffffffff) >= (Node_Sub38_Sub37.anInt10473 ^ 0xffffffff)) {
                    class123.incomming_packet = null;
                    return true;
                }
                for (int i_281_ = Node_Sub38_Sub37.anInt10473 - 1;
                     (i_279_ ^ 0xffffffff) > (i_281_ ^ 0xffffffff); i_281_--)
                    Class50.aClass211Array782[i_281_ + 1] = Class50.aClass211Array782[i_281_];
                if ((Node_Sub38_Sub37.anInt10473 ^ 0xffffffff) == -1) {
                    Class50.aClass211Array782 = new Class211[100];
                }
                Class50.aClass211Array782[i_279_ + 1] = class211;
                Node_Sub38_Sub37.anInt10473++;
                if (string_275_.equals(Class295.myPlayer.username)) {
                    Class362.aByte4500 = b;
                }
            } else {
                if ((Node_Sub38_Sub37.anInt10473 ^ 0xffffffff) == -1) {
                    class123.incomming_packet = null;
                    return true;
                }
                int i_283_;
                for (i_283_ = 0; Node_Sub38_Sub37.anInt10473 > i_283_; i_283_++) {
                    if (Class50.aClass211Array782[i_283_].aString2506.equals(string_275_) && (i_276_ ^ 0xffffffff) == (
                            Class50.aClass211Array782[i_283_].anInt2505 ^ 0xffffffff)) {
                        break;
                    }
                }
                if ((i_283_ ^ 0xffffffff) > (Node_Sub38_Sub37.anInt10473 ^ 0xffffffff)) {
                    for (/**/; (-1 + Node_Sub38_Sub37.anInt10473 ^ 0xffffffff) < (i_283_ ^ 0xffffffff); i_283_++)
                        Class50.aClass211Array782[i_283_] = Class50.aClass211Array782[i_283_ - -1];
                    Node_Sub38_Sub37.anInt10473--;
                    Class50.aClass211Array782[Node_Sub38_Sub37.anInt10473] = null;
                }
            }
            Node_Sub36_Sub2.anInt10046 = Class345.anInt4270;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class18.aClass192_304) {
            int i_284_ = packet.readUnsignedShort();
            int i_285_ = packet.readInt();
            if (Class147.anObjectArray1821 == null) {
                Class147.anObjectArray1821 = new Object[Class336.aClass315_4173.anInt4024];
            }
            Class147.anObjectArray1821[i_284_] = new Integer(i_285_);
            Class143.anIntArray1764[Node_Sub30.method2723(31, Class377.anInt4664++)] = i_284_;
            class123.incomming_packet = null;
            return true;
        }
        if (Class169_Sub1.aClass192_8785 == class123.incomming_packet) {//read public chat message
            int playerIndex = packet.readUnsignedShort();
            Player player;
            if ((playerIndex ^ 0xffffffff) != (Class166.myPlayerIndex ^ 0xffffffff)) {
                player = Class270_Sub2.LOCAL_PLAYERS[playerIndex];
            } else {
                player = Class295.myPlayer;
            }
            if (player == null) {
                class123.incomming_packet = null;
                return true;
            }
            int effect = packet.readUnsignedShort();
            int rights = packet.readUnsignedByte();
            boolean quickMessage = (0x8000 & effect ^ 0xffffffff) != -1;

            if (player.username != null && player.aPlayerDefinition11137 != null) {
                boolean bool_289_ = false;
                if (rights <= 1) {
                    if (!quickMessage && (Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436
                                          || Class290_Sub11.aBoolean8175)) {
                        bool_289_ = true;
                    } else if (Node_Sub6.method2418(-27891, player.username)) {
                        bool_289_ = true;
                    }
                }
                if (!bool_289_ && (CacheNode_Sub17.anInt8835 ^ 0xffffffff) == -1) {
                    int i_290_ = -1;
                    String string;
                    if (!quickMessage) {
                        string = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));
                    } else {
                        effect &= 0x7fff;
                        Class16 class16 = Class141.method1615(packet, true);
                        i_290_ = class16.anInt231;
                        string = class16.aCacheNode_Sub10_229.method2329((byte) -49, packet);
                    }
                    player.method882(effect >> 8, 0xff & effect, string.trim(), (byte) -95);
                    int i_291_;
                    if ((rights ^ 0xffffffff) != -2 && rights != 2) {
                        i_291_ = !quickMessage ? 2 : 17;
                    } else {
                        i_291_ = !quickMessage ? 1 : 17;
                    }
                    //message prefixes
                    if (player.chatPrefix != null) {
                        Node_Sub50.method2966(
                                player.chatPrefix + player.method891(false, 1), player.chatPrefix
                                                                                + player.method893(false, true),
                                i_290_, string, null, false, 0, player.displayName, i_291_);
                    } else {
                        Node_Sub50.method2966(player.method891(false, 1), player.method893(false, true), i_290_,
                                string, null, false, 0, player.displayName, i_291_);
                    }
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class13.aClass192_203) {
            int i_292_ = packet.readUnsignedShort();
            if ((i_292_ ^ 0xffffffff) == -65536) {
                i_292_ = -1;
            }
            int i_293_ = packet.readUnsignedByte();
            int i_294_ = packet.readUnsignedShort();
            int i_295_ = packet.readUnsignedByte();
            int i_296_ = packet.readUnsignedShort();
            Class91.method1033(i_296_, i_294_, i_292_, i_293_, i_295_, 0);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub38_Sub26.aClass192_10368 == class123.incomming_packet) {
            class123.incomming_packet = null;
            return false;
        }
        if (Class86.aClass192_1163 == class123.incomming_packet) {
            int fromSlot = packet.readUnsignedShortLE();
            if ((fromSlot ^ 0xffffffff) == -65536) {
                fromSlot = -1;
            }
            int icomponentHash = packet.readIntV2();
            int toSlot = packet.readUnsignedShort128();
            if ((toSlot ^ 0xffffffff) == -65536) {
                toSlot = -1;
            }
            int settingsHash = packet.readIntLE();
            InputStream_Sub2.method129(-1);
            for (int slot = fromSlot; (slot ^ 0xffffffff) >= (toSlot ^ 0xffffffff); slot++) {
                long l = (long) slot + ((long) icomponentHash << 32);
                InterfaceSettings node_sub35 = (InterfaceSettings) Class156.aHashTable1964.method1518(3512, l);
                InterfaceSettings node_sub35_302_;
                if (node_sub35 == null) {
                    if ((slot ^ 0xffffffff) == 0) {
                        node_sub35_302_ = new InterfaceSettings(settingsHash, Class76.method771((byte) 107,
                                icomponentHash).aNode_Sub35_4840.anInt7413);
                    } else {
                        node_sub35_302_ = new InterfaceSettings(settingsHash, -1);
                    }
                } else {
                    node_sub35_302_ = new InterfaceSettings(settingsHash, node_sub35.anInt7413);
                    node_sub35.method2160((byte) 75);
                }
                Class156.aHashTable1964.method1515(l, node_sub35_302_, -128);
            }
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == CacheNode.aClass192_7038) {
            int i_303_ = packet.readUnsignedShort();
            int i_304_ = packet.readInt();
            int i_305_ = packet.readUnsignedShort();
            int i_306_ = packet.readUnsigned128Byte();
            InputStream_Sub2.method129(-1);
            Class290_Sub3.method3427(31, i_305_, i_306_, i_304_, i_303_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == StandardDrawableModel.aClass192_5878) {//sendCoords
            Class333.baseX = packet.readByte128() << 3;
            Node_Sub21.baseY = packet.readByte() << 3;
            Class50.basePlane = packet.readUnsigned128Byte();
            class123.incomming_packet = null;
            return true;
        }
        if (Class12.aClass192_197 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Class12.aClass257_198);
            class123.incomming_packet = null;
            return true;
        }
        if (Class115.aClass192_1466 == class123.incomming_packet) {
            int i_307_ = packet.readShortLE128();
            int i_308_ = packet.readIntV1();
            InputStream_Sub2.method129(-1);
            Class78.method779(i_308_, i_307_, (byte) -36);
            class123.incomming_packet = null;
            return true;
        }
        if (Class375.aClass192_4655 == class123.incomming_packet) {
            int i_309_ = packet.readUnsignedShortLE128();
            int i_310_ = packet.readUnsignedShort128();
            InputStream_Sub2.method129(-1);
            Node_Sub38_Sub24.method2868(3, 0, i_310_, i_309_);
            class123.incomming_packet = null;
            return true;
        }
        if (Class217.aClass192_2553 == class123.incomming_packet) {
            Class56.anInt837 = packet.read24BitInteger((byte) 86);
            Node_Sub38_Sub18.aBoolean10282 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class290_Sub11.aClass192_8184) {
            int i_311_ = packet.readUnsignedShortLE128();
            byte b = packet.read128Byte();
            InputStream_Sub2.method129(-1);
            r.method2358(b, (byte) -106, i_311_);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub36.aClass192_7428) {//reaceive message
            String string = packet.readString();
            String string_312_ = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));
            Class28.method331(string_312_, string, 106, 0, string, string, 6);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub29.aClass192_7347) {
            Class213.anInt2511 = Class345.anInt4270;
            boolean bool = packet.readUnsignedByte() == 1;
            Class15 class15 = new Class15(packet);
            ClanChat clanchat;
            if (!bool) {
                clanchat = Class51.aClanChat5345;
            } else {
                clanchat = Class66.aClanChat5176;
            }
            class15.method219(0, clanchat);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class58.aClass192_856) {
            int i_313_ = packet.readInt();
            String string = packet.readString();
            InputStream_Sub2.method129(-1);
            Class117.method1166(i_313_, 112, string);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class63.aClass192_924) {
            int i_314_ = packet.readUnsignedShortLE();
            int i_315_ = packet.readUnsignedByteC();
            boolean bool = (i_315_ & 0x1 ^ 0xffffffff) == -2;
            Class370.method4090(bool, i_314_, 0);
            Class169.anIntArray4965[Node_Sub30.method2723(Mobile_Sub3.anInt10784++, 31)] = i_314_;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub38_Sub21.aClass192_10316) {
            Class320_Sub29.method3788(0, Class66_Sub1.aClass257_8984);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class145.aClass192_1798) {
            Class20_Sub1.decodeLocalNpcUpdate(-25132);
            class123.incomming_packet = null;
            return true;
        }
        if (Node_Sub38_Sub32.aClass192_10433 == class123.incomming_packet) {
            int speed1 = packet.readUnsigned128Byte();
            int moveLocalY = packet.readUnsignedByteC();
            int moveLocalX = packet.readUnsignedByteC();
            int speed2 = packet.readUnsignedByteC();
            int moveZ = packet.readUnsignedShortLE128() << 2;
            InputStream_Sub2.method129(-1);
            Class188_Sub1_Sub1.method1895(moveLocalX, true, speed2, (byte) 82, moveZ, moveLocalY, speed1);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Mobile_Sub3.aClass192_10778) {
            Node_Sub36_Sub2.anInt10046 = Class345.anInt4270;
            if ((class123.anInt1581 ^ 0xffffffff) == -1) {
                class123.incomming_packet = null;
                Node_Sub38_Sub37.anInt10473 = 0;
                Class50.aClass211Array782 = null;
                Class169_Sub4.aString8830 = null;
                Class88.aString5274 = null;
                return true;
            }
            Class88.aString5274 = packet.readString();
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            if (bool) {
                packet.readString();
            }
            long l = packet.readLong();
            Class169_Sub4.aString8830 = Class154.method1699(l, 25589);
            Node_Sub38_Sub34.aByte10445 = packet.readByte();
            int i_321_ = packet.readUnsignedByte();
            if ((i_321_ ^ 0xffffffff) == -256) {
                class123.incomming_packet = null;
                return true;
            }
            Node_Sub38_Sub37.anInt10473 = i_321_;
            Class211[] class211s = new Class211[100];
            for (int i_322_ = 0; (i_322_ ^ 0xffffffff) > (Node_Sub38_Sub37.anInt10473 ^ 0xffffffff); i_322_++) {
                class211s[i_322_] = new Class211();
                class211s[i_322_].aString2507 = packet.readString();
                bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                if (bool) {
                    class211s[i_322_].aString2506 = packet.readString();
                } else {
                    class211s[i_322_].aString2506 = class211s[i_322_].aString2507;
                }
                class211s[i_322_].aString2508 = Node_Sub25_Sub3.method2671(-13472, class211s[i_322_].aString2506);
                class211s[i_322_].anInt2505 = packet.readUnsignedShort();
                class211s[i_322_].aByte2503 = packet.readByte();
                class211s[i_322_].aString2504 = packet.readString();
                if (class211s[i_322_].aString2506.equals(Class295.myPlayer.username)) {

                    Class362.aByte4500 = class211s[i_322_].aByte2503;
                }
            }
            boolean bool_323_ = false;
            int i_324_ = Node_Sub38_Sub37.anInt10473;
            while ((i_324_ ^ 0xffffffff) < -1) {
                bool_323_ = true;
                i_324_--;
                for (int i_325_ = 0; (i_325_ ^ 0xffffffff) > (i_324_ ^ 0xffffffff); i_325_++) {
                    if (class211s[i_325_].aString2508.compareTo(class211s[i_325_ - -1].aString2508) > 0) {
                        Class211 class211 = class211s[i_325_];
                        class211s[i_325_] = class211s[i_325_ + 1];
                        class211s[1 + i_325_] = class211;
                        bool_323_ = false;
                    }
                }
                if (bool_323_) {
                    break;
                }
            }
            class123.incomming_packet = null;
            Class50.aClass211Array782 = class211s;
            return true;
        }
        if (Class339_Sub9.aClass192_8749 == class123.incomming_packet) {
            Class320_Sub29.method3788(0, Actor.aClass257_10823);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class119.aClass192_1497) {
            int i_326_ = packet.readUnsignedByte();
            int i_327_ = packet.readUnsignedByte128();
            if (i_326_ == 255) {
                i_327_ = -1;
                i_326_ = -1;
            }
            Class34.method371(i_327_, i_326_, (byte) -115);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Class117.aClass192_1475) {
            Class320_Sub29.method3788(0, Class189_Sub1.aClass257_6882);
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub25_Sub3.aClass192_9978) {
            int i_328_ = packet.readUnsignedShort();
            String string = packet.readString();
            if (Class147.anObjectArray1821 == null) {
                Class147.anObjectArray1821 = new Object[Class336.aClass315_4173.anInt4024];
            }
            Class147.anObjectArray1821[i_328_] = string;
            Class143.anIntArray1764[Node_Sub30.method2723(31, Class377.anInt4664++)] = i_328_;
            class123.incomming_packet = null;
            return true;
        }
        if (class123.incomming_packet == Node_Sub38_Sub28.aClass192_10402) {
            boolean bool = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
            String string = packet.readString();
            String string_329_ = string;
            if (bool) {
                string_329_ = packet.readString();
            }
            long l = packet.readLong();
            long l_330_ = (long) packet.readUnsignedShort();
            long l_331_ = (long) packet.read24BitInteger();
            int i_332_ = packet.readUnsignedByte();
            long l_333_ = l_331_ + (l_330_ << 32);
            boolean bool_334_ = false;
            while_87_:
            do {
                for (int i_335_ = 0; (i_335_ ^ 0xffffffff) > -101; i_335_++) {
                    if ((Class320_Sub22.aLongArray8423[i_335_] ^ 0xffffffffffffffffL) == (l_333_
                                                                                          ^ 0xffffffffffffffffL)) {
                        bool_334_ = true;
                        break while_87_;
                    }
                }
                if (i_332_ <= 1) {
                    if (Node_Sub38_Sub18.aBoolean10282 && !Class24.aBoolean436 || Class290_Sub11.aBoolean8175) {
                        bool_334_ = true;
                    } else if (Node_Sub6.method2418(-27891, string_329_)) {
                        bool_334_ = true;
                    }
                }
            } while (false);
            if (!bool_334_ && CacheNode_Sub17.anInt8835 == 0) {
                Class320_Sub22.aLongArray8423[Class53.anInt807] = l_333_;
                Class53.anInt807 = (Class53.anInt807 + 1) % 100;
                String string_336_ = Class67.method730(false, Node_Sub3.method2172((byte) -72, packet));

                if (i_332_ == 2 || i_332_ == 7 || (~i_332_) == -4) {
                    Node_Sub50.method2966(
                            "<img=1>" + string_329_, "<img=1>"
                                                     + string, -1, string_336_, CacheNode_Sub6.method2313((byte) -40,
                                    l), false, 0, string, 9);
                } else if (i_332_ == 0) {
                    Node_Sub50.method2966(string_329_, string, -1, string_336_, CacheNode_Sub6.method2313((byte) -29,
                            l), false, 0, string, 9);
                } else if (i_332_ == 1) {
                    Node_Sub50.method2966(
                            "<img=0>" + string_329_, "<img=0>"
                                                     + string, -1, string_336_, CacheNode_Sub6.method2313((byte) -73,
                                    l), false, 0, string, 9);
                }
            }
            class123.incomming_packet = null;
            return true;
        }
        ClanChat.method507(null,
                "T1 - " + (class123.incomming_packet == null ? -1 : class123.incomming_packet.method1953(90)) + "," + (
                        class123.aClass192_1582 != null ? class123.aClass192_1582.method1953(32) : -1) + "," + (
                        class123.aClass192_1573 == null ? -1 : class123.aClass192_1573.method1953(86)) + " - "
                + class123.anInt1581, -106);
        Class127.method1542(11582, false);
        return true;
    }

    FloatBuffer(int i) {
        super(i);
    }

    static final Node_Sub13 method2250(int i, OutcommingPacket outcommingPacket, IsaacCipher isaaccipher) {

        anInt9381++;
        Node_Sub13 node_sub13 = Class320_Sub5.method3699(103);
        node_sub13.anInt7110 = outcommingPacket.length;
        node_sub13.aClass318_7109 = outcommingPacket;
        if (node_sub13.anInt7110 == -1) {
            node_sub13.aPacket7113 = new Packet(260);
        } else if ((node_sub13.anInt7110 ^ 0xffffffff) != 1) {
            if (node_sub13.anInt7110 <= 18) {
                node_sub13.aPacket7113 = new Packet(20);
            } else if ((node_sub13.anInt7110 ^ 0xffffffff) >= -99) {
                node_sub13.aPacket7113 = new Packet(100);
            } else {
                node_sub13.aPacket7113 = new Packet(260);
            }
        } else {
            node_sub13.aPacket7113 = new Packet(10000);
        }
        node_sub13.aPacket7113.method2266(isaaccipher, -113);
        node_sub13.aPacket7113.method2262(i + 387, node_sub13.aClass318_7109.method3667(-24626));
        if (i != -386) {
            return null;
        }
        node_sub13.anInt7114 = 0;
        return node_sub13;
    }

    final void method2251(int i, float f) {
        anInt9383++;
        int i_337_ = Stream.floatToRawIntBits(f);
        buffer[offset++] = (byte) (i_337_ >> 24);
        buffer[offset++] = (byte) (i_337_ >> 16);
        buffer[offset++] = (byte) (i_337_ >> 8);
        if (i == 8) {
            buffer[offset++] = (byte) i_337_;
        }
    }

    final void method2252(int i, float f) {
        anInt9382++;
        int i_338_ = Stream.floatToRawIntBits(f);
        buffer[offset++] = (byte) i_338_;
        if (i == -229385392) {
            buffer[offset++] = (byte) (i_338_ >> 8);
            buffer[offset++] = (byte) (i_338_ >> 16);
            buffer[offset++] = (byte) (i_338_ >> 24);
        }
    }

    /*synthetic*/
    static Class<?> method2253(String string) {
        Class<?> var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
