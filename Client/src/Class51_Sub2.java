/* Class51_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51_Sub2 extends Class51 implements Interface15_Impl1
{
	static int anInt9065;
	static int anInt9066;
	static int anInt9067;
	static int[] anIntArray9068;
	static int anInt9069;
	static int anInt9070 = 0;
	private Class372 aClass372_9071;
	static int anInt9072;
	static int anInt9073;
	static float aFloat9074;
	static int anInt9075;
	
	public final jaclib.memory.Buffer method54(boolean bool, byte b) {
		anInt9075++;
		if (b <= 66) {
			method56(31, 118);
		}
		return super.method519(bool, aGLXToolkit5332.aMapBuffer9308, -5934);
	}
	
	public static void method524(byte b) {
		anIntArray9068 = null;
		if (b != -68) {
			method524((byte) 89);
		}
	}
	
	public final int method57(byte b) {
		if (b > -56) {
			anIntArray9068 = null;
		}
		anInt9067++;
		return super.method57((byte) -79);
	}
	
	public final Class372 method55(int i) {
		int i_0_ = 121 / ((55 - i) / 39);
		anInt9073++;
		return aClass372_9071;
	}
	
	public final void method56(int i, int i_1_) {
		super.method56(i, aClass372_9071.anInt4591 * i_1_);
		anInt9072++;
	}
	
	public final boolean method53(int i) {
		anInt9066++;
		if (i != -3308) {
			return false;
		}
		return super.method517(0, aGLXToolkit5332.aMapBuffer9308);
	}
	
	public final void method38(boolean bool) {
		if (bool == false) {
			anInt9065++;
			super.method38(bool);
		}
	}
	
	Class51_Sub2(GLXToolkit glxtoolkit, Class372 class372, boolean bool) {
		super(glxtoolkit, 34963, bool);
		aClass372_9071 = class372;
	}
	
	static {
		anInt9069 = 0;
		anIntArray9068 = new int[4];
	}
}
