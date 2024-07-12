/* Class262_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub3 extends Class262 {
    private final int anInt7711;
    private final int anInt7712;
    static int[] anIntArray7713 = new int[5];
    private final int anInt7714;
    static Index aClass302_7715;
    static int anInt7716;
    private final int anInt7717;
    private final int anInt7718;
    static int anInt7719;
    static int anInt7720;

    static int method3156(int i) {
        if (i < 56) {
            return 118;
        }
        anInt7719++;
        return Class251.anInt3185;
    }

    Class262_Sub3(BufferedStream buffer) {
        super(buffer);
        anInt7718 = buffer.readUnsignedShort();
        int i = buffer.readInt();
        anInt7711 = i >>> 16;
        anInt7714 = 0xffff & i;
        anInt7712 = buffer.readUnsignedByte();
        anInt7717 = buffer.method2197();
    }

    static boolean method3157(int i) {
        anInt7720++;
        return !(i != 1 && i != 3 && i != 5);
    }

    public static void method3158() {
        aClass302_7715 = null;

        anIntArray7713 = null;
    }

    final void method3148(int i) {
        Class121.aClass206Array1529[anInt7718].method2038(anInt7717, anInt7712, anInt7711, anInt7714);
        if (i > -102) {
            method3156(-127);
        }
        anInt7716++;
    }
}
