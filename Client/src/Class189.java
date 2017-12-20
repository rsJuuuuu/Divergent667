/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

abstract class Class189
{
	private boolean aBoolean2292;
	static int anInt2293;
	private OggPage anOggPage2294;
	static OutcommingPacket aClass318_2295;
	static int anInt2296;
	private Node_Sub25_Sub4 aNode_Sub25_Sub4_2297;
	private HashTable aHashTable2298;
	private boolean aBoolean2299;
	static int anInt2300;
	private boolean aBoolean2301;
	static int anInt2302;
	static int anInt2303;
	private boolean aBoolean2304;
	static int anInt2305;
	static int anInt2306;
	static int anInt2307;
	private byte[] aByteArray2308;
	static int anInt2309;
	private Node_Sub25_Sub1 aNode_Sub25_Sub1_2310;
	static int anInt2311;
	static int anInt2312;
	static int anInt2313;
	static int anInt2314;
	static int anInt2315;
	private Node_Sub25_Sub3 aNode_Sub25_Sub3_2316;
	static int anInt2317;
	static boolean DEBUG_GLOBAL_PLAYER_UPDATE = false;
	static int anInt2319;
	static int anInt2320;
	private String aString2321;
	private OggSyncState anOggSyncState2322;
	static int anInt2323;
	private OggPacket anOggPacket2324;
	/*synthetic*/ static Class<?> aClass2325;
	
	private final Node_Sub25 method1915(byte b) throws IOException {
		anInt2312++;
		if (aBoolean2299) {
			throw new IllegalStateException();
		}
		if (aBoolean2292) {
			return null;
		}
		while (anOggSyncState2322.pageOut(anOggPage2294) <= 0) {
			int i = method1929(aByteArray2308, 1);
			if (i == -1) {
				aBoolean2292 = true;
				return null;
			}
			if (i == 0) {
				return null;
			}
			if (!anOggSyncState2322.write(aByteArray2308, i)) {
				throw new RuntimeException("");
			}
		}
		if (b < 63) {
			DEBUG_GLOBAL_PLAYER_UPDATE = false;
		}
		int i = anOggPage2294.getSerialNumber();
		if (!anOggPage2294.isBOS()) {
			Node_Sub25 node_sub25 = (Node_Sub25) aHashTable2298.method1518(3512, (long) i);
			if (!node_sub25.anOggStreamState7235.pageIn(anOggPage2294)) {
				throw new IllegalStateException();
			}
			return node_sub25;
		}
		OggStreamState oggstreamstate = new OggStreamState(i);
		if (!oggstreamstate.pageIn(anOggPage2294)) {
			throw new IllegalStateException();
		}
		if (oggstreamstate.packetPeek(anOggPacket2324) != 1) {
			throw new IllegalStateException();
		}
		Node_Sub25 node_sub25;
		if (aNode_Sub25_Sub3_2316 != null || !anOggPacket2324.isTheora()) {
			if (aNode_Sub25_Sub1_2310 != null || !anOggPacket2324.isVorbis()) {
				byte[] bs = anOggPacket2324.getData();
				StringBuffer stringbuffer = new StringBuffer();
				for (int i_0_ = 1; bs.length > i_0_; i_0_++) {
					if (!Character.isLetterOrDigit((char) bs[i_0_])) {
						break;
					}
					stringbuffer.append((char) bs[i_0_]);
				}
				String string = stringbuffer.toString();
				if (!string.equals("kate")) {
					node_sub25 = new Node_Sub25_Sub2(oggstreamstate);
				} else {
					node_sub25 = new Node_Sub25_Sub4(oggstreamstate);
				}
			} else {
				aNode_Sub25_Sub1_2310 = new Node_Sub25_Sub1(oggstreamstate);
				node_sub25 = aNode_Sub25_Sub1_2310;
			}
		} else {
			aNode_Sub25_Sub3_2316 = new Node_Sub25_Sub3(oggstreamstate);
			node_sub25 = aNode_Sub25_Sub3_2316;
		}
		aHashTable2298.method1515((long) i, node_sub25, -123);
		return node_sub25;
	}
	
