/* Animable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Animable extends EntityNode
{
	static int anInt5930;
	protected byte aByte5931;
	static float aFloat5932;
	protected byte plane;
	protected int anInt5934;
	protected boolean aBoolean5935;
	static Class193 aClass193_5936 = new Class193();
	protected int anInt5937;
	protected int anInt5938;
	static int anInt5939;
	protected int anInt5940;
	protected Animable anAnimable5941;
	static int anInt5942;
	static int anInt5943;
	protected int anInt5944;
	protected boolean aBoolean5945 = false;
	protected int anInt5946;
	
	abstract boolean method806(int i);
	
	abstract EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit);
	
	final int method808(int i, Node_Sub29[] node_sub29s, int i_0_, int i_1_) {
		anInt5939++;
		if (i != -23024) {
			aFloat5932 = 0.34159562F;
		}
		long l = Class91.aLongArrayArrayArray1228[plane][i_1_][i_0_];
		long l_2_ = 0L;
		int i_3_ = 0;
		for (/**/; l_2_ <= 48L; l_2_ += 16L) {
			int i_4_ = (int) (l >> (int) l_2_ & 0xffffL);
			if ((i_4_ ^ 0xffffffff) >= -1) {
				break;
			}
			node_sub29s[i_3_++] = Class143.aClass326Array1771[-1 + i_4_].aNode_Sub29_4100;
		}
		for (int i_5_ = i_3_; i_5_ < 4; i_5_++)
			node_sub29s[i_5_] = null;
		return i_3_;
	}
	
	abstract Class171 method809(GraphicsToolkit graphicstoolkit, int i);
	
	abstract boolean method810(int i, int i_6_, boolean bool, GraphicsToolkit graphicstoolkit);
	
	abstract void method811(int i);
	
	public static void method812(byte b) {
		aClass193_5936 = null;
		if (b >= -61) {
			aFloat5932 = 0.3199425F;
		}
	}
	
	abstract boolean method813(int i);
	
	abstract boolean method814(byte b);
	
	abstract boolean method815(byte b, GraphicsToolkit graphicstoolkit);
	
	abstract void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_7_, byte b, int i_8_, Animable animable_9_);
	
	abstract int method817(int i);
	
	@SuppressWarnings("unused")
	int method818(byte b) {
		int i = 127 % ((-21 - b) / 46);
		anInt5930++;
		return 0;
	}
	
	abstract int method819(Node_Sub29[] node_sub29s, int i);
	
	abstract void method820(GraphicsToolkit graphicstoolkit, int i);
	
	abstract boolean method821(int i);
	
	static final void method822(int i, int i_10_, int i_11_) {
		anInt5943++;
		if (Node_Sub38_Sub23.method2866(false)) {
			Node_Sub38_Sub23.anInt10347 = i_10_;
			if (Class336_Sub2.anInt8586 != i) {
				Class188_Sub1_Sub1.aString9327 = "";
			}
			Class336_Sub2.anInt8586 = i;
			Class48.method478(6, (byte) 121);
			if (i_11_ != 4) {
				aFloat5932 = 0.73661125F;
			}
		}
	}
	
	abstract int method823(byte b);
	
	public Animable() {
		/* empty */
	}
}
