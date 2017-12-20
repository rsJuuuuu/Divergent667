/* Class66_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub3 extends Class66
{
	static int anInt9001;
	private GLSprite aGLSprite9002;
	static int anInt9003;
	static int anInt9004;
	static int anInt9005;
	static int anInt9006;
	
	public final void method26(int i) {
		if (i != 99) {
			method719(false, -96, (byte) 6, -35);
		}
		anInt9005++;
		super.method26(i);
		aGLSprite9002 = Node_Sub9_Sub4.method2523((byte) 119, ((Class150_Sub1) aClass150_5171).anInt8950, aClass302_5168);
	}
	
	final void method719(boolean bool, int i, byte b, int i_0_) {
		Class93.aGraphicsToolkit1241.d(-2 + i, i_0_, aClass150_5171.anInt5086 + 4, aClass150_5171.anInt5081 - -2, ((Class150_Sub1) aClass150_5171).anInt8951, 0);
		anInt9003++;
		if (b != -16) {
			aGLSprite9002 = null;
		}
		Class93.aGraphicsToolkit1241.d(i - 1, i_0_ - -1, 2 + aClass150_5171.anInt5086, aClass150_5171.anInt5081, 0, 0);
	}
	
	Class66_Sub3(Index class302, Index class302_1_, Class150_Sub1 class150_sub1) {
		super(class302, class302_1_, class150_sub1);
	}
	
	public final boolean method25(int i) {
		anInt9006++;
		if (!super.method25(i)) {
			return false;
		}
		return aClass302_5168.method3510(((Class150_Sub1) aClass150_5171).anInt8950, (byte) 63);
	}
	
	final void method721(int i, int i_2_, boolean bool, int i_3_) {
		anInt9004++;
		int i_4_ = this.method720(100) * aClass150_5171.anInt5086 / 10000;
		int i_5_ = -97 % ((i_2_ - -10) / 40);
		int[] is = new int[4];
		Class93.aGraphicsToolkit1241.K(is);
		Class93.aGraphicsToolkit1241.KA(i, 2 + i_3_, i - -i_4_, i_3_ + aClass150_5171.anInt5081);
		aGLSprite9002.method1192(i, i_3_ - -2, aClass150_5171.anInt5086, aClass150_5171.anInt5081);
		Class93.aGraphicsToolkit1241.KA(is[0], is[1], is[2], is[3]);
	}
}
