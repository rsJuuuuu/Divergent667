/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Calendar;
import java.util.Date;

abstract class Class93 {
    static float[] aFloatArray1238 = new float[16384];
    static int anInt1239;
    static int anInt1240;
    static GraphicsToolkit aGraphicsToolkit1241;
    static float[] aFloatArray1242 = new float[16384];
    static int anInt1243;
    static byte[][] aByteArrayArray1244;
    static int anInt1245;
    static int anInt1246;

    abstract void method1038();

    abstract boolean method1039(int i);

    abstract boolean method1040(int i);

    final boolean method1041() {
        anInt1243++;
        return !(!method1039(-82) && !method1044(29) && !method1040(-95));
    }

    public static void method1042() {
        aFloatArray1238 = null;
        aByteArrayArray1244 = null;
        aGraphicsToolkit1241 = null;
        aFloatArray1242 = null;
    }

    static String method1043(long l) {
        Class247.aCalendar3144.setTime(new Date(l));
        anInt1246++;
        Class247.aCalendar3144.get(Calendar.DAY_OF_WEEK);
        int i_1_ = Class247.aCalendar3144.get(Calendar.DATE);
        Class247.aCalendar3144.get(Calendar.MONTH);
        int i_3_ = Class247.aCalendar3144.get(Calendar.YEAR);
        int i_4_ = Class247.aCalendar3144.get(Calendar.HOUR_OF_DAY);
        int i_5_ = Class247.aCalendar3144.get(Calendar.MINUTE);
        int i_6_ = Class247.aCalendar3144.get(Calendar.SECOND);
        return ", " + i_1_ / 10 + i_1_ % 10 + "-" + i_3_ + " " + i_4_ / 10 + i_4_ % 10 + ":" + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10 + " GMT";
    }

    public Class93() {
        /* empty */
    }

    abstract boolean method1044(int i);

    abstract void method1045();

    static byte[] method1046(byte[] bs) {
        anInt1245++;
        int i_7_ = bs.length;
        byte[] bs_8_ = new byte[i_7_];
        Class311.method3608(bs, 0, bs_8_, 0, i_7_);
        return bs_8_;
    }

    static Node_Sub2 method1047(int i, int i_9_, int i_10_, boolean bool) {
        anInt1239++;
        Node_Sub2 node_sub2 = new Node_Sub2();
        Loader.openInterfaceId = i_9_;
        node_sub2.interfaceId = i_9_;
        node_sub2.cliped = i;
        Class289.aHashTable3630.method1515(i_10_, node_sub2, -126);
        Node_Sub11.method2543(i_9_);
        IComponentDefinitions widget = Class76.method771(i_10_);
        if (widget != null) {
            ClientScript.method2321(widget);
        }
        if (Node_Sub25_Sub3.aWidget9990 != null) {
            ClientScript.method2321(Node_Sub25_Sub3.aWidget9990);
            Node_Sub25_Sub3.aWidget9990 = null;
        }
        Node_Sub8.method2423();
        if (widget != null) {
            Class270_Sub1.method3300(widget, !bool);
        }
        if (!bool) {
            ClientScriptsExecutor.parseIComponentScript(i_9_);
        }
        if (!bool && Class320_Sub15.WINDOWS_PANE_ID != -1) {
            Class76.method770(1, Class320_Sub15.WINDOWS_PANE_ID);
        }
        return node_sub2;
    }

    abstract Node_Sub5 method1048();

    static void method1049(int[] is, int i, int[] is_12_, int i_13_) {
        if (i_13_ < i) {
            int i_15_ = (i + i_13_) / 2;
            int i_16_ = i_13_;
            int i_17_ = is[i_15_];
            is[i_15_] = is[i];
            is[i] = i_17_;
            int i_18_ = is_12_[i_15_];
            is_12_[i_15_] = is_12_[i];
            is_12_[i] = i_18_;
            int i_19_ = i_17_ == 2147483647 ? 0 : 1;
            for (int i_20_ = i_13_; i_20_ < i; i_20_++) {
                if ((i_19_ & i_20_) + i_17_ > is[i_20_]) {
                    int i_21_ = is[i_20_];
                    is[i_20_] = is[i_16_];
                    is[i_16_] = i_21_;
                    int i_22_ = is_12_[i_20_];
                    is_12_[i_20_] = is_12_[i_16_];
                    is_12_[i_16_++] = i_22_;
                }
            }
            is[i] = is[i_16_];
            is[i_16_] = i_17_;
            is_12_[i] = is_12_[i_16_];
            is_12_[i_16_] = i_18_;
            method1049(is, i_16_ - 1, is_12_, i_13_);
            method1049(is, i, is_12_, 1 + i_16_);
        }
        anInt1240++;
    }

    abstract int method1050();

    abstract int method1051();

    static {
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray1238[i] = (float) Math.sin(d * (double) i);
            aFloatArray1242[i] = (float) Math.cos(d * (double) i);
        }
    }
}
