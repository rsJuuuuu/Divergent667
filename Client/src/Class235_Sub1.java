/* Class235_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class235_Sub1 extends Class235
{
	static boolean aBoolean8975 = false;
	protected int anInt8976;
	static int anInt8977;
	static Interface16[] anInterface16Array8978;
	static OutcommingPacket aClass318_8979 = new OutcommingPacket(79, -1);
	static int anInt8980;
	static int anInt8981;
	
	static final void method2158(byte b, String string) {
		anInt8980++;
		@SuppressWarnings("unused")
		int i = -118 / ((-30 - b) / 46);
		//System.out.println("Error: " + IComponentDefinitions.method4147(string, false, "%0a", "\n"));
	}
	
	public static void method2159(int i) {
		aClass318_8979 = null;
		if (i != 79) {
			method2158((byte) 102, null);
		}
		anInterface16Array8978 = null;
	}
	
	public final Class170 method20(int i) {
		if (i <= 81) {
			anInterface16Array8978 = null;
		}
		anInt8981++;
		return Class350.aClass170_5391;
	}
	
	Class235_Sub1(int i, Class379 class379, Class77 class77, int i_0_, int i_1_, int i_2_) {
		super(i, class379, class77, i_0_, i_1_);
		anInt8976 = i_2_;
	}
}
