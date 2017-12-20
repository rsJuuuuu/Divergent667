/* Class262_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub2 extends Class262
{
	static int anInt7705;
	private int anInt7706;
	static Index index31;
	static int anInt7708;
	static int anInt7709;
	static int anInt7710;
	
	static final void method3152(byte b) {
		if (b == -32) {
			anInt7709++;
			Class335.aClass61_4161.method608(false);
		}
	}
	
	Class262_Sub2(BufferedStream buffer) {
		super(buffer);
		anInt7706 = buffer.readUnsignedShort();
	}
	
	static final void method3153(int i, int i_0_, int i_1_, int i_2_, Class77 class77, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class379 class379, int i_8_) {
		Class9.anInt165 = i_4_;
		CacheNode_Sub7.anInt9487 = i_6_;
		Class168.anInt2043 = i_3_;
		Class359.anInt4464 = i_1_;
		Class223.aClass383_2664 = null;
		anInt7708++;
		Class336_Sub2.aClass77_8568 = class77;
		Class245.anInt3102 = i_5_;
		Class336_Sub3.aClass383_8624 = null;
		Class169_Sub4.anInt8831 = i_8_;
		Class262_Sub4.aClass379_7731 = class379;
		CacheNode_Sub18.anInt9604 = i_0_;
		Class193.anInt2363 = i;
		Class44.aClass383_667 = null;
		Class180.anInt2133 = i_2_;
		Node_Sub6.method2419(99);
		Class262_Sub16.aBoolean7830 = true;
		@SuppressWarnings("unused")
		int i_9_ = -16 % ((44 - i_7_) / 54);
	}
	
	public static void method3154(boolean bool) {
		if (bool != false) {
			index31 = null;
		}
		index31 = null;
	}
	
	static final boolean method3155(int i, byte b) {
		if (b != -18) {
			index31 = null;
		}
		anInt7710++;
        return !((i ^ 0xffffffff) != -3 && i != 22 && i != 52 && i != 30 && i != 53 && i != 9 && i != 51 && i != 15 && i != 48 && (i ^ 0xffffffff) != -17 && (i ^ 0xffffffff) != -45);
    }
	
	final void method3148(int i) {
		anInt7705++;
		if (i >= -102) {
			method3155(-111, (byte) 35);
		}
		Node_Sub39.aClass369Array7497[anInt7706].method4082((byte) -115);
	}
}
