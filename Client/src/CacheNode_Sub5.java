/* CacheNode_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub5 extends CacheNode
{
	static int anInt9467;
	protected int anInt9468;
	static int anInt9469;
	protected int anInt9470;
	protected int anInt9471;
	protected int anInt9472;
	protected Class249 aClass249_9473;
	static int anInt9474;
	protected int anInt9475;
	protected Class218 aClass218_9476;
	static Index aClass302_9477;
	
	static final boolean method2307(int i, int i_0_, int i_1_) {
		anInt9469++;
		if ((i_0_ & i_1_ ^ 0xffffffff) != -1 | Class73.method749((byte) -65, i_1_, i) || FloatBuffer.method2248(i_1_, i, 51)) {
			return true;
		}
        return !((0x37 & i) != 0 || !Class110.method1135(i_1_, i, false));
    }
	
	static final Class169_Sub2_Sub1 method2308(GLToolkit gltoolkit, int i, int i_2_, boolean bool, int i_3_, int[] is, int i_4_, int i_5_) {
		anInt9474++;
		if (i != 25448) {
			return null;
		}
		if (!gltoolkit.aBoolean6652 && (!Class371.method4094(i_2_, false) || !Class371.method4094(i_4_, false))) {
			if (gltoolkit.aBoolean6649) {
				return new Class169_Sub2_Sub1(gltoolkit, 34037, i_2_, i_4_, bool, is, i_3_, i_5_);
			}
			return new Class169_Sub2_Sub1(gltoolkit, i_2_, i_4_, Class320_Sub19.method3753(i_2_, -729073628), Class320_Sub19.method3753(i_4_, i ^ ~0x2b74a4b3), is);
		}
		return new Class169_Sub2_Sub1(gltoolkit, 3553, i_2_, i_4_, bool, is, i_3_, i_5_);
	}
	
	final void method2309(byte b) {
		anInt9475 = aClass218_9476.anInt2559;
		anInt9471 = aClass218_9476.anInt2557;
		anInt9468 = aClass218_9476.anInt2556;
		anInt9467++;
		if (aClass218_9476.aClass336_2562 != null) {
			aClass218_9476.aClass336_2562.method3867(aClass249_9473.anInt3157, aClass249_9473.anInt3166, aClass249_9473.anInt3150, Node_Sub38.anIntArray7457);
		}
		if (b >= 85) {
			anInt9470 = Node_Sub38.anIntArray7457[2];
			anInt9472 = Node_Sub38.anIntArray7457[0];
		}
	}
	
	public static void method2310(boolean bool) {
		aClass302_9477 = null;
		if (bool != true) {
			method2310(false);
		}
	}
	
	CacheNode_Sub5(Class218 class218, EntityNode_Sub4 entitynode_sub4) {
		aClass218_9476 = class218;
		aClass249_9473 = aClass218_9476.method2075((byte) -57);
		method2309((byte) 92);
	}
}