	static final short[] method1916(byte b, int i, short[] ses) {
		anInt2293++;
		short[] ses_2_ = new short[i];
		Class311.method3606(ses, 0, ses_2_, 0, i);
		return ses_2_;
	}
	
	final void method1917(boolean bool, int i) {
		if (aNode_Sub25_Sub1_2310 != null) {
			Node_Sub9_Sub5 node_sub9_sub5 = aNode_Sub25_Sub1_2310.method2658(27624);
			if (node_sub9_sub5 != null) {
				node_sub9_sub5.method2535(i ^ 0x1, bool);
			}
		}
		anInt2315++;
		aBoolean2304 = !aBoolean2304;
		if (i != 1) {
			aBoolean2301 = true;
		}
	}
	
	private final void method1918(int i) throws IOException {
		anInt2314++;
		while (aNode_Sub25_Sub3_2316.anOggStreamState7235.packetOut(anOggPacket2324) != 1) {
			Node_Sub25 node_sub25 = method1915((byte) 90);
			if (node_sub25 != null) {
				if (node_sub25 == aNode_Sub25_Sub4_2297) {
					method1923((byte) -97);
				}
			} else {
				if (aBoolean2292) {
					method1931((byte) 82);
				}
				return;
			}
		}
		aNode_Sub25_Sub3_2316.method2652(i + 17622, anOggPacket2324);
		if (i != -17507) {
			method1925();
		}
	}
	
	private final boolean method1919(int i) {
		anInt2323++;
		if (i <= 124) {
			method1927(98);
		}
		if (aNode_Sub25_Sub1_2310 != null) {
            return !(aNode_Sub25_Sub3_2316.method2677((byte) 85) && !(method1928(124) > aNode_Sub25_Sub3_2316.method2676(94)));
        }
		double d = (double) aNode_Sub25_Sub3_2316.method2667(0);
        return !(d != 0.0 && !((double) Class313.method3650(false) >= 1000.0 / d + (double) aNode_Sub25_Sub3_2316.method2675(-3744)));
    }
	
	final boolean method1920(int i) {
		anInt2320++;
		if (i > -76) {
			return false;
		}
		if (!aBoolean2299 && !aBoolean2292) {
			return false;
		}
        return !(aNode_Sub25_Sub1_2310 != null && aNode_Sub25_Sub1_2310.method2663(-102) > 0);
    }
	
	final Node_Sub25_Sub4 method1921(int i) {
		anInt2319++;
		if (i != 3455) {
			method1920(53);
		}
		return aNode_Sub25_Sub4_2297;
	}
	
	final void method1922(boolean bool) throws IOException {
		if (bool != false) {
			method1932(110);
		}
		anInt2313++;
		if (!aBoolean2304) {
			while (!aBoolean2299) {
				Node_Sub25 node_sub25;
				if (!aBoolean2301) {
					node_sub25 = method1915((byte) 109);
					if (node_sub25 == null) {
						if (aBoolean2292) {
							method1931((byte) 82);
						}
						break;
					}
					aBoolean2301 = true;
				} else {
					node_sub25 = (Node_Sub25) aHashTable2298.method1518(3512, (long) anOggPage2294.getSerialNumber());
				}
				if (node_sub25 != aNode_Sub25_Sub1_2310) {
					if (!(node_sub25 instanceof Node_Sub25_Sub4)) {
						if (aNode_Sub25_Sub3_2316 == node_sub25) {
							if (aNode_Sub25_Sub1_2310 == null && !aBoolean2304) {
								for (int i = 0; (i ^ 0xffffffff) > -11 && method1919(126); i++) {
									method1918(-17507);
									if (aBoolean2299) {
										break;
									}
								}
								break;
							}
						} else {
							while ((node_sub25.anOggStreamState7235.packetOut(anOggPacket2324) ^ 0xffffffff) == -2) {
								if ((node_sub25.anInt7234 ^ 0xffffffff) == -2 && node_sub25 instanceof Node_Sub25_Sub4) {
									method1926(119, aString2321);
								}
								node_sub25.method2652(-4, anOggPacket2324);
							}
						}
					} else {
						method1923((byte) -106);
					}
				} else {
					if (aNode_Sub25_Sub1_2310.method2663(-118) >= 50) {
						break;
					}
					while (aNode_Sub25_Sub1_2310.anOggStreamState7235.packetOut(anOggPacket2324) == 1) {
						aNode_Sub25_Sub1_2310.method2652(-17, anOggPacket2324);
						method1923((byte) -94);
						if (aNode_Sub25_Sub3_2316 != null) {
							double d = aNode_Sub25_Sub3_2316.method2676(-107);
							for (int i = 0; i < 10; i++) {
								if (!method1919(126)) {
									break;
								}
								method1918(-17507);
								if (aBoolean2299) {
									return;
								}
							}
							if (aNode_Sub25_Sub3_2316.method2676(102) > d) {
								return;
							}
						}
						if ((aNode_Sub25_Sub1_2310.method2663(-103) ^ 0xffffffff) <= -51) {
							return;
						}
					}
				}
				aBoolean2301 = false;
			}
		}
	}
	
