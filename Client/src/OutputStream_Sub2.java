/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub2 extends OutputStream {
    static int anInt92;
    static OutcommingPacket aClass318_93 = new OutcommingPacket(77, 3);
    static int anInt94;
    static int anInt95;
    static int anInt96;
    static int anInt97 = 5000;

    OutputStream_Sub2() {
        /* empty */
    }

    public static void method137() {
        aClass318_93 = null;
    }

    static void method138(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt92++;

        if (-i_0_ + i_3_ >= Class262_Sub4.anInt7722 && za_Sub2.anInt10513 >= i_0_ + i_3_ && i_2_ - i_0_ >= Class384.anInt4906 && i_0_ + i_2_ <= Node_Sub25_Sub1.anInt9936) {
            Class62.method610(i_1_, i_4_, i_2_, i_0_, i_3_, i);
        } else {
            Class35.method387(i, i_4_, i_1_, i_3_, i_0_, i_2_);
        }
    }

    public final void write(int i) throws IOException {
        anInt95++;
        throw new IOException();
    }

    static void method139() {
        anInt94++;
        int[] is = new int[EntityNode_Sub3_Sub1.aClass86_9166.anInt1175];
        int i = 0;
        for (int i_6_ = 0; EntityNode_Sub3_Sub1.aClass86_9166.anInt1175 > i_6_; i_6_++) {
            ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_6_);
            if (itemdefinition.maleWornModelId1 >= 0 || itemdefinition.femaleWornModelId1 >= 0) {
                is[i++] = i_6_;
            }
        }
        Node_Sub28.anIntArray7329 = new int[i];
        System.arraycopy(is, 0, Node_Sub28.anIntArray7329, 0, i);
    }
}
