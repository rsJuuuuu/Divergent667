/* Class169_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

class Class169_Sub2 extends Class169
{
	static int anInt8794;
	protected int anInt8795;
	static int anInt8796;
	private int anInt8797 = -1;
	static IncommingPacket aClass192_8798 = new IncommingPacket(100, 1);
	static int anInt8799;
	static int anInt8800;
	static int anInt8801;
	static int anInt8802;
	protected int anInt8803;
	static Class257 aClass257_8804 = new Class257(5, 3);
	private int anInt8805 = -1;
	static Class170 aClass170_8806 = new Class170(2, 2);
	
	Class169_Sub2(GLToolkit gltoolkit, int i, int i_0_, int i_1_, int i_2_, boolean bool, byte[] bs, int i_3_, boolean bool_4_) {
		super(gltoolkit, i, i_0_, i_1_ * i_2_, bool);
		anInt8795 = i_1_;
		anInt8803 = i_2_;
		if (bool_4_) {
			byte[] bs_5_ = new byte[bs.length];
			for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
				int i_7_ = i_1_ * i_6_;
				int i_8_ = i_1_ * (-i_6_ + i_2_ + -1);
				for (int i_9_ = 0; i_9_ < i_1_; i_9_++)
					bs_5_[i_7_++] = bs[i_8_++];
			}
			bs = bs_5_;
		}
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && anInt4951 != 34037) {
			Class212.method2051(i_0_, i, i_3_, i_1_, (byte) 98, i_2_, bs);
			this.method1766((byte) 73, true);
		} else {
			OpenGL.glTexImage2Dub(anInt4951, 0, anInt4950, anInt8795, anInt8803, 0, i_3_, 5121, bs, 0);
			this.method1766((byte) 77, false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method1757(false, true);
	}
	
	Class169_Sub2(GLToolkit gltoolkit, int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		super(gltoolkit, i, 6407, i_13_ * i_12_, false);
		anInt8795 = i_12_;
		anInt8803 = i_13_;
		int i_14_ = -i_11_ - i_13_ + aGLToolkit4947.anInt6567;
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glCopyTexImage2D(anInt4951, 0, anInt4950, i_10_, i_14_, i_12_, i_13_, 0);
		this.method1757(false, true);
	}
	
	public final void method5(int i) {
		OpenGL.glFramebufferTexture2DEXT(anInt8805, anInt8797, anInt4951, 0, i);
		anInt8801++;
		anInt8805 = -1;
		anInt8797 = -1;
	}
	
	public static void method1771(int i) {
		aClass192_8798 = null;
		if (i == 0) {
			aClass257_8804 = null;
			aClass170_8806 = null;
		}
	}
	
	Class169_Sub2(GLToolkit gltoolkit, int i, int i_15_, int i_16_, int i_17_) {
		super(gltoolkit, i, i_15_, i_16_ * i_17_, false);
		anInt8795 = i_16_;
		anInt8803 = i_17_;
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glTexImage2Dub(anInt4951, 0, anInt4950, i_16_, i_17_, 0, Class320_Sub16.method3742(6406, anInt4950), 5121, null, 0);
		this.method1757(false, true);
	}
	
	final void method1772(byte b, int[] is, boolean bool, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (i_21_ == 0) {
			i_21_ = i_19_;
		}
		anInt8796++;
		if (bool) {
			int[] is_23_ = new int[i_18_ * i_19_];
			for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_24_++) {
				int i_25_ = i_19_ * i_24_;
				int i_26_ = i_21_ * (i_18_ + -i_24_ + -1) - -i_22_;
				for (int i_27_ = 0; (i_19_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
					is_23_[i_25_++] = is[i_26_++];
			}
			is = is_23_;
		}
		if (b != -28) {
			anInt8803 = -15;
		}
		aGLToolkit4947.method1444(b + 26, this);
		if ((i_21_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff)) {
			OpenGL.glPixelStorei(3314, i_21_);
		}
		OpenGL.glTexSubImage2Di(anInt4951, 0, i, -i_18_ + -i_20_ + anInt8803, i_19_, i_18_, 32993, aGLToolkit4947.anInt6740, is, i_22_);
		if ((i_19_ ^ 0xffffffff) != (i_21_ ^ 0xffffffff)) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
	
	Class169_Sub2(GLToolkit gltoolkit, int i, int i_28_, int i_29_, int i_30_, boolean bool, int[] is, int i_31_, int i_32_, boolean bool_33_) {
		super(gltoolkit, i, i_28_, i_29_ * i_30_, bool);
		anInt8803 = i_30_;
		anInt8795 = i_29_;
		if (bool_33_) {
			int[] is_34_ = new int[is.length];
			for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_35_++) {
				int i_36_ = i_35_ * i_29_;
				int i_37_ = i_29_ * (-i_35_ + (i_30_ + -1));
				for (int i_38_ = 0; (i_29_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++)
					is_34_[i_36_++] = is[i_37_++];
			}
			is = is_34_;
		}
		aGLToolkit4947.method1444(-2, this);
		if ((anInt4951 ^ 0xffffffff) != -34038 && bool && i_31_ == 0 && (i_32_ ^ 0xffffffff) == -1) {
			Class258.method3124(anInt8795, anInt4951, is, 32993, anInt4950, anInt8803, 1, aGLToolkit4947.anInt6740);
			this.method1766((byte) 126, true);
		} else {
			OpenGL.glPixelStorei(3314, i_31_);
			OpenGL.glTexImage2Di(anInt4951, 0, anInt4950, anInt8795, anInt8803, 0, 32993, aGLToolkit4947.anInt6740, is, 4 * i_32_);
			OpenGL.glPixelStorei(3314, 0);
			this.method1766((byte) 96, false);
		}
		this.method1757(false, true);
	}
	
	final void method1773(int i, int i_39_, int i_40_, byte b, int i_41_, int i_42_, int i_43_) {
		anInt8800++;
		if (b > 60) {
			int i_44_ = aGLToolkit4947.anInt6567 + (-i + -i_41_);
			aGLToolkit4947.method1444(-2, this);
			OpenGL.glCopyTexSubImage2D(anInt4951, 0, i_39_, anInt8803 - i_40_ - i, i_42_, i_44_, i_43_, i);
			OpenGL.glFlush();
		}
	}
	
	Class169_Sub2(GLToolkit gltoolkit, int i, int i_45_, int i_46_, int i_47_, boolean bool, float[] fs, int i_48_) {
		super(gltoolkit, i, i_45_, i_46_ * i_47_, bool);
		anInt8795 = i_46_;
		anInt8803 = i_47_;
		aGLToolkit4947.method1444(-2, this);
		if (!bool || (anInt4951 ^ 0xffffffff) == -34038) {
			OpenGL.glTexImage2Df(anInt4951, 0, anInt4950, anInt8795, anInt8803, 0, i_48_, 5126, fs, 0);
			this.method1766((byte) 100, false);
		} else {
			Node_Sub47.method2953(i_48_, i_47_, true, i_46_, i, fs, i_45_);
			this.method1766((byte) 120, true);
		}
		this.method1757(false, true);
	}
	
	final void method1774(int i, int i_49_, int i_50_, int i_51_) {
		anInt8802++;
		OpenGL.glFramebufferTexture2DEXT(i_50_, i_51_, anInt4951, anInt4960, i);
		anInt8805 = i_50_;
		if (i_49_ != 3314) {
			method1773(-14, -48, -69, (byte) 58, 74, 2, 50);
		}
		anInt8797 = i_51_;
	}
	
	final void method1775(int i, byte b, int i_52_, int i_53_, int i_54_, byte[] bs, boolean bool, int i_55_, int i_56_, int i_57_) {
		if ((i_55_ ^ 0xffffffff) == -1) {
			i_55_ = i_54_;
		}
		anInt8794++;
		if (bool) {
			int i_58_ = Class349.method3989(i_52_, (byte) -72);
			int i_59_ = i_54_ * i_58_;
			int i_60_ = i_58_ * i_55_;
			byte[] bs_61_ = new byte[i_59_ * i_53_];
			for (int i_62_ = 0; i_53_ > i_62_; i_62_++) {
				int i_63_ = i_59_ * i_62_;
				int i_64_ = i_60_ * (i_53_ - i_62_ + -1) - -i;
				for (int i_65_ = 0; i_59_ > i_65_; i_65_++)
					bs_61_[i_63_++] = bs[i_64_++];
			}
			bs = bs_61_;
		}
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_54_ != i_55_) {
			OpenGL.glPixelStorei(3314, i_55_);
		}
		if (b < 81) {
			method1774(-13, 61, 125, 53);
		}
		OpenGL.glTexSubImage2Dub(anInt4951, 0, i_56_, i_57_, i_54_, i_53_, i_52_, 5121, bs, i);
		if (i_55_ != i_54_) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
	
	final void method1776(boolean bool, int i, boolean bool_66_) {
		if ((anInt4951 ^ 0xffffffff) == -3554) {
			aGLToolkit4947.method1444(-2, this);
			OpenGL.glTexParameteri(anInt4951, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt4951, 10243, !bool_66_ ? 33071 : 10497);
		}
		anInt8799++;
		@SuppressWarnings("unused")
		int i_67_ = -5 / ((-32 - i) / 54);
	}
}
