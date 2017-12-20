/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125
{
	static int anInt1606;
	static int anInt1607;
	static int anInt1608;
	static Class61 aClass61_1609 = new Class61(4);
	static int anInt1610;
	
	static final void method1527(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt1610++;
		int i_5_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_3_);
		int i_6_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, i ^ 0x376b98ec, i_4_);
		int i_7_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_0_);
		int i_8_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_1_);
		if (i == 0) {
			for (int i_9_ = i_5_; i_6_ >= i_9_; i_9_++)
				Class369.method4086(i_8_, i_2_, i_7_, Class169_Sub4.anIntArrayArray8826[i_9_], i);
		}
	}
	
	public static void method1528(byte b) {
		if (b != -64) {
			aClass61_1609 = null;
		}
		aClass61_1609 = null;
	}
	
	static final boolean method1529(int i, int i_10_, int i_11_) {
		if (i != 2048) {
			aClass61_1609 = null;
		}
		anInt1608++;
        return (i_11_ & 0x800 ^ 0xffffffff) != -1;
    }
	
	static final void method1530(byte b, int i, int[] is, long[] ls, int i_12_) {
		if (b != -114) {
			aClass61_1609 = null;
		}
		anInt1606++;
		if (i > i_12_) {
			int i_13_ = (i_12_ - -i) / 2;
			int i_14_ = i_12_;
			long l = ls[i_13_];
			ls[i_13_] = ls[i];
			ls[i] = l;
			int i_15_ = is[i_13_];
			is[i_13_] = is[i];
			is[i] = i_15_;
			int i_16_ = (l ^ 0xffffffffffffffffL) != -9223372036854775808L ? 1 : 0;
			for (int i_17_ = i_12_; i > i_17_; i_17_++) {
				if (l + (long) (i_16_ & i_17_) > ls[i_17_]) {
					long l_18_ = ls[i_17_];
					ls[i_17_] = ls[i_14_];
					ls[i_14_] = l_18_;
					int i_19_ = is[i_17_];
					is[i_17_] = is[i_14_];
					is[i_14_++] = i_19_;
				}
			}
			ls[i] = ls[i_14_];
			ls[i_14_] = l;
			is[i] = is[i_14_];
			is[i_14_] = i_15_;
			method1530((byte) -114, -1 + i_14_, is, ls, i_12_);
			method1530((byte) -114, i, is, ls, i_14_ + 1);
		}
	}
	
	static final void method1531(int i) {
		if (i == 2288) {
			anInt1607++;
			CacheNode_Sub16.aClass312_9600 = new Class312();
		}
	}
}
