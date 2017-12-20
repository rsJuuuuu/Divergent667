/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class134 implements Interface13
{
	protected int anInt5296;
	protected Class372 aClass372_5297;
	static int anInt5298;
	protected GLXToolkit aGLXToolkit5299;
	static int anInt5300;
	static OutcommingPacket aClass318_5301;
	static int anInt5302;
	static int anInt5303;
	static int anInt5304;
	static int anInt5305;
	private int anInt5306;
	static int anInt5307;
	private int anInt5308;
	static int anInt5309;
	static int anInt5310;
	static int anInt5311;
	private boolean aBoolean5312;
	static int anInt5313;
	static int anInt5314;
	static int anInt5315;
	static int anInt5316;
	protected Class68 aClass68_5317;
	private Class228 aClass228_5318 = Node_Sub38_Sub5.aClass228_10123;
	static int[] SKILL_MAX_LEVEL = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	
	static final boolean method1567(char c, int i) {
		anInt5316++;
		if (i != 4493) {
			method1568(null, null, 22, -50);
		}
        return !(((c ^ 0xffffffff) > -66 || c > 90) && (c < 97 || c > 122));
    }
	
	static final Class210 method1568(String string, GLToolkit gltoolkit, int i, int i_0_) {
		anInt5298++;
		long l = OpenGL.glCreateShaderObjectARB(i_0_);
		OpenGL.glShaderSourceARB(l, string);
		OpenGL.glCompileShaderARB(l);
		OpenGL.glGetObjectParameterivARB(l, 35713, Class142.anIntArray1759, 0);
		if (Class142.anIntArray1759[0] == 0) {
			if (Class142.anIntArray1759[0] == 0) {
				//System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(l, 35716, Class142.anIntArray1759, 1);
			if ((Class142.anIntArray1759[1] ^ 0xffffffff) < -2) {
				byte[] bs = new byte[Class142.anIntArray1759[1]];
				OpenGL.glGetInfoLogARB(l, Class142.anIntArray1759[1], Class142.anIntArray1759, 0, bs, 0);
				//System.out.println(new String(bs));
			}
			if ((Class142.anIntArray1759[0] ^ 0xffffffff) == -1) {
				OpenGL.glDeleteObjectARB(l);
				return null;
			}
		}
		if (i != -399874888) {
			return null;
		}
		return new Class210(gltoolkit, l, i_0_);
	}
	
	static final void method1569() {
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < GraphicsToolkit.aClass33Array1549.length; i++) {
				if (!GraphicsToolkit.aClass33Array1549[i].method361()) {
					synchronized (GraphicsToolkit.aClass33Array1549[i]) {
						GraphicsToolkit.aClass33Array1549[i].notify();
					}
					bool = false;
				} else {
					Class270_Sub1.aLongArray8029[i] = GraphicsToolkit.aClass33Array1549[i].method363();
				}
			}
			if (bool) {
				break;
			}
			try {
				Class262_Sub22.method3208(1L, false);
			} catch (Exception exception) {
				/* empty */
			}
		}
		GraphicsToolkit.aClass33Array1549[GraphicsToolkit.aClass33Array1549.length - 1].method365();
		Node_Sub38_Sub16.method2840(1);
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < GraphicsToolkit.aClass33Array1549.length - 1; i++) {
				if (!GraphicsToolkit.aClass33Array1549[i].method361()) {
					synchronized (GraphicsToolkit.aClass33Array1549[i]) {
						GraphicsToolkit.aClass33Array1549[i].notify();
					}
					bool = false;
				}
			}
			if (bool) {
				break;
			}
			try {
				Class262_Sub22.method3208(1L, false);
			} catch (Exception exception) {
				/* empty */
			}
		}
		for (int i = 1; i < GraphicsToolkit.aClass33Array1549.length - 2; i++)
			GraphicsToolkit.aClass33Array1549[i].method365();
		Node_Sub38_Sub16.method2840(2);
		while (!GraphicsToolkit.aClass33Array1549[0].method361()) {
			synchronized (GraphicsToolkit.aClass33Array1549[0]) {
				GraphicsToolkit.aClass33Array1549[0].notify();
			}
			try {
				Class262_Sub22.method3208(1L, false);
			} catch (Exception exception) {
				/* empty */
			}
		}
		GraphicsToolkit.aClass33Array1549[0].method365();
	}
	
	public final void method42(boolean bool) {
		anInt5304++;
		int i = aGLXToolkit5299.method1250(0);
		if (bool != false) {
			method1571(33);
		}
		int i_1_ = aGLXToolkit5299.anIntArray9324[i];
		if (anInt5296 != i_1_) {
			if (i_1_ != 0) {
				OpenGL.glBindTexture(i_1_, 0);
				OpenGL.glDisable(i_1_);
			}
			OpenGL.glEnable(anInt5296);
			aGLXToolkit5299.anIntArray9324[i] = anInt5296;
		}
		OpenGL.glBindTexture(anInt5296, anInt5306);
	}
	
	final int method1570(int i) {
		anInt5314++;
		if (i != 10242) {
			return -71;
		}
		if (Class372.aClass372_4594 == aClass372_5297) {
			if (aClass68_5317 != CacheNode_Sub19.aClass68_9621) {
				if (aClass68_5317 == Class99.aClass68_1290) {
					return 6408;
				}
				if (aClass68_5317 == Node_Sub52.aClass68_7639) {
					return 6406;
				}
				if (Class188_Sub2.aClass68_6875 != aClass68_5317) {
					if (Class259.aClass68_3268 == aClass68_5317) {
						return 6410;
					}
					if (Class262_Sub15_Sub1.aClass68_10521 == aClass68_5317) {
						return 6145;
					}
				} else {
					return 6409;
				}
			} else {
				return 6407;
			}
		} else if (Class372.aClass372_4597 == aClass372_5297) {
			if (CacheNode_Sub19.aClass68_9621 != aClass68_5317) {
				if (aClass68_5317 == Class99.aClass68_1290) {
					return 34842;
				}
				if (Node_Sub52.aClass68_7639 == aClass68_5317) {
					return 34844;
				}
				if (Class188_Sub2.aClass68_6875 == aClass68_5317) {
					return 34846;
				}
				if (aClass68_5317 != Class259.aClass68_3268) {
					if (Class262_Sub15_Sub1.aClass68_10521 == aClass68_5317) {
						return 6145;
					}
				} else {
					return 34847;
				}
			} else {
				return 34843;
			}
		} else if (Class372.aClass372_4598 == aClass372_5297) {
			if (aClass68_5317 != CacheNode_Sub19.aClass68_9621) {
				if (aClass68_5317 == Class99.aClass68_1290) {
					return 34836;
				}
				if (aClass68_5317 != Node_Sub52.aClass68_7639) {
					if (aClass68_5317 == Class188_Sub2.aClass68_6875) {
						return 34840;
					}
					if (aClass68_5317 == Class259.aClass68_3268) {
						return 34841;
					}
					if (Class262_Sub15_Sub1.aClass68_10521 == aClass68_5317) {
						return 6145;
					}
				} else {
					return 34838;
				}
			} else {
				return 34837;
			}
		}
		throw new IllegalStateException();
	}
	
	public static void method1571(int i) {
		if (i <= 63) {
			SKILL_MAX_LEVEL = null;
		}
		SKILL_MAX_LEVEL = null;
		aClass318_5301 = null;
	}
	
	protected final void finalize() throws Throwable {
		anInt5313++;
		method1579(82);
		super.finalize();
	}
	
	private final int method1572(int i) {
		anInt5311++;
		if (i >= -63) {
			return -39;
		}
		int i_2_ = anInt5308 * (aClass372_5297.anInt4591 * aClass68_5317.anInt934);
		if (aBoolean5312) {
			return 4 * i_2_ / 3;
		}
		return i_2_;
	}
	
	private final void method1573(int i) {
		if (i != 120) {
			method1575(-112, null, 38, 20, -35);
		}
		aGLXToolkit5299.method1312((byte) -21, this);
		anInt5305++;
		if (Node_Sub38_Sub5.aClass228_10123 == aClass228_5318) {
			OpenGL.glTexParameteri(anInt5296, 10241, !aBoolean5312 ? 9729 : 9987);
			OpenGL.glTexParameteri(anInt5296, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5296, 10241, !aBoolean5312 ? 9728 : 9984);
			OpenGL.glTexParameteri(anInt5296, 10240, 9728);
		}
	}
	
	static final boolean method1574(boolean bool, int i) {
		anInt5300++;
		if ((i ^ 0xffffffff) == -26 || (i ^ 0xffffffff) == -6 || (i ^ 0xffffffff) == -51 || i == 6 || i == 45 || (i ^ 0xffffffff) == -1008) {
			return true;
		}
		if (i == 17) {
			return true;
		}
		if (bool != false) {
			method1567('j', -30);
		}
		return false;
	}
	
	public final void method41(byte b, Class228 class228) {
		if (b > -104) {
			anInt5296 = 110;
		}
		anInt5309++;
		if (aClass228_5318 != class228) {
			aClass228_5318 = class228;
			method1573(120);
		}
	}
	
	final void method1575(int i, int[] is, int i_3_, int i_4_, int i_5_) {
		anInt5310++;
		if (i_5_ > 0 && !Class371.method4094(i_5_, false)) {
			throw new IllegalArgumentException("");
		}
		if (i_4_ > 0 && !Class371.method4094(i_4_, false)) {
			throw new IllegalArgumentException("");
		}
		if (aClass68_5317 != Class99.aClass68_1290) {
			throw new IllegalArgumentException("");
		}
		int i_6_ = 0;
		int i_7_ = i_5_ < i_4_ ? i_5_ : i_4_;
		int i_8_ = i_5_ >> 1;
		int i_9_ = i_4_ >> 1;
		if (i_3_ > -113) {
			aClass228_5318 = null;
		}
		int[] is_10_ = is;
		int[] is_11_ = new int[i_9_ * i_8_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_6_, method1570(10242), i_5_, i_4_, 0, 32993, aGLXToolkit5299.anInt9321, is_10_, 0);
			if (i_7_ <= 1) {
				break;
			}
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = i_13_ + i_5_;
			int[] is_15_ = is_11_;
			for (int i_16_ = 0; (i_9_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				for (int i_17_ = 0; (i_8_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					int i_18_ = is_10_[i_13_++];
					int i_19_ = is_10_[i_13_++];
					int i_20_ = is_10_[i_14_++];
					int i_21_ = 0xff & i_18_ >> 8;
					int i_22_ = i_18_ >> 24 & 0xff;
					int i_23_ = i_18_ >> 16 & 0xff;
					int i_24_ = is_10_[i_14_++];
					int i_25_ = 0xff & i_18_;
					i_22_ += 0xff & i_19_ >> 24;
					i_23_ += i_19_ >> 16 & 0xff;
					i_25_ += 0xff & i_19_;
					i_21_ += (0xff63 & i_19_) >> 8;
					i_21_ += (i_20_ & 0xffb3) >> 8;
					i_22_ += i_20_ >> 24 & 0xff;
					i_23_ += (0xff2e8b & i_20_) >> 16;
					i_25_ += 0xff & i_20_;
					i_23_ += 0xff & i_24_ >> 16;
					i_22_ += 0xff & i_24_ >> 24;
					i_25_ += 0xff & i_24_;
					i_21_ += (0xffab & i_24_) >> 8;
					is_11_[i_12_++] = Node_Sub16.method2590(Node_Sub16.method2590(Node_Sub16.method2590(Node_Sub30.method2723(i_23_ << 14, 16711680), Node_Sub30.method2723(i_22_ << 22, -16777216)), Node_Sub30.method2723(65280, i_21_ << 6)), Node_Sub30.method2723(i_25_ >> 2, 255));
				}
				i_13_ += i_5_;
				i_14_ += i_5_;
			}
			is_11_ = is_10_;
			i_4_ = i_9_;
			is_10_ = is_15_;
			i_5_ = i_8_;
			i_8_ >>= 1;
			i_7_ >>= 1;
			i_9_ >>= 1;
			i_6_++;
		}
	}
	
	private final void method1576(int i, int i_26_) {
		anInt5302++;
		aGLXToolkit5299.anInt6266 -= i_26_;
		if (i > -69) {
			anInt5308 = -40;
		}
		aGLXToolkit5299.anInt6266 += method1572(-86);
	}
	
	final void method1577(int i, int i_27_, int i_28_, byte[] bs, int i_29_) {
		anInt5303++;
		if (i_29_ > 0 && !Class371.method4094(i_29_, false)) {
			throw new IllegalArgumentException("");
		}
		if ((i ^ 0xffffffff) < -1 && !Class371.method4094(i, false)) {
			throw new IllegalArgumentException("");
		}
		int i_30_ = aClass68_5317.anInt934;
		if (i_28_ != 1) {
			SKILL_MAX_LEVEL = null;
		}
		int i_31_ = 0;
		int i_32_ = (i_29_ ^ 0xffffffff) <= (i ^ 0xffffffff) ? i : i_29_;
		int i_33_ = i_29_ >> 1;
		int i_34_ = i >> 1;
		byte[] bs_35_ = bs;
		byte[] bs_36_ = new byte[i_34_ * (i_33_ * i_30_)];
		for (;;) {
			OpenGL.glTexImage2Dub(i_27_, i_31_, method1570(i_28_ ^ 0x2803), i_29_, i, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5121, bs_35_, 0);
			if (i_32_ <= 1) {
				break;
			}
			int i_37_ = i_29_ * i_30_;
			byte[] bs_38_ = bs_36_;
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_39_++) {
				int i_40_ = i_39_;
				int i_41_ = i_39_;
				int i_42_ = i_37_ + i_41_;
				for (int i_43_ = 0; i_43_ < i_34_; i_43_++) {
					for (int i_44_ = 0; (i_33_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
						int i_45_ = bs_35_[i_41_];
						i_41_ += i_30_;
						i_45_ += bs_35_[i_41_];
						i_45_ += bs_35_[i_42_];
						i_41_ += i_30_;
						i_42_ += i_30_;
						i_45_ += bs_35_[i_42_];
						bs_36_[i_40_] = (byte) (i_45_ >> 2);
						i_42_ += i_30_;
						i_40_ += i_30_;
					}
					i_41_ += i_37_;
					i_42_ += i_37_;
				}
			}
			bs_36_ = bs_35_;
			i_29_ = i_33_;
			i = i_34_;
			bs_35_ = bs_38_;
			i_34_ >>= 1;
			i_32_ >>= 1;
			i_31_++;
			i_33_ >>= 1;
		}
	}
	
	final void method1578(float[] fs, int i, int i_46_, boolean bool, int i_47_) {
		anInt5307++;
		if (i > 0 && !Class371.method4094(i, false)) {
			throw new IllegalArgumentException("");
		}
		if ((i_46_ ^ 0xffffffff) < -1 && !Class371.method4094(i_46_, false)) {
			throw new IllegalArgumentException("");
		}
		int i_48_ = aClass68_5317.anInt934;
		int i_49_ = 0;
		int i_50_ = i_46_ <= i ? i_46_ : i;
		int i_51_ = i >> 1;
		int i_52_ = i_46_ >> 1;
		float[] fs_53_ = fs;
		if (bool == true) {
			float[] fs_54_ = new float[i_52_ * i_51_ * i_48_];
			for (;;) {
				OpenGL.glTexImage2Df(i_47_, i_49_, method1570(10242), i, i_46_, 0, Node_Sub36.method2753((byte) -18, aClass68_5317), 5126, fs_53_, 0);
				if (i_50_ <= 1) {
					break;
				}
				int i_55_ = i * i_48_;
				for (int i_56_ = 0; i_48_ > i_56_; i_56_++) {
					int i_57_ = i_56_;
					int i_58_ = i_56_;
					int i_59_ = i_55_ + i_58_;
					for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff); i_60_++) {
						for (int i_61_ = 0; (i_51_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
							float f = fs_53_[i_58_];
							i_58_ += i_48_;
							f += fs_53_[i_58_];
							f += fs_53_[i_59_];
							i_58_ += i_48_;
							i_59_ += i_48_;
							f += fs_53_[i_59_];
							i_59_ += i_48_;
							fs_54_[i_57_] = f * 0.25F;
							i_57_ += i_48_;
						}
						i_59_ += i_55_;
						i_58_ += i_55_;
					}
				}
				float[] fs_62_ = fs_54_;
				fs_54_ = fs_53_;
				i = i_51_;
				fs_53_ = fs_62_;
				i_46_ = i_52_;
				i_50_ >>= 1;
				i_51_ >>= 1;
				i_52_ >>= 1;
				i_49_++;
			}
		}
	}
	
	private final void method1579(int i) {
		anInt5315++;
		if (anInt5306 > 0) {
			aGLXToolkit5299.method1398(method1572(-103), anInt5306, true);
			anInt5306 = 0;
		}
		@SuppressWarnings("unused")
		int i_63_ = 35 % ((-30 - i) / 32);
	}
	
	Class134(GLXToolkit glxtoolkit, int i, Class68 class68, Class372 class372, int i_64_, boolean bool) {
		aClass68_5317 = class68;
		anInt5296 = i;
		aClass372_5297 = class372;
		aGLXToolkit5299 = glxtoolkit;
		anInt5308 = i_64_;
		aBoolean5312 = bool;
		OpenGL.glGenTextures(1, Class203.anIntArray2450, 0);
		anInt5306 = Class203.anIntArray2450[0];
		method1573(120);
		method1576(-94, 0);
	}
	
	static {
		aClass318_5301 = new OutcommingPacket(80, -1);
	}
}
