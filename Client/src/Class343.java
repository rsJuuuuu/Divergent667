/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class343
{
	protected Class119 aClass119_4238;
	protected float aFloat4239;
	protected Class270 aClass270_4240;
	static int anInt4241;
	static int anInt4242;
	static int anInt4243;
	protected float aFloat4244 = 1.0F;
	static int anInt4245;
	static int anInt4246;
	protected int anInt4247;
	protected int anInt4248;
	protected int anInt4249;
	protected float aFloat4250;
	protected float aFloat4251 = 1.0F;
	static int anInt4252;
	protected int anInt4253;
	protected float aFloat4254;
	static short[] aShortArray4255;
	protected float aFloat4256;
	protected int anInt4257;
	protected int anInt4258;
	static int anInt4259;
	
	static final Class241 method3962(String string, int i, int i_0_, SignLink signlink) {
		if (i > -102) {
			return null;
		}
		anInt4259++;
		return Class188_Sub2_Sub1.method1910((byte) 84, signlink, string, "openjs", i_0_);
	}
	
	public static void method3963(int i) {
		aShortArray4255 = null;
		if (i != -28381) {
			anInt4252 = 59;
		}
	}
	
	final void method3964(BufferedStream buffer, int i) {
		anInt4245++;
		if (i != -4807) {
			aFloat4251 = 0.64789647F;
		}
		int i_1_ = buffer.readUnsignedShort();
		int i_2_ = buffer.readShort();
		int i_3_ = buffer.readShort();
		int i_4_ = buffer.readShort();
		int i_5_ = buffer.readUnsignedShort();
		Class235.anInt5127 = i_5_;
		aClass119_4238 = Class181.method1830(false, i_3_, i_1_, i_2_, i_4_);
	}
	
	final void method3965(BufferedStream buffer, boolean bool) {
		aFloat4244 = (float) (8 * buffer.readUnsignedByte()) / 255.0F;
		if (bool != true) {
			method3962(null, -51, 80, null);
		}
		anInt4242++;
		aFloat4239 = (float) (8 * buffer.readUnsignedByte()) / 255.0F;
		aFloat4251 = (float) (8 * buffer.readUnsignedByte()) / 255.0F;
	}
	
	final void method3966(BufferedStream buffer, int i) {
		anInt4241++;
		int i_6_ = buffer.readUnsignedByte();
		if (i != 24176) {
			method3964(null, -46);
		}
		if ((Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773(false) ^ 0xffffffff) != -2 || Class229.aGraphicsToolkit2732.e() <= 0) {
			if ((0x1 & i_6_ ^ 0xffffffff) != -1) {
				buffer.readInt();
			}
			if ((i_6_ & 0x2 ^ 0xffffffff) != -1) {
				buffer.readUnsignedShort();
			}
			if ((i_6_ & 0x4) != 0) {
				buffer.readUnsignedShort();
			}
			if ((0x8 & i_6_ ^ 0xffffffff) != -1) {
				buffer.readUnsignedShort();
			}
			aFloat4250 = 1.2F;
			aFloat4254 = 1.1523438F;
			aFloat4256 = 0.69921875F;
			anInt4253 = Class42.anInt649;
		} else {
			if ((i_6_ & 0x1) == 0) {
				anInt4253 = Class42.anInt649;
			} else {
				anInt4253 = buffer.readInt();
			}
			if ((0x2 & i_6_ ^ 0xffffffff) == -1) {
				aFloat4254 = 1.1523438F;
			} else {
				aFloat4254 = (float) buffer.readUnsignedShort() / 256.0F;
			}
			if ((0x4 & i_6_ ^ 0xffffffff) != -1) {
				aFloat4256 = (float) buffer.readUnsignedShort() / 256.0F;
			} else {
				aFloat4256 = 0.69921875F;
			}
			if ((i_6_ & 0x8 ^ 0xffffffff) == -1) {
				aFloat4250 = 1.2F;
			} else {
				aFloat4250 = (float) buffer.readUnsignedShort() / 256.0F;
			}
		}
		if ((0x10 & i_6_ ^ 0xffffffff) != -1) {
			anInt4249 = buffer.readShort();
			anInt4247 = buffer.readShort();
			anInt4248 = buffer.readShort();
		} else {
			anInt4249 = -50;
			anInt4248 = -50;
			anInt4247 = -60;
		}
		if ((0x20 & i_6_ ^ 0xffffffff) != -1) {
			anInt4257 = buffer.readInt();
		} else {
			anInt4257 = Class320_Sub26.anInt8456;
		}
		if ((i_6_ & 0x40 ^ 0xffffffff) != -1) {
			anInt4258 = buffer.readUnsignedShort();
		} else {
			anInt4258 = 0;
		}
		if ((0x80 & i_6_ ^ 0xffffffff) != -1) {
			int i_7_ = buffer.readUnsignedShort();
			int i_8_ = buffer.readUnsignedShort();
			int i_9_ = buffer.readUnsignedShort();
			int i_10_ = buffer.readUnsignedShort();
			int i_11_ = buffer.readUnsignedShort();
			int i_12_ = buffer.readUnsignedShort();
			aClass270_4240 = Class320_Sub14.method3736(i_11_, -98, i_8_, i_9_, i_10_, i_12_, i_7_);
		} else {
			aClass270_4240 = GraphicsToolkit.aClass270_1548;
		}
	}
	
	static final boolean method3967(int i, int i_13_, int i_14_) {
		if (i_14_ < 10) {
			aShortArray4255 = null;
		}
		anInt4243++;
        return !(!((0x40000 & i ^ 0xffffffff) != -1 | Class320_Sub7.method3711((byte) 76, i, i_13_)) && !Class110.method1135(i, i_13_, false));
    }
	
	final boolean method3968(byte b, Class343 class343_15_) {
		anInt4246++;
		int i = 39 / ((b - -4) / 42);
        return !(anInt4253 != class343_15_.anInt4253 || class343_15_.aFloat4254 != aFloat4254 || aFloat4256 != class343_15_.aFloat4256 || aFloat4250 != class343_15_.aFloat4250 || class343_15_.aFloat4239 != aFloat4239 || aFloat4244 != class343_15_.aFloat4244 || aFloat4251 != class343_15_.aFloat4251 || (anInt4257 ^ 0xffffffff) != (class343_15_.anInt4257 ^ 0xffffffff) || (class343_15_.anInt4258 ^ 0xffffffff) != (anInt4258 ^ 0xffffffff) || class343_15_.aClass270_4240 != aClass270_4240 || class343_15_.aClass119_4238 != aClass119_4238);
    }
	
	public Class343() {
		aFloat4239 = 0.25F;
		anInt4247 = -60;
		aClass270_4240 = GraphicsToolkit.aClass270_1548;
		anInt4249 = -50;
		aFloat4250 = 1.2F;
		aClass119_4238 = Class263.aClass119_3340;
		anInt4253 = Class42.anInt649;
		aFloat4256 = 0.69921875F;
		aFloat4254 = 1.1523438F;
		anInt4248 = -50;
		anInt4257 = Class320_Sub26.anInt8456;
		anInt4258 = 0;
	}
	
	Class343(BufferedStream buffer) {
		aFloat4239 = 0.25F;
		method3966(buffer, 24176);
	}
}
