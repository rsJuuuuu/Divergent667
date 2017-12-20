/* Node_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub2 extends Node_Sub15
{
	static int anInt9775;
	private String aString9776;
	static int anInt9777;
	private long aLong9778 = -1L;
	static Class104 aClass104_9779;
	static boolean aBoolean9780 = false;
	static int anInt9781;
	static int anInt9782;
	static int anInt9783;
	static Class138[] aClass138Array9784;
	
	static final boolean method2559(int i, int i_0_, int i_1_, int i_2_, byte[] bs, int i_3_, int i_4_) {
		anInt9775++;
		int i_5_ = i_3_ % i_1_;
		int i_6_;
		if (i_5_ != 0) {
			i_6_ = i_1_ + -i_5_;
		} else {
			i_6_ = 0;
		}
		int i_7_ = -((i_1_ + i - 1) / i_1_);
		int i_8_ = -((i_1_ + (i_3_ + -1)) / i_1_);
		for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
			for (int i_10_ = i_8_; i_10_ < 0; i_10_++) {
				if (bs[i_0_] == 0) {
					return true;
				}
				i_0_ += i_1_;
			}
			i_0_ -= i_6_;
			if ((bs[-1 + i_0_] ^ 0xffffffff) == -1) {
				return true;
			}
			i_0_ += i_2_;
		}
		if (i_4_ != -1941613085) {
			aBoolean9780 = false;
		}
		return false;
	}
	
	static final short method2560(int i, int i_11_) {
		anInt9777++;
		int i_12_ = i_11_ >> 10 & 0x3f;
		if (i != 5310) {
			return (short) 117;
		}
		int i_13_ = i_11_ >> 3 & 0x70;
		int i_14_ = i_11_ & 0x7f;
		i_13_ = (i_14_ ^ 0xffffffff) >= -65 ? i_14_ * i_13_ >> 7 : i_13_ * (-i_14_ + 127) >> 7;
		int i_15_ = i_13_ + i_14_;
		int i_16_;
		if (i_15_ != 0) {
			i_16_ = (i_13_ << 8) / i_15_;
		} else {
			i_16_ = i_13_ << 1;
		}
		int i_17_ = i_15_;
		return (short) (i_16_ >> 4 << 7 | i_12_ << 10 | i_17_);
	}
	
	final void method2556(ClanChat clanchat, int i) {
		anInt9781++;
		if (i == 16) {
			clanchat.method488(0, aString9776, aLong9778, 0);
		}
	}
	
	final void method2554(int i, BufferedStream buffer) {
		anInt9782++;
		if (buffer.readUnsignedByte() != 255) {
			buffer.offset--;
			aLong9778 = buffer.readLong();
		}
		aString9776 = buffer.readString2();
		if (i == 29147) {
			if (Class79.aBoolean1052) {
				//System.out.println("memberhash:" + aLong9778 + " membername:" + aString9776);
			}
		}
	}
	
	Node_Sub15_Sub2() {
		aString9776 = null;
	}
	
	static final void method2561(int i) {
		anInt9783++;
		Node_Sub41.aClass114_7519 = new Class114(8);
		Class51_Sub2.anInt9070 = 0;
		if (i == 1993405383) {
			for (EntityNode_Sub4 entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1113((byte) -114); entitynode_sub4 != null; entitynode_sub4 = (EntityNode_Sub4) Animable_Sub2.aClass103_9116.method1108(74))
				entitynode_sub4.method961();
		}
	}
	
	public static void method2562(int i) {
		if (i >= 45) {
			aClass104_9779 = null;
			aClass138Array9784 = null;
		}
	}
	
	static {
		aClass104_9779 = new Class104();
		aClass138Array9784 = new Class138[6];
	}
}
