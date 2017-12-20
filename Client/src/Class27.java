/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27
{
	private BufferedStream aBuffer458;
	protected int[] anIntArray459;
	private static byte[] aByteArray460 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private long aLong461;
	private int[] anIntArray462;
	protected int anInt463;
	private int anInt464;
	private int[] anIntArray465;
	private int[] anIntArray466;
	
	final boolean method315() {
        return aBuffer458.buffer != null;
    }
	
	final long method316(int i) {
		return aLong461 + (long) i * (long) anInt464;
	}
	
	final int method317(int i) {
		int i_0_ = method327(i);
		return i_0_;
	}
	
	final void method318(int i) {
		anIntArray465[i] = aBuffer458.offset;
	}
	
	final void method319() {
		aBuffer458.buffer = null;
		anIntArray462 = null;
		anIntArray465 = null;
		anIntArray459 = null;
		anIntArray466 = null;
	}
	
	private final int method320(int i, int i_1_) {
		if (i_1_ == 255) {
			int i_2_ = aBuffer458.readUnsignedByte();
			int i_3_ = aBuffer458.method2239(0);
			if (i_2_ == 47) {
				aBuffer458.offset += i_3_;
				return 1;
			}
			if (i_2_ == 81) {
				int i_4_ = aBuffer458.read24BitInteger();
				i_3_ -= 3;
				int i_5_ = anIntArray459[i];
				aLong461 += (long) i_5_ * (long) (anInt464 - i_4_);
				anInt464 = i_4_;
				aBuffer458.offset += i_3_;
				return 2;
			}
			aBuffer458.offset += i_3_;
			return 3;
		}
		byte b = aByteArray460[i_1_ - 128];
		int i_6_ = i_1_;
		if (b >= 1) {
			i_6_ |= aBuffer458.readUnsignedByte() << 8;
		}
		if (b >= 2) {
			i_6_ |= aBuffer458.readUnsignedByte() << 16;
		}
		return i_6_;
	}
	
	final void method321(byte[] bs) {
		aBuffer458.buffer = bs;
		aBuffer458.offset = 10;
		int i = aBuffer458.readUnsignedShort();
		anInt463 = aBuffer458.readUnsignedShort();
		anInt464 = 500000;
		anIntArray462 = new int[i];
		int i_7_ = 0;
		while (i_7_ < i) {
			int i_8_ = aBuffer458.readInt();
			int i_9_ = aBuffer458.readInt();
			if (i_8_ == 1297379947) {
				anIntArray462[i_7_] = aBuffer458.offset;
				i_7_++;
			}
			aBuffer458.offset += i_9_;
		}
		aLong461 = 0L;
		anIntArray465 = new int[i];
		for (int i_10_ = 0; i_10_ < i; i_10_++)
			anIntArray465[i_10_] = anIntArray462[i_10_];
		anIntArray459 = new int[i];
		anIntArray466 = new int[i];
	}
	
	final int method322() {
		int i = anIntArray465.length;
		int i_11_ = -1;
		int i_12_ = 2147483647;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			if (anIntArray465[i_13_] >= 0 && anIntArray459[i_13_] < i_12_) {
				i_11_ = i_13_;
				i_12_ = anIntArray459[i_13_];
			}
		}
		return i_11_;
	}
	
	final void method323(int i) {
		aBuffer458.offset = anIntArray465[i];
	}
	
	final void method324() {
		aBuffer458.offset = -1;
	}
	
	public static void method325() {
		aByteArray460 = null;
	}
	
	final void method326(long l) {
		aLong461 = l;
		int i = anIntArray465.length;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			anIntArray459[i_14_] = 0;
			anIntArray466[i_14_] = 0;
			aBuffer458.offset = anIntArray462[i_14_];
			method329(i_14_);
			anIntArray465[i_14_] = aBuffer458.offset;
		}
	}
	
	private final int method327(int i) {
		int i_15_ = aBuffer458.buffer[aBuffer458.offset];
		if (i_15_ < 0) {
			i_15_ &= 0xff;
			anIntArray466[i] = i_15_;
			aBuffer458.offset++;
		} else {
			i_15_ = anIntArray466[i];
		}
		if (i_15_ == 240 || i_15_ == 247) {
			int i_16_ = aBuffer458.method2239(0);
			if (i_15_ == 247 && i_16_ > 0) {
				int i_17_ = aBuffer458.buffer[aBuffer458.offset] & 0xff;
				if (i_17_ >= 241 && i_17_ <= 243 || i_17_ == 246 || i_17_ == 248 || i_17_ >= 250 && i_17_ <= 252 || i_17_ == 254) {
					aBuffer458.offset++;
					anIntArray466[i] = i_17_;
					return method320(i, i_17_);
				}
			}
			aBuffer458.offset += i_16_;
			return 0;
		}
		return method320(i, i_15_);
	}
	
	final boolean method328() {
		int i = anIntArray465.length;
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			if (anIntArray465[i_18_] >= 0) {
				return false;
			}
		}
		return true;
	}
	
	final void method329(int i) {
		int i_19_ = aBuffer458.method2239(0);
		anIntArray459[i] += i_19_;
	}
	
	final int method330() {
		return anIntArray465.length;
	}
	
	public Class27() {
		aBuffer458 = new BufferedStream(null);
	}
	
	Class27(byte[] bs) {
		aBuffer458 = new BufferedStream(null);
		method321(bs);
	}
}
