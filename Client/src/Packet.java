/* Packet - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Packet extends BufferedStream
{
	static int anInt9386 = 0;
	static int anInt9387;
	static int anInt9388;
	static int anInt9389;
	static int anInt9390;
	static int anInt9391;
	static int anInt9392;
	static int anInt9393;
	static Class299 aClass299_9394;
	static int anInt9395;
	static int anInt9396;
	static int anInt9397;
	static int anInt9398;
	private int bitPosition;
	static int anInt9401;
	static Class42 aClass42_9402;
	
	public static void method2254(byte b) {
		aClass299_9394 = null;
		if (b > -27) {
			method2254((byte) -73);
		}
		aClass42_9402 = null;
	}
	
	final void finishBitAccess() {
		offset = (7 + bitPosition) / 8;
	}
	
	final int readBits(int numBits) {
		int i_0_ = bitPosition >> 3;
		int i_1_ = 8 + -(bitPosition & 0x7);
		int i_2_ = 0;
		bitPosition += numBits;
		for (/**/; i_1_ < numBits; i_1_ = 8) {
			i_2_ += (CacheNode_Sub17.BIT_FLAGS[i_1_] & buffer[i_0_++]) << -i_1_ + numBits;
			numBits -= i_1_;
		}
		if (numBits != i_1_) {
			i_2_ += buffer[i_0_] >> i_1_ + -numBits & CacheNode_Sub17.BIT_FLAGS[numBits];
		} else {
			i_2_ += buffer[i_0_] & CacheNode_Sub17.BIT_FLAGS[i_1_];
		}
		return i_2_;
	}
	
	Packet(int i) {
		super(i);
	}
	
	final boolean method2257(boolean bool) {
		if (bool != true) {
			return false;
		}
		anInt9390++;
		int i = 0xff & buffer[offset] ;//- anIsaacCipher9399.method1670((byte) -21);
        return (i ^ 0xffffffff) <= -129;
    }
	
	static final void method2258(boolean bool, int i) {
		anInt9395++;
		synchronized (Node_Sub36_Sub4.aClass61_10065) {
			Node_Sub36_Sub4.aClass61_10065.method598(i, -11819);
		}
		synchronized (CacheNode_Sub3.aClass61_9446) {
			CacheNode_Sub3.aClass61_9446.method598(i, -11819);
			if (bool != false) {
				method2263(56);
			}
		}
	}
	
	final void method2259(int[] is, byte b) {
		new IsaacCipher(is);
		if (b != -20) {
			aClass42_9402 = null;
		}
		anInt9401++;
	}
	
	final void method2260(byte[] bs, int i, int i_4_, boolean bool) {
		anInt9391++;
		for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff); i_5_++)
			bs[i_5_ + i_4_] = buffer[offset++];// + -anIsaacCipher9399.method1667((byte) -96));
		if (bool != true) {
		}
	}
	
	final void initBitAccess() {
		bitPosition = 8 * offset;
	}
	
	final void method2262(int i, int i_6_) {
		anInt9396++;
		if (i == 1) {
			buffer[offset++] = (byte) (i_6_ );//anIsaacCipher9399.method1667((byte) -96));
		}
	}
	
	static final Class257[] method2263(int i) {
		if (i != 31303) {
			method2263(-5);
		}
		anInt9387++;
		return new Class257[] { Node_Sub15_Sub9.aClass257_9838, Node_Sub37.aClass257_7443, Node_Sub38_Sub17.aClass257_10270, Class225.aClass257_2674, Node_Sub38_Sub15.aClass257_10262, Class169_Sub2.aClass257_8804, Actor.aClass257_10823, Class66_Sub1.aClass257_8984, Class189_Sub1.aClass257_6882, Class262_Sub13.aClass257_7801, CacheNode_Sub1.aClass257_9421, Client.aClass257_5467, Class262_Sub23.aClass257_7883, Class46.aClass257_674, Class12.aClass257_198 };
	}
	
	final int method2264(int i, int i_7_) {
		anInt9392++;
		if (i_7_ >= -4) {
			method2254((byte) -75);
		}
		return 8 * i - bitPosition;
	}
	
	final int readPacket() {
		int i_8_ = 0xff & buffer[offset++] ;//+ -anIsaacCipher9399.method1667((byte) -96);
		if (i_8_ < 128) {
			return i_8_;
		}
		return (0xff & buffer[offset++]);//- anIsaacCipher9399.method1667((byte) -96)) + (-128 + i_8_ << 8);
	}
	
	final void method2266(IsaacCipher isaaccipher, int i) {
		anInt9393++;
		if (i >= -44) {
			aClass299_9394 = null;
		}
	}
}
