/* Node_Sub38_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub4 extends Node_Sub38
{
	static int anInt10108;
	private int anInt10109 = 1;
	static int anInt10110;
	static int anInt10111;
	static int anInt10112;
	private int anInt10113;
	private int anInt10114 = 0;
	static int anInt10115;
	static Index aClass302_10116;
	static int anInt10117;
	static int anInt10118 = 1400;
	
	static final boolean method2797(int i, int i_0_, int i_1_) {
		if (i != 0) {
			return true;
		}
		anInt10108++;
        return (i_1_ & 0x22) != 0;
    }
	
	public static void method2798(byte b) {
		aClass302_10116 = null;
		if (b != -113) {
			anInt10118 = 33;
		}
	}
	
	static final void method2799(int i, Npc npc) {
		if (i >= -83) {
			aClass302_10116 = null;
		}
		anInt10111++;
		for (Node_Sub47 node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3620(16776960)) {
			if (node_sub47.aNpc7583 == npc) {
				if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
					Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
					node_sub47.aNode_Sub9_Sub2_7568 = null;
				}
				node_sub47.method2160((byte) 86);
				break;
			}
		}
	}
	
	public Node_Sub38_Sub4() {
		super(0, true);
		anInt10113 = 0;
	}
	
	final int[] method2775(int i, int i_2_) {
		anInt10115++;
		if (i <= 107) {
			anInt10109 = -17;
		}
		int[] is = aClass146_7460.method1645(27356, i_2_);
		if (aClass146_7460.aBoolean1819) {
			int i_3_ = Node_Sub25_Sub1.anIntArray9941[i_2_];
			int i_4_ = i_3_ + -2048 >> 1;
			for (int i_5_ = 0; i_5_ < Class339_Sub7.anInt8728; i_5_++) {
				int i_6_ = CacheNode_Sub3.anIntArray9442[i_5_];
				int i_7_ = -2048 + i_6_ >> 1;
				int i_8_;
				if (anInt10114 == 0) {
					i_8_ = anInt10109 * (-i_3_ + i_6_);
				} else {
					int i_9_ = i_7_ * i_7_ + i_4_ * i_4_ >> 12;
					i_8_ = (int) (Math.sqrt((double) ((float) i_9_ / 4096.0F)) * 4096.0);
					i_8_ = (int) (3.141592653589793 * (double) (i_8_ * anInt10109));
				}
				i_8_ -= ~0xfff & i_8_;
				if ((anInt10113 ^ 0xffffffff) != -1) {
					if (anInt10113 == 2) {
						i_8_ -= 2048;
						if (i_8_ < 0) {
							i_8_ = -i_8_;
						}
						i_8_ = 2048 + -i_8_ << 1;
					}
				} else {
					i_8_ = Class122.anIntArray1556[(i_8_ & 0xffd) >> 4] - -4096 >> 1;
				}
				is[i_5_] = i_8_;
			}
		}
		return is;
	}
	
	final void method2785(int i) {
		anInt10112++;
		Node_Sub37.method2772((byte) 54);
		if (i != 7) {
			anInt10118 = -19;
		}
	}
	
	static final int method2800(byte b) {
		if (b != 100) {
			method2797(53, -123, 37);
		}
		anInt10117++;
		if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
			return Class303.anInt3831;
		}
		return Class148.anInt1825;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10110++;
		if (bool == false) {
			int i_10_ = i;
		while_7_:
			do {
				do {
					if (i_10_ != 0) {
						if ((i_10_ ^ 0xffffffff) != -2) {
							if ((i_10_ ^ 0xffffffff) == -4) {
								break;
							}
							break while_7_;
						}
					} else {
						anInt10114 = buffer.readUnsignedByte();
						return;
					}
					anInt10113 = buffer.readUnsignedByte();
					return;
				} while (false);
				anInt10109 = buffer.readUnsignedByte();
			} while (false);
		}
	}
}
