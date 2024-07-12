/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

public class Callback_Sub1 extends Callback {
    private volatile int anInt1;
    private volatile int anInt2;
    private volatile boolean aBoolean3 = true;
    private boolean aBoolean5;

    final void method81(int i, int i_6_) {
        User32.SetCursorPos(i, i_6_);
    }

    @SuppressWarnings("deprecation")
    final void method82(boolean bool, Component component) {
        WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
        int i = wcomponentpeer.getTopHwnd();
        if (i != anInt2 || bool != aBoolean3) {
            if (!aBoolean5) {
                Root.alloc(this);
                aBoolean5 = true;
            }
            if (i != anInt2) {
                if (anInt2 != 0) {
                    aBoolean3 = true;
                    User32.SendMessage(i, 101024, 0, 0);
                    synchronized (this) {
                        User32.SetWindowLong(anInt2, -4, anInt1);
                    }
                }
                synchronized (this) {
                    anInt2 = i;
                    anInt1 = User32.SetWindowLong(anInt2, -4, (Object) this);
                }
            }

            aBoolean3 = bool;
            User32.SendMessage(i, 101024, 0, 0);
        }
    }

    Callback_Sub1() {
        /* empty */
    }
}
