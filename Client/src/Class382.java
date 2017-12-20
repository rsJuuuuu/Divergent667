/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.awt.Color;

public class Class382 implements Interface11
{
	static int anInt5232;
	static int anInt5233;
	private int anInt5234 = -1;
	static int anInt5235;
	static int anInt5236;
	static int anInt5237;
	private int anInt5238;
	private int anInt5239 = 0;
	static int anInt5240;
	private int anInt5241;
	static int anInt5242;
	private GLToolkit aGLToolkit5243;
	static int anInt5244;
	static int anInt5245;
	static Class142 aClass142_5246;
	static int anInt5247;
	static int anInt5248;
	static IncommingPacket aClass192_5249 = new IncommingPacket(133, -1);
	private Interface2[] anInterface2Array5250 = new Interface2[9];
	static int anInt5251;
	static int anInt5252;
	static int anInt5253;
	static boolean aBoolean5254 = false;
	static int anInt5255;
	private int anInt5256;
	static int anInt5257;
	static Color[] aColorArray5258 = { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
	private int anInt5259;
	static boolean aBoolean5260;
	static int anInt5261;
	static int anInt5262;
	
	final void method4175(int i, int i_0_) {
		anInt5251++;
		if (anInterface2Array5250[i] != null) {
			anInterface2Array5250[i].method5(0);
		}
		anInt5259 &= 1 << i ^ 0xffffffff;
		if (i_0_ != -25845) {
			anInt5241 = 63;
		}
		anInterface2Array5250[i] = null;
	}
	
	public final void method33(int i) {
		anInt5242++;
		if (i != 404) {
			method30(36);
		}
		OpenGL.glBindFramebufferEXT(36009, anInt5241);
		anInt5239 |= 0x2;
		anInt5234 = method4177(36009);
	}
	
	private final void method4176(int i, Class169_Sub1 class169_sub1, int i_1_, int i_2_, boolean bool) {
		anInt5235++;
		if (bool != false) {
			aBoolean5254 = true;
		}
		if (anInt5234 == -1) {
			throw new RuntimeException();
		}
		int i_3_ = 1 << i_1_;
		if (((i_3_ ^ 0xffffffff) & anInt5259) != 0) {
			if (anInt5256 != class169_sub1.anInt8793 || anInt5238 != class169_sub1.anInt8793) {
				throw new RuntimeException();
			}
		} else {
			anInt5238 = class169_sub1.anInt8793;
			anInt5256 = class169_sub1.anInt8793;
		}
		class169_sub1.method1767(i, (byte) -126, Node_Sub38_Sub2.anIntArray10096[i_1_], anInt5234, i_2_);
		anInterface2Array5250[i_1_] = class169_sub1;
		anInt5259 |= i_3_;
	}
	
	public final void method29(int i) {
		anInt5232++;
		OpenGL.glBindFramebufferEXT(36160, 0);
		anInt5239 &= ~0x4;
		if (i > -39) {
			anInt5239 = -114;
		}
		anInt5234 = method4177(36009);
	}
	
	private final int method4177(int i) {
		anInt5237++;
		if ((anInt5239 & 0x4) != 0) {
			return 36160;
		}
		if ((0x2 & anInt5239) != 0) {
			return 36009;
		}
		if ((anInt5239 & 0x1) != 0) {
			return 36008;
		}
		if (i != 36009) {
			aGLToolkit5243 = null;
		}
		return -1;
	}
	
	final void method4178(CacheNode_Sub17 cachenode_sub17, int i, int i_4_) {
		anInt5248++;
		if ((anInt5234 ^ 0xffffffff) == 0) {
			throw new RuntimeException();
		}
		int i_5_ = i_4_ << i;
		if ((anInt5259 & (i_5_ ^ 0xffffffff) ^ 0xffffffff) == -1) {
			anInt5238 = cachenode_sub17.anInt8850;
			anInt5256 = cachenode_sub17.anInt8837;
		} else if ((anInt5256 ^ 0xffffffff) != (cachenode_sub17.anInt8837 ^ 0xffffffff) || (cachenode_sub17.anInt8850 ^ 0xffffffff) != (anInt5238 ^ 0xffffffff)) {
			throw new RuntimeException();
		}
		cachenode_sub17.method2396(Node_Sub38_Sub2.anIntArray10096[i], anInt5234, i_4_ ^ ~0x1d);
		anInterface2Array5250[i] = cachenode_sub17;
		anInt5259 |= i_5_;
	}
	
	static final int method4179(Class289 class289, byte b, GraphicsToolkit graphicstoolkit) {
		int i = -55 / ((-77 - b) / 43);
		anInt5255++;
		if (class289.anInt3629 != -1) {
			return class289.anInt3629;
		}
		if ((class289.anInt3640 ^ 0xffffffff) != 0) {
			Class91 class91 = graphicstoolkit.aD1543.method10(class289.anInt3640, -8217);
			if (!class91.aBoolean1223) {
				return class91.aShort1221;
			}
		}
		return class289.anInt3631;
	}
	
	public final void method28(byte b) {
		if (b != -106) {
			aBoolean5260 = true;
		}
		anInt5233++;
		OpenGL.glBindFramebufferEXT(36009, 0);
		anInt5239 &= ~0x2;
		anInt5234 = method4177(b ^ ~0x8cc0);
	}
	
	public final void method32(int i) {
		anInt5257++;
		OpenGL.glBindFramebufferEXT(36008, 0);
		anInt5239 &= ~0x1;
		anInt5234 = method4177(36009);
		if (i != 8372) {
			anInt5259 = -59;
		}
	}
	
	final boolean method4180(int i) {
		if (i != 10785) {
			aBoolean5254 = true;
		}
		anInt5262++;
		int i_6_ = OpenGL.glCheckFramebufferStatusEXT(anInt5234);
        return i_6_ == 36053;
    }
	
	final void method4181(int i, Class169_Sub2 class169_sub2, int i_7_) {
		anInt5261++;
		method4184(i_7_, 0, 0, class169_sub2);
		if (i != 18264) {
			anInt5241 = 124;
		}
	}
	
	final void method4182(int i, Class169_Sub1 class169_sub1, int i_8_, int i_9_) {
		method4176(i_8_, class169_sub1, i, 0, false);
		anInt5247++;
		if (i_9_ < 28) {
			method4185(false);
		}
	}
	
	final void method4183(int i, byte b) {
		int i_10_ = 127 % ((73 - b) / 48);
		anInt5236++;
		if (anInt5234 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Node_Sub38_Sub2.anIntArray10096[i]);
	}
	
	protected final void finalize() throws Throwable {
		anInt5252++;
		aGLToolkit5243.method1411(anInt5241, 20010);
		super.finalize();
	}
	
	private final void method4184(int i, int i_11_, int i_12_, Class169_Sub2 class169_sub2) {
		anInt5253++;
		if (anInt5234 == -1) {
			throw new RuntimeException();
		}
		int i_13_ = 1 << i;
		if (((i_13_ ^ 0xffffffff) & anInt5259) == i_12_) {
			anInt5256 = class169_sub2.anInt8795;
			anInt5238 = class169_sub2.anInt8803;
		} else if (anInt5256 != class169_sub2.anInt8795 || anInt5238 != class169_sub2.anInt8803) {
			throw new RuntimeException();
		}
		class169_sub2.method1774(i_11_, 3314, anInt5234, Node_Sub38_Sub2.anIntArray10096[i]);
		anInterface2Array5250[i] = class169_sub2;
		anInt5259 |= i_13_;
	}
	
	public static void method4185(boolean bool) {
		aClass192_5249 = null;
		aColorArray5258 = null;
		aClass142_5246 = null;
		if (bool != false) {
			aClass142_5246 = null;
		}
	}
	
	final void method4186(int i, byte b) {
		anInt5244++;
		if (anInt5234 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Node_Sub38_Sub2.anIntArray10096[i]);
		if (b <= 89) {
			aBoolean5260 = true;
		}
	}
	
	public final void method30(int i) {
		anInt5245++;
		OpenGL.glBindFramebufferEXT(36160, anInt5241);
		anInt5239 |= 0x4;
		int i_14_ = -56 / ((i - 24) / 36);
		anInt5234 = method4177(36009);
	}
	
	public final void method31(byte b) {
		anInt5240++;
		OpenGL.glBindFramebufferEXT(36008, anInt5241);
		anInt5239 |= 0x1;
		int i = 27 / ((-73 - b) / 50);
		anInt5234 = method4177(36009);
	}
	
	Class382(GLToolkit gltoolkit) {
		if (!gltoolkit.aBoolean6719) {
			throw new IllegalStateException("");
		}
		aGLToolkit5243 = gltoolkit;
		OpenGL.glGenFramebuffersEXT(1, Class321.anIntArray4067, 0);
		anInt5241 = Class321.anIntArray4067[0];
	}
}
