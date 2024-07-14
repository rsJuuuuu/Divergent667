/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;
import java.util.Calendar;

public class Class350 implements Interface16 {
    private Font aFont5361;
    static int anInt5362;
    static int anInt5363;
    private int anInt5364;
    static int anInt5365;
    private int anInt5366;
    static int anInt5367;
    static int anInt5368;
    static int anInt5369;
    private boolean aBoolean5370;
    private int anInt5371;
    private boolean aBoolean5372;
    private Color aColor5373;
    private Image anImage5374;
    private Image anImage5375;
    static int anInt5376;
    private Image anImage5377;
    private Image anImage5378;
    private int anInt5379;
    static int anInt5380;
    static int anInt5381;
    private Image anImage5382;
    private Image anImage5383;
    private int anInt5384;
    private int anInt5385;
    private Image anImage5386;
    private int anInt5387;
    private int anInt5388;
    private boolean aBoolean5389;
    private Image anImage5390;
    static Class170 aClass170_5391 = new Class170(1);
    static int anInt5392;
    private int anInt5393;
    static int anInt5394;
    static int anInt5395;
    static int anInt5396;
    private FontMetrics aFontMetrics5397;
    private Image anImage5398;
    static int anInt5399;
    private Image anImage5400;
    static int anInt5401;
    static int anInt5402;
    static int anInt5403;

    public final void method62(int i) {
        if (i == 1939) {
            anInt5367++;
        }
    }

    public final int method60(int i) {
        if (i <= 25) {
            return 10;
        }
        anInt5403++;
        return 0;
    }

    private int method3991(int i) {
        anInt5392++;
        if (aBoolean5372) {
            return (Class205.screenHeight - i) / 2;
        }
        return 0;
    }

    static void method3992(int i, int i_1_, int i_2_) {
        anInt5395++;
        if (i_2_ != 10) {
            method3992(100, 46, 121);
        }
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(i_2_ - 7, 14, i);
        cachenode_sub2.method2288();
        cachenode_sub2.anInt9434 = i_1_;
    }

    static boolean method3993() {
        anInt5401++;
        return Class151.anInt1843 >= 1;
    }

    private int method3994(int i_3_) {
        anInt5365++;
        if (aBoolean5370) {
            return (Class360.screenWidth - i_3_) / 2;
        }
        return 0;
    }

    private void method3995() throws IllegalAccessException, NoSuchFieldException {
        anInt5381++;
        Class<? extends Applet> var_class = Class96.anApplet1270.getClass();
        anImage5374 = (Image) method4001(var_class, "bar");
        anImage5377 = (Image) method4001(var_class, "background");
        anImage5390 = (Image) method4001(var_class, "left");
        anImage5375 = (Image) method4001(var_class, "right");
        anImage5382 = (Image) method4001(var_class, "top");
        anImage5378 = (Image) method4001(var_class, "bottom");
        anImage5383 = (Image) method4001(var_class, "bodyLeft");
        anImage5398 = (Image) method4001(var_class, "bodyRight");
        anImage5386 = (Image) method4001(var_class, "bodyFill");
        aFont5361 = (Font) method4001(var_class, "bf");
        aFontMetrics5397 = (FontMetrics) method4001(var_class, "bfm");
        aColor5373 = (Color) method4001(var_class, "colourtext");
        Object object = method4001(var_class, "lb");
        Class<? extends Object> var_class_4_ = object.getClass();
        aBoolean5370 = method4002(object, var_class_4_, "xMiddle");
        aBoolean5372 = method4002(object, var_class_4_, "yMiddle");
        anInt5387 = method3997(var_class_4_, object, "xOffset");
        anInt5388 = method3997(var_class_4_, object, "yOffset");
        anInt5371 = method3997(var_class_4_, object, "width");
        anInt5393 = method3997(var_class_4_, object, "height");
        anInt5366 = method3997(var_class_4_, object, "boxXOffset");
        anInt5384 = method3997(var_class_4_, object, "boxYOffset");
        anInt5379 = method3997(var_class_4_, object, "boxWidth");
        anInt5364 = method3997(var_class_4_, object, "textYOffset");
        anInt5385 = method3997(var_class_4_, object, "offsetPerTenCycles");
    }

