/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class239
{
	static int anInt2917;
	protected Index aClass302_2918;
	private Class61 aClass61_2919 = new Class61(64);
	static int anInt2920;
	static int anInt2921;
	static int anInt2922;
	private Index aClass302_2923;
	static BigInteger RSA_EXPONENT = null; //disables rsa //new BigInteger("10001", 16);
	protected Class61 aClass61_2925 = new Class61(2);
	static int anInt2926;
	static int anInt2927;
	static int anInt2928 = -1;
	static OutcommingPacket aClass318_2929 = new OutcommingPacket(15, 4);
	static boolean aBoolean2930 = false;
	static Index index30;
	static boolean aBoolean2932;
	
	static final void method3022(boolean bool) {
		if (bool != false) {
			index30 = null;
		}
		Class229.aGraphicsToolkit2732.L(Class138.anInt1726, (Class213.aNode_Sub27_2512.aClass320_Sub16_7316.method3744(bool) ^ 0xffffffff) == -2 ? Node_Sub12.anInt5455 + 256 << 2 : -1, 0);
		anInt2920++;
	}
	
	final void method3023(int i, int i_0_) {
		anInt2921++;
		if (i == 33) {
			synchronized (aClass61_2919) {
				aClass61_2919.method598(i_0_, i ^ ~0x2e0b);
			}
			synchronized (aClass61_2925) {
				aClass61_2925.method598(i_0_, -11819);
			}
		}
	}
	
	public static void method3024(int i) {
		aClass318_2929 = null;
		index30 = null;
		if (i != 2) {
			method3022(true);
		}
		RSA_EXPONENT = null;
	}
	
	final void method3025(byte b) {
		if (b < 85) {
			aBoolean2930 = true;
		}
		synchronized (aClass61_2919) {
			aClass61_2919.method602((byte) -128);
		}
		anInt2922++;
		synchronized (aClass61_2925) {
			aClass61_2925.method602((byte) -123);
		}
	}
	
	final Class364 method3026(int i, int i_1_) {
		anInt2917++;
		Class364 class364;
		synchronized (aClass61_2919) {
			class364 = (Class364) aClass61_2919.method607((long) i_1_, i ^ i);
		}
		if (class364 != null) {
			return class364;
		}
		byte[] bs;
		synchronized (aClass302_2923) {
			bs = aClass302_2923.method3524(false, i_1_, 33);
		}
		class364 = new Class364();
		class364.aClass239_4516 = this;
		if (bs != null) {
			class364.method4061(new BufferedStream(bs), i + -33);
		}
		synchronized (aClass61_2919) {
			aClass61_2919.method601(class364, i + 25533, (long) i_1_);
		}
		return class364;
	}
	
	final void method3027(byte b) {
		if (b < -124) {
			synchronized (aClass61_2919) {
				aClass61_2919.method608(false);
			}
			anInt2926++;
			synchronized (aClass61_2925) {
				aClass61_2925.method608(false);
			}
		}
	}
	
	Class239(Class353 class353, int i, Index class302, Index class302_2_) {
		aClass302_2918 = class302_2_;
		aClass302_2923 = class302;
		aClass302_2923.method3537(-2, 33);
	}
}
