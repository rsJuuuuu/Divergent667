/* Class188_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class188_Sub2_Sub2 extends Class188_Sub2 {
    static int anInt9359;
    static int anInt9360;
    static Index aClass302_9361;
    private byte[] aByteArray9362;
    static int anInt9363;
    static int anInt9364;
    static int anInt9365;
    static Class36 aClass36_9366;

    static boolean method1911(int i) {
        anInt9363++;
        return i != 0 && i != 2;
    }

    public static void method1912() {
        aClass302_9361 = null;
        aClass36_9366 = null;
    }

    final void method1905(int i, byte b_1_) {
        anInt9365++;
        b_1_ = (byte) (127 + (0x7f & b_1_ >> 1));
        int i_2_ = 2 * i;
        aByteArray9362[i_2_++] = b_1_;
        aByteArray9362[i_2_] = b_1_;
    }

    final byte[] method1913() {
        anInt9364++;
        aByteArray9362 = new byte[524288];
        this.method1884();
        return aByteArray9362;
    }

    static String method1914(String string) {
        anInt9359++;
        String string_6_ = null;
        int i_7_ = string.indexOf("--> ");
        if (i_7_ >= 0) {
            string_6_ = string.substring(0, i_7_ + 4);
            string = string.substring(i_7_ + 4);
        }

        if (string.startsWith("directlogin ")) {
            int i_9_ = string.indexOf(" ", "directlogin ".length());
            if (i_9_ >= 0) {
                int i_10_ = string.length();
                StringBuilder stringBuilder = new StringBuilder(string.substring(0, i_9_) + " ");
                for (int i_11_ = i_9_ + 1; i_11_ < i_10_; i_11_++)
                    stringBuilder.append("*");
                string = stringBuilder.toString();
            }
        }
        if (string_6_ == null) {
            return string;
        }
        return string_6_ + string;
    }

    public Class188_Sub2_Sub2() {
        super();
    }
}
