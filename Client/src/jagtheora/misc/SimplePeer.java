/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer
{
	private long peer;
	
	protected abstract void clear();
	
	public final boolean b() {
        return peer == 0L;
    }
	
	private final void setPeer(long l) {
		peer = l;
	}
	
	public final void a() {
		if (!b()) {
			clear();
		}
	}
	
	private static final native void init();
	
	protected final void finalize() throws Throwable {
		if (!b()) {
			a();
		}
		super.finalize();
	}
	
	static {
		init();
	}
}
