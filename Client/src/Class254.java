/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class254 {
    static int anInt3206;
    static int anInt3207;
    protected int anInt3208 = 1;
    static int anInt3209;
    protected char aChar3210;
    static int anInt3211;
    static int anInt3212;
    static float[] aFloatArray3213 = new float[4];

    private void method3107(int i, BufferedStream buffer) {
        anInt3207++;
        if (i == 1) {
            aChar3210 = Class20_Sub1.method294(buffer.readByte(), (byte) 121);
        } else if (i == 2) {
            anInt3208 = 0;
        }
    }

    static void method3108(int i, int i_0_) {
        Node_Sub43.anInt7539 = i;
        if (i_0_ != 4) {
            method3108(32, 71);
        }
        anInt3206++;
    }

    final void method3109(BufferedStream buffer) {

        for (; ; ) {
            int i_1_ = buffer.readUnsignedByte();
            if (i_1_ == 0) {
                break;
            }
            method3107(i_1_, buffer);
        }
        anInt3211++;
    }

    public static void method3110() {
        aFloatArray3213 = null;
    }
}