	private final void method1923(byte b) {
		anInt2303++;
		for (Node_Sub25 node_sub25 = (Node_Sub25) aHashTable2298.method1516(false); node_sub25 != null; node_sub25 = (Node_Sub25) aHashTable2298.method1520(74)) {
			if (node_sub25 instanceof Node_Sub25_Sub4) {
				Node_Sub25_Sub4 node_sub25_sub4 = (Node_Sub25_Sub4) node_sub25;
				while (node_sub25_sub4.anInt7234 <= 8 || method1928(116) > (double) node_sub25_sub4.method2683(-96)) {
					if (node_sub25_sub4.anOggStreamState7235.packetOut(anOggPacket2324) != 1) {
						break;
					}
					node_sub25_sub4.method2652(93, anOggPacket2324);
				}
			}
		}
		method1926(91, aString2321);
		if (b >= -91) {
			aBoolean2299 = false;
		}
	}
	
	final void method1924(byte b) {
		anInt2306++;
		if (!aBoolean2299) {
			for (Node_Sub25 node_sub25 = (Node_Sub25) aHashTable2298.method1516(false); node_sub25 != null; node_sub25 = (Node_Sub25) aHashTable2298.method1520(121)) {
				node_sub25.method2656(100);
				node_sub25.anOggStreamState7235.a();
			}
			anOggPacket2324.a();
			anOggPage2294.a();
			anOggSyncState2322.a();
			aBoolean2299 = true;
			if (b < 58) {
				anOggPacket2324 = null;
			}
		}
	}
	
