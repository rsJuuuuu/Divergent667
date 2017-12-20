/* Node_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Node_Sub25 extends Node
{
	static int anInt7233;
	protected int anInt7234;
	protected OggStreamState anOggStreamState7235;
	static float aFloat7236;
	static int anInt7237;
	static int anInt7238;
	static byte[] aByteArray7239;
	
	static final int method2651(int i, int i_0_, boolean bool, int i_1_) {
		if (bool != false) {
			method2653(-77, -102, -10, 4, 41, 99, 99);
		}
		if (i <= 243) {
			if ((i ^ 0xffffffff) >= -218) {
				if ((i ^ 0xffffffff) < -193) {
					i_0_ >>= 2;
				} else if (i > 179) {
					i_0_ >>= 1;
				}
			} else {
				i_0_ >>= 3;
			}
		} else {
			i_0_ >>= 4;
		}
		anInt7237++;
		return (i >> 1) + (i_0_ >> 5 << 7) + ((0xff & i_1_) >> 2 << 10);
	}
	
	final void method2652(int i, OggPacket oggpacket) {
		anInt7233++;
		@SuppressWarnings("unused")
		int i_2_ = -112 % ((40 - i) / 41);
		method2654(18986, oggpacket);
		anInt7234++;
	}
	
	static final boolean method2653(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		anInt7238++;
		int i_9_ = i_4_ - -i;
		int i_10_ = i_3_ + i_7_;
		int i_11_ = i_8_ + i_6_;
		if (i_5_ != 255) {
			return false;
		}
		if (!Class99.method1087(i_9_, i_6_, i_10_, i_10_, i_10_, (byte) 89, i_11_, i_11_, i_4_, i_4_)) {
			return false;
		}
		if (!Class99.method1087(i_9_, i_6_, i_10_, i_10_, i_10_, (byte) 89, i_6_, i_11_, i_4_, i_9_)) {
			return false;
		}
		if (i_4_ >= GLPlane.anInt7920) {
			if (!Class99.method1087(i_9_, i_11_, i_10_, i_10_, i_7_, (byte) 89, i_6_, i_11_, i_9_, i_9_)) {
				return false;
			}
			if (!Class99.method1087(i_9_, i_11_, i_7_, i_10_, i_7_, (byte) 89, i_6_, i_6_, i_9_, i_9_)) {
				return false;
			}
		} else {
			if (!Class99.method1087(i_4_, i_11_, i_10_, i_10_, i_7_, (byte) 89, i_6_, i_11_, i_4_, i_4_)) {
				return false;
			}
			if (!Class99.method1087(i_4_, i_11_, i_7_, i_10_, i_7_, (byte) 89, i_6_, i_6_, i_4_, i_4_)) {
				return false;
			}
		}
		if ((i_6_ ^ 0xffffffff) <= (Class380.anInt4889 ^ 0xffffffff)) {
			if (!Class99.method1087(i_9_, i_11_, i_10_, i_10_, i_7_, (byte) 89, i_11_, i_11_, i_4_, i_4_)) {
				return false;
			}
			if (!Class99.method1087(i_9_, i_11_, i_7_, i_10_, i_7_, (byte) 89, i_11_, i_11_, i_4_, i_9_)) {
				return false;
			}
		} else {
			if (!Class99.method1087(i_9_, i_6_, i_10_, i_10_, i_7_, (byte) 89, i_6_, i_6_, i_4_, i_4_)) {
				return false;
			}
			if (!Class99.method1087(i_9_, i_6_, i_7_, i_10_, i_7_, (byte) 89, i_6_, i_6_, i_4_, i_9_)) {
				return false;
			}
		}
		return true;
	}
	
	abstract void method2654(int i, OggPacket oggpacket);
	
	Node_Sub25(OggStreamState oggstreamstate) {
		anOggStreamState7235 = oggstreamstate;
	}
	
	public static void method2655(int i) {
		if (i != 27727) {
			method2651(114, 33, false, -125);
		}
		aByteArray7239 = null;
	}
	
	abstract void method2656(int i);
	
	static {
		int i = 0;
		aByteArray7239 = new byte[32896];
		for (int i_12_ = 0; i_12_ < 256; i_12_++) {
			for (int i_13_ = 0; i_13_ <= i_12_; i_13_++)
				aByteArray7239[i++] = (byte) (int) (255.0 / Math.sqrt((double) ((float) (65535 + (i_12_ * i_12_ + i_13_ * i_13_)) / 65535.0F)));
		}
	}
}
