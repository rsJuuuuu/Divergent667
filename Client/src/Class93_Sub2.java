/* Class93_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class93_Sub2 extends Class93 implements MouseListener, MouseMotionListener {
    static int anInt6042;
    static int anInt6043;
    static int anInt6044;
    static int anInt6045;
    static int anInt6046;
    private Class312 aClass312_6047 = new Class312();
    static int anInt6048;
    static Index aClass302_6049;
    static int anInt6050;
    static int anInt6051;
    static int anInt6052;
    static int anInt6053;
    static int anInt6054;
    static int anInt6055;
    static int anInt6056;
    private int anInt6057;
    private int anInt6058;
    static int anInt6059;
    static int anInt6060;
    static int anInt6061;
    static int anInt6062;
    static int anInt6063;
    static int anInt6064;
    private int anInt6065;
    static int anInt6066;
    static int anInt6067 = 0;
    static int anInt6068;
    private Class312 aClass312_6069 = new Class312();
    private int anInt6070;
    private int anInt6071;
    private int anInt6072;
    private Component aComponent6073;
    private final boolean aBoolean6074;

    private void method1057(int i, int i_0_, int i_1_, int i_2_) {
        anInt6053++;
        Node_Sub5_Sub2 node_sub5_sub2 = new Node_Sub5_Sub2();
        node_sub5_sub2.anInt9419 = i_1_;
        node_sub5_sub2.anInt9408 = i_2_;
        node_sub5_sub2.anInt9414 = i_0_;
        node_sub5_sub2.anInt9411 = i;
        node_sub5_sub2.aLong9415 = Class313.method3650();
        aClass312_6069.method3625(node_sub5_sub2);
    }

    final boolean method1039(int i) {
        anInt6044++;
        if (i > -43) {
            return false;
        }
        return (0x1 & anInt6065) != 0;
    }

    final boolean method1040(int i) {
        anInt6052++;
        if (i >= -78) {
            method1048((byte) 60);
        }
        return (anInt6065 & 0x4) != 0;
    }

    private int method1058(MouseEvent mouseevent) {
        anInt6060++;
        int i_4_ = mouseevent.getModifiers();
        boolean bool = (i_4_ & 0x10) != 0;
        boolean bool_5_ = (i_4_ & 0x8) != 0;
        boolean bool_6_ = (0x4 & i_4_) != 0;
        if (bool_5_ && (bool || bool_6_)) {
            bool_5_ = false;
        }
        if (bool && bool_6_) {
            return 4;
        }
        if (bool) {
            return 1;
        }
        if (bool_5_) {
            return 2;
        }
        if (bool_6_) {
            return 4;
        }
        return 0;
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        anInt6046++;
        method1062(mouseevent.getX(), mouseevent.getY());
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        method1062(mouseevent.getX(), mouseevent.getY());
        anInt6063++;
    }

    private void method1059(Component component) {
        anInt6055++;
        method1060();
        aComponent6073 = component;
        aComponent6073.addMouseListener(this);
        aComponent6073.addMouseMotionListener(this);
    }

    private void method1060() {
        anInt6050++;
        if (aComponent6073 != null) {
            aComponent6073.removeMouseMotionListener(this);
            aComponent6073.removeMouseListener(this);
            aComponent6073 = null;
            aClass312_6069 = null;
            aClass312_6047 = null;
            anInt6057 = anInt6058 = anInt6065 = 0;
            anInt6071 = anInt6070 = anInt6072 = 0;
        }
    }

    static void method1061(GraphicsToolkit graphicstoolkit) {
        if (Class213.aBoolean2510) {
            Class230_Sub1.method2133(graphicstoolkit);
        } else {
            Class295.method3470(graphicstoolkit);
        }
        anInt6064++;
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        method1062(mouseevent.getX(), mouseevent.getY());
        anInt6051++;
    }

    final void method1045() {
        anInt6059++;
        method1060();
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        anInt6045++;
        int i = method1058(mouseevent);
        if (i == 1) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 0, mouseevent.getY());
        } else if (i == 4) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 2, mouseevent.getY());
        } else if (i == 2) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 1, mouseevent.getY());
        }
        anInt6072 |= i;
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    final int method1050(byte b) {
        anInt6061++;
        if (b >= -5) {
            mouseEntered(null);
        }
        return anInt6057;
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        anInt6048++;
        method1062(mouseevent.getX(), mouseevent.getY());
    }

    final boolean method1044(int i) {
        if (i <= 27) {
            mouseClicked(null);
        }
        anInt6066++;
        return (anInt6065 & 0x2) != 0;
    }

    private void method1062(int i, int i_8_) {
        anInt6070 = i_8_;
        anInt6056++;
        anInt6071 = i;
        if (aBoolean6074) {
            method1057(i, 0, -1, i_8_);
        }
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
        anInt6054++;
    }

    final Node_Sub5 method1048(byte b) {
        anInt6062++;
        return (Node_Sub5) aClass312_6047.method3619(-119);
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        anInt6043++;
        int i = method1058(mouseevent);
        if ((i & anInt6072) == 0) {
            i = anInt6072;
        }
        if ((0x1 & i) != 0) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 3, mouseevent.getY());
        }
        if ((0x4 & i) != 0) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 5, mouseevent.getY());
        }
        if ((0x2 & i) != 0) {
            method1057(mouseevent.getX(), mouseevent.getClickCount(), 4, mouseevent.getY());
        }
        anInt6072 &= ~i;
        if (mouseevent.isPopupTrigger()) {
            mouseevent.consume();
        }
    }

    final int method1051() {
        anInt6068++;
        return anInt6058;
    }

    public static void method1063() {
        aClass302_6049 = null;
    }

    final synchronized void method1038() {
        anInt6065 = anInt6072;
        anInt6042++;
        anInt6058 = anInt6070;
        anInt6057 = anInt6071;
        Class312 class312 = aClass312_6047;
        aClass312_6047 = aClass312_6069;
        aClass312_6069 = class312;
        aClass312_6069.method3614();
    }

    Class93_Sub2(Component component) {
        method1059(component);
        aBoolean6074 = true;
    }
}
