/* Class270_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class270_Sub2 extends Class270
{
	static int anInt8036;
	static OutcommingPacket focusChangePacket;
	static Player[] LOCAL_PLAYERS = new Player[2048];
	static int[] anIntArray8039;
	
	abstract Class169_Sub1 method3304(boolean bool);
	
	public static void method3305(int i) {
		anIntArray8039 = null;
		LOCAL_PLAYERS = null;
		if (i == 30188) {
			focusChangePacket = null;
		}
	}
	
	static {
		focusChangePacket = new OutcommingPacket(93, 1);
	}
}
