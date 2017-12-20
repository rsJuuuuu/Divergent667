/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class268 {
	protected boolean aBoolean3451;
	static int anInt3452;
	protected int anInt3453;
	protected int anInt3454;
	static short aShort3455 = 320;
	protected int anInt3456;
	protected short aShort3457;
	protected short aShort3458;
	protected int anInt3459;
	protected short aShort3460;
	protected int anInt3461;
	protected byte aByte3462;
	static int anInt3463;
	static int anInt3464;

	static final Class49 method3290(boolean bool, byte b,
			GraphicsToolkit graphicstoolkit, boolean bool_0_, int i) {
		anInt3452++;
		if ((i ^ 0xffffffff) == 0) {
			return null;
		}
		if (Class291.anIntArray3665 != null) {
			for (int i_1_ = 0; (Class291.anIntArray3665.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				if (Class291.anIntArray3665[i_1_] == i) {
					return Node_Sub5_Sub2.aClass49Array9413[i_1_];
				}
			}
		}
		Class49 class49 = (Class49) Class335.aClass61_4161.method607(
				(long) ((bool ? 1 : 0) | i << 1), b + -75);
		if (class49 != null) {
			if (bool_0_ && class49.aClass357_722 == null) {
				Class357 class357 = Class129.method1553(-1, i,
						Class188_Sub1.aClass302_6849);
				if (class357 == null) {
					return null;
				}
				class49.aClass357_722 = class357;
			}
			return class49;
		}
		Class383[] class383s = Class383.method4199(Class294.aClass302_3690, i);
		if (class383s == null) {
			return null;
		}
		Class357 class357 = Class129.method1553(-1, i,
				Class188_Sub1.aClass302_6849);
		if (class357 == null) {
			return null;
		}
		if (b != 75) {
			return null;
		}
		if (bool_0_) {
			class49 = new Class49(graphicstoolkit.a(class357, class383s, bool),
					class357);
		} else {
			class49 = new Class49(graphicstoolkit.a(class357, class383s, bool));
		}
		Class335.aClass61_4161.method601(class49, 25566,
				(long) (i << 1 | (!bool ? 0 : 1)));
		return class49;
	}

	static final Class150_Sub2 method3291(byte b, BufferedStream buffer) {
		anInt3464++;
		Class150 class150 = Class338.method3906(buffer, -73);
		if (b != 53) {
			method3290(false, (byte) -6, null, true, 125);
		}
		int i = buffer.readInt();
		int i_2_ = buffer.readInt();
		return new Class150_Sub2(class150.aClass379_5079,
				class150.aClass77_5087, class150.anInt5092, class150.anInt5080,
				class150.anInt5086, class150.anInt5081, class150.anInt5084,
				class150.anInt5083, class150.anInt5090, i, i_2_);
	}

	static final void method3292(byte b, byte[] bs) {
		anInt3463++;
		BufferedStream buffer = new BufferedStream(bs);
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) != -5) {
					if ((i ^ 0xffffffff) == -6) {
						int i_3_ = buffer.readUnsignedByte();
						Class83.anIntArray5188 = new int[i_3_];
						for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
							Class83.anIntArray5188[i_4_] = buffer
									.readUnsignedShort();
							if ((Class83.anIntArray5188[i_4_] ^ 0xffffffff) == -65536) {
								Class83.anIntArray5188[i_4_] = -1;
							}
						}
					}
				} else {
					int i_5_ = buffer.readUnsignedByte();
					InputStream_Sub1.anIntArray77 = new int[i_5_];
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_++) {
						InputStream_Sub1.anIntArray77[i_6_] = buffer
								.readUnsignedShort();
						if (InputStream_Sub1.anIntArray77[i_6_] == 65535) {
							InputStream_Sub1.anIntArray77[i_6_] = -1;
						}
					}
				}
			} else {
				int[] is = Class243.anIntArray3074 = new int[6];
				is[0] = buffer.readUnsignedShort();
				is[1] = buffer.readUnsignedShort();
				is[2] = buffer.readUnsignedShort();
				is[3] = buffer.readUnsignedShort();
				is[4] = buffer.readUnsignedShort();
				is[5] = buffer.readUnsignedShort();
			}
		}
		if (b > -124) {
			method3291((byte) 23, null);
		}
	}

	Class268(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_, int i_14_, boolean bool, boolean bool_15_,
			int i_16_) {
		aShort3460 = (short) i_12_;
		anInt3461 = i_9_;
		anInt3456 = i;
		aShort3458 = (short) i_10_;
		anInt3453 = i_7_;
		aByte3462 = (byte) i_14_;
		anInt3459 = i_16_;
		aShort3457 = (short) i_11_;
		anInt3454 = i_8_;
		aBoolean3451 = bool_15_;
	}
}
