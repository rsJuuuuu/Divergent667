/* Canvas - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas extends java.awt.Canvas {
	
	private static final long serialVersionUID = 1L;
	static int anInt68;
	static int anInt69 = 255;
	static int[] anIntArray70 = new int[8];
	static int anInt71;
	static int anInt72;
	static Color[] aColorArray73 = { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
	static int anInt74;
	private Component aComponent75;
	
	public final void update(Graphics graphics) {
		aComponent75.update(graphics);
		anInt68++;
	}
	
	public static void method124(int i) {
		aColorArray73 = null;
		if (i != 12244) {
			method125(126, 25, (byte) 75);
		}
		anIntArray70 = null;
	}
	
	static final int method125(int i, int i_0_, byte b) {
		if (b != -45) {
			method124(52);
		}
		anInt71++;
		int i_1_;
		if (i_0_ <= 20000) {
			if (i_0_ <= 10000) {
				if ((i_0_ ^ 0xffffffff) >= -5001) {
					i_1_ = 1;
					Node_Sub36.method2752(true, true);
				} else {
					i_1_ = 2;
					Class194_Sub1.method1965((byte) -98);
				}
			} else {
				Class69.method736(32159);
				i_1_ = 3;
			}
		} else {
			i_1_ = 4;
			Class262_Sub15.method3188(18896);
		}
		if (i != Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false)) {
			Class213.aNode_Sub27_2512.method2690(100, i, Class213.aNode_Sub27_2512.aClass320_Sub29_7291);
			Class22.method300(i, true, false);
		}
		Node_Sub38_Sub31.method2893(1);
		return i_1_;
	}
	
	public final void paint(Graphics graphics) {
		anInt74++;
		aComponent75.paint(graphics);
	}
	
	static final boolean method126(int i, int i_2_, int i_3_) {
		anInt72++;
		if (i <= 15) {
			return true;
		}
        return !(!Class219.method2094(i_2_, i_3_, -60) && !Class253.method3103(i_2_, -119, i_3_));
    }
	
	Canvas(Component component) {
		aComponent75 = component;
	}
}
