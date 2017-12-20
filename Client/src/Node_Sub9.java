/* Node_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub9 extends Node
{
	protected Node_Sub9 aNode_Sub9_7072;
	protected int anInt7073;
	volatile boolean aBoolean7074 = true;
	protected Node_Sub45 aNode_Sub45_7075;
	
	abstract void method2426(int i);
	
	abstract void method2427(int[] is, int i, int i_0_);
	
	abstract int method2428();
	
	abstract Node_Sub9 method2429();
	
	final void method2430(int[] is, int i, int i_1_) {
		if (aBoolean7074) {
			method2427(is, i, i_1_);
		} else {
			method2426(i_1_);
		}
	}
	
	abstract Node_Sub9 method2431();
	
	int method2432() {
		return 255;
	}
	
	public Node_Sub9() {
		/* empty */
	}
}
