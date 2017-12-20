/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer
{
	protected PeerReference reference;
	/*synthetic*/ static Class<?> a;
	
	protected long a() {
		return reference.b(0);
	}
	
	public final boolean a(byte b) {
		if (b > -61) {
			reference = null;
		}
		return reference.a(0);
	}
	
	private static final native void init(Class<? extends Object> var_class);
	
	protected Peer() {
		/* empty */
	}
	
	/*synthetic*/ static Class<?> a(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
		return var_class;
	}
	
	static {
		init(a == null ? a = a("jaclib.peer.PeerReference") : a);
	}
}
