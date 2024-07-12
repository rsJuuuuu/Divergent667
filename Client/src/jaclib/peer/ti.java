/* ti - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class ti {
    private PeerReference a;
    private PeerReference c;
    protected ReferenceQueue<Object> b = new ReferenceQueue<>();

    private void a() {
        for (; ; ) {
            Reference<?> reference = b.poll();
            if (null == reference) {
                break;
            }
            PeerReference peerreference = (PeerReference) reference;
            a(peerreference);
        }
    }

    final void a(PeerReference peerreference, byte b) {
        peerreference.b = a;
        peerreference.a = null;
        if (c == null) {
            c = peerreference;
        } else {
            a.a = peerreference;
        }
        a = peerreference;
    }

    private void a(PeerReference peerreference) {
        peerreference.b();
        if (c == peerreference) {
            c = peerreference.a;
        }
        if (a == peerreference) {
            a = peerreference.b;
        }
        if (null != peerreference.a) {
            peerreference.a.b = peerreference.b;
        }
        if (null != peerreference.b) {
            peerreference.b.a = peerreference.a;
        }
    }

    public final void b(int i) {
        a();
        if (i != -23417) {
            a(null, (byte) 32);
        }
        while (null != a)
            a(a);
        a();
    }

    public final void c(int i) {
        a();
        if (i > -85) {
            a(null, (byte) 119);
        }
    }
}
