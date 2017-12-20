/* FixedAnimator - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FixedAnimator extends Animator
{
	static int anInt5502;
	static boolean aBoolean5503 = false;
	static int anInt5504;
	static int anInt5505;
	
	final void method222(int i, Class48 class48, byte b) {
		anInt5502++;
		Class262_Sub11.method3178(i, -16777216, class48);
		if (b < 3) {
			method258(true, (byte) -45, false, 69, -8, null, null);
		}
	}
	
	static final boolean method257(Node_Sub4 node_sub4, int i) {
		anInt5504++;
		if (node_sub4 == null) {
			return true;
		}
		Player.aNode_Sub4_11155 = null;
		Class52.anInt800 = i;
		Class10.aClass96_176 = null;
		Class61.aNode_Sub9_Sub1_885 = null;
		if (node_sub4 != Player.aNode_Sub4_11140) {
			Class89.anInt1198 = 0;
			Player.aNode_Sub4_11140 = node_sub4;
		}
		Class93_Sub2.aClass302_6049 = null;
		if ((Class89.anInt1198 ^ 0xffffffff) == -1) {
			Node_Sub21.aClass96_7183 = new Class96(Class51.aClass302_5339, Class320_Sub12.aClass302_8326);
			Class307.aNode_Sub9_Sub1_3902.method2450((byte) 107);
			Class89.anInt1198 = 1;
		}
		if (Class89.anInt1198 == 1) {
			if (!Class307.aNode_Sub9_Sub1_3902.method2467(Node_Sub21.aClass96_7183, Node_Sub38_Sub6.aClass302_10138, -101, 22050, node_sub4)) {
				return false;
			}
			Node_Sub21.aClass96_7183 = null;
			Player.aNode_Sub4_11140 = null;
			Class89.anInt1198 = 0;
		}
		return true;
	}
	
	public FixedAnimator() {
		super(true);
	}
	
	static final void method258(boolean bool, byte b, boolean bool_0_, int i, int i_1_, String string, String string_2_) {
		Class205.index19.anInt3795 = 1;
		anInt5505++;
		string = string.toLowerCase();
		short[] ses = new short[16];
		int i_3_ = -1;
		String string_4_ = null;
		if ((i_1_ ^ 0xffffffff) != 0) {
			Class267 class267 = Class188_Sub2_Sub2.aClass36_9366.method394(i_1_, -119);
			if (class267 == null || !class267.method3287((byte) 112) == bool) {
				return;
			}
			if (class267.method3287((byte) 110)) {
				string_4_ = class267.aString3450;
			} else {
				i_3_ = class267.anInt3443;
			}
		}
		int i_5_ = 0;
		for (int i_6_ = 0; EntityNode_Sub3_Sub1.aClass86_9166.anInt1175 > i_6_; i_6_++) {
			ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_6_, 14434);
			if ((!bool_0_ || itemdefinition.aBoolean1933) && itemdefinition.anInt1857 == -1 && itemdefinition.anInt1852 == -1 && (itemdefinition.anInt1928 ^ 0xffffffff) == 0 && itemdefinition.anInt1877 == 0 && itemdefinition.aString1860.toLowerCase().indexOf(string) != -1) {
				if ((i_1_ ^ 0xffffffff) != 0) {
					if (!bool) {
						if ((i ^ 0xffffffff) != (itemdefinition.method1678(i_1_, i_3_, 10247) ^ 0xffffffff)) {
							continue;
						}
					} else if (!string_2_.equals(itemdefinition.method1684(string_4_, b ^ 0x7f3d, i_1_))) {
						continue;
					}
				}
				if ((i_5_ ^ 0xffffffff) <= -251) {
					Node_Sub20.aShortArray7175 = null;
					Class365_Sub1.anInt8759 = -1;
					return;
				}
				if ((ses.length ^ 0xffffffff) >= (i_5_ ^ 0xffffffff)) {
					short[] ses_7_ = new short[ses.length * 2];
					for (int i_8_ = 0; (i_5_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
						ses_7_[i_8_] = ses[i_8_];
					ses = ses_7_;
				}
				ses[i_5_++] = (short) i_6_;
			}
		}
		Class365_Sub1.anInt8759 = i_5_;
		Animable_Sub1.anInt9096 = 0;
		Node_Sub20.aShortArray7175 = ses;
		String[] strings = new String[Class365_Sub1.anInt8759];
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (Class365_Sub1.anInt8759 ^ 0xffffffff); i_9_++)
			strings[i_9_] = EntityNode_Sub3_Sub1.aClass86_9166.method1010(ses[i_9_], 14434).aString1860;
		Class293.method3461(strings, Node_Sub20.aShortArray7175, 127);
		if (b != -50) {
			method257(null, -79);
		}
		Class205.index19.method3521((byte) -18);
		Class205.index19.anInt3795 = 2;
	}
}
