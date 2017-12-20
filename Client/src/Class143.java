/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143
{
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
	
	static final int[] method1622(int i, int i_0_, boolean bool, int i_1_, int i_2_, int i_3_, float f, int i_4_) {
		anInt1770++;
		int[] is = new int[i_2_];
		Node_Sub38_Sub27 node_sub38_sub27 = new Node_Sub38_Sub27();
		node_sub38_sub27.anInt10378 = (int) (f * 4096.0F);
		node_sub38_sub27.aBoolean10377 = bool;
		node_sub38_sub27.anInt10389 = i_4_;
		node_sub38_sub27.anInt10384 = i;
		node_sub38_sub27.anInt10390 = i_3_;
		node_sub38_sub27.anInt10382 = i_0_;
		node_sub38_sub27.method2785(7);
		Class169_Sub1.method1769(485964236, 1, i_2_);
		node_sub38_sub27.method2880(i_1_, is, i_1_ ^ ~0x5b);
		return is;
	}
	
	static final void method1623(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt1780++;
		int i_9_ = 0;
		if (i_6_ == -957563775) {
			int i_10_ = i_7_;
			int i_11_ = -i_7_;
			Class369.method4086(i_7_ + i, i_5_, i - i_7_, Class169_Sub4.anIntArrayArray8826[i_8_], 0);
			int i_12_ = -1;
			while ((i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
				i_12_ += 2;
				i_11_ += i_12_;
				i_9_++;
				if ((i_11_ ^ 0xffffffff) <= -1) {
					i_10_--;
					i_11_ -= i_10_ << 1;
					int[] is = Class169_Sub4.anIntArrayArray8826[i_10_ + i_8_];
					int[] is_13_ = Class169_Sub4.anIntArrayArray8826[-i_10_ + i_8_];
					int i_14_ = i_9_ + i;
					int i_15_ = i + -i_9_;
					Class369.method4086(i_14_, i_5_, i_15_, is, 0);
					Class369.method4086(i_14_, i_5_, i_15_, is_13_, i_6_ + 957563775);
				}
				int i_16_ = i_10_ + i;
				int i_17_ = -i_10_ + i;
				int[] is = Class169_Sub4.anIntArrayArray8826[i_9_ + i_8_];
				int[] is_18_ = Class169_Sub4.anIntArrayArray8826[i_8_ + -i_9_];
				Class369.method4086(i_16_, i_5_, i_17_, is, 0);
				Class369.method4086(i_16_, i_5_, i_17_, is_18_, 0);
			}
		}
	}
	
	public static void method1624(byte b) {
		if (b <= 108) {
			aByteArray1773 = null;
		}
		anIntArray1764 = null;
		aByteArray1773 = null;
		aClass326Array1771 = null;
	}
	
	final boolean method1625(int i, Class143 class143_19_) {
		anInt1768++;
		if (i <= 66) {
			method1622(2, 6, true, 113, -82, 64, 0.5866943F, -83);
		}
        return class143_19_.anInt1767 == anInt1767 && class143_19_.anInt1776 == anInt1776 && (class143_19_.anInt1769 ^ 0xffffffff) == (anInt1769 ^ 0xffffffff);
    }
	
	static {
		anIntArray1764 = new int[32];
	}
}
