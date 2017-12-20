/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.io.File;
import java.io.FileOutputStream;

public class Class126 {
    static int anInt1611;
    private int anInt1612;
    static int anInt1613;
    static int anInt1614;
    static int anInt1615;
    static int anInt1616;
    private Class372 aClass372_1617;
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

    static final void method1532(int i) {
        if (Class93.aGraphicsToolkit1241 != null) {
            if (Class71.aBoolean967) {
                Class94.method1065(113);
            }
            Node_Sub36_Sub3.aClass179_10058.method1815((byte) 74);
            Class320_Sub26.method3777();
            Node_Sub18.method2606(126);
            GameStub.method101(-15332);
            Class262_Sub22.method3206(0);
            CacheNode_Sub4.method2304(-62);
            Class48.method481(0);
            Node_Sub36_Sub2.method2761((byte) 125);
            Class113.method1150((byte) -99);
            Animable_Sub1.method825((byte) -68);
            Class262_Sub23.method3212(false, 1295);
            for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -2049; i_0_++) {
                Player player = Class270_Sub2.LOCAL_PLAYERS[i_0_];
                if (player != null) {
                    for (int i_1_ = 0; player.aDrawableModelArray10909.length > i_1_; i_1_++)
                        player.aDrawableModelArray10909[i_1_] = null;
                }
            }
            for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Node_Sub32.cachedNPCcsCount ^ 0xffffffff); i_2_++) {
                Npc npc = Class314.LocalNPCs[i_2_].aNpc7518;
                if (npc != null) {
                    for (int i_3_ = 0; i_3_ < npc.aDrawableModelArray10909.length; i_3_++)
                        npc.aDrawableModelArray10909[i_3_] = null;
                }
            }
            Node_Sub5.aClass336_7032 = null;
            Class290_Sub6.aClass336_8114 = null;
            Class93.aGraphicsToolkit1241.method1233(-7751);
            Class93.aGraphicsToolkit1241 = null;
        }
        anInt1623++;
        @SuppressWarnings("unused") int i_4_ = 73 / ((16 - i) / 49);
    }

    public static void method1533(int i) {
        aClass192_1633 = null;
        aClass126_1629 = null;
        aClass126_1628 = null;
        aClass126_1626 = null;
        if (i == 1) {
            aClass126_1620 = null;
            aClass318_1632 = null;
            aClass126_1627 = null;
            aClass126_1625 = null;
            aClass126_1630 = null;
        }
    }

    public final String toString() {
        anInt1615++;
        throw new IllegalStateException();
    }

    static final Class126 method1534(int i, int i_5_) {
        anInt1613++;
        if (i_5_ > -103) {
            aClass192_1633 = null;
        }
        int i_6_ = i;
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
                                if ((i_6_ ^ 0xffffffff) != -1) {
                                    if (i_6_ != 1) {
                                        if ((i_6_ ^ 0xffffffff) != -3) {
                                            if (i_6_ != 3) {
                                                if (i_6_ != 4) {
                                                    if (i_6_ != 5) {
                                                        if ((i_6_ ^ 0xffffffff) == -7) {
                                                            break while_107_;
                                                        }
                                                        break while_108_;
                                                    }
                                                } else {
                                                    break while_105_;
                                                }
                                                break while_106_;
                                            }
                                        } else {
                                            break;
                                        }
                                        break while_104_;
                                    }
                                } else {
                                    return aClass126_1620;
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

    static final void method1535(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
        anInt1614++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 8, (long) i_9_);
        cachenode_sub2.method2288(0);
        if (i_8_ < 91) {
            method1538(54, false, false, null);
        }
        cachenode_sub2.anInt9432 = i_10_;
        cachenode_sub2.anInt9429 = i_7_;
        cachenode_sub2.anInt9434 = i;
    }

    static final int method1536(int i, String string) {
        if (i != -20826) {
            return -51;
        }
        anInt1611++;
        return string.length() - -1;
    }

    static final RuntimeException_Sub1 method1537(Throwable throwable, String string) {
        anInt1619++;
        RuntimeException_Sub1 runtimeexception_sub1;
        if (!(throwable instanceof RuntimeException_Sub1)) {
            runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
        } else {
            runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
            runtimeexception_sub1.aString4919 += ' ' + (String) string;
        }
        return runtimeexception_sub1;
    }

    static final void method1538(int i, boolean bool, boolean bool_11_, String string) {
        anInt1618++;
        try {
            if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
                Node_Sub7.method2422((byte) 43, "commands - This command");
                Node_Sub7.method2422((byte) 43, "cls - Clear console");
                Node_Sub7.method2422((byte) 43, "displayfps - Toggle FPS and other information");
                Node_Sub7.method2422((byte) 43, "renderer - Print graphics renderer information");
                Node_Sub7.method2422((byte) 43, "heap - Print java memory information");
                Node_Sub7.method2422((byte) 43,
                        "getcamerapos - Print location and direction of camera for use in bug" + " reports");
                Node_Sub7.method2422((byte) 43, "screenshot - Take a screenshot");
                Node_Sub7.method2422((byte) 43, "screenshotpath - Change the path to store the screenshots in");
                Node_Sub7.method2422((byte) 43, "resetzoom - Resets the zoom to default");
                Node_Sub7.method2422((byte) 43, "forceleftclick - Toggle having attack option as left click on npcs and players regardless of their combat");
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
                Node_Sub7.method2422((byte) 43,
                        "forceleftclick" + (Settings.forceLeftClick() ? " enabled" : " disabled"));
                return;
            }

            if (string.equalsIgnoreCase("resetzoom")) {
                Class268.aShort3455 = 320;
                return;
            }
            if (string.equalsIgnoreCase("displayfps")) {
                Node_Sub15_Sub2.aBoolean9780 = !Node_Sub15_Sub2.aBoolean9780;
                if (!Node_Sub15_Sub2.aBoolean9780) {
                    Node_Sub7.method2422((byte) 43, "FPS off");
                } else {
                    Node_Sub7.method2422((byte) 43, "FPS on");
                    return;
                }
                return;
            }
            if (string.equals("renderer")) {
                Renderer renderer = Class93.aGraphicsToolkit1241.c();
                Node_Sub7.method2422((byte) 43, "Vendor: " + renderer.anInt3656);
                Node_Sub7.method2422((byte) 43, "Name: " + renderer.aString3664);
                Node_Sub7.method2422((byte) 43, "Version: " + renderer.anInt3658);
                Node_Sub7.method2422((byte) 43, "Device: " + renderer.aString3660);
                Node_Sub7.method2422((byte) 43, "Driver Version: " + renderer.aLong3661);
                return;
            }
            if (string.equals("heap")) {
                Node_Sub7.method2422((byte) 43, "Heap: " + Class201.anInt2446 + "MB");
                return;
            }
            if (string.equalsIgnoreCase("getcamerapos")) {
                Node_Sub7.method2422((byte) 43,
                        "Pos: " + Class295.myPlayer.plane + "," + ((Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX
                                                                   >> 6) + "," + (
                                (Node_Sub10.anInt7079 >> 9) - -Class320_Sub4.gameSceneBaseY >> 6) + "," + (
                                (Class98.anInt5061 >> 9) - -Node_Sub53.gameSceneBaseX & 0x3f) + "," + (
                                (Node_Sub10.anInt7079 >> 9) - -Class320_Sub4.gameSceneBaseY & 0x3f) + " Height: " + (
                                Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Node_Sub10.anInt7079,
                                        Class98.anInt5061)
                                + -Class190.anInt2331));
                Node_Sub7.method2422((byte) 43,
                        "Look: " + Class295.myPlayer.plane + "," + (Class238.anInt2911 + Node_Sub53.gameSceneBaseX >> 6)
                        + "," + (Class320_Sub4.gameSceneBaseY + Class10.anInt174 >> 6) + "," + (0x3f &
                                                                                                Node_Sub53.gameSceneBaseX
                                                                                                + Class238.anInt2911)
                        + "," + (0x3f & Class320_Sub4.gameSceneBaseY + Class10.anInt174) + " Height: " + (
                                Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Class10.anInt174,
                                        Class238.anInt2911)
                                + -Class134_Sub1.anInt9015));
                return;
            }
            if (string.equalsIgnoreCase("getcamerapos2")) {
                int plane = Class295.myPlayer.plane;
                int x = ((Class98.anInt5061 >> 9) + Node_Sub53.gameSceneBaseX >> 6) * 64 + (
                        (Class98.anInt5061 >> 9) - -Node_Sub53.gameSceneBaseX & 0x3f);
                int y = ((Node_Sub10.anInt7079 >> 9) + Class320_Sub4.gameSceneBaseY >> 6) * 64 + (
                        (Node_Sub10.anInt7079 >> 9) - -Class320_Sub4.gameSceneBaseY & 0x3f);
                Node_Sub7.method2422((byte) 43, "Pos: plane:" + plane + ", x:" + x + ", y: " + y + ", Height: " + (
                        Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Node_Sub10.anInt7079,
                                Class98.anInt5061)
                        + -Class190.anInt2331));
                int x2 = ((Class238.anInt2911 >> 9) + Node_Sub53.gameSceneBaseX >> 6) * 64 + (
                        (Class238.anInt2911 >> 9) - -Node_Sub53.gameSceneBaseX & 0x3f);
                int y2 = ((Class10.anInt174 >> 9) + Class320_Sub4.gameSceneBaseY >> 6) * 64 + (
                        (Class10.anInt174 >> 9) - -Class320_Sub4.gameSceneBaseY & 0x3f);
                Node_Sub7.method2422((byte) 43, "Look: plane:" + plane + ", x:" + x2 + ", y: " + y2 + ", Height: " + (
                        Node_Sub38_Sub7.method2809(Class295.myPlayer.plane, -29754, Class10.anInt174,
                                Class238.anInt2911)
                        + -Class134_Sub1.anInt9015));
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
            Node_Sub7.method2422((byte) 43, Class22.aClass22_365.method297(Class35.language));
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
                    Node_Sub7.method2422((byte) 43, "FPS: " + Node_Sub9_Sub4.anInt9732);
                    return;
                }
                if (string.equalsIgnoreCase("occlude")) {
                    Class12.aBoolean194 = !Class12.aBoolean194;
                    if (!Class12.aBoolean194) {
                        Node_Sub7.method2422((byte) 43, "Occlsion now off!");
                    } else {
                        Node_Sub7.method2422((byte) 43, "Occlsion now on!");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("fpson")) {
                    Node_Sub15_Sub2.aBoolean9780 = true;
                    Node_Sub7.method2422((byte) 43, "fps debug enabled");
                    return;
                }
                if (string.equalsIgnoreCase("fpsoff")) {
                    Node_Sub15_Sub2.aBoolean9780 = false;
                    Node_Sub7.method2422((byte) 43, "fps debug disabled");
                    return;
                }
                if (string.equals("systemmem")) {
                    try {
                        Node_Sub7.method2422((byte) 43,
                                "System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/"
                                + Node_Sub23.aNode_Sub39_7201.anInt7484 + "Mb");
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    return;
                }
                if (string.equalsIgnoreCase("cleartext")) {
                    Class226.aClass103_2684.method1112((byte) -122);
                    Node_Sub7.method2422((byte) 43, "Text coords cleared");
                    return;
                }
                if (string.equalsIgnoreCase("gc")) {
                    Class355.method4021(60);
                    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -11; i_12_++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i_13_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422((byte) 43, "mem=" + i_13_ + "k");
                    return;
                }
                if (string.equalsIgnoreCase("compact")) {
                    Class355.method4021(49);
                    for (int i_14_ = 0; i_14_ < 10; i_14_++)
                        System.gc();
                    Runtime runtime = Runtime.getRuntime();
                    int i_15_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422((byte) 43, "Memory before cleanup=" + i_15_ + "k");
                    Class189.method1934((byte) 17);
                    Class355.method4021(112);
                    for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -11; i_16_++)
                        System.gc();
                    i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                    Node_Sub7.method2422((byte) 43, "Memory after cleanup=" + i_15_ + "k");
                    return;
                }
                if (string.equalsIgnoreCase("unloadnatives")) {
                    Node_Sub7.method2422((byte) 43, !Class377_Sub1.method4128(0) ? "Library unloading failed!" :
                            "Libraries unloaded");
                    return;
                }
                if (string.equalsIgnoreCase("clientdrop")) {
                    Node_Sub7.method2422((byte) 43, "Dropped Client connection");
                    if (Class151.anInt1843 != 11) {
                        if (Class151.anInt1843 == 12) {
                            Class218.aClass123_2566.aBoolean1580 = true;
                        }
                    } else {
                        Class262_Sub13.method3182(false);
                    }
                    return;
                }
                if (string.equalsIgnoreCase("rotateconnectmethods")) {
                    Class181.aClass197_2155.method1997(17418);
                    Node_Sub7.method2422((byte) 43, "Rotated connection methods");
                    return;
                }
                if (string.equalsIgnoreCase("clientjs5drop")) {
                    Class267.aClass266_3449.method3235(false);
                    Node_Sub7.method2422((byte) 43, "Dropped Client js5 net queue");
                    return;
                }
                if (string.equalsIgnoreCase("serverjs5drop")) {
                    Class267.aClass266_3449.method3242(-110);
                    Node_Sub7.method2422((byte) 43, "Dropped server js5 net queue");
                    return;
                }
                if (string.equalsIgnoreCase("breakcon")) {
                    Class240.aSignLink2946.method3644((byte) -64);
                    Class123[] class123s = Class218.aClass123Array2567;
                    for (int i_17_ = 0; (class123s.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
                        Class123 class123 = class123s[i_17_];
                        if (class123.aClass365_1557 != null) {
                            class123.aClass365_1557.method4063(0);
                        }
                    }
                    Class267.aClass266_3449.method3245(-2);
                    Node_Sub7.method2422((byte) 43, "Breaking new connections for 5 seconds");
                    return;
                }
                if (string.equalsIgnoreCase("rebuild")) {
                    Class243.method3061(7);
                    Node_Sub18.method2606(126);
                    Node_Sub7.method2422((byte) 43, "Rebuilding map");
                    return;
                }
                if (string.equalsIgnoreCase("rebuildprofile")) {
                    Class366.aLong4528 = Class313.method3650(false);
                    Class19.aBoolean313 = true;
                    Class243.method3061(7);
                    Node_Sub18.method2606(126);
                    Node_Sub7.method2422((byte) 43, "Rebuilding map (with profiling)");
                    return;
                }
                if (string.equalsIgnoreCase("wm1")) {
                    Node_Sub38_Sub19.method2850(3, 1, -1, false, -1);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) != 1) {
                        Node_Sub7.method2422((byte) 43, "wm1 failed");
                    } else {
                        Node_Sub7.method2422((byte) 43, "wm1 succeeded");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm2")) {
                    Node_Sub38_Sub19.method2850(3, 2, -1, false, -1);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) != 2) {
                        Node_Sub7.method2422((byte) 43, "wm2 failed");
                    } else {
                        Node_Sub7.method2422((byte) 43, "wm2 succeeded");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("wm3")) {
                    Node_Sub38_Sub19.method2850(3, 3, 1024, false, 768);
                    if (Class188_Sub2_Sub1.getDisplayMode(3) != 3) {
                        Node_Sub7.method2422((byte) 43, "wm3 failed");
                    } else {
                        Node_Sub7.method2422((byte) 43, "wm3 succeeded");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk0")) {
                    Class22.method300(0, true, false);
                    if ((Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) == -1) {
                        Node_Sub7.method2422((byte) 43, "Entered tk0");
                        Class213.aNode_Sub27_2512.method2690(102, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422((byte) 43, "Failed to enter tk0");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk1")) {
                    Class22.method300(1, true, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 1) {
                        Node_Sub7.method2422((byte) 43, "Entered tk1");
                        Class213.aNode_Sub27_2512.method2690(103, 1, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422((byte) 43, "Failed to enter tk1");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk2")) {
                    Class22.method300(2, true, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 2) {
                        Node_Sub7.method2422((byte) 43, "Entered tk2");
                        Class213.aNode_Sub27_2512.method2690(104, 2, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422((byte) 43, "Failed to enter tk2");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk3")) {
                    Class22.method300(3, true, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) != 3) {
                        Node_Sub7.method2422((byte) 43, "Failed to enter tk3");
                    } else {
                        Node_Sub7.method2422((byte) 43, "Entered tk3");
                        Class213.aNode_Sub27_2512.method2690(27, 3, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tk5")) {
                    Class22.method300(5, true, false);
                    if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) == 5) {
                        Node_Sub7.method2422((byte) 43, "Entered tk5");
                        Class213.aNode_Sub27_2512.method2690(127, 5, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                    } else {
                        Node_Sub7.method2422((byte) 43, "Failed to enter tk5");
                        return;
                    }
                    return;
                }
                if (string.startsWith("setba")) {
                    if (string.length() < 6) {
                        Node_Sub7.method2422((byte) 43, "Invalid buildarea value");
                    } else {
                        int i_18_ = Class350.method3998(string.substring(6), -1);
                        if (i_18_ < 0 || (i_18_ ^ 0xffffffff) < (Class248.method3084(Class201.anInt2446, 128)
                                                                 ^ 0xffffffff)) {
                            Node_Sub7.method2422((byte) 43, "Invalid buildarea value");
                        } else {
                            Class213.aNode_Sub27_2512.method2690(28, i_18_,
                                    Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
                            Node_Sub38_Sub31.method2893(1);
                            Class269.aBoolean3472 = false;
                            Node_Sub7.method2422((byte) 43,
                                    "maxbuildarea=" + Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3697(false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("rect_debug")) {
                    if ((string.length() ^ 0xffffffff) > -11) {
                        Node_Sub7.method2422((byte) 43, "Invalid rect_debug value");
                    } else {
                        Class12.anInt193 = Class350.method3998(string.substring(10).trim(), -1);
                        Node_Sub7.method2422((byte) 43, "rect_debug=" + Class12.anInt193);
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("qa_op_test")) {
                    Class54.aBoolean817 = true;
                    Node_Sub7.method2422((byte) 43, "qa_op_test=" + Class54.aBoolean817);
                    return;
                }
                if (string.equalsIgnoreCase("clipcomponents")) {
                    Class204.aBoolean2454 = !Class204.aBoolean2454;
                    Node_Sub7.method2422((byte) 43, "clipcomponents=" + Class204.aBoolean2454);
                    return;
                }
                if (string.startsWith("bloom")) {
                    boolean bool_19_ = Class93.aGraphicsToolkit1241.w();
                    if (Node_Sub19.method2610((byte) -58, !bool_19_)) {
                        if (bool_19_) {
                            Node_Sub7.method2422((byte) 43, "Bloom disabled");
                        } else {
                            Node_Sub7.method2422((byte) 43, "Bloom enabled");
                        }
                    } else {
                        Node_Sub7.method2422((byte) 43, "Failed to enable bloom");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("tween")) {
                    if (!Class320_Sub12.aBoolean8325) {
                        Class320_Sub12.aBoolean8325 = true;
                        Node_Sub7.method2422((byte) 43, "Forced tweening ENABLED!");
                    } else {
                        Class320_Sub12.aBoolean8325 = false;
                        Node_Sub7.method2422((byte) 43, "Forced tweening disabled.");
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("shiftclick")) {
                    if (Class116.aBoolean5072) {
                        Node_Sub7.method2422((byte) 43, "Shift-click disabled.");
                        Class116.aBoolean5072 = false;
                    } else {
                        Node_Sub7.method2422((byte) 43, "Shift-click ENABLED!");
                        Class116.aBoolean5072 = true;
                        return;
                    }
                    return;
                }
                if (string.equalsIgnoreCase("getcgcoord")) {
                    Node_Sub7.method2422((byte) 43,
                            "x:" + (Class295.myPlayer.anInt5934 >> 9) + " z:" + (Class295.myPlayer.anInt5940 >> 9));
                    return;
                }
                if (string.equalsIgnoreCase("getheight")) {
                    Node_Sub7.method2422((byte) 43,
                            "Height: " + Class320_Sub10.aPlaneArray8300[Class295.myPlayer.plane].method3251(
                                    Class295.myPlayer.anInt5940 >> 9, Class295.myPlayer.anInt5934 >> 9, (byte) -118));
                    return;
                }
                if (string.equalsIgnoreCase("resetminimap")) {
                    Node_Sub38_Sub39.aClass302_10500.method3523((byte) -46);
                    Node_Sub38_Sub39.aClass302_10500.method3521((byte) -18);
                    Node_Sub54.aClass338_7671.method3908(-32478);
                    Class304.aClass215_3834.method2071(7);
                    Node_Sub18.method2606(126);
                    Node_Sub7.method2422((byte) 43, "Minimap reset");
                    return;
                }
                if (string.startsWith("mc")) {
                    if (Class93.aGraphicsToolkit1241.s()) {
                        int i_20_ = Integer.parseInt(string.substring(3));
                        if ((i_20_ ^ 0xffffffff) <= -2) {
                            if ((i_20_ ^ 0xffffffff) < -5) {
                                i_20_ = 4;
                            }
                        } else {
                            i_20_ = 1;
                        }
                        Class244.anInt3081 = i_20_;
                        Class243.method3061(7);
                        Node_Sub7.method2422((byte) 43, "Render cores now: " + Class244.anInt3081);
                    } else {
                        Node_Sub7.method2422((byte) 43, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    return;
                }
                if (string.startsWith("cachespace")) {
                    Node_Sub7.method2422((byte) 43, "I(s): " + Class252.aClass61_3190.method595(1188) + "/"
                                                    + Class252.aClass61_3190.method597(22349));
                    Node_Sub7.method2422((byte) 43, "I(m): " + Class166.aClass61_5097.method595(1188) + "/"
                                                    + Class166.aClass61_5097.method597(22349));
                    Node_Sub7.method2422((byte) 43,
                            "O(s): " + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method201(48) + "/"
                            + EntityNode_Sub3_Sub1.aClass86_9166.aClass12_1179.method200(0));
                    return;
                }
                if (string.equals("renderprofile") || string.equals("rp")) {
                    Class186.aBoolean2259 = !Class186.aBoolean2259;
                    Class93.aGraphicsToolkit1241.b(Class186.aBoolean2259);
                    Class64.method712(25053);
                    Node_Sub7.method2422((byte) 43, "showprofiling=" + Class186.aBoolean2259);
                    return;
                }
                if (string.startsWith("performancetest")) {
                    int i_21_ = -1;
                    int i_22_ = 1000;
                    if (string.length() > 15) {
                        String[] strings = Class106.method1120((byte) -128, string, ' ');
                        try {
                            if ((strings.length ^ 0xffffffff) < -2) {
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
                    if ((i_21_ ^ 0xffffffff) != 0) {
                        Node_Sub7.method2422((byte) 43, "Performance: " + Class194.method1961(i_22_, i_21_, 13968));
                    } else {
                        Node_Sub7.method2422((byte) 43, "Java toolkit: " + Class194.method1961(i_22_, 0, 13968));
                        Node_Sub7.method2422((byte) 43, "SSE toolkit:  " + Class194.method1961(i_22_, 2, 13968));
                        Node_Sub7.method2422((byte) 43, "D3D toolkit:  " + Class194.method1961(i_22_, 3, 13968));
                        Node_Sub7.method2422((byte) 43, "GL toolkit:   " + Class194.method1961(i_22_, 1, 13968));
                        Node_Sub7.method2422((byte) 43, "GLX toolkit:  " + Class194.method1961(i_22_, 5, 13968));
                        return;
                    }
                    return;
                }
                if (string.equals("nonpcs")) {
                    Node_Sub29.aBoolean7338 = !Node_Sub29.aBoolean7338;
                    Node_Sub7.method2422((byte) 43, "nonpcs=" + Node_Sub29.aBoolean7338);
                    return;
                }
                if (string.equals("autoworld")) {
                    EntityNode.method802(2126);
                    Node_Sub7.method2422((byte) 43, "auto world selected");
                    return;
                }
                if (string.startsWith("switchworld")) {
                    int i_23_ = Integer.parseInt(string.substring(12));
                    Class188_Sub1_Sub2.method1899(i_23_, (byte) 27, Class327.method3823(100, i_23_).aString8773);
                    Node_Sub7.method2422((byte) 43, "switched");
                    return;
                }
                if (string.equals("getworld")) {
                    Node_Sub7.method2422((byte) 43, "w: " + Class181.aClass197_2155.id);
                    return;
                }
                if (string.startsWith("pc")) {
                    Class123 class123 = Class262_Sub23.method3213((byte) -60);
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class133.aClass318_1687,
                            class123.anIsaacCipher1571);
                    node_sub13.aPacket7113.writeByte(0);
                    int i_24_ = node_sub13.aPacket7113.offset;
                    int i_25_ = string.indexOf(" ", 4);
                    node_sub13.aPacket7113.writeString(string.substring(3, i_25_));
                    Class194_Sub3.method1975(69, node_sub13.aPacket7113, string.substring(i_25_));
                    node_sub13.aPacket7113.method2217(-i_24_ + node_sub13.aPacket7113.offset);
                    class123.sendPacket(126, node_sub13);
                    return;
                }
                if (string.equals("savevarcs")) {
                    Class144.method1631((byte) 125);
                    Node_Sub7.method2422((byte) 43, "perm varcs saved");
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
                    Node_Sub7.method2422((byte) 43, "perm varcs scrambled");
                    return;
                }
                if (string.equals("showcolmap")) {
                    Class320_Sub3.aBoolean8235 = true;
                    Node_Sub18.method2606(126);
                    Node_Sub7.method2422((byte) 43, "colmap is shown");
                    return;
                }
                if (string.equals("hidecolmap")) {
                    Class320_Sub3.aBoolean8235 = false;
                    Node_Sub18.method2606(126);
                    Node_Sub7.method2422((byte) 43, "colmap is hidden");
                    return;
                }
                if (string.equals("resetcache")) {
                    Node_Sub36_Sub2.method2761((byte) 125);
                    Node_Sub7.method2422((byte) 43, "Caches reset");
                    return;
                }
                if (string.equals("profilecpu")) {
                    Node_Sub7.method2422((byte) 43, String.valueOf(CacheNode_Sub4.method2302((byte) 88)) + "ms");
                    return;
                }
                if (string.startsWith("getclientvarpbit")) {
                    int i_27_ = Integer.parseInt(string.substring(17));
                    Node_Sub7.method2422((byte) 43, "varpbit=" + Class24.aClass275_442.method64(i_27_, (byte) -42));
                    return;
                }
                if (string.startsWith("getclientvarp")) {
                    int i_28_ = Integer.parseInt(string.substring(14));
                    Node_Sub7.method2422((byte) 43, "varp=" + Class24.aClass275_442.method65(i_28_, 107));
                    return;
                }
                if (string.startsWith("directlogin")) {
                    String[] strings = Class106.method1120((byte) 115, string.substring(12), ' ');
                    if (strings.length >= 2) {
                        int i_29_ = (strings.length ^ 0xffffffff) < -3 ? Integer.parseInt(strings[2]) : 0;
                        Class39.method415(i_29_, strings[1], strings[0], 106);
                        return;
                    }
                }
                if (string.startsWith("snlogin ")) {
                    String[] strings = Class106.method1120((byte) -110, string.substring(8), ' ');
                    int i_30_ = Integer.parseInt(strings[0]);
                    int i_31_ = strings.length == 2 ? Integer.parseInt(strings[1]) : 0;
                    Animable.method822(i_30_, i_31_, 4);
                    return;
                }
                if (string.startsWith("csprofileclear")) {
                    ClientScriptsExecutor.method3564();
                    return;
                }
                if (string.startsWith("csprofileoutputc")) {
                    ClientScriptsExecutor.method3554(100, false);
                    return;
                }
                if (string.startsWith("csprofileoutputt")) {
                    ClientScriptsExecutor.method3554(10, true);
                    return;
                }
                if (string.startsWith("texsize")) {
                    int i_32_ = Integer.parseInt(string.substring(8));
                    Class93.aGraphicsToolkit1241.f(i_32_);
                    return;
                }
                if (string.equals("soundstreamcount")) {
                    Node_Sub7.method2422((byte) 43, "Active streams: " + Class176.aNode_Sub9_Sub3_2106.method2512());
                    return;
                }
                if (string.equals("autosetup")) {
                    Node_Sub41.method2931((byte) -103);
                    Node_Sub7.method2422((byte) 43, "Complete. Toolkit now: "
                                                    + Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false));
                    return;
                }
                if (string.equals("errormessage")) {
                    Node_Sub7.method2422((byte) 43, Class158.aClient1983.method100(10));
                    return;
                }
                if (string.equals("heapdump")) {
                    if (!SignLink.aString3981.startsWith("win")) {
                        AbstractToolkit.method1272(0, new File("/tmp/heap.dump"), false);
                    } else {
                        AbstractToolkit.method1272(0, new File("C:\\Temp\\heap.dump"), false);
                    }
                    Node_Sub7.method2422((byte) 43, "Done");
                    return;
                }
                if (string.equals("os")) {
                    Node_Sub7.method2422((byte) 43, "Name: " + SignLink.aString3981);
                    Node_Sub7.method2422((byte) 43, "Arch: " + SignLink.aString3984);
                    Node_Sub7.method2422((byte) 43, "Ver: " + SignLink.aString3982);
                    return;
                }
                if (string.startsWith("w2debug")) {
                    int i_33_ = Integer.parseInt(string.substring(8, 9));
                    Node_Sub9_Sub5.anInt9766 = i_33_;
                    Class243.method3061(7);
                    Node_Sub7.method2422((byte) 43, "Toggled!");
                    return;
                }
                if (string.startsWith("ortho ")) {
                    int i_34_ = string.indexOf(' ');
                    if ((i_34_ ^ 0xffffffff) > -1) {
                        Node_Sub7.method2422((byte) 43, "Syntax: ortho <n>");
                    } else {
                        int i_35_ = Class350.method3998(string.substring(i_34_ + 1), -1);
                        Class213.aNode_Sub27_2512.method2690(119, i_35_, Class213.aNode_Sub27_2512.aClass320_Sub3_7298);
                        Node_Sub38_Sub31.method2893(1);
                        Class269.aBoolean3472 = false;
                        Class34_Sub1.method378(-4);
                        if (i_35_ != Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false)) {
                            Node_Sub7.method2422((byte) 43, "Failed to change ortho mode");
                        } else {
                            Node_Sub7.method2422((byte) 43, "Successfully changed ortho mode");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthozoom ")) {
                    if ((Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false) ^ 0xffffffff) == -1) {
                        Node_Sub7.method2422((byte) 43, "enable ortho mode first (use 'ortho <n>')");
                    } else {
                        int i_36_ = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
                        Class308.anInt3916 = i_36_;
                        Node_Sub7.method2422((byte) 43, "orthozoom=" + Class308.anInt3916);
                        return;
                    }
                    return;
                }
                if (string.startsWith("orthotilesize ")) {
                    int i_37_ = Class350.method3998(string.substring(1 + string.indexOf(' ')), -1);
                    Class22.anInt432 = Node_Sub36_Sub1.anInt10039 = i_37_;
                    Node_Sub7.method2422((byte) 43, "ortho tile size=" + i_37_);
                    Class34_Sub1.method378(-4);
                    return;
                }
                if (string.equals("orthocamlock")) {
                    Class336_Sub2.aBoolean8588 = !Class336_Sub2.aBoolean8588;
                    Node_Sub7.method2422((byte) 43,
                            "ortho camera lock is " + (Class336_Sub2.aBoolean8588 ? "on" : "off"));
                    return;
                }
                if (string.startsWith("skydetail ")) {
                    int i_38_ = Class350.method3998(string.substring(string.indexOf(' ') - -1), -1);
                    Class213.aNode_Sub27_2512.method2690(36, i_38_, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
                    Node_Sub7.method2422((byte) 43, "skydetail is " + (
                            Class213.aNode_Sub27_2512.aClass320_Sub2_7272.method3686(false) != 0 ? "high" : "low"));
                    return;
                }
                if (string.startsWith("setoutput ")) {
                    File file = new File(string.substring(10));
                    if (file.exists()) {
                        file = new File(string.substring(10) + "." + Class313.method3650(false) + ".log");
                        if (file.exists()) {
                            Node_Sub7.method2422((byte) 43, "file already exists!");
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
                        Node_Sub7.method2422((byte) 43, "Could not create " + file.getName());
                    } catch (SecurityException securityexception) {
                        Node_Sub7.method2422((byte) 43, "Cannot write to " + file.getName());
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
                        Node_Sub7.method2422((byte) 43, "No such file");
                        return;
                    }
                    byte[] bs = Class337.method3904((byte) 113, file);
                    if (bs == null) {
                        Node_Sub7.method2422((byte) 43, "Failed to read file");
                        return;
                    }
                    String[] strings = Class106.method1120((byte) -57, Class197.method1998(Class329.method3835(bs,
                            true), "", (byte) 26, '\r'), '\n');
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
                    if ((string.length() ^ 0xffffffff) >= -10 || (string.charAt(8) ^ 0xffffffff) != -33) {
                        ClientScriptsExecutor.aString3870 = null;
                        ClientScriptsExecutor.aBoolean3868 = !ClientScriptsExecutor.aBoolean3868;
                        Node_Sub7.method2422((byte) 43, "cs2debug:" + ClientScriptsExecutor.aBoolean3868);
                    } else {
                        ClientScriptsExecutor.aString3870 = string.substring(9);
                        ClientScriptsExecutor.aBoolean3868 = true;
                        Node_Sub7.method2422((byte) 43, "cs2debug: (" + ClientScriptsExecutor.aString3870 + ")");
                        return;
                    }
                    return;
                }
                if ((Class151.anInt1843 ^ 0xffffffff) == -12) {
                    CacheNode_Sub6.anInt9483++;
                    Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class247.aClass318_3130,
                            Class218.aClass123_2566.anIsaacCipher1571);
                    node_sub13.aPacket7113.writeByte(3 + string.length());
                    node_sub13.aPacket7113.writeByte(!bool ? 0 : 1);
                    node_sub13.aPacket7113.writeByte(bool_11_ ? 1 : 0);
                    node_sub13.aPacket7113.writeString(string);
                    Class218.aClass123_2566.sendPacket(127, node_sub13);
                }
                if (string.startsWith("fps ") && Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943) {
                    Class384.method4203(Class350.method3998(string.substring(4), -1), 0);
                    return;
                }
            } catch (Exception exception) {
                Node_Sub7.method2422((byte) 43, Class22.aClass22_365.method297(Class35.language));
                return;
            }
        }
        if (Class151.anInt1843 != 11) {
            Node_Sub7.method2422((byte) 43, Class22.aClass22_366.method297(Class35.language) + string);
        }
    }

    static final void method1539(boolean bool, String string, byte b) {
        anInt1622++;
        if (string != null) {
            if ((Class235.anInt5122 ^ 0xffffffff) <= -101) {
                Class41.method436(b ^ ~0x7326, Class22.aClass22_402.method297(Class35.language), 4);
            } else {
                String string_39_ = Node_Sub25_Sub3.method2671(-13472, string);
                if (string_39_ != null) {
                    for (int i = 0; Class235.anInt5122 > i; i++) {
                        String string_40_ = Node_Sub25_Sub3.method2671(-13472, Class338.aStringArray4197[i]);
                        if (string_40_ != null && string_40_.equals(string_39_)) {
                            Class41.method436(29459, string + Class22.aClass22_403.method297(Class35.language), 4);
                            return;
                        }
                        if (Class7.aStringArray164[i] != null) {
                            String string_41_ = Node_Sub25_Sub3.method2671(b + -13418, Class7.aStringArray164[i]);
                            if (string_41_ != null && string_41_.equals(string_39_)) {
                                Class41.method436(29459, string + Class22.aClass22_403.method297(Class35.language), 4);
                                return;
                            }
                        }
                    }
                    for (int i = 0; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
                        String string_42_ = Node_Sub25_Sub3.method2671(b ^ 0x34aa, Class262_Sub12.aStringArray7793[i]);
                        if (string_42_ != null && string_42_.equals(string_39_)) {
                            Class41.method436(29459, Class22.aClass22_408.method297(Class35.language) + string
                                                     + Class22.aClass22_409.method297(Class35.language), 4);
                            return;
                        }
                        if (Plane.aStringArray3403[i] != null) {
                            String string_43_ = Node_Sub25_Sub3.method2671(-13472, Plane.aStringArray3403[i]);
                            if (string_43_ != null && string_43_.equals(string_39_)) {
                                Class41.method436(29459, Class22.aClass22_408.method297(Class35.language) + string
                                                         + Class22.aClass22_409.method297(Class35.language), 4);
                                return;
                            }
                        }
                    }
                    if (Node_Sub25_Sub3.method2671(-13472, Class295.myPlayer.username).equals(string_39_)) {
                        Class41.method436(29459, Class22.aClass22_405.method297(Class35.language), 4);
                    } else {
                        Class239.anInt2927++;
                        Class123 class123 = Class262_Sub23.method3213((byte) -95);
                        Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class320_Sub3.aClass318_8233,
                                class123.anIsaacCipher1571);
                        node_sub13.aPacket7113.writeByte(method1536(-20826, string) + 1);
                        if (b != -54) {
                            anInt1631 = -43;
                        }
                        node_sub13.aPacket7113.writeString(string);
                        node_sub13.aPacket7113.writeByte(!bool ? 0 : 1);
                        class123.sendPacket(127, node_sub13);
                    }
                }
            }
        }
    }

    private Class126(int i, int i_44_, Class372 class372) {
        anInt1612 = i_44_;
        aClass372_1617 = class372;
        anInt1621 = i;
        anInt1624 = anInt1612 * aClass372_1617.anInt4591;
        if ((anInt1621 ^ 0xffffffff) <= -17) {
            throw new RuntimeException();
        }
    }
}
