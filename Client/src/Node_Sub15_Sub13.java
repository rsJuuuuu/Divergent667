/* Node_Sub15_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub13 extends Node_Sub15
{
	static int anInt9868;
	static int anInt9869;
	static int anInt9870 = 0;
	static Class197 aClass197_9871;
	static int anInt9872;
	static IncommingPacket aClass192_9873;
	static int anInt9874 = 0;
	private int anInt9875 = -1;
	
	final void method2554(int i, BufferedStream buffer) {
		if (i == 29147) {
			anInt9875 = buffer.readUnsignedShort();
			anInt9869++;
		}
	}
	
	public static void method2585(int i) {
		aClass192_9873 = null;
		if (i == 0) {
			aClass197_9871 = null;
		}
	}
	
	static final Class129[] method2586(int i) {
		if (i != -11746) {
			anInt9870 = -68;
		}
		anInt9868++;
		return new Class129[] { Class194_Sub3.aClass129_6901, Node_Sub41.aClass129_7515, Class123.aClass129_1564 };
	}
	
	final void method2556(ClanChat clanchat, int i) {
		if (i == 16) {
			anInt9872++;
			clanchat.method502(anInt9875, (byte) 23);
		}
	}
	
	Node_Sub15_Sub13() {
		/* empty */
	}
	
	static {
		aClass192_9873 = new IncommingPacket(117, 5);
	}
}
