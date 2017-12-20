/* CacheNode_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub3 extends CacheNode
{
	static int anInt9439;
	static int anInt9440;
	static int anInt9441;
	static int[] anIntArray9442;
	protected String aString9443;
	protected char[] aCharArray9444;
	protected int[] anIntArray9445;
	static Class61 aClass61_9446 = new Class61(5);
	static int anInt9447;
	protected int[] anIntArray9448;
	static int anInt9449;
	static int anInt9450;
	static int anInt9451;
	protected char[] aCharArray9452;
	static int anInt9453;
	
	static final void method2292(int i) {
		Animable_Sub2.updateGameSceneSize(Class213.aNode_Sub27_2512.aClass320_Sub5_7297.method3697(false));
		anInt9439++;
		int i_0_ = (Node_Sub53.gameSceneBaseX >> 3) + (Class98.anInt5061 >> 12);
		int i_1_ = (Node_Sub10.anInt7079 >> 12) - -(Class320_Sub4.gameSceneBaseY >> 3);
		CacheNode_Sub20_Sub1.myPlayerPlane = Class295.myPlayer.plane = (byte) 0;
		Class295.myPlayer.method888(8, -90, i);
		int i_2_ = 18;
		Class15.XTEA_KEYS = new int[i_2_][4];
		Class194.aByteArrayArray2373 = new byte[i_2_][];
		Class320_Sub6.aByteArrayArray8263 = new byte[i_2_][];
		StandardPlane.anIntArray7980 = new int[i_2_];
		Class42.anIntArray645 = new int[i_2_];
		Class144.anIntArray1789 = new int[i_2_];
		Class262_Sub1.MAP_REGION_HASHES = new int[i_2_];
		Class320_Sub18.aByteArrayArray8378 = new byte[i_2_][];
		ProducingGraphicsBuffer.anIntArray9895 = new int[i_2_];
		Class204.anIntArray2460 = new int[i_2_];
		Class188_Sub1_Sub1.aByteArrayArray9334 = new byte[i_2_][];
		FileOnDisk.aByteArrayArray1331 = new byte[i_2_][];
		i_2_ = 0;
		for (int i_3_ = (-(Node_Sub54.GAME_SCENE_WDITH >> 4) + i_0_) / 8; ((i_0_ - -(Node_Sub54.GAME_SCENE_WDITH >> 4)) / 8 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff); i_3_++) {
			for (int i_4_ = (-(Class377_Sub1.GAME_SCENE_HEIGHT >> 4) + i_1_) / 8; i_4_ <= ((Class377_Sub1.GAME_SCENE_HEIGHT >> 4) + i_1_) / 8; i_4_++) {
				int i_5_ = i_4_ + (i_3_ << 8);
				Class262_Sub1.MAP_REGION_HASHES[i_2_] = i_5_;
				StandardPlane.anIntArray7980[i_2_] = Animable_Sub1_Sub1.aClass302_10618.method3519("m" + i_3_ + "_" + i_4_, (byte) 97);
				Class144.anIntArray1789[i_2_] = Animable_Sub1_Sub1.aClass302_10618.method3519("l" + i_3_ + "_" + i_4_, (byte) 17);
				Class204.anIntArray2460[i_2_] = Animable_Sub1_Sub1.aClass302_10618.method3519("n" + i_3_ + "_" + i_4_, (byte) 86);
				Class42.anIntArray645[i_2_] = Animable_Sub1_Sub1.aClass302_10618.method3519("um" + i_3_ + "_" + i_4_, (byte) 122);
				ProducingGraphicsBuffer.anIntArray9895[i_2_] = Animable_Sub1_Sub1.aClass302_10618.method3519("ul" + i_3_ + "_" + i_4_, (byte) 48);
				if (Class204.anIntArray2460[i_2_] == -1) {
					StandardPlane.anIntArray7980[i_2_] = -1;
					Class144.anIntArray1789[i_2_] = -1;
					Class42.anIntArray645[i_2_] = -1;
					ProducingGraphicsBuffer.anIntArray9895[i_2_] = -1;
				}
				i_2_++;
			}
		}
		for (int i_6_ = i_2_; (Class204.anIntArray2460.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
			Class204.anIntArray2460[i_6_] = -1;
			StandardPlane.anIntArray7980[i_6_] = -1;
			Class144.anIntArray1789[i_6_] = -1;
			Class42.anIntArray645[i_6_] = -1;
			ProducingGraphicsBuffer.anIntArray9895[i_6_] = -1;
		}
		int i_7_;
		if (Class151.anInt1843 != 3) {
			if (Class151.anInt1843 != 9) {
				if ((Class151.anInt1843 ^ 0xffffffff) == -8) {
					i_7_ = 8;
				} else {
					throw new RuntimeException(String.valueOf(Class151.anInt1843));
				}
			} else {
				i_7_ = 10;
			}
		} else {
			i_7_ = 4;
		}
		Class364.method4057(false, i_0_, i_7_, i_1_, (byte) -36);
	}
	
	final void method2293(BufferedStream buffer, boolean bool) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method2294(-32, buffer, i);
		}
		anInt9449++;
		if (bool != false) {
			method2298((byte) -44, '{');
		}
	}
	
	private final void method2294(int i, BufferedStream buffer, int i_8_) {
		anInt9450++;
		if ((i_8_ ^ 0xffffffff) == -2) {
			aString9443 = buffer.readString();
		} else if (i_8_ == 2) {
			int i_9_ = buffer.readUnsignedByte();
			anIntArray9445 = new int[i_9_];
			aCharArray9444 = new char[i_9_];
			for (int i_10_ = 0; (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				anIntArray9445[i_10_] = buffer.readUnsignedShort();
				byte b = buffer.readByte();
				aCharArray9444[i_10_] = b == 0 ? '\0' : Class20_Sub1.method294(b, (byte) 127);
			}
		} else if ((i_8_ ^ 0xffffffff) == -4) {
			int i_11_ = buffer.readUnsignedByte();
			aCharArray9452 = new char[i_11_];
			anIntArray9448 = new int[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				anIntArray9448[i_12_] = buffer.readUnsignedShort();
				byte b = buffer.readByte();
				aCharArray9452[i_12_] = (b ^ 0xffffffff) != -1 ? Class20_Sub1.method294(b, (byte) 121) : '\0';
			}
		}
		if (i > -12) {
			method2297('\uff88', -122);
		}
	}
	
	public static void method2295(byte b) {
		anIntArray9442 = null;
		aClass61_9446 = null;
		if (b != 73) {
			anInt9441 = 42;
		}
	}
	
	static final boolean method2296(int i, byte b, int i_13_) {
		anInt9447++;
		@SuppressWarnings("unused")
		int i_14_ = -28 / ((b - 43) / 32);
        return (0x84080 & i_13_ ^ 0xffffffff) != -1;
    }
	
	final int method2297(char c, int i) {
		anInt9451++;
		if (anIntArray9448 == null) {
			return -1;
		}
		for (int i_15_ = 0; anIntArray9448.length > i_15_; i_15_++) {
			if (aCharArray9452[i_15_] == c) {
				return anIntArray9448[i_15_];
			}
		}
		if (i != -831587124) {
			aCharArray9452 = null;
		}
		return -1;
	}
	
	final int method2298(byte b, char c) {
		anInt9453++;
		if (anIntArray9445 == null) {
			return -1;
		}
		for (int i = 0; i < anIntArray9445.length; i++) {
			if (aCharArray9444[i] == c) {
				return anIntArray9445[i];
			}
		}
		if (b != -110) {
			method2295((byte) 79);
		}
		return -1;
	}
	
	final void method2299(byte b) {
		anInt9440++;
		if (anIntArray9448 != null) {
			for (int i = 0; i < anIntArray9448.length; i++)
				anIntArray9448[i] = Node_Sub16.method2590(anIntArray9448[i], 32768);
		}
		if (anIntArray9445 != null) {
			for (int i = 0; anIntArray9445.length > i; i++)
				anIntArray9445[i] = Node_Sub16.method2590(anIntArray9445[i], 32768);
		}
		if (b > 0) {
			anIntArray9442 = null;
		}
	}
}
