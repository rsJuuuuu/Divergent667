/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class374
{
	private PureJavaToolkit aPureJavaToolkit4610;
	protected int anInt4611 = 0;
	static int anInt4612;
	static int anInt4613;
	static Class151 aClass151_4614 = new Class151(15, 0, 1, 0);
	protected boolean aBoolean4615 = true;
	protected int anInt4616;
	protected boolean aBoolean4617;
	protected int anInt4618;
	protected Class336_Sub2 aClass336_Sub2_4619;
	protected int anInt4620 = 0;
	protected boolean aBoolean4621;
	protected Runnable aRunnable4622;
	static int anInt4623;
	protected int anInt4624 = 0;
	static int anInt4625;
	protected int[] anIntArray4626;
	protected Class185 aClass185_4627;
	protected int[] anIntArray4628;
	protected int[] anIntArray4629;
	protected int[] anIntArray4630;
	protected int[] anIntArray4631;
	protected int[] anIntArray4632;
	protected int anInt4633;
	protected int[] anIntArray4634;
	protected int anInt4635;
	protected int[] anIntArray4636;
	protected int[] anIntArray4637;
	protected float[] aFloatArray4638;
	protected int[] anIntArray4639;
	protected int[] anIntArray4640;
	protected int[] anIntArray4641;
	protected int[] anIntArray4642;
	protected int[] anIntArray4643;
	protected int[] anIntArray4644;
	protected int[] anIntArray4645;
	protected int[] anIntArray4646;
	protected int[] anIntArray4647;
	protected int[] anIntArray4648;
	protected int[] anIntArray4649;
	protected int[] anIntArray4650;
	protected PureJavaDrawableModel[] aPureJavaDrawableModelArray4651;
	protected PureJavaDrawableModel[] aPureJavaDrawableModelArray4652;
	protected int anInt4653;
	
	final void method4109(boolean bool) {
		anInt4613++;
		aClass185_4627 = new Class185(aPureJavaToolkit4610, this);
		if (bool != false) {
			method4111(null, 99);
		}
	}
	
	public static void method4110(int i) {
		if (i == 0) {
			aClass151_4614 = null;
		}
	}
	
	final void method4111(Runnable runnable, int i) {
		anInt4612++;
		aRunnable4622 = runnable;
		if (i != 0) {
			method4112(-128, -87);
		}
	}
	
	static final int method4112(int i, int i_0_) {
		anInt4625++;
		if (i != 1) {
			aClass151_4614 = null;
		}
		return i_0_ >>> 8;
	}
	
	static final int method4113(int i, int i_1_, int i_2_, int i_3_) {
		if (i_1_ != -1145) {
			aClass151_4614 = null;
		}
		anInt4623++;
		if ((CacheNode_Sub11.aByteArrayArrayArray9550[i_3_][i_2_][i] & 0x8 ^ 0xffffffff) != -1) {
			return 0;
		}
		if (i_3_ > 0 && (CacheNode_Sub11.aByteArrayArrayArray9550[1][i_2_][i] & 0x2) != 0) {
			return i_3_ - 1;
		}
		return i_3_;
	}
	
	Class374(PureJavaToolkit purejavatoolkit) {
		aBoolean4617 = false;
		anInt4616 = 0;
		aClass336_Sub2_4619 = new Class336_Sub2();
		anIntArray4636 = new int[8];
		anIntArray4630 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4632 = new int[64];
		anIntArray4629 = new int[8];
		anIntArray4639 = new int[8];
		anIntArray4626 = new int[10000];
		anIntArray4640 = new int[PureJavaDrawableModel.anInt5724];
		aFloatArray4638 = new float[2];
		anIntArray4641 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4628 = new int[10000];
		anIntArray4637 = new int[64];
		anIntArray4643 = new int[10];
		anIntArray4642 = new int[10];
		anIntArray4645 = new int[10];
		anIntArray4644 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4646 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4649 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4631 = new int[PureJavaDrawableModel.anInt5724];
		anIntArray4650 = new int[64];
		anIntArray4647 = new int[64];
		anIntArray4634 = new int[10];
		aPureJavaDrawableModelArray4652 = new PureJavaDrawableModel[7];
		aPureJavaDrawableModelArray4651 = new PureJavaDrawableModel[7];
		aPureJavaToolkit4610 = purejavatoolkit;
		anInt4618 = -255 + aPureJavaToolkit4610.anInt6776;
		aClass185_4627 = new Class185(purejavatoolkit, this);
		for (int i = 0; (i ^ 0xffffffff) > -8; i++) {
			aPureJavaDrawableModelArray4652[i] = new PureJavaDrawableModel(aPureJavaToolkit4610);
			aPureJavaDrawableModelArray4651[i] = new PureJavaDrawableModel(aPureJavaToolkit4610);
		}
		anIntArray4648 = new int[PureJavaDrawableModel.anInt5742];
		for (int i = 0; i < PureJavaDrawableModel.anInt5742; i++)
			anIntArray4648[i] = -1;
	}
}
