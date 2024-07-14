/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class316 {
    static int anInt4037;

    static boolean method3661(int i) {
        anInt4037++;
        return (i & 0x180) != 0;
    }

    static boolean isAlphanumeric(char c) {
        boolean isNumber = c >= 48 && c <= 57;
        boolean isCapAlpha = c >= 65 && c <= 90;
        boolean isLowerAlpha = c >= 97 && c <= 122;
        return isNumber || isCapAlpha || isLowerAlpha;
    }
}
