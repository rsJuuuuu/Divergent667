/* CacheNode_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub16_Sub1 extends CacheNode_Sub16
{
	static int anInt11068;
	protected byte aByte11069;
	protected int position;
	static int anInt11071;
	protected BufferedStream aBuffer11072;
	static IncommingPacket aClass192_11073 = new IncommingPacket(61, 20);
	static int anInt11074;
	static int anInt11075;
	static Class124 aClass124_11076 = new Class124(0);
	
	static final void method2387(byte b) {
		if (b != -114) {
			aClass124_11076 = null;
		}
		if (AnimableAnimator.aClass42_5498 != null) {
			AnimableAnimator.aClass42_5498.method453((byte) -112);
		}
		anInt11074++;
		if (Packet.aClass42_9402 != null) {
			Packet.aClass42_9402.method453((byte) -115);
		}
	}
	
	final byte[] method2385(int i) {
		anInt11071++;
		if (aBoolean9602 || (aBuffer11072.buffer.length - aByte11069 ^ 0xffffffff) < (aBuffer11072.offset ^ 0xffffffff)) {
			throw new RuntimeException();
		}
		if (i != 15) {
			aBuffer11072 = null;
		}
		return aBuffer11072.buffer;
	}
	
	public static void method2388(boolean bool) {
		if (bool != false) {
			method2387((byte) -7);
		}
		aClass192_11073 = null;
		aClass124_11076 = null;
	}
	
	final int method2386(byte b) {
		anInt11068++;
		if (b != -40) {
			aByte11069 = (byte) 49;
		}
		if (aBuffer11072 == null) {
			return 0;
		}
		return aBuffer11072.offset * 100 / (-aByte11069 + aBuffer11072.buffer.length);
	}
	
	static final Class377_Sub1 method2389(int i) {
		anInt11075++;
		if ((Node_Sub5.anInt7029 ^ 0xffffffff) > (Class180.aClass377_Sub1Array2143.length ^ 0xffffffff)) {
			return Class180.aClass377_Sub1Array2143[Node_Sub5.anInt7029++];
		}
		if (i != 61) {
			method2388(true);
		}
		return null;
	}
	
	CacheNode_Sub16_Sub1() {
		/* empty */
	}
}
