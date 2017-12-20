/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Index
{
	static int anInt3781;
	static int anInt3782;
	private Object[] anObjectArray3783;
	static int anInt3784;
	static int anInt3785;
	private Object[][] anObjectArrayArray3786;
	static int anInt3787;
	static int anInt3788;
	static int anInt3789;
	static int anInt3790;
	static int anInt3791;
	static int anInt3792;
	static int anInt3793;
	static int anInt3794;
	protected int anInt3795;
	static int anInt3796;
	private ReferenceTable anArchive3797 = null;
	static int anInt3798;
	static int anInt3799;
	static int anInt3800;
	static int anInt3801;
	static int anInt3802;
	static int anInt3803;
	private Class34 aClass34_3804;
	static int anInt3805;
	static int anInt3806;
	static int anInt3807;
	static int anInt3808;
	static int anInt3809;
	static int anInt3810;
	static int anInt3811;
	static int anInt3812;
	static int anInt3813;
	static int anInt3814;
	static int anInt3815;
	static int anInt3816;
	static int anInt3817;
	static int anInt3818;
	private boolean aBoolean3819;
	static int anInt3820;
	
	final void method3504(boolean bool, byte b, boolean bool_0_) {
		anInt3810++;
		if (method3530(0)) {
			if (bool) {
				anArchive3797.aClass75_301 = null;
				anArchive3797.anIntArray287 = null;
			}
			if (b != 31) {
				anInt3795 = -39;
			}
			if (bool_0_) {
				anArchive3797.anIntArrayArray303 = null;
				anArchive3797.aClass75Array288 = null;
			}
		}
	}
	
	final int method3505(boolean bool) {
		if (bool != false) {
			return 36;
		}
		anInt3798++;
		if (!method3530(0)) {
			throw new IllegalStateException("");
		}
		return anArchive3797.anInt291;
	}
	
	final boolean method3506(String string, boolean bool, String string_1_) {
		anInt3812++;
		if (!method3530(0)) {
			return false;
		}
		string = string.toLowerCase();
		string_1_ = string_1_.toLowerCase();
		int i = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
		if (i < 0) {
			return false;
		}
		int i_2_ = anArchive3797.aClass75Array288[i].method766(-1, Class336_Sub1.method3887(false, string_1_));
		if (i_2_ < 0) {
			return false;
		}
		if (bool != true) {
			anObjectArrayArray3786 = null;
		}
		return true;
	}
	
	final boolean method3507(byte b, String string) {
		anInt3791++;
		if (b >= -116) {
			return true;
		}
		int i = method3519("", (byte) 35);
		if (i != -1) {
			return method3533(false, "", string);
		}
		return method3533(false, string, "");
	}
	
	private final void method3508(int i, int i_3_) {
		if (!aBoolean3819) {
			anObjectArray3783[i] = Class135.method1588(aClass34_3804.method373(i, (byte) 55), 23386, false);
		} else {
			anObjectArray3783[i] = aClass34_3804.method373(i, (byte) 118);
		}
		if (i_3_ != 0) {
			aBoolean3819 = true;
		}
		anInt3814++;
	}
	
	private final int method3509(boolean bool, int i) {
		anInt3794++;
		if (!method3525((byte) -86, i)) {
			return 0;
		}
		if (anObjectArray3783[i] != null) {
			return 100;
		}
		if (bool != false) {
			anObjectArray3783 = null;
		}
		return aClass34_3804.method369((byte) -4, i);
	}
	
	final boolean method3510(int i, byte b) {
		anInt3788++;
		if (!method3530(b + -63)) {
			return false;
		}
		if (anArchive3797.anIntArray285.length == 1) {
			return method3515(i, 0, 0);
		}
		if (!method3525((byte) -86, i)) {
			return false;
		}
		if (anArchive3797.anIntArray285[i] == 1) {
			return method3515(0, i, 0);
		}
		if (b != 63) {
			anObjectArray3783 = null;
		}
		throw new RuntimeException();
	}
	
	final int method3511(int i) {
		if (i != 19492) {
			return 48;
		}
		anInt3803++;
		if (!method3530(0)) {
			return 0;
		}
		int i_4_ = 0;
		int i_5_ = 0;
		for (int i_6_ = 0; anObjectArray3783.length > i_6_; i_6_++) {
			if ((anArchive3797.anIntArray295[i_6_] ^ 0xffffffff) < -1) {
				i_4_ += 100;
				i_5_ += method3509(false, i_6_);
			}
		}
		if (i_4_ == 0) {
			return 100;
		}
		int i_7_ = i_5_ * 100 / i_4_;
		return i_7_;
	}
	
	final byte[] method3512(int[] is, int i, int i_8_, int i_9_) {
		anInt3813++;
		if (!method3513(i, i_9_, (byte) 127)) {
			return null;
		}
		if (anObjectArrayArray3786[i_9_] == null || anObjectArrayArray3786[i_9_][i] == null) {
			boolean bool = method3514(0, is, i, i_9_);
			if (!bool) {
				method3508(i_9_, 0);
				bool = method3514(0, is, i, i_9_);
				if (!bool) {
					return null;
				}
			}
		}
		byte[] bs = Class320_Sub15.method3739((byte) -48, false, anObjectArrayArray3786[i_9_][i]);
		if ((anInt3795 ^ 0xffffffff) != -2) {
			if ((anInt3795 ^ 0xffffffff) == -3) {
				anObjectArrayArray3786[i_9_] = null;
			}
		} else {
			anObjectArrayArray3786[i_9_][i] = null;
			if ((anArchive3797.anIntArray285[i_9_] ^ 0xffffffff) == -2) {
				anObjectArrayArray3786[i_9_] = null;
			}
		}
		return bs;
	}
	
	private final boolean method3513(int i, int i_11_, byte b) {
		anInt3781++;
		if (!method3530(0)) {
			return false;
		}
		if (i_11_ < 0 || (i ^ 0xffffffff) > -1 || i_11_ >= anArchive3797.anIntArray285.length || anArchive3797.anIntArray285[i_11_] <= i) {
			if (Class144_Sub3.aBoolean6833) {
				throw new IllegalArgumentException(String.valueOf(i_11_) + "," + i);
			}
			return false;
		}
		if (b < 126) {
			method3508(-92, 27);
		}
		return true;
	}
	
	private final boolean method3514(int i, int[] is, int i_12_, int i_13_) {
		if (i != 0) {
			aClass34_3804 = null;
		}
		anInt3817++;
		if (!method3525((byte) -86, i_13_)) {
			return false;
		}
		if (anObjectArray3783[i_13_] == null) {
			return false;
		}
		int i_14_ = anArchive3797.anIntArray295[i_13_];
		int[] is_15_ = anArchive3797.anIntArrayArray290[i_13_];
		if (anObjectArrayArray3786[i_13_] == null) {
			anObjectArrayArray3786[i_13_] = new Object[anArchive3797.anIntArray285[i_13_]];
		}
		Object[] objects = anObjectArrayArray3786[i_13_];
		boolean bool = true;
		for (int i_16_ = 0; i_14_ > i_16_; i_16_++) {
			int i_17_;
			if (is_15_ != null) {
				i_17_ = is_15_[i_16_];
			} else {
				i_17_ = i_16_;
			}
			if (objects[i_17_] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			return true;
		}
		byte[] bs;
		if (is == null || (is[0] ^ 0xffffffff) == -1 && (is[1] ^ 0xffffffff) == -1 && (is[2] ^ 0xffffffff) == -1 && (is[3] ^ 0xffffffff) == -1) {
			bs = Class320_Sub15.method3739((byte) 126, false, anObjectArray3783[i_13_]);
		} else {
			bs = Class320_Sub15.method3739((byte) 127, true, anObjectArray3783[i_13_]);
			BufferedStream buffer = new BufferedStream(bs);
			buffer.method2231(5, is, buffer.buffer.length, -4901);
		}
		byte[] bs_18_ = Node_Sub38_Sub26.method2875(bs, (byte) -104);
		if (aBoolean3819) {
			anObjectArray3783[i_13_] = null;
		}
		if (i_14_ <= 1) {
			int i_19_;
			if (is_15_ == null) {
				i_19_ = 0;
			} else {
				i_19_ = is_15_[0];
			}
			if (anInt3795 == 0) {
				objects[i_19_] = Class135.method1588(bs_18_, 23386, false);
			} else {
				objects[i_19_] = bs_18_;
			}
		} else if (anInt3795 != 2) {
			int i_20_ = bs_18_.length;
			int i_21_ = 0xff & bs_18_[--i_20_];
			i_20_ -= i_21_ * (i_14_ * 4);
			BufferedStream buffer = new BufferedStream(bs_18_);
			buffer.offset = i_20_;
			int[] is_22_ = new int[i_14_];
			for (int i_23_ = 0; i_21_ > i_23_; i_23_++) {
				int i_24_ = 0;
				for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_25_++) {
					i_24_ += buffer.readInt();
					is_22_[i_25_] += i_24_;
				}
			}
			byte[][] bs_26_ = new byte[i_14_][];
			for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_27_++) {
				bs_26_[i_27_] = new byte[is_22_[i_27_]];
				is_22_[i_27_] = 0;
			}
			buffer.offset = i_20_;
			int i_28_ = 0;
			for (int i_29_ = 0; i_29_ < i_21_; i_29_++) {
				int i_30_ = 0;
				for (int i_31_ = 0; i_31_ < i_14_; i_31_++) {
					i_30_ += buffer.readInt();
					Class311.method3608(bs_18_, i_28_, bs_26_[i_31_], is_22_[i_31_], i_30_);
					is_22_[i_31_] += i_30_;
					i_28_ += i_30_;
				}
			}
			for (int i_32_ = 0; i_14_ > i_32_; i_32_++) {
				int i_33_;
				if (is_15_ == null) {
					i_33_ = i_32_;
				} else {
					i_33_ = is_15_[i_32_];
				}
				if ((anInt3795 ^ 0xffffffff) == -1) {
					objects[i_33_] = Class135.method1588(bs_26_[i_32_], 23386, false);
				} else {
					objects[i_33_] = bs_26_[i_32_];
				}
			}
		} else {
			int i_34_ = bs_18_.length;
			int i_35_ = 0xff & bs_18_[--i_34_];
			i_34_ -= i_35_ * (i_14_ * 4);
			BufferedStream buffer = new BufferedStream(bs_18_);
			int i_36_ = 0;
			buffer.offset = i_34_;
			int i_37_ = 0;
			for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
				int i_39_ = 0;
				for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_40_++) {
					i_39_ += buffer.readInt();
					int i_41_;
					if (is_15_ != null) {
						i_41_ = is_15_[i_40_];
					} else {
						i_41_ = i_40_;
					}
					if ((i_12_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff)) {
						i_37_ = i_41_;
						i_36_ += i_39_;
					}
				}
			}
			if (i_36_ == 0) {
				return true;
			}
			byte[] bs_42_ = new byte[i_36_];
			buffer.offset = i_34_;
			i_36_ = 0;
			int i_43_ = 0;
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff); i_44_++) {
				int i_45_ = 0;
				for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_46_++) {
					i_45_ += buffer.readInt();
					int i_47_;
					if (is_15_ != null) {
						i_47_ = is_15_[i_46_];
					} else {
						i_47_ = i_46_;
					}
					if ((i_47_ ^ 0xffffffff) == (i_12_ ^ 0xffffffff)) {
						Class311.method3608(bs_18_, i_43_, bs_42_, i_36_, i_45_);
						i_36_ += i_45_;
					}
					i_43_ += i_45_;
				}
			}
			objects[i_37_] = bs_42_;
		}
		return true;
	}
	
	final boolean method3515(int i, int i_48_, int i_49_) {
		anInt3785++;
		if (!method3513(i, i_48_, (byte) 127)) {
			return false;
		}
		if (anObjectArrayArray3786[i_48_] != null && anObjectArrayArray3786[i_48_][i] != null) {
			return true;
		}
		if (anObjectArray3783[i_48_] != null) {
			return true;
		}
		method3508(i_48_, i_49_);
        return anObjectArray3783[i_48_] != null;
    }
	
	final boolean method3516(String string, int i) {
		anInt3799++;
		if (!method3530(0)) {
			return false;
		}
		if (i >= -72) {
			aBoolean3819 = true;
		}
		string = string.toLowerCase();
		int i_50_ = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
        return (i_50_ ^ 0xffffffff) <= -1;
    }
	
	private final void method3517(int i, int i_51_) {
		anInt3807++;
		if (i > -103) {
			anObjectArray3783 = null;
		}
		aClass34_3804.method368(0, i_51_);
	}
	
	final byte[] method3518(byte b, int i) {
		anInt3790++;
		if (!method3530(0)) {
			return null;
		}
		if ((anArchive3797.anIntArray285.length ^ 0xffffffff) == -2) {
			return method3524(false, i, 0);
		}
		if (!method3525((byte) -86, i)) {
			return null;
		}
		if (anArchive3797.anIntArray285[i] == 1) {
			return method3524(false, 0, i);
		}
		throw new RuntimeException();
	}
	
	final int method3519(String string, byte b) {
		anInt3787++;
		if (!method3530(0)) {
			return -1;
		}
		if (b <= 4) {
			return 19;
		}
		string = string.toLowerCase();
		int i = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
		if (!method3525((byte) -86, i)) {
			return -1;
		}
		return i;
	}
	
	final boolean method3520(byte b) {
		anInt3793++;
		if (!method3530(b ^ 0xf)) {
			return false;
		}
		if (b != 15) {
			aClass34_3804 = null;
		}
		boolean bool = true;
		for (int i = 0; anArchive3797.anIntArray300.length > i; i++) {
			int i_53_ = anArchive3797.anIntArray300[i];
			if (anObjectArray3783[i_53_] == null) {
				method3508(i_53_, 0);
				if (anObjectArray3783[i_53_] == null) {
					bool = false;
				}
			}
		}
		return bool;
	}
	
	final void method3521(byte b) {
		if (anObjectArrayArray3786 != null) {
			for (int i = 0; (anObjectArrayArray3786.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				anObjectArrayArray3786[i] = null;
		}
		if (b != -18) {
			method3522((byte) -82, null);
		}
		anInt3818++;
	}
	
	final int method3522(byte b, String string) {
		anInt3789++;
		if (!method3530(0)) {
			return 0;
		}
		if (b <= 26) {
			method3533(true, null, null);
		}
		string = string.toLowerCase();
		int i = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
		return method3509(false, i);
	}
	
	final void method3523(byte b) {
		anInt3796++;
		if (b != -46) {
			method3527(null, 1);
		}
		if (anObjectArray3783 != null) {
			for (int i = 0; (anObjectArray3783.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				anObjectArray3783[i] = null;
		}
	}
	
	final byte[] method3524(boolean bool, int i, int i_54_) {
		if (bool) {
			aClass34_3804 = null;
		}
		anInt3784++;
		return method3512(null, i, -126, i_54_);
	}
	
	private final boolean method3525(byte b, int i) {
		anInt3792++;
		if (!method3530(0)) {
			return false;
		}
		if ((i ^ 0xffffffff) > -1 || i >= anArchive3797.anIntArray285.length || (anArchive3797.anIntArray285[i] ^ 0xffffffff) == -1) {
			if (!Class144_Sub3.aBoolean6833) {
				return false;
			}
			throw new IllegalArgumentException(Integer.toString(i));
		}
		if (b != -86) {
			method3524(false, 111, -26);
		}
		return true;
	}
	
	final int method3526(int i) {
		anInt3782++;
		if (i != -20871) {
			method3532(-99, -38);
		}
		if (!method3530(0)) {
			return -1;
		}
		return anArchive3797.anIntArray285.length;
	}
	
	final boolean method3527(String string, int i) {
		anInt3800++;
		if (!method3530(i)) {
			return false;
		}
		string = string.toLowerCase();
		int i_55_ = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
		return method3536(-1, i_55_);
	}
	
	final int method3528(byte b, int i) {
		anInt3815++;
		if (!method3530(0)) {
			return -1;
		}
		int i_56_ = anArchive3797.aClass75_301.method766(-1, i);
		if (b != -48) {
			method3507((byte) -79, null);
		}
		if (!method3525((byte) -86, i_56_)) {
			return -1;
		}
		return i_56_;
	}
	
	final byte[] method3529(String string, String string_57_, int i) {
		anInt3820++;
		if (!method3530(0)) {
			return null;
		}
		string = string.toLowerCase();
		string_57_ = string_57_.toLowerCase();
		int i_58_ = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
		if (!method3525((byte) -86, i_58_)) {
			return null;
		}
		if (i != 1) {
			method3517(45, -91);
		}
		int i_59_ = anArchive3797.aClass75Array288[i_58_].method766(-1, Class336_Sub1.method3887(false, string_57_));
		return method3524(false, i_59_, i_58_);
	}
	
	private final boolean method3530(int i) {
		if (i != 0) {
			return false;
		}
		anInt3808++;
		if (anArchive3797 == null) {
			anArchive3797 = aClass34_3804.method374((byte) 0);
			if (anArchive3797 == null) {
				return false;
			}
			anObjectArrayArray3786 = new Object[anArchive3797.anInt296][];
			anObjectArray3783 = new Object[anArchive3797.anInt296];
		}
		return true;
	}
	
	final void method3531(String string, int i) {
		anInt3809++;
		if (method3530(0)) {
			string = string.toLowerCase();
			if (i != -18758) {
				aClass34_3804 = null;
			}
			int i_60_ = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(false, string));
			method3517(-120, i_60_);
		}
	}
	
	final int[] method3532(int i, int i_61_) {
		anInt3811++;
		if (!method3525((byte) -86, i)) {
			return null;
		}
		int[] is = anArchive3797.anIntArrayArray290[i];
		if (is == null) {
			is = new int[anArchive3797.anIntArray295[i]];
			for (int i_62_ = 0; (i_62_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_62_++)
				is[i_62_] = i_62_;
		}
		if (i_61_ != 0) {
			return null;
		}
		return is;
	}
	
	private final boolean method3533(boolean bool, String string, String string_63_) {
		anInt3816++;
		if (!method3530(0)) {
			return false;
		}
		string = string.toLowerCase();
		string_63_ = string_63_.toLowerCase();
		int i = anArchive3797.aClass75_301.method766(-1, Class336_Sub1.method3887(bool, string));
		if (!method3525((byte) -86, i)) {
			return false;
		}
		int i_64_ = anArchive3797.aClass75Array288[i].method766(-1, Class336_Sub1.method3887(bool, string_63_));
		return method3515(i_64_, i, 0);
	}
	
	final void method3534(byte b, int i) {
		anInt3805++;
		if (method3525((byte) -86, i)) {
			if (anObjectArrayArray3786 != null) {
				anObjectArrayArray3786[i] = null;
			}
		}
	}
	
	static final void method3535(java.awt.Canvas canvas, boolean bool) {
		anInt3806++;
		Dimension dimension = canvas.getSize();
		if (bool == true) {
			Node_Sub15_Sub8.method2575(dimension.height, dimension.width, 110);
			if (Class320_Sub20.anInt8397 != 1) {
				Class44.aGraphicsToolkit668.a(canvas, Animable_Sub1_Sub2.anInt10668, Class148.anInt1825);
			} else {
				Class44.aGraphicsToolkit668.a(canvas, CacheNode_Sub15.anInt9589, Class303.anInt3831);
			}
		}
	}
	
	final boolean method3536(int i, int i_66_) {
		anInt3801++;
		if (!method3525((byte) -86, i_66_)) {
			return false;
		}
		if (anObjectArray3783[i_66_] != null) {
			return true;
		}
		if (i != -1) {
			method3511(-127);
		}
		method3508(i_66_, 0);
        return anObjectArray3783[i_66_] != null;
    }
	
	final int method3537(int i, int i_67_) {
		if (i != -2) {
			anInt3795 = 123;
		}
		anInt3802++;
		if (!method3525((byte) -86, i_67_)) {
			return 0;
		}
		return anArchive3797.anIntArray285[i_67_];
	}
	
	Index(Class34 class34, boolean bool, int i) {
		if (i < 0 || (i ^ 0xffffffff) < -3) {
			throw new IllegalArgumentException("js5: Invalid value " + i + " supplied for discardunpacked");
		}
		aClass34_3804 = class34;
		aBoolean3819 = bool;
		anInt3795 = i;
	}
}
