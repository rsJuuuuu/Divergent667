/* Animator - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

class Animator {
	static int anInt232;
	protected Class48 aClass48_233;
	private boolean aBoolean234 = false;
	static int anInt235;
	static int anInt236;
	private int anInt237;
	static int anInt238;
	static int anInt239;
	static int anInt240;
	private Class226 aClass226_241;
	static int anInt242;
	private int anInt243;
	static int anInt244;
	static int anInt245;
	static int anInt246;
	protected int anInt247;
	static int anInt248;
	static int anInt249;
	static int anInt250;
	static int anInt251;
	static Class346 aClass346_252 = new Class346();
	private int anInt253 = 0;
	static int anInt254;
	private int anInt255;
	static int anInt256;
	static int anInt257;
	static int anInt258;
	protected int anInt259;
	static int anInt260;
	static int anInt261;
	static int anInt262;
	private boolean aBoolean263 = false;
	static int anInt264;
	static int anInt265;
	static int anInt266;
	static int anInt267;
	static int anInt268;
	static int anInt269;
	protected Class226 aClass226_270;
	static int anInt271;
	static int anInt272;

	void method222(int i, Class48 class48, byte b) {
		if (b < 3) {
			method251(true);
		}
		anInt269++;
	}

	final int method223(int i) {
		anInt254++;
		return anInt237;
	}

	static final Class288 method224(byte b, Class237[] class237s,
			GLXToolkit glxtoolkit) {
		anInt265++;
		for (int i = 0; (i ^ 0xffffffff) > (class237s.length ^ 0xffffffff); i++) {
			if (class237s[i] == null
					|| (class237s[i].aLong2907 ^ 0xffffffffffffffffL) >= -1L) {
				return null;
			}
		}
		if (b >= -86) {
			return null;
		}
		long l = OpenGL.glCreateProgramObjectARB();
		for (int i = 0; class237s.length > i; i++)
			OpenGL.glAttachObjectARB(l, class237s[i].aLong2907);
		OpenGL.glLinkProgramARB(l);
		OpenGL.glGetObjectParameterivARB(l, 35714,
				Class320_Sub19.anIntArray8392, 0);
		if (Class320_Sub19.anIntArray8392[0] == 0) {
			if (Class320_Sub19.anIntArray8392[0] == 0) {
				//System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(l, 35716,
					Class320_Sub19.anIntArray8392, 1);
			if (Class320_Sub19.anIntArray8392[1] > 1) {
				byte[] bs = new byte[Class320_Sub19.anIntArray8392[1]];
				OpenGL.glGetInfoLogARB(l, Class320_Sub19.anIntArray8392[1],
						Class320_Sub19.anIntArray8392, 0, bs, 0);
				//System.out.println(new String(bs));
			}
			if (Class320_Sub19.anIntArray8392[0] == 0) {
				for (int i = 0; class237s.length > i; i++)
					OpenGL.glDetachObjectARB(l, class237s[i].aLong2907);
				OpenGL.glDeleteObjectARB(l);
				return null;
			}
		}
		return new Class288(glxtoolkit, l, class237s);
	}

	final void method225(int i, DrawableModel drawablemodel, int i_1_) {
		anInt232++;
		if (aClass48_233 != null) {
			if (i != 0) {
				method233(-17);
			}
			if (method247(29340)) {
				drawablemodel.method625(aClass226_270.aCacheNode_Sub15_2683,
						anInt247, aClass48_233.anIntArray707[anInt259],
						aClass226_270.aCacheNode_Sub15_2687,
						aClass226_270.anInt2685, aClass226_270.anInt2688, i_1_,
						-114, aClass48_233.aBoolean691);
				if (aBoolean234 && aClass48_233.anIntArray712 != null
						&& aClass226_241.aBoolean2689) {
					drawablemodel.method625(
							aClass226_241.aCacheNode_Sub15_2683, anInt247,
							aClass48_233.anIntArray707[anInt259],
							aClass226_241.aCacheNode_Sub15_2687,
							aClass226_241.anInt2685, aClass226_241.anInt2688,
							i_1_, -100, aClass48_233.aBoolean691);
				}
			}
		}
	}

	final boolean method226(byte b, int i) {
		if (b > -57) {
			anInt253 = -70;
		}
		anInt250++;
		if (aClass48_233 == null | (i -= anInt237) <= 0) {
			return false;
		}
		return aClass48_233.aBoolean714
				| anInt247 + i > aClass48_233.anIntArray707[anInt259];
	}

	final void method227(int i, int i_2_) {
		anInt237 = i;
		anInt271++;
	}

	final void method228(int i, int i_4_, byte b, int i_5_, boolean bool) {
		anInt244++;
		if ((method250((byte) -62) ^ 0xffffffff) != (i ^ 0xffffffff)) {
			if ((i ^ 0xffffffff) == 0) {
				aClass48_233 = null;
			} else {
				if (aClass48_233 == null || i != aClass48_233.anInt711) {
					aClass48_233 = Class367.aClass37_4540.method395(i,
							(byte) -93);
				} else if ((aClass48_233.anInt706 ^ 0xffffffff) == -1) {
					return;
				}
				anInt237 = i_4_;
				anInt253 = i_5_;
				anInt255 = 0;
				if (!bool) {
					anInt247 = 0;
					anInt259 = 0;
				} else {
					anInt259 = (int) ((double) aClass48_233.anIntArray715.length * Math
							.random());
					anInt247 = (int) (Math.random() * (double) aClass48_233.anIntArray707[anInt259]);
				}
				anInt243 = 1 + anInt259;
				if ((anInt243 ^ 0xffffffff) > -1
						|| anInt243 >= (aClass48_233.anIntArray715 == null ? 0
								: aClass48_233.anIntArray715.length)) {
					anInt243 = -1;
				}
				if (anInt237 == 0) {
					method222(anInt259, aClass48_233, (byte) 10);
				}
				aBoolean263 = false;
			}
			method244(-109);
		}
	}

	final void method229(byte b, int i) {
		anInt259 = 0;
		anInt268++;
		anInt243 = aClass48_233.anIntArray715.length <= 1 ? -1 : 1;
		anInt247 = 0;
		aBoolean263 = false;
		anInt237 = i;
		anInt255 = 0;
		if (aClass48_233 != null) {
			method222(anInt259, aClass48_233, (byte) 82);
			method244(-115);
		}
	}

	static final void method230(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		anInt240++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 18,
				(long) i << 32 | (long) i_10_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9434 = i_11_;
		cachenode_sub2.anInt9432 = i_8_;
	}

	static final Class256 method231(boolean bool, Mobile mobile) {
		anInt246++;
		Class256 class256;
		if (Class329.aClass256_4122 != null) {
			class256 = Class329.aClass256_4122;
			Class329.aClass256_4122 = Class329.aClass256_4122.aClass256_3238;
			class256.aClass256_3238 = null;
			RuntimeException_Sub1.anInt4922--;
		} else {
			class256 = new Class256();
		}
		class256.aMobile3239 = mobile;
		if (bool != false) {
			method230(83, -97, -118, -83, -95);
		}
		return class256;
	}

	final void method232(int i, Animator animator_13_) {
		aClass48_233 = animator_13_.aClass48_233;
		aBoolean234 = animator_13_.aBoolean234;
		aBoolean263 = animator_13_.aBoolean263;
		if (i != 18634) {
			method235(-122);
		}
		anInt237 = animator_13_.anInt237;
		anInt255 = animator_13_.anInt255;
		anInt236++;
		anInt243 = animator_13_.anInt243;
		anInt259 = animator_13_.anInt259;
		anInt247 = animator_13_.anInt247;
		method244(-124);
	}

	public static void method233(int i) {
		aClass346_252 = null;
		if (i != 100) {
			method236(true, 5);
		}
	}

	final void method234(int i, int i_14_, int i_15_) {
		if (i_15_ >= 97) {
			method228(i_14_, i, (byte) 109, 0, false);
			anInt267++;
		}
	}

	final void method235(int i) {
		method229((byte) -127, i);
		anInt256++;
	}

	static final int method236(boolean bool, int i) {
		if (bool != false) {
			aClass346_252 = null;
		}
		anInt242++;
		return 0xff & i;
	}

	final int method237(byte b) {
		anInt235++;
		if (b >= -125) {
			method247(-46);
		}
		if (method247(29340)) {
			int i = 0;
			if (method247(29340)) {
				i |= aClass226_270.anInt2691;
				if (aBoolean234 && aClass48_233.anIntArray712 != null) {
					i |= aClass226_241.anInt2691;
				}
			}
			return i;
		}
		return 0;
	}

	final boolean method238(int i) {
		anInt257++;
		if (i > -10) {
			method227(-2, -59);
		}
		return aBoolean263;
	}

	static final void method239(DrawableModel drawablemodel, int i, int i_16_,
			int i_17_, Class171 class171, int i_18_) {
		anInt264++;
		if (i_18_ < -77 && drawablemodel != null) {
			class171.method1793(drawablemodel.fa(), drawablemodel.HA(), i_16_,
					i_17_, drawablemodel.G(), -45, drawablemodel.na(), i,
					drawablemodel.EA(), drawablemodel.V(), drawablemodel.RA());
		}
	}

	final void method240(boolean bool, int i, int i_19_) {
		anInt260++;
		if (i_19_ != 838828768) {
			method240(true, 51, 15);
		}
		method228(i, 0, (byte) -78, 0, bool);
	}

	final void method241(DrawableModel drawablemodel, int i) {
		anInt238++;
		if (method247(29340)) {
			drawablemodel.method631(aClass226_270.anInt2685, i + 68,
					aClass226_270.aCacheNode_Sub15_2683);
			if (aBoolean234 && aClass48_233.anIntArray712 != null
					&& aClass226_241.aBoolean2689) {
				drawablemodel.method631(aClass226_241.anInt2685, 37,
						aClass226_241.aCacheNode_Sub15_2683);
			}
		}
		if (i != 0) {
			method222(-63, null, (byte) -38);
		}
	}

	final boolean method242(byte b) {
		if (b != -77) {
			anInt255 = -105;
		}
		anInt248++;
        return (anInt237 ^ 0xffffffff) != -1;
    }

	final Class48 method243(byte b) {
		anInt272++;
		if (b != -24) {
			method226((byte) -69, -21);
		}
		return aClass48_233;
	}

	private final void method244(int i) {
		if (i >= -107) {
			anInt237 = 2;
		}
		aClass226_270.method2115((byte) -116);
		anInt239++;
		if (aBoolean234) {
			aClass226_241.method2115((byte) -110);
		}
	}

	final boolean method245(int i) {
		anInt266++;
		if (i >= -123) {
			method247(-25);
		}
        return aClass48_233 != null;
    }

	final void method246(int i, int i_20_, boolean bool,
			DrawableModel drawablemodel) {
		anInt262++;
		if (method247(29340)) {
			drawablemodel.method634(anInt247,
					aClass226_270.aCacheNode_Sub15_2683,
					aClass226_270.aCacheNode_Sub15_2687,
					aClass226_270.anInt2685, i_20_, null, (byte) -83,
					aClass48_233.anIntArray707[anInt259],
					aClass48_233.aBoolean691, aClass226_270.anInt2688, i);
			if (aBoolean234 && aClass48_233.anIntArray712 != null
					&& aClass226_241.aBoolean2689) {
				drawablemodel.method634(anInt247,
						aClass226_241.aCacheNode_Sub15_2683,
						aClass226_241.aCacheNode_Sub15_2687,
						aClass226_241.anInt2685, i_20_, null, (byte) -83,
						aClass48_233.anIntArray707[anInt259],
						aClass48_233.aBoolean691, aClass226_241.anInt2688, i);
			}
		}
		if (bool != true) {
			anInt259 = -48;
		}
	}

	final boolean method247(int i) {
		if (i != 29340) {
			return true;
		}
		anInt245++;
		if (aClass48_233 == null) {
			return false;
		}
		boolean bool = aClass48_233.anIntArray715 != null && aClass226_270.method2110(Class367.aClass37_4540,
                (byte) -93, aClass48_233, anInt243, anInt259,
                aClass48_233.anIntArray715);
		if (bool && aBoolean234 && aClass48_233.anIntArray712 != null) {
			aClass226_241.method2110(Class367.aClass37_4540, (byte) -123,
					aClass48_233, anInt243, anInt259,
					aClass48_233.anIntArray712);
		}
		return bool;
	}

	final boolean method248(int i, int i_21_) {
		anInt249++;
		if (i >= -83) {
			method250((byte) 67);
		}
		if (aClass48_233 == null || i_21_ == 0) {
			return false;
		}
		if (anInt237 > 0) {
			if (anInt237 >= i_21_) {
				anInt237 -= i_21_;
				return false;
			}
			i_21_ -= anInt237;
			anInt237 = 0;
			method222(anInt259, aClass48_233, (byte) 87);
		}
		i_21_ += anInt247;
		boolean bool = Class320_Sub12.aBoolean8325 | aClass48_233.aBoolean714;
		if (i_21_ > 100 && (aClass48_233.anInt696 ^ 0xffffffff) < -1) {
			int i_22_;
			for (i_22_ = aClass48_233.anIntArray715.length
					- aClass48_233.anInt696; anInt259 < i_22_; anInt259++) {
				if (i_21_ <= aClass48_233.anIntArray707[anInt259]) {
					break;
				}
				i_21_ -= aClass48_233.anIntArray707[anInt259];
			}
			if ((i_22_ ^ 0xffffffff) >= (anInt259 ^ 0xffffffff)) {
				int i_23_ = 0;
				for (int i_24_ = i_22_; i_24_ < aClass48_233.anIntArray715.length; i_24_++)
					i_23_ += aClass48_233.anIntArray707[i_24_];
				if (anInt253 == 0) {
					anInt255 += i_21_ / i_23_;
				}
				i_21_ %= i_23_;
			}
			anInt243 = 1 + anInt259;
			bool = true;
			if ((anInt243 ^ 0xffffffff) <= (aClass48_233.anIntArray715.length ^ 0xffffffff)) {
				anInt243 -= aClass48_233.anInt696;
				if ((anInt243 ^ 0xffffffff) > -1
						|| (aClass48_233.anIntArray715.length ^ 0xffffffff) >= (anInt243 ^ 0xffffffff)) {
					anInt243 = -1;
				}
			}
		}
		if (aClass48_233.anIntArray707 != null) {
			while (aClass48_233.anIntArray707[anInt259] < i_21_) {
				i_21_ -= aClass48_233.anIntArray707[anInt259++];
				bool = true;
				if (aClass48_233.anIntArray715.length <= anInt259) {
					if ((aClass48_233.anInt696 ^ 0xffffffff) != 0
							&& anInt253 != 2) {
						anInt259 -= aClass48_233.anInt696;
						if (anInt253 == 0) {
							anInt255++;
						}
					}
					if (anInt255 >= aClass48_233.anInt708 || anInt259 < 0
							|| anInt259 >= aClass48_233.anIntArray715.length) {
						aBoolean263 = true;
						break;
					}
				}
				method222(anInt259, aClass48_233, (byte) 102);
				anInt243 = anInt259 + 1;
				if ((anInt243 ^ 0xffffffff) <= (aClass48_233.anIntArray715.length ^ 0xffffffff)) {
					anInt243 -= aClass48_233.anInt696;
					if (anInt243 < 0
							|| anInt243 >= aClass48_233.anIntArray715.length) {
						anInt243 = -1;
					}
				}
			}
		}
		anInt247 = i_21_;
		if (bool) {
			method244(-108);
		}
		return bool;
	}

	final void method249(boolean bool, int i) {
		anInt251++;
		if (bool != true) {
			method240(true, -1, 58);
		}
		method228(i, 0, (byte) 60, 0, false);
	}

	final int method250(byte b) {
		anInt261++;
		if (aClass48_233 != null) {
			return aClass48_233.anInt711;
		}
		return -1;
	}

	final void method251(boolean bool) {
		anInt258++;
		anInt255 = 0;
		if (bool != true) {
			anInt237 = 98;
		}
	}

	Animator(boolean bool) {
		aBoolean234 = bool;
		aClass226_270 = new Class226();
		if (!aBoolean234) {
			aClass226_241 = null;
		} else {
			aClass226_241 = new Class226();
		}
	}
}
