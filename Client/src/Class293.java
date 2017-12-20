/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class293
{
	static int anInt3680;
	static Index aClass302_3681;
	protected int anInt3682 = 0;
	static int anInt3683;
	static int anInt3684;
	
	static final void method3461(String[] strings, short[] ses, int i) {
		Class225.method2108(strings.length + -1, ses, 0, strings, -25575);
		anInt3680++;
	}
	
	private final void method3462(byte b, BufferedStream buffer, int i) {
		anInt3684++;
		if ((i ^ 0xffffffff) == -6) {
			anInt3682 = buffer.readUnsignedShort();
		}
	}
	
	final void method3463(BufferedStream buffer, byte b) {
		anInt3683++;
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method3462((byte) 22, buffer, i);
		}
		if (b != -114) {
			method3461(null, null, -80);
		}
	}
	
	public static void method3464(int i) {
		aClass302_3681 = null;
		if (i != 10196) {
			method3464(-116);
		}
	}
}
