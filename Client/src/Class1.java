/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
	protected boolean aBoolean105 = true;
	protected short[][] aShortArrayArray106;
	static int anInt107;
	protected int[] anIntArray108 = null;
	static int[] anIntArray109 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	protected int anInt110 = -1;
	protected boolean aBoolean111;
	protected int anInt112;
	protected short[][][] aShortArrayArrayArray113;
	static int anInt114;
	static int anInt115 = -1;
	protected int anInt116;
	protected int anInt117 = 4;
	protected int anInt118;
	protected int[] anIntArray119;
	protected int anInt120;
	
	private final void method163(BufferedStream buffer, int i) {
		anInt114++;
		boolean bool = false;
		for (;;) {
			int i_0_ = buffer.readUnsignedByte();
			if ((i_0_ ^ 0xffffffff) == -1) {
				break;
			}
			if ((i_0_ ^ 0xffffffff) != -2) {
				if ((i_0_ ^ 0xffffffff) != -3) {
					if (i_0_ != 3) {
						if (i_0_ != 4) {
							if ((i_0_ ^ 0xffffffff) == -6) {
								anInt120 = buffer.read24BitInteger();
							} else if ((i_0_ ^ 0xffffffff) == -7) {
								anInt112 = buffer.read24BitInteger();
							} else if (i_0_ == 7) {
								aShortArrayArrayArray113 = new short[10][4][];
								aShortArrayArray106 = new short[10][4];
								for (int i_1_ = 0; i_1_ < 10; i_1_++) {
									for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5; i_2_++) {
										int i_3_ = buffer.readUnsignedShort();
										if ((i_3_ ^ 0xffffffff) == -65536) {
											i_3_ = -1;
										}
										aShortArrayArray106[i_1_][i_2_] = (short) i_3_;
										int i_4_ = buffer.readUnsignedShort();
										aShortArrayArrayArray113[i_1_][i_2_] = new short[i_4_];
										for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
											int i_6_ = buffer.readUnsignedShort();
											if ((i_6_ ^ 0xffffffff) == -65536) {
												i_6_ = -1;
											}
											aShortArrayArrayArray113[i_1_][i_2_][i_5_] = (short) i_6_;
										}
									}
								}
							} else if (i_0_ != 8) {
								if ((i_0_ ^ 0xffffffff) == -10) {
									anInt116 = buffer.readUnsignedByte();
								} else if (i_0_ != 10) {
									if ((i_0_ ^ 0xffffffff) == -12) {
										anInt118 = buffer.readUnsignedByte();
									}
								} else {
									aBoolean111 = false;
								}
							} else {
								aBoolean105 = false;
							}
						}
					} else {
						anInt117 = buffer.readUnsignedByte();
						anIntArray108 = new int[anInt117];
						anIntArray119 = new int[anInt117];
					}
				} else {
					anInt110 = buffer.readUnsignedShort();
				}
			} else {
				if (anIntArray119 == null) {
					anIntArray119 = new int[4];
					anIntArray108 = new int[4];
					anInt117 = 4;
				}
				bool = true;
				for (int i_7_ = 0; i_7_ < anIntArray119.length; i_7_++) {
					anIntArray119[i_7_] = buffer.readShort();
					anIntArray108[i_7_] = buffer.readShort();
				}
			}
		}
		if (!bool) {
			if (anIntArray119 == null) {
				anIntArray108 = new int[4];
				anIntArray119 = new int[4];
				anInt117 = 4;
			}
			for (int i_8_ = 0; i_8_ < anIntArray119.length; i_8_++) {
				anIntArray119[i_8_] = 0;
				anIntArray108[i_8_] = i_8_ * 20;
			}
		}
		if (i != 10200) {
			method164(null, (byte) -62, -57);
		}
	}
	
	static final short[] method164(short[] ses, byte b, int i) {
		anInt107++;
		short[] ses_9_ = new short[i];
		if (b > -11) {
			anIntArray109 = null;
		}
		Class311.method3606(ses, 0, ses_9_, 0, i);
		return ses_9_;
	}
	
	public static void method165(byte b) {
		if (b < -78) {
			anIntArray109 = null;
		}
	}
	
	Class1(Index class302) {
		aBoolean111 = true;
		anInt116 = 2;
		anIntArray119 = null;
		anInt118 = 3;
		try {
			byte[] bs = class302.method3518((byte) 126, 3);
			method163(new BufferedStream(bs), 10200);
		} catch (RuntimeException runtimeexception) {
			throw Class126.method1537(runtimeexception, "aba.<init>(" + (class302 != null ? "{...}" : "null") + ')');
		}
	}
}
