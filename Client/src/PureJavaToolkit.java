/* PureJavaToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

public class PureJavaToolkit extends GraphicsToolkit
{
	private int anInt6752;
	private HashTable aHashTable6753;
	private int anInt6754;
	private java.awt.Canvas aCanvas6755;
	protected GraphicsBuffer aGraphicsBuffer6756;
	private boolean aBoolean6757;
	private int anInt6758;
	private boolean aBoolean6759 = false;
	protected int anInt6760;
	protected int anInt6761;
	private Class61 aClass61_6762;
	protected int anInt6763;
	protected int anInt6764;
	private int anInt6765;
	protected int anInt6766;
	protected int anInt6767;
	protected int anInt6768;
	protected int anInt6769;
	private int anInt6770;
	private Class64 aClass64_6771;
	protected int anInt6772;
	private int anInt6773;
	protected int anInt6774;
	protected int anInt6775;
	protected int anInt6776;
	private Class374[] aClass374Array6777;
	protected int anInt6778;
	protected int anInt6779;
	protected int anInt6780;
	private Class61 aClass61_6781;
	protected float[] aFloatArray6782;
	private int anInt6783;
	protected int anInt6784;
	protected int anInt6785;
	protected int anInt6786;
	protected int[] anIntArray6787;
	protected Class336_Sub2 aClass336_Sub2_6788;
	protected int anInt6789;
	protected int anInt6790;
	private int anInt6791;
	protected float[] aFloatArray6792;
	protected int anInt6793;
	private boolean aBoolean6794;
	protected int anInt6795;
	private int anInt6796;
	private int anInt6797;
	protected int anInt6798;
	private GLSprite aGLSprite6799;
	private int anInt6800;
	
	final void u() {
		if (aBoolean6757) {
			Class160.method1727(true, (byte) 122, false);
			aBoolean6757 = false;
		}
		aGraphicsBuffer6756 = null;
		aCanvas6755 = null;
		anInt6752 = 0;
		anInt6758 = 0;
		aHashTable6753 = null;
		aBoolean6759 = true;
	}
	
	final void a(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, aa var_aa, int i_5_, int i_6_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray5487;
		int[] is_7_ = var_aa_Sub1.anIntArray5488;
		int i_8_ = anInt6760 > i_6_ ? anInt6760 : i_6_;
		int i_9_ = anInt6772 < i_6_ + is.length ? anInt6772 : i_6_ + is.length;
		i_1_ -= i;
		i_2_ -= i_0_;
		if (i_1_ + i_2_ < 0) {
			i += i_1_;
			i_1_ = -i_1_;
			i_0_ += i_2_;
			i_2_ = -i_2_;
		}
		if (i_1_ > i_2_) {
			i_0_ <<= 16;
			i_0_ += 32768;
			i_2_ <<= 16;
			int i_10_ = (int) Math.floor((double) i_2_ / (double) i_1_ + 0.5);
			i_1_ += i;
			if (i < anInt6767) {
				i_0_ += i_10_ * (anInt6767 - i);
				i = anInt6767;
			}
			if (i_1_ >= anInt6778) {
				i_1_ = anInt6778 - 1;
			}
			int i_11_ = i_3_ >>> 24;
			if (i_4_ == 0 || i_4_ == 1 && i_11_ == 255) {
				for (/**/; i <= i_1_; i++) {
					int i_12_ = i_0_ >> 16;
					int i_13_ = i_12_ - i_6_;
					if (i_12_ >= i_8_ && i_12_ < i_9_) {
						int i_14_ = i_5_ + is[i_13_];
						if (i >= i_14_ && i < i_14_ + is_7_[i_13_]) {
							anIntArray6787[i + i_12_ * anInt6789] = i_3_;
						}
					}
					i_0_ += i_10_;
				}
				return;
			}
			if (i_4_ == 1) {
				i_3_ = ((i_3_ & 0xff00ff) * i_11_ >> 8 & 0xff00ff) + ((i_3_ & 0xff00) * i_11_ >> 8 & 0xff00) + (i_11_ << 24);
				int i_15_ = 256 - i_11_;
				for (/**/; i <= i_1_; i++) {
					int i_16_ = i_0_ >> 16;
					int i_17_ = i_16_ - i_6_;
					if (i_16_ >= i_8_ && i_16_ < i_9_) {
						int i_18_ = i_5_ + is[i_17_];
						if (i >= i_18_ && i < i_18_ + is_7_[i_17_]) {
							int i_19_ = i + i_16_ * anInt6789;
							int i_20_ = anIntArray6787[i_19_];
							i_20_ = ((i_20_ & 0xff00ff) * i_15_ >> 8 & 0xff00ff) + ((i_20_ & 0xff00) * i_15_ >> 8 & 0xff00);
							anIntArray6787[i_19_] = i_3_ + i_20_;
						}
					}
					i_0_ += i_10_;
				}
				return;
			}
			if (i_4_ == 2) {
				for (/**/; i <= i_1_; i++) {
					int i_21_ = i_0_ >> 16;
					int i_22_ = i_21_ - i_6_;
					if (i_21_ >= i_8_ && i_21_ < i_9_) {
						int i_23_ = i_5_ + is[i_22_];
						if (i >= i_23_ && i < i_23_ + is_7_[i_22_]) {
							int i_24_ = i + i_21_ * anInt6789;
							int i_25_ = anIntArray6787[i_24_];
							int i_26_ = i_3_ + i_25_;
							int i_27_ = (i_3_ & 0xff00ff) + (i_25_ & 0xff00ff);
							i_25_ = (i_27_ & 0x1000100) + (i_26_ - i_27_ & 0x10000);
							anIntArray6787[i_24_] = i_26_ - i_25_ | i_25_ - (i_25_ >>> 8);
						}
					}
					i_0_ += i_10_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_1_ <<= 16;
		int i_28_ = (int) Math.floor((double) i_1_ / (double) i_2_ + 0.5);
		i_2_ += i_0_;
		if (i_0_ < i_8_) {
			i += i_28_ * (i_8_ - i_0_);
			i_0_ = i_8_;
		}
		if (i_2_ >= i_9_) {
			i_2_ = i_9_ - 1;
		}
		int i_29_ = i_3_ >>> 24;
		if (i_4_ == 0 || i_4_ == 1 && i_29_ == 255) {
			for (/**/; i_0_ <= i_2_; i_0_++) {
				int i_30_ = i >> 16;
				int i_31_ = i_0_ - i_6_;
				int i_32_ = i_5_ + is[i_31_];
				if (i_30_ >= anInt6767 && i_30_ < anInt6778 && i_30_ >= i_32_ && i_30_ < i_32_ + is_7_[i_31_]) {
					anIntArray6787[i_30_ + i_0_ * anInt6789] = i_3_;
				}
				i += i_28_;
			}
		} else if (i_4_ == 1) {
			i_3_ = ((i_3_ & 0xff00ff) * i_29_ >> 8 & 0xff00ff) + ((i_3_ & 0xff00) * i_29_ >> 8 & 0xff00) + (i_29_ << 24);
			int i_33_ = 256 - i_29_;
			for (/**/; i_0_ <= i_2_; i_0_++) {
				int i_34_ = i >> 16;
				int i_35_ = i_0_ - i_6_;
				int i_36_ = i_5_ + is[i_35_];
				if (i_34_ >= anInt6767 && i_34_ < anInt6778 && i_34_ >= i_36_ && i_34_ < i_36_ + is_7_[i_35_]) {
					int i_37_ = i_34_ + i_0_ * anInt6789;
					int i_38_ = anIntArray6787[i_37_];
					i_38_ = ((i_38_ & 0xff00ff) * i_33_ >> 8 & 0xff00ff) + ((i_38_ & 0xff00) * i_33_ >> 8 & 0xff00);
					anIntArray6787[i_34_ + i_0_ * anInt6789] = i_3_ + i_38_;
				}
				i += i_28_;
			}
		} else if (i_4_ == 2) {
			for (/**/; i_0_ <= i_2_; i_0_++) {
				int i_39_ = i >> 16;
				int i_40_ = i_0_ - i_6_;
				int i_41_ = i_5_ + is[i_40_];
				if (i_39_ >= anInt6767 && i_39_ < anInt6778 && i_39_ >= i_41_ && i_39_ < i_41_ + is_7_[i_40_]) {
					int i_42_ = i_39_ + i_0_ * anInt6789;
					int i_43_ = anIntArray6787[i_42_];
					int i_44_ = i_3_ + i_43_;
					int i_45_ = (i_3_ & 0xff00ff) + (i_43_ & 0xff00ff);
					i_43_ = (i_45_ & 0x1000100) + (i_44_ - i_45_ & 0x10000);
					anIntArray6787[i_42_] = i_44_ - i_43_ | i_43_ - (i_43_ >>> 8);
				}
				i += i_28_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final void xa(float f) {
		anInt6780 = (int) (f * 65535.0F);
	}
	
	final int M() {
		int i = anInt6797;
		anInt6797 = 0;
		return i;
	}
	
	final void a(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_) {
		Class374 class374 = method1494(Thread.currentThread());
		Class185 class185 = class374.aClass185_4627;
		int i_52_ = i_47_ - i;
		int i_53_ = i_48_ - i_46_;
		int i_54_ = i_52_ >= 0 ? i_52_ : -i_52_;
		int i_55_ = i_53_ >= 0 ? i_53_ : -i_53_;
		int i_56_ = i_54_;
		if (i_56_ < i_55_) {
			i_56_ = i_55_;
		}
		if (i_56_ != 0) {
			int i_57_ = (i_52_ << 16) / i_56_;
			int i_58_ = (i_53_ << 16) / i_56_;
			i_52_ += i_57_ >> 16;
			i_53_ += i_58_ >> 16;
			if (i_58_ <= i_57_) {
				i_57_ = -i_57_;
			} else {
				i_58_ = -i_58_;
			}
			int i_59_ = i_50_ * i_58_ >> 17;
			int i_60_ = i_50_ * i_58_ + 1 >> 17;
			int i_61_ = i_50_ * i_57_ >> 17;
			int i_62_ = i_50_ * i_57_ + 1 >> 17;
			i -= class185.method1869();
			i_46_ -= class185.method1849();
			int i_63_ = i + i_59_;
			int i_64_ = i - i_60_;
			int i_65_ = i + i_52_ - i_60_;
			int i_66_ = i + i_52_ + i_59_;
			int i_67_ = i_46_ + i_61_;
			int i_68_ = i_46_ - i_62_;
			int i_69_ = i_46_ + i_53_ - i_62_;
			int i_70_ = i_46_ + i_53_ + i_61_;
			if (i_51_ == 0) {
				class185.anInt2220 = 0;
			} else if (i_51_ == 1) {
				class185.anInt2220 = 255 - (i_49_ >>> 24);
			} else {
				throw new IllegalArgumentException();
			}
			C(false);
			class185.aBoolean2217 = i_63_ < 0 || i_63_ > class185.anInt2222 || i_64_ < 0 || i_64_ > class185.anInt2222 || i_65_ < 0 || i_65_ > class185.anInt2222;
			class185.method1867((float) i_67_, (float) i_68_, (float) i_69_, (float) i_63_, (float) i_64_, (float) i_65_, 100.0F, 100.0F, 100.0F, i_49_);
			class185.aBoolean2217 = i_63_ < 0 || i_63_ > class185.anInt2222 || i_65_ < 0 || i_65_ > class185.anInt2222 || i_66_ < 0 || i_66_ > class185.anInt2222;
			class185.method1867((float) i_67_, (float) i_69_, (float) i_70_, (float) i_63_, (float) i_65_, (float) i_66_, 100.0F, 100.0F, 100.0F, i_49_);
			C(true);
		}
	}
	
	final void a(java.awt.Canvas canvas) {
		if (canvas != null) {
			GraphicsBuffer graphicsbuffer = (GraphicsBuffer) aHashTable6753.method1518(3512, (long) canvas.hashCode());
			if (graphicsbuffer != null) {
				aCanvas6755 = canvas;
				Dimension dimension = canvas.getSize();
				anInt6752 = dimension.width;
				anInt6758 = dimension.height;
				aGraphicsBuffer6756 = graphicsbuffer;
				if (aClass64_6771 == null) {
					anIntArray6787 = graphicsbuffer.anIntArray7145;
					anInt6789 = graphicsbuffer.anInt7146;
					anInt6791 = graphicsbuffer.anInt7142;
					if (anInt6789 != anInt6765 || anInt6791 != anInt6783) {
						anInt6773 = anInt6765 = anInt6789;
						anInt6770 = anInt6783 = anInt6791;
						aFloatArray6792 = aFloatArray6782 = new float[anInt6765 * anInt6783];
					}
					method1496();
				}
			}
		} else {
			aCanvas6755 = null;
			aGraphicsBuffer6756 = null;
			if (aClass64_6771 == null) {
				anIntArray6787 = null;
				anInt6789 = anInt6791 = 1;
				anInt6765 = anInt6783 = 1;
				method1496();
			}
		}
	}
	
	private final void method1490(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		if (i >= anInt6767 && i < anInt6778) {
			int i_78_ = i + i_71_ * anInt6789;
			int i_79_ = i_73_ >>> 24;
			int i_80_ = i_75_ + i_76_;
			int i_81_ = i_77_ % i_80_;
			if (i_74_ == 0 || i_74_ == 1 && i_79_ == 255) {
				int i_82_ = 0;
				while (i_82_ < i_72_) {
					if (i_71_ + i_82_ >= anInt6760 && i_71_ + i_82_ < anInt6772 && i_81_ < i_75_) {
						anIntArray6787[i_78_ + i_82_ * anInt6789] = i_73_;
					}
					i_82_++;
					i_81_ = ++i_81_ % i_80_;
				}
			} else if (i_74_ == 1) {
				i_73_ = ((i_73_ & 0xff00ff) * i_79_ >> 8 & 0xff00ff) + ((i_73_ & 0xff00) * i_79_ >> 8 & 0xff00) + (i_79_ << 24);
				int i_83_ = 256 - i_79_;
				int i_84_ = 0;
				while (i_84_ < i_72_) {
					if (i_71_ + i_84_ >= anInt6760 && i_71_ + i_84_ < anInt6772 && i_81_ < i_75_) {
						int i_85_ = i_78_ + i_84_ * anInt6789;
						int i_86_ = anIntArray6787[i_85_];
						i_86_ = ((i_86_ & 0xff00ff) * i_83_ >> 8 & 0xff00ff) + ((i_86_ & 0xff00) * i_83_ >> 8 & 0xff00);
						anIntArray6787[i_85_] = i_73_ + i_86_;
					}
					i_84_++;
					i_81_ = ++i_81_ % i_80_;
				}
			} else if (i_74_ == 2) {
				int i_87_ = 0;
				while (i_87_ < i_72_) {
					if (i_71_ + i_87_ >= anInt6760 && i_71_ + i_87_ < anInt6772 && i_81_ < i_75_) {
						int i_88_ = i_78_ + i_87_ * anInt6789;
						int i_89_ = anIntArray6787[i_88_];
						int i_90_ = i_73_ + i_89_;
						int i_91_ = (i_73_ & 0xff00ff) + (i_89_ & 0xff00ff);
						i_89_ = (i_91_ & 0x1000100) + (i_90_ - i_91_ & 0x10000);
						anIntArray6787[i_88_] = i_90_ - i_89_ | i_89_ - (i_89_ >>> 8);
					}
					i_87_++;
					i_81_ = ++i_81_ % i_80_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void ya() {
		if (anInt6767 == 0 && anInt6778 == anInt6789 && anInt6760 == 0 && anInt6772 == anInt6791) {
			int i = aFloatArray6782.length;
			int i_92_ = i - (i & 0x7);
			int i_93_ = 0;
			while (i_93_ < i_92_) {
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
				aFloatArray6782[i_93_++] = 2.14748365E9F;
			}
			while (i_93_ < i)
				aFloatArray6782[i_93_++] = 2.14748365E9F;
		} else {
			int i = anInt6778 - anInt6767;
			int i_94_ = anInt6772 - anInt6760;
			int i_95_ = anInt6789 - i;
			int i_96_ = anInt6767 + anInt6760 * anInt6789;
			int i_97_ = i >> 3;
			int i_98_ = i & 0x7;
			i = i_96_ - 1;
			for (int i_99_ = -i_94_; i_99_ < 0; i_99_++) {
				if (i_97_ > 0) {
					int i_100_ = i_97_;
					do {
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
						aFloatArray6782[++i] = 2.14748365E9F;
					} while (--i_100_ > 0);
				}
				if (i_98_ > 0) {
					int i_101_ = i_98_;
					do
						aFloatArray6782[++i] = 2.14748365E9F;
					while (--i_101_ > 0);
				}
				i += i_95_;
			}
		}
	}
	
	final void a(Interface6 interface6) {
		Class64 class64 = (Class64) interface6;
		anInt6789 = class64.anInt5041;
		anInt6791 = class64.anInt5037;
		anIntArray6787 = class64.anIntArray5042;
		aClass64_6771 = class64;
		anInt6765 = class64.anInt5041;
		anInt6783 = class64.anInt5037;
		aFloatArray6782 = class64.aFloatArray5049;
		method1496();
	}
	
	final boolean b() {
		return true;
	}
	
	final void a(Class198 class198, int i) {
		Class374 class374 = method1494(Thread.currentThread());
		EntityNode_Sub3 entitynode_sub3 = class198.aClass87_2429.anEntityNode_Sub3_1186;
		for (EntityNode_Sub3 entitynode_sub3_102_ = entitynode_sub3.anEntityNode_Sub3_5961; entitynode_sub3_102_ != entitynode_sub3; entitynode_sub3_102_ = entitynode_sub3_102_.anEntityNode_Sub3_5961) {
			EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) entitynode_sub3_102_;
			int i_103_ = entitynode_sub3_sub2.anInt9174 >> 12;
			int i_104_ = entitynode_sub3_sub2.anInt9171 >> 12;
			int i_105_ = entitynode_sub3_sub2.anInt9173 >> 12;
			float f = aClass336_Sub2_6788.aFloat8589 + (aClass336_Sub2_6788.aFloat8577 * (float) i_103_ + aClass336_Sub2_6788.aFloat8567 * (float) i_104_ + aClass336_Sub2_6788.aFloat8584 * (float) i_105_);
			if (!(f < (float) anInt6798) && !(f > (float) class374.anInt4618)) {
				int i_106_ = anInt6786 + (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8583 + (aClass336_Sub2_6788.aFloat8580 * (float) i_103_ + aClass336_Sub2_6788.aFloat8571 * (float) i_104_ + aClass336_Sub2_6788.aFloat8566 * (float) i_105_)) / (float) i);
				int i_107_ = anInt6769 + (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8579 + (aClass336_Sub2_6788.aFloat8578 * (float) i_103_ + aClass336_Sub2_6788.aFloat8561 * (float) i_104_ + aClass336_Sub2_6788.aFloat8558 * (float) i_105_)) / (float) i);
				if (i_106_ >= anInt6767 && i_106_ <= anInt6778 && i_107_ >= anInt6760 && i_107_ <= anInt6772) {
					if (f == 0.0F) {
						f = 1.0F;
					}
					method1491(entitynode_sub3_sub2, i_106_, i_107_, (int) f, (entitynode_sub3_sub2.anInt9172 * anInt6785 >> 12) / i);
				}
			}
		}
	}
	
	private final void method1491(EntityNode_Sub3_Sub2 entitynode_sub3_sub2, int i, int i_108_, int i_109_, int i_110_) {
		int i_111_ = entitynode_sub3_sub2.anInt9177;
		int i_112_ = i_110_;
		i_110_ <<= 1;
		if (i_111_ == -1) {
			method1497(i, i_108_, i_109_, i_112_, entitynode_sub3_sub2.anInt9176, 1);
		} else {
			if (anInt6800 != i_111_) {
				GLSprite glsprite = (GLSprite) aClass61_6762.method607((long) i_111_, 0);
				if (glsprite == null) {
					int[] is = method1495(i_111_);
					if (is != null) {
						int i_113_ = method1505(i_111_) ? 64 : anInt6775;
						glsprite = this.method1235(i_113_, i_113_, i_113_, is, 0, 7468);
						aClass61_6762.method601(glsprite, 25566, (long) i_111_);
					} else {
						return;
					}
				}
				anInt6800 = i_111_;
				aGLSprite6799 = glsprite;
			}
			i_110_++;
			((GLSprite_Sub2) aGLSprite6799).method1208(i - i_112_, i_108_ - i_112_, i_109_, i_110_, i_110_, 0, entitynode_sub3_sub2.anInt9176, 1, 1);
		}
	}
	
	final void F(int i, int i_114_) {
		int i_115_ = i_114_ * anInt6789 + i;
		int i_116_ = i_114_ * anInt6765 + i;
		if (i_115_ != 0 || i_116_ != 0) {
			int[] is = anIntArray6787;
			float[] fs = aFloatArray6782;
			if (i_115_ < 0) {
				int i_117_ = is.length + i_115_;
				Class311.method3609(is, -i_115_, is, 0, i_117_);
			} else if (i_115_ > 0) {
				int i_118_ = is.length - i_115_;
				Class311.method3609(is, 0, is, i_115_, i_118_);
			}
			if (i_116_ < 0) {
				int i_119_ = fs.length + i_116_;
				Class311.method3603(fs, -i_116_, fs, 0, i_119_);
			} else if (i_116_ > 0) {
				int i_120_ = fs.length - i_116_;
				Class311.method3603(fs, 0, fs, i_116_, i_120_);
			}
		}
	}
	
	final boolean method1492() {
		return aBoolean6759;
	}
	
	final void za(int i, int i_121_, int i_122_, int i_123_, int i_124_) {
		if (i_122_ < 0) {
			i_122_ = -i_122_;
		}
		int i_125_ = i_121_ - i_122_;
		if (i_125_ < anInt6760) {
			i_125_ = anInt6760;
		}
		int i_126_ = i_121_ + i_122_ + 1;
		if (i_126_ > anInt6772) {
			i_126_ = anInt6772;
		}
		int i_127_ = i_125_;
		int i_128_ = i_122_ * i_122_;
		int i_129_ = 0;
		int i_130_ = i_121_ - i_127_;
		int i_131_ = i_130_ * i_130_;
		int i_132_ = i_131_ - i_130_;
		if (i_121_ > i_126_) {
			i_121_ = i_126_;
		}
		int i_133_ = i_123_ >>> 24;
		if (i_124_ == 0 || i_124_ == 1 && i_133_ == 255) {
			while (i_127_ < i_121_) {
				for (/**/; i_132_ <= i_128_ || i_131_ <= i_128_; i_132_ += i_129_++ + i_129_)
					i_131_ += i_129_ + i_129_;
				int i_134_ = i - i_129_ + 1;
				if (i_134_ < anInt6767) {
					i_134_ = anInt6767;
				}
				int i_135_ = i + i_129_;
				if (i_135_ > anInt6778) {
					i_135_ = anInt6778;
				}
				int i_136_ = i_134_ + i_127_ * anInt6789;
				for (int i_137_ = i_134_; i_137_ < i_135_; i_137_++)
					anIntArray6787[i_136_++] = i_123_;
				i_127_++;
				i_131_ -= i_130_-- + i_130_;
				i_132_ -= i_130_ + i_130_;
			}
			i_129_ = i_122_;
			i_130_ = i_127_ - i_121_;
			i_132_ = i_130_ * i_130_ + i_128_;
			i_131_ = i_132_ - i_129_;
			i_132_ -= i_130_;
			while (i_127_ < i_126_) {
				while (i_132_ > i_128_) {
					if (i_131_ <= i_128_) {
						break;
					}
					i_132_ -= i_129_-- + i_129_;
					i_131_ -= i_129_ + i_129_;
				}
				int i_138_ = i - i_129_;
				if (i_138_ < anInt6767) {
					i_138_ = anInt6767;
				}
				int i_139_ = i + i_129_;
				if (i_139_ > anInt6778 - 1) {
					i_139_ = anInt6778 - 1;
				}
				int i_140_ = i_138_ + i_127_ * anInt6789;
				for (int i_141_ = i_138_; i_141_ <= i_139_; i_141_++)
					anIntArray6787[i_140_++] = i_123_;
				i_127_++;
				i_132_ += i_130_ + i_130_;
				i_131_ += i_130_++ + i_130_;
			}
		} else if (i_124_ == 1) {
			i_123_ = ((i_123_ & 0xff00ff) * i_133_ >> 8 & 0xff00ff) + ((i_123_ & 0xff00) * i_133_ >> 8 & 0xff00) + (i_133_ << 24);
			int i_142_ = 256 - i_133_;
			while (i_127_ < i_121_) {
				for (/**/; i_132_ <= i_128_ || i_131_ <= i_128_; i_132_ += i_129_++ + i_129_)
					i_131_ += i_129_ + i_129_;
				int i_143_ = i - i_129_ + 1;
				if (i_143_ < anInt6767) {
					i_143_ = anInt6767;
				}
				int i_144_ = i + i_129_;
				if (i_144_ > anInt6778) {
					i_144_ = anInt6778;
				}
				int i_145_ = i_143_ + i_127_ * anInt6789;
				for (int i_146_ = i_143_; i_146_ < i_144_; i_146_++) {
					int i_147_ = anIntArray6787[i_145_];
					i_147_ = ((i_147_ & 0xff00ff) * i_142_ >> 8 & 0xff00ff) + ((i_147_ & 0xff00) * i_142_ >> 8 & 0xff00);
					anIntArray6787[i_145_++] = i_123_ + i_147_;
				}
				i_127_++;
				i_131_ -= i_130_-- + i_130_;
				i_132_ -= i_130_ + i_130_;
			}
			i_129_ = i_122_;
			i_130_ = -i_130_;
			i_132_ = i_130_ * i_130_ + i_128_;
			i_131_ = i_132_ - i_129_;
			i_132_ -= i_130_;
			while (i_127_ < i_126_) {
				while (i_132_ > i_128_) {
					if (i_131_ <= i_128_) {
						break;
					}
					i_132_ -= i_129_-- + i_129_;
					i_131_ -= i_129_ + i_129_;
				}
				int i_148_ = i - i_129_;
				if (i_148_ < anInt6767) {
					i_148_ = anInt6767;
				}
				int i_149_ = i + i_129_;
				if (i_149_ > anInt6778 - 1) {
					i_149_ = anInt6778 - 1;
				}
				int i_150_ = i_148_ + i_127_ * anInt6789;
				for (int i_151_ = i_148_; i_151_ <= i_149_; i_151_++) {
					int i_152_ = anIntArray6787[i_150_];
					i_152_ = ((i_152_ & 0xff00ff) * i_142_ >> 8 & 0xff00ff) + ((i_152_ & 0xff00) * i_142_ >> 8 & 0xff00);
					anIntArray6787[i_150_++] = i_123_ + i_152_;
				}
				i_127_++;
				i_132_ += i_130_ + i_130_;
				i_131_ += i_130_++ + i_130_;
			}
		} else if (i_124_ == 2) {
			while (i_127_ < i_121_) {
				for (/**/; i_132_ <= i_128_ || i_131_ <= i_128_; i_132_ += i_129_++ + i_129_)
					i_131_ += i_129_ + i_129_;
				int i_153_ = i - i_129_ + 1;
				if (i_153_ < anInt6767) {
					i_153_ = anInt6767;
				}
				int i_154_ = i + i_129_;
				if (i_154_ > anInt6778) {
					i_154_ = anInt6778;
				}
				int i_155_ = i_153_ + i_127_ * anInt6789;
				for (int i_156_ = i_153_; i_156_ < i_154_; i_156_++) {
					int i_157_ = anIntArray6787[i_155_];
					int i_158_ = i_123_ + i_157_;
					int i_159_ = (i_123_ & 0xff00ff) + (i_157_ & 0xff00ff);
					i_157_ = (i_159_ & 0x1000100) + (i_158_ - i_159_ & 0x10000);
					anIntArray6787[i_155_++] = i_158_ - i_157_ | i_157_ - (i_157_ >>> 8);
				}
				i_127_++;
				i_131_ -= i_130_-- + i_130_;
				i_132_ -= i_130_ + i_130_;
			}
			i_129_ = i_122_;
			i_130_ = -i_130_;
			i_132_ = i_130_ * i_130_ + i_128_;
			i_131_ = i_132_ - i_129_;
			i_132_ -= i_130_;
			while (i_127_ < i_126_) {
				while (i_132_ > i_128_) {
					if (i_131_ <= i_128_) {
						break;
					}
					i_132_ -= i_129_-- + i_129_;
					i_131_ -= i_129_ + i_129_;
				}
				int i_160_ = i - i_129_;
				if (i_160_ < anInt6767) {
					i_160_ = anInt6767;
				}
				int i_161_ = i + i_129_;
				if (i_161_ > anInt6778 - 1) {
					i_161_ = anInt6778 - 1;
				}
				int i_162_ = i_160_ + i_127_ * anInt6789;
				for (int i_163_ = i_160_; i_163_ <= i_161_; i_163_++) {
					int i_164_ = anIntArray6787[i_162_];
					int i_165_ = i_123_ + i_164_;
					int i_166_ = (i_123_ & 0xff00ff) + (i_164_ & 0xff00ff);
					i_164_ = (i_166_ & 0x1000100) + (i_165_ - i_166_ & 0x10000);
					anIntArray6787[i_162_++] = i_165_ - i_164_ | i_164_ - (i_164_ >>> 8);
				}
				i_127_++;
				i_132_ += i_130_ + i_130_;
				i_131_ += i_130_++ + i_130_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final boolean o() {
		return false;
	}
	
	final boolean l() {
		return true;
	}
	
	final void DA(int i, int i_167_, int i_168_, int i_169_) {
		anInt6786 = i;
		anInt6769 = i_167_;
		anInt6785 = i_168_;
		anInt6763 = i_169_;
		method1506();
	}
	
	final void aa(int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_) {
		if (i < anInt6767) {
			i_171_ -= anInt6767 - i;
			i = anInt6767;
		}
		if (i_170_ < anInt6760) {
			i_172_ -= anInt6760 - i_170_;
			i_170_ = anInt6760;
		}
		if (i + i_171_ > anInt6778) {
			i_171_ = anInt6778 - i;
		}
		if (i_170_ + i_172_ > anInt6772) {
			i_172_ = anInt6772 - i_170_;
		}
		if (i_171_ > 0 && i_172_ > 0 && i <= anInt6778 && i_170_ <= anInt6772) {
			int i_175_ = anInt6789 - i_171_;
			int i_176_ = i + i_170_ * anInt6789;
			int i_177_ = i_173_ >>> 24;
			if (i_174_ == 0 || i_174_ == 1 && i_177_ == 255) {
				int i_178_ = i_171_ >> 3;
				int i_179_ = i_171_ & 0x7;
				i_171_ = i_176_ - 1;
				for (int i_180_ = -i_172_; i_180_ < 0; i_180_++) {
					if (i_178_ > 0) {
						i = i_178_;
						do {
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
							anIntArray6787[++i_171_] = i_173_;
						} while (--i > 0);
					}
					if (i_179_ > 0) {
						i = i_179_;
						do
							anIntArray6787[++i_171_] = i_173_;
						while (--i > 0);
					}
					i_171_ += i_175_;
				}
			} else if (i_174_ == 1) {
				i_173_ = ((i_173_ & 0xff00ff) * i_177_ >> 8 & 0xff00ff) + (((i_173_ & ~0xff00ff) >>> 8) * i_177_ & ~0xff00ff);
				int i_181_ = 256 - i_177_;
				for (int i_182_ = 0; i_182_ < i_172_; i_182_++) {
					for (int i_183_ = -i_171_; i_183_ < 0; i_183_++) {
						int i_184_ = anIntArray6787[i_176_];
						i_184_ = ((i_184_ & 0xff00ff) * i_181_ >> 8 & 0xff00ff) + (((i_184_ & ~0xff00ff) >>> 8) * i_181_ & ~0xff00ff);
						anIntArray6787[i_176_++] = i_173_ + i_184_;
					}
					i_176_ += i_175_;
				}
			} else if (i_174_ == 2) {
				for (int i_185_ = 0; i_185_ < i_172_; i_185_++) {
					for (int i_186_ = -i_171_; i_186_ < 0; i_186_++) {
						int i_187_ = anIntArray6787[i_176_];
						int i_188_ = i_173_ + i_187_;
						int i_189_ = (i_173_ & 0xff00ff) + (i_187_ & 0xff00ff);
						i_187_ = (i_189_ & 0x1000100) + (i_188_ - i_189_ & 0x10000);
						anIntArray6787[i_176_++] = i_188_ - i_187_ | i_187_ - (i_187_ >>> 8);
					}
					i_176_ += i_175_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void GA(int i) {
		aa(0, 0, anInt6789, anInt6791, i, 0);
	}
	
	final void a(java.awt.Canvas canvas, int i, int i_190_) {
		GraphicsBuffer graphicsbuffer = (GraphicsBuffer) aHashTable6753.method1518(3512, (long) canvas.hashCode());
		if (graphicsbuffer != null) {
			graphicsbuffer.method2160((byte) 56);
			graphicsbuffer = Class284.method3391(i_190_, canvas, 38, i);
			aHashTable6753.method1515((long) canvas.hashCode(), graphicsbuffer, -125);
			if (aCanvas6755 == canvas && aClass64_6771 == null) {
				Dimension dimension = canvas.getSize();
				anInt6752 = dimension.width;
				anInt6758 = dimension.height;
				aGraphicsBuffer6756 = graphicsbuffer;
				anIntArray6787 = graphicsbuffer.anIntArray7145;
				anInt6789 = graphicsbuffer.anInt7146;
				anInt6791 = graphicsbuffer.anInt7142;
				if (anInt6789 != anInt6765 || anInt6791 != anInt6783) {
					anInt6773 = anInt6765 = anInt6789;
					anInt6770 = anInt6783 = anInt6791;
					aFloatArray6792 = aFloatArray6782 = new float[anInt6765 * anInt6783];
				}
				method1496();
			}
		}
	}
	
	final Interface20 d(int i, int i_191_) {
		return new Class131(i, i_191_);
	}
	
	final Class336 n() {
		return aClass336_Sub2_6788;
	}
	
	final void h() {
		/* empty */
	}
	
	final void a(int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_) {
		Class374 class374 = method1494(Thread.currentThread());
		Class185 class185 = class374.aClass185_4627;
		class185.aBoolean2226 = false;
		i -= anInt6793;
		i_194_ -= anInt6793;
		i_197_ -= anInt6793;
		i_192_ -= anInt6790;
		i_195_ -= anInt6790;
		i_198_ -= anInt6790;
		class185.aBoolean2217 = i < 0 || i > class185.anInt2222 || i_194_ < 0 || i_194_ > class185.anInt2222 || i_197_ < 0 || i_197_ > class185.anInt2222;
		int i_204_ = i_200_ >>> 24;
		if (i_203_ == 0 || i_203_ == 1 && i_204_ == 255) {
			class185.anInt2220 = 0;
			class185.aBoolean2212 = false;
			class185.method1850((float) i_192_, (float) i_195_, (float) i_198_, (float) i, (float) i_194_, (float) i_197_, (float) i_193_, (float) i_196_, (float) i_199_, i_200_, i_201_, i_202_);
		} else if (i_203_ == 1) {
			class185.anInt2220 = 255 - i_204_;
			class185.aBoolean2212 = false;
			class185.method1850((float) i_192_, (float) i_195_, (float) i_198_, (float) i, (float) i_194_, (float) i_197_, (float) i_193_, (float) i_196_, (float) i_199_, i_200_, i_201_, i_202_);
		} else if (i_203_ == 2) {
			class185.anInt2220 = 128;
			class185.aBoolean2212 = true;
			class185.method1850((float) i_192_, (float) i_195_, (float) i_198_, (float) i, (float) i_194_, (float) i_197_, (float) i_193_, (float) i_196_, (float) i_199_, i_200_, i_201_, i_202_);
		} else {
			throw new IllegalArgumentException();
		}
		class185.aBoolean2226 = true;
	}
	
	final int XA() {
		return anInt6776;
	}
	
	final int b(int i, int i_205_) {
		i |= 0x20800;
		return i & i_205_ ^ i_205_;
	}
	
	final int[] Y() {
		return new int[] { anInt6786, anInt6769, anInt6785, anInt6763 };
	}
	
	final DrawableModel a(Model model, int i, int i_206_, int i_207_, int i_208_) {
		return new PureJavaDrawableModel(this, model, i, i_207_, i_208_, i_206_);
	}
	
	final boolean B() {
		return false;
	}
	
	final boolean method1493(int i) {
		return aD1543.method7(9900, i);
	}
	
	final Class374 method1494(Runnable runnable) {
		for (int i = 0; i < anInt6795; i++) {
			if (aClass374Array6777[i].aRunnable4622 == runnable) {
				return aClass374Array6777[i];
			}
		}
		return null;
	}
	
	final void f(int i, int i_209_) {
		Class374 class374 = method1494(Thread.currentThread());
		anInt6798 = i;
		anInt6776 = i_209_;
		class374.anInt4618 = anInt6776 - 255;
	}
	
	final void P(int i, int i_210_, int i_211_, int i_212_, int i_213_) {
		if (i >= anInt6767 && i < anInt6778) {
			if (i_210_ < anInt6760) {
				i_211_ -= anInt6760 - i_210_;
				i_210_ = anInt6760;
			}
			if (i_210_ + i_211_ > anInt6772) {
				i_211_ = anInt6772 - i_210_;
			}
			int i_214_ = i + i_210_ * anInt6789;
			int i_215_ = i_212_ >>> 24;
			if (i_213_ == 0 || i_213_ == 1 && i_215_ == 255) {
				for (int i_216_ = 0; i_216_ < i_211_; i_216_++)
					anIntArray6787[i_214_ + i_216_ * anInt6789] = i_212_;
			} else if (i_213_ == 1) {
				i_212_ = ((i_212_ & 0xff00ff) * i_215_ >> 8 & 0xff00ff) + ((i_212_ & 0xff00) * i_215_ >> 8 & 0xff00) + (i_215_ << 24);
				int i_217_ = 256 - i_215_;
				for (int i_218_ = 0; i_218_ < i_211_; i_218_++) {
					int i_219_ = i_214_ + i_218_ * anInt6789;
					int i_220_ = anIntArray6787[i_219_];
					i_220_ = ((i_220_ & 0xff00ff) * i_217_ >> 8 & 0xff00ff) + ((i_220_ & 0xff00) * i_217_ >> 8 & 0xff00);
					anIntArray6787[i_219_] = i_212_ + i_220_;
				}
			} else if (i_213_ == 2) {
				for (int i_221_ = 0; i_221_ < i_211_; i_221_++) {
					int i_222_ = i_214_ + i_221_ * anInt6789;
					int i_223_ = anIntArray6787[i_222_];
					int i_224_ = i_212_ + i_223_;
					int i_225_ = (i_212_ & 0xff00ff) + (i_223_ & 0xff00ff);
					i_223_ = (i_225_ & 0x1000100) + (i_224_ - i_225_ & 0x10000);
					anIntArray6787[i_222_] = i_224_ - i_223_ | i_223_ - (i_223_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void a(boolean bool) {
		aBoolean6794 = bool;
		aClass61_6781.method608(false);
	}
	
	final Class336 A() {
		Class374 class374 = method1494(Thread.currentThread());
		return class374.aClass336_Sub2_4619;
	}
	
	final void d() {
		/* empty */
	}
	
	final void d(int i, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_) {
		U(i, i_226_, i_227_, i_229_, i_230_);
		U(i, i_226_ + i_228_ - 1, i_227_, i_229_, i_230_);
		P(i, i_226_ + 1, i_228_ - 2, i_229_, i_230_);
		P(i + i_227_ - 1, i_226_ + 1, i_228_ - 2, i_229_, i_230_);
	}
	
	final void U(int i, int i_231_, int i_232_, int i_233_, int i_234_) {
		if (i_231_ >= anInt6760 && i_231_ < anInt6772) {
			if (i < anInt6767) {
				i_232_ -= anInt6767 - i;
				i = anInt6767;
			}
			if (i + i_232_ > anInt6778) {
				i_232_ = anInt6778 - i;
			}
			int i_235_ = i + i_231_ * anInt6789;
			int i_236_ = i_233_ >>> 24;
			if (i_234_ == 0 || i_234_ == 1 && i_236_ == 255) {
				for (int i_237_ = 0; i_237_ < i_232_; i_237_++)
					anIntArray6787[i_235_ + i_237_] = i_233_;
			} else if (i_234_ == 1) {
				i_233_ = ((i_233_ & 0xff00ff) * i_236_ >> 8 & 0xff00ff) + ((i_233_ & 0xff00) * i_236_ >> 8 & 0xff00) + (i_236_ << 24);
				int i_238_ = 256 - i_236_;
				for (int i_239_ = 0; i_239_ < i_232_; i_239_++) {
					int i_240_ = anIntArray6787[i_235_ + i_239_];
					i_240_ = ((i_240_ & 0xff00ff) * i_238_ >> 8 & 0xff00ff) + ((i_240_ & 0xff00) * i_238_ >> 8 & 0xff00);
					anIntArray6787[i_235_ + i_239_] = i_233_ + i_240_;
				}
			} else if (i_234_ == 2) {
				for (int i_241_ = 0; i_241_ < i_232_; i_241_++) {
					int i_242_ = anIntArray6787[i_235_ + i_241_];
					int i_243_ = i_233_ + i_242_;
					int i_244_ = (i_233_ & 0xff00ff) + (i_242_ & 0xff00ff);
					i_242_ = (i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000);
					anIntArray6787[i_235_ + i_241_] = i_243_ - i_242_ | i_242_ - (i_242_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void ZA(int i, float f, float f_245_, float f_246_, float f_247_, float f_248_) {
		anInt6766 = (int) (f * 65535.0F);
		anInt6761 = (int) (f_245_ * 65535.0F);
		float f_249_ = (float) Math.sqrt((double) (f_246_ * f_246_ + f_247_ * f_247_ + f_248_ * f_248_));
		anInt6764 = (int) (f_246_ * 65535.0F / f_249_);
		anInt6784 = (int) (f_247_ * 65535.0F / f_249_);
		anInt6774 = (int) (f_248_ * 65535.0F / f_249_);
	}
	
	final void C(boolean bool) {
		Class374 class374 = method1494(Thread.currentThread());
		class374.aBoolean4615 = bool;
	}
	
	final void q() {
		aClass61_6781.method608(false);
		aClass61_6762.method608(false);
	}
	
	final int[] method1495(int i) {
		Node_Sub22 node_sub22;
		synchronized (aClass61_6781) {
			node_sub22 = (Node_Sub22) aClass61_6781.method607((long) i | ~0x7fffffffffffffffL, 0);
			if (node_sub22 == null) {
				if (!aD1543.method7(9900, i)) {
					return null;
				}
				Class91 class91 = aD1543.method10(i, -8217);
				int i_250_ = class91.aBoolean1204 || aBoolean6794 ? 64 : anInt6775;
				node_sub22 = new Node_Sub22(i, i_250_, aD1543.method8(0.7F, i, i_250_, false, true, i_250_), class91.anInt1226 != 1);
				aClass61_6781.method601(node_sub22, 25566, (long) i | ~0x7fffffffffffffffL);
			}
		}
		node_sub22.aBoolean7193 = true;
		return node_sub22.method2619();
	}
	
	final void f() {
		/* empty */
	}
	
	final void A(int i, aa var_aa, int i_251_, int i_252_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray5487;
		int[] is_253_ = var_aa_Sub1.anIntArray5488;
		int i_254_;
		if (anInt6772 < i_252_ + is.length) {
			i_254_ = anInt6772 - i_252_;
		} else {
			i_254_ = is.length;
		}
		int i_255_;
		if (anInt6760 > i_252_) {
			i_255_ = anInt6760 - i_252_;
			i_252_ = anInt6760;
		} else {
			i_255_ = 0;
		}
		if (i_254_ - i_255_ > 0) {
			int i_256_ = i_252_ * anInt6789;
			for (int i_257_ = i_255_; i_257_ < i_254_; i_257_++) {
				int i_258_ = i_251_ + is[i_257_];
				int i_259_ = is_253_[i_257_];
				if (anInt6767 > i_258_) {
					i_259_ -= anInt6767 - i_258_;
					i_258_ = anInt6767;
				}
				if (anInt6778 < i_258_ + i_259_) {
					i_259_ = anInt6778 - i_258_;
				}
				i_258_ += i_256_;
				for (int i_260_ = -i_259_; i_260_ < 0; i_260_++)
					anIntArray6787[i_258_++] = i;
				i_256_ += anInt6789;
			}
		}
	}
	
	final void a(int i, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_, int i_268_) {
		i_262_ -= i;
		i_263_ -= i_261_;
		if (i_263_ == 0) {
			if (i_262_ >= 0) {
				method1501(i, i_261_, i_262_ + 1, i_264_, i_265_, i_266_, i_267_, i_268_);
			} else {
				int i_269_ = i_266_ + i_267_;
				i_268_ %= i_269_;
				i_268_ = i_269_ + i_266_ - i_268_ - (-i_262_ + 1) % i_269_;
				i_268_ %= i_269_;
				if (i_268_ < 0) {
					i_268_ += i_269_;
				}
				method1501(i + i_262_, i_261_, -i_262_ + 1, i_264_, i_265_, i_266_, i_267_, i_268_);
			}
		} else if (i_262_ == 0) {
			if (i_263_ >= 0) {
				method1490(i, i_261_, i_263_ + 1, i_264_, i_265_, i_266_, i_267_, i_268_);
			} else {
				int i_270_ = i_266_ + i_267_;
				i_268_ %= i_270_;
				i_268_ = i_270_ + i_266_ - i_268_ - (-i_263_ + 1) % i_270_;
				i_268_ %= i_270_;
				if (i_268_ < 0) {
					i_268_ += i_270_;
				}
				method1490(i, i_261_ + i_263_, -i_263_ + 1, i_264_, i_265_, i_266_, i_267_, i_268_);
			}
		} else {
			i_268_ <<= 8;
			i_266_ <<= 8;
			i_267_ <<= 8;
			int i_271_ = i_266_ + i_267_;
			i_268_ %= i_271_;
			if (i_262_ + i_263_ < 0) {
				int i_272_ = (int) (Math.sqrt((double) (i_262_ * i_262_ + i_263_ * i_263_)) * 256.0);
				int i_273_ = i_272_ % i_271_;
				i_268_ = i_271_ + i_266_ - i_268_ - i_273_;
				i_268_ %= i_271_;
				if (i_268_ < 0) {
					i_268_ += i_271_;
				}
				i += i_262_;
				i_262_ = -i_262_;
				i_261_ += i_263_;
				i_263_ = -i_263_;
			}
			if (i_262_ > i_263_) {
				i_261_ <<= 16;
				i_261_ += 32768;
				i_263_ <<= 16;
				int i_274_ = (int) Math.floor((double) i_263_ / (double) i_262_ + 0.5);
				i_262_ += i;
				int i_275_ = i_264_ >>> 24;
				int i_276_ = (int) Math.sqrt((double) (65536 + (i_274_ >> 8) * (i_274_ >> 8)));
				if (i_265_ == 0 || i_265_ == 1 && i_275_ == 255) {
					while (i <= i_262_) {
						int i_277_ = i_261_ >> 16;
						if (i >= anInt6767 && i < anInt6778 && i_277_ >= anInt6760 && i_277_ < anInt6772 && i_268_ < i_266_) {
							anIntArray6787[i + i_277_ * anInt6789] = i_264_;
						}
						i_261_ += i_274_;
						i++;
						i_268_ += i_276_;
						i_268_ %= i_271_;
					}
					return;
				}
				if (i_265_ == 1) {
					i_264_ = ((i_264_ & 0xff00ff) * i_275_ >> 8 & 0xff00ff) + ((i_264_ & 0xff00) * i_275_ >> 8 & 0xff00) + (i_275_ << 24);
					int i_278_ = 256 - i_275_;
					while (i <= i_262_) {
						int i_279_ = i_261_ >> 16;
						if (i >= anInt6767 && i < anInt6778 && i_279_ >= anInt6760 && i_279_ < anInt6772 && i_268_ < i_266_) {
							int i_280_ = i + i_279_ * anInt6789;
							int i_281_ = anIntArray6787[i_280_];
							i_281_ = ((i_281_ & 0xff00ff) * i_278_ >> 8 & 0xff00ff) + ((i_281_ & 0xff00) * i_278_ >> 8 & 0xff00);
							anIntArray6787[i_280_] = i_264_ + i_281_;
						}
						i_261_ += i_274_;
						i++;
						i_268_ += i_276_;
						i_268_ %= i_271_;
					}
					return;
				}
				if (i_265_ == 2) {
					while (i <= i_262_) {
						int i_282_ = i_261_ >> 16;
						if (i >= anInt6767 && i < anInt6778 && i_282_ >= anInt6760 && i_282_ < anInt6772 && i_268_ < i_266_) {
							int i_283_ = i + i_282_ * anInt6789;
							int i_284_ = anIntArray6787[i_283_];
							int i_285_ = i_264_ + i_284_;
							int i_286_ = (i_264_ & 0xff00ff) + (i_284_ & 0xff00ff);
							i_284_ = (i_286_ & 0x1000100) + (i_285_ - i_286_ & 0x10000);
							anIntArray6787[i_283_] = i_285_ - i_284_ | i_284_ - (i_284_ >>> 8);
						}
						i_261_ += i_274_;
						i++;
						i_268_ += i_276_;
						i_268_ %= i_271_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_262_ <<= 16;
			int i_287_ = (int) Math.floor((double) i_262_ / (double) i_263_ + 0.5);
			i_263_ += i_261_;
			int i_288_ = i_264_ >>> 24;
			int i_289_ = (int) Math.sqrt((double) (65536 + (i_287_ >> 8) * (i_287_ >> 8)));
			if (i_265_ == 0 || i_265_ == 1 && i_288_ == 255) {
				while (i_261_ <= i_263_) {
					int i_290_ = i >> 16;
					if (i_261_ >= anInt6760 && i_261_ < anInt6772 && i_290_ >= anInt6767 && i_290_ < anInt6778 && i_268_ < i_266_) {
						anIntArray6787[i_290_ + i_261_ * anInt6789] = i_264_;
					}
					i += i_287_;
					i_261_++;
					i_268_ += i_289_;
					i_268_ %= i_271_;
				}
			} else if (i_265_ == 1) {
				i_264_ = ((i_264_ & 0xff00ff) * i_288_ >> 8 & 0xff00ff) + ((i_264_ & 0xff00) * i_288_ >> 8 & 0xff00) + (i_288_ << 24);
				int i_291_ = 256 - i_288_;
				while (i_261_ <= i_263_) {
					int i_292_ = i >> 16;
					if (i_261_ >= anInt6760 && i_261_ < anInt6772 && i_292_ >= anInt6767 && i_292_ < anInt6778 && i_268_ < i_266_) {
						int i_293_ = i_292_ + i_261_ * anInt6789;
						int i_294_ = anIntArray6787[i_293_];
						i_294_ = ((i_294_ & 0xff00ff) * i_291_ >> 8 & 0xff00ff) + ((i_294_ & 0xff00) * i_291_ >> 8 & 0xff00);
						anIntArray6787[i_292_ + i_261_ * anInt6789] = i_264_ + i_294_;
					}
					i += i_287_;
					i_261_++;
					i_268_ += i_289_;
					i_268_ %= i_271_;
				}
			} else if (i_265_ == 2) {
				while (i_261_ <= i_263_) {
					int i_295_ = i >> 16;
					if (i_261_ >= anInt6760 && i_261_ < anInt6772 && i_295_ >= anInt6767 && i_295_ < anInt6778 && i_268_ < i_266_) {
						int i_296_ = i_295_ + i_261_ * anInt6789;
						int i_297_ = anIntArray6787[i_296_];
						int i_298_ = i_264_ + i_297_;
						int i_299_ = (i_264_ & 0xff00ff) + (i_297_ & 0xff00ff);
						i_297_ = (i_299_ & 0x1000100) + (i_298_ - i_299_ & 0x10000);
						anIntArray6787[i_296_] = i_298_ - i_297_ | i_297_ - (i_297_ >>> 8);
					}
					i += i_287_;
					i_261_++;
					i_268_ += i_289_;
					i_268_ %= i_271_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void K(int[] is) {
		is[0] = anInt6767;
		is[1] = anInt6760;
		is[2] = anInt6778;
		is[3] = anInt6772;
	}
	
	final int i() {
		return anInt6798;
	}
	
	final Renderer c() {
		return new Renderer(0, "Pure Java", 1, "CPU", 0L);
	}
	
	final void f(int i) {
		anInt6775 = i;
		aClass61_6781.method608(false);
	}
	
	final void a(Rectangle[] rectangles, int i, int i_300_, int i_301_) throws Exception_Sub1 {
		if (aCanvas6755 == null || aGraphicsBuffer6756 == null) {
			throw new IllegalStateException("off");
		}
		try {
			Graphics graphics = aCanvas6755.getGraphics();
			for (int i_302_ = 0; i_302_ < i; i_302_++) {
				Rectangle rectangle = rectangles[i_302_];
				if (rectangle.x + i_300_ <= anInt6789 && rectangle.y + i_301_ <= anInt6791 && rectangle.x + i_300_ + rectangle.width > 0 && rectangle.y + i_301_ + rectangle.height > 0) {
					aGraphicsBuffer6756.method2597(rectangle.width, rectangle.x + i_300_, rectangle.x, false, graphics, rectangle.height, rectangle.y, rectangle.y + i_301_);
				}
			}
		} catch (Exception exception) {
			aCanvas6755.repaint();
		}
	}
	
	private final void method1496() {
		for (int i = 0; i < anInt6795; i++)
			aClass374Array6777[i].method4109(false);
		la();
	}
	
	final void a(za var_za) {
		/* empty */
	}
	
	final void k(int i) {
		aClass374Array6777[i].method4111(Thread.currentThread(), 0);
	}
	
	final boolean p() {
		return false;
	}
	
	final void a(int[] is) {
		is[0] = anInt6789;
		is[1] = anInt6791;
	}
	
	private PureJavaToolkit(d var_d) {
		super(var_d);
		aBoolean6757 = false;
		aHashTable6753 = new HashTable(4);
		anInt6760 = 0;
		anInt6763 = 512;
		anInt6780 = 75518;
		anInt6778 = 0;
		anInt6776 = 3500;
		anInt6775 = 128;
		anInt6772 = 0;
		anInt6766 = 45823;
		anInt6767 = 0;
		anInt6761 = 78642;
		aBoolean6794 = false;
		anInt6796 = 0;
		anInt6797 = 0;
		anInt6798 = 50;
		anInt6785 = 512;
		aClass61_6762 = new Class61(16);
		anInt6800 = -1;
		try {
			aClass61_6781 = new Class61(256);
			aClass336_Sub2_6788 = new Class336_Sub2();
			j(1);
			k(0);
			Class110.method1132(0, true, true);
			aBoolean6757 = true;
			anInt6754 = (int) Class313.method3650(false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1233(-7751);
			throw new RuntimeException("");
		}
	}
	
	final void a(int i, int i_303_, int i_304_, int i_305_) {
		/* empty */
	}
	
	final int c(int i, int i_306_) {
		return i | i_306_;
	}
	
	final Interface4 a(int i, int i_307_) {
		return a(i, i_307_, false);
	}
	
	final void H(int i, int i_308_, int i_309_, int[] is) {
		float f = aClass336_Sub2_6788.aFloat8589 + (aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_308_ + aClass336_Sub2_6788.aFloat8584 * (float) i_309_);
		if (f == 0.0F) {
			is[0] = is[1] = is[2] = -1;
		} else {
			int i_310_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8583 + (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_308_ + aClass336_Sub2_6788.aFloat8566 * (float) i_309_)) / f);
			int i_311_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8579 + (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_308_ + aClass336_Sub2_6788.aFloat8558 * (float) i_309_)) / f);
			is[0] = i_310_ - anInt6793;
			is[1] = i_311_ - anInt6790;
			is[2] = (int) f;
		}
	}
	
	final boolean x() {
		return false;
	}
	
	final void ra(int i, int i_312_, int i_313_, int i_314_) {
		for (int i_315_ = 0; i_315_ < aClass374Array6777.length; i_315_++) {
			aClass374Array6777[i_315_].anInt4616 = aClass374Array6777[i_315_].anInt4611;
			aClass374Array6777[i_315_].anInt4624 = i;
			aClass374Array6777[i_315_].anInt4611 = i_312_;
			aClass374Array6777[i_315_].anInt4620 = i_313_;
			aClass374Array6777[i_315_].aBoolean4617 = true;
		}
	}
	
	private final void method1497(int i, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
		if (i_318_ < 0) {
			i_318_ = -i_318_;
		}
		int i_321_ = i_316_ - i_318_;
		if (i_321_ < anInt6760) {
			i_321_ = anInt6760;
		}
		int i_322_ = i_316_ + i_318_ + 1;
		if (i_322_ > anInt6772) {
			i_322_ = anInt6772;
		}
		int i_323_ = i_321_;
		int i_324_ = i_318_ * i_318_;
		int i_325_ = 0;
		int i_326_ = i_316_ - i_323_;
		int i_327_ = i_326_ * i_326_;
		int i_328_ = i_327_ - i_326_;
		if (i_316_ > i_322_) {
			i_316_ = i_322_;
		}
		int i_329_ = i_319_ >>> 24;
		if (i_320_ == 0 || i_320_ == 1 && i_329_ == 255) {
			while (i_323_ < i_316_) {
				for (/**/; i_328_ <= i_324_ || i_327_ <= i_324_; i_328_ += i_325_++ + i_325_)
					i_327_ += i_325_ + i_325_;
				int i_330_ = i - i_325_ + 1;
				if (i_330_ < anInt6767) {
					i_330_ = anInt6767;
				}
				int i_331_ = i + i_325_;
				if (i_331_ > anInt6778) {
					i_331_ = anInt6778;
				}
				int i_332_ = i_330_ + i_323_ * anInt6789;
				for (int i_333_ = i_330_; i_333_ < i_331_; i_333_++) {
					if ((float) i_317_ < aFloatArray6782[i_332_]) {
						anIntArray6787[i_332_] = i_319_;
					}
					i_332_++;
				}
				i_323_++;
				i_327_ -= i_326_-- + i_326_;
				i_328_ -= i_326_ + i_326_;
			}
			i_325_ = i_318_;
			i_326_ = i_323_ - i_316_;
			i_328_ = i_326_ * i_326_ + i_324_;
			i_327_ = i_328_ - i_325_;
			i_328_ -= i_326_;
			while (i_323_ < i_322_) {
				while (i_328_ > i_324_) {
					if (i_327_ <= i_324_) {
						break;
					}
					i_328_ -= i_325_-- + i_325_;
					i_327_ -= i_325_ + i_325_;
				}
				int i_334_ = i - i_325_;
				if (i_334_ < anInt6767) {
					i_334_ = anInt6767;
				}
				int i_335_ = i + i_325_;
				if (i_335_ > anInt6778 - 1) {
					i_335_ = anInt6778 - 1;
				}
				int i_336_ = i_334_ + i_323_ * anInt6789;
				for (int i_337_ = i_334_; i_337_ <= i_335_; i_337_++) {
					if ((float) i_317_ < aFloatArray6782[i_336_]) {
						anIntArray6787[i_336_] = i_319_;
					}
					i_336_++;
				}
				i_323_++;
				i_328_ += i_326_ + i_326_;
				i_327_ += i_326_++ + i_326_;
			}
		} else if (i_320_ == 1) {
			i_319_ = ((i_319_ & 0xff00ff) * i_329_ >> 8 & 0xff00ff) + ((i_319_ & 0xff00) * i_329_ >> 8 & 0xff00) + (i_329_ << 24);
			int i_338_ = 256 - i_329_;
			while (i_323_ < i_316_) {
				for (/**/; i_328_ <= i_324_ || i_327_ <= i_324_; i_328_ += i_325_++ + i_325_)
					i_327_ += i_325_ + i_325_;
				int i_339_ = i - i_325_ + 1;
				if (i_339_ < anInt6767) {
					i_339_ = anInt6767;
				}
				int i_340_ = i + i_325_;
				if (i_340_ > anInt6778) {
					i_340_ = anInt6778;
				}
				int i_341_ = i_339_ + i_323_ * anInt6789;
				for (int i_342_ = i_339_; i_342_ < i_340_; i_342_++) {
					if ((float) i_317_ < aFloatArray6782[i_341_]) {
						int i_343_ = anIntArray6787[i_341_];
						i_343_ = ((i_343_ & 0xff00ff) * i_338_ >> 8 & 0xff00ff) + ((i_343_ & 0xff00) * i_338_ >> 8 & 0xff00);
						anIntArray6787[i_341_] = i_319_ + i_343_;
					}
					i_341_++;
				}
				i_323_++;
				i_327_ -= i_326_-- + i_326_;
				i_328_ -= i_326_ + i_326_;
			}
			i_325_ = i_318_;
			i_326_ = -i_326_;
			i_328_ = i_326_ * i_326_ + i_324_;
			i_327_ = i_328_ - i_325_;
			i_328_ -= i_326_;
			while (i_323_ < i_322_) {
				while (i_328_ > i_324_) {
					if (i_327_ <= i_324_) {
						break;
					}
					i_328_ -= i_325_-- + i_325_;
					i_327_ -= i_325_ + i_325_;
				}
				int i_344_ = i - i_325_;
				if (i_344_ < anInt6767) {
					i_344_ = anInt6767;
				}
				int i_345_ = i + i_325_;
				if (i_345_ > anInt6778 - 1) {
					i_345_ = anInt6778 - 1;
				}
				int i_346_ = i_344_ + i_323_ * anInt6789;
				for (int i_347_ = i_344_; i_347_ <= i_345_; i_347_++) {
					if ((float) i_317_ < aFloatArray6782[i_346_]) {
						int i_348_ = anIntArray6787[i_346_];
						i_348_ = ((i_348_ & 0xff00ff) * i_338_ >> 8 & 0xff00ff) + ((i_348_ & 0xff00) * i_338_ >> 8 & 0xff00);
						anIntArray6787[i_346_] = i_319_ + i_348_;
					}
					i_346_++;
				}
				i_323_++;
				i_328_ += i_326_ + i_326_;
				i_327_ += i_326_++ + i_326_;
			}
		} else if (i_320_ == 2) {
			while (i_323_ < i_316_) {
				for (/**/; i_328_ <= i_324_ || i_327_ <= i_324_; i_328_ += i_325_++ + i_325_)
					i_327_ += i_325_ + i_325_;
				int i_349_ = i - i_325_ + 1;
				if (i_349_ < anInt6767) {
					i_349_ = anInt6767;
				}
				int i_350_ = i + i_325_;
				if (i_350_ > anInt6778) {
					i_350_ = anInt6778;
				}
				int i_351_ = i_349_ + i_323_ * anInt6789;
				for (int i_352_ = i_349_; i_352_ < i_350_; i_352_++) {
					if ((float) i_317_ < aFloatArray6782[i_351_]) {
						int i_353_ = anIntArray6787[i_351_];
						int i_354_ = i_319_ + i_353_;
						int i_355_ = (i_319_ & 0xff00ff) + (i_353_ & 0xff00ff);
						i_353_ = (i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000);
						anIntArray6787[i_351_] = i_354_ - i_353_ | i_353_ - (i_353_ >>> 8);
					}
					i_351_++;
				}
				i_323_++;
				i_327_ -= i_326_-- + i_326_;
				i_328_ -= i_326_ + i_326_;
			}
			i_325_ = i_318_;
			i_326_ = -i_326_;
			i_328_ = i_326_ * i_326_ + i_324_;
			i_327_ = i_328_ - i_325_;
			i_328_ -= i_326_;
			while (i_323_ < i_322_) {
				while (i_328_ > i_324_) {
					if (i_327_ <= i_324_) {
						break;
					}
					i_328_ -= i_325_-- + i_325_;
					i_327_ -= i_325_ + i_325_;
				}
				int i_356_ = i - i_325_;
				if (i_356_ < anInt6767) {
					i_356_ = anInt6767;
				}
				int i_357_ = i + i_325_;
				if (i_357_ > anInt6778 - 1) {
					i_357_ = anInt6778 - 1;
				}
				int i_358_ = i_356_ + i_323_ * anInt6789;
				for (int i_359_ = i_356_; i_359_ <= i_357_; i_359_++) {
					if ((float) i_317_ < aFloatArray6782[i_358_]) {
						int i_360_ = anIntArray6787[i_358_];
						int i_361_ = i_319_ + i_360_;
						int i_362_ = (i_319_ & 0xff00ff) + (i_360_ & 0xff00ff);
						i_360_ = (i_362_ & 0x1000100) + (i_361_ - i_362_ & 0x10000);
						anIntArray6787[i_358_] = i_361_ - i_360_ | i_360_ - (i_360_ >>> 8);
					}
					i_358_++;
				}
				i_323_++;
				i_328_ += i_326_ + i_326_;
				i_327_ += i_326_++ + i_326_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final void KA(int i, int i_363_, int i_364_, int i_365_) {
		if (i < 0) {
			i = 0;
		}
		if (i_363_ < 0) {
			i_363_ = 0;
		}
		if (i_364_ > anInt6789) {
			i_364_ = anInt6789;
		}
		if (i_365_ > anInt6791) {
			i_365_ = anInt6791;
		}
		anInt6767 = i;
		anInt6778 = i_364_;
		anInt6760 = i_363_;
		anInt6772 = i_365_;
		method1506();
	}
	
	final aa a(int i, int i_366_, int[] is, int[] is_367_) {
		return new aa_Sub1(i, i_366_, is, is_367_);
	}
	
	final Class270 a(Class270 class270, Class270 class270_368_, float f, Class270 class270_369_) {
		return null;
	}
	
	final Node_Sub29 a(int i, int i_370_, int i_371_, int i_372_, int i_373_, float f) {
		return null;
	}
	
	final void da(int i, int i_374_, int i_375_, int[] is) {
		float f = aClass336_Sub2_6788.aFloat8589 + (aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_374_ + aClass336_Sub2_6788.aFloat8584 * (float) i_375_);
		if (f < (float) anInt6798 || f > (float) anInt6776) {
			is[0] = is[1] = is[2] = -1;
		} else {
			int i_376_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8583 + (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_374_ + aClass336_Sub2_6788.aFloat8566 * (float) i_375_)) / f);
			int i_377_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8579 + (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_374_ + aClass336_Sub2_6788.aFloat8558 * (float) i_375_)) / f);
			if (i_376_ >= anInt6793 && i_376_ <= anInt6768 && i_377_ >= anInt6790 && i_377_ <= anInt6779) {
				is[0] = i_376_ - anInt6793;
				is[1] = i_377_ - anInt6790;
				is[2] = (int) f;
			} else {
				is[0] = is[1] = is[2] = -1;
			}
		}
	}
	
	final void HA(int i, int i_378_, int i_379_, int i_380_, int[] is) {
		float f = aClass336_Sub2_6788.aFloat8589 + (aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_378_ + aClass336_Sub2_6788.aFloat8584 * (float) i_379_);
		if (f < (float) anInt6798 || f > (float) anInt6776) {
			is[0] = is[1] = is[2] = -1;
		} else {
			int i_381_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8583 + (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_378_ + aClass336_Sub2_6788.aFloat8566 * (float) i_379_)) / (float) i_380_);
			int i_382_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8579 + (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_378_ + aClass336_Sub2_6788.aFloat8558 * (float) i_379_)) / (float) i_380_);
			if (i_381_ >= anInt6793 && i_381_ <= anInt6768 && i_382_ >= anInt6790 && i_382_ <= anInt6779) {
				is[0] = i_381_ - anInt6793;
				is[1] = i_382_ - anInt6790;
				is[2] = (int) f;
			} else {
				is[0] = is[1] = is[2] = -1;
			}
		}
	}
	
	final boolean k() {
		return false;
	}
	
	final void c(int i) {
		aClass374Array6777[i].method4111(null, 0);
	}
	
	final void j(int i) {
		anInt6795 = i;
		aClass374Array6777 = new Class374[anInt6795];
		for (int i_383_ = 0; i_383_ < anInt6795; i_383_++)
			aClass374Array6777[i_383_] = new Class374(this);
	}
	
	final void b(int i) {
		PureJavaDrawableModel.anInt5742 = PureJavaDrawableModel.anInt5724 = i;
		if (anInt6795 > 1) {
			throw new IllegalStateException("No MT");
		}
		j(anInt6795);
		k(0);
	}
	
	final GLSprite a(int[] is, int i, int i_384_, int i_385_, int i_386_, boolean bool) {
		boolean bool_387_ = false;
		int i_388_ = i;
	while_223_:
		for (int i_389_ = 0; i_389_ < i_386_; i_389_++) {
			for (int i_390_ = 0; i_390_ < i_385_; i_390_++) {
				int i_391_ = is[i_388_++] >>> 24;
				if (i_391_ != 0 && i_391_ != 255) {
					bool_387_ = true;
					break while_223_;
				}
			}
		}
		if (bool_387_) {
			return new GLSprite_Sub2_Sub2(this, is, i, i_384_, i_385_, i_386_, bool);
		}
		return new GLSprite_Sub2_Sub1(this, is, i, i_384_, i_385_, i_386_, bool);
	}
	
	final int E() {
		return 0;
	}
	
	final void a(Class270 class270) {
		/* empty */
	}
	
	final boolean s() {
		return true;
	}
	
	final void e(int i) {
		int i_392_ = i - anInt6754;
		for (Object object = aClass61_6781.method596(102); object != null; object = aClass61_6781.method603((byte) -22)) {
			Node_Sub22 node_sub22 = (Node_Sub22) object;
			if (node_sub22.aBoolean7193) {
				node_sub22.anInt7189 += i_392_;
				int i_393_ = node_sub22.anInt7189 / 20;
				if (i_393_ > 0) {
					Class91 class91 = aD1543.method10(node_sub22.anInt7188, -8217);
					node_sub22.method2620(class91.aByte1211 * i_392_ * 50 / 1000, class91.aByte1203 * i_392_ * 50 / 1000);
					node_sub22.anInt7189 -= i_393_ * 20;
				}
				node_sub22.aBoolean7193 = false;
			}
		}
		anInt6754 = i;
		aClass61_6762.method598(5, -11819);
		aClass61_6781.method598(5, -11819);
	}
	
	final void a(float f, float f_394_, float f_395_) {
		/* empty */
	}
	
	final void method1498(int i, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_) {
		if (i_398_ != 0 && i_399_ != 0) {
			if (i_401_ != 65535 && !aD1543.method10(i_401_, -8217).aBoolean1223) {
				if (anInt6800 != i_401_) {
					GLSprite glsprite = (GLSprite) aClass61_6762.method607((long) i_401_, 0);
					if (glsprite == null) {
						int[] is = method1495(i_401_);
						if (is == null) {
							return;
						}
						int i_405_ = method1505(i_401_) ? 64 : anInt6775;
						glsprite = this.method1235(i_405_, i_405_, i_405_, is, 0, 7468);
						aClass61_6762.method601(glsprite, 25566, (long) i_401_);
					}
					anInt6800 = i_401_;
					aGLSprite6799 = glsprite;
				}
				((GLSprite_Sub2) aGLSprite6799).method1208(i - i_398_, i_396_ - i_399_, i_397_, i_398_ << 1, i_399_ << 1, i_403_, i_402_, i_404_, 1);
			} else {
				method1497(i, i_396_, i_397_, i_398_, i_402_, i_404_);
			}
		}
	}
	
	final GLSprite a(int i, int i_406_, int i_407_, int i_408_, boolean bool) {
		int[] is = new int[i_407_ * i_408_];
		int i_409_ = i_406_ * anInt6789 + i;
		int i_410_ = anInt6789 - i_407_;
		for (int i_411_ = 0; i_411_ < i_408_; i_411_++) {
			int i_412_ = i_411_ * i_407_;
			for (int i_413_ = 0; i_413_ < i_407_; i_413_++)
				is[i_412_ + i_413_] = anIntArray6787[i_409_++];
			i_409_ += i_410_;
		}
		if (bool) {
			return new GLSprite_Sub2_Sub2(this, is, i_407_, i_408_);
		}
		return new GLSprite_Sub2_Sub1(this, is, i_407_, i_408_);
	}
	
	final void T(int i, int i_414_, int i_415_, int i_416_) {
		if (anInt6767 < i) {
			anInt6767 = i;
		}
		if (anInt6760 < i_414_) {
			anInt6760 = i_414_;
		}
		if (anInt6778 > i_415_) {
			anInt6778 = i_415_;
		}
		if (anInt6772 > i_416_) {
			anInt6772 = i_416_;
		}
		method1506();
	}
	
	final GLSprite a(Class383 class383, boolean bool) {
		int[] is = class383.anIntArray4904;
		byte[] bs = class383.aByteArray4903;
		int i = class383.anInt4897;
		int i_417_ = class383.anInt4900;
		GLSprite_Sub2 glsprite_sub2;
		if (bool && class383.aByteArray4905 == null) {
			int[] is_418_ = new int[is.length];
			byte[] bs_419_ = new byte[i * i_417_];
			for (int i_420_ = 0; i_420_ < i_417_; i_420_++) {
				int i_421_ = i_420_ * i;
				for (int i_422_ = 0; i_422_ < i; i_422_++)
					bs_419_[i_421_ + i_422_] = bs[i_421_ + i_422_];
			}
			for (int i_423_ = 0; i_423_ < is.length; i_423_++)
				is_418_[i_423_] = is[i_423_];
			glsprite_sub2 = new GLSprite_Sub2_Sub3(this, bs_419_, is_418_, i, i_417_);
		} else {
			int[] is_424_ = new int[i * i_417_];
			byte[] bs_425_ = class383.aByteArray4905;
			if (bs_425_ != null) {
				for (int i_426_ = 0; i_426_ < i_417_; i_426_++) {
					int i_427_ = i_426_ * i;
					for (int i_428_ = 0; i_428_ < i; i_428_++)
						is_424_[i_427_ + i_428_] = is[bs[i_427_ + i_428_] & 0xff] | bs_425_[i_427_ + i_428_] << 24;
				}
				glsprite_sub2 = new GLSprite_Sub2_Sub2(this, is_424_, i, i_417_);
			} else {
				for (int i_429_ = 0; i_429_ < i_417_; i_429_++) {
					int i_430_ = i_429_ * i;
					for (int i_431_ = 0; i_431_ < i; i_431_++) {
						int i_432_ = is[bs[i_430_ + i_431_] & 0xff];
						is_424_[i_430_ + i_431_] = i_432_ != 0 ? ~0xffffff | i_432_ : 0;
					}
				}
				glsprite_sub2 = new GLSprite_Sub2_Sub1(this, is_424_, i, i_417_);
			}
		}
		glsprite_sub2.method1178(class383.anInt4902, class383.anInt4898, class383.anInt4901, class383.anInt4899);
		return glsprite_sub2;
	}
	
	final Plane a(int i, int i_433_, int[][] is, int[][] is_434_, int i_435_, int i_436_, int i_437_) {
		return new Plane_Sub1(this, i_436_, i_437_, i, i_433_, is, is_434_, i_435_);
	}
	
	final int JA(int i, int i_438_, int i_439_, int i_440_, int i_441_, int i_442_) {
		int i_443_ = 0;
		float f = aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_438_ + aClass336_Sub2_6788.aFloat8584 * (float) i_439_ + aClass336_Sub2_6788.aFloat8589;
		if (f < 1.0F) {
			f = 1.0F;
		}
		float f_444_ = aClass336_Sub2_6788.aFloat8577 * (float) i_440_ + aClass336_Sub2_6788.aFloat8567 * (float) i_441_ + aClass336_Sub2_6788.aFloat8584 * (float) i_442_ + aClass336_Sub2_6788.aFloat8589;
		if (f_444_ < 1.0F) {
			f_444_ = 1.0F;
		}
		if (f < (float) anInt6798 && f_444_ < (float) anInt6798) {
			i_443_ |= 0x10;
		} else if (f > (float) anInt6776 && f_444_ > (float) anInt6776) {
			i_443_ |= 0x20;
		}
		int i_445_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_438_ + aClass336_Sub2_6788.aFloat8566 * (float) i_439_ + aClass336_Sub2_6788.aFloat8583) / f);
		int i_446_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8580 * (float) i_440_ + aClass336_Sub2_6788.aFloat8571 * (float) i_441_ + aClass336_Sub2_6788.aFloat8566 * (float) i_442_ + aClass336_Sub2_6788.aFloat8583) / f_444_);
		if (i_445_ < anInt6793 && i_446_ < anInt6793) {
			i_443_ |= 0x1;
		} else if (i_445_ > anInt6768 && i_446_ > anInt6768) {
			i_443_ |= 0x2;
		}
		int i_447_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_438_ + aClass336_Sub2_6788.aFloat8558 * (float) i_439_ + aClass336_Sub2_6788.aFloat8579) / f);
		int i_448_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8578 * (float) i_440_ + aClass336_Sub2_6788.aFloat8561 * (float) i_441_ + aClass336_Sub2_6788.aFloat8558 * (float) i_442_ + aClass336_Sub2_6788.aFloat8579) / f_444_);
		if (i_447_ < anInt6790 && i_448_ < anInt6790) {
			i_443_ |= 0x4;
		} else if (i_447_ > anInt6779 && i_448_ > anInt6779) {
			i_443_ |= 0x8;
		}
		return i_443_;
	}
	
	final void a(int i, int i_449_, int i_450_, int i_451_, int i_452_, int i_453_) {
		i_450_ -= i;
		i_451_ -= i_449_;
		if (i_451_ == 0) {
			if (i_450_ >= 0) {
				U(i, i_449_, i_450_ + 1, i_452_, i_453_);
			} else {
				U(i + i_450_, i_449_, -i_450_ + 1, i_452_, i_453_);
			}
		} else if (i_450_ == 0) {
			if (i_451_ >= 0) {
				P(i, i_449_, i_451_ + 1, i_452_, i_453_);
			} else {
				P(i, i_449_ + i_451_, -i_451_ + 1, i_452_, i_453_);
			}
		} else {
			if (i_450_ + i_451_ < 0) {
				i += i_450_;
				i_450_ = -i_450_;
				i_449_ += i_451_;
				i_451_ = -i_451_;
			}
			if (i_450_ > i_451_) {
				i_449_ <<= 16;
				i_449_ += 32768;
				i_451_ <<= 16;
				int i_454_ = (int) Math.floor((double) i_451_ / (double) i_450_ + 0.5);
				i_450_ += i;
				if (i < anInt6767) {
					i_449_ += i_454_ * (anInt6767 - i);
					i = anInt6767;
				}
				if (i_450_ >= anInt6778) {
					i_450_ = anInt6778 - 1;
				}
				int i_455_ = i_452_ >>> 24;
				if (i_453_ == 0 || i_453_ == 1 && i_455_ == 255) {
					for (/**/; i <= i_450_; i++) {
						int i_456_ = i_449_ >> 16;
						if (i_456_ >= anInt6760 && i_456_ < anInt6772) {
							anIntArray6787[i + i_456_ * anInt6789] = i_452_;
						}
						i_449_ += i_454_;
					}
					return;
				}
				if (i_453_ == 1) {
					i_452_ = ((i_452_ & 0xff00ff) * i_455_ >> 8 & 0xff00ff) + ((i_452_ & 0xff00) * i_455_ >> 8 & 0xff00) + (i_455_ << 24);
					int i_457_ = 256 - i_455_;
					for (/**/; i <= i_450_; i++) {
						int i_458_ = i_449_ >> 16;
						if (i_458_ >= anInt6760 && i_458_ < anInt6772) {
							int i_459_ = i + i_458_ * anInt6789;
							int i_460_ = anIntArray6787[i_459_];
							i_460_ = ((i_460_ & 0xff00ff) * i_457_ >> 8 & 0xff00ff) + ((i_460_ & 0xff00) * i_457_ >> 8 & 0xff00);
							anIntArray6787[i_459_] = i_452_ + i_460_;
						}
						i_449_ += i_454_;
					}
					return;
				}
				if (i_453_ == 2) {
					for (/**/; i <= i_450_; i++) {
						int i_461_ = i_449_ >> 16;
						if (i_461_ >= anInt6760 && i_461_ < anInt6772) {
							int i_462_ = i + i_461_ * anInt6789;
							int i_463_ = anIntArray6787[i_462_];
							int i_464_ = i_452_ + i_463_;
							int i_465_ = (i_452_ & 0xff00ff) + (i_463_ & 0xff00ff);
							i_463_ = (i_465_ & 0x1000100) + (i_464_ - i_465_ & 0x10000);
							anIntArray6787[i_462_] = i_464_ - i_463_ | i_463_ - (i_463_ >>> 8);
						}
						i_449_ += i_454_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_450_ <<= 16;
			int i_466_ = (int) Math.floor((double) i_450_ / (double) i_451_ + 0.5);
			i_451_ += i_449_;
			if (i_449_ < anInt6760) {
				i += i_466_ * (anInt6760 - i_449_);
				i_449_ = anInt6760;
			}
			if (i_451_ >= anInt6772) {
				i_451_ = anInt6772 - 1;
			}
			int i_467_ = i_452_ >>> 24;
			if (i_453_ == 0 || i_453_ == 1 && i_467_ == 255) {
				for (/**/; i_449_ <= i_451_; i_449_++) {
					int i_468_ = i >> 16;
					if (i_468_ >= anInt6767 && i_468_ < anInt6778) {
						anIntArray6787[i_468_ + i_449_ * anInt6789] = i_452_;
					}
					i += i_466_;
				}
			} else if (i_453_ == 1) {
				i_452_ = ((i_452_ & 0xff00ff) * i_467_ >> 8 & 0xff00ff) + ((i_452_ & 0xff00) * i_467_ >> 8 & 0xff00) + (i_467_ << 24);
				int i_469_ = 256 - i_467_;
				for (/**/; i_449_ <= i_451_; i_449_++) {
					int i_470_ = i >> 16;
					if (i_470_ >= anInt6767 && i_470_ < anInt6778) {
						int i_471_ = i_470_ + i_449_ * anInt6789;
						int i_472_ = anIntArray6787[i_471_];
						i_472_ = ((i_472_ & 0xff00ff) * i_469_ >> 8 & 0xff00ff) + ((i_472_ & 0xff00) * i_469_ >> 8 & 0xff00);
						anIntArray6787[i_470_ + i_449_ * anInt6789] = i_452_ + i_472_;
					}
					i += i_466_;
				}
			} else if (i_453_ == 2) {
				for (/**/; i_449_ <= i_451_; i_449_++) {
					int i_473_ = i >> 16;
					if (i_473_ >= anInt6767 && i_473_ < anInt6778) {
						int i_474_ = i_473_ + i_449_ * anInt6789;
						int i_475_ = anIntArray6787[i_474_];
						int i_476_ = i_452_ + i_475_;
						int i_477_ = (i_452_ & 0xff00ff) + (i_475_ & 0xff00ff);
						i_475_ = (i_477_ & 0x1000100) + (i_476_ - i_477_ & 0x10000);
						anIntArray6787[i_474_] = i_476_ - i_475_ | i_475_ - (i_475_ >>> 8);
					}
					i += i_466_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void b(boolean bool) {
		/* empty */
	}
	
	final int[] method1499(int i) {
		Node_Sub22 node_sub22;
		synchronized (aClass61_6781) {
			node_sub22 = (Node_Sub22) aClass61_6781.method607((long) i, 0);
			if (node_sub22 == null) {
				if (!aD1543.method7(9900, i)) {
					return null;
				}
				Class91 class91 = aD1543.method10(i, -8217);
				int i_478_ = class91.aBoolean1204 || aBoolean6794 ? 64 : anInt6775;
				node_sub22 = new Node_Sub22(i, i_478_, aD1543.method11(i_478_, true, i_478_, i, (byte) 0, 0.7F), class91.anInt1226 != 1);
				aClass61_6781.method601(node_sub22, 25566, (long) i);
			}
		}
		node_sub22.aBoolean7193 = true;
		return node_sub22.method2619();
	}
	
	final boolean r() {
		return false;
	}
	
	final int r(int i, int i_479_, int i_480_, int i_481_, int i_482_, int i_483_, int i_484_) {
		float f = aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_479_ + aClass336_Sub2_6788.aFloat8584 * (float) i_480_ + aClass336_Sub2_6788.aFloat8589;
		float f_485_ = aClass336_Sub2_6788.aFloat8577 * (float) i_481_ + aClass336_Sub2_6788.aFloat8567 * (float) i_482_ + aClass336_Sub2_6788.aFloat8584 * (float) i_483_ + aClass336_Sub2_6788.aFloat8589;
		int i_486_ = 0;
		if (f < (float) anInt6798 && f_485_ < (float) anInt6798) {
			i_486_ |= 0x10;
		} else if (f > (float) anInt6776 && f_485_ > (float) anInt6776) {
			i_486_ |= 0x20;
		}
		int i_487_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_479_ + aClass336_Sub2_6788.aFloat8566 * (float) i_480_ + aClass336_Sub2_6788.aFloat8583) / (float) i_484_);
		int i_488_ = (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8580 * (float) i_481_ + aClass336_Sub2_6788.aFloat8571 * (float) i_482_ + aClass336_Sub2_6788.aFloat8566 * (float) i_483_ + aClass336_Sub2_6788.aFloat8583) / (float) i_484_);
		if (i_487_ < anInt6793 && i_488_ < anInt6793) {
			i_486_ |= 0x1;
		} else if (i_487_ > anInt6768 && i_488_ > anInt6768) {
			i_486_ |= 0x2;
		}
		int i_489_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_479_ + aClass336_Sub2_6788.aFloat8558 * (float) i_480_ + aClass336_Sub2_6788.aFloat8579) / (float) i_484_);
		int i_490_ = (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8578 * (float) i_481_ + aClass336_Sub2_6788.aFloat8561 * (float) i_482_ + aClass336_Sub2_6788.aFloat8558 * (float) i_483_ + aClass336_Sub2_6788.aFloat8579) / (float) i_484_);
		if (i_489_ < anInt6790 && i_490_ < anInt6790) {
			i_486_ |= 0x4;
		} else if (i_489_ > anInt6779 && i_490_ > anInt6779) {
			i_486_ |= 0x8;
		}
		return i_486_;
	}
	
	final void pa() {
		for (int i = 0; i < aClass374Array6777.length; i++) {
			aClass374Array6777[i].anInt4611 = aClass374Array6777[i].anInt4616;
			aClass374Array6777[i].aBoolean4617 = false;
		}
	}
	
	final int method1500(int i) {
		return aD1543.method10(i, -8217).aShort1221 & 0xffff;
	}
	
	final void X(int i) {
		/* empty */
	}
	
	private final void method1501(int i, int i_491_, int i_492_, int i_493_, int i_494_, int i_495_, int i_496_, int i_497_) {
		if (i_491_ >= anInt6760 && i_491_ < anInt6772) {
			int i_498_ = i + i_491_ * anInt6789;
			int i_499_ = i_493_ >>> 24;
			int i_500_ = i_495_ + i_496_;
			int i_501_ = i_497_ % i_500_;
			if (i_494_ == 0 || i_494_ == 1 && i_499_ == 255) {
				int i_502_ = 0;
				while (i_502_ < i_492_) {
					if (i + i_502_ >= anInt6767 && i + i_502_ < anInt6778 && i_501_ < i_495_) {
						anIntArray6787[i_498_ + i_502_] = i_493_;
					}
					i_502_++;
					i_501_ = ++i_501_ % i_500_;
				}
			} else if (i_494_ == 1) {
				i_493_ = ((i_493_ & 0xff00ff) * i_499_ >> 8 & 0xff00ff) + ((i_493_ & 0xff00) * i_499_ >> 8 & 0xff00) + (i_499_ << 24);
				int i_503_ = 256 - i_499_;
				int i_504_ = 0;
				while (i_504_ < i_492_) {
					if (i + i_504_ >= anInt6767 && i + i_504_ < anInt6778 && i_501_ < i_495_) {
						int i_505_ = anIntArray6787[i_498_ + i_504_];
						i_505_ = ((i_505_ & 0xff00ff) * i_503_ >> 8 & 0xff00ff) + ((i_505_ & 0xff00) * i_503_ >> 8 & 0xff00);
						anIntArray6787[i_498_ + i_504_] = i_493_ + i_505_;
					}
					i_504_++;
					i_501_ = ++i_501_ % i_500_;
				}
			} else if (i_494_ == 2) {
				int i_506_ = 0;
				while (i_506_ < i_492_) {
					if (i + i_506_ >= anInt6767 && i + i_506_ < anInt6778 && i_501_ < i_495_) {
						int i_507_ = anIntArray6787[i_498_ + i_506_];
						int i_508_ = i_493_ + i_507_;
						int i_509_ = (i_493_ & 0xff00ff) + (i_507_ & 0xff00ff);
						i_507_ = (i_509_ & 0x1000100) + (i_508_ - i_509_ & 0x10000);
						anIntArray6787[i_498_ + i_506_] = i_508_ - i_507_ | i_507_ - (i_507_ >>> 8);
					}
					i_506_++;
					i_501_ = ++i_501_ % i_500_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void e(int i, int i_510_) throws Exception_Sub1 {
		if (aCanvas6755 == null || aGraphicsBuffer6756 == null) {
			throw new IllegalStateException("off");
		}
		try {
			Graphics graphics = aCanvas6755.getGraphics();
			aGraphicsBuffer6756.method2597(anInt6752, i, 0, false, graphics, anInt6758, 0, i_510_);
		} catch (Exception exception) {
			aCanvas6755.repaint();
		}
	}
	
	final void b(int i, int i_511_, int i_512_, int i_513_, double d) {
		int i_514_ = anInt6765 - i_512_;
		int i_515_ = i_511_ * anInt6765 + i;
		float[] fs = aFloatArray6782;
		int i_516_ = 0;
		while (i_516_ < i_513_) {
			int i_517_ = 0;
			while (i_517_ < i_512_) {
				float f = fs[i_515_];
				if (f != 2.14748365E9F) {
					fs[i_515_] = (float) ((double) f + d);
				}
				i_517_++;
				i_515_++;
			}
			i_516_++;
			i_515_ += i_514_;
		}
	}
	
	final Class52 a(Class357 class357, Class383[] class383s, boolean bool) {
		int[] is = new int[class383s.length];
		int[] is_518_ = new int[class383s.length];
		boolean bool_519_ = false;
		for (int i = 0; i < class383s.length; i++) {
			is[i] = class383s[i].anInt4897;
			is_518_[i] = class383s[i].anInt4900;
			if (class383s[i].aByteArray4905 != null) {
				bool_519_ = true;
			}
		}
		if (bool) {
			if (bool_519_) {
				return new Class52_Sub4(this, class357, class383s, is, is_518_);
			}
			return new Class52_Sub5(this, class357, class383s, is, is_518_);
		}
		if (bool_519_) {
			throw new IllegalArgumentException("");
		}
		return new Class52_Sub3(this, class357, class383s, is, is_518_);
	}
	
	final void Q(int i, int i_520_, int i_521_, int i_522_, int i_523_, int i_524_, byte[] bs, int i_525_, int i_526_) {
		if (i_521_ > 0 && i_522_ > 0) {
			int i_527_ = 0;
			int i_528_ = 0;
			int i_529_ = (i_525_ << 16) / i_521_;
			int i_530_ = (bs.length / i_525_ << 16) / i_522_;
			int i_531_ = i + i_520_ * anInt6789;
			int i_532_ = anInt6789 - i_521_;
			if (i_520_ + i_522_ > anInt6772) {
				i_522_ -= i_520_ + i_522_ - anInt6772;
			}
			if (i_520_ < anInt6760) {
				int i_533_ = anInt6760 - i_520_;
				i_522_ -= i_533_;
				i_531_ += i_533_ * anInt6789;
				i_528_ += i_530_ * i_533_;
			}
			if (i + i_521_ > anInt6778) {
				int i_534_ = i + i_521_ - anInt6778;
				i_521_ -= i_534_;
				i_532_ += i_534_;
			}
			if (i < anInt6767) {
				int i_535_ = anInt6767 - i;
				i_521_ -= i_535_;
				i_531_ += i_535_;
				i_527_ += i_529_ * i_535_;
				i_532_ += i_535_;
			}
			int i_536_ = i_523_ >>> 24;
			int i_537_ = i_524_ >>> 24;
			if (i_526_ == 0 || i_526_ == 1 && i_536_ == 255 && i_537_ == 255) {
				int i_538_ = i_527_;
				for (int i_539_ = -i_522_; i_539_ < 0; i_539_++) {
					int i_540_ = (i_528_ >> 16) * i_525_;
					for (int i_541_ = -i_521_; i_541_ < 0; i_541_++) {
						if (bs[(i_527_ >> 16) + i_540_] != 0) {
							anIntArray6787[i_531_++] = i_524_;
						} else {
							anIntArray6787[i_531_++] = i_523_;
						}
						i_527_ += i_529_;
					}
					i_528_ += i_530_;
					i_527_ = i_538_;
					i_531_ += i_532_;
				}
			} else if (i_526_ == 1) {
				int i_542_ = i_527_;
				for (int i_543_ = -i_522_; i_543_ < 0; i_543_++) {
					int i_544_ = (i_528_ >> 16) * i_525_;
					for (int i_545_ = -i_521_; i_545_ < 0; i_545_++) {
						int i_546_ = i_523_;
						if (bs[(i_527_ >> 16) + i_544_] != 0) {
							i_546_ = i_524_;
						}
						int i_547_ = i_546_ >>> 24;
						int i_548_ = 255 - i_547_;
						int i_549_ = anIntArray6787[i_531_];
						anIntArray6787[i_531_++] = ((i_546_ & 0xff00ff) * i_547_ + (i_549_ & 0xff00ff) * i_548_ & ~0xff00ff) + ((i_546_ & 0xff00) * i_547_ + (i_549_ & 0xff00) * i_548_ & 0xff0000) >> 8;
						i_527_ += i_529_;
					}
					i_528_ += i_530_;
					i_527_ = i_542_;
					i_531_ += i_532_;
				}
			} else if (i_526_ == 2) {
				int i_550_ = i_527_;
				for (int i_551_ = -i_522_; i_551_ < 0; i_551_++) {
					int i_552_ = (i_528_ >> 16) * i_525_;
					for (int i_553_ = -i_521_; i_553_ < 0; i_553_++) {
						int i_554_ = i_523_;
						if (bs[(i_527_ >> 16) + i_552_] != 0) {
							i_554_ = i_524_;
						}
						if (i_554_ != 0) {
							int i_555_ = anIntArray6787[i_531_];
							int i_556_ = i_554_ + i_555_;
							int i_557_ = (i_554_ & 0xff00ff) + (i_555_ & 0xff00ff);
							i_555_ = (i_557_ & 0x1000100) + (i_556_ - i_557_ & 0x10000);
							anIntArray6787[i_531_++] = i_556_ - i_555_ | i_555_ - (i_555_ >>> 8);
						} else {
							i_531_++;
						}
						i_527_ += i_529_;
					}
					i_528_ += i_530_;
					i_527_ = i_550_;
					i_531_ += i_532_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	final void j() {
		/* empty */
	}
	
	final boolean m() {
		return false;
	}
	
	final void a(int i, int i_558_, int i_559_, int i_560_, int i_561_, int i_562_, aa var_aa, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_) {
		aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		int[] is = var_aa_Sub1.anIntArray5487;
		int[] is_568_ = var_aa_Sub1.anIntArray5488;
		int i_569_ = anInt6760 > i_564_ ? anInt6760 : i_564_;
		int i_570_ = anInt6772 < i_564_ + is.length ? anInt6772 : i_564_ + is.length;
		i_567_ <<= 8;
		i_565_ <<= 8;
		i_566_ <<= 8;
		int i_571_ = i_565_ + i_566_;
		i_567_ %= i_571_;
		i_559_ -= i;
		i_560_ -= i_558_;
		if (i_559_ + i_560_ < 0) {
			int i_572_ = (int) (Math.sqrt((double) (i_559_ * i_559_ + i_560_ * i_560_)) * 256.0);
			int i_573_ = i_572_ % i_571_;
			i_567_ = i_571_ + i_565_ - i_567_ - i_573_;
			i_567_ %= i_571_;
			if (i_567_ < 0) {
				i_567_ += i_571_;
			}
			i += i_559_;
			i_559_ = -i_559_;
			i_558_ += i_560_;
			i_560_ = -i_560_;
		}
		if (i_559_ > i_560_) {
			i_558_ <<= 16;
			i_558_ += 32768;
			i_560_ <<= 16;
			int i_574_ = (int) Math.floor((double) i_560_ / (double) i_559_ + 0.5);
			i_559_ += i;
			int i_575_ = i_561_ >>> 24;
			int i_576_ = (int) Math.sqrt((double) (65536 + (i_574_ >> 8) * (i_574_ >> 8)));
			if (i_562_ == 0 || i_562_ == 1 && i_575_ == 255) {
				while (i <= i_559_) {
					int i_577_ = i_558_ >> 16;
					int i_578_ = i_577_ - i_564_;
					if (i >= anInt6767 && i < anInt6778 && i_577_ >= i_569_ && i_577_ < i_570_ && i_567_ < i_565_) {
						int i_579_ = i_563_ + is[i_578_];
						if (i >= i_579_ && i < i_579_ + is_568_[i_578_]) {
							anIntArray6787[i + i_577_ * anInt6789] = i_561_;
						}
					}
					i_558_ += i_574_;
					i++;
					i_567_ += i_576_;
					i_567_ %= i_571_;
				}
				return;
			}
			if (i_562_ == 1) {
				i_561_ = ((i_561_ & 0xff00ff) * i_575_ >> 8 & 0xff00ff) + ((i_561_ & 0xff00) * i_575_ >> 8 & 0xff00) + (i_575_ << 24);
				int i_580_ = 256 - i_575_;
				while (i <= i_559_) {
					int i_581_ = i_558_ >> 16;
					int i_582_ = i_581_ - i_564_;
					if (i >= anInt6767 && i < anInt6778 && i_581_ >= i_569_ && i_581_ < i_570_ && i_567_ < i_565_) {
						int i_583_ = i_563_ + is[i_582_];
						if (i >= i_583_ && i < i_583_ + is_568_[i_582_]) {
							int i_584_ = i + i_581_ * anInt6789;
							int i_585_ = anIntArray6787[i_584_];
							i_585_ = ((i_585_ & 0xff00ff) * i_580_ >> 8 & 0xff00ff) + ((i_585_ & 0xff00) * i_580_ >> 8 & 0xff00);
							anIntArray6787[i_584_] = i_561_ + i_585_;
						}
					}
					i_558_ += i_574_;
					i++;
					i_567_ += i_576_;
					i_567_ %= i_571_;
				}
				return;
			}
			if (i_562_ == 2) {
				while (i <= i_559_) {
					int i_586_ = i_558_ >> 16;
					int i_587_ = i_586_ - i_564_;
					if (i >= anInt6767 && i < anInt6778 && i_586_ >= i_569_ && i_586_ < i_570_ && i_567_ < i_565_) {
						int i_588_ = i_563_ + is[i_587_];
						if (i >= i_588_ && i < i_588_ + is_568_[i_587_]) {
							int i_589_ = i + i_586_ * anInt6789;
							int i_590_ = anIntArray6787[i_589_];
							int i_591_ = i_561_ + i_590_;
							int i_592_ = (i_561_ & 0xff00ff) + (i_590_ & 0xff00ff);
							i_590_ = (i_592_ & 0x1000100) + (i_591_ - i_592_ & 0x10000);
							anIntArray6787[i_589_] = i_591_ - i_590_ | i_590_ - (i_590_ >>> 8);
						}
					}
					i_558_ += i_574_;
					i++;
					i_567_ += i_576_;
					i_567_ %= i_571_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_559_ <<= 16;
		int i_593_ = (int) Math.floor((double) i_559_ / (double) i_560_ + 0.5);
		int i_594_ = (int) Math.sqrt((double) (65536 + (i_593_ >> 8) * (i_593_ >> 8)));
		i_560_ += i_558_;
		int i_595_ = i_561_ >>> 24;
		if (i_562_ == 0 || i_562_ == 1 && i_595_ == 255) {
			while (i_558_ <= i_560_) {
				int i_596_ = i >> 16;
				int i_597_ = i_558_ - i_564_;
				if (i_558_ >= i_569_ && i_558_ < i_570_ && i_596_ >= anInt6767 && i_596_ < anInt6778 && i_567_ < i_565_ && i_596_ >= i_563_ + is[i_597_] && i_596_ < i_563_ + is[i_597_] + is_568_[i_597_]) {
					anIntArray6787[i_596_ + i_558_ * anInt6789] = i_561_;
				}
				i += i_593_;
				i_558_++;
				i_567_ += i_594_;
				i_567_ %= i_571_;
			}
		} else if (i_562_ == 1) {
			i_561_ = ((i_561_ & 0xff00ff) * i_595_ >> 8 & 0xff00ff) + ((i_561_ & 0xff00) * i_595_ >> 8 & 0xff00) + (i_595_ << 24);
			int i_598_ = 256 - i_595_;
			while (i_558_ <= i_560_) {
				int i_599_ = i >> 16;
				int i_600_ = i_558_ - i_564_;
				if (i_558_ >= i_569_ && i_558_ < i_570_ && i_599_ >= anInt6767 && i_599_ < anInt6778 && i_567_ < i_565_ && i_599_ >= i_563_ + is[i_600_] && i_599_ < i_563_ + is[i_600_] + is_568_[i_600_]) {
					int i_601_ = i_599_ + i_558_ * anInt6789;
					int i_602_ = anIntArray6787[i_601_];
					i_602_ = ((i_602_ & 0xff00ff) * i_598_ >> 8 & 0xff00ff) + ((i_602_ & 0xff00) * i_598_ >> 8 & 0xff00);
					anIntArray6787[i_599_ + i_558_ * anInt6789] = i_561_ + i_602_;
				}
				i += i_593_;
				i_558_++;
				i_567_ += i_594_;
				i_567_ %= i_571_;
			}
		} else if (i_562_ == 2) {
			while (i_558_ <= i_560_) {
				int i_603_ = i >> 16;
				int i_604_ = i_558_ - i_564_;
				if (i_558_ >= i_569_ && i_558_ < i_570_ && i_603_ >= anInt6767 && i_603_ < anInt6778 && i_567_ < i_565_ && i_603_ >= i_563_ + is[i_604_] && i_603_ < i_563_ + is[i_604_] + is_568_[i_604_]) {
					int i_605_ = i_603_ + i_558_ * anInt6789;
					int i_606_ = anIntArray6787[i_605_];
					int i_607_ = i_561_ + i_606_;
					int i_608_ = (i_561_ & 0xff00ff) + (i_606_ & 0xff00ff);
					i_606_ = (i_608_ & 0x1000100) + (i_607_ - i_608_ & 0x10000);
					anIntArray6787[i_605_] = i_607_ - i_606_ | i_606_ - (i_606_ >>> 8);
				}
				i += i_593_;
				i_558_++;
				i_567_ += i_594_;
				i_567_ %= i_571_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final int method1502(int i) {
		return aD1543.method10(i, -8217).anInt1226;
	}
	
	final boolean z() {
		return true;
	}
	
	final Interface6 a(Interface4 interface4, Interface20 interface20) {
		return new Class64(this, (GLSprite) interface4, (Class131) interface20);
	}
	
	final int e() {
		return 0;
	}
	
	final boolean t() {
		return false;
	}
	
	final GLSprite a(int i, int i_609_, boolean bool) {
		if (bool) {
			return new GLSprite_Sub2_Sub2(this, i, i_609_);
		}
		return new GLSprite_Sub2_Sub1(this, i, i_609_);
	}
	
	final boolean a() {
		return false;
	}
	
	final void v() {
		if (aCanvas6755 != null) {
			anIntArray6787 = aGraphicsBuffer6756.anIntArray7145;
			anInt6789 = aGraphicsBuffer6756.anInt7146;
			anInt6791 = aGraphicsBuffer6756.anInt7142;
			aFloatArray6782 = aFloatArray6792;
			anInt6765 = anInt6773;
			anInt6783 = anInt6770;
		} else {
			anInt6789 = 1;
			anInt6791 = 1;
			anIntArray6787 = null;
			anInt6765 = 1;
			anInt6783 = 1;
			aFloatArray6782 = null;
		}
		aClass64_6771 = null;
		method1496();
	}
	
	final void L(int i, int i_610_, int i_611_) {
		for (int i_612_ = 0; i_612_ < aClass374Array6777.length; i_612_++) {
			Class374 class374 = aClass374Array6777[i_612_];
			class374.anInt4611 = i & 0xffffff;
			int i_613_ = class374.anInt4611 >>> 16 & 0xff;
			if (i_613_ < 2) {
				i_613_ = 2;
			}
			int i_614_ = class374.anInt4611 >> 8 & 0xff;
			if (i_614_ < 2) {
				i_614_ = 2;
			}
			int i_615_ = class374.anInt4611 & 0xff;
			if (i_615_ < 2) {
				i_615_ = 2;
			}
			class374.anInt4611 = i_613_ << 16 | i_614_ << 8 | i_615_;
            class374.aBoolean4621 = i_610_ >= 0;
		}
	}
	
	final void a(int i, Node_Sub29[] node_sub29s) {
		/* empty */
	}
	
	PureJavaToolkit(java.awt.Canvas canvas, d var_d, int i, int i_616_) {
		this(var_d);
		try {
			b(canvas, i, i_616_);
			a(canvas);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1233(-7751);
			throw new RuntimeException("");
		}
	}
	
	final boolean method1503(int i) {
        return !(!aD1543.method10(i, -8217).aBoolean1212 && !aD1543.method10(i, -8217).aBoolean1210);
    }
	
	final int I() {
		int i = anInt6796;
		anInt6796 = 0;
		return i;
	}
	
	final void method1504(int i, int i_617_, int i_618_, int i_619_, int i_620_, int i_621_, int i_622_, int i_623_, int i_624_, int i_625_) {
		if (i_619_ != 0 && i_620_ != 0) {
			if (i_622_ != 65535 && !aD1543.method10(i_622_, -8217).aBoolean1223) {
				if (anInt6800 != i_622_) {
					GLSprite glsprite = (GLSprite) aClass61_6762.method607((long) i_622_, 0);
					if (glsprite == null) {
						int[] is = method1495(i_622_);
						if (is == null) {
							return;
						}
						int i_626_ = method1505(i_622_) ? 64 : anInt6775;
						glsprite = this.method1235(i_626_, i_626_, i_626_, is, 0, 7468);
						aClass61_6762.method601(glsprite, 25566, (long) i_622_);
					}
					anInt6800 = i_622_;
					aGLSprite6799 = glsprite;
				}
				((GLSprite_Sub2) aGLSprite6799).method1207(i - i_619_, i_617_ - i_620_, i_618_, i_619_ << 1, i_620_ << 1, i_624_, i_623_, i_625_, 1);
			} else {
				method1497(i, i_617_, i_618_, i_619_, i_623_, i_625_);
			}
		}
	}
	
	final void la() {
		anInt6767 = 0;
		anInt6760 = 0;
		anInt6778 = anInt6789;
		anInt6772 = anInt6791;
		method1506();
	}
	
	final boolean method1505(int i) {
        return aBoolean6794 || aD1543.method10(i, -8217).aBoolean1204;
    }
	
	final boolean w() {
		return false;
	}
	
	private final void method1506() {
		anInt6793 = anInt6767 - anInt6786;
		anInt6768 = anInt6778 - anInt6786;
		anInt6790 = anInt6760 - anInt6769;
		anInt6779 = anInt6772 - anInt6769;
		for (int i = 0; i < anInt6795; i++) {
			Class185 class185 = aClass374Array6777[i].aClass185_4627;
			class185.anInt2216 = anInt6786 - anInt6767;
			class185.anInt2213 = anInt6769 - anInt6760;
			class185.anInt2222 = anInt6778 - anInt6767;
			class185.anInt2225 = anInt6772 - anInt6760;
		}
		int i = anInt6760 * anInt6789 + anInt6767;
		for (int i_627_ = anInt6760; i_627_ < anInt6772; i_627_++) {
			for (int i_628_ = 0; i_628_ < anInt6795; i_628_++)
				aClass374Array6777[i_628_].aClass185_4627.anIntArray2224[i_627_ - anInt6760] = i;
			i += anInt6789;
		}
	}
	
	final void b(java.awt.Canvas canvas, int i, int i_629_) {
		GraphicsBuffer graphicsbuffer = (GraphicsBuffer) aHashTable6753.method1518(3512, (long) canvas.hashCode());
		if (graphicsbuffer == null) {
			graphicsbuffer = Class284.method3391(i_629_, canvas, 67, i);
			aHashTable6753.method1515((long) canvas.hashCode(), graphicsbuffer, -127);
		} else if (graphicsbuffer.anInt7146 != i || graphicsbuffer.anInt7142 != i_629_) {
			a(canvas, i, i_629_);
		}
	}
	
	final void a(Class336 class336) {
		aClass336_Sub2_6788 = (Class336_Sub2) class336;
	}
	
	final int[] na(int i, int i_630_, int i_631_, int i_632_) {
		int[] is = new int[i_631_ * i_632_];
		int i_633_ = 0;
		for (int i_634_ = 0; i_634_ < i_632_; i_634_++) {
			int i_635_ = (i_630_ + i_634_) * anInt6789 + i;
			for (int i_636_ = 0; i_636_ < i_631_; i_636_++)
				is[i_633_++] = anIntArray6787[i_635_ + i_636_];
		}
		return is;
	}
	
	final void a(Class198 class198) {
		Class374 class374 = method1494(Thread.currentThread());
		EntityNode_Sub3 entitynode_sub3 = class198.aClass87_2429.anEntityNode_Sub3_1186;
		for (EntityNode_Sub3 entitynode_sub3_637_ = entitynode_sub3.anEntityNode_Sub3_5961; entitynode_sub3_637_ != entitynode_sub3; entitynode_sub3_637_ = entitynode_sub3_637_.anEntityNode_Sub3_5961) {
			EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) entitynode_sub3_637_;
			int i = entitynode_sub3_sub2.anInt9174 >> 12;
			int i_638_ = entitynode_sub3_sub2.anInt9171 >> 12;
			int i_639_ = entitynode_sub3_sub2.anInt9173 >> 12;
			float f = aClass336_Sub2_6788.aFloat8589 + (aClass336_Sub2_6788.aFloat8577 * (float) i + aClass336_Sub2_6788.aFloat8567 * (float) i_638_ + aClass336_Sub2_6788.aFloat8584 * (float) i_639_);
			if (!(f < (float) anInt6798) && !(f > (float) class374.anInt4618)) {
				int i_640_ = anInt6786 + (int) ((float) anInt6785 * (aClass336_Sub2_6788.aFloat8583 + (aClass336_Sub2_6788.aFloat8580 * (float) i + aClass336_Sub2_6788.aFloat8571 * (float) i_638_ + aClass336_Sub2_6788.aFloat8566 * (float) i_639_)) / f);
				int i_641_ = anInt6769 + (int) ((float) anInt6763 * (aClass336_Sub2_6788.aFloat8579 + (aClass336_Sub2_6788.aFloat8578 * (float) i + aClass336_Sub2_6788.aFloat8561 * (float) i_638_ + aClass336_Sub2_6788.aFloat8558 * (float) i_639_)) / f);
				if (i_640_ >= anInt6767 && i_640_ <= anInt6778 && i_641_ >= anInt6760 && i_641_ <= anInt6772) {
					if (f == 0.0F) {
						f = 1.0F;
					}
					method1491(entitynode_sub3_sub2, i_640_, i_641_, (int) f, (int) ((float) (entitynode_sub3_sub2.anInt9172 * anInt6785 >> 12) / f));
				}
			}
		}
	}
	
	final Class270 c(int i, int i_642_, int i_643_, int i_644_, int i_645_, int i_646_) {
		return null;
	}
	
	final void b(java.awt.Canvas canvas) {
		if (aCanvas6755 == canvas) {
			a((java.awt.Canvas) null);
		}
		GraphicsBuffer graphicsbuffer = (GraphicsBuffer) aHashTable6753.method1518(3512, (long) canvas.hashCode());
		if (graphicsbuffer != null) {
			graphicsbuffer.method2160((byte) 83);
		}
	}
	
	final void EA(int i, int i_647_, int i_648_, int i_649_) {
		Class374 class374 = method1494(Thread.currentThread());
		class374.anInt4624 = i;
		class374.anInt4611 = i_647_;
		class374.anInt4620 = i_648_;
	}
	
	final Class336 y() {
		return new Class336_Sub2();
	}
	
	final za a(int i) {
		return null;
	}
}
