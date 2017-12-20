/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class379
{
	static int anInt4866;
	static int anInt4867;
	static int anInt4868;
	static OutcommingPacket aClass318_4869 = new OutcommingPacket(25, 8);
	static int anInt4870;
	static int anInt4871;
	static Class61 aClass61_4872 = new Class61(64);
	static Class329 aClass329_4873 = new Class329("WTQA", "office", "_qa", 2);
	
	static final void method4159(int i, boolean bool) {
		anInt4871++;
		Npc.aClass336_11113.method3857(Class44.aGraphicsToolkit668.n());
		int[] is = Class44.aGraphicsToolkit668.Y();
		Class178.anInt2119 = is[0];
		Class343.anInt4252 = is[1];
		Class99.anInt1280 = is[2];
		Class320_Sub30.anInt8495 = is[i];
		if (!bool) {
			Class44.aGraphicsToolkit668.DA(Class186.anInt2250, Class320_Sub16.anInt8361, Node_Sub38_Sub20.anInt10298, Class349.anInt4305);
			Node_Sub38_Sub11.method2826(true, Class320_Sub10.aDouble8299);
		} else {
			Class44.aGraphicsToolkit668.DA(Class118.anInt5404, Class320_Sub23.anInt8433, Class30.anInt491, Class320_Sub10.anInt8303);
			Node_Sub38_Sub11.method2826(true, Class157.aDouble1981);
		}
	}
	
	final int method4160(int i, int i_0_, int i_1_) {
		anInt4870++;
		int i_2_ = (Class360.screenWidth ^ 0xffffffff) < (i_0_ ^ 0xffffffff) ? Class360.screenWidth : i_0_;
		if (Class294.aClass379_3689 == this) {
			return 0;
		}
		if (Class339_Sub2.aClass379_8641 == this) {
			return i_2_ - i_1_;
		}
		if (this == Class377.aClass379_4675) {
			return (-i_1_ + i_2_) / 2;
		}
		if (i > -105) {
			method4159(-37, false);
		}
		return 0;
	}
	
	public final String toString() {
		anInt4868++;
		throw new IllegalStateException();
	}
	
	static final String method4161(byte b, String string) {
		anInt4866++;
		StringBuffer stringbuffer = new StringBuffer();
		int i = string.length();
		int i_3_ = 0;
		if (b != 53) {
			aClass329_4873 = null;
		}
		for (/**/; i > i_3_; i_3_++) {
			char c = string.charAt(i_3_);
			if (c != '%' || i <= i_3_ - -2) {
				if (c != '+') {
					stringbuffer.append(c);
				} else {
					stringbuffer.append(' ');
				}
			} else {
				int i_4_ = string.charAt(1 + i_3_);
				boolean bool = false;
				int i_5_;
				if ((i_4_ ^ 0xffffffff) <= -49 && (i_4_ ^ 0xffffffff) >= -58) {
					i_5_ = i_4_ - 48;
				} else if (i_4_ < 97 || (i_4_ ^ 0xffffffff) < -103) {
					if ((i_4_ ^ 0xffffffff) > -66 || (i_4_ ^ 0xffffffff) < -71) {
						stringbuffer.append('%');
						continue;
					}
					i_5_ = 10 + (i_4_ - 65);
				} else {
					i_5_ = 10 - -i_4_ - 97;
				}
				i_4_ = string.charAt(i_3_ - -2);
				i_5_ *= 16;
				if ((i_4_ ^ 0xffffffff) > -49 || i_4_ > 57) {
					if (i_4_ < 97 || i_4_ > 102) {
						if ((i_4_ ^ 0xffffffff) <= -66 && i_4_ <= 70) {
							i_5_ += 10 - (-i_4_ - -65);
						} else {
							stringbuffer.append('%');
							continue;
						}
					} else {
						i_5_ += 10 + (i_4_ + -97);
					}
				} else {
					i_5_ += -48 + i_4_;
				}
				i_3_ += 2;
				if ((i_5_ ^ 0xffffffff) != -1 && IOException_Sub1.method131(true, (byte) i_5_)) {
					stringbuffer.append(Class20_Sub1.method294((byte) i_5_, (byte) 119));
				}
			}
		}
		return stringbuffer.toString();
	}
	
	static long method4162(long l, long l_6_) {
		return l | l_6_;
	}
	
	public static void method4163(byte b) {
		aClass329_4873 = null;
		if (b != 66) {
			aClass61_4872 = null;
		}
		aClass318_4869 = null;
		aClass61_4872 = null;
	}
	
	static final int method4164(int i, byte b) {
		if (b < 18) {
			return 28;
		}
		anInt4867++;
		return i >>> 7;
	}
}
