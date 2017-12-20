/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160
{
	static int anInt1997;
	static int anInt1998;
	static int anInt1999;
	static int[] anIntArray2000 = new int[3];
	static int anInt2001;
	
	static final void method1726(boolean bool) {
		Class243.username = Node_Sub5.password = "";
		if (bool == false) {
			anInt1998++;
		}
	}
	
	static final void method1727(boolean bool, byte b, boolean bool_0_) {
		if (b < 27) {
			method1728((byte) 87);
		}
		anInt1997++;
		if (bool_0_) {
			Class108.anInt5283--;
			if (Class108.anInt5283 == 0) {
				Class85.anIntArray1158 = null;
			}
		}
		if (bool) {
			Class233.anInt2783--;
			if (Class233.anInt2783 == 0) {
				Class170.anIntArray2054 = null;
			}
		}
	}
	
	public static void method1728(byte b) {
		if (b != -27) {
			method1727(false, (byte) -114, true);
		}
		anIntArray2000 = null;
	}
	
	static final void method1729(int i, BufferedStream buffer) {
		anInt2001++;
		int i_1_ = buffer.readSmart();
		Class320_Sub22.aClass46Array8418 = new Class46[i_1_];
		for (int i_2_ = i; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
			Class320_Sub22.aClass46Array8418[i_2_] = new Class46();
			Class320_Sub22.aClass46Array8418[i_2_].anInt675 = buffer.readSmart();
			Class320_Sub22.aClass46Array8418[i_2_].aString678 = buffer.method2180((byte) -118);
		}
		Mobile_Sub4.anInt10972 = buffer.readSmart();
		Node_Sub9_Sub5.anInt9757 = buffer.readSmart();
		Class254.anInt3212 = buffer.readSmart();
		Class56.aClass377_Sub1Array841 = new Class377_Sub1[Node_Sub9_Sub5.anInt9757 + -Mobile_Sub4.anInt10972 + 1];
		for (int i_3_ = 0; (Class254.anInt3212 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
			int i_4_ = buffer.readSmart();
			Class377_Sub1 class377_sub1 = Class56.aClass377_Sub1Array841[i_4_] = new Class377_Sub1();
			class377_sub1.anInt4674 = buffer.readUnsignedByte();
			class377_sub1.anInt4673 = buffer.readInt();
			class377_sub1.anInt8777 = Mobile_Sub4.anInt10972 + i_4_;
			class377_sub1.aString8780 = buffer.method2180((byte) -32);
			class377_sub1.aString8773 = buffer.method2180((byte) -74);
		}
		Node_Sub38_Sub17.anInt10274 = buffer.readInt();
		Mobile.aBoolean9118 = true;
	}
	
	static final void method1730(int i) {
		Class262_Sub23.method3212(false, 1295);
		anInt1999++;
		@SuppressWarnings("unused")
		int i_5_ = -22 / ((24 - i) / 34);
		if (CacheNode_Sub8.anInt9493 >= 0 && (CacheNode_Sub8.anInt9493 ^ 0xffffffff) != -1) {
			Class22.method300(CacheNode_Sub8.anInt9493, true, false);
			CacheNode_Sub8.anInt9493 = -1;
		}
	}
}
