/* Class93_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class93_Sub1 extends Class93 implements MouseListener, MouseMotionListener, MouseWheelListener {
    private int anInt6032;
    private Class312 aClass312_6033 = new Class312();
    private int anInt6034;
    private int anInt6035;
    private Class312 aClass312_6036 = new Class312();
    private int anInt6037;
    private int anInt6038;
    private int anInt6039;
    private boolean aBoolean6040;
    private Component aComponent6041;

    final int method1051(boolean bool) {
        if (bool != true) {
            anInt6034 = -13;
        }
        return anInt6035;
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        int i = method1055(mouseevent, (byte) 123);
        if ((anInt6037 & i ^ 0xffffffff) == -1) {
            i = anInt6037;
        }
        if (0 != (0x1 & i)) {
            method1052(mouseevent.getY(), mouseevent.getX(), 3, 0, mouseevent.getClickCount());
        }
        if (-1 != (0x4 & i ^ 0xffffffff)) {
            method1052(mouseevent.getY(), mouseevent.getX(), 5, 0, mouseevent.getClickCount());
        }
        if (0 != (i & 0x2)) {
            method1052(mouseevent.getY(), mouseevent.getX(), 4, 0, mouseevent.getClickCount());
        }
        anInt6037 &= i ^ 0xffffffff;
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    private final void method1052(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        Node_Sub5_Sub1 node_sub5_sub1 = new Node_Sub5_Sub1();
        node_sub5_sub1.anInt9406 = i_0_;
        node_sub5_sub1.anInt9404 = i_1_;
        node_sub5_sub1.anInt9403 = i;
        node_sub5_sub1.aLong9405 = Class313.method3650(false);
        if (i_2_ != 0) {
            method1056(-2);
        }
        node_sub5_sub1.anInt9407 = i_3_;
        aClass312_6036.method3625((byte) -54, node_sub5_sub1);
    }

    private final void method1053(boolean bool, int i, int i_4_) {
        anInt6039 = i_4_;
        if (bool) {
            method1038((byte) 17);
        }
        anInt6038 = i;
        if (aBoolean6040) {
            method1052(i, i_4_, -1, 0, 0);
        }
    }

    final Node_Sub5 method1048(byte b) {
        return (Node_Sub5) aClass312_6033.method3619(-83);
    }

    private final void method1054(int i, Component component) {
        if (i == -30273) {
            method1056(-89);
            aComponent6041 = component;
            aComponent6041.addMouseListener(this);
            aComponent6041.addMouseMotionListener(this);
            aComponent6041.addMouseWheelListener(this);
        }
    }

    private final int method1055(MouseEvent mouseevent, byte b) {
        if (mouseevent.getButton() == 1) {
            if (mouseevent.isMetaDown()) {
                return 4;
            }
            return 1;
        }
        if (mouseevent.getButton() == 2) {
            return 2;
        }
        if (mouseevent.getButton() == 3) {
            return 4;
        }
        return 0;
    }

    private final void method1056(int i) {
        if (aComponent6041 != null) {
            aComponent6041.removeMouseWheelListener(this);
            aComponent6041.removeMouseMotionListener(this);
            aComponent6041.removeMouseListener(this);
            if (i >= -2) {
                mouseDragged(null);
            }
            aClass312_6036 = null;
            anInt6032 = anInt6035 = anInt6034 = 0;
            aClass312_6033 = null;
            anInt6039 = anInt6038 = anInt6037 = 0;
            aComponent6041 = null;
        }
    }

    public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
        int i = mousewheelevent.getX();
        int i_5_ = mousewheelevent.getY();
        int i_6_ = mousewheelevent.getWheelRotation();
        method1052(i_5_, i, 6, 0, i_6_);
        if (mousewheelevent.isShiftDown())
            Class268.aShort3455 += 5 * mousewheelevent.getUnitsToScroll();
        if (Class268.aShort3455 > 600)
            Class268.aShort3455 = 600;
        if (Class268.aShort3455 < 80)
            Class268.aShort3455 = 80;
        mousewheelevent.consume();
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        method1053(false, mouseevent.getY(), mouseevent.getX());
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        method1053(false, mouseevent.getY(), mouseevent.getX());
    }

    final boolean method1039(int i) {
        if (i >= -43) {
            anInt6039 = -47;
        }
        return -1 != (anInt6034 & 0x1 ^ 0xffffffff);
    }

    final int method1050(byte b) {
        if (b >= -5) {
            aClass312_6033 = null;
        }
        return anInt6032;
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        int i = method1055(mouseevent, (byte) -79);
        if (-2 != (i ^ 0xffffffff)) {
            if ((i ^ 0xffffffff) != -5) {
                if (2 == i) {
                    method1052(mouseevent.getY(), mouseevent.getX(), 1, 0, mouseevent.getClickCount());
                }
            } else {
                method1052(mouseevent.getY(), mouseevent.getX(), 2, 0, mouseevent.getClickCount());
            }
        } else {
            method1052(mouseevent.getY(), mouseevent.getX(), 0, 0, mouseevent.getClickCount());
        }
        anInt6037 |= i;
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    final synchronized void method1038(byte b) {
        anInt6034 = anInt6037;
        anInt6032 = anInt6039;
        anInt6035 = anInt6038;
        if (b != 26) {
            mouseReleased(null);
        }
        Class312 class312 = aClass312_6033;
        aClass312_6033 = aClass312_6036;
        aClass312_6036 = class312;
        aClass312_6036.method3614(-601);
    }

    final boolean method1040(int i) {
        if (i >= -78) {
            aClass312_6036 = null;
        }
        return 0 != (0x4 & anInt6034);
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        method1053(false, mouseevent.getY(), mouseevent.getX());
    }

    final void method1045(int i) {
        if (i == 7) {
            method1056(-79);
        }
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        method1053(false, mouseevent.getY(), mouseevent.getX());
    }

    final boolean method1044(int i) {
        if (i <= 27) {
            method1055(null, (byte) -101);
        }
        return (anInt6034 & 0x2) != 0;
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    Class93_Sub1(Component component, boolean bool) {
        method1054(-30273, component);
        aBoolean6040 = bool;
    }
}
