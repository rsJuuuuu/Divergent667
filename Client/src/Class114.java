/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114
{
	static int anInt1452;
	private int anInt1453;
	private CacheNode aCacheNode1454;
	static int[][] anIntArrayArray1455 = { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
	static int anInt1456;
	static int anInt1457;
	static volatile boolean aBoolean1458 = true;
	static int anInt1459;
	static long aLong1460 = 0L;
	private long aLong1461;
	static int anInt1462 = 1339;
	private CacheNode[] aCacheNodeArray1463;
	
	public static void method1154(int i) {
		if (i == -1) {
			anIntArrayArray1455 = null;
		}
	}
	
	static final GraphicsToolkit method1155(d var_d, java.awt.Canvas canvas, int i, int i_0_) {
		anInt1457++;
		if (i_0_ > -35) {
			return null;
		}
		return new GLToolkit(canvas, var_d, i);
	}
	
	final void method1156(byte b, CacheNode cachenode, long l) {
		if (b == 91) {
			if (cachenode.aCacheNode7036 != null) {
				cachenode.method2275(-95);
			}
			anInt1459++;
			CacheNode cachenode_1_ = aCacheNodeArray1463[(int) ((long) (anInt1453 + -1) & l)];
			cachenode.aCacheNode7035 = cachenode_1_;
			cachenode.aCacheNode7036 = cachenode_1_.aCacheNode7036;
			cachenode.aCacheNode7036.aCacheNode7035 = cachenode;
			cachenode.aCacheNode7035.aCacheNode7036 = cachenode;
			cachenode.aLong7037 = l;
		}
	}
	
	final CacheNode method1157(long l, int i) {
		aLong1461 = l;
		anInt1456++;
		CacheNode cachenode = aCacheNodeArray1463[(int) (l & (long) (anInt1453 - i))];
		for (aCacheNode1454 = cachenode.aCacheNode7035; cachenode != aCacheNode1454; aCacheNode1454 = aCacheNode1454.aCacheNode7035) {
			if ((l ^ 0xffffffffffffffffL) == (aCacheNode1454.aLong7037 ^ 0xffffffffffffffffL)) {
				CacheNode cachenode_2_ = aCacheNode1454;
				aCacheNode1454 = aCacheNode1454.aCacheNode7035;
				return cachenode_2_;
			}
		}
		aCacheNode1454 = null;
		return null;
	}
	
	final CacheNode method1158(int i) {
		anInt1452++;
		if (aCacheNode1454 == null) {
			return null;
		}
		for (CacheNode cachenode = aCacheNodeArray1463[(int) (aLong1461 & (long) (i + anInt1453))]; aCacheNode1454 != cachenode; aCacheNode1454 = aCacheNode1454.aCacheNode7035) {
			if (aLong1461 == aCacheNode1454.aLong7037) {
				CacheNode cachenode_3_ = aCacheNode1454;
				aCacheNode1454 = aCacheNode1454.aCacheNode7035;
				return cachenode_3_;
			}
		}
		aCacheNode1454 = null;
		return null;
	}
	
	Class114(int i) {
		aCacheNodeArray1463 = new CacheNode[i];
		anInt1453 = i;
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
			CacheNode cachenode = aCacheNodeArray1463[i_4_] = new CacheNode();
			cachenode.aCacheNode7036 = cachenode;
			cachenode.aCacheNode7035 = cachenode;
		}
	}
}
