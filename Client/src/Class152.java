/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class152 {
    protected int anInt1934;
    protected int anInt1935;
    protected int anInt1936;
    protected int anInt1937;
    static int anInt1938;
    static IncommingPacket aClass192_1939 = new IncommingPacket(65, 6);
    static SignLink aSignLink1940;
    static int anInt1941 = -2;
    static boolean aBoolean1942 = false;

    public static void method1694() {
        aClass192_1939 = null;
        aSignLink1940 = null;

    }

    static Class224 method1695(boolean bool, Index class302, String string) {
        anInt1938++;
        int i_0_ = class302.method3519(string, (byte) 84);
        if (i_0_ == -1) {
            return new Class224(0);
        }
        int[] is = class302.method3532(i_0_);
        Class224 class224 = new Class224(Objects.requireNonNull(is).length);
        int i_1_ = 0;
        int i_2_ = 0;
        while (class224.anInt2670 > i_1_) {
            BufferedStream buffer = new BufferedStream(class302.method3524(is[i_2_++], i_0_));
            int i_3_ = buffer.readInt();
            int i_4_ = buffer.readUnsignedShort();
            int i_5_ = buffer.readUnsignedByte();
            if (!bool && i_5_ == 1) {
                class224.anInt2670--;
            } else {
                class224.anIntArray2668[i_1_] = i_3_;
                class224.anIntArray2669[i_1_] = i_4_;
                i_1_++;
            }
        }
        return class224;
    }
}
