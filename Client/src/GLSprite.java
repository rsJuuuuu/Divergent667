/* GLSprite - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class GLSprite implements Interface4
{
	abstract int getYOffset();
	
	final void method1177(float f, float f_0_, int i, int i_1_, aa var_aa, int i_2_, int i_3_) {
		method1179(f, f_0_, (float) method1197() / 2.0F, (float) method1186() / 2.0F, i, i_1_, var_aa, i_2_, i_3_);
	}
	
	abstract void method1178(int i, int i_4_, int i_5_, int i_6_);
	
	final void method1179(float f, float f_7_, float f_8_, float f_9_, int i, int i_10_, aa var_aa, int i_11_, int i_12_) {
		if (i != 0) {
			double d = (double) (i_10_ & 0xffff) * 9.587379924285257E-5;
			float f_13_ = (float) Math.sin(d) * (float) i;
			float f_14_ = (float) Math.cos(d) * (float) i;
			float f_15_ = (-f_8_ * f_14_ + -f_9_ * f_13_) / 4096.0F + f;
			float f_16_ = (f_8_ * f_13_ + -f_9_ * f_14_) / 4096.0F + f_7_;
			float f_17_ = (((float) method1197() - f_8_) * f_14_ + -f_9_ * f_13_) / 4096.0F + f;
			float f_18_ = (-((float) method1197() - f_8_) * f_13_ + -f_9_ * f_14_) / 4096.0F + f_7_;
			float f_19_ = (-f_8_ * f_14_ + ((float) method1186() - f_9_) * f_13_) / 4096.0F + f;
			float f_20_ = (f_8_ * f_13_ + ((float) method1186() - f_9_) * f_14_) / 4096.0F + f_7_;
			method1185(f_15_, f_16_, f_17_, f_18_, f_19_, f_20_, var_aa, i_11_, i_12_);
		}
	}
	
	final void method1180(float f, float f_21_, int i, int i_22_) {
		method1182(f, f_21_, (float) method1197() / 2.0F, (float) method1186() / 2.0F, i, i_22_, 1, 0, 1);
	}
	
	final void method1181(float f, float f_23_, int i, int i_24_, int i_25_, int i_26_, int i_27_) {
		method1182(f, f_23_, (float) method1197() / 2.0F, (float) method1186() / 2.0F, i, i_24_, i_25_, i_26_, i_27_);
	}
	
	private final void method1182(float f, float f_28_, float f_29_, float f_30_, int i, int i_31_, int i_32_, int i_33_, int i_34_) {
		if (i != 0) {
			double d = (double) (i_31_ & 0xffff) * 9.587379924285257E-5;
			float f_35_ = (float) Math.sin(d) * (float) i;
			float f_36_ = (float) Math.cos(d) * (float) i;
			float f_37_ = (-f_29_ * f_36_ + -f_30_ * f_35_) / 4096.0F + f;
			float f_38_ = (f_29_ * f_35_ + -f_30_ * f_36_) / 4096.0F + f_28_;
			float f_39_ = (((float) method1197() - f_29_) * f_36_ + -f_30_ * f_35_) / 4096.0F + f;
			float f_40_ = (-((float) method1197() - f_29_) * f_35_ + -f_30_ * f_36_) / 4096.0F + f_28_;
			float f_41_ = (-f_29_ * f_36_ + ((float) method1186() - f_30_) * f_35_) / 4096.0F + f;
			float f_42_ = (f_29_ * f_35_ + ((float) method1186() - f_30_) * f_36_) / 4096.0F + f_28_;
			method1198(f_37_, f_38_, f_39_, f_40_, f_41_, f_42_, i_32_, i_33_, i_34_);
		}
	}
	
	abstract void method1183(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_);
	
	abstract void method1184(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_);
	
	private final void method1185(float f, float f_56_, float f_57_, float f_58_, float f_59_, float f_60_, aa var_aa, int i, int i_61_) {
		method1188(f, f_56_, f_57_, f_58_, f_59_, f_60_, 1, var_aa, i, i_61_);
	}
	
	abstract int method1186();
	
	abstract void method1187(int[] is);
	
	abstract void method1188(float f, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, int i, aa var_aa, int i_67_, int i_68_);
	
	abstract void method1189(int i, int i_69_, aa var_aa, int i_70_, int i_71_);
	
	abstract void method1190(int i, int i_72_, int i_73_);
	
	abstract void method1191(int i, int i_74_, int i_75_, int i_76_, int i_77_);
	
	final void method1192(int i, int i_78_, int i_79_, int i_80_) {
		method1183(i, i_78_, i_79_, i_80_, 1, 0, 1);
	}
	
	abstract int method1193();
	
	abstract void method1194(float f, float f_81_, float f_82_, float f_83_, float f_84_, float f_85_, int i, int i_86_, int i_87_, int i_88_);
	
	abstract void method1195(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_);
	
	public GLSprite() {
		/* empty */
	}
	
	final void setPosition(int i, int i_94_) {
		method1191(i, i_94_, 1, 0, 1);
	}
	
	abstract int method1197();
	
	private final void method1198(float f, float f_95_, float f_96_, float f_97_, float f_98_, float f_99_, int i, int i_100_, int i_101_) {
		method1194(f, f_95_, f_96_, f_97_, f_98_, f_99_, i, i_100_, i_101_, 1);
	}
	
	final void method1199(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		method1184(i, i_102_, i_103_, i_104_, i_105_, i_106_, i_107_, 1);
	}
	
	final void method1200(int i, int i_108_, int i_109_, int i_110_) {
		method1184(i, i_108_, i_109_, i_110_, 1, 0, 1, 1);
	}
}
