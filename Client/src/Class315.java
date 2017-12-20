/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class315
{
	protected int anInt4024;
	static int anInt4025;
	private Index aClass302_4026;
	private Class61 aClass61_4027 = new Class61(64);
	static int anInt4028;
	static int anInt4029;
	static int anInt4030;
	static Class61 aClass61_4031 = new Class61(128, 4);
	static int anInt4032;
	static int anInt4033;
	static int anInt4034;
	static int anInt4035 = 0;
	
	static final boolean method3655(int i, int i_0_) {
		if (i_0_ != 128) {
			method3655(113, -94);
		}
		anInt4032++;
        return !(i != 4 && i != 8 && i != 12 && (i ^ 0xffffffff) != -11);
    }
	
	final void method3656(boolean bool) {
		synchronized (aClass61_4027) {
			aClass61_4027.method608(!bool);
		}
		if (bool != true) {
			anInt4035 = -22;
		}
		anInt4030++;
	}
	
	final void method3657(int i, byte b) {
		anInt4029++;
		synchronized (aClass61_4027) {
			aClass61_4027.method598(i, -11819);
			@SuppressWarnings("unused")
			int i_1_ = -26 / ((-59 - b) / 44);
		}
	}
	
	final Class95 method3658(int i, int i_2_) {
		anInt4025++;
		Class95 class95;
		synchronized (aClass61_4027) {
			class95 = (Class95) aClass61_4027.method607((long) i, 0);
		}
		if (class95 != null) {
			return class95;
		}
		byte[] bs;
		synchronized (aClass302_4026) {
			bs = aClass302_4026.method3524(false, i, 47);
		}
		class95 = new Class95();
		if (bs != null) {
			class95.method1069((byte) 119, new BufferedStream(bs));
		}
		synchronized (aClass61_4027) {
			aClass61_4027.method601(class95, 25566, (long) i);
		}
		if (i_2_ < 81) {
			anInt4033 = -74;
		}
		return class95;
	}
	
	public static void method3659(int i) {
		aClass61_4031 = null;
		if (i < 16) {
			method3655(94, 44);
		}
	}
	
	final void method3660(int i) {
		synchronized (aClass61_4027) {
			if (i != 6105) {
				method3656(true);
			}
			aClass61_4027.method602((byte) -128);
		}
		anInt4028++;
	}
	
	Class315(Class353 class353, int i, Index class302) {
		aClass302_4026 = class302;
		if (aClass302_4026 != null) {
			anInt4024 = aClass302_4026.method3537(-2, 47);
		} else {
			anInt4024 = 0;
		}
	}
	
	static {
		anInt4034 = 0;
	}
}
