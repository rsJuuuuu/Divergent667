/* Class194_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class194_Sub1_Sub1 extends Class194_Sub1
{
	static int anInt9367;
	static Class124 aClass124_9368 = new Class124(20);
	static Class212 aClass212_9369;
	static int[] anIntArray9370 = new int[250];
	
	public static void method1968(int i) {
		anIntArray9370 = null;
		if (i != 0) {
			anIntArray9370 = null;
		}
		aClass124_9368 = null;
		aClass212_9369 = null;
	}
	
	static final void method1969(boolean bool, Class261[][][] class261s) {
		anInt9367++;
		if (bool != false) {
			anIntArray9370 = null;
		}
		for (int i = 0; class261s.length > i; i++) {
			Class261[][] class261s_0_ = class261s[i];
			for (int i_1_ = 0; i_1_ < class261s_0_.length; i_1_++) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (class261s_0_[i_1_].length ^ 0xffffffff); i_2_++) {
					Class261 class261 = class261s_0_[i_1_][i_2_];
					if (class261 != null) {
						if (class261.anAnimable_Sub1_3317 instanceof Interface19) {
							((Interface19) class261.anAnimable_Sub1_3317).method69(-108);
						}
						if (class261.anAnimable_Sub4_3315 instanceof Interface19) {
							((Interface19) class261.anAnimable_Sub4_3315).method69(68);
						}
						if (class261.anAnimable_Sub4_3319 instanceof Interface19) {
							((Interface19) class261.anAnimable_Sub4_3319).method69(-116);
						}
						if (class261.anAnimable_Sub2_3314 instanceof Interface19) {
							((Interface19) class261.anAnimable_Sub2_3314).method69(95);
						}
						if (class261.anAnimable_Sub2_3308 instanceof Interface19) {
							((Interface19) class261.anAnimable_Sub2_3308).method69(-113);
						}
						for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
							Mobile mobile = class256.aMobile3239;
							if (mobile instanceof Interface19) {
								((Interface19) mobile).method69(-117);
							}
						}
					}
				}
			}
		}
	}
	
	static {
		aClass212_9369 = new Class212("", 18);
	}
}
