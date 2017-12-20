/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class163
{
	static int anInt2006;
	static int anInt2007;
	static int anInt2008;
	static int anInt2009;
	private int[] anIntArray2010;
	static int anInt2011;
	static IncommingPacket aClass192_2012;
	static float aFloat2013;
	static int anInt2014 = 0;
	static boolean aBoolean2015 = false;
	private byte[] aByteArray2016;
	private int[] anIntArray2017;
	static OutcommingPacket aClass318_2018;
	static int anInt2019;
	static long aLong2020;
	static boolean aBoolean2021;
	
	public static void method1733(boolean bool) {
		if (bool != true) {
			anInt2019 = -21;
		}
		aClass192_2012 = null;
		aClass318_2018 = null;
	}
	
	static final Class144_Sub4 method1734(BufferedStream buffer, byte b) {
		anInt2007++;
		return new Class144_Sub4(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.read24BitInteger(), buffer.readUnsignedByte());
	}
	
	final int method1735(byte[] bs, int i, byte[] bs_0_, int i_1_, int i_2_, int i_3_) {
		anInt2009++;
		if (i == (i_1_ ^ 0xffffffff)) {
			return 0;
		}
		i_1_ += i_3_;
		int i_4_ = 0;
		int i_5_ = i_2_;
		for (;;) {
			byte b = bs_0_[i_5_];
			if (b >= 0) {
				i_4_++;
			} else {
				i_4_ = anIntArray2010[i_4_];
			}
			int i_6_;
			if (((i_6_ = anIntArray2010[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_3_ >= i_1_) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x40 & b ^ 0xffffffff) == -1) {
				i_4_++;
			} else {
				i_4_ = anIntArray2010[i_4_];
			}
			if ((i_6_ = anIntArray2010[i_4_]) < 0) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if ((i_3_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x20 ^ 0xffffffff) != -1) {
				i_4_ = anIntArray2010[i_4_];
			} else {
				i_4_++;
			}
			if (((i_6_ = anIntArray2010[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_1_ <= i_3_) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x10 & b ^ 0xffffffff) != -1) {
				i_4_ = anIntArray2010[i_4_];
			} else {
				i_4_++;
			}
			if ((i_6_ = anIntArray2010[i_4_]) < 0) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_1_ <= i_3_) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x8 & b) == 0) {
				i_4_++;
			} else {
				i_4_ = anIntArray2010[i_4_];
			}
			if ((i_6_ = anIntArray2010[i_4_]) < 0) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_3_ >= i_1_) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x4 ^ 0xffffffff) != -1) {
				i_4_ = anIntArray2010[i_4_];
			} else {
				i_4_++;
			}
			if (((i_6_ = anIntArray2010[i_4_]) ^ 0xffffffff) > -1) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_3_ >= i_1_) {
					break;
				}
				i_4_ = 0;
			}
			if ((0x2 & b ^ 0xffffffff) == -1) {
				i_4_++;
			} else {
				i_4_ = anIntArray2010[i_4_];
			}
			if ((i_6_ = anIntArray2010[i_4_]) < 0) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_3_ >= i_1_) {
					break;
				}
				i_4_ = 0;
			}
			if ((b & 0x1) == 0) {
				i_4_++;
			} else {
				i_4_ = anIntArray2010[i_4_];
			}
			if ((i_6_ = anIntArray2010[i_4_]) < 0) {
				bs[i_3_++] = (byte) (i_6_ ^ 0xffffffff);
				if (i_1_ <= i_3_) {
					break;
				}
				i_4_ = 0;
			}
			i_5_++;
		}
		return i_5_ - (-1 - -i_2_);
	}
	
	static final void method1736(int i, Color color, Color color_7_, Color color_8_, String string, byte b) {
		anInt2011++;
		try {
			Graphics graphics = Node_Sub38_Sub20.aCanvas10309.getGraphics();
			if (Node_Sub46.aFont7555 == null) {
				Node_Sub46.aFont7555 = new Font("Helvetica", 1, 13);
			}
			if (color_8_ == null) {
				color_8_ = new Color(140, 17, 17);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			if (color_7_ == null) {
				color_7_ = new Color(255, 255, 255);
			}
			try {
				if (Class54.anImage813 == null) {
					Class54.anImage813 = Node_Sub38_Sub20.aCanvas10309.createImage(Class360.screenWidth, Class205.screenHeight);
				}
				Graphics graphics_9_ = Class54.anImage813.getGraphics();
				graphics_9_.setColor(Color.black);
				graphics_9_.fillRect(0, 0, Class360.screenWidth, Class205.screenHeight);
				int i_10_ = Class360.screenWidth / 2 + -152;
				int i_11_ = -18 + Class205.screenHeight / 2;
				graphics_9_.setColor(color);
				graphics_9_.drawRect(i_10_, i_11_, 303, 33);
				graphics_9_.setColor(color_8_);
				graphics_9_.fillRect(i_10_ - -2, 2 + i_11_, i * 3, 30);
				graphics_9_.setColor(Color.black);
				graphics_9_.drawRect(i_10_ + 1, i_11_ - -1, 301, 31);
				graphics_9_.fillRect(2 + i_10_ - -(i * 3), 2 + i_11_, 300 + -(i * 3), 30);
				graphics_9_.setFont(Node_Sub46.aFont7555);
				graphics_9_.setColor(color_7_);
				graphics_9_.drawString(string, (-(6 * string.length()) + 304) / 2 + i_10_, i_11_ + 22);
				if (EntityNode_Sub6.aString5991 != null) {
					graphics_9_.setFont(Node_Sub46.aFont7555);
					graphics_9_.setColor(color_7_);
					graphics_9_.drawString(EntityNode_Sub6.aString5991, Class360.screenWidth / 2 + -(EntityNode_Sub6.aString5991.length() * 6 / 2), -26 + Class205.screenHeight / 2);
				}
				graphics.drawImage(Class54.anImage813, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class360.screenWidth, Class205.screenHeight);
				int i_13_ = -152 + Class360.screenWidth / 2;
				int i_14_ = -18 + Class205.screenHeight / 2;
				graphics.setColor(color);
				graphics.drawRect(i_13_, i_14_, 303, 33);
				graphics.setColor(color_8_);
				graphics.fillRect(i_13_ + 2, i_14_ + 2, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_13_, 1 + i_14_, 301, 31);
				graphics.fillRect(i_13_ + 2 - -(3 * i), i_14_ + 2, 300 + -(i * 3), 30);
				graphics.setFont(Node_Sub46.aFont7555);
				graphics.setColor(color_7_);
				if (EntityNode_Sub6.aString5991 != null) {
					graphics.setFont(Node_Sub46.aFont7555);
					graphics.setColor(color_7_);
					graphics.drawString(EntityNode_Sub6.aString5991, Class360.screenWidth / 2 - 6 * EntityNode_Sub6.aString5991.length() / 2, -26 + Class205.screenHeight / 2);
				}
				graphics.drawString(string, i_13_ + (304 + -(6 * string.length())) / 2, 22 + i_14_);
			}
		} catch (Exception exception) {
			Node_Sub38_Sub20.aCanvas10309.repaint();
		}
	}
	
	final int method1737(int i, int i_15_, int i_16_, int i_17_, byte[] bs, byte[] bs_18_) {
		if (i_17_ < 23) {
			method1737(-122, 7, 85, -38, null, null);
		}
		anInt2006++;
		int i_19_ = 0;
		i_16_ += i_15_;
		int i_20_ = i << 3;
		for (/**/; i_16_ > i_15_; i_15_++) {
			int i_21_ = 0xff & bs_18_[i_15_];
			int i_22_ = anIntArray2017[i_21_];
			int i_23_ = aByteArray2016[i_21_];
			if (i_23_ == 0) {
				throw new RuntimeException("No codeword for data value " + i_21_);
			}
			int i_24_ = i_20_ >> 3;
			int i_25_ = 0x7 & i_20_;
			i_19_ &= -i_25_ >> 31;
			int i_26_ = i_24_ + (i_25_ + (i_23_ + -1) >> 3);
			i_20_ += i_23_;
			i_25_ += 24;
			bs[i_24_] = (byte) (i_19_ = Node_Sub16.method2590(i_19_, i_22_ >>> i_25_));
			if (i_24_ < i_26_) {
				i_25_ -= 8;
				i_24_++;
				bs[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
				if (i_24_ < i_26_) {
					i_24_++;
					i_25_ -= 8;
					bs[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
					if (i_26_ > i_24_) {
						i_25_ -= 8;
						i_24_++;
						bs[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
						if (i_26_ > i_24_) {
							i_24_++;
							i_25_ -= 8;
							bs[i_24_] = (byte) (i_19_ = i_22_ << -i_25_);
						}
					}
				}
			}
		}
		return (i_20_ - -7 >> 3) - i;
	}
	
	Class163(byte[] bs) {
		int i = bs.length;
		anIntArray2017 = new int[i];
		aByteArray2016 = bs;
		anIntArray2010 = new int[8];
		int[] is = new int[33];
		int i_27_ = 0;
		for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i ^ 0xffffffff); i_28_++) {
			int i_29_ = bs[i_28_];
			if ((i_29_ ^ 0xffffffff) != -1) {
				int i_30_ = 1 << 32 + -i_29_;
				int i_31_ = is[i_29_];
				anIntArray2017[i_28_] = i_31_;
				int i_32_;
				if ((i_30_ & i_31_ ^ 0xffffffff) == -1) {
					i_32_ = i_30_ | i_31_;
					for (int i_33_ = -1 + i_29_; (i_33_ ^ 0xffffffff) <= -2; i_33_--) {
						int i_34_ = is[i_33_];
						if ((i_31_ ^ 0xffffffff) != (i_34_ ^ 0xffffffff)) {
							break;
						}
						int i_35_ = 1 << -i_33_ + 32;
						if ((i_34_ & i_35_ ^ 0xffffffff) != -1) {
							is[i_33_] = is[-1 + i_33_];
							break;
						}
						is[i_33_] = Node_Sub16.method2590(i_34_, i_35_);
					}
				} else {
					i_32_ = is[i_29_ + -1];
				}
				is[i_29_] = i_32_;
				for (int i_36_ = 1 + i_29_; i_36_ <= 32; i_36_++) {
					if ((is[i_36_] ^ 0xffffffff) == (i_31_ ^ 0xffffffff)) {
						is[i_36_] = i_32_;
					}
				}
				int i_37_ = 0;
				for (int i_38_ = 0; (i_29_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
					int i_39_ = -2147483648 >>> i_38_;
					if ((i_39_ & i_31_) != 0) {
						if (anIntArray2010[i_37_] == 0) {
							anIntArray2010[i_37_] = i_27_;
						}
						i_37_ = anIntArray2010[i_37_];
					} else {
						i_37_++;
					}
					i_39_ >>>= 1;
					if ((anIntArray2010.length ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)) {
						int[] is_40_ = new int[anIntArray2010.length * 2];
						for (int i_41_ = 0; i_41_ < anIntArray2010.length; i_41_++)
							is_40_[i_41_] = anIntArray2010[i_41_];
						anIntArray2010 = is_40_;
					}
				}
				anIntArray2010[i_37_] = i_28_ ^ 0xffffffff;
				if (i_27_ <= i_37_) {
					i_27_ = 1 + i_37_;
				}
			}
		}
	}
	
	static final void method1738(int i) {
		anInt2008++;
		if (i != -1096) {
			method1738(13);
		}
		for (int i_42_ = 0; CacheNode_Sub11.aByteArrayArrayArray9550.length > i_42_; i_42_++) {
			for (int i_43_ = 0; CacheNode_Sub11.aByteArrayArrayArray9550[0].length > i_43_; i_43_++) {
				for (int i_44_ = 0; (CacheNode_Sub11.aByteArrayArrayArray9550[0][0].length ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++)
					CacheNode_Sub11.aByteArrayArrayArray9550[i_42_][i_43_][i_44_] = (byte) 0;
			}
		}
	}
	
	static {
		aClass192_2012 = new IncommingPacket(134, 1);
		aClass318_2018 = new OutcommingPacket(67, 3);
		aBoolean2021 = false;
	}
}
