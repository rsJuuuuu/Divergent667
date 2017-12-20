/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124
{
	protected int anInt1602;
	static int anInt1603;
	static int anInt1604;
	static IncommingPacket aClass192_1605 = new IncommingPacket(79, -2);
	
	public final String toString() {
		anInt1603++;
		throw new IllegalStateException();
	}
	
	static final void method1525(int i) {
		anInt1604++;
		if (Class252.aClass110_3189 != null) {
			Class243.aClass340_3069 = new Class340();
			Class243.aClass340_3069.method3954(Class252.aClass110_3189.anInt1383, Class252.aClass110_3189.aClass22_1379.method297(Class35.language), Class252.aClass110_3189, -93, Class43.aLong663);
			Class132.aThread1677 = new Thread(Class243.aClass340_3069, "");
			if (i <= 31) {
				aClass192_1605 = null;
			}
			Class132.aThread1677.start();
		}
	}
	
	public static void method1526(boolean bool) {
		if (bool == true) {
			aClass192_1605 = null;
		}
	}
	
	Class124(int i) {
		anInt1602 = i;
	}
}
