/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class249
{
	protected int anInt3148;
	static int anInt3149;
	protected int anInt3150;
	static int[] anIntArray3151;
	protected int anInt3152;
	static int anInt3153;
	static BufferedStream[] cachedappearances = new BufferedStream[2048];
	protected int anInt3155 = 0;
	protected long aLong3156;
	protected int anInt3157;
	protected int anInt3158;
	static int anInt3159;
	protected int anInt3160;
	static int anInt3161;
	protected int anInt3162 = 0;
	protected int anInt3163;
	protected int anInt3164;
	private boolean aBoolean3165 = false;
	protected int anInt3166;
	private int anInt3167;
	
	static final int method3086(int i, int i_0_, byte b) {
		anInt3159++;
		int i_1_ = i >>> 24;
		i = (~0xff00ff & (0xff00ff & i) * i_1_ | 0xff0000 & (i & 0xff00) * i_1_) >>> 8;
		if (b != -56) {
			method3086(30, -58, (byte) 18);
		}
		int i_2_ = -i_1_ + 255;
		return i + ((0xff0000 & i_2_ * (i_0_ & 0xff00) | i_2_ * (i_0_ & 0xff00ff) & ~0xff00ff) >>> 8);
	}
	
	private final void method3087(BufferedStream buffer, int i, int i_3_) {
		if (i_3_ != 1) {
			if ((i_3_ ^ 0xffffffff) == -3) {
				buffer.readUnsignedByte();
			} else if ((i_3_ ^ 0xffffffff) == -4) {
				anInt3157 = buffer.readInt();
				anInt3166 = buffer.readInt();
				anInt3150 = buffer.readInt();
			} else if ((i_3_ ^ 0xffffffff) != -5) {
				if (i_3_ == 6) {
					anInt3160 = buffer.readUnsignedByte();
				} else if ((i_3_ ^ 0xffffffff) != -9) {
					if ((i_3_ ^ 0xffffffff) != -10) {
						if (i_3_ == 10) {
							aBoolean3165 = true;
						}
					} else {
						anInt3162 = 1;
					}
				} else {
					anInt3155 = 1;
				}
			} else {
				anInt3163 = buffer.readUnsignedByte();
				anInt3148 = buffer.readInt();
			}
		} else {
			anInt3167 = buffer.readUnsignedShort();
		}
		anInt3153++;
		if (i != 2) {
			anInt3152 = 73;
		}
	}
	
	public static void method3088(byte b) {
		if (b < 92) {
			method3086(99, -54, (byte) 56);
		}
		cachedappearances = null;
		anIntArray3151 = null;
	}
	
	final void method3089(byte b) {
		anInt3161++;
		anInt3152 = Class335.anIntArray4165[anInt3167 << 3];
		long l = (long) anInt3157;
		long l_4_ = (long) anInt3166;
		long l_5_ = (long) anInt3150;
		if (b <= 111) {
			aBoolean3165 = false;
		}
		anInt3164 = (int) Math.sqrt((double) (l * l - (-(l_4_ * l_4_) + -(l_5_ * l_5_))));
		if (anInt3148 == 0) {
			anInt3148 = 1;
		}
		if (anInt3163 == 0) {
			aLong3156 = 2147483647L;
		} else if ((anInt3163 ^ 0xffffffff) != -2) {
			if ((anInt3163 ^ 0xffffffff) == -3) {
				aLong3156 = (long) (8 * anInt3164 / anInt3148);
			}
		} else {
			aLong3156 = (long) (anInt3164 * 8 / anInt3148);
			aLong3156 *= aLong3156;
		}
		if (aBoolean3165) {
			anInt3164 *= -1;
		}
	}
	
	final void method3090(byte b, BufferedStream buffer) {
		anInt3149++;
		if (b > -16) {
			method3086(58, -104, (byte) 30);
		}
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method3087(buffer, 2, i);
		}
	}
	
	static {
		anIntArray3151 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1 };
	}
}
