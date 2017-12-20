/* Node_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Node_Sub20 extends Node
{
	protected String aString7174;
	static short[] aShortArray7175;
	static int anInt7176;
	protected int[] anIntArray7177;
	static Class151 aClass151_7178 = new Class151(14, 0, 4, 1);
	static int anInt7179;
	static int anInt7180;
	
	static final GraphicsToolkit method2613(int i, int i_0_, Index class302, d var_d, java.awt.Canvas canvas) {
		anInt7176++;
		if (!Class352.method4012(80)) {
			throw new RuntimeException("");
		}
		if (!Node_Sub38_Sub2.method2793(i_0_, "jaggl")) {
			throw new RuntimeException("");
		}
		OpenGL opengl = new OpenGL();
		long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
		if (l == 0L) {
			throw new RuntimeException("");
		}
		GLXToolkit glxtoolkit = new GLXToolkit(opengl, canvas, l, var_d, class302, i);
		glxtoolkit.method1358(i_0_ ^ 0x43);
		return glxtoolkit;
	}
	
	static final void method2614(boolean bool, Actor actor, boolean bool_1_) {
		anInt7180++;
		Class259 class259 = actor.method868((byte) -128);
		if ((actor.anInt10904 ^ 0xffffffff) == -1) {
			actor.anInt10901 = 0;
			Class320_Sub23.anInt8431 = 0;
			Class275.anInt5412 = -1;
		} else {
			if (actor.anAnimator10876.method245(-124) && !actor.anAnimator10876.method242((byte) -77)) {
				Class48 class48 = actor.anAnimator10876.method243((byte) -24);
				if (actor.anInt10900 > 0 && class48.anInt698 == 0) {
					Class320_Sub23.anInt8431 = 0;
					Class275.anInt5412 = -1;
					actor.anInt10901++;
					return;
				}
				if ((actor.anInt10900 ^ 0xffffffff) >= -1 && class48.anInt718 == 0) {
					Class275.anInt5412 = -1;
					actor.anInt10901++;
					Class320_Sub23.anInt8431 = 0;
					return;
				}
			}
			for (int i = 0; (actor.aClass165Array10886.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if ((actor.aClass165Array10886[i].graphicsId ^ 0xffffffff) != 0 && actor.aClass165Array10886[i].anAnimator2026.method242((byte) -77)) {
					Class195 class195 = Class16.aClass101_228.method1090(-121, actor.aClass165Array10886[i].graphicsId);
					if (class195.aBoolean2402 && (class195.anInt2394 ^ 0xffffffff) != 0) {
						Class48 class48 = Class18.aClass37_306.method395(class195.anInt2394, (byte) -95);
						if (actor.anInt10900 > 0 && class48.anInt698 == 0) {
							Class275.anInt5412 = -1;
							actor.anInt10901++;
							Class320_Sub23.anInt8431 = 0;
							return;
						}
						if (actor.anInt10900 <= 0 && class48.anInt718 == 0) {
							Class275.anInt5412 = -1;
							actor.anInt10901++;
							Class320_Sub23.anInt8431 = 0;
							return;
						}
					}
				}
			}
			int i = actor.anInt5934;
			int i_2_ = actor.anInt5940;
			int i_3_ = 512 * actor.scenePositionXQueue[-1 + actor.anInt10904] - -(actor.getSize((byte) 76) * 256);
			int i_4_ = actor.scenePositionYQueue[-1 + actor.anInt10904] * 512 + 256 * actor.getSize((byte) 105);
			if (i < i_3_) {
				if ((i_2_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
					actor.method856((byte) -108, 10240);
				} else if (i_4_ < i_2_) {
					actor.method856((byte) 113, 14336);
				} else {
					actor.method856((byte) 34, 12288);
				}
			} else if (i_3_ >= i) {
				if (i_2_ >= i_4_) {
					if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						actor.method856((byte) 81, 0);
					}
				} else {
					actor.method856((byte) 126, 8192);
				}
			} else if ((i_4_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
				actor.method856((byte) 78, 6144);
			} else if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
				actor.method856((byte) -72, 2048);
			} else {
				actor.method856((byte) 66, 4096);
			}
			byte b = actor.movementTypeQueue[-1 + actor.anInt10904];
			if (!bool_1_ && (i_3_ - i > 1024 || i_3_ - i < -1024 || (-i_2_ + i_4_ ^ 0xffffffff) < -1025 || (i_4_ + -i_2_ ^ 0xffffffff) > 1023)) {
				actor.anInt5940 = i_4_;
				actor.anInt5934 = i_3_;
				actor.method849(actor.anInt10889, -72, false);
				Class320_Sub23.anInt8431 = 0;
				if (actor.anInt10900 > 0) {
					actor.anInt10900--;
				}
				Class275.anInt5412 = -1;
				actor.anInt10904--;
			} else {
				int i_5_ = 16;
				boolean bool_6_ = bool;
				if (actor instanceof Npc) {
					bool_6_ = ((Npc) actor).aNpcDefinition11122.aBoolean2817;
				}
				if (!bool_6_) {
					if (!bool_1_ && actor.anInt10904 > 1) {
						i_5_ = 24;
					}
					if (!bool_1_ && (actor.anInt10904 ^ 0xffffffff) < -3) {
						i_5_ = 32;
					}
				} else {
					int i_7_ = -actor.aClass99_10893.anInt1281 + actor.anInt10889;
					if (i_7_ != 0 && actor.faceEntity == -1 && actor.anInt10890 != 0) {
						i_5_ = 8;
					}
					if (!bool_1_ && actor.anInt10904 > 2) {
						i_5_ = 24;
					}
					if (!bool_1_ && (actor.anInt10904 ^ 0xffffffff) < -4) {
						i_5_ = 32;
					}
				}
				if (actor.anInt10901 > 0 && (actor.anInt10904 ^ 0xffffffff) < -2) {
					actor.anInt10901--;
					i_5_ = 32;
				}
				if ((b ^ 0xffffffff) != -3) {
					if ((b ^ 0xffffffff) == -1) {
						i_5_ >>= 1;
					}
				} else {
					i_5_ <<= 1;
				}
				if (class259.anInt3256 != -1) {
					i_5_ <<= 9;
					if (actor.anInt10904 != 1) {
						if ((i_5_ ^ 0xffffffff) >= (actor.anInt10907 ^ 0xffffffff)) {
							if (actor.anInt10907 > 0) {
								actor.anInt10907 -= class259.anInt3256;
								if ((actor.anInt10907 ^ 0xffffffff) > -1) {
									actor.anInt10907 = 0;
								}
							}
						} else {
							actor.anInt10907 += class259.anInt3256;
							if (i_5_ < actor.anInt10907) {
								actor.anInt10907 = i_5_;
							}
						}
					} else {
						int i_8_ = actor.anInt10907 * actor.anInt10907;
						int i_9_ = ((i_3_ ^ 0xffffffff) <= (actor.anInt5934 ^ 0xffffffff) ? i_3_ - actor.anInt5934 : actor.anInt5934 - i_3_) << 9;
						int i_10_ = (actor.anInt5940 <= i_4_ ? -actor.anInt5940 + i_4_ : actor.anInt5940 + -i_4_) << 9;
						int i_11_ = (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff) ? i_9_ : i_10_;
						int i_12_ = i_11_ * class259.anInt3256 * 2;
						if (i_12_ >= i_8_) {
							if (i_8_ / 2 <= i_11_) {
								if ((i_5_ ^ 0xffffffff) < (actor.anInt10907 ^ 0xffffffff)) {
									actor.anInt10907 += class259.anInt3256;
									if ((actor.anInt10907 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
										actor.anInt10907 = i_5_;
									}
								}
							} else {
								actor.anInt10907 -= class259.anInt3256;
								if ((actor.anInt10907 ^ 0xffffffff) > -1) {
									actor.anInt10907 = 0;
								}
							}
						} else {
							actor.anInt10907 /= 2;
						}
					}
					i_5_ = actor.anInt10907 >> 9;
					if (i_5_ < 1) {
						i_5_ = 1;
					}
				}
				Class320_Sub23.anInt8431 = 0;
				if ((i_3_ ^ 0xffffffff) == (i ^ 0xffffffff) && i_2_ == i_4_) {
					Class275.anInt5412 = -1;
				} else {
					if (i_3_ > i) {
						actor.anInt5934 += i_5_;
						Class320_Sub23.anInt8431 |= 0x4;
						if (actor.anInt5934 > i_3_) {
							actor.anInt5934 = i_3_;
						}
					} else if (i_3_ < i) {
						actor.anInt5934 -= i_5_;
						Class320_Sub23.anInt8431 |= 0x8;
						if (i_3_ > actor.anInt5934) {
							actor.anInt5934 = i_3_;
						}
					}
					if ((i_5_ ^ 0xffffffff) <= -33) {
						Class275.anInt5412 = 2;
					} else {
						Class275.anInt5412 = b;
					}
					if ((i_4_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) {
						if ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
							actor.anInt5940 -= i_5_;
							Class320_Sub23.anInt8431 |= 0x2;
							if ((i_4_ ^ 0xffffffff) < (actor.anInt5940 ^ 0xffffffff)) {
								actor.anInt5940 = i_4_;
							}
						}
					} else {
						Class320_Sub23.anInt8431 |= 0x1;
						actor.anInt5940 += i_5_;
						if ((i_4_ ^ 0xffffffff) > (actor.anInt5940 ^ 0xffffffff)) {
							actor.anInt5940 = i_4_;
						}
					}
				}
				if (actor.anInt5934 == i_3_ && (i_4_ ^ 0xffffffff) == (actor.anInt5940 ^ 0xffffffff)) {
					actor.anInt10904--;
					if (actor.anInt10900 > 0) {
						actor.anInt10900--;
					}
				}
			}
		}
	}
	
	Node_Sub20(String string, int i) {
		anIntArray7177 = new int[i];
		aString7174 = string;
	}
	
	static final void method2615(Class52 class52, String string, Class357 class357, int i, int i_13_, int i_14_, boolean bool, IComponentDefinitions widget, aa var_aa, int i_15_, int i_16_, int i_17_) {
		anInt7179++;
		int i_18_;
		if (Class320_Sub22.anInt8415 == 4) {
			i_18_ = (int) Node_Sub12.aFloat5450 & 0x3fff;
		} else {
			i_18_ = (int) Node_Sub12.aFloat5450 - -Mobile_Sub1.anInt10960 & 0x3fff;
		}
		int i_19_ = 10 + Math.max(widget.anInt4809 / 2, widget.anInt4695 / 2);
		if (bool != false) {
			method2615(null, null, null, -66, 108, -17, true, null, null, -31, 37, -11);
		}
		int i_20_ = i_15_ * i_15_ + i_17_ * i_17_;
		if ((i_19_ * i_19_ ^ 0xffffffff) <= (i_20_ ^ 0xffffffff)) {
			int i_21_ = Class335.anIntArray4167[i_18_];
			int i_22_ = Class335.anIntArray4165[i_18_];
			if (Class320_Sub22.anInt8415 != 4) {
				i_21_ = i_21_ * 256 / (256 + Node_Sub15_Sub13.anInt9870);
				i_22_ = i_22_ * 256 / (Node_Sub15_Sub13.anInt9870 - -256);
			}
			int i_23_ = i_22_ * i_17_ + i_15_ * i_21_ >> 14;
			int i_24_ = -(i_17_ * i_21_) + i_15_ * i_22_ >> 14;
			int i_25_ = class357.method4030(null, 0, string, 100);
			i_23_ -= i_25_ / 2;
			int i_26_ = class357.method4034(100, 0, string, null, (byte) -35);
			if (i_23_ >= -widget.anInt4809 && (widget.anInt4809 ^ 0xffffffff) <= (i_23_ ^ 0xffffffff) && i_24_ >= -widget.anInt4695 && (widget.anInt4695 ^ 0xffffffff) <= (i_24_ ^ 0xffffffff)) {
				class52.method535(i_16_, null, i_13_, string, var_aa, null, -i_24_ + (widget.anInt4695 / 2 + (i_16_ + -i_14_ + -i_26_)), 0, 101, i, 1, widget.anInt4809 / 2 + (i_23_ - -i), 0, 0, i_25_, 50);
			}
		}
	}
	
	public static void method2616(int i) {
		aClass151_7178 = null;
		if (i == 0) {
			aShortArray7175 = null;
		}
	}
}
