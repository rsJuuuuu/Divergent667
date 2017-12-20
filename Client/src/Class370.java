/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class370
{
	static int anInt4566;
	static int[] anIntArray4567 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	static int anInt4568;
	static int anInt4569;
	static boolean aBoolean4570 = false;
	static int anInt4571;
	
	public static void method4088(int i) {
		if (i == 16) {
			anIntArray4567 = null;
		}
	}
	
	static final void method4089(Class326 class326) {
		if (Class188_Sub1_Sub1.anInt9337 < 65535) {
			Node_Sub29 node_sub29 = class326.aNode_Sub29_4100;
			Class143.aClass326Array1771[Class188_Sub1_Sub1.anInt9337] = class326;
			Class147.aBooleanArray1820[Class188_Sub1_Sub1.anInt9337] = false;
			Class188_Sub1_Sub1.anInt9337++;
			int i = class326.anInt4092;
			if (class326.aBoolean4090) {
				i = 0;
			}
			int i_0_ = class326.anInt4092;
			if (class326.aBoolean4102) {
				i_0_ = Class159.anInt1995 - 1;
			}
			for (int i_1_ = i; i_1_ <= i_0_; i_1_++) {
				int i_2_ = 0;
				int i_3_ = node_sub29.method2708(27433) - node_sub29.method2711(121) + Class135.anInt1692 >> Class36.anInt549;
				if (i_3_ < 0) {
					i_2_ -= i_3_;
					i_3_ = 0;
				}
				int i_4_ = node_sub29.method2708(27433) + node_sub29.method2711(118) - Class135.anInt1692 >> Class36.anInt549;
				if (i_4_ >= Node_Sub50.anInt7623) {
					i_4_ = Node_Sub50.anInt7623 - 1;
				}
				for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++) {
					int i_6_ = class326.aShortArray4105[i_2_++];
					int i_7_ = (node_sub29.method2705(32311) - node_sub29.method2711(119) + Class135.anInt1692 >> Class36.anInt549) + (i_6_ >>> 8);
					int i_8_ = i_7_ + (i_6_ & 0xff) - 1;
					if (i_7_ < 0) {
						i_7_ = 0;
					}
					if (i_8_ >= Class328.anInt4115) {
						i_8_ = Class328.anInt4115 - 1;
					}
					for (int i_9_ = i_7_; i_9_ <= i_8_; i_9_++) {
						long l = Class91.aLongArrayArrayArray1228[i_1_][i_9_][i_5_];
						if ((l & 0xffffL) == 0L) {
							Class91.aLongArrayArrayArray1228[i_1_][i_9_][i_5_] = l | (long) Class188_Sub1_Sub1.anInt9337;
						} else if ((l & 0xffff0000L) == 0L) {
							Class91.aLongArrayArrayArray1228[i_1_][i_9_][i_5_] = l | (long) Class188_Sub1_Sub1.anInt9337 << 16;
						} else if ((l & 0xffff00000000L) == 0L) {
							Class91.aLongArrayArrayArray1228[i_1_][i_9_][i_5_] = l | (long) Class188_Sub1_Sub1.anInt9337 << 32;
						} else if ((l & ~0xffffffffffffL) == 0L) {
							Class91.aLongArrayArrayArray1228[i_1_][i_9_][i_5_] = l | (long) Class188_Sub1_Sub1.anInt9337 << 48;
						}
					}
				}
			}
		}
	}
	
	static final void method4090(boolean bool, int i, int i_10_) {
		if (i_10_ == 0) {
			anInt4569++;
			Node_Sub16 node_sub16 = Class295.method3472(i, (byte) 18, bool);
			if (node_sub16 != null) {
				node_sub16.method2160((byte) 99);
			}
		}
	}
	
	static final void method4091(int i, String string) {
		anInt4571++;
		if (!string.equals("")) {
			anInt4566++;
			Class123 class123 = Class262_Sub23.method3213((byte) -100);
			if (i != 16) {
				aBoolean4570 = true;
			}
			Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub18.aClass318_7151, class123.anIsaacCipher1571);
			node_sub13.aPacket7113.writeByte(Class126.method1536(-20826, string));
			node_sub13.aPacket7113.writeString(string);
			class123.sendPacket(127, node_sub13);
		}
	}
	
	static {
		anInt4568 = -1;
	}
}
