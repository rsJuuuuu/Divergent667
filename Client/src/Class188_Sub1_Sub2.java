/* Class188_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.net.URL;
import java.util.Objects;

public class Class188_Sub1_Sub2 extends Class188_Sub1 {
    private byte[] aByteArray9340;
    static int anInt9341;
    static long aLong9342 = 0L;
    static int anInt9343;
    static int anInt9344;
    static int[] anIntArray9345;
    static float aFloat9346;
    static int anInt9347;
    static int anInt9348;
    static int anInt9349;

    static void method1897(int[][] is) {
        anInt9343++;
        Class169_Sub4.anIntArrayArray8826 = is;
    }

    public Class188_Sub1_Sub2() {
        super();
    }

    final byte[] method1898() {
        anInt9347++;
        aByteArray9340 = new byte[524288];
        this.method1884();
        return aByteArray9340;
    }

    static boolean method1899(int i, String string) {
        anInt9341++;
        if (Class240.aSignLink2946.aBoolean4005) {
            Class181.aClass197_2155 = new Class197();
            Class181.aClass197_2155.id = i;
            Class181.aClass197_2155.ipadress = string;
            if (Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943) {
                Class181.aClass197_2155.firstPort = Settings.PORT_ID;//40000 + Class181.aClass197_2155.npcId;
                Class181.aClass197_2155.secondPort = 50000 + Class181.aClass197_2155.id;
            }
            for (int i_3_ = 0; Class180.aClass377_Sub1Array2143.length > i_3_; i_3_++) {
                if (Class180.aClass377_Sub1Array2143[i_3_].anInt8777 == i) {
                    Class380.anInt4877 = Class180.aClass377_Sub1Array2143[i_3_].anInt4673;
                }
            }
            return true;
        }
        String string_4_ = "";
        if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
            string_4_ = ":" + (i + 7000);
        }
        String string_5_ = "";
        if (Class83.aString5186 != null) {
            string_5_ = "/p=" + Class83.aString5186;
        }
        String string_6_ = "http://" + string.replace("runescape", Settings.SERVER_NAME) + string_4_ + "/l=" + Class35.language + "/a=" + Class170.anInt2056 + string_5_ + "/j" + (Animable_Sub2_Sub1.aBoolean10628 ? "1" : "0") + ",o" + (Node_Sub38_Sub21.aBoolean10320 ? "1" : "0") + ",a2";
        try {
            Objects.requireNonNull(Class158.aClient1983.getAppletContext()).showDocument(new URL(string_6_), "_self");
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    static void method1900() throws Exception_Sub1 {
        if (Class320_Sub20.anInt8397 == 1) {
            Class44.aGraphicsToolkit668.e(Node_Sub38_Sub1.anInt10075, Class166.anInt5100);
        } else {
            Class44.aGraphicsToolkit668.e(0, 0);
        }
        anInt9349++;
    }

    final void method1891(int i, byte b) {
        anInt9344++;
        int i_8_ = i * 2;
        int i_9_ = b & 0xff;
        aByteArray9340[i_8_++] = (byte) (i_9_ * 3 >> 5);
        aByteArray9340[i_8_] = (byte) (i_9_ * 3 >> 5);
    }

    static void method1901(String string, int i_10_) {
        anInt9348++;
        Node_Sub38_Sub12.anInt10230++;
        Class123 class123 = Class262_Sub23.method3213((byte) -114);
        Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class229.aClass318_2731, Objects.requireNonNull(class123).anIsaacCipher1571);
        Objects.requireNonNull(node_sub13).aPacket7113.writeByte(1 + Class126.method1536(string));
        node_sub13.aPacket7113.writeString(string);
        node_sub13.aPacket7113.writeByteC(i_10_);
        class123.sendPacket(node_sub13);

    }

    public static void method1902() {
        anIntArray9345 = null;
    }
}
