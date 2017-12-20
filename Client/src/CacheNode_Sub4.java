/* CacheNode_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub4 extends CacheNode
{
	static boolean[] aBooleanArray9454 = new boolean[100];
	static int anInt9455;
	static int anInt9456;
	protected Class158 aClass158_9457;
	protected String aString9458;
	static int anInt9459;
	static int anInt9460;
	static int anInt9461;
	protected int anInt9462;
	static Class124 aClass124_9463 = new Class124(11);
	static int anInt9464;
	static int anInt9465 = 0;
	static Class1 aClass1_9466;
	
	final int method2300(byte b) {
		if (b != 88) {
			method2302((byte) 100);
		}
		anInt9460++;
		if (aClass158_9457.aCacheNode1984.aCacheNode7035 != aClass158_9457.aCacheNode1984) {
			return ((CacheNode_Sub13) aClass158_9457.aCacheNode1984.aCacheNode7035).anInt9562;
		}
		return -1;
	}
	
	final boolean method2301(int i, CacheNode_Sub13 cachenode_sub13) {
		anInt9461++;
		if (i < 3) {
			method2302((byte) -37);
		}
		int i_0_ = method2300((byte) 88);
		cachenode_sub13.method2275(-122);
		anInt9462--;
		if ((anInt9462 ^ 0xffffffff) != -1) {
            return i_0_ != method2300((byte) 88);
        }
		this.method2160((byte) 73);
		this.method2275(-95);
		Class21.anInt355--;
		Class200_Sub2.aClass61_4941.method601(this, 25566, cachenode_sub13.aLong9564);
		return false;
	}
	
	static final int method2302(byte b) {
		anInt9455++;
		GraphicsToolkit graphicstoolkit = Class93.aGraphicsToolkit1241;
		boolean bool = false;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff) != -1) {
			java.awt.Canvas canvas = new java.awt.Canvas();
			canvas.setSize(100, 100);
			bool = true;
			graphicstoolkit = Class262_Sub9.method3171(null, (byte) 122, null, 0, canvas, 0);
		}
		long l = Class313.method3650(false);
		int i = 0;
		if (b != 88) {
			aClass1_9466 = null;
		}
		for (/**/; i < 10000; i++)
			graphicstoolkit.a(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
		int i_1_ = (int) (Class313.method3650(false) + -l);
		graphicstoolkit.method1239(100, 100, 0, (byte) 116, 0, -16777216);
		if (bool) {
			graphicstoolkit.method1233(b ^ ~0x1e1e);
		}
		return i_1_;
	}
	
	final boolean method2303(int i, CacheNode_Sub13 cachenode_sub13) {
		anInt9459++;
		boolean bool = true;
		cachenode_sub13.method2275(-120);
		if (i > -115) {
			aBooleanArray9454 = null;
		}
		CacheNode_Sub13 cachenode_sub13_2_ = (CacheNode_Sub13) aClass158_9457.method1723(13);
		while (cachenode_sub13_2_ != null) {
			if (Node_Sub42.method2935((byte) 69, cachenode_sub13.anInt9562, cachenode_sub13_2_.anInt9562)) {
				Class76.method767(false, cachenode_sub13, cachenode_sub13_2_);
				anInt9462++;
                return !bool;
            }
			cachenode_sub13_2_ = (CacheNode_Sub13) aClass158_9457.method1721(0);
			bool = false;
		}
		aClass158_9457.method1719(true, cachenode_sub13);
		anInt9462++;
		return bool;
	}
	
	static final void method2304(int i) {
		StandardDrawableModel.method700(-1);
		anInt9456++;
		Class229.aClass270_2733 = null;
		@SuppressWarnings("unused")
		int i_3_ = -12 / ((i - 6) / 55);
		Class44.aClass119_670 = null;
		Class245.aClass119_3085 = null;
		Class44.aClass270_669 = null;
		Class229.aGraphicsToolkit2732 = null;
		GraphicsToolkit.aClass270_1548 = null;
		CacheNode_Sub18.aClass343ArrayArray9608 = null;
	}
	
	static final void method2305(int i, boolean bool, int i_4_, IComponentDefinitions widget) {
		if (bool == true) {
			Class197.anInt2415 = i;
			Class320_Sub29.aWidget8488 = widget;
			anInt9464++;
			StandardDrawableModel.anInt5918 = i_4_;
		}
	}
	
	public static void method2306(int i) {
		aBooleanArray9454 = null;
		if (i != 1) {
			method2306(58);
		}
		aClass1_9466 = null;
		aClass124_9463 = null;
	}
	
	CacheNode_Sub4(String string) {
		aString9458 = string;
		aClass158_9457 = new Class158();
	}
}
