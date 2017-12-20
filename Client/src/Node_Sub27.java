/* Node_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;

public class Node_Sub27 extends Node
{
	private Class353 aClass353_7263;
	protected Class320_Sub11 aClass320_Sub11_7264;
	protected Class320_Sub25 aClass320_Sub25_7265;
	protected Class320_Sub27 aClass320_Sub27_7266;
	protected Class320_Sub6 aClass320_Sub6_7267;
	protected Class320_Sub14 aClass320_Sub14_7268;
	protected Class320_Sub26 aClass320_Sub26_7269;
	protected Class320_Sub29 aClass320_Sub29_7270;
	static int anInt7271;
	protected Class320_Sub2 aClass320_Sub2_7272;
	protected Class320_Sub15 aClass320_Sub15_7273;
	protected Class320_Sub25 aClass320_Sub25_7274;
	protected Class320_Sub30 aClass320_Sub30_7275;
	protected Class320_Sub25 aClass320_Sub25_7276;
	protected Class320_Sub19 aClass320_Sub19_7277;
	static int anInt7278;
	static int anInt7279;
	protected Class320_Sub8 aClass320_Sub8_7280;
	static int anInt7281;
	protected Class320_Sub12 aClass320_Sub12_7282;
	protected Class320_Sub13 aClass320_Sub13_7283;
	protected Class320_Sub13 aClass320_Sub13_7284;
	static int anInt7285;
	static int anInt7286;
	protected Class320_Sub1 aClass320_Sub1_7287;
	static int anInt7288;
	static int anInt7289;
	protected Class320_Sub23 aClass320_Sub23_7290;
	protected Class320_Sub29 aClass320_Sub29_7291;
	private Class187 aClass187_7292;
	protected Class320_Sub21 aClass320_Sub21_7293;
	static int anInt7294;
	protected Class320_Sub25 aClass320_Sub25_7295;
	static int[] anIntArray7296 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	protected Class320_Sub5 aClass320_Sub5_7297;
	protected Class320_Sub3 aClass320_Sub3_7298;
	protected Class320_Sub22 aClass320_Sub22_7299;
	protected Class320_Sub10 aClass320_Sub10_7300;
	protected Class320_Sub19 aClass320_Sub19_7301;
	protected Class320_Sub4 aClass320_Sub4_7302;
	protected Class320_Sub18 aClass320_Sub18_7303;
	protected Class320_Sub4 aClass320_Sub4_7304;
	protected Class320_Sub28 aClass320_Sub28_7305;
	protected Class320_Sub20 aClass320_Sub20_7306;
	static int anInt7307;
	protected Class320_Sub7 aClass320_Sub7_7308;
	protected Class320_Sub25 aClass320_Sub25_7309;
	static float aFloat7310;
	protected Class320_Sub17 aClass320_Sub17_7311;
	static int anInt7312;
	protected Class320_Sub1 aClass320_Sub1_7313;
	static int anInt7314;
	protected Class320_Sub9 aClass320_Sub9_7315;
	protected Class320_Sub16 aClass320_Sub16_7316;
	protected Class320_Sub24 aClass320_Sub24_7317;
	/*synthetic*/ static Class<?> aClass7318;
	
	private final void method2688(BufferedStream buffer, boolean bool) {
		anInt7307++;
		if (buffer == null || buffer.buffer == null) {
			method2689(true, (byte) -2);
		} else {
			int i = buffer.readUnsignedByte();
			if (i < 23) {
				try {
					method2698(false, i, buffer);
				} catch (Exception exception) {
					method2689(true, (byte) -123);
				}
				method2689(false, (byte) 35);
			} else if ((i ^ 0xffffffff) >= -26) {
				aClass320_Sub13_7284 = new Class320_Sub13(buffer.readUnsignedByte(), this);
				aClass320_Sub13_7283 = new Class320_Sub13(aClass320_Sub13_7284.method3734(false), this);
				aClass320_Sub20_7306 = new Class320_Sub20(buffer.readUnsignedByte(), this);
				aClass320_Sub22_7299 = new Class320_Sub22(buffer.readUnsignedByte(), this);
				aClass320_Sub5_7297 = new Class320_Sub5(buffer.readUnsignedByte(), this);
				aClass320_Sub8_7280 = new Class320_Sub8(buffer.readUnsignedByte(), this);
				aClass320_Sub16_7316 = new Class320_Sub16(buffer.readUnsignedByte(), this);
				aClass320_Sub23_7290 = new Class320_Sub23(buffer.readUnsignedByte(), this);
				aClass320_Sub6_7267 = new Class320_Sub6(buffer.readUnsignedByte(), this);
				aClass320_Sub27_7266 = new Class320_Sub27(buffer.readUnsignedByte(), this);
				aClass320_Sub24_7317 = new Class320_Sub24(buffer.readUnsignedByte(), this);
				aClass320_Sub12_7282 = new Class320_Sub12(buffer.readUnsignedByte(), this);
				if (i >= 24) {
					aClass320_Sub3_7298 = new Class320_Sub3(buffer.readUnsignedByte(), this);
				}
				aClass320_Sub28_7305 = new Class320_Sub28(buffer.readUnsignedByte(), this);
				aClass320_Sub4_7302 = new Class320_Sub4(buffer.readUnsignedByte(), this);
				aClass320_Sub4_7304 = new Class320_Sub4(aClass320_Sub4_7302.method3694(false), this);
				aClass320_Sub18_7303 = new Class320_Sub18(buffer.readUnsignedByte(), this);
				if ((i ^ 0xffffffff) <= -26) {
					aClass320_Sub2_7272 = new Class320_Sub2(buffer.readUnsignedByte(), this);
				}
				aClass320_Sub7_7308 = new Class320_Sub7(buffer.readUnsignedByte(), this);
				aClass320_Sub9_7315 = new Class320_Sub9(buffer.readUnsignedByte(), this);
				aClass320_Sub30_7275 = new Class320_Sub30(buffer.readUnsignedByte(), this);
				aClass320_Sub29_7291 = new Class320_Sub29(buffer.readUnsignedByte(), this);
				aClass320_Sub29_7270 = new Class320_Sub29(aClass320_Sub29_7291.method3791(false), this);
				aClass320_Sub19_7277 = new Class320_Sub19(buffer.readUnsignedByte(), this);
				aClass320_Sub19_7301 = new Class320_Sub19(aClass320_Sub19_7277.method3751(false), this);
				aClass320_Sub26_7269 = new Class320_Sub26(buffer.readUnsignedByte(), this);
				aClass320_Sub1_7287 = new Class320_Sub1(buffer.readUnsignedByte(), this);
				aClass320_Sub1_7313 = new Class320_Sub1(aClass320_Sub1_7287.method3678(false), this);
				aClass320_Sub14_7268 = new Class320_Sub14(buffer.readUnsignedByte(), this);
				aClass320_Sub15_7273 = new Class320_Sub15(buffer.readUnsignedByte(), this);
				aClass320_Sub21_7293 = new Class320_Sub21(buffer.readUnsignedByte(), this);
				aClass320_Sub11_7264 = new Class320_Sub11(buffer.readUnsignedByte(), this);
				aClass320_Sub10_7300 = new Class320_Sub10(buffer.readUnsignedByte(), this);
				aClass320_Sub25_7295 = new Class320_Sub25(buffer.readUnsignedByte(), this);
				aClass320_Sub25_7265 = new Class320_Sub25(buffer.readUnsignedByte(), this);
				aClass320_Sub25_7276 = new Class320_Sub25(buffer.readUnsignedByte(), this);
				aClass320_Sub25_7274 = new Class320_Sub25(buffer.readUnsignedByte(), this);
				aClass320_Sub25_7309 = new Class320_Sub25(buffer.readUnsignedByte(), this);
				aClass320_Sub17_7311 = new Class320_Sub17(buffer.readUnsignedByte(), this);
				method2689(false, (byte) 41);
			} else {
				method2689(true, (byte) 97);
			}
		}
		if (bool != true) {
			method2699(51, -119);
		}
		method2695(108);
	}
	
	private final void method2689(boolean bool, byte b) {
		anInt7278++;
		if (bool || aClass320_Sub13_7284 == null) {
			aClass320_Sub13_7284 = new Class320_Sub13(this);
		}
		if (bool || aClass320_Sub13_7283 == null) {
			aClass320_Sub13_7283 = new Class320_Sub13(aClass320_Sub13_7284.method3734(false), this);
		}
		if (bool || aClass320_Sub20_7306 == null) {
			aClass320_Sub20_7306 = new Class320_Sub20(this);
		}
		if (bool || aClass320_Sub22_7299 == null) {
			aClass320_Sub22_7299 = new Class320_Sub22(this);
		}
		if (bool || aClass320_Sub5_7297 == null) {
			aClass320_Sub5_7297 = new Class320_Sub5(this);
		}
		if (bool || aClass320_Sub8_7280 == null) {
			aClass320_Sub8_7280 = new Class320_Sub8(this);
		}
		if (bool || aClass320_Sub16_7316 == null) {
			aClass320_Sub16_7316 = new Class320_Sub16(this);
		}
		if (bool || aClass320_Sub23_7290 == null) {
			aClass320_Sub23_7290 = new Class320_Sub23(this);
		}
		if (bool || aClass320_Sub6_7267 == null) {
			aClass320_Sub6_7267 = new Class320_Sub6(this);
		}
		if (bool || aClass320_Sub27_7266 == null) {
			aClass320_Sub27_7266 = new Class320_Sub27(this);
		}
		if (bool || aClass320_Sub24_7317 == null) {
			aClass320_Sub24_7317 = new Class320_Sub24(this);
		}
		if (bool || aClass320_Sub12_7282 == null) {
			aClass320_Sub12_7282 = new Class320_Sub12(this);
		}
		if (bool || aClass320_Sub3_7298 == null) {
			aClass320_Sub3_7298 = new Class320_Sub3(this);
		}
		if (bool || aClass320_Sub28_7305 == null) {
			aClass320_Sub28_7305 = new Class320_Sub28(this);
		}
		if (bool || aClass320_Sub4_7302 == null) {
			aClass320_Sub4_7302 = new Class320_Sub4(this);
		}
		if (bool || aClass320_Sub4_7304 == null) {
			aClass320_Sub4_7304 = new Class320_Sub4(aClass320_Sub4_7302.method3694(false), this);
		}
		if (bool || aClass320_Sub18_7303 == null) {
			aClass320_Sub18_7303 = new Class320_Sub18(this);
		}
		if (bool || aClass320_Sub2_7272 == null) {
			aClass320_Sub2_7272 = new Class320_Sub2(this);
		}
		if (bool || aClass320_Sub7_7308 == null) {
			aClass320_Sub7_7308 = new Class320_Sub7(this);
		}
		if (bool || aClass320_Sub9_7315 == null) {
			aClass320_Sub9_7315 = new Class320_Sub9(this);
		}
		if (bool || aClass320_Sub30_7275 == null) {
			aClass320_Sub30_7275 = new Class320_Sub30(this);
		}
		if (bool || aClass320_Sub29_7291 == null) {
			aClass320_Sub29_7291 = new Class320_Sub29(this);
		}
		if (bool || aClass320_Sub29_7270 == null) {
			aClass320_Sub29_7270 = new Class320_Sub29(aClass320_Sub29_7291.method3791(false), this);
		}
		if (bool || aClass320_Sub19_7277 == null) {
			aClass320_Sub19_7277 = new Class320_Sub19(this);
		}
		if (bool || aClass320_Sub19_7301 == null) {
			aClass320_Sub19_7301 = new Class320_Sub19(aClass320_Sub19_7277.method3751(false), this);
		}
		if (bool || aClass320_Sub26_7269 == null) {
			aClass320_Sub26_7269 = new Class320_Sub26(this);
		}
		if (bool || aClass320_Sub1_7287 == null) {
			aClass320_Sub1_7287 = new Class320_Sub1(this);
		}
		if (bool || aClass320_Sub1_7313 == null) {
			aClass320_Sub1_7313 = new Class320_Sub1(aClass320_Sub1_7287.method3678(false), this);
		}
		if (bool || aClass320_Sub14_7268 == null) {
			aClass320_Sub14_7268 = new Class320_Sub14(this);
		}
		if (bool || aClass320_Sub15_7273 == null) {
			aClass320_Sub15_7273 = new Class320_Sub15(this);
		}
		if (bool || aClass320_Sub21_7293 == null) {
			aClass320_Sub21_7293 = new Class320_Sub21(this);
		}
		if (bool || aClass320_Sub11_7264 == null) {
			aClass320_Sub11_7264 = new Class320_Sub11(this);
		}
		if (bool || aClass320_Sub10_7300 == null) {
			aClass320_Sub10_7300 = new Class320_Sub10(this);
		}
		if (bool || aClass320_Sub25_7295 == null) {
			aClass320_Sub25_7295 = new Class320_Sub25(this);
		}
		if (bool || aClass320_Sub25_7265 == null) {
			aClass320_Sub25_7265 = new Class320_Sub25(this);
		}
		if (bool || aClass320_Sub25_7276 == null) {
			aClass320_Sub25_7276 = new Class320_Sub25(this);
		}
		if (bool || aClass320_Sub25_7274 == null) {
			aClass320_Sub25_7274 = new Class320_Sub25(this);
		}
		if (bool || aClass320_Sub25_7309 == null) {
			aClass320_Sub25_7309 = new Class320_Sub25(this);
		}
		if (bool || aClass320_Sub17_7311 == null) {
			aClass320_Sub17_7311 = new Class320_Sub17(this);
		}
	}
	
	final void method2690(int i, int i_0_, Class320 class320) {
		class320.method3674(i_0_, 3);
		if (i > 15) {
			anInt7271++;
			method2695(112);
		}
	}
	
	final Class353 method2691(int i) {
		if (i != 3) {
			return null;
		}
		anInt7288++;
		return aClass353_7263;
	}
	
	public static void method2692(byte b) {
		if (b != 35) {
			method2693(126);
		}
		anIntArray7296 = null;
	}
	
	static final void method2693(int i) {
		anInt7294++;
		Node_Sub32.method2729(true);
		if (i >= -10) {
			method2693(95);
		}
	}
	
	final Class187 method2694(int i) {
		anInt7289++;
		if (i != -13725) {
			return null;
		}
		return aClass187_7292;
	}
	
	private final void method2695(int i) {
		anInt7285++;
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			Field[] fields_1_ = fields;
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (fields_1_.length ^ 0xffffffff); i_2_++) {
				Field field = fields_1_[i_2_];
				if ((aClass7318 == null ? aClass7318 = method2700("Class320") : aClass7318).isAssignableFrom(field.getType())) {
					Class320 class320 = (Class320) field.get(this);
					class320.method3673((byte) -72);
				}
			}
		} catch (IllegalAccessException illegalaccessexception) {
			/* empty */
		}
	}
	
	final BufferedStream method2696(int i) {
		anInt7279++;
		BufferedStream buffer = new BufferedStream(Class199.method2006((byte) -122));
		buffer.writeByte(25);
		buffer.writeByte(aClass320_Sub13_7284.method3734(false));
		buffer.writeByte(aClass320_Sub20_7306.method3758(false));
		buffer.writeByte(aClass320_Sub22_7299.method3765(false));
		buffer.writeByte(aClass320_Sub5_7297.method3697(false));
		buffer.writeByte(aClass320_Sub8_7280.method3712(false));
		buffer.writeByte(aClass320_Sub16_7316.method3744(false));
		buffer.writeByte(aClass320_Sub23_7290.method3770(false));
		buffer.writeByte(aClass320_Sub6_7267.method3701(false));
		buffer.writeByte(aClass320_Sub27_7266.method3783(false));
		buffer.writeByte(aClass320_Sub24_7317.method3773(false));
		buffer.writeByte(aClass320_Sub12_7282.method3730(false));
		buffer.writeByte(aClass320_Sub3_7298.method3691(false));
		buffer.writeByte(aClass320_Sub28_7305.method3787(false));
		buffer.writeByte(aClass320_Sub4_7302.method3694(false));
		buffer.writeByte(aClass320_Sub18_7303.method3749(false));
		buffer.writeByte(aClass320_Sub2_7272.method3686(false));
		if (i != 11665) {
			method2696(-107);
		}
		buffer.writeByte(aClass320_Sub7_7308.method3708(false));
		buffer.writeByte(aClass320_Sub9_7315.method3715(false));
		buffer.writeByte(aClass320_Sub30_7275.method3796(false));
		buffer.writeByte(aClass320_Sub29_7291.method3791(false));
		buffer.writeByte(aClass320_Sub19_7277.method3751(false));
		buffer.writeByte(aClass320_Sub26_7269.method3779(false));
		buffer.writeByte(aClass320_Sub1_7287.method3678(false));
		buffer.writeByte(aClass320_Sub14_7268.method3737(false));
		buffer.writeByte(aClass320_Sub15_7273.method3738(false));
		buffer.writeByte(aClass320_Sub21_7293.method3762(false));
		buffer.writeByte(aClass320_Sub11_7264.method3722(false));
		buffer.writeByte(aClass320_Sub10_7300.method3718(false));
		buffer.writeByte(aClass320_Sub25_7295.method3776(false));
		buffer.writeByte(aClass320_Sub25_7265.method3776(false));
		buffer.writeByte(aClass320_Sub25_7276.method3776(false));
		buffer.writeByte(aClass320_Sub25_7274.method3776(false));
		buffer.writeByte(aClass320_Sub25_7309.method3776(false));
		buffer.writeByte(aClass320_Sub17_7311.method3747(false));
		return buffer;
	}
	
	final boolean method2697(int i) {
		anInt7314++;
		if (i >= -64) {
			aClass320_Sub19_7277 = null;
		}
        return !(!aClass320_Sub29_7270.method3789(-1) || aClass320_Sub29_7270.method3791(false) != 0 || aClass187_7292.method1877((byte) 71) >= 96);
    }
	
	private final void method2698(boolean bool, int i, BufferedStream buffer) {
		anInt7312++;
		aClass320_Sub22_7299 = new Class320_Sub22(buffer.readUnsignedByte(), this);
		aClass320_Sub19_7277 = new Class320_Sub19(buffer.readUnsignedByte(), this);
		aClass320_Sub4_7302 = new Class320_Sub4(buffer.readUnsignedByte() - -1, this);
		aClass320_Sub6_7267 = new Class320_Sub6(buffer.readUnsignedByte(), this);
		aClass320_Sub9_7315 = new Class320_Sub9(buffer.readUnsignedByte(), this);
		aClass320_Sub27_7266 = new Class320_Sub27(buffer.readUnsignedByte(), this);
		aClass320_Sub8_7280 = new Class320_Sub8(buffer.readUnsignedByte(), this);
		buffer.readUnsignedByte();
		aClass320_Sub7_7308 = new Class320_Sub7(buffer.readUnsignedByte(), this);
		int i_4_ = buffer.readUnsignedByte();
		int i_5_ = 0;
		if (i >= 17) {
			i_5_ = buffer.readUnsignedByte();
		}
		aClass320_Sub12_7282 = new Class320_Sub12(i_5_ >= i_4_ ? i_5_ : i_4_, this);
		boolean bool_6_ = true;
		boolean bool_7_ = true;
		if ((i ^ 0xffffffff) > -3) {
			bool_6_ = buffer.readUnsignedByte() == 1;
			buffer.readUnsignedByte();
		} else {
			bool_6_ = buffer.readUnsignedByte() == 1;
			if (i >= 17) {
				bool_7_ = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
			}
		}
		aClass320_Sub24_7317 = new Class320_Sub24(bool_7_ | bool_6_ ? 1 : 0, this);
		aClass320_Sub26_7269 = new Class320_Sub26(buffer.readUnsignedByte(), this);
		aClass320_Sub16_7316 = new Class320_Sub16(buffer.readUnsignedByte(), this);
		if (bool != false) {
			aClass320_Sub5_7297 = null;
		}
		aClass320_Sub13_7284 = new Class320_Sub13(buffer.readUnsignedByte(), this);
		aClass320_Sub17_7311 = new Class320_Sub17(buffer.readUnsignedByte(), this);
		aClass320_Sub25_7295 = new Class320_Sub25(buffer.readUnsignedByte(), this);
		if ((i ^ 0xffffffff) <= -21) {
			aClass320_Sub25_7276 = new Class320_Sub25(buffer.readUnsignedByte(), this);
		} else {
			aClass320_Sub25_7276 = new Class320_Sub25(aClass320_Sub25_7295.method3776(bool), this);
		}
		aClass320_Sub25_7274 = new Class320_Sub25(buffer.readUnsignedByte(), this);
		aClass320_Sub25_7265 = new Class320_Sub25(buffer.readUnsignedByte(), this);
		if ((i ^ 0xffffffff) <= -22) {
			aClass320_Sub25_7309 = new Class320_Sub25(buffer.readUnsignedByte(), this);
		} else {
			aClass320_Sub25_7309 = new Class320_Sub25(aClass320_Sub25_7274.method3776(bool), this);
		}
		if (i >= 1) {
			buffer.readUnsignedShort();
			buffer.readUnsignedShort();
		}
		if (i >= 3 && (i ^ 0xffffffff) > -7) {
			buffer.readUnsignedByte();
		}
		if (i >= 4) {
			aClass320_Sub28_7305 = new Class320_Sub28(buffer.readUnsignedByte(), this);
		}
		buffer.readInt();
		if (i >= 6) {
			aClass320_Sub1_7287 = new Class320_Sub1(buffer.readUnsignedByte(), this);
		}
		if (i >= 7) {
			aClass320_Sub10_7300 = new Class320_Sub10(buffer.readUnsignedByte(), this);
		}
		if (i >= 8) {
			buffer.readUnsignedByte();
		}
		if ((i ^ 0xffffffff) <= -10) {
			aClass320_Sub5_7297 = new Class320_Sub5(buffer.readUnsignedByte(), this);
		}
		if ((i ^ 0xffffffff) <= -11) {
			aClass320_Sub20_7306 = new Class320_Sub20(buffer.readUnsignedByte(), this);
		}
		if (i >= 11) {
			aClass320_Sub14_7268 = new Class320_Sub14(buffer.readUnsignedByte(), this);
		}
		if (i >= 12) {
			aClass320_Sub27_7266 = new Class320_Sub27(buffer.readUnsignedByte(), this);
		}
		if (i >= 13) {
			aClass320_Sub23_7290 = new Class320_Sub23(buffer.readUnsignedByte(), this);
		}
		if (i >= 14) {
			aClass320_Sub29_7291 = new Class320_Sub29(buffer.readUnsignedByte(), this);
		}
		if ((i ^ 0xffffffff) <= -16) {
			aClass320_Sub21_7293 = new Class320_Sub21(buffer.readUnsignedByte(), this);
		}
		if (i >= 16) {
			aClass320_Sub30_7275 = new Class320_Sub30(buffer.readUnsignedByte(), this);
		}
		if (i >= 18) {
			aClass320_Sub15_7273 = new Class320_Sub15(buffer.readUnsignedByte(), this);
		}
		if (i >= 19) {
			aClass320_Sub18_7303 = new Class320_Sub18(buffer.readUnsignedByte(), this);
		}
		if ((i ^ 0xffffffff) <= -23) {
			aClass320_Sub11_7264 = new Class320_Sub11(buffer.readUnsignedByte(), this);
		}
	}
	
	static final boolean method2699(int i, int i_8_) {
		if (i != 18) {
			aFloat7310 = -1.5500692F;
		}
		anInt7281++;
        return !(i_8_ != 21 && i_8_ != 60 && i_8_ != 23 && (i_8_ ^ 0xffffffff) != -18 && (i_8_ ^ 0xffffffff) != -45 && (i_8_ ^ 0xffffffff) != -5 && i_8_ != 18);
    }
	
	Node_Sub27(Class353 class353, int i) {
		aClass353_7263 = class353;
		aClass187_7292 = new Class187(Class240.aSignLink2946.aBoolean4005, Class201.anInt2446, Class263.anInt3336, (SignLink.aString3984.toLowerCase().indexOf("arm") ^ 0xffffffff) != 0);
		aClass320_Sub29_7270 = new Class320_Sub29(i, this);
		method2689(true, (byte) -103);
	}
	
	Node_Sub27(BufferedStream buffer, Class353 class353, int i) {
		aClass353_7263 = class353;
		aClass187_7292 = new Class187(Class240.aSignLink2946.aBoolean4005, Class201.anInt2446, Class263.anInt3336, (SignLink.aString3984.indexOf("arm") ^ 0xffffffff) != 0);
		aClass320_Sub29_7270 = new Class320_Sub29(i, this);
		method2688(buffer, true);
	}
	
	/*synthetic*/ static Class<?> method2700(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
