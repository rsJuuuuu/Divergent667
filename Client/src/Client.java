/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Vector;

public class Client extends GameStub {
    private static final long serialVersionUID = -7864266943066132637L;
    static int anInt5465;
    static int anInt5466;
    static Class257 aClass257_5467 = new Class257();
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

    static void method104() {
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
                    actor = ((Node_Sub41) Objects.requireNonNull(Class12.aHashTable187.method1518(3512, Class54.LocalNPCsIndexes[i_1_
                            -
                            i])))
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

    public static void method105() {
        aClass192_5485 = null;
        aClass257_5467 = null;
    }

    static void method106(int i) {
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
                    actor = ((Node_Sub41) Objects.requireNonNull(Class12.aHashTable187.method1518(3512, Class54.LocalNPCsIndexes[i_5_
                            -
                            i_3_]))).aNpc7518;
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
                    if (!Class230.method2128(i_12_, i_13_, i_10_, i_11_, actor.anInt10857)) {
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

    public static void main(String[] strings) {
        anInt5473++;
        try {
            if (strings.length != 6) {
                Class230.method2127("Argument count");
            }
            Class320_Sub24.aClass197_8443 = new Class197();
            Class320_Sub24.aClass197_8443.id = Integer.parseInt(strings[0]);
            Node_Sub15_Sub13.aClass197_9871 = new Class197();
            Node_Sub15_Sub13.aClass197_9871.id = Integer.parseInt(strings[1]);
            Node_Sub38_Sub1.aClass329_10086 = CacheNode_Sub2.aClass329_9436;
            switch (strings[3]) {
                case "live":
                    OutcommingPacket.aClass129_4051 = Class194_Sub3.aClass129_6901;
                    break;
                case "rc":
                    OutcommingPacket.aClass129_4051 = Node_Sub41.aClass129_7515;
                    break;
                case "wip":
                    OutcommingPacket.aClass129_4051 = Class123.aClass129_1564;
                    break;
                default:
                    Class230.method2127("modewhat");
                    break;
            }
            Class35.language = Class262_Sub18.method3198(strings[4]);
            if (Class35.language == -1) {
                if (strings[4].equals("english")) {
                    Class35.language = 0;
                } else if (strings[4].equals("german")) {
                    Class35.language = 1;
                } else {
                    Class230.method2127("language");
                }
            }
            Node_Sub38_Sub21.aBoolean10320 = false;
            Animable_Sub2_Sub1.aBoolean10628 = false;
            switch (strings[5]) {
                case "game0":
                    Class209.aClass353_2483 = Node_Sub38_Sub34.aClass353_10443;
                    break;
                case "game1":
                    Class209.aClass353_2483 = Class169_Sub4.aClass353_8825;
                    break;
                case "game2":
                    Class209.aClass353_2483 = Node_Sub38_Sub22.aClass353_10323;
                    break;
                case "game3":
                    Class209.aClass353_2483 = Node_Sub25_Sub4.aClass353_10010;
                    break;
                default:
                    Class230.method2127("game");
                    break;
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
            var_client.method87(32
                    + OutcommingPacket
                    .aClass129_4051.method1554
                            (), Class209.aClass353_2483.aString4341);
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

    static void method107() {
        int i = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
        int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
        int i_17_ = Class213.aNode_Sub27_2512.aClass320_Sub27_7266.method3783();
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
            Npc npc = ((Node_Sub41) Objects.requireNonNull(Class12.aHashTable187.method1518(3512, Class54.LocalNPCsIndexes[i_20_])))
                    .aNpc7518;
            if (!npc.method873((byte) 66) || !npc.aNpcDefinition11122.method3010(Class24.aClass275_442)) {
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
                    Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, class223.anInt2658);
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

    final void method85() {
        anInt5472++;
        if (Class331.aBoolean4129) {
            Class144.method1631((byte) 126);
        }
        EntityNode_Sub3_Sub1.method944();
        if (Class93.aGraphicsToolkit1241 != null) {
            Class93.aGraphicsToolkit1241.method1233();
        }
        if (DrawableModel.aFrame907 != null) {
            Node_Sub25_Sub4.method2679(Class240.aSignLink2946, DrawableModel.aFrame907);
            DrawableModel.aFrame907 = null;
        }
        Class218.aClass123_2566.method1513();
        Class218.aClass123_2560.method1513();
        Class290_Sub4.method3430();
        Class267.aClass266_3449.method3235();
        Class320_Sub1.aClass141_8207.method1613();
        if (Animable.aClass193_5936 != null) {
            Animable.aClass193_5936.method1957();
            Animable.aClass193_5936 = null;
        }
        try {
            Class99.aSeekableFile1289.method3575();
            for (int i_24_ = 0; i_24_ < Class150_Sub1.aSeekableFileArray8953.length; i_24_++)
                Class150_Sub1.aSeekableFileArray8953[i_24_].method3575();
            Class3.aSeekableFile5156.method3575();
            Class366.aSeekableFile4529.method3575();
            Node_Sub24.method2649(true);
        } catch (Exception exception) {
            /* empty */
        }
    }

    private void method108() {
        anInt5465++;
        if (GLToolkit.anInt6509 < Class267.aClass266_3449.anInt3394) {
            Class181.aClass197_2155.method1997();
            Class262_Sub13.anInt7800 = 5 * (-50 + 50 * Class267.aClass266_3449.anInt3394);
            if (Class262_Sub13.anInt7800 > 3000) {
                Class262_Sub13.anInt7800 = 3000;
            }
            if (Class267.aClass266_3449.anInt3394 >= 2
                    && Class267.aClass266_3449.anInt3393 == 6) {
                this.method90("js5connect_outofdate");
                Class151.anInt1843 = 16;
                return;
            }
            if (Class267.aClass266_3449.anInt3394 >= 4 && Class267.aClass266_3449.anInt3393 == -1) {
                this.method90("js5crc");
                Class151.anInt1843 = 16;
                return;
            }
            if (Class267.aClass266_3449.anInt3394 >= 4
                    && RuntimeException_Sub1.method4207(Class151.anInt1843)) {
                if (Class267.aClass266_3449.anInt3393 == 7 || Class267.aClass266_3449.anInt3393 == 9) {
                    this.method90("js5connect_full");
                } else if (Class267.aClass266_3449.anInt3393 > 0) {
                    if (Class204.aString2458 == null) {
                        JOptionPane.showMessageDialog(null, "Unable to connect to " + Settings.SERVER_NAME
                                + ".\n Please check your internet connection and verify"
                                + " that the server is online.\n The client will now "
                                + "close.");
                        this.method90("js5connect");
                        System.exit(0);
                    } else {
                        this.method90("js5proxy_" + Class204.aString2458.trim());
                    }
                } else {
                    this.method90("js5io");
                }
                Class151.anInt1843 = 16;
                return;
            }
        }
        GLToolkit.anInt6509 = Class267.aClass266_3449.anInt3394;
        if (Class262_Sub13.anInt7800 > 0) {
            Class262_Sub13.anInt7800--;
        } else {
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
                        method119(1000);
                        return;
                    }
                    if (Node_Sub36_Sub3.aClass241_10059.anInt2953 == 1) {
                        Class290_Sub2.anInt8069++;
                    }
                }
                if (Class290_Sub2.anInt8069 == 2) {
                    Node_Sub38_Sub33.aBufferedConnection10440 = new BufferedConnection((Socket)
                            Node_Sub36_Sub3.aClass241_10059.anObject2956, Class240.aSignLink2946);
                    BufferedStream buffer = new BufferedStream(9);
                    buffer.writeByte(Plane.aClass133_3409.packetId);
                    buffer.writeInt(Settings.REVISION);
                    buffer.writeInt(Settings.SUB_BUILD);
                    Node_Sub38_Sub33.aBufferedConnection10440.method429(9, buffer.buffer);
                    Class290_Sub2.anInt8069++;
                    Node_Sub38_Sub36.aLong10462 = Class313.method3650();
                }
                if (Class290_Sub2.anInt8069 == 3) {
                    if (RuntimeException_Sub1.method4207(Class151.anInt1843)
                            || Node_Sub38_Sub33.aBufferedConnection10440.method428() > 0) {
                        int i_26_ = Node_Sub38_Sub33.aBufferedConnection10440.method424();
                        if (i_26_ != 0) {
                            method119(i_26_);
                            return;
                        }
                        Class290_Sub2.anInt8069++;
                    } else if (Class313.method3650() - Node_Sub38_Sub36.aLong10462 > 30000) {
                        method119(1001);
                        return;
                    }
                }
                if (Class290_Sub2.anInt8069 != 4) {
                    return;
                }
                boolean bool = RuntimeException_Sub1.method4207(Class151.anInt1843)
                        || Class26.method311(Class151.anInt1843)
                        || Class329.method3833(Class151.anInt1843);
                Class298[] class298s = Class298.method3481(-125);
                BufferedStream buffer = new BufferedStream(4 * class298s.length);
                Node_Sub38_Sub33.aBufferedConnection10440.method425(buffer.buffer.length, 0, buffer
                        .buffer);
                for (Class298 class298 : class298s) class298.method3482(buffer.readInt());
                Class267.aClass266_3449.method3241(!bool, Node_Sub38_Sub33.aBufferedConnection10440);
                Class290_Sub2.anInt8069 = 0;
                Node_Sub38_Sub33.aBufferedConnection10440 = null;
                Node_Sub36_Sub3.aClass241_10059 = null;
            } catch (java.io.IOException ioexception) {
                method119(1002);
            }
        }
    }

    static IComponentDefinitions method109(IComponentDefinitions widget) {
        int i = method113(widget).method2745();
        if (i == 0) {
            return null;
        }
        for (int i_28_ = 0; i_28_ < i; i_28_++) {
            widget = Class76.method771(widget.parentId);
            if (widget == null) {
                return null;
            }
        }
        return widget;
    }

    private void method110() {
        if (Class151.anInt1843 == 7 && !Class132.method1561()
                || Class151.anInt1843 == 9 && Class339_Sub2.anInt8653 == 42) {
            if (Node_Sub19.anInt7163 > 1) {
                Node_Sub19.anInt7163--;
                Node_Sub23_Sub1.anInt9926 = Class345.anInt4270;
            }
            if (!Class213.aBoolean2510) {
                Node_Sub7.method2421();
            }
            for (int i_29_ = 0; i_29_ < 100; i_29_++) {
                if (!Class194_Sub3_Sub1.method1980(Class218.aClass123_2560)) {
                    break;
                }
            }
        }
        anInt5482++;
        Node_Sub9_Sub1.anInt9637++;
        Class243.method3059(-1, (byte) 29, -1, null);
        CacheNode_Sub4.method2305(-1, -1, null);
        Node_Sub34.method2741();
        Class345.anInt4270++;
        for (int i_30_ = 0; Node_Sub32.cachedNPCcsCount > i_30_; i_30_++) {
            Npc npc = Class314.LocalNPCs[i_30_].aNpc7518;
            if (npc != null) {
                byte b = npc.aNpcDefinition11122.aByte2816;
                if ((0x1 & b) != 0) {
                    int size = npc.getSize((byte) 48);
                    if ((b & 0x2) != 0 && npc.anInt10904 == 0 && 1000.0 * Math.random() < 10.0) {
                        int xDiff = (int) Math.round(10.0 * Math.random() - 5.0);
                        int yDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
                        if (xDiff != 0 || yDiff != 0) {
                            int toX = xDiff + npc.scenePositionXQueue[0];
                            if (toX < 0) {
                                toX = 0;
                            } else if (-1 + Node_Sub54.GAME_SCENE_WDITH - size < toX) {
                                toX = -1 - size + Node_Sub54.GAME_SCENE_WDITH;
                            }
                            int toY = yDiff + npc.scenePositionYQueue[0];
                            if (toY >= 0) {
                                if (-1 + (Class377_Sub1.GAME_SCENE_HEIGHT - size) < toY) {
                                    toY = -1 - size + Class377_Sub1.GAME_SCENE_HEIGHT;
                                }
                            } else {
                                toY = 0;
                            }
                            int steps = Class275.calculateRoute(npc.scenePositionXQueue[0], npc
                                            .scenePositionYQueue[0], toX, toY, size, -1, true, size, size, 0, 0,
                                    Class304.SCENE_CLIP_DATA_PLANES[npc.plane],
                                    Class328_Sub1.calculatedScenePositionXs, Class258.calculatedScenePositionYs
                            );
                            if (steps > 0) {
                                if (steps > 9) {
                                    steps = 9;
                                }
                                for (int count = 0; count < steps; count++) {
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
                    Node_Sub20.method2614(npc, true);
                    int i_38_ = Class59.method586(npc);
                    Class76.method769(npc);
                    Class352.method4009(Class275.anInt5412, i_38_, Class320_Sub23.anInt8431, npc);
                    Class372.method4103(npc, Class275.anInt5412);
                    Class34.method370(npc, (byte) 28);
                }
            }
        }
        if ((Class151.anInt1843 == 3 || Class151.anInt1843 == 9 || Class151.anInt1843 == 7) && (!Class132.method1561()
                || Class151.anInt1843 == 9
                &&
                Class339_Sub2.anInt8653 == 42)
                && Class4.anInt124 == 0) {
            if (Class320_Sub22.anInt8415 == 2) {
                Class314.method3652(70);
            } else {
                Class309.method3586(0x69);
            }
            if (Class98.anInt5061 >> 9 < 14 || Class98.anInt5061 >> 9 >= -14 + Node_Sub54.GAME_SCENE_WDITH
                    || Node_Sub10.anInt7079 >> 9 < 14
                    || Node_Sub10.anInt7079 >> 9 >= -14 + Class377_Sub1.GAME_SCENE_HEIGHT) {
                CacheNode_Sub3.method2292();
            }
        }
        for (; ; ) {
            Node_Sub37 node_sub37 = (Node_Sub37) CacheNode_Sub14_Sub2.aClass312_11039.method3619(-124);
            if (node_sub37 == null) {
                break;
            }
            IComponentDefinitions widget = node_sub37.aWidget7437;
            if (widget.anInt4687 >= 0) {
                IComponentDefinitions widget_39_ = Class76.method771(widget.parentId);
                if (widget_39_ == null || widget_39_.aWidgetArray4804 == null
                        || widget.anInt4687 >= widget_39_.aWidgetArray4804.length
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
            if (widget.anInt4687 >= 0) {
                IComponentDefinitions widget_40_ = Class76.method771(widget.parentId);
                if (widget_40_ == null || widget_40_.aWidgetArray4804 == null
                        || widget.anInt4687 >= widget_40_.aWidgetArray4804.length
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
                IComponentDefinitions widget_41_ = Class76.method771(widget.parentId);
                if (widget_41_ == null || widget_41_.aWidgetArray4804 == null
                        || widget_41_.aWidgetArray4804.length <= widget.anInt4687
                        || widget_41_.aWidgetArray4804[widget.anInt4687] != widget) {
                    continue;
                }
            }
            ClientScriptsExecutor.method3556(node_sub37);
        }
        if (Class58.aWidget861 != null) {
            Class277_Sub1.method3357();
        }
        if (Class174.clientCycle % 1500 == 0) {
            Node_Sub24.method2644();
        }
        if (Class151.anInt1843 == 7 && !Class132.method1561()
                || Class151.anInt1843 == 9 && Class339_Sub2.anInt8653 == 42) {
            Class168.method1754();
        }
        Class312.method3618(16711680);
        if (Class331.aBoolean4129 && Animable_Sub2_Sub1.aLong10630 < Class313.method3650() - 60000L) {
            Class144.method1631((byte) 123);
        }
        for (EntityNode_Sub3_Sub1 entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1113(
                (byte) 120);
             entitynode_sub3_sub1
                     != null; entitynode_sub3_sub1 = (EntityNode_Sub3_Sub1) Class97.aClass103_1277.method1108(104)) {
            if (Class313.method3650() / 1000L - 5L > (long) entitynode_sub3_sub1.anInt9162) {
                if (entitynode_sub3_sub1.aShort9164 > 0) {
                    Class28.method331(entitynode_sub3_sub1.aString9156
                            + Translation.aTranslation_382.getTranslatedString(Class35.language), "", 0, "", "", 5);
                }
                if (entitynode_sub3_sub1.aShort9164 == 0) {
                    Class28.method331(
                            entitynode_sub3_sub1.aString9156 + Translation.aTranslation_383.getTranslatedString(Class35.language), "",
                            0, "", "", 5);
                }
                entitynode_sub3_sub1.method803();
            }
        }
        if (Class151.anInt1843 == 7 && !Class132.method1561()
                || Class151.anInt1843 == 9 && Class339_Sub2.anInt8653 == 42) {
            if (Class151.anInt1843 != 9 && Class218.aClass123_2560.aClass365_1557 == null) {
                Class127.method1542(false);
                return;
            }
            if (Class218.aClass123_2560 != null) {
                Class218.aClass123_2560.anInt1579++;
                if (Class218.aClass123_2560.anInt1579 > 50) {
                    Class365.anInt4524++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class224.OUTCOMMING_PACKET_16,
                            Class218.aClass123_2560.anIsaacCipher1571);
                    Class218.aClass123_2560.sendPacket(126, node_sub13);
                }
                try {
                    Class218.aClass123_2560.method1512();
                } catch (java.io.IOException ioexception) {
                    if (Class151.anInt1843 == 9) {
                        Class218.aClass123_2560.method1513();
                    } else {
                        Class127.method1542(false);
                    }
                }
            }
        }
    }

    private void method111() {
        anInt5478++;
        boolean bool = Class267.aClass266_3449.method3238();
        if (!bool) {
            method108();
        }
    }

    static boolean method112(IComponentDefinitions widget) {
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

    final void method89() {
        method105();
        anInt5469++;
        Class9.method185();
        Class62.method609();
        CacheNode_Sub2.method2286();
        Translation.method299();
        Class291.method3451();
        Class93.method1042();
        Class102.method1096();
        Class19.method267();
        Class206.method2036();
        Node_Sub28.method2702();
        Class153.method1696();
        Actor.method851();
        Class298.method3486();
        Animator.method233();
        Class186.method1874();
        Class173.method1798();
        IComponentDefinitions.method4146();
        Class277.method3342();
        CacheNode.method2278();
        Node.method2164();
        Class158.method1716();
        HashTable.method1521();
        GameStub.method94();
        Class234.method2149();
        Class129.method1555();
        Class329.method3837();
        Class336.method3866();
        GraphicsToolkit.method1237();
        Node_Sub27.method2692();
        Node_Sub39.method2919();
        Class223.method2102();
        Class275.method3331();
        Class312.method3610();
        BufferedConnection.method421();
        Class266.method3248();
        Class141.method1618();
        Class232.method2135();
        Class34_Sub1.method384();
        SeekableFile.method3578();
        MainFile.method178();
        Class61.method606();
        Class281.method3381();
        Class239.method3024();
        Class362.method4050();
        Class71.method744();
        Class58.method578();
        Class181.method1831();
        Class308.method3583();
        Class359.method4035();
        Class215.method2064();
        Class338.method3910();
        Class279.method3372();
        Class86.method1001();
        Class32.method358();
        Class37.method400();
        Class278.method3368();
        Class57.method567();
        Class101.method1092();
        Class180.method1822();
        Class142.method1619();
        Class176.method1806();
        Class128.method1545();
        Class229.method2124();
        Class315.method3659();
        Class13.method212();
        Class122.method1507();
        Class363.method4056();
        Class1.method165();
        Node_Sub41.method2930();
        Class365.method4064();
        Class123.method1509();
        Class193.method1956();
        BufferedStream.method2234();
        Class84.method981();
        Class277_Sub1.method3358();
        CacheNode_Sub11.method2338();
        Class224.method2106();
        Player.method884();
        ClanChat.method491();
        Node_Sub43.method2944();
        Class261.method3143();
        Class257.method3123();
        Node_Sub8.method2425();
        Node_Sub2.method2168();
        InterfaceSettings.method2749();
        CacheNode_Sub20.method2410();
        IsaacCipher.method1669();
        Packet.method2254();
        Class125.method1528();
        Class385.method4206();
        EntityNode_Sub3.method938();
        Class60.method593();
        Class377_Sub1.method4132();
        Class85.method998();
        RuntimeException_Sub1.method4208();
        Class4.method170();
        Class294.method3465();
        CacheNode_Sub16_Sub2.method2390();
        CacheNode_Sub16_Sub1.method2388();
        Class203.method2029();
        Class243.method3058();
        Plane.method3254();
        Class121.method1232();
        DrawableModel.method623();
        NpcDefinition.method3003();
        Class361.method4048();
        ItemDefinitions.method1680();
        Class52.method532();
        TemporaryItemDefinition.method402();
        FileOnDisk.method1099();
        Class187.method1880();
        Class320_Sub13.method3731();
        Class320_Sub22.method3767();
        Class320_Sub5.method3696();
        Class320_Sub16.method3743();
        Class320_Sub23.method3768();
        Class320_Sub6.method3704();
        Class320_Sub24.method3771();
        Class320_Sub12.method3729();
        Class320_Sub3.method3687();
        Class320_Sub28.method3785();
        Class320_Sub18.method3748();
        Class320_Sub2.method3683();
        Class320_Sub7.method3706();
        Class320_Sub29.method3792();
        Class320_Sub19.method3752();
        Class320_Sub26.method3778();
        Class320_Sub1.method3679();
        Class320_Sub15.method3740();
        Class320_Sub21.method3759();
        Class320_Sub10.method3719();
        Class320_Sub17.method3745();
        Class304.method3546();
        Renderer.method3447();
        Exception_Sub1.method140();
        aa.method158();
        za.method2990();
        Class357.method4025();
        Class198.method2003();
        Node_Sub29.method2713();
        Class270.method3296();
        Class97.method1078();
        Mobile.method846();
        Animable.method812();
        Node_Sub9_Sub1.method2454();
        Class42.method448();
        Class191.method1950();
        Class78.method781();
        Class48.method482();
        ClientScriptsExecutor.method3560();
        OutcommingPacket.method3670();
        Class212.method2052();
        Node_Sub25_Sub4.method2681();
        Class189.method1927();
        Class189_Sub1.method1936();
        Node_Sub25_Sub3.method2668();
        Node_Sub25_Sub1.method2662();
        Node_Sub9_Sub5.method2527();
        Class370.method4088();
        Class252.method3102();
        Class110.method1134();
        Class286.method3394();
        Class274.method3324();
        Class163.method1733();
        Class220.method2098();
        Class250.method3094();
        Class254.method3110();
        Class20.method287();
        Class30.method342();
        Class89.method1020();
        Class96.method1070();
        Class92.method1037();
        Class324.method3813();
        Class40.method431();
        Class379.method4163();
        Class154.method1700();
        Class179.method1814();
        Class39.method418();
        EntityNode_Sub6.method970();
        Class171.method1794();
        Class165.method1744();
        AnimableAnimator_Sub1.method255();
        Class99.method1085();
        EntityNode_Sub4.method956();
        Class259.method3129();
        ReferenceTable.method264();
        Class34.method372();
        Class20_Sub1.method293();
        Class303.method3541();
        Class157.method1711();
        Class79.method783();
        Class299.method3493();
        Class67.method732();
        Class133.method1566();
        Class172.method1796();
        Class119.method1227();
        Class113.method1149();
        Class16.method221();
        Node_Sub37.method2773();
        ClientScript.method2323();
        Class168.method1753();
        Npc.method872();
        Class343.method3963();
        CacheNode_Sub16.method2384();
        Class10.method190();
        Class326.method3815();
        Class273.method3317();
        Animable_Sub3.method920();
        Animable_Sub2.method838();
        Class256.method3120();
        r.method2362();
        Class376.method4117();
        Class182.method1836();
        Class300.method3494();
        Class218.method2076();
        Class17.method259();
        Node_Sub40.method2925();
        CacheNode_Sub15.method2380();
        Class222.method2101();
        Class364.method4058();
        Class12.method202();
        Class195.method1984();
        Class342.method3961();
        Node_Sub16.method2592();
        Node_Sub32.method2730();
        Class216.method2073();
        Class262.method3147();
        PlayerUpdateReference.method3811();
        Node_Sub44.method2945();
        Node_Sub47.method2950();
        Node_Sub49.method2957();
        Class289.method3407();
        Class236.method3011();
        Class264.method3230();
        Class293.method3464();
        Class314.method3651();
        Class140.method1609();
        Class267.method3286();
        Class184.method1848();
        Class82.method796();
        Class7.method183();
        Class367.method4076();
        CacheNode_Sub1.method2285();
        Class355.method4022();
        Class249.method3088();
        Class332.method3845();
        Class335.method3850();
        Class147.method1648();
        Class43.method459();
        Class253.method3106();
        Class204.method2031();
        Class124.method1526();
        Class226.method2111();
        Class219.method2096();
        Class130.method1558();
        Class330.method3839();
        AnimableAnimator.method252();
        Class114.method1154();
        EntityNode_Sub1.method804();
        Mobile_Sub1.method900();
        Mobile_Sub4.method916();
        TileMessage.method935();
        Class155.method1702();
        Class217.method2074();
        Class162.method1732();
        CacheNode_Sub10.method2331();
        Class151.method1672();
        Class24.method303();
        Class47.method474();
        Class356.method4023();
        Class248.method3085();
        Class15.method218();
        Animable_Sub3_Sub1.method923();
        Animable_Sub2_Sub1.method840();
        Animable_Sub4_Sub2.method934();
        Mobile_Sub3.method905();
        Class18.method265();
        Class148.method1651();
        Class291_Sub1.method3457();
        Class93_Sub2.method1063();
        Class170.method1791();
        Class55.method560();
        Class327.method3824();
        Class150_Sub3_Sub1.method1664();
        Class116.method1162();
        Class166.method1745();
        Class150_Sub3.method1662();
        Class205.method2032();
        Class235_Sub1.method2159();
        Class150_Sub2.method1661();
        Class235.method2155();
        Class150_Sub1.method1655();
        Class337.method3903();
        Class91.method1034();
        CacheNode_Sub19.method2403();
        CacheNode_Sub6.method2312();
        Class352.method4010();
        CacheNode_Sub3.method2295();
        Node_Sub25.method2655();
        Class368.method4079();
        Node_Sub18.method2605();
        Class54.method557();
        Canvas.method124();
        Class375.method4114();
        Class41.method433();
        IOException_Sub1.method132();
        Class160.method1728();
        Class202.method2026();
        Class282.method3388();
        Class380.method4171();
        Class75.method764();
        Class201.method2025();
        Class90.method1027();
        Class231.method2134();
        Class115.method1161();
        CacheNode_Sub14.method2346();
        Class365_Sub1.method4069();
        Node_Sub38_Sub27.method2879();
        Animable_Sub1_Sub1.method827();
        Class174.method1802();
        Node_Sub52.method2971();
        Class377.method4121();
        Class46.method466();
        Class297.method3480();
        Node_Sub10.method2538();
        Class27.method325();
        Node_Sub9_Sub4.method2524();
        Node_Sub6.method2414();
        Class227.method2119();
        Class31.method349();
        Node_Sub51.method2967();
        Class240.method3029();
        Class42_Sub2.method457();
        Class321.method3802();
        Node_Sub25_Sub2.method2666();
        Node_Sub38.method2774();
        Class45.method463();
        Class258.method3125();
        Class88.method1017();
        Class3.method169();
        Class260.method3138();
        Class230.method2130();
        Class230_Sub1.method2132();
        Class66_Sub1.method724();
        Class66.method718();
        Class66_Sub2.method725();
        Class105.method1118();
        Class83.method799();
        Class66_Sub2_Sub1.method729();
        Class371.method4099();
        Class295.method3473();
        Class246.method3074();
        Class74.method757();
        Class350.method4000();
        Node_Sub42.method2933();
        CacheNode_Sub5.method2310();
        EntityNode_Sub7.method975();
        Class269.method3293();
        EntityNode_Sub8.method980();
        Class63.method708();
        Class188.method1889();
        Class146.method1643();
        CacheNode_Sub14_Sub2.method2351();
        Class233.method2142();
        Class262_Sub16.method3194();
        Class262_Sub2.method3154();
        Class262_Sub6.method3165();
        Class262_Sub12.method3180();
        Class262_Sub13.method3181();
        Class262_Sub8.method3168();
        Class262_Sub14.method3186();
        Class262_Sub15_Sub1.method3191();
        Class262_Sub15.method3190();
        Class262_Sub5.method3162();
        Class262_Sub4.method3161();
        Class262_Sub18.method3199();
        Class262_Sub10.method3172();
        Class262_Sub3.method3158();
        Class262_Sub21.method3205();
        Class262_Sub1.method3149();
        Class262_Sub9.method3170();
        Class262_Sub11.method3174();
        Class262_Sub23.method3216();
        Class262_Sub19.method3202();
        Class262_Sub7.method3167();
        Node_Sub53.method2979();
        Class35.method388();
        Node_Sub38_Sub17.method2843();
        Node_Sub38_Sub8.method2816();
        Node_Sub38_Sub1.method2790();
        Class64.method709();
        Class336_Sub2.method3892();
        Class374.method4110();
        GLToolkit.method1416();
        Class136.method1589();
        Class73.method752();
        Class247.method3083();
        Node_Sub23_Sub1.method2639();
        Class29.method335();
        Class336_Sub3.method3900();
        Class167.method1750();
        Class382.method4185();
        Class169.method1764();
        Class169_Sub2.method1771();
        Class270_Sub2.method3305();
        GLDrawableModel.method644();
        Class69.method735();
        Class169_Sub1.method1770();
        Class126.method1533();
        Class372.method4102();
        Class56.method564();
        Class346.method3976();
        Class94.method1064();
        Class307.method3579();
        Class270_Sub1.method3297();
        Class26.method314();
        Class213.method2055();
        StandardDrawableModel.method699();
        Class68.method734();
        Class139.method1605();
        GLXToolkit.method1404();
        Class51_Sub1.method523();
        Class196.method1992();
        Node_Sub38_Sub26.method2874();
        Node_Sub38_Sub33.method2899();
        Node_Sub38_Sub25.method2872();
        Node_Sub38_Sub11.method2829();
        Node_Sub38_Sub35.method2903();
        Node_Sub38_Sub18.method2845();
        Node_Sub38_Sub37.method2906();
        Node_Sub38_Sub38.method2915();
        Node_Sub38_Sub14.method2837();
        Node_Sub38_Sub3.method2796();
        Node_Sub38_Sub4.method2798();
        Node_Sub38_Sub34.method2902();
        Node_Sub38_Sub29.method2890();
        Node_Sub38_Sub23.method2864();
        Node_Sub38_Sub39.method2917();
        Node_Sub38_Sub9.method2821();
        Node_Sub38_Sub10.method2825();
        Node_Sub38_Sub2.method2794();
        Node_Sub38_Sub16.method2839();
        Node_Sub38_Sub31.method2892();
        Node_Sub38_Sub21.method2858();
        Node_Sub38_Sub5.method2803();
        Node_Sub38_Sub6.method2804();
        Node_Sub38_Sub28.method2885();
        Node_Sub38_Sub7.method2808();
        Node_Sub38_Sub24.method2867();
        Node_Sub38_Sub13.method2832();
        Node_Sub38_Sub32.method2895();
        Node_Sub38_Sub19.method2848();
        Node_Sub38_Sub22.method2860();
        Node_Sub38_Sub20.method2852();
        Node_Sub38_Sub15.method2838();
        Class238.method3018();
        Node_Sub22.method2621();
        Class209.method2048();
        Class214.method2061();
        ProducingGraphicsBuffer.method2602();
        Class366.method4072();
        Class137.method1600();
        Class200_Sub2.method2018();
        GLPlane.method3263();
        Class145.method1640();
        Class169_Sub3.method1780();
        CacheNode_Sub17.method2395();
        Node_Sub23.method2628();
        Class339_Sub6.method3938();
        Class72.method747();
        Class190.method1942();
        r_Sub2.method2377();
        aa_Sub3.method161();
        Node_Sub33.method2736();
        Class50.method510();
        Class270_Sub2_Sub2.method3310();
        Class117_Sub1.method1169();
        Class117.method1164();
        Class117_Sub2.method1173();
        Class200_Sub1.method2016();
        Class339_Sub1.method3926();
        Class339_Sub9.method3947();
        Class339_Sub2.method3927();
        Class169_Sub4.method1785();
        Class339_Sub5.method3936();
        Class339_Sub3.method3931();
        Class339_Sub4.method3934();
        Class339_Sub7.method3943();
        Class210.method2050();
        Class21.method296();
        Class44.method460();
        Class228.method2121();
        za_Sub2.method2996();
        Class14.method216();
        r_Sub1.method2366();
        Class225.method2109();
        Class328_Sub1.method3831();
        StandardSprite.method1214();
        StandardPlane.method3274();
        Node_Sub54.method2987();
        Class263.method3219();
        Class290_Sub5.method3437();
        Class290_Sub4.method3433();
        Class290_Sub7.method3440();
        Class290_Sub6.method3439();
        Class188_Sub1.method1892();
        Class188_Sub2.method1904();
        Class328.method3828();
        Class175.method1804();
        Class134_Sub4.method1585();
        Class134.method1571();
        Class134_Sub3.method1584();
        Class290_Sub11.method3444();
        Class106.method1122();
        Class290_Sub1.method3423();
        Class290_Sub3.method3428();
        Class51.method514();
        Class51_Sub2.method524();
        Class194_Sub3.method1974();
        Class194.method1963();
        Class194_Sub3_Sub1.method1981();
        Class194_Sub2.method1971();
        Class194_Sub1_Sub1.method1968();
        Class194_Sub1.method1967();
        Node_Sub46.method2949();
        Node_Sub26.method2687();
        Class245.method3066();
        Node_Sub24.method2648();
        Class237.method3016();
        EntityNode_Sub3_Sub1.method942();
        CacheNode_Sub12.method2342();
        CacheNode_Sub18.method2399();
        Node_Sub5.method2269();
        Class127.method1541();
        InputStream_Sub2.method130();
        OutputStream_Sub2.method137();
        Class296.method3475();
        Class345.method3970();
        Node_Sub30.method2724();
        Node_Sub34.method2740();
        Node_Sub20.method2616();
        CacheNode_Sub4.method2306();
        Node_Sub36.method2755();
        Node_Sub36_Sub1.method2759();
        Node_Sub36_Sub3.method2763();
        Node_Sub36_Sub4.method2765();
        Node_Sub36_Sub2.method2760();
        Node_Sub15.method2555();
        Node_Sub15_Sub2.method2562();
        Node_Sub15_Sub7.method2574();
        Node_Sub15_Sub5.method2570();
        Node_Sub15_Sub10.method2579();
        Node_Sub15_Sub4.method2565();
        Node_Sub15_Sub13.method2585();
        Node_Sub15_Sub6.method2573();
        Node_Sub15_Sub11.method2581();
        Node_Sub15_Sub9.method2577();
        Node_Sub15_Sub12.method2584();
        Node_Sub12.method2544();
        Node_Sub5_Sub2.method2274();
        Class156.method1707();
        OutputStream_Sub1.method135();
        InputStream_Sub1.method127();
        Class143.method1624();
        Node_Sub21.method2617();
        Class132.method1562();
        Class152.method1694();
        Class107.method1125();
        Class319.method3672();
        Class188_Sub1_Sub1.method1893();
        Class188_Sub2_Sub2.method1912();
        Class347.method3978();
        Class221.method2100();
        Class344.method3969();
        Class284.method3390();
        Class144.method1627();
        Class144_Sub4.method1637();
        Class144_Sub3.method1636();
        Class144_Sub1.method1632();
        Class188_Sub1_Sub2.method1902();
        Class188_Sub2_Sub1.method1906();
    }

    static InterfaceSettings method113(IComponentDefinitions widget) {
        InterfaceSettings node_sub35 = (InterfaceSettings) Class156.aHashTable1964.method1518(3512,
                ((long) widget.ihash << 32) + (long) widget.anInt4687);
        if (node_sub35 != null) {
            return node_sub35;
        }
        return widget.aNode_Sub35_4840;
    }

    static void method114(byte b, CacheNode_Sub13 cachenode_sub13) {
        anInt5475++;
        if (cachenode_sub13 != null) {
            Class368.aClass312_4549.method3625(cachenode_sub13);
            Class315.anInt4035++;
            CacheNode_Sub4 cachenode_sub4;
            if (cachenode_sub13.aBoolean9567 || "".equals(cachenode_sub13.aString9558)) {
                cachenode_sub4 = new CacheNode_Sub4(cachenode_sub13.aString9558);
                Class21.anInt355++;
            } else {
                long l = cachenode_sub13.aLong9564;
                for (cachenode_sub4 = (CacheNode_Sub4) Class261.aHashTable3306.method1518(3512, l); cachenode_sub4
                        != null;
                     cachenode_sub4 = (CacheNode_Sub4) Class261.aHashTable3306.method1524()) {
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
            if (cachenode_sub4.method2303(cachenode_sub13)) {
                GLSprite_Sub1.method1205(cachenode_sub4, (byte) 83);
            }
        }
    }

    static void method115(IComponentDefinitions[] widgets, int i_42_) {
        int i_43_ = 0;
        for (/**/; widgets.length > i_43_; i_43_++) {
            IComponentDefinitions widget = widgets[i_43_];
            if (widget != null) {
                if (widget.type == 0) {
                    if (widget.aWidgetArray4793 != null) {
                        method115(widget.aWidgetArray4793, i_42_);
                    }
                    Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, widget.ihash);
                    if (node_sub2 != null) {
                        Class76.method770(i_42_, node_sub2.interfaceId);
                    }
                }
                if (i_42_ == 0 && widget.anObjectArray4778 != null) {
                    Node_Sub37 node_sub37 = new Node_Sub37();
                    node_sub37.aWidget7437 = widget;
                    node_sub37.parameters = widget.anObjectArray4778;
                    ClientScriptsExecutor.method3556(node_sub37);
                }
                if (i_42_ == 1 && widget.anObjectArray4712 != null) {
                    if (widget.anInt4687 >= 0) {
                        IComponentDefinitions widget_44_ = Class76.method771(widget.ihash);
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

    static void method116() {
        Class99.anInt1286 = 0;
        for (int i = 0; i < Node_Sub25_Sub3.localNPCsCount; i++) {
            Npc npc = ((Node_Sub41) Objects.requireNonNull(Class12.aHashTable187.method1518(3512, Class54.LocalNPCsIndexes[i])))
                    .aNpc7518;
            if (npc.aBoolean10826 && npc.method855((byte) -123) != -1) {
                int i_45_ = (npc.getSize((byte) 63) - 1) * 256 + 252;
                int i_46_ = npc.anInt5934 - i_45_ >> 9;
                int i_47_ = npc.anInt5940 - i_45_ >> 9;
                Actor actor = Class104.method1115(i_46_, i_47_, npc.plane);
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
        Class93.method1049(Node_Sub15_Sub4.anIntArray9802, Class99.anInt1286 - 1, Class171.anIntArray2070, 0);
    }

    static void method117() {
        for (int i = 0; i < Node_Sub54.GAME_SCENE_WDITH; i++) {
            int[] is = Node_Sub38_Sub16.anIntArrayArray10269[i];
            for (int i_49_ = 0; i_49_ < Class377_Sub1.GAME_SCENE_HEIGHT; i_49_++)
                is[i_49_] = 0;
        }
    }

    private void method118(byte b) {
        try {
            anInt5479++;
            if (Class151.anInt1843 != 16) {
                long l = Node_Sub15_Sub5.method2568() / 1000000L - Class114.aLong1460;
                Class114.aLong1460 = Node_Sub15_Sub5.method2568() / 1000000L;
                boolean bool = Class303.method3540();
                if (bool && Class377_Sub1.aBoolean8775 && AnimableAnimator.aClass42_5498 != null) {
                    AnimableAnimator.aClass42_5498.method451();
                }
                if (Class253.method3105(Class151.anInt1843)) {
                    if (Class320_Sub13.aLong8339 != 0
                            && Class313.method3650() > Class320_Sub13.aLong8339) {
                        Node_Sub38_Sub19.method2850(Class188_Sub2_Sub1.getDisplayMode(3),
                                Node_Sub44.anInt7551, Class234.anInt2787);
                    } else if (!Class93.aGraphicsToolkit1241.B() && Class169_Sub4.aBoolean8829) {
                        InputStream_Sub2.method128();
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
                    if (i != Class36.anInt542 || CacheNode_Sub3.anInt9441 != i_50_ || Class152.aBoolean1942) {
                        if (Class93.aGraphicsToolkit1241 == null || Class93.aGraphicsToolkit1241.b()) {
                            Npc.method880((byte) 11);
                        } else {
                            Class36.anInt542 = i;
                            CacheNode_Sub3.anInt9441 = i_50_;
                        }
                        Class320_Sub13.aLong8339 = 500L + Class313.method3650();
                        Class152.aBoolean1942 = false;
                    }
                }
                if (DrawableModel.aFrame907 != null && !Class51.aBoolean5331
                        && Class253.method3105(Class151.anInt1843)) {
                    Node_Sub38_Sub19.method2850(Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678
                            (), -1, -1);
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
                        || Class188_Sub2_Sub1.getDisplayMode(3) != 1) {
                    Class320_Sub21.method3764(-102);
                }
                if (RuntimeException_Sub1.method4207(Class151.anInt1843)) {
                    Class194_Sub3.method1976(bool_51_);
                } else if (Class197.method1999(Class151.anInt1843)) {
                    Class17.method260();
                } else if (Node_Sub25_Sub2.method2665(Class151.anInt1843)) {
                    Class17.method260();
                } else if (!Class315.method3655(Class151.anInt1843, 128)) {
                    if (Class151.anInt1843 == 11) {
                        Class365.method4066(l);
                    } else if (Class151.anInt1843 == 14) {
                        Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                                Translation.aTranslation_377.getTranslatedString(Class35.language) + "<br>"
                                        + Translation.aTranslation_378.getTranslatedString(Class35.language), false,
                                Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945);
                    } else if (Class151.anInt1843 == 15) {
                        Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Translation.aTranslation_394.getTranslatedString
                                (Class35.language), false, Class169_Sub3.aClass357_8820, StandardSprite
                                .aClass52_8945);
                    }
                } else if (Class118.anInt5407 == 1) {
                    if (Class188.anInt2287 < Node_Sub29_Sub2.anInt10015) {
                        Class188.anInt2287 = Node_Sub29_Sub2.anInt10015;
                    }
                    int i = (Class188.anInt2287 - Node_Sub29_Sub2.anInt10015) * 50 / Class188.anInt2287;
                    Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                            Translation.loading_translation.getTranslatedString(Class35.language) + "<br>(" + i
                                    + "%)", true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945);
                } else if (Class118.anInt5407 == 2) {
                    if (Node_Sub2.anInt6937 > Class320_Sub19.anInt8388) {
                        Class320_Sub19.anInt8388 = Node_Sub2.anInt6937;
                    }
                    int i = (Class320_Sub19.anInt8388 - Node_Sub2.anInt6937) * 50 / Class320_Sub19.anInt8388
                            + 50;
                    Class169_Sub3.method1779(Class93.aGraphicsToolkit1241,
                            Translation.loading_translation.getTranslatedString(Class35.language) + "<br>(" + i
                                    + "%)", true, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945
                    );
                } else {
                    Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Translation.loading_translation
                            .getTranslatedString(Class35.language), true, Class169_Sub3.aClass357_8820, StandardSprite
                            .aClass52_8945);
                }
                if (Class12.anInt193 == 3) {
                    for (int i = 0; Node_Sub11.anInt7105 > i; i++) {
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
                if (GLXToolkit.method1401()) {
                    Node_Sub42.method2936(Class93.aGraphicsToolkit1241);
                }
                if (Class240.aSignLink2946.aBoolean3985 && Class253.method3105(Class151.anInt1843)
                        && Class12.anInt193 == 0 && Class188_Sub2_Sub1.getDisplayMode(3) == 1
                        && !bool_51_) {
                    int i = 0;
                    for (int i_52_ = 0; Node_Sub11.anInt7105 > i_52_; i_52_++) {
                        if (Class320_Sub21.aBooleanArray8403[i_52_]) {
                            Class320_Sub21.aBooleanArray8403[i_52_] = false;
                            Class134_Sub4.aRectangleArray9048[i++] = Node_Sub38_Sub28.aRectangleArray10404[i_52_];
                        }
                    }
                    try {
                        if (Class71.aBoolean967) {
                            Class371.method4092(i, Class134_Sub4.aRectangleArray9048);
                        } else {
                            Class93.aGraphicsToolkit1241.method1246(i,
                                    Class134_Sub4.aRectangleArray9048);
                        }
                    } catch (Exception_Sub1 exception_sub1) {
                        /* empty */
                    }
                } else if (!RuntimeException_Sub1.method4207(Class151.anInt1843)) {
                    for (int i = 0; i < Node_Sub11.anInt7105; i++)
                        Class320_Sub21.aBooleanArray8403[i] = false;
                    try {
                        if (Class71.aBoolean967) {
                            Class188_Sub1_Sub2.method1900();
                        } else {
                            Class93.aGraphicsToolkit1241.method1241();
                        }
                    } catch (Exception_Sub1 exception_sub1) {
                        ClanChat.method507(exception_sub1,
                                exception_sub1.getMessage() + " (Recovered) " + method100(), -122);
                        Translation.method300(0, false);
                    }
                }
                Node_Sub39.method2922();
                int i = Class213.aNode_Sub27_2512.aClass320_Sub21_7293.method3762();
                if (i == 0) {
                    Class262_Sub22.method3208(15L);
                } else if (i == 1) {
                    Class262_Sub22.method3208(10L);
                } else if (i == 2) {
                    Class262_Sub22.method3208(5L);
                } else if (i == 3) {
                    Class262_Sub22.method3208(2L);
                }
                if (Node_Sub38_Sub31.aBoolean10418) {
                    Class326.method3820();
                }
                if (Class213.aNode_Sub27_2512.aClass320_Sub10_7300.method3718() == 1 && Class151.anInt1843 == 3
                        && Class320_Sub15.WINDOWS_PANE_ID != -1) {
                    Class213.aNode_Sub27_2512.method2690(41, 0, Class213.aNode_Sub27_2512.aClass320_Sub10_7300);
                    Node_Sub38_Sub31.method2893(1);
                }
                if (b < -79) {
                    return;
                }
                aClass192_5485 = null;
            }
        } catch (RuntimeException runtimeexception) {
            runtimeexception.printStackTrace();
            throw Class126.method1537(runtimeexception, "Client.EA(" + b + ')');
        }
    }

    private void method119(int i) {
        Node_Sub36_Sub3.aClass241_10059 = null;
        Class267.aClass266_3449.anInt3393 = i;
        Node_Sub38_Sub33.aBufferedConnection10440 = null;
        Class267.aClass266_3449.anInt3394++;
        Class290_Sub2.anInt8069 = 0;
        anInt5483++;
    }

    final void method97() {
        try {
            anInt5468++;
            if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 2) {
                try {
                    method120(71);
                } catch (Throwable throwable) {
                    ClanChat.method507(throwable,
                            throwable.getMessage() + " (Recovered) " + method100(), -116);
                    Node_Sub12.aBoolean5456 = true;
                    Translation.method300(0, false);
                }
            } else {
                method120(124);
            }
        } catch (RuntimeException runtimeexception) {
            runtimeexception.printStackTrace();
            throw Class126.method1537(runtimeexception, "Client.P(-23548)");
        }
    }

    private void method120(int i) {
        anInt5466++;
        if (Class151.anInt1843 != 16) {
            Class174.clientCycle++;
            if (Class174.clientCycle % 1000 == 1) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                ClientScript.anInt9496 = gregoriancalendar.get(Calendar.HOUR_OF_DAY) * 600 + (gregoriancalendar.get(Calendar.MINUTE) * 10
                        + gregoriancalendar.get(Calendar.SECOND) / 6);
                ReferenceTable.aRandom283.setSeed(ClientScript.anInt9496);
            }
            Class218.aClass123_2566.method1510(-108);
            Class218.aClass123_2560.method1510(-74);
            method111();
            if (Class144_Sub1.aClass232_6802 != null) {
                Class144_Sub1.aClass232_6802.method2140();
            }
            Class319.method3671(8);
            Class194_Sub3_Sub1.method1982(0);
            Class175.aClass291_2100.method3452();
            Class106.aClass93_1356.method1038();
            if (Class93.aGraphicsToolkit1241 != null) {
                Class93.aGraphicsToolkit1241.e((int) Class313.method3650());
            }
            Class378.method4134((byte) 94);
            Class357.anInt4429 = 0;
            Class320_Sub8.anInt8281 = 0;
            for (Interface21 interface21 = Class175.aClass291_2100.method3449();
                 interface21 != null; interface21 = Class175.aClass291_2100.method3449()) {
                int i_53_ = interface21.method79(false);
                if (i_53_ == 2 || i_53_ == 3) {
                    int i_54_ = interface21.method77(-24069);
                    if (!Class350.method3993()
                            || i_54_ != 96 && i_54_ != 167 && i_54_ != 178) {
                        if (Class357.anInt4429 < 128) {
                            Class320_Sub7.anInterface21Array8275[Class357.anInt4429] = interface21;
                            Class357.anInt4429++;
                        }
                    } else if (GLXToolkit.method1401()) {
                        Class336_Sub2.method3893();
                    } else {
                        Class244.method3065();
                    }
                } else if (i_53_ == 0 && Class320_Sub8.anInt8281 < 75) {
                    Class66_Sub2_Sub1.anInterface21Array10578[Class320_Sub8.anInt8281] = interface21;
                    Class320_Sub8.anInt8281++;
                }
            }
            Class339_Sub8.anInt8739 = 0;
            for (Node_Sub5 node_sub5 = Class106.aClass93_1356.method1048((byte) -55);
                 node_sub5 != null; node_sub5 = Class106.aClass93_1356.method1048((byte) -89)) {
                int i_55_ = node_sub5.method2267();
                if (i_55_ == -1) {
                    Node_Sub38_Sub35.aClass312_10452.method3625(node_sub5);
                } else if (i_55_ == 6) {
                    Class339_Sub8.anInt8739 += node_sub5.method2271();
                } else if (Node_Sub38_Sub11.method2828(i_55_, 0)) {
                    GraphicsToolkit.aClass312_1545.method3625(node_sub5);
                    if (GraphicsToolkit.aClass312_1545.method3615(-107) > 10) {
                        GraphicsToolkit.aClass312_1545.method3619(-90);
                    }
                }
            }
            if (GLXToolkit.method1401()) {
                Class262_Sub23.method3215();
            }
            if (RuntimeException_Sub1.method4207(Class151.anInt1843)) {
                Node_Sub38_Sub38.method2914();
                Node_Sub38_Sub10.method2824();
            } else if (Class315.method3655(Class151.anInt1843, 128)) {
                r_Sub2.method2376();
            }
            if (!Class26.method311(Class151.anInt1843) || Class315.method3655(Class151.anInt1843, 128)) {
                if (Class329.method3833(Class151.anInt1843)
                        && !Class315.method3655(Class151.anInt1843, 128)) {
                    method110();
                    Class195.login((byte) 119);
                } else if (Class151.anInt1843 == 13) {
                    Class195.login((byte) 101);
                } else if (!Class58.method577(Class151.anInt1843)
                        || Class315.method3655(Class151.anInt1843, 128)) {
                    if (Class151.anInt1843 == 14 || Class151.anInt1843 == 15) {
                        Class195.login((byte) 93);
                        if (Class339_Sub2.anInt8653 != -3 && Class339_Sub2.anInt8653 != 2
                                && Class339_Sub2.anInt8653 != 15) {
                            if (Class151.anInt1843 == 15) {
                                Class270_Sub2_Sub1.anInt10548 = Class339_Sub2.anInt8653;
                                Node_Sub38_Sub34.anInt10447 = Class187.anInt2276;
                                Class339_Sub5.anInt8684 = GameStub.anInt45;
                                if (Class382.aBoolean5260) {
                                    Class188_Sub1_Sub2.method1899(Class247.aClass197_3115.id,
                                            Class247.aClass197_3115.ipadress);
                                    Class218.aClass123_2566.aClass365_1557 = null;
                                    Class48.method478(14, (byte) 98);
                                } else {
                                    Class127.method1542(Class248.aBoolean3146);
                                }
                            } else {
                                Class127.method1542(false);
                            }
                        }
                    }
                } else {
                    Node_Sub38_Sub38.method2916();
                }
            } else {
                method110();
                Class45.method465();
                Class195.login((byte) 104);
            }
            Class201.method2023(Class93.aGraphicsToolkit1241);
            if (i > 49) {
                GraphicsToolkit.aClass312_1545.method3619(-110);
            }
        }
    }

    final void method99() {
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
        Node_Sub38_Sub8_Sub1.method2817(new int[]{20, 260}, new int[]{1000, 100});
        if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
            Class93.aByteArrayArray1244 = new byte[50][];
        }
        Class213.aNode_Sub27_2512 = Node_Sub54.method2983();
        if (Node_Sub38_Sub1.aClass329_10086 == Class240.aClass329_2943) {
            Class320_Sub24.aClass197_8443.ipadress = Objects.requireNonNull(this.getCodeBase()).getHost();
        } else if (Node_Sub13.method2548(Node_Sub38_Sub1.aClass329_10086)) {
            Class320_Sub24.aClass197_8443.ipadress = Objects.requireNonNull(this.getCodeBase()).getHost();
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
        Class175.aClass291_2100 = Class361.method4047(Node_Sub38_Sub20.aCanvas10309);
        Class106.aClass93_1356 = Class328_Sub1.method3830(Node_Sub38_Sub20.aCanvas10309);
        try {
            if (Class240.aSignLink2946.aFileOnDisk3979 != null) {
                Class99.aSeekableFile1289 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3979, 5200);
                for (int i_56_ = 0; i_56_ < Class150_Sub1.aSeekableFileArray8953.length; i_56_++)
                    Class150_Sub1.aSeekableFileArray8953[i_56_] = new SeekableFile
                            (Class240.aSignLink2946.aFileOnDiskArray4003[i_56_], 6000);
                Class3.aSeekableFile5156 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3992, 6000);
                Class194_Sub2.aClass6_6899 = new MainFile(255, Class99.aSeekableFile1289, Class3.aSeekableFile5156,
                        500000);
                Class366.aSeekableFile4529 = new SeekableFile(Class240.aSignLink2946.aFileOnDisk3994, 24);
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
        EntityNode_Sub6.aString5991 = Translation.loading_translation.getTranslatedString(Class35.language);
    }

    static void method121(IComponentDefinitions[] widgets, int i, int i_58_, int i_59_, int i_60_, int i_61_,
                          int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
        for (IComponentDefinitions widget : widgets) {
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
                    i_71_ = Math.max(i_69_, i_58_);
                    i_72_ = Math.max(i_70_, i_59_);
                    i_73_ = Math.min(i_75_, i_60_);
                    i_74_ = Math.min(i_76_, i_61_);
                }
                if (widget.type != 0 && !widget.hasScripts && method113(widget).settingsHash == 0
                        && widget != Class186.aWidget2257 && widget.anInt4814 != Class264.anInt3355
                        && widget.anInt4814 != Class332.anInt4144 && widget.anInt4814 != Class200_Sub1.anInt5146
                        && widget.anInt4814 != Class107.anInt1366) {
                    if (i_71_ < i_73_ && i_72_ < i_74_) {
                        Class286.method3395(widget);
                    }
                } else if (!method112(widget)) {
                    int i_77_ = 0;
                    int i_78_ = 0;
                    if (Class71.aBoolean967) {
                        i_77_ = Class67.method733(-81);
                        i_78_ = Class226.method2112();
                    }
                    if (widget == Class58.aWidget861 && Class308.method3585(Class58.aWidget861, false) != null) {
                        Class372.aBoolean4599 = true;
                        Node_Sub25_Sub4.anInt10005 = i_69_;
                        Class60.anInt880 = i_70_;
                    }
                    if (widget.aBoolean4802 || i_71_ < i_73_ && i_72_ < i_74_) {
                        if (widget.aBoolean4858 && i_66_ >= i_71_ && i_67_ >= i_72_ && i_66_ < i_73_ && i_67_ < i_74_) {
                            for (Node_Sub37 node_sub37 = (Node_Sub37) Class275.aClass312_5419.method3613();
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
                                Node_Sub7.method2421();
                            }
                        }
                        boolean bool =
                                widget.aBoolean4782 && widget.type == 5 && widget.anInt4757 == 0 && widget.anInt4848 < 0
                                        && widget.anInt4718 == -1 && widget.anInt4694 == -1 && !widget.aBoolean4861
                                        && widget.anInt4728 == 0;
                        boolean bool_79_ = false;
                        if (Class106.aClass93_1356.method1050((byte) -21) + i_77_ >= i_71_
                                && Class106.aClass93_1356.method1051() + i_78_ >= i_72_
                                && Class106.aClass93_1356.method1050((byte) -27) + i_77_ < i_73_
                                && Class106.aClass93_1356.method1051() + i_78_ < i_74_) {
                            if (bool) {
                                Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241, 1);
                                if (class127 == null || class127.anInt1636 != widget.anInt4809
                                        || class127.anInt1637 != widget.anInt4695) {
                                    bool_79_ = true;
                                } else {
                                    int i_80_ = Class106.aClass93_1356.method1050((byte) -98) + i_77_ - i_69_;
                                    int i_81_ = Class106.aClass93_1356.method1051() + i_78_ - i_70_;
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
                            Class225.method2107(widget, i_66_ - i_69_, i_66_ - i_70_);
                        }
                        boolean bool_83_ = Class106.aClass93_1356.method1039(-85) && bool_79_;
                        boolean bool_84_ = false;
                        Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613();
                        if (node_sub5 != null && node_sub5.method2267() == 0 && node_sub5.method2270() >= i_71_
                                && node_sub5.method2272() >= i_72_ && node_sub5.method2270() < i_73_
                                && node_sub5.method2272() < i_74_) {
                            if (bool) {
                                Class127 class127 = widget.method4145(Class93.aGraphicsToolkit1241, 1);
                                if (class127 == null || class127.anInt1636 != widget.anInt4809
                                        || class127.anInt1637 != widget.anInt4695) {
                                    bool_84_ = true;
                                } else {
                                    int i_85_ = node_sub5.method2270() - i_69_;
                                    int i_86_ = node_sub5.method2272() - i_70_;
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
                        if (widget.aByteArray4806 != null && !GLXToolkit.method1401()) {
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
                                            Node_Sub38_Sub23.method2863();
                                            InterfaceSettings node_sub35 = method113(widget);
                                            Node_Sub38_Sub18.method2846(node_sub35.method2743(-25), (byte) -108,
                                                    widget, node_sub35.anInt7413);
                                            Class84.aString1148 = Class205.method2033(widget);
                                            if (Class84.aString1148 == null) {
                                                Class84.aString1148 = "Null";
                                            }
                                            Class66.aString5177 = widget.aString4779 + "<col=ffffff>";
                                        }
                                        int i_89_ = widget.anIntArray4705[i_88_];
                                        if (widget.anIntArray4772 == null) {
                                            widget.anIntArray4772 = new int[widget.aByteArray4806.length];
                                        }
                                        if (i_89_ == 0) {
                                            widget.anIntArray4772[i_88_] = 2147483647;
                                        } else {
                                            widget.anIntArray4772[i_88_] = Class174.clientCycle + i_89_;
                                        }
                                    }
                                }
                            }
                        }
                        if (bool_84_) {
                            Class317.method3665(
                                    i_78_ + node_sub5.method2272() - i_70_, widget,
                                    i_77_ + node_sub5.method2270() - i_69_);
                        }
                        if (Class58.aWidget861 != null && Class58.aWidget861 != widget && bool_79_
                                && method113(widget).method2747()) {
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
                                Class275.aClass312_5419.method3625(node_sub37);
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
                                                (Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(), 51,
                                                        widget.anInt4695, Class93.aGraphicsToolkit1241);
                                    }
                                    if (widget.anInt4814 == Class200_Sub1.anInt5146) {
                                        if (!Class213.aBoolean2510 && i_66_ >= i_71_ && i_67_ >= i_72_ && i_66_ < i_73_
                                                && i_67_ < i_74_) {
                                            Class78.method776(i_65_, i_64_, Class93.aGraphicsToolkit1241);
                                            for (EntityNode_Sub1 entitynode_sub1 = (EntityNode_Sub1)
                                                    Class82.aClass103_1120.method1113((byte) 112);
                                                 entitynode_sub1
                                                         != null; entitynode_sub1 = (EntityNode_Sub1)
                                                    Class82.aClass103_1120.method1108(94)) {
                                                if (i_66_ >= entitynode_sub1.anInt5922
                                                        && i_66_ < entitynode_sub1.anInt5923
                                                        && i_67_ >= entitynode_sub1.anInt5928
                                                        && i_67_ < entitynode_sub1.anInt5926) {
                                                    Node_Sub7.method2421();
                                                    Class251.method3097(entitynode_sub1.anActor5925);
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
                                                IComponentDefinitions widget_101_ = Node_Sub3.method2169(
                                                        Class46.anInt681, Node_Sub15_Sub9.anInt9839);
                                                if (widget_101_ == null) {
                                                    Node_Sub38_Sub23.method2863();
                                                } else {
                                                    Node_Sub32.method2731(false, widget.anInt4718, 1L, i_98_, i_99_,
                                                            Class84.aString1148, 21, true, Class201.anInt2444, " ->",
                                                            widget.anInt4687 | widget.ihash, true);
                                                }
                                            } else {
                                                if (Class209.aClass353_2483 == Class169_Sub4.aClass353_8825) {
                                                    Node_Sub32.method2731(false, -1, 1L, i_98_, i_99_,
                                                            Translation.aTranslation_390.getTranslatedString(Class35.language), 11,
                                                            true, -1, "", 0L, true);
                                                }
                                                Node_Sub32.method2731(false, -1, 1L, i_98_, i_99_,
                                                        Class173.aString2085, 58, true, Class173.anInt2086, "", 0L,
                                                        true);
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
                                        int i_102_ = (int) ((double) (i_77_ + node_sub5.method2270() - i_69_
                                                - widget.anInt4809 / 2) * 2.0
                                                / (double) Class20.aFloat327);
                                        int i_103_ = (int) -((double) (i_78_ + node_sub5.method2272() - i_70_
                                                - widget.anInt4695 / 2) * 2.0
                                                / (double) Class20.aFloat327);
                                        int i_104_ = Class94.anInt1250 + i_102_ + Class20.anInt354;
                                        int i_105_ = Class327.anInt5360 + i_103_ + Class20.anInt343;
                                        CacheNode_Sub11 cachenode_sub11 = Class105.method1117(117);
                                        if (cachenode_sub11 != null) {
                                            int[] is = new int[3];
                                            cachenode_sub11.method2340(i_105_, i_104_, is);
                                            if (is != null) {
                                                if (Class175.aClass291_2100.method3450(118, 82)
                                                        && Class339_Sub7.rights > 0) {
                                                    Class331.method3843(is[0], is[2], is[1]);
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
                                            Class83.anInt5179 = Class106.aClass93_1356.method1051();
                                        }
                                    } else if (bool_83_ && Class290_Sub6.anInt8116 > 0) {
                                        if (Class290_Sub6.anInt8116 == 1 && (Node_Sub5_Sub2.anInt9412
                                                != Class106.aClass93_1356.method1050(
                                                (byte) -56)
                                                || Class83.anInt5179
                                                != Class106.aClass93_1356.method1051
                                                ())) {
                                            Class188_Sub2.anInt6869 = Class94.anInt1250;
                                            Class134_Sub2.anInt9021 = Class327.anInt5360;
                                            Class290_Sub6.anInt8116 = 2;
                                        }
                                        if (Class290_Sub6.anInt8116 == 2) {
                                            aa.aBoolean104 = true;
                                            Node_Sub51.method2968(Class188_Sub2.anInt6869 + (int) (
                                                    (double) (Node_Sub5_Sub2.anInt9412
                                                            - Class106.aClass93_1356.method1050((byte) -120)) * 2.0
                                                            / (double) Class20.aFloat329));
                                            Class103.method1109(false, Class134_Sub2.anInt9021 - (int) (
                                                    (double) (Class83.anInt5179
                                                            - Class106.aClass93_1356.method1051()) * 2.0
                                                            / (double) Class20.aFloat329));
                                        }
                                    } else {
                                        if (Class290_Sub6.anInt8116 > 0 && !aa.aBoolean104) {
                                            if ((Class121.anInt1521 == 1 || Node_Sub16.method2594())
                                                    && Class315.anInt4035 > 2) {
                                                Class244.method3064((byte) -73, Node_Sub5_Sub2.anInt9412,
                                                        Class83.anInt5179);
                                            } else if (Class46.method469()) {
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
                                                i_78_ + Class106.aClass93_1356.method1051()
                                                        - i_70_, widget.anInt4695);
                                    }
                                    continue;
                                }
                                if (widget.anInt4814 == Class332.anInt4144) {
                                    CacheNode_Sub4.method2305(i_69_, i_70_, widget);
                                    continue;
                                }
                            }
                            if (!widget.aBoolean4730 && bool_84_) {
                                widget.aBoolean4730 = true;
                                if (widget.anObjectArray4774 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 = i_77_ + node_sub5.method2270() - i_69_;
                                    node_sub37.anInt7430 = i_78_ + node_sub5.method2272() - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4774;
                                    Class275.aClass312_5419.method3625(node_sub37);
                                }
                            }
                            if (widget.aBoolean4730 && bool_83_ && widget.anObjectArray4803 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -99) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                node_sub37.parameters = widget.anObjectArray4803;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (widget.aBoolean4730 && !bool_83_) {
                                widget.aBoolean4730 = false;
                                if (widget.anObjectArray4680 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -21) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4680;
                                    Node_Sub5.aClass312_7028.method3625(node_sub37);
                                }
                            }
                            if (bool_83_ && widget.anObjectArray4856 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -53) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                node_sub37.parameters = widget.anObjectArray4856;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (!widget.aBoolean4819 && bool_79_) {
                                widget.aBoolean4819 = true;
                                if (widget.anObjectArray4706 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -66) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4706;
                                    Class275.aClass312_5419.method3625(node_sub37);
                                }
                            }
                            if (widget.aBoolean4819 && bool_79_ && widget.anObjectArray4834 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aBoolean7433 = true;
                                node_sub37.aWidget7437 = widget;
                                node_sub37.anInt7439 = i_77_ + Class106.aClass93_1356.method1050((byte) -33) - i_69_;
                                node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                node_sub37.parameters = widget.anObjectArray4834;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (widget.aBoolean4819 && !bool_79_) {
                                widget.aBoolean4819 = false;
                                if (widget.anObjectArray4818 != null) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aBoolean7433 = true;
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.anInt7439 =
                                            i_77_ + Class106.aClass93_1356.method1050((byte) -119) - i_69_;
                                    node_sub37.anInt7430 = i_78_ + Class106.aClass93_1356.method1051() - i_70_;
                                    node_sub37.parameters = widget.anObjectArray4818;
                                    Node_Sub5.aClass312_7028.method3625(node_sub37);
                                }
                            }
                            if (widget.anObjectArray4701 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4701;
                                CacheNode_Sub14_Sub2.aClass312_11039.method3625(node_sub37);
                            }
                            if (widget.anObjectArray4688 != null && Class36.anInt548 > widget.anInt4813) {
                                if (widget.anIntArray4829 == null || Class36.anInt548 - widget.anInt4813 > 32) {
                                    Node_Sub37 node_sub37 = new Node_Sub37();
                                    node_sub37.aWidget7437 = widget;
                                    node_sub37.parameters = widget.anObjectArray4688;
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_16_:
                                    for (int i_106_ = widget.anInt4813; i_106_ < Class36.anInt548; i_106_++) {
                                        int i_107_ = Node_Sub38_Sub11.anIntArray10217[i_106_ & 0x1f];
                                        for (int i_108_ = 0; i_108_ < widget.anIntArray4829.length; i_108_++) {
                                            if (widget.anIntArray4829[i_108_] == i_107_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4688;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_17_:
                                    for (int i_109_ = widget.anInt4801; i_109_ < Class244.anInt3083; i_109_++) {
                                        int i_110_ = CacheNode_Sub10.anIntArray9520[i_109_ & 0x1f];
                                        for (int i_111_ = 0; i_111_ < widget.anIntArray4805.length; i_111_++) {
                                            if (widget.anIntArray4805[i_111_] == i_110_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4775;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_18_:
                                    for (int i_112_ = widget.anInt4719; i_112_ < Class341.anInt4231; i_112_++) {
                                        int i_113_ = Class75.anIntArray1005[i_112_ & 0x1f];
                                        for (int i_114_ = 0; i_114_ < widget.anIntArray4838.length; i_114_++) {
                                            if (widget.anIntArray4838[i_114_] == i_113_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4807;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_19_:
                                    for (int i_115_ = widget.anInt4747; i_115_ < Mobile_Sub3.anInt10784; i_115_++) {
                                        int i_116_ = Class169.anIntArray4965[i_115_ & 0x1f];
                                        for (int i_117_ = 0; i_117_ < widget.anIntArray4833.length; i_117_++) {
                                            if (widget.anIntArray4833[i_117_] == i_116_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4742;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_20_:
                                    for (int i_118_ = widget.anInt4810; i_118_ < Class197.anInt2423; i_118_++) {
                                        int i_119_ = Class262_Sub15.anIntArray7821[i_118_ & 0x1f];
                                        for (int i_120_ = 0; i_120_ < widget.anIntArray4789.length; i_120_++) {
                                            if (widget.anIntArray4789[i_120_] == i_119_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4788;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                } else {
                                    while_21_:
                                    for (int i_121_ = widget.anInt4780; i_121_ < Class377.anInt4664; i_121_++) {
                                        int i_122_ = Class143.anIntArray1764[i_121_ & 0x1f];
                                        for (int i_123_ = 0; i_123_ < widget.anIntArray4812.length; i_123_++) {
                                            if (widget.anIntArray4812[i_123_] == i_122_) {
                                                Node_Sub37 node_sub37 = new Node_Sub37();
                                                node_sub37.aWidget7437 = widget;
                                                node_sub37.parameters = widget.anObjectArray4857;
                                                Class275.aClass312_5419.method3625(node_sub37);
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
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Class181.anInt2150 > widget.anInt4783 && widget.anObjectArray4846 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4846;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Node_Sub36_Sub2.anInt10046 > widget.anInt4783 && widget.anObjectArray4828 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4828;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Class213.anInt2511 > widget.anInt4783 && widget.anObjectArray4799 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4799;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Class230_Sub1.anInt9012 > widget.anInt4783 && widget.anObjectArray4756 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4756;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Class278.anInt3546 > widget.anInt4783 && widget.anObjectArray4745 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4745;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                            if (Node_Sub23_Sub1.anInt9926 > widget.anInt4783 && widget.anObjectArray4862 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4862;
                                Class275.aClass312_5419.method3625(node_sub37);
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
                                    Class275.aClass312_5419.method3625(node_sub37);
                                }
                            }
                            if (Class146.aBoolean1816 && widget.anObjectArray4854 != null) {
                                Node_Sub37 node_sub37 = new Node_Sub37();
                                node_sub37.aWidget7437 = widget;
                                node_sub37.parameters = widget.anObjectArray4854;
                                Class275.aClass312_5419.method3625(node_sub37);
                            }
                        }
                        if (widget.type == 5 && widget.anInt4848 != -1) {
                            widget.method4157(CacheNode_Sub6.aClass57_9480, Class171.aClass278_2062)
                                    .method1225(Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(), 83,
                                            widget.anInt4695, Class93.aGraphicsToolkit1241);
                        }
                        Class286.method3395(widget);
                        if (widget.type == 0) {
                            method121(widgets, widget.ihash, i_71_, i_72_, i_73_, i_74_,
                                    i_69_ - widget.anInt4817, i_70_ - widget.anInt4734, i_64_, i_65_, i_66_, i_67_);
                            if (widget.aWidgetArray4793 != null) {
                                method121(widget.aWidgetArray4793, widget.ihash, i_71_, i_72_, i_73_, i_74_,
                                        i_69_ - widget.anInt4817, i_70_ - widget.anInt4734, i_64_, i_65_, i_66_, i_67_);
                            }
                            Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, widget
                                    .ihash);
                            if (node_sub2 != null) {
                                if (Class209.aClass353_2483 == Node_Sub38_Sub34.aClass353_10443 && node_sub2.cliped == 0
                                        && !Class213.aBoolean2510 && bool_79_ && !Class54.aBoolean817) {
                                    Node_Sub7.method2421();
                                }
                                BufferedConnection.method422(i_74_, i_70_, i_72_, i_65_, i_67_, i_73_, i_69_,
                                        node_sub2.interfaceId, i_64_, i_66_, i_71_);
                            }
                        }
                    }
                }
            }
        }
    }

    static void method122(int i) {
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
                    actor = ((Node_Sub41) Objects.requireNonNull(Class12.aHashTable187.method1518(3512, Class54.LocalNPCsIndexes[i_127_
                            -
                            i_125_]))).aNpc7518;
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

    final String method100() {
        anInt5477++;
        StringBuilder string = null;
        try {
            string = new StringBuilder("[1)" + Node_Sub53.gameSceneBaseX + "," + Class320_Sub4.gameSceneBaseY + ","
                    + Node_Sub54.GAME_SCENE_WDITH + "," + Class377_Sub1.GAME_SCENE_HEIGHT + "|");
            if (Class295.myPlayer != null) {
                string.append("2)").append(CacheNode_Sub20_Sub1.myPlayerPlane).append(",").append(Class295.myPlayer.scenePositionXQueue[0]
                        + Node_Sub53.gameSceneBaseX).append(",").append(Class320_Sub4.gameSceneBaseY + Class295.myPlayer.scenePositionYQueue[0]).append("|");
            }
            string.append("3)").append(Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791()).append("|4)").append(Class213.aNode_Sub27_2512.aClass320_Sub13_7284.method3734()).append("|5)").append(Class188_Sub2_Sub1.getDisplayMode(3)).append("|6)").append(Class360.screenWidth).append(",").append(Class205.screenHeight).append("|");
            string.append("7)").append(Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773()).append("|");
            string.append("8)").append(Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730()).append("|");
            string.append("9)").append(Class213.aNode_Sub27_2512.aClass320_Sub26_7269.method3779()).append("|");
            string.append("10)").append(Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false)).append("|");
            string.append("11)").append(Class213.aNode_Sub27_2512.aClass320_Sub20_7306.method3758()).append("|");
            string.append("12)").append(Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751()).append("|");
            string.append("13)").append(Class201.anInt2446).append("|");
            string.append("14)").append(Class151.anInt1843);
            if (Node_Sub23.aNode_Sub39_7201 != null) {
                string.append("|15)").append(Node_Sub23.aNode_Sub39_7201.anInt7484);
            }
            try {
                if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 2) {
                    Class<?> var_class = Class.forName("java.lang.ClassLoader");
                    Field field = var_class.getDeclaredField("nativeLibraries");
                    Class<?> var_class_138_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_138_.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    method.invoke(field, Boolean.TRUE);
                    Vector<?> vector = (Vector<?>) field.get((
                            aClass5486 == null ? aClass5486 = method123() : aClass5486).getClassLoader());
                    for (int i_139_ = 0; vector.size() > i_139_; i_139_++) {
                        try {
                            Object object = vector.elementAt(i_139_);
                            Field field_140_ = object.getClass().getDeclaredField("name");
                            method.invoke(field_140_, Boolean.TRUE);
                            try {
                                String string_141_ = (String) field_140_.get(object);
                                if (string_141_ != null && string_141_.contains("sw3d.dll")) {
                                    Field field_142_ = object.getClass().getDeclaredField("handle");
                                    method.invoke(field_142_, Boolean.TRUE);
                                    string.append("|16)").append(Long.toHexString(field_142_.getLong(object)));
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
            string.append("]");
        } catch (Throwable throwable) {
            /* empty */
        }
        return string.toString();
    }

    public final void init() {
        anInt5476++;
        if (this.method95()) {
            Class320_Sub24.aClass197_8443 = new Class197();
            Class320_Sub24.aClass197_8443.id = Integer.parseInt(Objects.requireNonNull(this.getParameter("worldid")));
            Node_Sub15_Sub13.aClass197_9871 = new Class197();
            Node_Sub15_Sub13.aClass197_9871.id = Integer.parseInt(Objects.requireNonNull(this.getParameter("lobbyid")));
            Node_Sub15_Sub13.aClass197_9871.ipadress = this.getParameter("lobbyaddress");
            Node_Sub38_Sub1.aClass329_10086 = Class250.method3095(Integer.parseInt(Objects.requireNonNull(this.getParameter("modewhere"))));
            if (CacheNode_Sub2.aClass329_9436 == Node_Sub38_Sub1.aClass329_10086) {
                Node_Sub38_Sub1.aClass329_10086 = Class229.aClass329_2730;
            } else if (!Node_Sub13.method2548(Node_Sub38_Sub1.aClass329_10086)
                    && Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
                Node_Sub38_Sub1.aClass329_10086 = Class240.aClass329_2943;
            }
            OutcommingPacket.aClass129_4051 = Class331.method3841(Integer.parseInt(Objects.requireNonNull(this.getParameter
                    ("modewhat"))));
            if (Class123.aClass129_1564 != OutcommingPacket.aClass129_4051
                    && OutcommingPacket.aClass129_4051 != Node_Sub41.aClass129_7515
                    && Class194_Sub3.aClass129_6901 != OutcommingPacket.aClass129_4051) {
                OutcommingPacket.aClass129_4051 = Class194_Sub3.aClass129_6901;
            }
            try {
                Class35.language = Integer.parseInt(Objects.requireNonNull(this.getParameter("lang")));
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
                switch (string_145_) {
                    case "0":
                        Class209.aClass353_2483 = Node_Sub38_Sub34.aClass353_10443;
                        break;
                    case "1":
                        Class209.aClass353_2483 = Class169_Sub4.aClass353_8825;
                        break;
                    case "2":
                        Class209.aClass353_2483 = Node_Sub38_Sub22.aClass353_10323;
                        break;
                    case "3":
                        Class209.aClass353_2483 = Node_Sub25_Sub4.aClass353_10010;
                        break;
                }
            }
            try {
                Class170.anInt2056 = Integer.parseInt(Objects.requireNonNull(this.getParameter("affid")));
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
            Class178.anInt2118 = Integer.parseInt(Objects.requireNonNull(this.getParameter("colourid")));
            if (Class178.anInt2118 < 0 || Class178.anInt2118 >= Class382.aColorArray5258.length) {
                Class178.anInt2118 = 0;
            }
            if (Integer.parseInt(Objects.requireNonNull(this.getParameter("sitesettings_member"))) == 1) {
                Class64.aBoolean5046 = Class262_Sub17.aBoolean7833 = true;
            }
            String string_147_ = this.getParameter("frombilling");
            if (string_147_ != null && string_147_.equals("true")) {
                Mobile_Sub1.aBoolean10961 = true;
            }
            String string_148_ = this.getParameter("sskey");
            if (string_148_ != null) {
                Class143.aByteArray1773 = Class57.method571(Class379.method4161(string_148_));
                if (Objects.requireNonNull(Class143.aByteArray1773).length < 16) {
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
            if (Node_Sub38_Sub18.aString10283 != null && Node_Sub38_Sub18.aString10283.length() > 50) {
                Node_Sub38_Sub18.aString10283 = null;
            }
            if (Node_Sub38_Sub34.aClass353_10443 == Class209.aClass353_2483) {
                Node_Sub38_Sub12.anInt10225 = 765;
                Class257.anInt3244 = 503;
            } else if (Class209.aClass353_2483 == Class169_Sub4.aClass353_8825) {
                Class257.anInt3244 = 480;
                Node_Sub38_Sub12.anInt10225 = 640;
            }
            String string_152_ = this.getParameter("hc");
            if (string_152_ != null && string_152_.equals("1")) {
                Node_Sub32.aBoolean7379 = true;
            }
            Class158.aClient1983 = this;
            this.method92(Node_Sub38_Sub12.anInt10225, OutcommingPacket.aClass129_4051.method1554()
                            + 32, Class209.aClass353_2483.aString4341,
                    Class257.anInt3244);
        }
    }

    final void method102() {
        try {
            anInt5474++;
            if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 2) {
                try {
                    method118((byte) -89);
                } catch (Throwable throwable) {
                    ClanChat.method507(throwable, throwable.getMessage() + " (Recovered) " + method100(), -118);
                    Node_Sub12.aBoolean5456 = true;
                    Translation.method300(0, false);
                }
            } else {
                method118((byte) -108);
            }
        } catch (RuntimeException runtimeexception) {
            runtimeexception.printStackTrace();
            throw Class126.method1537(runtimeexception, "Client.Q(92)");
        }
    }

    /*synthetic*/
    static Class<?> method123() {
        Class<?> var_class;
        try {
            var_class = Class.forName("Client");
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
