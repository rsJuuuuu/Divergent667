/* Class320_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub27 extends Class320
{
	static int anInt8460;
	static int anInt8461;
	static int anInt8462;
	static int anInt8463;
	static int anInt8464;
	static boolean aBoolean8465 = false;
	static int anInt8466;
	static int anInt8467;
	static int anInt8468;
	
	Class320_Sub27(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		if (bool == false) {
			anInt4064 = i;
			anInt8464++;
		}
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			aBoolean8465 = true;
		}
		anInt8466++;
		return 1;
	}
	
	static final void method3781(int i, int i_0_, int i_1_, Animable_Sub2 animable_sub2, Animable_Sub2 animable_sub2_2_) {
		Class261 class261 = Node_Sub15_Sub6.method2572(i, i_0_, i_1_);
		if (class261 != null) {
			class261.anAnimable_Sub2_3314 = animable_sub2;
			class261.anAnimable_Sub2_3308 = animable_sub2_2_;
			int i_3_ = Class320_Sub10.aPlaneArray8300 == Class368.aPlaneArray4548 ? 1 : 0;
			if (animable_sub2.method814((byte) 91)) {
				if (animable_sub2.method813(0)) {
					animable_sub2.anAnimable5941 = SeekableFile.anAnimableArray3884[i_3_];
					SeekableFile.anAnimableArray3884[i_3_] = animable_sub2;
				} else {
					animable_sub2.anAnimable5941 = Class303.anAnimableArray3827[i_3_];
					Class303.anAnimableArray3827[i_3_] = animable_sub2;
					Class194_Sub1.aBoolean6892 = true;
				}
			} else {
				animable_sub2.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_3_];
				Node_Sub36.anAnimableArray7429[i_3_] = animable_sub2;
			}
			if (animable_sub2_2_ != null) {
				if (animable_sub2_2_.method814((byte) 84)) {
					if (animable_sub2_2_.method813(0)) {
						animable_sub2_2_.anAnimable5941 = SeekableFile.anAnimableArray3884[i_3_];
						SeekableFile.anAnimableArray3884[i_3_] = animable_sub2_2_;
					} else {
						animable_sub2_2_.anAnimable5941 = Class303.anAnimableArray3827[i_3_];
						Class303.anAnimableArray3827[i_3_] = animable_sub2_2_;
						Class194_Sub1.aBoolean6892 = true;
					}
				} else {
					animable_sub2_2_.anAnimable5941 = Node_Sub36.anAnimableArray7429[i_3_];
					Node_Sub36.anAnimableArray7429[i_3_] = animable_sub2_2_;
				}
			}
		}
	}
	
	final void method3673(byte b) {
		anInt8462++;
		if (aNode_Sub27_4063.method2691(3) == Class169_Sub4.aClass353_8825) {
			anInt4064 = 2;
		}
		if ((anInt4064 ^ 0xffffffff) > -1 || (anInt4064 ^ 0xffffffff) < -3) {
			anInt4064 = method3677(0);
		}
		if (b >= -35) {
			aBoolean8465 = true;
		}
	}
	
	final int method3677(int i) {
		anInt8468++;
		if (i != 0) {
			method3673((byte) 102);
		}
		return 1;
	}
	
	static final void method3782(boolean bool) {
		anInt8467++;
		Class105.aClass61_5202.method608(bool);
		if (bool != false) {
			method3782(true);
		}
	}
	
	final int method3783(boolean bool) {
		anInt8463++;
		if (bool != false) {
			method3673((byte) -112);
		}
		return anInt4064;
	}
	
	Class320_Sub27(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
}
