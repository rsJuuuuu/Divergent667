/* Class144_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144_Sub3 extends Class144
{
	static byte aByte6822;
	static int anInt6823;
	static int anInt6824;
	private int anInt6825;
	private int anInt6826;
	private int anInt6827;
	static int anInt6828;
	private int anInt6829;
	static int anInt6830;
	private int anInt6831;
	private int anInt6832;
	static boolean aBoolean6833 = false;
	private int anInt6834;
	static int[] anIntArray6835 = new int[3];
	private int anInt6836;
	
	Class144_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(-1, i_7_, i_8_);
		anInt6832 = i_6_;
		anInt6836 = i_4_;
		anInt6834 = i_3_;
		anInt6827 = i_5_;
		anInt6831 = i;
		anInt6829 = i_2_;
		anInt6826 = i_1_;
		anInt6825 = i_0_;
	}
	
	static final Class124[] method1635(byte b) {
		if (b >= -4) {
			return null;
		}
		anInt6823++;
		return new Class124[] { CacheNode_Sub16_Sub1.aClass124_11076, Class155.aClass124_1955, Class262_Sub1.aClass124_7696, Class308.aClass124_3907, Class144_Sub4.aClass124_6838, CacheNode_Sub4.aClass124_9463, Class188.aClass124_2291, Class10.aClass124_169, Node_Sub25_Sub2.aClass124_9957, Class274.aClass124_4975, Class127.aClass124_1638, Animable_Sub3.aClass124_9135, Class194_Sub1_Sub1.aClass124_9368, EntityNode_Sub8.aClass124_6024, Node_Sub16.aClass124_7132, Class262_Sub21.aClass124_7865, Class233.aClass124_2784, Class320_Sub6.aClass124_8267, Animable_Sub3.aClass124_9141, Class144_Sub4.aClass124_6846, Class320_Sub5.aClass124_8253, Class262_Sub6.aClass124_7745, Node_Sub5.aClass124_7031, Node_Sub38_Sub23.aClass124_10344, Class260.aClass124_5230, Class64.aClass124_5036, OutputStream_Sub1.aClass124_88, AnimableAnimator.aClass124_5500, Class362.aClass124_4494, Class262_Sub12.aClass124_7785, Node_Sub15_Sub4.aClass124_9793 };
	}
	
	final void method1629(int i, int i_9_, int i_10_) {
		anInt6828++;
		int i_11_ = i_10_ * anInt6831 >> 12;
		int i_12_ = anInt6825 * i >> 12;
		int i_13_ = anInt6826 * i_10_ >> 12;
		int i_14_ = i * anInt6829 >> 12;
		int i_15_ = i_10_ * anInt6834 >> 12;
		if (i_9_ == -12850) {
			int i_16_ = anInt6836 * i >> 12;
			int i_17_ = i_10_ * anInt6827 >> 12;
			int i_18_ = anInt6832 * i >> 12;
			DrawableModel.method616(i_11_, i_14_, -102, i_16_, anInt1787, i_15_, i_18_, i_12_, i_17_, i_13_);
		}
	}
	
	final void method1630(int i, int i_19_, int i_20_) {
		anInt6824++;
		if (i_19_ != -1) {
			anInt6826 = -2;
		}
	}
	
	public static void method1636(int i) {
		if (i != -1) {
			method1635((byte) -122);
		}
		anIntArray6835 = null;
	}
	
	final void method1626(int i, int i_21_, int i_22_) {
		anInt6830++;
		if (i_22_ != 3) {
			anInt6827 = 122;
		}
	}
	
	static {
		aByte6822 = (byte) -6;
	}
}
