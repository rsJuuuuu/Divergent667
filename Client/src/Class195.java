/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

public class Class195 {
    protected int anInt2378;
    private int anInt2379;
    static Class299 aClass299_2380;
    protected byte aByte2381;
    private int anInt2382 = 0;
    static int anInt2383;
    private short[] aShortArray2384;
    private int anInt2385;
    private short[] aShortArray2386;
    static boolean[] aBooleanArray2387 = new boolean[100];
    private int anInt2388;
    private short[] aShortArray2389;
    private int anInt2390;
    static int anInt2391;
    protected Class101 aClass101_2392;
    static int anInt2393;
    protected int anInt2394;
    private short[] aShortArray2395;
    private int anInt2396;
    static int anInt2397;
    static int anInt2398;
    static int anInt2399;
    private int anInt2400;
    static double aDouble2401;
    protected boolean aBoolean2402;
    static int anInt2403;

    final void method1983(BufferedStream buffer, boolean bool) {
        anInt2391++;
        if (bool) {
            for (; ; ) {
                int i = buffer.readUnsignedByte();//buffer overflow causes crash on new anims
                if (i == 0) {
                    break;
                }
                method1987(i, buffer, 119);
            }
        }
    }

    public static void method1984(int i) {
        aBooleanArray2387 = null;
        aClass299_2380 = null;
        if (i != 4) {
            aDouble2401 = 0.28888875850567475;
        }
    }

    static final Node_Sub14 method1985(boolean bool) {
        anInt2383++;
        if (Class20.aClass312_331 == null || NpcDefinition.aClass157_2880 == null) {
            return null;
        }
        Node_Sub14 node_sub14 = (Node_Sub14) NpcDefinition.aClass157_2880.method1713((byte) -34);
        if (bool != true) {
            aDouble2401 = -1.1898770995463814;
        }
        for (/**/; node_sub14 != null; node_sub14 = (Node_Sub14) NpcDefinition.aClass157_2880.method1713((byte) -34)) {
            Class79 class79 = Class20.aClass215_322.method2069((byte) 116, node_sub14.anInt7128);
            if (class79 != null && class79.aBoolean1064 && class79.method784((byte) 117, Class20.anInterface17_317)) {
                return node_sub14;
            }
        }
        return null;
    }

