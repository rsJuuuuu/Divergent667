/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Model
{
	static int anInt2571;
	protected int anInt2572 = 0;
	protected int anInt2573;
	protected int[] anIntArray2574;
	protected short[] aShortArray2575;
	protected int[] anIntArray2576;
	protected short[] aShortArray2577;
	static int anInt2578;
	static int anInt2579;
	protected short[] aShortArray2580;
	static int anInt2581;
	protected short[] aShortArray2582;
	protected short[] aShortArray2583;
	protected int[] anIntArray2584;
	protected byte[] aByteArray2585;
	protected byte[] aByteArray2586;
	protected short[] aShortArray2587;
	protected int[] anIntArray2588;
	protected short[] aShortArray2589;
	protected Class300[] aClass300Array2590;
	static int anInt2591;
	static int anInt2592;
	protected int[] anIntArray2593;
	protected byte[] aByteArray2594;
	static int anInt2595;
	static int anInt2596;
	static int anInt2597;
	protected int[] anIntArray2598;
	protected int anInt2599 = 0;
	protected short[] aShortArray2600;
	static int anInt2601;
	protected int[] anIntArray2602;
	protected int[] anIntArray2603;
	protected short[] aShortArray2604;
	static int anInt2605;
	static int anInt2606;
	protected byte[] aByteArray2607;
	static int anInt2608;
	protected byte[] aByteArray2609;
	protected byte[] aByteArray2610;
	protected int anInt2611;
	static int anInt2612;
	protected short[] aShortArray2613;
	protected int anInt2614;
	protected int[] anIntArray2615;
	protected int[] anIntArray2616;
	protected int[] anIntArray2617;
	static int anInt2618;
	protected byte aByte2619;
	protected Class218[] aClass218Array2620;
	protected Class17[] aClass17Array2621;
	protected byte[] aByteArray2622;
	
	final int method2079(int i, int i_0_, int i_1_, int i_2_) {
		anInt2578++;
		if (i > -79) {
			anIntArray2615 = null;
		}
		for (int i_3_ = 0; i_3_ < anInt2599; i_3_++) {
			if ((i_2_ ^ 0xffffffff) == (anIntArray2616[i_3_] ^ 0xffffffff) && i_1_ == anIntArray2576[i_3_] && i_0_ == anIntArray2574[i_3_]) {
				return i_3_;
			}
		}
		anIntArray2616[anInt2599] = i_2_;
		anIntArray2576[anInt2599] = i_1_;
		anIntArray2574[anInt2599] = i_0_;
		anInt2573 = 1 + anInt2599;
		return anInt2599++;
	}
	
	final int method2080(boolean bool, int i, int i_4_, int i_5_, short s, short s_6_, byte b, byte b_7_, byte b_8_) {
		aShortArray2600[anInt2572] = (short) i;
		anInt2591++;
		aShortArray2583[anInt2572] = (short) i_5_;
		aShortArray2589[anInt2572] = (short) i_4_;
		aByteArray2594[anInt2572] = b_7_;
		if (bool != true) {
			method2085(-75, 8, 99, 125);
		}
		aByteArray2610[anInt2572] = b_8_;
		aShortArray2580[anInt2572] = s;
		aByteArray2622[anInt2572] = b;
		aShortArray2587[anInt2572] = s_6_;
		return anInt2572++;
	}
	
	final void method2081(int i, int i_9_) {
		for (int i_10_ = i_9_; (i_10_ ^ 0xffffffff) > (anInt2599 ^ 0xffffffff); i_10_++) {
			anIntArray2616[i_10_] <<= i;
			anIntArray2576[i_10_] <<= i;
			anIntArray2574[i_10_] <<= i;
		}
		anInt2612++;
		if (anInt2611 > 0 && anIntArray2603 != null) {
			for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anIntArray2603.length ^ 0xffffffff); i_11_++) {
				anIntArray2603[i_11_] <<= i;
				anIntArray2588[i_11_] <<= i;
				if ((aByteArray2586[i_11_] ^ 0xffffffff) != -2) {
					anIntArray2593[i_11_] <<= i;
				}
			}
		}
	}
	
	final void method2082(int i, int i_12_, int i_13_, int i_14_) {
		anInt2571++;
		for (int i_16_ = 0; anInt2599 > i_16_; i_16_++) {
			anIntArray2616[i_16_] += i;
			anIntArray2576[i_16_] += i_12_;
			anIntArray2574[i_16_] += i_14_;
		}
	}
	
	final int[][] method2083(int i, boolean bool) {
		anInt2581++;
		int[] is = new int[256];
		int i_17_ = 0;
		int i_18_ = !bool ? anInt2573 : anInt2599;
		for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_19_++) {
			int i_20_ = anIntArray2598[i_19_];
			if ((i_20_ ^ 0xffffffff) <= -1) {
				if ((i_17_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff)) {
					i_17_ = i_20_;
				}
				is[i_20_]++;
			}
		}
		int[][] is_21_ = new int[1 + i_17_][];
		for (int i_22_ = 0; (i_22_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff); i_22_++) {
			is_21_[i_22_] = new int[is[i_22_]];
			is[i_22_] = 0;
		}
		for (int i_23_ = i; i_23_ < i_18_; i_23_++) {
			int i_24_ = anIntArray2598[i_23_];
			if (i_24_ >= 0) {
				is_21_[i_24_][is[i_24_]++] = i_23_;
			}
		}
		return is_21_;
	}
	
	private final void method2084(byte[] bs, boolean bool) {
		anInt2597++;
		BufferedStream buffer = new BufferedStream(bs);
		BufferedStream buffer_25_ = new BufferedStream(bs);
		BufferedStream buffer_26_ = new BufferedStream(bs);
		BufferedStream buffer_27_ = new BufferedStream(bs);
		BufferedStream buffer_28_ = new BufferedStream(bs);
		BufferedStream buffer_29_ = new BufferedStream(bs);
		BufferedStream buffer_30_ = new BufferedStream(bs);
		buffer.offset = -23 + bs.length;
		anInt2599 = buffer.readUnsignedShort();
		anInt2572 = buffer.readUnsignedShort();
		anInt2611 = buffer.readUnsignedByte();
		int i = buffer.readUnsignedByte();
		boolean bool_31_ = (i & 0x1 ^ 0xffffffff) == -2;
		boolean bool_32_ = (i & 0x2) == 2;
		boolean bool_33_ = (i & 0x4 ^ 0xffffffff) == -5;
		boolean bool_34_ = (i & 0x8 ^ 0xffffffff) == -9;
		if (bool_34_) {
			buffer.offset -= 7;
			anInt2614 = buffer.readUnsignedByte();
			buffer.offset += 6;
		}
		int i_35_ = buffer.readUnsignedByte();
		int i_36_ = buffer.readUnsignedByte();
		int i_37_ = buffer.readUnsignedByte();
		int i_38_ = buffer.readUnsignedByte();
		int i_39_ = buffer.readUnsignedByte();
		int i_40_ = buffer.readUnsignedShort();
		int i_41_ = buffer.readUnsignedShort();
		int i_42_ = buffer.readUnsignedShort();
		int i_43_ = buffer.readUnsignedShort();
		int i_44_ = buffer.readUnsignedShort();
		int i_45_ = 0;
		int i_46_ = 0;
		int i_47_ = 0;
		if ((anInt2611 ^ 0xffffffff) < -1) {
			aByteArray2586 = new byte[anInt2611];
			buffer.offset = 0;
			for (int i_48_ = 0; (anInt2611 ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
				byte b = aByteArray2586[i_48_] = buffer.readByte();
				if (b == 0) {
					i_45_++;
				}
				if ((b ^ 0xffffffff) == -3) {
					i_47_++;
				}
				if (b >= 1 && (b ^ 0xffffffff) >= -4) {
					i_46_++;
				}
			}
		}
		int i_49_ = anInt2611;
		int i_50_ = i_49_;
		i_49_ += anInt2599;
		int i_51_ = i_49_;
		if (bool_31_) {
			i_49_ += anInt2572;
		}
		int i_52_ = i_49_;
		i_49_ += anInt2572;
		int i_53_ = i_49_;
		if ((i_35_ ^ 0xffffffff) == -256) {
			i_49_ += anInt2572;
		}
		int i_54_ = i_49_;
		if (i_37_ == 1) {
			i_49_ += anInt2572;
		}
		int i_55_ = i_49_;
		if ((i_39_ ^ 0xffffffff) == -2) {
			i_49_ += anInt2599;
		}
		int i_56_ = i_49_;
		if (i_36_ == 1) {
			i_49_ += anInt2572;
		}
		int i_57_ = i_49_;
		i_49_ += i_43_;
		int i_58_ = i_49_;
		if ((i_38_ ^ 0xffffffff) == -2) {
			i_49_ += anInt2572 * 2;
		}
		int i_59_ = i_49_;
		i_49_ += i_44_;
		int i_60_ = i_49_;
		i_49_ += 2 * anInt2572;
		int i_61_ = i_49_;
		i_49_ += i_40_;
		int i_62_ = i_49_;
		i_49_ += i_41_;
		int i_63_ = i_49_;
		i_49_ += i_42_;
		int i_64_ = i_49_;
		i_49_ += 6 * i_45_;
		int i_65_ = i_49_;
		i_49_ += i_46_ * 6;
		int i_66_ = 6;
		if (anInt2614 == 14) {
			i_66_ = 7;
		} else if ((anInt2614 ^ 0xffffffff) <= -16) {
			i_66_ = 9;
		}
		int i_67_ = i_49_;
		i_49_ += i_46_ * i_66_;
		int i_68_ = i_49_;
		i_49_ += i_46_;
		int i_69_ = i_49_;
		i_49_ += i_46_;
		int i_70_ = i_49_;
		i_49_ += i_46_ - -(2 * i_47_);
		aShortArray2580 = new short[anInt2572];
		buffer.offset = i_50_;
		if (bool_31_) {
			aByteArray2594 = new byte[anInt2572];
		}
		if ((anInt2611 ^ 0xffffffff) < -1) {
			aShortArray2613 = new short[anInt2611];
			if ((i_46_ ^ 0xffffffff) < -1) {
				anIntArray2593 = new int[i_46_];
				aByteArray2585 = new byte[i_46_];
				anIntArray2603 = new int[i_46_];
				aByteArray2609 = new byte[i_46_];
				anIntArray2617 = new int[i_46_];
				anIntArray2588 = new int[i_46_];
			}
			if ((i_47_ ^ 0xffffffff) < -1) {
				anIntArray2615 = new int[i_47_];
				anIntArray2584 = new int[i_47_];
			}
			aShortArray2577 = new short[anInt2611];
			aShortArray2604 = new short[anInt2611];
		}
		anIntArray2574 = new int[anInt2599];
		aShortArray2589 = new short[anInt2572];
		anIntArray2576 = new int[anInt2599];
		aShortArray2600 = new short[anInt2572];
		if (i_38_ == 1) {
			aShortArray2587 = new short[anInt2572];
		}
		if (i_35_ != 255) {
			aByte2619 = (byte) i_35_;
		} else {
			aByteArray2607 = new byte[anInt2572];
		}
		if (i_36_ == 1) {
			aByteArray2622 = new byte[anInt2572];
		}
		int i_71_ = i_49_;
		if ((i_39_ ^ 0xffffffff) == -2) {
			anIntArray2598 = new int[anInt2599];
		}
		anIntArray2616 = new int[anInt2599];
		if (i_38_ == 1 && anInt2611 > 0) {
			aByteArray2610 = new byte[anInt2572];
		}
		if (i_37_ == 1) {
			anIntArray2602 = new int[anInt2572];
		}
		aShortArray2583 = new short[anInt2572];
		buffer_25_.offset = i_61_;
		buffer_26_.offset = i_62_;
		buffer_27_.offset = i_63_;
		buffer_28_.offset = i_55_;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		for (int i_75_ = 0; i_75_ < anInt2599; i_75_++) {
			int i_76_ = buffer.readUnsignedByte();
			int i_77_ = 0;
			if ((0x1 & i_76_ ^ 0xffffffff) != -1) {
				i_77_ = buffer_25_.method2197(-129);
			}
			int i_78_ = 0;
			if ((i_76_ & 0x2 ^ 0xffffffff) != -1) {
				i_78_ = buffer_26_.method2197(-129);
			}
			int i_79_ = 0;
			if ((0x4 & i_76_) != 0) {
				i_79_ = buffer_27_.method2197(-129);
			}
			anIntArray2616[i_75_] = i_77_ + i_72_;
			anIntArray2576[i_75_] = i_73_ + i_78_;
			anIntArray2574[i_75_] = i_79_ + i_74_;
			i_73_ = anIntArray2576[i_75_];
			i_74_ = anIntArray2574[i_75_];
			i_72_ = anIntArray2616[i_75_];
			if (i_39_ == 1) {
				anIntArray2598[i_75_] = buffer_28_.readUnsignedByte();
			}
		}
		buffer.offset = i_60_;
		buffer_25_.offset = i_51_;
		buffer_26_.offset = i_53_;
		buffer_27_.offset = i_56_;
		buffer_28_.offset = i_54_;
		buffer_29_.offset = i_58_;
		buffer_30_.offset = i_59_;
		for (int i_80_ = 0; anInt2572 > i_80_; i_80_++) {
			aShortArray2580[i_80_] = (short) buffer.readUnsignedShort();
			if (bool_31_) {
				aByteArray2594[i_80_] = buffer_25_.readByte();
			}
			if ((i_35_ ^ 0xffffffff) == -256) {
				aByteArray2607[i_80_] = buffer_26_.readByte();
			}
			if ((i_36_ ^ 0xffffffff) == -2) {
				aByteArray2622[i_80_] = buffer_27_.readByte();
			}
			if (i_37_ == 1) {
				anIntArray2602[i_80_] = buffer_28_.readUnsignedByte();
			}
			if (i_38_ == 1) {
				aShortArray2587[i_80_] = (short) (buffer_29_.readUnsignedShort() - 1);
			}
			if (aByteArray2610 != null) {
				if (aShortArray2587[i_80_] != -1) {
					aByteArray2610[i_80_] = (byte) (-1 + buffer_30_.readUnsignedByte());
				} else {
					aByteArray2610[i_80_] = (byte) -1;
				}
			}
		}
		anInt2573 = -1;
		buffer.offset = i_57_;
		buffer_25_.offset = i_52_;
		short s = 0;
		short s_81_ = 0;
		short s_82_ = 0;
		int i_83_ = 0;
		for (int i_84_ = 0; (anInt2572 ^ 0xffffffff) < (i_84_ ^ 0xffffffff); i_84_++) {
			int i_85_ = buffer_25_.readUnsignedByte();
			if ((i_85_ ^ 0xffffffff) == -2) {
				s = (short) (buffer.method2197(-129) + i_83_);
				i_83_ = s;
				s_81_ = (short) (buffer.method2197(-129) + i_83_);
				i_83_ = s_81_;
				s_82_ = (short) (i_83_ + buffer.method2197(-129));
				i_83_ = s_82_;
				aShortArray2600[i_84_] = s;
				aShortArray2583[i_84_] = s_81_;
				aShortArray2589[i_84_] = s_82_;
				if ((anInt2573 ^ 0xffffffff) > (s ^ 0xffffffff)) {
					anInt2573 = s;
				}
				if (anInt2573 < s_81_) {
					anInt2573 = s_81_;
				}
				if ((s_82_ ^ 0xffffffff) < (anInt2573 ^ 0xffffffff)) {
					anInt2573 = s_82_;
				}
			}
			if (i_85_ == 2) {
				s_81_ = s_82_;
				s_82_ = (short) (buffer.method2197(-129) + i_83_);
				aShortArray2600[i_84_] = s;
				i_83_ = s_82_;
				aShortArray2583[i_84_] = s_81_;
				aShortArray2589[i_84_] = s_82_;
				if ((anInt2573 ^ 0xffffffff) > (s_82_ ^ 0xffffffff)) {
					anInt2573 = s_82_;
				}
			}
			if ((i_85_ ^ 0xffffffff) == -4) {
				s = s_82_;
				s_82_ = (short) (buffer.method2197(-129) + i_83_);
				aShortArray2600[i_84_] = s;
				i_83_ = s_82_;
				aShortArray2583[i_84_] = s_81_;
				aShortArray2589[i_84_] = s_82_;
				if ((anInt2573 ^ 0xffffffff) > (s_82_ ^ 0xffffffff)) {
					anInt2573 = s_82_;
				}
			}
			if (i_85_ == 4) {
				short s_86_ = s;
				s = s_81_;
				s_82_ = (short) (i_83_ + buffer.method2197(-129));
				s_81_ = s_86_;
				aShortArray2600[i_84_] = s;
				i_83_ = s_82_;
				aShortArray2583[i_84_] = s_81_;
				aShortArray2589[i_84_] = s_82_;
				if (s_82_ > anInt2573) {
					anInt2573 = s_82_;
				}
			}
		}
		if (bool == true) {
			buffer.offset = i_64_;
			anInt2573++;
			buffer_25_.offset = i_65_;
			buffer_26_.offset = i_67_;
			buffer_27_.offset = i_68_;
			buffer_28_.offset = i_69_;
			buffer_29_.offset = i_70_;
			for (int i_87_ = 0; i_87_ < anInt2611; i_87_++) {
				int i_88_ = aByteArray2586[i_87_] & 0xff;
				if (i_88_ == 0) {
					aShortArray2613[i_87_] = (short) buffer.readUnsignedShort();
					aShortArray2577[i_87_] = (short) buffer.readUnsignedShort();
					aShortArray2604[i_87_] = (short) buffer.readUnsignedShort();
				}
				if ((i_88_ ^ 0xffffffff) == -2) {
					aShortArray2613[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2577[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2604[i_87_] = (short) buffer_25_.readUnsignedShort();
					if (anInt2614 < 15) {
						anIntArray2603[i_87_] = buffer_26_.readUnsignedShort();
						if (anInt2614 < 14) {
							anIntArray2588[i_87_] = buffer_26_.readUnsignedShort();
						} else {
							anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						}
						anIntArray2593[i_87_] = buffer_26_.readUnsignedShort();
					} else {
						anIntArray2603[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2593[i_87_] = buffer_26_.read24BitInteger();
					}
					aByteArray2609[i_87_] = buffer_27_.readByte();
					aByteArray2585[i_87_] = buffer_28_.readByte();
					anIntArray2617[i_87_] = buffer_29_.readByte();
				}
				if ((i_88_ ^ 0xffffffff) == -3) {
					aShortArray2613[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2577[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2604[i_87_] = (short) buffer_25_.readUnsignedShort();
					if ((anInt2614 ^ 0xffffffff) > -16) {
						anIntArray2603[i_87_] = buffer_26_.readUnsignedShort();
						if ((anInt2614 ^ 0xffffffff) <= -15) {
							anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						} else {
							anIntArray2588[i_87_] = buffer_26_.readUnsignedShort();
						}
						anIntArray2593[i_87_] = buffer_26_.readUnsignedShort();
					} else {
						anIntArray2603[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2593[i_87_] = buffer_26_.read24BitInteger();
					}
					aByteArray2609[i_87_] = buffer_27_.readByte();
					aByteArray2585[i_87_] = buffer_28_.readByte();
					anIntArray2617[i_87_] = buffer_29_.readByte();
					anIntArray2615[i_87_] = buffer_29_.readByte();
					anIntArray2584[i_87_] = buffer_29_.readByte();
				}
				if ((i_88_ ^ 0xffffffff) == -4) {
					aShortArray2613[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2577[i_87_] = (short) buffer_25_.readUnsignedShort();
					aShortArray2604[i_87_] = (short) buffer_25_.readUnsignedShort();
					if ((anInt2614 ^ 0xffffffff) > -16) {
						anIntArray2603[i_87_] = buffer_26_.readUnsignedShort();
						if (anInt2614 < 14) {
							anIntArray2588[i_87_] = buffer_26_.readUnsignedShort();
						} else {
							anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						}
						anIntArray2593[i_87_] = buffer_26_.readUnsignedShort();
					} else {
						anIntArray2603[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2588[i_87_] = buffer_26_.read24BitInteger();
						anIntArray2593[i_87_] = buffer_26_.read24BitInteger();
					}
					aByteArray2609[i_87_] = buffer_27_.readByte();
					aByteArray2585[i_87_] = buffer_28_.readByte();
					anIntArray2617[i_87_] = buffer_29_.readByte();
				}
			}
			buffer.offset = i_71_;
			if (bool_32_) {
				int i_89_ = buffer.readUnsignedByte();
				if (i_89_ > 0) {
					aClass300Array2590 = new Class300[i_89_];
					for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > (i_89_ ^ 0xffffffff); i_90_++) {
						int i_91_ = buffer.readUnsignedShort();
						int i_92_ = buffer.readUnsignedShort();
						byte b;
						if (i_35_ == 255) {
							b = aByteArray2607[i_92_];
						} else {
							b = (byte) i_35_;
						}
						aClass300Array2590[i_90_] = new Class300(i_91_, aShortArray2600[i_92_], aShortArray2583[i_92_], aShortArray2589[i_92_], b);
					}
				}
				int i_93_ = buffer.readUnsignedByte();
				if (i_93_ > 0) {
					aClass218Array2620 = new Class218[i_93_];
					for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
						int i_95_ = buffer.readUnsignedShort();
						int i_96_ = buffer.readUnsignedShort();
						aClass218Array2620[i_94_] = new Class218(i_95_, i_96_);
					}
				}
			}
			if (bool_33_) {
				int i_97_ = buffer.readUnsignedByte();
				if ((i_97_ ^ 0xffffffff) < -1) {
					aClass17Array2621 = new Class17[i_97_];
					for (int i_98_ = 0; i_97_ > i_98_; i_98_++) {
						int i_99_ = buffer.readUnsignedShort();
						int i_100_ = buffer.readUnsignedShort();
						int i_101_ = buffer.readUnsignedByte();
						byte b = buffer.readByte();
						aClass17Array2621[i_98_] = new Class17(i_99_, i_100_, i_101_, b);
					}
				}
			}
		}
	}
	
	final void method2085(int i, int i_102_, int i_103_, int i_104_) {
		if (i != 0) {
			int i_105_ = Class335.anIntArray4167[i];
			int i_106_ = Class335.anIntArray4165[i];
			for (int i_107_ = 0; (anInt2599 ^ 0xffffffff) < (i_107_ ^ 0xffffffff); i_107_++) {
				int i_108_ = i_106_ * anIntArray2616[i_107_] + i_105_ * anIntArray2576[i_107_] >> 14;
				anIntArray2576[i_107_] = -(anIntArray2616[i_107_] * i_105_) + i_106_ * anIntArray2576[i_107_] >> 14;
				anIntArray2616[i_107_] = i_108_;
			}
		}
		anInt2605++;
		if ((i_102_ ^ 0xffffffff) != -1) {
			int i_109_ = Class335.anIntArray4167[i_102_];
			int i_110_ = Class335.anIntArray4165[i_102_];
			for (int i_111_ = 0; anInt2599 > i_111_; i_111_++) {
				int i_112_ = -(i_109_ * anIntArray2574[i_111_]) + i_110_ * anIntArray2576[i_111_] >> 14;
				anIntArray2574[i_111_] = i_109_ * anIntArray2576[i_111_] - -(anIntArray2574[i_111_] * i_110_) >> 14;
				anIntArray2576[i_111_] = i_112_;
			}
		}
		if (i_103_ >= -34) {
			method2093(null, 2, 37, (short) -86);
		}
		if ((i_104_ ^ 0xffffffff) != -1) {
			int i_113_ = Class335.anIntArray4167[i_104_];
			int i_114_ = Class335.anIntArray4165[i_104_];
			for (int i_115_ = 0; (anInt2599 ^ 0xffffffff) < (i_115_ ^ 0xffffffff); i_115_++) {
				int i_116_ = i_113_ * anIntArray2574[i_115_] + i_114_ * anIntArray2616[i_115_] >> 14;
				anIntArray2574[i_115_] = -(i_113_ * anIntArray2616[i_115_]) + anIntArray2574[i_115_] * i_114_ >> 14;
				anIntArray2616[i_115_] = i_116_;
			}
		}
	}
	
	final byte method2086(byte b, byte b_117_, byte b_118_, short s, short s_119_, short s_120_, short s_121_, short s_122_, short s_123_, byte b_124_) {
		if (b_118_ != -66) {
			anIntArray2603 = null;
		}
		anInt2606++;
		if (anInt2611 >= 255) {
			throw new IllegalStateException();
		}
		aByteArray2586[anInt2611] = (byte) 3;
		aShortArray2613[anInt2611] = s_119_;
		aShortArray2577[anInt2611] = s_121_;
		aShortArray2604[anInt2611] = s;
		anIntArray2603[anInt2611] = s_120_;
		anIntArray2588[anInt2611] = s_122_;
		anIntArray2593[anInt2611] = s_123_;
		aByteArray2609[anInt2611] = b;
		aByteArray2585[anInt2611] = b_117_;
		anIntArray2617[anInt2611] = b_124_;
		return (byte) anInt2611++;
	}
	
	final void method2087(short s, short s_125_, int i) {
		anInt2596++;
		if (aShortArray2587 != null) {
			int i_126_ = 0;
			for (/**/; anInt2572 > i_126_; i_126_++) {
				if ((aShortArray2587[i_126_] ^ 0xffffffff) == (s ^ 0xffffffff)) {
					aShortArray2587[i_126_] = s_125_;
				}
			}
		}
	}
	
	final int[][] method2088(byte b) {
		anInt2592++;
		int[] is = new int[256];
		int i = 0;
		for (int i_128_ = 0; (i_128_ ^ 0xffffffff) > (aClass17Array2621.length ^ 0xffffffff); i_128_++) {
			int i_129_ = aClass17Array2621[i_128_].anInt274;
			if (i_129_ >= 0) {
				if ((i_129_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
					i = i_129_;
				}
				is[i_129_]++;
			}
		}
		if (b != -80) {
			anIntArray2602 = null;
		}
		int[][] is_130_ = new int[1 + i][];
		for (int i_131_ = 0; (i_131_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_131_++) {
			is_130_[i_131_] = new int[is[i_131_]];
			is[i_131_] = 0;
		}
		for (int i_132_ = 0; aClass17Array2621.length > i_132_; i_132_++) {
			int i_133_ = aClass17Array2621[i_132_].anInt274;
			if (i_133_ >= 0) {
				is_130_[i_133_][is[i_133_]++] = i_132_;
			}
		}
		return is_130_;
	}
	
	final void method2089(short s, short s_134_, int i) {
		anInt2618++;
		int i_135_ = 0;
		for (/**/; (i_135_ ^ 0xffffffff) > (anInt2572 ^ 0xffffffff); i_135_++) {
			if (s == aShortArray2580[i_135_]) {
				aShortArray2580[i_135_] = s_134_;
			}
		}
	}
	
	final int[][] method2090(byte b) {
		anInt2608++;
		if (b != 73) {
			anIntArray2602 = null;
		}
		int[] is = new int[256];
		int i = 0;
		for (int i_137_ = 0; anInt2572 > i_137_; i_137_++) {
			int i_138_ = anIntArray2602[i_137_];
			if ((i_138_ ^ 0xffffffff) <= -1) {
				is[i_138_]++;
				if ((i_138_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
					i = i_138_;
				}
			}
		}
		int[][] is_139_ = new int[1 + i][];
		for (int i_140_ = 0; i >= i_140_; i_140_++) {
			is_139_[i_140_] = new int[is[i_140_]];
			is[i_140_] = 0;
		}
		for (int i_141_ = 0; (i_141_ ^ 0xffffffff) > (anInt2572 ^ 0xffffffff); i_141_++) {
			int i_142_ = anIntArray2602[i_141_];
			if (i_142_ >= 0) {
				is_139_[i_142_][is[i_142_]++] = i_141_;
			}
		}
		return is_139_;
	}
	
	private final void method2091(int i, byte[] bs) {
		anInt2579++;
		boolean bool = false;
		boolean bool_143_ = false;
		BufferedStream buffer = new BufferedStream(bs);
		BufferedStream buffer_144_ = new BufferedStream(bs);
		BufferedStream buffer_145_ = new BufferedStream(bs);
		BufferedStream buffer_146_ = new BufferedStream(bs);
		BufferedStream buffer_147_ = new BufferedStream(bs);
		buffer.offset = bs.length + -18;
		anInt2599 = buffer.readUnsignedShort();
		anInt2572 = buffer.readUnsignedShort();
		anInt2611 = buffer.readUnsignedByte();
		int i_148_ = buffer.readUnsignedByte();
		int i_149_ = buffer.readUnsignedByte();
		int i_150_ = buffer.readUnsignedByte();
		int i_151_ = buffer.readUnsignedByte();
		int i_152_ = buffer.readUnsignedByte();
		int i_153_ = buffer.readUnsignedShort();
		int i_154_ = buffer.readUnsignedShort();
		int i_155_ = buffer.readUnsignedShort();
		int i_156_ = buffer.readUnsignedShort();
		int i_157_ = 0;
		int i_158_ = i_157_;
		i_157_ += anInt2599;
		int i_159_ = i_157_;
		i_157_ += anInt2572;
		int i_160_ = i_157_;
		if (i_149_ == 255) {
			i_157_ += anInt2572;
		}
		int i_161_ = i_157_;
		if ((i_151_ ^ 0xffffffff) == -2) {
			i_157_ += anInt2572;
		}
		int i_162_ = i_157_;
		if (i_148_ == 1) {
			i_157_ += anInt2572;
		}
		int i_163_ = i_157_;
		if ((i_152_ ^ 0xffffffff) == -2) {
			i_157_ += anInt2599;
		}
		int i_164_ = i_157_;
		if ((i_150_ ^ 0xffffffff) == -2) {
			i_157_ += anInt2572;
		}
		int i_165_ = i_157_;
		i_157_ += i_156_;
		int i_166_ = i_157_;
		i_157_ += anInt2572 * 2;
		int i_167_ = i_157_;
		i_157_ += anInt2611 * 6;
		int i_168_ = i_157_;
		if (i < -18) {
			i_157_ += i_153_;
			int i_169_ = i_157_;
			i_157_ += i_154_;
			int i_170_ = i_157_;
			if (i_149_ == 255) {
				aByteArray2607 = new byte[anInt2572];
			} else {
				aByte2619 = (byte) i_149_;
			}
			if (i_151_ == 1) {
				anIntArray2602 = new int[anInt2572];
			}
			aShortArray2580 = new short[anInt2572];
			anIntArray2574 = new int[anInt2599];
			if (i_152_ == 1) {
				anIntArray2598 = new int[anInt2599];
			}
			aShortArray2583 = new short[anInt2572];
			anIntArray2576 = new int[anInt2599];
			anIntArray2616 = new int[anInt2599];
			buffer.offset = i_158_;
			i_157_ += i_155_;
			if ((anInt2611 ^ 0xffffffff) < -1) {
				aShortArray2577 = new short[anInt2611];
				aShortArray2604 = new short[anInt2611];
				aByteArray2586 = new byte[anInt2611];
				aShortArray2613 = new short[anInt2611];
			}
			if (i_148_ == 1) {
				aByteArray2594 = new byte[anInt2572];
				aShortArray2587 = new short[anInt2572];
				aByteArray2610 = new byte[anInt2572];
			}
			if ((i_150_ ^ 0xffffffff) == -2) {
				aByteArray2622 = new byte[anInt2572];
			}
			aShortArray2600 = new short[anInt2572];
			aShortArray2589 = new short[anInt2572];
			buffer_144_.offset = i_168_;
			buffer_145_.offset = i_169_;
			buffer_146_.offset = i_170_;
			buffer_147_.offset = i_163_;
			int i_171_ = 0;
			int i_172_ = 0;
			int i_173_ = 0;
			for (int i_174_ = 0; anInt2599 > i_174_; i_174_++) {
				int i_175_ = buffer.readUnsignedByte();
				int i_176_ = 0;
				if ((i_175_ & 0x1) != 0) {
					i_176_ = buffer_144_.method2197(-129);
				}
				int i_177_ = 0;
				if ((0x2 & i_175_ ^ 0xffffffff) != -1) {
					i_177_ = buffer_145_.method2197(-129);
				}
				int i_178_ = 0;
				if ((i_175_ & 0x4) != 0) {
					i_178_ = buffer_146_.method2197(-129);
				}
				anIntArray2616[i_174_] = i_176_ + i_171_;
				anIntArray2576[i_174_] = i_172_ + i_177_;
				anIntArray2574[i_174_] = i_173_ - -i_178_;
				i_171_ = anIntArray2616[i_174_];
				i_172_ = anIntArray2576[i_174_];
				i_173_ = anIntArray2574[i_174_];
				if ((i_152_ ^ 0xffffffff) == -2) {
					anIntArray2598[i_174_] = buffer_147_.readUnsignedByte();
				}
			}
			buffer.offset = i_166_;
			buffer_144_.offset = i_162_;
			buffer_145_.offset = i_160_;
			buffer_146_.offset = i_164_;
			buffer_147_.offset = i_161_;
			for (int i_179_ = 0; anInt2572 > i_179_; i_179_++) {
				aShortArray2580[i_179_] = (short) buffer.readUnsignedShort();
				if (i_148_ == 1) {
					int i_180_ = buffer_144_.readUnsignedByte();
					if ((0x1 & i_180_) != 1) {
						aByteArray2594[i_179_] = (byte) 0;
					} else {
						aByteArray2594[i_179_] = (byte) 1;
						bool = true;
					}
					if ((0x2 & i_180_ ^ 0xffffffff) == -3) {
						aByteArray2610[i_179_] = (byte) (i_180_ >> 2);
						aShortArray2587[i_179_] = aShortArray2580[i_179_];
						aShortArray2580[i_179_] = (short) 127;
						if (aShortArray2587[i_179_] != -1) {
							bool_143_ = true;
						}
					} else {
						aByteArray2610[i_179_] = (byte) -1;
						aShortArray2587[i_179_] = (short) -1;
					}
				}
				if ((i_149_ ^ 0xffffffff) == -256) {
					aByteArray2607[i_179_] = buffer_145_.readByte();
				}
				if (i_150_ == 1) {
					aByteArray2622[i_179_] = buffer_146_.readByte();
				}
				if (i_151_ == 1) {
					anIntArray2602[i_179_] = buffer_147_.readUnsignedByte();
				}
			}
			anInt2573 = -1;
			buffer.offset = i_165_;
			buffer_144_.offset = i_159_;
			short s = 0;
			short s_181_ = 0;
			short s_182_ = 0;
			int i_183_ = 0;
			for (int i_184_ = 0; i_184_ < anInt2572; i_184_++) {
				int i_185_ = buffer_144_.readUnsignedByte();
				if (i_185_ == 1) {
					s = (short) (i_183_ + buffer.method2197(-129));
					i_183_ = s;
					s_181_ = (short) (buffer.method2197(-129) + i_183_);
					i_183_ = s_181_;
					s_182_ = (short) (buffer.method2197(-129) + i_183_);
					i_183_ = s_182_;
					aShortArray2600[i_184_] = s;
					aShortArray2583[i_184_] = s_181_;
					aShortArray2589[i_184_] = s_182_;
					if (anInt2573 < s) {
						anInt2573 = s;
					}
					if (anInt2573 < s_181_) {
						anInt2573 = s_181_;
					}
					if (s_182_ > anInt2573) {
						anInt2573 = s_182_;
					}
				}
				if ((i_185_ ^ 0xffffffff) == -3) {
					s_181_ = s_182_;
					s_182_ = (short) (buffer.method2197(-129) + i_183_);
					i_183_ = s_182_;
					aShortArray2600[i_184_] = s;
					aShortArray2583[i_184_] = s_181_;
					aShortArray2589[i_184_] = s_182_;
					if (anInt2573 < s_182_) {
						anInt2573 = s_182_;
					}
				}
				if ((i_185_ ^ 0xffffffff) == -4) {
					s = s_182_;
					s_182_ = (short) (i_183_ + buffer.method2197(-129));
					aShortArray2600[i_184_] = s;
					i_183_ = s_182_;
					aShortArray2583[i_184_] = s_181_;
					aShortArray2589[i_184_] = s_182_;
					if ((anInt2573 ^ 0xffffffff) > (s_182_ ^ 0xffffffff)) {
						anInt2573 = s_182_;
					}
				}
				if ((i_185_ ^ 0xffffffff) == -5) {
					short s_186_ = s;
					s = s_181_;
					s_182_ = (short) (buffer.method2197(-129) + i_183_);
					s_181_ = s_186_;
					aShortArray2600[i_184_] = s;
					i_183_ = s_182_;
					aShortArray2583[i_184_] = s_181_;
					aShortArray2589[i_184_] = s_182_;
					if ((anInt2573 ^ 0xffffffff) > (s_182_ ^ 0xffffffff)) {
						anInt2573 = s_182_;
					}
				}
			}
			buffer.offset = i_167_;
			anInt2573++;
			for (int i_187_ = 0; anInt2611 > i_187_; i_187_++) {
				aByteArray2586[i_187_] = (byte) 0;
				aShortArray2613[i_187_] = (short) buffer.readUnsignedShort();
				aShortArray2577[i_187_] = (short) buffer.readUnsignedShort();
				aShortArray2604[i_187_] = (short) buffer.readUnsignedShort();
			}
			if (aByteArray2610 != null) {
				boolean bool_188_ = false;
				for (int i_189_ = 0; i_189_ < anInt2572; i_189_++) {
					int i_190_ = aByteArray2610[i_189_] & 0xff;
					if (i_190_ != 255) {
						if ((aShortArray2613[i_190_] & 0xffff) != aShortArray2600[i_189_] || aShortArray2583[i_189_] != (aShortArray2577[i_190_] & 0xffff) || aShortArray2589[i_189_] != (aShortArray2604[i_190_] & 0xffff)) {
							bool_188_ = true;
						} else {
							aByteArray2610[i_189_] = (byte) -1;
						}
					}
				}
				if (!bool_188_) {
					aByteArray2610 = null;
				}
			}
			if (!bool) {
				aByteArray2594 = null;
			}
			if (!bool_143_) {
				aShortArray2587 = null;
			}
		}
	}
	
	static final void method2092(int i, byte b, int i_191_, int i_192_) {
		anInt2595++;
		Class343 class343 = CacheNode_Sub18.aClass343ArrayArray9608[i_191_][i_192_];
		if (b == 8) {
			Class84.method985(i, class343 == null ? Class295.aClass343_3695 : class343, b ^ 0x9);
		}
	}
	
	private final int method2093(Model model_193_, int i, int i_194_, short s) {
		anInt2601++;
		int i_195_ = model_193_.anIntArray2616[i_194_];
		int i_196_ = model_193_.anIntArray2576[i_194_];
		int i_197_ = model_193_.anIntArray2574[i_194_];
		for (int i_198_ = i; anInt2599 > i_198_; i_198_++) {
			if ((anIntArray2616[i_198_] ^ 0xffffffff) == (i_195_ ^ 0xffffffff) && (anIntArray2576[i_198_] ^ 0xffffffff) == (i_196_ ^ 0xffffffff) && i_197_ == anIntArray2574[i_198_]) {
				aShortArray2582[i_198_] = (short) Node_Sub16.method2590(aShortArray2582[i_198_], s);
				return i_198_;
			}
		}
		anIntArray2616[anInt2599] = i_195_;
		anIntArray2576[anInt2599] = i_196_;
		anIntArray2574[anInt2599] = i_197_;
		aShortArray2582[anInt2599] = s;
		anIntArray2598[anInt2599] = model_193_.anIntArray2598 != null ? model_193_.anIntArray2598[i_194_] : -1;
		return anInt2599++;
	}
	
	public Model() {
		anInt2573 = 0;
		anInt2611 = 0;
		aByte2619 = (byte) 0;
		anInt2614 = 12;
	}
	
	Model(byte[] bs) {
		anInt2573 = 0;
		anInt2611 = 0;
		aByte2619 = (byte) 0;
		anInt2614 = 12;
		if ((bs[-1 + bs.length] ^ 0xffffffff) == 0 && bs[-2 + bs.length] == -1) {
			method2084(bs, true);
		} else {
			method2091(-51, bs);
		}
	}
	
	Model(int i, int i_199_, int i_200_) {
		anInt2573 = 0;
		anInt2611 = 0;
		aByte2619 = (byte) 0;
		anInt2614 = 12;
		anIntArray2602 = new int[i_199_];
		aShortArray2587 = new short[i_199_];
		aShortArray2580 = new short[i_199_];
		aShortArray2583 = new short[i_199_];
		aByteArray2607 = new byte[i_199_];
		aByteArray2594 = new byte[i_199_];
		anIntArray2576 = new int[i];
		aShortArray2600 = new short[i_199_];
		if ((i_200_ ^ 0xffffffff) < -1) {
			aShortArray2577 = new short[i_200_];
			anIntArray2603 = new int[i_200_];
			aByteArray2585 = new byte[i_200_];
			anIntArray2617 = new int[i_200_];
			aShortArray2613 = new short[i_200_];
			aShortArray2604 = new short[i_200_];
			aByteArray2586 = new byte[i_200_];
			anIntArray2593 = new int[i_200_];
			aByteArray2609 = new byte[i_200_];
			anIntArray2615 = new int[i_200_];
			anIntArray2584 = new int[i_200_];
			anIntArray2588 = new int[i_200_];
		}
		anIntArray2616 = new int[i];
		anIntArray2598 = new int[i];
		anIntArray2574 = new int[i];
		aByteArray2610 = new byte[i_199_];
		aByteArray2622 = new byte[i_199_];
		aShortArray2589 = new short[i_199_];
	}
	
	Model(Model[] models, int i) {
		anInt2573 = 0;
		anInt2611 = 0;
		aByte2619 = (byte) 0;
		anInt2614 = 12;
		anInt2611 = 0;
		anInt2599 = 0;
		anInt2572 = 0;
		int i_201_ = 0;
		int i_202_ = 0;
		int i_203_ = 0;
		boolean bool = false;
		boolean bool_204_ = false;
		boolean bool_205_ = false;
		boolean bool_206_ = false;
		boolean bool_207_ = false;
		boolean bool_208_ = false;
		aByte2619 = (byte) -1;
		for (int i_209_ = 0; i_209_ < i; i_209_++) {
			Model model_210_ = models[i_209_];
			if (model_210_ != null) {
				anInt2572 += model_210_.anInt2572;
				anInt2611 += model_210_.anInt2611;
				anInt2599 += model_210_.anInt2599;
				if (model_210_.aClass218Array2620 != null) {
					i_202_ += model_210_.aClass218Array2620.length;
				}
				if (model_210_.aClass17Array2621 != null) {
					i_203_ += model_210_.aClass17Array2621.length;
				}
				if (model_210_.aClass300Array2590 != null) {
					i_201_ += model_210_.aClass300Array2590.length;
				}
				bool = bool | model_210_.aByteArray2594 != null;
				bool_205_ = bool_205_ | model_210_.aByteArray2622 != null;
				if (model_210_.aByteArray2607 != null) {
					bool_204_ = true;
				} else {
					if ((aByte2619 ^ 0xffffffff) == 0) {
						aByte2619 = model_210_.aByte2619;
					}
					if (model_210_.aByte2619 != aByte2619) {
						bool_204_ = true;
					}
				}
				bool_206_ = bool_206_ | model_210_.aByteArray2610 != null;
				bool_208_ = bool_208_ | model_210_.anIntArray2602 != null;
				bool_207_ = bool_207_ | model_210_.aShortArray2587 != null;
			}
		}
		anIntArray2616 = new int[anInt2599];
		aShortArray2600 = new short[anInt2572];
		if (bool) {
			aByteArray2594 = new byte[anInt2572];
		}
		if (i_202_ > 0) {
			aClass218Array2620 = new Class218[i_202_];
		}
		aShortArray2582 = new short[anInt2599];
		anIntArray2576 = new int[anInt2599];
		aShortArray2575 = new short[anInt2572];
		if (bool_208_) {
			anIntArray2602 = new int[anInt2572];
		}
		aShortArray2580 = new short[anInt2572];
		aShortArray2583 = new short[anInt2572];
		aShortArray2589 = new short[anInt2572];
		if (anInt2611 > 0) {
			anIntArray2603 = new int[anInt2611];
			aByteArray2609 = new byte[anInt2611];
			aByteArray2585 = new byte[anInt2611];
			aShortArray2604 = new short[anInt2611];
			aShortArray2613 = new short[anInt2611];
			anIntArray2593 = new int[anInt2611];
			aShortArray2577 = new short[anInt2611];
			anIntArray2615 = new int[anInt2611];
			aByteArray2586 = new byte[anInt2611];
			anIntArray2617 = new int[anInt2611];
			anIntArray2588 = new int[anInt2611];
			anIntArray2584 = new int[anInt2611];
		}
		if ((i_203_ ^ 0xffffffff) < -1) {
			aClass17Array2621 = new Class17[i_203_];
		}
		if (bool_206_) {
			aByteArray2610 = new byte[anInt2572];
		}
		anIntArray2598 = new int[anInt2599];
		anIntArray2574 = new int[anInt2599];
		if (bool_207_) {
			aShortArray2587 = new short[anInt2572];
		}
		if (bool_205_) {
			aByteArray2622 = new byte[anInt2572];
		}
		if (i_201_ > 0) {
			aClass300Array2590 = new Class300[i_201_];
		}
		if (bool_204_) {
			aByteArray2607 = new byte[anInt2572];
		}
		i_202_ = 0;
		anInt2611 = 0;
		i_201_ = 0;
		i_203_ = 0;
		anInt2572 = 0;
		anInt2599 = 0;
		for (int i_211_ = 0; (i ^ 0xffffffff) < (i_211_ ^ 0xffffffff); i_211_++) {
			short s = (short) (1 << i_211_);
			Model model_212_ = models[i_211_];
			if (model_212_ != null) {
				if (model_212_.aClass17Array2621 != null) {
					for (int i_213_ = 0; model_212_.aClass17Array2621.length > i_213_; i_213_++) {
						Class17 class17 = model_212_.aClass17Array2621[i_213_];
						aClass17Array2621[i_203_++] = class17.method262(-2, class17.anInt273 - -anInt2572);
					}
				}
				for (int i_214_ = 0; i_214_ < model_212_.anInt2572; i_214_++) {
					if (bool && model_212_.aByteArray2594 != null) {
						aByteArray2594[anInt2572] = model_212_.aByteArray2594[i_214_];
					}
					if (bool_204_) {
						if (model_212_.aByteArray2607 != null) {
							aByteArray2607[anInt2572] = model_212_.aByteArray2607[i_214_];
						} else {
							aByteArray2607[anInt2572] = model_212_.aByte2619;
						}
					}
					if (bool_205_ && model_212_.aByteArray2622 != null) {
						aByteArray2622[anInt2572] = model_212_.aByteArray2622[i_214_];
					}
					if (bool_207_) {
						if (model_212_.aShortArray2587 == null) {
							aShortArray2587[anInt2572] = (short) -1;
						} else {
							aShortArray2587[anInt2572] = model_212_.aShortArray2587[i_214_];
						}
					}
					if (bool_208_) {
						if (model_212_.anIntArray2602 == null) {
							anIntArray2602[anInt2572] = -1;
						} else {
							anIntArray2602[anInt2572] = model_212_.anIntArray2602[i_214_];
						}
					}
					aShortArray2600[anInt2572] = (short) method2093(model_212_, 0, model_212_.aShortArray2600[i_214_], s);
					aShortArray2583[anInt2572] = (short) method2093(model_212_, 0, model_212_.aShortArray2583[i_214_], s);
					aShortArray2589[anInt2572] = (short) method2093(model_212_, 0, model_212_.aShortArray2589[i_214_], s);
					aShortArray2575[anInt2572] = s;
					aShortArray2580[anInt2572] = model_212_.aShortArray2580[i_214_];
					anInt2572++;
				}
				if (model_212_.aClass300Array2590 != null) {
					for (int i_215_ = 0; model_212_.aClass300Array2590.length > i_215_; i_215_++) {
						int i_216_ = method2093(model_212_, 0, model_212_.aClass300Array2590[i_215_].anInt3764, s);
						int i_217_ = method2093(model_212_, 0, model_212_.aClass300Array2590[i_215_].anInt3757, s);
						int i_218_ = method2093(model_212_, 0, model_212_.aClass300Array2590[i_215_].anInt3754, s);
						aClass300Array2590[i_201_] = model_212_.aClass300Array2590[i_215_].method3502(false, i_216_, i_217_, i_218_);
						i_201_++;
					}
				}
				if (model_212_.aClass218Array2620 != null) {
					for (int i_219_ = 0; (i_219_ ^ 0xffffffff) > (model_212_.aClass218Array2620.length ^ 0xffffffff); i_219_++) {
						int i_220_ = method2093(model_212_, 0, model_212_.aClass218Array2620[i_219_].anInt2554, s);
						aClass218Array2620[i_202_] = model_212_.aClass218Array2620[i_219_].method2078(false, i_220_);
						i_202_++;
					}
				}
			}
		}
		anInt2573 = anInt2599;
		int i_221_ = 0;
		for (int i_222_ = 0; i_222_ < i; i_222_++) {
			short s = (short) (1 << i_222_);
			Model model_223_ = models[i_222_];
			if (model_223_ != null) {
				for (int i_224_ = 0; i_224_ < model_223_.anInt2572; i_224_++) {
					if (bool_206_) {
						aByteArray2610[i_221_++] = (byte) (model_223_.aByteArray2610 == null || (model_223_.aByteArray2610[i_224_] ^ 0xffffffff) == 0 ? -1 : model_223_.aByteArray2610[i_224_] + anInt2611);
					}
				}
				for (int i_225_ = 0; (model_223_.anInt2611 ^ 0xffffffff) < (i_225_ ^ 0xffffffff); i_225_++) {
					byte b = aByteArray2586[anInt2611] = model_223_.aByteArray2586[i_225_];
					if (b == 0) {
						aShortArray2613[anInt2611] = (short) method2093(model_223_, 0, model_223_.aShortArray2613[i_225_], s);
						aShortArray2577[anInt2611] = (short) method2093(model_223_, 0, model_223_.aShortArray2577[i_225_], s);
						aShortArray2604[anInt2611] = (short) method2093(model_223_, 0, model_223_.aShortArray2604[i_225_], s);
					}
					if ((b ^ 0xffffffff) <= -2 && b <= 3) {
						aShortArray2613[anInt2611] = model_223_.aShortArray2613[i_225_];
						aShortArray2577[anInt2611] = model_223_.aShortArray2577[i_225_];
						aShortArray2604[anInt2611] = model_223_.aShortArray2604[i_225_];
						anIntArray2603[anInt2611] = model_223_.anIntArray2603[i_225_];
						anIntArray2588[anInt2611] = model_223_.anIntArray2588[i_225_];
						anIntArray2593[anInt2611] = model_223_.anIntArray2593[i_225_];
						aByteArray2609[anInt2611] = model_223_.aByteArray2609[i_225_];
						aByteArray2585[anInt2611] = model_223_.aByteArray2585[i_225_];
						anIntArray2617[anInt2611] = model_223_.anIntArray2617[i_225_];
					}
					if (b == 2) {
						anIntArray2615[anInt2611] = model_223_.anIntArray2615[i_225_];
						anIntArray2584[anInt2611] = model_223_.anIntArray2584[i_225_];
					}
					anInt2611++;
				}
			}
		}
	}
}
