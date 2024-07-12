/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class367 {
    static int anInt4532;
    static int anInt4533;
    static IncommingPacket aClass192_4534 = new IncommingPacket(139, -2);
    static int anInt4535;
    protected int anInt4536 = 0;
    protected int anInt4537;
    protected int anInt4538 = 0;
    static int anInt4539;
    static Class37 aClass37_4540;
    static int anInt4541;
    protected int anInt4542;

    final void method4074(BufferedStream buffer) {
        anInt4535++;
        for (; ; ) {
            int i_1_ = buffer.readUnsignedByte();
            if (i_1_ == 0) {
                break;
            }
            method4075(i_1_, buffer);
        }
    }

    private void method4075(int i, BufferedStream buffer) {
        if (i == 1) {
            anInt4536 = buffer.readUnsignedByte();
        } else if (i == 2) {
            anInt4542 = buffer.readUnsignedShort();
        } else if (i == 3) {
            anInt4537 = buffer.readUnsignedShort();
        } else if (i == 4) {
            anInt4538 = buffer.readShort();
        }
        anInt4532++;
    }

    public Class367() {
        anInt4537 = 2048;
        anInt4542 = 2048;
    }

    public static void method4076() {
        aClass37_4540 = null;
        aClass192_4534 = null;
    }
}
