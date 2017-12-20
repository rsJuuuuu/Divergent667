/* HashTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HashTable
{
	static int anInt1585;
	static int anInt1586;
	static int anInt1587;
	static int anInt1588;
	private Node aNode1589;
	static int anInt1590;
	static int anInt1591;
	protected int anInt1592;
	static int anInt1593;
	static int[] SKILL_LEVEL_XP = new int[120];
	private long aLong1595;
	static int anInt1596;
	protected Node[] aNodeArray1597;
	private Node aNode1598;
	private int anInt1599 = 0;
	static int anInt1600;
	static byte[] aByteArray1601;
	
	final void method1515(long l, Node node, int i) {
		if (i <= -122) {
			anInt1591++;
			if (node.aNode2799 != null) {
				node.method2160((byte) 74);
			}
			Node node_0_ = aNodeArray1597[(int) (l & (long) (-1 + anInt1592))];
			node.aNode2800 = node_0_;
			node.aNode2799 = node_0_.aNode2799;
			node.aNode2799.aNode2800 = node;
			node.aNode2800.aNode2799 = node;
			node.aLong2797 = l;
		}
	}
	
	final Node method1516(boolean bool) {
		anInt1599 = 0;
		if (bool != false) {
			method1520(-6);
		}
		anInt1586++;
		return method1520(89);
	}
	
	final void method1517(boolean bool) {
		if (bool == false) {
			for (int i = 0; (i ^ 0xffffffff) > (anInt1592 ^ 0xffffffff); i++) {
				Node node = aNodeArray1597[i];
				for (;;) {
					Node node_1_ = node.aNode2800;
					if (node_1_ == node) {
						break;
					}
					node_1_.method2160((byte) 125);
				}
			}
			anInt1593++;
			aNode1589 = null;
			aNode1598 = null;
		}
	}
	
	final Node method1518(int i, long l) {
		aLong1595 = l;
		anInt1587++;
		if (i != 3512) {
			method1521((byte) 49);
		}
		Node node = aNodeArray1597[(int) (l & (long) (-1 + anInt1592))];
		for (aNode1589 = node.aNode2800; aNode1589 != node; aNode1589 = aNode1589.aNode2800) {
			if ((l ^ 0xffffffffffffffffL) == (aNode1589.aLong2797 ^ 0xffffffffffffffffL)) {
				Node node_2_ = aNode1589;
				aNode1589 = aNode1589.aNode2800;
				return node_2_;
			}
		}
		aNode1589 = null;
		return null;
	}
	
	final int method1519(byte b) {
		anInt1585++;
		int i = 0;
		if (b != -90) {
			return -27;
		}
		for (int i_3_ = 0; anInt1592 > i_3_; i_3_++) {
			Node node = aNodeArray1597[i_3_];
			Node node_4_ = node.aNode2800;
			while (node_4_ != node) {
				node_4_ = node_4_.aNode2800;
				i++;
			}
		}
		return i;
	}
	
	final Node method1520(int i) {
		if (i <= 66) {
			anInt1592 = -77;
		}
		anInt1590++;
		if ((anInt1599 ^ 0xffffffff) < -1 && aNode1598 != aNodeArray1597[anInt1599 - 1]) {
			Node node = aNode1598;
			aNode1598 = node.aNode2800;
			return node;
		}
		while (anInt1592 > anInt1599) {
			Node node = aNodeArray1597[anInt1599++].aNode2800;
			if (aNodeArray1597[anInt1599 - 1] != node) {
				aNode1598 = node.aNode2800;
				return node;
			}
		}
		return null;
	}
	
	public static void method1521(byte b) {
		aByteArray1601 = null;
		SKILL_LEVEL_XP = null;
		if (b != -84) {
			aByteArray1601 = null;
		}
	}
	
	final int method1522(boolean bool) {
		anInt1588++;
		if (bool != false) {
			method1516(false);
		}
		return anInt1592;
	}
	
	final int method1523(byte b, Node[] nodes) {
		anInt1596++;
		int i = 0;
		if (b > -82) {
			method1522(true);
		}
		for (int i_5_ = 0; (anInt1592 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
			Node node = aNodeArray1597[i_5_];
			for (Node node_6_ = node.aNode2800; node != node_6_; node_6_ = node_6_.aNode2800)
				nodes[i++] = node_6_;
		}
		return i;
	}
	
	final Node method1524(byte b) {
		if (b != 84) {
			return null;
		}
		anInt1600++;
		if (aNode1589 == null) {
			return null;
		}
		for (Node node = aNodeArray1597[(int) ((long) (anInt1592 + -1) & aLong1595)]; aNode1589 != node; aNode1589 = aNode1589.aNode2800) {
			if ((aNode1589.aLong2797 ^ 0xffffffffffffffffL) == (aLong1595 ^ 0xffffffffffffffffL)) {
				Node node_7_ = aNode1589;
				aNode1589 = aNode1589.aNode2800;
				return node_7_;
			}
		}
		aNode1589 = null;
		return null;
	}
	
	HashTable(int i) {
		anInt1592 = i;
		aNodeArray1597 = new Node[i];
		for (int i_8_ = 0; i > i_8_; i_8_++) {
			Node node = aNodeArray1597[i_8_] = new Node();
			node.aNode2800 = node;
			node.aNode2799 = node;
		}
	}
	
	static {
		int i = 0;
		for (int i_9_ = 0; i_9_ < 120; i_9_++) {
			int i_10_ = i_9_ - -1;
			int i_11_ = (int) (300.0 * Math.pow(2.0, (double) i_10_ / 7.0) + (double) i_10_);
			i += i_11_;
			SKILL_LEVEL_XP[i_9_] = i / 4;
		}
		aByteArray1601 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
	}
}
