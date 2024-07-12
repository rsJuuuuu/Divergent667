/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135 {
    static int anInt1689;
    static int anInt1690;
    static int anInt1691;
    static int anInt1692;

    public final String toString() {
        anInt1690++;
        throw new IllegalStateException();
    }

    static void method1587(Player player) {
        anInt1689++;
        Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1518(3512, player.index);
        if (node_sub47 == null) {
            Class262_Sub1.method3150(player.plane, player, player.scenePositionXQueue[0], player.scenePositionYQueue[0], null, null, 0);
        } else {
            node_sub47.method2951();
        }
    }

    static Object method1588(byte[] bs) {
        anInt1691++;
        if (bs == null) {
            return null;
        }
        if (bs.length > 136 && !Class169_Sub1.aBoolean8783) {
            try {
                Class201 class201 = (Class201) Class.forName("Class201_Sub1").newInstance();
                class201.method2021(bs);
                return class201;
            } catch (Throwable throwable) {
                Class169_Sub1.aBoolean8783 = true;
            }
        }
        return bs;
    }
}
