/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303
{
	static int anInt3821;
	private HashTable aHashTable3822;
	private int anInt3823 = 0;
	static int anInt3824;
	static int anInt3825;
	static int anInt3826;
	static Animable[] anAnimableArray3827;
	private Node aNode3828;
	static int anInt3829;
	static int anInt3830;
	static int anInt3831;
	
	static final boolean method3538(int i, int i_0_, int i_1_) {
		if (i_0_ >= -125) {
			anInt3831 = 77;
		}
		anInt3829++;
		return GraphicsBuffer.method2598(2048, i_1_, i) & (Class278.method3367(i, i_1_, (byte) 12) | (0x2000 & i_1_) != 0 | Class320_Sub9.method3713(110, i_1_, i));
	}
	
	final Node method3539(int i) {
		anInt3825++;
		if (i < anInt3823 && aHashTable3822.aNodeArray1597[anInt3823 - 1] != aNode3828) {
			Node node = aNode3828;
			aNode3828 = node.aNode2800;
			return node;
		}
		while ((aHashTable3822.anInt1592 ^ 0xffffffff) < (anInt3823 ^ 0xffffffff)) {
			Node node = aHashTable3822.aNodeArray1597[anInt3823++].aNode2800;
			if (aHashTable3822.aNodeArray1597[anInt3823 + -1] != node) {
				aNode3828 = node.aNode2800;
				return node;
			}
		}
		return null;
	}
	
	public Class303() {
		/* empty */
	}
	
	static final boolean method3540(boolean bool) {
		anInt3821++;
		try {
			if ((Class52.anInt800 ^ 0xffffffff) == -3) {
				if (Player.aNode_Sub4_11155 == null) {
					Player.aNode_Sub4_11155 = Node_Sub4.method2173(Class93_Sub2.aClass302_6049, CacheNode_Sub6.anInt9485, Class101.anInt1306);
					if (Player.aNode_Sub4_11155 == null) {
						return false;
					}
				}
				if (Class10.aClass96_176 == null) {
					Class10.aClass96_176 = new Class96(Class51.aClass302_5339, Class320_Sub12.aClass302_8326);
				}
				Node_Sub9_Sub1 node_sub9_sub1 = Class307.aNode_Sub9_Sub1_3902;
				if (Class61.aNode_Sub9_Sub1_885 != null) {
					node_sub9_sub1 = Class61.aNode_Sub9_Sub1_885;
				}
				if (node_sub9_sub1.method2467(Class10.aClass96_176, Node_Sub38_Sub6.aClass302_10138, -127, 22050, Player.aNode_Sub4_11155)) {
					Class307.aNode_Sub9_Sub1_3902 = node_sub9_sub1;
					Class307.aNode_Sub9_Sub1_3902.method2456(-6762);
					if (Class339_Sub8.anInt8733 <= 0) {
						Class52.anInt800 = 0;
						Class307.aNode_Sub9_Sub1_3902.method2439(-12651, Class17.anInt282);
						for (int i = 0; (i ^ 0xffffffff) > (Class153.anIntArray1948.length ^ 0xffffffff); i++) {
							Class307.aNode_Sub9_Sub1_3902.method2449(Class153.anIntArray1948[i], false, i);
							Class153.anIntArray1948[i] = 255;
						}
					} else {
						Class52.anInt800 = 3;
						Class307.aNode_Sub9_Sub1_3902.method2439(-12651, Class17.anInt282 < Class339_Sub8.anInt8733 ? Class17.anInt282 : Class339_Sub8.anInt8733);
						for (int i = 0; i < Class153.anIntArray1948.length; i++) {
							Class307.aNode_Sub9_Sub1_3902.method2449(Class153.anIntArray1948[i], bool, i);
							Class153.anIntArray1948[i] = 255;
						}
					}
					if (Class61.aNode_Sub9_Sub1_885 == null) {
						if (Class77.aLong1018 <= 0L) {
							Class307.aNode_Sub9_Sub1_3902.method2457(197984776, Player.aNode_Sub4_11155, Class266.aBoolean3385);
						} else {
							Class307.aNode_Sub9_Sub1_3902.method2448(Player.aNode_Sub4_11155, Class266.aBoolean3385, -128, Class77.aLong1018, true);
						}
					}
					if (Class230.aClass42_5208 != null) {
						Class230.aClass42_5208.method441(11757, Class307.aNode_Sub9_Sub1_3902);
					}
					Class77.aLong1018 = 0L;
					Class10.aClass96_176 = null;
					Player.aNode_Sub4_11155 = null;
					Class61.aNode_Sub9_Sub1_885 = null;
					Class93_Sub2.aClass302_6049 = null;
					return true;
				}
			}
			if (bool != false) {
				method3538(-44, 28, 48);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			Class307.aNode_Sub9_Sub1_3902.method2435(false);
			Class10.aClass96_176 = null;
			Class61.aNode_Sub9_Sub1_885 = null;
			Class93_Sub2.aClass302_6049 = null;
			Player.aNode_Sub4_11155 = null;
			Class52.anInt800 = 0;
		}
		return false;
	}
	
	public static void method3541(byte b) {
		anAnimableArray3827 = null;
		if (b >= -52) {
			method3541((byte) 12);
		}
	}
	
	final Node method3542(boolean bool) {
		anInt3830++;
		if (bool != true) {
			return null;
		}
		anInt3823 = 0;
		return method3539(0);
	}
	
	static final void method3543(byte b) {
		anInt3826++;
		if (b != 93) {
			anInt3831 = 83;
		}
		Class153.aHashTable1947.method1517(false);
	}
	
	Class303(HashTable hashtable) {
		aHashTable3822 = hashtable;
	}
}
