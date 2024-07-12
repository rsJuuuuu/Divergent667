/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67 {
    static int anInt928;
    static int anInt929;
    static Class77 aClass77_930 = new Class77();
    static int anInt931;

    static String method730(String string) {
        anInt928++;
        int i = string.length();
        int i_0_ = 0;
        for (int i_1_ = 0; i_1_ < i; i_1_++) {
            char c = string.charAt(i_1_);
            if (c == '<' || c == '>') {
                i_0_ += 3;
            }
        }
        StringBuilder stringbuffer = new StringBuilder(i + i_0_);
        for (int i_2_ = 0; i > i_2_; i_2_++) {
            char c = string.charAt(i_2_);
            if (c == 60) {
                stringbuffer.append("<lt>");
            } else if (c == 62) {
                stringbuffer.append("<gt>");
            } else {
                stringbuffer.append(c);
            }
        }
        return stringbuffer.toString();
    }

    static String method731() {
        anInt929++;
        if (Class213.aBoolean2510 || Node_Sub38_Sub23.aCacheNode_Sub13_10343 == null) {
            return "";
        }
        if ((Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9558 == null || Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9558.length() == 0) && Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9565 != null && Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9565.length() > 0) {
            return Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9565;
        }
        return Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9558;
    }

    public static void method732() {
        aClass77_930 = null;
    }

    static int method733(int i) {
        anInt931++;
        if (i >= -73) {
            aClass77_930 = null;
        }
        if (Class320_Sub20.anInt8397 == 1) {
            return Node_Sub38_Sub1.anInt10075;
        }
        return 0;
    }
}
