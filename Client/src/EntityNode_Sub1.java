/* EntityNode_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EntityNode_Sub1 extends EntityNode
{
	protected int anInt5922;
	protected int anInt5923;
	static int anInt5924;
	protected Actor anActor5925;
	protected int anInt5926;
	static OutcommingPacket aClass318_5927 = new OutcommingPacket(38, -1);
	protected int anInt5928;
	static Node_Sub9_Sub1 aNode_Sub9_Sub1_5929;
	
	public static void method804(boolean bool) {
		aNode_Sub9_Sub1_5929 = null;
		aClass318_5927 = null;
		if (bool != true) {
			aClass318_5927 = null;
		}
	}
	
	EntityNode_Sub1() {
		/* empty */
	}
	
	static final Class253 method805(int i, int i_0_) {
		anInt5924++;
		if (i_0_ != -26296) {
			aNode_Sub9_Sub1_5929 = null;
		}
		if ((i ^ 0xffffffff) > -1 || i >= 100) {
			return null;
		}
		return r_Sub2.aClass253Array11063[i];
	}
}
