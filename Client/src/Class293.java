/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class293 {
    static int anInt3680;
    static Index aClass302_3681;
    protected int anInt3682 = 0;
    static int anInt3683;
    static int anInt3684;

    static void method3461(String[] strings, short[] ses) {
        Class225.method2108(strings.length - 1, ses, 0, strings, -25575);
        anInt3680++;
    }

    private void method3462(BufferedStream buffer, int i) {
        anInt3684++;
        if (i == 5) {
            anInt3682 = buffer.readUnsignedShort();
        }
    }

    final void method3463(BufferedStream buffer) {
        anInt3683++;
        for (; ; ) {
            int i = buffer.readUnsignedByte();
            if (i == 0) {
                break;
            }
            method3462(buffer, i);
        }
    }

    public static void method3464() {
        aClass302_3681 = null;

    }
}
