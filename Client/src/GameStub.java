
/* GameStub - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Objects;

public abstract class GameStub extends Applet implements Runnable, FocusListener, WindowListener {
    private static final long serialVersionUID = -871407385667172354L;
    static int anInt6;
    static int anInt7;
    static int anInt8;
    static int anInt9;
    static int anInt10;
    static Class94 aClass94_11 = new Class94();
    static int anInt12;
    static int anInt13;
    static int anInt14;
    static int anInt15;
    static int anInt16;
    static int anInt17;
    static int anInt18;
    static int anInt19;
    static int anInt20;
    static int anInt21;
    static int anInt22;
    static int anInt23;
    static int anInt24;
    static int anInt25;
    static int anInt26;
    static int anInt27;
    static int anInt28;
    static int anInt29;
    static int anInt30;
    static int anInt31;
    static int anInt32;
    static int anInt33;
    static int anInt34;
    static int anInt35;
    static int anInt36;
    static int anInt37;
    private boolean aBoolean38;
    static float[] aFloatArray39;
    static int anInt40;
    static int anInt41;
    static float[] aFloatArray42 = new float[16384];
    static int anInt43;
    static int[] anIntArray44;
    static int anInt45 = -1;
    static int anInt46;
    private boolean aBoolean47 = false;
    static int anInt48;
    static int anInt49;
    public static int anInt50;
    public static boolean aBoolean51;
    public static boolean aBoolean52;
    public static boolean aBoolean53;
    public static boolean aBoolean54;
    public static boolean aBoolean55;
    public static boolean aBoolean56;
    public static int anInt57;
    public static boolean aBoolean58;
    public static boolean aBoolean59;
    public static boolean aBoolean60;
    public static int anInt61;
    public static boolean aBoolean62;
    public static int anInt63;
    public static int anInt64;
    public static boolean aBoolean65;
    public static int anInt66;
    public static int anInt67;

    static void method83(int i) {
        anInt12++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 9, i);
        cachenode_sub2.method2291();
    }

    private void method84() {
        anInt26++;
        synchronized (this) {
            if (Class137.aBoolean1715) {
                return;
            }
            Class137.aBoolean1715 = true;
        }
        //System.out.println("Shutdown start - clean:" + bool);
        if (Class96.anApplet1270 != null) {
            Class96.anApplet1270.destroy();
        }
        try {
            method85();
        } catch (Exception exception) {
            /* empty */
        }
        if (aBoolean47) {
            try {
                jagmisc.quit();
            } catch (Throwable throwable) {
                /* empty */
            }
            aBoolean47 = false;
        }
        Class164.method1742();
        Class377_Sub1.method4128();
        if (Node_Sub38_Sub20.aCanvas10309 != null) {
            try {
                Node_Sub38_Sub20.aCanvas10309.removeFocusListener(this);
                Node_Sub38_Sub20.aCanvas10309.getParent().remove(Node_Sub38_Sub20.aCanvas10309);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (Class240.aSignLink2946 != null) {
            try {
                Class240.aSignLink2946.method3635();
            } catch (Exception exception) {
                /* empty */
            }
        }
        method89();
        if (Node_Sub29.aFrame7344 != null) {
            Node_Sub29.aFrame7344.setVisible(false);
            Node_Sub29.aFrame7344.dispose();
            Node_Sub29.aFrame7344 = null;
        }
        //System.out.println("Shutdown complete - clean:" + bool);
    }

    abstract void method85();

    final void method86() {
        anInt22++;
        Node_Sub38_Sub2.method2793("jagmisc");
    }

    public final void windowIconified(WindowEvent windowevent) {
        anInt14++;
    }

    final void method87(int i_1_, String string) {
        anInt20++;
        try {
            CacheNode_Sub16.anApplet9601 = null;
            Class320_Sub14.anInt8347 = 667;
            Class36.anInt542 = Class360.screenWidth = 1024;
            Class131.anInt5447 = 0;
            Class270_Sub1.anInt8033 = 0;
            CacheNode_Sub3.anInt9441 = Class205.screenHeight = 768;
            Class82.aGameStub1123 = this;
            Node_Sub29.aFrame7344 = new Frame();
            Node_Sub29.aFrame7344.setTitle("Divergent Client");
            Node_Sub29.aFrame7344.setResizable(true);
            Node_Sub29.aFrame7344.addWindowListener(this);
            Node_Sub29.aFrame7344.setVisible(true);
            Node_Sub29.aFrame7344.toFront();
            Insets insets = Node_Sub29.aFrame7344.getInsets();
            Node_Sub29.aFrame7344.setSize(Class36.anInt542 + insets.left + insets.right, insets.bottom + insets.top + CacheNode_Sub3.anInt9441);
            Class152.aSignLink1940 = Class240.aSignLink2946 = new SignLink(i_1_, string, true);
            Class241 class241 = Class240.aSignLink2946.method3641(this, 1);
            while (class241.anInt2953 == 0)
                Class262_Sub22.method3208(10L);
        } catch (Exception exception) {
            ClanChat.method507(exception, null, -128);
        }
    }

    static void method88(byte b) {
        anInt8++;
        if (Class73.aCacheNode_Sub4_988 != null) {
            Class73.aCacheNode_Sub4_988 = null;
            if (b >= -86) {
                anInt45 = 116;
            }
            Class310.method3589(CacheNode.anInt7033, Class367.anInt4539, (byte) 109, Class18.anInt309, ReferenceTable.anInt286);
        }
    }

    public final URL getCodeBase() {
        anInt18++;
        if (Node_Sub29.aFrame7344 != null) {
            return null;
        }
        if (Class96.anApplet1270 != null && this != Class96.anApplet1270) {
            return Class96.anApplet1270.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusGained(FocusEvent focusevent) {
        Class114.aBoolean1458 = true;
        anInt28++;
        Class355.aBoolean4366 = true;
    }

    abstract void method89();

    public final void start() {
        anInt27++;
        if (this == Class82.aGameStub1123 && !Class137.aBoolean1715) {
            Class321.aLong4068 = 0L;
        }
    }

    final void method90(String string) {
        anInt21++;
        if (!aBoolean38) {
            aBoolean38 = true;
            try {
                Class2.method167("loggedout", Class96.anApplet1270, (byte) -81);
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                Objects.requireNonNull(getAppletContext()).showDocument(new URL(getCodeBase(), "error_game_" + string + ".ws"), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
    }

    public final void windowDeactivated(WindowEvent windowevent) {
        anInt13++;
    }

    private void method91() {
        anInt43++;
        long l = Class313.method3650();
        long l_5_ = Class253.aLongArray3193[Class376.anInt4662];
        Class253.aLongArray3193[Class376.anInt4662] = l;
        if (l_5_ != 0L && l > l_5_) {
            int i_6_ = (int) (l - l_5_);
            Node_Sub9_Sub4.anInt9732 = (32000 + (i_6_ >> 1)) / i_6_;
        }
        Class376.anInt4662 = 0x1f & 1 + Class376.anInt4662;
        if (Class339_Sub2.anInt8647++ > 50) {
            Class355.aBoolean4366 = true;
            Class339_Sub2.anInt8647 -= 50;
            Node_Sub38_Sub20.aCanvas10309.setSize(Class360.screenWidth, Class205.screenHeight);
            Node_Sub38_Sub20.aCanvas10309.setVisible(true);
            if (Node_Sub29.aFrame7344 != null && DrawableModel.aFrame907 == null) {
                Insets insets = Node_Sub29.aFrame7344.getInsets();
                Node_Sub38_Sub20.aCanvas10309.setLocation(insets.left + Class270_Sub1.anInt8033, Class131.anInt5447 + insets.top);
            } else {
                Node_Sub38_Sub20.aCanvas10309.setLocation(Class270_Sub1.anInt8033, Class131.anInt5447);
            }
        }
        method102();
    }

    public final void windowActivated(WindowEvent windowevent) {
        anInt31++;
    }

    final void method92(int i_8_, int i_9_, String string, int i_11_) {
        anInt32++;
        try {
            if (Class82.aGameStub1123 == null) {
                CacheNode_Sub16.anApplet9601 = Class96.anApplet1270;
                Class36.anInt542 = Class360.screenWidth = i_8_;
                Class320_Sub14.anInt8347 = 667;
                Class270_Sub1.anInt8033 = 0;
                CacheNode_Sub3.anInt9441 = Class205.screenHeight = i_11_;
                Class131.anInt5447 = 0;
                Class82.aGameStub1123 = this;
                Class152.aSignLink1940 = Class240.aSignLink2946 = new SignLink(i_9_, string, Class96.anApplet1270 != null);
                Class241 class241 = Class240.aSignLink2946.method3641(this, 1);
                while (class241.anInt2953 == 0)
                    Class262_Sub22.method3208(10L);
            } else {
                Class230.anInt5210++;
                if (Class230.anInt5210 >= 3) {
                    method90("alreadyloaded");
                } else {
                    Objects.requireNonNull(getAppletContext()).showDocument(getDocumentBase(), "_self");
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            ClanChat.method507(throwable, null, -109);
            method90("crash");
        }
    }

    public final void run() {
        anInt33++;
        do {
            try {
                if (SignLink.aString3989 != null) {
                    String string = SignLink.aString3989.toLowerCase();
                    if (string.contains("sun") || string.contains("apple")) {
                        String string_13_ = SignLink.aString3995;
                        if (string_13_.equals("1.1") || string_13_.startsWith("1.1.") || string_13_.equals("1.2") || string_13_.startsWith("1.2.")) {
                            method90("wrongjava");
                            break;
                        }
                    } else if (string.contains("ibm") && (SignLink.aString3995 == null || SignLink.aString3995.equals("1.4.2"))) {
                        method90("wrongjava");
                        break;
                    }
                }
                if (SignLink.aString3995 != null && SignLink.aString3995.startsWith("1.")) {
                    int i = 2;
                    int i_14_ = 0;
                    while (SignLink.aString3995.length() > i) {
                        int i_15_ = SignLink.aString3995.charAt(i);
                        if (i_15_ < 48 || i_15_ > 57) {
                            break;
                        }
                        i++;
                        i_14_ = i_15_ - (48 - i_14_ * 10);
                    }
                    if (i_14_ >= 5) {
                        Class250.aBoolean3175 = true;
                    }
                }
                Applet applet = Class82.aGameStub1123;
                if (Class96.anApplet1270 != null) {
                    applet = Class96.anApplet1270;
                }
                Method method = SignLink.aMethod4000;
                if (method != null) {
                    try {
                        method.invoke(applet, Boolean.TRUE);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                Animable_Sub3.method918((byte) -121);
                Class79.method788();
                method93(-50);
                method99();
                Animable_Sub3_Sub1.aClass234_11017 = Class300.method3498();
                while (Class321.aLong4068 == 0L || Class313.method3650() < Class321.aLong4068) {
                    Translation.anInt431 = Objects.requireNonNull(Animable_Sub3_Sub1.aClass234_11017).method2147(Class171.aLong2071);
                    for (int i = 0; Translation.anInt431 > i; i++)
                        method98();
                    method91();
                    ObjectDefinition.method3049(Class240.aSignLink2946, Node_Sub38_Sub20.aCanvas10309, (byte) 102);
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                ClanChat.method507(throwable, method100(), -117);
                method90("crash");
            } finally {
                method84();
            }
        } while (false);
    }

    public final AppletContext getAppletContext() {
        anInt40++;
        if (Node_Sub29.aFrame7344 != null) {
            return null;
        }
        if (Class96.anApplet1270 != null && this != Class96.anApplet1270) {
            return Class96.anApplet1270.getAppletContext();
        }
        return super.getAppletContext();
    }

    public final synchronized void paint(Graphics graphics) {
        anInt41++;
        if (Class82.aGameStub1123 == this && !Class137.aBoolean1715) {
            Class355.aBoolean4366 = true;
            if (Class250.aBoolean3175 && Class313.method3650() - Class82.aLong1112 > 1000L) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null || Class36.anInt542 <= rectangle.width && rectangle.height >= CacheNode_Sub3.anInt9441) {
                    Class169_Sub4.aBoolean8829 = true;
                }
            }
        }
    }

    public final void windowClosed(WindowEvent windowevent) {
        anInt10++;
    }

    public final void windowClosing(WindowEvent windowevent) {
        anInt23++;
        destroy();
    }

    public final void stop() {
        anInt7++;
        if (this == Class82.aGameStub1123 && !Class137.aBoolean1715) {
            Class321.aLong4068 = Class313.method3650() + 4000L;
        }
    }

    public abstract void init();

    synchronized void method93(int i) {
        if (Node_Sub38_Sub20.aCanvas10309 != null) {
            Node_Sub38_Sub20.aCanvas10309.removeFocusListener(this);
            Node_Sub38_Sub20.aCanvas10309.getParent().setBackground(Color.black);
            Node_Sub38_Sub20.aCanvas10309.getParent().remove(Node_Sub38_Sub20.aCanvas10309);
        }
        anInt16++;
        Container container;
        if (DrawableModel.aFrame907 != null) {
            container = DrawableModel.aFrame907;
        } else if (Node_Sub29.aFrame7344 != null) {
            container = Node_Sub29.aFrame7344;
        } else if (Class96.anApplet1270 == null) {
            container = Class82.aGameStub1123;
        } else {
            container = Class96.anApplet1270;
        }
        container.setLayout(null);
        Node_Sub38_Sub20.aCanvas10309 = new Canvas(this);
        container.add(Node_Sub38_Sub20.aCanvas10309);
        Node_Sub38_Sub20.aCanvas10309.setSize(Class360.screenWidth, Class205.screenHeight);
        Node_Sub38_Sub20.aCanvas10309.setVisible(true);
        if (container == Node_Sub29.aFrame7344) {
            Insets insets = Node_Sub29.aFrame7344.getInsets();
            Node_Sub38_Sub20.aCanvas10309.setLocation(Class270_Sub1.anInt8033 + insets.left, insets.top + Class131.anInt5447);
        } else {
            Node_Sub38_Sub20.aCanvas10309.setLocation(Class270_Sub1.anInt8033, Class131.anInt5447);
        }
        Node_Sub38_Sub20.aCanvas10309.addFocusListener(this);
        Node_Sub38_Sub20.aCanvas10309.requestFocus();
        Class51.aBoolean5331 = true;
        Class114.aBoolean1458 = true;
        Class355.aBoolean4366 = true;
        Class169_Sub4.aBoolean8829 = false;
        Class82.aLong1112 = Class313.method3650();
    }

    public static void method94() {
        aFloatArray39 = null;
        aFloatArray42 = null;
        anIntArray44 = null;
        aClass94_11 = null;
    }

    final boolean method95() {
        return true;
    }

    final void method96() {
        anInt30++;
        Node_Sub38_Sub2.method2793("jaclib");
    }

    abstract void method97();

    private void method98() {
        anInt6++;
        long l = Class313.method3650();
        Class66_Sub2.aLongArray8997[Class209.anInt2491] = l;
        /* empty */
        Class209.anInt2491 = 0x1f & 1 + Class209.anInt2491;
        synchronized (this) {
            Class51.aBoolean5331 = Class114.aBoolean1458;
        }
        method97();
    }

    public final void focusLost(FocusEvent focusevent) {
        Class114.aBoolean1458 = false;
        anInt19++;
    }

    public final String getParameter(String string) {
        anInt29++;
        if (Node_Sub29.aFrame7344 != null) {
            return null;
        }
        if (Class96.anApplet1270 != null && this != Class96.anApplet1270) {
            return Class96.anApplet1270.getParameter(string);
        }
        return super.getParameter(string);
    }

    abstract void method99();

    public final void windowDeiconified(WindowEvent windowevent) {
        anInt15++;
    }

    public final void destroy() {
        anInt37++;
        if (Class82.aGameStub1123 == this && !Class137.aBoolean1715) {
            Class321.aLong4068 = Class313.method3650();
            Class262_Sub22.method3208(5000L);
            Class152.aSignLink1940 = null;
            method84();
        }
    }

    String method100() {
        anInt17++;
        return null;
    }

    public final void update(Graphics graphics) {
        anInt25++;
        paint(graphics);
    }

    public static void provideLoaderApplet(Applet applet) {
        Class96.anApplet1270 = applet;
        anInt35++;
    }

    static void method101() {
        Class286.aGLSprite3604 = null;
        anInt9++;
        Class339_Sub7.aGLSprite8718 = null;
        aa.aGLSprite102 = null;
        Class296.aGLSprite5437 = null;
        Class290_Sub1.aGLSprite8062 = null;
        Class247.aGLSprite3141 = null;
        Class105.aGLSpriteArray5194 = null;
        Exception_Sub1.aGLSprite98 = null;
        Class40.aGLSprite621 = null;
    }

    abstract void method102();

    public final URL getDocumentBase() {
        anInt48++;
        if (Node_Sub29.aFrame7344 != null) {
            return null;
        }
        if (Class96.anApplet1270 != null && Class96.anApplet1270 != this) {
            return Class96.anApplet1270.getDocumentBase();
        }
        return super.getDocumentBase();
    }

    final boolean method103() {
        anInt24++;
        return Node_Sub38_Sub2.method2793("jagtheora");
    }

    public final void windowOpened(WindowEvent windowevent) {
        anInt34++;
    }

    public GameStub() {
        aBoolean38 = false;
    }

    static {
        aFloatArray39 = new float[16384];
        anIntArray44 = new int[4];
        double d = 3.834951969714103E-4;
        for (int i = 0; i < 16384; i++) {
            aFloatArray42[i] = (float) Math.sin(d * (double) i);
            aFloatArray39[i] = (float) Math.cos((double) i * d);
        }
    }
}
