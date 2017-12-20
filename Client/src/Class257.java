/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class257
{
	static int anInt3242;
	static float aFloat3243 = 1024.0F;
	static int anInt3244 = 503;
	static IncommingPacket aClass192_3245 = new IncommingPacket(49, 1);
	static int anInt3246;
	static int anInt3247;
	
	static final void sendDialogueContinuePacket(int i, boolean bool, int interfaceHash) {
		anInt3242++;
		Class320_Sub22.anInt8416++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub36_Sub1.aClass318_10031, Class218.aClass123_2566.anIsaacCipher1571);
		if (bool != true) {
			sendDialogueContinuePacket(106, true, 87);
		}
		node_sub13.aPacket7113.writeIntV2(interfaceHash);
		node_sub13.aPacket7113.writeShortLE128(i);
		Class218.aClass123_2566.sendPacket(127, node_sub13);
	}
	
	public final String toString() {
		anInt3246++;
		throw new IllegalStateException();
	}
	
	Class257(int i, int i_1_) {
		/* empty */
	}
	
	static final void method3122(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt3247++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 4, (long) i_4_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9429 = i_3_;
		@SuppressWarnings("unused")
		int i_6_ = -117 % ((i_5_ - -32) / 41);
		cachenode_sub2.anInt9434 = i_2_;
		cachenode_sub2.anInt9432 = i;
	}
	
	public static void method3123(boolean bool) {
		if (bool != true) {
			anInt3244 = -110;
		}
		aClass192_3245 = null;
	}
}
