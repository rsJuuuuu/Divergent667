/* Class262_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub15_Sub1 extends Class262_Sub15
{
	private int anInt10515;
	static int anInt10516;
	static int anInt10517;
	private int anInt10518;
	static Class212 aClass212_10519 = new Class212("", 20);
	static Class224 aClass224_10520;
	static Class68 aClass68_10521 = new Class68(1);
	private int anInt10522;
	static int[] anIntArray10523;
	static Class357 aClass357_10524;
	
	public static void method3191(int i) {
		if (i == 256) {
			aClass68_10521 = null;
			anIntArray10523 = null;
			aClass357_10524 = null;
			aClass224_10520 = null;
			aClass212_10519 = null;
		}
	}
	
	Class262_Sub15_Sub1(BufferedStream buffer) {
		super(buffer);
		int i = buffer.readInt();
		anInt10522 = i & 0xffff;
		anInt10515 = i >>> 16;
		anInt10518 = buffer.readUnsignedByte();
	}
	
	final void method3148(int i) {
		anInt10516++;
		int i_0_ = 256 + 512 * anInt10515;
		int i_1_ = 512 * anInt10522 - -256;
		if (i >= -102) {
			method3192(104, -83, 29);
		}
		int i_2_ = anInt10518;
		if ((i_2_ ^ 0xffffffff) > -4 && Class238.method3021(anInt10522, anInt10515, -29)) {
			i_2_++;
		}
		Mobile_Sub4 mobile_sub4 = new Mobile_Sub4(anInt7818, 0, anInt10518, i_2_, i_0_, Node_Sub38_Sub7.method2809(anInt10518, -29754, i_1_, i_0_) - anInt7820, i_1_, anInt10515, anInt10515, anInt10522, anInt10522, anInt7815, false);
		Class20_Sub1.aHashTable5508.method1515((long) (anInt10515 << 16 | anInt10522), new CacheNode_Sub18(mobile_sub4), -125);
	}
	
	static final boolean method3192(int i, int i_3_, int i_4_) {
		anInt10517++;
		if (i_4_ != 512) {
			aClass357_10524 = null;
		}
		return (Class320_Sub5.method3700(i, (byte) 125, i_3_) | Node_Sub38_Sub26.method2877(i, i_3_, 118) | Class321.method3800(i_3_, i, 126)) & Class85.method999(i, i_3_, (byte) -72);
	}
}
