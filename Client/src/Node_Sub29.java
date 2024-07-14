/* Node_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

abstract class Node_Sub29 extends Node {
    static int anInt7334;
    static int anInt7335;
    private final int anInt7336;
    static int anInt7337;
    static boolean aBoolean7338 = false;
    protected float aFloat7339;
    protected int anInt7340;
    private final int anInt7341;
    protected int anInt7342;
    static int anInt7343;
    static Frame aFrame7344;
    static int[] anIntArray7345 = {1, 2, 4, 8};
    protected int anInt7346;
    static IncommingPacket aClass192_7347 = new IncommingPacket(30, -2);
    static int anInt7348;
    static int anInt7349;
    static int anInt7350;

    final int method2704() {
        anInt7348++;
        return anInt7346;
    }

    final int method2705(int i) {
        anInt7350++;
        if (i != 32311) {
            anInt7342 = -86;
        }
        return anInt7342;
    }

    abstract void method2706(int i_0_, int i_1_, int i_2_);

    final float method2707() {
        anInt7335++;
        return aFloat7339;
    }

    final int method2708() {
        anInt7349++;
        return anInt7340;
    }

    static Class150_Sub3_Sub1 method2709(BufferedStream buffer) {
        anInt7334++;
        Class150_Sub3 class150_sub3 = Class380.method4169(buffer);
        int i = buffer.readShort();
        return new Class150_Sub3_Sub1(class150_sub3.aClass379_5079, class150_sub3.aClass77_5087, class150_sub3.anInt5092, class150_sub3.anInt5080, class150_sub3.anInt5086, class150_sub3.anInt5081, class150_sub3.anInt5084, class150_sub3.anInt5083, class150_sub3.anInt5090, class150_sub3.anInt8971, class150_sub3.anInt8974, class150_sub3.anInt8972, class150_sub3.anInt8968, class150_sub3.anInt8965, class150_sub3.anInt8964, i);
    }

    Node_Sub29(int i, int i_3_, int i_4_, int i_5_, int i_6_, float f) {
        anInt7336 = i_5_;
        anInt7341 = i_6_;
        aFloat7339 = f;
        anInt7342 = i;
        anInt7340 = i_4_;
        anInt7346 = i_3_;
    }

    final int method2710(byte b) {
        anInt7343++;

        return anInt7341;
    }

    final int method2711(int i) {
        anInt7337++;
        if (i <= 115) {
            method2705(6);
        }
        return anInt7336;
    }

    abstract void method2712(float f);

    public static void method2713() {
        anIntArray7345 = null;
        aClass192_7347 = null;
        aFrame7344 = null;
    }
}
