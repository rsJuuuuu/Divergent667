/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210
{
	static float aFloat2496;
	private GLToolkit aGLToolkit2497;
	static int anInt2498;
	static int anInt2499;
	protected long aLong2500;
	static int anInt2501;
	static String[] aStringArray2502;
	
	static final void method2049(GraphicsToolkit graphicstoolkit, int i, byte b, IComponentDefinitions widget, int i_0_, int i_1_) {
		if (b < 57) {
			aFloat2496 = -1.0948969F;
		}
		for (int i_2_ = 7; i_2_ >= 0; i_2_--) {
			for (int i_3_ = 127; i_3_ >= 0; i_3_--) {
				Class110.method1132(0, true, false);
				int i_4_ = 0xfc00 & i << 10 | (i_2_ & 0x7) << 7 | i_3_ & 0x7f;
				int i_5_ = Class85.anIntArray1158[i_4_];
				Class160.method1727(false, (byte) 92, true);
				graphicstoolkit.aa(i_0_ - -(widget.anInt4809 * i_3_ >> 7), i_1_ + ((-i_2_ + 7) * widget.anInt4695 >> 3), 1 + (widget.anInt4809 >> 7), (widget.anInt4695 >> 3) - -1, i_5_, 0);
			}
		}
		anInt2501++;
	}
	
	public static void method2050(int i) {
		if (i != 127) {
			method2050(-23);
		}
		aStringArray2502 = null;
	}
	
	protected final void finalize() throws Throwable {
		aGLToolkit2497.method1485(aLong2500, 1015629296);
		anInt2499++;
		super.finalize();
	}
	
	Class210(GLToolkit gltoolkit, long l, int i) {
		aGLToolkit2497 = gltoolkit;
		aLong2500 = l;
	}
}
