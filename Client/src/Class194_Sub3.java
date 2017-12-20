/* Class194_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

class Class194_Sub3 extends Class194
{
	static int anInt6900;
	static Class129 aClass129_6901;
	static int anInt6902;
	static int anInt6903;
	static int anInt6904 = -1;
	static int anInt6905;
	static int anInt6906;
	static int anInt6907;
	static int anInt6908;
	
	static final boolean method1973(int i, int i_0_) {
		anInt6908++;
		if (i == 19 || (i ^ 0xffffffff) == -14 || i == 46 || i == 8 || i == 1010 || (i ^ 0xffffffff) == -1009) {
			return true;
		}
		if (i == 60) {
			return true;
		}
		if (i_0_ != 31922) {
			method1976(false, 107);
		}
		return false;
	}
	
	public static void method1974(int i) {
		aClass129_6901 = null;
		if (i != 16845) {
			method1976(false, -116);
		}
	}
	
	static final int method1975(int i, BufferedStream buffer, String string) {
		anInt6905++;
		if (i <= 8) {
			return 38;
		}
		int i_1_ = buffer.offset;
		byte[] bs = Class320_Sub21.method3763(25, string);
		buffer.method2189(bs.length, 32768);
		buffer.offset += Class342.aClass163_4236.method1737(buffer.offset, 0, bs.length, 47, buffer.buffer, bs);
		return buffer.offset - i_1_;
	}
	
	static final void method1976(boolean bool, int i) {
		if (Class243.aClass340_3069 == null) {
			Class124.method1525(i + 95);
		}
		anInt6906++;
		if (i == 5) {
			if (bool) {
				Class243.aClass340_3069.method3951((byte) 66);
			}
		}
	}
	
	static final int method1977(int i) {
		anInt6902++;
		if (Class213.aNode_Sub27_2512.aClass320_Sub10_7300.method3718(false) == 0) {
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class357.anInt4429 ^ 0xffffffff); i_2_++) {
				if ((Class320_Sub7.anInterface21Array8275[i_2_].method77(-24069) ^ 0xffffffff) == -116 || Class320_Sub7.anInterface21Array8275[i_2_].method77(i ^ ~0x5e05) == 'S') {
					Class213.aNode_Sub27_2512.method2690(56, 1, Class213.aNode_Sub27_2512.aClass320_Sub10_7300);
					Node_Sub32.aBoolean7377 = true;
					break;
				}
			}
		}
		if (Class110.aClass110_1384 == Class252.aClass110_3189) {
			Runtime runtime = Runtime.getRuntime();
			int i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			long l = Class313.method3650(false);
			if (Class4.aLong123 == 0L) {
				Class4.aLong123 = l;
			}
			if (i_3_ > 16384 && -Class4.aLong123 + l < 5000L) {
				if (-Class290.aLong3647 + l > 1000L) {
					System.gc();
					Class290.aLong3647 = l;
				}
				return 0;
			}
		}
		if (Class110.aClass110_1390 == Class252.aClass110_3189) {
			if (Class144_Sub1.aClass232_6802 == null) {
				Class144_Sub1.aClass232_6802 = new Class232(Class267.aClass266_3449, Class320_Sub1.aClass141_8207, Class239.RSA_EXPONENT, Node_Sub38_Sub32.aBigInteger10430);
			}
			if (!Class144_Sub1.aClass232_6802.method2136(255)) {
				return 0;
			}
			Node_Sub38_Sub27.method2878(73, null, true, 0);
			Class320_Sub13.aBoolean8335 = !Node_Sub46.method2948(16062);
			Class320_Sub6.index32or34 = Class58.method576(false, Class320_Sub13.aBoolean8335 ? 34 : 32, 1, i + 1);
			Class273.index33 = Class58.method576(false, 33, 1, 2);
			AnimableAnimator_Sub1.aClass302_9091 = Class58.method576(false, 13, 1, i ^ 0x3);
		}
		if (Class110.aClass110_1392 == Class252.aClass110_3189) {
			boolean bool = Class273.index33.method3520((byte) 15);
			int i_4_ = GraphicsToolkit.aClass34_Sub1Array1547[33].method376(i + 99);
			i_4_ = i_4_ + GraphicsToolkit.aClass34_Sub1Array1547[!Class320_Sub13.aBoolean8335 ? 32 : 34].method376(100);
			i_4_ += GraphicsToolkit.aClass34_Sub1Array1547[13].method376(i + 99);
			i_4_ = i_4_ + (bool ? 100 : Class273.index33.method3511(19492));
			if (i_4_ != 400) {
				return i_4_ / 4;
			}
			Class171.anInt2066 = Class320_Sub6.index32or34.method3505(false);
			Class251.anInt3185 = Class273.index33.method3505(false);
			Node_Sub38_Sub28.method2888((byte) 61, Class320_Sub6.index32or34);
			int i_5_ = Class213.aNode_Sub27_2512.aClass320_Sub11_7264.method3722(false);
			Class174.aClass250_2094 = new Class250(Class209.aClass353_2483, Class35.language, Class273.index33);
			int[] is = Class174.aClass250_2094.method3091(i_5_, (byte) 104);
			if (is.length == 0) {
				is = Class174.aClass250_2094.method3091(0, (byte) 100);
			}
			Class373 class373 = new Class373(Class320_Sub6.index32or34, AnimableAnimator_Sub1.aClass302_9091);
			if (is.length > 0) {
				Class235_Sub1.anInterface16Array8978 = new Interface16[is.length];
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (Class235_Sub1.anInterface16Array8978.length ^ 0xffffffff); i_6_++)
					Class235_Sub1.anInterface16Array8978[i_6_] = new Class327(Class174.aClass250_2094.method3093(is[i_6_], false), class373);
			}
		}
		if (Class110.aClass110_1394 == Class252.aClass110_3189) {
			Class49.method484((byte) 111, AnimableAnimator_Sub1.aClass302_9091, Class320_Sub6.index32or34, Class36.method392((byte) -36));
		}
		if (Class110.aClass110_1395 == Class252.aClass110_3189) {
			int i_7_ = Class190.method1940(255);
			int i_8_ = aa_Sub3.method160(i ^ ~0x15c5);
			if (i_8_ > i_7_) {
				return 100 * i_7_ / i_8_;
			}
		}
		if (Class110.aClass110_1396 == Class252.aClass110_3189) {
			if (Class235_Sub1.anInterface16Array8978 != null && (Class235_Sub1.anInterface16Array8978.length ^ 0xffffffff) < -1) {
				if ((Class235_Sub1.anInterface16Array8978[0].method58(27285) ^ 0xffffffff) > -101) {
					return 0;
				}
				if ((Class235_Sub1.anInterface16Array8978.length ^ 0xffffffff) < -2 && Class174.aClass250_2094.method3092(false) && (Class235_Sub1.anInterface16Array8978[1].method58(27285) ^ 0xffffffff) > -101) {
					return 0;
				}
			}
			Class300.method3497((byte) 107, Class93.aGraphicsToolkit1241);
			Class320_Sub21.method3760(true, Class93.aGraphicsToolkit1241);
			Class48.method478(1, (byte) 126);
		}
		if (Class110.aClass110_1397 == Class252.aClass110_3189) {
			for (int i_9_ = 0; i_9_ < 4; i_9_++)
				Class304.SCENE_CLIP_DATA_PLANES[i_9_] = Class63.method707(Node_Sub54.GAME_SCENE_WDITH, Class377_Sub1.GAME_SCENE_HEIGHT, (byte) 42);
		}
		if (Class252.aClass110_3189 == Class110.aClass110_1398) {
			Node_Sub38_Sub39.aClass302_10500 = Class58.method576(false, 8, 1, i + 1);
			Class181.aClass302_2158 = Class58.method576(false, 0, 1, i ^ 0x3);
			Class75.aClass302_1003 = Class58.method576(false, 1, 1, 2);
			Class4.index2 = Class58.method576(false, 2, 1, 2);
			Class293.aClass302_3681 = Class58.method576(false, 3, 1, 2);
			Class148.aClass302_1827 = Class58.method576(false, 4, 1, 2);
			Animable_Sub1_Sub1.aClass302_10618 = Class58.method576(true, 5, 1, 2);
			SeekableFile.index6 = Class58.method576(true, 6, 1, i ^ 0x3);
			Class107.aClass302_1364 = Class58.method576(false, 7, 1, 2);
			Class282.aClass302_3583 = Class58.method576(false, 9, 1, i ^ 0x3);
			Class250.aClass302_3179 = Class58.method576(false, 10, 1, 2);
			Class179.aClass302_2132 = Class58.method576(false, 11, 1, 2);
			Class21.aClass302_357 = Class58.method576(false, 12, 1, 2);
			Class78.aClass302_1033 = Class58.method576(false, 14, 1, i ^ 0x3);
			Class218.aClass302_2563 = Class58.method576(false, 15, 1, 2);
			Class247.aClass302_3143 = Class58.method576(false, 16, 1, 2);
			Class14.index17 = Class58.method576(false, 17, 1, 2);
			Class174.aClass302_2093 = Class58.method576(false, 18, 1, i + 1);
			Class205.index19 = Class58.method576(false, 19, 1, i ^ 0x3);
			Class262_Sub23.aClass302_7886 = Class58.method576(false, 20, 1, i + 1);
			Node_Sub15_Sub5.aClass302_9805 = Class58.method576(false, 21, 1, i ^ 0x3);
			Class127.index22 = Class58.method576(false, 22, 1, 2);
			r_Sub1.aClass302_11047 = Class58.method576(true, 23, 1, i ^ 0x3);
			Node_Sub38_Sub4.aClass302_10116 = Class58.method576(false, 24, 1, i + 1);
			Node_Sub18.aClass302_7150 = Class58.method576(false, 25, 1, 2);
			Node_Sub38_Sub10.aClass302_10197 = Class58.method576(true, 26, 1, 2);
			CacheNode_Sub5.aClass302_9477 = Class58.method576(false, 27, 1, i + 1);
			Class176.aClass302_2102 = Class58.method576(true, 28, 1, i + 1);
			Class262_Sub3.aClass302_7715 = Class58.method576(false, 29, 1, 2);
			Node_Sub15_Sub10.aClass302_9853 = Class58.method576(true, 35, 1, 2);
			Class326.index30 = Class58.method576(true, 30, 1, i ^ 0x3);
			Class262_Sub2.index31 = Class58.method576(true, 31, 1, i ^ 0x3);
			Node_Sub38_Sub38.index36 = Class58.method576(true, 36, 2, 2);
		}
		if (Class252.aClass110_3189 == Class110.aClass110_1399) {
			int i_10_ = 0;
			for (int i_11_ = 0; i_11_ < GraphicsToolkit.aClass34_Sub1Array1547.length; i_11_++) {
				if (GraphicsToolkit.aClass34_Sub1Array1547[i_11_] != null) {
					i_10_ = i_10_ + GraphicsToolkit.aClass34_Sub1Array1547[i_11_].method376(i + 99) * Class249.anIntArray3151[i_11_] / 100;
				}
			}
			if ((i_10_ ^ 0xffffffff) != -101) {
				if (Node_Sub51.anInt7633 < 0) {
					Node_Sub51.anInt7633 = i_10_;
				}
				return 100 * (-Node_Sub51.anInt7633 + i_10_) / (100 - Node_Sub51.anInt7633);
			}
			Node_Sub16.method2589(Node_Sub38_Sub39.aClass302_10500, 1);
			Class49.method484((byte) 103, AnimableAnimator_Sub1.aClass302_9091, Node_Sub38_Sub39.aClass302_10500, Class36.method392((byte) -13));
		}
		if (Class252.aClass110_3189 == Class110.aClass110_1400) {
			byte[] bs = Class176.aClass302_2102.method3518((byte) 52, 4);
			if (bs == null) {
				return 0;
			}
			MainFile.method175(bs, true);
			ItemDefinitions.method1690((byte) -109);
			Class48.method478(2, (byte) 100);
		}
		if (i != 1) {
			method1973(15, -83);
		}
		if (Class110.aClass110_1401 == Class252.aClass110_3189) {
			IOException_Sub1.method133(255, Class326.index30, Class240.aSignLink2946);
		}
		if (Class110.aClass110_1402 == Class252.aClass110_3189) {
			int i_12_ = Class290_Sub6.method3438(i + 14626);
			if ((i_12_ ^ 0xffffffff) > -101) {
				return i_12_;
			}
			Class268.method3292((byte) -127, Class176.aClass302_2102.method3518((byte) 111, 1));
			CacheNode_Sub4.aClass1_9466 = new Class1(Class176.aClass302_2102);
			Class45.aShortArrayArray5265 = CacheNode_Sub4.aClass1_9466.aShortArrayArray106;
			Class117_Sub2.aShortArrayArrayArray5151 = CacheNode_Sub4.aClass1_9466.aShortArrayArrayArray113;
			Class63.aClass363_922 = new Class363(Class176.aClass302_2102);
		}
		if (Class110.aClass110_1403 == Class252.aClass110_3189) {
			if ((CacheNode_Sub4.aClass1_9466.anInt110 ^ 0xffffffff) != 0 && !Class107.aClass302_1364.method3515(0, CacheNode_Sub4.aClass1_9466.anInt110, 0)) {
				return 99;
			}
			TemporaryItemDefinition.aD565 = new Class274(Node_Sub38_Sub10.aClass302_10197, Class282.aClass302_3583, Node_Sub38_Sub39.aClass302_10500);
			Class188_Sub2_Sub2.aClass36_9366 = new Class36(Class209.aClass353_2483, Class35.language, Class4.index2);
			InputStream_Sub2.aClass281_83 = new Class281(Class209.aClass353_2483, Class35.language, Class4.index2, Class63.aClass363_922);
			Class186.aClass239_2249 = new Class239(Class209.aClass353_2483, Class35.language, Class4.index2, Node_Sub38_Sub39.aClass302_10500);
			Class328.aClass362_4112 = new Class362(Class209.aClass353_2483, Class35.language, Class14.index17);
			Class290_Sub7.aClass71_8134 = new Class71(Class209.aClass353_2483, Class35.language, Class4.index2);
			r.aClass58_9578 = new Class58(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class296.aClass186_5429 = new Class186(Class209.aClass353_2483, Class35.language, Class4.index2, Node_Sub38_Sub39.aClass302_10500);
			Class42.aClass181_643 = new Class181(Class209.aClass353_2483, Class35.language, Class4.index2, Class107.aClass302_1364);
			Class269.aClass308_3469 = new Class308(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class32.aClass359_508 = new Class359(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class186.aClass112_2256 = new Class112(Class209.aClass353_2483, Class35.language, true, Class247.aClass302_3143, Class107.aClass302_1364);
			Class304.aClass215_3834 = new Class215(Class209.aClass353_2483, Class35.language, Class4.index2, Node_Sub38_Sub39.aClass302_10500);
			Node_Sub54.aClass338_7671 = new Class338(Class209.aClass353_2483, Class35.language, Class4.index2, Node_Sub38_Sub39.aClass302_10500);
			Class366.aClass279_4526 = new Class279(Class209.aClass353_2483, Class35.language, true, Class174.aClass302_2093, Class107.aClass302_1364);
			EntityNode_Sub3_Sub1.aClass86_9166 = new Class86(Class209.aClass353_2483, Class35.language, true, Class188_Sub2_Sub2.aClass36_9366, Class205.index19, Class107.aClass302_1364, null);
			Class146.aClass32_1812 = new Class32(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class18.aClass37_306 = new Class37(Class209.aClass353_2483, Class35.language, Class262_Sub23.aClass302_7886, Class181.aClass302_2158, Class75.aClass302_1003);
			Class171.aClass278_2062 = new Class278(Class209.aClass353_2483, Class35.language, Class4.index2);
			CacheNode_Sub6.aClass57_9480 = new Class57(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class16.aClass101_228 = new Class101(Class209.aClass353_2483, Class35.language, Node_Sub15_Sub5.aClass302_9805, Class107.aClass302_1364);
			Node_Sub9_Sub4.aClass180_9727 = new Class180(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class382.aClass142_5246 = new Class142(Class209.aClass353_2483, Class35.language, Class4.index2);
			Node_Sub53.aClass176_7667 = new Class176(Class209.aClass353_2483, Class35.language, Class4.index2);
			IOException_Sub1.aClass128_85 = new Class128(Class209.aClass353_2483, Class35.language, Class127.index22);
			Class188_Sub2_Sub1.aClass229_9354 = new Class229(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class336.aClass315_4173 = new Class315(Class209.aClass353_2483, Class35.language, Class4.index2);
			Class291_Sub1.aClass13_8198 = new Class13(Class209.aClass353_2483, Class35.language, Class4.index2);
			NpcDefinition.method3001(Class293.aClass302_3681, AnimableAnimator_Sub1.aClass302_9091, Node_Sub38_Sub39.aClass302_10500, (byte) 64, Class107.aClass302_1364);
			Node_Sub10.method2539(Class262_Sub3.aClass302_7715, -128);
			Class42.aClass122_631 = new Class122(Class35.language, Node_Sub38_Sub4.aClass302_10116, Node_Sub18.aClass302_7150);
			Node_Sub36_Sub1.aClass109_10035 = new Class109(Class35.language, Node_Sub38_Sub4.aClass302_10116, Node_Sub18.aClass302_7150, new Class220());
			OutputStream_Sub2.method139((byte) -110);
			Class186.aClass112_2256.method1143(-2098, (Class213.aNode_Sub27_2512.aClass320_Sub19_7301.method3751(false) ^ 0xffffffff) == -1);
			Class24.aClass275_442 = new Class275();
			Class320_Sub12.method3728(0);
			Class28.method333(Class18.aClass37_306, -1);
			Node_Sub38_Sub9.method2822(CacheNode_Sub5.aClass302_9477, 0);
			Class218.method2077(TemporaryItemDefinition.aD565, Class107.aClass302_1364, false);
			Class163 class163 = new Class163(Class250.aClass302_3179.method3529("huffman", "", i));
			Animable_Sub2.method834(-123, class163);
			try {
				jagmisc.init();
			} catch (Throwable throwable) {
				/* empty */
			}
			Animable_Sub3_Sub1.aClass234_11017 = Class300.method3498(4);
			Node_Sub23.aNode_Sub39_7201 = new Node_Sub39(true, Class240.aSignLink2946);
		}
		if (Class110.aClass110_1405 == Class252.aClass110_3189) {
			int i_13_ = Class200_Sub1.method2017(0, Node_Sub38_Sub39.aClass302_10500) + Node_Sub30.method2721(true, false);
			int i_14_ = CacheNode_Sub16_Sub2.method2391((byte) 99) - -aa_Sub3.method160(-5573);
			if ((i_13_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
				return 100 * i_13_ / i_14_;
			}
		}
		if (Class110.aClass110_1406 == Class252.aClass110_3189) {
			Class20.method275(r_Sub1.aClass302_11047, Class290_Sub7.aClass71_8134, r.aClass58_9578, Class186.aClass112_2256, Class304.aClass215_3834, Node_Sub54.aClass338_7671, Class24.aClass275_442);
		}
		if (Class110.aClass110_1407 == Class252.aClass110_3189) {
			Node_Sub38_Sub3.aStringArray10105 = new String[Class382.aClass142_5246.anInt1760];
			Class320_Sub22.anIntArray8417 = new int[Node_Sub53.aClass176_7667.anInt2105];
			FileOnDisk.aBooleanArray1332 = new boolean[Node_Sub53.aClass176_7667.anInt2105];
			for (int i_15_ = 0; (Node_Sub53.aClass176_7667.anInt2105 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
				if ((Node_Sub53.aClass176_7667.method1805(i_15_, -4409).anInt3208 ^ 0xffffffff) == -1) {
					FileOnDisk.aBooleanArray1332[i_15_] = true;
					Class188_Sub1_Sub1.anInt9333++;
				}
				Class320_Sub22.anIntArray8417[i_15_] = -1;
			}
			Class120.method1230(124);
			Animable_Sub1_Sub1.aClass302_10618.method3504(false, (byte) 31, true);
			SeekableFile.index6.method3504(true, (byte) 31, true);
			Node_Sub38_Sub39.aClass302_10500.method3504(true, (byte) 31, true);
			AnimableAnimator_Sub1.aClass302_9091.method3504(true, (byte) 31, true);
			Class250.aClass302_3179.method3504(true, (byte) 31, true);
			Class4.index2.anInt3795 = 2;
			Node_Sub38_Sub31.aBoolean10418 = true;
			Class14.index17.anInt3795 = 2;
			Class247.aClass302_3143.anInt3795 = 2;
			Class174.aClass302_2093.anInt3795 = 2;
			Class205.index19.anInt3795 = 2;
			Class262_Sub23.aClass302_7886.anInt3795 = 2;
			Node_Sub15_Sub5.aClass302_9805.anInt3795 = 2;
		}
		if (Class252.aClass110_3189 == Class110.aClass110_1408) {
			if (!CacheNode_Sub15.method2379(i + 7014, CacheNode_Sub4.aClass1_9466.anInt120)) {
				return 0;
			}
			boolean bool = true;
			for (int i_16_ = 0; i_16_ < Class134_Sub3.aWidgetArrayArray9035[CacheNode_Sub4.aClass1_9466.anInt120].length; i_16_++) {
				IComponentDefinitions widget = Class134_Sub3.aWidgetArrayArray9035[CacheNode_Sub4.aClass1_9466.anInt120][i_16_];
				if (widget.type == 5 && widget.anInt4820 != -1 && !Node_Sub38_Sub39.aClass302_10500.method3515(0, widget.anInt4820, 0)) {
					bool = false;
				}
			}
			if (!bool) {
				return 0;
			}
		}
		if (Class110.aClass110_1409 == Class252.aClass110_3189) {
			Class245.method3069(-1, true);
		}
		if (Class110.aClass110_1410 == Class252.aClass110_3189) {
			Class243.aClass340_3069.method3952(100);
			try {
				Class132.aThread1677.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class235_Sub1.anInterface16Array8978 = null;
			Class243.aClass340_3069 = null;
			Class320_Sub6.index32or34 = null;
			Class273.index33 = null;
			Class132.aThread1677 = null;
			Class174.aClass250_2094 = null;
			MainFile.method174((byte) -110);
			CacheNode_Sub1.aBoolean9425 = (Class213.aNode_Sub27_2512.aClass320_Sub10_7300.method3718(false) ^ 0xffffffff) == -2;
			Class213.aNode_Sub27_2512.method2690(24, 1, Class213.aNode_Sub27_2512.aClass320_Sub10_7300);
			if (CacheNode_Sub1.aBoolean9425) {
				Class213.aNode_Sub27_2512.method2690(116, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
			} else if (Class213.aNode_Sub27_2512.aClass320_Sub29_7291.aBoolean8486 && Node_Sub23.aNode_Sub39_7201.anInt7484 < 512 && (Node_Sub23.aNode_Sub39_7201.anInt7484 ^ 0xffffffff) != -1) {
				Class213.aNode_Sub27_2512.method2690(61, 0, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
			}
			Node_Sub38_Sub31.method2893(1);
			if (!CacheNode_Sub1.aBoolean9425) {
				Class22.method300(Class213.aNode_Sub27_2512.aClass320_Sub29_7291.method3791(false), true, false);
			} else {
				Class22.method300(0, true, false);
			}
			Node_Sub38_Sub19.method2850(i ^ 0x2, Class213.aNode_Sub27_2512.aClass320_Sub1_7287.method3678(false), -1, false, -1);
			Class300.method3497((byte) 107, Class93.aGraphicsToolkit1241);
			Class320_Sub21.method3760(true, Class93.aGraphicsToolkit1241);
			Class130.method1557((byte) -126, Node_Sub38_Sub39.aClass302_10500, Class93.aGraphicsToolkit1241);
			Class173.method1800((byte) -61, Node_Sub52.aGLSpriteArray7655);
		}
		return Class169_Sub3.method1781((byte) 82);
	}
	
	static final void method1978(boolean bool, IComponentDefinitions widget) {
		anInt6903++;
		if (bool == false) {
			if (Class204.anInt2461 == widget.anInt4814) {
				if (Class295.myPlayer.username == null) {
					widget.anInt4864 = 0;
					widget.anInt4683 = 0;
				} else {
					widget.anInt4815 = 150;
					widget.anInt4821 = (int) (Math.sin((double) Class174.clientCycle / 40.0) * 256.0) & 0x7ff;
					widget.modelType = 5;
					widget.anInt4864 = Class166.myPlayerIndex;
					widget.anInt4683 = Class51_Sub1.method522(Class295.myPlayer.username, (byte) -104);
					Animator animator = Class295.myPlayer.anAnimator10860;
					if (animator == null) {
						widget.anAnimator4755 = null;
					} else {
						if (widget.anAnimator4755 == null) {
							widget.anAnimator4755 = new FixedAnimator();
						}
						widget.anInt4773 = animator.method250((byte) 104);
						widget.anAnimator4755.method232(18634, animator);
					}
				}
			}
		}
	}
	
	static {
		aClass129_6901 = new Class129("LIVE", 0);
	}
}
