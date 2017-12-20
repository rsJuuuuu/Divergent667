/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class218
{
	protected int anInt2554;
	protected int anInt2555;
	protected int anInt2556;
	protected int anInt2557;
	static int anInt2558;
	protected int anInt2559;
	static Class123 aClass123_2560 = new Class123();
	protected Class218 aClass218_2561;
	protected Class336 aClass336_2562;
	static Index aClass302_2563;
	static int anInt2564;
	static int anInt2565;
	static Class123 aClass123_2566 = new Class123();
	static Class123[] aClass123Array2567 = { aClass123_2566, aClass123_2560 };
	static Node_Sub50 aNode_Sub50_2568 = new Node_Sub50(0, 0);
	static int anInt2569;
	static OutcommingPacket aClass318_2570 = new OutcommingPacket(55, 7);
	
	final Class249 method2075(byte b) {
		if (b != -57) {
			method2077(null, null, false);
		}
		anInt2564++;
		return Class320_Sub1.method3680(1, anInt2555);
	}
	
	public static void method2076(byte b) {
		@SuppressWarnings("unused")
		int i = 34 / ((22 - b) / 54);
		aClass123Array2567 = null;
		aClass302_2563 = null;
		aClass318_2570 = null;
		aNode_Sub50_2568 = null;
		aClass123_2560 = null;
		aClass123_2566 = null;
	}
	
	static final void method2077(d var_d, Index class302, boolean bool) {
		anInt2565++;
		Class376.aD4661 = var_d;
		Class188_Sub2_Sub2.aClass302_9361 = class302;
		if (bool != false) {
			aClass302_2563 = null;
		}
	}
	
	Class218(int i, int i_0_) {
		anInt2555 = i;
		anInt2554 = i_0_;
	}
	
	final Class218 method2078(boolean bool, int i) {
		if (bool != false) {
			aNode_Sub50_2568 = null;
		}
		anInt2558++;
		return new Class218(anInt2555, i);
	}
}
