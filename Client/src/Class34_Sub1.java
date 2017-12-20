/* Class34_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class34_Sub1 extends Class34
{
	static int anInt5513;
	private HashTable aHashTable5514;
	static int anInt5515;
	static int anInt5516;
	static int anInt5517;
	static int anInt5518;
	private CacheNode_Sub16 aCacheNode_Sub16_5519;
	private MainFile aClass6_5520;
	static int anInt5521;
	private int anInt5522;
	static int anInt5523;
	private int anInt5524;
	private byte[] aByteArray5525;
	private byte[] aByteArray5526;
	static int anInt5527;
	static int[] SKILL_REAL_LEVEL = new int[25];
	static int anInt5529;
	private Class141 aClass141_5530;
	static int anInt5531;
	static int anInt5532;
	static int anInt5533;
	static int anInt5534;
	private Class266 aClass266_5535;
	private int anInt5536;
	private int anInt5537 = 0;
	static int anInt5538;
	private MainFile aClass6_5539;
	private ReferenceTable anArchive5540;
	private Class312 aClass312_5541;
	private int anInt5542;
	private boolean aBoolean5543;
	private Class312 aClass312_5544;
	private boolean aBoolean5545;
	private boolean aBoolean5546;
	private long aLong5547;
	
	static final void method375(int i, boolean bool, int i_0_, int i_1_, byte b, int i_2_) {
		anInt5523++;
		if ((i_2_ ^ 0xffffffff) > -2) {
			i_2_ = 1;
		}
		if ((i_1_ ^ 0xffffffff) > -2) {
			i_1_ = 1;
		}
		if (b <= -80) {
			int i_3_ = i_1_ + -334;
			if (i_3_ < 0) {
				i_3_ = 0;
			} else if ((i_3_ ^ 0xffffffff) < -101) {
				i_3_ = 100;
			}
			int i_4_ = (Node_Sub29_Sub3.aShort10026 + -Node_Sub29_Sub3.aShort10027) * i_3_ / 100 + Node_Sub29_Sub3.aShort10027;
			if (Class18.aShort310 <= i_4_) {
				if (OutcommingPacket.aShort4053 < i_4_) {
					i_4_ = OutcommingPacket.aShort4053;
				}
			} else {
				i_4_ = Class18.aShort310;
			}
			int i_5_ = i_1_ * (i_4_ * 512) / (334 * i_2_);
			if ((i_5_ ^ 0xffffffff) <= (Class291.aShort3667 ^ 0xffffffff)) {
				if (Animable_Sub2_Sub2.aShort10750 < i_5_) {
					i_5_ = Animable_Sub2_Sub2.aShort10750;
					i_4_ = 334 * (i_5_ * i_2_) / (512 * i_1_);
					if ((Class18.aShort310 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
						i_4_ = Class18.aShort310;
						int i_6_ = 334 * (i_2_ * i_5_) / (i_4_ * 512);
						int i_7_ = (i_1_ + -i_6_) / 2;
						if (bool) {
							Class93.aGraphicsToolkit1241.la();
							Class93.aGraphicsToolkit1241.method1239(i_2_, i_7_, i_0_, (byte) 116, i, -16777216);
							Class93.aGraphicsToolkit1241.method1239(i_2_, i_7_, i_0_ - -i_1_ + -i_7_, (byte) 116, i, -16777216);
						}
						i_1_ -= 2 * i_7_;
						i_0_ += i_7_;
					}
				}
			} else {
				i_5_ = Class291.aShort3667;
				i_4_ = i_5_ * i_2_ * 334 / (512 * i_1_);
				if (OutcommingPacket.aShort4053 < i_4_) {
					i_4_ = OutcommingPacket.aShort4053;
					int i_8_ = i_4_ * i_1_ * 512 / (i_5_ * 334);
					int i_9_ = (-i_8_ + i_2_) / 2;
					if (bool) {
						Class93.aGraphicsToolkit1241.la();
						Class93.aGraphicsToolkit1241.method1239(i_9_, i_1_, i_0_, (byte) 116, i, -16777216);
						Class93.aGraphicsToolkit1241.method1239(i_9_, i_1_, i_0_, (byte) 116, -i_9_ + i_2_ + i, -16777216);
					}
					i += i_9_;
					i_2_ -= 2 * i_9_;
				}
			}
			Class22.anInt428 = i;
			Class111.anInt1418 = (short) i_1_;
			Class339_Sub6.anInt8713 = i_4_ * i_1_ / 334;
			Mobile_Sub2.anInt10722 = i_0_;
			Class132.anInt1684 = (short) i_2_;
		}
	}
	
	final int method376(int i) {
		anInt5533++;
		if (i != 100) {
			return 111;
		}
		if (method374((byte) 0) == null) {
			if (aCacheNode_Sub16_5519 == null) {
				return 0;
			}
			return aCacheNode_Sub16_5519.method2386((byte) -40);
		}
		return 100;
	}
	
	final int method377(int i) {
		anInt5515++;
		if (anArchive5540 == null) {
			return 0;
		}
		return anArchive5540.anInt294;
	}
	
	static final void method378(int i) {
		Node_Sub38_Sub8.method2813(-1);
		anInt5521++;
		if (i != -4) {
			method382(null, -11, 36);
		}
		int i_11_ = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false);
		do {
			if (i_11_ != 2) {
				if ((i_11_ ^ 0xffffffff) != -4) {
					break;
				}
			} else {
				CacheNode.method2279(-1, Class205.screenHeight, 100, Class360.screenWidth, 100, Class93.aGraphicsToolkit1241);
				break;
			}
			Class64.method711(Class93.aGraphicsToolkit1241, 2, Class360.screenWidth, Class22.anInt432, Node_Sub36_Sub1.anInt10039, 2, (byte) -128, Class205.screenHeight);
		} while (false);
		if (Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3689((byte) 122)) {
			Index.method3535(Node_Sub38_Sub20.aCanvas10309, true);
		}
		if (Class93.aGraphicsToolkit1241 != null) {
			Class116.method1163(2);
		}
		Node_Sub15_Sub10.aBoolean9850 = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691(false) != 0;
		Class71.aBoolean967 = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3689((byte) 125);
	}
	
	final void method368(int i, int i_12_) {
		anInt5527++;
		if (aClass6_5539 != null) {
			if (i != 0) {
				method381((byte) 122);
			}
			for (Node node = aClass312_5541.method3613(65280); node != null; node = aClass312_5541.method3620(16776960)) {
				if ((node.aLong2797 ^ 0xffffffffffffffffL) == ((long) i_12_ ^ 0xffffffffffffffffL)) {
					return;
				}
			}
			Node node = new Node();
			node.aLong2797 = (long) i_12_;
			aClass312_5541.method3625((byte) -54, node);
		}
	}
	
	final int method379(int i) {
		anInt5538++;
		if (i != 0) {
			anInt5542 = 2;
		}
		if (anArchive5540 == null) {
			return 0;
		}
		if (!aBoolean5543) {
			return anArchive5540.anInt294;
		}
		Node node = aClass312_5544.method3613(65280);
		if (node == null) {
			return 0;
		}
		return (int) node.aLong2797;
	}
	
	final void method380(int i) {
		anInt5532++;
		if (aClass312_5544 != null) {
			if (method374((byte) 0) == null) {
				return;
			}
			if (!aBoolean5543) {
				if (!aBoolean5545) {
					aClass312_5544 = null;
				} else {
					boolean bool = true;
					for (Node node = aClass312_5544.method3613(65280); node != null; node = aClass312_5544.method3620(16776960)) {
						int i_13_ = (int) node.aLong2797;
						if (aByteArray5525[i_13_] != 1) {
							method383(i_13_, 2, -1);
						}
						if (aByteArray5525[i_13_] != 1) {
							bool = false;
						} else {
							node.method2160((byte) 108);
						}
					}
					while (anArchive5540.anIntArray295.length > anInt5542) {
						if (anArchive5540.anIntArray295[anInt5542] == 0) {
							anInt5542++;
						} else {
							if (aClass266_5535.method3239(255)) {
								bool = false;
								break;
							}
							if ((aByteArray5525[anInt5542] ^ 0xffffffff) != -2) {
								method383(anInt5542, 2, i + -1);
							}
							if ((aByteArray5525[anInt5542] ^ 0xffffffff) != -2) {
								Node node = new Node();
								node.aLong2797 = (long) anInt5542;
								aClass312_5544.method3625((byte) -54, node);
								bool = false;
							}
							anInt5542++;
						}
					}
					if (bool) {
						anInt5542 = 0;
						aBoolean5545 = false;
					}
				}
			} else {
				boolean bool = true;
				for (Node node = aClass312_5544.method3613(65280); node != null; node = aClass312_5544.method3620(16776960)) {
					int i_14_ = (int) node.aLong2797;
					if (aByteArray5525[i_14_] == 0) {
						method383(i_14_, 1, -1);
					}
					if ((aByteArray5525[i_14_] ^ 0xffffffff) == -1) {
						bool = false;
					} else {
						node.method2160((byte) 122);
					}
				}
				while (anArchive5540.anIntArray295.length > anInt5542) {
					if ((anArchive5540.anIntArray295[anInt5542] ^ 0xffffffff) == -1) {
						anInt5542++;
					} else {
						if (aClass141_5530.anInt1753 >= 250) {
							bool = false;
							break;
						}
						if ((aByteArray5525[anInt5542] ^ 0xffffffff) == -1) {
							method383(anInt5542, 1, -1);
						}
						if ((aByteArray5525[anInt5542] ^ 0xffffffff) == -1) {
							Node node = new Node();
							node.aLong2797 = (long) anInt5542;
							bool = false;
							aClass312_5544.method3625((byte) -54, node);
						}
						anInt5542++;
					}
				}
				if (bool) {
					anInt5542 = 0;
					aBoolean5543 = false;
				}
			}
		}
		if (aBoolean5546 && (Class313.method3650(false) ^ 0xffffffffffffffffL) <= (aLong5547 ^ 0xffffffffffffffffL)) {
			for (CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1516(false); cachenode_sub16 != null; cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1520(99)) {
				if (!cachenode_sub16.aBoolean9602) {
					if (cachenode_sub16.aBoolean9597) {
						if (!cachenode_sub16.aBoolean9598) {
							throw new RuntimeException();
						}
						cachenode_sub16.method2160((byte) 121);
					} else {
						cachenode_sub16.aBoolean9597 = true;
					}
				}
			}
			aLong5547 = 1000L + Class313.method3650(false);
		}
		if (i != 0) {
			method380(-72);
		}
	}
	
	final int method381(byte b) {
		if (b != 29) {
			SKILL_REAL_LEVEL = null;
		}
		anInt5534++;
		return anInt5537;
	}
	
	static final void method382(Animable[] animables, int i, int i_15_) {
		if (i < i_15_) {
			int i_16_ = (i + i_15_) / 2;
			int i_17_ = i;
			Animable animable = animables[i_16_];
			animables[i_16_] = animables[i_15_];
			animables[i_15_] = animable;
			int i_18_ = animable.anInt5944;
			for (int i_19_ = i; i_19_ < i_15_; i_19_++) {
				if (animables[i_19_].anInt5944 > i_18_ + (i_19_ & 0x1)) {
					Animable animable_20_ = animables[i_19_];
					animables[i_19_] = animables[i_17_];
					animables[i_17_++] = animable_20_;
				}
			}
			animables[i_15_] = animables[i_17_];
			animables[i_17_] = animable;
			method382(animables, i, i_17_ - 1);
			method382(animables, i_17_ + 1, i_15_);
		}
	}
	
	final byte[] method373(int i, byte b) {
		anInt5513++;
		CacheNode_Sub16 cachenode_sub16 = method383(i, 0, -1);
		if (cachenode_sub16 == null) {
			return null;
		}
		if (b < 46) {
			anInt5537 = 39;
		}
		byte[] bs = cachenode_sub16.method2385(15);
		cachenode_sub16.method2160((byte) 100);
		return bs;
	}
	
	private final CacheNode_Sub16 method383(int i, int i_21_, int i_22_) {
		anInt5516++;
		if (i_22_ != -1) {
			return null;
		}
		CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1518(3512, (long) i);
		if (cachenode_sub16 != null && i_21_ == 0 && !cachenode_sub16.aBoolean9598 && cachenode_sub16.aBoolean9602) {
			cachenode_sub16.method2160((byte) 57);
			cachenode_sub16 = null;
		}
		if (cachenode_sub16 == null) {
			if ((i_21_ ^ 0xffffffff) == -1) {
				if (aClass6_5539 == null || aByteArray5525[i] == -1) {
					if (aClass266_5535.method3244(24365)) {
						return null;
					}
					cachenode_sub16 = aClass266_5535.method3247(anInt5524, i, (byte) -79, true, (byte) 2);
				} else {
					cachenode_sub16 = aClass141_5530.method1612(aClass6_5539, i, true);
				}
			} else if ((i_21_ ^ 0xffffffff) == -2) {
				if (aClass6_5539 == null) {
					throw new RuntimeException();
				}
				cachenode_sub16 = aClass141_5530.method1617(aClass6_5539, 13006, i);
			} else if ((i_21_ ^ 0xffffffff) == -3) {
				if (aClass6_5539 == null) {
					throw new RuntimeException();
				}
				if (aByteArray5525[i] != -1) {
					throw new RuntimeException();
				}
				if (!aClass266_5535.method3239(i_22_ ^ ~0xff)) {
					cachenode_sub16 = aClass266_5535.method3247(anInt5524, i, (byte) -79, false, (byte) 2);
				} else {
					return null;
				}
			} else {
				throw new RuntimeException();
			}
			aHashTable5514.method1515((long) i, cachenode_sub16, i_22_ + -125);
		}
		if (cachenode_sub16.aBoolean9602) {
			return null;
		}
		byte[] bs = cachenode_sub16.method2385(15);
		if (cachenode_sub16 instanceof CacheNode_Sub16_Sub2) {
			try {
				if (bs == null || bs.length <= 2) {
					throw new RuntimeException();
				}
				Class7.aCRC32_163.reset();
				Class7.aCRC32_163.update(bs, 0, bs.length - 2);
				int i_23_ = (int) Class7.aCRC32_163.getValue();
				if(  !(anInt5524 == 8 & i == 2498 )) {
				if (i_23_ != anArchive5540.anIntArray299[i]) {
					//System.out.println("error crc "+i_23_+", "+anArchive5540.anIntArray299[i]);
					//if(anInt5524 != 37)
					throw new RuntimeException();
				}
				}
				if (anArchive5540.aByteArrayArray298 != null && anArchive5540.aByteArrayArray298[i] != null) {
					byte[] bs_24_ = anArchive5540.aByteArrayArray298[i];
					byte[] bs_25_ = GLXToolkit.generateWhirpoolHash((byte) 126, bs, -2 + bs.length, 0);
					for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -65; i_26_++) {
						if (bs_25_[i_26_] != bs_24_[i_26_]) {
							//System.out.println("error hash");
							throw new RuntimeException();
						}
					}
				}
				int i_27_ = (bs[-1 + bs.length] & 0xff) + (0xff00 & bs[bs.length + -2] << 8);
				if(  !(anInt5524 == 8 & i == 2498 )) {
				if ((i_27_ ^ 0xffffffff) != (0xffff & anArchive5540.anIntArray293[i] ^ 0xffffffff)) {
					//System.out.println("error rev "+i_27_+", "+anArchive5540.anIntArray293[i]);
					
					throw new RuntimeException();
				}
				}
				if (aByteArray5525[i] != 1) {
					anInt5537++;
					aByteArray5525[i] = (byte) 1;
				}
				if (!cachenode_sub16.aBoolean9598) {
					cachenode_sub16.method2160((byte) 81);
				}
				return cachenode_sub16;
			} catch (Exception exception) {
				aByteArray5525[i] = (byte) -1;
				cachenode_sub16.method2160((byte) 67);
				if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244(24365)) {
					CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, (byte) -79, true, (byte) 2);
					aHashTable5514.method1515((long) i, cachenode_sub16_sub1, -123);
				}
				return null;
			}
		}
		try {
			if (bs == null || (bs.length ^ 0xffffffff) >= -3) {
				throw new RuntimeException();
			}
			Class7.aCRC32_163.reset();
			Class7.aCRC32_163.update(bs, 0, -2 + bs.length);
			int i_28_ = (int) Class7.aCRC32_163.getValue();
			if(  !(anInt5524 == 8 & i == 2498 )) {
			if (anArchive5540.anIntArray299[i] != i_28_) {
			//System.out.println("error2 crc "+anInt5524+", "+i);
				throw new RuntimeException();
			}
			}
			if (anArchive5540.aByteArrayArray298 != null && anArchive5540.aByteArrayArray298[i] != null) {
				byte[] bs_29_ = anArchive5540.aByteArrayArray298[i];
				byte[] bs_30_ = GLXToolkit.generateWhirpoolHash((byte) 127, bs, -2 + bs.length, 0);
				for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -65; i_31_++) {
					if ((bs_29_[i_31_] ^ 0xffffffff) != (bs_30_[i_31_] ^ 0xffffffff)) {
						//System.out.println("error2 hash");
						throw new RuntimeException();
					}
				}
			}
			aClass266_5535.anInt3394 = 0;
			aClass266_5535.anInt3393 = 0;
		} catch (RuntimeException runtimeexception) {
			//made it request file again instead of crashing
			aClass266_5535.method3233((byte) 98);
			cachenode_sub16.method2160((byte) 118);
			if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244(24365)) {
				CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, (byte) -79, true, (byte) 2);
				aHashTable5514.method1515((long) i, cachenode_sub16_sub1, -124);
			}
		//	runtimeexception.printStackTrace();
		/*	aByteArray5525[i] = (byte) -1;
			cachenode_sub16.method2160((byte) 67);
			if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244(24365)) {
				CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, (byte) -79, true, (byte) 2);
				aHashTable5514.method1515((long) i, cachenode_sub16_sub1, -123);
			}
			return null;*/
		}
		bs[bs.length + -2] = (byte) (anArchive5540.anIntArray293[i] >>> 8);
		bs[bs.length - 1] = (byte) anArchive5540.anIntArray293[i];
		if (aClass6_5539 != null) {
			aClass141_5530.method1616((byte) -124, bs, i, aClass6_5539);
			if (aByteArray5525[i] != 1) {
				anInt5537++;
				aByteArray5525[i] = (byte) 1;
			}
		}
		if (!cachenode_sub16.aBoolean9598) {
			cachenode_sub16.method2160((byte) 112);
		}
		return cachenode_sub16;
	}
	
	public static void method384(int i) {
		SKILL_REAL_LEVEL = null;
		if (i != -21352) {
			SKILL_REAL_LEVEL = null;
		}
	}
	
	final int method369(byte b, int i) {
		if (b != -4) {
			aByteArray5526 = null;
		}
		anInt5518++;
		CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1518(3512, (long) i);
		if (cachenode_sub16 != null) {
			return cachenode_sub16.method2386((byte) -40);
		}
		return 0;
	}
	
	final void method385(boolean bool) {
		anInt5517++;
		if (aClass312_5544 != null && method374((byte) 0) != null) {
			for (Node node = aClass312_5541.method3613(65280); node != null; node = aClass312_5541.method3620(16776960)) {
				int i = (int) node.aLong2797;
				if (i < 0 || i >= anArchive5540.anInt296 || anArchive5540.anIntArray295[i] == 0) {
					node.method2160((byte) 98);
				} else {
					if (aByteArray5525[i] == 0) {
						method383(i, 1, -1);
					}
					if ((aByteArray5525[i] ^ 0xffffffff) == 0) {
						method383(i, 2, -1);
					}
					if ((aByteArray5525[i] ^ 0xffffffff) == -2) {
						node.method2160((byte) 67);
					}
				}
			}
			if (bool != false) {
				method382(null, -92, -16);
			}
		}
	}
	
	final ReferenceTable method374(byte b) {
		anInt5529++;
		if (anArchive5540 != null) {
			return anArchive5540;
		}
		if (b != 0) {
			return null;
		}
		if (aCacheNode_Sub16_5519 == null) {
			if (aClass266_5535.method3244(24365)) {
				return null;
			}
			aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, (byte) -79, true, (byte) 0);
		}
		if (aCacheNode_Sub16_5519.aBoolean9602) {
			return null;
		}
		byte[] bs = aCacheNode_Sub16_5519.method2385(15);
		if (!(aCacheNode_Sub16_5519 instanceof CacheNode_Sub16_Sub2)) {
			try {
				if (bs == null) {
					throw new RuntimeException();
				}
				anArchive5540 = new ReferenceTable(bs, anInt5522, aByteArray5526);
			} catch (RuntimeException runtimeexception) {
				aClass266_5535.method3233((byte) 98);
				anArchive5540 = null;
				if (!aClass266_5535.method3244(b ^ 0x5f2d)) {
					aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, (byte) -79, true, (byte) 0);
				} else {
					aCacheNode_Sub16_5519 = null;
				}
				return null;
			}
			if (aClass6_5520 != null) {
				aClass141_5530.method1616((byte) -124, bs, anInt5524, aClass6_5520);
			}
		} else {
			try {
				if (bs == null) {
					throw new RuntimeException();
				}
				anArchive5540 = new ReferenceTable(bs, anInt5522, aByteArray5526);
                if ((anInt5536 ^ 0xffffffff) != (anArchive5540.anInt292 ^ 0xffffffff)) {
					throw new RuntimeException();
				}
			} catch (RuntimeException runtimeexception) {
				anArchive5540 = null;
				if (!aClass266_5535.method3244(24365)) {
					aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, (byte) -79, true, (byte) 0);
				} else {
					aCacheNode_Sub16_5519 = null;
				}
				return null;
			}
		}
		if (aClass6_5539 != null) {
			aByteArray5525 = new byte[anArchive5540.anInt296];
			anInt5537 = 0;
		}
		aCacheNode_Sub16_5519 = null;
		return anArchive5540;
	}
	
	final void method386(byte b) {
		anInt5531++;
		if (aClass6_5539 != null) {
			aBoolean5545 = true;
			if (b != 119) {
				aLong5547 = -99L;
			}
			if (aClass312_5544 == null) {
				aClass312_5544 = new Class312();
			}
		}
	}
	
	Class34_Sub1(int i, MainFile class6, MainFile class6_32_, Class266 class266, Class141 class141, int i_33_, byte[] bs, int i_34_, boolean bool) {
		aHashTable5514 = new HashTable(16);
		anInt5542 = 0;
		aClass312_5541 = new Class312();
		aLong5547 = 0L;
		anInt5524 = i;
		aClass6_5539 = class6;
		if (aClass6_5539 != null) {
			aBoolean5543 = true;
			aClass312_5544 = new Class312();
		} else {
			aBoolean5543 = false;
		}
		aBoolean5546 = bool;
		aClass266_5535 = class266;
		anInt5522 = i_33_;
		anInt5536 = i_34_;
		aClass141_5530 = class141;
		aByteArray5526 = bs;
		aClass6_5520 = class6_32_;
		if (aClass6_5520 != null) {
			aCacheNode_Sub16_5519 = aClass141_5530.method1612(aClass6_5520, anInt5524, true);
		}
	}
}
