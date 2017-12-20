/* r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class r_Sub1 extends r
{
	static int anInt11041;
	protected int anInt11042;
	static int anInt11043;
	protected byte[] aByteArray11044;
	static int anInt11045;
	static int anInt11046;
	static Index aClass302_11047;
	static int anInt11048;
	protected int anInt11049;
	protected int anInt11050;
	static int anInt11051;
	protected int anInt11052;
	
	final boolean method2363(int i, boolean bool, int i_0_) {
		if (bool != false) {
			method2367((byte) 76);
		}
		anInt11041++;
        return i_0_ * i <= aByteArray11044.length;
    }
	
	static final void method2364(int i, int i_1_, int i_2_, String string, int i_3_) {
		anInt11043++;
		IComponentDefinitions widget = Node_Sub3.method2169(-101, i_2_, i_1_);
		if (widget != null) {
			if (widget.anObjectArray4770 != null) {
				Node_Sub37 node_sub37 = new Node_Sub37();
				node_sub37.parameters = widget.anObjectArray4770;
				node_sub37.anInt7441 = i_3_;
				node_sub37.aString7440 = string;
				node_sub37.aWidget7437 = widget;
				ClientScriptsExecutor.method3556(node_sub37);
			}
			if ((Class151.anInt1843 ^ 0xffffffff) == -12 && Client.method113(widget).method2748((byte) -98, -1 + i_3_)) {
				if (i_3_ == 1) {
					Class188_Sub2_Sub1.anInt9350++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub42.aClass318_7526, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -15, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if ((i_3_ ^ 0xffffffff) == -3) {
					Class66_Sub3.anInt9001++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class170.aClass318_2051, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -127, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if (i_3_ == 3) {
					Class279.anInt3550++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class262_Sub9.aClass318_7765, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, 9, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(126, node_sub13);
				}
				if ((i_3_ ^ 0xffffffff) == -5) {
					Class385.anInt4912++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class377.aClass318_4663, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -127, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if (i_3_ == 5) {
					Class270_Sub1.anInt8032++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class368.aClass318_4544, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -126, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if ((i_3_ ^ 0xffffffff) == -7) {
					Node_Sub27.anInt7286++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class64.aClass318_5048, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, 97, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if (i_3_ == 7) {
					GraphicsBuffer.anInt7144++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class189.aClass318_2295, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -127, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(126, node_sub13);
				}
				if (i_3_ == 8) {
					Class235_Sub1.anInt8977++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class371.aClass318_4586, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -127, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
				if ((i_3_ ^ 0xffffffff) == -10) {
					Class300.anInt3767++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub30.aClass318_7360, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -128, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(126, node_sub13);
				}
				if (i_3_ == 10) {
					Class161.anInt2002++;
					Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class379.aClass318_4869, Class218.aClass123_2566.anIsaacCipher1571);
					Animable_Sub4_Sub1.method927(i_1_, widget.anInt4718, -128, node_sub13, i_2_);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
				}
			}
		}
	}
	
	final void method2365(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (i_8_ >= 70) {
			anInt11050 = i_7_;
			anInt11049 = -i + i_5_;
			anInt11046++;
			anInt11042 = i_6_ - i_7_;
			anInt11052 = i;
		}
	}
	
	public static void method2366(int i) {
		aClass302_11047 = null;
		if (i != -1612655536) {
			method2364(-73, -44, -114, null, 119);
		}
	}
	
	final void method2367(byte b) {
		if (b == 0) {
			anInt11045++;
			int i = -1;
			int i_9_ = -8 + aByteArray11044.length;
			while ((i ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
				aByteArray11044[++i] = (byte) 0;
			}
			while ((-1 + aByteArray11044.length ^ 0xffffffff) < (i ^ 0xffffffff))
				aByteArray11044[++i] = (byte) 0;
		}
	}
	
	final void method2368(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		anInt11048++;
		int i_16_ = 0;
		if (i_14_ != i_13_) {
			i_16_ = (i_10_ - i_11_ << 16) / (i_13_ + -i_14_);
		}
		int i_17_ = 0;
		if ((i_13_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) {
			i_17_ = (i + -i_10_ << 16) / (i_15_ + -i_13_);
		}
		int i_18_ = 0;
		if (i_12_ <= -83) {
			if ((i_15_ ^ 0xffffffff) != (i_14_ ^ 0xffffffff)) {
				i_18_ = (-i + i_11_ << 16) / (i_14_ + -i_15_);
			}
			if ((i_14_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff) || i_14_ > i_15_) {
				if (i_15_ >= i_13_) {
					if ((i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
						i_11_ = i_10_ <<= 16;
						if (i_13_ < 0) {
							i_10_ -= i_17_ * i_13_;
							i_11_ -= i_13_ * i_16_;
							i_13_ = 0;
						}
						i <<= 16;
						if ((i_15_ ^ 0xffffffff) > -1) {
							i -= i_15_ * i_18_;
							i_15_ = 0;
						}
						if ((i_15_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff) && i_16_ < i_17_ || i_15_ == i_13_ && i_18_ < i_16_) {
							i_14_ -= i_15_;
							i_15_ -= i_13_;
							i_13_ = anInt11042 * i_13_;
							while (--i_15_ >= 0) {
								Class199.method2007(i_11_ >> 16, aByteArray11044, i_13_, 0, i_10_ >> 16, (byte) 125);
								i_11_ += i_16_;
								i_10_ += i_17_;
								i_13_ += anInt11042;
							}
							while ((--i_14_ ^ 0xffffffff) <= -1) {
								Class199.method2007(i_11_ >> 16, aByteArray11044, i_13_, 0, i >> 16, (byte) 108);
								i_11_ += i_16_;
								i += i_18_;
								i_13_ += anInt11042;
							}
						} else {
							i_14_ -= i_15_;
							i_15_ -= i_13_;
							i_13_ = anInt11042 * i_13_;
							while ((--i_15_ ^ 0xffffffff) <= -1) {
								Class199.method2007(i_10_ >> 16, aByteArray11044, i_13_, 0, i_11_ >> 16, (byte) 98);
								i_10_ += i_17_;
								i_13_ += anInt11042;
								i_11_ += i_16_;
							}
							while ((--i_14_ ^ 0xffffffff) <= -1) {
								Class199.method2007(i >> 16, aByteArray11044, i_13_, 0, i_11_ >> 16, (byte) 114);
								i += i_18_;
								i_11_ += i_16_;
								i_13_ += anInt11042;
							}
						}
					} else {
						i = i_10_ <<= 16;
						i_11_ <<= 16;
						if (i_13_ < 0) {
							i_10_ -= i_17_ * i_13_;
							i -= i_13_ * i_16_;
							i_13_ = 0;
						}
						if (i_14_ < 0) {
							i_11_ -= i_14_ * i_18_;
							i_14_ = 0;
						}
						if ((i_16_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)) {
							i_15_ -= i_14_;
							i_14_ -= i_13_;
							i_13_ = anInt11042 * i_13_;
							while (--i_14_ >= 0) {
								Class199.method2007(i >> 16, aByteArray11044, i_13_, 0, i_10_ >> 16, (byte) 96);
								i_13_ += anInt11042;
								i += i_16_;
								i_10_ += i_17_;
							}
							while ((--i_15_ ^ 0xffffffff) <= -1) {
								Class199.method2007(i_11_ >> 16, aByteArray11044, i_13_, 0, i_10_ >> 16, (byte) 125);
								i_10_ += i_17_;
								i_13_ += anInt11042;
								i_11_ += i_18_;
							}
						} else {
							i_15_ -= i_14_;
							i_14_ -= i_13_;
							i_13_ *= anInt11042;
							while (--i_14_ >= 0) {
								Class199.method2007(i_10_ >> 16, aByteArray11044, i_13_, 0, i >> 16, (byte) 102);
								i += i_16_;
								i_10_ += i_17_;
								i_13_ += anInt11042;
							}
							while ((--i_15_ ^ 0xffffffff) <= -1) {
								Class199.method2007(i_10_ >> 16, aByteArray11044, i_13_, 0, i_11_ >> 16, (byte) 106);
								i_10_ += i_17_;
								i_11_ += i_18_;
								i_13_ += anInt11042;
							}
						}
					}
				} else if (i_13_ > i_14_) {
					i_10_ = i <<= 16;
					i_11_ <<= 16;
					if ((i_15_ ^ 0xffffffff) > -1) {
						i -= i_18_ * i_15_;
						i_10_ -= i_17_ * i_15_;
						i_15_ = 0;
					}
					if (i_14_ < 0) {
						i_11_ -= i_14_ * i_16_;
						i_14_ = 0;
					}
					if ((i_18_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
						i_13_ -= i_14_;
						i_14_ -= i_15_;
						i_15_ = anInt11042 * i_15_;
						while ((--i_14_ ^ 0xffffffff) <= -1) {
							Class199.method2007(i_10_ >> 16, aByteArray11044, i_15_, 0, i >> 16, (byte) 108);
							i_10_ += i_17_;
							i += i_18_;
							i_15_ += anInt11042;
						}
						while (--i_13_ >= 0) {
							Class199.method2007(i_10_ >> 16, aByteArray11044, i_15_, 0, i_11_ >> 16, (byte) 113);
							i_15_ += anInt11042;
							i_11_ += i_16_;
							i_10_ += i_17_;
						}
					} else {
						i_13_ -= i_14_;
						i_14_ -= i_15_;
						i_15_ *= anInt11042;
						while (--i_14_ >= 0) {
							Class199.method2007(i >> 16, aByteArray11044, i_15_, 0, i_10_ >> 16, (byte) 124);
							i_15_ += anInt11042;
							i_10_ += i_17_;
							i += i_18_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class199.method2007(i_11_ >> 16, aByteArray11044, i_15_, 0, i_10_ >> 16, (byte) 122);
							i_11_ += i_16_;
							i_10_ += i_17_;
							i_15_ += anInt11042;
						}
					}
				} else {
					i_11_ = i <<= 16;
					i_10_ <<= 16;
					if ((i_15_ ^ 0xffffffff) > -1) {
						i_11_ -= i_17_ * i_15_;
						i -= i_15_ * i_18_;
						i_15_ = 0;
					}
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_10_ -= i_13_ * i_16_;
						i_13_ = 0;
					}
					if ((i_18_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff)) {
						i_14_ -= i_13_;
						i_13_ -= i_15_;
						i_15_ = anInt11042 * i_15_;
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class199.method2007(i >> 16, aByteArray11044, i_15_, 0, i_11_ >> 16, (byte) 97);
							i += i_18_;
							i_11_ += i_17_;
							i_15_ += anInt11042;
						}
						while (--i_14_ >= 0) {
							Class199.method2007(i >> 16, aByteArray11044, i_15_, 0, i_10_ >> 16, (byte) 109);
							i_10_ += i_16_;
							i_15_ += anInt11042;
							i += i_18_;
						}
					} else {
						i_14_ -= i_13_;
						i_13_ -= i_15_;
						i_15_ = anInt11042 * i_15_;
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class199.method2007(i_11_ >> 16, aByteArray11044, i_15_, 0, i >> 16, (byte) 118);
							i_15_ += anInt11042;
							i_11_ += i_17_;
							i += i_18_;
						}
						while (--i_14_ >= 0) {
							Class199.method2007(i_10_ >> 16, aByteArray11044, i_15_, 0, i >> 16, (byte) 104);
							i_15_ += anInt11042;
							i += i_18_;
							i_10_ += i_16_;
						}
					}
				}
			} else if (i_13_ < i_15_) {
				i = i_11_ <<= 16;
				if (i_14_ < 0) {
					i -= i_18_ * i_14_;
					i_11_ -= i_14_ * i_16_;
					i_14_ = 0;
				}
				i_10_ <<= 16;
				if (i_13_ < 0) {
					i_10_ -= i_13_ * i_17_;
					i_13_ = 0;
				}
				if ((i_13_ == i_14_ || i_18_ >= i_16_) && (i_13_ != i_14_ || (i_17_ ^ 0xffffffff) <= (i_18_ ^ 0xffffffff))) {
					i_15_ -= i_13_;
					i_13_ -= i_14_;
					i_14_ = anInt11042 * i_14_;
					while (--i_13_ >= 0) {
						Class199.method2007(i_11_ >> 16, aByteArray11044, i_14_, 0, i >> 16, (byte) 96);
						i_11_ += i_16_;
						i_14_ += anInt11042;
						i += i_18_;
					}
					while (--i_15_ >= 0) {
						Class199.method2007(i_10_ >> 16, aByteArray11044, i_14_, 0, i >> 16, (byte) 113);
						i_14_ += anInt11042;
						i += i_18_;
						i_10_ += i_17_;
					}
				} else {
					i_15_ -= i_13_;
					i_13_ -= i_14_;
					i_14_ = anInt11042 * i_14_;
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class199.method2007(i >> 16, aByteArray11044, i_14_, 0, i_11_ >> 16, (byte) 124);
						i_14_ += anInt11042;
						i += i_18_;
						i_11_ += i_16_;
					}
					while (--i_15_ >= 0) {
						Class199.method2007(i >> 16, aByteArray11044, i_14_, 0, i_10_ >> 16, (byte) 125);
						i += i_18_;
						i_10_ += i_17_;
						i_14_ += anInt11042;
					}
				}
			} else {
				i_10_ = i_11_ <<= 16;
				if ((i_14_ ^ 0xffffffff) > -1) {
					i_11_ -= i_16_ * i_14_;
					i_10_ -= i_18_ * i_14_;
					i_14_ = 0;
				}
				i <<= 16;
				if ((i_15_ ^ 0xffffffff) > -1) {
					i -= i_15_ * i_17_;
					i_15_ = 0;
				}
				if (((i_14_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff) || i_16_ <= i_18_) && ((i_14_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff) || i_17_ <= i_16_)) {
					i_13_ -= i_15_;
					i_15_ -= i_14_;
					i_14_ = anInt11042 * i_14_;
					while ((--i_15_ ^ 0xffffffff) <= -1) {
						Class199.method2007(i_11_ >> 16, aByteArray11044, i_14_, 0, i_10_ >> 16, (byte) 94);
						i_14_ += anInt11042;
						i_11_ += i_16_;
						i_10_ += i_18_;
					}
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class199.method2007(i_11_ >> 16, aByteArray11044, i_14_, 0, i >> 16, (byte) 115);
						i += i_17_;
						i_11_ += i_16_;
						i_14_ += anInt11042;
					}
				} else {
					i_13_ -= i_15_;
					i_15_ -= i_14_;
					i_14_ *= anInt11042;
					while (--i_15_ >= 0) {
						Class199.method2007(i_10_ >> 16, aByteArray11044, i_14_, 0, i_11_ >> 16, (byte) 94);
						i_10_ += i_18_;
						i_11_ += i_16_;
						i_14_ += anInt11042;
					}
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class199.method2007(i >> 16, aByteArray11044, i_14_, 0, i_11_ >> 16, (byte) 99);
						i += i_17_;
						i_14_ += anInt11042;
						i_11_ += i_16_;
					}
				}
			}
		}
	}
	
	r_Sub1(AbstractToolkit abstracttoolkit, int i, int i_19_) {
		aByteArray11044 = new byte[i * i_19_];
	}
	
	static final String method2369(boolean bool, int i, long l, int i_20_) {
		anInt11051++;
		Calendar calendar;
		if (bool) {
			Class187.method1876(-1, l);
			calendar = Class141.aCalendar1754;
		} else {
			Node_Sub43.method2941(6, l);
			calendar = Class141.aCalendar1756;
		}
		int i_21_ = calendar.get(5);
		int i_22_ = 1 + calendar.get(2);
		int i_24_ = calendar.get(1);
		int i_25_ = calendar.get(11);
		int i_26_ = calendar.get(12);
		return Integer.toString(i_21_ / 10) + i_21_ % 10 + "/" + i_22_ / 10 + i_22_ % 10 + "/" + i_24_ % 100 / 10 + i_24_ % 10 + " " + i_25_ / 10 + i_25_ % 10 + ":" + i_26_ / 10 + i_26_ % 10;
	}
}
