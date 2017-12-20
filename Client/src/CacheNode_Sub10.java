/* CacheNode_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub10 extends CacheNode
{
	static int anInt9514;
	private int[][] anIntArrayArray9515;
	protected Class109 aClass109_9516;
	static int anInt9517;
	private int[] anIntArray9518;
	static int anInt9519;
	static int[] anIntArray9520 = new int[32];
	protected boolean aBoolean9521 = true;
	protected int[] anIntArray9522;
	static int anInt9523;
	static int anInt9524;
	static int anInt9525;
	static int anInt9526;
	static int anInt9527;
	static int anInt9528;
	private String[] aStringArray9529;
	static HashTable aHashTable9530 = new HashTable(8);
	
	final Class151 method2324(int i, int i_0_) {
		anInt9526++;
		@SuppressWarnings("unused")
		int i_1_ = 19 % ((43 - i) / 62);
		if (anIntArray9518 == null || (i_0_ ^ 0xffffffff) > -1 || (i_0_ ^ 0xffffffff) < (anIntArray9518.length ^ 0xffffffff)) {
			return null;
		}
		return Class240.method3028((byte) 31, anIntArray9518[i_0_]);
	}
	
	final void method2325(BufferedStream buffer, int i) {
		for (;;) {
			int i_2_ = buffer.readUnsignedByte();
			if (i_2_ == 0) {
				break;
			}
			method2333(buffer, i + 958, i_2_);
		}
		if (i != -958) {
			method2328(-6);
		}
		anInt9514++;
	}
	
	final int method2326(int i, boolean bool, int i_3_) {
		anInt9523++;
		if (anIntArray9518 == null || (i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < (anIntArray9518.length ^ 0xffffffff)) {
			return -1;
		}
		if (anIntArrayArray9515[i] == null || i_3_ < 0 || (i_3_ ^ 0xffffffff) < (anIntArrayArray9515[i].length ^ 0xffffffff)) {
			return -1;
		}
		if (bool != true) {
			method2326(68, true, 121);
		}
		return anIntArrayArray9515[i][i_3_];
	}
	
	final int method2327(byte b) {
		anInt9519++;
		if (b <= 31) {
			return 39;
		}
		if (anIntArray9518 == null) {
			return 0;
		}
		return anIntArray9518.length;
	}
	
	final void method2328(int i) {
		anInt9527++;
		if (anIntArray9522 != null) {
			for (int i_4_ = 0; i_4_ < anIntArray9522.length; i_4_++)
				anIntArray9522[i_4_] = Node_Sub16.method2590(anIntArray9522[i_4_], 32768);
		}
		if (i < 0) {
			method2327((byte) -55);
		}
	}
	
	final String method2329(byte b, BufferedStream buffer) {
		anInt9525++;
		StringBuffer stringbuffer = new StringBuffer(80);
		if (anIntArray9518 != null) {
			for (int i = 0; (i ^ 0xffffffff) > (anIntArray9518.length ^ 0xffffffff); i++) {
				stringbuffer.append(aStringArray9529[i]);
				stringbuffer.append(aClass109_9516.method1126(method2324(-28, i), buffer.method2244(Class240.method3028((byte) 9, anIntArray9518[i]).anInt1847, 8), anIntArrayArray9515[i], 1));
			}
		}
		if (b != -49) {
			aStringArray9529 = null;
		}
		//stringbuffer.append(aStringArray9529[-1 + aStringArray9529.length]);
		return stringbuffer.toString();
	}
	
	final void method2330(BufferedStream buffer, int[] is, int i) {
		anInt9524++;
		if (anIntArray9518 != null && i >= 118) {
			for (int i_5_ = 0; anIntArray9518.length > i_5_ && is.length > i_5_; i_5_++) {
				int i_6_ = method2324(105, i_5_).anInt1846;
				if ((i_6_ ^ 0xffffffff) < -1) {
					buffer.method2206((byte) 126, i_6_, (long) is[i_5_]);
				}
			}
		}
	}
	
	public static void method2331(int i) {
		anIntArray9520 = null;
		aHashTable9530 = null;
		if (i != 1) {
			aHashTable9530 = null;
		}
	}
	
	final String method2332(int i) {
		anInt9528++;
		StringBuffer stringbuffer = new StringBuffer(80);
		if (aStringArray9529 == null) {
			return "";
		}
		stringbuffer.append(aStringArray9529[0]);
		if (i != -19244) {
			anIntArray9520 = null;
		}
		for (int i_7_ = 1; aStringArray9529.length > i_7_; i_7_++) {
			stringbuffer.append("...");
			stringbuffer.append(aStringArray9529[i_7_]);
		}
		return stringbuffer.toString();
	}
	
	private final void method2333(BufferedStream buffer, int i, int i_8_) {
		anInt9517++;
		if ((i_8_ ^ 0xffffffff) != -2) {
			if ((i_8_ ^ 0xffffffff) == -3) {
				int i_9_ = buffer.readUnsignedByte();
				anIntArray9522 = new int[i_9_];
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_10_++)
					anIntArray9522[i_10_] = buffer.readUnsignedShort();
			} else if ((i_8_ ^ 0xffffffff) == -4) {
				int i_11_ = buffer.readUnsignedByte();
				anIntArrayArray9515 = new int[i_11_][];
				anIntArray9518 = new int[i_11_];
				for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++) {
					int i_13_ = buffer.readUnsignedShort();
					Class151 class151 = Class240.method3028((byte) 84, i_13_);
					if (class151 != null) {
						anIntArray9518[i_12_] = i_13_;
						anIntArrayArray9515[i_12_] = new int[class151.anInt1842];
						for (int i_14_ = 0; (class151.anInt1842 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
							anIntArrayArray9515[i_12_][i_14_] = buffer.readUnsignedShort();
					}
				}
			} else if (i_8_ == 4) {
				aBoolean9521 = false;
			}
		} else {
			aStringArray9529 = Class106.method1120((byte) -102, buffer.readString(), '<');
		}
		if (i != 0) {
			method2326(21, true, -113);
		}
	}
}
