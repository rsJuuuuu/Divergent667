/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

public class Class11 implements IEnumModesCallback {
    private static int anInt177;
    private final DirectDraw aDirectDraw178 = new DirectDraw();
    private static int[] anIntArray179;

    @SuppressWarnings("deprecation")
    final void method191(Frame frame, int i, int i_0_, int i_1_, int i_3_) {
        frame.setVisible(true);
        WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
        int i_4_ = wcomponentpeer.getHwnd();
        User32.SetWindowLong(i_4_, -16, -2147483648);
        User32.SetWindowLong(i_4_, -20, 8);
        aDirectDraw178.setCooperativeLevel((java.awt.Component) frame, 17);
        aDirectDraw178.setDisplayMode(i_3_, i_1_, i, i_0_, 0);
        frame.setBounds(0, 0, i_3_, i_1_);
        frame.toFront();
        frame.requestFocus();
    }

    public Class11() {
        aDirectDraw178.initialize(null);
    }

    final void method192(Frame frame) {
        aDirectDraw178.restoreDisplayMode();
        aDirectDraw178.setCooperativeLevel((java.awt.Component) frame, 8);
    }

    final int[] method193() {
        aDirectDraw178.enumDisplayModes(0, null, null, this);
        anIntArray179 = new int[anInt177];
        anInt177 = 0;
        aDirectDraw178.enumDisplayModes(0, null, null, this);
        int[] is = anIntArray179;
        anIntArray179 = null;
        anInt177 = 0;
        return is;
    }

}
