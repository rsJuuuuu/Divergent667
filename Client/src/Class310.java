/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class310
{
	private Animator anAnimator3918;
	private boolean aBoolean3919 = false;
	private Animable anAnimable3920;
	private boolean aBoolean3921;
	static int anInt3922;
	private int anInt3923;
	static int anInt3924;
	private byte aByte3925;
	protected int anInt3926;
	static int anInt3927;
	private int anInt3928;
	static int anInt3929;
	private Class121 aClass121_3930;
	protected EntityNode_Sub4 anEntityNode_Sub4_3931;
	private boolean aBoolean3932;
	protected int anInt3933;
	static int anInt3934;
	static int anInt3935;
	private int anInt3936 = 0;
	static int anInt3937;
	static int anInt3938;
	private DrawableModel aDrawableModel3939;
	static int anInt3940;
	static int anInt3941;
	private r aR3942;
	static int anInt3943;
	private byte aByte3944;
	static int anInt3945;
	static int anInt3946;
	private int anInt3947;
	static int anInt3948;
	private boolean aBoolean3949;
	static int anInt3950;
	protected int anInt3951;
	static int anInt3952;
	private boolean[] aBooleanArray3953;
	
	final void method3587(GraphicsToolkit graphicstoolkit, int i) {
		anInt3945++;
		method3597(graphicstoolkit, true, true, true, i);
	}
	
	final void method3588(GraphicsToolkit graphicstoolkit, byte b) {
		if (aR3942 != null) {
			Node_Sub23.method2636(aR3942, aByte3944, anAnimable3920.anInt5934, anAnimable3920.anInt5940, aBooleanArray3953);
			aBooleanArray3953 = null;
			aR3942 = null;
		}
		if (b != 16) {
			method3587(null, 67);
		}
		anInt3927++;
	}
	
	static final void method3589(int i, int i_0_, byte b, int i_1_, int i_2_) {
		for (int i_3_ = 0; Node_Sub11.anInt7105 > i_3_; i_3_++) {
			Rectangle rectangle = Node_Sub38_Sub28.aRectangleArray10404[i_3_];
			if ((i_0_ ^ 0xffffffff) > (rectangle.x + rectangle.width ^ 0xffffffff) && (i_0_ - -i ^ 0xffffffff) < (rectangle.x ^ 0xffffffff) && (rectangle.height + rectangle.y ^ 0xffffffff) < (i_2_ ^ 0xffffffff) && rectangle.y < i_1_ + i_2_) {
				Class195.aBooleanArray2387[i_3_] = true;
			}
		}
		anInt3935++;
		if (b <= 101) {
			method3589(-1, -125, (byte) -126, -17, 94);
		}
		Class362.method4053(i_2_, i_2_ + i_1_, i_0_, (byte) 121, i_0_ - -i);
	}
	
	final int method3590(byte b) {
		anInt3946++;
		if (b != -112) {
			return -49;
		}
		return anInt3947;
	}
	
	final void method3591(int i, int i_4_) {
		anInt3941++;
		aBoolean3919 = true;
		method3595(1, i, (byte) -63, false);
		if (i_4_ != 30994) {
			anInt3933 = -57;
		}
	}
	
	final int method3592(boolean bool) {
		if (bool != true) {
			method3597(null, false, false, false, 98);
		}
		anInt3929++;
		return anInt3936;
	}
	
	static final byte[] method3593(int i, int i_5_, boolean bool, byte[] bs) {
		anInt3922++;
		byte[] bs_6_ = new byte[i_5_];
		Class311.method3608(bs, i, bs_6_, 0, i_5_);
		if (bool != true) {
			method3601(null, null, 104, null, null);
		}
		return bs_6_;
	}
	
	final boolean method3594(int i) {
		if (i != 10) {
			anInt3947 = 3;
		}
		anInt3943++;
		return aBoolean3932;
	}
	
	private final void method3595(int i, int i_7_, byte b, boolean bool) {
		if (b < -54) {
			anInt3952++;
			int i_8_ = i_7_;
			boolean bool_9_ = false;
			if (i_8_ == -1) {
				ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(anInt3933, 74);
				ObjectDefinition objectdefinition_10_ = objectdefinition;
				if (objectdefinition.anIntArray2984 != null) {
					objectdefinition = objectdefinition.method3038(13, (aa.anInt101 ^ 0xffffffff) != -4 ? Class24.aClass275_442 : ProducingGraphicsBuffer.anInterface17_9901);
				}
				if (objectdefinition == null) {
					return;
				}
				if (objectdefinition_10_ == objectdefinition) {
					objectdefinition_10_ = null;
				}
				if (!objectdefinition.method3037(0)) {
					if (objectdefinition_10_ != null && objectdefinition_10_.method3037(0)) {
						if (bool && anAnimator3918.method245(-126) && objectdefinition_10_.method3035(anAnimator3918.method250((byte) -69), -166)) {
							return;
						}
						if (anInt3928 != objectdefinition.objectId) {
							bool_9_ = objectdefinition_10_.aBoolean3000;
						}
						i_8_ = objectdefinition_10_.method3044(-16828);
						if (!objectdefinition_10_.method3032((byte) 26)) {
							i = 1;
						} else {
							i = 0;
						}
					}
				} else {
					if (bool && anAnimator3918.method245(-127) && objectdefinition.method3035(anAnimator3918.method250((byte) 95), -166)) {
						return;
					}
					if ((anInt3928 ^ 0xffffffff) != (objectdefinition.objectId ^ 0xffffffff)) {
						bool_9_ = objectdefinition.aBoolean3000;
					}
					i_8_ = objectdefinition.method3044(-16828);
					if (!objectdefinition.method3032((byte) -77)) {
						i = 1;
					} else {
						i = 0;
					}
				}
			}
			if ((i_8_ ^ 0xffffffff) == 0) {
				anAnimator3918.method240(false, -1, 838828768);
			} else {
				anAnimator3918.method228(i_8_, 0, (byte) 121, i, bool_9_);
				aDrawableModel3939 = null;
				aBoolean3949 = false;
				anInt3923 = Class174.clientCycle;
			}
		}
	}
	
	static final IncommingPacket[] method3596(byte b) {
		if (b != -59) {
			return null;
		}
		anInt3937++;
		return new IncommingPacket[] { Node_Sub9_Sub5.aClass192_9750, Node_Sub25_Sub1.aClass192_9948, Class187.aClass192_2265, Class86.aClass192_1163, Class262_Sub13.aClass192_7795, Renderer.aClass192_3662, Class145.aClass192_1798, Node_Sub25_Sub2.aClass192_9958, r_Sub2.aClass192_11056, Class290_Sub5.aClass192_8103, Class150_Sub3_Sub1.aClass192_10576, Class71.aClass192_962, Mobile_Sub3.aClass192_10778, Class357.aClass192_4444, EntityNode_Sub3.aClass192_5959, TileMessage.aClass192_5958, Node_Sub15_Sub10.aClass192_9849, Node_Sub37.aClass192_7438, Node_Sub25_Sub4.aClass192_9998, Class154.aClass192_1951, Class238.aClass192_2913, Class344.aClass192_4261, Class91.aClass192_1218, Class115.aClass192_1466, Class71.aClass192_963, Node_Sub38_Sub26.aClass192_10368, Class21.aClass192_358, Node_Sub24.aClass192_7214, Client.aClass192_5485, Node_Sub38_Sub32.aClass192_10433, Node_Sub29.aClass192_7347, Class365_Sub1.aClass192_8766, Class153.aClass192_1945, Class58.aClass192_856, Class126.aClass192_1633, Class115.aClass192_1467, Class173.aClass192_2083, Class320_Sub2.aClass192_8221, IComponentDefinitions.aClass192_4699, TileMessage.aClass192_5954, Node_Sub38_Sub28.aClass192_10402, Class96.aClass192_1269, NpcDefinition.aClass192_2884, Class352.INCOMMING_PACKET_43, CacheNode_Sub12.aClass192_9552, Node_Sub38_Sub21.aClass192_10316, StandardDrawableModel.aClass192_5878, Node_Sub15_Sub6.aClass192_9816, Class12.aClass192_197, Class257.aClass192_3245, Class339_Sub5.aClass192_8685, Class10.aClass192_175, Class18.aClass192_304, Node_Sub25_Sub3.aClass192_9978, Class35.aClass192_536, Class119.aClass192_1497, Class165.aClass192_2032, Class123.aClass192_1562, Node_Sub32.aClass192_7376, Class233.aClass192_2785, Class63.aClass192_920, CacheNode_Sub16_Sub1.aClass192_11073, Class339_Sub9.aClass192_8749, Node_Sub52.aClass192_7650, Node_Sub38_Sub2.aClass192_10092, Class152.aClass192_1939, Class320_Sub13.aClass192_8337, Class339_Sub7.INCOMMING_PACKET_67, Class328.aClass192_4114, Class51.INCOMMING_PACKET_69, Class188_Sub2_Sub1.aClass192_9356, Class175.aClass192_2096, Class137.aClass192_1709, Class262_Sub21.aClass192_7863, TileMessage.aClass192_5952, Class63.aClass192_924, CacheNode.aClass192_7038, Node_Sub36.aClass192_7428, Class278.aClass192_3542, Class124.aClass192_1605, Class278.aClass192_3548, CacheNode_Sub14_Sub2.aClass192_11040, Class312.aClass192_3966, Class117.aClass192_1475, Class262_Sub6.aClass192_7748, Class168.aClass192_2045, Class151.aClass192_1845, Class240.aClass192_2945, CacheNode_Sub16_Sub2.aClass192_11079, Class338.aClass192_4201, Class69.aClass192_935, Class169_Sub1.aClass192_8785, Class181.aClass192_2144, Class342.aClass192_4235, Class337.aClass192_4180, Class153.aClass192_1946, Class26.aClass192_455, Class50.aClass192_778, MainFile.aClass192_136, Class300.aClass192_3750, Class169_Sub2.aClass192_8798, Class30.aClass192_495, Class220.aClass192_5321, Class262.aClass192_3327, Class286.aClass192_3602, Node_Sub38_Sub37.aClass192_10465, Class13.aClass192_203, Class375.aClass192_4655, Class320_Sub29.graphics_packet, Class144.aClass192_1790, Class247.aClass192_3123, Class290_Sub11.aClass192_8184, Class166.aClass192_5098, Class150_Sub1.aClass192_8952, Class281.aClass192_3575, Class127.aClass192_1644, EntityNode_Sub7.aClass192_6008, Node_Sub15_Sub13.aClass192_9873, Class173.aClass192_2088, OutcommingPacket.aClass192_4047, Class134_Sub4.aClass192_9052, Node_Sub38_Sub18.aClass192_10277, Node_Sub38_Sub39.aClass192_10499, Class339_Sub6.aClass192_8709, Class20_Sub1.aClass192_5512, Class43.aClass192_665, Class217.aClass192_2553, Class320_Sub26.aClass192_8450, Class156.aClass192_1962, Class134_Sub4.aClass192_9045, Class221.aClass192_2630, Class262_Sub7.aClass192_7750, TileMessage.aClass192_5956, Class382.aClass192_5249, Class163.aClass192_2012, Class320_Sub17.aClass192_8368, BufferedStream.aClass192_7014, Class320_Sub5.aClass192_8251, Class144.aClass192_1786, Class367.aClass192_4534, InterfaceSettings.aClass192_7420, CacheNode_Sub14_Sub2.aClass192_11037, Class262.aClass192_3326, Class146.aClass192_1810, Class51_Sub1.aClass192_9054 };
	}
	
	final DrawableModel method3597(GraphicsToolkit graphicstoolkit, boolean bool, boolean bool_11_, boolean bool_12_, int i) {
		anInt3924++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(anInt3933, 119);
		if (objectdefinition.anIntArray2984 != null) {
			objectdefinition = objectdefinition.method3038(13, (aa.anInt101 ^ 0xffffffff) != -4 ? Class24.aClass275_442 : ProducingGraphicsBuffer.anInterface17_9901);
		}
		if (objectdefinition == null) {
			method3588(graphicstoolkit, (byte) 16);
			anInt3928 = -1;
			return null;
		}
		if (!aBoolean3919 && (anInt3928 ^ 0xffffffff) != (objectdefinition.objectId ^ 0xffffffff)) {
			method3595(0, -1, (byte) -110, true);
			aDrawableModel3939 = null;
			aBoolean3949 = false;
		}
		method3599(anAnimable3920, bool_11_);
		if (bool_12_) {
			bool_12_ = bool_12_ & (aBoolean3932 & !aBoolean3949 & (Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) ^ 0xffffffff) != -1);
		}
		if (bool && !bool_12_) {
			anInt3928 = objectdefinition.objectId;
			return null;
		}
		if (bool_12_) {
			Node_Sub23.method2636(aR3942, aByte3944, anAnimable3920.anInt5934, anAnimable3920.anInt5940, aBooleanArray3953);
			aBoolean3949 = false;
		}
		Plane plane = Class320_Sub10.aPlaneArray8300[aByte3944];
		Plane plane_13_;
		if (!aBoolean3921) {
			plane_13_ = (aByte3944 ^ 0xffffffff) <= -4 ? null : Class320_Sub10.aPlaneArray8300[1 + aByte3944];
		} else {
			plane_13_ = Node_Sub38_Sub37.aPlaneArray10466[0];
		}
		DrawableModel drawablemodel = null;
		if (anAnimator3918.method245(-125)) {
			if (bool_12_) {
				i |= 0x40000;
			}
			drawablemodel = objectdefinition.method3048(anInt3926 != 11 ? anInt3951 : 4 + anInt3951, anAnimable3920.anInt5940, (anInt3926 ^ 0xffffffff) != -12 ? anInt3926 : 10, anAnimable3920.anInt5934, plane_13_, anAnimator3918, 1521375267, graphicstoolkit, plane, aClass121_3930, i, plane.method3260(anAnimable3920.anInt5940, -127, anAnimable3920.anInt5934));
			if (drawablemodel == null) {
				aBooleanArray3953 = null;
				aR3942 = null;
				anInt3936 = 0;
				anInt3947 = 0;
			} else {
				if (bool_12_) {
					if (aBooleanArray3953 == null) {
						aBooleanArray3953 = new boolean[4];
					}
					aR3942 = drawablemodel.ba(aR3942);
					Class320_Sub30.method3797(aR3942, aByte3944, anAnimable3920.anInt5934, anAnimable3920.anInt5940, aBooleanArray3953);
					aBoolean3949 = true;
				}
				anInt3947 = drawablemodel.fa();
				anInt3936 = drawablemodel.ma();
			}
			aDrawableModel3939 = null;
		} else if (aDrawableModel3939 != null && (i & aDrawableModel3939.ua()) == i && (objectdefinition.objectId ^ 0xffffffff) == (anInt3928 ^ 0xffffffff)) {
			drawablemodel = aDrawableModel3939;
		} else {
			if (aDrawableModel3939 != null) {
				i |= aDrawableModel3939.ua();
			}
			Class243 class243 = objectdefinition.method3046((anInt3926 ^ 0xffffffff) != -12 ? anInt3951 : anInt3951 + 4, anAnimable3920.anInt5940, anAnimable3920.anInt5934, plane, bool_12_, (byte) 0, plane.method3260(anAnimable3920.anInt5940, -124, anAnimable3920.anInt5934), (anInt3926 ^ 0xffffffff) == -12 ? 10 : anInt3926, graphicstoolkit, aClass121_3930, i, plane_13_);
			if (class243 != null) {
				aDrawableModel3939 = drawablemodel = class243.aDrawableModel3064;
				if (bool_12_) {
					aR3942 = class243.aR3072;
					aBooleanArray3953 = null;
					Class320_Sub30.method3797(aR3942, aByte3944, anAnimable3920.anInt5934, anAnimable3920.anInt5940, null);
					aBoolean3949 = true;
				}
				anInt3947 = drawablemodel.fa();
				anInt3936 = drawablemodel.ma();
			} else {
				anInt3936 = 0;
				aBooleanArray3953 = null;
				anInt3947 = 0;
				aR3942 = null;
				aDrawableModel3939 = null;
			}
		}
		anInt3928 = objectdefinition.objectId;
		return drawablemodel;
	}
	
	final void method3598(Class121 class121, int i) {
		anInt3934++;
		aClass121_3930 = class121;
		if (i != -12) {
			aBoolean3932 = true;
		}
		aDrawableModel3939 = null;
	}
	
	protected final void finalize() {
		anInt3938++;
		if (anEntityNode_Sub4_3931 != null) {
			anEntityNode_Sub4_3931.method953();
		}
	}
	
	private final void method3599(Animable animable, boolean bool) {
		anInt3950++;
		if (!anAnimator3918.method245(-127)) {
			method3595(0, -1, (byte) -96, false);
		} else if (anAnimator3918.method248(-98, -anInt3923 + Class174.clientCycle)) {
			if (Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) == 2) {
				aBoolean3949 = false;
			}
			if (anAnimator3918.method238(-11)) {
				anAnimator3918.method249(bool, -1);
				aBoolean3919 = false;
				method3595(0, -1, (byte) -72, false);
			}
		}
		if (bool == true) {
			anInt3923 = Class174.clientCycle;
		}
	}
	
	final void method3600(int i, DrawableModel drawablemodel, boolean bool, int i_14_, GraphicsToolkit graphicstoolkit, int i_15_, int i_16_, int i_17_, Class336 class336) {
		anInt3948++;
		if (i_14_ == -9827) {
			Class300[] class300s = drawablemodel.method620();
			Class218[] class218s = drawablemodel.method618();
			if ((anEntityNode_Sub4_3931 == null || anEntityNode_Sub4_3931.aBoolean5972) && (class300s != null || class218s != null)) {
				ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(anInt3933, 115);
				if (objectdefinition.anIntArray2984 != null) {
					objectdefinition = objectdefinition.method3038(i_14_ + 9840, (aa.anInt101 ^ 0xffffffff) == -4 ? ProducingGraphicsBuffer.anInterface17_9901 : Class24.aClass275_442);
				}
				if (objectdefinition != null) {
					anEntityNode_Sub4_3931 = EntityNode_Sub4.method963(Class174.clientCycle, true);
				}
			}
			if (anEntityNode_Sub4_3931 != null) {
				drawablemodel.method614(class336);
				if (!bool) {
					anEntityNode_Sub4_3931.method958((long) Class174.clientCycle);
				} else {
					anEntityNode_Sub4_3931.method952(graphicstoolkit, (long) Class174.clientCycle, class300s, class218s, false);
				}
				anEntityNode_Sub4_3931.method967(aByte3925, i_16_, i_15_, i_17_, i);
			}
		}
	}
	
	static final boolean method3601(String string, String string_18_, int i, String string_19_, String string_20_) {
		anInt3940++;
		if (i != 30195) {
			method3601(null, null, -87, null, null);
		}
		if (string == null || string_19_ == null) {
			return false;
		}
		if (string.startsWith("#") || string_19_.startsWith("#")) {
			return string.equals(string_19_);
		}
		return string_20_.equals(string_18_);
	}
	
	Class310(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_21_, int i_22_, int i_23_, Animable animable, boolean bool, int i_24_) {
		anInt3928 = -1;
		aBoolean3949 = false;
		anInt3947 = 0;
		aBoolean3921 = false;
		aByte3944 = (byte) i_23_;
		anInt3951 = i_21_;
		aByte3925 = (byte) i_22_;
		aBoolean3919 = i_24_ != -1;
		anInt3933 = objectdefinition.objectId;
		anInt3926 = i;
		anAnimable3920 = animable;
		aBoolean3921 = bool;
		aBoolean3932 = graphicstoolkit.r() && objectdefinition.aBoolean2972 && !aBoolean3921;
		anAnimator3918 = new AnimableAnimator(animable, false);
		method3595(1, i_24_, (byte) -125, false);
	}
}
