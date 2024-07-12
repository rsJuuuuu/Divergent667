/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

public class Class45 implements Interface12 {
    static int anInt5263;
    static int anInt5264 = 0;
    static short[][] aShortArrayArray5265;
    private final String aString5266;
    private boolean aBoolean5267;
    static int anInt5268;
    static int anInt5269;
    static int anInt5270 = 0;
    static int anInt5271;
    static int anInt5272;

    public final int method35(int i) {
        anInt5263++;
        if (aBoolean5267) {
            return 100;
        }
        int i_0_ = Class37.method401(aString5266);
        if (i > -4) {
            method35(54);
        }
        if (i_0_ >= 0 && i_0_ <= 100) {
            return i_0_;
        }
        aBoolean5267 = true;
        return 100;
    }

    static void method462(byte b, Player player) {
        anInt5268++;
        Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1518(3512, player.index);
        if (node_sub47 != null) {
            if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
                Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
                node_sub47.aNode_Sub9_Sub2_7568 = null;
            }
            node_sub47.method2160((byte) 66);
        }
    }

    public static void method463() {
        aShortArrayArray5265 = null;
    }

    Class45(String string) {
        aString5266 = string;
    }

    final boolean method464() {
        anInt5272++;
        return aBoolean5267;
    }

    public final Class172 method34(byte b) {
        anInt5271++;
        return Class172.aClass172_2080;
    }

    static void method465() {
        anInt5269++;
        if (Class4.anInt124 != 0) {
            try {
                if (++Class51_Sub2.anInt9069 > 2000) {
                    Class218.aClass123_2560.method1513();
                    if (Node_Sub54.anInt7683 >= 2) {
                        Class4.anInt124 = 0;
                        Node_Sub36_Sub4.anInt10073 = -5;
                        return;
                    }
                    Node_Sub15_Sub13.aClass197_9871.method1997();
                    Class4.anInt124 = 1;
                    Class51_Sub2.anInt9069 = 0;
                    Node_Sub54.anInt7683++;
                }
                if (Class4.anInt124 == 1) {
                    Class218.aClass123_2560.aClass241_1565 = Node_Sub15_Sub13.aClass197_9871.method2000((byte) -30, Class240.aSignLink2946);
                    Class4.anInt124 = 2;
                }
                if (Class4.anInt124 == 2) {
                    if (Class218.aClass123_2560.aClass241_1565.anInt2953 == 2) {
                        throw new IOException();
                    }
                    if (Class218.aClass123_2560.aClass241_1565.anInt2953 != 1) {
                        return;
                    }
                    Class218.aClass123_2560.aClass365_1557 = CacheNode_Sub6.method2311((Socket) Class218.aClass123_2560.aClass241_1565.anObject2956, (byte) -87);
                    Class218.aClass123_2560.aClass241_1565 = null;
                    Class218.aClass123_2560.method1512();
                    Class4.anInt124 = 4;
                }
                if (Class4.anInt124 == 4) {
                    if (Class218.aClass123_2560.aClass365_1557.method4068(1, 50)) {
                        Class218.aClass123_2560.aClass365_1557.method4065((byte) -78, Class218.aClass123_2560.aPacket1570.buffer, 1, 0);
                        int i = 0xff & Class218.aClass123_2560.aPacket1570.buffer[0];
                        Class4.anInt124 = 0;
                        Node_Sub36_Sub4.anInt10073 = i;
                        Class218.aClass123_2560.method1513();
                    }
                }
            } catch (IOException ioexception) {
                Class218.aClass123_2560.method1513();
                if (Node_Sub54.anInt7683 < 2) {
                    Node_Sub15_Sub13.aClass197_9871.method1997();
                    Node_Sub54.anInt7683++;
                    Class51_Sub2.anInt9069 = 0;
                    Class4.anInt124 = 1;
                } else {
                    Class4.anInt124 = 0;
                    Node_Sub36_Sub4.anInt10073 = -4;
                }
            }
        }
    }
}
