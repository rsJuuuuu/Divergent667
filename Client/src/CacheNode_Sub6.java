/* CacheNode_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

public class CacheNode_Sub6 extends CacheNode {
    static int anInt9478;
    protected int anInt9479 = 0;
    static Class57 aClass57_9480;
    static int anInt9481;
    static int anInt9482;
    static int anInt9483;
    static int anInt9484;
    static int anInt9485;

    static Class365 method2311(Socket socket) throws IOException {
        anInt9478++;
        return new Class365_Sub1(socket);
    }

    public static void method2312() {
        aClass57_9480 = null;

    }

    static String method2313(long l) {
        anInt9481++;
        if (l <= 0 || l >= 6582952005840035281L) {
            return null;
        }
        if (l % 37L == 0L) {
            return null;
        }
        int i = 0;
        for (long l_1_ = l; l_1_ != 0; l_1_ /= 37L)
            i++;
        StringBuilder stringBuilder = new StringBuilder(i);
        while (l != 0) {
            long l_3_ = l;
            l /= 37L;
            char c = Class174.aCharArray2095[(int) (l_3_ - (37L * l))];
            if (c == 95) {
                int i_4_ = -1 + stringBuilder.length();
                stringBuilder.setCharAt(i_4_, Character.toUpperCase(stringBuilder.charAt(i_4_)));
                c = '\u00a0';
            }
            stringBuilder.append(c);
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    private void method2314(int i, BufferedStream buffer) {
        if (i == 2) {
            anInt9479 = buffer.readUnsignedShort();
        }
        anInt9484++;
    }

    final void method2315(BufferedStream buffer) {
        for (; ; ) {
            int i_5_ = buffer.readUnsignedByte();
            if (i_5_ == 0) {
                break;
            }
            method2314(i_5_, buffer);
        }
        anInt9482++;
    }
}
