/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.Calendar;
import java.util.TimeZone;

public class Class247
{
	private Class382 aClass382_3109;
	private boolean aBoolean3110;
	private int anInt3111;
	private Class312 aClass312_3112;
	private int anInt3113;
	private int anInt3114 = 1;
	static Class197 aClass197_3115;
	static int anInt3116;
	static int anInt3117;
	static int anInt3118;
	private int anInt3119;
	static int anInt3120;
	private GLToolkit aGLToolkit3121;
	static boolean aBoolean3122 = false;
	static IncommingPacket aClass192_3123 = new IncommingPacket(110, -1);
	static int anInt3124;
	static int anInt3125;
	static int anInt3126;
	static int anInt3127;
	private Class382 aClass382_3128;
	private Class382 aClass382_3129;
	static OutcommingPacket aClass318_3130 = new OutcommingPacket(70, -1);
	private boolean aBoolean3131;
	private Class169_Sub2[] aClass169_Sub2Array3132;
	private boolean aBoolean3133;
	private boolean aBoolean3134;
	private Class169_Sub2 aClass169_Sub2_3135;
	private int anInt3136;
	private CacheNode_Sub17 aCacheNode_Sub17_3137;
	private CacheNode_Sub17 aCacheNode_Sub17_3138;
	private boolean aBoolean3139;
	private boolean aBoolean3140;
	static GLSprite aGLSprite3141;
	private int anInt3142;
	static Index aClass302_3143;
	static Calendar aCalendar3144 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	
	private final boolean method3075(byte b) {
		if (aBoolean3139) {
			if (aCacheNode_Sub17_3137 != null) {
				aCacheNode_Sub17_3137.method2398((byte) 127);
				aCacheNode_Sub17_3137 = null;
			}
			if (aClass169_Sub2_3135 != null) {
				aClass169_Sub2_3135.method1761((byte) -53);
				aClass169_Sub2_3135 = null;
			}
			if (aClass382_3109 != null) {
				aCacheNode_Sub17_3137 = new CacheNode_Sub17(aGLToolkit3121, 6402, anInt3114, anInt3113, aGLToolkit3121.anInt6599);
			}
			if (!aBoolean3140) {
				if (aCacheNode_Sub17_3137 == null) {
					aCacheNode_Sub17_3137 = new CacheNode_Sub17(aGLToolkit3121, 6402, anInt3114, anInt3113);
				}
			} else {
				aClass169_Sub2_3135 = new Class169_Sub2(aGLToolkit3121, 34037, 6402, anInt3114, anInt3113);
			}
			aBoolean3133 = true;
			aBoolean3131 = true;
			aBoolean3139 = false;
		}
		anInt3116++;
		if (b != 81) {
			return false;
		}
		if (aBoolean3134) {
			if (aCacheNode_Sub17_3138 != null) {
				aCacheNode_Sub17_3138.method2398((byte) 124);
				aCacheNode_Sub17_3138 = null;
			}
			if (aClass169_Sub2Array3132[0] != null) {
				aClass169_Sub2Array3132[0].method1761((byte) -53);
				aClass169_Sub2Array3132[0] = null;
			}
			if (aClass169_Sub2Array3132[1] != null) {
				aClass169_Sub2Array3132[1].method1761((byte) -53);
				aClass169_Sub2Array3132[1] = null;
			}
			if (aClass382_3109 != null) {
				aCacheNode_Sub17_3138 = new CacheNode_Sub17(aGLToolkit3121, anInt3142, anInt3114, anInt3113, aGLToolkit3121.anInt6599);
			}
			aClass169_Sub2Array3132[0] = new Class169_Sub2(aGLToolkit3121, 34037, anInt3142, anInt3114, anInt3113);
			aClass169_Sub2Array3132[1] = anInt3136 <= 1 ? null : new Class169_Sub2(aGLToolkit3121, 34037, anInt3142, anInt3114, anInt3113);
			aBoolean3133 = true;
			aBoolean3131 = true;
			aBoolean3134 = false;
		}
		if (aBoolean3131) {
			if (aClass382_3109 != null) {
				aGLToolkit3121.method1410(15, aClass382_3128);
				aClass382_3128.method4175(0, -25845);
				aClass382_3128.method4175(1, -25845);
				aClass382_3128.method4175(8, -25845);
				aClass382_3128.method4181(18264, aClass169_Sub2Array3132[0], 0);
				if ((anInt3136 ^ 0xffffffff) < -2) {
					aClass382_3128.method4181(b + 18183, aClass169_Sub2Array3132[1], 1);
				}
				if (aBoolean3140) {
					aClass382_3128.method4181(18264, aClass169_Sub2_3135, 8);
				}
				aGLToolkit3121.method1436(aClass382_3128, (byte) 23);
				aGLToolkit3121.method1410(15, aClass382_3109);
				aClass382_3109.method4175(0, -25845);
				aClass382_3109.method4175(8, -25845);
				aClass382_3109.method4178(aCacheNode_Sub17_3138, 0, b + -80);
				aClass382_3109.method4178(aCacheNode_Sub17_3137, 8, 1);
				aGLToolkit3121.method1436(aClass382_3109, (byte) 82);
			} else {
				aGLToolkit3121.method1410(15, aClass382_3128);
				aClass382_3128.method4175(0, -25845);
				aClass382_3128.method4175(1, -25845);
				aClass382_3128.method4175(8, b ^ ~0x64a5);
				aClass382_3128.method4181(18264, aClass169_Sub2Array3132[0], 0);
				if ((anInt3136 ^ 0xffffffff) < -2) {
					aClass382_3128.method4181(18264, aClass169_Sub2Array3132[1], 1);
				}
				if (aBoolean3140) {
					aClass382_3128.method4181(18264, aClass169_Sub2_3135, 8);
				} else {
					aClass382_3128.method4178(aCacheNode_Sub17_3137, 8, 1);
				}
				aGLToolkit3121.method1436(aClass382_3128, (byte) 13);
			}
			aBoolean3131 = false;
			aBoolean3133 = true;
		}
		if (aBoolean3133) {
			aGLToolkit3121.method1410(15, aClass382_3129);
			aBoolean3133 = !aClass382_3129.method4180(10785);
			aGLToolkit3121.method1436(aClass382_3129, (byte) 90);
		}
        return !aBoolean3133;
    }
	
