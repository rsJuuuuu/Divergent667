/* StandardPlane - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class StandardPlane extends Plane
{
	static int[] anIntArray7980;
	protected int anInt7981;
	private int anInt7982;
	static int anInt7983;
	static int anInt7984;
	protected short[][] aShortArrayArray7985;
	protected int[][][] anIntArrayArrayArray7986;
	private float aFloat7987 = -3.4028235E38F;
	private float aFloat7988 = 3.4028235E38F;
	private Class312 aClass312_7989 = new Class312();
	static short aShort7990;
	static int anInt7991;
	static int anInt7992;
	private int anInt7993;
	static int anInt7994;
	private int[][][] anIntArrayArrayArray7995;
	private byte[][] aByteArrayArray7996;
	protected int[][][] anIntArrayArrayArray7997;
	static int anInt7998;
	static int anInt7999;
	static int anInt8000;
	static int anInt8001;
	private int[][][] anIntArrayArrayArray8002;
	static int anInt8003;
	protected AbstractToolkit anAbstractToolkit8004;
	static int anInt8005;
	protected int[][][] anIntArrayArrayArray8006;
	private Node_Sub54[][][] aNode_Sub54ArrayArrayArray8007;
	private Class263 aClass263_8008;
	private int anInt8009;
	private int anInt8010;
	static int anInt8011;
	static int anInt8012;
	private int[][][] anIntArrayArrayArray8013;
	static int anInt8014;
	static int anInt8015;
	private int anInt8016;
	protected Class213 aClass213_8017;
	private Interface15_Impl2 anInterface15_Impl2_8018;
	private float[][] aFloatArrayArray8019;
	private Interface15_Impl2 anInterface15_Impl2_8020;
	private float[][] aFloatArrayArray8021;
	private HashTable aHashTable8022;
	private int anInt8023;
	private Node_Sub54[] aNode_Sub54Array8024;
	private float[][] aFloatArrayArray8025;
	private byte[][] aByteArrayArray8026;
	
	final void method3252(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_) {
		anInt7984++;
		method3273(bools, bool, i_0_, -1, 1, i_1_, i_2_, i);
	}
	
	final void U(int i, int i_3_, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int i_11_, int i_12_, int i_13_, boolean bool) {
		anInt8003++;
		if (is_6_ != null && anIntArrayArrayArray8002 == null) {
			anIntArrayArrayArray8002 = new int[anInt3408][anInt3404][];
		}
		if (is_4_ != null && anIntArrayArrayArray7995 == null) {
			anIntArrayArrayArray7995 = new int[anInt3408][anInt3404][];
		}
		d var_d = anAbstractToolkit8004.aD1543;
		anIntArrayArrayArray7986[i][i_3_] = is;
		anIntArrayArrayArray7997[i][i_3_] = is_5_;
		anIntArrayArrayArray8006[i][i_3_] = is_7_;
		anIntArrayArrayArray8013[i][i_3_] = is_8_;
		if (anIntArrayArrayArray8002 != null) {
			anIntArrayArrayArray8002[i][i_3_] = is_6_;
		}
		if (anIntArrayArrayArray7995 != null) {
			anIntArrayArrayArray7995[i][i_3_] = is_4_;
		}
		Node_Sub54[] node_sub54s = aNode_Sub54ArrayArrayArray8007[i][i_3_] = new Node_Sub54[is_7_.length];
		for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (is_7_.length ^ 0xffffffff); i_14_++) {
			int i_15_ = is_9_[i_14_];
			int i_16_ = is_10_[i_14_];
			if ((0x20 & anInt7981 ^ 0xffffffff) != -1 && (i_15_ ^ 0xffffffff) != 0 && var_d.method10(i_15_, -8217).aBoolean1223) {
				i_16_ = 128;
				i_15_ = -1;
			}
			long l = (long) i_15_ | ((long) i_11_ << 28 | ((long) i_13_ << 48 | (long) i_12_ << 42) | (long) (i_16_ << 14));
			Node node;
			for (node = aHashTable8022.method1518(3512, l); node != null; node = aHashTable8022.method1524((byte) 84)) {
				Node_Sub54 node_sub54 = (Node_Sub54) node;
				if ((node_sub54.anInt7689 ^ 0xffffffff) == (i_15_ ^ 0xffffffff) && (float) i_16_ == node_sub54.aFloat7690 && (node_sub54.anInt7680 ^ 0xffffffff) == (i_11_ ^ 0xffffffff) && i_12_ == node_sub54.anInt7676 && i_13_ == node_sub54.anInt7686) {
					break;
				}
			}
			if (node != null) {
				node_sub54s[i_14_] = (Node_Sub54) node;
			} else {
				node_sub54s[i_14_] = new Node_Sub54(this, i_15_, i_16_, i_11_, i_12_, i_13_);
				aHashTable8022.method1515(l, node_sub54s[i_14_], -123);
			}
		}
		if (bool) {
			aByteArrayArray7996[i][i_3_] = (byte) Node_Sub16.method2590(aByteArrayArray7996[i][i_3_], 1);
		}
		if (anInt8016 < is_7_.length) {
			anInt8016 = is_7_.length;
		}
		anInt8023 += is_7_.length;
	}
	
	final void method3259(int i, int i_17_, int i_18_, boolean[][] bools, boolean bool, int i_19_, int i_20_) {
		method3273(bools, bool, i_17_, i_19_, 1, i_18_, i_20_, i);
		anInt7983++;
	}
	
	final void ka(int i, int i_21_, int i_22_) {
		anInt7994++;
		if ((aByteArrayArray8026[i][i_21_] & 0xff ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
			aByteArrayArray8026[i][i_21_] = (byte) i_22_;
		}
	}
	
	private final void method3273(boolean[][] bools, boolean bool, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		anInt8012++;
		if (i_24_ != 1) {
			CA(null, 55, 24, 4, 36, true);
		}
		if (aNode_Sub54Array8024 != null) {
			int i_28_ = 1 + (i_25_ + i_25_);
			i_28_ *= i_28_;
			if ((Class47.anIntArray689.length ^ 0xffffffff) > (i_28_ ^ 0xffffffff)) {
				Class47.anIntArray689 = new int[i_28_];
			}
			int i_29_ = -i_25_ + i_27_;
			int i_30_ = i_29_;
			if (i_29_ < 0) {
				i_29_ = 0;
			}
			int i_31_ = -i_25_ + i;
			int i_32_ = i_31_;
			if (i_31_ < 0) {
				i_31_ = 0;
			}
			int i_33_ = i_25_ + i_27_;
			if (anInt3408 - 1 < i_33_) {
				i_33_ = anInt3408 - 1;
			}
			int i_34_ = i + i_25_;
			Class194_Sub3_Sub1.anInt9376 = 0;
			if (-1 + anInt3404 < i_34_) {
				i_34_ = -1 + anInt3404;
			}
			for (int i_35_ = i_29_; (i_33_ ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
				boolean[] bools_36_ = bools[-i_30_ + i_35_];
				for (int i_37_ = i_31_; (i_37_ ^ 0xffffffff) >= (i_34_ ^ 0xffffffff); i_37_++) {
					if (bools_36_[i_37_ - i_32_]) {
						Class47.anIntArray689[Class194_Sub3_Sub1.anInt9376++] = anInt3408 * i_37_ + i_35_;
					}
				}
			}
			if (i_23_ != -1) {
				anAbstractToolkit8004.method1270((byte) -126, (float) i_23_);
				anAbstractToolkit8004.method1335(true);
			} else {
				anAbstractToolkit8004.method1268(0);
			}
			anAbstractToolkit8004.method1320((byte) -121);
			anAbstractToolkit8004.method1296(127, (anInt7981 & 0x7 ^ 0xffffffff) != -1);
			anAbstractToolkit8004.method1332(3, false, -1, false);
			anAbstractToolkit8004.method1354(0, i_24_ + 32010, anInterface15_Impl2_8018);
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > (aNode_Sub54Array8024.length ^ 0xffffffff); i_38_++)
				aNode_Sub54Array8024[i_38_].method2985((byte) 60, Class47.anIntArray689, Class194_Sub3_Sub1.anInt9376);
			Class336_Sub1 class336_sub1 = anAbstractToolkit8004.method1264(false);
			class336_sub1.method3854(0, -1, 0);
			anAbstractToolkit8004.method1266((byte) 107);
			if (!aClass312_7989.method3616(i_24_ ^ 0x1)) {
				int i_39_ = anAbstractToolkit8004.anInt6276;
				int i_40_ = anAbstractToolkit8004.anInt6355;
				anAbstractToolkit8004.L(0, i_40_, anAbstractToolkit8004.anInt6372);
				anAbstractToolkit8004.method1296(i_24_ + 110, false);
				anAbstractToolkit8004.method1307(i_24_ ^ ~0x54, false);
				anAbstractToolkit8004.method1277((byte) 61, 128);
				anAbstractToolkit8004.method1332(i_24_ + 2, false, -2, false);
				anAbstractToolkit8004.method1312((byte) -21, anAbstractToolkit8004.anInterface13_6357);
				anAbstractToolkit8004.method1318(i_24_ ^ ~0x1c, Class117_Sub1.aClass94_4924, Class116.aClass94_5075);
				anAbstractToolkit8004.method1304(0, 0, InterfaceSettings.aClass135_7421);
				anAbstractToolkit8004.method1366((byte) 98, Class115.aClass135_1465, 0);
				for (Node node = aClass312_7989.method3613(i_24_ + 65279); node != null; node = aClass312_7989.method3620(16776960)) {
					Node_Sub24 node_sub24 = (Node_Sub24) node;
					node_sub24.method2646(i_27_, i, (byte) 51, i_25_, bools);
				}
				anAbstractToolkit8004.method1304(0, 0, Class106.aClass135_1354);
				anAbstractToolkit8004.method1366((byte) 100, Class106.aClass135_1354, 0);
				anAbstractToolkit8004.method1312((byte) -21, null);
				anAbstractToolkit8004.L(i_39_, i_40_, anAbstractToolkit8004.anInt6372);
			}
			if (aClass263_8008 != null) {
				anAbstractToolkit8004.method1354(0, 32011, anInterface15_Impl2_8018);
				anAbstractToolkit8004.method1354(1, i_24_ ^ 0x7d0a, anInterface15_Impl2_8020);
				anAbstractToolkit8004.method1338(aClass213_8017, 9422);
				aClass263_8008.method3218(bools, i_25_, i, i_27_, bool, i_24_ + -2);
			}
		}
	}
	
	final void YA() {
		anInt7991++;
		if ((anInt8023 ^ 0xffffffff) >= -1) {
			aClass263_8008 = null;
		} else {
			byte[][] bs = new byte[1 + anInt3408][1 + anInt3404];
			for (int i = 1; (i ^ 0xffffffff) > (anInt3408 ^ 0xffffffff); i++) {
				for (int i_41_ = 1; i_41_ < anInt3404; i_41_++)
					bs[i][i_41_] = (byte) ((aByteArrayArray8026[i][i_41_ - -1] >> 3) + ((aByteArrayArray8026[-1 + i][i_41_] >> 2) + ((aByteArrayArray8026[i - -1][i_41_] >> 3) + ((aByteArrayArray8026[i][i_41_ - 1] >> 2) + (aByteArrayArray8026[i][i_41_] >> 1)))));
			}
			Node_Sub54[] node_sub54s = new Node_Sub54[aHashTable8022.method1519((byte) -90)];
			aHashTable8022.method1523((byte) -126, node_sub54s);
			for (int i = 0; (node_sub54s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				node_sub54s[i].method2984((byte) 74, anInt8023);
			int i = 20;
			if (anIntArrayArrayArray8002 != null) {
				i += 4;
			}
			if ((anInt7981 & 0x7 ^ 0xffffffff) != -1) {
				i += 12;
			}
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = anAbstractToolkit8004.aNativeHeap6084.a(anInt8023 * 4, false);
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer_42_ = anAbstractToolkit8004.aNativeHeap6084.a(anInt8023 * i, false);
			Stream stream = new Stream(nativeheapbuffer_42_);
			Stream stream_43_ = new Stream(nativeheapbuffer);
			Node_Sub54[] node_sub54s_44_ = new Node_Sub54[anInt8023];
			int i_45_ = Class215.method2072(anInt8023 / 4, true);
			if (i_45_ < 1) {
				i_45_ = 1;
			}
			HashTable hashtable = new HashTable(i_45_);
			Node_Sub54[] node_sub54s_46_ = new Node_Sub54[anInt8016];
			for (int i_47_ = 0; anInt3408 > i_47_; i_47_++) {
				for (int i_48_ = 0; anInt3404 > i_48_; i_48_++) {
					if (anIntArrayArrayArray8006[i_47_][i_48_] != null) {
						Node_Sub54[] node_sub54s_49_ = aNode_Sub54ArrayArrayArray8007[i_47_][i_48_];
						int[] is = anIntArrayArrayArray7986[i_47_][i_48_];
						int[] is_50_ = anIntArrayArrayArray7997[i_47_][i_48_];
						int[] is_51_ = anIntArrayArrayArray8013[i_47_][i_48_];
						int[] is_52_ = anIntArrayArrayArray8006[i_47_][i_48_];
						int[] is_53_ = anIntArrayArrayArray7995 == null ? null : anIntArrayArrayArray7995[i_47_][i_48_];
						if (is_51_ == null) {
							is_51_ = is_52_;
						}
						int[] is_54_ = anIntArrayArrayArray8002 == null ? null : anIntArrayArrayArray8002[i_47_][i_48_];
						float f = aFloatArrayArray8019[i_47_][i_48_];
						float f_55_ = aFloatArrayArray8021[i_47_][i_48_];
						float f_56_ = aFloatArrayArray8025[i_47_][i_48_];
						float f_57_ = aFloatArrayArray8019[i_47_][i_48_ - -1];
						float f_58_ = aFloatArrayArray8021[i_47_][1 + i_48_];
						float f_59_ = aFloatArrayArray8025[i_47_][i_48_ + 1];
						float f_60_ = aFloatArrayArray8019[i_47_ + 1][1 + i_48_];
						float f_61_ = aFloatArrayArray8021[1 + i_47_][1 + i_48_];
						float f_62_ = aFloatArrayArray8025[i_47_ - -1][1 + i_48_];
						float f_63_ = aFloatArrayArray8019[i_47_ - -1][i_48_];
						float f_64_ = aFloatArrayArray8021[i_47_ - -1][i_48_];
						float f_65_ = aFloatArrayArray8025[1 + i_47_][i_48_];
						int i_66_ = bs[i_47_][i_48_] & 0xff;
						int i_67_ = 0xff & bs[i_47_][1 + i_48_];
						int i_68_ = 0xff & bs[1 + i_47_][1 + i_48_];
						int i_69_ = bs[i_47_ + 1][i_48_] & 0xff;
						int i_70_ = 0;
					while_236_:
						for (int i_71_ = 0; i_71_ < is_52_.length; i_71_++) {
							Node_Sub54 node_sub54 = node_sub54s_49_[i_71_];
							for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (i_70_ ^ 0xffffffff); i_72_++) {
								if (node_sub54 == node_sub54s_46_[i_72_]) {
									continue while_236_;
								}
							}
							node_sub54s_46_[i_70_++] = node_sub54;
						}
						short[] ses = aShortArrayArray7985[i_47_ + anInt3408 * i_48_] = new short[is_52_.length];
						for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > (is_52_.length ^ 0xffffffff); i_73_++) {
							int i_74_ = (i_47_ << anInt3410) - -is[i_73_];
							int i_75_ = (i_48_ << anInt3410) - -is_50_[i_73_];
							int i_76_ = i_74_ >> anInt7993;
							int i_77_ = i_75_ >> anInt7993;
							int i_78_ = is_52_[i_73_];
							int i_79_ = is_51_[i_73_];
							int i_80_ = is_53_ == null ? 0 : is_53_[i_73_];
							long l = (long) i_79_ << 48 | (long) i_78_ << 32 | (long) (i_76_ << 16) | (long) i_77_;
							int i_81_ = is[i_73_];
							int i_82_ = is_50_[i_73_];
							int i_83_ = 74;
							int i_84_ = 0;
							float f_85_ = 1.0F;
							float f_86_;
							float f_87_;
							float f_88_;
							if ((i_81_ ^ 0xffffffff) == -1 && (i_82_ ^ 0xffffffff) == -1) {
								f_86_ = f_55_;
								f_88_ = f_56_;
								f_87_ = f;
								i_83_ -= i_66_;
							} else if (i_81_ == 0 && (anInt3398 ^ 0xffffffff) == (i_82_ ^ 0xffffffff)) {
								f_86_ = f_58_;
								i_83_ -= i_67_;
								f_87_ = f_57_;
								f_88_ = f_59_;
							} else if (anInt3398 == i_81_ && (anInt3398 ^ 0xffffffff) == (i_82_ ^ 0xffffffff)) {
								f_86_ = f_61_;
								f_87_ = f_60_;
								f_88_ = f_62_;
								i_83_ -= i_68_;
							} else if (i_81_ != anInt3398 || i_82_ != 0) {
								float f_89_ = (float) i_81_ / (float) anInt3398;
								float f_90_ = (float) i_82_ / (float) anInt3398;
								float f_91_ = (-f + f_63_) * f_89_ + f;
								float f_92_ = f_89_ * (-f_55_ + f_64_) + f_55_;
								float f_93_ = f_89_ * (f_65_ - f_56_) + f_56_;
								float f_94_ = f_57_ + f_89_ * (-f_57_ + f_60_);
								float f_95_ = f_89_ * (f_61_ - f_58_) + f_58_;
								f_86_ = f_92_ + (f_95_ - f_92_) * f_90_;
								float f_96_ = (-f_59_ + f_62_) * f_89_ + f_59_;
								f_87_ = (-f_91_ + f_94_) * f_90_ + f_91_;
								f_88_ = f_93_ + f_90_ * (-f_93_ + f_96_);
								int i_97_ = (i_81_ * (-i_66_ + i_69_) >> anInt3410) + i_66_;
								int i_98_ = i_67_ - -((i_68_ - i_67_) * i_81_ >> anInt3410);
								i_83_ -= i_97_ + (i_82_ * (-i_97_ + i_98_) >> anInt3410);
							} else {
								f_88_ = f_65_;
								i_83_ -= i_69_;
								f_86_ = f_64_;
								f_87_ = f_63_;
							}
							if ((i_78_ ^ 0xffffffff) != 0) {
								int i_99_ = i_83_ * (0x7f & i_78_) >> 7;
								if (i_99_ < 2) {
									i_99_ = 2;
								} else if ((i_99_ ^ 0xffffffff) < -127) {
									i_99_ = 126;
								}
								i_84_ = Class85.anIntArray1158[i_78_ & 0xff80 | i_99_];
								if ((anInt7981 & 0x7 ^ 0xffffffff) == -1) {
									f_85_ = anAbstractToolkit8004.aFloatArray6292[0] * f_87_ + f_86_ * anAbstractToolkit8004.aFloatArray6292[1] + anAbstractToolkit8004.aFloatArray6292[2] * f_88_;
									f_85_ = f_85_ * (f_85_ > 0.0F ? anAbstractToolkit8004.aFloat6274 : anAbstractToolkit8004.aFloat6272) + anAbstractToolkit8004.aFloat6300;
								}
							}
							Node node = null;
							if ((-1 + anInt7982 & i_74_ ^ 0xffffffff) == -1 && (-1 + anInt7982 & i_75_ ^ 0xffffffff) == -1) {
								node = hashtable.method1518(3512, l);
							}
							int i_100_;
							if (node != null) {
								ses[i_73_] = ((Node_Sub46) node).aShort7554;
								i_100_ = 0xffff & ses[i_73_];
								if (i_78_ != -1 && (node_sub54s_44_[i_100_].aLong2797 ^ 0xffffffffffffffffL) < (node_sub54s_49_[i_73_].aLong2797 ^ 0xffffffffffffffffL)) {
									node_sub54s_44_[i_100_] = node_sub54s_49_[i_73_];
								}
							} else {
								int i_101_;
								if ((i_79_ ^ 0xffffffff) == (i_78_ ^ 0xffffffff)) {
									i_101_ = i_84_;
								} else {
									int i_102_ = (i_79_ & 0x7f) * i_83_ >> 7;
									if (i_102_ < 2) {
										i_102_ = 2;
									} else if (i_102_ > 126) {
										i_102_ = 126;
									}
									i_101_ = Class85.anIntArray1158[i_102_ | 0xff80 & i_79_];
									if ((0x7 & anInt7981) == 0) {
										float f_103_ = anAbstractToolkit8004.aFloatArray6292[2] * f_88_ + (anAbstractToolkit8004.aFloatArray6292[1] * f_86_ + f_87_ * anAbstractToolkit8004.aFloatArray6292[0]);
										f_103_ = anAbstractToolkit8004.aFloat6300 + (!(f_85_ > 0.0F) ? anAbstractToolkit8004.aFloat6272 : anAbstractToolkit8004.aFloat6274) * f_85_;
										int i_104_ = (i_101_ & 0xff133d) >> 16;
										int i_105_ = (0xff6b & i_101_) >> 8;
										i_104_ *= f_103_;
										int i_106_ = 0xff & i_101_;
										if ((i_104_ ^ 0xffffffff) > -1) {
											i_104_ = 0;
										} else if ((i_104_ ^ 0xffffffff) < -256) {
											i_104_ = 255;
										}
										i_105_ *= f_103_;
										if (i_105_ >= 0) {
											if (i_105_ > 255) {
												i_105_ = 255;
											}
										} else {
											i_105_ = 0;
										}
										i_106_ *= f_103_;
										if (i_106_ >= 0) {
											if (i_106_ > 255) {
												i_106_ = 255;
											}
										} else {
											i_106_ = 0;
										}
										i_101_ = i_106_ | (i_104_ << 16 | i_105_ << 8);
									}
								}
								if (Stream.b()) {
									stream.a((float) i_74_);
									stream.a((float) (i_80_ + this.method3260(i_75_, -120, i_74_)));
									stream.a((float) i_75_);
									stream.a((float) i_74_);
									stream.a((float) i_75_);
									if (anIntArrayArrayArray8002 != null) {
										stream.a((float) (is_54_ != null ? is_54_[i_73_] + -1 : 0));
									}
									if ((0x7 & anInt7981 ^ 0xffffffff) != -1) {
										stream.a(f_87_);
										stream.a(f_86_);
										stream.a(f_88_);
									}
								} else {
									stream.b((float) i_74_);
									stream.b((float) (this.method3260(i_75_, -109, i_74_) - -i_80_));
									stream.b((float) i_75_);
									stream.b((float) i_74_);
									stream.b((float) i_75_);
									if (anIntArrayArrayArray8002 != null) {
										stream.b((float) (is_54_ == null ? 0 : is_54_[i_73_] - 1));
									}
									if ((anInt7981 & 0x7) != 0) {
										stream.b(f_87_);
										stream.b(f_86_);
										stream.b(f_88_);
									}
								}
								if ((anAbstractToolkit8004.anInt6360 ^ 0xffffffff) == -1) {
									stream_43_.a(i_101_ | ~0xffffff);
								} else {
									stream_43_.e(i_101_ | ~0xffffff);
								}
								i_100_ = anInt8010++;
								ses[i_73_] = (short) i_100_;
								if (i_78_ != -1) {
									node_sub54s_44_[i_100_] = node_sub54s_49_[i_73_];
								}
								hashtable.method1515(l, new Node_Sub46(ses[i_73_]), -125);
							}
							for (int i_107_ = 0; i_107_ < i_70_; i_107_++)
								node_sub54s_46_[i_107_].method2989(i_84_, i_83_, f_85_, 39, i_100_);
							anInt8009++;
						}
					}
				}
			}
			for (int i_108_ = 0; i_108_ < anInt8010; i_108_++) {
				Node_Sub54 node_sub54 = node_sub54s_44_[i_108_];
				if (node_sub54 != null) {
					node_sub54.method2980(i_108_, 1);
				}
			}
			for (int i_109_ = 0; anInt3408 > i_109_; i_109_++) {
				for (int i_110_ = 0; i_110_ < anInt3404; i_110_++) {
					short[] ses = aShortArrayArray7985[i_110_ * anInt3408 + i_109_];
					if (ses != null) {
						int i_111_ = 0;
						int i_112_ = 0;
						while ((ses.length ^ 0xffffffff) < (i_112_ ^ 0xffffffff)) {
							int i_113_ = 0xffff & ses[i_112_++];
							int i_114_ = ses[i_112_++] & 0xffff;
							int i_115_ = ses[i_112_++] & 0xffff;
							Node_Sub54 node_sub54 = node_sub54s_44_[i_113_];
							Node_Sub54 node_sub54_116_ = node_sub54s_44_[i_114_];
							Node_Sub54 node_sub54_117_ = node_sub54s_44_[i_115_];
							Node_Sub54 node_sub54_118_ = null;
							if (node_sub54 != null) {
								node_sub54_118_ = node_sub54;
								node_sub54.method2986(i_109_, 21883, i_111_, i_110_);
							}
							if (node_sub54_116_ != null) {
								node_sub54_116_.method2986(i_109_, 21883, i_111_, i_110_);
								if (node_sub54_118_ == null || node_sub54_116_.aLong2797 < node_sub54_118_.aLong2797) {
									node_sub54_118_ = node_sub54_116_;
								}
							}
							if (node_sub54_117_ != null) {
								node_sub54_117_.method2986(i_109_, 21883, i_111_, i_110_);
								if (node_sub54_118_ == null || node_sub54_118_.aLong2797 > node_sub54_117_.aLong2797) {
									node_sub54_118_ = node_sub54_117_;
								}
							}
							if (node_sub54_118_ != null) {
								if (node_sub54 != null) {
									node_sub54_118_.method2980(i_113_, 1);
								}
								if (node_sub54_116_ != null) {
									node_sub54_118_.method2980(i_114_, 1);
								}
								if (node_sub54_117_ != null) {
									node_sub54_118_.method2980(i_115_, 1);
								}
								node_sub54_118_.method2986(i_109_, 21883, i_111_, i_110_);
							}
							i_111_++;
						}
					}
				}
			}
			stream.c();
			stream_43_.c();
			anInterface15_Impl2_8020 = anAbstractToolkit8004.method1380(2, false);
			anInterface15_Impl2_8020.method36(4, 4 * anInt8010, nativeheapbuffer, 1965);
			anInterface15_Impl2_8018 = anAbstractToolkit8004.method1380(2, false);
			anInterface15_Impl2_8018.method36(i, anInt8010 * i, nativeheapbuffer_42_, 1965);
			if ((anInt7981 & 0x7) == 0) {
				if (anIntArrayArrayArray8002 == null) {
					aClass213_8017 = anAbstractToolkit8004.method1372((byte) -120, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628 }), new Class207(Class126.aClass126_1626) });
				} else {
					aClass213_8017 = anAbstractToolkit8004.method1372((byte) -119, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628, Class126.aClass126_1627 }), new Class207(Class126.aClass126_1626) });
				}
			} else if (anIntArrayArrayArray8002 != null) {
				aClass213_8017 = anAbstractToolkit8004.method1372((byte) -119, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628, Class126.aClass126_1627, Class126.aClass126_1625 }), new Class207(Class126.aClass126_1626) });
			} else {
				aClass213_8017 = anAbstractToolkit8004.method1372((byte) -121, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628, Class126.aClass126_1625 }), new Class207(Class126.aClass126_1626) });
			}
			int i_119_ = 0;
			for (int i_120_ = 0; (i_120_ ^ 0xffffffff) > (node_sub54s.length ^ 0xffffffff); i_120_++) {
				if (node_sub54s[i_120_].anInt7692 > 0) {
					node_sub54s[i_119_++] = node_sub54s[i_120_];
				}
			}
			aNode_Sub54Array8024 = new Node_Sub54[i_119_];
			long[] ls = new long[i_119_];
			for (int i_121_ = 0; (i_119_ ^ 0xffffffff) < (i_121_ ^ 0xffffffff); i_121_++) {
				Node_Sub54 node_sub54 = node_sub54s[i_121_];
				ls[i_121_] = node_sub54.aLong2797;
				aNode_Sub54Array8024[i_121_] = node_sub54;
				node_sub54.method2988((byte) -119, anInt8010);
			}
			ObjectDefinition.method3045(ls, aNode_Sub54Array8024, false);
			if (aClass263_8008 != null) {
				aClass263_8008.method3224((byte) 122);
			}
		}
		aNode_Sub54ArrayArrayArray8007 = null;
		anIntArrayArrayArray8002 = null;
		aByteArrayArray8026 = null;
		anIntArrayArrayArray7986 = anIntArrayArrayArray7997 = null;
		anIntArrayArrayArray8006 = null;
		anIntArrayArrayArray8013 = null;
		aFloatArrayArray8019 = aFloatArrayArray8021 = aFloatArrayArray8025 = null;
		anIntArrayArrayArray7995 = null;
		aHashTable8022 = null;
	}
	
	final void method3257(int i, int i_122_) {
		anInt7992++;
	}
	
	StandardPlane(AbstractToolkit abstracttoolkit, int i, int i_123_, int i_124_, int i_125_, int[][] is, int[][] is_126_, int i_127_) {
		super(i_124_, i_125_, i_127_, is);
		anAbstractToolkit8004 = abstracttoolkit;
		anInt7993 = -2 + anInt3410;
		anIntArrayArrayArray8013 = new int[i_124_][i_125_][];
		anIntArrayArrayArray7986 = new int[i_124_][i_125_][];
		anIntArrayArrayArray8006 = new int[i_124_][i_125_][];
		aByteArrayArray8026 = new byte[1 + i_124_][1 + i_125_];
		anInt7982 = 1 << anInt7993;
		aShortArrayArray7985 = new short[i_125_ * i_124_][];
		aFloatArrayArray8021 = new float[1 + anInt3408][anInt3404 - -1];
		aFloatArrayArray8019 = new float[1 + anInt3408][anInt3404 - -1];
		aByteArrayArray7996 = new byte[i_124_][i_125_];
		anIntArrayArrayArray7995 = new int[i_124_][i_125_][];
		anInt7981 = i_123_;
		anIntArrayArrayArray7997 = new int[i_124_][i_125_][];
		aNode_Sub54ArrayArrayArray8007 = new Node_Sub54[i_124_][i_125_][];
		aFloatArrayArray8025 = new float[1 + anInt3408][anInt3404 + 1];
		for (int i_128_ = 0; i_128_ <= anInt3404; i_128_++) {
			for (int i_129_ = 0; (i_129_ ^ 0xffffffff) >= (anInt3408 ^ 0xffffffff); i_129_++) {
				int i_130_ = anIntArrayArray3407[i_129_][i_128_];
				if (aFloat7988 > (float) i_130_) {
					aFloat7988 = (float) i_130_;
				}
				if ((float) i_130_ > aFloat7987) {
					aFloat7987 = (float) i_130_;
				}
				if (i_129_ > 0 && (i_128_ ^ 0xffffffff) < -1 && i_129_ < anInt3408 && (i_128_ ^ 0xffffffff) > (anInt3404 ^ 0xffffffff)) {
					int i_131_ = -is_126_[i_129_ + -1][i_128_] + is_126_[i_129_ + 1][i_128_];
					int i_132_ = is_126_[i_129_][1 + i_128_] - is_126_[i_129_][-1 + i_128_];
					float f = (float) (1.0 / Math.sqrt((double) (i_132_ * i_132_ + i_131_ * i_131_ + 4 * (i_127_ * i_127_))));
					aFloatArrayArray8019[i_129_][i_128_] = f * (float) i_131_;
					aFloatArrayArray8021[i_129_][i_128_] = f * (float) (2 * -i_127_);
					aFloatArrayArray8025[i_129_][i_128_] = f * (float) i_132_;
				}
			}
		}
		aFloat7988--;
		aFloat7987++;
		aHashTable8022 = new HashTable(128);
		if ((anInt7981 & 0x10) != 0) {
			aClass263_8008 = new Class263(anAbstractToolkit8004, this);
		}
	}
	
	final void method3250(Node_Sub29 node_sub29, int[] is) {
		anInt8000++;
		aClass312_7989.method3625((byte) -54, new Node_Sub24(anAbstractToolkit8004, this, node_sub29, is));
	}
	
	final void wa(r var_r, int i, int i_133_, int i_134_, int i_135_, boolean bool) {
		anInt8005++;
		if (aClass263_8008 != null && var_r != null) {
			int i_136_ = i + -(i_133_ * anAbstractToolkit8004.anInt6337 >> 8) >> anAbstractToolkit8004.anInt6350;
			int i_137_ = i_134_ + -(anAbstractToolkit8004.anInt6286 * i_133_ >> 8) >> anAbstractToolkit8004.anInt6350;
			aClass263_8008.method3220(var_r, -95, i_136_, i_137_);
		}
	}
	
	final void method3255(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, boolean[][] bools) {
		anInt8001++;
		if ((anInt8023 ^ 0xffffffff) < -1) {
			Interface15_Impl1 interface15_impl1 = anAbstractToolkit8004.method1298(0, anInt8009);
			int i_144_ = 0;
			int i_145_ = 32767;
			int i_146_ = -32768;
			for (int i_147_ = 0; i_147_ < 4; i_147_++) {
				i_144_ = 0;
				jaclib.memory.Buffer buffer = interface15_impl1.method54(true, (byte) 82);
				if (buffer != null) {
					Stream stream = anAbstractToolkit8004.method1324(true, buffer);
					if (!Stream.b()) {
						for (int i_148_ = i_141_; i_143_ > i_148_; i_148_++) {
							int i_149_ = i_140_ + anInt3408 * i_148_;
							for (int i_150_ = i_140_; (i_142_ ^ 0xffffffff) < (i_150_ ^ 0xffffffff); i_150_++) {
								if (bools[-i_140_ + i_150_][-i_141_ + i_148_]) {
									short[] ses = aShortArrayArray7985[i_149_];
									if (ses != null) {
										for (int i_151_ = 0; (i_151_ ^ 0xffffffff) > (ses.length ^ 0xffffffff); i_151_++) {
											int i_152_ = ses[i_151_] & 0xffff;
											stream.c(i_152_);
											i_144_++;
											if ((i_152_ ^ 0xffffffff) < (i_146_ ^ 0xffffffff)) {
												i_146_ = i_152_;
											}
											if (i_145_ > i_152_) {
												i_145_ = i_152_;
											}
										}
									}
								}
								i_149_++;
							}
						}
					} else {
						for (int i_153_ = i_141_; i_153_ < i_143_; i_153_++) {
							int i_154_ = i_140_ + i_153_ * anInt3408;
							for (int i_155_ = i_140_; i_155_ < i_142_; i_155_++) {
								if (bools[i_155_ + -i_140_][-i_141_ + i_153_]) {
									short[] ses = aShortArrayArray7985[i_154_];
									if (ses != null) {
										for (int i_156_ = 0; (ses.length ^ 0xffffffff) < (i_156_ ^ 0xffffffff); i_156_++) {
											int i_157_ = 0xffff & ses[i_156_];
											if (i_157_ > i_146_) {
												i_146_ = i_157_;
											}
											i_144_++;
											if (i_145_ > i_157_) {
												i_145_ = i_157_;
											}
											stream.b(i_157_);
										}
									}
								}
								i_154_++;
							}
						}
					}
					stream.c();
					if (interface15_impl1.method53(-3308)) {
						break;
					}
				}
			}
			if ((i_144_ ^ 0xffffffff) < -1) {
				anAbstractToolkit8004.method1376(530);
				anAbstractToolkit8004.method1371(false, false);
				anAbstractToolkit8004.method1296(121, false);
				anAbstractToolkit8004.method1347(1, false);
				anAbstractToolkit8004.method1307(-95, false);
				anAbstractToolkit8004.method1277((byte) 61, 0);
				anAbstractToolkit8004.method1332(3, false, -2, false);
				anAbstractToolkit8004.method1312((byte) -21, null);
				Class336_Sub1 class336_sub1 = anAbstractToolkit8004.method1264(false);
				float[] fs = anAbstractToolkit8004.method1357((byte) 86);
				fs[13] = 1.0F - ((float) (i_138_ * 2) + (float) (i_139_ * i_143_) / 128.0F) / (float) anAbstractToolkit8004.anInt6124;
				fs[2] = 0.0F;
				fs[4] = 0.0F;
				fs[9] = 0.0F;
				fs[8] = 0.0F;
				fs[7] = 0.0F;
				fs[11] = 0.0F;
				fs[5] = (float) i_139_ / (128.0F * (float) anInt3398 * (float) anAbstractToolkit8004.anInt6124);
				fs[0] = (float) i_139_ / ((float) anInt3398 * 128.0F * (float) anAbstractToolkit8004.anInt6239);
				fs[12] = -1.0F - ((float) (i_140_ * i_139_) / 128.0F - (float) (i * 2)) / (float) anAbstractToolkit8004.anInt6239;
				fs[1] = 0.0F;
				fs[14] = -aFloat7988 / (-aFloat7988 + aFloat7987);
				fs[6] = 0.0F;
				fs[10] = 1.0F / (-aFloat7988 + aFloat7987);
				fs[3] = 0.0F;
				fs[15] = 1.0F;
				class336_sub1.method3880(0.0F, (byte) 88, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				anAbstractToolkit8004.method1339(103);
				anAbstractToolkit8004.method1266((byte) 119);
				if ((0x7 & anInt7981) != 0) {
					anAbstractToolkit8004.method1296(123, true);
					anAbstractToolkit8004.method1382(119);
				} else {
					anAbstractToolkit8004.method1296(115, false);
				}
				anAbstractToolkit8004.method1365(false, (byte) -117);
				anAbstractToolkit8004.method1354(0, 32011, anInterface15_Impl2_8018);
				anAbstractToolkit8004.method1354(1, 32011, anInterface15_Impl2_8020);
				anAbstractToolkit8004.method1338(aClass213_8017, 9422);
				anAbstractToolkit8004.method1276(i_145_, (byte) -68, 0, interface15_impl1, 1 + (-i_145_ + i_146_), Class55.aClass104_833, i_144_ / 3);
				anAbstractToolkit8004.method1365(true, (byte) -116);
			}
		}
	}
	
	final boolean method3256(r var_r, int i, int i_158_, int i_159_, int i_160_, boolean bool) {
		anInt8014++;
		if (aClass263_8008 == null || var_r == null) {
			return false;
		}
		int i_161_ = -(anAbstractToolkit8004.anInt6337 * i_158_ >> 8) + i >> anAbstractToolkit8004.anInt6350;
		int i_162_ = i_159_ + -(i_158_ * anAbstractToolkit8004.anInt6286 >> 8) >> anAbstractToolkit8004.anInt6350;
		return aClass263_8008.method3221(i_161_, var_r, i_162_, (byte) -96);
	}
	
	final void method3253(int i, int i_163_, int[] is, int[] is_164_, int[] is_165_, int[] is_166_, int[] is_167_, int[] is_168_, int[] is_169_, int[] is_170_, int[] is_171_, int[] is_172_, int[] is_173_, int i_174_, int i_175_, int i_176_, boolean bool) {
		anInt8015++;
		int i_177_ = is_170_.length;
		int[] is_178_ = new int[3 * i_177_];
		int[] is_179_ = new int[3 * i_177_];
		int[] is_180_ = new int[i_177_ * 3];
		int[] is_181_ = new int[i_177_ * 3];
		int[] is_182_ = new int[3 * i_177_];
		int[] is_183_ = new int[i_177_ * 3];
		int[] is_184_ = is_164_ == null ? null : new int[i_177_ * 3];
		int[] is_185_ = is_166_ == null ? null : new int[3 * i_177_];
		int i_186_ = 0;
		for (int i_187_ = 0; i_187_ < i_177_; i_187_++) {
			int i_188_ = is_167_[i_187_];
			int i_189_ = is_168_[i_187_];
			int i_190_ = is_169_[i_187_];
			is_178_[i_186_] = is[i_188_];
			is_179_[i_186_] = is_165_[i_188_];
			is_180_[i_186_] = is_170_[i_187_];
			is_182_[i_186_] = is_172_[i_187_];
			is_183_[i_186_] = is_173_[i_187_];
			is_181_[i_186_] = is_171_ != null ? is_171_[i_187_] : is_170_[i_187_];
			if (is_164_ != null) {
				is_184_[i_186_] = is_164_[i_188_];
			}
			if (is_166_ != null) {
				is_185_[i_186_] = is_166_[i_188_];
			}
			i_186_++;
			is_178_[i_186_] = is[i_189_];
			is_179_[i_186_] = is_165_[i_189_];
			is_180_[i_186_] = is_170_[i_187_];
			is_182_[i_186_] = is_172_[i_187_];
			is_183_[i_186_] = is_173_[i_187_];
			is_181_[i_186_] = is_171_ == null ? is_170_[i_187_] : is_171_[i_187_];
			if (is_164_ != null) {
				is_184_[i_186_] = is_164_[i_189_];
			}
			if (is_166_ != null) {
				is_185_[i_186_] = is_166_[i_189_];
			}
			i_186_++;
			is_178_[i_186_] = is[i_190_];
			is_179_[i_186_] = is_165_[i_190_];
			is_180_[i_186_] = is_170_[i_187_];
			is_182_[i_186_] = is_172_[i_187_];
			is_183_[i_186_] = is_173_[i_187_];
			is_181_[i_186_] = is_171_ == null ? is_170_[i_187_] : is_171_[i_187_];
			if (is_164_ != null) {
				is_184_[i_186_] = is_164_[i_190_];
			}
			if (is_166_ != null) {
				is_185_[i_186_] = is_166_[i_190_];
			}
			i_186_++;
		}
		U(i, i_163_, is_178_, is_184_, is_179_, is_185_, is_180_, is_181_, is_182_, is_183_, i_174_, i_175_, i_176_, bool);
	}
	
	public static void method3274(byte b) {
		if (b != 66) {
			method3274((byte) 51);
		}
		anIntArray7980 = null;
	}
	
	private final void method3275(int i, int i_191_, r_Sub1 var_r_Sub1, int i_192_) {
		anInt8011++;
		int[] is = anIntArrayArrayArray7986[i][i_191_];
		int[] is_193_ = anIntArrayArrayArray7997[i][i_191_];
		int i_194_ = is.length;
		if ((Node_Sub23.anIntArray7200.length ^ 0xffffffff) > (i_194_ ^ 0xffffffff)) {
			Node_Sub23.anIntArray7200 = new int[i_194_];
			Node_Sub38_Sub27.anIntArray10372 = new int[i_194_];
		}
		for (int i_195_ = 0; i_194_ > i_195_; i_195_++) {
			Node_Sub23.anIntArray7200[i_195_] = is[i_195_] >> anAbstractToolkit8004.anInt6350;
			Node_Sub38_Sub27.anIntArray10372[i_195_] = is_193_[i_195_] >> anAbstractToolkit8004.anInt6350;
		}
		int i_196_ = 0;
		if (i_192_ != 6778) {
			aFloat7987 = -0.91155654F;
		}
		while (i_194_ > i_196_) {
			int i_197_ = Node_Sub23.anIntArray7200[i_196_];
			int i_198_ = Node_Sub38_Sub27.anIntArray10372[i_196_++];
			int i_199_ = Node_Sub23.anIntArray7200[i_196_];
			int i_200_ = Node_Sub38_Sub27.anIntArray10372[i_196_++];
			int i_201_ = Node_Sub23.anIntArray7200[i_196_];
			int i_202_ = Node_Sub38_Sub27.anIntArray10372[i_196_++];
			if ((-((-i_199_ + i_201_) * (-i_198_ + i_200_)) + (-i_199_ + i_197_) * (i_200_ + -i_202_) ^ 0xffffffff) < -1) {
				var_r_Sub1.method2368(i_201_, i_199_, i_197_, -128, i_200_, i_198_, i_202_);
			}
		}
	}
	
	final void CA(r var_r, int i, int i_203_, int i_204_, int i_205_, boolean bool) {
		anInt7999++;
		if (aClass263_8008 != null && var_r != null) {
			int i_206_ = i + -(anAbstractToolkit8004.anInt6337 * i_203_ >> 8) >> anAbstractToolkit8004.anInt6350;
			int i_207_ = i_204_ + -(i_203_ * anAbstractToolkit8004.anInt6286 >> 8) >> anAbstractToolkit8004.anInt6350;
			aClass263_8008.method3222(var_r, i_207_, i_206_, 0);
		}
	}
	
	final r fa(int i, int i_208_, r var_r) {
		anInt7998++;
		if ((0x1 & aByteArrayArray7996[i][i_208_]) == 0) {
			return null;
		}
		int i_209_ = anInt3398 >> anAbstractToolkit8004.anInt6350;
		r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
		r_Sub1 var_r_Sub1_210_;
		if (var_r_Sub1 == null || !var_r_Sub1.method2363(i_209_, false, i_209_)) {
			var_r_Sub1_210_ = new r_Sub1(anAbstractToolkit8004, i_209_, i_209_);
		} else {
			var_r_Sub1_210_ = var_r_Sub1;
			var_r_Sub1_210_.method2367((byte) 0);
		}
		var_r_Sub1_210_.method2365(0, i_209_, i_209_, 0, 72);
		method3275(i, i_208_, var_r_Sub1_210_, 6778);
		return var_r_Sub1_210_;
	}
}
