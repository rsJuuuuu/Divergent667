/* Class262_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub8 extends Class262
{
	private int anInt7753;
	static int anInt7754;
	static Class312 aClass312_7755 = new Class312();
	static int anInt7756 = -1;
	private int anInt7757;
	
	public static void method3168(boolean bool) {
		if (bool != false) {
			method3168(false);
		}
		aClass312_7755 = null;
	}
	
	Class262_Sub8(BufferedStream buffer) {
		super(buffer);
		anInt7757 = buffer.readUnsignedShort();
		anInt7753 = buffer.readUnsignedByte();
	}
	
	static final void method3169() {
		for (int i = 0; i < GraphicsToolkit.aClass33Array1549.length; i++)
			GraphicsToolkit.aClass33Array1549[i].method360();
		GraphicsToolkit.aClass33Array1549 = null;
	}
	
	final void method3148(int i) {
		anInt7754++;
		if (i >= -102) {
			anInt7756 = -69;
		}
		Class259.method3132(anInt7753, anInt7757, 0, (byte) 110);
	}
}
