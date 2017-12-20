/* Class234_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234_Sub1 extends Class234
{
	private int anInt6913;
	private long[] aLongArray6914;
	private long aLong6915 = 0L;
	private int anInt6916 = 0;
	private long aLong6917;
	private long aLong6918;
	
	final void method2146(int i) {
		aLong6918 = 0L;
		if (i != -4756) {
			aLong6915 = 33L;
		}
		if ((aLong6917 ^ 0xffffffffffffffffL) < (aLong6915 ^ 0xffffffffffffffffL)) {
			aLong6915 += aLong6917 - aLong6915;
		}
	}
	
	final long method2148(byte b) {
		aLong6915 += method2152((byte) -15);
		if (b <= 88) {
			return 7L;
		}
		if (aLong6915 < aLong6917) {
			return (-aLong6915 + aLong6917) / 1000000L;
		}
		return 0L;
	}
	
	final long method2151(int i) {
		if (i != 0) {
			return 41L;
		}
		return aLong6915;
	}
	
	final int method2145(byte b, long l) {
		if (b < 68) {
			method2151(70);
		}
		if (aLong6917 > aLong6915) {
			aLong6918 += -aLong6915 + aLong6917;
			aLong6915 += -aLong6915 + aLong6917;
			aLong6917 += l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong6917 += l;
		} while ((i ^ 0xffffffff) > -11 && (aLong6915 ^ 0xffffffffffffffffL) < (aLong6917 ^ 0xffffffffffffffffL));
		if (aLong6915 > aLong6917) {
			aLong6917 = aLong6915;
		}
		return i;
	}
	
	private final long method2152(byte b) {
		if (b != -15) {
			return 4L;
		}
		long l = 1000000L * Class313.method3650(false);
		long l_0_ = -aLong6918 + l;
		aLong6918 = l;
		if ((l_0_ ^ 0xffffffffffffffffL) < 4999999999L && l_0_ < 5000000000L) {
			aLongArray6914[anInt6916] = l_0_;
			anInt6916 = (anInt6916 + 1) % 10;
			if (anInt6913 < 10) {
				anInt6913++;
			}
		}
		long l_1_ = 0L;
		for (int i = 1; (anInt6913 ^ 0xffffffff) <= (i ^ 0xffffffff); i++)
			l_1_ += aLongArray6914[(anInt6916 - i - -10) % 10];
		return l_1_ / (long) anInt6913;
	}
	
	Class234_Sub1() {
		aLongArray6914 = new long[10];
		anInt6913 = 1;
		aLong6917 = 0L;
		aLong6918 = 0L;
	}
}
