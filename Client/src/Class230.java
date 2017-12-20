/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class230 implements Interface10
{
	static int anInt5205;
	static int anInt5206;
	static int anInt5207;
	static Class42 aClass42_5208;
	static int anInt5209;
	static int anInt5210 = 0;
	protected GLSprite aGLSprite5211;
	private Index aClass302_5212;
	protected Class235 aClass235_5213;
	static boolean aBoolean5214;
	static int anInt5215;
	static int anInt5216;
	static boolean aBoolean5217;
	static int anInt5218;
	
	static final void method2127(byte b, String string) {
		anInt5216++;
		System.exit(1);
		if (b != 7) {
			anInt5209 = -94;
		}
	}
	
	static final boolean method2128(int i, int i_0_, byte b, int i_1_, int i_2_, int i_3_) {
		anInt5218++;
		for (int i_4_ = i_1_; i_4_ <= i; i_4_++) {
			for (int i_5_ = i_2_; i_5_ <= i_0_; i_5_++) {
				if (Node_Sub38_Sub16.anIntArrayArray10269[i_4_][i_5_] == i_3_ && (Class79.anIntArrayArray1070[i_4_][i_5_] ^ 0xffffffff) >= -2) {
					return true;
				}
			}
		}
		return false;
	}
	
	static final Node_Sub9_Sub1 method2129(byte b) {
		if (b > -60) {
			anInt5209 = -61;
		}
		anInt5215++;
		return Class307.aNode_Sub9_Sub1_3902;
	}
	
	public final void method26(int i) {
		aGLSprite5211 = Node_Sub9_Sub4.method2523((byte) 117, aClass235_5213.anInt5125, aClass302_5212);
		anInt5207++;
		if (i != 99) {
			anInt5210 = -31;
		}
	}
	
	Class230(Index class302, Class235 class235) {
		aClass235_5213 = class235;
		aClass302_5212 = class302;
	}
	
	public static void method2130(byte b) {
		aClass42_5208 = null;
		if (b != -33) {
			aClass42_5208 = null;
		}
	}
	
	public void method27(boolean bool, int i) {
		anInt5206++;
		if (bool) {
			int i_7_ = aClass235_5213.aClass379_5118.method4160(-107, Node_Sub38_Sub12.anInt10225, aGLSprite5211.method1197()) + aClass235_5213.anInt5124;
			int i_8_ = aClass235_5213.aClass77_5123.method775(Class257.anInt3244, false, aGLSprite5211.method1186()) - -aClass235_5213.anInt5116;
			aGLSprite5211.setPosition(i_7_, i_8_);
		}
	}
	
	public final boolean method25(int i) {
		if (i != 421) {
			return false;
		}
		anInt5205++;
		return aClass302_5212.method3510(aClass235_5213.anInt5125, (byte) 63);
	}
	
	static {
		anInt5209 = -1;
		aBoolean5214 = true;
		aBoolean5217 = false;
	}
}
