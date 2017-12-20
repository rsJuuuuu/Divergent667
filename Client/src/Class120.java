/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class120
{
	static int anInt1517;
	static int anInt1518;
	static int anInt1519;
	static int anInt1520;
	
	static final void method1228(int i) {
		if (i > -93) {
			method1228(-86);
		}
		anInt1520++;
		Class320_Sub27.aBoolean8465 = true;
	}
	
	static final void method1229(String string, String string_0_, byte b) {
		anInt1519++;
		if (string_0_.length() <= 320 && Node_Sub38_Sub23.method2866(false)) {
			Class218.aClass123_2560.method1513(b + -28264);
			Class198.method2005((byte) -126);
			Node_Sub5.password = string;
			Class243.username = string_0_;
			if (b == 88) {
				Class48.method478(5, (byte) 113);
			}
		}
	}
	
	static final void method1230(int i) {
		anInt1517++;
		FileOnDisk fileondisk = null;
		try {
			Class241 class241 = Class240.aSignLink2946.method3631(true, "2", (byte) 126);
			while (class241.anInt2953 == 0)
				Class262_Sub22.method3208(1L, false);
			if ((class241.anInt2953 ^ 0xffffffff) == -2) {
				fileondisk = (FileOnDisk) class241.anObject2956;
				byte[] bs = new byte[(int) fileondisk.method1101(0)];
				int i_1_;
				for (int i_2_ = 0; i_2_ < bs.length; i_2_ += i_1_) {
					i_1_ = fileondisk.method1103((byte) -115, bs.length - i_2_, bs, i_2_);
					if (i_1_ == -1) {
						throw new IOException("EOF");
					}
				}
				CacheNode_Sub14_Sub2.method2353((byte) -42, new BufferedStream(bs));
			}
		} catch (Exception exception) {
			/* empty */
		}
		if (i > 117) {
			do {
				try {
					if (fileondisk == null) {
						break;
					}
					fileondisk.method1098(true);
				} catch (Exception exception) {
					break;
				}
				break;
			} while (false);
		}
	}
}
