/* Class144_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144_Sub4 extends Class144
{
	private int anInt6837;
	static Class124 aClass124_6838;
	private int anInt6839;
	static int anInt6840;
	private int anInt6841;
	private int anInt6842;
	static float[] aFloatArray6843 = new float[4];
	static int anInt6844;
	static int anInt6845;
	static Class124 aClass124_6846;
	static OutcommingPacket aClass318_6847;
	static int anInt6848;
	
	Class144_Sub4(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(-1, i_3_, i_4_);
		anInt6842 = i_2_;
		anInt6839 = i_0_;
		anInt6841 = i;
		anInt6837 = i_1_;
	}
	
	final void method1629(int i, int i_5_, int i_6_) {
		anInt6845++;
		if (i_5_ != -12850) {
			method1630(-37, 80, -95);
		}
		int i_7_ = anInt6841 * i_6_ >> 12;
		int i_8_ = i_6_ * anInt6837 >> 12;
		int i_9_ = anInt6839 * i >> 12;
		int i_10_ = i * anInt6842 >> 12;
		Animable_Sub3.method921(i_5_ ^ ~0x103231, i_8_, i_10_, i_7_, anInt1787, i_9_);
	}
	
	final void method1626(int i, int i_11_, int i_12_) {
		if (i_12_ != 3) {
			aFloatArray6843 = null;
		}
		anInt6844++;
	}
	
	final void method1630(int i, int i_13_, int i_14_) {
		if (i_13_ == -1) {
			anInt6840++;
		}
	}
	
	public static void method1637(int i) {
		aClass124_6838 = null;
		aClass318_6847 = null;
		aClass124_6846 = null;
		aFloatArray6843 = null;
		if (i <= 120) {
			aClass318_6847 = null;
		}
	}
	
	static {
		aClass124_6838 = new Class124(10);
		aClass124_6846 = new Class124(40);
		anInt6848 = 0;
		aClass318_6847 = new OutcommingPacket(63, 4);
	}
}
