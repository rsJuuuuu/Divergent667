/* Node_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub42 extends Node {
    static int anInt7520;
    protected int anInt7521;
    protected String aString7522;
    static OutcommingPacket aClass318_7523 = new OutcommingPacket(66, 3);
    static int anInt7524;
    static int anInt7525;
    static OutcommingPacket aClass318_7526 = new OutcommingPacket(61, 8);
    static int anInt7527;

    public static void method2933() {
        aClass318_7523 = null;

        aClass318_7526 = null;

    }

    static Class151[] method2934() {
        anInt7524++;
        return new Class151[]{Class216.aClass151_2550, Node_Sub44.aClass151_7549, Node_Sub38_Sub33.aClass151_10439, ClanChat.aClass151_756, Class35.aClass151_535, Class345.aClass151_4267, Node_Sub8.aClass151_7066, Class194.aClass151_2372, Node_Sub39.aClass151_7493, Class150_Sub1.aClass151_8949, PlayerUpdateReference.aClass151_4080, Class50.aClass151_781, Node_Sub20.aClass151_7178, Class374.aClass151_4614};
    }

    public Node_Sub42() {
        /* empty */
    }

    static boolean method2935(int i, int i_0_) {
        anInt7520++;
        if (i_0_ >= 1000 && i < 1000) {
            return true;
        }
        if (i_0_ < 1000 && i < 1000) {
            if (Node_Sub27.method2699(i)) {
                return true;
            }
            return !Node_Sub27.method2699(i_0_);
        }
        return i_0_ >= 1000;
    }

    Node_Sub42(String string) {
        anInt7521 = 0;
        aString7522 = string;
    }

    static void method2936(GraphicsToolkit graphicstoolkit) {
        anInt7525++;
        int i_1_ = 0;
        int i_2_ = 0;
        if (Class71.aBoolean967) {
            i_1_ = Class67.method733(-82);
            i_2_ = Class226.method2112();
        }
        graphicstoolkit.KA(i_1_, i_2_, Class360.screenWidth + i_1_, i_2_ + 350);
        graphicstoolkit.aa(i_1_, i_2_, Class360.screenWidth, 350, 0x332277 | Class298.anInt3740 << 24, 1);
        Class362.method4053(i_2_, 350 + i_2_, i_1_, (byte) -108, Class360.screenWidth + i_1_);
        int i_3_ = 350 / Class91.anInt1227;
        if (Class144_Sub4.anInt6848 > 0) {
            int i_4_ = 346 - (Class91.anInt1227 + 4);
            int i_5_ = i_3_ * i_4_ / (-1 + i_3_ + Class144_Sub4.anInt6848);
            int i_6_ = 4;
            if (Class144_Sub4.anInt6848 > 1) {
                i_6_ += (-Class118.anInt5406 - 1 + Class144_Sub4.anInt6848) * (i_4_ - i_5_) / (-1 + Class144_Sub4.anInt6848);
            }
            graphicstoolkit.aa(-16 + (i_1_ + Class360.screenWidth), i_2_ + i_6_, 12, i_5_, Class298.anInt3740 << 24 | 0x332277, 2);
            for (int i_7_ = Class118.anInt5406; Class118.anInt5406 + i_3_ > i_7_; i_7_++) {
                if (Class144_Sub4.anInt6848 <= i_7_) {
                    break;
                }
                String[] strings = Class106.method1120((byte) 46, Class210.aStringArray2502[i_7_], '\010');
                int i_8_ = (Class360.screenWidth - 8 - 16) / strings.length;
                for (int i_9_ = 0; strings.length > i_9_; i_9_++) {
                    int i_10_ = i_9_ * i_8_ + 8;
                    graphicstoolkit.KA(i_10_ + i_1_, i_2_, -8 + (i_10_ + i_1_ + i_8_), 350 + i_2_);
                    StandardSprite.aClass52_8945.method538(i_1_ + i_10_, -Class169_Sub3.aClass357_8820.anInt4442 + (-2 + i_2_ + (350 - Class347.anInt4282) - ((i_7_ - Class118.anInt5406) * Class91.anInt1227)), Class188_Sub2_Sub2.method1914(strings[i_9_], 42), -16777216, -1);
                }
            }
        }
        CacheNode_Sub18.aClass52_9609.method543((byte) -117, Class360.screenWidth + (i_1_ - 25), Settings.BUILD, -1, -16777216, i_2_ + 350 - 20);
        graphicstoolkit.KA(i_1_, i_2_, Class360.screenWidth + i_1_, 350 + i_2_);
        graphicstoolkit.method1242(i_2_ + 350 - Class347.anInt4282, -1, i_1_, Class360.screenWidth);
        Class262_Sub4.aClass52_7721.method538(i_1_ + 10, i_2_ - (-350 + Class262_Sub15_Sub1.aClass357_10524.anInt4442 + 1), "--> " + Class188_Sub2_Sub2.method1914(Node_Sub10.aString7081, 51), -16777216, -1);
        if (Class51.aBoolean5331) {
            int i_11_ = -1;
            if (Class174.clientCycle % 30 > 15) {
                i_11_ = 16777215;
            }
            graphicstoolkit.method1243(12, i_2_ + 350 - Class262_Sub15_Sub1.aClass357_10524.anInt4442 - 11, i_11_, Class262_Sub15_Sub1.aClass357_10524.method4033("--> " + Class188_Sub2_Sub2.method1914(Node_Sub10.aString7081, -118).substring(0, Class315.anInt4034)) + 10 + i_1_);
        }
    }
}
