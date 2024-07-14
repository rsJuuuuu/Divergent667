/* Class188_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class188_Sub1 extends Class188 {
    static Index aClass302_6849;
    static int anInt6850;
    private int anInt6851;
    static int anInt6852;
    private final int anInt6853;
    private int anInt6854;
    private final int anInt6855;
    static int anInt6856;
    static int anInt6857;
    private int anInt6858;
    static int[] SKILL_XP = new int[25];
    private final int anInt6860;
    private int anInt6863;
    static int anInt6864 = 2;
    static int anInt6865;

    void method1891(int i, byte b) {
        anInt6850++;
    }

    Class188_Sub1() {
        super(8, 8, 8);
        anInt6860 = (int) ((float) 0.55 * 4096.0F);
        anInt6855 = (int) ((float) 3.0 * 4096.0F);
        anInt6851 = anInt6853 = (int) (Math.pow(0.5, -0.1f) * 4096.0);
    }

    final void method1887(int i, int i_7_) {
        int anInt6862;
        if (i_7_ == 0) {
            anInt6863 = anInt6860 - (i >= 0 ? i : -i);
            anInt6863 = anInt6863 * anInt6863 >> 12;
            anInt6854 = anInt6863;
        } else {
            anInt6862 = anInt6863 * anInt6855 >> 12;
            anInt6863 = -(i < 0 ? -i : i) + anInt6860;
            if (anInt6862 < 0) {
                anInt6862 = 0;
            } else if (anInt6862 > 4096) {
                anInt6862 = 4096;
            }
            anInt6863 = anInt6863 * anInt6863 >> 12;
            anInt6863 = anInt6863 * anInt6862 >> 12;
            anInt6854 += anInt6851 * anInt6863 >> 12;
            anInt6851 = anInt6853 * anInt6851 >> 12;
        }
        anInt6856++;
    }

    final void method1886() {
        anInt6851 = anInt6853;
        anInt6854 >>= 4;
        anInt6865++;
        if (anInt6854 < 0) {
            anInt6854 = 0;
        } else if (anInt6854 > 255) {
            anInt6854 = 255;
        }
        method1891(anInt6858++, (byte) anInt6854);
        anInt6854 = 0;
    }

    final void method1890() {
        anInt6857++;
        anInt6854 = 0;
        anInt6858 = 0;
    }

    public static void method1892() {
        SKILL_XP = null;
        aClass302_6849 = null;
    }
}
