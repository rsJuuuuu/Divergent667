/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class205 implements Interface7
{
	static int anInt5101;
	protected boolean aBoolean5102;
	protected int anInt5103;
	static Index index19;
	protected int anInt5105;
	protected Class77 aClass77_5106;
	protected int anInt5107;
	static int anInt5108;
	protected Class379 aClass379_5109;
	protected int anInt5110;
	protected int anInt5111;
	protected int anInt5112;
	protected int anInt5113;
	protected int anInt5114;
	static int screenHeight;
	
	public static void method2032(byte b) {
		index19 = null;
		if (b <= 31) {
			method2032((byte) -86);
		}
	}
	
	public final Class170 method20(int i) {
		if (i < 81) {
			method20(69);
		}
		anInt5108++;
		return Class96.aClass170_1273;
	}
	
	static final String method2033(IComponentDefinitions widget, byte b) {
		if (b != -104) {
			return null;
		}
		anInt5101++;
		if ((Client.method113(widget).method2743(-70) ^ 0xffffffff) == -1) {
			return null;
		}
		if (widget.aString4786 == null || (widget.aString4786.trim().length() ^ 0xffffffff) == -1) {
			if (Class54.aBoolean817) {
				return "Hidden-use";
			}
			return null;
		}
		return widget.aString4786;
	}
	
	Class205(int i, Class379 class379, Class77 class77, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt5103 = i_3_;
		anInt5105 = i_4_;
		aClass77_5106 = class77;
		anInt5113 = i_0_;
		anInt5107 = i_6_;
		anInt5112 = i_2_;
		anInt5110 = i_1_;
		aClass379_5109 = class379;
		anInt5114 = i;
		aBoolean5102 = bool;
		anInt5111 = i_5_;
	}
}
