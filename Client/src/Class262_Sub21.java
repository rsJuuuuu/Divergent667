/* Class262_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub21 extends Class262
{
	private int anInt7862;
	static IncommingPacket aClass192_7863 = new IncommingPacket(73, 4);
	private int anInt7864;
	static Class124 aClass124_7865 = new Class124(30);
	static int anInt7866;
	private int anInt7867;
	static int[][] anIntArrayArray7868 = { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
	
	Class262_Sub21(BufferedStream buffer) {
		super(buffer);
		anInt7864 = buffer.readUnsignedShort();
		anInt7867 = buffer.readUnsignedShort();
		anInt7862 = buffer.readUnsignedByte();
	}
	
	final void method3148(int i) {
		anInt7866++;
		Class206 class206 = Class121.aClass206Array1529[anInt7864];
		Class199 class199 = Class262_Sub5.aClass199Array7732[anInt7867];
		class199.method2008(class206, 8980, anInt7862);
		if (i > -102) {
			method3205((byte) 108);
		}
	}
	
	public static void method3205(byte b) {
		aClass124_7865 = null;
		if (b != 40) {
			method3205((byte) 15);
		}
		aClass192_7863 = null;
		anIntArrayArray7868 = null;
	}
}
