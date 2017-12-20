/* Class169_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class169_Sub1 extends Class169
{
	static boolean aBoolean8783 = false;
	static int anInt8784;
	static IncommingPacket aClass192_8785 = new IncommingPacket(91, -1);
	private int anInt8786 = -1;
	static int anInt8787;
	static boolean[] aBooleanArray8788;
	static int anInt8789;
	static int anInt8790;
	private int anInt8791 = -1;
	static int anInt8792;
	protected int anInt8793;
	
	final void method1767(int i, byte b, int i_0_, int i_1_, int i_2_) {
		anInt8792++;
		OpenGL.glFramebufferTexture2DEXT(i_1_, i_0_, i, anInt4960, i_2_);
		anInt8791 = i_0_;
		@SuppressWarnings("unused")
		int i_3_ = -46 % ((b - -68) / 47);
		anInt8786 = i_1_;
	}
	
	static final void method1768(int i) {
		if (i == 0) {
			if (Class320_Sub6.anObject8265 == null) {
				Class188_Sub1_Sub1 class188_sub1_sub1 = new Class188_Sub1_Sub1();
				byte[] bs = class188_sub1_sub1.method1896(128, 128, 16, 50);
				Class320_Sub6.anObject8265 = Class135.method1588(bs, 23386, false);
			}
			anInt8790++;
			if (Class347.anObject4286 == null) {
				Class188_Sub2_Sub2 class188_sub2_sub2 = new Class188_Sub2_Sub2();
				byte[] bs = class188_sub2_sub2.method1913(0, 128, 128, 16);
				Class347.anObject4286 = Class135.method1588(bs, 23386, false);
			}
		}
	}
	
	static final void method1769(int i, int i_4_, int i_5_) {
		if (Class339_Sub7.anInt8728 != i_5_) {
			CacheNode_Sub3.anIntArray9442 = new int[i_5_];
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_++)
				CacheNode_Sub3.anIntArray9442[i_6_] = (i_6_ << 12) / i_5_;
			Class303.anInt3824 = i_5_ + -1;
			Class339_Sub7.anInt8728 = i_5_;
			Class359.anInt4468 = 32 * i_5_;
		}
		if (i != 485964236) {
			anInt8787 = -98;
		}
		anInt8784++;
		if ((i_4_ ^ 0xffffffff) != (Node_Sub38_Sub1.anInt10083 ^ 0xffffffff)) {
			if ((Class339_Sub7.anInt8728 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) {
				Node_Sub25_Sub1.anIntArray9941 = CacheNode_Sub3.anIntArray9442;
			} else {
				Node_Sub25_Sub1.anIntArray9941 = new int[i_4_];
				for (int i_7_ = 0; (i_4_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
					Node_Sub25_Sub1.anIntArray9941[i_7_] = (i_7_ << 12) / i_4_;
			}
			r_Sub2.anInt11054 = i_4_ + -1;
			Node_Sub38_Sub1.anInt10083 = i_4_;
		}
	}
	
	Class169_Sub1(GLToolkit gltoolkit, int i, int i_8_, boolean bool, byte[][] bs, int i_9_) {
		super(gltoolkit, 34067, i, 6 * i_8_ * i_8_, bool);
		anInt8793 = i_8_;
		aGLToolkit4947.method1444(-2, this);
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -7; i_10_++)
			OpenGL.glTexImage2Dub(i_10_ + 34069, 0, anInt4950, i_8_, i_8_, 0, i_9_, 5121, bs[i_10_], 0);
		this.method1757(false, true);
	}
	
	Class169_Sub1(GLToolkit gltoolkit, int i, int i_11_) {
		super(gltoolkit, 34067, i, 6 * i_11_ * i_11_, false);
		anInt8793 = i_11_;
		aGLToolkit4947.method1444(-2, this);
		for (int i_12_ = 0; i_12_ < 6; i_12_++)
			OpenGL.glTexImage2Dub(i_12_ + 34069, 0, anInt4950, i_11_, i_11_, 0, Class320_Sub16.method3742(6406, anInt4950), 5121, null, 0);
		this.method1757(false, true);
	}
	
	public final void method5(int i) {
		OpenGL.glFramebufferTexture2DEXT(anInt8786, anInt8791, 3553, i, 0);
		anInt8789++;
		anInt8791 = -1;
		anInt8786 = -1;
	}
	
	Class169_Sub1(GLToolkit gltoolkit, int i, int i_13_, boolean bool, int[][] is) {
		super(gltoolkit, 34067, i, i_13_ * i_13_ * 6, bool);
		anInt8793 = i_13_;
		aGLToolkit4947.method1444(-2, this);
		if (!bool) {
			for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -7; i_14_++)
				OpenGL.glTexImage2Di(34069 - -i_14_, 0, anInt4950, i_13_, i_13_, 0, 32993, aGLToolkit4947.anInt6740, is[i_14_], 0);
		} else {
			for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -7; i_15_++)
				Class258.method3124(i_13_, i_15_ + 34069, is[i_15_], 32993, anInt4950, i_13_, 1, aGLToolkit4947.anInt6740);
		}
		this.method1757(false, true);
	}
	
	public static void method1770(byte b) {
		aBooleanArray8788 = null;
		aClass192_8785 = null;
		if (b != -18) {
			aBooleanArray8788 = null;
		}
	}
}
