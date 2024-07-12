/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

abstract class Class41 {
    static IComponentDefinitions aWidget622;
    static int anInt623;
    protected int anInt624;
    protected String aString625;
    static int anInt626;
    static int anInt627;
    static int anInt628;

    public static void method433() {
        aWidget622 = null;

    }

    final Socket method434() throws IOException {
        anInt628++;
        return new Socket(aString625, anInt624);
    }

    public Class41() {
        /* empty */
    }

    abstract Socket method435() throws IOException;

    static void method436(String string) {
        Class28.method331(string, "", 0, "", "", 4);
        anInt623++;
    }

    static int method437(int i, int i_1_, boolean bool, byte b) {
        anInt627++;
        Node_Sub16 node_sub16 = Class295.method3472(i_1_, bool);
        if (node_sub16 == null) {
            return 0;
        }
        if (i == -1) {
            return 0;
        }
        int i_2_ = 0;
        if (b <= 34) {
            return 82;
        }
        for (int i_3_ = 0; node_sub16.anIntArray7138.length > i_3_; i_3_++) {
            if (i == node_sub16.anIntArray7137[i_3_]) {
                i_2_ += node_sub16.anIntArray7138[i_3_];
            }
        }
        return i_2_;
    }
}
