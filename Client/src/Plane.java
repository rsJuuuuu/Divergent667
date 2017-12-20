/* Plane - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Plane
{
	protected int anInt3398;
	static int anInt3399;
	static int anInt3400;
	static boolean[] aBooleanArray3401;
	static int anInt3402;
	static String[] aStringArray3403 = new String[200];
	protected int anInt3404;
	static int anInt3405;
	static Class133 aClass133_3406;
	protected int[][] anIntArrayArray3407;
	protected int anInt3408;
	static Class133 aClass133_3409;
	protected int anInt3410;
	static Class133 aClass133_3411;
	static Class133 aClass133_3412;
	static Class133 aClass133_3413;
	static Class133 aClass133_3414;
	static Class133 aClass133_3415;
	static Class133 aClass133_3416;
	static Class133 aClass133_3417;
	static Class133 aClass133_3418;
	static Class133 aClass133_3419;
	static Class133 aClass133_3420;
	static Class133 aClass133_3421;
	private static Class133[] aClass133Array3422;
	static int anInt3423;
	
	abstract void wa(r var_r, int i, int i_0_, int i_1_, int i_2_, boolean bool);
	
	abstract void CA(r var_r, int i, int i_3_, int i_4_, int i_5_, boolean bool);
	
	static final int method3249(int i, int i_6_, int i_7_, int i_8_) {
		if (i_6_ < 18) {
			anInt3423 = 33;
		}
		anInt3405++;
		int i_9_ = -i_8_ + 255;
		i = (0xff0000 & (0xff00 & i) * i_8_ | (i & 0xff00ff) * i_8_ & ~0xff00ff) >>> 8;
		return i + ((0xff0000 & i_9_ * (0xff00 & i_7_) | ~0xff00ff & (i_7_ & 0xff00ff) * i_9_) >>> 8);
	}
	
	abstract void method3250(Node_Sub29 node_sub29, int[] is);
	
	final int method3251(int i, int i_10_, byte b) {
		if (b != -118) {
			method3255(2, 101, 8, 52, -36, 105, 3, null);
		}
		anInt3400++;
		return anIntArrayArray3407[i_10_][i];
	}
	
	abstract void method3252(int i, int i_11_, int i_12_, boolean[][] bools, boolean bool, int i_13_);
	
	abstract void method3253(int i, int i_14_, int[] is, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int i_25_, int i_26_, int i_27_, boolean bool);
	
	public static void method3254(byte b) {
		aClass133_3409 = null;
		aClass133_3418 = null;
		aStringArray3403 = null;
		aClass133_3406 = null;
		aBooleanArray3401 = null;
		aClass133_3411 = null;
		aClass133_3420 = null;
		aClass133_3414 = null;
		aClass133_3416 = null;
		aClass133_3412 = null;
		aClass133_3419 = null;
		aClass133_3415 = null;
		aClass133_3421 = null;
		aClass133Array3422 = null;
		aClass133_3417 = null;
		aClass133_3413 = null;
	}
	
	abstract void method3255(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, boolean[][] bools);
	
	abstract boolean method3256(r var_r, int i, int i_34_, int i_35_, int i_36_, boolean bool);
	
	abstract void ka(int i, int i_37_, int i_38_);
	
	abstract r fa(int i, int i_39_, r var_r);
	
	abstract void U(int i, int i_40_, int[] is, int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int i_48_, int i_49_, int i_50_, boolean bool);
	
	abstract void YA();
	
	abstract void method3257(int i, int i_51_);
	
	Plane(int i, int i_52_, int i_53_, int[][] is) {
		anInt3408 = i;
		anInt3404 = i_52_;
		int i_54_ = 0;
		for (/**/; i_53_ > 1; i_53_ >>= 1)
			i_54_++;
		anInt3398 = 1 << i_54_;
		anInt3410 = i_54_;
		anIntArrayArray3407 = is;
	}
	
	static final void method3258(int i, int i_55_, int i_56_) {
		anInt3402++;
		int i_57_ = Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, Class22.aClass22_387.method297(Class35.language));
		int i_58_;
		if (Class194_Sub3_Sub1.aBoolean9375) {
			for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(13); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
				int i_59_;
				if (cachenode_sub4.anInt9462 != 1) {
					i_59_ = Node_Sub14.method2551(cachenode_sub4, -1);
				} else {
					i_59_ = Node_Sub19.method2609((byte) -88, (CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035);
				}
				if (i_59_ > i_57_) {
					i_57_ = i_59_;
				}
			}
			i_57_ += 8;
			Class219.anInt2627 = (Node_Sub38_Sub5.aBoolean10130 ? 26 : 22) + Class21.anInt355 * 16;
			i_58_ = 21 + Class21.anInt355 * 16;
		} else {
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
				int i_60_ = Node_Sub19.method2609((byte) 110, cachenode_sub13);
				if (i_57_ < i_60_) {
					i_57_ = i_60_;
				}
			}
			i_57_ += 8;
			Class219.anInt2627 = (Node_Sub38_Sub5.aBoolean10130 ? 26 : 22) + 16 * Class315.anInt4035;
			i_58_ = Class315.anInt4035 * 16 + 21;
		}
		int i_61_ = -(i_57_ / 2) + i_56_;
		if ((Class360.screenWidth ^ 0xffffffff) > (i_57_ + i_61_ ^ 0xffffffff)) {
			i_61_ = -i_57_ + Class360.screenWidth;
		}
		if (i_61_ < 0) {
			i_61_ = 0;
		}
		int i_63_ = i_55_;
		if (i_63_ - -i_58_ > Class205.screenHeight) {
			i_63_ = -i_58_ + Class205.screenHeight;
		}
		if (i_63_ < 0) {
			i_63_ = 0;
		}
		Node_Sub6.anInt7043 = i_61_;
		Class213.aBoolean2510 = true;
		Client.anInt5481 = i_63_;
		Class362.anInt4492 = i_57_;
	}
	
	abstract void method3259(int i, int i_64_, int i_65_, boolean[][] bools, boolean bool, int i_66_, int i_67_);
	
	final int method3260(int i, int i_68_, int i_69_) {
		anInt3399++;
		int i_70_ = i_69_ >> anInt3410;
		int i_71_ = i >> anInt3410;
		if ((i_70_ ^ 0xffffffff) > -1 || i_71_ < 0 || (anInt3408 + -1 ^ 0xffffffff) > (i_70_ ^ 0xffffffff) || -1 + anInt3404 < i_71_) {
			return 0;
		}
		int i_72_ = anInt3398 - 1 & i_69_;
		if (i_68_ >= -108) {
			method3249(43, -34, -123, 59);
		}
		int i_73_ = anInt3398 - 1 & i;
		int i_74_ = i_72_ * anIntArrayArray3407[1 + i_70_][i_71_] + (anInt3398 - i_72_) * anIntArrayArray3407[i_70_][i_71_] >> anInt3410;
		int i_75_ = anIntArrayArray3407[i_70_][i_71_ + 1] * (anInt3398 + -i_72_) - -(i_72_ * anIntArrayArray3407[i_70_ - -1][i_71_ + 1]) >> anInt3410;
		return (-i_73_ + anInt3398) * i_74_ - -(i_73_ * i_75_) >> anInt3410;
	}
	
	static {
		aBooleanArray3401 = new boolean[5];
		aClass133_3406 = new Class133(14, 0);
		aClass133_3409 = new Class133(15, 4);
		aClass133_3411 = new Class133(16, -2);
		aClass133_3412 = new Class133(17, 0);
		aClass133_3413 = new Class133(19, -2);
		aClass133_3414 = new Class133(22, -2);
		aClass133_3415 = new Class133(23, 4);
		aClass133_3416 = new Class133(24, -1);
		aClass133_3417 = new Class133(26, 0);
		aClass133_3418 = new Class133(27, 0);
		aClass133_3419 = new Class133(28, -2);
		aClass133_3420 = new Class133(29, -2);
		aClass133_3421 = new Class133(30, -2);
		aClass133Array3422 = new Class133[32];
		Class133[] class133s = Class320_Sub11.method3723(0);
		for (int i = 0; i < class133s.length; i++)
			aClass133Array3422[class133s[i].packetId] = class133s[i];
		anInt3423 = 0;
	}
}
