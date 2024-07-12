/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143 {
    static int[] anIntArray1764;
    protected int anInt1765;
    protected int anInt1766;
    protected int anInt1767;
    static int anInt1768;
    protected int anInt1769;
    static int anInt1770;
    static Class326[] aClass326Array1771;
    protected int anInt1772;
    static byte[] aByteArray1773 = null;
    protected int anInt1774;
    protected int anInt1775;
    protected int anInt1776;
    protected int anInt1777;
    protected int anInt1778;
    protected int anInt1779;
    static int anInt1780;
    protected int anInt1781;

    static int[] method1622() {
        anInt1770++;
        int[] is = new int[2048];
        Node_Sub38_Sub27 node_sub38_sub27 = new Node_Sub38_Sub27();
        node_sub38_sub27.anInt10378 = (int) ((float) 0.4 * 4096.0F);
        node_sub38_sub27.aBoolean10377 = true;
        node_sub38_sub27.anInt10389 = 35;
        node_sub38_sub27.anInt10384 = 8;
        node_sub38_sub27.anInt10390 = 8;
        node_sub38_sub27.anInt10382 = 4;
        node_sub38_sub27.method2785(7);
        Class169_Sub1.method1769(1, 2048);
        node_sub38_sub27.method2880(0, is, -92);
        return is;
    }

    static void method1623(int i, int i_5_, int i_7_, int i_8_) {
        anInt1780++;
        int i_9_ = 0;
        int i_10_ = i_7_;
        int i_11_ = -i_7_;
        Class369.method4086(i_7_ + i, i_5_, i - i_7_, Class169_Sub4.anIntArrayArray8826[i_8_], 0);
        int i_12_ = -1;
        while (i_10_ > i_9_) {
            i_12_ += 2;
            i_11_ += i_12_;
            i_9_++;
            if (i_11_ >= 0) {
                i_10_--;
                i_11_ -= i_10_ << 1;
                int[] is = Class169_Sub4.anIntArrayArray8826[i_10_ + i_8_];
                int[] is_13_ = Class169_Sub4.anIntArrayArray8826[-i_10_ + i_8_];
                int i_14_ = i_9_ + i;
                int i_15_ = i - i_9_;
                Class369.method4086(i_14_, i_5_, i_15_, is, 0);
                Class369.method4086(i_14_, i_5_, i_15_, is_13_, 0);
            }
            int i_16_ = i_10_ + i;
            int i_17_ = -i_10_ + i;
            int[] is = Class169_Sub4.anIntArrayArray8826[i_9_ + i_8_];
            int[] is_18_ = Class169_Sub4.anIntArrayArray8826[i_8_ - i_9_];
            Class369.method4086(i_16_, i_5_, i_17_, is, 0);
            Class369.method4086(i_16_, i_5_, i_17_, is_18_, 0);
        }
    }

    public static void method1624() {
        anIntArray1764 = null;
        aByteArray1773 = null;
        aClass326Array1771 = null;
    }

    final boolean method1625(Class143 class143_19_) {
        anInt1768++;
        return class143_19_.anInt1767 == anInt1767 && class143_19_.anInt1776 == anInt1776 && anInt1769 == class143_19_.anInt1769;
    }

    static {
        anIntArray1764 = new int[32];
    }
}
