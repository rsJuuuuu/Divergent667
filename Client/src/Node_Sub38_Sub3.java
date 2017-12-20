/* Node_Sub38_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub3 extends Node_Sub38
{
	static int anInt10098;
	private int anInt10099 = 4096;
	static int anInt10100;
	private static char[] aCharArray10101 = new char[64];
	static int anInt10102;
	private int anInt10103 = 4096;
	static int anInt10104;
	static String[] aStringArray10105;
	private int anInt10106 = 4096;
	static String[] aStringArray10107;
	
	public Node_Sub38_Sub3() {
		super(1, false);
	}
	
	final int[][] method2778(int i, boolean bool) {
		if (bool != true) {
			aCharArray10101 = null;
		}
		anInt10098++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (aClass348_7454.aBoolean4300) {
			int[][] is_0_ = this.method2777(-63, 0, i);
			int[] is_1_ = is_0_[0];
			int[] is_2_ = is_0_[1];
			int[] is_3_ = is_0_[2];
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_7_++) {
				int i_8_ = is_1_[i_7_];
				int i_9_ = is_3_[i_7_];
				int i_10_ = is_2_[i_7_];
				if (i_8_ != i_9_ || i_10_ != i_9_) {
					is_4_[i_7_] = anInt10106;
					is_5_[i_7_] = anInt10103;
					is_6_[i_7_] = anInt10099;
				} else {
					is_4_[i_7_] = anInt10106 * i_8_ >> 12;
					is_5_[i_7_] = i_9_ * anInt10103 >> 12;
					is_6_[i_7_] = i_10_ * anInt10099 >> 12;
				}
			}
		}
		return is;
	}
	
	public static void method2796(int i) {
		aStringArray10105 = null;
		if (i <= -29) {
			aCharArray10101 = null;
			aStringArray10107 = null;
		}
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool != false) {
			anInt10104 = -61;
		}
		int i_11_ = i;
	while_2_:
		do {
			do {
				if (i_11_ != 0) {
					if (i_11_ != 1) {
						if ((i_11_ ^ 0xffffffff) == -3) {
							break;
						}
						break while_2_;
					}
				} else {
					anInt10106 = buffer.readUnsignedShort();
					break while_2_;
				}
				anInt10103 = buffer.readUnsignedShort();
				break while_2_;
			} while (false);
			anInt10099 = buffer.readUnsignedShort();
		} while (false);
		anInt10100++;
	}
	
	static {
		for (int i = 0; (i ^ 0xffffffff) > -27; i++)
			aCharArray10101[i] = (char) (65 + i);
		for (int i = 26; (i ^ 0xffffffff) > -53; i++)
			aCharArray10101[i] = (char) (97 + i - 26);
		for (int i = 52; (i ^ 0xffffffff) > -63; i++)
			aCharArray10101[i] = (char) (i + -4);
		aCharArray10101[62] = '+';
		aCharArray10101[63] = '/';
		anInt10104 = 0;
		anInt10102 = 0;
		aStringArray10107 = new String[5];
	}
}
