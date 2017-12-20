/* SeekableFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class SeekableFile
{
	static int anInt3871;
	static int anInt3872;
	static int anInt3873;
	static int anInt3874;
	static int anInt3875;
	static int anInt3876;
	static int anInt3877;
	private long aLong3878;
	private long aLong3879;
	private int anInt3880 = 0;
	static Index index6;
	static int anInt3882;
	static double aDouble3883;
	static Animable[] anAnimableArray3884;
	private byte[] aByteArray3885;
	static int anInt3886;
	private long aLong3887;
	private long aLong3888;
	static int anInt3889;
	private FileOnDisk aFileOnDisk3890;
	private int anInt3891;
	static int anInt3892;
	private long aLong3893 = -1L;
	private byte[] aByteArray3894;
	private long aLong3895 = -1L;
	
	private final File method3567(int i) {
		if (i != 65536) {
			return null;
		}
		anInt3871++;
		return aFileOnDisk3890.method1104(false);
	}
	
	final void method3568(int i, int i_0_, byte[] bs, int i_1_) throws IOException {
		anInt3875++;
		try {
			if (bs.length < i_0_ + i_1_) {
				throw new ArrayIndexOutOfBoundsException(i_0_ + i_1_ + -bs.length);
			}
			if (i >= -58) {
				method3567(-1);
			}
			if ((aLong3895 ^ 0xffffffffffffffffL) != 0L && (aLong3878 ^ 0xffffffffffffffffL) <= (aLong3895 ^ 0xffffffffffffffffL) && ((long) i_0_ + aLong3878 ^ 0xffffffffffffffffL) >= ((long) anInt3880 + aLong3895 ^ 0xffffffffffffffffL)) {
				Class311.method3608(aByteArray3894, (int) (-aLong3895 + aLong3878), bs, i_1_, i_0_);
				aLong3878 += (long) i_0_;
				return;
			}
			long l = aLong3878;
			int i_2_ = i_1_;
			int i_3_ = i_0_;
			if (aLong3878 >= aLong3893 && (aLong3878 ^ 0xffffffffffffffffL) > (aLong3893 - -(long) anInt3891 ^ 0xffffffffffffffffL)) {
				int i_4_ = (int) ((long) anInt3891 + -aLong3878 - -aLong3893);
				if (i_0_ < i_4_) {
					i_4_ = i_0_;
				}
				Class311.method3608(aByteArray3885, (int) (aLong3878 + -aLong3893), bs, i_1_, i_4_);
				aLong3878 += (long) i_4_;
				i_1_ += i_4_;
				i_0_ -= i_4_;
			}
			if (aByteArray3885.length < i_0_) {
				aFileOnDisk3890.method1100(true, aLong3878);
				aLong3887 = aLong3878;
				while (i_0_ > 0) {
					int i_5_ = aFileOnDisk3890.method1103((byte) -115, i_0_, bs, i_1_);
					if (i_5_ == -1) {
						break;
					}
					aLong3878 += (long) i_5_;
					i_0_ -= i_5_;
					i_1_ += i_5_;
					aLong3887 += (long) i_5_;
				}
			} else if ((i_0_ ^ 0xffffffff) < -1) {
				method3572((byte) -128);
				int i_6_ = i_0_;
				if (anInt3891 < i_6_) {
					i_6_ = anInt3891;
				}
				Class311.method3608(aByteArray3885, 0, bs, i_1_, i_6_);
				i_1_ += i_6_;
				aLong3878 += (long) i_6_;
				i_0_ -= i_6_;
			}
			if ((aLong3895 ^ 0xffffffffffffffffL) != 0L) {
				if (aLong3895 > aLong3878 && i_0_ > 0) {
					int i_7_ = (int) (-aLong3878 + aLong3895) + i_1_;
					if ((i_7_ ^ 0xffffffff) < (i_0_ + i_1_ ^ 0xffffffff)) {
						i_7_ = i_1_ - -i_0_;
					}
					while ((i_7_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
						i_0_--;
						bs[i_1_++] = (byte) 0;
						aLong3878++;
					}
				}
				long l_8_ = -1L;
				if (l > aLong3895 || (aLong3895 ^ 0xffffffffffffffffL) <= (l - -(long) i_3_ ^ 0xffffffffffffffffL)) {
					if (aLong3895 <= l && (aLong3895 + (long) anInt3880 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)) {
						l_8_ = l;
					}
				} else {
					l_8_ = aLong3895;
				}
				long l_9_ = -1L;
				if (l >= aLong3895 - -(long) anInt3880 || (long) i_3_ + l < aLong3895 + (long) anInt3880) {
					if ((aLong3895 ^ 0xffffffffffffffffL) > (l - -(long) i_3_ ^ 0xffffffffffffffffL) && ((long) anInt3880 + aLong3895 ^ 0xffffffffffffffffL) <= (l - -(long) i_3_ ^ 0xffffffffffffffffL)) {
						l_9_ = (long) i_3_ + l;
					}
				} else {
					l_9_ = (long) anInt3880 + aLong3895;
				}
				if ((l_8_ ^ 0xffffffffffffffffL) < 0L && l_9_ > l_8_) {
					int i_10_ = (int) (-l_8_ + l_9_);
					Class311.method3608(aByteArray3894, (int) (l_8_ + -aLong3895), bs, i_2_ - -(int) (-l + l_8_), i_10_);
					if (l_9_ > aLong3878) {
						i_0_ -= l_9_ - aLong3878;
						aLong3878 = l_9_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong3887 = -1L;
			throw ioexception;
		}
		if ((i_0_ ^ 0xffffffff) < -1) {
			throw new EOFException();
		}
	}
	
	static final int method3569(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		anInt3877++;
		int i_15_ = i - Class335.anIntArray4165[i_14_ * 8192 / i_11_] >> 1;
		return (i_15_ * i_13_ >> 16) + (i_12_ * (-i_15_ + 65536) >> 16);
	}
	
	final void method3570(int i, int i_16_, int i_17_, byte[] bs) throws IOException {
		anInt3872++;
		try {
			if (aLong3888 < (long) i_17_ + aLong3878) {
				aLong3888 = (long) i_17_ + aLong3878;
			}
			if ((aLong3895 ^ 0xffffffffffffffffL) != 0L && ((aLong3895 ^ 0xffffffffffffffffL) < (aLong3878 ^ 0xffffffffffffffffL) || (long) anInt3880 + aLong3895 < aLong3878)) {
				method3576(true);
			}
			if ((aLong3895 ^ 0xffffffffffffffffL) != 0L && aLong3895 - -(long) aByteArray3894.length < aLong3878 + (long) i_17_) {
				int i_18_ = (int) (-aLong3878 - (-aLong3895 - (long) aByteArray3894.length));
				Class311.method3608(bs, i_16_, aByteArray3894, (int) (aLong3878 + -aLong3895), i_18_);
				i_16_ += i_18_;
				i_17_ -= i_18_;
				aLong3878 += (long) i_18_;
				anInt3880 = aByteArray3894.length;
				method3576(true);
			}
			if (i_17_ > aByteArray3894.length) {
				if ((aLong3887 ^ 0xffffffffffffffffL) != (aLong3878 ^ 0xffffffffffffffffL)) {
					aFileOnDisk3890.method1100(true, aLong3878);
					aLong3887 = aLong3878;
				}
				aFileOnDisk3890.method1102((byte) 76, bs, i_16_, i_17_);
				aLong3887 += (long) i_17_;
				if (aLong3887 > aLong3879) {
					aLong3879 = aLong3887;
				}
				long l = -1L;
				if (aLong3893 > aLong3878 || aLong3878 >= (long) anInt3891 + aLong3893) {
					if ((aLong3878 ^ 0xffffffffffffffffL) >= (aLong3893 ^ 0xffffffffffffffffL) && (long) i_17_ + aLong3878 > aLong3893) {
						l = aLong3893;
					}
				} else {
					l = aLong3878;
				}
				long l_19_ = -1L;
				if (aLong3893 < (long) i_17_ + aLong3878 && aLong3893 - -(long) anInt3891 >= aLong3878 - -(long) i_17_) {
					l_19_ = (long) i_17_ + aLong3878;
				} else if (aLong3878 < (long) anInt3891 + aLong3893 && aLong3878 - -(long) i_17_ >= (long) anInt3891 + aLong3893) {
					l_19_ = aLong3893 + (long) anInt3891;
				}
				if (l > -1L && l < l_19_) {
					int i_20_ = (int) (-l + l_19_);
					Class311.method3608(bs, (int) (l + (long) i_16_ - aLong3878), aByteArray3885, (int) (l + -aLong3893), i_20_);
				}
				aLong3878 += (long) i_17_;
				return;
			}
			if (i_17_ > 0) {
				if (aLong3895 == -1L) {
					aLong3895 = aLong3878;
				}
				Class311.method3608(bs, i_16_, aByteArray3894, (int) (-aLong3895 + aLong3878), i_17_);
				aLong3878 += (long) i_17_;
				if (((long) anInt3880 ^ 0xffffffffffffffffL) > (aLong3878 + -aLong3895 ^ 0xffffffffffffffffL)) {
					anInt3880 = (int) (-aLong3895 + aLong3878);
				}
				return;
			}
		} catch (IOException ioexception) {
			aLong3887 = -1L;
			throw ioexception;
		}
		if (i != 5033) {
			method3567(-38);
		}
	}
	
	static final boolean method3571(byte b, int i, int i_21_) {
		anInt3889++;
		if (b != 61) {
			method3578(13);
		}
        return !(!((0x70000 & i_21_) != 0 | Class321.method3800(i_21_, i, 126)) && !Class262_Sub15_Sub1.method3192(i, i_21_, 512));
    }
	
	private final void method3572(byte b) throws IOException {
		anInt3886++;
		anInt3891 = 0;
		if (b > -119) {
			anInt3880 = -97;
		}
		if (aLong3878 != aLong3887) {
			aFileOnDisk3890.method1100(true, aLong3878);
			aLong3887 = aLong3878;
		}
		aLong3893 = aLong3878;
		while ((anInt3891 ^ 0xffffffff) > (aByteArray3885.length ^ 0xffffffff)) {
			int i = aByteArray3885.length - anInt3891;
			if ((i ^ 0xffffffff) < -200000001) {
				i = 200000000;
			}
			int i_22_ = aFileOnDisk3890.method1103((byte) -115, i, aByteArray3885, anInt3891);
			if (i_22_ == -1) {
				break;
			}
			anInt3891 += i_22_;
			aLong3887 += (long) i_22_;
		}
	}
	
	final long method3573(int i) {
		anInt3873++;
		if (i != -1) {
			aByteArray3885 = null;
		}
		return aLong3888;
	}
	
	final void method3574(byte[] bs, byte b) throws IOException {
		method3568(-77, bs.length, bs, 0);
		anInt3874++;
		@SuppressWarnings("unused")
		int i = 23 / ((-64 - b) / 39);
	}
	
	final void method3575(int i) throws IOException {
		method3576(true);
		anInt3876++;
		aFileOnDisk3890.method1098(true);
		if (i != 2) {
			anInt3891 = 42;
		}
	}
	
	private final void method3576(boolean bool) throws IOException {
		if (bool != true) {
			aLong3888 = 87L;
		}
		if ((aLong3895 ^ 0xffffffffffffffffL) != 0L) {
			if ((aLong3895 ^ 0xffffffffffffffffL) != (aLong3887 ^ 0xffffffffffffffffL)) {
				aFileOnDisk3890.method1100(bool, aLong3895);
				aLong3887 = aLong3895;
			}
			aFileOnDisk3890.method1102((byte) 76, aByteArray3894, 0, anInt3880);
			aLong3887 += (long) anInt3880;
			if (aLong3887 > aLong3879) {
				aLong3879 = aLong3887;
			}
			long l = -1L;
			long l_23_ = -1L;
			if ((aLong3893 ^ 0xffffffffffffffffL) >= (aLong3895 ^ 0xffffffffffffffffL) && (aLong3895 ^ 0xffffffffffffffffL) > (aLong3893 + (long) anInt3891 ^ 0xffffffffffffffffL)) {
				l = aLong3895;
			} else if (aLong3893 >= aLong3895 && ((long) anInt3880 + aLong3895 ^ 0xffffffffffffffffL) < (aLong3893 ^ 0xffffffffffffffffL)) {
				l = aLong3893;
			}
			if (aLong3893 >= aLong3895 - -(long) anInt3880 || (long) anInt3891 + aLong3893 < aLong3895 - -(long) anInt3880) {
				if (aLong3895 < aLong3893 + (long) anInt3891 && ((long) anInt3880 + aLong3895 ^ 0xffffffffffffffffL) <= (aLong3893 - -(long) anInt3891 ^ 0xffffffffffffffffL)) {
					l_23_ = (long) anInt3891 + aLong3893;
				}
			} else {
				l_23_ = aLong3895 + (long) anInt3880;
			}
			if (l > -1L && (l_23_ ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)) {
				int i = (int) (l_23_ + -l);
				Class311.method3608(aByteArray3894, (int) (l + -aLong3895), aByteArray3885, (int) (l + -aLong3893), i);
			}
			anInt3880 = 0;
			aLong3895 = -1L;
		}
		anInt3882++;
	}
	
	final void method3577(long l, boolean bool) throws IOException {
		anInt3892++;
		if ((l ^ 0xffffffffffffffffL) > -1L) {
			throw new IOException("Invalid seek to " + l + " in file " + method3567(65536));
		}
		aLong3878 = l;
		if (bool != false) {
			method3578(-99);
		}
	}
	
	public static void method3578(int i) {
		anAnimableArray3884 = null;
		index6 = null;
		if (i != 65280) {
			method3571((byte) 4, 23, 116);
		}
	}
	
	SeekableFile(FileOnDisk fileondisk, int i, int i_24_) throws IOException {
		aFileOnDisk3890 = fileondisk;
		aLong3888 = aLong3879 = fileondisk.method1101(0);
		aLong3878 = 0L;
		aByteArray3885 = new byte[i];
		aByteArray3894 = new byte[i_24_];
	}
}
