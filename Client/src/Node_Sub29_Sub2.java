/* Node_Sub29_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub29_Sub2 extends Node_Sub29
{
	static int anInt10015 = 0;
	static int anInt10016;
	static int anInt10017;
	static int anInt10018;
	static int anInt10019;
	static int anInt10020;
	
	static final int method2714(int i) {
		if (i >= -52) {
			method2715((byte) -40, false, 64);
		}
		anInt10020++;
		if (Class320_Sub20.anInt8397 == 1) {
			return CacheNode_Sub15.anInt9589;
		}
		return Animable_Sub1_Sub2.anInt10668;
	}
	
	static final String method2715(byte b, boolean bool, int i) {
		anInt10018++;
		if (!bool || i < 0) {
			return Integer.toString(i);
		}
		if (b != 9) {
			method2716(-104, -31);
		}
		return Node_Sub38_Sub7.method2811(false, i, 10, bool);
	}
	
	Node_Sub29_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		super(i, i_0_, i_1_, i_2_, i_3_, f);
	}
	
	final void method2706(int i, int i_4_, int i_5_, int i_6_) {
		if (i != 4752) {
			method2716(61, -81);
		}
		anInt10019++;
		anInt7340 = i_5_;
		anInt7342 = i_4_;
		anInt7346 = i_6_;
	}
	
	static final int method2716(int i, int i_7_) {
		anInt10016++;
		if (i != 0) {
			anInt10015 = -93;
		}
		return i_7_ >>> 8;
	}
	
	final void method2712(byte b, float f) {
		anInt10017++;
		aFloat7339 = f;
		if (b < 55) {
			method2715((byte) -30, true, -18);
		}
	}
}
