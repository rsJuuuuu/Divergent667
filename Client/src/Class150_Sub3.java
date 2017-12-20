/* Class150_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class150_Sub3 extends Class150
{
	static int anInt8963 = -1;
	protected int anInt8964;
	protected int anInt8965;
	static int anInt8966;
	static float[][] aFloatArrayArray8967;
	protected int anInt8968;
	static int anInt8969;
	static int anInt8970 = 0;
	protected int anInt8971;
	protected int anInt8972;
	static GLSprite[] aGLSpriteArray8973;
	protected int anInt8974;
	
	public Class170 method20(int i) {
		if (i < 81) {
			return null;
		}
		anInt8969++;
		return Class336_Sub3.aClass170_8613;
	}
	
	Class150_Sub3(Class379 class379, Class77 class77, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class379, class77, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8964 = i_11_;
		anInt8971 = i_6_;
		anInt8972 = i_8_;
		anInt8974 = i_7_;
		anInt8968 = i_9_;
		anInt8965 = i_10_;
	}
	
	public static void method1662(int i) {
		aFloatArrayArray8967 = null;
		if (i != -1) {
			anInt8963 = 87;
		}
		aGLSpriteArray8973 = null;
	}
	
	static final boolean method1663(byte b, int i, int i_12_) {
		@SuppressWarnings("unused")
		int i_13_ = 99 / ((b - 51) / 38);
		anInt8966++;
        return (0x8000 & i) != 0;
    }
	
	static {
		aFloatArrayArray8967 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
	}
}
