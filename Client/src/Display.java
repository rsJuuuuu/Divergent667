/* Display - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Display {
    private DisplayMode aDisplayMode863;
    private GraphicsDevice aGraphicsDevice864;

    private void enter(Frame frame) {
        boolean bool = false;
        try {
            Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            field.setAccessible(true);
            boolean bool_0_ = (Boolean) field.get(aGraphicsDevice864);
            if (bool_0_) {
                bool = true;
                field.set(aGraphicsDevice864, Boolean.FALSE);
            }
        } catch (Throwable throwable) {
            /* empty */
        }
        try {
            aGraphicsDevice864.setFullScreenWindow(frame);
        } finally {
            if (bool) {
                try {
                    Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    field.set(aGraphicsDevice864, Boolean.TRUE);
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
        }
        if (bool) {
            try {
                Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                field.set(aGraphicsDevice864, Boolean.TRUE);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    public final void enter(Frame frame, int i, int i_1_, int i_2_, int i_3_) {
        aDisplayMode863 = aGraphicsDevice864.getDisplayMode();
        if (null == aDisplayMode863) {
            throw new NullPointerException();
        }
        frame.setUndecorated(true);
        frame.enableInputMethods(false);
        enter(frame);
        if (0 == i_3_) {
            int i_4_ = aDisplayMode863.getRefreshRate();
            DisplayMode[] displaymodes = aGraphicsDevice864.getDisplayModes();
            boolean bool = false;
            for (DisplayMode displaymode : displaymodes) {
                if (i == displaymode.getWidth() && displaymode.getHeight() == i_1_ && displaymode.getBitDepth() == i_2_) {
                    int i_6_ = displaymode.getRefreshRate();
                    if (!bool || Math.abs(i_3_ - i_4_) > Math.abs(-i_4_ + i_6_)) {
                        i_3_ = i_6_;
                        bool = true;
                    }
                }
            }
            if (!bool) {
                i_3_ = i_4_;
            }
        }
        aGraphicsDevice864.setDisplayMode(new DisplayMode(i, i_1_, i_2_, i_3_));
    }

    public final int[] listmodes() {
        DisplayMode[] displaymodes = aGraphicsDevice864.getDisplayModes();
        int[] is = new int[displaymodes.length << 2];
        for (int i = 0; displaymodes.length > i; i++) {
            is[i << 2] = displaymodes[i].getWidth();
            is[(i << 2) + 1] = displaymodes[i].getHeight();
            is[(i << 2) + 2] = displaymodes[i].getBitDepth();
            is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
        }
        return is;
    }

    public final void exit() {
        if (null != aDisplayMode863) {
            aGraphicsDevice864.setDisplayMode(aDisplayMode863);
            if (!aGraphicsDevice864.getDisplayMode().equals(aDisplayMode863)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            aDisplayMode863 = null;
        }
        enter(null);
    }

    public Display() throws Exception {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        aGraphicsDevice864 = graphicsenvironment.getDefaultScreenDevice();
        if (!aGraphicsDevice864.isFullScreenSupported()) {
            for (GraphicsDevice graphicsdevice : graphicsenvironment.getScreenDevices()) {
                if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
                    aGraphicsDevice864 = graphicsdevice;
                    return;
                }
            }
            throw new Exception();
        }
    }
}
