/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class60
{
	static int anInt880;
	static int anInt881 = -1;
	static int[][] anIntArrayArray882;
	static float aFloat883;
	static int anInt884;
	
	public static void method593(int i) {
		if (i != 4) {
			method593(60);
		}
		anIntArrayArray882 = null;
	}
	
	static final void method594(int i, int i_0_) {
		anInt884++;
		if (Class213.aNode_Sub27_2512.aClass320_Sub14_7268.method3737(false) == 0) {
			i_0_ = -1;
		}
		if ((i_0_ ^ 0xffffffff) != (Node_Sub38_Sub23.anInt10346 ^ 0xffffffff)) {
			if ((i_0_ ^ 0xffffffff) != 0) {
				Class364 class364 = Class186.aClass239_2249.method3026(33, i_0_);
				Class383 class383 = class364.method4060((byte) 80);
				if (class383 == null) {
					i_0_ = -1;
				} else {
					Class240.aSignLink2946.method3645(class383.method4196(), (byte) 121, class383.method4195(), Node_Sub38_Sub20.aCanvas10309, new Point(class364.anInt4511, class364.anInt4519), class383.method4190());
					Node_Sub38_Sub23.anInt10346 = i_0_;
				}
			}
			if (i != 6) {
				method594(71, 117);
			}
			if (i_0_ == -1 && Node_Sub38_Sub23.anInt10346 != -1) {
				Class240.aSignLink2946.method3645(-1, (byte) -18, null, Node_Sub38_Sub20.aCanvas10309, new Point(), -1);
				Node_Sub38_Sub23.anInt10346 = -1;
			}
		}
	}
	
	static {
		anInt880 = -1;
		anIntArrayArray882 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
	}
}
