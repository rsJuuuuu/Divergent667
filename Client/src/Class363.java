/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class363
{
	protected int[] anIntArray4501;
	static float aFloat4502;
	static int anInt4503;
	protected int anInt4504 = -1;
	static int[] anIntArray4505 = new int[256];
	protected int anInt4506 = -1;
	protected int[] anIntArray4507;
	protected int[] anIntArray4508;
	static double aDouble4509;
	static int anInt4510;
	
	static final void method4054(int i) {
		anInt4503++;
		if (i != -21619) {
			method4056(true);
		}
		Class229.aGraphicsToolkit2732.a(Animable.aFloat5932, Class69.aFloat944, Class39.aFloat580);
	}
	
	private final void method4055(int i, BufferedStream buffer) {
		if (i < 22) {
			method4054(87);
		}
		for (;;) {
			int i_0_ = buffer.readUnsignedByte();
			if (i_0_ == 0) {
				break;
			}
			if (i_0_ == 1) {
				int i_1_ = buffer.readUnsignedByte();
				anIntArray4508 = new int[i_1_];
				for (int i_2_ = 0; anIntArray4508.length > i_2_; i_2_++)
					anIntArray4508[i_2_] = buffer.readUnsignedByte();
			} else if ((i_0_ ^ 0xffffffff) == -4) {
				anInt4506 = buffer.readUnsignedByte();
			} else if ((i_0_ ^ 0xffffffff) != -5) {
				if (i_0_ != 5) {
					if (i_0_ == 6) {
						anIntArray4507 = new int[buffer.readUnsignedByte()];
						for (int i_3_ = 0; anIntArray4507.length > i_3_; i_3_++)
							anIntArray4507[i_3_] = buffer.readUnsignedByte();
					}
				} else {
					anIntArray4501 = new int[buffer.readUnsignedByte()];
					for (int i_4_ = 0; anIntArray4501.length > i_4_; i_4_++)
						anIntArray4501[i_4_] = buffer.readUnsignedByte();
				}
			} else {
				anInt4504 = buffer.readUnsignedByte();
			}
		}
		anInt4510++;
	}
	
	public static void method4056(boolean bool) {
		if (bool != true) {
			anIntArray4505 = null;
		}
		anIntArray4505 = null;
	}
	
	Class363(Index class302) {
		byte[] bs = class302.method3518((byte) 57, 6);
		method4055(99, new BufferedStream(bs));
		if (anIntArray4508 == null) {
			throw new RuntimeException("");
		}
	}
	
	protected Class363() {
		anIntArray4508 = new int[0];
	}
	
	static {
		for (int i = 0; i < 256; i++) {
			int i_5_ = i;
			for (int i_6_ = 0; i_6_ < 8; i_6_++) {
				if ((i_5_ & 0x1) == 1) {
					i_5_ = ~0x12477cdf ^ i_5_ >>> 1;
				} else {
					i_5_ >>>= 1;
				}
			}
			anIntArray4505[i] = i_5_;
		}
	}
}
