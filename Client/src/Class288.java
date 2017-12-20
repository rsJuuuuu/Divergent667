/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class288
{
	static int anInt3624;
	static int anInt3625;
	protected long aLong3626;
	private GLXToolkit aGLXToolkit3627;
	
	protected final void finalize() throws Throwable {
		aGLXToolkit3627.method1403(2, aLong3626);
		anInt3625++;
		super.finalize();
	}
	
	static final void method3404(int i, int i_0_, int i_1_, boolean bool, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt3624++;
		if (bool != true) {
			method3404(-88, 42, -92, false, 10, -20, -122, 93);
		}
		int i_6_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_2_);
		int i_7_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i);
		int i_8_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_0_);
		int i_9_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_3_);
		int i_10_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_2_ + i_4_);
		int i_11_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i + -i_4_);
		for (int i_12_ = i_6_; (i_12_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_12_++)
			Class369.method4086(i_9_, i_1_, i_8_, Class169_Sub4.anIntArrayArray8826[i_12_], 0);
		for (int i_13_ = i_7_; (i_11_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_13_--)
			Class369.method4086(i_9_, i_1_, i_8_, Class169_Sub4.anIntArrayArray8826[i_13_], 0);
		int i_14_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_4_ + i_0_);
		int i_15_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, -i_4_ + i_3_);
		for (int i_16_ = i_10_; i_16_ <= i_11_; i_16_++) {
			int[] is = Class169_Sub4.anIntArrayArray8826[i_16_];
			Class369.method4086(i_14_, i_1_, i_8_, is, 0);
			Class369.method4086(i_15_, i_5_, i_14_, is, 0);
			Class369.method4086(i_9_, i_1_, i_15_, is, 0);
		}
	}
	
	Class288(GLXToolkit glxtoolkit, long l, Class237[] class237s) {
		aLong3626 = l;
		aGLXToolkit3627 = glxtoolkit;
	}
}
