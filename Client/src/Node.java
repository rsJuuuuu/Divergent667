/* Node - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node
{
	static int anInt2793;
	static int anInt2794;
	static Class61 aClass61_2795;
	static int anInt2796;
	protected long aLong2797;
	static int anInt2798;
	protected Node aNode2799;
	protected Node aNode2800;
	static int[][] anIntArrayArray2801 = { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
	static int[] anIntArray2802;
	
	final void method2160(byte b) {
		anInt2793++;
		if (aNode2799 != null) {
			aNode2799.aNode2800 = aNode2800;
			aNode2800.aNode2799 = aNode2799;
			aNode2800 = null;
			if (b < 20) {
				method2161(-41);
			}
			aNode2799 = null;
		}
	}
	
	final boolean method2161(int i) {
		anInt2798++;
		if (i >= -107) {
			return false;
		}
        return aNode2799 != null;
    }
	
	static final void method2162(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (i_2_ != 32021) {
			method2164(103);
		}
		if ((Class262_Sub4.anInt7722 ^ 0xffffffff) < (i_5_ ^ 0xffffffff) || (i_0_ ^ 0xffffffff) < (za_Sub2.anInt10513 ^ 0xffffffff) || (Class384.anInt4906 ^ 0xffffffff) < (i_3_ ^ 0xffffffff) || (i_4_ ^ 0xffffffff) < (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff)) {
			Class288.method3404(i_4_, i_5_, i_1_, true, i_3_, i_0_, i_6_, i);
		} else {
			Class240.method3031(i_4_, i_0_, i_1_, false, i, i_5_, i_6_, i_3_);
		}
		anInt2794++;
	}
	
	static final boolean method2163(int i, int i_7_, int i_8_, byte b, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		anInt2796++;
		if ((i_7_ ^ 0xffffffff) < -2001 || (i_12_ ^ 0xffffffff) < -2001 || (i_10_ ^ 0xffffffff) < -2001 || (i ^ 0xffffffff) < -2001 || (i_14_ ^ 0xffffffff) < -2001 || i_11_ > 2000) {
			return false;
		}
		if ((i_7_ ^ 0xffffffff) > 1999 || i_12_ < -2000 || i_10_ < -2000 || (i ^ 0xffffffff) > 1999 || i_14_ < -2000 || i_11_ < -2000) {
			return false;
		}
		if (Class320_Sub11.anInt8315 == 2) {
			int i_15_ = Class144_Sub1.anInt6806 * i_7_ + i;
			if (i_15_ >= 0 && (i_15_ ^ 0xffffffff) > (Node_Sub38.anIntArray7451.length ^ 0xffffffff) && (Node_Sub38.anIntArray7451[i_15_] ^ 0xffffffff) < ((i_13_ << 8) - 38400 ^ 0xffffffff)) {
				return false;
			}
			i_15_ = Class144_Sub1.anInt6806 * i_12_ + i_14_;
			if (i_15_ >= 0 && Node_Sub38.anIntArray7451.length > i_15_ && (i_9_ << 8) - 38400 < Node_Sub38.anIntArray7451[i_15_]) {
				return false;
			}
			i_15_ = i_10_ * Class144_Sub1.anInt6806 + i_11_;
			if (i_15_ >= 0 && (Node_Sub38.anIntArray7451.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff) && ((i_8_ << 8) + -38400 ^ 0xffffffff) > (Node_Sub38.anIntArray7451[i_15_] ^ 0xffffffff)) {
				return false;
			}
		}
		int i_16_ = i_14_ - i;
		int i_17_ = -i_7_ + i_12_;
		int i_18_ = i_11_ + -i;
		int i_19_ = -i_7_ + i_10_;
		int i_20_ = -i_13_ + i_9_;
		if ((i_12_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) || (i_10_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
			if ((i_10_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) {
				if ((i_12_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
					i_7_++;
				} else {
					i_12_++;
				}
				i_10_--;
			} else {
				if ((i_7_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
					i_10_++;
				} else {
					i_7_++;
				}
				i_12_--;
			}
		} else {
			if (i_12_ <= i_10_) {
				i_10_++;
			} else {
				i_12_++;
			}
			i_7_--;
		}
		int i_21_ = -i_13_ + i_8_;
		int i_22_ = 0;
		if (i_7_ != i_12_) {
			i_22_ = (i_14_ + -i << 12) / (i_12_ + -i_7_);
		}
		int i_23_ = 0;
		if ((i_10_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff)) {
			i_23_ = (-i_14_ + i_11_ << 12) / (i_10_ + -i_12_);
		}
		int i_24_ = 0;
		if (b > -27) {
			method2163(-84, 72, -36, (byte) 18, -43, 69, -25, 97, -91, -31);
		}
		if (i_10_ != i_7_) {
			i_24_ = (-i_11_ + i << 12) / (i_7_ - i_10_);
		}
		int i_25_ = -(i_17_ * i_18_) + i_19_ * i_16_;
		if (i_25_ == 0) {
			return false;
		}
		int i_26_ = (i_19_ * i_20_ - i_21_ * i_17_ << 8) / i_25_;
		int i_27_ = (i_21_ * i_16_ - i_20_ * i_18_ << 8) / i_25_;
		if (i_7_ <= i_12_ && (i_10_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) {
			if (Class331.anInt4130 <= i_7_) {
				return true;
			}
			if (i_10_ > Class331.anInt4130) {
				i_10_ = Class331.anInt4130;
			}
			i_13_ = i_26_ + ((i_13_ << 8) - i_26_ * i);
			if (Class331.anInt4130 < i_12_) {
				i_12_ = Class331.anInt4130;
			}
			if (i_10_ > i_12_) {
				i_11_ = i <<= 12;
				i_14_ <<= 12;
				if ((i_7_ ^ 0xffffffff) > -1) {
					i_13_ -= i_7_ * i_27_;
					i -= i_22_ * i_7_;
					i_11_ -= i_7_ * i_24_;
					i_7_ = 0;
				}
				if ((i_12_ ^ 0xffffffff) > -1) {
					i_14_ -= i_12_ * i_23_;
					i_12_ = 0;
				}
				if (((i_7_ ^ 0xffffffff) == (i_12_ ^ 0xffffffff) || (i_22_ ^ 0xffffffff) >= (i_24_ ^ 0xffffffff)) && (i_7_ != i_12_ || i_24_ <= i_23_)) {
					i_10_ -= i_12_;
					i_12_ -= i_7_;
					i_7_ *= Class144_Sub1.anInt6806;
					while (--i_12_ >= 0) {
						if (!Class24.method305((i >> 12) + -1, 1 + (i_11_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
							return false;
						}
						i_13_ += i_27_;
						i_7_ += Class144_Sub1.anInt6806;
						i += i_22_;
						i_11_ += i_24_;
					}
					while (--i_10_ >= 0) {
						if (!Class24.method305((i_14_ >> 12) + -1, (i_11_ >> 12) + 1, i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
							return false;
						}
						i_11_ += i_24_;
						i_13_ += i_27_;
						i_7_ += Class144_Sub1.anInt6806;
						i_14_ += i_23_;
					}
					return true;
				}
				i_10_ -= i_12_;
				i_12_ -= i_7_;
				i_7_ = Class144_Sub1.anInt6806 * i_7_;
				while ((--i_12_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305((i_11_ >> 12) + -1, 1 + (i >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
						return false;
					}
					i += i_22_;
					i_13_ += i_27_;
					i_7_ += Class144_Sub1.anInt6806;
					i_11_ += i_24_;
				}
				while ((--i_10_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305((i_11_ >> 12) + -1, 1 + (i_14_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
						return false;
					}
					i_11_ += i_24_;
					i_14_ += i_23_;
					i_13_ += i_27_;
					i_7_ += Class144_Sub1.anInt6806;
				}
				return true;
			}
			i_14_ = i <<= 12;
			i_11_ <<= 12;
			if (i_7_ < 0) {
				i_13_ -= i_7_ * i_27_;
				i -= i_7_ * i_22_;
				i_14_ -= i_24_ * i_7_;
				i_7_ = 0;
			}
			if ((i_10_ ^ 0xffffffff) > -1) {
				i_11_ -= i_10_ * i_23_;
				i_10_ = 0;
			}
			if (i_7_ != i_10_ && i_24_ < i_22_ || i_7_ == i_10_ && (i_23_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff)) {
				i_12_ -= i_10_;
				i_10_ -= i_7_;
				i_7_ = Class144_Sub1.anInt6806 * i_7_;
				while (--i_10_ >= 0) {
					if (!Class24.method305((i_14_ >> 12) + -1, 1 + (i >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
						return false;
					}
					i += i_22_;
					i_13_ += i_27_;
					i_14_ += i_24_;
					i_7_ += Class144_Sub1.anInt6806;
				}
				while ((--i_12_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305((i_11_ >> 12) + -1, 1 + (i >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
						return false;
					}
					i_11_ += i_23_;
					i += i_22_;
					i_13_ += i_27_;
					i_7_ += Class144_Sub1.anInt6806;
				}
				return true;
			}
			i_12_ -= i_10_;
			i_10_ -= i_7_;
			i_7_ = Class144_Sub1.anInt6806 * i_7_;
			while ((--i_10_ ^ 0xffffffff) <= -1) {
				if (!Class24.method305((i >> 12) - 1, (i_14_ >> 12) - -1, i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
					return false;
				}
				i += i_22_;
				i_7_ += Class144_Sub1.anInt6806;
				i_14_ += i_24_;
				i_13_ += i_27_;
			}
			while (--i_12_ >= 0) {
				if (!Class24.method305(-1 + (i >> 12), 1 + (i_11_ >> 12), i_13_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_7_)) {
					return false;
				}
				i_13_ += i_27_;
				i += i_22_;
				i_7_ += Class144_Sub1.anInt6806;
				i_11_ += i_23_;
			}
			return true;
		}
		if ((i_10_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
			if ((Class331.anInt4130 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
				return true;
			}
			if ((Class331.anInt4130 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
				i_7_ = Class331.anInt4130;
			}
			if ((i_12_ ^ 0xffffffff) < (Class331.anInt4130 ^ 0xffffffff)) {
				i_12_ = Class331.anInt4130;
			}
			i_8_ = i_26_ + ((i_8_ << 8) + -(i_11_ * i_26_));
			if ((i_12_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
				i_14_ = i_11_ <<= 12;
				if (i_10_ < 0) {
					i_11_ -= i_24_ * i_10_;
					i_14_ -= i_10_ * i_23_;
					i_8_ -= i_10_ * i_27_;
					i_10_ = 0;
				}
				i <<= 12;
				if ((i_7_ ^ 0xffffffff) > -1) {
					i -= i_7_ * i_22_;
					i_7_ = 0;
				}
				if (i_24_ <= i_23_) {
					i_12_ -= i_7_;
					i_7_ -= i_10_;
					i_10_ *= Class144_Sub1.anInt6806;
					while (--i_7_ >= 0) {
						if (!Class24.method305((i_11_ >> 12) - 1, 1 + (i_14_ >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
							return false;
						}
						i_10_ += Class144_Sub1.anInt6806;
						i_11_ += i_24_;
						i_8_ += i_27_;
						i_14_ += i_23_;
					}
					while (--i_12_ >= 0) {
						if (!Class24.method305((i >> 12) - 1, (i_14_ >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
							return false;
						}
						i_8_ += i_27_;
						i_14_ += i_23_;
						i_10_ += Class144_Sub1.anInt6806;
						i += i_22_;
					}
					return true;
				}
				i_12_ -= i_7_;
				i_7_ -= i_10_;
				i_10_ *= Class144_Sub1.anInt6806;
				while (--i_7_ >= 0) {
					if (!Class24.method305(-1 + (i_14_ >> 12), (i_11_ >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
						return false;
					}
					i_11_ += i_24_;
					i_10_ += Class144_Sub1.anInt6806;
					i_8_ += i_27_;
					i_14_ += i_23_;
				}
				while ((--i_12_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305(-1 + (i_14_ >> 12), 1 + (i >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
						return false;
					}
					i_8_ += i_27_;
					i_14_ += i_23_;
					i += i_22_;
					i_10_ += Class144_Sub1.anInt6806;
				}
				return true;
			}
			i = i_11_ <<= 12;
			if (i_10_ < 0) {
				i -= i_23_ * i_10_;
				i_8_ -= i_27_ * i_10_;
				i_11_ -= i_24_ * i_10_;
				i_10_ = 0;
			}
			i_14_ <<= 12;
			if (i_12_ < 0) {
				i_14_ -= i_22_ * i_12_;
				i_12_ = 0;
			}
			if ((i_24_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)) {
				i_7_ -= i_12_;
				i_12_ -= i_10_;
				i_10_ = Class144_Sub1.anInt6806 * i_10_;
				while (--i_12_ >= 0) {
					if (!Class24.method305(-1 + (i_11_ >> 12), (i >> 12) + 1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
						return false;
					}
					i += i_23_;
					i_10_ += Class144_Sub1.anInt6806;
					i_8_ += i_27_;
					i_11_ += i_24_;
				}
				while ((--i_7_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305((i_11_ >> 12) + -1, (i_14_ >> 12) - -1, i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
						return false;
					}
					i_14_ += i_22_;
					i_10_ += Class144_Sub1.anInt6806;
					i_11_ += i_24_;
					i_8_ += i_27_;
				}
				return true;
			}
			i_7_ -= i_12_;
			i_12_ -= i_10_;
			i_10_ *= Class144_Sub1.anInt6806;
			while (--i_12_ >= 0) {
				if (!Class24.method305(-1 + (i >> 12), 1 + (i_11_ >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
					return false;
				}
				i_8_ += i_27_;
				i += i_23_;
				i_11_ += i_24_;
				i_10_ += Class144_Sub1.anInt6806;
			}
			while (--i_7_ >= 0) {
				if (!Class24.method305(-1 + (i_14_ >> 12), 1 + (i_11_ >> 12), i_8_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_10_)) {
					return false;
				}
				i_8_ += i_27_;
				i_10_ += Class144_Sub1.anInt6806;
				i_11_ += i_24_;
				i_14_ += i_22_;
			}
			return true;
		}
		if ((Class331.anInt4130 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) {
			return true;
		}
		if ((Class331.anInt4130 ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
			i_10_ = Class331.anInt4130;
		}
		if ((i_7_ ^ 0xffffffff) < (Class331.anInt4130 ^ 0xffffffff)) {
			i_7_ = Class331.anInt4130;
		}
		i_9_ = (i_9_ << 8) - (i_14_ * i_26_ + -i_26_);
		if (i_10_ >= i_7_) {
			i_11_ = i_14_ <<= 12;
			if ((i_12_ ^ 0xffffffff) > -1) {
				i_14_ -= i_12_ * i_23_;
				i_9_ -= i_27_ * i_12_;
				i_11_ -= i_22_ * i_12_;
				i_12_ = 0;
			}
			i <<= 12;
			if ((i_7_ ^ 0xffffffff) > -1) {
				i -= i_7_ * i_24_;
				i_7_ = 0;
			}
			if (i_23_ > i_22_) {
				i_10_ -= i_7_;
				i_7_ -= i_12_;
				i_12_ = Class144_Sub1.anInt6806 * i_12_;
				while ((--i_7_ ^ 0xffffffff) <= -1) {
					if (!Class24.method305(-1 + (i_11_ >> 12), 1 + (i_14_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
						return false;
					}
					i_14_ += i_23_;
					i_12_ += Class144_Sub1.anInt6806;
					i_9_ += i_27_;
					i_11_ += i_22_;
				}
				while (--i_10_ >= 0) {
					if (!Class24.method305((i >> 12) + -1, 1 + (i_14_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
						return false;
					}
					i_14_ += i_23_;
					i += i_24_;
					i_9_ += i_27_;
					i_12_ += Class144_Sub1.anInt6806;
				}
				return true;
			}
			i_10_ -= i_7_;
			i_7_ -= i_12_;
			i_12_ *= Class144_Sub1.anInt6806;
			while (--i_7_ >= 0) {
				if (!Class24.method305((i_14_ >> 12) + -1, 1 + (i_11_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
					return false;
				}
				i_12_ += Class144_Sub1.anInt6806;
				i_11_ += i_22_;
				i_9_ += i_27_;
				i_14_ += i_23_;
			}
			while (--i_10_ >= 0) {
				if (!Class24.method305((i_14_ >> 12) + -1, 1 + (i >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
					return false;
				}
				i_14_ += i_23_;
				i += i_24_;
				i_12_ += Class144_Sub1.anInt6806;
				i_9_ += i_27_;
			}
			return true;
		}
		i = i_14_ <<= 12;
		if ((i_12_ ^ 0xffffffff) > -1) {
			i_9_ -= i_27_ * i_12_;
			i_14_ -= i_12_ * i_23_;
			i -= i_12_ * i_22_;
			i_12_ = 0;
		}
		i_11_ <<= 12;
		if ((i_10_ ^ 0xffffffff) > -1) {
			i_11_ -= i_24_ * i_10_;
			i_10_ = 0;
		}
		if ((i_12_ == i_10_ || (i_23_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)) && (i_10_ != i_12_ || (i_24_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff))) {
			i_7_ -= i_10_;
			i_10_ -= i_12_;
			i_12_ *= Class144_Sub1.anInt6806;
			while ((--i_10_ ^ 0xffffffff) <= -1) {
				if (!Class24.method305(-1 + (i_14_ >> 12), (i >> 12) + 1, i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
					return false;
				}
				i_9_ += i_27_;
				i += i_22_;
				i_12_ += Class144_Sub1.anInt6806;
				i_14_ += i_23_;
			}
			while ((--i_7_ ^ 0xffffffff) <= -1) {
				if (!Class24.method305((i_11_ >> 12) - 1, 1 + (i >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
					return false;
				}
				i_9_ += i_27_;
				i_12_ += Class144_Sub1.anInt6806;
				i += i_22_;
				i_11_ += i_24_;
			}
			return true;
		}
		i_7_ -= i_10_;
		i_10_ -= i_12_;
		i_12_ = Class144_Sub1.anInt6806 * i_12_;
		while ((--i_10_ ^ 0xffffffff) <= -1) {
			if (!Class24.method305((i >> 12) + -1, 1 + (i_14_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
				return false;
			}
			i += i_22_;
			i_9_ += i_27_;
			i_12_ += Class144_Sub1.anInt6806;
			i_14_ += i_23_;
		}
		while ((--i_7_ ^ 0xffffffff) <= -1) {
			if (!Class24.method305(-1 + (i >> 12), 1 + (i_11_ >> 12), i_9_, false, Node_Sub38.anIntArray7451, i_26_, 0, i_12_)) {
				return false;
			}
			i += i_22_;
			i_9_ += i_27_;
			i_12_ += Class144_Sub1.anInt6806;
			i_11_ += i_24_;
		}
		return true;
	}
	
	public static void method2164(int i) {
		if (i != -1) {
			aClass61_2795 = null;
		}
		aClass61_2795 = null;
		anIntArrayArray2801 = null;
		anIntArray2802 = null;
	}
	
	public Node() {
		/* empty */
	}
	
	static {
		aClass61_2795 = new Class61(8);
		anIntArray2802 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
	}
}
