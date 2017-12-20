/* Class262_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub18 extends Class262
{
	static int anInt7840;
	private int anInt7841;
	static Class61 aClass61_7842 = new Class61(8);
	static int anInt7843;
	private int anInt7844;
	private int anInt7845;
	private int anInt7846;
	private int anInt7847;
	private int anInt7848;
	static Class335 aClass335_7849 = new Class335(16);
	static Class170 aClass170_7850 = new Class170(5, 1);
	
	static final int method3198(String string, boolean bool) {
		anInt7843++;
		for (int i = 0; i < (i ^ 0xffffffff); i++) {
			if ("".equalsIgnoreCase(string)) {
				return i;
			}
		}
		if (bool != false) {
			method3199((byte) 81);
		}
		return -1;
	}
	
	public static void method3199(byte b) {
		if (b <= 72) {
			method3199((byte) -91);
		}
		aClass335_7849 = null;
		aClass61_7842 = null;
		aClass170_7850 = null;
	}
	
	final void method3148(int i) {
		Class194_Sub1.aClass331Array6894[anInt7845].method3840(0, 2);
		anInt7840++;
		Class194_Sub1.aClass331Array6894[anInt7847].method3840(1, 2);
		Node_Sub6.anInt7056 = anInt7841;
		Class109.anInt1367 = 0;
		Class203.anInt2452 = 1;
		Class320_Sub22.anInt8415 = 3;
		Class141.anInt1758 = 0;
		Class66_Sub2_Sub1.anInt10582 = anInt7846;
		Class290_Sub5.anInt8107 = anInt7844;
		if (i >= -102) {
			anInt7841 = -102;
		}
		Class221.anInt2633 = anInt7848;
		Class309.method3586(117);
		Class320_Sub18.aBoolean8375 = true;
	}
	
	Class262_Sub18(BufferedStream buffer) {
		super(buffer);
		anInt7845 = buffer.readUnsignedShort();
		anInt7847 = buffer.readUnsignedShort();
		anInt7844 = buffer.readUnsignedShort();
		anInt7846 = buffer.readUnsignedShort();
		anInt7841 = buffer.readUnsignedShort();
		anInt7848 = buffer.readUnsignedShort();
	}
}
