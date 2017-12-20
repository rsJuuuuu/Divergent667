/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class24
{
	static boolean aBoolean436 = false;
	protected String aString437;
	protected byte aByte438;
	static int anInt439;
	static int anInt440;
	protected int anInt441;
	static Class275 aClass275_442;
	static GLSprite[] aGLSpriteArray443;
	
	public static void method303(byte b) {
		if (b != -55) {
			method303((byte) -51);
		}
		aGLSpriteArray443 = null;
		aClass275_442 = null;
	}
	
	static final Class237 method304(int i, int i_0_, byte[] bs, GLXToolkit glxtoolkit) {
		anInt440++;
		if (bs == null || bs.length == 0) {
			return null;
		}
		if (i_0_ != -11847) {
			return null;
		}
		long l = OpenGL.glCreateShaderObjectARB(i);
		OpenGL.glShaderSourceRawARB(l, bs);
		OpenGL.glCompileShaderARB(l);
		OpenGL.glGetObjectParameterivARB(l, 35713, Node_Sub26.anIntArray7255, 0);
		if (Node_Sub26.anIntArray7255[0] == 0) {
			if ((Node_Sub26.anIntArray7255[0] ^ 0xffffffff) == -1) {
				//System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(l, 35716, Node_Sub26.anIntArray7255, 1);
			if ((Node_Sub26.anIntArray7255[1] ^ 0xffffffff) < -2) {
				byte[] bs_1_ = new byte[Node_Sub26.anIntArray7255[1]];
				OpenGL.glGetInfoLogARB(l, Node_Sub26.anIntArray7255[1], Node_Sub26.anIntArray7255, 0, bs_1_, 0);
			}
			if ((Node_Sub26.anIntArray7255[0] ^ 0xffffffff) == -1) {
				OpenGL.glDeleteObjectARB(l);
				return null;
			}
		}
		return new Class237(glxtoolkit, l, i);
	}
	
	static final boolean method305(int i, int i_2_, int i_3_, boolean bool, int[] is, int i_4_, int i_5_, int i_6_) {
		if (bool != false) {
			return false;
		}
		anInt439++;
		if (i < 0) {
			i = 0;
		}
		if ((Class144_Sub1.anInt6806 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
			i_2_ = Class144_Sub1.anInt6806;
		}
		if (i_2_ <= i) {
			return true;
		}
		i_3_ += i * i_4_;
		i_5_ = i_2_ + -i >> 2;
		i_6_ += -1 + i;
		if ((Class320_Sub11.anInt8315 ^ 0xffffffff) == -2) {
			Class233.anInt2786 += i_5_;
			while ((--i_5_ ^ 0xffffffff) <= -1) {
				if (i_3_ < is[++i_6_]) {
					is[i_6_] = i_3_;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i_6_]) {
					is[i_6_] = i_3_;
				}
				i_3_ += i_4_;
				if ((is[++i_6_] ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					is[i_6_] = i_3_;
				}
				i_3_ += i_4_;
				if (i_3_ < is[++i_6_]) {
					is[i_6_] = i_3_;
				}
				i_3_ += i_4_;
			}
			i_5_ = 0x3 & -i + i_2_;
			while (--i_5_ >= 0) {
				if (is[++i_6_] > i_3_) {
					is[i_6_] = i_3_;
				}
				i_3_ += i_4_;
			}
		} else {
			i_3_ -= 38400;
			while ((--i_5_ ^ 0xffffffff) <= -1) {
				if (i_3_ < is[++i_6_]) {
					return false;
				}
				i_3_ += i_4_;
				if ((is[++i_6_] ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					return false;
				}
				i_3_ += i_4_;
				if ((is[++i_6_] ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					return false;
				}
				i_3_ += i_4_;
				if ((is[++i_6_] ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					return false;
				}
				i_3_ += i_4_;
			}
			i_5_ = i_2_ - i & 0x3;
			while ((--i_5_ ^ 0xffffffff) <= -1) {
				if ((i_3_ ^ 0xffffffff) > (is[++i_6_] ^ 0xffffffff)) {
					return false;
				}
				i_3_ += i_4_;
			}
		}
		return true;
	}
}
