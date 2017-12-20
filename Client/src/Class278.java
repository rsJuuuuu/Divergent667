/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class278
{
	static int anInt3538;
	private Index aClass302_3539;
	static int anInt3540;
	static int anInt3541;
	static IncommingPacket aClass192_3542 = new IncommingPacket(78, 8);
	private Class61 aClass61_3543 = new Class61(16);
	static int anInt3544;
	static int anInt3545;
	static int anInt3546 = 0;
	static int anInt3547;
	static IncommingPacket aClass192_3548 = new IncommingPacket(80, -2);
	
	final void method3362(int i, int i_0_) {
		anInt3541++;
		if (i_0_ != 29) {
			aClass192_3542 = null;
		}
		synchronized (aClass61_3543) {
			aClass61_3543.method598(i, -11819);
		}
	}
	
	final void method3363(int i) {
		if (i != -29945) {
			aClass302_3539 = null;
		}
		synchronized (aClass61_3543) {
			aClass61_3543.method602((byte) -124);
		}
		anInt3538++;
	}
	
	private final Class82 method3364(int i, int i_1_) {
		anInt3544++;
		Class82 class82;
		synchronized (aClass61_3543) {
			if (i_1_ != -26726) {
				method3365(55);
			}
			class82 = (Class82) aClass61_3543.method607((long) i, 0);
		}
		if (class82 != null) {
			return class82;
		}
		byte[] bs;
		synchronized (aClass302_3539) {
			bs = aClass302_3539.method3524(false, i, 29);
		}
		class82 = new Class82();
		if (bs != null) {
			class82.method795((byte) -126, new BufferedStream(bs));
		}
		synchronized (aClass61_3543) {
			aClass61_3543.method601(class82, i_1_ ^ ~0xbbb, (long) i);
		}
		return class82;
	}
	
	final void method3365(int i) {
		synchronized (aClass61_3543) {
			aClass61_3543.method608(false);
		}
		anInt3547++;
		if (i <= 82) {
			aClass61_3543 = null;
		}
	}
	
	final Class119 method3366(Class57 class57, int i, int i_2_, int i_3_, int i_4_, boolean bool) {
		anInt3545++;
		if (bool != true) {
			aClass302_3539 = null;
		}
		Class182[] class182s = null;
		Class82 class82 = method3364(i_2_, -26726);
		if (class82.anIntArray1115 != null) {
			class182s = new Class182[class82.anIntArray1115.length];
			for (int i_5_ = 0; class182s.length > i_5_; i_5_++) {
				Class7 class7 = class57.method568(25566, class82.anIntArray1115[i_5_]);
				class182s[i_5_] = new Class182(class7.anInt156, class7.anInt151, class7.anInt152, class7.anInt158, class7.anInt160, class7.anInt150, class7.anInt159, class7.aBoolean162, class7.anInt155, class7.anInt161, class7.anInt153);
			}
		}
		return new Class119(class82.anInt1119, class182s, class82.anInt1113, i_4_, i_3_, i, class82.anInt1114, class82.anInt1109);
	}
	
	static final boolean method3367(int i, int i_6_, byte b) {
		@SuppressWarnings("unused")
		int i_7_ = 112 % ((b - -59) / 45);
		anInt3540++;
		return (0x220 & i_6_ ^ 0xffffffff) == -545 | (0x18 & i_6_) != 0;
	}
	
	Class278(Class353 class353, int i, Index class302) {
		aClass302_3539 = class302;
		aClass302_3539.method3537(-2, 29);
	}
	
	public static void method3368(int i) {
		aClass192_3542 = null;
		aClass192_3548 = null;
		if (i != 2686) {
			method3368(-88);
		}
	}
}