    final DrawableModel method1986(byte b, boolean bool, int i, Animator animator, Plane plane, byte b_0_, int i_1_, Plane plane_2_, int i_3_, int i_4_, GraphicsToolkit graphicstoolkit) {
        anInt2399++;
        bool = bool & aByte2381 != 0;
        int i_5_ = i_3_;
        if (animator != null) {
            i_5_ |= animator.method237((byte) -126);
        }
        if (bool) {
            i_5_ = i_5_ | (aByte2381 == 3 ? 7 : 2);
        }
        if ((anInt2396 ^ 0xffffffff) != -129) {
            i_5_ |= 0x2;
        }
        if (anInt2400 != 128 || anInt2388 != 0) {
            i_5_ |= 0x5;
        }
        DrawableModel drawablemodel;
        synchronized (aClass101_2392.aClass61_1311) {
            drawablemodel = (DrawableModel) aClass101_2392.aClass61_1311.method607((long) (anInt2378 |=
                                                                                                   graphicstoolkit
																										   .anInt1537
                                                                                                   << 29), 0);
            @SuppressWarnings("unused") int i_6_ = -5 % ((56 - b_0_) / 35);
        }
        if (drawablemodel == null || graphicstoolkit.b(drawablemodel.ua(), i_5_) != 0) {
            if (drawablemodel != null) {
                i_5_ = graphicstoolkit.c(i_5_, drawablemodel.ua());
            }
            int i_7_ = i_5_;
            if (aShortArray2386 != null) {
                i_7_ |= 0x4000;
            }
            if (aShortArray2389 != null) {
                i_7_ |= 0x8000;
            }
            Model model = Renderer.method3448(anInt2379, 7, 0, aClass101_2392.aClass302_1310);
            if (model == null) {
                return null;
            }
            if (model.anInt2614 < 13) {
                model.method2081(2, 0);
            }
            drawablemodel = graphicstoolkit.a(model, i_7_, aClass101_2392.anInt1312, anInt2382 - -64, 850 + anInt2390);
            if (aShortArray2386 != null) {
                for (int i_8_ = 0; (aShortArray2386.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
                    drawablemodel.ia(aShortArray2386[i_8_], aShortArray2384[i_8_]);
            }
            if (aShortArray2389 != null) {
                for (int i_9_ = 0; i_9_ < aShortArray2389.length; i_9_++)
                    drawablemodel.aa(aShortArray2389[i_9_], aShortArray2395[i_9_]);
            }
            drawablemodel.s(i_5_);
            synchronized (aClass101_2392.aClass61_1311) {
                aClass101_2392.aClass61_1311.method601(drawablemodel, 25566, (long) (anInt2378 |=
                                                                                             graphicstoolkit.anInt1537
                                                                                             << 29));
            }
        }
        DrawableModel drawablemodel_10_ = drawablemodel.method633(b, i_5_, true);
        if (animator != null) {
            animator.method225(0, drawablemodel_10_, 0);
        }
        if ((anInt2400 ^ 0xffffffff) != -129 || anInt2396 != 128) {
            drawablemodel_10_.O(anInt2400, anInt2396, anInt2400);
        }
        if (anInt2388 != 0) {
            if ((anInt2388 ^ 0xffffffff) == -91) {
                drawablemodel_10_.a(4096);
            }
            if (anInt2388 == 180) {
                drawablemodel_10_.a(8192);
            }
            if ((anInt2388 ^ 0xffffffff) == -271) {
                drawablemodel_10_.a(12288);
            }
        }
        if (bool) {
            drawablemodel_10_.p(aByte2381, anInt2385, plane_2_, plane, i_1_, i_4_, i);
        }
        drawablemodel_10_.s(i_3_);
        return drawablemodel_10_;
    }

    private final void method1987(int i, BufferedStream buffer, int i_11_) {
        anInt2393++;
        if ((i ^ 0xffffffff) == -2) {
            anInt2379 = buffer.readBigSmart();
        } else if ((i ^ 0xffffffff) != -3) {
            if (i == 4) {
                anInt2400 = buffer.readUnsignedShort();
            } else if (i != 5) {
                if ((i ^ 0xffffffff) == -7) {
                    anInt2388 = buffer.readUnsignedShort();
                } else if (i == 7) {
                    anInt2382 = buffer.readUnsignedByte();
                } else if ((i ^ 0xffffffff) != -9) {
                    if (i == 9) {
                        aByte2381 = (byte) 3;
                        anInt2385 = 8224;
                    } else if (i != 10) {
                        if (i != 11) {
                            if (i != 12) {
                                if (i != 13) {
                                    if ((i ^ 0xffffffff) != -15) {
                                        if ((i ^ 0xffffffff) != -16) {
                                            if ((i ^ 0xffffffff) != -17) {
                                                if (i != 40) {
                                                    if ((i ^ 0xffffffff) == -42) {
                                                        int i_12_ = buffer.readUnsignedByte();
                                                        aShortArray2395 = new short[i_12_];
                                                        aShortArray2389 = new short[i_12_];
                                                        for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
                                                            aShortArray2389[i_13_] = (short) buffer.readUnsignedShort();
                                                            aShortArray2395[i_13_] = (short) buffer.readUnsignedShort();
                                                        }
                                                    }
                                                } else {
                                                    int i_14_ = buffer.readUnsignedByte();
                                                    aShortArray2384 = new short[i_14_];
                                                    aShortArray2386 = new short[i_14_];
                                                    for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
                                                        aShortArray2386[i_15_] = (short) buffer.readUnsignedShort();
                                                        aShortArray2384[i_15_] = (short) buffer.readUnsignedShort();
                                                    }
                                                }
                                            } else {
                                                aByte2381 = (byte) 3;
                                                anInt2385 = buffer.readInt();
                                            }
                                        } else {
                                            aByte2381 = (byte) 3;
                                            anInt2385 = buffer.readUnsignedShort();
                                        }
                                    } else {
                                        aByte2381 = (byte) 2;
                                        anInt2385 = 256 * buffer.readUnsignedByte();
                                    }
                                } else {
                                    aByte2381 = (byte) 5;
                                }
                            } else {
                                aByte2381 = (byte) 4;
                            }
                        } else {
                            aByte2381 = (byte) 1;
                        }
                    } else {
                        aBoolean2402 = true;
                    }
                } else {
                    anInt2390 = buffer.readUnsignedByte();
                }
            } else {
                anInt2396 = buffer.readUnsignedShort();
            }
        } else {
            anInt2394 = buffer.readBigSmart();
        }
    }

