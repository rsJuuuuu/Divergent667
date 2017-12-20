/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4
{
	static int anInt121;
	static Index index2;
	static long aLong123 = 0L;
	static int anInt124;
	static int anInt125;
	
	public static void method170(int i) {
		if (i != 2) {
			method171((byte) 90, 123, null, null, -116, 86, null, 116);
		}
		index2 = null;
	}
	
	static final void method171(byte b, int i, aa var_aa, GLSprite glsprite, int i_0_, int i_1_, IComponentDefinitions widget, int i_2_) {
		anInt125++;
		if (glsprite != null) {
			int i_3_;
			if (Class320_Sub22.anInt8415 == 4) {
				i_3_ = (int) Node_Sub12.aFloat5450 & 0x3fff;
			} else {
				i_3_ = (int) Node_Sub12.aFloat5450 - -Mobile_Sub1.anInt10960 & 0x3fff;
			}
			int i_4_ = Math.max(widget.anInt4809 / 2, widget.anInt4695 / 2) + 10;
			int i_5_ = i_0_ * i_0_ + i_1_ * i_1_;
			if ((i_4_ * i_4_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
				int i_6_ = Class335.anIntArray4167[i_3_];
				int i_7_ = Class335.anIntArray4165[i_3_];
				if (Class320_Sub22.anInt8415 != 4) {
					i_6_ = 256 * i_6_ / (256 + Node_Sub15_Sub13.anInt9870);
					i_7_ = 256 * i_7_ / (Node_Sub15_Sub13.anInt9870 + 256);
				}
				if (b == -116) {
					int i_8_ = i_7_ * i_1_ + i_6_ * i_0_ >> 14;
					int i_9_ = -(i_1_ * i_6_) + i_0_ * i_7_ >> 14;
					glsprite.method1189(i_8_ + widget.anInt4809 / 2 + (i_2_ + -(glsprite.method1197() / 2)), widget.anInt4695 / 2 + (i - i_9_ + -(glsprite.method1186() / 2)), var_aa, i_2_, i);
				}
			}
		}
	}
	
	static {
		anInt121 = 0;
		anInt124 = 0;
	}
}