	static final void method1925() {
		for (int i = 0; i < Class188_Sub1_Sub1.anInt9337; i++) {
			if (!Class147.aBooleanArray1820[i]) {
				Class326 class326 = Class143.aClass326Array1771[i];
				Node_Sub29 node_sub29 = class326.aNode_Sub29_4100;
				int i_3_ = class326.anInt4092;
				int i_4_ = node_sub29.method2711(124) - Class135.anInt1692;
				int i_5_ = 1 + (2 * i_4_ >> Class36.anInt549);
				int i_6_ = 0;
				int[] is = new int[i_5_ * i_5_];
				int i_7_ = node_sub29.method2705(32311) - i_4_ >> Class36.anInt549;
				int i_8_ = node_sub29.method2708(27433) - i_4_ >> Class36.anInt549;
				int i_9_ = node_sub29.method2708(27433) + i_4_ >> Class36.anInt549;
				if (i_8_ < 0) {
					i_6_ -= i_8_;
					i_8_ = 0;
				}
				if (i_9_ >= Node_Sub50.anInt7623) {
					i_9_ = Node_Sub50.anInt7623 - 1;
				}
				for (int i_10_ = i_8_; i_10_ <= i_9_; i_10_++) {
					int i_11_ = class326.aShortArray4105[i_6_];
					int i_12_ = i_11_ >>> 8;
					int i_13_ = i_6_ * i_5_ + i_12_;
					int i_14_ = i_7_ + (i_11_ >>> 8);
					int i_15_ = i_14_ + (i_11_ & 0xff) - 1;
					if (i_14_ < 0) {
						i_13_ -= i_14_;
						i_14_ = 0;
					}
					if (i_15_ >= Class328.anInt4115) {
						i_15_ = Class328.anInt4115 - 1;
					}
					for (int i_16_ = i_14_; i_16_ <= i_15_; i_16_++) {
						int i_17_ = 1;
						Mobile mobile = Class262_Sub20.method3203(i_3_, i_16_, i_10_, aClass2325 == null ? aClass2325 = method1935("Mobile") : aClass2325);
						if (mobile != null && mobile.aByte9127 != 0) {
							if (mobile.aByte9127 == 1) {
								boolean bool = i_16_ - 1 >= i_14_;
								boolean bool_18_ = i_16_ + 1 <= i_15_;
								if (!bool && i_10_ + 1 <= i_9_) {
									int i_19_ = class326.aShortArray4105[i_6_ + 1];
									int i_20_ = i_7_ + (i_19_ >>> 8);
									int i_21_ = i_20_ + (i_19_ & 0xff);
									bool = i_16_ > i_20_ && i_16_ < i_21_;
								}
								if (!bool_18_ && i_10_ - 1 >= i_8_) {
									int i_22_ = class326.aShortArray4105[i_6_ - 1];
									int i_23_ = i_7_ + (i_22_ >>> 8);
									int i_24_ = i_23_ + (i_22_ & 0xff);
									bool_18_ = i_16_ > i_23_ && i_16_ < i_24_;
								}
								if (bool && !bool_18_) {
									i_17_ = 4;
								} else if (bool_18_ && !bool) {
									i_17_ = 2;
								}
							} else {
								boolean bool = i_16_ - 1 >= i_14_;
								boolean bool_25_ = i_16_ + 1 <= i_15_;
								if (!bool && i_10_ - 1 >= i_8_) {
									int i_26_ = class326.aShortArray4105[i_6_ - 1];
									int i_27_ = i_7_ + (i_26_ >>> 8);
									int i_28_ = i_27_ + (i_26_ & 0xff);
									bool = i_16_ > i_27_ && i_16_ < i_28_;
								}
								if (!bool_25_ && i_10_ + 1 <= i_9_) {
									int i_29_ = class326.aShortArray4105[i_6_ + 1];
									int i_30_ = i_7_ + (i_29_ >>> 8);
									int i_31_ = i_30_ + (i_29_ & 0xff);
									bool_25_ = i_16_ > i_30_ && i_16_ < i_31_;
								}
								if (bool && !bool_25_) {
									i_17_ = 3;
								} else if (bool_25_ && !bool) {
									i_17_ = 5;
								}
							}
						}
						is[i_13_++] = i_17_;
					}
					i_6_++;
				}
				Class147.aBooleanArray1820[i] = true;
				Class320_Sub10.aPlaneArray8300[i_3_].method3250(node_sub29, is);
			}
		}
	}
	
	final void method1926(int i, String string) {
		aString2321 = string;
		anInt2305++;
		if (aString2321 == null) {
			aNode_Sub25_Sub4_2297 = null;
		} else {
			if (i <= 4) {
				method1932(107);
			}
			if (aNode_Sub25_Sub4_2297 != null && !aString2321.equals(aNode_Sub25_Sub4_2297.method2680(-22478))) {
				aNode_Sub25_Sub4_2297 = null;
			}
			if (aNode_Sub25_Sub4_2297 == null) {
				for (Node_Sub25 node_sub25 = (Node_Sub25) aHashTable2298.method1516(false); node_sub25 != null; node_sub25 = (Node_Sub25) aHashTable2298.method1520(121)) {
					if (node_sub25 instanceof Node_Sub25_Sub4) {
						Node_Sub25_Sub4 node_sub25_sub4 = (Node_Sub25_Sub4) node_sub25;
						if (aString2321.equals(node_sub25_sub4.method2680(-22478))) {
							aNode_Sub25_Sub4_2297 = node_sub25_sub4;
							break;
						}
					}
				}
			}
		}
	}
	
