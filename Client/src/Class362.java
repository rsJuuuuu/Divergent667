/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class362
{
	static int anInt4490;
	private Class61 aClass61_4491 = new Class61(128);
	static int anInt4492;
	private Index index17;
	static Class124 aClass124_4494 = new Class124(61);
	static int anInt4495;
	static int anInt4496;
	static int[] anIntArray4497 = new int[2];
	static Class329 aClass329_4498 = new Class329("INTBETA", "office", "_intbeta", 6);
	static int anInt4499;
	static byte aByte4500;
	
	static final String method4049(int i, String string) {
		anInt4490++;
		int i_0_ = 30 / ((i - -57) / 46);
		String string_1_ = CacheNode_Sub6.method2313((byte) 126, Animable_Sub2_Sub2.method843(string, -120));
		if (string_1_ == null) {
			string_1_ = "";
		}
		return string_1_;
	}
	
	public static void method4050(boolean bool) {
		if (bool != false) {
			anInt4492 = 13;
		}
		anIntArray4497 = null;
		aClass124_4494 = null;
		aClass329_4498 = null;
	}
	
	final Class39 method4051(int i, int i_2_) {
		anInt4496++;
		Class39 class39;
		synchronized (aClass61_4491) {
			class39 = (Class39) aClass61_4491.method607((long) i, 0);
		}
		if (class39 != null) {
			return class39;
		}
		byte[] bs = index17.method3524(false, ObjectDefinition.method3050((byte) -128, i), Class200_Sub1.method2014(i_2_ + -29692, i));
		if (i_2_ != -752) {
			method4052(-68, -125);
		}
		class39 = new Class39();
		if (bs != null) {
		//	System.out.println("i: "+i);
			class39.method405((byte) 71, new BufferedStream(bs));
		}
		synchronized (aClass61_4491) {
			aClass61_4491.method601(class39, 25566, (long) i);
		}
		return class39;
	}
	
	static final void method4052(int i, int i_3_) {
		int i_4_ = -63 % ((-10 - i) / 54);
		anInt4495++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 20, (long) i_3_);
		cachenode_sub2.method2291((byte) 121);
	}
	
	Class362(Class353 class353, int i, Index class302) {
		index17 = class302;
		if (index17 != null) {
			int i_5_ = index17.method3526(-20871) - 1;
			index17.method3537(-2, i_5_);
		}
	}
	
	static final void method4053(int i, int i_6_, int i_7_, byte b, int i_8_) {
		anInt4499++;
		if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
			int i_9_ = i_7_ / StandardSprite.anInt8946;
			int i_10_ = i_8_ / StandardSprite.anInt8946;
			int i_11_ = i / aa_Sub3.anInt5493;
			int i_12_ = i_6_ / aa_Sub3.anInt5493;
			if ((i_9_ ^ 0xffffffff) > (Class117.anInt1479 ^ 0xffffffff) && (i_10_ ^ 0xffffffff) <= -1 && (i_11_ ^ 0xffffffff) > (Class290_Sub11.anInt8181 ^ 0xffffffff) && (i_12_ ^ 0xffffffff) <= -1) {
				if (i_9_ < 0) {
					i_9_ = 0;
				}
				if (i_11_ < 0) {
					i_11_ = 0;
				}
				if (Class290_Sub11.anInt8181 <= i_12_) {
					i_12_ = -1 + Class290_Sub11.anInt8181;
				}
				if ((Class117.anInt1479 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff)) {
					i_10_ = -1 + Class117.anInt1479;
				}
				int i_13_ = 25 / ((b - 17) / 36);
				for (int i_14_ = i_11_; i_12_ >= i_14_; i_14_++) {
					int i_15_ = AnimableAnimator.method254(i_14_ - -Class259.anInt3300, 16939, Class290_Sub11.anInt8181) * Class117.anInt1479;
					for (int i_16_ = i_9_; i_16_ <= i_10_; i_16_++) {
						int i_17_ = AnimableAnimator.method254(Class338.anInt4190 + i_16_, 16939, Class117.anInt1479) + i_15_;
						Class290_Sub4.anIntArray8102[i_17_] = Class225.anInt2675;
					}
				}
			}
		}
	}
}
