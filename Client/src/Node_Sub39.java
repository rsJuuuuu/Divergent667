/* Node_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.hardware_info.HardwareInfo;

public class Node_Sub39 extends Node {
    private int anInt7468;
    private String aString7469;
    private int anInt7470;
    static int anInt7471;
    static int anInt7472;
    static int anInt7473;
    protected int anInt7474;
    private boolean aBoolean7475;
    private String aString7476;
    private int anInt7477;
    private int anInt7478;
    static int anInt7479;
    protected int anInt7480;
    static int anInt7481;
    private int anInt7482;
    private String aString7483;
    protected int anInt7484;
    private int anInt7485;
    static OutcommingPacket aClass318_7486 = new OutcommingPacket(44, -1);
    private String aString7487;
    private int anInt7488;
    private boolean aBoolean7489;
    private int anInt7490;
    private int anInt7491;
    private int anInt7492;
    static Class151 aClass151_7493;
    static int[] routeFinderXArray = new int[4096];
    private int anInt7495;
    private int anInt7496;
    static Class369[] aClass369Array7497;
    static int anInt7498;

    private void method2918() {
        if (aString7487.length() > 40) {
            aString7487 = aString7487.substring(0, 40);
        }
        anInt7481++;
        if (aString7476.length() > 40) {
            aString7476 = aString7476.substring(0, 40);
        }
        if (aString7483.length() > 10) {
            aString7483 = aString7483.substring(0, 10);
        }
        if (aString7469.length() > 10) {
            aString7469 = aString7469.substring(0, 10);
        }
    }

    public static void method2919() {
        aClass369Array7497 = null;
        routeFinderXArray = null;

        aClass151_7493 = null;
        aClass318_7486 = null;
    }

    final void method2920(BufferedStream buffer) {
        buffer.writeByte(5);
        anInt7479++;
        buffer.writeByte(anInt7485);
        buffer.writeByte(!aBoolean7475 ? 0 : 1);
        buffer.writeByte(anInt7488);
        buffer.writeByte(anInt7496);
        buffer.writeByte(anInt7474);
        buffer.writeByte(anInt7470);
        buffer.writeByte(anInt7480);
        buffer.writeByte(!aBoolean7489 ? 0 : 1);
        buffer.writeShort(anInt7490);
        buffer.writeByte(anInt7482);
        buffer.write24BitInt((byte) 95, anInt7484);
        buffer.writeShort(anInt7477);
        buffer.writeByte(anInt7478);
        buffer.writeByte(anInt7491);
        buffer.writeByte(anInt7468);
        buffer.writeJagString(aString7487);
        buffer.writeJagString(aString7476);
        buffer.writeJagString(aString7483);
        buffer.writeJagString(aString7469);
        buffer.writeByte(anInt7492);
        buffer.writeShort(anInt7495);
    }

    static void method2921(boolean bool, int i, int i_1_, IComponentDefinitions widget) {
        anInt7471++;
        int i_2_ = widget.anInt4809;
        int i_3_ = widget.anInt4695;
        if (widget.aByte4750 == 0) {
            widget.anInt4809 = widget.anInt4693;
        } else if (widget.aByte4750 == 1) {
            widget.anInt4809 = -widget.anInt4693 + i_1_;
        } else if (widget.aByte4750 == 2) {
            widget.anInt4809 = widget.anInt4693 * i_1_ >> 14;
        }
        if (widget.aByte4741 == 0) {
            widget.anInt4695 = widget.anInt4722;
        } else if (widget.aByte4741 == 1) {
            widget.anInt4695 = -widget.anInt4722 + i;
        } else if (widget.aByte4741 == 2) {
            widget.anInt4695 = i * widget.anInt4722 >> 14;
        }
        if (widget.aByte4750 == 4) {
            widget.anInt4809 = widget.anInt4792 * widget.anInt4695 / widget.anInt4700;
        }
        if (widget.aByte4741 == 4) {
            widget.anInt4695 = widget.anInt4809 * widget.anInt4700 / widget.anInt4792;
        }
        if (Class54.aBoolean817 && (Client.method113(widget).settingsHash != 0 || widget.type == 0)) {
            if (widget.anInt4695 < 5 && widget.anInt4809 < 5) {
                widget.anInt4695 = 5;
                widget.anInt4809 = 5;
            } else {
                if (widget.anInt4809 <= 0) {
                    widget.anInt4809 = 5;
                }
                if (widget.anInt4695 <= 0) {
                    widget.anInt4695 = 5;
                }
            }
        }
        if (widget.anInt4814 == Class200_Sub1.anInt5146) {
            Class324.aWidget4085 = widget;
        }
        if (bool && widget.anObjectArray4777 != null && (widget.anInt4809 != i_2_ || i_3_ != widget.anInt4695)) {
            Node_Sub37 node_sub37 = new Node_Sub37();
            node_sub37.parameters = widget.anObjectArray4777;
            node_sub37.aWidget7437 = widget;
            Class275.aClass312_5419.method3625(node_sub37);
        }
    }

    static void method2922() {
        anInt7473++;
        for (Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1516(); node_sub3 != null; node_sub3 = (Node_Sub3) Class56.aHashTable839.method1520(71)) {
            if (node_sub3.aBoolean6949) {
                node_sub3.aBoolean6949 = false;
            } else {
                Renderer.method3446(node_sub3.anInt6947);
            }
        }
    }

    final int method2923() {
        anInt7472++;
        int i = 23;
        i += Node_Sub15_Sub12.method2583(aString7487, (byte) 65);
        i += Node_Sub15_Sub12.method2583(aString7476, (byte) 103);
        i += Node_Sub15_Sub12.method2583(aString7483, (byte) 108);
        i += Node_Sub15_Sub12.method2583(aString7469, (byte) 106);
        return i;
    }

    public Node_Sub39() {
        /* empty */
    }

    Node_Sub39(SignLink signlink) {
        if (SignLink.aString3981.startsWith("win")) {
            anInt7485 = 1;
        } else if (SignLink.aString3981.startsWith("mac")) {
            anInt7485 = 2;
        } else if (SignLink.aString3981.startsWith("linux")) {
            anInt7485 = 3;
        } else {
            anInt7485 = 4;
        }
        aBoolean7475 = !(!SignLink.aString3984.startsWith("amd64") && !SignLink.aString3984.startsWith("x86_64"));
        if (anInt7485 == 1) {
            if (SignLink.aString3982.contains("4.0")) {
                anInt7488 = 1;
            } else if (SignLink.aString3982.contains("4.1")) {
                anInt7488 = 2;
            } else {
                if (SignLink.aString3982.contains("4.9")) {
                    anInt7488 = 3;
                } else {
                    if (SignLink.aString3982.contains("5.0")) {
                        anInt7488 = 4;
                    } else {
                        if (SignLink.aString3982.contains("5.1")) {
                            anInt7488 = 5;
                        } else if (SignLink.aString3982.contains("6.0")) {
                            anInt7488 = 6;
                        } else if (SignLink.aString3982.contains("6.1")) {
                            anInt7488 = 7;
                        }
                    }
                }
            }
        } else if (anInt7485 == 2) {
            if (SignLink.aString3982.contains("10.4")) {
                anInt7488 = 20;
            } else if (SignLink.aString3982.contains("10.5")) {
                anInt7488 = 21;
            } else if (SignLink.aString3982.contains("10.6")) {
                anInt7488 = 22;
            } else {
                if (SignLink.aString3982.contains("10.7")) {
                    anInt7488 = 23;
                }
            }
        }
        if (SignLink.aString3989.toLowerCase().contains("sun")) {
            anInt7496 = 1;
        } else {
            if (SignLink.aString3989.toLowerCase().contains("microsoft")) {
                anInt7496 = 2;
            } else {
                if (SignLink.aString3989.toLowerCase().contains("apple")) {
                    anInt7496 = 3;
                } else {
                    anInt7496 = 4;
                }
            }
        }
        int i = 2;
        int i_4_ = 0;
        try {
            for (/**/; i < SignLink.aString3995.length(); i++) {
                int i_5_ = SignLink.aString3995.charAt(i);
                if (i_5_ < 48 || i_5_ > 57) {
                    break;
                }
                i_4_ = 10 * i_4_ + i_5_ - 48;
            }
        } catch (Exception exception) {
            /* empty */
        }
        anInt7474 = i_4_;
        i = SignLink.aString3995.indexOf('.', 2) + 1;
        i_4_ = 0;
        try {
            while (i < SignLink.aString3995.length()) {
                int i_6_ = SignLink.aString3995.charAt(i);
                if (i_6_ < 48 || i_6_ > 57) {
                    break;
                }
                i++;
                i_4_ = i_6_ - 48 + i_4_ * 10;
            }
        } catch (Exception exception) {
            /* empty */
        }
        anInt7470 = i_4_;
        i_4_ = 0;
        i = SignLink.aString3995.indexOf('_', 4) + 1;
        try {
            for (/**/; SignLink.aString3995.length() > i; i++) {
                int i_7_ = SignLink.aString3995.charAt(i);
                if (i_7_ < 48 || i_7_ > 57) {
                    break;
                }
                i_4_ = 10 * i_4_ + i_7_ - 48;
            }
        } catch (Exception exception) {
            /* empty */
        }
        anInt7480 = i_4_;
        if (anInt7474 > 3) {
            anInt7482 = Class263.anInt3336;
        } else {
            anInt7482 = 0;
        }
        anInt7490 = Class201.anInt2446;
        aBoolean7489 = !signlink.aBoolean4005;
        try {
            int[] is = HardwareInfo.getCPUInfo();
            if (is != null && is.length == 7) {
                anInt7477 = is[2];
                anInt7468 = is[5];
                anInt7484 = is[6];
                anInt7491 = is[4];
                anInt7478 = is[3];
            }
        } catch (Throwable throwable) {
            anInt7484 = 0;
        }
        aString7469 = "";
        aString7487 = "";
        aString7476 = "";
        aString7483 = "";
        method2918();
    }

    static {
        aClass151_7493 = new Class151(10, 2, 2, 0);
        anInt7498 = 2;
    }
}
