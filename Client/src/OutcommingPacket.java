/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OutcommingPacket
{
	static int anInt4043;
	protected int length;
	static int anInt4045;
	private int id;
	static IncommingPacket aClass192_4047;
	static int anInt4048;
	static int anInt4049;
	static int anInt4050;
	static Class129 aClass129_4051;
	static int anInt4052;
	static short aShort4053 = 32767;
	static int anInt4054;
	
	public final String toString() {
		anInt4054++;
		throw new IllegalStateException();
	}
	
	static final boolean method3666(int i, byte b) {
		if (b < 106) {
			method3670(-20);
		}
		anInt4048++;
		if (i == 49 || i == 59 || i == 47 || i == 57 || i == 3 || i == 1011) {
			return true;
		}
        return i == 23;
    }
	
	final int method3667(int i) {
		anInt4049++;
		if (i != -24626) {
			id = 87;
		}
		return id;
	}
	
	static final void method3668(boolean bool) {
		if (bool != true) {
			method3670(34);
		}
		for (CacheNode_Sub18 cachenode_sub18 = (CacheNode_Sub18) Class20_Sub1.aHashTable5508.method1516(false); cachenode_sub18 != null; cachenode_sub18 = (CacheNode_Sub18) Class20_Sub1.aHashTable5508.method1520(94)) {
			Mobile_Sub4 mobile_sub4 = cachenode_sub18.aMobile_Sub4_9606;
			mobile_sub4.method912(-24396, 1);
			if (mobile_sub4.method917(-12978)) {
				cachenode_sub18.method2160((byte) 101);
				mobile_sub4.method914(-95);
			} else if (Class175.aClass261ArrayArrayArray2099 != null && mobile_sub4.method909(16)) {
				Node_Sub38_Sub7.method2810(mobile_sub4, true);
			}
		}
		anInt4043++;
	}
	
	static final boolean method3669(int i, byte b, int i_0_) {
		if (b < 96) {
			return false;
		}
		anInt4052++;
		return (Class349.method3988((byte) -111, i_0_, i) | Node_Sub38_Sub4.method2797(0, i_0_, i) | Class179.method1816(i, -1, i_0_)) & Animable_Sub4_Sub1.method931(i, true, i_0_);
	}
	
	public static void method3670(int i) {
		aClass129_4051 = null;
		aClass192_4047 = null;
		if (i != 47) {
			aShort4053 = (short) 106;
		}
	}
	
	OutcommingPacket(int packetId, int size) {
		id = packetId;
		length = size;
		//System.out.println("Packet: " + packetId +  " Size: " + size);
	}
	
	static {
		aClass192_4047 = new IncommingPacket(119, 6);
	}
}
