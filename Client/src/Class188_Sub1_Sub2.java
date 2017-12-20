/* Class188_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class188_Sub1_Sub2 extends Class188_Sub1
{
	private byte[] aByteArray9340;
	static int anInt9341;
	static long aLong9342 = 0L;
	static int anInt9343;
	static int anInt9344;
	static int[] anIntArray9345;
	static float aFloat9346;
	static int anInt9347;
	static int anInt9348;
	static int anInt9349;
	
	static final void method1897(int i, int[][] is) {
		anInt9343++;
		if (i != 1) {
			method1897(116, null);
		}
		Class169_Sub4.anIntArrayArray8826 = is;
	}
	
	public Class188_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
	
	final byte[] method1898(int i, int i_0_, int i_1_, int i_2_) {
		anInt9347++;
		if (i_2_ < 5) {
			method1891(107, (byte) 11, (byte) -28);
		}
		aByteArray9340 = new byte[i_1_ * i_0_ * i * 2];
		this.method1884(i, (byte) 77, i_1_, i_0_);
		return aByteArray9340;
	}
	
	static final boolean method1899(int i, byte b, String string) {
		anInt9341++;
		if (b != 27) {
			anIntArray9345 = null;
		}
		if (Class240.aSignLink2946.aBoolean4005) {
			Class181.aClass197_2155 = new Class197();
			Class181.aClass197_2155.id = i;
			Class181.aClass197_2155.ipadress = string;
			if (Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943) {
				Class181.aClass197_2155.firstPort = Settings.PORT_ID;//40000 + Class181.aClass197_2155.npcId;
				Class181.aClass197_2155.secondPort = 50000 - -Class181.aClass197_2155.id;
			}
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class180.aClass377_Sub1Array2143.length ^ 0xffffffff); i_3_++) {
				if (Class180.aClass377_Sub1Array2143[i_3_].anInt8777 == i) {
					Class380.anInt4877 = Class180.aClass377_Sub1Array2143[i_3_].anInt4673;
				}
			}
			return true;
		}
		String string_4_ = "";
		if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
			string_4_ = ":" + (i - -7000);
		}
		String string_5_ = "";
		if (Class83.aString5186 != null) {
			string_5_ = "/p=" + Class83.aString5186;
		}
		String string_6_ = "http://" + string.replace("runescape", Settings.SERVER_NAME) + string_4_ + "/l=" + Class35.language + "/a=" + Class170.anInt2056 + string_5_ + "/j" + (Animable_Sub2_Sub1.aBoolean10628 ? "1" : "0") + ",o" + (Node_Sub38_Sub21.aBoolean10320 ? "1" : "0") + ",a2";
		try {
			Class158.aClient1983.getAppletContext().showDocument(new URL(string_6_), "_self");
		} catch (Exception exception) {
			return false;
		}
		return true;
	}
	
	static final void method1900(byte b) throws Exception_Sub1 {
		if (b != 2) {
			aLong9342 = 3L;
		}
		if (Class320_Sub20.anInt8397 == 1) {
			Class44.aGraphicsToolkit668.e(Node_Sub38_Sub1.anInt10075, Class166.anInt5100);
		} else {
			Class44.aGraphicsToolkit668.e(0, 0);
		}
		anInt9349++;
	}
	
	final void method1891(int i, byte b, byte b_7_) {
		anInt9344++;
		int i_8_ = i * 2;
		int i_9_ = b & 0xff;
		if (b_7_ < 77) {
			anIntArray9345 = null;
		}
		aByteArray9340[i_8_++] = (byte) (i_9_ * 3 >> 5);
		aByteArray9340[i_8_] = (byte) (i_9_ * 3 >> 5);
	}
	
	static final void method1901(String string, int i, int i_10_) {
		anInt9348++;
		Node_Sub38_Sub12.anInt10230++;
		Class123 class123 = Class262_Sub23.method3213((byte) -114);
		Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class229.aClass318_2731, class123.anIsaacCipher1571);
		node_sub13.aPacket7113.writeByte(1 - -Class126.method1536(-20826, string));
		node_sub13.aPacket7113.writeString(string);
		node_sub13.aPacket7113.writeByteC(i_10_);
		class123.sendPacket(126, node_sub13);
		@SuppressWarnings("unused")
		int i_11_ = 48 % ((i - 69) / 35);
	}
	
	public static void method1902(byte b) {
		anIntArray9345 = null;
		if (b >= -71) {
			aLong9342 = 106L;
		}
	}
}
