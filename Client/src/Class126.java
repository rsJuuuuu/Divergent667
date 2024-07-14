/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Objects;

public class Class126 {
    static int anInt1611;
    static int anInt1613;
    static int anInt1614;
    static int anInt1615;
    static int anInt1616;
    static int anInt1618;
    static int anInt1619;
    static Class126 aClass126_1620 = new Class126(0, 3, Class372.aClass372_4598);
    protected int anInt1621;
    static int anInt1622;
    static int anInt1623;
    protected int anInt1624;
    static Class126 aClass126_1625 = new Class126(1, 3, Class372.aClass372_4598);
    static Class126 aClass126_1626 = new Class126(2, 4, Class372.aClass372_4594);
    static Class126 aClass126_1627 = new Class126(3, 1, Class372.aClass372_4598);
    static Class126 aClass126_1628 = new Class126(4, 2, Class372.aClass372_4598);
    static Class126 aClass126_1629 = new Class126(5, 3, Class372.aClass372_4598);
    static Class126 aClass126_1630 = new Class126(6, 4, Class372.aClass372_4598);
    static int anInt1631 = Node_Sub38_Sub20.method2855(16, (byte) -71);
    static OutcommingPacket aClass318_1632 = new OutcommingPacket(34, 4);
    static IncommingPacket aClass192_1633 = new IncommingPacket(34, 6);
    static int anInt1634;

