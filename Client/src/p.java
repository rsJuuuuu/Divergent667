/* p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.awt.Rectangle;

public class p extends Node implements Interface3
{
	private static long aLong5014;
	protected int anInt5015;
	protected int anInt5016;
	protected long nativeid;
	private static boolean aBoolean5017 = false;
	protected java.awt.Canvas aCanvas5018;
	
	final void method2767(int i, int i_0_) {
		try {
			synchronized (aCanvas5018.getTreeLock()) {
				Dimension dimension = aCanvas5018.getSize();
				H(i, i_0_, dimension.width, dimension.height);
				aBoolean5017 = false;
			}
		} catch (Exception exception) {
			method2769(exception);
		}
	}
	
	private final native void K(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_);
	
	private final native void H(int i, int i_6_, int i_7_, int i_8_);
	
	final void method2768(java.awt.Canvas canvas, int i, int i_9_) {
		anInt5015 = i;
		anInt5016 = i_9_;
		oa(canvas, i, i_9_);
	}
	
	private final void method2769(Exception exception) {
		if (!aBoolean5017) {
			aLong5014 = Class313.method3650(false);
			aBoolean5017 = true;
		} else if (Class313.method3650(false) - aLong5014 < 30000L) {
			aCanvas5018.repaint();
		} else {
			throw new RuntimeException(exception.getMessage());
		}
	}
	
	final void method2770(Rectangle[] rectangles, int i, int i_10_, int i_11_) {
		try {
			synchronized (aCanvas5018.getTreeLock()) {
				for (int i_12_ = 0; i_12_ < i; i_12_++) {
					Rectangle rectangle = rectangles[i_12_];
					if (rectangle.width > 0 && rectangle.height > 0) {
						K(rectangle.x, rectangle.y, rectangle.width, rectangle.height, i_10_, i_11_);
					}
				}
				aBoolean5017 = false;
			}
		} catch (Exception exception) {
			method2769(exception);
		}
	}
	
	public final native void w(boolean bool);
	
	private final native void sa(oa var_oa, java.awt.Canvas canvas, int i, int i_13_);
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	final void method2771() {
		w(true);
		nativeid = 0L;
		aCanvas5018 = null;
	}
	
	p(oa var_oa, java.awt.Canvas canvas, int i, int i_14_) {
		aCanvas5018 = canvas;
		anInt5015 = i;
		anInt5016 = i_14_;
		sa(var_oa, aCanvas5018, i, i_14_);
	}
	
	private final native void oa(java.awt.Canvas canvas, int i, int i_15_);
}
