/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148
{
	static int anInt1825;
	static int anInt1826;
	static Index aClass302_1827;
	static int anInt1828;
	
	static final void method1650(int i, EntityNode_Sub6 entitynode_sub6) {
		entitynode_sub6.anAnimable5990 = null;
		anInt1828++;
		int i_0_ = entitynode_sub6.anEntityNode_Sub5Array5995.length;
		for (int i_1_ = i; i_1_ < i_0_; i_1_++)
			entitynode_sub6.anEntityNode_Sub5Array5995[i_1_].aBoolean5987 = false;
		synchronized (Class30.aClass103Array494) {
			if (i_0_ < Class30.aClass103Array494.length && (Class89.anIntArray1195[i_0_] ^ 0xffffffff) > -201) {
				Class30.aClass103Array494[i_0_].method1110(false, entitynode_sub6);
				Class89.anIntArray1195[i_0_]++;
			}
		}
	}
	
	public static void method1651(int i) {
		if (i >= 86) {
			aClass302_1827 = null;
		}
	}
}
