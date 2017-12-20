/* Node_Sub15_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub7 extends Node_Sub15
{
	static int anInt9820;
	static float aFloat9821;
	static boolean[][] aBooleanArrayArray9822 = { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };
	private String aString9823 = null;
	static int anInt9824;
	private int anInt9825 = 0;
	private long aLong9826 = -1L;
	static Class26 aClass26_9827 = new Class26();
	static GLSprite[] aGLSpriteArray9828;
	
	public static void method2574(int i) {
		if (i != -256) {
			method2574(83);
		}
		aGLSpriteArray9828 = null;
		aBooleanArrayArray9822 = null;
		aClass26_9827 = null;
	}
	
	final void method2556(ClanChat clanchat, int i) {
		anInt9820++;
		clanchat.method488(0, aString9823, aLong9826, anInt9825);
		if (i != 16) {
			aString9823 = null;
		}
	}
	
	final void method2554(int i, BufferedStream buffer) {
		if (i == 29147) {
			if ((buffer.readUnsignedByte() ^ 0xffffffff) != -256) {
				buffer.offset--;
				aLong9826 = buffer.readLong();
			}
			anInt9824++;
			aString9823 = buffer.readString2();
			anInt9825 = buffer.readUnsignedShort();
			if (Class79.aBoolean1052) {
				//System.out.println("memberhash:" + aLong9826 + " membername:" + aString9823);
			}
		}
	}
	
	Node_Sub15_Sub7() {
		/* empty */
	}
}
