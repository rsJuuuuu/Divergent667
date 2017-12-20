/* Class117_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117_Sub2 extends Class117 implements Interface9
{
	static int anInt5147;
	static int anInt5148;
	static int anInt5149;
	static int anInt5150;
	static short[][][] aShortArrayArrayArray5151;
	static int anInt5152;
	static int anInt5153;
	static BufferedStream aBuffer5154;
	private int anInt5155;
	
	Class117_Sub2(GLToolkit gltoolkit, int i, byte[] bs, int i_0_, boolean bool) {
		super(gltoolkit, 34962, bs, i_0_, bool);
		anInt5155 = i;
	}
	
	public final int method21(int i) {
		if (i != 23144) {
			method22(null, 15, -83, (byte) -8);
		}
		anInt5148++;
		return anInt5155;
	}
	
	public final long method23(int i) {
		if (i != 28552) {
			anInt5155 = -59;
		}
		anInt5147++;
		return 0L;
	}
	
	public final int method24(int i) {
		anInt5152++;
		if (i != 29121) {
			method1173((byte) -49);
		}
		return anInt1476;
	}
	
	Class117_Sub2(GLToolkit gltoolkit, int i, jaclib.memory.Buffer buffer, int i_1_, boolean bool) {
		super(gltoolkit, 34962, buffer, i_1_, bool);
		anInt5155 = i;
	}
	
	static final int method1172(int i, int i_2_) {
		if (Class320_Sub18.aByteArrayArray8379 != null) {
			return Class320_Sub18.aByteArrayArray8379[i][i_2_] & 0xff;
		}
		return 0;
	}
	
	public static void method1173(byte b) {
		aBuffer5154 = null;
		if (b < -116) {
			aShortArrayArrayArray5151 = null;
		}
	}
	
	final void method1167(int i) {
		anInt5150++;
		aGLToolkit1474.method1408(i + 24020, this);
		if (i != -20931) {
			method1167(12);
		}
	}
	
	static final void method1174(int i, byte[][][] bs, int i_3_, int i_4_, int i_5_, int i_6_, GraphicsToolkit graphicstoolkit, int i_7_, int i_8_, byte b, int i_9_, int i_10_, int i_11_) {
		anInt5153++;
		if ((i_11_ ^ 0xffffffff) != -1 && i_5_ != 0) {
			if (i_11_ == 9) {
				i_8_ = i_8_ - -1 & 0x3;
				i_11_ = 1;
			}
			if (i_11_ == 10) {
				i_11_ = 1;
				i_8_ = 0x3 & 3 + i_8_;
			}
			if ((i_11_ ^ 0xffffffff) == -12) {
				i_8_ = 0x3 & i_8_ - -3;
				i_11_ = 8;
			}
			graphicstoolkit.Q(i_6_, i_9_, i_4_, i, i_10_, i_3_, bs[-1 + i_11_][i_8_], i_5_, i_7_);
			@SuppressWarnings("unused")
			int i_12_ = -68 / (-b / 58);
		}
	}
	
	public final void method22(byte[] bs, int i, int i_13_, byte b) {
		this.method1165((byte) 110, i, bs);
		anInt5149++;
		if (b != 74) {
			aBuffer5154 = null;
		}
		anInt5155 = i_13_;
	}
}
