/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference<Object> {
    protected PeerReference b;
    protected PeerReference a;
    private long peer;

    final void setPeer(long l) {
        b();
        peer = l;
    }

    PeerReference(Peer peer, ti var_ti) {
        super(peer, var_ti.b);
        var_ti.a(this, (byte) 92);
    }

    final boolean a() {
        return peer != 0;
    }

    final long b() {
        long l;
        if (peer == 0) {
            l = 0L;
        } else {
            l = releasePeer(peer);
            peer = 0L;
        }
        return l;
    }

    protected abstract long releasePeer(long l);
}
