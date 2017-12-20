/* Class188_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class188_Sub1_Sub1 extends Class188_Sub1
{
	static String aString9327;
	static int anInt9328;
	static int anInt9329;
	static int[] anIntArray9330;
	static float[] aFloatArray9331 = { 0.0F, -1.0F, 0.0F, 0.0F };
	static int anInt9332;
	static int anInt9333;
	static byte[][] aByteArrayArray9334;
	private byte[] aByteArray9335;
	static int anInt9336;
	static int anInt9337;
	static int anInt9338;
	static int[] anIntArray9339;
	
	final void method1891(int i, byte b, byte b_0_) {
		anInt9336++;
		int i_1_ = 2 * i;
		aByteArray9335[i_1_++] = (byte) -1;
		if (b_0_ > 77) {
			int i_2_ = b & 0xff;
			aByteArray9335[i_1_] = (byte) (3 * i_2_ >> 5);
		}
	}
	
	public Class188_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
	
	public static void method1893(int i) {
		aByteArrayArray9334 = null;
		aFloatArray9331 = null;
		if (i == 2) {
			aString9327 = null;
			anIntArray9339 = null;
			anIntArray9330 = null;
		}
	}
	
	static final boolean method1894(int i, byte b, int i_3_) {
		if (b > -2) {
			method1894(-122, (byte) 40, -50);
		}
		anInt9328++;
		return Class262_Sub16.method3193(i_3_, i, (byte) 111) & Class179.method1817(-1, i_3_, i);
	}
	
	static final void method1895(int moveLocalX, boolean bool, int speed2, byte b, int moveZ, int moveLocalY, int speed1) {
		Class194.anInt2370 = moveZ;
		@SuppressWarnings("unused")
		int i_8_ = 61 / ((-57 - b) / 60);
		Class169_Sub3.anInt8821 = speed2;
		anInt9338++;
		ItemDefinitions.anInt1858 = speed1;
		Node_Sub38_Sub38.anInt10490 = moveLocalY;
		Renderer.anInt3663 = moveLocalX;
		if (bool && (ItemDefinitions.anInt1858 ^ 0xffffffff) <= -101) {
			Class98.anInt5061 = Renderer.anInt3663 * 512 + 256;
			Node_Sub10.anInt7079 = Node_Sub38_Sub38.anInt10490 * 512 - -256;
			Class190.anInt2331 = Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Node_Sub10.anInt7079, Class98.anInt5061) - Class194.anInt2370;
		}
		Class320_Sub22.anInt8415 = 2;
		Class367.anInt4541 = Class368.anInt4551 = -1;
	}
	
	final byte[] method1896(int i, int i_9_, int i_10_, int i_11_) {
		if (i_11_ <= 5) {
			return null;
		}
		aByteArray9335 = new byte[i * i_9_ * i_10_ * 2];
		anInt9332++;
		this.method1884(i, (byte) -108, i_10_, i_9_);
		return aByteArray9335;
	}
	
	static {
		anIntArray9330 = new int[6];
		anInt9333 = 0;
		aString9327 = "";
		anIntArray9339 = new int[13];
	}
}
