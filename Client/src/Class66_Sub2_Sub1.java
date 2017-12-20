/* Class66_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66_Sub2_Sub1 extends Class66_Sub2
{
	static int anInt10577;
	static Interface21[] anInterface21Array10578 = new Interface21[75];
	static int anInt10579;
	static int anInt10580;
	static OutcommingPacket aClass318_10581;
	static int anInt10582 = 0;
	static long[] aLongArray10583;
	static long[][] aLongArrayArray10584;
	
	final void method726(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (i_1_ != 4) {
			anInt10582 = -78;
		}
		anInt10579++;
		int i_4_ = aGLSprite8999.method1197();
		int i_5_ = ((Class150_Sub3_Sub1) aClass150_5171).anInt10574 * Class295.method3471((byte) -65) / 10 % i_4_;
		aGLSprite8999.method1192(i_0_ - (i_4_ - i_5_), i, -i_5_ + i_2_ + i_4_, i_3_);
	}
	
	Class66_Sub2_Sub1(Index class302, Index class302_6_, Class150_Sub3_Sub1 class150_sub3_sub1) {
		super(class302, class302_6_, class150_sub3_sub1);
	}
	
	static final void method727(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_9_ <= -92) {
			anInt10580++;
			if ((Class262_Sub4.anInt7722 ^ 0xffffffff) >= (i ^ 0xffffffff) && (za_Sub2.anInt10513 ^ 0xffffffff) <= (i ^ 0xffffffff)) {
				i_8_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_8_);
				i_10_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_10_);
				Class50.method511(i_10_, i_8_, i_7_, i, 1);
			}
		}
	}
	
	static final int method728(int i, boolean bool, byte[] bs) {
		anInt10577++;
		if (bool != false) {
			return 102;
		}
		return Class10.method188((byte) -58, i, 0, bs);
	}
	
	public static void method729(byte b) {
		aLongArray10583 = null;
		aClass318_10581 = null;
		if (b >= -5) {
			method728(36, true, null);
		}
		anInterface21Array10578 = null;
		aLongArrayArray10584 = null;
	}
	
	static {
		aClass318_10581 = new OutcommingPacket(92, 3);
		aLongArray10583 = new long[11];
		aLongArrayArray10584 = new long[8][256];
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			int i_11_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = (long) ((0x1 & i ^ 0xffffffff) != -1 ? 0xff & i_11_ : i_11_ >>> 8);
			long l_12_ = l << 1;
			if (l_12_ >= 256L) {
				l_12_ ^= 0x11dL;
			}
			long l_13_ = l_12_ << 1;
			if ((l_13_ ^ 0xffffffffffffffffL) <= -257L) {
				l_13_ ^= 0x11dL;
			}
			long l_14_ = l_13_ ^ l;
			long l_15_ = l_13_ << 1;
			if (l_15_ >= 256L) {
				l_15_ ^= 0x11dL;
			}
			long l_16_ = l_15_ ^ l;
			aLongArrayArray10584[0][i] = Class379.method4162(Class379.method4162(l_12_ << 8, Class379.method4162(Class379.method4162(Class379.method4162(l << 32, Class379.method4162(Class379.method4162(l << 48, l << 56), l_13_ << 40)), l_15_ << 24), l_14_ << 16)), l_16_);
			for (int i_17_ = 1; i_17_ < 8; i_17_++)
				aLongArrayArray10584[i_17_][i] = Class379.method4162(aLongArrayArray10584[i_17_ + -1][i] >>> 8, aLongArrayArray10584[i_17_ + -1][i] << 56);
		}
		aLongArray10583[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_18_ = i * 8 - 8;
			aLongArray10583[i] = Class262_Sub11.method3177(Class300.method3496(aLongArrayArray10584[7][i_18_ - -7], 255L), Class262_Sub11.method3177(Class300.method3496(aLongArrayArray10584[6][6 + i_18_], 65280L), Class262_Sub11.method3177(Class262_Sub11.method3177(Class262_Sub11.method3177(Class262_Sub11.method3177(Class300.method3496(280375465082880L, aLongArrayArray10584[2][i_18_ + 2]), Class262_Sub11.method3177(Class300.method3496(aLongArrayArray10584[0][i_18_], -72057594037927936L), Class300.method3496(aLongArrayArray10584[1][i_18_ + 1], 71776119061217280L))), Class300.method3496(1095216660480L, aLongArrayArray10584[3][3 + i_18_])), Class300.method3496(aLongArrayArray10584[4][4 + i_18_], 4278190080L)), Class300.method3496(aLongArrayArray10584[5][5 + i_18_], 16711680L))));
		}
	}
}
