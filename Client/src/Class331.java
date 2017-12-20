/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class331
{
	static boolean aBoolean4129;
	static int anInt4130 = -1;
	static int anInt4131;
	static int anInt4132;
	private int[] anIntArray4133;
	private int[] anIntArray4134;
	private int[] anIntArray4135;
	static int anInt4136;
	static int anInt4137;
	private int[] anIntArray4138;
	private int[] anIntArray4139;
	static float aFloat4140;
	private int[] anIntArray4141;
	private int[] anIntArray4142;
	
	final void method3840(int i, int i_0_) {
		anInt4131++;
		int[][] is = new int[anIntArray4139.length << 1][4];
		int i_1_ = 0;
		if (i_0_ != 2) {
			anIntArray4134 = null;
		}
		for (/**/; anIntArray4139.length > i_1_; i_1_++) {
			is[i_1_ * 2][0] = anIntArray4139[i_1_];
			is[2 * i_1_][1] = anIntArray4142[i_1_];
			is[2 * i_1_][2] = anIntArray4138[i_1_];
			is[i_1_ * 2][3] = anIntArray4134[i_1_];
			is[2 * i_1_ + 1][0] = anIntArray4133[i_1_];
			is[i_1_ * 2 - -1][1] = anIntArray4135[i_1_];
			is[2 * i_1_ + 1][2] = anIntArray4141[i_1_];
			is[1 + 2 * i_1_][3] = anIntArray4134[i_1_];
		}
		Class277_Sub1.anIntArrayArrayArray8042[i] = is;
	}
	
	static final Class129 method3841(int i, int i_2_) {
		anInt4132++;
		if (i != 20568) {
			aBoolean4129 = false;
		}
		Class129[] class129s = Node_Sub15_Sub13.method2586(-11746);
		for (int i_3_ = 0; (class129s.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
			Class129 class129 = class129s[i_3_];
			if ((class129.anInt1662 ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
				return class129;
			}
		}
		return null;
	}
	
	static final void method3842(int i, int i_4_, int i_5_, int i_6_, int i_7_, byte b) {
		anInt4136++;
		if (b != -54) {
			aBoolean4129 = true;
		}
		if ((Class262_Sub4.anInt7722 ^ 0xffffffff) < (i_4_ ^ 0xffffffff) || (za_Sub2.anInt10513 ^ 0xffffffff) > (i ^ 0xffffffff) || i_7_ < Class384.anInt4906 || (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
			Class125.method1527(0, i_4_, i, i_5_, i_7_, i_6_);
		} else {
			Class296.method3477(i_7_, i_5_, i_4_, i_6_, i, 106);
		}
	}
	
	static final void method3843(boolean bool, int i, int i_8_, int i_9_) {
		anInt4137++;
		String string = "tele " + i + "," + (i_9_ >> 6) + "," + (i_8_ >> 6) + "," + (i_9_ & 0x3f) + "," + (i_8_ & 0x3f);
		//System.out.println(string);
		Class126.method1538(90, true, bool, string);
	}
	
	Class331(BufferedStream buffer) {
		int i = buffer.readSmart();
		anIntArray4142 = new int[i];
		anIntArray4141 = new int[i];
		anIntArray4133 = new int[i];
		anIntArray4139 = new int[i];
		anIntArray4135 = new int[i];
		anIntArray4138 = new int[i];
		anIntArray4134 = new int[i];
		for (int i_10_ = 0; i > i_10_; i_10_++) {
			anIntArray4139[i_10_] = buffer.readUnsignedShort() + -5120;
			anIntArray4138[i_10_] = -5120 + buffer.readUnsignedShort();
			anIntArray4142[i_10_] = buffer.readShort();
			anIntArray4133[i_10_] = -5120 + buffer.readUnsignedShort();
			anIntArray4141[i_10_] = buffer.readUnsignedShort() - 5120;
			anIntArray4135[i_10_] = buffer.readShort();
			anIntArray4134[i_10_] = buffer.readShort();
		}
	}
	
	static {
		aBoolean4129 = false;
	}
}
