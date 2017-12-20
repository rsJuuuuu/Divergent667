/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class226
{
	static int anInt2681;
	static int anInt2682;
	protected CacheNode_Sub15 aCacheNode_Sub15_2683;
	static Class103 aClass103_2684 = new Class103();
	protected int anInt2685;
	static int anInt2686;
	protected CacheNode_Sub15 aCacheNode_Sub15_2687;
	protected int anInt2688;
	protected boolean aBoolean2689 = false;
	static int anInt2690;
	protected int anInt2691;
	static int anInt2692;
	
	final boolean method2110(Class37 class37, byte b, Class48 class48, int i, int i_0_, int[] is) {
		anInt2692++;
		if (b > -79) {
			anInt2688 = 37;
		}
		if (!aBoolean2689) {
			if (is.length <= i_0_) {
				return false;
			}
			anInt2685 = is[i_0_];
			aCacheNode_Sub15_2683 = class37.method399(anInt2685 >> 16, -124);
			anInt2685 &= 0xffff;
			if (aCacheNode_Sub15_2683 == null) {
				return false;
			}
			if (class48.aBoolean714 && (i ^ 0xffffffff) != 0 && (is.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
				anInt2688 = is[i];
				aCacheNode_Sub15_2687 = class37.method399(anInt2688 >> 16, -122);
				anInt2688 &= 0xffff;
			}
			if (class48.aBoolean691) {
				anInt2691 |= 0x200;
			}
			if (aCacheNode_Sub15_2683.method2383(anInt2685, 105)) {
				anInt2691 |= 0x80;
			}
			if (aCacheNode_Sub15_2683.method2381((byte) 102, anInt2685)) {
				anInt2691 |= 0x100;
			}
			if (aCacheNode_Sub15_2683.method2382(32, anInt2685)) {
				anInt2691 |= 0x400;
			}
			if (aCacheNode_Sub15_2687 != null) {
				if (aCacheNode_Sub15_2687.method2383(anInt2688, 126)) {
					anInt2691 |= 0x80;
				}
				if (aCacheNode_Sub15_2687.method2381((byte) 120, anInt2688)) {
					anInt2691 |= 0x100;
				}
				if (aCacheNode_Sub15_2687.method2382(32, anInt2688)) {
					anInt2691 |= 0x400;
				}
			}
			aBoolean2689 = true;
			anInt2691 |= 0x20;
			return true;
		}
		return true;
	}
	
	public static void method2111(boolean bool) {
		if (bool != true) {
			method2113(-89);
		}
		aClass103_2684 = null;
	}
	
	static final int method2112(int i) {
		if (i != 256) {
			aClass103_2684 = null;
		}
		anInt2690++;
		if (Class320_Sub20.anInt8397 == 1) {
			return Class166.anInt5100;
		}
		return 0;
	}
	
	static final void method2113(int i) {
		Class379.aClass61_4872.method608(false);
		@SuppressWarnings("unused")
		int i_1_ = 121 / ((i - -39) / 36);
		anInt2681++;
	}
	
	static final void method2114(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt2682++;
		for (int i_6_ = 0; i_6_ < Node_Sub11.anInt7105; i_6_++) {
			Rectangle rectangle = Node_Sub38_Sub28.aRectangleArray10404[i_6_];
			if (i < rectangle.x - -rectangle.width && (rectangle.x ^ 0xffffffff) > (i_3_ + i ^ 0xffffffff) && (rectangle.height + rectangle.y ^ 0xffffffff) < (i_2_ ^ 0xffffffff) && (rectangle.y ^ 0xffffffff) > (i_2_ + i_4_ ^ 0xffffffff)) {
				Class320_Sub21.aBooleanArray8403[i_6_] = true;
			}
		}
		Class362.method4053(i_2_, i_4_ + i_2_, i, (byte) 102, i - -i_3_);
		if (i_5_ >= -105) {
			method2114(65, 4, 96, -103, -52);
		}
	}
	
	final void method2115(byte b) {
		if (b > -82) {
			anInt2685 = -78;
		}
		anInt2691 = 0;
		anInt2686++;
		aBoolean2689 = false;
		aCacheNode_Sub15_2683 = aCacheNode_Sub15_2687 = null;
	}
}