    public final void method59(int i) {
        if (i == 6312) {
            Class71.method745();
            anInt5402++;
        }
    }

    private void method3996() {
        Class163.method1736(Class243.aClass340_3069.method3958(), GLDrawableModel.aColorArray5590[Class178.anInt2118], Canvas.aColorArray73[Class178.anInt2118], Class382.aColorArray5258[Class178.anInt2118], Class243.aClass340_3069.method3957((byte) 39));
        anInt5380++;
    }

    private int method3997(Class var_class, Object object, String string) throws IllegalAccessException, NoSuchFieldException {
        anInt5368++;
        Field field = var_class.getDeclaredField(string);
        return field.getInt(object);
    }

    static int method3998(String string, int i) {
        if (i != -1) {
            aClass170_5391 = null;
        }
        anInt5362++;
        return Class145.method1638(string, 10);
    }

    public final boolean method61(boolean bool, long l) {
        anInt5394++;
        if (bool) {
            method3998(null, 103);
        }
        return true;
    }

    static String method3999(long l, boolean bool, int i, int i_5_) {
        anInt5376++;
        Calendar calendar;
        if (bool) {
            Class187.method1876(l);
            calendar = Class141.aCalendar1754;
        } else {
            Node_Sub43.method2941(l);
            calendar = Class141.aCalendar1756;
        }
        int i_6_ = calendar.get(Calendar.DATE);
        int i_7_ = calendar.get(Calendar.MONTH);
        int i_8_ = calendar.get(i_5_);
        int i_9_ = calendar.get(Calendar.HOUR_OF_DAY);
        int i_10_ = calendar.get(Calendar.MINUTE);
        if (i == 3) {
            return r_Sub1.method2369(bool, l, i);
        }
        return Integer.toString(i_6_ / 10) + i_6_ % 10 + "-" + Class13.aStringArrayArray209[i][i_7_] + "-" + i_8_ + " " + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10;
    }

    public static void method4000() {
        aClass170_5391 = null;
    }

    private Object method4001(Class var_class, String string) throws IllegalAccessException, NoSuchFieldException {
        anInt5399++;
        Field field = var_class.getDeclaredField(string);
        Object object = field.get(Class96.anApplet1270);
        field.set(Class96.anApplet1270, null);
        return object;
    }

    public final int method58(int i) {
        if (i != 27285) {
            method3999(-112L, false, -70, -27);
        }
        anInt5363++;
        return 100;
    }

