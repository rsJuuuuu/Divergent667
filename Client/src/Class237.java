/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class237
{
	static int anInt2903;
	static Class241 aClass241_2904;
	static int anInt2905;
	static int anInt2906 = 0;
	protected long aLong2907;
	static int anInt2908 = 0;
	private GLXToolkit aGLXToolkit2909;
	
	public static void method3016(int i) {
		if (i != -1) {
			aClass241_2904 = null;
		}
		aClass241_2904 = null;
	}
	
	protected final void finalize() throws Throwable {
		aGLXToolkit2909.method1403(2, aLong2907);
		anInt2905++;
		super.finalize();
	}
	
	static final void method3017(byte b) {
		Node_Sub15_Sub4.anInt9798 = -1;
		anInt2903++;
		if (b >= -103) {
			anInt2908 = 67;
		}
		Class346.anInt4278 = -1;
		Class359.anInt4467 = -1;
		Class262_Sub20.anInt7861 = 0;
	}
	
	Class237(GLXToolkit glxtoolkit, long l, int i) {
		aGLXToolkit2909 = glxtoolkit;
		aLong2907 = l;
	}
	
	static {
		new Class212("", 76);
	}
}
