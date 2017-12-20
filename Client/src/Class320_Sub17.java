/* Class320_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub17 extends Class320
{
	static int anInt8366;
	static int anInt8367;
	static IncommingPacket aClass192_8368 = new IncommingPacket(135, 0);
	static int anInt8369;
	static int anInt8370;
	static int anInt8371;
	static int anInt8372;
	
	Class320_Sub17(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	public static void method3745(int i) {
		if (i == -7789) {
			aClass192_8368 = null;
		}
	}
	
	Class320_Sub17(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		anInt4064 = i;
		anInt8367++;
		if (bool != false) {
			aClass192_8368 = null;
		}
	}
	
	final int method3677(int i) {
		anInt8370++;
		if (i != 0) {
			return 105;
		}
		return 1;
	}
	
	static final void method3746(int i, int i_0_, int i_1_, int i_2_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_];
		if (class261 != null) {
			Animable_Sub4 animable_sub4 = class261.anAnimable_Sub4_3315;
			Animable_Sub4 animable_sub4_3_ = class261.anAnimable_Sub4_3319;
			if (animable_sub4 != null) {
				animable_sub4.aShort9145 = (short) (animable_sub4.aShort9145 * i_2_ / (16 << Class36.anInt549 - 7));
				animable_sub4.aShort9147 = (short) (animable_sub4.aShort9147 * i_2_ / (16 << Class36.anInt549 - 7));
			}
			if (animable_sub4_3_ != null) {
				animable_sub4_3_.aShort9145 = (short) (animable_sub4_3_.aShort9145 * i_2_ / (16 << Class36.anInt549 - 7));
				animable_sub4_3_.aShort9147 = (short) (animable_sub4_3_.aShort9147 * i_2_ / (16 << Class36.anInt549 - 7));
			}
		}
	}
	
	final void method3673(byte b) {
		if (b > -35) {
			aClass192_8368 = null;
		}
		if (anInt4064 != 1 && anInt4064 != 0) {
			anInt4064 = method3677(0);
		}
		anInt8366++;
	}
	
	final int method3747(boolean bool) {
		if (bool != false) {
			method3677(-39);
		}
		anInt8369++;
		return anInt4064;
	}
	
	final int method3675(int i, byte b) {
		anInt8372++;
		if (b != 54) {
			aClass192_8368 = null;
		}
		return 1;
	}
}
