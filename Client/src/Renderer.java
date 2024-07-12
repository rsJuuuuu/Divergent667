/* Renderer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Renderer {
    protected int anInt3656;
    static int anInt3657;
    protected int anInt3658;
    static int anInt3659;
    protected String aString3660;
    protected long aLong3661;
    static IncommingPacket aClass192_3662 = new IncommingPacket(5, 7);
    static int anInt3663;
    protected String aString3664;

    static void method3446(int i) {
        anInt3657++;
        Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1518(3512, i);
        if (node_sub3 != null) {
            node_sub3.aClass189_Sub1_6943.method1924((byte) 92);
            Class341.method3960(node_sub3.anInt6947, node_sub3.aBoolean6945, (byte) 115);
            node_sub3.method2160((byte) 83);
        }
    }

    public static void method3447() {
        aClass192_3662 = null;
    }

    static Model method3448(int i, int i_1_, Index class302) {
        anInt3659++;
        byte[] bs = class302.method3524(0, i);
        if (bs == null) {
            return null;
        }
        if (i_1_ != 7) {
            return null;
        }
        return new Model(bs);
    }

    Renderer(int i, String string, int i_3_, String string_4_, long l) {
        aString3664 = string;
        aLong3661 = l;
        anInt3658 = i_3_;
        aString3660 = string_4_;
        anInt3656 = i;
    }
}
