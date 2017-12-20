/* Class262_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub19 extends Class262
{
	private long hash;
	static short[] aShortArray7852 = new short[256];
	private int value;
	static int[][] anIntArrayArray7854 = { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	static int anInt7855;
	static int anInt7856;
	static int anInt7857;
	
	static final void method3200(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool) {
		anInt7857++;
		Node_Sub19 node_sub19 = null;
		for (Node_Sub19 node_sub19_6_ = (Node_Sub19) Class89.aClass312_1199.method3613(65280); node_sub19_6_ != null; node_sub19_6_ = (Node_Sub19) Class89.aClass312_1199.method3620(16776960)) {
			if (i_3_ == node_sub19_6_.anInt7165 && node_sub19_6_.anInt7171 == i_2_ && i_5_ == node_sub19_6_.anInt7161 && (node_sub19_6_.anInt7166 ^ 0xffffffff) == (i_1_ ^ 0xffffffff)) {
				node_sub19 = node_sub19_6_;
				break;
			}
		}
		if (node_sub19 == null) {
			node_sub19 = new Node_Sub19();
			node_sub19.anInt7166 = i_1_;
			node_sub19.anInt7165 = i_3_;
			node_sub19.anInt7161 = i_5_;
			node_sub19.anInt7171 = i_2_;
			if (i_2_ >= 0 && i_5_ >= 0 && Node_Sub54.GAME_SCENE_WDITH > i_2_ && i_5_ < Class377_Sub1.GAME_SCENE_HEIGHT) {
				FloatBuffer.method2247(103, node_sub19);
			}
			Class89.aClass312_1199.method3625((byte) -54, node_sub19);
		}
		node_sub19.aBoolean7159 = true;
		node_sub19.anInt7167 = i;
		node_sub19.anInt7168 = i_4_;
		node_sub19.aBoolean7156 = bool;
		node_sub19.anInt7169 = i_0_;
	}
	
	static final void method3201(int i) {
		anInt7855++;
		Class335.aClass61_4161.method602((byte) -128);
		if (i != -23303) {
			anIntArrayArray7854 = null;
		}
	}
	
	public static void method3202(int i) {
		aShortArray7852 = null;
		@SuppressWarnings("unused")
		int i_7_ = 49 / ((-59 - i) / 47);
		anIntArrayArray7854 = null;
	}
	
	final void method3148(int i) {
		anInt7856++;
		Node_Sub32 node_sub32 = (Node_Sub32) Class18.aHashTable308.method1518(3512, hash);
		if (node_sub32 != null) {
			node_sub32.anInt7381 = value;
		} else {
			if (i > -102) {
				aShortArray7852 = null;
			}
			Class18.aHashTable308.method1515(hash, new Node_Sub32(value), -126);
		}
	}
	
	Class262_Sub19(BufferedStream buffer, boolean bool) {
		super(buffer);
		int i = buffer.readUnsignedShort();
		if (!bool) {
			hash = (long) i;
		} else {
			hash = 0x100000000L | (long) i;
		}
		value = buffer.readInt();
	}
}
