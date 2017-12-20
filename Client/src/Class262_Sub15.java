/* Class262_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class262_Sub15 extends Class262
{
	protected int anInt7815;
	static int anInt7816;
	static Animable[] anAnimableArray7817;
	protected int anInt7818;
	static int anInt7819;
	protected int anInt7820;
	static int[] anIntArray7821 = new int[32];
	
	Class262_Sub15(BufferedStream buffer) {
		super(buffer);
		anInt7818 = buffer.readUnsignedShort();
		anInt7815 = buffer.readUnsignedShort();
		anInt7820 = buffer.readUnsignedByte();
	}
	
	static final void method3188(int i) {
		anInt7816++;
		Class213.aNode_Sub27_2512.method2690(i + -18849, 1, Class213.aNode_Sub27_2512.aClass320_Sub19_7277);
		Class213.aNode_Sub27_2512.method2690(29, 1, Class213.aNode_Sub27_2512.aClass320_Sub19_7301);
		Class213.aNode_Sub27_2512.method2690(i + -18835, 2, Class213.aNode_Sub27_2512.aClass320_Sub4_7302);
		Class213.aNode_Sub27_2512.method2690(24, 2, Class213.aNode_Sub27_2512.aClass320_Sub4_7304);
		Class213.aNode_Sub27_2512.method2690(124, 1, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
		Class213.aNode_Sub27_2512.method2690(74, 1, Class213.aNode_Sub27_2512.aClass320_Sub23_7290);
		Class213.aNode_Sub27_2512.method2690(49, 1, Class213.aNode_Sub27_2512.aClass320_Sub27_7266);
		Class213.aNode_Sub27_2512.method2690(33, 1, Class213.aNode_Sub27_2512.aClass320_Sub8_7280);
		Class213.aNode_Sub27_2512.method2690(106, 1, Class213.aNode_Sub27_2512.aClass320_Sub7_7308);
		Class213.aNode_Sub27_2512.method2690(45, 1, Class213.aNode_Sub27_2512.aClass320_Sub30_7275);
		Class213.aNode_Sub27_2512.method2690(124, 2, Class213.aNode_Sub27_2512.aClass320_Sub12_7282);
		Class213.aNode_Sub27_2512.method2690(29, 1, Class213.aNode_Sub27_2512.aClass320_Sub24_7317);
		if (i != 18896) {
			method3189(-0.07388028F, -0.37611273F, -3.4285033F, 4, -5, 83, -82, -43);
		}
		Class213.aNode_Sub27_2512.method2690(124, 2, Class213.aNode_Sub27_2512.aClass320_Sub26_7269);
		Class213.aNode_Sub27_2512.method2690(34, 1, Class213.aNode_Sub27_2512.aClass320_Sub16_7316);
		Class213.aNode_Sub27_2512.method2690(86, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7284);
		Class213.aNode_Sub27_2512.method2690(85, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7283);
		Class213.aNode_Sub27_2512.method2690(28, 2, Class213.aNode_Sub27_2512.aClass320_Sub28_7305);
		Class213.aNode_Sub27_2512.method2690(107, 0, Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
		Class213.aNode_Sub27_2512.method2690(113, 0, Class213.aNode_Sub27_2512.aClass320_Sub20_7306);
		Class213.aNode_Sub27_2512.method2690(55, 1, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
		Class204.method2030((byte) 125);
		Class213.aNode_Sub27_2512.method2690(55, 0, Class213.aNode_Sub27_2512.aClass320_Sub18_7303);
		Class213.aNode_Sub27_2512.method2690(47, 4, Class213.aNode_Sub27_2512.aClass320_Sub15_7273);
		Class320_Sub12.method3728(0);
		Class120.method1228(-106);
		Class152.aBoolean1942 = true;
	}
	
	static final float[] method3189(float f, float f_0_, float f_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt7819++;
		float[] fs = new float[9];
		float[] fs_6_ = new float[9];
		float f_7_ = (float) Math.cos((double) ((float) i_4_ * 0.024543693F));
		float f_8_ = (float) Math.sin((double) ((float) i_4_ * 0.024543693F));
		float f_9_ = -f_7_ + 1.0F;
		fs[5] = 0.0F;
		fs[2] = f_8_;
		fs[6] = -f_8_;
		fs[7] = 0.0F;
		fs[3] = 0.0F;
		fs[8] = f_7_;
		fs[4] = 1.0F;
		fs[0] = f_7_;
		fs[1] = 0.0F;
		float[] fs_10_ = new float[9];
		float f_11_ = 1.0F;
		f_7_ = (float) i_5_ / 32767.0F;
		float f_12_ = 0.0F;
		f_8_ = -(float) Math.sqrt((double) (1.0F - f_7_ * f_7_));
		f_9_ = -f_7_ + 1.0F;
		float f_13_ = (float) Math.sqrt((double) (i_2_ * i_2_ + i * i));
		if (f_13_ != 0.0F || f_7_ != 0.0F) {
			if (f_13_ != 0.0F) {
				f_11_ = (float) -i_2_ / f_13_;
				f_12_ = (float) i / f_13_;
			}
			fs_10_[6] = f_9_ * (f_11_ * f_12_);
			fs_10_[3] = f_8_ * -f_12_;
			fs_10_[8] = f_7_ + f_9_ * (f_12_ * f_12_);
			fs_10_[4] = f_7_;
			fs_10_[0] = f_7_ + f_11_ * f_11_ * f_9_;
			fs_10_[2] = f_9_ * (f_11_ * f_12_);
			fs_10_[7] = f_8_ * -f_11_;
			fs_10_[1] = f_12_ * f_8_;
			fs_10_[5] = f_8_ * f_11_;
			fs_6_[0] = fs[1] * fs_10_[3] + fs[0] * fs_10_[0] + fs_10_[6] * fs[2];
			fs_6_[1] = fs[0] * fs_10_[1] + fs_10_[4] * fs[1] + fs_10_[7] * fs[2];
			fs_6_[2] = fs_10_[2] * fs[0] + fs_10_[5] * fs[1] + fs_10_[8] * fs[2];
			fs_6_[3] = fs_10_[3] * fs[4] + fs[3] * fs_10_[0] + fs_10_[6] * fs[5];
			fs_6_[4] = fs_10_[1] * fs[3] + fs[4] * fs_10_[4] + fs[5] * fs_10_[7];
			fs_6_[5] = fs[5] * fs_10_[8] + (fs_10_[5] * fs[4] + fs[3] * fs_10_[2]);
			fs_6_[6] = fs[7] * fs_10_[3] + fs_10_[0] * fs[6] + fs[8] * fs_10_[6];
			fs_6_[7] = fs[6] * fs_10_[1] + fs_10_[4] * fs[7] + fs[8] * fs_10_[7];
			fs_6_[8] = fs[8] * fs_10_[8] + (fs_10_[2] * fs[6] + fs_10_[5] * fs[7]);
		} else {
			fs_6_ = fs;
		}
		fs_6_[1] *= f;
		fs_6_[4] *= f_0_;
		fs_6_[5] *= f_0_;
		fs_6_[2] *= f;
		fs_6_[3] *= f_0_;
		fs_6_[7] *= f_1_;
		fs_6_[0] *= f;
		fs_6_[i_3_] *= f_1_;
		fs_6_[6] *= f_1_;
		return fs_6_;
	}
	
	public static void method3190(byte b) {
		anAnimableArray7817 = null;
		if (b > -58) {
			anAnimableArray7817 = null;
		}
		anIntArray7821 = null;
	}
}
