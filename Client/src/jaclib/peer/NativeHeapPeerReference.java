/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference
{
	protected final native long releasePeer(long l);
	
	NativeHeapPeerReference(os var_os, ti var_ti) {
		super(var_os, var_ti);
	}
}
