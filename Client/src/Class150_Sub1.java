/* Class150_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class150_Sub1 extends Class150
{
	static int anInt8947;
	static int anInt8948;
	static Class151 aClass151_8949 = new Class151(11, 0, 1, 2);
	protected int anInt8950;
	protected int anInt8951;
	public static final int INDEXES_COUNT = 37; //37
	static IncommingPacket aClass192_8952 = new IncommingPacket(113, 3);
	static SeekableFile[] aSeekableFileArray8953 = new SeekableFile[INDEXES_COUNT];
	static int anInt8954;
	
	public final Class170 method20(int i) {
		anInt8947++;
		if (i < 81) {
			method20(-67);
		}
		return Class169_Sub2.aClass170_8806;
	}
	
	public static void method1655(byte b) {
		aClass192_8952 = null;
		if (b < 65) {
			method1655((byte) -43);
		}
		aSeekableFileArray8953 = null;
		aClass151_8949 = null;
	}
	
	static final void method1656(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt8948++;
		int i_4_ = Class93_Sub2.anInt6067;
		int i_5_ = Class163.anInt2014;
		if (Class71.aBoolean967) {
			i_4_ += Class67.method733(-82);
			i_5_ += Class226.method2112(256);
		}
		if ((Node_Sub38_Sub28.anInt10403 ^ 0xffffffff) == -2) {
			GLSprite glsprite = Node_Sub15_Sub7.aGLSpriteArray9828[Node_Sub37.anInt7431 / 100];
			glsprite.setPosition(i_4_ - 8, -8 + i_5_);
			Class362.method4053(-8 + i_5_, i_5_ - 8 - -glsprite.method1186(), i_4_ - 8, (byte) -79, glsprite.method1197() + -8 + i_4_);
		}
		if (Node_Sub38_Sub28.anInt10403 == 2) {
			GLSprite glsprite = Node_Sub15_Sub7.aGLSpriteArray9828[Node_Sub37.anInt7431 / 100 + 4];
			glsprite.setPosition(i_4_ + -8, -8 + i_5_);
			Class362.method4053(i_5_ - 8, glsprite.method1186() + (-8 + i_5_), i_4_ + -8, (byte) 56, glsprite.method1197() + i_4_ + -8);
		}
		if (i_1_ != 16427) {
			aSeekableFileArray8953 = null;
		}
		Mobile_Sub4.method911((byte) 114);
	}
	
	static final void method1657(boolean bool) {
		Class175.aClass291_2100.method3453((byte) 62);
		anInt8954++;
		Class106.aClass93_1356.method1045(7);
		Class158.aClient1983.method93(-94);
		Node_Sub38_Sub20.aCanvas10309.setBackground(Color.black);
		Node_Sub38_Sub23.anInt10346 = -1;
		Class175.aClass291_2100 = Class361.method4047(2, Node_Sub38_Sub20.aCanvas10309);
		Class106.aClass93_1356 = Class328_Sub1.method3830(Node_Sub38_Sub20.aCanvas10309, -19397, bool);
	}
	
	static final boolean method1658(Animable animable, boolean bool, byte[][][] bs, int i, byte b) {
		if (!Class307.aBoolean3898) {
			return false;
		}
		int i_6_ = animable.anInt5934 >> Class36.anInt549;
		int i_7_ = i_6_;
		int i_8_ = animable.anInt5940 >> Class36.anInt549;
		int i_9_ = i_8_;
		if (animable instanceof Mobile) {
			i_7_ = ((Mobile) animable).aShort9130;
			i_9_ = ((Mobile) animable).aShort9124;
			i_6_ = ((Mobile) animable).aShort9119;
			i_8_ = ((Mobile) animable).aShort9120;
		}
		for (int i_10_ = i_6_; i_10_ <= i_7_; i_10_++) {
			for (int i_11_ = i_8_; i_11_ <= i_9_; i_11_++) {
				if (animable.aByte5931 < Class159.anInt1995 && i_10_ >= Class238.anInt2915 && i_10_ < Class46.anInt679 && i_11_ >= Class320_Sub9.anInt8295 && i_11_ < Class367.anInt4533) {
					if (bs != null && animable.plane >= i && bs[animable.plane][i_10_][i_11_] == b || !animable.method806(0) || animable.method815((byte) 59, CacheNode_Sub18.aGraphicsToolkit9607)) {
						if (!bool && i_10_ >= Class216.anInt2551 - 16 && i_10_ <= Class216.anInt2551 + 16 && i_11_ >= EntityNode_Sub7.anInt6013 - 16 && i_11_ <= EntityNode_Sub7.anInt6013 + 16) {
							if (Class188_Sub2.aBoolean6868) {
								Class364.aClass273Array4513[Mobile_Sub1.anInt10930++].method3318(animable, (byte) -36);
								Mobile_Sub1.anInt10930 %= Class290.anInt3655;
							} else {
								animable.method820(CacheNode_Sub18.aGraphicsToolkit9607, -5);
							}
						}
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	Class150_Sub1(Class379 class379, Class77 class77, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		super(class379, class77, i, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_);
		anInt8950 = i_20_;
		anInt8951 = i_19_;
	}
}
