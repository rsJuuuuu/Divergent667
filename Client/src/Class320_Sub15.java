/* Class320_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub15 extends Class320 {
    static int anInt8348;
    static int anInt8349;
    static int anInt8350;
    static int anInt8351;
    static int anInt8352;
    static int anInt8353;
    static String[] aStringArray8354;
    static volatile int WINDOWS_PANE_ID = -1;

    final int method3675(int i, byte b) {
        anInt8353++;
        if (b != 54) {
            method3739((byte) -14, true, null);
        }
        return 1;
    }

    Class320_Sub15(int i, Node_Sub27 node_sub27) {
        super(i, node_sub27);
    }

    final void method3676(int i) {
        anInt8350++;
        anInt4064 = i;
    }

    final void method3673(byte b) {
        if (anInt4064 < 0 || anInt4064 > 4) {
            anInt4064 = method3677(0);
        }
        anInt8352++;
        if (b >= -35) {
            method3677(-78);
        }
    }

    final int method3738() {
        anInt8349++;
        return anInt4064;
    }

    static byte[] method3739(byte b, boolean bool, Object object) {
        anInt8351++;
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            byte[] bs = (byte[]) object;
            if (bool) {
                return Class93.method1046(bs);
            }
            return bs;
        }
        if (object instanceof Class201) {
            Class201 class201 = (Class201) object;
            return class201.method2022();
        }
        throw new IllegalArgumentException();
    }

    final int method3677(int i) {
        if (i != 0) {
            aStringArray8354 = null;
        }
        anInt8348++;
        return 0;
    }

    public static void method3740() {
        aStringArray8354 = null;
    }

    Class320_Sub15(Node_Sub27 node_sub27) {
        super(node_sub27);
    }
}
