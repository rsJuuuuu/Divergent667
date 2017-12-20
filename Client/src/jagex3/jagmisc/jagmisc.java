/* jagmisc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.jagmisc;

public class jagmisc
{
	private static native int ping0(byte b, byte b_0_, byte b_1_, byte b_2_, long l);
	
	public static native boolean init();
	
	private static native void Quit0();
	
	public static native long nanoTime();
	
	public static native long getTotalPhysicalMemory();
	
	public static native long getAvailablePhysicalMemory();
	
	public static void quit() {
		Quit0();
	}
	
	public static int ping(byte b, byte b_3_, byte b_4_, byte b_5_, long l) throws Throwable {
		int i = ping0(b, b_3_, b_4_, b_5_, l);
		if (i < 0) {
			throw new Exception(String.valueOf(i));
		}
		return i;
	}
}
