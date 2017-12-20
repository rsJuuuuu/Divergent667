/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class65
{
	private Class227[] aClass227Array925;
	private int anInt926;
	private int anInt927;
	
	static final Class65 method714(Index class302, int i, int i_0_) {
		byte[] bs = class302.method3524(false, i_0_, i);
		if (bs == null) {
			return null;
		}
		return new Class65(new BufferedStream(bs));
	}
	
	private final byte[] method715() {
		int i = 0;
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
			if (aClass227Array925[i_1_] != null && aClass227Array925[i_1_].anInt2698 + aClass227Array925[i_1_].anInt2707 > i) {
				i = aClass227Array925[i_1_].anInt2698 + aClass227Array925[i_1_].anInt2707;
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		int i_2_ = 22050 * i / 1000;
		byte[] bs = new byte[i_2_];
		for (int i_3_ = 0; i_3_ < 10; i_3_++) {
			if (aClass227Array925[i_3_] != null) {
				int i_4_ = aClass227Array925[i_3_].anInt2698 * 22050 / 1000;
				int i_5_ = aClass227Array925[i_3_].anInt2707 * 22050 / 1000;
				int[] is = aClass227Array925[i_3_].method2117(i_4_, aClass227Array925[i_3_].anInt2698);
				for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
					int i_7_ = bs[i_6_ + i_5_] + (is[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0) {
						i_7_ = i_7_ >> 31 ^ 0x7f;
					}
					bs[i_6_ + i_5_] = (byte) i_7_;
				}
			}
		}
		return bs;
	}
	
	final Node_Sub45_Sub1 method716() {
		byte[] bs = method715();
		return new Node_Sub45_Sub1(22050, bs, 22050 * anInt926 / 1000, 22050 * anInt927 / 1000);
	}
	
	final int method717() {
		int i = 9999999;
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
			if (aClass227Array925[i_8_] != null && aClass227Array925[i_8_].anInt2707 / 20 < i) {
				i = aClass227Array925[i_8_].anInt2707 / 20;
			}
		}
		if (anInt926 < anInt927 && anInt926 / 20 < i) {
			i = anInt926 / 20;
		}
		if (i == 9999999 || i == 0) {
			return 0;
		}
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (aClass227Array925[i_9_] != null) {
				aClass227Array925[i_9_].anInt2707 -= i * 20;
			}
		}
		if (anInt926 < anInt927) {
			anInt926 -= i * 20;
			anInt927 -= i * 20;
		}
		return i;
	}
	
	private Class65(BufferedStream buffer) {
		aClass227Array925 = new Class227[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = buffer.readUnsignedByte();
			if (i_10_ != 0) {
				buffer.offset--;
				aClass227Array925[i] = new Class227();
				aClass227Array925[i].method2116(buffer);
			}
		}
		anInt926 = buffer.readUnsignedShort();
		anInt927 = buffer.readUnsignedShort();
	}
	
	private Class65() {
		aClass227Array925 = new Class227[10];
	}
}
