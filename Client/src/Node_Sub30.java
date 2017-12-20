/* Node_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub30 extends Node
{
	static int anInt7351;
	protected int anInt7352;
	static int anInt7353;
	protected int anInt7354;
	protected boolean aBoolean7355;
	protected int anInt7356;
	static int anInt7357;
	protected int anInt7358;
	static int anInt7359;
	static OutcommingPacket aClass318_7360 = new OutcommingPacket(20, 8);
	protected int anInt7361;
	static Node_Sub13[] aNode_Sub13Array7362 = new Node_Sub13[300];
	
	static final int method2720(int i, int i_0_, int i_1_) {
		anInt7359++;
		if ((i_0_ ^ 0xffffffff) == -2 || (i_0_ ^ 0xffffffff) == -4) {
			return Node_Sub38_Sub5.anIntArray10131[i & 0x3];
		}
		return Node_Sub29.anIntArray7345[i & 0x3];
	}
	
	static final int method2721(boolean bool, boolean bool_3_) {
		if (bool_3_ != false) {
			aNode_Sub13Array7362 = null;
		}
		anInt7353++;
		if (Class291.anIntArray3665 == null) {
			return 0;
		}
		if (!bool && Node_Sub5_Sub2.aClass49Array9413 != null) {
			return Class291.anIntArray3665.length * 2;
		}
		int i = 0;
		for (int i_4_ = 0; i_4_ < Class291.anIntArray3665.length; i_4_++) {
			int i_5_ = Class291.anIntArray3665[i_4_];
			if (Class294.aClass302_3690.method3510(i_5_, (byte) 63)) {
				i++;
			}
			if (Class188_Sub1.aClass302_6849.method3510(i_5_, (byte) 63)) {
				i++;
			}
		}
		return i;
	}
	
	static final int method2722(int i, IComponentDefinitions widget, int i_6_) {
		anInt7357++;
		if (!Client.method113(widget).method2748((byte) -96, i) && widget.anObjectArray4770 == null) {
			return -1;
		}
		if (i_6_ != 7113) {
			return 116;
		}
		if (widget.anIntArray4863 == null || i >= widget.anIntArray4863.length) {
			return -1;
		}
		return widget.anIntArray4863[i];
	}
	
	static int method2723(int i, int i_7_) {
		return i & i_7_;
	}
	
	public static void method2724(byte b) {
		aClass318_7360 = null;
		aNode_Sub13Array7362 = null;
	}
	
	Node_Sub30(int i, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool) {
		anInt7354 = i_11_;
		anInt7352 = i_8_;
		aBoolean7355 = bool;
		anInt7356 = i_10_;
		anInt7361 = i;
		anInt7358 = i_9_;
	}
}
