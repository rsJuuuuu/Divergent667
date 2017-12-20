/* Node_Sub50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub50 extends Node
{
	static int anInt7623;
	protected int anInt7624;
	static int anInt7625;
	protected int anInt7626;
	static int anInt7627;
	
	static final void method2966(String string, String string_0_, int i, String string_1_, String string_2_, boolean bool, int i_3_, String string_4_, int i_5_) {
		////System.out.print(""+string+", "+string_0_+", "+string_1_+", "+string_2_+", "+string_4_+"\n");
		if(string.contains("<euro>") || string_1_.contains("<euro>")) {
			return;
		}
		anInt7627++;
		Class253 class253 = r_Sub2.aClass253Array11063[99];
		for (int i_6_ = 99; (i_6_ ^ 0xffffffff) < -1; i_6_--)
			r_Sub2.aClass253Array11063[i_6_] = r_Sub2.aClass253Array11063[-1 + i_6_];
		if (class253 == null) {
			class253 = new Class253(i_5_, i_3_, string_0_, string, string_4_, string_2_, i, string_1_);
		} else {
			class253.method3104(i, i_3_, string_0_, string_1_, i_5_, string, false, string_2_, string_4_);
		}
		r_Sub2.aClass253Array11063[0] = class253;
		if (bool == false) {
			Class381.anInt4894 = Class345.anInt4270;
			Class336_Sub2.anInt8581++;
		}
	}
		
	Node_Sub50(int i, int i_7_) {
		anInt7626 = i_7_;
		anInt7624 = i;
	}
}
