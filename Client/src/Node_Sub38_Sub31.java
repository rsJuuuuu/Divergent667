/* Node_Sub38_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub31 extends Node_Sub38
{
	static int anInt10416;
	static int anInt10417;
	static boolean aBoolean10418 = false;
	static int anInt10419;
	static long aLong10420;
	static int anInt10421;
	static Index aClass302_10422;
	static int anInt10423;
	
	public Node_Sub38_Sub31() {
		super(1, false);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (i == 0) {
			aBoolean7463 = buffer.readUnsignedByte() == 1;
		}
		anInt10417++;
		if (bool != false) {
			aClass302_10422 = null;
		}
	}
	
	private final void method2891(int i, int i_0_, byte b) {
		anInt10416++;
		int i_1_ = CacheNode_Sub3.anIntArray9442[i];
		int i_2_ = Node_Sub25_Sub1.anIntArray9941[i_0_];
		float f = (float) Math.atan2((double) (-2048 + i_1_), (double) (-2048 + i_2_));
		if (!((double) f >= -3.141592653589793) || !((double) f <= -2.356194490192345)) {
			if (!((double) f <= -1.5707963267948966) || !((double) f >= -2.356194490192345)) {
				if (!((double) f <= -0.7853981633974483) || !((double) f >= -1.5707963267948966)) {
					if (f <= 0.0F && (double) f >= -0.7853981633974483) {
						Node_Sub38_Sub3.anInt10102 = i;
						Node_Sub38_Sub9.anInt10192 = Node_Sub38_Sub1.anInt10083 - i_0_;
					} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
						Node_Sub38_Sub9.anInt10192 = -i_0_ + Node_Sub38_Sub1.anInt10083;
						Node_Sub38_Sub3.anInt10102 = -i + Class339_Sub7.anInt8728;
					} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
						Node_Sub38_Sub9.anInt10192 = Node_Sub38_Sub1.anInt10083 - i;
						Node_Sub38_Sub3.anInt10102 = -i_0_ + Class339_Sub7.anInt8728;
					} else if (!((double) f >= 1.5707963267948966) || !((double) f <= 2.356194490192345)) {
						if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
							Node_Sub38_Sub9.anInt10192 = i_0_;
							Node_Sub38_Sub3.anInt10102 = Class339_Sub7.anInt8728 + -i;
						}
					} else {
						Node_Sub38_Sub3.anInt10102 = i_0_;
						Node_Sub38_Sub9.anInt10192 = Node_Sub38_Sub1.anInt10083 + -i;
					}
				} else {
					Node_Sub38_Sub3.anInt10102 = -i_0_ + Class339_Sub7.anInt8728;
					Node_Sub38_Sub9.anInt10192 = i;
				}
			} else {
				Node_Sub38_Sub9.anInt10192 = i;
				Node_Sub38_Sub3.anInt10102 = i_0_;
			}
		} else {
			Node_Sub38_Sub9.anInt10192 = i_0_;
			Node_Sub38_Sub3.anInt10102 = i;
		}
		Node_Sub38_Sub9.anInt10192 &= r_Sub2.anInt11054;
		if (b != -48) {
			method2892(70);
		}
		Node_Sub38_Sub3.anInt10102 &= Class303.anInt3824;
	}
	
	public static void method2892(int i) {
		if (i > -86) {
			method2893(3);
		}
		aClass302_10422 = null;
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			method2891(-109, -27, (byte) 25);
		}
		anInt10421++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[] is_3_ = is[0];
			int[] is_4_ = is[1];
			int[] is_5_ = is[2];
			for (int i_6_ = 0; Class339_Sub7.anInt8728 > i_6_; i_6_++) {
				method2891(i_6_, i, (byte) -48);
				int[][] is_7_ = this.method2777(-95, 0, Node_Sub38_Sub9.anInt10192);
				is_3_[i_6_] = is_7_[0][Node_Sub38_Sub3.anInt10102];
				is_4_[i_6_] = is_7_[1][Node_Sub38_Sub3.anInt10102];
				is_5_[i_6_] = is_7_[2][Node_Sub38_Sub3.anInt10102];
			}
		}
		return is;
	}
	
	final int[] method2775(int i, int i_8_) {
		if (i <= 107) {
			method2893(90);
		}
		anInt10423++;
		int[] is = aClass146_7460.method1645(27356, i_8_);
		if (aClass146_7460.aBoolean1819) {
			for (int i_9_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				method2891(i_9_, i_8_, (byte) -48);
				int[] is_10_ = this.method2786(Node_Sub38_Sub9.anInt10192, 0, 0);
				is[i_9_] = is_10_[Node_Sub38_Sub3.anInt10102];
			}
		}
		return is;
	}
	
	static final void method2893(int i) {
		anInt10419++;
		FileOnDisk fileondisk = null;
		try {
			if (i != 1) {
				method2892(1);
			}
			Class241 class241 = Class240.aSignLink2946.method3631(true, "", (byte) 122);
			while (class241.anInt2953 == 0)
				Class262_Sub22.method3208(1L, false);
			if ((class241.anInt2953 ^ 0xffffffff) == -2) {
				fileondisk = (FileOnDisk) class241.anObject2956;
				BufferedStream buffer = Class213.aNode_Sub27_2512.method2696(11665);
				fileondisk.method1102((byte) 76, buffer.buffer, 0, buffer.offset);
			}
		} catch (Exception exception) {
			/* empty */
		}
		do {
			try {
				if (fileondisk == null) {
					break;
				}
				fileondisk.method1098(true);
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}
}
