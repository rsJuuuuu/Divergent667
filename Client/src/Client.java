/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public class Client extends GameStub {
    private static final long serialVersionUID = -7864266943066132637L;
    static int anInt5465;
    static int anInt5466;
    static Class257 aClass257_5467 = new Class257(11, 8);
    static int anInt5468;
    static int anInt5469;
    static int anInt5470;
    static int anInt5471;
    static int anInt5472;
    static int anInt5473;
    static int anInt5474;
    static int anInt5475;
    static int anInt5476;
    static int anInt5477;
    static int anInt5478;
    static int anInt5479;
    static int anInt5480;
    static int anInt5481;
    static int anInt5482;
    static int anInt5483;
    static int anInt5484;
    static IncommingPacket aClass192_5485 = new IncommingPacket(28, 4);
    /*synthetic*/ static Class<?> aClass5486;

    static final void method104() {
        int i = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        int i_0_;
        if (aa.anInt101 == 3) {
            i_0_ = Class121.aClass206Array1529.length;
        } else {
            i_0_ = Node_Sub29.aBoolean7338 ? i : i + Node_Sub25_Sub3.localNPCsCount;
        }
        for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
            Actor actor;
            if (aa.anInt101 == 3) {
                Class206 class206 = Class121.aClass206Array1529[i_1_];
                if (!class206.aBoolean2472) {
                    continue;
                }
                actor = class206.method2037(-118);
            } else {
                if (i_1_ < i) {
                    actor = Class270_Sub2.LOCAL_PLAYERS[is[i_1_]];
                } else {
                    actor = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_1_
                                                                                                                 -
                                                                                                                 i]))
                            .aNpc7518;
                }
                if (actor.anInt10857 < 0) {
                    continue;
                }
            }
            int i_2_ = actor.getSize((byte) 81);
            if ((i_2_ & 0x1) == 0) {
                if ((actor.anInt5934 & 0x1ff) == 0 && (actor.anInt5940 & 0x1ff) == 0) {
                    continue;
                }
            } else if ((actor.anInt5934 & 0x1ff) == 256 && (actor.anInt5940 & 0x1ff) == 256) {
                continue;
            }
            actor.anInt5937 = Node_Sub38_Sub7.method2809(actor.plane, -29754, actor.anInt5940, actor.anInt5934);
            Node_Sub38_Sub7.method2810(actor, true);
        }
    }

    public static void method105(boolean bool) {
        if (bool != false) {
            method105(false);
        }
        aClass192_5485 = null;
        aClass257_5467 = null;
    }

    static final void method106(int i) {
        int i_3_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        int i_4_;
        if (aa.anInt101 == 3) {
            i_4_ = Class121.aClass206Array1529.length;
        } else {
            i_4_ = Node_Sub29.aBoolean7338 ? i_3_ : i_3_ + Node_Sub25_Sub3.localNPCsCount;
        }
        for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
            Actor actor;
            if (aa.anInt101 == 3) {
                Class206 class206 = Class121.aClass206Array1529[i_5_];
                if (!class206.aBoolean2472) {
                    continue;
                }
                actor = class206.method2037(-83);
            } else {
                if (i_5_ < i_3_) {
                    actor = Class270_Sub2.LOCAL_PLAYERS[is[i_5_]];
                } else {
                    actor = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_5_
                                                                                                                 -
                                                                                                                 i_3_])).aNpc7518;
                }
                if (actor.plane != i) {
                    continue;
                }
                if (actor.anInt10857 < 0) {
                    actor.aBoolean10826 = false;
                    continue;
                }
            }
            actor.anInt10853 = 0;
            int i_6_ = actor.getSize((byte) 121);
            if ((i_6_ & 0x1) == 0) {
                if ((actor.anInt5934 & 0x1ff) != 0 || (actor.anInt5940 & 0x1ff) != 0) {
                    actor.aBoolean10826 = false;
                    continue;
                }
            } else if ((actor.anInt5934 & 0x1ff) != 256 || (actor.anInt5940 & 0x1ff) != 256) {
                actor.aBoolean10826 = false;
                continue;
            }
            if (aa.anInt101 != 3) {
                if (i_6_ == 1) {
                    int i_7_ = actor.anInt5934 >> 9;
                    int i_8_ = actor.anInt5940 >> 9;
                    if (actor.anInt10857 != Node_Sub38_Sub16.anIntArrayArray10269[i_7_][i_8_]) {
                        actor.aBoolean10826 = true;
                        continue;
                    }
                    if (Class79.anIntArrayArray1070[i_7_][i_8_] > 1) {
                        Class79.anIntArrayArray1070[i_7_][i_8_]--;
                        actor.aBoolean10826 = true;
                        continue;
                    }
                } else {
                    int i_9_ = (i_6_ - 1) * 256 + 252;
                    int i_10_ = actor.anInt5934 - i_9_ >> 9;
                    int i_11_ = actor.anInt5940 - i_9_ >> 9;
                    int i_12_ = actor.anInt5934 + i_9_ >> 9;
                    int i_13_ = actor.anInt5940 + i_9_ >> 9;
                    if (!Class230.method2128(i_12_, i_13_, (byte) -120, i_10_, i_11_, actor.anInt10857)) {
                        for (int i_14_ = i_10_; i_14_ <= i_12_; i_14_++) {
                            for (int i_15_ = i_11_; i_15_ <= i_13_; i_15_++) {
                                if (actor.anInt10857 == Node_Sub38_Sub16.anIntArrayArray10269[i_14_][i_15_]) {
                                    Class79.anIntArrayArray1070[i_14_][i_15_]--;
                                }
                            }
                        }
                        actor.aBoolean10826 = true;
                        continue;
                    }
                }
            }
            actor.aBoolean10826 = false;
            actor.anInt5937 = Node_Sub38_Sub7.method2809(actor.plane, -29754, actor.anInt5940, actor.anInt5934);
            Node_Sub38_Sub7.method2810(actor, true);
        }
    }

    public static final void main(String[] strings) {
        anInt5473++;
        try {
            if ((strings.length ^ 0xffffffff) != -7) {
                Class230.method2127((byte) 7, "Argument count");
            }
            Class320_Sub24.aClass197_8443 = new Class197();
            Class320_Sub24.aClass197_8443.id = Integer.parseInt(strings[0]);
            Node_Sub15_Sub13.aClass197_9871 = new Class197();
            Node_Sub15_Sub13.aClass197_9871.id = Integer.parseInt(strings[1]);
            Node_Sub38_Sub1.aClass329_10086 = CacheNode_Sub2.aClass329_9436;
            if (!strings[3].equals("live")) {
                if (strings[3].equals("rc")) {
                    OutcommingPacket.aClass129_4051 = Node_Sub41.aClass129_7515;
                } else if (!strings[3].equals("wip")) {
                    Class230.method2127((byte) 7, "modewhat");
                } else {
                    OutcommingPacket.aClass129_4051 = Class123.aClass129_1564;
                }
            } else {
                OutcommingPacket.aClass129_4051 = Class194_Sub3.aClass129_6901;
            }
            Class35.language = Class262_Sub18.method3198(strings[4], false);
            if (Class35.language == -1) {
                if (!strings[4].equals("english")) {
                    if (!strings[4].equals("german")) {
                        Class230.method2127((byte) 7, "language");
                    } else {
                        Class35.language = 1;
                    }
                } else {
                    Class35.language = 0;
                }
            }
            Node_Sub38_Sub21.aBoolean10320 = false;
            Animable_Sub2_Sub1.aBoolean10628 = false;
            if (strings[5].equals("game0")) {
                Class209.aClass353_2483 = Node_Sub38_Sub34.aClass353_10443;
            } else if (strings[5].equals("game1")) {
                Class209.aClass353_2483 = Class169_Sub4.aClass353_8825;
            } else if (!strings[5].equals("game2")) {
                if (strings[5].equals("game3")) {
                    Class209.aClass353_2483 = Node_Sub25_Sub4.aClass353_10010;
                } else {
                    Class230.method2127((byte) 7, "game");
                }
            } else {
                Class209.aClass353_2483 = Node_Sub38_Sub22.aClass353_10323;
            }
            Class170.anInt2056 = 0;
            Class380.anInt4877 = 0;
            Mobile_Sub1.aBoolean10961 = false;
            Class64.aBoolean5046 = Class262_Sub17.aBoolean7833 = true;
            Class252.aBoolean3188 = false;
            Node_Sub38_Sub18.aString10283 = null;
            Class178.anInt2118 = Class209.aClass353_2483.anInt4344;
            Class83.aString5186 = "";
            Class143.aByteArray1773 = null;
            Class320_Sub27.anInt8460 = 0;
            Node_Sub32.aLong7385 = 0L;
            Client var_client = new Client();
            Class158.aClient1983 = var_client;
            var_client.method87(Class150_Sub1.INDEXES_COUNT, (byte) 127, 667, 32
                                                                              + OutcommingPacket
                                                                                      .aClass129_4051.method1554
                            (false), 768, false, Class209.aClass353_2483.aString4341, 1024);
            Node_Sub29.aFrame7344.setLocation(40, 40);
        } catch (Exception exception) {
            ClanChat.method507(exception, null, -111);
        }
    }

    final synchronized void method93(int i) {
        anInt5470++;
        if (Class96.anApplet1270 != null && Node_Sub38_Sub20.aCanvas10309 == null
            && !Class240.aSignLink2946.aBoolean3985) {
            try {
                Class<? extends Applet> var_class = Class96.anApplet1270.getClass();
                Field field = var_class.getDeclaredField("canvas");
                Node_Sub38_Sub20.aCanvas10309 = (java.awt.Canvas) field.get(Class96.anApplet1270);
                field.set(Class96.anApplet1270, null);
                if (Node_Sub38_Sub20.aCanvas10309 != null) {
                    return;
                }
            } catch (Exception exception) {
                /* empty */
            }
        }
        super.method93(-52);
    }

    static final void method107() {
        int i = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        int i_17_ = Class213.aNode_Sub27_2512.aClass320_Sub27_7266.method3783(false);
        boolean bool = i_17_ == 1 && i > 200 || i_17_ == 0 && i > 50;
        for (int i_18_ = 0; i_18_ < i; i_18_++) {
            Player player = Class270_Sub2.LOCAL_PLAYERS[is[i_18_]];
            if (!player.method886((byte) -122)) {
                player.anInt10857 = -1;
            } else if (player.aBoolean11131) {
                player.anInt10857 = -1;
            } else {
                player.method845(89);
                if (player.aShort9119 < 0 || player.aShort9120 < 0 || player.aShort9130 >= Node_Sub54.GAME_SCENE_WDITH
                    || player.aShort9124 >= Class377_Sub1.GAME_SCENE_HEIGHT) {
                    player.anInt10857 = -1;
                } else {
                    player.aBoolean11169 = player.aBoolean10867 && bool;
                    if (player == Class295.myPlayer) {
                        player.anInt10857 = 2147483647;
                    } else {
                        int i_19_ = 0;
                        if (!player.aBoolean10826) {
                            i_19_++;
                        }
                        if (player.anInt10874 > Class174.clientCycle) {
                            i_19_ += 2;
                        }
                        i_19_ += 5 - player.getSize((byte) 67) << 2;
                        if (player.aBoolean11157 || player.aBoolean11135) {
                            i_19_ += 512;
                        } else {
                            if (Class83.anInt5180 == 0) {
                                i_19_ += 32;
                            } else {
                                i_19_ += 128;
                            }
                            i_19_ += 256;
                        }
                        player.anInt10857 = i_19_ + 1;
                    }
                }
            }
        }
        for (int i_20_ = 0; i_20_ < Node_Sub25_Sub3.localNPCsCount; i_20_++) {
            Npc npc = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_20_]))
                    .aNpc7518;
            if (!npc.method873((byte) 66) || !npc.aNpcDefinition11122.method3010((byte) 96, Class24.aClass275_442)) {
                npc.anInt10857 = -1;
            } else {
                npc.method845(-94);
                if (npc.aShort9119 < 0 || npc.aShort9120 < 0 || npc.aShort9130 >= Node_Sub54.GAME_SCENE_WDITH
                    || npc.aShort9124 >= Class377_Sub1.GAME_SCENE_HEIGHT) {
                    npc.anInt10857 = -1;
                } else {
                    int i_21_ = 0;
                    if (!npc.aBoolean10826) {
                        i_21_++;
                    }
                    if (npc.anInt10874 > Class174.clientCycle) {
                        i_21_ += 2;
                    }
                    i_21_ += 5 - npc.getSize((byte) 88) << 2;
                    if (Class83.anInt5180 == 0) {
                        if (npc.aNpcDefinition11122.aBoolean2843) {
                            i_21_ += 64;
                        } else {
                            i_21_ += 128;
                        }
                    } else if (Class83.anInt5180 == 1) {
                        if (npc.aNpcDefinition11122.aBoolean2843) {
                            i_21_ += 32;
                        } else {
                            i_21_ += 64;
                        }
                    }
                    if (npc.aNpcDefinition11122.aBoolean2824) {
                        i_21_ += 1024;
                    } else if (!npc.aNpcDefinition11122.aBoolean2825) {
                        i_21_ += 256;
                    }
                    npc.anInt10857 = i_21_ + 1;
                }
            }
        }
        for (int i_22_ = 0; i_22_ < Class320_Sub24.cachedHintIcons.length; i_22_++) {
            Class223 class223 = Class320_Sub24.cachedHintIcons[i_22_];
            if (class223 != null) {
                if (class223.anInt2654 == 1) {
                    Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long)
                            class223.anInt2658);
                    if (node_sub41 != null) {
                        Npc npc = node_sub41.aNpc7518;
                        if (npc.anInt10857 >= 0) {
                            npc.anInt10857 += 2048;
                        }
                    }
                } else if (class223.anInt2654 == 10) {
                    Player player = Class270_Sub2.LOCAL_PLAYERS[class223.anInt2658];
                    if (player != null && player != Class295.myPlayer && player.anInt10857 >= 0) {
                        player.anInt10857 += 2048;
                    }
                }
            }
        }
    }

    final void method85(int i) {
        anInt5472++;
        if (Class331.aBoolean4129) {
            Class144.method1631((byte) 126);
        }
        EntityNode_Sub3_Sub1.method944(-7733);
        if (Class93.aGraphicsToolkit1241 != null) {
            Class93.aGraphicsToolkit1241.method1233(-7751);
        }
        if (DrawableModel.aFrame907 != null) {
            Node_Sub25_Sub4.method2679(Class240.aSignLink2946, 0, DrawableModel.aFrame907);
            DrawableModel.aFrame907 = null;
        }
        Class218.aClass123_2566.method1513(-28176);
        Class218.aClass123_2560.method1513(-28176);
        Class290_Sub4.method3430(true);
        Class267.aClass266_3449.method3235(false);
        Class320_Sub1.aClass141_8207.method1613(-110);
        if (Animable.aClass193_5936 != null) {
            Animable.aClass193_5936.method1957(5247);
            Animable.aClass193_5936 = null;
        }
        try {
            Class99.aSeekableFile1289.method3575(2);
            for (int i_24_ = 0; i_24_ < Class150_Sub1.aSeekableFileArray8953.length; i_24_++)
                Class150_Sub1.aSeekableFileArray8953[i_24_].method3575(2);
            Class3.aSeekableFile5156.method3575(2);
            Class366.aSeekableFile4529.method3575(2);
            Node_Sub24.method2649(true);
        } catch (Exception exception) {
            /* empty */
        }
    }

    private final void method108(int i) {
        anInt5465++;
        if (GLToolkit.anInt6509 < Class267.aClass266_3449.anInt3394) {
            Class181.aClass197_2155.method1997(17418);
            Class262_Sub13.anInt7800 = 5 * (-50 + 50 * Class267.aClass266_3449.anInt3394);
            if ((Class262_Sub13.anInt7800 ^ 0xffffffff) < -3001) {
                Class262_Sub13.anInt7800 = 3000;
            }
            if ((Class267.aClass266_3449.anInt3394 ^ 0xffffffff) <= -3
                && (Class267.aClass266_3449.anInt3393 ^ 0xffffffff) == -7) {
                this.method90("js5connect_outofdate", (byte) 39);
                Class151.anInt1843 = 16;
                return;
            }
            if (Class267.aClass266_3449.anInt3394 >= 4 && Class267.aClass266_3449.anInt3393 == -1) {
                this.method90("js5crc", (byte) 39);
                Class151.anInt1843 = 16;
                return;
            }
            if ((Class267.aClass266_3449.anInt3394 ^ 0xffffffff) <= -5
                && RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)) {
                if ((Class267.aClass266_3449.anInt3393 ^ 0xffffffff) != -8 && Class267.aClass266_3449.anInt3393 != 9) {
                    if ((Class267.aClass266_3449.anInt3393 ^ 0xffffffff) < -1) {
                        if (Class204.aString2458 != null) {
                            this.method90("js5proxy_" + Class204.aString2458.trim(), (byte) 39);
                        } else {
                            JOptionPane.showMessageDialog(null, "Unable to connect to " + Settings.SERVER_NAME
                                                                + ".\n Please check your internet connection and verify"
                                                                + " that the server is online.\n The client will now "
                                                                + "close.");
                            this.method90("js5connect", (byte) 39);
                            System.exit(0);
                        }
                    } else {
                        this.method90("js5io", (byte) 39);
                    }
                } else {
                    this.method90("js5connect_full", (byte) 39);
                }
                Class151.anInt1843 = 16;
                return;
            }
        }
        GLToolkit.anInt6509 = Class267.aClass266_3449.anInt3394;
        if ((Class262_Sub13.anInt7800 ^ 0xffffffff) < -1) {
            Class262_Sub13.anInt7800--;
        } else {
            do {
                try {
                    if (Class290_Sub2.anInt8069 == 0) {
                        Node_Sub36_Sub3.aClass241_10059 = Class181.aClass197_2155.method2000((byte) -37,
                                Class240.aSignLink2946);
                        Class290_Sub2.anInt8069++;
                    }
                    if (Class290_Sub2.anInt8069 == 1) {
                        if (Node_Sub36_Sub3.aClass241_10059.anInt2953 == 2) {
                            if (Node_Sub36_Sub3.aClass241_10059.anObject2956 != null) {
                                Class204.aString2458 = (String) Node_Sub36_Sub3.aClass241_10059.anObject2956;
                            }
                            method119(false, 1000);
                            break;
                        }
                        if (Node_Sub36_Sub3.aClass241_10059.anInt2953 == 1) {
                            Class290_Sub2.anInt8069++;
                        }
                    }
                    if ((Class290_Sub2.anInt8069 ^ 0xffffffff) == -3) {
                        Node_Sub38_Sub33.aBufferedConnection10440 = new BufferedConnection((Socket)
                                Node_Sub36_Sub3.aClass241_10059.anObject2956, Class240.aSignLink2946, 25000);
                        BufferedStream buffer = new BufferedStream(9);
                        buffer.writeByte(Plane.aClass133_3409.packetId);
                        buffer.writeInt(667);
                        buffer.writeInt(Settings.SUB_BUILD);
                        Node_Sub38_Sub33.aBufferedConnection10440.method429(0, 9, buffer.buffer, (byte) 78);
                        Class290_Sub2.anInt8069++;
                        Node_Sub38_Sub36.aLong10462 = Class313.method3650(false);
                    }
                    if (Class290_Sub2.anInt8069 == 3) {
                        if (RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)
                            || (Node_Sub38_Sub33.aBufferedConnection10440.method428(0) ^ 0xffffffff) < -1) {
                            int i_26_ = Node_Sub38_Sub33.aBufferedConnection10440.method424(-1);
                            if (i_26_ != 0) {
                                method119(false, i_26_);
                                break;
                            }
                            Class290_Sub2.anInt8069++;
                        } else if ((Class313.method3650(false) + -Node_Sub38_Sub36.aLong10462 ^ 0xffffffffffffffffL)
                                   < -30001L) {
                            method119(false, 1001);
                            break;
                        }
                    }
                    if ((Class290_Sub2.anInt8069 ^ 0xffffffff) != -5) {
                        break;
                    }
                    boolean bool = RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)
                                   || Class26.method311(Class151.anInt1843, -5)
                                   || Class329.method3833((byte) -61, Class151.anInt1843);
                    Class298[] class298s = Class298.method3481(-125);
                    BufferedStream buffer = new BufferedStream(4 * class298s.length);
                    Node_Sub38_Sub33.aBufferedConnection10440.method425(buffer.buffer.length, (byte) 112, 0, buffer
                            .buffer);
                    for (int i_27_ = 0; class298s.length > i_27_; i_27_++)
                        class298s[i_27_].method3482((byte) -98, buffer.readInt());
                    Class267.aClass266_3449.method3241(!bool, -118, Node_Sub38_Sub33.aBufferedConnection10440);
                    Class290_Sub2.anInt8069 = 0;
                    Node_Sub38_Sub33.aBufferedConnection10440 = null;
                    Node_Sub36_Sub3.aClass241_10059 = null;
                } catch (java.io.IOException ioexception) {
                    method119(false, 1002);
                    break;
                }
                break;
            } while (false);
        }
    }

    static final IComponentDefinitions method109(IComponentDefinitions widget) {
        int i = method113(widget).method2745(-121);
        if (i == 0) {
            return null;
        }
        for (int i_28_ = 0; i_28_ < i; i_28_++) {
            widget = Class76.method771((byte) 107, widget.parentId);
            if (widget == null) {
                return null;
            }
        }
        return widget;
    }

    private final void method110(int i) {
        if ((Class151.anInt1843 ^ 0xffffffff) == -8 && !Class132.method1561(-1)
            || (Class151.anInt1843 ^ 0xffffffff) == -10 && Class339_Sub2.anInt8653 == 42) {
            if ((Node_Sub19.anInt7163 ^ 0xffffffff) < -2) {
                Node_Sub19.anInt7163--;
                Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
            }
            if (!Class213.aBoolean2510) {
                Node_Sub7.method2421((byte) 98);
            }
            for (int i_29_ = 0; i_29_ < 100; i_29_++) {
                if (!Class194_Sub3_Sub1.method1980(Class218.aClass123_2560, 4096)) {
                    break;
                }
            }
        }
        anInt5482++;
        Node_Sub9_Sub1.anInt9637++;
        Class243.method3059(-1, (byte) 29, -1, null);
        CacheNode_Sub4.method2305(-1, true, -1, null);
        Node_Sub34.method2741(false);
        Class345.anInt4270++;
        for (int i_30_ = i; (i_30_ ^ 0xffffffff) > (Node_Sub32.cachedNPCcsCount ^ 0xffffffff); i_30_++) {
            Npc npc = Class314.LocalNPCs[i_30_].aNpc7518;
            if (npc != null) {
                byte b = npc.aNpcDefinition11122.aByte2816;
                if ((0x1 & b ^ 0xffffffff) != -1) {
                    int size = npc.getSize((byte) 48);
                    if ((b & 0x2 ^ 0xffffffff) != -1 && npc.anInt10904 == 0 && 1000.0 * Math.random() < 10.0) {
                        int xDiff = (int) Math.round(10.0 * Math.random() - 5.0);
                        int yDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
                        if ((xDiff ^ 0xffffffff) != -1 || yDiff != 0) {
                            int toX = xDiff + npc.scenePositionXQueue[0];
                            if ((toX ^ 0xffffffff) > -1) {
                                toX = 0;
                            } else if ((toX ^ 0xffffffff) < (-1 + Node_Sub54.GAME_SCENE_WDITH + -size ^ 0xffffffff)) {
                                toX = -1 + -size + Node_Sub54.GAME_SCENE_WDITH;
                            }
                            int toY = yDiff + npc.scenePositionYQueue[0];
                            if ((toY ^ 0xffffffff) <= -1) {
                                if ((toY ^ 0xffffffff) < (-1 + (Class377_Sub1.GAME_SCENE_HEIGHT - size) ^ 0xffffffff)) {
                                    toY = -1 + -size + Class377_Sub1.GAME_SCENE_HEIGHT;
                                }
                            } else {
                                toY = 0;
                            }
                            int steps = Class275.calculateRoute(npc.scenePositionXQueue[0], npc
                                    .scenePositionYQueue[0], toX, toY, size, -1, true, size, size, 0, 0,
                                    Class304.SCENE_CLIP_DATA_PLANES[npc.plane],
                                    Class328_Sub1.calculatedScenePositionXs, Class258.calculatedScenePositionYs,
                                    (byte) -41);
                            if ((steps ^ 0xffffffff) < -1) {
                                if ((steps ^ 0xffffffff) < -10) {
                                    steps = 9;
                                }
                                for (int count = 0; (steps ^ 0xffffffff) < (count ^ 0xffffffff); count++) {
                                    npc.scenePositionXQueue[count] = Class328_Sub1.calculatedScenePositionXs[steps + (
                                            -count - 1)];
                                    npc.scenePositionYQueue[count] = Class258.calculatedScenePositionYs[steps - count
                                                                                                        - 1];
                                    npc.movementTypeQueue[count] = (byte) 1;
                                }
                                npc.anInt10904 = steps;
                            }
                        }
                    }
                    Node_Sub20.method2614(true, npc, true);
                    int i_38_ = Class59.method586(i ^ ~0x8000, npc);
                    Class76.method769(npc, true);
                    Class352.method4009(Class275.anInt5412, i_38_, Class320_Sub23.anInt8431, i ^ 0xffffffff, npc);
                    Class372.method4103(65, npc, Class275.anInt5412);
                    Class34.method370(npc, (byte) 28);
                }
            }
        }
        if ((Class151.anInt1843 == 3 || Class151.anInt1843 == 9 || Class151.anInt1843 == 7) && (!Class132.method1561(-1)
                                                                                                || (Class151.anInt1843
                                                                                                    ^ 0xffffffff) == -10
                                                                                                   &&
                                                                                                   (Class339_Sub2.anInt8653
                                                                                                    ^ 0xffffffff)
                                                                                                   == -43)
            && Class4.anInt124 == 0) {
            if (Class320_Sub22.anInt8415 != 2) {
                Class309.method3586(i ^ 0x69);
            } else {
                Class314.method3652(i + 70);
            }
            if (Class98.anInt5061 >> 9 < 14 || Class98.anInt5061 >> 9 >= -14 + Node_Sub54.GAME_SCENE_WDITH
                || Node_Sub10.anInt7079 >> 9 < 14
                || Node_Sub10.anInt7079 >> 9 >= -14 + Class377_Sub1.GAME_SCENE_HEIGHT) {
                CacheNode_Sub3.method2292(8);
            }
        }
        for (; ; ) {
            Node_Sub37 node_sub37 = (Node_Sub37) CacheNode_Sub14_Sub2.aClass312_11039.method3619(-124);
            if (node_sub37 == null) {
                break;
            }
            IComponentDefinitions widget = node_sub37.aWidget7437;
            if (widget.anInt4687 >= 0) {
                IComponentDefinitions widget_39_ = Class76.method771((byte) 107, widget.parentId);
                if (widget_39_ == null || widget_39_.aWidgetArray4804 == null
                    || (widget_39_.aWidgetArray4804.length ^ 0xffffffff) >= (widget.anInt4687 ^ 0xffffffff)
                    || widget != widget_39_.aWidgetArray4804[widget.anInt4687]) {
                    continue;
                }
            }
            ClientScriptsExecutor.method3556(node_sub37);
        }
        for (; ; ) {
            Node_Sub37 node_sub37 = (Node_Sub37) Node_Sub5.aClass312_7028.method3619(-106);
            if (node_sub37 == null) {
                break;
            }
            IComponentDefinitions widget = node_sub37.aWidget7437;
            if ((widget.anInt4687 ^ 0xffffffff) <= -1) {
                IComponentDefinitions widget_40_ = Class76.method771((byte) 107, widget.parentId);
                if (widget_40_ == null || widget_40_.aWidgetArray4804 == null
                    || (widget_40_.aWidgetArray4804.length ^ 0xffffffff) >= (widget.anInt4687 ^ 0xffffffff)
                    || widget != widget_40_.aWidgetArray4804[widget.anInt4687]) {
                    continue;
                }
            }
            ClientScriptsExecutor.method3556(node_sub37);
        }
        for (; ; ) {
            Node_Sub37 node_sub37 = (Node_Sub37) Class275.aClass312_5419.method3619(-102);
            if (node_sub37 == null) {
                break;
            }
            IComponentDefinitions widget = node_sub37.aWidget7437;
            if (widget.anInt4687 >= 0) {
                IComponentDefinitions widget_41_ = Class76.method771((byte) 107, widget.parentId);
                if (widget_41_ == null || widget_41_.aWidgetArray4804 == null
                    || widget_41_.aWidgetArray4804.length <= widget.anInt4687
                    || widget_41_.aWidgetArray4804[widget.anInt4687] != widget) {
                    continue;
                }
            }
            ClientScriptsExecutor.method3556(node_sub37);
        }
        if (Class58.aWidget861 != null) {
            Class277_Sub1.method3357(true);
        }
        if ((Class174.clientCycle % 1500 ^ 0xffffffff) == -1) {
            Node_Sub24.method2644((byte) -42);
        }
        if ((Class151.anInt1843 ^ 0xffffffff) == -8 && !Class132.method1561(-1)
            || Class151.anInt1843 == 9 && (Class339_Sub2.anInt8653 ^ 0xffffffff) == -43) {
            Class168.method1754(true);
        }
        Class312.method3618(16711680);
        if (Class331.aBoolean4129 && (Class313.method3650(false) + -60000L ^ 0xffffffffffffffffL) < (
                Animable_Sub2_Sub1.aLong10630 ^ 0xffffffffffffffffL)) {
            Class144.method1631((byte) 123);
        }
        for (EntityNode_Sub3_Sub1 entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1113(
                (byte) 120);
             entitynode_sub3_sub1
             != null; entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1108(104)) {
            if (((long) entitynode_sub3_sub1.anInt9162 ^ 0xffffffffffffffffL) > (
                    Class313.method3650(false) / 1000L + -5L ^ 0xffffffffffffffffL)) {
                if ((entitynode_sub3_sub1.aShort9164 ^ 0xffffffff) < -1) {
                    Class28.method331(entitynode_sub3_sub1.aString9156
                                      + Class22.aClass22_382.method297(Class35.language), "", 123, 0, "", "", 5);
                }
                if (entitynode_sub3_sub1.aShort9164 == 0) {
                    Class28.method331(
                            entitynode_sub3_sub1.aString9156 + Class22.aClass22_383.method297(Class35.language), "",
                            i + 101, 0, "", "", 5);
                }
                entitynode_sub3_sub1.method803(false);
            }
        }
        do {
            if ((Class151.anInt1843 ^ 0xffffffff) == -8 && !Class132.method1561(-1)
                || (Class151.anInt1843 ^ 0xffffffff) == -10 && Class339_Sub2.anInt8653 == 42) {
                if (Class151.anInt1843 != 9 && Class218.aClass123_2560.aClass365_1557 == null) {
                    Class127.method1542(11582, false);
                    break;
                }
                if (Class218.aClass123_2560 != null) {
                    Class218.aClass123_2560.anInt1579++;
                    if ((Class218.aClass123_2560.anInt1579 ^ 0xffffffff) < -51) {
                        Class365.anInt4524++;
                        Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class224.OUTCOMMING_PACKET_16,
                                Class218.aClass123_2560.anIsaacCipher1571);
                        Class218.aClass123_2560.sendPacket(126, node_sub13);
                    }
                    try {
                        Class218.aClass123_2560.method1512((byte) -89);
                    } catch (java.io.IOException ioexception) {
                        if (Class151.anInt1843 != 9) {
                            Class127.method1542(11582, false);
                        } else {
                            Class218.aClass123_2560.method1513(-28176);
                            break;
                        }
                    }
                    break;
                }
            }
        } while (false);
    }

    private final void method111(int i) {
        anInt5478++;
        boolean bool = Class267.aClass266_3449.method3238((byte) 70);
        if (i == -24625) {
            if (!bool) {
                method108(-67);
            }
        }
    }

    static final boolean method112(IComponentDefinitions widget) {
        if (Class54.aBoolean817) {
            if (method113(widget).settingsHash != 0) {
                return false;
            }
            if (widget.type == 0) {
                return false;
            }
        }
        return widget.hidden;
    }

    final void method89(byte b) {
        method105(false);
        anInt5469++;
        Class9.method185((byte) 23);
        Class62.method609((byte) 55);
        CacheNode_Sub2.method2286(-9303);
        Class22.method299(false);
        Class291.method3451(1);
        Class93.method1042((byte) 48);
        Class102.method1096(15);
        Class19.method267((byte) -21);
        Class206.method2036(44);
        Node_Sub28.method2702(97);
        Class153.method1696((byte) -102);
        Actor.method851(21049);
        Class298.method3486(1000);
        Animator.method233(100);
        Class186.method1874((byte) -84);
        Class173.method1798(10675);
        IComponentDefinitions.method4146((byte) 123);
        Class277.method3342(true);
        CacheNode.method2278(117);
        Node.method2164(-1);
        Class158.method1716((byte) 91);
        HashTable.method1521((byte) -84);
        GameStub.method94((byte) -99);
        Class234.method2149((byte) -70);
        Class129.method1555(-66);
        Class329.method3837((byte) 120);
        Class336.method3866(5182);
        GraphicsToolkit.method1237(-1);
        Node_Sub27.method2692((byte) 35);
        Node_Sub39.method2919(true);
        Class223.method2102((byte) 71);
        Class275.method3331(-1);
        Class312.method3610(false);
        BufferedConnection.method421(-22344);
        Class266.method3248(0);
        Class141.method1618(true);
        Class232.method2135(5);
        Class34_Sub1.method384(-21352);
        SeekableFile.method3578(65280);
        MainFile.method178(66);
        Class61.method606(-26792);
        Class281.method3381(21);
        Class239.method3024(2);
        Class362.method4050(false);
        Class71.method744(-14980);
        Class58.method578(true);
        Class181.method1831(-50);
        Class308.method3583(5);
        Class359.method4035(17665);
        Class215.method2064((byte) -60);
        Class338.method3910(107);
        Class279.method3372(5);
        Class86.method1001(32);
        Class32.method358(7);
        Class37.method400(-14514);
        Class278.method3368(2686);
        Class57.method567(-74);
        Class101.method1092((byte) 98);
        Class180.method1822(74);
        Class142.method1619(false);
        Class176.method1806(-25421);
        Class128.method1545(true);
        Class229.method2124((byte) 39);
        Class315.method3659(126);
        Class13.method212((byte) -122);
        Class122.method1507(-125);
        Class363.method4056(true);
        Class1.method165((byte) -112);
        Node_Sub41.method2930(17334);
        Class365.method4064(29838);
        Class123.method1509(117);
        Class193.method1956((byte) -32);
        BufferedStream.method2234(true);
        Class84.method981((byte) -109);
        Class277_Sub1.method3358(false);
        CacheNode_Sub11.method2338((byte) 89);
        Class224.method2106((byte) 37);
        Player.method884(16053);
        ClanChat.method491((byte) 123);
        Node_Sub43.method2944(6);
        Class261.method3143(4096);
        Class257.method3123(true);
        Node_Sub8.method2425(90);
        Node_Sub2.method2168(0);
        InterfaceSettings.method2749(1914561);
        CacheNode_Sub20.method2410(true);
        IncommingPacket.method1952(122);
        IsaacCipher.method1669(31);
        Packet.method2254((byte) -49);
        Class125.method1528((byte) -64);
        Class385.method4206((byte) 77);
        EntityNode_Sub3.method938(78);
        Class60.method593(4);
        Class377_Sub1.method4132(104);
        Class85.method998(-109);
        RuntimeException_Sub1.method4208((byte) -94);
        Class4.method170(2);
        Class294.method3465((byte) 116);
        CacheNode_Sub16_Sub2.method2390(-126);
        CacheNode_Sub16_Sub1.method2388(false);
        Class203.method2029(-127);
        Class243.method3058(-29825);
        Plane.method3254((byte) 115);
        Class121.method1232((byte) -123);
        DrawableModel.method623(-3581);
        NpcDefinition.method3003((byte) -88);
        Class361.method4048((byte) 4);
        ItemDefinitions.method1680((byte) 121);
        Class52.method532((byte) -72);
        TemporaryItemDefinition.method402(0);
        FileOnDisk.method1099(2);
        Class187.method1880((byte) -127);
        Class320_Sub13.method3731((byte) -88);
        Class320_Sub22.method3767(-14965);
        Class320_Sub5.method3696(-15183);
        Class320_Sub16.method3743((byte) -110);
        Class320_Sub23.method3768((byte) -96);
        Class320_Sub6.method3704(-29);
        Class320_Sub24.method3771(0);
        Class320_Sub12.method3729((byte) 37);
        Class320_Sub3.method3687(3);
        Class320_Sub28.method3785(-97);
        Class320_Sub18.method3748((byte) -53);
        Class320_Sub2.method3683(false);
        Class320_Sub7.method3706((byte) 122);
        Class320_Sub29.method3792(true);
        Class320_Sub19.method3752((byte) 112);
        Class320_Sub26.method3778(103);
        Class320_Sub1.method3679(3);
        Class320_Sub15.method3740(true);
        Class320_Sub21.method3759(false);
        Class320_Sub10.method3719((byte) -86);
        Class320_Sub17.method3745(-7789);
        Class304.method3546((byte) 86);
        Renderer.method3447(-102);
        Exception_Sub1.method140(false);
        aa.method158(32);
        za.method2990(-1871);
        Class357.method4025((byte) -128);
        Class198.method2003(16);
        Node_Sub29.method2713(1);
        Class270.method3296(119);
        Class97.method1078(7750473);
        Mobile.method846(false);
        Animable.method812((byte) -105);
        Node_Sub9_Sub1.method2454(1968219983);
        Class42.method448(58);
        Class191.method1950(false);
        Class78.method781(true);
        Class48.method482(0);
        ClientScriptsExecutor.method3560();
        OutcommingPacket.method3670(47);
        Class212.method2052(-2);
        Node_Sub25_Sub4.method2681(27);
        Class189.method1927(1);
        Class189_Sub1.method1936(1);
        Node_Sub25_Sub3.method2668((byte) -77);
        Node_Sub25_Sub1.method2662(-25081);
        Node_Sub9_Sub5.method2527(92);
        Class370.method4088(16);
        Class252.method3102(95);
        Class110.method1134(97);
        Class286.method3394((byte) 49);
        Class274.method3324((byte) -127);
        Class163.method1733(true);
        Class220.method2098(true);
        Class250.method3094((byte) -99);
        Class254.method3110(19701);
        Class20.method287();
        Class30.method342(-1);
        Class89.method1020(31);
        Class96.method1070((byte) -107);
        Class92.method1037(-29003);
        Class324.method3813(10);
        Class40.method431(111);
        Class379.method4163((byte) 66);
        Class77.method774(194);
        Class154.method1700(37);
        Class179.method1814(14398);
        Class39.method418((byte) -119);
        EntityNode_Sub6.method970(0);
        Class171.method1794(29383);
        Class165.method1744((byte) 107);
        AnimableAnimator_Sub1.method255((byte) -103);
        Class99.method1085(-50);
        EntityNode_Sub4.method956();
        Class259.method3129((byte) 99);
        ReferenceTable.method264(112);
        Class34.method372((byte) -72);
        Class20_Sub1.method293((byte) 124);
        Class303.method3541((byte) -102);
        Class157.method1711(58);
        Class79.method783(5621);
        Class299.method3493();
        Class67.method732((byte) 91);
        Class133.method1566(72);
        Class172.method1796(-1);
        Class119.method1227(false);
        Class113.method1149(-68);
        Class16.method221((byte) 76);
        Node_Sub37.method2773(false);
        ClientScript.method2323(6);
        Class168.method1753(-100);
        Npc.method872(false);
        Class343.method3963(-28381);
        CacheNode_Sub16.method2384((byte) 63);
        Class10.method190(119);
        Class326.method3815(4);
        Class273.method3317(0);
        Animable_Sub3.method920(22056);
        Animable_Sub2.method838(-75);
        Class256.method3120((byte) -85);
        r.method2362(-10);
        Class376.method4117(-122);
        Class182.method1836();
        Class300.method3494((byte) 109);
        Class218.method2076((byte) 115);
        Class17.method259(-108);
        Node_Sub40.method2925(13);
        CacheNode_Sub15.method2380(false);
        Class222.method2101();
        Class364.method4058(-96);
        Class12.method202(-2);
        Class195.method1984(4);
        Class342.method3961((byte) 53);
        Node_Sub16.method2592(-127);
        Node_Sub32.method2730(-117);
        Class216.method2073((byte) -124);
        Class262.method3147(106);
        PlayerUpdateReference.method3811(-3182);
        Node_Sub44.method2945(31087);
        Node_Sub47.method2950(256);
        Node_Sub49.method2957();
        Class289.method3407(false);
        Class236.method3011(false);
        Class264.method3230((byte) -5);
        Class293.method3464(10196);
        Class314.method3651(true);
        Class140.method1609(-113);
        Class267.method3286((byte) -20);
        Class184.method1848(0);
        Class82.method796((byte) -99);
        Class7.method183(false);
        Class367.method4076(102);
        CacheNode_Sub1.method2285(12228);
        Class355.method4022(false);
        Class249.method3088((byte) 107);
        Class332.method3845(107);
        Class335.method3850(-14731);
        Class147.method1648(true);
        Class43.method459(-118);
        Class253.method3106((byte) -33);
        Class204.method2031(true);
        Class124.method1526(true);
        Class226.method2111(true);
        Class219.method2096(true);
        Class130.method1558(-4800);
        Class330.method3839((byte) -101);
        AnimableAnimator.method252(7);
        Class114.method1154(-1);
        EntityNode_Sub1.method804(true);
        Mobile_Sub1.method900(-105);
        Mobile_Sub4.method916(-1);
        TileMessage.method935(-7576);
        Class155.method1702((byte) -39);
        Class217.method2074((byte) 112);
        Class162.method1732(true);
        CacheNode_Sub10.method2331(1);
        Class151.method1672(30781);
        Class24.method303((byte) -55);
        Class47.method474(1);
        Class356.method4023(1);
        Class248.method3085(1);
        Class15.method218(true);
        Animable_Sub3_Sub1.method923(7528);
        Animable_Sub2_Sub1.method840(-17940);
        Animable_Sub4_Sub2.method934(-1703522551);
        Mobile_Sub3.method905((byte) 121);
        Class18.method265((byte) 76);
        Class148.method1651(118);
        Class291_Sub1.method3457(112);
        Class93_Sub2.method1063(true);
        Class170.method1791((byte) -125);
        Class55.method560((byte) -125);
        Class327.method3824(true);
        Class150_Sub3_Sub1.method1664(-104);
        Class116.method1162(103);
        Class166.method1745(-1);
        Class150_Sub3.method1662(-1);
        Class205.method2032((byte) 102);
        Class235_Sub1.method2159(79);
        Class150_Sub2.method1661(-66);
        Class235.method2155(2);
        Class150_Sub1.method1655((byte) 127);
        Class337.method3903(30694);
        Class91.method1034((byte) -57);
        CacheNode_Sub19.method2403(13012);
        CacheNode_Sub6.method2312(124);
        Class352.method4010(-9757);
        CacheNode_Sub3.method2295((byte) 73);
        Node_Sub25.method2655(27727);
        Class368.method4079((byte) 102);
        Node_Sub18.method2605((byte) -59);
        Class54.method557(true);
        Canvas.method124(12244);
        Class375.method4114(50);
        Class41.method433(0);
        IOException_Sub1.method132(-128);
        Class160.method1728((byte) -27);
        Class202.method2026(200);
        Class282.method3388(1);
        Class380.method4171((byte) -39);
        Class75.method764(0);
        Class201.method2025(false);
        Class90.method1027();
        Class231.method2134(0);
        Class115.method1161(118);
        CacheNode_Sub14.method2346(115);
        Class365_Sub1.method4069(30000);
        Node_Sub38_Sub27.method2879(false);
        Animable_Sub1_Sub1.method827((byte) -37);
        Class174.method1802((byte) -125);
        Node_Sub52.method2971((byte) 73);
        Class377.method4121(false);
        Class46.method466(540800);
        Class297.method3480((byte) -23);
        Node_Sub10.method2538((byte) -95);
        Class27.method325();
        Node_Sub9_Sub4.method2524(-91);
        Node_Sub6.method2414(1);
        Class227.method2119();
        Class31.method349();
        Node_Sub51.method2967(-4);
        Class240.method3029(-125);
        Class42_Sub2.method457();
        Class321.method3802(1999);
        Node_Sub25_Sub2.method2666(-2);
        Node_Sub38.method2774(16369);
        Class45.method463(2000);
        Class258.method3125((byte) 122);
        Class88.method1017((byte) -83);
        Class3.method169(-19320);
        Class260.method3138((byte) 36);
        Class230.method2130((byte) -33);
        Class230_Sub1.method2132(2);
        Class66_Sub1.method724(64);
        Class66.method718((byte) -126);
        Class66_Sub2.method725(3);
        Class105.method1118(98);
        Class83.method799(true);
        Class66_Sub2_Sub1.method729((byte) -73);
        Class371.method4099((byte) -119);
        Class295.method3473(-2594);
        Class246.method3074(-87);
        Class74.method757();
        Class350.method4000(-13);
        Node_Sub42.method2933(-3239);
        CacheNode_Sub5.method2310(true);
        EntityNode_Sub7.method975(true);
        Class269.method3293(65);
        EntityNode_Sub8.method980(21);
        Class63.method708(70);
        Class188.method1889((byte) 127);
        Class146.method1643(false);
        CacheNode_Sub14_Sub2.method2351(-513);
        Class233.method2142(31);
        Class262_Sub16.method3194((byte) 82);
        Class262_Sub2.method3154(false);
        Class262_Sub6.method3165(0);
        Class262_Sub12.method3180(30151);
        Class262_Sub13.method3181((byte) 125);
        Class262_Sub8.method3168(false);
        Class262_Sub14.method3186((byte) -114);
        Class262_Sub15_Sub1.method3191(256);
        Class262_Sub15.method3190((byte) -114);
        Class262_Sub5.method3162(0);
        Class262_Sub4.method3161(-94);
        Class262_Sub18.method3199((byte) 93);
        Class262_Sub10.method3172(true);
        Class262_Sub3.method3158(1);
        Class262_Sub21.method3205((byte) 40);
        Class262_Sub1.method3149((byte) 96);
        Class262_Sub9.method3170(false);
        Class262_Sub11.method3174(1570229672);
        Class262_Sub23.method3216((byte) -109);
        Class262_Sub19.method3202(70);
        Class262_Sub7.method3167(false);
        Node_Sub53.method2979((byte) 13);
        Class35.method388((byte) -78);
        Node_Sub38_Sub17.method2843(2);
        Node_Sub38_Sub8.method2816(true);
        Node_Sub38_Sub1.method2790(false);
        Class64.method709((byte) 119);
        Class336_Sub2.method3892(-95);
        Class374.method4110(0);
        GLToolkit.method1416((byte) 103);
        Class136.method1589(24954);
        Class73.method752(126);
        Class247.method3083(false);
        Node_Sub23_Sub1.method2639((byte) -16);
        Class29.method335((byte) -128);
        Class336_Sub3.method3900(98);
        Class167.method1750(-1);
        Class382.method4185(false);
        Class169.method1764(-120);
        Class169_Sub2.method1771(0);
        Class270_Sub2.method3305(30188);
        GLDrawableModel.method644(-13888);
        Class69.method735((byte) -52);
        Class169_Sub1.method1770((byte) -18);
        Class126.method1533(1);
        Class372.method4102((byte) -122);
        Class56.method564(4);
        Class346.method3976(5258);
        Class94.method1064(-101);
        Class307.method3579(96);
        Class270_Sub1.method3297(-72);
        Class26.method314((byte) 100);
        Class213.method2055((byte) -126);
        StandardDrawableModel.method699((byte) -39);
        Class68.method734(8934);
        Class139.method1605(1465);
        GLXToolkit.method1404(0);
        Class51_Sub1.method523(true);
        Class196.method1992();
        Node_Sub38_Sub26.method2874(-105);
        Node_Sub38_Sub33.method2899((byte) 58);
        Node_Sub38_Sub25.method2872((byte) -38);
        Node_Sub38_Sub11.method2829((byte) 8);
        Node_Sub38_Sub35.method2903((byte) -107);
        Node_Sub38_Sub18.method2845((byte) 124);
        Node_Sub38_Sub37.method2906((byte) -92);
        Node_Sub38_Sub38.method2915(-1);
        Node_Sub38_Sub14.method2837(6);
        Node_Sub38_Sub3.method2796(-43);
        Node_Sub38_Sub4.method2798((byte) -113);
        Node_Sub38_Sub34.method2902((byte) 124);
        Node_Sub38_Sub29.method2890((byte) 45);
        Node_Sub38_Sub23.method2864(-22994);
        Node_Sub38_Sub39.method2917(0);
        Node_Sub38_Sub9.method2821((byte) 97);
        Node_Sub38_Sub10.method2825((byte) -103);
        Node_Sub38_Sub2.method2794(0);
        Node_Sub38_Sub16.method2839(5);
        Node_Sub38_Sub31.method2892(-122);
        Node_Sub38_Sub21.method2858((byte) 69);
        Node_Sub38_Sub5.method2803(118);
        Node_Sub38_Sub6.method2804((byte) 100);
        Node_Sub38_Sub28.method2885((byte) 119);
        Node_Sub38_Sub7.method2808((byte) 24);
        Node_Sub38_Sub24.method2867(-24055);
        Node_Sub38_Sub13.method2832((byte) 121);
        Node_Sub38_Sub32.method2895(true);
        Node_Sub38_Sub19.method2848(113);
        Node_Sub38_Sub22.method2860((byte) 28);
        Node_Sub38_Sub20.method2852(-9200);
        Node_Sub38_Sub15.method2838(12893);
        Class238.method3018((byte) 92);
        Node_Sub22.method2621();
        Class209.method2048(true);
        Class214.method2061((byte) -78);
        ProducingGraphicsBuffer.method2602((byte) 112);
        Class366.method4072(true);
        Class137.method1600(0);
        Class200_Sub2.method2018(31891);
        GLPlane.method3263((byte) 127);
        Class145.method1640((byte) -31);
        Class169_Sub3.method1780((byte) -95);
        CacheNode_Sub17.method2395(-102);
        Node_Sub23.method2628(true);
        Class339_Sub6.method3938((byte) 120);
        Class72.method747(25802);
        Class190.method1942((byte) 19);
        r_Sub2.method2377((byte) 107);
        aa_Sub3.method161(-112);
        Node_Sub33.method2736(65280);
        Class50.method510(0);
        Class270_Sub2_Sub2.method3310(-86);
        Class117_Sub1.method1169((byte) 127);
        Class117.method1164(-1770635295);
        Class117_Sub2.method1173((byte) -119);
        Class200_Sub1.method2016(33);
        Class339_Sub1.method3926(-31657);
        Class339_Sub9.method3947((byte) 68);
        Class339_Sub2.method3927(-127);
        Class169_Sub4.method1785(-19734);
        Class339_Sub5.method3936(121);
        Class339_Sub3.method3931(0);
        Class339_Sub4.method3934(-91);
        Class339_Sub7.method3943((byte) 47);
        Class210.method2050(127);
        Class21.method296(14);
        Class44.method460(0);
        Class228.method2121((byte) 91);
        za_Sub2.method2996(21);
        Class14.method216(20185);
        r_Sub1.method2366(-1612655536);
        Class225.method2109(20);
        Class328_Sub1.method3831(123);
        StandardSprite.method1214((byte) 126);
        StandardPlane.method3274((byte) 66);
        Node_Sub54.method2987(1);
        Class263.method3219(true);
        Class290_Sub5.method3437(0);
        Class290_Sub4.method3433(64);
        Class290_Sub7.method3440(-128);
        Class290_Sub6.method3439((byte) -120);
        Class188_Sub1.method1892(4);
        Class188_Sub2.method1904(false);
        Class328.method3828(1);
        Class175.method1804(true);
        Class134_Sub4.method1585((byte) 127);
        Class134.method1571(65);
        Class134_Sub3.method1584(1);
        Class290_Sub11.method3444(-105);
        Class106.method1122((byte) 14);
        Class290_Sub1.method3423(false);
        Class290_Sub3.method3428((byte) -120);
        Class51.method514(2);
        Class51_Sub2.method524((byte) -68);
        Class194_Sub3.method1974(16845);
        Class194.method1963((byte) -37);
        Class194_Sub3_Sub1.method1981(-127);
        Class194_Sub2.method1971((byte) 112);
        Class194_Sub1_Sub1.method1968(0);
        Class194_Sub1.method1967(-11840);
        Node_Sub46.method2949(-1570);
        Node_Sub26.method2687(-1);
        Class245.method3066(-26);
        Node_Sub24.method2648((byte) 47);
        Class237.method3016(-1);
        EntityNode_Sub3_Sub1.method942(false);
        CacheNode_Sub12.method2342((byte) -79);
        CacheNode_Sub18.method2399(22035);
        Node_Sub5.method2269(-6);
        Class127.method1541(-103);
        InputStream_Sub2.method130(30000);
        OutputStream_Sub2.method137(-5656);
        Class296.method3475(255);
        Class345.method3970(1);
        Node_Sub30.method2724((byte) 66);
        Node_Sub34.method2740((byte) -112);
        Node_Sub20.method2616(0);
        CacheNode_Sub4.method2306(1);
        Node_Sub36.method2755((byte) 91);
        Node_Sub36_Sub1.method2759((byte) -93);
        Node_Sub36_Sub3.method2763((byte) 76);
        Node_Sub36_Sub4.method2765(true);
        Node_Sub36_Sub2.method2760(0);
        Node_Sub15.method2555((byte) -70);
        Node_Sub15_Sub2.method2562(66);
        Node_Sub15_Sub7.method2574(-256);
        Node_Sub15_Sub5.method2570(-96);
        Node_Sub15_Sub10.method2579((byte) 35);
        Node_Sub15_Sub4.method2565(1973);
        Node_Sub15_Sub13.method2585(0);
        Node_Sub15_Sub6.method2573((byte) -57);
        Node_Sub15_Sub11.method2581(70);
        Node_Sub15_Sub9.method2577(11);
        Node_Sub15_Sub12.method2584((byte) -127);
        Node_Sub12.method2544(121);
        Node_Sub5_Sub2.method2274((byte) -128);
        Class156.method1707(512);
        OutputStream_Sub1.method135((byte) -51);
        InputStream_Sub1.method127(-1);
        Class143.method1624((byte) 122);
        Node_Sub21.method2617(-89);
        Class132.method1562(27307);
        Class152.method1694((byte) 59);
        Class107.method1125(-114);
        Class319.method3672(6);
        Class188_Sub1_Sub1.method1893(2);
        Class188_Sub2_Sub2.method1912((byte) -115);
        Class347.method3978((byte) -109);
        Class221.method2100((byte) 100);
        Class344.method3969(110);
        Class284.method3390((byte) -83);
        Class144.method1627(false);
        Class144_Sub4.method1637(124);
        Class144_Sub3.method1636(-1);
        Class144_Sub1.method1632(256);
        Class188_Sub1_Sub2.method1902((byte) -80);
        Class188_Sub2_Sub1.method1906((byte) 89);
    }

    static final InterfaceSettings method113(IComponentDefinitions widget) {
        InterfaceSettings node_sub35 = (InterfaceSettings) Class156.aHashTable1964.method1518(3512,
                ((long) widget.ihash << 32) + (long) widget.anInt4687);
        if (node_sub35 != null) {
            return node_sub35;
        }
        return widget.aNode_Sub35_4840;
    }

    static final void method114(byte b, CacheNode_Sub13 cachenode_sub13) {
        anInt5475++;
        if (cachenode_sub13 != null) {
            Class368.aClass312_4549.method3625((byte) -54, cachenode_sub13);
            Class315.anInt4035++;
            CacheNode_Sub4 cachenode_sub4;
            if (cachenode_sub13.aBoolean9567 || "".equals(cachenode_sub13.aString9558)) {
                cachenode_sub4 = new CacheNode_Sub4(cachenode_sub13.aString9558);
                Class21.anInt355++;
            } else {
                long l = cachenode_sub13.aLong9564;
                for (cachenode_sub4 = (CacheNode_Sub4) Class261.aHashTable3306.method1518(3512, l); cachenode_sub4
                                                                                                    != null;
                     cachenode_sub4 = (CacheNode_Sub4) Class261.aHashTable3306.method1524((byte) 84)) {
                    if (cachenode_sub4.aString9458.equals(cachenode_sub13.aString9558)) {
                        break;
                    }
                }
                if (cachenode_sub4 == null) {
                    cachenode_sub4 = (CacheNode_Sub4) Class200_Sub2.aClass61_4941.method607(l, 0);
                    if (cachenode_sub4 != null && !cachenode_sub4.aString9458.equals(cachenode_sub13.aString9558)) {
                        cachenode_sub4 = null;
                    }
                    if (cachenode_sub4 == null) {
                        cachenode_sub4 = new CacheNode_Sub4(cachenode_sub13.aString9558);
                    }
                    Class261.aHashTable3306.method1515(l, cachenode_sub4, -126);
                    Class21.anInt355++;
                }
            }
            if (cachenode_sub4.method2303(-118, cachenode_sub13)) {
                GLSprite_Sub1.method1205(cachenode_sub4, (byte) 83);
            }
        }
    }

    static final void method115(IComponentDefinitions[] widgets, int i, int i_42_) {
        int i_43_ = 0;
        if (i != 5204) {
            method107();
        }
        for (/**/; (i_43_ ^ 0xffffffff) > (widgets.length ^ 0xffffffff); i_43_++) {
            IComponentDefinitions widget = widgets[i_43_];
            if (widget != null) {
                if (widget.type == 0) {
                    if (widget.aWidgetArray4793 != null) {
                        method115(widget.aWidgetArray4793, 5204, i_42_);
                    }
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) widget.ihash);
                    if (node_sub2 != null) {
                        Class76.method770(120, i_42_, node_sub2.interfaceId);
                    }
                }
                if (i_42_ == 0 && widget.anObjectArray4778 != null) {
                    Node_Sub37 node_sub37 = new Node_Sub37();
                    node_sub37.aWidget7437 = widget;
                    node_sub37.parameters = widget.anObjectArray4778;
                    ClientScriptsExecutor.method3556(node_sub37);
                }
                if (i_42_ == 1 && widget.anObjectArray4712 != null) {
                    if ((widget.anInt4687 ^ 0xffffffff) <= -1) {
                        IComponentDefinitions widget_44_ = Class76.method771((byte) 107, widget.ihash);
                        if (widget_44_ == null || widget_44_.aWidgetArray4804 == null
                            || widget_44_.aWidgetArray4804.length <= widget.anInt4687
                            || widget_44_.aWidgetArray4804[widget.anInt4687] != widget) {
                            continue;
                        }
                    }
                    Node_Sub37 node_sub37 = new Node_Sub37();
                    node_sub37.aWidget7437 = widget;
                    node_sub37.parameters = widget.anObjectArray4712;
                    ClientScriptsExecutor.method3556(node_sub37);
                }
            }
        }
        anInt5484++;
    }

    static final void method116() {
        Class99.anInt1286 = 0;
        for (int i = 0; i < Node_Sub25_Sub3.localNPCsCount; i++) {
            Npc npc = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i]))
                    .aNpc7518;
            if (npc.aBoolean10826 && npc.method855((byte) -123) != -1) {
                int i_45_ = (npc.getSize((byte) 63) - 1) * 256 + 252;
                int i_46_ = npc.anInt5934 - i_45_ >> 9;
                int i_47_ = npc.anInt5940 - i_45_ >> 9;
                Actor actor = Class104.method1115(i_46_, i_47_, npc.plane, 252);
                if (actor != null) {
                    int i_48_ = actor.index;
                    if (actor instanceof Npc) {
                        i_48_ += 2048;
                    }
                    if (actor.anInt10853 == 0 && actor.method855((byte) -121) != -1) {
                        Class171.anIntArray2070[Class99.anInt1286] = i_48_;
                        Node_Sub15_Sub4.anIntArray9802[Class99.anInt1286] = i_48_;
                        Class99.anInt1286++;
                        actor.anInt10853++;
                    }
                    Class171.anIntArray2070[Class99.anInt1286] = i_48_;
                    Node_Sub15_Sub4.anIntArray9802[Class99.anInt1286] = npc.index + 2048;
                    Class99.anInt1286++;
                    actor.anInt10853++;
                }
            }
        }
        Class93.method1049(Node_Sub15_Sub4.anIntArray9802, Class99.anInt1286 - 1, Class171.anIntArray2070, 0, 28627);
    }

    static final void method117() {
        for (int i = 0; i < Node_Sub54.GAME_SCENE_WDITH; i++) {
            int[] is = Node_Sub38_Sub16.anIntArrayArray10269[i];
            for (int i_49_ = 0; i_49_ < Class377_Sub1.GAME_SCENE_HEIGHT; i_49_++)
                is[i_49_] = 0;
        }
    }

    private final void method118(byte b) {
        do {
            try {
                anInt5479++;
                if ((Class151.anInt1843 ^ 0xffffffff) != -17) {
                    long l = Node_Sub15_Sub5.method2568(-1) / 1000000L + -Class114.aLong1460;
                    Class114.aLong1460 = Node_Sub15_Sub5.method2568(-1) / 1000000L;
                    boolean bool = Class303.method3540(false);
                    if (bool && Class377_Sub1.aBoolean8775 && AnimableAnimator.aClass42_5498 != null) {
                        AnimableAnimator.aClass42_5498.method451((byte) -50);
                    }
                    if (Class253.method3105(Class151.anInt1843, (byte) -25)) {
                        if ((Class320_Sub13.aLong8339 ^ 0xffffffffffffffffL) != -1L
                            && Class313.method3650(false) > Class320_Sub13.aLong8339) {
                            Node_Sub38_Sub19.method2850(3, Class188_Sub2_Sub1.getDisplayMode(3),
                                    Node_Sub44.anInt7551, false, Class234.anInt2787);
                        } else if (!Class93.aGraphicsToolkit1241.B() && Class169_Sub4.aBoolean8829) {
                            InputStream_Sub2.method128(30000);
                        }
                    }
                    if (DrawableModel.aFrame907 == null) {
                        java.awt.Container container;
                        if (Node_Sub29.aFrame7344 == null) {
                            if (Class96.anApplet1270 == null) {
                                container = Class82.aGameStub1123;
                            } else {
                                container = Class96.anApplet1270;
                            }
                        } else {
                            container = Node_Sub29.aFrame7344;
                        }
                        int i = container.getSize().width;
                        int i_50_ = container.getSize().height;
                        if (container == Node_Sub29.aFrame7344) {
                            Insets insets = Node_Sub29.aFrame7344.getInsets();
                            i_50_ -= insets.bottom + insets.top;
                            i -= insets.right + insets.left;
                        }
                        if ((Class36.anInt542 ^ 0xffffffff) != (i ^ 0xffffffff) || (i_50_ ^ 0xffffffff) != (
                                CacheNode_Sub3.anInt9441 ^ 0xffffffff) || Class152.aBoolean1942) {
                            if (Class93.aGraphicsToolkit1241 != null && !Class93.aGraphicsToolkit1241.b()) {
                                Class36.anInt542 = i;
                                CacheNode_Sub3.anInt9441 = i_50_;
                            } else {
                                Npc.method880((byte) 11);
                            }
                            Class320_Sub13.aLong8339 = 500L + Class313.method3650(false);
                            Class152.aBoolean1942 = false;
                        }
                    }
                    if (DrawableModel.aFrame907 != null && !Class51.aBoolean5331
                        && Class253.method3105(Class151.anInt1843, (byte) 65)) {
                        Node_Sub38_Sub19.method2850(3, Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678
                                (false), -1, false, -1);
                    }
                    boolean bool_51_ = false;
                    if (Class355.aBoolean4366) {
                        bool_51_ = true;
                        Class355.aBoolean4366 = false;
                    }
                    if (bool_51_) {
                        Node_Sub36_Sub1.method2758(-128);
                    }
                    if (Class93.aGraphicsToolkit1241 != null && Class93.aGraphicsToolkit1241.B()
                        || (Class188_Sub2_Sub1.getDisplayMode(3) ^ 0xffffffff) != -2) {
                        Class320_Sub21.method3764(-102);
                    }
                    if (RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)) {
                        Class194_Sub3.method1976(bool_51_, 5);
                    } else if (Class197.method1999(Class151.anInt1843, 128)) {
                        Class17.method260(-10498);
                    } else if (Node_Sub25_Sub2.method2665(Class151.anInt1843, (byte) -41)) {
                        Class17.method260(-10498);
                    } else if (!Class315.method3655(Class151.anInt1843, 128)) {
                        if ((Class151.anInt1843 ^ 0xffffffff) != -12) {
                            if (Class151.anInt1843 == 14) {
                                Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                                        Class22.aClass22_377.method297(Class35.language) + "<br>"
                                        + Class22.aClass22_378.method297(Class35.language), false,
                                        Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945, -16777216);
                            } else if ((Class151.anInt1843 ^ 0xffffffff) == -16) {
                                Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Class22.aClass22_394.method297
                                        (Class35.language), false, Class169_Sub3.aClass357_8820, StandardSprite
                                        .aClass52_8945, -16777216);
                            }
                        } else {
                            Class365.method4066(l, 105);
                        }
                    } else if (Class118.anInt5407 != 1) {
                        if ((Class118.anInt5407 ^ 0xffffffff) != -3) {
                            Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Class22.loading_translation
                                    .method297(Class35.language), true, Class169_Sub3.aClass357_8820, StandardSprite
                                    .aClass52_8945, -16777216);
                        } else {
                            if (Node_Sub2.anInt6937 > Class320_Sub19.anInt8388) {
                                Class320_Sub19.anInt8388 = Node_Sub2.anInt6937;
                            }
                            int i = (Class320_Sub19.anInt8388 - Node_Sub2.anInt6937) * 50 / Class320_Sub19.anInt8388
                                    + 50;
                            Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                                    Class22.loading_translation.method297(Class35.language) + "<br>(" + i
                                    + "%)", true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945,
                                    -16777216);
                        }
                    } else {
                        if ((Node_Sub29_Sub2.anInt10015 ^ 0xffffffff) < (Class188.anInt2287 ^ 0xffffffff)) {
                            Class188.anInt2287 = Node_Sub29_Sub2.anInt10015;
                        }
                        int i = (Class188.anInt2287 - Node_Sub29_Sub2.anInt10015) * 50 / Class188.anInt2287;
                        Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                                Class22.loading_translation.method297(Class35.language) + "<br>(" + i
                                + "%)", true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945, -16777216);
                    }
                    if (Class12.anInt193 == 3) {
                        for (int i = 0; (i ^ 0xffffffff) > (Node_Sub11.anInt7105 ^ 0xffffffff); i++) {
                            Rectangle rectangle = Node_Sub38_Sub28.aRectangleArray10404[i];
                            if (!Class190.aBooleanArray2326[i]) {
                                if (!Class320_Sub21.aBooleanArray8403[i]) {
                                    Class93.aGraphicsToolkit1241.method1234(rectangle.y, -16711936, rectangle.width,
                                            rectangle.height, (byte) -69, rectangle.x);
                                } else {
                                    Class93.aGraphicsToolkit1241.method1234(rectangle.y, -65536, rectangle.width,
                                            rectangle.height, (byte) -57, rectangle.x);
                                }
                            } else {
                                Class93.aGraphicsToolkit1241.method1234(rectangle.y, -65281, rectangle.width,
                                        rectangle.height, (byte) 108, rectangle.x);
                            }
                        }
                    }
                    if (GLXToolkit.method1401(-6279)) {
                        Node_Sub42.method2936(Class93.aGraphicsToolkit1241, -49);
                    }
                    if (Class240.aSignLink2946.aBoolean3985 && Class253.method3105(Class151.anInt1843, (byte) 80)
                        && Class12.anInt193 == 0 && (Class188_Sub2_Sub1.getDisplayMode(3) ^ 0xffffffff) == -2
                        && !bool_51_) {
                        int i = 0;
                        for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (Node_Sub11.anInt7105 ^ 0xffffffff); i_52_++) {
                            if (Class320_Sub21.aBooleanArray8403[i_52_]) {
                                Class320_Sub21.aBooleanArray8403[i_52_] = false;
                                Class134_Sub4.aRectangleArray9048[i++] = Node_Sub38_Sub28.aRectangleArray10404[i_52_];
                            }
                        }
                        try {
                            if (Class71.aBoolean967) {
                                Class371.method4092(16600, i, Class134_Sub4.aRectangleArray9048);
                            } else {
                                Class93.aGraphicsToolkit1241.method1246(i, (byte) -120,
                                        Class134_Sub4.aRectangleArray9048);
                            }
                        } catch (Exception_Sub1 exception_sub1) {
                            /* empty */
                        }
                    } else if (!RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)) {
                        for (int i = 0; i < Node_Sub11.anInt7105; i++)
                            Class320_Sub21.aBooleanArray8403[i] = false;
                        try {
                            if (!Class71.aBoolean967) {
                                Class93.aGraphicsToolkit1241.method1241(19088);
                            } else {
                                Class188_Sub1_Sub2.method1900((byte) 2);
                            }
                        } catch (Exception_Sub1 exception_sub1) {
                            ClanChat.method507(exception_sub1,
                                    exception_sub1.getMessage() + " (Recovered) " + method100(10), -122);
                            Class22.method300(0, true, false);
                        }
                    }
                    Node_Sub39.method2922(false);
                    int i = Class213.aNode_Sub27_2512.aClass320_Sub21_7293.method3762(false);
                    if ((i ^ 0xffffffff) == -1) {
                        Class262_Sub22.method3208(15L, false);
                    } else if (i == 1) {
                        Class262_Sub22.method3208(10L, false);
                    } else if ((i ^ 0xffffffff) != -3) {
                        if ((i ^ 0xffffffff) == -4) {
                            Class262_Sub22.method3208(2L, false);
                        }
                    } else {
                        Class262_Sub22.method3208(5L, false);
                    }
                    if (Node_Sub38_Sub31.aBoolean10418) {
                        Class326.method3820(-92);
                    }
                    if (Class213.aNode_Sub27_2512.aClass320_Sub10_7300.method3718(false) == 1 && Class151.anInt1843 == 3
                        && (Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0) {
                        Class213.aNode_Sub27_2512.method2690(41, 0, Class213.aNode_Sub27_2512.aClass320_Sub10_7300);
                        Node_Sub38_Sub31.method2893(1);
                    }
                    if (b < -79) {
                        break;
                    }
                    aClass192_5485 = null;
                }
            } catch (RuntimeException runtimeexception) {
                throw Class126.method1537(runtimeexception, "Client.EA(" + b + ')');
            }
            break;
        } while (false);
    }

    private final void method119(boolean bool, int i) {
        Node_Sub36_Sub3.aClass241_10059 = null;
        Class267.aClass266_3449.anInt3393 = i;
        Node_Sub38_Sub33.aBufferedConnection10440 = null;
        Class267.aClass266_3449.anInt3394++;
        Class290_Sub2.anInt8069 = 0;
        anInt5483++;
        if (bool != false) {
            aClass192_5485 = null;
        }
    }

    final void method97(int i) {
        do {
            try {
                anInt5468++;
                if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) != 2) {
                    method120(124);
                } else {
                    try {
                        method120(71);
                    } catch (Throwable throwable) {
                        ClanChat.method507(throwable,
                                throwable.getMessage() + " (Recovered) " + method100(10), i ^ 0x5b88);
                        Node_Sub12.aBoolean5456 = true;
                        Class22.method300(0, true, false);
                    }
                }
                if (i == -23548) {
                    break;
                }
                method111(-23);
            } catch (RuntimeException runtimeexception) {
                throw Class126.method1537(runtimeexception, "Client.P(" + i + ')');
            }
            break;
        } while (false);
    }

    private final void method120(int i) {
        anInt5466++;
        if ((Class151.anInt1843 ^ 0xffffffff) != -17) {
            Class174.clientCycle++;
            if ((Class174.clientCycle % 1000 ^ 0xffffffff) == -2) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                ClientScript.anInt9496 = gregoriancalendar.get(11) * 600 + (gregoriancalendar.get(12) * 10
                                                                            + gregoriancalendar.get(13) / 6);
                ReferenceTable.aRandom283.setSeed((long) ClientScript.anInt9496);
            }
            Class218.aClass123_2566.method1510(-108);
            Class218.aClass123_2560.method1510(-74);
            method111(-24625);
            if (Class144_Sub1.aClass232_6802 != null) {
                Class144_Sub1.aClass232_6802.method2140(0);
            }
            Class319.method3671(8);
            Class194_Sub3_Sub1.method1982(0);
            Class175.aClass291_2100.method3452((byte) 45);
            Class106.aClass93_1356.method1038((byte) 26);
            if (Class93.aGraphicsToolkit1241 != null) {
                Class93.aGraphicsToolkit1241.e((int) Class313.method3650(false));
            }
            Class378.method4134((byte) 94);
            Class357.anInt4429 = 0;
            Class320_Sub8.anInt8281 = 0;
            for (Interface21 interface21 = Class175.aClass291_2100.method3449(-22959);
                 interface21 != null; interface21 = Class175.aClass291_2100.method3449(-22959)) {
                int i_53_ = interface21.method79(false);
                if ((i_53_ ^ 0xffffffff) == -3 || (i_53_ ^ 0xffffffff) == -4) {
                    int i_54_ = interface21.method77(-24069);
                    if (!Class350.method3993((byte) 108)
                        || (i_54_ ^ 0xffffffff) != -97 && i_54_ != 167 && i_54_ != 178) {
                        if ((Class357.anInt4429 ^ 0xffffffff) > -129) {
                            Class320_Sub7.anInterface21Array8275[Class357.anInt4429] = interface21;
                            Class357.anInt4429++;
                        }
                    } else if (!GLXToolkit.method1401(-6279)) {
                        Class244.method3065(1);
                    } else {
                        Class336_Sub2.method3893((byte) 116);
                    }
                } else if ((i_53_ ^ 0xffffffff) == -1 && (Class320_Sub8.anInt8281 ^ 0xffffffff) > -76) {
                    Class66_Sub2_Sub1.anInterface21Array10578[Class320_Sub8.anInt8281] = interface21;
                    Class320_Sub8.anInt8281++;
                }
            }
            Class339_Sub8.anInt8739 = 0;
            for (Node_Sub5 node_sub5 = Class106.aClass93_1356.method1048((byte) -55);
                 node_sub5 != null; node_sub5 = Class106.aClass93_1356.method1048((byte) -89)) {
                int i_55_ = node_sub5.method2267(true);
                if (i_55_ == -1) {
                    Node_Sub38_Sub35.aClass312_10452.method3625((byte) -54, node_sub5);
                } else if (i_55_ == 6) {
                    Class339_Sub8.anInt8739 += node_sub5.method2271((byte) -111);
                } else if (Node_Sub38_Sub11.method2828(i_55_, 0)) {
                    GraphicsToolkit.aClass312_1545.method3625((byte) -54, node_sub5);
                    if (GraphicsToolkit.aClass312_1545.method3615(-107) > 10) {
                        GraphicsToolkit.aClass312_1545.method3619(-90);
                    }
                }
            }
            if (GLXToolkit.method1401(-6279)) {
                Class262_Sub23.method3215(110);
            }
            if (!RuntimeException_Sub1.method4207(Class151.anInt1843, 19154)) {
                if (Class315.method3655(Class151.anInt1843, 128)) {
                    r_Sub2.method2376(29);
                }
            } else {
                Node_Sub38_Sub38.method2914(-15103);
                Node_Sub38_Sub10.method2824(0);
            }
            if (!Class26.method311(Class151.anInt1843, -5) || Class315.method3655(Class151.anInt1843, 128)) {
                if (Class329.method3833((byte) -61, Class151.anInt1843)
                    && !Class315.method3655(Class151.anInt1843, 128)) {
                    method110(0);
                    Class195.login((byte) 119);
                } else if ((Class151.anInt1843 ^ 0xffffffff) == -14) {
                    Class195.login((byte) 101);
                } else if (!Class58.method577(Class151.anInt1843, -22906)
                           || Class315.method3655(Class151.anInt1843, 128)) {
                    if ((Class151.anInt1843 ^ 0xffffffff) == -15 || Class151.anInt1843 == 15) {
                        Class195.login((byte) 93);
                        if (Class339_Sub2.anInt8653 != -3 && Class339_Sub2.anInt8653 != 2
                            && Class339_Sub2.anInt8653 != 15) {
                            if (Class151.anInt1843 != 15) {
                                Class127.method1542(11582, false);
                            } else {
                                Class270_Sub2_Sub1.anInt10548 = Class339_Sub2.anInt8653;
                                Node_Sub38_Sub34.anInt10447 = Class187.anInt2276;
                                Class339_Sub5.anInt8684 = GameStub.anInt45;
                                if (Class382.aBoolean5260) {
                                    Class188_Sub1_Sub2.method1899(Class247.aClass197_3115.id, (byte) 27,
                                            Class247.aClass197_3115.ipadress);
                                    Class218.aClass123_2566.aClass365_1557 = null;
                                    Class48.method478(14, (byte) 98);
                                } else {
                                    Class127.method1542(11582, Class248.aBoolean3146);
                                }
                            }
                        }
                    }
                } else {
                    Node_Sub38_Sub38.method2916(14590);
                }
            } else {
                method110(0);
                Class45.method465((byte) 13);
                Class195.login((byte) 104);
            }
            Class201.method2023(Class93.aGraphicsToolkit1241, -22880);
            if (i > 49) {
                GraphicsToolkit.aClass312_1545.method3619(-110);
            }
        }
    }

    final void method99(int i) {
        anInt5480++;
        if (Class252.aBoolean3188) {
            Class201.anInt2446 = 64;
        }
        Frame frame = new Frame(Settings.SERVER_NAME);
        frame.pack();
        frame.dispose();
        Npc.method880((byte) 11);
        Class320_Sub1.aClass141_8207 = new Class141(Class240.aSignLink2946);
        Class267.aClass266_3449 = new Class266();
        Node_Sub38_Sub8_Sub1.method2817(new int[]{20, 260}, (byte) 25, new int[]{1000, 100});
        if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
            Class93.aByteArrayArray1244 = new byte[50][];
        }
        Class213.aNode_Sub27_2512 = Node_Sub54.method2983(-17555);
        if (Node_Sub38_Sub1.aClass329_10086 == Class240.aClass329_2943) {
            Class320_Sub24.aClass197_8443.ipadress = this.getCodeBase().getHost();
        } else if (Node_Sub13.method2548(false, Node_Sub38_Sub1.aClass329_10086)) {
            Class320_Sub24.aClass197_8443.ipadress = this.getCodeBase().getHost();
            Class320_Sub24.aClass197_8443.firstPort = Settings.PORT_ID;//Class320_Sub24.aClass197_8443.npcId + 40000;
            Class320_Sub24.aClass197_8443.secondPort = Class320_Sub24.aClass197_8443.id + 50000;
            Node_Sub15_Sub13.aClass197_9871.firstPort = Node_Sub15_Sub13.aClass197_9871.id + 40000;
            Node_Sub15_Sub13.aClass197_9871.secondPort = 50000 + Node_Sub15_Sub13.aClass197_9871.id;
        } else if (CacheNode_Sub2.aClass329_9436 == Node_Sub38_Sub1.aClass329_10086) {
            Class320_Sub24.aClass197_8443.ipadress = "176.24.157.94";
            Class320_Sub24.aClass197_8443.firstPort = Settings.PORT_ID;//40000 - -Class320_Sub24.aClass197_8443.npcId;
            Node_Sub15_Sub13.aClass197_9871.ipadress = "176.24.157.94";
            Class320_Sub24.aClass197_8443.secondPort = Class320_Sub24.aClass197_8443.id + 50000;
            Node_Sub15_Sub13.aClass197_9871.firstPort = Settings.PORT_ID;//Node_Sub15_Sub13.aClass197_9871.npcId +
            // 40000;
            Node_Sub15_Sub13.aClass197_9871.secondPort = 50000 + Node_Sub15_Sub13.aClass197_9871.id;
        }
        Class181.aClass197_2155 = Class320_Sub24.aClass197_8443;
        Class343.aShortArray4255 = EntityNode_Sub3_Sub1.aShortArray9165 = Class262_Sub19.aShortArray7852 =
                Class129.aShortArray1665 = new short[256];
        if (Class209.aClass353_2483 == Node_Sub38_Sub34.aClass353_10443) {
            Node_Sub25_Sub1.aBoolean9952 = false;
        }
        try {
            Class102.aClipboard1315 = Class158.aClient1983.getToolkit().getSystemClipboard();
        } catch (Exception exception) {
			/* empty */
        }
        Class175.aClass291_2100 = Class361.method4047(2, Node_Sub38_Sub20.aCanvas10309);
        Class106.aClass93_1356 = Class328_Sub1.method3830(Node_Sub38_Sub20.aCanvas10309, -19397, true);
        try {
            if (Class240.aSignLink2946.aFileOnDisk3979 != null) {
                Class99.aSeekableFile1289 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3979, 5200, 0);
                for (int i_56_ = 0; i_56_ < Class150_Sub1.aSeekableFileArray8953.length; i_56_++)
                    Class150_Sub1.aSeekableFileArray8953[i_56_] = new SeekableFile
                            (Class240.aSignLink2946.aFileOnDiskArray4003[i_56_], 6000, 0);
                Class3.aSeekableFile5156 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3992, 6000, 0);
                Class194_Sub2.aClass6_6899 = new MainFile(255, Class99.aSeekableFile1289, Class3.aSeekableFile5156,
                        500000);
                Class366.aSeekableFile4529 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3994, 24, 0);
                Class240.aSignLink2946.aFileOnDisk3992 = null;
                Class240.aSignLink2946.aFileOnDiskArray4003 = null;
                Class240.aSignLink2946.aFileOnDisk3979 = null;
                Class240.aSignLink2946.aFileOnDisk3994 = null;
            }
        } catch (java.io.IOException ioexception) {
            Class3.aSeekableFile5156 = null;
            Class194_Sub2.aClass6_6899 = null;
            Class366.aSeekableFile4529 = null;
            Class99.aSeekableFile1289 = null;
        }
        if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
            Node_Sub15_Sub2.aBoolean9780 = true;
        }
        EntityNode_Sub6.aString5991 = Class22.loading_translation.method297(Class35.language);
    }

    static final void method121(IComponentDefinitions[] widgets, int i, int i_58_, int i_59_, int i_60_, int i_61_,
                                int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
        for (int i_68_ = 0; i_68_ < widgets.length; i_68_++) {
            IComponentDefinitions widget = widgets[i_68_];
            if (widget != null && widget.parentId == i) {
                int i_69_ = widget.anInt4679 + i_62_;
                int i_70_ = widget.anInt4762 + i_63_;
                int i_71_;
                int i_72_;
                int i_73_;
                int i_74_;
                if (widget.type == 2) {
                    i_71_ = i_58_;
                    i_72_ = i_59_;
                    i_73_ = i_60_;
                    i_74_ = i_61_;
                } else {
                    int i_75_ = i_69_ + widget.anInt4809;
                    int i_76_ = i_70_ + widget.anInt4695;
                    if (widget.type == 9) {
                        i_75_++;
                        i_76_++;
                    }
                    i_71_ = i_69_ > i_58_ ? i_69_ : i_58_;
                    i_72_ = i_70_ > i_59_ ? i_70_ : i_59_;
                    i_73_ = i_75_ < i_60_ ? i_75_ : i_60_;
                    i_74_ = i_76_ < i_61_ ? i_76_ : i_61_;
                }
                if (widget.type != 0 && !widget.hasScripts && method113(widget).settingsHash == 0
                    && widget != Class186.aWidget2257 && widget.anInt4814 != Class264.anInt3355
                    && widget.anInt4814 != Class332.anInt4144 && widget.anInt4814 != Class200_Sub1.anInt5146
                    && widget.anInt4814 != Class107.anInt1366) {
                    if (i_71_ < i_73_ && i_72_ < i_74_) {
                        Class286.method3395(1, widget);
                    }
                } else if (!method112(widget)) {
                    int i_77_ = 0;
                    int i_78_ = 0;
                    if (Class71.aBoolean967) {
                        i_77_ = Class67.method733(-81);
                        i_78_ = Class226.method2112(256);
                    }
                    if (widget == Class58.aWidget861 && Class308.method3585(Class58.aWidget861, false) != null) {
                        Class372.aBoolean4599 = true;
                        Node_Sub25_Sub4.anInt10005 = i_69_;
                        Class60.anInt880 = i_70_;
                    }
                    if (widget.aBoolean4802 || i_71_ < i_73_ && i_72_ < i_74_) {
                        if (widget.aBoolean4858 && i_66_ >= i_71_ && i_67_ >= i_72_ && i_66_ < i_73_ && i_67_ < i_74_) {
                            for (Node_Sub37 node_sub37 = (Node_Sub37) Class275.aClass312_5419.method3613(65280);
                                 node_sub37
                                 != null; node_sub37 = (Node_Sub37) Class275.aClass312_5419.method3620(16776960)) {
                                if (node_sub37.aBoolean7433) {
                                    node_sub37.method2160((byte) 50);
                                    node_sub37.aWidget7437.aBoolean4819 = false;
                                }
                            }
                            if (RuntimeException_Sub1.anInt4916 == 0) {
                                Class58.aWidget861 = null;
                                Class186.aWidget2257 = null;
                            }
                            Class290_Sub6.anInt8116 = 0;
                            Class336_Sub1.aBoolean8543 = false;
                            FileOnDisk.aBoolean1319 = false;
                            if (!Class213.aBoolean2510) {
                                Node_Sub7.method2421((byte) 98);
                            }
                        }
                        boolean bool =
                                widget.aBoolean4782 && widget.type == 5 && widget.anInt4757 == 0 && widget.anInt4848 < 0
                                && widget.anInt4718 == -1 && widget.anInt4694 == -1 && !widget.aBoolean4861
                                && widget.anInt4728 == 0;
                        boolean bool_79_ = false;
                        if (Class106.aClass93_1356.method1050((byte) -21) + i_77_ >= i_71_
                            && Class106.aClass93_1356.method1051(true) + i_78_ >= i_72_
                            && Class106.aClass93_1356.method1050((byte) -27) + i_77_ < i_73_
                            && Class106.aClass93_1356.method1051(true) + i_78_ < i_74_) {
                            if (bool) {
                                Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241, 1);
                                if (class127 == null || class127.anInt1636 != widget.anInt4809
                                    || class127.anInt1637 != widget.anInt4695) {
                                    bool_79_ = true;
                                } else {
                                    int i_80_ = Class106.aClass93_1356.method1050((byte) -98) + i_77_ - i_69_;
                                    int i_81_ = Class106.aClass93_1356.method1051(true) + i_78_ - i_70_;
                                    if (i_81_ >= 0 && i_81_ < class127.anIntArray1641.length) {
                                        int i_82_ = class127.anIntArray1641[i_81_];
                                        if (i_80_ >= i_82_ && i_80_ <= i_82_ + class127.anIntArray1635[i_81_]) {
                                            bool_79_ = true;
                                        }
                                    }
                                }
                            } else {
                                bool_79_ = true;
                            }
                        }
                        if (!Class87.removeWalkHere && bool_79_) {
                            if (widget.anInt4761 >= 0) {
                                Class239.anInt2928 = widget.anInt4761;
                            } else if (widget.aBoolean4858) {
                                Class239.anInt2928 = -1;
                            }
                        }
                        if (!Class213.aBoolean2510 && bool_79_) {
                            Class225.method2107(-6608, widget, i_66_ - i_69_, i_66_ - i_70_);
                        }
                        boolean bool_83_ = false;
                        if (Class106.aClass93_1356.method1039(-85) && bool_79_) {
                            bool_83_ = true;
                        }
                        boolean bool_84_ = false;
                        Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613(65280);
                        if (node_sub5 != null && node_sub5.method2267(true) == 0 && node_sub5.method2270(2) >= i_71_
                            && node_sub5.method2272(5) >= i_72_ && node_sub5.method2270(2) < i_73_
                            && node_sub5.method2272(5) < i_74_) {
                            if (bool) {
                                Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241, 1);
                                if (class127 == null || class127.anInt1636 != widget.anInt4809
                                    || class127.anInt1637 != widget.anInt4695) {
                                    bool_84_ = true;
                                } else {
                                    int i_85_ = node_sub5.method2270(2) - i_69_;
                                    int i_86_ = node_sub5.method2272(5) - i_70_;
                                    if (i_86_ >= 0 && i_86_ < class127.anIntArray1641.length) {
                                        int i_87_ = class127.anIntArray1641[i_86_];
                                        if (i_85_ >= i_87_ && i_85_ <= i_87_ + class127.anIntArray1635[i_86_]) {
                                            bool_84_ = true;
                                        }
                                    }
                                }
                            } else {
                                bool_84_ = true;
                            }
                        }
                        if (widget.aByteArray4806 != null && !GLXToolkit.method1401(-6279)) {
                            for (int i_88_ = 0; i_88_ < widget.aByteArray4806.length; i_88_++) {
                                if (!Class175.aClass291_2100.method3450(84, widget.aByteArray4806[i_88_])) {
                                    if (widget.anIntArray4772 != null) {
                                        widget.anIntArray4772[i_88_] = 0;
                                    }
                                } else if (widget.anIntArray4772 == null
                                           || Class174.clientCycle >= widget.anIntArray4772[i_88_]) {
                                    byte b = widget.aByteArray4733[i_88_];
                                    if (b == 0 || ((b & 0x8) == 0 || !Class175.aClass291_2100.method3450(110, 86)
                                                                     && !Class175.aClass291_2100.method3450(-51, 82)
                                                                     && !Class175.aClass291_2100.method3450(-72, 81))
                                                  && ((b & 0x2) == 0 || Class175.aClass291_2100.method3450(-43, 86))
                                                  && ((b & 0x1) == 0 || Class175.aClass291_2100.method3450(-79, 82))
                                                  && ((b & 0x4) == 0 || Class175.aClass291_2100.method3450(121, 81))) {
                                        if (i_88_ < 10) {
                                            r_Sub1.method2364(-73, widget.ihash, -1, "", i_88_ + 1);
                                        } else if (i_88_ == 10) {
                                            Node_Sub38_Sub23.method2863(-19316);
                                            InterfaceSettings node_sub35 = method113(widget);
                                            Node_Sub38_Sub18.method2846(node_sub35.method2743(-25), (byte) -108,
                                                    widget, node_sub35.anInt7413);
                                            Class84.aString1148 = Class205.method2033(widget, (byte) -104);
                                            if (Class84.aString1148 == null) {
                                                Class84.aString1148 = "Null";
                                            }
                                            Class66.aString5177 = widget.aString4779 + "<col=ffffff>";
                                        }
                                        int i_89_ = widget.anIntArray4705[i_88_];
                                        if (widget.anIntArray4772 == null) {
                                            widget.anIntArray4772 = new int[widget.aByteArray4806.length];
                                        }
                                        if (i_89_ != 0) {
                                            widget.anIntArray4772[i_88_] = Class174.clientCycle + i_89_;
                                        } else {
                                            widget.anIntArray4772[i_88_] = 2147483647;
                                        }
                                    }
                                }
                            }
                        }
                        if (bool_84_) {
                            Class317.method3665(
                                    i_78_ + node_sub5.method2272(5) - i_70_, widget, true,
                                    i_77_ + node_sub5.method2270(2) - i_69_);
                        }
                        if (Class58.aWidget861 != null && Class58.aWidget861 != widget && bool_79_
                            && method113(widget).method2747(1)) {
                            Node_Sub38_Sub14.aWidget10244 = widget;
                        }
                        if (widget == Class186.aWidget2257) {
                            Class180.aBoolean2135 = true;
                            Class62.anInt905 = i_69_;
                            Class339_Sub2.anInt8650 = i_70_;
                        }
                        if (widget.hasScripts || widget.anInt4814 != 0) {
                            if (bool_79_ && Class339_Sub8.anInt8739 != 0 && widget.anObjectArray4753 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7430 = Class339_Sub8.anInt8739;
                                node_sub37.parameters = widget.anObjectArray4753;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Class58.aWidget861 != null) {
                                bool_84_ = false;
                                bool_83_ = false;
                            } else if (Class213.aBoolean2510 || widget.anInt4814 != Node_Sub38_Sub4.anInt10118
                                                                && Class290_Sub6.anInt8116 > 0) {
                                bool_84_ = false;
                                bool_83_ = false;
                                bool_79_ = false;
                            }
                            if (widget.anInt4814 != 0) {
                                if (widget.anInt4814 == Class200_Sub1.anInt5146
                                    || widget.anInt4814 == Class107.anInt1366) {
                                    Class324.aWidget4085 = widget;
                                    if (Class245.aClass119_3085 != null) {
                                        Class245.aClass119_3085.method1225
                                                (Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(false), 51,
                                                        widget.anInt4695, Class93.aGraphicsToolkit1241);
                                    }
                                    if (widget.anInt4814 == Class200_Sub1.anInt5146) {
                                        if (!Class213.aBoolean2510 && i_66_ >= i_71_ && i_67_ >= i_72_ && i_66_ < i_73_
                                            && i_67_ < i_74_) {
                                            Class78.method776(i_65_, 0, i_64_, Class93.aGraphicsToolkit1241);
                                            for (EntityNode_Sub1 entitynode_sub1 = (EntityNode_Sub1)
                                                    Class82.aClass103_1120.method1113((byte) 112);
                                                 entitynode_sub1
                                                 != null; entitynode_sub1 = (EntityNode_Sub1)
                                                    Class82.aClass103_1120.method1108(94)) {
                                                if (i_66_ >= entitynode_sub1.anInt5922
                                                    && i_66_ < entitynode_sub1.anInt5923
                                                    && i_67_ >= entitynode_sub1.anInt5928
                                                    && i_67_ < entitynode_sub1.anInt5926) {
                                                    Node_Sub7.method2421((byte) 98);
                                                    Class251.method3097(entitynode_sub1.anActor5925, -102);
                                                }
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (widget.anInt4814 == Class264.anInt3355) {
                                    Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241, 1);
                                    if (class127 != null && (Class262_Sub20.anInt7861 == 0
                                                             || Class262_Sub20.anInt7861 == 3) && !Class213.aBoolean2510
                                        && i_66_ >= i_71_ && i_67_ >= i_72_ && i_66_ < i_73_ && i_67_ < i_74_) {
                                        int i_90_ = i_66_ - i_69_;
                                        int i_91_ = i_67_ - i_70_;
                                        int i_92_ = class127.anIntArray1641[i_91_];
                                        if (i_90_ >= i_92_ && i_90_ <= i_92_ + class127.anIntArray1635[i_91_]) {
                                            i_90_ -= widget.anInt4809 / 2;
                                            i_91_ -= widget.anInt4695 / 2;
                                            int i_93_;
                                            if (Class320_Sub22.anInt8415 == 4) {
                                                i_93_ = (int) Node_Sub12.aFloat5450 & 0x3fff;
                                            } else {
                                                i_93_ = (int) Node_Sub12.aFloat5450 + Mobile_Sub1.anInt10960 & 0x3fff;
                                            }
                                            int i_94_ = Class335.anIntArray4167[i_93_];
                                            int i_95_ = Class335.anIntArray4165[i_93_];
                                            if (Class320_Sub22.anInt8415 != 4) {
                                                i_94_ = i_94_ * (Node_Sub15_Sub13.anInt9870 + 256) >> 8;
                                                i_95_ = i_95_ * (Node_Sub15_Sub13.anInt9870 + 256) >> 8;
                                            }
                                            int i_96_ = i_91_ * i_94_ + i_90_ * i_95_ >> 14;
                                            int i_97_ = i_91_ * i_95_ - i_90_ * i_94_ >> 14;
                                            int i_98_;
                                            int i_99_;
                                            if (Class320_Sub22.anInt8415 == 4) {
                                                i_98_ = (Class234.anInt2792 >> 9) + (i_96_ >> 2);
                                                i_99_ = (Node_Sub19.anInt7173 >> 9) - (i_97_ >> 2);
                                            } else {
                                                int i_100_ = (Class295.myPlayer.getSize((byte) 83) - 1) * 256;
                                                i_98_ = (Class295.myPlayer.anInt5934 - i_100_ >> 9) + (i_96_ >> 2);
                                                i_99_ = (Class295.myPlayer.anInt5940 - i_100_ >> 9) - (i_97_ >> 2);
                                            }
                                            if (Class87.removeWalkHere && (Class200_Sub2.anInt4943 & 0x40) != 0) {
                                                IComponentDefinitions widget_101_ = Node_Sub3.method2169(-101,
                                                        Class46.anInt681, Node_Sub15_Sub9.anInt9839);
                                                if (widget_101_ != null) {
                                                    Node_Sub32.method2731(false, widget.anInt4718, 1L, i_98_, i_99_,
                                                            Class84.aString1148, 21, true, Class201.anInt2444, " ->",
                                                            (long) (
                                                            widget.anInt4687 << 0 | widget.ihash), (byte) -18, true);
                                                } else {
                                                    Node_Sub38_Sub23.method2863(-19316);
                                                }
                                            } else {
                                                if (Class209.aClass353_2483 == Class169_Sub4.aClass353_8825) {
                                                    Node_Sub32.method2731(false, -1, 1L, i_98_, i_99_,
                                                            Class22.aClass22_390.method297(Class35.language), 11,
                                                            true, -1, "", 0L, (byte) -18, true);
                                                }
                                                Node_Sub32.method2731(false, -1, 1L, i_98_, i_99_,
                                                        Class173.aString2085, 58, true, Class173.anInt2086, "", 0L,
                                                        (byte) -18, true);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (widget.anInt4814 == Node_Sub38_Sub4.anInt10118) {
                                    Class66_Sub1.aWidget8983 = widget;
                                    if (bool_79_) {
                                        Class336_Sub1.aBoolean8543 = true;
                                    }
                                    if (bool_84_) {
                                        int i_102_ = (int) ((double) (i_77_ + node_sub5.method2270(2) - i_69_
                                                                      - widget.anInt4809 / 2) * 2.0
                                                            / (double) Class20.aFloat327);
                                        int i_103_ = (int) -((double) (i_78_ + node_sub5.method2272(5) - i_70_
                                                                       - widget.anInt4695 / 2) * 2.0
                                                             / (double) Class20.aFloat327);
                                        int i_104_ = Class94.anInt1250 + i_102_ + Class20.anInt354;
                                        int i_105_ = Class327.anInt5360 + i_103_ + Class20.anInt343;
                                        CacheNode_Sub11 cachenode_sub11 = Class105.method1117(117);
                                        if (cachenode_sub11 != null) {
                                            int[] is = new int[3];
                                            cachenode_sub11.method2340(i_105_, (byte) 17, i_104_, is);
                                            if (is != null) {
                                                if (Class175.aClass291_2100.method3450(118, 82)
                                                    && Class339_Sub7.rights > 0) {
                                                    Class331.method3843(false, is[0], is[2], is[1]);
                                                    continue;
                                                }
                                                FileOnDisk.aBoolean1319 = true;
                                                CacheNode_Sub16_Sub2.anInt11087 = is[0];
                                                Class269.anInt3473 = is[1];
                                                Class326.anInt4098 = is[2];
                                            }
                                            Class290_Sub6.anInt8116 = 1;
                                            aa.aBoolean104 = false;
                                            Node_Sub5_Sub2.anInt9412 = Class106.aClass93_1356.method1050((byte) -95);
                                            Class83.anInt5179 = Class106.aClass93_1356.method1051(true);
                                        }
                                    } else if (bool_83_ && Class290_Sub6.anInt8116 > 0) {
                                        if (Class290_Sub6.anInt8116 == 1 && (Node_Sub5_Sub2.anInt9412
                                                                             != Class106.aClass93_1356.method1050(
                                                                                     (byte) -56)
                                                                             || Class83.anInt5179
                                                                                != Class106.aClass93_1356.method1051
                                                (true))) {
                                            Class188_Sub2.anInt6869 = Class94.anInt1250;
                                            Class134_Sub2.anInt9021 = Class327.anInt5360;
                                            Class290_Sub6.anInt8116 = 2;
                                        }
                                        if (Class290_Sub6.anInt8116 == 2) {
                                            aa.aBoolean104 = true;
                                            Node_Sub51.method2968(Class188_Sub2.anInt6869 + (int) (
                                                    (double) (Node_Sub5_Sub2.anInt9412
                                                              - Class106.aClass93_1356.method1050((byte) -120)) * 2.0
                                                    / (double) Class20.aFloat329), -1);
                                            Class103.method1109(false, Class134_Sub2.anInt9021 - (int) (
                                                    (double) (Class83.anInt5179
                                                              - Class106.aClass93_1356.method1051(true)) * 2.0
                                                    / (double) Class20.aFloat329));
                                        }
                                    } else {
                                        if (Class290_Sub6.anInt8116 > 0 && !aa.aBoolean104) {
                                            if ((Class121.anInt1521 == 1 || Node_Sub16.method2594(true))
                                                && Class315.anInt4035 > 2) {
                                                Class244.method3064((byte) -73, Node_Sub5_Sub2.anInt9412,
                                                        Class83.anInt5179);
                                            } else if (Class46.method469(255)) {
                                                Class244.method3064((byte) -105, Node_Sub5_Sub2.anInt9412,
                                                        Class83.anInt5179);
                                            }
                                        }
                                        Class290_Sub6.anInt8116 = 0;
                                    }
                                    continue;
                                }
                                if (widget.anInt4814 == Class77.anInt1017) {
                                    if (bool_83_) {
                                        Class113.method1151(widget.anInt4809,
                                                i_77_ + Class106.aClass93_1356.method1050((byte) -39) - i_69_,
                                                i_78_ + Class106.aClass93_1356.method1051(true)
                                                - i_70_, (byte) -124, widget.anInt4695);
                                    }
                                    continue;
                                }
                                if (widget.anInt4814 == Class332.anInt4144) {
                                    CacheNode_Sub4.method2305(i_69_, true, i_70_, widget);
                                    continue;
                                }
                            }
                            if (!widget.aBoolean4730 && bool_84_) {
                                widget.aBoolean4730 = true;
                                if (widget.anObjectArray4774 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 = i_77_ + node_sub5.method2270(2) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + node_sub5.method2272(5) - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4774;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                }
                            }
                            if (widget.aBoolean4730 && bool_83_ && widget.anObjectArray4803 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -99) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                node_sub37.parameters = widget.anObjectArray4803;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (widget.aBoolean4730 && !bool_83_) {
                                widget.aBoolean4730 = false;
                                if (widget.anObjectArray4680 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -21) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4680;
                                    Node_Sub5.aClass312_7028.method3625((byte) -54, node_sub37);
                                }
                            }
                            if (bool_83_ && widget.anObjectArray4856 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -53) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                node_sub37.parameters = widget.anObjectArray4856;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (!widget.aBoolean4819 && bool_79_) {
                                widget.aBoolean4819 = true;
                                if (widget.anObjectArray4706 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -66) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4706;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                }
                            }
                            if (widget.aBoolean4819 && bool_79_ && widget.anObjectArray4834 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -33) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                node_sub37.parameters = widget.anObjectArray4834;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (widget.aBoolean4819 && !bool_79_) {
                                widget.aBoolean4819 = false;
                                if (widget.anObjectArray4818 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -119) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051(true) - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4818;
                                    Node_Sub5.aClass312_7028.method3625((byte) -54, node_sub37);
                                }
                            }
                            if (widget.anObjectArray4701 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4701;
                                CacheNode_Sub14_Sub2.aClass312_11039.method3625((byte) -54, node_sub37);
                            }
                            if (widget.anObjectArray4688 != null && Class36.anInt548 > widget.anInt4813) {
                                if (widget.anIntArray4829 == null || Class36.anInt548 - widget.anInt4813 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4688;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_16_:
                                    for (int i_106_ = widget.anInt4813; i_106_ < Class36.anInt548; i_106_++) {
                                        int i_107_ = Node_Sub38_Sub11.anIntArray10217[i_106_ & 0x1f];
                                        for (int i_108_ = 0; i_108_ < widget.anIntArray4829.length; i_108_++) {
                                            if (widget.anIntArray4829[i_108_] == i_107_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4688;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_16_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4813 = Class36.anInt548;
                            }
                            if (widget.anObjectArray4775 != null && Class244.anInt3083 > widget.anInt4801) {
                                if (widget.anIntArray4805 == null || Class244.anInt3083 - widget.anInt4801 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4775;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_17_:
                                    for (int i_109_ = widget.anInt4801; i_109_ < Class244.anInt3083; i_109_++) {
                                        int i_110_ = CacheNode_Sub10.anIntArray9520[i_109_ & 0x1f];
                                        for (int i_111_ = 0; i_111_ < widget.anIntArray4805.length; i_111_++) {
                                            if (widget.anIntArray4805[i_111_] == i_110_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4775;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_17_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4801 = Class244.anInt3083;
                            }
                            if (widget.anObjectArray4807 != null && Class341.anInt4231 > widget.anInt4719) {
                                if (widget.anIntArray4838 == null || Class341.anInt4231 - widget.anInt4719 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4807;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_18_:
                                    for (int i_112_ = widget.anInt4719; i_112_ < Class341.anInt4231; i_112_++) {
                                        int i_113_ = Class75.anIntArray1005[i_112_ & 0x1f];
                                        for (int i_114_ = 0; i_114_ < widget.anIntArray4838.length; i_114_++) {
                                            if (widget.anIntArray4838[i_114_] == i_113_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4807;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_18_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4719 = Class341.anInt4231;
                            }
                            if (widget.anObjectArray4742 != null && Mobile_Sub3.anInt10784 > widget.anInt4747) {
                                if (widget.anIntArray4833 == null || Mobile_Sub3.anInt10784 - widget.anInt4747 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4742;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_19_:
                                    for (int i_115_ = widget.anInt4747; i_115_ < Mobile_Sub3.anInt10784; i_115_++) {
                                        int i_116_ = Class169.anIntArray4965[i_115_ & 0x1f];
                                        for (int i_117_ = 0; i_117_ < widget.anIntArray4833.length; i_117_++) {
                                            if (widget.anIntArray4833[i_117_] == i_116_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4742;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_19_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4747 = Mobile_Sub3.anInt10784;
                            }
                            if (widget.anObjectArray4788 != null && Class197.anInt2423 > widget.anInt4810) {
                                if (widget.anIntArray4789 == null || Class197.anInt2423 - widget.anInt4810 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4788;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_20_:
                                    for (int i_118_ = widget.anInt4810; i_118_ < Class197.anInt2423; i_118_++) {
                                        int i_119_ = Class262_Sub15.anIntArray7821[i_118_ & 0x1f];
                                        for (int i_120_ = 0; i_120_ < widget.anIntArray4789.length; i_120_++) {
                                            if (widget.anIntArray4789[i_120_] == i_119_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4788;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_20_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4810 = Class197.anInt2423;
                            }
                            if (widget.anObjectArray4857 != null && Class377.anInt4664 > widget.anInt4780) {
                                if (widget.anIntArray4812 == null || Class377.anInt4664 - widget.anInt4780 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4857;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                } else {
                                    while_21_:
                                    for (int i_121_ = widget.anInt4780; i_121_ < Class377.anInt4664; i_121_++) {
                                        int i_122_ = Class143.anIntArray1764[i_121_ & 0x1f];
                                        for (int i_123_ = 0; i_123_ < widget.anIntArray4812.length; i_123_++) {
                                            if (widget.anIntArray4812[i_123_] == i_122_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4857;
                                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                                break while_21_;
                                            }
                                        }
                                    }
                                }
                                widget.anInt4780 = Class377.anInt4664;
                            }
                            if (Class381.anInt4894 > widget.anInt4783 && widget.anObjectArray4740 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4740;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Class181.anInt2150 > widget.anInt4783 && widget.anObjectArray4846 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4846;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Node_Sub36_Sub2.anInt10046 > widget.anInt4783 && widget.anObjectArray4828 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4828;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Class213.anInt2511 > widget.anInt4783 && widget.anObjectArray4799 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4799;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Class230_Sub1.anInt9012 > widget.anInt4783 && widget.anObjectArray4756 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4756;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Class278.anInt3546 > widget.anInt4783 && widget.anObjectArray4745 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4745;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            if (Node_Sub23_Sub1.anInt9926 > widget.anInt4783 && widget.anObjectArray4862 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4862;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                            widget.anInt4783 = Class345.anInt4270;
                            if (widget.anObjectArray4798 != null) {
                                for (int i_124_ = 0; i_124_ < Class357.anInt4429; i_124_++) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7435 = Class320_Sub7.anInterface21Array8275[i_124_].method75
                                            (-29764);
                                    node_sub37.anInt7444 = Class320_Sub7.anInterface21Array8275[i_124_].method77
                                            (-24069);
                                    node_sub37.parameters = widget.anObjectArray4798;
                                    Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                                }
                            }
                            if (Class146.aBoolean1816 && widget.anObjectArray4854 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4854;
                                Class275.aClass312_5419.method3625((byte) -54, node_sub37);
                            }
                        }
                        if (widget.type == 5 && widget.anInt4848 != -1) {
                            widget.method4157(-49253408, CacheNode_Sub6.aClass57_9480, Class171.aClass278_2062)
                                    .method1225(Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(false), 83,
                                            widget.anInt4695, Class93.aGraphicsToolkit1241);
                        }
                        Class286.method3395(1, widget);
                        if (widget.type == 0) {
                            method121(widgets, widget.ihash, i_71_, i_72_, i_73_, i_74_,
                                    i_69_ - widget.anInt4817, i_70_ - widget.anInt4734, i_64_, i_65_, i_66_, i_67_);
                            if (widget.aWidgetArray4793 != null) {
                                method121(widget.aWidgetArray4793, widget.ihash, i_71_, i_72_, i_73_, i_74_,
                                        i_69_ - widget.anInt4817, i_70_ - widget.anInt4734, i_64_, i_65_, i_66_, i_67_);
                            }
                            Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) widget
                                    .ihash);
                            if (node_sub2 != null) {
                                if (Class209.aClass353_2483 == Node_Sub38_Sub34.aClass353_10443 && node_sub2.cliped == 0
                                    && !Class213.aBoolean2510 && bool_79_ && !Class54.aBoolean817) {
                                    Node_Sub7.method2421((byte) 98);
                                }
                                BufferedConnection.method422(i_74_, i_70_, -1, i_72_, i_65_, i_67_, i_73_, i_69_,
                                        node_sub2.interfaceId, i_64_, i_66_, i_71_);
                            }
                        }
                    }
                }
            }
        }
    }

    static final void method122(int i) {
        int i_125_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        int i_126_;
        if (aa.anInt101 == 3) {
            i_126_ = Class121.aClass206Array1529.length;
        } else {
            i_126_ = i_125_ + Node_Sub25_Sub3.localNPCsCount;
        }
        for (int i_127_ = 0; i_127_ < i_126_; i_127_++) {
            Actor actor;
            if (aa.anInt101 == 3) {
                Class206 class206 = Class121.aClass206Array1529[i_127_];
                if (!class206.aBoolean2472) {
                    continue;
                }
                actor = class206.method2037(-58);
            } else {
                if (i_127_ < i_125_) {
                    actor = Class270_Sub2.LOCAL_PLAYERS[is[i_127_]];
                } else {
                    actor = ((Node_Sub41) Class12.aHashTable187.method1518(3512, (long) Class54.LocalNPCsIndexes[i_127_
                                                                                                                 -
                                                                                                                 i_125_])).aNpc7518;
                }
                if (actor.plane != i || actor.anInt10857 < 0) {
                    continue;
                }
            }
            int i_128_ = actor.getSize((byte) 102);
            if ((i_128_ & 0x1) == 0) {
                if ((actor.anInt5934 & 0x1ff) != 0 || (actor.anInt5940 & 0x1ff) != 0) {
                    continue;
                }
            } else if ((actor.anInt5934 & 0x1ff) != 256 || (actor.anInt5940 & 0x1ff) != 256) {
                continue;
            }
            if (i_128_ == 1) {
                int i_129_ = actor.anInt5934 >> 9;
                int i_130_ = actor.anInt5940 >> 9;
                if (actor.anInt10857 > Node_Sub38_Sub16.anIntArrayArray10269[i_129_][i_130_]) {
                    Node_Sub38_Sub16.anIntArrayArray10269[i_129_][i_130_] = actor.anInt10857;
                    Class79.anIntArrayArray1070[i_129_][i_130_] = 1;
                } else if (actor.anInt10857 == Node_Sub38_Sub16.anIntArrayArray10269[i_129_][i_130_]) {
                    Class79.anIntArrayArray1070[i_129_][i_130_]++;
                }
            } else {
                int i_131_ = (i_128_ - 1) * 256 + 60;
                int i_132_ = actor.anInt5934 - i_131_ >> 9;
                int i_133_ = actor.anInt5940 - i_131_ >> 9;
                int i_134_ = actor.anInt5934 + i_131_ >> 9;
                int i_135_ = actor.anInt5940 + i_131_ >> 9;
                for (int i_136_ = i_132_; i_136_ <= i_134_; i_136_++) {
                    for (int i_137_ = i_133_; i_137_ <= i_135_; i_137_++) {
                        if (actor.anInt10857 > Node_Sub38_Sub16.anIntArrayArray10269[i_136_][i_137_]) {
                            Node_Sub38_Sub16.anIntArrayArray10269[i_136_][i_137_] = actor.anInt10857;
                            Class79.anIntArrayArray1070[i_136_][i_137_] = 1;
                        } else if (actor.anInt10857 == Node_Sub38_Sub16.anIntArrayArray10269[i_136_][i_137_]) {
                            Class79.anIntArrayArray1070[i_136_][i_137_]++;
                        }
                    }
                }
            }
        }
    }

    final String method100(int i) {
        anInt5477++;
        String string = null;
        try {
            string = "[1)" + Node_Sub53.gameSceneBaseX + "," + Class320_Sub4.gameSceneBaseY + ","
                     + Node_Sub54.GAME_SCENE_WDITH + "," + Class377_Sub1.GAME_SCENE_HEIGHT + "|";
            if (Class295.myPlayer != null) {
                string += "2)" + CacheNode_Sub20_Sub1.myPlayerPlane + "," + (Class295.myPlayer.scenePositionXQueue[0]
                                                                             + Node_Sub53.gameSceneBaseX) + "," + (
                                  Class320_Sub4.gameSceneBaseY + Class295.myPlayer.scenePositionYQueue[0]) + "|";
            }
            string += "3)" + Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) + "|4)"
                      + Class213.aNode_Sub27_2512.aClass320_Sub13_7284.method3734(false) + "|5)"
                      + Class188_Sub2_Sub1.getDisplayMode(3) + "|6)" + Class360.screenWidth + ","
                      + Class205.screenHeight + "|";
            string += "7)" + Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773(false) + "|";
            string += "8)" + Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) + "|";
            string += "9)" + Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3779(false) + "|";
            string += "10)" + Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false) + "|";
            string += "11)" + Class213.aNode_Sub27_2512.aClass320_Sub20_7306.method3758(false) + "|";
            string += "12)" + Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) + "|";
            string += "13)" + Class201.anInt2446 + "|";
            string += "14)" + Class151.anInt1843;
            if (Node_Sub23.aNode_Sub39_7201 != null) {
                string += "|15)" + Node_Sub23.aNode_Sub39_7201.anInt7484;
            }
            try {
                if ((Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) == -3) {
                    Class<?> var_class = Class.forName("java.lang.ClassLoader");
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class<?> var_class_138_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_138_.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    method.invoke(field, Boolean.TRUE);
                    Vector<?> vector = (Vector<?>) field.get((
                            aClass5486 == null ? aClass5486 = method123("Client") : aClass5486).getClassLoader());
                    for (int i_139_ = 0; (i_139_ ^ 0xffffffff) > (vector.size() ^ 0xffffffff); i_139_++) {
                        try {
                            Object object = vector.elementAt(i_139_);
                            Field field_140_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_140_, Boolean.TRUE);
                            try {
                                String string_141_ = (String) field_140_.get(object);
                                if (string_141_ != null && string_141_.indexOf("sw3d.dll") != -1) {
                                    Field field_142_ = object.getClass().getDeclaredField("handle");
                                    method.invoke(field_142_, Boolean.TRUE);
                                    string += "|16)" + Long.toHexString(field_142_.getLong(object));
                                    method.invoke(field_142_, Boolean.FALSE);
                                }
                            } catch (Throwable throwable) {
								/* empty */
                            }
                            method.invoke(field_140_, Boolean.FALSE);
                        } catch (Throwable throwable) {
							/* empty */
                        }
                    }
                }
            } catch (Throwable throwable) {
				/* empty */
            }
            string += "]";
        } catch (Throwable throwable) {
			/* empty */
        }
        if (i != 10) {
            anInt5481 = 16;
        }
        return string;
    }

    public final void init() {
        anInt5476++;
        if (this.method95((byte) -45)) {
            Class320_Sub24.aClass197_8443 = new Class197();
            Class320_Sub24.aClass197_8443.id = Integer.parseInt(this.getParameter("worldid"));
            Node_Sub15_Sub13.aClass197_9871 = new Class197();
            Node_Sub15_Sub13.aClass197_9871.id = Integer.parseInt(this.getParameter("lobbyid"));
            Node_Sub15_Sub13.aClass197_9871.ipadress = this.getParameter("lobbyaddress");
            Node_Sub38_Sub1.aClass329_10086 = Class250.method3095(Integer.parseInt(this.getParameter("modewhere")), 0);
            if (CacheNode_Sub2.aClass329_9436 == Node_Sub38_Sub1.aClass329_10086) {
                Node_Sub38_Sub1.aClass329_10086 = Class229.aClass329_2730;
            } else if (!Node_Sub13.method2548(false, Node_Sub38_Sub1.aClass329_10086)
                       && Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
                Node_Sub38_Sub1.aClass329_10086 = Class240.aClass329_2943;
            }
            OutcommingPacket.aClass129_4051 = Class331.method3841(20568, Integer.parseInt(this.getParameter
                    ("modewhat")));
            if (Class123.aClass129_1564 != OutcommingPacket.aClass129_4051
                && OutcommingPacket.aClass129_4051 != Node_Sub41.aClass129_7515
                && Class194_Sub3.aClass129_6901 != OutcommingPacket.aClass129_4051) {
                OutcommingPacket.aClass129_4051 = Class194_Sub3.aClass129_6901;
            }
            try {
                Class35.language = Integer.parseInt(this.getParameter("lang"));
            } catch (Exception exception) {
                Class35.language = 0;
            }
            String string = this.getParameter("objecttag");
            Node_Sub38_Sub21.aBoolean10320 = !(string == null || !string.equals("1"));
            String string_143_ = this.getParameter("js");
            Animable_Sub2_Sub1.aBoolean10628 = !(string_143_ == null || !string_143_.equals("1"));
            String string_144_ = this.getParameter("advert");
            Class163.aBoolean2021 = !(string_144_ == null || !string_144_.equals("1"));
            String string_145_ = this.getParameter("game");
            if (string_145_ != null) {
                if (string_145_.equals("0")) {
                    Class209.aClass353_2483 = Node_Sub38_Sub34.aClass353_10443;
                } else if (!string_145_.equals("1")) {
                    if (!string_145_.equals("2")) {
                        if (string_145_.equals("3")) {
                            Class209.aClass353_2483 = Node_Sub25_Sub4.aClass353_10010;
                        }
                    } else {
                        Class209.aClass353_2483 = Node_Sub38_Sub22.aClass353_10323;
                    }
                } else {
                    Class209.aClass353_2483 = Class169_Sub4.aClass353_8825;
                }
            }
            try {
                Class170.anInt2056 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                Class170.anInt2056 = 0;
            }
            Class191.aString2350 = Settings.QUIT_URL;
            Class83.aString5186 = this.getParameter("settings");
            if (Class83.aString5186 == null) {
                Class83.aString5186 = "";
            }
            Class255.aBoolean3218 = "1".equals(this.getParameter("under"));
            String string_146_ = this.getParameter("country");
            if (string_146_ != null) {
                try {
                    Class320_Sub27.anInt8460 = Integer.parseInt(string_146_);
                } catch (Exception exception) {
                    Class320_Sub27.anInt8460 = 0;
                }
            }
            Class178.anInt2118 = Integer.parseInt(this.getParameter("colourid"));
            if (Class178.anInt2118 < 0 || (Class382.aColorArray5258.length ^ 0xffffffff) >= (Class178.anInt2118
                                                                                             ^ 0xffffffff)) {
                Class178.anInt2118 = 0;
            }
            if ((Integer.parseInt(this.getParameter("sitesettings_member")) ^ 0xffffffff) == -2) {
                Class64.aBoolean5046 = Class262_Sub17.aBoolean7833 = true;
            }
            String string_147_ = this.getParameter("frombilling");
            if (string_147_ != null && string_147_.equals("true")) {
                Mobile_Sub1.aBoolean10961 = true;
            }
            String string_148_ = this.getParameter("sskey");
            if (string_148_ != null) {
                Class143.aByteArray1773 = Class57.method571(Class379.method4161((byte) 53, string_148_), false);
                if ((Class143.aByteArray1773.length ^ 0xffffffff) > -17) {
                    Class143.aByteArray1773 = null;
                }
            }
            String string_149_ = this.getParameter("force64mb");
            if (string_149_ != null && string_149_.equals("true")) {
                Class252.aBoolean3188 = true;
            }
            String string_150_ = this.getParameter("worldflags");
            if (string_150_ != null) {
                try {
                    Class380.anInt4877 = Integer.parseInt(string_150_);
                } catch (Exception exception) {
					/* empty */
                }
            }
            String string_151_ = this.getParameter("userFlow");
            if (string_151_ != null) {
                try {
                    Node_Sub32.aLong7385 = Long.parseLong(string_151_);
                } catch (NumberFormatException numberformatexception) {
					/* empty */
                }
            }
            Node_Sub38_Sub18.aString10283 = this.getParameter("additionalInfo");
            if (Node_Sub38_Sub18.aString10283 != null && (Node_Sub38_Sub18.aString10283.length() ^ 0xffffffff) < -51) {
                Node_Sub38_Sub18.aString10283 = null;
            }
            if (Node_Sub38_Sub34.aClass353_10443 != Class209.aClass353_2483) {
                if (Class209.aClass353_2483 == Class169_Sub4.aClass353_8825) {
                    Class257.anInt3244 = 480;
                    Node_Sub38_Sub12.anInt10225 = 640;
                }
            } else {
                Node_Sub38_Sub12.anInt10225 = 765;
                Class257.anInt3244 = 503;
            }
            String string_152_ = this.getParameter("hc");
            if (string_152_ != null && string_152_.equals("1")) {
                Node_Sub32.aBoolean7379 = true;
            }
            Class158.aClient1983 = this;
            this.method92(-102, 667, Node_Sub38_Sub12.anInt10225, OutcommingPacket.aClass129_4051.method1554(false)
                                                                  + 32, Class209.aClass353_2483.aString4341,
                    Class150_Sub1.INDEXES_COUNT, Class257.anInt3244);
        }
    }

    final void method102(int i) {
        try {
            anInt5474++;
            if (i < 85) {
                init();
            }
            if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 2) {
                try {
                    method118((byte) -89);
                } catch (Throwable throwable) {
                    ClanChat.method507(throwable, throwable.getMessage() + " (Recovered) " + method100(10), -118);
                    Node_Sub12.aBoolean5456 = true;
                    Class22.method300(0, true, false);
                }
            } else {
                method118((byte) -108);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class126.method1537(runtimeexception, "Client.Q(" + i + ')');
        }
    }

    /*synthetic*/
    static Class<?> method123(String string) {
        Class<?> var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
