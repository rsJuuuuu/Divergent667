/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153
{
	static int anInt1943;
	static int anInt1944;
	static IncommingPacket aClass192_1945 = new IncommingPacket(32, -1);
	static IncommingPacket aClass192_1946 = new IncommingPacket(95, 6);
	static HashTable aHashTable1947 = new HashTable(32);
	static int[] anIntArray1948;
	
	public static void method1696(byte b) {
		if (b <= -77) {
			aHashTable1947 = null;
			anIntArray1948 = null;
			aClass192_1946 = null;
			aClass192_1945 = null;
		}
	}
	
	static final boolean method1697(int i, int i_0_, int i_1_) {
		if (i != 95) {
			return false;
		}
		anInt1944++;
		return Class377.method4127(i_0_, -31997, i_1_) & ClanChat.method494((byte) 14, i_1_, i_0_);
	}
}
