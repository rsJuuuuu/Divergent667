/* Node_Sub38_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Node_Sub38_Sub32 extends Node_Sub38
{
	private int anInt10424;
	private int anInt10425 = 3216;
	private int anInt10426 = 3216;
	static int anInt10427;
	static int anInt10428;
	static int anInt10429;
	static BigInteger aBigInteger10430 = new BigInteger("9fc5323834b21985bca85a933ed06a3bdb20b6969785718c3b2b8209ea0c112e340b76bdd04107f6ced8eb4190da07545a78b324a1b674d92e60b8a57981f547c984b7053aa1408b2e44584f790acc69c989433f35b1d88a3d65362da265a6d21c0d150591f747937bb3f9604c73b2a7529a0b15e7565511846b75feb658403b411eb90131a7d12a0ad5b70541da3e4b99f5f4857e837f23b832d09440dd53980a83f8c87926fc836a08cc44527ac2ef81429496125635f62b5023d02a3eeabde611fe4bea2c32ebacad31853a22e1222a32d0fade2416c8dc161f241652f6ec9d29788485f5a7f1ceb9e1a2356440f6701105967877347819bb074167e3ad35a56687af7a6dad566a070d779efed4a79b985422fa5d20d7065f065c4d1025dd4fb7861e24ba3a7472830ff483bec283d9984c421873d7a02e2040808e34ef97ad0065f8495350a2a8832e9c6546316dd3e90f76fabb680fde262208f1414b614451c84d8075e6717ddc0e729c06b38963be0c1bc821c00f1e21ceaee3763b43f2d132c1eacfd2f242d348fd6c87582dfe9dcfc0cbe60bc4eb2e91c5d02fc65360e923cad580004c304bcd9bc9f31e9db59315456b1c7c79cd5b956a63fb090de858fa41780f5e2212a827865385b7716a5bbb1ddd458d52ec630f4ce72c265627a7916a7026af650b85f42f4dcb4730d92a72b0047a3f09b17a1d2b96124e3f", 16);
	static int anInt10431;
	private int[] anIntArray10432;
	static IncommingPacket aClass192_10433 = new IncommingPacket(29, 6);
	static int anInt10434;
	static int anInt10435;
	static int anInt10436;
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10429++;
		if (bool != false) {
			method2780(false, null, 34);
		}
		int i_0_ = i;
	while_263_:
		do {
			do {
				if ((i_0_ ^ 0xffffffff) != -1) {
					if ((i_0_ ^ 0xffffffff) != -2) {
						if (i_0_ == 2) {
							break;
						}
						break while_263_;
					}
				} else {
					anInt10424 = buffer.readUnsignedShort();
					return;
				}
				anInt10425 = buffer.readUnsignedShort();
				return;
			} while (false);
			anInt10426 = buffer.readUnsignedShort();
		} while (false);
	}
	
	public Node_Sub38_Sub32() {
		super(1, true);
		anInt10424 = 4096;
		anIntArray10432 = new int[3];
	}
	
	final int[] method2775(int i, int i_1_) {
		anInt10427++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (aClass146_7460.aBoolean1819) {
			int i_2_ = Class359.anInt4468 * anInt10424 >> 12;
			int[] is_3_ = this.method2786(r_Sub2.anInt11054 & i_1_ - 1, 0, 0);
			int[] is_4_ = this.method2786(i_1_, 0, 0);
			int[] is_5_ = this.method2786(i_1_ + 1 & r_Sub2.anInt11054, 0, 0);
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_6_++) {
				int i_7_ = i_2_ * (is_5_[i_6_] + -is_3_[i_6_]) >> 12;
				int i_8_ = (-is_4_[Class303.anInt3824 & i_6_ - -1] + is_4_[Class303.anInt3824 & i_6_ - 1]) * i_2_ >> 12;
				int i_9_ = i_8_ >> 4;
				if (i_9_ < 0) {
					i_9_ = -i_9_;
				}
				int i_10_ = i_7_ >> 4;
				if (i_9_ > 255) {
					i_9_ = 255;
				}
				if ((i_10_ ^ 0xffffffff) > -1) {
					i_10_ = -i_10_;
				}
				if ((i_10_ ^ 0xffffffff) < -256) {
					i_10_ = 255;
				}
				int i_11_ = Node_Sub25.aByteArray7239[i_9_ + ((1 + i_10_) * i_10_ >> 1)] & 0xff;
				int i_12_ = i_8_ * i_11_ >> 8;
				int i_13_ = i_7_ * i_11_ >> 8;
				int i_14_ = i_11_ * 4096 >> 8;
				i_12_ = anIntArray10432[0] * i_12_ >> 12;
				i_13_ = anIntArray10432[1] * i_13_ >> 12;
				i_14_ = i_14_ * anIntArray10432[2] >> 12;
				is[i_6_] = i_14_ + i_13_ + i_12_;
			}
		}
		if (i < 107) {
			method2896((byte) 87);
		}
		return is;
	}
	
	static final int method2894(int i, int i_15_, int i_16_, int i_17_) {
		anInt10435++;
		if (i_16_ != 929798380) {
			return 77;
		}
		if ((i_17_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			if (i_15_ < i_17_) {
				return i_15_;
			}
			return i_17_;
		}
		return i;
	}
	
	public static void method2895(boolean bool) {
		if (bool == true) {
			aClass192_10433 = null;
			aBigInteger10430 = null;
		}
	}
	
	private final void method2896(byte b) {
		anInt10434++;
		double d = Math.cos((double) ((float) anInt10426 / 4096.0F));
		anIntArray10432[0] = (int) (d * Math.sin((double) ((float) anInt10425 / 4096.0F)) * 4096.0);
		if (b > -113) {
			method2895(true);
		}
		anIntArray10432[1] = (int) (4096.0 * (d * Math.cos((double) ((float) anInt10425 / 4096.0F))));
		anIntArray10432[2] = (int) (4096.0 * Math.sin((double) ((float) anInt10426 / 4096.0F)));
		int i = anIntArray10432[0] * anIntArray10432[0] >> 12;
		int i_18_ = anIntArray10432[1] * anIntArray10432[1] >> 12;
		int i_19_ = anIntArray10432[2] * anIntArray10432[2] >> 12;
		int i_20_ = (int) (Math.sqrt((double) (i + (i_18_ + i_19_) >> 12)) * 4096.0);
		if ((i_20_ ^ 0xffffffff) != -1) {
			anIntArray10432[0] = (anIntArray10432[0] << 12) / i_20_;
			anIntArray10432[1] = (anIntArray10432[1] << 12) / i_20_;
			anIntArray10432[2] = (anIntArray10432[2] << 12) / i_20_;
		}
	}
	
	final void method2785(int i) {
		if (i != 7) {
			anInt10426 = 8;
		}
		anInt10431++;
		method2896((byte) -119);
	}
	
	static final void method2897(int i) {
		if (Class143.aByteArray1773 == null) {
			if (Class336_Sub2.anInt8586 == -1) {
				Node_Sub14.method2553(Node_Sub5.password, Node_Sub38_Sub23.anInt10347, Class243.username, 2);
			} else {
				Class320_Sub3.method3690(-11055, Node_Sub38_Sub23.anInt10347);
			}
		} else {
			Class328.method3829(Node_Sub38_Sub23.anInt10347, -11951);
		}
		if (i != 29) {
			method2895(false);
		}
		anInt10428++;
	}
}
