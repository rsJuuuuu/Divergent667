/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class96
{
	private Index aClass302_1260;
	private HashTable aHashTable1261 = new HashTable(256);
	static int anInt1262;
	static int anInt1263;
	private Index aClass302_1264;
	static int anInt1265;
	static int anInt1266;
	static int anInt1267;
	private HashTable aHashTable1268 = new HashTable(256);
	static IncommingPacket aClass192_1269 = new IncommingPacket(41, 7);
	static Applet anApplet1270;
	static int[] anIntArray1271 = new int[1];
	static Class61 aClass61_1272 = new Class61(10);
	static Class170 aClass170_1273 = new Class170(4, 1);
	
	public static void method1070(byte b) {
		anIntArray1271 = null;
		if (b != -107) {
			method1075(10, 11);
		}
		aClass170_1273 = null;
		aClass61_1272 = null;
		anApplet1270 = null;
		aClass192_1269 = null;
	}
	
	private final Node_Sub45_Sub1 method1071(int i, int i_0_, int i_1_, int[] is) {
		anInt1266++;
		int i_2_ = i ^ (i_0_ >>> 12 | (i_0_ & 0x10000fff) << 4);
		if (i_1_ != 0) {
			aClass192_1269 = null;
		}
		i_2_ |= i_0_ << 16;
		long l = (long) i_2_;
		Node_Sub45_Sub1 node_sub45_sub1 = (Node_Sub45_Sub1) aHashTable1268.method1518(3512, l);
		if (node_sub45_sub1 != null) {
			return node_sub45_sub1;
		}
		if (is != null && (is[0] ^ 0xffffffff) >= -1) {
			return null;
		}
		Class65 class65 = Class65.method714(aClass302_1264, i_0_, i);
		if (class65 == null) {
			return null;
		}
		node_sub45_sub1 = class65.method716();
		aHashTable1268.method1515(l, node_sub45_sub1, -126);
		if (is != null) {
			is[0] -= node_sub45_sub1.aByteArray10504.length;
		}
		return node_sub45_sub1;
	}
	
	private final Node_Sub45_Sub1 method1072(int[] is, int i, int i_3_, byte b) {
		anInt1263++;
		int i_4_ = (i >>> 12 | (i & ~0x4ffff000) << 4) ^ i_3_;
		i_4_ |= i << 16;
		long l = (long) i_4_ ^ 0x100000000L;
		Node_Sub45_Sub1 node_sub45_sub1 = (Node_Sub45_Sub1) aHashTable1268.method1518(3512, l);
		if (node_sub45_sub1 != null) {
			return node_sub45_sub1;
		}
		if (is != null && (is[0] ^ 0xffffffff) >= -1) {
			return null;
		}
		Node_Sub49 node_sub49 = (Node_Sub49) aHashTable1261.method1518(3512, l);
		if (node_sub49 == null) {
			node_sub49 = Node_Sub49.method2962(aClass302_1260, i, i_3_);
			if (node_sub49 == null) {
				return null;
			}
			aHashTable1261.method1515(l, node_sub49, -127);
		}
		@SuppressWarnings("unused")
		int i_5_ = 76 % ((20 - b) / 52);
		node_sub45_sub1 = node_sub49.method2958(is);
		if (node_sub45_sub1 == null) {
			return null;
		}
		node_sub49.method2160((byte) 99);
		aHashTable1268.method1515(l, node_sub45_sub1, -128);
		return node_sub45_sub1;
	}
	
	final Node_Sub45_Sub1 method1073(boolean bool, int[] is, int i) {
		anInt1265++;
		if (aClass302_1264.method3526(-20871) == 1) {
			return method1071(i, 0, 0, is);
		}
		if ((aClass302_1264.method3537(-2, i) ^ 0xffffffff) == -2) {
			return method1071(0, i, 0, is);
		}
		if (bool != false) {
			aClass170_1273 = null;
		}
		throw new RuntimeException();
	}
	
	final Node_Sub45_Sub1 method1074(int[] is, byte b, int i) {
		anInt1267++;
		if (aClass302_1260.method3526(-20871) == 1) {
			return method1072(is, 0, i, (byte) 116);
		}
		if (b != -31) {
			return null;
		}
		if ((aClass302_1260.method3537(-2, i) ^ 0xffffffff) == -2) {
			return method1072(is, i, 0, (byte) 111);
		}
		throw new RuntimeException();
	}
	
	Class96(Index class302, Index class302_6_) {
		aClass302_1260 = class302_6_;
		aClass302_1264 = class302;
	}
	
	static final int method1075(int i, int i_7_) {
		anInt1262++;
		double d = (double) (i_7_ >> 16 & 0xff) / 256.0;
		double d_8_ = (double) ((0xfff2 & i_7_) >> 8) / 256.0;
		double d_9_ = (double) (0xff & i_7_) / 256.0;
		double d_10_ = d;
		if (d_10_ > d_8_) {
			d_10_ = d_8_;
		}
		if (d_10_ > d_9_) {
			d_10_ = d_9_;
		}
		double d_11_ = d;
		if (d_8_ > d_11_) {
			d_11_ = d_8_;
		}
		if (d_9_ > d_11_) {
			d_11_ = d_9_;
		}
		double d_12_ = 0.0;
		double d_13_ = 0.0;
		double d_14_ = (d_10_ + d_11_) / 2.0;
		if (d_11_ != d_10_) {
			if (d_14_ < 0.5) {
				d_13_ = (-d_10_ + d_11_) / (d_10_ + d_11_);
			}
			if (d_11_ != d) {
				if (d_11_ == d_8_) {
					d_12_ = (-d + d_9_) / (d_11_ - d_10_) + 2.0;
				} else if (d_11_ == d_9_) {
					d_12_ = (d - d_8_) / (d_11_ - d_10_) + 4.0;
				}
			} else {
				d_12_ = (d_8_ - d_9_) / (-d_10_ + d_11_);
			}
			if (d_14_ >= 0.5) {
				d_13_ = (-d_10_ + d_11_) / (-d_11_ + 2.0 - d_10_);
			}
		}
		d_12_ /= 6.0;
		int i_15_ = (int) (d_12_ * 256.0);
		if (i > -26) {
			method1070((byte) -58);
		}
		int i_16_ = (int) (256.0 * d_13_);
		int i_17_ = (int) (d_14_ * 256.0);
		if (i_16_ < 0) {
			i_16_ = 0;
		} else if ((i_16_ ^ 0xffffffff) < -256) {
			i_16_ = 255;
		}
		if ((i_17_ ^ 0xffffffff) <= -1) {
			if ((i_17_ ^ 0xffffffff) < -256) {
				i_17_ = 255;
			}
		} else {
			i_17_ = 0;
		}
		if ((i_17_ ^ 0xffffffff) >= -244) {
			if (i_17_ > 217) {
				i_16_ >>= 3;
			} else if (i_17_ > 192) {
				i_16_ >>= 2;
			} else if (i_17_ > 179) {
				i_16_ >>= 1;
			}
		} else {
			i_16_ >>= 4;
		}
		return (i_17_ >> 1) + ((i_16_ >> 5 << 7) + ((i_15_ & 0xff) >> 2 << 10));
	}
}
