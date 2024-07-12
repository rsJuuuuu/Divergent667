/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44 {
    static int anInt666;
    static Class383 aClass383_667;
    static GraphicsToolkit aGraphicsToolkit668;
    static Class270 aClass270_669;
    static Class119 aClass119_670;

    public static void method460() {
        aClass119_670 = null;
        aClass270_669 = null;
        aClass383_667 = null;
        aGraphicsToolkit668 = null;
    }

    static Class357 method461(int i_1_, Index class302) {
        anInt666++;
        byte[] bs = class302.method3524(0, i_1_);
        if (bs == null) {
            return null;
        }
        return new Class357(bs);
    }
}
