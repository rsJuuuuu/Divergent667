/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40
{
	static int anInt618;
	static int anInt619;
	static int anInt620;
	static GLSprite aGLSprite621;
	
	public static void method431(int i) {
		aGLSprite621 = null;
		if (i <= 70) {
			method431(-113);
		}
	}
	
	static final void method432(int i, int i_0_, int i_1_, int i_2_) {
		anInt619++;
		i = i * Class213.aNode_Sub27_2512.aClass320_Sub25_7274.method3776(false) >> 8;
		if ((i_1_ ^ 0xffffffff) != 0 || Class377_Sub1.aBoolean8775) {
			if ((i_1_ ^ 0xffffffff) != 0 && ((Class313.anInt4013 ^ 0xffffffff) != (i_1_ ^ 0xffffffff) || !Class36.method390(-122)) && (i ^ 0xffffffff) != -1 && !Class377_Sub1.aBoolean8775) {
				CacheNode_Sub14_Sub2.method2354(SeekableFile.index6, i, false, 0, i_1_, i_2_, false);
				EntityNode_Sub7.method979(17285);
			}
		} else {
			Class320_Sub2.method3685(-118);
		}
		if ((Class313.anInt4013 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
			EntityNode_Sub1.aNode_Sub9_Sub1_5929 = null;
		}
		if (i_0_ <= 112) {
			method432(-89, 11, 106, 125);
		}
		Class313.anInt4013 = i_1_;
	}
}
