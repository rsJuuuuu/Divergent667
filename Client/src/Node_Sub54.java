/* Node_Sub54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import java.awt.Dimension;
import java.io.IOException;

public class Node_Sub54 extends Node
{
	private NativeHeapBuffer aNativeHeapBuffer7670;
	static Class338 aClass338_7671;
	private AbstractToolkit anAbstractToolkit7672;
	static int anInt7673;
	static int anInt7674;
	static int GAME_SCENE_WDITH = 104;
	protected int anInt7676;
	private int[] anIntArray7677;
	static int anInt7678;
	static int anInt7679;
	protected int anInt7680;
	private StandardPlane aStandardPlane7681;
	static int anInt7682;
	static int anInt7683 = 0;
	static int anInt7684;
	static int anInt7685;
	protected int anInt7686;
	private Stream aStream7687;
	static int anInt7688;
	protected int anInt7689;
	protected float aFloat7690;
	private Interface15_Impl2 anInterface15_Impl2_7691;
	protected int anInt7692 = 0;
	static int anInt7693;
	
	final void method2980(int i, int i_0_) {
		anInt7693++;
		aStream7687.f(3 + i * 4);
		if (i_0_ == 1) {
			aStream7687.d(-1);
		}
	}
	
	static final void method2981(int i, Node_Sub14 node_sub14, int i_1_, Class79 class79, Class299 class299, int i_2_, byte b, GraphicsToolkit graphicstoolkit, int i_3_) {
		anInt7674++;
		int i_4_ = i_1_ + -(i_2_ / 2) + -5;
		int i_5_ = 2 + i_3_;
		if (class79.anInt1077 != 0) {
			graphicstoolkit.method1239(10 + i_2_, 1 + i * class299.method3487() + i_3_ + -i_5_, i_5_, (byte) 116, i_4_, class79.anInt1077);
		}
		if (class79.anInt1081 != 0) {
			graphicstoolkit.method1234(i_5_, class79.anInt1081, 10 + i_2_, 1 + (class299.method3487() * i + (i_3_ + -i_5_)), (byte) -88, i_4_);
		}
		int i_6_ = class79.anInt1058;
		if (node_sub14.aBoolean7127 && class79.anInt1054 != -1) {
			i_6_ = class79.anInt1054;
		}
		for (int i_7_ = 0; i > i_7_; i_7_++) {
			String string = Node_Sub38_Sub3.aStringArray10107[i_7_];
			if (i_7_ < i + -1) {
				string = string.substring(0, string.length() + -4);
			}
			class299.method3491(graphicstoolkit, string, i_1_, i_3_, i_6_, true);
			i_3_ += class299.method3487();
		}
		if (b < 54) {
			GAME_SCENE_WDITH = 86;
		}
	}
	
	static final void method2982(int i, java.awt.Canvas canvas) {
		if (i >= -18) {
			method2982(-128, null);
		}
		anInt7682++;
		Dimension dimension = canvas.getSize();
		Node_Sub15_Sub8.method2575(dimension.height, dimension.width, 101);
		if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
			Class44.aGraphicsToolkit668.b(canvas, CacheNode_Sub15.anInt9589, Class303.anInt3831);
		} else {
			Class44.aGraphicsToolkit668.b(canvas, Animable_Sub1_Sub2.anInt10668, Class148.anInt1825);
		}
	}
	
	static final Node_Sub27 method2983(int i) {
		anInt7678++;
		if (i != -17555) {
			return null;
		}
		FileOnDisk fileondisk = null;
		Node_Sub27 node_sub27 = new Node_Sub27(Class209.aClass353_2483, 0);
		try {
			Class241 class241 = Class240.aSignLink2946.method3631(true, "", (byte) 99);
			while (class241.anInt2953 == 0)
				Class262_Sub22.method3208(1L, false);
			if (class241.anInt2953 == 1) {
				fileondisk = (FileOnDisk) class241.anObject2956;
				byte[] bs = new byte[(int) fileondisk.method1101(0)];
				int i_8_;
				for (int i_9_ = 0; bs.length > i_9_; i_9_ += i_8_) {
					i_8_ = fileondisk.method1103((byte) -115, -i_9_ + bs.length, bs, i_9_);
					if (i_8_ == -1) {
						throw new IOException("EOF");
					}
				}
				node_sub27 = new Node_Sub27(new BufferedStream(bs), Class209.aClass353_2483, 0);
			}
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (fileondisk != null) {
				fileondisk.method1098(true);
			}
		} catch (Exception exception) {
			/* empty */
		}
		return node_sub27;
	}
	
	final void method2984(byte b, int i) {
		aNativeHeapBuffer7670 = anAbstractToolkit7672.method1330(true, 80, 4 * i);
		anInt7679++;
		aStream7687 = new Stream(aNativeHeapBuffer7670, 0, 4 * i);
		@SuppressWarnings("unused")
		int i_10_ = -50 / ((-11 - b) / 62);
	}
	
	final void method2985(byte b, int[] is, int i) {
		anInt7685++;
		Interface15_Impl1 interface15_impl1 = anAbstractToolkit7672.method1298(0, anInt7692 * 3);
		jaclib.memory.Buffer buffer = interface15_impl1.method54(true, (byte) 126);
		if (buffer != null) {
			Stream stream = anAbstractToolkit7672.method1324(true, buffer);
			int i_11_ = 0;
			int i_12_ = 32767;
			int i_13_ = -32768;
			if (b != 60) {
				method2987(-11);
			}
			if (!Stream.b()) {
				for (int i_14_ = 0; i_14_ < i; i_14_++) {
					int i_15_ = is[i_14_];
					int i_16_ = anIntArray7677[i_15_];
					short[] ses = aStandardPlane7681.aShortArrayArray7985[i_15_];
					if (i_16_ != 0 && ses != null) {
						int i_17_ = 0;
						int i_18_ = 0;
						while (i_18_ < ses.length) {
							if ((1 << i_17_++ & i_16_ ^ 0xffffffff) != -1) {
								for (int i_19_ = 0; i_19_ < 3; i_19_++) {
									int i_20_ = ses[i_18_++] & 0xffff;
									if ((i_20_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
										i_12_ = i_20_;
									}
									if ((i_13_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
										i_13_ = i_20_;
									}
									stream.c(i_20_);
								}
								i_11_++;
							} else {
								i_18_ += 3;
							}
						}
					}
				}
			} else {
				for (int i_21_ = 0; i > i_21_; i_21_++) {
					int i_22_ = is[i_21_];
					short[] ses = aStandardPlane7681.aShortArrayArray7985[i_22_];
					int i_23_ = anIntArray7677[i_22_];
					if ((i_23_ ^ 0xffffffff) != -1 && ses != null) {
						int i_24_ = 0;
						int i_25_ = 0;
						while ((i_25_ ^ 0xffffffff) > (ses.length ^ 0xffffffff)) {
							if ((i_23_ & 1 << i_24_++ ^ 0xffffffff) != -1) {
								i_11_++;
								for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -4; i_26_++) {
									int i_27_ = 0xffff & ses[i_25_++];
									stream.b(i_27_);
									if ((i_27_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
										i_13_ = i_27_;
									}
									if (i_12_ > i_27_) {
										i_12_ = i_27_;
									}
								}
							} else {
								i_25_ += 3;
							}
						}
					}
				}
			}
			stream.c();
			if (interface15_impl1.method53(-3308) && i_11_ > 0) {
				anAbstractToolkit7672.method1332(3, (0x7 & aStandardPlane7681.anInt7981 ^ 0xffffffff) != -1, anInt7689, (0x8 & aStandardPlane7681.anInt7981) != 0);
				if (anAbstractToolkit7672.aBoolean6288) {
					anAbstractToolkit7672.EA(2147483647, anInt7680, anInt7676, anInt7686);
				}
				Class336_Sub1 class336_sub1 = anAbstractToolkit7672.method1306(7);
				class336_sub1.method3877(1.0F, (byte) -112, 1.0F / aFloat7690, 1.0F / aFloat7690);
				anAbstractToolkit7672.method1297(-21029, BufferedConnection.aClass346_615);
				anAbstractToolkit7672.method1354(1, 32011, anInterface15_Impl2_7691);
				anAbstractToolkit7672.method1338(aStandardPlane7681.aClass213_8017, 9422);
				anAbstractToolkit7672.method1276(i_12_, (byte) -114, 0, interface15_impl1, i_13_ + -i_12_ - -1, Class55.aClass104_833, i_11_);
				anAbstractToolkit7672.method1255((byte) -12);
			}
		}
	}
	
	final void method2986(int i, int i_28_, int i_29_, int i_30_) {
		if (i_28_ != 21883) {
			method2989(-45, -114, 0.5913439F, 73, -48);
		}
		anIntArray7677[aStandardPlane7681.anInt3408 * i_30_ + i] = Node_Sub16.method2590(anIntArray7677[aStandardPlane7681.anInt3408 * i_30_ + i], 1 << i_29_);
		anInt7684++;
		anInt7692++;
	}
	
	public static void method2987(int i) {
		if (i != 1) {
			GAME_SCENE_WDITH = -26;
		}
		aClass338_7671 = null;
	}
	
	final void method2988(byte b, int i) {
		anInt7673++;
		aStream7687.c();
		anInterface15_Impl2_7691 = anAbstractToolkit7672.method1380(2, false);
		anInterface15_Impl2_7691.method36(4, i * 4, aNativeHeapBuffer7670, 1965);
		if (b < -118) {
			aNativeHeapBuffer7670 = null;
			aStream7687 = null;
		}
	}
	
	final void method2989(int i, int i_31_, float f, int i_32_, int i_33_) {
		anInt7688++;
		if (i_32_ <= 28) {
			anInt7686 = 93;
		}
		if ((anInt7689 ^ 0xffffffff) != 0) {
			Class91 class91 = anAbstractToolkit7672.aD1543.method10(anInt7689, -8217);
			int i_34_ = 0xff & class91.aByte1225;
			if ((i_34_ ^ 0xffffffff) != -1 && (class91.aByte1214 ^ 0xffffffff) != -5) {
				int i_35_;
				if (i_31_ >= 0) {
					if ((i_31_ ^ 0xffffffff) < -128) {
						i_35_ = 16777215;
					} else {
						i_35_ = i_31_ * 131586;
					}
				} else {
					i_35_ = 0;
				}
				if ((i_34_ ^ 0xffffffff) == -257) {
					i = i_35_;
				} else {
					int i_36_ = i_34_;
					int i_37_ = -i_34_ + 256;
					i = (0xff0000 & i_36_ * (i_35_ & 0xff00) + i_37_ * (0xff00 & i)) + (i_36_ * (i_35_ & 0xff00ff) - -((i & 0xff00ff) * i_37_) & ~0xff00ff) >> 8;
				}
			}
			int i_38_ = 0xff & class91.aByte1217;
			if ((i_38_ ^ 0xffffffff) != -1) {
				i_38_ += 256;
				int i_39_ = (i >> 16 & 0xff) * i_38_;
				if (i_39_ > 65535) {
					i_39_ = 65535;
				}
				int i_40_ = i_38_ * ((0xff00 & i) >> 8);
				if ((i_40_ ^ 0xffffffff) < -65536) {
					i_40_ = 65535;
				}
				int i_41_ = (i & 0xff) * i_38_;
				if ((i_41_ ^ 0xffffffff) < -65536) {
					i_41_ = 65535;
				}
				i = (i_41_ >> 8) + (0xff00 & i_40_) + ((0x1600ff00 & i_39_) << 8);
			}
		}
		aStream7687.f(i_33_ * 4);
		if (f != 1.0F) {
			int i_42_ = (0xff0ba5 & i) >> 16;
			int i_43_ = (0xffa3 & i) >> 8;
			i_42_ *= f;
			int i_44_ = i & 0xff;
			if ((i_42_ ^ 0xffffffff) <= -1) {
				if ((i_42_ ^ 0xffffffff) < -256) {
					i_42_ = 255;
				}
			} else {
				i_42_ = 0;
			}
			i_43_ *= f;
			i_44_ *= f;
			if ((i_43_ ^ 0xffffffff) <= -1) {
				if ((i_43_ ^ 0xffffffff) < -256) {
					i_43_ = 255;
				}
			} else {
				i_43_ = 0;
			}
			if (i_44_ >= 0) {
				if (i_44_ > 255) {
					i_44_ = 255;
				}
			} else {
				i_44_ = 0;
			}
			i = i_44_ | (i_43_ << 8 | i_42_ << 16);
		}
		if ((anAbstractToolkit7672.anInt6360 ^ 0xffffffff) != -1) {
			aStream7687.d((byte) (i >> 16));
			aStream7687.d((byte) (i >> 8));
			aStream7687.d((byte) i);
		} else {
			aStream7687.d((byte) i);
			aStream7687.d((byte) (i >> 8));
			aStream7687.d((byte) (i >> 16));
		}
	}
	
	Node_Sub54(StandardPlane standardplane, int i, int i_45_, int i_46_, int i_47_, int i_48_) {
		aStandardPlane7681 = standardplane;
		anInt7680 = i_46_;
		anAbstractToolkit7672 = aStandardPlane7681.anAbstractToolkit8004;
		aFloat7690 = (float) i_45_;
		anInt7676 = i_47_;
		anInt7686 = i_48_;
		anInt7689 = i;
		anIntArray7677 = new int[aStandardPlane7681.anInt3404 * aStandardPlane7681.anInt3408];
	}
}
