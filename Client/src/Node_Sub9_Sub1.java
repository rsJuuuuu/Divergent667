/* Node_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub9_Sub1 extends Node_Sub9
{
	static int anInt9629;
	static int anInt9630;
	private int[] anIntArray9631;
	static int anInt9632;
	static int anInt9633;
	static int anInt9634;
	static int anInt9635;
	private HashTable aHashTable9636;
	static int anInt9637 = 0;
	static int anInt9638;
	static int anInt9639;
	private int[] anIntArray9640;
	private int[] anIntArray9641;
	static int anInt9642;
	static int anInt9643;
	static int anInt9644;
	static int anInt9645;
	private int[] anIntArray9646;
	static int anInt9647;
	static int anInt9648;
	static int anInt9649;
	private int[] anIntArray9650;
	static int anInt9651;
	private int[] anIntArray9652;
	static int anInt9653;
	private int[] anIntArray9654;
	private int anInt9655;
	static int anInt9656;
	static int anInt9657;
	static int anInt9658;
	protected int[] anIntArray9659;
	private int[] anIntArray9660;
	private int anInt9661;
	static int anInt9662;
	static int anInt9663;
	static int anInt9664;
	static int anInt9665;
	private Class27 aClass27_9666;
	static int anInt9667;
	private int[] anIntArray9668;
	static int anInt9669;
	static int anInt9670;
	private int[] anIntArray9671;
	private int[] anIntArray9672;
	static int anInt9673;
	static int anInt9674;
	private int[] anIntArray9675;
	static int anInt9676;
	private int[] anIntArray9677;
	static int anInt9678;
	private Node_Sub10[][] aNode_Sub10ArrayArray9679;
	protected int[] anIntArray9680;
	static int anInt9681;
	static int anInt9682;
	private Node_Sub10[][] aNode_Sub10ArrayArray9683;
	static int anInt9684;
	protected int[] anIntArray9685;
	static int[] anIntArray9686 = new int[3];
	static int anInt9687;
	static int anInt9688;
	static int anInt9689;
	static int anInt9690;
	static int anInt9691;
	static int anInt9692;
	static int anInt9693;
	static int anInt9694;
	static int anInt9695;
	static int anInt9696;
	private long aLong9697;
	private Node_Sub9_Sub4 aNode_Sub9_Sub4_9698;
	private boolean aBoolean9699;
	private int anInt9700;
	private long aLong9701;
	private int anInt9702;
	private int anInt9703;
	private boolean aBoolean9704;
	private Node_Sub4 aNode_Sub4_9705;
	
	private final void method2433(int i, long l) {
		if (i == 0) {
			anInt9693++;
			long l_0_;
			for (/**/; aLong9697 <= l; aLong9697 = l_0_) {
				int i_1_ = anInt9700;
				int i_2_ = anInt9702;
				l_0_ = aLong9697;
				while (i_2_ == anInt9702) {
					while ((aClass27_9666.anIntArray459[i_1_] ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
						aClass27_9666.method323(i_1_);
						int i_3_ = aClass27_9666.method317(i_1_);
						if (i_3_ == 1) {
							aClass27_9666.method324();
							aClass27_9666.method318(i_1_);
							if (aClass27_9666.method328()) {
								if (aBoolean9699 && i_2_ != 0) {
									aClass27_9666.method326(l_0_);
								} else {
									method2465(i ^ 0x75, true);
									aClass27_9666.method319();
									return;
								}
							}
							break;
						}
						if ((i_3_ & 0x80) != 0 && (i_3_ & 0xf0 ^ 0xffffffff) != -145) {
							method2447(i_3_, -31);
						}
						aClass27_9666.method329(i_1_);
						aClass27_9666.method318(i_1_);
					}
					aLong9701 = l_0_;
					i_1_ = aClass27_9666.method322();
					i_2_ = aClass27_9666.anIntArray459[i_1_];
					l_0_ = aClass27_9666.method316(i_2_);
				}
				anInt9702 = i_2_;
				anInt9700 = i_1_;
			}
		}
	}
	
	private final synchronized void method2434(byte b, boolean bool) {
		anInt9645++;
		aClass27_9666.method319();
		if (b == 87) {
			aNode_Sub4_9705 = null;
			method2465(b ^ 0x2d, bool);
		}
	}
	
	final synchronized void method2427(int[] is, int i, int i_4_) {
		if (aClass27_9666.method315()) {
			int i_5_ = aClass27_9666.anInt463 * anInt9661 / Class365.anInt4523;
			do {
				long l = aLong9701 - -((long) i_4_ * (long) i_5_);
				if ((-l + aLong9697 ^ 0xffffffffffffffffL) <= -1L) {
					aLong9701 = l;
					break;
				}
				int i_6_ = (int) ((-1L + (aLong9697 - aLong9701 - -(long) i_5_)) / (long) i_5_);
				aLong9701 += (long) i_6_ * (long) i_5_;
				aNode_Sub9_Sub4_9698.method2427(is, i, i_6_);
				i += i_6_;
				method2455((byte) -89);
				i_4_ -= i_6_;
			} while (aClass27_9666.method315());
		}
		anInt9681++;
		aNode_Sub9_Sub4_9698.method2427(is, i, i_4_);
	}
	
	final synchronized Node_Sub9 method2429() {
		anInt9658++;
		return aNode_Sub9_Sub4_9698;
	}
	
	final synchronized void method2435(boolean bool) {
		anInt9694++;
		if (bool == false) {
			method2434((byte) 87, true);
		}
	}
	
	private final synchronized void method2436(boolean bool, boolean bool_7_, Node_Sub4 node_sub4, int i) {
		method2434((byte) 87, bool_7_);
		anInt9687++;
		aClass27_9666.method321(node_sub4.aByteArray6951);
		aLong9701 = 0L;
		aBoolean9699 = bool;
		int i_8_ = aClass27_9666.method330();
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			aClass27_9666.method323(i_9_);
			aClass27_9666.method329(i_9_);
			aClass27_9666.method318(i_9_);
		}
		if (i != 18429) {
			method2440(68, 61);
		}
		anInt9700 = aClass27_9666.method322();
		anInt9702 = aClass27_9666.anIntArray459[anInt9700];
		aLong9697 = aClass27_9666.method316(anInt9702);
	}
	
	private final int method2437(int i, Node_Sub10 node_sub10) {
		anInt9690++;
		int i_10_ = node_sub10.anInt7085 + (node_sub10.anInt7101 * node_sub10.anInt7092 >> 12);
		i_10_ += (anIntArray9654[node_sub10.anInt7080] - 8192) * anIntArray9671[node_sub10.anInt7080] >> 12;
		Class240 class240 = node_sub10.aClass240_7094;
		if ((class240.anInt2938 ^ 0xffffffff) < -1 && ((class240.anInt2937 ^ 0xffffffff) < -1 || (anIntArray9668[node_sub10.anInt7080] ^ 0xffffffff) < -1)) {
			int i_11_ = class240.anInt2937 << 2;
			int i_12_ = class240.anInt2947 << 1;
			if ((i_12_ ^ 0xffffffff) < (node_sub10.anInt7099 ^ 0xffffffff)) {
				i_11_ = node_sub10.anInt7099 * i_11_ / i_12_;
			}
			i_11_ += anIntArray9668[node_sub10.anInt7080] >> 7;
			double d = Math.sin((double) (0x1ff & node_sub10.anInt7082) * 0.01227184630308513);
			i_10_ += (int) (d * (double) i_11_);
		}
		int i_13_ = (int) (0.5 + (double) (256 * node_sub10.aNode_Sub45_Sub1_7087.anInt10502) * Math.pow(2.0, (double) i_10_ * 3.255208333333333E-4) / (double) Class365.anInt4523);
		if (i != -27954) {
			return -119;
		}
		if (i_13_ >= 1) {
			return i_13_;
		}
		return 1;
	}
	
	private final void method2438(int i, int i_14_, int i_15_, int i_16_) {
		anInt9696++;
		Node_Sub10 node_sub10 = aNode_Sub10ArrayArray9679[i_15_][i_16_];
		if (node_sub10 != null) {
			aNode_Sub10ArrayArray9679[i_15_][i_16_] = null;
			if ((0x2 & anIntArray9680[i_15_] ^ 0xffffffff) == -1) {
				node_sub10.anInt7100 = 0;
			} else {
				for (Node_Sub10 node_sub10_17_ = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3613(65280); node_sub10_17_ != null; node_sub10_17_ = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3620(16776960)) {
					if ((node_sub10.anInt7080 ^ 0xffffffff) == (node_sub10_17_.anInt7080 ^ 0xffffffff) && (node_sub10_17_.anInt7100 ^ 0xffffffff) > -1 && node_sub10 != node_sub10_17_) {
						node_sub10.anInt7100 = 0;
						break;
					}
				}
			}
			if (i_14_ > -34) {
				method2469(93, 94, 0);
			}
		}
	}
	
	final synchronized void method2439(int i, int i_18_) {
		anInt9667++;
		if (i == -12651) {
			anInt9655 = i_18_;
		}
	}
	
	private final void method2440(int i, int i_19_) {
		anInt9633++;
		if ((0x4 & anIntArray9680[i_19_] ^ 0xffffffff) != -1) {
			for (Node_Sub10 node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3613(i + 65280); node_sub10 != null; node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3620(16776960)) {
				if ((i_19_ ^ 0xffffffff) == (node_sub10.anInt7080 ^ 0xffffffff)) {
					node_sub10.anInt7076 = 0;
				}
			}
		}
		if (i != 0) {
			method2460(61, -58, -70);
		}
	}
	
	static final void method2441(int i) {
		anInt9692++;
		for (int i_20_ = 0; i_20_ < Class23.anInt434; i_20_++) {
			Class78 class78 = Node_Sub38_Sub19.aClass78Array10284[i_20_];
			boolean bool = false;
			if (class78.aNode_Sub9_Sub2_1025 != null) {
				if (!class78.aNode_Sub9_Sub2_1025.method2161(-121)) {
					bool = true;
				}
			} else {
				class78.anInt1022--;
				if ((class78.anInt1022 ^ 0xffffffff) > ((class78.method777((byte) -9) ? -1500 : -10) ^ 0xffffffff)) {
					bool = true;
				} else {
					if (class78.aByte1027 != 1 || class78.aClass65_1039 != null) {
						if (class78.method777((byte) -9) && (class78.aNode_Sub49_1035 == null || class78.aNode_Sub45_Sub1_1023 == null)) {
							if (class78.aNode_Sub49_1035 == null) {
								class78.aNode_Sub49_1035 = Node_Sub49.method2954(Class78.aClass302_1033, class78.anInt1038);
							}
							if (class78.aNode_Sub49_1035 == null) {
								continue;
							}
							if (class78.aNode_Sub45_Sub1_1023 == null) {
								class78.aNode_Sub45_Sub1_1023 = class78.aNode_Sub49_1035.method2958(new int[] { 22050 });
								if (class78.aNode_Sub45_Sub1_1023 == null) {
									continue;
								}
							}
						}
					} else {
						class78.aClass65_1039 = Class65.method714(Class148.aClass302_1827, class78.anInt1038, 0);
						if (class78.aClass65_1039 == null) {
							continue;
						}
						class78.anInt1022 += class78.aClass65_1039.method717();
					}
					if ((class78.anInt1022 ^ 0xffffffff) > -1) {
						int i_21_ = 8192;
						int i_22_;
						if (class78.anInt1036 == 0) {
							i_22_ = class78.anInt1034 * (class78.aByte1027 != 3 ? Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false) : Class213.aNode_Sub27_2512.aClass320_Sub25_7276.method3776(false)) >> 2;
						} else {
							int i_23_ = (0x3ae7b77 & class78.anInt1036) >> 24;
							if (i_23_ == Class295.myPlayer.plane) {
								int i_24_ = (0xff & class78.anInt1036) << 9;
								int i_25_ = Class295.myPlayer.getSize((byte) 126) << 8;
								int i_26_ = class78.anInt1036 >> 16 & 0xff;
								int i_27_ = -Class295.myPlayer.anInt5934 + 256 + (i_26_ << 9) + i_25_;
								int i_28_ = (class78.anInt1036 & 0xff65) >> 8;
								int i_29_ = i_25_ + -Class295.myPlayer.anInt5940 + ((i_28_ << 9) + 256);
								int i_30_ = -512 + (Math.abs(i_27_) + Math.abs(i_29_));
								if ((i_24_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff)) {
									class78.anInt1022 = -99999;
									continue;
								}
								if (i_30_ < 0) {
									i_30_ = 0;
								}
								i_22_ = Class213.aNode_Sub27_2512.aClass320_Sub25_7265.method3776(false) * ((-i_30_ + i_24_) * class78.anInt1034) / i_24_ >> 2;
								if (class78.anAnimable1041 != null && class78.anAnimable1041 instanceof Mobile) {
									@SuppressWarnings("unused")
									Mobile mobile = (Mobile) class78.anAnimable1041;
								}
								if ((i_27_ ^ 0xffffffff) != -1 || (i_29_ ^ 0xffffffff) != -1) {
									int i_32_ = -Class170.anInt2053 + (-(int) (Math.atan2((double) i_27_, (double) i_29_) * 2607.5945876176133) + -4096) & 0x3fff;
									if (i_32_ > 8192) {
										i_32_ = -i_32_ + 16384;
									}
									int i_33_;
									if (i_30_ > 0) {
										if ((i_30_ ^ 0xffffffff) <= -4097) {
											i_33_ = 16384;
										} else {
											i_33_ = 8192 + (8192 - i_30_) / 4096;
										}
									} else {
										i_33_ = 8192;
									}
									i_21_ = (16384 - i_33_ >> 1) + i_32_ * i_33_ / 8192;
								}
							} else {
								i_22_ = 0;
							}
						}
						if ((i_22_ ^ 0xffffffff) < -1) {
							Node_Sub45_Sub1 node_sub45_sub1 = null;
							if ((class78.aByte1027 ^ 0xffffffff) == -2) {
								node_sub45_sub1 = class78.aClass65_1039.method716().method2947(Class361.aClass191_4486);
							} else if (class78.method777((byte) -9)) {
								node_sub45_sub1 = class78.aNode_Sub45_Sub1_1023;
							}
							Node_Sub9_Sub2 node_sub9_sub2 = class78.aNode_Sub9_Sub2_1025 = Node_Sub9_Sub2.method2509(node_sub45_sub1, class78.anInt1026, i_22_, i_21_);
							node_sub9_sub2.method2481(class78.anInt1028 + -1);
							Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub2);
						}
					}
				}
			}
			if (bool) {
				Class23.anInt434--;
				for (int i_34_ = i_20_; i_34_ < Class23.anInt434; i_34_++)
					Node_Sub38_Sub19.aClass78Array10284[i_34_] = Node_Sub38_Sub19.aClass78Array10284[1 + i_34_];
				i_20_--;
			}
		}
		if (Class377_Sub1.aBoolean8775 && !Class36.method390(126)) {
			if (Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false) != 0 && (Class313.anInt4013 ^ 0xffffffff) != 0) {
				if (EntityNode_Sub1.aNode_Sub9_Sub1_5929 == null) {
					Class339_Sub8.method3946(Class313.anInt4013, 0, Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false), SeekableFile.index6, false, 23732);
				} else {
					Node_Sub25_Sub1.method2659(EntityNode_Sub1.aNode_Sub9_Sub1_5929, false, 32345, Class313.anInt4013, SeekableFile.index6, Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false), 0);
				}
			}
			EntityNode_Sub1.aNode_Sub9_Sub1_5929 = null;
			Class377_Sub1.aBoolean8775 = false;
		} else if (Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false) != 0 && (Class313.anInt4013 ^ 0xffffffff) != 0 && !Class36.method390(125)) {
			Class291.anInt3668++;
			Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class128.aClass318_1660, Class218.aClass123_2566.anIsaacCipher1571);
			node_sub13.aPacket7113.writeInt(Class313.anInt4013);
			Class218.aClass123_2566.sendPacket(127, node_sub13);
			Class313.anInt4013 = -1;
		}
		if (i >= -108) {
			anInt9656 = -2;
		}
	}
	
	private final void method2442(byte b, int i) {
		anInt9691++;
		if (i < 0) {
			for (i = 0; i < 16; i++)
				method2442((byte) -56, i);
		} else {
			anIntArray9672[i] = 12800;
			anIntArray9677[i] = 8192;
			anIntArray9646[i] = 16383;
			anIntArray9654[i] = 8192;
			anIntArray9668[i] = 0;
			anIntArray9652[i] = 8192;
			method2464((byte) -111, i);
			method2440(b + 56, i);
			anIntArray9680[i] = 0;
			if (b != -56) {
				anIntArray9685 = null;
			}
			anIntArray9641[i] = 32767;
			anIntArray9671[i] = 256;
			anIntArray9659[i] = 0;
			method2451(8192, i, (byte) 42);
		}
	}
	
	private final int method2443(Node_Sub10 node_sub10, byte b) {
		anInt9638++;
		if ((anIntArray9631[node_sub10.anInt7080] ^ 0xffffffff) == -1) {
			return 0;
		}
		Class240 class240 = node_sub10.aClass240_7094;
		int i = anIntArray9646[node_sub10.anInt7080] * anIntArray9672[node_sub10.anInt7080] + 4096 >> 13;
		i = i * i - -16384 >> 15;
		i = 16384 + node_sub10.anInt7096 * i >> 15;
		i = 128 + anInt9655 * i >> 8;
		i = i * anIntArray9631[node_sub10.anInt7080] - -128 >> 8;
		if ((class240.anInt2933 ^ 0xffffffff) < -1) {
			i = (int) ((double) i * Math.pow(0.5, (double) node_sub10.anInt7102 * 1.953125E-5 * (double) class240.anInt2933) + 0.5);
		}
		if (class240.aByteArray2944 != null) {
			int i_35_ = node_sub10.anInt7084;
			int i_36_ = class240.aByteArray2944[1 + node_sub10.anInt7078];
			if ((-2 + class240.aByteArray2944.length ^ 0xffffffff) < (node_sub10.anInt7078 ^ 0xffffffff)) {
				int i_37_ = (class240.aByteArray2944[node_sub10.anInt7078] & 0xff) << 8;
				int i_38_ = 0xff00 & class240.aByteArray2944[node_sub10.anInt7078 + 2] << 8;
				i_36_ += (-i_36_ + class240.aByteArray2944[3 + node_sub10.anInt7078]) * (-i_37_ + i_35_) / (i_38_ - i_37_);
			}
			i = i_36_ * i + 32 >> 6;
		}
		if ((node_sub10.anInt7100 ^ 0xffffffff) < -1 && class240.aByteArray2942 != null) {
			int i_39_ = node_sub10.anInt7100;
			int i_40_ = class240.aByteArray2942[node_sub10.anInt7090 - -1];
			if ((class240.aByteArray2942.length + -2 ^ 0xffffffff) < (node_sub10.anInt7090 ^ 0xffffffff)) {
				int i_41_ = class240.aByteArray2942[node_sub10.anInt7090] << 8 & 0xff00;
				int i_42_ = class240.aByteArray2942[node_sub10.anInt7090 - -2] << 8 & 0xff00;
				i_40_ += (i_39_ - i_41_) * (class240.aByteArray2942[3 + node_sub10.anInt7090] - i_40_) / (i_42_ - i_41_);
			}
			i = i_40_ * i + 32 >> 6;
		}
		if (b > -105) {
			return -3;
		}
		return i;
	}
	
	final synchronized int method2428() {
		anInt9647++;
		return 0;
	}
	
	final boolean method2444(Node_Sub10 node_sub10, byte b) {
		anInt9688++;
		if (node_sub10.aNode_Sub9_Sub2_7095 == null) {
			if (node_sub10.anInt7100 >= 0) {
				node_sub10.method2160((byte) 50);
				if ((node_sub10.anInt7093 ^ 0xffffffff) < -1 && aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] == node_sub10) {
					aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] = null;
				}
			}
			return true;
		}
		return false;
	}
	
	final synchronized Node_Sub9 method2431() {
		anInt9657++;
		return null;
	}
	
	final synchronized boolean method2445(byte b) {
		anInt9682++;
		if (b > -25) {
			aLong9701 = 28L;
		}
		return aClass27_9666.method315();
	}
	
	private final int method2446(int i, Node_Sub10 node_sub10) {
		anInt9651++;
		int i_43_ = anIntArray9677[node_sub10.anInt7080];
		if (i != 128) {
			return 112;
		}
		if ((i_43_ ^ 0xffffffff) > -8193) {
			return i_43_ * node_sub10.anInt7088 - -32 >> 6;
		}
		return 16384 + -(32 + (-node_sub10.anInt7088 + 128) * (-i_43_ + 16384) >> 6);
	}
	
	private final void method2447(int i, int i_44_) {
		anInt9678++;
		int i_45_ = 0xf0 & i;
		if (i_45_ == 128) {
			int i_46_ = 0xf & i;
			int i_47_ = 0x7f & i >> 8;
			int i_48_ = (0x7fecff & i) >> 16;
			method2438(i_48_, -65, i_46_, i_47_);
		} else if ((i_45_ ^ 0xffffffff) == -145) {
			int i_49_ = 0xf & i;
			int i_50_ = i >> 8 & 0x7f;
			int i_51_ = i >> 16 & 0x7f;
			if ((i_51_ ^ 0xffffffff) >= -1) {
				method2438(64, -37, i_49_, i_50_);
			} else {
				method2459(i_49_, i_50_, i_51_, true);
			}
		} else if ((i_45_ ^ 0xffffffff) == -161) {
			int i_52_ = 0xf & i;
			int i_53_ = 0x7f & i >> 8;
			int i_54_ = (i & 0x7f77dd) >> 16;
			method2462(i_54_, i_52_, i_53_, 63);
		} else if (i_45_ == 176) {
			int i_55_ = 0xf & i;
			int i_56_ = i >> 8 & 0x7f;
			int i_57_ = (0x7f3036 & i) >> 16;
			if ((i_56_ ^ 0xffffffff) == -1) {
				anIntArray9660[i_55_] = (i_57_ << 14) + Node_Sub30.method2723(anIntArray9660[i_55_], -2080769);
			}
			if (i_56_ == 32) {
				anIntArray9660[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(anIntArray9660[i_55_], -16257);
			}
			if ((i_56_ ^ 0xffffffff) == -2) {
				anIntArray9668[i_55_] = Node_Sub30.method2723(anIntArray9668[i_55_], -16257) - -(i_57_ << 7);
			}
			if ((i_56_ ^ 0xffffffff) == -34) {
				anIntArray9668[i_55_] = i_57_ + Node_Sub30.method2723(anIntArray9668[i_55_], -128);
			}
			if ((i_56_ ^ 0xffffffff) == -6) {
				anIntArray9652[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(anIntArray9652[i_55_], -16257);
			}
			if ((i_56_ ^ 0xffffffff) == -38) {
				anIntArray9652[i_55_] = Node_Sub30.method2723(-128, anIntArray9652[i_55_]) + i_57_;
			}
			if ((i_56_ ^ 0xffffffff) == -8) {
				anIntArray9672[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(-16257, anIntArray9672[i_55_]);
			}
			if (i_56_ == 39) {
				anIntArray9672[i_55_] = i_57_ + Node_Sub30.method2723(-128, anIntArray9672[i_55_]);
			}
			if (i_56_ == 10) {
				anIntArray9677[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(-16257, anIntArray9677[i_55_]);
			}
			if ((i_56_ ^ 0xffffffff) == -43) {
				anIntArray9677[i_55_] = i_57_ + Node_Sub30.method2723(anIntArray9677[i_55_], -128);
			}
			if ((i_56_ ^ 0xffffffff) == -12) {
				anIntArray9646[i_55_] = Node_Sub30.method2723(-16257, anIntArray9646[i_55_]) + (i_57_ << 7);
			}
			if ((i_56_ ^ 0xffffffff) == -44) {
				anIntArray9646[i_55_] = Node_Sub30.method2723(anIntArray9646[i_55_], -128) + i_57_;
			}
			if ((i_56_ ^ 0xffffffff) == -65) {
				if ((i_57_ ^ 0xffffffff) > -65) {
					anIntArray9680[i_55_] = Node_Sub30.method2723(anIntArray9680[i_55_], -2);
				} else {
					anIntArray9680[i_55_] = Node_Sub16.method2590(anIntArray9680[i_55_], 1);
				}
			}
			if ((i_56_ ^ 0xffffffff) == -66) {
				if ((i_57_ ^ 0xffffffff) <= -65) {
					anIntArray9680[i_55_] = Node_Sub16.method2590(anIntArray9680[i_55_], 2);
				} else {
					method2464((byte) 86, i_55_);
					anIntArray9680[i_55_] = Node_Sub30.method2723(anIntArray9680[i_55_], -3);
				}
			}
			if (i_56_ == 99) {
				anIntArray9641[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(127, anIntArray9641[i_55_]);
			}
			if (i_56_ == 98) {
				anIntArray9641[i_55_] = i_57_ + Node_Sub30.method2723(16256, anIntArray9641[i_55_]);
			}
			if ((i_56_ ^ 0xffffffff) == -102) {
				anIntArray9641[i_55_] = 16384 + Node_Sub30.method2723(anIntArray9641[i_55_], 127) - -(i_57_ << 7);
			}
			if ((i_56_ ^ 0xffffffff) == -101) {
				anIntArray9641[i_55_] = 16384 - (-Node_Sub30.method2723(anIntArray9641[i_55_], 16256) - i_57_);
			}
			if (i_56_ == 120) {
				method2453(15, i_55_);
			}
			if (i_56_ == 121) {
				method2442((byte) -56, i_55_);
			}
			if (i_56_ == 123) {
				method2461(15025, i_55_);
			}
			if (i_56_ == 6) {
				int i_58_ = anIntArray9641[i_55_];
				if ((i_58_ ^ 0xffffffff) == -16385) {
					anIntArray9671[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(anIntArray9671[i_55_], -16257);
				}
			}
			if ((i_56_ ^ 0xffffffff) == -39) {
				int i_59_ = anIntArray9641[i_55_];
				if ((i_59_ ^ 0xffffffff) == -16385) {
					anIntArray9671[i_55_] = Node_Sub30.method2723(anIntArray9671[i_55_], -128) - -i_57_;
				}
			}
			if (i_56_ == 16) {
				anIntArray9659[i_55_] = (i_57_ << 7) + Node_Sub30.method2723(-16257, anIntArray9659[i_55_]);
			}
			if ((i_56_ ^ 0xffffffff) == -49) {
				anIntArray9659[i_55_] = i_57_ + Node_Sub30.method2723(anIntArray9659[i_55_], -128);
			}
			if ((i_56_ ^ 0xffffffff) == -82) {
				if (i_57_ >= 64) {
					anIntArray9680[i_55_] = Node_Sub16.method2590(anIntArray9680[i_55_], 4);
				} else {
					method2440(0, i_55_);
					anIntArray9680[i_55_] = Node_Sub30.method2723(anIntArray9680[i_55_], -5);
				}
			}
			if (i_56_ == 17) {
				method2451((anIntArray9640[i_55_] & ~0x3f80) - -(i_57_ << 7), i_55_, (byte) 85);
			}
			if ((i_56_ ^ 0xffffffff) == -50) {
				method2451(i_57_ + (~0x7f & anIntArray9640[i_55_]), i_55_, (byte) 120);
			}
		} else if (i_45_ == 192) {
			int i_60_ = i & 0xf;
			int i_61_ = 0x7f & i >> 8;
			method2470(i_60_, i_61_ + anIntArray9660[i_60_], (byte) -120);
		} else if ((i_45_ ^ 0xffffffff) == -209) {
			int i_62_ = i & 0xf;
			int i_63_ = (0x7f2e & i) >> 8;
			method2469(i_62_, i_63_, 8383743);
		} else if (i_44_ < -18) {
			if ((i_45_ ^ 0xffffffff) == -225) {
				int i_64_ = i & 0xf;
				int i_65_ = (i >> 8 & 0x7f) + ((0x7f0197 & i) >> 9);
				method2460(i_65_, -5807, i_64_);
			} else {
				i_45_ = i & 0xff;
				if (i_45_ == 255) {
					method2465(-79, true);
				}
			}
		}
	}
	
	final synchronized void method2448(Node_Sub4 node_sub4, boolean bool, int i, long l, boolean bool_66_) {
		anInt9674++;
		if (i != -128) {
			method2433(-70, 6L);
		}
		method2436(bool, bool_66_, node_sub4, 18429);
		method2433(0, l * (long) aClass27_9666.anInt463);
	}
	
	final synchronized void method2449(int i, boolean bool, int i_67_) {
		if (bool != false) {
			method2445((byte) -88);
		}
		if (i_67_ < 0) {
			for (int i_68_ = 0; i_68_ < 16; i_68_++)
				anIntArray9631[i_68_] = i;
		} else {
			anIntArray9631[i_67_] = i;
		}
		anInt9629++;
	}
	
	final synchronized void method2450(byte b) {
		for (Node_Sub6 node_sub6 = (Node_Sub6) aHashTable9636.method1516(false); node_sub6 != null; node_sub6 = (Node_Sub6) aHashTable9636.method1520(96))
			node_sub6.method2160((byte) 112);
		if (b > 20) {
			anInt9695++;
		}
	}
	
	private final void method2451(int i, int i_69_, byte b) {
		if (b <= 33) {
			aClass27_9666 = null;
		}
		anIntArray9640[i_69_] = i;
		anInt9653++;
		anIntArray9685[i_69_] = (int) (Math.pow(2.0, (double) i * 5.4931640625E-4) * 2097152.0 + 0.5);
	}
	
	final synchronized void method2452(int i, int i_70_, byte b) {
		method2463(i, false, i_70_);
		anInt9642++;
	}
	
	private final void method2453(int i, int i_72_) {
		if (i != 15) {
			aClass27_9666 = null;
		}
		for (Node_Sub10 node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3613(65280); node_sub10 != null; node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3620(i ^ 0xffff0f)) {
			if ((i_72_ ^ 0xffffffff) > -1 || node_sub10.anInt7080 == i_72_) {
				if (node_sub10.aNode_Sub9_Sub2_7095 != null) {
					node_sub10.aNode_Sub9_Sub2_7095.method2483(Class365.anInt4523 / 100);
					if (node_sub10.aNode_Sub9_Sub2_7095.method2499()) {
						aNode_Sub9_Sub4_9698.aNode_Sub9_Sub3_9740.method2513(node_sub10.aNode_Sub9_Sub2_7095);
					}
					node_sub10.method2541(110);
				}
				if ((node_sub10.anInt7100 ^ 0xffffffff) > -1) {
					aNode_Sub10ArrayArray9679[node_sub10.anInt7080][node_sub10.anInt7091] = null;
				}
				node_sub10.method2160((byte) 119);
			}
		}
		anInt9684++;
	}
	
	public static void method2454(int i) {
		if (i == 1968219983) {
			anIntArray9686 = null;
		}
	}
	
	private final void method2455(byte b) {
		anInt9649++;
		int i = anInt9700;
		int i_73_ = anInt9702;
		long l = aLong9697;
		if (aNode_Sub4_9705 != null && (anInt9703 ^ 0xffffffff) == (i_73_ ^ 0xffffffff)) {
			method2436(aBoolean9699, aBoolean9704, aNode_Sub4_9705, 18429);
			method2455((byte) -98);
		} else {
			while ((anInt9702 ^ 0xffffffff) == (i_73_ ^ 0xffffffff)) {
				while (aClass27_9666.anIntArray459[i] == i_73_) {
					aClass27_9666.method323(i);
					int i_74_ = aClass27_9666.method317(i);
					if (i_74_ == 1) {
						aClass27_9666.method324();
						aClass27_9666.method318(i);
						if (aClass27_9666.method328()) {
							if (aNode_Sub4_9705 != null) {
								method2457(197984776, aNode_Sub4_9705, aBoolean9699);
								method2455((byte) -119);
								return;
							}
							if (aBoolean9699 && i_73_ != 0) {
								aClass27_9666.method326(l);
							} else {
								method2465(123, true);
								aClass27_9666.method319();
								return;
							}
						}
						break;
					}
					if ((i_74_ & 0x80 ^ 0xffffffff) != -1) {
						method2447(i_74_, -33);
					}
					aClass27_9666.method329(i);
					aClass27_9666.method318(i);
				}
				i = aClass27_9666.method322();
				i_73_ = aClass27_9666.anIntArray459[i];
				l = aClass27_9666.method316(i_73_);
			}
			if (b >= -19) {
				anInt9702 = -58;
			}
			anInt9700 = i;
			aLong9697 = l;
			anInt9702 = i_73_;
			if (aNode_Sub4_9705 != null && (i_73_ ^ 0xffffffff) < (anInt9703 ^ 0xffffffff)) {
				anInt9702 = anInt9703;
				anInt9700 = -1;
				aLong9697 = aClass27_9666.method316(anInt9702);
			}
		}
	}
	
	final synchronized void method2456(int i) {
		Node_Sub6 node_sub6 = (Node_Sub6) aHashTable9636.method1516(false);
		if (i == -6762) {
			for (/**/; node_sub6 != null; node_sub6 = (Node_Sub6) aHashTable9636.method1520(i ^ ~0x1a1e))
				node_sub6.method2415(i + 6643);
			anInt9664++;
		}
	}
	
	final synchronized void method2457(int i, Node_Sub4 node_sub4, boolean bool) {
		method2436(bool, true, node_sub4, 18429);
		if (i == 197984776) {
			anInt9689++;
		}
	}
	
	static final Class205 method2458(BufferedStream buffer, int i) {
		anInt9630++;
		int i_75_ = buffer.readUnsignedByte();
		Class379 class379 = Class23.method302(i ^ 0x57fe3fe5)[buffer.readUnsignedByte()];
		Class77 class77 = PlayerDefinition.method3277(i ^ 0x2fd6)[buffer.readUnsignedByte()];
		int i_76_ = buffer.readShort();
		int i_77_ = buffer.readShort();
		int i_78_ = buffer.readUnsignedShort();
		int i_79_ = buffer.readUnsignedShort();
		int i_80_ = buffer.readInt();
		int i_81_ = buffer.readInt();
		int i_82_ = buffer.readInt();
		boolean bool = i == buffer.readUnsignedByte();
		return new Class205(i_75_, class379, class77, i_76_, i_77_, i_78_, i_79_, i_80_, i_81_, i_82_, bool);
	}
	
	private final void method2459(int i, int i_83_, int i_84_, boolean bool) {
		method2438(64, -42, i, i_83_);
		anInt9663++;
		if ((0x2 & anIntArray9680[i]) != 0) {
			for (Node_Sub10 node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3622((byte) -60); node_sub10 != null; node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3623((byte) 106)) {
				if ((i ^ 0xffffffff) == (node_sub10.anInt7080 ^ 0xffffffff) && (node_sub10.anInt7100 ^ 0xffffffff) > -1) {
					aNode_Sub10ArrayArray9679[i][node_sub10.anInt7091] = null;
					aNode_Sub10ArrayArray9679[i][i_83_] = node_sub10;
					int i_85_ = node_sub10.anInt7085 - -(node_sub10.anInt7101 * node_sub10.anInt7092 >> 12);
					node_sub10.anInt7085 += -node_sub10.anInt7091 + i_83_ << 8;
					node_sub10.anInt7092 = i_85_ - node_sub10.anInt7085;
					node_sub10.anInt7101 = 4096;
					node_sub10.anInt7091 = i_83_;
					return;
				}
			}
		}
		Node_Sub6 node_sub6 = (Node_Sub6) aHashTable9636.method1518(3512, (long) anIntArray9675[i]);
		if (node_sub6 != null) {
			Node_Sub45_Sub1 node_sub45_sub1 = node_sub6.aNode_Sub45_Sub1Array7049[i_83_];
			if (node_sub45_sub1 != null) {
				if (bool != true) {
					method2435(false);
				}
				Node_Sub10 node_sub10 = new Node_Sub10();
				node_sub10.aNode_Sub6_7098 = node_sub6;
				node_sub10.aNode_Sub45_Sub1_7087 = node_sub45_sub1;
				node_sub10.anInt7080 = i;
				node_sub10.aClass240_7094 = node_sub6.aClass240Array7045[i_83_];
				node_sub10.anInt7093 = node_sub6.aByteArray7054[i_83_];
				node_sub10.anInt7091 = i_83_;
				node_sub10.anInt7096 = node_sub6.aByteArray7057[i_83_] * (i_84_ * (i_84_ * node_sub6.anInt7052)) - -1024 >> 11;
				node_sub10.anInt7088 = node_sub6.aByteArray7046[i_83_] & 0xff;
				node_sub10.anInt7085 = -(node_sub6.aShortArray7044[i_83_] & 0x7fff) + (i_83_ << 8);
				node_sub10.anInt7102 = 0;
				node_sub10.anInt7090 = 0;
				node_sub10.anInt7100 = -1;
				node_sub10.anInt7084 = 0;
				node_sub10.anInt7078 = 0;
				if (anIntArray9659[i] == 0) {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub45_sub1, method2437(-27954, node_sub10), method2443(node_sub10, (byte) -118), method2446(128, node_sub10));
				} else {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub45_sub1, method2437(-27954, node_sub10), 0, method2446(128, node_sub10));
					method2466((node_sub6.aShortArray7044[i_83_] ^ 0xffffffff) > -1, node_sub10, -26045);
				}
				if (node_sub6.aShortArray7044[i_83_] < 0) {
					node_sub10.aNode_Sub9_Sub2_7095.method2481(-1);
				}
				if (node_sub10.anInt7093 >= 0) {
					Node_Sub10 node_sub10_86_ = aNode_Sub10ArrayArray9683[i][node_sub10.anInt7093];
					if (node_sub10_86_ != null && node_sub10_86_.anInt7100 < 0) {
						aNode_Sub10ArrayArray9679[i][node_sub10_86_.anInt7091] = null;
						node_sub10_86_.anInt7100 = 0;
					}
					aNode_Sub10ArrayArray9683[i][node_sub10.anInt7093] = node_sub10;
				}
				aNode_Sub9_Sub4_9698.aClass312_9739.method3625((byte) -54, node_sub10);
				aNode_Sub10ArrayArray9679[i][i_83_] = node_sub10;
			}
		}
	}
	
	private final void method2460(int i, int i_87_, int i_88_) {
		if (i_87_ != -5807) {
			anInt9700 = -101;
		}
		anInt9673++;
		anIntArray9654[i_88_] = i;
	}
	
	private final void method2461(int i, int i_89_) {
		Node_Sub10 node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3613(65280);
		if (i != 15025) {
			anIntArray9646 = null;
		}
		for (/**/; node_sub10 != null; node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3620(i ^ 0xffc5b1)) {
			if (((i_89_ ^ 0xffffffff) > -1 || i_89_ == node_sub10.anInt7080) && (node_sub10.anInt7100 ^ 0xffffffff) > -1) {
				aNode_Sub10ArrayArray9679[node_sub10.anInt7080][node_sub10.anInt7091] = null;
				node_sub10.anInt7100 = 0;
			}
		}
		anInt9644++;
	}
	
	private final void method2462(int i, int i_90_, int i_91_, int i_92_) {
		if (i_92_ < 57) {
			method2429();
		}
		anInt9635++;
	}
	
	private final void method2463(int i, boolean bool, int i_93_) {
		anIntArray9650[i_93_] = i;
		anInt9639++;
		anIntArray9660[i_93_] = Node_Sub30.method2723(-128, i);
		method2470(i_93_, i, (byte) -120);
		if (bool != false) {
			method2468(null, -43, null, -83, -55);
		}
	}
	
	private final void method2464(byte b, int i) {
		anInt9665++;
		if ((0x2 & anIntArray9680[i] ^ 0xffffffff) != -1) {
			for (Node_Sub10 node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3613(65280); node_sub10 != null; node_sub10 = (Node_Sub10) aNode_Sub9_Sub4_9698.aClass312_9739.method3620(16776960)) {
				if (i == node_sub10.anInt7080 && aNode_Sub10ArrayArray9679[i][node_sub10.anInt7091] == null && node_sub10.anInt7100 < 0) {
					node_sub10.anInt7100 = 0;
				}
			}
		}
	}
	
	private final void method2465(int i, boolean bool) {
		if (!bool) {
			method2461(15025, -1);
		} else {
			method2453(15, -1);
		}
		anInt9634++;
		method2442((byte) -56, -1);
		for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > -17; i_95_++)
			anIntArray9675[i_95_] = anIntArray9650[i_95_];
		for (int i_97_ = 0; (i_97_ ^ 0xffffffff) > -17; i_97_++)
			anIntArray9660[i_97_] = Node_Sub30.method2723(-128, anIntArray9650[i_97_]);
	}
	
	final void method2466(boolean bool, Node_Sub10 node_sub10, int i) {
		if (i == -26045) {
			anInt9676++;
			int i_98_ = node_sub10.aNode_Sub45_Sub1_7087.aByteArray10504.length;
			int i_99_;
			if (bool && node_sub10.aNode_Sub45_Sub1_7087.aBoolean10501) {
				int i_100_ = i_98_ + (i_98_ - node_sub10.aNode_Sub45_Sub1_7087.anInt10503);
				i_99_ = (int) ((long) i_100_ * (long) anIntArray9659[node_sub10.anInt7080] >> 6);
				i_98_ <<= 8;
				if (i_98_ <= i_99_) {
					i_99_ = -i_99_ + i_98_ + i_98_ - 1;
					node_sub10.aNode_Sub9_Sub2_7095.method2486(true);
				}
			} else {
				i_99_ = (int) ((long) anIntArray9659[node_sub10.anInt7080] * (long) i_98_ >> 6);
			}
			node_sub10.aNode_Sub9_Sub2_7095.method2507(i_99_);
		}
	}
	
	final synchronized boolean method2467(Class96 class96, Index class302, int i, int i_101_, Node_Sub4 node_sub4) {
		anInt9670++;
		node_sub4.method2174();
		boolean bool = true;
		int[] is = null;
		if ((i_101_ ^ 0xffffffff) < -1) {
			is = new int[] { i_101_ };
		}
		for (Node_Sub51 node_sub51 = (Node_Sub51) node_sub4.aHashTable6950.method1516(false); node_sub51 != null; node_sub51 = (Node_Sub51) node_sub4.aHashTable6950.method1520(70)) {
			int i_103_ = (int) node_sub51.aLong2797;
			Node_Sub6 node_sub6 = (Node_Sub6) aHashTable9636.method1518(3512, (long) i_103_);
			if (node_sub6 == null) {
				node_sub6 = Class360.method4043(class302, i_103_, false);
				if (node_sub6 == null) {
					bool = false;
					continue;
				}
				aHashTable9636.method1515((long) i_103_, node_sub6, -128);
			}
			if (!node_sub6.method2420((byte) -128, class96, is, node_sub51.aByteArray7631)) {
				bool = false;
			}
		}
		if (bool) {
			node_sub4.method2175();
		}
		return bool;
	}
	
	final synchronized void method2426(int i) {
		anInt9662++;
		if (aClass27_9666.method315()) {
			int i_104_ = aClass27_9666.anInt463 * anInt9661 / Class365.anInt4523;
			do {
				long l = (long) i * (long) i_104_ + aLong9701;
				if ((aLong9697 + -l ^ 0xffffffffffffffffL) <= -1L) {
					aLong9701 = l;
					break;
				}
				int i_105_ = (int) ((-1L + -aLong9701 + (aLong9697 + (long) i_104_)) / (long) i_104_);
				aLong9701 += (long) i_105_ * (long) i_104_;
				aNode_Sub9_Sub4_9698.method2426(i_105_);
				i -= i_105_;
				method2455((byte) -117);
			} while (aClass27_9666.method315());
		}
		aNode_Sub9_Sub4_9698.method2426(i);
	}
	
	final boolean method2468(Node_Sub10 node_sub10, int i, int[] is, int i_106_, int i_107_) {
		node_sub10.anInt7077 = Class365.anInt4523 / 100;
		anInt9632++;
		if (i <= 25) {
			return false;
		}
		if ((node_sub10.anInt7100 ^ 0xffffffff) <= -1 && (node_sub10.aNode_Sub9_Sub2_7095 == null || node_sub10.aNode_Sub9_Sub2_7095.method2474())) {
			node_sub10.method2541(-117);
			node_sub10.method2160((byte) 63);
			if (node_sub10.anInt7093 > 0 && aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] == node_sub10) {
				aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] = null;
			}
			return true;
		}
		int i_108_ = node_sub10.anInt7101;
		if ((i_108_ ^ 0xffffffff) < -1) {
			i_108_ -= (int) (Math.pow(2.0, (double) anIntArray9652[node_sub10.anInt7080] * 4.921259842519685E-4) * 16.0 + 0.5);
			if ((i_108_ ^ 0xffffffff) > -1) {
				i_108_ = 0;
			}
			node_sub10.anInt7101 = i_108_;
		}
		node_sub10.aNode_Sub9_Sub2_7095.method2482(method2437(-27954, node_sub10));
		Class240 class240 = node_sub10.aClass240_7094;
		node_sub10.anInt7082 += class240.anInt2938;
		boolean bool = false;
		node_sub10.anInt7099++;
		double d = 5.086263020833333E-6 * (double) ((-60 + node_sub10.anInt7091 << 8) - -(node_sub10.anInt7092 * node_sub10.anInt7101 >> 12));
		if (class240.anInt2933 > 0) {
			if ((class240.anInt2934 ^ 0xffffffff) < -1) {
				node_sub10.anInt7102 += (int) (0.5 + 128.0 * Math.pow(2.0, (double) class240.anInt2934 * d));
			} else {
				node_sub10.anInt7102 += 128;
			}
			if ((node_sub10.anInt7102 * class240.anInt2933 ^ 0xffffffff) <= -819201) {
				bool = true;
			}
		}
		if (class240.aByteArray2944 != null) {
			if (class240.anInt2940 <= 0) {
				node_sub10.anInt7084 += 128;
			} else {
				node_sub10.anInt7084 += (int) (128.0 * Math.pow(2.0, d * (double) class240.anInt2940) + 0.5);
			}
			for (/**/; node_sub10.anInt7078 < class240.aByteArray2944.length - 2; node_sub10.anInt7078 += 2) {
				if (node_sub10.anInt7084 <= (class240.aByteArray2944[2 + node_sub10.anInt7078] & 0xff) << 8) {
					break;
				}
			}
			if ((node_sub10.anInt7078 ^ 0xffffffff) == (-2 + class240.aByteArray2944.length ^ 0xffffffff) && (class240.aByteArray2944[node_sub10.anInt7078 + 1] ^ 0xffffffff) == -1) {
				bool = true;
			}
		}
		if ((node_sub10.anInt7100 ^ 0xffffffff) <= -1 && class240.aByteArray2942 != null && (anIntArray9680[node_sub10.anInt7080] & 0x1) == 0 && ((node_sub10.anInt7093 ^ 0xffffffff) > -1 || node_sub10 != aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093])) {
			if (class240.anInt2941 <= 0) {
				node_sub10.anInt7100 += 128;
			} else {
				node_sub10.anInt7100 += (int) (0.5 + 128.0 * Math.pow(2.0, d * (double) class240.anInt2941));
			}
			for (/**/; -2 + class240.aByteArray2942.length > node_sub10.anInt7090; node_sub10.anInt7090 += 2) {
				if ((node_sub10.anInt7100 ^ 0xffffffff) >= ((class240.aByteArray2942[node_sub10.anInt7090 + 2] & 0xff) << 8 ^ 0xffffffff)) {
					break;
				}
			}
			if (class240.aByteArray2942.length + -2 == node_sub10.anInt7090) {
				bool = true;
			}
		}
		if (bool) {
			node_sub10.aNode_Sub9_Sub2_7095.method2483(node_sub10.anInt7077);
			if (is != null) {
				node_sub10.aNode_Sub9_Sub2_7095.method2427(is, i_106_, i_107_);
			} else {
				node_sub10.aNode_Sub9_Sub2_7095.method2426(i_107_);
			}
			if (node_sub10.aNode_Sub9_Sub2_7095.method2499()) {
				aNode_Sub9_Sub4_9698.aNode_Sub9_Sub3_9740.method2513(node_sub10.aNode_Sub9_Sub2_7095);
			}
			node_sub10.method2541(-109);
			if (node_sub10.anInt7100 >= 0) {
				node_sub10.method2160((byte) 117);
				if ((node_sub10.anInt7093 ^ 0xffffffff) < -1 && aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] == node_sub10) {
					aNode_Sub10ArrayArray9683[node_sub10.anInt7080][node_sub10.anInt7093] = null;
				}
			}
			return true;
		}
		node_sub10.aNode_Sub9_Sub2_7095.method2501(node_sub10.anInt7077, method2443(node_sub10, (byte) -107), method2446(128, node_sub10));
		return false;
	}
	
	private final void method2469(int i, int i_109_, int i_110_) {
		if (i_110_ == 8383743) {
			anInt9669++;
		}
	}
	
	private final void method2470(int i, int i_111_, byte b) {
		if ((anIntArray9675[i] ^ 0xffffffff) != (i_111_ ^ 0xffffffff)) {
			anIntArray9675[i] = i_111_;
			for (int i_112_ = 0; (i_112_ ^ 0xffffffff) > -129; i_112_++)
				aNode_Sub10ArrayArray9683[i][i_112_] = null;
		}
		anInt9648++;
		if (b != -120) {
			method2442((byte) -119, -92);
		}
	}
	
	final int method2471(int i) {
		anInt9643++;
		if (i != 15) {
			return 114;
		}
		return anInt9655;
	}
	
	public Node_Sub9_Sub1() {
		anIntArray9631 = new int[16];
		anIntArray9646 = new int[16];
		anIntArray9660 = new int[16];
		anIntArray9641 = new int[16];
		anIntArray9640 = new int[16];
		anInt9661 = 1000000;
		anIntArray9654 = new int[16];
		anIntArray9652 = new int[16];
		anIntArray9677 = new int[16];
		anIntArray9672 = new int[16];
		aNode_Sub10ArrayArray9679 = new Node_Sub10[16][128];
		anIntArray9650 = new int[16];
		anInt9655 = 256;
		anIntArray9659 = new int[16];
		anIntArray9680 = new int[16];
		anIntArray9671 = new int[16];
		aNode_Sub10ArrayArray9683 = new Node_Sub10[16][128];
		anIntArray9668 = new int[16];
		anIntArray9685 = new int[16];
		anIntArray9675 = new int[16];
		aClass27_9666 = new Class27();
		aNode_Sub9_Sub4_9698 = new Node_Sub9_Sub4(this);
		aHashTable9636 = new HashTable(128);
		method2449(256, false, -1);
		method2465(-18, true);
	}
	
	Node_Sub9_Sub1(Node_Sub9_Sub1 node_sub9_sub1_113_) {
		anIntArray9631 = new int[16];
		anIntArray9646 = new int[16];
		anIntArray9660 = new int[16];
		anIntArray9641 = new int[16];
		anIntArray9640 = new int[16];
		anInt9661 = 1000000;
		anIntArray9654 = new int[16];
		anIntArray9652 = new int[16];
		anIntArray9677 = new int[16];
		anIntArray9672 = new int[16];
		aNode_Sub10ArrayArray9679 = new Node_Sub10[16][128];
		anIntArray9650 = new int[16];
		anInt9655 = 256;
		anIntArray9659 = new int[16];
		anIntArray9680 = new int[16];
		anIntArray9671 = new int[16];
		aNode_Sub10ArrayArray9683 = new Node_Sub10[16][128];
		anIntArray9668 = new int[16];
		anIntArray9685 = new int[16];
		anIntArray9675 = new int[16];
		aClass27_9666 = new Class27();
		aNode_Sub9_Sub4_9698 = new Node_Sub9_Sub4(this);
		aHashTable9636 = node_sub9_sub1_113_.aHashTable9636;
		method2449(256, false, -1);
		method2465(115, true);
	}
}
