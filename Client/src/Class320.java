/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class320
{
	protected Node_Sub27 aNode_Sub27_4063;
	protected int anInt4064;
	static int anInt4065;
	
	abstract void method3673(byte b);
	
	final void method3674(int i, int i_0_) {
		anInt4065++;
		if (i_0_ != method3675(i, (byte) 54)) {
			method3676(false, i);
		}
	}
	
	abstract int method3675(int i, byte b);
	
	abstract void method3676(boolean bool, int i);
	
	abstract int method3677(int i);
	
	Class320(Node_Sub27 node_sub27) {
		aNode_Sub27_4063 = node_sub27;
		anInt4064 = method3677(0);
	}
	
	Class320(int i, Node_Sub27 node_sub27) {
		anInt4064 = i;
		aNode_Sub27_4063 = node_sub27;
	}
}
