/* Node_Sub38_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub33 extends Node_Sub38
{
	static int anInt10437;
	static int anInt10438;
	static Class151 aClass151_10439 = new Class151(2, 4, 4, 0);
	static BufferedConnection aBufferedConnection10440;
	static long aLong10441;
	
	static final void method2898(int i, int i_0_, int i_1_, byte[] bs, int i_2_, byte[] bs_3_, int i_4_, int i_5_, int i_6_) {
		anInt10437++;
		int i_7_ = -(i_5_ >> 2);
		i_5_ = -(i_5_ & 0x3);
		if (i_6_ != 0) {
			aBufferedConnection10440 = null;
		}
		for (int i_8_ = -i_4_; (i_8_ ^ 0xffffffff) > -1; i_8_++) {
			for (int i_9_ = i_7_; (i_9_ ^ 0xffffffff) > -1; i_9_++) {
				bs[i_1_++] += -bs_3_[i_2_++];
				bs[i_1_++] += -bs_3_[i_2_++];
				bs[i_1_++] += -bs_3_[i_2_++];
				bs[i_1_++] += -bs_3_[i_2_++];
			}
			for (int i_10_ = i_5_; (i_10_ ^ 0xffffffff) > -1; i_10_++)
				bs[i_1_++] += -bs_3_[i_2_++];
			i_1_ += i_0_;
			i_2_ += i;
		}
	}
	
	public Node_Sub38_Sub33() {
		super(0, true);
	}
	
	final int[] method2775(int i, int i_11_) {
		anInt10438++;
		if (i <= 107) {
			method2775(49, -21);
		}
		return CacheNode_Sub3.anIntArray9442;
	}
	
	public static void method2899(byte b) {
		if (b != 58) {
			aClass151_10439 = null;
		}
		aBufferedConnection10440 = null;
		aClass151_10439 = null;
	}
}
