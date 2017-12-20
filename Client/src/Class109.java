/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class109
{
	static int anInt1367 = -1;
	private Index aClass302_1368;
	protected int anInt1369 = 0;
	private Class61 aClass61_1370;
	static int anInt1371;
	static int anInt1372;
	protected int anInt1373 = 0;
	static int anInt1374;
	private Index aClass302_1375;
	private Interface14 anInterface14_1376;
	
	final String method1126(Class151 class151, long l, int[] is, int i) {
		if (i != 1) {
			aClass61_1370 = null;
		}
		anInt1372++;
		if (anInterface14_1376 != null) {
			String string = anInterface14_1376.method52(0, l, class151, is);
			if (string != null) {
				return string;
			}
		}
		return Long.toString(l);
	}
	
	static final void method1127(boolean bool) {
		anInt1374++;
		for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(65280); node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620(16776960)) {
			if (node_sub19.aBoolean7156) {
				node_sub19.method2160((byte) 97);
			} else {
				node_sub19.aBoolean7159 = true;
				if (node_sub19.anInt7171 >= 0 && (node_sub19.anInt7161 ^ 0xffffffff) <= -1 && Node_Sub54.GAME_SCENE_WDITH > node_sub19.anInt7171 && (Class377_Sub1.GAME_SCENE_HEIGHT ^ 0xffffffff) < (node_sub19.anInt7161 ^ 0xffffffff)) {
					FloatBuffer.method2247(103, node_sub19);
				}
			}
		}
		if (bool == false) {
			for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(65280); node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620(16776960)) {
				if (node_sub19.aBoolean7156) {
					node_sub19.method2160((byte) 30);
				} else {
					node_sub19.aBoolean7159 = true;
				}
			}
		}
	}
	
	final CacheNode_Sub10 method1128(int i, boolean bool) {
		anInt1371++;
		CacheNode_Sub10 cachenode_sub10 = (CacheNode_Sub10) aClass61_1370.method607((long) i, 0);
		if (cachenode_sub10 != null) {
			return cachenode_sub10;
		}
		byte[] bs;
		if (i >= 32768) {
			bs = aClass302_1375.method3524(false, 0x7fff & i, 1);
		} else {
			bs = aClass302_1368.method3524(false, i, 1);
		}
		cachenode_sub10 = new CacheNode_Sub10();
		cachenode_sub10.aClass109_9516 = this;
		if (bs != null) {
			cachenode_sub10.method2325(new BufferedStream(bs), -958);
		}
		if ((i ^ 0xffffffff) <= -32769) {
			cachenode_sub10.method2328(51);
		}
		if (bool != false) {
			aClass61_1370 = null;
		}
		aClass61_1370.method601(cachenode_sub10, 25566, (long) i);
		return cachenode_sub10;
	}
	
	Class109(int i, Index class302, Index class302_0_, Interface14 interface14) {
		aClass61_1370 = new Class61(64);
		anInterface14_1376 = null;
		anInterface14_1376 = interface14;
		aClass302_1368 = class302;
		aClass302_1375 = class302_0_;
		if (aClass302_1368 != null) {
			anInt1373 = aClass302_1368.method3537(-2, 1);
		}
		if (aClass302_1375 != null) {
			anInt1369 = aClass302_1375.method3537(-2, 1);
		}
	}
}
