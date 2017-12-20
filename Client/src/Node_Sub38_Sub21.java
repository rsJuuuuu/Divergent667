/* Node_Sub38_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub21 extends Node_Sub38
{
	static int anInt10315;
	static IncommingPacket aClass192_10316;
	static int anInt10317;
	static int[] anIntArray10318 = { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
	static int anInt10319;
	static boolean aBoolean10320;
	
	public Node_Sub38_Sub21() {
		super(1, true);
	}
	
	public static void method2858(byte b) {
		if (b <= 6) {
			method2859(null, false);
		}
		aClass192_10316 = null;
		anIntArray10318 = null;
	}
	
	final int[] method2775(int i, int i_0_) {
		anInt10317++;
		if (i < 107) {
			return null;
		}
		int[] is = aClass146_7460.method1645(27356, i_0_);
		if (aClass146_7460.aBoolean1819) {
			int[][] is_1_ = this.method2777(-76, 0, i_0_);
			int[] is_2_ = is_1_[0];
			int[] is_3_ = is_1_[1];
			int[] is_4_ = is_1_[2];
			for (int i_5_ = 0; Class339_Sub7.anInt8728 > i_5_; i_5_++)
				is[i_5_] = (is_4_[i_5_] + is_2_[i_5_] + is_3_[i_5_]) / 3;
		}
		return is;
	}
	
	static final Class235_Sub1 method2859(BufferedStream buffer, boolean bool) {
		anInt10319++;
		if (bool != false) {
			method2859(null, false);
		}
		Class235 class235 = Node_Sub40.method2928(buffer, (byte) -24);
		int i = buffer.read24BitInteger((byte) 99);
		return new Class235_Sub1(class235.anInt5125, class235.aClass379_5118, class235.aClass77_5123, class235.anInt5124, class235.anInt5116, i);
	}
	
	static {
		aClass192_10316 = new IncommingPacket(45, 2);
		aBoolean10320 = false;
	}
}
