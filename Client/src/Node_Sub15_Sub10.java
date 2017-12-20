/* Node_Sub15_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub10 extends Node_Sub15
{
	static int anInt9844;
	private int anInt9845;
	private int anInt9846 = -1;
	private int anInt9847;
	private int anInt9848;
	static IncommingPacket aClass192_9849;
	static boolean aBoolean9850 = false;
	static int anInt9851;
	static int anInt9852;
	static Index aClass302_9853;
	
	final void method2556(ClanChat clanchat, int i) {
		anInt9844++;
		if (i == 16) {
			clanchat.method486(anInt9845, anInt9846, anInt9847, anInt9848, 15883);
		}
	}
	
	static final int method2578(byte b) {
		anInt9851++;
		@SuppressWarnings("unused")
		int i = -106 % ((-82 - b) / 34);
		return (int) (1000000000L / Class171.aLong2071);
	}
	
	public static void method2579(byte b) {
		aClass302_9853 = null;
		if (b > 27) {
			aClass192_9849 = null;
		}
	}
	
	final void method2554(int i, BufferedStream buffer) {
		anInt9852++;
		anInt9846 = buffer.readUnsignedShort();
		anInt9845 = buffer.readInt();
		anInt9848 = buffer.readUnsignedByte();
		anInt9847 = buffer.readUnsignedByte();
		if (i != 29147) {
			aBoolean9850 = true;
		}
	}
	
	Node_Sub15_Sub10() {
		/* empty */
	}
	
	static {
		aClass192_9849 = new IncommingPacket(16, 3);
	}
}
