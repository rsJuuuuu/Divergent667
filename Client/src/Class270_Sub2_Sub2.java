/* Class270_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class270_Sub2_Sub2 extends Class270_Sub2
{
	private int anInt10550;
	static int anInt10551;
	static HashTable aHashTable10552;
	private int anInt10553;
	private GLToolkit aGLToolkit10554;
	private int anInt10555;
	private Class169_Sub1 aClass169_Sub1_10556;
	static int anInt10557;
	static int anInt10558 = 0;
	private int anInt10559;
	private int anInt10560;
	private int anInt10561;
	
	static final void method3309(Animable animable, Node_Sub29[] node_sub29s) {
		if (Class239.aBoolean2932) {
			int i = animable.method819(node_sub29s, 1);
			CacheNode_Sub18.aGraphicsToolkit9607.a(i, node_sub29s);
		}
		if (Class368.aPlaneArray4548 == Class320_Sub10.aPlaneArray8300) {
			int i;
			int i_1_;
			if (animable instanceof Mobile) {
				i = ((Mobile) animable).aShort9119;
				i_1_ = ((Mobile) animable).aShort9120;
			} else {
				i = animable.anInt5934 >> Class36.anInt549;
				i_1_ = animable.anInt5940 >> Class36.anInt549;
			}
			CacheNode_Sub18.aGraphicsToolkit9607.EA(Node_Sub38_Sub37.aPlaneArray10466[0].method3260(animable.anInt5940, -123, animable.anInt5934), Class320_Sub2.method3684(i, i_1_), Class184.method1844(i, i_1_), Class117_Sub2.method1172(i, i_1_));
		}
		EntityNode_Sub6 entitynode_sub6 = animable.method807(-99, CacheNode_Sub18.aGraphicsToolkit9607);
		if (entitynode_sub6 != null) {
			if (animable.aBoolean5945) {
				EntityNode_Sub5[] entitynode_sub5s = entitynode_sub6.anEntityNode_Sub5Array5995;
				for (int i = 0; i < entitynode_sub5s.length; i++) {
					EntityNode_Sub5 entitynode_sub5 = entitynode_sub5s[i];
					if (entitynode_sub5.aBoolean5987) {
						Class362.method4053(entitynode_sub5.anInt5986 - entitynode_sub5.anInt5983, entitynode_sub5.anInt5984 + entitynode_sub5.anInt5983, entitynode_sub5.anInt5985 - entitynode_sub5.anInt5983, (byte) -54, entitynode_sub5.anInt5982 + entitynode_sub5.anInt5983);
					}
				}
			}
			if (entitynode_sub6.aBoolean5994) {
				entitynode_sub6.anAnimable5990 = animable;
				if (Class188_Sub2.aBoolean6868) {
					synchronized (Node_Sub36_Sub3.aClass179_10058) {
						Node_Sub36_Sub3.aClass179_10058.method1813(0, entitynode_sub6);
					}
				} else {
					Node_Sub36_Sub3.aClass179_10058.method1813(0, entitynode_sub6);
				}
			} else {
				Class148.method1650(0, entitynode_sub6);
			}
		}
	}
	
	final Class169_Sub1 method3304(boolean bool) {
		anInt10551++;
		if (aClass169_Sub1_10556 == null) {
			Class188_Sub1_Sub1.anIntArray9330[0] = anInt10560;
			Class188_Sub1_Sub1.anIntArray9330[2] = anInt10550;
			Class188_Sub1_Sub1.anIntArray9330[3] = anInt10555;
			Class188_Sub1_Sub1.anIntArray9330[5] = anInt10561;
			Class188_Sub1_Sub1.anIntArray9330[4] = anInt10553;
			d var_d = aGLToolkit10554.aD1543;
			Class188_Sub1_Sub1.anIntArray9330[1] = anInt10559;
			boolean bool_2_ = false;
			int i = 0;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -7; i_3_++) {
				if (!var_d.method7(9900, Class188_Sub1_Sub1.anIntArray9330[i_3_])) {
					return null;
				}
				Class91 class91 = var_d.method10(Class188_Sub1_Sub1.anIntArray9330[i_3_], -8217);
				int i_4_ = !class91.aBoolean1204 ? 128 : 64;
				if (class91.aByte1207 > 0) {
					bool_2_ = true;
				}
				if ((i ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
					i = i_4_;
				}
			}
			for (int i_5_ = 0; i_5_ < 6; i_5_++)
				Class162.anIntArrayArray2005[i_5_] = var_d.method11(i, false, i, Class188_Sub1_Sub1.anIntArray9330[i_5_], (byte) 0, 1.0F);
			aClass169_Sub1_10556 = new Class169_Sub1(aGLToolkit10554, 6407, i, bool_2_, Class162.anIntArrayArray2005);
		}
		if (bool != true) {
			return null;
		}
		return aClass169_Sub1_10556;
	}
	
	public static void method3310(int i) {
		aHashTable10552 = null;
	}
	
	Class270_Sub2_Sub2(GLToolkit gltoolkit, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		anInt10550 = i_8_;
		anInt10559 = i_7_;
		anInt10555 = i_9_;
		aGLToolkit10554 = gltoolkit;
		anInt10561 = i_11_;
		anInt10560 = i;
		anInt10553 = i_10_;
	}
	
	static {
		aHashTable10552 = new HashTable(16);
	}
}
