/* Class262_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub5 extends Class262 {
    static Class199[] aClass199Array7732;
    private final String aString7733;
    static int anInt7734;
    private final int anInt7735;
    private final int anInt7736;
    static int anInt7737;
    static int anInt7738;
    static int anInt7739 = 0;
    private final int anInt7740;
    private final int anInt7741;

    public static void method3162() {
        aClass199Array7732 = null;
    }

    static boolean method3163() {
        anInt7738++;
        return Class71.aHashtable958.containsKey("jagtheora");
    }

    Class262_Sub5(BufferedStream buffer) {
        super(buffer);
        anInt7740 = buffer.readUnsignedShort();
        anInt7735 = buffer.readUnsignedShort();
        aString7733 = buffer.readString();
        anInt7741 = buffer.readInt();
        anInt7736 = buffer.readUnsignedShort();
    }

    final void method3148(int i) {
        //message on tile
        r.sendMessageOnTile(CacheNode_Sub20_Sub1.myPlayerPlane, anInt7736, aString7733, anInt7741, Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, anInt7735, anInt7740), anInt7740, anInt7735);
        if (i <= -102) {
            anInt7734++;
        }
    }
}
