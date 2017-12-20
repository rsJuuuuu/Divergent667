/* Class194_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class194_Sub1 extends Class194
{
	static int anInt6890;
	static int anInt6891;
	static boolean aBoolean6892 = true;
	static CacheNode_Sub13 aCacheNode_Sub13_6893;
	static Class331[] aClass331Array6894;
	static int anInt6895;
	
	static final int method1964(int i, int i_0_, int i_1_) {
		anInt6891++;
		if (i_1_ == -1) {
			return 12345678;
		}
		i = i * (0x7f & i_1_) >> 7;
		if (i >= 2) {
			if ((i ^ 0xffffffff) < -127) {
				i = 126;
			}
		} else {
			i = 2;
		}
		if (i_0_ != -14042) {
			aBoolean6892 = false;
		}
		return i + (i_1_ & 0xff80);
	}
	
	static final void method1965(byte b) {
		Class213.aNode_Sub27_2512.method2690(82, 1, Class213.aNode_Sub27_2512.aClass320_Sub19_7277);
		anInt6890++;
		Class213.aNode_Sub27_2512.method2690(28, 1, Class213.aNode_Sub27_2512.aClass320_Sub19_7301);
		Class213.aNode_Sub27_2512.method2690(61, 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7302);
		Class213.aNode_Sub27_2512.method2690(28, 1, Class213.aNode_Sub27_2512.aClass320_Sub4_7304);
		Class213.aNode_Sub27_2512.method2690(98, 1, Class213.aNode_Sub27_2512.aClass320_Sub6_7267);
		Class213.aNode_Sub27_2512.method2690(22, 1, Class213.aNode_Sub27_2512.aClass320_Sub23_7290);
		Class213.aNode_Sub27_2512.method2690(103, 0, Class213.aNode_Sub27_2512.aClass320_Sub27_7266);
		Class213.aNode_Sub27_2512.method2690(65, 0, Class213.aNode_Sub27_2512.aClass320_Sub8_7280);
		Class213.aNode_Sub27_2512.method2690(19, 0, Class213.aNode_Sub27_2512.aClass320_Sub7_7308);
		Class213.aNode_Sub27_2512.method2690(119, 0, Class213.aNode_Sub27_2512.aClass320_Sub12_7282);
		Class213.aNode_Sub27_2512.method2690(76, 0, Class213.aNode_Sub27_2512.aClass320_Sub30_7275);
		Class213.aNode_Sub27_2512.method2690(71, 0, Class213.aNode_Sub27_2512.aClass320_Sub24_7317);
		if (b >= -91) {
			method1966((byte) 82, null);
		}
		Class213.aNode_Sub27_2512.method2690(39, 0, Class213.aNode_Sub27_2512.aClass320_Sub26_7269);
		Class213.aNode_Sub27_2512.method2690(78, 0, Class213.aNode_Sub27_2512.aClass320_Sub16_7316);
		Class213.aNode_Sub27_2512.method2690(115, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7284);
		Class213.aNode_Sub27_2512.method2690(106, 0, Class213.aNode_Sub27_2512.aClass320_Sub13_7283);
		Class213.aNode_Sub27_2512.method2690(66, 0, Class213.aNode_Sub27_2512.aClass320_Sub28_7305);
		Class213.aNode_Sub27_2512.method2690(119, 0, Class213.aNode_Sub27_2512.aClass320_Sub5_7297);
		Class213.aNode_Sub27_2512.method2690(124, 0, Class213.aNode_Sub27_2512.aClass320_Sub20_7306);
		Class213.aNode_Sub27_2512.method2690(82, 0, Class213.aNode_Sub27_2512.aClass320_Sub2_7272);
		Class204.method2030((byte) 125);
		Class213.aNode_Sub27_2512.method2690(121, 2, Class213.aNode_Sub27_2512.aClass320_Sub18_7303);
		Class213.aNode_Sub27_2512.method2690(105, 2, Class213.aNode_Sub27_2512.aClass320_Sub15_7273);
		Class320_Sub12.method3728(0);
		Class120.method1228(-109);
		Class152.aBoolean1942 = true;
	}
	
	static final Class144_Sub2 method1966(byte b, BufferedStream buffer) {
		anInt6895++;
		@SuppressWarnings("unused")
		int i = 33 / ((-52 - b) / 45);
		return new Class144_Sub2(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.read24BitInteger(), buffer.read24BitInteger(), buffer.readUnsignedByte());
	}
	
	public static void method1967(int i) {
		if (i == -11840) {
			aClass331Array6894 = null;
			aCacheNode_Sub13_6893 = null;
		}
	}
}
