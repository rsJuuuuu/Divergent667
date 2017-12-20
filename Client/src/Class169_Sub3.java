/* Class169_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.Random;

public class Class169_Sub3 extends Class169
{
	static int anInt8807;
	static OutcommingPacket aClass318_8808 = new OutcommingPacket(71, 4);
	protected int anInt8809;
	static int anInt8810;
	protected int anInt8811;
	private int anInt8812 = -1;
	static int anInt8813;
	static int anInt8814;
	static int anInt8815;
	static int anInt8816;
	private int anInt8817 = -1;
	static Class104 aClass104_8818 = new Class104();
	protected int anInt8819;
	static Class357 aClass357_8820;
	static int anInt8821;
	
	static final byte[] method1778(int i, boolean bool) {
		anInt8807++;
		if (bool != true) {
			method1780((byte) -62);
		}
		CacheNode_Sub7 cachenode_sub7 = (CacheNode_Sub7) Class262_Sub18.aClass335_7849.method3849((long) i, bool);
		if (cachenode_sub7 == null) {
			byte[] bs = new byte[512];
			Random random = new Random((long) i);
			for (int i_0_ = 0; i_0_ < 255; i_0_++)
				bs[i_0_] = (byte) i_0_;
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -256; i_1_++) {
				int i_2_ = -i_1_ + 255;
				int i_3_ = Class330.method3838(-5208, i_2_, random);
				byte b = bs[i_3_];
				bs[i_3_] = bs[i_2_];
				bs[i_2_] = bs[-i_1_ + 511] = b;
			}
			cachenode_sub7 = new CacheNode_Sub7(bs);
			Class262_Sub18.aClass335_7849.method3848((byte) -128, cachenode_sub7, (long) i);
		}
		return cachenode_sub7.aByteArray9490;
	}
	
	static final void method1779(GraphicsToolkit graphicstoolkit, String string, boolean bool, Class357 class357, Class52 class52, int i) {
		anInt8816++;
		boolean bool_4_ = !Class262_Sub16.aBoolean7830 || Node_Sub6.method2419(84);
		if (bool_4_) {
			if (Class262_Sub16.aBoolean7830 && bool_4_) {
				class357 = CacheNode_Sub2.aClass357_9438;
				class52 = graphicstoolkit.a(class357, Class335.aClass383Array4163, true);
				int i_5_ = class357.method4030(null, 0, string, 250);
				int i_6_ = class357.method4034(250, class357.anInt4430, string, null, (byte) -74);
				int i_7_ = Class336_Sub3.aClass383_8624.anInt4897;
				int i_8_ = 4 + i_7_;
				i_5_ += i_8_ * 2;
				i_6_ += 2 * i_8_;
				if (Class168.anInt2043 > i_6_) {
					i_6_ = Class168.anInt2043;
				}
				if ((Class180.anInt2133 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
					i_5_ = Class180.anInt2133;
				}
				int i_9_ = Class262_Sub4.aClass379_7731.method4160(i + 16777098, Node_Sub38_Sub12.anInt10225, i_5_) + CacheNode_Sub18.anInt9604;
				int i_10_ = Class336_Sub2.aClass77_8568.method775(Class257.anInt3244, false, i_6_) - -CacheNode_Sub7.anInt9487;
				if (Class71.aBoolean967) {
					i_9_ += Class67.method733(-122);
					i_10_ += Class226.method2112(i + 16777472);
				}
				graphicstoolkit.a(Class44.aClass383_667, false).method1183(Class223.aClass383_2664.anInt4897 + i_9_, Class223.aClass383_2664.anInt4900 + i_10_, i_5_ + -(Class223.aClass383_2664.anInt4897 * 2), i_6_ + -(2 * Class223.aClass383_2664.anInt4900), 1, 0, 0);
				graphicstoolkit.a(Class223.aClass383_2664, true).setPosition(i_9_, i_10_);
				Class223.aClass383_2664.method4200();
				graphicstoolkit.a(Class223.aClass383_2664, true).setPosition(-i_7_ + (i_5_ + i_9_), i_10_);
				Class223.aClass383_2664.method4189();
				graphicstoolkit.a(Class223.aClass383_2664, true).setPosition(-i_7_ + (i_5_ + i_9_), -i_7_ + i_10_ + i_6_);
				Class223.aClass383_2664.method4200();
				graphicstoolkit.a(Class223.aClass383_2664, true).setPosition(i_9_, -i_7_ + (i_6_ + i_10_));
				Class223.aClass383_2664.method4189();
				graphicstoolkit.a(Class336_Sub3.aClass383_8624, true).method1192(i_9_, Class223.aClass383_2664.anInt4900 + i_10_, i_7_, -(Class223.aClass383_2664.anInt4900 * 2) + i_6_);
				Class336_Sub3.aClass383_8624.method4198();
				graphicstoolkit.a(Class336_Sub3.aClass383_8624, true).method1192(Class223.aClass383_2664.anInt4897 + i_9_, i_10_, -(Class223.aClass383_2664.anInt4897 * 2) + i_5_, i_7_);
				Class336_Sub3.aClass383_8624.method4198();
				graphicstoolkit.a(Class336_Sub3.aClass383_8624, true).method1192(-i_7_ + (i_5_ + i_9_), Class223.aClass383_2664.anInt4900 + i_10_, i_7_, i_6_ - Class223.aClass383_2664.anInt4900 * 2);
				Class336_Sub3.aClass383_8624.method4198();
				graphicstoolkit.a(Class336_Sub3.aClass383_8624, true).method1192(i_9_ - -Class223.aClass383_2664.anInt4897, i_6_ + (i_10_ - i_7_), i_5_ - Class223.aClass383_2664.anInt4897 * 2, i_7_);
				Class336_Sub3.aClass383_8624.method4198();
				class52.method535(0, null, ~0xffffff | Class359.anInt4464, string, null, null, i_8_ + i_10_, -1, i + 16777306, 0, 1, i_9_ - -i_8_, 1, 0, -(2 * i_8_) + i_5_, -(i_8_ * 2) + i_6_);
				Class310.method3589(i_5_, i_9_, (byte) 109, i_6_, i_10_);
			} else {
				int i_11_ = class357.method4030(null, 0, string, 250);
				int i_12_ = 13 * class357.method4028(string, null, (byte) 77, 250);
				int i_13_ = 4;
				int i_14_ = i_13_ + 6;
				int i_15_ = i_13_ + 6;
				graphicstoolkit.aa(-i_13_ + i_14_, -i_13_ + i_15_, i_13_ + (i_13_ + i_11_), i_13_ + i_12_ + i_13_, -16777216, 0);
				graphicstoolkit.d(-i_13_ + i_14_, -i_13_ + i_15_, i_13_ + i_13_ + i_11_, i_13_ + (i_13_ + i_12_), -1, 0);
				class52.method535(0, null, -1, string, null, null, i_15_, -1, i + 16777322, 0, 1, i_14_, 1, 0, i_11_, i_12_);
				Class310.method3589(i_13_ + i_13_ + i_11_, -i_13_ + i_14_, (byte) 116, i_13_ + i_12_ + i_13_, i_15_ + -i_13_);
			}
			if (bool) {
				try {
					if (Class71.aBoolean967) {
						Class188_Sub1_Sub2.method1900((byte) 2);
					} else {
						graphicstoolkit.method1241(19088);
					}
				} catch (Exception_Sub1 exception_sub1) {
					/* empty */
				}
			}
			if (i != -16777216) {
				aClass357_8820 = null;
			}
		}
	}
	
	public static void method1780(byte b) {
		aClass318_8808 = null;
		if (b >= -53) {
			aClass104_8818 = null;
		}
		aClass357_8820 = null;
		aClass104_8818 = null;
	}
	
	Class169_Sub3(GLToolkit gltoolkit, int i, int i_16_, int i_17_, int i_18_) {
		super(gltoolkit, 32879, i, i_18_ * (i_17_ * i_16_), false);
		anInt8809 = i_17_;
		anInt8811 = i_18_;
		anInt8819 = i_16_;
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glTexImage3Dub(anInt4951, 0, anInt4950, anInt8819, anInt8809, anInt8811, 0, Class320_Sub16.method3742(6406, anInt4950), 5121, null, 0);
		this.method1757(false, true);
	}
	
	static final int method1781(byte b) {
		anInt8810++;
		int i = Class252.aClass110_3189.method1130(b ^ ~0x50);
		if (b != 82) {
			method1779(null, null, false, null, null, 76);
		}
		if ((i ^ 0xffffffff) > (Node_Sub25_Sub4.aClass110Array10006.length - 1 ^ 0xffffffff)) {
			Class252.aClass110_3189 = Node_Sub25_Sub4.aClass110Array10006[i - -1];
		}
		return 100;
	}
	
	static final void method1782(int i) {
		if (i < 126) {
			method1782(5);
		}
		for (int i_19_ = 0; Class290_Sub11.anInt8181 > i_19_; i_19_++) {
			int i_20_ = AnimableAnimator.method254(Class259.anInt3300 + i_19_, 16939, Class290_Sub11.anInt8181) * Class117.anInt1479;
			for (int i_21_ = 0; Class117.anInt1479 > i_21_; i_21_++) {
				int i_22_ = AnimableAnimator.method254(Class338.anInt4190 + i_21_, 16939, Class117.anInt1479) + i_20_;
				if ((Class290_Sub4.anIntArray8102[i_22_] ^ 0xffffffff) == (Class225.anInt2675 ^ 0xffffffff)) {
					Class352.anInterface6Array4332[i_22_].method19(0, 0, StandardSprite.anInt8946, aa_Sub3.anInt5493, StandardSprite.anInt8946 * i_21_, aa_Sub3.anInt5493 * i_19_, true, true);
				}
			}
		}
		anInt8813++;
	}
	
	final void method1783(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, byte b, int i_28_) {
		if (b == 98) {
			aGLToolkit4947.method1444(b + -100, this);
			anInt8814++;
			OpenGL.glCopyTexSubImage3D(anInt4951, 0, i_27_, i, i_24_, i_25_, i_23_, i_26_, i_28_);
			OpenGL.glFlush();
		}
	}
	
	public final void method5(int i) {
		anInt8815++;
		OpenGL.glFramebufferTexture3DEXT(anInt8812, anInt8817, anInt4951, 0, 0, i);
		anInt8812 = -1;
		anInt8817 = -1;
	}
	
	Class169_Sub3(GLToolkit gltoolkit, int i, int i_29_, int i_30_, int i_31_, byte[] bs, int i_32_) {
		super(gltoolkit, 32879, i, i_29_ * i_30_ * i_31_, false);
		anInt8809 = i_30_;
		anInt8811 = i_31_;
		anInt8819 = i_29_;
		aGLToolkit4947.method1444(-2, this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(anInt4951, 0, anInt4950, anInt8819, anInt8809, anInt8811, 0, i_32_, 5121, bs, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method1757(false, true);
	}
}
