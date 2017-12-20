/* StandardDrawableModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class StandardDrawableModel extends DrawableModel
{
	static int anInt5793;
	private short[] aShortArray5794;
	static int anInt5795;
	static int anInt5796;
	private int anInt5797;
	static int anInt5798;
	static int anInt5799;
	static int anInt5800;
	static int anInt5801;
	private short[] aShortArray5802;
	static int anInt5803;
	static int anInt5804;
	private int anInt5805;
	static int anInt5806;
	static int anInt5807;
	private Class333 aClass333_5808;
	static int anInt5809;
	static int anInt5810;
	private int anInt5811;
	static int anInt5812;
	private int anInt5813;
	private short[] aShortArray5814;
	private int anInt5815;
	static int anInt5816;
	private Class218[] aClass218Array5817;
	static int anInt5818;
	private boolean aBoolean5819 = false;
	static int anInt5820;
	private int anInt5821;
	private Class347 aClass347_5822;
	static int anInt5823;
	static int anInt5824;
	private int anInt5825;
	private boolean aBoolean5826;
	static int anInt5827;
	private Class347 aClass347_5828;
	static int anInt5829;
	static int anInt5830;
	static int anInt5831;
	private short[] aShortArray5832;
	static int anInt5833;
	private byte[] aByteArray5834;
	private int[] anIntArray5835;
	static int anInt5836;
	static int anInt5837;
	private int[] anIntArray5838;
	static int anInt5839;
	static int anInt5840;
	private short[] aShortArray5841;
	static int anInt5842;
	private short aShort5843;
	static int anInt5844;
	static int anInt5845;
	private short[] aShortArray5846;
	private int[][] anIntArrayArray5847;
	static int anInt5848;
	static int anInt5849;
	static int anInt5850;
	static int anInt5851;
	private Class347 aClass347_5852;
	static int anInt5853;
	static int anInt5854;
	static int anInt5855;
	private Class268[] aClass268Array5856;
	static int anInt5857;
	static int anInt5858;
	private int anInt5859;
	private float[] aFloatArray5860;
	private short[] aShortArray5861;
	private short[] aShortArray5862;
	static int anInt5863;
	static int anInt5864;
	static int anInt5865;
	private boolean aBoolean5866;
	private Class284 aClass284_5867;
	private short aShort5868;
	static int anInt5869;
	static int anInt5870;
	static int anInt5871;
	private Class14[] aClass14Array5872;
	static int anInt5873;
	static int anInt5874;
	private float[] aFloatArray5875;
	static int anInt5876;
	static int anInt5877;
	static IncommingPacket aClass192_5878 = new IncommingPacket(46, 3);
	private int[] anIntArray5879;
	private boolean aBoolean5880;
	private int anInt5881;
	static int anInt5882;
	private int anInt5883;
	private int[] anIntArray5884;
	private int anInt5885;
	private byte[] aByteArray5886;
	static int anInt5887;
	static int anInt5888;
	private short[] aShortArray5889;
	private short[] aShortArray5890;
	private boolean aBoolean5891;
	private int[][] anIntArrayArray5892;
	static int anInt5893;
	static int anInt5894;
	static int anInt5895;
	private int anInt5896;
	private int[] anIntArray5897;
	private short[] aShortArray5898;
	private short[] aShortArray5899;
	private int[][] anIntArrayArray5900;
	static int anInt5901;
	private int anInt5902;
	private int anInt5903;
	static int anInt5904;
	private Class300[] aClass300Array5905;
	private short[] aShortArray5906;
	static int anInt5907;
	private Class347 aClass347_5908;
	private int anInt5909;
	static int anInt5910;
	private int[] anIntArray5911;
	private int anInt5912;
	private int[] anIntArray5913;
	static int anInt5914;
	static int anInt5915;
	private AbstractToolkit anAbstractToolkit5916;
	static int anInt5917;
	static int anInt5918 = -1;
	static int anInt5919;
	static int anInt5920;
	static int anInt5921;
	
	private final boolean method688(byte b) {
		anInt5807++;
		boolean bool = !aClass347_5852.aBoolean4287;
		if (b <= 48) {
			return false;
		}
		boolean bool_0_ = (0x37 & anInt5896) != 0 && !aClass347_5908.aBoolean4287;
		boolean bool_1_ = !aClass347_5828.aBoolean4287;
		boolean bool_2_ = !aClass347_5822.aBoolean4287;
		if (!bool_1_ && !bool && !bool_0_ && !bool_2_) {
			return true;
		}
		boolean bool_3_ = true;
		if (bool_1_) {
			if (aShortArray5890 == null) {
				return true;
			}
			if (aClass347_5828.anInterface15_Impl2_4284 == null) {
				aClass347_5828.anInterface15_Impl2_4284 = anAbstractToolkit5916.method1380(2, aBoolean5880);
			}
			Interface15_Impl2 interface15_impl2 = aClass347_5828.anInterface15_Impl2_4284;
			interface15_impl2.method37(12, anInt5885 * 12, -12093);
			jaclib.memory.Buffer buffer = interface15_impl2.method40(8, true);
			if (buffer == null) {
				bool_3_ = false;
			} else {
				anAbstractToolkit5916.aNativeInterface6193.copyPositions(anIntArray5879, anIntArray5897, anIntArray5913, aShortArray5890, 0, 12, anInt5885, buffer.getAddress());
				if (!interface15_impl2.method39(-124)) {
					bool_3_ = false;
				} else {
					aClass347_5828.anInterface15_Impl2_4288 = interface15_impl2;
					aClass347_5828.aBoolean4287 = true;
				}
			}
		}
		if (bool) {
			if (aClass347_5852.anInterface15_Impl2_4284 == null) {
				aClass347_5852.anInterface15_Impl2_4284 = anAbstractToolkit5916.method1380(2, aBoolean5880);
			}
			Interface15_Impl2 interface15_impl2 = aClass347_5852.anInterface15_Impl2_4284;
			interface15_impl2.method37(4, 4 * anInt5885, -12093);
			jaclib.memory.Buffer buffer = interface15_impl2.method40(-91, true);
			if (buffer != null) {
				if ((0x37 & anInt5896 ^ 0xffffffff) != -1) {
					anAbstractToolkit5916.aNativeInterface6193.copyColours(aShortArray5802, aByteArray5886, aShortArray5862, aShort5868, aShortArray5832, 0, 4, anInt5885, buffer.getAddress());
				} else {
					byte[] bs;
					short[] ses;
					short[] ses_4_;
					short[] ses_5_;
					if (aClass284_5867 == null) {
						bs = aByteArray5834;
						ses = aShortArray5794;
						ses_5_ = aShortArray5889;
						ses_4_ = aShortArray5898;
					} else {
						bs = aClass284_5867.aByteArray3598;
						ses = aClass284_5867.aShortArray3593;
						ses_4_ = aClass284_5867.aShortArray3592;
						ses_5_ = aClass284_5867.aShortArray3595;
					}
					anAbstractToolkit5916.aNativeInterface6193.copyLighting(aShortArray5802, aByteArray5886, aShortArray5862, ses_5_, ses_4_, ses, bs, aShort5868, aShort5843, aShortArray5832, 0, 4, anInt5885, buffer.getAddress());
				}
				if (interface15_impl2.method39(119)) {
					aClass347_5852.anInterface15_Impl2_4288 = interface15_impl2;
					aClass347_5852.aBoolean4287 = true;
				} else {
					bool_3_ = false;
				}
			} else {
				bool_3_ = false;
			}
		}
		if (bool_0_) {
			if (aClass347_5908.anInterface15_Impl2_4284 == null) {
				aClass347_5908.anInterface15_Impl2_4284 = anAbstractToolkit5916.method1380(2, aBoolean5880);
			}
			Interface15_Impl2 interface15_impl2 = aClass347_5908.anInterface15_Impl2_4284;
			interface15_impl2.method37(12, 12 * anInt5885, -12093);
			jaclib.memory.Buffer buffer = interface15_impl2.method40(118, true);
			if (buffer == null) {
				bool_3_ = false;
			} else {
				short[] ses;
				byte[] bs;
				short[] ses_6_;
				short[] ses_7_;
				if (aClass284_5867 != null) {
					ses = aClass284_5867.aShortArray3593;
					ses_6_ = aClass284_5867.aShortArray3595;
					bs = aClass284_5867.aByteArray3598;
					ses_7_ = aClass284_5867.aShortArray3592;
				} else {
					ses = aShortArray5794;
					bs = aByteArray5834;
					ses_6_ = aShortArray5889;
					ses_7_ = aShortArray5898;
				}
				anAbstractToolkit5916.aNativeInterface6193.copyNormals(ses_6_, ses_7_, ses, bs, 3.0F / (float) aShort5843, 3.0F / (float) (aShort5843 + aShort5843 / 2), 0, 12, anInt5885, buffer.getAddress());
				if (interface15_impl2.method39(121)) {
					aClass347_5908.anInterface15_Impl2_4288 = interface15_impl2;
					aClass347_5908.aBoolean4287 = true;
				} else {
					bool_3_ = false;
				}
			}
		}
		if (bool_2_) {
			if (aClass347_5822.anInterface15_Impl2_4284 == null) {
				aClass347_5822.anInterface15_Impl2_4284 = anAbstractToolkit5916.method1380(2, aBoolean5880);
			}
			Interface15_Impl2 interface15_impl2 = aClass347_5822.anInterface15_Impl2_4284;
			interface15_impl2.method37(8, 8 * anInt5885, -12093);
			jaclib.memory.Buffer buffer = interface15_impl2.method40(-106, true);
			if (buffer != null) {
				anAbstractToolkit5916.aNativeInterface6193.copyTexCoords(aFloatArray5875, aFloatArray5860, 0, 8, anInt5885, buffer.getAddress());
				if (!interface15_impl2.method39(119)) {
					bool_3_ = false;
				} else {
					aClass347_5822.anInterface15_Impl2_4288 = interface15_impl2;
					aClass347_5822.aBoolean4287 = true;
				}
			} else {
				bool_3_ = false;
			}
		}
		return bool_3_;
	}
	
	StandardDrawableModel(AbstractToolkit abstracttoolkit, Model model, int i, int i_8_, int i_9_, int i_10_) {
		this(abstracttoolkit, i, i_10_, true, false);
		d var_d = abstracttoolkit.aD1543;
		int[] is = new int[model.anInt2572];
		anIntArray5911 = new int[model.anInt2573 + 1];
		for (int i_11_ = 0; i_11_ < model.anInt2572; i_11_++) {
			if (model.aByteArray2594 == null || (model.aByteArray2594[i_11_] ^ 0xffffffff) != -3) {
				if (model.aShortArray2587 != null && (model.aShortArray2587[i_11_] ^ 0xffffffff) != 0) {
					Class91 class91 = var_d.method10(model.aShortArray2587[i_11_] & 0xffff, -8217);
					if (((0x40 & anInt5896 ^ 0xffffffff) == -1 || !class91.aBoolean1223) && class91.aBoolean1205) {
						continue;
					}
				}
				is[anInt5813++] = i_11_;
				anIntArray5911[model.aShortArray2600[i_11_]]++;
				anIntArray5911[model.aShortArray2583[i_11_]]++;
				anIntArray5911[model.aShortArray2589[i_11_]]++;
			}
		}
		anInt5859 = anInt5813;
		long[] ls = new long[anInt5813];
		boolean bool = (0x100 & anInt5881) != 0;
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (anInt5813 ^ 0xffffffff); i_12_++) {
			int i_13_ = is[i_12_];
			Class91 class91 = null;
			int i_14_ = 0;
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			if (model.aClass17Array2621 != null) {
				boolean bool_18_ = false;
				for (int i_19_ = 0; model.aClass17Array2621.length > i_19_; i_19_++) {
					Class17 class17 = model.aClass17Array2621[i_19_];
					if ((class17.anInt273 ^ 0xffffffff) == (i_13_ ^ 0xffffffff)) {
						Class352 class352 = Class215.method2067(0, class17.anInt279);
						if (class352.aBoolean4325) {
							bool_18_ = true;
						}
						if ((class352.anInt4330 ^ 0xffffffff) != 0) {
							Class91 class91_20_ = var_d.method10(class352.anInt4330, -8217);
							if ((class91_20_.anInt1226 ^ 0xffffffff) == -3) {
								aBoolean5819 = true;
							}
						}
					}
				}
				if (bool_18_) {
					ls[i_12_] = 9223372036854775807L;
					anInt5859--;
					continue;
				}
			}
			int i_21_ = -1;
			if (model.aShortArray2587 != null) {
				i_21_ = model.aShortArray2587[i_13_];
				if ((i_21_ ^ 0xffffffff) != 0) {
					class91 = var_d.method10(i_21_ & 0xffff, -8217);
					if ((0x40 & anInt5896) != 0 && class91.aBoolean1223) {
						i_21_ = -1;
						class91 = null;
					} else {
						i_17_ = class91.aByte1213;
						i_16_ = class91.aByte1214;
					}
				}
			}
			boolean bool_22_ = model.aByteArray2622 != null && (model.aByteArray2622[i_13_] ^ 0xffffffff) != -1 || class91 != null && (class91.anInt1226 ^ 0xffffffff) != -1;
			if ((bool || bool_22_) && model.aByteArray2607 != null) {
				i_14_ += model.aByteArray2607[i_13_] << 17;
			}
			if (bool_22_) {
				i_14_ += 65536;
			}
			i_14_ += 0xff00 & i_16_ << 8;
			i_14_ += 0xff & i_17_;
			i_15_ += i_21_ << 16 & ~0xffff;
			i_15_ += 0xffff & i_12_;
			ls[i_12_] = ((long) i_14_ << 32) + (long) i_15_;
			aBoolean5819 |= bool_22_;
			StandardDrawableModel standarddrawablemodel_23_ = this;
			standarddrawablemodel_23_.aBoolean5866 = standarddrawablemodel_23_.aBoolean5866 | (class91 != null && ((class91.aByte1211 ^ 0xffffffff) != -1 || class91.aByte1203 != 0));
		}
		Node_Sub3.method2170(-52, ls, is);
		anIntArray5879 = model.anIntArray2616;
		anInt5902 = model.anInt2599;
		anIntArray5913 = model.anIntArray2574;
		anInt5912 = model.anInt2573;
		anIntArray5897 = model.anIntArray2576;
		aShortArray5814 = model.aShortArray2582;
		aClass218Array5817 = model.aClass218Array2620;
		Class344[] class344s = new Class344[anInt5912];
		aClass300Array5905 = model.aClass300Array2590;
		if (model.aClass17Array2621 != null) {
			anInt5811 = model.aClass17Array2621.length;
			aClass14Array5872 = new Class14[anInt5811];
			aClass268Array5856 = new Class268[anInt5811];
			for (int i_24_ = 0; anInt5811 > i_24_; i_24_++) {
				Class17 class17 = model.aClass17Array2621[i_24_];
				Class352 class352 = Class215.method2067(0, class17.anInt279);
				int i_25_ = -1;
				for (int i_26_ = 0; (anInt5813 ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
					if ((class17.anInt273 ^ 0xffffffff) == (is[i_26_] ^ 0xffffffff)) {
						i_25_ = i_26_;
						break;
					}
				}
				if ((i_25_ ^ 0xffffffff) == 0) {
					throw new RuntimeException();
				}
				int i_27_ = 0xffffff & Class85.anIntArray1158[model.aShortArray2580[class17.anInt273] & 0xffff];
				i_27_ = i_27_ | -(model.aByteArray2622 == null ? 0 : model.aByteArray2622[class17.anInt273]) + 255 << 24;
				aClass268Array5856[i_24_] = new Class268(i_25_, model.aShortArray2600[class17.anInt273], model.aShortArray2583[class17.anInt273], model.aShortArray2589[class17.anInt273], class352.anInt4334, class352.anInt4326, class352.anInt4330, class352.anInt4336, class352.anInt4324, class352.aBoolean4325, class352.aBoolean4335, class17.anInt278);
				aClass14Array5872[i_24_] = new Class14(i_27_);
			}
		}
		int i_28_ = 3 * anInt5813;
		aShortArray5889 = new short[i_28_];
		aShortArray5862 = new short[anInt5813];
		aShortArray5802 = new short[anInt5813];
		aShortArray5898 = new short[i_28_];
		aShortArray5832 = new short[i_28_];
		aShort5843 = (short) i_9_;
		aShortArray5899 = new short[i_28_];
		Class206.aLongArray2464 = new long[i_28_];
		aShortArray5890 = new short[i_28_];
		aShortArray5841 = new short[anInt5813];
		aByteArray5886 = new byte[anInt5813];
		aFloatArray5860 = new float[i_28_];
		aShortArray5906 = new short[anInt5813];
		aShortArray5794 = new short[i_28_];
		aShort5868 = (short) i_8_;
		aShortArray5846 = new short[anInt5813];
		aFloatArray5875 = new float[i_28_];
		aByteArray5834 = new byte[i_28_];
		if (model.aShortArray2575 != null) {
			aShortArray5861 = new short[anInt5813];
		}
		int i_29_ = 0;
		for (int i_30_ = 0; (model.anInt2573 ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
			int i_31_ = anIntArray5911[i_30_];
			anIntArray5911[i_30_] = i_29_;
			class344s[i_30_] = new Class344();
			i_29_ += i_31_;
		}
		anIntArray5911[model.anInt2573] = i_29_;
		Class345 class345 = Class34.method367(127, model, anInt5813, is);
		Class221[] class221s = new Class221[model.anInt2572];
		for (int i_32_ = 0; model.anInt2572 > i_32_; i_32_++) {
			short s = model.aShortArray2600[i_32_];
			short s_33_ = model.aShortArray2583[i_32_];
			short s_34_ = model.aShortArray2589[i_32_];
			int i_35_ = anIntArray5879[s_33_] + -anIntArray5879[s];
			int i_36_ = anIntArray5897[s_33_] + -anIntArray5897[s];
			int i_37_ = -anIntArray5913[s] + anIntArray5913[s_33_];
			int i_38_ = -anIntArray5879[s] + anIntArray5879[s_34_];
			int i_39_ = -anIntArray5897[s] + anIntArray5897[s_34_];
			int i_40_ = anIntArray5913[s_34_] - anIntArray5913[s];
			int i_41_ = -(i_39_ * i_37_) + i_40_ * i_36_;
			int i_42_ = -(i_40_ * i_35_) + i_38_ * i_37_;
			int i_43_;
			for (i_43_ = i_39_ * i_35_ - i_38_ * i_36_; (i_41_ ^ 0xffffffff) < -8193 || i_42_ > 8192 || (i_43_ ^ 0xffffffff) < -8193 || i_41_ < -8192 || (i_42_ ^ 0xffffffff) > 8191 || i_43_ < -8192; i_42_ >>= 1) {
				i_41_ >>= 1;
				i_43_ >>= 1;
			}
			int i_44_ = (int) Math.sqrt((double) (i_42_ * i_42_ + i_41_ * i_41_ - -(i_43_ * i_43_)));
			if (i_44_ <= 0) {
				i_44_ = 1;
			}
			i_43_ = i_43_ * 256 / i_44_;
			i_41_ = i_41_ * 256 / i_44_;
			i_42_ = i_42_ * 256 / i_44_;
			byte b = model.aByteArray2594 != null ? model.aByteArray2594[i_32_] : (byte) 0;
			if ((b ^ 0xffffffff) == -1) {
				Class344 class344 = class344s[s];
				class344.anInt4264++;
				class344.anInt4262 += i_42_;
				class344.anInt4260 += i_41_;
				class344.anInt4263 += i_43_;
				class344 = class344s[s_33_];
				class344.anInt4262 += i_42_;
				class344.anInt4263 += i_43_;
				class344.anInt4264++;
				class344.anInt4260 += i_41_;
				class344 = class344s[s_34_];
				class344.anInt4263 += i_43_;
				class344.anInt4262 += i_42_;
				class344.anInt4264++;
				class344.anInt4260 += i_41_;
			} else if (b == 1) {
				Class221 class221 = class221s[i_32_] = new Class221();
				class221.anInt2631 = i_41_;
				class221.anInt2629 = i_42_;
				class221.anInt2632 = i_43_;
			}
		}
		for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (anInt5813 ^ 0xffffffff); i_45_++) {
			int i_46_ = is[i_45_];
			int i_47_ = 0xffff & model.aShortArray2580[i_46_];
			int i_48_;
			if (model.aByteArray2610 == null) {
				i_48_ = -1;
			} else {
				i_48_ = model.aByteArray2610[i_46_];
			}
			int i_49_;
			if (model.aByteArray2622 != null) {
				i_49_ = 0xff & model.aByteArray2622[i_46_];
			} else {
				i_49_ = 0;
			}
			short s = model.aShortArray2587 == null ? (short) -1 : model.aShortArray2587[i_46_];
			if (s != -1 && (0x40 & anInt5896) != 0) {
				Class91 class91 = var_d.method10(s & 0xffff, -8217);
				if (class91.aBoolean1223) {
					s = (short) -1;
				}
			}
			float f = 0.0F;
			float f_50_ = 0.0F;
			float f_51_ = 0.0F;
			float f_52_ = 0.0F;
			float f_53_ = 0.0F;
			float f_54_ = 0.0F;
			int i_55_ = 0;
			int i_56_ = 0;
			int i_57_ = 0;
			if (s != -1) {
				if (i_48_ != -1) {
					i_48_ &= 0xff;
					byte b = model.aByteArray2586[i_48_];
					if ((b ^ 0xffffffff) == -1) {
						short s_58_ = model.aShortArray2600[i_46_];
						short s_59_ = model.aShortArray2583[i_46_];
						short s_60_ = model.aShortArray2589[i_46_];
						short s_61_ = model.aShortArray2613[i_48_];
						short s_62_ = model.aShortArray2577[i_48_];
						short s_63_ = model.aShortArray2604[i_48_];
						float f_64_ = (float) model.anIntArray2616[s_61_];
						float f_65_ = (float) model.anIntArray2576[s_61_];
						float f_66_ = (float) model.anIntArray2574[s_61_];
						float f_67_ = -f_64_ + (float) model.anIntArray2616[s_62_];
						float f_68_ = -f_65_ + (float) model.anIntArray2576[s_62_];
						float f_69_ = (float) model.anIntArray2574[s_62_] - f_66_;
						float f_70_ = (float) model.anIntArray2616[s_63_] - f_64_;
						float f_71_ = -f_65_ + (float) model.anIntArray2576[s_63_];
						float f_72_ = -f_66_ + (float) model.anIntArray2574[s_63_];
						float f_73_ = (float) model.anIntArray2616[s_58_] - f_64_;
						float f_74_ = -f_65_ + (float) model.anIntArray2576[s_58_];
						float f_75_ = -f_66_ + (float) model.anIntArray2574[s_58_];
						float f_76_ = -f_64_ + (float) model.anIntArray2616[s_59_];
						float f_77_ = (float) model.anIntArray2576[s_59_] - f_65_;
						float f_78_ = -f_66_ + (float) model.anIntArray2574[s_59_];
						float f_79_ = (float) model.anIntArray2616[s_60_] - f_64_;
						float f_80_ = -f_65_ + (float) model.anIntArray2576[s_60_];
						float f_81_ = (float) model.anIntArray2574[s_60_] - f_66_;
						float f_82_ = -(f_71_ * f_69_) + f_72_ * f_68_;
						float f_83_ = f_70_ * f_69_ - f_72_ * f_67_;
						float f_84_ = -(f_70_ * f_68_) + f_67_ * f_71_;
						float f_85_ = f_71_ * f_84_ - f_72_ * f_83_;
						float f_86_ = f_82_ * f_72_ - f_70_ * f_84_;
						float f_87_ = f_70_ * f_83_ - f_82_ * f_71_;
						float f_88_ = 1.0F / (f_87_ * f_69_ + (f_67_ * f_85_ + f_68_ * f_86_));
						f_53_ = f_88_ * (f_79_ * f_85_ + f_80_ * f_86_ + f_87_ * f_81_);
						f = f_88_ * (f_86_ * f_74_ + f_73_ * f_85_ + f_75_ * f_87_);
						f_51_ = (f_86_ * f_77_ + f_76_ * f_85_ + f_87_ * f_78_) * f_88_;
						f_87_ = f_67_ * f_83_ - f_68_ * f_82_;
						f_86_ = f_82_ * f_69_ - f_84_ * f_67_;
						f_85_ = f_84_ * f_68_ - f_83_ * f_69_;
						f_88_ = 1.0F / (f_87_ * f_72_ + (f_71_ * f_86_ + f_70_ * f_85_));
						f_54_ = (f_81_ * f_87_ + (f_79_ * f_85_ + f_80_ * f_86_)) * f_88_;
						f_52_ = (f_87_ * f_78_ + (f_85_ * f_76_ + f_77_ * f_86_)) * f_88_;
						f_50_ = f_88_ * (f_86_ * f_74_ + f_85_ * f_73_ + f_75_ * f_87_);
					} else {
						short s_89_ = model.aShortArray2600[i_46_];
						short s_90_ = model.aShortArray2583[i_46_];
						short s_91_ = model.aShortArray2589[i_46_];
						int i_92_ = class345.anIntArray4268[i_48_];
						int i_93_ = class345.anIntArray4272[i_48_];
						int i_94_ = class345.anIntArray4266[i_48_];
						float[] fs = class345.aFloatArrayArray4265[i_48_];
						byte b_95_ = model.aByteArray2585[i_48_];
						float f_96_ = (float) model.anIntArray2617[i_48_] / 256.0F;
						if ((b ^ 0xffffffff) == -2) {
							float f_97_ = (float) model.anIntArray2593[i_48_] / 1024.0F;
							Class262_Sub1.method3151(fs, f_96_, i_94_, model.anIntArray2616[s_89_], b_95_, Class20_Sub1.aFloatArray5507, f_97_, i_93_, -2356, model.anIntArray2576[s_89_], model.anIntArray2574[s_89_], i_92_);
							f = Class20_Sub1.aFloatArray5507[0];
							f_50_ = Class20_Sub1.aFloatArray5507[1];
							Class262_Sub1.method3151(fs, f_96_, i_94_, model.anIntArray2616[s_90_], b_95_, Class20_Sub1.aFloatArray5507, f_97_, i_93_, -2356, model.anIntArray2576[s_90_], model.anIntArray2574[s_90_], i_92_);
							f_51_ = Class20_Sub1.aFloatArray5507[0];
							f_52_ = Class20_Sub1.aFloatArray5507[1];
							Class262_Sub1.method3151(fs, f_96_, i_94_, model.anIntArray2616[s_91_], b_95_, Class20_Sub1.aFloatArray5507, f_97_, i_93_, -2356, model.anIntArray2576[s_91_], model.anIntArray2574[s_91_], i_92_);
							f_53_ = Class20_Sub1.aFloatArray5507[0];
							f_54_ = Class20_Sub1.aFloatArray5507[1];
							float f_98_ = f_97_ / 2.0F;
							if ((b_95_ & 0x1) != 0) {
								if (-f_50_ + f_54_ > f_98_) {
									i_56_ = 1;
									f_54_ -= f_97_;
								} else if (f_98_ < f_50_ - f_54_) {
									i_56_ = 2;
									f_54_ += f_97_;
								}
								if (!(f_98_ < f_52_ - f_50_)) {
									if (f_98_ < f_50_ - f_52_) {
										f_52_ += f_97_;
										i_55_ = 2;
									}
								} else {
									i_55_ = 1;
									f_52_ -= f_97_;
								}
							} else {
								if (f_98_ < -f + f_51_) {
									i_55_ = 1;
									f_51_ -= f_97_;
								} else if (-f_51_ + f > f_98_) {
									i_55_ = 2;
									f_51_ += f_97_;
								}
								if (-f + f_53_ > f_98_) {
									i_56_ = 1;
									f_53_ -= f_97_;
								} else if (f_98_ < -f_53_ + f) {
									f_53_ += f_97_;
									i_56_ = 2;
								}
							}
						} else if ((b ^ 0xffffffff) == -3) {
							float f_99_ = (float) model.anIntArray2615[i_48_] / 256.0F;
							float f_100_ = (float) model.anIntArray2584[i_48_] / 256.0F;
							int i_101_ = -model.anIntArray2616[s_89_] + model.anIntArray2616[s_90_];
							int i_102_ = -model.anIntArray2576[s_89_] + model.anIntArray2576[s_90_];
							int i_103_ = model.anIntArray2574[s_90_] + -model.anIntArray2574[s_89_];
							int i_104_ = model.anIntArray2616[s_91_] + -model.anIntArray2616[s_89_];
							int i_105_ = model.anIntArray2576[s_91_] - model.anIntArray2576[s_89_];
							int i_106_ = model.anIntArray2574[s_91_] - model.anIntArray2574[s_89_];
							int i_107_ = -(i_105_ * i_103_) + i_106_ * i_102_;
							int i_108_ = i_103_ * i_104_ - i_101_ * i_106_;
							int i_109_ = i_101_ * i_105_ - i_102_ * i_104_;
							float f_110_ = 64.0F / (float) model.anIntArray2603[i_48_];
							float f_111_ = 64.0F / (float) model.anIntArray2588[i_48_];
							float f_112_ = 64.0F / (float) model.anIntArray2593[i_48_];
							float f_113_ = (fs[1] * (float) i_108_ + fs[0] * (float) i_107_ + (float) i_109_ * fs[2]) / f_110_;
							float f_114_ = ((float) i_108_ * fs[4] + fs[3] * (float) i_107_ + fs[5] * (float) i_109_) / f_111_;
							float f_115_ = ((float) i_109_ * fs[8] + ((float) i_107_ * fs[6] + (float) i_108_ * fs[7])) / f_112_;
							i_57_ = Class91.method1036(2, f_115_, f_113_, f_114_);
							Class39.method407(f_96_, i_57_, model.anIntArray2616[s_89_], f_99_, i_93_, Class20_Sub1.aFloatArray5507, model.anIntArray2576[s_89_], 101, model.anIntArray2574[s_89_], i_92_, i_94_, f_100_, fs, b_95_);
							f = Class20_Sub1.aFloatArray5507[0];
							f_50_ = Class20_Sub1.aFloatArray5507[1];
							Class39.method407(f_96_, i_57_, model.anIntArray2616[s_90_], f_99_, i_93_, Class20_Sub1.aFloatArray5507, model.anIntArray2576[s_90_], 77, model.anIntArray2574[s_90_], i_92_, i_94_, f_100_, fs, b_95_);
							f_51_ = Class20_Sub1.aFloatArray5507[0];
							f_52_ = Class20_Sub1.aFloatArray5507[1];
							Class39.method407(f_96_, i_57_, model.anIntArray2616[s_91_], f_99_, i_93_, Class20_Sub1.aFloatArray5507, model.anIntArray2576[s_91_], 105, model.anIntArray2574[s_91_], i_92_, i_94_, f_100_, fs, b_95_);
							f_53_ = Class20_Sub1.aFloatArray5507[0];
							f_54_ = Class20_Sub1.aFloatArray5507[1];
						} else if ((b ^ 0xffffffff) == -4) {
							Class212.method2053(i_92_, model.anIntArray2574[s_89_], model.anIntArray2576[s_89_], Class20_Sub1.aFloatArray5507, i_94_, f_96_, fs, b_95_, model.anIntArray2616[s_89_], -4, i_93_);
							f = Class20_Sub1.aFloatArray5507[0];
							f_50_ = Class20_Sub1.aFloatArray5507[1];
							Class212.method2053(i_92_, model.anIntArray2574[s_90_], model.anIntArray2576[s_90_], Class20_Sub1.aFloatArray5507, i_94_, f_96_, fs, b_95_, model.anIntArray2616[s_90_], -4, i_93_);
							f_51_ = Class20_Sub1.aFloatArray5507[0];
							f_52_ = Class20_Sub1.aFloatArray5507[1];
							Class212.method2053(i_92_, model.anIntArray2574[s_91_], model.anIntArray2576[s_91_], Class20_Sub1.aFloatArray5507, i_94_, f_96_, fs, b_95_, model.anIntArray2616[s_91_], -4, i_93_);
							f_54_ = Class20_Sub1.aFloatArray5507[1];
							f_53_ = Class20_Sub1.aFloatArray5507[0];
							if ((b_95_ & 0x1) != 0) {
								if (!(-f_50_ + f_54_ > 0.5F)) {
									if (f_50_ - f_54_ > 0.5F) {
										f_54_++;
										i_56_ = 2;
									}
								} else {
									i_56_ = 1;
									f_54_--;
								}
								if (f_52_ - f_50_ > 0.5F) {
									i_55_ = 1;
									f_52_--;
								} else if (f_50_ - f_52_ > 0.5F) {
									i_55_ = 2;
									f_52_++;
								}
							} else {
								if (f_53_ - f > 0.5F) {
									i_56_ = 1;
									f_53_--;
								} else if (-f_53_ + f > 0.5F) {
									i_56_ = 2;
									f_53_++;
								}
								if (-f + f_51_ > 0.5F) {
									i_55_ = 1;
									f_51_--;
								} else if (-f_51_ + f > 0.5F) {
									i_55_ = 2;
									f_51_++;
								}
							}
						}
					}
				} else {
					f_51_ = 1.0F;
					f_54_ = 0.0F;
					i_56_ = 2;
					f_53_ = 0.0F;
					f_52_ = 1.0F;
					f_50_ = 1.0F;
					f = 0.0F;
					i_55_ = 1;
				}
			}
			byte b;
			if (model.aByteArray2594 == null) {
				b = (byte) 0;
			} else {
				b = model.aByteArray2594[i_46_];
			}
			if (b == 0) {
				long l = ((long) i_49_ + ((long) (i_57_ << 24) + (long) (i_47_ << 8)) << 32) + (long) (i_48_ << 2);
				short s_116_ = model.aShortArray2600[i_46_];
				short s_117_ = model.aShortArray2583[i_46_];
				short s_118_ = model.aShortArray2589[i_46_];
				Class344 class344 = class344s[s_116_];
				aShortArray5841[i_45_] = method695(class344.anInt4263, class344.anInt4264, f, s_116_, class344.anInt4260, i_45_, 2971, f_50_, l, class344.anInt4262, model);
				class344 = class344s[s_117_];
				aShortArray5846[i_45_] = method695(class344.anInt4263, class344.anInt4264, f_51_, s_117_, class344.anInt4260, i_45_, 2971, f_52_, (long) i_55_ + l, class344.anInt4262, model);
				class344 = class344s[s_118_];
				aShortArray5906[i_45_] = method695(class344.anInt4263, class344.anInt4264, f_53_, s_118_, class344.anInt4260, i_45_, 2971, f_54_, (long) i_56_ + l, class344.anInt4262, model);
			} else if ((b ^ 0xffffffff) == -2) {
				Class221 class221 = class221s[i_46_];
				long l = ((long) i_49_ + ((long) (i_57_ << 24) - -(long) (i_47_ << 8)) << 32) + (long) ((class221.anInt2629 + 256 << 12) + (((class221.anInt2631 ^ 0xffffffff) >= -1 ? 2048 : 1024) + (i_48_ << 2) - -(256 + class221.anInt2632 << 22)));
				aShortArray5841[i_45_] = method695(class221.anInt2632, 0, f, model.aShortArray2600[i_46_], class221.anInt2631, i_45_, 2971, f_50_, l, class221.anInt2629, model);
				aShortArray5846[i_45_] = method695(class221.anInt2632, 0, f_51_, model.aShortArray2583[i_46_], class221.anInt2631, i_45_, 2971, f_52_, l + (long) i_55_, class221.anInt2629, model);
				aShortArray5906[i_45_] = method695(class221.anInt2632, 0, f_53_, model.aShortArray2589[i_46_], class221.anInt2631, i_45_, 2971, f_54_, l + (long) i_56_, class221.anInt2629, model);
			}
			if (model.aByteArray2622 != null) {
				aByteArray5886[i_45_] = model.aByteArray2622[i_46_];
			}
			if (model.aShortArray2575 != null) {
				aShortArray5861[i_45_] = model.aShortArray2575[i_46_];
			}
			aShortArray5802[i_45_] = model.aShortArray2580[i_46_];
			aShortArray5862[i_45_] = s;
		}
		if ((anInt5859 ^ 0xffffffff) < -1) {
			int i_119_ = 1;
			short s = aShortArray5862[0];
			for (int i_120_ = 0; i_120_ < anInt5859; i_120_++) {
				short s_121_ = aShortArray5862[i_120_];
				if ((s ^ 0xffffffff) != (s_121_ ^ 0xffffffff)) {
					i_119_++;
					s = s_121_;
				}
			}
			anIntArray5835 = new int[1 + i_119_];
			anIntArray5884 = new int[i_119_];
			anIntArray5838 = new int[i_119_];
			anIntArray5835[0] = 0;
			int i_122_ = anInt5885;
			i_119_ = 0;
			int i_123_ = 0;
			s = aShortArray5862[0];
			for (int i_124_ = 0; (anInt5859 ^ 0xffffffff) < (i_124_ ^ 0xffffffff); i_124_++) {
				short s_125_ = aShortArray5862[i_124_];
				if (s_125_ != s) {
					anIntArray5884[i_119_] = i_122_;
					anIntArray5838[i_119_] = i_123_ - i_122_ - -1;
					anIntArray5835[++i_119_] = i_124_;
					i_122_ = anInt5885;
					i_123_ = 0;
					s = s_125_;
				}
				int i_126_ = aShortArray5841[i_124_];
				if ((i_123_ ^ 0xffffffff) > (i_126_ ^ 0xffffffff)) {
					i_123_ = i_126_;
				}
				if ((i_126_ ^ 0xffffffff) > (i_122_ ^ 0xffffffff)) {
					i_122_ = i_126_;
				}
				i_126_ = aShortArray5846[i_124_];
				if ((i_123_ ^ 0xffffffff) > (i_126_ ^ 0xffffffff)) {
					i_123_ = i_126_;
				}
				if ((i_126_ ^ 0xffffffff) > (i_122_ ^ 0xffffffff)) {
					i_122_ = i_126_;
				}
				i_126_ = aShortArray5906[i_124_];
				if (i_126_ < i_122_) {
					i_122_ = i_126_;
				}
				if (i_126_ > i_123_) {
					i_123_ = i_126_;
				}
			}
			anIntArray5884[i_119_] = i_122_;
			anIntArray5838[i_119_] = 1 + i_123_ + -i_122_;
			anIntArray5835[++i_119_] = anInt5859;
		}
		Class206.aLongArray2464 = null;
		aShortArray5890 = Class1.method164(aShortArray5890, (byte) -17, anInt5885);
		aShortArray5832 = Class1.method164(aShortArray5832, (byte) -68, anInt5885);
		aShortArray5889 = Class1.method164(aShortArray5889, (byte) -110, anInt5885);
		aShortArray5898 = Class1.method164(aShortArray5898, (byte) -108, anInt5885);
		aShortArray5794 = Class1.method164(aShortArray5794, (byte) -81, anInt5885);
		aByteArray5834 = Node_Sub31.method2725(anInt5885, (byte) 106, aByteArray5834);
		aFloatArray5875 = Class290_Sub11.method3445(anInt5885, aFloatArray5875, false);
		aFloatArray5860 = Class290_Sub11.method3445(anInt5885, aFloatArray5860, false);
		if (model.anIntArray2598 != null && aa.method159(anInt5896, (byte) 105, i)) {
			anIntArrayArray5847 = model.method2083(0, false);
		}
		if (model.aClass17Array2621 != null && ClientScript.method2322(79, i, anInt5896)) {
			anIntArrayArray5892 = model.method2088((byte) -80);
		}
		if (model.anIntArray2602 != null && EntityNode_Sub3.method940(-1, anInt5896, i)) {
			int i_127_ = 0;
			int[] is_128_ = new int[256];
			for (int i_129_ = 0; (anInt5813 ^ 0xffffffff) < (i_129_ ^ 0xffffffff); i_129_++) {
				int i_130_ = model.anIntArray2602[is[i_129_]];
				if (i_130_ >= 0) {
					is_128_[i_130_]++;
					if ((i_127_ ^ 0xffffffff) > (i_130_ ^ 0xffffffff)) {
						i_127_ = i_130_;
					}
				}
			}
			anIntArrayArray5900 = new int[1 + i_127_][];
			for (int i_131_ = 0; i_131_ <= i_127_; i_131_++) {
				anIntArrayArray5900[i_131_] = new int[is_128_[i_131_]];
				is_128_[i_131_] = 0;
			}
			for (int i_132_ = 0; (anInt5813 ^ 0xffffffff) < (i_132_ ^ 0xffffffff); i_132_++) {
				int i_133_ = model.anIntArray2602[is[i_132_]];
				if ((i_133_ ^ 0xffffffff) <= -1) {
					anIntArrayArray5900[i_133_][is_128_[i_133_]++] = i_132_;
				}
			}
		}
	}
	
	private final void method689(int i) {
		if (aClass347_5828 != null) {
			aClass347_5828.aBoolean4287 = false;
		}
		if (i != 4259) {
			ba(null);
		}
		anInt5895++;
	}
	
	final int da() {
		anInt5863++;
		return aShort5843;
	}
	
	final void p(int i, int i_134_, Plane plane, Plane plane_135_, int i_136_, int i_137_, int i_138_) {
		if (!aBoolean5891) {
			method701((byte) 91);
		}
		anInt5882++;
		int i_139_ = i_136_ - -anInt5825;
		int i_140_ = i_136_ - -anInt5815;
		int i_141_ = i_138_ + anInt5883;
		int i_142_ = anInt5909 + i_138_;
		if (i != 1 && i != 2 && i != 3 && (i ^ 0xffffffff) != -6 || (i_139_ ^ 0xffffffff) <= -1 && (plane.anInt3408 ^ 0xffffffff) < (plane.anInt3398 + i_140_ >> plane.anInt3410 ^ 0xffffffff) && (i_141_ ^ 0xffffffff) <= -1 && i_142_ + plane.anInt3398 >> plane.anInt3410 < plane.anInt3404) {
			if (i != 4 && i != 5) {
				i_139_ >>= plane.anInt3410;
				i_140_ = -1 + (plane.anInt3398 + i_140_) >> plane.anInt3410;
				i_141_ >>= plane.anInt3410;
				i_142_ = -1 - (-plane.anInt3398 - i_142_) >> plane.anInt3410;
				if (plane.method3251(i_141_, i_139_, (byte) -118) == i_137_ && plane.method3251(i_141_, i_140_, (byte) -118) == i_137_ && (i_137_ ^ 0xffffffff) == (plane.method3251(i_142_, i_139_, (byte) -118) ^ 0xffffffff) && plane.method3251(i_142_, i_140_, (byte) -118) == i_137_) {
					return;
				}
			} else if (plane_135_ == null || ((i_139_ ^ 0xffffffff) > -1 || (plane_135_.anInt3408 ^ 0xffffffff) >= (plane_135_.anInt3398 + i_140_ >> plane_135_.anInt3410 ^ 0xffffffff) || i_141_ < 0 || (plane_135_.anInt3398 + i_142_ >> plane_135_.anInt3410 ^ 0xffffffff) <= (plane_135_.anInt3404 ^ 0xffffffff))) {
				return;
			}
			if (i == 1) {
				for (int i_143_ = 0; anInt5912 > i_143_; i_143_++)
					anIntArray5897[i_143_] = -i_137_ + (anIntArray5897[i_143_] + plane.method3260(i_138_ + anIntArray5913[i_143_], -117, anIntArray5879[i_143_] + i_136_));
			} else if (i != 2) {
				if ((i ^ 0xffffffff) != -4) {
					if (i != 4) {
						if (i == 5) {
							int i_144_ = -anInt5903 + anInt5821;
							for (int i_145_ = 0; i_145_ < anInt5912; i_145_++) {
								int i_146_ = anIntArray5879[i_145_] + i_136_;
								int i_147_ = i_138_ + anIntArray5913[i_145_];
								int i_148_ = plane.method3260(i_147_, -124, i_146_);
								int i_149_ = plane_135_.method3260(i_147_, -120, i_146_);
								int i_150_ = -i_134_ + -i_149_ + i_148_;
								anIntArray5897[i_145_] = (i_150_ * ((anIntArray5897[i_145_] << 8) / i_144_) >> 8) + i_148_ + -i_137_;
							}
						}
					} else {
						int i_151_ = anInt5821 + -anInt5903;
						for (int i_152_ = 0; (anInt5912 ^ 0xffffffff) < (i_152_ ^ 0xffffffff); i_152_++)
							anIntArray5897[i_152_] = i_151_ + anIntArray5897[i_152_] + (plane_135_.method3260(i_138_ + anIntArray5913[i_152_], -110, anIntArray5879[i_152_] + i_136_) - i_137_);
					}
				} else {
					int i_153_ = (0xff & i_134_) * 4;
					int i_154_ = 4 * ((i_134_ & 0xffd9) >> 8);
					int i_155_ = i_134_ >> 16 << 6 & 0x3fc0;
					int i_156_ = i_134_ >> 24 << 6 & 0x3fc0;
					if ((-(i_153_ >> 1) + i_136_ ^ 0xffffffff) > -1 || (plane.anInt3408 << plane.anInt3410 ^ 0xffffffff) >= ((i_153_ >> 1) + (i_136_ + plane.anInt3398) ^ 0xffffffff) || -(i_154_ >> 1) + i_138_ < 0 || i_138_ - -(i_154_ >> 1) - -plane.anInt3398 >= plane.anInt3404 << plane.anInt3410) {
						return;
					}
					this.method628(i_137_, i_155_, i_136_, -7024, i_153_, i_138_, i_154_, plane, i_156_);
				}
			} else {
				int i_157_ = anInt5903;
				if ((i_157_ ^ 0xffffffff) == -1) {
					return;
				}
				for (int i_158_ = 0; i_158_ < anInt5912; i_158_++) {
					int i_159_ = (anIntArray5897[i_158_] << 16) / i_157_;
					if (i_159_ < i_134_) {
						anIntArray5897[i_158_] = anIntArray5897[i_158_] - -((-i_159_ + i_134_) * (plane.method3260(anIntArray5913[i_158_] - -i_138_, -120, anIntArray5879[i_158_] - -i_136_) + -i_137_) / i_134_);
					}
				}
			}
			method689(4259);
			aBoolean5891 = false;
		}
	}
	
	final void method636(byte b, byte[] bs) {
		anInt5849++;
		if (bs == null) {
			for (int i = 0; i < anInt5813; i++)
				aByteArray5886[i] = b;
		} else {
			for (int i = 0; i < anInt5813; i++) {
				int i_160_ = 255 - (255 - (bs[i] & 0xff)) * (-(b & 0xff) + 255) / 255;
				aByteArray5886[i] = (byte) i_160_;
			}
		}
		method703(0);
	}
	
	final int na() {
		anInt5803++;
		if (!aBoolean5891) {
			method701((byte) 126);
		}
		return anInt5797;
	}
	
	final void method690(int i) {
		anInt5796++;
		if (aClass347_5828 != null) {
			aClass347_5828.method3977(-17311);
		}
		if (aClass347_5822 != null) {
			aClass347_5822.method3977(-17311);
		}
		if (aClass347_5852 != null) {
			aClass347_5852.method3977(-17311);
		}
		if (aClass347_5908 != null) {
			aClass347_5908.method3977(i + -17311);
		}
		if (i != 0) {
			anInt5909 = 88;
		}
		if (aClass333_5808 != null) {
			aClass333_5808.method3846((byte) 77);
		}
	}
	
	private final boolean method691(int i) {
		anInt5806++;
		if (aClass333_5808.aBoolean4150) {
			return true;
		}
		if (aClass333_5808.anInterface15_Impl1_4147 == null) {
			aClass333_5808.anInterface15_Impl1_4147 = anAbstractToolkit5916.method1346(aBoolean5880, (byte) 102);
		}
		Interface15_Impl1 interface15_impl1 = aClass333_5808.anInterface15_Impl1_4147;
		interface15_impl1.method56(i ^ ~0x69f, anInt5859 * 6);
		jaclib.memory.Buffer buffer = interface15_impl1.method54(true, (byte) 119);
		if (i != 0) {
			method695(-5, -84, -0.8228106F, -106, -127, 35, -100, 0.8634375F, 8L, -2, null);
		}
		if (buffer != null) {
			Stream stream = anAbstractToolkit5916.method1324(true, buffer);
			if (!Stream.b()) {
				for (int i_161_ = 0; i_161_ < anInt5859; i_161_++) {
					stream.c(aShortArray5841[i_161_]);
					stream.c(aShortArray5846[i_161_]);
					stream.c(aShortArray5906[i_161_]);
				}
			} else {
				for (int i_162_ = 0; (i_162_ ^ 0xffffffff) > (anInt5859 ^ 0xffffffff); i_162_++) {
					stream.b(aShortArray5841[i_162_]);
					stream.b(aShortArray5846[i_162_]);
					stream.b(aShortArray5906[i_162_]);
				}
			}
			stream.c();
			if (interface15_impl1.method53(-3308)) {
				aClass333_5808.aBoolean4150 = true;
				aClass333_5808.anInterface15_Impl1_4151 = interface15_impl1;
				aBoolean5826 = true;
				return true;
			}
		}
		return false;
	}
	
	private final void method692(int i) {
		if (i == -449434265) {
			anInt5824++;
			if (aClass268Array5856 != null) {
				anAbstractToolkit5916.C(!aBoolean5819);
				anAbstractToolkit5916.method1296(i ^ ~0x1ac9d2e6, false);
				anAbstractToolkit5916.method1304(1, i ^ ~0x1ac9d298, InterfaceSettings.aClass135_7421);
				anAbstractToolkit5916.method1366((byte) -81, InterfaceSettings.aClass135_7421, 1);
				for (int i_163_ = 0; i_163_ < anInt5811; i_163_++) {
					Class268 class268 = aClass268Array5856[i_163_];
					Class14 class14 = aClass14Array5872[i_163_];
					if (!class268.aBoolean3451 || !anAbstractToolkit5916.w()) {
						float f = (float) (anIntArray5879[class268.anInt3453] - -anIntArray5879[class268.anInt3454] - -anIntArray5879[class268.anInt3461]) * 0.3333333F;
						float f_164_ = (float) (anIntArray5897[class268.anInt3461] + anIntArray5897[class268.anInt3453] - -anIntArray5897[class268.anInt3454]) * 0.3333333F;
						float f_165_ = 0.3333333F * (float) (anIntArray5913[class268.anInt3453] + anIntArray5913[class268.anInt3454] + anIntArray5913[class268.anInt3461]);
						float f_166_ = f_165_ * Class37.aFloat558 + (f_164_ * Class12.aFloat199 + f * Class163.aFloat2013) + Class147.aFloat1824;
						float f_167_ = Node_Sub38_Sub37.aFloat10464 + (Class51_Sub2.aFloat9074 * f_165_ + (Node_Sub27.aFloat7310 * f + f_164_ * Node_Sub36_Sub4.aFloat10072));
						float f_168_ = f_165_ * Class262_Sub14.aFloat7810 + (Class331.aFloat4140 * f_164_ + f * Node_Sub15_Sub7.aFloat9821) + Class60.aFloat883;
						float f_169_ = (float) (1.0 / Math.sqrt((double) (f_168_ * f_168_ + (f_167_ * f_167_ + f_166_ * f_166_)))) * (float) class268.anInt3459;
						Class336_Sub1 class336_sub1 = anAbstractToolkit5916.method1264(false);
						class336_sub1.method3886(f_168_ - f_168_ * f_169_, class14.anInt216 * class268.aShort3457 >> 7, class14.anInt218 * class268.aShort3458 >> 7, 16383, (float) class14.anInt213 + f_167_ - f_167_ * f_169_, (float) class14.anInt212 + f_166_ - f_166_ * f_169_, class14.anInt217);
						class336_sub1.method3871(94, anAbstractToolkit5916.aClass336_Sub1_6268);
						anAbstractToolkit5916.method1266((byte) 114);
						int i_170_ = class14.anInt220;
						anAbstractToolkit5916.method1332(3, false, class268.aShort3460, false);
						anAbstractToolkit5916.method1277((byte) 61, class268.aByte3462);
						anAbstractToolkit5916.method1336(i + 449434263, i_170_);
						anAbstractToolkit5916.method1283((byte) -128);
					}
				}
				anAbstractToolkit5916.method1366((byte) 81, Class200_Sub1.aClass135_5139, 1);
				anAbstractToolkit5916.method1304(1, 0, Class200_Sub1.aClass135_5139);
				anAbstractToolkit5916.C(true);
			}
		}
	}
	
	final void s(int i) {
		if (aClass347_5828 != null) {
			aClass347_5828.aBoolean4285 = Class262_Sub15_Sub1.method3192(anInt5896, i, 512);
		}
		anInt5851++;
		if (aClass347_5822 != null) {
			aClass347_5822.aBoolean4285 = Class253.method3103(i, -124, anInt5896);
		}
		if (aClass347_5852 != null) {
			aClass347_5852.aBoolean4285 = Node_Sub41.method2932(-90, i, anInt5896);
		}
		if (aClass347_5908 != null) {
			aClass347_5908.aBoolean4285 = Class303.method3538(anInt5896, -127, i);
		}
		anInt5881 = i;
		aBoolean5826 = true;
		if (aClass284_5867 != null && (0x10000 & anInt5881 ^ 0xffffffff) == -1) {
			aShortArray5794 = aClass284_5867.aShortArray3593;
			aByteArray5834 = aClass284_5867.aByteArray3598;
			aShortArray5889 = aClass284_5867.aShortArray3595;
			aShortArray5898 = aClass284_5867.aShortArray3592;
			aClass284_5867 = null;
		}
		method698(262144);
	}
	
	final boolean F() {
		anInt5845++;
		return aBoolean5819;
	}
	
	final int WA() {
		anInt5876++;
		return aShort5868;
	}
	
	final int ma() {
		anInt5823++;
		if (!aBoolean5891) {
			method701((byte) 100);
		}
		return anInt5805;
	}
	
	final void P(int i, int i_171_, int i_172_, int i_173_) {
		anInt5829++;
		if ((i ^ 0xffffffff) == -1) {
			Class270_Sub2_Sub2.anInt10557 = 0;
			Class146.anInt1817 = 0;
			int i_174_ = 0;
			Class210.anInt2498 = 0;
			for (int i_175_ = 0; (anInt5912 ^ 0xffffffff) < (i_175_ ^ 0xffffffff); i_175_++) {
				Class146.anInt1817 += anIntArray5879[i_175_];
				Class270_Sub2_Sub2.anInt10557 += anIntArray5897[i_175_];
				i_174_++;
				Class210.anInt2498 = Class210.anInt2498 + anIntArray5913[i_175_];
			}
			if ((i_174_ ^ 0xffffffff) >= -1) {
				Class270_Sub2_Sub2.anInt10557 = i_172_;
				Class146.anInt1817 = i_171_;
				Class210.anInt2498 = i_173_;
			} else {
				Class270_Sub2_Sub2.anInt10557 = Class270_Sub2_Sub2.anInt10557 / i_174_ + i_172_;
				Class146.anInt1817 = i_171_ + Class146.anInt1817 / i_174_;
				Class210.anInt2498 = i_173_ + Class210.anInt2498 / i_174_;
			}
		} else if (i == 1) {
			for (int i_176_ = 0; i_176_ < anInt5912; i_176_++) {
				anIntArray5879[i_176_] += i_171_;
				anIntArray5897[i_176_] += i_172_;
				anIntArray5913[i_176_] += i_173_;
			}
		} else if (i == 2) {
			for (int i_177_ = 0; anInt5912 > i_177_; i_177_++) {
				anIntArray5879[i_177_] -= Class146.anInt1817;
				anIntArray5897[i_177_] -= Class270_Sub2_Sub2.anInt10557;
				anIntArray5913[i_177_] -= Class210.anInt2498;
				if ((i_173_ ^ 0xffffffff) != -1) {
					int i_178_ = Class335.anIntArray4167[i_173_];
					int i_179_ = Class335.anIntArray4165[i_173_];
					int i_180_ = 16383 + i_179_ * anIntArray5879[i_177_] + anIntArray5897[i_177_] * i_178_ >> 14;
					anIntArray5897[i_177_] = 16383 + i_179_ * anIntArray5897[i_177_] - anIntArray5879[i_177_] * i_178_ >> 14;
					anIntArray5879[i_177_] = i_180_;
				}
				if ((i_171_ ^ 0xffffffff) != -1) {
					int i_181_ = Class335.anIntArray4167[i_171_];
					int i_182_ = Class335.anIntArray4165[i_171_];
					int i_183_ = 16383 + i_182_ * anIntArray5897[i_177_] - anIntArray5913[i_177_] * i_181_ >> 14;
					anIntArray5913[i_177_] = 16383 + (i_182_ * anIntArray5913[i_177_] + i_181_ * anIntArray5897[i_177_]) >> 14;
					anIntArray5897[i_177_] = i_183_;
				}
				if ((i_172_ ^ 0xffffffff) != -1) {
					int i_184_ = Class335.anIntArray4167[i_172_];
					int i_185_ = Class335.anIntArray4165[i_172_];
					int i_186_ = 16383 + (anIntArray5913[i_177_] * i_184_ + i_185_ * anIntArray5879[i_177_]) >> 14;
					anIntArray5913[i_177_] = i_185_ * anIntArray5913[i_177_] + -(i_184_ * anIntArray5879[i_177_]) + 16383 >> 14;
					anIntArray5879[i_177_] = i_186_;
				}
				anIntArray5879[i_177_] += Class146.anInt1817;
				anIntArray5897[i_177_] += Class270_Sub2_Sub2.anInt10557;
				anIntArray5913[i_177_] += Class210.anInt2498;
			}
		} else if ((i ^ 0xffffffff) == -4) {
			for (int i_187_ = 0; anInt5912 > i_187_; i_187_++) {
				anIntArray5879[i_187_] -= Class146.anInt1817;
				anIntArray5897[i_187_] -= Class270_Sub2_Sub2.anInt10557;
				anIntArray5913[i_187_] -= Class210.anInt2498;
				anIntArray5879[i_187_] = i_171_ * anIntArray5879[i_187_] / 128;
				anIntArray5897[i_187_] = i_172_ * anIntArray5897[i_187_] / 128;
				anIntArray5913[i_187_] = anIntArray5913[i_187_] * i_173_ / 128;
				anIntArray5879[i_187_] += Class146.anInt1817;
				anIntArray5897[i_187_] += Class270_Sub2_Sub2.anInt10557;
				anIntArray5913[i_187_] += Class210.anInt2498;
			}
		} else if (i == 5) {
			for (int i_188_ = 0; (i_188_ ^ 0xffffffff) > (anInt5813 ^ 0xffffffff); i_188_++) {
				int i_189_ = i_171_ * 8 + (0xff & aByteArray5886[i_188_]);
				if (i_189_ < 0) {
					i_189_ = 0;
				} else if (i_189_ > 255) {
					i_189_ = 255;
				}
				aByteArray5886[i_188_] = (byte) i_189_;
			}
			if (aClass268Array5856 != null) {
				for (int i_190_ = 0; i_190_ < anInt5811; i_190_++) {
					Class268 class268 = aClass268Array5856[i_190_];
					Class14 class14 = aClass14Array5872[i_190_];
					class14.anInt220 = -(0xff & aByteArray5886[class268.anInt3456]) + 255 << 24 | class14.anInt220 & 0xffffff;
				}
			}
			method703(0);
		} else if ((i ^ 0xffffffff) == -8) {
			for (int i_191_ = 0; i_191_ < anInt5813; i_191_++) {
				int i_192_ = 0xffff & aShortArray5802[i_191_];
				int i_193_ = (0xfd70 & i_192_) >> 10;
				int i_194_ = 0x7 & i_192_ >> 7;
				i_194_ += i_172_ / 4;
				int i_195_ = i_192_ & 0x7f;
				i_193_ = i_193_ + i_171_ & 0x3f;
				i_195_ += i_173_;
				if (i_194_ >= 0) {
					if ((i_194_ ^ 0xffffffff) < -8) {
						i_194_ = 7;
					}
				} else {
					i_194_ = 0;
				}
				if (i_195_ >= 0) {
					if (i_195_ > 127) {
						i_195_ = 127;
					}
				} else {
					i_195_ = 0;
				}
				aShortArray5802[i_191_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_194_ << 7, i_193_ << 10), i_195_);
			}
			if (aClass268Array5856 != null) {
				for (int i_196_ = 0; i_196_ < anInt5811; i_196_++) {
					Class268 class268 = aClass268Array5856[i_196_];
					Class14 class14 = aClass14Array5872[i_196_];
					class14.anInt220 = 0xffffff & Class85.anIntArray1158[aShortArray5802[class268.anInt3456] & 0xffff] | ~0xffffff & class14.anInt220;
				}
			}
			method703(0);
		} else if ((i ^ 0xffffffff) == -9) {
			for (int i_197_ = 0; anInt5811 > i_197_; i_197_++) {
				Class14 class14 = aClass14Array5872[i_197_];
				class14.anInt213 += i_172_;
				class14.anInt212 += i_171_;
			}
		} else if (i == 10) {
			for (int i_198_ = 0; anInt5811 > i_198_; i_198_++) {
				Class14 class14 = aClass14Array5872[i_198_];
				class14.anInt216 = class14.anInt216 * i_172_ >> 7;
				class14.anInt218 = i_171_ * class14.anInt218 >> 7;
			}
		} else if (i == 9) {
			for (int i_199_ = 0; anInt5811 > i_199_; i_199_++) {
				Class14 class14 = aClass14Array5872[i_199_];
				class14.anInt217 = class14.anInt217 - -i_171_ & 0x3fff;
			}
		}
	}
	
	final void method614(Class336 class336) {
		anInt5800++;
		Class336_Sub1 class336_sub1 = (Class336_Sub1) class336;
		if (aClass300Array5905 != null) {
			for (int i = 0; (i ^ 0xffffffff) > (aClass300Array5905.length ^ 0xffffffff); i++) {
				Class300 class300 = aClass300Array5905[i];
				Class300 class300_200_ = class300;
				if (class300.aClass300_3763 != null) {
					class300_200_ = class300.aClass300_3763;
				}
				class300_200_.anInt3769 = (int) (class336_sub1.aFloat8550 + (class336_sub1.aFloat8529 * (float) anIntArray5913[class300.anInt3764] + ((float) anIntArray5897[class300.anInt3764] * class336_sub1.aFloat8531 + class336_sub1.aFloat8530 * (float) anIntArray5879[class300.anInt3764])));
				class300_200_.anInt3751 = (int) (class336_sub1.aFloat8521 + (class336_sub1.aFloat8535 * (float) anIntArray5913[class300.anInt3764] + ((float) anIntArray5897[class300.anInt3764] * class336_sub1.aFloat8538 + class336_sub1.aFloat8544 * (float) anIntArray5879[class300.anInt3764])));
				class300_200_.anInt3753 = (int) ((float) anIntArray5879[class300.anInt3764] * class336_sub1.aFloat8547 + (float) anIntArray5897[class300.anInt3764] * class336_sub1.aFloat8508 + (float) anIntArray5913[class300.anInt3764] * class336_sub1.aFloat8556 + class336_sub1.aFloat8542);
				class300_200_.anInt3766 = (int) ((float) anIntArray5913[class300.anInt3757] * class336_sub1.aFloat8529 + ((float) anIntArray5879[class300.anInt3757] * class336_sub1.aFloat8530 + class336_sub1.aFloat8531 * (float) anIntArray5897[class300.anInt3757]) + class336_sub1.aFloat8550);
				class300_200_.anInt3756 = (int) (class336_sub1.aFloat8535 * (float) anIntArray5913[class300.anInt3757] + ((float) anIntArray5897[class300.anInt3757] * class336_sub1.aFloat8538 + class336_sub1.aFloat8544 * (float) anIntArray5879[class300.anInt3757]) + class336_sub1.aFloat8521);
				class300_200_.anInt3758 = (int) (class336_sub1.aFloat8508 * (float) anIntArray5897[class300.anInt3757] + class336_sub1.aFloat8547 * (float) anIntArray5879[class300.anInt3757] + class336_sub1.aFloat8556 * (float) anIntArray5913[class300.anInt3757] + class336_sub1.aFloat8542);
				class300_200_.anInt3761 = (int) (class336_sub1.aFloat8550 + (class336_sub1.aFloat8529 * (float) anIntArray5913[class300.anInt3754] + ((float) anIntArray5879[class300.anInt3754] * class336_sub1.aFloat8530 + class336_sub1.aFloat8531 * (float) anIntArray5897[class300.anInt3754])));
				class300_200_.anInt3752 = (int) (class336_sub1.aFloat8521 + ((float) anIntArray5879[class300.anInt3754] * class336_sub1.aFloat8544 + class336_sub1.aFloat8538 * (float) anIntArray5897[class300.anInt3754] + (float) anIntArray5913[class300.anInt3754] * class336_sub1.aFloat8535));
				class300_200_.anInt3771 = (int) (class336_sub1.aFloat8542 + ((float) anIntArray5879[class300.anInt3754] * class336_sub1.aFloat8547 + class336_sub1.aFloat8508 * (float) anIntArray5897[class300.anInt3754] + (float) anIntArray5913[class300.anInt3754] * class336_sub1.aFloat8556));
			}
		}
		if (aClass218Array5817 != null) {
			for (int i = 0; (i ^ 0xffffffff) > (aClass218Array5817.length ^ 0xffffffff); i++) {
				Class218 class218 = aClass218Array5817[i];
				Class218 class218_201_ = class218;
				if (class218.aClass218_2561 != null) {
					class218_201_ = class218.aClass218_2561;
				}
				if (class218.aClass336_2562 != null) {
					class218.aClass336_2562.method3857(class336_sub1);
				} else {
					class218.aClass336_2562 = class336_sub1.method3858();
				}
				class218_201_.anInt2559 = (int) ((float) anIntArray5913[class218.anInt2554] * class336_sub1.aFloat8529 + (class336_sub1.aFloat8530 * (float) anIntArray5879[class218.anInt2554] + (float) anIntArray5897[class218.anInt2554] * class336_sub1.aFloat8531) + class336_sub1.aFloat8550);
				class218_201_.anInt2557 = (int) ((float) anIntArray5913[class218.anInt2554] * class336_sub1.aFloat8535 + (class336_sub1.aFloat8538 * (float) anIntArray5897[class218.anInt2554] + class336_sub1.aFloat8544 * (float) anIntArray5879[class218.anInt2554]) + class336_sub1.aFloat8521);
				class218_201_.anInt2556 = (int) ((float) anIntArray5897[class218.anInt2554] * class336_sub1.aFloat8508 + (float) anIntArray5879[class218.anInt2554] * class336_sub1.aFloat8547 + class336_sub1.aFloat8556 * (float) anIntArray5913[class218.anInt2554] + class336_sub1.aFloat8542);
			}
		}
	}
	
	final boolean r() {
		anInt5855++;
		return aBoolean5866;
	}
	
	private final boolean method693(int i, Class336 class336, int i_202_, int i_203_, boolean bool, boolean bool_204_, int i_205_) {
		anInt5893++;
		Class336_Sub1 class336_sub1 = (Class336_Sub1) class336;
		Class336_Sub1 class336_sub1_206_ = anAbstractToolkit5916.aClass336_Sub1_6267;
		float f = class336_sub1_206_.aFloat8550 + (class336_sub1_206_.aFloat8529 * class336_sub1.aFloat8542 + (class336_sub1.aFloat8550 * class336_sub1_206_.aFloat8530 + class336_sub1_206_.aFloat8531 * class336_sub1.aFloat8521));
		float f_207_ = class336_sub1_206_.aFloat8521 + (class336_sub1_206_.aFloat8535 * class336_sub1.aFloat8542 + (class336_sub1_206_.aFloat8538 * class336_sub1.aFloat8521 + class336_sub1.aFloat8550 * class336_sub1_206_.aFloat8544));
		Class51_Sub2.aFloat9074 = class336_sub1_206_.aFloat8535 * class336_sub1.aFloat8556 + (class336_sub1_206_.aFloat8544 * class336_sub1.aFloat8529 + class336_sub1.aFloat8535 * class336_sub1_206_.aFloat8538);
		Class262_Sub14.aFloat7810 = class336_sub1.aFloat8529 * class336_sub1_206_.aFloat8547 + class336_sub1.aFloat8535 * class336_sub1_206_.aFloat8508 + class336_sub1.aFloat8556 * class336_sub1_206_.aFloat8556;
		Node_Sub15_Sub7.aFloat9821 = class336_sub1.aFloat8547 * class336_sub1_206_.aFloat8556 + (class336_sub1_206_.aFloat8547 * class336_sub1.aFloat8530 + class336_sub1.aFloat8544 * class336_sub1_206_.aFloat8508);
		Class37.aFloat558 = class336_sub1_206_.aFloat8531 * class336_sub1.aFloat8535 + class336_sub1.aFloat8529 * class336_sub1_206_.aFloat8530 + class336_sub1_206_.aFloat8529 * class336_sub1.aFloat8556;
		Class12.aFloat199 = class336_sub1.aFloat8508 * class336_sub1_206_.aFloat8529 + (class336_sub1_206_.aFloat8531 * class336_sub1.aFloat8538 + class336_sub1_206_.aFloat8530 * class336_sub1.aFloat8531);
		Class331.aFloat4140 = class336_sub1.aFloat8531 * class336_sub1_206_.aFloat8547 + class336_sub1_206_.aFloat8508 * class336_sub1.aFloat8538 + class336_sub1_206_.aFloat8556 * class336_sub1.aFloat8508;
		Node_Sub27.aFloat7310 = class336_sub1_206_.aFloat8538 * class336_sub1.aFloat8544 + class336_sub1_206_.aFloat8544 * class336_sub1.aFloat8530 + class336_sub1.aFloat8547 * class336_sub1_206_.aFloat8535;
		Node_Sub36_Sub4.aFloat10072 = class336_sub1_206_.aFloat8535 * class336_sub1.aFloat8508 + (class336_sub1.aFloat8531 * class336_sub1_206_.aFloat8544 + class336_sub1.aFloat8538 * class336_sub1_206_.aFloat8538);
		Class163.aFloat2013 = class336_sub1_206_.aFloat8531 * class336_sub1.aFloat8544 + class336_sub1.aFloat8530 * class336_sub1_206_.aFloat8530 + class336_sub1_206_.aFloat8529 * class336_sub1.aFloat8547;
		float f_208_ = class336_sub1_206_.aFloat8542 + (class336_sub1.aFloat8542 * class336_sub1_206_.aFloat8556 + (class336_sub1_206_.aFloat8547 * class336_sub1.aFloat8550 + class336_sub1.aFloat8521 * class336_sub1_206_.aFloat8508));
		boolean bool_209_ = bool;
		float f_210_ = 3.4028235E38F;
		float f_211_ = -3.4028235E38F;
		float f_212_ = 3.4028235E38F;
		float f_213_ = -3.4028235E38F;
		int i_214_ = anAbstractToolkit5916.anInt6289;
		int i_215_ = anAbstractToolkit5916.anInt6362;
		if (!aBoolean5891) {
			method701((byte) 87);
		}
		int i_216_ = -anInt5825 + anInt5815 >> 1;
		int i_217_ = -anInt5903 + anInt5821 >> 1;
		int i_218_ = -anInt5883 + anInt5909 >> 1;
		int i_219_ = anInt5825 - -i_216_;
		int i_220_ = anInt5903 - -i_217_;
		int i_221_ = i_218_ + anInt5883;
		int i_222_ = -(i_216_ << i_202_) + i_219_;
		int i_223_ = -(i_217_ << i_202_) + i_220_;
		int i_224_ = i_221_ + -(i_218_ << i_202_);
		int i_225_ = i_219_ - -(i_216_ << i_202_);
		int i_226_ = i_220_ + (i_217_ << i_202_);
		GLPlane.anIntArray7918[0] = i_222_;
		int i_227_ = (i_218_ << i_202_) + i_221_;
		Class99.anIntArray1292[0] = i_223_;
		Canvas.anIntArray70[0] = i_224_;
		GLPlane.anIntArray7918[1] = i_225_;
		Class99.anIntArray1292[1] = i_223_;
		Canvas.anIntArray70[1] = i_224_;
		GLPlane.anIntArray7918[2] = i_222_;
		Class99.anIntArray1292[2] = i_226_;
		Canvas.anIntArray70[2] = i_224_;
		GLPlane.anIntArray7918[3] = i_225_;
		Class99.anIntArray1292[3] = i_226_;
		GLPlane.anIntArray7918[4] = i_222_;
		Canvas.anIntArray70[3] = i_224_;
		Class99.anIntArray1292[4] = i_223_;
		Canvas.anIntArray70[4] = i_227_;
		GLPlane.anIntArray7918[5] = i_225_;
		Class99.anIntArray1292[5] = i_223_;
		GLPlane.anIntArray7918[6] = i_222_;
		Canvas.anIntArray70[5] = i_227_;
		Class99.anIntArray1292[6] = i_226_;
		Canvas.anIntArray70[6] = i_227_;
		GLPlane.anIntArray7918[7] = i_225_;
		Class99.anIntArray1292[7] = i_226_;
		Canvas.anIntArray70[7] = i_227_;
		for (int i_228_ = 0; (i_228_ ^ 0xffffffff) > -9; i_228_++) {
			float f_229_ = (float) GLPlane.anIntArray7918[i_228_];
			float f_230_ = (float) Canvas.anIntArray70[i_228_];
			float f_231_ = (float) Class99.anIntArray1292[i_228_];
			float f_232_ = f_230_ * Class37.aFloat558 + (f_229_ * Class163.aFloat2013 + Class12.aFloat199 * f_231_) + f;
			float f_233_ = Node_Sub15_Sub7.aFloat9821 * f_229_ + Class331.aFloat4140 * f_231_ + f_230_ * Class262_Sub14.aFloat7810 + f_208_;
			float f_234_ = Class51_Sub2.aFloat9074 * f_230_ + (f_229_ * Node_Sub27.aFloat7310 + f_231_ * Node_Sub36_Sub4.aFloat10072) + f_207_;
			if (f_233_ >= (float) anAbstractToolkit5916.anInt6364) {
				if ((i ^ 0xffffffff) < -1) {
					f_233_ = (float) i;
				}
				float f_235_ = (float) anAbstractToolkit5916.anInt6341 + f_232_ * (float) i_214_ / f_233_;
				if (f_211_ < f_235_) {
					f_211_ = f_235_;
				}
				float f_236_ = (float) i_215_ * f_234_ / f_233_ + (float) anAbstractToolkit5916.anInt6331;
				if (f_235_ < f_210_) {
					f_210_ = f_235_;
				}
				if (f_212_ > f_236_) {
					f_212_ = f_236_;
				}
				if (f_236_ > f_213_) {
					f_213_ = f_236_;
				}
				bool_209_ = true;
			}
		}
		if (bool_209_ && f_210_ < (float) i_205_ && (float) i_205_ < f_211_ && f_212_ < (float) i_203_ && f_213_ > (float) i_203_) {
			if (bool_204_) {
				return true;
			}
			if ((anInt5885 ^ 0xffffffff) < (Class107.anIntArray1363.length ^ 0xffffffff)) {
				Class365.anIntArray4525 = new int[anInt5885];
				Class107.anIntArray1363 = new int[anInt5885];
			}
			for (int i_237_ = 0; i_237_ < anInt5912; i_237_++) {
				float f_238_ = (float) anIntArray5913[i_237_];
				float f_239_ = (float) anIntArray5879[i_237_];
				float f_240_ = (float) anIntArray5897[i_237_];
				float f_241_ = f_207_ + (Node_Sub27.aFloat7310 * f_239_ + Node_Sub36_Sub4.aFloat10072 * f_240_ + f_238_ * Class51_Sub2.aFloat9074);
				float f_242_ = f_239_ * Class163.aFloat2013 + Class12.aFloat199 * f_240_ + Class37.aFloat558 * f_238_ + f;
				float f_243_ = f_208_ + (f_240_ * Class331.aFloat4140 + Node_Sub15_Sub7.aFloat9821 * f_239_ + Class262_Sub14.aFloat7810 * f_238_);
				if (!((float) anAbstractToolkit5916.anInt6364 <= f_243_)) {
					int i_244_ = anIntArray5911[i_237_];
					int i_245_ = anIntArray5911[1 + i_237_];
					for (int i_246_ = i_244_; i_246_ < i_245_; i_246_++) {
						int i_247_ = -1 + aShortArray5899[i_246_];
						if ((i_247_ ^ 0xffffffff) == 0) {
							break;
						}
						Class107.anIntArray1363[aShortArray5899[i_246_] + -1] = -999999;
					}
				} else {
					if (i > 0) {
						f_243_ = (float) i;
					}
					int i_248_ = (int) ((float) anAbstractToolkit5916.anInt6341 + f_242_ * (float) i_214_ / f_243_);
					int i_249_ = (int) ((float) anAbstractToolkit5916.anInt6331 + f_241_ * (float) i_215_ / f_243_);
					int i_250_ = anIntArray5911[i_237_];
					int i_251_ = anIntArray5911[i_237_ + 1];
					for (int i_252_ = i_250_; (i_251_ ^ 0xffffffff) < (i_252_ ^ 0xffffffff); i_252_++) {
						int i_253_ = aShortArray5899[i_252_] - 1;
						if (i_253_ == -1) {
							break;
						}
						Class107.anIntArray1363[i_253_] = i_248_;
						Class365.anIntArray4525[i_253_] = i_249_;
					}
				}
			}
			for (int i_254_ = 0; (anInt5813 ^ 0xffffffff) < (i_254_ ^ 0xffffffff); i_254_++) {
				if ((Class107.anIntArray1363[aShortArray5841[i_254_]] ^ 0xffffffff) != 999998 && Class107.anIntArray1363[aShortArray5846[i_254_]] != -999999 && (Class107.anIntArray1363[aShortArray5906[i_254_]] ^ 0xffffffff) != 999998 && method696(Class365.anIntArray4525[aShortArray5846[i_254_]], i_205_, Class365.anIntArray4525[aShortArray5841[i_254_]], (byte) 37, Class107.anIntArray1363[aShortArray5906[i_254_]], i_203_, Class107.anIntArray1363[aShortArray5846[i_254_]], Class107.anIntArray1363[aShortArray5841[i_254_]], Class365.anIntArray4525[aShortArray5906[i_254_]])) {
					return true;
				}
			}
		}
		return false;
	}
	
	final void wa() {
		anInt5833++;
		for (int i = 0; i < anInt5902; i++) {
			anIntArray5879[i] = anIntArray5879[i] + 7 >> 4;
			anIntArray5897[i] = 7 + anIntArray5897[i] >> 4;
			anIntArray5913[i] = anIntArray5913[i] + 7 >> 4;
		}
		method689(4259);
		aBoolean5891 = false;
	}
	
	final void VA(int i) {
		anInt5844++;
		int i_255_ = Class335.anIntArray4167[i];
		int i_256_ = Class335.anIntArray4165[i];
		for (int i_257_ = 0; (anInt5912 ^ 0xffffffff) < (i_257_ ^ 0xffffffff); i_257_++) {
			int i_258_ = i_256_ * anIntArray5879[i_257_] + anIntArray5897[i_257_] * i_255_ >> 14;
			anIntArray5897[i_257_] = anIntArray5897[i_257_] * i_256_ - i_255_ * anIntArray5879[i_257_] >> 14;
			anIntArray5879[i_257_] = i_258_;
		}
		method689(4259);
		aBoolean5891 = false;
	}
	
	final void O(int i, int i_259_, int i_260_) {
		anInt5848++;
		for (int i_261_ = 0; (anInt5912 ^ 0xffffffff) < (i_261_ ^ 0xffffffff); i_261_++) {
			if ((i ^ 0xffffffff) != -129) {
				anIntArray5879[i_261_] = anIntArray5879[i_261_] * i >> 7;
			}
			if ((i_259_ ^ 0xffffffff) != -129) {
				anIntArray5897[i_261_] = i_259_ * anIntArray5897[i_261_] >> 7;
			}
			if (i_260_ != 128) {
				anIntArray5913[i_261_] = anIntArray5913[i_261_] * i_260_ >> 7;
			}
		}
		method689(4259);
		aBoolean5891 = false;
	}
	
	final void method637(int i, int[] is, int i_262_, int i_263_, int i_264_, int i_265_, boolean bool) {
		anInt5831++;
		int i_266_ = is.length;
		if (i == 0) {
			i_264_ <<= 4;
			i_263_ <<= 4;
			i_262_ <<= 4;
			int i_267_ = 0;
			Class146.anInt1817 = 0;
			Class270_Sub2_Sub2.anInt10557 = 0;
			Class210.anInt2498 = 0;
			for (int i_268_ = 0; i_266_ > i_268_; i_268_++) {
				int i_269_ = is[i_268_];
				if ((i_269_ ^ 0xffffffff) > (anIntArrayArray5847.length ^ 0xffffffff)) {
					int[] is_270_ = anIntArrayArray5847[i_269_];
					for (int i_271_ = 0; i_271_ < is_270_.length; i_271_++) {
						int i_272_ = is_270_[i_271_];
						Class146.anInt1817 += anIntArray5879[i_272_];
						Class270_Sub2_Sub2.anInt10557 += anIntArray5897[i_272_];
						i_267_++;
						Class210.anInt2498 += anIntArray5913[i_272_];
					}
				}
			}
			if (i_267_ <= 0) {
				Class270_Sub2_Sub2.anInt10557 = i_263_;
				Class210.anInt2498 = i_264_;
				Class146.anInt1817 = i_262_;
			} else {
				Class270_Sub2_Sub2.anInt10557 = Class270_Sub2_Sub2.anInt10557 / i_267_ + i_263_;
				Class146.anInt1817 = Class146.anInt1817 / i_267_ - -i_262_;
				Class210.anInt2498 = i_264_ + Class210.anInt2498 / i_267_;
			}
		} else if (i == 1) {
			i_262_ <<= 4;
			i_264_ <<= 4;
			i_263_ <<= 4;
			for (int i_273_ = 0; (i_266_ ^ 0xffffffff) < (i_273_ ^ 0xffffffff); i_273_++) {
				int i_274_ = is[i_273_];
				if (anIntArrayArray5847.length > i_274_) {
					int[] is_275_ = anIntArrayArray5847[i_274_];
					for (int i_276_ = 0; (is_275_.length ^ 0xffffffff) < (i_276_ ^ 0xffffffff); i_276_++) {
						int i_277_ = is_275_[i_276_];
						anIntArray5879[i_277_] += i_262_;
						anIntArray5897[i_277_] += i_263_;
						anIntArray5913[i_277_] += i_264_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_278_ = 0; i_266_ > i_278_; i_278_++) {
				int i_279_ = is[i_278_];
				if (i_279_ < anIntArrayArray5847.length) {
					int[] is_280_ = anIntArrayArray5847[i_279_];
					if ((0x1 & i_265_ ^ 0xffffffff) != -1) {
						for (int i_281_ = 0; (is_280_.length ^ 0xffffffff) < (i_281_ ^ 0xffffffff); i_281_++) {
							int i_282_ = is_280_[i_281_];
							anIntArray5879[i_282_] -= Class146.anInt1817;
							anIntArray5897[i_282_] -= Class270_Sub2_Sub2.anInt10557;
							anIntArray5913[i_282_] -= Class210.anInt2498;
							if (i_262_ != 0) {
								int i_283_ = Class335.anIntArray4167[i_262_];
								int i_284_ = Class335.anIntArray4165[i_262_];
								int i_285_ = -(anIntArray5913[i_282_] * i_283_) + (i_284_ * anIntArray5897[i_282_] - -16383) >> 14;
								anIntArray5913[i_282_] = 16383 + (anIntArray5913[i_282_] * i_284_ + anIntArray5897[i_282_] * i_283_) >> 14;
								anIntArray5897[i_282_] = i_285_;
							}
							if ((i_264_ ^ 0xffffffff) != -1) {
								int i_286_ = Class335.anIntArray4167[i_264_];
								int i_287_ = Class335.anIntArray4165[i_264_];
								int i_288_ = 16383 + i_286_ * anIntArray5897[i_282_] - -(anIntArray5879[i_282_] * i_287_) >> 14;
								anIntArray5897[i_282_] = -(i_286_ * anIntArray5879[i_282_]) + i_287_ * anIntArray5897[i_282_] - -16383 >> 14;
								anIntArray5879[i_282_] = i_288_;
							}
							if ((i_263_ ^ 0xffffffff) != -1) {
								int i_289_ = Class335.anIntArray4167[i_263_];
								int i_290_ = Class335.anIntArray4165[i_263_];
								int i_291_ = i_290_ * anIntArray5879[i_282_] + (anIntArray5913[i_282_] * i_289_ - -16383) >> 14;
								anIntArray5913[i_282_] = -(anIntArray5879[i_282_] * i_289_) + anIntArray5913[i_282_] * i_290_ + 16383 >> 14;
								anIntArray5879[i_282_] = i_291_;
							}
							anIntArray5879[i_282_] += Class146.anInt1817;
							anIntArray5897[i_282_] += Class270_Sub2_Sub2.anInt10557;
							anIntArray5913[i_282_] += Class210.anInt2498;
						}
					} else {
						for (int i_292_ = 0; i_292_ < is_280_.length; i_292_++) {
							int i_293_ = is_280_[i_292_];
							anIntArray5879[i_293_] -= Class146.anInt1817;
							anIntArray5897[i_293_] -= Class270_Sub2_Sub2.anInt10557;
							anIntArray5913[i_293_] -= Class210.anInt2498;
							if ((i_264_ ^ 0xffffffff) != -1) {
								int i_294_ = Class335.anIntArray4167[i_264_];
								int i_295_ = Class335.anIntArray4165[i_264_];
								int i_296_ = i_294_ * anIntArray5897[i_293_] - -(anIntArray5879[i_293_] * i_295_) + 16383 >> 14;
								anIntArray5897[i_293_] = 16383 + i_295_ * anIntArray5897[i_293_] + -(i_294_ * anIntArray5879[i_293_]) >> 14;
								anIntArray5879[i_293_] = i_296_;
							}
							if (i_262_ != 0) {
								int i_297_ = Class335.anIntArray4167[i_262_];
								int i_298_ = Class335.anIntArray4165[i_262_];
								int i_299_ = 16383 + i_298_ * anIntArray5897[i_293_] - anIntArray5913[i_293_] * i_297_ >> 14;
								anIntArray5913[i_293_] = 16383 + anIntArray5897[i_293_] * i_297_ - -(anIntArray5913[i_293_] * i_298_) >> 14;
								anIntArray5897[i_293_] = i_299_;
							}
							if ((i_263_ ^ 0xffffffff) != -1) {
								int i_300_ = Class335.anIntArray4167[i_263_];
								int i_301_ = Class335.anIntArray4165[i_263_];
								int i_302_ = i_300_ * anIntArray5913[i_293_] + (anIntArray5879[i_293_] * i_301_ - -16383) >> 14;
								anIntArray5913[i_293_] = i_301_ * anIntArray5913[i_293_] - i_300_ * anIntArray5879[i_293_] + 16383 >> 14;
								anIntArray5879[i_293_] = i_302_;
							}
							anIntArray5879[i_293_] += Class146.anInt1817;
							anIntArray5897[i_293_] += Class270_Sub2_Sub2.anInt10557;
							anIntArray5913[i_293_] += Class210.anInt2498;
						}
					}
				}
			}
			if (bool) {
				for (int i_303_ = 0; (i_303_ ^ 0xffffffff) > (i_266_ ^ 0xffffffff); i_303_++) {
					int i_304_ = is[i_303_];
					if ((i_304_ ^ 0xffffffff) > (anIntArrayArray5847.length ^ 0xffffffff)) {
						int[] is_305_ = anIntArrayArray5847[i_304_];
						for (int i_306_ = 0; i_306_ < is_305_.length; i_306_++) {
							int i_307_ = is_305_[i_306_];
							int i_308_ = anIntArray5911[i_307_];
							int i_309_ = anIntArray5911[1 + i_307_];
							for (int i_310_ = i_308_; (i_310_ ^ 0xffffffff) > (i_309_ ^ 0xffffffff); i_310_++) {
								int i_311_ = aShortArray5899[i_310_] - 1;
								if ((i_311_ ^ 0xffffffff) == 0) {
									break;
								}
								if ((i_264_ ^ 0xffffffff) != -1) {
									int i_312_ = Class335.anIntArray4167[i_264_];
									int i_313_ = Class335.anIntArray4165[i_264_];
									int i_314_ = 16383 + aShortArray5898[i_311_] * i_312_ - -(aShortArray5889[i_311_] * i_313_) >> 14;
									aShortArray5898[i_311_] = (short) (16383 + (-(aShortArray5889[i_311_] * i_312_) + aShortArray5898[i_311_] * i_313_) >> 14);
									aShortArray5889[i_311_] = (short) i_314_;
								}
								if ((i_262_ ^ 0xffffffff) != -1) {
									int i_315_ = Class335.anIntArray4167[i_262_];
									int i_316_ = Class335.anIntArray4165[i_262_];
									int i_317_ = 16383 + -(aShortArray5794[i_311_] * i_315_) + aShortArray5898[i_311_] * i_316_ >> 14;
									aShortArray5794[i_311_] = (short) (i_315_ * aShortArray5898[i_311_] + (i_316_ * aShortArray5794[i_311_] + 16383) >> 14);
									aShortArray5898[i_311_] = (short) i_317_;
								}
								if ((i_263_ ^ 0xffffffff) != -1) {
									int i_318_ = Class335.anIntArray4167[i_263_];
									int i_319_ = Class335.anIntArray4165[i_263_];
									int i_320_ = i_319_ * aShortArray5889[i_311_] + (aShortArray5794[i_311_] * i_318_ - -16383) >> 14;
									aShortArray5794[i_311_] = (short) (-(i_318_ * aShortArray5889[i_311_]) + i_319_ * aShortArray5794[i_311_] - -16383 >> 14);
									aShortArray5889[i_311_] = (short) i_320_;
								}
							}
						}
					}
				}
				method694(-1);
			}
		} else if ((i ^ 0xffffffff) == -4) {
			for (int i_321_ = 0; i_321_ < i_266_; i_321_++) {
				int i_322_ = is[i_321_];
				if ((i_322_ ^ 0xffffffff) > (anIntArrayArray5847.length ^ 0xffffffff)) {
					int[] is_323_ = anIntArrayArray5847[i_322_];
					for (int i_324_ = 0; i_324_ < is_323_.length; i_324_++) {
						int i_325_ = is_323_[i_324_];
						anIntArray5879[i_325_] -= Class146.anInt1817;
						anIntArray5897[i_325_] -= Class270_Sub2_Sub2.anInt10557;
						anIntArray5913[i_325_] -= Class210.anInt2498;
						anIntArray5879[i_325_] = i_262_ * anIntArray5879[i_325_] >> 7;
						anIntArray5897[i_325_] = i_263_ * anIntArray5897[i_325_] >> 7;
						anIntArray5913[i_325_] = i_264_ * anIntArray5913[i_325_] >> 7;
						anIntArray5879[i_325_] += Class146.anInt1817;
						anIntArray5897[i_325_] += Class270_Sub2_Sub2.anInt10557;
						anIntArray5913[i_325_] += Class210.anInt2498;
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -6) {
			if (anIntArrayArray5900 != null) {
				boolean bool_326_ = false;
				for (int i_327_ = 0; (i_266_ ^ 0xffffffff) < (i_327_ ^ 0xffffffff); i_327_++) {
					int i_328_ = is[i_327_];
					if ((anIntArrayArray5900.length ^ 0xffffffff) < (i_328_ ^ 0xffffffff)) {
						int[] is_329_ = anIntArrayArray5900[i_328_];
						for (int i_330_ = 0; is_329_.length > i_330_; i_330_++) {
							int i_331_ = is_329_[i_330_];
							int i_332_ = (aByteArray5886[i_331_] & 0xff) - -(i_262_ * 8);
							if (i_332_ >= 0) {
								if (i_332_ > 255) {
									i_332_ = 255;
								}
							} else {
								i_332_ = 0;
							}
							aByteArray5886[i_331_] = (byte) i_332_;
						}
						bool_326_ = bool_326_ | (is_329_.length ^ 0xffffffff) < -1;
					}
				}
				if (bool_326_) {
					if (aClass268Array5856 != null) {
						for (int i_333_ = 0; (anInt5811 ^ 0xffffffff) < (i_333_ ^ 0xffffffff); i_333_++) {
							Class268 class268 = aClass268Array5856[i_333_];
							Class14 class14 = aClass14Array5872[i_333_];
							class14.anInt220 = class14.anInt220 & 0xffffff | -(0xff & aByteArray5886[class268.anInt3456]) + 255 << 24;
						}
					}
					method703(0);
				}
			}
		} else if ((i ^ 0xffffffff) == -8) {
			if (anIntArrayArray5900 != null) {
				boolean bool_334_ = false;
				for (int i_335_ = 0; i_335_ < i_266_; i_335_++) {
					int i_336_ = is[i_335_];
					if ((i_336_ ^ 0xffffffff) > (anIntArrayArray5900.length ^ 0xffffffff)) {
						int[] is_337_ = anIntArrayArray5900[i_336_];
						for (int i_338_ = 0; (is_337_.length ^ 0xffffffff) < (i_338_ ^ 0xffffffff); i_338_++) {
							int i_339_ = is_337_[i_338_];
							int i_340_ = aShortArray5802[i_339_] & 0xffff;
							int i_341_ = 0x3f & i_340_ >> 10;
							int i_342_ = (i_340_ & 0x3f9) >> 7;
							int i_343_ = i_340_ & 0x7f;
							i_341_ = 0x3f & i_341_ - -i_262_;
							i_342_ += i_263_ / 4;
							i_343_ += i_264_;
							if (i_342_ >= 0) {
								if ((i_342_ ^ 0xffffffff) < -8) {
									i_342_ = 7;
								}
							} else {
								i_342_ = 0;
							}
							if (i_343_ >= 0) {
								if (i_343_ > 127) {
									i_343_ = 127;
								}
							} else {
								i_343_ = 0;
							}
							aShortArray5802[i_339_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_342_ << 7, i_341_ << 10), i_343_);
						}
						bool_334_ = bool_334_ | is_337_.length > 0;
					}
				}
				if (bool_334_) {
					if (aClass268Array5856 != null) {
						for (int i_344_ = 0; (i_344_ ^ 0xffffffff) > (anInt5811 ^ 0xffffffff); i_344_++) {
							Class268 class268 = aClass268Array5856[i_344_];
							Class14 class14 = aClass14Array5872[i_344_];
							class14.anInt220 = Class85.anIntArray1158[aShortArray5802[class268.anInt3456] & 0xffff] & 0xffffff | ~0xffffff & class14.anInt220;
						}
					}
					method703(0);
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray5892 != null) {
				for (int i_345_ = 0; i_345_ < i_266_; i_345_++) {
					int i_346_ = is[i_345_];
					if ((i_346_ ^ 0xffffffff) > (anIntArrayArray5892.length ^ 0xffffffff)) {
						int[] is_347_ = anIntArrayArray5892[i_346_];
						for (int i_348_ = 0; (i_348_ ^ 0xffffffff) > (is_347_.length ^ 0xffffffff); i_348_++) {
							Class14 class14 = aClass14Array5872[is_347_[i_348_]];
							class14.anInt212 += i_262_;
							class14.anInt213 += i_263_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray5892 != null) {
				for (int i_349_ = 0; (i_349_ ^ 0xffffffff) > (i_266_ ^ 0xffffffff); i_349_++) {
					int i_350_ = is[i_349_];
					if ((i_350_ ^ 0xffffffff) > (anIntArrayArray5892.length ^ 0xffffffff)) {
						int[] is_351_ = anIntArrayArray5892[i_350_];
						for (int i_352_ = 0; (i_352_ ^ 0xffffffff) > (is_351_.length ^ 0xffffffff); i_352_++) {
							Class14 class14 = aClass14Array5872[is_351_[i_352_]];
							class14.anInt218 = i_262_ * class14.anInt218 >> 7;
							class14.anInt216 = i_263_ * class14.anInt216 >> 7;
						}
					}
				}
			}
		} else if ((i ^ 0xffffffff) == -10 && anIntArrayArray5892 != null) {
			for (int i_353_ = 0; i_353_ < i_266_; i_353_++) {
				int i_354_ = is[i_353_];
				if (anIntArrayArray5892.length > i_354_) {
					int[] is_355_ = anIntArrayArray5892[i_354_];
					for (int i_356_ = 0; (i_356_ ^ 0xffffffff) > (is_355_.length ^ 0xffffffff); i_356_++) {
						Class14 class14 = aClass14Array5872[is_355_[i_356_]];
						class14.anInt217 = 0x3fff & class14.anInt217 + i_262_;
					}
				}
			}
		}
	}
	
	final void v() {
		anInt5850++;
		for (int i = 0; (i ^ 0xffffffff) > (anInt5912 ^ 0xffffffff); i++)
			anIntArray5913[i] = -anIntArray5913[i];
		for (int i = 0; (anInt5885 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			aShortArray5794[i] = (short) -aShortArray5794[i];
		for (int i = 0; anInt5813 > i; i++) {
			short s = aShortArray5841[i];
			aShortArray5841[i] = aShortArray5906[i];
			aShortArray5906[i] = s;
		}
		method689(4259);
		method694(-1);
		method702(-115);
		aBoolean5891 = false;
	}
	
	final int EA() {
		if (!aBoolean5891) {
			method701((byte) 83);
		}
		anInt5839++;
		return anInt5821;
	}
	
	final void I(int i, int[] is, int i_357_, int i_358_, int i_359_, boolean bool, int i_360_, int[] is_361_) {
		anInt5798++;
		int i_362_ = is.length;
		if (i == 0) {
			i_359_ <<= 4;
			i_358_ <<= 4;
			i_357_ <<= 4;
			Class270_Sub2_Sub2.anInt10557 = 0;
			Class210.anInt2498 = 0;
			Class146.anInt1817 = 0;
			int i_363_ = 0;
			for (int i_364_ = 0; i_364_ < i_362_; i_364_++) {
				int i_365_ = is[i_364_];
				if (anIntArrayArray5847.length > i_365_) {
					int[] is_366_ = anIntArrayArray5847[i_365_];
					for (int i_367_ = 0; i_367_ < is_366_.length; i_367_++) {
						int i_368_ = is_366_[i_367_];
						if (aShortArray5814 == null || (aShortArray5814[i_368_] & i_360_ ^ 0xffffffff) != -1) {
							Class146.anInt1817 += anIntArray5879[i_368_];
							Class270_Sub2_Sub2.anInt10557 += anIntArray5897[i_368_];
							i_363_++;
							Class210.anInt2498 += anIntArray5913[i_368_];
						}
					}
				}
			}
			if (i_363_ <= 0) {
				Class270_Sub2_Sub2.anInt10557 = i_358_;
				Class146.anInt1817 = i_357_;
				Class210.anInt2498 = i_359_;
			} else {
				Class146.aBoolean1814 = true;
				Class146.anInt1817 = Class146.anInt1817 / i_363_ + i_357_;
				Class270_Sub2_Sub2.anInt10557 = i_358_ + Class270_Sub2_Sub2.anInt10557 / i_363_;
				Class210.anInt2498 = i_359_ + Class210.anInt2498 / i_363_;
			}
		} else if ((i ^ 0xffffffff) == -2) {
			if (is_361_ != null) {
				int i_369_ = is_361_[2] * i_359_ + is_361_[0] * i_357_ - (-(is_361_[1] * i_358_) - 8192) >> 14;
				int i_370_ = is_361_[4] * i_358_ + (is_361_[3] * i_357_ + is_361_[5] * i_359_) - -8192 >> 14;
				int i_371_ = 8192 + (is_361_[8] * i_359_ + is_361_[6] * i_357_ - -(i_358_ * is_361_[7])) >> 14;
				i_359_ = i_371_;
				i_358_ = i_370_;
				i_357_ = i_369_;
			}
			i_359_ <<= 4;
			i_357_ <<= 4;
			i_358_ <<= 4;
			for (int i_372_ = 0; (i_372_ ^ 0xffffffff) > (i_362_ ^ 0xffffffff); i_372_++) {
				int i_373_ = is[i_372_];
				if (i_373_ < anIntArrayArray5847.length) {
					int[] is_374_ = anIntArrayArray5847[i_373_];
					for (int i_375_ = 0; (i_375_ ^ 0xffffffff) > (is_374_.length ^ 0xffffffff); i_375_++) {
						int i_376_ = is_374_[i_375_];
						if (aShortArray5814 == null || (i_360_ & aShortArray5814[i_376_] ^ 0xffffffff) != -1) {
							anIntArray5879[i_376_] += i_357_;
							anIntArray5897[i_376_] += i_358_;
							anIntArray5913[i_376_] += i_359_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_361_ != null) {
				int i_377_ = is_361_[9] << 4;
				int i_378_ = is_361_[10] << 4;
				int i_379_ = is_361_[11] << 4;
				int i_380_ = is_361_[12] << 4;
				int i_381_ = is_361_[13] << 4;
				int i_382_ = is_361_[14] << 4;
				if (Class146.aBoolean1814) {
					int i_383_ = Class210.anInt2498 * is_361_[6] + Class270_Sub2_Sub2.anInt10557 * is_361_[3] + is_361_[0] * Class146.anInt1817 - -8192 >> 14;
					int i_384_ = 8192 + (is_361_[1] * Class146.anInt1817 + is_361_[4] * Class270_Sub2_Sub2.anInt10557 + Class210.anInt2498 * is_361_[7]) >> 14;
					int i_385_ = Class210.anInt2498 * is_361_[8] + (is_361_[5] * Class270_Sub2_Sub2.anInt10557 + Class146.anInt1817 * is_361_[2]) + 8192 >> 14;
					i_383_ += i_380_;
					i_384_ += i_381_;
					i_385_ += i_382_;
					Class146.anInt1817 = i_383_;
					Class270_Sub2_Sub2.anInt10557 = i_384_;
					Class146.aBoolean1814 = false;
					Class210.anInt2498 = i_385_;
				}
				int[] is_386_ = new int[9];
				int i_387_ = Class335.anIntArray4165[i_357_];
				int i_388_ = Class335.anIntArray4167[i_357_];
				int i_389_ = Class335.anIntArray4165[i_358_];
				int i_390_ = Class335.anIntArray4167[i_358_];
				int i_391_ = Class335.anIntArray4165[i_359_];
				int i_392_ = Class335.anIntArray4167[i_359_];
				int i_393_ = i_391_ * i_388_ - -8192 >> 14;
				int i_394_ = 8192 + i_388_ * i_392_ >> 14;
				is_386_[3] = 8192 + i_387_ * i_392_ >> 14;
				is_386_[1] = i_392_ * -i_389_ + (i_390_ * i_393_ - -8192) >> 14;
				is_386_[4] = i_391_ * i_387_ - -8192 >> 14;
				is_386_[8] = 8192 + i_387_ * i_389_ >> 14;
				is_386_[2] = 8192 + i_387_ * i_390_ >> 14;
				is_386_[5] = -i_388_;
				is_386_[7] = i_392_ * i_390_ + (i_393_ * i_389_ - -8192) >> 14;
				is_386_[0] = i_391_ * i_389_ + (i_390_ * i_394_ - -8192) >> 14;
				is_386_[6] = i_389_ * i_394_ + -i_390_ * i_391_ - -8192 >> 14;
				int i_395_ = is_386_[2] * -Class210.anInt2498 + (is_386_[1] * -Class270_Sub2_Sub2.anInt10557 + (is_386_[0] * -Class146.anInt1817 + 8192)) >> 14;
				int i_396_ = 8192 + -Class146.anInt1817 * is_386_[3] - (-(-Class270_Sub2_Sub2.anInt10557 * is_386_[4]) - -Class210.anInt2498 * is_386_[5]) >> 14;
				int i_397_ = -Class270_Sub2_Sub2.anInt10557 * is_386_[7] + -Class146.anInt1817 * is_386_[6] - (-(-Class210.anInt2498 * is_386_[8]) + -8192) >> 14;
				int i_398_ = i_395_ - -Class146.anInt1817;
				int i_399_ = i_396_ + Class270_Sub2_Sub2.anInt10557;
				int i_400_ = Class210.anInt2498 + i_397_;
				int[] is_401_ = new int[9];
				for (int i_402_ = 0; (i_402_ ^ 0xffffffff) > -4; i_402_++) {
					for (int i_403_ = 0; (i_403_ ^ 0xffffffff) > -4; i_403_++) {
						int i_404_ = 0;
						for (int i_405_ = 0; i_405_ < 3; i_405_++)
							i_404_ += is_361_[i_405_ + i_403_ * 3] * is_386_[i_402_ * 3 - -i_405_];
						is_401_[i_403_ + i_402_ * 3] = 8192 + i_404_ >> 14;
					}
				}
				int i_406_ = 8192 + i_381_ * is_386_[1] + (is_386_[0] * i_380_ + is_386_[2] * i_382_) >> 14;
				int i_407_ = i_380_ * is_386_[3] - -(i_381_ * is_386_[4]) - (-(i_382_ * is_386_[5]) + -8192) >> 14;
				i_406_ += i_398_;
				i_407_ += i_399_;
				int i_408_ = 8192 + (is_386_[7] * i_381_ + (is_386_[6] * i_380_ + i_382_ * is_386_[8])) >> 14;
				i_408_ += i_400_;
				int[] is_409_ = new int[9];
				for (int i_410_ = 0; (i_410_ ^ 0xffffffff) > -4; i_410_++) {
					for (int i_411_ = 0; i_411_ < 3; i_411_++) {
						int i_412_ = 0;
						for (int i_413_ = 0; (i_413_ ^ 0xffffffff) > -4; i_413_++)
							i_412_ += is_401_[i_413_ * 3 + i_411_] * is_361_[i_413_ + i_410_ * 3];
						is_409_[i_411_ + i_410_ * 3] = 8192 + i_412_ >> 14;
					}
				}
				int i_414_ = is_361_[1] * i_407_ + i_406_ * is_361_[0] + i_408_ * is_361_[2] + 8192 >> 14;
				int i_415_ = 8192 + (i_408_ * is_361_[5] + (i_406_ * is_361_[3] + i_407_ * is_361_[4])) >> 14;
				i_415_ += i_378_;
				i_414_ += i_377_;
				int i_416_ = 8192 + is_361_[8] * i_408_ + is_361_[6] * i_406_ - -(i_407_ * is_361_[7]) >> 14;
				i_416_ += i_379_;
				for (int i_417_ = 0; i_417_ < i_362_; i_417_++) {
					int i_418_ = is[i_417_];
					if (i_418_ < anIntArrayArray5847.length) {
						int[] is_419_ = anIntArrayArray5847[i_418_];
						for (int i_420_ = 0; (is_419_.length ^ 0xffffffff) < (i_420_ ^ 0xffffffff); i_420_++) {
							int i_421_ = is_419_[i_420_];
							if (aShortArray5814 == null || (aShortArray5814[i_421_] & i_360_) != 0) {
								int i_422_ = is_409_[2] * anIntArray5913[i_421_] + (is_409_[1] * anIntArray5897[i_421_] + anIntArray5879[i_421_] * is_409_[0]) + 8192 >> 14;
								int i_423_ = 8192 + (anIntArray5897[i_421_] * is_409_[4] + is_409_[3] * anIntArray5879[i_421_]) - -(anIntArray5913[i_421_] * is_409_[5]) >> 14;
								i_423_ += i_415_;
								i_422_ += i_414_;
								int i_424_ = anIntArray5879[i_421_] * is_409_[6] - (-(anIntArray5897[i_421_] * is_409_[7]) - anIntArray5913[i_421_] * is_409_[8] - 8192) >> 14;
								anIntArray5879[i_421_] = i_422_;
								i_424_ += i_416_;
								anIntArray5897[i_421_] = i_423_;
								anIntArray5913[i_421_] = i_424_;
							}
						}
					}
				}
			} else {
				for (int i_425_ = 0; i_362_ > i_425_; i_425_++) {
					int i_426_ = is[i_425_];
					if ((anIntArrayArray5847.length ^ 0xffffffff) < (i_426_ ^ 0xffffffff)) {
						int[] is_427_ = anIntArrayArray5847[i_426_];
						for (int i_428_ = 0; (i_428_ ^ 0xffffffff) > (is_427_.length ^ 0xffffffff); i_428_++) {
							int i_429_ = is_427_[i_428_];
							if (aShortArray5814 == null || (i_360_ & aShortArray5814[i_429_] ^ 0xffffffff) != -1) {
								anIntArray5879[i_429_] -= Class146.anInt1817;
								anIntArray5897[i_429_] -= Class270_Sub2_Sub2.anInt10557;
								anIntArray5913[i_429_] -= Class210.anInt2498;
								if (i_359_ != 0) {
									int i_430_ = Class335.anIntArray4167[i_359_];
									int i_431_ = Class335.anIntArray4165[i_359_];
									int i_432_ = anIntArray5897[i_429_] * i_430_ - -(i_431_ * anIntArray5879[i_429_]) + 16383 >> 14;
									anIntArray5897[i_429_] = -(anIntArray5879[i_429_] * i_430_) + anIntArray5897[i_429_] * i_431_ + 16383 >> 14;
									anIntArray5879[i_429_] = i_432_;
								}
								if (i_357_ != 0) {
									int i_433_ = Class335.anIntArray4167[i_357_];
									int i_434_ = Class335.anIntArray4165[i_357_];
									int i_435_ = 16383 + i_434_ * anIntArray5897[i_429_] + -(i_433_ * anIntArray5913[i_429_]) >> 14;
									anIntArray5913[i_429_] = 16383 + (i_433_ * anIntArray5897[i_429_] + i_434_ * anIntArray5913[i_429_]) >> 14;
									anIntArray5897[i_429_] = i_435_;
								}
								if ((i_358_ ^ 0xffffffff) != -1) {
									int i_436_ = Class335.anIntArray4167[i_358_];
									int i_437_ = Class335.anIntArray4165[i_358_];
									int i_438_ = 16383 + (anIntArray5913[i_429_] * i_436_ + i_437_ * anIntArray5879[i_429_]) >> 14;
									anIntArray5913[i_429_] = 16383 + (-(i_436_ * anIntArray5879[i_429_]) + anIntArray5913[i_429_] * i_437_) >> 14;
									anIntArray5879[i_429_] = i_438_;
								}
								anIntArray5879[i_429_] += Class146.anInt1817;
								anIntArray5897[i_429_] += Class270_Sub2_Sub2.anInt10557;
								anIntArray5913[i_429_] += Class210.anInt2498;
							}
						}
					}
				}
				if (bool) {
					for (int i_439_ = 0; (i_439_ ^ 0xffffffff) > (i_362_ ^ 0xffffffff); i_439_++) {
						int i_440_ = is[i_439_];
						if ((i_440_ ^ 0xffffffff) > (anIntArrayArray5847.length ^ 0xffffffff)) {
							int[] is_441_ = anIntArrayArray5847[i_440_];
							for (int i_442_ = 0; (is_441_.length ^ 0xffffffff) < (i_442_ ^ 0xffffffff); i_442_++) {
								int i_443_ = is_441_[i_442_];
								if (aShortArray5814 == null || (i_360_ & aShortArray5814[i_443_] ^ 0xffffffff) != -1) {
									int i_444_ = anIntArray5911[i_443_];
									int i_445_ = anIntArray5911[1 + i_443_];
									for (int i_446_ = i_444_; i_445_ > i_446_; i_446_++) {
										int i_447_ = aShortArray5899[i_446_] - 1;
										if ((i_447_ ^ 0xffffffff) == 0) {
											break;
										}
										if (i_359_ != 0) {
											int i_448_ = Class335.anIntArray4167[i_359_];
											int i_449_ = Class335.anIntArray4165[i_359_];
											int i_450_ = i_449_ * aShortArray5889[i_447_] + i_448_ * aShortArray5898[i_447_] + 16383 >> 14;
											aShortArray5898[i_447_] = (short) (-(aShortArray5889[i_447_] * i_448_) + i_449_ * aShortArray5898[i_447_] - -16383 >> 14);
											aShortArray5889[i_447_] = (short) i_450_;
										}
										if (i_357_ != 0) {
											int i_451_ = Class335.anIntArray4167[i_357_];
											int i_452_ = Class335.anIntArray4165[i_357_];
											int i_453_ = aShortArray5898[i_447_] * i_452_ - i_451_ * aShortArray5794[i_447_] + 16383 >> 14;
											aShortArray5794[i_447_] = (short) (16383 + aShortArray5898[i_447_] * i_451_ + aShortArray5794[i_447_] * i_452_ >> 14);
											aShortArray5898[i_447_] = (short) i_453_;
										}
										if (i_358_ != 0) {
											int i_454_ = Class335.anIntArray4167[i_358_];
											int i_455_ = Class335.anIntArray4165[i_358_];
											int i_456_ = i_454_ * aShortArray5794[i_447_] - -(i_455_ * aShortArray5889[i_447_]) + 16383 >> 14;
											aShortArray5794[i_447_] = (short) (aShortArray5794[i_447_] * i_455_ + -(i_454_ * aShortArray5889[i_447_]) - -16383 >> 14);
											aShortArray5889[i_447_] = (short) i_456_;
										}
									}
								}
							}
						}
					}
					method694(-1);
				}
			}
		} else if (i == 3) {
			if (is_361_ != null) {
				int i_457_ = is_361_[9] << 4;
				int i_458_ = is_361_[10] << 4;
				int i_459_ = is_361_[11] << 4;
				int i_460_ = is_361_[12] << 4;
				int i_461_ = is_361_[13] << 4;
				int i_462_ = is_361_[14] << 4;
				if (Class146.aBoolean1814) {
					int i_463_ = is_361_[6] * Class210.anInt2498 + (is_361_[0] * Class146.anInt1817 + (Class270_Sub2_Sub2.anInt10557 * is_361_[3] - -8192)) >> 14;
					int i_464_ = 8192 + is_361_[4] * Class270_Sub2_Sub2.anInt10557 + (Class146.anInt1817 * is_361_[1] - -(Class210.anInt2498 * is_361_[7])) >> 14;
					i_463_ += i_460_;
					i_464_ += i_461_;
					int i_465_ = 8192 + (Class210.anInt2498 * is_361_[8] + (is_361_[5] * Class270_Sub2_Sub2.anInt10557 + Class146.anInt1817 * is_361_[2])) >> 14;
					Class146.anInt1817 = i_463_;
					Class270_Sub2_Sub2.anInt10557 = i_464_;
					i_465_ += i_462_;
					Class146.aBoolean1814 = false;
					Class210.anInt2498 = i_465_;
				}
				int i_466_ = i_357_ << 15 >> 7;
				int i_467_ = i_358_ << 15 >> 7;
				int i_468_ = i_359_ << 15 >> 7;
				int i_469_ = i_466_ * -Class146.anInt1817 - -8192 >> 14;
				int i_470_ = -Class270_Sub2_Sub2.anInt10557 * i_467_ - -8192 >> 14;
				int i_471_ = 8192 + i_468_ * -Class210.anInt2498 >> 14;
				int i_472_ = Class146.anInt1817 + i_469_;
				int i_473_ = Class270_Sub2_Sub2.anInt10557 + i_470_;
				int i_474_ = i_471_ - -Class210.anInt2498;
				int[] is_475_ = new int[9];
				is_475_[1] = is_361_[3] * i_466_ - -8192 >> 14;
				is_475_[2] = 8192 + is_361_[6] * i_466_ >> 14;
				is_475_[0] = 8192 + is_361_[0] * i_466_ >> 14;
				is_475_[3] = is_361_[1] * i_467_ - -8192 >> 14;
				is_475_[6] = is_361_[2] * i_468_ - -8192 >> 14;
				is_475_[4] = 8192 + i_467_ * is_361_[4] >> 14;
				is_475_[5] = is_361_[7] * i_467_ + 8192 >> 14;
				is_475_[7] = 8192 + i_468_ * is_361_[5] >> 14;
				is_475_[8] = 8192 + is_361_[8] * i_468_ >> 14;
				int i_476_ = i_466_ * i_460_ + 8192 >> 14;
				int i_477_ = 8192 + i_467_ * i_461_ >> 14;
				int i_478_ = 8192 + i_468_ * i_462_ >> 14;
				i_476_ += i_472_;
				i_477_ += i_473_;
				i_478_ += i_474_;
				int[] is_479_ = new int[9];
				for (int i_480_ = 0; i_480_ < 3; i_480_++) {
					for (int i_481_ = 0; i_481_ < 3; i_481_++) {
						int i_482_ = 0;
						for (int i_483_ = 0; i_483_ < 3; i_483_++)
							i_482_ += is_361_[3 * i_480_ - -i_483_] * is_475_[i_481_ + 3 * i_483_];
						is_479_[3 * i_480_ + i_481_] = 8192 + i_482_ >> 14;
					}
				}
				int i_484_ = 8192 + (is_361_[1] * i_477_ + is_361_[0] * i_476_ - -(i_478_ * is_361_[2])) >> 14;
				int i_485_ = is_361_[5] * i_478_ + i_476_ * is_361_[3] - (-(i_477_ * is_361_[4]) - 8192) >> 14;
				int i_486_ = i_477_ * is_361_[7] + i_476_ * is_361_[6] - -(is_361_[8] * i_478_) + 8192 >> 14;
				i_484_ += i_457_;
				i_485_ += i_458_;
				i_486_ += i_459_;
				for (int i_487_ = 0; i_487_ < i_362_; i_487_++) {
					int i_488_ = is[i_487_];
					if ((anIntArrayArray5847.length ^ 0xffffffff) < (i_488_ ^ 0xffffffff)) {
						int[] is_489_ = anIntArrayArray5847[i_488_];
						for (int i_490_ = 0; is_489_.length > i_490_; i_490_++) {
							int i_491_ = is_489_[i_490_];
							if (aShortArray5814 == null || (i_360_ & aShortArray5814[i_491_] ^ 0xffffffff) != -1) {
								int i_492_ = anIntArray5913[i_491_] * is_479_[2] + (anIntArray5879[i_491_] * is_479_[0] - -(is_479_[1] * anIntArray5897[i_491_]) - -8192) >> 14;
								int i_493_ = 8192 + (is_479_[4] * anIntArray5897[i_491_] + anIntArray5879[i_491_] * is_479_[3]) + anIntArray5913[i_491_] * is_479_[5] >> 14;
								i_492_ += i_484_;
								i_493_ += i_485_;
								int i_494_ = is_479_[8] * anIntArray5913[i_491_] + is_479_[6] * anIntArray5879[i_491_] + anIntArray5897[i_491_] * is_479_[7] + 8192 >> 14;
								anIntArray5879[i_491_] = i_492_;
								i_494_ += i_486_;
								anIntArray5897[i_491_] = i_493_;
								anIntArray5913[i_491_] = i_494_;
							}
						}
					}
				}
			} else {
				for (int i_495_ = 0; (i_495_ ^ 0xffffffff) > (i_362_ ^ 0xffffffff); i_495_++) {
					int i_496_ = is[i_495_];
					if ((anIntArrayArray5847.length ^ 0xffffffff) < (i_496_ ^ 0xffffffff)) {
						int[] is_497_ = anIntArrayArray5847[i_496_];
						for (int i_498_ = 0; is_497_.length > i_498_; i_498_++) {
							int i_499_ = is_497_[i_498_];
							if (aShortArray5814 == null || (i_360_ & aShortArray5814[i_499_]) != 0) {
								anIntArray5879[i_499_] -= Class146.anInt1817;
								anIntArray5897[i_499_] -= Class270_Sub2_Sub2.anInt10557;
								anIntArray5913[i_499_] -= Class210.anInt2498;
								anIntArray5879[i_499_] = anIntArray5879[i_499_] * i_357_ >> 7;
								anIntArray5897[i_499_] = i_358_ * anIntArray5897[i_499_] >> 7;
								anIntArray5913[i_499_] = i_359_ * anIntArray5913[i_499_] >> 7;
								anIntArray5879[i_499_] += Class146.anInt1817;
								anIntArray5897[i_499_] += Class270_Sub2_Sub2.anInt10557;
								anIntArray5913[i_499_] += Class210.anInt2498;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray5900 != null) {
				boolean bool_500_ = false;
				for (int i_501_ = 0; i_501_ < i_362_; i_501_++) {
					int i_502_ = is[i_501_];
					if ((i_502_ ^ 0xffffffff) > (anIntArrayArray5900.length ^ 0xffffffff)) {
						int[] is_503_ = anIntArrayArray5900[i_502_];
						for (int i_504_ = 0; is_503_.length > i_504_; i_504_++) {
							int i_505_ = is_503_[i_504_];
							if (aShortArray5861 == null || (i_360_ & aShortArray5861[i_505_]) != 0) {
								int i_506_ = (0xff & aByteArray5886[i_505_]) - -(i_357_ * 8);
								if ((i_506_ ^ 0xffffffff) <= -1) {
									if (i_506_ > 255) {
										i_506_ = 255;
									}
								} else {
									i_506_ = 0;
								}
								aByteArray5886[i_505_] = (byte) i_506_;
							}
						}
						bool_500_ = bool_500_ | (is_503_.length ^ 0xffffffff) < -1;
					}
				}
				if (bool_500_) {
					if (aClass268Array5856 != null) {
						for (int i_507_ = 0; (i_507_ ^ 0xffffffff) > (anInt5811 ^ 0xffffffff); i_507_++) {
							Class268 class268 = aClass268Array5856[i_507_];
							Class14 class14 = aClass14Array5872[i_507_];
							class14.anInt220 = -(0xff & aByteArray5886[class268.anInt3456]) + 255 << 24 | class14.anInt220 & 0xffffff;
						}
					}
					method703(0);
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray5900 != null) {
				boolean bool_508_ = false;
				for (int i_509_ = 0; (i_362_ ^ 0xffffffff) < (i_509_ ^ 0xffffffff); i_509_++) {
					int i_510_ = is[i_509_];
					if (i_510_ < anIntArrayArray5900.length) {
						int[] is_511_ = anIntArrayArray5900[i_510_];
						for (int i_512_ = 0; (is_511_.length ^ 0xffffffff) < (i_512_ ^ 0xffffffff); i_512_++) {
							int i_513_ = is_511_[i_512_];
							if (aShortArray5861 == null || (aShortArray5861[i_513_] & i_360_ ^ 0xffffffff) != -1) {
								int i_514_ = 0xffff & aShortArray5802[i_513_];
								int i_515_ = (i_514_ & 0xffc7) >> 10;
								int i_516_ = i_514_ >> 7 & 0x7;
								int i_517_ = 0x7f & i_514_;
								i_516_ += i_358_ / 4;
								i_515_ = i_357_ + i_515_ & 0x3f;
								if (i_516_ >= 0) {
									if ((i_516_ ^ 0xffffffff) < -8) {
										i_516_ = 7;
									}
								} else {
									i_516_ = 0;
								}
								i_517_ += i_359_;
								if ((i_517_ ^ 0xffffffff) <= -1) {
									if (i_517_ > 127) {
										i_517_ = 127;
									}
								} else {
									i_517_ = 0;
								}
								aShortArray5802[i_513_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_516_ << 7, i_515_ << 10), i_517_);
							}
						}
						bool_508_ = bool_508_ | is_511_.length > 0;
					}
				}
				if (bool_508_) {
					if (aClass268Array5856 != null) {
						for (int i_518_ = 0; (anInt5811 ^ 0xffffffff) < (i_518_ ^ 0xffffffff); i_518_++) {
							Class268 class268 = aClass268Array5856[i_518_];
							Class14 class14 = aClass14Array5872[i_518_];
							class14.anInt220 = ~0xffffff & class14.anInt220 | Class85.anIntArray1158[aShortArray5802[class268.anInt3456] & 0xffff] & 0xffffff;
						}
					}
					method703(0);
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray5892 != null) {
				for (int i_519_ = 0; i_519_ < i_362_; i_519_++) {
					int i_520_ = is[i_519_];
					if (anIntArrayArray5892.length > i_520_) {
						int[] is_521_ = anIntArrayArray5892[i_520_];
						for (int i_522_ = 0; (i_522_ ^ 0xffffffff) > (is_521_.length ^ 0xffffffff); i_522_++) {
							Class14 class14 = aClass14Array5872[is_521_[i_522_]];
							class14.anInt213 += i_358_;
							class14.anInt212 += i_357_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray5892 != null) {
				for (int i_523_ = 0; i_523_ < i_362_; i_523_++) {
					int i_524_ = is[i_523_];
					if ((i_524_ ^ 0xffffffff) > (anIntArrayArray5892.length ^ 0xffffffff)) {
						int[] is_525_ = anIntArrayArray5892[i_524_];
						for (int i_526_ = 0; i_526_ < is_525_.length; i_526_++) {
							Class14 class14 = aClass14Array5872[is_525_[i_526_]];
							class14.anInt218 = i_357_ * class14.anInt218 >> 7;
							class14.anInt216 = i_358_ * class14.anInt216 >> 7;
						}
					}
				}
			}
		} else if (i == 9 && anIntArrayArray5892 != null) {
			for (int i_527_ = 0; i_527_ < i_362_; i_527_++) {
				int i_528_ = is[i_527_];
				if (i_528_ < anIntArrayArray5892.length) {
					int[] is_529_ = anIntArrayArray5892[i_528_];
					for (int i_530_ = 0; (is_529_.length ^ 0xffffffff) < (i_530_ ^ 0xffffffff); i_530_++) {
						Class14 class14 = aClass14Array5872[is_529_[i_530_]];
						class14.anInt217 = 0x3fff & i_357_ + class14.anInt217;
					}
				}
			}
		}
	}
	
	private final void method694(int i) {
		anInt5873++;
		if ((anInt5896 & 0x37 ^ 0xffffffff) != i) {
			if (aClass347_5908 != null) {
				aClass347_5908.aBoolean4287 = false;
			}
		} else if (aClass347_5852 != null) {
			aClass347_5852.aBoolean4287 = false;
		}
	}
	
	final void method622(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i, int i_531_) {
		anInt5914++;
		if (anInt5885 != 0) {
			Class336_Sub1 class336_sub1 = anAbstractToolkit5916.aClass336_Sub1_6267;
			if (!aBoolean5891) {
				method701((byte) 109);
			}
			Class336_Sub1 class336_sub1_532_ = (Class336_Sub1) class336;
			Class60.aFloat883 = class336_sub1_532_.aFloat8542 * class336_sub1.aFloat8556 + (class336_sub1_532_.aFloat8550 * class336_sub1.aFloat8547 + class336_sub1.aFloat8508 * class336_sub1_532_.aFloat8521) + class336_sub1.aFloat8542;
			Class331.aFloat4140 = class336_sub1_532_.aFloat8531 * class336_sub1.aFloat8547 + class336_sub1_532_.aFloat8538 * class336_sub1.aFloat8508 + class336_sub1_532_.aFloat8508 * class336_sub1.aFloat8556;
			float f = Class331.aFloat4140 * (float) anInt5903 + Class60.aFloat883;
			float f_533_ = Class60.aFloat883 + (float) anInt5821 * Class331.aFloat4140;
			float f_534_;
			float f_535_;
			if (f_533_ < f) {
				f_535_ = (float) -anInt5797 + f_533_;
				f_534_ = (float) anInt5797 + f;
			} else {
				f_534_ = f_533_ + (float) anInt5797;
				f_535_ = f - (float) anInt5797;
			}
			if (!(anAbstractToolkit5916.aFloat6371 <= f_535_) && !(f_534_ <= (float) anAbstractToolkit5916.anInt6364)) {
				Class147.aFloat1824 = class336_sub1_532_.aFloat8542 * class336_sub1.aFloat8529 + (class336_sub1.aFloat8531 * class336_sub1_532_.aFloat8521 + class336_sub1.aFloat8530 * class336_sub1_532_.aFloat8550) + class336_sub1.aFloat8550;
				Class12.aFloat199 = class336_sub1.aFloat8529 * class336_sub1_532_.aFloat8508 + (class336_sub1.aFloat8531 * class336_sub1_532_.aFloat8538 + class336_sub1_532_.aFloat8531 * class336_sub1.aFloat8530);
				float f_536_ = Class12.aFloat199 * (float) anInt5903 + Class147.aFloat1824;
				float f_537_ = Class147.aFloat1824 + (float) anInt5821 * Class12.aFloat199;
				float f_538_;
				float f_539_;
				if (!(f_536_ > f_537_)) {
					f_538_ = (f_536_ - (float) anInt5797) * (float) anAbstractToolkit5916.anInt6289;
					f_539_ = (float) anAbstractToolkit5916.anInt6289 * (f_537_ + (float) anInt5797);
				} else {
					f_538_ = ((float) -anInt5797 + f_537_) * (float) anAbstractToolkit5916.anInt6289;
					f_539_ = (float) anAbstractToolkit5916.anInt6289 * ((float) anInt5797 + f_536_);
				}
				if (!(f_538_ / (float) i >= anAbstractToolkit5916.aFloat6317) && !(f_539_ / (float) i <= anAbstractToolkit5916.aFloat6298)) {
					Node_Sub36_Sub4.aFloat10072 = class336_sub1_532_.aFloat8538 * class336_sub1.aFloat8538 + class336_sub1_532_.aFloat8531 * class336_sub1.aFloat8544 + class336_sub1.aFloat8535 * class336_sub1_532_.aFloat8508;
					Node_Sub38_Sub37.aFloat10464 = class336_sub1.aFloat8521 + (class336_sub1.aFloat8544 * class336_sub1_532_.aFloat8550 + class336_sub1.aFloat8538 * class336_sub1_532_.aFloat8521 + class336_sub1.aFloat8535 * class336_sub1_532_.aFloat8542);
					float f_540_ = Node_Sub38_Sub37.aFloat10464 + (float) anInt5903 * Node_Sub36_Sub4.aFloat10072;
					float f_541_ = (float) anInt5821 * Node_Sub36_Sub4.aFloat10072 + Node_Sub38_Sub37.aFloat10464;
					float f_542_;
					float f_543_;
					if (f_540_ > f_541_) {
						f_543_ = (f_540_ + (float) anInt5797) * (float) anAbstractToolkit5916.anInt6362;
						f_542_ = (float) anAbstractToolkit5916.anInt6362 * ((float) -anInt5797 + f_541_);
					} else {
						f_542_ = (float) anAbstractToolkit5916.anInt6362 * ((float) -anInt5797 + f_540_);
						f_543_ = (f_541_ + (float) anInt5797) * (float) anAbstractToolkit5916.anInt6362;
					}
					if (!(anAbstractToolkit5916.aFloat6308 <= f_542_ / (float) i) && !(anAbstractToolkit5916.aFloat6282 >= f_543_ / (float) i)) {
						if (entitynode_sub5 != null || aClass268Array5856 != null) {
							Node_Sub27.aFloat7310 = class336_sub1_532_.aFloat8530 * class336_sub1.aFloat8544 + class336_sub1.aFloat8538 * class336_sub1_532_.aFloat8544 + class336_sub1.aFloat8535 * class336_sub1_532_.aFloat8547;
							Node_Sub15_Sub7.aFloat9821 = class336_sub1.aFloat8547 * class336_sub1_532_.aFloat8530 + class336_sub1_532_.aFloat8544 * class336_sub1.aFloat8508 + class336_sub1_532_.aFloat8547 * class336_sub1.aFloat8556;
							Class51_Sub2.aFloat9074 = class336_sub1_532_.aFloat8529 * class336_sub1.aFloat8544 + class336_sub1_532_.aFloat8535 * class336_sub1.aFloat8538 + class336_sub1_532_.aFloat8556 * class336_sub1.aFloat8535;
							Class37.aFloat558 = class336_sub1.aFloat8529 * class336_sub1_532_.aFloat8556 + (class336_sub1_532_.aFloat8529 * class336_sub1.aFloat8530 + class336_sub1.aFloat8531 * class336_sub1_532_.aFloat8535);
							Class163.aFloat2013 = class336_sub1.aFloat8531 * class336_sub1_532_.aFloat8544 + class336_sub1_532_.aFloat8530 * class336_sub1.aFloat8530 + class336_sub1_532_.aFloat8547 * class336_sub1.aFloat8529;
							Class262_Sub14.aFloat7810 = class336_sub1_532_.aFloat8556 * class336_sub1.aFloat8556 + (class336_sub1_532_.aFloat8529 * class336_sub1.aFloat8547 + class336_sub1.aFloat8508 * class336_sub1_532_.aFloat8535);
						}
						if (entitynode_sub5 != null) {
							int i_544_ = anInt5815 + anInt5825 >> 1;
							int i_545_ = anInt5909 + anInt5883 >> 1;
							int i_546_ = (int) ((float) i_545_ * Class37.aFloat558 + ((float) i_544_ * Class163.aFloat2013 + Class147.aFloat1824 + Class12.aFloat199 * (float) anInt5903));
							int i_547_ = (int) ((float) i_544_ * Node_Sub27.aFloat7310 + Node_Sub38_Sub37.aFloat10464 + (float) anInt5903 * Node_Sub36_Sub4.aFloat10072 + Class51_Sub2.aFloat9074 * (float) i_545_);
							int i_548_ = (int) (Class60.aFloat883 + Node_Sub15_Sub7.aFloat9821 * (float) i_544_ + (float) anInt5903 * Class331.aFloat4140 + Class262_Sub14.aFloat7810 * (float) i_545_);
							int i_549_ = (int) (Class147.aFloat1824 + (float) i_544_ * Class163.aFloat2013 + (float) anInt5821 * Class12.aFloat199 + Class37.aFloat558 * (float) i_545_);
							int i_550_ = (int) (Class51_Sub2.aFloat9074 * (float) i_545_ + ((float) i_544_ * Node_Sub27.aFloat7310 + Node_Sub38_Sub37.aFloat10464 + Node_Sub36_Sub4.aFloat10072 * (float) anInt5821));
							entitynode_sub5.anInt5982 = anAbstractToolkit5916.anInt6341 + anAbstractToolkit5916.anInt6289 * i_549_ / i;
							entitynode_sub5.anInt5984 = anAbstractToolkit5916.anInt6331 - -(i_550_ * anAbstractToolkit5916.anInt6362 / i);
							entitynode_sub5.anInt5986 = anAbstractToolkit5916.anInt6331 - -(anAbstractToolkit5916.anInt6362 * i_547_ / i);
							int i_551_ = (int) ((float) anInt5821 * Class331.aFloat4140 + (Class60.aFloat883 + Node_Sub15_Sub7.aFloat9821 * (float) i_544_) + Class262_Sub14.aFloat7810 * (float) i_545_);
							entitynode_sub5.anInt5985 = i_546_ * anAbstractToolkit5916.anInt6289 / i + anAbstractToolkit5916.anInt6341;
							if ((i_548_ ^ 0xffffffff) <= (anAbstractToolkit5916.anInt6364 ^ 0xffffffff) || anAbstractToolkit5916.anInt6364 <= i_551_) {
								entitynode_sub5.aBoolean5987 = true;
								entitynode_sub5.anInt5983 = -entitynode_sub5.anInt5985 + anAbstractToolkit5916.anInt6341 + (anInt5797 + i_546_) * anAbstractToolkit5916.anInt6289 / i;
							}
						}
						anAbstractToolkit5916.method1270((byte) -123, (float) i);
						anAbstractToolkit5916.method1335(true);
						anAbstractToolkit5916.method1248(class336_sub1_532_, true);
						method706(65535);
						method692(-449434265);
					}
				}
			}
		}
	}
	
	final int HA() {
		if (!aBoolean5891) {
			method701((byte) 92);
		}
		anInt5795++;
		return anInt5883;
	}
	
	private final short method695(int i, int i_552_, float f, int i_553_, int i_554_, int i_555_, int i_556_, float f_557_, long l, int i_558_, Model model) {
		anInt5801++;
		int i_559_ = anIntArray5911[i_553_];
		int i_560_ = anIntArray5911[i_553_ - -1];
		int i_561_ = 0;
		for (int i_562_ = i_559_; i_562_ < i_560_; i_562_++) {
			short s = aShortArray5899[i_562_];
			if (s == 0) {
				i_561_ = i_562_;
				break;
			}
			if (l == Class206.aLongArray2464[i_562_]) {
				return (short) (-1 + s);
			}
		}
		aShortArray5899[i_561_] = (short) (anInt5885 - -1);
		Class206.aLongArray2464[i_561_] = l;
		aShortArray5832[anInt5885] = (short) i_555_;
		aShortArray5890[anInt5885] = (short) i_553_;
		aShortArray5889[anInt5885] = (short) i_554_;
		aShortArray5898[anInt5885] = (short) i_558_;
		aShortArray5794[anInt5885] = (short) i;
		aByteArray5834[anInt5885] = (byte) i_552_;
		if (i_556_ != 2971) {
			return (short) 84;
		}
		aFloatArray5875[anInt5885] = f;
		aFloatArray5860[anInt5885] = f_557_;
		return (short) anInt5885++;
	}
	
	final boolean NA() {
		anInt5887++;
		if (anIntArrayArray5847 == null) {
			return false;
		}
		for (int i = 0; anInt5902 > i; i++) {
			anIntArray5879[i] <<= 4;
			anIntArray5897[i] <<= 4;
			anIntArray5913[i] <<= 4;
		}
		Class210.anInt2498 = 0;
		Class146.anInt1817 = 0;
		Class270_Sub2_Sub2.anInt10557 = 0;
		return true;
	}
	
	private final boolean method696(int i, int i_563_, int i_564_, byte b, int i_565_, int i_566_, int i_567_, int i_568_, int i_569_) {
		anInt5904++;
		if (i_566_ < i_564_ && i > i_566_ && (i_569_ ^ 0xffffffff) < (i_566_ ^ 0xffffffff)) {
			return false;
		}
		if (i_564_ < i_566_ && i_566_ > i && (i_566_ ^ 0xffffffff) < (i_569_ ^ 0xffffffff)) {
			return false;
		}
		if (i_568_ > i_563_ && (i_563_ ^ 0xffffffff) > (i_567_ ^ 0xffffffff) && i_565_ > i_563_) {
			return false;
		}
		if (b != 37) {
			return false;
		}
        return !(i_568_ < i_563_ && (i_567_ ^ 0xffffffff) > (i_563_ ^ 0xffffffff) && (i_565_ ^ 0xffffffff) > (i_563_ ^ 0xffffffff));
    }
	
	final void C(int i) {
		aShort5868 = (short) i;
		anInt5869++;
		method703(0);
	}
	
	final int ua() {
		anInt5915++;
		return anInt5881;
	}
	
	final void FA(int i) {
		anInt5810++;
		int i_570_ = Class335.anIntArray4167[i];
		int i_571_ = Class335.anIntArray4165[i];
		for (int i_572_ = 0; (i_572_ ^ 0xffffffff) > (anInt5912 ^ 0xffffffff); i_572_++) {
			int i_573_ = -(i_570_ * anIntArray5913[i_572_]) + anIntArray5897[i_572_] * i_571_ >> 14;
			anIntArray5913[i_572_] = i_571_ * anIntArray5913[i_572_] + i_570_ * anIntArray5897[i_572_] >> 14;
			anIntArray5897[i_572_] = i_573_;
		}
		method689(4259);
		aBoolean5891 = false;
	}
	
	final void method629() {
		anInt5870++;
	}
	
	final int V() {
		anInt5799++;
		if (!aBoolean5891) {
			method701((byte) 114);
		}
		return anInt5825;
	}
	
	final void k(int i) {
		anInt5854++;
		int i_574_ = Class335.anIntArray4167[i];
		int i_575_ = Class335.anIntArray4165[i];
		for (int i_576_ = 0; i_576_ < anInt5912; i_576_++) {
			int i_577_ = i_574_ * anIntArray5913[i_576_] + anIntArray5879[i_576_] * i_575_ >> 14;
			anIntArray5913[i_576_] = -(anIntArray5879[i_576_] * i_574_) + i_575_ * anIntArray5913[i_576_] >> 14;
			anIntArray5879[i_576_] = i_577_;
		}
		for (int i_578_ = 0; anInt5885 > i_578_; i_578_++) {
			int i_579_ = i_575_ * aShortArray5889[i_578_] + aShortArray5794[i_578_] * i_574_ >> 14;
			aShortArray5794[i_578_] = (short) (aShortArray5794[i_578_] * i_575_ + -(i_574_ * aShortArray5889[i_578_]) >> 14);
			aShortArray5889[i_578_] = (short) i_579_;
		}
		method689(4259);
		method694(-1);
		aBoolean5891 = false;
	}
	
	final void method617() {
		anInt5910++;
		if ((anInt5885 ^ 0xffffffff) < -1 && anInt5859 > 0) {
			method688((byte) 110);
			method691(0);
			method698(262144);
		}
	}
	
	final boolean method612() {
		anInt5837++;
		if (aShortArray5862 == null) {
			return true;
		}
		for (int i = 0; (i ^ 0xffffffff) > (aShortArray5862.length ^ 0xffffffff); i++) {
			if (aShortArray5862[i] != -1 && !anAbstractToolkit5916.aD1543.method7(9900, aShortArray5862[i])) {
				return false;
			}
		}
		return true;
	}
	
	final void method611(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i) {
		anInt5816++;
		if (anInt5885 != 0) {
			Class336_Sub1 class336_sub1 = anAbstractToolkit5916.aClass336_Sub1_6267;
			if (!aBoolean5891) {
				method701((byte) 115);
			}
			Class336_Sub1 class336_sub1_580_ = (Class336_Sub1) class336;
			Class60.aFloat883 = class336_sub1.aFloat8556 * class336_sub1_580_.aFloat8542 + (class336_sub1.aFloat8547 * class336_sub1_580_.aFloat8550 + class336_sub1.aFloat8508 * class336_sub1_580_.aFloat8521) + class336_sub1.aFloat8542;
			Class331.aFloat4140 = class336_sub1_580_.aFloat8538 * class336_sub1.aFloat8508 + class336_sub1.aFloat8547 * class336_sub1_580_.aFloat8531 + class336_sub1.aFloat8556 * class336_sub1_580_.aFloat8508;
			float f = Class60.aFloat883 + Class331.aFloat4140 * (float) anInt5903;
			float f_581_ = Class60.aFloat883 + (float) anInt5821 * Class331.aFloat4140;
			float f_582_;
			float f_583_;
			if (!(f_581_ < f)) {
				f_582_ = f - (float) anInt5797;
				f_583_ = (float) anInt5797 + f_581_;
			} else {
				f_582_ = (float) -anInt5797 + f_581_;
				f_583_ = f + (float) anInt5797;
			}
			if (!(f_582_ >= anAbstractToolkit5916.aFloat6302) && !((float) anAbstractToolkit5916.anInt6364 >= f_583_)) {
				Class12.aFloat199 = class336_sub1_580_.aFloat8538 * class336_sub1.aFloat8531 + class336_sub1.aFloat8530 * class336_sub1_580_.aFloat8531 + class336_sub1.aFloat8529 * class336_sub1_580_.aFloat8508;
				Class147.aFloat1824 = class336_sub1.aFloat8550 + (class336_sub1.aFloat8530 * class336_sub1_580_.aFloat8550 + class336_sub1.aFloat8531 * class336_sub1_580_.aFloat8521 + class336_sub1_580_.aFloat8542 * class336_sub1.aFloat8529);
				float f_584_ = Class147.aFloat1824 + Class12.aFloat199 * (float) anInt5903;
				float f_585_ = Class147.aFloat1824 + (float) anInt5821 * Class12.aFloat199;
				float f_586_;
				float f_587_;
				if (f_584_ > f_585_) {
					f_587_ = (float) anAbstractToolkit5916.anInt6289 * (f_585_ - (float) anInt5797);
					f_586_ = (f_584_ + (float) anInt5797) * (float) anAbstractToolkit5916.anInt6289;
				} else {
					f_586_ = (float) anAbstractToolkit5916.anInt6289 * ((float) anInt5797 + f_585_);
					f_587_ = (float) anAbstractToolkit5916.anInt6289 * (f_584_ - (float) anInt5797);
				}
				if (!(f_587_ / f_583_ >= anAbstractToolkit5916.aFloat6317) && !(anAbstractToolkit5916.aFloat6298 >= f_586_ / f_583_)) {
					Node_Sub36_Sub4.aFloat10072 = class336_sub1_580_.aFloat8531 * class336_sub1.aFloat8544 + class336_sub1_580_.aFloat8538 * class336_sub1.aFloat8538 + class336_sub1_580_.aFloat8508 * class336_sub1.aFloat8535;
					Node_Sub38_Sub37.aFloat10464 = class336_sub1.aFloat8521 + (class336_sub1_580_.aFloat8521 * class336_sub1.aFloat8538 + class336_sub1_580_.aFloat8550 * class336_sub1.aFloat8544 + class336_sub1.aFloat8535 * class336_sub1_580_.aFloat8542);
					float f_588_ = Node_Sub38_Sub37.aFloat10464 + Node_Sub36_Sub4.aFloat10072 * (float) anInt5903;
					float f_589_ = (float) anInt5821 * Node_Sub36_Sub4.aFloat10072 + Node_Sub38_Sub37.aFloat10464;
					float f_590_;
					float f_591_;
					if (f_589_ < f_588_) {
						f_591_ = (float) anAbstractToolkit5916.anInt6362 * (f_589_ - (float) anInt5797);
						f_590_ = (float) anAbstractToolkit5916.anInt6362 * ((float) anInt5797 + f_588_);
					} else {
						f_590_ = (float) anAbstractToolkit5916.anInt6362 * (f_589_ + (float) anInt5797);
						f_591_ = (float) anAbstractToolkit5916.anInt6362 * (f_588_ - (float) anInt5797);
					}
					if (!(f_591_ / f_583_ >= anAbstractToolkit5916.aFloat6308) && !(f_590_ / f_583_ <= anAbstractToolkit5916.aFloat6282)) {
						if (entitynode_sub5 != null || aClass268Array5856 != null) {
							Class51_Sub2.aFloat9074 = class336_sub1.aFloat8535 * class336_sub1_580_.aFloat8556 + (class336_sub1_580_.aFloat8529 * class336_sub1.aFloat8544 + class336_sub1.aFloat8538 * class336_sub1_580_.aFloat8535);
							Class262_Sub14.aFloat7810 = class336_sub1.aFloat8547 * class336_sub1_580_.aFloat8529 + class336_sub1_580_.aFloat8535 * class336_sub1.aFloat8508 + class336_sub1.aFloat8556 * class336_sub1_580_.aFloat8556;
							Node_Sub27.aFloat7310 = class336_sub1.aFloat8535 * class336_sub1_580_.aFloat8547 + (class336_sub1.aFloat8544 * class336_sub1_580_.aFloat8530 + class336_sub1.aFloat8538 * class336_sub1_580_.aFloat8544);
							Node_Sub15_Sub7.aFloat9821 = class336_sub1.aFloat8556 * class336_sub1_580_.aFloat8547 + (class336_sub1.aFloat8508 * class336_sub1_580_.aFloat8544 + class336_sub1.aFloat8547 * class336_sub1_580_.aFloat8530);
							Class163.aFloat2013 = class336_sub1_580_.aFloat8544 * class336_sub1.aFloat8531 + class336_sub1_580_.aFloat8530 * class336_sub1.aFloat8530 + class336_sub1.aFloat8529 * class336_sub1_580_.aFloat8547;
							Class37.aFloat558 = class336_sub1.aFloat8529 * class336_sub1_580_.aFloat8556 + (class336_sub1.aFloat8530 * class336_sub1_580_.aFloat8529 + class336_sub1_580_.aFloat8535 * class336_sub1.aFloat8531);
						}
						if (entitynode_sub5 != null) {
							boolean bool = false;
							boolean bool_592_ = true;
							int i_593_ = anInt5825 + anInt5815 >> 1;
							int i_594_ = anInt5909 + anInt5883 >> 1;
							int i_595_ = (int) ((float) i_593_ * Class163.aFloat2013 + Class147.aFloat1824 + (float) anInt5903 * Class12.aFloat199 + Class37.aFloat558 * (float) i_594_);
							int i_596_ = (int) ((float) i_593_ * Node_Sub27.aFloat7310 + Node_Sub38_Sub37.aFloat10464 + Node_Sub36_Sub4.aFloat10072 * (float) anInt5903 + Class51_Sub2.aFloat9074 * (float) i_594_);
							int i_597_ = (int) (Class262_Sub14.aFloat7810 * (float) i_594_ + ((float) i_593_ * Node_Sub15_Sub7.aFloat9821 + Class60.aFloat883 + Class331.aFloat4140 * (float) anInt5903));
							if ((anAbstractToolkit5916.anInt6364 ^ 0xffffffff) >= (i_597_ ^ 0xffffffff)) {
								entitynode_sub5.anInt5986 = i_596_ * anAbstractToolkit5916.anInt6362 / i_597_ + anAbstractToolkit5916.anInt6331;
								entitynode_sub5.anInt5985 = anAbstractToolkit5916.anInt6341 - -(anAbstractToolkit5916.anInt6289 * i_595_ / i_597_);
							} else {
								bool = true;
							}
							int i_598_ = (int) (Class37.aFloat558 * (float) i_594_ + (Class163.aFloat2013 * (float) i_593_ + Class147.aFloat1824 + Class12.aFloat199 * (float) anInt5821));
							int i_599_ = (int) ((float) anInt5821 * Node_Sub36_Sub4.aFloat10072 + (Node_Sub27.aFloat7310 * (float) i_593_ + Node_Sub38_Sub37.aFloat10464) + Class51_Sub2.aFloat9074 * (float) i_594_);
							int i_600_ = (int) (Class331.aFloat4140 * (float) anInt5821 + (Node_Sub15_Sub7.aFloat9821 * (float) i_593_ + Class60.aFloat883) + (float) i_594_ * Class262_Sub14.aFloat7810);
							if ((anAbstractToolkit5916.anInt6364 ^ 0xffffffff) >= (i_600_ ^ 0xffffffff)) {
								entitynode_sub5.anInt5982 = anAbstractToolkit5916.anInt6341 - -(i_598_ * anAbstractToolkit5916.anInt6289 / i_600_);
								entitynode_sub5.anInt5984 = i_599_ * anAbstractToolkit5916.anInt6362 / i_600_ + anAbstractToolkit5916.anInt6331;
							} else {
								bool = true;
							}
							if (bool) {
								if ((i_597_ ^ 0xffffffff) <= (anAbstractToolkit5916.anInt6364 ^ 0xffffffff) || (i_600_ ^ 0xffffffff) <= (anAbstractToolkit5916.anInt6364 ^ 0xffffffff)) {
									if (i_597_ >= anAbstractToolkit5916.anInt6364) {
										if ((anAbstractToolkit5916.anInt6364 ^ 0xffffffff) < (i_600_ ^ 0xffffffff)) {
											int i_601_ = (-anAbstractToolkit5916.anInt6364 + i_597_ << 16) / (i_597_ - i_600_);
											int i_602_ = i_595_ + (i_601_ * (-i_598_ + i_595_) >> 16);
											int i_603_ = ((i_596_ + -i_599_) * i_601_ >> 16) + i_596_;
											entitynode_sub5.anInt5985 = anAbstractToolkit5916.anInt6341 - -(i_602_ * anAbstractToolkit5916.anInt6289 / anAbstractToolkit5916.anInt6364);
											entitynode_sub5.anInt5986 = anAbstractToolkit5916.anInt6362 * i_603_ / anAbstractToolkit5916.anInt6364 + anAbstractToolkit5916.anInt6331;
										}
									} else {
										int i_604_ = (-anAbstractToolkit5916.anInt6364 + i_600_ << 16) / (-i_597_ + i_600_);
										int i_605_ = i_598_ + ((-i_595_ + i_598_) * i_604_ >> 16);
										int i_606_ = (i_604_ * (i_599_ - i_596_) >> 16) + i_599_;
										entitynode_sub5.anInt5985 = i_605_ * anAbstractToolkit5916.anInt6289 / anAbstractToolkit5916.anInt6364 + anAbstractToolkit5916.anInt6341;
										entitynode_sub5.anInt5986 = anAbstractToolkit5916.anInt6331 + anAbstractToolkit5916.anInt6362 * i_606_ / anAbstractToolkit5916.anInt6364;
									}
								} else {
									bool_592_ = false;
								}
							}
							if (bool_592_) {
								if (i_600_ >= i_597_) {
									entitynode_sub5.anInt5983 = (anInt5797 + i_598_) * anAbstractToolkit5916.anInt6289 / i_600_ + (anAbstractToolkit5916.anInt6341 - entitynode_sub5.anInt5982);
								} else {
									entitynode_sub5.anInt5983 = anAbstractToolkit5916.anInt6341 - -(anAbstractToolkit5916.anInt6289 * (anInt5797 + i_595_) / i_597_) + -entitynode_sub5.anInt5985;
								}
								entitynode_sub5.aBoolean5987 = true;
							}
						}
						anAbstractToolkit5916.method1268(0);
						anAbstractToolkit5916.method1248(class336_sub1_580_, true);
						method706(65535);
						method692(-449434265);
					}
				}
			}
		}
	}
	
	private final DrawableModel method697(int i, StandardDrawableModel standarddrawablemodel_607_, boolean bool, boolean bool_608_, StandardDrawableModel standarddrawablemodel_609_, int i_610_) {
		standarddrawablemodel_609_.anInt5896 = anInt5896;
		standarddrawablemodel_609_.aShort5868 = aShort5868;
		standarddrawablemodel_609_.anInt5811 = anInt5811;
		standarddrawablemodel_609_.anInt5912 = anInt5912;
		anInt5871++;
		standarddrawablemodel_609_.aBoolean5866 = aBoolean5866;
		standarddrawablemodel_609_.anInt5859 = anInt5859;
		standarddrawablemodel_609_.aShort5843 = aShort5843;
		standarddrawablemodel_609_.anInt5813 = anInt5813;
		standarddrawablemodel_609_.anInt5885 = anInt5885;
		standarddrawablemodel_609_.anInt5902 = anInt5902;
		standarddrawablemodel_609_.anInt5881 = i;
		if ((0x100 & i) != 0) {
			standarddrawablemodel_609_.aBoolean5819 = true;
		} else {
			standarddrawablemodel_609_.aBoolean5819 = aBoolean5819;
		}
		boolean bool_611_ = Class320_Sub5.method3700(anInt5896, (byte) 127, i);
		boolean bool_612_ = Node_Sub38_Sub26.method2877(anInt5896, i, 125);
		boolean bool_613_ = Class321.method3800(i, anInt5896, 126);
		boolean bool_614_ = bool_611_ | bool_612_ | bool_613_;
		if (bool_614_) {
			if (bool_611_) {
				if (standarddrawablemodel_607_.anIntArray5879 == null || (standarddrawablemodel_607_.anIntArray5879.length ^ 0xffffffff) > (anInt5902 ^ 0xffffffff)) {
					standarddrawablemodel_609_.anIntArray5879 = standarddrawablemodel_607_.anIntArray5879 = new int[anInt5902];
				} else {
					standarddrawablemodel_609_.anIntArray5879 = standarddrawablemodel_607_.anIntArray5879;
				}
			} else {
				standarddrawablemodel_609_.anIntArray5879 = anIntArray5879;
			}
			if (bool_612_) {
				if (standarddrawablemodel_607_.anIntArray5897 == null || anInt5902 > standarddrawablemodel_607_.anIntArray5897.length) {
					standarddrawablemodel_609_.anIntArray5897 = standarddrawablemodel_607_.anIntArray5897 = new int[anInt5902];
				} else {
					standarddrawablemodel_609_.anIntArray5897 = standarddrawablemodel_607_.anIntArray5897;
				}
			} else {
				standarddrawablemodel_609_.anIntArray5897 = anIntArray5897;
			}
			if (bool_613_) {
				if (standarddrawablemodel_607_.anIntArray5913 != null && (standarddrawablemodel_607_.anIntArray5913.length ^ 0xffffffff) <= (anInt5902 ^ 0xffffffff)) {
					standarddrawablemodel_609_.anIntArray5913 = standarddrawablemodel_607_.anIntArray5913;
				} else {
					standarddrawablemodel_609_.anIntArray5913 = standarddrawablemodel_607_.anIntArray5913 = new int[anInt5902];
				}
			} else {
				standarddrawablemodel_609_.anIntArray5913 = anIntArray5913;
			}
			for (int i_615_ = 0; (i_615_ ^ 0xffffffff) > (anInt5902 ^ 0xffffffff); i_615_++) {
				if (bool_611_) {
					standarddrawablemodel_609_.anIntArray5879[i_615_] = anIntArray5879[i_615_];
				}
				if (bool_612_) {
					standarddrawablemodel_609_.anIntArray5897[i_615_] = anIntArray5897[i_615_];
				}
				if (bool_613_) {
					standarddrawablemodel_609_.anIntArray5913[i_615_] = anIntArray5913[i_615_];
				}
			}
		} else {
			standarddrawablemodel_609_.anIntArray5879 = anIntArray5879;
			standarddrawablemodel_609_.anIntArray5897 = anIntArray5897;
			standarddrawablemodel_609_.anIntArray5913 = anIntArray5913;
		}
		if (Class262_Sub15_Sub1.method3192(anInt5896, i, 512)) {
			standarddrawablemodel_609_.aClass347_5828 = standarddrawablemodel_607_.aClass347_5828;
			standarddrawablemodel_609_.aClass347_5828.anInterface15_Impl2_4288 = aClass347_5828.anInterface15_Impl2_4288;
			standarddrawablemodel_609_.aClass347_5828.aBoolean4287 = aClass347_5828.aBoolean4287;
			standarddrawablemodel_609_.aClass347_5828.aBoolean4285 = true;
		} else if (Class85.method999(anInt5896, i, (byte) -13)) {
			standarddrawablemodel_609_.aClass347_5828 = aClass347_5828;
		} else {
			standarddrawablemodel_609_.aClass347_5828 = null;
		}
		if (!Class46.method470(anInt5896, -10, i)) {
			standarddrawablemodel_609_.aShortArray5802 = aShortArray5802;
		} else {
			if (standarddrawablemodel_607_.aShortArray5802 != null && anInt5813 <= standarddrawablemodel_607_.aShortArray5802.length) {
				standarddrawablemodel_609_.aShortArray5802 = standarddrawablemodel_607_.aShortArray5802;
			} else {
				standarddrawablemodel_609_.aShortArray5802 = standarddrawablemodel_607_.aShortArray5802 = new short[anInt5813];
			}
			for (int i_616_ = 0; (i_616_ ^ 0xffffffff) > (anInt5813 ^ 0xffffffff); i_616_++)
				standarddrawablemodel_609_.aShortArray5802[i_616_] = aShortArray5802[i_616_];
		}
		if (Class234.method2150(anInt5896, i_610_ ^ ~0x100, i)) {
			if (standarddrawablemodel_607_.aByteArray5886 == null || (anInt5813 ^ 0xffffffff) < (standarddrawablemodel_607_.aByteArray5886.length ^ 0xffffffff)) {
				standarddrawablemodel_609_.aByteArray5886 = standarddrawablemodel_607_.aByteArray5886 = new byte[anInt5813];
			} else {
				standarddrawablemodel_609_.aByteArray5886 = standarddrawablemodel_607_.aByteArray5886;
			}
			for (int i_617_ = 0; (anInt5813 ^ 0xffffffff) < (i_617_ ^ 0xffffffff); i_617_++)
				standarddrawablemodel_609_.aByteArray5886[i_617_] = aByteArray5886[i_617_];
		} else {
			standarddrawablemodel_609_.aByteArray5886 = aByteArray5886;
		}
		if (!Node_Sub41.method2932(-61, i, anInt5896)) {
			if (CacheNode_Sub11.method2336(-1, anInt5896, i)) {
				standarddrawablemodel_609_.aClass347_5852 = aClass347_5852;
			} else {
				standarddrawablemodel_609_.aClass347_5852 = null;
			}
		} else {
			standarddrawablemodel_609_.aClass347_5852 = standarddrawablemodel_607_.aClass347_5852;
			standarddrawablemodel_609_.aClass347_5852.anInterface15_Impl2_4288 = aClass347_5852.anInterface15_Impl2_4288;
			standarddrawablemodel_609_.aClass347_5852.aBoolean4285 = true;
			standarddrawablemodel_609_.aClass347_5852.aBoolean4287 = aClass347_5852.aBoolean4287;
		}
		if (!Class278.method3367(anInt5896, i, (byte) -105)) {
			standarddrawablemodel_609_.aByteArray5834 = aByteArray5834;
			standarddrawablemodel_609_.aShortArray5794 = aShortArray5794;
			standarddrawablemodel_609_.aShortArray5889 = aShortArray5889;
			standarddrawablemodel_609_.aShortArray5898 = aShortArray5898;
			standarddrawablemodel_609_.aClass284_5867 = aClass284_5867;
		} else {
			if (standarddrawablemodel_607_.aShortArray5889 != null && anInt5885 <= standarddrawablemodel_607_.aShortArray5889.length) {
				standarddrawablemodel_609_.aShortArray5794 = standarddrawablemodel_607_.aShortArray5794;
				standarddrawablemodel_609_.aShortArray5898 = standarddrawablemodel_607_.aShortArray5898;
				standarddrawablemodel_609_.aShortArray5889 = standarddrawablemodel_607_.aShortArray5889;
			} else {
				int i_618_ = anInt5885;
				standarddrawablemodel_609_.aShortArray5794 = standarddrawablemodel_607_.aShortArray5794 = new short[i_618_];
				standarddrawablemodel_609_.aShortArray5898 = standarddrawablemodel_607_.aShortArray5898 = new short[i_618_];
				standarddrawablemodel_609_.aShortArray5889 = standarddrawablemodel_607_.aShortArray5889 = new short[i_618_];
			}
			if (aClass284_5867 == null) {
				standarddrawablemodel_609_.aClass284_5867 = null;
				for (int i_619_ = 0; anInt5885 > i_619_; i_619_++) {
					standarddrawablemodel_609_.aShortArray5889[i_619_] = aShortArray5889[i_619_];
					standarddrawablemodel_609_.aShortArray5898[i_619_] = aShortArray5898[i_619_];
					standarddrawablemodel_609_.aShortArray5794[i_619_] = aShortArray5794[i_619_];
				}
			} else {
				if (standarddrawablemodel_607_.aClass284_5867 == null) {
					standarddrawablemodel_607_.aClass284_5867 = new Class284();
				}
				Class284 class284 = standarddrawablemodel_609_.aClass284_5867 = standarddrawablemodel_607_.aClass284_5867;
				if (class284.aShortArray3595 == null || (anInt5885 ^ 0xffffffff) < (class284.aShortArray3595.length ^ 0xffffffff)) {
					int i_620_ = anInt5885;
					class284.aByteArray3598 = new byte[i_620_];
					class284.aShortArray3593 = new short[i_620_];
					class284.aShortArray3592 = new short[i_620_];
					class284.aShortArray3595 = new short[i_620_];
				}
				for (int i_621_ = 0; anInt5885 > i_621_; i_621_++) {
					standarddrawablemodel_609_.aShortArray5889[i_621_] = aShortArray5889[i_621_];
					standarddrawablemodel_609_.aShortArray5898[i_621_] = aShortArray5898[i_621_];
					standarddrawablemodel_609_.aShortArray5794[i_621_] = aShortArray5794[i_621_];
					class284.aShortArray3595[i_621_] = aClass284_5867.aShortArray3595[i_621_];
					class284.aShortArray3592[i_621_] = aClass284_5867.aShortArray3592[i_621_];
					class284.aShortArray3593[i_621_] = aClass284_5867.aShortArray3593[i_621_];
					class284.aByteArray3598[i_621_] = aClass284_5867.aByteArray3598[i_621_];
				}
			}
			standarddrawablemodel_609_.aByteArray5834 = aByteArray5834;
		}
		if (Class303.method3538(anInt5896, -128, i)) {
			standarddrawablemodel_609_.aClass347_5908 = standarddrawablemodel_607_.aClass347_5908;
			standarddrawablemodel_609_.aClass347_5908.anInterface15_Impl2_4288 = aClass347_5908.anInterface15_Impl2_4288;
			standarddrawablemodel_609_.aClass347_5908.aBoolean4287 = aClass347_5908.aBoolean4287;
			standarddrawablemodel_609_.aClass347_5908.aBoolean4285 = true;
		} else if (!GraphicsBuffer.method2598(2048, i, anInt5896)) {
			standarddrawablemodel_609_.aClass347_5908 = null;
		} else {
			standarddrawablemodel_609_.aClass347_5908 = aClass347_5908;
		}
		if (Class219.method2094(i, anInt5896, i_610_ + -97)) {
			if (standarddrawablemodel_607_.aFloatArray5875 == null || (standarddrawablemodel_607_.aFloatArray5875.length ^ 0xffffffff) > (anInt5813 ^ 0xffffffff)) {
				int i_622_ = anInt5885;
				standarddrawablemodel_609_.aFloatArray5875 = standarddrawablemodel_607_.aFloatArray5875 = new float[i_622_];
				standarddrawablemodel_609_.aFloatArray5860 = standarddrawablemodel_607_.aFloatArray5860 = new float[i_622_];
			} else {
				standarddrawablemodel_609_.aFloatArray5875 = standarddrawablemodel_607_.aFloatArray5875;
				standarddrawablemodel_609_.aFloatArray5860 = standarddrawablemodel_607_.aFloatArray5860;
			}
			for (int i_623_ = 0; (i_623_ ^ 0xffffffff) > (anInt5885 ^ 0xffffffff); i_623_++) {
				standarddrawablemodel_609_.aFloatArray5875[i_623_] = aFloatArray5875[i_623_];
				standarddrawablemodel_609_.aFloatArray5860[i_623_] = aFloatArray5860[i_623_];
			}
		} else {
			standarddrawablemodel_609_.aFloatArray5860 = aFloatArray5860;
			standarddrawablemodel_609_.aFloatArray5875 = aFloatArray5875;
		}
		if (Class253.method3103(i, -116, anInt5896)) {
			standarddrawablemodel_609_.aClass347_5822 = standarddrawablemodel_607_.aClass347_5822;
			standarddrawablemodel_609_.aClass347_5822.anInterface15_Impl2_4288 = aClass347_5822.anInterface15_Impl2_4288;
			standarddrawablemodel_609_.aClass347_5822.aBoolean4285 = true;
			standarddrawablemodel_609_.aClass347_5822.aBoolean4287 = aClass347_5822.aBoolean4287;
		} else if (Class125.method1529(2048, anInt5896, i)) {
			standarddrawablemodel_609_.aClass347_5822 = aClass347_5822;
		} else {
			standarddrawablemodel_609_.aClass347_5822 = null;
		}
		if (Class144_Sub2.method1634(anInt5896, i, false)) {
			if (standarddrawablemodel_607_.aShortArray5841 != null && (anInt5813 ^ 0xffffffff) >= (standarddrawablemodel_607_.aShortArray5841.length ^ 0xffffffff)) {
				standarddrawablemodel_609_.aShortArray5846 = standarddrawablemodel_607_.aShortArray5846;
				standarddrawablemodel_609_.aShortArray5906 = standarddrawablemodel_607_.aShortArray5906;
				standarddrawablemodel_609_.aShortArray5841 = standarddrawablemodel_607_.aShortArray5841;
			} else {
				int i_624_ = anInt5813;
				standarddrawablemodel_609_.aShortArray5906 = standarddrawablemodel_607_.aShortArray5906 = new short[i_624_];
				standarddrawablemodel_609_.aShortArray5841 = standarddrawablemodel_607_.aShortArray5841 = new short[i_624_];
				standarddrawablemodel_609_.aShortArray5846 = standarddrawablemodel_607_.aShortArray5846 = new short[i_624_];
			}
			for (int i_625_ = 0; anInt5813 > i_625_; i_625_++) {
				standarddrawablemodel_609_.aShortArray5841[i_625_] = aShortArray5841[i_625_];
				standarddrawablemodel_609_.aShortArray5846[i_625_] = aShortArray5846[i_625_];
				standarddrawablemodel_609_.aShortArray5906[i_625_] = aShortArray5906[i_625_];
			}
		} else {
			standarddrawablemodel_609_.aShortArray5906 = aShortArray5906;
			standarddrawablemodel_609_.aShortArray5841 = aShortArray5841;
			standarddrawablemodel_609_.aShortArray5846 = aShortArray5846;
		}
		if (!GraphicsBuffer.method2596(i_610_, i, anInt5896)) {
			if (Node_Sub9_Sub4.method2522(i_610_ + 1, i, anInt5896)) {
				standarddrawablemodel_609_.aClass333_5808 = aClass333_5808;
			} else {
				standarddrawablemodel_609_.aClass333_5808 = null;
			}
		} else {
			standarddrawablemodel_609_.aClass333_5808 = standarddrawablemodel_607_.aClass333_5808;
			standarddrawablemodel_609_.aClass333_5808.aBoolean4150 = aClass333_5808.aBoolean4150;
			standarddrawablemodel_609_.aClass333_5808.anInterface15_Impl1_4151 = aClass333_5808.anInterface15_Impl1_4151;
			standarddrawablemodel_609_.aClass333_5808.aBoolean4148 = true;
		}
		if (!Class294.method3466(i, i_610_, anInt5896)) {
			standarddrawablemodel_609_.aShortArray5862 = aShortArray5862;
		} else {
			if (standarddrawablemodel_607_.aShortArray5862 != null && standarddrawablemodel_607_.aShortArray5862.length >= anInt5813) {
				standarddrawablemodel_609_.aShortArray5862 = standarddrawablemodel_607_.aShortArray5862;
			} else {
				int i_626_ = anInt5813;
				standarddrawablemodel_609_.aShortArray5862 = standarddrawablemodel_607_.aShortArray5862 = new short[i_626_];
			}
			for (int i_627_ = 0; (anInt5813 ^ 0xffffffff) < (i_627_ ^ 0xffffffff); i_627_++)
				standarddrawablemodel_609_.aShortArray5862[i_627_] = aShortArray5862[i_627_];
		}
		if (Class320_Sub10.method3720(50560, i, anInt5896)) {
			if (standarddrawablemodel_607_.aClass14Array5872 == null || anInt5811 > standarddrawablemodel_607_.aClass14Array5872.length) {
				int i_628_ = anInt5811;
				standarddrawablemodel_609_.aClass14Array5872 = standarddrawablemodel_607_.aClass14Array5872 = new Class14[i_628_];
				for (int i_629_ = 0; anInt5811 > i_629_; i_629_++)
					standarddrawablemodel_609_.aClass14Array5872[i_629_] = aClass14Array5872[i_629_].method214((byte) -116);
			} else {
				standarddrawablemodel_609_.aClass14Array5872 = standarddrawablemodel_607_.aClass14Array5872;
				for (int i_630_ = 0; i_630_ < anInt5811; i_630_++)
					standarddrawablemodel_609_.aClass14Array5872[i_630_].method215(true, aClass14Array5872[i_630_]);
			}
		} else {
			standarddrawablemodel_609_.aClass14Array5872 = aClass14Array5872;
		}
		standarddrawablemodel_609_.anIntArrayArray5892 = anIntArrayArray5892;
		if (!aBoolean5891) {
			standarddrawablemodel_609_.aBoolean5891 = false;
		} else {
			standarddrawablemodel_609_.anInt5903 = anInt5903;
			standarddrawablemodel_609_.anInt5821 = anInt5821;
			standarddrawablemodel_609_.aBoolean5891 = true;
			standarddrawablemodel_609_.anInt5805 = anInt5805;
			standarddrawablemodel_609_.anInt5815 = anInt5815;
			standarddrawablemodel_609_.anInt5825 = anInt5825;
			standarddrawablemodel_609_.anInt5883 = anInt5883;
			standarddrawablemodel_609_.anInt5909 = anInt5909;
			standarddrawablemodel_609_.anInt5797 = anInt5797;
		}
		standarddrawablemodel_609_.anIntArrayArray5900 = anIntArrayArray5900;
		standarddrawablemodel_609_.anIntArray5911 = anIntArray5911;
		standarddrawablemodel_609_.aClass268Array5856 = aClass268Array5856;
		standarddrawablemodel_609_.aShortArray5899 = aShortArray5899;
		standarddrawablemodel_609_.aShortArray5814 = aShortArray5814;
		standarddrawablemodel_609_.aShortArray5861 = aShortArray5861;
		standarddrawablemodel_609_.anIntArrayArray5847 = anIntArrayArray5847;
		standarddrawablemodel_609_.anIntArray5838 = anIntArray5838;
		standarddrawablemodel_609_.aShortArray5890 = aShortArray5890;
		standarddrawablemodel_609_.anIntArray5884 = anIntArray5884;
		standarddrawablemodel_609_.aShortArray5832 = aShortArray5832;
		standarddrawablemodel_609_.aClass300Array5905 = aClass300Array5905;
		standarddrawablemodel_609_.anIntArray5835 = anIntArray5835;
		standarddrawablemodel_609_.aClass218Array5817 = aClass218Array5817;
		return standarddrawablemodel_609_;
	}
	
	private final void method698(int i) {
		anInt5840++;
		if (aBoolean5826) {
			aBoolean5826 = false;
			if (aClass300Array5905 == null && aClass218Array5817 == null && aClass268Array5856 == null && !Node_Sub38_Sub1.method2792(anInt5896, anInt5881, i ^ ~0x40000)) {
				boolean bool = false;
				boolean bool_631_ = false;
				if (anIntArray5879 != null && !Class304.method3545(anInt5881, 10215, anInt5896)) {
					if (aClass347_5828 == null || aClass347_5828.method3979((byte) -60)) {
						if (!aBoolean5891) {
							method701((byte) 106);
						}
						bool = true;
					} else {
						aBoolean5826 = true;
					}
				}
				boolean bool_632_ = false;
				if (anIntArray5897 != null && !Class138.method1604(anInt5881, anInt5896, 0)) {
					if (aClass347_5828 == null || aClass347_5828.method3979((byte) -77)) {
						if (!aBoolean5891) {
							method701((byte) 116);
						}
						bool_631_ = true;
					} else {
						aBoolean5826 = true;
					}
				}
				if (anIntArray5913 != null && !SeekableFile.method3571((byte) 61, anInt5896, anInt5881)) {
					if (aClass347_5828 == null || aClass347_5828.method3979((byte) -92)) {
						bool_632_ = true;
						if (!aBoolean5891) {
							method701((byte) 106);
						}
					} else {
						aBoolean5826 = true;
					}
				}
				if (bool_632_) {
					anIntArray5913 = null;
				}
				if (bool) {
					anIntArray5879 = null;
				}
				if (bool_631_) {
					anIntArray5897 = null;
				}
			}
			if (aShortArray5899 != null && anIntArray5879 == null && anIntArray5897 == null && anIntArray5913 == null) {
				aShortArray5899 = null;
				anIntArray5911 = null;
			}
			if (aByteArray5834 != null && !Node_Sub38_Sub8.method2812(anInt5881, false, anInt5896)) {
				if (!((0x37 & anInt5896 ^ 0xffffffff) == -1 ? aClass347_5852 == null || aClass347_5852.method3979((byte) -94) : aClass347_5908 == null || aClass347_5908.method3979((byte) -52))) {
					aBoolean5826 = true;
				} else {
					aByteArray5834 = null;
					aShortArray5889 = aShortArray5898 = aShortArray5794 = null;
				}
			}
			if (aShortArray5802 != null && !Node_Sub40.method2929(anInt5896, 0, anInt5881)) {
				if (aClass347_5852 != null && !aClass347_5852.method3979((byte) -117)) {
					aBoolean5826 = true;
				} else {
					aShortArray5802 = null;
				}
			}
			if (aByteArray5886 != null && !za_Sub2.method2994(anInt5881, (byte) 123, anInt5896)) {
				if (aClass347_5852 == null || aClass347_5852.method3979((byte) -87)) {
					aByteArray5886 = null;
				} else {
					aBoolean5826 = true;
				}
			}
			if (aFloatArray5875 != null && !Canvas.method126(127, anInt5881, anInt5896)) {
				if (aClass347_5822 == null || aClass347_5822.method3979((byte) -114)) {
					aFloatArray5875 = aFloatArray5860 = null;
				} else {
					aBoolean5826 = true;
				}
			}
			if (aShortArray5862 != null && !Class339_Sub5.method3937((byte) -97, anInt5896, anInt5881)) {
				if (aClass347_5852 != null && !aClass347_5852.method3979((byte) -118)) {
					aBoolean5826 = true;
				} else {
					aShortArray5862 = null;
				}
			}
			if (aShortArray5841 != null && !CacheNode_Sub14_Sub2.method2352(i + -262144, anInt5881, anInt5896)) {
				if (aClass333_5808 != null && !aClass333_5808.method3847(i + -254147) || aClass347_5852 != null && !aClass347_5852.method3979((byte) -101)) {
					aBoolean5826 = true;
				} else {
					aShortArray5841 = aShortArray5846 = aShortArray5906 = null;
				}
			}
			if (aShortArray5890 != null) {
				if (aClass347_5828 != null && !aClass347_5828.method3979((byte) -34)) {
					aBoolean5826 = true;
				} else {
					aShortArray5890 = null;
				}
			}
			if (aShortArray5832 != null) {
				if (aClass347_5852 == null || aClass347_5852.method3979((byte) -54)) {
					aShortArray5832 = null;
				} else {
					aBoolean5826 = true;
				}
			}
			if (anIntArrayArray5900 != null && !EntityNode_Sub3.method940(i ^ ~0x40000, anInt5896, anInt5881)) {
				aShortArray5861 = null;
				anIntArrayArray5900 = null;
			}
			if (anIntArrayArray5847 != null && !aa.method159(anInt5896, (byte) 105, anInt5881)) {
				anIntArrayArray5847 = null;
				aShortArray5814 = null;
			}
			if (anIntArrayArray5892 != null && !ClientScript.method2322(68, anInt5881, anInt5896)) {
				anIntArrayArray5892 = null;
			}
			if (anIntArray5835 != null && (0x800 & anInt5881) == 0 && (0x40000 & anInt5881) == 0) {
				anIntArray5838 = null;
				anIntArray5835 = null;
				anIntArray5884 = null;
			}
			if (i != 262144) {
				wa();
			}
		}
	}
	
	final void aa(short s, short s_633_) {
		anInt5901++;
		d var_d = anAbstractToolkit5916.aD1543;
		for (int i = 0; i < anInt5813; i++) {
			if ((aShortArray5862[i] ^ 0xffffffff) == (s ^ 0xffffffff)) {
				aShortArray5862[i] = s_633_;
			}
		}
		byte b = 0;
		byte b_634_ = 0;
		if (s != -1) {
			Class91 class91 = var_d.method10(0xffff & s, -8217);
			b_634_ = class91.aByte1217;
			b = class91.aByte1225;
		}
		byte b_635_ = 0;
		byte b_636_ = 0;
		if ((s_633_ ^ 0xffffffff) != 0) {
			Class91 class91 = var_d.method10(s_633_ & 0xffff, -8217);
			b_636_ = class91.aByte1217;
			if ((class91.aByte1211 ^ 0xffffffff) != -1 || class91.aByte1203 != 0) {
				aBoolean5866 = true;
			}
			b_635_ = class91.aByte1225;
		}
		if (b != b_635_ | b_634_ != b_636_) {
			if (aClass268Array5856 != null) {
				for (int i = 0; anInt5811 > i; i++) {
					Class268 class268 = aClass268Array5856[i];
					Class14 class14 = aClass14Array5872[i];
					class14.anInt220 = Class85.anIntArray1158[aShortArray5802[class268.anInt3456] & 0xffff] & 0xffffff | class14.anInt220 & ~0xffffff;
				}
			}
			method703(0);
		}
	}
	
	final void ia(short s, short s_637_) {
		anInt5809++;
		for (int i = 0; (anInt5813 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			if (s == aShortArray5802[i]) {
				aShortArray5802[i] = s_637_;
			}
		}
		if (aClass268Array5856 != null) {
			for (int i = 0; anInt5811 > i; i++) {
				Class268 class268 = aClass268Array5856[i];
				Class14 class14 = aClass14Array5872[i];
				class14.anInt220 = class14.anInt220 & ~0xffffff | Class85.anIntArray1158[aShortArray5802[class268.anInt3456] & 0xffff] & 0xffffff;
			}
		}
		method703(0);
	}
	
	public static void method699(byte b) {
		aClass192_5878 = null;
		if (b != -39) {
			anInt5918 = -101;
		}
	}
	
	final void LA(int i) {
		aShort5843 = (short) i;
		anInt5888++;
		method689(4259);
		method694(-1);
	}
	
	final void a(int i) {
		anInt5919++;
		int i_638_ = Class335.anIntArray4167[i];
		int i_639_ = Class335.anIntArray4165[i];
		for (int i_640_ = 0; i_640_ < anInt5912; i_640_++) {
			int i_641_ = anIntArray5913[i_640_] * i_638_ + anIntArray5879[i_640_] * i_639_ >> 14;
			anIntArray5913[i_640_] = anIntArray5913[i_640_] * i_639_ + -(anIntArray5879[i_640_] * i_638_) >> 14;
			anIntArray5879[i_640_] = i_641_;
		}
		method689(4259);
		aBoolean5891 = false;
	}
	
	static final void method700(int i) {
		anInt5907++;
		Node.aClass61_2795.method608(false);
		if (i != -1) {
			anInt5918 = -47;
		}
		Class62.aClass61_904.method608(false);
	}
	
	final int RA() {
		anInt5853++;
		if (!aBoolean5891) {
			method701((byte) 116);
		}
		return anInt5815;
	}
	
	final boolean method624(int i, int i_642_, Class336 class336, boolean bool, int i_643_) {
		anInt5793++;
		return method693(-1, class336, i_643_, i_642_, false, bool, i);
	}
	
	final void method619(DrawableModel drawablemodel, int i, int i_644_, int i_645_, boolean bool) {
		anInt5921++;
		StandardDrawableModel standarddrawablemodel_646_ = (StandardDrawableModel) drawablemodel;
		if (anInt5813 != 0 && (standarddrawablemodel_646_.anInt5813 ^ 0xffffffff) != -1) {
			int i_647_ = standarddrawablemodel_646_.anInt5912;
			int[] is = standarddrawablemodel_646_.anIntArray5879;
			int[] is_648_ = standarddrawablemodel_646_.anIntArray5897;
			int[] is_649_ = standarddrawablemodel_646_.anIntArray5913;
			short[] ses = standarddrawablemodel_646_.aShortArray5889;
			short[] ses_650_ = standarddrawablemodel_646_.aShortArray5898;
			short[] ses_651_ = standarddrawablemodel_646_.aShortArray5794;
			byte[] bs = standarddrawablemodel_646_.aByteArray5834;
			short[] ses_652_;
			byte[] bs_653_;
			short[] ses_654_;
			short[] ses_655_;
			if (aClass284_5867 == null) {
				ses_652_ = null;
				ses_655_ = null;
				ses_654_ = null;
				bs_653_ = null;
			} else {
				ses_652_ = aClass284_5867.aShortArray3592;
				bs_653_ = aClass284_5867.aByteArray3598;
				ses_654_ = aClass284_5867.aShortArray3593;
				ses_655_ = aClass284_5867.aShortArray3595;
			}
			short[] ses_656_;
			byte[] bs_657_;
			short[] ses_658_;
			short[] ses_659_;
			if (standarddrawablemodel_646_.aClass284_5867 == null) {
				ses_659_ = null;
				ses_658_ = null;
				ses_656_ = null;
				bs_657_ = null;
			} else {
				ses_656_ = standarddrawablemodel_646_.aClass284_5867.aShortArray3595;
				bs_657_ = standarddrawablemodel_646_.aClass284_5867.aByteArray3598;
				ses_658_ = standarddrawablemodel_646_.aClass284_5867.aShortArray3593;
				ses_659_ = standarddrawablemodel_646_.aClass284_5867.aShortArray3592;
			}
			int[] is_660_ = standarddrawablemodel_646_.anIntArray5911;
			short[] ses_661_ = standarddrawablemodel_646_.aShortArray5899;
			if (!standarddrawablemodel_646_.aBoolean5891) {
				standarddrawablemodel_646_.method701((byte) 106);
			}
			int i_662_ = standarddrawablemodel_646_.anInt5903;
			int i_663_ = standarddrawablemodel_646_.anInt5821;
			int i_664_ = standarddrawablemodel_646_.anInt5825;
			int i_665_ = standarddrawablemodel_646_.anInt5815;
			int i_666_ = standarddrawablemodel_646_.anInt5883;
			int i_667_ = standarddrawablemodel_646_.anInt5909;
			for (int i_668_ = 0; (i_668_ ^ 0xffffffff) > (anInt5912 ^ 0xffffffff); i_668_++) {
				int i_669_ = -i_644_ + anIntArray5897[i_668_];
				if ((i_662_ ^ 0xffffffff) >= (i_669_ ^ 0xffffffff) && (i_669_ ^ 0xffffffff) >= (i_663_ ^ 0xffffffff)) {
					int i_670_ = -i + anIntArray5879[i_668_];
					if (i_670_ >= i_664_ && (i_665_ ^ 0xffffffff) <= (i_670_ ^ 0xffffffff)) {
						int i_671_ = -i_645_ + anIntArray5913[i_668_];
						if (i_671_ >= i_666_ && i_667_ >= i_671_) {
							int i_672_ = -1;
							int i_673_ = anIntArray5911[i_668_];
							int i_674_ = anIntArray5911[i_668_ + 1];
							for (int i_675_ = i_673_; (i_674_ ^ 0xffffffff) < (i_675_ ^ 0xffffffff); i_675_++) {
								i_672_ = -1 + aShortArray5899[i_675_];
								if ((i_672_ ^ 0xffffffff) == 0 || (aByteArray5834[i_672_] ^ 0xffffffff) != -1) {
									break;
								}
							}
							if (i_672_ != -1) {
								for (int i_676_ = 0; i_647_ > i_676_; i_676_++) {
									if ((is[i_676_] ^ 0xffffffff) == (i_670_ ^ 0xffffffff) && is_649_[i_676_] == i_671_ && i_669_ == is_648_[i_676_]) {
										i_673_ = is_660_[i_676_];
										int i_677_ = -1;
										i_674_ = is_660_[1 + i_676_];
										for (int i_678_ = i_673_; i_678_ < i_674_; i_678_++) {
											i_677_ = -1 + ses_661_[i_678_];
											if (i_677_ == -1 || (bs[i_677_] ^ 0xffffffff) != -1) {
												break;
											}
										}
										if ((i_677_ ^ 0xffffffff) != 0) {
											if (ses_655_ == null) {
												aClass284_5867 = new Class284();
												ses_655_ = aClass284_5867.aShortArray3595 = Class39.method413(aShortArray5889, (byte) -32);
												ses_652_ = aClass284_5867.aShortArray3592 = Class39.method413(aShortArray5898, (byte) -32);
												ses_654_ = aClass284_5867.aShortArray3593 = Class39.method413(aShortArray5794, (byte) -32);
												bs_653_ = aClass284_5867.aByteArray3598 = Class270_Sub1.method3299(aByteArray5834, 0);
											}
											if (ses_656_ == null) {
												Class284 class284 = standarddrawablemodel_646_.aClass284_5867 = new Class284();
												ses_656_ = class284.aShortArray3595 = Class39.method413(ses, (byte) -32);
												ses_659_ = class284.aShortArray3592 = Class39.method413(ses_650_, (byte) -32);
												ses_658_ = class284.aShortArray3593 = Class39.method413(ses_651_, (byte) -32);
												bs_657_ = class284.aByteArray3598 = Class270_Sub1.method3299(bs, 0);
											}
											short s = aShortArray5889[i_672_];
											short s_679_ = aShortArray5898[i_672_];
											short s_680_ = aShortArray5794[i_672_];
											i_674_ = is_660_[1 + i_676_];
											i_673_ = is_660_[i_676_];
											byte b = aByteArray5834[i_672_];
											for (int i_681_ = i_673_; (i_681_ ^ 0xffffffff) > (i_674_ ^ 0xffffffff); i_681_++) {
												int i_682_ = ses_661_[i_681_] - 1;
												if (i_682_ == -1) {
													break;
												}
												if (bs_657_[i_682_] != 0) {
													ses_656_[i_682_] += s;
													ses_659_[i_682_] += s_679_;
													ses_658_[i_682_] += s_680_;
													bs_657_[i_682_] += b;
												}
											}
											s = ses[i_677_];
											i_674_ = anIntArray5911[1 + i_668_];
											i_673_ = anIntArray5911[i_668_];
											s_679_ = ses_650_[i_677_];
											s_680_ = ses_651_[i_677_];
											b = bs[i_677_];
											for (int i_683_ = i_673_; i_683_ < i_674_; i_683_++) {
												int i_684_ = -1 + aShortArray5899[i_683_];
												if (i_684_ == -1) {
													break;
												}
												if (bs_653_[i_684_] != 0) {
													ses_655_[i_684_] += s;
													ses_652_[i_684_] += s_679_;
													ses_654_[i_684_] += s_680_;
													bs_653_[i_684_] += b;
												}
											}
											standarddrawablemodel_646_.method694(-1);
											method694(-1);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	final Class300[] method620() {
		anInt5894++;
		return aClass300Array5905;
	}
	
	final boolean method621(int i, int i_685_, Class336 class336, boolean bool, int i_686_, int i_687_) {
		anInt5827++;
		return method693(i_687_, class336, i_686_, i_685_, false, bool, i);
	}
	
	private final void method701(byte b) {
		anInt5865++;
		int i = 32767;
		int i_688_ = 32767;
		if (b <= 82) {
			aShortArray5841 = null;
		}
		int i_689_ = 32767;
		int i_690_ = -32768;
		int i_691_ = -32768;
		int i_692_ = -32768;
		int i_693_ = 0;
		int i_694_ = 0;
		for (int i_695_ = 0; (i_695_ ^ 0xffffffff) > (anInt5912 ^ 0xffffffff); i_695_++) {
			int i_696_ = anIntArray5879[i_695_];
			int i_697_ = anIntArray5897[i_695_];
			if (i_696_ > i_690_) {
				i_690_ = i_696_;
			}
			if ((i_696_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
				i = i_696_;
			}
			int i_698_ = anIntArray5913[i_695_];
			if ((i_688_ ^ 0xffffffff) < (i_697_ ^ 0xffffffff)) {
				i_688_ = i_697_;
			}
			if (i_691_ < i_697_) {
				i_691_ = i_697_;
			}
			if ((i_698_ ^ 0xffffffff) < (i_692_ ^ 0xffffffff)) {
				i_692_ = i_698_;
			}
			if (i_689_ > i_698_) {
				i_689_ = i_698_;
			}
			int i_699_ = i_698_ * i_698_ + i_696_ * i_696_;
			if ((i_693_ ^ 0xffffffff) > (i_699_ ^ 0xffffffff)) {
				i_693_ = i_699_;
			}
			i_699_ = i_698_ * i_698_ + (i_696_ * i_696_ + i_697_ * i_697_);
			if (i_694_ < i_699_) {
				i_694_ = i_699_;
			}
		}
		anInt5821 = i_691_;
		anInt5815 = i_690_;
		anInt5825 = i;
		anInt5903 = i_688_;
		anInt5909 = i_692_;
		anInt5883 = i_689_;
		anInt5797 = (int) (Math.sqrt((double) i_693_) + 0.99);
		anInt5805 = (int) (0.99 + Math.sqrt((double) i_694_));
		aBoolean5891 = true;
	}
	
	private final void method702(int i) {
		if (i >= -66) {
			method688((byte) -92);
		}
		if (aClass333_5808 != null) {
			aClass333_5808.aBoolean4150 = false;
		}
		anInt5874++;
	}
	
	final r ba(r var_r) {
		anInt5818++;
		if (anInt5885 == 0) {
			return null;
		}
		if (!aBoolean5891) {
			method701((byte) 84);
		}
		int i;
		int i_700_;
		if ((anAbstractToolkit5916.anInt6337 ^ 0xffffffff) < -1) {
			i = anInt5825 + -(anInt5821 * anAbstractToolkit5916.anInt6337 >> 8) >> anAbstractToolkit5916.anInt6350;
			i_700_ = anInt5815 - (anAbstractToolkit5916.anInt6337 * anInt5903 >> 8) >> anAbstractToolkit5916.anInt6350;
		} else {
			i = anInt5825 + -(anInt5903 * anAbstractToolkit5916.anInt6337 >> 8) >> anAbstractToolkit5916.anInt6350;
			i_700_ = -(anAbstractToolkit5916.anInt6337 * anInt5821 >> 8) + anInt5815 >> anAbstractToolkit5916.anInt6350;
		}
		int i_701_;
		int i_702_;
		if ((anAbstractToolkit5916.anInt6286 ^ 0xffffffff) < -1) {
			i_701_ = anInt5883 - (anInt5821 * anAbstractToolkit5916.anInt6286 >> 8) >> anAbstractToolkit5916.anInt6350;
			i_702_ = anInt5909 - (anAbstractToolkit5916.anInt6286 * anInt5903 >> 8) >> anAbstractToolkit5916.anInt6350;
		} else {
			i_701_ = anInt5883 + -(anAbstractToolkit5916.anInt6286 * anInt5903 >> 8) >> anAbstractToolkit5916.anInt6350;
			i_702_ = anInt5909 + -(anAbstractToolkit5916.anInt6286 * anInt5821 >> 8) >> anAbstractToolkit5916.anInt6350;
		}
		int i_703_ = i_700_ + (-i - -1);
		int i_704_ = 1 + -i_701_ + i_702_;
		r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
		r_Sub1 var_r_Sub1_705_;
		if (var_r_Sub1 != null && var_r_Sub1.method2363(i_703_, false, i_704_)) {
			var_r_Sub1_705_ = var_r_Sub1;
			var_r_Sub1_705_.method2367((byte) 0);
		} else {
			var_r_Sub1_705_ = new r_Sub1(anAbstractToolkit5916, i_703_, i_704_);
		}
		var_r_Sub1_705_.method2365(i_701_, i_702_, i_700_, i, 83);
		method705(-873913272, var_r_Sub1_705_);
		return var_r_Sub1_705_;
	}
	
	final void method626(int i, int i_706_, int i_707_, int i_708_) {
		anInt5836++;
		for (int i_709_ = 0; anInt5813 > i_709_; i_709_++) {
			int i_710_ = 0xffff & aShortArray5802[i_709_];
			int i_711_ = (i_710_ & 0xfdc2) >> 10;
			int i_712_ = (0x3fd & i_710_) >> 7;
			int i_713_ = i_710_ & 0x7f;
			if ((i_706_ ^ 0xffffffff) != 0) {
				i_712_ = ((i_706_ - i_712_) * i_708_ >> 7) + i_712_;
			}
			if ((i ^ 0xffffffff) != 0) {
				i_711_ = ((-i_711_ + i) * i_708_ >> 7) + i_711_;
			}
			if (i_707_ != -1) {
				i_713_ = (i_708_ * (-i_713_ + i_707_) >> 7) + i_713_;
			}
			aShortArray5802[i_709_] = (short) Node_Sub16.method2590(Node_Sub16.method2590(i_712_ << 7, i_711_ << 10), i_713_);
		}
		if (aClass268Array5856 != null) {
			for (int i_714_ = 0; i_714_ < anInt5811; i_714_++) {
				Class268 class268 = aClass268Array5856[i_714_];
				Class14 class14 = aClass14Array5872[i_714_];
				class14.anInt220 = 0xffffff & Class85.anIntArray1158[0xffff & aShortArray5802[class268.anInt3456]] | ~0xffffff & class14.anInt220;
			}
		}
		method703(0);
	}
	
	private final void method703(int i) {
		if (aClass347_5852 != null) {
			aClass347_5852.aBoolean4287 = false;
		}
		if (i == 0) {
			anInt5858++;
		}
	}
	
	static final void method704(int i, int i_715_, int i_716_, int i_717_, Animable_Sub3 animable_sub3) {
		Class261 class261 = Node_Sub15_Sub6.method2572(i, i_715_, i_716_);
		if (class261 != null) {
			animable_sub3.anInt5934 = (i_715_ << Class36.anInt549) + Class135.anInt1692;
			animable_sub3.anInt5937 = i_717_;
			animable_sub3.anInt5940 = (i_716_ << Class36.anInt549) + Class135.anInt1692;
			class261.anAnimable_Sub3_3316 = animable_sub3;
			int i_718_ = Class320_Sub10.aPlaneArray8300 == Class368.aPlaneArray4548 ? 1 : 0;
			if (animable_sub3.method814((byte) -118)) {
				if (animable_sub3.method813(0)) {
					animable_sub3.anAnimable5941 = SeekableFile.anAnimableArray3884[i_718_];
					SeekableFile.anAnimableArray3884[i_718_] = animable_sub3;
				} else {
					animable_sub3.anAnimable5941 = Class303.anAnimableArray3827[i_718_];
					Class303.anAnimableArray3827[i_718_] = animable_sub3;
					Class194_Sub1.aBoolean6892 = true;
				}
			} else {
				animable_sub3.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_718_];
				Node_Sub36.anAnimableArray7429[i_718_] = animable_sub3;
			}
		}
	}
	
	final int fa() {
		anInt5804++;
		if (!aBoolean5891) {
			method701((byte) 95);
		}
		return anInt5903;
	}
	
	final DrawableModel method633(byte b, int i, boolean bool) {
		anInt5857++;
		boolean bool_719_ = false;
		StandardDrawableModel standarddrawablemodel_720_;
		StandardDrawableModel standarddrawablemodel_721_;
		if (b <= 0 || b > 7) {
			standarddrawablemodel_720_ = standarddrawablemodel_721_ = new StandardDrawableModel(anAbstractToolkit5916, 0, 0, true, false);
		} else {
			standarddrawablemodel_720_ = anAbstractToolkit5916.aStandardDrawableModelArray6380[-1 + b];
			bool_719_ = true;
			standarddrawablemodel_721_ = anAbstractToolkit5916.aStandardDrawableModelArray6374[-1 + b];
		}
		return method697(i, standarddrawablemodel_721_, bool, bool_719_, standarddrawablemodel_720_, -1);
	}
	
	private final void method705(int i, r_Sub1 var_r_Sub1) {
		if (Class107.anIntArray1363.length < anInt5885) {
			Class365.anIntArray4525 = new int[anInt5885];
			Class107.anIntArray1363 = new int[anInt5885];
		}
		anInt5842++;
		for (int i_722_ = 0; i_722_ < anInt5912; i_722_++) {
			int i_723_ = -var_r_Sub1.anInt11050 + (anIntArray5879[i_722_] - (anIntArray5897[i_722_] * anAbstractToolkit5916.anInt6337 >> 8) >> anAbstractToolkit5916.anInt6350);
			int i_724_ = (anIntArray5913[i_722_] + -(anIntArray5897[i_722_] * anAbstractToolkit5916.anInt6286 >> 8) >> anAbstractToolkit5916.anInt6350) - var_r_Sub1.anInt11052;
			int i_725_ = anIntArray5911[i_722_];
			int i_726_ = anIntArray5911[1 + i_722_];
			for (int i_727_ = i_725_; i_727_ < i_726_; i_727_++) {
				int i_728_ = aShortArray5899[i_727_] + -1;
				if ((i_728_ ^ 0xffffffff) == 0) {
					break;
				}
				Class107.anIntArray1363[i_728_] = i_723_;
				Class365.anIntArray4525[i_728_] = i_724_;
			}
		}
		if (i != -873913272) {
			method620();
		}
		for (int i_729_ = 0; anInt5859 > i_729_; i_729_++) {
			if (aByteArray5886 == null || aByteArray5886[i_729_] <= 128) {
				short s = aShortArray5841[i_729_];
				short s_730_ = aShortArray5846[i_729_];
				short s_731_ = aShortArray5906[i_729_];
				int i_732_ = Class107.anIntArray1363[s];
				int i_733_ = Class107.anIntArray1363[s_730_];
				int i_734_ = Class107.anIntArray1363[s_731_];
				int i_735_ = Class365.anIntArray4525[s];
				int i_736_ = Class365.anIntArray4525[s_730_];
				int i_737_ = Class365.anIntArray4525[s_731_];
				if ((-((-i_735_ + i_736_) * (-i_733_ + i_734_)) + (i_732_ - i_733_) * (-i_737_ + i_736_) ^ 0xffffffff) < -1) {
					var_r_Sub1.method2368(i_734_, i_733_, i_732_, -104, i_736_, i_735_, i_737_);
				}
			}
		}
	}
	
	final byte[] method627() {
		anInt5920++;
		return aByteArray5886;
	}
	
	final void method632() {
		anInt5812++;
	}
	
	final Class218[] method618() {
		anInt5820++;
		return aClass218Array5817;
	}
	
	final void H(int i, int i_738_, int i_739_) {
		for (int i_740_ = 0; i_740_ < anInt5912; i_740_++) {
			if ((i ^ 0xffffffff) != -1) {
				anIntArray5879[i_740_] += i;
			}
			if (i_738_ != 0) {
				anIntArray5897[i_740_] += i_738_;
			}
			if (i_739_ != 0) {
				anIntArray5913[i_740_] += i_739_;
			}
		}
		anInt5877++;
		method689(4259);
		aBoolean5891 = false;
	}
	
	final void method630(Class336 class336, int i, boolean bool) {
		anInt5830++;
		if (aShortArray5814 != null) {
			int[] is = new int[3];
			for (int i_741_ = 0; (i_741_ ^ 0xffffffff) > (anInt5912 ^ 0xffffffff); i_741_++) {
				if ((aShortArray5814[i_741_] & i) != 0) {
					if (!bool) {
						class336.method3853(anIntArray5879[i_741_], anIntArray5897[i_741_], anIntArray5913[i_741_], is);
					} else {
						class336.method3869(anIntArray5879[i_741_], anIntArray5897[i_741_], anIntArray5913[i_741_], is);
					}
					anIntArray5879[i_741_] = is[0];
					anIntArray5897[i_741_] = is[1];
					anIntArray5913[i_741_] = is[2];
				}
			}
		}
	}
	
	StandardDrawableModel(AbstractToolkit abstracttoolkit, int i, int i_742_, boolean bool, boolean bool_743_) {
		anInt5813 = 0;
		aBoolean5866 = false;
		aBoolean5880 = false;
		anInt5859 = 0;
		anInt5902 = 0;
		aBoolean5826 = true;
		aBoolean5891 = false;
		anInt5885 = 0;
		anInt5912 = 0;
		anInt5881 = i;
		aBoolean5880 = bool_743_;
		anInt5896 = i_742_;
		anAbstractToolkit5916 = abstracttoolkit;
		if (bool || Class85.method999(anInt5896, anInt5881, (byte) -30)) {
			aClass347_5828 = new Class347(Class262_Sub15_Sub1.method3192(anInt5896, anInt5881, 512));
		}
		if (bool || Class125.method1529(2048, anInt5896, anInt5881)) {
			aClass347_5822 = new Class347(Class253.method3103(anInt5881, -126, anInt5896));
		}
		if (bool || CacheNode_Sub11.method2336(-1, anInt5896, anInt5881)) {
			aClass347_5852 = new Class347(Node_Sub41.method2932(-89, anInt5881, anInt5896));
		}
		if (bool || GraphicsBuffer.method2598(2048, anInt5881, anInt5896)) {
			aClass347_5908 = new Class347(Class303.method3538(anInt5896, -127, anInt5881));
		}
		if (bool || Node_Sub9_Sub4.method2522(0, anInt5881, anInt5896)) {
			aClass333_5808 = new Class333(GraphicsBuffer.method2596(-1, anInt5881, anInt5896));
		}
	}
	
	private final void method706(int i) {
		anInt5917++;
		if (anInt5859 != 0) {
			if (i != 65535) {
				method703(-68);
			}
			if (method688((byte) 60) && method691(0)) {
				anAbstractToolkit5916.method1354(0, i ^ 0x82f4, aClass347_5828.anInterface15_Impl2_4288);
				anAbstractToolkit5916.method1354(1, 32011, aClass347_5852.anInterface15_Impl2_4288);
				anAbstractToolkit5916.method1354(2, 32011, aClass347_5822.anInterface15_Impl2_4288);
				boolean bool;
				if ((anInt5896 & 0x37 ^ 0xffffffff) == -1) {
					bool = false;
					anAbstractToolkit5916.method1296(i ^ 0xff85, false);
					anAbstractToolkit5916.method1338(anAbstractToolkit5916.aClass213_6385, 9422);
				} else {
					anAbstractToolkit5916.method1296(i + -65412, true);
					bool = true;
					anAbstractToolkit5916.method1354(3, 32011, aClass347_5908.anInterface15_Impl2_4288);
					anAbstractToolkit5916.method1338(anAbstractToolkit5916.aClass213_6382, 9422);
				}
				for (int i_744_ = 0; anIntArray5884.length > i_744_; i_744_++) {
					int i_745_ = anIntArray5835[i_744_];
					int i_746_ = anIntArray5835[i_744_ - -1];
					int i_747_ = aShortArray5862[i_745_] & 0xffff;
					if (i_747_ == 65535) {
						i_747_ = -1;
					}
					anAbstractToolkit5916.method1332(3, bool, i_747_, true);
					anAbstractToolkit5916.method1276(anIntArray5884[i_744_], (byte) -114, i_745_ * 3, aClass333_5808.anInterface15_Impl1_4151, anIntArray5838[i_744_], Class55.aClass104_833, i_746_ + -i_745_);
				}
			}
			method698(262144);
		}
	}
	
	final int G() {
		if (!aBoolean5891) {
			method701((byte) 99);
		}
		anInt5864++;
		return anInt5909;
	}
}
