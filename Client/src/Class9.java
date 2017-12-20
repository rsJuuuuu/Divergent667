/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9
{
	static int anInt165;
	static int anInt166;
	static String[] aStringArray167 = new String[100];
	
	static final void method184(int i) {
		Class178.LOCAL_PLAYERS_INDEXES_COUNT = 0;
		anInt166++;
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -2049; i_1_++) {
			Class249.cachedappearances[i_1_] = null;
			Class73.movementTypes[i_1_] = (byte) 1;
			Class320_Sub10.aClass323Array8296[i_1_] = null;
		}
	}
	
	public static void method185(byte b) {
		if (b < 16) {
			method184(-69);
		}
		aStringArray167 = null;
	}
}
