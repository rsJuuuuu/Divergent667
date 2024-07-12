/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43 {
    static long aLong663;
    static int anInt664;
    static IncommingPacket aClass192_665 = new IncommingPacket(125, 2);

    static String method458(int[] is) {
        anInt664++;
        StringBuilder stringbuffer = new StringBuilder();
        int i_0_ = Class173.anInt2087;
        for (int i : is) {
            Class184 class184 = Class146.aClass32_1812.method353(i);
            if (class184.anInt2188 != -1) {
                GLSprite glsprite = (GLSprite) CacheNode_Sub12.aClass61_9556.method607(class184.anInt2188, 0);
                if (glsprite == null) {
                    Class383 class383 = Class383.method4194(Node_Sub38_Sub39.aClass302_10500, class184.anInt2188, 0);
                    if (class383 != null) {
                        glsprite = Class93.aGraphicsToolkit1241.a(class383, true);
                        CacheNode_Sub12.aClass61_9556.method601(glsprite, 25566, class184.anInt2188);
                    }
                }
                if (glsprite != null) {
                    Class105.aGLSpriteArray5194[i_0_] = glsprite;
                    stringbuffer.append(" <img=").append(i_0_).append(">");
                    i_0_++;
                }
            }
        }
        return stringbuffer.toString();
    }

    public static void method459() {
        aClass192_665 = null;
    }
}
