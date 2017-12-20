/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference<Object>
{
	protected PeerReference b;
	protected PeerReference a;
	private long peer;
	
	final void setPeer(long l) {
		b(0);
		peer = l;
	}
	
	PeerReference(Peer peer, ti var_ti) {
		super(peer, var_ti.b);
		var_ti.a(this, (byte) 92);
	}
	
	final boolean a(int i) {
		if (i != 0) {
			b(111);
		}
        return (peer ^ 0xffffffffffffffffL) != -1L;
    }
	
	final long b(int i) {
		if (i != 0) {
			return 30L;
		}
		long l;
		if (-1L == (peer ^ 0xffffffffffffffffL)) {
			l = 0L;
		} else {
			l = releasePeer(peer);
			peer = 0L;
		}
		return l;
	}
	
	protected abstract long releasePeer(long l);
}
