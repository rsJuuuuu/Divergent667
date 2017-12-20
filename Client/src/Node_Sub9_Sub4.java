/* Node_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub9_Sub4 extends Node_Sub9
{
	static int anInt9725;
	static int anInt9726;
	static Class180 aClass180_9727;
	static int anInt9728;
	static int anInt9729;
	static int anInt9730;
	static int anInt9731;
	static int anInt9732;
	static int DECODE_MASKS_PLAYERS_COUNT = 0;
	private Node_Sub9_Sub1 aNode_Sub9_Sub1_9734;
	static int anInt9735;
	static int anInt9736;
	static int anInt9737;
	static int anInt9738;
	protected Class312 aClass312_9739 = new Class312();
	protected Node_Sub9_Sub3 aNode_Sub9_Sub3_9740 = new Node_Sub9_Sub3();
	
	final void method2426(int i) {
		anInt9730++;
		aNode_Sub9_Sub3_9740.method2426(i);
	while_260_:
		for (Node_Sub10 node_sub10 = (Node_Sub10) aClass312_9739.method3613(65280); node_sub10 != null; node_sub10 = (Node_Sub10) aClass312_9739.method3620(16776960)) {
			if (!aNode_Sub9_Sub1_9734.method2444(node_sub10, (byte) 103)) {
				int i_0_ = i;
				while ((i_0_ ^ 0xffffffff) < (node_sub10.anInt7077 ^ 0xffffffff)) {
					method2520(node_sub10, 262144, node_sub10.anInt7077);
					i_0_ -= node_sub10.anInt7077;
					if (aNode_Sub9_Sub1_9734.method2468(node_sub10, 83, null, 0, i_0_)) {
						continue while_260_;
					}
				}
				method2520(node_sub10, 262144, i_0_);
				node_sub10.anInt7077 -= i_0_;
			}
		}
	}
	
	private final void method2520(Node_Sub10 node_sub10, int i, int i_1_) {
		if ((0x4 & aNode_Sub9_Sub1_9734.anIntArray9680[node_sub10.anInt7080] ^ 0xffffffff) != -1 && (node_sub10.anInt7100 ^ 0xffffffff) > -1) {
			int i_2_ = aNode_Sub9_Sub1_9734.anIntArray9685[node_sub10.anInt7080] / Class365.anInt4523;
			int i_3_ = (1048575 + (i_2_ - node_sub10.anInt7076)) / i_2_;
			node_sub10.anInt7076 = node_sub10.anInt7076 + i_2_ * i_1_ & 0xfffff;
			if ((i_3_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
				if ((aNode_Sub9_Sub1_9734.anIntArray9659[node_sub10.anInt7080] ^ 0xffffffff) == -1) {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub10.aNode_Sub45_Sub1_7087, node_sub10.aNode_Sub9_Sub2_7095.method2503(), node_sub10.aNode_Sub9_Sub2_7095.method2504(), node_sub10.aNode_Sub9_Sub2_7095.method2511());
				} else {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub10.aNode_Sub45_Sub1_7087, node_sub10.aNode_Sub9_Sub2_7095.method2503(), 0, node_sub10.aNode_Sub9_Sub2_7095.method2511());
					aNode_Sub9_Sub1_9734.method2466(node_sub10.aNode_Sub6_7098.aShortArray7044[node_sub10.anInt7091] < 0, node_sub10, -26045);
				}
				if (node_sub10.aNode_Sub6_7098.aShortArray7044[node_sub10.anInt7091] < 0) {
					node_sub10.aNode_Sub9_Sub2_7095.method2481(-1);
				}
				i_1_ = node_sub10.anInt7076 / i_2_;
			}
		}
		if (i != 262144) {
			method2427(null, 73, 98);
		}
		anInt9725++;
		node_sub10.aNode_Sub9_Sub2_7095.method2426(i_1_);
	}
	
	static final Class116 method2521(BufferedStream buffer, int i) {
		if (i != -30746) {
			anInt9732 = -68;
		}
		anInt9726++;
		int i_4_ = buffer.readInt();
		return new Class116(i_4_);
	}
	
	static final boolean method2522(int i, int i_5_, int i_6_) {
		anInt9737++;
		if (i != 0) {
			method2522(101, 82, 47);
		}
        return (i_5_ & 0x800 ^ 0xffffffff) != -1;
    }
	
	final int method2428() {
		anInt9731++;
		return 0;
	}
	
	final Node_Sub9 method2431() {
		anInt9738++;
		Node_Sub10 node_sub10;
		do {
			node_sub10 = (Node_Sub10) aClass312_9739.method3620(16776960);
			if (node_sub10 == null) {
				return null;
			}
		} while (node_sub10.aNode_Sub9_Sub2_7095 == null);
		return node_sub10.aNode_Sub9_Sub2_7095;
	}
	
	static final GLSprite method2523(byte b, int i, Index class302) {
		if (b < 89) {
			return null;
		}
		anInt9728++;
		GLSprite glsprite = (GLSprite) Class315.aClass61_4031.method607((long) i, 0);
		if (glsprite == null) {
			if (Class320_Sub13.aBoolean8335) {
				glsprite = Class93.aGraphicsToolkit1241.a(Class383.method4191(class302, i), true);
			} else {
				glsprite = Class97.method1077(-127, class302.method3518((byte) -126, i));
			}
			Class315.aClass61_4031.method601(glsprite, 25566, (long) i);
		}
		return glsprite;
	}
	
	public static void method2524(int i) {
		if (i > -64) {
			anInt9732 = -126;
		}
		aClass180_9727 = null;
	}
	
	final Node_Sub9 method2429() {
		anInt9736++;
		Node_Sub10 node_sub10 = (Node_Sub10) aClass312_9739.method3613(65280);
		if (node_sub10 == null) {
			return null;
		}
		if (node_sub10.aNode_Sub9_Sub2_7095 != null) {
			return node_sub10.aNode_Sub9_Sub2_7095;
		}
		return method2431();
	}
	
	private final void method2525(int[] is, Node_Sub10 node_sub10, int i, int i_7_, int i_8_, int i_9_) {
		if (i_9_ != 12073) {
			DECODE_MASKS_PLAYERS_COUNT = 44;
		}
		if ((0x4 & aNode_Sub9_Sub1_9734.anIntArray9680[node_sub10.anInt7080] ^ 0xffffffff) != -1 && node_sub10.anInt7100 < 0) {
			int i_10_ = aNode_Sub9_Sub1_9734.anIntArray9685[node_sub10.anInt7080] / Class365.anInt4523;
			for (;;) {
				int i_11_ = (-node_sub10.anInt7076 + (1048575 + i_10_)) / i_10_;
				if (i_11_ > i_7_) {
					break;
				}
				node_sub10.aNode_Sub9_Sub2_7095.method2427(is, i_8_, i_11_);
				node_sub10.anInt7076 += -1048576 + i_10_ * i_11_;
				i_7_ -= i_11_;
				i_8_ += i_11_;
				int i_12_ = Class365.anInt4523 / 100;
				int i_13_ = 262144 / i_10_;
				if ((i_13_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)) {
					i_12_ = i_13_;
				}
				Node_Sub9_Sub2 node_sub9_sub2 = node_sub10.aNode_Sub9_Sub2_7095;
				if ((aNode_Sub9_Sub1_9734.anIntArray9659[node_sub10.anInt7080] ^ 0xffffffff) != -1) {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub10.aNode_Sub45_Sub1_7087, node_sub9_sub2.method2503(), 0, node_sub9_sub2.method2511());
					aNode_Sub9_Sub1_9734.method2466(node_sub10.aNode_Sub6_7098.aShortArray7044[node_sub10.anInt7091] < 0, node_sub10, -26045);
					node_sub10.aNode_Sub9_Sub2_7095.method2478(i_12_, node_sub9_sub2.method2504());
				} else {
					node_sub10.aNode_Sub9_Sub2_7095 = Node_Sub9_Sub2.method2509(node_sub10.aNode_Sub45_Sub1_7087, node_sub9_sub2.method2503(), node_sub9_sub2.method2504(), node_sub9_sub2.method2511());
				}
				if (node_sub10.aNode_Sub6_7098.aShortArray7044[node_sub10.anInt7091] < 0) {
					node_sub10.aNode_Sub9_Sub2_7095.method2481(-1);
				}
				node_sub9_sub2.method2483(i_12_);
				node_sub9_sub2.method2427(is, i_8_, -i_8_ + i);
				if (node_sub9_sub2.method2499()) {
					aNode_Sub9_Sub3_9740.method2513(node_sub9_sub2);
				}
			}
			node_sub10.anInt7076 += i_7_ * i_10_;
		}
		anInt9735++;
		node_sub10.aNode_Sub9_Sub2_7095.method2427(is, i_8_, i_7_);
	}
	
	final void method2427(int[] is, int i, int i_14_) {
		anInt9729++;
		aNode_Sub9_Sub3_9740.method2427(is, i, i_14_);
	while_262_:
		for (Node_Sub10 node_sub10 = (Node_Sub10) aClass312_9739.method3613(65280); node_sub10 != null; node_sub10 = (Node_Sub10) aClass312_9739.method3620(16776960)) {
			if (!aNode_Sub9_Sub1_9734.method2444(node_sub10, (byte) -99)) {
				int i_15_ = i;
				int i_16_ = i_14_;
				while (node_sub10.anInt7077 < i_16_) {
					method2525(is, node_sub10, i_16_ + i_15_, node_sub10.anInt7077, i_15_, 12073);
					i_15_ += node_sub10.anInt7077;
					i_16_ -= node_sub10.anInt7077;
					if (aNode_Sub9_Sub1_9734.method2468(node_sub10, 66, is, i_15_, i_16_)) {
						continue while_262_;
					}
				}
				method2525(is, node_sub10, i_15_ + i_16_, i_16_, i_15_, 12073);
				node_sub10.anInt7077 -= i_16_;
			}
		}
	}
	
	Node_Sub9_Sub4(Node_Sub9_Sub1 node_sub9_sub1) {
		aNode_Sub9_Sub1_9734 = node_sub9_sub1;
	}
	
	static {
		anInt9732 = 0;
	}
}
