/* Class51_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Source;

public class Class51_Sub1 extends Class51 implements Interface15_Impl2 {
    static int anInt9053;
    static IncommingPacket aClass192_9054 = new IncommingPacket(144, 5);
    static int anInt9055;
    static int anInt9056;
    static int anInt9057;
    static int anInt9058;
    private byte aByte9059;
    static int anInt9060;
    static OutcommingPacket aClass318_9061;
    static int anInt9062;
    static int anInt9063;
    static int anInt9064 = -1;

    public final boolean method39(int i) {
        anInt9063++;
        return super.method517(aGLXToolkit5332.aMapBuffer9314);
    }

    public final boolean method37(int i, int i_1_, int i_2_) {
        anInt9060++;
        if (i_2_ != -12093) {
            return true;
        }
        aByte9059 = (byte) i;
        super.method56(i_2_ ^ 0x29a3, i_1_);
        return true;
    }

    final int method521() {
        anInt9053++;
        return aByte9059;
    }

    public final boolean method36(int i, int i_3_, Source source, int i_4_) {
        anInt9057++;
        if (i_4_ != 1965) {
            return false;
        }
        aByte9059 = (byte) i;
        super.method516(i_3_, source);
        return true;
    }

    Class51_Sub1(GLXToolkit glxtoolkit, boolean bool) {
        super(glxtoolkit, 34962, bool);
    }

    static int method522(String string) {
        anInt9062++;
        int i = string.length();
        int i_5_ = 0;
        for (int i_6_ = 0; i_6_ < i; i_6_++)
            i_5_ = string.charAt(i_6_) + ((i_5_ << 5) - i_5_);
        return i_5_;
    }

    public static void method523() {
        aClass192_9054 = null;
        aClass318_9061 = null;
    }

    public final int method57(byte b) {
        anInt9055++;
        if (b >= -56) {
            anInt9064 = -61;
        }
        return super.method57((byte) -79);
    }

    public final void method38(boolean bool) {
        anInt9056++;
        super.method38(bool);
    }

    public final jaclib.memory.Buffer method40(int i, boolean bool) {
        anInt9058++;
        return super.method519(bool, aGLXToolkit5332.aMapBuffer9314);
    }

    static {
        aClass318_9061 = new OutcommingPacket(27, 7);
    }
}
