/* CacheNode_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub19 extends CacheNode
{
	static int anInt9610;
	private Node_Sub38 aNode_Sub38_9611;
	static int anInt9612;
	static int anInt9613;
	private int[] anIntArray9614;
	static int anInt9615;
	private int[] anIntArray9616;
	private Node_Sub38 aNode_Sub38_9617;
	private Node_Sub38[] aNode_Sub38Array9618;
	private Node_Sub38 aNode_Sub38_9619;
	static int anInt9620;
	static Class68 aClass68_9621 = new Class68(3);
	static String[] aStringArray9622;
	
	final float[] method2400(byte b, int i, d var_d, Index class302, boolean bool, int i_0_) {
		Class308.aClass302_3909 = class302;
		if (b >= -98) {
			method2400((byte) -31, -48, null, null, true, -25);
		}
		anInt9613++;
		Node_Sub38_Sub35.aD10455 = var_d;
		for (int i_1_ = 0; i_1_ < aNode_Sub38Array9618.length; i_1_++)
			aNode_Sub38Array9618[i_1_].method2782(i, i_0_, false);
		Class169_Sub1.method1769(485964236, i, i_0_);
		float[] fs = new float[4 * i_0_ * i];
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int[] is;
			int[] is_4_;
			int[] is_5_;
			if (aNode_Sub38_9619.aBoolean7463) {
				int[] is_6_ = aNode_Sub38_9619.method2775(117, i_3_);
				is_4_ = is_6_;
				is = is_6_;
				is_5_ = is_6_;
			} else {
				int[][] is_7_ = aNode_Sub38_9619.method2778(i_3_, true);
				is = is_7_[0];
				is_4_ = is_7_[2];
				is_5_ = is_7_[1];
			}
			int[] is_8_;
			if (aNode_Sub38_9611.aBoolean7463) {
				is_8_ = aNode_Sub38_9611.method2775(114, i_3_);
			} else {
				is_8_ = aNode_Sub38_9611.method2778(i_3_, true)[0];
			}
			if (bool) {
				i_2_ = i_3_ << 2;
			}
			int[] is_9_;
			if (aNode_Sub38_9617.aBoolean7463) {
				is_9_ = aNode_Sub38_9617.method2775(115, i_3_);
			} else {
				is_9_ = aNode_Sub38_9617.method2778(i_3_, true)[0];
			}
			for (int i_10_ = -1 + i_0_; i_10_ >= 0; i_10_--) {
				float f = (float) is_8_[i_10_] / 4096.0F;
				if (f < 0.0F) {
					f = 0.0F;
				} else if (f > 1.0F) {
					f = 1.0F;
				}
				float f_11_ = (1.0F + 31.0F * (float) is_9_[i_10_] / 4096.0F) / 4096.0F;
				fs[i_2_++] = f_11_ * (float) is[i_10_];
				fs[i_2_++] = f_11_ * (float) is_5_[i_10_];
				fs[i_2_++] = f_11_ * (float) is_4_[i_10_];
				fs[i_2_++] = f;
				if (bool) {
					i_2_ += -4 + (i_0_ << 2);
				}
			}
		}
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (aNode_Sub38Array9618.length ^ 0xffffffff); i_12_++)
			aNode_Sub38Array9618[i_12_].method2787(108);
		return fs;
	}
	
	final boolean method2401(Index class302, d var_d, byte b) {
		anInt9612++;
		if ((Class230.anInt5209 ^ 0xffffffff) > -1) {
			for (int i = 0; anIntArray9616.length > i; i++) {
				if (!class302.method3510(anIntArray9616[i], (byte) 63)) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < anIntArray9616.length; i++) {
				if (!class302.method3515(anIntArray9616[i], Class230.anInt5209, 0)) {
					return false;
				}
			}
		}
		if (b != 4) {
			return true;
		}
		for (int i = 0; (anIntArray9614.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (!var_d.method7(9900, anIntArray9614[i])) {
				return false;
			}
		}
		return true;
	}
	
	final int[] method2402(int i, double d, boolean bool, int i_13_, byte b, d var_d, Index class302) {
		Class308.aClass302_3909 = class302;
		Node_Sub38_Sub35.aD10455 = var_d;
		anInt9615++;
		for (int i_14_ = 0; (aNode_Sub38Array9618.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
			aNode_Sub38Array9618[i_14_].method2782(i_13_, i, false);
		Class385.method4205(false, d);
		Class169_Sub1.method1769(485964236, i_13_, i);
		int[] is = new int[i * i_13_];
		int i_16_ = 0;
		for (int i_17_ = 0; i_13_ > i_17_; i_17_++) {
			int[] is_18_;
			int[] is_19_;
			int[] is_20_;
			if (!aNode_Sub38_9619.aBoolean7463) {
				int[][] is_21_ = aNode_Sub38_9619.method2778(i_17_, true);
				is_20_ = is_21_[0];
				is_18_ = is_21_[2];
				is_19_ = is_21_[1];
			} else {
				int[] is_22_ = aNode_Sub38_9619.method2775(117, i_17_);
				is_18_ = is_22_;
				is_19_ = is_22_;
				is_20_ = is_22_;
			}
			int[] is_23_;
			if (aNode_Sub38_9611.aBoolean7463) {
				is_23_ = aNode_Sub38_9611.method2775(111, i_17_);
			} else {
				is_23_ = aNode_Sub38_9611.method2778(i_17_, true)[0];
			}
			if (bool) {
				i_16_ = i_17_;
			}
			for (int i_24_ = i + -1; i_24_ >= 0; i_24_--) {
				int i_25_ = is_20_[i_24_] >> 4;
				if (i_25_ > 255) {
					i_25_ = 255;
				}
				if (i_25_ < 0) {
					i_25_ = 0;
				}
				int i_26_ = is_19_[i_24_] >> 4;
				if (i_26_ > 255) {
					i_26_ = 255;
				}
				if (i_26_ < 0) {
					i_26_ = 0;
				}
				int i_27_ = is_18_[i_24_] >> 4;
				if ((i_27_ ^ 0xffffffff) < -256) {
					i_27_ = 255;
				}
				i_26_ = PlayerUpdateReference.anIntArray4084[i_26_];
				if ((i_27_ ^ 0xffffffff) > -1) {
					i_27_ = 0;
				}
				i_25_ = PlayerUpdateReference.anIntArray4084[i_25_];
				i_27_ = PlayerUpdateReference.anIntArray4084[i_27_];
				int i_28_;
				if (i_25_ == 0 && (i_26_ ^ 0xffffffff) == -1 && (i_27_ ^ 0xffffffff) == -1) {
					i_28_ = 0;
				} else {
					i_28_ = is_23_[i_24_] >> 4;
					if ((i_28_ ^ 0xffffffff) < -256) {
						i_28_ = 255;
					}
					if ((i_28_ ^ 0xffffffff) > -1) {
						i_28_ = 0;
					}
				}
				is[i_16_++] = (i_26_ << 8) + (i_28_ << 24) - (-(i_25_ << 16) - i_27_);
				if (bool) {
					i_16_ += i - 1;
				}
			}
		}
		for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (aNode_Sub38Array9618.length ^ 0xffffffff); i_29_++)
			aNode_Sub38Array9618[i_29_].method2787(103);
		return is;
	}
	
	public static void method2403(int i) {
		if (i == 13012) {
			aClass68_9621 = null;
			aStringArray9622 = null;
		}
	}
	
	static final boolean method2404(int i, int i_30_, int i_31_) {
		anInt9610++;
        return (0x20 & i_30_) != 0;
    }
	
	final int[] method2405(Index class302, double d, boolean bool, d var_d, boolean bool_33_, int i, int i_34_, int i_35_) {
		Node_Sub38_Sub35.aD10455 = var_d;
		Class308.aClass302_3909 = class302;
		anInt9620++;
		for (int i_36_ = 0; aNode_Sub38Array9618.length > i_36_; i_36_++)
			aNode_Sub38Array9618[i_36_].method2782(i, i_34_, false);
		Class385.method4205(false, d);
		Class169_Sub1.method1769(485964236, i, i_34_);
		int[] is = new int[i * i_34_];
		int i_37_;
		int i_38_;
		int i_39_;
		if (!bool_33_) {
			i_37_ = i_34_;
			i_38_ = 0;
			i_39_ = 1;
		} else {
			i_37_ = -1;
			i_38_ = -1 + i_34_;
			i_39_ = -1;
		}
		int i_40_ = i_35_;
		for (int i_41_ = 0; i > i_41_; i_41_++) {
			int[] is_42_;
			int[] is_43_;
			int[] is_44_;
			if (aNode_Sub38_9619.aBoolean7463) {
				int[] is_45_ = aNode_Sub38_9619.method2775(127, i_41_);
				is_43_ = is_45_;
				is_42_ = is_45_;
				is_44_ = is_45_;
			} else {
				int[][] is_46_ = aNode_Sub38_9619.method2778(i_41_, true);
				is_42_ = is_46_[2];
				is_43_ = is_46_[1];
				is_44_ = is_46_[0];
			}
			if (bool) {
				i_40_ = i_41_;
			}
			for (int i_47_ = i_38_; (i_37_ ^ 0xffffffff) != (i_47_ ^ 0xffffffff); i_47_ += i_39_) {
				int i_48_ = is_44_[i_47_] >> 4;
				if (i_48_ > 255) {
					i_48_ = 255;
				}
				if ((i_48_ ^ 0xffffffff) > -1) {
					i_48_ = 0;
				}
				int i_49_ = is_43_[i_47_] >> 4;
				if ((i_49_ ^ 0xffffffff) < -256) {
					i_49_ = 255;
				}
				if (i_49_ < 0) {
					i_49_ = 0;
				}
				int i_50_ = is_42_[i_47_] >> 4;
				if (i_50_ > 255) {
					i_50_ = 255;
				}
				i_49_ = PlayerUpdateReference.anIntArray4084[i_49_];
				i_48_ = PlayerUpdateReference.anIntArray4084[i_48_];
				if ((i_50_ ^ 0xffffffff) > -1) {
					i_50_ = 0;
				}
				i_50_ = PlayerUpdateReference.anIntArray4084[i_50_];
				int i_51_ = (i_48_ << 16) + (i_49_ << 8) - -i_50_;
				if ((i_51_ ^ 0xffffffff) != -1) {
					i_51_ |= ~0xffffff;
				}
				is[i_40_++] = i_51_;
				if (bool) {
					i_40_ += i_34_ - 1;
				}
			}
		}
		for (int i_52_ = 0; (i_52_ ^ 0xffffffff) > (aNode_Sub38Array9618.length ^ 0xffffffff); i_52_++)
			aNode_Sub38Array9618[i_52_].method2787(115);
		return is;
	}
	
	public CacheNode_Sub19() {
		anIntArray9616 = new int[0];
		anIntArray9614 = new int[0];
		aNode_Sub38_9617 = new Node_Sub38_Sub17(0);
		aNode_Sub38_9617.anInt7450 = 1;
		aNode_Sub38_9619 = new Node_Sub38_Sub17();
		aNode_Sub38_9619.anInt7450 = 1;
		aNode_Sub38_9611 = new Node_Sub38_Sub17();
		aNode_Sub38_9611.anInt7450 = 1;
		aNode_Sub38Array9618 = new Node_Sub38[] { aNode_Sub38_9619, aNode_Sub38_9611, aNode_Sub38_9617 };
	}
	
	CacheNode_Sub19(BufferedStream buffer) {
		int i = buffer.readUnsignedByte();
		int i_53_ = 0;
		int i_54_ = 0;
		int[][] is = new int[i][];
		aNode_Sub38Array9618 = new Node_Sub38[i];
		for (int i_55_ = 0; i > i_55_; i_55_++) {
			Node_Sub38 node_sub38 = Class157.method1712(-57, buffer);
			if ((node_sub38.method2776((byte) -100) ^ 0xffffffff) <= -1) {
				i_53_++;
			}
			if (node_sub38.method2783(-1) >= 0) {
				i_54_++;
			}
			int i_56_ = node_sub38.aNode_Sub38Array7453.length;
			is[i_55_] = new int[i_56_];
			for (int i_57_ = 0; (i_56_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++)
				is[i_55_][i_57_] = buffer.readUnsignedByte();
			aNode_Sub38Array9618[i_55_] = node_sub38;
		}
		anIntArray9616 = new int[i_53_];
		anIntArray9614 = new int[i_54_];
		i_53_ = 0;
		i_54_ = 0;
		for (int i_58_ = 0; (i ^ 0xffffffff) < (i_58_ ^ 0xffffffff); i_58_++) {
			Node_Sub38 node_sub38 = aNode_Sub38Array9618[i_58_];
			int i_59_ = node_sub38.aNode_Sub38Array7453.length;
			for (int i_60_ = 0; (i_59_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff); i_60_++)
				node_sub38.aNode_Sub38Array7453[i_60_] = aNode_Sub38Array9618[is[i_58_][i_60_]];
			int i_61_ = node_sub38.method2776((byte) -84);
			int i_62_ = node_sub38.method2783(-1);
			if ((i_61_ ^ 0xffffffff) < -1) {
				anIntArray9616[i_53_++] = i_61_;
			}
			if (i_62_ > 0) {
				anIntArray9614[i_54_++] = i_62_;
			}
			is[i_58_] = null;
		}
		aNode_Sub38_9619 = aNode_Sub38Array9618[buffer.readUnsignedByte()];
		aNode_Sub38_9611 = aNode_Sub38Array9618[buffer.readUnsignedByte()];
		aNode_Sub38_9617 = aNode_Sub38Array9618[buffer.readUnsignedByte()];
	}
}
