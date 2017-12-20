/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class377
{
	static OutcommingPacket aClass318_4663;
	static int anInt4664 = 0;
	static int anInt4665;
	static int anInt4666;
	static int anInt4667;
	static int anInt4668;
	static int anInt4669;
	static int anInt4670;
	protected int anInt4671;
	static int anInt4672;
	protected int anInt4673;
	protected int anInt4674;
	static Class379 aClass379_4675;
	
	final boolean method4120(boolean bool) {
		if (bool != true) {
			return true;
		}
		anInt4669++;
        return (anInt4673 & 0x2 ^ 0xffffffff) != -1;
    }
	
	public static void method4121(boolean bool) {
		aClass318_4663 = null;
		aClass379_4675 = null;
		if (bool != false) {
			aClass379_4675 = null;
		}
	}
	
	final boolean method4122(int i) {
		int i_0_ = -28 / ((34 - i) / 61);
		anInt4665++;
        return (anInt4673 & 0x4) != 0;
    }
	
	final boolean method4123(int i) {
		anInt4668++;
		if (i != 27647) {
			return true;
		}
        return (anInt4673 & 0x1) != 0;
    }
	
	static final void method4124(int i, IComponentDefinitions widget, IComponentDefinitions widget_1_) {
		anInt4667++;
		Class3.anInt5162++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(i + -27933, Class357.aClass318_4441, Class218.aClass123_2566.anIsaacCipher1571);
		node_sub13.aPacket7113.writeShort(widget_1_.anInt4718);
		node_sub13.aPacket7113.writeShortLE(widget.anInt4687);
		if (i == 27547) {
			node_sub13.aPacket7113.writeShort128(widget.anInt4718);
			node_sub13.aPacket7113.writeIntV1(widget.ihash);
			node_sub13.aPacket7113.writeShortLE(widget_1_.anInt4687);
			node_sub13.aPacket7113.writeIntV2(widget_1_.ihash);
			Class218.aClass123_2566.sendPacket(126, node_sub13);
		}
	}
	
	static final void method4125(int i) {
		anInt4670++;
		for (EntityNode_Sub1 entitynode_sub1 = (EntityNode_Sub1) Class82.aClass103_1120.method1106(68); entitynode_sub1 != null; entitynode_sub1 = (EntityNode_Sub1) Class82.aClass103_1120.method1106(35))
			Class373.method4108(entitynode_sub1, 86);
		int i_2_;
		int i_3_;
		if (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) == 1) {
			i_2_ = 0;
			i_3_ = 3;
		} else {
			i_2_ = i_3_ = Class94.anInt1249;
		}
		if (i >= 94) {
			if ((aa.anInt101 ^ 0xffffffff) == -4) {
				for (int i_4_ = i_2_; i_4_ <= i_3_; i_4_++)
					Client.method106(i_4_);
				Client.method104();
			} else {
				Client.method107();
				for (int i_5_ = i_2_; i_5_ <= i_3_; i_5_++) {
					Client.method117();
					Client.method122(i_5_);
					Client.method106(i_5_);
				}
				Client.method116();
				Client.method104();
			}
		}
	}
	
	final boolean method4126(boolean bool) {
		if (bool != true) {
			method4123(66);
		}
		anInt4666++;
        return (0x8 & anInt4673 ^ 0xffffffff) != -1;
    }
	
	public Class377() {
		/* empty */
	}
	
	static final boolean method4127(int i, int i_6_, int i_7_) {
		if (i_6_ != -31997) {
			return false;
		}
		anInt4672++;
		return false;
	}
	
	static {
		aClass318_4663 = new OutcommingPacket(52, 8);
		aClass379_4675 = new Class379();
	}
}
