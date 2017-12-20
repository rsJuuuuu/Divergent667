/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub1 extends Exception
{
	private static final long serialVersionUID = 903502995850231548L;
	static GLSprite aGLSprite98;
	static int anInt99;
	
	public static void method140(boolean bool) {
		aGLSprite98 = null;
		if (bool != false) {
			aGLSprite98 = null;
		}
	}
	
	static final void method141(int i) {
		anInt99++;
		if (i <= 74) {
			method140(true);
		}
		Class236.aWidgetArray2899 = null;
		if (Class71.aBoolean967 && (Class188_Sub2_Sub1.getDisplayMode(3) ^ 0xffffffff) != -2) {
			Class157.method1710(-41, 0, Class151.anInt1843 == 3 || Class151.anInt1843 == 7, Node_Sub29_Sub2.method2714(-62), Node_Sub38_Sub4.method2800((byte) 100), 0);
		}
		int i_0_ = 0;
		int i_1_ = 0;
		if (Class71.aBoolean967) {
			i_0_ = Class67.method733(-78);
			i_1_ = Class226.method2112(256);
		}
		Class282.method3385(Class320_Sub15.WINDOWS_PANE_ID, i_0_, Class360.screenWidth + i_0_, i_1_, i_1_, -1, i_0_, true, Class205.screenHeight + i_1_);
		if (Class236.aWidgetArray2899 != null) {
			Node_Sub6.method2416(-1412584499, Class118.anInt5410, Class236.aWidgetArray2899, i_0_, i_1_, i_1_ + Class205.screenHeight, Class186.aWidget2257.anInt4703, true, 20, i_0_ + Class360.screenWidth, CacheNode_Sub7.anInt9488);
			Class236.aWidgetArray2899 = null;
		}
	}
}
