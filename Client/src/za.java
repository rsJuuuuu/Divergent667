/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class za extends Node
{
	static Class251 aClass251_7694;
	static int anInt7695;
	
	public za() {
		/* empty */
	}
	
	public static void method2990(int i) {
		if (i != -1871) {
			method2990(-101);
		}
		aClass251_7694 = null;
	}
	
	static final void method2991(String string, boolean bool) {
		anInt7695++;
		if (string != null) {
			String string_0_ = Node_Sub25_Sub3.method2671(-13472, string);
			if (string_0_ != null) {
				if (bool != true) {
					method2991(null, false);
				}
				for (int i = 0; (i ^ 0xffffffff) > (Class235.anInt5122 ^ 0xffffffff); i++) {
					String string_1_ = Class338.aStringArray4197[i];
					String string_2_ = Node_Sub25_Sub3.method2671(-13472, string_1_);
					if (Class310.method3601(string, string_2_, 30195, string_1_, string_0_)) {
						Class235.anInt5122--;
						for (int i_3_ = i; i_3_ < Class235.anInt5122; i_3_++) {
							Class338.aStringArray4197[i_3_] = Class338.aStringArray4197[1 + i_3_];
							Class240.aStringArray2949[i_3_] = Class240.aStringArray2949[1 + i_3_];
							Class7.aStringArray164[i_3_] = Class7.aStringArray164[i_3_ + 1];
							DrawableModel.aStringArray911[i_3_] = DrawableModel.aStringArray911[i_3_ - -1];
							CacheNode_Sub4.aBooleanArray9454[i_3_] = CacheNode_Sub4.aBooleanArray9454[1 + i_3_];
						}
						Class85.anInt1155++;
						Class181.anInt2150 = Class345.anInt4270;
						Class123 class123 = Class262_Sub23.method3213((byte) -103);
						Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, EntityNode_Sub1.aClass318_5927, class123.anIsaacCipher1571);
						node_sub13.aPacket7113.writeByte(Class126.method1536(-20826, string));
						node_sub13.aPacket7113.writeString(string);
						class123.sendPacket(126, node_sub13);
						break;
					}
				}
			}
		}
	}
}
