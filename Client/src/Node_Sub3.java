/* Node_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub3 extends Node
{
	static int anInt6938;
	static int anInt6939;
	static int anInt6940;
	protected int anInt6941;
	protected boolean aBoolean6942;
	protected Class189_Sub1 aClass189_Sub1_6943;
	static int anInt6944;
	protected boolean aBoolean6945;
	protected boolean aBoolean6946;
	protected int anInt6947;
	static boolean aBoolean6948 = false;
	protected boolean aBoolean6949;
	
	static final IComponentDefinitions method2169(int i, int i_0_, int i_1_) {
		anInt6940++;
		if (i != -101) {
			method2171(-24, 50, (byte) 32, null, 92, -119, -58);
		}
		IComponentDefinitions widget = Class76.method771((byte) 107, i_1_);
		if ((i_0_ ^ 0xffffffff) == 0) {
			return widget;
		}
		if (widget == null || widget.aWidgetArray4804 == null || (i_0_ ^ 0xffffffff) <= (widget.aWidgetArray4804.length ^ 0xffffffff)) {
			return null;
		}
		return widget.aWidgetArray4804[i_0_];
	}
	
	static final void method2170(int i, long[] ls, int[] is) {
		Class125.method1530((byte) -114, -1 + ls.length, is, ls, 0);
		anInt6938++;
		@SuppressWarnings("unused")
		int i_2_ = -117 / ((64 - i) / 43);
	}
	
	Node_Sub3(int i, Class189_Sub1 class189_sub1, int i_3_, boolean bool) {
		aBoolean6945 = bool;
		anInt6947 = i;
		aClass189_Sub1_6943 = class189_sub1;
		anInt6941 = i_3_;
	}
	
	static final boolean method2171(int i, int i_4_, byte b, Class171 class171, int i_5_, int i_6_, int i_7_) {
		anInt6939++;
		if (!Class12.aBoolean194 || !Mobile_Sub1.aBoolean10959) {
			return false;
		}
		if (b >= -124) {
			method2171(-69, -122, (byte) -82, null, -41, 6, 98);
		}
		if ((Class233.anInt2786 ^ 0xffffffff) > -101) {
			return false;
		}
		if (i_6_ == i_4_ && (i_5_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
			if (!Class313.method3649(true, i, i_7_, i_6_)) {
				return false;
			}
			if (Animable_Sub2.method835(class171, (byte) 93)) {
				Class187.anInt2267++;
				return true;
			}
			return false;
		}
		for (int i_8_ = i_6_; i_8_ <= i_4_; i_8_++) {
			for (int i_9_ = i; (i_5_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff); i_9_++) {
				if (Class240.anIntArrayArrayArray2948[i_7_][i_8_][i_9_] == -Class359.anInt4465) {
					return false;
				}
			}
		}
		if (!Animable_Sub2.method835(class171, (byte) 94)) {
			return false;
		}
		Class187.anInt2267++;
		return true;
	}
	
	static final String method2172(byte b, BufferedStream buffer) {
		anInt6944++;
		if (b != -72) {
			return null;
		}
		return Class207.method2040(buffer, 32767, -24709);
	}
}
