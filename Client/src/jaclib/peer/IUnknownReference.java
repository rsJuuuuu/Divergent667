/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference
{
	IUnknownReference(IUnknown iunknown, ti var_ti) {
		super(iunknown, var_ti);
	}
	
	protected final native long releasePeer(long l);
}
