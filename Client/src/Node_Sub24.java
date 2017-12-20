/* Node_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Node_Sub24 extends Node
{
	private float[][] aFloatArrayArray7206;
	static int anInt7207;
	private Interface15_Impl1 anInterface15_Impl1_7208;
	private HashTable aHashTable7209;
	private int anInt7210;
	private Stream aStream7211;
	private int anInt7212;
	private int anInt7213;
	static IncommingPacket aClass192_7214 = new IncommingPacket(27, 0);
	private int anInt7215;
	static int anInt7216;
	private StandardPlane aStandardPlane7217;
	private Interface15_Impl2 anInterface15_Impl2_7218;
	private int anInt7219;
	private float[][] aFloatArrayArray7220;
	private int anInt7221;
	static int anInt7222;
	static int anInt7223;
	static int anInt7224;
	static int anInt7225;
	static int anInt7226;
	private float[][] aFloatArrayArray7227;
	static int anInt7228;
	static int anInt7229;
	private AbstractToolkit anAbstractToolkit7230;
	private Node_Sub29 aNode_Sub29_7231;
	private Stream aStream7232;
	
	static final void method2642(byte b) {
		anInt7225++;
		synchronized (Node_Sub36_Sub4.aClass61_10065) {
			if (b < 33) {
				return;
			}
			Node_Sub36_Sub4.aClass61_10065.method608(false);
		}
		synchronized (CacheNode_Sub3.aClass61_9446) {
			CacheNode_Sub3.aClass61_9446.method608(false);
		}
	}
	
	private final void method2643(byte b, short s) {
		if (!Stream.b()) {
			aStream7211.c(s);
		} else {
			aStream7211.b(s);
		}
		anInt7226++;
		if (b != 19) {
			method2642((byte) -26);
		}
	}
	
	static final void method2644(byte b) {
		anInt7224++;
		if (Node_Sub38_Sub1.aClass329_10086 != CacheNode_Sub2.aClass329_9436) {
			do {
				try {
					Class2.method167("tbrefresh", Class158.aClient1983, (byte) -85);
					if (b == -42) {
						break;
					}
					method2647((byte) -4, -0.23702288F, -0.5243241F, 2.32522F, 0.43047276F, 76, null, -8, 103, -0.710538F, 110, null, 59);
				} catch (Throwable throwable) {
					break;
				}
				break;
			} while (false);
		}
	}
	
	private final void method2645(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt7207++;
		long l = -1L;
		int i_6_ = (i_3_ << aStandardPlane7217.anInt3410) + i_4_;
		int i_7_ = (i_1_ << aStandardPlane7217.anInt3410) + i_2_;
		int i_8_ = aStandardPlane7217.method3260(i_7_, -115, i_6_);
		if ((0x7f & i_4_) == 0 || (i_2_ & 0x7f ^ 0xffffffff) == -1) {
			l = (long) i_6_ & 0xffffL | 65535L << 16 & (long) i_7_ << 16;
			Node node = aHashTable7209.method1518(3512, l);
			if (node != null) {
				method2643((byte) 19, ((Node_Sub46) node).aShort7554);
				return;
			}
		}
		short s = (short) anInt7221++;
		if (l != -1L) {
			aHashTable7209.method1515(l, new Node_Sub46(s), -125);
		}
		float f;
		float f_9_;
		float f_10_;
		if (i_4_ == 0 && i_2_ == 0) {
			f_10_ = aFloatArrayArray7220[i_0_][i_5_];
			f_9_ = aFloatArrayArray7206[i_0_][i_5_];
			f = aFloatArrayArray7227[i_0_][i_5_];
		} else if ((aStandardPlane7217.anInt3398 ^ 0xffffffff) == (i_4_ ^ 0xffffffff) && (i_2_ ^ 0xffffffff) == -1) {
			f = aFloatArrayArray7227[i_0_ - -1][i_5_];
			f_9_ = aFloatArrayArray7206[i_0_ - -1][i_5_];
			f_10_ = aFloatArrayArray7220[i_0_ + 1][i_5_];
		} else if (aStandardPlane7217.anInt3398 != i_4_ || (i_2_ ^ 0xffffffff) != (aStandardPlane7217.anInt3398 ^ 0xffffffff)) {
			if (i_4_ != 0 || (i_2_ ^ 0xffffffff) != (aStandardPlane7217.anInt3398 ^ 0xffffffff)) {
				float f_11_ = (float) i_4_ / (float) aStandardPlane7217.anInt3398;
				float f_12_ = (float) i_2_ / (float) aStandardPlane7217.anInt3398;
				float f_13_ = aFloatArrayArray7227[i_0_][i_5_];
				float f_14_ = aFloatArrayArray7220[i_0_][i_5_];
				float f_15_ = aFloatArrayArray7206[i_0_][i_5_];
				float f_16_ = aFloatArrayArray7227[i_0_ + 1][i_5_];
				float f_17_ = aFloatArrayArray7220[1 + i_0_][i_5_];
				f_17_ += (-f_17_ + aFloatArrayArray7220[1 + i_0_][i_5_ + 1]) * f_11_;
				f_16_ += (-f_16_ + aFloatArrayArray7227[i_0_ + 1][1 + i_5_]) * f_11_;
				f_15_ += f_11_ * (-f_15_ + aFloatArrayArray7206[i_0_][i_5_ - -1]);
				float f_18_ = aFloatArrayArray7206[i_0_ + 1][i_5_];
				f_13_ += (aFloatArrayArray7227[i_0_][i_5_ - -1] - f_13_) * f_11_;
				f_14_ += (-f_14_ + aFloatArrayArray7220[i_0_][1 + i_5_]) * f_11_;
				f_18_ += f_11_ * (aFloatArrayArray7206[i_0_ + 1][i_5_ + 1] - f_18_);
				f_10_ = (-f_14_ + f_17_) * f_12_ + f_14_;
				f = (-f_13_ + f_16_) * f_12_ + f_13_;
				f_9_ = (-f_15_ + f_18_) * f_12_ + f_15_;
			} else {
				f_9_ = aFloatArrayArray7206[i_0_][i_5_ - -1];
				f = aFloatArrayArray7227[i_0_][i_5_ + 1];
				f_10_ = aFloatArrayArray7220[i_0_][1 + i_5_];
			}
		} else {
			f = aFloatArrayArray7227[1 + i_0_][1 + i_5_];
			f_10_ = aFloatArrayArray7220[1 + i_0_][i_5_ + 1];
			f_9_ = aFloatArrayArray7206[1 + i_0_][1 + i_5_];
		}
		float f_19_ = (float) (aNode_Sub29_7231.method2705(32311) + -i_6_);
		float f_20_ = (float) (aNode_Sub29_7231.method2704(i + -14165) - i_8_);
		float f_21_ = (float) (-i_7_ + aNode_Sub29_7231.method2708(27433));
		float f_22_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_19_ * f_19_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aNode_Sub29_7231.method2711(117);
		float f_25_ = -(f_24_ * f_24_) + 1.0F;
		if (f_25_ < 0.0F) {
			f_25_ = 0.0F;
		}
		float f_26_ = f_20_ * f_10_ + f_19_ * f + f_9_ * f_21_;
		if (i != 14195) {
			method2648((byte) -60);
		}
		if (f_26_ < 0.0F) {
			f_26_ = 0.0F;
		}
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F) {
			f_27_ = 1.0F;
		}
		int i_28_ = aNode_Sub29_7231.method2710((byte) 66);
		int i_29_ = (int) ((float) (i_28_ >> 16 & 0xff) * f_27_);
		if (i_29_ > 255) {
			i_29_ = 255;
		}
		int i_30_ = (int) ((float) (i_28_ >> 8 & 0xff) * f_27_);
		if ((i_30_ ^ 0xffffffff) < -256) {
			i_30_ = 255;
		}
		int i_31_ = (int) ((float) (i_28_ & 0xff) * f_27_);
		if (Stream.b()) {
			aStream7232.a((float) i_6_);
			aStream7232.a((float) i_8_);
			aStream7232.a((float) i_7_);
		} else {
			aStream7232.b((float) i_6_);
			aStream7232.b((float) i_8_);
			aStream7232.b((float) i_7_);
		}
		if ((i_31_ ^ 0xffffffff) < -256) {
			i_31_ = 255;
		}
		if ((anAbstractToolkit7230.anInt6360 ^ 0xffffffff) == -1) {
			aStream7232.d(i_31_);
			aStream7232.d(i_30_);
			aStream7232.d(i_29_);
		} else {
			aStream7232.d(i_29_);
			aStream7232.d(i_30_);
			aStream7232.d(i_31_);
		}
		aStream7232.d(255);
		method2643((byte) 19, s);
	}
	
	final void method2646(int i, int i_32_, byte b, int i_33_, boolean[][] bools) {
		anInt7223++;
		if (anInterface15_Impl1_7208 != null && (i_33_ + i ^ 0xffffffff) <= (anInt7210 ^ 0xffffffff) && (-i_33_ + i ^ 0xffffffff) >= (anInt7215 ^ 0xffffffff) && i_32_ - -i_33_ >= anInt7213 && i_32_ + -i_33_ <= anInt7219) {
			for (int i_34_ = anInt7213; anInt7219 >= i_34_; i_34_++) {
				for (int i_35_ = anInt7210; i_35_ <= anInt7215; i_35_++) {
					int i_36_ = i_35_ + -i;
					int i_37_ = -i_32_ + i_34_;
					if (-i_33_ < i_36_ && (i_36_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff) && (-i_33_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff) && (i_37_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff) && bools[i_33_ + i_36_][i_37_ - -i_33_]) {
						anAbstractToolkit7230.method1274((byte) (int) (255.0F * aNode_Sub29_7231.method2707(1)), false);
						anAbstractToolkit7230.method1354(0, 32011, anInterface15_Impl2_7218);
						anAbstractToolkit7230.method1338(anAbstractToolkit7230.aClass213_6383, 9422);
						anAbstractToolkit7230.method1276(0, (byte) -113, 0, anInterface15_Impl1_7208, anInt7221, Class55.aClass104_833, anInt7212 / 3);
						return;
					}
				}
			}
			if (b <= 43) {
				method2646(119, 109, (byte) 93, 25, null);
			}
		}
	}
	
	static final void method2647(byte b, float f, float f_38_, float f_39_, float f_40_, int i, byte[] bs, int i_41_, int i_42_, float f_43_, int i_44_, Class328 class328, int i_45_) {
		anInt7216++;
		for (int i_46_ = 0; i > i_46_; i_46_++) {
			Class195.method1988(i_41_, f, f_40_, i_46_, class328, bs, f_43_, i, (byte) -125, f_38_, i_44_, i_45_, i_42_, f_39_);
			i_42_ += i_41_ * i_44_;
		}
		@SuppressWarnings("unused")
		int i_47_ = 47 / ((83 - b) / 34);
	}
	
	public static void method2648(byte b) {
		aClass192_7214 = null;
		if (b != 47) {
			aClass192_7214 = null;
		}
	}
	
	static final void method2649(boolean bool) {
		anInt7222++;
		if (Class270_Sub1.aFileOutputStream8027 != null) {
			try {
				Class270_Sub1.aFileOutputStream8027.close();
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
		}
		if (bool != true) {
			method2649(false);
		}
		Class270_Sub1.aFileOutputStream8027 = null;
	}
	
	static final void method2650(boolean bool, int i) {
		anInt7228++;
		CacheNode_Sub16_Sub1.method2387((byte) -114);
		if (Class58.method577(Class151.anInt1843, -22906)) {
			Class123[] class123s = Class218.aClass123Array2567;
			for (int i_48_ = 0; (class123s.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
				Class123 class123 = class123s[i_48_];
				class123.anInt1579++;
				if ((class123.anInt1579 ^ 0xffffffff) > -51 && !bool) {
					return;
				}
				class123.anInt1579 = 0;
				if (!class123.aBoolean1580 && class123.aClass365_1557 != null) {
					Class365.anInt4524++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class224.OUTCOMMING_PACKET_16, class123.anIsaacCipher1571);
					class123.sendPacket(126, node_sub13);
					try {
						class123.method1512((byte) -89);
					} catch (java.io.IOException ioexception) {
						class123.aBoolean1580 = true;
					}
				}
			}
			if (i != -14651) {
				aClass192_7214 = null;
			}
			CacheNode_Sub16_Sub1.method2387((byte) -114);
		}
	}
	
	Node_Sub24(AbstractToolkit abstracttoolkit, StandardPlane standardplane, Node_Sub29 node_sub29, int[] is) {
		try {
			anAbstractToolkit7230 = abstracttoolkit;
			aStandardPlane7217 = standardplane;
			aNode_Sub29_7231 = node_sub29;
			int i = aNode_Sub29_7231.method2711(120) + -(standardplane.anInt3398 >> 1);
			anInt7210 = -i + aNode_Sub29_7231.method2705(32311) >> standardplane.anInt3410;
			anInt7215 = i + aNode_Sub29_7231.method2705(32311) >> standardplane.anInt3410;
			anInt7213 = -i + aNode_Sub29_7231.method2708(27433) >> standardplane.anInt3410;
			anInt7219 = i + aNode_Sub29_7231.method2708(27433) >> standardplane.anInt3410;
			int i_49_ = 1 + -anInt7210 + anInt7215;
			int i_50_ = anInt7219 + -anInt7213 - -1;
			aFloatArrayArray7220 = new float[1 + i_49_][1 + i_50_];
			aFloatArrayArray7227 = new float[1 + i_49_][1 + i_50_];
			aFloatArrayArray7206 = new float[i_49_ + 1][i_50_ + 1];
			for (int i_51_ = 0; i_51_ <= i_50_; i_51_++) {
				int i_52_ = i_51_ + anInt7213;
				if ((i_52_ ^ 0xffffffff) < -1 && i_52_ < aStandardPlane7217.anInt3404 + -1) {
					for (int i_53_ = 0; i_49_ >= i_53_; i_53_++) {
						int i_54_ = anInt7210 + i_53_;
						if (i_54_ > 0 && (i_54_ ^ 0xffffffff) > (aStandardPlane7217.anInt3408 - 1 ^ 0xffffffff)) {
							int i_55_ = standardplane.method3251(i_52_, 1 + i_54_, (byte) -118) + -standardplane.method3251(i_52_, i_54_ - 1, (byte) -118);
							int i_56_ = standardplane.method3251(1 + i_52_, i_54_, (byte) -118) + -standardplane.method3251(-1 + i_52_, i_54_, (byte) -118);
							float f = (float) (1.0 / Math.sqrt((double) (i_56_ * i_56_ + (i_55_ * i_55_ + 65536))));
							aFloatArrayArray7227[i_53_][i_51_] = (float) i_55_ * f;
							aFloatArrayArray7220[i_53_][i_51_] = f * -256.0F;
							aFloatArrayArray7206[i_53_][i_51_] = f * (float) i_56_;
						}
					}
				}
			}
			int i_57_ = 0;
			for (int i_58_ = anInt7213; anInt7219 >= i_58_; i_58_++) {
				if ((i_58_ ^ 0xffffffff) <= -1 && (i_58_ ^ 0xffffffff) > (standardplane.anInt3404 ^ 0xffffffff)) {
					for (int i_59_ = anInt7210; i_59_ <= anInt7215; i_59_++) {
						if ((i_59_ ^ 0xffffffff) <= -1 && (standardplane.anInt3408 ^ 0xffffffff) < (i_59_ ^ 0xffffffff)) {
							int i_60_ = is[i_57_];
							int[] is_61_ = standardplane.anIntArrayArrayArray8006[i_59_][i_58_];
							if (is_61_ != null && i_60_ != 0) {
								if (i_60_ == 1) {
									int i_62_ = 0;
									while (is_61_.length > i_62_) {
										if (is_61_[i_62_++] != -1 && (is_61_[i_62_++] ^ 0xffffffff) != 0 && (is_61_[i_62_++] ^ 0xffffffff) != 0) {
											anInt7212 += 3;
										}
									}
								} else {
									anInt7212 += 3;
								}
							}
						}
						i_57_++;
					}
				} else {
					i_57_ += anInt7215 - anInt7210;
				}
			}
			if ((anInt7212 ^ 0xffffffff) >= -1) {
				anInterface15_Impl2_7218 = null;
				anInterface15_Impl1_7208 = null;
			} else {
				aHashTable7209 = new HashTable(Class320_Sub19.method3753(anInt7212, -729073628));
				anInterface15_Impl1_7208 = anAbstractToolkit7230.method1346(false, (byte) 102);
				anInterface15_Impl1_7208.method56(-1696, anInt7212);
				jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = anAbstractToolkit7230.method1330(false, 84, anInt7212 * 16);
				aStream7232 = new Stream(nativeheapbuffer);
				for (;;) {
					jaclib.memory.Buffer buffer = anInterface15_Impl1_7208.method54(true, (byte) 119);
					if (buffer != null) {
						aStream7211 = new Stream(buffer);
						int i_63_ = 0;
						i_57_ = 0;
						for (int i_64_ = anInt7213; (anInt7219 ^ 0xffffffff) <= (i_64_ ^ 0xffffffff); i_64_++) {
							if (i_64_ < 0 || (i_64_ ^ 0xffffffff) <= (standardplane.anInt3404 ^ 0xffffffff)) {
								i_57_ += -anInt7210 + anInt7215;
							} else {
								int i_65_ = 0;
								for (int i_66_ = anInt7210; i_66_ <= anInt7215; i_66_++) {
									if ((i_66_ ^ 0xffffffff) <= -1 && (standardplane.anInt3408 ^ 0xffffffff) < (i_66_ ^ 0xffffffff)) {
										int i_67_ = is[i_57_];
										int[] is_68_ = standardplane.anIntArrayArrayArray8006[i_66_][i_64_];
										if (is_68_ != null && i_67_ != 0) {
											if ((i_67_ ^ 0xffffffff) != -2) {
												if (i_67_ == 3) {
													method2645(14195, i_65_, i_64_, 0, i_66_, 0, i_63_);
													method2645(14195, i_65_, i_64_, 0, i_66_, standardplane.anInt3398, i_63_);
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, 0, i_63_);
												} else if ((i_67_ ^ 0xffffffff) == -3) {
													method2645(14195, i_65_, i_64_, 0, i_66_, standardplane.anInt3398, i_63_);
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, standardplane.anInt3398, i_63_);
													method2645(14195, i_65_, i_64_, 0, i_66_, 0, i_63_);
												} else if ((i_67_ ^ 0xffffffff) == -6) {
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, standardplane.anInt3398, i_63_);
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, 0, i_63_);
													method2645(14195, i_65_, i_64_, 0, i_66_, standardplane.anInt3398, i_63_);
												} else if ((i_67_ ^ 0xffffffff) == -5) {
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, 0, i_63_);
													method2645(14195, i_65_, i_64_, 0, i_66_, 0, i_63_);
													method2645(14195, i_65_, i_64_, standardplane.anInt3398, i_66_, standardplane.anInt3398, i_63_);
												}
											} else {
												int[] is_69_ = standardplane.anIntArrayArrayArray7986[i_66_][i_64_];
												int[] is_70_ = standardplane.anIntArrayArrayArray7997[i_66_][i_64_];
												int i_71_ = 0;
												while (is_68_.length > i_71_) {
													if (is_68_[i_71_] == -1 || is_68_[1 + i_71_] == -1 || is_68_[i_71_ - -2] == -1) {
														i_71_ += 3;
													} else {
														method2645(14195, i_65_, i_64_, is_70_[i_71_], i_66_, is_69_[i_71_], i_63_);
														i_71_++;
														method2645(14195, i_65_, i_64_, is_70_[i_71_], i_66_, is_69_[i_71_], i_63_);
														i_71_++;
														method2645(14195, i_65_, i_64_, is_70_[i_71_], i_66_, is_69_[i_71_], i_63_);
														i_71_++;
													}
												}
											}
										}
									}
									i_57_++;
									i_65_++;
								}
							}
							i_63_++;
						}
						aStream7211.c();
						if (anInterface15_Impl1_7208.method53(-3308)) {
							break;
						}
						aStream7232.f(0);
						aHashTable7209.method1517(false);
					}
				}
				aStream7232.c();
				anInterface15_Impl2_7218 = anAbstractToolkit7230.method1380(2, false);
				anInterface15_Impl2_7218.method36(16, 16 * anInt7221, nativeheapbuffer, 1965);
			}
			aHashTable7209 = null;
			aFloatArrayArray7227 = aFloatArrayArray7220 = aFloatArrayArray7206 = null;
			aStream7211 = null;
			aStream7232 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class126.method1537(runtimeexception, "jw.<init>(" + (abstracttoolkit != null ? "{...}" : "null") + ',' + (standardplane != null ? "{...}" : "null") + ',' + (node_sub29 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}
}
