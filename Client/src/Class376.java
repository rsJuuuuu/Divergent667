/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class376
{
	static int anInt4658;
	static int anInt4659;
	static int[] anIntArray4660 = new int[1];
	static d aD4661;
	static int anInt4662;
	
	public static void method4117(int i) {
		aD4661 = null;
		int i_0_ = 73 % ((i - -26) / 51);
		anIntArray4660 = null;
	}
	
	static final void method4118(int i, String string) {
		anInt4659++;
		Class83.aString5186 = string;
		if (Class96.anApplet1270 != null) {
			try {
				String string_1_ = Class96.anApplet1270.getParameter("cookieprefix");
				if (i != 1) {
					method4117(119);
				}
				String string_2_ = Class96.anApplet1270.getParameter("cookiehost");
				String string_3_ = string_1_ + "settings=" + string + "; version=1; path=/; domain=" + string_2_;
				if (string.length() == 0) {
					string_3_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
				} else {
					string_3_ += "; Expires=" + Class93.method1043(94608000000L + Class313.method3650(false), i + 9) + "; Max-Age=" + 94608000L;
				}
				Class2.method168("document.cookie=\"" + string_3_ + "\"", Class96.anApplet1270, 30639);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
	
	static final void method4119(int i, int i_4_, int i_5_, int i_6_) {
		CacheNode_Sub11.aByteArrayArrayArray9550 = new byte[i_6_][i][i_5_];
		anInt4658++;
		if (i_4_ >= -120) {
			method4118(33, null);
		}
	}
}
