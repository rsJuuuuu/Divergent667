/* Class320_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub12 extends Class320
{
	static int anInt8316;
	static int anInt8317;
	static int anInt8318;
	static int anInt8319;
	static int anInt8320;
	static int anInt8321;
	static int anInt8322;
	static int anInt8323;
	static Class251 aClass251_8324 = new Class251(2);
	static boolean aBoolean8325 = false;
	static Index aClass302_8326;
	static int anInt8327 = 0;
	
	final boolean method3726(byte b) {
		anInt8320++;
		if (aNode_Sub27_4063.method2697(-82)) {
			return false;
		}
		if (b < 63) {
			method3676(false, -32);
		}
        return aNode_Sub27_4063.aClass320_Sub30_7275.method3796(false) != 0;
    }
	
	static final void method3727(Class121 class121, byte b, int i, int i_0_, int i_1_, int i_2_) {
		anInt8318++;
		@SuppressWarnings("unused")
		int i_3_ = -41 / ((-70 - b) / 56);
		Node_Sub19 node_sub19 = null;
		for (Node_Sub19 node_sub19_4_ = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(65280); node_sub19_4_ != null; node_sub19_4_ = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620(16776960)) {
			if (node_sub19_4_.anInt7165 == i && node_sub19_4_.anInt7171 == i_1_ && (node_sub19_4_.anInt7161 ^ 0xffffffff) == (i_2_ ^ 0xffffffff) && (i_0_ ^ 0xffffffff) == (node_sub19_4_.anInt7166 ^ 0xffffffff)) {
				node_sub19 = node_sub19_4_;
				break;
			}
		}
		if (node_sub19 == null) {
			node_sub19 = new Node_Sub19();
			node_sub19.anInt7165 = i;
			node_sub19.anInt7171 = i_1_;
			node_sub19.anInt7161 = i_2_;
			node_sub19.anInt7166 = i_0_;
			Class262_Sub8.aClass312_7755.method3625((byte) -54, node_sub19);
		}
		node_sub19.aBoolean7156 = false;
		node_sub19.aClass121_7160 = class121;
		node_sub19.aBoolean7159 = true;
	}
	
	Class320_Sub12(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	final int method3677(int i) {
		if (i != 0) {
			method3728(89);
		}
		anInt8321++;
		return 2;
	}
	
	static final void method3728(int i) {
		anInt8317++;
		int i_5_ = 0;
		if (Class213.aNode_Sub27_2512.aClass320_Sub24_7317.method3773(false) == 1) {
			i_5_ |= 0x1;
			i_5_ |= 0x10;
			i_5_ |= 0x20;
			i_5_ |= 0x2;
			i_5_ |= 0x4;
		}
		if (i == Class213.aNode_Sub27_2512.aClass320_Sub30_7275.method3796(false)) {
			i_5_ |= 0x40;
		}
		Class144_Sub2.method1633(-112, i_5_);
		Class186.aClass112_2256.method1147(i_5_, 29988);
		EntityNode_Sub3_Sub1.aClass86_9166.method1005(i_5_, -64);
		Class366.aClass279_4526.method3377(false, i_5_);
		Class16.aClass101_228.method1091((byte) -52, i_5_);
		Class26.method313((byte) -85, i_5_);
		ProducingGraphicsBuffer.method2604(i + 2, i_5_);
		Class282.method3387(i + -25116, i_5_);
		Class98.method1081(i_5_, (byte) -68);
		Class243.method3061(i + 7);
	}
	
	final void method3676(boolean bool, int i) {
		anInt8319++;
		anInt4064 = i;
		if (bool != false) {
			aClass251_8324 = null;
		}
	}
	
	public static void method3729(byte b) {
		if (b <= 36) {
			method3727(null, (byte) 13, -123, 102, -91, -121);
		}
		aClass251_8324 = null;
		aClass302_8326 = null;
	}
	
	final int method3730(boolean bool) {
		if (bool != false) {
			return 109;
		}
		anInt8322++;
		return anInt4064;
	}
	
	Class320_Sub12(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3675(int i, byte b) {
		anInt8323++;
		if (aNode_Sub27_4063.method2697(-89)) {
			return 3;
		}
		if (b != 54) {
			aBoolean8325 = false;
		}
		if (aNode_Sub27_4063.aClass320_Sub30_7275.method3796(false) == 0) {
			return 3;
		}
		return 1;
	}
	
	final void method3673(byte b) {
		if (b >= -35) {
			aClass251_8324 = null;
		}
		if (aNode_Sub27_4063.method2697(-126)) {
			anInt4064 = 0;
		}
		anInt8316++;
		if ((aNode_Sub27_4063.aClass320_Sub30_7275.method3796(false) ^ 0xffffffff) == -1) {
			anInt4064 = 0;
		}
		if ((anInt4064 ^ 0xffffffff) > -1 || anInt4064 > 2) {
			anInt4064 = method3677(0);
		}
	}
}
