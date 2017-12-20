/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class130
{
	static Class312 aClass312_1670 = new Class312();
	static int anInt1671;
	static int anInt1672;
	
	static final void method1557(byte b, Index class302, GraphicsToolkit graphicstoolkit) {
		anInt1671++;
		Class383[] class383s = Class383.method4187(class302, Class89.anInt1197, 0);
		Class320_Sub5.aGLSpriteArray8254 = new GLSprite[class383s.length];
		for (int i = 0; (i ^ 0xffffffff) > (class383s.length ^ 0xffffffff); i++)
			Class320_Sub5.aGLSpriteArray8254[i] = graphicstoolkit.a(class383s[i], true);
		class383s = Class383.method4187(class302, Node_Sub38_Sub20.anInt10313, 0);
		Class24.aGLSpriteArray443 = new GLSprite[class383s.length];
		for (int i = 0; (class383s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			Class24.aGLSpriteArray443[i] = graphicstoolkit.a(class383s[i], true);
		class383s = Class383.method4187(class302, Class41.anInt626, 0);
		Class238.aGLSpriteArray2912 = new GLSprite[class383s.length];
		for (int i = 0; (class383s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			Class238.aGLSpriteArray2912[i] = graphicstoolkit.a(class383s[i], true);
		class383s = Class383.method4187(class302, Class162.anInt2004, 0);
		@SuppressWarnings("unused")
		int i = 108 % ((b - -57) / 55);
		ReferenceTable.aGLSpriteArray284 = new GLSprite[class383s.length];
		for (int i_0_ = 0; i_0_ < class383s.length; i_0_++)
			ReferenceTable.aGLSpriteArray284[i_0_] = graphicstoolkit.a(class383s[i_0_], true);
		class383s = Class383.method4187(class302, Class347.anInt4281, 0);
		Class19.aGLSpriteArray312 = new GLSprite[class383s.length];
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (class383s.length ^ 0xffffffff); i_1_++)
			Class19.aGLSpriteArray312[i_1_] = graphicstoolkit.a(class383s[i_1_], true);
		class383s = Class383.method4187(class302, Node_Sub9_Sub5.anInt9767, 0);
		Class101.aGLSpriteArray1301 = new GLSprite[class383s.length];
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (class383s.length ^ 0xffffffff); i_2_++)
			Class101.aGLSpriteArray1301[i_2_] = graphicstoolkit.a(class383s[i_2_], true);
		class383s = Class383.method4187(class302, Class169_Sub1.anInt8787, 0);
		Node_Sub53.aGLSpriteArray7666 = new GLSprite[class383s.length];
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (class383s.length ^ 0xffffffff); i_3_++)
			Node_Sub53.aGLSpriteArray7666[i_3_] = graphicstoolkit.a(class383s[i_3_], true);
		class383s = Class383.method4187(class302, Node_Sub21.anInt7186, 0);
		Node_Sub15_Sub7.aGLSpriteArray9828 = new GLSprite[class383s.length];
		for (int i_4_ = 0; (class383s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
			Node_Sub15_Sub7.aGLSpriteArray9828[i_4_] = graphicstoolkit.a(class383s[i_4_], true);
		class383s = Class383.method4187(class302, OutcommingPacket.anInt4045, 0);
		Node_Sub38_Sub24.aGLSpriteArray10356 = new GLSprite[class383s.length];
		for (int i_5_ = 0; i_5_ < class383s.length; i_5_++)
			Node_Sub38_Sub24.aGLSpriteArray10356[i_5_] = graphicstoolkit.a(class383s[i_5_], true);
		class383s = Class383.method4187(class302, Class163.anInt2019, 0);
		Class156.aGLSpriteArray1969 = new GLSprite[class383s.length];
		for (int i_6_ = 0; i_6_ < class383s.length; i_6_++)
			Class156.aGLSpriteArray1969[i_6_] = graphicstoolkit.a(class383s[i_6_], true);
		class383s = Class383.method4187(class302, Class289.anInt3645, 0);
		Node_Sub52.aGLSpriteArray7655 = new GLSprite[class383s.length];
		for (int i_7_ = 0; class383s.length > i_7_; i_7_++)
			Node_Sub52.aGLSpriteArray7655[i_7_] = graphicstoolkit.a(class383s[i_7_], true);
		Class10.aGLSprite173 = graphicstoolkit.a(Class383.method4194(class302, Node_Sub38_Sub32.anInt10436, 0), true);
		Class274.aGLSprite4981 = graphicstoolkit.a(Class383.method4194(class302, Class153.anInt1943, 0), true);
		class383s = Class383.method4187(class302, CacheNode_Sub18.anInt9603, 0);
		Class150_Sub3.aGLSpriteArray8973 = new GLSprite[class383s.length];
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (class383s.length ^ 0xffffffff); i_8_++)
			Class150_Sub3.aGLSpriteArray8973[i_8_] = graphicstoolkit.a(class383s[i_8_], true);
	}
	
	public static void method1558(int i) {
		aClass312_1670 = null;
		if (i != -4800) {
			method1557((byte) -117, null, null);
		}
	}
	
	static final int method1559(int i, int i_9_) {
		anInt1672++;
		int i_10_ = i_9_ & 0x3f;
		int i_11_ = (i_9_ & 0xed) >> 6;
		if (i_10_ == 18) {
			if ((i_11_ ^ 0xffffffff) == -1) {
				return 1;
			}
			if ((i_11_ ^ 0xffffffff) == -2) {
				return 2;
			}
			if (i_11_ == 2) {
				return 4;
			}
			if (i_11_ == 3) {
				return 8;
			}
		} else if (i_10_ == 19 || i_10_ == 21) {
			if (i_11_ == 0) {
				return 16;
			}
			if ((i_11_ ^ 0xffffffff) == -2) {
				return 32;
			}
			if (i_11_ == 2) {
				return 64;
			}
			if ((i_11_ ^ 0xffffffff) == -4) {
				return 128;
			}
		}
		if (i >= -122) {
			return -48;
		}
		return 0;
	}
}
