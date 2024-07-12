/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class10 {
    static int anInt168;
    static Class124 aClass124_169 = new Class124(13);
    static int anInt170;
    static int anInt171;
    static GLSprite aGLSprite172;
    static GLSprite aGLSprite173;
    static int anInt174;
    static IncommingPacket aClass192_175 = new IncommingPacket(51, 0);
    static Class96 aClass96_176;

    abstract long method186();

    static int method187(String string) {
        anInt171++;
        return Class145.method1638(string, 16);
    }

    static int method188(int i, int i_0_, byte[] bs) {
        anInt170++;
        int i_1_ = -1;
        for (int i_2_ = i_0_; i > i_2_; i_2_++)
            i_1_ = i_1_ >>> 8 ^ Class363.anIntArray4505[0xff & (i_1_ ^ bs[i_2_])];
        i_1_ ^= 0xffffffff;
        return i_1_;
    }

    static void method189(BufferedStream buffer) {
        anInt168++;
        for (; ; ) {
            int i_4_ = buffer.readUnsignedByte();
            if (i_4_ == 0) {
                Class259.anInt3254 = buffer.readUnsignedShort();
                Class270_Sub1.anInt8034 = buffer.readUnsignedShort();
            } else if (i_4_ == 255) {
                break;
            }
        }
    }


    public static void method190() {
        aGLSprite172 = null;
        aClass96_176 = null;
        aClass192_175 = null;
        aGLSprite173 = null;
        aClass124_169 = null;
    }

    public Class10() {
        /* empty */
    }
}
