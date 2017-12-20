/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35
{
	static int anInt534;
	static Class151 aClass151_535 = new Class151(6, 0, 4, 2);
	static IncommingPacket aClass192_536 = new IncommingPacket(54, -1);
	static int language;
	static int OUTSIDE_PLAYERS_INDEXES_COUNT = 0;
	
	static final void method387(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt534++;
		Class262_Sub11.method3175(i_4_, -126);
		int i_6_ = 0;
		int i_7_ = i_4_ + -i;
		if ((i_7_ ^ 0xffffffff) > i_3_) {
			i_7_ = 0;
		}
		int i_8_ = i_4_;
		int i_9_ = -i_4_;
		int i_10_ = i_7_;
		int i_11_ = -i_7_;
		int i_12_ = -1;
		if ((i_5_ ^ 0xffffffff) <= (Class384.anInt4906 ^ 0xffffffff) && Node_Sub25_Sub1.anInt9936 >= i_5_) {
			int[] is = Class169_Sub4.anIntArrayArray8826[i_5_];
			int i_13_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ + -i_4_);
			int i_14_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_3_ ^ ~0x376b98ec, i_4_ + i_2_);
			int i_15_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ + -i_7_);
			int i_16_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ + i_7_);
			Class369.method4086(i_15_, i_1_, i_13_, is, i_3_ ^ 0xffffffff);
			Class369.method4086(i_16_, i_0_, i_15_, is, i_3_ + 1);
			Class369.method4086(i_14_, i_1_, i_16_, is, i_3_ + 1);
		}
		int i_17_ = -1;
		while (i_8_ > i_6_) {
			i_12_ += 2;
			i_17_ += 2;
			i_11_ += i_17_;
			i_9_ += i_12_;
			if ((i_11_ ^ 0xffffffff) <= -1 && i_10_ >= 1) {
				i_10_--;
				Class188_Sub1_Sub2.anIntArray9345[i_10_] = i_6_;
				i_11_ -= i_10_ << 1;
			}
			i_6_++;
			if ((i_9_ ^ 0xffffffff) <= -1) {
				i_8_--;
				i_9_ -= i_8_ << 1;
				int i_18_ = i_5_ + -i_8_;
				int i_19_ = i_8_ + i_5_;
				if ((Class384.anInt4906 ^ 0xffffffff) >= (i_19_ ^ 0xffffffff) && Node_Sub25_Sub1.anInt9936 >= i_18_) {
					if (i_7_ > i_8_) {
						int i_20_ = Class188_Sub1_Sub2.anIntArray9345[i_8_];
						int i_21_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ - -i_6_);
						int i_22_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ + -i_6_);
						int i_23_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ - -i_20_);
						int i_24_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, -i_20_ + i_2_);
						if ((i_19_ ^ 0xffffffff) >= (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff)) {
							int[] is = Class169_Sub4.anIntArrayArray8826[i_19_];
							Class369.method4086(i_24_, i_1_, i_22_, is, 0);
							Class369.method4086(i_23_, i_0_, i_24_, is, i_3_ + 1);
							Class369.method4086(i_21_, i_1_, i_23_, is, i_3_ ^ 0xffffffff);
						}
						if (i_18_ >= Class384.anInt4906) {
							int[] is = Class169_Sub4.anIntArrayArray8826[i_18_];
							Class369.method4086(i_24_, i_1_, i_22_, is, 0);
							Class369.method4086(i_23_, i_0_, i_24_, is, 0);
							Class369.method4086(i_21_, i_1_, i_23_, is, 0);
						}
					} else {
						int i_25_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ - -i_6_);
						int i_26_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_2_ + -i_6_);
						if (i_19_ <= Node_Sub25_Sub1.anInt9936) {
							Class369.method4086(i_25_, i_1_, i_26_, Class169_Sub4.anIntArrayArray8826[i_19_], i_3_ ^ 0xffffffff);
						}
						if ((i_18_ ^ 0xffffffff) <= (Class384.anInt4906 ^ 0xffffffff)) {
							Class369.method4086(i_25_, i_1_, i_26_, Class169_Sub4.anIntArrayArray8826[i_18_], 0);
						}
					}
				}
			}
			int i_27_ = -i_6_ + i_5_;
			int i_28_ = i_6_ + i_5_;
			if ((i_28_ ^ 0xffffffff) <= (Class384.anInt4906 ^ 0xffffffff) && i_27_ <= Node_Sub25_Sub1.anInt9936) {
				int i_29_ = i_2_ + i_8_;
				int i_30_ = -i_8_ + i_2_;
				if ((Class262_Sub4.anInt7722 ^ 0xffffffff) >= (i_29_ ^ 0xffffffff) && (za_Sub2.anInt10513 ^ 0xffffffff) <= (i_30_ ^ 0xffffffff)) {
					i_29_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_29_);
					i_30_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_30_);
					if (i_7_ <= i_6_) {
						if (Node_Sub25_Sub1.anInt9936 >= i_28_) {
							Class369.method4086(i_29_, i_1_, i_30_, Class169_Sub4.anIntArrayArray8826[i_28_], 0);
						}
						if ((i_27_ ^ 0xffffffff) <= (Class384.anInt4906 ^ 0xffffffff)) {
							Class369.method4086(i_29_, i_1_, i_30_, Class169_Sub4.anIntArrayArray8826[i_27_], 0);
						}
					} else {
						int i_31_ = i_6_ <= i_10_ ? i_10_ : Class188_Sub1_Sub2.anIntArray9345[i_6_];
						int i_32_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_31_ + i_2_);
						int i_33_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, i_3_ + 929798381, i_2_ + -i_31_);
						if (Node_Sub25_Sub1.anInt9936 >= i_28_) {
							int[] is = Class169_Sub4.anIntArrayArray8826[i_28_];
							Class369.method4086(i_33_, i_1_, i_30_, is, 0);
							Class369.method4086(i_32_, i_0_, i_33_, is, 0);
							Class369.method4086(i_29_, i_1_, i_32_, is, i_3_ ^ 0xffffffff);
						}
						if (i_27_ >= Class384.anInt4906) {
							int[] is = Class169_Sub4.anIntArrayArray8826[i_27_];
							Class369.method4086(i_33_, i_1_, i_30_, is, 0);
							Class369.method4086(i_32_, i_0_, i_33_, is, 0);
							Class369.method4086(i_29_, i_1_, i_32_, is, 0);
						}
					}
				}
			}
		}
	}
	
	public static void method388(byte b) {
		aClass151_535 = null;
		if (b != -78) {
			method387(-67, 40, -25, 19, 22, 9, -71);
		}
		aClass192_536 = null;
	}
	
	static {
		language = 0;
	}
}
