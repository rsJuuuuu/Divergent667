/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class260 implements Interface10 {
    private final Class205 aClass205_5219;
    static int anInt5220;
    static int anInt5221;
    static int anInt5222;
    static int anInt5223;
    static int anInt5224;
    static Class77 aClass77_5225 = new Class77();
    static int anInt5226;
    private final Class337 aClass337_5227;
    static int anInt5228;
    static int anInt5229;
    static Class124 aClass124_5230 = new Class124(51);
    static int anInt5231;

    private int method3135(Class52 class52, String string, int i, int i_1_) {
        anInt5222++;
        return class52.method535(0, aClass205_5219.anInt5105, string, null, 5 + i_1_, aClass205_5219.anInt5111, 92, 0, 0, i + 5, 0, 0, aClass205_5219.anInt5112 - 10, aClass205_5219.anInt5103 - (10));
    }

    static int method3136(Class94 class94) {
        anInt5220++;
        if (class94 == Class117_Sub1.aClass94_4924) {
            return 7681;
        } else if (class94 == Class116.aClass94_5075) {
            return 8448;
        } else if (class94 == Class385.aClass94_4911) {
            return 34165;
        } else if (class94 == Class236.aClass94_2898) {
            return 260;
        } else if (GameStub.aClass94_11 == class94) {
            return 34023;
        }
        throw new IllegalArgumentException();
    }

    public final void method27(boolean bool, int i) {

        anInt5224++;
        Class295 class295 = aClass337_5227.method3902(aClass205_5219.anInt5114);
        if (class295 != null) {
            int i_3_ = aClass205_5219.aClass379_5109.method4160(-106, Node_Sub38_Sub12.anInt10225, aClass205_5219.anInt5112) + aClass205_5219.anInt5113;
            int i_4_ = aClass205_5219.aClass77_5106.method775(Class257.anInt3244, aClass205_5219.anInt5103) + aClass205_5219.anInt5110;
            if (aClass205_5219.aBoolean5102) {
                Class93.aGraphicsToolkit1241.d(i_3_, i_4_, aClass205_5219.anInt5112, aClass205_5219.anInt5103, aClass205_5219.anInt5107, 0);
            }
            i_4_ += 12 * method3135(Class262_Sub4.aClass52_7721, class295.aString3694, i_3_, i_4_);
            i_4_ += 8;
            if (aClass205_5219.aBoolean5102) {
                Class93.aGraphicsToolkit1241.a(i_3_, i_4_, -1 + aClass205_5219.anInt5112 + i_3_, i_4_, aClass205_5219.anInt5107, 0);
            }
            i_4_ = ++i_4_ + 12 * method3135(Class262_Sub4.aClass52_7721, class295.aString3697, i_3_, i_4_);
            i_4_ += 5;
            i_4_ += 12 * method3135(Class262_Sub4.aClass52_7721, class295.aString3691, i_3_, i_4_);
        }
    }

    static void method3137() {
        anInt5231++;
        GameStub.method88((byte) -96);
        Class213.aBoolean2510 = false;
        Class310.method3589(Class362.anInt4492, Node_Sub6.anInt7043, (byte) 107, Class219.anInt2627, Client.anInt5481);
    }

    public static void method3138() {
        aClass124_5230 = null;
        aClass77_5225 = null;
    }

    static Class<?> method3139(String string, int i) throws ClassNotFoundException {
        anInt5229++;
        if (string.equals("B")) {
            return Byte.TYPE;
        }
        if (string.equals("I")) {
            return Integer.TYPE;
        }
        if (string.equals("S")) {
            return Short.TYPE;
        }
        if (string.equals("J")) {
            return Long.TYPE;
        }
        if (string.equals("Z")) {
            return Boolean.TYPE;
        }
        if (string.equals("F")) {
            return Float.TYPE;
        }
        if (i != 51) {
            aClass77_5225 = null;
        }
        if (string.equals("D")) {
            return Double.TYPE;
        }
        if (string.equals("C")) {
            return Character.TYPE;
        }
        return Class.forName(string);
    }

    public final void method26(int i) {
        if (i != 99) {
            aClass77_5225 = null;
        }
        anInt5221++;
    }

    static ClientScript getClientScript(int i, int i_5_) {
        anInt5223++;
        ClientScript cachenode_sub9 = (ClientScript) Class258.aClass335_5293.method3849(i);
        if (cachenode_sub9 != null) {
            return cachenode_sub9;
        }
        byte[] data = Class21.aClass302_357.method3524(0, i);
        if (data == null || data.length <= 1) {
            return null;
        }
        try {
            cachenode_sub9 = Class32.method356(data);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + i);
        }
        Class258.aClass335_5293.method3848((byte) -115, cachenode_sub9, i);
        if (i_5_ > -108) {
            aClass124_5230 = null;
        }
        return cachenode_sub9;
    }

    public final boolean method25(int i) {
        anInt5226++;
        if (i != 421) {
            method27(true, 15);
        }
        return aClass337_5227.method3905();
    }

    Class260(Class337 class337, Class205 class205) {
        aClass205_5219 = class205;
        aClass337_5227 = class337;
    }
}
