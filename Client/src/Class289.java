/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class289
{
	static int anInt3628;
	protected int anInt3629;
	static HashTable aHashTable3630 = new HashTable(8);
	protected int anInt3631 = 0;
	protected int anInt3632 = 512;
	protected int anInt3633;
	protected int anInt3634;
	protected Class71 aClass71_3635;
	protected boolean aBoolean3636 = true;
	protected int anInt3637;
	protected boolean aBoolean3638;
	static int anInt3639;
	protected int anInt3640;
	protected int anInt3641;
	static int anInt3642;
	protected boolean aBoolean3643;
	static int anInt3644;
	static int anInt3645;
	protected int anInt3646;
	
	static final void method3405(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte b) {
		anInt3628++;
		int i_5_ = i_2_ + -i_3_;
		int i_6_ = i_4_ - -i_3_;
		for (int i_7_ = i_4_; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
			Class369.method4086(i_1_, i, i_0_, Class169_Sub4.anIntArrayArray8826[i_7_], b + -44);
		for (int i_8_ = i_2_; (i_5_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_8_--)
			Class369.method4086(i_1_, i, i_0_, Class169_Sub4.anIntArrayArray8826[i_8_], 0);
		int i_9_ = i_1_ - i_3_;
		int i_10_ = i_0_ - -i_3_;
		for (int i_11_ = i_6_; (i_11_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff); i_11_++) {
			int[] is = Class169_Sub4.anIntArrayArray8826[i_11_];
			Class369.method4086(i_10_, i, i_0_, is, b + -44);
			Class369.method4086(i_1_, i, i_9_, is, 0);
		}
		if (b != 44) {
			aHashTable3630 = null;
		}
	}
	
	final void method3406(int i) {
		anInt3642++;
		if (i != -13163) {
			aBoolean3636 = true;
		}
		anInt3633 = anInt3637 | anInt3633 << 8;
	}
	
	public static void method3407(boolean bool) {
		aHashTable3630 = null;
		if (bool != false) {
			anInt3645 = -4;
		}
	}
	
	final void method3408(byte b, BufferedStream buffer) {
		anInt3644++;
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method3409((byte) 123, buffer, i);
		}
		if (b > -78) {
			method3405(-88, -55, -40, -98, 6, 127, (byte) 119);
		}
	}
	
	private final void method3409(byte b, BufferedStream buffer, int i) {
		anInt3639++;
		if ((i ^ 0xffffffff) != -2) {
			if ((i ^ 0xffffffff) == -3) {
				anInt3640 = buffer.readUnsignedByte();
			} else if ((i ^ 0xffffffff) != -4) {
				if ((i ^ 0xffffffff) == -6) {
					aBoolean3636 = false;
				} else if (i != 7) {
					if (i == 8) {
						aClass71_3635.anInt961 = anInt3637;
					} else if (i != 9) {
						if ((i ^ 0xffffffff) == -11) {
							aBoolean3638 = false;
						} else if ((i ^ 0xffffffff) == -12) {
							anInt3633 = buffer.readUnsignedByte();
						} else if ((i ^ 0xffffffff) == -13) {
							aBoolean3643 = true;
						} else if (i == 13) {
							anInt3646 = buffer.read24BitInteger();
						} else if (i == 14) {
							anInt3634 = buffer.readUnsignedByte() << 2;
						} else if (i == 16) {
							anInt3641 = buffer.readUnsignedByte();
						}
					} else {
						anInt3632 = buffer.readUnsignedShort() << 2;
					}
				} else {
					anInt3629 = Node_Sub15_Sub12.method2582(buffer.read24BitInteger(), -1);
				}
			} else {
				anInt3640 = buffer.readUnsignedShort();
				if ((anInt3640 ^ 0xffffffff) == -65536) {
					anInt3640 = -1;
				}
			}
		} else {
			anInt3631 = Node_Sub15_Sub12.method2582(buffer.read24BitInteger(), -1);
		}
		@SuppressWarnings("unused")
		int i_12_ = 6 % ((74 - b) / 49);
	}
	
	public Class289() {
		anInt3629 = -1;
		anInt3634 = 64;
		aBoolean3638 = true;
		anInt3633 = 8;
		anInt3641 = 127;
		anInt3640 = -1;
		aBoolean3643 = false;
		anInt3646 = 1190717;
	}
}
