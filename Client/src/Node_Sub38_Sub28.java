/* Node_Sub38_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Node_Sub38_Sub28 extends Node_Sub38
{
	private int[] anIntArray10391;
	private int anInt10392 = 2048;
	private int anInt10393 = 0;
	static int anInt10394;
	static int anInt10395;
	static int anInt10396;
	static int anInt10397;
	static int anInt10398;
	private int anInt10399 = 10;
	private int[] anIntArray10400;
	static int anInt10401;
	static IncommingPacket aClass192_10402 = new IncommingPacket(40, -1);
	static int anInt10403 = 0;
	static Rectangle[] aRectangleArray10404 = new Rectangle[100];
	
	public static void method2885(byte b) {
		if (b < 69) {
			aClass192_10402 = null;
		}
		aRectangleArray10404 = null;
		aClass192_10402 = null;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool == false) {
			int i_0_ = i;
		while_257_:
			do {
				do {
					if (i_0_ != 0) {
						if ((i_0_ ^ 0xffffffff) != -2) {
							if ((i_0_ ^ 0xffffffff) == -3) {
								break;
							}
							break while_257_;
						}
					} else {
						anInt10399 = buffer.readUnsignedByte();
						break while_257_;
					}
					anInt10392 = buffer.readUnsignedShort();
					break while_257_;
				} while (false);
				anInt10393 = buffer.readUnsignedByte();
			} while (false);
			anInt10397++;
		}
	}
	
	private final void method2886(int i) {
		anInt10396++;
		anIntArray10400 = new int[anInt10399 - -1];
		anIntArray10391 = new int[anInt10399 - -1];
		int i_1_ = 0;
		int i_2_ = 4096 / anInt10399;
		int i_3_ = i_2_ * anInt10392 >> 12;
		for (int i_4_ = 0; i_4_ < anInt10399; i_4_++) {
			anIntArray10391[i_4_] = i_1_;
			anIntArray10400[i_4_] = i_1_ + i_3_;
			i_1_ = i_1_ + i_2_;
		}
		anIntArray10391[anInt10399] = 4096;
		if (i != -3749) {
			method2780(true, null, 96);
		}
		anIntArray10400[anInt10399] = 4096 - -anIntArray10400[0];
	}
	
	static final void loginToLobby(String password, String username, byte b) {
		Node_Sub38_Sub23.anInt10347 = -1;
		//makes it use world stream
		Class320_Sub23.aClass123_8432 = Class218.aClass123_2566;//Class218.aClass123_2560;
		Class159.loginType = 2; //1;
		Class129.method1556(false, username, true, false, password);
	}
	
	final int[] method2775(int i, int i_6_) {
		anInt10401++;
		int[] is = aClass146_7460.method1645(27356, i_6_);
		if (i <= 107) {
			aRectangleArray10404 = null;
		}
		if (aClass146_7460.aBoolean1819) {
			int i_7_ = Node_Sub25_Sub1.anIntArray9941[i_6_];
			if (anInt10393 != 0) {
				for (int i_8_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					int i_9_ = 0;
					int i_10_ = 0;
					int i_11_ = CacheNode_Sub3.anIntArray9442[i_8_];
					int i_12_ = anInt10393;
				while_258_:
					do {
						do {
							if (i_12_ != 1) {
								if ((i_12_ ^ 0xffffffff) != -3) {
									if (i_12_ == 3) {
										break;
									}
									break while_258_;
								}
							} else {
								i_9_ = i_11_;
								break while_258_;
							}
							i_9_ = 2048 + (i_11_ + -4096 + i_7_ >> 1);
							break while_258_;
						} while (false);
						i_9_ = (i_11_ + -i_7_ >> 1) + 2048;
					} while (false);
					for (i_12_ = 0; anInt10399 > i_12_; i_12_++) {
						if ((i_9_ ^ 0xffffffff) <= (anIntArray10391[i_12_] ^ 0xffffffff) && i_9_ < anIntArray10391[1 + i_12_]) {
							if (anIntArray10400[i_12_] > i_9_) {
								i_10_ = 4096;
							}
							break;
						}
					}
					is[i_8_] = i_10_;
				}
			} else {
				int i_13_ = 0;
				for (int i_14_ = 0; anInt10399 > i_14_; i_14_++) {
					if ((anIntArray10391[i_14_] ^ 0xffffffff) >= (i_7_ ^ 0xffffffff) && anIntArray10391[1 + i_14_] > i_7_) {
						if (anIntArray10400[i_14_] > i_7_) {
							i_13_ = 4096;
						}
						break;
					}
				}
				Class311.method3604(is, 0, Class339_Sub7.anInt8728, i_13_);
			}
		}
		return is;
	}
	
	public Node_Sub38_Sub28() {
		super(0, true);
	}
	
	static final void method2888(byte b, Index class302) {
		Node_Sub50.anInt7625 = class302.method3519("p11_full", (byte) 46);
		anInt10394++;
		if (b >= 53) {
			Class285.anInt3600 = class302.method3519("p12_full", (byte) 26);
			Class340.anInt4220 = class302.method3519("b12_full", (byte) 54);
		}
	}
	
	final void method2785(int i) {
		anInt10395++;
		if (i != 7) {
			anInt10393 = -7;
		}
		method2886(-3749);
	}
	
	static {
		for (int i = 0; (i ^ 0xffffffff) > -101; i++)
			aRectangleArray10404[i] = new Rectangle();
	}
}
