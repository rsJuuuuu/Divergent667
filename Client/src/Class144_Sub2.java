/* Class144_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144_Sub2 extends Class144
{
	static int anInt6812;
	private int anInt6813;
	static int anInt6814;
	private int anInt6815;
	static int anInt6816;
	private int anInt6817;
	private int anInt6818;
	static int anInt6819;
	static int anInt6820;
	static int anInt6821;
	
	final void method1629(int i, int i_0_, int i_1_) {
		anInt6820++;
		if (i_0_ != -12850) {
			method1629(85, 97, 74);
		}
	}
	
	static final void method1633(int i, int i_2_) {
		if (i <= -18) {
			Node_Sub15_Sub3.anInt9787 = i_2_;
			anInt6821++;
			Class166.aClass61_5097.method608(false);
		}
	}
	
	final void method1630(int i, int i_3_, int i_4_) {
		anInt6816++;
		if (i_3_ != -1) {
			anInt6817 = 74;
		}
		int i_5_ = anInt6817 * i_4_ >> 12;
		int i_6_ = anInt6818 * i_4_ >> 12;
		int i_7_ = anInt6813 * i >> 12;
		int i_8_ = i * anInt6815 >> 12;
		ConfigDefinitions.method738(i_7_, anInt1788, i_8_, i_5_, anInt1787, anInt1785, 1, i_6_);
	}
	
	static final boolean method1634(int i, int i_9_, boolean bool) {
		anInt6814++;
		if (bool != false) {
			method1633(-109, 100);
		}
        return (0x10 & i_9_) != 0;
    }
	
	Class144_Sub2(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		super(i_13_, i_14_, i_15_);
		anInt6818 = i_11_;
		anInt6815 = i_12_;
		anInt6817 = i;
		anInt6813 = i_10_;
	}
	
	final void method1626(int i, int i_16_, int i_17_) {
		anInt6819++;
		int i_18_ = anInt6817 * i >> 12;
		int i_19_ = anInt6818 * i >> 12;
		int i_20_ = i_16_ * anInt6813 >> 12;
		int i_21_ = i_16_ * anInt6815 >> 12;
		if (i_17_ == 3) {
			Class262_Sub4.method3160(i_21_, anInt1785, (byte) -21, i_20_, i_19_, i_18_);
		}
	}
}
