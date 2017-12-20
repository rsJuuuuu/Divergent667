/* Archive - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class ReferenceTable
{
	static Random aRandom283 = new Random();
	static GLSprite[] aGLSpriteArray284;
	protected int[] anIntArray285;
	static int anInt286;
	protected int[] anIntArray287;
	protected Class75[] aClass75Array288;
	private byte[] aByteArray289;
	protected int[][] anIntArrayArray290;
	protected int anInt291;
	protected int anInt292;
	protected int[] anIntArray293;
	protected int anInt294;
	protected int[] anIntArray295;
	protected int anInt296;
	static int anInt297;
	protected byte[][] aByteArrayArray298;
	protected int[] anIntArray299;
	protected int[] anIntArray300;
	protected Class75 aClass75_301;
	static int anInt302;
	protected int[][] anIntArrayArray303;
	
	private final void method263(byte[] bs, boolean bool) {
		anInt297++;
		BufferedStream buffer = new BufferedStream(Node_Sub38_Sub26.method2875(bs, (byte) -104));
		int i = buffer.readUnsignedByte();
		if ((i ^ 0xffffffff) > -6 || i > 7) {
			throw new RuntimeException();
		}
		if ((i ^ 0xffffffff) <= -7) {
			anInt292 = buffer.readInt();
		} else {
			anInt292 = 0;
		}
		int i_0_ = buffer.readUnsignedByte();
		boolean bool_1_ = (0x1 & i_0_) != 0;
		boolean bool_2_ = (0x2 & i_0_ ^ 0xffffffff) != -1;
		if (i >= 7) {
			anInt294 = buffer.readBigSmart();
		} else {
			anInt294 = buffer.readUnsignedShort();
		}
		int i_3_ = 0;
		int i_4_ = -1;
		anIntArray300 = new int[anInt294];
		if ((i ^ 0xffffffff) <= -8) {
			for (int i_5_ = 0; anInt294 > i_5_; i_5_++) {
				anIntArray300[i_5_] = i_3_ += buffer.readBigSmart();
				if ((anIntArray300[i_5_] ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
					i_4_ = anIntArray300[i_5_];
				}
			}
		} else {
			for (int i_6_ = 0; (anInt294 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
				anIntArray300[i_6_] = i_3_ += buffer.readUnsignedShort();
				if ((i_4_ ^ 0xffffffff) > (anIntArray300[i_6_] ^ 0xffffffff)) {
					i_4_ = anIntArray300[i_6_];
				}
			}
		}
		anInt296 = i_4_ - -1;
		anIntArray299 = new int[anInt296];
		if (bool_2_) {
			aByteArrayArray298 = new byte[anInt296][];
		}
		anIntArray293 = new int[anInt296];
		anIntArray285 = new int[anInt296];
		anIntArray295 = new int[anInt296];
		anIntArrayArray290 = new int[anInt296][];
		if (bool_1_) {
			anIntArray287 = new int[anInt296];
			for (int i_7_ = 0; (anInt296 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++)
				anIntArray287[i_7_] = -1;
			for (int i_8_ = 0; (anInt294 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
				anIntArray287[anIntArray300[i_8_]] = buffer.readInt();
			aClass75_301 = new Class75(anIntArray287);
		}
		for (int i_9_ = 0; (anInt294 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
			anIntArray299[anIntArray300[i_9_]] = buffer.readInt();
		if (bool_2_) {
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (anInt294 ^ 0xffffffff); i_10_++) {
				byte[] bs_11_ = new byte[64];
				buffer.readBytes(bs_11_, 0, 64);
				aByteArrayArray298[anIntArray300[i_10_]] = bs_11_;
			}
		}
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (anInt294 ^ 0xffffffff); i_12_++)
			anIntArray293[anIntArray300[i_12_]] = buffer.readInt();
		if ((i ^ 0xffffffff) > -8) {
			for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (anInt294 ^ 0xffffffff); i_13_++)
				anIntArray295[anIntArray300[i_13_]] = buffer.readUnsignedShort();
			for (int i_14_ = 0; i_14_ < anInt294; i_14_++) {
				int i_15_ = anIntArray300[i_14_];
				i_3_ = 0;
				int i_16_ = anIntArray295[i_15_];
				int i_17_ = -1;
				anIntArrayArray290[i_15_] = new int[i_16_];
				for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
					int i_19_ = anIntArrayArray290[i_15_][i_18_] = i_3_ += buffer.readUnsignedShort();
					if ((i_17_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
						i_17_ = i_19_;
					}
				}
				anIntArray285[i_15_] = 1 + i_17_;
				if (i_16_ == i_17_ + 1) {
					anIntArrayArray290[i_15_] = null;
				}
			}
		} else {
			for (int i_20_ = 0; anInt294 > i_20_; i_20_++)
				anIntArray295[anIntArray300[i_20_]] = buffer.readBigSmart();
			for (int i_21_ = 0; (anInt294 ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
				int i_22_ = anIntArray300[i_21_];
				int i_23_ = anIntArray295[i_22_];
				i_3_ = 0;
				int i_24_ = -1;
				anIntArrayArray290[i_22_] = new int[i_23_];
				for (int i_25_ = 0; i_23_ > i_25_; i_25_++) {
					int i_26_ = anIntArrayArray290[i_22_][i_25_] = i_3_ += buffer.readBigSmart();
					if ((i_26_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
						i_24_ = i_26_;
					}
				}
				anIntArray285[i_22_] = i_24_ - -1;
				if (1 + i_24_ == i_23_) {
					anIntArrayArray290[i_22_] = null;
				}
			}
		}
		if (bool_1_) {
			aClass75Array288 = new Class75[1 + i_4_];
			anIntArrayArray303 = new int[1 + i_4_][];
			for (int i_27_ = 0; i_27_ < anInt294; i_27_++) {
				int i_28_ = anIntArray300[i_27_];
				int i_29_ = anIntArray295[i_28_];
				anIntArrayArray303[i_28_] = new int[anIntArray285[i_28_]];
				for (int i_30_ = 0; (anIntArray285[i_28_] ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++)
					anIntArrayArray303[i_28_][i_30_] = -1;
				for (int i_31_ = 0; (i_29_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++) {
					int i_32_;
					if (anIntArrayArray290[i_28_] != null) {
						i_32_ = anIntArrayArray290[i_28_][i_31_];
					} else {
						i_32_ = i_31_;
					}
					anIntArrayArray303[i_28_][i_32_] = buffer.readInt();
				}
				aClass75Array288[i_28_] = new Class75(anIntArrayArray303[i_28_]);
			}
		}
		if (bool != false) {
			method264(-19);
		}
	}
	
	public static void method264(int i) {
		aRandom283 = null;
		if (i < 108) {
			anInt286 = -16;
		}
		aGLSpriteArray284 = null;
	}
	
	ReferenceTable(byte[] bs, int i, byte[] bs_33_) {
		anInt291 = Class66_Sub2_Sub1.method728(bs.length, false, bs);
		if ((i ^ 0xffffffff) != (anInt291 ^ 0xffffffff)) {
			throw new RuntimeException();
		}
		if (bs_33_ != null) {
			if (bs_33_.length != 64) {
				throw new RuntimeException();
			}
			aByteArray289 = GLXToolkit.generateWhirpoolHash((byte) 119, bs, bs.length, 0);
			for (int i_34_ = 0; i_34_ < 64; i_34_++) {
				if ((bs_33_[i_34_] ^ 0xffffffff) != (aByteArray289[i_34_] ^ 0xffffffff)) {
					throw new RuntimeException();
				}
			}
		}
		method263(bs, false);
	}
}
