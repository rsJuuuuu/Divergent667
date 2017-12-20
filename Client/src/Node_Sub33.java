/* Node_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Node_Sub33 extends Node
{
	private Class69 aClass69_7386;
	private Class200_Sub2 aClass200_Sub2_7387;
	private NativeHeapBuffer aNativeHeapBuffer7388;
	protected float aFloat7389;
	private GLPlane aGLPlane7390;
	private Stream aStream7391;
	protected int anInt7392;
	static int anInt7393;
	static int anInt7394;
	static int anInt7395;
	static int anInt7396;
	static int anInt7397;
	private int[] anIntArray7398;
	static int anInt7399;
	protected int anInt7400;
	protected int anInt7401;
	static int anInt7402;
	protected int anInt7403;
	static int anInt7404;
	static int anInt7405;
	static boolean[][] aBooleanArrayArray7406 = { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
	private GLToolkit aGLToolkit7407;
	
	final void method2732(int i, int[] is, int i_0_) {
		anInt7394++;
		int i_1_ = 0;
		FloatBuffer floatbuffer = aGLToolkit7407.aFloatBuffer6661;
		floatbuffer.offset = 0;
		if (aGLToolkit7407.aBoolean6736) {
			for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
				int i_3_ = is[i_2_];
				short[] ses = aGLPlane7390.aShortArrayArray7925[i_3_];
				int i_4_ = anIntArray7398[i_3_];
				if ((i_4_ ^ 0xffffffff) != -1 && ses != null) {
					int i_5_ = 0;
					int i_6_ = 0;
					while (ses.length > i_6_) {
						if ((i_4_ & 1 << i_5_++ ^ 0xffffffff) != -1) {
							floatbuffer.writeShort(ses[i_6_++] & 0xffff);
							i_1_++;
							i_1_++;
							floatbuffer.writeShort(0xffff & ses[i_6_++]);
							floatbuffer.writeShort(ses[i_6_++] & 0xffff);
							i_1_++;
						} else {
							i_6_ += 3;
						}
					}
				}
			}
		} else {
			for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
				int i_8_ = is[i_7_];
				int i_9_ = anIntArray7398[i_8_];
				short[] ses = aGLPlane7390.aShortArrayArray7925[i_8_];
				if (i_9_ != 0 && ses != null) {
					int i_10_ = 0;
					int i_11_ = 0;
					while (ses.length > i_11_) {
						if ((i_9_ & 1 << i_10_++ ^ 0xffffffff) == -1) {
							i_11_ += 3;
						} else {
							i_1_++;
							floatbuffer.method2191(-123, ses[i_11_++] & 0xffff);
							i_1_++;
							floatbuffer.method2191(-57, ses[i_11_++] & 0xffff);
							floatbuffer.method2191(-79, ses[i_11_++] & 0xffff);
							i_1_++;
						}
					}
				}
			}
		}
		if (i < i_1_) {
			aClass200_Sub2_7387.method4(5123, floatbuffer.offset, floatbuffer.buffer, i + 2712);
			aGLToolkit7407.method1482((byte) -108, aClass69_7386, aGLPlane7390.aClass69_7953, aGLPlane7390.aClass69_7945, aGLPlane7390.aClass69_7954);
			aGLToolkit7407.method1458(anInt7400, (aGLPlane7390.anInt7911 & 0x7 ^ 0xffffffff) != -1, (aGLPlane7390.anInt7911 & 0x8 ^ 0xffffffff) != -1, false);
			if (aGLToolkit7407.aBoolean6676) {
				aGLToolkit7407.EA(2147483647, anInt7401, anInt7403, anInt7392);
			}
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / aFloat7389, 1.0F / aFloat7389, 1.0F);
			OpenGL.glMatrixMode(5888);
			aGLToolkit7407.method1482((byte) -29, aClass69_7386, aGLPlane7390.aClass69_7953, aGLPlane7390.aClass69_7945, aGLPlane7390.aClass69_7954);
			aGLToolkit7407.method1477((byte) 105, 0, 4, aClass200_Sub2_7387, i_1_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}
	
	static final void method2733(int i, int i_12_) {
		anInt7396++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, i, (long) i_12_);
		cachenode_sub2.method2291((byte) 121);
	}
	
	final void method2734(int i, int i_13_, float f, int i_14_, int i_15_) {
		anInt7393++;
		if (anInt7400 != -1) {
			Class91 class91 = aGLToolkit7407.aD1543.method10(anInt7400, i_15_ ^ 0x4fee);
			int i_16_ = class91.aByte1225 & 0xff;
			if (i_16_ != 0 && (class91.aByte1214 ^ 0xffffffff) != -5) {
				int i_17_;
				if (i_13_ >= 0) {
					if ((i_13_ ^ 0xffffffff) >= -128) {
						i_17_ = 131586 * i_13_;
					} else {
						i_17_ = 16777215;
					}
				} else {
					i_17_ = 0;
				}
				if ((i_16_ ^ 0xffffffff) != -257) {
					int i_18_ = i_16_;
					int i_19_ = 256 - i_16_;
					i = (i_18_ * (i_17_ & 0xff00ff) + i_19_ * (0xff00ff & i) & ~0xff00ff) - -(0xff0000 & (i & 0xff00) * i_19_ + (i_17_ & 0xff00) * i_18_) >> 8;
				} else {
					i = i_17_;
				}
			}
			int i_20_ = class91.aByte1217 & 0xff;
			if ((i_20_ ^ 0xffffffff) != -1) {
				i_20_ += 256;
				int i_21_ = (i >> 16 & 0xff) * i_20_;
				if (i_21_ > 65535) {
					i_21_ = 65535;
				}
				int i_22_ = i_20_ * (0xff & i >> 8);
				if ((i_22_ ^ 0xffffffff) < -65536) {
					i_22_ = 65535;
				}
				int i_23_ = i_20_ * (0xff & i);
				if (i_23_ > 65535) {
					i_23_ = 65535;
				}
				i = (0xff00 & i_22_) + (((i_21_ & 0x5e00ff00) << 8) - -(i_23_ >> 8));
			}
		}
		if (f != 1.0F) {
			int i_24_ = (i & 0xff0f99) >> 16;
			int i_25_ = (0xff3c & i) >> 8;
			i_24_ *= f;
			int i_26_ = i & 0xff;
			if (i_24_ < 0) {
				i_24_ = 0;
			} else if (i_24_ > 255) {
				i_24_ = 255;
			}
			i_25_ *= f;
			if ((i_25_ ^ 0xffffffff) <= -1) {
				if (i_25_ > 255) {
					i_25_ = 255;
				}
			} else {
				i_25_ = 0;
			}
			i_26_ *= f;
			if (i_26_ < 0) {
				i_26_ = 0;
			} else if (i_26_ > 255) {
				i_26_ = 255;
			}
			i = i_26_ | (i_25_ << 8 | i_24_ << 16);
		}
		aStream7391.f(4 * i_14_);
		aStream7391.d((byte) (i >> 16));
		if (i_15_ == -28663) {
			aStream7391.d((byte) (i >> 8));
			aStream7391.d((byte) i);
		}
	}
	
	final void method2735(byte b, int i) {
		try {
			if (b == -92) {
				anInt7395++;
				aStream7391.c();
				Interface9 interface9 = aGLToolkit7407.method1459(-1, 4, aNativeHeapBuffer7388, false, 4 * i);
				aClass69_7386 = new Class69(interface9, 5121, 4, 0);
				aStream7391 = null;
				aNativeHeapBuffer7388 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class126.method1537(runtimeexception, "nm.F(" + b + ',' + i + ')');
		}
	}
	
	public static void method2736(int i) {
		aBooleanArrayArray7406 = null;
		if (i != 65280) {
			method2736(49);
		}
	}
	
	final void method2737(byte b, int i) {
		aStream7391.f(3 + 4 * i);
		if (b <= 62) {
			anInt7402 = 27;
		}
		anInt7404++;
		aStream7391.d(-1);
	}
	
	final void method2738(int i, int i_27_, boolean bool, int i_28_) {
		anInt7397++;
		if (bool != true) {
			method2734(-29, 2, -0.39897218F, 119, -87);
		}
		anIntArray7398[aGLPlane7390.anInt3408 * i_28_ + i] = Node_Sub16.method2590(anIntArray7398[aGLPlane7390.anInt3408 * i_28_ + i], 1 << i_27_);
	}
	
	final void method2739(int i, int i_29_) {
		if (i < 44) {
			method2737((byte) -5, 91);
		}
		anInt7399++;
		aNativeHeapBuffer7388 = aGLToolkit7407.aNativeHeap6609.a(i_29_ * 4, true);
		aStream7391 = new Stream(aNativeHeapBuffer7388);
	}
	
	Node_Sub33(GLPlane glplane, int i, int i_30_, int i_31_, int i_32_, int i_33_) {
		aGLPlane7390 = glplane;
		aGLToolkit7407 = aGLPlane7390.aGLToolkit7926;
		anInt7403 = i_32_;
		anIntArray7398 = new int[aGLPlane7390.anInt3408 * aGLPlane7390.anInt3404];
		anInt7401 = i_31_;
		anInt7392 = i_33_;
		anInt7400 = i;
		aFloat7389 = (float) i_30_;
		aClass200_Sub2_7387 = new Class200_Sub2(aGLToolkit7407, 5123, null, 1);
	}
}
