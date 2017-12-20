/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class235 implements Interface7
{
	protected int anInt5116;
	static int anInt5117;
	protected Class379 aClass379_5118;
	static OutcommingPacket aClass318_5119;
	static int anInt5120;
	static int anInt5121;
	static int anInt5122 = 0;
	protected Class77 aClass77_5123;
	protected int anInt5124;
	protected int anInt5125;
	static OutcommingPacket aClass318_5126;
	static int anInt5127;
	
	public static void method2155(int i) {
		if (i != 2) {
			method2157(null, -79);
		}
		aClass318_5119 = null;
		aClass318_5126 = null;
	}
	
	static final int method2156(int i) {
		anInt5117++;
		if (i != -10532) {
			return 34;
		}
		return Node_Sub39.anInt7498;
	}
	
	static final boolean method2157(String string, int i) {
		anInt5121++;
		if (i != -7746) {
			method2157(null, 61);
		}
		return Class85.aHashtable1157.containsKey(string);
	}
	
	Class235(int i, Class379 class379, Class77 class77, int i_0_, int i_1_) {
		aClass77_5123 = class77;
		anInt5124 = i_0_;
		anInt5125 = i;
		aClass379_5118 = class379;
		anInt5116 = i_1_;
	}
	
	public Class170 method20(int i) {
		anInt5120++;
		if (i < 81) {
			method2157(null, -77);
		}
		return Class262_Sub18.aClass170_7850;
	}
	
	static {
		aClass318_5119 = new OutcommingPacket(22, 2);
		aClass318_5126 = new OutcommingPacket(32, -1);
	}
}
