/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;
import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer
{
	public OggSyncState() {
		init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	protected final native void clear();
	
	private final native void init();
	
	public final native long pageSeek(OggPage oggpage);
	
	public final native int pageOut(OggPage oggpage);
	
	public final native boolean write(byte[] bs, int i);
	
	public final native boolean reset();
}
