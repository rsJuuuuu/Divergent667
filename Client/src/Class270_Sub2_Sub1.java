/* Class270_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class270_Sub2_Sub1 extends Class270_Sub2
{
	static int anInt10540;
	static int anInt10541;
	private Class169_Sub1 aClass169_Sub1_10542;
	static int anInt10543 = 0;
	private GLToolkit aGLToolkit10544;
	static int anInt10545;
	static int anInt10546;
	static int anInt10547;
	static int anInt10548 = -2;
	static boolean aBoolean10549 = false;
	
	static final int method3306(int i, byte b, int i_0_, int i_1_) {
		anInt10545++;
		int i_2_ = i / i_0_;
		int i_3_ = i & -1 + i_0_;
		int i_4_ = i_1_ / i_0_;
		int i_5_ = i_1_ & i_0_ - 1;
		int i_6_ = Class180.method1819(i_4_, b ^ 0x64, i_2_);
		int i_7_ = Class180.method1819(i_4_, b ^ 0x1f, i_2_ - -1);
		int i_8_ = Class180.method1819(1 + i_4_, 64, i_2_);
		if (b != 91) {
			anInt10548 = 18;
		}
		int i_9_ = Class180.method1819(1 + i_4_, b ^ 0xb, 1 + i_2_);
		int i_10_ = SeekableFile.method3569(b ^ 0x1005b, i_0_, i_6_, i_7_, i_3_);
		int i_11_ = SeekableFile.method3569(65536, i_0_, i_8_, i_9_, i_3_);
		return SeekableFile.method3569(b + 65445, i_0_, i_10_, i_11_, i_5_);
	}
	
	final int method3307(int i) {
		if (i != 1) {
			anInt10546 = -40;
		}
		anInt10541++;
		return aClass169_Sub1_10542.anInt8793;
	}
	
	final boolean method3308(Class169_Sub1 class169_sub1, Class169_Sub1 class169_sub1_12_, byte b, float f) {
		anInt10540++;
		boolean bool = true;
		Class382 class382 = aGLToolkit10544.aClass382_6701;
		aGLToolkit10544.K(Class51_Sub2.anIntArray9068);
		aGLToolkit10544.la();
		aGLToolkit10544.method1424(8);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, aClass169_Sub1_10542.anInt8793, aClass169_Sub1_10542.anInt8793);
		aGLToolkit10544.method1478(false, (byte) -53);
		aGLToolkit10544.method1451(false, -31277);
		aGLToolkit10544.method1449(-110, false);
		aGLToolkit10544.method1415(771, false);
		aGLToolkit10544.method1489(-2, -2);
		aGLToolkit10544.method1457(33984, 1);
		aGLToolkit10544.method1422(0.0F, 0.0F, f, 0.0F, 13934);
		aGLToolkit10544.method1474(-85, 34165, 34165);
		aGLToolkit10544.method1444(-2, class169_sub1);
		aGLToolkit10544.method1457(33984, 0);
		aGLToolkit10544.method1434((byte) 62, 1);
		if (b <= 20) {
			anInt10548 = 64;
		}
		aGLToolkit10544.method1444(-2, class169_sub1_12_);
		aGLToolkit10544.method1410(15, class382);
		for (int i = 0; (i ^ 0xffffffff) > -7; i++) {
			int i_13_ = 34069 - -i;
			class382.method4182(0, aClass169_Sub1_10542, i_13_, 60);
			class382.method4183(0, (byte) -99);
			if (!class382.method4180(10785)) {
				bool = false;
				break;
			}
			OpenGL.glBegin(7);
			int i_14_ = i_13_;
		while_15_:
			do {
			while_14_:
				do {
				while_13_:
					do {
					while_12_:
						do {
							do {
								if (i_14_ != 34069) {
									if (i_14_ != 34070) {
										if ((i_14_ ^ 0xffffffff) != -34072) {
											if (i_14_ != 34072) {
												if (i_14_ != 34073) {
													if (i_14_ != 34074) {
														break while_15_;
													}
												} else {
													break while_13_;
												}
												break while_14_;
											}
										} else {
											break;
										}
										break while_12_;
									}
								} else {
									OpenGL.glTexCoord3i(65535, 65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
									OpenGL.glVertex2f(0.0F, 0.0F);
									OpenGL.glTexCoord3i(65535, 65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
									OpenGL.glVertex2f(1.0F, 0.0F);
									OpenGL.glTexCoord3i(65535, -65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
									OpenGL.glVertex2f(1.0F, 1.0F);
									OpenGL.glTexCoord3i(65535, -65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
									OpenGL.glVertex2f(0.0F, 1.0F);
									break while_15_;
								}
								OpenGL.glTexCoord3i(-65535, 65534, -65534);
								OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
								OpenGL.glVertex2f(0.0F, 0.0F);
								OpenGL.glTexCoord3i(-65535, 65534, 65534);
								OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
								OpenGL.glVertex2f(1.0F, 0.0F);
								OpenGL.glTexCoord3i(-65535, -65534, 65534);
								OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
								OpenGL.glVertex2f(1.0F, 1.0F);
								OpenGL.glTexCoord3i(-65535, -65534, -65534);
								OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
								OpenGL.glVertex2f(0.0F, 1.0F);
								break while_15_;
							} while (false);
							OpenGL.glTexCoord3i(-65534, 65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
							OpenGL.glVertex2f(0.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, 65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
							OpenGL.glVertex2f(1.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, 65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
							OpenGL.glVertex2f(1.0F, 1.0F);
							OpenGL.glTexCoord3i(-65534, 65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
							OpenGL.glVertex2f(0.0F, 1.0F);
							break while_15_;
						} while (false);
						OpenGL.glTexCoord3i(-65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break while_15_;
					} while (false);
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break while_15_;
				} while (false);
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} while (false);
			OpenGL.glEnd();
		}
		class382.method4175(0, -25845);
		aGLToolkit10544.method1436(class382, (byte) 21);
		aGLToolkit10544.method1457(33984, 1);
		aGLToolkit10544.method1444(-2, null);
		aGLToolkit10544.method1474(-9, 8448, 8448);
		aGLToolkit10544.method1457(33984, 0);
		aGLToolkit10544.method1444(-2, null);
		OpenGL.glPopAttrib();
		aGLToolkit10544.KA(Class51_Sub2.anIntArray9068[0], Class51_Sub2.anIntArray9068[1], Class51_Sub2.anIntArray9068[2], Class51_Sub2.anIntArray9068[3]);
		if (bool && !aGLToolkit10544.aBoolean6713) {
			aClass169_Sub1_10542.method1765(-231);
		}
		return bool;
	}
	
	Class270_Sub2_Sub1(GLToolkit gltoolkit, int i) {
		aGLToolkit10544 = gltoolkit;
		aClass169_Sub1_10542 = new Class169_Sub1(gltoolkit, 6408, i);
	}
	
	final Class169_Sub1 method3304(boolean bool) {
		if (bool != true) {
			anInt10546 = -122;
		}
		anInt10547++;
		return aClass169_Sub1_10542;
	}
}
