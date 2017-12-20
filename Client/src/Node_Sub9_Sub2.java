/* Node_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub9_Sub2 extends Node_Sub9
{
	private int anInt9706;
	private int anInt9707;
	private int anInt9708;
	private int anInt9709;
	private int anInt9710;
	private int anInt9711;
	private int anInt9712;
	private int anInt9713;
	private int anInt9714;
	private int anInt9715;
	private int anInt9716;
	private boolean aBoolean9717;
	private int anInt9718;
	private int anInt9719;
	private int anInt9720;
	
	private final int method2472(int[] is, int i, int i_0_, int i_1_, int i_2_) {
		while (anInt9715 > 0) {
			int i_3_ = i + anInt9715;
			if (i_3_ > i_1_) {
				i_3_ = i_1_;
			}
			anInt9715 += i;
			if (anInt9710 == -256 && (anInt9718 & 0xff) == 0) {
				if (DrawableModel.aBoolean913) {
					i = method2505(0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, anInt9714, anInt9719, 0, i_3_, i_0_, this);
				} else {
					i = method2495(((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, anInt9709, 0, i_3_, i_0_, this);
				}
			} else if (DrawableModel.aBoolean913) {
				i = method2489(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, anInt9714, anInt9719, 0, i_3_, i_0_, this, anInt9710, i_2_);
			} else {
				i = method2510(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, anInt9709, 0, i_3_, i_0_, this, anInt9710, i_2_);
			}
			anInt9715 -= i;
			if (anInt9715 != 0) {
				return i;
			}
			if (method2508()) {
				return i_1_;
			}
		}
		if (anInt9710 == -256 && (anInt9718 & 0xff) == 0) {
			if (DrawableModel.aBoolean913) {
				return method2497(0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, 0, i_1_, i_0_, this);
			}
			return method2506(((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, 0, i_1_, i_0_, this);
		}
		if (DrawableModel.aBoolean913) {
			return method2487(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, 0, i_1_, i_0_, this, anInt9710, i_2_);
		}
		return method2502(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, 0, i_1_, i_0_, this, anInt9710, i_2_);
	}
	
	final synchronized void method2427(int[] is, int i, int i_4_) {
		if (anInt9716 == 0 && anInt9715 == 0) {
			method2426(i_4_);
		} else {
			Node_Sub45_Sub1 node_sub45_sub1 = (Node_Sub45_Sub1) aNode_Sub45_7075;
			int i_5_ = anInt9712 << 8;
			int i_6_ = anInt9706 << 8;
			int i_7_ = node_sub45_sub1.aByteArray10504.length << 8;
			int i_8_ = i_6_ - i_5_;
			if (i_8_ <= 0) {
				anInt9720 = 0;
			}
			int i_9_ = i;
			i_4_ += i;
			if (anInt9718 < 0) {
				if (anInt9710 > 0) {
					anInt9718 = 0;
				} else {
					method2498();
					this.method2160((byte) 50);
					return;
				}
			}
			if (anInt9718 >= i_7_) {
				if (anInt9710 < 0) {
					anInt9718 = i_7_ - 1;
				} else {
					method2498();
					this.method2160((byte) 30);
					return;
				}
			}
			if (anInt9720 < 0) {
				if (aBoolean9717) {
					if (anInt9710 < 0) {
						i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
						if (anInt9718 >= i_5_) {
							return;
						}
						anInt9718 = i_5_ + i_5_ - 1 - anInt9718;
						anInt9710 = -anInt9710;
					}
					for (;;) {
						i_9_ = method2480(is, i_9_, i_6_, i_4_, node_sub45_sub1.aByteArray10504[anInt9706 - 1]);
						if (anInt9718 < i_6_) {
							break;
						}
						anInt9718 = i_6_ + i_6_ - 1 - anInt9718;
						anInt9710 = -anInt9710;
						i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
						if (anInt9718 >= i_5_) {
							break;
						}
						anInt9718 = i_5_ + i_5_ - 1 - anInt9718;
						anInt9710 = -anInt9710;
					}
				} else if (anInt9710 < 0) {
					for (;;) {
						i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9706 - 1]);
						if (anInt9718 >= i_5_) {
							break;
						}
						anInt9718 = i_6_ - 1 - (i_6_ - 1 - anInt9718) % i_8_;
					}
				} else {
					for (;;) {
						i_9_ = method2480(is, i_9_, i_6_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
						if (anInt9718 < i_6_) {
							break;
						}
						anInt9718 = i_5_ + (anInt9718 - i_5_) % i_8_;
					}
				}
			} else {
				do {
					if (anInt9720 > 0) {
						if (aBoolean9717) {
							if (anInt9710 < 0) {
								i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
								if (anInt9718 >= i_5_) {
									return;
								}
								anInt9718 = i_5_ + i_5_ - 1 - anInt9718;
								anInt9710 = -anInt9710;
								if (--anInt9720 == 0) {
									break;
								}
							}
							do {
								i_9_ = method2480(is, i_9_, i_6_, i_4_, node_sub45_sub1.aByteArray10504[anInt9706 - 1]);
								if (anInt9718 < i_6_) {
									return;
								}
								anInt9718 = i_6_ + i_6_ - 1 - anInt9718;
								anInt9710 = -anInt9710;
								if (--anInt9720 == 0) {
									break;
								}
								i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
								if (anInt9718 >= i_5_) {
									return;
								}
								anInt9718 = i_5_ + i_5_ - 1 - anInt9718;
								anInt9710 = -anInt9710;
							} while (--anInt9720 != 0);
						} else if (anInt9710 < 0) {
							for (;;) {
								i_9_ = method2472(is, i_9_, i_5_, i_4_, node_sub45_sub1.aByteArray10504[anInt9706 - 1]);
								if (anInt9718 >= i_5_) {
									return;
								}
								int i_10_ = (i_6_ - 1 - anInt9718) / i_8_;
								if (i_10_ >= anInt9720) {
									anInt9718 += i_8_ * anInt9720;
									anInt9720 = 0;
									break;
								}
								anInt9718 += i_8_ * i_10_;
								anInt9720 -= i_10_;
							}
						} else {
							for (;;) {
								i_9_ = method2480(is, i_9_, i_6_, i_4_, node_sub45_sub1.aByteArray10504[anInt9712]);
								if (anInt9718 < i_6_) {
									return;
								}
								int i_11_ = (anInt9718 - i_5_) / i_8_;
								if (i_11_ >= anInt9720) {
									anInt9718 -= i_8_ * anInt9720;
									anInt9720 = 0;
									break;
								}
								anInt9718 -= i_8_ * i_11_;
								anInt9720 -= i_11_;
							}
						}
					}
				} while (false);
				if (anInt9710 < 0) {
					method2472(is, i_9_, 0, i_4_, 0);
					if (anInt9718 < 0) {
						anInt9718 = -1;
						method2498();
						this.method2160((byte) 94);
					}
				} else {
					method2480(is, i_9_, i_7_, i_4_, 0);
					if (anInt9718 >= i_7_) {
						anInt9718 = i_7_;
						method2498();
						this.method2160((byte) 121);
					}
				}
			}
		}
	}
	
	private static final int method2473(byte[] bs, int[] is, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, Node_Sub9_Sub2 node_sub9_sub2) {
		i >>= 8;
		i_16_ >>= 8;
		i_13_ <<= 2;
		if ((i_14_ = i_12_ + i_16_ - i) > i_15_) {
			i_14_ = i_15_;
		}
		i_14_ -= 3;
		while (i_12_ < i_14_) {
			is[i_12_++] += bs[i++] * i_13_;
			is[i_12_++] += bs[i++] * i_13_;
			is[i_12_++] += bs[i++] * i_13_;
			is[i_12_++] += bs[i++] * i_13_;
		}
		i_14_ += 3;
		while (i_12_ < i_14_)
			is[i_12_++] += bs[i++] * i_13_;
		node_sub9_sub2.anInt9718 = i << 8;
		return i_12_;
	}
	
	final boolean method2474() {
        return !(anInt9718 >= 0 && anInt9718 < ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504.length << 8);
    }
	
	private static final int method2475(int i, int i_17_, byte[] bs, int[] is, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, Node_Sub9_Sub2 node_sub9_sub2, int i_25_, int i_26_) {
		if (i_25_ == 0 || (i_22_ = i_19_ + (i_24_ - i_18_ + i_25_ - 257) / i_25_) > i_23_) {
			i_22_ = i_23_;
		}
		i_19_ <<= 1;
		i_22_ <<= 1;
		while (i_19_ < i_22_) {
			i_17_ = i_18_ >> 8;
			i = bs[i_17_];
			i = (i << 8) + (bs[i_17_ + 1] - i) * (i_18_ & 0xff);
			is[i_19_++] += i * i_20_ >> 6;
			is[i_19_++] += i * i_21_ >> 6;
			i_18_ += i_25_;
		}
		if (i_25_ == 0 || (i_22_ = (i_19_ >> 1) + (i_24_ - i_18_ + i_25_ - 1) / i_25_) > i_23_) {
			i_22_ = i_23_;
		}
		i_22_ <<= 1;
		i_17_ = i_26_;
		while (i_19_ < i_22_) {
			i = bs[i_18_ >> 8];
			i = (i << 8) + (i_17_ - i) * (i_18_ & 0xff);
			is[i_19_++] += i * i_20_ >> 6;
			is[i_19_++] += i * i_21_ >> 6;
			i_18_ += i_25_;
		}
		node_sub9_sub2.anInt9718 = i_18_;
		return i_19_ >> 1;
	}
	
	private static final int method2476(int i, int i_27_, byte[] bs, int[] is, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, Node_Sub9_Sub2 node_sub9_sub2, int i_37_, int i_38_) {
		node_sub9_sub2.anInt9707 -= node_sub9_sub2.anInt9709 * i_29_;
		if (i_37_ == 0 || (i_34_ = i_29_ + (i_36_ - i_28_ + i_37_ - 257) / i_37_) > i_35_) {
			i_34_ = i_35_;
		}
		i_29_ <<= 1;
		i_34_ <<= 1;
		while (i_29_ < i_34_) {
			i_27_ = i_28_ >> 8;
			i = bs[i_27_];
			i = (i << 8) + (bs[i_27_ + 1] - i) * (i_28_ & 0xff);
			is[i_29_++] += i * i_30_ >> 6;
			i_30_ += i_32_;
			is[i_29_++] += i * i_31_ >> 6;
			i_31_ += i_33_;
			i_28_ += i_37_;
		}
		if (i_37_ == 0 || (i_34_ = (i_29_ >> 1) + (i_36_ - i_28_ + i_37_ - 1) / i_37_) > i_35_) {
			i_34_ = i_35_;
		}
		i_34_ <<= 1;
		i_27_ = i_38_;
		while (i_29_ < i_34_) {
			i = bs[i_28_ >> 8];
			i = (i << 8) + (i_27_ - i) * (i_28_ & 0xff);
			is[i_29_++] += i * i_30_ >> 6;
			i_30_ += i_32_;
			is[i_29_++] += i * i_31_ >> 6;
			i_31_ += i_33_;
			i_28_ += i_37_;
		}
		i_29_ >>= 1;
		node_sub9_sub2.anInt9707 += node_sub9_sub2.anInt9709 * i_29_;
		node_sub9_sub2.anInt9711 = i_30_;
		node_sub9_sub2.anInt9708 = i_31_;
		node_sub9_sub2.anInt9718 = i_28_;
		return i_29_;
	}
	
	private final void method2477() {
		anInt9707 = anInt9716;
		anInt9711 = method2493(anInt9716, anInt9713);
		anInt9708 = method2491(anInt9716, anInt9713);
	}
	
	final synchronized void method2478(int i, int i_39_) {
		method2501(i, i_39_, method2511());
	}
	
	private static final int method2479(int i, int i_40_, byte[] bs, int[] is, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, Node_Sub9_Sub2 node_sub9_sub2, int i_47_, int i_48_) {
		if (i_47_ == 0 || (i_44_ = i_42_ + (i_46_ - i_41_ + i_47_ - 257) / i_47_) > i_45_) {
			i_44_ = i_45_;
		}
		while (i_42_ < i_44_) {
			i_40_ = i_41_ >> 8;
			i = bs[i_40_];
			is[i_42_++] += ((i << 8) + (bs[i_40_ + 1] - i) * (i_41_ & 0xff)) * i_43_ >> 6;
			i_41_ += i_47_;
		}
		if (i_47_ == 0 || (i_44_ = i_42_ + (i_46_ - i_41_ + i_47_ - 1) / i_47_) > i_45_) {
			i_44_ = i_45_;
		}
		i_40_ = i_48_;
		while (i_42_ < i_44_) {
			i = bs[i_41_ >> 8];
			is[i_42_++] += ((i << 8) + (i_40_ - i) * (i_41_ & 0xff)) * i_43_ >> 6;
			i_41_ += i_47_;
		}
		node_sub9_sub2.anInt9718 = i_41_;
		return i_42_;
	}
	
	private final int method2480(int[] is, int i, int i_49_, int i_50_, int i_51_) {
		while (anInt9715 > 0) {
			int i_52_ = i + anInt9715;
			if (i_52_ > i_50_) {
				i_52_ = i_50_;
			}
			anInt9715 += i;
			if (anInt9710 == 256 && (anInt9718 & 0xff) == 0) {
				if (DrawableModel.aBoolean913) {
					i = method2488(0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, anInt9714, anInt9719, 0, i_52_, i_49_, this);
				} else {
					i = method2484(((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, anInt9709, 0, i_52_, i_49_, this);
				}
			} else if (DrawableModel.aBoolean913) {
				i = method2476(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, anInt9714, anInt9719, 0, i_52_, i_49_, this, anInt9710, i_51_);
			} else {
				i = method2494(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, anInt9709, 0, i_52_, i_49_, this, anInt9710, i_51_);
			}
			anInt9715 -= i;
			if (anInt9715 != 0) {
				return i;
			}
			if (method2508()) {
				return i_50_;
			}
		}
		if (anInt9710 == 256 && (anInt9718 & 0xff) == 0) {
			if (DrawableModel.aBoolean913) {
				return method2492(0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, 0, i_50_, i_49_, this);
			}
			return method2473(((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, 0, i_50_, i_49_, this);
		}
		if (DrawableModel.aBoolean913) {
			return method2475(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9711, anInt9708, 0, i_50_, i_49_, this, anInt9710, i_51_);
		}
		return method2479(0, 0, ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504, is, anInt9718, i, anInt9707, 0, i_50_, i_49_, this, anInt9710, i_51_);
	}
	
	final synchronized void method2481(int i) {
		anInt9720 = i;
	}
	
	final synchronized void method2482(int i) {
		if (anInt9710 < 0) {
			anInt9710 = -i;
		} else {
			anInt9710 = i;
		}
	}
	
	final synchronized void method2483(int i) {
		if (i == 0) {
			method2485(0);
			this.method2160((byte) 45);
		} else if (anInt9711 == 0 && anInt9708 == 0) {
			anInt9715 = 0;
			anInt9716 = 0;
			anInt9707 = 0;
			this.method2160((byte) 27);
		} else {
			int i_53_ = -anInt9707;
			if (anInt9707 > i_53_) {
				i_53_ = anInt9707;
			}
			if (-anInt9711 > i_53_) {
				i_53_ = -anInt9711;
			}
			if (anInt9711 > i_53_) {
				i_53_ = anInt9711;
			}
			if (-anInt9708 > i_53_) {
				i_53_ = -anInt9708;
			}
			if (anInt9708 > i_53_) {
				i_53_ = anInt9708;
			}
			if (i > i_53_) {
				i = i_53_;
			}
			anInt9715 = i;
			anInt9716 = -2147483648;
			anInt9709 = -anInt9707 / i;
			anInt9714 = -anInt9711 / i;
			anInt9719 = -anInt9708 / i;
		}
	}
	
	private static final int method2484(byte[] bs, int[] is, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, Node_Sub9_Sub2 node_sub9_sub2) {
		i >>= 8;
		i_59_ >>= 8;
		i_55_ <<= 2;
		i_56_ <<= 2;
		if ((i_57_ = i_54_ + i_59_ - i) > i_58_) {
			i_57_ = i_58_;
		}
		node_sub9_sub2.anInt9711 += node_sub9_sub2.anInt9714 * (i_57_ - i_54_);
		node_sub9_sub2.anInt9708 += node_sub9_sub2.anInt9719 * (i_57_ - i_54_);
		i_57_ -= 3;
		while (i_54_ < i_57_) {
			is[i_54_++] += bs[i++] * i_55_;
			i_55_ += i_56_;
			is[i_54_++] += bs[i++] * i_55_;
			i_55_ += i_56_;
			is[i_54_++] += bs[i++] * i_55_;
			i_55_ += i_56_;
			is[i_54_++] += bs[i++] * i_55_;
			i_55_ += i_56_;
		}
		i_57_ += 3;
		while (i_54_ < i_57_) {
			is[i_54_++] += bs[i++] * i_55_;
			i_55_ += i_56_;
		}
		node_sub9_sub2.anInt9707 = i_55_ >> 2;
		node_sub9_sub2.anInt9718 = i << 8;
		return i_54_;
	}
	
	private final synchronized void method2485(int i) {
		method2500(i, method2511());
	}
	
	final synchronized void method2486(boolean bool) {
		anInt9710 = (anInt9710 ^ anInt9710 >> 31) + (anInt9710 >>> 31);
		if (bool) {
			anInt9710 = -anInt9710;
		}
	}
	
	private static final int method2487(int i, int i_60_, byte[] bs, int[] is, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, Node_Sub9_Sub2 node_sub9_sub2, int i_68_, int i_69_) {
		if (i_68_ == 0 || (i_65_ = i_62_ + (i_67_ + 256 - i_61_ + i_68_) / i_68_) > i_66_) {
			i_65_ = i_66_;
		}
		i_62_ <<= 1;
		i_65_ <<= 1;
		while (i_62_ < i_65_) {
			i_60_ = i_61_ >> 8;
			i = bs[i_60_ - 1];
			i = (i << 8) + (bs[i_60_] - i) * (i_61_ & 0xff);
			is[i_62_++] += i * i_63_ >> 6;
			is[i_62_++] += i * i_64_ >> 6;
			i_61_ += i_68_;
		}
		if (i_68_ == 0 || (i_65_ = (i_62_ >> 1) + (i_67_ - i_61_ + i_68_) / i_68_) > i_66_) {
			i_65_ = i_66_;
		}
		i_65_ <<= 1;
		i_60_ = i_69_;
		while (i_62_ < i_65_) {
			i = (i_60_ << 8) + (bs[i_61_ >> 8] - i_60_) * (i_61_ & 0xff);
			is[i_62_++] += i * i_63_ >> 6;
			is[i_62_++] += i * i_64_ >> 6;
			i_61_ += i_68_;
		}
		node_sub9_sub2.anInt9718 = i_61_;
		return i_62_ >> 1;
	}
	
	private static final int method2488(int i, byte[] bs, int[] is, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, Node_Sub9_Sub2 node_sub9_sub2) {
		i_70_ >>= 8;
		i_78_ >>= 8;
		i_72_ <<= 2;
		i_73_ <<= 2;
		i_74_ <<= 2;
		i_75_ <<= 2;
		if ((i_76_ = i_71_ + i_78_ - i_70_) > i_77_) {
			i_76_ = i_77_;
		}
		node_sub9_sub2.anInt9707 += node_sub9_sub2.anInt9709 * (i_76_ - i_71_);
		i_71_ <<= 1;
		i_76_ <<= 1;
		i_76_ -= 6;
		while (i_71_ < i_76_) {
			i = bs[i_70_++];
			is[i_71_++] += i * i_72_;
			i_72_ += i_74_;
			is[i_71_++] += i * i_73_;
			i_73_ += i_75_;
			i = bs[i_70_++];
			is[i_71_++] += i * i_72_;
			i_72_ += i_74_;
			is[i_71_++] += i * i_73_;
			i_73_ += i_75_;
			i = bs[i_70_++];
			is[i_71_++] += i * i_72_;
			i_72_ += i_74_;
			is[i_71_++] += i * i_73_;
			i_73_ += i_75_;
			i = bs[i_70_++];
			is[i_71_++] += i * i_72_;
			i_72_ += i_74_;
			is[i_71_++] += i * i_73_;
			i_73_ += i_75_;
		}
		i_76_ += 6;
		while (i_71_ < i_76_) {
			i = bs[i_70_++];
			is[i_71_++] += i * i_72_;
			i_72_ += i_74_;
			is[i_71_++] += i * i_73_;
			i_73_ += i_75_;
		}
		node_sub9_sub2.anInt9711 = i_72_ >> 2;
		node_sub9_sub2.anInt9708 = i_73_ >> 2;
		node_sub9_sub2.anInt9718 = i_70_ << 8;
		return i_71_ >> 1;
	}
	
	private static final int method2489(int i, int i_79_, byte[] bs, int[] is, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, Node_Sub9_Sub2 node_sub9_sub2, int i_89_, int i_90_) {
		node_sub9_sub2.anInt9707 -= node_sub9_sub2.anInt9709 * i_81_;
		if (i_89_ == 0 || (i_86_ = i_81_ + (i_88_ + 256 - i_80_ + i_89_) / i_89_) > i_87_) {
			i_86_ = i_87_;
		}
		i_81_ <<= 1;
		i_86_ <<= 1;
		while (i_81_ < i_86_) {
			i_79_ = i_80_ >> 8;
			i = bs[i_79_ - 1];
			i = (i << 8) + (bs[i_79_] - i) * (i_80_ & 0xff);
			is[i_81_++] += i * i_82_ >> 6;
			i_82_ += i_84_;
			is[i_81_++] += i * i_83_ >> 6;
			i_83_ += i_85_;
			i_80_ += i_89_;
		}
		if (i_89_ == 0 || (i_86_ = (i_81_ >> 1) + (i_88_ - i_80_ + i_89_) / i_89_) > i_87_) {
			i_86_ = i_87_;
		}
		i_86_ <<= 1;
		i_79_ = i_90_;
		while (i_81_ < i_86_) {
			i = (i_79_ << 8) + (bs[i_80_ >> 8] - i_79_) * (i_80_ & 0xff);
			is[i_81_++] += i * i_82_ >> 6;
			i_82_ += i_84_;
			is[i_81_++] += i * i_83_ >> 6;
			i_83_ += i_85_;
			i_80_ += i_89_;
		}
		i_81_ >>= 1;
		node_sub9_sub2.anInt9707 += node_sub9_sub2.anInt9709 * i_81_;
		node_sub9_sub2.anInt9711 = i_82_;
		node_sub9_sub2.anInt9708 = i_83_;
		node_sub9_sub2.anInt9718 = i_80_;
		return i_81_;
	}
	
	final Node_Sub9 method2429() {
		return null;
	}
	
	final synchronized void method2490(int i) {
		method2500(i << 6, method2511());
	}
	
	private static final int method2491(int i, int i_91_) {
		if (i_91_ < 0) {
			return -i;
		}
		return (int) ((double) i * Math.sqrt((double) i_91_ * 1.220703125E-4) + 0.5);
	}
	
	private static final int method2492(int i, byte[] bs, int[] is, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, Node_Sub9_Sub2 node_sub9_sub2) {
		i_92_ >>= 8;
		i_98_ >>= 8;
		i_94_ <<= 2;
		i_95_ <<= 2;
		if ((i_96_ = i_93_ + i_98_ - i_92_) > i_97_) {
			i_96_ = i_97_;
		}
		i_93_ <<= 1;
		i_96_ <<= 1;
		i_96_ -= 6;
		while (i_93_ < i_96_) {
			i = bs[i_92_++];
			is[i_93_++] += i * i_94_;
			is[i_93_++] += i * i_95_;
			i = bs[i_92_++];
			is[i_93_++] += i * i_94_;
			is[i_93_++] += i * i_95_;
			i = bs[i_92_++];
			is[i_93_++] += i * i_94_;
			is[i_93_++] += i * i_95_;
			i = bs[i_92_++];
			is[i_93_++] += i * i_94_;
			is[i_93_++] += i * i_95_;
		}
		i_96_ += 6;
		while (i_93_ < i_96_) {
			i = bs[i_92_++];
			is[i_93_++] += i * i_94_;
			is[i_93_++] += i * i_95_;
		}
		node_sub9_sub2.anInt9718 = i_92_ << 8;
		return i_93_ >> 1;
	}
	
	private static final int method2493(int i, int i_99_) {
		if (i_99_ < 0) {
			return i;
		}
		return (int) ((double) i * Math.sqrt((double) (16384 - i_99_) * 1.220703125E-4) + 0.5);
	}
	
	private static final int method2494(int i, int i_100_, byte[] bs, int[] is, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, Node_Sub9_Sub2 node_sub9_sub2, int i_108_, int i_109_) {
		node_sub9_sub2.anInt9711 -= node_sub9_sub2.anInt9714 * i_102_;
		node_sub9_sub2.anInt9708 -= node_sub9_sub2.anInt9719 * i_102_;
		if (i_108_ == 0 || (i_105_ = i_102_ + (i_107_ - i_101_ + i_108_ - 257) / i_108_) > i_106_) {
			i_105_ = i_106_;
		}
		while (i_102_ < i_105_) {
			i_100_ = i_101_ >> 8;
			i = bs[i_100_];
			is[i_102_++] += ((i << 8) + (bs[i_100_ + 1] - i) * (i_101_ & 0xff)) * i_103_ >> 6;
			i_103_ += i_104_;
			i_101_ += i_108_;
		}
		if (i_108_ == 0 || (i_105_ = i_102_ + (i_107_ - i_101_ + i_108_ - 1) / i_108_) > i_106_) {
			i_105_ = i_106_;
		}
		i_100_ = i_109_;
		while (i_102_ < i_105_) {
			i = bs[i_101_ >> 8];
			is[i_102_++] += ((i << 8) + (i_100_ - i) * (i_101_ & 0xff)) * i_103_ >> 6;
			i_103_ += i_104_;
			i_101_ += i_108_;
		}
		node_sub9_sub2.anInt9711 += node_sub9_sub2.anInt9714 * i_102_;
		node_sub9_sub2.anInt9708 += node_sub9_sub2.anInt9719 * i_102_;
		node_sub9_sub2.anInt9707 = i_103_;
		node_sub9_sub2.anInt9718 = i_101_;
		return i_102_;
	}
	
	private static final int method2495(byte[] bs, int[] is, int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, Node_Sub9_Sub2 node_sub9_sub2) {
		i >>= 8;
		i_115_ >>= 8;
		i_111_ <<= 2;
		i_112_ <<= 2;
		if ((i_113_ = i_110_ + i - (i_115_ - 1)) > i_114_) {
			i_113_ = i_114_;
		}
		node_sub9_sub2.anInt9711 += node_sub9_sub2.anInt9714 * (i_113_ - i_110_);
		node_sub9_sub2.anInt9708 += node_sub9_sub2.anInt9719 * (i_113_ - i_110_);
		i_113_ -= 3;
		while (i_110_ < i_113_) {
			is[i_110_++] += bs[i--] * i_111_;
			i_111_ += i_112_;
			is[i_110_++] += bs[i--] * i_111_;
			i_111_ += i_112_;
			is[i_110_++] += bs[i--] * i_111_;
			i_111_ += i_112_;
			is[i_110_++] += bs[i--] * i_111_;
			i_111_ += i_112_;
		}
		i_113_ += 3;
		while (i_110_ < i_113_) {
			is[i_110_++] += bs[i--] * i_111_;
			i_111_ += i_112_;
		}
		node_sub9_sub2.anInt9707 = i_111_ >> 2;
		node_sub9_sub2.anInt9718 = i << 8;
		return i_110_;
	}
	
	final synchronized void method2496(int i) {
		method2500(method2504(), i);
	}
	
	private static final int method2497(int i, byte[] bs, int[] is, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, Node_Sub9_Sub2 node_sub9_sub2) {
		i_116_ >>= 8;
		i_122_ >>= 8;
		i_118_ <<= 2;
		i_119_ <<= 2;
		if ((i_120_ = i_117_ + i_116_ - (i_122_ - 1)) > i_121_) {
			i_120_ = i_121_;
		}
		i_117_ <<= 1;
		i_120_ <<= 1;
		i_120_ -= 6;
		while (i_117_ < i_120_) {
			i = bs[i_116_--];
			is[i_117_++] += i * i_118_;
			is[i_117_++] += i * i_119_;
			i = bs[i_116_--];
			is[i_117_++] += i * i_118_;
			is[i_117_++] += i * i_119_;
			i = bs[i_116_--];
			is[i_117_++] += i * i_118_;
			is[i_117_++] += i * i_119_;
			i = bs[i_116_--];
			is[i_117_++] += i * i_118_;
			is[i_117_++] += i * i_119_;
		}
		i_120_ += 6;
		while (i_117_ < i_120_) {
			i = bs[i_116_--];
			is[i_117_++] += i * i_118_;
			is[i_117_++] += i * i_119_;
		}
		node_sub9_sub2.anInt9718 = i_116_ << 8;
		return i_117_ >> 1;
	}
	
	private final void method2498() {
		if (anInt9715 != 0) {
			if (anInt9716 == -2147483648) {
				anInt9716 = 0;
			}
			anInt9715 = 0;
			method2477();
		}
	}
	
	final boolean method2499() {
        return anInt9715 != 0;
    }
	
	private final synchronized void method2500(int i, int i_123_) {
		anInt9716 = i;
		anInt9713 = i_123_;
		anInt9715 = 0;
		method2477();
	}
	
	final synchronized void method2501(int i, int i_124_, int i_125_) {
		if (i == 0) {
			method2500(i_124_, i_125_);
		} else {
			int i_126_ = method2493(i_124_, i_125_);
			int i_127_ = method2491(i_124_, i_125_);
			if (anInt9711 == i_126_ && anInt9708 == i_127_) {
				anInt9715 = 0;
			} else {
				int i_128_ = i_124_ - anInt9707;
				if (anInt9707 - i_124_ > i_128_) {
					i_128_ = anInt9707 - i_124_;
				}
				if (i_126_ - anInt9711 > i_128_) {
					i_128_ = i_126_ - anInt9711;
				}
				if (anInt9711 - i_126_ > i_128_) {
					i_128_ = anInt9711 - i_126_;
				}
				if (i_127_ - anInt9708 > i_128_) {
					i_128_ = i_127_ - anInt9708;
				}
				if (anInt9708 - i_127_ > i_128_) {
					i_128_ = anInt9708 - i_127_;
				}
				if (i > i_128_) {
					i = i_128_;
				}
				anInt9715 = i;
				anInt9716 = i_124_;
				anInt9713 = i_125_;
				anInt9709 = (i_124_ - anInt9707) / i;
				anInt9714 = (i_126_ - anInt9711) / i;
				anInt9719 = (i_127_ - anInt9708) / i;
			}
		}
	}
	
	private static final int method2502(int i, int i_129_, byte[] bs, int[] is, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, Node_Sub9_Sub2 node_sub9_sub2, int i_136_, int i_137_) {
		if (i_136_ == 0 || (i_133_ = i_131_ + (i_135_ + 256 - i_130_ + i_136_) / i_136_) > i_134_) {
			i_133_ = i_134_;
		}
		while (i_131_ < i_133_) {
			i_129_ = i_130_ >> 8;
			i = bs[i_129_ - 1];
			is[i_131_++] += ((i << 8) + (bs[i_129_] - i) * (i_130_ & 0xff)) * i_132_ >> 6;
			i_130_ += i_136_;
		}
		if (i_136_ == 0 || (i_133_ = i_131_ + (i_135_ - i_130_ + i_136_) / i_136_) > i_134_) {
			i_133_ = i_134_;
		}
		i = i_137_;
		i_129_ = i_136_;
		while (i_131_ < i_133_) {
			is[i_131_++] += ((i << 8) + (bs[i_130_ >> 8] - i) * (i_130_ & 0xff)) * i_132_ >> 6;
			i_130_ += i_129_;
		}
		node_sub9_sub2.anInt9718 = i_130_;
		return i_131_;
	}
	
	final int method2428() {
		if (anInt9716 == 0 && anInt9715 == 0) {
			return 0;
		}
		return 1;
	}
	
	final synchronized int method2503() {
		if (anInt9710 < 0) {
			return -anInt9710;
		}
		return anInt9710;
	}
	
	final synchronized int method2504() {
		if (anInt9716 == -2147483648) {
			return 0;
		}
		return anInt9716;
	}
	
	private static final int method2505(int i, byte[] bs, int[] is, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, Node_Sub9_Sub2 node_sub9_sub2) {
		i_138_ >>= 8;
		i_146_ >>= 8;
		i_140_ <<= 2;
		i_141_ <<= 2;
		i_142_ <<= 2;
		i_143_ <<= 2;
		if ((i_144_ = i_139_ + i_138_ - (i_146_ - 1)) > i_145_) {
			i_144_ = i_145_;
		}
		node_sub9_sub2.anInt9707 += node_sub9_sub2.anInt9709 * (i_144_ - i_139_);
		i_139_ <<= 1;
		i_144_ <<= 1;
		i_144_ -= 6;
		while (i_139_ < i_144_) {
			i = bs[i_138_--];
			is[i_139_++] += i * i_140_;
			i_140_ += i_142_;
			is[i_139_++] += i * i_141_;
			i_141_ += i_143_;
			i = bs[i_138_--];
			is[i_139_++] += i * i_140_;
			i_140_ += i_142_;
			is[i_139_++] += i * i_141_;
			i_141_ += i_143_;
			i = bs[i_138_--];
			is[i_139_++] += i * i_140_;
			i_140_ += i_142_;
			is[i_139_++] += i * i_141_;
			i_141_ += i_143_;
			i = bs[i_138_--];
			is[i_139_++] += i * i_140_;
			i_140_ += i_142_;
			is[i_139_++] += i * i_141_;
			i_141_ += i_143_;
		}
		i_144_ += 6;
		while (i_139_ < i_144_) {
			i = bs[i_138_--];
			is[i_139_++] += i * i_140_;
			i_140_ += i_142_;
			is[i_139_++] += i * i_141_;
			i_141_ += i_143_;
		}
		node_sub9_sub2.anInt9711 = i_140_ >> 2;
		node_sub9_sub2.anInt9708 = i_141_ >> 2;
		node_sub9_sub2.anInt9718 = i_138_ << 8;
		return i_139_ >> 1;
	}
	
	final synchronized void method2426(int i) {
		if (anInt9715 > 0) {
			if (i >= anInt9715) {
				if (anInt9716 == -2147483648) {
					anInt9716 = 0;
					anInt9707 = anInt9711 = anInt9708 = 0;
					this.method2160((byte) 118);
					i = anInt9715;
				}
				anInt9715 = 0;
				method2477();
			} else {
				anInt9707 += anInt9709 * i;
				anInt9711 += anInt9714 * i;
				anInt9708 += anInt9719 * i;
				anInt9715 -= i;
			}
		}
		Node_Sub45_Sub1 node_sub45_sub1 = (Node_Sub45_Sub1) aNode_Sub45_7075;
		int i_147_ = anInt9712 << 8;
		int i_148_ = anInt9706 << 8;
		int i_149_ = node_sub45_sub1.aByteArray10504.length << 8;
		int i_150_ = i_148_ - i_147_;
		if (i_150_ <= 0) {
			anInt9720 = 0;
		}
		if (anInt9718 < 0) {
			if (anInt9710 > 0) {
				anInt9718 = 0;
			} else {
				method2498();
				this.method2160((byte) 32);
				return;
			}
		}
		if (anInt9718 >= i_149_) {
			if (anInt9710 < 0) {
				anInt9718 = i_149_ - 1;
			} else {
				method2498();
				this.method2160((byte) 90);
				return;
			}
		}
		anInt9718 += anInt9710 * i;
		if (anInt9720 < 0) {
			if (aBoolean9717) {
				if (anInt9710 < 0) {
					if (anInt9718 >= i_147_) {
						return;
					}
					anInt9718 = i_147_ + i_147_ - 1 - anInt9718;
					anInt9710 = -anInt9710;
				}
				while (anInt9718 >= i_148_) {
					anInt9718 = i_148_ + i_148_ - 1 - anInt9718;
					anInt9710 = -anInt9710;
					if (anInt9718 >= i_147_) {
						break;
					}
					anInt9718 = i_147_ + i_147_ - 1 - anInt9718;
					anInt9710 = -anInt9710;
				}
			} else if (anInt9710 < 0) {
				if (anInt9718 < i_147_) {
					anInt9718 = i_148_ - 1 - (i_148_ - 1 - anInt9718) % i_150_;
				}
			} else if (anInt9718 >= i_148_) {
				anInt9718 = i_147_ + (anInt9718 - i_147_) % i_150_;
			}
		} else {
			do {
				if (anInt9720 > 0) {
					if (aBoolean9717) {
						if (anInt9710 < 0) {
							if (anInt9718 >= i_147_) {
								return;
							}
							anInt9718 = i_147_ + i_147_ - 1 - anInt9718;
							anInt9710 = -anInt9710;
							if (--anInt9720 == 0) {
								break;
							}
						}
						do {
							if (anInt9718 < i_148_) {
								return;
							}
							anInt9718 = i_148_ + i_148_ - 1 - anInt9718;
							anInt9710 = -anInt9710;
							if (--anInt9720 == 0) {
								break;
							}
							if (anInt9718 >= i_147_) {
								return;
							}
							anInt9718 = i_147_ + i_147_ - 1 - anInt9718;
							anInt9710 = -anInt9710;
						} while (--anInt9720 != 0);
					} else if (anInt9710 < 0) {
						if (anInt9718 >= i_147_) {
							return;
						}
						int i_151_ = (i_148_ - 1 - anInt9718) / i_150_;
						if (i_151_ >= anInt9720) {
							anInt9718 += i_150_ * anInt9720;
							anInt9720 = 0;
						} else {
							anInt9718 += i_150_ * i_151_;
							anInt9720 -= i_151_;
							return;
						}
					} else {
						if (anInt9718 < i_148_) {
							return;
						}
						int i_152_ = (anInt9718 - i_147_) / i_150_;
						if (i_152_ >= anInt9720) {
							anInt9718 -= i_150_ * anInt9720;
							anInt9720 = 0;
						} else {
							anInt9718 -= i_150_ * i_152_;
							anInt9720 -= i_152_;
							return;
						}
					}
				}
			} while (false);
			if (anInt9710 < 0) {
				if (anInt9718 < 0) {
					anInt9718 = -1;
					method2498();
					this.method2160((byte) 59);
				}
			} else if (anInt9718 >= i_149_) {
				anInt9718 = i_149_;
				method2498();
				this.method2160((byte) 61);
			}
		}
	}
	
	private static final int method2506(byte[] bs, int[] is, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, Node_Sub9_Sub2 node_sub9_sub2) {
		i >>= 8;
		i_157_ >>= 8;
		i_154_ <<= 2;
		if ((i_155_ = i_153_ + i - (i_157_ - 1)) > i_156_) {
			i_155_ = i_156_;
		}
		i_155_ -= 3;
		while (i_153_ < i_155_) {
			is[i_153_++] += bs[i--] * i_154_;
			is[i_153_++] += bs[i--] * i_154_;
			is[i_153_++] += bs[i--] * i_154_;
			is[i_153_++] += bs[i--] * i_154_;
		}
		i_155_ += 3;
		while (i_153_ < i_155_)
			is[i_153_++] += bs[i--] * i_154_;
		node_sub9_sub2.anInt9718 = i << 8;
		return i_153_;
	}
	
	final synchronized void method2507(int i) {
		int i_158_ = ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504.length << 8;
		if (i < -1) {
			i = -1;
		}
		if (i > i_158_) {
			i = i_158_;
		}
		anInt9718 = i;
	}
	
	final Node_Sub9 method2431() {
		return null;
	}
	
	private final boolean method2508() {
		int i = anInt9716;
		int i_159_;
		int i_160_;
		if (i == -2147483648) {
			i = i_159_ = i_160_ = 0;
		} else {
			i_159_ = method2493(i, anInt9713);
			i_160_ = method2491(i, anInt9713);
		}
		if (anInt9707 != i || anInt9711 != i_159_ || anInt9708 != i_160_) {
			if (anInt9707 < i) {
				anInt9709 = 1;
				anInt9715 = i - anInt9707;
			} else if (anInt9707 > i) {
				anInt9709 = -1;
				anInt9715 = anInt9707 - i;
			} else {
				anInt9709 = 0;
			}
			if (anInt9711 < i_159_) {
				anInt9714 = 1;
				if (anInt9715 == 0 || anInt9715 > i_159_ - anInt9711) {
					anInt9715 = i_159_ - anInt9711;
				}
			} else if (anInt9711 > i_159_) {
				anInt9714 = -1;
				if (anInt9715 == 0 || anInt9715 > anInt9711 - i_159_) {
					anInt9715 = anInt9711 - i_159_;
				}
			} else {
				anInt9714 = 0;
			}
			if (anInt9708 < i_160_) {
				anInt9719 = 1;
				if (anInt9715 == 0 || anInt9715 > i_160_ - anInt9708) {
					anInt9715 = i_160_ - anInt9708;
				}
			} else if (anInt9708 > i_160_) {
				anInt9719 = -1;
				if (anInt9715 == 0 || anInt9715 > anInt9708 - i_160_) {
					anInt9715 = anInt9708 - i_160_;
				}
			} else {
				anInt9719 = 0;
			}
			return false;
		}
		if (anInt9716 == -2147483648) {
			anInt9716 = 0;
			anInt9707 = anInt9711 = anInt9708 = 0;
			this.method2160((byte) 100);
			return true;
		}
		method2477();
		return false;
	}
	
	static final Node_Sub9_Sub2 method2509(Node_Sub45_Sub1 node_sub45_sub1, int i, int i_161_, int i_162_) {
		if (node_sub45_sub1.aByteArray10504 == null || node_sub45_sub1.aByteArray10504.length == 0) {
			return null;
		}
		return new Node_Sub9_Sub2(node_sub45_sub1, i, i_161_, i_162_);
	}
	
	private static final int method2510(int i, int i_163_, byte[] bs, int[] is, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, Node_Sub9_Sub2 node_sub9_sub2, int i_171_, int i_172_) {
		node_sub9_sub2.anInt9711 -= node_sub9_sub2.anInt9714 * i_165_;
		node_sub9_sub2.anInt9708 -= node_sub9_sub2.anInt9719 * i_165_;
		if (i_171_ == 0 || (i_168_ = i_165_ + (i_170_ + 256 - i_164_ + i_171_) / i_171_) > i_169_) {
			i_168_ = i_169_;
		}
		while (i_165_ < i_168_) {
			i_163_ = i_164_ >> 8;
			i = bs[i_163_ - 1];
			is[i_165_++] += ((i << 8) + (bs[i_163_] - i) * (i_164_ & 0xff)) * i_166_ >> 6;
			i_166_ += i_167_;
			i_164_ += i_171_;
		}
		if (i_171_ == 0 || (i_168_ = i_165_ + (i_170_ - i_164_ + i_171_) / i_171_) > i_169_) {
			i_168_ = i_169_;
		}
		i = i_172_;
		i_163_ = i_171_;
		while (i_165_ < i_168_) {
			is[i_165_++] += ((i << 8) + (bs[i_164_ >> 8] - i) * (i_164_ & 0xff)) * i_166_ >> 6;
			i_166_ += i_167_;
			i_164_ += i_163_;
		}
		node_sub9_sub2.anInt9711 += node_sub9_sub2.anInt9714 * i_165_;
		node_sub9_sub2.anInt9708 += node_sub9_sub2.anInt9719 * i_165_;
		node_sub9_sub2.anInt9707 = i_166_;
		node_sub9_sub2.anInt9718 = i_164_;
		return i_165_;
	}
	
	private Node_Sub9_Sub2(Node_Sub45_Sub1 node_sub45_sub1, int i, int i_173_, int i_174_) {
		aNode_Sub45_7075 = node_sub45_sub1;
		anInt9712 = node_sub45_sub1.anInt10503;
		anInt9706 = node_sub45_sub1.anInt10505;
		aBoolean9717 = node_sub45_sub1.aBoolean10501;
		anInt9710 = i;
		anInt9716 = i_173_;
		anInt9713 = i_174_;
		anInt9718 = 0;
		method2477();
	}
	
	final int method2432() {
		int i = anInt9707 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt9720 == 0) {
			i -= i * anInt9718 / (((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504.length << 8);
		} else if (anInt9720 >= 0) {
			i -= i * anInt9712 / ((Node_Sub45_Sub1) aNode_Sub45_7075).aByteArray10504.length;
		}
		if (i > 255) {
			return 255;
		}
		return i;
	}
	
	final synchronized int method2511() {
		if (anInt9713 < 0) {
			return -1;
		}
		return anInt9713;
	}
}
