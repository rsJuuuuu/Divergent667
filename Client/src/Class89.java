/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89
{
	static int anInt1194;
	static int[] anIntArray1195 = new int[5];
	static int anInt1196;
	static int anInt1197;
	static int anInt1198 = 0;
	static Class312 aClass312_1199 = new Class312();
	static int anInt1200;
	
	static final int method1019(int i, int i_0_, int i_1_) {
		if (i_0_ != 26817) {
			anInt1197 = -44;
		}
		anInt1196++;
		double d = Math.log((double) i_1_) / Math.log(2.0);
		double d_2_ = Math.log((double) i) / Math.log(2.0);
		double d_3_ = d_2_ + Math.random() * (-d_2_ + d);
		return (int) (0.5 + Math.pow(2.0, d_3_));
	}
	
	public static void method1020(int i) {
		aClass312_1199 = null;
		anIntArray1195 = null;
		if (i != 31) {
			method1020(54);
		}
	}
	
	static final void method1021(GraphicsToolkit graphicstoolkit, byte b) {
		anInt1200++;
		int i = 0;
		int i_4_ = 0;
		if (Class71.aBoolean967) {
			i = Class67.method733(-89);
			i_4_ = Class226.method2112(256);
		}
		int i_5_ = -10660793;
		Class53.method556(Client.anInt5481 + i_4_, true, Node_Sub6.anInt7043 - -i, Class219.anInt2627, i_5_, graphicstoolkit, -16777216, Class362.anInt4492);
		@SuppressWarnings("unused")
		int i_6_ = 110 % ((-38 - b) / 32);
		Class262_Sub4.aClass52_7721.method538(Node_Sub6.anInt7043 - -i + 3, Client.anInt5481 - (-i_4_ + -14), Class22.aClass22_387.method297(Class35.language), -1, 1, i_5_);
		int i_7_ = Class106.aClass93_1356.method1050((byte) -17) - -i;
		int i_8_ = Class106.aClass93_1356.method1051(true) - -i_4_;
		if (!Class194_Sub3_Sub1.aBoolean9375) {
			int i_9_ = 0;
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
				int i_10_ = (Class315.anInt4035 + (-1 - i_9_)) * 16 + (i_4_ + (Client.anInt5481 + 31));
				i_9_++;
				IComponentDefinitions.method4139(graphicstoolkit, Class362.anInt4492, Class219.anInt2627, Client.anInt5481 + i_4_, i_10_, -256, cachenode_sub13, -1, i_8_, i + Node_Sub6.anInt7043, i_7_, -4392);
			}
		} else {
			int i_11_ = 0;
			for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(13); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
				int i_12_ = i_4_ + Client.anInt5481 + (31 + i_11_ * 16);
				if (cachenode_sub4.anInt9462 != 1) {
					Node_Sub40.method2924(i_8_, Class362.anInt4492, i_12_, -9330, -256, graphicstoolkit, i_7_, -1, Client.anInt5481 + i_4_, i + Node_Sub6.anInt7043, Class219.anInt2627, cachenode_sub4);
				} else {
					IComponentDefinitions.method4139(graphicstoolkit, Class362.anInt4492, Class219.anInt2627, Client.anInt5481 + i_4_, i_12_, -256, (CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035, -1, i_8_, i + Node_Sub6.anInt7043, i_7_, -4392);
				}
				i_11_++;
			}
			if (Class73.aCacheNode_Sub4_988 != null) {
				Class53.method556(ReferenceTable.anInt286, true, Class367.anInt4539, Class18.anInt309, i_5_, graphicstoolkit, -16777216, CacheNode.anInt7033);
				i_11_ = 0;
				Class262_Sub4.aClass52_7721.method538(Class367.anInt4539 + 3, ReferenceTable.anInt286 + 14, Class73.aCacheNode_Sub4_988.aString9458, -1, 1, i_5_);
				for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1723(13); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1721(0)) {
					int i_13_ = i_11_ * 16 + ReferenceTable.anInt286 + 31;
					i_11_++;
					IComponentDefinitions.method4139(graphicstoolkit, CacheNode.anInt7033, Class18.anInt309, ReferenceTable.anInt286, i_13_, -256, cachenode_sub13, -1, i_8_, Class367.anInt4539, i_7_, -4392);
				}
				Class226.method2114(Class367.anInt4539, ReferenceTable.anInt286, CacheNode.anInt7033, Class18.anInt309, -107);
			}
		}
		Class226.method2114(i + Node_Sub6.anInt7043, i_4_ + Client.anInt5481, Class362.anInt4492, Class219.anInt2627, -123);
	}
	
	static final void method1022(boolean bool) {
		anInt1194++;
		if (!Class26.method311(Class151.anInt1843, -5) && !Class329.method3833((byte) -61, Class151.anInt1843)) {
			int i = Class295.myPlayer.scenePositionXQueue[0] >> 3;
			int i_14_ = Class295.myPlayer.scenePositionYQueue[0] >> 3;
			if ((i ^ 0xffffffff) > -1 || Node_Sub54.GAME_SCENE_WDITH >> 3 <= i || (i_14_ ^ 0xffffffff) > -1 || Class377_Sub1.GAME_SCENE_HEIGHT >> 3 <= i_14_) {
				Model.method2092(0, (byte) 8, Node_Sub54.GAME_SCENE_WDITH >> 4, Class377_Sub1.GAME_SCENE_HEIGHT >> 4);
			} else {
				Model.method2092(OutputStream_Sub2.anInt97, (byte) 8, i, i_14_);
			}
		} else {
			Model.method2092(OutputStream_Sub2.anInt97, (byte) 8, Class98.anInt5061 >> 12, Node_Sub10.anInt7079 >> 12);
		}
		CacheNode_Sub14.method2349((byte) 5);
		Class313.method3648(-97);
		Class363.method4054(-21619);
		Class239.method3022(bool);
	}
}
