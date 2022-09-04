/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264
{
	static int anInt3348;
	private short[] aShortArray3349;
	static int anInt3350;
	static int anInt3351;
	static int[] anIntArray3352;
	private short[] aShortArray3353;
	static int anInt3354;
	static int anInt3355 = 1338;
	private short[] aShortArray3356;
	private int[] anIntArray3357;
	static int anInt3358;
	private short[] aShortArray3359;
	protected Class181 aClass181_3360;
	static int anInt3361;
	private int[] anIntArray3362 = { -1, -1, -1, -1, -1 };
	
	private final void method3225(byte b, int i, BufferedStream buffer) {
		anInt3361++;
		if (i == 1) {
			buffer.readUnsignedByte();
		} else if (i == 2) {
            int i_4_ = buffer.readUnsignedByte();
            anIntArray3357 = new int[i_4_];
            for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
                anIntArray3357[i_5_] = buffer.readBigSmart();
        } else if (i != 3) {
            if (i == 40) {
                int i_2_ = buffer.readUnsignedByte();
                aShortArray3359 = new short[i_2_];
                aShortArray3349 = new short[i_2_];
                for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
                    aShortArray3349[i_3_] = (short) buffer.readUnsignedShort();
                    aShortArray3359[i_3_] = (short) buffer.readUnsignedShort();
                }
            } else if (i == 41) {
                int i_0_ = buffer.readUnsignedByte();
                aShortArray3353 = new short[i_0_];
                aShortArray3356 = new short[i_0_];
                for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
                    aShortArray3356[i_1_] = (short) buffer.readUnsignedShort();
                    aShortArray3353[i_1_] = (short) buffer.readUnsignedShort();
                }
            } else if (i >= 60 && i < 70) {
                anIntArray3362[-60 + i] = buffer.readBigSmart();
            }
        }
        if (b != 11) {
			aShortArray3349 = null;
		}
	}
	
	final void method3226(BufferedStream buffer, byte b) {
		anInt3358++;
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method3225((byte) 11, i, buffer);
		}
		if (b != -24) {
			anIntArray3352 = null;
		}
	}
	
	final Model method3227(byte b) {
		anInt3350++;
		Model[] models = new Model[5];
		int i = 0;
		if (b < 6) {
			aShortArray3356 = null;
		}
		synchronized (aClass181_3360.aClass302_2156) {
			for (int i_6_ = 0; i_6_ < 5; i_6_++) {
				if (anIntArray3362[i_6_] != -1) {
					models[i++] = Renderer.method3448(anIntArray3362[i_6_], 7, 0, aClass181_3360.aClass302_2156);
				}
			}
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (models[i_7_] != null && models[i_7_].anInt2614 < 13) {
				models[i_7_].method2081(2, 0);
			}
		}
		Model model = new Model(models, i);
		if (aShortArray3349 != null) {
			for (int i_8_ = 0; aShortArray3349.length > i_8_; i_8_++)
				model.method2089(aShortArray3349[i_8_], aShortArray3359[i_8_], -93);
		}
		if (aShortArray3356 != null) {
			for (int i_9_ = 0; aShortArray3356.length > i_9_; i_9_++)
				model.method2087(aShortArray3356[i_9_], aShortArray3353[i_9_], 74);
		}
		return model;
	}
	
	final boolean method3228(boolean bool) {
		anInt3354++;
		boolean bool_10_ = bool;
		synchronized (aClass181_3360.aClass302_2156) {
			for (int i = 0; i < 5; i++) {
				if (anIntArray3362[i] != -1 && !aClass181_3360.aClass302_2156.method3515(0, anIntArray3362[i], 0)) {
					bool_10_ = false;
				}
			}
		}
		return bool_10_;
	}
	
	final boolean method3229(int i) {
		anInt3348++;
		if (anIntArray3357 == null) {
			return true;
		}
		boolean bool = true;
		synchronized (aClass181_3360.aClass302_2156) {
			for (int i_11_ = i; i_11_ < anIntArray3357.length; i_11_++) {
				if (!aClass181_3360.aClass302_2156.method3515(0, anIntArray3357[i_11_], 0)) {
					bool = false;
				}
			}
		}
		return bool;
	}
	
	public static void method3230(byte b) {
		if (b != -5) {
			anIntArray3352 = null;
		}
		anIntArray3352 = null;
	}
	
	final Model method3231(int i) {
		anInt3351++;
		if (anIntArray3357 == null) {
			return null;
		}
		Model[] models = new Model[anIntArray3357.length];
		synchronized (aClass181_3360.aClass302_2156) {
			for (int i_12_ = i; anIntArray3357.length > i_12_; i_12_++)
				models[i_12_] = Renderer.method3448(anIntArray3357[i_12_], i + 7, 0, aClass181_3360.aClass302_2156);
		}
		for (int i_13_ = 0; anIntArray3357.length > i_13_; i_13_++) {
			if (models[i_13_].anInt2614 < 13) {
				models[i_13_].method2081(2, 0);
			}
		}
		Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models, models.length);
		}
		if (model == null) {
			return null;
		}
		if (aShortArray3349 != null) {
			for (int i_14_ = 0; aShortArray3349.length > i_14_; i_14_++)
				model.method2089(aShortArray3349[i_14_], aShortArray3359[i_14_], 77);
		}
		if (aShortArray3356 != null) {
			for (int i_15_ = 0; aShortArray3356.length > i_15_; i_15_++)
				model.method2087(aShortArray3356[i_15_], aShortArray3353[i_15_], -114);
		}
		return model;
	}
	
	static {
		anIntArray3352 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	}
}
