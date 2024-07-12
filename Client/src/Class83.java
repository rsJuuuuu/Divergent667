/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83 implements Interface10 {
    private GLSprite aGLSprite5178;
    static int anInt5179 = 0;
    static int anInt5180 = 0;
    static int anInt5181;
    private final Class166 aClass166_5182;
    static int anInt5183;
    static int anInt5184;
    static int anInt5185;
    static String aString5186 = null;
    static int anInt5187;
    static int[] anIntArray5188;
    private final Index aClass302_5189;
    static int anInt5190;

    public static void method799() {
        aString5186 = null;
        anIntArray5188 = null;

    }

    public final void method27(boolean bool, int i) {
        if (bool) {
            int i_0_ = Math.max(Node_Sub38_Sub12.anInt10225, Class360.screenWidth);
            int i_1_ = Math.max(Class205.screenHeight, Class257.anInt3244);
            int i_2_ = aGLSprite5178.method1197();
            int i_3_ = aGLSprite5178.method1186();
            int i_4_ = 0;
            int i_5_ = i_0_;
            int i_6_ = i_0_ * i_3_ / i_2_;
            int i_7_ = (i_1_ - i_6_) / 2;
            if (i_6_ > i_1_) {
                i_5_ = i_2_ * i_1_ / i_3_;
                i_6_ = i_1_;
                i_7_ = 0;
                i_4_ = (i_0_ - i_5_) / 2;
            }
            aGLSprite5178.method1200(i_4_, i_7_, i_5_, i_6_);
        }
        anInt5187++;
    }

    static void method800() {
        anInt5190++;
        Class290_Sub4.method3430();
        Class274.method3325(Class213.aNode_Sub27_2512.aClass320_Sub17_7311.method3747() == 1, 120, 22050, 2);
        AnimableAnimator.aClass42_5498 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 0, 22050, Node_Sub38_Sub20.aCanvas10309);
        AnimableAnimator_Sub1.method256(Class32.method359(null));
        Packet.aClass42_9402 = Class262_Sub22.method3207(Class240.aSignLink2946, (byte) -27, 1, 2048, Node_Sub38_Sub20.aCanvas10309);
        Packet.aClass42_9402.method441(11757, Class176.aNode_Sub9_Sub3_2106);
    }

    Class83(Index class302, Class166 class166) {
        aClass302_5189 = class302;
        aClass166_5182 = class166;
    }

    public final void method26(int i) {
        if (i == 99) {
            anInt5185++;
            aGLSprite5178 = Node_Sub9_Sub4.method2523((byte) 113, aClass166_5182.anInt5093, aClass302_5189);
        }
    }

    static Class144_Sub1 method801(BufferedStream buffer) {
        anInt5184++;
        return new Class144_Sub1(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.read24BitInteger(), buffer.read24BitInteger(), buffer.readUnsignedByte());
    }

    public final boolean method25(int i) {
        anInt5181++;
        if (i != 421) {
            method27(false, 2);
        }
        return aClass302_5189.method3510(aClass166_5182.anInt5093);
    }
}
