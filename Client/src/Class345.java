/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class345
{
	protected float[][] aFloatArrayArray4265;
	protected int[] anIntArray4266;
	static Class151 aClass151_4267 = new Class151(7, 0, 1, 1);
	protected int[] anIntArray4268;
	static int anInt4269;
	static int anInt4270 = 1;
	static int anInt4271;
	protected int[] anIntArray4272;
	
	public static void method3970(int i) {
		if (i != 1) {
			anInt4270 = 13;
		}
		aClass151_4267 = null;
	}
	
	static final void method3971(Index class302, int i, boolean bool, Index class302_0_) {
		if (bool == true) {
			Node_Sub15_Sub11.aClass302_9859 = class302_0_;
			Class145.aClass302_1799 = class302;
			anInt4269++;
		}
	}
	
	static final EntityNode_Sub6 method3972(boolean bool, byte b, int i) {
		anInt4271++;
		synchronized (Class30.aClass103Array494) {
			int i_1_ = -111 % ((b - 16) / 39);
			EntityNode_Sub6 entitynode_sub6;
			if ((Class30.aClass103Array494.length ^ 0xffffffff) >= (i ^ 0xffffffff) || Class30.aClass103Array494[i].method1105(-92)) {
				entitynode_sub6 = new EntityNode_Sub6();
				entitynode_sub6.anEntityNode_Sub5Array5995 = new EntityNode_Sub5[i];
				for (int i_2_ = 0; i_2_ < i; i_2_++)
					entitynode_sub6.anEntityNode_Sub5Array5995[i_2_] = new EntityNode_Sub5();
			} else {
				entitynode_sub6 = (EntityNode_Sub6) Class30.aClass103Array494[i].method1111(-89);
				entitynode_sub6.method803(false);
				Class89.anIntArray1195[i]--;
			}
			entitynode_sub6.aBoolean5994 = bool;
			return entitynode_sub6;
		}
	}
	
	Class345(int[] is, int[] is_3_, int[] is_4_, float[][] fs) {
		anIntArray4268 = is;
		aFloatArrayArray4265 = fs;
		anIntArray4272 = is_3_;
		anIntArray4266 = is_4_;
	}
}
