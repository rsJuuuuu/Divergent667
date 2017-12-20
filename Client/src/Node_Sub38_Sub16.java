/* Node_Sub38_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub16 extends Node_Sub38
{
	static int anInt10264;
	static int anInt10265;
	static int anInt10266;
	static int anInt10267;
	static Class335 aClass335_10268 = new Class335(64);
	static int[][] anIntArrayArray10269;
	
	public static void method2839(int i) {
		if (i != 5) {
			method2839(-89);
		}
		anIntArrayArray10269 = null;
		aClass335_10268 = null;
	}
	
	final int[] method2775(int i, int i_0_) {
		anInt10266++;
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_1_ = this.method2786(i_0_, 0, 0);
			for (int i_2_ = 0; Class339_Sub7.anInt8728 > i_2_; i_2_++)
				is[i_2_] = -is_1_[i_2_] + 4096;
		}
		if (i <= 107) {
			return null;
		}
		return is;
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			anIntArrayArray10269 = null;
		}
		anInt10264++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[][] is_3_ = this.method2777(-113, 0, i);
			int[] is_4_ = is_3_[0];
			int[] is_5_ = is_3_[1];
			int[] is_6_ = is_3_[2];
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			for (int i_10_ = 0; Class339_Sub7.anInt8728 > i_10_; i_10_++) {
				is_7_[i_10_] = -is_4_[i_10_] + 4096;
				is_8_[i_10_] = 4096 + -is_5_[i_10_];
				is_9_[i_10_] = -is_6_[i_10_] + 4096;
			}
		}
		return is;
	}
	
	static final void method2840(int i) {
		if (i == 0) {
			if (Class22.anInt427 == 2) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[0]);
				GraphicsToolkit.aClass33Array1549[1].method364(Class364.aClass273Array4513[1]);
			} else if (Class22.anInt427 == 3) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[0]);
				GraphicsToolkit.aClass33Array1549[1].method364(Class364.aClass273Array4513[1]);
				GraphicsToolkit.aClass33Array1549[2].method364(Class364.aClass273Array4513[2]);
			} else {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[0]);
				GraphicsToolkit.aClass33Array1549[1].method364(Class364.aClass273Array4513[1]);
				GraphicsToolkit.aClass33Array1549[2].method364(Class364.aClass273Array4513[2]);
				GraphicsToolkit.aClass33Array1549[3].method364(Class364.aClass273Array4513[3]);
			}
		} else if (i == 1) {
			if (Class22.anInt427 == 2) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[2]);
			} else if (Class22.anInt427 == 3) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[3]);
				GraphicsToolkit.aClass33Array1549[1].method364(Class364.aClass273Array4513[4]);
			} else {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[4]);
				GraphicsToolkit.aClass33Array1549[1].method364(Class364.aClass273Array4513[5]);
				GraphicsToolkit.aClass33Array1549[2].method364(Class364.aClass273Array4513[6]);
			}
		} else if (i == 2) {
			if (Class22.anInt427 == 2) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[3]);
			} else if (Class22.anInt427 == 3) {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[5]);
			} else {
				GraphicsToolkit.aClass33Array1549[0].method364(Class364.aClass273Array4513[7]);
			}
		}
	}
	
	static final void method2841(boolean bool, int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		anInt10267++;
		if (i <= -119) {
			long l = (long) ((bool ? -2147483648 : 0) | i_14_);
			Node_Sub16 node_sub16 = (Node_Sub16) Class153.aHashTable1947.method1518(3512, l);
			if (node_sub16 == null) {
				node_sub16 = new Node_Sub16();
				Class153.aHashTable1947.method1515(l, node_sub16, -128);
			}
			if (i_12_ >= node_sub16.anIntArray7137.length) {
				int[] is = new int[1 + i_12_];
				int[] is_15_ = new int[i_12_ - -1];
				for (int i_16_ = 0; (node_sub16.anIntArray7137.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
					is[i_16_] = node_sub16.anIntArray7137[i_16_];
					is_15_[i_16_] = node_sub16.anIntArray7138[i_16_];
				}
				for (int i_17_ = node_sub16.anIntArray7137.length; (i_17_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_17_++) {
					is[i_17_] = -1;
					is_15_[i_17_] = 0;
				}
				node_sub16.anIntArray7138 = is_15_;
				node_sub16.anIntArray7137 = is;
			}
			node_sub16.anIntArray7137[i_12_] = i_13_;
			node_sub16.anIntArray7138[i_12_] = i_11_;
		}
	}
	
	public Node_Sub38_Sub16() {
		super(1, false);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool != false) {
			method2840(111);
		}
		if (i == 0) {
			aBoolean7463 = buffer.readUnsignedByte() == 1;
		}
		anInt10265++;
	}
}
