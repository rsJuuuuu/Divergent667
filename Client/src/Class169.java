/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class169 implements Interface2
{
	private int anInt4944;
	private boolean aBoolean4945;
	static int anInt4946;
	protected GLToolkit aGLToolkit4947;
	private boolean aBoolean4948 = false;
	static int anInt4949;
	protected int anInt4950;
	protected int anInt4951;
	static int anInt4952;
	static int anInt4953;
	static int[][] anIntArrayArray4954;
	static int anInt4955;
	static int anInt4956;
	static int anInt4957;
	static int anInt4958;
	static int anInt4959;
	protected int anInt4960;
	static short aShort4961;
	static int anInt4962;
	static int anInt4963;
	static int anInt4964;
	static int[] anIntArray4965 = new int[32];
	
	static final char method1755(int i, int i_0_, char c) {
		anInt4959++;
		if (c >= 192 && c <= 255) {
			if ((c ^ 0xffffffff) <= -193 && c <= 198) {
				return 'A';
			}
			if (c == 199) {
				return 'C';
			}
			if ((c ^ 0xffffffff) <= -201 && c <= 203) {
				return 'E';
			}
			if ((c ^ 0xffffffff) <= -205 && c <= 207) {
				return 'I';
			}
			if (c >= 210 && c <= 214) {
				return 'O';
			}
			if (c >= 217 && (c ^ 0xffffffff) >= -221) {
				return 'U';
			}
			if (c == 221) {
				return 'Y';
			}
			if (c == 223) {
				return 's';
			}
			if (c >= 224 && (c ^ 0xffffffff) >= -231) {
				return 'a';
			}
			if ((c ^ 0xffffffff) == -232) {
				return 'c';
			}
			if (c >= 232 && c <= 235) {
				return 'e';
			}
			if ((c ^ 0xffffffff) <= -237 && (c ^ 0xffffffff) >= -240) {
				return 'i';
			}
			if ((c ^ 0xffffffff) <= -243 && (c ^ 0xffffffff) >= -247) {
				return 'o';
			}
			if ((c ^ 0xffffffff) <= -250 && c <= 252) {
				return 'u';
			}
			if (c == 253 || c == 255) {
				return 'y';
			}
		}
		if (i != 6272) {
			return 'e';
		}
		if ((c ^ 0xffffffff) == -339) {
			return 'O';
		}
		if ((c ^ 0xffffffff) == -340) {
			return 'o';
		}
		if ((c ^ 0xffffffff) == -377) {
			return 'Y';
		}
		return c;
	}
	
	private final void method1756(byte b, int i) {
		aGLToolkit4947.anInt6624 -= i;
		anInt4958++;
		if (b <= 32) {
			aBoolean4945 = true;
		}
		aGLToolkit4947.anInt6624 += method1763(-70);
	}
	
	final void method1757(boolean bool, boolean bool_1_) {
		if (bool == false) {
			if (aBoolean4948 == !bool_1_) {
				aBoolean4948 = bool_1_;
				method1758(false);
			}
			anInt4957++;
		}
	}
	
	private final void method1758(boolean bool) {
		anInt4956++;
		aGLToolkit4947.method1444(-2, this);
		if (!aBoolean4948) {
			OpenGL.glTexParameteri(anInt4951, 10241, aBoolean4945 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt4951, 10240, 9728);
		} else {
			OpenGL.glTexParameteri(anInt4951, 10241, aBoolean4945 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt4951, 10240, 9729);
		}
		if (bool != false) {
			method1764(-112);
		}
	}
	
	final int method1759(byte b) {
		@SuppressWarnings("unused")
		int i = -66 % ((-37 - b) / 52);
		anInt4953++;
		return anInt4960;
	}
	
	static final void method1760(boolean bool) {
		Class48.method478(12, (byte) 105);
		if (bool != true) {
			anIntArray4965 = null;
		}
		anInt4962++;
		Class160.method1730(112);
		System.gc();
	}
	
	final void method1761(byte b) {
		if (b == -53) {
			anInt4949++;
			if (anInt4960 > 0) {
				aGLToolkit4947.method1473(anInt4960, method1763(b + 2), b + -22249);
				anInt4960 = 0;
			}
		}
	}
	
	static final int method1762(byte b, int i) {
		if (b != 114) {
			return 89;
		}
		anInt4952++;
		return 0x3ff & i;
	}
	
	private final int method1763(int i) {
		if (i > -46) {
			anInt4951 = -105;
		}
		anInt4946++;
		int i_2_ = aGLToolkit4947.method1471(anInt4950, 123) * anInt4944;
		if (aBoolean4945) {
			return i_2_ * 4 / 3;
		}
		return i_2_;
	}
	
	public static void method1764(int i) {
		anIntArrayArray4954 = null;
		anIntArray4965 = null;
		if (i > -46) {
			anIntArray4965 = null;
		}
	}
	
	protected final void finalize() throws Throwable {
		method1761((byte) -53);
		anInt4964++;
		super.finalize();
	}
	
	final boolean method1765(int i) {
		if (i != -231) {
			anIntArrayArray4954 = null;
		}
		anInt4955++;
		if (aGLToolkit4947.aBoolean6719) {
			int i_3_ = method1763(-51);
			aGLToolkit4947.method1444(i ^ 0xe7, this);
			OpenGL.glGenerateMipmapEXT(anInt4951);
			aBoolean4945 = true;
			method1758(false);
			method1756((byte) 80, i_3_);
			return true;
		}
		return false;
	}
	
	final void method1766(byte b, boolean bool) {
		if (bool != aBoolean4945) {
			int i = method1763(-88);
			aBoolean4945 = true;
			method1758(false);
			method1756((byte) 98, i);
		}
		if (b <= 64) {
			method1757(false, true);
		}
		anInt4963++;
	}
	
	Class169(GLToolkit gltoolkit, int i, int i_4_, int i_5_, boolean bool) {
		aBoolean4945 = bool;
		anInt4951 = i;
		anInt4944 = i_5_;
		aGLToolkit4947 = gltoolkit;
		anInt4950 = i_4_;
		OpenGL.glGenTextures(1, Node_Sub12.anIntArray5459, 0);
		anInt4960 = Node_Sub12.anIntArray5459[0];
		method1756((byte) 48, 0);
	}
	
	public abstract void method5(int i);
}