    static final void method1988(int i, float f, float f_17_, int i_18_, Class328 class328, byte[] bs, float f_19_,
								 int i_20_, byte b, float f_21_, int i_22_, int i_23_, int i_24_, float f_25_) {
        anInt2403++;
        int i_26_ = i * i_22_;
        if (b >= -53) {
            method1984(1);
        }
        float[] fs = new float[i_26_];
        for (int i_27_ = 0; i_23_ > i_27_; i_27_++) {
            int i_28_ = i_24_;
            class328.method3826(
                    f / (float) i,
                    127.0F * f_25_, i_22_, fs, 0,
                    f_21_ / (float) i_20_, i_18_, f_17_ / (float) i_22_, i_20_, (byte) 123, i);
            for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff); i_29_++) {
                bs[i_28_] += fs[i_29_];
                i_28_++;
            }
            f_17_ *= 2.0F;
            f *= 2.0F;
            f_21_ *= 2.0F;
            f_25_ *= f_19_;
        }
        int i_30_ = i_24_;
        for (int i_31_ = 0; i_26_ > i_31_; i_31_++) {
            bs[i_30_] = (byte) (127 + bs[i_30_]);
            i_30_++;
        }
    }

    final DrawableModel method1989(Animator animator, byte b, int i, byte b_32_, GraphicsToolkit graphicstoolkit) {
        if (b_32_ != 87) {
            return null;
        }
        anInt2398++;
        return method1986(b, false, 0, animator, null, (byte) 126, 0, null, i, 0, graphicstoolkit);
    }

    static final void login(byte b) {
        anInt2397++;
        if (Node_Sub38_Sub8.anInt10163 != 0 && Node_Sub38_Sub8.anInt10163 != 10) {
            if (b <= 55) {
                aBooleanArray2387 = null;
            }
            try {
                int i;
                if (Class45.anInt5264 == 0) {
                    i = 250;
                } else {
                    i = 2000;
                }
                if ((Class159.loginType ^ 0xffffffff) != -3
                    || Node_Sub38_Sub8.anInt10163 != 20 && (Class339_Sub2.anInt8653 ^ 0xffffffff) != -43) {
                    Class262_Sub12.anInt7791++;
                }
                if (FixedAnimator.aBoolean5503 && (Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) <= -7) {
                    i = 6000;
                }
                if ((i ^ 0xffffffff) > (Class262_Sub12.anInt7791 ^ 0xffffffff)) {
                    Class320_Sub23.aClass123_8432.method1513(-28176);
                    if (Class45.anInt5264 >= 3) {
                        Node_Sub38_Sub8.anInt10163 = 0;
                        Animable_Sub2.method836(-5, true);
                        return;
                    }
                    if ((Class159.loginType ^ 0xffffffff) != -3) {
                        Node_Sub15_Sub13.aClass197_9871.method1997(17418);
                    } else {
                        Class181.aClass197_2155.method1997(17418);
                    }
                    Node_Sub38_Sub8.anInt10163 = 1;
                    Class262_Sub12.anInt7791 = 0;
                    Class45.anInt5264++;
                }
                if (Node_Sub38_Sub8.anInt10163 == 1) {
                    if ((Class159.loginType ^ 0xffffffff) != -3) {
                        Class320_Sub23.aClass123_8432.aClass241_1565 = Node_Sub15_Sub13.aClass197_9871.method2000(
                        		(byte) -38, Class240.aSignLink2946);
                    } else {
                        Class320_Sub23.aClass123_8432.aClass241_1565 = Class181.aClass197_2155.method2000((byte)
								-103, Class240.aSignLink2946);
                    }
                    Node_Sub38_Sub8.anInt10163 = 2;
                }
                if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -3) {
                    if ((Class320_Sub23.aClass123_8432.aClass241_1565.anInt2953 ^ 0xffffffff) == -3) {
                        throw new IOException();
                    }
                    if ((Class320_Sub23.aClass123_8432.aClass241_1565.anInt2953 ^ 0xffffffff) != -2) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557 = CacheNode_Sub6.method2311((Socket)
							Class320_Sub23.aClass123_8432.aClass241_1565.anObject2956, 15000, (byte) 118);
                    Class320_Sub23.aClass123_8432.aClass241_1565 = null;
                    Class320_Sub23.aClass123_8432.method1511((byte) 47);
                    Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660(0);
                    if (FixedAnimator.aBoolean5503) {
                        node_sub13.aPacket7113.writeByte(Plane.aClass133_3420.packetId);
                        node_sub13.aPacket7113.writeShort(0);
                        int i_33_ = node_sub13.aPacket7113.offset;
                        node_sub13.aPacket7113.writeInt(667);
                        if ((Class159.loginType ^ 0xffffffff) == -3) {
                            node_sub13.aPacket7113.writeByte(Class151.anInt1843 != 14 ? 0 : 1);
                        }
                        BufferedStream buffer = Class300.getBufferWithIsaacKeys(3);
                        buffer.writeByte(Class336_Sub2.anInt8586);
                        buffer.writeShort((int) (Math.random() * 9.9999999E7));
                        buffer.writeByte(Class35.language);
                        buffer.writeInt(Class170.anInt2056);
                        for (int i_34_ = 0; i_34_ < 6; i_34_++)
                            buffer.writeInt((int) (9.9999999E7 * Math.random()));
                        buffer.writeLong(CacheNode_Sub15.aLong9588);
                        buffer.writeByte(Class209.aClass353_2483.anInt4344);
                        buffer.writeByte((int) (9.9999999E7 * Math.random()));
                        // buffer.applyRsa(0, Class203.LOGIN_RSA_MODULO,
                        // Class262_Sub10.LOGIN_RSA_EXPONENT);
                        node_sub13.aPacket7113.writeBytes(buffer.offset, buffer.buffer, 0);
                        node_sub13.aPacket7113.method2194(node_sub13.aPacket7113.offset - i_33_, -2887);
                    } else {
                        node_sub13.aPacket7113.writeByte(Plane.aClass133_3406.packetId);
                    }
                    Class320_Sub23.aClass123_8432.sendPacket(126, node_sub13);
                    Class320_Sub23.aClass123_8432.method1512((byte) -89);
                    Node_Sub38_Sub8.anInt10163 = 3;
                }
                if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -4) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 59)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -66,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                    int connectResponse = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                    if (connectResponse != 0) {
                        Node_Sub38_Sub8.anInt10163 = 0;
                        Animable_Sub2.method836(connectResponse, true);
                        Class320_Sub23.aClass123_8432.method1513(-28176);
                        Class297.method3479((byte) -119);
                        return;
                    }
                    if (!FixedAnimator.aBoolean5503) {
                        Node_Sub38_Sub8.anInt10163 = 8;
                    } else {
                        Node_Sub38_Sub8.anInt10163 = 4;
                    }
                }
                if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -5) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(2, 106)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -94,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer, 2, 0);
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                    Class320_Sub23.aClass123_8432.aPacket1570.offset =
							Class320_Sub23.aClass123_8432.aPacket1570.readUnsignedShort();
                    Node_Sub38_Sub8.anInt10163 = 5;
                }
                if (Node_Sub38_Sub8.anInt10163 == 5) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068
							(Class320_Sub23.aClass123_8432.aPacket1570.offset, 43)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -127,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer,
							Class320_Sub23.aClass123_8432.aPacket1570.offset, 0);
                    Class320_Sub23.aClass123_8432.aPacket1570.method2192(Class121.isaacKeys, 98);
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                    String string = Class320_Sub23.aClass123_8432.aPacket1570.method2180((byte) -73);
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                    String string_36_ = "opensn";
                    if (!Animable_Sub2_Sub1.aBoolean10628 ||
                        (Class188_Sub2_Sub1.method1910((byte) 84, Class240.aSignLink2946, string, string_36_, 1)
								 .anInt2953
                         ^ 0xffffffff) == -3) {
                        Class140.method1610(0, string, string_36_, Class240.aSignLink2946,
                                (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791(false) ^ 0xffffffff)
                                == -2, true);
                    }
                    Node_Sub38_Sub8.anInt10163 = 6;
                }
                if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -7) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 82)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -106,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                    if ((Class320_Sub23.aClass123_8432.aPacket1570.buffer[0] & 0xff ^ 0xffffffff) == -2) {
                        Node_Sub38_Sub8.anInt10163 = 7;
                    }
                }
                if (Node_Sub38_Sub8.anInt10163 == 7) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(16, 30)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -97,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer, 16, 0);
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 16;
                    Class320_Sub23.aClass123_8432.aPacket1570.method2192(Class121.isaacKeys, 127);
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                    Class243.username = Class188_Sub1_Sub1.aString9327 = Class154.method1699
							(Class320_Sub23.aClass123_8432.aPacket1570.readLong(), 25589);
                    Class188_Sub1_Sub2.aLong9342 = Class320_Sub23.aClass123_8432.aPacket1570.readLong();
                    Node_Sub38_Sub8.anInt10163 = 8;
                }
                if (Node_Sub38_Sub8.anInt10163 == 8) {
                    Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                    Class320_Sub23.aClass123_8432.method1511((byte) 74);
                    Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660(0);
                    Packet packet = node_sub13.aPacket7113;
                    if (Class159.loginType == 2) { // world login
                        Class133 class133;
                        if (!FixedAnimator.aBoolean5503) { // packet 16, world connection
                            class133 = Plane.aClass133_3411;
                        } else { // packet 30, social network
                            class133 = Plane.aClass133_3421;
                        }
                        packet.writeByte(class133.packetId);
                        packet.writeShort(0); //reserved for packet size
                        int i_37_ = packet.offset;
                        int i_38_ = packet.offset;
                        if (!FixedAnimator.aBoolean5503) { //not social network
                            packet.writeInt(667);
                            packet.writeInt(Settings.SUB_BUILD);
                            packet.writeByte((~Class151.anInt1843) == -15 ? 1 : 0);
                            i_38_ = packet.offset;
                            BufferedStream buffer = CacheNode_Sub17.getPasswordAsStream((byte) 27);
                            packet.writeBytes(buffer.offset, buffer.buffer, 0);
                            i_38_ = packet.offset;
                            packet.writeString(Class243.username);
                        }
                        packet.writeByte(Node_Sub38_Sub23.anInt10347);
                        packet.writeByte(Class188_Sub2_Sub1.getDisplayMode(3));
                        packet.writeShort(Class360.screenWidth);
                        packet.writeShort(Class205.screenHeight);
                        packet.writeByte(Class213.aNode_Sub27_2512.aClass320_Sub13_7283.method3734(false));
                        EntityNode_Sub3.method941(24, packet);
                        packet.writeString(Class83.aString5186); // settings
                        packet.writeInt(Class170.anInt2056); // affid
                        BufferedStream buffer = Class213.aNode_Sub27_2512.method2696(11665);
                        packet.writeByte(buffer.offset);
                        packet.writeBytes(buffer.offset, buffer.buffer, 0);
                        Class269.aBoolean3472 = true;
                        BufferedStream buffer_39_ = new BufferedStream(Node_Sub23.aNode_Sub39_7201.method2923((byte)
								66));
                        Node_Sub23.aNode_Sub39_7201.method2920(buffer_39_, -19819);
                        packet.writeBytes(buffer_39_.buffer.length, buffer_39_.buffer, 0);
                        packet.writeInt(Class175.anInt2097);
                        packet.writeLong(Node_Sub32.aLong7385);
                        packet.writeByte(Node_Sub38_Sub18.aString10283 != null ? 1 : 0);
                        if (Node_Sub38_Sub18.aString10283 != null) {
                            packet.writeString(Node_Sub38_Sub18.aString10283);
                        }
                        packet.writeByte(Class262_Sub5.method3163("jagtheora", false) ? 1 : 0);
                        packet.writeByte(Animable_Sub2_Sub1.aBoolean10628 ? 1 : 0);
                        packet.writeByte(!Node_Sub32.aBoolean7379 ? 0 : 1);
                        Class339_Sub2.method3928(67, packet);
                        packet.encryptXteas(Class121.isaacKeys, i_38_, false, packet.offset);
                        packet.method2194(packet.offset - i_37_, -2887);
                    } else {
                        Class133 class133;
                        if (!FixedAnimator.aBoolean5503) {
                            class133 = Plane.aClass133_3413;
                        } else {
                            class133 = Plane.aClass133_3421;
                        }
                        packet.writeByte(class133.packetId);
                        packet.writeShort(0);
                        int i_40_ = packet.offset;
                        int i_41_ = packet.offset;
                        if (!FixedAnimator.aBoolean5503) {
                            packet.writeInt(667);
                            BufferedStream buffer = CacheNode_Sub17.getPasswordAsStream((byte) 27);
                            packet.writeBytes(buffer.offset, buffer.buffer, 0);
                            i_41_ = packet.offset;
                            packet.writeString(Class243.username);
                        }
                        packet.writeByte(Class209.aClass353_2483.anInt4344); // game,
                        // 0
                        // =
                        // runescape
                        packet.writeByte(Class35.language); // language
                        EntityNode_Sub3.method941(24, packet);
                        packet.writeString(Class83.aString5186);
                        packet.writeInt(Class170.anInt2056);
                        Class339_Sub2.method3928(-101, packet);
                        packet.encryptXteas(Class121.isaacKeys, i_41_, false, packet.offset);
                        packet.method2194(-i_40_ + packet.offset, -2887);
                    }
                    Class320_Sub23.aClass123_8432.sendPacket(126, node_sub13);
                    Class320_Sub23.aClass123_8432.method1512((byte) -89);
                    Class320_Sub23.aClass123_8432.anIsaacCipher1571 = new IsaacCipher(Class121.isaacKeys);
                    for (int i_42_ = 0; i_42_ < 4; i_42_++)
                        Class121.isaacKeys[i_42_] += 50;
                    Class320_Sub23.aClass123_8432.aPacket1570.method2259(Class121.isaacKeys, (byte) -20);
                    Class121.isaacKeys = null;
                    Node_Sub38_Sub8.anInt10163 = 9;
                }
                if (Node_Sub38_Sub8.anInt10163 == 9) {
                    if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 121)) {
                        return;
                    }
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -97,
							Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                    int opcode = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                    if ((opcode ^ 0xffffffff) != -22) {
                        if (opcode != 29 && (opcode ^ 0xffffffff) != -46) {
                            if ((opcode ^ 0xffffffff) != -2) {
                                if (opcode != 2) {
                                    if ((opcode ^ 0xffffffff) == -16) {
                                        Node_Sub38_Sub8.anInt10163 = 19;
                                        Class320_Sub23.aClass123_8432.anInt1581 = -2;
                                    } else {
                                        if (opcode == 23 && Class45.anInt5264 < 3) {
                                            Class262_Sub12.anInt7791 = 0;
                                            Node_Sub38_Sub8.anInt10163 = 1;
                                            Class45.anInt5264++;
                                            Class320_Sub23.aClass123_8432.aClass365_1557.method4062(-2);
                                            Class320_Sub23.aClass123_8432.aClass365_1557 = null;
                                        } else {
                                            if ((opcode ^ 0xffffffff) == -43) {
                                                Node_Sub38_Sub8.anInt10163 = 20;
                                                Animable_Sub2.method836(opcode, true);
                                            } else {
                                                if (!Class296.aBoolean5428 || FixedAnimator.aBoolean5503
                                                    || (Class336_Sub2.anInt8586 ^ 0xffffffff) == 0 || opcode != 35) {
                                                    Node_Sub38_Sub8.anInt10163 = 0;
                                                    Animable_Sub2.method836(opcode, true);
                                                    Class320_Sub23.aClass123_8432.aClass365_1557.method4062(-2);
                                                    Class320_Sub23.aClass123_8432.aClass365_1557 = null;
                                                    Class297.method3479((byte) -119);
                                                } else {
                                                    FixedAnimator.aBoolean5503 = true;
                                                    Node_Sub38_Sub8.anInt10163 = 1;
                                                    Class262_Sub12.anInt7791 = 0;
                                                    Class320_Sub23.aClass123_8432.aClass365_1557.method4062(-2);
                                                    Class320_Sub23.aClass123_8432.aClass365_1557 = null;
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    Node_Sub38_Sub8.anInt10163 = 13;
                                }
                            } else {
                                Node_Sub38_Sub8.anInt10163 = 10;
                                Animable_Sub2.method836(opcode, true);
                                return;
                            }
                        } else {
                            Node_Sub38_Sub8.anInt10163 = 18;
                            Node_Sub7.anInt7063 = opcode;
                        }
                    } else {
                        Node_Sub38_Sub8.anInt10163 = 12;
                    }
                }
                if (Node_Sub38_Sub8.anInt10163 == 11) {
                    Class320_Sub23.aClass123_8432.method1511((byte) 105);
                    Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660(0);
                    Packet packet = node_sub13.aPacket7113;
                    packet.method2266(Class320_Sub23.aClass123_8432.anIsaacCipher1571, -47);
                    packet.method2262(1, Plane.aClass133_3417.packetId);
                    Class320_Sub23.aClass123_8432.sendPacket(127, node_sub13);
                    Class320_Sub23.aClass123_8432.method1512((byte) -89);
                    Node_Sub38_Sub8.anInt10163 = 9;
                } else if (Node_Sub38_Sub8.anInt10163 == 12) {
                    if (Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 66)) {
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -116,
								Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                        int i_44_ = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                        Node_Sub38_Sub8.anInt10163 = 0;
                        FileOnDisk.anInt1326 = i_44_ * 50;
                        Animable_Sub2.method836(21, true);
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4062(-2);
                        Class320_Sub23.aClass123_8432.aClass365_1557 = null;
                        Class297.method3479((byte) -119);
                    }
                } else if (Node_Sub38_Sub8.anInt10163 == 20) {
                    if (Class320_Sub23.aClass123_8432.aClass365_1557.method4068(2, 30)) {
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -70,
								Class320_Sub23.aClass123_8432.aPacket1570.buffer, 2, 0);
                        Node_Sub15_Sub13.anInt9874 = (Class320_Sub23.aClass123_8432.aPacket1570.buffer[1] & 0xff) + (
                                (Class320_Sub23.aClass123_8432.aPacket1570.buffer[0] & 0xff) << 8);
                        Node_Sub38_Sub8.anInt10163 = 9;
                    }
                } else if (Node_Sub38_Sub8.anInt10163 == 18) {
                    if (Node_Sub7.anInt7063 != 29) {
                        if ((Node_Sub7.anInt7063 ^ 0xffffffff) != -46) {
                            throw new IllegalStateException(
                                    "Login step 18 not valid for pendingResponse=" + Node_Sub7.anInt7063);
                        }
                        if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(3, 27)) {
                            return;
                        }
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -75,
								Class320_Sub23.aClass123_8432.aPacket1570.buffer, 3, 0);
                        Class187.anInt2276 = (Class320_Sub23.aClass123_8432.aPacket1570.buffer[2] & 0xff) + (
                                (0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[1]) << 8);
                        GameStub.anInt45 = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                    } else {
                        if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 76)) {
                            return;
                        }
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -66,
								Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                        GameStub.anInt45 = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                    }
                    Node_Sub38_Sub8.anInt10163 = 0;
                    Animable_Sub2.method836(Node_Sub7.anInt7063, true);
                    Class320_Sub23.aClass123_8432.aClass365_1557.method4062(-2);
                    Class320_Sub23.aClass123_8432.aClass365_1557 = null;
                    Class297.method3479((byte) -119);
                } else if ((Node_Sub38_Sub8.anInt10163 ^ 0xffffffff) == -14) {
                    if (Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 71)) {
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -127,
								Class320_Sub23.aClass123_8432.aPacket1570.buffer, 1, 0);
                        Node_Sub8.anInt7070 = 0xff & Class320_Sub23.aClass123_8432.aPacket1570.buffer[0];
                        Node_Sub38_Sub8.anInt10163 = 14;
                    }
                } else {
                    if (Node_Sub38_Sub8.anInt10163 == 14) {
                        Packet packet = Class320_Sub23.aClass123_8432.aPacket1570;
                        if (Class159.loginType != 2) {
                            if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(Node_Sub8.anInt7070, 39)) {
                                return;
                            }
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -82, packet.buffer,
									Node_Sub8.anInt7070, 0);
                            packet.offset = 0;
                            Class339_Sub7.rights = packet.readUnsignedByte();
                            Class25.anInt452 = packet.readUnsignedByte();
                            Node_Sub38_Sub18.aBoolean10282 = packet.readUnsignedByte() == 1;
                            Class24.aBoolean436 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            ProducingGraphicsBuffer.aBoolean9900 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Node_Sub32.aLong7382 = packet.readLong();
                            Node_Sub8.aLong7068 =
                                    Node_Sub32.aLong7382 + -Class313.method3650(false) - packet.method2241(-65);
                            int i_45_ = packet.readUnsignedByte();
                            Class64.aBoolean5046 = (0x1 & i_45_ ^ 0xffffffff) != -1;
                            Class229.aBoolean2725 = (0x2 & i_45_ ^ 0xffffffff) != -1;
                            Node_Sub33.anInt7402 = packet.readInt();
                            Class364.aBoolean4512 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Class270_Sub1.anInt8030 = packet.readInt();
                            Node_Sub38_Sub35.anInt10454 = packet.readUnsignedShort();
                            Class254.anInt3209 = packet.readUnsignedShort();
                            Class170.anInt2052 = packet.readUnsignedShort();
                            Class209.anInt2490 = packet.readInt();
                            Class237.aClass241_2904 = Class240.aSignLink2946.method3632((byte) -78, Class209.anInt2490);
                            Class144_Sub2.anInt6812 = packet.readUnsignedByte();
                            Class333.anInt4149 = packet.readUnsignedShort();
                            Class342.anInt4234 = packet.readUnsignedShort();
                            Class225.aBoolean2676 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Class295.myPlayer.username = Class295.myPlayer.displayName = Node_Sub40.myPlayerDisplayName = packet.method2180((byte) -55);
                            Node_Sub38_Sub29.anInt10409 = packet.readUnsignedByte();
                            Class236.anInt2902 = packet.readInt();
                            Class312.aBoolean3960 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Class262_Sub23.aClass197_7884 = new Class197();
                            Class262_Sub23.aClass197_7884.id = packet.readUnsignedShort();
                            if ((Class262_Sub23.aClass197_7884.id ^ 0xffffffff) == -65536) {
                                Class262_Sub23.aClass197_7884.id = -1;
                            }
                            Class262_Sub23.aClass197_7884.ipadress = packet.method2180((byte) 124);
                            if (Class240.aClass329_2943 != Node_Sub38_Sub1.aClass329_10086) {
                                Class262_Sub23.aClass197_7884.firstPort = Settings.PORT_ID;// 40000
                                // -
                                // -Class262_Sub23.aClass197_7884.npcId;
                                Class262_Sub23.aClass197_7884.secondPort = 50000 - -Class262_Sub23.aClass197_7884.id;
                            }
                            if (CacheNode_Sub2.aClass329_9436 != Node_Sub38_Sub1.aClass329_10086 && (
                                    Node_Sub38_Sub1.aClass329_10086 != Class379.aClass329_4873
                                    || (Class339_Sub7.rights ^ 0xffffffff) > -3)
                                && Class181.aClass197_2155.method2002(-129, Class320_Sub24.aClass197_8443)) {
                                EntityNode.method802(2126);
                            }
                        } else { // normal world login
                            if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(Node_Sub8.anInt7070, 63)) {
                                return;
                            }
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -84, packet.buffer, Node_Sub8.anInt7070, 0);
                            packet.offset = 0;
                            Class339_Sub7.rights = packet.readUnsignedByte();
                            Class25.anInt452 = packet.readUnsignedByte();
                            Node_Sub38_Sub18.aBoolean10282 = packet.readUnsignedByte() == 1;
                            Class24.aBoolean436 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            ProducingGraphicsBuffer.aBoolean9900 = packet.readUnsignedByte() == 1;
                            Class290_Sub11.aBoolean8175 = packet.readUnsignedByte() == 1;
                            Class166.myPlayerIndex = packet.readUnsignedShort();
                            Class64.aBoolean5046 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Class56.anInt837 = packet.read24BitInteger((byte) 94);
                            Class101.aBoolean1313 = (packet.readUnsignedByte() ^ 0xffffffff) == -2;
                            Node_Sub32.aString7378 = packet.readString();
                            Class186.aClass112_2256.method1141(Class101.aBoolean1313, 32648);
                            EntityNode_Sub3_Sub1.aClass86_9166.method1009((byte) 80, Class101.aBoolean1313);
                            Class366.aClass279_4526.method3374((byte) -50, Class101.aBoolean1313);
                        }
                        if (Node_Sub38_Sub18.aBoolean10282 && !ProducingGraphicsBuffer.aBoolean9900
                            || Class64.aBoolean5046) {
                            try {
                                Class2.method167("zap", Class96.anApplet1270, (byte) -110);
                            } catch (Throwable throwable) {
                                if (Class163.aBoolean2021) {
                                    try {
//										Class96.anApplet1270.getAppletContext().showDocument(new URL("http://matrixforum.webatu.com/"), "showthread.php?tid=2");
                                    } catch (Exception exception) {
										/* empty */
                                    }
                                }
                            }
                        } else {
                            try {
                                Class2.method167("unzap", Class96.anApplet1270, (byte) -125);
                            } catch (Throwable throwable) {
								/* empty */
                            }
                        }
                        if (Node_Sub38_Sub1.aClass329_10086 == Class240.aClass329_2943) {
                            try {
                                Class2.method167("loggedin", Class96.anApplet1270, (byte) -122);
                            } catch (Throwable throwable) {
								/* empty */
                            }
                        }
                        if (Class159.loginType != 2) {
                            Node_Sub38_Sub8.anInt10163 = 0;
                            Animable_Sub2.method836(2, true);
                            Node_Sub19.method2611(false);
                            Class48.method478(7, (byte) 102);
                            Class320_Sub23.aClass123_8432.incomming_packet = null;
                            return;
                        }
                        Node_Sub38_Sub8.anInt10163 = 16;
                    }
                    if (Node_Sub38_Sub8.anInt10163 == 16) {
                        if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(3, 68)) {
                            return;
                        }
                        Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -73, Class320_Sub23.aClass123_8432.aPacket1570.buffer, 3, 0);
                        Node_Sub38_Sub8.anInt10163 = 17;
                    }
                    if (Node_Sub38_Sub8.anInt10163 == 17) {
                        Packet packet = Class320_Sub23.aClass123_8432.aPacket1570;
                        packet.offset = 0;
                        if (packet.method2257(true)) {
                            if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(1, 116)) {
                                return;
                            }
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -102, packet.buffer, 1, 3);
                        }
                        Class320_Sub23.aClass123_8432.incomming_packet = Class310.method3596((byte) -59)[packet.readPacket()];
                        Class320_Sub23.aClass123_8432.anInt1581 = packet.readUnsignedShort();
                        Node_Sub38_Sub8.anInt10163 = 15;
                    }
                    if (Node_Sub38_Sub8.anInt10163 == 15) {
                        if (Class320_Sub23.aClass123_8432.aClass365_1557.method4068(Class320_Sub23.aClass123_8432.anInt1581, 63)) {
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -86, Class320_Sub23.aClass123_8432.aPacket1570.buffer, Class320_Sub23.aClass123_8432.anInt1581, 0);
                            Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                            int i_46_ = Class320_Sub23.aClass123_8432.anInt1581;
                            Node_Sub38_Sub8.anInt10163 = 0;
                            Animable_Sub2.method836(2, true);
                            Class320_Sub11.method3724(0);
                            Class97.decodeLswp(Class320_Sub23.aClass123_8432.aPacket1570);
                            Player.anInt11178 = -1;
                            if (Class320_Sub23.aClass123_8432.incomming_packet != Class156.aClass192_1962) {
                                Node_Sub38_Sub20.decodeReceivedMapRegions(-105);
                            } else {
                                Class251.decodeReceivedDynamicMapRegions(false);
                            }
                            if (Class320_Sub23.aClass123_8432.aPacket1570.offset != i_46_) {
                                throw new RuntimeException(
                                        "lswp pos:" + Class320_Sub23.aClass123_8432.aPacket1570.offset + " psize:"
                                        + i_46_);
                            }
                            Class320_Sub23.aClass123_8432.incomming_packet = null;
                        }
                    } else if (Node_Sub38_Sub8.anInt10163 == 19) {
                        if (Class320_Sub23.aClass123_8432.anInt1581 == -2) {
                            if (!Class320_Sub23.aClass123_8432.aClass365_1557.method4068(2, 19)) {
                                return;
                            }
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -91, Class320_Sub23.aClass123_8432.aPacket1570.buffer, 2, 0);
                            Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                            Class320_Sub23.aClass123_8432.anInt1581 = Class320_Sub23.aClass123_8432.aPacket1570.readUnsignedShort();
                        }
                        if (Class320_Sub23.aClass123_8432.aClass365_1557.method4068(Class320_Sub23.aClass123_8432.anInt1581, 47)) {
                            Class320_Sub23.aClass123_8432.aClass365_1557.method4065((byte) -54, Class320_Sub23.aClass123_8432.aPacket1570.buffer, Class320_Sub23.aClass123_8432.anInt1581, 0);
                            Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
                            Node_Sub38_Sub8.anInt10163 = 0;
                            int i_47_ = Class320_Sub23.aClass123_8432.anInt1581;
                            Animable_Sub2.method836(15, true);
                            Node_Sub8.method2424(0);
                            Class97.decodeLswp(Class320_Sub23.aClass123_8432.aPacket1570);
                            if (i_47_ != Class320_Sub23.aClass123_8432.aPacket1570.offset) {
                                throw new RuntimeException(
                                        "lswpr pos:" + Class320_Sub23.aClass123_8432.aPacket1570.offset + " psize:"
                                        + i_47_);
                            }
                            Class320_Sub23.aClass123_8432.incomming_packet = null;
                        }
                    }
                }
            } catch (IOException ioexception) {
                Class320_Sub23.aClass123_8432.method1513(-28176);
                if (Class45.anInt5264 < 3) {
                    if ((Class159.loginType ^ 0xffffffff) == -3) {
                        Class181.aClass197_2155.method1997(17418);
                    } else {
                        Node_Sub15_Sub13.aClass197_9871.method1997(17418);
                    }
                    Node_Sub38_Sub8.anInt10163 = 1;
                    Class45.anInt5264++;
                    Class262_Sub12.anInt7791 = 0;
                } else {
                    Node_Sub38_Sub8.anInt10163 = 0;
                    Animable_Sub2.method836(-4, true);
                    Class297.method3479((byte) -119);
                }
            }
        }
    }

    public Class195() {
        aByte2381 = (byte) 0;
        anInt2388 = 0;
        anInt2394 = -1;
        anInt2390 = 0;
        anInt2400 = 128;
        anInt2396 = 128;
        anInt2385 = -1;
        aBoolean2402 = false;
    }
}