	public static void method1927(int i) {
		if (i == 1) {
			aClass318_2295 = null;
		}
	}
	
	final double method1928(int i) {
		if (i <= 91) {
			method1927(-37);
		}
		anInt2311++;
		if (aNode_Sub25_Sub1_2310 != null) {
			return aNode_Sub25_Sub1_2310.method2661((byte) 122);
		}
		if (aNode_Sub25_Sub3_2316 != null) {
			return aNode_Sub25_Sub3_2316.method2676(90);
		}
		return 0.0;
	}
	
	abstract int method1929(byte[] bs, int i) throws IOException;
	
	final Node_Sub25_Sub3 method1930(byte b) {
		anInt2302++;
		return aNode_Sub25_Sub3_2316;
	}
	
	private final void method1931(byte b) {
		for (Node_Sub25 node_sub25 = (Node_Sub25) aHashTable2298.method1516(false); node_sub25 != null; node_sub25 = (Node_Sub25) aHashTable2298.method1520(106)) {
			if (node_sub25 != aNode_Sub25_Sub3_2316) {
				while (node_sub25.anOggStreamState7235.packetOut() == 1)
					node_sub25.method2652(-121, anOggPacket2324);
			}
		}
		anInt2296++;
		if (aNode_Sub25_Sub3_2316 != null) {
			if (b != 82) {
				DEBUG_GLOBAL_PLAYER_UPDATE = false;
			}
			for (int i = 0; i < 10 && method1919(127); i++) {
				if (aNode_Sub25_Sub3_2316.anOggStreamState7235.packetOut() == 1) {
					aNode_Sub25_Sub3_2316.method2652(85, anOggPacket2324);
				} else {
					method1924((byte) 66);
					break;
				}
			}
		}
	}
	
	final Node_Sub25_Sub1 method1932(int i) {
		anInt2317++;
		return aNode_Sub25_Sub1_2310;
	}
	
	static final void method1933(int i) {
		anInt2309++;
		if (Class96.anApplet1270 != null) {
			if (i != -9014) {
				method1916((byte) 46, -36, null);
			}
			try {
				String string = Class96.anApplet1270.getParameter("cookiehost");
				int i_33_ = -11745 + (int) (Class313.method3650(false) / 86400000L);
				String string_34_ = "usrdob=" + i_33_ + "; version=1; path=/; domain=" + string;
				Class2.method168("document.cookie=\"" + string_34_ + "\"", Class96.anApplet1270, 30639);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
	
	static final void method1934(byte b) {
		if (b != 17) {
			aClass318_2295 = null;
		}
		anInt2300++;
		if (!Class59.aBoolean867) {
			Class194_Sub1_Sub1.method1969(false, Class256.aClass261ArrayArrayArray3240);
			if (Class225.aClass261ArrayArrayArray2680 != null) {
				Class194_Sub1_Sub1.method1969(false, Class225.aClass261ArrayArrayArray2680);
			}
			Class59.aBoolean867 = true;
		}
	}
	
	Class189(int i) {
		if (!Node_Sub38_Sub2.method2793(1, "jagtheora")) {
			throw new RuntimeException("Failed to load jagtheora library");
		}
		aByteArray2308 = new byte[i];
		anOggSyncState2322 = new OggSyncState();
		anOggPage2294 = new OggPage();
		anOggPacket2324 = new OggPacket();
		aHashTable2298 = new HashTable(8);
	}
	
	/*synthetic*/ static Class<?> method1935(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
	
	static {
		aClass318_2295 = new OutcommingPacket(18, 8);
	}
}
