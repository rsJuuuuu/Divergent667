/* Class262_Sub15_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub15_Sub2 extends Class262_Sub15
{
	static int anInt10525;
	private int anInt10526;
	private int anInt10527;
	private int anInt10528;
	
	final void method3148(int i) {
		if (i > -102) {
			anInt10528 = 69;
		}
		Class121.aClass206Array1529[anInt10528].method2037(-105).sendGraphics(anInt10526, anInt7815, false, anInt7820 << 16, anInt10527, anInt7818);
		anInt10525++;
	}
	
	Class262_Sub15_Sub2(BufferedStream buffer) {
		super(buffer);
		anInt10528 = buffer.readUnsignedShort();
		anInt10526 = buffer.readUnsignedByte();
		anInt10527 = buffer.readUnsignedShort();
	}
}
