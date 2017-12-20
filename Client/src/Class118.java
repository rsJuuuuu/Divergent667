/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class118 implements Interface17
{
	static int anInt5404;
	static int anInt5405 = 0;
	static int anInt5406 = 0;
	static int anInt5407 = 0;
	static int anInt5408;
	static int anInt5409;
	static int anInt5410;
	static int anInt5411;
	
	static final boolean method1175(byte[] bs, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt5411++;
		boolean bool = true;
		BufferedStream buffer = new BufferedStream(bs);
		int i_4_ = i;
		for (;;) {
			int i_5_ = buffer.readSmart2(true);
			if (i_5_ == 0) {
				break;
			}
			i_4_ += i_5_;
			int i_6_ = 0;
			boolean bool_7_ = false;
			for (;;) {
				if (bool_7_) {
					int i_8_ = buffer.readSmart();
					if (i_8_ == 0) {
						break;
					}
					buffer.readUnsignedByte();
				} else {
					int i_9_ = buffer.readSmart();
					if ((i_9_ ^ 0xffffffff) == -1) {
						break;
					}
					i_6_ += -1 + i_9_;
					int i_10_ = 0x3f & i_6_;
					int i_11_ = 0x3f & i_6_ >> 6;
					int i_12_ = buffer.readUnsignedByte() >> 2;
					int i_13_ = i_0_ + i_11_;
					int i_14_ = i_10_ + i_2_;
					if ((i_13_ ^ 0xffffffff) < -1 && i_14_ > 0 && (-1 + i_1_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff) && (-1 + i_3_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
						ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(i_4_, i + 110);
						if (i_12_ != 22 || Class213.aNode_Sub27_2512.aClass320_Sub6_7267.method3701(false) != 0 || (objectdefinition.anInt3057 ^ 0xffffffff) != -1 || (objectdefinition.anInt3010 ^ 0xffffffff) == -2 || objectdefinition.aBoolean3051) {
							bool_7_ = true;
							if (!objectdefinition.method3039(82)) {
								bool = false;
								Node_Sub2.anInt6937++;
							}
						}
					}
				}
			}
		}
		return bool;
	}
	
	Class118() {
		/* empty */
	}
	
	public final int method65(int i, int i_15_) {
		@SuppressWarnings("unused")
		int i_16_ = 60 % ((56 - i_15_) / 44);
		anInt5409++;
		Node_Sub32 node_sub32 = (Node_Sub32) Class18.aHashTable308.method1518(3512, (long) i);
		if (node_sub32 == null) {
			return Class24.aClass275_442.method65(i, -107);
		}
		return node_sub32.anInt7381;
	}
	
	public final int method64(int i, byte b) {
		anInt5408++;
		Node_Sub32 node_sub32 = (Node_Sub32) Class18.aHashTable308.method1518(b ^ ~0xd91, (long) i | 0x100000000L);
		if (b != -42) {
			method1175(null, -67, -10, 88, -118, -60);
		}
		if (node_sub32 == null) {
			return Class24.aClass275_442.method64(i, (byte) -42);
		}
		return node_sub32.anInt7381;
	}
}
