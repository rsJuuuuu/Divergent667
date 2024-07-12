/* Node_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub2 extends Node {
    protected int cliped;
    protected int interfaceId;
    static int anInt6934;
    static GLSprite aGLSprite6935;
    static int anInt6936;
    static int anInt6937 = 0;

    static void method2167() {
        anInt6936++;
        for (int i_0_ = 0; i_0_ < Node_Sub25_Sub3.localNPCsCount; i_0_++) {
            int i_1_ = Class54.LocalNPCsIndexes[i_0_];
            Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, i_1_);
            if (node_sub41 != null) {
                Npc npc = node_sub41.aNpc7518;
                r_Sub2.method2375(false, npc);
            }
        }
    }

    public static void method2168() {
        aGLSprite6935 = null;
    }
}
