/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135
{
	static int anInt1689;
	static int anInt1690;
	static int anInt1691;
	static int anInt1692;
	
	public final String toString() {
		anInt1690++;
		throw new IllegalStateException();
	}
	
	static final void method1587(int i, Player player) {
		if (i > 40) {
			anInt1689++;
			Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1518(3512, (long) player.index);
			if (node_sub47 != null) {
				node_sub47.method2951(918119625);
			} else {
				Class262_Sub1.method3150(player.plane, player, player.scenePositionXQueue[0], player.scenePositionYQueue[0], null, null, (byte) -8, 0);
			}
		}
	}
	
	static final Object method1588(byte[] bs, int i, boolean bool) {
		anInt1691++;
		if (bs == null) {
			return null;
		}
		if ((bs.length ^ 0xffffffff) < -137 && !Class169_Sub1.aBoolean8783) {
			try {
				Class201 class201 = (Class201) Class.forName("Class201_Sub1").newInstance();
				class201.method2021(bs, 0);
				return class201;
			} catch (Throwable throwable) {
				Class169_Sub1.aBoolean8783 = true;
			}
		}
		if (i != 23386) {
			method1587(-126, null);
		}
		if (!bool) {
			return bs;
		}
		return Class93.method1046(bs, 7348);
	}
}
