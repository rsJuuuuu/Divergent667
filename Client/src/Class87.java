/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87
{
	static boolean removeWalkHere = false;
	protected EntityNode_Sub3 anEntityNode_Sub3_1186 = new EntityNode_Sub3();
	static int anInt1187;
	static int anInt1188;
	static int anInt1189;
	static int anInt1190;
	private EntityNode_Sub3 anEntityNode_Sub3_1191;
	static int anInt1192;
	static int anInt1193;
	
	final void method1011(int i) {
		if (i != 12077) {
			removeWalkHere = true;
		}
		anInt1190++;
		for (;;) {
			EntityNode_Sub3 entitynode_sub3 = anEntityNode_Sub3_1186.anEntityNode_Sub3_5961;
			if (entitynode_sub3 == anEntityNode_Sub3_1186) {
				break;
			}
			entitynode_sub3.method937(true);
		}
		anEntityNode_Sub3_1191 = null;
	}
	
	final void method1012(int i, EntityNode_Sub3 entitynode_sub3) {
		anInt1187++;
		if (i <= 126) {
			method1014(false);
		}
		if (entitynode_sub3.anEntityNode_Sub3_5960 != null) {
			entitynode_sub3.method937(true);
		}
		entitynode_sub3.anEntityNode_Sub3_5961 = anEntityNode_Sub3_1186;
		entitynode_sub3.anEntityNode_Sub3_5960 = anEntityNode_Sub3_1186.anEntityNode_Sub3_5960;
		entitynode_sub3.anEntityNode_Sub3_5960.anEntityNode_Sub3_5961 = entitynode_sub3;
		entitynode_sub3.anEntityNode_Sub3_5961.anEntityNode_Sub3_5960 = entitynode_sub3;
	}
	
	final int method1013(int i) {
		anInt1192++;
		int i_0_ = 0;
		if (i <= 117) {
			anEntityNode_Sub3_1186 = null;
		}
		for (EntityNode_Sub3 entitynode_sub3 = anEntityNode_Sub3_1186.anEntityNode_Sub3_5961; anEntityNode_Sub3_1186 != entitynode_sub3; entitynode_sub3 = entitynode_sub3.anEntityNode_Sub3_5961)
			i_0_++;
		return i_0_;
	}
	
	final EntityNode_Sub3 method1014(boolean bool) {
		anInt1189++;
		EntityNode_Sub3 entitynode_sub3 = anEntityNode_Sub3_1191;
		if (entitynode_sub3 == anEntityNode_Sub3_1186) {
			anEntityNode_Sub3_1191 = null;
			return null;
		}
		anEntityNode_Sub3_1191 = entitynode_sub3.anEntityNode_Sub3_5961;
		if (bool != true) {
			return null;
		}
		return entitynode_sub3;
	}
	
	final EntityNode_Sub3 method1015(int i) {
		if (i != 0) {
			method1015(-105);
		}
		anInt1188++;
		EntityNode_Sub3 entitynode_sub3 = anEntityNode_Sub3_1186.anEntityNode_Sub3_5961;
		if (entitynode_sub3 == anEntityNode_Sub3_1186) {
			anEntityNode_Sub3_1191 = null;
			return null;
		}
		anEntityNode_Sub3_1191 = entitynode_sub3.anEntityNode_Sub3_5961;
		return entitynode_sub3;
	}
	
	public Class87() {
		anEntityNode_Sub3_1186.anEntityNode_Sub3_5961 = anEntityNode_Sub3_1186;
		anEntityNode_Sub3_1186.anEntityNode_Sub3_5960 = anEntityNode_Sub3_1186;
	}
}
