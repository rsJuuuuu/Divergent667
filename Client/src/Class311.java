/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class311
{
	static final void method3602(int[] is, int i, int i_0_) {
		i_0_ = i + i_0_ - 7;
		while (i < i_0_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_0_ += 7;
		while (i < i_0_)
			is[i++] = 0;
	}
	
	static final void method3603(float[] fs, int i, float[] fs_1_, int i_2_, int i_3_) {
		if (fs == fs_1_) {
			if (i == i_2_) {
				return;
			}
			if (i_2_ > i && i_2_ < i + i_3_) {
				i_3_--;
				i += i_3_;
				i_2_ += i_3_;
				i_3_ = i - i_3_;
				i_3_ += 7;
				while (i >= i_3_) {
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
					fs_1_[i_2_--] = fs[i--];
				}
				i_3_ -= 7;
				while (i >= i_3_)
					fs_1_[i_2_--] = fs[i--];
				return;
			}
		}
		i_3_ += i;
		i_3_ -= 7;
		while (i < i_3_) {
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
			fs_1_[i_2_++] = fs[i++];
		}
		i_3_ += 7;
		while (i < i_3_)
			fs_1_[i_2_++] = fs[i++];
	}
	
	static final void method3604(int[] is, int i, int i_4_, int i_5_) {
		i_4_ = i + i_4_ - 7;
		while (i < i_4_) {
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
			is[i++] = i_5_;
		}
		i_4_ += 7;
		while (i < i_4_)
			is[i++] = i_5_;
	}
	
	static final void method3605(Object[] objects, int i, Object[] objects_6_, int i_7_, int i_8_) {
		if (objects == objects_6_) {
			if (i == i_7_) {
				return;
			}
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					objects_6_[i_7_--] = objects[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			objects_6_[i_7_++] = objects[i++];
	}
	
	static final void method3606(short[] ses, int i, short[] ses_9_, int i_10_, int i_11_) {
		if (ses == ses_9_) {
			if (i == i_10_) {
				return;
			}
			if (i_10_ > i && i_10_ < i + i_11_) {
				i_11_--;
				i += i_11_;
				i_10_ += i_11_;
				i_11_ = i - i_11_;
				i_11_ += 7;
				while (i >= i_11_) {
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
					ses_9_[i_10_--] = ses[i--];
				}
				i_11_ -= 7;
				while (i >= i_11_)
					ses_9_[i_10_--] = ses[i--];
				return;
			}
		}
		i_11_ += i;
		i_11_ -= 7;
		while (i < i_11_) {
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
			ses_9_[i_10_++] = ses[i++];
		}
		i_11_ += 7;
		while (i < i_11_)
			ses_9_[i_10_++] = ses[i++];
	}
	
	static final void method3607(long[] ls, int i, long[] ls_12_, int i_13_, int i_14_) {
		if (ls == ls_12_) {
			if (i == i_13_) {
				return;
			}
			if (i_13_ > i && i_13_ < i + i_14_) {
				i_14_--;
				i += i_14_;
				i_13_ += i_14_;
				i_14_ = i - i_14_;
				i_14_ += 3;
				while (i >= i_14_) {
					ls_12_[i_13_--] = ls[i--];
					ls_12_[i_13_--] = ls[i--];
					ls_12_[i_13_--] = ls[i--];
					ls_12_[i_13_--] = ls[i--];
				}
				i_14_ -= 3;
				while (i >= i_14_)
					ls_12_[i_13_--] = ls[i--];
				return;
			}
		}
		i_14_ += i;
		i_14_ -= 3;
		while (i < i_14_) {
			ls_12_[i_13_++] = ls[i++];
			ls_12_[i_13_++] = ls[i++];
			ls_12_[i_13_++] = ls[i++];
			ls_12_[i_13_++] = ls[i++];
		}
		i_14_ += 3;
		while (i < i_14_)
			ls_12_[i_13_++] = ls[i++];
	}
	
	static final void method3608(byte[] bs, int i, byte[] bs_15_, int i_16_, int i_17_) {
		if (bs == bs_15_) {
			if (i == i_16_) {
				return;
			}
			if (i_16_ > i && i_16_ < i + i_17_) {
				i_17_--;
				i += i_17_;
				i_16_ += i_17_;
				i_17_ = i - i_17_;
				i_17_ += 7;
				while (i >= i_17_) {
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
					bs_15_[i_16_--] = bs[i--];
				}
				i_17_ -= 7;
				while (i >= i_17_)
					bs_15_[i_16_--] = bs[i--];
				return;
			}
		}
		i_17_ += i;
		i_17_ -= 7;
		while (i < i_17_) {
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
			bs_15_[i_16_++] = bs[i++];
		}
		i_17_ += 7;
		while (i < i_17_)
			bs_15_[i_16_++] = bs[i++];
	}
	
	static final void method3609(int[] is, int i, int[] is_18_, int i_19_, int i_20_) {
		if (is == is_18_) {
			if (i == i_19_) {
				return;
			}
			if (i_19_ > i && i_19_ < i + i_20_) {
				i_20_--;
				i += i_20_;
				i_19_ += i_20_;
				i_20_ = i - i_20_;
				i_20_ += 7;
				while (i >= i_20_) {
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
					is_18_[i_19_--] = is[i--];
				}
				i_20_ -= 7;
				while (i >= i_20_)
					is_18_[i_19_--] = is[i--];
				return;
			}
		}
		i_20_ += i;
		i_20_ -= 7;
		while (i < i_20_) {
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
			is_18_[i_19_++] = is[i++];
		}
		i_20_ += 7;
		while (i < i_20_)
			is_18_[i_19_++] = is[i++];
	}
}
