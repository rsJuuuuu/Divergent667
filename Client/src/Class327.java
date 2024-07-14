/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class327 implements Interface16 {
    static int[] anIntArray5348 = new int[13];
    static int anInt5349;
    static int anInt5350;
    static int anInt5351;
    static int anInt5352;
    static int anInt5353;
    private final Class55 aClass55_5354;
    static int anInt5355;
    private GraphicsToolkit aGraphicsToolkit5356;
    private Interface10[] anInterface10Array5357;
    static int anInt5358;
    static int anInt5360;

    public final boolean method61(boolean bool, long l) {
        anInt5358++;
        return (long) aClass55_5354.anInt831 + l <= Class313.method3650();
    }

    static Class377_Sub1 method3823(int i_0_) {
        anInt5353++;
        if (!Mobile.aBoolean9118 || i_0_ < Mobile_Sub4.anInt10972 || Node_Sub9_Sub5.anInt9757 < i_0_) {
            return null;
        }
        return Class56.aClass377_Sub1Array841[-Mobile_Sub4.anInt10972 + i_0_];
    }

    public final int method60(int i) {
        anInt5349++;
        if (i < 25) {
            anIntArray5348 = null;
        }
        return aClass55_5354.anInt832;
    }

    public static void method3824() {

        anIntArray5348 = null;
    }

    public final void method62(int i) {
        if (aGraphicsToolkit5356 != Class93.aGraphicsToolkit1241) {
            aGraphicsToolkit5356 = Class93.aGraphicsToolkit1241;
        }
        anInt5355++;
        aGraphicsToolkit5356.GA(0);
        if (i == 1939) {
            Interface10[] interface10s = anInterface10Array5357;
            for (Interface10 interface10 : interface10s) {
                if (interface10 != null) {
                    interface10.method26(i - 1840);
                }
            }
        }
    }

    public final int method58(int i) {
        anInt5351++;
        int i_2_ = 0;
        Interface10[] interface10s = anInterface10Array5357;
        if (i != 27285) {
            anInterface10Array5357 = null;
        }
        for (Interface10 interface10 : interface10s) {
            if (interface10 == null || interface10.method25(421)) {
                i_2_++;
            }
        }
        return i_2_ * 100 / Objects.requireNonNull(anInterface10Array5357).length;
    }

    public final void method63() {
        anInt5352++;
        Interface10[] interface10s = anInterface10Array5357;
        for (Interface10 interface10 : interface10s) {
            if (interface10 != null) {
                interface10.method27(true);
            }
        }
    }

    Class327(Class55 class55, Class373 class373) {
        aClass55_5354 = class55;
        anInterface10Array5357 = new Interface10[aClass55_5354.anInterface7Array825.length];
        for (int i = 0; anInterface10Array5357.length > i; i++)
            anInterface10Array5357[i] = class373.method4105(aClass55_5354.anInterface7Array825[i]);
    }

    public final void method59(int i) {
        if (i != 6312) {
            anInterface10Array5357 = null;
        }
        anInt5350++;
    }

}
