/* ti - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class ti
{
	private PeerReference a;
	private PeerReference c;
	protected ReferenceQueue<Object> b = new ReferenceQueue<Object>();
	
	private final void a(int i) {
		for (;;) {
			Reference<? extends Object> reference = b.poll();
			if (null == reference) {
				break;
			}
			PeerReference peerreference = (PeerReference) reference;
			a(peerreference, i ^ 0x35dd);
		}
		if (i != 26588) {
			b = null;
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
	
	private final void a(PeerReference peerreference, int i) {
		peerreference.b(0);
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
		if (i != 20993) {
			b = null;
		}
	}
	
	public final void b(int i) {
		a(26588);
		if (i != -23417) {
			a(null, (byte) 32);
		}
		while (null != a)
			a(a, 20993);
		a(26588);
	}
	
	public final void c(int i) {
		a(26588);
		if (i > -85) {
			a(null, (byte) 119);
		}
	}
}
