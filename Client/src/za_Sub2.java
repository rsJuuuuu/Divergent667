/* za_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.heap.NativeHeap;

public class za_Sub2 extends za {
    static int anInt10509;
    protected NativeHeap aNativeHeap10510;
    static int anInt10511;
    static OutcommingPacket aClass318_10512 = new OutcommingPacket(84, 6);
    static int anInt10513 = 100;
    static int anInt10514 = 0;

    static boolean method2994(int i, int i_0_) {
        anInt10509++;
        return !(!(Class234.method2150(i_0_, i) | (0x40000 & i) != 0) && !Node_Sub41.method2932(-100, i, i_0_));
    }

    final void method2995() {
        anInt10511++;
        aNativeHeap10510.b();
    }

    za_Sub2(int i) {
        aNativeHeap10510 = new NativeHeap(i);
    }

    public static void method2996() {
        aClass318_10512 = null;
    }
}
