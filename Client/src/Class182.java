/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class182
{
	private static int[] anIntArray2160 = new int[4];
	private int anInt2161;
	private int anInt2162;
	private int anInt2163;
	private int anInt2164;
	private int anInt2165;
	protected int anInt2166;
	private int anInt2167;
	private static DrawableModel aDrawableModel2168;
	private int anInt2169;
	private static GLSprite aGLSprite2170;
	private int anInt2171;
	private int anInt2172;
	private boolean aBoolean2173;
	private int anInt2174;
	private int anInt2175;
	private GLSprite aGLSprite2176;
	private int anInt2177;
	private static GLSprite aGLSprite2178;
	private int anInt2179;
	private int anInt2180;
	
	static final void method1832() {
		aDrawableModel2168 = null;
		aGLSprite2178 = null;
	}
	
	final boolean method1833(GraphicsToolkit graphicstoolkit, Class182 class182_0_) {
        return !(aGLSprite2176 == null && !method1840(graphicstoolkit, class182_0_));
    }
	
	private static final void method1834(GraphicsToolkit graphicstoolkit) {
		if (aDrawableModel2168 == null) {
			Model model = new Model(580, 1104, 1);
			model.method2086((byte) 0, (byte) 0, (byte) -66, (short) 0, (short) 0, (short) 1024, (short) 32767, (short) 1024, (short) 1024, (byte) 0);
			model.method2079(-115, 0, 128, 0);
			model.method2079(-88, 0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_1_ = i * 8192 / 24;
				int i_2_ = Class335.anIntArray4167[i_1_];
				int i_3_ = Class335.anIntArray4165[i_1_];
				for (int i_4_ = 1; i_4_ < 24; i_4_++) {
					int i_5_ = i_4_ * 8192 / 24;
					int i_6_ = Class335.anIntArray4165[i_5_] >> 7;
					int i_7_ = Class335.anIntArray4167[i_5_] * i_2_ >> 21;
					int i_8_ = Class335.anIntArray4167[i_5_] * i_3_ >> 21;
					model.method2079(-86, -i_7_, i_6_, i_8_);
				}
				if (i > 0) {
					int i_9_ = i * 23 + 2;
					int i_10_ = i_9_ - 23;
					model.method2080(true, 0, i_9_, i_10_, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
					for (int i_11_ = 1; i_11_ < 23; i_11_++) {
						int i_12_ = i_10_ + 1;
						int i_13_ = i_9_ + 1;
						model.method2080(true, i_10_, i_9_, i_12_, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
						model.method2080(true, i_12_, i_9_, i_13_, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
						i_10_ = i_12_;
						i_9_ = i_13_;
					}
					model.method2080(true, i_9_, 1, i_10_, (short) 127, (short) 0, (byte) 0, (byte) 0, (byte) 0);
				}
			}
			model.anInt2573 = model.anInt2599;
			model.anIntArray2602 = null;
			model.anIntArray2598 = null;
			model.aByteArray2607 = null;
			aDrawableModel2168 = graphicstoolkit.a(model, 51200, 33, 64, 768);
		}
	}
	
	private final void method1835(GraphicsToolkit graphicstoolkit, Class182 class182_14_) {
		method1834(graphicstoolkit);
		method1841(graphicstoolkit);
		graphicstoolkit.K(anIntArray2160);
		graphicstoolkit.KA(0, 0, anInt2177, anInt2177);
		graphicstoolkit.ya();
		graphicstoolkit.aa(0, 0, anInt2177, anInt2177, ~0xffffff | anInt2171, 0);
		int i = 0;
		int i_15_ = 0;
		int i_16_ = 256;
		if (class182_14_ != null) {
			if (class182_14_.aBoolean2173) {
				i = -class182_14_.anInt2172;
				i_15_ = -class182_14_.anInt2161;
				i_16_ = -class182_14_.anInt2165;
			} else {
				i = class182_14_.anInt2172 - anInt2172;
				i_15_ = class182_14_.anInt2161 - anInt2161;
				i_16_ = class182_14_.anInt2165 - anInt2165;
			}
		}
		if (anInt2179 != 0) {
			int i_17_ = Class335.anIntArray4167[anInt2179];
			int i_18_ = Class335.anIntArray4165[anInt2179];
			int i_19_ = i_15_ * i_18_ - i_16_ * i_17_ >> 14;
			i_16_ = i_15_ * i_17_ + i_16_ * i_18_ >> 14;
			i_15_ = i_19_;
		}
		if (anInt2163 != 0) {
			int i_20_ = Class335.anIntArray4167[anInt2163];
			int i_21_ = Class335.anIntArray4165[anInt2163];
			int i_22_ = i_16_ * i_20_ + i * i_21_ >> 14;
			i_16_ = i_16_ * i_21_ - i * i_20_ >> 14;
			i = i_22_;
		}
		DrawableModel drawablemodel = aDrawableModel2168.method633((byte) 0, 51200, true);
		drawablemodel.aa((short) 0, (short) anInt2169);
		graphicstoolkit.xa(1.0F);
		graphicstoolkit.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_15_, (float) i_16_);
		int i_23_ = 1024 * anInt2177 / (drawablemodel.RA() - drawablemodel.V());
		if (anInt2171 != 0) {
			i_23_ = i_23_ * 13 / 16;
		}
		int[] is = graphicstoolkit.Y();
		graphicstoolkit.DA(anInt2177 / 2, anInt2177 / 2, i_23_, i_23_);
		graphicstoolkit.a(graphicstoolkit.y());
		Class336 class336 = graphicstoolkit.y();
		class336.method3854(0, 0, graphicstoolkit.i() - drawablemodel.HA());
		drawablemodel.method622(class336, null, 1024, 1);
		int i_24_ = anInt2177 * 13 / 16;
		int i_25_ = (anInt2177 - i_24_) / 2;
		aGLSprite2170.method1199(i_25_, i_25_, i_24_, i_24_, 0, ~0xffffff | anInt2171, 1);
		aGLSprite2176 = graphicstoolkit.a(0, 0, anInt2177, anInt2177, true);
		graphicstoolkit.ya();
		graphicstoolkit.aa(0, 0, anInt2177, anInt2177, 0, 0);
		aGLSprite2178.method1199(0, 0, anInt2177, anInt2177, 1, 0, 0);
		aGLSprite2176.method1190(0, 0, 3);
		graphicstoolkit.DA(is[0], is[1], is[2], is[3]);
		graphicstoolkit.KA(anIntArray2160[0], anIntArray2160[1], anIntArray2160[2], anIntArray2160[3]);
	}
	
	public static void method1836() {
		aDrawableModel2168 = null;
		aGLSprite2170 = null;
		aGLSprite2178 = null;
		anIntArray2160 = null;
	}
	
	private final void method1837(GraphicsToolkit graphicstoolkit, Class182 class182_26_) {
		Model model = Renderer.method3448(anInt2169, 7, 0, Class188_Sub2_Sub2.aClass302_9361);
		if (model != null) {
			graphicstoolkit.K(anIntArray2160);
			graphicstoolkit.KA(0, 0, anInt2177, anInt2177);
			graphicstoolkit.ya();
			graphicstoolkit.aa(0, 0, anInt2177, anInt2177, 0, 0);
			int i = 0;
			int i_27_ = 0;
			int i_28_ = 256;
			if (class182_26_ != null) {
				if (class182_26_.aBoolean2173) {
					i = -class182_26_.anInt2172;
					i_27_ = -class182_26_.anInt2161;
					i_28_ = -class182_26_.anInt2165;
				} else {
					i = anInt2172 - class182_26_.anInt2172;
					i_27_ = anInt2161 - class182_26_.anInt2161;
					i_28_ = anInt2165 - class182_26_.anInt2165;
				}
			}
			if (anInt2179 != 0) {
				int i_29_ = -anInt2179 & 0x3fff;
				int i_30_ = Class335.anIntArray4167[i_29_];
				int i_31_ = Class335.anIntArray4165[i_29_];
				int i_32_ = i_27_ * i_31_ - i_28_ * i_30_ >> 14;
				i_28_ = i_27_ * i_30_ + i_28_ * i_31_ >> 14;
				i_27_ = i_32_;
			}
			if (anInt2163 != 0) {
				int i_33_ = -anInt2163 & 0x3fff;
				int i_34_ = Class335.anIntArray4167[i_33_];
				int i_35_ = Class335.anIntArray4165[i_33_];
				int i_36_ = i_28_ * i_34_ + i * i_35_ >> 14;
				i_28_ = i_28_ * i_35_ - i * i_34_ >> 14;
				i = i_36_;
			}
			graphicstoolkit.xa(1.0F);
			graphicstoolkit.ZA(anInt2171, 1.0F, 1.0F, (float) i, (float) i_27_, (float) i_28_);
			model.method2085(anInt2174 & 0x3fff, anInt2167 & 0x3fff, -105, anInt2164 & 0x3fff);
			DrawableModel drawablemodel = graphicstoolkit.a(model, 2048, 0, 64, 768);
			int i_37_ = drawablemodel.RA() - drawablemodel.V();
			int i_38_ = drawablemodel.EA() - drawablemodel.fa();
			int i_39_ = i_37_ > i_38_ ? i_37_ : i_38_;
			int i_40_ = 1024 * anInt2177 / i_39_;
			int[] is = graphicstoolkit.Y();
			graphicstoolkit.DA(anInt2177 / 2, anInt2177 / 2, i_40_, i_40_);
			graphicstoolkit.a(graphicstoolkit.y());
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(0, 0, graphicstoolkit.i() - drawablemodel.HA());
			drawablemodel.method622(class336, null, graphicstoolkit.i(), 1);
			aGLSprite2176 = graphicstoolkit.a(0, 0, anInt2177, anInt2177, true);
			aGLSprite2176.method1190(0, 0, 3);
			graphicstoolkit.DA(is[0], is[1], is[2], is[3]);
			graphicstoolkit.KA(anIntArray2160[0], anIntArray2160[1], anIntArray2160[2], anIntArray2160[3]);
		}
	}
	
	final void method1838(GraphicsToolkit graphicstoolkit, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		if (aGLSprite2176 != null) {
			int[] is = new int[3];
			int i_50_ = -(anInt2172 - i_46_ << 16);
			int i_51_ = anInt2161 - i_47_ << 15;
			int i_52_ = -(anInt2165 - i_48_ << 16);
			Class336 class336 = graphicstoolkit.n();
			class336.method3853(0, 0, 0, is);
			i_50_ += is[0];
			i_51_ += is[1];
			i_52_ += is[2];
			graphicstoolkit.H(i_50_, i_51_, i_52_, is);
			if (is[2] >= 0) {
				int i_53_ = is[0] - anInt2162 / 2;
				int i_54_ = is[1] - anInt2162 / 2;
				if (i_54_ < i_43_ && i_54_ + anInt2162 > 0 && i_53_ < i_42_ && i_53_ + anInt2162 > 0) {
					aGLSprite2176.method1199(i_53_, i_54_, anInt2162, anInt2162, 0, i_49_ << 24 | 0xffffff, 1);
				}
			}
		}
	}
	
	final boolean method1839(int i, int i_55_, int i_56_, int i_57_) {
		int i_58_;
		int i_59_;
		int i_60_;
		if (!aBoolean2173) {
			i_58_ = anInt2172 - i;
			i_59_ = anInt2161 - i_55_;
			i_60_ = anInt2165 - i_56_;
			anInt2166 = (int) Math.sqrt((double) (i_58_ * i_58_ + i_59_ * i_59_ + i_60_ * i_60_));
			if (anInt2166 == 0) {
				anInt2166 = 1;
			}
			i_58_ = (i_58_ << 8) / anInt2166;
			i_59_ = (i_59_ << 8) / anInt2166;
			i_60_ = (i_60_ << 8) / anInt2166;
		} else {
			anInt2166 = 1073741823;
			i_58_ = anInt2172;
			i_59_ = anInt2161;
			i_60_ = anInt2165;
		}
		int i_61_ = (int) (Math.sqrt((double) (i_58_ * i_58_ + i_59_ * i_59_ + i_60_ * i_60_)) * 256.0);
		if (i_61_ > 128) {
			i_58_ = (i_58_ << 16) / i_61_;
			i_59_ = (i_59_ << 16) / i_61_;
			i_60_ = (i_60_ << 16) / i_61_;
			anInt2162 = anInt2175 * i_57_ / (aBoolean2173 ? 1024 : anInt2166);
		} else {
			anInt2162 = 0;
		}
		if (anInt2162 < 8) {
			aGLSprite2176 = null;
			return false;
		}
		int i_62_ = Class320_Sub19.method3753(anInt2162, -729073628);
		if (i_62_ > i_57_) {
			i_62_ = Class215.method2072(i_57_, true);
		}
		if (i_62_ > 512) {
			i_62_ = 512;
		}
		if (i_62_ != anInt2177) {
			anInt2177 = i_62_;
		}
		anInt2179 = (int) (Math.asin((double) ((float) i_59_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt2163 = (int) (Math.atan2((double) i_58_, (double) -i_60_) * 2607.5945876176133) & 0x3fff;
		aGLSprite2176 = null;
		return true;
	}
	
	private final boolean method1840(GraphicsToolkit graphicstoolkit, Class182 class182_63_) {
		if (aGLSprite2176 == null) {
			if (anInt2180 == 0) {
				if (Class376.aD4661.method7(9900, anInt2169)) {
					int[] is = Class376.aD4661.method8(0.7F, anInt2169, anInt2177, false, false, anInt2177);
					aGLSprite2176 = graphicstoolkit.method1235(anInt2177, anInt2177, anInt2177, is, 0, 7468);
				}
			} else if (anInt2180 == 2) {
				method1837(graphicstoolkit, class182_63_);
			} else if (anInt2180 == 1) {
				method1835(graphicstoolkit, class182_63_);
			}
		}
        return aGLSprite2176 != null;
    }
	
	private static final void method1841(GraphicsToolkit graphicstoolkit) {
		if (aGLSprite2178 == null) {
			int[] is = new int[16384];
			int[] is_64_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_65_ = 64 - i;
				i_65_ *= i_65_;
				int i_66_ = 128 - i - 1;
				int i_67_ = i * 128;
				int i_68_ = i_66_ * 128;
				for (int i_69_ = 0; i_69_ < 64; i_69_++) {
					int i_70_ = 64 - i_69_;
					i_70_ *= i_70_;
					int i_71_ = 128 - i_69_ - 1;
					int i_72_ = 256 - (i_70_ + i_65_ << 8) / 4096;
					i_72_ = i_72_ * 16 * 192 / 1536;
					if (i_72_ < 0) {
						i_72_ = 0;
					} else if (i_72_ > 255) {
						i_72_ = 255;
					}
					int i_73_ = i_72_ / 2;
					is_64_[i_67_ + i_69_] = is_64_[i_67_ + i_71_] = is_64_[i_68_ + i_69_] = is_64_[i_68_ + i_71_] = ~0xffffff | i_72_ << 16;
					is[i_67_ + i_69_] = is[i_67_ + i_71_] = is[i_68_ + i_69_] = is[i_68_ + i_71_] = 127 - i_73_ << 24 | 0xffffff;
				}
			}
			aGLSprite2178 = graphicstoolkit.method1235(128, 128, 128, is_64_, 0, 7468);
			aGLSprite2170 = graphicstoolkit.method1235(128, 128, 128, is, 0, 7468);
		}
	}
	
	Class182(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, boolean bool, int i_80_, int i_81_, int i_82_) {
		anInt2172 = i_75_;
		anInt2161 = i_76_;
		anInt2165 = i_77_;
		aBoolean2173 = bool;
		anInt2169 = i_74_;
		anInt2171 = i_79_;
		anInt2175 = i_78_;
		anInt2180 = i;
		anInt2167 = i_80_;
		anInt2164 = i_81_;
		anInt2174 = i_82_;
	}
}
