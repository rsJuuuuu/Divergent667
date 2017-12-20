/* Class262_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub14 extends Class262
{
	static int anInt7807;
	private int anInt7808;
	static int anInt7809;
	static float aFloat7810;
	private int anInt7811;
	private int anInt7812;
	static int[] anIntArray7813 = new int[1000];
	private int anInt7814;
	
	public static void method3186(byte b) {
		if (b != -114) {
			method3186((byte) 45);
		}
		anIntArray7813 = null;
	}
	
	final void method3148(int i) {
		if (i > -102) {
			method3148(-1);
		}
		anInt7809++;
		Class105.method1116(anInt7808, anInt7814, anInt7812, (byte) -119, 0, anInt7811, false);
	}
	
	Class262_Sub14(BufferedStream buffer) {
		super(buffer);
		anInt7808 = buffer.readUnsignedShort();
		anInt7811 = buffer.readUnsignedByte();
		anInt7812 = buffer.readUnsignedByte();
		anInt7814 = buffer.readUnsignedByte();
	}
	
	static final void method3187(byte b, int i, int i_0_) {
		if (b >= 102) {
			anInt7807++;
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 12, (long) i_0_);
			cachenode_sub2.method2288(0);
			cachenode_sub2.anInt9434 = i;
		}
	}
}
