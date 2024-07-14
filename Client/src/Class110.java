/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110 {
    static int anInt1377;
    private final int anInt1378;
    protected Translation aTranslation_1379;
    static int anInt1380;
    static int anInt1381;
    protected int loadPercentage;
    protected int anInt1383;
    static Class110 aClass110_1384 = new Class110(0, Translation.aTranslation_379, Translation.aTranslation_379, 0, 1);
    static int anInt1385;
    static int anInt1386;
    protected boolean aBoolean1387;
    static int anInt1388;
    protected Translation aTranslation_1389;
    static Class110 aClass110_1390 = new Class110(1, Translation.aTranslation_379, 2);
    static int anInt1391;
    static Class110 aClass110_1392 = new Class110(2, Translation.aTranslation_379, Translation.aTranslation_379, 2, 3);
    protected boolean aBoolean1393;
    static Class110 aClass110_1394 = new Class110(3, Translation.aTranslation_379, 3);
    static Class110 aClass110_1395 = new Class110(4, Translation.aTranslation_379, Translation.aTranslation_379, 3, 4);
    static Class110 aClass110_1396 = new Class110(5, Translation.aTranslation_379, 4);
    static Class110 aClass110_1397 = new Class110(6, Translation.aTranslation_379, 4);
    static Class110 aClass110_1398 = new Class110(7, Translation.aTranslation_379, Translation.aTranslation_379, 4, 5);
    static Class110 aClass110_1399 = new Class110(8, Translation.aTranslation_379, Translation.aTranslation_379, 5, 98, true);
    static Class110 aClass110_1400 = new Class110(9, Translation.aTranslation_379, 99);
    static Class110 aClass110_1401 = new Class110(10, Translation.aTranslation_379, 100);
    static Class110 aClass110_1402 = new Class110(11, Translation.aTranslation_380, Translation.aTranslation_380, 0, 92, true);
    static Class110 aClass110_1403 = new Class110(12, Translation.aTranslation_380, Translation.aTranslation_380, 92, 92);
    private static Class110 aClass110_1404 = new Class110(13, Translation.aTranslation_380, Translation.aTranslation_380, 92, 93);
    static Class110 aClass110_1405 = new Class110(14, Translation.aTranslation_380, Translation.aTranslation_380, 94, 95);
    static Class110 aClass110_1406 = new Class110(15, Translation.aTranslation_380, Translation.aTranslation_380, 96, 97);
    static Class110 aClass110_1407 = new Class110(16, Translation.aTranslation_380, 97);
    static Class110 aClass110_1408 = new Class110(17, Translation.aTranslation_380, 97);
    static Class110 aClass110_1409 = new Class110(18, Translation.aTranslation_380, 100);
    static Class110 aClass110_1410 = new Class110(19, Translation.aTranslation_380, 100);
    static Class110 aClass110_1411 = new Class110(20, Translation.aTranslation_380, 100);
    static int anInt1412 = 0;
    /*synthetic*/ static Class<?> aClass1413;

    static void method1129() {
        anInt1391++;
        Class105.aClass61_5202.method598(5);
    }

    private Class110(int i, Translation translation, int i_0_) {
        this(i, translation, translation, i_0_, i_0_, false);
    }

    public final String toString() {
        anInt1385++;
        throw new IllegalStateException();
    }

    private Class110(int i, Translation translation, Translation translation_1_, int i_2_, int i_3_) {
        this(i, translation, translation_1_, i_2_, i_3_, false);
    }

    final int method1130() {
        anInt1377++;
        return anInt1378;
    }

    static void method1131(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_10_) {
        anInt1381++;
        if (i_7_ >= 0 && i_4_ >= 0 && -1 + Node_Sub54.GAME_SCENE_WDITH > i_7_ && i_4_ < Class377_Sub1.GAME_SCENE_HEIGHT - 1) {
            if (Class175.aClass261ArrayArrayArray2099 == null) {
                return;
            }
            if (i_10_ == 0) {
                Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i, i_7_, i_4_);
                Interface19 interface19_11_ = (Interface19) Class328.method3827(i, i_7_, i_4_);
                if (interface19 != null && i_5_ != 2) {
                    if (interface19 instanceof Animable_Sub2_Sub1) {
                        ((Animable_Sub2_Sub1) interface19).aClass310_10632.method3591(i_6_);
                    } else {
                        Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, interface19.method72(-32136));
                    }
                }
                if (interface19_11_ != null) {
                    if (interface19_11_ instanceof Animable_Sub2_Sub1) {
                        ((Animable_Sub2_Sub1) interface19_11_).aClass310_10632.method3591(i_6_);
                    } else {
                        Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, interface19_11_.method72(-32136));
                    }
                }
            } else if (i_10_ == 1) {
                Interface19 interface19 = (Interface19) CacheNode_Sub8.method2320(i, i_7_, i_4_);
                if (interface19 != null) {
                    if (interface19 instanceof Animable_Sub4_Sub2) {
                        ((Animable_Sub4_Sub2) interface19).aClass310_10794.method3591(i_6_);
                    } else {
                        int i_12_ = interface19.method72(-32136);
                        if (i_5_ == 4 || i_5_ == 5) {
                            Class128.method1544(i_4_, 4, i_8_, i_7_, i_6_, i_10_, i, i_12_);
                        } else if (i_5_ == 6) {
                            Class128.method1544(i_4_, 4, i_8_ + 4, i_7_, i_6_, i_10_, i, i_12_);
                        } else if (i_5_ == 7) {
                            Class128.method1544(i_4_, 4, (0x3 & i_8_ + 2) + 4, i_7_, i_6_, i_10_, i, i_12_);
                        } else if (i_5_ == 8) {
                            Class128.method1544(i_4_, 4, 4 + i_8_, i_7_, i_6_, i_10_, i, i_12_);
                            Class128.method1544(i_4_, 4, (2 + i_8_ & 0x3) + 4, i_7_, i_6_, i_10_, i, i_12_);
                        }
                    }
                }
            } else if (i_10_ == 2) {
                Interface19 interface19 = (Interface19) Class262_Sub20.method3203(i, i_7_, i_4_, aClass1413 != null ? aClass1413 : (aClass1413 = method1136()));
                if (interface19 != null) {
                    if (i_5_ == 11) {
                        i_5_ = 10;
                    }
                    if (interface19 instanceof Mobile_Sub3) {
                        ((Mobile_Sub3) interface19).aClass310_10777.method3591(i_6_);
                    } else {
                        Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, interface19.method72(-32136));
                    }
                }
            } else if (i_10_ == 3) {
                Interface19 interface19 = (Interface19) Class270_Sub1_Sub1.method3303(i, i_7_, i_4_);
                if (interface19 != null) {
                    if (interface19 instanceof Animable_Sub1_Sub2) {
                        ((Animable_Sub1_Sub2) interface19).aClass310_10652.method3591(i_6_);
                    } else {
                        Class128.method1544(i_4_, i_5_, i_8_, i_7_, i_6_, i_10_, i, interface19.method72(-32136));
                    }
                }
            }
        }
    }

    static void method1132(boolean bool, boolean bool_13_) {
        anInt1388++;
        if (bool_13_) {
            Class233.anInt2783++;
            Class262_Sub11.method3176();
        }
        if (bool) {
            Class108.anInt5283++;
            Class246.method3073(113);
        }
    }

    static Class110[] method1133() {
        anInt1386++;

        return new Class110[]{aClass110_1384, aClass110_1390, aClass110_1392, aClass110_1394, aClass110_1395, aClass110_1396, aClass110_1397, aClass110_1398, aClass110_1399, aClass110_1400, aClass110_1401, aClass110_1402, aClass110_1403, aClass110_1404, aClass110_1405, aClass110_1406, aClass110_1407, aClass110_1408, aClass110_1409, aClass110_1410, aClass110_1411};
    }

    public static void method1134() {
        aClass110_1384 = null;
        aClass110_1396 = null;
        aClass110_1411 = null;
        aClass110_1390 = null;
        aClass110_1395 = null;
        aClass110_1394 = null;
        aClass110_1392 = null;
        aClass110_1404 = null;
        aClass110_1401 = null;
        aClass110_1403 = null;
        aClass110_1409 = null;
        aClass110_1397 = null;
        aClass110_1402 = null;
        aClass110_1400 = null;
        aClass110_1398 = null;
        aClass110_1410 = null;
        aClass110_1406 = null;
        aClass110_1405 = null;
        aClass110_1408 = null;
        aClass110_1399 = null;
        aClass110_1407 = null;
    }

    private Class110(int i, Translation translation, Translation translation_14_, int i_15_, int i_16_, boolean bool_17_) {
        anInt1383 = i_15_;
        aBoolean1387 = true;
        loadPercentage = i_16_;
        aBoolean1393 = bool_17_;
        aTranslation_1389 = translation_14_;
        aTranslation_1379 = translation;
        anInt1378 = i;
    }

    static boolean method1135(int i, int i_18_) {
        anInt1380++;
        if (!Class320_Sub4.method3693(75, i)) {
            return false;
        }
        if ((0xb000 & i) != 0 | CacheNode_Sub3.method2296(i) | Class320_Sub7.method3711(i)) {
            return true;
        }
        return (Class73.method749(i) | Class214.method2060(i, i_18_, 116)) & (0x37 & i_18_) == 0;
    }

    /*synthetic*/
    static Class<?> method1136() {
        Class<?> var_class;
        try {
            var_class = Class.forName("Interface19");
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
