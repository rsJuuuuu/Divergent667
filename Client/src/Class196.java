/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class196
{
	private static float aFloat2404;
	private int[] anIntArray2405 = new int[2];
	static int anInt2406;
	private static float[][] aFloatArrayArray2407;
	private int[][][] anIntArrayArrayArray2408 = new int[2][2][4];
	protected int[] anIntArray2409 = new int[2];
	private int[][][] anIntArrayArrayArray2410 = new int[2][2][4];
	static int[][] anIntArrayArray2411 = new int[2][8];
	
	private final float method1991(int i, int i_0_, float f) {
		float f_1_ = (float) anIntArrayArrayArray2408[i][0][i_0_] + f * (float) (anIntArrayArrayArray2408[i][1][i_0_] - anIntArrayArrayArray2408[i][0][i_0_]);
		f_1_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_1_ / 20.0F));
	}
	
	public static void method1992() {
		aFloatArrayArray2407 = null;
		anIntArrayArray2411 = null;
	}
	
	final int method1993(int i, float f) {
		if (i == 0) {
			float f_2_ = (float) anIntArray2405[0] + (float) (anIntArray2405[1] - anIntArray2405[0]) * f;
			f_2_ *= 0.0030517578F;
			aFloat2404 = (float) Math.pow(0.1, (double) (f_2_ / 20.0F));
			anInt2406 = (int) (aFloat2404 * 65536.0F);
		}
		if (anIntArray2409[i] == 0) {
			return 0;
		}
		float f_3_ = method1991(i, 0, f);
		aFloatArrayArray2407[i][0] = -2.0F * f_3_ * (float) Math.cos((double) method1995(i, 0, f));
		aFloatArrayArray2407[i][1] = f_3_ * f_3_;
		for (int i_4_ = 1; i_4_ < anIntArray2409[i]; i_4_++) {
			f_3_ = method1991(i, i_4_, f);
			float f_5_ = -2.0F * f_3_ * (float) Math.cos((double) method1995(i, i_4_, f));
			float f_6_ = f_3_ * f_3_;
			aFloatArrayArray2407[i][i_4_ * 2 + 1] = aFloatArrayArray2407[i][i_4_ * 2 - 1] * f_6_;
			aFloatArrayArray2407[i][i_4_ * 2] = aFloatArrayArray2407[i][i_4_ * 2 - 1] * f_5_ + aFloatArrayArray2407[i][i_4_ * 2 - 2] * f_6_;
			for (int i_7_ = i_4_ * 2 - 1; i_7_ >= 2; i_7_--)
				aFloatArrayArray2407[i][i_7_] += aFloatArrayArray2407[i][i_7_ - 1] * f_5_ + aFloatArrayArray2407[i][i_7_ - 2] * f_6_;
			aFloatArrayArray2407[i][1] += aFloatArrayArray2407[i][0] * f_5_ + f_6_;
			aFloatArrayArray2407[i][0] += f_5_;
		}
		if (i == 0) {
			for (int i_8_ = 0; i_8_ < anIntArray2409[0] * 2; i_8_++)
				aFloatArrayArray2407[0][i_8_] *= aFloat2404;
		}
		for (int i_9_ = 0; i_9_ < anIntArray2409[i] * 2; i_9_++)
			anIntArrayArray2411[i][i_9_] = (int) (aFloatArrayArray2407[i][i_9_] * 65536.0F);
		return anIntArray2409[i] * 2;
	}
	
	final void method1994(BufferedStream buffer, Class177 class177) {
		int i = buffer.readUnsignedByte();
		anIntArray2409[0] = i >> 4;
		anIntArray2409[1] = i & 0xf;
		if (i != 0) {
			anIntArray2405[0] = buffer.readUnsignedShort();
			anIntArray2405[1] = buffer.readUnsignedShort();
			int i_10_ = buffer.readUnsignedByte();
			for (int i_11_ = 0; i_11_ < 2; i_11_++) {
				for (int i_12_ = 0; i_12_ < anIntArray2409[i_11_]; i_12_++) {
					anIntArrayArrayArray2410[i_11_][0][i_12_] = buffer.readUnsignedShort();
					anIntArrayArrayArray2408[i_11_][0][i_12_] = buffer.readUnsignedShort();
				}
			}
			for (int i_13_ = 0; i_13_ < 2; i_13_++) {
				for (int i_14_ = 0; i_14_ < anIntArray2409[i_13_]; i_14_++) {
					if ((i_10_ & 1 << i_13_ * 4 << i_14_) != 0) {
						anIntArrayArrayArray2410[i_13_][1][i_14_] = buffer.readUnsignedShort();
						anIntArrayArrayArray2408[i_13_][1][i_14_] = buffer.readUnsignedShort();
					} else {
						anIntArrayArrayArray2410[i_13_][1][i_14_] = anIntArrayArrayArray2410[i_13_][0][i_14_];
						anIntArrayArrayArray2408[i_13_][1][i_14_] = anIntArrayArrayArray2408[i_13_][0][i_14_];
					}
				}
			}
			if (i_10_ != 0 || anIntArray2405[1] != anIntArray2405[0]) {
				class177.method1807(buffer);
			}
		} else {
			anIntArray2405[0] = anIntArray2405[1] = 0;
		}
	}
	
	private final float method1995(int i, int i_15_, float f) {
		float f_16_ = (float) anIntArrayArrayArray2410[i][0][i_15_] + f * (float) (anIntArrayArrayArray2410[i][1][i_15_] - anIntArrayArrayArray2410[i][0][i_15_]);
		f_16_ *= 1.2207031E-4F;
		return method1996(f_16_);
	}
	
	private static final float method1996(float f) {
		float f_17_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_17_ * 3.1415927F / 11025.0F;
	}
	
	static {
		aFloatArrayArray2407 = new float[2][8];
	}
}
