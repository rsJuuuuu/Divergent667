/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105 implements Interface10
{
	static int anInt5191;
	private Class98 aClass98_5192;
	static int anInt5193;
	static GLSprite[] aGLSpriteArray5194;
	static int anInt5195;
	private Index aClass302_5196;
	static int anInt5197;
	static int anInt5198;
	static int anInt5199;
	private Index aClass302_5200;
	private Class52 aClass52_5201;
	static Class61 aClass61_5202 = new Class61(4);
	static Object anObject5203;
	static int anInt5204 = 0;
	
	public final void method26(int i) {
		if (i != 99) {
			method1116(54, -63, -111, (byte) 24, -8, -127, false);
		}
		anInt5195++;
		Class357 class357 = Class129.method1553(-1, aClass98_5192.anInt5054, aClass302_5196);
		aClass52_5201 = Class93.aGraphicsToolkit1241.a(class357, Class383.method4199(aClass302_5200, aClass98_5192.anInt5054), true);
	}
	
	static final void method1116(int i, int i_0_, int i_1_, byte b, int i_2_, int i_3_, boolean voice) {
		if ((voice ? Class213.aNode_Sub27_2512.aClass320_Sub25_7276.method3776(false) : Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false)) != 0 && i_0_ != 0 && Class23.anInt434 < 50 && (i ^ 0xffffffff) != 0) {
			Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78(voice ? (byte) 3 : (byte) 2, i, i_0_, i_2_, i_3_, 0, i_1_, null);
		}
		anInt5198++;
	}
	
	static final CacheNode_Sub11 method1117(int i) {
		if (i < 104) {
			aGLSpriteArray5194 = null;
		}
		anInt5193++;
		return Class20.aCacheNode_Sub11_318;
	}
	
	public static void method1118(int i) {
		if (i <= 45) {
			anObject5203 = null;
		}
		aGLSpriteArray5194 = null;
		aClass61_5202 = null;
		anObject5203 = null;
	}
	
	public final void method27(boolean bool, int i) {
		anInt5197++;
		if (bool) {
			int i_6_ = aClass98_5192.aClass379_5066.method4160(-108, Node_Sub38_Sub12.anInt10225, aClass98_5192.anInt5062) + aClass98_5192.anInt5065;
			int i_7_ = aClass98_5192.aClass77_5069.method775(Class257.anInt3244, false, aClass98_5192.anInt5055) + aClass98_5192.anInt5067;
			aClass52_5201.method535(0, null, aClass98_5192.anInt5064, aClass98_5192.aString5057, null, null, i_7_, aClass98_5192.anInt5059, 83, 0, aClass98_5192.anInt5056, i_6_, aClass98_5192.anInt5068, aClass98_5192.anInt5063, aClass98_5192.anInt5062, aClass98_5192.anInt5055);
		}
	}
	
	public final boolean method25(int i) {
		anInt5191++;
		if (i != 421) {
			return true;
		}
		boolean bool = true;
		if (!aClass302_5200.method3510(aClass98_5192.anInt5054, (byte) 63)) {
			bool = false;
		}
		if (!aClass302_5196.method3510(aClass98_5192.anInt5054, (byte) 63)) {
			bool = false;
		}
		return bool;
	}
	
	Class105(Index class302, Index class302_8_, Class98 class98) {
		aClass98_5192 = class98;
		aClass302_5196 = class302_8_;
		aClass302_5200 = class302;
	}
	
	static final void method1119(int i, int i_9_, int i_10_) {
		Class148.anInt1825 = i;
		anInt5199++;
		Animable_Sub1_Sub2.anInt10668 = i_9_;
		if (Class320_Sub20.anInt8397 == 0) {
			CacheNode_Sub15.anInt9589 = Node_Sub23_Sub1.anInt9929 * 2 + Animable_Sub1_Sub2.anInt10668;
			Class303.anInt3831 = Class148.anInt1825 - -(Class372.anInt4600 * 2);
		} else if (Class320_Sub20.anInt8397 == 1) {
			Class117.anInt1479 = Class320_Sub4.anInt8241 + Animable_Sub1_Sub2.anInt10668 / StandardSprite.anInt8946 + 2;
			Class290_Sub11.anInt8181 = 2 + (Class148.anInt1825 / aa_Sub3.anInt5493 + Node_Sub38_Sub21.anInt10315);
			Class303.anInt3831 = Class290_Sub11.anInt8181 * aa_Sub3.anInt5493;
			CacheNode_Sub15.anInt9589 = Class117.anInt1479 * StandardSprite.anInt8946;
			Node_Sub23_Sub1.anInt9929 = -Animable_Sub1_Sub2.anInt10668 + CacheNode_Sub15.anInt9589 >> 1;
			Class372.anInt4600 = Class303.anInt3831 + -Class148.anInt1825 >> 1;
		} else if (Class320_Sub20.anInt8397 == 2) {
			CacheNode_Sub15.anInt9589 = Animable_Sub1_Sub2.anInt10668;
			Class303.anInt3831 = Class148.anInt1825;
		}
		if (i_10_ <= 33) {
			method1117(74);
		}
	}
}
