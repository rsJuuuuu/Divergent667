/* Class52_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Class52_Sub1 extends Class52
{
	private boolean aBoolean5559;
	private Interface13_Impl1 anInterface13_Impl1_5560;
	private AbstractToolkit anAbstractToolkit5561;
	private Interface15_Impl2 anInterface15_Impl2_5562;
	
	Class52_Sub1(AbstractToolkit abstracttoolkit, Class357 class357, Class383[] class383s, boolean bool) {
		super(abstracttoolkit, class357);
		anAbstractToolkit5561 = abstracttoolkit;
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			Class383 class383 = class383s[i_0_];
			if (class383.anInt4900 > i) {
				i = class383.anInt4900;
			}
			if (class383.anInt4897 > i) {
				i = class383.anInt4897;
			}
		}
		int i_1_ = i * 16;
		if (bool) {
			byte[] bs = new byte[i_1_ * i_1_];
			for (int i_2_ = 0; i_2_ < 256; i_2_++) {
				Class383 class383 = class383s[i_2_];
				int i_3_ = class383.anInt4900;
				int i_4_ = class383.anInt4897;
				int i_5_ = i_2_ % 16 * i;
				int i_6_ = i_2_ / 16 * i;
				int i_7_ = i_6_ * i_1_ + i_5_;
				int i_8_ = 0;
				if (class383.aByteArray4905 == null) {
					byte[] bs_9_ = class383.aByteArray4903;
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						for (int i_11_ = 0; i_11_ < i_4_; i_11_++)
							bs[i_7_++] = (byte) (bs_9_[i_8_++] == 0 ? 0 : -1);
						i_7_ += i_1_ - i_4_;
					}
				} else {
					byte[] bs_12_ = class383.aByteArray4905;
					for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
						for (int i_14_ = 0; i_14_ < i_4_; i_14_++)
							bs[i_7_++] = bs_12_[i_8_++];
						i_7_ += i_1_ - i_4_;
					}
				}
			}
			if (!abstracttoolkit.method1295(Node_Sub52.aClass68_7639, Class372.aClass372_4594, 1)) {
				int[] is = new int[bs.length];
				for (int i_15_ = 0; i_15_ < bs.length; i_15_++)
					is[i_15_] = bs[i_15_] << 24;
				anInterface13_Impl1_5560 = abstracttoolkit.method1258(false, i_1_, true, i_1_, is);
			} else {
				anInterface13_Impl1_5560 = abstracttoolkit.method1252(i_1_, bs, Node_Sub52.aClass68_7639, i_1_, (byte) -3, false);
			}
			aBoolean5559 = true;
		} else {
			int[] is = new int[i_1_ * i_1_];
			for (int i_16_ = 0; i_16_ < 256; i_16_++) {
				Class383 class383 = class383s[i_16_];
				int[] is_17_ = class383.anIntArray4904;
				byte[] bs = class383.aByteArray4905;
				byte[] bs_18_ = class383.aByteArray4903;
				int i_19_ = class383.anInt4900;
				int i_20_ = class383.anInt4897;
				int i_21_ = i_16_ % 16 * i;
				int i_22_ = i_16_ / 16 * i;
				int i_23_ = i_22_ * i_1_ + i_21_;
				int i_24_ = 0;
				if (bs != null) {
					for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
						for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
							is[i_23_++] = bs[i_24_] << 24 | is_17_[bs_18_[i_24_] & 0xff];
							i_24_++;
						}
						i_23_ += i_1_ - i_20_;
					}
				} else {
					for (int i_27_ = 0; i_27_ < i_19_; i_27_++) {
						for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
							int i_29_;
							if ((i_29_ = bs_18_[i_24_++]) != 0) {
								is[i_23_++] = ~0xffffff | is_17_[i_29_ & 0xff];
							} else {
								i_23_++;
							}
						}
						i_23_ += i_1_ - i_20_;
					}
				}
			}
			anInterface13_Impl1_5560 = abstracttoolkit.method1258(false, i_1_, true, i_1_, is);
			aBoolean5559 = false;
		}
		anInterface13_Impl1_5560.method41((byte) -114, Class194.aClass228_2377);
		anInterface15_Impl2_5562 = abstracttoolkit.method1380(2, false);
		anInterface15_Impl2_5562.method37(20, 20480, -12093);
		for (int i_30_ = 0; i_30_ < 4; i_30_++) {
			jaclib.memory.Buffer buffer = anInterface15_Impl2_5562.method40(-12, true);
			if (buffer != null) {
				Stream stream = anAbstractToolkit5561.method1324(true, buffer);
				float f = anInterface13_Impl1_5560.method45((float) i_1_, -51) / (float) i_1_;
				float f_31_ = anInterface13_Impl1_5560.method49((float) i_1_, (byte) -47) / (float) i_1_;
				for (int i_32_ = 0; i_32_ < 256; i_32_++) {
					Class383 class383 = class383s[i_32_];
					int i_33_ = class383.anInt4900;
					int i_34_ = class383.anInt4897;
					int i_35_ = class383.anInt4898;
					int i_36_ = class383.anInt4902;
					float f_37_ = (float) (i_32_ % 16 * i);
					float f_38_ = (float) (i_32_ / 16 * i);
					float f_39_ = f_37_ * f;
					float f_40_ = f_38_ * f_31_;
					float f_41_ = (f_37_ + (float) i_34_) * f;
					float f_42_ = (f_38_ + (float) i_33_) * f_31_;
					if (Stream.b()) {
						stream.a((float) i_36_);
						stream.a((float) i_35_);
						stream.a(0.0F);
						stream.a(f_39_);
						stream.a(f_40_);
						stream.a((float) i_36_);
						stream.a((float) (i_35_ + i_33_));
						stream.a(0.0F);
						stream.a(f_39_);
						stream.a(f_42_);
						stream.a((float) (i_36_ + i_34_));
						stream.a((float) (i_35_ + i_33_));
						stream.a(0.0F);
						stream.a(f_41_);
						stream.a(f_42_);
						stream.a((float) (i_36_ + i_34_));
						stream.a((float) i_35_);
						stream.a(0.0F);
						stream.a(f_41_);
						stream.a(f_40_);
					} else {
						stream.b((float) i_36_);
						stream.b((float) i_35_);
						stream.b(0.0F);
						stream.b(f_39_);
						stream.b(f_40_);
						stream.b((float) i_36_);
						stream.b((float) (i_35_ + i_33_));
						stream.b(0.0F);
						stream.b(f_39_);
						stream.b(f_42_);
						stream.b((float) (i_36_ + i_34_));
						stream.b((float) (i_35_ + i_33_));
						stream.b(0.0F);
						stream.b(f_41_);
						stream.b(f_42_);
						stream.b((float) (i_36_ + i_34_));
						stream.b((float) i_35_);
						stream.b(0.0F);
						stream.b(f_41_);
						stream.b(f_40_);
					}
				}
				stream.c();
				if (anInterface15_Impl2_5562.method39(-95)) {
					break;
				}
			}
		}
	}
	
	final void method526(char c, int i, int i_43_, int i_44_, boolean bool, aa var_aa, int i_45_, int i_46_) {
		/* empty */
	}
	
	final void fa(char c, int i, int i_47_, int i_48_, boolean bool) {
		anAbstractToolkit5561.method1288(0);
		anAbstractToolkit5561.method1312((byte) -21, anInterface13_Impl1_5560);
		if (aBoolean5559 || bool) {
			anAbstractToolkit5561.method1318(-30, Class116.aClass94_5075, Class117_Sub1.aClass94_4924);
			anAbstractToolkit5561.method1304(0, 0, InterfaceSettings.aClass135_7421);
			anAbstractToolkit5561.method1336(-2, i_48_);
		} else {
			anAbstractToolkit5561.method1318(-30, Class117_Sub1.aClass94_4924, Class117_Sub1.aClass94_4924);
		}
		Class336_Sub1 class336_sub1 = anAbstractToolkit5561.method1264(false);
		class336_sub1.method3854(i, i_47_, 0);
		anAbstractToolkit5561.method1266((byte) 120);
		anAbstractToolkit5561.method1354(0, 32011, anInterface15_Impl2_5562);
		anAbstractToolkit5561.method1338(anAbstractToolkit5561.aClass213_6373, 9422);
		anAbstractToolkit5561.method1303(Class169_Sub3.aClass104_8818, 66, c * '\004', 2);
		if (aBoolean5559 || bool) {
			anAbstractToolkit5561.method1304(0, 0, Class106.aClass135_1354);
		}
	}
}
