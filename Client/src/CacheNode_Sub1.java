/* CacheNode_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub1 extends CacheNode
{
	static int anInt9420;
	static Class257 aClass257_9421;
	static int anInt9422;
	private HashTable aHashTable9423;
	static int anInt9424;
	static boolean aBoolean9425 = false;
	static int anInt9426;
	static int[] anIntArray9427;
	
	static final void method2280(int i) {
		Class320_Sub12.anInt8327 = i;
		for (int i_0_ = 0; i_0_ < Class328.anInt4115; i_0_++) {
			for (int i_1_ = 0; i_1_ < Node_Sub50.anInt7623; i_1_++) {
				if (Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_] == null) {
					Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_] = new Class261(i);
				}
			}
		}
	}
	
	private final void method2281(int i, BufferedStream buffer, int i_2_) {
		if (i == 249) {
			int i_3_ = buffer.readUnsignedByte();
			if (aHashTable9423 == null) {
				int i_4_ = Class320_Sub19.method3753(i_3_, -729073628);
				aHashTable9423 = new HashTable(i_4_);
			}
			for (int i_5_ = 0; i_3_ > i_5_; i_5_++) {
				boolean bool = buffer.readUnsignedByte() == 1;
				int i_6_ = buffer.read24BitInteger();
				Node node;
				if (bool) {
					node = new Node_Sub18(buffer.readString());
				} else {
					node = new Node_Sub32(buffer.readInt());
				}
				aHashTable9423.method1515((long) i_6_, node, -124);
			}
		}
		if (i_2_ <= -118) {
			anInt9422++;
		}
	}
	
	final int method2282(int i, int i_7_, int i_8_) {
		anInt9420++;
		if (aHashTable9423 == null) {
			return i;
		}
		Node_Sub32 node_sub32 = (Node_Sub32) aHashTable9423.method1518(3512, (long) i_8_);
		if (node_sub32 == null) {
			return i;
		}
		return node_sub32.anInt7381;
	}
	
	final void method2283(byte b, BufferedStream buffer) {
		anInt9426++;
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method2281(i, buffer, -119);
		}
	}
	
	final String method2284(int i, String string, int i_10_) {
		anInt9424++;
		if (aHashTable9423 == null) {
			return string;
		}
		if (i_10_ != 27908) {
			return null;
		}
		Node_Sub18 node_sub18 = (Node_Sub18) aHashTable9423.method1518(3512, (long) i);
		if (node_sub18 == null) {
			return string;
		}
		return node_sub18.aString7149;
	}
	
	public static void method2285(int i) {
		aClass257_9421 = null;
		anIntArray9427 = null;
		if (i != 12228) {
			method2285(-85);
		}
	}
	
	static {
		aClass257_9421 = new Class257(10, 19);
	}
}
