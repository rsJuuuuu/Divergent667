/* Class262_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub7 extends Class262
{
	static int anInt7749;
	static IncommingPacket aClass192_7750 = new IncommingPacket(131, -1);
	private int anInt7751;
	private String aString7752;
	
	Class262_Sub7(BufferedStream buffer) {
		super(buffer);
		aString7752 = buffer.readString();
		anInt7751 = buffer.readUnsignedShort();
	}
	
	final void method3148(int i) {
		if (i <= -102) {
			if ((Class200_Sub2.anInt4935 ^ 0xffffffff) != 0) {
				ClientScriptsExecutor.method3563(Class200_Sub2.anInt4935, aString7752, anInt7751);
			}
			anInt7749++;
		}
	}
	
	public static void method3167(boolean bool) {
		if (bool != false) {
			method3167(false);
		}
		aClass192_7750 = null;
	}
}
