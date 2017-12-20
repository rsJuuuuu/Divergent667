/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class Class51 implements Interface15
{
	private int anInt5324 = -1;
	static int anInt5325;
	private int anInt5326;
	static int anInt5327;
	static int anInt5328;
	private int anInt5329;
	static int anInt5330;
	static boolean aBoolean5331;
	protected GLXToolkit aGLXToolkit5332;
	static int anInt5333;
	static int anInt5334;
	static IncommingPacket INCOMMING_PACKET_69 = new IncommingPacket(69, -2);
	static int anInt5336;
	private boolean aBoolean5337;
	static int anInt5338;
	static Index aClass302_5339;
	private int anInt5340 = 0;
	private int anInt5341;
	static int anInt5342;
	static float aFloat5343;
	private NativeHeapBuffer aNativeHeapBuffer5344;
	static ClanChat aClanChat5345;
	static int anInt5346;
	
	public static void method514(int i) {
		if (i != 2) {
			aClass302_5339 = null;
		}
		INCOMMING_PACKET_69 = null;
		aClass302_5339 = null;
		aClanChat5345 = null;
	}
	
	void method38(boolean bool) {
		anInt5342++;
		if (bool == false) {
			if ((anInt5324 ^ 0xffffffff) < -1) {
				aGLXToolkit5332.method1402((byte) -98, anInt5324, anInt5329);
				anInt5324 = -1;
			}
		}
	}
	
	protected final void finalize() throws Throwable {
		method38(false);
		anInt5325++;
		super.finalize();
	}
	
	final long method515(byte b) {
		anInt5328++;
		if (b != 50) {
			return -22L;
		}
		if ((anInt5324 ^ 0xffffffff) == -1) {
			return aNativeHeapBuffer5344.getAddress();
		}
		return 0L;
	}
	
	final boolean method516(int i, Source source, boolean bool) {
		anInt5338++;
		if ((i ^ 0xffffffff) < (anInt5341 ^ 0xffffffff)) {
			method520(76);
			if ((anInt5324 ^ 0xffffffff) < -1) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				OpenGL.glBufferDataARBa(anInt5326, i, source.getAddress(), aBoolean5337 ? 35040 : 35044);
				aGLXToolkit5332.anInt6260 += i + -anInt5329;
			} else {
				throw new RuntimeException("ARGH!");
			}
			anInt5341 = i;
		} else {
			if (anInt5324 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
			OpenGL.glBufferSubDataARBa(anInt5326, 0, anInt5329, source.getAddress());
			aGLXToolkit5332.anInt6260 += -anInt5329 + i;
		}
		anInt5329 = i;
		if (bool != true) {
			return true;
		}
		return true;
	}
	
	final boolean method517(int i, MapBuffer mapbuffer) {
		if (i != 0) {
			method57((byte) 55);
		}
		anInt5334++;
		boolean bool = true;
		if ((anInt5340 ^ 0xffffffff) != -1) {
			if ((anInt5324 ^ 0xffffffff) < -1) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				if (anInt5340 == 1) {
					OpenGL.glBufferSubDataARBa(anInt5326, 0, anInt5341, aGLXToolkit5332.aNativeHeapBuffer6171.getAddress());
				} else {
					bool = mapbuffer.b();
				}
			}
			anInt5340 = 0;
		}
		return bool;
	}
	
	final void method518(int i) {
		if (i < 18) {
			anInt5341 = 98;
		}
		anInt5346++;
		if (aGLXToolkit5332.aBoolean9316) {
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
		}
	}
	
	void method56(int i, int i_0_) {
		if (i != -1696) {
			aGLXToolkit5332 = null;
		}
		anInt5327++;
		if ((i_0_ ^ 0xffffffff) < (anInt5341 ^ 0xffffffff)) {
			method520(55);
			if (anInt5324 > 0) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				OpenGL.glBufferDataARBub(anInt5326, i_0_, null, 0, aBoolean5337 ? 35040 : 35044);
				aGLXToolkit5332.anInt6260 += i_0_ + -anInt5341;
			} else {
				aNativeHeapBuffer5344 = aGLXToolkit5332.method1330(false, -96, i_0_);
			}
			anInt5341 = i_0_;
		}
		anInt5329 = i_0_;
	}
	
	final jaclib.memory.Buffer method519(boolean bool, MapBuffer mapbuffer, int i) {
		anInt5333++;
		if (i != -5934) {
			method518(74);
		}
		if (anInt5340 == 0) {
			method520(i ^ ~0x1755);
			if (anInt5324 <= 0) {
				anInt5340 = 2;
				return aNativeHeapBuffer5344;
			}
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
			if (bool) {
				OpenGL.glBufferDataARBub(anInt5326, anInt5341, null, 0, !aBoolean5337 ? 35044 : 35040);
				if (aGLXToolkit5332.aNativeHeapBuffer6171.b >= anInt5329) {
					anInt5340 = 1;
					return aGLXToolkit5332.aNativeHeapBuffer6171;
				}
			}
			if (!mapbuffer.a() && mapbuffer.a(anInt5326, anInt5329, 35001)) {
				anInt5340 = 2;
				return mapbuffer;
			}
		}
		return null;
	}
	
	public int method57(byte b) {
		if (b >= -56) {
			return -121;
		}
		anInt5330++;
		return anInt5329;
	}
	
	Class51(GLXToolkit glxtoolkit, int i, boolean bool) {
		aBoolean5337 = bool;
		anInt5326 = i;
		aGLXToolkit5332 = glxtoolkit;
	}
	
	private final void method520(int i) {
		anInt5336++;
		if ((anInt5324 ^ 0xffffffff) > -1) {
			if (aGLXToolkit5332.aBoolean9316) {
				OpenGL.glGenBuffersARB(1, Class307.anIntArray3896, 0);
				anInt5324 = Class307.anIntArray3896[0];
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
			} else {
				anInt5324 = 0;
			}
			if (i <= 1) {
				anInt5324 = 39;
			}
		}
	}
}
