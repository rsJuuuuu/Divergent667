/* Node_Sub38_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node_Sub38_Sub8 extends Node_Sub38
{
	static int anInt10160;
	static int anInt10161;
	static float[] aFloatArray10162;
	static int anInt10163 = 0;
	static int anInt10164;
	protected int[] anIntArray10165;
	static int anInt10166;
	static int anInt10167;
	static int anInt10168;
	protected int anInt10169;
	static int anInt10170;
	static int anInt10171;
	protected int anInt10172;
	private int anInt10173 = -1;
	
	static final boolean method2812(int i, boolean bool, int i_0_) {
		anInt10167++;
		if (bool != false) {
			aFloatArray10162 = null;
		}
		boolean bool_1_ = (0x37 & i_0_ ^ 0xffffffff) != -1 ? Class303.method3538(i_0_, -128, i) : Node_Sub41.method2932(-125, i, i_0_);
		return bool_1_ | (Class278.method3367(i_0_, i, (byte) 87) | (i & 0x10000 ^ 0xffffffff) != -1);
	}
	
	int[][] method2778(int i, boolean bool) {
		anInt10166++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300 && method2814((byte) 80)) {
			int[] is_2_ = is[0];
			int[] is_3_ = is[1];
			int[] is_4_ = is[2];
			int i_5_ = anInt10169 * (Node_Sub38_Sub1.anInt10083 == anInt10172 ? i : i * anInt10172 / Node_Sub38_Sub1.anInt10083);
			if ((anInt10169 ^ 0xffffffff) == (Class339_Sub7.anInt8728 ^ 0xffffffff)) {
				for (int i_6_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
					int i_7_ = anIntArray10165[i_5_++];
					is_4_[i_6_] = Node_Sub30.method2723(i_7_, 255) << 4;
					is_3_[i_6_] = Node_Sub30.method2723(4080, i_7_ >> 4);
					is_2_[i_6_] = Node_Sub30.method2723(4080, i_7_ >> 12);
				}
			} else {
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_8_++) {
					int i_9_ = anInt10169 * i_8_ / Class339_Sub7.anInt8728;
					int i_10_ = anIntArray10165[i_9_ + i_5_];
					is_4_[i_8_] = Node_Sub30.method2723(255, i_10_) << 4;
					is_3_[i_8_] = Node_Sub30.method2723(i_10_ >> 4, 4080);
					is_2_[i_8_] = Node_Sub30.method2723(i_10_ >> 12, 4080);
				}
			}
		}
		if (bool != true) {
			method2787(-11);
		}
		return is;
	}
	
	public Node_Sub38_Sub8() {
		super(0, false);
	}
	
	static final void method2813(int i) {
		Class113.aClass336_1440 = null;
		anInt10168++;
		Node_Sub15_Sub9.anInterface6_9843 = null;
		Node_Sub29_Sub1.anInt10012 = -1;
		Class290_Sub4.anIntArray8102 = null;
		Class225.aClass336_2678 = null;
		Class72.anInt973 = -1;
		Class320_Sub20.anInt8397 = i;
		Class44.aGraphicsToolkit668 = null;
		Class368.anInt4550 = -1;
		Class352.anInterface6Array4332 = null;
		Npc.aClass336_11113 = null;
		Class7.aClass179_157.method1815((byte) 74);
	}
	
	final boolean method2814(byte b) {
		if (b < 75) {
			return true;
		}
		anInt10171++;
		if (anIntArray10165 != null) {
			return true;
		}
		if ((anInt10173 ^ 0xffffffff) <= -1) {
			Class383 class383 = Class230.anInt5209 >= 0 ? Class383.method4194(Class308.aClass302_3909, Class230.anInt5209, anInt10173) : Class383.method4191(Class308.aClass302_3909, anInt10173);
			class383.method4201();
			anIntArray10165 = class383.method4195();
			anInt10172 = class383.anInt4900;
			anInt10169 = class383.anInt4897;
			return true;
		}
		return false;
	}
	
	final void method2787(int i) {
		anInt10170++;
		super.method2787(-77);
		anIntArray10165 = null;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10164++;
		if (bool == false) {
			if ((i ^ 0xffffffff) == -1) {
				anInt10173 = buffer.readUnsignedShort();
			}
		}
	}
	
	static final void method2815(boolean bool, int i) {
		if (bool == false) {
			anInt10161++;
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 1, (long) i);
			cachenode_sub2.method2291((byte) 121);
		}
	}
	
	final int method2776(byte b) {
		anInt10160++;
		return anInt10173;
	}
	
	public static void method2816(boolean bool) {
		if (bool != true) {
			aFloatArray10162 = null;
		}
		aFloatArray10162 = null;
	}
	
	static {
		aFloatArray10162 = new float[16];
	}
}
