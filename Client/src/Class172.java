/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172
{
	static int anInt2075;
	static int anInt2076;
	static Class172 aClass172_2077 = new Class172();
	static Class172 aClass172_2078 = new Class172();
	static Class172 aClass172_2079 = new Class172();
	static Class172 aClass172_2080 = new Class172();
	
	public static void method1796(int i) {
		aClass172_2078 = null;
		aClass172_2080 = null;
		aClass172_2079 = null;
		aClass172_2077 = null;
		if (i != -1) {
			aClass172_2077 = null;
		}
	}
	
	static final int method1797(int i, Player player) {
		anInt2075++;
		int i_0_ = player.anInt11153;
		Class259 class259 = player.method868((byte) -127);
		int i_1_ = player.anAnimator10860.method250((byte) -53);
		if (i == i_1_ || player.aBoolean10867) {
			i_0_ = player.anInt11167;
		} else if ((class259.anInt3252 ^ 0xffffffff) == (i_1_ ^ 0xffffffff) || (i_1_ ^ 0xffffffff) == (class259.anInt3271 ^ 0xffffffff) || class259.anInt3293 == i_1_ || class259.anInt3270 == i_1_) {
			i_0_ = player.anInt11182;
		} else if ((class259.anInt3262 ^ 0xffffffff) == (i_1_ ^ 0xffffffff) || class259.anInt3297 == i_1_ || (class259.anInt3304 ^ 0xffffffff) == (i_1_ ^ 0xffffffff) || class259.anInt3269 == i_1_) {
			i_0_ = player.anInt11172;
		}
		return i_0_;
	}
	
	public final String toString() {
		anInt2076++;
		throw new IllegalStateException();
	}
}
