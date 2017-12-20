/* Class144_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144_Sub1 extends Class144
{
	private int anInt6801;
	static Class232 aClass232_6802;
	static int anInt6803;
	static short aShort6804 = 256;
	private int anInt6805;
	static int anInt6806;
	private int anInt6807;
	static float aFloat6808 = 1.0F;
	static int anInt6809;
	private int anInt6810;
	static int anInt6811;
	
	Class144_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		super(i_3_, i_4_, i_5_);
		anInt6805 = i_0_;
		anInt6807 = i;
		anInt6810 = i_1_;
		anInt6801 = i_2_;
	}
	
	final void method1629(int i, int i_6_, int i_7_) {
		anInt6803++;
		int i_8_ = i_7_ * anInt6807 >> 12;
		int i_9_ = anInt6810 * i_7_ >> 12;
		if (i_6_ == -12850) {
			int i_10_ = i * anInt6805 >> 12;
			int i_11_ = anInt6801 * i >> 12;
			Class97.method1080(i_11_, (byte) 107, anInt1787, anInt1788, i_9_, i_10_, i_8_);
		}
	}
	
	final void method1630(int i, int i_12_, int i_13_) {
		anInt6809++;
		if (i_12_ == -1) {
			int i_14_ = anInt6807 * i_13_ >> 12;
			int i_15_ = i_13_ * anInt6810 >> 12;
			int i_16_ = i * anInt6805 >> 12;
			int i_17_ = i * anInt6801 >> 12;
			Node.method2162(anInt1785, i_15_, anInt1787, i_12_ + 32022, i_16_, i_17_, i_14_, anInt1788);
		}
	}
	
	public static void method1632(int i) {
		if (i != 256) {
			anInt6806 = 37;
		}
		aClass232_6802 = null;
	}
	
	final void method1626(int i, int i_18_, int i_19_) {
		anInt6811++;
		int i_20_ = anInt6807 * i >> 12;
		if (i_19_ == 3) {
			int i_21_ = i * anInt6810 >> 12;
			int i_22_ = anInt6805 * i_18_ >> 12;
			int i_23_ = i_18_ * anInt6801 >> 12;
			Class331.method3842(i_21_, i_20_, anInt1785, i_23_, i_22_, (byte) -54);
		}
	}
	
	static {
		anInt6806 = -1;
	}
}
