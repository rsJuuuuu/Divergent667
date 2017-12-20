/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class290
{
	static long aLong3647 = 0L;
	static int anInt3648;
	static int anInt3649;
	static int anInt3650;
	static int anInt3651;
	static int anInt3652;
	static int anInt3653;
	protected AbstractToolkit anAbstractToolkit3654;
	static int anInt3655 = 1;
	
	void method3410(int i) {
		anInt3653++;
		if (i <= 10) {
			aLong3647 = -32L;
		}
	}
	
	abstract void method3411(int i);
	
	void method3412(int i) {
		if (i != 0) {
			method3411(90);
		}
		anInt3651++;
	}
	
	void method3413(int i) {
		@SuppressWarnings("unused")
		int i_0_ = 14 % ((i - -60) / 61);
		anInt3650++;
	}
	
	abstract boolean method3414(byte b);
	
	abstract void method3415(boolean bool, int i, int i_1_);
	
	void method3416(byte b) {
		if (b != -56) {
			anInt3655 = -66;
		}
		anInt3649++;
	}
	
	abstract void method3417(boolean bool, boolean bool_2_);
	
	static final void method3418(Mobile mobile, boolean bool) {
		for (int i = mobile.aShort9119; i <= mobile.aShort9130; i++) {
			for (int i_3_ = mobile.aShort9120; i_3_ <= mobile.aShort9124; i_3_++) {
				Class261 class261 = Class175.aClass261ArrayArrayArray2099[mobile.plane][i][i_3_];
				if (class261 != null) {
					Class256 class256 = class261.aClass256_3312;
					Class256 class256_4_ = null;
					for (/**/; class256 != null; class256 = class256.aClass256_3238) {
						if (class256.aMobile3239 == mobile) {
							if (class256_4_ != null) {
								class256_4_.aClass256_3238 = class256.aClass256_3238;
							} else {
								class261.aClass256_3312 = class256.aClass256_3238;
							}
							class256.method3119(-20952);
							break;
						}
						class256_4_ = class256;
					}
				}
			}
		}
		if (!bool) {
			Class58.method575(mobile);
		}
	}
	
	abstract void method3419(Interface13 interface13, int i, byte b);
	
	void method3420(int i) {
		if (i > 4) {
			anInt3652++;
		}
	}
	
	Class290(AbstractToolkit abstracttoolkit) {
		anAbstractToolkit3654 = abstracttoolkit;
	}
	
	void method3421(boolean bool) {
		anInt3648++;
		if (bool != false) {
			method3422(74, true);
		}
	}
	
	abstract void method3422(int i, boolean bool);
}
