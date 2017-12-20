/* Class234_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class234_Sub2 extends Class234
{
	private long aLong6919 = 0L;
	private long aLong6920 = 0L;
	private long aLong6921 = 0L;
	private int anInt6922;
	private int anInt6923;
	private long[] aLongArray6924 = new long[10];
	
	final int method2145(byte b, long l) {
		if (b <= 68) {
			return -115;
		}
		if (aLong6919 <= aLong6920) {
			int i = 0;
			do
				aLong6919 += l;
			while ((++i ^ 0xffffffff) > -11 && aLong6920 > aLong6919);
			if ((aLong6919 ^ 0xffffffffffffffffL) > (aLong6920 ^ 0xffffffffffffffffL)) {
				aLong6919 = aLong6920;
			}
			return i;
		}
		aLong6921 += aLong6919 + -aLong6920;
		aLong6920 += aLong6919 + -aLong6920;
		aLong6919 += l;
		return 1;
	}
	
	final long method2148(byte b) {
		aLong6920 += method2153((byte) 90);
		if (b < 88) {
			method2148((byte) -34);
		}
		if (aLong6920 < aLong6919) {
			return (aLong6919 + -aLong6920) / 1000000L;
		}
		return 0L;
	}
	
	final long method2151(int i) {
		if (i != 0) {
			aLong6919 = 100L;
		}
		return aLong6920;
	}
	
	private final long method2153(byte b) {
		long l = System.nanoTime();
		long l_0_ = -aLong6921 + l;
		aLong6921 = l;
		if (l_0_ > -5000000000L && (l_0_ ^ 0xffffffffffffffffL) > -5000000001L) {
			aLongArray6924[anInt6923] = l_0_;
			anInt6923 = (anInt6923 + 1) % 10;
			if ((anInt6922 ^ 0xffffffff) > -2) {
				anInt6922++;
			}
		}
		long l_1_ = 0L;
		for (int i = 1; anInt6922 >= i; i++)
			l_1_ += aLongArray6924[(anInt6923 + (-i - -10)) % 10];
		@SuppressWarnings("unused")
		int i = -38 / ((b - -10) / 54);
		return l_1_ / (long) anInt6922;
	}
	
	final void method2146(int i) {
		if (i != -4756) {
			anInt6922 = -107;
		}
		if (aLong6919 > aLong6920) {
			aLong6920 += aLong6919 + -aLong6920;
		}
		aLong6921 = 0L;
	}
	
	Class234_Sub2() {
		anInt6923 = 0;
		anInt6922 = 1;
		aLong6920 = System.nanoTime();
		aLong6919 = System.nanoTime();
	}
}
