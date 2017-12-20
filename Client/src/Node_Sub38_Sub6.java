/* Node_Sub38_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub6 extends Node_Sub38
{
	static int anInt10132 = 0;
	static int anInt10133;
	private int anInt10134 = 0;
	static OutcommingPacket aClass318_10135 = new OutcommingPacket(8, -1);
	static int anInt10136;
	private int anInt10137 = 4096;
	static Index aClass302_10138;
	static int anInt10139;
	
	final int[] method2775(int i, int i_0_) {
		anInt10136++;
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			int[] is_1_ = this.method2786(i_0_, 0, 0);
			for (int i_2_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				int i_3_ = is_1_[i_2_];
				is[i_2_] = (anInt10134 ^ 0xffffffff) >= (i_3_ ^ 0xffffffff) && (anInt10137 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) ? 4096 : 0;
			}
		}
		if (i < 107) {
			return null;
		}
		return is;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		int i_4_ = i;
		do {
			if ((i_4_ ^ 0xffffffff) != -1) {
				if ((i_4_ ^ 0xffffffff) != -2) {
					break;
				}
			} else {
				anInt10134 = buffer.readUnsignedShort();
				break;
			}
			anInt10137 = buffer.readUnsignedShort();
		} while (false);
		if (bool == false) {
			anInt10133++;
		}
	}
	
	public Node_Sub38_Sub6() {
		super(1, true);
	}
	
	public static void method2804(byte b) {
		aClass302_10138 = null;
		aClass318_10135 = null;
		if (b != 100) {
			aClass302_10138 = null;
		}
	}
}