    static void method1532() {
        if (Class93.aGraphicsToolkit1241 != null) {
            if (Class71.aBoolean967) {
                Class94.method1065();
            }
            Node_Sub36_Sub3.aClass179_10058.method1815();
            Class320_Sub26.method3777();
            Node_Sub18.method2606();
            GameStub.method101();
            Class262_Sub22.method3206();
            CacheNode_Sub4.method2304();
            Class48.method481();
            Node_Sub36_Sub2.method2761();
            Class113.method1150();
            Animable_Sub1.method825((byte) -68);
            Class262_Sub23.method3212(false);
            for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
                Player player = Class270_Sub2.LOCAL_PLAYERS[i_0_];
                if (player != null) {
                    Arrays.fill(player.aDrawableModelArray10909, null);
                }
            }
            for (int i_2_ = 0; Node_Sub32.cachedNPCcsCount > i_2_; i_2_++) {
                Npc npc = Class314.LocalNPCs[i_2_].aNpc7518;
                if (npc != null) {
                    Arrays.fill(npc.aDrawableModelArray10909, null);
                }
            }
            Node_Sub5.aClass336_7032 = null;
            Class290_Sub6.aClass336_8114 = null;
            Class93.aGraphicsToolkit1241.method1233();
            Class93.aGraphicsToolkit1241 = null;
        }
        anInt1623++;
    }

    public static void method1533() {
        aClass192_1633 = null;
        aClass126_1629 = null;
        aClass126_1628 = null;
        aClass126_1626 = null;

        aClass126_1620 = null;
        aClass318_1632 = null;
        aClass126_1627 = null;
        aClass126_1625 = null;
        aClass126_1630 = null;
    }

    public final String toString() {
        anInt1615++;
        throw new IllegalStateException();
    }

    static Class126 method1534(int i) {
        anInt1613++;
        while_108_:
        do {
            while_107_:
            do {
                while_106_:
                do {
                    while_105_:
                    do {
                        while_104_:
                        do {
                            do {
                                if (i == 0) {
                                    return aClass126_1620;
                                } else if (i != 1) {
                                    if (i == 2) {
                                        break;
                                    } else if (i != 3) {
                                        if (i == 4) {
                                            break while_105_;
                                        } else if (i != 5) {
                                            if (i == 6) {
                                                break while_107_;
                                            }
                                            break while_108_;
                                        }
                                        break while_106_;
                                    }
                                    break while_104_;
                                }
                                return aClass126_1625;
                            } while (false);
                            return aClass126_1626;
                        } while (false);
                        return aClass126_1627;
                    } while (false);
                    return aClass126_1628;
                } while (false);
                return aClass126_1629;
            } while (false);
            return aClass126_1630;
        } while (false);
        return null;
    }

    static void method1535(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
        anInt1614++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 8, i_9_);
        cachenode_sub2.method2288();
        if (i_8_ < 91) {
            method1538(54, false, false, null);
        }
        cachenode_sub2.anInt9432 = i_10_;
        cachenode_sub2.anInt9429 = i_7_;
        cachenode_sub2.anInt9434 = i;
    }

    static int method1536(String string) {
        anInt1611++;
        return string.length() + 1;
    }

    static RuntimeException_Sub1 method1537(Throwable throwable, String string) {
        anInt1619++;
        RuntimeException_Sub1 runtimeexception_sub1;
        if (throwable instanceof RuntimeException_Sub1) {
            runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            runtimeexception_sub1.aString4919 += ' ' + string;
        } else {
            runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
        }
        return runtimeexception_sub1;
    }

    static void method1538(int i, boolean bool, boolean bool_11_, String string) {
        anInt1618++;
        try {
            if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
                Node_Sub7.method2422("commands - This command");
                Node_Sub7.method2422("cls - Clear console");
                Node_Sub7.method2422("displayfps - Toggle FPS and other information");
                Node_Sub7.method2422("renderer - Print graphics renderer information");
                Node_Sub7.method2422("heap - Print java memory information");
                Node_Sub7.method2422(
                        "getcamerapos - Print location and direction of camera for use in bug reports");
                Node_Sub7.method2422("screenshot - Take a screenshot");
                Node_Sub7.method2422("screenshotpath - Change the path to store the screenshots in");
                Node_Sub7.method2422("resetzoom - Resets the zoom to default");
                Node_Sub7.method2422("forceleftclick - Toggle having attack option as left click on npcs and players regardless of their combat");
                return;
            }

            if (string.equalsIgnoreCase("cls")) {
                Class118.anInt5406 = 0;
                Class144_Sub4.anInt6848 = 0;
                return;
            }
            if (i < 74) {
                return;
            }

            if (string.equalsIgnoreCase("forceleftclick")) {
                Settings.toggleForceLeftClick();
                Node_Sub7.method2422(
                        "forceleftclick" + (Settings.forceLeftClick() ? " enabled" : " disabled"));
                return;
            }

            if (string.equalsIgnoreCase("resetzoom")) {
                Class268.aShort3455 = 320;
                return;
            }
            if (string.equalsIgnoreCase("displayfps")) {
                Node_Sub15_Sub2.aBoolean9780 = !Node_Sub15_Sub2.aBoolean9780;
                if (Node_Sub15_Sub2.aBoolean9780) {
                    Node_Sub7.method2422("FPS on");
                    return;
                } else {
                    Node_Sub7.method2422("FPS off");
                }
                return;
            }
            if (string.equals("renderer")) {
                Renderer renderer = Class93.aGraphicsToolkit1241.c();
                Node_Sub7.method2422("Vendor: " + renderer.anInt3656);
                Node_Sub7.method2422("Name: " + renderer.aString3664);
                Node_Sub7.method2422("Version: " + renderer.anInt3658);
                Node_Sub7.method2422("Device: " + renderer.aString3660);
                Node_Sub7.method2422("Driver Version: " + renderer.aLong3661);
                return;
            }
            if (string.equals("heap")) {
                Node_Sub7.method2422("Heap: " + Class201.anInt2446 + "MB");
                return;
            }
            if (string.equalsIgnoreCase("getcamerapos")) {
                Node_Sub7.method2422(
                        "Pos: " + Class295.myPlayer.plane + "," + ((Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX
                                >> 6) + "," + (
                                (Node_Sub10.anInt7079 >> 9) + Class320_Sub4.gameSceneBaseY >> 6) + "," + (
                                (Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX & 0x3f) + "," + (
                                (Node_Sub10.anInt7079 >> 9) + Class320_Sub4.gameSceneBaseY & 0x3f) + " Height: " + (
                                Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Node_Sub10.anInt7079,
                                        Class98.anInt5061)
                                        - Class190.anInt2331));
                Node_Sub7.method2422(
                        "Look: " + Class295.myPlayer.plane + "," + (Class238.anInt2911 + Node_Sub53.gameSceneBaseX >> 6)
                                + "," + (Class320_Sub4.gameSceneBaseY + Class10.anInt174 >> 6) + "," + (0x3f &
                                Node_Sub53.gameSceneBaseX
                                        + Class238.anInt2911)
                                + "," + (0x3f & Class320_Sub4.gameSceneBaseY + Class10.anInt174) + " Height: " + (
                                Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Class10.anInt174,
                                        Class238.anInt2911)
                                        - Class134_Sub1.anInt9015));
                return;
            }
            if (string.equalsIgnoreCase("getcamerapos2")) {
                int plane = Class295.myPlayer.plane;
                int x = ((Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX >> 6) * 64 + (
                        (Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX & 0x3f);
                int y = ((Node_Sub10.anInt7079 >> 9) + Class320_Sub4.gameSceneBaseY >> 6) * 64 + (
                        (Node_Sub10.anInt7079 >> 9) + Class320_Sub4.gameSceneBaseY & 0x3f);
                Node_Sub7.method2422("Pos: plane:" + plane + ", x:" + x + ", y: " + y + ", Height: " + (
                        Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Node_Sub10.anInt7079,
                                Class98.anInt5061)
                                - Class190.anInt2331));
                int x2 = ((Class238.anInt2911 >> 9) + Node_Sub53.gameSceneBaseX >> 6) * 64 + (
                        (Class238.anInt2911 >> 9) + Node_Sub53.gameSceneBaseX & 0x3f);
                int y2 = ((Class10.anInt174 >> 9) + Class320_Sub4.gameSceneBaseY >> 6) * 64 + (
                        (Class10.anInt174 >> 9) + Class320_Sub4.gameSceneBaseY & 0x3f);
                Node_Sub7.method2422("Look: plane:" + plane + ", x:" + x2 + ", y: " + y2 + ", Height: " + (
                        Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Class10.anInt174,
                                Class238.anInt2911)
                                - Class134_Sub1.anInt9015));
                //	Node_Sub7.method2422((byte) 43, "Look: " + Class295.myPlayer.plane + "," + (Class238.anInt2911 +
                // Node_Sub53.gameSceneBaseX >> 6) + "," + (Class320_Sub4.gameSceneBaseY + Class10.anInt174 >> 6) + ",
                // " + (0x3f & Node_Sub53.gameSceneBaseX + Class238.anInt2911) + "," + (0x3f &
                // Class320_Sub4.gameSceneBaseY + Class10.anInt174) + " Height: " + (Node_Sub38_Sub7.method2809
                // (Class295.myPlayer.plane, -29754, Class10.anInt174, Class238.anInt2911) +
                // -Class134_Sub1.anInt9015));
                return;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
            Node_Sub7.method2422(Translation.aTranslation_365.getTranslatedString(Class35.language));
            return;
        }
        if (Class339_Sub7.rights >= 2) {
            if (string.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (string.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (string.equalsIgnoreCase("printfps")) {
                    Node_Sub7.method2422("FPS: " + Node_Sub9_Sub4.anInt9732);
                    return;
                }
                if (string.equalsIgnoreCase("occlude")) {
                    Class12.aBoolean194 = !Class12.aBoolean194;
                    if (Class12.aBoolean194) {
                        Node_Sub7.method2422("Occlsion now on!");
                        return;
                    } else {
                        Node_Sub7.method2422("Occlsion now off!");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("fpson")) {
                    Node_Sub15_Sub2.aBoolean9780 = true;
                    Node_Sub7.method2422("fps debug enabled");
                    return;
                }
                if (string.equalsIgnoreCase("fpsoff")) {
                    Node_Sub15_Sub2.aBoolean9780 = false;
                    Node_Sub7.method2422("fps debug disabled");
                    return;
                }
                if (string.equals("systemmem")) {
                    try {
                        Node_Sub7.method2422(
                                "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/"
                                        + Node_Sub23.aNode_Sub39_7201.anInt7484 + "Mb");
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    return;
                }
                if (string.equalsIgnoreCase("cleartext")) {
                    Class226.aClass103_2684.method1112((byte) -122);
                    Node_Sub7.method2422("Text coords cleared");
                    return;
                }
                if (string.equalsIgnoreCase("gc")) {
                    Class355.method4021(60);
                    for (int i_12_ = 0; i_12_ < 10; i_12_++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i_13_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422("mem=" + i_13_ + "k");
                    return;
                }
                if (string.equalsIgnoreCase("compact")) {
                    Class355.method4021(49);
                    for (int i_14_ = 0; i_14_ < 10; i_14_++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422("Memory before cleanup=" + i_15_ + "k");
                    Class189.method1934();
                    Class355.method4021(112);
                    for (int i_16_ = 0; i_16_ < 10; i_16_++)
                        System.gc();
                    i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422("Memory after cleanup=" + i_15_ + "k");
                    return;
                }
                if (string.equalsIgnoreCase("unloadnatives")) {
                    Node_Sub7.method2422(!Class377_Sub1.method4128() ? "Library unloading failed!" :
                            "Libraries unloaded");
                    return;
                }
                if (string.equalsIgnoreCase("clientdrop")) {
                    Node_Sub7.method2422("Dropped Client connection");
                    if (Class151.anInt1843 == 11) {
                        Class262_Sub13.method3182();
                    } else if (Class151.anInt1843 == 12) {
                        Class218.aClass123_2566.aBoolean1580 = true;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("rotateconnectmethods")) {
                    Class181.aClass197_2155.method1997();
                    Node_Sub7.method2422("Rotated connection methods");
                    return;
                }
                if (string.equalsIgnoreCase("clientjs5drop")) {
                    Class267.aClass266_3449.method3235();
                    Node_Sub7.method2422("Dropped Client js5 net queue");
                    return;
                }
                if (string.equalsIgnoreCase("serverjs5drop")) {
                    Class267.aClass266_3449.method3242();
                    Node_Sub7.method2422("Dropped server js5 net queue");
                    return;
                }
                if (string.equalsIgnoreCase("breakcon")) {
                    Class240.aSignLink2946.method3644();
                    Class123[] class123s = Class218.aClass123Array2567;
                    for (Class123 class123 : class123s) {
                        if (class123.aClass365_1557 != null) {
                            class123.aClass365_1557.method4063();
                        }
                    }
                    Class267.aClass266_3449.method3245();
                    Node_Sub7.method2422("Breaking new connections for 5 seconds");
                    return;
                }
                if (string.equalsIgnoreCase("rebuild")) {
                    Class243.method3061(7);
                    Node_Sub18.method2606();
                    Node_Sub7.method2422("Rebuilding map");
                    return;
                }
                if (string.equalsIgnoreCase("rebuildprofile")) {
                    Class366.aLong4528 = Class313.method3650();
                    Class19.aBoolean313 = true;
                    Class243.method3061(7);
                    Node_Sub18.method2606();
                    Node_Sub7.method2422("Rebuilding map (with profiling)");
                    return;
                }
                if (string.equalsIgnoreCase("wm1")) {
                    Node_Sub38_Sub19.method2850(1, -1, -1);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) == 1) {
                        Node_Sub7.method2422("wm1 succeeded");
                        return;
                    } else {
                        Node_Sub7.method2422("wm1 failed");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm2")) {
                    Node_Sub38_Sub19.method2850(2, -1, -1);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) == 2) {
                        Node_Sub7.method2422("wm2 succeeded");
                        return;
                    } else {
                        Node_Sub7.method2422("wm2 failed");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm3")) {
                    Node_Sub38_Sub19.method2850(3, 1024, 768);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) == 3) {
                        Node_Sub7.method2422("wm3 succeeded");
                        return;
                    } else {
                        Node_Sub7.method2422("wm3 failed");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk0")) {
                    Translation.method300(0, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 0) {
                        Node_Sub7.method2422("Entered tk0");
                        Class213.aNode_Sub27_2512.method2690(102, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422("Failed to enter tk0");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk1")) {
                    Translation.method300(1, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 1) {
                        Node_Sub7.method2422("Entered tk1");
                        Class213.aNode_Sub27_2512.method2690(103, 1, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422("Failed to enter tk1");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk2")) {
                    Translation.method300(2, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 2) {
                        Node_Sub7.method2422("Entered tk2");
                        Class213.aNode_Sub27_2512.method2690(104, 2, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422("Failed to enter tk2");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk3")) {
                    Translation.method300(3, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 3) {
                        Node_Sub7.method2422("Entered tk3");
                        Class213.aNode_Sub27_2512.method2690(27, 3, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                        return;
                    } else {
                        Node_Sub7.method2422("Failed to enter tk3");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk5")) {
                    Translation.method300(5, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 5) {
                        Node_Sub7.method2422("Entered tk5");
                        Class213.aNode_Sub27_2512.method2690(127, 5, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422("Failed to enter tk5");
                        return;
                    }
                    return;
                }
                if (string.startsWith("setba")) {
                    if (string.length() < 6) {
                        Node_Sub7.method2422("Invalid buildarea value");
                    } else {
                        int i_18_ = Class350.method3998(string.substring(6), -1);
                        if (i_18_ >= 0 && Class248.method3084(Class201.anInt2446) >= i_18_) {
                            Class213.aNode_Sub27_2512.method2690(28, i_18_,
                                    Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
                            Node_Sub38_Sub31.method2893(1);
                            Class269.aBoolean3472 = false;
                            Node_Sub7.method2422(
                                    "maxbuildarea=" + Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3697());
                            return;
                        } else {
                            Node_Sub7.method2422("Invalid buildarea value");
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("rect_debug")) {
                    Class12.anInt193 = Class350.method3998(string.substring(10).trim(), -1);
                    Node_Sub7.method2422("rect_debug=" + Class12.anInt193);
                    return;
                }
                if (string.equalsIgnoreCase("qa_op_test")) {
                    Class54.aBoolean817 = true;
                    Node_Sub7.method2422("qa_op_test=true");
                    return;
                }
                if (string.equalsIgnoreCase("clipcomponents")) {
                    Class204.aBoolean2454 = !Class204.aBoolean2454;
                    Node_Sub7.method2422("clipcomponents=" + Class204.aBoolean2454);
                    return;
                }
                if (string.startsWith("bloom")) {
                    boolean bool_19_ = Class93.aGraphicsToolkit1241.w();
                    if (Node_Sub19.method2610(!bool_19_)) {
                        if (bool_19_) {
                            Node_Sub7.method2422("Bloom disabled");
                        } else {
                            Node_Sub7.method2422("Bloom enabled");
                        }
                    } else {
                        Node_Sub7.method2422("Failed to enable bloom");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tween")) {
                    if (Class320_Sub12.aBoolean8325) {
                        Class320_Sub12.aBoolean8325 = false;
                        Node_Sub7.method2422("Forced tweening disabled.");
                        return;
                    } else {
                        Class320_Sub12.aBoolean8325 = true;
                        Node_Sub7.method2422("Forced tweening ENABLED!");
                    }
                    return;
                }
                if (string.equalsIgnoreCase("shiftclick")) {
                    if (Class116.aBoolean5072) {
                        Node_Sub7.method2422("Shift-click disabled.");
                        Class116.aBoolean5072 = false;
                    } else {
                        Node_Sub7.method2422("Shift-click ENABLED!");
                        Class116.aBoolean5072 = true;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("getcgcoord")) {
                    Node_Sub7.method2422(
                            "x:" + (Class295.myPlayer.anInt5934 >> 9) + " z:" + (Class295.myPlayer.anInt5940 >> 9));
                    return;
                }
                if (string.equalsIgnoreCase("getheight")) {
                    Node_Sub7.method2422(
                            "Height: " + Class320_Sub10.aPlaneArray8300[Class295.myPlayer.plane].method3251(
                                    Class295.myPlayer.anInt5940 >> 9, Class295.myPlayer.anInt5934 >> 9));
                    return;
                }
                if (string.equalsIgnoreCase("resetminimap")) {
                    Node_Sub38_Sub39.aClass302_10500.method3523();
                    Node_Sub38_Sub39.aClass302_10500.method3521();
                    Node_Sub54.aClass338_7671.method3908();
                    Class304.aClass215_3834.method2071();
                    Node_Sub18.method2606();
                    Node_Sub7.method2422("Minimap reset");
                    return;
                }
                if (string.startsWith("mc")) {
                    if (Class93.aGraphicsToolkit1241.s()) {
                        int i_20_ = Integer.parseInt(string.substring(3));
                        if (i_20_ >= 1) {
                            if (i_20_ > 4) {
                                i_20_ = 4;
                            }
                        } else {
                            i_20_ = 1;
                        }
                        Class244.anInt3081 = i_20_;
                        Class243.method3061(7);
                        Node_Sub7.method2422("Render cores now: " + Class244.anInt3081);
                    } else {
                        Node_Sub7.method2422("Current toolkit doesn't support multiple cores");
                        return;
                    }
                    return;
                }
                if (string.startsWith("cachespace")) {
                    Node_Sub7.method2422("I(s): " + Class252.aClass61_3190.method595() + "/"
                            + Class252.aClass61_3190.method597(22349));
                    Node_Sub7.method2422("I(m): " + Class166.aClass61_5097.method595() + "/"
                            + Class166.aClass61_5097.method597(22349));
                    Node_Sub7.method2422(
                            "O(s): " + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method201() + "/"
                                    + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method200());
                    return;
                }
                if (string.equals("renderprofile") || string.equals("rp")) {
                    Class186.aBoolean2259 = !Class186.aBoolean2259;
                    Class93.aGraphicsToolkit1241.b(Class186.aBoolean2259);
                    Class64.method712();
                    Node_Sub7.method2422("showprofiling=" + Class186.aBoolean2259);
                    return;
                }
                if (string.startsWith("performancetest")) {
                    int i_21_ = -1;
                    int i_22_ = 1000;
                    if (string.length() > 15) {
                        String[] strings = Class106.method1120(string, ' ');
                        try {
                            if (strings.length > 1) {
                                i_22_ = Integer.parseInt(strings[1]);
                            }
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                        try {
                            if (strings.length > 2) {
                                i_21_ = Integer.parseInt(strings[2]);
                            }
                        } catch (Throwable throwable) {
                            /* empty */
                        }
                    }
                    if (i_21_ == -1) {
                        Node_Sub7.method2422("Java toolkit: " + Class194.method1961(i_22_, 0));
                        Node_Sub7.method2422("SSE toolkit:  " + Class194.method1961(i_22_, 2));
                        Node_Sub7.method2422("D3D toolkit:  " + Class194.method1961(i_22_, 3));
                        Node_Sub7.method2422("GL toolkit:   " + Class194.method1961(i_22_, 1));
                        Node_Sub7.method2422("GLX toolkit:  " + Class194.method1961(i_22_, 5));
                        return;
                    } else {
                        Node_Sub7.method2422("Performance: " + Class194.method1961(i_22_, i_21_));
                    }
                    return;
                }
                if (string.equals("nonpcs")) {
                    Node_Sub29.aBoolean7338 = !Node_Sub29.aBoolean7338;
                    Node_Sub7.method2422("nonpcs=" + Node_Sub29.aBoolean7338);
                    return;
                }
                if (string.equals("autoworld")) {
                    EntityNode.method802(2126);
                    Node_Sub7.method2422("auto world selected");
                    return;
                }
                if (string.startsWith("switchworld")) {
                    int i_23_ = Integer.parseInt(string.substring(12));
                    Class188_Sub1_Sub2.method1899(i_23_, Objects.requireNonNull(Class327.method3823(i_23_)).aString8773);
                    Node_Sub7.method2422("switched");
                    return;
                }
                if (string.equals("getworld")) {
                    Node_Sub7.method2422("w: " + Class181.aClass197_2155.id);
                    return;
                }
                if (string.startsWith("pc")) {
                    Class123 class123 = Class262_Sub23.method3213((byte) -60);
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class133.aClass318_1687,
                            Objects.requireNonNull(class123).anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeByte(0);
                    int i_24_ = node_sub13.aPacket7113.offset;
                    int i_25_ = string.indexOf(" ", 4);
                    node_sub13.aPacket7113.writeString(string.substring(3, i_25_));
                    Class194_Sub3.method1975(node_sub13.aPacket7113, string.substring(i_25_));
                    node_sub13.aPacket7113.method2217(-i_24_ + node_sub13.aPacket7113.offset);
                    class123.sendPacket(126, node_sub13);
                    return;
                }
                if (string.equals("savevarcs")) {
                    Class144.method1631((byte) 125);
                    Node_Sub7.method2422("perm varcs saved");
                    return;
                }
                if (string.equals("scramblevarcs")) {
                    for (int i_26_ = 0; i_26_ < Class320_Sub22.anIntArray8417.length; i_26_++) {
                        if (FileOnDisk.aBooleanArray1332[i_26_]) {
                            Class320_Sub22.anIntArray8417[i_26_] = (int) (99999.0 * Math.random());
                            if (Math.random() > 0.5) {
                                Class320_Sub22.anIntArray8417[i_26_] *= -1;
                            }
                        }
                    }
                    Class144.method1631((byte) 118);
                    Node_Sub7.method2422("perm varcs scrambled");
                    return;
                }
                if (string.equals("showcolmap")) {
                    Class320_Sub3.aBoolean8235 = true;
                    Node_Sub18.method2606();
                    Node_Sub7.method2422("colmap is shown");
                    return;
                }
                if (string.equals("hidecolmap")) {
                    Class320_Sub3.aBoolean8235 = false;
                    Node_Sub18.method2606();
                    Node_Sub7.method2422("colmap is hidden");
                    return;
                }
                if (string.equals("resetcache")) {
                    Node_Sub36_Sub2.method2761();
                    Node_Sub7.method2422("Caches reset");
                    return;
                }
                if (string.equals("profilecpu")) {
                    Node_Sub7.method2422(CacheNode_Sub4.method2302() + "ms");
                    return;
                }
                if (string.startsWith("getclientvarpbit")) {
                    int i_27_ = Integer.parseInt(string.substring(17));
                    Node_Sub7.method2422("varpbit=" + Class24.aClass275_442.method64(i_27_, (byte) -42));
                    return;
                }
                if (string.startsWith("getclientvarp")) {
                    int i_28_ = Integer.parseInt(string.substring(14));
                    Node_Sub7.method2422("varp=" + Class24.aClass275_442.method65(i_28_));
                    return;
                }
                if (string.startsWith("directlogin")) {
                    String[] strings = Class106.method1120(string.substring(12), ' ');
                    if (strings.length >= 2) {
                        int i_29_ = strings.length > 2 ? Integer.parseInt(strings[2]) : 0;
                        Class39.method415(i_29_, strings[1], strings[0], 106);
                        return;
                    }
                }
                if (string.startsWith("snlogin ")) {
                    String[] strings = Class106.method1120(string.substring(8), ' ');
                    int i_30_ = Integer.parseInt(strings[0]);
                    int i_31_ = strings.length == 2 ? Integer.parseInt(strings[1]) : 0;
                    Animable.method822(i_30_, i_31_);
                    return;
                }
                if (string.startsWith("csprofileclear")) {
                    ClientScriptsExecutor.method3564();
                    return;
                }
                if (string.startsWith("csprofileoutputc")) {
                    /* empty */
                    return;
                }
                if (string.startsWith("csprofileoutputt")) {
                    /* empty */
                    return;
                }
                if (string.startsWith("texsize")) {
                    int i_32_ = Integer.parseInt(string.substring(8));
                    Class93.aGraphicsToolkit1241.f(i_32_);
                    return;
                }
                if (string.equals("soundstreamcount")) {
                    Node_Sub7.method2422("Active streams: " + Class176.aNode_Sub9_Sub3_2106.method2512());
                    return;
                }
                if (string.equals("autosetup")) {
                    Node_Sub41.method2931((byte) -103);
                    Node_Sub7.method2422("Complete. Toolkit now: "
                            + Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791());
                    return;
                }
                if (string.equals("errormessage")) {
                    Node_Sub7.method2422(Class158.aClient1983.method100());
                    return;
                }
                if (string.equals("heapdump")) {
                    if (SignLink.aString3981.startsWith("win")) {
                        AbstractToolkit.method1272(new File("C:\\Temp\\heap.dump"));
                    } else {
                        AbstractToolkit.method1272(new File("/tmp/heap.dump"));
                    }
                    Node_Sub7.method2422("Done");
                    return;
                }
                if (string.equals("os")) {
                    Node_Sub7.method2422("Name: " + SignLink.aString3981);
                    Node_Sub7.method2422("Arch: " + SignLink.aString3984);
                    Node_Sub7.method2422("Ver: " + SignLink.aString3982);
                    return;
                }
                if (string.startsWith("w2debug")) {
                    Node_Sub9_Sub5.anInt9766 = Integer.parseInt(string.substring(8, 9));
                    Class243.method3061(7);
                    Node_Sub7.method2422("Toggled!");
                    return;
                }
                if (string.startsWith("ortho ")) {
                    int i_34_ = string.indexOf(' ');
                    if (i_34_ < 0) {
                        Node_Sub7.method2422("Syntax: ortho <n>");
                    } else {
                        int i_35_ = Class350.method3998(string.substring(i_34_ + 1), -1);
                        Class213.aNode_Sub27_2512.method2690(119, i_35_, Class213.aNode_Sub27_2512.aClass320_Sub3_7298);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                        Class34_Sub1.method378();
                        if (i_35_ == Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691()) {
                            Node_Sub7.method2422("Successfully changed ortho mode");
                            return;
                        } else {
                            Node_Sub7.method2422("Failed to change ortho mode");
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthozoom ")) {
                    if (Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691() == 0) {
                        Node_Sub7.method2422("enable ortho mode first (use 'ortho <n>')");
                    } else {
                        Class308.anInt3916 = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
                        Node_Sub7.method2422("orthozoom=" + Class308.anInt3916);
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthotilesize ")) {
                    int i_37_ = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
                    Translation.anInt432 = Node_Sub36_Sub1.anInt10039 = i_37_;
                    Node_Sub7.method2422("ortho tile size=" + i_37_);
                    Class34_Sub1.method378();
                    return;
                }
                if (string.equals("orthocamlock")) {
                    Class336_Sub2.aBoolean8588 = !Class336_Sub2.aBoolean8588;
                    Node_Sub7.method2422(
                            "ortho camera lock is " + (Class336_Sub2.aBoolean8588 ? "on" : "off"));
                    return;
                }
                if (string.startsWith("skydetail ")) {
                    int i_38_ = Class350.method3998(string.substring(string.indexOf(' ') + 1), -1);
                    Class213.aNode_Sub27_2512.method2690(36, i_38_, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
                    Node_Sub7.method2422("skydetail is " + (
                            Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686() != 0 ? "high" : "low"));
                    return;
                }
                if (string.startsWith("setoutput ")) {
                    File file = new File(string.substring(10));
                    if (file.exists()) {
                        file = new File(string.substring(10) + "." + Class313.method3650() + ".log");
                        if (file.exists()) {
                            Node_Sub7.method2422("file already exists!");
                            return;
                        }
                    }
                    if (Class270_Sub1.aFileOutputStream8027 != null) {
                        Class270_Sub1.aFileOutputStream8027.close();
                        Class270_Sub1.aFileOutputStream8027 = null;
                    }
                    try {
                        Class270_Sub1.aFileOutputStream8027 = new FileOutputStream(file);
                    } catch (java.io.FileNotFoundException filenotfoundexception) {
                        Node_Sub7.method2422("Could not create " + file.getName());
                    } catch (SecurityException securityexception) {
                        Node_Sub7.method2422("Cannot write to " + file.getName());
                    }
                    return;
                }
                if (string.equals("closeoutput")) {
                    if (Class270_Sub1.aFileOutputStream8027 != null) {
                        Class270_Sub1.aFileOutputStream8027.close();
                    }
                    Class270_Sub1.aFileOutputStream8027 = null;
                    return;
                }
                if (string.startsWith("runscript ")) {
                    File file = new File(string.substring(10));
                    if (!file.exists()) {
                        Node_Sub7.method2422("No such file");
                        return;
                    }
                    byte[] bs = Class337.method3904(file);
                    if (bs == null) {
                        Node_Sub7.method2422("Failed to read file");
                        return;
                    }
                    String[] strings = Class106.method1120(Class197.method1998(Objects.requireNonNull(Class329.method3835(bs
                    ))), '\n');
                    Class194.method1960(strings);
                }
                if (string.startsWith("aShort3455 ")) {
                    short s = (short) Class350.method3998(string.substring(5), -1);
                    if (s > 0) {
                        Class268.aShort3455 = s;
                    }
                    return;
                }
                if (string.startsWith("zoom ")) {
                    short s = (short) Class350.method3998(string.substring(5), -1);
                    if (s > 0) {
                        Class268.aShort3455 = s;
                    }
                    return;
                }
                if (string.startsWith("cs2debug")) {
                    if (string.length() <= 9 || string.charAt(8) != 32) {
                        ClientScriptsExecutor.aString3870 = null;
                        ClientScriptsExecutor.aBoolean3868 = !ClientScriptsExecutor.aBoolean3868;
                        Node_Sub7.method2422("cs2debug:" + ClientScriptsExecutor.aBoolean3868);
                    } else {
                        ClientScriptsExecutor.aString3870 = string.substring(9);
                        ClientScriptsExecutor.aBoolean3868 = true;
                        Node_Sub7.method2422("cs2debug: (" + ClientScriptsExecutor.aString3870 + ")");
                        return;
                    }
                    return;
                }
                if (Class151.anInt1843 == 11) {
                    CacheNode_Sub6.anInt9483++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class247.aClass318_3130,
                            Class218.aClass123_2566.anIsaacCipher1571);
                    Objects.requireNonNull(node_sub13).aPacket7113.writeByte(3 + string.length());
                    node_sub13.aPacket7113.writeByte(!bool ? 0 : 1);
                    node_sub13.aPacket7113.writeByte(bool_11_ ? 1 : 0);
                    node_sub13.aPacket7113.writeString(string);
                    Class218.aClass123_2566.sendPacket(127, node_sub13);
                }
                if (string.startsWith("fps ") && Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943) {
                    Class384.method4203(Class350.method3998(string.substring(4), -1));
                    return;
                }
            } catch (Exception exception) {
                Node_Sub7.method2422(Translation.aTranslation_365.getTranslatedString(Class35.language));
                return;
            }
        }
        if (Class151.anInt1843 != 11) {
            Node_Sub7.method2422(Translation.aTranslation_366.getTranslatedString(Class35.language) + string);
        }
    }

    static void method1539(boolean bool, String string) {
        anInt1622++;
        if (string != null) {
            if (Class235.anInt5122 >= 100) {
                Class41.method436(Translation.aTranslation_402.getTranslatedString(Class35.language));
            } else {
                String string_39_ = Node_Sub25_Sub3.method2671(string);
                if (string_39_ != null) {
                    for (int i = 0; Class235.anInt5122 > i; i++) {
                        String string_40_ = Node_Sub25_Sub3.method2671(Class338.aStringArray4197[i]);
                        if (string_40_ != null && string_40_.equals(string_39_)) {
                            Class41.method436(string + Translation.aTranslation_403.getTranslatedString(Class35.language));
                            return;
                        }
                        if (Class7.aStringArray164[i] != null) {
                            String string_41_ = Node_Sub25_Sub3.method2671(Class7.aStringArray164[i]);
                            if (string_41_ != null && string_41_.equals(string_39_)) {
                                Class41.method436(string + Translation.aTranslation_403.getTranslatedString(Class35.language));
                                return;
                            }
                        }
                    }
                    for (int i = 0; i < Node_Sub38_Sub14.anInt10242; i++) {
                        String string_42_ = Node_Sub25_Sub3.method2671(Class262_Sub12.aStringArray7793[i]);
                        if (string_42_ != null && string_42_.equals(string_39_)) {
                            Class41.method436(Translation.aTranslation_408.getTranslatedString(Class35.language) + string
                                    + Translation.aTranslation_409.getTranslatedString(Class35.language));
                            return;
                        }
                        if (Plane.aStringArray3403[i] != null) {
                            String string_43_ = Node_Sub25_Sub3.method2671(Plane.aStringArray3403[i]);
                            if (string_43_ != null && string_43_.equals(string_39_)) {
                                Class41.method436(Translation.aTranslation_408.getTranslatedString(Class35.language) + string
                                        + Translation.aTranslation_409.getTranslatedString(Class35.language));
                                return;
                            }
                        }
                    }
                    if (Objects.requireNonNull(Node_Sub25_Sub3.method2671(Class295.myPlayer.username)).equals(string_39_)) {
                        Class41.method436(Translation.aTranslation_405.getTranslatedString(Class35.language));
                    } else {
                        Class239.anInt2927++;
                        Class123 class123 = Class262_Sub23.method3213((byte) -95);
                        Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class320_Sub3.aClass318_8233,
                                Objects.requireNonNull(class123).anIsaacCipher1571);
                        Objects.requireNonNull(node_sub13).aPacket7113.writeByte(method1536(string) + 1);
                        node_sub13.aPacket7113.writeString(string);
                        node_sub13.aPacket7113.writeByte(!bool ? 0 : 1);
                        class123.sendPacket(127, node_sub13);
                    }
                }
            }
        }
    }

    private Class126(int i, int i_44_, Class372 class372) {
        anInt1621 = i;
        anInt1624 = i_44_ * class372.anInt4591;
        if (anInt1621 >= 16) {
            throw new RuntimeException();
        }
    }
}
