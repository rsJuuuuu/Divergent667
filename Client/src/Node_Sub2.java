/* Node_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub2 extends Node
{
	protected int cliped;
	protected int interfaceId;
	static int anInt6934;
	static GLSprite aGLSprite6935;
	static int anInt6936;
	static int anInt6937 = 0;
	
	static final void method2167(int i) {
		anInt6936++;
		for (int i_0_ = i; (Node_Sub25_Sub3.localNPCsCount ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
			int i_1_ = Class54.LocalNPCsIndexes[i_0_];
			Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) i_1_);
			if (node_sub41 != null) {
				Npc npc = node_sub41.aNpc7518;
				r_Sub2.method2375(false, (byte) -49, npc);
			}
		}
	}
	
	public static void method2168(int i) {
		aGLSprite6935 = null;
		if (i != 0) {
			method2168(13);
		}
	}
}
