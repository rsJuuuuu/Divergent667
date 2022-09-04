/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26
{
	static int anInt453;
	static int anInt454;
	static IncommingPacket aClass192_455 = new IncommingPacket(96, 7);
	static int anInt456;
	static int anInt457;
	
	static final boolean method311(int i, int i_0_) {
		if (i_0_ != -5) {
			method312('\uffdc', (byte) 89);
		}
		anInt454++;
        return !(i != 3 && i != 4 && i != 5 && i != 6);
    }
	
	public final String toString() {
		anInt453++;
		throw new IllegalStateException();
	}
	
	static final byte method312(char c, byte b) {
		anInt456++;
		byte b_1_;
		if ((c <= 0 || c >= 128) && (c < 160 || c > 255)) {
			if (c == 8364) {
				b_1_ = (byte) -128;
			} else if (c == 8218) {
				b_1_ = (byte) -126;
			} else if (c == 402) {
				b_1_ = (byte) -125;
			} else if (c == 8222) {
				b_1_ = (byte) -124;
			} else if (c == 8230) {
				b_1_ = (byte) -123;
			} else if (c == 8224) {
				b_1_ = (byte) -122;
			} else if (c == 8225) {
				b_1_ = (byte) -121;
			} else if (c == 710) {
				b_1_ = (byte) -120;
			} else if (c == 8240) {
				b_1_ = (byte) -119;
			} else if (c == 352) {
				b_1_ = (byte) -118;
			} else if (c == 8249) {
				b_1_ = (byte) -117;
			} else if (c == 338) {
				b_1_ = (byte) -116;
			} else if (c == 381) {
				b_1_ = (byte) -114;
			} else if (c == 8216) {
				b_1_ = (byte) -111;
			} else if (c == 8217) {
				b_1_ = (byte) -110;
			} else if (c == 8220) {
				b_1_ = (byte) -109;
			} else if (c == 8221) {
				b_1_ = (byte) -108;
			} else if (c == 8226) {
				b_1_ = (byte) -107;
			} else if (c == 8211) {
				b_1_ = (byte) -106;
			} else if (c == 8212) {
				b_1_ = (byte) -105;
			} else if (c == 732) {
				b_1_ = (byte) -104;
			} else if (c == 8482) {
				b_1_ = (byte) -103;
			} else if (c == 353) {
				b_1_ = (byte) -102;
			} else if (c == 8250) {
				b_1_ = (byte) -101;
			} else if (c == 339) {
				b_1_ = (byte) -100;
			} else if (c == 382) {
				b_1_ = (byte) -98;
			} else if (c == 376) {
				b_1_ = (byte) -97;
			} else {
				b_1_ = (byte) 63;
			}
		} else {
			b_1_ = (byte) c;
		}
		if (b >= -26) {
			aClass192_455 = null;
		}
		return b_1_;
	}
	
	static final void method313(byte b, int i) {
		Class320_Sub16.anInt8360 = i;
		anInt457++;
		Class105.aClass61_5202.method608(false);
		@SuppressWarnings("unused")
		int i_2_ = -1 / ((b - -24) / 57);
	}
	
	public static void method314(byte b) {
		aClass192_455 = null;
		if (b != 100) {
			aClass192_455 = null;
		}
	}
}
