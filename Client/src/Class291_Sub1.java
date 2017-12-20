/* Class291_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

public class Class291_Sub1 extends Class291 implements KeyListener, FocusListener {
    static int anInt8185;
    static int anInt8186;
    static int anInt8187;
    static boolean aBoolean8188 = false;
    static int anInt8189;
    static int anInt8190;
    static int anInt8191;
    static int anInt8192;
    static int[] anIntArray8193 = new int[8];
    static int anInt8194;
    static int anInt8195;
    static int anInt8196;
    private Class312 aClass312_8197 = new Class312();
    static Class13 aClass13_8198;
    static int anInt8199;
    static int anInt8200;
    static int anInt8201;
    static int anInt8202;
    private Class312 aClass312_8203 = new Class312();
    static int anInt8204;
    private Component aComponent8205;
    private boolean[] aBooleanArray8206 = new boolean[112];

    static final void method3454(int i, int i_0_, int i_1_, int i_2_) {
        anInt8196++;
        if ((Class368.anInt4550 ^ 0xffffffff) != (i_1_ ^ 0xffffffff) || (Class72.anInt973 ^ 0xffffffff) != (i ^ 0xffffffff) || i_0_ != Node_Sub29_Sub1.anInt10012) {
            Class194_Sub1.aBoolean6892 = true;
            Class72.anInt973 = i;
            Class368.anInt4550 = i_1_;
            if (i_2_ == 128) {
                Node_Sub29_Sub1.anInt10012 = i_0_;
                double d = -(3.141592653589793 * (double) (i_1_ * 2)) / 16384.0;
                double d_3_ = -((double) (2 * i) * 3.141592653589793) / 16384.0;
                double d_4_ = Math.cos(d_3_);
                double d_5_ = Math.sin(d_3_);
                double d_6_ = Math.cos(d);
                double d_7_ = Math.sin(d);
                Class363.aDouble4509 = d_4_;
                FileOnDisk.aDouble1318 = d_6_;
                Class326.aDouble4108 = -d_4_ * d_7_;
                Class195.aDouble2401 = d_5_;
                Animable_Sub2_Sub1.aDouble10631 = d_5_ * d_7_;
                Class282.aDouble3585 = d_4_ * d_6_;
                Class320_Sub6.aDouble8262 = d_6_ * -d_5_;
                SeekableFile.aDouble3883 = 0.0;
                Class165.aDouble2028 = d_7_;
            }
        }
    }

    private final int method3455(int i) {
        anInt8186++;
        int i_8_ = 0;
        if (aBooleanArray8206[81]) {
            i_8_ |= 0x1;
        }
        if (i != -17254) {
            method3453((byte) -94);
        }
        if (aBooleanArray8206[82]) {
            i_8_ |= 0x4;
        }
        if (aBooleanArray8206[86]) {
            i_8_ |= 0x2;
        }
        return i_8_;
    }

    private final void method3456(char c, int i, int i_9_, int i_10_) {
        anInt8190++;
        Node_Sub12 node_sub12 = new Node_Sub12();
        node_sub12.aChar5458 = c;
        node_sub12.anInt5454 = i_9_;
        if (i != 10830) {
            method3452((byte) 83);
        }
        node_sub12.anInt5463 = i_10_;
        node_sub12.aLong5461 = Class313.method3650(false);
        aClass312_8203.method3625((byte) -54, node_sub12);
    }

    public final void focusGained(FocusEvent focusevent) {
        anInt8204++;
    }

    final Interface21 method3449(int i) {
        if (i != -22959) {
            method3460((byte) 59);
        }
        anInt8189++;
        return (Interface21) aClass312_8197.method3619(i + 22869);
    }

    public final synchronized void keyReleased(KeyEvent keyevent) {
        anInt8195++;
        method3458((byte) -51, 1, keyevent);
    }

    final void method3453(byte b) {
        anInt8202++;
        method3460((byte) -20);
        if (b < 42) {
            aClass13_8198 = null;
        }
    }

    final synchronized void method3452(byte b) {
        if (b == 45) {
            aClass312_8197.method3614(-601);
            anInt8187++;
            for (Node_Sub12 node_sub12 = (Node_Sub12) aClass312_8203.method3619(b ^ ~0x5f); node_sub12 != null;
                 node_sub12 = (Node_Sub12) aClass312_8203.method3619(-79)) {
                node_sub12.anInt5462 = method3455(b ^ ~0x4348);
                if (node_sub12.anInt5463 != 0) {
                    if (node_sub12.anInt5463 != 1) {
                        if (node_sub12.anInt5463 != -1) {
                            if (node_sub12.anInt5463 == 3) {
                                aClass312_8197.method3625((byte) -54, node_sub12);
                            }
                        } else {
                            for (int i = 0; (i ^ 0xffffffff) > -113; i++) {
                                if (aBooleanArray8206[i]) {
                                    Node_Sub12 node_sub12_11_ = new Node_Sub12();
                                    node_sub12_11_.anInt5454 = i;
                                    node_sub12_11_.anInt5462 = node_sub12.anInt5462;
                                    node_sub12_11_.aChar5458 = '\0';
                                    node_sub12_11_.anInt5463 = 1;
                                    node_sub12_11_.aLong5461 = node_sub12.aLong5461;
                                    aClass312_8197.method3625((byte) -54, node_sub12_11_);
                                    aBooleanArray8206[i] = false;
                                }
                            }
                        }
                    } else if (aBooleanArray8206[node_sub12.anInt5454]) {
                        aClass312_8197.method3625((byte) -54, node_sub12);
                        aBooleanArray8206[node_sub12.anInt5454] = false;
                    }
                } else {
                    if (!aBooleanArray8206[node_sub12.anInt5454]) {
                        Node_Sub12 node_sub12_12_ = new Node_Sub12();
                        node_sub12_12_.aChar5458 = '\0';
                        node_sub12_12_.anInt5454 = node_sub12.anInt5454;
                        node_sub12_12_.anInt5463 = 0;
                        node_sub12_12_.anInt5462 = node_sub12.anInt5462;
                        node_sub12_12_.aLong5461 = node_sub12.aLong5461;
                        aClass312_8197.method3625((byte) -54, node_sub12_12_);
                        aBooleanArray8206[node_sub12.anInt5454] = true;
                    }
                    node_sub12.anInt5463 = 2;
                    aClass312_8197.method3625((byte) -54, node_sub12);
                }
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent keyevent) {

        int interfaceHash = -1;

        int spaceHash = -1, op1 = -1, op2 = -1, op3 = -1, op4 = -1, op5 = -1;

        if (Loader.openInterfaceId != -1) {
            switch (Loader.openInterfaceId) {
                case 210:
                    spaceHash = 13762562;
                    break;
                case 211:
                    spaceHash = 13828099;
                    break;
                case 213:
                    spaceHash = 13959173;
                    break;
                case 236:
                    op1 = 15466597;
                    op2 = 15466498;
                    break;
                case 235:
                    op1 = 15400962;
                    op2 = 15400963;
                    op3 = 15400964;
                    op4 = 15400965;
                    op5 = 15400966;
                    break;
                case 237:
                    op1 = 15532033;
                    op2 = 15532034;
                    op3 = 15532035;
                    op4 = 15532036;
                    break;
                case 238:
                    op1 = 15597569;
                    op2 = 15597570;
                    op3 = 15597571;
                    op4 = 15597572;
                    op5 = 15597573;
                    break;
                case 229:
                    op1 = 15007746;
                    op2 = 15007747;
                    break;
                case 231:
                    op1 = 15138818;
                    op2 = 15138819;
                    op3 = 15138820;
                    break;
                case 241:
                    spaceHash = 15794181;
                    break;
                case 242:
                    spaceHash = 15859718;
                    break;
                case 243:
                    spaceHash = 15925255;
                    break;
                case 244:
                    spaceHash = 15990792;
                default:
                    interfaceHash = -1;
            }
            switch (keyevent.getKeyCode()) {
                case KeyEvent.VK_SPACE:
                    if (spaceHash != -1)
                        interfaceHash = spaceHash;
                    break;
                case KeyEvent.VK_1:
                    if (op1 != -1)
                        interfaceHash = op1;
                    break;
                case KeyEvent.VK_2:
                    if (op2 != -1)
                        interfaceHash = op2;
                    break;
                case KeyEvent.VK_3:
                    if (op3 != -1)
                        interfaceHash = op3;
                    break;
                case KeyEvent.VK_4:
                    if (op4 != -1)
                        interfaceHash = op4;
                    break;
                case KeyEvent.VK_5:
                    if (op5 != -1)
                        interfaceHash = op5;
                    break;
            }
        }
        if (interfaceHash != -1) {
            Class257.sendDialogueContinuePacket(-1, true, interfaceHash);
            return;
        }
        anInt8191++;
        method3458((byte) -51, 0, keyevent);
    }

    public static void method3457(int i) {
        anIntArray8193 = null;
        if (i != 112) {
            aBoolean8188 = true;
        }
        aClass13_8198 = null;
    }

    private final void method3458(byte b, int i, KeyEvent keyevent) {
        anInt8194++;
        int i_13_ = keyevent.getKeyCode();
        if ((i_13_ ^ 0xffffffff) != -1) {
            if ((i_13_ ^ 0xffffffff) > -1 || (i_13_ ^ 0xffffffff) <= (Node_Sub38_Sub24.anIntArray10352.length ^ 0xffffffff)) {
                i_13_ = 0;
            } else {
                i_13_ = Node_Sub38_Sub24.anIntArray10352[i_13_];
                if ((i ^ 0xffffffff) == -1 && (0x80 & i_13_ ^ 0xffffffff) != -1) {
                    i_13_ = 0;
                } else {
                    i_13_ &= ~0x80;
                }
            }
        } else {
            i_13_ = 0;
        }
        if (i_13_ != 0) {
            if (b != -51) {
                aComponent8205 = null;
            }
            method3456('\0', 10830, i_13_, i);
            keyevent.consume();
        }
    }

    private final void method3459(int i, Component component) {
        anInt8192++;
        method3460((byte) -44);
        aComponent8205 = component;
        Method method = SignLink.aMethod4004;
        if (method != null) {
            try {
                method.invoke(aComponent8205, new Object[]{Boolean.FALSE});
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (i == 0) {
            aComponent8205.addKeyListener(this);
            aComponent8205.addFocusListener(this);
        }
    }

    private final void method3460(byte b) {
        anInt8200++;
        if (aComponent8205 != null) {
            aComponent8205.removeKeyListener(this);
            aComponent8205.removeFocusListener(this);
            aComponent8205 = null;
            if (b <= -12) {
                for (int i = 0; i < 112; i++)
                    aBooleanArray8206[i] = false;
                aClass312_8197.method3614(-601);
                aClass312_8203.method3614(-601);
            }
        }
    }

    public final synchronized void focusLost(FocusEvent focusevent) {
        anInt8185++;
        method3456('\0', 10830, 0, -1);
    }

    public final synchronized void keyTyped(KeyEvent keyevent) {
        anInt8199++;
        char c = keyevent.getKeyChar();
        if ((c ^ 0xffffffff) != -1 && Class106.method1121(-127, c)) {
            method3456(c, 10830, -1, 3);
            keyevent.consume();
        }
    }

    final boolean method3450(int i, int i_14_) {
        anInt8201++;
        @SuppressWarnings("unused")
        int i_15_ = -86 / ((i - 28) / 53);
        if (i_14_ < 0 || (i_14_ ^ 0xffffffff) <= -113) {
            return false;
        }
        return aBooleanArray8206[i_14_];
    }

    Class291_Sub1(Component component) {
        Class355.method4019(false);
        method3459(0, component);
    }
}
