/* Buffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class BufferedStream extends Node
{
	static int anInt6952;
	static int anInt6953;
	static int anInt6954;
	static int anInt6955;
	static int anInt6956;
	static int anInt6957;
	static int anInt6958;
	static int anInt6959;
	static int anInt6960;
	static int anInt6961;
	static int anInt6962;
	static int anInt6963;
	static int anInt6964;
	static int anInt6965;
	static int anInt6966;
	static int anInt6967;
	static int anInt6968;
	static int anInt6969;
	static int anInt6970;
	static int anInt6971;
	static int anInt6972;
	static int anInt6973;
	static int anInt6974;
	static int anInt6975;
	static int anInt6976;
	static int anInt6977;
	static int anInt6978;
	static int anInt6979;
	static int anInt6980;
	static int anInt6981;
	static int anInt6982;
	static int anInt6983;
	static int anInt6984;
	static int anInt6985;
	static int anInt6986;
	static int anInt6987;
	static int anInt6988;
	static int anInt6989;
	static int anInt6990;
	static int anInt6991;
	static int anInt6992;
	static int anInt6993;
	static int anInt6994;
	static int anInt6995;
	static int anInt6996;
	static int anInt6997;
	static int anInt6998;
	static int anInt6999;
	static int anInt7000;
	static int anInt7001;
	protected int offset;
	static int anInt7003;
	static int anInt7004;
	static int anInt7005;
	static int anInt7006;
	static int anInt7007;
	static int anInt7008;
	static int anInt7009;
	static int anInt7010;
	static int anInt7011;
	static int anInt7012;
	static int anInt7013;
	static IncommingPacket aClass192_7014 = new IncommingPacket(136, 6);
	static int anInt7015;
	static int anInt7016;
	static int anInt7017;
	static int anInt7018;
	protected byte[] buffer;
	static int anInt7020;
	static int anInt7021;
	static int anInt7022;
	static int anInt7023;
	static int anInt7024;
	static int anInt7025;
	
	final int readIntLE() {
		offset += 4;
		return (0xff & buffer[-4 + offset]) + (((0xff & buffer[-2 + offset]) << 16) + (buffer[-1 + offset] << 24 & ~0xffffff)) - -((0xff & buffer[-3 + offset]) << 8);
	}
	
	final int readIntV1() {
		offset += 4;
		return ((buffer[offset + -1] & 0xff) << 16) + ((buffer[offset - 2] << 24 & ~0xffffff) - (-((buffer[-4 + offset] & 0xff) << 8) + -(buffer[-3 + offset] & 0xff)));
	}
	
	final void writeByteC(int i) {
			buffer[offset++] = (byte) -i;
	}
	
	final void writeInt(int i) {
		buffer[offset++] = (byte) (i >> 24);
		buffer[offset++] = (byte) (i >> 16);
		buffer[offset++] = (byte) (i >> 8);
		buffer[offset++] = (byte) i;
	}
	
	final String method2180(byte b) {
		anInt7025++;
		byte b_0_ = buffer[offset++];
		if (b_0_ != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		int i = offset;
		while (buffer[offset++] != 0) {
			/* empty */
		}
		int i_2_ = offset + -i + -1;
		if ((i_2_ ^ 0xffffffff) == -1) {
			return "";
		}
		return Class184.method1846(i, buffer, i_2_, (byte) -127);
	}
	
	final void readBytes(byte[] data, int dataStartOffset, int length) {
		for (int dataOffset = dataStartOffset; dataOffset < length + dataStartOffset; dataOffset++)
			data[dataOffset] = buffer[offset++];
	}
	
	final int readSmart2(boolean bool) {
		anInt6964++;
		int i = 0;
		int i_6_;
		for (i_6_ = readSmart(); i_6_ == 32767; i_6_ = readSmart())
			i += 32767;
		i += i_6_;
		if (bool != true) {
			buffer = null;
		}
		return i;
	}
	
	final int method2183() {

		if (buffer[offset] < 0) {
			return readInt() & 0x7fffffff;
		}
		int i = readUnsignedShort();
		if ((i ^ 0xffffffff) == -32768) {
			return -1;
		}
		return i;
	}
	
	final void writeIntV2(int i) {
		buffer[offset++] = (byte) (i >> 16);
		buffer[offset++] = (byte) (i >> 24);
		buffer[offset++] = (byte) i;
		buffer[offset++] = (byte) (i >> 8);
	}
	
	final byte read128Byte() {
		return (byte) (128 - buffer[offset++]);
	}
	
	final int readInt() {
		offset += 4;
		return ((0xff & buffer[offset + -4]) << 24) - (-((0xff & buffer[-3 + offset]) << 16) - (buffer[offset - 2] << 8 & 0xff00) - (buffer[-1 + offset] & 0xff));
	}
	
	final void writeIntV1(int i) {
		buffer[offset++] = (byte) (i >> 8);
		buffer[offset++] = (byte) i;
		buffer[offset++] = (byte) (i >> 24);
		buffer[offset++] = (byte) (i >> 16);
	}
	
	final int method2188(int i) {
		if (i <= 110) {
			return 97;
		}
		anInt7008++;
		offset += 4;
		return (0xff & buffer[-4 + offset]) + ((buffer[offset + -1] << 24 & ~0xffffff) + ((buffer[-2 + offset] & 0xff) << 16) - -(0xff00 & buffer[offset + -3] << 8));
	}
	
	final void method2189(int i, int i_9_) {
		anInt6968++;
		if (i_9_ != 32768) {
			method2197(71);
		}
		if (i >= 0 && i < 128) {
			writeByte(i);
		} else if ((i ^ 0xffffffff) <= -1 && i < 32768) {
			writeShort(i + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	final int method2190(int i, boolean bool) {
		if (bool != false) {
			anInt7023 = -121;
		}
		anInt6979++;
		int i_10_ = Class10.method188((byte) -58, offset, i, buffer);
		writeInt(i_10_);
		return i_10_;
	}
	
	final void method2191(int i, int i_11_) {
		buffer[offset++] = (byte) i_11_;
		anInt6981++;
		if (i <= -24) {
			buffer[offset++] = (byte) (i_11_ >> 8);
		}
	}
	
	final void method2192(int[] is, int i) {
		if (i <= 96) {
			anInt7023 = -75;
		}
		anInt6985++;
		int i_12_ = offset / 8;
		offset = 0;
		for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
			int i_14_ = readInt();
			int i_15_ = readInt();
			int i_16_ = -957401312;
			int i_17_ = -1640531527;
			int i_18_ = 32;
			while (i_18_-- > 0) {
				i_15_ -= (i_14_ >>> 5 ^ i_14_ << 4) - -i_14_ ^ i_16_ - -is[(i_16_ & 0x1834) >>> 11];
				i_16_ -= i_17_;
				i_14_ -= i_16_ + is[i_16_ & 0x3] ^ i_15_ + (i_15_ << 4 ^ i_15_ >>> 5);
			}
			offset -= 8;
			writeInt(i_14_);
			writeInt(i_15_);
		}
	}
	
	final int readShort() {
		offset += 2;
		int i_19_ = (0xff & buffer[-1 + offset]) + ((buffer[-2 + offset] & 0xff) << 8);
		if ((i_19_ ^ 0xffffffff) < -32768) {
			i_19_ -= 65536;
		}
		return i_19_;
	}
	
	final void method2194(int i, int i_20_) {
		anInt6988++;
		buffer[offset + -i - 2] = (byte) (i >> 8);
		buffer[-1 + (offset - i)] = (byte) i;
		if (i_20_ != -2887) {
			readString2();
		}
	}
	
	final String readString() {
		int i_21_ = offset;
		while ((buffer[offset++] ^ 0xffffffff) != -1) {
			/* empty */
		}
		int i_22_ = offset + (-i_21_ - 1);
		if (i_22_ == 0) {
			return "";
		}
		return Class184.method1846(i_21_, buffer, i_22_, (byte) -118);
	}
	
	final long method2196(byte b) {
		if (b != -104) {
			return -23L;
		}
		anInt7003++;
		long l = 0xffffffffL & (long) method2188(114);
		long l_23_ = 0xffffffffL & (long) method2188(112);
		return l + (l_23_ << 32);
	}
	
	final int method2197(int i) {
		anInt6975++;
		int i_24_ = buffer[offset] & 0xff;
		if ((i_24_ ^ 0xffffffff) > i) {
			return readUnsignedByte() - 64;
		}
		return -49152 + readUnsignedShort();
	}
	
	final void writeJagString(String string, int i) {
		anInt6977++;
		int i_26_ = string.indexOf('\0');
		if (i_26_ >= 0) {
			throw new IllegalArgumentException("NUL character at " + i_26_ + " - cannot pjstr2");
		}
		buffer[offset++] = (byte) 0;
		offset += Class173.method1801(string, string.length(), buffer, true, offset, 0);
		buffer[offset++] = (byte) 0;
	}
	
	final void writeShortLE(int i) {
		buffer[offset++] = (byte) i;
		buffer[offset++] = (byte) (i >> 8);
	}
	
	final void writeLong(long l) {
		buffer[offset++] = (byte) (int) (l >> 56);
		anInt6986++;
		buffer[offset++] = (byte) (int) (l >> 48);
		buffer[offset++] = (byte) (int) (l >> 40);
		buffer[offset++] = (byte) (int) (l >> 32);
		buffer[offset++] = (byte) (int) (l >> 24);
		buffer[offset++] = (byte) (int) (l >> 16);
		buffer[offset++] = (byte) (int) (l >> 8);
		buffer[offset++] = (byte) (int) l;
	}
	
	final int readBigSmart() {
	/*	if ((buffer[offset] ^ 0xffffffff) <= -1) {
			int value = readUnsignedShort();
			if (value == 32767) 
				return -1;
			return value;
		}
		return readInt() & 0x7fffffff;*/
		if (-1 < (this.buffer[offset] ^ 0xffffffff))
			return 0x7fffffff & this.readInt();
		int i = this.readUnsignedShort();
		if (32767 == i)
			return -1;
		return i;

	}
	
	final void method2202(int i) {
		anInt7011++;
		if (buffer != null) {
			Class111.method1137(buffer, -251);
		}
		buffer = null;
	}
	
	final void encryptXteas(int[] is, int i, boolean bool, int i_29_) {
		anInt7012++;
		int i_30_ = offset;
		offset = i;
		int i_31_ = (i_29_ - i) / 8;
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
			int i_33_ = readInt();
			int i_34_ = readInt();
			int i_35_ = 0;
			int i_36_ = -1640531527;
			int i_37_ = 32;
			while ((i_37_-- ^ 0xffffffff) < -1) {
				i_33_ += i_34_ + (i_34_ << 4 ^ i_34_ >>> 5) ^ i_35_ + is[0x3 & i_35_];
				i_35_ += i_36_;
				i_34_ += (i_33_ >>> 5 ^ i_33_ << 4) + i_33_ ^ i_35_ + is[i_35_ >>> 11 & ~0x173ffffc];
			}
			offset -= 8;
			writeInt(i_33_);
			writeInt(i_34_);
		}
		if (bool != false) {
			readUnsignedByteC();
		}
		offset = i_30_;
	}
	
	final void method2204(int i, byte b) {
		anInt6999++;
		buffer[-i + (offset + -4)] = (byte) (i >> 24);
		buffer[-3 + (-i + offset)] = (byte) (i >> 16);
		buffer[offset - i + -2] = (byte) (i >> 8);
		buffer[offset + -i - 1] = (byte) i;
		if (b < 126) {
			method2205(-97, null, null);
		}
	}
	
	static final void method2205(int i, Node node, Node node_38_) {
		if (node_38_.aNode2799 != null) {
			node_38_.method2160((byte) 31);
		}
		anInt6960++;
		node_38_.aNode2800 = node;
		node_38_.aNode2799 = node.aNode2799;
		node_38_.aNode2799.aNode2800 = node_38_;
		node_38_.aNode2800.aNode2799 = node_38_;
	}
	
	final void method2206(byte b, int i, long l) {
		i--;
		anInt7010++;
		if (b <= 112) {
			buffer = null;
		}
		if (i < 0 || (i ^ 0xffffffff) < -8) {
			throw new IllegalArgumentException();
		}
		for (int i_40_ = 8 * i; i_40_ >= 0; i_40_ -= 8)
			buffer[offset++] = (byte) (int) (l >> i_40_);
	}
	
	final void writeShortLE128(int i) {
		buffer[offset++] = (byte) (i + 128);
		buffer[offset++] = (byte) (i >> 8);
	}
	
	final int readIntV2() {
		offset += 4;
		return (buffer[offset + -4] << 16 & 0xff0000) + (((buffer[offset + -3] & 0xff) << 24) - -((0xff & buffer[offset + -1]) << 8)) - -(buffer[offset - 2] & 0xff);
	}
	
	final int readUnsignedShortLE() {
		offset += 2;
		return (0xff & buffer[offset - 2]) + ((0xff & buffer[offset - 1]) << 8);
	}
	
	final void writeShort(int i) {
		buffer[offset++] = (byte) (i >> 8);
		buffer[offset++] = (byte) i;
	}
	
	final int readUnsignedByte128() {
		return buffer[offset++] + -128 & 0xff;
	}
	
	final int readShortLE128() {
		offset += 2;
		int i_43_ = (buffer[offset + -1] << 8 & 0xff00) + (0xff & buffer[-2 + offset] - 128);
		if (i_43_ > 32767) {
			i_43_ -= 65536;
		}
		return i_43_;
	}
	
	final int readUnsigned128Byte() {
		return 0xff & -buffer[offset++] + 128;
	}
	
	final byte readByte() {
		return buffer[offset++];
	}
	
	final void writeIntLE(int i) {
			buffer[offset++] = (byte) i;
			buffer[offset++] = (byte) (i >> 8);
			buffer[offset++] = (byte) (i >> 16);
			buffer[offset++] = (byte) (i >> 24);
	}
	
	final boolean method2216(int i) {
		anInt6995++;
		offset -= 4;
		int i_45_ = Class10.method188((byte) -58, offset, i, buffer);
		int i_46_ = readInt();
        return i_45_ == i_46_;
    }
	
	final void method2217(int i) {
		buffer[offset - (i + 1)] = (byte) i;
	}
	
	final int method2218(int i) {
		offset += 2;
		anInt6976++;
		int i_48_ = (0xff & buffer[-2 + offset]) + (buffer[offset - 1] << 8 & 0xff00);
		if (i_48_ > 32767) {
			i_48_ -= 65536;
		}
		return i_48_;
	}
	
	final int readUnsignedShort() {
		offset += 2;
		return (0xff & buffer[-1 + offset]) + ((buffer[-2 + offset] & 0xff) << 8);
	}
	
	final int read24BitInteger() {
		offset += 3;
		return ((buffer[offset - 2] & 0xff) << 8) + ((0xff & buffer[offset - 3]) << 16) - -(buffer[-1 + offset] & 0xff);
	}
	
	final void writeByte128(int i) {
			buffer[offset++] = (byte) (i + 128);
	}
	
	final void applyRsa(int startIndex, BigInteger exponent, BigInteger modulo) {
		anInt7001++;
		int size = offset;
		offset = 0;
		byte[] bs = new byte[size];
		readBytes(bs, startIndex, size);
		BigInteger bytes = new BigInteger(bs);
		BigInteger encrypted = bytes.modPow(modulo, exponent);
		byte[] encryptedBytes = encrypted.toByteArray();
		offset = 0;
		writeShort(encryptedBytes.length);
		writeBytes(encryptedBytes.length, encryptedBytes, 0);
	}
	
	final void writeBytes(int i, byte[] bs, int i_54_) {
			for (int i_55_ = i_54_; i + i_54_ > i_55_; i_55_++)
				buffer[offset++] = bs[i_55_];
	}
	
	final int readUnsignedShort128() {
		offset += 2;
		return (0xff00 & buffer[offset + -2] << 8) + (-128 + buffer[offset - 1] & 0xff);
	}
	
	final void write24BitInt(byte b, int i) {
		buffer[offset++] = (byte) (i >> 16);
		anInt6990++;
		buffer[offset++] = (byte) (i >> 8);
		if (b < 54) {
			writeIntV1(89);
		}
		buffer[offset++] = (byte) i;
	}
	
	final void writeByte(int i) {
		buffer[offset++] = (byte) i;
	}
	
	final int readSmart() {
		int i = buffer[offset] & 0xff;
		if ((i ^ 0xffffffff) > -129)
			return readUnsignedByte();
		return readUnsignedShort() + -32768;
	}
	
	final void writeString(String string) {
		anInt6963++;
		int i_56_ = string.indexOf('\0');
		if (i_56_ >= 0) {
			throw new IllegalArgumentException("NUL character at " + i_56_ + " - cannot pjstr");
		}
		offset += Class173.method1801(string, string.length(), buffer, true, offset, 0);
		buffer[offset++] = (byte) 0;
	}
	
	final int read24BitInteger(byte b) {
		anInt7000++;
		offset += 3;
		int i = (0xff & buffer[-1 + offset]) + (((0xff & buffer[-3 + offset]) << 16) + ((buffer[-2 + offset] & 0xff) << 8));
		if ((i ^ 0xffffffff) < -8388608) {
			i -= 16777216;
		}
		return i;
	}
	
	final void writeShort128(int i) {
		buffer[offset++] = (byte) (i >> 8);
		buffer[offset++] = (byte) (128 + i);
	}
	
	final void method2231(int i, int[] is, int i_59_, int i_60_) {
		anInt6970++;
		int i_61_ = offset;
		offset = i;
		int i_62_ = (-i + i_59_) / 8;
		if (i_60_ != -4901) {
			method2246(-11);
		}
		for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff); i_63_++) {
			int i_64_ = readInt();
			int i_65_ = readInt();
			int i_66_ = -957401312;
			int i_67_ = -1640531527;
			int i_68_ = 32;
			while (i_68_-- > 0) {
				i_65_ -= (i_64_ << 4 ^ i_64_ >>> 5) + i_64_ ^ is[(0x1efb & i_66_) >>> 11] + i_66_;
				i_66_ -= i_67_;
				i_64_ -= i_65_ + (i_65_ >>> 5 ^ i_65_ << 4) ^ i_66_ - -is[i_66_ & 0x3];
			}
			offset -= 8;
			writeInt(i_64_);
			writeInt(i_65_);
		}
		offset = i_61_;
	}
	
	final void method2232(int i, int i_69_) {
		if ((i_69_ & ~0x7f ^ 0xffffffff) != -1) {
			if ((i_69_ & ~0x3fff ^ 0xffffffff) != -1) {
				if ((~0x1fffff & i_69_) != 0) {
					if ((~0xfffffff & i_69_ ^ 0xffffffff) != -1) {
						writeByte(i_69_ >>> 28 | 0x80);
					}
					writeByte((i_69_ | 0x1012b0d2) >>> 21);
				}
				writeByte((i_69_ | 0x203f43) >>> 14);
			}
			writeByte((i_69_ | 0x403a) >>> 7);
		}
		anInt7022++;
		writeByte(0x7f & i_69_);
		if (i != 65280) {
			readLong();
		}
	}
	
	final int readUnsignedByte() {
		return buffer[offset++] & 0xff;
	}
	
	public static void method2234(boolean bool) {
		aClass192_7014 = null;
		if (bool != true) {
			method2205(-95, null, null);
		}
	}
	
	final long readLong() {
		long l = 0xffffffffL & (long) readInt();
		long l_70_ = 0xffffffffL & (long) readInt();
		return l_70_ + (l << 32);
	}
	
	final byte readByteC() {
		return (byte) -buffer[offset++];
	}
	
	final void method2237(int i, int i_71_) {
		anInt6958++;
		if (i != 0) {
			buffer = null;
		}
		buffer[offset++] = (byte) i_71_;
		buffer[offset++] = (byte) (i_71_ >> 8);
		buffer[offset++] = (byte) (i_71_ >> 16);
		buffer[offset++] = (byte) (i_71_ >> 24);
	}
	
	final int readUnsignedByteC() {
		return 0xff & -buffer[offset++];
	}
	
	final int method2239(int i) {
		anInt6962++;
		int i_72_ = buffer[offset++];
		int i_73_ = i;
		for (/**/; i_72_ < 0; i_72_ = buffer[offset++])
			i_73_ = (i_73_ | 0x7f & i_72_) << 7;
		return i_72_ | i_73_;
	}
	
	final String readString2() {
		if (buffer[offset] == 0) {
			offset++;
			return null;
		}
		return readString();
	}
	
	final long method2241(int i) {
		anInt6998++;
		if (i > -53) {
			return -50L;
		}
		long l = 0xffffffffL & (long) readUnsignedByte();
		long l_74_ = 0xffffffffL & (long) readInt();
		return l_74_ + (l << 32);
	}
	
	BufferedStream(int i) {
		offset = 0;
		buffer = Class111.method1139(true, i);
	}
	
	final byte readByte128() {
		return (byte) (buffer[offset++] - 128);
	}
	
	final int readUnsignedShortLE128() {
		offset += 2;
		return (-128 + buffer[offset - 2] & 0xff) + ((0xff & buffer[offset - 1]) << 8);
	}
	
	final long method2244(int i, int i_75_) {
		anInt7020++;
		if ((--i ^ 0xffffffff) > -1 || i > 7) {
			throw new IllegalArgumentException();
		}
		int i_76_ = i * i_75_;
		long l = 0L;
		for (/**/; i_76_ >= 0; i_76_ -= 8)
			l |= (0xffL & (long) buffer[offset++]) << i_76_;
		return l;
	}
	
	BufferedStream(byte[] bs) {
		buffer = bs;
		offset = 0;
	}
	
	final void write128Byte(int i) {
		buffer[offset++] = (byte) (-i + 128);
	}
	
	final int method2246(int i) {
		anInt6967++;
		if (i != -22301) {
			offset = -18;
		}
		offset += 3;
		return ((0xff & buffer[offset - 3]) << 16) - (-(buffer[offset - 1] << 8 & 0xff00) - (0xff & buffer[-2 + offset]));
	}
}
