/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class215
{
	static OutcommingPacket aClass318_2529 = new OutcommingPacket(76, 9);
	static int anInt2530;
	static int anInt2531;
	static int anInt2532;
	static int anInt2533;
	static int anInt2534;
	private Index aClass302_2535;
	static int anInt2536;
	static int anInt2537;
	static byte[] GLOBAL_PLAYER_UPDATE_FLAG = null;//new byte[2048];
	static int anInt2539;
	private Class61 aClass61_2540 = new Class61(128);
	protected Index aClass302_2541;
	static int anInt2542;
	protected Class61 aClass61_2543 = new Class61(64);
	static int anInt2544;
	
	static final boolean method2062(int i, int i_0_, int i_1_) {
		anInt2530++;
		if (i != 36) {
			return true;
		}
        return !(!((0x70000 & i_1_ ^ 0xffffffff) != -1 | Node_Sub38_Sub4.method2797(0, i_0_, i_1_)) && !OutcommingPacket.method3669(i_1_, (byte) 123, i_0_));
    }
	
	static final int method2063(byte b) {
		if (b <= 67) {
			return -69;
		}
		anInt2531++;
		return Class336_Sub2.anInt8581;
	}
	
	public static void method2064(byte b) {
		GLOBAL_PLAYER_UPDATE_FLAG = null;
		if (b >= -30) {
			method2064((byte) 31);
		}
		aClass318_2529 = null;
	}
	
	static final void method2065(int i, int i_2_) {
		Class335.aClass61_4161.method598(i_2_, -11819);
		if (i <= 29) {
			GLOBAL_PLAYER_UPDATE_FLAG = null;
		}
		anInt2542++;
	}
	
	final void method2066(int i, int i_3_) {
		anInt2537++;
		if (i_3_ != 0) {
			aClass318_2529 = null;
		}
		synchronized (aClass61_2540) {
			aClass61_2540.method598(i, -11819);
		}
		synchronized (aClass61_2543) {
			aClass61_2543.method598(i, -11819);
		}
	}
	
	static final Class352 method2067(int i, int i_4_) {
		anInt2536++;
		Class352 class352 = (Class352) Class84.aClass61_1144.method607((long) i_4_, 0);
		if (class352 != null) {
			return class352;
		}
		byte[] bs = Class173.aClass302_2090.method3524(false, i_4_, i);
		class352 = new Class352();
		if (bs != null) {
			class352.method4007(i_4_, (byte) 97, new BufferedStream(bs));
		}
		Class84.aClass61_1144.method601(class352, 25566, (long) i_4_);
		return class352;
	}
	
	final void method2068(int i, int i_5_, int i_6_) {
		anInt2533++;
		if (i != -1) {
			aClass318_2529 = null;
		}
		aClass61_2540 = new Class61(i_5_);
		aClass61_2543 = new Class61(i_6_);
	}
	
	final Class79 method2069(byte b, int i) {
		anInt2532++;
		Class79 class79;
		synchronized (aClass61_2540) {
			class79 = (Class79) aClass61_2540.method607((long) i, 0);
		}
		if (class79 != null) {
			return class79;
		}
		byte[] bs;
		synchronized (aClass302_2535) {
			bs = aClass302_2535.method3524(false, i, 36);
		}
		class79 = new Class79();
		class79.aClass215_1076 = this;
		class79.anInt1055 = i;
		if (bs != null) {
			class79.method782((byte) -111, new BufferedStream(bs));
		}
		class79.method789(false);
		synchronized (aClass61_2540) {
			aClass61_2540.method601(class79, 25566, (long) i);
		}
		if (b <= 99) {
			aClass302_2535 = null;
		}
		return class79;
	}
	
	final void method2070(int i) {
		anInt2539++;
		synchronized (aClass61_2540) {
			aClass61_2540.method602((byte) -118);
			if (i != 2048) {
				aClass302_2535 = null;
			}
		}
		synchronized (aClass61_2543) {
			aClass61_2543.method602((byte) -118);
		}
	}
	
	final void method2071(int i) {
		anInt2534++;
		synchronized (aClass61_2540) {
			aClass61_2540.method608(false);
		}
		synchronized (aClass61_2543) {
			aClass61_2543.method608(false);
		}
		if (i != 7) {
			method2070(69);
		}
	}
	
	static final int method2072(int i, boolean bool) {
		anInt2544++;
		int i_7_ = i >>> 1;
		i_7_ |= i_7_ >>> 1;
		i_7_ |= i_7_ >>> 2;
		i_7_ |= i_7_ >>> 4;
		if (bool != true) {
			method2067(-44, -108);
		}
		i_7_ |= i_7_ >>> 8;
		i_7_ |= i_7_ >>> 16;
		return (i_7_ ^ 0xffffffff) & i;
	}
	
	Class215(Class353 class353, int i, Index class302, Index class302_8_) {
		aClass302_2541 = class302_8_;
		aClass302_2535 = class302;
		aClass302_2535.method3537(-2, 36);
	}
}
