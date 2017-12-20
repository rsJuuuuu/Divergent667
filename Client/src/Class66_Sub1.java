/* Class66_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub1 extends Class66
{
	static int anInt8982;
	static IComponentDefinitions aWidget8983;
	static Class257 aClass257_8984;
	static int anInt8985;
	static int anInt8986;
	static int[] LOCAL_PLAYERS_INDEXES = new int[2048];
	static volatile Object anObject8988 = null;
	
	Class66_Sub1(Index class302, Index class302_0_, Class150_Sub2 class150_sub2) {
		super(class302, class302_0_, class150_sub2);
	}
	
	static final void method723(byte b, boolean bool, int i, int i_1_, boolean bool_2_) {
		anInt8985++;
		Class97.method1079((byte) -86, Class180.aClass377_Sub1Array2143.length - 1, 0, bool, i_1_, bool_2_, i);
		if (b != 57) {
			method723((byte) 114, true, 108, 110, true);
		}
		EntityNode_Sub3_Sub1.anInt9163 = 0;
		GLToolkit.aNode_Sub7_6558 = null;
	}
	
	public static void method724(int i) {
		LOCAL_PLAYERS_INDEXES = null;
		aClass257_8984 = null;
		aWidget8983 = null;
		int i_3_ = -116 / ((i - -61) / 57);
		anObject8988 = null;
	}
	
	final void method719(boolean bool, int i, byte b, int i_4_) {
		Class93.aGraphicsToolkit1241.d(i + -2, i_4_, aClass150_5171.anInt5086 + 4, aClass150_5171.anInt5081 + 2, ((Class150_Sub2) aClass150_5171).anInt8958, 0);
		anInt8986++;
		if (b == -16) {
			Class93.aGraphicsToolkit1241.d(-1 + i, i_4_ - -1, 2 + aClass150_5171.anInt5086, aClass150_5171.anInt5081, 0, 0);
		}
	}
	
	final void method721(int i, int i_5_, boolean bool, int i_6_) {
		int i_7_ = -27 / ((i_5_ - -10) / 40);
		anInt8982++;
		int i_8_ = this.method720(100) * aClass150_5171.anInt5086 / 10000;
		Class93.aGraphicsToolkit1241.aa(i, 2 + i_6_, i_8_, aClass150_5171.anInt5081 - 2, ((Class150_Sub2) aClass150_5171).anInt8959, 0);
		Class93.aGraphicsToolkit1241.aa(i + i_8_, 2 + i_6_, -i_8_ + aClass150_5171.anInt5086, -2 + aClass150_5171.anInt5081, 0, 0);
	}
	
	static {
		aClass257_8984 = new Class257(7, 2);
	}
}
