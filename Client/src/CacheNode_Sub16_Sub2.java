/* CacheNode_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub16_Sub2 extends CacheNode_Sub16
{
	static int anInt11077;
	static int anInt11078;
	static IncommingPacket aClass192_11079;
	protected int anInt11080;
	protected MainFile aClass6_11081;
	static float aFloat11082;
	static int anInt11083;
	static int anInt11084;
	static int anInt11085 = 0;
	protected byte[] aByteArray11086;
	static int anInt11087;
	
	public static void method2390(int i) {
		aClass192_11079 = null;
		if (i > -119) {
			method2392((byte) -110, 95);
		}
	}
	
	final int method2386(byte b) {
		if (b != -40) {
			return -55;
		}
		anInt11077++;
		if (aBoolean9602) {
			return 0;
		}
		return 100;
	}
	
	static final int method2391(byte b) {
		if (b <= 80) {
			anInt11085 = 6;
		}
		anInt11084++;
		return 15;
	}
	
	final byte[] method2385(int i) {
		if (i != 15) {
			aClass6_11081 = null;
		}
		anInt11083++;
		if (aBoolean9602) {
			throw new RuntimeException();
		}
		return aByteArray11086;
	}
	
	static final void method2392(byte b, int i) {
		Class253.anInt3201 = i;
		Class168.anInt2044 = 3;
		if (b == -99) {
			anInt11078++;
			Node_Sub38_Sub19.anInt10296 = -1;
			Node_Sub15_Sub4.anInt9800 = 100;
		}
	}
	
	static {
		aClass192_11079 = new IncommingPacket(88, -2);
	}
}
