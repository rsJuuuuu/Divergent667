/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class111
{
	static int anInt1414;
	static int anInt1415 = 52;
	static int anInt1416;
	static int anInt1417;
	static int anInt1418 = 0;
	
	static final synchronized void method1137(byte[] bs, int i) {
		anInt1414++;
		if ((bs.length ^ 0xffffffff) == -101 && AnimableAnimator_Sub1.anInt9090 < 1000) {
			Class144.aByteArrayArray1782[AnimableAnimator_Sub1.anInt9090++] = bs;
		} else if ((bs.length ^ 0xffffffff) == -5001 && (CacheNode_Sub16_Sub2.anInt11085 ^ 0xffffffff) > -251) {
			Animable_Sub4_Sub2.aByteArrayArray10804[CacheNode_Sub16_Sub2.anInt11085++] = bs;
		} else if ((bs.length ^ 0xffffffff) == -30001 && Class22.anInt429 < 50) {
			Class282.aByteArrayArray3588[Class22.anInt429++] = bs;
		} else if (i == -251) {
			if (Class113.aByteArrayArrayArray1447 != null) {
				for (int i_0_ = 0; CacheNode_Sub1.anIntArray9427.length > i_0_; i_0_++) {
					if ((CacheNode_Sub1.anIntArray9427[i_0_] ^ 0xffffffff) == (bs.length ^ 0xffffffff) && (Class113.aByteArrayArrayArray1447[i_0_].length ^ 0xffffffff) < (Class132.anIntArray1682[i_0_] ^ 0xffffffff)) {
						Class113.aByteArrayArrayArray1447[i_0_][Class132.anIntArray1682[i_0_]++] = bs;
						break;
					}
				}
			}
		}
	}
	
	static final int method1138(String string, byte[] bs, byte b, int i) {
		anInt1417++;
		if (b >= -65) {
			anInt1418 = -11;
		}
		int i_1_ = i;
		int i_2_ = string.length();
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_3_ += 4) {
			int i_4_ = Node_Sub16.method2591((byte) -115, string.charAt(i_3_));
			int i_5_ = (i_3_ - -1 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff) ? -1 : Node_Sub16.method2591((byte) -115, string.charAt(i_3_ + 1));
			int i_6_ = (i_2_ ^ 0xffffffff) < (i_3_ - -2 ^ 0xffffffff) ? Node_Sub16.method2591((byte) -115, string.charAt(2 + i_3_)) : -1;
			int i_7_ = 3 + i_3_ >= i_2_ ? -1 : Node_Sub16.method2591((byte) -115, string.charAt(3 + i_3_));
			bs[i++] = (byte) Node_Sub16.method2590(i_5_ >>> 4, i_4_ << 2);
			if (i_6_ == -1) {
				break;
			}
			bs[i++] = (byte) Node_Sub16.method2590(Node_Sub30.method2723(240, i_5_ << 4), i_6_ >>> 2);
			if (i_7_ == -1) {
				break;
			}
			bs[i++] = (byte) Node_Sub16.method2590(Node_Sub30.method2723(3, i_6_) << 6, i_7_);
		}
		return i - i_1_;
	}
	
	static final synchronized byte[] method1139(boolean bool, int i) {
		anInt1416++;
		if (i == 100 && AnimableAnimator_Sub1.anInt9090 > 0) {
			byte[] bs = Class144.aByteArrayArray1782[--AnimableAnimator_Sub1.anInt9090];
			Class144.aByteArrayArray1782[AnimableAnimator_Sub1.anInt9090] = null;
			return bs;
		}
		if (i == 5000 && (CacheNode_Sub16_Sub2.anInt11085 ^ 0xffffffff) < -1) {
			byte[] bs = Animable_Sub4_Sub2.aByteArrayArray10804[--CacheNode_Sub16_Sub2.anInt11085];
			Animable_Sub4_Sub2.aByteArrayArray10804[CacheNode_Sub16_Sub2.anInt11085] = null;
			return bs;
		}
		if ((i ^ 0xffffffff) == -30001 && Class22.anInt429 > 0) {
			byte[] bs = Class282.aByteArrayArray3588[--Class22.anInt429];
			Class282.aByteArrayArray3588[Class22.anInt429] = null;
			return bs;
		}
		if (bool != true) {
			anInt1418 = 35;
		}
		if (Class113.aByteArrayArrayArray1447 != null) {
			for (int i_8_ = 0; i_8_ < CacheNode_Sub1.anIntArray9427.length; i_8_++) {
				if ((i ^ 0xffffffff) == (CacheNode_Sub1.anIntArray9427[i_8_] ^ 0xffffffff) && Class132.anIntArray1682[i_8_] > 0) {
					byte[] bs = Class113.aByteArrayArrayArray1447[i_8_][--Class132.anIntArray1682[i_8_]];
					Class113.aByteArrayArrayArray1447[i_8_][Class132.anIntArray1682[i_8_]] = null;
					return bs;
				}
			}
		}
		return new byte[i];
	}
}
