/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class63 {
    static IncommingPacket aClass192_920;
    static int anInt921;
    static Class363 aClass363_922;
    static int anInt923 = 0;
    static IncommingPacket aClass192_924;

    static Class84 method707(int i, int i_0_) {
        anInt921++;
        Class84 class84 = new Class84();
        class84.anInt1139 = -1;
        class84.anInt1135 = -1;
        class84.anInt1133 = i + 6;
        class84.anInt1146 = 5 + i_0_ + 1;
        class84.clipMasks = new int[class84.anInt1133][class84.anInt1146];
        class84.method991(-88);
        return class84;
    }

    public static void method708() {
        aClass363_922 = null;
        aClass192_920 = null;
        aClass192_924 = null;
    }

    static {
        aClass192_920 = new IncommingPacket(60, 7);
        aClass192_924 = new IncommingPacket(75, 3);
    }
}
