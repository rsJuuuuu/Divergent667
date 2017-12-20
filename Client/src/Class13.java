/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13
{
	static int anInt200;
	static int anInt201;
	private Index aClass302_202;
	static IncommingPacket aClass192_203 = new IncommingPacket(106, 8);
	static int anInt204;
	static int anInt205;
	static int anInt206;
	private Class61 aClass61_207 = new Class61(64);
	static int anInt208;
	static String[][] aStringArrayArray209 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };
	static int anInt210;
	static int anInt211;
	
	static final boolean method206(char c, int i) {
		if (i <= 3) {
			method208(21, 86, -113);
		}
		anInt200++;
        return !((c ^ 0xffffffff) != -161 && (c ^ 0xffffffff) != -33 && c != 95 && (c ^ 0xffffffff) != -46);
    }
	
	final Class314 method207(int i, int i_0_) {
		anInt206++;
		Class314 class314;
		synchronized (aClass61_207) {
			class314 = (Class314) aClass61_207.method607((long) i, i_0_);
		}
		if (class314 != null) {
			return class314;
		}
		byte[] bs;
		synchronized (aClass302_202) {
			bs = aClass302_202.method3524(false, i, 54);
		}
		class314 = new Class314();
		if (bs != null) {
			class314.method3654(new BufferedStream(bs), -1050722685);
		}
		synchronized (aClass61_207) {
			aClass61_207.method601(class314, 25566, (long) i);
		}
		return class314;
	}
	
	static final boolean method208(int i, int i_1_, int i_2_) {
		if (i_2_ != 0) {
			return false;
		}
		anInt211++;
        return !(!(Class179.method1816(i_1_, i_2_ + -1, i) | (0x70000 & i_1_) != 0) && !OutcommingPacket.method3669(i_1_, (byte) 120, i));
    }
	
	static final void method209(boolean bool, int i, int i_3_, int i_4_, int i_5_) {
		anInt204++;
		if (CacheNode_Sub15.method2379(7015, i)) {
			Class320_Sub9.method3716(true, i_5_, bool, i_4_, Class134_Sub3.aWidgetArrayArray9035[i], -1);
			if (i_3_ > -28) {
				aClass192_203 = null;
			}
		}
	}
	
	final void method210(int i) {
		anInt210++;
		synchronized (aClass61_207) {
			aClass61_207.method602((byte) -118);
		}
		@SuppressWarnings("unused")
		int i_6_ = -25 % ((-39 - i) / 43);
	}
	
	final void method211(int i, byte b) {
		if (b == 94) {
			anInt208++;
			synchronized (aClass61_207) {
				aClass61_207.method598(i, -11819);
			}
		}
	}
	
	public static void method212(byte b) {
		if (b <= -11) {
			aStringArrayArray209 = null;
			aClass192_203 = null;
		}
	}
	
	final void method213(byte b) {
		anInt201++;
		synchronized (aClass61_207) {
			if (b != -72) {
				/* empty */
			} else {
				aClass61_207.method608(false);
			}
		}
	}
	
	Class13(Class353 class353, int i, Index class302) {
		aClass302_202 = class302;
		if (aClass302_202 != null) {
			aClass302_202.method3537(-2, 54);
		}
	}
}
