/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77 {
    static int anInt1016;
    static int anInt1017 = 1401;
    static long aLong1018;
    static int anInt1019;
    static int anInt1020;
    static int anInt1021;

    static char removeSpecialCharacters(char ch) {
        anInt1019++;

        if (ch == ' ' || ch == 'á' || ch == '_' || ch == '-') {
            return '_';
        }

        if (ch == '[' || ch == ']' || ch == '#') {
            // in aCharArray8331
            return ch;
        }

        if (((int) ch >= 224 && (int) ch <= 228) || (((int) ch >= 192 && (int) ch <= 196))) {
            return 'a';
        }

        if (((int) ch >= 232 && (int) ch <= 235) || (((int) ch >= 200 && (int) ch <= 203))) {
            return 'u';
        }

        if (((int) ch >= 237 && (int) ch <= 239) || (((int) ch >= 205 && (int) ch <= 207))) {
            return 'i';
        }

        if (((int) ch >= 242 && (int) ch <= 246) || (((int) ch >= 210 && (int) ch <= 214))) {
            return 'o';
        }

        if (((int) ch >= 249 && (int) ch <= 252) || (((int) ch >= 217 && (int) ch <= 220))) {
            return 'u';
        }

        if ((int) ch == 231 || (int) ch == 199) {
            return 'c';
        }
        if ((int) ch == 255 || (int) ch == 376) {
            return 'y';
        }

        if ((int) ch == 241 || (int) ch == 209) {
            return 'n';
        }

        if ((int) ch == 223) {
            return 'b';
        }
        return Character.toLowerCase(ch);
    }

    static String method773(int i_1_) {
        anInt1020++;
        Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1518(3512, i_1_);
        if (node_sub3 != null) {
            Node_Sub25_Sub4 node_sub25_sub4 = node_sub3.aClass189_Sub1_6943.method1921();
            if (node_sub25_sub4 != null) {
                double d = node_sub3.aClass189_Sub1_6943.method1928(116);
                if ((double) node_sub25_sub4.method2678() <= d && d <= (double) node_sub25_sub4.method2683(-75)) {
                    return node_sub25_sub4.method2682();
                }
            }
        }
        return null;
    }

    final int method775(int i, int i_2_) {
        anInt1016++;
        int i_3_ = Math.max(i, Class205.screenHeight);
        if (Animable_Sub4_Sub2.aClass77_10805 == this) {
            return 0;
        }
        if (Class260.aClass77_5225 == this) {
            return i_3_ - i_2_;
        }
        if (Class67.aClass77_930 == this) {
            return (-i_2_ + i_3_) / 2;
        }
        return 0;
    }

    public final String toString() {
        anInt1021++;
        throw new IllegalStateException();
    }
}
