/* Class169_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class169_Sub2_Sub1 extends Class169_Sub2
{
	protected boolean aBoolean10562;
	static boolean aBoolean10563 = false;
	protected int anInt10564;
	static int anInt10565;
	protected int anInt10566;
	protected float aFloat10567;
	protected float aFloat10568;
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_0_, int i_1_, int i_2_, boolean bool, byte[] bs, int i_3_) {
		super(gltoolkit, i, i_0_, i_1_, i_2_, bool, bs, i_3_, true);
		anInt10566 = i_1_;
		anInt10564 = i_2_;
		if ((anInt4951 ^ 0xffffffff) != -34038) {
			aFloat10567 = aFloat10568 = 1.0F;
			aBoolean10562 = true;
		} else {
			aFloat10568 = (float) i_2_;
			aFloat10567 = (float) i_1_;
			aBoolean10562 = false;
		}
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_4_, int i_5_, int i_6_) {
		super(gltoolkit, i, i_4_, i_5_, i_6_);
		anInt10564 = i_6_;
		if (anInt4951 != 34037) {
			aFloat10567 = aFloat10568 = 1.0F;
			aBoolean10562 = true;
		} else {
			aFloat10568 = (float) i_6_;
			aFloat10567 = (float) i_5_;
			aBoolean10562 = false;
		}
		anInt10566 = i_5_;
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
		super(gltoolkit, i, i_7_, i_8_, i_9_, i_10_);
		if ((anInt4951 ^ 0xffffffff) == -34038) {
			aFloat10568 = (float) i_10_;
			aBoolean10562 = false;
			aFloat10567 = (float) i_9_;
		} else {
			aFloat10567 = aFloat10568 = 1.0F;
			aBoolean10562 = true;
		}
		anInt10564 = i_10_;
		anInt10566 = i_9_;
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(gltoolkit, 3553, i, i_13_, i_14_);
		aFloat10568 = (float) i_12_ / (float) i_14_;
		anInt10566 = i_11_;
		aBoolean10562 = false;
		anInt10564 = i_12_;
		aFloat10567 = (float) i_11_ / (float) i_13_;
		this.method1776(false, -88, false);
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_15_, int i_16_, int i_17_, int i_18_, byte[] bs, int i_19_) {
		super(gltoolkit, 3553, i, i_17_, i_18_);
		anInt10564 = i_16_;
		anInt10566 = i_15_;
		this.method1775(0, (byte) 100, i_19_, i_16_, i_15_, bs, true, 0, 0, 0);
		aFloat10567 = (float) i_15_ / (float) i_17_;
		aBoolean10562 = false;
		aFloat10568 = (float) i_16_ / (float) i_18_;
		this.method1776(false, -101, false);
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool) {
		super(gltoolkit, 3553, i, i_20_, i_23_, i_24_);
		aFloat10567 = (float) i_21_ / (float) i_23_;
		aFloat10568 = (float) i_22_ / (float) i_24_;
		anInt10566 = i_21_;
		aBoolean10562 = false;
		anInt10564 = i_22_;
		this.method1776(false, 89, false);
	}
	
	static final void method1777(File file, String string, int i) {
		Class85.aHashtable1157.put(string, file);
		anInt10565++;
		if (i != 34037) {
			aBoolean10563 = false;
		}
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_25_, int i_26_, boolean bool, int[] is, int i_27_, int i_28_) {
		super(gltoolkit, i, 6408, i_25_, i_26_, bool, is, i_27_, i_28_, true);
		anInt10564 = i_26_;
		anInt10566 = i_25_;
		if (anInt4951 != 34037) {
			aBoolean10562 = true;
			aFloat10567 = aFloat10568 = 1.0F;
		} else {
			aFloat10567 = (float) i_25_;
			aBoolean10562 = false;
			aFloat10568 = (float) i_26_;
		}
	}
	
	Class169_Sub2_Sub1(GLToolkit gltoolkit, int i, int i_29_, int i_30_, int i_31_, int[] is) {
		super(gltoolkit, 3553, 6408, i_30_, i_31_);
		anInt10564 = i_29_;
		anInt10566 = i;
		this.method1772((byte) -28, is, true, 0, i_29_, i, 0, 0, 0);
		aBoolean10562 = false;
		aFloat10568 = (float) i_29_ / (float) i_31_;
		aFloat10567 = (float) i / (float) i_30_;
		this.method1776(false, -117, false);
	}
}
