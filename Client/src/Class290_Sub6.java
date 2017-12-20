/* Class290_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290_Sub6 extends Class290
{
	static Class336 aClass336_8114;
	static int anInt8115;
	static int anInt8116 = 0;
	static int anInt8117;
	static int anInt8118;
	static int anInt8119;
	static int anInt8120;
	static int anInt8121;
	static Class312 aClass312_8122 = new Class312();
	static int[] anIntArray8123;
	static int anInt8124;
	static int anInt8125;
	
	final void method3415(boolean bool, int i, int i_0_) {
		if (bool != true) {
			anInt8116 = 49;
		}
		anInt8117++;
	}
	
	Class290_Sub6(AbstractToolkit abstracttoolkit) {
		super(abstracttoolkit);
	}
	
	final void method3417(boolean bool, boolean bool_1_) {
		if (bool_1_ == false) {
			anInt8120++;
		}
	}
	
	final boolean method3414(byte b) {
		anInt8119++;
		if (b > -45) {
			anIntArray8123 = null;
		}
		return false;
	}
	
	final void method3411(int i) {
		anInt8115++;
		if (i != -8668) {
			anInt8116 = 121;
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		anAbstractToolkit3654.method1312((byte) -21, interface13);
		if (b != 92) {
			method3417(false, false);
		}
		anInt8125++;
		anAbstractToolkit3654.method1278((byte) -12, i);
	}
	
	final void method3422(int i, boolean bool) {
		anInt8118++;
		if (i > -84) {
			aClass336_8114 = null;
		}
	}
	
	static final int method3438(int i) {
		anInt8121++;
		if ((Class118.anInt5405 ^ 0xffffffff) == -1) {
			Class298.aClass298_3714.method3484(new Class45("jaclib"), 1000);
			if (Class298.aClass298_3714.method3483((byte) -110).method35(-58) != 100) {
				return 1;
			}
			if (!((Class45) Class298.aClass298_3714.method3483((byte) -125)).method464(-121)) {
				Class158.aClient1983.method96((byte) -35);
			}
			Class118.anInt5405 = 1;
		}
		if (Class118.anInt5405 == 1) {
			GLToolkit.aClass298Array6403 = Class298.method3481(-125);
			Class298.aClass298_3712.method3484(new Class108(Class176.aClass302_2102), i + -13627);
			Class298.aClass298_3715.method3484(new Class45("jaggl"), 1000);
			Class298.aClass298_3716.method3484(new Class45("jagdx"), i + -13627);
			Class298.aClass298_3717.method3484(new Class45("jagmisc"), 1000);
			Class298.aClass298_3718.method3484(new Class45("sw3d"), 1000);
			Class298.aClass298_3719.method3484(new Class45("hw3d"), 1000);
			Class298.aClass298_3720.method3484(new Class45("jagtheora"), 1000);
			Class298.aClass298_3721.method3484(new Class108(Class262_Sub2.index31), i + -13627);
			Class298.aClass298_3722.method3484(new Class108(Node_Sub38_Sub10.aClass302_10197), 1000);
			Class298.aClass298_3723.method3484(new Class108(Class4.index2), i ^ 0x3acb);
			Class298.aClass298_3724.method3484(new Class108(Class247.aClass302_3143), 1000);
			Class298.aClass298_3725.method3484(new Class108(Class14.index17), i + -13627);
			Class298.aClass298_3726.method3484(new Class108(Class174.aClass302_2093), 1000);
			Class298.aClass298_3727.method3484(new Class108(Class205.index19), i ^ 0x3acb);
			Class298.aClass298_3728.method3484(new Class108(Class262_Sub23.aClass302_7886), i + -13627);
			Class298.aClass298_3729.method3484(new Class108(Node_Sub15_Sub5.aClass302_9805), 1000);
			Class298.aClass298_3730.method3484(new Class108(Class127.index22), 1000);
			Class298.aClass298_3731.method3484(new Class108(Node_Sub38_Sub4.aClass302_10116), 1000);
			Class298.aClass298_3732.method3484(new Class108(Node_Sub18.aClass302_7150), 1000);
			Class298.aClass298_3733.method3484(new Class108(CacheNode_Sub5.aClass302_9477), 1000);
			Class298.aClass298_3734.method3484(new Class108(Class262_Sub3.aClass302_7715), 1000);
			Class298.aClass298_3735.method3484(new Class258(Class250.aClass302_3179, "huffman"), 1000);
			Class298.aClass298_3736.method3484(new Class108(Class293.aClass302_3681), 1000);
			Class298.aClass298_3737.method3484(new Class108(Class21.aClass302_357), 1000);
			Class298.aClass298_3738.method3484(new Class108(AnimableAnimator_Sub1.aClass302_9091), i + -13627);
			Class298.aClass298_3739.method3484(new Class88(r_Sub1.aClass302_11047, "details"), 1000);
			for (int i_2_ = 0; GLToolkit.aClass298Array6403.length > i_2_; i_2_++) {
				if (GLToolkit.aClass298Array6403[i_2_].method3483((byte) -99) == null) {
					throw new RuntimeException();
				}
			}
			int i_3_ = 0;
			Class298[] class298s = GLToolkit.aClass298Array6403;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (class298s.length ^ 0xffffffff); i_4_++) {
				Class298 class298 = class298s[i_4_];
				int i_5_ = class298.method3485(1);
				int i_6_ = class298.method3483((byte) -127).method35(-34);
				i_3_ += i_6_ * i_5_ / 100;
			}
			Class209.anInt2493 = i_3_;
			Class118.anInt5405 = 2;
		}
		if (GLToolkit.aClass298Array6403 == null) {
			return 100;
		}
		int i_7_ = 0;
		int i_8_ = 0;
		boolean bool = true;
		Class298[] class298s = GLToolkit.aClass298Array6403;
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (class298s.length ^ 0xffffffff); i_9_++) {
			Class298 class298 = class298s[i_9_];
			int i_10_ = class298.method3485(1);
			int i_11_ = class298.method3483((byte) -106).method35(i ^ ~0x392f);
			i_8_ += i_10_ * i_11_ / 100;
			if ((i_11_ ^ 0xffffffff) > -101) {
				bool = false;
			}
			i_7_ += i_10_;
		}
		if (bool) {
			if (!((Class45) Class298.aClass298_3717.method3483((byte) -106)).method464(i ^ ~0x3954)) {
				Class158.aClient1983.method86(7834);
			}
			if (!((Class45) Class298.aClass298_3720.method3483((byte) -121)).method464(34)) {
				Class235_Sub1.aBoolean8975 = Class158.aClient1983.method103(-31930);
			}
			GLToolkit.aClass298Array6403 = null;
		}
		i_8_ -= Class209.anInt2493;
		if (i != 14627) {
			aClass312_8122 = null;
		}
		i_7_ -= Class209.anInt2493;
		int i_12_ = i_7_ > 0 ? 100 * i_8_ / i_7_ : 100;
		if (!bool && i_12_ > 99) {
			i_12_ = 99;
		}
		return i_12_;
	}
	
	public static void method3439(byte b) {
		aClass336_8114 = null;
		anIntArray8123 = null;
		aClass312_8122 = null;
		@SuppressWarnings("unused")
		int i = -26 / ((b - -53) / 62);
	}
}