    public final void method63() {
        if (!aBoolean5389) {
            if (Class96.anApplet1270 == null) {
                aBoolean5389 = true;
            } else if (aFont5361 == null) {
                try {
                    method3995();
                } catch (Exception exception) {
                    aBoolean5389 = true;
                }
            }
        }
        anInt5369++;
        if (aBoolean5389) {
            method3996();
        } else {
            Graphics graphics = Node_Sub38_Sub20.aCanvas10309.getGraphics();
            if (graphics == null) {
                Node_Sub38_Sub20.aCanvas10309.repaint();
            } else {
                try {
                    int i = Class243.aClass340_3069.method3958();
                    String string = Class243.aClass340_3069.method3957((byte) 106);
                    if (Class54.anImage813 == null) {
                        Class54.anImage813 = Node_Sub38_Sub20.aCanvas10309.createImage(Class360.screenWidth, Class205.screenHeight);
                    }
                    Graphics graphics_12_ = Class54.anImage813.getGraphics();
                    graphics_12_.clearRect(0, 0, Class360.screenWidth, Class205.screenHeight);
                    int i_13_ = anImage5383.getWidth(null);
                    int i_14_ = anImage5398.getWidth(null);
                    int i_15_ = anImage5386.getWidth(null);
                    int i_16_ = anImage5383.getHeight(null);
                    int i_17_ = anImage5398.getHeight(null);
                    int i_18_ = anImage5386.getHeight(null);
                    graphics_12_.drawImage(anImage5383, method3994(i_13_) + anInt5366 - anInt5379 / 2, method3991(i_16_) + anInt5384, null);
                    int i_19_ = i_13_ + (-(anInt5379 / 2) + anInt5366);
                    int i_20_ = anInt5379 / 2 + anInt5366;
                    for (int i_21_ = i_19_; i_21_ <= i_20_; i_21_ += i_15_)
                        graphics_12_.drawImage(anImage5386, method3994(i_13_) + anInt5366 + i_21_, method3991(i_18_) + anInt5384, null);
                    graphics_12_.drawImage(anImage5398, method3994(i_14_) + anInt5366 + anInt5379 / 2, method3991(i_17_) + anInt5384, null);
                    int i_22_ = anImage5390.getWidth(null);
                    int i_23_ = anImage5390.getHeight(null);
                    int i_24_ = anImage5375.getWidth(null);
                    int i_25_ = anImage5375.getHeight(null);
                    int i_26_ = anImage5378.getHeight(null);
                    int i_27_ = anImage5382.getWidth(null);
                    int i_28_ = anImage5382.getHeight(null);
                    int i_29_ = anImage5378.getWidth(null);
                    int i_30_ = anImage5374.getWidth(null);
                    int i_31_ = anImage5377.getWidth(null);
                    int i_32_ = method3994(anInt5371) + anInt5387;
                    int i_33_ = method3991(anInt5393) + anInt5388;
                    graphics_12_.drawImage(anImage5390, i_32_, i_33_ + ((-i_23_ + anInt5393) / 2), null);
                    graphics_12_.drawImage(anImage5375, i_32_ + (anInt5371 - i_24_), i_33_ + (anInt5393 - i_25_) / 2, null);
                    if (anImage5400 == null) {
                        anImage5400 = Node_Sub38_Sub20.aCanvas10309.createImage(-i_22_ + anInt5371 - i_24_, anInt5393);
                    }
                    Graphics graphics_34_ = anImage5400.getGraphics();
                    for (int i_35_ = 0; -i_24_ + (anInt5371 - i_22_) > i_35_; i_35_ += i_27_)
                        graphics_34_.drawImage(anImage5382, i_35_, 0, null);
                    for (int i_36_ = 0; i_36_ < -i_24_ + (anInt5371 - i_22_); i_36_ = i_36_ + i_29_)
                        graphics_34_.drawImage(anImage5378, i_36_, anInt5393 - i_26_, null);
                    int i_37_ = i * (-i_24_ + anInt5371 - i_22_) / 100;
                    if (i_37_ > 0) {
                        Image image = Node_Sub38_Sub20.aCanvas10309.createImage(i_37_, -i_26_ - i_28_ + anInt5393);
                        int i_38_ = image.getWidth(null);
                        Graphics graphics_39_ = image.getGraphics();
                        int i_40_ = anInt5385 * Class295.method3471() / 10 % i_30_;
                        for (int i_41_ = i_40_ - i_30_; i_38_ > i_41_; i_41_ += i_30_)
                            graphics_39_.drawImage(anImage5374, i_41_, 0, null);
                        graphics_34_.drawImage(image, 0, i_28_, null);
                    }
                    int i_42_ = i_37_;
                    i_37_ = -i_24_ - i_22_ + (anInt5371 - i_37_);
                    if (i_37_ > 0) {
                        Image image = Node_Sub38_Sub20.aCanvas10309.createImage(i_37_, -i_26_ - i_28_ + anInt5393);
                        int i_43_ = image.getWidth(null);
                        Graphics graphics_44_ = image.getGraphics();
                        for (int i_45_ = 0; i_43_ > i_45_; i_45_ += i_31_)
                            graphics_44_.drawImage(anImage5377, i_45_, 0, null);
                        graphics_34_.drawImage(image, i_42_, i_28_, null);
                    }
                    graphics_12_.drawImage(anImage5400, i_32_ + i_22_, i_33_, null);
                    graphics_12_.setFont(aFont5361);
                    graphics_12_.setColor(aColor5373);
                    graphics_12_.drawString(string, (anInt5371 - aFontMetrics5397.stringWidth(string)) / 2 + i_32_, anInt5364 + (4 + i_33_) + anInt5393 / 2);
                    graphics.drawImage(Class54.anImage813, 0, 0, null);
                } catch (Exception exception) {
                    aBoolean5389 = true;
                }
            }
        }
    }

    private boolean method4002(Object object, Class var_class, String string) throws IllegalAccessException, NoSuchFieldException {
        anInt5396++;
        Field field = var_class.getDeclaredField(string);
        return field.getBoolean(object);
    }
}
