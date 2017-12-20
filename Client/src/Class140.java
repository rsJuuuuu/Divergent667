/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class140
{
	static int anInt1732;
	protected Class338 aClass338_1733;
	static int anInt1734;
	static int anInt1735;
	static int anInt1736;
	protected int anInt1737;
	static int anInt1738;
	static boolean[] aBooleanArray1739 = new boolean[8];
	protected int anInt1740;
	protected boolean aBoolean1741 = false;
	
	final GLSprite method1606(int i, GraphicsToolkit graphicstoolkit, boolean bool, int i_0_) {
		anInt1736++;
		long l = (long) (graphicstoolkit.anInt1537 << 19 | ((bool ? 262144 : 0) | (i << 16 | anInt1740)));
		GLSprite glsprite = (GLSprite) aClass338_1733.aClass61_4200.method607(l, 0);
		if (glsprite != null) {
			return glsprite;
		}
		if (!aClass338_1733.aClass302_4193.method3510(anInt1740, (byte) 63)) {
			return null;
		}
		Class383 class383 = Class383.method4194(aClass338_1733.aClass302_4193, anInt1740, i_0_);
		if (class383 != null) {
			class383.anInt4899 = class383.anInt4902 = class383.anInt4901 = class383.anInt4898 = 0;
			if (bool) {
				class383.method4189();
			}
			for (int i_1_ = 0; (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
				class383.method4198();
		}
		glsprite = graphicstoolkit.a(class383, true);
		if (glsprite != null) {
			aClass338_1733.aClass61_4200.method601(glsprite, i_0_ + 25566, l);
		}
		return glsprite;
	}
	
	final boolean method1607(byte b) {
		if (b <= 21) {
			return true;
		}
		anInt1738++;
		return aClass338_1733.aClass302_4193.method3510(anInt1740, (byte) 63);
	}
	
	private final void method1608(int i, int i_2_, BufferedStream buffer) {
		if ((i_2_ ^ 0xffffffff) != -2) {
			if (i_2_ != 2) {
				if ((i_2_ ^ 0xffffffff) == -4) {
					aBoolean1741 = true;
				} else if ((i_2_ ^ 0xffffffff) == -5) {
					anInt1740 = -1;
				}
			} else {
				anInt1737 = buffer.read24BitInteger();
			}
		} else {
			anInt1740 = buffer.readUnsignedShort();
		}
		if (i > -17) {
			aBoolean1741 = true;
		}
		anInt1732++;
	}
	
	public static void method1609(int i) {
		aBooleanArray1739 = null;
		if (i > -109) {
			method1609(-69);
		}
	}
	
	static final void method1610(int i, String string, String string_3_, SignLink signlink, boolean bool, boolean bool_4_) {
		if (i != 0) {
			method1610(-9, null, null, null, false, true);
		}
		anInt1734++;
		if (bool_4_) {
			if (SignLink.aString3981.startsWith("win") && signlink.aBoolean4005) {
				String string_5_ = null;
				if (Class96.anApplet1270 != null) {
					string_5_ = Class96.anApplet1270.getParameter("haveie6");
				}
				if (string_5_ == null || !string_5_.equals("1")) {
					Class241 class241 = Class343.method3962(string, -106, 0, signlink);
					Class146.aSignLink1813 = signlink;
					Class179.aString2123 = string;
					Class194_Sub3_Sub1.aClass241_9377 = class241;
					return;
				}
			}
			if (SignLink.aString3981.startsWith("mac")) {
				String string_6_ = null;
				if (Class96.anApplet1270 != null) {
					string_6_ = Class96.anApplet1270.getParameter("havefirefox");
				}
				if (string_6_ != null && string_6_.equals("1") && bool) {
					Class188_Sub2_Sub1.method1910((byte) 84, signlink, string, string_3_, 1);
					return;
				}
			}
			Class343.method3962(string, i ^ ~0x6a, 2, signlink);
		} else {
			Class343.method3962(string, i + -119, 3, signlink);
		}
	}
	
	final void method1611(BufferedStream buffer, int i) {
		anInt1735++;
		for (;;) {
			int i_7_ = buffer.readUnsignedByte();
			if (i_7_ == 0) {
				break;
			}
			method1608(-44, i_7_, buffer);
		}
		if (i != -32687) {
			method1610(-77, null, null, null, false, false);
		}
	}
}
