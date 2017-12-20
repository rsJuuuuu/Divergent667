/* Class336_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336_Sub2 extends Class336
{
	static int anInt8557;
	protected float aFloat8558;
	static int anInt8559;
	static int anInt8560;
	protected float aFloat8561;
	static Class103 aClass103_8562 = new Class103();
	static int anInt8563;
	static int anInt8564;
	static int anInt8565;
	protected float aFloat8566;
	protected float aFloat8567;
	static Class77 aClass77_8568;
	static int anInt8569;
	static int anInt8570;
	protected float aFloat8571;
	static int anInt8572;
	static int anInt8573;
	static int anInt8574;
	static int anInt8575;
	static int anInt8576;
	protected float aFloat8577;
	protected float aFloat8578;
	protected float aFloat8579;
	protected float aFloat8580;
	static int anInt8581;
	static int anInt8582;
	protected float aFloat8583;
	protected float aFloat8584;
	static int anInt8585;
	static int anInt8586 = -1;
	static int anInt8587;
	static boolean aBoolean8588 = true;
	protected float aFloat8589;
	static int anInt8590;
	
	final void method3863(int i, int i_0_, int i_1_) {
		anInt8572++;
		aFloat8579 += (float) i_0_;
		aFloat8589 += (float) i_1_;
		aFloat8583 += (float) i;
	}
	
	final void method3855(int[] is) {
		anInt8563++;
		float f = (float) is[0] - aFloat8583;
		float f_2_ = (float) is[1] - aFloat8579;
		float f_3_ = (float) is[2] - aFloat8589;
		is[0] = (int) (aFloat8577 * f_3_ + (aFloat8578 * f_2_ + f * aFloat8580));
		is[1] = (int) (f_3_ * aFloat8567 + (aFloat8561 * f_2_ + aFloat8571 * f));
		is[2] = (int) (aFloat8584 * f_3_ + (f * aFloat8566 + aFloat8558 * f_2_));
	}
	
	final void method3861(int i) {
		anInt8570++;
		aFloat8584 = 1.0F;
		aFloat8580 = aFloat8561 = Class93.aFloatArray1242[0x3fff & i];
		aFloat8578 = Class93.aFloatArray1238[0x3fff & i];
		aFloat8566 = aFloat8583 = aFloat8558 = aFloat8579 = aFloat8577 = aFloat8567 = aFloat8589 = 0.0F;
		aFloat8571 = -aFloat8578;
	}
	
	final void method3854(int i, int i_4_, int i_5_) {
		aFloat8578 = aFloat8577 = aFloat8571 = aFloat8567 = aFloat8566 = aFloat8558 = 0.0F;
		anInt8587++;
		aFloat8589 = (float) i_5_;
		aFloat8580 = aFloat8561 = aFloat8584 = 1.0F;
		aFloat8579 = (float) i_4_;
		aFloat8583 = (float) i;
	}
	
	final void method3869(int i, int i_6_, int i_7_, int[] is) {
		i_7_ -= aFloat8589;
		anInt8585++;
		i_6_ -= aFloat8579;
		i -= aFloat8583;
		is[2] = (int) (aFloat8566 * (float) i + (float) i_6_ * aFloat8558 + (float) i_7_ * aFloat8584);
		is[1] = (int) (aFloat8567 * (float) i_7_ + (aFloat8571 * (float) i + aFloat8561 * (float) i_6_));
		is[0] = (int) ((float) i_7_ * aFloat8577 + (aFloat8580 * (float) i + aFloat8578 * (float) i_6_));
	}
	
	final void method3859(int i) {
		anInt8569++;
		float f = Class93.aFloatArray1242[i & 0x3fff];
		float f_8_ = Class93.aFloatArray1238[i & 0x3fff];
		float f_9_ = aFloat8578;
		float f_10_ = aFloat8561;
		float f_11_ = aFloat8558;
		float f_12_ = aFloat8579;
		aFloat8578 = f_9_ * f - aFloat8577 * f_8_;
		aFloat8577 = f_8_ * f_9_ + f * aFloat8577;
		aFloat8561 = f * f_10_ - aFloat8567 * f_8_;
		aFloat8567 = aFloat8567 * f + f_10_ * f_8_;
		aFloat8558 = -(aFloat8584 * f_8_) + f * f_11_;
		aFloat8584 = f * aFloat8584 + f_8_ * f_11_;
		aFloat8579 = -(aFloat8589 * f_8_) + f * f_12_;
		aFloat8589 = f * aFloat8589 + f_8_ * f_12_;
	}
	
	final void method3853(int i, int i_13_, int i_14_, int[] is) {
		is[0] = (int) (aFloat8571 * (float) i_13_ + aFloat8580 * (float) i + (float) i_14_ * aFloat8566 + aFloat8583);
		is[1] = (int) (aFloat8558 * (float) i_14_ + (aFloat8578 * (float) i + (float) i_13_ * aFloat8561) + aFloat8579);
		anInt8560++;
		is[2] = (int) ((float) i_14_ * aFloat8584 + ((float) i * aFloat8577 + (float) i_13_ * aFloat8567) + aFloat8589);
	}
	
	final void method3864(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		anInt8575++;
		float f = Class93.aFloatArray1242[i_17_ & 0x3fff];
		float f_20_ = Class93.aFloatArray1238[i_17_ & 0x3fff];
		float f_21_ = Class93.aFloatArray1242[0x3fff & i_18_];
		float f_22_ = Class93.aFloatArray1238[i_18_ & 0x3fff];
		float f_23_ = Class93.aFloatArray1242[0x3fff & i_19_];
		float f_24_ = Class93.aFloatArray1238[0x3fff & i_19_];
		float f_25_ = f_23_ * f_20_;
		float f_26_ = f_24_ * f_20_;
		aFloat8571 = f * f_24_;
		aFloat8558 = f_24_ * f_22_ + f_21_ * f_25_;
		aFloat8567 = -f_20_;
		aFloat8584 = f * f_21_;
		aFloat8566 = -f_22_ * f_23_ + f_21_ * f_26_;
		aFloat8577 = f * f_22_;
		aFloat8561 = f * f_23_;
		aFloat8578 = f_24_ * -f_21_ + f_25_ * f_22_;
		aFloat8580 = f_21_ * f_23_ + f_26_ * f_22_;
		aFloat8589 = -((float) i_16_ * aFloat8584) + (-((float) i_15_ * aFloat8567) + (float) -i * aFloat8577);
		aFloat8583 = -(aFloat8566 * (float) i_16_) + (-(aFloat8571 * (float) i_15_) + aFloat8580 * (float) -i);
		aFloat8579 = -((float) i_15_ * aFloat8561) + aFloat8578 * (float) -i - (float) i_16_ * aFloat8558;
	}
	
	final void method3867(int i, int i_27_, int i_28_, int[] is) {
		is[1] = (int) (aFloat8561 * (float) i_27_ + aFloat8578 * (float) i + (float) i_28_ * aFloat8558);
		anInt8576++;
		is[0] = (int) ((float) i * aFloat8580 + (float) i_27_ * aFloat8571 + aFloat8566 * (float) i_28_);
		is[2] = (int) ((float) i_28_ * aFloat8584 + (aFloat8567 * (float) i_27_ + (float) i * aFloat8577));
	}
	
	final Class336 method3858() {
		anInt8582++;
		Class336_Sub2 class336_sub2_29_ = new Class336_Sub2();
		class336_sub2_29_.aFloat8589 = aFloat8589;
		class336_sub2_29_.aFloat8566 = aFloat8566;
		class336_sub2_29_.aFloat8561 = aFloat8561;
		class336_sub2_29_.aFloat8558 = aFloat8558;
		class336_sub2_29_.aFloat8584 = aFloat8584;
		class336_sub2_29_.aFloat8583 = aFloat8583;
		class336_sub2_29_.aFloat8579 = aFloat8579;
		class336_sub2_29_.aFloat8571 = aFloat8571;
		class336_sub2_29_.aFloat8567 = aFloat8567;
		class336_sub2_29_.aFloat8580 = aFloat8580;
		class336_sub2_29_.aFloat8577 = aFloat8577;
		class336_sub2_29_.aFloat8578 = aFloat8578;
		return class336_sub2_29_;
	}
	
	final void method3862() {
		aFloat8580 = aFloat8561 = aFloat8584 = 1.0F;
		anInt8574++;
		aFloat8578 = aFloat8577 = aFloat8571 = aFloat8567 = aFloat8566 = aFloat8558 = aFloat8583 = aFloat8579 = aFloat8589 = 0.0F;
	}
	
	public static void method3892(int i) {
		aClass103_8562 = null;
		aClass77_8568 = null;
		if (i > -4) {
			method3892(-75);
		}
	}
	
	final void method3860(int i) {
		anInt8573++;
		aFloat8561 = 1.0F;
		aFloat8580 = aFloat8584 = Class93.aFloatArray1242[0x3fff & i];
		aFloat8566 = Class93.aFloatArray1238[i & 0x3fff];
		aFloat8571 = aFloat8583 = aFloat8578 = aFloat8558 = aFloat8579 = aFloat8567 = aFloat8589 = 0.0F;
		aFloat8577 = -aFloat8566;
	}
	
	final void method3865(int i) {
		aFloat8580 = 1.0F;
		anInt8557++;
		aFloat8561 = aFloat8584 = Class93.aFloatArray1242[0x3fff & i];
		aFloat8567 = Class93.aFloatArray1238[i & 0x3fff];
		aFloat8558 = -aFloat8567;
		aFloat8571 = aFloat8566 = aFloat8583 = aFloat8578 = aFloat8579 = aFloat8577 = aFloat8589 = 0.0F;
	}
	
	final void method3868(int i) {
		anInt8590++;
		float f = Class93.aFloatArray1242[0x3fff & i];
		float f_30_ = Class93.aFloatArray1238[0x3fff & i];
		float f_31_ = aFloat8580;
		float f_32_ = aFloat8571;
		float f_33_ = aFloat8566;
		float f_34_ = aFloat8583;
		aFloat8580 = -(f_30_ * aFloat8578) + f * f_31_;
		aFloat8571 = -(aFloat8561 * f_30_) + f * f_32_;
		aFloat8578 = aFloat8578 * f + f_30_ * f_31_;
		aFloat8561 = aFloat8561 * f + f_30_ * f_32_;
		aFloat8566 = -(aFloat8558 * f_30_) + f_33_ * f;
		aFloat8558 = f_30_ * f_33_ + f * aFloat8558;
		aFloat8583 = f * f_34_ - aFloat8579 * f_30_;
		aFloat8579 = aFloat8579 * f + f_30_ * f_34_;
	}
	
	final void method3856(int i) {
		anInt8559++;
		float f = Class93.aFloatArray1242[i & 0x3fff];
		float f_35_ = Class93.aFloatArray1238[i & 0x3fff];
		float f_36_ = aFloat8580;
		float f_37_ = aFloat8571;
		float f_38_ = aFloat8566;
		aFloat8580 = f_36_ * f + f_35_ * aFloat8577;
		float f_39_ = aFloat8583;
		aFloat8577 = f * aFloat8577 - f_36_ * f_35_;
		aFloat8571 = f_35_ * aFloat8567 + f_37_ * f;
		aFloat8567 = -(f_37_ * f_35_) + aFloat8567 * f;
		aFloat8566 = f * f_38_ + f_35_ * aFloat8584;
		aFloat8583 = f_39_ * f + f_35_ * aFloat8589;
		aFloat8584 = -(f_38_ * f_35_) + f * aFloat8584;
		aFloat8589 = f * aFloat8589 - f_39_ * f_35_;
	}
	
	final void method3857(Class336 class336) {
		anInt8565++;
		Class336_Sub2 class336_sub2_40_ = (Class336_Sub2) class336;
		aFloat8577 = class336_sub2_40_.aFloat8577;
		aFloat8566 = class336_sub2_40_.aFloat8566;
		aFloat8561 = class336_sub2_40_.aFloat8561;
		aFloat8567 = class336_sub2_40_.aFloat8567;
		aFloat8578 = class336_sub2_40_.aFloat8578;
		aFloat8589 = class336_sub2_40_.aFloat8589;
		aFloat8580 = class336_sub2_40_.aFloat8580;
		aFloat8571 = class336_sub2_40_.aFloat8571;
		aFloat8584 = class336_sub2_40_.aFloat8584;
		aFloat8579 = class336_sub2_40_.aFloat8579;
		aFloat8558 = class336_sub2_40_.aFloat8558;
		aFloat8583 = class336_sub2_40_.aFloat8583;
	}
	
	public Class336_Sub2() {
		method3862();
	}
	
	static final void method3893(byte b) {
		Class194_Sub3_Sub1.aBoolean9378 = false;
		if (b > 85) {
			anInt8564++;
			Class320_Sub21.method3764(-122);
		}
	}
}
