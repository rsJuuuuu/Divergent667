/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PlayerUpdateReference
{
	protected int anInt4074;
	static int anInt4075;
	protected boolean aBoolean4076;
	protected int globalPositionHash;
	static int anInt4078;
	protected int anInt4079;
	static Class151 aClass151_4080 = new Class151(12, 0, 1, 0);
	static int anInt4081;
	protected boolean aBoolean4082;
	static int[] anIntArray4083 = { 0, -1, 0, 1 };
	static int[] anIntArray4084 = new int[256];
	
	static final void method3807(int i, int i_0_, int i_1_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_0_][i_1_];
		if (class261 != null) {
			Class58.method575(class261.anAnimable_Sub1_3317);
			if (class261.anAnimable_Sub1_3317 != null) {
				class261.anAnimable_Sub1_3317 = null;
			}
		}
	}
	
	static final void method3808(boolean bool, int i) {
		anInt4075++;
		for (Node_Sub47 node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3620(16776960)) {
			if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
				Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
				node_sub47.aNode_Sub9_Sub2_7568 = null;
			}
			if (node_sub47.aNode_Sub9_Sub2_7556 != null) {
				Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7556);
				node_sub47.aNode_Sub9_Sub2_7556 = null;
			}
			node_sub47.method2160((byte) 43);
		}
		if (i == -1) {
			if (bool) {
				for (Node_Sub47 node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3620(16776960)) {
					if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
						Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
						node_sub47.aNode_Sub9_Sub2_7568 = null;
					}
					node_sub47.method2160((byte) 112);
				}
				for (Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1516(false); node_sub47 != null; node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1520(i + 125)) {
					if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
						Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
						node_sub47.aNode_Sub9_Sub2_7568 = null;
					}
					node_sub47.method2160((byte) 34);
				}
			}
		}
	}
	
	static final void method3809(int i, int i_2_, int i_3_, CacheNode_Sub4 cachenode_sub4) {
		anInt4081++;
		if (Class213.aBoolean2510) {
			int i_4_ = 0;
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) cachenode_sub4.aClass158_9457.method1723(13); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) cachenode_sub4.aClass158_9457.method1721(0)) {
				int i_5_ = Node_Sub19.method2609((byte) 114, cachenode_sub13);
				if (i_5_ > i_4_) {
					i_4_ = i_5_;
				}
			}
			i_4_ += 8;
			int i_6_ = 16 * cachenode_sub4.anInt9462 - -21;
			Class18.anInt309 = (!Node_Sub38_Sub5.aBoolean10130 ? 22 : 26) + cachenode_sub4.anInt9462 * 16;
			if (i_2_ > -122) {
				method3807(23, -15, 97);
			}
			int i_7_ = Class362.anInt4492 + Node_Sub6.anInt7043;
			if (i_4_ + i_7_ > Class360.screenWidth) {
				i_7_ = Node_Sub6.anInt7043 - i_4_;
			}
			if (i_7_ < 0) {
				i_7_ = 0;
			}
			int i_8_ = Node_Sub38_Sub5.aBoolean10130 ? 33 : 31;
			int i_9_ = -i_8_ + i - -13;
			if ((Class205.screenHeight ^ 0xffffffff) > (i_6_ + i_9_ ^ 0xffffffff)) {
				i_9_ = -i_6_ + Class205.screenHeight;
			}
			Class367.anInt4539 = i_7_;
			if (i_9_ < 0) {
				i_9_ = 0;
			}
			CacheNode.anInt7033 = i_4_;
			Class73.aCacheNode_Sub4_988 = cachenode_sub4;
			ReferenceTable.anInt286 = i_9_;
		}
	}
	
	static final byte method3810(int i, boolean bool, int i_10_) {
		if (bool != false) {
			return (byte) 71;
		}
		anInt4078++;
		if ((i ^ 0xffffffff) != -10) {
			return (byte) 0;
		}
		if ((0x1 & i_10_ ^ 0xffffffff) != -1) {
			return (byte) 2;
		}
		return (byte) 1;
	}
	
	public static void method3811(int i) {
		if (i != -3182) {
			anIntArray4084 = null;
		}
		aClass151_4080 = null;
		anIntArray4084 = null;
		anIntArray4083 = null;
	}
}
