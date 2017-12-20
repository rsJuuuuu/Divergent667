/* Node_Sub25_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Node_Sub25_Sub1 extends Node_Sub25
{
	private Node_Sub9_Sub5 aNode_Sub9_Sub5_9930;
	private VorbisInfo aVorbisInfo9931 = new VorbisInfo();
	static int anInt9932;
	static int anInt9933;
	static int anInt9934;
	private DSPState aDSPState9935;
	static int anInt9936 = 100;
	private int anInt9937;
	static int anInt9938;
	private Class191 aClass191_9939;
	static int anInt9940;
	static int[] anIntArray9941;
	private VorbisComment aVorbisComment9942 = new VorbisComment();
	static int anInt9943;
	static int anInt9944;
	static int anInt9945;
	static int anInt9946;
	static int anInt9947;
	static IncommingPacket aClass192_9948;
	private double aDouble9949;
	static boolean aBoolean9950 = true;
	private VorbisBlock aVorbisBlock9951;
	static boolean aBoolean9952;
	static OutcommingPacket aClass318_9953;
	
	static final void method2657(int i, int i_0_) {
		@SuppressWarnings("unused")
		int i_1_ = -87 % ((i_0_ - -46) / 51);
		anInt9945++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 16, (long) i);
		cachenode_sub2.method2291((byte) 121);
	}
	
	final void method2656(int i) {
		if (aVorbisBlock9951 != null) {
			aVorbisBlock9951.a();
		}
		if (i != 100) {
			aDSPState9935 = null;
		}
		anInt9944++;
		if (aDSPState9935 != null) {
			aDSPState9935.a();
		}
		aVorbisComment9942.a();
		aVorbisInfo9931.a();
		if (aNode_Sub9_Sub5_9930 != null) {
			aNode_Sub9_Sub5_9930.method2530(false);
		}
	}
	
	final Node_Sub9_Sub5 method2658(int i) {
		if (i != 27624) {
			return null;
		}
		anInt9938++;
		return aNode_Sub9_Sub5_9930;
	}
	
	static final void method2659(Node_Sub9_Sub1 node_sub9_sub1, boolean bool, int i, int i_2_, Index class302, int i_3_, int i_4_) {
		Class339_Sub8.method3946(i_2_, i_4_, i_3_, class302, bool, i + -8613);
		anInt9933++;
		Class61.aNode_Sub9_Sub1_885 = node_sub9_sub1;
		if (i != 32345) {
			method2662(-3);
		}
	}
	
	final void method2654(int i, OggPacket oggpacket) {
		anInt9943++;
		if ((anInt7234 ^ 0xffffffff) <= -4) {
			if ((aVorbisBlock9951.synthesis(oggpacket) ^ 0xffffffff) == -1) {
				aDSPState9935.blockIn(aVorbisBlock9951);
			}
			float[][] fs = aDSPState9935.pcmOut(aVorbisInfo9931.channels);
			aDouble9949 = aDSPState9935.granuleTime();
			if (aDouble9949 == -1.0) {
				aDouble9949 = (double) ((float) anInt9937 / (float) aVorbisInfo9931.rate);
			}
			aDSPState9935.read(fs[0].length);
			anInt9937 += fs[0].length;
			CacheNode_Sub8 cachenode_sub8 = aNode_Sub9_Sub5_9930.method2531(fs[0].length, aDouble9949, 0);
			Class320_Sub14.method3735(0, fs, cachenode_sub8.aShortArrayArray9491);
			for (int i_5_ = 0; (aVorbisInfo9931.channels ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
				cachenode_sub8.aShortArrayArray9491[i_5_] = aClass191_9939.method1951(cachenode_sub8.aShortArrayArray9491[i_5_], 30664);
			aNode_Sub9_Sub5_9930.method2532(cachenode_sub8, (byte) -73);
		} else {
			int i_6_ = aVorbisInfo9931.headerIn(aVorbisComment9942, oggpacket);
			if (i_6_ < 0) {
				throw new IllegalStateException(String.valueOf(i_6_));
			}
			if (anInt7234 == 2) {
				if ((aVorbisInfo9931.channels ^ 0xffffffff) < -3 || (aVorbisInfo9931.channels ^ 0xffffffff) > -2) {
					throw new RuntimeException(String.valueOf(aVorbisInfo9931.channels));
				}
				aDSPState9935 = new DSPState(aVorbisInfo9931);
				aVorbisBlock9951 = new VorbisBlock(aDSPState9935);
				aClass191_9939 = new Class191(aVorbisInfo9931.rate, Class365.anInt4523);
				aNode_Sub9_Sub5_9930 = new Node_Sub9_Sub5(aVorbisInfo9931.channels);
			}
		}
		if (i != 18986) {
			method2664(-105, -33, 38, 83);
		}
	}
	
	static final Node_Sub13 method2660(int i) {
		anInt9934++;
		Node_Sub13 node_sub13 = Class320_Sub5.method3699(93);
		node_sub13.aClass318_7109 = null;
		node_sub13.anInt7110 = i;
		node_sub13.aPacket7113 = new Packet(5000);
		return node_sub13;
	}
	
	final double method2661(byte b) {
		anInt9932++;
		if (b <= 120) {
			aBoolean9952 = false;
		}
		double d = aDouble9949;
		if (aNode_Sub9_Sub5_9930 != null) {
			d = aNode_Sub9_Sub5_9930.method2526(false);
			if (d < 0.0) {
				d = aDouble9949;
			}
		}
		return (double) -(256.0F / (float) Class365.anInt4523) + d;
	}
	
	public static void method2662(int i) {
		aClass318_9953 = null;
		if (i != -25081) {
			anInt9947 = 102;
		}
		aClass192_9948 = null;
		anIntArray9941 = null;
	}
	
	final int method2663(int i) {
		anInt9940++;
		if (i >= -82) {
			return -128;
		}
		if (aNode_Sub9_Sub5_9930 == null) {
			return 0;
		}
		return aNode_Sub9_Sub5_9930.method2529(0);
	}
	
	static final int method2664(int i, int i_7_, int i_8_, int i_9_) {
		anInt9946++;
		if (i_9_ == i) {
			return i_9_;
		}
		int i_10_ = -i_8_ + i_7_;
		int i_11_ = i_10_ * (i_9_ & 0x7f) - -((i & 0x7f) * i_8_) >> 7;
		int i_12_ = (i_9_ & 0x380) * i_10_ + (0x380 & i) * i_8_ >> 7;
		int i_13_ = i_8_ * (0xfc00 & i) + i_10_ * (i_9_ & 0xfc00) >> 7;
		return i_12_ & 0x380 | i_13_ & 0xfc00 | 0x7f & i_11_;
	}
	
	Node_Sub25_Sub1(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}
	
	static {
		anInt9947 = 0;
		aClass192_9948 = new IncommingPacket(1, -1);
		aBoolean9952 = true;
		aClass318_9953 = new OutcommingPacket(49, 3);
	}
}
