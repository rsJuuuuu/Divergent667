/* Node_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub19 extends Node
{
	protected int anInt7154;
	static int anInt7155;
	protected boolean aBoolean7156 = false;
	static int anInt7157;
	static int anInt7158;
	protected boolean aBoolean7159 = true;
	protected Class121 aClass121_7160;
	protected int anInt7161;
	static int anInt7162;
	static int anInt7163 = 0;
	protected int anInt7164;
	protected int anInt7165;
	protected int anInt7166;
	protected int anInt7167;
	protected int anInt7168;
	protected int anInt7169;
	protected int anInt7170;
	protected int anInt7171;
	static int anInt7172;
	static int anInt7173 = 0;
	
	static final void method2608(int i, byte b, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		anInt7158++;
		int i_5_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_0_);
		int i_6_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_2_);
		int i_7_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_3_);
		int i_8_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_1_);
		int i_9_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_0_ - -i);
		int i_10_ = Node_Sub38_Sub32.method2894(Class384.anInt4906, Node_Sub25_Sub1.anInt9936, 929798380, i_2_ + -i);
		int i_11_ = i_5_;
		if (b < 35) {
			anInt7163 = 45;
		}
		for (/**/; (i_9_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
			Class369.method4086(i_8_, i_4_, i_7_, Class169_Sub4.anIntArrayArray8826[i_11_], 0);
		for (int i_12_ = i_6_; i_10_ < i_12_; i_12_--)
			Class369.method4086(i_8_, i_4_, i_7_, Class169_Sub4.anIntArrayArray8826[i_12_], 0);
		int i_13_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, i_3_ + i);
		int i_14_ = Node_Sub38_Sub32.method2894(Class262_Sub4.anInt7722, za_Sub2.anInt10513, 929798380, -i + i_1_);
		for (int i_15_ = i_9_; (i_15_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff); i_15_++) {
			int[] is = Class169_Sub4.anIntArrayArray8826[i_15_];
			Class369.method4086(i_13_, i_4_, i_7_, is, 0);
			Class369.method4086(i_8_, i_4_, i_14_, is, 0);
		}
	}
	
	static final int method2609(byte b, CacheNode_Sub13 cachenode_sub13) {
		anInt7157++;
		@SuppressWarnings("unused")
		int i = 99 % ((b - 25) / 47);
		String string = Mobile.method844(cachenode_sub13, (byte) 126);
		int[] is = null;
		if (!Class134.method1574(false, cachenode_sub13.anInt9562)) {
			if ((cachenode_sub13.anInt9569 ^ 0xffffffff) != 0) {
				is = EntityNode_Sub3_Sub1.aClass86_9166.method1010(cachenode_sub13.anInt9569, 14434).anIntArray1926;
			} else if (OutcommingPacket.method3666(cachenode_sub13.anInt9562, (byte) 119)) {
				Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) (int) cachenode_sub13.aLong9563);
				if (node_sub41 != null) {
					Npc npc = node_sub41.aNpc7518;
					NpcDefinition npcdefinition = npc.aNpcDefinition11122;
					if (npcdefinition.anIntArray2827 != null) {
						npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
					}
					if (npcdefinition != null) {
						is = npcdefinition.anIntArray2832;
					}
				}
			} else if (Class194_Sub3.method1973(cachenode_sub13.anInt9562, 31922)) {
				ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145((int) (0x7fffffffL & cachenode_sub13.aLong9563 >>> 32), 46);
				if (objectdefinition.anIntArray2984 != null) {
					objectdefinition = objectdefinition.method3038(13, Class24.aClass275_442);
				}
				if (objectdefinition != null) {
					is = objectdefinition.anIntArray2981;
				}
			}
		} else {
			is = EntityNode_Sub3_Sub1.aClass86_9166.method1010((int) cachenode_sub13.aLong9563, 14434).anIntArray1926;
		}
		if (is != null) {
			string += Class43.method458(4923, is);
		}
		int i_16_ = Class262_Sub15_Sub1.aClass357_10524.method4031(122, Class105.aGLSpriteArray5194, string);
		if (cachenode_sub13.aBoolean9572) {
			i_16_ += Class274.aGLSprite4981.method1193() + 4;
		}
		return i_16_;
	}
	
	static final boolean method2610(byte b, boolean bool) {
		anInt7162++;
		if (b != -58) {
			anInt7173 = -19;
		}
		boolean bool_17_ = Class93.aGraphicsToolkit1241.w();
		if (bool_17_ != bool) {
			if (bool) {
				if (!Class93.aGraphicsToolkit1241.m()) {
					bool = false;
				}
			} else {
				Class93.aGraphicsToolkit1241.f();
			}
			if (bool != !bool_17_) {
				return false;
			}
			Class213.aNode_Sub27_2512.method2690(25, bool ? 1 : 0, Class213.aNode_Sub27_2512.aClass320_Sub20_7306);
			Node_Sub38_Sub31.method2893(1);
			return true;
		}
		return true;
	}
	
	static final void method2611(boolean bool) {
		anInt7155++;
		Class220.method2097(19810);
		if (bool != false) {
			anInt7173 = -46;
		}
	}
	
	static int method2612(int i, int encryptValue) {
		return i ^ encryptValue;
	}
}
