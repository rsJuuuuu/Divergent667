/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class366
{
	static Class279 aClass279_4526;
	static Class56 aClass56_4527 = new Class56();
	static long aLong4528;
	static SeekableFile aSeekableFile4529;
	static int anInt4530;
	static int anInt4531;
	
	static final void method4071(int i, int i_0_) {
		if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -3) {
			i = 0;
		}
		anInt4530++;
		Node_Sub39.anInt7498 = i;
		Class48.anEntityNode_Sub4Array694 = new EntityNode_Sub4[1 + Class107.anIntArray1359[Node_Sub39.anInt7498]];
		Class158.anInt1994 = 0;
		Node_Sub28.anInt7327 = 0;
		if (i_0_ <= 49) {
			aClass279_4526 = null;
		}
	}
	
	public static void method4072(boolean bool) {
		if (bool != true) {
			method4071(107, -126);
		}
		aClass56_4527 = null;
		aSeekableFile4529 = null;
		aClass279_4526 = null;
	}
	
	static final String method4073(boolean bool) {
		anInt4531++;
		if (bool != false) {
			method4072(true);
		}
		if (Class213.aBoolean2510 || Node_Sub38_Sub23.aCacheNode_Sub13_10343 == null) {
			return "";
		}
		return Node_Sub38_Sub23.aCacheNode_Sub13_10343.aString9560;
	}
}