	final void method3076(byte b) {
		anInt3118++;
		if (aBoolean3110) {
			if (aClass382_3109 != null) {
				aGLToolkit3121.method1481(aClass382_3109, false);
				int i = 16384;
				aGLToolkit3121.method1479(29630, aClass382_3128);
				aClass382_3109.method4186(0, (byte) 108);
				aClass382_3128.method4183(0, (byte) 16);
				if (aBoolean3140) {
					i |= 0x100;
				}
				OpenGL.glBlitFramebufferEXT(0, 0, anInt3114, anInt3113, 0, 0, anInt3114, anInt3113, i, 9728);
				aGLToolkit3121.method1431(-10785, aClass382_3109);
				aGLToolkit3121.method1447(aClass382_3128, 32760);
			}
			aGLToolkit3121.method1461(34962);
			aGLToolkit3121.method1460(0, 3);
			aGLToolkit3121.method1434((byte) 69, 1);
			aGLToolkit3121.la();
			int i = 0;
			if (b <= 46) {
				method3083(false);
			}
			int i_0_ = 1;
			Node_Sub23 node_sub23;
			for (Node_Sub23 node_sub23_1_ = (Node_Sub23) aClass312_3112.method3613(65280); node_sub23_1_ != null; node_sub23_1_ = node_sub23) {
				node_sub23 = (Node_Sub23) aClass312_3112.method3620(16776960);
				int i_2_ = node_sub23_1_.method2623(1);
				for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
					node_sub23_1_.method2629(aClass169_Sub2_3135, aClass169_Sub2Array3132[i], 0, i_3_);
					if (node_sub23 != null || (-1 + i_2_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
						aClass382_3128.method4183(i_0_, (byte) 7);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) anInt3113);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, anInt3113);
						OpenGL.glTexCoord2f((float) anInt3114, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(anInt3114, anInt3113);
						OpenGL.glTexCoord2f((float) anInt3114, (float) anInt3113);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(anInt3114, 0);
						OpenGL.glEnd();
					} else {
						aGLToolkit3121.method1436(aClass382_3128, (byte) 114);
						aGLToolkit3121.method1465(0, 0, 16053);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) anInt3113);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(anInt3111, anInt3119);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(anInt3111, anInt3119 + anInt3113);
						OpenGL.glTexCoord2f((float) anInt3114, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(anInt3114 + anInt3111, anInt3113 + anInt3119);
						OpenGL.glTexCoord2f((float) anInt3114, (float) anInt3113);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(anInt3111 - -anInt3114, anInt3119);
						OpenGL.glEnd();
					}
					node_sub23_1_.method2625((byte) 113, i_3_);
					i = 0x1 & 1 + i;
					i_0_ = 1 + i_0_ & 0x1;
				}
			}
			aBoolean3110 = false;
		}
	}
	
	final boolean method3077(Node_Sub23 node_sub23, byte b) {
		anInt3127++;
		if (aClass382_3129 != null) {
			if (node_sub23.method2627((byte) -116) || node_sub23.method2635((byte) 87)) {
				aClass312_3112.method3625((byte) -54, node_sub23);
				method3078(-17454);
				if (method3075((byte) 81)) {
					if ((anInt3114 ^ 0xffffffff) != 0 && anInt3113 != -1) {
						node_sub23.method2632(anInt3114, 0, anInt3113);
					}
					node_sub23.aBoolean7205 = true;
					return true;
				}
			}
			method3082(30543, node_sub23);
		}
		if (b >= -95) {
			method3075((byte) 1);
		}
		return false;
	}
	
	private final void method3078(int i) {
		anInt3125++;
		if (i != -17454) {
			anInt3113 = -76;
		}
		boolean bool = false;
		int i_4_ = 0;
		int i_5_ = 0;
		for (Node_Sub23 node_sub23 = (Node_Sub23) aClass312_3112.method3613(i + 82734); node_sub23 != null; node_sub23 = (Node_Sub23) aClass312_3112.method3620(16776960)) {
			int i_6_ = node_sub23.method2630(i ^ ~0x442c);
			if (i_4_ < i_6_) {
				i_4_ = i_6_;
			}
			i_5_ += node_sub23.method2623(1);
			bool |= node_sub23.method2631((byte) -100);
		}
		int i_7_;
		if ((i_4_ ^ 0xffffffff) != -3) {
			if (i_4_ == 1) {
				i_7_ = 34842;
			} else {
				i_7_ = 6408;
			}
		} else {
			i_7_ = 34836;
		}
		if ((i_7_ ^ 0xffffffff) != (anInt3142 ^ 0xffffffff)) {
			anInt3142 = i_7_;
			aBoolean3134 = true;
		}
		int i_8_ = (anInt3136 ^ 0xffffffff) >= -3 ? anInt3136 : 2;
		int i_9_ = (i_5_ ^ 0xffffffff) >= -3 ? i_5_ : 2;
		anInt3136 = i_5_;
		if (aBoolean3140 == !bool) {
			aBoolean3139 = true;
			aBoolean3140 = bool;
		}
		if (i_8_ != i_9_) {
			aBoolean3131 = aBoolean3134 = true;
		}
	}
	
	final boolean method3079(int i) {
		if (i != -2) {
			return false;
		}
		anInt3120++;
        return aClass382_3129 != null;
    }
	
	final void method3080(boolean bool) {
		aCacheNode_Sub17_3137 = null;
		if (bool != false) {
			method3083(true);
		}
		anInt3117++;
		aCacheNode_Sub17_3138 = null;
		aClass382_3129 = aClass382_3109 = aClass382_3128 = null;
		aClass169_Sub2Array3132 = null;
		aClass169_Sub2_3135 = null;
		if (!aClass312_3112.method3616(0)) {
			for (Node node = aClass312_3112.method3613(65280); node != aClass312_3112.aNode3958; node = node.aNode2800)
				((Node_Sub23) node).method2626((byte) -127);
		}
		anInt3114 = anInt3113 = 1;
	}
	
	final boolean method3081(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		anInt3124++;
		if (aClass382_3129 == null || aClass312_3112.method3616(0)) {
			return false;
		}
		if (i_10_ != anInt3114 || (i_12_ ^ 0xffffffff) != (anInt3113 ^ 0xffffffff)) {
			anInt3114 = i_10_;
			anInt3113 = i_12_;
			for (Node node = aClass312_3112.method3613(65280); aClass312_3112.aNode3958 != node; node = node.aNode2800)
				((Node_Sub23) node).method2632(anInt3114, 0, anInt3113);
			aBoolean3134 = true;
			aBoolean3139 = true;
			aBoolean3131 = true;
		}
		if (method3075((byte) 81)) {
			anInt3119 = i_13_;
			aBoolean3110 = true;
			anInt3111 = i_11_;
			aGLToolkit3121.method1410(15, aClass382_3129);
			aClass382_3129.method4183(0, (byte) 121);
			aGLToolkit3121.method1465(anInt3113 - (-anInt3119 + aGLToolkit3121.anInt6567), -anInt3111, i + 16053);
			return true;
		}
		if (i != 0) {
			method3075((byte) -6);
		}
		return false;
	}
	
	final void method3082(int i, Node_Sub23 node_sub23) {
		anInt3126++;
		node_sub23.aBoolean7205 = false;
		node_sub23.method2626((byte) -128);
		node_sub23.method2160((byte) 126);
		if (i != 30543) {
			aCacheNode_Sub17_3138 = null;
		}
		method3078(-17454);
	}
	
	public static void method3083(boolean bool) {
		aClass302_3143 = null;
		aGLSprite3141 = null;
		if (bool != false) {
			method3083(true);
		}
		aCalendar3144 = null;
		aClass318_3130 = null;
		aClass192_3123 = null;
		aClass197_3115 = null;
	}
	
	Class247(GLToolkit gltoolkit) {
		anInt3113 = 1;
		anInt3119 = 0;
		anInt3111 = 0;
		aClass312_3112 = new Class312();
		aClass169_Sub2Array3132 = new Class169_Sub2[2];
		aBoolean3131 = true;
		aBoolean3133 = true;
		anInt3136 = 0;
		aBoolean3140 = false;
		aBoolean3139 = true;
		aBoolean3134 = true;
		anInt3142 = -1;
		aGLToolkit3121 = gltoolkit;
		if (aGLToolkit3121.aBoolean6719 && aGLToolkit3121.aBoolean6649) {
			aClass382_3129 = aClass382_3128 = new Class382(aGLToolkit3121);
			if ((aGLToolkit3121.anInt6599 ^ 0xffffffff) < -2 && aGLToolkit3121.aBoolean6662 && aGLToolkit3121.aBoolean6735) {
				aClass382_3129 = aClass382_3109 = new Class382(aGLToolkit3121);
			}
		}
	}
}
