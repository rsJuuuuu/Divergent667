/* Node_Sub38_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub8_Sub1 extends Node_Sub38_Sub8
{
	static int anInt11095;
	static int anInt11096;
	static int anInt11097;
	
	final int[][] method2778(int i, boolean bool) {
		anInt11095++;
		if (bool != true) {
			method2817(null, (byte) 15, null);
		}
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300 && this.method2814((byte) 99)) {
			int[] is_0_ = is[0];
			int[] is_1_ = is[1];
			int[] is_2_ = is[2];
			int i_3_ = anInt10172 * (i % anInt10172);
			for (int i_4_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				int i_5_ = anIntArray10165[i_4_ % anInt10169 + i_3_];
				is_2_[i_4_] = Node_Sub30.method2723(255, i_5_) << 4;
				is_1_[i_4_] = Node_Sub30.method2723(4080, i_5_ >> 4);
				is_0_[i_4_] = Node_Sub30.method2723(i_5_, 16711680) >> 12;
			}
		}
		return is;
	}
	
	static final void method2817(int[] is, byte b, int[] is_6_) {
		@SuppressWarnings("unused")
		int i = 61 / ((b - -39) / 56);
		anInt11096++;
		if (is == null || is_6_ == null) {
			CacheNode_Sub1.anIntArray9427 = null;
			Class113.aByteArrayArrayArray1447 = null;
			Class132.anIntArray1682 = null;
		} else {
			CacheNode_Sub1.anIntArray9427 = is;
			Class132.anIntArray1682 = new int[is.length];
			Class113.aByteArrayArrayArray1447 = new byte[is.length][][];
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (CacheNode_Sub1.anIntArray9427.length ^ 0xffffffff); i_7_++)
				Class113.aByteArrayArrayArray1447[i_7_] = new byte[is_6_[i_7_]][];
		}
	}
	
	static final void method2818(int i, String string) {
		anInt11097++;
		if (string != null) {
			String string_8_ = Node_Sub25_Sub3.method2671(-13472, string);
			if (i >= 2 && string_8_ != null) {
				for (int i_9_ = 0; i_9_ < Node_Sub38_Sub14.anInt10242; i_9_++) {
					String string_10_ = Class262_Sub12.aStringArray7793[i_9_];
					String string_11_ = Node_Sub25_Sub3.method2671(-13472, string_10_);
					if (Class310.method3601(string, string_11_, 30195, string_10_, string_8_)) {
						Node_Sub38_Sub14.anInt10242--;
						for (int i_12_ = i_9_; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
							Class262_Sub12.aStringArray7793[i_12_] = Class262_Sub12.aStringArray7793[i_12_ - -1];
							Plane.aStringArray3403[i_12_] = Plane.aStringArray3403[1 + i_12_];
							Class202.anIntArray2448[i_12_] = Class202.anIntArray2448[1 + i_12_];
							EntityNode_Sub3_Sub1.aStringArray9157[i_12_] = EntityNode_Sub3_Sub1.aStringArray9157[i_12_ + 1];
							Class380.anIntArray4887[i_12_] = Class380.anIntArray4887[1 + i_12_];
							Class330.aBooleanArray4127[i_12_] = Class330.aBooleanArray4127[i_12_ - -1];
							Class232.aBooleanArray2781[i_12_] = Class232.aBooleanArray2781[1 + i_12_];
						}
						Class181.anInt2150 = Class345.anInt4270;
						Class18.anInt305++;
						Class123 class123 = Class262_Sub23.method3213((byte) -76);
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub38_Sub6.aClass318_10135, class123.anIsaacCipher1571);
						node_sub13.aPacket7113.writeByte(Class126.method1536(-20826, string));
						node_sub13.aPacket7113.writeString(string);
						class123.sendPacket(126, node_sub13);
						break;
					}
				}
			}
		}
	}
}
