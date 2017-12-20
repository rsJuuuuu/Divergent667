/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64 implements Interface6
{
	static int anInt5035;
	static Class124 aClass124_5036;
	protected int anInt5037;
	private PureJavaToolkit aPureJavaToolkit5038;
	static int anInt5039;
	static int anInt5040;
	protected int anInt5041;
	protected int[] anIntArray5042;
	private Class131 aClass131_5043;
	static int anInt5044;
	static int anInt5045;
	static boolean aBoolean5046 = false;
	static int anInt5047;
	static OutcommingPacket aClass318_5048;
	protected float[] aFloatArray5049;
	
	public static void method709(byte b) {
		aClass124_5036 = null;
		int i = 2 % ((b - 27) / 35);
		aClass318_5048 = null;
	}
	
	static final void method710(byte b, int i) {
		if (b != -90) {
			method712(55);
		}
		anInt5035++;
		if ((Class52.anInt800 ^ 0xffffffff) != -1) {
			Class17.anInt282 = i;
		} else {
			Class307.aNode_Sub9_Sub1_3902.method2439(b ^ 0x3133, i);
		}
	}
	
	static final void method711(GraphicsToolkit graphicstoolkit, int i, int i_0_, int i_1_, int i_2_, int i_3_, byte b, int i_4_) {
		anInt5045++;
		Class44.aGraphicsToolkit668 = graphicstoolkit;
		Class225.aClass336_2678 = Class44.aGraphicsToolkit668.y();
		Class113.aClass336_1440 = Class44.aGraphicsToolkit668.y();
		Npc.aClass336_11113 = Class44.aGraphicsToolkit668.y();
		StandardSprite.anInt8946 = i_1_;
		Class320_Sub4.anInt8241 = i;
		Class320_Sub20.anInt8397 = 1;
		Class259.anInt3300 = 0;
		Class338.anInt4190 = 0;
		Node_Sub38_Sub21.anInt10315 = i_3_;
		aa_Sub3.anInt5493 = i_2_;
		int i_5_ = 112 / ((-91 - b) / 34);
		Node_Sub15_Sub9.anInterface6_9843 = null;
		Node_Sub15_Sub8.method2575(i_4_, i_0_, 121);
	}
	
	static final void method712(int i) {
		if (i == 25053) {
			Class365_Sub1.anInt8769 = Class304.anInt3835 = Class258.anInt5291 = Node_Sub13.anInt7107 = 0;
			anInt5047++;
		}
	}
	
	public final void method18(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, boolean bool_11_) {
		Class15.method220(i_10_, i_7_, !bool_11_ ? null : aPureJavaToolkit5038.aFloatArray6792, bool ? aPureJavaToolkit5038.aGraphicsBuffer6756.anIntArray7145 : null, aPureJavaToolkit5038.aGraphicsBuffer6756.anInt7146, bool_11_ ? aFloatArray5049 : null, anInt5041, i_9_, anIntArray5042, i_8_, i, -5, i_6_);
		anInt5039++;
	}
	
	public final void method19(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_) {
		Class15.method220(i_16_, i_13_, bool_17_ ? aFloatArray5049 : null, bool ? anIntArray5042 : null, anInt5041, bool_17_ ? aPureJavaToolkit5038.aFloatArray6792 : null, aPureJavaToolkit5038.aGraphicsBuffer6756.anInt7146, i_15_, aPureJavaToolkit5038.aGraphicsBuffer6756.anIntArray7145, i_14_, i, -5, i_12_);
		anInt5044++;
	}
	
	static final void method713(int i) {
		synchronized (Class186.aClass61_2247) {
			if (i != 0) {
				return;
			}
			Class186.aClass61_2247.method602((byte) -120);
		}
		anInt5040++;
	}
	
	Class64(PureJavaToolkit purejavatoolkit, GLSprite glsprite, Class131 class131) {
		aPureJavaToolkit5038 = purejavatoolkit;
		if (!(glsprite instanceof GLSprite_Sub2_Sub1)) {
			if (glsprite instanceof GLSprite_Sub2_Sub2) {
				GLSprite_Sub2_Sub2 glsprite_sub2_sub2 = (GLSprite_Sub2_Sub2) glsprite;
				anIntArray5042 = glsprite_sub2_sub2.anIntArray10570;
				anInt5041 = glsprite_sub2_sub2.anInt8893;
				anInt5037 = glsprite_sub2_sub2.anInt8897;
			} else {
				throw new RuntimeException();
			}
		} else {
			GLSprite_Sub2_Sub1 glsprite_sub2_sub1 = (GLSprite_Sub2_Sub1) glsprite;
			anInt5041 = glsprite_sub2_sub1.anInt8893;
			anInt5037 = glsprite_sub2_sub1.anInt8897;
			anIntArray5042 = glsprite_sub2_sub1.anIntArray10569;
		}
		if (class131 != null) {
			aClass131_5043 = class131;
			if (anInt5041 != aClass131_5043.anInt5446 || (aClass131_5043.anInt5445 ^ 0xffffffff) != (anInt5037 ^ 0xffffffff)) {
				throw new RuntimeException();
			}
			aFloatArray5049 = aClass131_5043.aFloatArray5444;
		}
	}
	
	static {
		aClass124_5036 = new Class124(52);
		aClass318_5048 = new OutcommingPacket(91, 8);
	}
}
