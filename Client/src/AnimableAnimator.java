/* AnimableAnimator - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class AnimableAnimator extends Animator
{
	static int anInt5495;
	static int anInt5496;
	private Animable anAnimable5497;
	static Class42 aClass42_5498;
	static int anInt5499;
	static Class124 aClass124_5500 = new Class124(60);
	static int anInt5501;
	
	public static void method252(int i) {
		aClass124_5500 = null;
		aClass42_5498 = null;
		if (i != 7) {
			aClass124_5500 = null;
		}
	}
	
	static final void method253(d var_d, GraphicsToolkit graphicstoolkit, boolean bool) {
		anInt5496++;
		if (Class20.aCacheNode_Sub11_318 != null) {
			if (Node_Sub25_Sub1.anInt9947 < 10) {
				if (!Class20.aClass302_314.method3527(Class20.aCacheNode_Sub11_318.aString9537, 0)) {
					Node_Sub25_Sub1.anInt9947 = r_Sub1.aClass302_11047.method3522((byte) 127, Class20.aCacheNode_Sub11_318.aString9537) / 10;
					return;
				}
				Class371.method4096((byte) -118);
				Node_Sub25_Sub1.anInt9947 = 10;
			}
			if (Node_Sub25_Sub1.anInt9947 == 10) {
				Class20.anInt354 = Class20.aCacheNode_Sub11_318.anInt9541 >> 6 << 6;
				Class20.anInt343 = Class20.aCacheNode_Sub11_318.anInt9540 >> 6 << 6;
				Class20.anInt345 = (Class20.aCacheNode_Sub11_318.anInt9531 >> 6 << 6) - (Class20.anInt354 - 64);
				Class20.anInt333 = 64 + (-Class20.anInt343 + (Class20.aCacheNode_Sub11_318.anInt9545 >> 6 << 6));
				int[] is = new int[3];
				int i = -1;
				int i_0_ = -1;
				if (Class20.aCacheNode_Sub11_318.method2337(-12584, is, Class320_Sub4.gameSceneBaseY - -(Class295.myPlayer.anInt5940 >> 9), Class295.myPlayer.plane, (Class295.myPlayer.anInt5934 >> 9) + Node_Sub53.gameSceneBaseX)) {
					i = -Class20.anInt354 + is[1];
					i_0_ = is[2] + -Class20.anInt343;
				}
				if (!Class369.aBoolean4555 && i >= 0 && Class20.anInt345 > i && i_0_ >= 0 && i_0_ < Class20.anInt333) {
					i_0_ += (int) (10.0 * Math.random()) - 5;
					i += -5 + (int) (10.0 * Math.random());
					Class94.anInt1250 = i;
					Class327.anInt5360 = i_0_;
				} else if ((Class262_Sub8.anInt7756 ^ 0xffffffff) == 0 || (IOException_Sub1.anInt84 ^ 0xffffffff) == 0) {
					Class20.aCacheNode_Sub11_318.method2334(2048, (0xfffc787 & Class20.aCacheNode_Sub11_318.anInt9535) >> 14, Class20.aCacheNode_Sub11_318.anInt9535 & 0x3fff, is);
					Class327.anInt5360 = is[2] - Class20.anInt343;
					Class94.anInt1250 = -Class20.anInt354 + is[1];
				} else {
					Class20.aCacheNode_Sub11_318.method2334(2048, Class262_Sub8.anInt7756, IOException_Sub1.anInt84, is);
					if (is != null) {
						Class327.anInt5360 = is[2] - Class20.anInt343;
						Class94.anInt1250 = -Class20.anInt354 + is[1];
					}
					Class369.aBoolean4555 = false;
					Class262_Sub8.anInt7756 = IOException_Sub1.anInt84 = -1;
				}
				if ((Class20.aCacheNode_Sub11_318.anInt9547 ^ 0xffffffff) != -38) {
					if (Class20.aCacheNode_Sub11_318.anInt9547 != 50) {
						if (Class20.aCacheNode_Sub11_318.anInt9547 != 75) {
							if (Class20.aCacheNode_Sub11_318.anInt9547 != 100) {
								if ((Class20.aCacheNode_Sub11_318.anInt9547 ^ 0xffffffff) == -201) {
									Class20.aFloat329 = Class20.aFloat327 = 16.0F;
								} else {
									Class20.aFloat329 = Class20.aFloat327 = 8.0F;
								}
							} else {
								Class20.aFloat329 = Class20.aFloat327 = 8.0F;
							}
						} else {
							Class20.aFloat329 = Class20.aFloat327 = 6.0F;
						}
					} else {
						Class20.aFloat329 = Class20.aFloat327 = 4.0F;
					}
				} else {
					Class20.aFloat329 = Class20.aFloat327 = 3.0F;
				}
				Class20.anInt328 = (int) Class20.aFloat327 >> 1;
				Class20.aByteArrayArrayArray332 = Node_Sub29_Sub3.method2719(-7499, Class20.anInt328);
				Class207.method2039(80);
				Class20.method279();
				Node_Sub43.aClass312_7541 = new Class312();
				Class20.anInt323 += (int) (5.0 * Math.random()) - 2;
				if ((Class20.anInt323 ^ 0xffffffff) > 7) {
					Class20.anInt323 = -8;
				}
				Class20.anInt324 += (int) (5.0 * Math.random()) - 2;
				if (Class20.anInt323 > 8) {
					Class20.anInt323 = 8;
				}
				if ((Class20.anInt324 ^ 0xffffffff) > 15) {
					Class20.anInt324 = -16;
				}
				if ((Class20.anInt324 ^ 0xffffffff) < -17) {
					Class20.anInt324 = 16;
				}
				Class20.method277(var_d, Class20.anInt323 >> 2 << 10, Class20.anInt324 >> 1);
				Class20.aClass215_322.method2068(-1, 1024, 256);
				Class20.aClass338_315.method3912(256, 120, 256);
				Class20.aClass112_319.method1144(64, 4096);
				IOException_Sub1.aClass128_85.method1543(16509, 256);
				Node_Sub25_Sub1.anInt9947 = 20;
			} else {
				if (bool != false) {
					method253(null, null, false);
				}
				if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -21) {
					Node_Sub24.method2650(true, -14651);
					Class20.method290(graphicstoolkit, Class20.anInt323, Class20.anInt324);
					Node_Sub25_Sub1.anInt9947 = 60;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if (Node_Sub25_Sub1.anInt9947 == 60) {
					if (!Class20.aClass302_314.method3516(Class20.aCacheNode_Sub11_318.aString9537 + "_staticelements", -74)) {
						Class20.aClass224_330 = new Class224(0);
					} else {
						if (!Class20.aClass302_314.method3527(Class20.aCacheNode_Sub11_318.aString9537 + "_staticelements", 0)) {
							return;
						}
						Class20.aClass224_330 = Class152.method1695(Class101.aBoolean1313, 0, Class20.aClass302_314, Class20.aCacheNode_Sub11_318.aString9537 + "_staticelements");
					}
					Class20.method289();
					Node_Sub25_Sub1.anInt9947 = 70;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -71) {
					Packet.aClass299_9394 = new Class299(graphicstoolkit, 11, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 73;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -74) {
					EntityNode_Sub6.aClass299_5988 = new Class299(graphicstoolkit, 12, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 76;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -77) {
					Class75.aClass299_1007 = new Class299(graphicstoolkit, 14, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 79;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -80) {
					Class352.aClass299_4329 = new Class299(graphicstoolkit, 17, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 82;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if (Node_Sub25_Sub1.anInt9947 == 82) {
					Class150_Sub2.aClass299_8962 = new Class299(graphicstoolkit, 19, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 85;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -86) {
					Node_Sub25_Sub3.aClass299_9980 = new Class299(graphicstoolkit, 22, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 88;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else if ((Node_Sub25_Sub1.anInt9947 ^ 0xffffffff) == -89) {
					Class195.aClass299_2380 = new Class299(graphicstoolkit, 26, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 91;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
				} else {
					Class190.aClass299_2330 = new Class299(graphicstoolkit, 30, true, Node_Sub38_Sub20.aCanvas10309);
					Node_Sub25_Sub1.anInt9947 = 100;
					Node_Sub24.method2650(true, -14651);
					Node_Sub38_Sub10.method2824(0);
					System.gc();
				}
			}
		}
	}
	
	static final int method254(int i, int i_1_, int i_2_) {
		anInt5499++;
		if (i_1_ != 16939) {
			aClass42_5498 = null;
		}
		int i_3_ = i_2_ - 1 & i >> 31;
		return i_3_ + (i + (i >>> 31)) % i_2_;
	}
	
	final void method222(int i, Class48 class48, byte b) {
		BufferedConnection.method427(class48, i, anAnimable5497, (byte) -63);
		anInt5495++;
		if (b <= 3) {
			method254(-77, 48, 34);
		}
	}
	
	AnimableAnimator(Animable animable, boolean bool) {
		super(bool);
		anAnimable5497 = animable;
	}
}
