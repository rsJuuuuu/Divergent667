/* Node_Sub38_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub22 extends Node_Sub38
{
	private int anInt10321 = 4096;
	static int anInt10322;
	static Class353 aClass353_10323 = new Class353("game3", "Game 3", 2);
	static int anInt10324;
	static short aShort10325;
	
	public Node_Sub38_Sub22() {
		super(1, true);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool != false) {
			method2780(true, null, 2);
		}
		if ((i ^ 0xffffffff) == -1) {
			anInt10321 = buffer.readUnsignedShort();
		}
		anInt10324++;
	}
	
	final int[] method2775(int i, int i_0_) {
		anInt10322++;
		if (i <= 107) {
			method2860((byte) 37);
		}
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_1_ = this.method2786(r_Sub2.anInt11054 & -1 + i_0_, 0, 0);
			int[] is_2_ = this.method2786(i_0_, 0, 0);
			int[] is_3_ = this.method2786(i_0_ + 1 & r_Sub2.anInt11054, 0, 0);
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++) {
				int i_5_ = (is_3_[i_4_] - is_1_[i_4_]) * anInt10321;
				int i_6_ = (is_2_[i_4_ + 1 & Class303.anInt3824] + -is_2_[Class303.anInt3824 & i_4_ - 1]) * anInt10321;
				int i_7_ = i_6_ >> 12;
				int i_8_ = i_5_ >> 12;
				int i_9_ = i_7_ * i_7_ >> 12;
				int i_10_ = i_8_ * i_8_ >> 12;
				int i_11_ = (int) (Math.sqrt((double) ((float) (4096 + i_9_ - -i_10_) / 4096.0F)) * 4096.0);
				int i_12_ = (i_11_ ^ 0xffffffff) != -1 ? 16777216 / i_11_ : 0;
				is[i_4_] = 4096 + -i_12_;
			}
		}
		return is;
	}
	
	public static void method2860(byte b) {
		if (b == 28) {
			aClass353_10323 = null;
		}
	}
}
