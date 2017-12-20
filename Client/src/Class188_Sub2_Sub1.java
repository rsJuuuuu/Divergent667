/* Class188_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class188_Sub2_Sub1 extends Class188_Sub2
{
	static int anInt9350;
	private byte[] aByteArray9351;
	static int anInt9352;
	static int anInt9353;
	static Class229 aClass229_9354;
	static int anInt9355;
	static IncommingPacket aClass192_9356 = new IncommingPacket(70, -2);
	static int anInt9357;
	static int anInt9358;
	
	public Class188_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
	
	final void method1905(byte b, int i, byte b_0_) {
		if (b != -11) {
			aByteArray9351 = null;
		}
		anInt9355++;
		b_0_ = (byte) ((b_0_ >> 1 & 0x7f) + 127);
		int i_1_ = i * 2;
		aByteArray9351[i_1_++] = b_0_;
		aByteArray9351[i_1_] = b_0_;
	}
	
	public static void method1906(byte b) {
		aClass229_9354 = null;
		if (b < 50) {
			aClass229_9354 = null;
		}
		aClass192_9356 = null;
	}
	
	static final void method1907(int i, byte b) {
		anInt9353++;
		CacheNode_Sub7.method2316(7);
		if (b >= 92) {
			int i_2_ = aClass229_9354.method2123(16, i).anInt3682;
			if (i_2_ != 0) {
				int i_3_ = Class24.aClass275_442.CONFIG_VALUES[i];
				if ((i_2_ ^ 0xffffffff) == -6) {
					Class121.anInt1521 = i_3_;
				}
				if (i_2_ == 6) {
					Class134_Sub1.anInt9014 = i_3_;
				}
			}
		}
	}
	
	static final int getDisplayMode(int i) {
		if (i != 3) {
			method1907(127, (byte) 11);
		}
		anInt9352++;
		if (DrawableModel.aFrame907 != null) {
			return 3;
		}
		if (!EntityNode.aBoolean1128) {
			return 1;
		}
		return 2;
	}
	
	final byte[] method1909(int i, int i_4_, int i_5_, int i_6_) {
		aByteArray9351 = new byte[i_4_ * (i_5_ * i_6_) * 2];
		if (i != 0) {
			method1905((byte) -98, -78, (byte) -84);
		}
		anInt9358++;
		this.method1884(i_4_, (byte) 53, i_6_, i_5_);
		return aByteArray9351;
	}
	
	static final Class241 method1910(byte b, SignLink signlink, String string, String string_7_, int i) {
		anInt9357++;
		string = string.replace("runescape", Settings.SERVER_NAME);
		if ((i ^ 0xffffffff) == -1) {
			return signlink.method3636(string, (byte) 95);
		}
		if ((i ^ 0xffffffff) == -2) {
			try {
				Object object = Class2.method166((byte) -37, Class96.anApplet1270, string_7_, new Object[] { new URL(Class96.anApplet1270.getCodeBase(), string).toString() });
				if (object == null) {
					throw new RuntimeException();
				}
				Class241 class241 = new Class241();
				class241.anInt2953 = 1;
				return class241;
			} catch (Throwable throwable) {
				Class241 class241 = new Class241();
				class241.anInt2953 = 2;
				return class241;
			}
		}
		if (b != 84) {
			method1906((byte) -58);
		}
		if (i == 2) {
			try {
		//		Class96.anApplet1270.getAppletContext().showDocument(new URL("http://matrixforum.webatu.com/"), "showthread.php?tid=2");
				Class241 class241 = new Class241();
				class241.anInt2953 = 1;
				return class241;
			} catch (Exception exception) {
				Class241 class241 = new Class241();
				class241.anInt2953 = 2;
				return class241;
			}
		}
		if (i == 3) {
			try {
				Class2.method167("loggedout", Class96.anApplet1270, (byte) -88);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
			//	Class96.anApplet1270.getAppletContext().showDocument(new URL(Class96.anApplet1270.getCodeBase(), string), "_top");
				Class241 class241 = new Class241();
				class241.anInt2953 = 1;
				return class241;
			} catch (Exception exception) {
				Class241 class241 = new Class241();
				class241.anInt2953 = 2;
				return class241;
			}
		}
		throw new IllegalArgumentException();
	}
}
